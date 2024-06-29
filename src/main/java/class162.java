import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class162 extends class86 {

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "[Lha;")
    public static class46[] field2855 = new class46[500];

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Lwe;")
    public static class75 field2853 = new class75(new byte[5000]);

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "Lha;")
    private static class46 field2858 = class271.method1828("Nov", -46);

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "Lha;")
    private static class46 field2860 = class271.method1828("Dec", -46);

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "Lha;")
    private static class46 field2865 = class271.method1828("Jan", -46);

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "Lha;")
    private static class46 field2867 = class271.method1828("Loaded wordpack", -46);

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "Lha;")
    private static class46 field2866 = class271.method1828("Jul", -46);

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "Lha;")
    private static class46 field2868 = class271.method1828("May", -46);

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "Lha;")
    private static class46 field2869 = class271.method1828("Jun", -46);

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Lha;")
    public static class46 field2861 = field2867;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Lha;")
    private static class46 field2856 = class271.method1828("Feb", -46);

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Lha;")
    private static class46 field2859 = class271.method1828("Oct", -46);

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Lha;")
    private static class46 field2864 = class271.method1828("Aug", -46);

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "Lha;")
    private static class46 field2863 = class271.method1828("Apr", -46);

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "Lha;")
    private static class46 field2872 = class271.method1828("Mar", -46);

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "Lha;")
    private static class46 field2870 = class271.method1828("Sep", -46);

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "[Lha;")
    public static class46[] field2862 = new class46[] { field2865, field2856, field2872, field2863, field2868, field2869, field2866, field2864, field2870, field2859, field2858, field2860 };

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "Laa;")
    public static class39 field2871 = new class39();

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Lha;")
    public static class46 field2873 = class271.method1828("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", -46);

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "[I")
    public static int[] field2877 = new int[4096];

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "Lha;")
    private static class46 field2875 = class271.method1828("red:", -46);

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "[Z")
    public static boolean[] field2878 = new boolean[112];

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "Lha;")
    public static class46 field2879 = field2875;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "Lha;")
    public static class46 field2876 = field2875;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "Lha;")
    public static class46 field2880 = class271.method1828("cookieprefix", -46);

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "[Lrk;")
    public static class179[] field2854;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "[[[B")
    public static byte[][][] field2874;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method1179(byte arg0) {
        field2862 = null;
        field2863 = null;
        field2879 = null;
        field2861 = null;
        field2871 = null;
        field2880 = null;
        field2864 = null;
        field2872 = null;
        field2876 = null;
        field2865 = null;
        field2875 = null;
        field2856 = null;
        field2858 = null;
        field2877 = null;
        field2859 = null;
        field2873 = null;
        field2878 = null;
        field2868 = null;
        field2870 = null;
        if (arg0 < 93) {
            return;
        }
        field2869 = null;
        field2855 = null;
        field2867 = null;
        field2874 = null;
        field2860 = null;
        field2866 = null;
        field2854 = null;
        field2853 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)I")
    public static final int method1180(int arg0, int arg1, int arg2) {
        int var3 = -2 / ((10 - arg2) / 57);
        int var4 = 1;
        field2857++;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var4 = arg0 * var4;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var4;
        } else {
            return var4;
        }
    }
}
