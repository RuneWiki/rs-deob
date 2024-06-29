import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "Lnga;")
    public static class510 field16 = new class510(10);

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "J")
    public static long field19 = 0L;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field20 = 0;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "Ljg;")
    public static class338 field21 = new class338();

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "[I")
    public static int[] field15;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "[Lkr;")
    public static class743[] field18;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIBI)V", line = 9)
    public static final void method6(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field17++;
        if (arg3 <= 32) {
            field15 = null;
        }
        int var5 = class130.field1947;
        if (var5 == 0) {
            return;
        }
        if (var5 == 1) {
            class159.field2374 = arg4;
            class179.field2576 = arg2;
            class130.field1947 = 2;
            class30.field405 = arg0;
            class715.field9989 = arg1;
        } else if (var5 == 2) {
            if (class179.field2576 > arg2) {
                class179.field2576 = arg2;
            }
            if (class715.field9989 > arg1) {
                class715.field9989 = arg1;
            }
            if (arg4 > class159.field2374) {
                class159.field2374 = arg4;
            }
            if (class30.field405 < arg0) {
                class30.field405 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 74)
    public static void method7(int arg0) {
        field15 = null;
        field21 = null;
        field18 = null;
        field16 = null;
        if (arg0 != -3) {
            field21 = null;
        }
    }
}
