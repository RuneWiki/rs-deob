import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class515 extends class259 implements class401 {

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "Lej;")
    public class359 field7566;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "Z")
    private boolean field7559;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "[F")
    public static float[] field7556 = new float[4];

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "I")
    public static int field7563 = 0;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "F")
    public static float field7561;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILya;II)Z", line = 3)
    public final boolean method233(int arg0, class11 arg1, int arg2, int arg3) {
        ++field7552;
        class398 var5 = this.field7566.method2157(super.field3854, 131072, false, -23872, arg1, false, super.field3864);
        if (arg2 != 2) {
            return true;
        } else if (var5 == null) {
            return false;
        } else {
            class511 var6 = arg1.method66();
            var6.method1307(super.field3864, super.field3861, super.field3854);
            return var5.method655(arg0, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)I", line = 23)
    public final int method222(byte arg0) {
        ++field7549;
        return arg0 > -99 ? 105 : this.field7566.field5500;
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)Z", line = 36)
    public final boolean method230(int arg0) {
        if (arg0 != -22611) {
            this.method238((class11) null, -87);
        }
        ++field7562;
        return false;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)I", line = 48)
    public final int method223(int arg0) {
        ++field7565;
        if (arg0 != -19634) {
            this.method231((byte) -63, (class11) null);
        }
        return this.field7566.field5491;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)I", line = 59)
    public final int method240(int arg0) {
        if (arg0 != -15578) {
            this.field7566 = null;
        }
        ++field7550;
        return this.field7566.field5492;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)Z", line = 76)
    public final boolean method232(boolean arg0) {
        ++field7558;
        if (arg0) {
            this.method234((class11) null, 85);
        }
        return this.field7566.method2148((byte) 17);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLya;)V", line = 87)
    public final void method231(byte arg0, class11 arg1) {
        this.field7566.method2155(arg1, (byte) 80);
        if (arg0 == 33) {
            ++field7560;
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)V", line = 98)
    public static void method3053(byte arg0) {
        field7556 = null;
        if (arg0 != -54) {
            method3053((byte) 80);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILya;I)Lt;", line = 109)
    public final class398 method241(int arg0, class11 arg1, int arg2) {
        int var4 = 30 / ((62 - arg2) / 42);
        ++field7557;
        return this.field7566.method2157(0, arg0, false, -23872, arg1, false, 0);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lya;IIILqj;IZ)V", line = 119)
    public final void method224(class11 arg0, int arg1, int arg2, int arg3, class419 arg4, int arg5, boolean arg6) {
        int var8 = 38 % ((24 - arg5) / 62);
        ++field7551;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lya;Lpf;IIIIIZII)V", line = 137)
    public class515(class11 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field7232, arg1.field7180, arg1.field7231);
        this.field7566 = new class359(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field7559 = ~arg1.field7230 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lya;B)V", line = 149)
    public final void method225(class11 arg0, byte arg1) {
        this.field7566.method2149(arg0, 9816);
        int var3 = 87 % ((42 - arg1) / 36);
        ++field7555;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(Lya;I)Lmo;", line = 159)
    public final class268 method238(class11 arg0, int arg1) {
        ++field7564;
        class398 var3 = this.field7566.method2157(super.field3854, 2048, true, -23872, arg0, false, super.field3864);
        if (var3 == null) {
            return null;
        } else {
            class511 var4 = arg0.method66();
            var4.method1307(super.field3864, super.field3861, super.field3854);
            class268 var5 = null;
            if (arg1 != -1) {
                return null;
            } else {
                if (this.field7559) {
                    var5 = class281.method1757(0, 1);
                }
                if (this.field7566.field5505 == null) {
                    var3.method640(var4, var5 != null ? var5.field3992[0] : null, 0);
                } else {
                    class46 var6 = this.field7566.field5505.method2316();
                    arg0.method73(var3, var6, var4, var5 != null ? var5.field3992[0] : null, 0);
                }
                int var7 = super.field3864 >> 7;
                int var8 = super.field3854 >> 7;
                this.field7566.method2154(arg0, var8, var8, var7, var3, (byte) 88, true, var7);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V", line = 203)
    public final void method239(int arg0) {
        ++field7567;
        if (arg0 > -38) {
            this.field7566 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lya;I)V", line = 215)
    public final void method234(class11 arg0, int arg1) {
        ++field7554;
        class398 var3 = this.field7566.method2157(super.field3854, 262144, true, -23872, arg0, true, super.field3864);
        if (arg1 == 28007) {
            if (var3 != null) {
                int var4 = super.field3864 >> 7;
                int var5 = super.field3854 >> 7;
                this.field7566.method2154(arg0, var5, var5, var4, var3, (byte) 88, false, var4);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(Z)V", line = 237)
    public final void method229(boolean arg0) {
        if (!arg0) {
            ++field7553;
        }
    }
}
