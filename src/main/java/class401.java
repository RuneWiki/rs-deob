import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class401 extends class501 implements class161 {

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "S")
    private short field5911;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "B")
    private byte field5921;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "B")
    private byte field5918;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "Z")
    private boolean field5905;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "B")
    private byte field5899;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "Z")
    private boolean field5901;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "Z")
    private boolean field5913;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "Z")
    private boolean field5902;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "Li;")
    private class200 field5922;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "Le;")
    public class289 field5912;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    public static int field5920 = 0;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "Lpn;")
    public static class49 field5898 = new class49(49, 3);

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "Lpt;")
    public static class308 field5923 = null;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "F")
    public static float field5915;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "[Lo;")
    public static class363[] field5914;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)Z")
    public final boolean method104(byte arg0) {
        int var2 = -26 / ((-41 - arg0) / 38);
        ++field5907;
        return this.field5902;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lza;B)V")
    public final void method96(class299 arg0, byte arg1) {
        ++field5917;
        Object var3 = null;
        if (arg1 <= 78) {
            field5898 = null;
        }
        class200 var5;
        if (this.field5922 == null && this.field5902) {
            class396 var4 = this.method2514(262144, arg0, 34, true);
            var5 = var4 != null ? var4.field5850 : null;
        } else {
            var5 = this.field5922;
            this.field5922 = null;
        }
        if (var5 != null) {
            class205.method1434(var5, this.field5899, super.field7282, super.field7279, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lza;Lii;IIIIZIIZ)V")
    public class401(class299 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class317.method2105(arg8, arg7, (byte) 100));
        super.field7279 = arg5;
        this.field5911 = (short) arg1.field5831;
        this.field5921 = (byte) arg8;
        this.field5918 = (byte) arg7;
        this.field5905 = arg1.field5840 != 0 && !arg6;
        this.field5899 = (byte) arg2;
        this.field5901 = arg6;
        this.field5913 = arg9;
        super.field7282 = arg3;
        this.field5902 = arg0.method573() && arg1.field5801 && !this.field5901 && ~class40.field667.method1836(127, class108.field1631) != -1;
        int var11 = 2048;
        if (this.field5913) {
            var11 |= 65536;
        }
        class396 var12 = this.method2514(var11, arg0, 120, this.field5902);
        if (var12 != null) {
            this.field5922 = var12.field5850;
            this.field5912 = var12.field5853;
            if (this.field5913) {
                this.field5912 = this.field5912.method669((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lza;IIILps;IZ)V")
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        if (arg4 instanceof class401) {
            class401 var8 = (class401) arg4;
            if (this.field5912 != null && var8.field5912 != null) {
                this.field5912.method625(var8.field5912, arg2, arg1, arg5, arg6);
            }
        } else if (arg4 instanceof class506) {
            class506 var9 = (class506) arg4;
            if (this.field5912 != null && var9.field7351 != null) {
                this.field5912.method625(var9.field7351, arg2, arg1, arg5, arg6);
            }
        }
        if (arg3 != -750) {
            field5914 = null;
        }
        ++field5896;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lza;IZ)Le;")
    public final class289 method111(class299 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method96((class299) null, (byte) 99);
        }
        ++field5897;
        return this.method2517(false, arg0, arg1);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILza;IZ)Lhw;")
    private final class396 method2514(int arg0, class299 arg1, int arg2, boolean arg3) {
        if (arg2 < 16) {
            this.method97(-123);
        }
        ++field5916;
        class395 var5 = class247.field3693.method2281(65535 & this.field5911, -9380);
        class11 var6;
        class11 var7;
        if (!this.field5901) {
            var6 = class274.field4306[this.field5899];
            if (this.field5899 >= 3) {
                var7 = null;
            } else {
                var7 = class274.field4306[this.field5899 - -1];
            }
        } else {
            var6 = class288.field4475[this.field5899];
            var7 = class274.field4306[0];
        }
        return var5.method2499(var6, arg0, this.field5918, super.field7284, super.field7279, arg1, this.field5921, arg3, super.field7282, (byte) -108, var7);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(ILza;)Lhp;")
    public final class293 method110(int arg0, class299 arg1) {
        ++field5893;
        if (this.field5912 == null) {
            return null;
        } else {
            class517 var3 = arg1.method538();
            var3.method951(super.field7282, super.field7284, super.field7279);
            class293 var4 = null;
            if (this.field5905) {
                var4 = class467.method2844(arg0 + -22755, 1);
            }
            this.field5912.method673(var3, var4 != null ? var4.field4524[0] : null, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        ++field5903;
        class289 var5 = this.method2517(false, arg0, 131072);
        if (arg2 <= 23) {
            return false;
        } else if (var5 != null) {
            class517 var6 = arg0.method538();
            var6.method951(super.field7282, super.field7284, super.field7279);
            return var5.method638(arg1, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIILza;III[[[BI)V")
    public static final void method2515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class299 arg7, int arg8, int arg9, int arg10, byte[][][] arg11, int arg12) {
        ++field5908;
        if (arg1 >= 37) {
            if (arg12 != 0 && arg0 != 0) {
                if (~arg12 == -10) {
                    arg12 = 1;
                    arg5 = 3 & arg5 + 1;
                }
                if (~arg12 == -11) {
                    arg12 = 1;
                    arg5 = arg5 + 3 & 3;
                }
                if (arg12 == 11) {
                    arg12 = 8;
                    arg5 = 3 & arg5 + 3;
                }
                arg7.method512(arg4, arg10, arg3, arg6, arg9, arg8, arg11[arg12 + -1][arg5], arg0, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
    public final int method97(int arg0) {
        if (arg0 < 82) {
            this.method100((byte) -103, (class299) null);
        }
        ++field5919;
        return this.field5921;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)Z")
    public final boolean method107(byte arg0) {
        ++field5894;
        if (arg0 != -88) {
            this.method106(95);
        }
        return this.field5913;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLza;)V")
    public final void method100(byte arg0, class299 arg1) {
        ++field5892;
        Object var3 = null;
        class200 var5;
        if (this.field5922 == null && this.field5902) {
            class396 var4 = this.method2514(262144, arg1, arg0 ^ 30, true);
            var5 = var4 == null ? null : var4.field5850;
        } else {
            var5 = this.field5922;
            this.field5922 = null;
        }
        if (var5 != null) {
            class470.method2852(var5, this.field5899, super.field7282, super.field7279, (boolean[]) null);
        }
        if (arg0 != 51) {
            field5915 = -0.7579196F;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)I")
    public final int method103(int arg0) {
        ++field5904;
        if (arg0 >= -10) {
            field5914 = null;
        }
        return this.field5918;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
    public final void method108(int arg0) {
        this.field5913 = false;
        ++field5910;
        if (this.field5912 != null) {
            this.field5912.method662(this.field5912.method679() & -65537);
        }
        int var2 = -13 / ((48 - arg0) / 37);
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
    public static void method2516(int arg0) {
        field5923 = null;
        field5914 = null;
        field5898 = null;
        if (arg0 != 0) {
            method2515(97, 2, -77, 12, -72, 91, -123, (class299) null, 82, 125, -78, (byte[][][]) null, 126);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLza;I)Le;")
    private final class289 method2517(boolean arg0, class299 arg1, int arg2) {
        ++field5909;
        if (this.field5912 != null && ~arg1.method589(this.field5912.method679(), arg2) == -1) {
            return this.field5912;
        } else {
            class396 var4 = this.method2514(arg2, arg1, 114, arg0);
            return var4 != null ? var4.field5853 : null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
    public final void method106(int arg0) {
        ++field5900;
        if (this.field5912 != null) {
            this.field5912.method657();
        }
        if (arg0 != -19159) {
            this.method98(-32, (class299) null);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILza;)V")
    public final void method98(int arg0, class299 arg1) {
        if (arg0 == 31203) {
            ++field5906;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)I")
    public final int method99(byte arg0) {
        if (arg0 != -107) {
            this.method97(100);
        }
        ++field5895;
        return 65535 & this.field5911;
    }
}
