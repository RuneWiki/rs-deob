import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class614 extends class175 {

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    private int field8304 = 1;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    private int field8306 = 1;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field8305;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)[[I", line = 6)
    public final int[][] method238(int arg0, byte arg1) {
        ++field8308;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (arg1 >= -47) {
            field8305 = null;
        }
        if (super.field2316.field8746) {
            int var4 = this.field8306 - -1 + this.field8306;
            int var5 = 65536 / var4;
            int var6 = this.field8304 - -1 + this.field8304;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field8306 + arg0; ~var9 >= ~(this.field8306 + arg0); ++var9) {
                int[][] var19 = this.method1205(0, var9 & class698.field9254, 29179);
                int[][] var20 = new int[3][class598.field8136];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field8304; this.field8304 >= var27; ++var27) {
                    int var37 = var27 & class412.field5896;
                    var23 += var26[var37];
                    var21 += var24[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class598.field8136) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field8304 + var31 & class412.field5896;
                    int var33 = var22 - var25[var32];
                    ++var31;
                    int var34 = var23 - var26[var32];
                    int var35 = var21 - var24[var32];
                    int var36 = this.field8304 + var31 & class412.field5896;
                    var23 = var26[var36] + var34;
                    var21 = var24[var36] + var35;
                    var22 = var25[var36] + var33;
                }
                var8[var9 - -this.field8306 + -arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class598.field8136; ++var13) {
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

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V", line = 154)
    public class614() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V", line = 142)
    public static void method3413(int arg0) {
        field8305 = null;
        if (arg0 != 0) {
            method3413(-80);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILdt;Z)V", line = 157)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field2305 = arg1.method1731((byte) 64) == 1;
                }
            } else {
                this.field8306 = arg1.method1731((byte) 64);
            }
        } else {
            this.field8304 = arg1.method1731((byte) 64);
        }
        if (arg2) {
            this.method44(-106, (class254) null, true);
        }
        ++field8310;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)[I", line = 200)
    public final int[] method47(boolean arg0, int arg1) {
        ++field8309;
        if (!arg0) {
            field8305 = null;
        }
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            int var4 = this.field8306 - -this.field8306 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field8304 + 1 + this.field8304;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field8306 + arg1; ~var9 >= ~(this.field8306 + arg1); ++var9) {
                int[] var13 = this.method1202(var9 & class698.field9254, -1150480797, 0);
                int[] var14 = new int[class598.field8136];
                int var15 = 0;
                for (int var16 = -this.field8304; ~var16 >= ~this.field8304; ++var16) {
                    var15 += var13[var16 & class412.field5896];
                }
                int var17 = 0;
                while (var17 < class598.field8136) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class412.field5896 & -this.field8304 + var17];
                    ++var17;
                    var15 = var13[class412.field5896 & this.field8304 + var17] + var18;
                }
                var8[-arg1 + this.field8306 + var9] = var14;
            }
            for (int var10 = 0; ~class598.field8136 < ~var10; ++var10) {
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
