import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class192 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public int field3499 = -1;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Z")
    public boolean field3507 = true;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public int field3504 = 8;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public int field3506 = 0;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public int field3516 = 16;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public int field3513 = 128;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Z")
    public boolean field3514 = true;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public int field3512 = 1190717;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "Z")
    public boolean field3521 = false;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public int field3522 = -1;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Lke;")
    public static class256 field3500 = class316.method2202("Musik)2Engine vorbereitet)3", 27626);

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "[[I")
    public static int[][] field3519 = new int[5][5000];

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field3523 = 0;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Lla;")
    public static class188 field3509;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "[I")
    public static int[] field3502;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "[Lrd;")
    public static class135[] field3511;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILra;I)V", line = 7)
    public final void method1388(int arg0, class41 arg1, int arg2) {
        if (arg2 != -6) {
            return;
        }
        while (true) {
            int var4 = arg1.method357(false);
            if (var4 == 0) {
                field3520++;
                return;
            }
            this.method1394(arg1, 2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Lgd;", line = 31)
    public static final class137 method1389(int arg0, int arg1) {
        class137 var2 = (class137) class45.field841.method1260(-65, (long) arg0);
        field3503++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class73.field1336.method1016(arg0, 100, 0);
        if (var3 == null) {
            return null;
        }
        class137 var4 = new class137();
        class41 var5 = new class41(var3);
        var5.field738 = var5.field772.length - 2;
        int var6 = var5.method346(-16);
        int var7 = var5.field772.length - var6 - 14;
        var5.field738 = var7;
        int var8 = var5.method327(4);
        var4.field2387 = var5.method346(-16);
        var4.field2378 = var5.method346(-16);
        if (arg1 <= 76) {
            field3500 = (class256) null;
        }
        var4.field2385 = var5.method346(-16);
        var4.field2379 = var5.method346(-16);
        int var9 = var5.method357(false);
        if (var9 > 0) {
            var4.field2388 = new class254[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method346(-16);
                class254 var12 = new class254(class124.method859((byte) -120, var11));
                var4.field2388[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method327(4);
                    int var14 = var5.method327(4);
                    var12.method1749(true, new class6(var14), (long) var13);
                }
            }
        }
        var5.field738 = 0;
        var4.field2382 = var5.method338(-19477);
        var4.field2386 = new int[var8];
        var4.field2380 = new int[var8];
        int var15 = 0;
        var4.field2393 = new class256[var8];
        while (var7 > var5.field738) {
            int var16 = var5.method346(-16);
            if (var16 == 3) {
                var4.field2393[var15] = var5.method313((byte) 54);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field2380[var15] = var5.method357(false);
            } else {
                var4.field2380[var15] = var5.method327(4);
            }
            var4.field2386[var15++] = var16;
        }
        class45.field841.method1259(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLla;)Z", line = 120)
    public static final boolean method1390(boolean arg0, class188 arg1) {
        field3505++;
        if (arg0) {
            field3509 = (class188) null;
        }
        if (arg1.field3357 == 205) {
            class42.field809 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)V", line = 144)
    public static final void method1391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3508++;
        if (class21.field273 == 0) {
            int var7 = class105.field1885;
            int var8 = class91.field1667;
            int var9 = class295.field5122;
            int var10 = class49.field890;
            int var11 = (arg3 - arg0) * (var8 - var7) / arg2 + var7;
            int var12 = (arg5 - arg4) * (var10 - var9) / arg1 + var9;
            if (class320.field5489 && (class173.field3079 & 0x40) == 64) {
                class188 var13 = client.method832(class170.field3024, 25767, class96.field1710);
                if (var13 == null) {
                    class9.method60(128);
                } else {
                    class144.method1057(class233.field3990, var12, (short) 5, -45, var11, class261.field4511, -1, 0L);
                }
            } else {
                if (class206.field3735 == 1) {
                    class144.method1057(class46.field844, var12, (short) 33, 102, var11, class282.field4908, -1, 0L);
                }
                class164.field2912++;
                class144.method1057(class46.field844, var12, (short) 17, -110, var11, class177.field3138, -1, 0L);
            }
        }
        long var14 = -1L;
        if (arg6 > -55) {
            field3511 = (class135[]) null;
        }
        for (int var16 = 0; var16 < class177.field3136; var16++) {
            long var17 = class139.field2445[var16];
            int var19 = (int) var17 >> 7 & 0x7F;
            int var20 = (int) var17 & 0x7F;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class162.method1197(class255.field4377, var20, var19, var17)) {
                    class273 var23 = class271.method1871(126, var22);
                    if (var23.field4664 != null) {
                        var23 = var23.method1887(-73);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class21.field273 == 1) {
                        class144.method1057(class30.method214(new class256[] { class99.field1765, class249.field4237, var23.field4691 }, 29784), var19, (short) 39, 117, var20, class251.field4260, class76.field1450, var17);
                        class72.field1325++;
                    } else if (!class320.field5489) {
                        class256[] var24 = var23.field4676;
                        if (class101.field1803) {
                            var24 = class39.method298(var24, (byte) 91);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class51.field934++;
                                    int var26 = -1;
                                    if (var23.field4682 == var25) {
                                        var26 = var23.field4667;
                                    }
                                    short var27 = 0;
                                    if (var25 == 0) {
                                        var27 = 48;
                                    }
                                    if (var25 == 1) {
                                        var27 = 40;
                                    }
                                    if (var23.field4703 == var25) {
                                        var26 = var23.field4678;
                                    }
                                    if (var25 == 2) {
                                        var27 = 51;
                                    }
                                    if (var25 == 3) {
                                        var27 = 34;
                                    }
                                    if (var25 == 4) {
                                        var27 = 1001;
                                    }
                                    class144.method1057(class30.method214(new class256[] { class298.field5162, var23.field4691 }, 29784), var19, var27, -65, var20, var24[var25], var26, var17);
                                }
                            }
                        }
                        class144.method1057(class30.method214(new class256[] { class298.field5162, var23.field4691 }, 29784), var19, (short) 1006, -102, var20, class88.field1575, class241.field4106, (long) var23.field4684);
                        class143.field2499++;
                    } else if ((class173.field3079 & 0x4) == 4) {
                        class144.method1057(class30.method214(new class256[] { class24.field319, class249.field4237, var23.field4691 }, 29784), var19, (short) 35, 99, var20, class261.field4511, -1, var17);
                        class239.field4071++;
                    }
                }
                if (var21 == 1) {
                    class279 var28 = class187.field3281[var22];
                    if (var28.field4860.field1418 == 1 && (var28.field1192 & 0x7F) == 64 && (var28.field1197 & 0x7F) == 64) {
                        for (int var29 = 0; var29 < class311.field5357; var29++) {
                            class279 var30 = class187.field3281[class141.field2480[var29]];
                            if (var30 != null && var28 != var30 && var30.field4860.field1418 == 1 && var28.field1192 == var30.field1192 && var28.field1197 == var30.field1197) {
                                class121.method812(var20, class141.field2480[var29], var19, var30.field4860, false);
                            }
                        }
                        for (int var31 = 0; var31 < class67.field1206; var31++) {
                            class144 var32 = class300.field5172[class140.field2463[var31]];
                            if (var32 != null && var28.field1192 == var32.field1192 && var28.field1197 == var32.field1197) {
                                class68.method527((byte) -79, var19, var32, var20, class140.field2463[var31]);
                            }
                        }
                    }
                    class121.method812(var20, var22, var19, var28.field4860, false);
                }
                if (var21 == 0) {
                    class144 var33 = class300.field5172[var22];
                    if ((var33.field1192 & 0x7F) == 64 && (var33.field1197 & 0x7F) == 64) {
                        for (int var34 = 0; var34 < class311.field5357; var34++) {
                            class279 var35 = class187.field3281[class141.field2480[var34]];
                            if (var35 != null && var35.field4860.field1418 == 1 && var33.field1192 == var35.field1192 && var33.field1197 == var35.field1197) {
                                class121.method812(var20, class141.field2480[var34], var19, var35.field4860, false);
                            }
                        }
                        for (int var36 = 0; var36 < class67.field1206; var36++) {
                            class144 var37 = class300.field5172[class140.field2463[var36]];
                            if (var37 != null && var33 != var37 && var33.field1192 == var37.field1192 && var33.field1197 == var37.field1197) {
                                class68.method527((byte) -99, var19, var37, var20, class140.field2463[var36]);
                            }
                        }
                    }
                    class68.method527((byte) -128, var19, var33, var20, var22);
                }
                if (var21 == 3) {
                    class175 var38 = class230.field3934[class255.field4377][var20][var19];
                    if (var38 != null) {
                        for (class248 var39 = (class248) var38.method1272(true); var39 != null; var39 = (class248) var38.method1276((byte) -124)) {
                            int var40 = var39.field4218.field2508;
                            class36 var41 = class254.method1753(var40, true);
                            if (class21.field273 == 1) {
                                class144.method1057(class30.method214(new class256[] { class99.field1765, class313.field5391, var41.field591 }, 29784), var19, (short) 4, -84, var20, class251.field4260, class76.field1450, (long) var40);
                                class64.field1128++;
                            } else if (!class320.field5489) {
                                class170.field3025++;
                                class256[] var42 = var41.field600;
                                if (class101.field1803) {
                                    var42 = class39.method298(var42, (byte) 90);
                                }
                                for (int var43 = 4; var43 >= 0; var43--) {
                                    if (var42 != null && var42[var43] != null) {
                                        class290.field5013++;
                                        byte var44 = 0;
                                        if (var43 == 0) {
                                            var44 = 24;
                                        }
                                        if (var43 == 1) {
                                            var44 = 25;
                                        }
                                        if (var43 == 2) {
                                            var44 = 43;
                                        }
                                        int var45 = -1;
                                        if (var43 == 3) {
                                            var44 = 29;
                                        }
                                        if (var41.field582 == var43) {
                                            var45 = var41.field602;
                                        }
                                        if (var43 == 4) {
                                            var44 = 6;
                                        }
                                        if (var41.field611 == var43) {
                                            var45 = var41.field574;
                                        }
                                        class144.method1057(class30.method214(new class256[] { class119.field2107, var41.field591 }, 29784), var19, var44, 126, var20, var42[var43], var45, (long) var40);
                                    }
                                }
                                class144.method1057(class30.method214(new class256[] { class119.field2107, var41.field591 }, 29784), var19, (short) 1005, -97, var20, class88.field1575, class241.field4106, (long) var40);
                            } else if ((class173.field3079 & 0x1) == 1) {
                                class28.field388++;
                                class144.method1057(class30.method214(new class256[] { class24.field319, class313.field5391, var41.field591 }, 29784), var19, (short) 38, 100, var20, class261.field4511, -1, (long) var40);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IIIIIII)V", line = 492)
    public static final void method1392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class115.method788(arg1, -25207);
        field3518++;
        int var7 = arg1 - arg3;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = 0;
        int var9 = arg1;
        int var10 = -var7;
        int var11 = -arg1;
        if (class105.field1887 <= arg6 && arg6 <= class274.field4748) {
            int[] var12 = class308.field5329[arg6];
            int var13 = class101.method731(class175.field3106, arg4 - arg1, class244.field4161, true);
            int var14 = class101.method731(class175.field3106, arg1 + arg4, class244.field4161, true);
            int var15 = class101.method731(class175.field3106, arg4 - var7, class244.field4161, true);
            int var16 = class101.method731(class175.field3106, arg4 + var7, class244.field4161, true);
            class73.method550(-29903, var12, var15, var13, arg2);
            class73.method550(-29903, var12, var16, var15, arg5);
            class73.method550(-29903, var12, var14, var16, arg2);
        }
        int var17 = var7;
        int var18 = -1;
        int var19 = -1;
        while (var9 > var8) {
            var19 += 2;
            var18 += 2;
            var10 += var18;
            var11 += var19;
            if (var10 >= 0 && var17 >= 1) {
                var17--;
                var10 -= var17 << 1;
                class31.field490[var17] = var8;
            }
            var8++;
            if (var11 >= 0) {
                var9--;
                int var20 = arg6 - var9;
                var11 -= var9 << 1;
                int var21 = arg6 + var9;
                if (var21 >= class105.field1887 && class274.field4748 >= var20) {
                    if (var7 > var9) {
                        int var22 = class31.field490[var9];
                        int var23 = class101.method731(class175.field3106, arg4 + var8, class244.field4161, true);
                        int var24 = class101.method731(class175.field3106, arg4 - var8, class244.field4161, true);
                        int var25 = class101.method731(class175.field3106, arg4 + var22, class244.field4161, true);
                        int var26 = class101.method731(class175.field3106, arg4 - var22, class244.field4161, true);
                        if (class274.field4748 >= var21) {
                            int[] var27 = class308.field5329[var21];
                            class73.method550(-29903, var27, var26, var24, arg2);
                            class73.method550(-29903, var27, var25, var26, arg5);
                            class73.method550(-29903, var27, var23, var25, arg2);
                        }
                        if (class105.field1887 <= var20) {
                            int[] var28 = class308.field5329[var20];
                            class73.method550(-29903, var28, var26, var24, arg2);
                            class73.method550(-29903, var28, var25, var26, arg5);
                            class73.method550(-29903, var28, var23, var25, arg2);
                        }
                    } else {
                        int var29 = class101.method731(class175.field3106, arg4 + var8, class244.field4161, true);
                        int var30 = class101.method731(class175.field3106, arg4 - var8, class244.field4161, true);
                        if (var21 <= class274.field4748) {
                            class73.method550(-29903, class308.field5329[var21], var29, var30, arg2);
                        }
                        if (var20 >= class105.field1887) {
                            class73.method550(-29903, class308.field5329[var20], var29, var30, arg2);
                        }
                    }
                }
            }
            int var31 = arg6 - var8;
            int var32 = arg6 + var8;
            if (var32 >= class105.field1887 && class274.field4748 >= var31) {
                int var33 = arg4 + var9;
                int var34 = arg4 - var9;
                if (var33 >= class244.field4161 && class175.field3106 >= var34) {
                    int var35 = class101.method731(class175.field3106, var33, class244.field4161, true);
                    int var36 = class101.method731(class175.field3106, var34, class244.field4161, true);
                    if (var8 < var7) {
                        int var37 = var8 > var17 ? class31.field490[var8] : var17;
                        int var38 = class101.method731(class175.field3106, arg4 + var37, class244.field4161, true);
                        int var39 = class101.method731(class175.field3106, arg4 - var37, class244.field4161, true);
                        if (var32 <= class274.field4748) {
                            int[] var40 = class308.field5329[var32];
                            class73.method550(-29903, var40, var39, var36, arg2);
                            class73.method550(-29903, var40, var38, var39, arg5);
                            class73.method550(-29903, var40, var35, var38, arg2);
                        }
                        if (class105.field1887 <= var31) {
                            int[] var41 = class308.field5329[var31];
                            class73.method550(-29903, var41, var39, var36, arg2);
                            class73.method550(-29903, var41, var38, var39, arg5);
                            class73.method550(-29903, var41, var35, var38, arg2);
                        }
                    } else {
                        if (var32 <= class274.field4748) {
                            class73.method550(-29903, class308.field5329[var32], var35, var36, arg2);
                        }
                        if (var31 >= class105.field1887) {
                            class73.method550(-29903, class308.field5329[var31], var35, var36, arg2);
                        }
                    }
                }
            }
        }
        if (arg0 <= 69) {
            field3509 = (class188) null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V", line = 692)
    public static final void method1393(int arg0, boolean arg1) {
        if (arg1) {
            method1390(true, (class188) null);
        }
        field3515++;
        class305.field5252.method2075(arg0, 1);
        class9.field139.method2075(arg0, 1);
        class201.field3662.method2075(arg0, 1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lra;III)V", line = 716)
    private final void method1394(class41 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field3506 = class19.method119((byte) 100, arg0.method349((byte) -118));
        } else if (arg3 == 2) {
            this.field3522 = arg0.method357(false);
        } else if (arg3 == 3) {
            this.field3522 = arg0.method346(-16);
            if (this.field3522 == 65535) {
                this.field3522 = -1;
            }
        } else if (arg3 == 5) {
            this.field3507 = false;
        } else if (arg3 == 7) {
            this.field3499 = class19.method119((byte) -119, arg0.method349((byte) -104));
        } else if (arg3 == 8) {
            class181.field3196 = arg2;
        } else if (arg3 == 9) {
            this.field3513 = arg0.method346(-16);
        } else if (arg3 == 10) {
            this.field3514 = false;
        } else if (arg3 == 11) {
            this.field3504 = arg0.method357(false);
        } else if (arg3 == 12) {
            this.field3521 = true;
        } else if (arg3 == 13) {
            this.field3512 = arg0.method349((byte) 76);
        } else if (arg3 == 14) {
            this.field3516 = arg0.method357(false);
        }
        field3517++;
        if (arg1 != 2) {
            method1391(104, 13, -50, -27, -112, 7, 1);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 786)
    public static void method1395(int arg0) {
        field3500 = null;
        field3519 = (int[][]) null;
        field3502 = null;
        int var1 = 6 % ((49 - arg0) / 32);
        field3509 = null;
        field3511 = null;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 807)
    public static final void method1396(int arg0) {
        class105.field1884.method2076(116);
        if (arg0 != 381251297) {
            field3519 = (int[][]) ((int[][]) null);
        }
        field3501++;
    }
}
