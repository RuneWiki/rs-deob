import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class192 {

    @OriginalMember(owner = "client!co", name = "c", descriptor = "[Lqj;")
    public static class237[] field2834 = new class237[6];

    @OriginalMember(owner = "client!co", name = "e", descriptor = "Lkr;")
    public static class6 field2836 = null;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IBILja;Lfb;I)V")
    public static final void method1479(int arg0, byte arg1, int arg2, class90 arg3, class45 arg4, int arg5) {
        field2837++;
        class239 var6 = class402.method2549(arg4.field699, arg1 + 138);
        if (var6.field3446 == -1) {
            return;
        }
        int var7;
        if (arg4.field679) {
            int var8 = arg4.field684 + arg5;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class421 var9 = var6.method1743(arg4.field729, var7, arg3, arg1 ^ 0x62);
        if (var9 == null) {
            return;
        }
        int var10 = arg4.field717;
        int var11 = arg4.field724;
        if ((var7 & 0x1) == 1) {
            var11 = arg4.field717;
            var10 = arg4.field724;
        }
        int var12 = var9.method1461();
        int var13 = var9.method1463();
        if (var6.field3454) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field3455 == 0) {
            var9.method2644(arg2, arg0 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method494(arg2, arg0 + 4 - (var11 * 4), var12, var13, 1, var6.field3455 | 0xFF000000, 1);
        }
        if (arg1 != -10) {
            field2834 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method1480(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != -3) {
            method1481(true);
        }
        if (arg4 == arg6 && arg0 == arg3 && arg2 == arg8 && arg1 == arg7) {
            class128.method1080(arg0, arg1, arg6, arg9, arg8, arg5 ^ 0x8D6);
        } else {
            int var10 = arg6;
            int var11 = arg0;
            int var12 = arg6 * 3;
            int var13 = arg0 * 3;
            int var14 = arg4 * 3;
            int var15 = arg3 * 3;
            int var16 = arg2 * 3;
            int var17 = arg7 * 3;
            int var18 = var14 + arg8 - arg6 - var16;
            int var19 = var15 + arg1 - arg0 - var17;
            int var20 = var16 + var12 - var14 - var14;
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
                int var33 = (var27 + var29 + var31 >> 12) + arg6;
                int var34 = (var28 + var32 + var30 >> 12) + arg0;
                class128.method1080(var11, var34, var10, arg9, var33, -2261);
                var10 = var33;
                var11 = var34;
            }
        }
        field2833++;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)Z")
    public static final boolean method1481(boolean arg0) {
        if (!arg0) {
            method1482(-107);
        }
        field2835++;
        return class360.field5124 != 0 || class289.field4315 >= 2;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static void method1482(int arg0) {
        if (arg0 == 6) {
            field2834 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
    public static final void method1483(int arg0, int arg1) {
        field2832++;
        if (arg0 == -4097) {
            class221 var2 = class447.method2795(2, (byte) -49, arg1);
            var2.method1689(106);
        }
    }
}
