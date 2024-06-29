import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class423 extends class236 implements class56 {

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "B")
    private byte field6144;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "B")
    private byte field6166;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Z")
    private boolean field6151;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "Z")
    private boolean field6148;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "B")
    private byte field6160;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "S")
    private short field6157;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "Z")
    private boolean field6170;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Lqb;")
    private class257 field6142;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Lc;")
    private class308 field6143;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "Ljava/lang/String;")
    public static String field6161 = "wave2:";

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "Z")
    public static boolean field6169 = true;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "Leg;")
    public static class330 field6168;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Ldm;", line = 4)
    public static final class127 method2659(int arg0, int arg1, int arg2) {
        class77 var3 = class106.field1405[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class127 var4 = var3.field1078;
            var3.field1078 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ltj;Lir;I)V", line = 23)
    public static final void method2660(class298 arg0, class185 arg1, int arg2) {
        ++field6167;
        if (!class400.field5864) {
            if (arg2 != 32245) {
                field6169 = true;
            }
            arg0.method486(0);
            class295.field4450 = arg0.method463(class10.method80(arg1, class337.field4981), true);
            class295.field4450.method2070((class357.field5298 + -class295.field4450.method199()) / 2, (class435.field6313 - class295.field4450.method207()) / 2);
            class321.field4780 = arg0.method463(class10.method80(arg1, class72.field1023), true);
            class321.field4780.method2070((class357.field5298 + -class321.field4780.method199()) / 2, 18);
            class400.field5864 = true;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(ILtj;)V", line = 43)
    public final void method108(int arg0, class298 arg1) {
        ++field6153;
        Object var3 = null;
        if (arg0 > -8) {
            this.field6166 = -51;
        }
        class308 var5;
        if (this.field6143 == null && this.field6170) {
            class373 var4 = this.method2663(arg1, true, -3321, 131072);
            var5 = var4 == null ? null : var4.field5496;
        } else {
            var5 = this.field6143;
            this.field6143 = null;
        }
        if (var5 != null) {
            class215.method1412(var5, this.field6160, super.field3287, super.field3302, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)I", line = 77)
    public final int method1529(int arg0) {
        if (arg0 != 1) {
            return 24;
        } else {
            ++field6158;
            return this.field6142 != null ? this.field6142.method1688() : 0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ltj;II)Lqb;", line = 88)
    private final class257 method2661(class298 arg0, int arg1, int arg2) {
        if (arg1 != 65535) {
            return null;
        } else {
            ++field6149;
            if (this.field6142 != null && ~arg0.method465(this.field6142.method1690(), arg2) == -1) {
                return this.field6142;
            } else {
                class373 var4 = this.method2663(arg0, false, -3321, arg2);
                return var4 == null ? null : var4.field5505;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Z", line = 111)
    public final boolean method125(int arg0) {
        ++field6154;
        if (arg0 >= -112) {
            this.method1529(111);
        }
        return this.field6170;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)I", line = 122)
    public final int method122(byte arg0) {
        if (arg0 >= -103) {
            field6161 = null;
        }
        ++field6164;
        return this.field6166;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ltj;IB)Lqb;", line = 133)
    public final class257 method117(class298 arg0, int arg1, byte arg2) {
        if (arg2 < 42) {
            this.method2661((class298) null, 33, 123);
        }
        ++field6162;
        return this.method2661(arg0, 65535, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)V", line = 146)
    public static void method2662(int arg0) {
        field6161 = null;
        field6168 = null;
        if (arg0 != 65536) {
            field6168 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ltj;Lqr;IIIIZIIIII)V", line = 159)
    public class423(class298 arg0, class212 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class127.method901(arg11, arg10, false));
        this.field6144 = (byte) arg11;
        this.field6166 = (byte) arg10;
        super.field3302 = (short) arg5;
        this.field6151 = arg1.field2932 != 0;
        super.field3287 = (short) arg3;
        this.field6148 = arg6;
        this.field6160 = (byte) arg2;
        this.field6157 = (short) arg1.field2942;
        this.field6170 = arg0.method434() && arg1.field2927 && !this.field6148 && ~class330.field4863 != -1;
        class373 var13 = this.method2663(arg0, this.field6170, -3321, 1024);
        if (var13 != null) {
            this.field6142 = var13.field5505;
            this.field6143 = var13.field5496;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILtj;)V", line = 186)
    public final void method111(int arg0, class298 arg1) {
        ++field6152;
        Object var3 = null;
        class308 var5;
        if (this.field6143 == null && this.field6170) {
            class373 var4 = this.method2663(arg1, true, -3321, 131072);
            var5 = var4 == null ? null : var4.field5496;
        } else {
            var5 = this.field6143;
            this.field6143 = null;
        }
        if (arg0 < -68) {
            if (var5 != null) {
                class108.method818(var5, this.field6160, super.field3287, super.field3302, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ltj;I)Lri;", line = 217)
    public final class372 method118(class298 arg0, int arg1) {
        ++field6147;
        if (this.field6142 == null) {
            return null;
        } else {
            if (arg1 != 18630) {
                method2659(-104, 38, 50);
            }
            class118 var3 = arg0.method519();
            var3.method274(super.field3287 - -super.field3300, super.field3293, super.field3302 + super.field3298);
            class372 var4 = null;
            if (this.field6151) {
                var4 = class384.method2492(1, (byte) 79);
            }
            this.field6142.method1661(var3, var4 != null ? var4.field5481[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I", line = 245)
    public final int method121(int arg0) {
        ++field6145;
        return arg0 != 28024 ? -109 : this.field6144;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 257)
    public final void method124(int arg0) {
        if (arg0 <= 26) {
            this.method2661((class298) null, 58, -100);
        }
        ++field6156;
        if (this.field6142 != null) {
            this.field6142.method1686();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLtj;)V", line = 271)
    public final void method126(byte arg0, class298 arg1) {
        if (arg0 != 50) {
            this.method120(124, (class298) null, 42, 79);
        }
        ++field6159;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ltj;ZII)Ljl;", line = 281)
    private final class373 method2663(class298 arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 != -3321) {
            this.method1529(126);
        }
        ++field6163;
        class212 var5 = class372.method2447(65535 & this.field6157, (byte) 7);
        class193 var6;
        class193 var7;
        if (this.field6148) {
            var6 = class370.field5469[this.field6160];
            var7 = class142.field1804[0];
        } else {
            if (this.field6160 < 3) {
                var7 = class142.field1804[this.field6160 + 1];
            } else {
                var7 = null;
            }
            var6 = class142.field1804[this.field6160];
        }
        return var5.method1406(super.field3302, arg1, this.field6144, (byte) 102, arg3, this.field6166, super.field3293, var7, arg0, var6, super.field3287);
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)I", line = 311)
    public final int method116(int arg0) {
        ++field6150;
        return arg0 != 24186 ? 75 : this.field6157 & 65535;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILtj;II)Z", line = 322)
    public final boolean method120(int arg0, class298 arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return true;
        } else {
            ++field6155;
            class257 var5 = this.method2661(arg1, 65535, 65536);
            if (var5 != null) {
                class118 var6 = arg1.method519();
                var6.method274(super.field3287, super.field3293, super.field3302);
                return var5.method1698(arg2, arg0, var6, false);
            } else {
                return false;
            }
        }
    }
}
