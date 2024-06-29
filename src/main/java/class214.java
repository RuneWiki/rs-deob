import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class214 extends class344 implements class670 {

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "S")
    private short field2596;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "Z")
    private boolean field2587;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "Z")
    private boolean field2593;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Z")
    private boolean field2582;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "B")
    private byte field2590;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "B")
    private byte field2577;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Z")
    private boolean field2571;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "Lw;")
    private class269 field2584;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Lba;")
    private class350 field2579;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "Lpr;")
    public static class407 field2583 = new class407(6, -1);

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "J")
    public static long field2603 = -1L;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "Lgr;")
    private class396 field2599;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Z")
    public final boolean method454(int arg0) {
        ++field2580;
        if (arg0 < 49) {
            this.field2579 = null;
        }
        return this.field2571;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Loa;I)Lok;")
    public final class231 method442(class635 arg0, int arg1) {
        ++field2572;
        if (this.field2579 == null) {
            return null;
        } else {
            class389 var3 = arg0.method297();
            var3.method228(super.field4478, super.field4476, super.field4472);
            class231 var4 = null;
            if (this.field2593) {
                var4 = class526.method2993(1, 32671);
            }
            this.field2579.method904(var3, var4 == null ? null : var4.field2947[0], arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Loa;I)V")
    public final void method456(class635 arg0, int arg1) {
        ++field2605;
        Object var3 = null;
        class269 var5;
        if (this.field2584 == null && this.field2571) {
            class671 var4 = this.method1275(-25819, true, arg0, 262144);
            var5 = var4 != null ? var4.field9533 : null;
        } else {
            var5 = this.field2584;
            this.field2584 = null;
        }
        if (var5 != null) {
            class461.method2625(var5, this.field2577, super.field4478, super.field4472, (boolean[]) null);
        }
        if (arg1 < 97) {
            this.field2577 = -26;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BB)V")
    public static final void method1274(byte arg0, byte arg1) {
        if (class242.field3146 == null) {
            class242.field3146 = new byte[4][class399.field5338][class349.field4567];
        }
        ++field2588;
        for (int var2 = 0; var2 < 4; ++var2) {
            for (int var3 = 0; class399.field5338 > var3; ++var3) {
                for (int var4 = 0; var4 < class349.field4567; ++var4) {
                    class242.field3146[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 > -5) {
            field2603 = -121L;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILoa;)Lgr;")
    public final class396 method450(int arg0, class635 arg1) {
        ++field2594;
        if (this.field2599 == null) {
            this.field2599 = class426.method2298(super.field4478, this.method1278(arg1, true, 0), 12409, super.field4472, super.field4476);
        }
        int var3 = -89 / ((arg0 - 47) / 34);
        return this.field2599;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZLoa;I)Lau;")
    private final class671 method1275(int arg0, boolean arg1, class635 arg2, int arg3) {
        ++field2581;
        class335 var5 = class195.field2339.method3729(65535 & this.field2596, (byte) 109);
        if (arg0 != -25819) {
            this.method456((class635) null, -89);
        }
        class137 var6;
        class137 var7;
        if (this.field2582) {
            var6 = class275.field3477[0];
            var7 = class591.field8415[this.field2577];
        } else {
            if (this.field2577 >= 3) {
                var6 = null;
            } else {
                var6 = class275.field3477[this.field2577 + 1];
            }
            var7 = class275.field3477[this.field2577];
        }
        return var5.method1882(arg2, var7, super.field4472, super.field4476, this.field2590, super.field4478, arg1, arg3, 22, (byte) -125, var6);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        if (this.field2579 != null) {
            this.field2579.method888();
        }
        ++field2586;
        if (arg0 != 29877) {
            this.field2587 = true;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)I")
    public final int method447(byte arg0) {
        if (arg0 != -91) {
            return 73;
        } else {
            ++field2578;
            return 22;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Z")
    public static final boolean method1276(int arg0, int arg1, int arg2) {
        ++field2574;
        return arg2 != -65537 ? false : false;
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
    public static void method1277(int arg0) {
        if (arg0 == 0) {
            field2583 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Loa;B)V")
    public final void method446(class635 arg0, byte arg1) {
        ++field2591;
        Object var3 = null;
        if (arg1 < -126) {
            class269 var5;
            if (this.field2584 == null && this.field2571) {
                class671 var4 = this.method1275(-25819, true, arg0, 262144);
                var5 = var4 == null ? null : var4.field9533;
            } else {
                var5 = this.field2584;
                this.field2584 = null;
            }
            if (var5 != null) {
                class533.method3038(var5, this.field2577, super.field4478, super.field4472, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILoa;)Lba;")
    public final class350 method455(int arg0, int arg1, class635 arg2) {
        if (arg1 > -20) {
            field2601 = 19;
        }
        ++field2597;
        return this.method1278(arg2, true, arg0);
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public final void method448(int arg0) {
        this.field2587 = false;
        ++field2576;
        if (this.field2579 != null) {
            this.field2579.method874(this.field2579.method902() & -65537);
        }
        int var2 = 9 % ((12 - arg0) / 56);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Loa;ZI)Lba;")
    private final class350 method1278(class635 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method453(true, 54, true, 111, -56, (class673) null, (class635) null);
        }
        ++field2585;
        if (this.field2579 != null && arg0.method312(this.field2579.method902(), arg2) == 0) {
            return this.field2579;
        } else {
            class671 var4 = this.method1275(-25819, false, arg0, arg2);
            return var4 == null ? null : var4.field9536;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)I")
    public static final int method1279(int arg0, byte arg1) {
        ++field2592;
        return arg1 < 122 ? -56 : arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method457(int arg0, int arg1, class635 arg2, int arg3) {
        ++field2602;
        if (arg1 != 1) {
            return true;
        } else {
            class350 var5 = this.method1278(arg2, true, 131072);
            if (var5 != null) {
                class389 var6 = arg2.method297();
                var6.method228(super.field4478, super.field4476, super.field4472);
                return var5.method910(arg3, arg0, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIZIILfl;Loa;)V")
    public final void method453(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class673 arg5, class635 arg6) {
        ++field2598;
        if (!arg2) {
            if (arg5 instanceof class214) {
                class214 var8 = (class214) arg5;
                if (this.field2579 != null && var8.field2579 != null) {
                    this.field2579.method885(var8.field2579, arg4, arg1, arg3, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(Loa;I)V")
    public final void method451(class635 arg0, int arg1) {
        if (arg1 != 31055) {
            this.method442((class635) null, -2);
        }
        ++field2606;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Loa;Lbfa;IIIIZIZ)V")
    public class214(class635 arg0, class335 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field4411, arg1.field4360, arg1.field4328);
        this.field2596 = (short) arg1.field4324;
        this.field2587 = arg8;
        this.field2593 = arg1.field4407 != 0 && !arg6;
        this.field2582 = arg6;
        this.field2590 = (byte) arg7;
        super.field4472 = arg5;
        this.field2577 = (byte) arg2;
        super.field4478 = arg3;
        this.field2571 = arg0.method316() && arg1.field4349 && !this.field2582 && ~class601.field8530.method1317((byte) -104, class150.field1711) != -1;
        int var10 = 2048;
        if (this.field2587) {
            var10 |= 65536;
        }
        class671 var11 = this.method1275(-25819, this.field2571, arg0, var10);
        if (var11 != null) {
            this.field2584 = var11.field9533;
            this.field2579 = var11.field9536;
            if (this.field2587) {
                this.field2579 = this.field2579.method602((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)I")
    public static final int method1280(byte arg0, int arg1) {
        if (arg0 > -100) {
            field2600 = 11;
        }
        ++field2595;
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I")
    public final int method444(byte arg0) {
        ++field2575;
        int var2 = -59 / ((7 - arg0) / 46);
        return this.field2596 & 65535;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)Z")
    public final boolean method449(byte arg0) {
        ++field2573;
        return arg0 != -126 ? false : this.field2587;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)I")
    public final int method443(byte arg0) {
        int var2 = 118 / ((arg0 - -82) / 37);
        ++field2589;
        return this.field2590;
    }
}
