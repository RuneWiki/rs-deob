import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class120 extends class67 {

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "[I")
    public static int[] field2792 = new int[100];

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "B")
    public static byte field2791 = 0;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "Lrd;")
    public static class114 field2795 = class84.method656("Hidden)2use", (byte) 125);

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field2802 = 0;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "[Lkc;")
    public static class71[] field2808 = new class71[4];

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "Lrd;")
    private static class114 field2790 = class84.method656("Unexpected loginserver response)3", (byte) 124);

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "Lrd;")
    public static class114 field2803 = null;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "[Lid;")
    public static class60[] field2810 = new class60[2048];

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "Lrd;")
    private static class114 field2789 = class84.method656("Loaded config", (byte) 123);

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "Lrd;")
    public static class114 field2815 = field2790;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "Lrd;")
    private static class114 field2816 = class84.method656("Unable to connect)3", (byte) 126);

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "Lrd;")
    public static class114 field2788 = field2789;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "Lrd;")
    public static class114 field2811 = field2816;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "Lrd;")
    public static class114 field2798 = field2816;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "Lpb;")
    public static class100 field2804;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "Lpb;")
    public static class100 field2813;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "Ljd;")
    public static class66 field2799;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "[I")
    public int[] field2801;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "[I")
    public int[] field2805;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "[I")
    public int[] field2809;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "[I")
    public static int[] field2814;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "[Lma;")
    public class81[] field2797;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "[Lma;")
    public class81[] field2807;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "[[[B")
    public byte[][][] field2812;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method937(byte arg0) {
        field2814 = null;
        field2792 = null;
        field2795 = null;
        field2789 = null;
        field2815 = null;
        field2804 = null;
        field2811 = null;
        field2816 = null;
        field2798 = null;
        field2803 = null;
        field2788 = null;
        field2790 = null;
        field2808 = null;
        if (arg0 > -24) {
            field2813 = null;
        }
        field2810 = null;
        field2799 = null;
        field2813 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
    public static final void method938(int arg0, int arg1) {
        class142.method1138(0, 1, null, arg0, false);
        if (arg1 == 17923) {
            field2800++;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)I")
    public static int method939(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
