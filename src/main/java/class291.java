import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class291 {

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Z")
    public static boolean field4518 = false;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4522 = "Cancel";

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field4524 = 0;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4523 = "Loaded textures";

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public int field4517;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public int field4519;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public static void method1932(boolean arg0) {
        field4523 = null;
        field4522 = null;
        if (!arg0) {
            field4523 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lub;I)V")
    public static final void method1933(class92 arg0, int arg1) {
        class27.field462 = arg0;
        field4521++;
        if (arg1 != 1954) {
            field4523 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)V")
    public static final void method1934(int arg0, byte arg1) {
        class92.field1467 = (class303) class112.field1719.method2043((long) arg0, -1);
        if (arg1 < 4) {
            field4515 = 55;
        }
        field4516++;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)V")
    public static final void method1935(boolean arg0) {
        if (arg0) {
            class149.field2210 = class133.field1999;
            class233.field3684 = class166.field2507;
        } else {
            class149.field2210 = class108.field1679;
            class233.field3684 = class303.field4876;
        }
        class57.field900 = class149.field2210.length;
    }
}
