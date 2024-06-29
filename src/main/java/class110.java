import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class110 extends class9 {

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "[J")
    private long[] field2081 = new long[10];

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    private int field2093 = 1;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    private int field2085 = 256;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    private int field2066 = 0;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "J")
    private long field2074 = class113.method769(75);

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "Lmb;")
    public static class132 field2067 = class166.method1092("logo", 124);

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "[I")
    public static int[] field2082 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public static int field2078 = 50;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "[Lmb;")
    public static class132[] field2068 = new class132[field2078];

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "[I")
    public static int[] field2092 = new int[field2078];

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "[I")
    public static int[] field2090 = new int[field2078];

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "[I")
    public static int[] field2072 = new int[field2078];

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "[I")
    public static int[] field2065 = new int[field2078];

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "[I")
    public static int[] field2087 = new int[field2078];

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "[I")
    public static int[] field2075 = new int[field2078];

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "Lmb;")
    private static class132 field2084 = class166.method1092("World", 120);

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "Lmb;")
    public static class132 field2089 = field2084;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "[I")
    public static int[] field2091 = new int[field2078];

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "Lmb;")
    public static class132 field2083 = field2084;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
    private int field2076;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "Loc;")
    public static class155 field2094;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "Lpb;")
    public static class165 field2069;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "[Lvi;")
    public static class233[] field2070;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
    public static final void method695(int arg0, int arg1) {
        class18 var2;
        if (class84.field1473 == null) {
            var2 = new class18(512, 512);
        } else {
            var2 = (class18) class84.field1473;
        }
        field2086++;
        int[] var3 = var2.field263;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        int var6 = 1;
        if (arg1 != 36) {
            field2091 = null;
        }
        while (var6 < 103) {
            int var22 = (103 - var6) * 512 * 4 + 24628;
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class148.field2722[arg0][var23][var6] & 0x18) == 0) {
                    class170.method1115(var3, var22, 512, arg0, var23, var6);
                }
                if (arg0 < 3 && (class148.field2722[arg0 + 1][var23][var6] & 0x8) != 0) {
                    class170.method1115(var3, var22, 512, arg0 + 1, var23, var6);
                }
                var22 += 4;
            }
            var6++;
        }
        var2.method95();
        int var7 = (int) (Math.random() * 20.0D) + 228 << 16;
        int var8 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class148.field2722[arg0][var21][var9] & 0x18) == 0) {
                    class135.method918(var9, var8, var7, arg0, var21, (byte) -105);
                }
                if (arg0 < 3 && (class148.field2722[arg0 + 1][var21][var9] & 0x8) != 0) {
                    class135.method918(var9, var8, var7, arg0 + 1, var21, (byte) -39);
                }
            }
        }
        class159.field2874 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class65.method408(class139.field2615, var10, var11);
                if (var12 != 0L) {
                    class84 var14 = class66.method414(arg1 - 36, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                    int var15 = var14.field1436;
                    if (var15 >= 0) {
                        int var16 = var10;
                        int var17 = var11;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = class182.field3351[class139.field2615].field3853;
                            for (int var19 = 0; var19 < 10; var19++) {
                                int var20 = (int) (Math.random() * 4.0D);
                                if (var20 == 0 && var16 > 0 && var10 - 3 < var16 && (var18[var16 - 1][var17] & 0x12C0108) == 0) {
                                    var16--;
                                }
                                if (var20 == 1 && var16 < 103 && var16 < var10 + 3 && (var18[var16 + 1][var17] & 0x12C0180) == 0) {
                                    var16++;
                                }
                                if (var20 == 2 && var17 > 0 && var17 > var11 - 3 && (var18[var16][var17 - 1] & 0x12C0102) == 0) {
                                    var17--;
                                }
                                if (var20 == 3 && var17 < 103 && var11 + 3 > var17 && (var18[var16][var17 + 1] & 0x12C0120) == 0) {
                                    var17++;
                                }
                            }
                        }
                        class27.field441[class159.field2874] = var14.field1425;
                        class203.field3726[class159.field2874] = var16;
                        class70.field1173[class159.field2874] = var17;
                        class159.field2874++;
                    }
                }
            }
        }
        class84.field1473 = var2;
        class140.field2628.method578(0);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)I")
    public static final int method696(int arg0, int arg1) {
        field2077++;
        double var2 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 & 0xFF) / 256.0D;
        double var6 = 0.0D;
        double var8 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var10 = var8;
        if (var8 < var2) {
            var10 = var2;
        }
        double var12 = var8;
        double var14 = 0.0D;
        if (var2 < var8) {
            var12 = var2;
        }
        if (var4 < var12) {
            var12 = var4;
        }
        if (var10 < var4) {
            var10 = var4;
        }
        if (arg0 != 10) {
            method699(-8, null, 90, 5, false);
        }
        double var16 = (var10 + var12) / 2.0D;
        if (var10 != var12) {
            if (var8 == var10) {
                var6 = (var2 - var4) / (-var12 + var10);
            } else if (var2 == var10) {
                var6 = (var4 - var8) / (var10 - var12) + 2.0D;
            } else if (var4 == var10) {
                var6 = (var8 - var2) / (var10 - var12) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var10 - var12) / (var10 + var12);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var12) / (2.0D - var10 - var12);
            }
        }
        int var18 = (int) (var16 * 256.0D);
        double var19 = var6 / 6.0D;
        int var21 = (int) (var14 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var18 > 243) {
            var21 >>= 0x4;
        } else if (var18 > 217) {
            var21 >>= 0x3;
        } else if (var18 > 192) {
            var21 >>= 0x2;
        } else if (var18 > 179) {
            var21 >>= 0x1;
        }
        int var22 = (int) (var19 * 256.0D);
        return (var22 >> 2 << 10) + (var21 >> 5 << 7) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILdh;)V")
    public static final void method697(int arg0, class42 arg1) {
        field2079++;
        if (arg0 != -27014) {
            field2089 = null;
        }
        if (arg1.field687 == 0) {
            return;
        }
        if (arg1.field700 != -1 && arg1.field700 < 32768) {
            class65 var2 = class11.field145[arg1.field700];
            if (var2 != null) {
                int var3 = arg1.field673 - var2.field673;
                int var4 = arg1.field723 - var2.field723;
                if (var3 != 0 || var4 != 0) {
                    arg1.field739 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field700 >= 32768) {
            int var5 = arg1.field700 - 32768;
            if (class65.field1069 == var5) {
                var5 = 2047;
            }
            class159 var6 = class68.field1120[var5];
            if (var6 != null) {
                int var7 = arg1.field673 - var6.field673;
                int var8 = arg1.field723 - var6.field723;
                if (var7 != 0 || var8 != 0) {
                    arg1.field739 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field684 != 0 || arg1.field721 != 0) && (arg1.field697 == 0 || arg1.field722 > 0)) {
            int var9 = arg1.field679 * 64 + arg1.field673 - (arg1.field684 - class129.field2389 - class129.field2389) * 64 - 64;
            int var10 = arg1.field723 + (arg1.field679 - 1) * 64 - (arg1.field721 - class168.field3082 - class168.field3082) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field739 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field684 = 0;
            arg1.field721 = 0;
        }
        int var11 = arg1.field739 - arg1.field707 & 0x7FF;
        if (var11 == 0) {
            arg1.field682 = 0;
            return;
        }
        arg1.field682++;
        if (var11 <= 1024) {
            arg1.field707 += arg1.field687;
            boolean var12 = true;
            if (arg1.field687 > var11 || 2048 - arg1.field687 < var11) {
                var12 = false;
                arg1.field707 = arg1.field739;
            }
            if (arg1.field737 == arg1.field715 && (arg1.field682 > 25 || var12)) {
                if (arg1.field720 == -1) {
                    arg1.field737 = arg1.field727;
                } else {
                    arg1.field737 = arg1.field720;
                }
            }
        } else {
            arg1.field707 -= arg1.field687;
            boolean var13 = true;
            if (var11 < arg1.field687 || var11 > 2048 - arg1.field687) {
                var13 = false;
                arg1.field707 = arg1.field739;
            }
            if (arg1.field737 == arg1.field715 && (arg1.field682 > 25 || var13)) {
                if (arg1.field712 == -1) {
                    arg1.field737 = arg1.field727;
                } else {
                    arg1.field737 = arg1.field712;
                }
            }
        }
        arg1.field707 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
    public static void method698(byte arg0) {
        field2065 = null;
        field2083 = null;
        field2067 = null;
        field2069 = null;
        field2090 = null;
        field2082 = null;
        field2087 = null;
        field2070 = null;
        field2072 = null;
        field2092 = null;
        field2089 = null;
        int var1 = -34 / ((-arg0 - 13) / 49);
        field2094 = null;
        field2084 = null;
        field2068 = null;
        field2075 = null;
        field2091 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public final void method39(byte arg0) {
        int var2 = 0;
        if (arg0 != -18) {
            return;
        }
        while (var2 < 10) {
            this.field2081[var2] = 0L;
            var2++;
        }
        field2071++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)I")
    public final int method41(int arg0, int arg1, int arg2) {
        field2088++;
        int var4 = this.field2085;
        int var5 = this.field2093;
        this.field2085 = 300;
        this.field2093 = 1;
        this.field2074 = class113.method769(69);
        if (this.field2081[this.field2076] == 0L) {
            this.field2085 = var4;
            this.field2093 = var5;
        } else if (this.field2081[this.field2076] < this.field2074) {
            this.field2085 = (int) ((long) (arg2 * 2560) / (this.field2074 - this.field2081[this.field2076]));
        }
        if (this.field2085 < 25) {
            this.field2085 = 25;
        }
        if (this.field2085 > 256) {
            this.field2085 = 256;
            this.field2093 = (int) ((long) arg2 - (this.field2074 - this.field2081[this.field2076]) / 10L);
        }
        if (this.field2093 > arg2) {
            this.field2093 = arg2;
        }
        this.field2081[this.field2076] = this.field2074;
        this.field2076 = (this.field2076 - arg1) % 10;
        if (this.field2093 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2081[var6] != 0L) {
                    this.field2081[var6] += this.field2093;
                }
            }
        }
        int var7 = 0;
        if (arg0 > this.field2093) {
            this.field2093 = arg0;
        }
        class130.method856(arg1 + 2, (long) this.field2093);
        while (this.field2066 < 256) {
            this.field2066 += this.field2085;
            var7++;
        }
        this.field2066 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class110() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2081[var1] = this.field2074;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILog;IIZ)V")
    public static final void method699(int arg0, class159 arg1, int arg2, int arg3, boolean arg4) {
        field2073++;
        if (class210.field3854 == arg1 || class57.field974 >= 400) {
            return;
        }
        class132 var5;
        if (arg1.field2886 == 0) {
            var5 = class187.method1197(new class132[] { arg1.field2877, class136.method927((byte) 116, arg1.field2894, class210.field3854.field2894), class21.field304, class10.field120, class132.method889(arg1.field2894, (byte) 98), class92.field1628 }, -81);
        } else {
            var5 = class187.method1197(new class132[] { arg1.field2877, class21.field304, class53.field901, class132.method889(arg1.field2886, (byte) 90), class92.field1628 }, -114);
        }
        if (arg4) {
            return;
        }
        if (class106.field1984 == 1) {
            class108.method693(class187.method1197(new class132[] { class170.field3177, class70.field1163, var5 }, -89), class187.field3465, -501, (long) arg3, (short) 16, arg0, arg2);
            class202.field3710++;
        } else if (!class10.field116) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class42.field671[var6] != null) {
                    boolean var7 = false;
                    short var8 = 0;
                    class202.field3713++;
                    if (class71.field1198 == 0 && class42.field671[var6].method882(24493, class93.field1641)) {
                        if (arg1.field2894 > class210.field3854.field2894) {
                            var8 = 2000;
                        }
                        if (class210.field3854.field2890 != 0 && arg1.field2890 != 0) {
                            if (class210.field3854.field2890 == arg1.field2890) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class147.field2720[var6]) {
                        var8 = 2000;
                    }
                    short var9 = class60.field1026[var6];
                    short var10 = (short) (var8 + var9);
                    class108.method693(class187.method1197(new class132[] { class123.field2312, var5 }, -115), class42.field671[var6], -501, (long) arg3, var10, arg0, arg2);
                }
            }
        } else if ((class38.field621 & 0x8) == 8) {
            class32.field490++;
            class108.method693(class187.method1197(new class132[] { class160.field2914, class70.field1163, var5 }, -118), class138.field2589, -501, (long) arg3, (short) 39, arg0, arg2);
        }
        for (int var11 = 0; var11 < class57.field974; var11++) {
            if (class31.field488[var11] == 49) {
                class95.field1679[var11] = class187.method1197(new class132[] { class123.field2312, var5 }, -85);
                return;
            }
        }
    }
}
