import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public abstract class class285 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "Lcu;")
    public static class145 field3721 = new class145(37, 11);

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "Lvj;")
    public static class304 field3722 = new class304(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field3725 = 0;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "Lvj;")
    public static class304 field3724 = new class304("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "Lvj;")
    public static class304 field3726 = new class304("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "Lvj;")
    public static class304 field3727 = new class304("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "F")
    public static float field3729;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "Z")
    public static boolean field3723;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 9)
    public static void method1688(int arg0) {
        field3724 = null;
        field3721 = null;
        field3726 = null;
        field3722 = null;
        field3727 = null;
        if (arg0 != 37) {
            method1688(97);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1491(Component arg0, int arg1);

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method1490(byte arg0, Component arg1);

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)I")
    public abstract int method1489(byte arg0);
}
