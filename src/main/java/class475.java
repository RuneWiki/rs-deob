import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class475 {

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "[I")
    public static int[] field7027 = new int[25];

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "Lrl;")
    public static class672 field7030 = new class672(0, 8);

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "Lhga;")
    public static class158 field7031 = new class158(3, 8);

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "[I")
    public static int[] field7032;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V", line = 4)
    public static void method2945(int arg0) {
        field7027 = null;
        field7032 = null;
        field7030 = null;
        if (arg0 != 0) {
            field7034 = -101;
        }
        field7031 = null;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(II[BI)I", line = 17)
    public static final int method2946(int arg0, int arg1, byte[] arg2, int arg3) {
        field7029++;
        int var4 = -1;
        if (arg3 <= 53) {
            method2945(71);
        }
        for (int var5 = arg0; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class108.field1762[(var4 ^ arg2[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B[BIIIII)Z", line = 45)
    public static final boolean method2947(byte arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7028++;
        if (arg0 < 42) {
            field7031 = null;
        }
        int var7 = arg6 % arg5;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg5 - var7;
        }
        int var9 = -((arg3 + arg5 - 1) / arg5);
        int var10 = -((arg6 - (1 - arg5)) / arg5);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg1[arg4] == 0) {
                    return true;
                }
                arg4 += arg5;
            }
            int var13 = arg4 - var8;
            if (arg1[var13 - 1] == 0) {
                return true;
            }
            arg4 = arg2 + var13;
        }
        return false;
    }
}
