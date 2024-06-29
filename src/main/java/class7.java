import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "[I")
    public int[] field136;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "[I")
    public int[] field134;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Liv;")
    public static class64 field135;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method42(int arg0) {
        field135 = null;
        if (arg0 != -1311) {
            field135 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V")
    public class7(int arg0) {
        this.field133 = arg0;
        this.field136 = new int[this.field133];
        this.field134 = new int[this.field133];
    }

    static {
        new class342("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field135 = new class64(107, 5);
    }
}
