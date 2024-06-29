import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class70 extends class4 {

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    private int field922 = 4;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    private int field924 = 4;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "Z")
    public static boolean field921;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "[Lkd;")
    public static class494[] field918;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 >= -83) {
            method401(71, (class329) null, (class329) null, (class329) null, (class329) null);
        }
        ++field917;
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (super.field38.field7618) {
            int var4 = class132.field1627 / this.field924;
            int var5 = class620.field8925 / this.field922;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method22(0, (byte) -100, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method22(class620.field8925 * var7 / var5, (byte) -76, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class132.field1627; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class132.field1627 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method400(String arg0, int arg1) {
        ++field926;
        if (!class279.field3649.startsWith("win")) {
            if (!class279.field3649.startsWith("linux")) {
                if (class279.field3649.startsWith("mac")) {
                    return "lib" + arg0 + ".jnilib";
                } else {
                    if (arg1 != 31273) {
                        method401(-32, (class329) null, (class329) null, (class329) null, (class329) null);
                    }
                    return null;
                }
            } else {
                return "lib" + arg0 + ".so";
            }
        } else {
            return arg0 + ".dll";
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field925;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field922 = arg1.method3045(-127);
            }
        } else {
            this.field924 = arg1.method3045(-128);
        }
        if (arg0 > -89) {
            this.method15((byte) 120, -49);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILkr;Lkr;Lkr;Lkr;)V")
    public static final void method401(int arg0, class329 arg1, class329 arg2, class329 arg3, class329 arg4) {
        class594.field8576 = arg4;
        class358.field5000 = arg1;
        class16.field170 = arg2;
        ++field923;
        class296.field3844 = arg3;
        class508.field7087 = new class447[class296.field3844.method2046((byte) 64)][];
        if (arg0 != 19498) {
            field918 = null;
        }
        class71.field965 = new boolean[class296.field3844.method2046((byte) 64)];
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class70() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IFIIIII[FII)V")
    public static final void method402(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, int arg9) {
        int var10 = arg6 - arg3;
        ++field919;
        int var11 = arg2 - arg0;
        int var12 = arg5 - arg8;
        float var13 = arg7[2] * (float) var11 + arg7[arg4] * (float) var10 + arg7[1] * (float) var12;
        float var14 = arg7[5] * (float) var11 + arg7[4] * (float) var12 + arg7[3] * (float) var10;
        float var15 = arg7[8] * (float) var11 + arg7[7] * (float) var12 + arg7[6] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = 0.5F + (float) Math.atan2((double) var13, (double) var15) / 6.2831855F;
        float var18 = 0.5F + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg1;
        if (~arg9 != -2) {
            if (~arg9 == -3) {
                var18 = -var18;
                var17 = -var17;
            } else if (arg9 == 3) {
                float var19 = var17;
                var17 = var18;
                var18 = -var19;
            }
        } else {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        }
        class447.field6326 = var17;
        class50.field676 = var18;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field920;
        int[] var3 = super.field31.method2252(arg1, 11);
        if (arg0 != 10) {
            this.field922 = 75;
        }
        if (super.field31.field5127) {
            int var4 = class132.field1627 / this.field924;
            int var5 = class620.field8925 / this.field922;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method20(0, arg0 ^ -21996, class620.field8925 * var6 / var5);
            } else {
                var7 = this.method20(0, -21986, 0);
            }
            for (int var8 = 0; var8 < class132.field1627; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class132.field1627 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public static void method403(boolean arg0) {
        if (arg0) {
            field918 = null;
        }
    }
}
