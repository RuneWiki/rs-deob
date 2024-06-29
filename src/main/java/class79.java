import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class79 implements Runnable {

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Z")
    private boolean field1698 = false;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    private int field1696 = 0;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "Z")
    private boolean field1707 = false;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    private int field1699 = 0;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field1715;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "Lqf;")
    private class150 field1710;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Ljava/io/InputStream;")
    private InputStream field1703;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1706;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Leh;")
    public static class47 field1695 = class195.method1282((byte) -4, "sl_stars");

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Leh;")
    public static class47 field1702 = class195.method1282((byte) -4, "Art");

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Leh;")
    private static class47 field1701 = class195.method1282((byte) -4, " more options");

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Leh;")
    public static class47 field1708 = field1701;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "Leh;")
    public static class47 field1716 = class195.method1282((byte) -4, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Leh;")
    private static class47 field1704 = class195.method1282((byte) -4, "Loaded sprites");

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "Leh;")
    public static class47 field1713 = field1704;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "Leh;")
    public static class47 field1721 = class195.method1282((byte) -4, ":clan:");

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "Loc;")
    private class129 field1720;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Lrg;")
    public static class160 field1714;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Lfd;")
    public static class52 field1693;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "[B")
    private byte[] field1719;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method675(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1708 = null;
        field1713 = null;
        field1701 = null;
        field1702 = null;
        field1695 = null;
        field1714 = null;
        field1704 = null;
        field1693 = null;
        field1716 = null;
        field1721 = null;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static final void method676(int arg0) {
        class51.field996 = new class40();
        field1700++;
        int var1 = -93 / ((arg0 + 43) / 36);
    }

    @OriginalMember(owner = "client!ig", name = "run", descriptor = "()V")
    public final void run() {
        field1709++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1699 == this.field1696) {
                        if (this.field1698) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field1699;
                    if (this.field1696 < this.field1699) {
                        var3 = 5000 - this.field1699;
                    } else {
                        var3 = this.field1696 - this.field1699;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field1706.write(this.field1719, var2, var3);
                    } catch (IOException var9) {
                        this.field1707 = true;
                    }
                    this.field1699 = (this.field1699 + var3) % 5000;
                    try {
                        if (this.field1699 == this.field1696) {
                            this.field1706.flush();
                        }
                    } catch (IOException var8) {
                        this.field1707 = true;
                    }
                }
            }
            try {
                if (this.field1703 != null) {
                    this.field1703.close();
                }
                if (this.field1706 != null) {
                    this.field1706.close();
                }
                if (this.field1715 != null) {
                    this.field1715.close();
                }
            } catch (IOException var7) {
            }
            this.field1719 = null;
        } catch (Exception var12) {
            class167.method1131((byte) -84, var12, null);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZIIILah;I)V")
    public static final void method677(boolean arg0, int arg1, int arg2, int arg3, class9 arg4, int arg5) {
        class3.field36 = arg2;
        class148.field2893 = 10000;
        class189.field3668 = arg5;
        class86.field1848 = arg4;
        class20.field387 = arg1;
        field1705++;
        if (arg3 < 28) {
            field1708 = null;
        }
        class9.field211 = 1;
        class86.field1841 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public final void method678(byte arg0) {
        field1722++;
        if (arg0 >= -72) {
            this.field1699 = 75;
        }
        if (this.field1698) {
            return;
        }
        synchronized (this) {
            this.field1698 = true;
            this.notifyAll();
        }
        if (this.field1720 != null) {
            while (this.field1720.field2543 == 0) {
                class76.method666(1L, 1);
            }
            if (this.field1720.field2543 == 1) {
                try {
                    ((Thread) this.field1720.field2548).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1720 = null;
    }

    @OriginalMember(owner = "client!ig", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method678((byte) -99);
        field1711++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB[BI)V")
    public final void method679(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field1718++;
        if (this.field1698) {
            return;
        }
        if (this.field1707) {
            this.field1707 = false;
            throw new IOException();
        }
        if (this.field1719 == null) {
            this.field1719 = new byte[5000];
        }
        synchronized (this) {
            if (arg1 <= 29) {
                method677(true, -89, 15, -21, null, 95);
            }
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field1719[this.field1696] = arg2[arg3 + var6];
                this.field1696 = (this.field1696 + 1) % 5000;
                if ((this.field1699 + 4900) % 5000 == this.field1696) {
                    throw new IOException();
                }
            }
            if (this.field1720 == null) {
                this.field1720 = this.field1710.method1052(2, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)I")
    public final int method680(int arg0) throws IOException {
        if (arg0 != 0) {
            field1701 = null;
        }
        field1717++;
        return this.field1698 ? 0 : this.field1703.available();
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)I")
    public final int method681(int arg0) throws IOException {
        if (arg0 >= -102) {
            return -94;
        } else {
            field1697++;
            return this.field1698 ? 0 : this.field1703.read();
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[BII)V")
    public final void method682(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 != 17031) {
            return;
        }
        field1712++;
        if (this.field1698) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field1703.read(arg1, arg0, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Ljava/net/Socket;Lqf;)V")
    public class79(Socket arg0, class150 arg1) throws IOException {
        this.field1715 = arg0;
        this.field1710 = arg1;
        this.field1715.setSoTimeout(30000);
        this.field1715.setTcpNoDelay(true);
        this.field1703 = this.field1715.getInputStream();
        this.field1706 = this.field1715.getOutputStream();
    }
}
