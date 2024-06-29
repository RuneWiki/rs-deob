import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class501 extends class223 {

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public int field7432;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public int field7423;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "[I")
    public int[] field7425;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "[[I")
    public int[][] field7431;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "[Z")
    public boolean[] field7427;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "[I")
    public int[] field7429;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "[I")
    public static int[] field7426 = new int[4];

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field7424 = 1406;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "Lsl;")
    public static class318 field7428 = new class318(30, 3);

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "Lsl;")
    public static class318 field7433 = new class318(42, -1);

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I")
    public static final int method2999(int arg0, int arg1) {
        field7430++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFFC3) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = (double) arg0;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static void method3000(int arg0) {
        field7426 = null;
        if (arg0 != -25049) {
            method3000(82);
        }
        field7433 = null;
        field7428 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= class72.field992 && class126.field1842 >= arg2 && arg0 >= class471.field6963 && arg6 <= class401.field5947) {
            class232.method1560(arg0, arg2, arg7, arg4, arg1, false, arg6, arg5);
        } else {
            class265.method1712(arg4, arg1, (byte) -29, arg5, arg0, arg7, arg2, arg6);
        }
        int var8 = 66 / ((arg3 - 39) / 55);
        field7434++;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(I[B)V")
    public class501(int arg0, byte[] arg1) {
        this.field7432 = arg0;
        class65 var3 = new class65(arg1);
        this.field7423 = var3.method577(255);
        this.field7425 = new int[this.field7423];
        this.field7431 = new int[this.field7423][];
        this.field7427 = new boolean[this.field7423];
        this.field7429 = new int[this.field7423];
        for (int var4 = 0; var4 < this.field7423; var4++) {
            this.field7425[var4] = var3.method577(255);
        }
        for (int var5 = 0; var5 < this.field7423; var5++) {
            this.field7427[var5] = var3.method577(255) == 1;
        }
        for (int var6 = 0; var6 < this.field7423; var6++) {
            this.field7429[var6] = var3.method623((byte) 90);
        }
        for (int var7 = 0; var7 < this.field7423; var7++) {
            this.field7431[var7] = new int[var3.method577(255)];
        }
        for (int var8 = 0; var8 < this.field7423; var8++) {
            for (int var9 = 0; var9 < this.field7431[var8].length; var9++) {
                this.field7431[var8][var9] = var3.method577(255);
            }
        }
    }
}
