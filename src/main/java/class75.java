import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class75 {

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "F")
    public static float field1103;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BJ)I", line = 8)
    public static final int method565(byte arg0, long arg1) {
        field1104++;
        return arg0 < 121 ? -127 : (int) (arg1 / 86400000L) - 11745;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 21)
    public static final void method566(int arg0, boolean arg1, String arg2) {
        field1101++;
        class476.method2904(arg2, "", "", "", arg0, -1, 0);
        if (!arg1) {
            method566(-114, true, null);
        }
    }
}
