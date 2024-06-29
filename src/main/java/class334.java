import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class334 extends class86 {

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    private int field5110 = 4;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    private int field5112 = 4;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "Z")
    public static boolean field5111 = false;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "[Lqi;")
    public static class246[] field5114;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "[[Lrg;")
    public static class342[][] field5108;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method2350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5107++;
        if (class78.field1136 == 0) {
            int var7 = class66.field997;
            int var8 = class173.field2752;
            int var9 = class79.field1162;
            int var10 = (arg6 - arg2) * (var8 - var7) / arg3 + var7;
            int var11 = class171.field2695;
            int var12 = (arg1 - arg0) * (var11 - var9) / arg4 + var9;
            if (class210.field3237 && (class209.field3214 & 0x40) != 0) {
                class342 var13 = class320.method2259(class270.field4155, class259.field3969, 0);
                if (var13 == null) {
                    class326.method2306((byte) 126);
                } else {
                    class268.method1963((short) 32, " ->", var12, class281.field4355, class202.field3130, 0L, -25900, var10);
                }
            } else {
                if (class165.field2629 == 1) {
                    class268.method1963((short) 33, "", var12, -1, class79.field1146, 0L, -25900, var10);
                }
                class268.method1963((short) 49, "", var12, -1, class204.field3157, 0L, -25900, var10);
                class203.field3140++;
            }
        }
        long var14 = -1L;
        if (arg5 <= 27) {
            return;
        }
        for (int var16 = 0; var16 < class74.field1096; var16++) {
            long var17 = class238.field3694[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3FBB) >> 7;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class171.method1351(class119.field1826, var19, var20, var17)) {
                    class212 var23 = class43.method437(122, var22);
                    if (var23.field3289 != null) {
                        var23 = var23.method1568((byte) 110);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class78.field1136 == 1) {
                        class268.method1963((short) 34, class352.field5626 + " -> <col=00ffff>" + var23.field3273, var20, class221.field3440, class143.field2350, var17, -25900, var19);
                        class245.field3816++;
                    } else if (class210.field3237) {
                        class140 var24 = class285.field4432 == -1 ? null : class29.method331(class285.field4432, (byte) 3);
                        if ((class209.field3214 & 0x4) != 0 && (var24 == null || var23.method1578(class285.field4432, (byte) 112, var24.field2334) != var24.field2334)) {
                            class250.field3863++;
                            class268.method1963((short) 18, class83.field1203 + " -> <col=00ffff>" + var23.field3273, var20, class281.field4355, class202.field3130, var17, -25900, var19);
                        }
                    } else {
                        class281.field4342++;
                        String[] var25 = var23.field3265;
                        if (class158.field2533) {
                            var25 = class15.method165(var25, 15000);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class4.field49++;
                                    short var27 = 0;
                                    if (var26 == 0) {
                                        var27 = 28;
                                    }
                                    int var28 = -1;
                                    if (var26 == 1) {
                                        var27 = 45;
                                    }
                                    if (var23.field3249 == var26) {
                                        var28 = var23.field3263;
                                    }
                                    if (var23.field3282 == var26) {
                                        var28 = var23.field3288;
                                    }
                                    if (var26 == 2) {
                                        var27 = 46;
                                    }
                                    if (var26 == 3) {
                                        var27 = 41;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1001;
                                    }
                                    class268.method1963(var27, "<col=00ffff>" + var23.field3273, var20, var28, var25[var26], var17, -25900, var19);
                                }
                            }
                        }
                        class268.method1963((short) 1012, "<col=00ffff>" + var23.field3273, var20, class329.field5057, class171.field2729, (long) var23.field3334, -25900, var19);
                    }
                }
                if (var21 == 1) {
                    class244 var29 = class110.field1683[var22];
                    if ((var29.field3802.field2192 & 0x1) == 0 && (var29.field1359 & 0x7F) == 0 && (var29.field1286 & 0x7F) == 0 || (var29.field3802.field2192 & 0x1) == 1 && (var29.field1359 & 0x7F) == 64 && (var29.field1286 & 0x7F) == 64) {
                        int var30 = var29.field1359 - (var29.field3802.field2192 << 6);
                        int var31 = var29.field1286 - (var29.field3802.field2192 << 6);
                        int var32 = var29.field3802.field2192 << 7;
                        if (class214.field3348) {
                            for (int var33 = 0; var33 < class6.field80; var33++) {
                                class244 var34 = class110.field1683[class126.field2114[var33]];
                                if (var34 != null && !var34.field1328 && var29 != var34 && var34.field1291) {
                                    int var35 = var34.field1359 - (var34.field3802.field2192 << 6);
                                    int var36 = var34.field1286 - (var34.field3802.field2192 << 6);
                                    int var37 = var34.field3802.field2192 << 7;
                                    if (class209.method1551(var31, var30, var37, var37, var36, var35, var32, var32, 506276088)) {
                                        class3.method26(var20, class126.field2114[var33], var19, 0, var34.field3802);
                                        var34.field1328 = true;
                                    }
                                }
                            }
                            for (int var38 = 0; var38 < class66.field995; var38++) {
                                class171 var39 = class177.field2795[class345.field5495[var38]];
                                if (var39 != null && !var39.field1328 && var39.field1291) {
                                    int var40 = var39.field1359 - (var39.method808(121) << 6);
                                    int var41 = var39.field1286 - (var39.method808(-99) << 6);
                                    int var42 = var39.method808(-66) << 7;
                                    if (class209.method1551(var31, var30, var42, var42, var41, var40, var32, var32, 506276088)) {
                                        class358.method2518(-50, var39, var20, var19, class345.field5495[var38]);
                                        var39.field1328 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var29.field1328) {
                        continue;
                    }
                    class3.method26(var20, var22, var19, 0, var29.field3802);
                    var29.field1328 = true;
                }
                if (var21 == 0) {
                    class171 var43 = class177.field2795[var22];
                    if ((var43.field1359 & 0x7F) == 64 && (var43.field1286 & 0x7F) == 64) {
                        int var44 = var43.field1359 - (var43.method808(-19) << 6);
                        int var45 = var43.field1286 - (var43.method808(124) << 6);
                        int var46 = var43.method808(82) << 7;
                        if (class214.field3348) {
                            for (int var47 = 0; var47 < class6.field80; var47++) {
                                class244 var48 = class110.field1683[class126.field2114[var47]];
                                if (var48 != null && !var48.field1328 && var48.field1291) {
                                    int var49 = var48.field3802.field2192 << 7;
                                    int var50 = var48.field1286 - (var48.field3802.field2192 << 6);
                                    int var51 = var48.field1359 - (var48.field3802.field2192 << 6);
                                    if (class209.method1551(var45, var44, var49, var49, var50, var51, var46, var46, 506276088)) {
                                        class3.method26(var20, class126.field2114[var47], var19, 0, var48.field3802);
                                        var48.field1328 = true;
                                    }
                                }
                            }
                            for (int var52 = 0; var52 < class66.field995; var52++) {
                                class171 var53 = class177.field2795[class345.field5495[var52]];
                                if (var53 != null && !var53.field1328 && var43 != var53 && var53.field1291) {
                                    int var54 = var53.field1359 - (var53.method808(-109) << 6);
                                    int var55 = var53.field1286 - (var53.method808(-32) << 6);
                                    int var56 = var53.method808(-115) << 7;
                                    if (class209.method1551(var45, var44, var56, var56, var55, var54, var46, var46, 506276088)) {
                                        class358.method2518(-50, var53, var20, var19, class345.field5495[var52]);
                                        var53.field1328 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var43.field1328) {
                        continue;
                    }
                    class358.method2518(-50, var43, var20, var19, var22);
                    var43.field1328 = true;
                }
                if (var21 == 3) {
                    class317 var57 = class349.field5540[class119.field1826][var19][var20];
                    if (var57 != null) {
                        for (class236 var58 = (class236) var57.method2238((byte) 107); var58 != null; var58 = (class236) var57.method2232((byte) 33)) {
                            int var59 = var58.field3669.field51;
                            class263 var60 = class48.method469(10, var59);
                            if (class78.field1136 == 1) {
                                class327.field5024++;
                                class268.method1963((short) 4, class352.field5626 + " -> <col=ff9040>" + var60.field4058, var20, class221.field3440, class143.field2350, (long) var59, -25900, var19);
                            } else if (class210.field3237) {
                                class140 var61 = class285.field4432 == -1 ? null : class29.method331(class285.field4432, (byte) 3);
                                if ((class209.field3214 & 0x1) != 0 && (var61 == null || var60.method1932(0, var61.field2334, class285.field4432) != var61.field2334)) {
                                    class268.method1963((short) 39, class83.field1203 + " -> <col=ff9040>" + var60.field4058, var20, class281.field4355, class202.field3130, (long) var59, -25900, var19);
                                    class358.field5693++;
                                }
                            } else {
                                class110.field1688++;
                                String[] var62 = var60.field4034;
                                if (class158.field2533) {
                                    var62 = class15.method165(var62, 15000);
                                }
                                for (int var63 = 4; var63 >= 0; var63--) {
                                    if (var62 != null && var62[var63] != null) {
                                        class246.field3830++;
                                        byte var64 = 0;
                                        int var65 = -1;
                                        if (var63 == 0) {
                                            var64 = 38;
                                        }
                                        if (var63 == 1) {
                                            var64 = 5;
                                        }
                                        if (var63 == 2) {
                                            var64 = 25;
                                        }
                                        if (var60.field4041 == var63) {
                                            var65 = var60.field4043;
                                        }
                                        if (var63 == 3) {
                                            var64 = 60;
                                        }
                                        if (var60.field4037 == var63) {
                                            var65 = var60.field4047;
                                        }
                                        if (var63 == 4) {
                                            var64 = 23;
                                        }
                                        class268.method1963(var64, "<col=ff9040>" + var60.field4058, var20, var65, var62[var63], (long) var59, -25900, var19);
                                    }
                                }
                                class268.method1963((short) 1010, "<col=ff9040>" + var60.field4058, var20, class329.field5057, class171.field2729, (long) var59, -25900, var19);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(IB)Lec;", line = 427)
    public static final class181 method2351(int arg0, byte arg1) {
        int var2 = -7 / ((arg1 - 30) / 61);
        class181 var3 = (class181) class326.field5007.method654(54, (long) arg0);
        field5117++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class147.field2394.method187(36, arg0, -1);
        class181 var5 = new class181();
        var5.field2865 = arg0;
        if (var4 != null) {
            var5.method1408(new class25(var4), true);
        }
        class326.field5007.method652(83, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)[I", line = 453)
    public final int[] method158(int arg0, int arg1) {
        if (arg1 < 7) {
            this.field5112 = -85;
        }
        int[] var3 = this.field1225.method1914(arg0, -85);
        field5118++;
        if (this.field1225.field3995) {
            int var4 = class181.field2836 / this.field5110;
            int var5 = class93.field1424 / this.field5112;
            int[] var7;
            if (var4 > 0) {
                int var6 = arg0 % var4;
                var7 = this.method774(0, class181.field2836 * var6 / var4, 0);
            } else {
                var7 = this.method774(0, 0, 0);
            }
            for (int var8 = 0; var8 < class93.field1424; var8++) {
                if (var5 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var5;
                    var3[var8] = var7[class93.field1424 * var9 / var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V", line = 506)
    public static void method2352(int arg0) {
        if (arg0 != 2) {
            field5111 = true;
        }
        field5108 = (class342[][]) null;
        field5114 = null;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 516)
    public class334() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(III)I", line = 520)
    public static final int method2353(int arg0, int arg1, int arg2) {
        field5109++;
        class133 var3 = (class133) class81.field1169.method370((byte) -120, (long) arg0);
        if (var3 == null) {
            return -1;
        } else if (~arg1 <= arg2 && var3.field2231.length > arg1) {
            return var3.field2231[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZLug;)V", line = 546)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field5113++;
        if (arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field5112 = arg2.method281(-126);
        } else if (arg0 == 1) {
            this.field5110 = arg2.method281(80);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BZLjava/lang/Object;)[B", line = 590)
    public static final byte[] method2354(byte arg0, boolean arg1, Object arg2) {
        field5116++;
        if (arg2 == null) {
            return null;
        } else if ((arg2 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg2);
            return arg1 ? class150.method1251(var4, -90) : var4;
        } else {
            if (arg0 < 97) {
                field5114 = (class246[]) null;
            }
            if (!(arg2 instanceof class23)) {
                throw new IllegalArgumentException();
            }
            class23 var3 = (class23) arg2;
            return var3.method242(-31971);
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IB)[[I", line = 631)
    public final int[][] method156(int arg0, byte arg1) {
        field5115++;
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (this.field1227.field4277) {
            int var4 = class93.field1424 / this.field5112;
            int var5 = class181.field2836 / this.field5110;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method782(class181.field2836 * var6 / var5, 0, 1);
            } else {
                var7 = this.method782(0, 0, 1);
            }
            int[] var8 = var7[1];
            int[] var9 = var7[0];
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            int[] var13 = var7[2];
            for (int var14 = 0; var14 < class93.field1424; var14++) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class93.field1424 * var16 / var4;
                }
                var10[var14] = var9[var15];
                var11[var14] = var8[var15];
                var12[var14] = var13[var15];
            }
        }
        return arg1 >= -126 ? (int[][]) ((int[][]) null) : var3;
    }
}
