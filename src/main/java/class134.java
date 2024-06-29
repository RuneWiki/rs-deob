import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class134 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1945 = 1405;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Luu;")
    public static class188 field1943 = null;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lpk;")
    public static class133 field1942 = new class133();

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lkf;")
    public static final class166 method1028(int arg0) {
        field1944++;
        if (arg0 != 1405) {
            method1028(-71);
        }
        return class371.field5520.length > class453.field6670 ? class371.field5520[class453.field6670++] : null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static void method1029(int arg0) {
        field1942 = null;
        if (arg0 < -110) {
            field1943 = null;
        }
    }
}
