import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class368 extends class405 implements class106 {

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "S")
    private short field5295;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "Z")
    private boolean field5314;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "Z")
    private boolean field5310;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "B")
    private byte field5312;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "B")
    private byte field5309;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "Z")
    private boolean field5298;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "Z")
    private boolean field5319;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "Lf;")
    private class491 field5306;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "Ltm;")
    private class242 field5305;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "Lsh;")
    public static class48 field5315 = new class48("WIP", 2);

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field5318 = 0;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "Lku;")
    public static class232 field5316 = new class232(5);

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "[I")
    public static int[] field5326 = new int[4096];

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "Lus;")
    public static class1 field5323 = new class1(69, 0);

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "[I")
    public static int[] field5294;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lnp;BI)Lf;")
    public final class491 method115(class313 arg0, byte arg1, int arg2) {
        ++field5303;
        return arg1 <= 70 ? null : this.method2264(arg2, (byte) 20, arg0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBLnp;)Lf;")
    private final class491 method2264(int arg0, byte arg1, class313 arg2) {
        ++field5321;
        if (arg1 != 20) {
            return null;
        } else if (this.field5306 != null && arg2.method653(this.field5306.method1319(), arg0) == 0) {
            return this.field5306;
        } else {
            class284 var4 = this.method2267(false, arg2, 93, arg0);
            return var4 != null ? var4.field4158 : null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public final void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6) {
        ++field5302;
        if (arg1 instanceof class368) {
            class368 var8 = (class368) arg1;
            if (this.field5306 != null && var8.field5306 != null) {
                this.field5306.method1341(var8.field5306, arg6, arg2, arg0, arg5);
            }
        }
        int var9 = -21 / ((20 - arg4) / 38);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)I")
    public final int method104(int arg0) {
        ++field5313;
        return arg0 != 31249 ? -81 : this.field5309;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lnp;Ldq;IIIIZIZ)V")
    public class368(class313 arg0, class453 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field6364, arg1.field6321);
        this.field5295 = (short) arg1.field6343;
        this.field5314 = arg6;
        this.field5310 = arg8;
        this.field5312 = (byte) arg2;
        this.field5309 = (byte) arg7;
        this.field5298 = arg1.field6366 != 0 && !arg6;
        super.field5705 = (short) arg3;
        super.field5704 = (short) arg5;
        this.field5319 = arg0.method639() && arg1.field6380 && !this.field5314 && class314.field4438.field5776 != 0;
        int var10 = 1024;
        if (this.field5310) {
            var10 |= 32768;
        }
        class284 var11 = this.method2267(this.field5319, arg0, 109, var10);
        if (var11 != null) {
            this.field5306 = var11.field4158;
            this.field5305 = var11.field4154;
            if (this.field5310) {
                this.field5306 = this.field5306.method1292((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        if (arg1 <= 16) {
            field5322 = -95;
        }
        ++field5308;
        class491 var5 = this.method2264(65536, (byte) 20, arg3);
        if (var5 != null) {
            class282 var6 = arg3.method601();
            var6.method1019(super.field5705, super.field5703, super.field5704);
            return var5.method1339(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        ++field5296;
        if (this.field5306 == null) {
            return null;
        } else {
            class282 var3 = arg1.method601();
            var3.method1019(super.field5705, super.field5703, super.field5704);
            class477 var4 = null;
            if (this.field5298) {
                var4 = class96.method543(1, (byte) 71);
            }
            this.field5306.method1323(var3, var4 == null ? null : var4.field6696[0], arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)V")
    public static void method2265(int arg0) {
        if (arg0 != -5265) {
            method2266(-118, (class276) null);
        }
        field5326 = null;
        field5294 = null;
        field5323 = null;
        field5316 = null;
        field5315 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILrp;)Lmo;")
    public static final class488 method2266(int arg0, class276 arg1) {
        ++field5311;
        return arg0 != 0 ? null : new class488(arg1.method1702(-84), arg1.method1702(-35), arg1.method1702(arg0 + -98), arg1.method1702(-100), arg1.method1702(-116), arg1.method1702(arg0 ^ -85), arg1.method1702(-61), arg1.method1702(-120), arg1.method1748(false), arg1.method1701(-23121));
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILnp;)V")
    public final void method109(int arg0, class313 arg1) {
        ++field5297;
        Object var3 = null;
        if (arg0 < -126) {
            class242 var5;
            if (this.field5305 == null && this.field5319) {
                class284 var4 = this.method2267(true, arg1, 90, 131072);
                var5 = var4 == null ? null : var4.field4154;
            } else {
                var5 = this.field5305;
                this.field5305 = null;
            }
            if (var5 != null) {
                class94.method531(var5, this.field5312, super.field5705, super.field5704, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        if (arg0 > -105) {
            return false;
        } else {
            ++field5301;
            return this.field5310;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (this.field5306 != null) {
            this.field5306.method1313();
        }
        if (arg0 < 56) {
            this.method2264(54, (byte) 101, (class313) null);
        }
        ++field5300;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)Z")
    public final boolean method116(byte arg0) {
        ++field5320;
        return arg0 >= -40 ? true : this.field5319;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lnp;I)V")
    public final void method114(class313 arg0, int arg1) {
        ++field5307;
        if (arg1 != -26920) {
            this.method115((class313) null, (byte) -9, 15);
        }
        Object var3 = null;
        class242 var5;
        if (this.field5305 == null && this.field5319) {
            class284 var4 = this.method2267(true, arg0, arg1 ^ -26983, 131072);
            var5 = var4 == null ? null : var4.field4154;
        } else {
            var5 = this.field5305;
            this.field5305 = null;
        }
        if (var5 != null) {
            class333.method2103(var5, this.field5312, super.field5705, super.field5704, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLnp;II)Lpr;")
    private final class284 method2267(boolean arg0, class313 arg1, int arg2, int arg3) {
        ++field5324;
        if (arg2 <= 54) {
            field5315 = null;
        }
        class453 var5 = class156.field2325.method808(this.field5295 & 65535, 0);
        class426 var6;
        class426 var7;
        if (this.field5314) {
            var6 = class28.field388[this.field5312];
            var7 = class178.field2556[0];
        } else {
            var6 = class178.field2556[this.field5312];
            if (this.field5312 >= 3) {
                var7 = null;
            } else {
                var7 = class178.field2556[this.field5312 - -1];
            }
        }
        return var5.method2667(super.field5704, arg3, -4, arg0, super.field5703, this.field5309, arg1, super.field5705, var7, var6, 22);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)I")
    public final int method119(byte arg0) {
        if (arg0 < 13) {
            field5294 = null;
        }
        ++field5304;
        return 22;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        ++field5293;
        if (arg1 >= -95) {
            field5326 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)I")
    public final int method106(int arg0) {
        if (arg0 != 12181) {
            this.method247(41, (class54) null, -22, (class313) null, (byte) -125, true, 90);
        }
        ++field5317;
        return 65535 & this.field5295;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method2268(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field5325;
        if (~arg0 == ~arg7) {
            class287.method1796(arg6, arg3, arg4, arg2, arg5, arg7, 124);
        } else {
            if (class168.field2449 <= -arg7 + arg2 && ~(arg2 + arg7) >= ~class94.field1209 && ~class345.field5011 >= ~(-arg0 + arg4) && ~(arg0 + arg4) >= ~class485.field6827) {
                class61.method379(arg3, arg0, false, arg7, arg4, arg5, arg2, arg6);
            } else {
                class265.method1632(arg4, (byte) -34, arg3, arg6, arg7, arg5, arg2, arg0);
            }
            if (!arg1) {
                method2266(-53, (class276) null);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
    public final void method246(int arg0) {
        if (arg0 != -1) {
            this.method119((byte) 121);
        }
        this.field5310 = false;
        ++field5299;
        if (this.field5306 != null) {
            this.field5306.method1344(-32769 & this.field5306.method1319());
        }
    }
}
