import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class451 extends class371 {

    @OriginalMember(owner = "client!te", name = "M", descriptor = "Lqp;")
    public static class586 field6586 = new class586(4, 8);

    @OriginalMember(owner = "client!te", name = "N", descriptor = "[I")
    public static int[] field6587 = new int[25];

    @OriginalMember(owner = "client!te", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field6589 = new String[100];

    @OriginalMember(owner = "client!te", name = "O", descriptor = "Lmh;")
    public static class145 field6588 = new class145("", 15);

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field6590 = "";

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
    public static void method2720(int arg0) {
        field6586 = null;
        if (arg0 >= -68) {
            field6589 = null;
        }
        field6588 = null;
        field6590 = null;
        field6589 = null;
        field6587 = null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        if (arg0 >= -80) {
            this.method79((byte) 89, 96);
        }
        ++field6585;
        int[] var3 = super.field5378.method1451(5, arg1);
        if (super.field5378.field3254) {
            int[] var4 = this.method2260((byte) -57, arg1, 0);
            int[] var5 = this.method2260((byte) -99, arg1, 1);
            int[] var6 = this.method2260((byte) -115, arg1, 2);
            for (int var7 = 0; class41.field455 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        ++field6584;
        if (arg0 != 36) {
            field6586 = null;
        }
        int[][] var3 = super.field5364.method3064(1, arg1);
        if (super.field5364.field7632) {
            int[] var4 = this.method2260((byte) -57, arg1, 2);
            int[][] var5 = this.method2263((byte) -16, 0, arg1);
            int[][] var6 = this.method2263((byte) -102, 1, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class41.field455 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (~var17 != -1) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(FFFI)I")
    public static final int method2721(float arg0, float arg1, float arg2, int arg3) {
        ++field6583;
        float var4 = arg2 < 0.0F ? -arg2 : arg2;
        if (arg3 >= -54) {
            field6586 = null;
        }
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var4 < var5 && var5 > var6) {
            return !(arg1 > 0.0F) ? 1 : 0;
        } else if (var6 > var4 && var6 > var5) {
            return arg0 > 0.0F ? 2 : 3;
        } else {
            return arg2 > 0.0F ? 4 : 5;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class451() {
        super(3, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        if (~arg0 == -1) {
            super.field5360 = arg2.method2561((byte) 108) == 1;
        }
        int var4 = 61 % ((-15 - arg1) / 39);
        ++field6582;
    }
}
