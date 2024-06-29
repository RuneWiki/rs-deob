import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class140 extends class54 {

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public int field2710;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field2714 = -1;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Lbb;")
    public static class14 field2715 = new class14(64);

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field2716 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "[I")
    public static int[] field2717 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "Ldc;")
    public static class37 field2720 = class185.method1233((byte) 86, "M");

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "Lqh;")
    public static class182 field2718;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public static void method979(int arg0) {
        field2718 = null;
        if (arg0 == 1) {
            field2715 = null;
            field2720 = null;
            field2717 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
    public static final void method980(byte arg0) {
        int var1 = -2 % ((61 - arg0) / 33);
        field2719++;
        class163.field3076 = new class203();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method981(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field2712++;
        if (arg6 >= -81) {
            method981(-51, 24, -33, -14, 61, 88, (byte) 12);
        }
        int var7 = arg5 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return 7 + 1 - arg0 - arg3;
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg4;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2713++;
        int var8 = class196.method1308(117, class198.field3697, arg7, class199.field3712);
        int var9 = class196.method1308(89, class198.field3697, arg4, class199.field3712);
        int var10 = class196.method1308(86, class29.field536, arg3, class82.field1458);
        int var11 = class196.method1308(110, class29.field536, arg1, class82.field1458);
        int var12 = class196.method1308(72, class198.field3697, arg6 + arg7, class199.field3712);
        int var13 = class196.method1308(93, class198.field3697, arg4 - arg6, class199.field3712);
        for (int var14 = var8; var14 < var12; var14++) {
            class29.method242(var11, (byte) -30, arg0, class11.field156[var14], var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class29.method242(var11, (byte) -30, arg0, class11.field156[var15], var10);
        }
        int var16 = class196.method1308(arg2 + 79, class29.field536, arg3 + arg6, class82.field1458);
        int var17 = class196.method1308(81, class29.field536, arg1 - arg6, class82.field1458);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class11.field156[var18];
            class29.method242(var16, (byte) -30, arg0, var19, var10);
            class29.method242(var17, (byte) -30, arg5, var19, var16);
            class29.method242(var11, (byte) -30, arg0, var19, var17);
        }
        if (arg2 != 1) {
            field2715 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class140() {
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
    public class140(int arg0) {
        this.field2710 = arg0;
    }
}
