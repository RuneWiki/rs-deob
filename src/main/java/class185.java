import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class185 {

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIZ)Z", line = 5)
    public static final boolean method1080(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return true;
        } else {
            field2306++;
            return (arg1 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIB)I", line = 17)
    public static final int method1081(int arg0, int arg1, byte arg2) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        field2307++;
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        if (arg2 > -94) {
            method1081(-120, -116, (byte) -4);
        }
        return arg1;
    }
}
