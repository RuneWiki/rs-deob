import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class411 {

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Z")
    public static boolean field6069 = true;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "[Ldk;")
    public static class432[] field6073;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)V")
    public static final void method2633(byte arg0, int arg1) {
        class189 var2 = class48.field674;
        synchronized (class48.field674) {
            class48.field674.method1142((byte) -64, arg1);
            if (arg0 < 7) {
                field6070 = 51;
            }
        }
        field6072++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)I")
    public static final int method2634(int arg0) {
        if (arg0 != -1) {
            method2634(-123);
        }
        field6074++;
        return class39.field541;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
    public static void method2635(boolean arg0) {
        field6073 = null;
        if (!arg0) {
            field6071 = 84;
        }
    }
}
