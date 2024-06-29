import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class139 {

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Lwn;")
    public static class177 field2094;

    @OriginalMember(owner = "client!ne", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field2096++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 17)
    public static void method1013(int arg0) {
        if (arg0 == -21735) {
            field2094 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V", line = 31)
    public static final void method1014(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2095++;
        if (arg5 != 5719) {
            field2094 = null;
        }
        if (arg2 == arg3) {
            class415.method2599(arg0, (byte) -122, arg1, arg2, arg4);
        } else if (class232.field3492 <= arg0 - arg2 && class36.field453 >= arg0 + arg2 && arg1 - arg3 >= class487.field7124 && class232.field3493 >= (arg1 + arg3)) {
            class70.method609(arg3, (byte) -108, arg1, arg4, arg0, arg2);
        } else {
            class367.method2333((byte) 105, arg3, arg1, arg0, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 56)
    public class139(String arg0, int arg1) {
        this.field2097 = arg1;
    }
}
