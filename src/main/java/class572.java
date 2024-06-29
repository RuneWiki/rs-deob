import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class572 {

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Z")
    public static boolean field7451 = false;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lra;")
    public static class361 field7454 = new class361(70, -1);

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "[I")
    public static int[] field7455 = new int[3];

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "F")
    public static float field7456;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Lxa;")
    public static class511 field7449;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([II[BI[[B[II[[B)I", line = 5)
    public static final int method3052(int[] arg0, int arg1, byte[] arg2, int arg3, byte[][] arg4, int[] arg5, int arg6, byte[][] arg7) {
        field7452++;
        int var8 = arg5[arg6];
        int var9 = arg0[arg6] + var8;
        int var10 = arg5[arg3];
        int var11 = var10 + arg0[arg3];
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        if (arg1 <= 47) {
            field7451 = true;
        }
        int var14 = arg2[arg6] & 0xFF;
        if (var14 > (arg2[arg3] & 0xFF)) {
            var14 = arg2[arg3] & 0xFF;
        }
        byte[] var15 = arg7[arg6];
        byte[] var16 = arg4[arg3];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 64)
    public static void method3053(int arg0) {
        if (arg0 == -1) {
            field7454 = null;
            field7455 = null;
            field7449 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 85)
    public static final void method3054(byte arg0) {
        class323.field4195 = 0;
        field7453++;
        if (arg0 != -112) {
            method3052(null, 58, null, 77, null, null, 86, null);
        }
        class199.field2598 = -1;
        class247.field3310 = -1;
    }
}
