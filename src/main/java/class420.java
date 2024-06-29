import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class420 {

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lco;")
    private class210 field6056 = new class210(64);

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Lco;")
    public class210 field6065 = new class210(50);

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Lco;")
    public class210 field6066 = new class210(5);

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lg;")
    private class470 field6052;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Z")
    public boolean field6061;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Lg;")
    public class470 field6063;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public int field6047;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lid;")
    public static class260 field6049 = new class260(128);

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field6054 = -1;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public int field6067;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lme;")
    public static class390 field6055;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "[I")
    public static int[] field6058;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "[[B")
    public static byte[][] field6064;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public final void method2499(int arg0) {
        field6048++;
        class210 var2 = this.field6065;
        synchronized (this.field6065) {
            this.field6065.method1165((byte) 118);
        }
        if (arg0 == 1631) {
            class210 var3 = this.field6066;
            synchronized (this.field6066) {
                this.field6066.method1165((byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILpe;IIIIIIIZII[II[I)I")
    public static final int method2500(int arg0, class424 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int[] arg12, int arg13, int[] arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class223.field3095[var15][var35] = 0;
                class172.field2071[var15][var35] = 99999999;
            }
        }
        if (arg0 != 128) {
            field6049 = null;
        }
        field6051++;
        boolean var16;
        if (arg10 == 1) {
            var16 = class409.method2429(arg4, arg11, arg8, -1, arg3, arg1, arg13, arg5, arg6, arg7, arg2);
        } else if (arg10 == 2) {
            var16 = class291.method1834(arg5, arg11, arg6, arg7, arg3, -49, arg8, arg1, arg13, arg4, arg2);
        } else {
            var16 = class94.method466(arg6, arg13, arg7, arg10, arg2, arg8, arg4, arg1, 26596, arg11, arg5, arg3);
        }
        int var17 = arg8 - 64;
        int var18 = arg6 - 64;
        int var19 = class312.field4564;
        int var20 = class356.field5113;
        if (!var16) {
            if (!arg9) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg7 - var23; var24 <= arg7 + var23; var24++) {
                for (int var25 = arg13 - var23; var25 <= arg13 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class172.field2071[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg7 > var24) {
                            var28 = arg7 - var24;
                        } else if (arg3 + arg7 - 1 < var24) {
                            var28 = var24 + 1 - arg7 - arg3;
                        }
                        int var29 = 0;
                        if (arg13 > var25) {
                            var29 = arg13 - var25;
                        } else if (var25 > (arg2 + arg13 - 1)) {
                            var29 = var25 + 1 - arg2 - arg13;
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var30 < var21 || var21 == var30 && class172.field2071[var26][var27] < var22) {
                            var19 = var24;
                            var20 = var25;
                            var22 = class172.field2071[var26][var27];
                            var21 = var30;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg8 == var19 && arg6 == var20) {
            return 0;
        }
        byte var31 = 0;
        class334.field4807[var31] = var19;
        int var37 = var31 + 1;
        class413.field5887[var31] = var20;
        int var32;
        int var33 = var32 = class223.field3095[var19 - var17][var20 - var18];
        while (arg8 != var19 || arg6 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class334.field4807[var37] = var19;
                class413.field5887[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class223.field3095[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg12[var34] = class334.field4807[var37];
            arg14[var34++] = class413.field5887[var37];
            if (var34 >= arg12.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final void method2501(int arg0) {
        class210 var2 = this.field6056;
        synchronized (this.field6056) {
            this.field6056.method1165((byte) 118);
        }
        field6050++;
        class210 var3 = this.field6065;
        synchronized (this.field6065) {
            this.field6065.method1165((byte) 118);
        }
        if (arg0 == 0) {
            class210 var4 = this.field6066;
            synchronized (this.field6066) {
                this.field6066.method1165((byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
    public final void method2502(boolean arg0, int arg1) {
        field6053++;
        class210 var3 = this.field6056;
        synchronized (this.field6056) {
            this.field6056.method1166(arg1, (byte) -52);
        }
        class210 var4 = this.field6065;
        synchronized (this.field6065) {
            this.field6065.method1166(arg1, (byte) -52);
        }
        if (arg0) {
            this.field6056 = null;
        }
        class210 var5 = this.field6066;
        synchronized (this.field6066) {
            this.field6066.method1166(arg1, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Z")
    public static final boolean method2503(byte arg0) {
        int var1 = 1 % ((arg0 - 61) / 36);
        field6060++;
        return class375.field5347 == 0 ? class198.field2745 : true;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public static void method2504(int arg0) {
        field6064 = null;
        if (arg0 != 0) {
            field6064 = null;
        }
        field6055 = null;
        field6058 = null;
        field6049 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public final void method2505(int arg0, int arg1) {
        this.field6067 = arg0;
        if (arg1 != -8164) {
            return;
        }
        field6057++;
        class210 var3 = this.field6065;
        synchronized (this.field6065) {
            this.field6065.method1165((byte) 118);
        }
        class210 var4 = this.field6066;
        synchronized (this.field6066) {
            this.field6066.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(ZI)V")
    public final void method2506(boolean arg0, int arg1) {
        field6062++;
        if (arg0 == this.field6061) {
            return;
        }
        this.field6061 = arg0;
        this.method2501(0);
        if (arg1 != -129) {
            field6054 = -57;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Lqs;")
    public final class476 method2507(byte arg0, int arg1) {
        field6046++;
        class210 var3 = this.field6056;
        class476 var4;
        synchronized (this.field6056) {
            var4 = (class476) this.field6056.method1163((byte) 126, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6052.method2768(-20472, class463.method2726((byte) 115, arg1), class421.method2512(8131, arg1));
        class476 var6 = new class476();
        int var7 = 102 % ((-arg0 - 37) / 46);
        var6.field6703 = this;
        var6.field6700 = arg1;
        if (var5 != null) {
            var6.method2818(-1, new class179(var5));
        }
        var6.method2824(-6201);
        class210 var8 = this.field6056;
        synchronized (this.field6056) {
            this.field6056.method1172((long) arg1, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public final void method2508(boolean arg0) {
        class210 var2 = this.field6056;
        synchronized (this.field6056) {
            this.field6056.method1169(1076);
        }
        field6059++;
        class210 var3 = this.field6065;
        synchronized (this.field6065) {
            this.field6065.method1169(1076);
        }
        if (arg0) {
            this.method2501(52);
        }
        class210 var4 = this.field6066;
        synchronized (this.field6066) {
            this.field6066.method1169(1076);
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lci;IZLg;Lg;)V")
    public class420(class421 arg0, int arg1, boolean arg2, class470 arg3, class470 arg4) {
        this.field6052 = arg3;
        this.field6061 = arg2;
        this.field6063 = arg4;
        this.field6047 = arg1;
        if (this.field6052 != null) {
            int var6 = this.field6052.method2756(true) - 1;
            this.field6052.method2755(-95, var6);
        }
    }
}
