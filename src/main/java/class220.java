import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class220 extends class250 {

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    private int field2810;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    private int field2809;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    private int field2815;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    private int field2814;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    private int field2807;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    private int field2812;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Luq;")
    private class313 field2808;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Lim;")
    public static class353 field2813 = new class353(83, 6);

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "Lim;")
    public static class353 field2816 = new class353(85, 20);

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "Lsk;")
    private class415 field2811;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2818++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg3 - arg7;
        int var12 = arg2 - arg7;
        int var13 = arg3 * arg3;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        if (class535.field7467 <= arg6 && arg6 <= class113.field1453) {
            int[] var38 = class256.field3173[arg6];
            int var39 = class69.method398((byte) -2, arg5 - arg3, class355.field4972, class594.field8575);
            int var40 = class69.method398((byte) 78, arg3 + arg5, class355.field4972, class594.field8575);
            int var41 = class69.method398((byte) 22, arg5 - var11, class355.field4972, class594.field8575);
            int var42 = class69.method398((byte) 13, arg5 + var11, class355.field4972, class594.field8575);
            class373.method2275((byte) -9, var41, arg0, var39, var38);
            class373.method2275((byte) -9, var42, arg4, var41, var38);
            class373.method2275((byte) -9, var40, arg0, var42, var38);
        }
        int var43 = (var12 - 1) * var29;
        if (arg1 != -274246366) {
            return;
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (class535.field7467 <= var46 && var45 <= class113.field1453) {
                int var47 = class69.method398((byte) 88, arg5 + var8, class355.field4972, class594.field8575);
                int var48 = class69.method398((byte) -115, arg5 - var8, class355.field4972, class594.field8575);
                if (var44) {
                    int var49 = class69.method398((byte) -124, arg5 + var10, class355.field4972, class594.field8575);
                    int var50 = class69.method398((byte) 41, arg5 - var10, class355.field4972, class594.field8575);
                    if (var45 >= class535.field7467) {
                        int[] var51 = class256.field3173[var45];
                        class373.method2275((byte) -9, var50, arg0, var48, var51);
                        class373.method2275((byte) -9, var49, arg4, var50, var51);
                        class373.method2275((byte) -9, var47, arg0, var49, var51);
                    }
                    if (class113.field1453 >= var46) {
                        int[] var52 = class256.field3173[var46];
                        class373.method2275((byte) -9, var50, arg0, var48, var52);
                        class373.method2275((byte) -9, var49, arg4, var50, var52);
                        class373.method2275((byte) -9, var47, arg0, var49, var52);
                    }
                } else {
                    if (class535.field7467 <= var45) {
                        class373.method2275((byte) -9, var47, arg0, var48, class256.field3173[var45]);
                    }
                    if (class113.field1453 >= var46) {
                        class373.method2275((byte) -9, var47, arg0, var48, class256.field3173[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Luq;IIIIII)V")
    public class220(class313 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2810 = arg5;
        this.field2809 = arg1;
        this.field2815 = arg4;
        this.field2814 = arg6;
        this.field2807 = arg2;
        this.field2812 = arg3;
        this.field2808 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    public static void method1413(int arg0) {
        field2813 = null;
        field2816 = null;
        if (arg0 >= -121) {
            field2813 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)Lsk;")
    public final class415 method1414(int arg0) {
        field2817++;
        if (arg0 != 1) {
            this.field2812 = 22;
        }
        if (this.field2811 == null) {
            class579.field8065[0] = this.field2809;
            class473 var2 = this.field2808.field2114;
            class579.field8065[3] = this.field2815;
            class579.field8065[2] = this.field2812;
            class579.field8065[5] = this.field2814;
            class579.field8065[1] = this.field2807;
            class579.field8065[4] = this.field2810;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method2144(-95, class579.field8065[var5])) {
                    return null;
                }
                class41 var7 = var2.method2151(true, class579.field8065[var5]);
                int var8 = var7.field613 ? 64 : 128;
                if (var7.field606 > 0) {
                    var3 = 1;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class504.field7013[var6] = var2.method2143(class579.field8065[var6], (byte) 15, false, var4, 1.0F, var4);
            }
            this.field2811 = new class415(this.field2808, 6407, var4, var3 != 0, class504.field7013);
        }
        return this.field2811;
    }
}
