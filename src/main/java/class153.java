import jagex3.jagmisc.jagmisc;
import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class153 extends class271 {

    @OriginalMember(owner = "client!lp", name = "Z", descriptor = "Z")
    public boolean field2354 = false;

    @OriginalMember(owner = "client!lp", name = "R", descriptor = "Z")
    public boolean field2346 = false;

    @OriginalMember(owner = "client!lp", name = "bb", descriptor = "[I")
    public static int[] field2356;

    @OriginalMember(owner = "client!lp", name = "eb", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!lp", name = "U", descriptor = "Lrb;")
    public static class283 field2349;

    @OriginalMember(owner = "client!lp", name = "gb", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!lp", name = "Q", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!lp", name = "S", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!lp", name = "T", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!lp", name = "V", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!lp", name = "W", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!lp", name = "X", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!lp", name = "Y", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!lp", name = "ab", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!lp", name = "cb", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!lp", name = "db", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!lp", name = "fb", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!lp", name = "hb", descriptor = "I")
    public static int field2362;

    static {
        new class157("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field2356 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field2359 = -1;
        field2349 = new class283(88, 6);
        field2361 = 0;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILor;)V", line = 4)
    public final void method1098(int arg0, class173 arg1) {
        ++field2347;
        class453 var3 = null;
        try {
            class464 var4 = arg1.method1199(arg0 ^ 14347, "", true);
            while (var4.field6699 == 0) {
                class334.method2047(1L, 0);
            }
            if (var4.field6699 == 1) {
                var3 = (class453) var4.field6695;
                class319 var5 = this.method1101(17);
                var3.method2662(var5.field4360, (byte) 42, var5.field4336, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg0 == -9) {
                if (var3 != null) {
                    var3.method2659(-1);
                }
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(II)Z", line = 44)
    public final boolean method1099(int arg0, int arg1) {
        ++field2352;
        if (arg0 != 3706) {
            return false;
        } else {
            return ~arg1 != -1 ? true : super.field3663;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLjava/awt/Component;Z)Lqk;", line = 59)
    public static final class8 method1100(byte arg0, Component arg1, boolean arg2) {
        if (arg0 <= 124) {
            method1103(-121, 25, 49, -72, false);
        }
        ++field2360;
        return new class371(arg1, arg2);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Lsv;", line = 78)
    public final class319 method1101(int arg0) {
        ++field2345;
        class319 var2 = new class319(41);
        var2.method1891(false, arg0);
        var2.method1891(false, super.field3666);
        var2.method1891(false, !super.field3663 ? 0 : 1);
        var2.method1891(false, super.field3672 ? 1 : 0);
        var2.method1891(false, super.field3667 ? 1 : 0);
        var2.method1891(false, !super.field3674 ? 0 : 1);
        var2.method1891(false, 0);
        var2.method1891(false, super.field3658 ? 1 : 0);
        var2.method1891(false, super.field3664 ? 1 : 0);
        var2.method1891(false, !super.field3669 ? 0 : 1);
        var2.method1891(false, super.field3671);
        var2.method1891(false, super.field3687);
        var2.method1891(false, super.field3675 ? 1 : 0);
        var2.method1891(false, super.field3660 ? 1 : 0);
        var2.method1891(false, super.field3654 ? 1 : 0);
        var2.method1891(false, super.field3655 ? 1 : 0);
        var2.method1891(false, super.field3661);
        var2.method1891(false, !super.field3656 ? 0 : 1);
        var2.method1891(false, super.field3651);
        var2.method1891(false, super.field3685);
        var2.method1891(false, super.field3682);
        var2.method1857(561746448, super.field3653);
        var2.method1857(arg0 + 561746431, super.field3650);
        var2.method1891(false, class209.method1332((byte) 103));
        var2.method1858(super.field3683, (byte) -6);
        var2.method1891(false, super.field3676);
        var2.method1891(false, super.field3681 ? 1 : 0);
        var2.method1891(false, !super.field3649 ? 0 : 1);
        var2.method1891(false, super.field3648);
        var2.method1891(false, !super.field3679 ? 0 : 1);
        var2.method1891(false, !super.field3673 ? 0 : 1);
        var2.method1891(false, super.field3665);
        var2.method1891(false, super.field3652 ? 1 : 0);
        var2.method1891(false, super.field3688);
        var2.method1891(false, super.field3686);
        var2.method1891(false, super.field3677 ? 1 : 0);
        return var2;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/lang/Object;II)[B", line = 127)
    public static final byte[] method1102(int arg0, Object arg1, int arg2, int arg3) {
        ++field2353;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return class23.method143(arg3, (byte) -99, arg2, var4);
        } else if (arg1 instanceof class527) {
            class527 var5 = (class527) arg1;
            return var5.method2383((byte) -116, arg3, arg2);
        } else {
            if (arg0 != -5) {
                method1102(53, (Object) null, -122, -31);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIZ)V", line = 158)
    public static final void method1103(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2358;
        if (class523.method3109((byte) -65, arg1)) {
            if (arg2 > -3) {
                field2349 = null;
            }
            class416.method2463(arg0, arg3, -1, 255, arg4, class505.field7387[arg1]);
        }
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(II)Z", line = 173)
    public final boolean method1104(int arg0, int arg1) {
        ++field2350;
        return arg0 == arg1 && !this.field2354 ? super.field3663 : true;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILsv;)V", line = 185)
    private final void method1105(int arg0, class319 arg1) {
        ++field2351;
        if (arg0 > -62) {
            this.method1105(-121, (class319) null);
        }
        if (arg1.field4336.length + -arg1.field4360 >= 1) {
            int var3 = arg1.method1869(-71);
            if (~var3 <= -1 && var3 <= 17) {
                byte var4;
                if (~var3 == -18) {
                    var4 = 40;
                } else if (var3 != 16) {
                    if (var3 != 15) {
                        if (~var3 != -15) {
                            if (var3 == 13) {
                                var4 = 35;
                            } else if (~var3 != -13) {
                                if (~var3 != -12) {
                                    if (var3 != 10) {
                                        if (~var3 == -10) {
                                            var4 = 31;
                                        } else if (~var3 == -9) {
                                            var4 = 30;
                                        } else if (~var3 != -8) {
                                            if (var3 != 6) {
                                                if (var3 != 5) {
                                                    if (~var3 != -5) {
                                                        if (var3 != 3) {
                                                            if (var3 == 2) {
                                                                var4 = 22;
                                                            } else if (~var3 != -2) {
                                                                var4 = 19;
                                                            } else {
                                                                var4 = 23;
                                                            }
                                                        } else {
                                                            var4 = 23;
                                                        }
                                                    } else {
                                                        var4 = 24;
                                                    }
                                                } else {
                                                    var4 = 28;
                                                }
                                            } else {
                                                var4 = 28;
                                            }
                                        } else {
                                            var4 = 29;
                                        }
                                    } else {
                                        var4 = 32;
                                    }
                                } else {
                                    var4 = 33;
                                }
                            } else {
                                var4 = 34;
                            }
                        } else {
                            var4 = 36;
                        }
                    } else {
                        var4 = 37;
                    }
                } else {
                    var4 = 38;
                }
                if (~(arg1.field4336.length + -arg1.field4360) <= ~var4) {
                    super.field3666 = arg1.method1869(-112);
                    if (super.field3666 >= 1) {
                        if (~super.field3666 < -5) {
                            super.field3666 = 4;
                        }
                    } else {
                        super.field3666 = 1;
                    }
                    this.method1107(74, ~arg1.method1869(-110) == -2);
                    super.field3672 = ~arg1.method1869(-72) == -2;
                    super.field3667 = ~arg1.method1869(-127) == -2;
                    super.field3674 = ~arg1.method1869(-122) == -2;
                    super.field3665 = arg1.method1869(-96) != 1 ? 0 : 1;
                    super.field3658 = arg1.method1869(-117) == 1;
                    super.field3664 = ~arg1.method1869(-103) == -2;
                    super.field3669 = arg1.method1869(-121) == 1;
                    super.field3671 = arg1.method1869(-95);
                    if (~super.field3671 < -3) {
                        super.field3671 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field3687 = arg1.method1869(-108);
                    }
                    if (~var3 > -3) {
                        super.field3675 = ~arg1.method1869(-89) == -2;
                        arg1.method1869(-115);
                    } else {
                        super.field3675 = arg1.method1869(-86) == 1;
                        if (var3 >= 17) {
                            super.field3660 = arg1.method1869(-116) == 1;
                        }
                    }
                    super.field3654 = ~arg1.method1869(-105) == -2;
                    super.field3655 = arg1.method1869(-111) == 1;
                    super.field3661 = arg1.method1869(-75);
                    if (super.field3661 > 2) {
                        super.field3661 = 2;
                    }
                    super.field3689 = super.field3661;
                    super.field3656 = arg1.method1869(-65) == 1;
                    super.field3651 = arg1.method1869(-67);
                    if (~super.field3651 < -128) {
                        super.field3651 = 127;
                    }
                    super.field3685 = arg1.method1869(-92);
                    super.field3682 = arg1.method1869(-77);
                    if (super.field3682 > 127) {
                        super.field3682 = 127;
                    }
                    if (var3 >= 1) {
                        super.field3653 = arg1.method1844(-110);
                        super.field3650 = arg1.method1844(-111);
                    }
                    if (~var3 <= -4 && var3 < 6) {
                        arg1.method1869(-116);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg1.method1869(-72);
                        if (~var5 > -1 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (~class20.field294 > -97) {
                            var5 = 0;
                        }
                        class407.method2389((byte) 93, var5);
                    }
                    if (var3 >= 5) {
                        super.field3683 = arg1.method1863(-1);
                    }
                    int var6 = 0;
                    if (~var3 <= -7) {
                        super.field3676 = var6 = arg1.method1869(-115);
                    }
                    if (~super.field3676 != -2 && ~super.field3676 != -3) {
                        super.field3676 = 2;
                    }
                    if (var3 >= 7) {
                        super.field3681 = ~arg1.method1869(-94) == -2;
                    }
                    if (var3 >= 8) {
                        super.field3649 = ~arg1.method1869(-90) == -2;
                    }
                    if (~var3 <= -10) {
                        super.field3648 = arg1.method1869(-110);
                    }
                    if (super.field3648 < 0 || super.field3648 > class275.method1607(true, class20.field294)) {
                        super.field3648 = 0;
                    }
                    if (var3 >= 10) {
                        super.field3679 = ~arg1.method1869(-105) != -1;
                    }
                    if (var3 >= 11) {
                        super.field3673 = ~arg1.method1869(-83) != -1;
                    }
                    if (var3 >= 12) {
                        super.field3665 = arg1.method1869(-101);
                    }
                    if (~super.field3665 > -1 || super.field3665 > 2) {
                        super.field3665 = 1;
                    }
                    if (var3 >= 13) {
                        super.field3652 = arg1.method1869(-79) == 1;
                    }
                    if (~var3 > -15) {
                        if (~var6 == -1) {
                            super.field3688 = 2;
                        } else {
                            super.field3688 = 1;
                        }
                    } else {
                        super.field3688 = arg1.method1869(-82);
                    }
                    if (super.field3688 < 0 || super.field3688 > 3) {
                        super.field3688 = 2;
                    }
                    if (var3 >= 15) {
                        super.field3686 = arg1.method1869(-68);
                        if (~super.field3686 > -1 || ~super.field3686 < -5) {
                            super.field3686 = class309.field4208 != 1 ? 4 : 2;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field3677 = ~arg1.method1869(-102) == -2;
                        try {
                            if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                super.field3677 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (~var3 > -18 && super.field3688 == 0) {
                        super.field3688 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lor;)V", line = 489)
    public class153(class173 arg0) {
        super.field3666 = 3;
        this.method1107(77, true);
        super.field3674 = true;
        super.field3675 = true;
        super.field3671 = 2;
        super.field3651 = 127;
        super.field3665 = 1;
        super.field3656 = true;
        super.field3660 = false;
        super.field3655 = true;
        super.field3661 = 0;
        super.field3672 = true;
        super.field3687 = 0;
        super.field3669 = true;
        super.field3658 = true;
        super.field3689 = 0;
        super.field3650 = 0;
        super.field3685 = 255;
        super.field3667 = true;
        super.field3654 = true;
        super.field3653 = 0;
        super.field3682 = 127;
        super.field3664 = true;
        if (~class20.field294 > -97) {
            class407.method2389((byte) 53, 0);
        } else {
            class407.method2389((byte) 71, 2);
        }
        super.field3673 = true;
        super.field3683 = 0;
        super.field3652 = true;
        super.field3676 = 2;
        super.field3681 = false;
        super.field3649 = false;
        super.field3648 = 0;
        super.field3686 = class309.field4208 == 1 ? 2 : 4;
        super.field3679 = false;
        super.field3688 = 2;
        class453 var2 = null;
        try {
            class464 var3 = arg0.method1199(-14340, "", true);
            while (~var3.field6699 == -1) {
                class334.method2047(1L, 0);
            }
            if (var3.field6699 == 1) {
                var2 = (class453) var3.field6695;
                byte[] var4 = new byte[(int) var2.method2660((byte) -51)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method2657(var5, var4.length + -var5, 112, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method1105(-95, new class319(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2659(-1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V", line = 460)
    public static void method1106(byte arg0) {
        field2356 = null;
        field2349 = null;
        if (arg0 != -72) {
            field2359 = 20;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V", line = 474)
    public final void method1107(int arg0, boolean arg1) {
        if (arg0 <= 20) {
            this.method1107(-31, false);
        }
        ++field2348;
        super.field3663 = arg1;
        if (class452.field6629 != null) {
            class452.field6629.method599(-1, !this.method1104(class195.field2849, 0));
        }
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(II)I", line = 575)
    public final int method1108(int arg0, int arg1) {
        ++field2355;
        if (arg0 != 2) {
            return 47;
        } else if (this.field2346) {
            return 0;
        } else if (!this.method1104(arg1, 0)) {
            return 1;
        } else {
            return !super.field3672 ? 1 : 2;
        }
    }
}
