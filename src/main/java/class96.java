import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class96 extends class361 {

    @OriginalMember(owner = "client!er", name = "f", descriptor = "[I")
    private int[] field1243 = new int[512];

    @OriginalMember(owner = "client!er", name = "k", descriptor = "Lhd;")
    public static class694 field1248 = new class694(512);

    @OriginalMember(owner = "client!er", name = "l", descriptor = "[Ltn;")
    public static class81[] field1249 = new class81[14];

    @OriginalMember(owner = "client!er", name = "m", descriptor = "Lcga;")
    public static class449 field1250 = new class449(9, 3);

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "Lfn;")
    public static class128 field1247;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "Lkaa;")
    public static class44 field1245;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 4)
    public static void method712(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1249 = null;
        field1248 = null;
        field1245 = null;
        field1247 = null;
        field1250 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIFFIFIF[F)V", line = 20)
    public final void method713(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, int arg6, float arg7, int arg8, float arg9, float[] arg10) {
        field1244++;
        int var12 = (int) ((float) arg1 * arg9 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg3 * arg7 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg6 * arg5 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg0 * arg5;
        if (arg2 != 11854) {
            field1248 = null;
        }
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        float var23 = class417.method2323(15, var21);
        int var24 = var20 & var17;
        int var25 = var19 & var17;
        int var26 = this.field1243[var25];
        int var27 = this.field1243[var24];
        for (int var28 = 0; var28 < arg3; var28++) {
            float var29 = (float) var28 * arg7;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            float var34 = class417.method2323(arg2 ^ 0x2E41, var32);
            int var35 = var31 & var15;
            int var36 = var30 & var15;
            int var37 = this.field1243[var26 + var36];
            int var38 = this.field1243[var26 + var35];
            int var39 = this.field1243[var36 + var27];
            int var40 = this.field1243[var27 + var35];
            for (int var41 = 0; var41 < arg1; var41++) {
                float var42 = (float) var41 * arg9;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                float var48 = class417.method2323(15, var45);
                int var49 = var44 & var13;
                arg10[arg8++] = arg4 * class503.method2748(class503.method2748(class503.method2748(class67.method525(var21, false, var45, var32, class109.method762(this.field1243[var49 + var40], 7)), var48, 126, class67.method525(var21, false, var46, var32, class109.method762(7, this.field1243[var40 + var47]))), var34, arg2 - 11732, class503.method2748(class67.method525(var21, false, var45, var33, class109.method762(7, this.field1243[var39 + var49])), var48, 124, class67.method525(var21, false, var46, var33, class109.method762(7, this.field1243[var47 - -var39])))), var23, 125, class503.method2748(class503.method2748(class67.method525(var22, false, var45, var32, class109.method762(7, this.field1243[var38 + var49])), var48, 124, class67.method525(var22, false, var46, var32, class109.method762(this.field1243[var47 + var38], 7))), var34, 127, class503.method2748(class67.method525(var22, false, var45, var33, class109.method762(this.field1243[var49 + var37], 7)), var48, arg2 - 11728, class67.method525(var22, false, var46, var33, class109.method762(7, this.field1243[var37 + var47])))));
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([BII)[B", line = 112)
    public static final byte[] method714(byte[] arg0, int arg1, int arg2) {
        field1242++;
        byte[] var3 = new byte[arg2];
        class70.method557(arg0, arg1, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(I)V", line = 144)
    public class96(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field1243[var3] = this.field1243[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field1243[var5];
            this.field1243[var5] = this.field1243[var5 + 256] = this.field1243[var4];
            this.field1243[var4] = this.field1243[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILoa;)V", line = 128)
    public static final void method715(int arg0, class650 arg1) {
        if (class367.field4752) {
            class664.method3697((byte) -119, arg1);
        } else {
            class469.method2558(true, arg1);
        }
        if (arg0 != 7) {
            method714(null, -103, 123);
        }
        field1246++;
    }
}
