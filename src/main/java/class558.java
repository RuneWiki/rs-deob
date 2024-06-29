import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class558 extends class18 implements class532 {

    @OriginalMember(owner = "client!th", name = "E", descriptor = "Lwc;")
    public class62 field7406;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "Z")
    private boolean field7395;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "Lcu;")
    public static class206 field7400 = new class206(57, -1);

    @OriginalMember(owner = "client!th", name = "D", descriptor = "I")
    public static int field7405 = 0;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Z")
    public static boolean field7413 = false;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "Ldd;")
    private class660 field7397;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Loa;I)V")
    public final void method138(class651 arg0, int arg1) {
        ++field7410;
        this.field7406.method497(true, arg0);
        if (arg1 != 2215) {
            method3078(55);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BILoa;I)Z")
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        ++field7401;
        int var5 = 38 % ((arg0 - -26) / 38);
        class358 var6 = this.field7406.method499(arg2, super.field305, 131072, false, false, super.field300, 25878);
        if (var6 == null) {
            return false;
        } else {
            class397 var7 = arg2.method455();
            var7.method576(super.field303 + super.field300, super.field309, super.field305 - -super.field297);
            return var6.method1931(arg3, arg1, var7, false);
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
    public static void method3078(int arg0) {
        field7400 = null;
        if (arg0 != -549787511) {
            field7405 = 39;
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(Z)I")
    public final int method152(boolean arg0) {
        if (!arg0) {
            return 92;
        } else {
            ++field7412;
            return this.field7406.field952;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Loa;B)V")
    public final void method148(class651 arg0, byte arg1) {
        if (arg1 == 70) {
            this.field7406.method505(-30964, arg0);
            ++field7409;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)I")
    public final int method146(boolean arg0) {
        ++field7407;
        if (arg0) {
            this.method145((byte) -25, (class651) null);
        }
        return this.field7406.field947;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
    public final void method144(boolean arg0) {
        ++field7411;
        if (arg0) {
            this.method188((byte) -31);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILoa;)Ldd;")
    public final class660 method143(int arg0, class651 arg1) {
        ++field7408;
        if (arg0 != 31358) {
            this.method152(true);
        }
        return this.field7397;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)I")
    public final int method151(byte arg0) {
        ++field7399;
        if (arg0 != 78) {
            this.method138((class651) null, 49);
        }
        return this.field7406.field953;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z")
    public final boolean method150(byte arg0) {
        ++field7402;
        if (arg0 > -34) {
            this.method149((byte) 124, -46, (class651) null, -68);
        }
        return this.field7406.method502((byte) 17);
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(B)I")
    public final int method188(byte arg0) {
        ++field7403;
        if (arg0 < 73) {
            field7400 = null;
        }
        return this.field7406.method503(true);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Loa;Z)V")
    public final void method147(class651 arg0, boolean arg1) {
        ++field7404;
        class358 var3 = this.field7406.method499(arg0, super.field305, 262144, false, arg1, super.field300, 25878);
        if (var3 != null) {
            int var4 = super.field300 >> 9;
            int var5 = super.field305 >> 9;
            class397 var6 = arg0.method455();
            var6.method576(super.field300, super.field309, super.field305);
            this.field7406.method495(var6, var5, arg0, true, false, var3, var4, var5, var4);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLoa;)Lpe;")
    public final class571 method145(byte arg0, class651 arg1) {
        ++field7396;
        class358 var3 = this.field7406.method499(arg1, super.field305, 2048, false, true, super.field300, 25878);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 124) {
                this.field7395 = true;
            }
            class397 var4 = arg1.method455();
            var4.method576(super.field303 + super.field300, super.field309, super.field305 + super.field297);
            class571 var5 = null;
            if (this.field7395) {
                var5 = class157.method1100((byte) -127, 1);
            }
            int var6 = super.field300 >> 9;
            int var7 = super.field305 >> 9;
            this.field7406.method495(var4, var7, arg1, true, true, var3, var6, var7, var6);
            if (this.field7406.field943 != null) {
                class174 var8 = this.field7406.field943.method2711();
                arg1.method392(var3, var8, var4, var5 == null ? null : var5.field7581[0], 0);
            } else {
                var3.method1947(var4, var5 != null ? var5.field7581[0] : null, 0);
            }
            if (this.field7397 != null) {
                class587.method3229(super.field305, arg0 ^ 126, super.field300, super.field309, this.field7397, var3);
            } else {
                this.field7397 = class516.method2881(super.field309, true, var3, super.field300, super.field305);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Loa;Lbd;IIIIIZIIIIII)V")
    public class558(class651 arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class484.method2702(256, arg12, arg11));
        this.field7406 = new class62(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field7395 = ~arg1.field816 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Loa;BI)Lba;")
    public final class358 method137(class651 arg0, byte arg1, int arg2) {
        if (arg1 != -47) {
            field7413 = true;
        }
        ++field7398;
        return this.field7406.method499(arg0, 0, arg2, false, false, 0, arg1 ^ -25913);
    }
}
