import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class434 {

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "Lvt;")
    public static class344 field5899 = new class344("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Z")
    public static boolean field5903 = false;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Lvda;")
    public static class311 field5902 = new class311();

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
    public static void method2529(byte arg0) {
        field5902 = null;
        if (arg0 > 67) {
            field5899 = null;
        }
    }
}
