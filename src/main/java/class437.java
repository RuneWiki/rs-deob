import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class437 extends class439 {

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "Lpp;")
    private class267 field6362;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "Lqg;")
    private class321 field6351;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "Ltj;")
    private class131 field6353;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    private int field6363;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    private int field6356;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    private int field6348;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
    private int field6357;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "[[F")
    private float[][] field6355;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "[[F")
    private float[][] field6365;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "[[F")
    private float[][] field6352;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "Lti;")
    private class303 field6346;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "Lel;")
    private class382 field6359;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "Lcv;")
    private class398 field6350;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "Lce;")
    private class201 field6358;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "Luv;")
    private class243 field6343;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "Lwt;")
    private class202 field6366;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "Lwt;")
    private class202 field6364;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "Lao;")
    public static class188 field6345 = new class188(29, 6);

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    private int field6354;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    private int field6360;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    public static final void method2640(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field6361++;
        try {
            if (class43.field655 == 1) {
                int var1 = class23.field420.method2121(192);
                if (var1 > 0 && class23.field420.method2102(8759)) {
                    int var2 = var1 - class264.field3815;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class23.field420.method2126((byte) -102, var2);
                } else {
                    class23.field420.method2137(6794);
                    class23.field420.method2104(arg0 ^ 0xFFFFFFB2);
                    class377.field5624 = null;
                    if (class251.field3626 == null) {
                        class43.field655 = 0;
                    } else {
                        class43.field655 = 2;
                    }
                    class245.field3534 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class23.field420.method2137(6794);
            class377.field5624 = null;
            class245.field3534 = null;
            class251.field3626 = null;
            class43.field655 = 0;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II[II[I)V")
    public static final void method2641(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        int var5 = 64 % ((54 - arg0) / 62);
        field6347++;
        if (arg3 <= arg1) {
            return;
        }
        int var6 = (arg1 + arg3) / 2;
        int var7 = arg1;
        int var8 = arg4[var6];
        arg4[var6] = arg4[arg3];
        arg4[arg3] = var8;
        int var9 = arg2[var6];
        arg2[var6] = arg2[arg3];
        arg2[arg3] = var9;
        int var10 = var8 == Integer.MAX_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg3; var11++) {
            if (arg4[var11] < (var11 & var10) + var8) {
                int var12 = arg4[var11];
                arg4[var11] = arg4[var7];
                arg4[var7] = var12;
                int var13 = arg2[var11];
                arg2[var11] = arg2[var7];
                arg2[var7++] = var13;
            }
        }
        arg4[arg3] = arg4[var7];
        arg4[var7] = var8;
        arg2[arg3] = arg2[var7];
        arg2[var7] = var9;
        method2641(-58, arg1, arg2, var7 - 1, arg4);
        method2641(127, var7 + 1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
    public static void method2642(int arg0) {
        if (arg0 <= 89) {
            field6345 = null;
        }
        field6345 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[[ZIIB)V")
    public final void method2643(int arg0, boolean[][] arg1, int arg2, int arg3, byte arg4) {
        field6342++;
        if (this.field6358 == null || this.field6363 > (arg0 + arg3) || (arg3 - arg0) > this.field6356 || (arg0 + arg2) < this.field6348 || this.field6357 < arg2 - arg0) {
            return;
        }
        int var6 = this.field6348;
        if (arg4 != 43) {
            this.field6365 = null;
        }
        while (this.field6357 >= var6) {
            for (int var7 = this.field6363; var7 <= this.field6356; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg2;
                if (-arg0 < var8 && arg0 > var8 && -arg0 < var9 && var9 < arg0 && arg1[arg0 + var8][arg0 + var9]) {
                    this.field6351.method2009((int) (this.field6353.method967(69) * 255.0F) << 24, false);
                    this.field6351.method2085(this.field6366, null, null, -29066, this.field6364);
                    this.field6351.method2086(this.field6354, this.field6358, 0, 4, arg4 - 43);
                    return;
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(SI)V")
    private final void method2644(short arg0, int arg1) {
        if (this.field6351.field4850) {
            this.field6346.method1874(arg0, (byte) -110);
        } else {
            this.field6346.method1863((byte) -125, arg0);
        }
        if (arg1 == 0) {
            field6349++;
            this.field6354++;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIII)V")
    private final void method2645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6344++;
        long var8 = -1L;
        int var10 = (arg3 << this.field6362.field535) + arg0;
        int var11 = arg6 + (arg2 << this.field6362.field535);
        int var12 = this.field6362.method273(var10, var11);
        if ((arg0 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class439 var13 = this.field6350.method2485(89, var8);
            if (var13 != null) {
                this.method2644(((class135) var13).field2075, 0);
                return;
            }
        }
        short var14 = (short) (this.field6360++);
        if (var8 != -1L) {
            this.field6350.method2486(-99, new class135(var14), var8);
        }
        if (arg4 != 13426) {
            return;
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg6 == 0) {
            var15 = this.field6352[arg5][arg1];
            var16 = this.field6365[arg5][arg1];
            var17 = this.field6355[arg5][arg1];
        } else if (this.field6362.field534 == arg0 && arg6 == 0) {
            var17 = this.field6355[arg5 + 1][arg1];
            var15 = this.field6352[arg5 + 1][arg1];
            var16 = this.field6365[arg5 + 1][arg1];
        } else if (this.field6362.field534 == arg0 && this.field6362.field534 == arg6) {
            var17 = this.field6355[arg5 + 1][arg1 + 1];
            var16 = this.field6365[arg5 + 1][arg1 + 1];
            var15 = this.field6352[arg5 + 1][arg1 + 1];
        } else if (arg0 == 0 && this.field6362.field534 == arg6) {
            var16 = this.field6365[arg5][arg1 + 1];
            var17 = this.field6355[arg5][arg1 + 1];
            var15 = this.field6352[arg5][arg1 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field6362.field534;
            float var19 = (float) arg6 / (float) this.field6362.field534;
            float var20 = this.field6355[arg5][arg1];
            float var21 = this.field6365[arg5][arg1];
            float var22 = this.field6352[arg5][arg1];
            float var23 = this.field6355[arg5 + 1][arg1];
            float var24 = this.field6365[arg5 + 1][arg1];
            float var25 = (this.field6365[arg5][arg1 + 1] - var21) * var18 + var21;
            float var26 = (this.field6365[arg5 + 1][arg1 + 1] - var24) * var18 + var24;
            float var27 = (this.field6355[arg5][arg1 + 1] - var20) * var18 + var20;
            float var28 = this.field6352[arg5 + 1][arg1];
            float var29 = (this.field6355[arg5 + 1][arg1 + 1] - var23) * var18 + var23;
            float var30 = (this.field6352[arg5][arg1 + 1] - var22) * var18 + var22;
            var16 = (var26 - var25) * var19 + var25;
            float var31 = (this.field6352[arg5 + 1][arg1 + 1] - var28) * var18 + var28;
            var17 = (var29 - var27) * var19 + var27;
            var15 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field6353.method966(100) - var10);
        float var33 = (float) (this.field6353.method969((byte) -24) - var12);
        float var34 = (float) (this.field6353.method965(false) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field6353.method964((byte) -107);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var39 + var16 * var37 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field6353.method968(false);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field6351.field4850) {
            this.field6359.method2421(arg4 ^ 0x50CB, (float) var10);
            this.field6359.method2421(arg4 ^ 0x50CB, (float) var12);
            this.field6359.method2421(25785, (float) var11);
        } else {
            this.field6359.method2420((float) var10, (byte) 4);
            this.field6359.method2420((float) var12, (byte) 4);
            this.field6359.method2420((float) var11, (byte) 4);
        }
        this.field6359.method1923((byte) 62, var45);
        this.field6359.method1923((byte) 62, var46);
        this.field6359.method1923((byte) 62, var47);
        this.field6359.method1923((byte) 62, 255);
        this.method2644(var14, 0);
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lqg;Lpp;Ltj;[I)V")
    public class437(class321 arg0, class267 arg1, class131 arg2, int[] arg3) {
        this.field6362 = arg1;
        this.field6351 = arg0;
        this.field6353 = arg2;
        int var5 = this.field6353.method964((byte) -90) - (arg1.field534 >> 1);
        this.field6363 = this.field6353.method966(-25) - var5 >> arg1.field535;
        this.field6356 = var5 + this.field6353.method966(110) >> arg1.field535;
        this.field6348 = this.field6353.method965(false) - var5 >> arg1.field535;
        this.field6357 = var5 + this.field6353.method965(false) >> arg1.field535;
        int var6 = this.field6356 + 1 - this.field6363;
        int var7 = this.field6357 + 1 - this.field6348;
        this.field6355 = new float[var6 + 1][var7 + 1];
        this.field6365 = new float[var6 + 1][var7 + 1];
        this.field6352 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field6348 + var8;
            if (var24 > 0 && (this.field6362.field531 - 1) > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field6363 + var25;
                    if (var26 > 0 && this.field6362.field532 - 1 > var26) {
                        int var27 = arg1.method271(var26 + 1, var24) - arg1.method271(var26 - 1, var24);
                        int var28 = arg1.method271(var26, var24 + 1) - arg1.method271(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + (var28 * var28) + 65536)));
                        this.field6355[var25][var8] = (float) var27 * var29;
                        this.field6365[var25][var8] = var29 * -256.0F;
                        this.field6352[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field6348; var11 <= this.field6357; var11++) {
            if (var11 >= 0 && var11 < arg1.field531) {
                for (int var21 = this.field6363; var21 <= this.field6356; var21++) {
                    if (var21 >= 0 && arg1.field532 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field3853[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field6356 - this.field6363;
            }
        }
        if (var9 > 0) {
            this.field6346 = new class303(var9 * 2);
            this.field6359 = new class382(var9 * 16);
            this.field6350 = new class398(class159.method1146(false, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field6348; var14 <= this.field6357; var14++) {
                if (var14 >= 0 && arg1.field531 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field6363; var16 <= this.field6356; var16++) {
                        if (var16 >= 0 && var16 < arg1.field532) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field3853[var16][var14];
                            int[] var19 = arg1.field3872[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method2645(var18[var20], var12, var14, var16, 13426, var15, var19[var20]);
                                    }
                                } else if (var17 == 3) {
                                    this.method2645(0, var12, var14, var16, 13426, var15, 0);
                                    this.method2645(arg1.field534, var12, var14, var16, 13426, var15, 0);
                                    this.method2645(0, var12, var14, var16, 13426, var15, arg1.field534);
                                } else if (var17 == 2) {
                                    this.method2645(arg1.field534, var12, var14, var16, 13426, var15, 0);
                                    this.method2645(arg1.field534, var12, var14, var16, 13426, var15, arg1.field534);
                                    this.method2645(0, var12, var14, var16, 13426, var15, 0);
                                } else if (var17 == 5) {
                                    this.method2645(arg1.field534, var12, var14, var16, 13426, var15, arg1.field534);
                                    this.method2645(0, var12, var14, var16, 13426, var15, arg1.field534);
                                    this.method2645(arg1.field534, var12, var14, var16, 13426, var15, 0);
                                } else if (var17 == 4) {
                                    this.method2645(0, var12, var14, var16, 13426, var15, arg1.field534);
                                    this.method2645(0, var12, var14, var16, 13426, var15, 0);
                                    this.method2645(arg1.field534, var12, var14, var16, 13426, var15, arg1.field534);
                                }
                            }
                        }
                        var15++;
                        var13++;
                    }
                } else {
                    var13 += this.field6356 - this.field6363;
                }
                var12++;
            }
            this.field6358 = this.field6351.method2012(5123, this.field6346.field4333, false, (byte) 127, this.field6346.field4326);
            this.field6343 = this.field6351.method2013((byte) -58, this.field6359.field4326, false, 16, this.field6359.field4333);
            this.field6366 = new class202(this.field6343, 5126, 3, 0);
            this.field6364 = new class202(this.field6343, 5121, 4, 12);
        } else {
            this.field6358 = null;
            this.field6364 = null;
            this.field6366 = null;
            this.field6343 = null;
        }
        this.field6359 = null;
        this.field6346 = null;
        this.field6355 = this.field6365 = this.field6352 = null;
        this.field6350 = null;
    }
}
