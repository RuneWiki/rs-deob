import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class413 extends class210 implements class113 {

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "B")
    private byte field6108;

    @OriginalMember(owner = "client!iq", name = "Y", descriptor = "Z")
    private boolean field6127;

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "B")
    private byte field6115;

    @OriginalMember(owner = "client!iq", name = "bb", descriptor = "S")
    private short field6130;

    @OriginalMember(owner = "client!iq", name = "R", descriptor = "Z")
    private boolean field6120;

    @OriginalMember(owner = "client!iq", name = "U", descriptor = "Z")
    private boolean field6123;

    @OriginalMember(owner = "client!iq", name = "T", descriptor = "B")
    private byte field6122;

    @OriginalMember(owner = "client!iq", name = "Q", descriptor = "Z")
    private boolean field6119;

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "Lva;")
    public class327 field6107;

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "Lss;")
    private class283 field6117;

    @OriginalMember(owner = "client!iq", name = "K", descriptor = "I")
    public static int field6113 = 0;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "Ldc;")
    public static class5 field6116 = new class5(8);

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!iq", name = "L", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!iq", name = "P", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!iq", name = "S", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!iq", name = "V", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!iq", name = "W", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!iq", name = "X", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!iq", name = "Z", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!iq", name = "ab", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!iq", name = "cb", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!iq", name = "eb", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!iq", name = "fb", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!iq", name = "gb", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!iq", name = "hb", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!iq", name = "ib", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!iq", name = "db", descriptor = "Lpg;")
    public static class494 field6132;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)Z", line = 3)
    public final boolean method723(int arg0) {
        ++field6133;
        if (arg0 != 17774) {
            this.method364((class134) null, false);
        }
        return this.field6127;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V", line = 17)
    public final void method722(int arg0) {
        if (arg0 != 0) {
            this.field6119 = false;
        }
        ++field6125;
        this.field6127 = false;
        if (this.field6107 != null) {
            this.field6107.method197(this.field6107.method200() & -65537);
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Leq;Lhn;IIIIIZIIIIIIZ)V", line = 34)
    public class413(class134 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field7065 == 1, class8.method65(arg13, true, arg12));
        this.field6108 = (byte) arg12;
        this.field6127 = arg14;
        this.field6115 = (byte) arg13;
        this.field6130 = (short) arg1.field7046;
        this.field6120 = arg7;
        this.field6123 = arg1.field7041 != 0 && !arg7;
        this.field6122 = (byte) arg3;
        this.field6119 = arg0.method761() && arg1.field7091 && !this.field6120 && ~class118.field1533.field6901 != -1;
        int var16 = 2048;
        if (this.field6127) {
            var16 |= 65536;
        }
        class107 var17 = this.method2464(arg0, this.field6119, -79, var16);
        if (var17 != null) {
            this.field6107 = var17.field1435;
            this.field6117 = var17.field1436;
            if (this.field6127) {
                this.field6107 = this.field6107.method194((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLeq;)V", line = 65)
    public final void method372(byte arg0, class134 arg1) {
        ++field6110;
        Object var3 = null;
        class283 var5;
        if (this.field6117 == null && this.field6119) {
            class107 var4 = this.method2464(arg1, true, -61, 262144);
            var5 = var4 != null ? var4.field1436 : null;
        } else {
            var5 = this.field6117;
            this.field6117 = null;
        }
        if (var5 != null) {
            class484.method2821(var5, this.field6122, super.field2959, super.field2966, (boolean[]) null);
        }
        if (arg0 >= -49) {
            this.method362((byte) 27);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Leq;IILgs;III[[[B[I[I[I[I[IIBIIZ)V", line = 93)
    public static final void method2459(class134 arg0, int arg1, int arg2, class33 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class473.field6834 = arg0;
        class192.field2728 = arg1;
        class145.field1887 = arg3;
        class49.field753 = class473.field6834.method778() > 0;
        class463.field6724 = arg4 >> class41.field628;
        class284.field4053 = arg6 >> class41.field628;
        class67.field1003 = arg4;
        class95.field1278 = arg6;
        class294.field4257 = arg5;
        class480.field6935 = class463.field6724 - class210.field2977;
        if (class480.field6935 < 0) {
            class261.field3727 = -class480.field6935;
            class480.field6935 = 0;
        } else {
            class261.field3727 = 0;
        }
        class120.field1556 = class284.field4053 - class210.field2977;
        if (class120.field1556 < 0) {
            class72.field1056 = -class120.field1556;
            class120.field1556 = 0;
        } else {
            class72.field1056 = 0;
        }
        class30.field499 = class463.field6724 + class210.field2977;
        if (class30.field499 > class282.field4031) {
            class30.field499 = class282.field4031;
        }
        class148.field1924 = class284.field4053 + class210.field2977;
        if (class148.field1924 > class98.field1339) {
            class148.field1924 = class98.field1339;
        }
        for (int var18 = 0; var18 < class210.field2977 + class210.field2977 + 2; ++var18) {
            for (int var23 = 0; var23 < class210.field2977 + class210.field2977 + 2; ++var23) {
                int var24 = class463.field6724 - class210.field2977 + var18;
                int var25 = class284.field4053 - class210.field2977 + var23;
                if (var24 >= 0 && var25 >= 0 && var24 < class282.field4031 && var25 < class98.field1339) {
                    int var26 = var24 << class41.field628;
                    int var27 = var25 << class41.field628;
                    int var28 = class459.field6685[class459.field6685.length - 1].method848(var24, var25) - (1000 << class41.field628 - 7);
                    int var29 = class178.field2562 != null ? class178.field2562[0].method848(var24, var25) + class153.field1965 : class459.field6685[0].method848(var24, var25) + class153.field1965;
                    class139.field1822[var18][var23] = class473.field6834.method820(var26, var28, var27, var26, var29, var27);
                } else {
                    class139.field1822[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class210.field2977 + class210.field2977 + 1; ++var19) {
            for (int var22 = 0; var22 < class210.field2977 + class210.field2977 + 1; ++var22) {
                class52.field777[var19][var22] = class139.field1822[var19][var22] || class139.field1822[var19 + 1][var22] || class139.field1822[var19][var22 + 1] || class139.field1822[var19 + 1][var22 + 1];
            }
        }
        class347.field5004 = arg8;
        class96.field1292 = arg9;
        class7.field123 = arg10;
        class76.field1073 = arg11;
        class416.field6161 = arg12;
        class125.method704();
        class345.method2078(5);
        for (class408 var20 = (class408) class253.field3653.method242(false); var20 != null; var20 = (class408) class253.field3653.method244((byte) -73)) {
            var20.method1435(true);
            class242.method1492(16, var20);
        }
        if (class49.field753) {
            for (int var21 = 0; var21 < class387.field5731; ++var21) {
                class76.field1084[var21].method2267(arg17, -116, arg1);
            }
        }
        if (arg2 > 1) {
            class473.field6834.method839(0);
            if (class248.field3564 == null || class248.field3564 instanceof class54) {
                class248.field3564 = new class179();
            }
        } else if (class248.field3564 == null || class248.field3564 instanceof class179) {
            class248.field3564 = new class54();
        }
        class248.field3564.method153(arg2, 4);
        class248.field3564.method156((byte) 119);
        if (class239.field3347 != null) {
            class181.method1149(true);
            class248.field3564.method154(22, 5000);
            class210.method1299(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class248.field3564.method156((byte) 112);
            class248.field3564.method154(23, 5000);
            class181.method1149(false);
        }
        class210.method1299(arg2, arg7, arg13, arg14, arg15, arg16);
        class248.field3564.method156((byte) 118);
        class248.field3564.method157(91);
        class248.field3564.method156((byte) 104);
        if (arg2 > 1) {
            class473.field6834.method813(0);
        }
        class473.field6834.method766(0, (class472[]) null);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Leq;I)V", line = 250)
    public final void method361(class134 arg0, int arg1) {
        if (arg1 == -1) {
            ++field6112;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIILbp;IZLeq;)V", line = 262)
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        if (!(arg3 instanceof class308)) {
            if (arg3 instanceof class413) {
                class413 var8 = (class413) arg3;
                if (this.field6107 != null && var8.field6107 != null) {
                    this.field6107.method159(var8.field6107, arg4, arg1, arg0, arg5);
                }
            }
        } else {
            class308 var9 = (class308) arg3;
            if (this.field6107 != null && var9.field4482 != null) {
                this.field6107.method159(var9.field4482, arg4, arg1, arg0, arg5);
            }
        }
        ++field6136;
        if (arg2 != -1) {
            method2459((class134) null, 12, -104, (class33) null, 56, -117, 69, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 52, (byte) -102, 69, -40, true);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)I", line = 294)
    public final int method369(byte arg0) {
        if (arg0 <= 24) {
            this.method362((byte) 47);
        }
        ++field6118;
        return this.field6130 & 65535;
    }

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "(I)I", line = 314)
    public final int method2460(int arg0) {
        ++field6106;
        if (arg0 != 15) {
            this.method364((class134) null, false);
        }
        return this.field6107 != null ? this.field6107.method196() / 4 : 15;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIII)V", line = 326)
    public static final void method2461(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class7.field131 = arg0;
        class473.field6839 = arg2;
        if (arg3 >= 24) {
            ++field6131;
            class63.field933 = arg1;
            class92.field1252 = arg4;
        }
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(B)V", line = 340)
    public static void method2462(byte arg0) {
        field6132 = null;
        if (arg0 != -31) {
            field6132 = null;
        }
        field6116 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Leq;ZI)Lva;", line = 353)
    private final class327 method2463(class134 arg0, boolean arg1, int arg2) {
        ++field6109;
        if (this.field6107 != null && arg0.method819(this.field6107.method200(), arg2) == 0) {
            return this.field6107;
        } else {
            class107 var4 = this.method2464(arg0, arg1, -111, arg2);
            return var4 != null ? var4.field1435 : null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Leq;Z)Lgl;", line = 370)
    public final class408 method364(class134 arg0, boolean arg1) {
        ++field6111;
        if (arg1) {
            this.method365(115, (class134) null, (byte) 35, 81);
        }
        if (this.field6107 == null) {
            return null;
        } else {
            class33 var3 = arg0.method830();
            var3.method278(super.field2959, super.field2970, super.field2966);
            class408 var4 = null;
            if (this.field6123) {
                var4 = class118.method675(-127, 1);
            }
            this.field6107.method191(var3, var4 == null ? null : var4.field5983[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILeq;Z)Lva;", line = 396)
    public final class327 method367(int arg0, class134 arg1, boolean arg2) {
        ++field6134;
        if (!arg2) {
            this.method722(20);
        }
        return this.method2463(arg1, false, arg0);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILeq;BI)Z", line = 408)
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        ++field6129;
        int var5 = 50 % ((arg2 - -23) / 38);
        class327 var6 = this.method2463(arg1, false, 131072);
        if (var6 != null) {
            class33 var7 = arg1.method830();
            var7.method278(super.field2959, super.field2970, super.field2966);
            return var6.method184(arg0, arg3, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)Z", line = 428)
    public final boolean method371(boolean arg0) {
        ++field6137;
        if (arg0) {
            this.field6119 = true;
        }
        return this.field6119;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)I", line = 440)
    public final int method724(byte arg0) {
        ++field6126;
        if (arg0 > -30) {
            this.method369((byte) -94);
        }
        return this.field6107 == null ? 0 : this.field6107.method195();
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V", line = 451)
    public final void method368(int arg0) {
        if (this.field6107 != null) {
            this.field6107.method167();
        }
        ++field6105;
        if (arg0 != 5894) {
            this.field6127 = false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Leq;ZII)Luq;", line = 465)
    private final class107 method2464(class134 arg0, boolean arg1, int arg2, int arg3) {
        ++field6121;
        if (arg2 >= -55) {
            field6113 = -109;
        }
        class486 var5 = class114.field1471.method2132((byte) 126, 65535 & this.field6130);
        class441 var6;
        class441 var7;
        if (this.field6120) {
            var6 = class178.field2562[this.field6122];
            var7 = class459.field6685[0];
        } else {
            var6 = class459.field6685[this.field6122];
            if (~this.field6122 > -4) {
                var7 = class459.field6685[this.field6122 + 1];
            } else {
                var7 = null;
            }
        }
        return var5.method2836(var7, var6, super.field2959, super.field2966, arg3, super.field2970, ~this.field6108 == -12 ? 10 : this.field6108, arg1, this.field6108 == 11 ? this.field6115 + 4 : this.field6115, arg0, (byte) 73);
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)I", line = 496)
    public final int method362(byte arg0) {
        ++field6124;
        if (arg0 != -72) {
            this.field6119 = false;
        }
        return this.field6108;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Leq;Z)V", line = 509)
    public final void method360(class134 arg0, boolean arg1) {
        ++field6128;
        Object var3 = null;
        if (!arg1) {
            this.method722(116);
        }
        class283 var5;
        if (this.field6117 == null && this.field6119) {
            class107 var4 = this.method2464(arg0, true, -67, 262144);
            var5 = var4 != null ? var4.field1436 : null;
        } else {
            var5 = this.field6117;
            this.field6117 = null;
        }
        if (var5 != null) {
            class458.method2666(var5, this.field6122, super.field2959, super.field2966, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I", line = 537)
    public final int method359(int arg0) {
        if (arg0 != 13228) {
            field6114 = -1;
        }
        ++field6135;
        return this.field6115;
    }
}
