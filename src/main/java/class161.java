import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class161 extends class240 {

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    public static int field2829 = 0;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "Lcd;")
    public static class64 field2832 = class44.method335((byte) 71, "Mem:");

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "Lcd;")
    private static class64 field2828 = class44.method335((byte) 71, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!vk", name = "W", descriptor = "Lcd;")
    private static class64 field2835 = class44.method335((byte) 71, "flash2:");

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "Lcd;")
    public static class64 field2831 = field2835;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "Lcd;")
    public static class64 field2833 = field2828;

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "Lcd;")
    public static class64 field2834 = field2835;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!vk", name = "Y", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!vk", name = "ab", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!vk", name = "Z", descriptor = "Lrb;")
    public static class211 field2838;

    @OriginalMember(owner = "client!vk", name = "X", descriptor = "[I")
    public static int[] field2836;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method12(int arg0, int arg1) {
        field2827++;
        return arg0 == 64 ? class74.field1408 : (int[]) null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIII)V", line = 16)
    private static final void method1159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2830++;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg4 - arg7;
        int var11 = arg5;
        int var12 = arg4 * arg4;
        int var13 = arg5 * arg5;
        int var14 = arg5 - arg7;
        int var15 = var13 << 1;
        int var16 = var12 << 1;
        int var17 = var10 * var10;
        int var18 = var14 * var14;
        int var19 = var18 << 1;
        int var20 = var17 << 1;
        int var21 = arg5 << 1;
        int var22 = var14 << 1;
        int var23 = (1 - var21) * var12 + var15;
        int var24 = var13 - (var21 - 1) * var16;
        int var25 = (1 - var22) * var17 + var19;
        int var26 = var18 - ((var22 - 1) * var20);
        int var27 = var12 << 2;
        int var28 = var13 << 2;
        int var29 = var17 << 2;
        int var30 = var18 << 2;
        if (arg0 != -12843) {
            field2835 = (class64) null;
        }
        int var31 = var15 * 3;
        int var32 = var19 * 3;
        int var33 = (var21 - 3) * var16;
        int var34 = var28;
        int var35 = (var22 - 3) * var20;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        int var38 = (var14 - 1) * var29;
        int[] var39 = class124.field2241[arg3];
        class31.method268(arg2 - var10, arg0 ^ 0xFFFFCDAE, arg2 - arg4, var39, arg1);
        class31.method268(arg2 + var10, 126, arg2 - var10, var39, arg6);
        class31.method268(arg2 + arg4, arg0 ^ 0xFFFFCDAA, arg2 + var10, var39, arg1);
        while (var11 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var31 += var28;
                    var8++;
                    var24 += var34;
                    var34 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var34;
                var8++;
                var23 += var31;
                var31 += var28;
                var34 += var28;
            }
            var23 += -var36;
            var36 -= var27;
            boolean var40 = var11 <= var14;
            var11--;
            var24 += -var33;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var32;
                        var37 += var30;
                        var9++;
                        var32 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var37 += var30;
                    var9++;
                    var25 += var32;
                    var32 += var30;
                }
                var25 += -var38;
                var38 -= var29;
                var26 += -var35;
                var35 -= var29;
            }
            int var41 = arg2 + var8;
            int var42 = arg3 - var11;
            int var43 = arg3 + var11;
            int var44 = arg2 - var8;
            if (var40) {
                int var45 = arg2 + var9;
                int var46 = arg2 - var9;
                class31.method268(var46, 124, var44, class124.field2241[var42], arg1);
                class31.method268(var45, 120, var46, class124.field2241[var42], arg6);
                class31.method268(var41, 122, var45, class124.field2241[var42], arg1);
                class31.method268(var46, 118, var44, class124.field2241[var43], arg1);
                class31.method268(var45, 124, var46, class124.field2241[var43], arg6);
                class31.method268(var41, 120, var45, class124.field2241[var43], arg1);
            } else {
                class31.method268(var41, 120, var44, class124.field2241[var42], arg1);
                class31.method268(var41, 120, var44, class124.field2241[var43], arg1);
            }
            var33 -= var27;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V", line = 190)
    public class161() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(B)V", line = 207)
    public static void method1160(byte arg0) {
        field2833 = null;
        field2838 = null;
        field2831 = null;
        field2828 = null;
        field2832 = null;
        if (arg0 != 64) {
            method1162((byte) -113);
        }
        field2834 = null;
        field2835 = null;
        field2836 = null;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(IIIIIIII)V", line = 250)
    public static final void method1161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2837++;
        if (arg0 == arg5) {
            class10.method86(arg0, arg7, arg6, arg2, arg4, true, arg3);
            return;
        }
        if (arg1 != 3) {
            method1160((byte) 116);
        }
        if ((arg3 - arg0) >= class290.field4976 && class153.field2714 >= (arg0 + arg3) && class180.field3098 <= arg7 - arg5 && class201.field3444 >= (arg5 + arg7)) {
            method1159(-12843, arg2, arg3, arg7, arg0, arg5, arg6, arg4);
        } else {
            class135.method961(arg3, arg6, arg0, arg5, true, arg2, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(B)V", line = 283)
    public static final void method1162(byte arg0) {
        field2839++;
        if (!class141.method1001((byte) -118) && class27.field438 != class20.field364) {
            class254.method1817(class233.field3931, arg0 - 138, class139.field2472.field1898[0], class139.field2472.field1876[0], class20.field364, false, class295.field5066);
            return;
        }
        if (arg0 != 15) {
            method1159(39, 22, -111, -56, 56, -73, -61, -97);
        }
        if (class232.field3924 != class20.field364) {
            class232.field3924 = class20.field364;
            class260.method1835(class20.field364, (byte) -50);
            class46.method346(-4);
        }
    }
}
