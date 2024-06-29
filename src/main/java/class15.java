import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class15 extends class441 implements class56 {

    @OriginalMember(owner = "client!gn", name = "W", descriptor = "Z")
    private boolean field261;

    @OriginalMember(owner = "client!gn", name = "J", descriptor = "S")
    private short field248;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "Z")
    private boolean field241;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "B")
    private byte field245;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "Z")
    private boolean field244;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "B")
    private byte field233;

    @OriginalMember(owner = "client!gn", name = "Q", descriptor = "Z")
    private boolean field255;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "Lc;")
    private class308 field240;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "Lqb;")
    private class257 field238;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "[I")
    public static int[] field232 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "Ljava/lang/String;")
    public static String field239 = "Loaded fonts";

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!gn", name = "H", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!gn", name = "I", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!gn", name = "M", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!gn", name = "N", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!gn", name = "O", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!gn", name = "R", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!gn", name = "S", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!gn", name = "T", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!gn", name = "U", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!gn", name = "V", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!gn", name = "X", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)Z", line = 8)
    public final boolean method107(byte arg0) {
        if (arg0 < 119) {
            this.method107((byte) 70);
        }
        ++field257;
        return this.field241;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(ILtj;)V", line = 19)
    public final void method108(int arg0, class298 arg1) {
        ++field249;
        Object var3 = null;
        if (arg0 <= -8) {
            class308 var5;
            if (this.field240 == null && this.field255) {
                class373 var4 = this.method113(131072, true, -4, arg1);
                var5 = var4 == null ? null : var4.field5496;
            } else {
                var5 = this.field240;
                this.field240 = null;
            }
            if (var5 != null) {
                class215.method1412(var5, this.field245, super.field6386, super.field6395, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)V", line = 46)
    public static final void method109(boolean arg0, int arg1) {
        ++field259;
        if (arg0 == !class384.field5625) {
            class384.field5625 = arg0;
            if (arg1 == 1) {
                class320.method2107(false);
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)V", line = 65)
    public static void method110(int arg0) {
        field232 = null;
        field239 = null;
        if (arg0 <= 110) {
            field250 = 120;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILtj;)V", line = 76)
    public final void method111(int arg0, class298 arg1) {
        ++field231;
        Object var3 = null;
        class308 var5;
        if (this.field240 == null && this.field255) {
            class373 var4 = this.method113(131072, true, -4, arg1);
            var5 = var4 != null ? var4.field5496 : null;
        } else {
            var5 = this.field240;
            this.field240 = null;
        }
        if (arg0 > -68) {
            this.field244 = true;
        }
        if (var5 != null) {
            class108.method818(var5, this.field245, super.field6386, super.field6395, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILtj;BIZLkm;I)V", line = 103)
    public final void method112(int arg0, class298 arg1, byte arg2, int arg3, boolean arg4, class402 arg5, int arg6) {
        if (arg5 instanceof class15) {
            class15 var8 = (class15) arg5;
            if (this.field238 != null && var8.field238 != null) {
                this.field238.method1668(var8.field238, arg6, arg3, arg0, arg4);
            }
        }
        ++field256;
        int var9 = 30 % ((arg2 - 46) / 45);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZILtj;)Ljl;", line = 122)
    private final class373 method113(int arg0, boolean arg1, int arg2, class298 arg3) {
        ++field246;
        if (arg2 != -4) {
            this.method112(-10, (class298) null, (byte) 67, -101, true, (class402) null, 29);
        }
        class212 var5 = class372.method2447(65535 & this.field248, (byte) 42);
        class193 var6;
        class193 var7;
        if (this.field244) {
            var6 = class370.field5469[this.field245];
            var7 = class142.field1804[0];
        } else {
            var6 = class142.field1804[this.field245];
            if (~this.field245 > -4) {
                var7 = class142.field1804[this.field245 + 1];
            } else {
                var7 = null;
            }
        }
        return var5.method1406(super.field6395, arg1, this.field233, (byte) -91, arg0, 22, super.field6393, var7, arg3, var6, super.field6386);
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)V", line = 152)
    public final void method114(int arg0) {
        if (arg0 != 2) {
            this.field261 = false;
        }
        ++field260;
        this.field241 = false;
        if (this.field238 != null) {
            this.field238.method1662(this.field238.method1690() & -32769);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IB)Lpc;", line = 167)
    public static final class149 method115(int arg0, byte arg1) {
        ++field236;
        class149 var2 = (class149) class199.field2752.method378((byte) 28, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class139.field1794.method1235(1, false, arg0);
            class149 var4 = new class149();
            if (var3 != null) {
                var4.method1024(new class341(var3), 125, arg0);
            }
            class199.field2752.method367((long) arg0, var4, true);
            return arg1 != -98 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)I", line = 192)
    public final int method116(int arg0) {
        if (arg0 != 24186) {
            method110(-16);
        }
        ++field235;
        return this.field248 & 65535;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Ltj;Lqr;IIIIZIZ)V", line = 205)
    public class15(class298 arg0, class212 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field2895, arg1.field2909);
        this.field261 = ~arg1.field2932 != -1;
        super.field6395 = (short) arg5;
        super.field6386 = (short) arg3;
        this.field248 = (short) arg1.field2942;
        this.field241 = arg8;
        this.field245 = (byte) arg2;
        this.field244 = arg6;
        this.field233 = (byte) arg7;
        this.field255 = arg0.method434() && arg1.field2927 && !this.field244 && ~class330.field4863 != -1;
        int var10 = 1024;
        if (this.field241) {
            var10 |= 32768;
        }
        class373 var11 = this.method113(var10, this.field255, -4, arg0);
        if (var11 != null) {
            this.field240 = var11.field5496;
            this.field238 = var11.field5505;
            if (this.field241) {
                this.field238 = this.field238.method1676((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ltj;IB)Lqb;", line = 239)
    public final class257 method117(class298 arg0, int arg1, byte arg2) {
        if (arg2 <= 42) {
            return null;
        } else {
            ++field254;
            return this.method123((byte) -34, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ltj;I)Lri;", line = 251)
    public final class372 method118(class298 arg0, int arg1) {
        ++field242;
        if (this.field238 == null) {
            return null;
        } else {
            class118 var3 = arg0.method519();
            var3.method274(super.field6386, super.field6393, super.field6395);
            class372 var4 = null;
            if (arg1 != 18630) {
                method110(-16);
            }
            if (this.field261) {
                var4 = class384.method2492(1, (byte) 90);
            }
            this.field238.method1661(var3, var4 == null ? null : var4.field5481[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 278)
    public static final boolean method119(int arg0, String arg1) {
        ++field258;
        if (arg0 <= 5) {
            method115(46, (byte) 88);
        }
        return class226.method1472((byte) -107, arg1, 10, true);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILtj;II)Z", line = 295)
    public final boolean method120(int arg0, class298 arg1, int arg2, int arg3) {
        ++field237;
        class257 var5 = this.method123((byte) -34, arg1, 65536);
        if (arg3 != 0) {
            this.method122((byte) 55);
        }
        if (var5 != null) {
            class118 var6 = arg1.method519();
            var6.method274(super.field6386, super.field6393, super.field6395);
            return var5.method1698(arg2, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)I", line = 317)
    public final int method121(int arg0) {
        if (arg0 != 28024) {
            return 57;
        } else {
            ++field262;
            return this.field233;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)I", line = 329)
    public final int method122(byte arg0) {
        if (arg0 >= -103) {
            this.field238 = null;
        }
        ++field251;
        return 22;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLtj;I)Lqb;", line = 343)
    private final class257 method123(byte arg0, class298 arg1, int arg2) {
        ++field243;
        if (this.field238 != null && ~arg1.method465(this.field238.method1690(), arg2) == -1) {
            return this.field238;
        } else if (arg0 != -34) {
            return null;
        } else {
            class373 var4 = this.method113(arg2, false, arg0 ^ 34, arg1);
            return var4 == null ? null : var4.field5505;
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V", line = 376)
    public final void method124(int arg0) {
        if (this.field238 != null) {
            this.field238.method1686();
        }
        ++field247;
        if (arg0 < 26) {
            this.field245 = -63;
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)Z", line = 390)
    public final boolean method125(int arg0) {
        ++field253;
        return arg0 >= -112 ? true : this.field255;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLtj;)V", line = 402)
    public final void method126(byte arg0, class298 arg1) {
        ++field252;
        if (arg0 != 50) {
            this.method126((byte) 67, (class298) null);
        }
    }
}
