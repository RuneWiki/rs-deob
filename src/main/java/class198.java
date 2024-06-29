import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class198 extends class570 {

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    private int field3076;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    private int field3093;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    private int field3086;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    private int field3095;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field3088 = 50;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
    public static int[] field3079 = new int[field3088];

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "[I")
    public static int[] field3085 = new int[field3088];

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "[I")
    public static int[] field3082 = new int[32];

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[I")
    public static int[] field3073 = new int[field3088];

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field3091 = new String[field3088];

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Z")
    public static boolean field3089 = false;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "[I")
    public static int[] field3083 = new int[field3088];

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "[I")
    public static int[] field3092 = new int[field3088];

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "[I")
    public static int[] field3084 = new int[field3088];

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lqfa;")
    public static class85 field3078 = new class85(18, -1);

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "F")
    public static float field3087;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lia;")
    public static class547 field3075;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "[[I")
    public static int[][] field3080;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method1420(int arg0) {
        field3085 = null;
        field3073 = null;
        field3080 = null;
        int var1 = 0 % ((arg0 - 46) / 36);
        field3092 = null;
        field3082 = null;
        field3083 = null;
        field3078 = null;
        field3075 = null;
        field3091 = null;
        field3079 = null;
        field3084 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
    public final void method280(int arg0, int arg1, int arg2) {
        ++field3074;
        int var4 = this.field3093 * arg0 >> 12;
        if (arg1 == 38) {
            int var5 = this.field3086 * arg0 >> 12;
            int var6 = this.field3095 * arg2 >> 12;
            int var7 = this.field3076 * arg2 >> 12;
            class498.method2972(var6, var5, var7, var4, 4, super.field8296);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIII)V")
    public class198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3076 = arg3;
        this.field3093 = arg0;
        this.field3086 = arg2;
        this.field3095 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3077;
        int var8 = arg1 + -334;
        if (~var8 <= -1) {
            if (~var8 < -101) {
                var8 = 100;
            }
        } else {
            var8 = 0;
        }
        int var9 = (-class649.field9359 + class447.field6434) * var8 / 100 + class649.field9359;
        if (arg7 < 80) {
            field3083 = null;
        }
        int var10 = arg2 * var9 >> 8;
        int var11 = 16383 & 16384 - arg0;
        int var12 = 16383 & -arg4 + 16384;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (~var11 != -1) {
            var14 = class509.field7210[var11] * -var10 >> 14;
            var15 = class509.field7220[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class509.field7210[var12] * var15 >> 14;
            var15 = class509.field7220[var12] * var15 >> 14;
        }
        class517.field7300 = arg4;
        class596.field8558 = 0;
        class499.field7113 = arg0;
        class1.field97 = -var14 + arg6;
        class206.field3158 = -var13 + arg5;
        class537.field7518 = -var15 + arg3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZI)V")
    public final void method282(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field3080 = null;
        }
        ++field3081;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII[BIZI[B)V")
    public static final void method1422(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, boolean arg6, int arg7, byte[] arg8) {
        ++field3090;
        int var9 = -(arg3 >> 2);
        int var10 = -(3 & arg3);
        for (int var11 = -arg5; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg2++;
                arg8[var10001] += arg4[arg0++];
                int var14 = arg2++;
                arg8[var14] += arg4[arg0++];
                int var15 = arg2++;
                arg8[var15] += arg4[arg0++];
                int var16 = arg2++;
                arg8[var16] += arg4[arg0++];
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg2++;
                arg8[var10001] += arg4[arg0++];
            }
            arg0 += arg1;
            arg2 += arg7;
        }
        if (!arg6) {
            method1422(-2, 35, -128, -9, (byte[]) null, -3, true, 41, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB)V")
    public final void method279(int arg0, int arg1, byte arg2) {
        ++field3094;
        int var4 = this.field3093 * arg1 >> 12;
        int var5 = this.field3086 * arg1 >> 12;
        int var6 = this.field3095 * arg0 >> 12;
        if (arg2 == 127) {
            int var7 = this.field3076 * arg0 >> 12;
            class238.method1584((byte) 29, var7, var4, super.field8296, var6, super.field8297, super.field8298, var5);
        }
    }
}
