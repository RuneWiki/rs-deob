import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class185 extends class283 {

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
    private int field2880 = 1;

    @OriginalMember(owner = "client!nm", name = "Z", descriptor = "I")
    private int field2884 = 1;

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
    public static int field2879 = 0;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "Lna;")
    public static class26 field2876 = class69.method505("Schlie-8en", (byte) -125);

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "[Lkm;")
    public static class324[] field2877 = new class324[32768];

    @OriginalMember(owner = "client!nm", name = "Y", descriptor = "J")
    public static long field2883 = 0L;

    @OriginalMember(owner = "client!nm", name = "bb", descriptor = "Lna;")
    public static class26 field2886 = class69.method505("<col=ff0000>", (byte) -117);

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!nm", name = "X", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!nm", name = "ab", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!nm", name = "W", descriptor = "Lna;")
    public static class26 field2881;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "[I")
    public static int[] field2874;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)[I", line = 12)
    public final int[] method8(int arg0, byte arg1) {
        field2885++;
        int var3 = 74 % ((30 - arg1) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int var5 = this.field2884 + this.field2884 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field2880 + this.field2880 + 1;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = arg0 - this.field2884; var10 <= (arg0 + this.field2884); var10++) {
                int[] var11 = this.method1990(0, var10 & class210.field3268, 32755);
                int[] var12 = new int[class101.field1632];
                int var13 = 0;
                for (int var14 = -this.field2880; var14 <= this.field2880; var14++) {
                    var13 += var11[var14 & class236.field3783];
                }
                int var15 = 0;
                while (class101.field1632 > var15) {
                    var12[var15] = var8 * var13 >> 16;
                    int var16 = var13 - var11[class236.field3783 & var15 - this.field2880];
                    var15++;
                    var13 = var11[class236.field3783 & this.field2880 + var15] + var16;
                }
                var9[var10 + this.field2884 - arg0] = var12;
            }
            for (int var17 = 0; var17 < class101.field1632; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var5; var19++) {
                    var18 += var9[var19][var17];
                }
                var4[var17] = var6 * var18 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(B)V", line = 105)
    public static void method1269(byte arg0) {
        if (arg0 < 31) {
            method1270(false);
        }
        field2874 = null;
        field2886 = null;
        field2876 = null;
        field2877 = null;
        field2881 = null;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 121)
    public class185() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V", line = 125)
    public static final void method1270(boolean arg0) {
        field2882++;
        if (arg0) {
            field2881 = (class26) null;
        }
        if (class80.field1262 > 0) {
            class216.method1451((byte) 46);
        } else {
            class252.field4128 = class88.field1449;
            class88.field1449 = null;
            class193.method1302(40, 5);
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)[[I", line = 148)
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 != -1) {
            field2886 = (class26) null;
        }
        int[][] var3 = this.field4719.method2182((byte) 90, arg1);
        field2875++;
        if (this.field4719.field5381) {
            int var4 = this.field2880 + this.field2880 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2884 + this.field2884 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var6][][];
            for (int var9 = arg1 - this.field2884; var9 <= this.field2884 + arg1; var9++) {
                int[][] var10 = this.method1994(class210.field3268 & var9, 0, (byte) -59);
                int var11 = 0;
                int var12 = 0;
                int[][] var13 = new int[3][class101.field1632];
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field2880; var18 <= this.field2880; var18++) {
                    int var19 = var18 & class236.field3783;
                    var12 += var16[var19];
                    var11 += var15[var19];
                    var14 += var17[var19];
                }
                int[] var20 = var13[2];
                int[] var21 = var13[0];
                int[] var22 = var13[1];
                int var23 = 0;
                while (class101.field1632 > var23) {
                    var21[var23] = var5 * var11 >> 16;
                    var22[var23] = var5 * var12 >> 16;
                    var20[var23] = var5 * var14 >> 16;
                    int var24 = class236.field3783 & var23 - this.field2880;
                    int var25 = var14 - var17[var24];
                    var23++;
                    int var26 = var11 - var15[var24];
                    int var27 = var12 - var16[var24];
                    int var28 = this.field2880 + var23 & class236.field3783;
                    var14 = var17[var28] + var25;
                    var12 = var16[var28] + var27;
                    var11 = var15[var28] + var26;
                }
                var8[this.field2884 + var9 - arg1] = var13;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class101.field1632; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var6; var36++) {
                    int[][] var37 = var8[var36];
                    var35 += var37[2][var32];
                    var33 += var37[1][var32];
                    var34 += var37[0][var32];
                }
                var29[var32] = var7 * var34 >> 16;
                var30[var32] = var7 * var33 >> 16;
                var31[var32] = var7 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILwa;Z)V", line = 297)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field2880 = arg1.method642((byte) -50);
        } else if (arg0 == 1) {
            this.field2884 = arg1.method642((byte) -118);
        } else if (arg0 == 2) {
            this.field4715 = arg1.method642((byte) -51) == 1;
        }
        if (!arg2) {
            this.field2880 = 60;
        }
        field2878++;
    }
}
