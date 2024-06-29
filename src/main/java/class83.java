import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class83 {

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Lok;")
    private static class146 field1322 = class235.method1724(-12908, "wave:");

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field1323 = 0;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lok;")
    public static class146 field1318 = field1322;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Z")
    public static boolean field1326 = false;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "Lok;")
    public static class146 field1321 = field1322;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Lok;")
    private static class146 field1327 = class235.method1724(-12908, " ");

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lok;")
    public static class146 field1320 = field1327;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Lhf;")
    public static class195 field1324 = new class195(64);

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Z")
    public static boolean field1328;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V", line = 31)
    public static final void method587(byte arg0, int arg1) {
        field1325++;
        class158 var2 = class206.method1564(arg1, 4, -109);
        if (arg0 > -43) {
            field1324 = (class195) null;
        }
        var2.method1238(-87);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 43)
    public static void method588(int arg0) {
        field1327 = null;
        if (arg0 != 4) {
            method587((byte) 37, 85);
        }
        field1318 = null;
        field1324 = null;
        field1322 = null;
        field1321 = null;
        field1320 = null;
    }
}
