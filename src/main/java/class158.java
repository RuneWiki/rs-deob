import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class158 {

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    private int field2696;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
    public static int field2701 = 0;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "Lri;")
    public static class97 field2699;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)I", line = 5)
    public final int method1300(int arg0) {
        if (arg0 == -1) {
            field2700++;
            return this.field2696;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!hga", name = "toString", descriptor = "()Ljava/lang/String;", line = 16)
    public final String toString() {
        field2703++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(II)I", line = 24)
    public static final int method1301(int arg0, int arg1) {
        int var2 = 64 / ((-arg0 - 8) / 33);
        field2704++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)V", line = 36)
    public static void method1302(int arg0) {
        if (arg0 != 255) {
            field2702 = -61;
        }
        field2699 = null;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "([Ljava/lang/Object;I[I)V", line = 58)
    public static final void method1303(Object[] arg0, int arg1, int[] arg2) {
        class224.method1650((byte) 71, arg2.length - 1, arg0, arg1, arg2);
        field2698++;
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(II)V", line = 65)
    public class158(int arg0, int arg1) {
        this.field2697 = arg1;
        this.field2696 = arg0;
    }
}
