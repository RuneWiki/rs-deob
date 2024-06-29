import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class94 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lok;")
    public static class146 field1507 = class235.method1724(-12908, "::breakcon");

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lok;")
    public static class146 field1509 = class235.method1724(-12908, ")1o");

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lok;")
    public static class146 field1511 = class235.method1724(-12908, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1510 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lok;")
    public static class146 field1515 = class235.method1724(-12908, " x ");

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "[I")
    public static int[] field1517 = new int[64];

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "[[B")
    public static byte[][] field1516 = new byte[50][];

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "[I")
    public static int[] field1514;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V", line = 62)
    public static final void method645(boolean arg0) {
        field1508++;
        class202.field3361.method791(8);
        if (arg0) {
            field1516 = (byte[][]) ((byte[][]) null);
        }
        class58.field1017.method791(8);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 87)
    public static void method646(int arg0) {
        field1517 = null;
        field1511 = null;
        field1514 = null;
        field1516 = (byte[][]) null;
        if (arg0 != 19250) {
            field1509 = (class146) null;
        }
        field1509 = null;
        field1515 = null;
        field1507 = null;
        field1510 = null;
    }
}
