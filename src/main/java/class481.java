import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class481 {

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "[Lro;")
    public static class258[] field6873 = new class258[8];

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "[I")
    public static int[] field6876 = new int[1];

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V", line = 4)
    public static void method2808(int arg0) {
        field6876 = null;
        field6873 = null;
        if (arg0 != 14408) {
            field6873 = null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "([[BB[BI[II[[B[I)I", line = 19)
    public static final int method2809(byte[][] arg0, byte arg1, byte[] arg2, int arg3, int[] arg4, int arg5, byte[][] arg6, int[] arg7) {
        field6875++;
        int var8 = arg4[arg5];
        int var9 = arg7[arg5] + var8;
        int var10 = arg4[arg3];
        int var11 = arg7[arg3] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg2[arg5] & 0xFF;
        if ((arg2[arg3] & 0xFF) < var14) {
            var14 = arg2[arg3] & 0xFF;
        }
        byte[] var15 = arg0[arg5];
        byte[] var16 = arg6[arg3];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        int var19 = var12;
        if (arg1 != 127) {
            field6876 = null;
        }
        while (var19 < var13) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
            var19++;
        }
        return -var14;
    }
}
