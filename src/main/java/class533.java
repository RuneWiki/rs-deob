import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class533 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "Lap;")
    public static class335 field7839 = new class335("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field7841 = -1;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field7843 = -1;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Lap;")
    public static class335 field7842 = new class335("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field7846 = 0;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    public static int field7845 = 0;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "Lob;")
    public static class520 field7844;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "([I[JIII)V", line = 4)
    public static final void method3156(int[] arg0, long[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 > arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg2; var11++) {
                if (((long) (var10 & var11) + var7) > arg1[var11]) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    int var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var9;
            method3156(arg0, arg1, var6 - 1, 28, arg4);
            method3156(arg0, arg1, arg2, 32, var6 + 1);
        }
        field7840++;
        int var15 = 116 / ((-arg3 - 61) / 62);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V", line = 64)
    public static void method3157(byte arg0) {
        field7842 = null;
        if (arg0 != 19) {
            method3157((byte) -90);
        }
        field7839 = null;
        field7844 = null;
    }
}
