import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class651 {

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field9314 = 1403;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "Ljava/lang/String;")
    public static String field9313 = null;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "Led;")
    public static class645 field9317;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V", line = 4)
    public static void method3672(byte arg0) {
        field9317 = null;
        field9313 = null;
        int var1 = -122 / ((-arg0 - 50) / 41);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)Z", line = 18)
    public final boolean method3673(int arg0) {
        field9315++;
        if (arg0 != -1) {
            field9313 = null;
        }
        return class625.field8866 == this | class618.field8699 == this;
    }

    @OriginalMember(owner = "client!lu", name = "toString", descriptor = "()Ljava/lang/String;", line = 30)
    public final String toString() {
        field9318++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "([BIIIIIII[B)V", line = 49)
    public static final void method3674(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field9316++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        int var11 = -arg1;
        if (arg5 >= -126) {
            method3672((byte) -94);
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg0[var10001] += arg8[arg4++];
                int var14 = arg7++;
                arg0[var14] += arg8[arg4++];
                int var15 = arg7++;
                arg0[var15] += arg8[arg4++];
                int var16 = arg7++;
                arg0[var16] += arg8[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg0[var10001] += arg8[arg4++];
            }
            arg7 += arg2;
            arg4 += arg6;
            var11++;
        }
    }
}
