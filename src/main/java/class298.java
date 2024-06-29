import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class298 {

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static volatile int field4530 = 0;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lgb;")
    public static class229 field4528;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Ljh;")
    public static class244 field4529;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIIII)V", line = 11)
    public static final void method1987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != 394) {
            method1987(-61, -26, 18, -121, -104, -72, -121, -102, 43);
        }
        field4527++;
        for (int var9 = 0; var9 < class222.field3517.field3672; var9++) {
            if (class222.field3517.method1559((byte) -26, var9)) {
                int[] var10 = class104.field1803.method2274(class222.field3517.field3665[var9] & 0x3FFF, class222.field3517.field3665[var9] >> 28 & 0x3, class222.field3517.field3665[var9] >> 14 & 0x3FFF, true);
                if (var10 != null) {
                    int var11 = var10[1] - class38.field734;
                    int var12 = class17.field322 + class9.field199 - var10[2] - 1;
                    int var13 = (var11 - arg1) * (arg5 - arg7) / (arg2 - arg1) + arg7;
                    int var14 = 16777215;
                    int var15 = (var12 - arg4) * (arg6 - arg0) / (arg8 - arg4) + arg0;
                    int var16 = class222.field3517.method1556(-124, var9);
                    class257 var17 = null;
                    if (var16 == 0) {
                        if ((double) class244.field3799 == 3.0D) {
                            var17 = class250.field3932;
                        }
                        if ((double) class244.field3799 == 4.0D) {
                            var17 = class328.field5036;
                        }
                        if ((double) class244.field3799 == 6.0D) {
                            var17 = class74.field1518;
                        }
                        if ((double) class244.field3799 >= 8.0D) {
                            var17 = class334.field5118;
                        }
                    }
                    if (var16 == 1) {
                        if ((double) class244.field3799 == 3.0D) {
                            var17 = class74.field1518;
                        }
                        if ((double) class244.field3799 == 4.0D) {
                            var17 = class334.field5118;
                        }
                        if ((double) class244.field3799 == 6.0D) {
                            var17 = class197.field3163;
                        }
                        if ((double) class244.field3799 >= 8.0D) {
                            var17 = class344.field5341;
                        }
                    }
                    if (var16 == 2) {
                        var14 = 16755200;
                        if ((double) class244.field3799 == 3.0D) {
                            var17 = class197.field3163;
                        }
                        if ((double) class244.field3799 == 4.0D) {
                            var17 = class344.field5341;
                        }
                        if ((double) class244.field3799 == 6.0D) {
                            var17 = class27.field527;
                        }
                        if ((double) class244.field3799 >= 8.0D) {
                            var17 = class71.field1493;
                        }
                    }
                    if (class222.field3517.field3676[var9] != -1) {
                        var14 = class222.field3517.field3676[var9];
                    }
                    if (var17 != null) {
                        int var18 = class71.field1494.method2104(class222.field3517.field3673[var9], (int[]) null, class256.field3996);
                        int var19 = var15 - var17.method1720() * (var18 - 1) / 2;
                        int var20 = var19 + var17.method1718() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class256.field3996[var21];
                            if (var21 < var18 - 1) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var17.method1716(var22, var13, var20, var14, true);
                            var20 += var17.method1720();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(CZ)Z", line = 149)
    public static final boolean method1988(char arg0, boolean arg1) {
        field4525++;
        if (arg1) {
            return false;
        } else {
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 175)
    public static void method1989(byte arg0) {
        if (arg0 == -93) {
            field4529 = null;
            field4528 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIIIIIIIIIII)V", line = 188)
    public static final void method1990(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg9 - arg8;
        field4526++;
        if (arg5 >= -120) {
            method1988((char) 65434, true);
        }
        int var13 = -1;
        int var14 = 983040 / arg1;
        int var15 = 983040 / arg3;
        int var16 = arg7 - arg10;
        if (class280.field4319 > 0) {
            if (class303.field4601 <= 10) {
                var13 = class303.field4601 * 5;
            } else {
                var13 = (10 - (class303.field4601 - 10)) * 5;
            }
        }
        for (int var17 = -var14; var17 < var14 + var16; var17++) {
            int var18 = arg6 + (arg1 * var17) >> 16;
            int var19 = arg6 + ((var17 + 1) * arg1) >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var10000 = arg11 + var19;
                int var22 = arg11 + var18;
                int var23 = arg10 + var17 >> 6;
                if (var23 >= 0 && class183.field2927.length - 1 >= var23) {
                    int[][] var24 = class183.field2927[var23];
                    for (int var25 = -var15; var25 < (var12 + var15); var25++) {
                        int var26 = arg3 * var25 + arg4 >> 16;
                        int var27 = (var25 + 1) * arg3 + arg4 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            int var29 = arg2 + var26;
                            var10000 = arg2 + var27;
                            int var31 = arg8 + var25 >> 6;
                            if (var31 >= 0 && var31 <= (var24.length - 1) && var24[var31] != null) {
                                int var32 = (arg8 + var25 & 0x3F << 6) + (arg10 + var17 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class31 var34 = class277.method1864(var33 - 1, 0);
                                    if (!class18.field326[var34.field578]) {
                                        if (var13 != -1 && class12.field242 == var34.field578) {
                                            class119 var35 = new class119();
                                            var35.field2076 = var29;
                                            var35.field2081 = var22;
                                            var35.field2070 = var34.field578;
                                            class42.field803.method427((byte) -121, var35);
                                        } else {
                                            class106.field1834[var34.field578].method901(var22 - 7, var29 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class119 var36 = (class119) class42.field803.method424(-71); var36 != null; var36 = (class119) class42.field803.method425(-32547)) {
            class270.method1807(var36.field2081, var36.field2076, 15, 16776960, var13);
            class270.method1807(var36.field2081, var36.field2076, 13, 16776960, var13);
            class270.method1807(var36.field2081, var36.field2076, 11, 16776960, var13);
            class270.method1807(var36.field2081, var36.field2076, 9, 16776960, var13);
            class106.field1834[var36.field2070].method901(var36.field2081 - 7, var36.field2076 - 7);
        }
        class42.field803.method432(-85);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 316)
    public class298() {
        new class84();
    }
}
