import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class80 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lbv;")
    public static class567 field1437 = new class567("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1436++;
        for (int var6 = arg3; var6 <= arg2; var6++) {
            for (int var7 = arg5; var7 <= arg0; var7++) {
                if (class393.field5893[var6][var7] == arg1 && class97.field1698[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg4 >= -94) {
            field1437 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method749(byte arg0) {
        field1437 = null;
        if (arg0 >= -31) {
            field1437 = null;
        }
    }
}
