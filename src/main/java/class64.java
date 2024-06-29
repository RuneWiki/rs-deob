import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lhe;")
    public static class54 field1548 = class6.method58("blaugr-Un:", false);

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lhe;")
    public static class54 field1554 = class6.method58("Passwort: ", false);

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lhe;")
    public static class54 field1553 = class6.method58("Lade Benutzeroberfl-=che )2 ", false);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[[I")
    public static int[][] field1550 = new int[5][5000];

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Z")
    public static volatile boolean field1555 = true;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "[J")
    public static long[] field1552 = new long[32];

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Z")
    public static boolean field1556 = false;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lnc;")
    public static class93 field1551;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
    public static final void method501(int arg0, int arg1) {
        class52.field1255 = false;
        class132.field2989 = -1;
        class75.field1865 = 0;
        class50.field1201 = -1;
        class134.field3046 = null;
        class83.field2051 = 1;
        class40.field1049 = arg0;
        if (arg1 <= 63) {
            method502(115);
        }
        field1547++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method502(int arg0) {
        field1551 = null;
        field1550 = null;
        field1548 = null;
        field1554 = null;
        field1553 = null;
        if (arg0 == 1) {
            field1552 = null;
        }
    }
}
