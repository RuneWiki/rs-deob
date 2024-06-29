import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class165 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[[I")
    public int[][] field3120 = new int[6][258];

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public int field3122 = 0;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "[[I")
    public int[][] field3125 = new int[6][258];

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "[B")
    public byte[] field3131 = new byte[256];

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "[[I")
    public int[][] field3134 = new int[6][258];

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "[I")
    public int[] field3147 = new int[16];

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public int field3127 = 0;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "[Z")
    public boolean[] field3152 = new boolean[16];

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "[[B")
    public byte[][] field3135 = new byte[6][258];

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "[Z")
    public boolean[] field3153 = new boolean[256];

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "[B")
    public byte[] field3157 = new byte[18002];

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "[I")
    public int[] field3126 = new int[6];

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "[B")
    public byte[] field3159 = new byte[4096];

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "[I")
    public int[] field3156 = new int[256];

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "[I")
    public int[] field3149 = new int[257];

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "[B")
    public byte[] field3160 = new byte[18002];

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Ldc;")
    private static class37 field3136 = class185.method1233((byte) 86, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Ldc;")
    public static class37 field3130 = field3136;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Ldc;")
    public static class37 field3133 = class185.method1233((byte) 86, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "Ldc;")
    public static class37 field3150 = class185.method1233((byte) 86, "(U2");

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "Ldc;")
    private static class37 field3154 = class185.method1233((byte) 86, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "Ldc;")
    public static class37 field3143 = field3154;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "Ldc;")
    public static class37 field3145 = class185.method1233((byte) 86, "headicons_prayer");

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "B")
    public byte field3138;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public int field3124;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public int field3128;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public int field3144;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public int field3161;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "J")
    public static long field3151;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "[B")
    public byte[] field3139;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "[B")
    public byte[] field3146;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[S")
    public static short[] field3129;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
    public static final int method1111(int arg0, int arg1) {
        field3148++;
        int var2 = 116 / ((33 - arg0) / 51);
        return arg1 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3118++;
        if (arg3 < 128 || arg7 < 128 || arg3 > 13056 || arg7 > 13056) {
            class38.field802 = -1;
            class218.field4074 = -1;
            return;
        }
        int var8 = class145.method1008(class125.field2246, arg3, arg7, (byte) -123) - arg1;
        int var9 = arg3 - class6.field71;
        int var10 = arg7 - class118.field2112;
        int var11 = var8 - class166.field3169;
        int var12 = class169.field3211[class92.field1587];
        int var13 = class169.field3220[class25.field434];
        int var14 = class169.field3211[class25.field434];
        int var15 = var9 * var13 + var10 * var14 >> 16;
        int var16 = class169.field3220[class92.field1587];
        int var17 = var10 * var13 - var9 * var14 >> 16;
        int var19 = var11 * var16 - var12 * var17 >> 16;
        int var20 = var11 * var12 + var16 * var17 >> 16;
        if (arg5 != -16734) {
            method1113(true);
        }
        if (var20 < 50) {
            class38.field802 = -1;
            class218.field4074 = -1;
        } else {
            class38.field802 = arg6 + (var15 << 9) / var20;
            class218.field4074 = arg0 + (var19 << 9) / var20;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static void method1113(boolean arg0) {
        field3130 = null;
        field3145 = null;
        field3154 = null;
        if (arg0) {
            field3150 = null;
        }
        field3150 = null;
        field3143 = null;
        field3129 = null;
        field3136 = null;
        field3133 = null;
    }
}
