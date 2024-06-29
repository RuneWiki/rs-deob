import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class103 extends class189 {

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "Ljava/lang/String;")
    public static String field1615 = "";

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "Lff;")
    public static class9 field1616 = new class9(9, 0, 4, 1);

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "Lrca;")
    public static class418 field1617 = new class418("WIP", 2);

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "Lwo;")
    public class691 field1612;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "[B")
    public byte[] field1611;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILsp;)Z")
    public static final boolean method829(int arg0, class588 arg1) {
        ++field1618;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field8267) {
            return false;
        } else {
            int var2 = 40 % ((arg0 - -46) / 33);
            if (!arg1.method3329(34379, class25.field338)) {
                return false;
            } else if (class177.field2527.method1405((long) arg1.field8217, (byte) -20) != null) {
                return false;
            } else {
                return class592.field8363.method1405((long) arg1.field8246, (byte) -27) == null;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1614;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = -arg0 + arg4;
        int var12 = -arg0 + arg2;
        int var13 = arg4 * arg4;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        if (arg5 == 9848) {
            int var19 = var16 << 1;
            int var20 = var15 << 1;
            int var21 = arg2 << 1;
            int var22 = var12 << 1;
            int var23 = (-var21 + 1) * var13 + var17;
            int var24 = var14 - (var21 + -1) * var18;
            int var25 = (-var22 + 1) * var15 - -var19;
            int var26 = -((var22 + -1) * var20) + var16;
            int var27 = var13 << 2;
            int var28 = var14 << 2;
            int var29 = var15 << 2;
            int var30 = var16 << 2;
            int var31 = var17 * 3;
            int var32 = (var21 - 3) * var18;
            int var33 = var19 * 3;
            int var34 = (var22 + -3) * var20;
            int var35 = var28;
            int var36 = (arg2 + -1) * var27;
            int var37 = var30;
            int var38 = (var12 - 1) * var29;
            if (~arg6 <= ~class520.field7329 && ~arg6 >= ~class239.field3747) {
                int[] var39 = class651.field9125[arg6];
                int var40 = class537.method3051(-10168, -arg4 + arg1, class248.field3859, class15.field153);
                int var41 = class537.method3051(arg5 ^ -464, arg1 + arg4, class248.field3859, class15.field153);
                int var42 = class537.method3051(arg5 ^ -464, -var11 + arg1, class248.field3859, class15.field153);
                int var43 = class537.method3051(-10168, arg1 - -var11, class248.field3859, class15.field153);
                class58.method623(arg3, var42, 23309, var39, var40);
                class58.method623(arg7, var43, 23309, var39, var42);
                class58.method623(arg3, var41, 23309, var39, var43);
            }
            while (var9 > 0) {
                boolean var44 = ~var12 <= ~var9;
                if (var44) {
                    if (~var25 > -1) {
                        while (var25 < 0) {
                            var26 += var37;
                            var25 += var33;
                            ++var10;
                            var33 += var30;
                            var37 += var30;
                        }
                    }
                    if (var26 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        ++var10;
                        var33 += var30;
                    }
                    var26 += -var34;
                    var25 += -var38;
                    var38 -= var29;
                    var34 -= var29;
                }
                if (~var23 > -1) {
                    while (~var23 > -1) {
                        var24 += var35;
                        var23 += var31;
                        var31 += var28;
                        var35 += var28;
                        ++var8;
                    }
                }
                if (var24 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    ++var8;
                    var35 += var28;
                }
                var24 += -var32;
                var23 += -var36;
                --var9;
                var36 -= var27;
                var32 -= var27;
                int var45 = arg6 - var9;
                int var46 = arg6 - -var9;
                if (var46 >= class520.field7329 && ~var45 >= ~class239.field3747) {
                    int var47 = class537.method3051(-10168, arg1 + var8, class248.field3859, class15.field153);
                    int var48 = class537.method3051(-10168, -var8 + arg1, class248.field3859, class15.field153);
                    if (var44) {
                        int var49 = class537.method3051(-10168, arg1 + var10, class248.field3859, class15.field153);
                        int var50 = class537.method3051(-10168, -var10 + arg1, class248.field3859, class15.field153);
                        if (~class520.field7329 >= ~var45) {
                            int[] var51 = class651.field9125[var45];
                            class58.method623(arg3, var50, 23309, var51, var48);
                            class58.method623(arg7, var49, arg5 ^ 32117, var51, var50);
                            class58.method623(arg3, var47, 23309, var51, var49);
                        }
                        if (class239.field3747 >= var46) {
                            int[] var52 = class651.field9125[var46];
                            class58.method623(arg3, var50, 23309, var52, var48);
                            class58.method623(arg7, var49, 23309, var52, var50);
                            class58.method623(arg3, var47, 23309, var52, var49);
                        }
                    } else {
                        if (class520.field7329 <= var45) {
                            class58.method623(arg3, var47, 23309, class651.field9125[var45], var48);
                        }
                        if (class239.field3747 >= var46) {
                            class58.method623(arg3, var47, arg5 + 13461, class651.field9125[var46], var48);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)I")
    public final int method831(int arg0) {
        int var2 = -103 % ((arg0 - -46) / 58);
        ++field1619;
        return super.field2717 ? 0 : 100;
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V")
    public static void method832(int arg0) {
        field1616 = null;
        field1615 = null;
        if (arg0 != -2070330399) {
            method832(41);
        }
        field1617 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)[B")
    public final byte[] method833(int arg0) {
        ++field1609;
        if (arg0 != 0) {
            return null;
        } else if (super.field2717) {
            throw new RuntimeException();
        } else {
            return this.field1611;
        }
    }
}
