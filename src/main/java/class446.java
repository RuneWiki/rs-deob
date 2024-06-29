import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class446 implements class104 {

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public int field5732;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field5735 = 2;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "[I")
    public static int[] field5736 = new int[4];

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "B")
    public static byte field5733;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    public static void method2524(int arg0) {
        field5736 = null;
        if (arg0 <= 52) {
            method2524(32);
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I)V")
    public class446(int arg0) {
        this.field5732 = arg0;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Lfl;")
    public final class103 method318(int arg0) {
        field5734++;
        if (arg0 != -26207) {
            this.method318(6);
        }
        return class625.field8740;
    }
}
