import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 extends class145 {

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "Lfc;")
    public static class39 field1698 = class90.method774("Verbindung mit Update)2Server)3)3)3", -107);

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "Lfc;")
    private static class39 field1701 = class90.method774("Please wait 1 minute and try again)3", -88);

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "Lfc;")
    public static class39 field1704 = class90.method774("lila:", -112);

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "Lfc;")
    public static class39 field1700 = class90.method774("Geben Sie Ihren Benutzernamen", -78);

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "Lfc;")
    public static class39 field1708 = class90.method774("(U1", -113);

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "Lfc;")
    public static class39 field1709 = class90.method774("auf der Hautpseite)3", -109);

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Lfc;")
    public static class39 field1699 = class90.method774("Benutzen Sie die (WPasswort -=ndern(W Option", -113);

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "Lfc;")
    public static class39 field1706 = field1701;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "Z")
    public static boolean field1705 = false;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "Lfc;")
    public static class39 field1702 = field1701;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "Lfc;")
    public static class39 field1713 = class90.method774("Keine Antwort vom Server)3", -104);

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field1712 = 0;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "[I")
    public static int[] field1710 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "B")
    public byte field1707;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "Lfc;")
    public class39 field1714;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 41)
    public static void method666(int arg0) {
        field1699 = null;
        field1701 = null;
        field1698 = null;
        field1702 = null;
        field1700 = null;
        field1706 = null;
        field1710 = null;
        if (arg0 == -25177) {
            field1713 = null;
            field1704 = null;
            field1708 = null;
            field1709 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZILoc;)Ltd;", line = 85)
    public static final class134 method667(boolean arg0, int arg1, class100 arg2) {
        byte[] var3 = arg2.method850(!arg0, arg1);
        field1703++;
        if (var3 == null) {
            return null;
        } else if (arg0) {
            return null;
        } else {
            return new class134(var3);
        }
    }
}
