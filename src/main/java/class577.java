import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class577 {

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "[Lvs;")
    public static class593[] field8153;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(III)Z")
    public static final boolean method3338(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field8155++;
            return class86.method700(106, arg1, arg0) || class348.method2206(arg0, arg1, 55);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)V")
    public static void method3339(byte arg0) {
        if (arg0 == 11) {
            field8153 = null;
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(III)Lng;")
    public static final class343 method3340(int arg0, int arg1, int arg2) {
        class186 var3 = class80.field1136[arg0][arg1][arg2];
        return var3 == null || var3.field2844 == null ? null : var3.field2844;
    }

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(III)I")
    public static final int method3341(int arg0, int arg1, int arg2) {
        field8154++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (~arg0 == arg2) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }
}
