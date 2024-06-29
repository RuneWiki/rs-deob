import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class441 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field6298 = -1;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILha;Z)Lda;")
    public static final class67 method2663(int arg0, int arg1, class66 arg2, boolean arg3) {
        field6299++;
        if (arg0 != 1) {
            field6300 = 123;
        }
        class461 var4 = class263.method1732(arg3, (byte) 114, arg2, arg1);
        return var4 == null ? null : var4.field6590;
    }
}
