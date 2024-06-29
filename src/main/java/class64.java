import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XFJQTFBV")
public class class64 implements Runnable {

    @OriginalMember(owner = "client!XFJQTFBV", name = "a", descriptor = "I")
    private int field1632 = 969;

    @OriginalMember(owner = "client!XFJQTFBV", name = "b", descriptor = "I")
    private int field1633 = 40071;

    @OriginalMember(owner = "client!XFJQTFBV", name = "f", descriptor = "Z")
    private boolean field1637 = false;

    @OriginalMember(owner = "client!XFJQTFBV", name = "k", descriptor = "Z")
    private boolean field1642 = false;

    @OriginalMember(owner = "client!XFJQTFBV", name = "l", descriptor = "Z")
    private boolean field1643 = false;

    @OriginalMember(owner = "client!XFJQTFBV", name = "g", descriptor = "LBFZNZUKL;")
    public class2 field1638;

    @OriginalMember(owner = "client!XFJQTFBV", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field1636;

    @OriginalMember(owner = "client!XFJQTFBV", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1634;

    @OriginalMember(owner = "client!XFJQTFBV", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1635;

    @OriginalMember(owner = "client!XFJQTFBV", name = "i", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "client!XFJQTFBV", name = "j", descriptor = "I")
    private int field1641;

    @OriginalMember(owner = "client!XFJQTFBV", name = "h", descriptor = "[B")
    private byte[] field1639;

    @OriginalMember(owner = "client!XFJQTFBV", name = "<init>", descriptor = "(Ljava/net/Socket;LBFZNZUKL;Z)V")
    public class64(Socket arg0, class2 arg1, boolean arg2) throws IOException {
        this.field1638 = arg1;
        this.field1636 = arg0;
        this.field1636.setSoTimeout(30000);
        this.field1636.setTcpNoDelay(true);
        this.field1634 = this.field1636.getInputStream();
        this.field1635 = this.field1636.getOutputStream();
        if (!arg2) {
            this.field1633 = 126;
        }
    }

    @OriginalMember(owner = "client!XFJQTFBV", name = "a", descriptor = "()V")
    public void method556() {
        this.field1637 = true;
        try {
            if (this.field1634 != null) {
                this.field1634.close();
            }
            if (this.field1635 != null) {
                this.field1635.close();
            }
            if (this.field1636 != null) {
                this.field1636.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1642 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1639 = null;
    }

    @OriginalMember(owner = "client!XFJQTFBV", name = "b", descriptor = "()I")
    public int method557() throws IOException {
        return this.field1637 ? 0 : this.field1634.read();
    }

    @OriginalMember(owner = "client!XFJQTFBV", name = "c", descriptor = "()I")
    public int method558() throws IOException {
        return this.field1637 ? 0 : this.field1634.available();
    }

    @OriginalMember(owner = "client!XFJQTFBV", name = "a", descriptor = "([BII)V")
    public void method559(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1637) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1634.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!XFJQTFBV", name = "a", descriptor = "(IZ[BI)V")
    public void method560(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        if (!arg1 || this.field1637) {
            return;
        }
        if (this.field1643) {
            this.field1643 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1639 == null) {
            this.field1639 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1639[this.field1641] = arg2[arg0 + var6];
                this.field1641 = (this.field1641 + 1) % 5000;
                if ((this.field1640 + 4900) % 5000 == this.field1641) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1642) {
                this.field1642 = true;
                this.field1638.method12(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "client!XFJQTFBV", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1642) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1641 == this.field1640) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1642) {
                    return;
                }
                var2 = this.field1640;
                if (this.field1641 >= this.field1640) {
                    var3 = this.field1641 - this.field1640;
                } else {
                    var3 = 5000 - this.field1640;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1635.write(this.field1639, var2, var3);
                } catch (IOException var7) {
                    this.field1643 = true;
                }
                this.field1640 = (this.field1640 + var3) % 5000;
                try {
                    if (this.field1641 == this.field1640) {
                        this.field1635.flush();
                    }
                } catch (IOException var6) {
                    this.field1643 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!XFJQTFBV", name = "a", descriptor = "(I)V")
    public void method561(int arg0) {
        System.out.println("dummy:" + this.field1637);
        System.out.println("tcycl:" + this.field1640);
        System.out.println("tnum:" + this.field1641);
        int var2 = 1 / arg0;
        System.out.println("writer:" + this.field1642);
        System.out.println("ioerror:" + this.field1643);
        try {
            System.out.println("available:" + this.method558());
        } catch (IOException var3) {
        }
    }
}
