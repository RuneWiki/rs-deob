import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 extends class94 {

    @OriginalMember(owner = "client!eb", name = "rb", descriptor = "I")
    private int field707 = 0;

    @OriginalMember(owner = "client!eb", name = "xb", descriptor = "Z")
    private boolean field713 = false;

    @OriginalMember(owner = "client!eb", name = "Hb", descriptor = "I")
    private int field723 = 0;

    @OriginalMember(owner = "client!eb", name = "Lb", descriptor = "I")
    private int field727;

    @OriginalMember(owner = "client!eb", name = "Ib", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!eb", name = "Wb", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!eb", name = "bc", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "client!eb", name = "Vb", descriptor = "I")
    private int field737;

    @OriginalMember(owner = "client!eb", name = "Fb", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "client!eb", name = "Gb", descriptor = "I")
    private int field722;

    @OriginalMember(owner = "client!eb", name = "ac", descriptor = "I")
    public int field742;

    @OriginalMember(owner = "client!eb", name = "ub", descriptor = "I")
    private int field710;

    @OriginalMember(owner = "client!eb", name = "Yb", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
    private int field712;

    @OriginalMember(owner = "client!eb", name = "vb", descriptor = "Led;")
    private class33 field711;

    @OriginalMember(owner = "client!eb", name = "tb", descriptor = "I")
    public static int field709 = 3;

    @OriginalMember(owner = "client!eb", name = "zb", descriptor = "Loa;")
    public static class98 field715 = class38.method349(255, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!eb", name = "Qb", descriptor = "Z")
    public static boolean field732 = false;

    @OriginalMember(owner = "client!eb", name = "Sb", descriptor = "I")
    public static int field734 = 2;

    @OriginalMember(owner = "client!eb", name = "Rb", descriptor = "Z")
    public static boolean field733 = false;

    @OriginalMember(owner = "client!eb", name = "Xb", descriptor = "Loa;")
    public static class98 field739 = class38.method349(255, "Icons redrawn");

    @OriginalMember(owner = "client!eb", name = "Tb", descriptor = "Loa;")
    public static class98 field735 = class38.method349(255, "null");

    @OriginalMember(owner = "client!eb", name = "hc", descriptor = "[I")
    public static int[] field749 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!eb", name = "Nb", descriptor = "I")
    public static int field729 = 0;

    @OriginalMember(owner = "client!eb", name = "sb", descriptor = "D")
    private double field708;

    @OriginalMember(owner = "client!eb", name = "Bb", descriptor = "D")
    public double field717;

    @OriginalMember(owner = "client!eb", name = "Cb", descriptor = "D")
    private double field718;

    @OriginalMember(owner = "client!eb", name = "Db", descriptor = "D")
    public double field719;

    @OriginalMember(owner = "client!eb", name = "Ob", descriptor = "D")
    private double field730;

    @OriginalMember(owner = "client!eb", name = "Pb", descriptor = "D")
    private double field731;

    @OriginalMember(owner = "client!eb", name = "Zb", descriptor = "D")
    private double field741;

    @OriginalMember(owner = "client!eb", name = "ic", descriptor = "D")
    public double field750;

    @OriginalMember(owner = "client!eb", name = "yb", descriptor = "I")
    private int field714;

    @OriginalMember(owner = "client!eb", name = "Eb", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!eb", name = "Jb", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!eb", name = "Kb", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!eb", name = "Mb", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!eb", name = "Ub", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!eb", name = "cc", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!eb", name = "dc", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!eb", name = "ec", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!eb", name = "fc", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!eb", name = "gc", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!eb", name = "Ab", descriptor = "Lva;")
    public static class141 field716;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V")
    public final void method301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field744++;
        if (!this.field713) {
            double var6 = (double) (arg0 - this.field727);
            double var8 = (double) (arg1 - this.field712);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field750 = (double) this.field743 * var8 / var10 + (double) this.field712;
            this.field719 = this.field710;
            this.field717 = (double) this.field743 * var6 / var10 + (double) this.field727;
        }
        double var12 = (double) (this.field742 + arg4 - arg2);
        this.field731 = ((double) arg1 - this.field750) / var12;
        this.field708 = ((double) arg0 - this.field717) / var12;
        this.field741 = Math.sqrt(this.field731 * this.field731 + this.field708 * this.field708);
        if (!this.field713) {
            this.field730 = -this.field741 * Math.tan((double) this.field737 * 0.02454369D);
        }
        this.field718 = ((double) arg3 - this.field719 - this.field730 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III[Ltd;BIIIIIII)V")
    public static final void method302(int arg0, int arg1, int arg2, class132[] arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field736++;
        if (arg5 < arg2 || arg8 > arg9 || arg6 <= arg5 || arg9 >= arg11 || arg4 != -36) {
            return;
        }
        for (int var12 = 0; var12 < arg3.length; var12++) {
            class132 var13 = arg3[var12];
            if (var13 != null && var13.field3195 == arg7 && (!var13.field3152 || !class130.method1068(true, var13))) {
                int var14 = var13.field3216 + arg2 - arg1;
                int var15 = var13.field3102 + arg8 - arg10;
                if ((var13.field3193 >= 0 || var13.field3224 != 0) && arg5 >= var14 && var15 <= arg9 && arg5 < var14 + var13.field3215 && arg9 < var13.field3165 + var15) {
                    if (var13.field3193 >= 0) {
                        class36.field889 = var13.field3193;
                    } else {
                        class36.field889 = var12;
                    }
                }
                if (var13.field3219 == 8 && arg5 >= var14 && var15 <= arg9 && var13.field3215 + var14 > arg5 && var15 + var13.field3165 > arg9) {
                    class64.field1374 = var12;
                }
                if (var13.field3219 == 0) {
                    if (!var13.field3152 && class130.method1068(true, var13) && !class3.method15(var12, arg4 ^ 0xFFFFFFDF, arg0)) {
                        continue;
                    }
                    method302(arg0, var13.field3189, var14, arg3, (byte) -36, arg5, var13.field3215 + var14, var13.field3135, var15, arg9, var13.field3114, var13.field3165 + var15);
                    if (var13.field3113 != null) {
                        method302(arg0, var13.field3189, var14, var13.field3113, (byte) -36, arg5, var14 + var13.field3215, var13.field3135, var15, arg9, var13.field3114, var13.field3165 + var15);
                    }
                    if (var13.field3167 > var13.field3165 && !var13.field3152) {
                        class3.method11(var13.field3165, var15, var13.field3215 + var14, var13.field3167, var13, arg5, arg0, arg9, (byte) -62);
                    }
                    if (!var13.field3152) {
                        continue;
                    }
                }
                if (var13.field3150 == 1 && arg5 >= var14 && var15 <= arg9 && arg5 < var13.field3215 + var14 && arg9 < var13.field3165 + var15) {
                    boolean var16 = false;
                    if (var13.field3126 != 0) {
                        var16 = class86.method705((byte) 73, var13);
                    }
                    if (!var16) {
                        class129.field2995++;
                        class118.method935(var13.field3135, var13.field3213, 47, -23060, 0, class145.field3503, 0);
                    }
                }
                if (var13.field3150 == 2 && !class113.field2555 && arg5 >= var14 && arg9 >= var15 && var14 + var13.field3215 > arg5 && var13.field3165 + var15 > arg9) {
                    class98 var17 = class129.method1034((byte) 24, var13);
                    if (var17 != null) {
                        class141.field3431++;
                        class118.method935(var13.field3135, var17, 55, -23060, -1, class102.method840(new class98[] { class58.field1296, var13.field3226 }, arg4 + 46), 0);
                    }
                }
                if (var13.field3150 == 3 && arg5 >= var14 && arg9 >= var15 && var13.field3215 + var14 > arg5 && var13.field3165 + var15 > arg9) {
                    byte var18;
                    if (arg0 == 3) {
                        var18 = 17;
                    } else {
                        var18 = 39;
                    }
                    class147.field3571++;
                    class118.method935(var13.field3135, class146.field3560, var18, arg4 - 23024, 0, class145.field3503, 0);
                }
                if (var13.field3150 == 4 && var14 <= arg5 && arg9 >= var15 && var14 + var13.field3215 > arg5 && var15 + var13.field3165 > arg9) {
                    class118.method935(var13.field3135, var13.field3213, 49, -23060, 0, class145.field3503, 0);
                    class124.field2777++;
                }
                if (var13.field3150 == 5 && arg5 >= var14 && arg9 >= var15 && var14 + var13.field3215 > arg5 && arg9 < var15 + var13.field3165) {
                    class150.field3706++;
                    class118.method935(var13.field3135, var13.field3213, 22, arg4 - 23024, 0, class145.field3503, 0);
                }
                if (var13.field3150 == 6 && class96.field2195 == -1 && var14 <= arg5 && var15 <= arg9 && var14 + var13.field3215 > arg5 && arg9 < var13.field3165 + var15) {
                    class120.field2688++;
                    class118.method935(var13.field3135, var13.field3213, 1, -23060, -1, class145.field3503, 0);
                }
                if (var13.field3219 == 2) {
                    int var19 = 0;
                    for (int var20 = 0; var20 < var13.field3165; var20++) {
                        for (int var21 = 0; var21 < var13.field3215; var21++) {
                            int var22 = (var13.field3184 + 32) * var20 + var15;
                            int var23 = (var13.field3146 + 32) * var21 + var14;
                            if (var19 < 20) {
                                var22 += var13.field3163[var19];
                                var23 += var13.field3159[var19];
                            }
                            if (arg5 >= var23 && var22 <= arg9 && arg5 < var23 + 32 && var22 + 32 > arg9) {
                                class54.field1188 = var19;
                                class105.field2414 = var13.field3135;
                                if (var13.field3149[var19] > 0) {
                                    class74 var24 = class15.method152(30, var13.field3149[var19] - 1);
                                    if (class119.field2669 == 1 && class134.method1090(class39.method351(100, var13), -89)) {
                                        if (class15.field320 != var13.field3135 || class82.field1850 != var19) {
                                            class8.field166++;
                                            class118.method935(var13.field3135, class71.field1448, 58, arg4 ^ 0x5A30, var19, class102.method840(new class98[] { class102.field2354, class135.field3291, var24.field1567 }, 10), var24.field1548);
                                        }
                                    } else if (!class113.field2555 || !class134.method1090(class39.method351(86, var13), -114)) {
                                        class5.field83++;
                                        class98[] var25 = var24.field1575;
                                        if (class6.field114) {
                                            var25 = class105.method887(true, var25);
                                        }
                                        if (class134.method1090(class39.method351(arg4 ^ 0xFFFFFFF9, var13), -102)) {
                                            for (int var26 = 4; var26 >= 3; var26--) {
                                                if (var25 != null && var25[var26] != null) {
                                                    class10.field222++;
                                                    byte var27;
                                                    if (var26 == 3) {
                                                        var27 = 16;
                                                    } else {
                                                        var27 = 14;
                                                    }
                                                    class118.method935(var13.field3135, var25[var26], var27, -23060, var19, class102.method840(new class98[] { class1.field11, var24.field1567 }, 10), var24.field1548);
                                                } else if (var26 == 4) {
                                                    class118.method935(var13.field3135, class129.field2955, 14, -23060, var19, class102.method840(new class98[] { class1.field11, var24.field1567 }, 10), var24.field1548);
                                                    class56.field1239++;
                                                }
                                            }
                                        }
                                        if (class121.method963((byte) -119, class39.method351(arg4 + 98, var13))) {
                                            class118.method935(var13.field3135, class71.field1448, 46, -23060, var19, class102.method840(new class98[] { class1.field11, var24.field1567 }, 10), var24.field1548);
                                            class44.field1010++;
                                        }
                                        if (class134.method1090(class39.method351(88, var13), -87) && var25 != null) {
                                            for (int var28 = 2; var28 >= 0; var28--) {
                                                if (var25[var28] != null) {
                                                    class36.field875++;
                                                    byte var29 = 0;
                                                    if (var28 == 0) {
                                                        var29 = 12;
                                                    }
                                                    if (var28 == 1) {
                                                        var29 = 29;
                                                    }
                                                    if (var28 == 2) {
                                                        var29 = 36;
                                                    }
                                                    class118.method935(var13.field3135, var25[var28], var29, -23060, var19, class102.method840(new class98[] { class1.field11, var24.field1567 }, 10), var24.field1548);
                                                }
                                            }
                                        }
                                        class98[] var30 = var13.field3127;
                                        if (class6.field114) {
                                            var30 = class105.method887(true, var30);
                                        }
                                        if (var30 != null) {
                                            for (int var31 = 4; var31 >= 0; var31--) {
                                                if (var30[var31] != null) {
                                                    class21.field452++;
                                                    byte var32 = 0;
                                                    if (var31 == 0) {
                                                        var32 = 44;
                                                    }
                                                    if (var31 == 1) {
                                                        var32 = 45;
                                                    }
                                                    if (var31 == 2) {
                                                        var32 = 6;
                                                    }
                                                    if (var31 == 3) {
                                                        var32 = 23;
                                                    }
                                                    if (var31 == 4) {
                                                        var32 = 53;
                                                    }
                                                    class118.method935(var13.field3135, var30[var31], var32, -23060, var19, class102.method840(new class98[] { class1.field11, var24.field1567 }, arg4 + 46), var24.field1548);
                                                }
                                            }
                                        }
                                        class118.method935(var13.field3135, class146.field3542, 1003, arg4 - 23024, var19, class102.method840(new class98[] { class1.field11, var24.field1567 }, arg4 + 46), var24.field1548);
                                    } else if ((class77.field1696 & 0x10) == 16) {
                                        class118.method935(var13.field3135, class91.field2111, 33, -23060, var19, class102.method840(new class98[] { class149.field3674, class135.field3291, var24.field1567 }, 10), var24.field1548);
                                        class102.field2355++;
                                    }
                                }
                            }
                            var19++;
                        }
                    }
                }
                if (var13.field3152) {
                    if (class113.field2555) {
                        if (class127.method1004((byte) -77, class39.method351(41, var13)) && (class77.field1696 & 0x20) == 32 && arg5 >= var14 && var15 <= arg9 && arg5 < var13.field3215 + var14 && arg9 < var15 + var13.field3165) {
                            class118.method935(var13.field3135, class91.field2111, 3, -23060, var13.field3115, class102.method840(new class98[] { class149.field3674, class32.field778, var13.field3203 }, 10), 0);
                            class42.field980++;
                        }
                    } else if (arg5 >= var14 && var15 <= arg9 && arg5 < var13.field3215 + var14 && arg9 < var13.field3165 + var15) {
                        for (int var33 = 9; var33 >= 5; var33--) {
                            class98 var37 = class83.method695(var33, -326, var13);
                            if (var37 != null) {
                                class1.field15++;
                                class118.method935(var13.field3135, var37, 8, -23060, var13.field3115, var13.field3203, var33 + 1);
                            }
                        }
                        class98 var34 = class129.method1034((byte) 24, var13);
                        if (var34 != null) {
                            class141.field3431++;
                            class118.method935(var13.field3135, var34, 55, -23060, var13.field3115, var13.field3203, 0);
                        }
                        for (int var35 = 4; var35 >= 0; var35--) {
                            class98 var36 = class83.method695(var35, -326, var13);
                            if (var36 != null) {
                                class118.method935(var13.field3135, var36, 8, -23060, var13.field3115, var13.field3203, var35 + 1);
                                class1.field15++;
                            }
                        }
                        if (class105.method885(12004, class39.method351(110, var13))) {
                            class118.method935(var13.field3135, var13.field3213, 1, -23060, var13.field3115, class145.field3503, 0);
                            class120.field2688++;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V")
    public static final void method303(byte arg0, int arg1) {
        field726++;
        if (arg1 == -1 || !class119.field2682[arg1]) {
            return;
        }
        class71.field1452.method1065(arg1, 113);
        if (class36.field901[arg1] == null || arg0 != -24) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class36.field901[arg1].length; var3++) {
            if (class36.field901[arg1][var3] != null) {
                if (class36.field901[arg1][var3].field3219 == 2) {
                    var2 = false;
                } else {
                    class36.field901[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class36.field901[arg1] = null;
        }
        class119.field2682[arg1] = false;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)Lt;")
    public final class128 method273(byte arg0) {
        field720++;
        class19 var2 = class51.method425(this.field722, 4);
        if (arg0 < 104) {
            this.field713 = true;
        }
        class128 var3 = var2.method182((byte) 124, this.field723);
        if (var3 == null) {
            return null;
        } else {
            var3.method1009(this.field714);
            return var3;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)Loa;")
    public static final class98 method304(int arg0, byte arg1) {
        int var2 = 81 % ((-arg1 - 70) / 43);
        field745++;
        if (arg0 < 100000) {
            return class132.method1074(arg0, (byte) -115);
        } else if (arg0 < 10000000) {
            return class102.method840(new class98[] { class132.method1074(arg0 / 1000, (byte) -51), class46.field1055 }, 10);
        } else {
            return class102.method840(new class98[] { class132.method1074(arg0 / 1000000, (byte) 91), class84.field1957 }, 10);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)I")
    public static final int method305(int arg0, int arg1, int arg2, int arg3) {
        field746++;
        int var4 = arg3 >> 7;
        int var5 = arg1 >> 7;
        if (arg0 >= -43) {
            return -14;
        } else if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
            int var6 = arg3 & 0x7F;
            int var7 = arg2;
            int var8 = arg1 & 0x7F;
            if (arg2 < 3 && (class80.field1771[1][var4][var5] & 0x2) == 2) {
                var7 = arg2 + 1;
            }
            int var9 = (128 - var6) * class25.field616[var7][var4][var5] + class25.field616[var7][var4 + 1][var5] * var6 >> 7;
            int var10 = (128 - var6) * class25.field616[var7][var4][var5 + 1] + class25.field616[var7][var4 + 1][var5 + 1] * var6 >> 7;
            return (128 - var8) * var9 + var8 * var10 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)V")
    public static void method306(byte arg0) {
        field735 = null;
        field715 = null;
        field739 = null;
        field749 = null;
        field716 = null;
        if (arg0 > -87) {
            method303((byte) -107, 115);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(BI)V")
    public final void method307(byte arg0, int arg1) {
        this.field713 = true;
        this.field719 += this.field718 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field730;
        field728++;
        this.field717 += (double) arg1 * this.field708;
        this.field750 += (double) arg1 * this.field731;
        int var3 = 79 / ((38 - arg0) / 33);
        this.field730 += (double) arg1 * this.field718;
        this.field748 = (int) (Math.atan2(this.field708, this.field731) * 325.949D) + 1024 & 0x7FF;
        this.field714 = (int) (Math.atan2(this.field730, this.field741) * 325.949D) & 0x7FF;
        if (this.field711 == null) {
            return;
        }
        this.field707 += arg1;
        while (true) {
            do {
                do {
                    if (this.field707 <= this.field711.field794[this.field723]) {
                        return;
                    }
                    this.field707 -= this.field711.field794[this.field723];
                    this.field723++;
                } while (this.field723 < this.field711.field807.length);
                this.field723 -= this.field711.field834;
            } while (this.field723 >= 0 && this.field723 < this.field711.field807.length);
            this.field723 = 0;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILkc;Lb;I)V")
    public static final void method308(int arg0, class72 arg1, class8 arg2, int arg3) {
        class42 var4 = new class42();
        var4.field992 = arg2.method62((byte) 111);
        field747++;
        var4.field973 = arg2.method70(false);
        var4.field975 = new class93[var4.field992];
        var4.field995 = new int[var4.field992];
        var4.field979 = new byte[var4.field992][][];
        var4.field986 = new int[var4.field992];
        var4.field983 = new class93[var4.field992];
        var4.field974 = new int[var4.field992];
        if (arg3 != -2) {
            return;
        }
        for (int var5 = 0; var5 < var4.field992; var5++) {
            try {
                int var6 = arg2.method62((byte) 123);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg2.method93(35).method802(arg3 ^ 0xB));
                    String var8 = new String(arg2.method93(91).method802(-11));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method70(false);
                    }
                    var4.field995[var5] = var6;
                    var4.field986[var5] = var9;
                    var4.field983[var5] = arg1.method582(var8, class99.method822(var7, (byte) -90), (byte) -84);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg2.method93(11).method802(-11));
                    String var11 = new String(arg2.method93(124).method802(arg3 - 9));
                    int var12 = arg2.method62((byte) 94);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg2.method93(arg3 + 102).method802(-11));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method70(false);
                            var15[var16] = new byte[var17];
                            arg2.method97(106, 0, var15[var16], var17);
                        }
                    }
                    var4.field995[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class99.method822(var13[var19], (byte) -105);
                    }
                    var4.field975[var5] = arg1.method579(class99.method822(var10, (byte) 80), var11, -68, var18);
                    var4.field979[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field974[var5] = -1;
            } catch (SecurityException var21) {
                var4.field974[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field974[var5] = -3;
            } catch (Exception var23) {
                var4.field974[var5] = -4;
            } catch (Throwable var24) {
                var4.field974[var5] = -5;
            }
        }
        class84.field1943.method508(38, var4);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field727 = arg2;
        this.field724 = arg10;
        this.field738 = arg9;
        this.field743 = arg8;
        this.field737 = arg7;
        this.field721 = arg5;
        this.field722 = arg0;
        this.field742 = arg6;
        this.field710 = arg4;
        this.field713 = false;
        this.field740 = arg1;
        this.field712 = arg3;
        int var12 = class51.method425(this.field722, 4).field428;
        if (var12 == -1) {
            this.field711 = null;
        } else {
            this.field711 = class48.method413(-121, var12);
        }
    }
}
