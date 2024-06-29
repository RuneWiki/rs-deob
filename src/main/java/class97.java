import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class97 {

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "Lkea;")
    public static class203 field1140;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Ltu;IIB[I[I)Lmk;")
    public static final class50 method605(class294 arg0, int arg1, int arg2, byte arg3, int[] arg4, int[] arg5) {
        if (arg3 != -1) {
            method605(null, 119, 103, (byte) 76, null, null);
        }
        field1139++;
        if (!arg0.method1528(class562.field8019, (byte) 59, class256.field3653)) {
            int[] var6 = new int[arg1 * arg2];
            for (int var7 = 0; var7 < arg2; var7++) {
                int var8 = arg1 * var7 + arg4[var7];
                for (int var9 = 0; var9 < arg5[var7]; var9++) {
                    var6[var8++] = -16777216;
                }
            }
            return new class50(arg0, arg1, arg2, var6);
        }
        byte[] var10 = new byte[arg1 * arg2];
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = arg1 * var11 + arg4[var11];
            for (int var13 = 0; var13 < arg5[var11]; var13++) {
                var10[var12++] = -1;
            }
        }
        return new class50(arg0, arg1, arg2, var10);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
    public static void method606(int arg0) {
        field1140 = null;
        if (arg0 != -15797) {
            method606(-85);
        }
    }

    static {
        new class474("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field1141 = 0;
    }
}
