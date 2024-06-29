import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class397 {

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "Lss;")
    public static class213 field5995 = new class213("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "[[B")
    public static byte[][] field5997 = new byte[250][];

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II[BIBI)V")
    public static final void method2557(int arg0, int arg1, byte[] arg2, int arg3, byte arg4, int arg5) {
        field5996++;
        if (arg0 <= arg1) {
            return;
        }
        int var6 = arg1 + arg5;
        int var7 = arg0 - arg1 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg0 - arg1 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        int var9 = -9 % ((50 - arg4) / 60);
                        return;
                    }
                    arg2[var6++] = 1;
                }
            }
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public static void method2558(int arg0) {
        field5997 = null;
        field5995 = null;
        if (arg0 != 22534) {
            field5997 = null;
        }
    }
}
