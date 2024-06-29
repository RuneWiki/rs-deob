import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class225 {

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field2917 = 0;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field2921 = 0;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field2918 = 205;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field2920 = 0;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Loi;")
    public static class169 field2919 = new class169("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Lhb;")
    public static class250 field2923 = new class250(9, -1);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method1432(byte arg0) {
        field2923 = null;
        if (arg0 >= -47) {
            method1433(-127, 84, 55, -1.7017549F, -8, 1.0178586F, -0.6026193F, null, 6, 0.9328262F, null, -39, -0.855122F, 95);
        }
        field2919 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIFIFF[BIFLqi;IFI)V")
    public static final void method1433(int arg0, int arg1, int arg2, float arg3, int arg4, float arg5, float arg6, byte[] arg7, int arg8, float arg9, class385 arg10, int arg11, float arg12, int arg13) {
        field2916++;
        int var14 = arg0 * arg4;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg1; var16++) {
            int var20 = arg8;
            arg10.method1399(arg3 / (float) arg4, arg13, arg12 / (float) arg0, arg0, arg5 * 127.0F, var15, arg11, 7, arg9 / (float) arg11, 0, arg4);
            arg5 *= arg6;
            arg3 *= 2.0F;
            arg9 *= 2.0F;
            arg12 *= 2.0F;
            for (int var21 = 0; var21 < var14; var21++) {
                arg7[var20] = (byte) ((int) ((float) arg7[var20] + var15[var21]));
                var20++;
            }
        }
        int var17 = 31 % ((arg2 + 56) / 32);
        int var18 = arg8;
        for (int var19 = 0; var19 < var14; var19++) {
            arg7[var18] = (byte) (arg7[var18] + 127);
            var18++;
        }
    }
}
