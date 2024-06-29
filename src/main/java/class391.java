import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class391 {

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "Ljc;")
    public static class305 field5651 = new class305("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field5656 = 0;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "[[I")
    public static int[][] field5655 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "Lho;")
    public static class103 field5654 = new class103(50, 3);

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "[I")
    public static int[] field5650;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public static final void method2363(int arg0) {
        class461.field6877 = 0;
        field5652++;
        int var1 = 0;
        if (arg0 > -31) {
            field5655 = null;
        }
        while (var1 < 2048) {
            class484.field7127[var1] = null;
            class447.field6522[var1] = 1;
            class362.field4936[var1] = null;
            var1++;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
    public static void method2364(byte arg0) {
        field5655 = null;
        field5651 = null;
        field5654 = null;
        if (arg0 != 57) {
            method2365(null, null, 119, 99, -44, 116, (byte) 72, 6, 43);
        }
        field5650 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "([B[BIIIIBII)V")
    public static final void method2365(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field5653++;
        int var9 = -(arg7 >> 2);
        if (arg6 != -75) {
            method2364((byte) 126);
        }
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg2; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg0[var10001] = (byte) (arg0[var10001] - arg1[arg3++]);
                int var14 = arg8++;
                arg0[var14] = (byte) (arg0[var14] - arg1[arg3++]);
                int var15 = arg8++;
                arg0[var15] = (byte) (arg0[var15] - arg1[arg3++]);
                int var16 = arg8++;
                arg0[var16] = (byte) (arg0[var16] - arg1[arg3++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg0[var10001] = (byte) (arg0[var10001] - arg1[arg3++]);
            }
            arg8 += arg5;
            arg3 += arg4;
        }
    }
}
