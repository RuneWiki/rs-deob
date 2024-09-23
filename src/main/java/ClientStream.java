import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "e", name = "a", descriptor = "I")
    private int field131 = 28523;

    @OriginalMember(owner = "e", name = "b", descriptor = "Z")
    private boolean field132 = true;

    @OriginalMember(owner = "e", name = "f", descriptor = "Z")
    private boolean field136 = false;

    @OriginalMember(owner = "e", name = "k", descriptor = "Z")
    private boolean field141 = false;

    @OriginalMember(owner = "e", name = "l", descriptor = "Z")
    private boolean field142 = false;

    @OriginalMember(owner = "e", name = "g", descriptor = "La;")
    public GameShell field137;

    @OriginalMember(owner = "e", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field135;

    @OriginalMember(owner = "e", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field133;

    @OriginalMember(owner = "e", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field134;

    @OriginalMember(owner = "e", name = "i", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "e", name = "j", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "e", name = "h", descriptor = "[B")
    private byte[] field138;

    @OriginalMember(owner = "e", name = "<init>", descriptor = "(BLjava/net/Socket;La;)V")
    public ClientStream(byte arg0, Socket arg1, GameShell arg2) throws IOException {
        this.field137 = arg2;
        this.field135 = arg1;
        this.field135.setSoTimeout(30000);
        this.field135.setTcpNoDelay(true);
        this.field133 = this.field135.getInputStream();
        if (arg0 != -52) {
            throw new NullPointerException();
        }
        this.field134 = this.field135.getOutputStream();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "()V")
    public void method38() {
        this.field136 = true;
        try {
            if (this.field133 != null) {
                this.field133.close();
            }
            if (this.field134 != null) {
                this.field134.close();
            }
            if (this.field135 != null) {
                this.field135.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field141 = false;
        synchronized (this) {
            this.notify();
        }
        this.field138 = null;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "()I")
    public int method39() throws IOException {
        return this.field136 ? 0 : this.field133.read();
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "()I")
    public int method40() throws IOException {
        return this.field136 ? 0 : this.field133.available();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "([BII)V")
    public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field136) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field133.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(III[B)V")
    public void method42(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 >= 0) {
            this.field132 = !this.field132;
        }
        if (this.field136) {
            return;
        }
        if (this.field142) {
            this.field142 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field138 == null) {
            this.field138 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field138[this.field140] = arg3[arg0 + var6];
                this.field140 = (this.field140 + 1) % 5000;
                if ((this.field139 + 4900) % 5000 == this.field140) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field141) {
                this.field141 = true;
                this.field137.method12(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "e", name = "run", descriptor = "()V")
    public void run() {
        while (this.field141) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field140 == this.field139) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field141) {
                    return;
                }
                var2 = this.field139;
                if (this.field140 >= this.field139) {
                    var3 = this.field140 - this.field139;
                } else {
                    var3 = 5000 - this.field139;
                }
            }
            if (var3 > 0) {
                try {
                    this.field134.write(this.field138, var2, var3);
                } catch (IOException var7) {
                    this.field142 = true;
                }
                this.field139 = (this.field139 + var3) % 5000;
                try {
                    if (this.field140 == this.field139) {
                        this.field134.flush();
                    }
                } catch (IOException var6) {
                    this.field142 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(B)V")
    public void method43(byte arg0) {
        System.out.println("dummy:" + this.field136);
        System.out.println("tcycl:" + this.field139);
        System.out.println("tnum:" + this.field140);
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field131 = 45;
        }
        System.out.println("writer:" + this.field141);
        System.out.println("ioerror:" + this.field142);
        try {
            System.out.println("available:" + this.method40());
        } catch (IOException var3) {
        }
    }
}
