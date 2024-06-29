import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class120 {

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "J")
    public static long field1667 = 0L;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "Lui;")
    public static class451 field1669;

    static {
        new class332("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V", line = 3)
    public static final void method849(byte arg0) {
        field1670++;
        if (arg0 < 48) {
            field1669 = null;
        }
        if (class314.field4732) {
            class273.field4160 = null;
            class332.field4974 = null;
            class314.field4732 = false;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZZ)V", line = 25)
    public static final void method850(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != -1) {
            method849((byte) -17);
        }
        if (arg2) {
            class384.field5690--;
            if (class384.field5690 == 0) {
                class81.field1140 = null;
            }
        }
        field1668++;
        if (!arg1) {
            return;
        }
        class36.field462--;
        if (class36.field462 == 0) {
            class422.field6043 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BI)Z", line = 60)
    public static final boolean method851(byte arg0, int arg1) {
        field1666++;
        if (arg1 == 8 || arg1 == 23 || arg1 == 25 || arg1 == 6 || arg1 == 3) {
            return true;
        } else {
            if (arg0 != -111) {
                field1667 = 123L;
            }
            return arg1 == 57 || arg1 == 1012;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V", line = 79)
    public static void method852(int arg0) {
        field1669 = null;
        if (arg0 < 24) {
            field1667 = -108L;
        }
    }
}
