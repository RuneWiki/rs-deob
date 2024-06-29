import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class150 extends class615 {

    @OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
    private int field2394 = 1;

    @OriginalMember(owner = "client!uq", name = "L", descriptor = "I")
    private int field2396 = 1;

    @OriginalMember(owner = "client!uq", name = "N", descriptor = "I")
    public static int field2398 = 0;

    @OriginalMember(owner = "client!uq", name = "F", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!uq", name = "G", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!uq", name = "H", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!uq", name = "K", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!uq", name = "M", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!uq", name = "O", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)[I", line = 4)
    public final int[] method8(int arg0, byte arg1) {
        ++field2392;
        int[] var3 = super.field8125.method298(arg0, arg1 + -98);
        if (arg1 != -18) {
            method1073(-84, (class201) null);
        }
        if (super.field8125.field579) {
            int var4 = this.field2394 + 1 + this.field2394;
            int var5 = 65536 / var4;
            int var6 = this.field2396 + 1 + this.field2396;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field2394 + arg0; ~(arg0 - -this.field2394) <= ~var9; ++var9) {
                int[] var13 = this.method3366(0, 997, class658.field9107 & var9);
                int[] var14 = new int[class505.field6740];
                int var15 = 0;
                for (int var16 = -this.field2396; ~var16 >= ~this.field2396; ++var16) {
                    var15 += var13[var16 & class313.field4306];
                }
                int var17 = 0;
                while (~var17 > ~class505.field6740) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class313.field4306 & -this.field2396 + var17];
                    ++var17;
                    var15 = var13[this.field2396 + var17 & class313.field4306] + var18;
                }
                var8[var9 - -this.field2394 + -arg0] = var14;
            }
            for (int var10 = 0; ~class505.field6740 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V", line = 91)
    public class150() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)V", line = 95)
    public static final void method1070(int arg0, int arg1) {
        ++field2395;
        if (~arg1 != arg0) {
            if (class569.field7567[arg1]) {
                class169.field2611.method2547(-19, arg1);
                class601.field7977[arg1] = null;
                class699.field9814[arg1] = null;
                class569.field7567[arg1] = false;
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZZ)Z", line = 118)
    public static boolean method1071(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BILeh;)V", line = 127)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field8118 = arg2.method2034(255) == 1;
                }
            } else {
                this.field2394 = arg2.method2034(255);
            }
        } else {
            this.field2396 = arg2.method2034(255);
        }
        if (arg0 >= 44) {
            ++field2397;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lcea;Z)V", line = 172)
    public static final void method1072(class201 arg0, boolean arg1) {
        ++field2391;
        arg0.method1311(958520326);
        int var2 = class416.field5693;
        class403 var3 = class199.field2897 = class572.field7601[var2] = new class403();
        var3.field5633 = var2;
        int var4 = arg0.method1318(-46, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = 16383 & var4 >> 14;
        int var7 = var4 & 16383;
        if (arg1) {
            field2398 = 104;
        }
        var3.field5643[0] = var6 - class473.field6334;
        var3.field8620 = (var3.field5643[0] << 9) + (var3.method2317((byte) 40) << 8);
        var3.field5649[0] = -class233.field3269 + var7;
        var3.field8612 = (var3.field5649[0] << 9) + (var3.method2317((byte) 40) << 8);
        class29.field476 = var3.field8609 = var5;
        if (class131.field2156[var2] != null) {
            var3.method2318(class131.field2156[var2], 795);
        }
        class664.field9426 = 0;
        class55.field762[class664.field9426++] = var2;
        class348.field4777[var2] = 0;
        class143.field2308 = 0;
        for (int var8 = 1; ~var8 > -2049; ++var8) {
            if (~var2 != ~var8) {
                int var9 = arg0.method1318(-18, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 255;
                int var12 = 255 & var9;
                class8 var13 = class541.field7123[var8] = new class8();
                var13.field187 = (var11 << 14) + ((var10 << 28) - -var12);
                var13.field191 = -1;
                var13.field189 = false;
                var13.field190 = 0;
                class684.field9620[class143.field2308++] = var8;
                class348.field4777[var8] = 0;
            }
        }
        arg0.method1308(8);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)[[I", line = 242)
    public final int[][] method223(int arg0, int arg1) {
        ++field2399;
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (super.field8129.field6315) {
            int var4 = this.field2394 + this.field2394 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field2396 + this.field2396 - -1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field2394 + arg1; ~var9 >= ~(this.field2394 + arg1); ++var9) {
                int[][] var19 = this.method3368(true, 0, var9 & class658.field9107);
                int[][] var20 = new int[3][class505.field6740];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field2396; var27 <= this.field2396; ++var27) {
                    int var37 = class313.field4306 & var27;
                    var23 += var26[var37];
                    var22 += var25[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class505.field6740 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field2396 + var31 & class313.field4306;
                    int var33 = var21 - var24[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var22 - var25[var32];
                    ++var31;
                    int var36 = this.field2396 + var31 & class313.field4306;
                    var21 = var24[var36] + var33;
                    var22 = var25[var36] + var35;
                    var23 = var26[var36] + var34;
                }
                var8[this.field2394 - arg1 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class505.field6740; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        if (arg0 != 2) {
            this.field2396 = 68;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILcea;)I", line = 383)
    public static final int method1073(int arg0, class201 arg1) {
        ++field2393;
        int var2 = arg1.method1318(-116, 2);
        if (arg0 != -2049) {
            return -59;
        } else {
            int var3;
            if (~var2 == -1) {
                var3 = 0;
            } else if (~var2 == -2) {
                var3 = arg1.method1318(-19, 5);
            } else if (var2 == 2) {
                var3 = arg1.method1318(102, 8);
            } else {
                var3 = arg1.method1318(-64, 11);
            }
            return var3;
        }
    }
}
