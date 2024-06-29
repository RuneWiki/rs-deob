import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class181 extends class161 {

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    private int field2893 = 0;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    private int field2906 = -32768;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "Z")
    private boolean field2911 = false;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    private int field2918 = -1;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    private int field2915 = 0;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "Z")
    private boolean field2917 = false;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
    private int field2908;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    private int field2916;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    private int field2892;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
    private int field2920;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    private int field2896;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    public int field2923;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    private int field2894;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Ld;")
    private class43 field2888;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "[I")
    public static int[] field2895 = new int[32];

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Lwf;")
    public static class250 field2891 = null;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "D")
    private double field2885;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "D")
    public double field2889;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "D")
    private double field2897;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "D")
    private double field2899;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "D")
    private double field2907;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "D")
    public double field2909;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "D")
    public double field2913;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "D")
    private double field2919;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    private int field2910;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "Ldc;")
    private class158 field2903;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)V", line = 6)
    public static final void method1414(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class56.field942; var3++) {
            for (int var4 = 0; var4 < class273.field4526; var4++) {
                for (int var5 = 0; var5 < class162.field2574; var5++) {
                    class36 var6 = class129.field2184[var3][var4][var5];
                    if (var6 != null) {
                        class338 var7 = var6.field533;
                        if (var7 != null && var7.field5392.method890()) {
                            class325.method2291(var7.field5392, var3, var4, var5, 1, 1);
                            if (var7.field5390 != null && var7.field5390.method890()) {
                                class325.method2291(var7.field5390, var3, var4, var5, 1, 1);
                                var7.field5392.method879(var7.field5390, 0, 0, 0, false);
                                var7.field5390 = var7.field5390.method892(arg0, arg1, arg2);
                            }
                            var7.field5392 = var7.field5392.method892(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field531; var8++) {
                            class209 var9 = var6.field544[var8];
                            if (var9 != null && var9.field3287.method890()) {
                                class325.method2291(var9.field3287, var3, var4, var5, var9.field3289 + 1 - var9.field3283, var9.field3280 - var9.field3291 + 1);
                                var9.field3287 = var9.field3287.method892(arg0, arg1, arg2);
                            }
                        }
                        class184 var10 = var6.field537;
                        if (var10 != null && var10.field2968.method890()) {
                            class133.method1021(var10.field2968, var3, var4, var5);
                            var10.field2968 = var10.field2968.method892(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILth;II)[Lml;", line = 78)
    public static final class17[] method1415(int arg0, class57 arg1, int arg2, int arg3) {
        if (arg0 != -2623) {
            method1414(-82, 88, 66);
        }
        field2887++;
        return class315.method2233(arg2, (byte) 111, arg1, arg3) ? class173.method1357(arg0 ^ 0xFFFFF5C0) : null;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()I", line = 103)
    public final int method444() {
        field2900++;
        return this.field2906;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 113)
    public static void method1416(int arg0) {
        field2891 = null;
        if (arg0 != -28225) {
            field2895 = (int[]) null;
        }
        field2895 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lo;I)V", line = 124)
    private final void method1417(class96 arg0, int arg1) {
        if (class42.field607) {
            class337 var4 = (class337) arg0;
            if ((this.field2903 == null || this.field2903.field2485) && (var4.field5345 != null || var4.field5326 != null)) {
                this.field2903 = new class158(class332.field5261, 1, 1);
            }
            if (this.field2903 != null) {
                this.field2903.method1228(var4.field5345, var4.field5326, false, var4.field5344, var4.field5365, var4.field5332);
            }
        } else {
            class62 var3 = (class62) arg0;
            if ((this.field2903 == null || this.field2903.field2485) && (var3.field1047 != null || var3.field1035 != null)) {
                this.field2903 = new class158(class332.field5261, 1, 1);
            }
            if (this.field2903 != null) {
                this.field2903.method1228(var3.field1047, var3.field1035, false, var3.field1044, var3.field1042, var3.field1062);
            }
        }
        int var5 = -121 / ((arg1 - 51) / 52);
        this.field2917 = true;
        field2921++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z[[[Laa;IIII)Z", line = 164)
    public static final boolean method1418(boolean arg0, class36[][][] arg1, int arg2, int arg3, int arg4, int arg5) {
        field2912++;
        byte var6 = arg0 ? 1 : (byte) (class2.field14 & 0xFF);
        if (class274.field4541[class186.field2991][arg5][arg4] == var6) {
            return false;
        } else if ((class178.field2856[class186.field2991][arg5][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class52.field881[var7] = arg5;
            int var31 = var7 + 1;
            class204.field3224[var7] = arg4;
            if (arg2 >= -10) {
                field2895 = (int[]) null;
            }
            class274.field4541[class186.field2991][arg5][arg4] = var6;
            while (var31 != var8) {
                int var9 = class52.field881[var8] & 0xFFFF;
                int var10 = (class52.field881[var8] & 0xFFCC75) >> 16;
                int var11 = class52.field881[var8] >> 24 & 0xFF;
                int var12 = class204.field3224[var8] & 0xFFFF;
                int var13 = class204.field3224[var8] >> 16 & 0xFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class178.field2856[class186.field2991][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                label238: for (int var16 = class186.field2991 + 1; var16 <= 3; var16++) {
                    if ((class178.field2856[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg1[var16][var9][var12] != null) {
                            if (arg1[var16][var9][var12].field533 != null) {
                                int var17 = class195.method1508(19, var10);
                                if (arg1[var16][var9][var12].field533.field5395 == var17 || arg1[var16][var9][var12].field533.field5386 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class195.method1508(19, var11);
                                    if (arg1[var16][var9][var12].field533.field5395 == var18 || arg1[var16][var9][var12].field533.field5386 == var18) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var19 = class195.method1508(19, var13);
                                    if (arg1[var16][var9][var12].field533.field5395 == var19 || arg1[var16][var9][var12].field533.field5386 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var9][var12].field544 != null) {
                                for (int var20 = 0; var20 < arg1[var16][var9][var12].field531; var20++) {
                                    int var21 = (int) (arg1[var16][var9][var12].field544[var20].field3279 >> 20 & 0x3L);
                                    int var22 = (int) (arg1[var16][var9][var12].field544[var20].field3279 >> 14 & 0x3FL);
                                    if (var22 == 21) {
                                        var22 = 19;
                                    }
                                    int var23 = var22 | var21 << 6;
                                    if (var10 == var23 || var11 != 0 && var11 == var23 || var13 != 0 && var13 == var23) {
                                        continue label238;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class36 var24 = arg1[var16][var9][var12];
                        if (var24 != null && var24.field531 > 0) {
                            for (int var25 = 0; var25 < var24.field531; var25++) {
                                class209 var26 = var24.field544[var25];
                                if (var26.field3289 != var26.field3283 || var26.field3291 != var26.field3280) {
                                    for (int var27 = var26.field3283; var27 <= var26.field3289; var27++) {
                                        for (int var28 = var26.field3291; var28 <= var26.field3280; var28++) {
                                            class274.field4541[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class274.field4541[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    if (class298.field4777[arg3] < class101.field1656[class186.field2991 + 1][var9][var12]) {
                        class298.field4777[arg3] = class101.field1656[class186.field2991 + 1][var9][var12];
                    }
                    int var29 = var12 << 7;
                    int var30 = var9 << 7;
                    if (var30 < class319.field5080[arg3]) {
                        class319.field5080[arg3] = var30;
                    } else if (var30 > class21.field235[arg3]) {
                        class21.field235[arg3] = var30;
                    }
                    if (class210.field3305[arg3] > var29) {
                        class210.field3305[arg3] = var29;
                    } else if (class234.field3884[arg3] < var29) {
                        class234.field3884[arg3] = var29;
                    }
                }
                var8 = var8 + 1 & 0xFFF;
                if (!var14) {
                    if (var9 >= 1 && class274.field4541[class186.field2991][var9 - 1][var12] != var6) {
                        class52.field881[var31] = class75.method624(class75.method624(var9 - 1, 1179648), -754974720);
                        class204.field3224[var31] = class75.method624(1245184, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class274.field4541[class186.field2991][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var9 - 1 >= 0 && class274.field4541[class186.field2991][var9 - 1][var12] != var6 && (class178.field2856[class186.field2991][var9][var12] & 0x4) == 0 && (class178.field2856[class186.field2991][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class52.field881[var31] = class75.method624(class75.method624(1179648, var9 - 1), 1375731712);
                            class204.field3224[var31] = class75.method624(var12, 1245184);
                            class274.field4541[class186.field2991][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class274.field4541[class186.field2991][var9][var12] != var6) {
                            class52.field881[var31] = class75.method624(class75.method624(var9, 5373952), 318767104);
                            class204.field3224[var31] = class75.method624(5439488, var12);
                            class274.field4541[class186.field2991][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class274.field4541[class186.field2991][var9 + 1][var12] != var6 && (class178.field2856[class186.field2991][var9][var12] & 0x4) == 0 && (class178.field2856[class186.field2991][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class52.field881[var31] = class75.method624(-1845493760, class75.method624(5373952, var9 + 1));
                            class204.field3224[var31] = class75.method624(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class274.field4541[class186.field2991][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < 104 && class274.field4541[class186.field2991][var9 + 1][var12] != var6) {
                        class52.field881[var31] = class75.method624(class75.method624(var9 + 1, 9568256), 1392508928);
                        class204.field3224[var31] = class75.method624(var12, 9633792);
                        var31 = var31 + 1 & 0xFFF;
                        class274.field4541[class186.field2991][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class274.field4541[class186.field2991][var9 - 1][var12] != var6 && (class178.field2856[class186.field2991][var9][var12] & 0x4) == 0 && (class178.field2856[class186.field2991][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class52.field881[var31] = class75.method624(class75.method624(13762560, var9 - 1), 301989888);
                            class204.field3224[var31] = class75.method624(13828096, var12);
                            class274.field4541[class186.field2991][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class274.field4541[class186.field2991][var9][var12] != var6) {
                            class52.field881[var31] = class75.method624(-1828716544, class75.method624(13762560, var9));
                            class204.field3224[var31] = class75.method624(13828096, var12);
                            class274.field4541[class186.field2991][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class274.field4541[class186.field2991][var9 + 1][var12] != var6 && (class178.field2856[class186.field2991][var9][var12] & 0x4) == 0 && (class178.field2856[class186.field2991][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class52.field881[var31] = class75.method624(class75.method624(var9 + 1, 9568256), -771751936);
                            class204.field3224[var31] = class75.method624(9633792, var12);
                            class274.field4541[class186.field2991][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class298.field4777[arg3] != -1000000) {
                class298.field4777[arg3] += 10;
                class319.field5080[arg3] -= 50;
                class21.field235[arg3] += 50;
                class234.field3884[arg3] += 50;
                class210.field3305[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIB)V", line = 469)
    public final void method1419(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2890++;
        if (!this.field2911) {
            double var6 = (double) (arg0 - this.field2896);
            double var8 = (double) (arg3 - this.field2920);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2913 = (double) this.field2892 * var6 / var10 + (double) this.field2896;
            this.field2909 = (double) this.field2892 * var8 / var10 + (double) this.field2920;
            this.field2889 = (double) this.field2916;
        }
        double var12 = (double) (this.field2924 + 1 - arg1);
        this.field2885 = ((double) arg0 - this.field2913) / var12;
        this.field2897 = ((double) arg3 - this.field2909) / var12;
        this.field2907 = Math.sqrt(this.field2897 * this.field2897 + this.field2885 * this.field2885);
        if (arg4 <= 93) {
            this.field2914 = 93;
        }
        if (this.field2908 == -1) {
            this.field2919 = ((double) arg2 - this.field2889) / var12;
        } else {
            if (!this.field2911) {
                this.field2919 = -this.field2907 * Math.tan((double) this.field2908 * 0.02454369D);
            }
            this.field2899 = ((double) arg2 - this.field2889 - (this.field2919 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIII)V", line = 508)
    public static final void method1420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 > -41) {
            return;
        }
        field2884++;
        if (arg3 < 128 || arg0 < 128 || arg3 > 13056 || arg0 > 13056) {
            class247.field4047 = -1;
            class210.field3308 = -1;
            return;
        }
        int var9 = class271.method2034(-1, arg0, arg3, class186.field2991) - arg5;
        int var10 = class153.field2438[class194.field3095];
        int var11 = arg3 - class281.field4617;
        int var12 = var9 - class206.field3250;
        int var13 = class153.field2445[class194.field3095];
        int var14 = class153.field2438[class176.field2818];
        int var15 = arg0 - class229.field3807;
        int var16 = class153.field2445[class176.field2818];
        int var17 = var11 * var16 + var14 * var15 >> 16;
        int var18 = var15 * var16 - (var11 * var14) >> 16;
        int var20 = arg4 + var17;
        int var21 = var12 * var13 - (var10 * var18) >> 16;
        int var22 = var10 * var12 + var13 * var18 >> 16;
        if (var22 < 50) {
            class210.field3308 = -1;
            class247.field4047 = -1;
        } else if (class42.field607) {
            int var24 = arg6 * 512 >> 8;
            class210.field3308 = var20 * var24 / var22 + arg7;
            int var25 = arg8 * 512 >> 8;
            class247.field4047 = var21 * var25 / var22 + arg2;
        } else {
            class210.field3308 = (var20 << 9) / var22 + arg7;
            class247.field4047 = arg2 + ((var21 << 9) / var22);
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)V", line = 570)
    public final void method1421(int arg0, int arg1) {
        this.field2913 += (double) arg1 * this.field2885;
        if (this.field2908 == -1) {
            this.field2889 += (double) arg1 * this.field2919;
        } else {
            this.field2889 += this.field2899 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2919;
            this.field2919 += (double) arg1 * this.field2899;
        }
        field2886++;
        if (arg0 != -1) {
            method1415(-83, (class57) null, -102, -80);
        }
        this.field2909 += (double) arg1 * this.field2897;
        this.field2911 = true;
        this.field2925 = (int) (Math.atan2(this.field2885, this.field2897) * 325.949D) + 1024 & 0x7FF;
        this.field2910 = (int) (Math.atan2(this.field2919, this.field2907) * 325.949D) & 0x7FF;
        if (this.field2888 == null) {
            return;
        }
        this.field2893 += arg1;
        while (true) {
            do {
                do {
                    if (this.field2893 <= this.field2888.field651[this.field2915]) {
                        return;
                    }
                    this.field2893 -= this.field2888.field651[this.field2915];
                    this.field2915++;
                    if (this.field2915 >= this.field2888.field677.length) {
                        this.field2915 -= this.field2888.field661;
                        if (this.field2915 < 0 || this.field2888.field677.length <= this.field2915) {
                            this.field2915 = 0;
                        }
                    }
                    this.field2918 = this.field2915 + 1;
                } while (this.field2888.field677.length > this.field2918);
                this.field2918 -= this.field2888.field661;
            } while (this.field2918 >= 0 && this.field2888.field677.length > this.field2918);
            this.field2918 = -1;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 694)
    public class181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2908 = arg7;
        this.field2922 = arg10;
        this.field2914 = arg5;
        this.field2911 = false;
        this.field2916 = arg4;
        this.field2892 = arg8;
        this.field2920 = arg3;
        this.field2896 = arg2;
        this.field2923 = arg1;
        this.field2894 = arg0;
        this.field2924 = arg6;
        this.field2902 = arg9;
        int var12 = class282.method2071(this.field2894, 0).field1594;
        if (var12 == -1) {
            this.field2888 = null;
        } else {
            this.field2888 = class198.method1524(var12, -62);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2895[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)I", line = 663)
    public static final int method1422(int arg0, int arg1, int arg2, int arg3) {
        field2905++;
        if (arg0 != 15463) {
            return 106;
        }
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        return (arg2 >> 5 << 7) + ((arg3 >> 2 << 10) + (arg1 >> 1));
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)Lo;", line = 721)
    private final class96 method1423(byte arg0) {
        field2898++;
        if (arg0 > -35) {
            method1418(false, (class36[][][]) ((class36[][][]) null), 31, -48, -121, -105);
        }
        class94 var2 = class282.method2071(this.field2894, 0);
        class96 var3 = var2.method732(this.field2893, (byte) 80, this.field2915, this.field2918);
        if (var3 == null) {
            return null;
        } else {
            var3.method531(this.field2910);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIJILdc;)V", line = 742)
    public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class158 arg10) {
        field2901++;
        class96 var13 = this.method1423((byte) -82);
        if (var13 != null) {
            this.method1417(var13, -110);
            var13.method440(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2903);
            this.field2906 = var13.method444();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V", line = 761)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2904++;
        if (!this.field2917) {
            class96 var6 = this.method1423((byte) -79);
            if (var6 == null) {
                return;
            }
            this.method1417(var6, -36);
        }
        if (this.field2903 != null) {
            this.field2903.method1230(arg0, arg1, arg3, arg2, arg4);
        }
    }
}
