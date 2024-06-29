import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class33 extends RuntimeException {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Ljava/lang/String;")
    public String field531;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field534;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Ljava/lang/String;")
    public static String field532 = "";

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static final void method206(int arg0) {
        class195.field3119.method94(34);
        field533++;
        int var1 = 121 / ((28 - arg0) / 60);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static void method207(byte arg0) {
        int var1 = 90 % ((77 - arg0) / 49);
        field532 = null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class33(Throwable arg0, String arg1) {
        this.field531 = arg1;
        this.field534 = arg0;
    }
}
