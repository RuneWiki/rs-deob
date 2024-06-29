import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class202 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field3201 = 0;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field3205 = 0;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field3204 = 0;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lth;")
    public static class80 field3206;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 27)
    public static void method1407(byte arg0) {
        if (arg0 == 3) {
            field3206 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V", line = 43)
    public static final void method1408(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = class93.field1690[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class20 var5 = var4.field225;
        if (var5 != null) {
            var5.field342 = var5.field342 * arg3 / 16;
            var5.field333 = var5.field333 * arg3 / 16;
        }
    }
}
