import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class203 extends class223 {

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public int field2940;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public int field2939;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "Lgk;")
    public static class331 field2941 = new class331("M", "M", "M", "M");

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field2942 = 500;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "[[I")
    public static int[][] field2945 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
    public static int field2948 = 0;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    public static int field2947 = -1;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "I")
    public static int field2949 = 0;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "Lbg;")
    public static class324 field2944 = new class324(29, 1);

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "F")
    public static float field2946;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "[Llb;")
    public static class378[] field2943;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public static void method1415(int arg0) {
        field2945 = null;
        field2941 = null;
        field2943 = null;
        if (arg0 != 1) {
            method1415(2);
        }
        field2944 = null;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(II)V")
    public class203(int arg0, int arg1) {
        this.field2940 = arg1;
        this.field2939 = arg0;
    }
}
