import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class13 extends class37 {

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    private int field226 = 1;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    private int field238 = 1;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "Ldd;")
    public static class35 field229 = class180.method1196((byte) -27, "Hierhin gehen");

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "Ldd;")
    public static class35 field236 = null;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "Ldd;")
    private static class35 field225 = class180.method1196((byte) 127, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field232 = 1;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "[I")
    public static int[] field235 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "Ldd;")
    public static class35 field239 = field225;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "Lld;")
    public static class111 field233 = new class111(200);

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "[I")
    public static int[] field234;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field825 = arg2.method221(-95) == 1;
                }
            } else {
                this.field226 = arg2.method221(arg1 ^ -88);
            }
        } else {
            this.field238 = arg2.method221(arg1 ^ -83);
        }
        if (arg1 != 1) {
            this.method1(-44, 40, (class26) null);
        }
        ++field227;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V")
    public static final void method116(byte arg0) {
        ++field228;
        if (arg0 > -12) {
            method117(-44);
        }
        for (class40 var1 = (class40) class25.field503.method1232(25831); var1 != null; var1 = (class40) class25.field503.method1238(22622)) {
            if (class175.field3585 == var1.field876 && !var1.field875) {
                if (var1.field874 <= class89.field1988) {
                    var1.method382(0, class129.field2782);
                    if (var1.field875) {
                        var1.method799(-24265);
                    } else {
                        class48.method430(var1.field876, var1.field882, var1.field892, var1.field885, 60, var1, 0, -1L, false);
                    }
                }
            } else {
                var1.method799(-24265);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 < 5) {
            method117(20);
        }
        int[][] var3 = super.field832.method653(-30711, arg0);
        if (super.field832.field1978) {
            int var4 = this.field226 + this.field226 + 1;
            int var5 = this.field238 + 1 - -this.field238;
            int[][][] var6 = new int[var4][][];
            for (int var7 = -this.field226 + arg0; ~var7 >= ~(this.field226 + arg0); ++var7) {
                int[][] var17 = this.method370(class105.field2348 & var7, 0, 3);
                int[][] var18 = new int[3][class72.field1719];
                int var19 = 0;
                int[] var20 = var17[0];
                int var21 = 0;
                int var22 = 0;
                int[] var23 = var17[2];
                int[] var24 = var17[1];
                for (int var25 = -this.field238; ~this.field238 <= ~var25; ++var25) {
                    int var35 = class71.field1691 & var25;
                    var21 += var23[var35];
                    var22 += var24[var35];
                    var19 += var20[var35];
                }
                int[] var26 = var18[0];
                int[] var27 = var18[2];
                int[] var28 = var18[1];
                int var29 = 0;
                while (class72.field1719 > var29) {
                    var26[var29] = var19 / var5;
                    var28[var29] = var22 / var5;
                    var27[var29] = var21 / var5;
                    int var30 = class71.field1691 & -this.field238 + var29;
                    int var31 = var21 - var23[var30];
                    int var32 = var19 - var20[var30];
                    ++var29;
                    int var33 = var22 - var24[var30];
                    int var34 = this.field238 + var29 & class71.field1691;
                    var21 = var23[var34] + var31;
                    var19 = var20[var34] + var32;
                    var22 = var24[var34] + var33;
                }
                var6[-arg0 + var7 - -this.field226] = var18;
            }
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; ~var11 > ~class72.field1719; ++var11) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 0; ~var4 < ~var15; ++var15) {
                    int[][] var16 = var6[var15];
                    var14 += var16[2][var11];
                    var13 += var16[1][var11];
                    var12 += var16[0][var11];
                }
                var10[var11] = var12 / var4;
                var8[var11] = var13 / var4;
                var9[var11] = var14 / var4;
            }
        }
        ++field240;
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class13() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)Z")
    public static final boolean method117(int arg0) {
        if (arg0 <= 13) {
            method118(126);
        }
        ++field237;
        return ~class54.field1204 != -1 ? true : class83.field1920.method1153((byte) -85);
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
    public static void method118(int arg0) {
        field234 = null;
        int var1 = 95 % ((arg0 - -78) / 45);
        field229 = null;
        field235 = null;
        field239 = null;
        field233 = null;
        field225 = null;
        field236 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field230;
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (arg0 != 75) {
            return null;
        } else {
            if (super.field816.field3661) {
                int var4 = this.field226 + 1 + this.field226;
                int[][] var5 = new int[var4][];
                int var6 = this.field238 - -this.field238 + 1;
                for (int var7 = -this.field226 + arg1; var7 <= this.field226 + arg1; ++var7) {
                    int[] var11 = this.method369(0, var7 & class105.field2348, (byte) 123);
                    int[] var12 = new int[class72.field1719];
                    int var13 = 0;
                    for (int var14 = -this.field238; ~var14 >= ~this.field238; ++var14) {
                        var13 += var11[var14 & class71.field1691];
                    }
                    int var15 = 0;
                    while (~class72.field1719 < ~var15) {
                        var12[var15] = var13 / var6;
                        int var16 = var13 - var11[-this.field238 + var15 & class71.field1691];
                        ++var15;
                        var13 = var11[class71.field1691 & this.field238 + var15] + var16;
                    }
                    var5[this.field226 + var7 + -arg1] = var12;
                }
                for (int var8 = 0; ~var8 > ~class72.field1719; ++var8) {
                    int var9 = 0;
                    for (int var10 = 0; var4 > var10; ++var10) {
                        var9 += var5[var10][var8];
                    }
                    var3[var8] = var9 / var4;
                }
            }
            return var3;
        }
    }
}
