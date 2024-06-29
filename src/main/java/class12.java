import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class12 extends class182 {

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    private int field377 = 6;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static volatile int field376 = 0;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "[I")
    public static int[] field379 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field372 = 0;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "[I")
    public static int[] field371;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "[I")
    public static int[] field381;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "[[B")
    public static byte[][] field375;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I", line = 4)
    public final int[][] method122(int arg0, int arg1) {
        field373++;
        if (arg1 != 4944) {
            field379 = (int[]) null;
        }
        int[][] var3 = this.field3152.method1953(arg0, arg1 - 4822);
        if (this.field3152.field4493) {
            int[][] var4 = this.method1291(arg0, (byte) 69, 0);
            int[][] var5 = this.method1291(arg0, (byte) 97, 1);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var5[0];
            int[] var12 = var4[2];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field377;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class26.field672; var16++) {
                    var7[var16] = var9[var16] + var11[var16];
                    var6[var16] = var10[var16] + var14[var16];
                    var8[var16] = var12[var16] + var13[var16];
                }
            } else if (var15 == 2) {
                for (int var63 = 0; var63 < class26.field672; var63++) {
                    var7[var63] = var9[var63] - var11[var63];
                    var6[var63] = var10[var63] - var14[var63];
                    var8[var63] = var12[var63] - var13[var63];
                }
            } else if (var15 == 3) {
                for (int var62 = 0; var62 < class26.field672; var62++) {
                    var7[var62] = var9[var62] * var11[var62] >> 12;
                    var6[var62] = var10[var62] * var14[var62] >> 12;
                    var8[var62] = var12[var62] * var13[var62] >> 12;
                }
            } else if (var15 == 4) {
                for (int var17 = 0; var17 < class26.field672; var17++) {
                    int var18 = var11[var17];
                    int var19 = var13[var17];
                    int var20 = var14[var17];
                    var7[var17] = var18 == 0 ? 4096 : (var9[var17] << 12) / var18;
                    var6[var17] = var20 == 0 ? 4096 : (var10[var17] << 12) / var20;
                    var8[var17] = var19 == 0 ? 4096 : (var12[var17] << 12) / var19;
                }
            } else if (var15 == 5) {
                for (int var21 = 0; var21 < class26.field672; var21++) {
                    var7[var21] = 4096 - ((4096 - var9[var21]) * (4096 - var11[var21]) >> 12);
                    var6[var21] = 4096 - ((4096 - var10[var21]) * (4096 - var14[var21]) >> 12);
                    var8[var21] = 4096 - ((4096 - var12[var21]) * (4096 - var13[var21]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var22 = 0; var22 < class26.field672; var22++) {
                    int var23 = var14[var22];
                    int var24 = var13[var22];
                    int var25 = var11[var22];
                    var7[var22] = var25 < 2048 ? var9[var22] * var25 >> 11 : 4096 - ((4096 - var9[var22]) * (4096 - var25) >> 11);
                    var6[var22] = var23 < 2048 ? var10[var22] * var23 >> 11 : 4096 - ((4096 - var10[var22]) * (4096 - var23) >> 11);
                    var8[var22] = var24 >= 2048 ? 4096 - ((4096 - var24) * (4096 - var12[var22]) >> 11) : var12[var22] * var24 >> 11;
                }
            } else if (var15 == 7) {
                for (int var26 = 0; var26 < class26.field672; var26++) {
                    int var27 = var12[var26];
                    int var28 = var9[var26];
                    int var29 = var10[var26];
                    var7[var26] = var28 == 4096 ? 4096 : (var11[var26] << 12) / (4096 - var28);
                    var6[var26] = var29 == 4096 ? 4096 : (var14[var26] << 12) / (4096 - var29);
                    var8[var26] = var27 == 4096 ? 4096 : (var13[var26] << 12) / (4096 - var27);
                }
            } else if (var15 == 8) {
                for (int var30 = 0; var30 < class26.field672; var30++) {
                    int var31 = var12[var30];
                    int var32 = var9[var30];
                    int var33 = var10[var30];
                    var7[var30] = var32 == 0 ? 0 : 4096 - ((4096 - var11[var30] << 12) / var32);
                    var6[var30] = var33 == 0 ? 0 : 4096 - ((4096 - var14[var30] << 12) / var33);
                    var8[var30] = var31 == 0 ? 0 : 4096 - ((4096 - var13[var30] << 12) / var31);
                }
            } else if (var15 == 9) {
                for (int var34 = 0; var34 < class26.field672; var34++) {
                    int var35 = var14[var34];
                    int var36 = var12[var34];
                    int var37 = var9[var34];
                    int var38 = var13[var34];
                    int var39 = var10[var34];
                    int var40 = var11[var34];
                    var7[var34] = var40 <= var37 ? var40 : var37;
                    var6[var34] = var39 < var35 ? var39 : var35;
                    var8[var34] = var36 < var38 ? var36 : var38;
                }
            } else if (var15 == 10) {
                for (int var55 = 0; var55 < class26.field672; var55++) {
                    int var56 = var9[var55];
                    int var57 = var11[var55];
                    int var58 = var10[var55];
                    int var59 = var12[var55];
                    int var60 = var13[var55];
                    int var61 = var14[var55];
                    var7[var55] = var56 <= var57 ? var57 : var56;
                    var6[var55] = var58 > var61 ? var58 : var61;
                    var8[var55] = var60 >= var59 ? var60 : var59;
                }
            } else if (var15 == 11) {
                for (int var41 = 0; var41 < class26.field672; var41++) {
                    int var42 = var10[var41];
                    int var43 = var11[var41];
                    int var44 = var13[var41];
                    int var45 = var12[var41];
                    int var46 = var14[var41];
                    int var47 = var9[var41];
                    var7[var41] = var47 <= var43 ? var43 - var47 : var47 - var43;
                    var6[var41] = var42 <= var46 ? var46 - var42 : -var46 + var42;
                    var8[var41] = var45 > var44 ? var45 - var44 : -var45 + var44;
                }
            } else if (var15 == 12) {
                for (int var48 = 0; var48 < class26.field672; var48++) {
                    int var49 = var11[var48];
                    int var50 = var12[var48];
                    int var51 = var9[var48];
                    int var52 = var10[var48];
                    int var53 = var13[var48];
                    int var54 = var14[var48];
                    var7[var48] = var49 + var51 - (var49 * var51 >> 11);
                    var6[var48] = var54 + var52 - (var52 * var54 >> 11);
                    var8[var48] = var50 + var53 - (var50 * var53 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIIBI)Lun;", line = 318)
    public static final class17 method123(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 107) {
            method123(-102, -25, -120, (byte) -76, 27);
        }
        field370++;
        long var5 = (long) arg2 & 0xFFFFL | ((long) arg4 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL << 48 | ((long) arg1 & 0xFFFFL) << 32;
        class17 var7 = (class17) class125.field2200.method893(var5, arg3 ^ 0x29);
        if (var7 != null) {
            return var7;
        }
        class362 var8 = class178.method1260(false, arg2);
        class230[] var9 = null;
        if (var8.field5735 != null) {
            var9 = new class230[var8.field5735.length];
            for (int var10 = 0; var10 < var9.length; var10++) {
                class125 var11 = class340.method2409(15, var8.field5735[var10]);
                var9[var10] = new class230(var11.field2194, var11.field2190, var11.field2191, var11.field2189, var11.field2188, var11.field2192, var11.field2201, var11.field2195);
            }
        }
        class17 var12 = new class17(var8.field5729, var9, var8.field5734, arg0, arg1, arg4);
        class125.field2200.method888(var5, var12, 32);
        return var12;
    }

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "(I)V", line = 360)
    public static void method124(int arg0) {
        field375 = (byte[][]) null;
        field379 = null;
        if (arg0 != -402) {
            field371 = (int[]) null;
        }
        field371 = null;
        field381 = null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)[I", line = 375)
    public final int[] method125(int arg0, int arg1) {
        field380++;
        if (arg0 != 2) {
            this.method122(-60, 79);
        }
        int[] var3 = this.field3166.method775(arg1, arg0 ^ 0x7C);
        if (this.field3166.field1903) {
            int[] var4 = this.method1292(arg1, 0, -110);
            int[] var5 = this.method1292(arg1, 1, -94);
            int var6 = this.field377;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class26.field672; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var7 = 0; var7 < class26.field672; var7++) {
                    var3[var7] = var4[var7] - var5[var7];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class26.field672; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var27 = 0; var27 < class26.field672; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 == 0 ? 4096 : (var4[var27] << 12) / var28;
                }
            } else if (var6 == 5) {
                for (int var26 = 0; var26 < class26.field672; var26++) {
                    var3[var26] = 4096 - ((4096 - var4[var26]) * (4096 - var5[var26]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var8 = 0; var8 < class26.field672; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 < 2048 ? var4[var8] * var9 >> 11 : 4096 - ((4096 - var4[var8]) * (4096 - var9) >> 11);
                }
            } else if (var6 == 7) {
                for (int var24 = 0; var24 < class26.field672; var24++) {
                    int var25 = var4[var24];
                    var3[var24] = var25 == 4096 ? 4096 : (var5[var24] << 12) / (4096 - var25);
                }
            } else if (var6 == 8) {
                for (int var22 = 0; var22 < class26.field672; var22++) {
                    int var23 = var4[var22];
                    var3[var22] = var23 == 0 ? 0 : 4096 - ((4096 - var5[var22] << 12) / var23);
                }
            } else if (var6 == 9) {
                for (int var19 = 0; var19 < class26.field672; var19++) {
                    int var20 = var5[var19];
                    int var21 = var4[var19];
                    var3[var19] = var21 >= var20 ? var20 : var21;
                }
            } else if (var6 == 10) {
                for (int var16 = 0; var16 < class26.field672; var16++) {
                    int var17 = var4[var16];
                    int var18 = var5[var16];
                    var3[var16] = var18 >= var17 ? var18 : var17;
                }
            } else if (var6 == 11) {
                for (int var13 = 0; var13 < class26.field672; var13++) {
                    int var14 = var4[var13];
                    int var15 = var5[var13];
                    var3[var13] = var14 <= var15 ? var15 - var14 : var14 - var15;
                }
            } else if (var6 == 12) {
                for (int var10 = 0; var10 < class26.field672; var10++) {
                    int var11 = var5[var10];
                    int var12 = var4[var10];
                    var3[var10] = var11 + var12 - (var11 * var12 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Loe;IB)V", line = 623)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg2 != 60) {
            return;
        }
        if (arg1 == 0) {
            this.field377 = arg0.method1005((byte) 122);
        } else if (arg1 == 1) {
            this.field3154 = arg0.method1005((byte) 122) == 1;
        }
        field378++;
    }

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "(I)V", line = 667)
    public static final void method127(int arg0) {
        field369++;
        if (arg0 <= 80) {
            return;
        }
        for (int var1 = 0; var1 < class271.field4414; var1++) {
            int var10002 = class25.field649[var1]--;
            if (class25.field649[var1] >= -10) {
                class283 var2 = class222.field3672[var1];
                if (var2 == null) {
                    var2 = class283.method2011(class349.field5582, class1.field9[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class25.field649[var1] += var2.method2009();
                    class222.field3672[var1] = var2;
                }
                if (class25.field649[var1] < 0) {
                    int var9;
                    if (class22.field554[var1] == 0) {
                        var9 = class338.field5353[var1] * class8.field268 >> 8;
                    } else {
                        int var3 = (class22.field554[var1] & 0xFF3DA5) >> 16;
                        int var4 = (class22.field554[var1] & 0xFF) * 128;
                        int var5 = var3 * 128 + 64 - class96.field1750.field199;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = (class22.field554[var1] & 0xFFF4) >> 8;
                        int var7 = var6 * 128 + 64 - class96.field1750.field213;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var4) {
                            class25.field649[var1] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var4 - var8) * class30.field706 * class338.field5353[var1] / var4 >> 8;
                    }
                    if (var9 > 0) {
                        class236 var10 = var2.method2012().method1637(class8.field276);
                        class304 var11 = class304.method2173(var10, 100, var9);
                        var11.method2177(class36.field794[var1] - 1);
                        class56.field1105.method1242(var11);
                    }
                    class25.field649[var1] = -100;
                }
            } else {
                class271.field4414--;
                for (int var12 = var1; var12 < class271.field4414; var12++) {
                    class1.field9[var12] = class1.field9[var12 + 1];
                    class222.field3672[var12] = class222.field3672[var12 + 1];
                    class36.field794[var12] = class36.field794[var12 + 1];
                    class25.field649[var12] = class25.field649[var12 + 1];
                    class22.field554[var12] = class22.field554[var12 + 1];
                    class338.field5353[var12] = class338.field5353[var12 + 1];
                }
                var1--;
            }
        }
        if (class291.field4720 && !class191.method1318(-27525)) {
            if (class52.field1045 != 0 && class131.field2259 != -1) {
                class332.method2350(79, class131.field2259, class52.field1045, false, 0, class112.field2043);
            }
            class291.field4720 = false;
        } else if (class52.field1045 != 0 && class131.field2259 != -1 && !class191.method1318(-27525)) {
            class51.field1038.method291((byte) 50, 151);
            class51.field1038.method1045((byte) 123, class131.field2259);
            class131.field2259 = -1;
            class188.field3188++;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 800)
    public class12() {
        super(2, false);
    }
}
