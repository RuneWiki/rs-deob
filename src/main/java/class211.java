import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class211 extends class522 implements class351 {

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "S")
    private short field3075;

    @OriginalMember(owner = "client!fp", name = "X", descriptor = "Z")
    private boolean field3089;

    @OriginalMember(owner = "client!fp", name = "P", descriptor = "B")
    private byte field3081;

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "B")
    private byte field3071;

    @OriginalMember(owner = "client!fp", name = "S", descriptor = "B")
    private byte field3084;

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "Z")
    private boolean field3069;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "Z")
    private boolean field3065;

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "Lc;")
    private class121 field3072;

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "Lj;")
    private class377 field3074;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "Lgo;")
    public static class441 field3078 = new class441(2, 4, 4, 0);

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!fp", name = "B", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!fp", name = "N", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!fp", name = "O", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!fp", name = "Q", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!fp", name = "R", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!fp", name = "T", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!fp", name = "U", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!fp", name = "V", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!fp", name = "W", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!fp", name = "Y", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!fp", name = "Z", descriptor = "Ljava/lang/Object;")
    public static Object field3091;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)V", line = 6)
    public static void method1477(int arg0) {
        field3091 = null;
        field3078 = null;
        if (arg0 != 18) {
            field3085 = 66;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILqa;)V", line = 17)
    public final void method11(int arg0, class162 arg1) {
        ++field3087;
        Object var3 = null;
        class377 var5;
        if (this.field3074 == null && this.field3065) {
            class266 var4 = this.method1478(-1, 262144, true, arg1);
            var5 = var4 != null ? var4.field3889 : null;
        } else {
            var5 = this.field3074;
            this.field3074 = null;
        }
        if (var5 != null) {
            class429.method2564(var5, this.field3084, super.field7731, super.field7734, (boolean[]) null);
        }
        if (arg0 > -107) {
            field3091 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIZLqa;)Llp;", line = 48)
    private final class266 method1478(int arg0, int arg1, boolean arg2, class162 arg3) {
        ++field3073;
        class519 var5 = class252.field3743.method2686(65535 & this.field3075, (byte) 119);
        if (arg0 != -1) {
            this.field3065 = true;
        }
        class35 var6;
        class35 var7;
        if (this.field3069) {
            var6 = class31.field335[this.field3084];
            var7 = class307.field4415[0];
        } else {
            var6 = class307.field4415[this.field3084];
            if (~this.field3084 <= -4) {
                var7 = null;
            } else {
                var7 = class307.field4415[this.field3084 - -1];
            }
        }
        return var5.method3060(this.field3081, this.field3071, super.field7734, arg2, arg1, var6, super.field7738, arg3, super.field7731, var7, arg0 + 76);
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(B)Z", line = 79)
    public final boolean method7(byte arg0) {
        if (arg0 <= 1) {
            this.field3065 = true;
        }
        ++field3077;
        return this.field3065;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)I", line = 92)
    public final int method17(int arg0) {
        ++field3082;
        int var2 = -65 / ((-41 - arg0) / 61);
        return this.field3071;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(ILqa;)Lnf;", line = 102)
    public final class405 method12(int arg0, class162 arg1) {
        ++field3080;
        if (arg0 < 120) {
            return null;
        } else if (this.field3072 == null) {
            return null;
        } else {
            class414 var3 = arg1.method1115();
            var3.method913(super.field7731 + super.field7726, super.field7738, super.field7735 + super.field7734);
            class405 var4 = null;
            if (this.field3089) {
                var4 = class75.method427(1, 0);
            }
            this.field3072.method720(var3, var4 == null ? null : var4.field6108[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLqa;)V", line = 130)
    public final void method10(byte arg0, class162 arg1) {
        ++field3070;
        if (arg0 != -32) {
            this.method1478(58, -4, false, (class162) null);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IILqa;)Lc;", line = 140)
    private final class121 method1479(int arg0, int arg1, class162 arg2) {
        ++field3064;
        if (this.field3072 != null && ~arg2.method1122(this.field3072.method738(), arg0) == -1) {
            return this.field3072;
        } else {
            if (arg1 != 18) {
                this.field3075 = -74;
            }
            class266 var4 = this.method1478(arg1 ^ -19, arg0, false, arg2);
            return var4 == null ? null : var4.field3890;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILqa;I)Lc;", line = 161)
    public final class121 method9(int arg0, class162 arg1, int arg2) {
        ++field3066;
        return arg2 > -22 ? null : this.method1479(arg0, 18, arg1);
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lqa;Lkn;IIIIZIIIII)V", line = 175)
    public class211(class162 arg0, class519 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class1.method1(76, arg11, arg10));
        this.field3075 = (short) arg1.field7580;
        this.field3089 = ~arg1.field7573 != -1 && !arg6;
        this.field3081 = (byte) arg10;
        super.field7734 = arg5;
        this.field3071 = (byte) arg11;
        this.field3084 = (byte) arg2;
        this.field3069 = arg6;
        super.field7731 = arg3;
        this.field3065 = arg0.method1091() && arg1.field7628 && !this.field3069 && class426.field6401.method393(class170.field2529, 1) != 0;
        class266 var13 = this.method1478(-1, 2048, this.field3065, arg0);
        if (var13 != null) {
            this.field3072 = var13.field3890;
            this.field3074 = var13.field3889;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIILic;IIZ)V", line = 200)
    public static final void method1480(int arg0, int arg1, int arg2, class491 arg3, int arg4, int arg5, boolean arg6) {
        class88.field1343 = arg1;
        class150.field2232 = 1;
        class23.field239 = arg6;
        ++field3083;
        class237.field3495 = arg2;
        class197.field2869 = arg3;
        class146.field2162 = arg4;
        class107.field1546 = arg5;
        if (arg0 != 1) {
            field3078 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)I", line = 219)
    public final int method5(byte arg0) {
        ++field3088;
        if (arg0 != -65) {
            this.method17(79);
        }
        return this.field3081;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lme;IIIIIILme;II)V", line = 237)
    public static final void method1481(class129 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class129 arg7, int arg8, int arg9) {
        ++field3068;
        int var10 = arg0.method852((byte) 75);
        if (var10 != -1) {
            Object var11 = null;
            class529 var12 = (class529) class43.field670.method1536((long) var10, 0);
            if (arg5 <= 70) {
                field3091 = null;
            }
            if (var12 == null) {
                class408[] var13 = class408.method2460(class6.field81, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class348.field5015.method1030(var13[0], true);
                class43.field670.method1542(var12, (byte) 112, (long) var10);
            }
            class43.method267(arg2, arg6 >> 1, arg4, 0, 64 * arg7.method847(-1), 0, arg9 >> 1, arg7.field1769, arg7.field1768, arg7.field1763);
            int var14 = arg8 - -class158.field2321[0] + -18;
            int var15 = arg3 / 4 * 18 + var14;
            int var16 = arg1 + -16 + class158.field2321[1] + -54;
            int var17 = arg3 % 4 * 18 + var16;
            var12.method3121(var15, var17);
            if (arg0 == arg7) {
                class348.field5015.method1045(var15 + -1, var17 + -1, 18, 1, 18, -256);
            }
            class229 var18 = class513.method3028(29);
            var18.field3419 = var15 + 16;
            var18.field3420 = arg0;
            var18.field3416 = var17 + 16;
            var18.field3410 = var15;
            var18.field3422 = var17;
            class230.field3442.method1878(2, var18);
        }
    }

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "(B)I", line = 293)
    public final int method1177(byte arg0) {
        if (arg0 <= 10) {
            this.field3065 = false;
        }
        ++field3090;
        return this.field3072 == null ? 0 : this.field3072.method709();
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lqa;B)V", line = 304)
    public final void method14(class162 arg0, byte arg1) {
        if (arg1 == 72) {
            ++field3079;
            Object var3 = null;
            class377 var5;
            if (this.field3074 == null && this.field3065) {
                class266 var4 = this.method1478(-1, 262144, true, arg0);
                var5 = var4 == null ? null : var4.field3889;
            } else {
                var5 = this.field3074;
                this.field3074 = null;
            }
            if (var5 != null) {
                class342.method2091(var5, this.field3084, super.field7731, super.field7734, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)I", line = 333)
    public final int method20(int arg0) {
        if (arg0 != -30685) {
            this.field3081 = 41;
        }
        ++field3086;
        return this.field3075 & 65535;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V", line = 346)
    public final void method15(byte arg0) {
        ++field3067;
        if (this.field3072 != null) {
            this.field3072.method721();
        }
        if (arg0 >= -10) {
            this.method12(-63, (class162) null);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IILqa;B)Z", line = 363)
    public final boolean method8(int arg0, int arg1, class162 arg2, byte arg3) {
        ++field3076;
        class121 var5 = this.method1479(131072, 18, arg2);
        int var6 = -125 % ((-12 - arg3) / 36);
        if (var5 != null) {
            class414 var7 = arg2.method1115();
            var7.method913(super.field7731, super.field7738, super.field7734);
            return var5.method706(arg0, arg1, var7, false);
        } else {
            return false;
        }
    }
}
