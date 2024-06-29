import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class311 extends class232 {

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    private int field5306 = 1;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    private int field5308 = 1;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "Lhi;")
    public static class82 field5310 = class95.method664((byte) -50, "blaugr-Un:");

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "Lhi;")
    public static class82 field5307 = class95.method664((byte) -60, "Hierhin drehen");

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "Lhi;")
    public static class82 field5309 = class95.method664((byte) -83, "S-Blectionner");

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "Lhi;")
    public static class82 field5315 = class95.method664((byte) -84, "_");

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "[I")
    public static int[] field5316 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "[I")
    public static int[] field5314;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "[Lad;")
    public static class180[] field5311;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(IB)[I", line = 13)
    public final int[] method80(int arg0, byte arg1) {
        int var3 = 35 % ((-arg1 - 31) / 55);
        field5317++;
        int[] var4 = this.field4008.method131((byte) -125, arg0);
        if (this.field4008.field256) {
            int var5 = this.field5308 + this.field5308 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field5306 + this.field5306 + 1;
            int[][] var8 = new int[var7][];
            int var9 = 65536 / var7;
            for (int var10 = arg0 - this.field5306; var10 <= this.field5306 + arg0; var10++) {
                int[] var11 = this.method1649(0, (byte) 124, class209.field3684 & var10);
                int[] var12 = new int[class54.field858];
                int var13 = 0;
                for (int var14 = -this.field5308; var14 <= this.field5308; var14++) {
                    var13 += var11[class65.field1024 & var14];
                }
                int var15 = 0;
                while (class54.field858 > var15) {
                    var12[var15] = var6 * var13 >> 16;
                    int var16 = var13 - var11[var15 - this.field5308 & class65.field1024];
                    var15++;
                    var13 = var11[class65.field1024 & this.field5308 + var15] + var16;
                }
                var8[var10 + this.field5306 - arg0] = var12;
            }
            for (int var17 = 0; var17 < class54.field858; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var7; var19++) {
                    var18 += var8[var19][var17];
                }
                var4[var17] = var9 * var18 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)[[I", line = 101)
    public final int[][] method146(int arg0, byte arg1) {
        field5318++;
        if (arg1 != -82) {
            this.method81(-128, (byte) 94, (class153) null);
        }
        int[][] var3 = this.field3996.method136(arg1 ^ 0xFFFFFFAE, arg0);
        if (this.field3996.field278) {
            int var4 = this.field5306 + this.field5306 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field5308 - (-this.field5308 - 1);
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field5306; var9 <= (arg0 + this.field5306); var9++) {
                int[][] var10 = this.method1641(0, var9 & class209.field3684, (byte) -98);
                int[][] var11 = new int[3][class54.field858];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[2];
                int[] var17 = var10[1];
                for (int var18 = -this.field5308; var18 <= this.field5308; var18++) {
                    int var19 = class65.field1024 & var18;
                    var13 += var15[var19];
                    var14 += var16[var19];
                    var12 += var17[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (class54.field858 > var23) {
                    var20[var23] = var7 * var13 >> 16;
                    var21[var23] = var7 * var12 >> 16;
                    var22[var23] = var7 * var14 >> 16;
                    int var24 = class65.field1024 & var23 - this.field5308;
                    int var25 = var14 - var16[var24];
                    var23++;
                    int var26 = var13 - var15[var24];
                    int var27 = var12 - var17[var24];
                    int var28 = class65.field1024 & this.field5308 + var23;
                    var12 = var17[var28] + var27;
                    var13 = var15[var28] + var26;
                    var14 = var16[var28] + var25;
                }
                var8[this.field5306 + var9 - arg0] = var11;
            }
            int[] var29 = var3[1];
            int[] var30 = var3[0];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class54.field858; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var34 += var37[0][var32];
                    var35 += var37[1][var32];
                    var33 += var37[2][var32];
                }
                var30[var32] = var5 * var34 >> 16;
                var29[var32] = var5 * var35 >> 16;
                var31[var32] = var5 * var33 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "(I)V", line = 236)
    public static void method2135(int arg0) {
        field5315 = null;
        field5314 = null;
        field5310 = null;
        if (arg0 >= -46) {
            method2135(-25);
        }
        field5316 = null;
        field5307 = null;
        field5309 = null;
        field5311 = null;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 252)
    public class311() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLbc;)V", line = 289)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field5308 = arg2.method1082(arg1 ^ 0x6F);
        } else if (arg0 == 1) {
            this.field5306 = arg2.method1082(arg1 - 82);
        } else if (arg0 == 2) {
            this.field3990 = arg2.method1082(-94) == 1;
        }
        if (arg1 != -19) {
            this.method80(-108, (byte) 89);
        }
        field5313++;
    }
}
