import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class433 extends class190 {

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "[I")
    private int[] field6099 = new int[512];

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field6100 = 0;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(FIIFIFIIIF[F)V")
    public final void method1210(float arg0, int arg1, int arg2, float arg3, int arg4, float arg5, int arg6, int arg7, int arg8, float arg9, float[] arg10) {
        field6101++;
        int var12 = (int) ((float) arg6 * arg3 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg2 * arg0 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg1 * arg5 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg4 * arg5;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        float var23 = class380.method2209(var21, -114);
        int var24 = var19 & var17;
        int var25 = var20 & var17;
        int var26 = this.field6099[var24];
        int var27 = this.field6099[var25];
        int var28 = 0;
        if (arg8 < 94) {
            method2556(123, null, null, null);
        }
        while (var28 < arg2) {
            float var29 = (float) var28 * arg0;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            float var35 = class380.method2209(var32, -89);
            int var36 = var31 & var15;
            int var37 = this.field6099[var26 + var34];
            int var38 = this.field6099[var26 + var36];
            int var39 = this.field6099[var27 + var34];
            int var40 = this.field6099[var27 + var36];
            for (int var41 = 0; var41 < arg6; var41++) {
                float var42 = (float) var41 * arg3;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                float var47 = class380.method2209(var45, 35);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg10[arg7++] = arg9 * class69.method534(class69.method534(class69.method534(class236.method1458(-30830, var22, class239.method1507(this.field6099[var37 + var48], 7), var46, var33), class236.method1458(-30830, var22, class239.method1507(this.field6099[var49 + var37], 7), var45, var33), var47, 69), class69.method534(class236.method1458(-30830, var22, class239.method1507(this.field6099[var38 + var48], 7), var46, var32), class236.method1458(-30830, var22, class239.method1507(this.field6099[var49 + var38], 7), var45, var32), var47, 77), var35, 121), class69.method534(class69.method534(class236.method1458(-30830, var21, class239.method1507(7, this.field6099[var48 + var39]), var46, var33), class236.method1458(-30830, var21, class239.method1507(7, this.field6099[var39 + var49]), var45, var33), var47, 104), class69.method534(class236.method1458(-30830, var21, class239.method1507(this.field6099[var40 + var48], 7), var46, var32), class236.method1458(-30830, var21, class239.method1507(this.field6099[var40 + var49], 7), var45, var32), var47, 47), var35, 60), var23, 79);
            }
            var28++;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V")
    public class433(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field6099[var3] = this.field6099[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field6099[var5];
            this.field6099[var5] = this.field6099[var5 + 256] = this.field6099[var4];
            this.field6099[var4] = this.field6099[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILoi;Lza;Loi;)V")
    public static final void method2556(int arg0, class53 arg1, class290 arg2, class53 arg3) {
        field6102++;
        class498.field7057 = class275.method1731(true, 0, arg3, class340.field4929);
        class53.field682 = arg2.method313(class498.field7057, class506.method3021(arg1, class340.field4929, 0), true);
        class431.field6093 = class275.method1731(true, 0, arg3, class168.field2455);
        class38.field415 = arg2.method313(class431.field6093, class506.method3021(arg1, class168.field2455, 0), true);
        class113.field1536 = class275.method1731(true, 0, arg3, class483.field6731);
        class107.field1431 = arg2.method313(class113.field1536, class506.method3021(arg1, class483.field6731, 0), true);
        if (arg0 != 7) {
            method2556(55, null, null, null);
        }
    }
}
