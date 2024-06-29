import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class63 extends class335 {

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "I")
    private int field1004 = 4096;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    private int field1007 = 4096;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "I")
    private int field1012 = 4096;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1001 = "Allocated memory";

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "[I")
    public static int[] field1000 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    public static int field1006 = 0;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "[I")
    public static int[] field1005 = new int[100];

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "Ljava/lang/String;")
    public static String field1010 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "[I")
    public static int[] field1002;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "[I")
    public static int[] field1013;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)[[I", line = 11)
    public final int[][] method249(int arg0, byte arg1) {
        field1011++;
        if (arg1 != 51) {
            this.method249(-65, (byte) 30);
        }
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (this.field5232.field2446) {
            int[][] var4 = this.method2328(arg0, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class105.field1630; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var9[var11] = this.field1012 * var12 >> 12;
                    var8[var11] = this.field1004 * var13 >> 12;
                    var10[var11] = this.field1007 * var14 >> 12;
                } else {
                    var9[var11] = this.field1012;
                    var8[var11] = this.field1004;
                    var10[var11] = this.field1007;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILkh;I)V", line = 83)
    public final void method230(int arg0, class166 arg1, int arg2) {
        field1009++;
        if (arg0 == 0) {
            this.field1012 = arg1.method1151(-57);
        } else if (arg0 == 1) {
            this.field1004 = arg1.method1151(-119);
        } else if (arg0 == 2) {
            this.field1007 = arg1.method1151(-122);
        }
        if (arg2 <= 51) {
            this.method249(-60, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([Ltb;BI)V", line = 126)
    public static final void method485(class220[] arg0, byte arg1, int arg2) {
        field1003++;
        if (arg1 != 48) {
            method486((class142) null, false);
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class220 var4 = arg0[var3];
            if (var4 != null && var4.field3393 == arg2 && (!var4.field3445 || !client.method386(var4))) {
                if (var4.field3468 == 0) {
                    if (!var4.field3445 && client.method386(var4) && class162.field2441 != var4) {
                        continue;
                    }
                    method485(arg0, (byte) 48, var4.field3404);
                    if (var4.field3472 != null) {
                        method485(var4.field3472, (byte) 48, var4.field3404);
                    }
                    class61 var5 = (class61) class276.field4257.method1222(0, (long) var4.field3404);
                    if (var5 != null) {
                        class12.method93(var5.field982, true);
                    }
                }
                if (var4.field3468 == 6) {
                    if (var4.field3406 != -1 || var4.field3355 != -1) {
                        boolean var6 = class224.method1588(var4, (byte) 33);
                        int var7;
                        if (var6) {
                            var7 = var4.field3355;
                        } else {
                            var7 = var4.field3406;
                        }
                        if (var7 != -1) {
                            class281 var8 = class133.method948(var7, (byte) 33);
                            if (var8 != null) {
                                var4.field3500 += class34.field518;
                                while (var8.field4322[var4.field3469] < var4.field3500) {
                                    var4.field3500 -= var8.field4322[var4.field3469];
                                    var4.field3469++;
                                    if (var4.field3469 >= var8.field4326.length) {
                                        var4.field3469 -= var8.field4337;
                                        if (var4.field3469 < 0 || var8.field4326.length <= var4.field3469) {
                                            var4.field3469 = 0;
                                        }
                                    }
                                    var4.field3349 = var4.field3469 + 1;
                                    if (var8.field4326.length <= var4.field3349) {
                                        var4.field3349 -= var8.field4337;
                                        if (var4.field3349 < 0 || var8.field4326.length <= var4.field3349) {
                                            var4.field3349 = -1;
                                        }
                                    }
                                    class26.method241(3095, var4);
                                }
                            }
                        }
                    }
                    if (var4.field3491 != 0 && !var4.field3445) {
                        int var9 = var4.field3491 >> 16;
                        int var10 = class34.field518 * var9;
                        int var11 = var4.field3491 << 16 >> 16;
                        int var12 = class34.field518 * var11;
                        var4.field3505 = var4.field3505 + var12 & 0x7FF;
                        var4.field3350 = var4.field3350 + var10 & 0x7FF;
                        class26.method241(3095, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 265)
    public class63() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lff;Z)V", line = 273)
    public static final void method486(class142 arg0, boolean arg1) {
        class237.field3775.method632(-116, arg0);
        while (true) {
            class142 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class142[][] var7;
            class142 var78;
            do {
                class142 var77;
                do {
                    class142 var76;
                    do {
                        class142 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class142) class237.field3775.method633(-1);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2207);
                                            var3 = var2.field2212;
                                            var4 = var2.field2198;
                                            var5 = var2.field2201;
                                            var6 = var2.field2210;
                                            var7 = class256.field4013[var5];
                                            float var8 = 0.0F;
                                            if (class94.field1516) {
                                                if (class218.field3321 == class119.field1816) {
                                                    int var9 = class121.field1848[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class273.field4235 != var10) {
                                                        class273.field4235 = var10;
                                                        class307.method2099(var10, (byte) 49);
                                                        class250.method1733(class62.method483(8713));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class229.field3648 != var11) {
                                                        class229.field3648 = var11;
                                                        class212.method1496((byte) 100, var11);
                                                    }
                                                    int var12 = class216.field3293[0][var3 + 1][var4] + class216.field3293[0][var3][var4] + class216.field3293[0][var3][var4 + 1] + class216.field3293[0][var3 + 1][var4 + 1] >> 2;
                                                    class37.method313(-var12, 3, 0);
                                                    var8 = 201.5F;
                                                    class94.method671(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class94.method671(var8);
                                                }
                                            }
                                            if (!var2.field2202) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class142 var13 = class256.field4013[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field2207) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class106.field1637 && var3 > class304.field4751) {
                                                    class142 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field2207 && (var14.field2202 || (var2.field2208 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class106.field1637 && var3 < class46.field757 - 1) {
                                                    class142 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field2207 && (var15.field2202 || (var2.field2208 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class219.field3330 && var4 > class259.field4061) {
                                                    class142 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field2207 && (var16.field2202 || (var2.field2208 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class219.field3330 && var4 < class18.field249 - 1) {
                                                    class142 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field2207 && (var17.field2202 || (var2.field2208 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2202 = false;
                                            if (var2.field2203 != null) {
                                                class142 var18 = var2.field2203;
                                                if (class94.field1516) {
                                                    class94.method671(201.5F - (float) (var18.field2210 + 1) * 50.0F);
                                                }
                                                if (var18.field2211 == null) {
                                                    if (var18.field2200 != null) {
                                                        if (class338.method2351(0, var3, var4)) {
                                                            class308.method2104(var18.field2200, class279.field4292, class171.field2607, class44.field704, class53.field908, var3, var4, true);
                                                        } else {
                                                            class308.method2104(var18.field2200, class279.field4292, class171.field2607, class44.field704, class53.field908, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class338.method2351(0, var3, var4)) {
                                                    class83.method588(var18.field2211, 0, class279.field4292, class171.field2607, class44.field704, class53.field908, var3, var4, true);
                                                } else {
                                                    class83.method588(var18.field2211, 0, class279.field4292, class171.field2607, class44.field704, class53.field908, var3, var4, false);
                                                }
                                                class103 var19 = var18.field2213;
                                                if (var19 != null) {
                                                    if (class94.field1516) {
                                                        if ((var19.field1595 & var2.field2206) == 0) {
                                                            class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                                                        } else {
                                                            class183.method1307(var19.field1595, class217.field3306, class17.field238, class212.field3226, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field1598.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var19.field1604 - class217.field3306, var19.field1608 - class17.field238, var19.field1601 - class212.field3226, var19.field1602, var5, (class64) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field2204; var20++) {
                                                    class26 var21 = var18.field2197[var20];
                                                    if (var21 != null) {
                                                        if (class94.field1516) {
                                                            class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                                                        }
                                                        var21.field406.method75(var21.field401, class279.field4292, class171.field2607, class44.field704, class53.field908, var21.field407 - class217.field3306, var21.field408 - class17.field238, var21.field395 - class212.field3226, var21.field402, var5, (class64) null);
                                                    }
                                                }
                                                if (class94.field1516) {
                                                    class94.method671(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field2211 == null) {
                                                if (var2.field2200 != null) {
                                                    if (class338.method2351(var6, var3, var4)) {
                                                        class308.method2104(var2.field2200, class279.field4292, class171.field2607, class44.field704, class53.field908, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class308.method2104(var2.field2200, class279.field4292, class171.field2607, class44.field704, class53.field908, var3, var4, false);
                                                    }
                                                }
                                            } else if (class338.method2351(var6, var3, var4)) {
                                                class83.method588(var2.field2211, var6, class279.field4292, class171.field2607, class44.field704, class53.field908, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field2211.field5053 != 12345678 || class174.field2639 && var5 <= class241.field3864) {
                                                    class83.method588(var2.field2211, var6, class279.field4292, class171.field2607, class44.field704, class53.field908, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class279 var23 = var2.field2196;
                                                if (var23 != null && (var23.field4300 & 0x80000000L) != 0L) {
                                                    if (class94.field1516 && var23.field4291) {
                                                        class94.method671(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class94.field1516) {
                                                        class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                                                    }
                                                    var23.field4297.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var23.field4295 - class217.field3306, var23.field4294 - class17.field238, var23.field4293 - class212.field3226, var23.field4300, var5, (class64) null);
                                                    if (class94.field1516 && var23.field4291) {
                                                        class94.method671(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class103 var26 = var2.field2213;
                                            class228 var27 = var2.field2194;
                                            if (var26 != null || var27 != null) {
                                                if (class106.field1637 == var3) {
                                                    var24++;
                                                } else if (class106.field1637 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class219.field3330 == var4) {
                                                    var24 += 3;
                                                } else if (class219.field3330 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class51.field829[var24];
                                                var2.field2206 = class71.field1166[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field1595 & class1.field3[var24]) == 0) {
                                                    var2.field2214 = 0;
                                                } else if (var26.field1595 == 16) {
                                                    var2.field2214 = 3;
                                                    var2.field2199 = class67.field1120[var24];
                                                    var2.field2195 = 3 - var2.field2199;
                                                } else if (var26.field1595 == 32) {
                                                    var2.field2214 = 6;
                                                    var2.field2199 = class242.field3878[var24];
                                                    var2.field2195 = 6 - var2.field2199;
                                                } else if (var26.field1595 == 64) {
                                                    var2.field2214 = 12;
                                                    var2.field2199 = class233.field3721[var24];
                                                    var2.field2195 = 12 - var2.field2199;
                                                } else {
                                                    var2.field2214 = 9;
                                                    var2.field2199 = class153.field2304[var24];
                                                    var2.field2195 = 9 - var2.field2199;
                                                }
                                                if ((var26.field1595 & var25) != 0 && !class166.method1136(var6, var3, var4, var26.field1595)) {
                                                    if (class94.field1516) {
                                                        class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                                                    }
                                                    var26.field1598.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var26.field1604 - class217.field3306, var26.field1608 - class17.field238, var26.field1601 - class212.field3226, var26.field1602, var5, (class64) null);
                                                }
                                                if ((var26.field1605 & var25) != 0 && !class166.method1136(var6, var3, var4, var26.field1605)) {
                                                    if (class94.field1516) {
                                                        class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                                                    }
                                                    var26.field1600.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var26.field1604 - class217.field3306, var26.field1608 - class17.field238, var26.field1601 - class212.field3226, var26.field1602, var5, (class64) null);
                                                }
                                            }
                                            if (var27 != null && !class202.method1437(var6, var3, var4, var27.field3623.method76())) {
                                                if (class94.field1516) {
                                                    class94.method671(var8 - 0.5F);
                                                }
                                                if ((var27.field3624 & var25) != 0) {
                                                    if (class94.field1516) {
                                                        class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                                                    }
                                                    var27.field3623.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var27.field3621 + var27.field3633 - class217.field3306, var27.field3630 - class17.field238, var27.field3634 + var27.field3622 - class212.field3226, var27.field3631, var5, (class64) null);
                                                } else if (var27.field3624 == 256) {
                                                    int var28 = var27.field3621 - class217.field3306;
                                                    int var29 = var27.field3630 - class17.field238;
                                                    int var30 = var27.field3634 - class212.field3226;
                                                    int var31 = var27.field3632;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class94.field1516) {
                                                            class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                                                        }
                                                        var27.field3623.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var27.field3633 + var28, var29, var27.field3622 + var30, var27.field3631, var5, (class64) null);
                                                    } else if (var27.field3628 != null) {
                                                        if (class94.field1516) {
                                                            class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                                                        }
                                                        var27.field3628.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var28, var29, var30, var27.field3631, var5, (class64) null);
                                                    }
                                                }
                                                if (class94.field1516) {
                                                    class94.method671(var8);
                                                }
                                            }
                                            if (var22) {
                                                class279 var34 = var2.field2196;
                                                if (var34 != null && (var34.field4300 & 0x80000000L) == 0L) {
                                                    if (class94.field1516 && var34.field4291) {
                                                        class94.method671(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class94.field1516) {
                                                        class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                                                    }
                                                    var34.field4297.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var34.field4295 - class217.field3306, var34.field4294 - class17.field238, var34.field4293 - class212.field3226, var34.field4300, var5, (class64) null);
                                                    if (class94.field1516 && var34.field4291) {
                                                        class94.method671(var8);
                                                    }
                                                }
                                                class34 var35 = var2.field2215;
                                                if (var35 != null && var35.field517 == 0) {
                                                    if (class94.field1516) {
                                                        class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                                                    }
                                                    if (var35.field516 != null) {
                                                        var35.field516.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var35.field513 - class217.field3306, var35.field532 - class17.field238, var35.field526 - class212.field3226, var35.field531, var5, (class64) null);
                                                    }
                                                    if (var35.field520 != null) {
                                                        var35.field520.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var35.field513 - class217.field3306, var35.field532 - class17.field238, var35.field526 - class212.field3226, var35.field531, var5, (class64) null);
                                                    }
                                                    if (var35.field523 != null) {
                                                        var35.field523.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var35.field513 - class217.field3306, var35.field532 - class17.field238, var35.field526 - class212.field3226, var35.field531, var5, (class64) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field2208;
                                            if (var36 != 0) {
                                                if (var3 < class106.field1637 && (var36 & 0x4) != 0) {
                                                    class142 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field2207) {
                                                        class237.field3775.method632(-77, var37);
                                                    }
                                                }
                                                if (var4 < class219.field3330 && (var36 & 0x2) != 0) {
                                                    class142 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field2207) {
                                                        class237.field3775.method632(-104, var38);
                                                    }
                                                }
                                                if (var3 > class106.field1637 && (var36 & 0x1) != 0) {
                                                    class142 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field2207) {
                                                        class237.field3775.method632(-104, var39);
                                                    }
                                                }
                                                if (var4 > class219.field3330 && (var36 & 0x8) != 0) {
                                                    class142 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field2207) {
                                                        class237.field3775.method632(-105, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2214 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field2204; var42++) {
                                                if (class331.field5159 != var2.field2197[var42].field397 && (var2.field2193[var42] & var2.field2214) == var2.field2199) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class103 var43 = var2.field2213;
                                                if (!class166.method1136(var6, var3, var4, var43.field1595)) {
                                                    if (class94.field1516) {
                                                        label882: {
                                                            if ((var43.field1602 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field1604 - class217.field3306;
                                                                int var45 = var43.field1601 - class212.field3226;
                                                                int var46 = (int) (var43.field1602 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class267.field4171 - 1) {
                                                                        class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class50.field817 - 1 && var4 < class267.field4171 - 1) {
                                                                        class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class50.field817 - 1 && var4 > 0) {
                                                                        class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field1598.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var43.field1604 - class217.field3306, var43.field1608 - class17.field238, var43.field1601 - class212.field3226, var43.field1602, var5, (class64) null);
                                                }
                                                var2.field2214 = 0;
                                            }
                                        }
                                        if (!var2.field2205) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field2204;
                                            var2.field2205 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class26 var50 = var2.field2197[var49];
                                                if (class331.field5159 != var50.field397) {
                                                    for (int var51 = var50.field411; var51 <= var50.field405; var51++) {
                                                        for (int var52 = var50.field410; var52 <= var50.field396; var52++) {
                                                            class142 var53 = var7[var51][var52];
                                                            if (var53.field2202) {
                                                                var2.field2205 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field2214 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field411) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field405) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field410) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field396) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field2214) == var2.field2195) {
                                                                    var2.field2205 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class98.field1563[var48++] = var50;
                                                    int var55 = class106.field1637 - var50.field411;
                                                    int var56 = var50.field405 - class106.field1637;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class219.field3330 - var50.field410;
                                                    int var58 = var50.field396 - class219.field3330;
                                                    if (var58 > var57) {
                                                        var50.field409 = var55 + var58;
                                                    } else {
                                                        var50.field409 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class26 var62 = class98.field1563[var61];
                                                    if (class331.field5159 != var62.field397) {
                                                        if (var62.field409 > var59) {
                                                            var59 = var62.field409;
                                                            var60 = var61;
                                                        } else if (var62.field409 == var59) {
                                                            int var63 = var62.field407 - class217.field3306;
                                                            int var64 = var62.field395 - class212.field3226;
                                                            int var65 = class98.field1563[var60].field407 - class217.field3306;
                                                            int var66 = class98.field1563[var60].field395 - class212.field3226;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class26 var67 = class98.field1563[var60];
                                                var67.field397 = class331.field5159;
                                                if (!class16.method135(var6, var67.field411, var67.field405, var67.field410, var67.field396, var67.field406.method76())) {
                                                    if (class94.field1516) {
                                                        if ((var67.field402 & 0xFC000L) == 147456L) {
                                                            class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                                                            int var68 = var67.field407 - class217.field3306;
                                                            int var69 = var67.field395 - class212.field3226;
                                                            int var70 = (int) (var67.field402 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class183.method1305(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class183.method1305(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class183.method1305(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class183.method1305(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class183.method1314(class217.field3306, class17.field238, class212.field3226, var5, var67.field411, var67.field410, var67.field405, var67.field396);
                                                        }
                                                    }
                                                    var67.field406.method75(var67.field401, class279.field4292, class171.field2607, class44.field704, class53.field908, var67.field407 - class217.field3306, var67.field408 - class17.field238, var67.field395 - class212.field3226, var67.field402, var5, (class64) null);
                                                }
                                                for (int var71 = var67.field411; var71 <= var67.field405; var71++) {
                                                    for (int var72 = var67.field410; var72 <= var67.field396; var72++) {
                                                        class142 var73 = var7[var71][var72];
                                                        if (var73.field2214 != 0) {
                                                            class237.field3775.method632(-80, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field2207) {
                                                            class237.field3775.method632(-124, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2205) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field2205 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2207);
                            } while (var2.field2214 != 0);
                            if (var3 > class106.field1637 || var3 <= class304.field4751) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field2207);
                        if (var3 < class106.field1637 || var3 >= class46.field757 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field2207);
                    if (var4 > class219.field3330 || var4 <= class259.field4061) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field2207);
                if (var4 < class219.field3330 || var4 >= class18.field249 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field2207);
            var2.field2207 = false;
            class23.field378--;
            class34 var79 = var2.field2215;
            if (var79 != null && var79.field517 != 0) {
                if (class94.field1516) {
                    class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                }
                if (var79.field516 != null) {
                    var79.field516.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var79.field513 - class217.field3306, var79.field532 - class17.field238 - var79.field517, var79.field526 - class212.field3226, var79.field531, var5, (class64) null);
                }
                if (var79.field520 != null) {
                    var79.field520.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var79.field513 - class217.field3306, var79.field532 - class17.field238 - var79.field517, var79.field526 - class212.field3226, var79.field531, var5, (class64) null);
                }
                if (var79.field523 != null) {
                    var79.field523.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var79.field513 - class217.field3306, var79.field532 - class17.field238 - var79.field517, var79.field526 - class212.field3226, var79.field531, var5, (class64) null);
                }
            }
            if (var2.field2206 != 0) {
                class228 var80 = var2.field2194;
                if (var80 != null && !class202.method1437(var6, var3, var4, var80.field3623.method76())) {
                    if ((var80.field3624 & var2.field2206) != 0) {
                        if (class94.field1516) {
                            class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                        }
                        var80.field3623.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var80.field3621 + var80.field3633 - class217.field3306, var80.field3630 - class17.field238, var80.field3634 + var80.field3622 - class212.field3226, var80.field3631, var5, (class64) null);
                    } else if (var80.field3624 == 256) {
                        int var81 = var80.field3621 - class217.field3306;
                        int var82 = var80.field3630 - class17.field238;
                        int var83 = var80.field3634 - class212.field3226;
                        int var84 = var80.field3632;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class94.field1516) {
                                class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                            }
                            var80.field3623.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var80.field3633 + var81, var82, var80.field3622 + var83, var80.field3631, var5, (class64) null);
                        } else if (var80.field3628 != null) {
                            if (class94.field1516) {
                                class183.method1315(class217.field3306, class17.field238, class212.field3226, var5, var3, var4);
                            }
                            var80.field3628.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var81, var82, var83, var80.field3631, var5, (class64) null);
                        }
                    }
                }
                class103 var87 = var2.field2213;
                if (var87 != null) {
                    if ((var87.field1605 & var2.field2206) != 0 && !class166.method1136(var6, var3, var4, var87.field1605)) {
                        if (class94.field1516) {
                            class183.method1307(var87.field1605, class217.field3306, class17.field238, class212.field3226, var6, var3, var4);
                        }
                        var87.field1600.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var87.field1604 - class217.field3306, var87.field1608 - class17.field238, var87.field1601 - class212.field3226, var87.field1602, var5, (class64) null);
                    }
                    if ((var87.field1595 & var2.field2206) != 0 && !class166.method1136(var6, var3, var4, var87.field1595)) {
                        if (class94.field1516) {
                            class183.method1307(var87.field1595, class217.field3306, class17.field238, class212.field3226, var6, var3, var4);
                        }
                        var87.field1598.method75(0, class279.field4292, class171.field2607, class44.field704, class53.field908, var87.field1604 - class217.field3306, var87.field1608 - class17.field238, var87.field1601 - class212.field3226, var87.field1602, var5, (class64) null);
                    }
                }
            }
            if (var5 < class273.field4226 - 1) {
                class142 var88 = class256.field4013[var5 + 1][var3][var4];
                if (var88 != null && var88.field2207) {
                    class237.field3775.method632(-120, var88);
                }
            }
            if (var3 < class106.field1637) {
                class142 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field2207) {
                    class237.field3775.method632(-33, var89);
                }
            }
            if (var4 < class219.field3330) {
                class142 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field2207) {
                    class237.field3775.method632(-56, var90);
                }
            }
            if (var3 > class106.field1637) {
                class142 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field2207) {
                    class237.field3775.method632(-110, var91);
                }
            }
            if (var4 > class219.field3330) {
                class142 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field2207) {
                    class237.field3775.method632(-31, var92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(Z)V", line = 1266)
    public static void method487(boolean arg0) {
        field1013 = null;
        field1000 = null;
        field1001 = null;
        if (arg0) {
            field1010 = null;
            field1005 = null;
            field1002 = null;
        }
    }
}
