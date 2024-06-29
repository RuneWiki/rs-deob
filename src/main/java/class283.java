import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class283 extends class303 {

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public int field4299 = -1;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public int field4311 = -1;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "J")
    public static long field4306 = -1L;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "S")
    public static short field4305 = 1;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public int field4303;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public int field4304;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public int field4308;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public int field4309;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "Lrj;")
    public static class424 field4310;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "[[Luq;")
    public static class114[][] field4301;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIZIII)V")
    public static final void method1837(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field4312;
        if (arg3) {
            method1839((class16) null, -2, -26, -23, -63, (class114) null, (class10) null, -110);
        }
        if (arg6 >= class327.field4931 && ~class184.field2777 <= ~arg5 && ~arg0 <= ~class404.field5987 && arg2 <= class433.field6414) {
            if (~arg1 != -2) {
                class191.method1340(arg4, arg0, (byte) -125, arg5, arg6, arg2, arg1);
            } else {
                class122.method907(1028505761, arg0, arg5, arg6, arg4, arg2);
            }
        } else if (arg1 != 1) {
            class501.method2974(-18428, arg6, arg1, arg0, arg2, arg5, arg4);
        } else {
            class396.method2497(arg4, arg0, 114, arg2, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLya;II)Z")
    public final boolean method27(byte arg0, class38 arg1, int arg2, int arg3) {
        ++field4313;
        class125 var5 = arg1.method296();
        var5.method206(super.field4583, super.field4584, super.field4578);
        class475 var6 = class390.field5847.method467((byte) -101, this.field4304).method3154(0, (byte) -48, -1, this.field4309, (class500) null, 0, (class189) null, 131072, arg1);
        if (var6 != null && var6.method440(arg3, arg2, var5, true)) {
            return true;
        } else {
            if (arg0 > -119) {
                this.field4311 = 123;
            }
            if (~this.field4311 != 0) {
                class475 var7 = class390.field5847.method467((byte) -101, this.field4311).method3154(0, (byte) -75, -1, this.field4303, (class500) null, 0, (class189) null, 131072, arg1);
                if (var7 != null && var7.method440(arg3, arg2, var5, true)) {
                    return true;
                }
            }
            if (~this.field4299 != 0) {
                class475 var8 = class390.field5847.method467((byte) -101, this.field4299).method3154(0, (byte) -61, -1, this.field4308, (class500) null, 0, (class189) null, 131072, arg1);
                if (var8 != null && var8.method440(arg3, arg2, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lya;I)Lag;")
    public final class484 method29(class38 arg0, int arg1) {
        ++field4302;
        class125 var3 = arg0.method296();
        var3.method206(super.field4583, super.field4584, super.field4578);
        class484 var4 = class133.method971(3, 0);
        if (this.field4299 != -1) {
            class475 var5 = class390.field5847.method467((byte) -101, this.field4299).method3154(0, (byte) -95, -1, this.field4308, (class500) null, 0, (class189) null, 2048, arg0);
            if (var5 != null) {
                var5.method439(var3, var4.field6964[2], 0);
            }
        }
        if (this.field4311 != -1) {
            class475 var6 = class390.field5847.method467((byte) -101, this.field4311).method3154(0, (byte) -108, -1, this.field4303, (class500) null, 0, (class189) null, 2048, arg0);
            if (var6 != null) {
                var6.method439(var3, var4.field6964[1], 0);
            }
        }
        class475 var7 = class390.field5847.method467((byte) -101, this.field4304).method3154(0, (byte) -122, -1, this.field4309, (class500) null, 0, (class189) null, 2048, arg0);
        if (var7 != null) {
            var7.method439(var3, var4.field6964[0], 0);
        }
        return arg1 < 22 ? null : var4;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method1838(int arg0) {
        field4301 = null;
        if (arg0 != -17341) {
            method1838(42);
        }
        field4310 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lya;Z)V")
    public final void method25(class38 arg0, boolean arg1) {
        ++field4307;
        if (arg1) {
            this.method27((byte) 50, (class38) null, -37, 27);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ll;IIIILuq;Lma;I)V")
    public static final void method1839(class16 arg0, int arg1, int arg2, int arg3, int arg4, class114 arg5, class10 arg6, int arg7) {
        ++field4300;
        if (arg0 != null) {
            int var8;
            if (class176.field2611 != 4) {
                var8 = 16383 & (int) class473.field6830 - -class162.field2414;
            } else {
                var8 = (int) class473.field6830 & 16383;
            }
            int var9 = Math.max(arg5.field1642 / 2, arg5.field1627 / 2) - -10;
            int var10 = arg4 * arg4 - -(arg3 * arg3);
            if (var10 <= var9 * var9) {
                int var11 = class281.field4278[var8];
                int var12 = class281.field4279[var8];
                if (class176.field2611 != 4) {
                    var12 = var12 * 256 / (class4.field23 + 256);
                    var11 = var11 * 256 / (class4.field23 + 256);
                }
                int var13 = arg3 * var11 + arg4 * var12 >> 15;
                int var14 = arg3 * var12 + -(arg4 * var11) >> 15;
                if (arg7 <= -18) {
                    arg0.method127(arg1 - (-(arg5.field1642 / 2) - (var13 - arg0.method129() / 2)), -var14 + arg2 - (-(arg5.field1627 / 2) - -(arg0.method139() / 2)), arg6, arg1, arg2);
                }
            }
        }
    }
}
