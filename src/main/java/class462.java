import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class462 {

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "Lub;")
    public class20 field5751 = null;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "Lta;")
    public class201 field5753 = null;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)I", line = 3)
    public static final int method2533(boolean arg0) {
        if (arg0) {
            return -96;
        } else {
            field5754++;
            return class340.field4344++;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lta;)V", line = 23)
    public class462(class201 arg0) {
        this.field5753 = arg0;
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lta;Lub;)V", line = 30)
    public class462(class201 arg0, class20 arg1) {
        this.field5753 = arg0;
        this.field5751 = arg1;
    }
}
