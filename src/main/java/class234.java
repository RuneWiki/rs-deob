import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class234 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "[[Z")
    public static boolean[][] field3257 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "[I")
    public static int[] field3262 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3258 = "glow3:";

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "Lir;")
    public static class185 field3260;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIILon;)V", line = 7)
    public static final void method1520(int arg0, int arg1, int arg2, class441 arg3) {
        if (class106.field1405[arg0][arg1][arg2] == null) {
            class267.method1787(arg0, arg1, arg2);
        }
        class106.field1405[arg0][arg1][arg2].field1079 = arg3;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 13)
    public static void method1521(boolean arg0) {
        field3257 = null;
        field3258 = null;
        field3260 = null;
        if (!arg0) {
            field3258 = null;
        }
        field3262 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lir;I)V", line = 30)
    public static final void method1522(class185 arg0, int arg1) {
        class402.field5872 = arg0;
        field3261++;
        if (arg1 != -13495) {
            method1520(-34, 22, 4, (class441) null);
        }
    }
}
