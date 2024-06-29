import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class243 extends class354 {

    @OriginalMember(owner = "client!du", name = "Q", descriptor = "I")
    private int field3410 = 1;

    @OriginalMember(owner = "client!du", name = "O", descriptor = "I")
    private int field3408 = 1;

    @OriginalMember(owner = "client!du", name = "K", descriptor = "I")
    public static int field3404 = 0;

    @OriginalMember(owner = "client!du", name = "L", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!du", name = "M", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!du", name = "N", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!du", name = "P", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!du", name = "S", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!du", name = "R", descriptor = "J")
    public static long field3411;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (arg2 != 1638) {
            this.field3408 = -78;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field5466 = arg0.method1087(false) == 1;
                }
            } else {
                this.field3408 = arg0.method1087(false);
            }
        } else {
            this.field3410 = arg0.method1087(false);
        }
        ++field3412;
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
    public class243() {
        super(1, false);
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field3405;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (arg0 > -74) {
            this.method272((class164) null, 27, -2);
        }
        if (super.field5478.field6213) {
            int var4 = this.field3408 + 1 + this.field3408;
            int var5 = 65536 / var4;
            int var6 = this.field3410 + this.field3410 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field3408; this.field3408 + arg1 >= var9; ++var9) {
                int[] var13 = this.method2275((byte) 110, 0, var9 & class423.field6453);
                int[] var14 = new int[class531.field7814];
                int var15 = 0;
                for (int var16 = -this.field3410; ~this.field3410 <= ~var16; ++var16) {
                    var15 += var13[var16 & class179.field2409];
                }
                int var17 = 0;
                while (~var17 > ~class531.field7814) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class179.field2409 & var17 - this.field3410];
                    ++var17;
                    var15 = var13[class179.field2409 & this.field3410 + var17] + var18;
                }
                var8[this.field3408 + var9 + -arg1] = var14;
            }
            for (int var10 = 0; var10 < class531.field7814; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)[[I")
    public final int[][] method354(int arg0, byte arg1) {
        ++field3409;
        int[][] var3 = super.field5474.method2414((byte) -101, arg0);
        if (super.field5474.field5870) {
            int var4 = this.field3408 + 1 + this.field3408;
            int var5 = 65536 / var4;
            int var6 = this.field3410 - -1 + this.field3410;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field3408; ~(this.field3408 + arg0) <= ~var9; ++var9) {
                int[][] var19 = this.method2274((byte) 84, class423.field6453 & var9, 0);
                int[][] var20 = new int[3][class531.field7814];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field3410; var27 <= this.field3410; ++var27) {
                    int var37 = var27 & class179.field2409;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class531.field7814) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class179.field2409 & -this.field3410 + var31;
                    int var33 = var23 - var26[var32];
                    int var34 = var21 - var24[var32];
                    ++var31;
                    int var35 = var22 - var25[var32];
                    int var36 = class179.field2409 & this.field3410 + var31;
                    var23 = var26[var36] + var33;
                    var21 = var24[var36] + var34;
                    var22 = var25[var36] + var35;
                }
                var8[this.field3408 + var9 + -arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class531.field7814 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
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
        int var38 = 27 / ((arg1 - 48) / 60);
        return var3;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BIIIII[B)Z")
    public static final boolean method1589(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        if (arg0 < 78) {
            return true;
        } else {
            ++field3406;
            int var7 = arg5 % arg3;
            int var8;
            if (~var7 != -1) {
                var8 = -var7 + arg3;
            } else {
                var8 = 0;
            }
            int var9 = -((arg2 + -1 - -arg3) / arg3);
            int var10 = -((arg3 + arg5 - 1) / arg3);
            for (int var11 = var9; var11 < 0; ++var11) {
                for (int var12 = var10; ~var12 > -1; ++var12) {
                    if (arg6[arg1] == 0) {
                        return true;
                    }
                    arg1 += arg3;
                }
                int var13 = arg1 - var8;
                if (arg6[var13 + -1] == 0) {
                    return true;
                }
                arg1 = arg4 + var13;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(III)V")
    public static final void method1590(int arg0, int arg1, int arg2) {
        ++field3407;
        class177 var3 = class344.method2229(arg2, arg1, (byte) 105);
        var3.method1191(118);
        var3.field2372 = arg0;
    }

    static {
        new class446(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }
}
