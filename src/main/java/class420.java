import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class420 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lej;")
    public static class104 field5901 = new class104("Loaded JAGDX", "JAGDX geladen", "JAGDX chargé", "JAGDX carregado");

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lrw;")
    public static class645 field5902 = new class645("LIVE", 0);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method2515(int arg0) {
        field5902 = null;
        field5901 = null;
        if (arg0 != -17899) {
            method2515(73);
        }
    }
}
