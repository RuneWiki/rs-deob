import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class541 extends class544 {

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    public int field7900 = 0;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "I")
    public int field7907 = -1;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "Lrg;")
    public static class548 field7902 = new class548(40, 2);

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "Lvj;")
    public static class373 field7910 = new class373(89, 19);

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    public int field7901;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public int field7903;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public int field7905;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
    public int field7906;

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
    public int field7908;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
    public int field7909;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    public int field7911;

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "I")
    public int field7912;

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
    public int field7913;

    @OriginalMember(owner = "client!sp", name = "A", descriptor = "I")
    public int field7914;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I[BIIII[BBI)V")
    public static final void method3149(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, byte arg7, int arg8) {
        field7904++;
        if (arg7 != 110) {
            return;
        }
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg1[var10001] += arg6[arg3++];
                int var14 = arg2++;
                arg1[var14] += arg6[arg3++];
                int var15 = arg2++;
                arg1[var15] += arg6[arg3++];
                int var16 = arg2++;
                arg1[var16] += arg6[arg3++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg1[var10001] += arg6[arg3++];
            }
            arg2 += arg4;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)V")
    public static void method3150(boolean arg0) {
        if (!arg0) {
            field7902 = null;
            field7910 = null;
        }
    }
}
