import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class658 extends class470 {

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "[I")
    private int[] field8697 = new int[512];

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "Lkaa;")
    public static class47 field8693 = new class47(26, 2);

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "Z")
    public static boolean field8699 = false;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field8692;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "Lji;")
    public static class610 field8695;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
    public static void method3570(int arg0) {
        field8695 = null;
        if (arg0 == 7) {
            field8693 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)I")
    public static final int method3571(int arg0, int arg1) {
        field8692++;
        if (arg0 != 27690) {
            return 70;
        }
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILha;I[[[BIIIIIIII)V")
    public static final void method3572(int arg0, int arg1, class59 arg2, int arg3, byte[][][] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field8694++;
        if (arg3 == 0 || arg11 == 0) {
            return;
        }
        if (arg3 == 9) {
            arg5 = arg5 + 1 & 0x3;
            arg3 = 1;
        }
        if (arg6 != -18954) {
            method3572(46, -78, null, -29, null, -115, 18, -18, -39, 113, 31, 37, -30);
        }
        if (arg3 == 10) {
            arg3 = 1;
            arg5 = arg5 + 3 & 0x3;
        }
        if (arg3 == 11) {
            arg3 = 8;
            arg5 = arg5 + 3 & 0x3;
        }
        arg2.method430(arg10, arg7, arg8, arg9, arg12, arg1, arg4[arg3 - 1][arg5], arg11, arg0);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lwd;I)I")
    public static final int method3573(class276 arg0, int arg1) {
        field8698++;
        if (arg1 < 32) {
            method3570(-46);
        }
        int var2 = arg0.method1664(2059, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method1664(2059, 5);
        } else if (var2 == 2) {
            var3 = arg0.method1664(2059, 8);
        } else {
            var3 = arg0.method1664(2059, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(I)V")
    public class658(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field8697[var3] = this.field8697[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field8697[var5];
            this.field8697[var5] = this.field8697[var5 + 256] = this.field8697[var4];
            this.field8697[var4] = this.field8697[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([FIFBIFIIFFI)V")
    public final void method2651(float[] arg0, int arg1, float arg2, byte arg3, int arg4, float arg5, int arg6, int arg7, float arg8, float arg9, int arg10) {
        field8696++;
        int var12 = (int) ((float) arg6 * arg5 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg4 * arg8 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg10 * arg9 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg1 * arg9;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        float var23 = class648.method3542(var21, -40);
        int var24 = var20 & var17;
        int var25 = var19 & var17;
        if (arg3 != -56) {
            return;
        }
        int var26 = this.field8697[var25];
        int var27 = this.field8697[var24];
        for (int var28 = 0; var28 < arg4; var28++) {
            float var29 = (float) var28 * arg8;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            int var35 = var31 & var15;
            float var36 = class648.method3542(var32, 112);
            int var37 = this.field8697[var26 + var34];
            int var38 = this.field8697[var26 + var35];
            int var39 = this.field8697[var27 + var34];
            int var40 = this.field8697[var27 + var35];
            for (int var41 = 0; var41 < arg6; var41++) {
                float var42 = (float) var41 * arg5;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                float var48 = class648.method3542(var45, arg3 ^ 0xFFFFFF9C);
                int var49 = var43 & var13;
                arg0[arg7++] = class29.method260(class29.method260(class29.method260(class143.method1088((byte) -52, var46, class48.method346(7, this.field8697[var37 + var49]), var33, var22), (byte) 112, class143.method1088((byte) -76, var45, class48.method346(7, this.field8697[var37 + var47]), var33, var22), var48), (byte) 116, class29.method260(class143.method1088((byte) -116, var46, class48.method346(7, this.field8697[var38 + var49]), var32, var22), (byte) -108, class143.method1088((byte) -84, var45, class48.method346(7, this.field8697[var38 + var47]), var32, var22), var48), var36), (byte) -112, class29.method260(class29.method260(class143.method1088((byte) -116, var46, class48.method346(this.field8697[var39 + var49], 7), var33, var21), (byte) -115, class143.method1088((byte) -64, var45, class48.method346(7, this.field8697[var39 + var47]), var33, var21), var48), (byte) -125, class29.method260(class143.method1088((byte) -63, var46, class48.method346(7, this.field8697[var49 + var40]), var32, var21), (byte) -115, class143.method1088((byte) -102, var45, class48.method346(this.field8697[var40 + var47], 7), var32, var21), var48), var36), var23) * arg2;
            }
        }
    }
}
