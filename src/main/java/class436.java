import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class436 {

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "Lvo;")
    public static class32 field6120;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "Z")
    public static boolean field6121;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public static void method2563(byte arg0) {
        if (arg0 == 87) {
            field6120 = null;
        }
    }

    static {
        new class530("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field6120 = new class32("", 15);
        field6121 = false;
        new class530("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
    }
}
