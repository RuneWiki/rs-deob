import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class181 extends class83 implements class116 {

    @OriginalMember(owner = "client!ju", name = "Q", descriptor = "B")
    private byte field2317;

    @OriginalMember(owner = "client!ju", name = "L", descriptor = "B")
    private byte field2312;

    @OriginalMember(owner = "client!ju", name = "cb", descriptor = "B")
    private byte field2329;

    @OriginalMember(owner = "client!ju", name = "G", descriptor = "S")
    private short field2307;

    @OriginalMember(owner = "client!ju", name = "ib", descriptor = "Z")
    private boolean field2335;

    @OriginalMember(owner = "client!ju", name = "U", descriptor = "Z")
    private boolean field2321;

    @OriginalMember(owner = "client!ju", name = "hb", descriptor = "Z")
    private boolean field2334;

    @OriginalMember(owner = "client!ju", name = "J", descriptor = "Z")
    private boolean field2310;

    @OriginalMember(owner = "client!ju", name = "W", descriptor = "Lqh;")
    public class352 field2323;

    @OriginalMember(owner = "client!ju", name = "X", descriptor = "Lph;")
    private class125 field2324;

    @OriginalMember(owner = "client!ju", name = "db", descriptor = "[I")
    public static int[] field2330 = new int[2];

    @OriginalMember(owner = "client!ju", name = "N", descriptor = "Lpn;")
    public static class72 field2314 = new class72(41, 3);

    @OriginalMember(owner = "client!ju", name = "E", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!ju", name = "F", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ju", name = "H", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!ju", name = "I", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!ju", name = "K", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!ju", name = "M", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ju", name = "O", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!ju", name = "P", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!ju", name = "R", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ju", name = "S", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ju", name = "T", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ju", name = "V", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!ju", name = "Y", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!ju", name = "Z", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ju", name = "bb", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ju", name = "eb", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!ju", name = "fb", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!ju", name = "gb", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ju", name = "jb", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ju", name = "kb", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!ju", name = "lb", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ju", name = "mb", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ju", name = "ab", descriptor = "Lbd;")
    public static class327 field2327;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILoj;)V")
    public final void method20(int arg0, class280 arg1) {
        ++field2336;
        Object var3 = null;
        if (arg0 != 5744) {
            this.field2335 = false;
        }
        class125 var5;
        if (this.field2324 == null && this.field2310) {
            class324 var4 = this.method983(true, (byte) -10, 131072, arg1);
            var5 = var4 != null ? var4.field4676 : null;
        } else {
            var5 = this.field2324;
            this.field2324 = null;
        }
        if (var5 != null) {
            class47.method249(var5, this.field2312, super.field1008, super.field1005, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (this.field2323 != null) {
            this.field2323.method1722();
        }
        ++field2331;
        if (arg0 < 41) {
            this.method17(31);
        }
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(ILoj;)Lmg;")
    public final class451 method19(int arg0, class280 arg1) {
        ++field2333;
        if (this.field2323 == null) {
            return null;
        } else {
            class327 var3 = arg1.method1456();
            var3.method553(super.field1008, super.field1001, super.field1005);
            if (arg0 <= 95) {
                this.method17(-9);
            }
            class451 var4 = null;
            if (this.field2321) {
                var4 = class134.method638(762096108, 1);
            }
            this.field2323.method1716(var3, var4 == null ? null : var4.field6379[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)I")
    public final int method31(byte arg0) {
        int var2 = -96 % ((arg0 - -23) / 35);
        ++field2308;
        return this.field2329;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIZLa;IBLoj;)V")
    public final void method23(int arg0, int arg1, boolean arg2, class78 arg3, int arg4, byte arg5, class280 arg6) {
        if (arg5 == -65) {
            if (arg3 instanceof class117) {
                class117 var8 = (class117) arg3;
                if (this.field2323 != null && var8.field1441 != null) {
                    this.field2323.method1745(var8.field1441, arg0, arg1, arg4, arg2);
                }
            } else if (arg3 instanceof class181) {
                class181 var9 = (class181) arg3;
                if (this.field2323 != null && var9.field2323 != null) {
                    this.field2323.method1745(var9.field2323, arg0, arg1, arg4, arg2);
                }
            }
            ++field2320;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Loj;IB)Lqh;")
    private final class352 method979(class280 arg0, int arg1, byte arg2) {
        ++field2318;
        if (this.field2323 != null && arg0.method1473(this.field2323.method1719(), arg1) == 0) {
            return this.field2323;
        } else {
            if (arg2 != 104) {
                method981(false);
            }
            class324 var4 = this.method983(false, (byte) -10, arg1, arg0);
            return var4 == null ? null : var4.field4681;
        }
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)Z")
    public final boolean method33(int arg0) {
        if (arg0 != 1957) {
            this.field2310 = true;
        }
        ++field2305;
        return this.field2335;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I[I[J)V")
    public static final void method980(int arg0, int[] arg1, long[] arg2) {
        class142.method667(arg2, 1, arg2.length - 1, arg1, 0);
        if (arg0 <= -43) {
            ++field2311;
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Loj;Lcu;IIIIIZIIIIIIZ)V")
    public class181(class280 arg0, class415 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field5937 == -2, class343.method2082(126, arg12, arg13));
        this.field2317 = (byte) arg12;
        this.field2312 = (byte) arg3;
        this.field2329 = (byte) arg13;
        this.field2307 = (short) arg1.field5918;
        this.field2335 = arg14;
        this.field2321 = arg1.field5990 != 0 && !arg7;
        this.field2334 = arg7;
        this.field2310 = arg0.method1474() && arg1.field5960 && !this.field2334 && ~class427.field6166 != -1;
        int var16 = 1024;
        if (this.field2335) {
            var16 |= 32768;
        }
        class324 var17 = this.method983(this.field2310, (byte) -10, var16, arg0);
        if (var17 != null) {
            this.field2323 = var17.field4681;
            this.field2324 = var17.field4676;
            if (this.field2335) {
                this.field2323 = this.field2323.method1749((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)I")
    public final int method26(byte arg0) {
        ++field2325;
        return arg0 != 73 ? 108 : this.field2317;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(Z)V")
    public static void method981(boolean arg0) {
        field2314 = null;
        if (!arg0) {
            method980(-107, (int[]) null, (long[]) null);
        }
        field2330 = null;
        field2327 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILoj;II)Z")
    public final boolean method28(int arg0, class280 arg1, int arg2, int arg3) {
        if (arg3 != -6085) {
            this.field2312 = 49;
        }
        ++field2306;
        class352 var5 = this.method979(arg1, 65536, (byte) 104);
        if (var5 != null) {
            class327 var6 = arg1.method1456();
            var6.method553(super.field1008, super.field1001, super.field1005);
            return var5.method1695(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(ILoj;)V")
    public final void method18(int arg0, class280 arg1) {
        ++field2328;
        Object var3 = null;
        class125 var5;
        if (this.field2324 == null && this.field2310) {
            class324 var4 = this.method983(true, (byte) -10, 131072, arg1);
            var5 = var4 == null ? null : var4.field4676;
        } else {
            var5 = this.field2324;
            this.field2324 = null;
        }
        if (var5 != null) {
            class200.method1098(var5, this.field2312, super.field1008, super.field1005, (boolean[]) null);
        }
        int var6 = 59 / ((62 - arg0) / 63);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)I")
    public final int method16(boolean arg0) {
        ++field2339;
        return arg0 ? 76 : this.field2307 & 65535;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)Z")
    public final boolean method22(int arg0) {
        if (arg0 > -32) {
            return false;
        } else {
            ++field2332;
            return this.field2310;
        }
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(ILoj;)V")
    public final void method27(int arg0, class280 arg1) {
        ++field2316;
        if (arg0 != 0) {
            this.method23(-26, -48, false, (class78) null, 25, (byte) 80, (class280) null);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IBLg;I)Lob;")
    public static final class227 method982(int arg0, byte arg1, class470 arg2, int arg3) {
        ++field2315;
        class179 var4 = new class179(arg2.method2768(-20472, arg0, arg3));
        class227 var5 = new class227(arg0, var4.method907(-27652), var4.method907(-27652), var4.method939((byte) 111), var4.method939((byte) 123), ~var4.method895((byte) -81) == -2, var4.method895((byte) -88), var4.method895((byte) -96));
        int var6 = var4.method895((byte) -74);
        int var7 = -39 % ((arg1 - 30) / 48);
        for (int var8 = 0; var6 > var8; ++var8) {
            var5.field3161.method803(new class419(var4.method895((byte) -107), var4.method916(21933), var4.method916(21933), var4.method916(21933), var4.method916(21933), var4.method916(21933), var4.method916(21933), var4.method916(21933), var4.method916(21933)), 50);
        }
        var5.method1257(12094);
        return var5;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZBILoj;)Lpr;")
    private final class324 method983(boolean arg0, byte arg1, int arg2, class280 arg3) {
        ++field2337;
        class415 var5 = class173.field2084.method2297(50, this.field2307 & 65535);
        if (arg1 != -10) {
            this.method19(-41, (class280) null);
        }
        class443 var6;
        class443 var7;
        if (this.field2334) {
            var6 = class361.field5208[this.field2312];
            var7 = class443.field6329[0];
        } else {
            if (~this.field2312 > -4) {
                var7 = class443.field6329[this.field2312 + 1];
            } else {
                var7 = null;
            }
            var6 = class443.field6329[this.field2312];
        }
        return var5.method2466(var6, var7, ~this.field2317 == -12 ? 10 : this.field2317, arg0, ~this.field2317 == -12 ? this.field2329 + 4 : this.field2329, super.field1008, (byte) 113, super.field1001, super.field1005, arg3, arg2);
    }

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "(I)V")
    public final void method32(int arg0) {
        if (arg0 == -2) {
            ++field2326;
            this.field2335 = false;
            if (this.field2323 != null) {
                this.field2323.method1732(-32769 & this.field2323.method1719());
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILoj;B)Lqh;")
    public final class352 method21(int arg0, class280 arg1, byte arg2) {
        ++field2313;
        if (arg2 != -98) {
            this.method22(-5);
        }
        return this.method979(arg1, arg0, (byte) 104);
    }

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "(I)I")
    public final int method17(int arg0) {
        ++field2338;
        if (arg0 != -8960) {
            return 117;
        } else {
            return this.field2323 == null ? 0 : this.field2323.method1733();
        }
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(B)I")
    public final int method984(byte arg0) {
        if (arg0 != -92) {
            this.method983(true, (byte) -20, 19, (class280) null);
        }
        ++field2319;
        return this.field2323 == null ? 15 : this.field2323.method1737() / 4;
    }
}
