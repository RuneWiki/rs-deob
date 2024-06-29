import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class151 extends class273 {

    @OriginalMember(owner = "client!be", name = "R", descriptor = "[I")
    public static int[] field2379 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!be", name = "K", descriptor = "Z")
    public static boolean field2373 = false;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "[I")
    public static int[] field2385 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "[I")
    public static int[] field2387 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "Lwf;")
    public static class306 field2383;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "[I")
    public static int[] field2384;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "[La;")
    public static class145[] field2386;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "[[B")
    public static byte[][] field2380;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I", line = 12)
    public final int[] method331(int arg0, int arg1) {
        field2382++;
        if (arg1 != -14650) {
            field2380 = (byte[][]) ((byte[][]) null);
        }
        int[] var3 = this.field4204.method365(arg0, arg1 + 14650);
        if (this.field4204.field792) {
            int[] var4 = this.method1790(0, arg0, 0);
            int[] var5 = this.method1790(1, arg0, 0);
            int[] var6 = this.method1790(2, arg0, 0);
            for (int var7 = 0; var7 < class27.field346; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 64)
    public class151() {
        super(3, false);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V", line = 69)
    public static final void method1060(byte arg0) {
        class163.field2515.method1296(255);
        field2375++;
        int var1 = -1 % ((67 - arg0) / 54);
        class245.field3850.method1296(255);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)[[I", line = 83)
    public final int[][] method170(int arg0, byte arg1) {
        if (arg1 != 68) {
            method1060((byte) 1);
        }
        field2374++;
        int[][] var3 = this.field4200.method539(152, arg0);
        if (this.field4200.field1147) {
            int[] var4 = this.method1790(2, arg0, 0);
            int[][] var5 = this.method1795(arg0, -125, 0);
            int[][] var6 = this.method1795(arg0, -127, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[1];
            int[] var11 = var5[0];
            int[] var12 = var6[0];
            int[] var13 = var5[2];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class27.field346; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var11[var16];
                    var8[var16] = var10[var16];
                    var9[var16] = var13[var16];
                } else if (var17 == 0) {
                    var7[var16] = var12[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var11[var16] * var17 + var12[var16] * var18 >> 12;
                    var8[var16] = var10[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var13[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BILgn;)V", line = 162)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg0 < 27) {
            this.method170(-124, (byte) -119);
        }
        if (arg1 == 0) {
            this.field4194 = arg2.method2043((byte) -107) == 1;
        }
        field2377++;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)Z", line = 184)
    public static final boolean method1061(byte arg0) throws IOException {
        field2376++;
        if (class308.field4851 == null) {
            return false;
        }
        int var1 = class308.field4851.method607(99);
        if (var1 == 0) {
            return false;
        }
        if (class93.field1441 == -1) {
            class308.field4851.method604(96, 1, 0, class230.field3713.field4716);
            class230.field3713.field4679 = 0;
            var1--;
            class93.field1441 = class230.field3713.method2071(818003299);
            class85.field1284 = class163.field2521[class93.field1441];
        }
        if (class85.field1284 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class308.field4851.method604(119, 1, 0, class230.field3713.field4716);
            class85.field1284 = class230.field3713.field4716[0] & 0xFF;
            var1--;
        }
        if (class85.field1284 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class308.field4851.method604(83, 2, 0, class230.field3713.field4716);
            var1 -= 2;
            class230.field3713.field4679 = 0;
            class85.field1284 = class230.field3713.method1994(false);
        }
        if (var1 < class85.field1284) {
            return false;
        }
        class230.field3713.field4679 = 0;
        class308.field4851.method604(42, class85.field1284, 0, class230.field3713.field4716);
        class6.field69 = class338.field5230;
        class56.field786 = 0;
        class338.field5230 = class34.field437;
        class34.field437 = class93.field1441;
        if (class93.field1441 == 250) {
            String var2 = class230.field3713.method2027(0);
            int var3 = class230.field3713.method2021(true);
            int var4 = class230.field3713.method2030((byte) -70);
            if (class173.method1172(var4, 127)) {
                class88.method601(var2, (byte) -116, var3);
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 125) {
            int var359 = class230.field3713.method1994(false);
            int var360 = class230.field3713.method1994(false);
            int var361 = class230.field3713.method2037((byte) 58);
            int var362 = class230.field3713.method1992(true);
            if (var361 >> 30 != 0) {
                int var363 = var361 >> 28 & 0x3;
                int var364 = ((var361 & 0xFFFFDCA) >> 14) - class30.field374;
                int var365 = (var361 & 0x3FFF) - class294.field4535;
                if (var364 >= 0 && var365 >= 0 && var364 < 104 && var365 < 104) {
                    int var366 = var364 * 128 + 64;
                    int var367 = var365 * 128 + 64;
                    class339 var368 = new class339(var362, var363, var366, var367, class39.method286(var363, (byte) 82, var366, var367) - var360, var359, class343.field5341);
                    class18.field252.method7((byte) -51, new class185(var368));
                }
            } else if ((var361 >> 29) != 0) {
                int var381 = var361 & 0xFFFF;
                class80 var382 = class208.field3313[var381];
                if (var382 != null) {
                    if (var362 == 65535) {
                        var362 = -1;
                    }
                    boolean var383 = true;
                    if (var362 != -1 && var382.field530 != -1) {
                        if (var382.field530 == var362) {
                            class148 var388 = class63.method428(false, var362);
                            if (var388.field2344 && var388.field2355 != -1) {
                                class222 var389 = class118.method809((byte) 60, var388.field2355);
                                int var390 = var389.field3552;
                                if (var390 == 1) {
                                    var382.field506 = 0;
                                    var383 = false;
                                    var382.field477 = class343.field5341 + var359;
                                    var382.field534 = 0;
                                    var382.field544 = 0;
                                    var382.field496 = 1;
                                    class229.method1571(var382.field537, false, (byte) -110, var382.field519, var389, var382.field534);
                                } else if (var390 == 2) {
                                    var383 = false;
                                    var382.field478 = 0;
                                }
                            }
                        } else {
                            class148 var384 = class63.method428(false, var362);
                            class148 var385 = class63.method428(false, var382.field530);
                            if (var384.field2355 != -1 && var385.field2355 != -1) {
                                class222 var386 = class118.method809((byte) 127, var384.field2355);
                                class222 var387 = class118.method809((byte) 109, var385.field2355);
                                if (var387.field3560 > var386.field3560) {
                                    var383 = false;
                                }
                            }
                        }
                    }
                    if (var383) {
                        var382.field477 = class343.field5341 + var359;
                        var382.field496 = 1;
                        var382.field530 = var362;
                        var382.field506 = 0;
                        var382.field534 = 0;
                        if (class343.field5341 < var382.field477) {
                            var382.field534 = -1;
                        }
                        var382.field501 = var360;
                        if (var382.field530 != -1 && class343.field5341 == var382.field477) {
                            int var391 = class63.method428(false, var382.field530).field2355;
                            if (var391 != -1) {
                                class222 var392 = class118.method809((byte) 95, var391);
                                if (var392 != null && var392.field3529 != null) {
                                    class229.method1571(var382.field537, false, (byte) -110, var382.field519, var392, 0);
                                }
                            }
                        }
                    }
                }
            } else if (var361 >> 28 != 0) {
                int var369 = var361 & 0xFFFF;
                class82 var370;
                if (class124.field1944 == var369) {
                    var370 = class79.field1173;
                } else {
                    var370 = class64.field966[var369];
                }
                if (var370 != null) {
                    if (var362 == 65535) {
                        var362 = -1;
                    }
                    boolean var371 = true;
                    if (var362 != -1 && var370.field530 != -1) {
                        if (var370.field530 == var362) {
                            class148 var372 = class63.method428(false, var362);
                            if (var372.field2344 && var372.field2355 != -1) {
                                class222 var373 = class118.method809((byte) 76, var372.field2355);
                                int var374 = var373.field3552;
                                if (var374 == 1) {
                                    var371 = false;
                                    var370.field534 = 0;
                                    var370.field506 = 0;
                                    var370.field496 = 1;
                                    var370.field477 = class343.field5341 + var359;
                                    var370.field544 = 0;
                                    class229.method1571(var370.field537, false, (byte) -110, var370.field519, var373, var370.field534);
                                } else if (var374 == 2) {
                                    var371 = false;
                                    var370.field478 = 0;
                                }
                            }
                        } else {
                            class148 var375 = class63.method428(false, var362);
                            class148 var376 = class63.method428(false, var370.field530);
                            if (var375.field2355 != -1 && var376.field2355 != -1) {
                                class222 var377 = class118.method809((byte) 126, var375.field2355);
                                class222 var378 = class118.method809((byte) 116, var376.field2355);
                                if (var378.field3560 > var377.field3560) {
                                    var371 = false;
                                }
                            }
                        }
                    }
                    if (var371) {
                        var370.field534 = 0;
                        var370.field501 = var360;
                        var370.field506 = 0;
                        var370.field496 = 1;
                        var370.field477 = class343.field5341 + var359;
                        if (var370.field477 > class343.field5341) {
                            var370.field534 = -1;
                        }
                        var370.field530 = var362;
                        if (var370.field530 == 65535) {
                            var370.field530 = -1;
                        }
                        if (var370.field530 != -1 && class343.field5341 == var370.field477) {
                            int var379 = class63.method428(false, var370.field530).field2355;
                            if (var379 != -1) {
                                class222 var380 = class118.method809((byte) 79, var379);
                                if (var380 != null && var380.field3529 != null) {
                                    class229.method1571(var370.field537, class79.field1173 == var370, (byte) -110, var370.field519, var380, 0);
                                }
                            }
                        }
                    }
                }
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 4) {
            int var355 = class230.field3713.method2016(2);
            int var356 = class230.field3713.method2022(-1211896164);
            int var357 = class230.field3713.method2020(-16699);
            int var358 = class230.field3713.method2010(103);
            if (class173.method1172(var355, 99)) {
                class144.method1009(var356, var358, false, var357);
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 241) {
            int var5 = class230.field3713.method2002(-126);
            int var6 = class230.field3713.method1994(false);
            if (class173.method1172(var6, 72)) {
                class99.field1540 = var5;
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 17) {
            int var352 = class230.field3713.method1992(true);
            int var353 = class230.field3713.method1994(false);
            int var354 = class230.field3713.method1996(85);
            if (class173.method1172(var352, 86)) {
                class222.method1489(var354, true, var353);
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 166) {
            class190.field2891 = class85.field1284 / 8;
            for (int var7 = 0; var7 < class190.field2891; var7++) {
                class115.field1792[var7] = class230.field3713.method2047((byte) -84);
                class317.field4978[var7] = class275.method1805(false, class115.field1792[var7]);
                class240.field3819[var7] = false;
            }
            class93.field1441 = -1;
            class315.field4968 = class71.field1068;
            return true;
        } else if (class93.field1441 == 42) {
            long var336 = class230.field3713.method2047((byte) -84);
            class230.field3713.method2001(-3);
            long var338 = class230.field3713.method2047((byte) -84);
            long var340 = (long) class230.field3713.method1994(false);
            long var342 = (long) class230.field3713.method2059(255);
            int var344 = class230.field3713.method2043((byte) -116);
            int var345 = class230.field3713.method1994(false);
            long var346 = (var340 << 32) + var342;
            boolean var348 = false;
            int var349 = 0;
            label1733: while (true) {
                if (var349 >= 100) {
                    if (var344 <= 1) {
                        for (int var350 = 0; var350 < class190.field2891; var350++) {
                            if (class115.field1792[var350] == var336) {
                                var348 = true;
                                break label1733;
                            }
                        }
                    }
                    break;
                }
                if (class121.field1864[var349] == var346) {
                    var348 = true;
                    break;
                }
                var349++;
            }
            if (!var348 && class7.field83 == 0) {
                class121.field1864[class17.field164] = var346;
                class17.field164 = (class17.field164 + 1) % 100;
                String var351 = class188.method1288(var345, (byte) 101).method1010(class230.field3713, -112);
                if (var344 == 2 || var344 == 3) {
                    class128.method862("<img=1>" + class305.method2073(false, var336), class305.method2073(false, var338), var345, true, var351, 20);
                } else if (var344 == 1) {
                    class128.method862("<img=0>" + class305.method2073(false, var336), class305.method2073(false, var338), var345, true, var351, 20);
                } else {
                    class128.method862(class305.method2073(false, var336), class305.method2073(false, var338), var345, true, var351, 20);
                }
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 205) {
            class173.method1177((byte) -74);
            class93.field1441 = -1;
            return false;
        } else if (class93.field1441 == 54) {
            int var333 = class230.field3713.method2016(2);
            int var334 = class230.field3713.method2016(2);
            byte var335 = class230.field3713.method2051((byte) -26);
            if (class173.method1172(var334, 117)) {
                class303.method2036(var335, var333, 2116);
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 107) {
            int var8 = class230.field3713.method2043((byte) -110);
            int var9 = var8 >> 5;
            int var10 = var8 & 0x1F;
            if (var10 == 0) {
                class81.field1204[var9] = null;
                class93.field1441 = -1;
                return true;
            }
            class68 var11 = new class68();
            var11.field1013 = var10;
            var11.field1013 = var8 & 0x3F;
            var11.field1021 = class230.field3713.method2043((byte) -121);
            if (var11.field1021 >= 0 && class221.field3509.length > var11.field1021) {
                if (var11.field1013 == 1 || var11.field1013 == 10) {
                    var11.field1022 = class230.field3713.method1994(false);
                    class230.field3713.field4679 += 5;
                } else if (var11.field1013 >= 2 && var11.field1013 <= 6) {
                    if (var11.field1013 == 2) {
                        var11.field1010 = 64;
                        var11.field1018 = 64;
                    }
                    if (var11.field1013 == 3) {
                        var11.field1018 = 0;
                        var11.field1010 = 64;
                    }
                    if (var11.field1013 == 4) {
                        var11.field1010 = 64;
                        var11.field1018 = 128;
                    }
                    if (var11.field1013 == 5) {
                        var11.field1018 = 64;
                        var11.field1010 = 0;
                    }
                    if (var11.field1013 == 6) {
                        var11.field1018 = 64;
                        var11.field1010 = 128;
                    }
                    var11.field1013 = 2;
                    var11.field1007 = class230.field3713.method1994(false);
                    var11.field1008 = class230.field3713.method1994(false);
                    var11.field1015 = class230.field3713.method2043((byte) -104);
                    var11.field1025 = class230.field3713.method1994(false);
                }
                var11.field1024 = class230.field3713.method1994(false);
                if (var11.field1024 == 65535) {
                    var11.field1024 = -1;
                }
                class81.field1204[var9] = var11;
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 19) {
            int var12 = class230.field3713.method2002(-40);
            int var13 = class230.field3713.method2002(-91);
            int var14 = class230.field3713.method2002(126);
            class77.field1154 = var13 >> 1;
            class79.field1173.method567((var13 & 0x1) == 1, -25545, var12, var14);
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 59) {
            int var330 = class230.field3713.method2016(2);
            int var331 = class230.field3713.method1992(true);
            int var332 = class230.field3713.method1992(true);
            if (class173.method1172(var332, 92)) {
                class179.method1225(var331, var330, 18);
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 199) {
            class115.method793(false, 0);
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 10) {
            int var15 = class230.field3713.method2016(2);
            int var16 = class230.field3713.method2030((byte) -70);
            int var17 = class230.field3713.method2010(96);
            int var18 = class230.field3713.method1994(false);
            int var19 = class230.field3713.method1994(false);
            if (class173.method1172(var15, 114)) {
                class199.method1343(false, 7, var19 | var18 << 16, var16, var17);
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 245) {
            int var20 = class230.field3713.method1996(60);
            int var21 = class230.field3713.method2030((byte) -70);
            int var22 = class230.field3713.method2010(80);
            int var23 = class230.field3713.method1994(false);
            if (var23 == 65535) {
                var23 = -1;
            }
            int var24 = class230.field3713.method2016(2);
            if (var21 == 65535) {
                var21 = -1;
            }
            if (class173.method1172(var24, 78)) {
                for (int var25 = var23; var25 <= var21; var25++) {
                    long var26 = ((long) var22 << 32) + (long) var25;
                    class108 var28 = (class108) class262.field4050.method1558(var26, false);
                    class108 var29;
                    if (var28 != null) {
                        var29 = new class108(var20, var28.field1661);
                        var28.method1284(0);
                    } else if (var25 == -1) {
                        var29 = new class108(var20, class78.method547(var22, 125).field3180.field1661);
                    } else {
                        var29 = new class108(var20, -1);
                    }
                    class262.field4050.method1550(var29, var26, (byte) 86);
                }
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 231) {
            if (class63.field919 != null) {
                class120.method818(2, class175.field2682, false, -1, -1);
            }
            byte[] var30 = new byte[class85.field1284];
            class230.field3713.method2063(true, class85.field1284, var30, 0);
            String var31 = class100.method684(class85.field1284, 0, var30, 31122);
            if (class261.field4045 == null && class224.field3576 == 3 || !class224.field3567.startsWith("win") || class179.field2741) {
                class158.method1097(-1, true, var31);
            } else {
                class19.field261 = var31;
                class83.field1256 = true;
                class14.field145 = class89.field1359.method1513(var31, 16);
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 172) {
            if (class85.field1284 == 0) {
                class23.field291 = class306.field4801;
            } else {
                class23.field291 = class230.field3713.method2027(0);
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 70) {
            int var327 = class230.field3713.method1994(false);
            int var328 = class230.field3713.method1996(-109);
            if (class173.method1172(var327, 117)) {
                class45 var329 = (class45) class166.field2557.method1558((long) var328, false);
                if (var329 != null) {
                    class157.method1095(var329, true, -18772);
                }
                if (class108.field1674 != null) {
                    class277.method1822(4096, class108.field1674);
                    class108.field1674 = null;
                }
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 170) {
            for (int var32 = 0; var32 < class156.field2442.length; var32++) {
                if (class61.field852[var32] != class156.field2442[var32]) {
                    class156.field2442[var32] = class61.field852[var32];
                    class150.method1057(var32, -10);
                    class104.field1596[class311.method2135(class101.field1576++, 31)] = var32;
                }
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 238) {
            int var33 = class230.field3713.method2037((byte) 58);
            int var34 = class230.field3713.method2030((byte) -70);
            int var35 = class230.field3713.method2002(126);
            if (class173.method1172(var34, 74)) {
                class304.method2069((byte) -92, var35, var33);
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 236) {
            long var36 = class230.field3713.method2047((byte) -84);
            long var38 = (long) class230.field3713.method1994(false);
            long var40 = (long) class230.field3713.method2059(255);
            long var42 = (var38 << 32) + var40;
            int var44 = class230.field3713.method2043((byte) -119);
            boolean var45 = false;
            int var46 = 0;
            label1309: while (true) {
                if (var46 < 100) {
                    if (class121.field1864[var46] != var42) {
                        var46++;
                        continue;
                    }
                    var45 = true;
                    break;
                }
                if (var44 <= 1) {
                    if ((!class50.field707 || class83.field1258) && !class207.field3288) {
                        for (int var47 = 0; var47 < class190.field2891; var47++) {
                            if (class115.field1792[var47] == var36) {
                                var45 = true;
                                break label1309;
                            }
                        }
                    } else {
                        var45 = true;
                    }
                }
                break;
            }
            if (!var45 && class7.field83 == 0) {
                class121.field1864[class17.field164] = var42;
                class17.field164 = (class17.field164 + 1) % 100;
                String var48 = class180.method1238(class268.method1775(class131.method902(8, class230.field3713), (byte) -42));
                if (var44 == 2 || var44 == 3) {
                    class343.method2390(var48, 7, false, "<img=1>" + class305.method2073(false, var36));
                } else if (var44 == 1) {
                    class343.method2390(var48, 7, false, "<img=0>" + class305.method2073(false, var36));
                } else {
                    class343.method2390(var48, 3, false, class305.method2073(false, var36));
                }
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 47) {
            int var316 = class230.field3713.method2043((byte) -107);
            int var317 = var316 & 0x3;
            int var318 = var316 >> 2;
            int var319 = class315.field4958[var318];
            int var320 = class230.field3713.method2010(88);
            int var321 = var320 >> 28 & 0x3;
            int var322 = var320 >> 14 & 0x3FFF;
            int var323 = class230.field3713.method2016(2);
            if (var323 == 65535) {
                var323 = -1;
            }
            int var324 = var320 & 0x3FFF;
            int var325 = var324 - class294.field4535;
            int var326 = var322 - class30.field374;
            class303.method2052(var317, var325, var321, var319, var323, -128, var318, var326);
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 11) {
            int var313 = class230.field3713.method2037((byte) 58);
            int var314 = class230.field3713.method2016(2);
            if (class173.method1172(var314, 69)) {
                int var315 = 0;
                if (class79.field1173.field1247 != null) {
                    var315 = class79.field1173.field1247.method1170(16537);
                }
                class199.method1343(false, 3, var315, -1, var313);
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 65) {
            int var310 = class230.field3713.method2010(123);
            int var311 = class230.field3713.method1992(true);
            int var312 = class230.field3713.method1994(false);
            if (class173.method1172(var311, 98)) {
                class303.method2036(var310, var312, 2116);
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 202) {
            String var49 = class230.field3713.method2027(0);
            int var50 = class230.field3713.method2053(-21097);
            int var51 = class230.field3713.method2030((byte) -70);
            if (var51 == 65535) {
                var51 = -1;
            }
            int var52 = class230.field3713.method2043((byte) -113);
            if (var50 >= 1 && var50 <= 8) {
                if (var49.equalsIgnoreCase("null")) {
                    var49 = null;
                }
                class245.field3851[var50 - 1] = var49;
                class315.field4960[var50 - 1] = var51;
                class278.field4292[var50 - 1] = var52 == 0;
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 87) {
            String var53 = class230.field3713.method2027(0);
            if (var53.endsWith(":tradereq:")) {
                boolean var54 = false;
                String var55 = var53.substring(0, var53.indexOf(":"));
                long var56 = class108.method723(var55, -117);
                for (int var58 = 0; var58 < class190.field2891; var58++) {
                    if (class115.field1792[var58] == var56) {
                        var54 = true;
                        break;
                    }
                }
                if (!var54 && class7.field83 == 0) {
                    class343.method2390(class229.field3688, 4, false, var55);
                }
            } else if (var53.endsWith(":chalreq:")) {
                boolean var88 = false;
                String var89 = var53.substring(0, var53.indexOf(":"));
                long var90 = class108.method723(var89, -58);
                for (int var92 = 0; var92 < class190.field2891; var92++) {
                    if (class115.field1792[var92] == var90) {
                        var88 = true;
                        break;
                    }
                }
                if (!var88 && class7.field83 == 0) {
                    String var93 = var53.substring(var53.indexOf(":") + 1, var53.length() + -9);
                    class343.method2390(var93, 8, false, var89);
                }
            } else if (var53.endsWith(":assistreq:")) {
                String var59 = var53.substring(0, var53.indexOf(":"));
                long var60 = class108.method723(var59, -30);
                boolean var62 = false;
                for (int var63 = 0; var63 < class190.field2891; var63++) {
                    if (class115.field1792[var63] == var60) {
                        var62 = true;
                        break;
                    }
                }
                if (!var62 && class7.field83 == 0) {
                    class343.method2390("", 10, false, var59);
                }
            } else if (var53.endsWith(":clan:")) {
                String var87 = var53.substring(0, var53.indexOf(":clan:"));
                class343.method2390(var87, 11, false, "");
            } else if (var53.endsWith(":trade:")) {
                String var86 = var53.substring(0, var53.indexOf(":trade:"));
                if (class7.field83 == 0) {
                    class343.method2390(var86, 12, false, "");
                }
            } else if (var53.endsWith(":assist:")) {
                String var85 = var53.substring(0, var53.indexOf(":assist:"));
                if (class7.field83 == 0) {
                    class343.method2390(var85, 13, false, "");
                }
            } else if (var53.endsWith(":duelstake:")) {
                String var80 = var53.substring(0, var53.indexOf(":"));
                long var81 = class108.method723(var80, -118);
                boolean var83 = false;
                for (int var84 = 0; var84 < class190.field2891; var84++) {
                    if (class115.field1792[var84] == var81) {
                        var83 = true;
                        break;
                    }
                }
                if (!var83 && class7.field83 == 0) {
                    class343.method2390("", 14, false, var80);
                }
            } else if (var53.endsWith(":duelfriend:")) {
                String var75 = var53.substring(0, var53.indexOf(":"));
                long var76 = class108.method723(var75, -26);
                boolean var78 = false;
                for (int var79 = 0; var79 < class190.field2891; var79++) {
                    if (class115.field1792[var79] == var76) {
                        var78 = true;
                        break;
                    }
                }
                if (!var78 && class7.field83 == 0) {
                    class343.method2390("", 15, false, var75);
                }
            } else if (var53.endsWith(":clanreq:")) {
                String var70 = var53.substring(0, var53.indexOf(":"));
                long var71 = class108.method723(var70, -118);
                boolean var73 = false;
                for (int var74 = 0; var74 < class190.field2891; var74++) {
                    if (class115.field1792[var74] == var71) {
                        var73 = true;
                        break;
                    }
                }
                if (!var73 && class7.field83 == 0) {
                    class343.method2390("", 16, false, var70);
                }
            } else if (var53.endsWith(":allyreq:")) {
                String var64 = var53.substring(0, var53.indexOf(":"));
                boolean var65 = false;
                long var66 = class108.method723(var64, -66);
                for (int var68 = 0; var68 < class190.field2891; var68++) {
                    if (class115.field1792[var68] == var66) {
                        var65 = true;
                        break;
                    }
                }
                if (!var65 && class7.field83 == 0) {
                    String var69 = var53.substring(var53.indexOf(":") + 1, var53.length() - 9);
                    class343.method2390(var69, 21, false, var64);
                }
            } else {
                class343.method2390(var53, 0, false, "");
            }
            class93.field1441 = -1;
            return true;
        } else if (class93.field1441 == 247) {
            int var94 = class230.field3713.method2010(88);
            int var95 = class230.field3713.method1996(-61);
            int var96 = class230.field3713.method1994(false);
            if (class173.method1172(var96, 120)) {
                class45 var97 = (class45) class166.field2557.method1558((long) var94, false);
                class45 var98 = (class45) class166.field2557.method1558((long) var95, false);
                if (var98 != null) {
                    class157.method1095(var98, var97 == null || var97.field640 != var98.field640, -18772);
                }
                if (var97 != null) {
                    var97.method1284(0);
                    class166.field2557.method1550(var97, (long) var95, (byte) 104);
                }
                class207 var99 = class78.method547(var94, 127);
                if (var99 != null) {
                    class277.method1822(4096, var99);
                }
                class207 var100 = class78.method547(var95, 102);
                if (var100 != null) {
                    class277.method1822(4096, var100);
                    class342.method2386(true, var100, 125);
                }
                if (class253.field3936 != -1) {
                    class288.method1874(8, 1, class253.field3936);
                }
            }
            class93.field1441 = -1;
            return true;
        } else {
            if (arg0 >= -75) {
                method1063((byte) -32);
            }
            if (class93.field1441 == 251) {
                int var101 = class230.field3713.method1994(false);
                String var102 = class230.field3713.method2027(0);
                Object[] var103 = new Object[var102.length() + 1];
                for (int var104 = var102.length() - 1; var104 >= 0; var104--) {
                    if (var102.charAt(var104) == 's') {
                        var103[var104 + 1] = class230.field3713.method2027(0);
                    } else {
                        var103[var104 + 1] = Integer.valueOf(class230.field3713.method1996(-128));
                    }
                }
                var103[0] = Integer.valueOf(class230.field3713.method1996(-92));
                if (class173.method1172(var101, 113)) {
                    class120 var105 = new class120();
                    var105.field1837 = var103;
                    class122.method834((byte) 125, var105);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 72) {
                class275.method1802(-7242);
                class271.field4167 = class230.field3713.method2042(7);
                class93.field1441 = -1;
                class168.field2570 = class71.field1068;
                return true;
            } else if (class93.field1441 == 84) {
                byte var308 = class230.field3713.method1998(2192);
                int var309 = class230.field3713.method1992(true);
                class86.method591(var308, -117, var309);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 141) {
                class93.field1441 = -1;
                class133.field2099 = 0;
                return true;
            } else if (class93.field1441 == 197) {
                long var106 = class230.field3713.method2047((byte) -84);
                long var108 = (long) class230.field3713.method1994(false);
                long var110 = (long) class230.field3713.method2059(255);
                int var112 = class230.field3713.method2043((byte) -108);
                int var113 = class230.field3713.method1994(false);
                long var114 = (var108 << 32) + var110;
                boolean var116 = false;
                int var117 = 0;
                label1407: while (true) {
                    if (var117 < 100) {
                        if (class121.field1864[var117] != var114) {
                            var117++;
                            continue;
                        }
                        var116 = true;
                        break;
                    }
                    if (var112 <= 1) {
                        for (int var118 = 0; var118 < class190.field2891; var118++) {
                            if (class115.field1792[var118] == var106) {
                                var116 = true;
                                break label1407;
                            }
                        }
                    }
                    break;
                }
                if (!var116 && class7.field83 == 0) {
                    class121.field1864[class17.field164] = var114;
                    class17.field164 = (class17.field164 + 1) % 100;
                    String var119 = class188.method1288(var113, (byte) 58).method1010(class230.field3713, -105);
                    if (var112 == 2) {
                        class128.method862("<img=1>" + class305.method2073(false, var106), (String) null, var113, true, var119, 18);
                    } else if (var112 == 1) {
                        class128.method862("<img=0>" + class305.method2073(false, var106), (String) null, var113, true, var119, 18);
                    } else {
                        class128.method862(class305.method2073(false, var106), (String) null, var113, true, var119, 18);
                    }
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 38) {
                int var120 = class230.field3713.method2030((byte) -70);
                int var121 = class230.field3713.method2016(2);
                int var122 = class230.field3713.method2038((byte) -95);
                if (class173.method1172(var120, 101)) {
                    if (var122 == 2) {
                        class123.method836(0);
                    }
                    class253.field3936 = var121;
                    class330.method2233(24687, var121);
                    class221.method1479(false, 12918);
                    class313.method2148(-1, class253.field3936);
                    for (int var123 = 0; var123 < 100; var123++) {
                        class2.field12[var123] = true;
                    }
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 217) {
                int var306 = class230.field3713.method2030((byte) -70);
                int var307 = class230.field3713.method2037((byte) 58);
                class10.method64(var306, var307, (byte) 112);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 234) {
                long var292 = class230.field3713.method2047((byte) -84);
                boolean var294 = false;
                if ((var292 & Long.MIN_VALUE) != 0L) {
                    var294 = true;
                }
                int var295 = class230.field3713.method1994(false);
                byte var296 = class230.field3713.method2001(-3);
                if (var294) {
                    if (class172.field2628 == 0) {
                        class93.field1441 = -1;
                        return true;
                    }
                    boolean var297 = false;
                    long var298 = var292 & Long.MAX_VALUE;
                    int var300;
                    for (var300 = 0; var300 < class172.field2628 && (class146.field2297[var300].field2852 != var298 || class146.field2297[var300].field3401 != var295); var300++) {
                    }
                    if (var300 < class172.field2628) {
                        while (var300 < class172.field2628 - 1) {
                            class146.field2297[var300] = class146.field2297[var300 + 1];
                            var300++;
                        }
                        class172.field2628--;
                        class146.field2297[class172.field2628] = null;
                    }
                } else {
                    String var301 = class230.field3713.method2027(0);
                    class215 var302 = new class215();
                    var302.field2852 = var292;
                    var302.field3408 = class97.method665(50, var302.field2852);
                    var302.field3406 = var301;
                    var302.field3401 = var295;
                    var302.field3405 = var296;
                    int var303;
                    for (var303 = class172.field2628 - 1; var303 >= 0; var303--) {
                        int var304 = class146.field2297[var303].field3408.compareTo(var302.field3408);
                        if (var304 == 0) {
                            class146.field2297[var303].field3401 = var295;
                            class146.field2297[var303].field3405 = var296;
                            class146.field2297[var303].field3406 = var301;
                            if (class230.field3722 == var292) {
                                class294.field4523 = var296;
                            }
                            class93.field1441 = -1;
                            class260.field4034 = class71.field1068;
                            return true;
                        }
                        if (var304 < 0) {
                            break;
                        }
                    }
                    if (class172.field2628 >= class146.field2297.length) {
                        class93.field1441 = -1;
                        return true;
                    }
                    for (int var305 = class172.field2628 - 1; var305 > var303; var305--) {
                        class146.field2297[var305 + 1] = class146.field2297[var305];
                    }
                    if (class172.field2628 == 0) {
                        class146.field2297 = new class215[100];
                    }
                    class146.field2297[var303 + 1] = var302;
                    if (class230.field3722 == var292) {
                        class294.field4523 = var296;
                    }
                    class172.field2628++;
                }
                class93.field1441 = -1;
                class260.field4034 = class71.field1068;
                return true;
            } else if (class93.field1441 == 214) {
                int var291 = class230.field3713.method1994(false);
                if (class173.method1172(var291, 112)) {
                    class166.method1130(0);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 52) {
                class181.field2782 = class230.field3713.method2016(2) * 30;
                class93.field1441 = -1;
                class168.field2570 = class71.field1068;
                return true;
            } else if (class93.field1441 == 15) {
                if (class253.field3936 != -1) {
                    class288.method1874(8, 0, class253.field3936);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 61) {
                int var124 = class230.field3713.method2030((byte) -70);
                int var125 = class230.field3713.method1996(102);
                int var126 = class230.field3713.method1992(true);
                if (var126 == 65535) {
                    var126 = -1;
                }
                int var127 = class230.field3713.method2037((byte) 58);
                if (class173.method1172(var124, 108)) {
                    class207 var128 = class78.method547(var127, 124);
                    if (var128.field3267) {
                        class33.method248(var127, var125, (byte) -48, var126);
                        class291 var129 = class160.method1106(var126, -118);
                        class18.method146(true, var129.field4452, var129.field4484, var127, var129.field4459);
                        class215.method1437(var129.field4478, var129.field4473, 0, var129.field4496, var127);
                    } else if (var126 == -1) {
                        var128.field3204 = 0;
                        class93.field1441 = -1;
                        return true;
                    } else {
                        class291 var130 = class160.method1106(var126, -104);
                        var128.field3247 = var130.field4459;
                        var128.field3183 = var130.field4484 * 100 / var125;
                        var128.field3204 = 4;
                        var128.field3215 = var130.field4452;
                        var128.field3207 = var126;
                        class277.method1822(4096, var128);
                    }
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 187) {
                int var290 = class230.field3713.method1994(false);
                if (class173.method1172(var290, 119)) {
                    class311.method2137(-100);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 66) {
                class307.method2117(-5709, class230.field3713.method2027(0));
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 206) {
                long var286 = class230.field3713.method2047((byte) -84);
                int var288 = class230.field3713.method1994(false);
                String var289 = class188.method1288(var288, (byte) 81).method1010(class230.field3713, 118);
                class128.method862(class305.method2073(false, var286), (String) null, var288, true, var289, 19);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 221) {
                for (int var284 = 0; var284 < class64.field966.length; var284++) {
                    if (class64.field966[var284] != null) {
                        class64.field966[var284].field507 = -1;
                    }
                }
                for (int var285 = 0; var285 < class208.field3313.length; var285++) {
                    if (class208.field3313[var285] != null) {
                        class208.field3313[var285].field507 = -1;
                    }
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 0) {
                int var281 = class230.field3713.method1994(false);
                int var282 = class230.field3713.method1996(93);
                int var283 = class230.field3713.method2030((byte) -70);
                if (var281 == 65535) {
                    var281 = -1;
                }
                if (class173.method1172(var283, 99)) {
                    class199.method1343(false, 1, var281, -1, var282);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 164) {
                int var131 = class230.field3713.method2016(2);
                int var132 = class230.field3713.method2030((byte) -70);
                int var133 = class230.field3713.method2002(107);
                class80 var134 = class208.field3313[var131];
                if (var134 != null) {
                    class112.method749(-88, var132, var133, var134);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 253) {
                int var275 = class230.field3713.method1994(false);
                int var276 = class230.field3713.method2043((byte) -108);
                int var277 = class230.field3713.method2043((byte) -110);
                int var278 = class230.field3713.method2043((byte) -116);
                int var279 = class230.field3713.method2043((byte) -117);
                int var280 = class230.field3713.method1994(false);
                if (class173.method1172(var275, 91)) {
                    class86.field1304[var276] = true;
                    class336.field5222[var276] = var277;
                    class236.field3793[var276] = var278;
                    class96.field1478[var276] = var279;
                    class99.field1536[var276] = var280;
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 9) {
                class144.field2289 = class230.field3713.method2043((byte) -118);
                class93.field1441 = -1;
                class315.field4968 = class71.field1068;
                return true;
            } else if (class93.field1441 == 176 || class93.field1441 == 109 || class93.field1441 == 57 || class93.field1441 == 183 || class93.field1441 == 34 || class93.field1441 == 29 || class93.field1441 == 24 || class93.field1441 == 171 || class93.field1441 == 7 || class93.field1441 == 193 || class93.field1441 == 151 || class93.field1441 == 53 || class93.field1441 == 82 || class93.field1441 == 99) {
                class285.method1865(4);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 46) {
                int var273 = class230.field3713.method1992(true);
                int var274 = class230.field3713.method2038((byte) -105);
                class10.method64(var273, var274, (byte) 51);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 162) {
                class200.field3025 = class230.field3713.method2038((byte) -67);
                class329.field5087 = class230.field3713.method2002(-82);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 78) {
                int var268 = class230.field3713.method2002(-60);
                int var269 = class230.field3713.method2010(90);
                int var270 = class230.field3713.method1992(true);
                int var271 = class230.field3713.method2016(2);
                if (class173.method1172(var270, 76)) {
                    class45 var272 = (class45) class166.field2557.method1558((long) var269, false);
                    if (var272 != null) {
                        class157.method1095(var272, var272.field640 != var271, -18772);
                    }
                    class47.method322(110, var269, var271, var268);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 30) {
                int var265 = class230.field3713.method2016(2);
                int var266 = class230.field3713.method1992(true);
                String var267 = class230.field3713.method2027(0);
                if (class173.method1172(var265, 70)) {
                    class194.method1317(var267, var266, 2);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 148) {
                class260.field4034 = class71.field1068;
                long var135 = class230.field3713.method2047((byte) -84);
                if (var135 == 0L) {
                    class172.field2628 = 0;
                    class168.field2573 = null;
                    class124.field1940 = null;
                    class146.field2297 = null;
                    class93.field1441 = -1;
                    return true;
                }
                long var137 = class230.field3713.method2047((byte) -84);
                class124.field1940 = class97.method665(50, var137);
                class168.field2573 = class97.method665(50, var135);
                class139.field2157 = class230.field3713.method2001(-3);
                int var139 = class230.field3713.method2043((byte) -114);
                if (var139 == 255) {
                    class93.field1441 = -1;
                    return true;
                }
                class215[] var140 = new class215[100];
                class172.field2628 = var139;
                for (int var141 = 0; var141 < class172.field2628; var141++) {
                    var140[var141] = new class215();
                    var140[var141].field2852 = class230.field3713.method2047((byte) -84);
                    var140[var141].field3408 = class97.method665(50, var140[var141].field2852);
                    var140[var141].field3401 = class230.field3713.method1994(false);
                    var140[var141].field3405 = class230.field3713.method2001(-3);
                    var140[var141].field3406 = class230.field3713.method2027(0);
                    if (class230.field3722 == var140[var141].field2852) {
                        class294.field4523 = var140[var141].field3405;
                    }
                }
                boolean var142 = false;
                int var143 = class172.field2628;
                while (var143 > 0) {
                    boolean var144 = true;
                    var143--;
                    for (int var145 = 0; var145 < var143; var145++) {
                        if (var140[var145].field3408.compareTo(var140[var145 + 1].field3408) > 0) {
                            class215 var146 = var140[var145];
                            var140[var145] = var140[var145 + 1];
                            var140[var145 + 1] = var146;
                            var144 = false;
                        }
                    }
                    if (var144) {
                        break;
                    }
                }
                class146.field2297 = var140;
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 28) {
                int var262 = class230.field3713.method2016(2);
                int var263 = class230.field3713.method2037((byte) 58);
                int var264 = class230.field3713.method1992(true);
                if (class173.method1172(var264, 67)) {
                    class4.method25(var263, 0, var262);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 31) {
                class288.method1879(0);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 116) {
                class314.field4954 = class230.field3713.method2043((byte) -118);
                class74.field1100 = class230.field3713.method2043((byte) -116);
                class106.field1632 = class230.field3713.method2043((byte) -108);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 226) {
                int var252 = class230.field3713.method2016(2);
                int var253 = class230.field3713.method1996(-87);
                int var254 = class230.field3713.method2016(2);
                if (var254 == 65535) {
                    var254 = -1;
                }
                int var255 = class230.field3713.method2030((byte) -70);
                if (var255 == 65535) {
                    var255 = -1;
                }
                int var256 = class230.field3713.method1994(false);
                if (class173.method1172(var256, 72)) {
                    for (int var257 = var255; var257 <= var254; var257++) {
                        long var258 = ((long) var253 << 32) + (long) var257;
                        class108 var260 = (class108) class262.field4050.method1558(var258, false);
                        class108 var261;
                        if (var260 != null) {
                            var261 = new class108(var260.field1664, var252);
                            var260.method1284(0);
                        } else if (var257 == -1) {
                            var261 = new class108(class78.method547(var253, 106).field3180.field1664, var252);
                        } else {
                            var261 = new class108(0, var252);
                        }
                        class262.field4050.method1550(var261, var258, (byte) 110);
                    }
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 18) {
                int var147 = class230.field3713.method2037((byte) 58);
                class266.field4106 = class89.field1359.method1518(var147, 111);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 168) {
                long var249 = class230.field3713.method2047((byte) -84);
                String var251 = class180.method1238(class268.method1775(class131.method902(8, class230.field3713), (byte) -42));
                class343.method2390(var251, 6, false, class305.method2073(false, var249));
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 248) {
                int var148 = class230.field3713.method1992(true);
                int var149 = class230.field3713.method2021(true);
                int var150 = class230.field3713.method1994(false);
                int var151 = class230.field3713.method1994(false);
                if (class173.method1172(var150, 68)) {
                    class108.method736((var151 << 16) + var148, 0, var149);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 195) {
                int var247 = class230.field3713.method2038((byte) -114);
                int var248 = class230.field3713.method1992(true);
                if (var248 == 65535) {
                    var248 = -1;
                }
                class17.method131(var248, var247, 1000);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 137) {
                int var152 = class230.field3713.method1994(false);
                int var153 = class230.field3713.method2002(-113);
                if (var152 == 65535) {
                    var152 = -1;
                }
                int var154 = class230.field3713.method2059(255);
                class144.method1008(var152, var153, var154, -1448946488);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 132) {
                long var228 = class230.field3713.method2047((byte) -84);
                int var230 = class230.field3713.method1994(false);
                int var231 = class230.field3713.method2043((byte) -127);
                boolean var232 = true;
                if (var228 < 0L) {
                    var228 &= Long.MAX_VALUE;
                    var232 = false;
                }
                String var233 = "";
                if (var230 > 0) {
                    var233 = class230.field3713.method2027(0);
                }
                String var234 = class305.method2073(false, var228);
                for (int var235 = 0; var235 < class116.field1795; var235++) {
                    if (class81.field1205[var235] == var228) {
                        if (class95.field1455[var235] != var230) {
                            class95.field1455[var235] = var230;
                            if (var230 > 0) {
                                class343.method2390(var234 + class177.field2693, 5, false, "");
                            }
                            if (var230 == 0) {
                                class343.method2390(var234 + class152.field2411, 5, false, "");
                            }
                        }
                        var234 = null;
                        class30.field373[var235] = var233;
                        class229.field3673[var235] = var231;
                        class291.field4454[var235] = var232;
                        break;
                    }
                }
                if (var234 != null && class116.field1795 < 200) {
                    class81.field1205[class116.field1795] = var228;
                    class120.field1851[class116.field1795] = var234;
                    class95.field1455[class116.field1795] = var230;
                    class30.field373[class116.field1795] = var233;
                    class229.field3673[class116.field1795] = var231;
                    class291.field4454[class116.field1795] = var232;
                    class116.field1795++;
                }
                boolean var236 = false;
                class315.field4968 = class71.field1068;
                int var237 = class116.field1795;
                while (var237 > 0) {
                    boolean var238 = true;
                    var237--;
                    for (int var239 = 0; var239 < var237; var239++) {
                        if (class95.field1455[var239] != class19.field259 && class95.field1455[var239 + 1] == class19.field259 || class95.field1455[var239] == 0 && class95.field1455[var239 + 1] != 0) {
                            int var240 = class95.field1455[var239];
                            class95.field1455[var239] = class95.field1455[var239 + 1];
                            class95.field1455[var239 + 1] = var240;
                            var238 = false;
                            String var241 = class30.field373[var239];
                            class30.field373[var239] = class30.field373[var239 + 1];
                            class30.field373[var239 + 1] = var241;
                            String var242 = class120.field1851[var239];
                            class120.field1851[var239] = class120.field1851[var239 + 1];
                            class120.field1851[var239 + 1] = var242;
                            long var243 = class81.field1205[var239];
                            class81.field1205[var239] = class81.field1205[var239 + 1];
                            class81.field1205[var239 + 1] = var243;
                            int var245 = class229.field3673[var239];
                            class229.field3673[var239] = class229.field3673[var239 + 1];
                            class229.field3673[var239 + 1] = var245;
                            boolean var246 = class291.field4454[var239];
                            class291.field4454[var239] = class291.field4454[var239 + 1];
                            class291.field4454[var239 + 1] = var246;
                        }
                    }
                    if (var238) {
                        break;
                    }
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 159) {
                class275.method1802(-7242);
                int var155 = class230.field3713.method2002(-90);
                int var156 = class230.field3713.method1996(60);
                int var157 = class230.field3713.method2053(-21097);
                class205.field3106[var155] = var156;
                class314.field4951[var155] = var157;
                class139.field2156[var155] = 1;
                for (int var158 = 0; var158 < 98; var158++) {
                    if (var156 >= class79.field1172[var158]) {
                        class139.field2156[var155] = var158 + 2;
                    }
                }
                class54.field760[class311.method2135(31, class132.field2091++)] = var155;
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 218) {
                int var222 = class230.field3713.method1994(false);
                int var223 = class230.field3713.method2043((byte) -111);
                int var224 = class230.field3713.method2043((byte) -107);
                int var225 = class230.field3713.method1994(false);
                int var226 = class230.field3713.method2043((byte) -121);
                int var227 = class230.field3713.method2043((byte) -106);
                if (class173.method1172(var222, 75)) {
                    class310.method2133(var225, var227, true, var226, var223, -1, var224);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 6) {
                int var217 = class230.field3713.method1994(false);
                int var218 = class230.field3713.method2016(2);
                int var219 = class230.field3713.method1996(-90);
                int var220 = class230.field3713.method2030((byte) -70);
                int var221 = class230.field3713.method2016(2);
                if (class173.method1172(var221, 91)) {
                    class18.method146(true, var217, var220, var219, var218);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 200) {
                class275.method1802(-7242);
                class158.field2469 = class230.field3713.method2043((byte) -121);
                class93.field1441 = -1;
                class168.field2570 = class71.field1068;
                return true;
            } else if (class93.field1441 == 128) {
                class256.method1723(true);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 114) {
                int var159 = class230.field3713.method2016(2);
                if (var159 == 65535) {
                    var159 = -1;
                }
                int var160 = class230.field3713.method1994(false);
                int var161 = class230.field3713.method2037((byte) 58);
                if (class173.method1172(var160, 82)) {
                    class199.method1343(false, 2, var159, -1, var161);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 71) {
                int var162 = class230.field3713.method1994(false);
                if (var162 == 65535) {
                    var162 = -1;
                }
                int var163 = class230.field3713.method2043((byte) -110);
                int var164 = class230.field3713.method1994(false);
                int var165 = class230.field3713.method2043((byte) -109);
                class118.method810(var162, true, var163, var165, var164);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 191) {
                int var216 = class230.field3713.method2043((byte) -114);
                if (class230.field3713.method2043((byte) -107) == 0) {
                    class106.field1623[var216] = new class196();
                } else {
                    class230.field3713.field4679--;
                    class106.field1623[var216] = new class196(class230.field3713);
                }
                class93.field1441 = -1;
                class329.field5097 = class71.field1068;
                return true;
            } else if (class93.field1441 == 44) {
                int var213 = class230.field3713.method1992(true);
                int var214 = class230.field3713.method1994(false);
                String var215 = class230.field3713.method2027(0);
                if (class173.method1172(var214, 92)) {
                    class194.method1317(var215, var213, 2);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 16) {
                int var166 = class230.field3713.method1996(44);
                int var167 = class230.field3713.method1994(false);
                class207 var168;
                if (var166 < 0) {
                    var168 = null;
                } else {
                    var168 = class78.method547(var166, 97);
                }
                if (var166 < -70000) {
                    var167 += 32768;
                }
                while (class230.field3713.field4679 < class85.field1284) {
                    int var169 = class230.field3713.method2003(-17);
                    int var170 = 0;
                    int var171 = class230.field3713.method1994(false);
                    if (var171 != 0) {
                        var170 = class230.field3713.method2043((byte) -123);
                        if (var170 == 255) {
                            var170 = class230.field3713.method1996(-64);
                        }
                    }
                    if (var168 != null && var169 >= 0 && var169 < var168.field3301.length) {
                        var168.field3301[var169] = var171;
                        var168.field3227[var169] = var170;
                    }
                    class299.method1970(var169, -1, var170, var167, var171 - 1);
                }
                if (var168 != null) {
                    class277.method1822(4096, var168);
                }
                class275.method1802(-7242);
                class95.field1451[class311.method2135(class162.field2503++, 31)] = class311.method2135(32767, var167);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 48) {
                class200.field3025 = class230.field3713.method2002(95);
                class329.field5087 = class230.field3713.method2002(105);
                while (class85.field1284 > class230.field3713.field4679) {
                    class93.field1441 = class230.field3713.method2043((byte) -109);
                    class285.method1865(4);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 180) {
                int var205 = class230.field3713.method1996(92);
                int var206 = class230.field3713.method1994(false);
                if (var205 < -70000) {
                    var206 += 32768;
                }
                class207 var207;
                if (var205 < 0) {
                    var207 = null;
                } else {
                    var207 = class78.method547(var205, 99);
                }
                if (var207 != null) {
                    for (int var208 = 0; var208 < var207.field3301.length; var208++) {
                        var207.field3301[var208] = 0;
                        var207.field3227[var208] = 0;
                    }
                }
                class228.method1565(var206, 28521);
                int var209 = class230.field3713.method1994(false);
                for (int var210 = 0; var210 < var209; var210++) {
                    int var211 = class230.field3713.method2043((byte) -125);
                    if (var211 == 255) {
                        var211 = class230.field3713.method1996(-108);
                    }
                    int var212 = class230.field3713.method1992(true);
                    if (var207 != null && var210 < var207.field3301.length) {
                        var207.field3301[var210] = var212;
                        var207.field3227[var210] = var211;
                    }
                    class299.method1970(var210, -1, var211, var206, var212 - 1);
                }
                if (var207 != null) {
                    class277.method1822(4096, var207);
                }
                class275.method1802(-7242);
                class95.field1451[class311.method2135(class162.field2503++, 31)] = class311.method2135(var206, 32767);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 121) {
                int var172 = class230.field3713.method2030((byte) -70);
                class78.method546((byte) 126, var172);
                class95.field1451[class311.method2135(class162.field2503++, 31)] = class311.method2135(var172, 32767);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 86) {
                int var173 = class230.field3713.method2030((byte) -70);
                int var174 = class230.field3713.method2037((byte) 58);
                class86.method591(var174, -123, var173);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 207) {
                long var190 = class230.field3713.method2047((byte) -84);
                class230.field3713.method2001(-3);
                long var192 = class230.field3713.method2047((byte) -84);
                boolean var194 = false;
                long var195 = (long) class230.field3713.method1994(false);
                long var197 = (long) class230.field3713.method2059(255);
                int var199 = class230.field3713.method2043((byte) -118);
                long var200 = (var195 << 32) + var197;
                int var202 = 0;
                label1500: while (true) {
                    if (var202 >= 100) {
                        if (var199 <= 1) {
                            if ((!class50.field707 || class83.field1258) && !class207.field3288) {
                                for (int var203 = 0; var203 < class190.field2891; var203++) {
                                    if (class115.field1792[var203] == var190) {
                                        var194 = true;
                                        break label1500;
                                    }
                                }
                            } else {
                                var194 = true;
                            }
                        }
                        break;
                    }
                    if (class121.field1864[var202] == var200) {
                        var194 = true;
                        break;
                    }
                    var202++;
                }
                if (!var194 && class7.field83 == 0) {
                    class121.field1864[class17.field164] = var200;
                    class17.field164 = (class17.field164 + 1) % 100;
                    String var204 = class180.method1238(class268.method1775(class131.method902(8, class230.field3713), (byte) -42));
                    if (var199 == 2 || var199 == 3) {
                        class293.method1911(var204, class305.method2073(false, var192), 9, -31574, "<img=1>" + class305.method2073(false, var190));
                    } else if (var199 == 1) {
                        class293.method1911(var204, class305.method2073(false, var192), 9, -31574, "<img=0>" + class305.method2073(false, var190));
                    } else {
                        class293.method1911(var204, class305.method2073(false, var192), 9, -31574, class305.method2073(false, var190));
                    }
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 129) {
                class230.field3713.field4679 += 28;
                if (class230.field3713.method2032((byte) -24)) {
                    class10.method63(class230.field3713, class230.field3713.field4679 - 28, 0);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 186) {
                class115.method793(true, 0);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 64) {
                class24.method176(class89.field1359, class85.field1284, (byte) 90, class230.field3713);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 145) {
                int var175 = class230.field3713.method1994(false);
                int var176 = class230.field3713.method2043((byte) -125);
                int var177 = class230.field3713.method2043((byte) -127);
                int var178 = class230.field3713.method1994(false);
                int var179 = class230.field3713.method2043((byte) -105);
                int var180 = class230.field3713.method2043((byte) -120);
                if (class173.method1172(var175, 113)) {
                    class131.method899(var179, var178, false, var177, var180, var176);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 120) {
                int var187 = class230.field3713.method2010(91);
                class207 var188 = class78.method547(var187, 112);
                for (int var189 = 0; var189 < var188.field3301.length; var189++) {
                    var188.field3301[var189] = -1;
                    var188.field3301[var189] = 0;
                }
                class277.method1822(4096, var188);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 209) {
                class278.field4288 = class230.field3713.method2043((byte) -108);
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 240) {
                class200.field3025 = class230.field3713.method2038((byte) -103);
                class329.field5087 = class230.field3713.method2043((byte) -125);
                for (int var184 = class200.field3025; var184 < class200.field3025 + 8; var184++) {
                    for (int var185 = class329.field5087; var185 < (class329.field5087 + 8); var185++) {
                        if (class274.field4221[class77.field1154][var184][var185] != null) {
                            class274.field4221[class77.field1154][var184][var185] = null;
                            class310.method2134(var185, var184, 4);
                        }
                    }
                }
                for (class208 var186 = (class208) class203.field3069.method10((byte) 119); var186 != null; var186 = (class208) class203.field3069.method13((byte) -32)) {
                    if (var186.field3316 >= class200.field3025 && class200.field3025 + 8 > var186.field3316 && var186.field3322 >= class329.field5087 && var186.field3322 < class329.field5087 + 8 && class77.field1154 == var186.field3305) {
                        var186.field3320 = 0;
                    }
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 119) {
                int var181 = class230.field3713.method2042(7);
                int var182 = class230.field3713.method1992(true);
                int var183 = class230.field3713.method2010(109);
                if (class173.method1172(var182, 117)) {
                    class339.method2351(13406, var183, var181);
                }
                class93.field1441 = -1;
                return true;
            } else if (class93.field1441 == 77) {
                client.method891(-8);
                class275.method1802(-7242);
                class101.field1576 += 32;
                class93.field1441 = -1;
                return true;
            } else {
                class291.method1892("T1 - " + class93.field1441 + "," + class338.field5230 + "," + class6.field69 + " - " + class85.field1284, (Throwable) null, -2);
                class173.method1177((byte) -74);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLjava/lang/String;)J", line = 3090)
    public static final long method1062(byte arg0, String arg1) {
        field2381++;
        int var2 = arg1.length();
        if (arg0 != -92) {
            return -101L;
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg1.charAt(var5) + ((var3 << 5) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V", line = 3114)
    public static void method1063(byte arg0) {
        field2386 = null;
        field2383 = null;
        field2387 = null;
        field2385 = null;
        field2384 = null;
        field2380 = (byte[][]) null;
        if (arg0 <= -76) {
            field2379 = null;
        }
    }
}
