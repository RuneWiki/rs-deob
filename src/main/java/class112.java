import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class112 extends class306 implements class394 {

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "Z")
    private boolean field1801 = false;

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "Lbba;")
    public class668 field1800;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "Z")
    private boolean field1792;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field1794 = -1;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "Leda;")
    public static class116 field1783 = new class116(25, 0);

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "[I")
    public static int[] field1803 = new int[8];

    @OriginalMember(owner = "client!th", name = "db", descriptor = "Ljn;")
    public static class117 field1804 = new class117(64);

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "Leh;")
    private class203 field1785;

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "Z")
    public static boolean field1802;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V", line = 10)
    public final void method902(int arg0) {
        ++field1797;
        if (arg0 != 27906) {
            field1783 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)Z", line = 20)
    public final boolean method630(int arg0) {
        ++field1795;
        int var2 = 100 % ((-59 - arg0) / 44);
        return this.field1801;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lr;I)Lej;", line = 30)
    public final class690 method627(class98 arg0, int arg1) {
        ++field1778;
        class397 var3 = this.field1800.method3758(true, 2048, arg0, true, false);
        if (var3 == null) {
            return null;
        } else {
            class152 var4 = arg0.method777();
            var4.method166(super.field4270 + super.field3155, super.field3160, super.field4269 + super.field3154);
            class690 var5 = null;
            if (this.field1792) {
                var5 = class101.method849(arg1 + 7896, 1);
            }
            int var6 = super.field3155 >> 9;
            if (arg1 != -7927) {
                this.method626(-103);
            }
            int var7 = super.field3154 >> 9;
            this.field1800.method3765(var7, true, arg0, 103, var6, var6, var4, var7, var3);
            if (!class372.field5162) {
                var3.method460(var4, var5 != null ? var5.field9788[0] : null, 0);
            } else {
                var3.method448(var4, var5 != null ? var5.field9788[0] : null, class450.field6494, 0);
            }
            if (this.field1800.field9415 != null) {
                class272 var8 = this.field1800.field9415.method3581();
                if (!class372.field5162) {
                    arg0.method737(var8);
                } else {
                    arg0.method799(var8, class450.field6494);
                }
            }
            this.field1801 = var3.method449() || this.field1800.field9415 != null;
            if (this.field1785 == null) {
                this.field1785 = class420.method2486(super.field3155, super.field3160, super.field3154, var3, 22672);
            } else {
                class136.method1043(23175, var3, this.field1785, super.field3154, super.field3160, super.field3155);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lr;Lnf;IIIIIZIIIII)V", line = 84)
    public class112(class98 arg0, class119 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field1800 = new class668(arg0, arg1, arg10, arg11, super.field3158, arg3, this, arg7, arg12);
        this.field1792 = ~arg1.field1903 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I", line = 93)
    public final int method903(int arg0) {
        ++field1790;
        if (arg0 <= 76) {
            this.method633(false);
        }
        return this.field1800.field9382;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)I", line = 104)
    public final int method904(int arg0) {
        ++field1793;
        if (arg0 != -15140) {
            this.method908(false);
        }
        return this.field1800.field9390;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(Z)Z", line = 117)
    public final boolean method633(boolean arg0) {
        ++field1789;
        if (!arg0) {
            this.method904(77);
        }
        return false;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(ILr;)Leh;", line = 129)
    public final class203 method631(int arg0, class98 arg1) {
        ++field1799;
        return arg0 != 1 ? null : this.field1785;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILr;B)Z", line = 140)
    public final boolean method632(int arg0, int arg1, class98 arg2, byte arg3) {
        ++field1781;
        class397 var5 = this.field1800.method3758(true, 131072, arg2, false, false);
        if (var5 == null) {
            return false;
        } else {
            int var6 = -68 % ((-75 - arg3) / 40);
            class152 var7 = arg2.method777();
            var7.method166(super.field4270 + super.field3155, super.field3160, super.field4269 + super.field3154);
            return !class372.field5162 ? var5.method469(arg0, arg1, var7, false) : var5.method482(arg0, arg1, var7, false, class450.field6494);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIII)V", line = 162)
    public static final void method905(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 < 86) {
            field1783 = null;
        }
        ++field1779;
        if (class512.field7620 <= arg2 && ~arg3 >= ~class94.field1398 && ~arg6 <= ~class198.field3084 && class627.field8931 >= arg1) {
            class300.method1847(arg5, arg0, arg3, arg1, arg6, true, arg2, arg4);
        } else {
            class699.method3935(arg0, -128, arg4, arg2, arg1, arg5, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZIIIIII)V", line = 179)
    public static final void method906(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg2) {
            ++field1786;
            if (class56.method437((byte) 61, arg5)) {
                if (class700.field9917[arg5] != null) {
                    class367.method2204(arg3, arg8, 1024, arg6, arg4, arg0, class700.field9917[arg5], arg1, arg7, -1);
                } else {
                    class367.method2204(arg3, arg8, 1024, arg6, arg4, arg0, class265.field3806[arg5], arg1, arg7, -1);
                }
            } else if (arg3 != -1) {
                class636.field9030[arg3] = true;
            } else {
                for (int var9 = 0; var9 < 100; ++var9) {
                    class636.field9030[var9] = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "i", descriptor = "(I)I", line = 214)
    public final int method626(int arg0) {
        if (arg0 != -32768) {
            this.method908(false);
        }
        ++field1784;
        return this.field1800.method3767(-121);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)I", line = 227)
    public final int method907(boolean arg0) {
        ++field1782;
        return arg0 ? -110 : this.field1800.field9418;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)Z", line = 238)
    public final boolean method908(boolean arg0) {
        ++field1788;
        if (arg0) {
            field1803 = null;
        }
        return this.field1800.method3761(-105);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)I", line = 249)
    public final int method634(byte arg0) {
        if (arg0 >= -102) {
            return -116;
        } else {
            ++field1798;
            return this.field1800.method3759((byte) 60);
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(B)V", line = 263)
    public static void method909(byte arg0) {
        if (arg0 < 106) {
            method910(-83, -6, -53, (byte) -13);
        }
        field1783 = null;
        field1804 = null;
        field1803 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIB)I", line = 275)
    public static final int method910(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg2 & 3;
        ++field1796;
        if (var4 == 0) {
            return arg0;
        } else if (arg3 != -17) {
            return -77;
        } else if (~var4 == -2) {
            return -arg1 + 7;
        } else {
            return ~var4 == -3 ? 7 - arg0 : arg1;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lr;B)V", line = 299)
    public final void method911(class98 arg0, byte arg1) {
        if (arg1 != 31) {
            this.method633(true);
        }
        ++field1791;
        this.field1800.method3766(262144, arg0);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(ILr;)V", line = 313)
    public final void method625(int arg0, class98 arg1) {
        ++field1780;
        class397 var3 = this.field1800.method3758(true, 262144, arg1, true, false);
        if (arg0 >= 67) {
            if (var3 != null) {
                int var4 = super.field3155 >> 9;
                int var5 = super.field3154 >> 9;
                class152 var6 = arg1.method777();
                var6.method166(super.field3155, super.field3160, super.field3154);
                this.field1800.method3765(var5, false, arg1, 103, var4, var4, var6, var5, var3);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILr;)V", line = 349)
    public final void method912(int arg0, class98 arg1) {
        if (arg0 != 20280) {
            field1783 = null;
        }
        this.field1800.method3762(arg1, (byte) -19);
        ++field1787;
    }
}
