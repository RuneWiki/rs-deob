import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class147 extends class634 {

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "Lgt;")
    public static class454 field1636 = new class454();

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "Lwd;")
    public static class272 field1639 = new class272(2);

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "Lfs;")
    public static class553 field1641;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILpk;)I", line = 4)
    public static final int method914(int arg0, class197 arg1) {
        int var2 = 52 / ((-16 - arg0) / 39);
        ++field1637;
        class326 var3 = arg1.field2293;
        if (var3.field4199 != null) {
            var3 = var3.method1939(true, class722.field10125);
            if (var3 == null) {
                return -1;
            }
        }
        int var4 = var3.field4165;
        class255 var5 = arg1.method2992(-1);
        if (arg1.field7147 != -1 && !arg1.field7122) {
            if (~arg1.field7147 != ~var5.field3081 && ~arg1.field7147 != ~var5.field3094 && arg1.field7147 != var5.field3105 && arg1.field7147 != var5.field3090) {
                if (~arg1.field7147 == ~var5.field3119 || ~arg1.field7147 == ~var5.field3084 || arg1.field7147 == var5.field3116 || ~arg1.field7147 == ~var5.field3107) {
                    var4 = var3.field4173;
                }
            } else {
                var4 = var3.field4226;
            }
        } else {
            var4 = var3.field4218;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIB)Z", line = 40)
    public static final boolean method915(int arg0, int arg1, byte arg2) {
        if (arg2 != 101) {
            method917((byte) 59, 118);
        }
        ++field1638;
        return (arg1 & 544) == 544 | ~(24 & arg1) != -1;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 54)
    public class147() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZIIIIIII)V", line = 57)
    public static final void method916(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1635;
        if (!arg0) {
            field1639 = null;
        }
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg1 - arg3;
        int var12 = -arg3 + arg6;
        int var13 = arg1 * arg1;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = -((var21 - 1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg6 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class408.field5585[arg7];
        class223.method1297(var39, -7, -arg1 + arg4, arg5, arg4 - var11);
        class223.method1297(var39, -7, arg4 - var11, arg2, arg4 - -var11);
        class223.method1297(var39, -7, arg4 + var11, arg5, arg4 - -arg1);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (~var23 > -1) {
                while (~var23 > -1) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    ++var8;
                }
            }
            if (var40) {
                if (~var25 > -1) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
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
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var35 += var28;
                ++var8;
            }
            var23 += -var36;
            var24 += -var32;
            --var9;
            var32 -= var27;
            var36 -= var27;
            int var41 = -var9 + arg7;
            int var42 = arg7 + var9;
            int var43 = arg4 + var8;
            int var44 = -var8 + arg4;
            if (!var40) {
                class223.method1297(class408.field5585[var41], -7, var44, arg5, var43);
                class223.method1297(class408.field5585[var42], -7, var44, arg5, var43);
            } else {
                int var45 = arg4 + var10;
                int var46 = -var10 + arg4;
                class223.method1297(class408.field5585[var41], -7, var44, arg5, var46);
                class223.method1297(class408.field5585[var41], -7, var46, arg2, var45);
                class223.method1297(class408.field5585[var41], -7, var45, arg5, var43);
                class223.method1297(class408.field5585[var42], -7, var44, arg5, var46);
                class223.method1297(class408.field5585[var42], -7, var46, arg2, var45);
                class223.method1297(class408.field5585[var42], -7, var45, arg5, var43);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(BI)I", line = 226)
    public static final int method917(byte arg0, int arg1) {
        if (arg0 != 34) {
            return 19;
        } else {
            ++field1634;
            return 255 & arg1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(BI)[I", line = 238)
    public final int[] method13(byte arg0, int arg1) {
        ++field1633;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 > -55) {
            method917((byte) 68, -76);
        }
        if (super.field9114.field3897) {
            class143.method896(var3, 0, class635.field9139, class164.field1840[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V", line = 265)
    public static void method918(byte arg0) {
        field1641 = null;
        int var1 = 94 / ((arg0 - 21) / 34);
        field1636 = null;
        field1639 = null;
    }
}
