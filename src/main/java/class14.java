import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class class14 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Z")
    public static boolean field157 = true;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Ljh;")
    public static class124 field159;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Lak;")
    public static class172 field164;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lea;")
    public static class333 field156;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Lbf;")
    public static class58 field161;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Lbf;")
    public static class58 field162;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field165;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V", line = 10)
    public static void method79(boolean arg0) {
        field164 = null;
        field165 = null;
        field161 = null;
        if (!arg0) {
            method79(true);
        }
        field162 = null;
        field159 = null;
        field156 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILvg;Lvg;)V", line = 30)
    public static final void method81(int arg0, class8 arg1, class8 arg2) {
        if (arg1.field115 != null) {
            arg1.method42((byte) -71);
        }
        field160++;
        if (arg0 == -20573) {
            arg1.field115 = arg2;
            arg1.field114 = arg2.field114;
            arg1.field115.field114 = arg1;
            arg1.field114.field115 = arg1;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V", line = 50)
    public static final void method82(byte arg0) {
        if (arg0 != 66) {
            method83(7, -112, -83, 21, (class157) null);
        }
        field163++;
        class23 var1 = class29.field396;
        synchronized (class29.field396) {
            class53.field753 = class159.field2635;
            class298.field4703++;
            if (class182.field3026 >= 0) {
                while (class182.field3026 != class15.field173) {
                    int var2 = client.field1675[class15.field173];
                    class15.field173 = class15.field173 + 1 & 0x7F;
                    if (var2 < 0) {
                        class117.field1770[~var2] = false;
                    } else {
                        class117.field1770[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class117.field1770[var3] = false;
                }
                class182.field3026 = class15.field173;
            }
            class159.field2635 = class194.field3182;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIILog;)V", line = 92)
    public static final void method83(int arg0, int arg1, int arg2, int arg3, class157 arg4) {
        class76.method516((byte) -51);
        field158++;
        if (arg3 != -1) {
            return;
        }
        if (class232.field3690) {
            class75.method506(arg2, arg1, arg4.field2468 + arg2, arg1 - -arg4.field2520);
        } else {
            class59.method389(arg2, arg1, arg4.field2468 + arg2, arg4.field2520 + arg1);
        }
        if (client.field1658 != 2 && client.field1658 != 5 && class327.field5064 != null) {
            int var5 = (int) class330.field5090 + class69.field983 & 0x7FF;
            int var6 = 464 - (class191.field3129.field4264 / 32);
            int var7 = class191.field3129.field4255 / 32 + 48;
            if (class232.field3690) {
                ((class314) class327.field5064).method2207(arg2, arg1, arg4.field2468, arg4.field2520, var7, var6, var5, class320.field4963 + 256, (class314) arg4.method1130(113, false));
            } else {
                ((class220) class327.field5064).method1572(arg2, arg1, arg4.field2468, arg4.field2520, var7, var6, var5, class320.field4963 + 256, arg4.field2502, arg4.field2582);
            }
            if (class298.field4698 != null) {
                for (int var8 = 0; var8 < class298.field4698.field3270; var8++) {
                    if (class298.field4698.method1468(false, var8)) {
                        int var9 = ((class298.field4698.field3269[var8] >> 14 & 0x3FFF) - class70.field989) * 4 + 2 - (class191.field3129.field4255 / 32);
                        int var10 = ((class298.field4698.field3269[var8] & 0x3FFF) - class205.field3367) * 4 + 2 - (class191.field3129.field4264 / 32);
                        int var11 = class170.field2801[var5];
                        int var12 = var11 * 256 / (class320.field4963 + 256);
                        int var13 = class170.field2810[var5];
                        class251 var14 = class2.field30;
                        int var15 = var13 * 256 / (class320.field4963 + 256);
                        if (class298.field4698.method1467(var8, true) == 1) {
                            var14 = class296.field4688;
                        }
                        int var16 = var9 * var15 + var10 * var12 >> 16;
                        if (class298.field4698.method1467(var8, true) == 2) {
                            var14 = class282.field4538;
                        }
                        int var17 = var10 * var15 - (var9 * var12) >> 16;
                        int var18 = var14.method1807(class298.field4698.field3262[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if (-arg4.field2468 <= var19 && arg4.field2468 >= var19 && (-arg4.field2520) <= var17 && var17 <= arg4.field2520) {
                            int var20 = 16777215;
                            if (class298.field4698.field3261[var8] != -1) {
                                var20 = class298.field4698.field3261[var8];
                            }
                            if (class232.field3690) {
                                class75.method504((class314) arg4.method1130(126, false));
                            } else {
                                class59.method402(arg4.field2502, arg4.field2582);
                            }
                            var14.method1795(class298.field4698.field3262[var8], var19 + arg2 + (arg4.field2468 / 2), arg1 - -(arg4.field2520 / 2) - var17, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class232.field3690) {
                                class75.method503();
                            } else {
                                class59.method395();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class18.field249; var21++) {
                int var22 = class169.field2800[var21] * 4 + 2 - (class191.field3129.field4255 / 32);
                int var23 = class285.field4576[var21] * 4 + 2 - (class191.field3129.field4264 / 32);
                class97 var24 = class69.method454(false, class235.field3763[var21]);
                if (var24.field1387 != null) {
                    var24 = var24.method656((byte) 7);
                    if (var24 == null || var24.field1319 == -1) {
                        continue;
                    }
                }
                class103.method711(var22, 2047, var23, arg4, arg2, class320.field4970[var24.field1319], arg1);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class169 var27 = class108.field1593[class49.field698][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class191.field3129.field4255 / 32);
                        int var29 = var26 * 4 + 2 - (class191.field3129.field4264 / 32);
                        class103.method711(var28, 2047, var29, arg4, arg2, class263.field4182[0], arg1);
                    }
                }
            }
            for (int var30 = 0; var30 < class233.field3736; var30++) {
                class234 var31 = class99.field1445[class142.field2225[var30]];
                if (var31 != null && var31.method1695(arg3 ^ 0xFFFF8E65)) {
                    class256 var32 = var31.field3752;
                    if (var32 != null && var32.field4080 != null) {
                        var32 = var32.method1843(-1);
                    }
                    if (var32 != null && var32.field4121 && var32.field4073) {
                        int var33 = var31.field4264 / 32 - class191.field3129.field4264 / 32;
                        int var34 = var31.field4255 / 32 - class191.field3129.field4255 / 32;
                        if (var32.field4079 == -1) {
                            class103.method711(var34, arg3 ^ 0xFFFFF800, var33, arg4, arg2, class263.field4182[1], arg1);
                        } else {
                            class103.method711(var34, 2047, var33, arg4, arg2, class320.field4970[var32.field4079], arg1);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class275.field4435; var35++) {
                class334 var36 = class74.field1049[class160.field2656[var35]];
                if (var36 != null && var36.method1695(29082)) {
                    int var37 = var36.field4255 / 32 - class191.field3129.field4255 / 32;
                    boolean var38 = false;
                    int var39 = var36.field4264 / 32 - (class191.field3129.field4264 / 32);
                    long var40 = class204.method1491(-26916, var36.field5216);
                    for (int var42 = 0; var42 < class61.field875; var42++) {
                        if (class105.field1550[var42] == var40 && class58.field824[var42] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class84.field1175; var44++) {
                        if (class340.field5291[var44].field2744 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class191.field3129.field5214 != 0 && var36.field5214 != 0 && class191.field3129.field5214 == var36.field5214) {
                        var45 = true;
                    }
                    if (var38) {
                        class103.method711(var37, arg3 + 2048, var39, arg4, arg2, class263.field4182[3], arg1);
                    } else if (var43) {
                        class103.method711(var37, 2047, var39, arg4, arg2, class263.field4182[5], arg1);
                    } else if (var45) {
                        class103.method711(var37, 2047, var39, arg4, arg2, class263.field4182[4], arg1);
                    } else {
                        class103.method711(var37, 2047, var39, arg4, arg2, class263.field4182[2], arg1);
                    }
                }
            }
            class193[] var46 = class175.field2895;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class193 var48 = var46[var47];
                if (var48 != null && var48.field3156 != 0 && class240.field3818 % 20 < 10) {
                    if (var48.field3156 == 1 && var48.field3162 >= 0 && class99.field1445.length > var48.field3162) {
                        class234 var49 = class99.field1445[var48.field3162];
                        if (var49 != null) {
                            int var50 = var49.field4264 / 32 - (class191.field3129.field4264 / 32);
                            int var51 = var49.field4255 / 32 - (class191.field3129.field4255 / 32);
                            class175.method1314(10475, arg1, var50, var51, var48.field3152, 360000, arg4, arg2);
                        }
                    }
                    if (var48.field3156 == 2) {
                        int var52 = (var48.field3161 - class70.field989) * 4 + 2 - (class191.field3129.field4255 / 32);
                        int var53 = (var48.field3145 - class205.field3367) * 4 + 2 - (class191.field3129.field4264 / 32);
                        int var54 = var48.field3164 * 4;
                        int var55 = var54 * var54;
                        class175.method1314(10475, arg1, var53, var52, var48.field3152, var55, arg4, arg2);
                    }
                    if (var48.field3156 == 10 && var48.field3162 >= 0 && class74.field1049.length > var48.field3162) {
                        class334 var56 = class74.field1049[var48.field3162];
                        if (var56 != null) {
                            int var57 = var56.field4255 / 32 - (class191.field3129.field4255 / 32);
                            int var58 = var56.field4264 / 32 - (class191.field3129.field4264 / 32);
                            class175.method1314(10475, arg1, var58, var57, var48.field3152, 360000, arg4, arg2);
                        }
                    }
                }
            }
            if (class256.field4110 != 0) {
                int var59 = class256.field4110 * 4 + (2 - class191.field3129.field4255 / 32) + ((class191.field3129.method1881(-20395) + -1) * 2);
                int var60 = class98.field1408 * 4 + class191.field3129.method1881(-20395) * 2 + 2 - (class191.field3129.field4264 / 32) - 2;
                class103.method711(var59, 2047, var60, arg4, arg2, class279.field4499, arg1);
            }
            if (class232.field3690) {
                class75.method505(arg2 - (1 - (arg4.field2468 / 2)), arg1 - -(arg4.field2520 / 2) + -1, 3, 3, 16777215);
            } else {
                class59.method382(arg4.field2468 / 2 + arg2 - 1, arg4.field2520 / 2 + -1 + arg1, 3, 3, 16777215);
            }
        } else if (class232.field3690) {
            class58 var61 = arg4.method1130(arg3 - 112, false);
            if (var61 != null) {
                var61.method375(arg2, arg1);
            }
        } else {
            class59.method396(arg2, arg1, 0, arg4.field2502, arg4.field2582);
        }
        class127.field1991[arg0] = true;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([BI)V")
    public abstract void method78(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)[B")
    public abstract byte[] method80(byte arg0);
}
