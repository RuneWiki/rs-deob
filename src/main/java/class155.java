import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class155 extends class12 {

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    private int field2782 = 585;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "Ltg;")
    public static class184 field2785 = class135.method812("Wir vermuten)1 dass Ihr Konto gestohlen wurde", 3);

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "Ljava/util/Random;")
    public static Random field2781 = new Random();

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "Ltg;")
    public static class184 field2787 = class135.method812("Ihr Charakter)2Profil wird in:", 3);

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "Ltg;")
    public static class184 field2786 = class135.method812("da dieser Computer gegen unsere ", 3);

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "J")
    public static long field2775;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field2778;
        int[] var3 = super.field224.method7((byte) 108, arg0);
        if (arg1 != 17) {
            this.field2782 = -43;
        }
        if (super.field224.field53) {
            int var4 = class37.field698[arg0];
            for (int var5 = 0; class201.field3889 > var5; ++var5) {
                int var6 = class131.field2381[var5];
                if (this.field2782 < var6 && var6 < 4096 - this.field2782 && -this.field2782 + 2048 < var4 && ~(2048 - -this.field2782) < ~var4) {
                    int var7 = 2048 - var6;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2782 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(2048 - this.field2782) && ~(this.field2782 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field2782;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field2782);
                } else if (~this.field2782 >= ~var4 && ~(-this.field2782 + 4096) <= ~var4) {
                    if (~var6 <= ~this.field2782 && ~var6 >= ~(-this.field2782 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2782 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field2782;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2782 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class155() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        ++field2779;
        if (arg2) {
            field2786 = null;
        }
        if (arg1 == 0) {
            this.field2782 = arg0.method611(false);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)I")
    public static final int method938(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -654375572) {
            field2781 = null;
        }
        ++field2780;
        return (-arg1 + 4096) * arg0 + arg1 * arg3 >> 12;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IB)V")
    private static final void method939(int arg0, byte arg1) {
        ++field2784;
        int[] var2 = class129.field2330.field2493;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; ++var4) {
            var2[var4] = 1;
        }
        if (arg1 >= 24) {
            for (int var5 = 1; var5 < 103; ++var5) {
                int var20 = (-var5 + 103) * 512 * 4 + 24628;
                for (int var21 = 1; var21 < 103; ++var21) {
                    if ((class46.field878[arg0][var21][var5] & 24) == 0) {
                        class186.method1178(var2, var20, 512, arg0, var21, var5);
                    }
                    if (arg0 < 3 && (8 & class46.field878[arg0 + 1][var21][var5]) != 0) {
                        class186.method1178(var2, var20, 512, arg0 + 1, var21, var5);
                    }
                    var20 += 4;
                }
            }
            int var6 = 228 + (int) (Math.random() * 20.0D) + (-10 + (int) (20.0D * Math.random()) + 238 << 8) + (228 - -((int) (20.0D * Math.random())) << 16);
            int var7 = 238 + ((int) (Math.random() * 20.0D) - 10) << 16;
            class129.field2330.method832();
            for (int var8 = 1; var8 < 103; ++var8) {
                for (int var19 = 1; var19 < 103; ++var19) {
                    if ((24 & class46.field878[arg0][var19][var8]) == 0) {
                        class135.method815(arg0, var7, 0, var8, var19, var6);
                    }
                    if (arg0 < 3 && (8 & class46.field878[arg0 + 1][var19][var8]) != 0) {
                        class135.method815(arg0 - -1, var7, 0, var8, var19, var6);
                    }
                }
            }
            class174.field3311 = 0;
            for (int var9 = 0; ~var9 > -105; ++var9) {
                for (int var10 = 0; ~var10 > -105; ++var10) {
                    long var11 = class52.method286(class47.field892, var9, var10);
                    if (~var11 != -1L) {
                        int var13 = class14.method88(-110, Integer.MAX_VALUE & (int) (var11 >>> 32)).field1076;
                        if (~var13 <= -1) {
                            int var14 = var10;
                            int var15 = var9;
                            if (var13 != 22 && var13 != 29 && var13 != 34 && ~var13 != -37 && ~var13 != -47 && ~var13 != -48 && var13 != 48) {
                                int[][] var16 = class159.field2883[class47.field892].field1234;
                                for (int var17 = 0; ~var17 > -11; ++var17) {
                                    int var18 = (int) (Math.random() * 4.0D);
                                    if (var18 == 0 && ~var15 < -1 && var15 > var9 + -3 && ~(var16[var15 - 1][var14] & 19661064) == -1) {
                                        --var15;
                                    }
                                    if (var18 == 1 && ~var15 > -104 && var9 - -3 > var15 && ~(var16[var15 + 1][var14] & 19661184) == -1) {
                                        ++var15;
                                    }
                                    if (var18 == 2 && var14 > 0 && ~(var10 + -3) > ~var14 && (19661058 & var16[var15][var14 + -1]) == 0) {
                                        --var14;
                                    }
                                    if (var18 == 3 && var14 < 103 && var14 < var10 + 3 && (19661088 & var16[var15][var14 + 1]) == 0) {
                                        ++var14;
                                    }
                                }
                            }
                            class69.field1327[class174.field3311] = class149.field2676[var13];
                            class197.field3854[class174.field3311] = var15;
                            class12.field220[class174.field3311] = var14;
                            ++class174.field3311;
                        }
                    }
                }
            }
            class168.field3139.method787(0);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILad;)V")
    public static final void method940(int arg0, int arg1, class5 arg2) {
        ++field2783;
        Object[] var3 = arg2.field96;
        int var4 = 123 / ((1 - arg0) / 34);
        int var5 = (Integer) var3[0];
        class73 var6 = class51.method284(38, var5);
        if (var6 != null) {
            int var7 = 0;
            class31.field537 = 0;
            int var8 = 0;
            int var9 = -1;
            int[] var10 = var6.field1360;
            int[] var11 = var6.field1365;
            byte var12 = -1;
            try {
                class195.field3792 = new int[var6.field1373];
                int var13 = 0;
                class131.field2388 = new class184[var6.field1361];
                int var14 = 0;
                for (int var15 = 1; var3.length > var15; ++var15) {
                    if (!(var3[var15] instanceof Integer)) {
                        if (var3[var15] instanceof class184) {
                            class184 var16 = (class184) var3[var15];
                            if (var16.method1139(class84.field1546, (byte) 96)) {
                                var16 = arg2.field77;
                            }
                            class131.field2388[var14++] = var16;
                        }
                    } else {
                        int var17 = (Integer) var3[var15];
                        if (~var17 == 2147483646) {
                            var17 = arg2.field99;
                        }
                        if (~var17 == 2147483645) {
                            var17 = arg2.field79;
                        }
                        if (~var17 == 2147483644) {
                            var17 = arg2.field101 != null ? arg2.field101.field3069 : -1;
                        }
                        if (var17 == -2147483644) {
                            var17 = arg2.field93;
                        }
                        if (~var17 == 2147483642) {
                            var17 = arg2.field101 == null ? -1 : arg2.field101.field2989;
                        }
                        if (~var17 == 2147483641) {
                            var17 = arg2.field102 != null ? arg2.field102.field3069 : -1;
                        }
                        if (~var17 == 2147483640) {
                            var17 = arg2.field102 != null ? arg2.field102.field2989 : -1;
                        }
                        if (~var17 == 2147483639) {
                            var17 = arg2.field106;
                        }
                        if (var17 == -2147483639) {
                            var17 = arg2.field92;
                        }
                        class195.field3792[var13++] = var17;
                    }
                }
                int var18 = 0;
                label2241: while (true) {
                    ++var18;
                    if (~var18 < ~arg1) {
                        throw new RuntimeException("slow");
                    }
                    ++var9;
                    int var317 = var10[var9];
                    if (var317 < 100) {
                        if (~var317 == -1) {
                            class59.field1098[var7++] = var11[var9];
                            continue;
                        }
                        if (~var317 == -2) {
                            int var19 = var11[var9];
                            class59.field1098[var7++] = class94.field1710[var19];
                            continue;
                        }
                        if (var317 == 2) {
                            int var20 = var11[var9];
                            --var7;
                            class94.field1710[var20] = class59.field1098[var7];
                            continue;
                        }
                        if (~var317 == -4) {
                            class191.field3710[var8++] = var6.field1364[var9];
                            continue;
                        }
                        if (var317 == 6) {
                            var9 += var11[var9];
                            continue;
                        }
                        if (var317 == 7) {
                            var7 -= 2;
                            if (~class59.field1098[var7 + 1] != ~class59.field1098[var7]) {
                                var9 += var11[var9];
                            }
                            continue;
                        }
                        if (var317 == 8) {
                            var7 -= 2;
                            if (~class59.field1098[var7 + 1] == ~class59.field1098[var7]) {
                                var9 += var11[var9];
                            }
                            continue;
                        }
                        if (var317 == 9) {
                            var7 -= 2;
                            if (class59.field1098[var7] < class59.field1098[var7 - -1]) {
                                var9 += var11[var9];
                            }
                            continue;
                        }
                        if (var317 == 10) {
                            var7 -= 2;
                            if (~class59.field1098[var7 + 1] > ~class59.field1098[var7]) {
                                var9 += var11[var9];
                            }
                            continue;
                        }
                        if (~var317 == -22) {
                            if (~class31.field537 == -1) {
                                return;
                            }
                            class39 var21 = class11.field193[--class31.field537];
                            class131.field2388 = var21.field734;
                            class195.field3792 = var21.field743;
                            var6 = var21.field737;
                            var9 = var21.field740;
                            var10 = var6.field1360;
                            var11 = var6.field1365;
                            continue;
                        }
                        if (var317 == 25) {
                            int var22 = var11[var9];
                            class59.field1098[var7++] = class116.method710(0, var22);
                            continue;
                        }
                        if (~var317 == -28) {
                            int var23 = var11[var9];
                            --var7;
                            class116.method711((byte) -110, var23, class59.field1098[var7]);
                            continue;
                        }
                        if (var317 == 31) {
                            var7 -= 2;
                            if (class59.field1098[var7] <= class59.field1098[var7 + 1]) {
                                var9 += var11[var9];
                            }
                            continue;
                        }
                        if (var317 == 32) {
                            var7 -= 2;
                            if (class59.field1098[var7] >= class59.field1098[var7 - -1]) {
                                var9 += var11[var9];
                            }
                            continue;
                        }
                        if (var317 == 33) {
                            class59.field1098[var7++] = class195.field3792[var11[var9]];
                            continue;
                        }
                        int var10001;
                        if (var317 == 34) {
                            var10001 = var11[var9];
                            --var7;
                            class195.field3792[var10001] = class59.field1098[var7];
                            continue;
                        }
                        if (~var317 == -36) {
                            class191.field3710[var8++] = class131.field2388[var11[var9]];
                            continue;
                        }
                        if (~var317 == -37) {
                            var10001 = var11[var9];
                            --var8;
                            class131.field2388[var10001] = class191.field3710[var8];
                            continue;
                        }
                        if (~var317 == -38) {
                            int var24 = var11[var9];
                            var8 -= var24;
                            class184 var25 = class206.method1304(class191.field3710, var24, -22629, var8);
                            class191.field3710[var8++] = var25;
                            continue;
                        }
                        if (~var317 == -39) {
                            --var7;
                            continue;
                        }
                        if (var317 == 39) {
                            --var8;
                            continue;
                        }
                        if (~var317 == -41) {
                            int var26 = var11[var9];
                            class73 var27 = class51.method284(38, var26);
                            int[] var28 = new int[var27.field1373];
                            class184[] var29 = new class184[var27.field1361];
                            for (int var30 = 0; ~var30 > ~var27.field1359; ++var30) {
                                var28[var30] = class59.field1098[var7 + var30 - var27.field1359];
                            }
                            for (int var31 = 0; ~var31 > ~var27.field1358; ++var31) {
                                var29[var31] = class191.field3710[-var27.field1358 + var8 + var31];
                            }
                            var7 -= var27.field1359;
                            var8 -= var27.field1358;
                            class39 var32 = new class39();
                            var32.field734 = class131.field2388;
                            var32.field740 = var9;
                            var32.field743 = class195.field3792;
                            var32.field737 = var6;
                            if (~class11.field193.length >= ~class31.field537) {
                                throw new RuntimeException();
                            }
                            var6 = var27;
                            class11.field193[class31.field537++] = var32;
                            class195.field3792 = var28;
                            var11 = var27.field1365;
                            class131.field2388 = var29;
                            var9 = -1;
                            var10 = var27.field1360;
                            continue;
                        }
                        if (~var317 == -43) {
                            class59.field1098[var7++] = class64.field1209[var11[var9]];
                            continue;
                        }
                        if (~var317 == -44) {
                            var10001 = var11[var9];
                            --var7;
                            class64.field1209[var10001] = class59.field1098[var7];
                            continue;
                        }
                        if (var317 == 44) {
                            int var33 = 65535 & var11[var9];
                            --var7;
                            int var34 = class59.field1098[var7];
                            int var35 = var11[var9] >> 16;
                            if (var34 >= 0 && var34 <= 5000) {
                                byte var36 = -1;
                                if (var33 == 105) {
                                    var36 = 0;
                                }
                                class85.field1572[var35] = var34;
                                int var37 = 0;
                                while (true) {
                                    if (var37 >= var34) {
                                        continue label2241;
                                    }
                                    class129.field2333[var35][var37] = var36;
                                    ++var37;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var317 == 45) {
                            --var7;
                            int var38 = class59.field1098[var7];
                            int var39 = var11[var9];
                            if (var38 >= 0 && var38 < class85.field1572[var39]) {
                                class59.field1098[var7++] = class129.field2333[var39][var38];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (~var317 == -47) {
                            var7 -= 2;
                            int var40 = var11[var9];
                            int var41 = class59.field1098[var7];
                            if (var41 >= 0 && ~var41 > ~class85.field1572[var40]) {
                                class129.field2333[var40][var41] = class59.field1098[var7 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var317 == 47) {
                            class184 var42 = class135.field2460[var11[var9]];
                            if (var42 == null) {
                                var42 = class129.field2342;
                            }
                            class191.field3710[var8++] = var42;
                            continue;
                        }
                        if (~var317 == -49) {
                            var10001 = var11[var9];
                            --var8;
                            class135.field2460[var10001] = class191.field3710[var8];
                            continue;
                        }
                    }
                    boolean var43;
                    if (var11[var9] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    if (~var317 <= -301) {
                        if (~var317 > -501) {
                            if (var317 == 403) {
                                var7 -= 2;
                                int var44 = class59.field1098[var7 - -1];
                                int var45 = class59.field1098[var7];
                                if (~var45 <= -8) {
                                    var45 -= 7;
                                }
                                class46.field872.field1275.method1308(-12009, var44, var45);
                                continue;
                            }
                            if (var317 == 404) {
                                var7 -= 2;
                                int var46 = class59.field1098[var7];
                                int var47 = class59.field1098[var7 + 1];
                                class46.field872.field1275.method1316(var47, var46, (byte) 57);
                                continue;
                            }
                            if (var317 == 410) {
                                --var7;
                                boolean var48 = ~class59.field1098[var7] != -1;
                                class46.field872.field1275.method1317(-127, var48);
                                continue;
                            }
                        } else if ((var317 < 1000 || var317 >= 1100) && (var317 < 2000 || var317 >= 2100)) {
                            if (~var317 <= -1101 && ~var317 > -1201 || var317 >= 2100 && var317 < 2200) {
                                class167 var51;
                                if (~var317 > -2001) {
                                    var51 = var43 ? class194.field3764 : class90.field1668;
                                } else {
                                    --var7;
                                    var51 = class44.method255(class59.field1098[var7], 10583);
                                    var317 -= 1000;
                                }
                                if (var317 == 1100) {
                                    var7 -= 2;
                                    var51.field3109 = class59.field1098[var7];
                                    if (var51.field3109 > -var51.field3045 + var51.field3071) {
                                        var51.field3109 = var51.field3071 - var51.field3045;
                                    }
                                    if (~var51.field3109 > -1) {
                                        var51.field3109 = 0;
                                    }
                                    var51.field3073 = class59.field1098[var7 + 1];
                                    if (~var51.field3073 < ~(var51.field3096 - var51.field3089)) {
                                        var51.field3073 = var51.field3096 - var51.field3089;
                                    }
                                    if (var51.field3073 < 0) {
                                        var51.field3073 = 0;
                                    }
                                    class57.method305(-126, var51);
                                    continue;
                                }
                                if (~var317 == -1102) {
                                    --var7;
                                    var51.field3057 = class59.field1098[var7];
                                    class57.method305(-119, var51);
                                    continue;
                                }
                                if (~var317 == -1103) {
                                    --var7;
                                    var51.field3080 = ~class59.field1098[var7] == -2;
                                    class57.method305(-121, var51);
                                    continue;
                                }
                                if (var317 == 1103) {
                                    --var7;
                                    var51.field3026 = class59.field1098[var7];
                                    class57.method305(-126, var51);
                                    continue;
                                }
                                if (var317 == 1104) {
                                    --var7;
                                    var51.field3121 = class59.field1098[var7];
                                    class57.method305(-128, var51);
                                    continue;
                                }
                                if (var317 == 1105) {
                                    --var7;
                                    var51.field3006 = class59.field1098[var7];
                                    class57.method305(-113, var51);
                                    continue;
                                }
                                if (~var317 == -1107) {
                                    --var7;
                                    var51.field3065 = class59.field1098[var7];
                                    class57.method305(-122, var51);
                                    continue;
                                }
                                if (~var317 == -1108) {
                                    --var7;
                                    var51.field2998 = class59.field1098[var7] == 1;
                                    class57.method305(-127, var51);
                                    continue;
                                }
                                if (~var317 == -1109) {
                                    var51.field2991 = 1;
                                    --var7;
                                    var51.field3054 = class59.field1098[var7];
                                    class57.method305(-113, var51);
                                    continue;
                                }
                                if (~var317 == -1110) {
                                    var7 -= 6;
                                    var51.field2996 = class59.field1098[var7];
                                    var51.field3052 = class59.field1098[var7 + 1];
                                    var51.field3039 = class59.field1098[var7 - -2];
                                    var51.field3033 = class59.field1098[var7 - -3];
                                    var51.field3123 = class59.field1098[var7 + 4];
                                    var51.field3118 = class59.field1098[var7 - -5];
                                    class57.method305(-121, var51);
                                    continue;
                                }
                                if (~var317 == -1111) {
                                    --var7;
                                    int var52 = class59.field1098[var7];
                                    if (var51.field3035 != var52) {
                                        var51.field3043 = 0;
                                        var51.field3092 = 0;
                                        var51.field3035 = var52;
                                        class57.method305(-116, var51);
                                    }
                                    continue;
                                }
                                if (~var317 == -1112) {
                                    --var7;
                                    var51.field3105 = ~class59.field1098[var7] == -2;
                                    class57.method305(-125, var51);
                                    continue;
                                }
                                if (~var317 == -1113) {
                                    --var8;
                                    class184 var53 = class191.field3710[var8];
                                    if (!var53.method1139(var51.field3051, (byte) 108)) {
                                        var51.field3051 = var53;
                                        class57.method305(-118, var51);
                                    }
                                    continue;
                                }
                                if (var317 == 1113) {
                                    --var7;
                                    var51.field3037 = class59.field1098[var7];
                                    class57.method305(-113, var51);
                                    continue;
                                }
                                if (~var317 == -1115) {
                                    var7 -= 3;
                                    var51.field3110 = class59.field1098[var7];
                                    var51.field3078 = class59.field1098[var7 + 1];
                                    var51.field3113 = class59.field1098[var7 + 2];
                                    class57.method305(-117, var51);
                                    continue;
                                }
                                if (~var317 == -1116) {
                                    --var7;
                                    var51.field3000 = ~class59.field1098[var7] == -2;
                                    class57.method305(-127, var51);
                                    continue;
                                }
                                if (~var317 == -1117) {
                                    --var7;
                                    var51.field2995 = class59.field1098[var7];
                                    class57.method305(-116, var51);
                                    continue;
                                }
                                if (~var317 == -1118) {
                                    --var7;
                                    var51.field3077 = class59.field1098[var7];
                                    class57.method305(-113, var51);
                                    continue;
                                }
                                if (var317 == 1118) {
                                    --var7;
                                    var51.field3032 = ~class59.field1098[var7] == -2;
                                    class57.method305(-128, var51);
                                    continue;
                                }
                                if (~var317 == -1120) {
                                    --var7;
                                    var51.field3098 = ~class59.field1098[var7] == -2;
                                    class57.method305(-125, var51);
                                    continue;
                                }
                                if (~var317 == -1121) {
                                    var7 -= 2;
                                    var51.field3071 = class59.field1098[var7];
                                    var51.field3096 = class59.field1098[var7 - -1];
                                    class57.method305(-125, var51);
                                    continue;
                                }
                            } else if ((~var317 > -1201 || var317 >= 1300) && (~var317 > -2201 || ~var317 <= -2301)) {
                                if (~var317 <= -1301 && var317 < 1400 || var317 >= 2300 && var317 < 2400) {
                                    class167 var58;
                                    if (var317 >= 2000) {
                                        var317 -= 1000;
                                        --var7;
                                        var58 = class44.method255(class59.field1098[var7], 10583);
                                    } else {
                                        var58 = var43 ? class194.field3764 : class90.field1668;
                                    }
                                    if (~var317 == -1301) {
                                        --var7;
                                        int var59 = class59.field1098[var7] + -1;
                                        if (var59 >= 0 && var59 <= 9) {
                                            --var8;
                                            var58.method1032(var59, 64, class191.field3710[var8]);
                                            continue;
                                        }
                                        --var8;
                                        continue;
                                    }
                                    if (var317 == 1301) {
                                        var7 -= 2;
                                        int var60 = class59.field1098[var7];
                                        int var61 = class59.field1098[var7 - -1];
                                        var58.field3060 = class189.method1199(var60, true, var61);
                                        continue;
                                    }
                                    if (var317 == 1302) {
                                        --var7;
                                        var58.field3111 = class59.field1098[var7] == 1;
                                        continue;
                                    }
                                    if (~var317 == -1304) {
                                        --var7;
                                        var58.field3019 = class59.field1098[var7];
                                        continue;
                                    }
                                    if (var317 == 1304) {
                                        --var7;
                                        var58.field3084 = class59.field1098[var7];
                                        continue;
                                    }
                                    if (~var317 == -1306) {
                                        --var8;
                                        var58.field3119 = class191.field3710[var8];
                                        continue;
                                    }
                                    if (var317 == 1306) {
                                        --var8;
                                        var58.field3124 = class191.field3710[var8];
                                        continue;
                                    }
                                    if (~var317 == -1308) {
                                        var58.field2993 = null;
                                        continue;
                                    }
                                } else {
                                    if (var317 >= 1400 && var317 < 1500 || var317 >= 2400 && ~var317 > -2501) {
                                        class167 var290;
                                        if (var317 < 2000) {
                                            var290 = !var43 ? class90.field1668 : class194.field3764;
                                        } else {
                                            --var7;
                                            var290 = class44.method255(class59.field1098[var7], 10583);
                                            var317 -= 1000;
                                        }
                                        --var8;
                                        class184 var291 = class191.field3710[var8];
                                        int[] var292 = null;
                                        if (~var291.method1159(false) < -1 && ~var291.method1165(var291.method1159(false) - 1, false) == -90) {
                                            --var7;
                                            int var293 = class59.field1098[var7];
                                            if (var293 > 0) {
                                                var292 = new int[var293];
                                                while (~(var293--) < -1) {
                                                    --var7;
                                                    var292[var293] = class59.field1098[var7];
                                                }
                                            }
                                            var291 = var291.method1162(0, -711833726, -1 + var291.method1159(false));
                                        }
                                        Object[] var294 = new Object[var291.method1159(false) - -1];
                                        for (int var295 = var294.length + -1; ~var295 <= -2; --var295) {
                                            if (var291.method1165(var295 + -1, false) != 115) {
                                                --var7;
                                                var294[var295] = new Integer(class59.field1098[var7]);
                                            } else {
                                                --var8;
                                                var294[var295] = class191.field3710[var8];
                                            }
                                        }
                                        --var7;
                                        int var296 = class59.field1098[var7];
                                        if (~var296 != 0) {
                                            var294[0] = new Integer(var296);
                                        } else {
                                            var294 = null;
                                        }
                                        var290.field2999 = true;
                                        if (var317 == 1419) {
                                            var290.field3103 = var294;
                                        }
                                        if (var317 == 1412) {
                                            var290.field3047 = var294;
                                        }
                                        if (var317 == 1410) {
                                            var290.field3025 = var294;
                                        }
                                        if (~var317 == -1419) {
                                            var290.field3128 = var294;
                                        }
                                        if (~var317 == -1422) {
                                            var290.field3090 = var294;
                                        }
                                        if (~var317 == -1401) {
                                            var290.field3053 = var294;
                                        }
                                        if (~var317 == -1417) {
                                            var290.field3022 = var294;
                                        }
                                        if (~var317 == -1418) {
                                            var290.field3107 = var294;
                                        }
                                        if (~var317 == -1409) {
                                            var290.field3062 = var294;
                                        }
                                        if (var317 == 1401) {
                                            var290.field3083 = var294;
                                        }
                                        if (var317 == 1422) {
                                            var290.field3091 = var294;
                                        }
                                        if (~var317 == -1424) {
                                            var290.field3038 = var294;
                                        }
                                        if (var317 == 1425) {
                                            var290.field3087 = var294;
                                        }
                                        if (var317 == 1409) {
                                            var290.field2990 = var294;
                                        }
                                        if (var317 == 1403) {
                                            var290.field3114 = var294;
                                        }
                                        if (var317 == 1420) {
                                            var290.field3023 = var294;
                                        }
                                        if (~var317 == -1416) {
                                            var290.field3015 = var294;
                                            var290.field3127 = var292;
                                        }
                                        if (var317 == 1411) {
                                            var290.field3027 = var294;
                                        }
                                        if (var317 == 1407) {
                                            var290.field3126 = var292;
                                            var290.field3018 = var294;
                                        }
                                        if (var317 == 1406) {
                                            var290.field3094 = var294;
                                        }
                                        if (var317 == 1402) {
                                            var290.field3074 = var294;
                                        }
                                        if (var317 == 1405) {
                                            var290.field3017 = var294;
                                        }
                                        if (var317 == 1424) {
                                            var290.field3055 = var294;
                                        }
                                        if (~var317 == -1415) {
                                            var290.field3068 = var294;
                                            var290.field3100 = var292;
                                        }
                                        if (var317 == 1404) {
                                            var290.field3010 = var294;
                                        }
                                        continue;
                                    }
                                    if (~var317 > -1601) {
                                        class167 var62 = var43 ? class194.field3764 : class90.field1668;
                                        if (~var317 == -1501) {
                                            class59.field1098[var7++] = var62.field3117;
                                            continue;
                                        }
                                        if (~var317 == -1502) {
                                            class59.field1098[var7++] = var62.field3067;
                                            continue;
                                        }
                                        if (var317 == 1502) {
                                            class59.field1098[var7++] = var62.field3045;
                                            continue;
                                        }
                                        if (~var317 == -1504) {
                                            class59.field1098[var7++] = var62.field3089;
                                            continue;
                                        }
                                        if (var317 == 1504) {
                                            class59.field1098[var7++] = !var62.field3042 ? 0 : 1;
                                            continue;
                                        }
                                        if (~var317 == -1506) {
                                            class59.field1098[var7++] = var62.field3001;
                                            continue;
                                        }
                                    } else if (~var317 > -1701) {
                                        class167 var63 = var43 ? class194.field3764 : class90.field1668;
                                        if (var317 == 1600) {
                                            class59.field1098[var7++] = var63.field3109;
                                            continue;
                                        }
                                        if (~var317 == -1602) {
                                            class59.field1098[var7++] = var63.field3073;
                                            continue;
                                        }
                                        if (var317 == 1602) {
                                            class191.field3710[var8++] = var63.field3051;
                                            continue;
                                        }
                                        if (~var317 == -1604) {
                                            class59.field1098[var7++] = var63.field3071;
                                            continue;
                                        }
                                        if (~var317 == -1605) {
                                            class59.field1098[var7++] = var63.field3096;
                                            continue;
                                        }
                                        if (~var317 == -1606) {
                                            class59.field1098[var7++] = var63.field3118;
                                            continue;
                                        }
                                        if (~var317 == -1607) {
                                            class59.field1098[var7++] = var63.field3039;
                                            continue;
                                        }
                                        if (~var317 == -1608) {
                                            class59.field1098[var7++] = var63.field3123;
                                            continue;
                                        }
                                        if (var317 == 1608) {
                                            class59.field1098[var7++] = var63.field3033;
                                            continue;
                                        }
                                        if (var317 == 1609) {
                                            class59.field1098[var7++] = var63.field3026;
                                            continue;
                                        }
                                    } else if (~var317 <= -1801) {
                                        if (var317 < 1900) {
                                            class167 var64 = !var43 ? class90.field1668 : class194.field3764;
                                            if (var317 == 1800) {
                                                class59.field1098[var7++] = class14.method87(class188.method1191((byte) -99, var64), -1);
                                                continue;
                                            }
                                            if (var317 == 1801) {
                                                --var7;
                                                int var65 = class59.field1098[var7];
                                                int var318 = var65 - 1;
                                                if (var64.field2993 != null && var64.field2993.length > var318 && var64.field2993[var318] != null) {
                                                    class191.field3710[var8++] = var64.field2993[var318];
                                                    continue;
                                                }
                                                class191.field3710[var8++] = class158.field2834;
                                                continue;
                                            }
                                            if (var317 == 1802) {
                                                if (var64.field3119 != null) {
                                                    class191.field3710[var8++] = var64.field3119;
                                                } else {
                                                    class191.field3710[var8++] = class158.field2834;
                                                }
                                                continue;
                                            }
                                        } else if (var317 < 2600) {
                                            --var7;
                                            class167 var66 = class44.method255(class59.field1098[var7], 10583);
                                            if (var317 == 2500) {
                                                class59.field1098[var7++] = var66.field3117;
                                                continue;
                                            }
                                            if (~var317 == -2502) {
                                                class59.field1098[var7++] = var66.field3067;
                                                continue;
                                            }
                                            if (~var317 == -2503) {
                                                class59.field1098[var7++] = var66.field3045;
                                                continue;
                                            }
                                            if (var317 == 2503) {
                                                class59.field1098[var7++] = var66.field3089;
                                                continue;
                                            }
                                            if (var317 == 2504) {
                                                class59.field1098[var7++] = !var66.field3042 ? 0 : 1;
                                                continue;
                                            }
                                            if (~var317 == -2506) {
                                                class59.field1098[var7++] = var66.field3001;
                                                continue;
                                            }
                                        } else if (~var317 > -2701) {
                                            --var7;
                                            class167 var67 = class44.method255(class59.field1098[var7], 10583);
                                            if (~var317 == -2601) {
                                                class59.field1098[var7++] = var67.field3109;
                                                continue;
                                            }
                                            if (~var317 == -2602) {
                                                class59.field1098[var7++] = var67.field3073;
                                                continue;
                                            }
                                            if (~var317 == -2603) {
                                                class191.field3710[var8++] = var67.field3051;
                                                continue;
                                            }
                                            if (var317 == 2603) {
                                                class59.field1098[var7++] = var67.field3071;
                                                continue;
                                            }
                                            if (var317 == 2604) {
                                                class59.field1098[var7++] = var67.field3096;
                                                continue;
                                            }
                                            if (var317 == 2605) {
                                                class59.field1098[var7++] = var67.field3118;
                                                continue;
                                            }
                                            if (~var317 == -2607) {
                                                class59.field1098[var7++] = var67.field3039;
                                                continue;
                                            }
                                            if (var317 == 2607) {
                                                class59.field1098[var7++] = var67.field3123;
                                                continue;
                                            }
                                            if (var317 == 2608) {
                                                class59.field1098[var7++] = var67.field3033;
                                                continue;
                                            }
                                            if (var317 == 2609) {
                                                class59.field1098[var7++] = var67.field3026;
                                                continue;
                                            }
                                        } else if (var317 < 2800) {
                                            if (~var317 == -2701) {
                                                --var7;
                                                class167 var68 = class44.method255(class59.field1098[var7], 10583);
                                                class59.field1098[var7++] = var68.field3034;
                                                continue;
                                            }
                                            if (~var317 == -2702) {
                                                --var7;
                                                class167 var69 = class44.method255(class59.field1098[var7], 10583);
                                                if (var69.field3034 != -1) {
                                                    class59.field1098[var7++] = var69.field3050;
                                                } else {
                                                    class59.field1098[var7++] = 0;
                                                }
                                                continue;
                                            }
                                            if (~var317 == -2703) {
                                                --var7;
                                                int var70 = class59.field1098[var7];
                                                class7 var71 = (class7) class134.field2436.method51((long) var70, -128);
                                                if (var71 != null) {
                                                    class59.field1098[var7++] = 1;
                                                } else {
                                                    class59.field1098[var7++] = 0;
                                                }
                                                continue;
                                            }
                                            if (~var317 == -2704) {
                                                --var7;
                                                class167 var72 = class44.method255(class59.field1098[var7], 10583);
                                                if (var72.field3097 == null) {
                                                    class59.field1098[var7++] = 0;
                                                    continue;
                                                }
                                                int var73 = var72.field3097.length;
                                                for (int var74 = 0; ~var72.field3097.length < ~var74; ++var74) {
                                                    if (var72.field3097[var74] == null) {
                                                        var73 = var74;
                                                        break;
                                                    }
                                                }
                                                class59.field1098[var7++] = var73;
                                                continue;
                                            }
                                            if (var317 == 2704 || var317 == 2705) {
                                                var7 -= 2;
                                                int var75 = class59.field1098[var7];
                                                int var76 = class59.field1098[var7 + 1];
                                                class7 var77 = (class7) class134.field2436.method51((long) var75, 118);
                                                if (var77 != null && var77.field119 == var76) {
                                                    class59.field1098[var7++] = 1;
                                                } else {
                                                    class59.field1098[var7++] = 0;
                                                }
                                                continue;
                                            }
                                        } else if (~var317 > -2901) {
                                            --var7;
                                            class167 var78 = class44.method255(class59.field1098[var7], 10583);
                                            if (var317 == 2800) {
                                                class59.field1098[var7++] = class14.method87(class188.method1191((byte) -128, var78), -1);
                                                continue;
                                            }
                                            if (~var317 == -2802) {
                                                --var7;
                                                int var79 = class59.field1098[var7];
                                                int var319 = var79 - 1;
                                                if (var78.field2993 != null && ~var78.field2993.length < ~var319 && var78.field2993[var319] != null) {
                                                    class191.field3710[var8++] = var78.field2993[var319];
                                                    continue;
                                                }
                                                class191.field3710[var8++] = class158.field2834;
                                                continue;
                                            }
                                            if (var317 == 2802) {
                                                if (var78.field3119 == null) {
                                                    class191.field3710[var8++] = class158.field2834;
                                                } else {
                                                    class191.field3710[var8++] = var78.field3119;
                                                }
                                                continue;
                                            }
                                        } else if (var317 >= 3200) {
                                            if (var317 >= 3300) {
                                                if (~var317 > -3401) {
                                                    if (~var317 == -3301) {
                                                        class59.field1098[var7++] = class161.field2903;
                                                        continue;
                                                    }
                                                    if (var317 == 3301) {
                                                        var7 -= 2;
                                                        int var80 = class59.field1098[var7];
                                                        int var81 = class59.field1098[var7 - -1];
                                                        class59.field1098[var7++] = class119.method717(var80, (byte) 95, var81);
                                                        continue;
                                                    }
                                                    if (var317 == 3302) {
                                                        var7 -= 2;
                                                        int var82 = class59.field1098[var7];
                                                        int var83 = class59.field1098[var7 + 1];
                                                        class59.field1098[var7++] = class186.method1177(var82, 0, var83);
                                                        continue;
                                                    }
                                                    if (~var317 == -3304) {
                                                        var7 -= 2;
                                                        int var84 = class59.field1098[var7];
                                                        int var85 = class59.field1098[var7 + 1];
                                                        class59.field1098[var7++] = class208.method1325(var84, (byte) -75, var85);
                                                        continue;
                                                    }
                                                    if (~var317 == -3305) {
                                                        --var7;
                                                        int var86 = class59.field1098[var7];
                                                        class59.field1098[var7++] = class190.method1210(var86, 5).field3433;
                                                        continue;
                                                    }
                                                    if (~var317 == -3306) {
                                                        --var7;
                                                        int var87 = class59.field1098[var7];
                                                        class59.field1098[var7++] = class79.field1437[var87];
                                                        continue;
                                                    }
                                                    if (~var317 == -3307) {
                                                        --var7;
                                                        int var88 = class59.field1098[var7];
                                                        class59.field1098[var7++] = class16.field304[var88];
                                                        continue;
                                                    }
                                                    if (var317 == 3307) {
                                                        --var7;
                                                        int var89 = class59.field1098[var7];
                                                        class59.field1098[var7++] = class128.field2312[var89];
                                                        continue;
                                                    }
                                                    if (var317 == 3308) {
                                                        int var90 = class47.field892;
                                                        int var91 = (class46.field872.field614 >> 7) + class129.field2331;
                                                        int var92 = (class46.field872.field635 >> 7) - -class57.field1020;
                                                        class59.field1098[var7++] = (var90 << 28) + (var92 << 14) + var91;
                                                        continue;
                                                    }
                                                    if (var317 == 3309) {
                                                        --var7;
                                                        int var93 = class59.field1098[var7];
                                                        class59.field1098[var7++] = class10.method61(var93, 268426427) >> 14;
                                                        continue;
                                                    }
                                                    if (var317 == 3310) {
                                                        --var7;
                                                        int var94 = class59.field1098[var7];
                                                        class59.field1098[var7++] = var94 >> 28;
                                                        continue;
                                                    }
                                                    if (~var317 == -3312) {
                                                        --var7;
                                                        int var95 = class59.field1098[var7];
                                                        class59.field1098[var7++] = class10.method61(16383, var95);
                                                        continue;
                                                    }
                                                    if (var317 == 3312) {
                                                        class59.field1098[var7++] = class47.field882 ? 1 : 0;
                                                        continue;
                                                    }
                                                    if (~var317 == -3314) {
                                                        var7 -= 2;
                                                        int var96 = class59.field1098[var7 - -1];
                                                        int var97 = class59.field1098[var7] - -32768;
                                                        class59.field1098[var7++] = class119.method717(var97, (byte) 125, var96);
                                                        continue;
                                                    }
                                                    if (~var317 == -3315) {
                                                        var7 -= 2;
                                                        int var98 = class59.field1098[var7] + 32768;
                                                        int var99 = class59.field1098[var7 + 1];
                                                        class59.field1098[var7++] = class186.method1177(var98, 0, var99);
                                                        continue;
                                                    }
                                                    if (~var317 == -3316) {
                                                        var7 -= 2;
                                                        int var100 = class59.field1098[var7] + 32768;
                                                        int var101 = class59.field1098[var7 - -1];
                                                        class59.field1098[var7++] = class208.method1325(var100, (byte) -75, var101);
                                                        continue;
                                                    }
                                                    if (~var317 == -3317) {
                                                        if (class57.field1022 >= 2) {
                                                            class59.field1098[var7++] = class57.field1022;
                                                        } else {
                                                            class59.field1098[var7++] = 0;
                                                        }
                                                        continue;
                                                    }
                                                    if (var317 == 3317) {
                                                        class59.field1098[var7++] = class119.field2146;
                                                        continue;
                                                    }
                                                    if (~var317 == -3319) {
                                                        class59.field1098[var7++] = class52.field954;
                                                        continue;
                                                    }
                                                    if (var317 == 3321) {
                                                        class59.field1098[var7++] = class191.field3723;
                                                        continue;
                                                    }
                                                    if (var317 == 3322) {
                                                        class59.field1098[var7++] = class135.field2455;
                                                        continue;
                                                    }
                                                    if (var317 == 3323) {
                                                        if (class57.field1022 == 1) {
                                                            class59.field1098[var7++] = 1;
                                                        } else {
                                                            class59.field1098[var7++] = 0;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var317 == -3325) {
                                                        if (class138.field2510 >= 5 && ~class138.field2510 >= -10) {
                                                            class59.field1098[var7++] = class138.field2510;
                                                            continue;
                                                        }
                                                        class59.field1098[var7++] = 0;
                                                        continue;
                                                    }
                                                    if (var317 == 3325) {
                                                        if (class151.field2706 > 0) {
                                                            class59.field1098[var7++] = 1;
                                                        } else {
                                                            class59.field1098[var7++] = 0;
                                                        }
                                                        continue;
                                                    }
                                                    if (var317 == 3326) {
                                                        class59.field1098[var7++] = class46.field872.field1282;
                                                        continue;
                                                    }
                                                    if (~var317 == -3328) {
                                                        class59.field1098[var7++] = !class46.field872.field1275.field3989 ? 0 : 1;
                                                        continue;
                                                    }
                                                } else if (var317 < 3500) {
                                                    if (var317 == 3400) {
                                                        var7 -= 2;
                                                        int var102 = class59.field1098[var7];
                                                        int var103 = class59.field1098[var7 + 1];
                                                        class202 var104 = class47.method271(var102, (byte) -56);
                                                        for (int var105 = 0; ~var104.field3891 < ~var105; ++var105) {
                                                            if (var104.field3908[var105] == var103) {
                                                                class191.field3710[var8++] = var104.field3906[var105];
                                                                var104 = null;
                                                                break;
                                                            }
                                                        }
                                                        if (var104 != null) {
                                                            class191.field3710[var8++] = var104.field3901;
                                                        }
                                                        continue;
                                                    }
                                                    if (var317 == 3408) {
                                                        var7 -= 4;
                                                        int var106 = class59.field1098[var7];
                                                        int var107 = class59.field1098[var7 + 1];
                                                        int var108 = class59.field1098[var7 + 2];
                                                        int var109 = class59.field1098[var7 + 3];
                                                        class202 var110 = class47.method271(var108, (byte) -107);
                                                        if (~var110.field3911 == ~var106 && var110.field3894 == var107) {
                                                            for (int var111 = 0; ~var111 > ~var110.field3891; ++var111) {
                                                                if (~var110.field3908[var111] == ~var109) {
                                                                    if (~var107 == -116) {
                                                                        class191.field3710[var8++] = var110.field3906[var111];
                                                                    } else {
                                                                        class59.field1098[var7++] = var110.field3910[var111];
                                                                    }
                                                                    var110 = null;
                                                                    break;
                                                                }
                                                            }
                                                            if (var110 != null) {
                                                                if (var107 != 115) {
                                                                    class59.field1098[var7++] = var110.field3900;
                                                                } else {
                                                                    class191.field3710[var8++] = var110.field3901;
                                                                }
                                                            }
                                                            continue;
                                                        }
                                                        if (var107 != 115) {
                                                            class59.field1098[var7++] = 0;
                                                        } else {
                                                            class191.field3710[var8++] = class129.field2342;
                                                        }
                                                        continue;
                                                    }
                                                } else if (var317 < 3700) {
                                                    if (~var317 == -3601) {
                                                        if (class172.field3266 != 0) {
                                                            if (~class172.field3266 == -2) {
                                                                class59.field1098[var7++] = -1;
                                                            } else {
                                                                class59.field1098[var7++] = class64.field1212;
                                                            }
                                                        } else {
                                                            class59.field1098[var7++] = -2;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var317 == -3602) {
                                                        --var7;
                                                        int var112 = class59.field1098[var7];
                                                        if (~class172.field3266 == -3 && var112 < class64.field1212) {
                                                            class191.field3710[var8++] = class202.field3895[var112];
                                                            continue;
                                                        }
                                                        class191.field3710[var8++] = class158.field2834;
                                                        continue;
                                                    }
                                                    if (~var317 == -3603) {
                                                        --var7;
                                                        int var113 = class59.field1098[var7];
                                                        if (class172.field3266 == 2 && ~class64.field1212 < ~var113) {
                                                            class59.field1098[var7++] = class204.field3931[var113];
                                                            continue;
                                                        }
                                                        class59.field1098[var7++] = 0;
                                                        continue;
                                                    }
                                                    if (var317 == 3603) {
                                                        --var7;
                                                        int var114 = class59.field1098[var7];
                                                        if (class172.field3266 == 2 && ~var114 > ~class64.field1212) {
                                                            class59.field1098[var7++] = class126.field2271[var114];
                                                            continue;
                                                        }
                                                        class59.field1098[var7++] = 0;
                                                        continue;
                                                    }
                                                    if (~var317 == -3605) {
                                                        --var7;
                                                        int var115 = class59.field1098[var7];
                                                        --var8;
                                                        class184 var116 = class191.field3710[var8];
                                                        class201.method1285(103, var115, var116);
                                                        continue;
                                                    }
                                                    if (~var317 == -3606) {
                                                        --var8;
                                                        class184 var117 = class191.field3710[var8];
                                                        class66.method386(var117.method1160(0), (byte) 125);
                                                        continue;
                                                    }
                                                    if (~var317 == -3607) {
                                                        --var8;
                                                        class184 var118 = class191.field3710[var8];
                                                        method942(92, var118.method1160(0));
                                                        continue;
                                                    }
                                                    if (~var317 == -3608) {
                                                        --var8;
                                                        class184 var119 = class191.field3710[var8];
                                                        class151.method924(false, var119.method1160(0));
                                                        continue;
                                                    }
                                                    if (var317 == 3608) {
                                                        --var8;
                                                        class184 var120 = class191.field3710[var8];
                                                        class8.method46(var120.method1160(0), -111);
                                                        continue;
                                                    }
                                                    if (~var317 == -3610) {
                                                        --var8;
                                                        class184 var121 = class191.field3710[var8];
                                                        if (var121.method1135((byte) 116, class101.field1876) || var121.method1135((byte) 116, class51.field944)) {
                                                            var121 = var121.method1140(1, 7);
                                                        }
                                                        class59.field1098[var7++] = !class112.method694(var121, -683524792) ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (~var317 == -3612) {
                                                        if (class12.field231 != null) {
                                                            class191.field3710[var8++] = class12.field231.method1147(true);
                                                        } else {
                                                            class191.field3710[var8++] = class158.field2834;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var317 == -3613) {
                                                        if (class12.field231 != null) {
                                                            class59.field1098[var7++] = class107.field1937;
                                                        } else {
                                                            class59.field1098[var7++] = 0;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var317 == -3614) {
                                                        --var7;
                                                        int var122 = class59.field1098[var7];
                                                        if (class12.field231 != null && class107.field1937 > var122) {
                                                            class191.field3710[var8++] = class186.field3606[var122].field867.method1147(true);
                                                            continue;
                                                        }
                                                        class191.field3710[var8++] = class158.field2834;
                                                        continue;
                                                    }
                                                    if (var317 == 3614) {
                                                        --var7;
                                                        int var123 = class59.field1098[var7];
                                                        if (class12.field231 != null && ~var123 > ~class107.field1937) {
                                                            class59.field1098[var7++] = class186.field3606[var123].field871;
                                                            continue;
                                                        }
                                                        class59.field1098[var7++] = 0;
                                                        continue;
                                                    }
                                                    if (~var317 == -3616) {
                                                        --var7;
                                                        int var124 = class59.field1098[var7];
                                                        if (class12.field231 != null && class107.field1937 > var124) {
                                                            class59.field1098[var7++] = class186.field3606[var124].field870;
                                                            continue;
                                                        }
                                                        class59.field1098[var7++] = 0;
                                                        continue;
                                                    }
                                                    if (~var317 == -3617) {
                                                        class59.field1098[var7++] = class128.field2306;
                                                        continue;
                                                    }
                                                    if (var317 == 3617) {
                                                        --var8;
                                                        class184 var125 = class191.field3710[var8];
                                                        class188.method1185(var125, 80);
                                                        continue;
                                                    }
                                                    if (var317 == 3618) {
                                                        class59.field1098[var7++] = class145.field2625;
                                                        continue;
                                                    }
                                                    if (~var317 == -3620) {
                                                        --var8;
                                                        class184 var126 = class191.field3710[var8];
                                                        class134.method809(var126.method1160(0), (byte) 126);
                                                        continue;
                                                    }
                                                    if (var317 == 3620) {
                                                        class63.method353(-20739);
                                                        continue;
                                                    }
                                                    if (~var317 == -3622) {
                                                        if (~class172.field3266 != -1) {
                                                            class59.field1098[var7++] = class9.field170;
                                                        } else {
                                                            class59.field1098[var7++] = -1;
                                                        }
                                                        continue;
                                                    }
                                                    if (var317 == 3622) {
                                                        --var7;
                                                        int var127 = class59.field1098[var7];
                                                        if (~class172.field3266 != -1 && ~class9.field170 < ~var127) {
                                                            class191.field3710[var8++] = class119.method719(class103.field1878[var127], 37).method1147(true);
                                                            continue;
                                                        }
                                                        class191.field3710[var8++] = class158.field2834;
                                                        continue;
                                                    }
                                                    if (~var317 == -3624) {
                                                        --var8;
                                                        class184 var128 = class191.field3710[var8];
                                                        if (var128.method1135((byte) 116, class101.field1876) || var128.method1135((byte) 116, class51.field944)) {
                                                            var128 = var128.method1140(1, 7);
                                                        }
                                                        class59.field1098[var7++] = !class66.method390(0, var128) ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (~var317 == -3625) {
                                                        --var7;
                                                        int var129 = class59.field1098[var7];
                                                        if (class186.field3606 != null && class107.field1937 > var129 && class186.field3606[var129].field867.method1150(class46.field872.field1299, -118)) {
                                                            class59.field1098[var7++] = 1;
                                                            continue;
                                                        }
                                                        class59.field1098[var7++] = 0;
                                                        continue;
                                                    }
                                                    if (~var317 == -3626) {
                                                        if (class127.field2292 == null) {
                                                            class191.field3710[var8++] = class158.field2834;
                                                        } else {
                                                            class191.field3710[var8++] = class127.field2292.method1147(true);
                                                        }
                                                        continue;
                                                    }
                                                } else if (var317 >= 4000) {
                                                    if (var317 >= 4100) {
                                                        if (~var317 <= -4201) {
                                                            if (~var317 <= -4301) {
                                                                if (var317 >= 5100) {
                                                                    if (~var317 > -5201) {
                                                                        if (var317 == 5100) {
                                                                            if (class120.field2163[86]) {
                                                                                class59.field1098[var7++] = 1;
                                                                            } else {
                                                                                class59.field1098[var7++] = 0;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var317 == 5101) {
                                                                            if (!class120.field2163[82]) {
                                                                                class59.field1098[var7++] = 0;
                                                                            } else {
                                                                                class59.field1098[var7++] = 1;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var317 == 5102) {
                                                                            if (!class120.field2163[81]) {
                                                                                class59.field1098[var7++] = 0;
                                                                            } else {
                                                                                class59.field1098[var7++] = 1;
                                                                            }
                                                                            continue;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (~var317 == -5001) {
                                                                        class59.field1098[var7++] = class79.field1431;
                                                                        continue;
                                                                    }
                                                                    if (var317 == 5001) {
                                                                        ++class78.field1412;
                                                                        var7 -= 3;
                                                                        class79.field1431 = class59.field1098[var7];
                                                                        class71.field1343 = class59.field1098[var7 + 1];
                                                                        class47.field891 = class59.field1098[var7 + 2];
                                                                        class117.field2122.method106(134, 41);
                                                                        class117.field2122.method583((byte) 14, class79.field1431);
                                                                        class117.field2122.method583((byte) 14, class71.field1343);
                                                                        class117.field2122.method583((byte) 14, class47.field891);
                                                                        continue;
                                                                    }
                                                                    if (var317 == 5002) {
                                                                        var7 -= 2;
                                                                        ++class17.field321;
                                                                        --var8;
                                                                        class184 var130 = class191.field3710[var8];
                                                                        int var131 = class59.field1098[var7];
                                                                        int var132 = class59.field1098[var7 + 1];
                                                                        class117.field2122.method106(230, -127);
                                                                        class117.field2122.method607(var130.method1160(0), 45);
                                                                        class117.field2122.method583((byte) 14, var131 - 1);
                                                                        class117.field2122.method583((byte) 14, var132);
                                                                        continue;
                                                                    }
                                                                    if (var317 == 5003) {
                                                                        --var7;
                                                                        int var133 = class59.field1098[var7];
                                                                        class184 var134 = null;
                                                                        if (var133 < 100) {
                                                                            var134 = class76.field1397[var133];
                                                                        }
                                                                        if (var134 == null) {
                                                                            var134 = class158.field2834;
                                                                        }
                                                                        class191.field3710[var8++] = var134;
                                                                        continue;
                                                                    }
                                                                    if (var317 == 5004) {
                                                                        --var7;
                                                                        int var135 = class59.field1098[var7];
                                                                        int var136 = -1;
                                                                        if (var135 < 100 && class76.field1397[var135] != null) {
                                                                            var136 = class87.field1599[var135];
                                                                        }
                                                                        class59.field1098[var7++] = var136;
                                                                        continue;
                                                                    }
                                                                    if (var317 == 5005) {
                                                                        class59.field1098[var7++] = class71.field1343;
                                                                        continue;
                                                                    }
                                                                    if (~var317 == -5009) {
                                                                        --var8;
                                                                        class184 var137 = class191.field3710[var8];
                                                                        if (var137.method1135((byte) 116, class58.field1036)) {
                                                                            class207.method1311(var137, -23777);
                                                                        } else {
                                                                            ++class35.field624;
                                                                            byte var138 = 0;
                                                                            class184 var139 = var137.method1141((byte) 9);
                                                                            byte var140 = 0;
                                                                            if (!var139.method1135((byte) 116, class7.field121)) {
                                                                                if (!var139.method1135((byte) 116, class20.field378)) {
                                                                                    if (var139.method1135((byte) 116, class193.field3745)) {
                                                                                        var137 = var137.method1140(1, class193.field3745.method1159(false));
                                                                                        var140 = 2;
                                                                                    } else if (var139.method1135((byte) 116, class167.field3064)) {
                                                                                        var137 = var137.method1140(1, class167.field3064.method1159(false));
                                                                                        var140 = 3;
                                                                                    } else if (var139.method1135((byte) 116, class50.field916)) {
                                                                                        var137 = var137.method1140(1, class50.field916.method1159(false));
                                                                                        var140 = 4;
                                                                                    } else if (var139.method1135((byte) 116, class5.field89)) {
                                                                                        var140 = 5;
                                                                                        var137 = var137.method1140(1, class5.field89.method1159(false));
                                                                                    } else if (!var139.method1135((byte) 116, class172.field3261)) {
                                                                                        if (var139.method1135((byte) 116, class164.field2961)) {
                                                                                            var140 = 7;
                                                                                            var137 = var137.method1140(1, class164.field2961.method1159(false));
                                                                                        } else if (var139.method1135((byte) 116, class105.field1907)) {
                                                                                            var140 = 8;
                                                                                            var137 = var137.method1140(1, class105.field1907.method1159(false));
                                                                                        } else if (var139.method1135((byte) 116, class26.field474)) {
                                                                                            var137 = var137.method1140(1, class26.field474.method1159(false));
                                                                                            var140 = 9;
                                                                                        } else if (var139.method1135((byte) 116, class131.field2391)) {
                                                                                            var140 = 10;
                                                                                            var137 = var137.method1140(1, class131.field2391.method1159(false));
                                                                                        } else if (!var139.method1135((byte) 116, class35.field639)) {
                                                                                            if (~class141.field2565 != -1) {
                                                                                                if (var139.method1135((byte) 116, class7.field126)) {
                                                                                                    var140 = 0;
                                                                                                    var137 = var137.method1140(1, class7.field126.method1159(false));
                                                                                                } else if (var139.method1135((byte) 116, class20.field388)) {
                                                                                                    var137 = var137.method1140(1, class20.field388.method1159(false));
                                                                                                    var140 = 1;
                                                                                                } else if (!var139.method1135((byte) 116, class193.field3740)) {
                                                                                                    if (!var139.method1135((byte) 116, class167.field3095)) {
                                                                                                        if (!var139.method1135((byte) 116, class50.field932)) {
                                                                                                            if (var139.method1135((byte) 116, class5.field76)) {
                                                                                                                var140 = 5;
                                                                                                                var137 = var137.method1140(1, class5.field76.method1159(false));
                                                                                                            } else if (!var139.method1135((byte) 116, class172.field3268)) {
                                                                                                                if (var139.method1135((byte) 116, class164.field2940)) {
                                                                                                                    var137 = var137.method1140(1, class164.field2940.method1159(false));
                                                                                                                    var140 = 7;
                                                                                                                } else if (!var139.method1135((byte) 116, class105.field1916)) {
                                                                                                                    if (var139.method1135((byte) 116, class26.field471)) {
                                                                                                                        var137 = var137.method1140(1, class26.field471.method1159(false));
                                                                                                                        var140 = 9;
                                                                                                                    } else if (!var139.method1135((byte) 116, class131.field2387)) {
                                                                                                                        if (var139.method1135((byte) 116, class35.field659)) {
                                                                                                                            var140 = 11;
                                                                                                                            var137 = var137.method1140(1, class35.field659.method1159(false));
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var140 = 10;
                                                                                                                        var137 = var137.method1140(1, class131.field2387.method1159(false));
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var137 = var137.method1140(1, class105.field1916.method1159(false));
                                                                                                                    var140 = 8;
                                                                                                                }
                                                                                                            } else {
                                                                                                                var137 = var137.method1140(1, class172.field3268.method1159(false));
                                                                                                                var140 = 6;
                                                                                                            }
                                                                                                        } else {
                                                                                                            var140 = 4;
                                                                                                            var137 = var137.method1140(1, class50.field932.method1159(false));
                                                                                                        }
                                                                                                    } else {
                                                                                                        var140 = 3;
                                                                                                        var137 = var137.method1140(1, class167.field3095.method1159(false));
                                                                                                    }
                                                                                                } else {
                                                                                                    var140 = 2;
                                                                                                    var137 = var137.method1140(1, class193.field3740.method1159(false));
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            var137 = var137.method1140(1, class35.field639.method1159(false));
                                                                                            var140 = 11;
                                                                                        }
                                                                                    } else {
                                                                                        var140 = 6;
                                                                                        var137 = var137.method1140(1, class172.field3261.method1159(false));
                                                                                    }
                                                                                } else {
                                                                                    var140 = 1;
                                                                                    var137 = var137.method1140(1, class20.field378.method1159(false));
                                                                                }
                                                                            } else {
                                                                                var137 = var137.method1140(1, class7.field121.method1159(false));
                                                                                var140 = 0;
                                                                            }
                                                                            class184 var141 = var137.method1141((byte) 9);
                                                                            if (var141.method1135((byte) 116, class76.field1401)) {
                                                                                var138 = 1;
                                                                                var137 = var137.method1140(1, class76.field1401.method1159(false));
                                                                            } else if (var141.method1135((byte) 116, class25.field457)) {
                                                                                var138 = 2;
                                                                                var137 = var137.method1140(1, class25.field457.method1159(false));
                                                                            } else if (var141.method1135((byte) 116, class159.field2870)) {
                                                                                var138 = 3;
                                                                                var137 = var137.method1140(1, class159.field2870.method1159(false));
                                                                            } else if (!var141.method1135((byte) 116, class32.field562)) {
                                                                                if (var141.method1135((byte) 116, class128.field2325)) {
                                                                                    var137 = var137.method1140(1, class128.field2325.method1159(false));
                                                                                    var138 = 5;
                                                                                } else if (class141.field2565 != 0) {
                                                                                    if (!var141.method1135((byte) 116, class76.field1402)) {
                                                                                        if (var141.method1135((byte) 116, class25.field455)) {
                                                                                            var138 = 2;
                                                                                            var137 = var137.method1140(1, class25.field455.method1159(false));
                                                                                        } else if (var141.method1135((byte) 116, class159.field2865)) {
                                                                                            var137 = var137.method1140(1, class159.field2865.method1159(false));
                                                                                            var138 = 3;
                                                                                        } else if (var141.method1135((byte) 116, class32.field567)) {
                                                                                            var138 = 4;
                                                                                            var137 = var137.method1140(1, class32.field567.method1159(false));
                                                                                        } else if (var141.method1135((byte) 116, class128.field2315)) {
                                                                                            var137 = var137.method1140(1, class128.field2315.method1159(false));
                                                                                            var138 = 5;
                                                                                        }
                                                                                    } else {
                                                                                        var138 = 1;
                                                                                        var137 = var137.method1140(1, class76.field1402.method1159(false));
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                var138 = 4;
                                                                                var137 = var137.method1140(1, class32.field562.method1159(false));
                                                                            }
                                                                            class117.field2122.method106(192, 89);
                                                                            class117.field2122.method583((byte) 14, 0);
                                                                            int var142 = class117.field2122.field1834;
                                                                            class117.field2122.method583((byte) 14, var140);
                                                                            class117.field2122.method583((byte) 14, var138);
                                                                            class198.method1275(-18576, var137, class117.field2122);
                                                                            class117.field2122.method593(119, -var142 + class117.field2122.field1834);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var317 == 5009) {
                                                                        ++class133.field2421;
                                                                        var8 -= 2;
                                                                        class184 var143 = class191.field3710[var8];
                                                                        class184 var144 = class191.field3710[var8 - -1];
                                                                        class117.field2122.method106(6, -119);
                                                                        class117.field2122.method583((byte) 14, 0);
                                                                        int var145 = class117.field2122.field1834;
                                                                        class117.field2122.method607(var143.method1160(0), 106);
                                                                        class198.method1275(-18576, var144, class117.field2122);
                                                                        class117.field2122.method593(95, -var145 + class117.field2122.field1834);
                                                                        continue;
                                                                    }
                                                                    if (~var317 == -5011) {
                                                                        --var7;
                                                                        int var146 = class59.field1098[var7];
                                                                        class184 var147 = null;
                                                                        if (~var146 > -101) {
                                                                            var147 = class154.field2768[var146];
                                                                        }
                                                                        if (var147 == null) {
                                                                            var147 = class158.field2834;
                                                                        }
                                                                        class191.field3710[var8++] = var147;
                                                                        continue;
                                                                    }
                                                                    if (~var317 == -5012) {
                                                                        --var7;
                                                                        int var148 = class59.field1098[var7];
                                                                        class184 var149 = null;
                                                                        if (~var148 > -101) {
                                                                            var149 = class207.field3982[var148];
                                                                        }
                                                                        if (var149 == null) {
                                                                            var149 = class158.field2834;
                                                                        }
                                                                        class191.field3710[var8++] = var149;
                                                                        continue;
                                                                    }
                                                                    if (var317 == 5015) {
                                                                        class184 var150;
                                                                        if (class46.field872 != null && class46.field872.field1299 != null) {
                                                                            var150 = class46.field872.field1299;
                                                                        } else {
                                                                            var150 = class188.field3651;
                                                                        }
                                                                        class191.field3710[var8++] = var150;
                                                                        continue;
                                                                    }
                                                                    if (var317 == 5016) {
                                                                        class59.field1098[var7++] = class47.field891;
                                                                        continue;
                                                                    }
                                                                    if (~var317 == -5018) {
                                                                        class59.field1098[var7++] = class55.field976;
                                                                        continue;
                                                                    }
                                                                }
                                                            } else {
                                                                if (~var317 == -4201) {
                                                                    --var7;
                                                                    int var151 = class59.field1098[var7];
                                                                    class191.field3710[var8++] = class60.method336(var151, 10).field2233;
                                                                    continue;
                                                                }
                                                                if (~var317 == -4202) {
                                                                    var7 -= 2;
                                                                    int var152 = class59.field1098[var7];
                                                                    int var153 = class59.field1098[var7 + 1];
                                                                    class122 var154 = class60.method336(var152, 10);
                                                                    if (~var153 <= -2 && var153 <= 5 && var154.field2193[var153 + -1] != null) {
                                                                        class191.field3710[var8++] = var154.field2193[var153 + -1];
                                                                        continue;
                                                                    }
                                                                    class191.field3710[var8++] = class158.field2834;
                                                                    continue;
                                                                }
                                                                if (var317 == 4202) {
                                                                    var7 -= 2;
                                                                    int var155 = class59.field1098[var7];
                                                                    int var156 = class59.field1098[var7 - -1];
                                                                    class122 var157 = class60.method336(var155, 10);
                                                                    if (var156 >= 1 && ~var156 >= -6 && var157.field2232[var156 + -1] != null) {
                                                                        class191.field3710[var8++] = var157.field2232[var156 + -1];
                                                                        continue;
                                                                    }
                                                                    class191.field3710[var8++] = class158.field2834;
                                                                    continue;
                                                                }
                                                                if (~var317 == -4204) {
                                                                    --var7;
                                                                    int var158 = class59.field1098[var7];
                                                                    class59.field1098[var7++] = class60.method336(var158, 10).field2200;
                                                                    continue;
                                                                }
                                                                if (~var317 == -4205) {
                                                                    --var7;
                                                                    int var159 = class59.field1098[var7];
                                                                    class59.field1098[var7++] = class60.method336(var159, 10).field2223 != 1 ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (var317 == 4205) {
                                                                    --var7;
                                                                    int var160 = class59.field1098[var7];
                                                                    class122 var161 = class60.method336(var160, 10);
                                                                    if (var161.field2204 == -1 && var161.field2191 >= 0) {
                                                                        class59.field1098[var7++] = var161.field2191;
                                                                        continue;
                                                                    }
                                                                    class59.field1098[var7++] = var160;
                                                                    continue;
                                                                }
                                                                if (var317 == 4206) {
                                                                    --var7;
                                                                    int var162 = class59.field1098[var7];
                                                                    class122 var163 = class60.method336(var162, 10);
                                                                    if (var163.field2204 >= 0 && var163.field2191 >= 0) {
                                                                        class59.field1098[var7++] = var163.field2191;
                                                                        continue;
                                                                    }
                                                                    class59.field1098[var7++] = var162;
                                                                    continue;
                                                                }
                                                                if (var317 == 4207) {
                                                                    --var7;
                                                                    int var164 = class59.field1098[var7];
                                                                    class59.field1098[var7++] = class60.method336(var164, 10).field2190 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (~var317 == -4211) {
                                                                    --var8;
                                                                    class184 var165 = class191.field3710[var8];
                                                                    --var7;
                                                                    int var166 = class59.field1098[var7];
                                                                    class16.method101(~var166 == -2, var165, 0);
                                                                    class59.field1098[var7++] = class209.field4008;
                                                                    continue;
                                                                }
                                                                if (~var317 == -4212) {
                                                                    if (class162.field2929 != null && class15.field294 < class209.field4008) {
                                                                        class59.field1098[var7++] = class10.method61(65535, class162.field2929[class15.field294++]);
                                                                        continue;
                                                                    }
                                                                    class59.field1098[var7++] = -1;
                                                                    continue;
                                                                }
                                                                if (var317 == 4212) {
                                                                    class15.field294 = 0;
                                                                    continue;
                                                                }
                                                            }
                                                        } else {
                                                            if (var317 == 4100) {
                                                                --var8;
                                                                class184 var167 = class191.field3710[var8];
                                                                --var7;
                                                                int var168 = class59.field1098[var7];
                                                                class191.field3710[var8++] = class144.method884(0, new class184[] { var167, class170.method1060(var168, -113) });
                                                                continue;
                                                            }
                                                            if (var317 == 4101) {
                                                                var8 -= 2;
                                                                class184 var169 = class191.field3710[var8];
                                                                class184 var170 = class191.field3710[var8 + 1];
                                                                class191.field3710[var8++] = class144.method884(0, new class184[] { var169, var170 });
                                                                continue;
                                                            }
                                                            if (~var317 == -4103) {
                                                                --var7;
                                                                int var171 = class59.field1098[var7];
                                                                --var8;
                                                                class184 var172 = class191.field3710[var8];
                                                                class191.field3710[var8++] = class144.method884(0, new class184[] { var172, class175.method1079(var171, true, 124) });
                                                                continue;
                                                            }
                                                            if (~var317 == -4104) {
                                                                --var8;
                                                                class184 var173 = class191.field3710[var8];
                                                                class191.field3710[var8++] = var173.method1141((byte) 9);
                                                                continue;
                                                            }
                                                            if (var317 == 4104) {
                                                                --var7;
                                                                int var174 = class59.field1098[var7];
                                                                long var175 = (long) var174 * 86400000L + 1014768000000L;
                                                                class178.field3392.setTime(new Date(var175));
                                                                int var177 = class178.field3392.get(5);
                                                                int var178 = class178.field3392.get(2);
                                                                int var179 = class178.field3392.get(1);
                                                                class191.field3710[var8++] = class144.method884(0, new class184[] { class170.method1060(var177, -103), class146.field2634, class5.field81[var178], class146.field2634, class170.method1060(var179, -110) });
                                                                continue;
                                                            }
                                                            if (~var317 == -4106) {
                                                                var8 -= 2;
                                                                class184 var180 = class191.field3710[var8];
                                                                class184 var181 = class191.field3710[var8 + 1];
                                                                if (class46.field872.field1275 != null && class46.field872.field1275.field3989) {
                                                                    class191.field3710[var8++] = var181;
                                                                    continue;
                                                                }
                                                                class191.field3710[var8++] = var180;
                                                                continue;
                                                            }
                                                            if (var317 == 4106) {
                                                                --var7;
                                                                int var182 = class59.field1098[var7];
                                                                class191.field3710[var8++] = class170.method1060(var182, -117);
                                                                continue;
                                                            }
                                                            if (~var317 == -4108) {
                                                                var8 -= 2;
                                                                class59.field1098[var7++] = class191.field3710[var8].method1149((byte) 83, class191.field3710[var8 - -1]);
                                                                continue;
                                                            }
                                                            if (var317 == 4108) {
                                                                var7 -= 2;
                                                                int var183 = class59.field1098[var7 + 1];
                                                                --var8;
                                                                class184 var184 = class191.field3710[var8];
                                                                int var185 = class59.field1098[var7];
                                                                byte[] var186 = class111.field2013.method1249((byte) 42, 0, var183);
                                                                class124 var187 = new class124(var186);
                                                                var187.method1363(class125.field2250, (int[]) null);
                                                                class59.field1098[var7++] = var187.method1341(var184, var185);
                                                                continue;
                                                            }
                                                            if (~var317 == -4110) {
                                                                var7 -= 2;
                                                                int var188 = class59.field1098[var7];
                                                                --var8;
                                                                class184 var189 = class191.field3710[var8];
                                                                int var190 = class59.field1098[var7 - -1];
                                                                byte[] var191 = class111.field2013.method1249((byte) -118, 0, var190);
                                                                class124 var192 = new class124(var191);
                                                                var192.method1363(class125.field2250, (int[]) null);
                                                                class59.field1098[var7++] = var192.method1369(var189, var188);
                                                                continue;
                                                            }
                                                            if (var317 == 4110) {
                                                                var8 -= 2;
                                                                class184 var193 = class191.field3710[var8];
                                                                class184 var194 = class191.field3710[var8 + 1];
                                                                --var7;
                                                                if (class59.field1098[var7] == 1) {
                                                                    class191.field3710[var8++] = var193;
                                                                } else {
                                                                    class191.field3710[var8++] = var194;
                                                                }
                                                                continue;
                                                            }
                                                            if (~var317 == -4112) {
                                                                --var8;
                                                                class184 var195 = class191.field3710[var8];
                                                                class191.field3710[var8++] = class211.method1358(var195);
                                                                continue;
                                                            }
                                                            if (~var317 == -4113) {
                                                                --var8;
                                                                class184 var196 = class191.field3710[var8];
                                                                --var7;
                                                                int var197 = class59.field1098[var7];
                                                                class191.field3710[var8++] = var196.method1163(var197, -31334);
                                                                continue;
                                                            }
                                                            if (~var317 == -4114) {
                                                                --var7;
                                                                int var198 = class59.field1098[var7];
                                                                class59.field1098[var7++] = !class141.method874(-75, var198) ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (~var317 == -4115) {
                                                                --var7;
                                                                int var199 = class59.field1098[var7];
                                                                class59.field1098[var7++] = class196.method1243(106, var199) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var317 == -4116) {
                                                                --var7;
                                                                int var200 = class59.field1098[var7];
                                                                class59.field1098[var7++] = class1.method3((byte) -16, var200) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (var317 == 4116) {
                                                                --var7;
                                                                int var201 = class59.field1098[var7];
                                                                class59.field1098[var7++] = !class136.method821(-49, var201) ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (~var317 == -4118) {
                                                                --var8;
                                                                class184 var202 = class191.field3710[var8];
                                                                if (var202 == null) {
                                                                    class59.field1098[var7++] = 0;
                                                                } else {
                                                                    class59.field1098[var7++] = var202.method1159(false);
                                                                }
                                                                continue;
                                                            }
                                                            if (var317 == 4118) {
                                                                var7 -= 2;
                                                                int var203 = class59.field1098[var7];
                                                                --var8;
                                                                class184 var204 = class191.field3710[var8];
                                                                int var205 = class59.field1098[var7 + 1];
                                                                class191.field3710[var8++] = var204.method1162(var203, -711833726, var205);
                                                                continue;
                                                            }
                                                            if (~var317 == -4120) {
                                                                --var8;
                                                                class184 var206 = class191.field3710[var8];
                                                                class184 var207 = class16.method97(var206.method1159(false), -21113);
                                                                boolean var208 = false;
                                                                for (int var209 = 0; ~var209 > ~var206.method1159(false); ++var209) {
                                                                    int var210 = var206.method1165(var209, false);
                                                                    if (var210 != 60) {
                                                                        if (~var210 == -63) {
                                                                            var208 = false;
                                                                        } else if (!var208) {
                                                                            var207.method1157(var210, 0);
                                                                        }
                                                                    } else {
                                                                        var208 = true;
                                                                    }
                                                                }
                                                                var207.method1164(-6325);
                                                                class191.field3710[var8++] = var207;
                                                                continue;
                                                            }
                                                            if (~var317 == -4121) {
                                                                var7 -= 2;
                                                                int var211 = class59.field1098[var7];
                                                                int var212 = class59.field1098[var7 + 1];
                                                                --var8;
                                                                class184 var213 = class191.field3710[var8];
                                                                class59.field1098[var7++] = var213.method1134(var211, var212, 93);
                                                                continue;
                                                            }
                                                            if (~var317 == -4122) {
                                                                var8 -= 2;
                                                                class184 var214 = class191.field3710[var8];
                                                                --var7;
                                                                int var215 = class59.field1098[var7];
                                                                class184 var216 = class191.field3710[var8 - -1];
                                                                class59.field1098[var7++] = var214.method1145(48, var216, var215);
                                                                continue;
                                                            }
                                                        }
                                                    } else {
                                                        if (~var317 == -4001) {
                                                            var7 -= 2;
                                                            int var217 = class59.field1098[var7];
                                                            int var218 = class59.field1098[var7 + 1];
                                                            class59.field1098[var7++] = var217 + var218;
                                                            continue;
                                                        }
                                                        if (~var317 == -4002) {
                                                            var7 -= 2;
                                                            int var219 = class59.field1098[var7 - -1];
                                                            int var220 = class59.field1098[var7];
                                                            class59.field1098[var7++] = -var219 + var220;
                                                            continue;
                                                        }
                                                        if (~var317 == -4003) {
                                                            var7 -= 2;
                                                            int var221 = class59.field1098[var7];
                                                            int var222 = class59.field1098[var7 + 1];
                                                            class59.field1098[var7++] = var221 * var222;
                                                            continue;
                                                        }
                                                        if (~var317 == -4004) {
                                                            var7 -= 2;
                                                            int var223 = class59.field1098[var7];
                                                            int var224 = class59.field1098[var7 + 1];
                                                            class59.field1098[var7++] = var223 / var224;
                                                            continue;
                                                        }
                                                        if (~var317 == -4005) {
                                                            --var7;
                                                            int var225 = class59.field1098[var7];
                                                            class59.field1098[var7++] = (int) (Math.random() * (double) var225);
                                                            continue;
                                                        }
                                                        if (~var317 == -4006) {
                                                            --var7;
                                                            int var226 = class59.field1098[var7];
                                                            class59.field1098[var7++] = (int) (Math.random() * (double) (var226 + 1));
                                                            continue;
                                                        }
                                                        if (~var317 == -4007) {
                                                            var7 -= 5;
                                                            int var227 = class59.field1098[var7];
                                                            int var228 = class59.field1098[var7 + 2];
                                                            int var229 = class59.field1098[var7 + 4];
                                                            int var230 = class59.field1098[var7 - -3];
                                                            int var231 = class59.field1098[var7 - -1];
                                                            class59.field1098[var7++] = (-var227 + var231) * (-var228 + var229) / (var230 - var228) + var227;
                                                            continue;
                                                        }
                                                        if (~var317 == -4008) {
                                                            var7 -= 2;
                                                            int var232 = class59.field1098[var7];
                                                            int var233 = class59.field1098[var7 - -1];
                                                            class59.field1098[var7++] = var232 * var233 / 100 + var232;
                                                            continue;
                                                        }
                                                        if (~var317 == -4009) {
                                                            var7 -= 2;
                                                            int var234 = class59.field1098[var7 + 1];
                                                            int var235 = class59.field1098[var7];
                                                            class59.field1098[var7++] = class123.method748(1 << var234, var235);
                                                            continue;
                                                        }
                                                        if (var317 == 4009) {
                                                            var7 -= 2;
                                                            int var236 = class59.field1098[var7];
                                                            int var237 = class59.field1098[var7 + 1];
                                                            class59.field1098[var7++] = class10.method61(-1 - (1 << var237), var236);
                                                            continue;
                                                        }
                                                        if (var317 == 4010) {
                                                            var7 -= 2;
                                                            int var238 = class59.field1098[var7];
                                                            int var239 = class59.field1098[var7 + 1];
                                                            class59.field1098[var7++] = ~class10.method61(var238, 1 << var239) == -1 ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (~var317 == -4012) {
                                                            var7 -= 2;
                                                            int var240 = class59.field1098[var7];
                                                            int var241 = class59.field1098[var7 + 1];
                                                            class59.field1098[var7++] = var240 % var241;
                                                            continue;
                                                        }
                                                        if (var317 == 4012) {
                                                            var7 -= 2;
                                                            int var242 = class59.field1098[var7 + 1];
                                                            int var243 = class59.field1098[var7];
                                                            if (var243 != 0) {
                                                                class59.field1098[var7++] = (int) Math.pow((double) var243, (double) var242);
                                                            } else {
                                                                class59.field1098[var7++] = 0;
                                                            }
                                                            continue;
                                                        }
                                                        if (~var317 == -4014) {
                                                            var7 -= 2;
                                                            int var244 = class59.field1098[var7];
                                                            int var245 = class59.field1098[var7 + 1];
                                                            if (var244 == 0) {
                                                                class59.field1098[var7++] = 0;
                                                            } else if (~var245 == -1) {
                                                                class59.field1098[var7++] = Integer.MAX_VALUE;
                                                            } else {
                                                                class59.field1098[var7++] = (int) Math.pow((double) var244, 1.0D / (double) var245);
                                                            }
                                                            continue;
                                                        }
                                                        if (~var317 == -4015) {
                                                            var7 -= 2;
                                                            int var246 = class59.field1098[var7 + 1];
                                                            int var247 = class59.field1098[var7];
                                                            class59.field1098[var7++] = class10.method61(var247, var246);
                                                            continue;
                                                        }
                                                        if (var317 == 4015) {
                                                            var7 -= 2;
                                                            int var248 = class59.field1098[var7 + 1];
                                                            int var249 = class59.field1098[var7];
                                                            class59.field1098[var7++] = class123.method748(var248, var249);
                                                            continue;
                                                        }
                                                        if (var317 == 4016) {
                                                            var7 -= 2;
                                                            int var250 = class59.field1098[var7];
                                                            int var251 = class59.field1098[var7 + 1];
                                                            class59.field1098[var7++] = ~var250 <= ~var251 ? var251 : var250;
                                                            continue;
                                                        }
                                                        if (var317 == 4017) {
                                                            var7 -= 2;
                                                            int var252 = class59.field1098[var7];
                                                            int var253 = class59.field1098[var7 + 1];
                                                            class59.field1098[var7++] = var253 >= var252 ? var253 : var252;
                                                            continue;
                                                        }
                                                        if (~var317 == -4019) {
                                                            var7 -= 3;
                                                            long var254 = (long) class59.field1098[var7 + 1];
                                                            long var256 = (long) class59.field1098[var7];
                                                            long var258 = (long) class59.field1098[var7 + 2];
                                                            class59.field1098[var7++] = (int) (var256 * var258 / var254);
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    if (~var317 == -3904) {
                                                        --var7;
                                                        int var260 = class59.field1098[var7];
                                                        class59.field1098[var7++] = class60.field1117[var260].method806((byte) -126);
                                                        continue;
                                                    }
                                                    if (var317 == 3904) {
                                                        --var7;
                                                        int var261 = class59.field1098[var7];
                                                        class59.field1098[var7++] = class60.field1117[var261].field2408;
                                                        continue;
                                                    }
                                                    if (~var317 == -3906) {
                                                        --var7;
                                                        int var262 = class59.field1098[var7];
                                                        class59.field1098[var7++] = class60.field1117[var262].field2419;
                                                        continue;
                                                    }
                                                    if (var317 == 3906) {
                                                        --var7;
                                                        int var263 = class59.field1098[var7];
                                                        class59.field1098[var7++] = class60.field1117[var263].field2413;
                                                        continue;
                                                    }
                                                    if (var317 == 3907) {
                                                        --var7;
                                                        int var264 = class59.field1098[var7];
                                                        class59.field1098[var7++] = class60.field1117[var264].field2417;
                                                        continue;
                                                    }
                                                    if (~var317 == -3909) {
                                                        --var7;
                                                        int var265 = class59.field1098[var7];
                                                        class59.field1098[var7++] = class60.field1117[var265].field2422;
                                                        continue;
                                                    }
                                                    if (var317 == 3910) {
                                                        --var7;
                                                        int var266 = class59.field1098[var7];
                                                        int var267 = class60.field1117[var266].method805(0);
                                                        class59.field1098[var7++] = ~var267 != -1 ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (var317 == 3911) {
                                                        --var7;
                                                        int var268 = class59.field1098[var7];
                                                        int var269 = class60.field1117[var268].method805(0);
                                                        class59.field1098[var7++] = ~var269 != -3 ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (var317 == 3912) {
                                                        --var7;
                                                        int var270 = class59.field1098[var7];
                                                        int var271 = class60.field1117[var270].method805(0);
                                                        class59.field1098[var7++] = var271 != 5 ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (var317 == 3913) {
                                                        --var7;
                                                        int var272 = class59.field1098[var7];
                                                        int var273 = class60.field1117[var272].method805(0);
                                                        class59.field1098[var7++] = ~var273 == -2 ? 1 : 0;
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                if (var317 == 3200) {
                                                    var7 -= 3;
                                                    class159.method965((byte) 109, class59.field1098[var7 + 1], class59.field1098[var7], class59.field1098[var7 + 2]);
                                                    continue;
                                                }
                                                if (var317 == 3201) {
                                                    --var7;
                                                    class26.method173(3, class59.field1098[var7]);
                                                    continue;
                                                }
                                                if (~var317 == -3203) {
                                                    var7 -= 2;
                                                    class74.method433(class59.field1098[var7 - -1], 117, class59.field1098[var7]);
                                                    continue;
                                                }
                                            }
                                        } else {
                                            if (~var317 == -3101) {
                                                --var8;
                                                class184 var274 = class191.field3710[var8];
                                                class149.method914(0, var274, class158.field2834, 77);
                                                continue;
                                            }
                                            if (var317 == 3101) {
                                                var7 -= 2;
                                                class182.method1129(class46.field872, class59.field1098[var7 + 1], true, class59.field1098[var7]);
                                                continue;
                                            }
                                            if (var317 == 3103) {
                                                class138.method854((byte) -27);
                                                continue;
                                            }
                                            if (var317 == 3104) {
                                                --var8;
                                                class184 var275 = class191.field3710[var8];
                                                int var276 = 0;
                                                if (var275.method1132((byte) -101)) {
                                                    var276 = var275.method1146((byte) 83);
                                                }
                                                ++class46.field875;
                                                class117.field2122.method106(42, -126);
                                                class117.field2122.method580(var276, false);
                                                continue;
                                            }
                                            if (var317 == 3105) {
                                                --var8;
                                                class184 var277 = class191.field3710[var8];
                                                ++class146.field2641;
                                                class117.field2122.method106(23, 22);
                                                class117.field2122.method607(var277.method1160(0), 117);
                                                continue;
                                            }
                                            if (var317 == 3106) {
                                                ++class63.field1189;
                                                --var8;
                                                class184 var278 = class191.field3710[var8];
                                                class117.field2122.method106(207, -14);
                                                class117.field2122.method583((byte) 14, 1 + var278.method1159(false));
                                                class117.field2122.method600(var278, 51);
                                                continue;
                                            }
                                            if (~var317 == -3108) {
                                                --var8;
                                                class184 var279 = class191.field3710[var8];
                                                --var7;
                                                int var280 = class59.field1098[var7];
                                                class127.method772(var279, -2, var280);
                                                continue;
                                            }
                                            if (var317 == 3108) {
                                                var7 -= 3;
                                                int var281 = class59.field1098[var7 + 1];
                                                int var282 = class59.field1098[var7];
                                                int var283 = class59.field1098[var7 + 2];
                                                class167 var284 = class44.method255(var283, 10583);
                                                class202.method1290(var282, false, var281, var284);
                                                continue;
                                            }
                                            if (~var317 == -3110) {
                                                class167 var285 = var43 ? class194.field3764 : class90.field1668;
                                                var7 -= 2;
                                                int var286 = class59.field1098[var7 + 1];
                                                int var287 = class59.field1098[var7];
                                                class202.method1290(var287, false, var286, var285);
                                                continue;
                                            }
                                            if (~var317 == -3111) {
                                                ++class14.field253;
                                                --var7;
                                                int var288 = class59.field1098[var7];
                                                class117.field2122.method106(168, -121);
                                                class117.field2122.method589((byte) -73, var288);
                                                continue;
                                            }
                                        }
                                    } else {
                                        class167 var289 = var43 ? class194.field3764 : class90.field1668;
                                        if (~var317 == -1701) {
                                            class59.field1098[var7++] = var289.field3034;
                                            continue;
                                        }
                                        if (~var317 == -1702) {
                                            if (~var289.field3034 != 0) {
                                                class59.field1098[var7++] = var289.field3050;
                                            } else {
                                                class59.field1098[var7++] = 0;
                                            }
                                            continue;
                                        }
                                        if (var317 == 1702) {
                                            class59.field1098[var7++] = var289.field2989;
                                            continue;
                                        }
                                    }
                                }
                            } else {
                                class167 var54;
                                if (var317 >= 2000) {
                                    var317 -= 1000;
                                    --var7;
                                    var54 = class44.method255(class59.field1098[var7], 10583);
                                } else {
                                    var54 = !var43 ? class90.field1668 : class194.field3764;
                                }
                                class57.method305(-117, var54);
                                if (var317 == 1200) {
                                    var7 -= 2;
                                    int var55 = class59.field1098[var7];
                                    int var56 = class59.field1098[var7 + 1];
                                    if (~var55 == 0) {
                                        var54.field3054 = -1;
                                        var54.field2991 = 1;
                                        var54.field3034 = -1;
                                    } else {
                                        var54.field3050 = var56;
                                        var54.field3034 = var55;
                                        class122 var57 = class60.method336(var55, 10);
                                        var54.field2996 = var57.field2197;
                                        var54.field3033 = var57.field2183;
                                        var54.field3123 = var57.field2202;
                                        var54.field3052 = var57.field2201;
                                        var54.field3039 = var57.field2192;
                                        var54.field3118 = var57.field2213;
                                        if (~var54.field3045 < -1) {
                                            var54.field3118 = var54.field3118 * 32 / var54.field3045;
                                        }
                                    }
                                    continue;
                                }
                                if (var317 == 1201) {
                                    var54.field2991 = 2;
                                    --var7;
                                    var54.field3054 = class59.field1098[var7];
                                    continue;
                                }
                                if (~var317 == -1203) {
                                    var54.field2991 = 3;
                                    var54.field3054 = class46.field872.field1275.method1307((byte) 34);
                                    continue;
                                }
                                if (~var317 == -1204) {
                                    var54.field2991 = 6;
                                    --var7;
                                    var54.field3054 = class59.field1098[var7];
                                    continue;
                                }
                                if (~var317 == -1205) {
                                    var54.field2991 = 5;
                                    --var7;
                                    var54.field3054 = class59.field1098[var7];
                                    continue;
                                }
                            }
                        } else {
                            class167 var49;
                            if (var317 >= 2000) {
                                var317 -= 1000;
                                --var7;
                                var49 = class44.method255(class59.field1098[var7], 10583);
                            } else {
                                var49 = var43 ? class194.field3764 : class90.field1668;
                            }
                            if (~var317 == -1001) {
                                var7 -= 2;
                                var49.field3117 = class59.field1098[var7];
                                var49.field3067 = class59.field1098[var7 - -1];
                                class57.method305(-119, var49);
                                continue;
                            }
                            if (~var317 == -1002) {
                                var7 -= 2;
                                var49.field3045 = class59.field1098[var7];
                                var49.field3089 = class59.field1098[var7 + 1];
                                class57.method305(-123, var49);
                                continue;
                            }
                            if (var317 == 1003) {
                                --var7;
                                boolean var50 = class59.field1098[var7] == 1;
                                if (!var49.field3042 != !var50) {
                                    var49.field3042 = var50;
                                    class57.method305(-121, var49);
                                }
                                continue;
                            }
                        }
                    } else {
                        if (~var317 == -101) {
                            var7 -= 3;
                            int var297 = class59.field1098[var7];
                            int var298 = class59.field1098[var7 - -2];
                            int var299 = class59.field1098[var7 - -1];
                            if (~var299 == -1) {
                                throw new RuntimeException();
                            }
                            class167 var300 = class44.method255(var297, 10583);
                            if (var300.field3097 == null) {
                                var300.field3097 = new class167[var298 + 1];
                            }
                            if (~var300.field3097.length >= ~var298) {
                                class167[] var301 = new class167[var298 + 1];
                                for (int var302 = 0; var302 < var300.field3097.length; ++var302) {
                                    var301[var302] = var300.field3097[var302];
                                }
                                var300.field3097 = var301;
                            }
                            if (var298 > 0 && var300.field3097[var298 + -1] == null) {
                                throw new RuntimeException("Gap at:" + (var298 - 1));
                            }
                            class167 var303 = new class167();
                            var303.field2989 = var298;
                            var303.field3061 = var299;
                            var303.field3106 = true;
                            var303.field3001 = var303.field3069 = var300.field3069;
                            var300.field3097[var298] = var303;
                            if (var43) {
                                class194.field3764 = var303;
                            } else {
                                class90.field1668 = var303;
                            }
                            class57.method305(-124, var300);
                            continue;
                        }
                        if (var317 == 101) {
                            class167 var304 = !var43 ? class90.field1668 : class194.field3764;
                            if (~var304.field2989 == 0) {
                                if (var43) {
                                    throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                }
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            class167 var305 = class44.method255(var304.field3069, 10583);
                            var305.field3097[var304.field2989] = null;
                            class57.method305(-120, var305);
                            continue;
                        }
                        if (var317 == 102) {
                            --var7;
                            class167 var306 = class44.method255(class59.field1098[var7], 10583);
                            var306.field3097 = null;
                            class57.method305(-120, var306);
                            continue;
                        }
                        if (~var317 == -201) {
                            var7 -= 2;
                            int var307 = class59.field1098[var7];
                            int var308 = class59.field1098[var7 + 1];
                            class167 var309 = class189.method1199(var307, true, var308);
                            if (var309 != null && var308 != -1) {
                                class59.field1098[var7++] = 1;
                                if (var43) {
                                    class194.field3764 = var309;
                                } else {
                                    class90.field1668 = var309;
                                }
                                continue;
                            }
                            class59.field1098[var7++] = 0;
                            continue;
                        }
                        if (var317 == 201) {
                            --var7;
                            int var310 = class59.field1098[var7];
                            class167 var311 = class44.method255(var310, 10583);
                            if (var311 == null) {
                                class59.field1098[var7++] = 0;
                            } else {
                                class59.field1098[var7++] = 1;
                                if (var43) {
                                    class194.field3764 = var311;
                                } else {
                                    class90.field1668 = var311;
                                }
                            }
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            } catch (Exception var316) {
                if (var6.field1357 == null) {
                    if (class65.field1247 != 0) {
                        class149.method914(0, class58.field1091, class158.field2834, -42);
                    }
                    class5.method38((byte) -52, "CS2 - scr:" + var6.field2393 + " op:" + var12, var316);
                } else {
                    class184 var313 = class16.method97(30, -21113);
                    var313.method1153((byte) 119, class193.field3747).method1153((byte) 115, var6.field1357);
                    for (int var314 = class31.field537 + -1; ~var314 <= -1; --var314) {
                        var313.method1153((byte) 114, class64.field1222).method1153((byte) 119, class11.field193[var314].field737.field1357);
                    }
                    if (var12 == 40) {
                        int var315 = var11[var9];
                        var313.method1153((byte) 114, class64.field1200).method1153((byte) 119, class170.method1060(var315, -105));
                    }
                    if (class65.field1247 != 0) {
                        class149.method914(0, class144.method884(0, new class184[] { class136.field2468, var6.field1357 }), class158.field2834, 82);
                    }
                    class5.method38((byte) -32, "CS2 - scr:" + var6.field2393 + " op:" + var12 + new String(var313.method1167(125)), var316);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    public static final void method941(int arg0) {
        ++field2776;
        if (arg0 == 1) {
            if (class55.field970 && class87.field1598 != class47.field892) {
                class34.method206(class47.field892, class38.field715, class111.field2019, class46.field872.field644[0], 0, class46.field872.field615[0]);
            } else if (~class47.field892 != ~class191.field3712) {
                class191.field3712 = class47.field892;
                method939(class47.field892, (byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IJ)V")
    private static final void method942(int arg0, long arg1) {
        ++field2777;
        if (~arg1 != -1L) {
            for (int var3 = 0; ~class64.field1212 < ~var3; ++var3) {
                if (~class136.field2481[var3] == ~arg1) {
                    ++class186.field3591;
                    --class64.field1212;
                    for (int var4 = var3; class64.field1212 > var4; ++var4) {
                        class202.field3895[var4] = class202.field3895[var4 + 1];
                        class204.field3931[var4] = class204.field3931[var4 + 1];
                        class136.field2481[var4] = class136.field2481[var4 + 1];
                        class126.field2271[var4] = class126.field2271[var4 + 1];
                    }
                    class158.field2825 = class136.field2471;
                    class117.field2122.method106(146, -128);
                    class117.field2122.method607(arg1, 91);
                    break;
                }
            }
            int var5 = 13 % ((arg0 - 19) / 63);
        }
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V")
    public static void method943(int arg0) {
        field2786 = null;
        if (arg0 != -1) {
            method941(36);
        }
        field2787 = null;
        field2781 = null;
        field2785 = null;
    }
}
