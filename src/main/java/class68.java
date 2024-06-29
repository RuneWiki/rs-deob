import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class68 extends class242 {

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "Z")
    public static boolean field1301 = false;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Ljf;")
    public static class229 field1300 = class212.method1457((byte) 73, "Librairie 3D d-Bmarr-Be");

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "Z")
    public static boolean field1298 = true;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "Ljf;")
    public static class229 field1304 = class212.method1457((byte) 97, "<br>(X");

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "Ljf;")
    public static class229 field1306 = class212.method1457((byte) 124, "Lade Liste der Welten");

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "B")
    public static byte field1299;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(II)V", line = 19)
    public class68(int arg0, int arg1) {
        this.field1303 = arg0;
        this.field1302 = arg1;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(Z)V", line = 33)
    public static void method508(boolean arg0) {
        field1304 = null;
        field1306 = null;
        field1300 = null;
        if (arg0) {
            method508(true);
        }
    }
}
