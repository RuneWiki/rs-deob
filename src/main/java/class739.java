import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class739 extends class54 {

    @OriginalMember(owner = "client!lga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10748 = new String[] { method5394(method5393("eAY^U!")), method5394(method5393("eAY^S!")), method5394(method5393("eAY^R!")), method5394(method5393("eAY^P!")), method5394(method5393("eAY^T!")), method5394(method5393("eAY^Q!")), method5394(method5393("r\b\u0016^j")), method5394(method5393("eAY^V!")), method5394(method5393("gST\u001c")), method5394(method5393("eAY^Z!")) };

    @OriginalMember(owner = "client!lga", name = "t", descriptor = "Lel;")
    public static class573 field10744 = new class573(121, 3);

    @OriginalMember(owner = "client!lga", name = "r", descriptor = "I")
    public static int field10739;

    @OriginalMember(owner = "client!lga", name = "o", descriptor = "I")
    public static int field10740;

    @OriginalMember(owner = "client!lga", name = "s", descriptor = "I")
    public static int field10741;

    @OriginalMember(owner = "client!lga", name = "p", descriptor = "I")
    public static int field10742;

    @OriginalMember(owner = "client!lga", name = "q", descriptor = "I")
    public static int field10743;

    @OriginalMember(owner = "client!lga", name = "u", descriptor = "I")
    public static int field10745;

    @OriginalMember(owner = "client!lga", name = "m", descriptor = "I")
    public static int field10746;

    @OriginalMember(owner = "client!lga", name = "n", descriptor = "I")
    public static int field10747;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "(Z)I", line = 4)
    public final int method5389(boolean arg0) {
        try {
            ++field10740;
            return arg0 ? 2 : super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10748[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lhia;)V", line = 16)
    public class739(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(IB)I", line = 20)
    public final int method109(int arg0, byte arg1) {
        try {
            if (arg1 > -106) {
                this.method109(14, (byte) 94);
            }
            ++field10746;
            return !class301.method2530(true, super.field589.field812.method1610(false)) ? 3 : 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10748[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Z)V", line = 35)
    public final void method115(boolean arg0) {
        try {
            ++field10745;
            if (!arg0) {
                field10744 = null;
            }
            if (super.field589.field812.method1612(false) && !class301.method2530(true, super.field589.field812.method1610(false))) {
                super.field593 = 0;
            }
            if (super.field593 < 0 || super.field593 > 1) {
                super.field593 = this.method111(!arg0);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10748[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(ILhia;)V", line = 54)
    public class739(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)V", line = 57)
    public final void method113(int arg0, int arg1) {
        try {
            super.field593 = arg1;
            if (arg0 != 0) {
                method5390(16);
            }
            ++field10743;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10748[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(Z)I", line = 68)
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                this.method113(57, 10);
            }
            ++field10742;
            return 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10748[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "(I)V", line = 80)
    public static void method5390(int arg0) {
        try {
            if (arg0 == Integer.MIN_VALUE) {
                field10744 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10748[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IILha;Lco;BLsb;)Z", line = 91)
    public static final boolean method5391(int arg0, int arg1, class66 arg2, class131 arg3, byte arg4, class306 arg5) {
        try {
            ++field10741;
            int var6 = Integer.MAX_VALUE;
            int var7 = Integer.MIN_VALUE;
            int var8 = 40 / ((arg4 - -50) / 61);
            int var9 = Integer.MAX_VALUE;
            int var10 = Integer.MIN_VALUE;
            if (arg5.field4780 != null) {
                var9 = -((-class161.field2168 + arg5.field4801 - -arg3.field1536) * (-class161.field2165 + class161.field2183) / (-class161.field2168 + class161.field2177)) + class161.field2183;
                var10 = -((class161.field2183 - class161.field2165) * (arg5.field4810 - -arg3.field1536 + -class161.field2168) / (-class161.field2168 + class161.field2177)) + class161.field2183;
                var7 = (-class161.field2184 + arg5.field4792 + arg3.field1534) * (-class161.field2166 + class161.field2179) / (-class161.field2184 + class161.field2178) + class161.field2166;
                var6 = (-class161.field2184 + arg5.field4822 + arg3.field1534) * (-class161.field2166 + class161.field2179) / (-class161.field2184 + class161.field2178) + class161.field2166;
            }
            class581 var11 = null;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            if (arg5.field4818 != -1) {
                if (arg3.field1528 && ~arg5.field4794 != 0) {
                    var11 = arg5.method2601(true, -78, arg2);
                } else {
                    var11 = arg5.method2601(false, -113, arg2);
                }
                if (var11 != null) {
                    var12 = arg3.field1531 + -(var11.method988() - -1 >> 1);
                    if (var6 > var12) {
                        var6 = var12;
                    }
                    var13 = arg3.field1531 + (var11.method988() - -1 >> 1);
                    var14 = arg3.field1535 - (1 + var11.method997() >> 1);
                    if (var7 < var13) {
                        var7 = var13;
                    }
                    var15 = arg3.field1535 + (var11.method997() + 1 >> 1);
                    if (~var9 < ~var14) {
                        var9 = var14;
                    }
                    if (var15 > var10) {
                        var10 = var15;
                    }
                }
            }
            class718 var16 = null;
            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            int var20 = 0;
            int var21 = 0;
            int var22 = 0;
            int var23 = 0;
            int var24 = 0;
            if (arg5.field4803 != null) {
                var16 = class75.method675(arg5.field4828, 1);
                if (var16 != null) {
                    var17 = class493.field7083.method4321(arg5.field4803, (class581[]) null, (byte) -18, class199.field3107, (int[]) null);
                    var18 = (-class161.field2166 + class161.field2179) * arg5.field4824 / (-class161.field2184 + class161.field2178) + arg3.field1531;
                    int var25 = -((class161.field2183 - class161.field2165) * arg5.field4799 / (-class161.field2168 + class161.field2177)) + arg3.field1535;
                    if (var11 == null) {
                        var19 = var25 - var17 * var16.method5238() / 2;
                    } else {
                        var19 = var25 - ((var11.method997() >> 1) - -(var17 * var16.method5233()));
                    }
                    for (int var26 = 0; var26 < var17; ++var26) {
                        String var27 = class199.field3107[var26];
                        if (var17 + -1 > var26) {
                            var27 = var27.substring(0, var27.length() - 4);
                        }
                        int var28 = var16.method5235(var27);
                        if (var20 < var28) {
                            var20 = var28;
                        }
                    }
                    var21 = -(var20 / 2) + var18 + arg1;
                    if (var21 < var6) {
                        var6 = var21;
                    }
                    var22 = var18 - -(var20 / 2) + arg1;
                    if (var7 < var22) {
                        var7 = var22;
                    }
                    var23 = var19 - -arg0;
                    var24 = arg0 + var17 * var16.method5233() + var19;
                    if (~var23 > ~var9) {
                        var9 = var23;
                    }
                    if (~var24 < ~var10) {
                        var10 = var24;
                    }
                }
            }
            if (~var7 <= ~class161.field2166 && var6 <= class161.field2179 && var10 >= class161.field2165 && var9 <= class161.field2183) {
                class161.method1373(arg2, arg3, arg5);
                if (var11 != null) {
                    if (class352.field5439 > 0 && (class84.field942 != -1 && ~class84.field942 == ~arg3.field1532 || ~class599.field8812 != 0 && ~class599.field8812 == ~arg5.field4825)) {
                        int var29;
                        if (~class180.field2496 < -51) {
                            var29 = -(class180.field2496 * 2) + 200;
                        } else {
                            var29 = class180.field2496 * 2;
                        }
                        int var30 = 16776960 | var29 << 24;
                        arg2.method533(arg3.field1531, var30, arg3.field1535, var11.method991() / 2 - -7, 9261);
                        arg2.method533(arg3.field1531, var30, arg3.field1535, 5 + var11.method991() / 2, 9261);
                        arg2.method533(arg3.field1531, var30, arg3.field1535, var11.method991() / 2 - -3, 9261);
                        arg2.method533(arg3.field1531, var30, arg3.field1535, var11.method991() / 2 + 1, 9261);
                        arg2.method533(arg3.field1531, var30, arg3.field1535, var11.method991() / 2, 9261);
                    }
                    var11.method4347(arg3.field1531 + -(var11.method988() >> 1), arg3.field1535 - (var11.method997() >> 1));
                }
                if (arg5.field4803 != null && var16 != null) {
                    class620.method4628(arg3, var20, arg2, var17, var16, var18, var19, (byte) 36, arg5);
                }
                if (~arg5.field4818 != 0 || arg5.field4803 != null) {
                    class238 var31 = new class238(arg3);
                    var31.field3610 = var21;
                    var31.field3616 = var24;
                    var31.field3614 = var12;
                    var31.field3609 = var22;
                    var31.field3607 = var14;
                    var31.field3615 = var13;
                    var31.field3618 = var23;
                    var31.field3606 = var15;
                    class728.field10550.method3868(-38, var31);
                }
                return false;
            } else {
                return true;
            }
        } catch (RuntimeException var33) {
            throw class759.method5498(var33, field10748[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10748[6] : field10748[8]) + ',' + (arg3 != null ? field10748[6] : field10748[8]) + ',' + arg4 + ',' + (arg5 != null ? field10748[6] : field10748[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "(I)Z", line = 291)
    public final boolean method5392(int arg0) {
        try {
            if (arg0 != -10243) {
                return false;
            } else {
                ++field10747;
                return class301.method2530(true, super.field589.field812.method1610(false));
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10748[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5393(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5394(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
