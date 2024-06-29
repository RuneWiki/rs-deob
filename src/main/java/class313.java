import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class313 implements class70 {

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field4317 = 0;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "Ljava/lang/Object;")
    public static Object field4316;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ltda;[IBJ)Ljava/lang/String;")
    public final String method550(class546 arg0, int[] arg1, byte arg2, long arg3) {
        field4315++;
        if (class143.field2007 == arg0) {
            class424 var6 = class196.field2901.method2914(arg2 ^ 0x7700002D, arg1[0]);
            return var6.method2491(10851, (int) arg3);
        } else if (class454.field6420 == arg0 || class146.field2112 == arg0) {
            class540 var7 = class150.field2242.method3606((byte) -123, (int) arg3);
            return var7.field8105;
        } else {
            if (arg2 != -46) {
                field4317 = -17;
            }
            return class374.field5182 == arg0 || class86.field1223 == arg0 || class504.field7139 == arg0 ? class196.field2901.method2914(arg2 ^ 0x7700002D, arg1[0]).method2491(arg2 + 10897, (int) arg3) : null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
    public static void method1902(byte arg0) {
        field4316 = null;
        if (arg0 != -72) {
            method1902((byte) 14);
        }
    }
}
