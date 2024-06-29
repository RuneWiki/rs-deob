import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class217 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lea;")
    public static class573 field3199;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)I")
    public static final int method1505(boolean arg0) {
        field3205++;
        class43 var1 = class220.field3227;
        synchronized (class220.field3227) {
            return arg0 ? class220.field3227.method263(true) : -42;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method1506(int arg0) {
        if (arg0 != 8262) {
            field3198 = -63;
        }
        field3199 = null;
    }
}
