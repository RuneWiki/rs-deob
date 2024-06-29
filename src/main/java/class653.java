import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class653 extends class477 implements class532 {

    @OriginalMember(owner = "client!sea", name = "p", descriptor = "Lwc;")
    public class62 field8826;

    @OriginalMember(owner = "client!sea", name = "y", descriptor = "Z")
    private boolean field8835;

    @OriginalMember(owner = "client!sea", name = "r", descriptor = "[Law;")
    public static class70[] field8828 = new class70[50];

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!sea", name = "m", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!sea", name = "n", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!sea", name = "o", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!sea", name = "q", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!sea", name = "s", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!sea", name = "t", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!sea", name = "u", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!sea", name = "v", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!sea", name = "w", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!sea", name = "x", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!sea", name = "B", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!sea", name = "C", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!sea", name = "D", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "Ldd;")
    private class660 field8822;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILoa;ILni;ZZI)V", line = 3)
    public final void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6) {
        if (!arg5) {
            this.field8822 = null;
        }
        ++field8834;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Loa;Lbd;IIIIIZIII)V", line = 14)
    public class653(class651 arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class580.method3187(arg9, -123, arg8));
        this.field8826 = new class62(arg0, arg1, arg8, arg9, arg2, arg3, super.field6359, super.field6361, arg7, arg10);
        this.field8835 = arg1.field816 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "(Z)I", line = 23)
    public final int method152(boolean arg0) {
        ++field8830;
        if (!arg0) {
            field8828 = null;
        }
        return this.field8826.field952;
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V", line = 38)
    public static void method3577(int arg0) {
        if (arg0 < 35) {
            field8828 = null;
        }
        field8828 = null;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Loa;B)V", line = 49)
    public final void method148(class651 arg0, byte arg1) {
        if (arg1 != 70) {
            field8828 = null;
        }
        ++field8831;
        this.field8826.method505(-30964, arg0);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)Z", line = 61)
    public final boolean method150(byte arg0) {
        if (arg0 >= -34) {
            field8828 = null;
        }
        ++field8824;
        return this.field8826.method502((byte) 17);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(BLoa;)Lpe;", line = 72)
    public final class571 method145(byte arg0, class651 arg1) {
        ++field8836;
        class358 var3 = this.field8826.method499(arg1, super.field6361, 2048, false, true, super.field6359, arg0 ^ 25962);
        if (var3 == null) {
            return null;
        } else {
            class397 var4 = arg1.method455();
            var4.method576(super.field6359, super.field6355, super.field6361);
            class571 var5 = null;
            if (this.field8835) {
                var5 = class157.method1100((byte) -107, 1);
            }
            int var6 = super.field6359 >> 9;
            if (arg0 != 124) {
                this.field8835 = true;
            }
            int var7 = super.field6361 >> 9;
            this.field8826.method495(var4, var7, arg1, true, true, var3, var6, var7, var6);
            if (this.field8826.field943 != null) {
                class174 var8 = this.field8826.field943.method2711();
                arg1.method392(var3, var8, var4, var5 != null ? var5.field7581[0] : null, 0);
            } else {
                var3.method1947(var4, var5 != null ? var5.field7581[0] : null, 0);
            }
            if (this.field8822 == null) {
                this.field8822 = class516.method2881(super.field6355, true, var3, super.field6359, super.field6361);
            } else {
                class587.method3229(super.field6361, arg0 + -122, super.field6359, super.field6355, this.field8822, var3);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILoa;)Ldd;", line = 117)
    public final class660 method143(int arg0, class651 arg1) {
        if (arg0 != 31358) {
            return null;
        } else {
            ++field8829;
            return this.field8822;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Loa;Z)V", line = 128)
    public final void method147(class651 arg0, boolean arg1) {
        ++field8820;
        class358 var3 = this.field8826.method499(arg0, super.field6361, 262144, arg1, true, super.field6359, 25878);
        if (var3 != null) {
            int var4 = super.field6359 >> 9;
            int var5 = super.field6361 >> 9;
            class397 var6 = arg0.method455();
            var6.method576(super.field6359, super.field6355, super.field6361);
            this.field8826.method495(var6, var5, arg0, true, false, var3, var4, var5, var4);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Loa;BI)Lba;", line = 150)
    public final class358 method137(class651 arg0, byte arg1, int arg2) {
        if (arg1 != -47) {
            return null;
        } else {
            ++field8837;
            return this.field8826.method499(arg0, 0, arg2, false, false, 0, arg1 ^ -25913);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)Z", line = 161)
    public final boolean method139(int arg0) {
        ++field8839;
        if (arg0 != 2) {
            this.method137((class651) null, (byte) -81, 15);
        }
        return false;
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(B)I", line = 175)
    public final int method151(byte arg0) {
        if (arg0 != 78) {
            this.method150((byte) 111);
        }
        ++field8827;
        return this.field8826.field953;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V", line = 186)
    public final void method144(boolean arg0) {
        if (arg0) {
            this.method149((byte) -103, 121, (class651) null, -97);
        }
        ++field8823;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Loa;I)V", line = 199)
    public final void method138(class651 arg0, int arg1) {
        if (arg1 == 2215) {
            ++field8832;
            this.field8826.method497(true, arg0);
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(Z)I", line = 210)
    public final int method146(boolean arg0) {
        ++field8833;
        if (arg0) {
            this.field8826 = null;
        }
        return this.field8826.field947;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(BILoa;I)Z", line = 226)
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        ++field8821;
        class358 var5 = this.field8826.method499(arg2, super.field6361, 131072, false, false, super.field6359, 25878);
        int var6 = 67 / ((-26 - arg0) / 38);
        if (var5 == null) {
            return false;
        } else {
            class397 var7 = arg2.method455();
            var7.method576(super.field6359, super.field6355, super.field6361);
            return var5.method1931(arg3, arg1, var7, false);
        }
    }

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "(Z)V", line = 246)
    public static final void method3578(boolean arg0) {
        class62.field957.method2916((byte) 108);
        if (arg0) {
            method3577(83);
        }
        ++field8825;
    }

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "(B)V", line = 260)
    public final void method142(byte arg0) {
        ++field8838;
        if (arg0 != -77) {
            this.field8822 = null;
        }
        throw new IllegalStateException();
    }
}
