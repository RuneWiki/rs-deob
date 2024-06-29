import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 extends class256 {

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "Los;")
    public static class309 field334 = new class309("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "Ls;")
    public static class186 field337 = new class186(108, 0);

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "Los;")
    public static class309 field338 = new class309("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field340 = 0;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "Z")
    public static boolean field339 = true;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V")
    public static void method144(int arg0) {
        field337 = null;
        if (arg0 != 0) {
            method144(-66);
        }
        field334 = null;
        field338 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IF)V")
    public final void method145(int arg0, float arg1) {
        ++field336;
        if (arg0 != 2784) {
            method144(71);
        }
        super.field3920 = arg1;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(IIIIIF)V")
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
    public final void method146(int arg0, int arg1, int arg2, int arg3) {
        ++field335;
        if (arg1 == 4) {
            super.field3929 = arg2;
            super.field3928 = arg3;
            super.field3926 = arg0;
        }
    }
}
