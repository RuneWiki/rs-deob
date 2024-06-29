import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class522 extends class207 {

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Z")
    public static boolean field7253 = false;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field7257 = 0;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lrd;)V", line = 3)
    public class522(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)I", line = 11)
    public final int method36(int arg0) {
        ++field7261;
        if (arg0 > -14) {
            return -109;
        } else {
            return super.field2668.method2254(49) ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(IB)I", line = 26)
    public final int method39(int arg0, byte arg1) {
        ++field7254;
        if (arg1 != 69) {
            field7253 = true;
        }
        return 3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)B", line = 40)
    public static final byte method3034(int arg0, int arg1, int arg2) {
        ++field7255;
        if (arg1 != 2) {
            field7257 = 61;
        }
        if (~arg2 != -10) {
            return 0;
        } else {
            return (byte) (~(arg0 & 1) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 59)
    public final void method37(int arg0) {
        int var2 = -91 % ((-58 - arg0) / 48);
        super.field2669 = this.method36(-74);
        ++field7258;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(ILrd;)V", line = 69)
    public class522(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIBIIII)V", line = 78)
    public static final void method3035(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7259;
        if (arg5 != 126) {
            field7253 = true;
        }
        if (~arg2 == ~arg8 && ~arg6 == ~arg7 && arg1 == arg9 && ~arg3 == ~arg4) {
            class547.method3149(203818028, arg9, arg2, arg6, arg0, arg3);
        } else {
            int var10 = arg2;
            int var11 = arg6;
            int var12 = arg2 * 3;
            int var13 = arg6 * 3;
            int var14 = arg8 * 3;
            int var15 = arg7 * 3;
            int var16 = arg1 * 3;
            int var17 = arg4 * 3;
            int var18 = arg9 - var16 + -arg2 + var14;
            int var19 = -arg6 + var15 + -var17 + arg3;
            int var20 = -var14 + var16 + -var14 + var12;
            int var21 = -var15 + var17 + -var15 + var13;
            int var22 = var14 - var12;
            int var23 = -var13 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg2;
                int var34 = arg6 - -(var28 + var30 + var32 >> 12);
                class547.method3149(203818028, var33, var10, var11, arg0, var34);
                var10 = var33;
                var11 = var34;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V", line = 153)
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        ++field7260;
        if (arg1 > -7) {
            field7257 = -121;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)I", line = 166)
    public final int method3036(int arg0) {
        ++field7256;
        if (arg0 != 43) {
            this.method37(22);
        }
        return super.field2669;
    }
}
