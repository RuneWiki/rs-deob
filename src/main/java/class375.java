import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class375 extends class34 {

    @OriginalMember(owner = "client!kn", name = "D", descriptor = "I")
    public static int field5387 = 100;

    @OriginalMember(owner = "client!kn", name = "G", descriptor = "Z")
    public static boolean field5390 = false;

    @OriginalMember(owner = "client!kn", name = "K", descriptor = "Z")
    public static boolean field5394 = false;

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "Ldp;")
    public static class346 field5395 = null;

    @OriginalMember(owner = "client!kn", name = "J", descriptor = "Lhi;")
    public static class45 field5393 = new class45(29, 11);

    @OriginalMember(owner = "client!kn", name = "C", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!kn", name = "E", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!kn", name = "F", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!kn", name = "H", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!kn", name = "I", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IB)[I", line = 8)
    public final int[] method64(int arg0, byte arg1) {
        ++field5388;
        int var3 = 46 / (arg1 / 50);
        int[] var4 = super.field537.method1780(arg0, (byte) 26);
        if (super.field537.field4191) {
            int[] var5 = this.method252(false, arg0, 0);
            for (int var6 = 0; var6 < class383.field5502; ++var6) {
                var4[var6] = -var5[var6] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)I", line = 40)
    public static int method2245(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)V", line = 48)
    public static void method2246(int arg0) {
        field5393 = null;
        field5395 = null;
        if (arg0 <= 60) {
            method2248(-94, -61);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII[FIIIIF)V", line = 63)
    public static final void method2247(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, int arg8, float arg9) {
        int var10 = arg3 - arg2;
        ++field5397;
        int var11 = arg1 - arg0;
        int var12 = arg8 - arg6;
        float var13 = arg4[2] * (float) var12 + arg4[arg7] * (float) var10 + arg4[0] * (float) var11;
        float var14 = arg4[5] * (float) var12 + arg4[3] * (float) var11 + arg4[4] * (float) var10;
        float var15 = arg4[8] * (float) var12 + arg4[6] * (float) var11 + arg4[7] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg9 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg5 != 1) {
            if (arg5 != 2) {
                if (~arg5 == -4) {
                    float var19 = var17;
                    var17 = var18;
                    var18 = -var19;
                }
            } else {
                var18 = -var18;
                var17 = -var17;
            }
        } else {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        }
        class5.field76 = var18;
        class236.field3272 = var17;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V", line = 115)
    public class375() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)Z", line = 119)
    public static final boolean method2248(int arg0, int arg1) {
        if (arg0 != 6) {
            return false;
        } else {
            ++field5392;
            return arg1 == 6 || ~arg1 == -9;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lsv;II)V", line = 131)
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field5396;
        if (arg2 == 0) {
            super.field533 = ~arg0.method1869(-94) == -2;
        }
        if (arg1 < 16) {
            this.method69((class319) null, -10, -53);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BI)[[I", line = 150)
    public final int[][] method66(byte arg0, int arg1) {
        if (arg0 != -11) {
            method2246(-54);
        }
        ++field5389;
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (super.field536.field726) {
            int[][] var4 = this.method254(0, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class383.field5502 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }
}
