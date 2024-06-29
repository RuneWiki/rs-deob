import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class23 extends class30 {

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    private int field278 = 1;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    private int field284 = 1;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "Lrg;")
    public static class596 field281 = new class596(7, 4);

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "Z")
    public static boolean field288 = false;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "Lsea;")
    public static class648 field279;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V", line = 3)
    public static final void method234(byte arg0) {
        class597.method3370((byte) -62, class366.field4875.field9354, 22050, 2);
        ++field283;
        class11.field99 = class498.method2795(22050, class543.field7374, 0, (byte) 32, class611.field8473);
        class84.method636(true, -102, class400.method2335((class364) null, -9));
        class681.field9723 = class498.method2795(2048, class543.field7374, 1, (byte) 32, class611.field8473);
        class61.field680 = new class232();
        class681.field9723.method3554(class61.field680, 4);
        class408.field5803 = new class362(22050, class357.field4736);
        class176.field2533 = class481.field6621.method3643("scape main", 1);
        if (arg0 == 115) {
            class167.method1179((byte) -121);
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 22)
    public class23() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I", line = 33)
    public final int[] method48(int arg0, int arg1) {
        ++field280;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int var4 = this.field278 + 1 + this.field278;
            int var5 = 65536 / var4;
            int var6 = this.field284 + this.field284 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field278 + arg1; var9 <= this.field278 + arg1; ++var9) {
                int[] var13 = this.method294(class649.field9002 & var9, 0, (byte) -81);
                int[] var14 = new int[class31.field399];
                int var15 = 0;
                for (int var16 = -this.field284; var16 <= this.field284; ++var16) {
                    var15 += var13[var16 & class353.field4694];
                }
                int var17 = 0;
                while (var17 < class31.field399) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class353.field4694 & -this.field284 + var17];
                    ++var17;
                    var15 = var13[this.field284 + var17 & class353.field4694] + var18;
                }
                var8[this.field278 + var9 + -arg1] = var14;
            }
            for (int var10 = 0; ~var10 > ~class31.field399; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return arg0 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BILac;)V", line = 121)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field378 = ~arg2.method2874((byte) -75) == -2;
                }
            } else {
                this.field278 = arg2.method2874((byte) -75);
            }
        } else {
            this.field284 = arg2.method2874((byte) -75);
        }
        if (arg0 <= 100) {
            this.method27((byte) 23, 96, (class501) null);
        }
        ++field286;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V", line = 171)
    public static void method235(int arg0) {
        field279 = null;
        if (arg0 >= -11) {
            field279 = null;
        }
        field281 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)[[I", line = 187)
    public final int[][] method30(int arg0, byte arg1) {
        ++field289;
        int[][] var3 = super.field377.method3683(arg0, (byte) -111);
        if (arg1 != 7) {
            return null;
        } else {
            if (super.field377.field9085) {
                int var4 = this.field278 + 1 + this.field278;
                int var5 = 65536 / var4;
                int var6 = this.field284 + this.field284 + 1;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field278 + arg0; ~(arg0 - -this.field278) <= ~var9; ++var9) {
                    int[][] var19 = this.method292(arg1 ^ 97, 0, var9 & class649.field9002);
                    int[][] var20 = new int[3][class31.field399];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field284; ~this.field284 <= ~var27; ++var27) {
                        int var37 = var27 & class353.field4694;
                        var23 += var26[var37];
                        var21 += var24[var37];
                        var22 += var25[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (~var31 > ~class31.field399) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = class353.field4694 & -this.field284 + var31;
                        int var33 = var21 - var24[var32];
                        int var34 = var23 - var26[var32];
                        ++var31;
                        int var35 = var22 - var25[var32];
                        int var36 = class353.field4694 & this.field284 + var31;
                        var23 = var26[var36] + var34;
                        var22 = var25[var36] + var35;
                        var21 = var24[var36] + var33;
                    }
                    var8[-arg0 + var9 + this.field278] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~class31.field399 < ~var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var17 < var4; ++var17) {
                        int[][] var18 = var8[var17];
                        var16 += var18[2][var13];
                        var14 += var18[0][var13];
                        var15 += var18[1][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lac;I)V", line = 320)
    public static final void method236(class501 arg0, int arg1) {
        ++field285;
        byte[] var2 = new byte[24];
        if (class523.field7100 != null) {
            try {
                class523.field7100.method1347(true, 0L);
                class523.field7100.method1351(0, var2);
                int var3;
                for (var3 = 0; ~var3 > -25 && var2[var3] == 0; ++var3) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; ~var4 > -25; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method2873(24, 0, var2, -29981);
        if (arg1 != 1) {
            method236((class501) null, 88);
        }
    }
}
