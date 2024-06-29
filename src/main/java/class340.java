import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class340 {

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Z")
    public static boolean field4749 = false;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field4751 = -1;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2181(byte arg0) {
        class190 var1 = class374.field5343;
        synchronized (class374.field5343) {
            class374.field5343.method1243(1000);
        }
        field4750++;
        if (arg0 == -118) {
            class190 var2 = class439.field6338;
            synchronized (class439.field6338) {
                class439.field6338.method1243(arg0 + 1118);
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Laa;I)V", line = 33)
    public static final void method2182(class281 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        if (class235.field3198) {
            class258.method1596(arg0, false);
        } else {
            class160.method1068((byte) -95, arg0);
        }
        field4752++;
    }
}
