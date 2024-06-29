import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class269 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[I")
    public static int[] field4002 = new int[1];

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field4005 = 0;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Laj;")
    public static class287 field4003 = new class287(64);

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "[[Z")
    public static boolean[][] field4007 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!tf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4004++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method1752(int arg0) {
        field4007 = null;
        if (arg0 > 66) {
            field4002 = null;
            field4003 = null;
        }
    }
}
