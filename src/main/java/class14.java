import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class14 extends RuntimeException {

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Ljava/lang/Throwable;")
    public Throwable field215;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Ljava/lang/String;")
    public String field210;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Li;")
    public static class88 field207 = class208.method1425(105, "null");

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Li;")
    public static class88 field216 = class208.method1425(105, "(U(Y");

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Li;")
    public static class88 field213 = class208.method1425(105, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field209 = -1;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field208 = -1;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Li;")
    private static class88 field217 = class208.method1425(105, "Checking for updates )2 ");

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Li;")
    public static class88 field220 = class208.method1425(105, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Li;")
    public static class88 field212 = field217;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "[S")
    public static short[] field219;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "[[[Leg;")
    public static class52[][][] field211;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method68(int arg0) {
        field213 = null;
        field212 = null;
        field211 = null;
        field220 = null;
        field219 = null;
        field216 = null;
        field217 = null;
        if (arg0 != 95) {
            field220 = null;
        }
        field207 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLtg;)V")
    public static final void method69(byte arg0, class214 arg1) {
        class112.field2035 = arg1;
        if (arg0 >= 58) {
            field221++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class14(Throwable arg0, String arg1) {
        this.field215 = arg0;
        this.field210 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
    public static final void method70(int arg0, int arg1) {
        field218++;
        for (class192 var2 = (class192) class31.field495.method1049(arg0 ^ arg0); var2 != null; var2 = (class192) class31.field495.method1050((byte) -73)) {
            if ((long) arg1 == (var2.field1219 >> 48 & 0xFFFFL)) {
                var2.method460(true);
            }
        }
    }
}
