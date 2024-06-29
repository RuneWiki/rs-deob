import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class276 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4606 = "flash2:";

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILaj;)I")
    public static final int method1935(int arg0, class151 arg1) {
        int var2 = 0;
        if (arg0 <= 89) {
            field4606 = null;
        }
        field4607++;
        if (arg1.method1118((byte) 91, class109.field1789)) {
            var2++;
        }
        if (arg1.method1118((byte) 51, class260.field4374)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method1936(int arg0) {
        field4606 = null;
        if (arg0 > -84) {
            method1935(-2, (class151) null);
        }
    }
}
