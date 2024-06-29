import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class286 extends class336 implements class438 {

    @OriginalMember(owner = "client!no", name = "Q", descriptor = "B")
    private byte field4191;

    @OriginalMember(owner = "client!no", name = "Z", descriptor = "B")
    private byte field4197;

    @OriginalMember(owner = "client!no", name = "S", descriptor = "Z")
    private boolean field4192;

    @OriginalMember(owner = "client!no", name = "E", descriptor = "B")
    private byte field4179;

    @OriginalMember(owner = "client!no", name = "L", descriptor = "S")
    private short field4186;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "Z")
    private boolean field4187;

    @OriginalMember(owner = "client!no", name = "H", descriptor = "Z")
    private boolean field4182;

    @OriginalMember(owner = "client!no", name = "ab", descriptor = "Z")
    private boolean field4198;

    @OriginalMember(owner = "client!no", name = "jb", descriptor = "Lbi;")
    public class143 field4207;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "Lqh;")
    private class337 field4183;

    @OriginalMember(owner = "client!no", name = "F", descriptor = "I")
    public static int field4180 = 0;

    @OriginalMember(owner = "client!no", name = "X", descriptor = "Lbt;")
    public static class363 field4195 = new class363(4);

    @OriginalMember(owner = "client!no", name = "mb", descriptor = "Z")
    public static boolean field4210 = false;

    @OriginalMember(owner = "client!no", name = "nb", descriptor = "I")
    public static int field4211 = 2;

    @OriginalMember(owner = "client!no", name = "z", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!no", name = "A", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!no", name = "B", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!no", name = "C", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!no", name = "D", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!no", name = "G", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!no", name = "J", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!no", name = "K", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!no", name = "N", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!no", name = "O", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!no", name = "P", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!no", name = "T", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!no", name = "V", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!no", name = "Y", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!no", name = "bb", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!no", name = "cb", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!no", name = "db", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!no", name = "eb", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!no", name = "hb", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!no", name = "ib", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!no", name = "kb", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!no", name = "lb", descriptor = "Lct;")
    public static class104 field4209;

    @OriginalMember(owner = "client!no", name = "gb", descriptor = "[I")
    public static int[] field4204;

    @OriginalMember(owner = "client!no", name = "fb", descriptor = "[[S")
    public static short[][] field4203;

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lfp;Lgn;IIIIIZIIIIIIZ)V")
    public class286(class9 arg0, class178 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field2529 == -2, class237.method1595(arg13, true, arg12));
        this.field4191 = (byte) arg12;
        this.field4197 = (byte) arg3;
        this.field4192 = arg1.field2479 != 0 && !arg7;
        this.field4179 = (byte) arg13;
        this.field4186 = (short) arg1.field2455;
        this.field4187 = arg14;
        this.field4182 = arg7;
        this.field4198 = arg0.method94() && arg1.field2478 && !this.field4182 && class213.field3010 != 0;
        int var16 = 1024;
        if (this.field4187) {
            var16 |= 32768;
        }
        class441 var17 = this.method1927(-45, arg0, this.field4198, var16);
        if (var17 != null) {
            this.field4207 = var17.field6414;
            this.field4183 = var17.field6419;
            if (this.field4187) {
                this.field4207 = this.field4207.method966((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lfp;Lje;ZIIII)V")
    public final void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 instanceof class358) {
            class358 var8 = (class358) arg1;
            if (this.field4207 != null && var8.field5190 != null) {
                this.field4207.method963(var8.field5190, arg4, arg3, arg6, arg2);
            }
        } else if (arg1 instanceof class286) {
            class286 var9 = (class286) arg1;
            if (this.field4207 != null && var9.field4207 != null) {
                this.field4207.method963(var9.field4207, arg4, arg3, arg6, arg2);
            }
        }
        if (arg5 > -31) {
            method1924(-112);
        }
        ++field4201;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILfp;)Luq;")
    public final class241 method2(int arg0, class9 arg1) {
        ++field4206;
        if (this.field4207 == null) {
            return null;
        } else {
            class187 var3 = arg1.method145();
            if (arg0 >= -125) {
                return null;
            } else {
                var3.method831(super.field4954, super.field4952, super.field4951);
                class241 var4 = null;
                if (this.field4192) {
                    var4 = class395.method2485(-29083, 1);
                }
                this.field4207.method947(var3, var4 == null ? null : var4.field3578[0], 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(I)I")
    public final int method1922(int arg0) {
        if (arg0 != 1) {
            return -86;
        } else {
            ++field4189;
            return this.field4207 != null ? this.field4207.method960() / 4 : 15;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)Lg;")
    public static final class446 method1923(byte arg0, int arg1) {
        ++field4185;
        if (arg0 != 59) {
            method1923((byte) -59, -58);
        }
        class363 var2 = class298.field4339;
        class446 var3;
        synchronized (class298.field4339) {
            var3 = (class446) class298.field4339.method2310((byte) -126, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class55.field677.method715(arg1, (byte) 95, 32);
            class446 var5 = new class446();
            if (var4 != null) {
                var5.method2740(new class256(var4), (byte) 62);
            }
            var5.method2738((byte) -70);
            class363 var6 = class298.field4339;
            synchronized (class298.field4339) {
                class298.field4339.method2299(true, var5, (long) arg1);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
    public final void method4(int arg0) {
        if (arg0 != -27030) {
            this.method11((class9) null, 27, 127);
        }
        if (this.field4207 != null) {
            this.field4207.method948();
        }
        ++field4174;
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(I)V")
    public static final void method1924(int arg0) {
        if (arg0 == 65536) {
            ++field4194;
            class36.field516 = -1;
            class247.field3647 = -1;
            class164.field2169 = 0;
            class212.field2993 = -1;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILfp;Z)Lbi;")
    private final class143 method1925(int arg0, class9 arg1, boolean arg2) {
        ++field4205;
        if (this.field4207 != null && arg1.method85(this.field4207.method961(), arg0) == 0) {
            return this.field4207;
        } else {
            class441 var4 = this.method1927(-44, arg1, false, arg0);
            if (!arg2) {
                field4204 = null;
            }
            return var4 == null ? null : var4.field6414;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)I")
    public final int method1(int arg0) {
        if (arg0 >= -72) {
            this.field4192 = true;
        }
        ++field4177;
        return this.field4179;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lfp;Z)V")
    public final void method10(class9 arg0, boolean arg1) {
        if (arg1) {
            field4180 = 123;
        }
        ++field4193;
        Object var3 = null;
        class337 var5;
        if (this.field4183 == null && this.field4198) {
            class441 var4 = this.method1927(-100, arg0, true, 131072);
            var5 = var4 == null ? null : var4.field6419;
        } else {
            var5 = this.field4183;
            this.field4183 = null;
        }
        if (var5 != null) {
            class146.method1013(var5, this.field4197, super.field4954, super.field4951, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lfp;I)V")
    public final void method7(class9 arg0, int arg1) {
        ++field4181;
        Object var3 = null;
        class337 var5;
        if (this.field4183 == null && this.field4198) {
            class441 var4 = this.method1927(-61, arg0, true, 131072);
            var5 = var4 != null ? var4.field6419 : null;
        } else {
            var5 = this.field4183;
            this.field4183 = null;
        }
        if (arg1 < 98) {
            this.field4179 = 33;
        }
        if (var5 != null) {
            class163.method1079(var5, this.field4197, super.field4954, super.field4951, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lfp;II)Lbi;")
    public final class143 method11(class9 arg0, int arg1, int arg2) {
        ++field4196;
        return arg2 != -23109 ? null : this.method1925(arg1, arg0, true);
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
    public final void method33(int arg0) {
        ++field4202;
        this.field4187 = false;
        if (this.field4207 != null) {
            this.field4207.method975(-32769 & this.field4207.method961());
        }
        if (arg0 <= 109) {
            this.method1(44);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)Z")
    public final boolean method15(boolean arg0) {
        ++field4199;
        return !arg0 ? false : this.field4198;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lfp;III)Z")
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -754) {
            return true;
        } else {
            ++field4188;
            class143 var5 = this.method1925(65536, arg0, true);
            if (var5 != null) {
                class187 var6 = arg0.method145();
                var6.method831(super.field4954, super.field4952, super.field4951);
                return var5.method988(arg3, arg1, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I")
    public final int method9(byte arg0) {
        ++field4200;
        if (arg0 < 102) {
            field4211 = -50;
        }
        return this.field4186 & 65535;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(ILfp;)V")
    public final void method14(int arg0, class9 arg1) {
        ++field4176;
        if (arg0 != -7561) {
            this.method1925(-36, (class9) null, false);
        }
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(B)I")
    public final int method268(byte arg0) {
        if (arg0 >= -101) {
            return 44;
        } else {
            ++field4178;
            return this.field4207 != null ? this.field4207.method950() : 0;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lsq;BLsq;)V")
    public static final void method1926(class29 arg0, byte arg1, class29 arg2) {
        ++field4184;
        if (arg2.field412 != null) {
            arg2.method299((byte) -86);
        }
        arg2.field407 = arg0.field407;
        if (arg1 > 123) {
            arg2.field412 = arg0;
            arg2.field412.field407 = arg2;
            arg2.field407.field412 = arg2;
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)I")
    public final int method6(int arg0) {
        if (arg0 != -20839) {
            this.field4207 = null;
        }
        ++field4208;
        return this.field4191;
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(B)Z")
    public final boolean method34(byte arg0) {
        ++field4190;
        int var2 = 34 / ((arg0 - -19) / 44);
        return this.field4187;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILfp;ZI)Lwk;")
    private final class441 method1927(int arg0, class9 arg1, boolean arg2, int arg3) {
        ++field4175;
        if (arg0 > -15) {
            this.field4192 = true;
        }
        class178 var5 = class450.method2785(this.field4186 & 65535, (byte) 97);
        class378 var6;
        class378 var7;
        if (this.field4182) {
            var6 = class28.field401[0];
            var7 = class161.field2151[this.field4197];
        } else {
            var7 = class28.field401[this.field4197];
            if (this.field4197 < 3) {
                var6 = class28.field401[this.field4197 + 1];
            } else {
                var6 = null;
            }
        }
        return var5.method1238(var6, super.field4951, super.field4954, ~this.field4191 != -12 ? this.field4191 : 10, arg2, super.field4952, arg1, arg3, 117, var7, this.field4191 != 11 ? this.field4179 : this.field4179 + 4);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Z)V")
    public static void method1928(boolean arg0) {
        field4203 = null;
        field4195 = null;
        field4209 = null;
        if (arg0) {
            method1923((byte) 3, 120);
        }
        field4204 = null;
    }
}
