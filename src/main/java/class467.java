import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class467 extends class646 {

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    private int field6737 = 4096;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "[I")
    private int[] field6742 = new int[3];

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    private int field6740 = 3216;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
    private int field6745 = 3216;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "Leda;")
    public static class116 field6736 = new class116(107, -2);

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "Leda;")
    public static class116 field6747 = new class116(105, -1);

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static void method2759(byte arg0) {
        field6736 = null;
        if (arg0 >= -47) {
            field6736 = null;
        }
        field6747 = null;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)I")
    public static final int method2760(int arg0) {
        ++field6738;
        class117 var1 = class603.field8668;
        synchronized (class603.field8668) {
            return arg0 != 0 ? -61 : class603.field8668.method951(~arg0);
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    public final void method422(int arg0) {
        if (arg0 == -1) {
            this.method2762(-119);
            ++field6743;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method2761(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg7 == ~arg9 && arg4 == arg8 && arg2 == arg5 && ~arg0 == ~arg6) {
            class409.method2445(false, arg5, arg6, arg3, arg8, arg7);
        } else {
            int var10 = arg7;
            int var11 = arg8;
            int var12 = arg7 * 3;
            int var13 = arg8 * 3;
            int var14 = arg9 * 3;
            int var15 = arg4 * 3;
            int var16 = arg2 * 3;
            int var17 = arg0 * 3;
            int var18 = arg5 - var16 + -arg7 + var14;
            int var19 = arg6 - var17 + -arg8 + var15;
            int var20 = var16 - var14 - var14 - -var12;
            int var21 = -var15 + var17 - (-var13 + var15);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 - -var31 >> 12) + arg7;
                int var34 = (var28 + var30 + var32 >> 12) + arg8;
                class409.method2445(false, var33, var34, arg3, var11, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        ++field6746;
        if (arg1 > -115) {
            field6747 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class467() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IB)[I")
    public final int[] method424(int arg0, byte arg1) {
        if (arg1 != -120) {
            method2760(-20);
        }
        ++field6741;
        int[] var3 = super.field9156.method2193(arg1 ^ -1155, arg0);
        if (super.field9156.field5075) {
            int var4 = class542.field7968 * this.field6737 >> 12;
            int[] var5 = this.method3628(false, 0, class453.field6525 & arg0 + -1);
            int[] var6 = this.method3628(false, 0, arg0);
            int[] var7 = this.method3628(false, 0, arg0 + 1 & class453.field6525);
            for (int var8 = 0; ~var8 > ~class89.field1330; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class156.field2572] + -var6[var8 - -1 & class156.field2572]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class8.field99[var11 - -((var12 + 1) * var12 >> 1)] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field6742[2] * var15 >> 12;
                int var18 = this.field6742[1] * var16 >> 12;
                int var19 = this.field6742[0] * var14 >> 12;
                var3[var8] = var18 - -var17 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field6739;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field6740 = arg0.method2755((byte) -86);
                }
            } else {
                this.field6745 = arg0.method2755((byte) -86);
            }
        } else {
            this.field6737 = arg0.method2755((byte) -55);
        }
        if (arg2 <= 7) {
            this.method2762(-101);
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
    private final void method2762(int arg0) {
        ++field6744;
        double var2 = Math.cos((double) ((float) this.field6740 / 4096.0F));
        this.field6742[0] = (int) (Math.sin((double) ((float) this.field6745 / 4096.0F)) * var2 * 4096.0D);
        this.field6742[1] = (int) (4096.0D * Math.cos((double) ((float) this.field6745 / 4096.0F)) * var2);
        this.field6742[2] = (int) (Math.sin((double) ((float) this.field6740 / 4096.0F)) * 4096.0D);
        int var4 = this.field6742[0] * this.field6742[0] >> 12;
        int var5 = this.field6742[1] * this.field6742[1] >> 12;
        int var6 = this.field6742[2] * this.field6742[2] >> 12;
        if (arg0 <= -114) {
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 + var5 >> 12)));
            if (var7 != 0) {
                this.field6742[0] = (this.field6742[0] << 12) / var7;
                this.field6742[2] = (this.field6742[2] << 12) / var7;
                this.field6742[1] = (this.field6742[1] << 12) / var7;
            }
        }
    }
}
