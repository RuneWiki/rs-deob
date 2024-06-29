import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class304 extends class649 {

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "Z")
    public boolean field4622 = false;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "Z")
    private boolean field4634 = true;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "Z")
    public static boolean field4618 = false;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field4623 = 0;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4629;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "[I")
    public static int[] field4635;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(IZ)V", line = 6)
    public final void method1998(int arg0, boolean arg1) {
        ++field4625;
        if (arg0 != 31) {
            method2002(83);
        }
        this.field4634 = arg1;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)Z", line = 21)
    public final boolean method1999(int arg0) {
        ++field4620;
        if (!super.field9224.method2290(-21318).method3485(673)) {
            return false;
        } else {
            return arg0 != -16181 ? true : true;
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lhs;)V", line = 37)
    public class304(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)Z", line = 41)
    public final boolean method2000(int arg0) {
        ++field4630;
        if (arg0 != 2) {
            this.method1998(-36, true);
        }
        return this.field4634;
    }

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)V", line = 52)
    public static final void method2001(int arg0) {
        class719.field10080 = arg0;
        for (int var1 = 0; var1 < class42.field727; ++var1) {
            for (int var2 = 0; var2 < class54.field870; ++var2) {
                if (class488.field7062[arg0][var1][var2] == null) {
                    class488.field7062[arg0][var1][var2] = new class114(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "(I)V", line = 76)
    public static void method2002(int arg0) {
        field4635 = null;
        field4629 = null;
        int var1 = -128 % ((-69 - arg0) / 34);
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V", line = 93)
    public final void method134(int arg0) {
        if (!super.field9224.method2290(-21318).method3485(673)) {
            super.field9223 = 0;
        }
        ++field4632;
        if (~super.field9223 > -1 || ~super.field9223 < -6) {
            super.field9223 = this.method135(65);
        }
        if (arg0 != 1) {
            this.method1999(56);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V", line = 109)
    public static final void method2003(byte arg0) {
        if (!class32.field304) {
            class467.field6801 = class125.field1929 != -1 && ~class608.field8588 <= ~class125.field1929 || ~((!class207.field3468 ? 22 : 26) + class608.field8588 * 16) < ~class412.field6066;
        }
        ++field4617;
        class291.field4480.method3465(0);
        class696.field9873.method3465(0);
        for (class208 var1 = (class208) class344.field5093.method3463((byte) -50); var1 != null; var1 = (class208) class344.field5093.method3469((byte) 107)) {
            int var38 = var1.field3488;
            if (~var38 > -1001) {
                var1.method636((byte) 97);
                if (~var38 != -22 && ~var38 != -6 && ~var38 != -46 && ~var38 != -49 && ~var38 != -52 && ~var38 != -21 && ~var38 != -11) {
                    class291.field4480.method3472(85, var1);
                } else {
                    class696.field9873.method3472(127, var1);
                }
            }
        }
        class291.field4480.method3471(-101, class344.field5093);
        class696.field9873.method3471(-100, class344.field5093);
        if (class608.field8588 > 1) {
            if (class637.field8955 && class543.field7749.method455(-14469, 81) && ~class608.field8588 < -3) {
                class237.field3813 = (class208) class344.field5093.field8547.field1042.field1042;
            } else {
                class237.field3813 = (class208) class344.field5093.field8547.field1042;
            }
            class656.field9338 = (class208) class344.field5093.field8547.field1042;
        } else {
            class237.field3813 = null;
            class656.field9338 = null;
        }
        int var2 = -1;
        class703 var3 = (class703) client.field6492.method3463((byte) -50);
        if (arg0 >= 35) {
            if (var3 != null) {
                var2 = var3.method3022(69);
            }
            if (class32.field304) {
                if (~var2 == 0) {
                    int var4 = class651.field9244.method2915(-8463);
                    int var5 = class651.field9244.method2921((byte) 106);
                    boolean var6 = false;
                    if (class74.field1107 != null) {
                        if (var4 >= class598.field8460 - 10 && ~var4 >= ~(class598.field8460 + class265.field4129 + 10) && var5 >= class85.field1258 + -10 && ~var5 >= ~(class85.field1258 + field4621 + 10)) {
                            var6 = true;
                        } else {
                            class637.method3608((byte) 101);
                        }
                    }
                    if (!var6) {
                        if (~(class713.field10029 + -10) >= ~var4 && class713.field10029 + 10 + class662.field9427 >= var4 && ~(class677.field9542 + -10) >= ~var5 && class677.field9542 + class232.field3742 + 10 >= var5) {
                            if (class467.field6801) {
                                int var7 = -1;
                                int var8 = -1;
                                for (int var9 = 0; ~class124.field1898 < ~var9; ++var9) {
                                    if (!class207.field3468) {
                                        int var10 = class677.field9542 - (-(var9 * 16) + -31);
                                        if (var10 + -13 < var5 && var10 + 3 > var5) {
                                            var8 = var10 + -13;
                                            var7 = var9;
                                            break;
                                        }
                                    } else {
                                        int var11 = var9 * 16 + 33 + class677.field9542;
                                        if (~var5 < ~(var11 + -13) && ~(var11 - -4) < ~var5) {
                                            var8 = var11 + -13;
                                            var7 = var9;
                                            break;
                                        }
                                    }
                                }
                                if (~var7 != 0) {
                                    int var12 = 0;
                                    class271 var13 = new class271(class26.field263);
                                    for (class180 var14 = (class180) var13.method1783(103); var14 != null; var14 = (class180) var13.method1784((byte) 36)) {
                                        if (var7 == var12) {
                                            if (~var14.field3056 < -2) {
                                                class42.method451(var8, var5, var14, (byte) 110);
                                            }
                                            break;
                                        }
                                        ++var12;
                                    }
                                }
                            }
                        } else {
                            class25.method146((byte) 97);
                        }
                    }
                }
                if (~var2 == -1) {
                    int var15 = var3.method3020(-4);
                    int var16 = var3.method3017((byte) 61);
                    if (class74.field1107 != null && ~var15 <= ~class598.field8460 && ~var15 >= ~(class598.field8460 + class265.field4129) && ~var16 <= ~class85.field1258 && var16 <= class85.field1258 + field4621) {
                        int var17 = -1;
                        for (int var18 = 0; class74.field1107.field3056 > var18; ++var18) {
                            if (class207.field3468) {
                                int var22 = var18 * 16 + (class85.field1258 - -33);
                                if (var16 > var22 - 13 && ~var16 > ~(var22 + 4)) {
                                    var17 = var18;
                                }
                            } else {
                                int var23 = var18 * 16 + 31 + class85.field1258;
                                if (var16 > var23 + -13 && ~(var23 + 3) < ~var16) {
                                    var17 = var18;
                                }
                            }
                        }
                        if (var17 != -1) {
                            int var19 = 0;
                            class271 var20 = new class271(class74.field1107.field3055);
                            for (class208 var21 = (class208) var20.method1783(-54); var21 != null; var21 = (class208) var20.method1784((byte) 51)) {
                                if (~var17 == ~var19) {
                                    class370.method2364(true, var16, var15, var21);
                                    break;
                                }
                                ++var19;
                            }
                        }
                        class25.method146((byte) 59);
                        return;
                    }
                    if (~var15 <= ~class713.field10029 && ~(class713.field10029 + class662.field9427) <= ~var15 && var16 >= class677.field9542 && class677.field9542 + class232.field3742 >= var16) {
                        if (class467.field6801) {
                            int var24 = -1;
                            for (int var25 = 0; var25 < class124.field1898; ++var25) {
                                if (class207.field3468) {
                                    int var26 = class677.field9542 - -(var25 * 16) + 33;
                                    if (~(var26 + -13) > ~var16 && var26 + 4 > var16) {
                                        var24 = var25;
                                        break;
                                    }
                                } else {
                                    int var27 = var25 * 16 + class677.field9542 + 31;
                                    if (~var16 < ~(var27 + -13) && var27 + 3 > var16) {
                                        var24 = var25;
                                        break;
                                    }
                                }
                            }
                            if (~var24 != 0) {
                                int var28 = 0;
                                class271 var29 = new class271(class26.field263);
                                for (class180 var30 = (class180) var29.method1783(-25); var30 != null; var30 = (class180) var29.method1784((byte) 77)) {
                                    if (var24 == var28) {
                                        class370.method2364(true, var16, var15, (class208) var30.field3055.field9552.field3449);
                                        class25.method146((byte) 76);
                                        return;
                                    }
                                    ++var28;
                                }
                                return;
                            }
                        } else {
                            int var31 = -1;
                            for (int var32 = 0; var32 < class608.field8588; ++var32) {
                                if (class207.field3468) {
                                    int var36 = (-var32 + -1 + class608.field8588) * 16 + 33 + class677.field9542;
                                    if (~(var36 + -13) > ~var16 && var16 < var36 - -4) {
                                        var31 = var32;
                                    }
                                } else {
                                    int var37 = (class608.field8588 + -1 - var32) * 16 + class677.field9542 + 31;
                                    if (~(var37 + -13) > ~var16 && ~(var37 - -3) < ~var16) {
                                        var31 = var32;
                                    }
                                }
                            }
                            if (var31 != -1) {
                                int var33 = 0;
                                class40 var34 = new class40(class344.field5093);
                                for (class208 var35 = (class208) var34.method444(102); var35 != null; var35 = (class208) var34.method446((byte) 122)) {
                                    if (var31 == var33) {
                                        class370.method2364(true, var16, var15, var35);
                                        break;
                                    }
                                    ++var33;
                                }
                            }
                            class25.method146((byte) 77);
                        }
                        return;
                    }
                }
            } else {
                if (var2 == 0 && (class70.field1083 == 1 && ~class608.field8588 < -3 || class563.method3258(false))) {
                    var2 = 2;
                }
                if (~var2 == -3 && ~class608.field8588 < -1 && var3 != null) {
                    if (class146.field2298 == null && ~class510.field7401 == -1) {
                        class569.method3301(var3.method3017((byte) 61), var3.method3020(-4), false);
                    } else {
                        class274.field4187 = 2;
                    }
                }
                if (~var2 == -1) {
                    if (class237.field3813 == null) {
                        if (class552.field7867) {
                            class531.method3143((byte) -65);
                        }
                    } else {
                        class32.method164(-29861);
                    }
                }
                if (class146.field2298 != null || class510.field7401 != 0) {
                    return;
                }
                class469.field6822 = null;
                class274.field4187 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IB)V", line = 496)
    public final void method129(int arg0, byte arg1) {
        ++field4627;
        if (arg1 >= -120) {
            this.field4634 = false;
        }
        this.field4622 = false;
        super.field9223 = arg0;
    }

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "(I)I", line = 509)
    public final int method2004(int arg0) {
        if (arg0 != 3) {
            this.method129(113, (byte) 102);
        }
        ++field4633;
        return super.field9223;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(ILhs;)V", line = 523)
    public class304(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)I", line = 530)
    public final int method133(int arg0, int arg1) {
        ++field4626;
        if (!super.field9224.method2290(-21318).method3485(673)) {
            return 3;
        } else if (~arg1 == -4 && !class460.method2818(arg0 ^ -18649, "jagdx")) {
            return 3;
        } else {
            if (arg0 != 18648) {
                this.method134(112);
            }
            return 2;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)I", line = 555)
    public final int method135(int arg0) {
        this.field4622 = true;
        ++field4631;
        if (!super.field9224.method2290(-21318).method3485(673)) {
            return 0;
        } else {
            int var2 = 126 / ((-18 - arg0) / 50);
            return 2;
        }
    }
}
