import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!THBLNINF")
public class class59 implements Runnable {

    @OriginalMember(owner = "client!THBLNINF", name = "a", descriptor = "I")
    private int field1581 = -499;

    @OriginalMember(owner = "client!THBLNINF", name = "b", descriptor = "I")
    private int field1582 = -26728;

    @OriginalMember(owner = "client!THBLNINF", name = "c", descriptor = "I")
    private int field1583 = 22761;

    @OriginalMember(owner = "client!THBLNINF", name = "g", descriptor = "Z")
    private boolean field1587 = false;

    @OriginalMember(owner = "client!THBLNINF", name = "l", descriptor = "Z")
    private boolean field1592 = false;

    @OriginalMember(owner = "client!THBLNINF", name = "m", descriptor = "Z")
    private boolean field1593 = false;

    @OriginalMember(owner = "client!THBLNINF", name = "h", descriptor = "LNHAOTYHM;")
    public class38 field1588;

    @OriginalMember(owner = "client!THBLNINF", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field1586;

    @OriginalMember(owner = "client!THBLNINF", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field1584;

    @OriginalMember(owner = "client!THBLNINF", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1585;

    @OriginalMember(owner = "client!THBLNINF", name = "j", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client!THBLNINF", name = "k", descriptor = "I")
    private int field1591;

    @OriginalMember(owner = "client!THBLNINF", name = "i", descriptor = "[B")
    private byte[] field1589;

    @OriginalMember(owner = "client!THBLNINF", name = "<init>", descriptor = "(LNHAOTYHM;ILjava/net/Socket;)V")
    public class59(class38 arg0, int arg1, Socket arg2) throws IOException {
        this.field1588 = arg0;
        this.field1586 = arg2;
        this.field1586.setSoTimeout(30000);
        this.field1586.setTcpNoDelay(true);
        while (arg1 >= 0) {
            this.field1583 = 58;
        }
        this.field1584 = this.field1586.getInputStream();
        this.field1585 = this.field1586.getOutputStream();
    }

    @OriginalMember(owner = "client!THBLNINF", name = "a", descriptor = "()V")
    public void method506() {
        this.field1587 = true;
        try {
            if (this.field1584 != null) {
                this.field1584.close();
            }
            if (this.field1585 != null) {
                this.field1585.close();
            }
            if (this.field1586 != null) {
                this.field1586.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1592 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1589 = null;
    }

    @OriginalMember(owner = "client!THBLNINF", name = "b", descriptor = "()I")
    public int method507() throws IOException {
        return this.field1587 ? 0 : this.field1584.read();
    }

    @OriginalMember(owner = "client!THBLNINF", name = "c", descriptor = "()I")
    public int method508() throws IOException {
        return this.field1587 ? 0 : this.field1584.available();
    }

    @OriginalMember(owner = "client!THBLNINF", name = "a", descriptor = "([BII)V")
    public void method509(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1587) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1584.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!THBLNINF", name = "a", descriptor = "(BII[B)V")
    public void method510(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != 68 || this.field1587) {
            return;
        }
        if (this.field1593) {
            this.field1593 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1589 == null) {
            this.field1589 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1589[this.field1591] = arg3[arg1 + var6];
                this.field1591 = (this.field1591 + 1) % 5000;
                if ((this.field1590 + 4900) % 5000 == this.field1591) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1592) {
                this.field1592 = true;
                this.field1588.method123(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "client!THBLNINF", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1592) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1591 == this.field1590) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1592) {
                    return;
                }
                var2 = this.field1590;
                if (this.field1591 >= this.field1590) {
                    var3 = this.field1591 - this.field1590;
                } else {
                    var3 = 5000 - this.field1590;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1585.write(this.field1589, var2, var3);
                } catch (IOException var7) {
                    this.field1593 = true;
                }
                this.field1590 = (this.field1590 + var3) % 5000;
                try {
                    if (this.field1591 == this.field1590) {
                        this.field1585.flush();
                    }
                } catch (IOException var6) {
                    this.field1593 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!THBLNINF", name = "a", descriptor = "(I)V")
    public void method511(int arg0) {
        System.out.println("dummy:" + this.field1587);
        if (this.field1582 != arg0) {
            return;
        }
        System.out.println("tcycl:" + this.field1590);
        System.out.println("tnum:" + this.field1591);
        System.out.println("writer:" + this.field1592);
        System.out.println("ioerror:" + this.field1593);
        try {
            System.out.println("available:" + this.method508());
        } catch (IOException var2) {
        }
    }
}
