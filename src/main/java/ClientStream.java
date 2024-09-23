import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "e", name = "a", descriptor = "I")
    private int field128 = 2;

    @OriginalMember(owner = "e", name = "f", descriptor = "Z")
    private boolean field133 = false;

    @OriginalMember(owner = "e", name = "k", descriptor = "Z")
    private boolean field138 = false;

    @OriginalMember(owner = "e", name = "l", descriptor = "Z")
    private boolean field139 = false;

    @OriginalMember(owner = "e", name = "g", descriptor = "La;")
    public GameShell field134;

    @OriginalMember(owner = "e", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field132;

    @OriginalMember(owner = "e", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field130;

    @OriginalMember(owner = "e", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field131;

    @OriginalMember(owner = "e", name = "b", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "e", name = "i", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "e", name = "j", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "e", name = "h", descriptor = "[B")
    private byte[] field135;

    @OriginalMember(owner = "e", name = "<init>", descriptor = "(Ljava/net/Socket;ZLa;)V")
    public ClientStream(Socket arg0, boolean arg1, GameShell arg2) throws IOException {
        this.field134 = arg2;
        this.field132 = arg0;
        this.field132.setSoTimeout(30000);
        this.field132.setTcpNoDelay(true);
        this.field130 = this.field132.getInputStream();
        this.field131 = this.field132.getOutputStream();
        if (arg1) {
            this.field128 = -35;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "()V")
    public void method37() {
        this.field133 = true;
        try {
            if (this.field130 != null) {
                this.field130.close();
            }
            if (this.field131 != null) {
                this.field131.close();
            }
            if (this.field132 != null) {
                this.field132.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field138 = false;
        synchronized (this) {
            this.notify();
        }
        this.field135 = null;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "()I")
    public int method38() throws IOException {
        return this.field133 ? 0 : this.field130.read();
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "()I")
    public int method39() throws IOException {
        return this.field133 ? 0 : this.field130.available();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "([BII)V")
    public void method40(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field133) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field130.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "([BIIZ)V")
    public void method41(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        if (arg3 || this.field133) {
            return;
        }
        if (this.field139) {
            this.field139 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field135 == null) {
            this.field135 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field135[this.field137] = arg0[arg1 + var6];
                this.field137 = (this.field137 + 1) % 5000;
                if ((this.field136 + 4900) % 5000 == this.field137) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field138) {
                this.field138 = true;
                this.field134.method12(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "e", name = "run", descriptor = "()V")
    public void run() {
        while (this.field138) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field137 == this.field136) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field138) {
                    return;
                }
                var2 = this.field136;
                if (this.field137 >= this.field136) {
                    var3 = this.field137 - this.field136;
                } else {
                    var3 = 5000 - this.field136;
                }
            }
            if (var3 > 0) {
                try {
                    this.field131.write(this.field135, var2, var3);
                } catch (IOException var7) {
                    this.field139 = true;
                }
                this.field136 = (this.field136 + var3) % 5000;
                try {
                    if (this.field137 == this.field136) {
                        this.field131.flush();
                    }
                } catch (IOException var6) {
                    this.field139 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(B)V")
    public void method42(byte arg0) {
        System.out.println("dummy:" + this.field133);
        System.out.println("tcycl:" + this.field136);
        if (arg0 != 30) {
            this.field129 = 174;
        }
        System.out.println("tnum:" + this.field137);
        System.out.println("writer:" + this.field138);
        System.out.println("ioerror:" + this.field139);
        try {
            System.out.println("available:" + this.method39());
        } catch (IOException var2) {
        }
    }
}
