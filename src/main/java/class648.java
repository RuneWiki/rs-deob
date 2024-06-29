import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class648 {

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "[I")
    public int[] field9392 = new int[3];

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "[I")
    public int[] field9395 = new int[100];

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "[Ltv;")
    public class360[] field9396 = new class360[100];

    @OriginalMember(owner = "client!jba", name = "k", descriptor = "[Luca;")
    public class637[] field9399 = new class637[8];

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "[I")
    public static int[] field9391 = new int[50];

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public int field9393;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!jba", name = "j", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field9389;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "[[B")
    public static byte[][] field9390;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V")
    public static void method3726(byte arg0) {
        field9391 = null;
        field9390 = null;
        int var1 = -116 / ((arg0 - 50) / 57);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "([BB[II[[BI[[B[I)I")
    public static final int method3727(byte[] arg0, byte arg1, int[] arg2, int arg3, byte[][] arg4, int arg5, byte[][] arg6, int[] arg7) {
        field9397++;
        int var8 = arg2[arg3];
        int var9 = arg7[arg3] + var8;
        int var10 = arg2[arg5];
        int var11 = arg7[arg5] + var10;
        int var12 = var8;
        if (arg1 >= -42) {
            method3727(null, (byte) -39, null, 58, null, 115, null, null);
        }
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg0[arg3] & 0xFF;
        if ((arg0[arg5] & 0xFF) < var14) {
            var14 = arg0[arg5] & 0xFF;
        }
        byte[] var15 = arg6[arg3];
        byte[] var16 = arg4[arg5];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(III[BIII)Z")
    public static final boolean method3728(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field9394++;
        int var7 = arg6 % arg2;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg0 + arg2 - 1) / arg2);
        if (arg5 < 85) {
            method3728(-36, 124, -98, null, 105, -58, -108);
        }
        int var10 = -((arg6 + arg2 - 1) / arg2);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg3[arg4] == 0) {
                    return true;
                }
                arg4 += arg2;
            }
            int var13 = arg4 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg4 = arg1 + var13;
        }
        return false;
    }
}
