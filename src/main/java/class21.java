import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class21 {

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "Lna;")
    public static class26 field217 = class6.method40("Magic Shop", 48);

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "Lna;")
    public static class26 field218 = class6.method40("Slayer Master", 48);

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "Lna;")
    public static class26 field222 = class6.method40("Anvil", 48);

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "Ls;")
    public static class34 field219 = null;

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "Lha;")
    public static class14 field220;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I)V", line = 5)
    public static void method124(int arg0) {
        field218 = null;
        field222 = null;
        field220 = null;
        if (arg0 == 0) {
            field217 = null;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Z)B", line = 37)
    public static final byte method125(boolean arg0) {
        if (!arg0) {
            field218 = null;
        }
        return class1.field8 == null ? 0 : class1.field8[class20.field213];
    }
}
