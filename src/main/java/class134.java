import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class134 {

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lvf;")
    private static class265 field2413 = class87.method582(-46, "purple:");

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lvf;")
    private static class265 field2416 = class87.method582(-46, " is already on your friend list)3");

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lvf;")
    public static class265 field2410 = field2413;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Lvf;")
    public static class265 field2418 = field2413;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field2411 = 0;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field2421 = 0;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lvf;")
    public static class265 field2412 = field2416;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "F")
    public static float field2419;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
    public static final void method887(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class203.method1394(class44.field973[arg4], arg1 - arg0, arg0 + arg1, -7249, arg3);
        int var5 = 0;
        int var6 = -arg0;
        int var7 = arg2;
        field2414++;
        int var8 = arg0;
        while (var5 < var8) {
            var7 += 2;
            var5++;
            var6 += var7;
            if (var6 >= 0) {
                var8--;
                int[] var9 = class44.field973[arg4 + var8];
                var6 -= var8 << 1;
                int[] var10 = class44.field973[arg4 - var8];
                int var11 = arg1 + var5;
                int var12 = arg1 - var5;
                class203.method1394(var9, var12, var11, arg2 ^ 0x1C50, arg3);
                class203.method1394(var10, var12, var11, -7249, arg3);
            }
            int var13 = arg1 - var8;
            int[] var14 = class44.field973[arg4 + var5];
            int var15 = arg1 + var8;
            int[] var16 = class44.field973[arg4 - var5];
            class203.method1394(var14, var13, var15, -7249, arg3);
            class203.method1394(var16, var13, var15, -7249, arg3);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)V")
    public static final void method888(byte arg0, int arg1) {
        field2417++;
        class52.method408(false);
        class51.method403(-35);
        int var2 = class238.method1589(-8318, arg1).field3402;
        if (var2 == 0) {
            return;
        }
        int var3 = -109 / ((-arg0 - 74) / 51);
        int var4 = class256.field4385[arg1];
        if (var2 == 5) {
            class143.field2659 = var4;
        }
        if (var2 == 6) {
            class204.field3655 = var4;
        }
        if (var2 == 9) {
            class1.field21 = var4;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method889(int arg0) {
        field2416 = null;
        if (arg0 <= 79) {
            method888((byte) 103, -22);
        }
        field2418 = null;
        field2410 = null;
        field2412 = null;
        field2413 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)I")
    public static final int method890(int arg0, int arg1, int arg2) {
        field2415++;
        int var3 = -63 % ((36 - arg0) / 34);
        int var4 = (class189.method1294(4, arg2 + 45365, arg1 + 91923, 1) + (class189.method1294(2, arg2 + 10294, arg1 + 37821, 1) - 128 >> 1) + (class189.method1294(1, arg2, arg1, 1) + -128 >> 2)) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lfl;I)V")
    public static final void method891(class192 arg0, int arg1) {
        field2420++;
        class210.field3781 = arg0;
        int var2 = -110 / ((61 - arg1) / 52);
    }
}
