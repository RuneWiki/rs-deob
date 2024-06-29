import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class class527 extends class101 {

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "Ljda;")
    public static class239 field7224 = new class239(4);

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "Lmga;")
    public static class739 field7225 = new class739(46, 7);

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public int field7220;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public int field7222;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "[I")
    public int[] field7221;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
    public abstract void method708(int arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public static void method3038(byte arg0) {
        field7225 = null;
        if (arg0 > 57) {
            field7224 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIILjava/awt/Graphics;II)V")
    public abstract void method709(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7219++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg6 - arg5;
        int var12 = arg7 - arg5;
        int var13 = arg6 * arg6;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = arg1 * var17;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class785.field10808[arg0];
        class138.method1069(var39, (byte) 96, arg3 - arg6, -var11 + arg3, arg4);
        class138.method1069(var39, (byte) -106, arg3 - var11, arg3 + var11, arg2);
        class138.method1069(var39, (byte) -74, arg3 + var11, arg3 + arg6, arg4);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
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
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var36 -= var27;
            var32 -= var27;
            int var41 = arg0 - var9;
            int var42 = arg0 + var9;
            int var43 = arg3 + var8;
            int var44 = arg3 - var8;
            if (var40) {
                int var45 = arg3 + var10;
                int var46 = arg3 - var10;
                class138.method1069(class785.field10808[var41], (byte) -35, var44, var46, arg4);
                class138.method1069(class785.field10808[var41], (byte) -42, var46, var45, arg2);
                class138.method1069(class785.field10808[var41], (byte) 101, var45, var43, arg4);
                class138.method1069(class785.field10808[var42], (byte) 114, var44, var46, arg4);
                class138.method1069(class785.field10808[var42], (byte) -101, var46, var45, arg2);
                class138.method1069(class785.field10808[var42], (byte) 120, var45, var43, arg4);
            } else {
                class138.method1069(class785.field10808[var41], (byte) 101, var44, var43, arg4);
                class138.method1069(class785.field10808[var42], (byte) 99, var44, var43, arg4);
            }
        }
    }
}
