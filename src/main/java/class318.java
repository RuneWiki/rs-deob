import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class318 {

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public int field4630;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "[I")
    public int[] field4633;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "[I")
    public int[] field4627;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field4628 = 0;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field4632 = 0;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Lsd;")
    public static class74 field4631 = new class74(35, 12);

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lpn;")
    public static class72 field4634 = new class72(39, 15);

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field4635 = 0;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4629++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg7 - arg0;
        int var12 = arg4 - arg0;
        int var13 = arg7 * arg7;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg4 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class240.field3303[arg5];
        class270.method1633(var39, arg1 - var11, arg6, arg1 - arg7, arg3 + -21844);
        class270.method1633(var39, arg1 + var11, arg2, arg1 - var11, 92);
        class270.method1633(var39, arg1 + arg7, arg6, arg1 + var11, arg3 + -21831);
        if (arg3 != 21956) {
            return;
        }
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var41 = arg5 - var9;
            int var42 = arg5 + var9;
            int var43 = arg1 + var8;
            int var44 = arg1 - var8;
            if (var40) {
                int var45 = arg1 + var10;
                int var46 = arg1 - var10;
                class270.method1633(class240.field3303[var41], var46, arg6, var44, 95);
                class270.method1633(class240.field3303[var41], var45, arg2, var46, arg3 - 21832);
                class270.method1633(class240.field3303[var41], var43, arg6, var45, arg3 - 21839);
                class270.method1633(class240.field3303[var42], var46, arg6, var44, 116);
                class270.method1633(class240.field3303[var42], var45, arg2, var46, 115);
                class270.method1633(class240.field3303[var42], var43, arg6, var45, 101);
            } else {
                class270.method1633(class240.field3303[var41], var43, arg6, var44, 97);
                class270.method1633(class240.field3303[var42], var43, arg6, var44, 100);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1955(int arg0) {
        field4634 = null;
        if (arg0 == 16729) {
            field4631 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(I)V")
    public class318(int arg0) {
        this.field4630 = arg0;
        this.field4633 = new int[this.field4630];
        this.field4627 = new int[this.field4630];
    }
}
