import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class133 {

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lma;")
    public static class12 field1900 = new class12();

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field1901 = 1339;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public int field1893;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public int field1895;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "[[Z")
    public static boolean[][] field1903;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 3)
    public static void method940(int arg0) {
        field1900 = null;
        if (arg0 != -2923) {
            field1902 = 107;
        }
        field1903 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIZIII)V", line = 18)
    public static final void method941(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field1894++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg5 - arg2;
        int var12 = arg7 - arg2;
        int var13 = arg5 * arg5;
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
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        if (!arg4) {
            return;
        }
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class469.field6466 <= arg0 && class533.field7200 >= arg0) {
            int[] var39 = class344.field4599[arg0];
            int var40 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg1 - arg5);
            int var41 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg1 + arg5);
            int var42 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg1 - var11);
            int var43 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg1 + var11);
            class470.method2660(var40, var42, var39, (byte) 11, arg6);
            class470.method2660(var42, var43, var39, (byte) 11, arg3);
            class470.method2660(var43, var41, var39, (byte) 11, arg6);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var44) {
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
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
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
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (class469.field6466 <= var46 && var45 <= class533.field7200) {
                int var47 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg1 + var8);
                int var48 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg1 - var8);
                if (var44) {
                    int var49 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg1 + var10);
                    int var50 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg1 - var10);
                    if (class469.field6466 <= var45) {
                        int[] var51 = class344.field4599[var45];
                        class470.method2660(var48, var50, var51, (byte) 11, arg6);
                        class470.method2660(var50, var49, var51, (byte) 11, arg3);
                        class470.method2660(var49, var47, var51, (byte) 11, arg6);
                    }
                    if (var46 <= class533.field7200) {
                        int[] var52 = class344.field4599[var46];
                        class470.method2660(var48, var50, var52, (byte) 11, arg6);
                        class470.method2660(var50, var49, var52, (byte) 11, arg3);
                        class470.method2660(var49, var47, var52, (byte) 11, arg6);
                    }
                } else {
                    if (var45 >= class469.field6466) {
                        class470.method2660(var48, var47, class344.field4599[var45], (byte) 11, arg6);
                    }
                    if (var46 <= class533.field7200) {
                        class470.method2660(var48, var47, class344.field4599[var46], (byte) 11, arg6);
                    }
                }
            }
        }
    }
}
