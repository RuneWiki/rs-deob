import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class68 implements Runnable {

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    private int field1598 = 0;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    private int field1589 = 0;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Z")
    private boolean field1610 = false;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "Z")
    private boolean field1615 = false;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Ljava/net/Socket;")
    private Socket field1608;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Lpc;")
    private class137 field1597;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "Ljava/io/InputStream;")
    private InputStream field1614;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1605;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1585 = 1;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lcd;")
    public static class23 field1599 = class54.method414("Texturen geladen)3", -1);

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1587 = 1;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lcd;")
    public static class23 field1602 = null;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lcd;")
    private static class23 field1593 = class54.method414("K", -1);

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static volatile int field1592 = 0;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1588 = 0;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "Lcd;")
    public static class23 field1607 = field1593;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field1612 = 0;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lcd;")
    public static class23 field1591 = field1593;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "Ldd;")
    private class32 field1613;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "[B")
    private byte[] field1603;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[BBI)V")
    public final void method495(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field1611++;
        if (this.field1615) {
            return;
        }
        if (this.field1610) {
            this.field1610 = false;
            throw new IOException();
        }
        if (this.field1603 == null) {
            this.field1603 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg2 >= 23) {
                while (var6 < arg0) {
                    this.field1603[this.field1598] = arg1[arg3 + var6];
                    this.field1598 = (this.field1598 + 1) % 5000;
                    if ((this.field1589 + 4900) % 5000 == this.field1598) {
                        throw new IOException();
                    }
                    var6++;
                }
                if (this.field1613 == null) {
                    this.field1613 = this.field1597.method870(this, 3, true);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)I")
    public static final int method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg1;
            arg1 = var8;
        }
        if (arg0 <= 11) {
            method502(31, -86);
        }
        field1601++;
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 7 + 1 - arg3 - arg6;
        } else if (var7 == 2) {
            return 1 + 7 - arg1 - arg4;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I")
    public final int method497(int arg0) throws IOException {
        field1586++;
        if (this.field1615) {
            return 0;
        } else if (arg0 == 7142) {
            return this.field1614.read();
        } else {
            return 81;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static void method498(byte arg0) {
        field1607 = null;
        field1591 = null;
        field1599 = null;
        field1593 = null;
        int var1 = -83 % ((60 - arg0) / 60);
        field1602 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZ[B)V")
    public final void method499(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        field1600++;
        if (this.field1615) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field1614.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg1 -= var5;
        }
        if (!arg2) {
            this.field1614 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)I")
    public final int method500(byte arg0) throws IOException {
        field1590++;
        if (this.field1615) {
            return 0;
        } else {
            if (arg0 != -109) {
                method496(-55, -5, 81, -62, -19, -124, 86);
            }
            return this.field1614.available();
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public final void method501(boolean arg0) {
        field1594++;
        if (arg0) {
            this.field1615 = true;
        }
        if (this.field1615) {
            return;
        }
        synchronized (this) {
            this.field1615 = true;
            this.notifyAll();
        }
        if (this.field1613 != null) {
            while (this.field1613.field686 == 0) {
                class53.method409(1L, -25391);
            }
            if (this.field1613.field686 == 1) {
                try {
                    ((Thread) this.field1613.field683).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1613 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)I")
    public static final int method502(int arg0, int arg1) {
        field1609++;
        int var7 = arg0 - 1;
        if (arg1 != -28875) {
            return -57;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!he", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field1598 == this.field1589) {
                            if (this.field1615) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field1589 > this.field1598) {
                            var2 = 5000 - this.field1589;
                        } else {
                            var2 = this.field1598 - this.field1589;
                        }
                        var3 = this.field1589;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field1605.write(this.field1603, var3, var2);
                    } catch (IOException var9) {
                        this.field1610 = true;
                    }
                    this.field1589 = (this.field1589 + var2) % 5000;
                    try {
                        if (this.field1598 == this.field1589) {
                            this.field1605.flush();
                        }
                    } catch (IOException var8) {
                        this.field1610 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1614 != null) {
                        this.field1614.close();
                    }
                    if (this.field1605 != null) {
                        this.field1605.close();
                    }
                    if (this.field1608 != null) {
                        this.field1608.close();
                    }
                } catch (IOException var7) {
                }
                this.field1603 = null;
                break;
            }
        } catch (Exception var12) {
            class186.method1145(null, var12, 46);
        }
        field1604++;
    }

    @OriginalMember(owner = "client!he", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method501(false);
        field1606++;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/net/Socket;Lpc;)V")
    public class68(Socket arg0, class137 arg1) throws IOException {
        this.field1608 = arg0;
        this.field1597 = arg1;
        this.field1608.setSoTimeout(30000);
        this.field1608.setTcpNoDelay(true);
        this.field1614 = this.field1608.getInputStream();
        this.field1605 = this.field1608.getOutputStream();
    }
}
