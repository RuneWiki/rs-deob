import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class86 extends class454 {

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "[I")
    private int[] field1041 = new int[512];

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "Lvj;")
    public static class373 field1042 = new class373(73, 0);

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIFFIIFIIF[F)V")
    public final void method503(int arg0, int arg1, float arg2, float arg3, int arg4, int arg5, float arg6, int arg7, int arg8, float arg9, float[] arg10) {
        field1040++;
        int var12 = (int) ((float) arg8 * arg6 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg1 * arg9 - (float) arg5);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg7 * arg3 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg4 * arg3;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        float var24 = class256.method1446(var21, (byte) 43);
        int var25 = var19 & var17;
        int var26 = this.field1041[var25];
        int var27 = this.field1041[var23];
        for (int var28 = 0; var28 < arg1; var28++) {
            float var29 = (float) var28 * arg9;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            int var35 = var31 & var15;
            float var36 = class256.method1446(var32, (byte) 86);
            int var37 = this.field1041[var26 + var34];
            int var38 = this.field1041[var26 + var35];
            int var39 = this.field1041[var27 + var34];
            int var40 = this.field1041[var27 + var35];
            for (int var41 = 0; var41 < arg8; var41++) {
                float var42 = (float) var41 * arg6;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                float var47 = class256.method1446(var45, (byte) 55);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg10[arg0++] = arg2 * class620.method3558(var24, class620.method3558(var36, class620.method3558(var47, class48.method254(var21, var45, class288.method1624(this.field1041[var49 + var40], 7), (byte) 72, var32), class48.method254(var21, var46, class288.method1624(this.field1041[var40 + var48], 7), (byte) 72, var32), class347.method1937(arg5, 65)), class620.method3558(var47, class48.method254(var21, var45, class288.method1624(7, this.field1041[var39 + var49]), (byte) 72, var33), class48.method254(var21, var46, class288.method1624(this.field1041[var39 + var48], 7), (byte) 72, var33), arg5 + 63), 64), class620.method3558(var36, class620.method3558(var47, class48.method254(var22, var45, class288.method1624(7, this.field1041[var38 + var49]), (byte) 72, var32), class48.method254(var22, var46, class288.method1624(this.field1041[var48 + var38], 7), (byte) 72, var32), 64), class620.method3558(var47, class48.method254(var22, var45, class288.method1624(7, this.field1041[var49 + var37]), (byte) 72, var33), class48.method254(var22, var46, class288.method1624(7, this.field1041[var37 + var48]), (byte) 72, var33), 64), 64), arg5 + 63);
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
    public class86(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field1041[var3] = this.field1041[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field1041[var5];
            this.field1041[var5] = this.field1041[var5 + 256] = this.field1041[var4];
            this.field1041[var4] = this.field1041[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method504(int arg0, byte[] arg1) {
        field1043++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class345.method1932(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public static void method505(int arg0) {
        field1042 = null;
        if (arg0 != 7) {
            method505(-7);
        }
    }
}
