import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class235 {

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public int field3419;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Lqe;")
    public static class469 field3418 = new class469(67, 2);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!fa", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field3417++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)I", line = 16)
    public static final int method1561(boolean arg0) {
        if (!arg0) {
            return 59;
        }
        field3413++;
        int var1 = class647.field9127.method416((byte) -34);
        if (var1 < (class88.field1263.length - 1)) {
            class647.field9127 = class88.field1263[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 37)
    public static void method1562(int arg0) {
        if (arg0 <= 55) {
            field3418 = null;
        }
        field3418 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V", line = 51)
    public static final void method1563(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 100) {
            method1563(101, 42, 9, 90, 60);
        }
        for (int var5 = 0; var5 < class196.field2983; var5++) {
            Rectangle var6 = class184.field2816[var5];
            if (arg2 < var6.x + var6.width && var6.x < (arg2 + arg3) && arg4 < (var6.y + var6.height) && (arg1 + arg4) > var6.y) {
                class228.field3352[var5] = true;
            }
        }
        field3414++;
        class497.method2963(arg1 + arg4, arg2 + arg3, (byte) -123, arg4, arg2);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIII)V", line = 74)
    public class235(int arg0, int arg1, int arg2, int arg3) {
        this.field3415 = arg2;
        this.field3419 = arg3;
        this.field3416 = arg1;
        this.field3412 = arg0;
    }
}
