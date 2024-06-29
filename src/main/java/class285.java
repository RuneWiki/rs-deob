import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class285 extends class21 {

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    private int field4407 = 1;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    private int field4409 = 1;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "Lbo;")
    public static class15 field4411 = new class15();

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "[I")
    public static int[] field4412 = new int[128];

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    public static int field4414 = 0;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "[I")
    public static int[] field4415 = new int[5];

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field4413 = -1;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    public static int field4417 = 0;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "Loj;")
    public static class283 field4416;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILag;)V", line = 4)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field4405++;
        if (arg1 == 0) {
            this.field4407 = arg2.method1317((byte) -77);
        } else if (arg1 == 1) {
            this.field4409 = arg2.method1317((byte) -99);
        } else if (arg1 == 2) {
            this.field444 = arg2.method1317((byte) -98) == 1;
        }
        if (arg0 != -318) {
            field4413 = -24;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IB)[[I", line = 57)
    public final int[][] method175(int arg0, byte arg1) {
        field4406++;
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (this.field441.field532) {
            int var4 = this.field4409 + this.field4409 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4407 + this.field4407 + 1;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var6;
            for (int var9 = arg0 - this.field4409; var9 <= arg0 + this.field4409; var9++) {
                int[][] var10 = this.method173(0, class204.field3323 & var9, (byte) 100);
                int[][] var11 = new int[3][class294.field4489];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[1];
                int[] var16 = var10[0];
                int[] var17 = var10[2];
                for (int var18 = -this.field4407; var18 <= this.field4407; var18++) {
                    int var19 = var18 & class4.field108;
                    var14 += var17[var19];
                    var13 += var16[var19];
                    var12 += var15[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (class294.field4489 > var23) {
                    var20[var23] = var8 * var13 >> 16;
                    var21[var23] = var8 * var12 >> 16;
                    var22[var23] = var8 * var14 >> 16;
                    int var24 = class4.field108 & var23 - this.field4407;
                    int var25 = var13 - var16[var24];
                    int var26 = var12 - var15[var24];
                    int var27 = var14 - var17[var24];
                    var23++;
                    int var28 = class4.field108 & this.field4407 + var23;
                    var14 = var17[var28] + var27;
                    var13 = var16[var28] + var25;
                    var12 = var15[var28] + var26;
                }
                var7[var9 + this.field4409 - arg0] = var11;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[2];
            int[] var31 = var3[1];
            for (int var32 = 0; var32 < class294.field4489; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var7[var36];
                    var34 += var37[1][var32];
                    var35 += var37[2][var32];
                    var33 += var37[0][var32];
                }
                var29[var32] = var5 * var33 >> 16;
                var31[var32] = var5 * var34 >> 16;
                var30[var32] = var5 * var35 >> 16;
            }
        }
        if (arg1 <= 16) {
            this.method178(54, -42, (class202) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I", line = 192)
    public final int[] method177(int arg0, int arg1) {
        int var3 = 63 % ((33 - arg0) / 36);
        int[] var4 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int var5 = this.field4409 + this.field4409 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field4407 + this.field4407 + 1;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = arg1 - this.field4409; var10 <= this.field4409 + arg1; var10++) {
                int[] var11 = this.method171(0, 85, class204.field3323 & var10);
                int[] var12 = new int[class294.field4489];
                int var13 = 0;
                for (int var14 = -this.field4407; var14 <= this.field4407; var14++) {
                    var13 += var11[class4.field108 & var14];
                }
                int var15 = 0;
                while (class294.field4489 > var15) {
                    var12[var15] = var8 * var13 >> 16;
                    int var16 = var13 - var11[class4.field108 & var15 - this.field4407];
                    var15++;
                    var13 = var11[var15 + this.field4407 & class4.field108] + var16;
                }
                var9[this.field4409 + var10 - arg1] = var12;
            }
            for (int var17 = 0; var17 < class294.field4489; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var5; var19++) {
                    var18 += var9[var19][var17];
                }
                var4[var17] = var6 * var18 >> 16;
            }
        }
        field4408++;
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V", line = 274)
    public static final void method1927(int arg0) {
        class328.field5020 = new class55();
        field4410++;
        if (arg0 > -96) {
            field4417 = -44;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 315)
    public class285() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(Z)V", line = 291)
    public static void method1928(boolean arg0) {
        field4415 = null;
        field4416 = null;
        field4411 = null;
        field4412 = null;
        if (!arg0) {
            method1928(false);
        }
    }
}
