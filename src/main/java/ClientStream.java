import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "e", name = "a", descriptor = "I")
    private int field135 = 491;

    @OriginalMember(owner = "e", name = "b", descriptor = "Z")
    private boolean field136 = false;

    @OriginalMember(owner = "e", name = "f", descriptor = "Z")
    private boolean field140 = false;

    @OriginalMember(owner = "e", name = "k", descriptor = "Z")
    private boolean field145 = false;

    @OriginalMember(owner = "e", name = "l", descriptor = "Z")
    private boolean field146 = false;

    @OriginalMember(owner = "e", name = "g", descriptor = "La;")
    public GameShell field141;

    @OriginalMember(owner = "e", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field139;

    @OriginalMember(owner = "e", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field137;

    @OriginalMember(owner = "e", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field138;

    @OriginalMember(owner = "e", name = "i", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "e", name = "j", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "e", name = "h", descriptor = "[B")
    private byte[] field142;

    @OriginalMember(owner = "e", name = "<init>", descriptor = "(Ljava/net/Socket;La;Z)V")
    public ClientStream(Socket arg0, GameShell arg1, boolean arg2) throws IOException {
        if (arg2) {
            throw new NullPointerException();
        }
        this.field141 = arg1;
        this.field139 = arg0;
        this.field139.setSoTimeout(30000);
        this.field139.setTcpNoDelay(true);
        this.field137 = this.field139.getInputStream();
        this.field138 = this.field139.getOutputStream();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "()V")
    public void method38() {
        this.field140 = true;
        try {
            if (this.field137 != null) {
                this.field137.close();
            }
            if (this.field138 != null) {
                this.field138.close();
            }
            if (this.field139 != null) {
                this.field139.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field145 = false;
        synchronized (this) {
            this.notify();
        }
        this.field142 = null;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "()I")
    public int method39() throws IOException {
        return this.field140 ? 0 : this.field137.read();
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "()I")
    public int method40() throws IOException {
        return this.field140 ? 0 : this.field137.available();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "([BII)V")
    public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field140) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field137.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(B[BII)V")
    public void method42(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != 38) {
            this.field135 = 217;
        }
        if (this.field140) {
            return;
        }
        if (this.field146) {
            this.field146 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field142 == null) {
            this.field142 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field142[this.field144] = arg1[arg2 + var6];
                this.field144 = (this.field144 + 1) % 5000;
                if ((this.field143 + 4900) % 5000 == this.field144) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field145) {
                this.field145 = true;
                this.field141.method12(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "e", name = "run", descriptor = "()V")
    public void run() {
        while (this.field145) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field144 == this.field143) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field145) {
                    return;
                }
                var2 = this.field143;
                if (this.field144 >= this.field143) {
                    var3 = this.field144 - this.field143;
                } else {
                    var3 = 5000 - this.field143;
                }
            }
            if (var3 > 0) {
                try {
                    this.field138.write(this.field142, var2, var3);
                } catch (IOException var7) {
                    this.field146 = true;
                }
                this.field143 = (this.field143 + var3) % 5000;
                try {
                    if (this.field144 == this.field143) {
                        this.field138.flush();
                    }
                } catch (IOException var6) {
                    this.field146 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(Z)V")
    public void method43(boolean arg0) {
        System.out.println("dummy:" + this.field140);
        if (!arg0) {
            this.field136 = !this.field136;
        }
        System.out.println("tcycl:" + this.field143);
        System.out.println("tnum:" + this.field144);
        System.out.println("writer:" + this.field145);
        System.out.println("ioerror:" + this.field146);
        try {
            System.out.println("available:" + this.method40());
        } catch (IOException var2) {
        }
    }
}
