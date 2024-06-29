import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class342 extends class238 {

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "Lat;")
    public class342 field4440;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "Lat;")
    public class342 field4441;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "[S")
    public static short[] field4439;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V")
    public final void method1901(boolean arg0) {
        field4438++;
        if (this.field4440 == null) {
            return;
        }
        this.field4440.field4441 = this.field4441;
        this.field4441.field4440 = this.field4440;
        this.field4440 = null;
        if (arg0) {
            this.field4440 = null;
        }
        this.field4441 = null;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V")
    public static void method1902(int arg0) {
        field4439 = null;
        if (arg0 != -18178) {
            field4437 = -67;
        }
    }
}
