import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class594 {

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field8433;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
    public static int field8435;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field8436;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)V")
    public static final void method3465(int arg0, int arg1, int arg2) {
        field8435++;
        int var3 = 57 % ((arg0 + 53) / 47);
        class150 var4 = class676.method3885(1000, 6, arg1);
        var4.method1116(19);
        var4.field2346 = arg2;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IB)V")
    public static final void method3466(int arg0, byte arg1) {
        field8433++;
        if (arg0 == -1 || !class408.field6161[arg0]) {
            return;
        }
        int var2 = -11 % ((arg1 - 20) / 45);
        class673.field9387.method228(arg0, (byte) -116);
        class86.field1229[arg0] = null;
        class365.field5282[arg0] = null;
        class408.field6161[arg0] = false;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([B[BIIIIIII)V")
    public static final void method3467(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 != 0) {
            field8434 = -128;
        }
        field8436++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg0[var10001] += arg1[arg4++];
                int var14 = arg5++;
                arg0[var14] += arg1[arg4++];
                int var15 = arg5++;
                arg0[var15] += arg1[arg4++];
                int var16 = arg5++;
                arg0[var16] += arg1[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg0[var10001] += arg1[arg4++];
            }
            arg4 += arg2;
            arg5 += arg6;
        }
    }
}
