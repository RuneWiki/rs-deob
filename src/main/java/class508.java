import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class508 extends class389 implements class164 {

    @OriginalMember(owner = "client!dr", name = "S", descriptor = "Z")
    private boolean field7436;

    @OriginalMember(owner = "client!dr", name = "D", descriptor = "B")
    private byte field7423;

    @OriginalMember(owner = "client!dr", name = "W", descriptor = "Z")
    private boolean field7440;

    @OriginalMember(owner = "client!dr", name = "N", descriptor = "B")
    private byte field7432;

    @OriginalMember(owner = "client!dr", name = "T", descriptor = "B")
    private byte field7437;

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "S")
    private short field7421;

    @OriginalMember(owner = "client!dr", name = "O", descriptor = "Z")
    private boolean field7433;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "Z")
    private boolean field7417;

    @OriginalMember(owner = "client!dr", name = "M", descriptor = "Lba;")
    private class265 field7431;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "Lt;")
    public class475 field7419;

    @OriginalMember(owner = "client!dr", name = "X", descriptor = "Lkh;")
    public static class13 field7441 = new class13(10);

    @OriginalMember(owner = "client!dr", name = "ab", descriptor = "Lkh;")
    public static class13 field7444 = new class13(4);

    @OriginalMember(owner = "client!dr", name = "bb", descriptor = "Lhn;")
    public static class509 field7445 = new class509(43, 1);

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!dr", name = "C", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!dr", name = "E", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!dr", name = "F", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!dr", name = "G", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!dr", name = "H", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!dr", name = "I", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!dr", name = "K", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!dr", name = "L", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!dr", name = "Q", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!dr", name = "R", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!dr", name = "U", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!dr", name = "V", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!dr", name = "Y", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!dr", name = "Z", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!dr", name = "cb", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V")
    public final void method21(boolean arg0) {
        ++field7424;
        this.field7440 = arg0;
        if (this.field7419 != null) {
            this.field7419.method435(-65537 & this.field7419.method433());
        }
    }

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(I)Z")
    public final boolean method614(int arg0) {
        ++field7442;
        return arg0 != -1086 ? false : this.field7417;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lya;Ljt;IIIIIZIIIIIIZ)V")
    public class508(class38 arg0, class69 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field953 == 1, class185.method1230(arg12, arg13, (byte) 116));
        this.field7436 = arg7;
        this.field7423 = (byte) arg12;
        this.field7440 = arg14;
        this.field7432 = (byte) arg13;
        this.field7437 = (byte) arg3;
        this.field7421 = (short) arg1.field964;
        this.field7433 = arg1.field922 != 0 && !arg7;
        this.field7417 = arg0.method372() && arg1.field907 && !this.field7436 && class193.field3258.method2986(28721, class96.field1384) != 0;
        int var16 = 2048;
        if (this.field7440) {
            var16 |= 65536;
        }
        class415 var17 = this.method3028(-4, this.field7417, var16, arg0);
        if (var17 != null) {
            this.field7431 = var17.field6193;
            this.field7419 = var17.field6192;
            if (this.field7440) {
                this.field7419 = this.field7419.method449((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLya;II)Z")
    public final boolean method27(byte arg0, class38 arg1, int arg2, int arg3) {
        if (arg0 > -119) {
            this.field7431 = null;
        }
        ++field7435;
        class475 var5 = this.method3029(arg1, -125, 131072);
        if (var5 != null) {
            class125 var6 = arg1.method296();
            var6.method206(super.field5837, super.field5831, super.field5833);
            return var5.method440(arg3, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "(B)I")
    public final int method3026(byte arg0) {
        if (arg0 != 62) {
            this.field7433 = false;
        }
        ++field7443;
        return this.field7419 != null ? this.field7419.method429() / 4 : 15;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lya;I)Lag;")
    public final class484 method29(class38 arg0, int arg1) {
        ++field7426;
        if (this.field7419 == null) {
            return null;
        } else {
            class125 var3 = arg0.method296();
            var3.method206(super.field5837, super.field5831, super.field5833);
            class484 var4 = null;
            if (this.field7433) {
                var4 = class133.method971(1, 0);
            }
            this.field7419.method439(var3, var4 == null ? null : var4.field6964[0], 0);
            return arg1 < 22 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "(I)V")
    public static void method3027(int arg0) {
        field7441 = null;
        field7445 = null;
        if (arg0 == 0) {
            field7444 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)I")
    public final int method627(int arg0) {
        ++field7430;
        if (arg0 != 23326) {
            this.method27((byte) 125, (class38) null, -21, -43);
        }
        return this.field7423;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILya;)V")
    public final void method623(int arg0, class38 arg1) {
        ++field7418;
        Object var3 = null;
        class265 var5;
        if (this.field7431 == null && this.field7417) {
            class415 var4 = this.method3028(-4, true, 262144, arg1);
            var5 = var4 != null ? var4.field6193 : null;
        } else {
            var5 = this.field7431;
            this.field7431 = null;
        }
        if (var5 != null) {
            class98.method792(var5, this.field7437, super.field5837, super.field5833, (boolean[]) null);
        }
        if (arg0 < 125) {
            this.field7433 = true;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLya;)V")
    public final void method619(boolean arg0, class38 arg1) {
        ++field7415;
        Object var3 = null;
        if (!arg0) {
            this.method29((class38) null, -57);
        }
        class265 var5;
        if (this.field7431 == null && this.field7417) {
            class415 var4 = this.method3028(-4, true, 262144, arg1);
            var5 = var4 != null ? var4.field6193 : null;
        } else {
            var5 = this.field7431;
            this.field7431 = null;
        }
        if (var5 != null) {
            class56.method514(var5, this.field7437, super.field5837, super.field5833, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)I")
    public final int method624(byte arg0) {
        ++field7420;
        if (arg0 >= -119) {
            this.field7440 = false;
        }
        return 65535 & this.field7421;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZILya;)Lpm;")
    private final class415 method3028(int arg0, boolean arg1, int arg2, class38 arg3) {
        if (arg0 != -4) {
            field7441 = null;
        }
        ++field7439;
        class69 var5 = class510.field7458.method2973(-119, this.field7421 & 65535);
        class145 var6;
        class145 var7;
        if (this.field7436) {
            var6 = class290.field4367[this.field7437];
            var7 = class289.field4358[0];
        } else {
            var6 = class289.field4358[this.field7437];
            if (~this.field7437 > -4) {
                var7 = class289.field4358[this.field7437 + 1];
            } else {
                var7 = null;
            }
        }
        return var5.method595(arg2, var6, arg1, super.field5833, -1, arg3, this.field7423 != 11 ? this.field7423 : 10, this.field7423 != 11 ? this.field7432 : this.field7432 + 4, var7, super.field5831, super.field5837);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lya;II)Lt;")
    private final class475 method3029(class38 arg0, int arg1, int arg2) {
        ++field7438;
        if (this.field7419 != null && ~arg0.method314(this.field7419.method433(), arg2) == -1) {
            return this.field7419;
        } else {
            int var4 = -51 % ((arg1 - 49) / 63);
            class415 var5 = this.method3028(-4, false, arg2, arg0);
            return var5 != null ? var5.field6192 : null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)I")
    public final int method621(int arg0) {
        ++field7427;
        return arg0 != 3021 ? 124 : this.field7432;
    }

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        if (arg0 != 13651334) {
            field7441 = null;
        }
        ++field7428;
        return this.field7440;
    }

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "(I)I")
    public final int method24(int arg0) {
        if (arg0 != -867749273) {
            this.method615((class38) null, false, -21);
        }
        ++field7414;
        return this.field7419 != null ? this.field7419.method427() : 0;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lya;ZI)Lt;")
    public final class475 method615(class38 arg0, boolean arg1, int arg2) {
        ++field7422;
        return arg1 ? null : this.method3029(arg0, -121, arg2);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZII)Lij;")
    public static final class293 method3030(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field7429;
        class293 var5 = new class293();
        var5.field4453 = arg1;
        var5.field4454 = arg0;
        class70.field993.method2591((long) arg4, var5, (byte) -119);
        class127.method929(arg0, (byte) 116);
        class114 var6 = class475.method2864(true, arg4);
        int var7 = -21 % ((-82 - arg3) / 41);
        if (var6 != null) {
            class262.method1747(20556, var6);
        }
        if (class226.field3684 != null) {
            class262.method1747(20556, class226.field3684);
            class226.field3684 = null;
        }
        class320.method2048(8);
        if (var6 != null) {
            class216.method1499((byte) -99, !arg2, var6);
        }
        if (!arg2) {
            class192.method1352(arg0);
        }
        if (!arg2 && ~class155.field2310 != 0) {
            class129.method944(class155.field2310, 1031, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
    public final void method616(int arg0) {
        if (this.field7419 != null) {
            this.field7419.method455();
        }
        if (arg0 != 23504) {
            this.method623(-35, (class38) null);
        }
        ++field7425;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lya;Z)V")
    public final void method25(class38 arg0, boolean arg1) {
        if (!arg1) {
            ++field7416;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILya;ILor;IZ)V")
    public final void method23(int arg0, int arg1, class38 arg2, int arg3, class455 arg4, int arg5, boolean arg6) {
        if (arg4 instanceof class141) {
            class141 var8 = (class141) arg4;
            if (this.field7419 != null && var8.field2142 != null) {
                this.field7419.method422(var8.field2142, arg3, arg5, arg1, arg6);
            }
        } else if (arg4 instanceof class508) {
            class508 var9 = (class508) arg4;
            if (this.field7419 != null && var9.field7419 != null) {
                this.field7419.method422(var9.field7419, arg3, arg5, arg1, arg6);
            }
        }
        ++field7434;
        if (arg0 != 3) {
            this.field7436 = false;
        }
    }
}
