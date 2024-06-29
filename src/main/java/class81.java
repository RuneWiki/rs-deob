import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class81 extends class34 {

    @OriginalMember(owner = "client!le", name = "Ab", descriptor = "I")
    private int field1848 = 0;

    @OriginalMember(owner = "client!le", name = "Jb", descriptor = "Z")
    public boolean field1857 = false;

    @OriginalMember(owner = "client!le", name = "Wb", descriptor = "I")
    private int field1870 = 0;

    @OriginalMember(owner = "client!le", name = "Nb", descriptor = "I")
    public int field1861;

    @OriginalMember(owner = "client!le", name = "Sb", descriptor = "I")
    private int field1866;

    @OriginalMember(owner = "client!le", name = "ob", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!le", name = "tb", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!le", name = "Ib", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!le", name = "sb", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!le", name = "Fb", descriptor = "Lnf;")
    private class96 field1853;

    @OriginalMember(owner = "client!le", name = "wb", descriptor = "[J")
    public static long[] field1844 = new long[32];

    @OriginalMember(owner = "client!le", name = "Hb", descriptor = "Lqf;")
    public static class117 field1855 = class72.method514(105, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!le", name = "ub", descriptor = "Lqf;")
    private static class117 field1842 = class72.method514(120, "green:");

    @OriginalMember(owner = "client!le", name = "nb", descriptor = "Lqf;")
    public static class117 field1835 = field1842;

    @OriginalMember(owner = "client!le", name = "Lb", descriptor = "Lqf;")
    public static class117 field1859 = class72.method514(98, "mapmarker");

    @OriginalMember(owner = "client!le", name = "Kb", descriptor = "Lqf;")
    public static class117 field1858 = class72.method514(122, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!le", name = "Ob", descriptor = "Lqf;")
    private static class117 field1862 = class72.method514(113, "flash2:");

    @OriginalMember(owner = "client!le", name = "Mb", descriptor = "Lqf;")
    public static class117 field1860 = field1862;

    @OriginalMember(owner = "client!le", name = "Db", descriptor = "I")
    public static int field1851 = 0;

    @OriginalMember(owner = "client!le", name = "Qb", descriptor = "Z")
    public static boolean field1864 = false;

    @OriginalMember(owner = "client!le", name = "Gb", descriptor = "Lqf;")
    public static class117 field1854 = class72.method514(120, "jolt");

    @OriginalMember(owner = "client!le", name = "Tb", descriptor = "I")
    public static int field1867 = 5063219;

    @OriginalMember(owner = "client!le", name = "zb", descriptor = "Lqf;")
    private static class117 field1847 = class72.method514(111, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!le", name = "Ub", descriptor = "Lqf;")
    public static class117 field1868 = field1862;

    @OriginalMember(owner = "client!le", name = "Pb", descriptor = "Lqf;")
    public static class117 field1863 = field1847;

    @OriginalMember(owner = "client!le", name = "Eb", descriptor = "Lqf;")
    public static class117 field1852 = field1842;

    @OriginalMember(owner = "client!le", name = "pb", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!le", name = "qb", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!le", name = "rb", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!le", name = "vb", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!le", name = "xb", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!le", name = "yb", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!le", name = "Bb", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!le", name = "Cb", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!le", name = "Rb", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!le", name = "Vb", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!le", name = "Xb", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V")
    public final void method630(int arg0, int arg1) {
        field1839++;
        if (this.field1857) {
            return;
        }
        this.field1870 += arg1;
        while (this.field1870 > this.field1853.field2334[this.field1848]) {
            this.field1870 -= this.field1853.field2334[this.field1848];
            this.field1848++;
            if (this.field1848 >= this.field1853.field2312.length) {
                this.field1857 = true;
                break;
            }
        }
        if (arg0 < 72) {
            method632(-80, false, 79, (byte) 35, 100, null, 66);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZIBIIIIIIII)Z")
    public static final boolean method631(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class121.field2892[var12][var36] = 0;
                class45.field887[var12][var36] = 99999999;
            }
        }
        class121.field2892[arg10][arg11] = 99;
        class45.field887[arg10][arg11] = 0;
        if (arg3 != -102) {
            field1859 = null;
        }
        int var13 = arg10;
        field1845++;
        int var14 = arg11;
        byte var15 = 0;
        class129.field3063[var15] = arg10;
        int var16 = 0;
        boolean var17 = false;
        int var37 = var15 + 1;
        class80.field1830[var15] = arg11;
        int var18 = class129.field3063.length;
        int[][] var19 = class107.field2550[class140.field3344].field3230;
        while (var37 != var16) {
            var14 = class80.field1830[var16];
            var13 = class129.field3063[var16];
            var16 = (var16 + 1) % var18;
            if (arg0 == var13 && arg9 == var14) {
                var17 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class107.field2550[class140.field3344].method1052(arg0, true, var13, arg9, var14, arg2 - 1, arg7)) {
                    var17 = true;
                    break;
                }
                if (arg2 < 10 && class107.field2550[class140.field3344].method1047(arg9, arg7, (byte) 108, var14, var13, arg0, arg2 - 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg4 != 0 && class107.field2550[class140.field3344].method1049(arg8, arg6, var13, -1, arg4, var14, arg0, arg9)) {
                var17 = true;
                break;
            }
            int var35 = class45.field887[var13][var14] + 1;
            if (var13 > 0 && class121.field2892[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class129.field3063[var37] = var13 - 1;
                class80.field1830[var37] = var14;
                var37 = (var37 + 1) % var18;
                class121.field2892[var13 - 1][var14] = 2;
                class45.field887[var13 - 1][var14] = var35;
            }
            if (var13 < 103 && class121.field2892[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class129.field3063[var37] = var13 + 1;
                class80.field1830[var37] = var14;
                class121.field2892[var13 + 1][var14] = 8;
                var37 = (var37 + 1) % var18;
                class45.field887[var13 + 1][var14] = var35;
            }
            if (var14 > 0 && class121.field2892[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class129.field3063[var37] = var13;
                class80.field1830[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class121.field2892[var13][var14 - 1] = 1;
                class45.field887[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class121.field2892[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class129.field3063[var37] = var13;
                class80.field1830[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class121.field2892[var13][var14 + 1] = 4;
                class45.field887[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class121.field2892[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class129.field3063[var37] = var13 - 1;
                class80.field1830[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class121.field2892[var13 - 1][var14 - 1] = 3;
                class45.field887[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class121.field2892[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class129.field3063[var37] = var13 + 1;
                class80.field1830[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class121.field2892[var13 + 1][var14 - 1] = 9;
                class45.field887[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class121.field2892[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class129.field3063[var37] = var13 - 1;
                class80.field1830[var37] = var14 + 1;
                class121.field2892[var13 - 1][var14 + 1] = 6;
                class45.field887[var13 - 1][var14 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && var14 < 103 && class121.field2892[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class129.field3063[var37] = var13 + 1;
                class80.field1830[var37] = var14 + 1;
                class121.field2892[var13 + 1][var14 + 1] = 12;
                class45.field887[var13 + 1][var14 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
        }
        class120.field2864 = 0;
        if (!var17) {
            if (!arg1) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg0 - var21; var23 <= arg0 + var21; var23++) {
                for (int var24 = arg9 - var21; var24 <= arg9 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class45.field887[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg0) {
                            var25 = arg0 - var23;
                        } else if (var23 > arg6 + arg0 - 1) {
                            var25 = var23 + 1 - arg0 - arg6;
                        }
                        int var26 = 0;
                        if (var24 < arg9) {
                            var26 = arg9 - var24;
                        } else if (var24 > arg4 + arg9 - 1) {
                            var26 = var24 + 1 - arg9 - arg4;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var22 > class45.field887[var23][var24]) {
                            var13 = var23;
                            var22 = class45.field887[var23][var24];
                            var14 = var24;
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg10 == var13 && arg11 == var14) {
                return false;
            }
            class120.field2864 = 1;
        }
        byte var28 = 0;
        class129.field3063[var28] = var13;
        int var38 = var28 + 1;
        class80.field1830[var28] = var14;
        int var29;
        int var30 = var29 = class121.field2892[var13][var14];
        while (arg10 != var13 || arg11 != var14) {
            if (var29 != var30) {
                class129.field3063[var38] = var13;
                var29 = var30;
                class80.field1830[var38++] = var14;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class121.field2892[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class129.field3063[var38];
            int var33 = class80.field1830[var38];
            if (arg5 == 0) {
                class119.field2854++;
                class99.field2373.method961(25, -1198);
                class99.field2373.method571(var31 + var31 + 3, arg3 + -11022);
            }
            if (arg5 == 1) {
                class112.field2616++;
                class99.field2373.method961(191, -1198);
                class99.field2373.method571(var31 + var31 + 3 + 14, -11124);
            }
            if (arg5 == 2) {
                field1846++;
                class99.field2373.method961(186, -1198);
                class99.field2373.method571(var31 + var31 + 3, -11124);
            }
            class99.field2373.method601(var32 + class133.field3153, -128);
            class99.field2373.method571(class130.field3095[82] ? 1 : 0, arg3 ^ 0x2B16);
            class94.field2287 = class129.field3063[0];
            class40.field802 = class80.field1830[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class99.field2373.method583(class129.field3063[var38] - var32, -4);
                class99.field2373.method553(123, class80.field1830[var38] - var33);
            }
            class99.field2373.method556(class19.field312 + var33, true);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!le", name = "j", descriptor = "(I)Lea;")
    public final class30 method7(int arg0) {
        class60 var2 = class126.method994((byte) 51, this.field1866);
        field1849++;
        if (arg0 != -6941) {
            return null;
        }
        class30 var3;
        if (this.field1857) {
            var3 = var2.method423(-1, false);
        } else {
            var3 = var2.method423(this.field1848, false);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZIBILha;I)V")
    public static final void method632(int arg0, boolean arg1, int arg2, byte arg3, int arg4, class50 arg5, int arg6) {
        field1837++;
        long var7 = (long) ((arg6 << 16) + arg0);
        class26 var9 = (class26) class71.field1514.method1221(107, var7);
        if (var9 != null) {
            return;
        }
        class26 var10 = (class26) class48.field966.method1221(arg4 ^ 0x46E5, var7);
        if (var10 != null) {
            return;
        }
        class26 var11 = (class26) class78.field1776.method1221(11, var7);
        if (var11 == null) {
            if (!arg1) {
                class26 var12 = (class26) class35.field726.method1221(73, var7);
                if (var12 != null) {
                    return;
                }
            }
            class26 var13 = new class26();
            if (arg4 == 18058) {
                var13.field508 = arg2;
                var13.field509 = arg3;
                var13.field512 = arg5;
                if (arg1) {
                    class71.field1514.method1219(var13, (byte) -121, var7);
                    class36.field750++;
                } else {
                    class150.field3721.method645(true, var13);
                    class78.field1776.method1219(var13, (byte) 97, var7);
                    class58.field1175++;
                }
            }
        } else if (arg1) {
            var11.method185(arg4 ^ 0xFFFFB901);
            class71.field1514.method1219(var11, (byte) -121, var7);
            class36.field750++;
            class58.field1175--;
        }
    }

    @OriginalMember(owner = "client!le", name = "k", descriptor = "(I)V")
    public static void method633(int arg0) {
        field1862 = null;
        field1847 = null;
        field1835 = null;
        field1855 = null;
        field1858 = null;
        field1844 = null;
        field1842 = null;
        field1859 = null;
        field1863 = null;
        field1854 = null;
        field1860 = null;
        field1852 = null;
        field1868 = null;
        if (arg0 != 0) {
            field1847 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "l", descriptor = "(I)V")
    public static final void method634(int arg0) {
        class94.field2277.method250((byte) -54);
        class58.field1176.method250((byte) -54);
        if (arg0 >= -56) {
            method631(-3, true, -29, (byte) -72, -93, -108, 49, -28, -47, -97, 97, -52);
        }
        field1838++;
        class44.field867.method250((byte) -54);
        class42.field837.method250((byte) -54);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILjb;Ljb;)I")
    public static final int method635(int arg0, class64 arg1, class64 arg2) {
        int var3 = 0;
        if (arg0 < 73) {
            return 21;
        }
        field1843++;
        if (arg1.method452(class126.field2987, -31245, class99.field2410)) {
            var3++;
        }
        if (arg2.method452(class126.field2987, -31245, class41.field818)) {
            var3++;
        }
        if (arg2.method452(class126.field2987, -31245, class41.field807)) {
            var3++;
        }
        if (arg2.method452(class126.field2987, -31245, class20.field327)) {
            var3++;
        }
        if (arg2.method452(class126.field2987, -31245, class76.field1671)) {
            var3++;
        }
        if (arg2.method452(class126.field2987, -31245, class36.field743)) {
            var3++;
        }
        arg2.method452(class126.field2987, -31245, class56.field1150);
        arg2.method452(class126.field2987, -31245, class15.field219);
        arg2.method452(class126.field2987, -31245, class143.field3480);
        arg2.method452(class126.field2987, -31245, class55.field1130);
        arg2.method452(class126.field2987, -31245, class71.field1516);
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIBII)V")
    public static final void method636(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 70) {
            field1860 = null;
        }
        for (int var5 = arg4; var5 <= arg3 + arg4; var5++) {
            for (int var6 = arg0; var6 <= arg0 + arg1; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class16.field258[0][var6][var5] = 127;
                    if (arg0 == var6 && var6 > 0) {
                        class64.field1306[0][var6][var5] = class64.field1306[0][var6 - 1][var5];
                    }
                    if (arg0 + arg1 == var6 && var6 < 103) {
                        class64.field1306[0][var6][var5] = class64.field1306[0][var6 + 1][var5];
                    }
                    if (arg4 == var5 && var5 > 0) {
                        class64.field1306[0][var6][var5] = class64.field1306[0][var6][var5 - 1];
                    }
                    if (arg4 + arg3 == var5 && var5 < 103) {
                        class64.field1306[0][var6][var5] = class64.field1306[0][var6][var5 + 1];
                    }
                }
            }
        }
        field1871++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLqf;)Z")
    public static final boolean method637(boolean arg0, class117 arg1) {
        field1869++;
        if (!arg0) {
            method631(-20, false, -19, (byte) -25, 71, 85, -57, 121, 124, 95, 40, -92);
        }
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class75.field1651; var2++) {
            if (arg1.method939(-1, class67.field1401[var2])) {
                return true;
            }
        }
        return arg1.method939(-1, class141.field3395.field356);
    }

    @OriginalMember(owner = "client!le", name = "m", descriptor = "(I)V")
    public static final void method638(int arg0) {
        field1865++;
        class20.field334 = false;
        class113.field2642 = false;
        if (arg0 < 112) {
            field1847 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIIII)V")
    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1861 = arg4;
        this.field1866 = arg0;
        this.field1836 = arg2;
        this.field1841 = arg1;
        this.field1856 = arg5 + arg6;
        this.field1840 = arg3;
        int var8 = class126.method994((byte) 51, this.field1866).field1226;
        if (var8 == -1) {
            this.field1857 = true;
        } else {
            this.field1857 = false;
            this.field1853 = class130.method1013(var8, -81);
        }
    }
}
