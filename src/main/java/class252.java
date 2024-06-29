import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class252 {

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field3624 = 0;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lj;")
    public static class240 field3623 = new class240(14, 5);

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Lo;")
    public static class332 field3625 = new class332("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lsh;")
    public static class472 field3626 = new class472(67, 4);

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Lo;")
    public static class332 field3627 = new class332("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Z")
    public static boolean field3628;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 9)
    public static void method1604(int arg0) {
        if (arg0 != 0) {
            field3628 = true;
        }
        field3623 = null;
        field3626 = null;
        field3625 = null;
        field3627 = null;
    }
}
