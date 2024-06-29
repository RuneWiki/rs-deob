import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class270 {

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "Lfja;")
    public static class783 field3784 = new class783(122, 6);

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "[I")
    public static int[] field3786 = new int[5];

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "[I")
    public static int[] field3787 = new int[3];

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIZI)V")
    public static final void method1752(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (class111.field1911.field6725.method3784((byte) 82) == 0) {
            class656.method3689(false, -201);
        } else {
            class229.field3346 = class111.field1911.field6725.method3784((byte) 86);
            class624.method3517(true, 0, 0);
        }
        field3785++;
        class67.field986 = arg1;
        class758.field10446 = arg3;
        class675.field9387 = arg4;
        if (arg2 <= 108) {
            method1754((byte) -53);
        }
        class64.method454(arg0);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I[B[BIIIIII)V")
    public static final void method1753(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3783++;
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        int var11 = -arg6;
        if (arg5 < 54) {
            field3787 = null;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg2[var10001] = (byte) (arg2[var10001] - arg1[arg3++]);
                int var14 = arg4++;
                arg2[var14] = (byte) (arg2[var14] - arg1[arg3++]);
                int var15 = arg4++;
                arg2[var15] = (byte) (arg2[var15] - arg1[arg3++]);
                int var16 = arg4++;
                arg2[var16] = (byte) (arg2[var16] - arg1[arg3++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg2[var10001] = (byte) (arg2[var10001] - arg1[arg3++]);
            }
            arg3 += arg8;
            arg4 += arg7;
            var11++;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)V")
    public static void method1754(byte arg0) {
        if (arg0 < 86) {
            field3784 = null;
        }
        field3784 = null;
        field3787 = null;
        field3786 = null;
    }
}
