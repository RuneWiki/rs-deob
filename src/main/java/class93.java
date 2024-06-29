import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class93 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Lfo;")
    public static class22 field1153 = new class22(12, 4);

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBI)I")
    public static final int method535(int arg0, byte arg1, int arg2) {
        field1155++;
        if (arg1 != -31) {
            field1153 = null;
        }
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg0 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method536(int arg0) {
        field1153 = null;
        if (arg0 != 1) {
            method536(-46);
        }
    }
}
