import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class366 extends class513 {

    @OriginalMember(owner = "client!ija", name = "G", descriptor = "I")
    private int field4970;

    @OriginalMember(owner = "client!ija", name = "F", descriptor = "Lvl;")
    public static class15 field4969 = new class15(61, 3);

    @OriginalMember(owner = "client!ija", name = "I", descriptor = "I")
    public static int field4972 = 0;

    @OriginalMember(owner = "client!ija", name = "v", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!ija", name = "w", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!ija", name = "x", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!ija", name = "y", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!ija", name = "z", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!ija", name = "B", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!ija", name = "D", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!ija", name = "E", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!ija", name = "H", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!ija", name = "A", descriptor = "[Lg;")
    public class167[] field4964;

    @OriginalMember(owner = "client!ija", name = "C", descriptor = "[[B")
    private byte[][] field4966;

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(B)Z")
    public final boolean method2230(byte arg0) {
        field4960++;
        if (this.field4964 != null) {
            return true;
        }
        if (this.field4966 == null) {
            class662 var2 = class276.field3829;
            synchronized (class276.field3829) {
                if (!class276.field3829.method3751(this.field4970, 126)) {
                    return false;
                }
                int[] var4 = class276.field3829.method3740(16, this.field4970);
                this.field4966 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field4966[var5] = class276.field3829.method3732(var4[var5], 8906, this.field4970);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field4966.length; var7++) {
            byte[] var8 = this.field4966[var7];
            class93 var9 = new class93(var8);
            var9.field1442 = 1;
            int var10 = var9.method763(118);
            class662 var11 = class769.field10609;
            synchronized (class769.field10609) {
                var6 &= class769.field10609.method3737(var10, false);
            }
        }
        if (!var6) {
            return false;
        }
        int var12 = 5 / ((60 - arg0) / 35);
        class645 var13 = new class645();
        class662 var14 = class276.field3829;
        int[] var16;
        synchronized (class276.field3829) {
            int var15 = class276.field3829.method3730((byte) -102, this.field4970);
            this.field4964 = new class167[var15];
            var16 = class276.field3829.method3740(16, this.field4970);
        }
        for (int var17 = 0; var17 < var16.length; var17++) {
            byte[] var18 = this.field4966[var17];
            class93 var19 = new class93(var18);
            var19.field1442 = 1;
            int var20 = var19.method763(81);
            class38 var21 = null;
            for (class38 var22 = (class38) var13.method3589((byte) -127); var22 != null; var22 = (class38) var13.method3591(0)) {
                if (var22.field637 == var20) {
                    var21 = var22;
                    break;
                }
            }
            if (var21 == null) {
                class662 var23 = class769.field10609;
                synchronized (class769.field10609) {
                    var21 = new class38(var20, class769.field10609.method3742(5, var20));
                }
                var13.method3594((byte) -47, var21);
            }
            this.field4964[var16[var17]] = new class167(var18, var21);
        }
        this.field4966 = null;
        return true;
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(II)Z")
    public final boolean method2231(int arg0, int arg1) {
        field4968++;
        if (arg0 <= 53) {
            method2235(false);
        }
        return this.field4964[arg1].field2692;
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(I)V")
    public static final void method2232(int arg0) {
        int var1 = 48 % ((arg0 + 57) / 52);
        field4959++;
        class561.field7952.method3590((byte) -123);
        class741.field10226 = 0;
    }

    @OriginalMember(owner = "client!ija", name = "f", descriptor = "(I)Z")
    public static final boolean method2233(int arg0) {
        field4962++;
        if (class753.field10398 < 1) {
            return false;
        } else {
            if (arg0 != -15233) {
                field4969 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(ILha;)V")
    public static final void method2234(int arg0, class66 arg1) {
        class555.field7842 = class739.method4093(arg0 - 33493, class181.field2834, arg1, true);
        field4965++;
        if (arg0 != 22473) {
            method2234(-18, null);
        }
        class440.field5967 = class95.method806(arg1, (byte) -124, class181.field2834);
        class359.field4908 = class739.method4093(-11020, class673.field9341, arg1, true);
        class16.field239 = class95.method806(arg1, (byte) 44, class673.field9341);
        class557.field7861 = class739.method4093(-11020, class684.field9515, arg1, true);
        class333.field4511 = class95.method806(arg1, (byte) -125, class684.field9515);
    }

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "(Z)V")
    public static void method2235(boolean arg0) {
        if (arg0) {
            field4969 = null;
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(IB)Z")
    public final boolean method2236(int arg0, byte arg1) {
        field4967++;
        int var3 = 28 % ((1 - arg1) / 58);
        return this.field4964[arg0].field2691;
    }

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "(III)Z")
    public static final boolean method2237(int arg0, int arg1, int arg2) {
        field4963++;
        if (arg2 > -33) {
            method2237(119, -18, -7);
        }
        return class528.method3002(-28825, arg1, arg0) || class4.method23(arg1, false, arg0);
    }

    @OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(I)V")
    public class366(int arg0) {
        this.field4970 = arg0;
    }

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "(II)Z")
    public final boolean method2238(int arg0, int arg1) {
        field4961++;
        return arg1 == 0 ? this.field4964[arg0].field2696 : true;
    }
}
