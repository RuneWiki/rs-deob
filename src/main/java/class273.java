import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class273 {

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Luf;")
    public static class310 field3716 = new class310(1, 8);

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Z")
    public static boolean field3717 = true;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "[Ld;")
    public static class102[] field3719 = new class102[14];

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lfg;")
    public static class83 field3718 = new class83("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "[[Z")
    public static boolean[][] field3720 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1553(boolean arg0) {
        field3718 = null;
        if (!arg0) {
            field3719 = null;
            field3716 = null;
            field3720 = null;
        }
    }
}
