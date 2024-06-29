import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class481 {

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "Len;")
    private class478 field6397;

    @OriginalMember(owner = "client!tea", name = "s", descriptor = "Ldaa;")
    private class260 field6407;

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
    public int field6399;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    private int field6389;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "[B")
    public byte[] field6390;

    @OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
    private int field6402;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    private int field6393;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    private int field6392;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "[B")
    public static byte[] field6395 = new byte[2048];

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!tea", name = "o", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!tea", name = "p", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!tea", name = "r", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "[[Lln;")
    private class97[][] field6391;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V", line = 4)
    public final void method2616(int arg0) {
        field6396++;
        if (arg0 != 128) {
            this.method2617(true, -112, null, 4);
        }
        this.field6391 = new class97[this.field6393][this.field6392];
        for (int var2 = 0; var2 < this.field6392; var2++) {
            for (int var3 = 0; var3 < this.field6393; var3++) {
                this.field6391[var3][var2] = new class97(this.field6397, this, this.field6407, var3, var2, this.field6402, var3 * 128 + 1, var2 * 128 - -1);
                if (this.field6391[var3][var2].field1327 == 0) {
                    this.field6391[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZILha;I)V", line = 37)
    public final void method2617(boolean arg0, int arg1, class119 arg2, int arg3) {
        field6403++;
        class100 var5 = (class100) arg2;
        if (arg0) {
            field6395 = null;
        }
        int var6 = var5.field1352 + arg3 + 1;
        int var7 = var5.field1349 + arg1 + 1;
        int var8 = var7 + (this.field6399 * var6);
        int var9 = 0;
        int var10 = var5.field1360;
        int var11 = var5.field1347;
        int var12 = this.field6399 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field6399 * var13;
            var6 = 1;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field6389) {
            int var15 = var6 + var10 + 1 - this.field6389;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var14 += var16;
            var8 += var16;
            var12 += var16;
            var7 = 1;
            var9 += var16;
            var11 -= var16;
        }
        if (var7 + var11 >= this.field6399) {
            int var17 = var7 + var11 + 1 - this.field6399;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class676.method3790(var5.field1351, var9, var14, var11, var8, (byte) -82, var10, var12, this.field6390);
            this.method2619(-117, var11, var6, var10, var7);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V", line = 109)
    public static void method2618(boolean arg0) {
        field6395 = null;
        if (arg0) {
            field6404 = 70;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIII)V", line = 132)
    private final void method2619(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6406++;
        if (this.field6391 == null) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg4 + arg1 - 1 - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg2 - (1 - arg3) - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class97[] var11 = this.field6391[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field1328 = true;
                }
            }
        }
        if (arg0 >= -87) {
            method2622(-32, null, true);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lha;BII)Z", line = 174)
    public final boolean method2620(class119 arg0, byte arg1, int arg2, int arg3) {
        field6401++;
        class100 var5 = (class100) arg0;
        int var6 = var5.field1352 + arg2 + 1;
        int var7 = var5.field1349 + arg3 + 1;
        int var8 = this.field6399 * var6 + var7;
        if (arg1 != -85) {
            this.field6389 = -97;
        }
        int var9 = var5.field1360;
        int var10 = var5.field1347;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var6 = 1;
            var8 += this.field6399 * var11;
            var9 -= var11;
        }
        int var12 = this.field6399 - var10;
        if ((var6 + var9) >= this.field6389) {
            int var13 = var6 + var9 + 1 - this.field6389;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var12 += var14;
            var10 -= var14;
            var8 += var14;
        }
        if (this.field6399 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field6399;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field6399 + var12;
            return class344.method1919(var17, var9, this.field6390, var10, var16, (byte) -69, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(Lha;BII)V", line = 247)
    public final void method2621(class119 arg0, byte arg1, int arg2, int arg3) {
        field6394++;
        class100 var5 = (class100) arg0;
        int var6 = var5.field1352 + arg2 + 1;
        int var7 = var5.field1349 + arg3 + 1;
        int var8 = var7 + (this.field6399 * var6);
        int var9 = 0;
        if (arg1 >= -48) {
            return;
        }
        int var10 = var5.field1360;
        int var11 = var5.field1347;
        int var12 = this.field6399 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var9 += var11 * var13;
            var8 += this.field6399 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field6389 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field6389;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var7 = 1;
            var11 -= var16;
            var12 += var16;
            var14 += var16;
            var8 += var16;
        }
        if (this.field6399 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field6399;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class651.method3654(var11, var10, var9, var12, var8, var5.field1351, var14, this.field6390, (byte) -113);
            this.method2619(-98, var11, var6, var10, var7);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I[BZ)V", line = 324)
    public static final void method2622(int arg0, byte[] arg1, boolean arg2) {
        if (class49.field701 == null) {
            class49.field701 = new class630(20000);
        }
        if (arg0 != 13736) {
            field6400 = -54;
        }
        field6398++;
        class49.field701.method3475(65536, arg1.length, 0, arg1);
        if (!arg2) {
            return;
        }
        class392.method2102(class49.field701.field8804, -2);
        class68.field930 = new class532[class581.field8127];
        int var3 = 0;
        for (int var4 = class557.field7741; var4 <= class268.field3386; var4++) {
            class532 var5 = class537.method2915(var4, true);
            if (var5 != null) {
                class68.field930[var3++] = var5;
            }
        }
        class68.field933 = false;
        class374.field4710 = class571.method3150(arg0 ^ 0x35CC);
        class49.field701 = null;
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Len;Ldaa;)V", line = 366)
    public class481(class478 arg0, class260 arg1) {
        this.field6397 = arg0;
        this.field6407 = arg1;
        this.field6399 = (this.field6407.field3441 * this.field6407.field3432 >> this.field6397.field6241) + 2;
        this.field6389 = (this.field6407.field3440 * this.field6407.field3432 >> this.field6397.field6241) + 2;
        this.field6390 = new byte[this.field6399 * this.field6389];
        this.field6402 = this.field6397.field6241 + 7 - this.field6407.field3437;
        this.field6393 = this.field6407.field3441 >> this.field6402;
        this.field6392 = this.field6407.field3440 >> this.field6402;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZIII[[ZZ)V", line = 381)
    public final void method2623(boolean arg0, int arg1, int arg2, int arg3, boolean[][] arg4, boolean arg5) {
        this.field6397.method2535(false, 68);
        field6405++;
        this.field6397.method2594(false, (byte) -25);
        this.field6397.method2553((byte) 28, 1);
        this.field6397.method2595(1, 0);
        this.field6397.method2526(0, -2, false, arg5);
        float var7 = 1.0F / (float) (this.field6397.field6311 * 128);
        if (arg0) {
            for (int var8 = 0; var8 < this.field6392; var8++) {
                int var9 = var8 << this.field6402;
                int var10 = var8 + 1 << this.field6402;
                label142: for (int var11 = 0; var11 < this.field6393; var11++) {
                    if (this.field6391[var11][var8] != null) {
                        int var12 = var11 << this.field6402;
                        int var13 = var11 + 1 << this.field6402;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (var14 - arg2 >= -arg1 && arg1 >= (var14 - arg2)) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if (var15 - arg3 >= -arg1 && var15 - arg3 <= arg1 && arg4[var14 + arg1 - arg2][var15 + arg1 - arg3]) {
                                        class691 var16 = this.field6397.method2562(108);
                                        var16.method3893(var7, 18543, var7, 1.0F);
                                        var16.method903(-var11, -var8, 0);
                                        this.field6397.method2524(126, class587.field8253);
                                        this.field6391[var11][var8].method558(-102);
                                        continue label142;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field6392; var17++) {
                int var18 = var17 << this.field6402;
                int var19 = var17 + 1 << this.field6402;
                for (int var20 = 0; var20 < this.field6393; var20++) {
                    class97 var21 = this.field6391[var20][var17];
                    if (var21 != null) {
                        class666 var22 = this.field6397.method2548(-115, var21.field1327 * 3);
                        Buffer var23 = var22.method1486((byte) -88, true);
                        if (var23 != null) {
                            Stream var24 = this.field6397.method2573(var23, 119);
                            int var25 = 0;
                            int var26 = var20 << this.field6402;
                            int var27 = var20 + 1 << this.field6402;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (-arg1 <= var28 - arg3 && (var28 - arg3) <= arg1) {
                                    int var30 = this.field6407.field3441 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((var31 - arg2) >= (-arg1) && (var31 - arg2) <= arg1 && arg4[arg1 + var31 - arg2][arg1 + var28 - arg3]) {
                                            short[] var32 = this.field6407.field3201[var30];
                                            if (var32 != null) {
                                                if (Stream.method3420()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var24.method3422(var32[var34] & 0xFFFF);
                                                        var25++;
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var25++;
                                                        var24.method3430(var32[var33] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method3424();
                            if (var22.method1485((byte) 46) && var25 > 0) {
                                class691 var29 = this.field6397.method2562(94);
                                var29.method3893(var7, 18543, var7, 1.0F);
                                var29.method903(-var20, -var17, 0);
                                this.field6397.method2524(106, class587.field8253);
                                var21.method557(86, var25 / 3, var22);
                            }
                        }
                    }
                }
            }
        }
        this.field6397.method2554((byte) -70);
    }
}
