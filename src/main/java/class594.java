import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class594 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lnj;")
    public static class487 field8765 = new class487("Initialised native registry", "Registry initialisiert", "Registre natif initialisé", "Inicializando registro nativo");

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Ldda;")
    public static class597 field8766;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 6)
    public static void method3453(int arg0) {
        field8765 = null;
        field8766 = null;
        if (arg0 != 1) {
            method3453(-16);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)Z", line = 22)
    public static final boolean method3454(byte arg0, int arg1) {
        int var2 = 15 / ((13 - arg0) / 51);
        field8764++;
        return arg1 == 1 || arg1 == 3 || arg1 == 5;
    }
}
