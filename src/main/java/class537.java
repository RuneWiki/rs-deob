import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class537 extends class529 {

    @OriginalMember(owner = "client!br", name = "E", descriptor = "[B")
    public static byte[] field7543 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!br", name = "D", descriptor = "Laca;")
    public static class580 field7542 = new class580();

    @OriginalMember(owner = "client!br", name = "K", descriptor = "[Lkga;")
    public static class555[] field7548 = new class555[14];

    @OriginalMember(owner = "client!br", name = "J", descriptor = "Lmq;")
    public static class78 field7547 = new class78(10, 5);

    @OriginalMember(owner = "client!br", name = "L", descriptor = "Z")
    public static boolean field7549 = false;

    @OriginalMember(owner = "client!br", name = "G", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!br", name = "H", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!br", name = "I", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IBLtn;)V", line = 7)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg1 < 45) {
            field7547 = null;
        }
        if (~arg0 == -1) {
            super.field7461 = arg2.method1094(255) == 1;
        }
        ++field7544;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)[I", line = 23)
    public final int[] method191(int arg0, byte arg1) {
        ++field7545;
        int var3 = 123 % ((27 - arg1) / 49);
        int[] var4 = super.field7456.method1635(arg0, -79);
        if (super.field7456.field3449) {
            int[] var5 = this.method3028((byte) 120, arg0, 0);
            int[] var6 = this.method3028((byte) 123, arg0, 1);
            int[] var7 = this.method3028((byte) 127, arg0, 2);
            for (int var8 = 0; var8 < class304.field3909; ++var8) {
                int var9 = var7[var8];
                if (var9 == 4096) {
                    var4[var8] = var5[var8];
                } else if (var9 != 0) {
                    var4[var8] = var5[var8] * var9 - -((-var9 + 4096) * var6[var8]) >> 12;
                } else {
                    var4[var8] = var6[var8];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[[I", line = 75)
    public final int[][] method592(int arg0, int arg1) {
        ++field7546;
        int[][] var3 = super.field7450.method2241(-1, arg0);
        if (arg1 != 2) {
            return null;
        } else {
            if (super.field7450.field5165) {
                int[] var4 = this.method3028((byte) 115, arg0, 2);
                int[][] var5 = this.method3026(0, arg0, arg1 + 18462);
                int[][] var6 = this.method3026(1, arg0, arg1 ^ 18466);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~class304.field3909 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 == -4097) {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    } else if (var17 != 0) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!br", name = "f", descriptor = "(I)V", line = 157)
    public static void method3061(int arg0) {
        field7548 = null;
        if (arg0 == 4477) {
            field7542 = null;
            field7543 = null;
            field7547 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V", line = 170)
    public class537() {
        super(3, false);
    }
}
