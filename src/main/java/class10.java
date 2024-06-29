import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class10 {

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Lwi;")
    public static class330 field177 = new class330(8);

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Lof;")
    public static class446 field180 = new class446("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static final void method100(int arg0) {
        field176++;
        if (arg0 > -93) {
            field177 = null;
        }
        class424.method2582(class318.field4617, -1);
        class37.field531++;
        class538.field7879.method1114(class508.field7476, 120);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIBI)Z")
    public static final boolean method101(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field178++;
        if (arg4 != -111) {
            return false;
        }
        for (int var6 = arg1; var6 <= arg0; var6++) {
            for (int var7 = arg3; var7 <= arg2; var7++) {
                if (class309.field4506[var6][var7] == arg5 && class73.field1008[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    public static final void method102(int arg0) {
        if (arg0 > 64) {
            class213.field3022 = true;
            field175++;
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
    public static void method103(int arg0) {
        field177 = null;
        field180 = null;
        if (arg0 != 8) {
            field179 = -40;
        }
    }
}
