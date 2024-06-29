import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class124 extends class324 {

    @OriginalMember(owner = "client!lfa", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field1927;

    @OriginalMember(owner = "client!lfa", name = "D", descriptor = "[I")
    public static int[] field1924 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!lfa", name = "B", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!lfa", name = "C", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!lfa", name = "E", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!lfa", name = "F", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!lfa", name = "I", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!lfa", name = "H", descriptor = "Lwia;")
    public static class791 field1928;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "(B)V")
    public static final void method937(byte arg0) {
        class364.method2285();
        if (arg0 <= 65) {
            field1922 = -8;
        }
        field1923++;
    }

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method938(int arg0) {
        if (arg0 != 2) {
            field1922 = -75;
        }
        field1926++;
        return this.field1927;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)Z")
    public final boolean method939(int arg0) {
        field1929++;
        if (arg0 != 8519) {
            method940(15);
        }
        return false;
    }

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "(I)V")
    public static void method940(int arg0) {
        field1928 = null;
        if (arg0 <= -88) {
            field1924 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class124(Object arg0, int arg1) {
        super(arg1);
        this.field1927 = arg0;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(III)Z")
    public static final boolean method941(int arg0, int arg1, int arg2) {
        if (arg0 != 4) {
            method937((byte) -104);
        }
        field1925++;
        if (arg2 >= 0 && arg1 >= 0 && class190.field2932[1].length > arg2 && arg1 < class190.field2932[1][arg2].length) {
            return (class190.field2932[1][arg2][arg1] & 0x2) != 0;
        } else {
            return false;
        }
    }
}
