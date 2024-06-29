import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class356 {

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Ll;")
    public static class66 field5663 = new class66(64);

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Lto;")
    public static class118 field5665 = new class118();

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lfk;")
    public static class317 field5668 = new class317();

    @OriginalMember(owner = "client!t", name = "o", descriptor = "[[I")
    public static int[][] field5673 = new int[5][5000];

    @OriginalMember(owner = "client!t", name = "k", descriptor = "[J")
    public static long[] field5669 = new long[500];

    @OriginalMember(owner = "client!t", name = "l", descriptor = "[S")
    public static short[] field5670 = new short[500];

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Lrg;")
    public static class342 field5672 = null;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public int field5662;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public int field5664;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public int field5666;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public int field5667;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Lrn;")
    public static class18 field5674;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Lqk;")
    public static class70 field5675;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lqo;Z)V", line = 8)
    public static final void method2499(class329 arg0, boolean arg1) {
        class202.field3120.method2245(arg0, 93);
        while (true) {
            class329 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class329[][] var7;
            class329 var120;
            do {
                class329 var119;
                do {
                    class329 var118;
                    do {
                        class329 var117;
                        do {
                            do {
                                do {
                                    float var8;
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class329) class202.field3120.method2242((byte) 106);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field5079);
                                            var3 = var2.field5060;
                                            var4 = var2.field5051;
                                            var5 = var2.field5067;
                                            var6 = var2.field5056;
                                            var7 = class170.field2689[var5];
                                            var8 = 0.0F;
                                            if (class240.field3737) {
                                                if (class93.field1425 == class277.field4290) {
                                                    int var9 = class332.field5096[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class286.field4434 != var10) {
                                                        class286.field4434 = var10;
                                                        class74.method693(var10, false);
                                                        class103.method891(class109.method951(-1));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class187.field2940 != var11) {
                                                        class187.field2940 = var11;
                                                        class158.method1281(var11, 3);
                                                    }
                                                    int var12 = class121.field1924[0][var3 + 1][var4] + class121.field1924[0][var3][var4] + class121.field1924[0][var3][var4 + 1] + class121.field1924[0][var3 + 1][var4 + 1] >> 2;
                                                    class211.method1562(-var12, 3, -76);
                                                    var8 = 201.5F;
                                                    class240.method1784(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class240.method1784(var8);
                                                }
                                            }
                                            if (!var2.field5076) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class329 var13 = class170.field2689[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field5079) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class4.field46 && var3 > class79.field1147) {
                                                    class329 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field5079 && (var14.field5076 || (var2.field5053 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class4.field46 && var3 < class120.field1857 - 1) {
                                                    class329 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field5079 && (var15.field5076 || (var2.field5053 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class192.field3033 && var4 > class185.field2896) {
                                                    class329 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field5079 && (var16.field5076 || (var2.field5053 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class192.field3033 && var4 < class33.field512 - 1) {
                                                    class329 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field5079 && (var17.field5076 || (var2.field5053 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field5076 = false;
                                            if (var2.field5068 != null) {
                                                class329 var18 = var2.field5068;
                                                if (class240.field3737) {
                                                    class240.method1784(201.5F - (float) (var18.field5056 + 1) * 50.0F);
                                                }
                                                if (var18.field5049 == null) {
                                                    if (var18.field5072 != null) {
                                                        if (class62.method625(0, var3, var4)) {
                                                            class41.method423(var18.field5072, class270.field4175, field5671, class13.field161, class195.field3066, var3, var4, true);
                                                        } else {
                                                            class41.method423(var18.field5072, class270.field4175, field5671, class13.field161, class195.field3066, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class62.method625(0, var3, var4)) {
                                                    class318.method2250(var18.field5049, 0, class270.field4175, field5671, class13.field161, class195.field3066, var3, var4, true);
                                                } else {
                                                    class318.method2250(var18.field5049, 0, class270.field4175, field5671, class13.field161, class195.field3066, var3, var4, false);
                                                }
                                                class202 var19 = var18.field5064;
                                                if (var19 != null) {
                                                    if (class240.field3737) {
                                                        if ((var19.field3110 & var2.field5048) == 0) {
                                                            class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                                                        } else {
                                                            class299.method2158(var19.field3110, class205.field3165, class215.field3371, class190.field2977, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field3121.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var19.field3117 - class205.field3165, var19.field3126 - class215.field3371, var19.field3128 - class190.field2977, var19.field3111, var5, (class273) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field5063; var20++) {
                                                    class297 var21 = var18.field5070[var20];
                                                    if (var21 != null) {
                                                        if (class240.field3737) {
                                                            class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                                                        }
                                                        var21.field4605.method27(var21.field4600, class270.field4175, field5671, class13.field161, class195.field3066, var21.field4609 - class205.field3165, var21.field4615 - class215.field3371, var21.field4604 - class190.field2977, var21.field4611, var5, (class273) null);
                                                    }
                                                }
                                                if (class240.field3737) {
                                                    class240.method1784(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field5049 == null) {
                                                if (var2.field5072 != null) {
                                                    if (class62.method625(var6, var3, var4)) {
                                                        class41.method423(var2.field5072, class270.field4175, field5671, class13.field161, class195.field3066, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class41.method423(var2.field5072, class270.field4175, field5671, class13.field161, class195.field3066, var3, var4, false);
                                                    }
                                                }
                                            } else if (class62.method625(var6, var3, var4)) {
                                                class318.method2250(var2.field5049, var6, class270.field4175, field5671, class13.field161, class195.field3066, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field5049.field5532 != 12345678 || class197.field3081 && var5 <= class207.field3190) {
                                                    class318.method2250(var2.field5049, var6, class270.field4175, field5671, class13.field161, class195.field3066, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class44 var23 = var2.field5062;
                                                if (var23 != null && (var23.field701 & 0x80000000L) != 0L) {
                                                    if (class240.field3737 && var23.field713) {
                                                        class240.method1784(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class240.field3737) {
                                                        class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                                                    }
                                                    var23.field714.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var23.field709 - class205.field3165, var23.field705 - class215.field3371, var23.field708 - class190.field2977, var23.field701, var5, (class273) null);
                                                    if (class240.field3737 && var23.field713) {
                                                        class240.method1784(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class202 var26 = var2.field5064;
                                            class280 var27 = var2.field5065;
                                            if (var26 != null || var27 != null) {
                                                if (class4.field46 == var3) {
                                                    var24++;
                                                } else if (class4.field46 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class192.field3033 == var4) {
                                                    var24 += 3;
                                                } else if (class192.field3033 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class260.field3985[var24];
                                                var2.field5048 = class157.field2520[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field3110 & class68.field1052[var24]) == 0) {
                                                    var2.field5055 = 0;
                                                } else if (var26.field3110 == 16) {
                                                    var2.field5055 = 3;
                                                    var2.field5069 = class6.field92[var24];
                                                    var2.field5066 = 3 - var2.field5069;
                                                } else if (var26.field3110 == 32) {
                                                    var2.field5055 = 6;
                                                    var2.field5069 = class151.field2460[var24];
                                                    var2.field5066 = 6 - var2.field5069;
                                                } else if (var26.field3110 == 64) {
                                                    var2.field5055 = 12;
                                                    var2.field5069 = class121.field1920[var24];
                                                    var2.field5066 = 12 - var2.field5069;
                                                } else {
                                                    var2.field5055 = 9;
                                                    var2.field5069 = class279.field4303[var24];
                                                    var2.field5066 = 9 - var2.field5069;
                                                }
                                                if ((var26.field3110 & var25) != 0 && !class64.method632(var6, var3, var4, var26.field3110)) {
                                                    if (class240.field3737) {
                                                        class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                                                    }
                                                    var26.field3121.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var26.field3117 - class205.field3165, var26.field3126 - class215.field3371, var26.field3128 - class190.field2977, var26.field3111, var5, (class273) null);
                                                }
                                                if ((var26.field3124 & var25) != 0 && !class64.method632(var6, var3, var4, var26.field3124)) {
                                                    if (class240.field3737) {
                                                        class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                                                    }
                                                    var26.field3116.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var26.field3117 - class205.field3165, var26.field3126 - class215.field3371, var26.field3128 - class190.field2977, var26.field3111, var5, (class273) null);
                                                }
                                            }
                                            if (var27 != null && !class10.method102(var6, var3, var4, var27.field4319.method21())) {
                                                if (class240.field3737) {
                                                    class240.method1784(var8 - 0.5F);
                                                }
                                                if ((var27.field4323 & var25) != 0) {
                                                    if (class240.field3737) {
                                                        class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                                                    }
                                                    var27.field4319.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var27.field4320 + var27.field4328 - class205.field3165, var27.field4327 - class215.field3371, var27.field4329 + var27.field4318 - class190.field2977, var27.field4325, var5, (class273) null);
                                                } else if (var27.field4323 == 256) {
                                                    int var28 = var27.field4320 - class205.field3165;
                                                    int var29 = var27.field4327 - class215.field3371;
                                                    int var30 = var27.field4329 - class190.field2977;
                                                    int var31 = var27.field4326;
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
                                                        if (class240.field3737) {
                                                            class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                                                        }
                                                        var27.field4319.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var27.field4328 + var28, var29, var27.field4318 + var30, var27.field4325, var5, (class273) null);
                                                    } else if (var27.field4317 != null) {
                                                        if (class240.field3737) {
                                                            class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                                                        }
                                                        var27.field4317.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var28, var29, var30, var27.field4325, var5, (class273) null);
                                                    }
                                                }
                                                if (class240.field3737) {
                                                    class240.method1784(var8);
                                                }
                                            }
                                            if (var22) {
                                                class44 var34 = var2.field5062;
                                                if (var34 != null && (var34.field701 & 0x80000000L) == 0L) {
                                                    if (class240.field3737 && var34.field713) {
                                                        class240.method1784(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class240.field3737) {
                                                        class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                                                    }
                                                    var34.field714.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var34.field709 - class205.field3165, var34.field705 - class215.field3371, var34.field708 - class190.field2977, var34.field701, var5, (class273) null);
                                                    if (class240.field3737 && var34.field713) {
                                                        class240.method1784(var8);
                                                    }
                                                }
                                                class98 var35 = var2.field5047;
                                                if (var35 != null && var35.field1479 == 0) {
                                                    if (class240.field3737) {
                                                        class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                                                    }
                                                    if (var35.field1481 != null) {
                                                        var35.field1481.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var35.field1472 - class205.field3165, var35.field1475 - class215.field3371, var35.field1478 - class190.field2977, var35.field1484, var5, (class273) null);
                                                    }
                                                    if (var35.field1480 != null) {
                                                        var35.field1480.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var35.field1472 - class205.field3165, var35.field1475 - class215.field3371, var35.field1478 - class190.field2977, var35.field1484, var5, (class273) null);
                                                    }
                                                    if (var35.field1474 != null) {
                                                        var35.field1474.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var35.field1472 - class205.field3165, var35.field1475 - class215.field3371, var35.field1478 - class190.field2977, var35.field1484, var5, (class273) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field5053;
                                            if (var36 != 0) {
                                                if (var3 < class4.field46 && (var36 & 0x4) != 0) {
                                                    class329 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field5079) {
                                                        class202.field3120.method2245(var37, 117);
                                                    }
                                                }
                                                if (var4 < class192.field3033 && (var36 & 0x2) != 0) {
                                                    class329 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field5079) {
                                                        class202.field3120.method2245(var38, 123);
                                                    }
                                                }
                                                if (var3 > class4.field46 && (var36 & 0x1) != 0) {
                                                    class329 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field5079) {
                                                        class202.field3120.method2245(var39, 65);
                                                    }
                                                }
                                                if (var4 > class192.field3033 && (var36 & 0x8) != 0) {
                                                    class329 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field5079) {
                                                        class202.field3120.method2245(var40, 120);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field5055 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field5063; var42++) {
                                                if (class105.field1577 != var2.field5070[var42].field4620 && (var2.field5077[var42] & var2.field5055) == var2.field5069) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class202 var43 = var2.field5064;
                                                if (!class64.method632(var6, var3, var4, var43.field3110)) {
                                                    if (class240.field3737) {
                                                        label1037: {
                                                            if ((var43.field3111 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field3117 - class205.field3165;
                                                                int var45 = var43.field3128 - class190.field2977;
                                                                int var46 = (int) (var43.field3111 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class166.field2642 - 1) {
                                                                        class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3 - 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class154.field2492 - 1 && var4 < class166.field2642 - 1) {
                                                                        class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3 + 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class154.field2492 - 1 && var4 > 0) {
                                                                        class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3 + 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3 - 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                }
                                                            }
                                                            class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field3121.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var43.field3117 - class205.field3165, var43.field3126 - class215.field3371, var43.field3128 - class190.field2977, var43.field3111, var5, (class273) null);
                                                }
                                                var2.field5055 = 0;
                                            }
                                        }
                                        if (!var2.field5054) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field5063;
                                            var2.field5054 = false;
                                            int var48 = 0;
                                            label844: for (int var49 = 0; var49 < var47; var49++) {
                                                class297 var50 = var2.field5070[var49];
                                                if (class105.field1577 != var50.field4620) {
                                                    for (int var51 = var50.field4616; var51 <= var50.field4606; var51++) {
                                                        for (int var52 = var50.field4614; var52 <= var50.field4612; var52++) {
                                                            class329 var53 = var7[var51][var52];
                                                            if (var53.field5076) {
                                                                var2.field5054 = true;
                                                                continue label844;
                                                            }
                                                            if (var53.field5055 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field4616) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field4606) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field4614) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field4612) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field5055) == var2.field5066) {
                                                                    var2.field5054 = true;
                                                                    continue label844;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class203.field3146[var48++] = var50;
                                                    int var55 = class4.field46 - var50.field4616;
                                                    int var56 = var50.field4606 - class4.field46;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class192.field3033 - var50.field4614;
                                                    int var58 = var50.field4612 - class192.field3033;
                                                    if (var58 > var57) {
                                                        var50.field4603 = var55 + var58;
                                                    } else {
                                                        var50.field4603 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class297 var62 = class203.field3146[var61];
                                                    if (class105.field1577 != var62.field4620) {
                                                        if (var62.field4603 > var59) {
                                                            var59 = var62.field4603;
                                                            var60 = var61;
                                                        } else if (var62.field4603 == var59) {
                                                            int var63 = var62.field4609 - class205.field3165;
                                                            int var64 = var62.field4604 - class190.field2977;
                                                            int var65 = class203.field3146[var60].field4609 - class205.field3165;
                                                            int var66 = class203.field3146[var60].field4604 - class190.field2977;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class297 var67 = class203.field3146[var60];
                                                var67.field4620 = class105.field1577;
                                                if (!class233.method1743(var6, var67.field4616, var67.field4606, var67.field4614, var67.field4612, var67.field4605.method21())) {
                                                    if (class240.field3737) {
                                                        if ((var67.field4611 & 0xFC000L) == 147456L) {
                                                            class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                                                            int var68 = var67.field4609 - class205.field3165;
                                                            int var69 = var67.field4604 - class190.field2977;
                                                            int var70 = (int) (var67.field4611 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class299.method2149(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class299.method2149(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class299.method2149(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class299.method2149(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class299.method2152(class205.field3165, class215.field3371, class190.field2977, var5, var67.field4616, var67.field4614, var67.field4606, var67.field4612);
                                                        }
                                                    }
                                                    var67.field4605.method27(var67.field4600, class270.field4175, field5671, class13.field161, class195.field3066, var67.field4609 - class205.field3165, var67.field4615 - class215.field3371, var67.field4604 - class190.field2977, var67.field4611, var5, (class273) null);
                                                }
                                                for (int var71 = var67.field4616; var71 <= var67.field4606; var71++) {
                                                    for (int var72 = var67.field4614; var72 <= var67.field4612; var72++) {
                                                        class329 var73 = var7[var71][var72];
                                                        if (var73.field5055 != 0) {
                                                            class202.field3120.method2245(var73, 93);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field5079) {
                                                            class202.field3120.method2245(var73, 120);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field5054) {
                                                break;
                                            }
                                        } catch (Exception var135) {
                                            var2.field5054 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field5061 != null) {
                                        if (class240.field3737) {
                                            GL var75 = class240.field3771;
                                            class240.method1784(var8);
                                            class273.method2008(class205.field3165, class215.field3371, class190.field2977);
                                            int var76 = var2.field5060 * 128 + 64 - class205.field3165;
                                            int var77 = class277.field4290[var5][var2.field5060][var2.field5051] - class215.field3371;
                                            int var78 = var2.field5051 * 128 + 64 - class190.field2977;
                                            int var79;
                                            if (var5 < 3) {
                                                var79 = class277.field4290[var5][var2.field5060][var2.field5051] - class277.field4290[var5 + 1][var2.field5060][var2.field5051];
                                            } else {
                                                var79 = 1024;
                                            }
                                            int var80 = class195.field3066 * var78 - class13.field161 * var76 >> 16;
                                            int var81 = field5671 * var80 + class270.field4175 * var77 >> 16;
                                            int var82 = (field5671 * 91 + class270.field4175 * 0 >> 16) + var81;
                                            int var83 = (field5671 * -91 - class270.field4175 * var79 >> 16) + var81;
                                            if (var83 < var82 - 1597) {
                                                var83 = var82 - 1597;
                                            }
                                            int var84 = var82 + 2 - var83;
                                            class137 var85 = null;
                                            class270 var86 = null;
                                            int var87 = -1;
                                            class137 var88 = (class137) var2.field5061.method347(0);
                                            while (true) {
                                                label1054: {
                                                    if (var88 != null) {
                                                        if (var88.field2276 == null || var88.field2276.field4171.field4205) {
                                                            var88.method1340(54);
                                                            break label1054;
                                                        }
                                                        if ((byte) ((int) (var88.field2276.field4171.field4208 & 0xFFL)) != var2.field5078) {
                                                            var2.field5061 = null;
                                                            break;
                                                        }
                                                        if (var85 == null) {
                                                            var85 = var88;
                                                            var86 = var88.field2276;
                                                            var87 = var86.field4166.field1888;
                                                            break label1054;
                                                        }
                                                    }
                                                    if (var85 != null && (var88 == null || var88.field2276 != var86 || var88.field2276.field4166.field1888 != var87)) {
                                                        for (int var89 = 0; var89 < var84; var89++) {
                                                            class273.field4222[var89] = 0;
                                                        }
                                                        for (int var90 = 0; var90 < 32; var90++) {
                                                            class273.field4230[var90] = 0;
                                                        }
                                                        class273.field4220 = 0;
                                                        for (class137 var91 = var85; var91 != var88; var91 = (class137) var91.field1200) {
                                                            if (var91.field2276 != null) {
                                                                int var92 = (var91.field2279 >> 12) - class205.field3165;
                                                                int var93 = (var91.field2274 >> 12) - class215.field3371;
                                                                int var94 = (var91.field2269 >> 12) - class190.field2977;
                                                                int var95 = class195.field3066 * var94 - class13.field161 * var92 >> 16;
                                                                int var96 = (field5671 * var95 + class270.field4175 * var93 >> 16) - var83;
                                                                if (class273.field4222[var96] < 32) {
                                                                    class273.field4219[var96][class273.field4222[var96]++] = var91.field2267;
                                                                } else {
                                                                    if (class273.field4222[var96] == 32) {
                                                                        if (class273.field4220 == 32) {
                                                                            if (class273.field4217) {
                                                                                System.out.println("Overflowed world-based radix sort");
                                                                            }
                                                                            break;
                                                                        }
                                                                        class273.field4222[var96] += class273.field4220++ + 1;
                                                                    }
                                                                    int var97 = class273.field4230[class273.field4222[var96] - 32 - 1];
                                                                    if (var97 < 768) {
                                                                        short[] var10000 = class273.field4226[class273.field4222[var96] - 32 - 1];
                                                                        int var10002 = class273.field4222[var96] - 32 - 1;
                                                                        int var10004 = class273.field4230[class273.field4222[var96] - 32 - 1];
                                                                        class273.field4230[var10002] = class273.field4230[class273.field4222[var96] - 32 - 1] + 1;
                                                                        var10000[var10004] = var91.field2267;
                                                                    }
                                                                }
                                                            }
                                                            if (var2.field5061.field499 == var91.field1200) {
                                                                break;
                                                            }
                                                        }
                                                        boolean var98 = false;
                                                        if (class273.field4207 && var86.field4166.field1910 != -1) {
                                                            class107.field1619.method756(var86.field4166.field1910, true);
                                                            var98 = true;
                                                        } else {
                                                            class240.method1786(-1);
                                                        }
                                                        float var99 = (float) var87 * class273.field4243;
                                                        if (var99 > 64.0F) {
                                                            var99 = 64.0F;
                                                        }
                                                        var75.glPointSize(var99);
                                                        var86.field4171.method1996(var75, var84, var98, var86.field4166.field1901);
                                                        if (var88 != null) {
                                                            var85 = var88;
                                                            var86 = var88.field2276;
                                                            var87 = var88.field2276.field4166.field1888;
                                                        }
                                                    }
                                                    if (var88 == null) {
                                                        break;
                                                    }
                                                }
                                                var88 = (class137) var2.field5061.method345(-1);
                                            }
                                            class273.method2004();
                                        } else {
                                            int var100 = class273.field4212 + class107.field1617;
                                            int var101 = class273.field4209 + class107.field1614;
                                            class83 var102 = var2.field5061.field499;
                                            for (class83 var103 = var102.field1200; var103 != var102; var103 = var103.field1200) {
                                                class137 var104 = (class137) var103;
                                                if (var104.field2276 != null && !var104.field2276.field4171.field4205) {
                                                    if ((byte) ((int) (var104.field2276.field4171.field4208 & 0xFFL)) != var2.field5078) {
                                                        var2.field5061 = null;
                                                        break;
                                                    }
                                                    int var105 = (var104.field2279 >> 12) - class205.field3165;
                                                    int var106 = (var104.field2274 >> 12) - class215.field3371;
                                                    int var107 = (var104.field2269 >> 12) - class190.field2977;
                                                    int var108 = class195.field3066 * var105 + class13.field161 * var107 >> 16;
                                                    int var109 = class195.field3066 * var107 - class13.field161 * var105 >> 16;
                                                    int var111 = field5671 * var106 - class270.field4175 * var109 >> 16;
                                                    int var112 = field5671 * var109 + class270.field4175 * var106 >> 16;
                                                    if (var112 >= 50) {
                                                        int var114 = (var108 << 9) / var112 + var100;
                                                        int var115 = (var111 << 9) / var112 + var101;
                                                        int var116 = var112 * 400;
                                                        if (var116 == 0) {
                                                            var116 = 1;
                                                        }
                                                        class60.method599(var114, var115, (var104.field2276.field4166.field1888 << 16) / var116, var104.field2280, var104.field2280 >> 24 & 0xFF);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field5079);
                            } while (var2.field5055 != 0);
                            if (var3 > class4.field46 || var3 <= class79.field1147) {
                                break;
                            }
                            var117 = var7[var3 - 1][var4];
                        } while (var117 != null && var117.field5079);
                        if (var3 < class4.field46 || var3 >= class120.field1857 - 1) {
                            break;
                        }
                        var118 = var7[var3 + 1][var4];
                    } while (var118 != null && var118.field5079);
                    if (var4 > class192.field3033 || var4 <= class185.field2896) {
                        break;
                    }
                    var119 = var7[var3][var4 - 1];
                } while (var119 != null && var119.field5079);
                if (var4 < class192.field3033 || var4 >= class33.field512 - 1) {
                    break;
                }
                var120 = var7[var3][var4 + 1];
            } while (var120 != null && var120.field5079);
            var2.field5079 = false;
            class193.field3045--;
            class98 var121 = var2.field5047;
            if (var121 != null && var121.field1479 != 0) {
                if (class240.field3737) {
                    class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                }
                if (var121.field1481 != null) {
                    var121.field1481.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var121.field1472 - class205.field3165, var121.field1475 - class215.field3371 - var121.field1479, var121.field1478 - class190.field2977, var121.field1484, var5, (class273) null);
                }
                if (var121.field1480 != null) {
                    var121.field1480.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var121.field1472 - class205.field3165, var121.field1475 - class215.field3371 - var121.field1479, var121.field1478 - class190.field2977, var121.field1484, var5, (class273) null);
                }
                if (var121.field1474 != null) {
                    var121.field1474.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var121.field1472 - class205.field3165, var121.field1475 - class215.field3371 - var121.field1479, var121.field1478 - class190.field2977, var121.field1484, var5, (class273) null);
                }
            }
            if (var2.field5048 != 0) {
                class280 var122 = var2.field5065;
                if (var122 != null && !class10.method102(var6, var3, var4, var122.field4319.method21())) {
                    if ((var122.field4323 & var2.field5048) != 0) {
                        if (class240.field3737) {
                            class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                        }
                        var122.field4319.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var122.field4320 + var122.field4328 - class205.field3165, var122.field4327 - class215.field3371, var122.field4329 + var122.field4318 - class190.field2977, var122.field4325, var5, (class273) null);
                    } else if (var122.field4323 == 256) {
                        int var123 = var122.field4320 - class205.field3165;
                        int var124 = var122.field4327 - class215.field3371;
                        int var125 = var122.field4329 - class190.field2977;
                        int var126 = var122.field4326;
                        int var127;
                        if (var126 == 1 || var126 == 2) {
                            var127 = -var123;
                        } else {
                            var127 = var123;
                        }
                        int var128;
                        if (var126 == 2 || var126 == 3) {
                            var128 = -var125;
                        } else {
                            var128 = var125;
                        }
                        if (var128 >= var127) {
                            if (class240.field3737) {
                                class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                            }
                            var122.field4319.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var122.field4328 + var123, var124, var122.field4318 + var125, var122.field4325, var5, (class273) null);
                        } else if (var122.field4317 != null) {
                            if (class240.field3737) {
                                class299.method2157(class205.field3165, class215.field3371, class190.field2977, var5, var3, var4);
                            }
                            var122.field4317.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var123, var124, var125, var122.field4325, var5, (class273) null);
                        }
                    }
                }
                class202 var129 = var2.field5064;
                if (var129 != null) {
                    if ((var129.field3124 & var2.field5048) != 0 && !class64.method632(var6, var3, var4, var129.field3124)) {
                        if (class240.field3737) {
                            class299.method2158(var129.field3124, class205.field3165, class215.field3371, class190.field2977, var6, var3, var4);
                        }
                        var129.field3116.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var129.field3117 - class205.field3165, var129.field3126 - class215.field3371, var129.field3128 - class190.field2977, var129.field3111, var5, (class273) null);
                    }
                    if ((var129.field3110 & var2.field5048) != 0 && !class64.method632(var6, var3, var4, var129.field3110)) {
                        if (class240.field3737) {
                            class299.method2158(var129.field3110, class205.field3165, class215.field3371, class190.field2977, var6, var3, var4);
                        }
                        var129.field3121.method27(0, class270.field4175, field5671, class13.field161, class195.field3066, var129.field3117 - class205.field3165, var129.field3126 - class215.field3371, var129.field3128 - class190.field2977, var129.field3111, var5, (class273) null);
                    }
                }
            }
            if (var5 < class335.field5119 - 1) {
                class329 var130 = class170.field2689[var5 + 1][var3][var4];
                if (var130 != null && var130.field5079) {
                    class202.field3120.method2245(var130, 71);
                }
            }
            if (var3 < class4.field46) {
                class329 var131 = var7[var3 + 1][var4];
                if (var131 != null && var131.field5079) {
                    class202.field3120.method2245(var131, 69);
                }
            }
            if (var4 < class192.field3033) {
                class329 var132 = var7[var3][var4 + 1];
                if (var132 != null && var132.field5079) {
                    class202.field3120.method2245(var132, 62);
                }
            }
            if (var3 > class4.field46) {
                class329 var133 = var7[var3 - 1][var4];
                if (var133 != null && var133.field5079) {
                    class202.field3120.method2245(var133, 52);
                }
            }
            if (var4 > class192.field3033) {
                class329 var134 = var7[var3][var4 - 1];
                if (var134 != null && var134.field5079) {
                    class202.field3120.method2245(var134, 92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V", line = 1227)
    public static final void method2500(boolean arg0) {
        class223 var1 = class236.field3674;
        synchronized (class236.field3674) {
            class210.field3242 = class53.field803;
            class214.field3346++;
            if (arg0) {
                method2502(-104);
            }
            class268.field4137 = class194.field3050;
            class78.field1129 = class13.field202;
            class86.field1230 = class359.field5701;
            class305.field4745 = class112.field1723;
            class254.field3916 = class194.field3047;
            class157.field2522 = class320.field4931;
            class359.field5701 = 0;
        }
        field5659++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIZ)V", line = 1256)
    public static final void method2501(int arg0, int arg1, int arg2, boolean arg3) {
        field5661++;
        class138 var4 = class149.method1242(arg0, 0, 9);
        if (arg3) {
            var4.method1153((byte) 50);
            var4.field2293 = arg2;
            var4.field2282 = arg1;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 1279)
    public static void method2502(int arg0) {
        field5673 = (int[][]) null;
        field5674 = null;
        if (arg0 != 12) {
            field5663 = (class66) null;
        }
        field5665 = null;
        field5672 = null;
        field5668 = null;
        field5670 = null;
        field5675 = null;
        field5669 = null;
        field5663 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lud;B)V", line = 1298)
    public static final void method2503(class91 arg0, byte arg1) {
        field5660++;
        if (arg1 <= 95) {
            method2502(-40);
        }
        class109 var2 = arg0.method813((byte) 109);
        arg0.field1350 = var2.field1663;
        if (arg0.field1321 == 0) {
            arg0.field1341 = 0;
            return;
        }
        if (arg0.field1343 != -1 && arg0.field1302 == 0) {
            class93 var3 = class126.method1091((byte) 27, arg0.field1343);
            if (arg0.field1294 > 0 && var3.field1422 == 0) {
                arg0.field1341++;
                return;
            }
            if (arg0.field1294 <= 0 && var3.field1432 == 0) {
                arg0.field1341++;
                return;
            }
        }
        if (arg0.field1297 != -1 && class360.field5718 >= arg0.field1330) {
            class281 var4 = class292.method2110(arg0.field1297, (byte) 15);
            if (var4.field4351 && var4.field4343 != -1) {
                class93 var5 = class126.method1091((byte) 51, var4.field4343);
                if (arg0.field1294 > 0 && var5.field1422 == 0) {
                    arg0.field1341++;
                    return;
                }
                if (arg0.field1294 <= 0 && var5.field1432 == 0) {
                    arg0.field1341++;
                    return;
                }
            }
        }
        int var6 = arg0.field1359;
        int var7 = arg0.field1286;
        int var8 = arg0.field1300[arg0.field1321 - 1] * 128 + arg0.method808(115) * 64;
        int var9 = arg0.field1290[arg0.field1321 - 1] * 128 + (arg0.method808(5) * 64);
        if (var8 - var6 > 256 || var8 - var6 < -256 || var9 - var7 > 256 || var9 - var7 < -256) {
            arg0.field1286 = var9;
            arg0.field1359 = var8;
            return;
        }
        if (var8 <= var6) {
            if (var8 >= var6) {
                if (var9 > var7) {
                    arg0.field1289 = 1024;
                } else if (var9 < var7) {
                    arg0.field1289 = 0;
                }
            } else if (var7 < var9) {
                arg0.field1289 = 768;
            } else if (var9 < var7) {
                arg0.field1289 = 256;
            } else {
                arg0.field1289 = 512;
            }
        } else if (var7 < var9) {
            arg0.field1289 = 1280;
        } else if (var9 >= var7) {
            arg0.field1289 = 1536;
        } else {
            arg0.field1289 = 1792;
        }
        int var10 = arg0.field1289 - arg0.field1320 & 0x7FF;
        int var11 = var2.field1658;
        int var12 = 4;
        boolean var13 = true;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (var10 >= -256 && var10 <= 256) {
            var11 = var2.field1646;
        } else if (var10 >= 256 && var10 < 768) {
            var11 = var2.field1667;
        } else if (var10 >= -768 && var10 <= -256) {
            var11 = var2.field1637;
        }
        if (var11 == -1) {
            var11 = var2.field1646;
        }
        byte var14 = 1;
        arg0.field1350 = var11;
        if (arg0 instanceof class244) {
            var13 = ((class244) arg0).field3802.field2183;
        }
        if (var13) {
            if (arg0.field1320 != arg0.field1289 && arg0.field1364 == -1 && arg0.field1288 != 0) {
                var12 = 2;
            }
            if (arg0.field1321 > 2) {
                var12 = 6;
            }
            if (arg0.field1321 > 3) {
                var12 = 8;
            }
            if (arg0.field1341 > 0 && arg0.field1321 > 1) {
                var12 = 8;
                arg0.field1341--;
            }
        } else {
            if (arg0.field1321 > 1) {
                var12 = 6;
            }
            if (arg0.field1321 > 2) {
                var12 = 8;
            }
            if (arg0.field1341 > 0 && arg0.field1321 > 1) {
                arg0.field1341--;
                var12 = 8;
            }
        }
        if (arg0.field1375[arg0.field1321 - 1] == 2) {
            var14 = 2;
            var12 <<= 0x1;
        } else if (arg0.field1375[arg0.field1321 - 1] == 0) {
            var12 >>= 0x1;
            var14 = 0;
        }
        if (var12 < 8 || var2.field1673 == -1) {
            if (var2.field1666 != -1 && var14 == 0) {
                if (arg0.field1350 == var2.field1658 && var2.field1634 != -1) {
                    arg0.field1350 = var2.field1634;
                } else if (arg0.field1350 == var2.field1637 && var2.field1649 != -1) {
                    arg0.field1350 = var2.field1649;
                } else if (arg0.field1350 == var2.field1667 && var2.field1656 != -1) {
                    arg0.field1350 = var2.field1656;
                } else {
                    arg0.field1350 = var2.field1666;
                }
            }
        } else if (arg0.field1350 == var2.field1658 && var2.field1660 != -1) {
            arg0.field1350 = var2.field1660;
        } else if (arg0.field1350 == var2.field1637 && var2.field1652 != -1) {
            arg0.field1350 = var2.field1652;
        } else if (arg0.field1350 == var2.field1667 && var2.field1635 != -1) {
            arg0.field1350 = var2.field1635;
        } else {
            arg0.field1350 = var2.field1673;
        }
        if (var2.field1640 != -1) {
            int var15 = var12 << 7;
            if (arg0.field1321 == 1) {
                int var16 = arg0.field1358 * arg0.field1358;
                int var17 = (var8 < arg0.field1359 ? arg0.field1359 - var8 : -arg0.field1359 + var8) << 7;
                int var18 = (var9 >= arg0.field1286 ? var9 - arg0.field1286 : -var9 + arg0.field1286) << 7;
                int var19 = var17 <= var18 ? var18 : var17;
                int var20 = var2.field1640 * var19 * 2;
                if (var16 > var20) {
                    arg0.field1358 /= 2;
                } else if ((var16 / 2) > var19) {
                    arg0.field1358 -= var2.field1640;
                    if (arg0.field1358 < 0) {
                        arg0.field1358 = 0;
                    }
                } else if (arg0.field1358 < var15) {
                    arg0.field1358 += var2.field1640;
                    if (arg0.field1358 > var15) {
                        arg0.field1358 = var15;
                    }
                }
            } else if (var15 > arg0.field1358) {
                arg0.field1358 += var2.field1640;
                if (var15 < arg0.field1358) {
                    arg0.field1358 = var15;
                }
            } else if (arg0.field1358 > 0) {
                arg0.field1358 -= var2.field1640;
                if (arg0.field1358 < 0) {
                    arg0.field1358 = 0;
                }
            }
            var12 = arg0.field1358 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var8 > var6) {
            arg0.field1359 += var12;
            if (arg0.field1359 > var8) {
                arg0.field1359 = var8;
            }
        } else if (var8 < var6) {
            arg0.field1359 -= var12;
            if (var8 > arg0.field1359) {
                arg0.field1359 = var8;
            }
        }
        if (var9 > var7) {
            arg0.field1286 += var12;
            if (var9 < arg0.field1286) {
                arg0.field1286 = var9;
            }
        } else if (var9 < var7) {
            arg0.field1286 -= var12;
            if (var9 > arg0.field1286) {
                arg0.field1286 = var9;
            }
        }
        if (arg0.field1359 == var8 && arg0.field1286 == var9) {
            if (arg0.field1294 > 0) {
                arg0.field1294--;
            }
            arg0.field1321--;
        }
    }
}
