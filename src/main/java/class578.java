import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class578 {

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "S")
    public short field8105;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "B")
    public byte field8104;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "Lju;")
    public class128 field8106;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "B")
    public byte field8102;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method3303(boolean arg0, int arg1) {
        field8103++;
        if (!arg0) {
            return null;
        }
        class375 var2 = (class375) class297.field3910.method1160((long) arg1, 126);
        if (var2 != null) {
            class15 var3 = var2.field4807.method2916(0);
            if (var3 != null) {
                double var4 = var2.field4807.method2919(-60);
                if (var4 >= (double) var3.method105((byte) -50) && var4 <= (double) var3.method107(11114)) {
                    return var3.method109((byte) -107);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lju;III)V")
    public class578(class128 arg0, int arg1, int arg2, int arg3) {
        this.field8105 = (short) arg1;
        this.field8104 = (byte) arg2;
        this.field8106 = arg0;
        this.field8102 = (byte) arg3;
    }
}
