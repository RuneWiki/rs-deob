import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class648 {

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "Ljda;")
    public static class77 field9185 = new class77("", 11);

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "Leda;")
    public static class116 field9187 = new class116(79, 8);

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field9184;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "Lfda;")
    public static class628 field9186;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "[[B")
    public static byte[][] field9181;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V", line = 9)
    public static final void method3634(byte arg0) {
        if (arg0 != 79) {
            return;
        }
        field9184++;
        if (class82.field1248 == null) {
            class521 var1 = new class521();
            byte[] var2 = var1.method3072(128, 128, 10, 16);
            class82.field1248 = class8.method32((byte) -69, false, var2);
        }
        if (class676.field9627 == null) {
            class473 var3 = new class473();
            byte[] var4 = var3.method2777(128, false, 128, 16);
            class676.field9627 = class8.method32((byte) -69, false, var4);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 40)
    public static void method3635(int arg0) {
        field9185 = null;
        if (arg0 != 16) {
            field9187 = null;
        }
        field9181 = null;
        field9187 = null;
        field9186 = null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)Lrba;", line = 53)
    public static final class102 method3636(int arg0, boolean arg1) {
        field9182++;
        class102 var2 = (class102) class112.field1804.method941((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class263.field3787.method2081(23, arg0, 1);
        if (arg1) {
            return null;
        }
        class102 var4 = new class102();
        var4.field1663 = arg0;
        if (var3 != null) {
            var4.method856(new class465(var3), -17470);
        }
        var4.method857(-1);
        if (var4.field1675 == 2 && class492.field7065.method2818(-22803, (long) arg0) == null) {
            class492.field7065.method2816(new class83(class405.field5819), (long) arg0, false);
            class689.field9776[class405.field5819++] = var4;
        }
        class112.field1804.method949((long) arg0, !arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIIII)V", line = 96)
    public static final void method3637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9183++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg2 - arg3;
        int var12 = arg5 - arg3;
        int var13 = arg2 * arg2;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        if (arg7 != 252019426) {
            field9186 = null;
        }
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
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
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        if (arg4 >= class198.field3084 && class627.field8931 >= arg4) {
            int[] var38 = class657.field9275[arg4];
            int var39 = class367.method2203(class512.field7620, class94.field1398, arg6 - arg2, true);
            int var40 = class367.method2203(class512.field7620, class94.field1398, arg2 + arg6, true);
            int var41 = class367.method2203(class512.field7620, class94.field1398, arg6 - var11, true);
            int var42 = class367.method2203(class512.field7620, class94.field1398, arg6 + var11, true);
            class223.method1484(var38, var41, -119, arg0, var39);
            class223.method1484(var38, var42, -112, arg1, var41);
            class223.method1484(var38, var40, -113, arg0, var42);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var37 += var30;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var43;
                var43 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var45 = arg4 - var9;
            int var46 = arg4 + var9;
            if (class198.field3084 <= var46 && var45 <= class627.field8931) {
                int var47 = class367.method2203(class512.field7620, class94.field1398, arg6 + var8, true);
                int var48 = class367.method2203(class512.field7620, class94.field1398, arg6 - var8, true);
                if (var44) {
                    int var49 = class367.method2203(class512.field7620, class94.field1398, arg6 + var10, true);
                    int var50 = class367.method2203(class512.field7620, class94.field1398, arg6 - var10, true);
                    if (var45 >= class198.field3084) {
                        int[] var51 = class657.field9275[var45];
                        class223.method1484(var51, var50, -115, arg0, var48);
                        class223.method1484(var51, var49, -125, arg1, var50);
                        class223.method1484(var51, var47, -104, arg0, var49);
                    }
                    if (var46 <= class627.field8931) {
                        int[] var52 = class657.field9275[var46];
                        class223.method1484(var52, var50, -89, arg0, var48);
                        class223.method1484(var52, var49, -85, arg1, var50);
                        class223.method1484(var52, var47, -124, arg0, var49);
                    }
                } else {
                    if (var45 >= class198.field3084) {
                        class223.method1484(class657.field9275[var45], var47, -120, arg0, var48);
                    }
                    if (var46 <= class627.field8931) {
                        class223.method1484(class657.field9275[var46], var47, arg7 ^ 0xF0FA7D77, arg0, var48);
                    }
                }
            }
        }
    }
}
