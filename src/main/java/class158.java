import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class158 extends class307 {

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "Lqd;")
    public class40 field2641;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "[I")
    public static int[] field2643 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "Lpl;")
    public static class186 field2642 = new class186(100);

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Lpl;")
    public static class186 field2646 = new class186(50);

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "Lqd;")
    public static class40 field2647 = class147.method1106("Konfig geladen)3", (byte) -68);

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public static int field2648 = 2301979;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "Lce;")
    public static class239 field2644;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "Lwd;")
    public static class75 field2639;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "[[Lwe;")
    public static class47[][] field2645;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 7)
    public static void method1217(byte arg0) {
        field2642 = null;
        field2644 = null;
        field2639 = null;
        field2643 = null;
        field2647 = null;
        field2646 = null;
        field2645 = (class47[][]) null;
        if (arg0 > -125) {
            method1217((byte) 39);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 24)
    public class158() {
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lqd;I)V", line = 28)
    public class158(class40 arg0, int arg1) {
        this.field2641 = arg0;
    }
}
