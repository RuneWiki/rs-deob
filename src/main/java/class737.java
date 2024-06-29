import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class737 extends class294 {

    @OriginalMember(owner = "client!sia", name = "i", descriptor = "[I")
    private int[] field10239 = new int[512];

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "F")
    public static float field10235;

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "I")
    public static int field10236;

    @OriginalMember(owner = "client!sia", name = "g", descriptor = "I")
    public static int field10237;

    @OriginalMember(owner = "client!sia", name = "h", descriptor = "[Lcu;")
    public static class222[] field10238;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIILhe;Lhe;)V", line = 4)
    public static final void method4105(int arg0, int arg1, int arg2, class374 arg3, class374 arg4) {
        class14 var5 = class700.method3936(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field278 = arg3;
        var5.field283 = arg4;
        int var6 = class395.field5009 == class195.field2669 ? 1 : 0;
        if (!arg3.method83((byte) -69)) {
            arg3.field5791 = class259.field3278[var6];
            class259.field3278[var6] = arg3;
        } else if (arg3.method85(-124)) {
            arg3.field5791 = class72.field1005[var6];
            class72.field1005[var6] = arg3;
        } else {
            arg3.field5791 = class730.field10164[var6];
            class730.field10164[var6] = arg3;
            class563.field7924 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method83((byte) -69)) {
            if (arg4.method85(-119)) {
                arg4.field5791 = class72.field1005[var6];
                class72.field1005[var6] = arg4;
                return;
            }
            arg4.field5791 = class730.field10164[var6];
            class730.field10164[var6] = arg4;
            class563.field7924 = true;
            return;
        }
        arg4.field5791 = class259.field3278[var6];
        class259.field3278[var6] = arg4;
    }

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "(I)V", line = 62)
    public static void method4106(int arg0) {
        field10238 = null;
        if (arg0 != -17014) {
            method4106(111);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IBIFIFFFI[FI)V", line = 73)
    public final void method1769(int arg0, byte arg1, int arg2, float arg3, int arg4, float arg5, float arg6, float arg7, int arg8, float[] arg9, int arg10) {
        field10236++;
        int var12 = (int) ((float) arg2 * arg3 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg4 * arg5 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg0 * arg7 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg10 * arg7;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        if (arg1 != -109) {
            this.field10239 = null;
        }
        float var22 = 1.0F - var21;
        float var23 = class5.method26(var21, 10);
        int var24 = var19 & var17;
        int var25 = var20 & var17;
        int var26 = this.field10239[var24];
        int var27 = this.field10239[var25];
        for (int var28 = 0; var28 < arg4; var28++) {
            float var29 = (float) var28 * arg5;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            float var34 = class5.method26(var32, arg1 ^ 0xFFFFFF99);
            int var35 = var31 & var15;
            int var36 = var30 & var15;
            int var37 = this.field10239[var26 + var36];
            int var38 = this.field10239[var26 + var35];
            int var39 = this.field10239[var36 + var27];
            int var40 = this.field10239[var27 + var35];
            for (int var41 = 0; var41 < arg2; var41++) {
                float var42 = (float) var41 * arg3;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                int var48 = var43 & var13;
                float var49 = class5.method26(var45, 10);
                arg9[arg8++] = class370.method2128(class370.method2128(class370.method2128(class678.method3824((byte) -106, var21, var32, class702.method3949(this.field10239[var40 + var47], 7), var45), class678.method3824((byte) -89, var21, var32, class702.method3949(7, this.field10239[var40 + var48]), var46), false, var49), class370.method2128(class678.method3824((byte) -105, var21, var33, class702.method3949(7, this.field10239[var39 + var47]), var45), class678.method3824((byte) 27, var21, var33, class702.method3949(7, this.field10239[var39 + var48]), var46), false, var49), false, var34), class370.method2128(class370.method2128(class678.method3824((byte) 63, var22, var32, class702.method3949(7, this.field10239[var38 + var47]), var45), class678.method3824((byte) 110, var22, var32, class702.method3949(this.field10239[var48 + var38], 7), var46), false, var49), class370.method2128(class678.method3824((byte) -96, var22, var33, class702.method3949(this.field10239[var37 + var47], 7), var45), class678.method3824((byte) 26, var22, var33, class702.method3949(this.field10239[var37 + var48], 7), var46), false, var49), false, var34), false, var23) * arg6;
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Llk;I)V", line = 166)
    public static final void method4107(class589 arg0, int arg1) {
        field10237++;
        class586.field8185.method3671(arg0, false);
        if (arg1 != 7) {
            method4105(-1, 19, -33, null, null);
        }
        arg0.field8252 = arg0.field8251.field6193;
        class28.field506 += arg0.field8252;
        arg0.field8251.field6193 = 0;
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(I)V", line = 183)
    public class737(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field10239[var3] = this.field10239[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field10239[var5];
            this.field10239[var5] = this.field10239[var5 + 256] = this.field10239[var4];
            this.field10239[var4] = this.field10239[var4 + 256] = var6;
        }
    }
}
