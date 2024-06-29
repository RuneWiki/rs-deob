import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class488 extends class409 {

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field7059 = 0;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lgi;")
    public class488 field7056;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "Lgi;")
    public class488 field7058;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "[Lvv;")
    public static class219[] field7055;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 13)
    public final void method2870(int arg0) {
        field7057++;
        if (this.field7058 == null) {
            return;
        }
        if (arg0 <= 77) {
            field7059 = 70;
        }
        this.field7058.field7056 = this.field7056;
        this.field7056.field7058 = this.field7058;
        this.field7058 = null;
        this.field7056 = null;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V", line = 35)
    public static void method2871(int arg0) {
        field7055 = null;
        if (arg0 != 29289) {
            field7059 = 79;
        }
    }
}
