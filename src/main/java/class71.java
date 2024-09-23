import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YZICXNNP")
public class class71 implements Runnable {

    @OriginalMember(owner = "YZICXNNP", name = "a", descriptor = "B")
    private byte field1707 = 2;

    @OriginalMember(owner = "YZICXNNP", name = "b", descriptor = "Z")
    private boolean field1708 = true;

    @OriginalMember(owner = "YZICXNNP", name = "f", descriptor = "Z")
    private boolean field1712 = false;

    @OriginalMember(owner = "YZICXNNP", name = "k", descriptor = "Z")
    private boolean field1717 = false;

    @OriginalMember(owner = "YZICXNNP", name = "l", descriptor = "Z")
    private boolean field1718 = false;

    @OriginalMember(owner = "YZICXNNP", name = "g", descriptor = "LFDVCDUHZ;")
    public class19 field1713;

    @OriginalMember(owner = "YZICXNNP", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field1711;

    @OriginalMember(owner = "YZICXNNP", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1709;

    @OriginalMember(owner = "YZICXNNP", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1710;

    @OriginalMember(owner = "YZICXNNP", name = "i", descriptor = "I")
    private int field1715;

    @OriginalMember(owner = "YZICXNNP", name = "j", descriptor = "I")
    private int field1716;

    @OriginalMember(owner = "YZICXNNP", name = "h", descriptor = "[B")
    private byte[] field1714;

    @OriginalMember(owner = "YZICXNNP", name = "<init>", descriptor = "(Ljava/net/Socket;LFDVCDUHZ;Z)V")
    public class71(Socket arg0, class19 arg1, boolean arg2) throws IOException {
        this.field1713 = arg1;
        this.field1711 = arg0;
        if (!arg2) {
            this.field1708 = !this.field1708;
        }
        this.field1711.setSoTimeout(30000);
        this.field1711.setTcpNoDelay(true);
        this.field1709 = this.field1711.getInputStream();
        this.field1710 = this.field1711.getOutputStream();
    }

    @OriginalMember(owner = "YZICXNNP", name = "a", descriptor = "()V")
    public void method583() {
        this.field1712 = true;
        try {
            if (this.field1709 != null) {
                this.field1709.close();
            }
            if (this.field1710 != null) {
                this.field1710.close();
            }
            if (this.field1711 != null) {
                this.field1711.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1717 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1714 = null;
    }

    @OriginalMember(owner = "YZICXNNP", name = "b", descriptor = "()I")
    public int method584() throws IOException {
        return this.field1712 ? 0 : this.field1709.read();
    }

    @OriginalMember(owner = "YZICXNNP", name = "c", descriptor = "()I")
    public int method585() throws IOException {
        return this.field1712 ? 0 : this.field1709.available();
    }

    @OriginalMember(owner = "YZICXNNP", name = "a", descriptor = "([BII)V")
    public void method586(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1712) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1709.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "YZICXNNP", name = "a", descriptor = "(II[BI)V")
    public void method587(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field1712) {
            return;
        }
        if (this.field1718) {
            this.field1718 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1714 == null) {
            this.field1714 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1714[this.field1716] = arg2[arg0 + var6];
                this.field1716 = (this.field1716 + 1) % 5000;
                if ((this.field1715 + 4900) % 5000 == this.field1716) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1717) {
                this.field1717 = true;
                this.field1713.method113(this, 3);
            }
            this.notify();
        }
        if (arg1 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "YZICXNNP", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1717) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1716 == this.field1715) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1717) {
                    return;
                }
                var2 = this.field1715;
                if (this.field1716 >= this.field1715) {
                    var3 = this.field1716 - this.field1715;
                } else {
                    var3 = 5000 - this.field1715;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1710.write(this.field1714, var2, var3);
                } catch (IOException var7) {
                    this.field1718 = true;
                }
                this.field1715 = (this.field1715 + var3) % 5000;
                try {
                    if (this.field1716 == this.field1715) {
                        this.field1710.flush();
                    }
                } catch (IOException var6) {
                    this.field1718 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "YZICXNNP", name = "a", descriptor = "(I)V")
    public void method588(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        System.out.println("dummy:" + this.field1712);
        System.out.println("tcycl:" + this.field1715);
        System.out.println("tnum:" + this.field1716);
        System.out.println("writer:" + this.field1717);
        System.out.println("ioerror:" + this.field1718);
        try {
            System.out.println("available:" + this.method585());
        } catch (IOException var2) {
        }
    }
}
