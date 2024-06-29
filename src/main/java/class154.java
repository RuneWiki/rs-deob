import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class154 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "C")
    public static char field2401;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Led;")
    public static class186 field2402;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "[[I")
    public static int[][] field2406;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method1035(int arg0) {
        if (arg0 != 30776) {
            field2406 = null;
        }
        field2406 = null;
        field2402 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    public static final void method1036(int arg0) {
        field2403++;
        class258.field4122.method1898((byte) -119);
        if (arg0 != 2) {
            method1035(-29);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
    public static final void method1037(int arg0, int arg1) {
        if (class253.field4061 == 0) {
            class6.field122.method53(arg0, (byte) 93);
        } else {
            class179.field2783 = arg0;
        }
        if (arg1 != -129) {
            method1036(-6);
        }
        field2404++;
    }
}
