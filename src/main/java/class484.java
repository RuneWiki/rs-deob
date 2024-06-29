import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class484 extends class625 {

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIII)V")
    public static final void method2816(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6876;
        class548 var5 = class696.method3872(arg3, 8, -1633381944);
        int var6 = 35 / ((arg0 - -52) / 63);
        var5.method3130(80);
        var5.field7726 = arg2;
        var5.field7725 = arg4;
        var5.field7728 = arg1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLfba;ILha;)V")
    public static final void method2817(byte arg0, class600 arg1, int arg2, class454 arg3) {
        ++field6877;
        if (arg0 > 86) {
            if (class335.field4305 != null && ~arg2 >= ~arg1.field8347) {
                for (int var4 = 0; ~var4 > ~class335.field4305.length; ++var4) {
                    if (class335.field4305[var4] != -1000000 && (~arg1.field8342[0] >= ~class335.field4305[var4] || class335.field4305[var4] >= arg1.field8342[1] || arg1.field8342[2] <= class335.field4305[var4] || class335.field4305[var4] >= arg1.field8342[3]) && (~arg1.field8337[0] >= ~class340.field4398[var4] || ~class340.field4398[var4] <= ~arg1.field8337[1] || ~arg1.field8337[2] >= ~class340.field4398[var4] || class340.field4398[var4] >= arg1.field8337[3]) && (~class86.field1098[var4] >= ~arg1.field8337[0] || arg1.field8337[1] >= class86.field1098[var4] || ~class86.field1098[var4] >= ~arg1.field8337[2] || arg1.field8337[3] >= class86.field1098[var4]) && (class140.field1674[var4] >= arg1.field8336[0] || ~arg1.field8336[1] >= ~class140.field1674[var4] || arg1.field8336[2] <= class140.field1674[var4] || ~arg1.field8336[3] >= ~class140.field1674[var4]) && (~class65.field871[var4] >= ~arg1.field8336[0] || class65.field871[var4] <= arg1.field8336[1] || ~arg1.field8336[2] <= ~class65.field871[var4] || ~arg1.field8336[3] <= ~class65.field871[var4])) {
                        return;
                    }
                }
            }
            if (~arg1.field8344 == -2) {
                int var5 = arg1.field8333 - class337.field4349 + class267.field3381;
                if (var5 >= 0 && var5 <= class267.field3381 - -class267.field3381) {
                    int var6 = -class561.field7852 + arg1.field8341 - -class267.field3381;
                    if (~var6 > -1) {
                        var6 = 0;
                    } else if (class267.field3381 + class267.field3381 < var6) {
                        return;
                    }
                    int var7 = -class561.field7852 + arg1.field8340 + class267.field3381;
                    if (var7 <= class267.field3381 + class267.field3381) {
                        if (var7 < 0) {
                            return;
                        }
                    } else {
                        var7 = class267.field3381 + class267.field3381;
                    }
                    boolean var8 = false;
                    while (~var6 >= ~var7) {
                        if (class376.field5266[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        float var9 = (float) (-arg1.field8337[0] + class88.field1121);
                        if (var9 < 0.0F) {
                            var9 *= -1.0F;
                        }
                        if (!(var9 < (float) class469.field6745)) {
                            if (class279.method1670(0, arg1, -25367)) {
                                if (class279.method1670(1, arg1, -25367)) {
                                    if (class279.method1670(2, arg1, -25367)) {
                                        if (class279.method1670(3, arg1, -25367)) {
                                            class384.field5349[class113.field1392++] = arg1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (arg1.field8344 == 2) {
                int var10 = -class561.field7852 + arg1.field8341 + class267.field3381;
                if (~var10 <= -1 && var10 <= class267.field3381 - -class267.field3381) {
                    int var11 = arg1.field8333 - -class267.field3381 + -class337.field4349;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > class267.field3381 + class267.field3381) {
                        return;
                    }
                    int var12 = class267.field3381 + arg1.field8335 + -class337.field4349;
                    if (class267.field3381 + class267.field3381 >= var12) {
                        if (var12 < 0) {
                            return;
                        }
                    } else {
                        var12 = class267.field3381 - -class267.field3381;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class376.field5266[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        float var14 = (float) (-arg1.field8336[0] + class590.field8229);
                        if (var14 < 0.0F) {
                            var14 *= -1.0F;
                        }
                        if (!(var14 < (float) class469.field6745)) {
                            if (class279.method1670(0, arg1, -25367)) {
                                if (class279.method1670(1, arg1, -25367)) {
                                    if (class279.method1670(2, arg1, -25367)) {
                                        if (class279.method1670(3, arg1, -25367)) {
                                            class384.field5349[class113.field1392++] = arg1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (arg1.field8344 != 16 && ~arg1.field8344 != -9) {
                if (arg1.field8344 == 4) {
                    float var15 = (float) (arg1.field8342[0] + -class508.field7180);
                    if (!(var15 <= (float) class389.field5412)) {
                        int var16 = -class561.field7852 + arg1.field8341 - -class267.field3381;
                        if (var16 >= 0) {
                            if (class267.field3381 + class267.field3381 < var16) {
                                return;
                            }
                        } else {
                            var16 = 0;
                        }
                        int var17 = -class561.field7852 + class267.field3381 + arg1.field8340;
                        if (~var17 < ~(class267.field3381 - -class267.field3381)) {
                            var17 = class267.field3381 + class267.field3381;
                        } else if (~var17 > -1) {
                            return;
                        }
                        int var18 = arg1.field8333 - (-class267.field3381 + class337.field4349);
                        if (~var18 > -1) {
                            var18 = 0;
                        } else if (var18 > class267.field3381 - -class267.field3381) {
                            return;
                        }
                        int var19 = arg1.field8335 - (class337.field4349 - class267.field3381);
                        if (~var19 < ~(class267.field3381 + class267.field3381)) {
                            var19 = class267.field3381 - -class267.field3381;
                        } else if (var19 < 0) {
                            return;
                        }
                        boolean var20 = false;
                        label295: for (int var21 = var18; var21 <= var19; ++var21) {
                            for (int var22 = var16; ~var22 >= ~var17; ++var22) {
                                if (class376.field5266[var21][var22]) {
                                    var20 = true;
                                    break label295;
                                }
                            }
                        }
                        if (var20) {
                            if (class279.method1670(0, arg1, -25367)) {
                                if (class279.method1670(1, arg1, -25367)) {
                                    if (class279.method1670(2, arg1, -25367)) {
                                        if (class279.method1670(3, arg1, -25367)) {
                                            class384.field5349[class113.field1392++] = arg1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int var23 = class267.field3381 + arg1.field8333 + -class337.field4349;
                if (var23 >= 0 && ~(class267.field3381 + class267.field3381) <= ~var23) {
                    int var24 = arg1.field8341 - -class267.field3381 + -class561.field7852;
                    if (~var24 <= -1 && ~(class267.field3381 + class267.field3381) <= ~var24) {
                        if (class376.field5266[var23][var24]) {
                            float var25 = (float) (-arg1.field8337[0] + class88.field1121);
                            if (var25 < 0.0F) {
                                var25 *= -1.0F;
                            }
                            float var26 = (float) (-arg1.field8336[0] + class590.field8229);
                            if (var26 < 0.0F) {
                                var26 *= -1.0F;
                            }
                            if (!((float) class469.field6745 > var25) || !((float) class469.field6745 > var26)) {
                                if (class279.method1670(0, arg1, -25367)) {
                                    if (class279.method1670(1, arg1, -25367)) {
                                        if (class279.method1670(2, arg1, -25367)) {
                                            if (class279.method1670(3, arg1, -25367)) {
                                                class384.field5349[class113.field1392++] = arg1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[[I")
    public final int[][] method592(int arg0, int arg1) {
        if (arg1 != 2) {
            method2816(126, -63, 21, 67, 6);
        }
        ++field6875;
        int[][] var3 = super.field7450.method2241(-1, arg0);
        if (super.field7450.field5165 && this.method3419(-112)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field8714 * super.field8714;
            for (int var8 = 0; var8 < class304.field3909; ++var8) {
                int var9 = super.field8711[var7 - -(var8 % super.field8721)];
                var6[var8] = class272.method1629(var9, 255) << 4;
                var5[var8] = class272.method1629(4080, var9 >> 4);
                var4[var8] = class272.method1629(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[[I)V")
    public static final void method2818(int arg0, int[][] arg1) {
        ++field6873;
        class15.field220 = arg1;
        if (arg0 != 9709) {
            method2819((byte) 85, 120, -45);
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(BII)Z")
    public static final boolean method2819(byte arg0, int arg1, int arg2) {
        ++field6874;
        if (arg0 > -82) {
            return true;
        } else {
            return class708.method3915(arg1, false, arg2) || class407.method2411(arg2, arg1, 0);
        }
    }
}
