import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class599 {

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field8667;

    static {
        new class180("Use", "Benutzen", "Utiliser", "Usar");
        field8668 = -1;
        new class180("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)Lmca;", line = 16)
    public static final class29 method3460(int arg0) {
        class401.field5268 = arg0;
        field8667++;
        return class178.method985(arg0 ^ 0x2);
    }
}
