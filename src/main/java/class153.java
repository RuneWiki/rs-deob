import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class153 extends class348 implements class147 {

    @OriginalMember(owner = "client!cfa", name = "Q", descriptor = "Z")
    private boolean field2302;

    @OriginalMember(owner = "client!cfa", name = "R", descriptor = "B")
    private byte field2303;

    @OriginalMember(owner = "client!cfa", name = "S", descriptor = "Z")
    private boolean field2304;

    @OriginalMember(owner = "client!cfa", name = "J", descriptor = "Z")
    private boolean field2295;

    @OriginalMember(owner = "client!cfa", name = "z", descriptor = "S")
    private short field2285;

    @OriginalMember(owner = "client!cfa", name = "H", descriptor = "B")
    private byte field2293;

    @OriginalMember(owner = "client!cfa", name = "M", descriptor = "Z")
    private boolean field2298;

    @OriginalMember(owner = "client!cfa", name = "u", descriptor = "Lw;")
    private class271 field2280;

    @OriginalMember(owner = "client!cfa", name = "x", descriptor = "Lba;")
    private class352 field2283;

    @OriginalMember(owner = "client!cfa", name = "L", descriptor = "I")
    public static int field2297 = 0;

    @OriginalMember(owner = "client!cfa", name = "t", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!cfa", name = "v", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!cfa", name = "w", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!cfa", name = "y", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!cfa", name = "A", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!cfa", name = "B", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!cfa", name = "C", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!cfa", name = "D", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!cfa", name = "E", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!cfa", name = "F", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!cfa", name = "G", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!cfa", name = "I", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!cfa", name = "K", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!cfa", name = "N", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!cfa", name = "O", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!cfa", name = "P", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!cfa", name = "T", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!cfa", name = "U", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!cfa", name = "V", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!cfa", name = "W", descriptor = "Lac;")
    private class496 field2308;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        ++field2296;
        class352 var5 = this.method1070(131072, arg2, 131072);
        if (var5 != null) {
            class391 var6 = arg2.method401();
            var6.method1288(super.field5015, super.field5010, super.field5009);
            return var5.method237(arg0, arg3, var6, false);
        } else {
            if (arg1 != -8003) {
                method1069(124, true);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILgfa;IIZLoa;)V")
    public final void method143(int arg0, int arg1, class687 arg2, int arg3, int arg4, boolean arg5, class638 arg6) {
        if (arg2 instanceof class153) {
            class153 var8 = (class153) arg2;
            if (this.field2283 != null && var8.field2283 != null) {
                this.field2283.method230(var8.field2283, arg1, arg4, arg0, arg5);
            }
        }
        ++field2279;
        int var9 = 6 / (-arg3 / 54);
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(I)V")
    public final void method550(int arg0) {
        if (arg0 > -4) {
            this.method555(43, (class638) null);
        }
        ++field2281;
        if (this.field2283 != null) {
            this.field2283.method228();
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZLoa;)V")
    public final void method552(boolean arg0, class638 arg1) {
        ++field2307;
        if (!arg0) {
            this.method549(8);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(Z[B)Z")
    public static final boolean method1067(boolean arg0, byte[] arg1) {
        ++field2301;
        class96 var2 = new class96(arg1);
        int var3 = var2.method718(117);
        if (var3 != 2) {
            return false;
        } else {
            boolean var4 = var2.method718(-90) == 1;
            if (var4) {
                class408.method2335(var2, 7016);
            }
            if (arg0) {
                field2297 = -99;
            }
            class683.method3768(var2, (byte) 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Loa;Llt;IIIIZIZ)V")
    public class153(class638 arg0, class620 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field8583, arg1.field8584, arg1.field8586);
        super.field5015 = arg3;
        this.field2302 = arg6;
        super.field5009 = arg5;
        this.field2303 = (byte) arg7;
        this.field2304 = ~arg1.field8592 != -1 && !arg6;
        this.field2295 = arg8;
        this.field2285 = (short) arg1.field8621;
        this.field2293 = (byte) arg2;
        this.field2298 = arg0.method423() && arg1.field8563 && !this.field2302 && class274.field3872.method543(class429.field6020, (byte) 20) != 0;
        int var10 = 2048;
        if (this.field2295) {
            var10 |= 65536;
        }
        class156 var11 = this.method1068(var10, this.field2298, arg0, 22);
        if (var11 != null) {
            this.field2280 = var11.field2358;
            this.field2283 = var11.field2355;
            if (this.field2295) {
                this.field2283 = this.field2283.method235((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "(I)I")
    public final int method549(int arg0) {
        ++field2305;
        if (arg0 != 12352) {
            this.field2280 = null;
        }
        return 22;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILoa;)Lba;")
    public final class352 method548(int arg0, int arg1, class638 arg2) {
        ++field2306;
        return arg0 != -585 ? null : this.method1070(131072, arg2, arg1);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IZLoa;I)Lcda;")
    private final class156 method1068(int arg0, boolean arg1, class638 arg2, int arg3) {
        ++field2286;
        class620 var5 = class164.field2499.method2013(this.field2285 & 65535, false);
        class136 var6;
        class136 var7;
        if (!this.field2302) {
            var6 = class31.field369[this.field2293];
            if (~this.field2293 <= -4) {
                var7 = null;
            } else {
                var7 = class31.field369[this.field2293 + 1];
            }
        } else {
            var6 = class581.field8114[this.field2293];
            var7 = class31.field369[0];
        }
        if (arg3 != 22) {
            this.method143(88, 68, (class687) null, 108, 26, false, (class638) null);
        }
        return var5.method3458(arg0, var7, super.field5010, 22, var6, super.field5009, arg1, arg3 ^ -99, super.field5015, this.field2303, arg2);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)I")
    public final int method554(int arg0) {
        ++field2300;
        if (arg0 != -18971) {
            this.method555(77, (class638) null);
        }
        return this.field2285 & 65535;
    }

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "(I)I")
    public final int method560(int arg0) {
        if (arg0 != 15654) {
            return 22;
        } else {
            ++field2287;
            return this.field2303;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IZ)Lrv;")
    public static final class95 method1069(int arg0, boolean arg1) {
        ++field2289;
        return !arg1 ? null : new class95(arg0, false);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Loa;B)Lac;")
    public final class496 method551(class638 arg0, byte arg1) {
        ++field2288;
        if (this.field2308 == null) {
            this.field2308 = class687.method3783(super.field5015, super.field5010, this.method1070(131072, arg0, 0), super.field5009, -104);
        }
        return arg1 > -62 ? null : this.field2308;
    }

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "(I)Z")
    public final boolean method140(int arg0) {
        ++field2284;
        if (arg0 != 0) {
            this.method142(false);
        }
        return this.field2295;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILoa;)Lwc;")
    public final class60 method555(int arg0, class638 arg1) {
        ++field2292;
        if (this.field2283 == null) {
            return null;
        } else {
            class391 var3 = arg1.method401();
            var3.method1288(super.field5015, super.field5010, super.field5009);
            class60 var4 = null;
            if (this.field2304) {
                var4 = class450.method2583(1, false);
            }
            this.field2283.method205(var3, var4 == null ? null : var4.field818[0], arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(BLoa;)V")
    public final void method561(byte arg0, class638 arg1) {
        ++field2282;
        Object var3 = null;
        class271 var5;
        if (this.field2280 == null && this.field2298) {
            class156 var4 = this.method1068(262144, true, arg1, 22);
            var5 = var4 == null ? null : var4.field2358;
        } else {
            var5 = this.field2280;
            this.field2280 = null;
        }
        if (var5 != null) {
            class293.method1837(var5, this.field2293, super.field5015, super.field5009, (boolean[]) null);
        }
        if (arg0 != 111) {
            this.field2308 = null;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V")
    public final void method142(boolean arg0) {
        ++field2294;
        this.field2295 = arg0;
        if (this.field2283 != null) {
            this.field2283.method216(-65537 & this.field2283.method189());
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILoa;I)Lba;")
    private final class352 method1070(int arg0, class638 arg1, int arg2) {
        ++field2290;
        if (arg0 != 131072) {
            this.method554(114);
        }
        if (this.field2283 != null && arg1.method431(this.field2283.method189(), arg2) == 0) {
            return this.field2283;
        } else {
            class156 var4 = this.method1068(arg2, false, arg1, 22);
            return var4 == null ? null : var4.field2355;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "(I)Z")
    public final boolean method562(int arg0) {
        ++field2291;
        return arg0 != 29008 ? false : this.field2298;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BLoa;)V")
    public final void method556(byte arg0, class638 arg1) {
        ++field2299;
        if (arg0 >= 5) {
            Object var3 = null;
            class271 var5;
            if (this.field2280 == null && this.field2298) {
                class156 var4 = this.method1068(262144, true, arg1, 22);
                var5 = var4 != null ? var4.field2358 : null;
            } else {
                var5 = this.field2280;
                this.field2280 = null;
            }
            if (var5 != null) {
                class192.method1283(var5, this.field2293, super.field5015, super.field5009, (boolean[]) null);
            }
        }
    }
}
