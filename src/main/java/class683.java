import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class683 extends class288 {

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[I")
    private int[] field9390 = new int[512];

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field9392 = 0;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lpe;")
    public static class615 field9391;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IF[FIBIIIFFF)V", line = 5)
    public final void method1712(int arg0, float arg1, float[] arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10) {
        field9394++;
        int var12 = (int) ((float) arg7 * arg9 - 1.0F);
        if (arg4 > -45) {
            this.method1712(-107, 0.5459315F, null, 75, (byte) 81, -67, 55, -6, 0.20697841F, -0.45130232F, -0.8972694F);
        }
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg0 * arg8 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg6 * arg1 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg5 * arg1;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        float var24 = class416.method2346((byte) -117, var21);
        int var25 = var20 & var17;
        int var26 = this.field9390[var23];
        int var27 = this.field9390[var25];
        for (int var28 = 0; var28 < arg0; var28++) {
            float var29 = (float) var28 * arg8;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            float var35 = class416.method2346((byte) -117, var32);
            int var36 = var30 & var15;
            int var37 = this.field9390[var26 + var36];
            int var38 = this.field9390[var26 + var34];
            int var39 = this.field9390[var27 + var36];
            int var40 = this.field9390[var27 + var34];
            for (int var41 = 0; var41 < arg7; var41++) {
                float var42 = (float) var41 * arg9;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                float var48 = class416.method2346((byte) -117, var45);
                int var49 = var44 & var13;
                arg2[arg3++] = arg10 * class119.method891(class119.method891(class119.method891(class346.method1993(var32, var21, var45, 111, class597.method3238(this.field9390[var40 + var49], 7)), var48, (byte) -105, class346.method1993(var32, var21, var46, -123, class597.method3238(7, this.field9390[var40 + var47]))), var35, (byte) -126, class119.method891(class346.method1993(var33, var21, var45, 123, class597.method3238(this.field9390[var49 + var39], 7)), var48, (byte) -103, class346.method1993(var33, var21, var46, 81, class597.method3238(this.field9390[var47 + var39], 7)))), var24, (byte) -119, class119.method891(class119.method891(class346.method1993(var32, var22, var45, -17, class597.method3238(this.field9390[var38 + var49], 7)), var48, (byte) -121, class346.method1993(var32, var22, var46, 99, class597.method3238(this.field9390[var38 + var47], 7))), var35, (byte) -108, class119.method891(class346.method1993(var33, var22, var45, -116, class597.method3238(this.field9390[var37 + var49], 7)), var48, (byte) -103, class346.method1993(var33, var22, var46, 84, class597.method3238(this.field9390[var37 + var47], 7)))));
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILoa;)V", line = 95)
    public static final void method3745(int arg0, class43 arg1) {
        int var2 = -30 % ((arg0 - 31) / 35);
        for (class231 var3 = (class231) class666.field9241.method2101(260); var3 != null; var3 = (class231) class666.field9241.method2098((byte) 57)) {
            if (var3.field3095) {
                var3.method1466(arg1);
            }
        }
        field9393++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 117)
    public static void method3746(int arg0) {
        if (arg0 != -3632) {
            method3745(-24, null);
        }
        field9391 = null;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V", line = 135)
    public class683(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field9390[var3] = this.field9390[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field9390[var5];
            this.field9390[var5] = this.field9390[var5 + 256] = this.field9390[var4];
            this.field9390[var4] = this.field9390[var4 + 256] = var6;
        }
    }
}
