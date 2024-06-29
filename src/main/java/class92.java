import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class92 extends class99 {

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "[I")
    public static int[] field1339 = new int[256];

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field1341 = 1;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "Lea;")
    public static class243 field1346;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "Lqj;")
    public static class196 field1348;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "[[[B")
    public static byte[][][] field1349;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 0;
        field1343++;
        int var10 = arg2;
        int var11 = arg0 - arg1;
        int var12 = arg2 - arg1;
        int var13 = arg2 * arg2;
        int var14 = arg0 * arg0;
        int var15 = var12 * var12;
        int var16 = var13 << 1;
        int var17 = var14 << 1;
        int var18 = var15 << 1;
        int var19 = var11 * var11;
        int var20 = arg2 << 1;
        int var21 = var19 << 1;
        if (arg4 != 28427) {
            return;
        }
        int var22 = var12 << 1;
        int var23 = (1 - var20) * var14 + var16;
        int var24 = var13 - (var20 - 1) * var17;
        int var25 = (1 - var22) * var19 + var18;
        int var26 = var15 - (var22 - 1) * var21;
        int var27 = var14 << 2;
        int var28 = var19 << 2;
        int var29 = var15 << 2;
        int var30 = var16 * 3;
        int var31 = var13 << 2;
        int var32 = var18 * 3;
        int var33 = (var20 - 3) * var17;
        int var34 = (var22 - 3) * var21;
        int var35 = var31;
        int var36 = (arg2 - 1) * var27;
        if (class93.field1361 <= arg6 && arg6 <= class23.field291) {
            int[] var37 = class95.field1380[arg6];
            int var38 = class186.method1217(class188.field3296, class95.field1388, arg5 - arg0, 18291);
            int var39 = class186.method1217(class188.field3296, class95.field1388, arg0 + arg5, 18291);
            int var40 = class186.method1217(class188.field3296, class95.field1388, arg5 - var11, 18291);
            int var41 = class186.method1217(class188.field3296, class95.field1388, arg5 + var11, arg4 + -10136);
            class25.method147(arg3, 7, var38, var37, var40);
            class25.method147(arg7, 7, var40, var37, var41);
            class25.method147(arg3, 7, var41, var37, var39);
        }
        int var42 = var29;
        int var43 = (var12 - 1) * var28;
        while (var10 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var30;
                    var9++;
                    var30 += var31;
                    var24 += var35;
                    var35 += var31;
                }
            }
            if (var24 < 0) {
                var9++;
                var24 += var35;
                var35 += var31;
                var23 += var30;
                var30 += var31;
            }
            var23 += -var36;
            boolean var44 = var10 <= var12;
            var10--;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var32;
                        var26 += var42;
                        var8++;
                        var42 += var29;
                        var32 += var29;
                    }
                }
                if (var26 < 0) {
                    var8++;
                    var25 += var32;
                    var26 += var42;
                    var42 += var29;
                    var32 += var29;
                }
                var25 += -var43;
                var43 -= var28;
                var26 += -var34;
                var34 -= var28;
            }
            var24 += -var33;
            var33 -= var27;
            int var45 = arg6 - var10;
            var36 -= var27;
            int var46 = arg6 + var10;
            if (var46 >= class93.field1361 && class23.field291 >= var45) {
                int var47 = class186.method1217(class188.field3296, class95.field1388, arg5 + var9, 18291);
                int var48 = class186.method1217(class188.field3296, class95.field1388, arg5 - var9, 18291);
                if (var44) {
                    int var49 = class186.method1217(class188.field3296, class95.field1388, arg5 + var8, arg4 + -10136);
                    int var50 = class186.method1217(class188.field3296, class95.field1388, arg5 - var8, 18291);
                    if (class93.field1361 <= var45) {
                        int[] var51 = class95.field1380[var45];
                        class25.method147(arg3, 7, var48, var51, var50);
                        class25.method147(arg7, 7, var50, var51, var49);
                        class25.method147(arg3, arg4 ^ 0x6F0C, var49, var51, var47);
                    }
                    if (class23.field291 >= var46) {
                        int[] var52 = class95.field1380[var46];
                        class25.method147(arg3, 7, var48, var52, var50);
                        class25.method147(arg7, 7, var50, var52, var49);
                        class25.method147(arg3, 7, var49, var52, var47);
                    }
                } else {
                    if (var45 >= class93.field1361) {
                        class25.method147(arg3, 7, var48, class95.field1380[var45], var47);
                    }
                    if (class23.field291 >= var46) {
                        class25.method147(arg3, 7, var48, class95.field1380[var46], var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[Lec;)V")
    public static final void method565(int arg0, int arg1, class178[] arg2) {
        if (arg0 >= -64) {
            field1346 = null;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class178 var4 = arg2[var3];
            if (var4 != null && var4.field2990 == arg1 && (!var4.field3030 || !client.method618(var4))) {
                if (var4.field3123 == 0) {
                    if (!var4.field3030 && client.method618(var4) && class84.field1234 != var4) {
                        continue;
                    }
                    method565(-118, var4.field3117, arg2);
                    if (var4.field3087 != null) {
                        method565(-95, var4.field3117, var4.field3087);
                    }
                    class63 var5 = (class63) class101.field1445.method1551(32768, (long) var4.field3117);
                    if (var5 != null) {
                        class149.method936(var5.field864, -1);
                    }
                }
                if (var4.field3123 == 6) {
                    if (var4.field3143 != -1 || var4.field3020 != -1) {
                        boolean var6 = class6.method22(var4, (byte) -23);
                        int var7;
                        if (var6) {
                            var7 = var4.field3020;
                        } else {
                            var7 = var4.field3143;
                        }
                        if (var7 != -1) {
                            class149 var8 = class116.method704(var7, -10304);
                            if (var8 != null) {
                                var4.field3074 += class113.field1658;
                                while (var4.field3074 > var8.field2361[var4.field3025]) {
                                    var4.field3074 -= var8.field2361[var4.field3025];
                                    var4.field3025++;
                                    if (var4.field3025 >= var8.field2362.length) {
                                        var4.field3025 -= var8.field2370;
                                        if (var4.field3025 < 0 || var4.field3025 >= var8.field2362.length) {
                                            var4.field3025 = 0;
                                        }
                                    }
                                    class214.method1472(89, var4);
                                }
                            }
                        }
                    }
                    if (var4.field3038 != 0 && !var4.field3030) {
                        int var9 = var4.field3038 << 16 >> 16;
                        int var10 = class113.field1658 * var9;
                        var4.field3041 = var4.field3041 + var10 & 0x7FF;
                        int var11 = var4.field3038 >> 16;
                        int var12 = class113.field1658 * var11;
                        var4.field3017 = var4.field3017 + var12 & 0x7FF;
                        class214.method1472(104, var4);
                    }
                }
            }
        }
        field1345++;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)V")
    public static final void method566(boolean arg0) {
        class44.field520.method1173(122, 14592);
        class1.field10++;
        field1342++;
        class63 var1 = (class63) class101.field1445.method1554(6539);
        if (arg0) {
            method567((byte) 97, 120L);
        }
        while (var1 != null) {
            if (var1.field875 == 0) {
                class72.method457(var1, true, (byte) -128);
            }
            var1 = (class63) class101.field1445.method1547(342);
        }
        if (class30.field387 != null) {
            class214.method1472(-91, class30.field387);
            class30.field387 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BJ)Lqj;")
    public static final class196 method567(byte arg0, long arg1) {
        field1344++;
        class177.field2979.setTime(new Date(arg1));
        int var3 = class177.field2979.get(7);
        int var4 = class177.field2979.get(5);
        int var5 = class177.field2979.get(2);
        int var6 = class177.field2979.get(1);
        int var7 = class177.field2979.get(11);
        int var8 = class177.field2979.get(12);
        int var9 = class177.field2979.get(13);
        if (arg0 != 0) {
            field1349 = null;
        }
        return class93.method572(-93, new class196[] { class132.field1882[var3 - 1], class14.field155, class163.method1029(var4 / 10, false), class163.method1029(var4 % 10, false), class12.field142, class143.field2200[var5], class12.field142, class163.method1029(var6, false), class235.field4178, class163.method1029(var7 / 10, false), class163.method1029(var7 % 10, false), class5.field37, class163.method1029(var8 / 10, false), class163.method1029(var8 % 10, false), class5.field37, class163.method1029(var9 / 10, false), class163.method1029(var9 % 10, false), class252.field4452 });
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public static void method568(int arg0) {
        if (arg0 == 16659) {
            field1348 = null;
            field1346 = null;
            field1339 = null;
            field1349 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public static final void method569(int arg0) {
        field1340++;
        if (class195.field3420 == null) {
            return;
        }
        if (class252.field4463 < 10) {
            if (!class206.field3705.method837((byte) -124, class195.field3420)) {
                class252.field4463 = class206.field3705.method829(class195.field3420, 0) / 10;
                return;
            }
            class244.method1668((byte) -116);
            class252.field4463 = 10;
        }
        if (class252.field4463 == 10) {
            class56 var1 = new class56(class206.field3705.method847(class195.field3420, true, class42.field483));
            int var2 = var1.method318(true);
            int var3 = var1.method318(true);
            int var4 = var1.method318(true);
            int var5 = var1.method318(true);
            int var6 = var1.method318(true);
            int var7 = var1.method318(true);
            class199.field3530 = 8.0D;
            class25.field315 = 8.0D;
            class83.field1203 = var3 * 64;
            class83.field1213 = (var5 + 1 - var3) * 64;
            class144.field2221 = (var4 + 1 - var2) * 64;
            int var8 = (class102.field1477.field2085 >> 7) + class178.field3011 - class83.field1203;
            int var9 = var8 + (int) (Math.random() * 10.0D) - 5;
            class212.field3809 = var2 * 64;
            int var10 = class106.field1523 + (class102.field1477.field2081 >> 7) - class212.field3809;
            int var11 = var10 + (int) (Math.random() * 10.0D) - 5;
            if (var11 >= 0 && class144.field2221 > var11 && var9 >= 0 && class83.field1213 > var9) {
                class157.field2537 = var11;
                class126.field1784 = class83.field1213 - var9;
            } else {
                class126.field1784 = class83.field1203 + class83.field1213 - var7 * 64;
                class157.field2537 = var6 * 64 - class212.field3809;
            }
            class24.method142(-5522);
            int var12 = class144.field2221 >> 6;
            int var13 = class40.field458 >> 2 << 10;
            int var14 = class83.field1213 >> 6;
            int var15 = class80.field1154 >> 1;
            class71.field1013 = new byte[var12][var14][];
            class53.field665 = new byte[var12][var14][];
            class164.field2654 = new int[var12][var14][];
            class64.field893 = new byte[var12][var14][];
            class104.field1500 = new byte[var12][var14][];
            class215.field3878 = new int[class240.field4269 + 1];
            class187.field3288 = new byte[var12][var14][];
            class143.field2186 = new int[var12][var14][];
            field1349 = new byte[var12][var14][];
            for (int var16 = 0; var16 < class240.field4269; var16++) {
                class17 var17 = class84.method527(-104, var16);
                if (var17 != null) {
                    int var18 = var17.field197;
                    if (var18 >= 0 && !class15.field171.method1202(206, var18)) {
                        var18 = -1;
                    }
                    int var22;
                    if (var17.field201 >= 0) {
                        int var19 = var17.field201;
                        int var20 = (var19 & 0x7F) + var15;
                        if (var20 < 0) {
                            var20 = 0;
                        } else if (var20 > 127) {
                            var20 = 127;
                        }
                        int var21 = (var19 & 0x380) + (var13 + var19 & 0xFC00) + var20;
                        var22 = class15.field165[class144.method891(96, 126, var21)];
                    } else if (var18 >= 0) {
                        var22 = class15.field165[class144.method891(96, 126, class15.field171.method1203(-97, var18))];
                    } else if (var17.field190 == -1) {
                        var22 = -1;
                    } else {
                        int var23 = var17.field190;
                        int var24 = (var23 & 0x7F) + var15;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 > 127) {
                            var24 = 127;
                        }
                        int var25 = (var23 & 0x380) + (var13 + var23 & 0xFC00) + var24;
                        var22 = class15.field165[class144.method891(96, 126, var25)];
                    }
                    class215.field3878[var16 + 1] = var22;
                }
            }
            class252.field4463 = 20;
        } else if (class252.field4463 == 20) {
            class72.method458(-1, class206.field3705.method847(class195.field3420, true, class136.field1974));
            class252.field4463 = 30;
            class160.method1006(-65, true);
            class175.method1144((byte) 53);
        } else if (class252.field4463 == 30) {
            class105.method641(class206.field3705.method847(class195.field3420, true, class60.field808), (byte) -127);
            class252.field4463 = 40;
            class175.method1144((byte) 47);
        } else if (class252.field4463 == 40) {
            class236.method1588((byte) -51, class206.field3705.method847(class195.field3420, true, class35.field426));
            class252.field4463 = 50;
            class175.method1144((byte) 35);
        } else if (class252.field4463 == 50) {
            class10.method45(-1, class206.field3705.method847(class195.field3420, true, class58.field781));
            class252.field4463 = 60;
            class160.method1006(-127, true);
            class175.method1144((byte) 57);
        } else {
            int var26 = 121 / ((39 - arg0) / 32);
            if (class252.field4463 == 60) {
                class42.method216((byte) 46, class206.field3705.method847(class195.field3420, true, class63.field877));
                class252.field4463 = 70;
                class175.method1144((byte) 68);
            } else if (class252.field4463 == 70) {
                class41.field465 = new class38(11, true, class52.field643);
                class252.field4463 = 73;
                class160.method1006(-107, true);
                class175.method1144((byte) 104);
            } else if (class252.field4463 == 73) {
                class249.field4404 = new class38(12, true, class52.field643);
                class252.field4463 = 76;
                class160.method1006(-120, true);
                class175.method1144((byte) 54);
            } else if (class252.field4463 == 76) {
                class108.field1551 = new class38(14, true, class52.field643);
                class252.field4463 = 79;
                class160.method1006(-108, true);
                class175.method1144((byte) 127);
            } else if (class252.field4463 == 79) {
                class74.field1076 = new class38(17, true, class52.field643);
                class252.field4463 = 82;
                class160.method1006(-88, true);
                class175.method1144((byte) 84);
            } else if (class252.field4463 == 82) {
                class72.field1040 = new class38(19, true, class52.field643);
                class252.field4463 = 85;
                class160.method1006(-75, true);
                class175.method1144((byte) 89);
            } else if (class252.field4463 == 85) {
                class178.field3108 = new class38(22, true, class52.field643);
                class252.field4463 = 88;
                class160.method1006(-65, true);
                class175.method1144((byte) 121);
            } else if (class252.field4463 == 88) {
                class123.field1750 = new class38(26, true, class52.field643);
                class252.field4463 = 91;
                class160.method1006(-72, true);
                class175.method1144((byte) 79);
            } else {
                class238.field4230 = new class38(30, true, class52.field643);
                class252.field4463 = 100;
                class160.method1006(-121, true);
                class175.method1144((byte) 77);
                class120.field1737 = -1;
                class45.field537 = -1;
                System.gc();
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1339[var0] = var1;
        }
        field1346 = new class243();
        field1348 = class80.method502("Clientscript error in: ", -48);
    }
}
