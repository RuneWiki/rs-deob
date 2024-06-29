import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public abstract class class542 {

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field7499 = -1;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Liv;")
    public static class100 field7497 = new class100("WIP", 2);

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Ljava/lang/Object;")
    public static Object field7496;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([F[II[F[IIIIIIBII)V", line = 6)
    public static final void method3106(float[] arg0, int[] arg1, int arg2, float[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11, int arg12) {
        field7495++;
        int var13 = arg2 * arg11 + arg9;
        int var14 = arg7 * arg12 + arg6;
        int var15 = arg2 - arg5;
        int var16 = arg7 - arg5;
        if (arg10 >= -21) {
            method3107(127);
        }
        if (arg1 == null) {
            for (int var21 = 0; var21 < arg8; var21++) {
                int var22 = arg5 + var13;
                while (var13 < var22) {
                    arg3[var14++] = arg0[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else if (arg0 == null) {
            for (int var17 = 0; var17 < arg8; var17++) {
                int var18 = arg5 + var13;
                while (var13 < var18) {
                    arg4[var14++] = arg1[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else {
            for (int var19 = 0; var19 < arg8; var19++) {
                int var20 = arg5 + var13;
                while (var13 < var20) {
                    arg4[var14] = arg1[var13];
                    arg3[var14++] = arg0[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 89)
    public static void method3107(int arg0) {
        field7496 = null;
        if (arg0 != 0) {
            field7499 = -9;
        }
        field7497 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZIIII)V", line = 102)
    public static final void method3108(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field7498++;
        int var7 = class720.method4025(class546.field7619, arg1, class760.field10606, 0);
        int var8 = class720.method4025(class546.field7619, arg3, class760.field10606, 0);
        int var9 = class720.method4025(class667.field9373, arg0, class225.field2994, 0);
        int var10 = class720.method4025(class667.field9373, arg5, class225.field2994, 0);
        int var11 = class720.method4025(class546.field7619, arg1 + arg4, class760.field10606, 0);
        int var12 = class720.method4025(class546.field7619, arg3 - arg4, class760.field10606, 0);
        if (arg2) {
            field7499 = -113;
        }
        for (int var13 = var7; var13 < var11; var13++) {
            class636.method3569(var10, arg6, var9, 347845800, class432.field5765[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class636.method3569(var10, arg6, var9, 347845800, class432.field5765[var14]);
        }
        int var15 = class720.method4025(class667.field9373, arg0 + arg4, class225.field2994, 0);
        int var16 = class720.method4025(class667.field9373, arg5 - arg4, class225.field2994, 0);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class432.field5765[var17];
            class636.method3569(var15, arg6, var9, 347845800, var18);
            class636.method3569(var10, arg6, var16, 347845800, var18);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lqc;I)Lqc;")
    public abstract class745 method2241(class745 arg0, int arg1);
}
