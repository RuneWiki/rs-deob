import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 extends class207 {

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "[I")
    public int[] field402 = new int[1];

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "[I")
    public int[] field405 = new int[] { -1 };

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "Ljd;")
    public static class86 field403 = class122.method868("(U0a )2 non)2existant gosub script)2num: ", true);

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public static int field408 = 1;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "[Ljd;")
    public static class86[] field406 = new class86[100];

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIIIZ)V")
    public static final void method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field404++;
        if (arg9) {
            method99(-38, 32, 57, -35, 82, -111, 113, -98, 37, true);
        }
        if (arg4 == arg5 && arg1 == arg8 && arg0 == arg2 && arg3 == arg7) {
            class51.method388(arg6, arg7, -23395, arg4, arg1, arg0);
            return;
        }
        int var10 = arg1;
        int var11 = arg4;
        int var12 = arg4 * 3;
        int var13 = arg1 * 3;
        int var14 = arg5 * 3;
        int var15 = arg2 * 3;
        int var16 = arg3 * 3;
        int var17 = arg8 * 3;
        int var18 = arg7 + var17 - var16 - arg1;
        int var19 = var12 + var15 - (var14 + var14);
        int var20 = var13 + var16 - var17 - var17;
        int var21 = var14 - var12;
        int var22 = arg0 + var14 - var15 - arg4;
        int var23 = var17 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var22 * var26;
            int var28 = var18 * var26;
            int var29 = var20 * var25;
            int var30 = var19 * var25;
            int var31 = var21 * var24;
            int var32 = var23 * var24;
            int var33 = arg4 + (var27 - (-var30 - var31) >> 12);
            int var34 = arg1 + (var29 + var32 + var28 >> 12);
            class51.method388(arg6, var34, -23395, var11, var10, var33);
            var10 = var34;
            var11 = var33;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static void method100(byte arg0) {
        if (arg0 >= 17) {
            field403 = null;
            field406 = null;
        }
    }
}
