import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class179 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field2983 = 0;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lij;")
    public static class50 field2985 = class78.method578(124, "mapfunction");

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lij;")
    public static class50 field2986 = class78.method578(125, "headicons_pk");

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lij;")
    public static class50 field2987 = class78.method578(122, "::fpsoff");

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[I")
    public static int[] field2988 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[[[I")
    public static int[][][] field2984;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method1221(byte arg0) {
        field2986 = null;
        field2987 = null;
        if (arg0 != 73) {
            field2985 = null;
        }
        field2984 = null;
        field2985 = null;
        field2988 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lij;B)Lij;")
    public static final class50 method1222(class50 arg0, byte arg1) {
        class129 var2 = class8.method49(true, arg0);
        field2982++;
        if (arg1 >= -90) {
            method1221((byte) 39);
        }
        return var2 == null ? class35.field681 : var2.field2263;
    }
}
