import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class163 {

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "[[I")
    public int[][] field2887 = new int[6][258];

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "[I")
    public int[] field2897 = new int[257];

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "[[I")
    public int[][] field2889 = new int[6][258];

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "[I")
    public int[] field2885 = new int[6];

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "[[B")
    public byte[][] field2901 = new byte[6][258];

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "[Z")
    public boolean[] field2903 = new boolean[16];

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "[B")
    public byte[] field2896 = new byte[4096];

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "[[I")
    public int[][] field2912 = new int[6][258];

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "[B")
    public byte[] field2909 = new byte[18002];

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "[I")
    public int[] field2913 = new int[256];

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public int field2916 = 0;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "[Z")
    public boolean[] field2898 = new boolean[256];

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "[B")
    public byte[] field2904 = new byte[256];

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "[B")
    public byte[] field2890 = new byte[18002];

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public int field2908 = 0;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "[I")
    public int[] field2919 = new int[16];

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Lha;")
    public static class46 field2888 = class271.method1828("(U", -46);

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "Lha;")
    public static class46 field2911 = class271.method1828("(U (X", -46);

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static volatile int field2882 = 0;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "Lha;")
    public static class46 field2907 = class271.method1828("null", -46);

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "B")
    public byte field2915;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public int field2881;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public int field2883;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public int field2884;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public int field2892;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public int field2894;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public int field2899;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public int field2906;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public int field2918;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
    public int field2920;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lpi;")
    public static class181 field2886;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "Ljh;")
    public static class238 field2914;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "[B")
    public byte[] field2910;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "[B")
    public byte[] field2917;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method1181(byte arg0) {
        field2886 = null;
        field2888 = null;
        if (arg0 <= -33) {
            field2911 = null;
            field2907 = null;
            field2914 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class265 var20 = new class265(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class111.field2080[var21][arg1][arg2] == null) {
                    class111.field2080[var21][arg1][arg2] = new class201(var21, arg1, arg2);
                }
            }
            class111.field2080[arg0][arg1][arg2].field3590 = var20;
        } else if (arg3 == 1) {
            class265 var22 = new class265(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class111.field2080[var23][arg1][arg2] == null) {
                    class111.field2080[var23][arg1][arg2] = new class201(var23, arg1, arg2);
                }
            }
            class111.field2080[arg0][arg1][arg2].field3590 = var22;
        } else {
            class59 var24 = new class59(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class111.field2080[var25][arg1][arg2] == null) {
                    class111.field2080[var25][arg1][arg2] = new class201(var25, arg1, arg2);
                }
            }
            class111.field2080[arg0][arg1][arg2].field3599 = var24;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
    public static final void method1183(byte arg0) {
        field2902++;
        if (arg0 != -7) {
            method1182(3, -45, 117, 21, 122, 52, -91, 19, -86, 82, 85, 69, 8, 29, 124, 119, -51, -76, 29, -67);
        }
        class215.field3815.method83(arg0 + 25223);
        class17.field250.method83(25216);
    }
}
