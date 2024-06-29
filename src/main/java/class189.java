import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class189 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lsb;")
    public static class266 field3017 = new class266(10, 15);

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3018 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Z")
    public static boolean field3020 = false;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static void method1381(boolean arg0) {
        if (arg0) {
            field3019 = 68;
        }
        field3017 = null;
        field3018 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lqh;I)Lmj;")
    public static final class608 method1382(class61 arg0, int arg1) {
        if (arg1 != 592062180) {
            field3020 = true;
        }
        field3016++;
        return new class608(arg0.method721(arg1 ^ 0xC737F014), arg0.method721(-461515024), arg0.method721(-461515024), arg0.method721(-461515024), arg0.method740((byte) 102), arg0.method740((byte) 112), arg0.method732(-559537960));
    }
}
