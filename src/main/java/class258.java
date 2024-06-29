import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class258 extends class297 {

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field3837 = 0;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "S")
    public static short field3835 = 32767;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "[[B")
    public static byte[][] field3832;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "[[[B")
    public static byte[][][] field3828;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "[[[I")
    public static int[][][] field3829;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lpk;Lpk;Ljj;IZ)V", line = 7)
    public static final void method1789(class120 arg0, class120 arg1, class159 arg2, int arg3, boolean arg4) {
        class161.field2609 = arg4;
        field3827++;
        class313.field4924 = arg1;
        class195.field3018 = arg0;
        int var5 = arg3 + class313.field4924.method966((byte) 14);
        class216.field3356 = class313.field4924.method962((byte) -105, var5) + var5 * 256;
        class55.field839 = new String[] { null, null, null, null, class47.field727 };
        class201.field3104 = arg2;
        class44.field699 = new String[] { null, null, class147.field2419, null, null };
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)[[I", line = 30)
    public final int[][] method172(int arg0, byte arg1) {
        field3839++;
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480) {
            int[] var4 = this.method2109(arg0, (byte) 97, 2);
            int[][] var5 = this.method2105(arg0, arg1 - 61, 0);
            int[][] var6 = this.method2105(arg0, 2, 1);
            int[] var7 = var3[0];
            int[] var8 = var5[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            int[] var11 = var5[2];
            int[] var12 = var5[1];
            int[] var13 = var6[1];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class31.field491; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var8[var16];
                    var9[var16] = var12[var16];
                    var10[var16] = var11[var16];
                } else if (var17 == 0) {
                    var7[var16] = var14[var16];
                    var9[var16] = var13[var16];
                    var10[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var8[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + (var13[var16] * var18) >> 12;
                    var10[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        if (arg1 != 63) {
            this.method173(3, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V", line = 106)
    public static final void method1790(int arg0) {
        field3836++;
        if (class321.field5021 == -1 || class63.field918 == -1) {
            return;
        }
        int var1 = ((class57.field861 - class111.field1804) * class55.field836 >> 16) + class111.field1804;
        class55.field836 += var1;
        if (class55.field836 >= 65535) {
            if (class170.field2733) {
                class191.field2994 = false;
            } else {
                class191.field2994 = true;
            }
            class55.field836 = 65535;
            class170.field2733 = true;
        } else {
            class170.field2733 = false;
            class191.field2994 = false;
        }
        float var2 = (float) class55.field836 / 65535.0F;
        float[] var3 = new float[3];
        if (arg0 != -4422) {
            method1792(-78);
        }
        int var4 = class257.field3808 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class74.field1131[class321.field5021][var4 + 1][var5] * 3;
            int var7 = (class74.field1131[class321.field5021][var4 + 2][var5] + class74.field1131[class321.field5021][var4 - -2][var5] - class74.field1131[class321.field5021][var4 + 3][var5]) * 3;
            int var8 = class74.field1131[class321.field5021][var4][var5] * 3;
            int var9 = class74.field1131[class321.field5021][var4][var5];
            int var10 = var6 + class74.field1131[class321.field5021][var4 + 2][var5] - var9 - var7;
            int var11 = var8 + var7 - (var6 * 2);
            int var12 = var6 - var8;
            var3[var5] = (((float) var10 * var2 + (float) var11) * var2 + (float) var12) * var2 + (float) var9;
        }
        class332.field5180 = (int) var3[1] * -1;
        class137.field2239 = (int) var3[2] - (class133.field2118 * 128);
        float[] var13 = new float[3];
        class152.field2498 = (int) var3[0] - class117.field1902 * 128;
        int var14 = class50.field759 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class74.field1131[class63.field918][var14][var15] * 3;
            int var17 = class74.field1131[class63.field918][var14][var15];
            int var18 = (class74.field1131[class63.field918][var14 + 2][var15] - (class74.field1131[class63.field918][var14 + 3][var15] - class74.field1131[class63.field918][var14 + 2][var15])) * 3;
            int var19 = class74.field1131[class63.field918][var14 + 1][var15] * 3;
            int var20 = var19 - var16;
            int var21 = var16 + var18 - (var19 * 2);
            int var22 = class74.field1131[class63.field918][var14 + 2][var15] + var19 - var17 - var18;
            var13[var15] = (((float) var22 * var2 + (float) var21) * var2 + (float) var20) * var2 + (float) var17;
        }
        float var23 = var13[0] - var3[0];
        float var24 = (var13[1] - var3[1]) * -1.0F;
        float var25 = var13[2] - var3[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class156.field2561 = (float) Math.atan2((double) var24, var26);
        class110.field1792 = -((float) Math.atan2((double) var23, (double) var25));
        class64.field943 = (int) ((double) class110.field1792 * 325.949D) & 0x7FF;
        class43.field683 = (int) ((double) class156.field2561 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIBIII)V", line = 213)
    public static final void method1791(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 > -33) {
            method1791(16, 74, 110, (byte) -86, -82, 18, -124);
        }
        class327[] var7 = class62.field912;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class327 var9 = var7[var8];
            if (var9 != null && var9.field5113 == 2) {
                class105.method845(arg5, arg4, arg1 >> 1, arg6 >> 1, (var9.field5121 - class117.field1902 << 7) + var9.field5108, var9.field5124 * 2, (var9.field5109 - class133.field2118 << 7) + var9.field5118, (byte) 57);
                if (class57.field866 > -1 && (class307.field4869 % 20) < 10) {
                    class109.field1770[var9.field5120].method698(arg0 + class57.field866 - 12, arg2 + -28 + class136.field2218);
                }
            }
        }
        field3831++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)[I", line = 243)
    public final int[] method173(int arg0, boolean arg1) {
        field3830++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (!arg1) {
            method1790(25);
        }
        if (this.field4760.field388) {
            int[] var4 = this.method2109(arg0, (byte) 116, 0);
            int[] var5 = this.method2109(arg0, (byte) 105, 1);
            int[] var6 = this.method2109(arg0, (byte) 33, 2);
            for (int var7 = 0; var7 < class31.field491; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILaj;)V", line = 297)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg1 != 255) {
            method1792(25);
        }
        if (arg0 == 0) {
            this.field4762 = arg2.method15((byte) 65) == 1;
        }
        field3834++;
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V", line = 319)
    public static void method1792(int arg0) {
        field3828 = (byte[][][]) null;
        field3832 = (byte[][]) null;
        field3829 = (int[][][]) null;
        if (arg0 != 2) {
            field3838 = 52;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 331)
    public class258() {
        super(3, false);
    }
}
