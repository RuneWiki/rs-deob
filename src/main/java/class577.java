import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class577 {

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "[Lbt;")
    public class39[] field7751 = new class39[100];

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "[Lld;")
    public class154[] field7752 = new class154[8];

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "[I")
    public int[] field7756 = new int[3];

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "[I")
    public int[] field7755 = new int[100];

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lwt;")
    public static class280 field7753 = new class280(0, 0);

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Lfc;")
    public static class235 field7758 = new class235(23, 1);

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field7760 = 0;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public int field7757;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Lvfa;")
    public static class616 field7759;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field7750;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 6)
    public static void method3163(int arg0) {
        field7758 = null;
        if (arg0 != 0) {
            field7759 = null;
        }
        field7759 = null;
        field7753 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIII)V", line = 34)
    public static final void method3164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7754++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg7 - arg4;
        int var12 = arg1 - arg4;
        int var13 = arg7 * arg7;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        if (arg0 != 671906817) {
            return;
        }
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
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
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        if (arg3 >= class92.field1219 && arg3 <= class631.field8829) {
            int[] var38 = class476.field6655[arg3];
            int var39 = class355.method2104(class144.field2148, arg6 - arg7, 81, class482.field6703);
            int var40 = class355.method2104(class144.field2148, arg6 + arg7, 59, class482.field6703);
            int var41 = class355.method2104(class144.field2148, arg6 - var11, -103, class482.field6703);
            int var42 = class355.method2104(class144.field2148, arg6 + var11, -113, class482.field6703);
            class548.method3012(var41, (byte) 23, arg5, var39, var38);
            class548.method3012(var42, (byte) 23, arg2, var41, var38);
            class548.method3012(var40, (byte) 23, arg5, var42, var38);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var31 += var28;
                    var35 += var28;
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
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var43;
                var26 += -var34;
                var34 -= var29;
                var43 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var45 = arg3 - var9;
            int var46 = arg3 + var9;
            if (var46 >= class92.field1219 && class631.field8829 >= var45) {
                int var47 = class355.method2104(class144.field2148, arg6 + var8, 112, class482.field6703);
                int var48 = class355.method2104(class144.field2148, arg6 - var8, -123, class482.field6703);
                if (var44) {
                    int var49 = class355.method2104(class144.field2148, arg6 + var10, arg0 ^ 0x280C7C25, class482.field6703);
                    int var50 = class355.method2104(class144.field2148, arg6 - var10, 32, class482.field6703);
                    if (var45 >= class92.field1219) {
                        int[] var51 = class476.field6655[var45];
                        class548.method3012(var50, (byte) 23, arg5, var48, var51);
                        class548.method3012(var49, (byte) 23, arg2, var50, var51);
                        class548.method3012(var47, (byte) 23, arg5, var49, var51);
                    }
                    if (class631.field8829 >= var46) {
                        int[] var52 = class476.field6655[var46];
                        class548.method3012(var50, (byte) 23, arg5, var48, var52);
                        class548.method3012(var49, (byte) 23, arg2, var50, var52);
                        class548.method3012(var47, (byte) 23, arg5, var49, var52);
                    }
                } else {
                    if (var45 >= class92.field1219) {
                        class548.method3012(var47, (byte) 23, arg5, var48, class476.field6655[var45]);
                    }
                    if (class631.field8829 >= var46) {
                        class548.method3012(var47, (byte) 23, arg5, var48, class476.field6655[var46]);
                    }
                }
            }
        }
    }
}
