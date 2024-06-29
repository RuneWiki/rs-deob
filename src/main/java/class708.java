import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class708 {

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field9966 = 503;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "Lus;")
    public static class328 field9964 = new class328(51, 8);

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "J")
    public static long field9970 = 0L;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "[I")
    public static int[] field9969 = new int[14];

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field9965;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field9967;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "[Lfc;")
    public static class615[] field9968;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 3)
    public static void method3913(byte arg0) {
        field9969 = null;
        field9968 = null;
        field9964 = null;
        int var1 = 1 / ((arg0 + 74) / 39);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 15)
    public static final void method3914(int arg0) {
        if (arg0 != 2) {
            return;
        }
        field9965++;
        int var1 = 0;
        if (class223.field2944 != null) {
            var1 = class223.field2944.field626.method1211((byte) -125);
        }
        if (var1 == 2) {
            int var2 = class538.field7556 <= 800 ? class538.field7556 : 800;
            class599.field8320 = var2;
            int var3 = class706.field9947 > 600 ? 600 : class706.field9947;
            class204.field2591 = (class538.field7556 - var2) / 2;
            class84.field1083 = var3;
            class652.field8972 = 0;
        } else if (var1 == 1) {
            int var4 = class538.field7556 <= 1024 ? class538.field7556 : 1024;
            class599.field8320 = var4;
            int var5 = class706.field9947 > 768 ? 768 : class706.field9947;
            class204.field2591 = (class538.field7556 - var4) / 2;
            class84.field1083 = var5;
            class652.field8972 = 0;
        } else {
            class599.field8320 = class538.field7556;
            class84.field1083 = class706.field9947;
            class204.field2591 = 0;
            class652.field8972 = 0;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZI)Z", line = 65)
    public static final boolean method3915(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field9964 = null;
        }
        field9967++;
        return (arg0 & 0x84080) != 0;
    }
}
