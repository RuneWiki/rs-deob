import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class114 extends class115 {

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "I")
    private int field1322 = 1;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
    private int field1319 = 1;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "Z")
    public static boolean field1320 = false;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
    public static int field1318 = 0;

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "[I")
    public static int[] field1325 = new int[32];

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "[[Laf;")
    public static class249[][] field1321;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjf;I)Ljava/lang/String;")
    public static final String method627(int arg0, class119 arg1, int arg2) {
        ++field1323;
        if (!client.method1076(arg1).method31((byte) -39, arg0) && arg1.field1526 == null) {
            return null;
        } else if (arg1.field1600 != null && ~arg1.field1600.length < ~arg0 && arg1.field1600[arg0] != null && arg1.field1600[arg0].trim().length() != 0) {
            if (arg2 > -38) {
                field1321 = null;
            }
            return arg1.field1600[arg0];
        } else {
            return class267.field3764 ? "Hidden-" + arg0 : null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field1327;
        int[] var3 = super.field1340.method14(arg1 ^ 119, arg0);
        if (super.field1340.field35) {
            int var4 = this.field1322 - -1 + this.field1322;
            int var5 = 65536 / var4;
            int var6 = this.field1319 + 1 + this.field1319;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field1322 + arg0; ~var9 >= ~(arg0 - -this.field1322); ++var9) {
                int[] var13 = this.method631(true, 0, class315.field4488 & var9);
                int[] var14 = new int[class218.field2979];
                int var15 = 0;
                for (int var16 = -this.field1319; ~this.field1319 <= ~var16; ++var16) {
                    var15 += var13[var16 & class92.field1013];
                }
                int var17 = 0;
                while (var17 < class218.field2979) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[var17 - this.field1319 & class92.field1013];
                    ++var17;
                    var15 = var13[this.field1319 + var17 & class92.field1013] + var18;
                }
                var8[this.field1322 + var9 - arg0] = var14;
            }
            for (int var10 = 0; ~class218.field2979 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return arg1 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class114() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "(I)V")
    public static void method628(int arg0) {
        field1321 = null;
        if (arg0 != -2) {
            field1325 = null;
        }
        field1325 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLbk;I)V")
    public final void method149(byte arg0, class211 arg1, int arg2) {
        ++field1326;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field1347 = ~arg1.method1342((byte) -127) == -2;
                }
            } else {
                this.field1322 = arg1.method1342((byte) -126);
            }
        } else {
            this.field1319 = arg1.method1342((byte) -127);
        }
        if (arg0 <= 83) {
            field1325 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)[[I")
    public final int[][] method144(int arg0, int arg1) {
        ++field1317;
        int[][] var3 = super.field1342.method2530(arg0, (byte) 116);
        if (super.field1342.field5819) {
            int var4 = this.field1322 - -this.field1322 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1319 + this.field1319 - -1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field1322 + arg0; ~var9 >= ~(this.field1322 + arg0); ++var9) {
                int[][] var19 = this.method639((byte) 34, var9 & class315.field4488, 0);
                int[][] var20 = new int[3][class218.field2979];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field1319; ~this.field1319 <= ~var27; ++var27) {
                    int var37 = var27 & class92.field1013;
                    var21 += var24[var37];
                    var22 += var25[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class218.field2979) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class92.field1013 & var31 - this.field1319;
                    int var33 = var21 - var24[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var22 - var25[var32];
                    ++var31;
                    int var36 = class92.field1013 & this.field1319 + var31;
                    var22 = var25[var36] + var35;
                    var21 = var24[var36] + var33;
                    var23 = var26[var36] + var34;
                }
                var8[-arg0 + var9 + this.field1322] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class218.field2979; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        int var38 = 99 % ((arg1 - -80) / 45);
        return var3;
    }
}
