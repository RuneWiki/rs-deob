import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class162 {

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Z")
    public boolean field2903 = true;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public int field2898;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public int field2896;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public int field2906;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public int field2894;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public int field2908;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lr;")
    public static class66 field2895 = null;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Lr;")
    public static class66 field2900 = class93.method641(43, "p12_full");

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field2899 = 0;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Lr;")
    public static class66 field2904 = class93.method641(43, "(U5");

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "[[I")
    public static int[][] field2907 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lqc;")
    public static class245 field2901 = new class245(50);

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "[I")
    public static int[] field2911 = new int[2];

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "Lr;")
    private static class66 field2912 = class93.method641(43, " more options");

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Lr;")
    public static class66 field2914 = field2912;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "Lsg;")
    public static class247 field2913;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Z")
    public static boolean field2909;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "[[B")
    public static byte[][] field2910;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method1093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field2905++;
        int var8 = class54.method368(arg1, class222.field3788, (byte) 114, class241.field4186);
        int var9 = class54.method368(arg5, class222.field3788, (byte) 114, class241.field4186);
        int var10 = class54.method368(arg7, class215.field3706, (byte) 114, class165.field2972);
        int var11 = class54.method368(arg2, class215.field3706, (byte) 114, class165.field2972);
        int var12 = class54.method368(arg0 + arg1, class222.field3788, (byte) 114, class241.field4186);
        int var13 = class54.method368(arg5 - arg0, class222.field3788, (byte) 114, class241.field4186);
        for (int var14 = var8; var14 < var12; var14++) {
            class194.method1266(var10, (byte) -17, arg4, class15.field183[var14], var11);
        }
        if (arg6) {
            field2899 = 118;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class194.method1266(var10, (byte) -17, arg4, class15.field183[var15], var11);
        }
        int var16 = class54.method368(arg7 + arg0, class215.field3706, (byte) 114, class165.field2972);
        int var17 = class54.method368(arg2 - arg0, class215.field3706, (byte) 114, class165.field2972);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class15.field183[var18];
            class194.method1266(var10, (byte) -17, arg4, var19, var16);
            class194.method1266(var16, (byte) -17, arg3, var19, var17);
            class194.method1266(var17, (byte) -17, arg4, var19, var11);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static void method1094(byte arg0) {
        field2913 = null;
        field2904 = null;
        field2911 = null;
        field2895 = null;
        field2914 = null;
        field2907 = null;
        field2900 = null;
        field2910 = null;
        field2912 = null;
        if (arg0 > 17) {
            field2901 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)I")
    public static final int method1095(int arg0) {
        int var1 = 121 / ((63 - arg0) / 46);
        field2897++;
        return 6;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2898 = arg1;
        this.field2903 = arg6;
        this.field2896 = arg5;
        this.field2902 = arg4;
        this.field2906 = arg2;
        this.field2894 = arg3;
        this.field2908 = arg0;
    }
}
