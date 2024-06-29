import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class204 extends class467 {

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public int field2864 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public int field2862 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public int field2863 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public int field2872 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public int field2868 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public int field2870 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public int field2865 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public int field2869 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "Lps;")
    public class5 field2867;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Lpg;")
    public static class492 field2860 = new class492(59, -1);

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    public static int field2873 = 0;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "[I")
    public static int[] field2874 = new int[3];

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "[Lna;")
    public static class206[] field2871;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "[Lsc;")
    public static class29[] field2866;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public static void method1415(int arg0) {
        field2871 = null;
        if (arg0 == Integer.MIN_VALUE) {
            field2860 = null;
            field2866 = null;
            field2874 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1416(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field2874 = null;
        }
        field2861++;
        if (this.field2864 <= arg1 && arg1 <= this.field2862 && arg0 >= this.field2868 && this.field2865 >= arg0) {
            return true;
        } else {
            return arg1 >= this.field2870 && this.field2869 >= arg1 && this.field2863 <= arg0 && arg0 <= this.field2872;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lps;)V")
    public class204(class5 arg0) {
        this.field2867 = arg0;
    }
}
