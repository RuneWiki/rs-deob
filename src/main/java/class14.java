import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EUCYOSVT")
public class class14 implements Runnable {

    @OriginalMember(owner = "EUCYOSVT", name = "a", descriptor = "Z")
    private boolean field663 = false;

    @OriginalMember(owner = "EUCYOSVT", name = "b", descriptor = "I")
    private int field664 = 27854;

    @OriginalMember(owner = "EUCYOSVT", name = "g", descriptor = "Z")
    private boolean field669 = false;

    @OriginalMember(owner = "EUCYOSVT", name = "l", descriptor = "Z")
    private boolean field674 = false;

    @OriginalMember(owner = "EUCYOSVT", name = "m", descriptor = "Z")
    private boolean field675 = false;

    @OriginalMember(owner = "EUCYOSVT", name = "h", descriptor = "LUNXTKTRJ;")
    public class61 field670;

    @OriginalMember(owner = "EUCYOSVT", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field668;

    @OriginalMember(owner = "EUCYOSVT", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field666;

    @OriginalMember(owner = "EUCYOSVT", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field667;

    @OriginalMember(owner = "EUCYOSVT", name = "c", descriptor = "I")
    private int field665;

    @OriginalMember(owner = "EUCYOSVT", name = "j", descriptor = "I")
    private int field672;

    @OriginalMember(owner = "EUCYOSVT", name = "k", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "EUCYOSVT", name = "i", descriptor = "[B")
    private byte[] field671;

    @OriginalMember(owner = "EUCYOSVT", name = "<init>", descriptor = "(BLjava/net/Socket;LUNXTKTRJ;)V")
    public class14(byte arg0, Socket arg1, class61 arg2) throws IOException {
        this.field670 = arg2;
        this.field668 = arg1;
        this.field668.setSoTimeout(30000);
        this.field668.setTcpNoDelay(true);
        this.field666 = this.field668.getInputStream();
        this.field667 = this.field668.getOutputStream();
        if (arg0 != -115) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "EUCYOSVT", name = "a", descriptor = "()V")
    public void method192() {
        this.field669 = true;
        try {
            if (this.field666 != null) {
                this.field666.close();
            }
            if (this.field667 != null) {
                this.field667.close();
            }
            if (this.field668 != null) {
                this.field668.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field674 = false;
        synchronized (this) {
            this.notify();
        }
        this.field671 = null;
    }

    @OriginalMember(owner = "EUCYOSVT", name = "b", descriptor = "()I")
    public int method193() throws IOException {
        return this.field669 ? 0 : this.field666.read();
    }

    @OriginalMember(owner = "EUCYOSVT", name = "c", descriptor = "()I")
    public int method194() throws IOException {
        return this.field669 ? 0 : this.field666.available();
    }

    @OriginalMember(owner = "EUCYOSVT", name = "a", descriptor = "([BII)V")
    public void method195(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field669) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field666.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "EUCYOSVT", name = "a", descriptor = "(III[B)V")
    public void method196(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field669) {
            return;
        }
        if (this.field675) {
            this.field675 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field671 == null) {
            this.field671 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            while (true) {
                if (var6 >= arg1) {
                    if (!this.field674) {
                        this.field674 = true;
                        this.field670.method106(this, 3);
                    }
                    this.notify();
                    break;
                }
                this.field671[this.field673] = arg3[arg2 + var6];
                this.field673 = (this.field673 + 1) % 5000;
                if ((this.field672 + 4900) % 5000 == this.field673) {
                    throw new IOException("buffer overflow");
                }
                var6++;
            }
        }
        if (arg0 != 4) {
            this.field663 = !this.field663;
        }
    }

    @OriginalMember(owner = "EUCYOSVT", name = "run", descriptor = "()V")
    public void run() {
        while (this.field674) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field673 == this.field672) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field674) {
                    return;
                }
                var2 = this.field672;
                if (this.field673 >= this.field672) {
                    var3 = this.field673 - this.field672;
                } else {
                    var3 = 5000 - this.field672;
                }
            }
            if (var3 > 0) {
                try {
                    this.field667.write(this.field671, var2, var3);
                } catch (IOException var7) {
                    this.field675 = true;
                }
                this.field672 = (this.field672 + var3) % 5000;
                try {
                    if (this.field673 == this.field672) {
                        this.field667.flush();
                    }
                } catch (IOException var6) {
                    this.field675 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "EUCYOSVT", name = "a", descriptor = "(I)V")
    public void method197(int arg0) {
        System.out.println("dummy:" + this.field669);
        System.out.println("tcycl:" + this.field672);
        System.out.println("tnum:" + this.field673);
        if (arg0 != 0) {
            this.field665 = -13;
        }
        System.out.println("writer:" + this.field674);
        System.out.println("ioerror:" + this.field675);
        try {
            System.out.println("available:" + this.method194());
        } catch (IOException var2) {
        }
    }
}
