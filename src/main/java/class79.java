import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class79 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field1406 = 0;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lsb;")
    public static class98 field1407 = class47.method368(")4l=", 0);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
    public static final void method593(int arg0, int arg1) {
        class242.field4189 = 0;
        class216.field3685 = 1;
        if (arg1 <= 32) {
            return;
        }
        field1408++;
        class133.field2357 = false;
        class245.field4292 = -1;
        class104.field1854 = -1;
        class116.field2072 = null;
        class262.field4600 = arg0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method594(int arg0) {
        if (arg0 != -1) {
            field1407 = null;
        }
        field1407 = null;
    }
}
