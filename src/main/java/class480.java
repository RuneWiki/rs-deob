import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class480 extends class739 {

    @OriginalMember(owner = "client!lia", name = "G", descriptor = "I")
    private int field6525 = 16;

    @OriginalMember(owner = "client!lia", name = "F", descriptor = "I")
    private int field6524 = 0;

    @OriginalMember(owner = "client!lia", name = "L", descriptor = "I")
    private int field6530 = 4096;

    @OriginalMember(owner = "client!lia", name = "Q", descriptor = "I")
    private int field6535 = 2000;

    @OriginalMember(owner = "client!lia", name = "P", descriptor = "I")
    private int field6534 = 0;

    @OriginalMember(owner = "client!lia", name = "H", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!lia", name = "I", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!lia", name = "K", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!lia", name = "M", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!lia", name = "N", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!lia", name = "O", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!lia", name = "R", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!lia", name = "J", descriptor = "[I")
    public static int[] field6528;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        ++field6526;
        if (arg0 != -23347) {
            return null;
        } else {
            int[] var3 = super.field10311.method2116(arg1, (byte) 51);
            if (super.field10311.field4728) {
                int var4 = this.field6530 >> 1;
                int[][] var5 = super.field10311.method2115(-14453);
                Random var6 = new Random((long) this.field6534);
                for (int var7 = 0; this.field6535 > var7; ++var7) {
                    int var8 = this.field6530 <= 0 ? this.field6524 : this.field6524 + class596.method3377(this.field6530, var6, -103) + -var4;
                    int var9 = 255 & var8 >> 4;
                    int var10 = class596.method3377(class29.field523, var6, -98);
                    int var11 = class596.method3377(class549.field7672, var6, arg0 + 23222);
                    int var12 = var10 - -(class195.field2670[var9] * this.field6525 >> 12);
                    int var13 = (class709.field9851[var9] * this.field6525 >> 12) + var11;
                    int var14 = -var11 + var13;
                    int var15 = var12 - var10;
                    if (~var15 != -1 || var14 != 0) {
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        boolean var16 = ~var15 > ~var14;
                        if (var16) {
                            int var17 = var10;
                            int var18 = var12;
                            var10 = var11;
                            var12 = var13;
                            var11 = var17;
                            var13 = var18;
                        }
                        if (~var12 > ~var10) {
                            int var19 = var10;
                            int var20 = var11;
                            var10 = var12;
                            var11 = var13;
                            var12 = var19;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var10 + var12;
                        int var23 = -var11 + var13;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = -(class596.method3377(4096, var6, arg0 ^ 23364) >> 2) + 1024;
                        int var27 = ~var11 <= ~var13 ? -1 : 1;
                        if (~var23 > -1) {
                            var23 = -var23;
                        }
                        for (int var28 = var10; var12 > var28; ++var28) {
                            int var29 = (-var10 + var28) * var25 + var26 + 1024;
                            int var30 = var28 & class346.field4366;
                            int var31 = var21 & class683.field9515;
                            var24 += var23;
                            if (!var16) {
                                var5[var30][var31] = var29;
                            } else {
                                var5[var31][var30] = var29;
                            }
                            if (~var24 < -1) {
                                var24 += -var22;
                                var21 += var27;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        ++field6527;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            this.field6530 = arg0.method2566(-2);
                        }
                    } else {
                        this.field6524 = arg0.method2566(-2);
                    }
                } else {
                    this.field6525 = arg0.method2600((byte) -123);
                }
            } else {
                this.field6535 = arg0.method2566(-2);
            }
        } else {
            this.field6534 = arg0.method2600((byte) -125);
        }
        if (arg2 != -3) {
            this.method215(-21, -119);
        }
    }

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "(I)V")
    public final void method216(int arg0) {
        if (arg0 != -21773) {
            this.method214((class461) null, 107, 32);
        }
        class144.method1039((byte) -24);
        ++field6533;
    }

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "(Z)V")
    public static void method2756(boolean arg0) {
        if (!arg0) {
            field6528 = null;
        }
        field6528 = null;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIIIBI[[[BLha;IIII)V")
    public static final void method2757(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, byte[][][] arg7, class60 arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field6529;
        if (~arg0 != -1 && arg4 != 0) {
            if (~arg0 == -10) {
                arg11 = 3 & arg11 - -1;
                arg0 = 1;
            }
            if (arg0 == 10) {
                arg11 = arg11 + 3 & 3;
                arg0 = 1;
            }
            if (arg0 == 11) {
                arg0 = 8;
                arg11 = 3 & arg11 + 3;
            }
            int var13 = -128 % ((45 - arg5) / 53);
            arg8.method443(arg1, arg6, arg3, arg10, arg9, arg12, arg7[arg0 + -1][arg11], arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "()V")
    public class480() {
        super(0, true);
    }
}
