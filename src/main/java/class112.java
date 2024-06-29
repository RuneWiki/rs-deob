import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class112 extends class310 {

    @OriginalMember(owner = "client!hm", name = "U", descriptor = "[S")
    private short[] field1830 = new short[257];

    @OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
    private int field1831 = 0;

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1824 = "glow1:";

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!hm", name = "T", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!hm", name = "W", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!hm", name = "Y", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!hm", name = "Z", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!hm", name = "bb", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!hm", name = "db", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!hm", name = "eb", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!hm", name = "S", descriptor = "Lth;")
    public static class57 field1828;

    @OriginalMember(owner = "client!hm", name = "X", descriptor = "[I")
    public static int[] field1833;

    @OriginalMember(owner = "client!hm", name = "ab", descriptor = "[I")
    private int[] field1836;

    @OriginalMember(owner = "client!hm", name = "cb", descriptor = "[I")
    private int[] field1838;

    @OriginalMember(owner = "client!hm", name = "fb", descriptor = "[[I")
    private int[][] field1841;

    @OriginalMember(owner = "client!hm", name = "gb", descriptor = "[[Z")
    public static boolean[][] field1842;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)V", line = 4)
    public static final void method845(int arg0) {
        if (arg0 == 11554) {
            field1835++;
            class326.field5176.method2326(-4);
            class232.field3843.method2326(-4);
        }
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(B)V", line = 20)
    public static void method846(byte arg0) {
        if (arg0 < 50) {
            method845(-45);
        }
        field1824 = null;
        field1842 = (boolean[][]) null;
        field1828 = null;
        field1833 = null;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)V", line = 33)
    public final void method553(byte arg0) {
        if (this.field1841 == null) {
            this.field1841 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field1832++;
        if (this.field1841.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field1831 == 2) {
            this.method849(78);
        }
        class26.method169(-88);
        if (arg0 >= -82) {
            this.field1841 = (int[][]) ((int[][]) null);
        }
        this.method853(0);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBI)I", line = 55)
    public static final int method847(int arg0, byte arg1, int arg2) {
        field1825++;
        int var3 = arg0 >> 31 & arg2 - 1;
        if (arg1 != -36) {
            method851(-128, 82, 36, -28, -114, 64);
        }
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lqm;II)V", line = 69)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg1 != -2470) {
            return;
        }
        field1840++;
        if (arg2 != 0) {
            return;
        }
        this.field1831 = arg0.method1720((byte) -86);
        this.field1841 = new int[arg0.method1720((byte) -37)][2];
        for (int var4 = 0; var4 < this.field1841.length; var4++) {
            this.field1841[var4][0] = arg0.method1765(true);
            this.field1841[var4][1] = arg0.method1765(true);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)[I", line = 99)
    public final int[] method77(int arg0, int arg1) {
        int[] var3 = this.field4950.method930(arg0, arg1 + 13093);
        if (arg1 != -13093) {
            field1842 = (boolean[][]) ((boolean[][]) null);
        }
        if (this.field4950.field2001) {
            int[] var4 = this.method2200(0, arg0, (byte) 74);
            for (int var5 = 0; var5 < class261.field4405; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field1830[var6];
            }
        }
        field1839++;
        return var3;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BZ)I", line = 147)
    public static final int method848(byte arg0, boolean arg1) {
        field1826++;
        long var2 = class47.method371(53);
        if (arg0 != 29) {
            method854((byte) -1, -38);
        }
        for (class204 var4 = arg1 ? (class204) class279.field4583.method1265(113) : (class204) class279.field4583.method1277((byte) -115); var4 != null; var4 = (class204) class279.field4583.method1277((byte) -116)) {
            if ((var4.field3220 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field3220 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field698;
                    class66.field1178[var5] = class273.field4527[var5];
                    var4.method330(15);
                    return var5;
                }
                var4.method330(arg0 - 14);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V", line = 191)
    public class112() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)V", line = 203)
    private final void method849(int arg0) {
        field1829++;
        int[] var2 = this.field1841[0];
        int[] var3 = this.field1841[1];
        if (arg0 >= 10) {
            int[] var4 = this.field1841[this.field1841.length - 2];
            int[] var5 = this.field1841[this.field1841.length - 1];
            this.field1836 = new int[] { -var5[0] - (-var4[0] - var4[0]), var4[1] + var4[1] + -var5[1] };
            this.field1838 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + -var3[1] + var2[1] };
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)[I", line = 223)
    private final int[] method850(byte arg0, int arg1) {
        field1834++;
        if (arg0 != -105) {
            field1833 = (int[]) null;
        }
        if (arg1 >= 0) {
            return arg1 < this.field1841.length ? this.field1841[arg1] : this.field1836;
        } else {
            return this.field1838;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIII)V", line = 243)
    public static final void method851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -6237) {
            method847(-27, (byte) -11, -99);
        }
        int var6 = (arg3 - 32) * arg3 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        class71.field1243[0].method2015(arg2, arg4);
        field1823++;
        int var7 = (arg3 - var6 - 32) * arg0 / (arg5 - arg3);
        class71.field1243[1].method2015(arg2, arg3 + arg4 - 16);
        if (!class42.field607) {
            class246.method1885(arg2, arg4 + 16, 16, arg3 - 32, class261.field4395);
            class246.method1885(arg2, var7 + arg4 + 16, 16, var6, class195.field3105);
            class246.method1901(arg2, var7 + arg4 + 16, var6, class320.field5093);
            class246.method1901(arg2 + 1, 16 - -var7 + arg4, var6, class320.field5093);
            class246.method1891(arg2, arg4 + var7 + 16, 16, class320.field5093);
            class246.method1891(arg2, arg4 + var7 + 17, 16, class320.field5093);
            class246.method1901(arg2 + 15, arg4 + 16 - -var7, var6, class37.field554);
            class246.method1901(arg2 + 14, arg4 - -17 - -var7, var6 - 1, class37.field554);
            class246.method1891(arg2, arg4 + var6 + var7 + 15, 16, class37.field554);
            class246.method1891(arg2 + 1, arg4 - -14 - (-var7 - var6), 15, class37.field554);
            return;
        }
        class244.method1862(arg2, arg4 + 16, 16, arg3 - 32, class261.field4395);
        class244.method1862(arg2, arg4 + var7 + 16, 16, var6, class195.field3105);
        class244.method1857(arg2, arg4 + var7 + 16, var6, class320.field5093);
        class244.method1857(arg2 + 1, var7 + 16 + arg4, var6, class320.field5093);
        class244.method1856(arg2, var7 + arg4 + 16, 16, class320.field5093);
        class244.method1856(arg2, arg4 + var7 + 17, 16, class320.field5093);
        class244.method1857(arg2 + 15, var7 + 16 + arg4, var6, class37.field554);
        class244.method1857(arg2 + 14, arg4 + 17 + var7, var6 - 1, class37.field554);
        class244.method1856(arg2, arg4 + var7 + var6 + 15, 16, class37.field554);
        class244.method1856(arg2 + 1, arg4 + 14 + var7 + var6, 15, class37.field554);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)Lhb;", line = 290)
    public static final class259 method852(int arg0, int arg1, int arg2, int arg3) {
        class259 var4 = new class259();
        var4.field4356 = arg2;
        field1820++;
        var4.field4358 = arg0;
        class226.field3723.method1273(1, (long) arg3, var4);
        class336.method2343(false, arg0);
        class250 var5 = class13.method74(arg1 + 10176, arg3);
        if (var5 != null) {
            class205.method1568(var5, (byte) 124);
        }
        if (class187.field3005 != null) {
            class205.method1568(class187.field3005, (byte) 126);
            class187.field3005 = null;
        }
        int var6 = class104.field1683;
        int var7 = 0;
        if (arg1 != -10240) {
            return (class259) null;
        }
        while (var7 < var6) {
            if (class264.method2009(114, class51.field810[var7])) {
                class54.method428(0, var7);
            }
            var7++;
        }
        if (class104.field1683 == 1) {
            class358.field5687 = false;
            class56.method441(class259.field4361, -91, class178.field2858, class92.field1556, class24.field289);
        } else {
            class56.method441(class259.field4361, -119, class178.field2858, class92.field1556, class24.field289);
            int var8 = class109.field1792.method1338(class209.field3284);
            for (int var9 = 0; var9 < class104.field1683; var9++) {
                int var10 = class109.field1792.method1338(class6.method23(72, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class24.field289 = class104.field1683 * 15 + (class253.field4271 ? 26 : 22);
            class92.field1556 = var8 + 8;
        }
        if (var5 != null) {
            class278.method2057(var5, false, -124);
        }
        class240.method1828(-13043, arg0);
        if (class304.field4870 != -1) {
            class32.method221(class304.field4870, -32471, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)V", line = 366)
    private final void method853(int arg0) {
        field1821++;
        int var2 = this.field1831;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; (this.field1841.length - 1) > var22 && var21 >= this.field1841[var22][0]; var22++) {
                }
                int[] var23 = this.field1841[var22];
                int[] var24 = this.field1841[var22 - 1];
                int var25 = this.method850((byte) -105, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var26 - var25;
                int var28 = var24[1];
                int var30 = this.method850((byte) -105, var22 + 1)[1];
                int var31 = (var21 - var24[0] << 12) / (var23[0] - var24[0]);
                int var32 = var30 + var28 - var26 - var25;
                int var33 = var31 * var31 >> 12;
                int var34 = (var31 * var32 >> 12) * var33 >> 12;
                int var35 = var27 * var31 >> 12;
                int var36 = var25 - var28 - var32;
                int var37 = var33 * var36 >> 12;
                int var38 = var34 + var37 - (-var35 - var28);
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field1830[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var11 = 0; var11 < 257; var11++) {
                int var12 = var11 << 4;
                int var13;
                for (var13 = 1; this.field1841.length - 1 > var13 && this.field1841[var13][0] <= var12; var13++) {
                }
                int[] var14 = this.field1841[var13 - 1];
                int[] var15 = this.field1841[var13];
                int var16 = (var12 - var14[0] << 12) / (var15[0] - var14[0]);
                int var17 = 4096 - class74.field1255[var16 >> 5 & 0xFF] >> 1;
                int var18 = 4096 - var17;
                int var19 = var14[1] * var18 + var15[1] * var17 >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field1830[var11] = (short) var19;
            }
        } else {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; (this.field1841.length - 1) > var5 && var4 >= this.field1841[var5][0]; var5++) {
                }
                int[] var6 = this.field1841[var5];
                int[] var7 = this.field1841[var5 - 1];
                int var8 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var9 = 4096 - var8;
                int var10 = var6[1] * var8 + var7[1] * var9 >> 12;
                if (var10 <= -32768) {
                    var10 = -32767;
                }
                if (var10 >= 32768) {
                    var10 = 32767;
                }
                this.field1830[var3] = (short) var10;
            }
        }
        if (arg0 != 0) {
            this.method849(66);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(BI)I", line = 551)
    public static final int method854(byte arg0, int arg1) {
        field1822++;
        double var2 = (double) ((arg1 & 0xFF4F) >> 8) / 256.0D;
        double var4 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var4;
        double var10 = var4;
        if (var2 > var4) {
            var10 = var2;
        }
        double var12 = 0.0D;
        if (var4 > var2) {
            var8 = var2;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var4 == var10) {
                var12 = (var2 - var6) / (var10 - var8);
            } else if (var2 == var10) {
                var12 = (var6 - var4) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var4 - var2) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var16 * 256.0D);
        int var21 = (int) (var18 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var20 > 243) {
            var22 >>= 0x4;
        } else if (var20 > 217) {
            var22 >>= 0x3;
        } else if (var20 > 192) {
            var22 >>= 0x2;
        } else if (var20 > 179) {
            var22 >>= 0x1;
        }
        int var23 = -50 / ((arg0 + 8) / 56);
        return (var20 >> 1) + (var21 >> 2 << 10) + (var22 >> 5 << 7);
    }
}
