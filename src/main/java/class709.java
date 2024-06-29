import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class709 {

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
    public static int field9932;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    public static int field9933;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)V", line = 3)
    public static final void method3903(int arg0, int arg1) {
        field9933++;
        class382 var2 = class396.method2276(85, 5, arg1);
        if (arg0 > 65) {
            var2.method2228((byte) -55);
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)I", line = 19)
    public static final int method3904(int arg0, int arg1) {
        if (arg1 == 508080135) {
            field9934++;
            return arg0 >>> 7;
        } else {
            return -4;
        }
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(II)I", line = 31)
    public static final int method3905(int arg0, int arg1) {
        return class128.field2144 == null ? 0 : class128.field2144[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(CI)Z", line = 34)
    public static final boolean method3906(char arg0, int arg1) {
        field9932++;
        if (arg1 == -46) {
            return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
        } else {
            return false;
        }
    }
}
