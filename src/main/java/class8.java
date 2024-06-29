import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class397 implements class529 {

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "[I")
    public static int[] field533 = new int[1];

    @OriginalMember(owner = "client!to", name = "s", descriptor = "[I")
    public static int[] field530 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!to", name = "m", descriptor = "Lqfa;")
    public static class85 field524 = new class85(54, 7);

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)I")
    public final int method260(byte arg0) {
        int var2 = 44 % ((arg0 - 2) / 44);
        ++field523;
        return super.field5787;
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V")
    public static void method261(int arg0) {
        field524 = null;
        field533 = null;
        if (arg0 != 1868827564) {
            field524 = null;
        }
        field530 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)I")
    public final int method262(boolean arg0) {
        ++field532;
        if (!arg0) {
            this.method262(true);
        }
        return this.field531;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I[BII)V")
    public final void method263(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 < -63) {
            this.method2445(arg2, arg1, (byte) -107);
            ++field528;
            this.field531 = arg3;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field529;
        if (arg4 == -23749) {
            if (arg2 == arg9 && ~arg3 == ~arg6 && ~arg1 == ~arg7 && ~arg0 == ~arg5) {
                class645.method3678(arg5, arg8, arg2, true, arg3, arg7);
            } else {
                int var10 = arg2;
                int var11 = arg3;
                int var12 = arg2 * 3;
                int var13 = arg3 * 3;
                int var14 = arg9 * 3;
                int var15 = arg6 * 3;
                int var16 = arg1 * 3;
                int var17 = arg0 * 3;
                int var18 = -arg2 + var14 + -var16 + arg7;
                int var19 = var15 - arg3 + (arg5 - var17);
                int var20 = -var14 - var14 + var12 + var16;
                int var21 = -var15 + var17 + -var15 + var13;
                int var22 = -var12 + var14;
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
                    int var33 = (var27 - (-var29 + -var31) >> 12) + arg2;
                    int var34 = (var28 - -var30 + var32 >> 12) + arg3;
                    class645.method3678(var34, arg8, var10, true, var11, var33);
                    var11 = var34;
                    var10 = var33;
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method265(byte arg0, String arg1) {
        ++field527;
        if (arg0 >= -98) {
            field533 = null;
        }
        System.out.println("Error: " + class656.method3735("\n", arg1, "%0a", 1163));
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    public final void method266(int arg0) {
        ++field525;
        if (arg0 > 31) {
            super.field5790.method67(this, false);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)J")
    public final long method267(int arg0) {
        ++field526;
        if (arg0 != -18583) {
            this.method263(-21, (byte[]) null, 93, 20);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lus;I[BIZ)V")
    public class8(class1 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field531 = arg1;
    }
}
