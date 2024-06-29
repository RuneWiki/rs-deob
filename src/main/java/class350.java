import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class350 extends class466 {

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "Z")
    private boolean field4704 = true;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "Z")
    private boolean field4707 = true;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "Ldv;")
    public static class566 field4702 = new class566(76, 15);

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)V")
    public static final void method2102(boolean arg0) {
        ++field4705;
        int var1 = 0;
        if (arg0) {
            while (~var1 > ~class202.field2830) {
                label133: {
                    class640 var2 = class233.field3289[var1];
                    boolean var3 = false;
                    if (var2.field9308 != null) {
                        if (!var2.field9308.method1120(0)) {
                            var3 = true;
                        }
                    } else {
                        --var2.field9312;
                        if (~(var2.field9304 == 2 ? -1500 : -10) < ~var2.field9312) {
                            var3 = true;
                        } else {
                            if (~var2.field9304 == -2 && var2.field9318 == null) {
                                var2.field9318 = class544.method3109(class603.field8707, var2.field9309, 0);
                                if (var2.field9318 == null) {
                                    break label133;
                                }
                                var2.field9312 += var2.field9318.method3111();
                            } else if (~var2.field9304 == -3 && (var2.field9311 == null || var2.field9314 == null)) {
                                if (var2.field9311 == null) {
                                    var2.field9311 = class433.method2572(class572.field7893, var2.field9309);
                                }
                                if (var2.field9311 == null) {
                                    break label133;
                                }
                                if (var2.field9314 == null) {
                                    var2.field9314 = var2.field9311.method2575(new int[] { 22050 });
                                    if (var2.field9314 == null) {
                                        break label133;
                                    }
                                }
                            }
                            if (var2.field9312 < 0) {
                                int var4;
                                if (var2.field9306 == 0) {
                                    var4 = class491.field6875.field3372 * var2.field9313 >> 8;
                                } else {
                                    int var5 = var2.field9306 >> 24 & 3;
                                    if (~class645.field9372.field6035 != ~var5) {
                                        var4 = 0;
                                    } else {
                                        int var6 = (var2.field9306 & 255) << 7;
                                        int var7 = var2.field9306 >> 16 & 255;
                                        int var8 = (var7 << 7) - class645.field9372.field6037 + 64;
                                        if (~var8 > -1) {
                                            var8 = -var8;
                                        }
                                        int var9 = var2.field9306 >> 8 & 255;
                                        int var10 = (var9 << 7) + 64 + -class645.field9372.field6029;
                                        if (var10 < 0) {
                                            var10 = -var10;
                                        }
                                        int var11 = var8 + -128 - -var10;
                                        if (~var11 < ~var6) {
                                            var2.field9312 = -99999;
                                            break label133;
                                        }
                                        if (~var11 > -1) {
                                            var11 = 0;
                                        }
                                        var4 = (-var11 + var6) * var2.field9313 * class491.field6875.field3354 / var6 >> 8;
                                    }
                                }
                                if (var4 > 0) {
                                    class514 var12 = null;
                                    if (var2.field9304 == 1) {
                                        var12 = var2.field9318.method3108().method2975(class217.field3080);
                                    } else if (var2.field9304 == 2) {
                                        var12 = var2.field9314;
                                    }
                                    class260 var13 = var2.field9308 = class260.method1686(var12, 100, var4);
                                    var13.method1696(var2.field9307 + -1);
                                    class204.field2869.method2733(var13);
                                }
                            }
                        }
                    }
                    if (var3) {
                        --class202.field2830;
                        for (int var14 = var1; ~var14 > ~class202.field2830; ++var14) {
                            class233.field3289[var14] = class233.field3289[var14 + 1];
                        }
                        --var1;
                    }
                }
                ++var1;
            }
            if (class144.field2229 && !class492.method2860(-1)) {
                if (class491.field6875.field3362 != 0 && class531.field7446 != -1) {
                    class360.method2160(class531.field7446, class491.field6875.field3362, class236.field3305, 15325, 0, false);
                }
                class144.field2229 = false;
            } else if (~class491.field6875.field3362 != -1 && ~class531.field7446 != 0 && !class492.method2860(-1)) {
                ++class259.field3605;
                class351.method2108(class557.field7692, -10511);
                class479.field6754.method117(-21, class531.field7446);
                class531.field7446 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)I")
    public static final int method2103(int arg0, byte arg1) {
        ++field4709;
        double var2 = (double) (255 & arg0 >> 16) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 255) / 256.0D;
        double var6 = (double) (255 & arg0) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (arg1 != -75) {
            method2105(-68, -17, 100, -86, -62, -92, 96);
        }
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (-var8 + var10) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (-var8 + var10) / (-var10 + 2.0D + -var8);
            }
            if (var2 != var10) {
                if (var4 != var10) {
                    if (var6 == var10) {
                        var12 = (var2 - var4) / (var10 - var8) + 4.0D;
                    }
                } else {
                    var12 = (-var2 + var6) / (-var8 + var10) + 2.0D;
                }
            } else {
                var12 = (var4 - var6) / (var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (~var21 < -256) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (~var22 <= -1) {
            if (~var22 < -256) {
                var22 = 255;
            }
        } else {
            var22 = 0;
        }
        if (~var22 < -244) {
            var21 >>= 4;
        } else if (~var22 >= -218) {
            if (var22 <= 192) {
                if (var22 > 179) {
                    var21 >>= 1;
                }
            } else {
                var21 >>= 2;
            }
        } else {
            var21 >>= 3;
        }
        return (var21 >> 5 << 7) + (((var20 & 255) >> 2 << 10) - -(var22 >> 1));
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 != -5062) {
            method2102(true);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field6565 = arg0.method110((byte) 124) == 1;
                }
            } else {
                this.field4707 = arg0.method110((byte) 74) == 1;
            }
        } else {
            this.field4704 = arg0.method110((byte) 102) == 1;
        }
        ++field4706;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field4701;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (super.field6557.field1163) {
            int[] var4 = this.method2721(0, !this.field4707 ? arg0 : class105.field1581 - arg0, arg1 + 2);
            if (this.field4704) {
                for (int var5 = 0; ~class312.field4207 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class340.field4582];
                }
            } else {
                class416.method2496(var4, 0, var3, 0, class312.field4207);
            }
        }
        if (arg1 != 0) {
            this.method6((class11) null, 25, -96);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field4708;
        int[][] var3 = super.field6569.method828((byte) 126, arg0);
        if (arg1) {
            this.method6((class11) null, -46, 2);
        }
        if (super.field6569.field1934) {
            int[][] var4 = this.method2719(0, !this.field4707 ? arg0 : -arg0 + class105.field1581, 5);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field4704) {
                for (int var11 = 0; class312.field4207 > var11; ++var11) {
                    var8[var11] = var5[class340.field4582 - var11];
                    var9[var11] = var6[-var11 + class340.field4582];
                    var10[var11] = var7[-var11 + class340.field4582];
                }
            } else {
                for (int var12 = 0; ~class312.field4207 < ~var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V")
    public static void method2104(byte arg0) {
        field4702 = null;
        int var1 = -66 % ((-89 - arg0) / 35);
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class350() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class201[] var7 = class132.field2113;
        for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
            class201 var9 = var7[var8];
            if (var9 != null && var9.field2819 == 2) {
                class100.method715(arg3, arg2 >> 1, arg4 >> 1, var9.field2827 * 2, var9.field2822, arg1, var9.field2826, true, var9.field2821);
                if (class328.field4394[0] > -1 && ~(class405.field5763 % 20) > -11) {
                    class60.field1064[var9.field2824].method497(class328.field4394[0] + arg5 + -12, class328.field4394[1] + arg0 + -28);
                }
            }
        }
        if (arg6 != -28) {
            method2102(false);
        }
        ++field4703;
    }
}
