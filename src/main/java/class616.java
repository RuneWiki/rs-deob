import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class616 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[I")
    public static int[] field9016 = new int[32];

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lqp;")
    public static class586 field9017 = new class586(62, 6);

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field9020 = 0;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lnj;")
    public static class487 field9019 = new class487("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method3578(byte arg0) {
        field9017 = null;
        if (arg0 != -123) {
            field9020 = 68;
        }
        field9016 = null;
        field9019 = null;
    }
}
