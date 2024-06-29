import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class534 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Ldr;")
    public static class675 field6732 = new class675(0, 8);

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "B")
    public static byte field6736;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)Z", line = 4)
    public static final boolean method2877(boolean arg0) {
        field6737++;
        if (arg0) {
            return class76.field1000 == 0 ? class367.field4751.method1980(0) : true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)Z", line = 19)
    public static final boolean method2878(int arg0, int arg1) {
        field6733++;
        if (arg0 != 9415) {
            field6736 = -108;
        }
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)I", line = 30)
    public static final int method2879(byte arg0) {
        field6734++;
        if (arg0 != 32) {
            field6732 = null;
        }
        return class281.method1709(2, false);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)Z", line = 41)
    public static final boolean method2880(int arg0, int arg1) {
        if (arg0 != -8897) {
            return true;
        }
        field6735++;
        if (arg1 == 21 || arg1 == 16 || arg1 == 49 || arg1 == 12 || arg1 == 18) {
            return true;
        } else {
            return arg1 == 46 || arg1 == 1009;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V", line = 60)
    public static void method2881(byte arg0) {
        int var1 = 78 % ((arg0 - 61) / 53);
        field6732 = null;
    }
}
