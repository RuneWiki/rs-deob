import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class532 {

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Lkj;")
    public static class527 field7457 = new class527(6, 7);

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Log;")
    public static class602 field7456;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "[I")
    public static int[] field7459;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
    public static void method3089(byte arg0) {
        if (arg0 == 27) {
            field7457 = null;
            field7459 = null;
            field7456 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I[[B[B[I[III[[B)I")
    public static final int method3090(int arg0, byte[][] arg1, byte[] arg2, int[] arg3, int[] arg4, int arg5, int arg6, byte[][] arg7) {
        field7458++;
        int var8 = arg4[arg0];
        int var9 = arg3[arg0] + var8;
        int var10 = arg4[arg6];
        int var11 = arg3[arg6] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        if (arg5 != -17829) {
            field7459 = null;
        }
        int var14 = arg2[arg0] & 0xFF;
        if (var14 > (arg2[arg6] & 0xFF)) {
            var14 = arg2[arg6] & 0xFF;
        }
        byte[] var15 = arg7[arg0];
        byte[] var16 = arg1[arg6];
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

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
    public static final void method3091(boolean arg0) {
        if (arg0) {
            class257.field3792 = class400.field5812;
            class485.field6947 = class697.field9813;
        } else {
            class257.field3792 = class509.field7213;
            class485.field6947 = class185.field2987;
        }
        class148.field2557 = class257.field3792.length;
    }
}
