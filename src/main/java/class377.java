import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class377 extends class30 {

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "[I")
    public static int[] field5031 = new int[1000];

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "Llh;")
    public static class487 field5033 = new class487(72, 3);

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "Lvn;")
    public static class283 field5030;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field5032;
        if (arg1 != 7) {
            method2160(41);
        }
        int[][] var3 = super.field377.method3683(arg0, (byte) 120);
        if (super.field377.field9085) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class31.field399 < ~var7; ++var7) {
                this.method2158(var7, arg0, -12113);
                int[][] var8 = this.method292(arg1 ^ 92, 0, class279.field3825);
                var4[var7] = var8[0][class44.field540];
                var5[var7] = var8[1][class44.field540];
                var6[var7] = var8[2][class44.field540];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class377() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        ++field5035;
        if (arg0 <= 100) {
            method2160(35);
        }
        if (arg1 == 0) {
            super.field378 = ~arg2.method2874((byte) -75) == -2;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V")
    public static void method2157(byte arg0) {
        field5030 = null;
        if (arg0 >= 2) {
            field5033 = null;
            field5031 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)V")
    private final void method2158(int arg0, int arg1, int arg2) {
        ++field5036;
        int var4 = class48.field568[arg0];
        int var5 = class430.field6016[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class44.field540 = arg0;
            class279.field3825 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class279.field3825 = arg0;
            class44.field540 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class44.field540 = class31.field399 - arg1;
            class279.field3825 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class44.field540 = arg0;
            class279.field3825 = class148.field2197 - arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class44.field540 = class31.field399 - arg0;
            class279.field3825 = class148.field2197 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class279.field3825 = -arg0 + class148.field2197;
            class44.field540 = -arg1 + class31.field399;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class279.field3825 = -arg0 + class148.field2197;
            class44.field540 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class279.field3825 = arg1;
            class44.field540 = -arg0 + class31.field399;
        }
        class279.field3825 &= class649.field9002;
        class44.field540 &= class353.field4694;
        if (arg2 != -12113) {
            method2160(23);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field5034;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            for (int var4 = 0; var4 < class31.field399; ++var4) {
                this.method2158(var4, arg1, arg0 + -12114);
                int[] var5 = this.method294(class279.field3825, 0, (byte) 111);
                var3[var4] = var5[class44.field540];
            }
        }
        if (arg0 != 1) {
            field5031 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
    public static final void method2159(boolean arg0) {
        if (!arg0) {
            for (int var1 = 0; var1 < 5; ++var1) {
                class524.field7115[var1] = false;
            }
            ++field5037;
            class560.field7547 = -1;
            class199.field2832 = -1;
            class133.field1902 = 0;
            class366.field4864 = 0;
            class203.field2863 = 1;
            class552.field7454 = -1;
            class412.field5849 = -1;
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V")
    public static final void method2160(int arg0) {
        ++class34.field420;
        ++field5029;
        if (arg0 < 65) {
            method2159(false);
        }
        class352 var1 = class290.method1786(98, class199.field2836, class354.field4701);
        var1.field4686.method2817(0, true);
        class602.method3388(var1, (byte) 28);
    }
}
