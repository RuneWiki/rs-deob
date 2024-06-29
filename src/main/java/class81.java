import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class81 {

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "Lom;")
    private class351 field1306;

    @OriginalMember(owner = "client!cba", name = "u", descriptor = "Lum;")
    private class528 field1314;

    @OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "[B")
    public byte[] field1303;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    private int field1304;

    @OriginalMember(owner = "client!cba", name = "r", descriptor = "[Ltj;")
    public static class614[] field1311 = new class614[35];

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "Lkk;")
    public static class238 field1300 = new class238();

    @OriginalMember(owner = "client!cba", name = "t", descriptor = "[I")
    public static int[] field1313 = new int[8];

    @OriginalMember(owner = "client!cba", name = "w", descriptor = "[Lkq;")
    public static class696[] field1316 = new class696[16];

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!cba", name = "v", descriptor = "Lmv;")
    public static class295 field1315;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "Ljava/lang/Thread;")
    public static Thread field1298;

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "[[Luj;")
    private class549[][] field1305;

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "[[[I")
    public static int[][][] field1310;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
    public static void method465(int arg0) {
        field1300 = null;
        field1313 = null;
        field1316 = null;
        if (arg0 == -1) {
            field1298 = null;
            field1315 = null;
            field1310 = null;
            field1311 = null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method466(int arg0, int arg1, int arg2, class425 arg3) {
        field1301++;
        class392 var5 = (class392) arg3;
        int var6 = var5.field5928 + arg2 + 1;
        int var7 = var5.field5919 + arg0 + 1;
        int var8 = var6 + (this.field1312 * var7);
        int var9 = var5.field5922;
        int var10 = var5.field5925;
        int var11 = this.field1312 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var8 += this.field1312 * var12;
            var7 = 1;
            var9 -= var12;
        }
        if (var7 + var9 >= this.field1294) {
            int var13 = var7 + var9 + 1 - this.field1294;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var11 += var14;
            var6 = 1;
            var8 += var14;
            var10 -= var14;
        }
        if (this.field1312 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field1312;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (arg1 + var16) * this.field1312 + var11;
            return class74.method427(var16, var8, var17, var10, var9, (byte) -113, this.field1303);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
    public final void method467(byte arg0) {
        field1307++;
        if (arg0 >= -61) {
            field1313 = null;
        }
        this.field1305 = new class549[this.field1309][this.field1304];
        for (int var2 = 0; var2 < this.field1304; var2++) {
            for (int var3 = 0; var3 < this.field1309; var3++) {
                this.field1305[var3][var2] = new class549(this.field1314, this, this.field1306, var3, var2, this.field1295, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field1305[var3][var2].field8088 == 0) {
                    this.field1305[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(BI)V")
    public static final void method468(byte arg0, int arg1) {
        int var2 = -126 % ((arg1 - 50) / 43);
        if (class603.field8703 == null) {
            class603.field8703 = new byte[4][class72.field1144][class668.field9444];
        }
        field1297++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < class72.field1144; var4++) {
                for (int var5 = 0; var5 < class668.field9444; var5++) {
                    class603.field8703[var3][var4][var5] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIII)V")
    private final void method469(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1308++;
        if (this.field1305 == null) {
            return;
        }
        int var6 = arg0 + arg3 >> 7;
        int var7 = arg0 + arg4 - 2 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg2 - (1 - arg1) - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class549[] var11 = this.field1305[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field8084 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lha;III)V")
    public final void method470(class425 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -2) {
            method468((byte) -91, 46);
        }
        field1299++;
        class392 var5 = (class392) arg0;
        int var6 = var5.field5919 + arg3 + 1;
        int var7 = var5.field5928 + arg2 + 1;
        int var8 = this.field1312 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field5922;
        int var11 = var5.field5925;
        int var12 = this.field1312 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var9 += var11 * var13;
            var6 = 1;
            var8 += this.field1312 * var13;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field1294) {
            int var15 = var6 + var10 - (this.field1294 - 1);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var14 += var16;
            var11 -= var16;
            var12 += var16;
            var7 = 1;
            var8 += var16;
            var9 += var16;
        }
        if (this.field1312 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field1312;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class409.method2507(this.field1303, (byte) 88, var8, var5.field5938, var9, var11, var10, var12, var14);
            this.method469(var7, var10, var6, -1, var11);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(BIII[[ZZ)V")
    public final void method471(byte arg0, int arg1, int arg2, int arg3, boolean[][] arg4, boolean arg5) {
        this.field1314.method2994(0, false);
        field1302++;
        this.field1314.method3056(false, (byte) 120);
        this.field1314.method3068(122, 1);
        this.field1314.method3037(1, true);
        this.field1314.method3058(false, -2, (byte) -126, false);
        float var7 = 1.0F / (float) (this.field1314.field7739 * 128);
        if (arg5) {
            for (int var26 = 0; var26 < this.field1304; var26++) {
                int var28 = var26 << this.field1295;
                int var29 = var26 + 1 << this.field1295;
                label91: for (int var30 = 0; var30 < this.field1309; var30++) {
                    if (this.field1305[var30][var26] != null) {
                        int var31 = var30 << this.field1295;
                        int var32 = var30 + 1 << this.field1295;
                        for (int var33 = var31; var33 < var32; var33++) {
                            if ((var33 - arg2) >= (-arg3) && var33 - arg2 <= arg3) {
                                for (int var34 = var28; var34 < var29; var34++) {
                                    if (var34 - arg1 >= -arg3 && arg3 >= var34 - arg1 && arg4[var33 - (arg2 - arg3)][var34 - (arg1 - arg3)]) {
                                        class300 var35 = this.field1314.method3032(-30);
                                        var35.method1867(var7, 1.0F, var7, -119);
                                        var35.method893(-var30, -var26, 0);
                                        this.field1314.method3045(-110, class635.field9152);
                                        this.field1305[var30][var26].method3202(37);
                                        continue label91;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field1304; var8++) {
                int var9 = var8 << this.field1295;
                int var10 = var8 + 1 << this.field1295;
                for (int var11 = 0; var11 < this.field1309; var11++) {
                    class549 var12 = this.field1305[var11][var8];
                    if (var12 != null) {
                        class532 var13 = this.field1314.method3007(2, var12.field8088 * 3);
                        Buffer var14 = var13.method985((byte) -126, true);
                        if (var14 != null) {
                            Stream var15 = this.field1314.method3038(-10641, var14);
                            int var16 = 0;
                            int var17 = var11 << this.field1295;
                            int var18 = var11 + 1 << this.field1295;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if ((var19 - arg1) >= (-arg3) && (var19 - arg1) <= arg3) {
                                    int var21 = this.field1306.field9628 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if (-arg3 <= var22 - arg2 && var22 - arg2 <= arg3 && arg4[var22 - (arg2 - arg3)][var19 + arg3 - arg1]) {
                                            short[] var23 = this.field1306.field5213[var21];
                                            if (var23 != null) {
                                                if (Stream.method2077()) {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var15.method2083(var23[var24] & 0xFFFF);
                                                        var16++;
                                                    }
                                                } else {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var15.method2080(var23[var25] & 0xFFFF);
                                                        var16++;
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method2084();
                            if (var13.method986(true) && var16 > 0) {
                                class300 var20 = this.field1314.method3032(-30);
                                var20.method1867(var7, 1.0F, var7, -107);
                                var20.method893(-var11, -var8, 0);
                                this.field1314.method3045(-128, class635.field9152);
                                var12.method3207(var13, var16 / 3, 0);
                            }
                        }
                    }
                }
            }
        }
        int var27 = 8 / ((5 - arg0) / 34);
        this.field1314.method3003(1);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILha;IB)V")
    public final void method472(int arg0, class425 arg1, int arg2, byte arg3) {
        field1296++;
        class392 var5 = (class392) arg1;
        int var6 = var5.field5928 + arg0 + 1;
        int var7 = var5.field5919 + arg2 + 1;
        int var8 = this.field1312 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field5922;
        int var11 = var5.field5925;
        int var12 = this.field1312 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += this.field1312 * var14;
            var9 += var11 * var14;
            var7 = 1;
            var10 -= var14;
        }
        if (this.field1294 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field1294;
            var10 -= var15;
        }
        if (arg3 != -109) {
            this.field1303 = null;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var11 -= var16;
            var13 += var16;
            var6 = 1;
            var9 += var16;
            var8 += var16;
        }
        if (this.field1312 <= var6 + var11) {
            int var17 = var6 + var11 - (-1 - -this.field1312);
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class700.method3931(var8, var5.field5938, this.field1303, var9, var10, arg3 + 109, var12, var13, var11);
            this.method469(var6, var10, var7, -1, var11);
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lum;Lom;)V")
    public class81(class528 arg0, class351 arg1) {
        this.field1306 = arg1;
        this.field1314 = arg0;
        this.field1312 = (this.field1306.field9629 * this.field1306.field9628 >> this.field1314.field7767) + 2;
        this.field1294 = (this.field1306.field9630 * this.field1306.field9629 >> this.field1314.field7767) + 2;
        this.field1295 = this.field1314.field7767 + 7 - this.field1306.field9623;
        this.field1303 = new byte[this.field1312 * this.field1294];
        this.field1309 = this.field1306.field9628 >> this.field1295;
        this.field1304 = this.field1306.field9630 >> this.field1295;
    }
}
