import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class384 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field5800 = -1;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Lgr;")
    public static class296 field5802 = new class296(5, 3);

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public static void method2379(byte arg0) {
        field5802 = null;
        if (arg0 != 94) {
            field5802 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II[I[I[B[[BI[[B)I")
    public static final int method2380(int arg0, int arg1, int[] arg2, int[] arg3, byte[] arg4, byte[][] arg5, int arg6, byte[][] arg7) {
        field5801++;
        int var8 = arg2[arg0];
        int var9 = arg3[arg0] + var8;
        int var10 = arg2[arg6];
        int var11 = arg3[arg6] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg4[arg0] & 0xFF;
        if ((arg4[arg6] & 0xFF) < var14) {
            var14 = arg4[arg6] & 0xFF;
        }
        if (arg1 < 85) {
            return -70;
        }
        byte[] var15 = arg5[arg0];
        byte[] var16 = arg7[arg6];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }
}
