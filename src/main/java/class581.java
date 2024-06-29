import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class581 {

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lft;")
    public static class285 field7908 = new class285(6, 4);

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Loca;")
    public static class573 field7910 = new class573();

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "[I")
    public static int[] field7912 = new int[8];

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Z")
    public static boolean field7913 = false;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7911 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Len;")
    public static final class368 method3188(int arg0, int arg1) {
        field7909++;
        class368[] var2 = class530.method2821(arg1 ^ 0x54);
        if (arg1 != 3) {
            field7912 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class368 var4 = var2[var3];
            if (var4.field4745 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7907++;
        if (arg6 != -221) {
            return;
        }
        if (arg3 == arg9 && arg4 == arg7 && arg0 == arg2 && arg5 == arg8) {
            class590.method3218(arg5, (byte) 53, arg9, arg1, arg2, arg7);
            return;
        }
        int var10 = arg9;
        int var11 = arg7;
        int var12 = arg9 * 3;
        int var13 = arg7 * 3;
        int var14 = arg3 * 3;
        int var15 = arg4 * 3;
        int var16 = arg0 * 3;
        int var17 = arg8 * 3;
        int var18 = arg2 - (arg9 + var16 - var14);
        int var19 = arg5 - var17 - (-var15 + arg7);
        int var20 = var12 + var16 - var14 - var14;
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg9;
            int var34 = (var28 + var30 + var32 >> 12) + arg7;
            class590.method3218(var34, (byte) 53, var10, arg1, var33, var11);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method3190(int arg0) {
        field7908 = null;
        if (arg0 == -1) {
            field7910 = null;
            field7911 = null;
            field7912 = null;
        }
    }
}
