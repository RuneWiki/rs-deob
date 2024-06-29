import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class35 extends class30 {

    @OriginalMember(owner = "client!nr", name = "Q", descriptor = "I")
    private int field431 = 4096;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "F")
    public static float field426;

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!nr", name = "M", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!nr", name = "N", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!nr", name = "O", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!nr", name = "R", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!nr", name = "S", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!nr", name = "U", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!nr", name = "V", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!nr", name = "T", descriptor = "Lah;")
    public static class215 field434;

    @OriginalMember(owner = "client!nr", name = "P", descriptor = "[I")
    public static int[] field430;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lmo;B)V")
    public static final void method225(class447 arg0, byte arg1) {
        if (arg1 != 41) {
            field430 = null;
        }
        ++field429;
        class59.field760 = arg0;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ltm;I)I")
    public static final int method226(class219 arg0, int arg1) {
        if (arg1 < 107) {
            field426 = 1.0895079F;
        }
        ++field433;
        int var2 = arg0.field3617;
        class349 var3 = arg0.method912(-5);
        if (arg0.field1831) {
            var2 = arg0.field3622;
        } else if (~arg0.field1851 != ~var3.field5413 && ~arg0.field1851 != ~var3.field5370 && arg0.field1851 != var3.field5379 && arg0.field1851 != var3.field5391) {
            if (~arg0.field1851 == ~var3.field5406 || ~arg0.field1851 == ~var3.field5362 || ~arg0.field1851 == ~var3.field5398 || arg0.field1851 == var3.field5389) {
                var2 = arg0.field3598;
            }
        } else {
            var2 = arg0.field3623;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        ++field425;
        int[] var3 = super.field371.method2367((byte) -61, arg0);
        if (super.field371.field5586) {
            int[] var4 = this.method210((byte) 67, 0, arg0 + -1 & class246.field4033);
            int[] var5 = this.method210((byte) 23, 0, arg0);
            int[] var6 = this.method210((byte) 40, 0, arg0 + 1 & class246.field4033);
            for (int var7 = 0; ~class369.field5610 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field431;
                int var9 = (var5[class106.field1492 & var7 + 1] + -var5[class106.field1492 & var7 - 1]) * this.field431;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        if (arg1 <= 49) {
            method231((byte) 124);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)I")
    public static int method227(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIZIIIIII)V")
    public static final void method228(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field436;
        if (!arg2) {
            if (class178.method1225(120, arg4)) {
                class303.method2033(arg3, arg5, arg7, -1, arg0, class203.field3266[arg4], arg1, -1, arg8, arg6);
            } else if (arg3 != -1) {
                class267.field4296[arg3] = true;
            } else {
                for (int var9 = 0; ~var9 > -101; ++var9) {
                    class267.field4296[var9] = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 != 6456) {
            method226((class219) null, 13);
        }
        if (arg2 == 0) {
            this.field431 = arg0.method1272((byte) -103);
        }
        ++field432;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZLne;II)V")
    public static final void method229(int arg0, boolean arg1, class172 arg2, int arg3, int arg4) {
        if (arg0 != 10) {
            field434 = null;
        }
        ++field427;
        int var5 = arg2.field2705;
        int var6 = arg2.field2834;
        if (~arg2.field2704 != -1) {
            if (arg2.field2704 != 1) {
                if (arg2.field2704 != 2) {
                    if (arg2.field2704 == 3) {
                        if (~arg2.field2707 == -3) {
                            arg2.field2705 = (arg2.field2692 + -1) * arg2.field2783 + arg2.field2692 * 32;
                        } else if (arg2.field2707 == 7) {
                            arg2.field2705 = (arg2.field2692 + -1) * arg2.field2783 + arg2.field2692 * 115;
                        }
                    }
                } else {
                    arg2.field2705 = arg2.field2692 * arg3 >> 14;
                }
            } else {
                arg2.field2705 = -arg2.field2692 + arg3;
            }
        } else {
            arg2.field2705 = arg2.field2692;
        }
        if (~arg2.field2774 != -1) {
            if (~arg2.field2774 != -2) {
                if (arg2.field2774 != 2) {
                    if (arg2.field2774 == 3) {
                        if (~arg2.field2707 == -3) {
                            arg2.field2834 = arg2.field2697 * 32 - -((arg2.field2697 + -1) * arg2.field2862);
                        } else if (~arg2.field2707 == -8) {
                            arg2.field2834 = (arg2.field2697 + -1) * arg2.field2862 + arg2.field2697 * 12;
                        }
                    }
                } else {
                    arg2.field2834 = arg2.field2697 * arg4 >> 14;
                }
            } else {
                arg2.field2834 = arg4 - arg2.field2697;
            }
        } else {
            arg2.field2834 = arg2.field2697;
        }
        if (arg2.field2704 == 4) {
            arg2.field2705 = arg2.field2834 * arg2.field2718 / arg2.field2731;
        }
        if (arg2.field2774 == 4) {
            arg2.field2834 = arg2.field2731 * arg2.field2705 / arg2.field2718;
        }
        if (class80.field1000 && (~client.method1149(arg2).field671 != -1 || arg2.field2707 == 0)) {
            if (arg2.field2834 < 5 && arg2.field2705 < 5) {
                arg2.field2705 = 5;
                arg2.field2834 = 5;
            } else {
                if (~arg2.field2705 >= -1) {
                    arg2.field2705 = 5;
                }
                if (arg2.field2834 <= 0) {
                    arg2.field2834 = 5;
                }
            }
        }
        if (~arg2.field2831 == -1338) {
            class379.field5720 = arg2;
        }
        if (arg1 && arg2.field2703 != null) {
            if (~arg2.field2705 != ~var5 || ~arg2.field2834 != ~var6) {
                class150 var7 = new class150();
                var7.field2348 = arg2;
                var7.field2352 = arg2.field2703;
                class107.field1499.method245(500, var7);
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIB)V")
    public static final void method230(int arg0, int arg1, byte arg2) {
        ++field428;
        if (arg2 >= 54) {
            class375 var3 = class136.field2139[arg0][arg1];
            if (var3 != null) {
                class56.field707 = var3.field5663;
                class334.field5217 = var3.field5657;
                class107.field1503 = var3.field5659;
            }
            class326.method2163(1005);
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
    public class35() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(B)V")
    public static void method231(byte arg0) {
        field434 = null;
        field430 = null;
        int var1 = 9 % ((arg0 - 50) / 34);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Le;Lbr;ZLel;)V")
    public static final void method232(class312 arg0, class222 arg1, boolean arg2, class324 arg3) {
        ++field435;
        class356 var4 = arg3.method2152((byte) 29, arg0);
        if (var4 != null) {
            int var5 = var4.method2324();
            if (~var4.method2325() < ~var5) {
                var5 = var4.method2325();
            }
            byte var6 = 10;
            int var7 = arg1.field3693;
            int var8 = arg1.field3685;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg3.field5070 != null) {
                var9 = class13.field185.method2160((int[]) null, class9.field111, arg3.field5070, (byte) -18, (class356[]) null);
                for (int var12 = 0; ~var9 < ~var12; ++var12) {
                    String var13 = class9.field111[var12];
                    if (~(var9 + -1) < ~var12) {
                        var13 = var13.substring(0, var13.length() + -4);
                    }
                    int var14 = class53.field668.method1056(var13);
                    if (var10 < var14) {
                        var10 = var14;
                    }
                }
                var11 = class53.field668.method1060() * var9 - -(class53.field668.method1054() / 2);
            }
            int var15 = var5 / 2 + arg1.field3693;
            int var16 = arg1.field3685;
            if (~var7 <= ~(class400.field5965 + var5)) {
                if (~var7 < ~(-var5 + class400.field5970)) {
                    var7 = -var5 + class400.field5970;
                    var15 = -(var5 / 2) + class400.field5970 - var6 + -5 - var10 / 2;
                }
            } else {
                var15 = var5 / 2 + class400.field5965 + var6 - -(var10 / 2) + 5;
                var7 = class400.field5965;
            }
            if (~(class400.field5964 - -var5) >= ~var8) {
                if (class400.field5975 - var5 < var8) {
                    var8 = class400.field5975 - var5;
                    var16 = -(var5 / 2) - var6 + class400.field5975 + -var11;
                }
            } else {
                var8 = class400.field5964;
                var16 = class400.field5964 + var6 - -(var5 / 2);
            }
            int var17 = (int) (Math.atan2((double) (-arg1.field3693 + var7), (double) (-arg1.field3685 + var8)) / 3.141592653589793D * 32767.0D) & 65535;
            var4.method2317((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            if (arg2) {
                int var20 = -2;
                int var21 = -2;
                if (arg3.field5070 != null) {
                    var18 = -(var10 / 2) + var15 + -5;
                    var19 = var16;
                    var21 = 3 + (var16 - -(class53.field668.method1060() * var9));
                    var20 = var18 + 10 - -var10;
                    if (~arg3.field5056 != -1) {
                        arg0.method2086(-var18 + var20, var18, -var16 + var21, arg3.field5056, -765, var16);
                    }
                    if (~arg3.field5066 != -1) {
                        arg0.method2083(67, var16, var21 - var16, var18, arg3.field5066, var20 - var18);
                    }
                    for (int var22 = 0; ~var22 > ~var9; ++var22) {
                        String var23 = class9.field111[var22];
                        if (var9 + -1 > var22) {
                            var23 = var23.substring(0, var23.length() - 4);
                        }
                        class53.field668.method1057(arg0, var23, var15, var16, arg3.field5061, true);
                        var16 += class53.field668.method1060();
                    }
                }
                if (~arg3.field5071 != 0 || arg3.field5070 != null) {
                    class106 var24 = new class106(arg1);
                    int var25 = var5 >> 1;
                    var24.field1491 = var21;
                    var24.field1482 = -var25 + var8;
                    var24.field1485 = var8 + var25;
                    var24.field1478 = var7 - var25;
                    var24.field1490 = var18;
                    var24.field1480 = var7 - -var25;
                    var24.field1487 = var19;
                    var24.field1493 = var20;
                    class315.field4952.method245(500, var24);
                }
            }
        }
    }
}
