import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class10 {

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field130 = 0;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "Lmf;")
    public static class409 field128 = new class409();

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "[F")
    public static float[] field132 = new float[4];

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "Lvo;")
    public static class345 field129;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V", line = 11)
    public static final void method56(int arg0, int arg1) {
        field131++;
        class580.field8512.method939(28093, arg1);
        class638.field9056.method939(28093, arg1);
        class477.field6828.method939(28093, arg1);
        int var2 = 74 / ((53 - arg0) / 42);
        class241.field3538.method939(28093, arg1);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 26)
    public static void method57(int arg0) {
        field128 = null;
        field129 = null;
        if (arg0 != 0) {
            field132 = null;
        }
        field132 = null;
    }
}
