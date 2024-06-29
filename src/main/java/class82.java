import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class82 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "[I")
    public static int[] field1154 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "[[I")
    public static int[][] field1157 = new int[5][5000];

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V", line = 11)
    public static final void method545(int arg0, int arg1) {
        field1152++;
        if (arg1 != -1) {
            field1155 = -127;
        }
        class169 var2 = class101.method712(arg0, 12, 2089666400);
        var2.method1178((byte) 53);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)V", line = 25)
    public static final void method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1156++;
        int var8 = arg1;
        int var9 = 0;
        int var10 = arg7 - arg5;
        int var11 = 0;
        int var12 = arg1 - arg5;
        int var13 = arg1 * arg1;
        int var14 = var10 * var10;
        int var15 = arg7 * arg7;
        int var16 = var13 << 1;
        int var17 = var14 << 1;
        int var18 = var15 << 1;
        int var19 = var12 * var12;
        int var20 = var19 << 1;
        int var21 = var12 << 1;
        if (arg6 <= 36) {
            method545(43, -112);
        }
        int var22 = (1 - var21) * var14 + var20;
        int var23 = arg1 << 1;
        int var24 = var19 - (var21 - 1) * var17;
        int var25 = var13 - ((var23 - 1) * var18);
        int var26 = var15 << 2;
        int var27 = var19 << 2;
        int var28 = var13 << 2;
        int var29 = (1 - var23) * var15 + var16;
        int var30 = var14 << 2;
        int var31 = var16 * 3;
        int var32 = (var23 - 3) * var18;
        int var33 = var28;
        int var34 = var20 * 3;
        int var35 = (arg1 - 1) * var26;
        int var36 = (var12 - 1) * var30;
        int var37 = (var21 - 3) * var17;
        int var38 = var27;
        if (arg0 >= class185.field2769 && class166.field2494 >= arg0) {
            int[] var39 = class40.field488[arg0];
            int var40 = class222.method1553(class184.field2761, (byte) -30, arg2 - arg7, class157.field2357);
            int var41 = class222.method1553(class184.field2761, (byte) -24, arg2 + arg7, class157.field2357);
            int var42 = class222.method1553(class184.field2761, (byte) -107, arg2 - var10, class157.field2357);
            int var43 = class222.method1553(class184.field2761, (byte) -48, arg2 + var10, class157.field2357);
            class315.method2160(var39, arg3, var42, var40, 7);
            class315.method2160(var39, arg4, var43, var42, 7);
            class315.method2160(var39, arg3, var41, var43, 7);
        }
        while (var8 > 0) {
            boolean var44 = var8 <= var12;
            var8--;
            if (var29 < 0) {
                while (var29 < 0) {
                    var25 += var33;
                    var33 += var28;
                    var29 += var31;
                    var9++;
                    var31 += var28;
                }
            }
            if (var44) {
                if (var22 < 0) {
                    while (var22 < 0) {
                        var11++;
                        var24 += var38;
                        var38 += var27;
                        var22 += var34;
                        var34 += var27;
                    }
                }
                if (var24 < 0) {
                    var22 += var34;
                    var11++;
                    var34 += var27;
                    var24 += var38;
                    var38 += var27;
                }
                var24 += -var37;
                var37 -= var30;
                var22 += -var36;
                var36 -= var30;
            }
            if (var25 < 0) {
                var29 += var31;
                var9++;
                var25 += var33;
                var31 += var28;
                var33 += var28;
            }
            int var45 = arg0 - var8;
            int var46 = arg0 + var8;
            var25 += -var32;
            if (class185.field2769 <= var46 && class166.field2494 >= var45) {
                int var47 = class222.method1553(class184.field2761, (byte) -22, arg2 + var9, class157.field2357);
                int var48 = class222.method1553(class184.field2761, (byte) -86, arg2 - var9, class157.field2357);
                if (var44) {
                    int var49 = class222.method1553(class184.field2761, (byte) -105, arg2 + var11, class157.field2357);
                    int var50 = class222.method1553(class184.field2761, (byte) -107, arg2 - var11, class157.field2357);
                    if (var45 >= class185.field2769) {
                        int[] var51 = class40.field488[var45];
                        class315.method2160(var51, arg3, var50, var48, 7);
                        class315.method2160(var51, arg4, var49, var50, 7);
                        class315.method2160(var51, arg3, var47, var49, 7);
                    }
                    if (class166.field2494 >= var46) {
                        int[] var52 = class40.field488[var46];
                        class315.method2160(var52, arg3, var50, var48, 7);
                        class315.method2160(var52, arg4, var49, var50, 7);
                        class315.method2160(var52, arg3, var47, var49, 7);
                    }
                } else {
                    if (class185.field2769 <= var45) {
                        class315.method2160(class40.field488[var45], arg3, var47, var48, 7);
                    }
                    if (class166.field2494 >= var46) {
                        class315.method2160(class40.field488[var46], arg3, var47, var48, 7);
                    }
                }
            }
            var29 += -var35;
            var35 -= var26;
            var32 -= var26;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 229)
    public static void method547(int arg0) {
        if (arg0 != 1) {
            method547(62);
        }
        field1157 = (int[][]) null;
        field1154 = null;
    }
}
