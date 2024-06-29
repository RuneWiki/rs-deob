import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class465 {

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "Lvd;")
    public static class36 field6457 = new class36();

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "[Ljg;")
    public static class307[] field6456;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)I", line = 7)
    public static final int method2644(int arg0, int arg1) {
        field6455++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg1 <= arg0) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V", line = 54)
    public static void method2645(byte arg0) {
        if (arg0 == 116) {
            field6456 = null;
            field6457 = null;
        }
    }
}
