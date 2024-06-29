import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class320 extends class59 {

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "Z")
    private boolean field5406 = true;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    private int field5408 = 4096;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "Lph;")
    public static class229 field5409 = class266.method1858("document)3cookie=(R", 0);

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "Lri;")
    public static class301 field5407;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[S)[S", line = 11)
    public static final short[] method2160(int arg0, short[] arg1) {
        field5411++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class42.method320(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[[I", line = 25)
    public final int[][] method116(int arg0, int arg1) {
        if (arg1 != 4588) {
            return (int[][]) ((int[][]) null);
        }
        field5405++;
        int[][] var3 = this.field838.method1796(true, arg0);
        if (this.field838.field4334) {
            int[] var4 = this.method394(class33.field544 & arg0 - 1, 0, (byte) -85);
            int[] var5 = this.method394(arg0, 0, (byte) -104);
            int[] var6 = this.method394(class33.field544 & arg0 + 1, 0, (byte) -121);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class293.field4789; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field5408;
                int var12 = (var5[var10 + 1 & class4.field51] - var5[class4.field51 & var10 - 1]) * this.field5408;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                    var18 = var12 / var17;
                }
                if (this.field5406) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var10] = var18;
                var7[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V", line = 113)
    public static void method2161(boolean arg0) {
        field5407 = null;
        field5409 = null;
        if (arg0) {
            field5409 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 294)
    public class320() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lgh;[I[[FI[[III[[F[[FLla;I)V", line = 143)
    public static final void method2162(class35 arg0, int[] arg1, float[][] arg2, int arg3, int[][] arg4, int arg5, int arg6, float[][] arg7, float[][] arg8, class195 arg9, int arg10) {
        field5403++;
        int[] var11 = new int[arg1.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg1[var12 + var12];
            int var14 = arg1[var12 + var12 + 1];
            if (arg5 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg5 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg5 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg7[arg3][arg6];
                var18 = arg8[arg3][arg6];
                var19 = arg2[arg3][arg6];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg2[arg3 + 1][arg6];
                var18 = arg8[arg3 + 1][arg6];
                var17 = arg7[arg3 + 1][arg6];
            } else if (var13 == 128 && var14 == 128) {
                var17 = arg7[arg3 + 1][arg6 + 1];
                var18 = arg8[arg3 + 1][arg6 + 1];
                var19 = arg2[arg3 + 1][arg6 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var17 = arg7[arg3][arg6 + 1];
                var19 = arg2[arg3][arg6 + 1];
                var18 = arg8[arg3][arg6 + 1];
            } else {
                float var20 = (float) var13 / 128.0F;
                float var21 = arg7[arg3][arg6];
                float var22 = (float) var14 / 128.0F;
                float var23 = arg8[arg3][arg6];
                float var24 = (arg8[arg3 + 1][arg6] - var23) * var20 + var23;
                float var25 = (arg7[arg3 + 1][arg6] - var21) * var20 + var21;
                float var26 = arg7[arg3][arg6 + 1];
                float var27 = arg8[arg3][arg6 + 1];
                float var28 = (arg7[arg3 + 1][arg6 + 1] - var26) * var20 + var26;
                var17 = (var28 - var25) * var22 + var25;
                float var29 = (arg8[arg3 + 1][arg6 + 1] - var27) * var20 + var27;
                float var30 = arg2[arg3][arg6 + 1];
                float var31 = arg2[arg3][arg6];
                float var32 = (arg2[arg3 + 1][arg6] - var31) * var20 + var31;
                float var33 = (arg2[arg3 + 1][arg6 + 1] - var30) * var20 + var30;
                var18 = (var29 - var24) * var22 + var24;
                var19 = (var33 - var32) * var22 + var32;
            }
            int var34 = (arg3 << 7) + var13;
            int var35 = class325.method2228(arg4, var14, arg3, var13, arg6, -1);
            int var36 = (arg6 << 7) + var14;
            var11[var12] = arg0.method286(arg9, var34, var35, var36, var19, var17, var18);
        }
        if (arg10 > -82) {
            field5407 = (class301) null;
        }
        arg0.method287(var11);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BILhb;)V", line = 258)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field5410++;
        if (arg0 != 115) {
            field5409 = (class229) null;
        }
        if (arg1 == 0) {
            this.field5408 = arg2.method1161(true);
        } else if (arg1 == 1) {
            this.field5406 = arg2.method1178(8) == 1;
        }
    }
}
