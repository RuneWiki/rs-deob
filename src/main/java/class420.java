import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class420 extends class533 {

    @OriginalMember(owner = "client!du", name = "i", descriptor = "[I")
    private int[] field5911 = new int[512];

    @OriginalMember(owner = "client!du", name = "m", descriptor = "[I")
    public static int[] field5915 = new int[1];

    @OriginalMember(owner = "client!du", name = "k", descriptor = "Ljn;")
    public static class324 field5913 = new class324(1, 2, 2, 0);

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field5917 = -1;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5918 = null;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public static final void method2600(int arg0) {
        field5914++;
        if (arg0 != 256) {
            method2604(-107, 56, -23, false, -101, 76);
        }
        class306.field4307.method819(23738);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V")
    public static void method2601(boolean arg0) {
        field5915 = null;
        if (!arg0) {
            field5915 = null;
        }
        field5913 = null;
        field5918 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(FIFIFIIB[FIF)V")
    public final void method2602(float arg0, int arg1, float arg2, int arg3, float arg4, int arg5, int arg6, byte arg7, float[] arg8, int arg9, float arg10) {
        field5910++;
        int var12 = (int) ((float) arg1 * arg10 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg9 * arg2 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg3 * arg0 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg5 * arg0;
        int var19 = -94 % ((arg7 + 58) / 56);
        int var20 = (int) var18;
        int var21 = var20 + 1;
        float var22 = (float) (-var20) + var18;
        float var23 = 1.0F - var22;
        int var24 = var20 & var17;
        float var25 = class570.method3344(var22, (byte) 48);
        int var26 = var21 & var17;
        int var27 = this.field5911[var24];
        int var28 = this.field5911[var26];
        for (int var29 = 0; var29 < arg9; var29++) {
            float var30 = (float) var29 * arg2;
            int var31 = (int) var30;
            int var32 = var31 + 1;
            float var33 = (float) (-var31) + var30;
            float var34 = 1.0F - var33;
            int var35 = var31 & var15;
            int var36 = var32 & var15;
            float var37 = class570.method3344(var33, (byte) 48);
            int var38 = this.field5911[var27 + var35];
            int var39 = this.field5911[var36 + var27];
            int var40 = this.field5911[var28 + var35];
            int var41 = this.field5911[var36 + var28];
            for (int var42 = 0; var42 < arg1; var42++) {
                float var43 = (float) var42 * arg10;
                int var44 = (int) var43;
                int var45 = var44 + 1;
                float var46 = (float) (-var44) + var43;
                float var47 = 1.0F - var46;
                int var48 = var44 & var13;
                int var49 = var45 & var13;
                float var50 = class570.method3344(var46, (byte) 48);
                arg8[arg6++] = class88.method614(-82, class88.method614(36, class88.method614(-86, class22.method124(var22, (byte) -5, var46, var33, class665.method3759(7, this.field5911[var49 + var41])), class22.method124(var22, (byte) -5, var47, var33, class665.method3759(7, this.field5911[var41 + var48])), var50), class88.method614(56, class22.method124(var22, (byte) -5, var46, var34, class665.method3759(7, this.field5911[var40 + var49])), class22.method124(var22, (byte) -5, var47, var34, class665.method3759(this.field5911[var40 + var48], 7)), var50), var37), class88.method614(-108, class88.method614(-98, class22.method124(var23, (byte) -5, var46, var33, class665.method3759(this.field5911[var49 + var39], 7)), class22.method124(var23, (byte) -5, var47, var33, class665.method3759(7, this.field5911[var39 + var48])), var50), class88.method614(-84, class22.method124(var23, (byte) -5, var46, var34, class665.method3759(this.field5911[var38 + var49], 7)), class22.method124(var23, (byte) -5, var47, var34, class665.method3759(this.field5911[var48 + var38], 7)), var50), var37), var25) * arg4;
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(I)V")
    public class420(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field5911[var3] = this.field5911[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field5911[var5];
            this.field5911[var5] = this.field5911[var5 + 256] = this.field5911[var4];
            this.field5911[var4] = this.field5911[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IBII)V")
    public static final void method2603(int arg0, byte arg1, int arg2, int arg3) {
        class692.field9623 = new byte[arg3][arg0][arg2];
        if (arg1 != 29) {
            field5918 = null;
        }
        field5916++;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIZII)V")
    public static final void method2604(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field5912++;
        if (arg1 >= -83) {
            field5917 = 87;
        }
        long var6 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg4);
        class169 var8 = (class169) class306.field4307.method812(117, var6);
        if (var8 == null) {
            var8 = new class169();
            class306.field4307.method820(var6, (byte) -42, var8);
        }
        if (arg0 >= var8.field2352.length) {
            int[] var9 = new int[arg0 + 1];
            int[] var10 = new int[arg0 + 1];
            for (int var11 = 0; var11 < var8.field2352.length; var11++) {
                var9[var11] = var8.field2352[var11];
                var10[var11] = var8.field2355[var11];
            }
            for (int var12 = var8.field2352.length; var12 < arg0; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field2352 = var9;
            var8.field2355 = var10;
        }
        var8.field2352[arg0] = arg5;
        var8.field2355[arg0] = arg2;
    }
}
