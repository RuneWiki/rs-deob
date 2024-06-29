import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class94 {

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field1432 = -2;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1431 = new CRC32();

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Ll;")
    public static class260 field1433 = new class260(0, 0);

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field1435 = 0;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1437 = "Face here";

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lnk;")
    public static class11 field1427;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lmc;")
    public static class158 field1436;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lve;")
    public static class233 field1434;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)V")
    public static final void method636(byte arg0, int arg1) {
        if (arg0 != -122) {
            field1437 = null;
        }
        field1430++;
        class218.field3224.method258(arg1, (byte) 63);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLkl;)V")
    public static final void method637(boolean arg0, class114 arg1) {
        if (!arg0) {
            field1436 = null;
        }
        for (int var2 = 0; var2 < class96.field1459; var2++) {
            int var3 = arg1.method787((byte) 102);
            int var4 = arg1.method756(-29901);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class283.field4514[var3] != null) {
                class283.field4514[var3].field4483 = var4;
            }
        }
        field1428++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method638(int arg0) {
        if (arg0 != -2) {
            field1434 = null;
        }
        field1434 = null;
        field1436 = null;
        field1433 = null;
        field1437 = null;
        field1427 = null;
        field1431 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static final void method639(byte arg0) {
        class242.field3640.method257(false);
        field1426++;
        class181.field2595.method257(false);
        if (arg0 != -46) {
            field1432 = -108;
        }
    }
}
