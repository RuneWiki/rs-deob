import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class700 extends class72 {

    @OriginalMember(owner = "client!waa", name = "m", descriptor = "D")
    public static double field9832;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
    public static int field9827;

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
    public static int field9829;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
    public static int field9830;

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!waa", name = "n", descriptor = "I")
    public static int field9833;

    @OriginalMember(owner = "client!waa", name = "o", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!waa", name = "p", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!waa", name = "q", descriptor = "I")
    public static int field9836;

    @OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
    public static int field9838;

    @OriginalMember(owner = "client!waa", name = "t", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!waa", name = "u", descriptor = "I")
    public static int field9840;

    @OriginalMember(owner = "client!waa", name = "r", descriptor = "Leq;")
    public static class209 field9837;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "(I)V")
    public static void method3932(int arg0) {
        if (arg0 != -7697) {
            method3934(false);
        }
        field9837 = null;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (arg0 < 30) {
            field9834 = -116;
        }
        ++field9836;
        if (super.field1282 != 1 && super.field1282 != 0) {
            super.field1282 = this.method60(-3271);
        }
    }

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "(I)I")
    public final int method3933(int arg0) {
        ++field9827;
        if (arg0 != 27669) {
            method3935(false);
        }
        return super.field1282;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)V")
    public static final void method3934(boolean arg0) {
        if (arg0) {
            method3938(true);
        }
        if (~class749.field10463 <= -1) {
            long var1 = class742.method4128(1);
            class749.field10463 = (int) ((long) class749.field10463 - (-class275.field3910 + var1));
            if (~class749.field10463 >= -1) {
                class427.field5966 = class662.field9313.field2315;
                class385.field5381 = class662.field9313.field2319;
                class420.field5907 = class662.field9313.field2325;
                class478.field6821 = class662.field9313.field2313;
                class174.field2527 = class662.field9313.field2328;
                class22.field277 = class662.field9313.field2311;
                class360.field5051 = class662.field9313.field2322;
                class444.field6172 = class662.field9313.field2318;
                class269.field3876 = class662.field9313.field2314;
                class749.field10463 = -1;
                class118.field1858 = class662.field9313.field2327;
            } else {
                int var3 = (class749.field10463 << 8) / class436.field6101;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class269.field3876 = (-16711936 & (class84.field1534 & 16711935) * var3 + (16711935 & class662.field9313.field2314) * var4) - -((65280 & class84.field1534) * var3 + (65280 & class662.field9313.field2314) * var4 & 16711680) >>> 8;
                class118.field1858 = (-class184.field2627 + class662.field9313.field2327) * var6 + class184.field2627;
                class174.field2527 = (class662.field9313.field2328 - class746.field10442) * var6 + class746.field10442;
                class444.field6172 = (class662.field9313.field2318 - class578.field8174) * var6 + class578.field8174;
                class478.field6821 = (-class191.field2746 + class662.field9313.field2313) * var6 + class191.field2746;
                class420.field5907 = class96.field1657 * var3 + class662.field9313.field2325 * var4 >> 8;
                class360.field5051 = (16711680 & (class624.field8973 & 65280) * var3 - -((class662.field9313.field2322 & 65280) * var4)) + ((class624.field8973 & 16711935) * var3 + (class662.field9313.field2322 & 16711935) * var4 & -16711936) >>> 8;
                class427.field5966 = (class662.field9313.field2315 - class66.field1188) * var6 + class66.field1188;
                class22.field277 = (class662.field9313.field2311 - class208.field2994) * var6 + class208.field2994;
                if (class246.field3459 != class662.field9313.field2319) {
                    class385.field5381 = class532.field7530.method571(class246.field3459, class662.field9313.field2319, var6, class385.field5381);
                }
            }
            class275.field3910 = var1;
        }
        ++field9835;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        ++field9839;
        if (arg1 != 3) {
            method3938(true);
        }
        super.field1282 = arg0;
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        ++field9830;
        return arg0 != -3271 ? -59 : 1;
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(Z)V")
    public static final void method3935(boolean arg0) {
        if (arg0) {
            method3935(false);
        }
        ++field9829;
        if (!class277.field3913) {
            class277.field3913 = true;
            class674.field9471 = true;
            class15.field190 += (-class15.field190 + 12.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(JILha;)V")
    public static final void method3936(long arg0, int arg1, class58 arg2) {
        class674.field9467 = class20.field260;
        if (arg1 == 3259) {
            ++field9831;
            class414.field5756 = 0;
            class449.field6222 = 0;
            class20.field260 = 0;
            long var4 = class742.method4128(1);
            for (class753 var6 = (class753) class460.field6633.method4159(0); var6 != null; var6 = (class753) class460.field6633.method4151(arg1 ^ 3260)) {
                if (var6.method4174(arg2, arg0)) {
                    ++class414.field5756;
                }
            }
            if (class628.field9027 && ~(arg0 % 100L) == -1L) {
                System.out.println("Particle system count: " + class460.field6633.method4158(-114) + ", running: " + class414.field5756);
                System.out.println("Emitters: " + class449.field6222 + " Particles: " + class20.field260 + ". Time taken: " + (-var4 + class742.method4128(1)) + "ms");
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        ++field9838;
        if (arg1 != 11260) {
            this.method55(-97);
        }
        return 1;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lak;I)I")
    public static final int method3937(class349 arg0, int arg1) {
        ++field9828;
        int var2 = arg0.field4909;
        class500 var3 = arg0.method464((byte) 11);
        if (arg0.field939 != -1 && !arg0.field886) {
            if (~arg0.field939 != ~var3.field7116 && arg0.field939 != var3.field7155 && ~arg0.field939 != ~var3.field7142 && ~arg0.field939 != ~var3.field7108) {
                if (~arg0.field939 == ~var3.field7136 || ~arg0.field939 == ~var3.field7157 || arg0.field939 == var3.field7139 || arg0.field939 == var3.field7149) {
                    var2 = arg0.field4898;
                }
            } else {
                var2 = arg0.field4904;
            }
        } else {
            var2 = arg0.field4938;
        }
        if (arg1 != 0) {
            field9832 = 1.06487271037885D;
        }
        return var2;
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(ILcq;)V")
    public class700(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(Z)V")
    public static final void method3938(boolean arg0) {
        ++field9833;
        class575.field8148.method4204((byte) -41);
        class322.field4579.method1199(arg0);
        class146.field2237.method1199(arg0);
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lcq;)V")
    public class700(class464 arg0) {
        super(arg0);
    }
}
