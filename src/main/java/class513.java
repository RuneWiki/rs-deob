import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class513 extends class751 {

    @OriginalMember(owner = "client!hca", name = "F", descriptor = "I")
    private int field7334 = 1;

    @OriginalMember(owner = "client!hca", name = "H", descriptor = "I")
    private int field7336 = 1;

    @OriginalMember(owner = "client!hca", name = "C", descriptor = "I")
    public static int field7331 = 0;

    @OriginalMember(owner = "client!hca", name = "E", descriptor = "I")
    public static int field7333 = 0;

    @OriginalMember(owner = "client!hca", name = "B", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!hca", name = "D", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!hca", name = "G", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!hca", name = "A", descriptor = "Lcb;")
    public static class544 field7329;

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "()V")
    public class513() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)V")
    public static void method2990(int arg0) {
        field7329 = null;
        if (arg0 != 20112) {
            field7329 = null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field10415 = arg1.method842(2384) == 1;
                }
            } else {
                this.field7336 = arg1.method842(2384);
            }
        } else {
            this.field7334 = arg1.method842(2384);
        }
        ++field7335;
        int var5 = -48 % ((25 - arg0) / 63);
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lwga;Z)Z")
    public static final boolean method2991(class778 arg0, boolean arg1) {
        boolean var2 = class622.field8777 == class311.field4628;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method247(1449008457);
        if (arg0.field10733 >= 0 && arg0.field10730 >= 0 && arg0.field10727 < class151.field2074 && arg0.field10736 < class12.field249) {
            short var6 = 0;
            for (int var7 = arg0.field10733; var7 <= arg0.field10727; ++var7) {
                for (int var11 = arg0.field10730; var11 <= arg0.field10736; ++var11) {
                    class379 var12 = class386.method2357(arg0.field7710, var7, var11);
                    if (var12 != null) {
                        class393 var13 = class449.method2704(arg0, (byte) -83);
                        class393 var14 = var12.field5437;
                        if (var14 == null) {
                            var12.field5437 = var13;
                        } else {
                            while (var14.field5574 != null) {
                                var14 = var14.field5574;
                            }
                            var14.field5574 = var13;
                        }
                        if (var2 && (class689.field9755[var7][var11] & -16777216) != 0) {
                            var3 = class689.field9755[var7][var11];
                            var4 = class135.field1748[var7][var11];
                            var5 = class322.field4766[var7][var11];
                        }
                        if (!arg1 && var12.field5446 != null && var12.field5446.field10280 > var6) {
                            var6 = var12.field5446.field10280;
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var8 = arg0.field10733; var8 <= arg0.field10727; ++var8) {
                    for (int var9 = arg0.field10730; var9 <= arg0.field10736; ++var9) {
                        if ((class689.field9755[var8][var9] & -16777216) == 0) {
                            class689.field9755[var8][var9] = var3;
                            class135.field1748[var8][var9] = var4;
                            class322.field4766[var8][var9] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class296.field4465[class592.field8357++] = arg0;
            } else {
                int var10 = class622.field8777 == class311.field4628 ? 1 : 0;
                if (arg0.method254((byte) 104)) {
                    if (arg0.method248((byte) -55)) {
                        arg0.field7714 = class110.field1365[var10];
                        class110.field1365[var10] = arg0;
                    } else {
                        arg0.field7714 = class472.field6734[var10];
                        class472.field6734[var10] = arg0;
                        class432.field6151 = true;
                    }
                } else {
                    arg0.field7714 = class511.field7305[var10];
                    class511.field7305[var10] = arg0;
                }
            }
            if (arg1) {
                arg0.field7723 -= var6;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIILge;)V")
    public static final void method2992(int arg0, int arg1, int arg2, class736 arg3) {
        class379 var4 = class386.method2357(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field5446 = arg3;
            int var5 = class622.field8777 == class311.field4628 ? 1 : 0;
            if (arg3.method254((byte) 104)) {
                if (arg3.method248((byte) -55)) {
                    arg3.field7714 = class110.field1365[var5];
                    class110.field1365[var5] = arg3;
                    return;
                }
                arg3.field7714 = class472.field6734[var5];
                class472.field6734[var5] = arg3;
                class432.field6151 = true;
                return;
            }
            arg3.field7714 = class511.field7305[var5];
            class511.field7305[var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        ++field7330;
        if (arg1 != 4095) {
            return null;
        } else {
            int[] var3 = super.field10405.method3601(true, arg0);
            if (super.field10405.field8923) {
                int var4 = this.field7336 + this.field7336 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field7334 + this.field7334 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = arg0 - this.field7336; ~(this.field7336 + arg0) <= ~var9; ++var9) {
                    int[] var13 = this.method4173(class348.field5094 & var9, (byte) -118, 0);
                    int[] var14 = new int[class673.field9452];
                    int var15 = 0;
                    for (int var16 = -this.field7334; this.field7334 >= var16; ++var16) {
                        var15 += var13[var16 & class407.field5754];
                    }
                    int var17 = 0;
                    while (~class673.field9452 < ~var17) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[class407.field5754 & -this.field7334 + var17];
                        ++var17;
                        var15 = var13[this.field7334 + var17 & class407.field5754] + var18;
                    }
                    var8[-arg0 + this.field7336 + var9] = var14;
                }
                for (int var10 = 0; var10 < class673.field9452; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var12 < var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IB)[[I")
    public final int[][] method147(int arg0, byte arg1) {
        if (arg1 != 57) {
            field7331 = 64;
        }
        ++field7332;
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (super.field10409.field8481) {
            int var4 = this.field7336 + this.field7336 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field7334 + 1 + this.field7334;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field7336 + arg0; ~(this.field7336 + arg0) <= ~var9; ++var9) {
                int[][] var19 = this.method4172(0, class348.field5094 & var9, 1);
                int[][] var20 = new int[3][class673.field9452];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field7334; this.field7334 >= var27; ++var27) {
                    int var37 = class407.field5754 & var27;
                    var22 += var25[var37];
                    var23 += var26[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class673.field9452 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = var31 - this.field7334 & class407.field5754;
                    int var33 = var23 - var26[var32];
                    int var34 = var21 - var24[var32];
                    int var35 = var22 - var25[var32];
                    ++var31;
                    int var36 = this.field7334 + var31 & class407.field5754;
                    var22 = var25[var36] + var35;
                    var21 = var24[var36] + var34;
                    var23 = var26[var36] + var33;
                }
                var8[this.field7336 + var9 - arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class673.field9452; ++var13) {
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
