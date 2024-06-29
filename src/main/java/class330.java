import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class330 extends class332 {

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "J")
    public static long field5036 = 0L;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field5039 = new String[200];

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Z")
    public static boolean field5043 = false;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field5046 = 0;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[I")
    public static int[] field5038 = new int[1000];

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field5037;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public int field5040;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public int field5041;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public int field5042;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public int field5047;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public int field5048;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public int field5049;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public int field5052;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public int field5054;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public int field5055;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public int field5056;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "[[B")
    public static byte[][] field5045;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ldk;Z)V", line = 4)
    public static final void method2277(class225 arg0, boolean arg1) {
        class142.field1980.method2325(arg0, (byte) 34);
        while (true) {
            class225 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class225[][] var7;
            class225 var78;
            do {
                class225 var77;
                do {
                    class225 var76;
                    do {
                        class225 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class225) class142.field1980.method2323((byte) -53);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3202);
                                            var3 = var2.field3204;
                                            var4 = var2.field3212;
                                            var5 = var2.field3200;
                                            var6 = var2.field3198;
                                            var7 = class158.field2184[var5];
                                            float var8 = 0.0F;
                                            if (class250.field3787) {
                                                if (class99.field1291 == class167.field2324) {
                                                    int var9 = class312.field4826[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class283.field4447 != var10) {
                                                        class283.field4447 = var10;
                                                        class258.method1867((byte) 124, var10);
                                                        class64.method405(class264.method1905((byte) 2));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class88.field1102 != var11) {
                                                        class88.field1102 = var11;
                                                        class323.method2248(var11, 3);
                                                    }
                                                    int var12 = class74.field957[0][var3 + 1][var4] + class74.field957[0][var3][var4] + class74.field957[0][var3][var4 + 1] + class74.field957[0][var3 + 1][var4 + 1] >> 2;
                                                    class262.method1886(3, 3, -var12);
                                                    var8 = 201.5F;
                                                    class250.method1814(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class250.method1814(var8);
                                                }
                                            }
                                            if (!var2.field3215) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class225 var13 = class158.field2184[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field3202) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class49.field610 && var3 > class222.field3136) {
                                                    class225 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field3202 && (var14.field3215 || (var2.field3217 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class49.field610 && var3 < class237.field3485 - 1) {
                                                    class225 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field3202 && (var15.field3215 || (var2.field3217 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class242.field3645 && var4 > class19.field256) {
                                                    class225 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field3202 && (var16.field3215 || (var2.field3217 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class242.field3645 && var4 < class228.field3278 - 1) {
                                                    class225 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field3202 && (var17.field3215 || (var2.field3217 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3215 = false;
                                            if (var2.field3205 != null) {
                                                class225 var18 = var2.field3205;
                                                if (class250.field3787) {
                                                    class250.method1814(201.5F - (float) (var18.field3198 + 1) * 50.0F);
                                                }
                                                if (var18.field3203 == null) {
                                                    if (var18.field3218 != null) {
                                                        if (class99.method600(0, var3, var4)) {
                                                            class93.method547(var18.field3218, class15.field217, class300.field4683, class127.field1736, class21.field272, var3, var4, true);
                                                        } else {
                                                            class93.method547(var18.field3218, class15.field217, class300.field4683, class127.field1736, class21.field272, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class99.method600(0, var3, var4)) {
                                                    class153.method1021(var18.field3203, 0, class15.field217, class300.field4683, class127.field1736, class21.field272, var3, var4, true);
                                                } else {
                                                    class153.method1021(var18.field3203, 0, class15.field217, class300.field4683, class127.field1736, class21.field272, var3, var4, false);
                                                }
                                                class168 var19 = var18.field3196;
                                                if (var19 != null) {
                                                    if (class250.field3787) {
                                                        if ((var19.field2333 & var2.field3197) == 0) {
                                                            class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                                                        } else {
                                                            class193.method1337(var19.field2333, field5053, class329.field5024, class165.field2287, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field2335.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var19.field2338 - field5053, var19.field2329 - class329.field5024, var19.field2330 - class165.field2287, var19.field2339, var5, (class274) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field3214; var20++) {
                                                    class80 var21 = var18.field3199[var20];
                                                    if (var21 != null) {
                                                        if (class250.field3787) {
                                                            class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                                                        }
                                                        var21.field1024.method8(var21.field1016, class15.field217, class300.field4683, class127.field1736, class21.field272, var21.field1030 - field5053, var21.field1033 - class329.field5024, var21.field1032 - class165.field2287, var21.field1026, var5, (class274) null);
                                                    }
                                                }
                                                if (class250.field3787) {
                                                    class250.method1814(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field3203 == null) {
                                                if (var2.field3218 != null) {
                                                    if (class99.method600(var6, var3, var4)) {
                                                        class93.method547(var2.field3218, class15.field217, class300.field4683, class127.field1736, class21.field272, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class93.method547(var2.field3218, class15.field217, class300.field4683, class127.field1736, class21.field272, var3, var4, false);
                                                    }
                                                }
                                            } else if (class99.method600(var6, var3, var4)) {
                                                class153.method1021(var2.field3203, var6, class15.field217, class300.field4683, class127.field1736, class21.field272, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field3203.field696 != 12345678 || class283.field4449 && var5 <= class238.field3512) {
                                                    class153.method1021(var2.field3203, var6, class15.field217, class300.field4683, class127.field1736, class21.field272, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class138 var23 = var2.field3209;
                                                if (var23 != null && (var23.field1937 & 0x80000000L) != 0L) {
                                                    if (class250.field3787 && var23.field1929) {
                                                        class250.method1814(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class250.field3787) {
                                                        class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                                                    }
                                                    var23.field1935.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var23.field1932 - field5053, var23.field1933 - class329.field5024, var23.field1927 - class165.field2287, var23.field1937, var5, (class274) null);
                                                    if (class250.field3787 && var23.field1929) {
                                                        class250.method1814(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class168 var26 = var2.field3196;
                                            class54 var27 = var2.field3213;
                                            if (var26 != null || var27 != null) {
                                                if (class49.field610 == var3) {
                                                    var24++;
                                                } else if (class49.field610 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class242.field3645 == var4) {
                                                    var24 += 3;
                                                } else if (class242.field3645 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class106.field1351[var24];
                                                var2.field3197 = class282.field4387[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field2333 & class23.field313[var24]) == 0) {
                                                    var2.field3207 = 0;
                                                } else if (var26.field2333 == 16) {
                                                    var2.field3207 = 3;
                                                    var2.field3208 = class40.field479[var24];
                                                    var2.field3216 = 3 - var2.field3208;
                                                } else if (var26.field2333 == 32) {
                                                    var2.field3207 = 6;
                                                    var2.field3208 = class133.field1838[var24];
                                                    var2.field3216 = 6 - var2.field3208;
                                                } else if (var26.field2333 == 64) {
                                                    var2.field3207 = 12;
                                                    var2.field3208 = class206.field2892[var24];
                                                    var2.field3216 = 12 - var2.field3208;
                                                } else {
                                                    var2.field3207 = 9;
                                                    var2.field3208 = class132.field1813[var24];
                                                    var2.field3216 = 9 - var2.field3208;
                                                }
                                                if ((var26.field2333 & var25) != 0 && !class208.method1433(var6, var3, var4, var26.field2333)) {
                                                    if (class250.field3787) {
                                                        class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                                                    }
                                                    var26.field2335.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var26.field2338 - field5053, var26.field2329 - class329.field5024, var26.field2330 - class165.field2287, var26.field2339, var5, (class274) null);
                                                }
                                                if ((var26.field2340 & var25) != 0 && !class208.method1433(var6, var3, var4, var26.field2340)) {
                                                    if (class250.field3787) {
                                                        class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                                                    }
                                                    var26.field2331.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var26.field2338 - field5053, var26.field2329 - class329.field5024, var26.field2330 - class165.field2287, var26.field2339, var5, (class274) null);
                                                }
                                            }
                                            if (var27 != null && !class185.method1288(var6, var3, var4, var27.field662.method11())) {
                                                if (class250.field3787) {
                                                    class250.method1814(var8 - 0.5F);
                                                }
                                                if ((var27.field667 & var25) != 0) {
                                                    if (class250.field3787) {
                                                        class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                                                    }
                                                    var27.field662.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var27.field665 + var27.field659 - field5053, var27.field654 - class329.field5024, var27.field655 + var27.field657 - class165.field2287, var27.field656, var5, (class274) null);
                                                } else if (var27.field667 == 256) {
                                                    int var28 = var27.field665 - field5053;
                                                    int var29 = var27.field654 - class329.field5024;
                                                    int var30 = var27.field655 - class165.field2287;
                                                    int var31 = var27.field666;
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
                                                        if (class250.field3787) {
                                                            class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                                                        }
                                                        var27.field662.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var27.field659 + var28, var29, var27.field657 + var30, var27.field656, var5, (class274) null);
                                                    } else if (var27.field669 != null) {
                                                        if (class250.field3787) {
                                                            class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                                                        }
                                                        var27.field669.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var28, var29, var30, var27.field656, var5, (class274) null);
                                                    }
                                                }
                                                if (class250.field3787) {
                                                    class250.method1814(var8);
                                                }
                                            }
                                            if (var22) {
                                                class138 var34 = var2.field3209;
                                                if (var34 != null && (var34.field1937 & 0x80000000L) == 0L) {
                                                    if (class250.field3787 && var34.field1929) {
                                                        class250.method1814(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class250.field3787) {
                                                        class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                                                    }
                                                    var34.field1935.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var34.field1932 - field5053, var34.field1933 - class329.field5024, var34.field1927 - class165.field2287, var34.field1937, var5, (class274) null);
                                                    if (class250.field3787 && var34.field1929) {
                                                        class250.method1814(var8);
                                                    }
                                                }
                                                class146 var35 = var2.field3206;
                                                if (var35 != null && var35.field2027 == 0) {
                                                    if (class250.field3787) {
                                                        class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                                                    }
                                                    if (var35.field2036 != null) {
                                                        var35.field2036.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var35.field2026 - field5053, var35.field2034 - class329.field5024, var35.field2032 - class165.field2287, var35.field2029, var5, (class274) null);
                                                    }
                                                    if (var35.field2024 != null) {
                                                        var35.field2024.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var35.field2026 - field5053, var35.field2034 - class329.field5024, var35.field2032 - class165.field2287, var35.field2029, var5, (class274) null);
                                                    }
                                                    if (var35.field2028 != null) {
                                                        var35.field2028.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var35.field2026 - field5053, var35.field2034 - class329.field5024, var35.field2032 - class165.field2287, var35.field2029, var5, (class274) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field3217;
                                            if (var36 != 0) {
                                                if (var3 < class49.field610 && (var36 & 0x4) != 0) {
                                                    class225 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field3202) {
                                                        class142.field1980.method2325(var37, (byte) 34);
                                                    }
                                                }
                                                if (var4 < class242.field3645 && (var36 & 0x2) != 0) {
                                                    class225 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field3202) {
                                                        class142.field1980.method2325(var38, (byte) 34);
                                                    }
                                                }
                                                if (var3 > class49.field610 && (var36 & 0x1) != 0) {
                                                    class225 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field3202) {
                                                        class142.field1980.method2325(var39, (byte) 34);
                                                    }
                                                }
                                                if (var4 > class242.field3645 && (var36 & 0x8) != 0) {
                                                    class225 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field3202) {
                                                        class142.field1980.method2325(var40, (byte) 34);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3207 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field3214; var42++) {
                                                if (class208.field2947 != var2.field3199[var42].field1022 && (var2.field3201[var42] & var2.field3207) == var2.field3208) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class168 var43 = var2.field3196;
                                                if (!class208.method1433(var6, var3, var4, var43.field2333)) {
                                                    if (class250.field3787) {
                                                        label882: {
                                                            if ((var43.field2339 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field2338 - field5053;
                                                                int var45 = var43.field2330 - class165.field2287;
                                                                int var46 = (int) (var43.field2339 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class326.field4993 - 1) {
                                                                        class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class62.field788 - 1 && var4 < class326.field4993 - 1) {
                                                                        class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class62.field788 - 1 && var4 > 0) {
                                                                        class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field2335.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var43.field2338 - field5053, var43.field2329 - class329.field5024, var43.field2330 - class165.field2287, var43.field2339, var5, (class274) null);
                                                }
                                                var2.field3207 = 0;
                                            }
                                        }
                                        if (!var2.field3211) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field3214;
                                            var2.field3211 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class80 var50 = var2.field3199[var49];
                                                if (class208.field2947 != var50.field1022) {
                                                    for (int var51 = var50.field1015; var51 <= var50.field1035; var51++) {
                                                        for (int var52 = var50.field1027; var52 <= var50.field1028; var52++) {
                                                            class225 var53 = var7[var51][var52];
                                                            if (var53.field3215) {
                                                                var2.field3211 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field3207 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field1015) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field1035) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field1027) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field1028) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field3207) == var2.field3216) {
                                                                    var2.field3211 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class57.field690[var48++] = var50;
                                                    int var55 = class49.field610 - var50.field1015;
                                                    int var56 = var50.field1035 - class49.field610;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class242.field3645 - var50.field1027;
                                                    int var58 = var50.field1028 - class242.field3645;
                                                    if (var58 > var57) {
                                                        var50.field1021 = var55 + var58;
                                                    } else {
                                                        var50.field1021 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class80 var62 = class57.field690[var61];
                                                    if (class208.field2947 != var62.field1022) {
                                                        if (var62.field1021 > var59) {
                                                            var59 = var62.field1021;
                                                            var60 = var61;
                                                        } else if (var62.field1021 == var59) {
                                                            int var63 = var62.field1030 - field5053;
                                                            int var64 = var62.field1032 - class165.field2287;
                                                            int var65 = class57.field690[var60].field1030 - field5053;
                                                            int var66 = class57.field690[var60].field1032 - class165.field2287;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class80 var67 = class57.field690[var60];
                                                var67.field1022 = class208.field2947;
                                                if (!class152.method1016(var6, var67.field1015, var67.field1035, var67.field1027, var67.field1028, var67.field1024.method11())) {
                                                    if (class250.field3787) {
                                                        if ((var67.field1026 & 0xFC000L) == 147456L) {
                                                            class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                                                            int var68 = var67.field1030 - field5053;
                                                            int var69 = var67.field1032 - class165.field2287;
                                                            int var70 = (int) (var67.field1026 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class193.method1333(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class193.method1333(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class193.method1333(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class193.method1333(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class193.method1342(field5053, class329.field5024, class165.field2287, var5, var67.field1015, var67.field1027, var67.field1035, var67.field1028);
                                                        }
                                                    }
                                                    var67.field1024.method8(var67.field1016, class15.field217, class300.field4683, class127.field1736, class21.field272, var67.field1030 - field5053, var67.field1033 - class329.field5024, var67.field1032 - class165.field2287, var67.field1026, var5, (class274) null);
                                                }
                                                for (int var71 = var67.field1015; var71 <= var67.field1035; var71++) {
                                                    for (int var72 = var67.field1027; var72 <= var67.field1028; var72++) {
                                                        class225 var73 = var7[var71][var72];
                                                        if (var73.field3207 != 0) {
                                                            class142.field1980.method2325(var73, (byte) 34);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field3202) {
                                                            class142.field1980.method2325(var73, (byte) 34);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3211) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field3211 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3202);
                            } while (var2.field3207 != 0);
                            if (var3 > class49.field610 || var3 <= class222.field3136) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field3202);
                        if (var3 < class49.field610 || var3 >= class237.field3485 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field3202);
                    if (var4 > class242.field3645 || var4 <= class19.field256) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field3202);
                if (var4 < class242.field3645 || var4 >= class228.field3278 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field3202);
            var2.field3202 = false;
            class115.field1636--;
            class146 var79 = var2.field3206;
            if (var79 != null && var79.field2027 != 0) {
                if (class250.field3787) {
                    class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                }
                if (var79.field2036 != null) {
                    var79.field2036.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var79.field2026 - field5053, var79.field2034 - class329.field5024 - var79.field2027, var79.field2032 - class165.field2287, var79.field2029, var5, (class274) null);
                }
                if (var79.field2024 != null) {
                    var79.field2024.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var79.field2026 - field5053, var79.field2034 - class329.field5024 - var79.field2027, var79.field2032 - class165.field2287, var79.field2029, var5, (class274) null);
                }
                if (var79.field2028 != null) {
                    var79.field2028.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var79.field2026 - field5053, var79.field2034 - class329.field5024 - var79.field2027, var79.field2032 - class165.field2287, var79.field2029, var5, (class274) null);
                }
            }
            if (var2.field3197 != 0) {
                class54 var80 = var2.field3213;
                if (var80 != null && !class185.method1288(var6, var3, var4, var80.field662.method11())) {
                    if ((var80.field667 & var2.field3197) != 0) {
                        if (class250.field3787) {
                            class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                        }
                        var80.field662.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var80.field665 + var80.field659 - field5053, var80.field654 - class329.field5024, var80.field655 + var80.field657 - class165.field2287, var80.field656, var5, (class274) null);
                    } else if (var80.field667 == 256) {
                        int var81 = var80.field665 - field5053;
                        int var82 = var80.field654 - class329.field5024;
                        int var83 = var80.field655 - class165.field2287;
                        int var84 = var80.field666;
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
                            if (class250.field3787) {
                                class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                            }
                            var80.field662.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var80.field659 + var81, var82, var80.field657 + var83, var80.field656, var5, (class274) null);
                        } else if (var80.field669 != null) {
                            if (class250.field3787) {
                                class193.method1335(field5053, class329.field5024, class165.field2287, var5, var3, var4);
                            }
                            var80.field669.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var81, var82, var83, var80.field656, var5, (class274) null);
                        }
                    }
                }
                class168 var87 = var2.field3196;
                if (var87 != null) {
                    if ((var87.field2340 & var2.field3197) != 0 && !class208.method1433(var6, var3, var4, var87.field2340)) {
                        if (class250.field3787) {
                            class193.method1337(var87.field2340, field5053, class329.field5024, class165.field2287, var6, var3, var4);
                        }
                        var87.field2331.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var87.field2338 - field5053, var87.field2329 - class329.field5024, var87.field2330 - class165.field2287, var87.field2339, var5, (class274) null);
                    }
                    if ((var87.field2333 & var2.field3197) != 0 && !class208.method1433(var6, var3, var4, var87.field2333)) {
                        if (class250.field3787) {
                            class193.method1337(var87.field2333, field5053, class329.field5024, class165.field2287, var6, var3, var4);
                        }
                        var87.field2335.method8(0, class15.field217, class300.field4683, class127.field1736, class21.field272, var87.field2338 - field5053, var87.field2329 - class329.field5024, var87.field2330 - class165.field2287, var87.field2339, var5, (class274) null);
                    }
                }
            }
            if (var5 < class90.field1128 - 1) {
                class225 var88 = class158.field2184[var5 + 1][var3][var4];
                if (var88 != null && var88.field3202) {
                    class142.field1980.method2325(var88, (byte) 34);
                }
            }
            if (var3 < class49.field610) {
                class225 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field3202) {
                    class142.field1980.method2325(var89, (byte) 34);
                }
            }
            if (var4 < class242.field3645) {
                class225 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field3202) {
                    class142.field1980.method2325(var90, (byte) 34);
                }
            }
            if (var3 > class49.field610) {
                class225 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field3202) {
                    class142.field1980.method2325(var91, (byte) 34);
                }
            }
            if (var4 > class242.field3645) {
                class225 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field3202) {
                    class142.field1980.method2325(var92, (byte) 34);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(SB)Z", line = 999)
    public static final boolean method2278(short arg0, byte arg1) {
        field5050++;
        if (arg1 <= 96) {
            return true;
        } else if (arg0 == 51 || arg0 == 19 || arg0 == 37 || arg0 == 14 || arg0 == 57 || arg0 == 3 || arg0 == 43 || arg0 == 35) {
            return true;
        } else if (arg0 == 49 || arg0 == 50 || arg0 == 1004 || arg0 == 1002) {
            return true;
        } else if (arg0 == 32 || arg0 == 11 || arg0 == 2 || arg0 == 60 || arg0 == 47) {
            return true;
        } else {
            return arg0 == 20 || arg0 == 18 || arg0 == 28 || arg0 == 13 || arg0 == 41 || arg0 == 6;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 1032)
    public static void method2279(byte arg0) {
        field5038 = null;
        field5045 = (byte[][]) null;
        if (arg0 < -80) {
            field5039 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)Lre;", line = 1045)
    public static final class292 method2280(int arg0) {
        field5044++;
        int var1 = -124 % ((29 - arg0) / 63);
        try {
            return (class292) Class.forName("pf").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return null;
        }
    }
}
