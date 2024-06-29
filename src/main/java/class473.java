import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class473 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field6657 = 0;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2753(int arg0) {
        field6658++;
        for (class641 var1 = (class641) class716.field9763.method152((byte) -13); var1 != null; var1 = (class641) class716.field9763.method146((byte) 97)) {
            if (var1.field8639 > 1) {
                var1.field8639 = 0;
                class497.field6990.method3108(((class478) var1.field8636.field259.field8885).field6708, 16337, var1);
                var1.field8636.method153(arg0 ^ 0xFFFFC4E8);
            }
        }
        class269.field3929 = 0;
        class382.field5558 = 0;
        if (arg0 == -15151) {
            class645.field8695.method690(20134);
            class533.field7395.method1244(arg0 + 45558);
            class716.field9763.method153(119);
            class738.method4068(class84.field1201, (byte) -15);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)Z", line = 36)
    public static final boolean method2754(int arg0, byte arg1, int arg2) {
        field6655++;
        int var3 = -32 / ((arg1 - 56) / 36);
        boolean var4 = (arg2 & 0x37) == 0 ? class655.method3640(-21797, arg0, arg2) : class641.method3533(arg2, arg0, 0);
        return class143.method995(arg2, arg0, -1) | (arg0 & 0x10000) != 0 | var4;
    }
}
