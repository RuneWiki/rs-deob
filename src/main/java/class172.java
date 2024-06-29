import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class172 extends class32 {

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Le;")
    public static class86 field2858 = new class86();

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lij;")
    private static class50 field2862 = class78.method578(127, "Nov");

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Lij;")
    private static class50 field2865 = class78.method578(122, "Dec");

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Lij;")
    private static class50 field2861 = class78.method578(122, "May");

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Lij;")
    private static class50 field2866 = class78.method578(127, "Jul");

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Lij;")
    private static class50 field2870 = class78.method578(123, "Apr");

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Lij;")
    private static class50 field2863 = class78.method578(124, "Feb");

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Lij;")
    private static class50 field2867 = class78.method578(121, "Sep");

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "Lij;")
    private static class50 field2872 = class78.method578(126, "Aug");

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Lij;")
    private static class50 field2868 = class78.method578(126, "Jan");

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Lij;")
    private static class50 field2873 = class78.method578(124, "Oct");

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "Lij;")
    private static class50 field2876 = class78.method578(121, "Jun");

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "Lij;")
    private static class50 field2874 = class78.method578(127, "Mar");

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "[Lij;")
    public static class50[] field2869 = new class50[] { field2868, field2863, field2874, field2870, field2861, field2876, field2866, field2872, field2867, field2873, field2862, field2865 };

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Lee;")
    public static class120 field2875 = new class120();

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "Lij;")
    public static class50 field2879 = class78.method578(123, "::clientdrop");

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "Z")
    public static boolean field2878 = true;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    public static int field2880 = -1;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "[I")
    public static int[] field2877 = new int[100];

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "[I")
    public static int[] field2871;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z")
    public static final boolean method1189(int arg0, int arg1) {
        field2860++;
        if (arg1 >= -89) {
            return false;
        } else if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(II)V")
    public class172(int arg0, int arg1) {
        this.field2857 = arg1;
        this.field2859 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    public static void method1190(int arg0) {
        field2867 = null;
        field2871 = null;
        field2865 = null;
        field2879 = null;
        field2875 = null;
        field2866 = null;
        field2872 = null;
        field2876 = null;
        field2877 = null;
        field2861 = null;
        field2869 = null;
        field2868 = null;
        field2870 = null;
        if (arg0 != 100) {
            return;
        }
        field2858 = null;
        field2863 = null;
        field2873 = null;
        field2874 = null;
        field2862 = null;
    }
}
