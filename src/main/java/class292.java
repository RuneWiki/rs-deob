import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class292 {

    @OriginalMember(owner = "client!jfa", name = "s", descriptor = "I")
    private int field3833 = 0;

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "I")
    private int field3840 = -1;

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "Z")
    private boolean field3825 = false;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "Z")
    private boolean field3826 = false;

    @OriginalMember(owner = "client!jfa", name = "C", descriptor = "I")
    private int field3843 = -1;

    @OriginalMember(owner = "client!jfa", name = "G", descriptor = "I")
    private int field3846 = 0;

    @OriginalMember(owner = "client!jfa", name = "M", descriptor = "I")
    private int field3852 = -1;

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!jfa", name = "E", descriptor = "B")
    private byte field3844;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    public int field3819;

    @OriginalMember(owner = "client!jfa", name = "t", descriptor = "Lrba;")
    private class435 field3834;

    @OriginalMember(owner = "client!jfa", name = "q", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "B")
    private byte field3823;

    @OriginalMember(owner = "client!jfa", name = "v", descriptor = "Z")
    private boolean field3836;

    @OriginalMember(owner = "client!jfa", name = "N", descriptor = "S")
    public static short field3853 = 205;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    private int field3815;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    private int field3817;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "I")
    private int field3822;

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!jfa", name = "r", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!jfa", name = "u", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!jfa", name = "w", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!jfa", name = "x", descriptor = "I")
    private int field3838;

    @OriginalMember(owner = "client!jfa", name = "F", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!jfa", name = "I", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!jfa", name = "L", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!jfa", name = "O", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!jfa", name = "P", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!jfa", name = "B", descriptor = "Lhu;")
    public static class134 field3842;

    @OriginalMember(owner = "client!jfa", name = "H", descriptor = "Lr;")
    private class185 field3847;

    @OriginalMember(owner = "client!jfa", name = "A", descriptor = "Lcea;")
    public static class216 field3841;

    @OriginalMember(owner = "client!jfa", name = "K", descriptor = "Ltd;")
    private class456 field3850;

    @OriginalMember(owner = "client!jfa", name = "J", descriptor = "Lka;")
    private class474 field3849;

    @OriginalMember(owner = "client!jfa", name = "y", descriptor = "Lod;")
    public class509 field3839;

    @OriginalMember(owner = "client!jfa", name = "o", descriptor = "Lmk;")
    private class56 field3829;

    @OriginalMember(owner = "client!jfa", name = "p", descriptor = "[Z")
    private boolean[] field3830;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V", line = 11)
    public static void method1742(int arg0) {
        field3841 = null;
        if (arg0 != 26818) {
            field3841 = null;
        }
        field3842 = null;
    }

    @OriginalMember(owner = "client!jfa", name = "finalize", descriptor = "()V", line = 23)
    protected final void finalize() {
        if (this.field3839 != null) {
            this.field3839.method2977();
        }
        field3851++;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BI)V", line = 37)
    private final void method1743(byte arg0, int arg1) {
        field3820++;
        if (arg0 >= -69) {
            this.field3836 = true;
        }
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class543 var5 = client.field3995.method3384(this.field3824, false);
            class543 var6 = var5;
            if (var5.field7541 != null) {
                var5 = var5.method3111(class516.field7236, -128);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field7585 != null) {
                if (this.field3829 != null && var5.method3120(this.field3829.field789, 0)) {
                    return;
                }
                var3 = var5.method3115(-9963);
                if (this.field3852 != var5.field7586) {
                    var4 = var5.field7501;
                }
            } else if (var5.field7563 == -1) {
                if (var6 != null && var6.field7585 != null) {
                    if (this.field3829 != null && var6.method3120(this.field3829.field789, 0)) {
                        return;
                    }
                    var3 = var6.method3115(-9963);
                    if (this.field3852 != var6.field7586) {
                        var4 = var6.field7501;
                    }
                } else if (var6 != null && var6.field7563 != -1 && this.field3852 != var6.field7586) {
                    var3 = var6.field7563;
                    var4 = var6.field7501;
                }
            } else if (this.field3852 != var5.field7586) {
                var3 = var5.field7563;
                var4 = var5.field7501;
            }
        }
        if (var3 == -1) {
            this.field3829 = null;
            return;
        }
        this.field3849 = null;
        if (this.field3829 == null || this.field3829.field789 != var3) {
            this.field3829 = class66.field941.method1299((byte) -96, var3);
        } else if (this.field3829.field776 == 0) {
            return;
        }
        if (this.field3829.field771 == null) {
            this.field3829 = null;
            return;
        }
        if (var4) {
            this.field3838 = (int) (Math.random() * (double) this.field3829.field771.length);
            this.field3822 = ((int) ((double) this.field3829.field773[this.field3838] * Math.random())) + 1;
        } else {
            this.field3822 = 1;
            this.field3838 = 0;
        }
        this.field3817 = this.field3838 + 1;
        if (this.field3817 < 0 || this.field3817 >= this.field3829.field771.length) {
            this.field3817 = -1;
        }
        this.field3815 = class463.field6224 - this.field3822;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)I", line = 163)
    public final int method1744(byte arg0) {
        if (arg0 != -20) {
            this.method1747(null, 86);
        }
        field3845++;
        return this.field3833;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IILpda;ZLka;Lha;IIZ)V", line = 176)
    public final void method1745(int arg0, int arg1, class631 arg2, boolean arg3, class474 arg4, class60 arg5, int arg6, int arg7, boolean arg8) {
        field3848++;
        class569[] var10 = arg4.method268();
        if (arg8) {
            this.field3823 = 71;
        }
        class521[] var11 = arg4.method253();
        if ((this.field3839 == null || this.field3839.field7170) && (var10 != null || var11 != null)) {
            class543 var12 = client.field3995.method3384(this.field3824, false);
            if (var12.field7541 != null) {
                var12 = var12.method3111(class516.field7236, -100);
            }
            if (var12 != null) {
                this.field3839 = class509.method2978(class463.field6224, true);
            }
        }
        if (this.field3839 == null) {
            return;
        }
        arg4.method271(arg2);
        if (arg3) {
            this.field3839.method2968(arg5, (long) class463.field6224, var10, var11, false);
        } else {
            this.field3839.method2974((long) class463.field6224);
        }
        this.field3839.method2972(this.field3844, arg6, arg7, arg0, arg1);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILha;)V", line = 217)
    public final void method1746(int arg0, class60 arg1) {
        field3855++;
        if (arg0 != 2) {
            method1742(107);
        }
        if (this.field3847 != null) {
            class549.method3194(this.field3847, this.field3823, this.field3834.field5801, this.field3834.field5797, this.field3830);
            this.field3847 = null;
            this.field3830 = null;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lha;I)V", line = 238)
    public final void method1747(class60 arg0, int arg1) {
        this.method1752(true, arg0, true, 262144, true);
        field3837++;
        if (arg1 != 10625) {
            this.method1752(true, null, true, 82, true);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lha;Lac;IIIILrba;ZI)V", line = 609)
    public class292(class60 arg0, class543 arg1, int arg2, int arg3, int arg4, int arg5, class435 arg6, boolean arg7, int arg8) {
        this.field3824 = arg1.field7586;
        this.field3844 = (byte) arg4;
        this.field3819 = arg3;
        this.field3834 = arg6;
        this.field3831 = arg2;
        this.field3823 = (byte) arg5;
        this.field3826 = arg7;
        this.field3836 = arg0.method467() && arg1.field7504 && !this.field3826;
        if (arg8 != -1) {
            this.field3825 = true;
        }
        this.method1743((byte) -79, arg8);
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)Z", line = 255)
    public final boolean method1748(int arg0) {
        field3821++;
        return arg0 == -27353 ? this.field3836 : false;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILtd;)V", line = 268)
    public final void method1749(int arg0, class456 arg1) {
        field3816++;
        if (arg0 != -1) {
            this.method1748(-25);
        }
        this.field3849 = null;
        this.field3850 = arg1;
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)I", line = 280)
    public final int method1750(int arg0) {
        if (arg0 != 3) {
            this.field3826 = false;
        }
        field3828++;
        return this.field3846;
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V", line = 291)
    public static final void method1751(byte arg0) {
        if (arg0 >= -41) {
            field3842 = null;
        }
        field3832++;
        if (class27.field484 == 9) {
            class571.method3275(27461, 5);
        } else if (class27.field484 == 5 || class27.field484 == 6) {
            class571.method3275(27461, 3);
            return;
        } else if (class27.field484 == 12) {
            class571.method3275(27461, 3);
            return;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZLha;ZIZ)Lka;", line = 319)
    public final class474 method1752(boolean arg0, class60 arg1, boolean arg2, int arg3, boolean arg4) {
        field3854++;
        class543 var6 = client.field3995.method3384(this.field3824, !arg2);
        if (var6.field7541 != null) {
            var6 = var6.method3111(class516.field7236, -101);
        }
        if (!arg2) {
            return null;
        } else if (var6 == null) {
            this.method1746(2, arg1);
            this.field3852 = -1;
            this.field3843 = -1;
            this.field3840 = -1;
            return null;
        } else {
            if (!this.field3825 && this.field3852 != var6.field7586) {
                this.field3849 = null;
                this.method1743((byte) -101, -1);
            }
            this.method1754(this.field3834, -1);
            if (arg0) {
                boolean var7 = arg0 & this.field3836 & class748.field10451.field10410.method3447((byte) 112) != 0;
                arg0 = var7 & (this.field3840 != var6.field7586 || this.field3829 != null && class748.field10451.field10410.method3447((byte) 115) >= 2 && (this.field3843 != this.field3838 || (this.field3829.field769 || class130.field1838) && this.field3838 != this.field3817));
            }
            if (arg4 && !arg0) {
                this.field3852 = var6.field7586;
                return null;
            }
            if (arg0) {
                class549.method3194(this.field3847, this.field3823, this.field3834.field5801, this.field3834.field5797, this.field3830);
                this.field3840 = -1;
                this.field3843 = -1;
            }
            class282 var8 = class195.field2669[this.field3823];
            class282 var9;
            if (this.field3826) {
                var9 = class707.field9826[0];
            } else {
                var9 = this.field3823 < 3 ? class195.field2669[this.field3823 + 1] : null;
            }
            class474 var10 = null;
            if (this.field3829 != null) {
                if (arg0) {
                    arg3 |= 0x40000;
                }
                var10 = var6.method3112(arg1, this.field3834.field5797, var9, this.field3817, var8.method1676(this.field3834.field5801, true, this.field3834.field5797), this.field3829, this.field3831 == 11 ? 10 : this.field3831, this.field3834.field5801, this.field3831 == 11 ? this.field3819 + 4 : this.field3819, var8, this.field3822, this.field3850, arg3, 71, this.field3838);
                if (var10 == null) {
                    this.field3833 = 0;
                    this.field3830 = null;
                    this.field3846 = 0;
                    this.field3847 = null;
                } else {
                    if (arg0) {
                        if (this.field3830 == null) {
                            this.field3830 = new boolean[4];
                        }
                        this.field3847 = var10.method289(this.field3847);
                        class739.method4116(this.field3847, this.field3823, this.field3834.field5801, this.field3834.field5797, this.field3830);
                        this.field3843 = this.field3838;
                        this.field3840 = var6.field7586;
                    }
                    this.field3846 = var10.method286();
                    this.field3833 = var10.method248();
                }
                this.field3849 = null;
            } else if (this.field3849 != null && (arg3 & this.field3849.method272()) == arg3 && this.field3852 == var6.field7586) {
                var10 = this.field3849;
            } else {
                if (this.field3849 != null) {
                    arg3 |= this.field3849.method272();
                }
                class257 var11 = var6.method3118(var9, this.field3834.field5797, this.field3831 == 11 ? this.field3819 + 4 : this.field3819, this.field3831 == 11 ? 10 : this.field3831, var8, var8.method1676(this.field3834.field5801, true, this.field3834.field5797), arg1, arg3, -99, arg0, this.field3834.field5801, this.field3850);
                if (var11 == null) {
                    this.field3847 = null;
                    this.field3830 = null;
                    this.field3849 = null;
                    this.field3846 = 0;
                    this.field3833 = 0;
                } else {
                    var10 = var11.field3263;
                    this.field3849 = var11.field3263;
                    if (arg0) {
                        this.field3830 = null;
                        this.field3847 = var11.field3264;
                        class739.method4116(this.field3847, this.field3823, this.field3834.field5801, this.field3834.field5797, null);
                        this.field3840 = var6.field7586;
                        this.field3843 = -1;
                    }
                    this.field3846 = var10.method286();
                    this.field3833 = var10.method248();
                }
            }
            this.field3852 = var6.field7586;
            return var10;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BC)Z", line = 463)
    public static final boolean method1753(byte arg0, char arg1) {
        field3827++;
        if (arg0 == -1) {
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lrba;I)V", line = 475)
    private final void method1754(class435 arg0, int arg1) {
        if (arg1 != -1) {
            this.field3844 = -89;
        }
        field3835++;
        label92: while (true) {
            if (this.field3829 == null) {
                if (this.field3825) {
                    return;
                }
                this.method1743((byte) -75, -1);
                if (this.field3829 == null) {
                    return;
                }
            }
            int var3 = class463.field6224 - this.field3815;
            if (var3 > 100 && this.field3829.field791 > 0) {
                int var4 = this.field3829.field771.length - this.field3829.field791;
                while (var4 > this.field3838 && this.field3829.field773[this.field3838] < var3) {
                    var3 -= this.field3829.field773[this.field3838];
                    this.field3838++;
                }
                if (var4 <= this.field3838) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field3829.field771.length; var6++) {
                        var5 += this.field3829.field773[var6];
                    }
                    var3 %= var5;
                }
                this.field3817 = this.field3838 + 1;
                if (this.field3829.field771.length <= this.field3817) {
                    this.field3817 -= this.field3829.field791;
                    if (this.field3817 < 0 || this.field3829.field771.length <= this.field3817) {
                        this.field3817 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var3 <= this.field3829.field773[this.field3838]) {
                            this.field3815 = class463.field6224 - var3;
                            this.field3822 = var3;
                            return;
                        }
                        class758.method4218(this.field3838, arg0, 0, this.field3829);
                        var3 -= this.field3829.field773[this.field3838];
                        this.field3838++;
                        if (this.field3829.field771.length <= this.field3838) {
                            this.field3838 -= this.field3829.field791;
                            if (this.field3838 < 0 || this.field3838 >= this.field3829.field771.length) {
                                this.field3829 = null;
                                continue label92;
                            }
                        }
                        this.field3817 = this.field3838 + 1;
                    } while (this.field3829.field771.length > this.field3817);
                    this.field3817 -= this.field3829.field791;
                } while (this.field3817 >= 0 && this.field3829.field771.length > this.field3817);
                this.field3817 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)V", line = 576)
    public final void method1755(int arg0, int arg1) {
        this.field3825 = true;
        field3818++;
        this.method1743((byte) -115, arg1);
        if (arg0 >= -20) {
            this.field3846 = 94;
        }
    }
}
