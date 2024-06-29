import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TYRTFBBQ")
public class class61 implements Runnable {

    @OriginalMember(owner = "client!TYRTFBBQ", name = "a", descriptor = "Z")
    private boolean field1638 = false;

    @OriginalMember(owner = "client!TYRTFBBQ", name = "b", descriptor = "I")
    private int field1639 = -446;

    @OriginalMember(owner = "client!TYRTFBBQ", name = "f", descriptor = "Z")
    private boolean field1643 = false;

    @OriginalMember(owner = "client!TYRTFBBQ", name = "k", descriptor = "Z")
    private boolean field1648 = false;

    @OriginalMember(owner = "client!TYRTFBBQ", name = "l", descriptor = "Z")
    private boolean field1649 = false;

    @OriginalMember(owner = "client!TYRTFBBQ", name = "g", descriptor = "LNZBGSSTU;")
    public class41 field1644;

    @OriginalMember(owner = "client!TYRTFBBQ", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field1642;

    @OriginalMember(owner = "client!TYRTFBBQ", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1640;

    @OriginalMember(owner = "client!TYRTFBBQ", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1641;

    @OriginalMember(owner = "client!TYRTFBBQ", name = "i", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client!TYRTFBBQ", name = "j", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client!TYRTFBBQ", name = "h", descriptor = "[B")
    private byte[] field1645;

    @OriginalMember(owner = "client!TYRTFBBQ", name = "<init>", descriptor = "(LNZBGSSTU;BLjava/net/Socket;)V")
    public class61(class41 arg0, byte arg1, Socket arg2) throws IOException {
        this.field1644 = arg0;
        this.field1642 = arg2;
        this.field1642.setSoTimeout(30000);
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1642.setTcpNoDelay(true);
        this.field1640 = this.field1642.getInputStream();
        this.field1641 = this.field1642.getOutputStream();
    }

    @OriginalMember(owner = "client!TYRTFBBQ", name = "a", descriptor = "()V")
    public void method574() {
        this.field1643 = true;
        try {
            if (this.field1640 != null) {
                this.field1640.close();
            }
            if (this.field1641 != null) {
                this.field1641.close();
            }
            if (this.field1642 != null) {
                this.field1642.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1648 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1645 = null;
    }

    @OriginalMember(owner = "client!TYRTFBBQ", name = "b", descriptor = "()I")
    public int method575() throws IOException {
        return this.field1643 ? 0 : this.field1640.read();
    }

    @OriginalMember(owner = "client!TYRTFBBQ", name = "c", descriptor = "()I")
    public int method576() throws IOException {
        return this.field1643 ? 0 : this.field1640.available();
    }

    @OriginalMember(owner = "client!TYRTFBBQ", name = "a", descriptor = "([BII)V")
    public void method577(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1643) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1640.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!TYRTFBBQ", name = "a", descriptor = "(III[B)V")
    public void method578(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field1643) {
            return;
        }
        if (this.field1649) {
            this.field1649 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1645 == null) {
            this.field1645 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            while (true) {
                if (var6 >= arg2) {
                    if (!this.field1648) {
                        this.field1648 = true;
                        this.field1644.method169(this, 3);
                    }
                    this.notify();
                    break;
                }
                this.field1645[this.field1647] = arg3[arg1 + var6];
                this.field1647 = (this.field1647 + 1) % 5000;
                if ((this.field1646 + 4900) % 5000 == this.field1647) {
                    throw new IOException("buffer overflow");
                }
                var6++;
            }
        }
        if (arg0 != -484) {
            this.field1638 = !this.field1638;
        }
    }

    @OriginalMember(owner = "client!TYRTFBBQ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1648) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1647 == this.field1646) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1648) {
                    return;
                }
                var2 = this.field1646;
                if (this.field1647 >= this.field1646) {
                    var3 = this.field1647 - this.field1646;
                } else {
                    var3 = 5000 - this.field1646;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1641.write(this.field1645, var2, var3);
                } catch (IOException var7) {
                    this.field1649 = true;
                }
                this.field1646 = (this.field1646 + var3) % 5000;
                try {
                    if (this.field1647 == this.field1646) {
                        this.field1641.flush();
                    }
                } catch (IOException var6) {
                    this.field1649 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!TYRTFBBQ", name = "a", descriptor = "(I)V")
    public void method579(int arg0) {
        System.out.println("dummy:" + this.field1643);
        System.out.println("tcycl:" + this.field1646);
        System.out.println("tnum:" + this.field1647);
        System.out.println("writer:" + this.field1648);
        if (arg0 < 6 || arg0 > 6) {
            this.field1639 = -421;
        }
        System.out.println("ioerror:" + this.field1649);
        try {
            System.out.println("available:" + this.method576());
        } catch (IOException var2) {
        }
    }
}
