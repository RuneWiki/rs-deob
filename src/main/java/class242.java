import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class242 extends class270 {

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public int field3145;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Z")
    public static boolean field3143 = false;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "[[[B")
    public static byte[][][] field3146;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1401(boolean arg0) {
        field3146 = null;
        if (!arg0) {
            field3143 = true;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(III)Lht;", line = 20)
    public static final class530 method1402(int arg0, int arg1, int arg2) {
        if (arg0 >= -22) {
            method1402(-106, -65, 121);
        }
        field3144++;
        class530 var3 = (class530) class472.field6582.method3234((byte) -44, (long) arg1 << 32 | (long) arg2);
        if (var3 == null) {
            var3 = new class530(arg1, arg2);
            class472.field6582.method3235(var3.field3405, -1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(II)V", line = 41)
    public class242(int arg0, int arg1) {
        this.field3147 = arg0;
        this.field3145 = arg1;
    }
}
