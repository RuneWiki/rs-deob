import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class65 {

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Z")
    public static boolean field1014 = false;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Lss;")
    public static class213 field1012 = new class213("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lnj;")
    public static class317 field1017 = new class317();

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method472(int arg0) {
        field1017 = null;
        if (arg0 == -1) {
            field1012 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static final void method473(byte arg0) {
        field1013++;
        int var1 = class234.field3861;
        int[] var2 = class21.field245;
        for (int var3 = 0; var3 < var1; var3++) {
            class350 var10 = class264.field4276[var2[var3]];
            if (var10 != null && var10.field833 > 0) {
                var10.field833--;
                if (var10.field833 == 0) {
                    var10.field873 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class378.field5815; var4++) {
            long var6 = (long) class81.field1198[var4];
            class38 var8 = (class38) class365.field5659.method1122((byte) 59, var6);
            if (var8 != null) {
                class378 var9 = var8.field378;
                if (var9.field833 > 0) {
                    var9.field833--;
                    if (var9.field833 == 0) {
                        var9.field873 = null;
                    }
                }
            }
        }
        int var5 = -31 % ((arg0 - 35) / 63);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)Z")
    public static final boolean method474(byte arg0, int arg1) {
        if (arg0 != -2) {
            field1012 = null;
        }
        field1015++;
        return arg1 == 2 || arg1 == 4 || arg1 == 5;
    }
}
