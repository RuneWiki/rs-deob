import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class185 extends class237 implements class106 {

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "B")
    private byte field2735;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "S")
    private short field2742;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "B")
    private byte field2737;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "Z")
    private boolean field2726;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "Z")
    private boolean field2730;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Z")
    private boolean field2725;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "B")
    private byte field2727;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Z")
    private boolean field2721;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Lf;")
    public class491 field2723;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "Ltm;")
    private class242 field2749;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "Lef;")
    public static class311 field2743 = new class311(10, 15);

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field2746 = -1;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "Z")
    public static boolean field2744 = false;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "F")
    public static float field2747;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "[I")
    public static int[] field2745;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Z")
    public final boolean method116(byte arg0) {
        if (arg0 >= -40) {
            this.method115((class313) null, (byte) -70, -22);
        }
        ++field2722;
        return this.field2721;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lnp;Ldq;IIIIZIIZ)V")
    public class185(class313 arg0, class453 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class222.method1427((byte) -126, arg8, arg7));
        this.field2735 = (byte) arg2;
        this.field2742 = (short) arg1.field6343;
        super.field3563 = (short) arg5;
        this.field2737 = (byte) arg7;
        this.field2726 = ~arg1.field6366 != -1 && !arg6;
        this.field2730 = arg9;
        this.field2725 = arg6;
        super.field3556 = (short) arg3;
        this.field2727 = (byte) arg8;
        this.field2721 = arg0.method639() && arg1.field6380 && !this.field2725 && class314.field4438.field5776 != 0;
        int var11 = 1024;
        if (this.field2730) {
            var11 |= 32768;
        }
        class284 var12 = this.method1147(this.field2721, -25930, arg0, var11);
        if (var12 != null) {
            this.field2723 = var12.field4158;
            this.field2749 = var12.field4154;
            if (this.field2730) {
                this.field2723 = this.field2723.method1292((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
    public final int method106(int arg0) {
        ++field2720;
        if (arg0 != 12181) {
            this.method113(21, -6, -80, (class313) null);
        }
        return this.field2742 & 65535;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V")
    public static void method1146(boolean arg0) {
        if (arg0) {
            field2745 = null;
            field2743 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        if (arg1 >= -95) {
            field2745 = null;
        }
        ++field2724;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)I")
    public final int method104(int arg0) {
        if (arg0 != 31249) {
            field2745 = null;
        }
        ++field2731;
        return this.field2727;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (arg0 < 56) {
            this.field2742 = -47;
        }
        if (this.field2723 != null) {
            this.field2723.method1313();
        }
        ++field2719;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILnp;I)Lpr;")
    private final class284 method1147(boolean arg0, int arg1, class313 arg2, int arg3) {
        ++field2740;
        if (arg1 != -25930) {
            return null;
        } else {
            class453 var5 = class156.field2325.method808(this.field2742 & 65535, 0);
            class426 var6;
            class426 var7;
            if (!this.field2725) {
                if (~this.field2735 > -4) {
                    var6 = class178.field2556[this.field2735 + 1];
                } else {
                    var6 = null;
                }
                var7 = class178.field2556[this.field2735];
            } else {
                var6 = class178.field2556[0];
                var7 = class28.field388[this.field2735];
            }
            return var5.method2667(super.field3563, arg3, -4, arg0, super.field3567, this.field2727, arg2, super.field3556, var6, var7, this.field2737);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lnp;I)V")
    public final void method114(class313 arg0, int arg1) {
        ++field2728;
        Object var3 = null;
        if (arg1 != -26920) {
            this.method109(22, (class313) null);
        }
        class242 var5;
        if (this.field2749 == null && this.field2721) {
            class284 var4 = this.method1147(true, -25930, arg0, 131072);
            var5 = var4 != null ? var4.field4154 : null;
        } else {
            var5 = this.field2749;
            this.field2749 = null;
        }
        if (var5 != null) {
            class333.method2103(var5, this.field2735, super.field3556, super.field3563, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        ++field2732;
        if (this.field2723 == null) {
            return null;
        } else {
            class282 var3 = arg1.method601();
            var3.method1019(super.field3556, super.field3567, super.field3563);
            class477 var4 = null;
            if (this.field2726) {
                var4 = class96.method543(1, (byte) 71);
            }
            this.field2723.method1323(var3, var4 == null ? null : var4.field6696[0], arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        ++field2733;
        class491 var5 = this.method1148(arg3, 65536, (byte) -73);
        if (var5 != null) {
            class282 var6 = arg3.method601();
            var6.method1019(super.field3556, super.field3567, super.field3563);
            return var5.method1339(arg0, arg2, var6, false);
        } else {
            if (arg1 < 16) {
                this.method106(104);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILnp;)V")
    public final void method109(int arg0, class313 arg1) {
        if (arg0 < -126) {
            ++field2738;
            Object var3 = null;
            class242 var5;
            if (this.field2749 == null && this.field2721) {
                class284 var4 = this.method1147(true, -25930, arg1, 131072);
                var5 = var4 == null ? null : var4.field4154;
            } else {
                var5 = this.field2749;
                this.field2749 = null;
            }
            if (var5 != null) {
                class94.method531(var5, this.field2735, super.field3556, super.field3563, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lnp;BI)Lf;")
    public final class491 method115(class313 arg0, byte arg1, int arg2) {
        if (arg1 < 70) {
            return null;
        } else {
            ++field2734;
            return this.method1148(arg0, arg2, (byte) -73);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lnp;IB)Lf;")
    private final class491 method1148(class313 arg0, int arg1, byte arg2) {
        ++field2739;
        if (this.field2723 != null && arg0.method653(this.field2723.method1319(), arg1) == 0) {
            return this.field2723;
        } else {
            if (arg2 != -73) {
                this.method1148((class313) null, 75, (byte) 76);
            }
            class284 var4 = this.method1147(false, -25930, arg0, arg1);
            return var4 == null ? null : var4.field4158;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)I")
    public final int method119(byte arg0) {
        if (arg0 <= 13) {
            this.method106(117);
        }
        ++field2741;
        return this.field2737;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        ++field2736;
        return arg0 > -105 ? false : this.field2730;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
    public final void method246(int arg0) {
        if (arg0 == -1) {
            this.field2730 = false;
            ++field2748;
            if (this.field2723 != null) {
                this.field2723.method1344(this.field2723.method1319() & -32769);
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public final void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6) {
        ++field2729;
        if (!(arg1 instanceof class185)) {
            if (arg1 instanceof class367) {
                class367 var8 = (class367) arg1;
                if (this.field2723 != null && var8.field5281 != null) {
                    this.field2723.method1341(var8.field5281, arg6, arg2, arg0, arg5);
                }
            }
        } else {
            class185 var9 = (class185) arg1;
            if (this.field2723 != null && var9.field2723 != null) {
                this.field2723.method1341(var9.field2723, arg6, arg2, arg0, arg5);
            }
        }
        int var10 = -73 / ((arg4 - 20) / 38);
    }
}
