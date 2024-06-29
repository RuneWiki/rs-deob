import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class338 extends class522 implements class401 {

    @OriginalMember(owner = "client!fw", name = "Y", descriptor = "Lej;")
    public class359 field5223;

    @OriginalMember(owner = "client!fw", name = "G", descriptor = "Z")
    private boolean field5207;

    @OriginalMember(owner = "client!fw", name = "P", descriptor = "[I")
    public static int[] field5215 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!fw", name = "M", descriptor = "I")
    public static int field5213 = 0;

    @OriginalMember(owner = "client!fw", name = "A", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!fw", name = "B", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!fw", name = "C", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!fw", name = "D", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!fw", name = "F", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!fw", name = "H", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!fw", name = "I", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!fw", name = "J", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!fw", name = "K", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!fw", name = "L", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!fw", name = "N", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!fw", name = "Q", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!fw", name = "S", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!fw", name = "T", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!fw", name = "U", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!fw", name = "V", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!fw", name = "W", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!fw", name = "X", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BLya;)V")
    public final void method231(byte arg0, class11 arg1) {
        if (arg0 != 33) {
            this.field5223 = null;
        }
        this.field5223.method2155(arg1, (byte) 80);
        ++field5222;
    }

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "(B)V")
    public static void method2066(byte arg0) {
        if (arg0 != 17) {
            method2067(-61, false);
        }
        field5215 = null;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IZ)V")
    public static final void method2067(int arg0, boolean arg1) {
        ++field5214;
        class506 var2 = class14.method185(-1304589728, arg0, 11);
        var2.method2986(-44);
        if (arg1) {
            method2066((byte) -104);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lya;B)V")
    public final void method225(class11 arg0, byte arg1) {
        ++field5212;
        int var3 = 97 % ((arg1 - 42) / 36);
        this.field5223.method2149(arg0, 9816);
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)V")
    public final void method239(int arg0) {
        ++field5205;
        if (arg0 < -38) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)I")
    public final int method223(int arg0) {
        ++field5208;
        if (arg0 != -19634) {
            this.method230(-49);
        }
        return this.field5223.field5491;
    }

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "(I)I")
    public final int method236(int arg0) {
        if (arg0 != 0) {
            field5215 = null;
        }
        ++field5211;
        return this.field5223.method2153((byte) -66);
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(Z)V")
    public final void method229(boolean arg0) {
        ++field5209;
        if (arg0) {
            this.field5207 = false;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(CI)Z")
    public static final boolean method2068(char arg0, int arg1) {
        if (arg1 != -8213) {
            field5213 = 57;
        }
        ++field5217;
        if (~arg0 <= -33 && ~arg0 >= -127) {
            return true;
        } else if (~arg0 <= -161 && ~arg0 >= -256) {
            return true;
        } else {
            return ~arg0 == -8365 || ~arg0 == -339 || ~arg0 == -8213 || ~arg0 == -340 || ~arg0 == -377;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lya;I)V")
    public final void method234(class11 arg0, int arg1) {
        if (arg1 != 28007) {
            this.field5223 = null;
        }
        ++field5203;
        class398 var3 = this.field5223.method2157(super.field7671, 262144, true, -23872, arg0, true, super.field7681);
        if (var3 != null) {
            this.field5223.method2154(arg0, super.field7673, super.field7676, super.field7683, var3, (byte) 88, false, super.field7687);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)Z")
    public final boolean method232(boolean arg0) {
        if (arg0) {
            this.method224((class11) null, -49, 109, -71, (class419) null, 87, true);
        }
        ++field5219;
        return this.field5223.method2148((byte) 124);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILya;I)Lt;")
    public final class398 method241(int arg0, class11 arg1, int arg2) {
        ++field5206;
        int var4 = 116 / ((62 - arg2) / 42);
        return this.field5223.method2157(0, arg0, false, -23872, arg1, false, 0);
    }

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "(I)Z")
    public final boolean method230(int arg0) {
        ++field5216;
        if (arg0 != -22611) {
            this.method239(102);
        }
        return false;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lya;IIILqj;IZ)V")
    public final void method224(class11 arg0, int arg1, int arg2, int arg3, class419 arg4, int arg5, boolean arg6) {
        int var8 = 80 % ((24 - arg5) / 62);
        ++field5218;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)I")
    public final int method240(int arg0) {
        ++field5220;
        return arg0 != -15578 ? -53 : this.field5223.field5492;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method233(int arg0, class11 arg1, int arg2, int arg3) {
        ++field5204;
        class398 var5 = this.field5223.method2157(super.field7671, 131072, false, -23872, arg1, false, super.field7681);
        if (var5 == null) {
            return false;
        } else {
            class511 var6 = arg1.method66();
            var6.method1307(super.field7681, super.field7689, super.field7671);
            if (arg2 != 2) {
                this.field5223 = null;
            }
            return var5.method655(arg0, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lya;Lpf;IIIIIZIIIIIII)V")
    public class338(class11 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field7147 == 1, class90.method693(arg13, 0, arg12));
        this.field5223 = new class359(arg0, arg1, arg12, arg13, super.field7686, arg3, arg4, arg6, arg7, arg14);
        this.field5207 = ~arg1.field7230 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(Lya;I)Lmo;")
    public final class268 method238(class11 arg0, int arg1) {
        ++field5210;
        class398 var3 = this.field5223.method2157(super.field7671, 2048, true, -23872, arg0, false, super.field7681);
        if (var3 == null) {
            return null;
        } else {
            class511 var4 = arg0.method66();
            var4.method1307(super.field7681, super.field7689, super.field7671);
            class268 var5 = null;
            if (arg1 != -1) {
                this.method238((class11) null, -122);
            }
            if (this.field5207) {
                var5 = class281.method1757(0, 1);
            }
            if (this.field5223.field5505 != null) {
                class46 var6 = this.field5223.field5505.method2316();
                arg0.method73(var3, var6, var4, var5 == null ? null : var5.field3992[0], 0);
            } else {
                var3.method640(var4, var5 == null ? null : var5.field3992[0], 0);
            }
            this.field5223.method2154(arg0, super.field7673, super.field7676, super.field7683, var3, (byte) 88, true, super.field7687);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)I")
    public final int method222(byte arg0) {
        if (arg0 > -99) {
            this.method225((class11) null, (byte) -92);
        }
        ++field5202;
        return this.field5223.field5500;
    }
}
