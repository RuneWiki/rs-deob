import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class18 {

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "Lcv;")
    public class18 field279;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "Lcv;")
    public class18 field280;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)I", line = 12)
    public static final int method140(int arg0, int arg1) {
        if (class81.field1092 != null) {
            class81.field1092.method2994(-1);
            class81.field1092 = null;
        }
        field281++;
        if (arg1 >= -45) {
            method140(42, 72);
        }
        class227.field3261++;
        if (class227.field3261 > 4) {
            class511.field7590 = 0;
            class227.field3261 = 0;
            return arg0;
        }
        if (class422.field6294 == class354.field5497) {
            class354.field5497 = class356.field5518;
        } else {
            class354.field5497 = class422.field6294;
        }
        class511.field7590 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lwo;Lns;Lns;Lns;I)Z", line = 46)
    public static final boolean method141(class225 arg0, class438 arg1, class438 arg2, class438 arg3, int arg4) {
        class295.field4368 = arg0;
        field283++;
        class129.field1813 = arg1;
        class467.field6807 = arg3;
        class515.field7634 = arg2;
        return arg4 < -23;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 63)
    public final void method142(int arg0) {
        field282++;
        if (this.field280 == null) {
            return;
        }
        this.field280.field279 = this.field279;
        this.field279.field280 = this.field280;
        this.field279 = null;
        this.field280 = null;
        if (arg0 != 0) {
            this.field280 = null;
        }
    }
}
