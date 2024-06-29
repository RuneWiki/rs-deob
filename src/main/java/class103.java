import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class103 extends class13 {

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    private int field1417 = 1;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    private int field1414 = 1;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    public static int field1413 = -1;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "B")
    public static byte field1421;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    public class103() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[[I")
    public final int[][] method222(int arg0, int arg1) {
        ++field1415;
        int[][] var3 = super.field256.method1930(arg1, (byte) 118);
        if (arg0 != -27832) {
            this.method29(true, 44);
        }
        if (super.field256.field4154) {
            int var4 = this.field1414 + this.field1414 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1417 - (-this.field1417 + -1);
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field1414 + arg1; var9 <= arg1 - -this.field1414; ++var9) {
                int[][] var19 = this.method227(false, class123.field1710 & var9, 0);
                int[][] var20 = new int[3][class269.field3751];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field1417; this.field1417 >= var27; ++var27) {
                    int var37 = class343.field4677 & var27;
                    var21 += var24[var37];
                    var23 += var26[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class269.field3751) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field1417 + var31 & class343.field4677;
                    ++var31;
                    int var33 = var21 - var24[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var22 - var25[var32];
                    int var36 = class343.field4677 & this.field1417 + var31;
                    var21 = var24[var36] + var33;
                    var23 = var26[var36] + var34;
                    var22 = var25[var36] + var35;
                }
                var8[this.field1414 + var9 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class269.field3751 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
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
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field259 = ~arg0.method172((byte) 52) == -2;
                }
            } else {
                this.field1414 = arg0.method172((byte) 52);
            }
        } else {
            this.field1417 = arg0.method172((byte) 52);
        }
        ++field1416;
        if (arg1 < 50) {
            field1413 = 115;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field1418;
        if (!arg0) {
            this.method29(false, -20);
        }
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            int var4 = this.field1414 + 1 + this.field1414;
            int var5 = 65536 / var4;
            int var6 = this.field1417 + 1 + this.field1417;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field1414 + arg1; ~(arg1 - -this.field1414) <= ~var9; ++var9) {
                int[] var13 = this.method223(0, -11541, class123.field1710 & var9);
                int[] var14 = new int[class269.field3751];
                int var15 = 0;
                for (int var16 = -this.field1417; ~var16 >= ~this.field1417; ++var16) {
                    var15 += var13[var16 & class343.field4677];
                }
                int var17 = 0;
                while (~var17 > ~class269.field3751) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class343.field4677 & -this.field1417 + var17];
                    ++var17;
                    var15 = var13[var17 - -this.field1417 & class343.field4677] + var18;
                }
                var8[-arg1 + this.field1414 + var9] = var14;
            }
            for (int var10 = 0; ~class269.field3751 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(B)V")
    public static final void method740(byte arg0) {
        ++field1419;
        if (arg0 >= 95) {
            class247.field3476 = null;
            class274.field3823 = null;
        }
    }

    static {
        new class442("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    }
}
