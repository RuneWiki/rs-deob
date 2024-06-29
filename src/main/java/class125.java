import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class125 implements Runnable {

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "Z")
    private boolean field1684 = false;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
    private int field1697 = 0;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    private int field1688 = 0;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "Z")
    private boolean field1703 = false;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field1695;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "Ldq;")
    private class500 field1698;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "Ljava/io/InputStream;")
    private InputStream field1702;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1701;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "Lla;")
    public static class319 field1683 = new class319(74, 7);

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "Lof;")
    public static class446 field1704;

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "J")
    public static long field1705;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "Low;")
    private class234 field1693;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "[B")
    private byte[] field1691;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)I")
    public final int method853(boolean arg0) throws IOException {
        if (!arg0) {
            this.run();
        }
        field1685++;
        return this.field1703 ? 0 : this.field1702.available();
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
    public final void method854(int arg0) throws IOException {
        field1699++;
        if (this.field1703) {
            return;
        }
        if (arg0 != -4900) {
            this.field1688 = -56;
        }
        if (this.field1684) {
            this.field1684 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
    public final void method855(byte arg0) {
        field1687++;
        if (this.field1703) {
            return;
        }
        synchronized (this) {
            this.field1703 = true;
            this.notifyAll();
        }
        if (this.field1693 != null) {
            while (this.field1693.field3322 == 0) {
                class388.method2433(1L, 86);
            }
            if (this.field1693.field3322 == 1) {
                try {
                    ((Thread) this.field1693.field3324).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        if (arg0 <= 13) {
            this.run();
        }
        this.field1693 = null;
    }

    @OriginalMember(owner = "client!ov", name = "run", descriptor = "()V")
    public final void run() {
        field1692++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1697 == this.field1688) {
                        if (this.field1703) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field1688;
                    if (this.field1688 > this.field1697) {
                        var3 = 5000 - this.field1688;
                    } else {
                        var3 = this.field1697 - this.field1688;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field1701.write(this.field1691, var2, var3);
                    } catch (IOException var9) {
                        this.field1684 = true;
                    }
                    this.field1688 = (this.field1688 + var3) % 5000;
                    try {
                        if (this.field1697 == this.field1688) {
                            this.field1701.flush();
                        }
                    } catch (IOException var8) {
                        this.field1684 = true;
                    }
                }
            }
            try {
                if (this.field1702 != null) {
                    this.field1702.close();
                }
                if (this.field1701 != null) {
                    this.field1701.close();
                }
                if (this.field1695 != null) {
                    this.field1695.close();
                }
            } catch (IOException var7) {
            }
            this.field1691 = null;
        } catch (Exception var12) {
            class395.method2457(null, var12, 1);
        }
    }

    @OriginalMember(owner = "client!ov", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1694++;
        this.method855((byte) 18);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(III[B)V")
    public final void method856(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1686++;
        if (this.field1703) {
            return;
        }
        if (this.field1684) {
            this.field1684 = false;
            throw new IOException();
        }
        if (this.field1691 == null) {
            this.field1691 = new byte[5000];
        }
        synchronized (this) {
            if (arg1 != 5000) {
                this.field1693 = null;
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1691[this.field1697] = arg3[arg0 + var6];
                this.field1697 = (this.field1697 + 1) % 5000;
                if (((this.field1688 + 4900) % 5000) == this.field1697) {
                    throw new IOException();
                }
            }
            if (this.field1693 == null) {
                this.field1693 = this.field1698.method3001(3, this, arg1 - 5000);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
    public final void method857(int arg0) {
        if (arg0 != 1) {
            this.field1684 = false;
        }
        field1689++;
        if (!this.field1703) {
            this.field1702 = new class264();
            this.field1701 = new class76();
        }
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)I")
    public final int method858(int arg0) throws IOException {
        field1696++;
        if (this.field1703) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field1698 = null;
            }
            return this.field1702.read();
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IZ)V")
    public static final void method859(int arg0, boolean arg1) {
        field1700++;
        if (arg1) {
            if (class337.field5232 != -1) {
                class138.method927((byte) 26, class337.field5232);
            }
            for (class436 var2 = (class436) class312.field4570.method1743(false); var2 != null; var2 = (class436) class312.field4570.method1742(127)) {
                if (!var2.method24(-25618)) {
                    var2 = (class436) class312.field4570.method1743(false);
                    if (var2 == null) {
                        break;
                    }
                }
                class486.method2910(var2, false, true, 0);
            }
            class337.field5232 = -1;
            class312.field4570 = new class272(8);
            class313.method1973((byte) 114);
            class337.field5232 = class340.field5264;
            class404.method2490(32, false);
            class141.method950(0);
            class343.method2219(class337.field5232);
        }
        if (arg0 != -3449) {
            field1705 = -23L;
        }
        class155.field2015 = true;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II[BB)V")
    public final void method860(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field1690++;
        if (this.field1703) {
            return;
        }
        while (arg0 > 0) {
            int var6 = this.field1702.read(arg2, arg1, arg0);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg0 -= var6;
            arg1 += var6;
        }
        int var5 = 14 % ((arg3 - 77) / 34);
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)V")
    public static void method861(byte arg0) {
        if (arg0 != -20) {
            field1704 = null;
        }
        field1683 = null;
        field1704 = null;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Ljava/net/Socket;Ldq;)V")
    public class125(Socket arg0, class500 arg1) throws IOException {
        this.field1695 = arg0;
        this.field1698 = arg1;
        this.field1695.setSoTimeout(30000);
        this.field1695.setTcpNoDelay(true);
        this.field1702 = this.field1695.getInputStream();
        this.field1701 = this.field1695.getOutputStream();
    }

    static {
        new class446("From", "Von:", "De", "De");
        field1704 = new class446("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");
        field1705 = 0L;
    }
}
