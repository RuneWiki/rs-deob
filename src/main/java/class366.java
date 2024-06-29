import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class366 extends class67 {

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Z")
    public static boolean field5400 = false;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5401 = " from your ignore list first.";

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field5402 = 0;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field5406 = 0;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "Lwh;")
    public static class288 field5403;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIB)V", line = 29)
    public static final void method2414(int arg0, int arg1, byte arg2) {
        if (arg2 <= 8) {
            method2416(true);
        }
        class385.field5632[arg0] = arg1;
        field5404++;
        class283 var3 = (class283) class377.field5517.method2826(false, (long) arg0);
        if (var3 == null) {
            class283 var4 = new class283(4611686018427387905L);
            class377.field5517.method2815(-1, (long) arg0, var4);
        } else if (var3.field4288 != 4611686018427387905L) {
            var3.field4288 = class98.method768((byte) 84) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V", line = 63)
    public static void method2415(byte arg0) {
        field5401 = null;
        field5403 = null;
        if (arg0 >= -86) {
            field5400 = false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)V", line = 80)
    public static final void method2416(boolean arg0) {
        field5405++;
        class415.field6013.method366(94);
        if (arg0) {
            field5401 = null;
        }
    }
}
