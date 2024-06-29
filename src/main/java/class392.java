import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class392 {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Lrd;")
    private class574 field5164;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "Lgd;")
    private class696 field5177;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public int field5167;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    private int field5179;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "[B")
    public byte[] field5165;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    private int field5175;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    private int field5174;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    private int field5170;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "[I")
    public static int[] field5162 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "[[I")
    public static int[][] field5173 = new int[6][];

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    public static int field5178 = -50;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "[[Ltaa;")
    private class488[][] field5176;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BIILr;)V")
    public final void method2271(byte arg0, int arg1, int arg2, class736 arg3) {
        field5163++;
        class703 var5 = (class703) arg3;
        int var6 = var5.field9307 + arg2 + 1;
        int var7 = var5.field9305 + arg1 + 1;
        int var8 = this.field5167 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field9299;
        int var11 = var5.field9306;
        int var12 = this.field5167 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var6 = 1;
            var8 += this.field5167 * var14;
            var10 -= var14;
        }
        if (var6 + var10 >= this.field5179) {
            int var15 = var6 + var10 + 1 - this.field5179;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var13 += var16;
            var7 = 1;
            var12 += var16;
            var9 += var16;
            var8 += var16;
        }
        if (arg0 != 93) {
            return;
        }
        if (var7 + var11 >= this.field5167) {
            int var17 = var7 - this.field5167 - (-var11 - 1);
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class29.method121(var5.field9296, false, var13, var10, this.field5165, var11, var9, var12, var8);
            this.method2277(var11, 103, var10, var7, var6);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILr;II)Z")
    public final boolean method2272(int arg0, class736 arg1, int arg2, int arg3) {
        field5168++;
        class703 var5 = (class703) arg1;
        int var6 = var5.field9307 + arg0 + 1;
        int var7 = var5.field9305 + arg2 + 1;
        int var8 = var7 + (this.field5167 * var6);
        int var9 = var5.field9299;
        int var10 = var5.field9306;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var6 = 1;
            var9 -= var11;
            var8 += this.field5167 * var11;
        }
        int var12 = this.field5167 - var10;
        if (var6 + var9 >= this.field5179) {
            int var13 = var6 + var9 + 1 - this.field5179;
            var9 -= var13;
        }
        if (arg3 >= var7) {
            int var14 = 1 - var7;
            var10 -= var14;
            var7 = 1;
            var12 += var14;
            var8 += var14;
        }
        if (var7 + var10 >= this.field5167) {
            int var15 = var10 + var7 + 1 - this.field5167;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field5167 + var12;
            return class607.method3259(var10, var17, this.field5165, (byte) -114, var16, var9, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public final void method2273(int arg0) {
        if (arg0 != 128) {
            this.method2277(-126, -108, 82, 71, -21);
        }
        field5166++;
        this.field5176 = new class488[this.field5174][this.field5170];
        for (int var2 = 0; var2 < this.field5170; var2++) {
            for (int var3 = 0; var3 < this.field5174; var3++) {
                this.field5176[var3][var2] = new class488(this.field5177, this, this.field5164, var3, var2, this.field5175, var3 * 128 + 1, var2 * 128 - -1);
                if (this.field5176[var3][var2].field6290 == 0) {
                    this.field5176[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
    public static void method2274(byte arg0) {
        field5173 = null;
        field5162 = null;
        if (arg0 >= -6) {
            method2274((byte) 115);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "([[ZZIBII)V")
    public final void method2275(boolean[][] arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var7 = 71 % ((arg3 + 23) / 38);
        field5169++;
        this.field5177.method3720(73, false);
        this.field5177.method3766((byte) -92, false);
        this.field5177.method3750(false, 1);
        this.field5177.method3740(1, 106);
        this.field5177.method3767(false, -2, false, (byte) 86);
        float var8 = 1.0F / (float) (this.field5177.field9139 * 128);
        if (arg1) {
            for (int var9 = 0; var9 < this.field5170; var9++) {
                int var10 = var9 << this.field5175;
                int var11 = var9 + 1 << this.field5175;
                label142: for (int var12 = 0; var12 < this.field5174; var12++) {
                    if (this.field5176[var12][var9] != null) {
                        int var13 = var12 << this.field5175;
                        int var14 = var12 + 1 << this.field5175;
                        for (int var15 = var13; var15 < var14; var15++) {
                            if (var15 - arg2 >= -arg5 && var15 - arg2 <= arg5) {
                                for (int var16 = var10; var16 < var11; var16++) {
                                    if ((-arg5) <= (var16 - arg4) && (var16 - arg4) <= arg5 && arg0[var15 + arg5 - arg2][arg5 + var16 - arg4]) {
                                        class588 var17 = this.field5177.method3763(1);
                                        var17.method3158(11663, var8, 1.0F, var8);
                                        var17.method450(-var12, -var9, 0);
                                        this.field5177.method3744(117, class627.field7959);
                                        this.field5176[var12][var9].method2727(-112);
                                        continue label142;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var18 = 0; var18 < this.field5170; var18++) {
                int var19 = var18 << this.field5175;
                int var20 = var18 + 1 << this.field5175;
                for (int var21 = 0; var21 < this.field5174; var21++) {
                    class488 var22 = this.field5176[var21][var18];
                    if (var22 != null) {
                        class688 var23 = this.field5177.method3735((byte) -5, var22.field6290 * 3);
                        Buffer var24 = var23.method2014(true, true);
                        if (var24 != null) {
                            Stream var25 = this.field5177.method3773(var24, (byte) -82);
                            int var26 = 0;
                            int var27 = var21 << this.field5175;
                            int var28 = var21 + 1 << this.field5175;
                            for (int var29 = var19; var29 < var20; var29++) {
                                if ((var29 - arg4) >= (-arg5) && arg5 >= (var29 - arg4)) {
                                    int var31 = this.field5164.field4366 * var29 + var27;
                                    for (int var32 = var27; var32 < var28; var32++) {
                                        if ((var32 - arg2) >= (-arg5) && (var32 - arg2) <= arg5 && arg0[var32 + arg5 - arg2][arg5 + var29 - arg4]) {
                                            short[] var33 = this.field5164.field7288[var31];
                                            if (var33 != null) {
                                                if (Stream.method2528()) {
                                                    for (int var35 = 0; var35 < var33.length; var35++) {
                                                        var26++;
                                                        var25.method2525(var33[var35] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var34 = 0; var34 < var33.length; var34++) {
                                                        var26++;
                                                        var25.method2516(var33[var34] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var31++;
                                    }
                                }
                            }
                            var25.method2519();
                            if (var23.method2017(28359) && var26 > 0) {
                                class588 var30 = this.field5177.method3763(1);
                                var30.method3158(11663, var8, 1.0F, var8);
                                var30.method450(-var21, -var18, 0);
                                this.field5177.method3744(82, class627.field7959);
                                var22.method2734(var23, -95, var26 / 3);
                            }
                        }
                    }
                }
            }
        }
        this.field5177.method3754(false);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILr;I)V")
    public final void method2276(int arg0, int arg1, class736 arg2, int arg3) {
        field5180++;
        class703 var5 = (class703) arg2;
        int var6 = var5.field9305 + arg0 + 1;
        int var7 = var5.field9307 + arg1 + 1;
        int var8 = var6 + (this.field5167 * var7);
        int var9 = 0;
        int var10 = var5.field9299;
        if (arg3 != -6761) {
            this.field5179 = 127;
        }
        int var11 = var5.field9306;
        int var12 = this.field5167 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field5167 * var13;
            var7 = 1;
            var10 -= var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (this.field5179 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field5179;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var9 += var16;
            var12 += var16;
            var11 -= var16;
            var14 += var16;
            var8 += var16;
        }
        if (this.field5167 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field5167;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class564.method3053(var14, var12, arg3 ^ 0xFFFFDAA1, var10, var11, this.field5165, var9, var5.field9296, var8);
            this.method2277(var11, -16, var10, var6, var7);
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lgd;Lrd;)V")
    public class392(class696 arg0, class574 arg1) {
        this.field5164 = arg1;
        this.field5177 = arg0;
        this.field5167 = (this.field5164.field4369 * this.field5164.field4366 >> this.field5177.field9201) + 2;
        this.field5179 = (this.field5164.field4371 * this.field5164.field4369 >> this.field5177.field9201) + 2;
        this.field5165 = new byte[this.field5179 * this.field5167];
        this.field5175 = this.field5177.field9201 + 7 - this.field5164.field4372;
        this.field5174 = this.field5164.field4366 >> this.field5175;
        this.field5170 = this.field5164.field4371 >> this.field5175;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIII)V")
    private final void method2277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5171++;
        if (this.field5176 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg3 - (1 - arg0) - 1 >> 7;
        int var8 = arg4 - 1 >> 7;
        int var9 = -88 / ((27 - arg1) / 36);
        int var10 = arg2 + arg4 - 1 - 1 >> 7;
        for (int var11 = var6; var11 <= var7; var11++) {
            class488[] var12 = this.field5176[var11];
            for (int var13 = var8; var13 <= var10; var13++) {
                if (var12[var13] != null) {
                    var12[var13].field6292 = true;
                }
            }
        }
    }
}
