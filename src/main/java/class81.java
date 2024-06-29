import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class81 extends class7 {

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    private int field1622 = 1;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    private int field1626 = 1;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field1618 = 0;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field1619 = 1;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "Lob;")
    public static class141 field1627 = class175.method1195(40, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
    public static int field1630 = 0;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "Lob;")
    private static class141 field1628 = class175.method1195(40, "wave2:");

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "Lob;")
    public static class141 field1623 = field1628;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "Lob;")
    public static class141 field1629 = field1628;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "Li;")
    public static class80 field1624;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field99 = arg2.method991(255) == 1;
                }
            } else {
                this.field1622 = arg2.method991(255);
            }
        } else {
            this.field1626 = arg2.method991(255);
        }
        int var5 = 37 % ((arg1 - 66) / 57);
        ++field1625;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 <= 13) {
            method563(false);
        }
        ++field1621;
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int var4 = this.field1622 - -this.field1622 + 1;
            int var5 = this.field1626 + this.field1626 - -1;
            int var6 = 65536 / var5;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var4;
            for (int var9 = -this.field1622 + arg1; this.field1622 + arg1 >= var9; ++var9) {
                int var13 = 0;
                int[] var14 = this.method52(class54.field1050 & var9, 0, 103);
                int[] var15 = new int[class117.field2272];
                for (int var16 = -this.field1626; ~this.field1626 <= ~var16; ++var16) {
                    var13 += var14[class106.field2030 & var16];
                }
                int var17 = 0;
                while (~var17 > ~class117.field2272) {
                    var15[var17] = var6 * var13 >> 16;
                    int var18 = var13 - var14[-this.field1626 + var17 & class106.field2030];
                    ++var17;
                    var13 = var14[this.field1626 + var17 & class106.field2030] + var18;
                }
                var7[var9 - -this.field1622 + -arg1] = var15;
            }
            for (int var10 = 0; ~class117.field2272 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var8 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        int[][] var3 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int var4 = this.field1622 + this.field1622 + 1;
            int var5 = this.field1626 + 1 + this.field1626;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field1622 + arg0; ~(this.field1622 + arg0) <= ~var9; ++var9) {
                int[][] var19 = this.method42(var9 & class54.field1050, 117, 0);
                int[][] var20 = new int[3][class117.field2272];
                int var21 = 0;
                int var22 = 0;
                int[] var23 = var19[1];
                int var24 = 0;
                int[] var25 = var19[2];
                int[] var26 = var19[0];
                for (int var27 = -this.field1626; ~this.field1626 <= ~var27; ++var27) {
                    int var37 = class106.field2030 & var27;
                    var21 += var26[var37];
                    var24 += var25[var37];
                    var22 += var23[var37];
                }
                int[] var28 = var20[1];
                int[] var29 = var20[0];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class117.field2272 > var31) {
                    var29[var31] = var7 * var21 >> 16;
                    var28[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var24 >> 16;
                    int var32 = var31 - this.field1626 & class106.field2030;
                    ++var31;
                    int var33 = var21 - var26[var32];
                    int var34 = var24 - var25[var32];
                    int var35 = var22 - var23[var32];
                    int var36 = var31 - -this.field1626 & class106.field2030;
                    var21 = var26[var36] + var33;
                    var24 = var25[var36] + var34;
                    var22 = var23[var36] + var35;
                }
                var8[-arg0 + this.field1622 + var9] = var20;
            }
            int[] var10 = var3[2];
            int[] var11 = var3[1];
            int[] var12 = var3[0];
            for (int var13 = 0; ~var13 > ~class117.field2272; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[2][var13];
                    var14 += var18[0][var13];
                    var16 += var18[1][var13];
                }
                var12[var13] = var6 * var14 >> 16;
                var11[var13] = var6 * var16 >> 16;
                var10[var13] = var6 * var15 >> 16;
            }
        }
        int var38 = -6 % ((-42 - arg1) / 41);
        ++field1617;
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V")
    public static void method563(boolean arg0) {
        if (arg0) {
            field1627 = null;
        }
        field1623 = null;
        field1629 = null;
        field1624 = null;
        field1628 = null;
        field1627 = null;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(III)V")
    public static final void method564(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class108.field2090; ++var3) {
            for (int var4 = 0; var4 < class163.field3158; ++var4) {
                for (int var5 = 0; var5 < class220.field4172; ++var5) {
                    class153 var6 = class131.field2506[var3][var4][var5];
                    if (var6 != null) {
                        class172 var7 = var6.field2929;
                        if (var7 != null && var7.field3418.method15()) {
                            class1.method5(var7.field3418, var3, var4, var5, 1, 1);
                            if (var7.field3409 != null && var7.field3409.method15()) {
                                class1.method5(var7.field3409, var3, var4, var5, 1, 1);
                                var7.field3418.method13(var7.field3409, 0, 0, 0, false);
                                var7.field3409 = var7.field3409.method14(arg0, arg1, arg2);
                            }
                            var7.field3418 = var7.field3418.method14(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2933; ++var8) {
                            class9 var10 = var6.field2935[var8];
                            if (var10 != null && var10.field147.method15()) {
                                class1.method5(var10.field147, var3, var4, var5, var10.field144 - var10.field156 + 1, var10.field157 - var10.field143 + 1);
                                var10.field147 = var10.field147.method14(arg0, arg1, arg2);
                            }
                        }
                        class124 var9 = var6.field2926;
                        if (var9 != null && var9.field2379.method15()) {
                            class166.method1147(var9.field2379, var3, var4, var5);
                            var9.field2379 = var9.field2379.method14(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class81() {
        super(1, false);
    }
}
