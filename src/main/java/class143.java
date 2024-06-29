import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class143 extends class180 implements class55 {

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Z")
    private boolean field2037;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "S")
    private short field2051;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "B")
    private byte field2048;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "Z")
    private boolean field2044;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "Z")
    private boolean field2055;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "B")
    private byte field2034;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "Z")
    private boolean field2047;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "Lj;")
    private class378 field2050;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "Lc;")
    private class121 field2056;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILqa;)V", line = 4)
    public final void method356(int arg0, class162 arg1) {
        ++field2057;
        if (arg0 >= 100) {
            Object var3 = null;
            class378 var5;
            if (this.field2050 == null && this.field2047) {
                class60 var4 = this.method923(true, (byte) 31, 262144, arg1);
                var5 = var4 != null ? var4.field801 : null;
            } else {
                var5 = this.field2050;
                this.field2050 = null;
            }
            if (var5 != null) {
                class174.method1075(var5, this.field2034, super.field2545, super.field2543, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(ILqa;)V", line = 35)
    public final void method357(int arg0, class162 arg1) {
        ++field2052;
        if (arg0 <= 41) {
            this.field2037 = false;
        }
        Object var3 = null;
        class378 var5;
        if (this.field2050 == null && this.field2047) {
            class60 var4 = this.method923(true, (byte) 31, 262144, arg1);
            var5 = var4 == null ? null : var4.field801;
        } else {
            var5 = this.field2050;
            this.field2050 = null;
        }
        if (var5 != null) {
            class114.method731(var5, this.field2034, super.field2545, super.field2543, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I", line = 63)
    public final int method355(int arg0) {
        if (arg0 != 13599) {
            this.field2051 = 41;
        }
        ++field2043;
        return 22;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V", line = 74)
    public final void method361(int arg0) {
        ++field2046;
        if (this.field2056 != null) {
            this.field2056.method796();
        }
        int var2 = 119 / ((-36 - arg0) / 36);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILco;ILqa;ZZ)V", line = 89)
    public final void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6) {
        if (arg2 instanceof class143) {
            class143 var8 = (class143) arg2;
            if (this.field2056 != null && var8.field2056 != null) {
                this.field2056.method800(var8.field2056, arg3, arg1, arg0, arg5);
            }
        }
        if (arg6) {
            ++field2059;
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V", line = 109)
    public final void method398(int arg0) {
        ++field2054;
        if (arg0 <= 74) {
            this.field2037 = false;
        }
        this.field2055 = false;
        if (this.field2056 != null) {
            this.field2056.method787(-65537 & this.field2056.method775());
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)I", line = 127)
    public final int method354(byte arg0) {
        ++field2040;
        int var2 = 117 % ((61 - arg0) / 53);
        return 65535 & this.field2051;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lqa;BI)Lc;", line = 137)
    private final class121 method921(class162 arg0, byte arg1, int arg2) {
        ++field2053;
        if (this.field2056 != null && ~arg0.method472(this.field2056.method775(), arg2) == -1) {
            return this.field2056;
        } else {
            class60 var4 = this.method923(false, (byte) 31, arg2, arg0);
            int var5 = -68 / ((arg1 - -43) / 49);
            return var4 != null ? var4.field803 : null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)Z", line = 158)
    public final boolean method399(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field2042;
            return this.field2055;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lkj;ILm;Ljava/awt/Canvas;II)Lqa;", line = 169)
    public static final class162 method922(class397 arg0, int arg1, class126 arg2, Canvas arg3, int arg4, int arg5) {
        ++field2058;
        if (arg4 > -22) {
            method922((class397) null, 108, (class126) null, (Canvas) null, -3, 27);
        }
        return new class410(arg1, arg3, arg2, arg5, arg0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZBILqa;)Ltt;", line = 184)
    private final class60 method923(boolean arg0, byte arg1, int arg2, class162 arg3) {
        ++field2036;
        class132 var5 = class82.field1154.method2121(this.field2051 & 65535, true);
        if (arg1 != 31) {
            this.method402((class162) null, 33);
        }
        class35 var6;
        class35 var7;
        if (!this.field2037) {
            if (~this.field2034 > -4) {
                var6 = class19.field195[this.field2034 - -1];
            } else {
                var6 = null;
            }
            var7 = class19.field195[this.field2034];
        } else {
            var7 = class364.field5058[this.field2034];
            var6 = class19.field195[0];
        }
        return var5.method860(super.field2545, var7, super.field2544, 22, arg3, this.field2048, 7, arg0, super.field2543, var6, arg2);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lqa;Lpk;IIIIZIZ)V", line = 215)
    public class143(class162 arg0, class132 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field1823, arg1.field1884);
        this.field2037 = arg6;
        super.field2543 = arg5;
        this.field2051 = (short) arg1.field1866;
        this.field2048 = (byte) arg7;
        this.field2044 = ~arg1.field1850 != -1 && !arg6;
        this.field2055 = arg8;
        super.field2545 = arg3;
        this.field2034 = (byte) arg2;
        this.field2047 = arg0.method485() && arg1.field1891 && !this.field2037 && class437.field6374.method1765(class278.field3761, (byte) -101) != 0;
        int var10 = 2048;
        if (this.field2055) {
            var10 |= 65536;
        }
        class60 var11 = this.method923(this.field2047, (byte) 31, var10, arg0);
        if (var11 != null) {
            this.field2050 = var11.field801;
            this.field2056 = var11.field803;
            if (this.field2055) {
                this.field2056 = this.field2056.method761((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lqa;III)Z", line = 247)
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 24130) {
            return false;
        } else {
            ++field2039;
            class121 var5 = this.method921(arg0, (byte) 116, 131072);
            if (var5 != null) {
                class415 var6 = arg0.method539();
                var6.method340(super.field2545, super.field2544, super.field2543);
                return var5.method777(arg1, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)I", line = 269)
    public final int method359(byte arg0) {
        ++field2045;
        if (arg0 != -8) {
            this.method358(-28, -99, (class162) null);
        }
        return this.field2048;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z", line = 288)
    public final boolean method360(int arg0) {
        ++field2038;
        if (arg0 <= 34) {
            method922((class397) null, -59, (class126) null, (Canvas) null, -16, 102);
        }
        return this.field2047;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lqa;I)Lip;", line = 299)
    public final class498 method402(class162 arg0, int arg1) {
        ++field2041;
        if (this.field2056 == null) {
            return null;
        } else if (arg1 != 16562) {
            return null;
        } else {
            class415 var3 = arg0.method539();
            var3.method340(super.field2545, super.field2544, super.field2543);
            class498 var4 = null;
            if (this.field2044) {
                var4 = class227.method1338(0, 1);
            }
            this.field2056.method781(var3, var4 != null ? var4.field7332[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V", line = 326)
    public static final void method924(int arg0, byte arg1) {
        ++field2049;
        if (class478.method2809(arg0, false)) {
            if (arg1 == -92) {
                class264.method1528(-1, class522.field7701[arg0], -1);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILqa;)Lc;", line = 343)
    public final class121 method358(int arg0, int arg1, class162 arg2) {
        ++field2035;
        if (arg0 != 4586) {
            this.field2037 = true;
        }
        return this.method921(arg2, (byte) -118, arg1);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(ILqa;)V", line = 354)
    public final void method400(int arg0, class162 arg1) {
        ++field2060;
        int var3 = -37 / ((arg0 - -29) / 33);
    }
}
