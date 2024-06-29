import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class394 extends class243 {

    @OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
    private int field5585 = 0;

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
    private int field5578 = 0;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "I")
    private int field5580 = 16;

    @OriginalMember(owner = "client!lp", name = "O", descriptor = "I")
    private int field5588 = 4096;

    @OriginalMember(owner = "client!lp", name = "I", descriptor = "I")
    private int field5583 = 2000;

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "J")
    public static long field5582 = 0L;

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!lp", name = "J", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!lp", name = "L", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!lp", name = "N", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!lp", name = "P", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!lp", name = "Q", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(II)V")
    public static final void method2293(int arg0, int arg1) {
        ++field5586;
        if (arg1 != 1024) {
            method2293(93, 113);
        }
        if (class226.field2934 == 0) {
            class68.field755.method4035(arg0, (byte) 58);
        } else {
            class302.field4082 = arg0;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLha;)V")
    public static final void method2294(byte arg0, class60 arg1) {
        if (arg0 < -35) {
            ++field5590;
            class583.field8166 = new class535[class427.field6031.length];
            for (int var2 = 0; ~class427.field6031.length < ~var2; ++var2) {
                int var3 = class427.field6031[var2];
                class377 var4 = class389.method2270(class473.field6550, true, var3);
                class61 var5 = arg1.method425(var4, class204.method1128(class421.field5901, var3), true);
                class583.field8166[var2] = new class535(var5, var4);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        ++field5584;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.field5588 = arg1.method3402((byte) 127);
                        }
                    } else {
                        this.field5585 = arg1.method3402((byte) 127);
                    }
                } else {
                    this.field5580 = arg1.method3428((byte) -126);
                }
            } else {
                this.field5583 = arg1.method3402((byte) 127);
            }
        } else {
            this.field5578 = arg1.method3428((byte) 69);
        }
        if (arg2 >= -92) {
            method2293(-103, -126);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        ++field5579;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            int var4 = this.field5588 >> 1;
            int[][] var5 = super.field3164.method3743(-4);
            Random var6 = new Random((long) this.field5578);
            for (int var7 = 0; ~this.field5583 < ~var7; ++var7) {
                int var8 = this.field5588 <= 0 ? this.field5585 : -var4 + this.field5585 + class676.method3842(-28737, this.field5588, var6);
                int var9 = (4091 & var8) >> 4;
                int var10 = class676.method3842(-28737, class687.field9628, var6);
                int var11 = class676.method3842(arg0 ^ -28864, class676.field9444, var6);
                int var12 = (class623.field8718[var9] * this.field5580 >> 12) + var10;
                int var13 = (class133.field1707[var9] * this.field5580 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class676.method3842(-28737, 4096, var6) >> 2) + 1024;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var27 = var13 > var11 ? 1 : -1;
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = (var28 - var10) * var25 + var26 - -1024;
                        int var30 = class28.field206 & var28;
                        int var31 = var21 & class625.field8744;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (~var24 < -1) {
                            var21 -= -var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        if (arg0 != 255) {
            this.method85((byte) -38);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
    public class394() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(B)V")
    public final void method85(byte arg0) {
        if (arg0 == 66) {
            ++field5587;
            class333.method1982(arg0 + -66);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method2295(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5589;
        int var7 = class105.method716(false, class29.field238, class759.field10576, arg3);
        int var8 = class105.method716(arg0, class29.field238, class759.field10576, arg6);
        int var9 = class105.method716(false, class165.field2070, class122.field1604, arg1);
        int var10 = class105.method716(arg0, class165.field2070, class122.field1604, arg5);
        int var11 = class105.method716(arg0, class29.field238, class759.field10576, arg3 + arg4);
        int var12 = class105.method716(arg0, class29.field238, class759.field10576, -arg4 + arg6);
        for (int var13 = var7; var11 > var13; ++var13) {
            class168.method980(arg2, class300.field4036[var13], var9, var10, (byte) -123);
        }
        for (int var14 = var8; var14 > var12; --var14) {
            class168.method980(arg2, class300.field4036[var14], var9, var10, (byte) -128);
        }
        int var15 = class105.method716(arg0, class165.field2070, class122.field1604, arg1 + arg4);
        int var16 = class105.method716(false, class165.field2070, class122.field1604, arg5 - arg4);
        for (int var17 = var11; ~var12 <= ~var17; ++var17) {
            int[] var18 = class300.field4036[var17];
            class168.method980(arg2, var18, var9, var15, (byte) -124);
            class168.method980(arg2, var18, var16, var10, (byte) 1);
        }
    }
}
