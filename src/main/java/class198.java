import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class198 extends class573 {

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "[I")
    private int[] field2672 = new int[512];

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field2673 = -1;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field2678 = 4;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Le;")
    public static class462 field2676;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 4)
    public static void method1261(byte arg0) {
        if (arg0 != -103) {
            method1264(122, -75, -17);
        }
        field2676 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZI)I", line = 14)
    public static final int method1262(int arg0, int arg1, boolean arg2, int arg3) {
        field2675++;
        class594 var4 = class581.method3372(arg2, arg1, -27);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= arg3 && arg0 < var4.field8676.length) {
            return var4.field8676[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(I)V", line = 134)
    public class198(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field2672[var3] = this.field2672[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field2672[var5];
            this.field2672[var5] = this.field2672[var5 + 256] = this.field2672[var4];
            this.field2672[var4] = this.field2672[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(FIIZIFFFI[FI)V", line = 45)
    public final void method1263(float arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5, float arg6, float arg7, int arg8, float[] arg9, int arg10) {
        field2677++;
        int var12 = (int) ((float) arg1 * arg5 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg4 * arg6 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg2 * arg7 - 1.0F);
        int var17 = var16 & 0xFF;
        if (!arg3) {
            field2678 = 59;
        }
        float var18 = (float) arg8 * arg7;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        float var24 = class207.method1321(var21, (byte) -2);
        int var25 = var20 & var17;
        int var26 = this.field2672[var23];
        int var27 = this.field2672[var25];
        for (int var28 = 0; var28 < arg4; var28++) {
            float var29 = (float) var28 * arg6;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            int var35 = var31 & var15;
            float var36 = class207.method1321(var32, (byte) -2);
            int var37 = this.field2672[var26 + var34];
            int var38 = this.field2672[var26 + var35];
            int var39 = this.field2672[var27 + var34];
            int var40 = this.field2672[var35 + var27];
            for (int var41 = 0; var41 < arg1; var41++) {
                float var42 = (float) var41 * arg5;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                float var47 = class207.method1321(var45, (byte) -2);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg9[arg10++] = arg0 * class386.method2481(class386.method2481(class386.method2481(class50.method279(class643.method3659(this.field2672[var40 + var49], 7), 0, var32, var45, var21), var47, (byte) -111, class50.method279(class643.method3659(7, this.field2672[var40 + var48]), 0, var32, var46, var21)), var36, (byte) -85, class386.method2481(class50.method279(class643.method3659(7, this.field2672[var49 + var39]), 0, var33, var45, var21), var47, (byte) -71, class50.method279(class643.method3659(7, this.field2672[var48 + var39]), 0, var33, var46, var21))), var24, (byte) -102, class386.method2481(class386.method2481(class50.method279(class643.method3659(this.field2672[var38 + var49], 7), 0, var32, var45, var22), var47, (byte) -24, class50.method279(class643.method3659(7, this.field2672[var38 + var48]), 0, var32, var46, var22)), var36, (byte) -44, class386.method2481(class50.method279(class643.method3659(this.field2672[var37 + var49], 7), 0, var33, var45, var22), var47, (byte) -27, class50.method279(class643.method3659(7, this.field2672[var37 + var48]), 0, var33, var46, var22))));
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V", line = 171)
    public static final void method1264(int arg0, int arg1, int arg2) {
        class99 var3 = class431.field6408[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field1175 != null) {
            var3.field1175 = null;
        }
        if (var3.field1161 != null) {
            var3.field1161 = null;
        }
    }
}
