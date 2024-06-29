import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class204 {

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lkga;")
    private class506 field2451;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Ljk;")
    public static class585 field2449 = new class585(73, -1);

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIII)Z", line = 6)
    public static final boolean method1235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2453++;
        if (arg7 >= (arg6 + arg3) || arg6 >= arg2 + arg7) {
            return false;
        } else if (arg0 + arg8 > arg5 && (arg4 + arg5) > arg8) {
            if (arg1 != -30503) {
                field2448 = 87;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 28)
    public static void method1236(int arg0) {
        if (arg0 != 73) {
            method1236(57);
        }
        field2449 = null;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lkga;II)V", line = 37)
    public class204(class506 arg0, int arg1, int arg2) {
        this.field2452 = arg2;
        this.field2451 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "finalize", descriptor = "()V", line = 48)
    protected final void finalize() throws Throwable {
        field2450++;
        this.field2451.method2990(125, this.field2452);
        super.finalize();
    }
}
