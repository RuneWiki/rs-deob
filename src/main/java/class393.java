import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class393 {

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "Z")
    public static boolean field5714 = true;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "[I")
    public static int[] field5719 = new int[8];

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field5722 = 0;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public int field5715;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public int field5717;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public int field5718;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "([BII[BIIIII)V")
    public static final void method2369(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 >= -20) {
            field5716 = 43;
        }
        field5721++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg0[var10001] = (byte) (arg0[var10001] - arg3[arg8++]);
                int var14 = arg2++;
                arg0[var14] = (byte) (arg0[var14] - arg3[arg8++]);
                int var15 = arg2++;
                arg0[var15] = (byte) (arg0[var15] - arg3[arg8++]);
                int var16 = arg2++;
                arg0[var16] = (byte) (arg0[var16] - arg3[arg8++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg0[var10001] = (byte) (arg0[var10001] - arg3[arg8++]);
            }
            arg2 += arg7;
            arg8 += arg6;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BII)Z")
    public static final boolean method2370(byte arg0, int arg1, int arg2) {
        if (arg0 > -98) {
            method2370((byte) 13, 127, 52);
        }
        field5720++;
        return (arg2 & 0x70000) != 0 | class221.method1452(arg2, arg1, 0) || class559.method3273(27834, arg2, arg1);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static void method2371(byte arg0) {
        if (arg0 > -121) {
            field5716 = 33;
        }
        field5719 = null;
    }
}
