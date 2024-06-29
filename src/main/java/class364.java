import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class364 {

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Z")
    public static boolean field5108 = false;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Z")
    public static final boolean method2273(int arg0, int arg1, int arg2) {
        field5107++;
        if (arg0 != 4) {
            method2273(-76, -19, -64);
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        class414 var3 = class66.field1181.method131(2, arg1);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method2520((byte) 109, arg2);
    }
}
