import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class157 extends class168 implements class164 {

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "B")
    private byte field2366;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "S")
    private short field2362;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "Z")
    private boolean field2357;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "B")
    private byte field2359;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "Z")
    private boolean field2354;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "B")
    private byte field2353;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "Z")
    private boolean field2369;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "Lba;")
    private class265 field2371;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "Lt;")
    private class475 field2358;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field2365 = 0;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "Lhn;")
    public static class509 field2372 = new class509(102, 6);

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "Lqd;")
    public static class315 field2377 = new class315("", 14);

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)I")
    public final int method627(int arg0) {
        ++field2350;
        if (arg0 != 23326) {
            method1084(18, -63);
        }
        return this.field2359;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V")
    public static final void method1076(int arg0, byte arg1) {
        if (class221.field3633 == null) {
            class221.field3633 = new byte[4][class69.field976][class285.field4328];
        }
        ++field2364;
        if (arg0 != -17530) {
            field2375 = 34;
        }
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var3 = 0; ~class69.field976 < ~var3; ++var3) {
                for (int var4 = 0; class285.field4328 > var4; ++var4) {
                    class221.field3633[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)Z")
    public final boolean method614(int arg0) {
        if (arg0 != -1086) {
            this.method623(44, (class38) null);
        }
        ++field2368;
        return this.field2369;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lya;II)Lt;")
    private final class475 method1077(class38 arg0, int arg1, int arg2) {
        ++field2356;
        if (this.field2358 != null && ~arg0.method314(this.field2358.method433(), arg2) == -1) {
            return this.field2358;
        } else {
            if (arg1 <= 56) {
                method1080((class164) null, 51);
            }
            class415 var4 = this.method1078(arg2, 0, arg0, false);
            return var4 != null ? var4.field6192 : null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILya;Z)Lpm;")
    private final class415 method1078(int arg0, int arg1, class38 arg2, boolean arg3) {
        ++field2374;
        class69 var5 = class510.field7458.method2973(-126, 65535 & this.field2362);
        if (arg1 != 0) {
            this.method27((byte) 126, (class38) null, -71, -35);
        }
        class145 var6;
        class145 var7;
        if (this.field2354) {
            var6 = class289.field4358[0];
            var7 = class290.field4367[this.field2366];
        } else {
            if (~this.field2366 > -4) {
                var6 = class289.field4358[this.field2366 - -1];
            } else {
                var6 = null;
            }
            var7 = class289.field4358[this.field2366];
        }
        return var5.method595(arg0, var7, arg3, super.field2483, arg1 + -1, arg2, this.field2359, this.field2353, var6, super.field2480, super.field2481);
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)I")
    public final int method1079(int arg0) {
        if (arg0 != 0) {
            return -17;
        } else {
            ++field2363;
            return this.field2358 == null ? 0 : this.field2358.method427();
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lig;I)Z")
    public static final boolean method1080(class164 arg0, int arg1) {
        ++field2381;
        class69 var2 = class510.field7458.method2973(-122, arg0.method624((byte) -123));
        if (~var2.field900 == arg1) {
            return true;
        } else {
            class373 var3 = class59.field711.method1062(92, var2.field900);
            return ~var3.field5556 == 0 ? true : var3.method2334(-2);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)I")
    public final int method621(int arg0) {
        if (arg0 != 3021) {
            this.field2362 = -47;
        }
        ++field2355;
        return this.field2353;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lya;ZI)Lt;")
    public final class475 method615(class38 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field2358 = null;
        }
        ++field2360;
        return this.method1077(arg0, 82, arg2);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)I")
    public static final int method1081(byte arg0, int arg1) {
        int var2 = -14 / ((12 - arg0) / 53);
        ++field2373;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lya;I)Lag;")
    public final class484 method29(class38 arg0, int arg1) {
        ++field2349;
        if (arg1 < 22) {
            this.field2362 = 7;
        }
        if (this.field2358 == null) {
            return null;
        } else {
            class125 var3 = arg0.method296();
            var3.method206(super.field2481 - -super.field2486, super.field2480, super.field2488 + super.field2483);
            class484 var4 = null;
            if (this.field2357) {
                var4 = class133.method971(1, 0);
            }
            this.field2358.method439(var3, var4 != null ? var4.field6964[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLya;II)Z")
    public final boolean method27(byte arg0, class38 arg1, int arg2, int arg3) {
        ++field2379;
        class475 var5 = this.method1077(arg1, 114, 131072);
        if (arg0 >= -119) {
            return false;
        } else if (var5 != null) {
            class125 var6 = arg1.method296();
            var6.method206(super.field2481, super.field2480, super.field2483);
            return var5.method440(arg3, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILkk;I)V")
    public static final void method1082(int arg0, class129 arg1, int arg2) {
        ++field2367;
        int var3 = -1;
        if (arg2 != -1) {
            method1080((class164) null, -80);
        }
        int var4 = 0;
        if (class475.field6854 < arg1.field1940) {
            class119.method898(arg1, (byte) 88);
        } else if (~class475.field6854 < ~arg1.field1893) {
            class34.method234(false, arg1, 8);
            var4 = class202.field3367;
            var3 = class455.field6630;
        } else {
            class523.method3111(arg1, -112);
        }
        if (~arg1.field5837 > -129 || ~arg1.field5833 > -129 || class69.field976 * 128 + -128 <= arg1.field5837 || ~arg1.field5833 <= ~((class285.field4328 + -1) * 128)) {
            arg1.field1959 = -1;
            var3 = -1;
            arg1.field1962 = -1;
            var4 = 0;
            arg1.field1904 = -1;
            arg1.field1940 = 0;
            arg1.field1893 = 0;
            arg1.field5837 = arg1.field1978[0] * 128 - -(arg1.method953(-108) * 64);
            arg1.field5833 = arg1.field1976[0] * 128 - -(arg1.method953(-63) * 64);
            arg1.method946(-3073);
        }
        if (class398.field5947 == arg1 && (arg1.field5837 < 1536 || ~arg1.field5833 > -1537 || class69.field976 * 128 + -1536 <= arg1.field5837 || ~arg1.field5833 <= ~(class285.field4328 * 128 - 1536))) {
            arg1.field1904 = -1;
            var3 = -1;
            arg1.field1940 = 0;
            var4 = 0;
            arg1.field1959 = -1;
            arg1.field1893 = 0;
            arg1.field1962 = -1;
            arg1.field5837 = arg1.field1978[0] * 128 - -(arg1.method953(arg2 + -82) * 64);
            arg1.field5833 = arg1.field1976[0] * 128 - -(arg1.method953(arg2 ^ 38) * 64);
            arg1.method946(arg2 ^ 3072);
        }
        int var5 = class298.method1934((byte) -61, arg1);
        class66.method561(var5, var4, arg1, false, var3);
        class405.method2527((byte) -29, arg1);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
    public static void method1083(boolean arg0) {
        field2377 = null;
        field2372 = null;
        if (!arg0) {
            field2375 = 72;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLya;)V")
    public final void method619(boolean arg0, class38 arg1) {
        ++field2361;
        if (!arg0) {
            this.field2362 = -69;
        }
        Object var3 = null;
        class265 var5;
        if (this.field2371 == null && this.field2369) {
            class415 var4 = this.method1078(262144, 0, arg1, true);
            var5 = var4 == null ? null : var4.field6193;
        } else {
            var5 = this.field2371;
            this.field2371 = null;
        }
        if (var5 != null) {
            class56.method514(var5, this.field2366, super.field2481, super.field2483, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lya;Z)V")
    public final void method25(class38 arg0, boolean arg1) {
        ++field2380;
        if (arg1) {
            this.field2354 = true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
    public static final void method1084(int arg0, int arg1) {
        ++field2376;
        class211 var2 = class452.method2749(arg1, 127, arg0);
        var2.method1460(true);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I")
    public final int method624(byte arg0) {
        ++field2352;
        if (arg0 > -119) {
            this.method614(48);
        }
        return 65535 & this.field2362;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILya;)V")
    public final void method623(int arg0, class38 arg1) {
        ++field2370;
        Object var3 = null;
        class265 var5;
        if (this.field2371 == null && this.field2369) {
            class415 var4 = this.method1078(262144, 0, arg1, true);
            var5 = var4 == null ? null : var4.field6193;
        } else {
            var5 = this.field2371;
            this.field2371 = null;
        }
        if (arg0 < 125) {
            this.method616(-91);
        }
        if (var5 != null) {
            class98.method792(var5, this.field2366, super.field2481, super.field2483, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lya;Ljt;IIIIZIIIII)V")
    public class157(class38 arg0, class69 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class503.method2988(arg11, arg10, -11865));
        super.field2483 = arg5;
        this.field2366 = (byte) arg2;
        this.field2362 = (short) arg1.field964;
        this.field2357 = arg1.field922 != 0 && !arg6;
        this.field2359 = (byte) arg10;
        this.field2354 = arg6;
        super.field2481 = arg3;
        this.field2353 = (byte) arg11;
        this.field2369 = arg0.method372() && arg1.field907 && !this.field2354 && ~class193.field3258.method2986(28721, class96.field1384) != -1;
        class415 var13 = this.method1078(2048, 0, arg0, this.field2369);
        if (var13 != null) {
            this.field2371 = var13.field6193;
            this.field2358 = var13.field6192;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public final void method616(int arg0) {
        if (this.field2358 != null) {
            this.field2358.method455();
        }
        if (arg0 == 23504) {
            ++field2351;
        }
    }
}
