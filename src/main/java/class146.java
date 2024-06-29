import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class146 extends class648 {

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "Lqia;")
    private class547 field1765 = new class547();

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    private int field1771 = 256;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    private int field1773 = 0;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    private int field1775 = 256;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    private int field1750;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field1759 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "Ler;")
    public static class222 field1764 = new class222();

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    private int field1770;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "Z")
    private boolean field1772;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "Z")
    private boolean field1774;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "([III)V", line = 3)
    public final synchronized void method670(int[] arg0, int arg1, int arg2) {
        field1760++;
        if (this.field1772) {
            return;
        }
        if (this.method906(-112) != null) {
            int var4 = arg1 + arg2;
            if (class48.field709) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field1750 == 2) {
                var6 = 1;
            }
            while (arg1 < var4) {
                class264 var7 = this.method906(117);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field3348;
                while (arg1 < var4 && var8[0].length > this.field1770) {
                    if (class48.field709) {
                        arg0[arg1++] = var8[var5][this.field1770] * this.field1771;
                        arg0[arg1++] = var8[var6][this.field1770] * this.field1775;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field1770] * this.field1771 + var8[var6][this.field1770] * this.field1775;
                    }
                    this.field1770++;
                }
                if (this.field1770 >= var8[0].length) {
                    this.method909(89);
                }
            }
        } else if (this.field1774) {
            this.method3426((byte) -27);
            class439.field6165.method3593(false);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 71)
    public final synchronized void method661(int arg0) {
        field1755++;
        if (this.field1772) {
            return;
        }
        while (true) {
            class264 var2 = this.method906(-18);
            if (var2 == null) {
                if (this.field1774) {
                    this.method3426((byte) -52);
                    class439.field6165.method3593(false);
                }
                return;
            }
            if ((var2.field3348[0].length - this.field1770) > arg0) {
                this.field1770 += arg0;
                return;
            }
            arg0 -= var2.field3348[0].length - this.field1770;
            this.method909(75);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Lke;", line = 111)
    private final synchronized class264 method906(int arg0) {
        field1761++;
        int var2 = -127 / ((arg0 - 67) / 33);
        return (class264) this.field1765.method3111(119);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 121)
    public static void method907(int arg0) {
        field1759 = null;
        field1764 = null;
        if (arg0 != -28252) {
            field1759 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "()Lrn;", line = 135)
    public final class648 method662() {
        field1758++;
        return null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZILgaa;)V", line = 143)
    public static final void method908(boolean arg0, int arg1, class460 arg2) {
        field1754++;
        if (arg1 != 256) {
            return;
        }
        int var3 = arg2.field6604 == 0 ? arg2.field6566 : arg2.field6604;
        int var4 = arg2.field6512 == 0 ? arg2.field6514 : arg2.field6512;
        class21.method223(arg2.field6524, var3, var4, class323.field4125[arg2.field6524 >> 16], true, arg0);
        if (arg2.field6567 != null) {
            class21.method223(arg2.field6524, var3, var4, arg2.field6567, true, arg0);
        }
        class157 var5 = (class157) class148.field1802.method3248((long) arg2.field6524, 0);
        if (var5 != null) {
            class66.method504(var3, var4, arg0, arg1 + 16616, var5.field2028);
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V", line = 170)
    private final synchronized void method909(int arg0) {
        field1766++;
        class264 var2 = this.method906(126);
        if (var2 == null) {
            return;
        }
        var2.method3426((byte) -98);
        this.field1770 = 0;
        int var3 = 17 % ((-arg0 - 6) / 61);
        this.field1773--;
        class439.field6165.method3599(var2, 100, var2.method1591(-791402272));
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V", line = 191)
    public final void method910(int arg0, int arg1) {
        this.field1775 = arg0;
        this.field1771 = arg0;
        if (arg1 <= -81) {
            field1753++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILjava/io/File;)[B", line = 205)
    public static final byte[] method911(int arg0, int arg1, File arg2) {
        field1757++;
        try {
            if (arg0 != -1) {
                field1759 = null;
            }
            byte[] var3 = new byte[arg1];
            class211.method1287(true, arg2, var3, arg1);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)D", line = 226)
    public final synchronized double method912(boolean arg0) {
        field1756++;
        if (this.field1773 < 1) {
            return -1.0D;
        }
        if (arg0) {
            this.field1772 = true;
        }
        class264 var2 = (class264) this.field1765.method3111(91);
        return var2 == null ? -1.0D : var2.field3352 - (double) ((float) var2.field3348[0].length / (float) class554.field7780);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BZ)V", line = 246)
    public final synchronized void method913(byte arg0, boolean arg1) {
        if (arg0 < -101) {
            field1769++;
            this.field1772 = arg1;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBD)Lke;", line = 259)
    public final class264 method914(int arg0, byte arg1, double arg2) {
        field1767++;
        long var5 = (long) (this.field1750 << 0 | arg0);
        if (arg1 != 122) {
            this.method670(null, 45, 58);
        }
        class264 var7 = (class264) class439.field6165.method3597(var5, arg1 + 1965);
        if (var7 == null) {
            var7 = new class264(new short[this.field1750][arg0], arg2);
        } else {
            var7.field3352 = arg2;
            class439.field6165.method3595(true, var5);
        }
        return var7;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 285)
    public static final void method915(int arg0, int arg1, int arg2, Class arg3) {
        class73 var4 = class495.field7002[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class456 var5 = var4.field969; var5 != null; var5 = var5.field6389) {
            class451 var6 = var5.field6384;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6321 == arg1 && var6.field6328 == arg2) {
                class293.method1760(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()I", line = 311)
    public final int method671() {
        field1762++;
        return 1;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V", line = 320)
    public final synchronized void method916(int arg0) {
        this.field1774 = true;
        if (arg0 != 1) {
            this.field1773 = 115;
        }
        field1752++;
    }

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)I", line = 332)
    public final synchronized int method917(int arg0) {
        field1768++;
        if (arg0 != 0) {
            this.field1750 = 32;
        }
        return this.field1773;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "()Lrn;", line = 352)
    public final class648 method673() {
        field1763++;
        return null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lke;I)V", line = 365)
    public final synchronized void method918(class264 arg0, int arg1) {
        while (this.field1773 >= 100) {
            this.field1765.method3115(arg1 + 1210318748);
            this.field1773--;
        }
        field1751++;
        if (arg1 == 100) {
            this.field1765.method3110(arg0, 1);
            this.field1773++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(I)V", line = 401)
    public class146(int arg0) {
        this.field1750 = arg0;
    }
}
