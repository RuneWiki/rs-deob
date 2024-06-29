import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VAVAOKUB")
public class class59 implements Runnable {

    @OriginalMember(owner = "client!VAVAOKUB", name = "a", descriptor = "Z")
    private boolean field1514 = true;

    @OriginalMember(owner = "client!VAVAOKUB", name = "b", descriptor = "I")
    private int field1515 = 891;

    @OriginalMember(owner = "client!VAVAOKUB", name = "f", descriptor = "Z")
    private boolean field1519 = false;

    @OriginalMember(owner = "client!VAVAOKUB", name = "k", descriptor = "Z")
    private boolean field1524 = false;

    @OriginalMember(owner = "client!VAVAOKUB", name = "l", descriptor = "Z")
    private boolean field1525 = false;

    @OriginalMember(owner = "client!VAVAOKUB", name = "g", descriptor = "LGRXJFORE;")
    public class15 field1520;

    @OriginalMember(owner = "client!VAVAOKUB", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field1518;

    @OriginalMember(owner = "client!VAVAOKUB", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1516;

    @OriginalMember(owner = "client!VAVAOKUB", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1517;

    @OriginalMember(owner = "client!VAVAOKUB", name = "i", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client!VAVAOKUB", name = "j", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client!VAVAOKUB", name = "h", descriptor = "[B")
    private byte[] field1521;

    @OriginalMember(owner = "client!VAVAOKUB", name = "<init>", descriptor = "(Ljava/net/Socket;ILGRXJFORE;)V")
    public class59(Socket arg0, int arg1, class15 arg2) throws IOException {
        this.field1520 = arg2;
        this.field1518 = arg0;
        this.field1518.setSoTimeout(30000);
        this.field1518.setTcpNoDelay(true);
        if (arg1 < 9 || arg1 > 9) {
            throw new NullPointerException();
        }
        this.field1516 = this.field1518.getInputStream();
        this.field1517 = this.field1518.getOutputStream();
    }

    @OriginalMember(owner = "client!VAVAOKUB", name = "a", descriptor = "()V")
    public void method474() {
        this.field1519 = true;
        try {
            if (this.field1516 != null) {
                this.field1516.close();
            }
            if (this.field1517 != null) {
                this.field1517.close();
            }
            if (this.field1518 != null) {
                this.field1518.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1524 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1521 = null;
    }

    @OriginalMember(owner = "client!VAVAOKUB", name = "b", descriptor = "()I")
    public int method475() throws IOException {
        return this.field1519 ? 0 : this.field1516.read();
    }

    @OriginalMember(owner = "client!VAVAOKUB", name = "c", descriptor = "()I")
    public int method476() throws IOException {
        return this.field1519 ? 0 : this.field1516.available();
    }

    @OriginalMember(owner = "client!VAVAOKUB", name = "a", descriptor = "([BII)V")
    public void method477(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1519) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1516.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!VAVAOKUB", name = "a", descriptor = "([BIII)V")
    public void method478(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field1519) {
            return;
        }
        if (this.field1525) {
            this.field1525 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1521 == null) {
            this.field1521 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1521[this.field1523] = arg0[arg2 + var6];
                this.field1523 = (this.field1523 + 1) % 5000;
                if ((this.field1522 + 4900) % 5000 == this.field1523) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1524) {
                this.field1524 = true;
                this.field1520.method31(this, 3);
            }
            this.notify();
        }
        if (arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!VAVAOKUB", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1524) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1523 == this.field1522) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1524) {
                    return;
                }
                var2 = this.field1522;
                if (this.field1523 >= this.field1522) {
                    var3 = this.field1523 - this.field1522;
                } else {
                    var3 = 5000 - this.field1522;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1517.write(this.field1521, var2, var3);
                } catch (IOException var7) {
                    this.field1525 = true;
                }
                this.field1522 = (this.field1522 + var3) % 5000;
                try {
                    if (this.field1523 == this.field1522) {
                        this.field1517.flush();
                    }
                } catch (IOException var6) {
                    this.field1525 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!VAVAOKUB", name = "a", descriptor = "(Z)V")
    public void method479(boolean arg0) {
        System.out.println("dummy:" + this.field1519);
        System.out.println("tcycl:" + this.field1522);
        System.out.println("tnum:" + this.field1523);
        if (!arg0) {
            this.field1514 = !this.field1514;
        }
        System.out.println("writer:" + this.field1524);
        System.out.println("ioerror:" + this.field1525);
        try {
            System.out.println("available:" + this.method476());
        } catch (IOException var2) {
        }
    }
}
