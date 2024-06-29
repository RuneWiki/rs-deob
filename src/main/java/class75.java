import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class75 {

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[I")
    public static int[] field944 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([BLjava/lang/String;II)I", line = 3)
    public static final int method750(byte[] arg0, String arg1, int arg2, int arg3) {
        if (arg2 >= -13) {
            field944 = null;
        }
        field945++;
        int var4 = arg1.length();
        int var5 = arg3;
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 <= '\u007F') {
                arg0[var5++] = (byte) var7;
            } else if (var7 > '߿') {
                arg0[var5++] = (byte) (class81.method769(var7, 918987) >> 12);
                arg0[var5++] = (byte) class81.method769(128, class453.method2846(63, var7 >> 6));
                arg0[var5++] = (byte) class81.method769(class453.method2846(63, var7), 128);
            } else {
                arg0[var5++] = (byte) class81.method769(192, var7 >> 6);
                arg0[var5++] = (byte) class81.method769(128, class453.method2846(63, var7));
            }
        }
        return var5 - arg3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 48)
    public static void method751(int arg0) {
        if (arg0 <= -81) {
            field944 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIII[B[BIII)V", line = 61)
    public static final void method752(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field942++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        int var11 = -arg6;
        if (arg8 != 0) {
            method750(null, null, -56, 4);
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg5[var10001] = (byte) (arg5[var10001] - arg4[arg0++]);
                int var14 = arg1++;
                arg5[var14] = (byte) (arg5[var14] - arg4[arg0++]);
                int var15 = arg1++;
                arg5[var15] = (byte) (arg5[var15] - arg4[arg0++]);
                int var16 = arg1++;
                arg5[var16] = (byte) (arg5[var16] - arg4[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg5[var10001] = (byte) (arg5[var10001] - arg4[arg0++]);
            }
            arg0 += arg7;
            arg1 += arg3;
            var11++;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([[BZLrfa;)V", line = 105)
    public static final void method753(byte[][] arg0, boolean arg1, class184 arg2) {
        if (!arg1) {
            method752(112, -8, -42, 9, null, null, -10, 106, -33);
        }
        for (int var3 = 0; var3 < arg2.field1670; var3++) {
            class636.method3698(arg1);
            for (int var4 = 0; var4 < (class275.field4426 >> 3); var4++) {
                for (int var5 = 0; var5 < (class417.field6374 >> 3); var5++) {
                    int var6 = class463.field6924[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3DF4DBF) >> 24;
                        if (!arg2.field1661 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + (var10 / 8);
                            for (int var12 = 0; var12 < class476.field7058.length; var12++) {
                                if (class476.field7058[var12] == var11 && arg0[var12] != null) {
                                    arg2.method1499(var7, (var10 & 0x7) * 8, (var9 & 0x7) * 8, class627.field8857, var4 * 8, 31, var8, class10.field172, var5 * 8, var3, arg0[var12]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field943++;
    }
}
