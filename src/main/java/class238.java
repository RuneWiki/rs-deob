import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class238 extends class101 {

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Lbg;")
    public static class310 field3591 = new class310(57, 7);

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "J")
    public static long field3592 = -1L;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Lsk;")
    public static class423 field3594 = new class423("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Lbg;")
    public static class310 field3595 = new class310(52, 5);

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method1429(int arg0) {
        field3595 = null;
        field3591 = null;
        if (arg0 == 0) {
            field3594 = null;
        }
    }
}
