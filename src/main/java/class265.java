import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class265 extends class147 {

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "Lna;")
    public static class26 field4341 = class69.method505("lila:", (byte) -126);

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "Lna;")
    public static class26 field4346 = class69.method505("Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3", (byte) -128);

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "Lna;")
    public static class26 field4351 = class69.method505("rot:", (byte) -128);

    @OriginalMember(owner = "client!cn", name = "J", descriptor = "Lna;")
    private static class26 field4357 = class69.method505("Starting 3d Library", (byte) -123);

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
    public static int field4350 = 1;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "Lna;")
    public static class26 field4339 = field4357;

    @OriginalMember(owner = "client!cn", name = "L", descriptor = "I")
    public static int field4359 = 0;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public int field4338;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public int field4340;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public int field4342;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    public int field4343;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public int field4344;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    public int field4345;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    public int field4352;

    @OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
    public int field4353;

    @OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!cn", name = "H", descriptor = "I")
    public int field4355;

    @OriginalMember(owner = "client!cn", name = "I", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!cn", name = "K", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!cn", name = "M", descriptor = "I")
    public int field4360;

    @OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!cn", name = "O", descriptor = "I")
    public int field4362;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BIIIIIIII)V", line = 16)
    public static final void method1862(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4356++;
        if (arg0 >= -47) {
            return;
        }
        for (int var9 = 0; var9 < class298.field5133.field165; var9++) {
            if (class298.field5133.method74(var9, (byte) -124)) {
                int var10 = class298.field5133.field173[var9] - class135.field2057;
                int var11 = class9.field111 - (class298.field5133.field160[var9] + 1 - class317.field5436);
                int var12 = (var10 - arg3) * (arg4 - arg1) / (arg7 - arg3) + arg1;
                int var13 = class298.field5133.method78(var9, 8);
                int var14 = (var11 - arg6) * (arg8 - arg2) / (arg5 - arg6) + arg2;
                int var15 = 16777215;
                class242 var16 = null;
                if (var13 == 0) {
                    if ((double) class229.field3640 == 3.0D) {
                        var16 = class51.field796;
                    }
                    if ((double) class229.field3640 == 4.0D) {
                        var16 = class285.field4786;
                    }
                    if ((double) class229.field3640 == 6.0D) {
                        var16 = class67.field1054;
                    }
                    if ((double) class229.field3640 >= 8.0D) {
                        var16 = class36.field584;
                    }
                }
                if (var13 == 1) {
                    if ((double) class229.field3640 == 3.0D) {
                        var16 = class67.field1054;
                    }
                    if ((double) class229.field3640 == 4.0D) {
                        var16 = class36.field584;
                    }
                    if ((double) class229.field3640 == 6.0D) {
                        var16 = class298.field5136;
                    }
                    if ((double) class229.field3640 >= 8.0D) {
                        var16 = class36.field599;
                    }
                }
                if (var13 == 2) {
                    if ((double) class229.field3640 == 3.0D) {
                        var16 = class298.field5136;
                    }
                    var15 = 16755200;
                    if ((double) class229.field3640 == 4.0D) {
                        var16 = class36.field599;
                    }
                    if ((double) class229.field3640 == 6.0D) {
                        var16 = class154.field2410;
                    }
                    if ((double) class229.field3640 >= 8.0D) {
                        var16 = class228.field3606;
                    }
                }
                if (class298.field5133.field170[var9] != -1) {
                    var15 = class298.field5133.field170[var9];
                }
                if (var16 != null) {
                    int var17 = class283.field4723.method1208(class298.field5133.field166[var9], (int[]) null, class151.field2355);
                    int var18 = var14 - var16.method1667() * (var17 - 1) / 2;
                    int var19 = var18 + var16.method1675() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        class26 var21 = class151.field2355[var20];
                        if (var17 - 1 > var20) {
                            var21.method184(var21.method171(-101) - 4, false);
                        }
                        var16.method1672(var21, var12, var19, var15, true);
                        var19 += var16.method1667();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BB)V", line = 135)
    public static final void method1863(byte arg0, byte arg1) {
        field4358++;
        if (class170.field2662 == null) {
            class170.field2662 = new byte[4][104][104];
        }
        if (arg1 != 55) {
            field4359 = -87;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class170.field2662[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(B)V", line = 176)
    public static void method1864(byte arg0) {
        field4346 = null;
        field4351 = null;
        field4357 = null;
        field4339 = null;
        field4341 = null;
        int var1 = -100 % ((arg0 + 43) / 46);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIIIII)V", line = 189)
    public static final void method1865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4349++;
        if (arg0 != 3) {
            method1868((byte) -26);
        }
        if (arg8 == arg9 && arg3 == arg7 && arg4 == arg5 && arg1 == arg6) {
            class86.method677((byte) 84, arg2, arg6, arg7, arg5, arg9);
            return;
        }
        int var10 = arg7;
        int var11 = arg9;
        int var12 = arg9 * 3;
        int var13 = arg7 * 3;
        int var14 = arg8 * 3;
        int var15 = arg3 * 3;
        int var16 = arg4 * 3;
        int var17 = arg1 * 3;
        int var18 = var14 + arg5 - arg9 - var16;
        int var19 = arg6 - arg7 - (-var15 + var17);
        int var20 = var12 + var16 - var14 - var14;
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var19 * var26;
            int var28 = var20 * var25;
            int var29 = var18 * var26;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var29 + var28 + var31 >> 12) + arg9;
            int var34 = (var27 + var32 + var30 >> 12) + arg7;
            class86.method677((byte) -119, arg2, var34, var10, var33, var11);
            var11 = var33;
            var10 = var34;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZI)I", line = 266)
    public static final int method1866(boolean arg0, int arg1) {
        long var2 = class128.method869((byte) -55);
        if (arg1 != -1) {
            method1867(false, 11);
        }
        field4348++;
        for (class116 var4 = arg0 ? (class116) class4.field32.method1823(arg1 + 56) : (class116) class4.field32.method1825(-123); var4 != null; var4 = (class116) class4.field32.method1825(-64)) {
            if ((var4.field1830 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field1830 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2293;
                    class205.field3201[var5] = class117.field1835[var5];
                    var4.method1006(-1024);
                    return var5;
                }
                var4.method1006(arg1 ^ 0x3FF);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(ZI)V", line = 310)
    public static final void method1867(boolean arg0, int arg1) {
        int var2 = class80.field1261;
        if (class13.field221.field3962 >> 7 == class64.field1020 && (class13.field221.field3972 >> 7) == class7.field84) {
            class64.field1020 = 0;
        }
        if (arg0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class159 var4;
            if (arg0) {
                var4 = class13.field221;
            } else {
                var4 = class268.field4427[class95.field1550[var3]];
            }
            if (var4 != null && var4.method1082((byte) 17)) {
                int var5 = var4.method1078((byte) 114);
                if (var5 == 1) {
                    if ((var4.field3962 & 0x7F) == 64 && (var4.field3972 & 0x7F) == 64) {
                        int var6 = var4.field3962 >> 7;
                        int var7 = var4.field3972 >> 7;
                        if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                            var10002 = class139.field2127[var6][var7]++;
                        }
                    }
                } else if (((var5 & 0x1) != 0 || (var4.field3962 & 0x7F) == 0 && (var4.field3972 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field3962 & 0x7F) == 64 && (var4.field3972 & 0x7F) == 64)) {
                    int var8 = var4.field3962 - (var5 * 64) >> 7;
                    int var9 = var4.field3972 - (var5 * 64) >> 7;
                    int var10 = var4.method1078((byte) 114) + var8;
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var11 = var9 + var4.method1078((byte) 114);
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var11 > 104) {
                        var11 = 104;
                    }
                    for (int var12 = var8; var12 < var10; var12++) {
                        for (int var13 = var9; var13 < var11; var13++) {
                            var10002 = class139.field2127[var12][var13]++;
                        }
                    }
                }
            }
        }
        if (arg1 != 670232012) {
            return;
        }
        label224: for (int var14 = 0; var14 < var2; var14++) {
            class159 var15;
            long var16;
            if (arg0) {
                var15 = class13.field221;
                var16 = 8791798054912L;
            } else {
                var15 = class268.field4427[class95.field1550[var14]];
                var16 = (long) class95.field1550[var14] << 32;
            }
            if (var15 != null && var15.method1082((byte) 17)) {
                var15.field2497 = false;
                if ((class297.field5041 && class80.field1261 > 200 || class80.field1261 > 50) && !arg0 && var15.field3901 == var15.method1656(false).field3751) {
                    var15.field2497 = true;
                }
                int var18 = var15.method1078((byte) 114);
                if (var18 == 1) {
                    if ((var15.field3962 & 0x7F) == 64 && (var15.field3972 & 0x7F) == 64) {
                        int var19 = var15.field3962 >> 7;
                        int var20 = var15.field3972 >> 7;
                        if (var19 < 0 || var19 >= 104 || var20 < 0 || var20 >= 104) {
                            continue;
                        }
                        if (class139.field2127[var19][var20] > 1) {
                            var10002 = class139.field2127[var19][var20]--;
                            continue;
                        }
                    }
                } else if ((var18 & 0x1) == 0 && (var15.field3962 & 0x7F) == 0 && (var15.field3972 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var15.field3962 & 0x7F) == 64 && (var15.field3972 & 0x7F) == 0) {
                    int var21 = var15.field3962 - (var18 * 64) >> 7;
                    int var22 = var18 + var21;
                    int var23 = var15.field3972 - (var18 * 64) >> 7;
                    if (var22 > 104) {
                        var22 = 104;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    int var24 = var18 + var23;
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    boolean var25 = true;
                    if (var24 > 104) {
                        var24 = 104;
                    }
                    for (int var26 = var21; var26 < var22; var26++) {
                        for (int var27 = var23; var27 < var24; var27++) {
                            if (class139.field2127[var26][var27] <= 1) {
                                var25 = false;
                                break;
                            }
                        }
                    }
                    if (var25) {
                        int var28 = var21;
                        while (true) {
                            if (var28 >= var22) {
                                continue label224;
                            }
                            for (int var29 = var23; var29 < var24; var29++) {
                                var10002 = class139.field2127[var28][var29]--;
                            }
                            var28++;
                        }
                    }
                }
                if (var15.field3933 == null || class229.field3626 < var15.field3935 || var15.field3915 <= class229.field3626) {
                    var15.field3975 = class17.method118(class279.field4651, 1, var15.field3962, var15.field3972);
                    class318.method2207(class279.field4651, var15.field3962, var15.field3972, var15.field3975, (var18 - 1) * 64 + 60, var15, var15.field3922, var16, var15.field3951);
                } else {
                    var15.field2497 = false;
                    var15.field3975 = class17.method118(class279.field4651, 1, var15.field3962, var15.field3972);
                    class230.method1551(class279.field4651, var15.field3962, var15.field3972, var15.field3975, var15, var15.field3922, var16, var15.field3925, var15.field3914, var15.field3961, var15.field3960);
                }
            }
        }
        field4347++;
    }

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "(B)V", line = 579)
    public static final void method1868(byte arg0) {
        if (class118.field1860 < 0) {
            class18.field253 = -1;
            class118.field1860 = 0;
            class165.field2566 = -1;
        }
        field4354++;
        if (class118.field1860 > class38.field623) {
            class18.field253 = -1;
            class118.field1860 = class38.field623;
            class165.field2566 = -1;
        }
        if (arg0 != 87) {
            field4357 = (class26) null;
        }
        if (class69.field1069 < 0) {
            class165.field2566 = -1;
            class18.field253 = -1;
            class69.field1069 = 0;
        }
        if (class317.field5436 < class69.field1069) {
            class69.field1069 = class317.field5436;
            class18.field253 = -1;
            class165.field2566 = -1;
        }
    }
}
