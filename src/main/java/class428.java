import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class428 {

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field6016 = 0;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "[I")
    public static int[] field6018 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method2547(int arg0) {
        field6020++;
        if (arg0 != 0) {
            method2549(110, -5, -128);
        }
        return class544.field7649 == this | class310.field4615 == this;
    }

    @OriginalMember(owner = "client!rm", name = "toString", descriptor = "()Ljava/lang/String;", line = 18)
    public final String toString() {
        field6019++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 32)
    public static void method2548(int arg0) {
        field6018 = null;
        if (arg0 != 0) {
            field6018 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)Z", line = 43)
    public static final boolean method2549(int arg0, int arg1, int arg2) {
        if (arg0 != -32443) {
            field6015 = -68;
        }
        field6021++;
        return (class119.method831(arg1, arg2, arg0 + 32443) | class22.method166(arg2, (byte) -115, arg1) | class642.method3648(arg2, arg1, -27464)) & class182.method1364(arg1, -106, arg2);
    }
}
