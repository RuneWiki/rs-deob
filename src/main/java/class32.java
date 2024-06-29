import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class32 {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lvv;")
    public static class313 field514 = new class313(69, 0);

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field515 = 0;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Z")
    public static boolean field516 = false;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field517 = 0;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method248(byte arg0) {
        if (arg0 == 94) {
            field514 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILqs;)V")
    public static final void method249(int arg0, class496 arg1) {
        class439.field6563 = 0;
        class74.field1267 = 0;
        field513++;
        class305.field4876 = new class78();
        class219.field3791 = new class185[1024];
        class358.method2297(arg1, (byte) -102);
        class444.method2666(63, arg1);
        if (arg0 > -88) {
            method248((byte) 89);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field512++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg0 - arg6;
        int var12 = arg1 - arg6;
        int var13 = arg0 * arg0;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        if (arg4 != -4747) {
            field517 = 86;
        }
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
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class209.field3294[arg7];
        class357.method2291(arg2 - arg0, arg3, var39, arg2 - var11, -1);
        class357.method2291(arg2 - var11, arg5, var39, arg2 + var11, -1);
        class357.method2291(arg2 + var11, arg3, var39, arg0 + arg2, -1);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var35 += var28;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var41 = arg7 - var9;
            int var42 = arg7 + var9;
            int var43 = arg2 + var8;
            int var44 = arg2 - var8;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class357.method2291(var44, arg3, class209.field3294[var41], var46, -1);
                class357.method2291(var46, arg5, class209.field3294[var41], var45, -1);
                class357.method2291(var45, arg3, class209.field3294[var41], var43, arg4 + 4746);
                class357.method2291(var44, arg3, class209.field3294[var42], var46, arg4 + 4746);
                class357.method2291(var46, arg5, class209.field3294[var42], var45, -1);
                class357.method2291(var45, arg3, class209.field3294[var42], var43, -1);
            } else {
                class357.method2291(var44, arg3, class209.field3294[var41], var43, -1);
                class357.method2291(var44, arg3, class209.field3294[var42], var43, arg4 ^ 0x128A);
            }
        }
    }
}
