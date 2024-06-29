import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class175 {

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field2400 = 1;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[I")
    public static int[] field2398 = new int[1];

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lwt;")
    public static class194 field2399 = new class194("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!s", name = "a", descriptor = "C")
    public char field2396;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lae;II)V", line = 3)
    private final void method1096(class156 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2396 = class207.method1279(1, arg0.method946(arg2 + 100));
        } else if (arg1 == 2) {
            this.field2400 = 0;
        }
        if (arg2 != 0) {
            this.method1097((byte) -6, null);
        }
        field2397++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLae;)V", line = 26)
    public final void method1097(byte arg0, class156 arg1) {
        field2401++;
        while (true) {
            int var3 = arg1.method941((byte) 126);
            if (var3 == 0) {
                if (arg0 == 118) {
                    return;
                } else {
                    field2399 = null;
                    return;
                }
            }
            this.method1096(arg1, var3, 0);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 48)
    public static void method1098(int arg0) {
        if (arg0 < -17) {
            field2398 = null;
            field2399 = null;
        }
    }
}
