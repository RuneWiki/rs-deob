import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class110 extends class674 {

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field1519;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "Z")
    public static boolean field1518 = true;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "F")
    public static float field1516;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)Z")
    public final boolean method834(int arg0) {
        if (arg0 < 101) {
            return true;
        } else {
            field1515++;
            return false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lpj;Ljava/lang/Object;I)V")
    public class110(class157 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1519 = arg1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method835(boolean arg0) {
        if (!arg0) {
            field1516 = 1.3711511F;
        }
        field1517++;
        return this.field1519;
    }
}
