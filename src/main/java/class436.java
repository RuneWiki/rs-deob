import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class436 extends class739 {

    @OriginalMember(owner = "client!st", name = "M", descriptor = "[I")
    public static int[] field5811;

    @OriginalMember(owner = "client!st", name = "E", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!st", name = "F", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!st", name = "G", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!st", name = "I", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!st", name = "J", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!st", name = "K", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!st", name = "L", descriptor = "I")
    public static int field5810;

    static {
        new class526("", 73);
        field5811 = new int[13];
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method215(int arg0, int arg1) {
        ++field5809;
        if (arg0 != -23347) {
            this.method215(-84, -94);
        }
        int[] var3 = super.field10311.method2116(arg1, (byte) 112);
        if (super.field10311.field4728) {
            int[][] var4 = this.method4119(arg0 + 23349, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class29.field523 < ~var8; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(II)Lwaa;", line = 42)
    public static final class705 method2481(int arg0, int arg1) {
        ++field5804;
        class705[] var2 = class96.method774(arg0 ^ -79);
        for (int var3 = arg0; ~var2.length < ~var3; ++var3) {
            class705 var4 = var2[var3];
            if (var4.field9771 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!st", name = "d", descriptor = "(III)Z", line = 66)
    public static final boolean method2482(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            field5811 = null;
        }
        ++field5810;
        return (384 & arg2) != 0;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V", line = 79)
    public class436() {
        super(1, true);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIII)I", line = 82)
    public static final int method2483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5806;
        int var5 = -class16.field322[arg3 * 8192 / arg0] + 65536 >> 1;
        if (arg1 != 3700) {
            method2481(23, -13);
        }
        return ((-var5 + 65536) * arg4 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lkm;IIBII)V", line = 96)
    public static final void method2484(class357 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field5805;
        if (arg0.field4611 != -1 || arg0.field4606 != null) {
            int var6 = 0;
            if (arg3 == -34) {
                int var7 = arg0.field4602 * class748.field10451.field10394.method4186((byte) 115) >> 8;
                if (arg4 <= arg0.field4607) {
                    if (~arg0.field4593 < ~arg4) {
                        var6 += arg0.field4593 - arg4;
                    }
                } else {
                    var6 += arg4 - arg0.field4607;
                }
                if (arg0.field4598 >= arg1) {
                    if (~arg1 > ~arg0.field4597) {
                        var6 += -arg1 + arg0.field4597;
                    }
                } else {
                    var6 += -arg0.field4598 + arg1;
                }
                if (arg0.field4590 != 0 && ~(var6 + -256) >= ~arg0.field4590 && class748.field10451.field10394.method4186((byte) -98) != 0 && ~arg0.field4612 == ~arg2) {
                    var6 -= 256;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    int var8 = -arg0.field4589 + arg0.field4590;
                    if (~var8 > -1) {
                        var8 = arg0.field4590;
                    }
                    int var9 = var7;
                    int var10 = -arg0.field4589 + var6;
                    if (var10 > 0 && var8 > 0) {
                        var9 = (var8 - var10) * var7 / var8;
                    }
                    class380.field4847.method82((byte) 49);
                    int var11 = 8192;
                    int var12 = (arg0.field4607 + arg0.field4593) / 2 + -arg4;
                    int var13 = (arg0.field4598 + arg0.field4597) / 2 - arg1;
                    if (var12 != 0 || var13 != 0) {
                        int var14 = -class206.field2731 + -((int) (2607.5945876176133D * Math.atan2((double) var12, (double) var13))) - 4096 & 16383;
                        if (var14 > 8192) {
                            var14 = 16384 - var14;
                        }
                        int var15;
                        if (~var6 < -1) {
                            if (var6 < 4096) {
                                var15 = var6 * 8192 / 4096 + 8192;
                            } else {
                                var15 = 16384;
                            }
                        } else {
                            var15 = 8192;
                        }
                        var11 = (-var15 + 16384 >> 1) + var14 * var15 / 8192;
                    }
                    if (arg0.field4617 == null) {
                        if (arg0.field4611 >= 0) {
                            int var16 = ~arg0.field4615 == -257 && arg0.field4595 == 256 ? 256 : class141.method1022(arg0.field4615, arg0.field4595, 2);
                            if (arg0.field4614) {
                                if (arg0.field4610 == null) {
                                    arg0.field4610 = class413.method2314(class652.field9072, arg0.field4611);
                                }
                                if (arg0.field4610 != null) {
                                    if (arg0.field4588 == null) {
                                        arg0.field4588 = arg0.field4610.method2312(new int[] { 22050 });
                                    }
                                    if (arg0.field4588 != null) {
                                        class45 var17 = class45.method329(arg0.field4588, var16, var9 << 6, var11);
                                        var17.method326(-1);
                                        class307.field4055.method1321(var17);
                                        arg0.field4617 = var17;
                                    }
                                }
                            } else {
                                class49 var18 = class49.method371(class695.field9672, arg0.field4611, 0);
                                if (var18 != null) {
                                    class148 var19 = var18.method372().method1051(class18.field331);
                                    class45 var20 = class45.method329(var19, var16, var9 << 6, var11);
                                    var20.method326(-1);
                                    class307.field4055.method1321(var20);
                                    arg0.field4617 = var20;
                                }
                            }
                        }
                    } else {
                        arg0.field4617.method318(var9);
                        arg0.field4617.method321(var11);
                    }
                    if (arg0.field4609 == null) {
                        if (arg0.field4606 != null && (arg0.field4605 -= arg5) <= 0) {
                            int var21 = arg0.field4615 == 256 && arg0.field4595 == 256 ? 256 : (int) ((double) (arg0.field4615 - arg0.field4595) * Math.random()) - -arg0.field4595;
                            if (!arg0.field4591) {
                                int var22 = (int) ((double) arg0.field4606.length * Math.random());
                                class49 var23 = class49.method371(class695.field9672, arg0.field4606[var22], 0);
                                if (var23 != null) {
                                    class148 var24 = var23.method372().method1051(class18.field331);
                                    class45 var25 = class45.method329(var24, var21, var9 << 6, var11);
                                    var25.method326(0);
                                    class307.field4055.method1321(var25);
                                    arg0.field4605 = (int) ((double) (-arg0.field4603 + arg0.field4596) * Math.random()) + arg0.field4603;
                                    arg0.field4609 = var25;
                                    return;
                                }
                                return;
                            }
                            if (arg0.field4613 == null) {
                                int var26 = (int) (Math.random() * (double) arg0.field4606.length);
                                arg0.field4613 = class413.method2314(class652.field9072, arg0.field4606[var26]);
                            }
                            if (arg0.field4613 != null) {
                                if (arg0.field4616 == null) {
                                    arg0.field4616 = arg0.field4613.method2312(new int[] { 22050 });
                                }
                                if (arg0.field4616 != null) {
                                    class45 var27 = class45.method329(arg0.field4616, var21, var9 << 6, var11);
                                    var27.method326(0);
                                    class307.field4055.method1321(var27);
                                    arg0.field4609 = var27;
                                    arg0.field4605 = (int) (Math.random() * (double) (arg0.field4596 - arg0.field4603)) + arg0.field4603;
                                    return;
                                }
                            }
                        }
                    } else {
                        arg0.field4609.method318(var9);
                        arg0.field4609.method321(var11);
                        if (arg0.field4609.method1176((byte) 68)) {
                            return;
                        }
                        arg0.field4613 = null;
                        arg0.field4609 = null;
                        arg0.field4616 = null;
                    }
                } else {
                    if (arg0.field4617 != null) {
                        class307.field4055.method1319(arg0.field4617);
                        arg0.field4610 = null;
                        arg0.field4617 = null;
                        arg0.field4588 = null;
                    }
                    if (arg0.field4609 != null) {
                        class307.field4055.method1319(arg0.field4609);
                        arg0.field4613 = null;
                        arg0.field4609 = null;
                        arg0.field4616 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "e", descriptor = "(I)V", line = 365)
    public static void method2485(int arg0) {
        if (arg0 != -26408) {
            method2483(53, 72, -74, -13, -97);
        }
        field5811 = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IILha;Lcu;)V", line = 383)
    public static final void method2486(int arg0, int arg1, class60 arg2, class222 arg3) {
        if (arg1 == 0) {
            ++field5807;
            if (class409.field5188 != null && arg0 <= arg3.field2966) {
                for (int var4 = 0; ~class409.field5188.length < ~var4; ++var4) {
                    if (class409.field5188[var4] != -1000000 && (~arg3.field2971[0] >= ~class409.field5188[var4] || arg3.field2971[1] <= class409.field5188[var4] || arg3.field2971[2] <= class409.field5188[var4] || ~class409.field5188[var4] <= ~arg3.field2971[3]) && (~class625.field8603[var4] <= ~arg3.field2968[0] || arg3.field2968[1] <= class625.field8603[var4] || ~arg3.field2968[2] >= ~class625.field8603[var4] || ~arg3.field2968[3] >= ~class625.field8603[var4]) && (class39.field599[var4] <= arg3.field2968[0] || class39.field599[var4] <= arg3.field2968[1] || ~class39.field599[var4] >= ~arg3.field2968[2] || arg3.field2968[3] >= class39.field599[var4]) && (~class464.field6227[var4] <= ~arg3.field2974[0] || ~arg3.field2974[1] >= ~class464.field6227[var4] || class464.field6227[var4] >= arg3.field2974[2] || ~arg3.field2974[3] >= ~class464.field6227[var4]) && (class220.field2951[var4] <= arg3.field2974[0] || ~arg3.field2974[1] <= ~class220.field2951[var4] || ~arg3.field2974[2] <= ~class220.field2951[var4] || ~class220.field2951[var4] >= ~arg3.field2974[3])) {
                        return;
                    }
                }
            }
            if (~arg3.field2972 == -2) {
                int var5 = -class428.field5737 - -class593.field8294 + arg3.field2964;
                if (var5 >= 0 && ~(class593.field8294 + class593.field8294) <= ~var5) {
                    int var6 = -class216.field2924 + arg3.field2962 - -class593.field8294;
                    if (~var6 <= -1) {
                        if (class593.field8294 - -class593.field8294 < var6) {
                            return;
                        }
                    } else {
                        var6 = 0;
                    }
                    int var7 = -class216.field2924 + class593.field8294 + arg3.field2963;
                    if (~var7 >= ~(class593.field8294 + class593.field8294)) {
                        if (~var7 > -1) {
                            return;
                        }
                    } else {
                        var7 = class593.field8294 + class593.field8294;
                    }
                    boolean var8 = false;
                    while (~var7 <= ~var6) {
                        if (class449.field5945[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        float var9 = (float) (-arg3.field2968[0] + class358.field4625);
                        if (var9 < 0.0F) {
                            var9 *= -1.0F;
                        }
                        if (!(var9 < (float) class713.field9905)) {
                            if (class661.method3717(0, -12702, arg3)) {
                                if (class661.method3717(1, arg1 ^ -12702, arg3)) {
                                    if (class661.method3717(2, -12702, arg3)) {
                                        if (class661.method3717(3, -12702, arg3)) {
                                            class473.field6351[class533.field7400++] = arg3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (arg3.field2972 == 2) {
                int var10 = -class216.field2924 + arg3.field2962 + class593.field8294;
                if (~var10 <= -1 && ~(class593.field8294 - -class593.field8294) <= ~var10) {
                    int var11 = -class428.field5737 + arg3.field2964 - -class593.field8294;
                    if (~var11 <= -1) {
                        if (~(class593.field8294 - -class593.field8294) > ~var11) {
                            return;
                        }
                    } else {
                        var11 = 0;
                    }
                    int var12 = -class428.field5737 + arg3.field2970 + class593.field8294;
                    if (~(class593.field8294 + class593.field8294) <= ~var12) {
                        if (~var12 > -1) {
                            return;
                        }
                    } else {
                        var12 = class593.field8294 - -class593.field8294;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class449.field5945[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        float var14 = (float) (-arg3.field2974[0] + class305.field4002);
                        if (var14 < 0.0F) {
                            var14 *= -1.0F;
                        }
                        if (!((float) class713.field9905 > var14)) {
                            if (class661.method3717(0, arg1 + -12702, arg3)) {
                                if (class661.method3717(1, -12702, arg3)) {
                                    if (class661.method3717(2, arg1 ^ -12702, arg3)) {
                                        if (class661.method3717(3, -12702, arg3)) {
                                            class473.field6351[class533.field7400++] = arg3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (~arg3.field2972 != -17 && arg3.field2972 != 8) {
                if (arg3.field2972 == 4) {
                    float var15 = (float) (arg3.field2971[0] + -class560.field7905);
                    if (!(var15 <= (float) class13.field226)) {
                        int var16 = -class216.field2924 + class593.field8294 + arg3.field2962;
                        if (~var16 > -1) {
                            var16 = 0;
                        } else if (~(class593.field8294 + class593.field8294) > ~var16) {
                            return;
                        }
                        int var17 = -class216.field2924 + arg3.field2963 - -class593.field8294;
                        if (~(class593.field8294 + class593.field8294) > ~var17) {
                            var17 = class593.field8294 + class593.field8294;
                        } else if (var17 < 0) {
                            return;
                        }
                        int var18 = class593.field8294 + arg3.field2964 + -class428.field5737;
                        if (~var18 <= -1) {
                            if (~(class593.field8294 + class593.field8294) > ~var18) {
                                return;
                            }
                        } else {
                            var18 = 0;
                        }
                        int var19 = -class428.field5737 + arg3.field2970 - -class593.field8294;
                        if (class593.field8294 + class593.field8294 < var19) {
                            var19 = class593.field8294 - -class593.field8294;
                        } else if (~var19 > -1) {
                            return;
                        }
                        boolean var20 = false;
                        label295: for (int var21 = var18; ~var19 <= ~var21; ++var21) {
                            for (int var22 = var16; var22 <= var17; ++var22) {
                                if (class449.field5945[var21][var22]) {
                                    var20 = true;
                                    break label295;
                                }
                            }
                        }
                        if (var20) {
                            if (class661.method3717(0, -12702, arg3)) {
                                if (class661.method3717(1, -12702, arg3)) {
                                    if (class661.method3717(2, -12702, arg3)) {
                                        if (class661.method3717(3, -12702, arg3)) {
                                            class473.field6351[class533.field7400++] = arg3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int var23 = class593.field8294 + arg3.field2964 + -class428.field5737;
                if (~var23 <= -1 && class593.field8294 + class593.field8294 >= var23) {
                    int var24 = arg3.field2962 - class216.field2924 + class593.field8294;
                    if (var24 >= 0 && ~var24 >= ~(class593.field8294 - -class593.field8294)) {
                        if (class449.field5945[var23][var24]) {
                            float var25 = (float) (-arg3.field2968[0] + class358.field4625);
                            if (var25 < 0.0F) {
                                var25 *= -1.0F;
                            }
                            float var26 = (float) (-arg3.field2974[0] + class305.field4002);
                            if (var26 < 0.0F) {
                                var26 *= -1.0F;
                            }
                            if (!(var25 < (float) class713.field9905) || !((float) class713.field9905 > var26)) {
                                if (class661.method3717(0, -12702, arg3)) {
                                    if (class661.method3717(1, -12702, arg3)) {
                                        if (class661.method3717(2, -12702, arg3)) {
                                            if (class661.method3717(3, -12702, arg3)) {
                                                class473.field6351[class533.field7400++] = arg3;
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

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IZI)Z", line = 708)
    public static final boolean method2487(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return false;
        } else {
            ++field5808;
            return (arg0 & 65536) != 0;
        }
    }
}
