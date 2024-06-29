import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class578 extends class204 {

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "[Lsha;")
    public static class115[] field8118;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZIII)V", line = 7)
    public static final void method3384(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field8125;
        if (class59.field688 == null) {
            class111.field1332.method2822(arg4, arg3, arg5, 1, arg1, -16777216);
        } else if (class724.field10031.field3470 >= 0 && class724.field10031.field3470 < class741.field10208 * 512 && ~class724.field10031.field3460 <= -1 && ~class724.field10031.field3460 > ~(class525.field7224 * 512)) {
            ++class137.field1758;
            if (class724.field10031 != null && class724.field10031.field3470 + -((class724.field10031.method3744(1) - 1) * 256) >> 9 == class683.field9568 && ~(class724.field10031.field3460 - -256 - class724.field10031.method3744(1) * 256 >> 9) == ~class461.field6447) {
                class683.field9568 = -1;
                class461.field6447 = -1;
                class313.method2014(-128);
            }
            class780.method4295(74);
            if (!arg2) {
                class128.method886(108);
            }
            class532.method3155(3);
            class235.method1606((byte) -104, true, arg3, arg1, arg4, arg5);
            int var6 = class492.field6786;
            int var7 = class367.field5274;
            class775.field10662 = class775.field10669;
            int var8 = class472.field6538;
            int var9 = class576.field8099;
            if (arg0 <= 56) {
                method3385(2);
            }
            if (~class695.field9691 == -2) {
                int var10 = (int) class514.field7053;
                if (~var10 > ~(class480.field6649 >> 8)) {
                    var10 = class480.field6649 >> 8;
                }
                if (class412.field5778[4] && ~(class692.field9665[4] - -128) < ~var10) {
                    var10 = class692.field9665[4] + 128;
                }
                int var11 = 16383 & (int) class702.field9790 + class68.field748;
                class461.method2776(class693.field9671, var11, var10, -23064, class548.field7650, var9, class373.method2316(class724.field10031.field3470, class435.field6040, class724.field10031.field3460, -103) - 200, (var10 >> 3) * 3 + 600 << 2);
            } else if (~class695.field9691 == -5) {
                int var12 = (int) class514.field7053;
                if (var12 < class480.field6649 >> 8) {
                    var12 = class480.field6649 >> 8;
                }
                if (class412.field5778[4] && ~(class692.field9665[4] + 128) < ~var12) {
                    var12 = class692.field9665[4] + 128;
                }
                int var13 = (int) class702.field9790 & 16383;
                class461.method2776(class693.field9671, var13, var12, -23064, class548.field7650, var9, class373.method2316(class568.field8011, class435.field6040, class177.field2234, 60) + -200, (var12 >> 3) * 3 + 600 << 2);
            } else if (~class695.field9691 == -6) {
                class544.method3223(var9, 100);
            }
            int var14 = class497.field6818;
            int var15 = class479.field6645;
            int var16 = class412.field5779;
            int var17 = class472.field6537;
            int var18 = class326.field4589;
            for (int var19 = 0; ~var19 > -6; ++var19) {
                if (class412.field5778[var19]) {
                    int var22 = (int) ((double) (-class177.field2237[var19]) + (double) (class177.field2237[var19] * 2 + 1) * Math.random() + Math.sin((double) class646.field9036[var19] / 100.0D * (double) class189.field2364[var19]) * (double) class692.field9665[var19]);
                    if (var19 == 1) {
                        class479.field6645 += var22 << 2;
                    }
                    if (var19 == 4) {
                        class472.field6537 += var22;
                        if (~class472.field6537 <= -1025) {
                            if (~class472.field6537 < -3073) {
                                class472.field6537 = 3072;
                            }
                        } else {
                            class472.field6537 = 1024;
                        }
                    }
                    if (var19 == 2) {
                        class412.field5779 += var22 << 2;
                    }
                    if (var19 == 0) {
                        class497.field6818 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class326.field4589 = class326.field4589 - -var22 & 16383;
                    }
                }
            }
            if (class497.field6818 < 0) {
                class497.field6818 = 0;
            }
            if (~class497.field6818 < ~((class414.field5796 << 9) - 1)) {
                class497.field6818 = (class414.field5796 << 9) + -1;
            }
            if (class412.field5779 < 0) {
                class412.field5779 = 0;
            }
            if ((class704.field9799 << 9) + -1 < class412.field5779) {
                class412.field5779 = (class704.field9799 << 9) - 1;
            }
            class73.method546((byte) -98);
            class56.method470(11192);
            class111.field1332.method225(var7, var8, var6 + var7, var8 - -var9);
            class35.method287(1, true);
            if (!class55.field651) {
                class111.field1332.method226();
                int var20 = class56.field664;
                if (class516.field7081 == null) {
                    class111.field1332.method230(var20);
                } else {
                    class516.field7081.method2305(-1, var7, var8, var6, var20, class111.field1332, class472.field6537, var9, class326.field4589, class759.field10435 << 3);
                }
            } else {
                class525.method3124(103, class56.field664);
                if (class775.field10662 != class702.field9785) {
                    class282.field4043 = true;
                }
                class702.field9785 = class775.field10662;
            }
            class482.method2865(23105);
            class732.field10111.method39(class497.field6818, class479.field6645, class412.field5779, -class472.field6537 & 16383, -class326.field4589 & 16383, -class480.field6657 & 16383);
            class111.field1332.method194(class732.field10111);
            class111.field1332.method242(var7 - -(var6 / 2), var9 / 2 + var8, class140.field1789 << 1, class140.field1789 << 1);
            class746.method4135(var9 / 2 + var8, class140.field1789 << 1, class140.field1789 << 1, var6 / 2 + var7, (byte) 110);
            class447.method2709(16383 & -class326.field4589, false, class479.field6645, 16383 & -class480.field6657, class412.field5779, class497.field6818, -class472.field6537 & 16383);
            byte var21 = class688.field9602.field8532.method4280((byte) -98) != 2 ? 1 : (byte) class137.field1758;
            if (class55.field651) {
                class275.method1792(16383 & -class326.field4589, (byte) -31, 16383 & -class472.field6537, 16383 & -class480.field6657);
                class39.method311(class631.field8828, class244.field3608, class688.field9602.field8512.method2542((byte) -98) == 0, class473.field6554, class724.field10031.field3467 + 1, class479.field6645, class724.field10031.field3470 >> 9, class497.field6818, class412.field5779, class213.field2953, 0, class533.field7336, var21, class724.field10031.field3460 >> 9, class775.field10662, true, class679.field9491, class33.field319);
            } else {
                class513.method3057(class533.field7336, class497.field6818, class479.field6645, class412.field5779, class244.field3608, class213.field2953, class33.field319, class473.field6554, class679.field9491, class631.field8828, class724.field10031.field3467 + 1, var21, class724.field10031.field3470 >> 9, class724.field10031.field3460 >> 9, class688.field9602.field8512.method2542((byte) -98) == 0, true, !class529.field7284 ? -1 : class775.field10662, 0, false);
            }
            class482.method2865(23105);
            if (class664.field9331 == 10) {
                class323.method2049(256, var6, var7, 2, var9, 256, var8);
                class777.method4279(var9, var6, 256, false, var7, 256, var8);
                class248.method1671(256, 256, var8, -23651, var7, var9, var6);
                class662.method3782(var8, var7, (byte) -123, var6, var9);
            }
            class668.method3816();
            class412.field5779 = var16;
            class497.field6818 = var14;
            class472.field6537 = var17;
            class479.field6645 = var15;
            class326.field4589 = var18;
            if (class341.field4952 && ~class68.field750.method2559(2) == -1) {
                class341.field4952 = false;
            }
            if (class341.field4952) {
                class111.field1332.method2822(var9, var6, var7, 1, var8, -16777216);
                class323.method2046(class582.field8243, class111.field1332, false, false, class559.field7865, class712.field9865.method3999(class553.field7667, (byte) -119));
            }
            class35.method287(1, false);
        } else {
            class111.field1332.method2822(arg4, arg3, arg5, 1, arg1, -16777216);
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V", line = 224)
    public static void method3385(int arg0) {
        field8118 = null;
        if (arg0 > -60) {
            method3385(-61);
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lfs;)V", line = 235)
    public class578(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)I", line = 240)
    public final int method490(byte arg0) {
        if (arg0 < 83) {
            return -84;
        } else {
            ++field8126;
            return 1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I", line = 252)
    public final int method487(int arg0, int arg1) {
        ++field8122;
        if (super.field2853.method3505(126)) {
            return 3;
        } else {
            int var3 = -50 / ((-57 - arg1) / 60);
            return 1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 266)
    public final void method486(int arg0) {
        if (super.field2853.method3505(arg0 + 4717)) {
            super.field2852 = 0;
        }
        ++field8121;
        if (~super.field2852 != -2 && super.field2852 != 0) {
            super.field2852 = this.method490((byte) 101);
        }
        if (arg0 != -4591) {
            field8118 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILvt;II)Ljava/awt/Frame;", line = 282)
    public static final Frame method3386(int arg0, int arg1, int arg2, class768 arg3, int arg4, int arg5) {
        ++field8119;
        if (!arg3.method4240((byte) 109)) {
            return null;
        } else {
            if (arg5 == 0) {
                class577[] var6 = class418.method2531((byte) -109, arg3);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; ~var6.length < ~var8; ++var8) {
                    if (var6[var8].field8111 == arg1 && var6[var8].field8107 == arg0 && (arg4 == 0 || ~var6[var8].field8112 == ~arg4) && (!var7 || arg5 < var6[var8].field8116)) {
                        var7 = true;
                        arg5 = var6[var8].field8116;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class344 var9 = arg3.method4228((byte) 122, arg1, arg0, arg5, arg4);
            while (var9.field4970 == 0) {
                class730.method4066((byte) -45, 10L);
            }
            Frame var10 = (Frame) var9.field4975;
            if (var10 == null) {
                return null;
            } else {
                if (arg2 != -16777216) {
                    field8118 = null;
                }
                if (~var9.field4970 == -3) {
                    class119.method851(arg3, -1, var10);
                    return null;
                } else {
                    return var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(ILfs;)V", line = 354)
    public class578(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)Z", line = 357)
    public final boolean method3387(int arg0) {
        ++field8124;
        if (super.field2853.method3505(126)) {
            return false;
        } else {
            int var2 = 34 / ((arg0 - -13) / 44);
            return true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)I", line = 370)
    public final int method3388(byte arg0) {
        ++field8123;
        return arg0 != -98 ? -93 : super.field2852;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(II)V", line = 382)
    public final void method488(int arg0, int arg1) {
        if (arg1 >= -105) {
            field8118 = null;
        }
        super.field2852 = arg0;
        ++field8120;
    }
}
