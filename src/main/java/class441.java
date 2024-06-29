import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public abstract class class441 extends class318 {

    @OriginalMember(owner = "client!uda", name = "F", descriptor = "S")
    public short field6133;

    @OriginalMember(owner = "client!uda", name = "C", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!uda", name = "D", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!uda", name = "G", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!uda", name = "H", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!uda", name = "I", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!uda", name = "E", descriptor = "Lha;")
    public static class548 field6132;

    @OriginalMember(owner = "client!uda", name = "k", descriptor = "(I)Z", line = 8)
    public final boolean method628(int arg0) {
        if (arg0 <= 95) {
            field6132 = null;
        }
        ++field6135;
        return class417.field5900[(super.field4410 >> class371.field5241) - -class218.field2854 + -class103.field1410][(super.field4418 >> class371.field5241) + -class307.field4314 + class218.field2854];
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(IIIIII)V", line = 18)
    public class441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field4410 = arg0;
        this.field6133 = (short) arg5;
        super.field4408 = (byte) arg3;
        super.field4413 = arg1;
        super.field4418 = arg2;
        super.field4419 = (byte) arg4;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "([Ltj;B)I", line = 33)
    public final int method626(class687[] arg0, byte arg1) {
        if (arg1 != -80) {
            this.method628(14);
        }
        ++field6136;
        return this.method2059((byte) -111, super.field4410 >> class371.field5241, super.field4418 >> class371.field5241, arg0);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)V", line = 47)
    public static final void method2703(boolean arg0) throws class692 {
        ++field6130;
        if (!arg0) {
            method2705(50, 98, 73, -75, -97, 24, 54, 102, -45, -111);
        }
        if (~class521.field7260 == -2) {
            class496.field6948.method262(class154.field2107, class26.field325);
        } else {
            class496.field6948.method262(0, 0);
        }
    }

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "(Lha;B)Z", line = 62)
    public final boolean method627(class548 arg0, byte arg1) {
        ++field6134;
        if (arg1 < 80) {
            this.method626((class687[]) null, (byte) -2);
        }
        return class409.method2565(super.field4418 >> class371.field5241, super.field4419, super.field4410 >> class371.field5241, 0);
    }

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "(B)V", line = 73)
    public static void method2704(byte arg0) {
        if (arg0 == -11) {
            field6132 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIIIIII)V", line = 83)
    public static final void method2705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != 31603) {
            field6132 = null;
        }
        ++field6131;
        if (~arg0 == ~arg1 && arg4 == arg7 && ~arg2 == ~arg8 && arg3 == arg9) {
            class733.method4079(arg9, arg0, arg6, arg8, -16192, arg7);
        } else {
            int var10 = arg0;
            int var11 = arg7;
            int var12 = arg0 * 3;
            int var13 = arg7 * 3;
            int var14 = arg1 * 3;
            int var15 = arg4 * 3;
            int var16 = arg2 * 3;
            int var17 = arg3 * 3;
            int var18 = -var16 + arg8 + var14 + -arg0;
            int var19 = -var17 + arg9 + -arg7 - -var15;
            int var20 = -var14 + var12 + var16 + -var14;
            int var21 = -var15 + var17 + -var15 + var13;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 - (-var29 + -var31) >> 12) + arg0;
                int var34 = (var30 + var32 + var28 >> 12) + arg7;
                class733.method4079(var34, var10, arg6, var33, arg5 ^ -17485, var11);
                var11 = var34;
                var10 = var33;
            }
        }
    }
}
