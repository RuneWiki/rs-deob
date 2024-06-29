import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class488 extends class171 implements class164 {

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "Lgp;")
    public class36 field7021;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "Z")
    private boolean field7017;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "[I")
    public static int[] field7015 = new int[256];

    @OriginalMember(owner = "client!jm", name = "M", descriptor = "[I")
    public static int[] field7034;

    @OriginalMember(owner = "client!jm", name = "L", descriptor = "Lqu;")
    public static class65 field7033;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "Ll;")
    public static class16 field7031;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)I")
    public final int method624(byte arg0) {
        ++field7014;
        if (arg0 >= -119) {
            field7034 = null;
        }
        return this.field7021.field405;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILya;ILor;IZ)V")
    public final void method23(int arg0, int arg1, class38 arg2, int arg3, class455 arg4, int arg5, boolean arg6) {
        if (arg0 == 3) {
            ++field7026;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lya;Ljt;IIIIIZII)V")
    public class488(class38 arg0, class69 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field938, arg1.field897);
        this.field7021 = new class36(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field7017 = arg1.field922 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
    public final void method21(boolean arg0) {
        if (arg0) {
            this.field7017 = true;
        }
        ++field7022;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        if (arg0 != 13651334) {
            this.method23(18, 12, (class38) null, 118, (class455) null, 22, true);
        }
        ++field7016;
        return false;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILya;)V")
    public final void method623(int arg0, class38 arg1) {
        ++field7025;
        if (arg0 < 125) {
            field7033 = null;
        }
        this.field7021.method251(arg1, 1);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lya;Z)V")
    public final void method25(class38 arg0, boolean arg1) {
        ++field7013;
        if (arg1) {
            method2910((byte) -83, -64);
        }
        class475 var3 = this.field7021.method249(super.field2541, super.field2542, 262144, true, arg0, (byte) -123, true);
        if (var3 != null) {
            int var4 = super.field2541 >> 7;
            int var5 = super.field2542 >> 7;
            this.field7021.method243(arg0, var4, var5, var3, false, var4, -23689, var5);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BI)V")
    public static final void method2909(byte arg0, int arg1) {
        ++field7020;
        class211 var2 = class452.method2749(16, -10, arg1);
        int var3 = 23 / ((arg0 - 62) / 57);
        var2.method1460(true);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(BI)Lgf;")
    public static final class184 method2910(byte arg0, int arg1) {
        ++field7019;
        class184 var2 = (class184) class446.field6540.method87((long) arg1, -2062335807);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class89.field1278.method2536(0, 0, arg1);
            if (arg0 < 124) {
                return null;
            } else {
                class184 var4 = new class184();
                if (var3 != null) {
                    var4.method1227(new class217(var3), (byte) 27);
                }
                var4.method1225(false);
                class446.field6540.method84((long) arg1, var4, (byte) 27);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lya;ZI)Lt;")
    public final class475 method615(class38 arg0, boolean arg1, int arg2) {
        ++field7027;
        if (arg1) {
            this.field7017 = false;
        }
        return this.field7021.method249(0, 0, arg2, false, arg0, (byte) -116, false);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLya;II)Z")
    public final boolean method27(byte arg0, class38 arg1, int arg2, int arg3) {
        ++field7030;
        class475 var5 = this.field7021.method249(super.field2541, super.field2542, 131072, false, arg1, (byte) -103, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg0 >= -119) {
                method2910((byte) 44, 46);
            }
            class125 var6 = arg1.method296();
            var6.method206(super.field2541, super.field2540, super.field2542);
            return var5.method440(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)I")
    public final int method627(int arg0) {
        ++field7029;
        return arg0 != 23326 ? -14 : this.field7021.field427;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
    public final void method616(int arg0) {
        if (arg0 == 23504) {
            ++field7023;
        }
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)Z")
    public final boolean method614(int arg0) {
        if (arg0 != -1086) {
            this.method623(20, (class38) null);
        }
        ++field7018;
        return this.field7021.method240(arg0 + 14313);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZLya;)V")
    public final void method619(boolean arg0, class38 arg1) {
        this.field7021.method245(arg1, 124);
        ++field7032;
        if (!arg0) {
            field7015 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)I")
    public final int method621(int arg0) {
        if (arg0 != 3021) {
            this.method627(-64);
        }
        ++field7012;
        return this.field7021.field416;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lya;I)Lag;")
    public final class484 method29(class38 arg0, int arg1) {
        ++field7024;
        class475 var3 = this.field7021.method249(super.field2541, super.field2542, 2048, true, arg0, (byte) -108, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 <= 22) {
                field7031 = null;
            }
            class125 var4 = arg0.method296();
            var4.method206(super.field2541, super.field2540, super.field2542);
            class484 var5 = null;
            if (this.field7017) {
                var5 = class133.method971(1, 0);
            }
            if (this.field7021.field406 == null) {
                var3.method439(var4, var5 != null ? var5.field6964[0] : null, 0);
            } else {
                class341 var6 = this.field7021.field406.method2221();
                arg0.method311(var3, var6, var4, var5 == null ? null : var5.field6964[0], 0);
            }
            int var7 = super.field2541 >> 7;
            int var8 = super.field2542 >> 7;
            this.field7021.method243(arg0, var7, var8, var3, true, var7, -23689, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method2911(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7028;
        int var8 = arg4 - 334;
        if (arg1) {
            field7033 = null;
        }
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class68.field887 - class528.field7697) * var8 / 100 + class528.field7697;
        int var10 = arg3 * var9 >> 8;
        int var11 = 16383 & -arg7 + 16384;
        int var12 = 16384 - arg6 & 16383;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class281.field4278[var11] * -var10 >> 15;
            var15 = class281.field4279[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class281.field4278[var12] * var15 >> 15;
            var15 = class281.field4279[var12] * var15 >> 15;
        }
        class419.field6263 = arg7;
        class473.field6831 = arg0 - var14;
        class396.field5932 = arg6;
        class71.field1024 = -var15 + arg2;
        class412.field6180 = -var13 + arg5;
        class364.field5380 = 0;
    }

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "(I)V")
    public static void method2912(int arg0) {
        field7015 = null;
        field7033 = null;
        if (arg0 != 16) {
            method2912(36);
        }
        field7031 = null;
        field7034 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; ++var2) {
                if ((var1 & 1) != 1) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -306674912;
                }
            }
            field7015[var0] = var1;
        }
        field7034 = new int[2];
        field7033 = new class65(2, 4, 4, 0);
    }
}
