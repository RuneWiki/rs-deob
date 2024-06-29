import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class167 extends class317 {

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    private int field2277 = 6;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "Z")
    public static boolean field2276 = false;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field2278 = 0;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2279 = "Loading fonts - ";

    @OriginalMember(owner = "client!df", name = "T", descriptor = "Z")
    public static boolean field2285 = false;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "Lkm;")
    public static class133 field2280;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)[I", line = 7)
    public final int[] method140(int arg0, int arg1) {
        if (arg0 != 542) {
            this.method140(-103, -15);
        }
        field2275++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -34);
        if (this.field4847.field2751) {
            int[] var4 = this.method2225((byte) 66, 0, arg1);
            int[] var5 = this.method2225((byte) 66, 1, arg1);
            int var6 = this.field2277;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class326.field4933; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var29 = 0; var29 < class326.field4933; var29++) {
                    var3[var29] = var4[var29] - var5[var29];
                }
            } else if (var6 == 3) {
                for (int var28 = 0; var28 < class326.field4933; var28++) {
                    var3[var28] = var4[var28] * var5[var28] >> 12;
                }
            } else if (var6 == 4) {
                for (int var7 = 0; var7 < class326.field4933; var7++) {
                    int var8 = var5[var7];
                    var3[var7] = var8 == 0 ? 4096 : (var4[var7] << 12) / var8;
                }
            } else if (var6 == 5) {
                for (int var9 = 0; var9 < class326.field4933; var9++) {
                    var3[var9] = 4096 - ((4096 - var4[var9]) * (4096 - var5[var9]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var26 = 0; var26 < class326.field4933; var26++) {
                    int var27 = var5[var26];
                    var3[var26] = var27 >= 2048 ? 4096 - ((4096 - var4[var26]) * (4096 - var27) >> 11) : var4[var26] * var27 >> 11;
                }
            } else if (var6 == 7) {
                for (int var24 = 0; var24 < class326.field4933; var24++) {
                    int var25 = var4[var24];
                    var3[var24] = var25 == 4096 ? 4096 : (var5[var24] << 12) / (4096 - var25);
                }
            } else if (var6 == 8) {
                for (int var10 = 0; var10 < class326.field4933; var10++) {
                    int var11 = var4[var10];
                    var3[var10] = var11 == 0 ? 0 : 4096 - ((4096 - var5[var10] << 12) / var11);
                }
            } else if (var6 == 9) {
                for (int var21 = 0; var21 < class326.field4933; var21++) {
                    int var22 = var4[var21];
                    int var23 = var5[var21];
                    var3[var21] = var23 <= var22 ? var23 : var22;
                }
            } else if (var6 == 10) {
                for (int var18 = 0; var18 < class326.field4933; var18++) {
                    int var19 = var5[var18];
                    int var20 = var4[var18];
                    var3[var18] = var20 <= var19 ? var19 : var20;
                }
            } else if (var6 == 11) {
                for (int var12 = 0; var12 < class326.field4933; var12++) {
                    int var13 = var4[var12];
                    int var14 = var5[var12];
                    var3[var12] = var13 > var14 ? var13 - var14 : var14 - var13;
                }
            } else if (var6 == 12) {
                for (int var15 = 0; var15 < class326.field4933; var15++) {
                    int var16 = var5[var15];
                    int var17 = var4[var15];
                    var3[var15] = var16 + var17 - (var16 * var17 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[[I", line = 259)
    public final int[][] method53(int arg0, int arg1) {
        int var3 = 106 % ((arg0 + 31) / 37);
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        field2283++;
        if (this.field4840.field3352) {
            int[][] var5 = this.method2227(0, 69, arg1);
            int[][] var6 = this.method2227(1, 88, arg1);
            int[] var7 = var4[2];
            int[] var8 = var4[0];
            int[] var9 = var5[0];
            int[] var10 = var4[1];
            int[] var11 = var5[2];
            int[] var12 = var5[1];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field2277;
            if (var16 == 1) {
                for (int var64 = 0; var64 < class326.field4933; var64++) {
                    var8[var64] = var9[var64] + var13[var64];
                    var10[var64] = var12[var64] + var14[var64];
                    var7[var64] = var11[var64] + var15[var64];
                }
            } else if (var16 == 2) {
                for (int var17 = 0; var17 < class326.field4933; var17++) {
                    var8[var17] = var9[var17] - var13[var17];
                    var10[var17] = var12[var17] - var14[var17];
                    var7[var17] = var11[var17] - var15[var17];
                }
            } else if (var16 == 3) {
                for (int var18 = 0; var18 < class326.field4933; var18++) {
                    var8[var18] = var9[var18] * var13[var18] >> 12;
                    var10[var18] = var12[var18] * var14[var18] >> 12;
                    var7[var18] = var11[var18] * var15[var18] >> 12;
                }
            } else if (var16 == 4) {
                for (int var60 = 0; var60 < class326.field4933; var60++) {
                    int var61 = var14[var60];
                    int var62 = var13[var60];
                    int var63 = var15[var60];
                    var8[var60] = var62 == 0 ? 4096 : (var9[var60] << 12) / var62;
                    var10[var60] = var61 == 0 ? 4096 : (var12[var60] << 12) / var61;
                    var7[var60] = var63 == 0 ? 4096 : (var11[var60] << 12) / var63;
                }
            } else if (var16 == 5) {
                for (int var19 = 0; var19 < class326.field4933; var19++) {
                    var8[var19] = 4096 - ((4096 - var9[var19]) * (4096 - var13[var19]) >> 12);
                    var10[var19] = 4096 - ((4096 - var12[var19]) * (4096 - var14[var19]) >> 12);
                    var7[var19] = 4096 - ((4096 - var11[var19]) * (4096 - var15[var19]) >> 12);
                }
            } else if (var16 == 6) {
                for (int var20 = 0; var20 < class326.field4933; var20++) {
                    int var21 = var15[var20];
                    int var22 = var14[var20];
                    int var23 = var13[var20];
                    var8[var20] = var23 >= 2048 ? 4096 - ((4096 - var9[var20]) * (4096 - var23) >> 11) : var9[var20] * var23 >> 11;
                    var10[var20] = var22 < 2048 ? var12[var20] * var22 >> 11 : 4096 - ((4096 - var12[var20]) * (4096 - var22) >> 11);
                    var7[var20] = var21 >= 2048 ? 4096 - ((4096 - var11[var20]) * (4096 - var21) >> 11) : var11[var20] * var21 >> 11;
                }
            } else if (var16 == 7) {
                for (int var56 = 0; var56 < class326.field4933; var56++) {
                    int var57 = var12[var56];
                    int var58 = var11[var56];
                    int var59 = var9[var56];
                    var8[var56] = var59 == 4096 ? 4096 : (var13[var56] << 12) / (4096 - var59);
                    var10[var56] = var57 == 4096 ? 4096 : (var14[var56] << 12) / (4096 - var57);
                    var7[var56] = var58 == 4096 ? 4096 : (var15[var56] << 12) / (4096 - var58);
                }
            } else if (var16 == 8) {
                for (int var52 = 0; var52 < class326.field4933; var52++) {
                    int var53 = var12[var52];
                    int var54 = var11[var52];
                    int var55 = var9[var52];
                    var8[var52] = var55 == 0 ? 0 : 4096 - ((4096 - var13[var52] << 12) / var55);
                    var10[var52] = var53 == 0 ? 0 : 4096 - ((4096 - var14[var52] << 12) / var53);
                    var7[var52] = var54 == 0 ? 0 : 4096 - ((4096 - var15[var52] << 12) / var54);
                }
            } else if (var16 == 9) {
                for (int var45 = 0; var45 < class326.field4933; var45++) {
                    int var46 = var12[var45];
                    int var47 = var11[var45];
                    int var48 = var9[var45];
                    int var49 = var14[var45];
                    int var50 = var15[var45];
                    int var51 = var13[var45];
                    var8[var45] = var48 >= var51 ? var51 : var48;
                    var10[var45] = var46 < var49 ? var46 : var49;
                    var7[var45] = var50 > var47 ? var47 : var50;
                }
            } else if (var16 == 10) {
                for (int var38 = 0; var38 < class326.field4933; var38++) {
                    int var39 = var13[var38];
                    int var40 = var9[var38];
                    int var41 = var11[var38];
                    int var42 = var15[var38];
                    int var43 = var14[var38];
                    int var44 = var12[var38];
                    var8[var38] = var39 >= var40 ? var39 : var40;
                    var10[var38] = var43 < var44 ? var44 : var43;
                    var7[var38] = var41 > var42 ? var41 : var42;
                }
            } else if (var16 == 11) {
                for (int var24 = 0; var24 < class326.field4933; var24++) {
                    int var25 = var13[var24];
                    int var26 = var11[var24];
                    int var27 = var15[var24];
                    int var28 = var14[var24];
                    int var29 = var12[var24];
                    int var30 = var9[var24];
                    var8[var24] = var25 >= var30 ? var25 - var30 : -var25 + var30;
                    var10[var24] = var29 <= var28 ? var28 - var29 : -var28 + var29;
                    var7[var24] = var26 > var27 ? var26 - var27 : -var26 + var27;
                }
            } else if (var16 == 12) {
                for (int var31 = 0; var31 < class326.field4933; var31++) {
                    int var32 = var15[var31];
                    int var33 = var13[var31];
                    int var34 = var9[var31];
                    int var35 = var11[var31];
                    int var36 = var14[var31];
                    int var37 = var12[var31];
                    var8[var31] = var33 + var34 - (var33 * var34 >> 11);
                    var10[var31] = var36 + var37 - (var36 * var37 >> 11);
                    var7[var31] = var35 + var32 - (var32 * var35 >> 11);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 572)
    public class167() {
        super(2, false);
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(B)V", line = 586)
    public static void method1185(byte arg0) {
        field2279 = null;
        int var1 = 97 % ((-arg0 - 59) / 44);
        field2280 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lcg;II)V", line = 604)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field2282++;
        int var4 = -127 / ((arg1 + 17) / 40);
        if (arg2 == 0) {
            this.field2277 = arg0.method2219(16448);
        } else if (arg2 == 1) {
            this.field4835 = arg0.method2219(16448) == 1;
        }
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)I", line = 638)
    public static final int method1186(int arg0) {
        if (arg0 != 4096) {
            field2280 = (class133) null;
        }
        field2281++;
        return class334.field5050;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILin;I)V", line = 649)
    public static final void method1187(int arg0, int arg1, class344 arg2, int arg3) {
        if (arg2.field5322 == 1) {
            class236.field3334++;
            class237.method1632((short) 14, -1, arg2.field5343, arg2.field5206, 0L, -108, "", 0);
        }
        if (arg2.field5322 == 2 && !class124.field1676) {
            String var4 = class107.method789(arg2, arg0 ^ 0x1326);
            if (var4 != null) {
                class85.field1232++;
                class237.method1632((short) 46, -1, var4, arg2.field5206, 0L, 108, "<col=00ff00>" + arg2.field5234, -1);
            }
        }
        if (arg0 != -4904) {
            method1187(117, -64, (class344) null, -59);
        }
        if (arg2.field5322 == 3) {
            class10.field104++;
            class237.method1632((short) 45, -1, class6.field49, arg2.field5206, 0L, -113, "", 0);
        }
        field2284++;
        if (arg2.field5322 == 4) {
            class237.method1632((short) 29, -1, arg2.field5343, arg2.field5206, 0L, -94, "", 0);
            class291.field4346++;
        }
        if (arg2.field5322 == 5) {
            class237.method1632((short) 10, -1, arg2.field5343, arg2.field5206, 0L, 101, "", 0);
            class320.field4874++;
        }
        if (arg2.field5322 == 6 && class187.field2591 == null) {
            class256.field3704++;
            class237.method1632((short) 50, -1, arg2.field5343, arg2.field5206, 0L, -98, "", -1);
        }
        if (arg2.field5316 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field5236; var6++) {
                for (int var7 = 0; var7 < arg2.field5305; var7++) {
                    int var8 = (arg2.field5198 + 32) * var7;
                    int var9 = (arg2.field5256 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field5235[var5];
                        var9 += arg2.field5326[var5];
                    }
                    if (arg1 >= var8 && arg3 >= var9 && arg1 < var8 + 32 && arg3 < (var9 + 32)) {
                        class222.field3189 = arg2;
                        class132.field1799 = var5;
                        if (arg2.field5278[var5] > 0) {
                            class300 var10 = client.method821(arg2);
                            class198 var11 = class115.method854((byte) -65, arg2.field5278[var5] - 1);
                            if (class1.field15 == 1 && var10.method2039((byte) -120)) {
                                if (class15.field177 != arg2.field5206 || class236.field3348 != var5) {
                                    class237.method1632((short) 36, -1, class189.field2606, arg2.field5206, (long) var11.field2810, 118, class148.field2052 + " -> <col=ff9040>" + var11.field2757, var5);
                                    class31.field376++;
                                }
                            } else if (class124.field1676 && var10.method2039((byte) -86)) {
                                class115 var12 = class273.field4091 == -1 ? null : class323.method2268(class273.field4091, (byte) -117);
                                if ((class172.field2348 & 0x10) != 0 && (var12 == null || var11.method1402(true, var12.field1567, class273.field4091) != var12.field1567)) {
                                    class223.field3211++;
                                    class237.method1632((short) 4, class128.field1753, class282.field4224, arg2.field5206, (long) var11.field2810, 97, class266.field3880 + " -> <col=ff9040>" + var11.field2757, var5);
                                }
                            } else {
                                String[] var13 = var11.field2764;
                                if (class301.field4466) {
                                    var13 = class1.method1(var13, true);
                                }
                                class282.field4216++;
                                if (var10.method2039((byte) -111)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 25;
                                            } else {
                                                var15 = 21;
                                            }
                                            class237.method1632(var15, -1, var13[var14], arg2.field5206, (long) var11.field2810, 122, "<col=ff9040>" + var11.field2757, var5);
                                            class317.field4839++;
                                        }
                                    }
                                }
                                if (var10.method2037((byte) 96)) {
                                    class237.method1632((short) 28, class166.field2269, class189.field2606, arg2.field5206, (long) var11.field2810, 79, "<col=ff9040>" + var11.field2757, var5);
                                    class153.field2115++;
                                }
                                if (var10.method2039((byte) -119) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class324.field4909++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 17;
                                            }
                                            if (var16 == 1) {
                                                var17 = 24;
                                            }
                                            if (var16 == 2) {
                                                var17 = 44;
                                            }
                                            class237.method1632(var17, -1, var13[var16], arg2.field5206, (long) var11.field2810, -99, "<col=ff9040>" + var11.field2757, var5);
                                        }
                                    }
                                }
                                String[] var18 = arg2.field5352;
                                if (class301.field4466) {
                                    var18 = class1.method1(var18, true);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            byte var20 = 0;
                                            class168.field2286++;
                                            if (var19 == 0) {
                                                var20 = 23;
                                            }
                                            if (var19 == 1) {
                                                var20 = 1;
                                            }
                                            if (var19 == 2) {
                                                var20 = 41;
                                            }
                                            if (var19 == 3) {
                                                var20 = 33;
                                            }
                                            if (var19 == 4) {
                                                var20 = 22;
                                            }
                                            class237.method1632(var20, -1, var18[var19], arg2.field5206, (long) var11.field2810, arg0 ^ 0xFFFFEC88, "<col=ff9040>" + var11.field2757, var5);
                                        }
                                    }
                                }
                                class237.method1632((short) 1003, class317.field4837, class330.field4972, arg2.field5206, (long) var11.field2810, 74, "<col=ff9040>" + var11.field2757, var5);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field5267) {
            return;
        }
        if (!class124.field1676) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class255.method1743(arg2, (byte) 104, var21);
                if (var22 != null) {
                    class226.field3244++;
                    class237.method1632((short) 1002, class116.method860(var21, -1, arg2), var22, arg2.field5206, (long) (var21 + 1), 112, arg2.field5242, arg2.field5275);
                }
            }
            String var23 = class107.method789(arg2, -2);
            if (var23 != null) {
                class237.method1632((short) 46, -1, var23, arg2.field5206, 0L, 69, arg2.field5242, arg2.field5275);
                class85.field1232++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class255.method1743(arg2, (byte) 103, var24);
                if (var25 != null) {
                    class237.method1632((short) 13, class116.method860(var24, -1, arg2), var25, arg2.field5206, (long) (var24 + 1), arg0 + 4795, arg2.field5242, arg2.field5275);
                    class226.field3244++;
                }
            }
            if (client.method821(arg2).method2032(arg0 ^ 0xFFFFECD9)) {
                class256.field3704++;
                if (arg2.field5214 == null) {
                    class237.method1632((short) 50, -1, client.field1513, arg2.field5206, 0L, 63, "", arg2.field5275);
                } else {
                    class237.method1632((short) 50, -1, arg2.field5214, arg2.field5206, 0L, arg0 + 4807, "", arg2.field5275);
                }
            }
        } else if (client.method821(arg2).method2033((byte) -77) && (class172.field2348 & 0x20) != 0) {
            class278.field4167++;
            class237.method1632((short) 31, class128.field1753, class282.field4224, arg2.field5206, 0L, 62, class266.field3880 + " -> " + arg2.field5242, arg2.field5275);
        }
    }
}
