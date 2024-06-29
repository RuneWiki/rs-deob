import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class182 extends class159 {

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "Ljava/lang/String;")
    public String field2826;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "[Z")
    public static boolean[] field2830 = new boolean[8];

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field2824 = 127;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "[I")
    public static int[] field2827 = new int[1000];

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field2825 = 0;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field2832 = 50;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Lui;")
    public static class98 field2831 = new class98(500);

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2834 = "Use";

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "[[I")
    public static int[][] field2835 = new int[5][5000];

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)I", line = 6)
    public static final int method1265(byte arg0, int arg1) {
        field2828++;
        return arg0 == -12 ? arg1 & 0xFF : -87;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 19)
    public static void method1266(byte arg0) {
        field2831 = null;
        field2834 = null;
        field2835 = (int[][]) null;
        field2827 = null;
        field2830 = null;
        if (arg0 != 81) {
            field2833 = -92;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 43)
    public class182() {
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([Ljava/lang/String;I[S)V", line = 56)
    public static final void method1267(String[] arg0, int arg1, short[] arg2) {
        field2823++;
        class281.method1994(arg1, arg2, arg0.length - 1, arg0, 112);
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 73)
    public class182(String arg0) {
        this.field2826 = arg0;
    }
}
