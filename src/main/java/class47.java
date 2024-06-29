import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class47 {

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "Lll;")
    private class385 field625;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "Lwg;")
    private class449 field638;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    private int field635;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "[B")
    public byte[] field624;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    private int field619;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    private int field633;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    private int field632;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "F")
    public static float field626 = 0.0F;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field629 = -1;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    public static int field639 = 0;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "[[Lcp;")
    private class754[][] field634;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I[[ZIIZI)V")
    public final void method415(int arg0, boolean[][] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field631++;
        this.field638.method2675(false, -8);
        this.field638.method2666(8, false);
        this.field638.method2699((byte) 14, 1);
        this.field638.method2649((byte) 126, arg0);
        this.field638.method2711(-1, false, -2, false);
        float var7 = 1.0F / (float) (this.field638.field6253 * 128);
        if (arg4) {
            for (int var8 = 0; var8 < this.field632; var8++) {
                int var9 = var8 << this.field619;
                int var10 = var8 + 1 << this.field619;
                label142: for (int var11 = 0; var11 < this.field633; var11++) {
                    if (this.field634[var11][var8] != null) {
                        int var12 = var11 << this.field619;
                        int var13 = var11 + 1 << this.field619;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (-arg3 <= var14 - arg5 && arg3 >= (var14 - arg5)) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if (var15 - arg2 >= -arg3 && arg3 >= var15 - arg2 && arg1[arg3 + var14 - arg5][arg3 + var15 - arg2]) {
                                        class256 var16 = this.field638.method2710(-123);
                                        var16.method1529(var7, 1.0F, var7, (byte) 119);
                                        var16.method131(-var11, -var8, 0);
                                        this.field638.method2720(class326.field4040, (byte) 90);
                                        this.field634[var11][var8].method4213(false);
                                        continue label142;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field632; var17++) {
                int var18 = var17 << this.field619;
                int var19 = var17 + 1 << this.field619;
                for (int var20 = 0; var20 < this.field633; var20++) {
                    class754 var21 = this.field634[var20][var17];
                    if (var21 != null) {
                        class422 var22 = this.field638.method2698((byte) -127, var21.field10451 * 3);
                        Buffer var23 = var22.method2527((byte) -61, true);
                        if (var23 != null) {
                            Stream var24 = this.field638.method2650((byte) -29, var23);
                            int var25 = 0;
                            int var26 = var20 << this.field619;
                            int var27 = var20 + 1 << this.field619;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if ((-arg3) <= (var28 - arg2) && (var28 - arg2) <= arg3) {
                                    int var30 = this.field625.field3533 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if (-arg3 <= var31 - arg5 && var31 - arg5 <= arg3 && arg1[arg3 + var31 - arg5][arg3 + var28 - arg2]) {
                                            short[] var32 = this.field625.field4943[var30];
                                            if (var32 != null) {
                                                if (Stream.method3985()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var25++;
                                                        var24.method3991(var32[var34] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var24.method3988(var32[var33] & 0xFFFF);
                                                        var25++;
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method3992();
                            if (var22.method2526(1234) && var25 > 0) {
                                class256 var29 = this.field638.method2710(arg0 ^ 0xFFFFFFB5);
                                var29.method1529(var7, 1.0F, var7, (byte) 114);
                                var29.method131(-var20, -var17, 0);
                                this.field638.method2720(class326.field4040, (byte) 125);
                                var21.method4212(arg0 + 13640, var25 / 3, var22);
                            }
                        }
                    }
                }
            }
        }
        this.field638.method2671(96);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZILr;)V")
    public final void method416(int arg0, boolean arg1, int arg2, class196 arg3) {
        field623++;
        class111 var5 = (class111) arg3;
        int var6 = var5.field1398 + arg0 + 1;
        if (!arg1) {
            this.field635 = 108;
        }
        int var7 = var5.field1391 + arg2 + 1;
        int var8 = var7 + (this.field630 * var6);
        int var9 = 0;
        int var10 = var5.field1392;
        int var11 = var5.field1399;
        int var12 = this.field630 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var6 = 1;
            var8 += this.field630 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field635) {
            int var15 = var6 + var10 + 1 - this.field635;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var14 += var16;
            var12 += var16;
            var7 = 1;
            var11 -= var16;
            var9 += var16;
            var8 += var16;
        }
        if (this.field630 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field630;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class482.method2862(var11, (byte) -86, var8, var5.field1397, var10, var12, var9, this.field624, var14);
            this.method418(var6, var7, var11, 125, var10);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILr;I)V")
    public final void method417(int arg0, int arg1, class196 arg2, int arg3) {
        field640++;
        class111 var5 = (class111) arg2;
        int var6 = var5.field1391 + arg3 + 1;
        int var7 = var5.field1398 + arg0 + 1;
        int var8 = this.field630 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field1392;
        int var11 = var5.field1399;
        int var12 = this.field630 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var8 += this.field630 * var13;
            var10 -= var13;
            var9 += var11 * var13;
        }
        if (arg1 != -17249) {
            method419(null, null, 49, -7, 85, null);
        }
        int var14 = 0;
        if (this.field635 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field635;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var9 += var16;
            var8 += var16;
            var12 += var16;
            var14 += var16;
            var6 = 1;
        }
        if (var6 + var11 >= this.field630) {
            int var17 = var6 + 1 - (this.field630 - var11);
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class382.method2246(var8, var5.field1397, var11, -19590, var12, var14, var10, var9, this.field624);
            this.method418(var7, var6, var11, 127, var10);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIII)V")
    private final void method418(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field622++;
        if (this.field634 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 - (1 - arg2) - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg4 - 2 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class754[] var11 = this.field634[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field10459 = true;
                }
            }
        }
        if (arg3 < 123) {
            field626 = 0.9178599F;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([I[IIIILpc;)Lgh;")
    public static final class575 method419(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, class700 arg5) {
        field621++;
        if (arg3 != 20334) {
            method420(-99, -8, -0.14503716F, 0.1317288F, -0.6850287F, 0.053807914F, null, 67, 91, -119, -107, null, -34, -0.7602869F);
        }
        byte[] var6 = new byte[arg2 * arg4];
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg2 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg1[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class575(arg5, arg2, arg4, var6);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIFFFFLfba;IIII[BIF)V")
    public static final void method420(int arg0, int arg1, float arg2, float arg3, float arg4, float arg5, class27 arg6, int arg7, int arg8, int arg9, int arg10, byte[] arg11, int arg12, float arg13) {
        field637++;
        if (arg8 < 13) {
            method420(-58, -111, -1.4004586F, 0.60823005F, 0.75162184F, -0.005131544F, null, -21, 85, -32, -72, null, -5, 0.36949515F);
        }
        int var14 = arg9 * arg12;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg1; var16++) {
            arg6.method264(arg9, true, arg0, arg5 * 127.0F, arg12, 0, arg13 / (float) arg0, arg3 / (float) arg12, var15, arg7, arg4 / (float) arg9);
            int var19 = arg10;
            arg4 *= 2.0F;
            arg5 = arg2 * arg5;
            arg13 *= 2.0F;
            arg3 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg11[var19] = (byte) ((int) ((float) arg11[var19] + var15[var20]));
                var19++;
            }
        }
        int var17 = arg10;
        for (int var18 = 0; var18 < var14; var18++) {
            arg11[var17] -= -127;
            var17++;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public final void method421(int arg0) {
        this.field634 = new class754[this.field633][this.field632];
        field628++;
        for (int var2 = 0; var2 < this.field632; var2++) {
            for (int var3 = 0; var3 < this.field633; var3++) {
                this.field634[var3][var2] = new class754(this.field638, this, this.field625, var3, var2, this.field619, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field634[var3][var2].field10451 == 0) {
                    this.field634[var3][var2] = null;
                }
            }
        }
        if (arg0 >= -6) {
            this.field630 = -54;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
    public static final void method422(boolean arg0) {
        field620++;
        class65.field887.method3477(arg0);
        class100.field1304.method1149(102);
        class692.field9423.method3090(-9493);
        class379.field4811.method4195(104);
        class444.field5956.method1074(true);
        class121.field1555.method2885(9829);
        class362.field4504.method3603(-58);
        class740.field10303.method1477(true);
        class687.field9368.method4185(arg0);
        class116.field1481.method2621(-769);
        class204.field2444.method3560(-127);
        class249.field2932.method1414((byte) 15);
        class495.field6886.method1707(1);
        class2.field33.method4138(5017);
        class500.field7002.method1912(-9182);
        class113.field1426.method4364((byte) -53);
        class153.field1907.method1235((byte) 63);
        class305.field3675.method3679(-116);
        class520.field7343.method2828(123);
        class5.field63.method2469(true);
        class347.field4336.method1028((byte) -56);
        class607.field8173.method2830(46);
        class251.method1500(-521);
        class519.method3112(-123);
        class535.method3182((byte) -100);
        class335.method1981(5500);
        class227.method1404((byte) 3);
        class629.field8596.method1687((byte) 61);
        class303.field3617.method1687((byte) 61);
        class400.field5226.method1687((byte) 61);
        class710.field9963.method1687((byte) 61);
        class142.field1780.method1687((byte) 61);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIILr;)Z")
    public final boolean method423(int arg0, int arg1, int arg2, class196 arg3) {
        field636++;
        class111 var5 = (class111) arg3;
        int var6 = var5.field1398 + arg2 + 1;
        int var7 = var5.field1391 + arg0 + 1;
        int var8 = this.field630 * var6 + var7;
        if (arg1 < 7) {
            this.field635 = -41;
        }
        int var9 = var5.field1392;
        int var10 = var5.field1399;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var9 -= var11;
            var8 += this.field630 * var11;
            var6 = 1;
        }
        int var12 = this.field630 - var10;
        if ((var6 + var9) >= this.field635) {
            int var13 = var6 + var9 + 1 - this.field635;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var12 += var14;
            var10 -= var14;
            var8 += var14;
        }
        if (this.field630 <= var7 + var10) {
            int var15 = var10 + var7 + 1 - this.field630;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field630 + var12;
            return class708.method4018(var17, -1, var9, this.field624, var10, var16, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lwg;Lll;)V")
    public class47(class449 arg0, class385 arg1) {
        this.field625 = arg1;
        this.field638 = arg0;
        this.field630 = (this.field625.field3533 * this.field625.field3525 >> this.field638.field6267) + 2;
        this.field635 = (this.field625.field3525 * this.field625.field3524 >> this.field638.field6267) + 2;
        this.field624 = new byte[this.field635 * this.field630];
        this.field619 = this.field638.field6267 + 7 - this.field625.field3530;
        this.field633 = this.field625.field3533 >> this.field619;
        this.field632 = this.field625.field3524 >> this.field619;
    }
}
