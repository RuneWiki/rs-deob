import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class409 extends class470 {

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public int field6030;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "Lkn;")
    public class518 field6033;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "Ljava/awt/Frame;")
    public static Frame field6029;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "[B")
    public byte[] field6032;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)I")
    public final int method1267(boolean arg0) {
        if (!arg0) {
            this.method1266(-40);
        }
        ++field6031;
        return super.field6915 ? 0 : 100;
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)V")
    public static void method2534(int arg0) {
        field6029 = null;
        if (arg0 >= -87) {
            method2534(-123);
        }
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)[B")
    public final byte[] method1266(int arg0) {
        if (arg0 != 100) {
            this.method1266(-74);
        }
        ++field6028;
        if (super.field6915) {
            throw new RuntimeException();
        } else {
            return this.field6032;
        }
    }
}
