import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class319 extends class366 {

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "Z")
    public boolean field4669 = true;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "Lkn;")
    public static class442 field4666 = new class442();

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "C")
    private char field4672;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "F")
    public static float field4674;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    public int field4668;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "Ljava/lang/String;")
    public String field4667;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILlf;)V")
    private final void method2118(int arg0, int arg1, class130 arg2) {
        if (arg1 < 28) {
            this.method2123((class130) null, -89);
        }
        if (arg0 == 1) {
            this.field4672 = class171.method1223(3043, arg2.method823((byte) 109));
        } else if (arg0 == 2) {
            this.field4668 = arg2.method815(true);
        } else if (arg0 == 4) {
            this.field4669 = false;
        } else if (arg0 == 5) {
            this.field4667 = arg2.method843(-97);
        }
        field4671++;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Z")
    public final boolean method2119(int arg0) {
        field4678++;
        if (arg0 < 21) {
            method2120(96, 12, (class122) null, -73, 9);
        }
        return this.field4672 == 's';
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILqb;II)V")
    public static final void method2120(int arg0, int arg1, class122 arg2, int arg3, int arg4) {
        field4670++;
        long var5 = (long) (arg1 << 14 | arg4 << 28 | arg0);
        class413 var7 = (class413) class338.field4904.method1373(var5, -10);
        if (var7 == null) {
            class413 var8 = new class413();
            class338.field4904.method1376(var8, var5, 92);
            var8.field5907.method2756(95, arg2);
            return;
        }
        class409 var9 = class167.method1202(true, arg2.field1633);
        int var10 = var9.field5868;
        int var11 = 25 / ((arg3 - 55) / 44);
        if (var9.field5846 == 1) {
            var10 = (arg2.field1638 + 1) * var10;
        }
        for (class122 var12 = (class122) var7.field5907.method2752(-113); var12 != null; var12 = (class122) var7.field5907.method2754(-1)) {
            class409 var13 = class167.method1202(true, var12.field1633);
            int var14 = var13.field5868;
            if (var13.field5846 == 1) {
                var14 = (var12.field1638 + 1) * var14;
            }
            if (var10 > var14) {
                class78.method462(-14, arg2, var12);
                return;
            }
        }
        var7.field5907.method2756(102, arg2);
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(B)V")
    public static final void method2121(byte arg0) {
        if (class86.field1122 > 0) {
            class86.field1122--;
        }
        field4673++;
        if (class270.field3952 > 1) {
            class270.field3952--;
            class105.field1348 = class428.field6095;
        }
        if (class265.field3895) {
            class265.field3895 = false;
            class371.method2383((byte) 102);
            return;
        }
        if (!class359.field5185) {
            class329.method2163(0);
        }
        if (arg0 >= -7) {
            method2121((byte) 18);
        }
        for (int var1 = 0; var1 < 100 && class275.method1865((byte) 116); var1++) {
        }
        if (class423.field6041 != 30) {
            return;
        }
        class419.method2638((byte) -49, 142, class407.field5761);
        if (class252.field3744 != null || class246.field3677 < (class18.method107(-16145) - 2000L)) {
            boolean var2 = false;
            int var3 = class407.field5761.field1880;
            for (class378 var4 = (class378) class168.field2380.method2752(-54); var4 != null && class407.field5761.field1880 - var3 < 240; var4 = (class378) class168.field2380.method2754(-1)) {
                var4.method2660((byte) 114);
                int var5 = var4.method471((byte) -95);
                if (var5 < 0) {
                    var5 = 0;
                } else if (var5 > 65534) {
                    var5 = 65534;
                }
                int var6 = var4.method476(-111);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                boolean var7 = false;
                if (var4.method471((byte) 104) == -1 && var4.method476(121) == -1) {
                    var5 = -1;
                    var6 = -1;
                    var7 = true;
                }
                if (class21.field275 != var6 || class41.field564 != var5) {
                    if (!var2) {
                        class122.field1641++;
                        class407.field5761.method2048(2040, 81);
                        class407.field5761.method831(0, (byte) 127);
                        var2 = true;
                        var3 = class407.field5761.field1880;
                    }
                    int var8 = var6 - class21.field275;
                    class21.field275 = var6;
                    int var9 = var5 - class41.field564;
                    class41.field564 = var5;
                    int var10 = (int) ((var4.method473((byte) -128) - class246.field3677) / 20L);
                    if (var10 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                        var8 += 32;
                        var9 += 32;
                        class407.field5761.method799((var10 << 12) + (var8 << 6) + var9, 84);
                    } else if (var10 < 32 && var8 >= -128 && var8 <= 127 && var9 >= -128 && var9 <= 127) {
                        var9 += 128;
                        var8 += 128;
                        class407.field5761.method831(var10 + 128, (byte) 118);
                        class407.field5761.method799((var8 << 8) + var9, -67);
                    } else if (var10 < 32) {
                        class407.field5761.method831(var10 + 192, (byte) 126);
                        if (var7) {
                            class407.field5761.method849(Integer.MIN_VALUE, (byte) -106);
                        } else {
                            class407.field5761.method849(var5 << 16 | var6, (byte) -88);
                        }
                    } else {
                        class407.field5761.method799(var10 + 57344, 125);
                        if (var7) {
                            class407.field5761.method849(Integer.MIN_VALUE, (byte) -100);
                        } else {
                            class407.field5761.method849(var5 << 16 | var6, (byte) -103);
                        }
                    }
                    class246.field3677 = var4.method473((byte) -60);
                }
            }
            if (var2) {
                class407.field5761.method855(class407.field5761.field1880 - var3, 1);
            }
        }
        if (class252.field3744 != null) {
            long var11 = (class252.field3744.method473((byte) 110) - class94.field1201) / 50L;
            if (var11 > 32767L) {
                var11 = 32767L;
            }
            class94.field1201 = class252.field3744.method473((byte) -94);
            int var13 = class252.field3744.method471((byte) 82);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = class252.field3744.method476(-67);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (class252.field3744.method474((byte) 61) == 2) {
                var15 = 1;
            }
            class439.field6285++;
            int var16 = (int) var11;
            class407.field5761.method2048(2040, 68);
            class407.field5761.method849(var14 | var13 << 16, (byte) -63);
            class407.field5761.method799(var16 | var15 << 15, 111);
        }
        if (class379.field5387 > 0) {
            int var17 = 0;
            for (int var18 = 0; var18 < class379.field5387; var18++) {
                if (class332.field4830[var18].method667(0)) {
                    var17++;
                }
            }
            if (var17 > 0) {
                class407.field5761.method2048(2040, 143);
                class314.field4622++;
                if (var17 > 75) {
                    var17 = 75;
                }
                class407.field5761.method831(var17 * 3, (byte) -46);
                for (int var19 = 0; var19 < class379.field5387; var19++) {
                    class109 var20 = class332.field4830[var19];
                    if (var20.method667(0)) {
                        long var21 = (var20.method666((byte) -121) - class250.field3724) / 50L;
                        if (var21 > 65535L) {
                            var21 = 65535L;
                        }
                        class250.field3724 = var20.method666((byte) -128);
                        class407.field5761.method831(var20.method668(3), (byte) -102);
                        class407.field5761.method799((int) var21, -95);
                    }
                }
            }
        }
        if (class145.field2179 > 0) {
            class145.field2179--;
        }
        if (class56.field744 && class145.field2179 <= 0) {
            class287.field4180++;
            class56.field744 = false;
            class145.field2179 = 20;
            class407.field5761.method2048(2040, 125);
            class407.field5761.method835(7740, (int) class358.field5176 >> 3);
            class407.field5761.method856((int) class241.field3553 >> 3, -1004744376);
        }
        if (class111.field1437 && !class154.field2289) {
            class135.field2076++;
            class154.field2289 = true;
            class407.field5761.method2048(2040, 193);
            class407.field5761.method831(1, (byte) -81);
        }
        if (!class111.field1437 && class154.field2289) {
            class135.field2076++;
            class154.field2289 = false;
            class407.field5761.method2048(2040, 193);
            class407.field5761.method831(0, (byte) 111);
        }
        if (!class315.field4627) {
            class105.field1343++;
            class407.field5761.method2048(2040, 105);
            class407.field5761.method808(class190.method1366(false), -6920);
            class315.field4627 = true;
        }
        if (class385.field5449 != null) {
            if (class336.field4878 == 2) {
                class331.method2168(-3073);
            } else if (class336.field4878 == 3) {
                class266.method1823(true);
            }
        }
        if (class366.field5240) {
            class366.field5240 = false;
        } else {
            class353.field5128 /= 2.0F;
        }
        if (class189.field2710) {
            class189.field2710 = false;
        } else {
            class198.field2835 /= 2.0F;
        }
        class46.method302((byte) -65);
        if (class423.field6041 != 30) {
            return;
        }
        class108.method635((byte) -14);
        class57.method374((byte) -110);
        class204.method1421(false);
        class312.field4617++;
        if (class312.field4617 > 750) {
            class371.method2383((byte) 102);
            return;
        }
        class63.method403((byte) -128);
        class122.method739(-80);
        class103.method612(true);
        for (int var23 = class74.method446(true, 0); var23 != -1; var23 = class74.method446(false, 0)) {
            class394.method2486(var23, -1);
            class197.field2825[class209.method1483(31, class320.field4690++)] = var23;
        }
        for (class276 var24 = class359.method2339(-14763); var24 != null; var24 = class359.method2339(-14763)) {
            int var25 = var24.method1878((byte) 101);
            int var26 = var24.method1869((byte) 126);
            if (var25 == 1) {
                class114.field1471[var26] = var24.field3986;
                class242.field3580 |= class442.field6334[var26];
                class441.field6315[class209.method1483(31, class40.field557++)] = var26;
            } else if (var25 == 2) {
                class253.field3750[var26] = var24.field3981;
                class347.field5058[class209.method1483(class363.field5211++, 31)] = var26;
            } else if (var25 == 3) {
                class223 var48 = class438.method2732(var26, 0);
                if (!var24.field3981.equals(var48.field3325)) {
                    var48.field3325 = var24.field3981;
                    class245.method1701(var48, (byte) -94);
                }
            } else if (var25 == 4) {
                class223 var27 = class438.method2732(var26, 0);
                int var28 = var24.field3986;
                int var29 = var24.field3984;
                int var30 = var24.field3985;
                if (var27.field3338 != var28 || var27.field3305 != var29 || var27.field3260 != var30) {
                    var27.field3338 = var28;
                    var27.field3305 = var29;
                    var27.field3260 = var30;
                    class245.method1701(var27, (byte) -94);
                }
            } else if (var25 == 5) {
                class223 var31 = class438.method2732(var26, 0);
                if (var24.field3986 != var31.field3199 || var24.field3986 == -1) {
                    var31.field3276 = 0;
                    var31.field3267 = 0;
                    var31.field3292 = 1;
                    var31.field3199 = var24.field3986;
                    class245.method1701(var31, (byte) -94);
                }
            } else if (var25 == 6) {
                int var32 = var24.field3986;
                int var33 = var32 >> 10 & 0x1F;
                int var34 = var32 >> 5 & 0x1F;
                int var35 = var32 & 0x1F;
                int var36 = (var35 << 3) + ((var33 << 19) + (var34 << 11));
                class223 var37 = class438.method2732(var26, 0);
                if (var37.field3219 != var36) {
                    var37.field3219 = var36;
                    class245.method1701(var37, (byte) -94);
                }
            } else if (var25 == 7) {
                class223 var46 = class438.method2732(var26, 0);
                boolean var47 = var24.field3986 == 1;
                if (var46.field3316 != var47) {
                    var46.field3316 = var47;
                    class245.method1701(var46, (byte) -94);
                }
            } else if (var25 == 8) {
                class223 var45 = class438.method2732(var26, 0);
                if (var24.field3986 != var45.field3237 || var24.field3984 != var45.field3331 || var24.field3985 != var45.field3265) {
                    var45.field3265 = var24.field3985;
                    var45.field3331 = var24.field3984;
                    var45.field3237 = var24.field3986;
                    if (var45.field3304 != -1) {
                        if (var45.field3268 > 0) {
                            var45.field3265 = var45.field3265 * 32 / var45.field3268;
                        } else if (var45.field3201 > 0) {
                            var45.field3265 = var45.field3265 * 32 / var45.field3201;
                        }
                    }
                    class245.method1701(var45, (byte) -94);
                }
            } else if (var25 == 9) {
                class223 var44 = class438.method2732(var26, 0);
                if (var24.field3986 != var44.field3304 || var24.field3984 != var44.field3314) {
                    var44.field3304 = var24.field3986;
                    var44.field3314 = var24.field3984;
                    class245.method1701(var44, (byte) -94);
                }
            } else if (var25 == 10) {
                class223 var43 = class438.method2732(var26, 0);
                if (var24.field3986 != var43.field3206 || var24.field3984 != var43.field3311 || var24.field3985 != var43.field3275) {
                    var43.field3275 = var24.field3985;
                    var43.field3206 = var24.field3986;
                    var43.field3311 = var24.field3984;
                    class245.method1701(var43, (byte) -94);
                }
            } else if (var25 == 11) {
                class223 var38 = class438.method2732(var26, 0);
                var38.field3216 = 0;
                var38.field3343 = 0;
                var38.field3187 = var38.field3254 = var24.field3986;
                var38.field3191 = var38.field3337 = var24.field3984;
                class245.method1701(var38, (byte) -94);
            } else if (var25 == 12) {
                class223 var39 = class438.method2732(var26, 0);
                int var40 = var24.field3986;
                if (var39 != null && var39.field3208 == 0) {
                    if (var39.field3289 - var39.field3282 < var40) {
                        var40 = var39.field3289 - var39.field3282;
                    }
                    if (var40 < 0) {
                        var40 = 0;
                    }
                    if (var39.field3240 != var40) {
                        var39.field3240 = var40;
                        class245.method1701(var39, (byte) -94);
                    }
                }
            } else if (var25 == 14) {
                class223 var41 = class438.method2732(var26, 0);
                var41.field3339 = var24.field3986;
            } else if (var25 == 15) {
                class53.field690 = true;
                class218.field3132 = var24.field3986;
                class72.field944 = var24.field3984;
            } else if (var25 == 16) {
                class223 var42 = class438.method2732(var26, 0);
                var42.field3252 = var24.field3986;
            }
        }
        class239.field3529++;
        if (class426.field6084 != 0) {
            class222.field3178 += 20;
            if (class222.field3178 >= 400) {
                class426.field6084 = 0;
            }
        }
        if (class264.field3884 != null) {
            class289.field4201++;
            if (class289.field4201 >= 15) {
                class245.method1701(class264.field3884, (byte) -94);
                class264.field3884 = null;
            }
        }
        class447.field6383 = null;
        class51.field666 = false;
        class346.field5032 = false;
        class247.field3690 = null;
        class369.method2367((class223) null, -1, -1, (byte) 126);
        class267.method1826((byte) -72, (class223) null, -1, -1);
        class153.method1130((byte) 124);
        class428.field6095++;
        if (class108.field1409) {
            class435.field6215++;
            class407.field5761.method2048(2040, 91);
            class407.field5761.method808(class241.field3565 | class9.field117 << 14 | class402.field5645 << 28, -6920);
            class108.field1409 = false;
        }
        while (true) {
            class79 var49;
            class223 var50;
            class223 var51;
            do {
                var49 = (class79) class5.field78.method2748(-107);
                if (var49 == null) {
                    while (true) {
                        class79 var52;
                        class223 var53;
                        class223 var54;
                        do {
                            var52 = (class79) class196.field2811.method2748(-104);
                            if (var52 == null) {
                                while (true) {
                                    class79 var55;
                                    class223 var56;
                                    class223 var57;
                                    do {
                                        var55 = (class79) class23.field292.method2748(-112);
                                        if (var55 == null) {
                                            if (class447.field6383 == null) {
                                                class73.field948 = 0;
                                            }
                                            if (class327.field4749 != null) {
                                                class240.method1639(-74);
                                            }
                                            if (class316.field4628 > 0 && class16.field247.method1758(-501, 82) && class16.field247.method1758(-501, 81) && class6.field90 != 0) {
                                                int var58 = class158.field2302 - class6.field90;
                                                if (var58 < 0) {
                                                    var58 = 0;
                                                } else if (var58 > 3) {
                                                    var58 = 3;
                                                }
                                                class97.method575(-13945, class181.field2555.field4595[0] + class306.field4459, class181.field2555.field4601[0] + class342.field4959, var58);
                                            }
                                            class369.method2368(-128);
                                            for (int var59 = 0; var59 < 5; var59++) {
                                                int var10002 = class365.field5225[var59]++;
                                            }
                                            if (class242.field3580 && (class18.method107(-16145) - 60000L) > class380.field5398) {
                                                class365.method2358(-45);
                                            }
                                            class189.field2711++;
                                            if (class189.field2711 > 500) {
                                                class189.field2711 = 0;
                                                int var60 = (int) (Math.random() * 8.0D);
                                                if ((var60 & 0x4) == 4) {
                                                    class129.field1834 += class287.field4188;
                                                }
                                                if ((var60 & 0x1) == 1) {
                                                    class446.field6379 += class270.field3954;
                                                }
                                                if ((var60 & 0x2) == 2) {
                                                    class390.field5492 += class409.field5875;
                                                }
                                            }
                                            if (class446.field6379 < -50) {
                                                class270.field3954 = 2;
                                            }
                                            if (class446.field6379 > 50) {
                                                class270.field3954 = -2;
                                            }
                                            if (class390.field5492 < -55) {
                                                class409.field5875 = 2;
                                            }
                                            if (class390.field5492 > 55) {
                                                class409.field5875 = -2;
                                            }
                                            if (class129.field1834 < -40) {
                                                class287.field4188 = 1;
                                            }
                                            if (class129.field1834 > 40) {
                                                class287.field4188 = -1;
                                            }
                                            class285.field4146++;
                                            if (class285.field4146 > 500) {
                                                class285.field4146 = 0;
                                                int var61 = (int) (Math.random() * 8.0D);
                                                if ((var61 & 0x1) == 1) {
                                                    class63.field842 += class242.field3573;
                                                }
                                                if ((var61 & 0x2) == 2) {
                                                    class261.field3863 += class235.field3459;
                                                }
                                            }
                                            if (class63.field842 < -60) {
                                                class242.field3573 = 2;
                                            }
                                            if (class63.field842 > 60) {
                                                class242.field3573 = -2;
                                            }
                                            if (class261.field3863 < -20) {
                                                class235.field3459 = 1;
                                            }
                                            if (class261.field3863 > 10) {
                                                class235.field3459 = -1;
                                            }
                                            class338.field4892++;
                                            if (class338.field4892 > 50) {
                                                class128.field1803++;
                                                class407.field5761.method2048(2040, 156);
                                            }
                                            if (class299.field4338) {
                                                class46.method300(116);
                                                class299.field4338 = false;
                                            }
                                            try {
                                                if (class199.field2847 != null && class407.field5761.field1880 > 0) {
                                                    class199.field2847.method1091(false, class407.field5761.field1851, class407.field5761.field1880, 0);
                                                    class407.field5761.field1880 = 0;
                                                    class338.field4892 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var62) {
                                                class371.method2383((byte) 102);
                                                return;
                                            }
                                        }
                                        var56 = var55.field1018;
                                        if (var56.field3344 < 0) {
                                            break;
                                        }
                                        var57 = class438.method2732(var56.field3212, 0);
                                    } while (var57 == null || var57.field3246 == null || var56.field3344 >= var57.field3246.length || var57.field3246[var56.field3344] != var56);
                                    class424.method2655(var55);
                                }
                            }
                            var53 = var52.field1018;
                            if (var53.field3344 < 0) {
                                break;
                            }
                            var54 = class438.method2732(var53.field3212, 0);
                        } while (var54 == null || var54.field3246 == null || var54.field3246.length <= var53.field3344 || var54.field3246[var53.field3344] != var53);
                        class424.method2655(var52);
                    }
                }
                var50 = var49.field1018;
                if (var50.field3344 < 0) {
                    break;
                }
                var51 = class438.method2732(var50.field3212, 0);
            } while (var51 == null || var51.field3246 == null || var51.field3246.length <= var50.field3344 || var51.field3246[var50.field3344] != var50);
            class424.method2655(var49);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(IIII)V")
    public static final void method2122(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 127) {
            method2124(-97);
        }
        if (arg1 == 0) {
            class30.field363++;
            class407.field5761.method2048(arg3 + 1913, 205);
        }
        field4675++;
        if (arg1 == 1) {
            class407.field5761.method2048(2040, 28);
            class43.field586++;
        }
        class407.field5761.method835(7740, class306.field4459 + arg2);
        class407.field5761.method838(class16.field247.method1758(-501, 82) ? 1 : 0, (byte) 102);
        class407.field5761.method799(class342.field4959 + arg0, arg3 + -41);
        class53.field690 = false;
        class72.field944 = arg0;
        class218.field3132 = arg2;
        class28.method152((byte) 115);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Llf;I)V")
    public final void method2123(class130 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method837(true);
            if (var3 == 0) {
                field4677++;
                if (arg1 != -2) {
                    method2120(86, 66, (class122) null, -11, 50);
                    return;
                }
                return;
            }
            this.method2118(var3, 43, arg0);
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public static void method2124(int arg0) {
        if (arg0 == -2) {
            field4666 = null;
        }
    }
}
