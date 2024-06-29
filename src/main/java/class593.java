import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class593 implements class486 {

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public int field8100;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lha;")
    public static class66 field8098;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lhg;")
    public static class718 field8101;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II[F[II[FIII[IIII)V")
    public static final void method3332(int arg0, int arg1, float[] arg2, int[] arg3, int arg4, float[] arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12) {
        field8102++;
        int var13 = arg8 * arg12 + arg1;
        if (arg0 <= 53) {
            return;
        }
        int var14 = arg4 * arg6 + arg7;
        int var15 = arg8 - arg11;
        int var16 = arg4 - arg11;
        if (arg3 == null) {
            for (int var21 = 0; var21 < arg10; var21++) {
                int var22 = arg11 + var13;
                while (var13 < var22) {
                    arg2[var14++] = arg5[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else if (arg5 == null) {
            for (int var17 = 0; var17 < arg10; var17++) {
                int var18 = var13 + arg11;
                while (var18 > var13) {
                    arg9[var14++] = arg3[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else {
            for (int var19 = 0; var19 < arg10; var19++) {
                int var20 = var13 + arg11;
                while (var13 < var20) {
                    arg9[var14] = arg3[var13];
                    arg2[var14++] = arg5[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Leo;")
    public final class313 method576(byte arg0) {
        field8099++;
        return arg0 == 41 ? class375.field5489 : null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method3333(int arg0) {
        if (arg0 == 0) {
            field8098 = null;
            field8101 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V")
    public class593(int arg0) {
        this.field8100 = arg0;
    }
}
