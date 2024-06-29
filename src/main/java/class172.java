import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class172 extends class303 implements class323 {

    @OriginalMember(owner = "client!or", name = "E", descriptor = "Luc;")
    public class200 field2226;

    @OriginalMember(owner = "client!or", name = "A", descriptor = "Z")
    private boolean field2222;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!or", name = "B", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!or", name = "F", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!or", name = "G", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!or", name = "J", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!or", name = "K", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!or", name = "M", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!or", name = "N", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!or", name = "O", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!or", name = "P", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "Lhs;")
    public static class441 field2221;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)Z", line = 4)
    public final boolean method417(boolean arg0) {
        ++field2235;
        return arg0 ? false : this.field2226.method1290(-24);
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)I", line = 16)
    public final int method414(int arg0) {
        ++field2230;
        return arg0 != 17350 ? 15 : this.field2226.field2597;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lqa;I)V", line = 27)
    public final void method416(class129 arg0, int arg1) {
        if (arg1 != 16663) {
            field2229 = 95;
        }
        this.field2226.method1278(-7278, arg0);
        ++field2220;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IZILqa;)Z", line = 43)
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        ++field2231;
        class507 var5 = this.field2226.method1280(arg1, super.field3929, super.field3926, 0, 131072, false, arg3);
        if (var5 == null) {
            return false;
        } else {
            class142 var6 = arg3.method847();
            var6.method982(super.field3931 + super.field3926, super.field3919, super.field3929 + super.field3924);
            return var5.method499(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)I", line = 59)
    public final int method415(int arg0) {
        if (arg0 != -15317) {
            this.field2222 = false;
        }
        ++field2224;
        return this.field2226.field2585;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(Lqa;B)Lvs;", line = 70)
    public final class465 method172(class129 arg0, byte arg1) {
        ++field2225;
        class507 var3 = this.field2226.method1280(false, super.field3929, super.field3926, 0, 2048, true, arg0);
        if (var3 == null) {
            return null;
        } else {
            class142 var4 = arg0.method847();
            var4.method982(super.field3926 - -super.field3931, super.field3919, super.field3929 + super.field3924);
            class465 var5 = null;
            if (this.field2222) {
                var5 = class92.method635(1, -16461);
            }
            int var6 = 94 % ((arg1 - 48) / 60);
            if (this.field2226.field2572 == null) {
                var3.method520(var4, var5 == null ? null : var5.field6843[0], 0);
            } else {
                class287 var7 = this.field2226.field2572.method1969();
                arg0.method824(var3, var7, var4, var5 == null ? null : var5.field6843[0], 0);
            }
            int var8 = super.field3926 >> 7;
            int var9 = super.field3929 >> 7;
            this.field2226.method1279(var8, arg0, var9, var3, var8, true, var9, (byte) 97);
            return var5;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BLqa;)V", line = 114)
    public final void method175(byte arg0, class129 arg1) {
        if (arg0 != 91) {
            field2229 = 63;
        }
        ++field2233;
        class507 var3 = this.field2226.method1280(false, super.field3929, super.field3926, 0, 262144, true, arg1);
        if (var3 != null) {
            int var4 = super.field3926 >> 7;
            int var5 = super.field3929 >> 7;
            this.field2226.method1279(var4, arg1, var5, var3, var4, false, var5, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(B)I", line = 138)
    public final int method1131(byte arg0) {
        if (arg0 < 72) {
            field2221 = null;
        }
        ++field2236;
        return this.field2226.method1287(1);
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lqa;Ljt;IIIIIZIIIIII)V", line = 150)
    public class172(class129 arg0, class402 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class520.method3096(arg11, (byte) -42, arg12));
        this.field2226 = new class200(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field2222 = arg1.field5347 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IILqa;)Lc;", line = 159)
    public final class507 method419(int arg0, int arg1, class129 arg2) {
        if (arg1 != -32039) {
            this.method414(22);
        }
        ++field2223;
        return this.field2226.method1280(false, 0, 0, 0, arg0, false, arg2);
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V", line = 170)
    public final void method418(int arg0) {
        if (arg0 != -14924) {
            this.field2222 = true;
        }
        ++field2227;
    }

    @OriginalMember(owner = "client!or", name = "h", descriptor = "(I)V", line = 180)
    public static void method1132(int arg0) {
        field2221 = null;
        if (arg0 != 0) {
            method1133((byte) 0);
        }
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(B)I", line = 190)
    public static final int method1133(byte arg0) {
        ++field2232;
        if ((double) class230.field2954 == 3.0D) {
            return 37;
        } else {
            if (arg0 <= 83) {
                method1133((byte) -17);
            }
            if ((double) class230.field2954 == 4.0D) {
                return 50;
            } else if ((double) class230.field2954 == 6.0D) {
                return 75;
            } else {
                return (double) class230.field2954 == 8.0D ? 100 : 200;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)I", line = 220)
    public final int method413(int arg0) {
        if (arg0 != -30502) {
            this.method414(50);
        }
        ++field2228;
        return this.field2226.field2565;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lqa;B)V", line = 231)
    public final void method421(class129 arg0, byte arg1) {
        ++field2234;
        if (arg1 >= -88) {
            method1132(-67);
        }
        this.field2226.method1282(arg0, (byte) 112);
    }
}
