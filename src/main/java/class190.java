import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class190 extends class412 {

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "Z")
    public boolean field2818 = false;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "Z")
    public boolean field2825 = false;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "Ltr;")
    public static class176 field2816;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
    public final boolean method1171(int arg0, byte arg1) {
        ++field2817;
        if (arg1 > -112) {
            this.method1177((class430) null, (byte) -3);
        }
        return arg0 != 0 ? true : super.field5786;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static void method1172(int arg0) {
        if (arg0 < -41) {
            field2816 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)Lrp;")
    public final class276 method1173(int arg0) {
        ++field2819;
        class276 var2 = new class276(39);
        var2.method1753(true, 16);
        var2.method1753(true, super.field5802);
        var2.method1753(true, !super.field5786 ? 0 : 1);
        var2.method1753(true, !super.field5795 ? 0 : 1);
        var2.method1753(true, super.field5801 ? 1 : 0);
        var2.method1753(true, super.field5775 ? 1 : 0);
        var2.method1753(true, 0);
        var2.method1753(true, !super.field5783 ? 0 : 1);
        if (arg0 != 1) {
            return null;
        } else {
            var2.method1753(true, super.field5780 ? 1 : 0);
            var2.method1753(true, !super.field5797 ? 0 : 1);
            var2.method1753(true, super.field5776);
            var2.method1753(true, super.field5779 ? 1 : 0);
            var2.method1753(true, !super.field5791 ? 0 : 1);
            var2.method1753(true, !super.field5772 ? 0 : 1);
            var2.method1753(true, super.field5785);
            var2.method1753(true, !super.field5777 ? 0 : 1);
            var2.method1753(true, super.field5798);
            var2.method1753(true, super.field5794);
            var2.method1753(true, super.field5771);
            var2.method1711(false, super.field5799);
            var2.method1711(false, super.field5790);
            var2.method1753(true, class19.method128(-14));
            var2.method1744(super.field5796, true);
            var2.method1753(true, super.field5800);
            var2.method1753(true, !super.field5781 ? 0 : 1);
            var2.method1753(true, !super.field5782 ? 0 : 1);
            var2.method1753(true, super.field5792);
            var2.method1753(true, !super.field5793 ? 0 : 1);
            var2.method1753(true, !super.field5788 ? 0 : 1);
            var2.method1753(true, super.field5773);
            var2.method1753(true, super.field5774 ? 1 : 0);
            var2.method1753(true, super.field5787);
            var2.method1753(true, super.field5789);
            var2.method1753(true, !super.field5784 ? 1 : 0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)Z")
    public final boolean method1174(byte arg0, int arg1) {
        ++field2821;
        int var3 = -65 / (arg0 / 58);
        return arg1 == 0 && !this.field2818 ? super.field5786 : true;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZZ)V")
    public final void method1175(boolean arg0, boolean arg1) {
        super.field5786 = arg1;
        ++field2822;
        if (class156.field2325 != null) {
            class156.field2325.method802(!this.method1174((byte) -61, class437.field6083), (byte) 108);
        }
        if (arg0) {
            this.field2825 = true;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)I")
    public final int method1176(int arg0, int arg1) {
        ++field2814;
        if (this.field2825) {
            return 0;
        } else if (!this.method1174((byte) 78, arg0)) {
            return 1;
        } else {
            if (arg1 != 1) {
                this.method1177((class430) null, (byte) 19);
            }
            return !super.field5795 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lmj;B)V")
    public final void method1177(class430 arg0, byte arg1) {
        ++field2824;
        class383 var3 = null;
        try {
            if (arg1 <= 94) {
                return;
            }
            class366 var4 = arg0.method2541(0);
            while (~var4.field5253 == -1) {
                class111.method713(50, 1L);
            }
            if (~var4.field5253 == -2) {
                var3 = (class383) var4.field5255;
                class276 var5 = this.method1173(1);
                var3.method2310(var5.field4021, 401, 0, var5.field4064);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method2311((byte) -127);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;)V")
    public static final void method1178(String arg0, int arg1, String arg2, int arg3, String arg4, int arg5, int arg6, String arg7) {
        ++field2820;
        for (int var8 = 99; var8 > 0; --var8) {
            class107.field1343[var8] = class107.field1343[var8 - 1];
            class359.field5167[var8] = class359.field5167[var8 + -1];
            class330.field4782[var8] = class330.field4782[var8 + -1];
            class431.field6043[var8] = class431.field6043[var8 + -1];
            class303.field4314[var8] = class303.field4314[var8 + -1];
            class401.field5679[var8] = class401.field5679[var8 + -1];
            class276.field4067[var8] = class276.field4067[var8 + -1];
        }
        class107.field1343[0] = arg1;
        class330.field4782[0] = arg4;
        class359.field5167[0] = arg5;
        class431.field6043[0] = arg0;
        if (arg3 != -26824) {
            field2823 = -10;
        }
        class303.field4314[0] = arg7;
        class209.field3183 = class27.field367;
        ++class231.field3495;
        class276.field4067[0] = arg6;
        class401.field5679[0] = arg2;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lmj;)V")
    public class190(class430 arg0) {
        super.field5802 = 3;
        this.method1175(false, true);
        super.field5777 = true;
        super.field5797 = true;
        super.field5785 = 0;
        super.field5772 = true;
        super.field5794 = 255;
        super.field5795 = true;
        super.field5771 = 127;
        super.field5799 = 0;
        super.field5778 = 0;
        super.field5775 = true;
        super.field5791 = true;
        super.field5773 = 1;
        super.field5783 = true;
        super.field5776 = 2;
        super.field5801 = true;
        super.field5790 = 0;
        super.field5798 = 127;
        super.field5780 = true;
        super.field5779 = true;
        if (~class347.field5026 <= -97) {
            class467.method2747(2, (byte) 56);
        } else {
            class467.method2747(0, (byte) 56);
        }
        super.field5788 = true;
        super.field5789 = ~class291.field4242 != -2 ? 4 : 2;
        super.field5774 = true;
        super.field5781 = false;
        super.field5796 = 0;
        super.field5793 = false;
        super.field5792 = 0;
        super.field5782 = false;
        super.field5800 = 2;
        super.field5787 = 2;
        class383 var2 = null;
        try {
            class366 var3 = arg0.method2541(0);
            while (~var3.field5253 == -1) {
                class111.method713(-107, 1L);
            }
            if (var3.field5253 == 1) {
                var2 = (class383) var3.field5255;
                byte[] var4 = new byte[(int) var2.method2313(0)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2309((byte) 46, var4.length + -var5, var5, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method1179(new class276(var4), 35);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2311((byte) -127);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lrp;I)V")
    private final void method1179(class276 arg0, int arg1) {
        ++field2827;
        if (arg0.field4064.length + -arg0.field4021 >= 1) {
            if (arg1 == 35) {
                int var3 = arg0.method1701(-23121);
                if (~var3 <= -1 && ~var3 >= -17) {
                    byte var4;
                    if (var3 == 16) {
                        var4 = 38;
                    } else if (~var3 == -16) {
                        var4 = 37;
                    } else if (~var3 == -15) {
                        var4 = 36;
                    } else if (~var3 != -14) {
                        if (~var3 == -13) {
                            var4 = 34;
                        } else if (~var3 == -12) {
                            var4 = 33;
                        } else if (~var3 != -11) {
                            if (var3 == 9) {
                                var4 = 31;
                            } else if (var3 != 8) {
                                if (var3 != 7) {
                                    if (~var3 != -7) {
                                        if (var3 != 5) {
                                            if (var3 == 4) {
                                                var4 = 24;
                                            } else if (var3 != 3) {
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
                                            var4 = 28;
                                        }
                                    } else {
                                        var4 = 28;
                                    }
                                } else {
                                    var4 = 29;
                                }
                            } else {
                                var4 = 30;
                            }
                        } else {
                            var4 = 32;
                        }
                    } else {
                        var4 = 35;
                    }
                    if (~var4 >= ~(arg0.field4064.length - arg0.field4021)) {
                        super.field5802 = arg0.method1701(-23121);
                        if (~super.field5802 > -2) {
                            super.field5802 = 1;
                        } else if (super.field5802 > 4) {
                            super.field5802 = 4;
                        }
                        this.method1175(false, arg0.method1701(arg1 + -23156) == 1);
                        super.field5795 = ~arg0.method1701(-23121) == -2;
                        super.field5801 = ~arg0.method1701(-23121) == -2;
                        super.field5775 = arg0.method1701(-23121) == 1;
                        super.field5773 = ~arg0.method1701(arg1 + -23156) != -2 ? 0 : 1;
                        super.field5783 = ~arg0.method1701(arg1 + -23156) == -2;
                        super.field5780 = arg0.method1701(-23121) == 1;
                        super.field5797 = arg0.method1701(arg1 + -23156) == 1;
                        super.field5776 = arg0.method1701(-23121);
                        if (~super.field5776 < -3) {
                            super.field5776 = 2;
                        }
                        if (var3 >= 2) {
                            super.field5779 = ~arg0.method1701(arg1 + -23156) == -2;
                        } else {
                            super.field5779 = arg0.method1701(arg1 + -23156) == 1;
                            arg0.method1701(-23121);
                        }
                        super.field5791 = ~arg0.method1701(-23121) == -2;
                        super.field5772 = arg0.method1701(arg1 ^ -23156) == 1;
                        super.field5785 = arg0.method1701(-23121);
                        if (super.field5785 > 2) {
                            super.field5785 = 2;
                        }
                        super.field5778 = super.field5785;
                        super.field5777 = arg0.method1701(arg1 ^ -23156) == 1;
                        super.field5798 = arg0.method1701(-23121);
                        if (super.field5798 > 127) {
                            super.field5798 = 127;
                        }
                        super.field5794 = arg0.method1701(-23121);
                        super.field5771 = arg0.method1701(arg1 ^ -23156);
                        if (super.field5771 > 127) {
                            super.field5771 = 127;
                        }
                        if (var3 >= 1) {
                            super.field5799 = arg0.method1729(65280);
                            super.field5790 = arg0.method1729(65280);
                        }
                        if (var3 >= 3 && var3 < 6) {
                            arg0.method1701(-23121);
                        }
                        if (~var3 <= -5) {
                            int var5 = arg0.method1701(-23121);
                            if (~var5 > -1 || ~var5 < -3) {
                                var5 = 0;
                            }
                            if (~class347.field5026 > -97) {
                                var5 = 0;
                            }
                            class467.method2747(var5, (byte) 56);
                        }
                        if (var3 >= 5) {
                            super.field5796 = arg0.method1688(20402);
                        }
                        int var6 = 0;
                        if (~var3 <= -7) {
                            super.field5800 = var6 = arg0.method1701(arg1 ^ -23156);
                        }
                        if (super.field5800 != 1 && super.field5800 != 2) {
                            super.field5800 = 2;
                        }
                        if (var3 >= 7) {
                            super.field5781 = arg0.method1701(arg1 ^ -23156) == 1;
                        }
                        if (~var3 <= -9) {
                            super.field5782 = arg0.method1701(-23121) == 1;
                        }
                        if (var3 >= 9) {
                            super.field5792 = arg0.method1701(-23121);
                        }
                        if (~super.field5792 > -1 || ~super.field5792 < ~class284.method1787(class347.field5026, (byte) -81)) {
                            super.field5792 = 0;
                        }
                        if (~var3 <= -11) {
                            super.field5793 = arg0.method1701(-23121) != 0;
                        }
                        if (~var3 <= -12) {
                            super.field5788 = arg0.method1701(-23121) != 0;
                        }
                        if (var3 >= 12) {
                            super.field5773 = arg0.method1701(-23121);
                        }
                        if (~super.field5773 > -1 || super.field5773 > 2) {
                            super.field5773 = 1;
                        }
                        if (var3 >= 13) {
                            super.field5774 = ~arg0.method1701(arg1 + -23156) == -2;
                        }
                        if (~var3 <= -15) {
                            super.field5787 = arg0.method1701(-23121);
                        } else if (var6 != 0) {
                            super.field5787 = 1;
                        } else {
                            super.field5787 = 2;
                        }
                        if (~super.field5787 > -1 || ~super.field5787 < -4) {
                            super.field5787 = 2;
                        }
                        if (var3 >= 15) {
                            super.field5789 = arg0.method1701(-23121);
                            if (~super.field5789 > -1 || super.field5789 > 4) {
                                super.field5789 = ~class291.field4242 == -2 ? 2 : 4;
                            }
                        }
                        if (var3 >= 16) {
                            super.field5784 = arg0.method1701(arg1 + -23156) != 1;
                        }
                    }
                }
            }
        }
    }
}
