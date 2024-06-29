import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class77 {

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Lpu;")
    public static class179 field1294;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static void method701(int arg0) {
        int var1 = -108 / ((arg0 + 13) / 46);
        field1294 = null;
    }

    static {
        new class179("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field1294 = new class179("K", "T", "K", "K");
    }
}
