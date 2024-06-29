import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class212 {

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "Z")
    public static boolean field3041 = false;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!rt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3043++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)I")
    public final int method1358(int arg0, int arg1, int arg2) {
        field3042++;
        int var4 = arg2 >= class627.field8461 ? arg2 : class627.field8461;
        if (class508.field6779 == this) {
            return 0;
        } else if (class410.field5539 == this) {
            return var4 - arg1;
        } else if (class201.field2926 == this) {
            return (var4 - arg1) / 2;
        } else if (arg0 == 0) {
            return 0;
        } else {
            return -53;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZIIZ)V")
    public static final void method1359(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field3044++;
        if (!arg1) {
            return;
        }
        class310.field4270 = 0L;
        int var5 = class662.method3719(-1);
        if (arg0 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class10.field197.method452()) {
            arg4 = true;
        }
        class370.method2178(arg4, var5, arg3, arg0, arg2, (byte) 117);
    }
}
