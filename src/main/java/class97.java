import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class97 extends class311 {

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "Lrp;")
    public class371 field1412;

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "Ldb;")
    public static class270 field1413 = new class270();

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "Lvs;")
    public static class508 field1414;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V")
    public static void method743(int arg0) {
        field1414 = null;
        if (arg0 != 6948) {
            field1414 = null;
        }
        field1413 = null;
    }

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "(I)V")
    public static final void method744(int arg0) {
        field1411++;
        class76.field1020 = null;
        class335.method2047(0, class165.field2605, class340.field4708, 0, class47.field562, -1, 0, arg0, 0);
        if (class76.field1020 != null) {
            class218.method1416(class499.field7072, class76.field1020, 0, -1441981280, 0, class47.field562, class165.field2605, -1412584499, class11.field109, class57.field716.field2446);
            class76.field1020 = null;
        }
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lte;II[B)V")
    public class97(class527 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1412 = class153.method1114(arg0, arg1, false, arg3, 6406, false, arg2, 6406);
        this.field1412.method2824((byte) -114, false, false);
    }
}
