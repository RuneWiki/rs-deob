import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class465 extends class238 {

    @OriginalMember(owner = "client!ko", name = "ib", descriptor = "Z")
    public boolean field6680 = false;

    @OriginalMember(owner = "client!ko", name = "sb", descriptor = "Z")
    public boolean field6690 = false;

    @OriginalMember(owner = "client!ko", name = "hb", descriptor = "Z")
    public boolean field6679 = false;

    @OriginalMember(owner = "client!ko", name = "zb", descriptor = "Z")
    public boolean field6697 = false;

    @OriginalMember(owner = "client!ko", name = "Db", descriptor = "Z")
    public boolean field6701 = false;

    @OriginalMember(owner = "client!ko", name = "W", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!ko", name = "jb", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!ko", name = "kb", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!ko", name = "lb", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!ko", name = "mb", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!ko", name = "nb", descriptor = "I")
    public int field6685;

    @OriginalMember(owner = "client!ko", name = "ob", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!ko", name = "pb", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!ko", name = "qb", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!ko", name = "rb", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!ko", name = "tb", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!ko", name = "ub", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!ko", name = "vb", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!ko", name = "wb", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!ko", name = "xb", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!ko", name = "yb", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!ko", name = "Ab", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!ko", name = "Bb", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!ko", name = "Cb", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!ko", name = "Eb", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(III)I")
    private final int method2740(int arg0, int arg1, int arg2) {
        ++field6688;
        if (arg0 > -104) {
            this.field6697 = true;
        }
        byte var4;
        if (arg1 <= 20000) {
            if (~arg1 >= -10001) {
                if (~arg1 < -5001) {
                    var4 = 2;
                    this.method2743((byte) -123);
                } else {
                    this.method2751(100, true);
                    var4 = 1;
                }
            } else {
                this.method2745(-9489);
                var4 = 3;
            }
        } else {
            this.method2744((byte) 94);
            var4 = 4;
        }
        if (~class328.field4859 != ~arg2) {
            super.field3722 = arg2;
            class33.method363(-30052, arg2);
        }
        this.method2753(false, class368.field5267);
        return var4;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILmo;)V")
    private final void method2741(int arg0, class695 arg1) {
        ++field6698;
        if (~(arg1.field9796.length + -arg1.field9761) <= -2) {
            int var3 = arg1.method3826(false);
            if (~var3 <= -1 && ~var3 >= -23) {
                byte var4;
                if (var3 != 22) {
                    if (var3 != 21) {
                        if (var3 != 20) {
                            if (var3 != 19) {
                                if (~var3 == -19) {
                                    var4 = 41;
                                } else if (~var3 == -18) {
                                    var4 = 40;
                                } else if (var3 == 16) {
                                    var4 = 38;
                                } else if (var3 == 15) {
                                    var4 = 37;
                                } else if (var3 != 14) {
                                    if (~var3 == -14) {
                                        var4 = 35;
                                    } else if (var3 == 12) {
                                        var4 = 34;
                                    } else if (var3 != 11) {
                                        if (~var3 != -11) {
                                            if (~var3 != -10) {
                                                if (var3 == 8) {
                                                    var4 = 30;
                                                } else if (var3 == 7) {
                                                    var4 = 29;
                                                } else if (var3 == 6) {
                                                    var4 = 28;
                                                } else if (var3 != 5) {
                                                    if (var3 == 4) {
                                                        var4 = 24;
                                                    } else if (var3 == 3) {
                                                        var4 = 23;
                                                    } else if (~var3 != -3) {
                                                        if (~var3 == -2) {
                                                            var4 = 23;
                                                        } else {
                                                            var4 = 19;
                                                        }
                                                    } else {
                                                        var4 = 22;
                                                    }
                                                } else {
                                                    var4 = 28;
                                                }
                                            } else {
                                                var4 = 31;
                                            }
                                        } else {
                                            var4 = 32;
                                        }
                                    } else {
                                        var4 = 33;
                                    }
                                } else {
                                    var4 = 36;
                                }
                            } else {
                                var4 = 42;
                            }
                        } else {
                            var4 = 43;
                        }
                    } else {
                        var4 = 44;
                    }
                } else {
                    var4 = 45;
                }
                if (var4 <= arg1.field9796.length + -arg1.field9761) {
                    super.field3725 = arg1.method3826(false);
                    if (super.field3725 >= 1) {
                        if (super.field3725 > 4) {
                            super.field3725 = 4;
                        }
                    } else {
                        super.field3725 = 1;
                    }
                    this.method2752(arg1.method3826(false) == 1, -80);
                    super.field3684 = ~arg1.method3826(false) == -2;
                    super.field3714 = ~arg1.method3826(false) == -2;
                    super.field3694 = arg1.method3826(false) == 1;
                    super.field3711 = ~arg1.method3826(false) == -2 ? 1 : 0;
                    super.field3723 = ~arg1.method3826(false) == -2;
                    if (arg0 != 5181) {
                        this.method2742(true, 58);
                    }
                    super.field3688 = arg1.method3826(false) == 1;
                    super.field3721 = ~arg1.method3826(false) == -2;
                    super.field3686 = arg1.method3826(false);
                    if (~super.field3686 < -3) {
                        super.field3686 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field3719 = arg1.method3826(false);
                    }
                    if (~var3 <= -3) {
                        super.field3696 = ~arg1.method3826(false) == -2;
                        if (~var3 <= -18) {
                            super.field3693 = ~arg1.method3826(false) == -2;
                        }
                    } else {
                        super.field3696 = ~arg1.method3826(false) == -2;
                        arg1.method3826(false);
                    }
                    super.field3705 = ~arg1.method3826(false) == -2;
                    super.field3681 = arg1.method3826(false) == 1;
                    super.field3707 = arg1.method3826(false);
                    if (super.field3707 > 2) {
                        super.field3707 = 2;
                    }
                    super.field3706 = super.field3707;
                    super.field3716 = ~arg1.method3826(false) == -2;
                    super.field3697 = arg1.method3826(false);
                    if (super.field3697 > 127) {
                        super.field3697 = 127;
                    }
                    if (var3 >= 20) {
                        super.field3691 = arg1.method3826(false);
                        if (~super.field3691 < -128) {
                            super.field3691 = 127;
                        }
                    } else {
                        super.field3691 = super.field3697;
                    }
                    super.field3701 = arg1.method3826(false);
                    super.field3687 = arg1.method3826(false);
                    if (super.field3687 > 127) {
                        super.field3687 = 127;
                    }
                    if (~var3 <= -22) {
                        super.field3704 = arg1.method3826(false);
                        if (~super.field3704 < -128) {
                            super.field3704 = 127;
                        }
                    } else {
                        super.field3704 = super.field3701;
                    }
                    if (~var3 <= -2) {
                        super.field3710 = arg1.method3847((byte) 118);
                        super.field3690 = arg1.method3847((byte) 118);
                    }
                    if (var3 >= 3 && ~var3 > -7) {
                        arg1.method3826(false);
                    }
                    if (var3 >= 4) {
                        int var5 = arg1.method3826(false);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (class266.field4022 < 96) {
                            var5 = 0;
                        }
                        class197.method1325(true, var5);
                    }
                    if (var3 >= 5) {
                        super.field3695 = arg1.method3880(8);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field3718 = var6 = arg1.method3826(false);
                    }
                    if (~super.field3718 != -2 && ~super.field3718 != -3) {
                        super.field3718 = 2;
                    }
                    if (var3 >= 7) {
                        super.field3692 = arg1.method3826(false) == 1;
                    }
                    if (~var3 <= -9) {
                        super.field3685 = ~arg1.method3826(false) == -2;
                    }
                    if (~var3 <= -10) {
                        super.field3699 = arg1.method3826(false);
                    }
                    if (~super.field3699 > -1 || super.field3699 > class569.method3242(class266.field4022, 128)) {
                        super.field3699 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field3700 = ~arg1.method3826(false) != -1;
                    }
                    if (var3 >= 11) {
                        super.field3698 = arg1.method3826(false) != 0;
                    }
                    if (var3 >= 12) {
                        super.field3711 = arg1.method3826(false);
                    }
                    if (~super.field3711 > -1 || ~super.field3711 < -3) {
                        super.field3711 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field3683 = ~arg1.method3826(false) == -2;
                    }
                    if (var3 >= 14) {
                        super.field3722 = arg1.method3826(false);
                    } else if (~var6 == -1) {
                        super.field3722 = 2;
                    } else {
                        super.field3722 = 1;
                    }
                    if (super.field3722 < 0 || super.field3722 > 5) {
                        super.field3722 = 2;
                    }
                    if (var3 >= 15) {
                        super.field3682 = arg1.method3826(false);
                        if (~super.field3682 > -1 || ~super.field3682 < -5) {
                            super.field3682 = ~class187.field2693 == -2 ? 2 : 4;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field3724 = ~arg1.method3826(false) == -2;
                        try {
                            if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                super.field3724 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (~var3 > -18 && ~super.field3722 == -1) {
                        super.field3722 = 2;
                    }
                    if (~var3 <= -19) {
                        super.field3708 = arg1.method3826(false);
                        if (super.field3708 < 0 || ~super.field3708 < -5) {
                            super.field3708 = 0;
                        }
                    }
                    if (~var3 <= -20) {
                        super.field3712 = arg1.method3826(false);
                    } else if (super.field3708 != 1 && super.field3708 != 2) {
                        if (~super.field3708 == -4) {
                            super.field3712 = 1;
                        } else {
                            super.field3712 = 0;
                        }
                    } else {
                        super.field3712 = 2;
                    }
                    if (var3 >= 22) {
                        super.field3703 = arg1.method3826(false);
                    }
                    if (super.field3722 == 0 && ~class266.field4022 > -97 && super.field3708 != 1 && ~super.field3708 != -1) {
                        this.method2751(106, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)Z")
    public final boolean method2742(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            ++field6686;
            return ~arg1 != -1 ? true : super.field3715;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
    public final void method2743(byte arg0) {
        this.method2752(true, 126);
        ++field6687;
        super.field3693 = false;
        super.field3686 = super.field3719 = 0;
        super.field3724 = false;
        super.field3696 = false;
        super.field3714 = true;
        super.field3705 = false;
        super.field3681 = false;
        super.field3711 = 0;
        super.field3694 = false;
        super.field3707 = super.field3706 = 0;
        super.field3688 = false;
        super.field3684 = false;
        super.field3723 = false;
        super.field3721 = false;
        class197.method1325(true, 0);
        super.field3700 = false;
        int var2 = 84 / ((-53 - arg0) / 55);
        super.field3683 = true;
        super.field3699 = 0;
        this.method2754(12148);
        this.method2748(2, 2);
        super.field3708 = 2;
        class496.method2869(119);
        class646.method3587((byte) -124);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V")
    public final void method2744(byte arg0) {
        this.method2752(true, arg0 ^ -45);
        if (arg0 == 94) {
            ++field6699;
            super.field3723 = true;
            super.field3714 = true;
            super.field3711 = 1;
            super.field3721 = true;
            super.field3724 = true;
            super.field3705 = true;
            super.field3693 = true;
            super.field3696 = true;
            super.field3688 = true;
            super.field3686 = super.field3719 = 2;
            super.field3684 = true;
            super.field3681 = true;
            super.field3694 = true;
            super.field3707 = super.field3706 = 0;
            if (class266.field4022 <= 95) {
                class197.method1325(true, 0);
            } else {
                class197.method1325(true, 2);
            }
            super.field3700 = false;
            super.field3683 = true;
            super.field3699 = 0;
            this.method2754(12148);
            this.method2748(0, 2);
            super.field3708 = 4;
            class496.method2869(123);
            class646.method3587((byte) -122);
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
    public final void method2745(int arg0) {
        ++field6702;
        this.method2752(true, 116);
        super.field3693 = false;
        super.field3724 = true;
        super.field3688 = true;
        if (arg0 != -9489) {
            this.field6701 = true;
        }
        super.field3694 = true;
        super.field3686 = super.field3719 = 1;
        super.field3684 = true;
        super.field3696 = true;
        super.field3711 = 1;
        super.field3721 = true;
        super.field3723 = true;
        super.field3707 = super.field3706 = 0;
        super.field3714 = true;
        super.field3681 = true;
        super.field3705 = false;
        if (class266.field4022 > 95) {
            class197.method1325(true, 1);
        } else {
            class197.method1325(true, 0);
        }
        super.field3700 = false;
        super.field3683 = true;
        super.field3699 = 0;
        this.method2754(arg0 ^ -2661);
        this.method2748(1, arg0 ^ -9491);
        super.field3708 = 3;
        class496.method2869(arg0 + 9611);
        class646.method3587((byte) -114);
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(II)I")
    public final int method2746(int arg0, int arg1) {
        ++field6678;
        if (this.field6680) {
            return 0;
        } else if (arg0 != 0) {
            return 46;
        } else if (!this.method2747(72, arg1)) {
            return 1;
        } else {
            return !super.field3684 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(II)Z")
    public final boolean method2747(int arg0, int arg1) {
        if (arg0 <= 51) {
            return true;
        } else {
            ++field6696;
            return arg1 == 0 && !this.field6679 ? super.field3715 : true;
        }
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(II)V")
    public final void method2748(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method2741(48, (class695) null);
        }
        super.field3712 = arg0;
        class138.field2007 = null;
        class641.field9040 = true;
        ++field6682;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)I")
    public final int method2749(byte arg0, int arg1) {
        ++field6693;
        if (arg0 != 4) {
            this.method2750(82, -43);
        }
        if (class603.method3398(2, arg1) && !class54.method592(8, class420.field6113)) {
            return ~class266.field4022 > -97 && class619.method3446(arg1, 2) && super.field3712 == 0 ? 1 : super.field3712;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(II)I")
    private final int method2750(int arg0, int arg1) {
        ++field6692;
        if (arg0 != 1) {
            this.field6701 = true;
        }
        byte var3;
        if (arg1 <= 12000) {
            if (arg1 > 5000) {
                this.method2745(-9489);
                var3 = 3;
            } else if (~arg1 >= -2001) {
                var3 = 1;
                this.method2751(105, true);
            } else {
                this.method2743((byte) 101);
                var3 = 2;
            }
        } else {
            var3 = 4;
            this.method2744((byte) 94);
        }
        if (~class328.field4859 != -3) {
            super.field3722 = 2;
            class33.method363(-30052, 2);
        }
        this.method2753(false, class368.field5267);
        return var3;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)V")
    public final void method2751(int arg0, boolean arg1) {
        this.method2752(false, -86);
        ++field6691;
        super.field3684 = false;
        super.field3681 = false;
        super.field3714 = false;
        super.field3705 = false;
        super.field3723 = false;
        super.field3707 = super.field3706 = 0;
        super.field3694 = false;
        super.field3696 = false;
        super.field3724 = false;
        super.field3711 = 0;
        super.field3721 = false;
        super.field3693 = false;
        super.field3686 = super.field3719 = 0;
        super.field3688 = false;
        class197.method1325(true, 0);
        if (arg0 <= 81) {
            this.method2754(-96);
        }
        super.field3700 = false;
        super.field3683 = false;
        super.field3699 = 0;
        this.method2754(12148);
        this.method2748(2, 2);
        super.field3708 = 1;
        if (arg1) {
            class496.method2869(124);
        }
        class646.method3587((byte) -127);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(ZI)V")
    public final void method2752(boolean arg0, int arg1) {
        super.field3715 = arg0;
        ++field6695;
        int var3 = -39 / ((65 - arg1) / 46);
        if (class101.field1572 != null) {
            class101.field1572.method2623((byte) -45, !this.method2747(125, class328.field4859));
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLft;)V")
    public final void method2753(boolean arg0, class4 arg1) {
        ++field6681;
        class203 var3 = null;
        try {
            if (arg0) {
                this.field6690 = true;
            }
            class494 var4 = arg1.method14(true, "", 93);
            while (var4.field7024 == 0) {
                class561.method3202(1L, (byte) -107);
            }
            if (~var4.field7024 == -2) {
                var3 = (class203) var4.field7019;
                class695 var5 = new class695(class383.method2295((byte) -28));
                this.method1619(var5, (byte) -88);
                var3.method1345(var5.field9761, 0, var5.field9796, -4290);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method1344((byte) 127);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
    private final void method2754(int arg0) {
        if (class187.field2693 <= 1) {
            super.field3682 = 2;
        } else {
            super.field3682 = 4;
        }
        if (arg0 == 12148) {
            ++field6694;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lft;)V")
    public class465(class4 arg0) {
        super.field3708 = 3;
        super.field3725 = 3;
        this.method2752(true, -53);
        super.field3691 = 127;
        super.field3686 = 2;
        super.field3697 = 127;
        super.field3706 = 0;
        super.field3681 = true;
        super.field3710 = 0;
        super.field3693 = false;
        super.field3707 = 0;
        super.field3721 = true;
        super.field3684 = true;
        super.field3687 = 127;
        super.field3723 = true;
        super.field3688 = true;
        super.field3705 = true;
        super.field3719 = 0;
        super.field3701 = 127;
        super.field3690 = 0;
        super.field3716 = true;
        super.field3694 = true;
        super.field3696 = true;
        super.field3711 = 1;
        super.field3714 = true;
        super.field3704 = 127;
        if (class266.field4022 < 96) {
            class197.method1325(true, 0);
        } else {
            class197.method1325(true, 2);
        }
        super.field3695 = 0;
        super.field3718 = 2;
        super.field3682 = ~class187.field2693 != -2 ? 4 : 2;
        super.field3683 = true;
        super.field3698 = true;
        super.field3722 = 2;
        super.field3685 = false;
        super.field3699 = 0;
        super.field3700 = false;
        super.field3712 = 0;
        super.field3692 = false;
        class203 var2 = null;
        try {
            class494 var3 = arg0.method14(true, "", -22);
            while (var3.field7024 == 0) {
                class561.method3202(1L, (byte) -109);
            }
            if (var3.field7024 == 1) {
                var2 = (class203) var3.field7019;
                byte[] var4 = new byte[(int) var2.method1351(-126)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method1350(var4.length + -var5, var5, (byte) -118, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method2741(5181, new class695(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1344((byte) 126);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(Z)I")
    private final int method2755(boolean arg0) {
        if (!arg0) {
            this.field6701 = false;
        }
        ++field6689;
        byte var3;
        if (~class266.field4022 <= -97) {
            int var2 = class229.method1582(arg0);
            if (var2 <= 100) {
                this.method2744((byte) 94);
                var3 = 4;
            } else if (var2 <= 500) {
                var3 = 3;
                this.method2745(-9489);
            } else if (var2 > 1000) {
                var3 = 1;
                this.method2751(105, true);
            } else {
                this.method2743((byte) 16);
                var3 = 2;
            }
        } else {
            var3 = 1;
            this.method2751(101, true);
        }
        if (~class328.field4859 != -1) {
            super.field3722 = 0;
            class33.method363(-30052, 0);
        }
        this.method2753(!arg0, class368.field5267);
        return var3;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(BI)V")
    public static final void method2756(byte arg0, int arg1) {
        class9.field89 = -1;
        ++field6700;
        if (arg0 != 44) {
            field6683 = 36;
        }
        class671.field9481 = arg1;
        class9.field89 = -1;
        class167.method1159((byte) -33);
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)I")
    public final int method2757(byte arg0) {
        ++field6684;
        if (arg0 != 123) {
            this.field6690 = false;
        }
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class368.field5267.field49 && !class368.field5267.field47) {
            if (class4.field22.startsWith("win")) {
                var3 = true;
                if (!class4.field40.startsWith("amd64") && !class4.field40.startsWith("x86_64")) {
                    var2 = true;
                }
                var4 = true;
            } else {
                var3 = true;
            }
        }
        if (this.field6690) {
            var2 = false;
        }
        if (this.field6701) {
            var4 = false;
        }
        if (this.field6697) {
            var3 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method2755(true);
        } else {
            int var5 = -1;
            int var6 = -1;
            int var7 = -1;
            if (var2) {
                try {
                    var5 = class416.method2496(20, 1000, 2);
                } catch (Exception var16) {
                }
            }
            if (var4) {
                try {
                    var7 = class416.method2496(arg0 + -237, 1000, 3);
                    if (~class328.field4859 == -4) {
                        class463 var8 = class282.field4228.method140();
                        long var9 = 281474976710655L & var8.field6668;
                        int var11 = var8.field6669;
                        if (~var11 != -4319) {
                            if (var11 == 4098) {
                                var3 &= ~var9 <= -60129613780L;
                            }
                        } else {
                            var3 &= var9 >= 64425238954L;
                        }
                    }
                } catch (Exception var15) {
                }
            }
            if (var3) {
                try {
                    var6 = class416.method2496(-6, 1000, 1);
                } catch (Exception var14) {
                }
            }
            if (var5 == -1 && var6 == -1 && ~var7 == 0) {
                return this.method2755(true);
            } else {
                int var12 = (int) ((float) var6 * 1.1F);
                int var13 = (int) ((float) var7 * 1.1F);
                if (~var5 < ~var13 && var12 < var5) {
                    return this.method2750(1, var5);
                } else {
                    return ~var13 >= ~var12 ? this.method2740(-115, var12, 1) : this.method2740(arg0 + -238, var13, 3);
                }
            }
        }
    }
}
