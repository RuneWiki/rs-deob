import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class263 extends class147 {

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field4297 = 0;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "Ln;")
    public static class282 field4299 = new class282(50);

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "Ln;")
    public static class282 field4308 = new class282(64);

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field4309 = -1;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public static int field4311 = 127;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public int field4298;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public int field4301;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public int field4302;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public int field4303;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public int field4305;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "Lna;")
    public class26 field4293;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "Lbe;")
    public class297 field4292;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "Lbe;")
    public class297 field4307;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "Z")
    public boolean field4304;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "[Ljava/lang/Object;")
    public Object[] field4306;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "[[[B")
    public static byte[][][] field4310;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILve;Lve;)V", line = 7)
    public static final void method1849(int arg0, class266 arg1, class266 arg2) {
        field4294++;
        class306.field5278 = arg1;
        class68.field1062 = arg2;
        class39.field655 = class68.field1062.method1898(arg0, (byte) 95);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 17)
    public static void method1850(boolean arg0) {
        field4299 = null;
        if (arg0) {
            method1852(97, (byte) -80);
        }
        field4310 = (byte[][][]) null;
        field4308 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIII)V", line = 30)
    public static final void method1851(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4295++;
        class114.field1789.field1301 = 0;
        class114.field1789.method591((byte) -119, 147);
        class114.field1789.method591((byte) -128, arg2);
        class114.field1789.method591((byte) -105, arg3);
        class114.field1789.method643(arg4 - 20038, arg0);
        class114.field1789.method643(-20037, arg1);
        class108.field1692 = 0;
        class300.field5174 = 0;
        class127.field1969 = arg4;
        class259.field4238 = -3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)Lkk;", line = 49)
    public static final class232 method1852(int arg0, byte arg1) {
        field4296++;
        class232 var2 = (class232) field4308.method1989((long) arg0, (byte) 121);
        if (var2 != null) {
            return var2;
        } else if (arg1 < 126) {
            return (class232) null;
        } else {
            byte[] var3 = class225.field3566.method1889(class141.method941(arg0, 5439488), (byte) -122, class58.method421(arg0, -127));
            class232 var4 = new class232();
            if (var3 != null) {
                var4.method1561(new class82(var3), -111);
            }
            field4308.method1978((byte) -84, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 77)
    public static final void method1853(int arg0) {
        field4300++;
        int var1 = class189.field2972 * 128 + 64;
        int var2 = class71.field1091 * 128 + 64;
        int var3 = class17.method118(class279.field4651, 1, var2, var1) - class126.field1954;
        if (class57.field929 >= 100) {
            class324.field5589 = class71.field1091 * 128 + 64;
            class14.field231 = class189.field2972 * 128 + 64;
            class178.field2793 = class17.method118(class279.field4651, arg0 - 1023, class324.field5589, class14.field231) - class126.field1954;
        } else {
            if (class324.field5589 < var2) {
                class324.field5589 += (var2 - class324.field5589) * class57.field929 / 1000 + class252.field4143;
                if (class324.field5589 > var2) {
                    class324.field5589 = var2;
                }
            }
            if (class178.field2793 < var3) {
                class178.field2793 += (var3 - class178.field2793) * class57.field929 / 1000 + class252.field4143;
                if (class178.field2793 > var3) {
                    class178.field2793 = var3;
                }
            }
            if (class324.field5589 > var2) {
                class324.field5589 -= (class324.field5589 - var2) * class57.field929 / 1000 + class252.field4143;
                if (class324.field5589 < var2) {
                    class324.field5589 = var2;
                }
            }
            if (class14.field231 < var1) {
                class14.field231 += (var1 - class14.field231) * class57.field929 / 1000 + class252.field4143;
                if (var1 < class14.field231) {
                    class14.field231 = var1;
                }
            }
            if (var3 < class178.field2793) {
                class178.field2793 -= (class178.field2793 - var3) * class57.field929 / 1000 + class252.field4143;
                if (var3 > class178.field2793) {
                    class178.field2793 = var3;
                }
            }
            if (class14.field231 > var1) {
                class14.field231 -= class252.field4143 + ((class14.field231 - var1) * class57.field929 / 1000);
                if (var1 > class14.field231) {
                    class14.field231 = var1;
                }
            }
        }
        int var4 = class107.field1682 * 128 + 64;
        int var5 = class305.field5256 * 128 + 64;
        int var6 = class17.method118(class279.field4651, 1, var5, var4) - class300.field5153;
        int var7 = var6 - class178.field2793;
        int var8 = var4 - class14.field231;
        int var9 = var5 - class324.field5589;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var8)) & 0x7FF;
        if (class312.field5335 < var11) {
            class312.field5335 += (var11 - class312.field5335) * class252.field4131 / 1000 + class222.field3517;
            if (class312.field5335 > var11) {
                class312.field5335 = var11;
            }
        }
        if (class312.field5335 > var11) {
            class312.field5335 -= (class312.field5335 - var11) * class252.field4131 / 1000 + class222.field3517;
            if (class312.field5335 < var11) {
                class312.field5335 = var11;
            }
        }
        int var13 = var12 - class230.field3660;
        if (var13 > arg0) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class230.field3660 += class252.field4131 * var13 / 1000 + class222.field3517;
            class230.field3660 &= 0x7FF;
        }
        if (var13 < 0) {
            class230.field3660 -= -var13 * class252.field4131 / 1000 + class222.field3517;
            class230.field3660 &= 0x7FF;
        }
        int var14 = var12 - class230.field3660;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class230.field3660 = var12;
        }
    }
}
