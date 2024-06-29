import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class189 extends class1 {

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "Loc;")
    public static class151 field3347 = class137.method873(2, "<col=ff0000>");

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "Loc;")
    public static class151 field3349 = class137.method873(2, "leuchten2:");

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!sa", name = "ob", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!sa", name = "pb", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!sa", name = "qb", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!sa", name = "rb", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!sa", name = "sb", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "Ljava/awt/Frame;")
    public static Frame field3348;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "[I")
    public static int[] field3346;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLsd;IIIB)V")
    public static final void method1168(boolean arg0, class192 arg1, int arg2, int arg3, int arg4, byte arg5) {
        class45.field937 = arg2;
        class187.field3323 = arg4;
        class78.field1513 = arg0;
        class218.field3799 = 1;
        if (arg5 >= -42) {
            field3348 = null;
        }
        class16.field387 = 10000;
        ++field3345;
        class68.field1331 = arg1;
        class227.field3967 = arg3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3351;
        if (~arg2 == ~arg7) {
            class117.method717(arg2, arg6, arg5, arg0, arg4, arg1, 2000);
        } else {
            if (class79.field1526 <= -arg2 + arg4 && ~(arg4 - -arg2) >= ~class25.field524 && class233.field4281 <= -arg7 + arg6 && arg6 - -arg7 <= class154.field2793) {
                class107.method642(arg1, arg4, (byte) -104, arg5, arg6, arg0, arg7, arg2);
            } else {
                class123.method744(arg4, 771989793, arg5, arg7, arg6, arg0, arg2, arg1);
            }
            if (arg3 != -1) {
                field3349 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
    public static void method1170(boolean arg0) {
        field3346 = null;
        field3349 = null;
        field3347 = null;
        if (arg0) {
            method1176(29, 126, 36, -101, (byte) -75, 0, -126);
        }
        field3348 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field3350;
        int[] var3 = super.field21.method1182(arg1, arg0 + -31816);
        if (super.field21.field3388) {
            int var4 = class23.field509[arg1];
            for (int var5 = 0; var5 < class202.field3603; ++var5) {
                var3[var5] = this.method1175(var4, class195.field3477[var5], true) % 4096;
            }
        }
        if (arg0 != 107) {
            field3346 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BII)I")
    public static final int method1171(byte arg0, int arg1, int arg2) {
        ++field3354;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        if (arg0 < 23) {
            method1171((byte) -5, -114, -47);
        }
        return (134067987 & var5) >> 19;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method1172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class168 var8 = new class168();
        var8.field3056 = arg2 / 128;
        var8.field3058 = arg3 / 128;
        var8.field3059 = arg4 / 128;
        var8.field3048 = arg5 / 128;
        var8.field3050 = arg1;
        var8.field3047 = arg2;
        var8.field3070 = arg3;
        var8.field3060 = arg4;
        var8.field3057 = arg5;
        var8.field3053 = arg6;
        var8.field3072 = arg7;
        class166.field3023[arg0][class166.field3006[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
    public static final void method1173() {
        int var0 = class166.field3006[class132.field2419];
        class168[] var1 = class166.field3023[class132.field2419];
        class234.field4301 = 0;
        for (int var2 = 0; var2 < var0; ++var2) {
            class168 var3 = var1[var2];
            if (var3.field3050 == 1) {
                int var4 = var3.field3056 - class66.field1271 + class27.field573;
                if (var4 >= 0 && var4 <= class27.field573 + class27.field573) {
                    int var5 = var3.field3059 - class36.field736 + class27.field573;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = var3.field3048 - class36.field736 + class27.field573;
                    if (var6 > class27.field573 + class27.field573) {
                        var6 = class27.field573 + class27.field573;
                    }
                    boolean var7 = false;
                    while (var5 <= var6) {
                        if (class205.field3637[var4][var5++]) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var7) {
                        int var8 = class1.field42 - var3.field3047;
                        if (var8 > 32) {
                            var3.field3063 = 1;
                        } else {
                            if (var8 >= -32) {
                                continue;
                            }
                            var3.field3063 = 2;
                            var8 = -var8;
                        }
                        var3.field3052 = (var3.field3060 - class73.field1426 << 8) / var8;
                        var3.field3051 = (var3.field3057 - class73.field1426 << 8) / var8;
                        var3.field3065 = (var3.field3053 - class116.field2084 << 8) / var8;
                        var3.field3055 = (var3.field3072 - class116.field2084 << 8) / var8;
                        class95.field1777[class234.field4301++] = var3;
                    }
                }
            } else if (var3.field3050 == 2) {
                int var9 = var3.field3059 - class36.field736 + class27.field573;
                if (var9 >= 0 && var9 <= class27.field573 + class27.field573) {
                    int var10 = var3.field3056 - class66.field1271 + class27.field573;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var11 = var3.field3058 - class66.field1271 + class27.field573;
                    if (var11 > class27.field573 + class27.field573) {
                        var11 = class27.field573 + class27.field573;
                    }
                    boolean var12 = false;
                    while (var10 <= var11) {
                        if (class205.field3637[var10++][var9]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var12) {
                        int var13 = class73.field1426 - var3.field3060;
                        if (var13 > 32) {
                            var3.field3063 = 3;
                        } else {
                            if (var13 >= -32) {
                                continue;
                            }
                            var3.field3063 = 4;
                            var13 = -var13;
                        }
                        var3.field3062 = (var3.field3047 - class1.field42 << 8) / var13;
                        var3.field3054 = (var3.field3070 - class1.field42 << 8) / var13;
                        var3.field3065 = (var3.field3053 - class116.field2084 << 8) / var13;
                        var3.field3055 = (var3.field3072 - class116.field2084 << 8) / var13;
                        class95.field1777[class234.field4301++] = var3;
                    }
                }
            } else if (var3.field3050 == 4) {
                int var14 = var3.field3053 - class116.field2084;
                if (var14 > 128) {
                    int var15 = var3.field3059 - class36.field736 + class27.field573;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = var3.field3048 - class36.field736 + class27.field573;
                    if (var16 > class27.field573 + class27.field573) {
                        var16 = class27.field573 + class27.field573;
                    }
                    if (var15 <= var16) {
                        int var17 = var3.field3056 - class66.field1271 + class27.field573;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = var3.field3058 - class66.field1271 + class27.field573;
                        if (var18 > class27.field573 + class27.field573) {
                            var18 = class27.field573 + class27.field573;
                        }
                        boolean var19 = false;
                        label145: for (int var20 = var17; var20 <= var18; ++var20) {
                            for (int var21 = var15; var21 <= var16; ++var21) {
                                if (class205.field3637[var20][var21]) {
                                    var19 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var19) {
                            var3.field3063 = 5;
                            var3.field3062 = (var3.field3047 - class1.field42 << 8) / var14;
                            var3.field3054 = (var3.field3070 - class1.field42 << 8) / var14;
                            var3.field3052 = (var3.field3060 - class73.field1426 << 8) / var14;
                            var3.field3051 = (var3.field3057 - class73.field1426 << 8) / var14;
                            class95.field1777[class234.field4301++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)V")
    public static final void method1174(boolean arg0) {
        ++field3352;
        if (arg0) {
            field3349 = null;
        }
        while (~class1.field34.method647((byte) 0, class68.field1329) <= -12) {
            int var1 = class1.field34.method645(11, (byte) 10);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class179.field3229[var1] == null) {
                var2 = true;
                class179.field3229[var1] = new class20();
                if (class2.field43[var1] != null) {
                    class179.field3229[var1].method171(121, class2.field43[var1]);
                }
            }
            class159.field2866[class47.field961++] = var1;
            class20 var3 = class179.field3229[var1];
            var3.field4028 = class200.field3541;
            int var4 = class1.field34.method645(5, (byte) 10);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class163.field2953[class1.field34.method645(3, (byte) 10)];
            if (var2) {
                var3.field4017 = var3.field4024 = var5;
            }
            int var6 = class1.field34.method645(1, (byte) 10);
            if (~var6 == -2) {
                class218.field3800[class111.field1956++] = var1;
            }
            int var7 = class1.field34.method645(1, (byte) 10);
            int var8 = class1.field34.method645(5, (byte) 10);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1427(class228.field3975.field3978[0] - -var4, ~var7 == -2, (byte) 92, class228.field3975.field4031[0] + var8);
        }
        class1.field34.method644(0);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZ)I")
    private final int method1175(int arg0, int arg1, boolean arg2) {
        ++field3353;
        int var4 = arg0 * 57 + arg1;
        if (!arg2) {
            field3348 = null;
        }
        int var5 = var4 << 1 ^ var4;
        return 4096 - (Integer.MAX_VALUE & (var5 * var5 * 15731 - -789221) * var5 + 1376312589) / 262144;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1176(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class169.method1094(-1, arg2);
        ++field3355;
        int var7 = 0;
        int var8 = arg2;
        int var9 = arg2 - arg1;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = -arg2;
        if (arg4 != -1) {
            field3348 = null;
        }
        int var11 = var9;
        int var12 = -1;
        int var13 = -var9;
        if (class233.field4281 <= arg0 && class154.field2793 >= arg0) {
            int[] var14 = class43.field887[arg0];
            int var15 = class116.method704(class25.field524, arg6 - arg2, 27104, class79.field1526);
            int var16 = class116.method704(class25.field524, arg6 - -arg2, 27104, class79.field1526);
            int var17 = class116.method704(class25.field524, -var9 + arg6, 27104, class79.field1526);
            int var18 = class116.method704(class25.field524, arg6 + var9, 27104, class79.field1526);
            class55.method380(arg3, 123, var14, var17, var15);
            class55.method380(arg5, 119, var14, var18, var17);
            class55.method380(arg3, 126, var14, var16, var18);
        }
        int var19 = -1;
        while (var8 > var7) {
            var12 += 2;
            var19 += 2;
            var13 += var19;
            if (~var13 <= -1 && var11 >= 1) {
                --var11;
                class106.field1888[var11] = var7;
                var13 -= var11 << 1;
            }
            ++var7;
            var10 += var12;
            if (~var10 <= -1) {
                --var8;
                var10 -= var8 << 1;
                int var20 = arg0 - var8;
                int var21 = arg0 + var8;
                if (var21 >= class233.field4281 && var20 <= class154.field2793) {
                    if (~var9 >= ~var8) {
                        int var22 = class116.method704(class25.field524, arg6 - -var7, 27104, class79.field1526);
                        int var23 = class116.method704(class25.field524, -var7 + arg6, arg4 + 27105, class79.field1526);
                        if (var21 <= class154.field2793) {
                            class55.method380(arg3, 113, class43.field887[var21], var22, var23);
                        }
                        if (var20 >= class233.field4281) {
                            class55.method380(arg3, 122, class43.field887[var20], var22, var23);
                        }
                    } else {
                        int var24 = class106.field1888[var8];
                        int var25 = class116.method704(class25.field524, arg6 + var7, 27104, class79.field1526);
                        int var26 = class116.method704(class25.field524, arg6 - var7, 27104, class79.field1526);
                        int var27 = class116.method704(class25.field524, arg6 + var24, 27104, class79.field1526);
                        int var28 = class116.method704(class25.field524, -var24 + arg6, 27104, class79.field1526);
                        if (class154.field2793 >= var21) {
                            int[] var29 = class43.field887[var21];
                            class55.method380(arg3, 123, var29, var28, var26);
                            class55.method380(arg5, arg4 ^ -124, var29, var27, var28);
                            class55.method380(arg3, 113, var29, var25, var27);
                        }
                        if (~class233.field4281 >= ~var20) {
                            int[] var30 = class43.field887[var20];
                            class55.method380(arg3, 111, var30, var28, var26);
                            class55.method380(arg5, arg4 ^ -123, var30, var27, var28);
                            class55.method380(arg3, 106, var30, var25, var27);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (~var32 <= ~class233.field4281 && class154.field2793 >= var31) {
                int var33 = arg6 - -var8;
                int var34 = -var8 + arg6;
                if (~var33 <= ~class79.field1526 && class25.field524 >= var34) {
                    int var35 = class116.method704(class25.field524, var33, 27104, class79.field1526);
                    int var36 = class116.method704(class25.field524, var34, 27104, class79.field1526);
                    if (~var7 <= ~var9) {
                        if (~var32 >= ~class154.field2793) {
                            class55.method380(arg3, 118, class43.field887[var32], var35, var36);
                        }
                        if (~var31 <= ~class233.field4281) {
                            class55.method380(arg3, 123, class43.field887[var31], var35, var36);
                        }
                    } else {
                        int var37 = ~var7 >= ~var11 ? var11 : class106.field1888[var7];
                        int var38 = class116.method704(class25.field524, arg6 - -var37, 27104, class79.field1526);
                        int var39 = class116.method704(class25.field524, -var37 + arg6, arg4 ^ -27105, class79.field1526);
                        if (class154.field2793 >= var32) {
                            int[] var40 = class43.field887[var32];
                            class55.method380(arg3, 115, var40, var39, var36);
                            class55.method380(arg5, 124, var40, var38, var39);
                            class55.method380(arg3, 117, var40, var35, var38);
                        }
                        if (var31 >= class233.field4281) {
                            int[] var41 = class43.field887[var31];
                            class55.method380(arg3, 108, var41, var39, var36);
                            class55.method380(arg5, arg4 ^ -118, var41, var38, var39);
                            class55.method380(arg3, arg4 ^ -114, var41, var35, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILsd;B)Ll;")
    public static final class118 method1177(int arg0, class192 arg1, byte arg2) {
        ++field3356;
        if (arg2 != -10) {
            method1176(45, -61, -78, 6, (byte) 18, -1, 15);
        }
        byte[] var3 = arg1.method1200((byte) 91, arg0);
        return var3 == null ? null : new class118(var3);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class189() {
        super(0, true);
    }
}
