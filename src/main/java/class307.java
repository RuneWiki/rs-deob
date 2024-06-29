import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class307 {

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public int field4212 = 1;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lvp;")
    public static class162 field4210 = null;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "C")
    public char field4209;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 4)
    public static void method1872(byte arg0) {
        if (arg0 != 12) {
            field4210 = null;
        }
        field4210 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lgw;I)V", line = 15)
    public final void method1873(class148 arg0, int arg1) {
        field4208++;
        while (true) {
            int var3 = arg0.method1032((byte) -33);
            if (var3 == 0) {
                if (arg1 == 14992) {
                    return;
                } else {
                    method1875(16, -105, 24, -24, -37, -6, 74, null, null);
                    return;
                }
            }
            this.method1874(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZILgw;)V", line = 39)
    private final void method1874(boolean arg0, int arg1, class148 arg2) {
        field4211++;
        if (arg0) {
            this.field4209 = '\u0011';
        }
        if (arg1 == 1) {
            this.field4209 = class387.method2305((byte) -99, arg2.method1062(-21188));
        } else if (arg1 == 2) {
            this.field4212 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIII[B[B)V", line = 59)
    public static final void method1875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, byte[] arg8) {
        field4207++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        if (arg2 >= -55) {
            return;
        }
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg7[var10001] = (byte) (arg7[var10001] - arg8[arg4++]);
                int var14 = arg5++;
                arg7[var14] = (byte) (arg7[var14] - arg8[arg4++]);
                int var15 = arg5++;
                arg7[var15] = (byte) (arg7[var15] - arg8[arg4++]);
                int var16 = arg5++;
                arg7[var16] = (byte) (arg7[var16] - arg8[arg4++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg7[var10001] = (byte) (arg7[var10001] - arg8[arg4++]);
            }
            arg4 += arg6;
            arg5 += arg0;
        }
    }
}
