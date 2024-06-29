import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class93 extends class264 {

    @OriginalMember(owner = "client!bj", name = "kb", descriptor = "I")
    private int field1416 = 1;

    @OriginalMember(owner = "client!bj", name = "hb", descriptor = "I")
    private int field1413 = 1;

    @OriginalMember(owner = "client!bj", name = "lb", descriptor = "Lma;")
    public static class5 field1417 = class12.method119(":duelfriend:", (byte) 108);

    @OriginalMember(owner = "client!bj", name = "nb", descriptor = "I")
    public static int field1419 = 0;

    @OriginalMember(owner = "client!bj", name = "fb", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!bj", name = "gb", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!bj", name = "ib", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!bj", name = "jb", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!bj", name = "pb", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!bj", name = "rb", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!bj", name = "ob", descriptor = "Lje;")
    public static class158 field1420;

    @OriginalMember(owner = "client!bj", name = "sb", descriptor = "Lje;")
    public static class158 field1424;

    @OriginalMember(owner = "client!bj", name = "mb", descriptor = "[Lla;")
    public static class178[] field1418;

    @OriginalMember(owner = "client!bj", name = "qb", descriptor = "[Lpk;")
    public static class74[] field1422;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(B)V", line = 9)
    public static void method609(byte arg0) {
        field1424 = null;
        field1422 = null;
        int var1 = 96 % ((arg0 + 79) / 42);
        field1418 = null;
        field1417 = null;
        field1420 = null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(BI)[[I", line = 28)
    public final int[][] method138(byte arg0, int arg1) {
        int var3 = 8 / ((arg0 + 43) / 55);
        int[][] var4 = this.field4524.method1462(-15077, arg1);
        if (this.field4524.field3506) {
            int var5 = this.field1413 + this.field1413 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field1416 + this.field1416 + 1;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = arg1 - this.field1413; var10 <= this.field1413 + arg1; var10++) {
                int[][] var11 = this.method1817(-84, 0, var10 & class68.field1082);
                int var12 = 0;
                int[][] var13 = new int[3][class226.field3716];
                int var14 = 0;
                int var15 = 0;
                int[] var16 = var11[0];
                int[] var17 = var11[2];
                int[] var18 = var11[1];
                for (int var19 = -this.field1416; var19 <= this.field1416; var19++) {
                    int var20 = var19 & class256.field4370;
                    var14 += var17[var20];
                    var12 += var16[var20];
                    var15 += var18[var20];
                }
                int[] var21 = var13[1];
                int[] var22 = var13[0];
                int[] var23 = var13[2];
                int var24 = 0;
                while (class226.field3716 > var24) {
                    var22[var24] = var8 * var12 >> 16;
                    var21[var24] = var8 * var15 >> 16;
                    var23[var24] = var8 * var14 >> 16;
                    int var25 = var24 - this.field1416 & class256.field4370;
                    int var26 = var12 - var16[var25];
                    var24++;
                    int var27 = var14 - var17[var25];
                    int var28 = var15 - var18[var25];
                    int var29 = class256.field4370 & var24 + this.field1416;
                    var12 = var16[var29] + var26;
                    var15 = var18[var29] + var28;
                    var14 = var17[var29] + var27;
                }
                var9[this.field1413 + var10 - arg1] = var13;
            }
            int[] var30 = var4[0];
            int[] var31 = var4[1];
            int[] var32 = var4[2];
            for (int var33 = 0; var33 < class226.field3716; var33++) {
                int var34 = 0;
                int var35 = 0;
                int var36 = 0;
                for (int var37 = 0; var37 < var5; var37++) {
                    int[][] var38 = var9[var37];
                    var35 += var38[0][var33];
                    var36 += var38[2][var33];
                    var34 += var38[1][var33];
                }
                var30[var33] = var6 * var35 >> 16;
                var31[var33] = var6 * var34 >> 16;
                var32[var33] = var6 * var36 >> 16;
            }
        }
        field1421++;
        return var4;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)[I", line = 158)
    public final int[] method5(int arg0, int arg1) {
        if (arg0 > -58) {
            field1420 = (class158) null;
        }
        field1411++;
        int[] var3 = this.field4501.method1176(arg1, 126);
        if (this.field4501.field2741) {
            int var4 = this.field1413 + this.field1413 + 1;
            int var5 = 65536 / var4;
            int[][] var6 = new int[var4][];
            int var7 = this.field1416 + this.field1416 + 1;
            int var8 = 65536 / var7;
            for (int var9 = arg1 - this.field1413; var9 <= (this.field1413 + arg1); var9++) {
                int[] var10 = this.method1815(0, class68.field1082 & var9, 64);
                int var11 = 0;
                int[] var12 = new int[class226.field3716];
                for (int var13 = -this.field1416; var13 <= this.field1416; var13++) {
                    var11 += var10[var13 & class256.field4370];
                }
                int var14 = 0;
                while (class226.field3716 > var14) {
                    var12[var14] = var8 * var11 >> 16;
                    int var15 = var11 - var10[var14 - this.field1416 & class256.field4370];
                    var14++;
                    var11 = var10[this.field1416 + var14 & class256.field4370] + var15;
                }
                var6[var9 + this.field1413 - arg1] = var12;
            }
            for (int var16 = 0; var16 < class226.field3716; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var6[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 244)
    public class93() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILii;)V", line = 252)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 > -27) {
            return;
        }
        if (arg0 == 0) {
            this.field1416 = arg2.method1509(true);
        } else if (arg0 == 1) {
            this.field1413 = arg2.method1509(true);
        } else if (arg0 == 2) {
            this.field4496 = arg2.method1509(true) == 1;
        }
        field1412++;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)Z", line = 321)
    public static final boolean method610(int arg0, int arg1) {
        field1423++;
        if (arg1 > -27) {
            method610(-119, 85);
        }
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }
}
