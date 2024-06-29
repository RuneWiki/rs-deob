import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class51 extends class33 {

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    private int field1045 = 1;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
    private int field1059 = 1;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "Lrd;")
    public static class173 field1055 = class133.method843("mod_icons", -105);

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
    public static int field1058 = 1;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field1048 = -1;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "[[S")
    public static short[][] field1057 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!f", name = "V", descriptor = "Lrd;")
    public static class173 field1054 = class133.method843("Hier wechseln", -67);

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "Lbc;")
    public static class14 field1049;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "Ljava/lang/String;")
    public static String field1046;

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class51() {
        super(1, false);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        ++field1051;
        if (arg0 < 112) {
            field1048 = -61;
        }
        int[][] var3 = super.field731.method1340(-125, arg1);
        if (super.field731.field3925) {
            int var4 = this.field1059 + 1 + this.field1059;
            int var5 = this.field1045 - -1 + this.field1045;
            int[][][] var6 = new int[var4][][];
            for (int var7 = -this.field1059 + arg1; arg1 - -this.field1059 >= var7; ++var7) {
                int[][] var17 = this.method259(0, -9, var7 & class26.field545);
                int var18 = 0;
                int[][] var19 = new int[3][class117.field2173];
                int var20 = 0;
                int[] var21 = var17[0];
                int var22 = 0;
                int[] var23 = var17[1];
                int[] var24 = var17[2];
                for (int var25 = -this.field1045; ~var25 >= ~this.field1045; ++var25) {
                    int var35 = class125.field2347 & var25;
                    var18 += var21[var35];
                    var20 += var23[var35];
                    var22 += var24[var35];
                }
                int[] var26 = var19[1];
                int[] var27 = var19[0];
                int[] var28 = var19[2];
                int var29 = 0;
                while (~var29 > ~class117.field2173) {
                    var27[var29] = var18 / var5;
                    var26[var29] = var20 / var5;
                    var28[var29] = var22 / var5;
                    int var30 = class125.field2347 & var29 - this.field1045;
                    int var31 = var18 - var21[var30];
                    int var32 = var20 - var23[var30];
                    int var33 = var22 - var24[var30];
                    ++var29;
                    int var34 = class125.field2347 & this.field1045 + var29;
                    var22 = var24[var34] + var33;
                    var18 = var21[var34] + var31;
                    var20 = var23[var34] + var32;
                }
                var6[-arg1 + var7 - -this.field1059] = var19;
            }
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class117.field2173; ++var11) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 0; var4 > var15; ++var15) {
                    int[][] var16 = var6[var15];
                    var14 += var16[1][var11];
                    var13 += var16[2][var11];
                    var12 += var16[0][var11];
                }
                var8[var11] = var12 / var4;
                var9[var11] = var14 / var4;
                var10[var11] = var13 / var4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field1052;
        int var3 = 4 / ((arg1 - -65) / 60);
        int[] var4 = super.field718.method514(arg0, -93);
        if (super.field718.field1615) {
            int var5 = this.field1059 + this.field1059 - -1;
            int var6 = this.field1045 + this.field1045 + 1;
            int[][] var7 = new int[var5][];
            for (int var8 = arg0 - this.field1059; ~(arg0 - -this.field1059) <= ~var8; ++var8) {
                int[] var12 = this.method262(class26.field545 & var8, -116, 0);
                int[] var13 = new int[class117.field2173];
                int var14 = 0;
                for (int var15 = -this.field1045; ~this.field1045 <= ~var15; ++var15) {
                    var14 += var12[class125.field2347 & var15];
                }
                int var16 = 0;
                while (~class117.field2173 < ~var16) {
                    var13[var16] = var14 / var6;
                    int var17 = var14 - var12[class125.field2347 & var16 - this.field1045];
                    ++var16;
                    var14 = var12[class125.field2347 & var16 - -this.field1045] + var17;
                }
                var7[this.field1059 - arg0 + var8] = var13;
            }
            for (int var9 = 0; ~class117.field2173 < ~var9; ++var9) {
                int var10 = 0;
                for (int var11 = 0; var5 > var11; ++var11) {
                    var10 += var7[var11][var9];
                }
                var4[var9] = var10 / var5;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field729 = arg2.method751((byte) -58) == 1;
                }
            } else {
                this.field1059 = arg2.method751((byte) -62);
            }
        } else {
            this.field1045 = arg2.method751((byte) -40);
        }
        if (arg1 > -99) {
            field1047 = 118;
        }
        ++field1056;
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    public static void method349(int arg0) {
        field1049 = null;
        if (arg0 != 3291) {
            method350(-86, -90, (byte) 1, (int[]) null, 72);
        }
        field1055 = null;
        field1046 = null;
        field1057 = null;
        field1054 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB[II)V")
    public static final void method350(int arg0, int arg1, byte arg2, int[] arg3, int arg4) {
        --arg0;
        int var13 = arg4 - 1;
        int var5 = -7 + var13;
        ++field1053;
        while (~arg0 > ~var5) {
            int var6 = arg0 + 1;
            arg3[var6] = arg1;
            int var7 = var6 + 1;
            arg3[var7] = arg1;
            int var8 = var7 + 1;
            arg3[var8] = arg1;
            int var9 = var8 + 1;
            arg3[var9] = arg1;
            int var10 = var9 + 1;
            arg3[var10] = arg1;
            int var11 = var10 + 1;
            arg3[var11] = arg1;
            int var12 = var11 + 1;
            arg3[var12] = arg1;
            arg0 = var12 + 1;
            arg3[arg0] = arg1;
        }
        while (var13 > arg0) {
            ++arg0;
            arg3[arg0] = arg1;
        }
        if (arg2 >= -116) {
            field1049 = null;
        }
    }
}
