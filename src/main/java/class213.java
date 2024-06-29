import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class213 extends class241 implements class248 {

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "B")
    private byte field3046;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "B")
    private byte field3049;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "Z")
    private boolean field3042;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "Z")
    private boolean field3043;

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "S")
    private short field3052;

    @OriginalMember(owner = "client!hs", name = "S", descriptor = "Z")
    private boolean field3069;

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "B")
    private byte field3055;

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "Z")
    private boolean field3062;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "Lj;")
    private class377 field3056;

    @OriginalMember(owner = "client!hs", name = "M", descriptor = "Lc;")
    public class121 field3063;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "[I")
    public static int[] field3044 = new int[99];

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!hs", name = "C", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!hs", name = "N", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!hs", name = "O", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!hs", name = "P", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!hs", name = "Q", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!hs", name = "R", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!hs", name = "T", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!hs", name = "U", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!hs", name = "V", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!hs", name = "W", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)V")
    public final void method22(byte arg0) {
        this.field3042 = false;
        if (arg0 == -3) {
            ++field3061;
            if (this.field3063 != null) {
                this.field3063.method906(-65537 & this.field3063.method889());
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILqa;)V")
    public final void method15(int arg0, class162 arg1) {
        ++field3057;
        Object var3 = null;
        class377 var5;
        if (this.field3056 == null && this.field3062) {
            class95 var4 = this.method1427((byte) -31, true, 262144, arg1);
            var5 = var4 != null ? var4.field1602 : null;
        } else {
            var5 = this.field3056;
            this.field3056 = null;
        }
        if (arg0 != -13300) {
            method1424((byte) 121);
        }
        if (var5 != null) {
            class254.method1633(var5, this.field3046, super.field3480, super.field3474, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILqa;I)Lc;")
    private final class121 method1423(int arg0, class162 arg1, int arg2) {
        ++field3066;
        if (this.field3063 != null && arg1.method255(this.field3063.method889(), arg0) == 0) {
            return this.field3063;
        } else {
            if (arg2 != -27048) {
                this.method15(88, (class162) null);
            }
            class95 var4 = this.method1427((byte) -31, false, arg0, arg1);
            return var4 != null ? var4.field1606 : null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "(B)V")
    public static void method1424(byte arg0) {
        field3044 = null;
        if (arg0 != 103) {
            method1428(false);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lqa;II)Lc;")
    public final class121 method23(class162 arg0, int arg1, int arg2) {
        ++field3064;
        if (arg1 != 17793) {
            this.field3055 = -31;
        }
        return this.method1423(arg2, arg0, -27048);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        ++field3059;
        class121 var5 = this.method1423(arg0, arg1, -27048);
        if (var5 != null) {
            class414 var6 = arg1.method240();
            var6.method868(super.field3480, super.field3473, super.field3474);
            return var5.method924(arg3, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "(I)V")
    public static final void method1425(int arg0) {
        ++field3058;
        class106.field1773.method1752(arg0);
        class43.field831.method2255(arg0 + 25472);
        class217.field3125.method559(arg0 + 8);
        class319.field4807.method2867((byte) -93);
        class61.field1070.method500(arg0 + -1);
        class367.field5550.method1321(arg0 + -49);
        class431.field6419.method1130(106);
        class140.field2233.method2246((byte) -39);
        class419.field6271.method1392(-3527);
        class255.field3670.method2066((byte) 95);
        class203.field2969.method1241(0);
        class397.field5996.method1187(-14518);
        class160.field2479.method1815((byte) -111);
        class495.field7314.method975(978);
        class162.field2506.method598((byte) 112);
        class519.field7721.method1991((byte) 28);
        class2.field93.method1542(true);
        class511.field7544.method2023(31);
        class500.field7377.method1433(33);
        class365.field5521.method1440(11828);
        class461.method2742(16440);
        class515.method3075(-1);
        class528.method3131(11553);
        class109.method810(2);
        class226.field3221.method484(arg0 + 47);
        class268.field3851.method484(-68);
        class471.field7071.method484(arg0 ^ -77);
        class171.field2647.method484(48);
        class437.field6541.method484(73);
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)Z")
    public final boolean method24(boolean arg0) {
        ++field3065;
        if (arg0) {
            this.method12(120);
        }
        return this.field3042;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLqa;)V")
    public final void method25(byte arg0, class162 arg1) {
        ++field3072;
        int var3 = 24 % ((arg0 - -45) / 48);
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = -2 / ((arg0 - -60) / 40);
        ++field3068;
        return 65535 & this.field3052;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lqa;I)V")
    public final void method9(class162 arg0, int arg1) {
        if (arg1 >= -111) {
            this.method26(119);
        }
        ++field3053;
        Object var3 = null;
        class377 var5;
        if (this.field3056 == null && this.field3062) {
            class95 var4 = this.method1427((byte) -31, true, 262144, arg0);
            var5 = var4 == null ? null : var4.field1602;
        } else {
            var5 = this.field3056;
            this.field3056 = null;
        }
        if (var5 != null) {
            class13.method88(var5, this.field3046, super.field3480, super.field3474, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)I")
    public final int method12(int arg0) {
        ++field3071;
        if (arg0 != 3765) {
            this.method12(106);
        }
        return this.field3049;
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lqa;Lgm;IIIIZIIZ)V")
    public class213(class162 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class162.method1198(126, arg8, arg7));
        this.field3046 = (byte) arg2;
        this.field3049 = (byte) arg7;
        this.field3042 = arg9;
        super.field3474 = arg5;
        this.field3043 = arg6;
        this.field3052 = (short) arg1.field1318;
        super.field3480 = arg3;
        this.field3069 = ~arg1.field1357 != -1 && !arg6;
        this.field3055 = (byte) arg8;
        this.field3062 = arg0.method226() && arg1.field1385 && !this.field3043 && class443.field6623.method338(-4, class169.field2624) != 0;
        int var11 = 2048;
        if (this.field3042) {
            var11 |= 65536;
        }
        class95 var12 = this.method1427((byte) -31, this.field3062, var11, arg0);
        if (var12 != null) {
            this.field3056 = var12.field1602;
            this.field3063 = var12.field1606;
            if (this.field3042) {
                this.field3063 = this.field3063.method938((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZLqa;)Lae;")
    public final class163 method13(boolean arg0, class162 arg1) {
        ++field3067;
        if (this.field3063 == null) {
            return null;
        } else {
            class414 var3 = arg1.method240();
            var3.method868(super.field3480, super.field3473, super.field3474);
            class163 var4 = null;
            if (arg0) {
                return null;
            } else {
                if (this.field3069) {
                    var4 = class483.method2876(1, 0);
                }
                this.field3063.method927(var3, var4 != null ? var4.field2516[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)I")
    public final int method19(byte arg0) {
        ++field3054;
        return arg0 != -69 ? -17 : this.field3055;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        if (arg0 <= 94) {
            this.field3042 = true;
        }
        ++field3050;
        return this.field3062;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIZ)V")
    public static final void method1426(int arg0, int arg1, boolean arg2) {
        int var3 = 30 % ((arg1 - 77) / 44);
        ++field3051;
        class328 var4 = class475.method2847(arg0, arg2, (byte) -36);
        if (var4 != null) {
            var4.method2090(-1);
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
    public final void method26(int arg0) {
        if (this.field3063 != null) {
            this.field3063.method898();
        }
        ++field3048;
        int var2 = 11 / ((-46 - arg0) / 44);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZILqa;)Lmr;")
    private final class95 method1427(byte arg0, boolean arg1, int arg2, class162 arg3) {
        if (arg0 != -31) {
            this.method23((class162) null, 19, -11);
        }
        ++field3070;
        class79 var5 = class319.field4807.method2874(65535 & this.field3052, -17045);
        class35 var6;
        class35 var7;
        if (this.field3043) {
            var6 = class335.field5061[this.field3046];
            var7 = class43.field829[0];
        } else {
            if (~this.field3046 > -4) {
                var7 = class43.field829[this.field3046 - -1];
            } else {
                var7 = null;
            }
            var6 = class43.field829[this.field3046];
        }
        return var5.method625(super.field3480, super.field3474, this.field3055, var7, arg2, arg1, arg3, var6, this.field3049, super.field3473, arg0 + 30);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILqa;ZLto;III)V")
    public final void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6) {
        ++field3047;
        if (!(arg3 instanceof class213)) {
            if (arg3 instanceof class331) {
                class331 var8 = (class331) arg3;
                if (this.field3063 != null && var8.field4995 != null) {
                    this.field3063.method928(var8.field4995, arg0, arg6, arg5, arg2);
                }
            }
        } else {
            class213 var9 = (class213) arg3;
            if (this.field3063 != null && var9.field3063 != null) {
                this.field3063.method928(var9.field3063, arg0, arg6, arg5, arg2);
            }
        }
        if (arg4 != -1) {
            this.method15(49, (class162) null);
        }
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(Z)V")
    public static final void method1428(boolean arg0) {
        class55 var1 = class487.field7215;
        synchronized (class487.field7215) {
            class487.field7215.method488(-3);
        }
        if (!arg0) {
            ++field3060;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 - -1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field3044[var1] = var0 / 4;
        }
    }
}
