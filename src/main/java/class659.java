import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class659 extends class38 {

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    private int field9226 = 4;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    private int field9229 = 4;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "D")
    public static double field9225;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II[F)[F")
    public static final float[] method3803(int arg0, int arg1, float[] arg2) {
        ++field9224;
        float[] var3 = new float[arg0];
        if (arg1 != -31948) {
            return null;
        } else {
            class319.method2018(arg2, 0, var3, 0, arg0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field9229 = arg2.method3745(-6314);
            }
        } else {
            this.field9226 = arg2.method3745(-6314);
        }
        if (arg0 < 34) {
            method3803(-20, 99, (float[]) null);
        }
        ++field9223;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(BI)Z")
    public static final boolean method3804(byte arg0, int arg1) {
        int var2 = 20 % ((arg0 - -63) / 37);
        ++field9231;
        return ~arg1 == -8 || ~arg1 == -10;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        if (arg0 >= -43) {
            return null;
        } else {
            ++field9228;
            int[] var3 = super.field397.method1376(arg1, (byte) 110);
            if (super.field397.field3005) {
                int var4 = class729.field10216 / this.field9226;
                int var5 = class632.field8852 / this.field9229;
                int[] var7;
                if (~var5 < -1) {
                    int var6 = arg1 % var5;
                    var7 = this.method189(class632.field8852 * var6 / var5, 0, (byte) -92);
                } else {
                    var7 = this.method189(0, 0, (byte) -92);
                }
                for (int var8 = 0; ~class729.field10216 < ~var8; ++var8) {
                    if (var4 > 0) {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class729.field10216 * var9 / var4];
                    } else {
                        var3[var8] = var7[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[[I")
    public final int[][] method196(int arg0, int arg1) {
        if (arg0 != -18210) {
            this.method196(-9, -16);
        }
        ++field9227;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (super.field387.field6792) {
            int var4 = class729.field10216 / this.field9226;
            int var5 = class632.field8852 / this.field9229;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method195(true, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method195(true, 0, class632.field8852 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class729.field10216; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class729.field10216 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class659() {
        super(1, false);
    }
}
