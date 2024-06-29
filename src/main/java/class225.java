import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class225 extends class370 implements class232 {

    @OriginalMember(owner = "client!cs", name = "O", descriptor = "B")
    private byte field3277;

    @OriginalMember(owner = "client!cs", name = "hb", descriptor = "Z")
    private boolean field3296;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "B")
    private byte field3262;

    @OriginalMember(owner = "client!cs", name = "cb", descriptor = "Z")
    private boolean field3291;

    @OriginalMember(owner = "client!cs", name = "Q", descriptor = "B")
    private byte field3279;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "Z")
    private boolean field3268;

    @OriginalMember(owner = "client!cs", name = "ab", descriptor = "S")
    private short field3289;

    @OriginalMember(owner = "client!cs", name = "T", descriptor = "Z")
    private boolean field3282;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "Lc;")
    public class121 field3266;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "Lj;")
    private class377 field3269;

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "[I")
    public static int[] field3264 = new int[1000];

    @OriginalMember(owner = "client!cs", name = "W", descriptor = "[I")
    public static int[] field3285 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "Z")
    public static boolean field3274 = false;

    @OriginalMember(owner = "client!cs", name = "N", descriptor = "Lgf;")
    public static class180 field3276 = new class180("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!cs", name = "P", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!cs", name = "R", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!cs", name = "S", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!cs", name = "U", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!cs", name = "V", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!cs", name = "X", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!cs", name = "Y", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!cs", name = "Z", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!cs", name = "bb", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!cs", name = "db", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!cs", name = "eb", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!cs", name = "fb", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!cs", name = "gb", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!cs", name = "ib", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "Lhh;")
    public static class84 field3272;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)I", line = 6)
    public final int method380(boolean arg0) {
        if (!arg0) {
            method1494((class84) null, true);
        }
        ++field3283;
        return this.field3262;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lqa;I)V", line = 17)
    public final void method374(class162 arg0, int arg1) {
        ++field3295;
        if (arg1 == 28339) {
            Object var3 = null;
            class377 var5;
            if (this.field3269 == null && this.field3282) {
                class505 var4 = this.method1491(262144, arg1 ^ 28344, arg0, true);
                var5 = var4 == null ? null : var4.field7405;
            } else {
                var5 = this.field3269;
                this.field3269 = null;
            }
            if (var5 != null) {
                class393.method2457(var5, this.field3279, super.field5529, super.field5539, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(Lqa;I)V", line = 46)
    public final void method126(class162 arg0, int arg1) {
        ++field3261;
        if (arg1 > -43) {
            this.method1492((byte) -72, -80, (class162) null);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lti;I)Lqp;", line = 56)
    public static final class465 method1489(class303 arg0, int arg1) {
        ++field3293;
        if (arg1 != 15) {
            field3276 = null;
        }
        return new class465(arg0.method1901(125), arg0.method1901(127), arg0.method1901(119), arg0.method1901(arg1 + 105), arg0.method1866(false), arg0.method1866(false), arg0.method1918((byte) 67));
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Z", line = 69)
    public final boolean method377(int arg0) {
        ++field3290;
        if (arg0 > -27) {
            this.method377(12);
        }
        return this.field3282;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIILqa;)Z", line = 80)
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        if (arg1 != -1) {
            return true;
        } else {
            ++field3275;
            class121 var5 = this.method1492((byte) 84, 131072, arg3);
            if (var5 != null) {
                class413 var6 = arg3.method439();
                var6.method1008(super.field5529, super.field5534, super.field5539);
                return var5.method909(arg2, arg0, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Lqa;I)V", line = 104)
    public final void method373(class162 arg0, int arg1) {
        ++field3280;
        Object var3 = null;
        if (arg1 == -2304) {
            class377 var5;
            if (this.field3269 == null && this.field3282) {
                class505 var4 = this.method1491(262144, 11, arg0, true);
                var5 = var4 == null ? null : var4.field7405;
            } else {
                var5 = this.field3269;
                this.field3269 = null;
            }
            if (var5 != null) {
                class434.method2623(var5, this.field3279, super.field5529, super.field5539, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "(I)I", line = 144)
    public final int method1490(int arg0) {
        ++field3281;
        int var2 = 105 / ((-32 - arg0) / 45);
        return this.field3266 == null ? 15 : this.field3266.method916() / 4;
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)V", line = 155)
    public final void method117(int arg0) {
        ++field3265;
        this.field3296 = false;
        if (this.field3266 != null) {
            this.field3266.method894(this.field3266.method915() & -65537);
        }
        if (arg0 >= -127) {
            method1494((class84) null, true);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IILqa;IZLha;I)V", line = 171)
    public final void method111(int arg0, int arg1, class162 arg2, int arg3, boolean arg4, class41 arg5, int arg6) {
        if (arg3 >= 5) {
            if (arg5 instanceof class227) {
                class227 var8 = (class227) arg5;
                if (this.field3266 != null && var8.field3316 != null) {
                    this.field3266.method907(var8.field3316, arg1, arg0, arg6, arg4);
                }
            } else if (arg5 instanceof class225) {
                class225 var9 = (class225) arg5;
                if (this.field3266 != null && var9.field3266 != null) {
                    this.field3266.method907(var9.field3266, arg1, arg0, arg6, arg4);
                }
            }
            ++field3273;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I", line = 202)
    public final int method375(int arg0) {
        if (arg0 != -13015) {
            return 29;
        } else {
            ++field3271;
            return this.field3277;
        }
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)Z", line = 214)
    public final boolean method121(int arg0) {
        ++field3297;
        if (arg0 != 26923) {
            this.method375(-40);
        }
        return this.field3296;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IILqa;Z)Lrl;", line = 229)
    private final class505 method1491(int arg0, int arg1, class162 arg2, boolean arg3) {
        if (arg1 != 11) {
            method1495((byte) 123);
        }
        ++field3287;
        class510 var5 = class246.field3567.method609(111, 65535 & this.field3289);
        class35 var6;
        class35 var7;
        if (!this.field3291) {
            if (~this.field3279 > -4) {
                var6 = class145.field2135[this.field3279 + 1];
            } else {
                var6 = null;
            }
            var7 = class145.field2135[this.field3279];
        } else {
            var6 = class145.field2135[0];
            var7 = class62.field1063[this.field3279];
        }
        return var5.method3016(arg2, var6, super.field5534, ~this.field3262 != -12 ? this.field3262 : 10, super.field5529, this.field3262 != 11 ? this.field3277 : 4 - -this.field3277, arg3, (byte) -121, super.field5539, arg0, var7);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BILqa;)Lc;", line = 261)
    private final class121 method1492(byte arg0, int arg1, class162 arg2) {
        ++field3263;
        if (this.field3266 != null && arg2.method518(this.field3266.method915(), arg1) == 0) {
            return this.field3266;
        } else {
            if (arg0 != 84) {
                this.field3277 = 121;
            }
            class505 var4 = this.method1491(arg1, arg0 + -73, arg2, false);
            return var4 == null ? null : var4.field7408;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)V", line = 283)
    public static final void method1493(int arg0, byte arg1) {
        if (arg1 <= -107) {
            ++field3267;
            class434 var2 = class483.method2888(arg0, 76, 16);
            var2.method2628(64);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lhh;Z)V", line = 299)
    public static final void method1494(class84 arg0, boolean arg1) {
        if (!arg1) {
            method1493(-113, (byte) 16);
        }
        class45.field693 = arg0;
        ++field3284;
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(B)V", line = 310)
    public static void method1495(byte arg0) {
        field3276 = null;
        if (arg0 <= -120) {
            field3272 = null;
            field3264 = null;
            field3285 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lqa;Lbo;IIIIIZIIIIIIZ)V", line = 324)
    public class225(class162 arg0, class510 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field7458 == 1, class216.method1427(arg12, (byte) 127, arg13));
        this.field3277 = (byte) arg13;
        this.field3296 = arg14;
        this.field3262 = (byte) arg12;
        this.field3291 = arg7;
        this.field3279 = (byte) arg3;
        this.field3268 = arg1.field7491 != 0 && !arg7;
        this.field3289 = (short) arg1.field7483;
        this.field3282 = arg0.method481() && arg1.field7489 && !this.field3291 && class397.field5830.method56((byte) -100, class399.field5865) != 0;
        int var16 = 2048;
        if (this.field3296) {
            var16 |= 65536;
        }
        class505 var17 = this.method1491(var16, 11, arg0, this.field3282);
        if (var17 != null) {
            this.field3266 = var17.field7408;
            this.field3269 = var17.field7405;
            if (this.field3296) {
                this.field3266 = this.field3266.method881((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V", line = 358)
    public final void method376(int arg0) {
        if (arg0 != 16931) {
            this.method107(false);
        }
        if (this.field3266 != null) {
            this.field3266.method891();
        }
        ++field3294;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IILqa;)Lc;", line = 372)
    public final class121 method381(int arg0, int arg1, class162 arg2) {
        if (arg0 != 1584) {
            field3285 = null;
        }
        ++field3288;
        return this.method1492((byte) 84, arg1, arg2);
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)I", line = 383)
    public final int method107(boolean arg0) {
        if (arg0) {
            this.method375(-104);
        }
        ++field3292;
        return this.field3266 == null ? 0 : this.field3266.method918();
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)I", line = 400)
    public final int method379(byte arg0) {
        ++field3286;
        if (arg0 != -96) {
            this.method126((class162) null, 104);
        }
        return 65535 & this.field3289;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V", line = 413)
    public static final void method1496(int arg0, int arg1, int arg2) {
        class165 var3 = class36.field545[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field2487 != null) {
                var3.field2487 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILqa;)Lbw;", line = 422)
    public final class482 method114(int arg0, class162 arg1) {
        ++field3270;
        if (this.field3266 == null) {
            return null;
        } else {
            class413 var3 = arg1.method439();
            if (arg0 != -6796) {
                return null;
            } else {
                var3.method1008(super.field5529, super.field5534, super.field5539);
                class482 var4 = null;
                if (this.field3268) {
                    var4 = class410.method2537((byte) -96, 1);
                }
                this.field3266.method910(var3, var4 != null ? var4.field7079[0] : null, 0);
                return var4;
            }
        }
    }
}
