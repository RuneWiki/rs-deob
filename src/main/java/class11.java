import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Lid;")
    public static class60 field181 = method72("(U2", (byte) -114);

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field187 = -1;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "[Lnf;")
    public static class96[] field186 = new class96[4];

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Z")
    public static boolean field193 = false;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lid;")
    public static class60 field190 = method72("bevor Sie den Vorgang wiederholen)3", (byte) -26);

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field196 = 0;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field197 = 0;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lpa;")
    public static class105 field185;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method70(int arg0) {
        for (int var1 = -1; var1 < class44.field1170; var1++) {
            int var6;
            if (var1 == -1) {
                var6 = 2047;
            } else {
                var6 = class121.field2781[var1];
            }
            class1 var7 = class81.field2016[var6];
            if (var7 != null && var7.field831 > 0) {
                var7.field831--;
                if (var7.field831 == 0) {
                    var7.field861 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class72.field1748; var2++) {
            int var4 = class1.field1[var2];
            class53 var5 = class5.field83[var4];
            if (var5 != null && var5.field831 > 0) {
                var5.field831--;
                if (var5.field831 == 0) {
                    var5.field861 = null;
                }
            }
        }
        int var3 = -61 % ((arg0 - 71) / 51);
        field192++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method71(byte arg0) {
        field181 = null;
        if (arg0 < 74) {
            method71((byte) -43);
        }
        field190 = null;
        field185 = null;
        field186 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;B)Lid;")
    public static final class60 method72(String arg0, byte arg1) {
        int var2 = -112 / ((51 - arg1) / 40);
        field189++;
        byte[] var3 = arg0.getBytes();
        int var4 = var3.length;
        int var5 = 0;
        class60 var6 = new class60();
        var6.field1453 = new byte[var4];
        while (var5 < var4) {
            int var7 = var3[var5++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var5 >= var4) {
                    break;
                }
                int var8 = var3[var5++] & 0xFF;
                var6.field1453[var6.field1474++] = (byte) ((var7 - 40) * 43 + var8 - 48);
            } else if (var7 != 0) {
                var6.field1453[var6.field1474++] = (byte) var7;
            }
        }
        var6.method439(false);
        return var6.method449(-5178);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIILl;Lpb;I)V")
    public static final void method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class76 arg7, class106 arg8, int arg9) {
        field183++;
        int var10 = class113.field2711[arg1][arg9][arg3];
        int var11 = class113.field2711[arg1][arg9 + 1][arg3];
        int var12 = class113.field2711[arg1][arg9][arg3 + 1];
        int var13 = class113.field2711[arg1][arg9 + 1][arg3 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class148 var15 = class31.method238(-29628, arg4);
        int var16 = (arg4 << 14) + (arg9 - (-(arg3 << 7) - 1073741824));
        if (var15.field3359 == 0) {
            var16 += Integer.MIN_VALUE;
        }
        int var17 = (arg5 << 6) + arg0;
        if (var15.field3322 == 1) {
            var17 += 256;
        }
        if (arg0 == 22) {
            class50 var18;
            if (var15.field3307 == -1 && var15.field3364 == null) {
                var18 = var15.method1123(var13, (byte) -91, 22, var12, var10, var11, arg5);
            } else {
                var18 = new class135(arg4, 22, arg5, var10, var11, var13, var12, var15.field3307, true, null);
            }
            arg7.method604(arg2, arg9, arg3, var14, var18, var16, var17);
            if (var15.field3348 == 1) {
                arg8.method876(arg3, arg9, (byte) -94);
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class50 var38;
            if (var15.field3307 == -1 && var15.field3364 == null) {
                var38 = var15.method1123(var13, (byte) -95, 10, var12, var10, var11, arg5);
            } else {
                var38 = new class135(arg4, 10, arg5, var10, var11, var13, var12, var15.field3307, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg5 == 1 || arg5 == 3) {
                    var40 = var15.field3330;
                    var39 = var15.field3306;
                } else {
                    var39 = var15.field3330;
                    var40 = var15.field3306;
                }
                int var41 = 0;
                if (arg0 == 11) {
                    var41 += 256;
                }
                arg7.method613(arg2, arg9, arg3, var14, var39, var40, var38, var41, var16, var17);
            }
            if (var15.field3348 != 0) {
                arg8.method873(arg5, 104, arg9, var15.field3306, var15.field3347, var15.field3330, arg3);
            }
        } else if (arg0 >= 12) {
            class50 var19;
            if (var15.field3307 == -1 && var15.field3364 == null) {
                var19 = var15.method1123(var13, (byte) -76, arg0, var12, var10, var11, arg5);
            } else {
                var19 = new class135(arg4, arg0, arg5, var10, var11, var13, var12, var15.field3307, true, null);
            }
            arg7.method613(arg2, arg9, arg3, var14, 1, 1, var19, 0, var16, var17);
            if (var15.field3348 != 0) {
                arg8.method873(arg5, 125, arg9, var15.field3306, var15.field3347, var15.field3330, arg3);
            }
        } else if (arg0 == 0) {
            class50 var20;
            if (var15.field3307 == -1 && var15.field3364 == null) {
                var20 = var15.method1123(var13, (byte) -107, 0, var12, var10, var11, arg5);
            } else {
                var20 = new class135(arg4, 0, arg5, var10, var11, var13, var12, var15.field3307, true, null);
            }
            arg7.method588(arg2, arg9, arg3, var14, var20, null, class69.field1652[arg5], 0, var16, var17);
            if (var15.field3348 != 0) {
                arg8.method875(1, arg3, arg0, arg9, arg5, var15.field3347);
            }
        } else if (arg0 == 1) {
            class50 var21;
            if (var15.field3307 == -1 && var15.field3364 == null) {
                var21 = var15.method1123(var13, (byte) -115, 1, var12, var10, var11, arg5);
            } else {
                var21 = new class135(arg4, 1, arg5, var10, var11, var13, var12, var15.field3307, true, null);
            }
            arg7.method588(arg2, arg9, arg3, var14, var21, null, class17.field420[arg5], 0, var16, var17);
            if (var15.field3348 != 0) {
                arg8.method875(1, arg3, arg0, arg9, arg5, var15.field3347);
            }
        } else if (arg0 == 2) {
            int var22 = arg5 + 1 & 0x3;
            class50 var23;
            class50 var24;
            if (var15.field3307 == -1 && var15.field3364 == null) {
                var23 = var15.method1123(var13, (byte) -102, 2, var12, var10, var11, arg5 + 4);
                var24 = var15.method1123(var13, (byte) -107, 2, var12, var10, var11, var22);
            } else {
                var23 = new class135(arg4, 2, arg5 + 4, var10, var11, var13, var12, var15.field3307, true, null);
                var24 = new class135(arg4, 2, var22, var10, var11, var13, var12, var15.field3307, true, null);
            }
            arg7.method588(arg2, arg9, arg3, var14, var23, var24, class69.field1652[arg5], class69.field1652[var22], var16, var17);
            if (var15.field3348 != 0) {
                arg8.method875(1, arg3, arg0, arg9, arg5, var15.field3347);
            }
        } else if (arg0 == 3) {
            class50 var25;
            if (var15.field3307 == -1 && var15.field3364 == null) {
                var25 = var15.method1123(var13, (byte) -76, 3, var12, var10, var11, arg5);
            } else {
                var25 = new class135(arg4, 3, arg5, var10, var11, var13, var12, var15.field3307, true, null);
            }
            arg7.method588(arg2, arg9, arg3, var14, var25, null, class17.field420[arg5], 0, var16, var17);
            if (var15.field3348 != 0) {
                arg8.method875(1, arg3, arg0, arg9, arg5, var15.field3347);
            }
        } else if (arg0 == 9) {
            class50 var26;
            if (var15.field3307 == -1 && var15.field3364 == null) {
                var26 = var15.method1123(var13, (byte) -79, arg0, var12, var10, var11, arg5);
            } else {
                var26 = new class135(arg4, arg0, arg5, var10, var11, var13, var12, var15.field3307, true, null);
            }
            arg7.method613(arg2, arg9, arg3, var14, 1, 1, var26, 0, var16, var17);
            if (var15.field3348 != 0) {
                arg8.method873(arg5, arg6 - 10447, arg9, var15.field3306, var15.field3347, var15.field3330, arg3);
            }
        } else {
            if (var15.field3323) {
                if (arg5 == 1) {
                    int var27 = var12;
                    var12 = var13;
                    var13 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg5 == 2) {
                    int var28 = var12;
                    var12 = var11;
                    var11 = var28;
                    int var29 = var13;
                    var13 = var10;
                    var10 = var29;
                } else if (arg5 == 3) {
                    int var30 = var12;
                    var12 = var10;
                    var10 = var11;
                    var11 = var13;
                    var13 = var30;
                }
            }
            if (arg0 == 4) {
                class50 var31;
                if (var15.field3307 == -1 && var15.field3364 == null) {
                    var31 = var15.method1123(var13, (byte) -54, 4, var12, var10, var11, 0);
                } else {
                    var31 = new class135(arg4, 4, 0, var10, var11, var13, var12, var15.field3307, true, null);
                }
                arg7.method615(arg2, arg9, arg3, var14, var31, class69.field1652[arg5], arg5 * 512, 0, 0, var16, var17);
            } else if (arg0 == 5) {
                int var32 = 16;
                int var33 = arg7.method584(arg2, arg9, arg3);
                if (var33 != 0) {
                    var32 = class31.method238(-29628, var33 >> 14 & 0x7FFF).field3328;
                }
                class50 var34;
                if (var15.field3307 == -1 && var15.field3364 == null) {
                    var34 = var15.method1123(var13, (byte) -112, 4, var12, var10, var11, 0);
                } else {
                    var34 = new class135(arg4, 4, 0, var10, var11, var13, var12, var15.field3307, true, null);
                }
                arg7.method615(arg2, arg9, arg3, var14, var34, class69.field1652[arg5], arg5 * 512, class99.field2416[arg5] * var32, class135.field3072[arg5] * var32, var16, var17);
            } else if (arg0 == 6) {
                class50 var35;
                if (var15.field3307 == -1 && var15.field3364 == null) {
                    var35 = var15.method1123(var13, (byte) -86, 4, var12, var10, var11, 0);
                } else {
                    var35 = new class135(arg4, 4, 0, var10, var11, var13, var12, var15.field3307, true, null);
                }
                arg7.method615(arg2, arg9, arg3, var14, var35, 256, arg5, 0, 0, var16, var17);
            } else {
                if (arg6 != 10538) {
                    field196 = -41;
                }
                if (arg0 == 7) {
                    class50 var36;
                    if (var15.field3307 == -1 && var15.field3364 == null) {
                        var36 = var15.method1123(var13, (byte) -73, 4, var12, var10, var11, 0);
                    } else {
                        var36 = new class135(arg4, 4, 0, var10, var11, var13, var12, var15.field3307, true, null);
                    }
                    arg7.method615(arg2, arg9, arg3, var14, var36, 512, arg5, 0, 0, var16, var17);
                } else if (arg0 == 8) {
                    class50 var37;
                    if (var15.field3307 == -1 && var15.field3364 == null) {
                        var37 = var15.method1123(var13, (byte) -49, 4, var12, var10, var11, 0);
                    } else {
                        var37 = new class135(arg4, 4, 0, var10, var11, var13, var12, var15.field3307, true, null);
                    }
                    arg7.method615(arg2, arg9, arg3, var14, var37, 768, arg5, 0, 0, var16, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public static final void method74(byte arg0) {
        field188++;
        class158.field3621 = true;
        class103.field2495 = 0;
        class53.field1339.field1585 = 0;
        class81.field2019 = 0L;
        class103.field2508 = 0;
        class13.field237 = 0;
        class155.field3522 = 0;
        class2.field43 = 0;
        class132.field2991 = 0;
        class133.field3022 = 0;
        class148.field3334 = 0;
        class60.field1454 = 0;
        class155.field3526 = 0;
        class148.field3317 = 0;
        class82.field2053 = 0;
        class85.field2104 = 0;
        class19.field474 = 0;
        class101.field2454 = 0;
        class60.field1492 = 0;
        class72.field1747 = 0;
        class35.field809 = 0;
        class14.field262 = 0;
        class17.field430 = 0;
        class85.field2113 = 0;
        class103.field2500 = 0;
        class8.field130 = 0;
        class89.field2215 = 0;
        class132.field2998 = 0;
        class157.field3608 = 0;
        class60.field1458 = 0;
        class14.field278 = 0;
        class133.field3028 = 0;
        class13.field233 = 0;
        class103.field2538 = 0;
        class115.field2718 = 0;
        class152.field3410 = 0;
        class141.field3206 = 0;
        class153.field3445 = 0;
        class101.field2458 = 0;
        class54.field1353 = 0;
        class116.field2732 = 0;
        class35.field877 = 0;
        class157.field3606 = 0;
        client.field497 = 0;
        class82.field2035 = 0;
        class34.field783 = 0;
        class60.field1472 = 0;
        class55.field1369 = 0;
        class90.field2233 = 0;
        class14.field316 = 0;
        class103.field2509 = 0;
        class121.field2784 = 0;
        class35.field849 = 0;
        class73.field1760 = 0;
        class28.field652 = 0;
        class43.field1152 = 0;
        class60.field1484 = 0;
        class43.field1144 = 0;
        class105.field2577 = 0;
        class30.field707 = 0;
        class154.field3489 = 0;
        class9.field143 = 0;
        class120.field2759 = 0;
        class61.field1504 = 0;
        class61.field1501 = 0;
        class62.field1557 = 0;
        class60.field1440 = 0;
        class15.field335 = 0;
        class9.field139 = 0;
        class28.field669 = 0;
        class50.field1275 = 0;
        class60.field1487 = 0;
        class152.field3413 = 0;
        class155.field3525 = 0;
        class103.field2527 = 0;
        class148.field3353 = 0;
        class24.field583 = 0;
        class136.field3094 = 0;
        class60.field1473 = 0;
        class131.field2970 = 0;
        class152.field3404 = 0;
        class106.field2606 = 0;
        class40.field995 = 0;
        class46.field1225 = 0;
        class106.field2615 = 0;
        class137.field3125 = 0;
        class154.field3473 = 0;
        class128.field2930 = 0;
        class40.field1046 = 0;
        class133.field3023 = 0;
        class54.field1354 = 0;
        class99.field2417 = 0;
        class154.field3479 = 0;
        class14.field312 = 0;
        class106.field2611 = 0;
        class145.field3272 = 0;
        class35.field852 = 0;
        class14.field320 = 0;
        class137.field3135 = 0;
        class14.field288 = 0;
        class1.field14 = 0;
        class15.field331 = 0;
        class98.field2406 = 0;
        class18.field438 = 0;
        class55.field1374 = 0;
        class14.field277 = 0;
        class28.field651 = 0;
        class48.field1252 = 0;
        class81.field2009 = 0;
        class97.field2378 = 0;
        class66.field1624 = 0;
        class90.field2248 = 0;
        class137.field3122 = 0;
        class140.field3203 = 0;
        class52.field1301 = 0;
        class151.field3383 = 0;
        class154.field3498 = 0;
        class14.field298 = 0;
        class66.field1616 = 0;
        class32.field745 = 0;
        class103.field2483 = 0;
        class135.field3053 = 0;
        class121.field2791 = 0;
        client.field508 = 0;
        class2.field45 = 0;
        class133.field3011 = 0;
        class61.field1518 = 0;
        class60.field1457 = 0;
        class144.field3252 = 0;
        class46.field1215 = 0;
        class9.field131 = 0;
        class33.field769 = 0;
        class67.field1641 = 0;
        class60.field1490 = 0;
        class28.field663 = 0;
        class90.field2253 = 0;
        class137.field3134 = 0;
        class86.field2139 = 0;
        class107.field2633 = 0;
        client.field507 = 0;
        class32.field743 = 0;
        class135.field3074 = 0;
        class9.field146 = 0;
        class14.field273 = 0;
        class77.field1878 = 0;
        class10.field171 = 0;
        class103.field2487 = 0;
        class46.field1227 = 0;
        class32.field748 = 0;
        class80.field1997 = 0;
        class82.field2041 = 0;
        class86.field2154 = 0;
        client.field511 = 0;
        class66.field1622 = 0;
        class154.field3478 = 0;
        class24.field576 = 0;
        class157.field3595 = 0;
        class18.field457 = 0;
        class14.field302 = 0;
        class62.field1550 = 0;
        class40.field964 = 0;
        class153.field3425 = 0;
        class103.field2482 = 0;
        class103.field2517 = 0;
        class103.field2534 = 0;
        class24.field597 = 0;
        class9.field136 = 0;
        class137.field3103 = 0;
        class148.field3321 = 0;
        class66.field1612 = 0;
        class139.field3162 = 0;
        class60.field1456 = 0;
        class105.field2592 = 0;
        class137.field3138 = 0;
        class18.field456 = 0;
        class98.field2392 = 0;
        class135.field3051 = 0;
        class28.field677 = 0;
        class40.field937 = 0;
        class120.field2755 = 0;
        class35.field865 = 0;
        class51.field1296 = 0;
        class14.field308 = 0;
        class148.field3365 = 0;
        class7.field114 = 0;
        class97.field2388 = 0;
        class107.field2631 = 0;
        class60.field1441 = 0;
        class60.field1467 = 0;
        class63.field1570 = 0;
        class73.field1766 = 0;
        class72.field1739 = 0;
        class103.field2535 = 0;
        class25.field616 = 0;
        class111.field2673 = 0;
        class32.field746 = 0;
        class25.field605 = 0;
        class12.field216 = 0;
        class14.field246 = 0;
        class105.field2570 = 0;
        class141.field3228 = 0;
        class75.field1808 = 0;
        class46.field1223 = 0;
        class14.field254 = 0;
        class14.field276 = 0;
        class137.field3121 = 0;
        class154.field3477 = 0;
        class137.field3115 = 0;
        class72.field1740 = 0;
        class90.field2227 = 0;
        class60.field1444 = 0;
        class103.field2530 = 0;
        class39.field927 = 0;
        class85.field2114 = 0;
        class60.field1482 = 0;
        class105.field2584 = 0;
        class52.field1328 = 0;
        class103.field2521 = 0;
        class148.field3345 = 0;
        class63.field1577 = 0;
        class34.field805 = 0;
        class16.field385 = 0;
        class87.field2163 = 0;
        class106.field2621 = 0;
        class103.field2493 = 0;
        class53.field1336 = 0;
        class86.field2142 = 0;
        class77.field1891 = 0;
        class48.field1251 = 0;
        class51.field1293 = 0;
        class5.field80 = 0;
        class38.field904 = 0;
        class45.field1185 = 0;
        class153.field3424 = 0;
        class28.field671 = 0;
        class137.field3119 = 0;
        class137.field3110 = 0;
        class103.field2503 = 0;
        class42.field1133 = 0;
        class103.field2484 = 0;
        class28.field655 = 0;
        class9.field157 = 0;
        class17.field415 = 0;
        class103.field2525 = 0;
        class106.field2610 = 0;
        class86.field2162 = 0;
        class38.field905 = 0;
        class101.field2453 = 0;
        class15.field346 = 0;
        class38.field915 = 0;
        class61.field1506 = 0;
        class90.field2244 = 0;
        class103.field2494 = 0;
        class98.field2400 = 0;
        class9.field144 = 0;
        class153.field3443 = 0;
        class17.field422 = 0;
        class140.field3192 = 0;
        class60.field1443 = 0;
        class105.field2587 = 0;
        class46.field1228 = 0;
        class66.field1621 = 0;
        class146.field3296 = 0;
        class73.field1765 = 0;
        class28.field690 = 0;
        class103.field2504 = 0;
        class72.field1727 = 0;
        class16.field366 = 0;
        class106.field2605 = 0;
        class104.field2556 = 0;
        class25.field609 = 0;
        class158.field3623 = 0;
        class50.field1284 = 0;
        class148.field3357 = 0;
        class78.field1916 = 0;
        class69.field1645 = 0;
        class112.field2683 = 0;
        class10.field176 = 0;
        class18.field446 = 0;
        client.field502 = 0;
        class132.field2996 = 0;
        class14.field306 = 0;
        class105.field2571 = 0;
        class139.field3158 = 0;
        class137.field3106 = 0;
        class17.field426 = 0;
        class152.field3409 = 0;
        class104.field2545 = 0;
        class22.field522 = 0;
        class32.field739 = 0;
        class17.field410 = 0;
        class158.field3614 = 0;
        class124.field2853 = 0;
        class99.field2413 = 0;
        class155.field3510 = 0;
        class9.field135 = 0;
        class140.field3183 = 0;
        class87.field2168 = 0;
        class42.field1124 = 0;
        class10.field167 = 0;
        class137.field3105 = 0;
        class151.field3393 = 0;
        class137.field3137 = 0;
        class40.field951 = 0;
        class136.field3099 = 0;
        class55.field1371 = 0;
        class5.field78 = 0;
        class90.field2231 = 0;
        class106.field2594 = 0;
        class77.field1880 = 0;
        class111.field2672 = 0;
        class137.field3129 = 0;
        class62.field1559 = 0;
        class90.field2224 = 0;
        class157.field3592 = 0;
        class100.field2423 = 0;
        class35.field847 = 0;
        class21.field491 = 0;
        class100.field2435 = 0;
        class137.field3120 = 0;
        class46.field1212 = 0;
        class106.field2612 = 0;
        class151.field3377 = 0;
        class146.field3293 = 0;
        field182 = 0;
        class61.field1547 = 0;
        class109.field2655 = 0;
        class72.field1745 = 0;
        class133.field3016 = 0;
        class60.field1455 = 0;
        class18.field452 = 0;
        class157.field3589 = 0;
        class38.field914 = 0;
        class9.field142 = 0;
        class80.field1973 = 0;
        class103.field2513 = 0;
        class69.field1644 = 0;
        class73.field1768 = 0;
        class77.field1879 = 0;
        class157.field3599 = 0;
        class90.field2232 = 0;
        class128.field2935 = 0;
        class137.field3109 = 0;
        class66.field1618 = 0;
        class60.field1497 = 0;
        class136.field3093 = 0;
        class52.field1308 = 0;
        class157.field3586 = 0;
        class104.field2552 = 0;
        class112.field2694 = 0;
        class61.field1527 = 0;
        class90.field2262 = 0;
        class42.field1115 = 0;
        class144.field3253 = 0;
        class137.field3113 = 0;
        class24.field593 = 0;
        class129.field2939 = 0;
        class137.field3107 = 0;
        class103.field2492 = 0;
        class60.field1461 = 0;
        class141.field3225 = 0;
        class32.field740 = 0;
        class18.field449 = 0;
        class140.field3196 = 0;
        class14.field252 = 0;
        class81.field2022 = 0;
        class32.field747 = 0;
        class120.field2761 = 0;
        class14.field315 = 0;
        class137.field3117 = 0;
        client.field499 = 0;
        class78.field1900 = 0;
        class103.field2537 = 0;
        class48.field1256 = 0;
        class85.field2105 = 0;
        class154.field3490 = 0;
        class112.field2682 = 0;
        class60.field1478 = 0;
        class44.field1167 = 0;
        class61.field1509 = 0;
        class155.field3513 = 0;
        class18.field453 = 0;
        class100.field2437 = 0;
        class61.field1519 = 0;
        class31.field738 = 0;
        class90.field2243 = 0;
        class9.field133 = 0;
        class103.field2542 = 0;
        class157.field3604 = 0;
        class39.field931 = 0;
        class73.field1754 = 0;
        class100.field2436 = 0;
        class45.field1173 = 0;
        class140.field3194 = 0;
        class86.field2150 = 0;
        class23.field569 = 0;
        class18.field444 = 0;
        class137.field3123 = 0;
        class154.field3469 = 0;
        class131.field2966 = 0;
        class60.field1448 = 0;
        class61.field1505 = 0;
        class60.field1479 = 0;
        class155.field3518 = 0;
        class14.field285 = 0;
        class133.field3033 = 0;
        class13.field234 = 0;
        class51.field1298 = 0;
        class63.field1580 = 0;
        class124.field2858 = 0;
        class60.field1483 = 0;
        class28.field667 = 0;
        class14.field286 = 0;
        class106.field2608 = 0;
        class39.field926 = 0;
        class103.field2480 = 0;
        class140.field3195 = 0;
        class28.field654 = 0;
        class5.field86 = 0;
        class19.field472 = 0;
        class151.field3378 = 0;
        class66.field1631 = 0;
        class137.field3130 = 0;
        class137.field3118 = 0;
        class121.field2787 = 0;
        class106.field2613 = 0;
        class133.field3027 = 0;
        class148.field3325 = 0;
        class61.field1530 = 0;
        class139.field3147 = 0;
        class60.field1476 = 0;
        class61.field1533 = 0;
        class50.field1273 = 0;
        class42.field1126 = 0;
        class155.field3504 = 0;
        field188 = 0;
        class17.field432 = 0;
        class14.field280 = 0;
        class146.field3283 = 0;
        class158.field3616 = 0;
        class9.field145 = 0;
        class75.field1807 = 0;
        class103.field2490 = 0;
        class104.field2557 = 0;
        class17.field424 = 0;
        class132.field2992 = 0;
        class128.field2919 = 0;
        class40.field958 = 0;
        class151.field3384 = 0;
        class137.field3127 = 0;
        class8.field121 = 0;
        class24.field599 = 0;
        class103.field2520 = 0;
        class61.field1535 = 0;
        class43.field1143 = 0;
        class139.field3153 = 0;
        class99.field2409 = 0;
        class120.field2756 = 0;
        class129.field2950 = 0;
        class157.field3601 = 0;
        class133.field3020 = 0;
        class62.field1555 = 0;
        class128.field2923 = 0;
        class55.field1378 = 0;
        field194 = 0;
        class135.field3060 = 0;
        class137.field3126 = 0;
        class125.field2874 = 0;
        class14.field279 = 0;
        class101.field2449 = 0;
        class106.field2609 = 0;
        class98.field2393 = 0;
        class137.field3114 = 0;
        class61.field1508 = 0;
        class13.field242 = 0;
        class133.field3017 = 0;
        class85.field2109 = 0;
        class59.field1426 = 0;
        class109.field2651 = 0;
        class103.field2497 = 0;
        class77.field1896 = 0;
        class139.field3146 = 0;
        class45.field1172 = 0;
        class15.field358 = 0;
        class7.field96 = 0;
        class31.field721 = 0;
        class73.field1761 = 0;
        class151.field3382 = 0;
        class60.field1494 = 0;
        class60.field1452 = 0;
        client.field503 = 0;
        class77.field1890 = 0;
        class133.field3024 = 0;
        class56.field1388 = 0;
        class157.field3605 = 0;
        class113.field2700 = 0;
        class145.field3262 = 0;
        class30.field701 = 0;
        class42.field1131 = 0;
        class62.field1551 = 0;
        class38.field919 = 0;
        field189 = 0;
        class59.field1433 = 0;
        class16.field374 = 0;
        class148.field3363 = 0;
        class86.field2143 = 0;
        class41.field1097 = 0;
        class137.field3136 = 0;
        class61.field1514 = 0;
        class103.field2528 = 0;
        class25.field603 = 0;
        class103.field2532 = 0;
        class103.field2486 = 0;
        class85.field2111 = 0;
        class60.field1439 = 0;
        class112.field2692 = 0;
        class69.field1655 = 0;
        class93.field2292 = 0;
        class30.field705 = 0;
        class33.field759 = 0;
        class18.field450 = 0;
        class19.field475 = 0;
        class105.field2574 = 0;
        class41.field1099 = 0;
        class148.field3329 = 0;
        class17.field431 = 0;
        class75.field1796 = 0;
        class25.field600 = 0;
        class22.field517 = 0;
        class60.field1493 = 0;
        class14.field289 = 0;
        class24.field586 = 0;
        class85.field2116 = 0;
        class85.field2076 = 0;
        class103.field2543 = 0;
        class103.field2529 = 0;
        class5.field81 = 0;
        class69.field1657 = 0;
        class22.field516 = 0;
        class73.field1755 = 0;
        class33.field782 = 0;
        class35.field808 = 0;
        class99.field2410 = 0;
        class44.field1162 = 0;
        class81.field2011 = 0;
        class146.field3290 = 0;
        class60.field1480 = 0;
        class103.field2485 = 0;
        class21.field493 = 0;
        class115.field2714 = 0;
        class31.field734 = 0;
        class73.field1762 = 0;
        client.field504 = 0;
        class103.field2506 = 0;
        class63.field1569 = 0;
        class131.field2968 = 0;
        class153.field3442 = 0;
        class153.field3446 = 0;
        class87.field2166 = 0;
        class14.field259 = 0;
        class60.field1469 = 0;
        class44.field1168 = 0;
        class56.field1391 = 0;
        class90.field2226 = 0;
        class73.field1757 = 0;
        class21.field488 = 0;
        class137.field3133 = 0;
        class34.field786 = 0;
        class112.field2691 = 0;
        class43.field1139 = 0;
        class140.field3200 = 0;
        class120.field2753 = 0;
        class31.field726 = 0;
        class157.field3593 = 0;
        class74.field1778 = 0;
        client.field513 = 0;
        class139.field3156 = 0;
        class103.field2518 = 0;
        class14.field274 = 0;
        class45.field1188 = 0;
        class60.field1460 = 0;
        class121.field2768 = 0;
        class31.field730 = 0;
        class40.field1041 = 0;
        class40.field1049 = 0;
        class87.field2165 = 0;
        class146.field3279 = 0;
        class90.field2251 = 0;
        class72.field1730 = 0;
        class89.field2217 = 0;
        class45.field1180 = 0;
        class81.field2005 = 0;
        class129.field2943 = 0;
        class44.field1165 = 0;
        class35.field856 = 0;
        class136.field3078 = 0;
        class113.field2702 = 0;
        class137.field3101 = 0;
        class86.field2152 = 0;
        class74.field1782 = 0;
        class39.field928 = 0;
        class61.field1545 = 0;
        class132.field3000 = 0;
        class60.field1486 = 0;
        class30.field711 = 0;
        class129.field2954 = 0;
        class116.field2728 = 0;
        class103.field2512 = 0;
        class63.field1579 = 0;
        class30.field702 = 0;
        class33.field777 = 0;
        field192 = 0;
        class144.field3255 = 0;
        class66.field1617 = 0;
        class155.field3512 = 0;
        class17.field421 = 0;
        class28.field660 = 0;
        class42.field1111 = 0;
        class19.field466 = 0;
        class133.field3012 = 0;
        class35.field878 = 0;
        class103.field2531 = 0;
        class148.field3354 = 0;
        class24.field591 = 0;
        class120.field2752 = 0;
        class60.field1451 = 0;
        class60.field1463 = 0;
        class2.field48 = 0;
        class145.field3267 = 0;
        class145.field3270 = 0;
        class66.field1609 = 0;
        class55.field1370 = 0;
        class102.field2472 = 0;
        class1.field16 = 0;
        class115.field2726 = 0;
        class94.field2309 = 0;
        class105.field2565 = 0;
        class73.field1758 = 0;
        class128.field2928 = 0;
        class82.field2044 = 0;
        class66.field1615 = 0;
        class42.field1113 = 0;
        class85.field2118 = 0;
        class154.field3487 = 0;
        class129.field2945 = 0;
        class103.field2533 = 0;
        class98.field2390 = 0;
        class129.field2947 = 0;
        class73.field1751 = 0;
        class13.field236 = 0;
        class137.field3116 = 0;
        class16.field367 = 0;
        class125.field2885 = 0;
        class45.field1184 = 0;
        class104.field2555 = 0;
        class103.field2519 = 0;
        class148.field3314 = 0;
        class61.field1544 = 0;
        class14.field322 = 0;
        class125.field2882 = 0;
        class40.field942 = 0;
        class103.field2505 = 0;
        class132.field2994 = 0;
        class38.field907 = 0;
        class107.field2636 = 0;
        class155.field3527 = 0;
        class32.field742 = 0;
        client.field500 = 0;
        class115.field2725 = 0;
        class12.field205 = 0;
        class78.field1907 = 0;
        class35.field866 = 0;
        class19.field464 = 0;
        class109.field2650 = 0;
        class25.field602 = 0;
        class2.field49 = 0;
        class139.field3157 = 0;
        class9.field137 = 0;
        class14.field268 = 0;
        class103.field2499 = 0;
        class72.field1728 = 0;
        class30.field706 = 0;
        class105.field2591 = 0;
        class35.field812 = 0;
        class115.field2712 = 0;
        class103.field2540 = 0;
        class137.field3131 = 0;
        class103.field2511 = 0;
        field191 = 0;
        class106.field2601 = 0;
        class151.field3390 = 0;
        class87.field2167 = 0;
        class73.field1769 = 0;
        class124.field2842 = 0;
        class17.field413 = 0;
        class109.field2656 = 0;
        class38.field917 = 0;
        class120.field2760 = 0;
        class121.field2782 = 0;
        class106.field2600 = 0;
        class94.field2315 = 0;
        class33.field766 = 0;
        class60.field1495 = 0;
        class46.field1230 = 0;
        class47.field1235 = 0;
        class69.field1658 = 0;
        class31.field728 = 0;
        class141.field3222 = 0;
        class59.field1435 = 0;
        class86.field2137 = 0;
        class1.field30 = 0;
        class139.field3148 = 0;
        class141.field3207 = 0;
        class148.field3367 = 0;
        class158.field3615 = 0;
        class124.field2856 = 0;
        class124.field2839 = 0;
        class60.field1462 = 0;
        class113.field2699 = 0;
        class106.field2604 = 0;
        class14.field297 = 0;
        class124.field2845 = 0;
        class66.field1626 = 0;
        class12.field212 = 0;
        class38.field911 = 0;
        client.field510 = 0;
        class136.field3089 = 0;
        class90.field2245 = 0;
        class51.field1294 = 0;
        class132.field3005 = 0;
        class154.field3472 = 0;
        class107.field2630 = 0;
        class44.field1166 = 0;
        class69.field1647 = 0;
        class101.field2462 = 0;
        class155.field3507 = 0;
        class33.field775 = 0;
        class9.field140 = 0;
        class155.field3524 = 0;
        class40.field989 = 0;
        class139.field3154 = 0;
        class60.field1459 = 0;
        class8.field120 = 0;
        class23.field565 = 0;
        class35.field869 = 0;
        class82.field2040 = 0;
        class80.field1945 = 0;
        class103.field2536 = 0;
        class105.field2573 = 0;
        class28.field670 = 0;
        client.field505 = 0;
        class133.field3015 = 0;
        class115.field2717 = 0;
        class42.field1114 = 0;
        class104.field2560 = 0;
        class56.field1392 = 0;
        class50.field1281 = 0;
        class25.field604 = 0;
        class103.field2526 = 0;
        class154.field3480 = 0;
        class38.field913 = 0;
        class60.field1447 = 0;
        class25.field613 = 0;
        class155.field3508 = 0;
        class12.field209 = 0;
        class47.field1232 = 0;
        class115.field2724 = 0;
        class61.field1534 = 0;
        class132.field2999 = 0;
        class74.field1775 = 0;
        class7.field107 = 0;
        class74.field1779 = 0;
        class85.field2094 = 0;
        class43.field1146 = 0;
        class111.field2670 = 0;
        class107.field2632 = 0;
        class78.field1918 = 0;
        class61.field1510 = 0;
        class103.field2524 = 0;
        class33.field765 = 0;
        class14.field275 = 0;
        class66.field1611 = 0;
        class14.field253 = 0;
        class81.field2025 = 0;
        int var1 = -82 % ((-arg0 - 61) / 57);
        class59.field1436 = 0;
        class31.field733 = 0;
        class137.field3111 = 0;
        class48.field1259 = 0;
        class28.field676 = 0;
        class109.field2654 = 0;
        class9.field132 = 0;
        class152.field3398 = 0;
        class55.field1387 = 0;
        class14.field264 = 0;
        class145.field3260 = 0;
        class47.field1238 = 0;
        class60.field1449 = 0;
        class98.field2391 = 0;
        class61.field1499 = 0;
        class64.field1591 = 0;
        class153.field3431 = 0;
        class155.field3511 = 0;
        class85.field2103 = 0;
        class35.field840 = 0;
        class90.field2255 = 0;
        class157.field3609 = 0;
        class14.field267 = 0;
        class53.field1338 = 0;
        class35.field873 = 0;
        class40.field973 = 0;
        class61.field1515 = 0;
        class40.field1047 = 0;
        class17.field423 = 0;
        class148.field3309 = 0;
        field183 = 0;
        class103.field2539 = 0;
        class155.field3506 = 0;
        class151.field3387 = 0;
        class60.field1450 = 0;
        class60.field1445 = 0;
        class56.field1394 = 0;
        client.field512 = 0;
        class120.field2762 = 0;
        class131.field2971 = 0;
        class38.field906 = 0;
        class137.field3108 = 0;
        class40.field1055 = 0;
        class139.field3155 = 0;
        class155.field3521 = 0;
        class28.field665 = 0;
        class10.field168 = 0;
        class148.field3339 = 0;
        class103.field2516 = 0;
        class78.field1919 = 0;
        class139.field3159 = 0;
        class107.field2638 = 0;
        class69.field1649 = 0;
        class10.field180 = 0;
        class28.field687 = 0;
        class16.field402 = 0;
        class100.field2427 = 0;
        class132.field2989 = 0;
        class154.field3453 = 0;
        class140.field3201 = 0;
        class121.field2767 = 0;
        class7.field109 = 0;
        class31.field717 = 0;
        class21.field489 = 0;
        class48.field1260 = 0;
        class103.field2489 = 0;
        class8.field115 = 0;
        class66.field1625 = 0;
        class75.field1809 = 0;
        class103.field2522 = 0;
        class33.field761 = 0;
        class45.field1178 = 0;
        class144.field3239 = 0;
        class42.field1122 = 0;
        class133.field3025 = 0;
        class66.field1613 = 0;
        class100.field2434 = 0;
        class51.field1299 = 0;
        class39.field925 = 0;
        class47.field1234 = 0;
        class54.field1362 = 0;
        class40.field1044 = 0;
        class60.field1446 = 0;
        class137.field3124 = 0;
        class77.field1882 = 0;
        class133.field3018 = 0;
        class93.field2290 = 0;
        class103.field2481 = 0;
        class33.field779 = 0;
        class132.field2993 = 0;
        class60.field1464 = 0;
        class61.field1529 = 0;
        class86.field2159 = 0;
        class43.field1141 = 0;
        class28.field675 = 0;
        class60.field1489 = 0;
        class133.field3019 = 0;
        class98.field2402 = 0;
        class140.field3190 = 0;
        class14.field303 = 0;
        class61.field1521 = 0;
        class106.field2603 = 0;
        class14.field269 = 0;
        class86.field2138 = 0;
        class34.field804 = 0;
        client.field506 = 0;
        class61.field1522 = 0;
        class10.field170 = 0;
        class87.field2171 = 0;
        class31.field722 = 0;
        class14.field258 = 0;
        class14.field249 = 0;
        class63.field1581 = 0;
        class69.field1659 = 0;
        field184 = 0;
        class133.field3031 = 0;
        class46.field1205 = 0;
        class66.field1627 = 0;
        class50.field1271 = 0;
        class46.field1197 = 0;
        class44.field1163 = 0;
        class47.field1231 = 0;
        class40.field979 = 0;
        class43.field1159 = 0;
        class8.field124 = 0;
        class41.field1093 = 0;
        class121.field2790 = 0;
        class82.field2038 = 0;
        class46.field1220 = 0;
        class103.field2523 = 0;
        class28.field688 = 0;
        class85.field2102 = 0;
        class98.field2404 = 0;
        class28.field673 = 0;
        class61.field1524 = 0;
        class101.field2447 = 0;
        class16.field363 = 0;
        class145.field3264 = 0;
        class77.field1883 = 0;
        class64.field1607 = 0;
        class124.field2849 = 0;
        class103.field2541 = 0;
        class103.field2510 = 0;
        class46.field1216 = 0;
        class19.field468 = 0;
        class154.field3482 = 0;
        class43.field1155 = 0;
        class38.field908 = 0;
        class151.field3380 = 0;
        class111.field2678 = 0;
        class56.field1402 = 0;
        class66.field1619 = 0;
        class25.field601 = 0;
        class105.field2579 = 0;
        class14.field265 = 0;
        class46.field1229 = 0;
        class155.field3533 = 0;
        class14.field266 = 0;
        class139.field3161 = 0;
        class34.field792 = true;
        class19.method159((byte) 39);
        class106.field2625 = 0;
        class135.field3067 = false;
        class100.field2421 = -1;
        class80.field1956 = 0;
        class125.field2872 = 0;
        class35.field874 = -1;
        class2.field51 = -1;
        class80.field1978 = -1;
        class22.field519.field2501 = 0;
        class42.field1119 = 0;
        class44.field1161 = 0;
        class56.field1393.field2501 = 0;
        class10.method64(0, 0);
        for (int var2 = 0; var2 < 100; var2++) {
            class72.field1729[var2] = null;
        }
        class28.field684 = (int) (Math.random() * 80.0D) - 40;
        class44.field1170 = 0;
        class155.field3546 = 0;
        class28.field659 = -1;
        class34.field789 = 0;
        class157.field3590 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class72.field1748 = 0;
        class74.field1788 = (int) (Math.random() * 100.0D) - 50;
        class46.field1200 = 0;
        class141.field3224 = (int) (Math.random() * 110.0D) - 55;
        class59.field1438 = 0;
        class151.field3394 = (int) (Math.random() * 120.0D) - 60;
        class145.field3271 = (int) (Math.random() * 30.0D) - 20;
        class1.field17 = false;
        class48.field1267 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class81.field2016[var3] = null;
            class106.field2618[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class5.field83[var4] = null;
        }
        class107.field2640 = class81.field2016[2047] = new class1();
        class25.field610.method506((byte) 4);
        class109.field2647.method506((byte) 4);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var12 = 0; var12 < 104; var12++) {
                for (int var13 = 0; var13 < 104; var13++) {
                    class107.field2637[var5][var12][var13] = null;
                }
            }
        }
        class53.field1340 = new class66();
        class19.field461 = 0;
        class103.field2502 = 0;
        for (int var6 = 0; var6 < class13.field243; var6++) {
            class8 var11 = class116.method921(var6, (byte) -74);
            if (var11 != null && var11.field129 == 0) {
                class97.field2382[var6] = 0;
                class43.field1158[var6] = 0;
            }
        }
        for (int var7 = 0; var7 < class64.field1593.length; var7++) {
            class64.field1593[var7] = -1;
        }
        if (field187 != -1) {
            class111.method901(field187, 0);
        }
        for (class81 var8 = (class81) class39.field929.method713(12421); var8 != null; var8 = (class81) class39.field929.method711(122)) {
            class109.method894(false, var8, true);
        }
        field187 = -1;
        class39.field929 = new class86(8);
        class135.field3067 = false;
        class124.field2864 = null;
        class80.field1956 = 0;
        class69.field1646.method143(-91, -1, null, new int[5], false);
        for (int var9 = 0; var9 < 8; var9++) {
            class73.field1763[var9] = null;
            class44.field1164[var9] = false;
        }
        class66.method499((byte) -103);
        class94.field2308 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            class14.field257[var10] = true;
        }
        class101.field2470 = null;
        class33.field764 = 0;
        class103.field2514 = null;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static final void method75(int arg0) {
        field184++;
        boolean var1 = true;
        class72.method549(-15562, false);
        class148.field3372 = 0;
        for (int var2 = 0; var2 < class62.field1564.length; var2++) {
            if (class90.field2256[var2] != -1 && class62.field1564[var2] == null) {
                class62.field1564[var2] = class12.field210.method473((byte) 118, class90.field2256[var2], 0);
                if (class62.field1564[var2] == null) {
                    class148.field3372++;
                    var1 = false;
                }
            }
            if (class124.field2859[var2] != -1 && class131.field2988[var2] == null) {
                class131.field2988[var2] = class12.field210.method474(true, class151.field3379[var2], 0, class124.field2859[var2]);
                if (class131.field2988[var2] == null) {
                    class148.field3372++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class136.field3081 = 1;
            return;
        }
        boolean var3 = true;
        class102.field2474 = 0;
        for (int var4 = 0; var4 < class62.field1564.length; var4++) {
            byte[] var57 = class131.field2988[var4];
            if (var57 != null) {
                int var58 = (class31.field737[var4] >> 8) * 64 - class41.field1095;
                int var59 = (class31.field737[var4] & 0xFF) * 64 - class144.field3240;
                if (class35.field870) {
                    var58 = 10;
                    var59 = 10;
                }
                var3 &= class77.method629((byte) -59, var59, var57, var58);
            }
        }
        if (!var3) {
            class136.field3081 = 2;
            return;
        }
        if (class136.field3081 != 0) {
            class81.method687(true, -1024, class104.method853(-112, new class60[] { class19.field465, class14.field311 }));
        }
        class139.method1080((byte) 51);
        class18.method151((byte) -25);
        class139.method1080((byte) 120);
        class43.field1151.method610();
        class139.method1080((byte) 111);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class133.field3030[var5].method869(30);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var55 = 0; var55 < 104; var55++) {
                for (int var56 = 0; var56 < 104; var56++) {
                    class124.field2869[var6][var55][var56] = 0;
                }
            }
        }
        class139.method1080((byte) 108);
        class100.method784((byte) 101);
        int var7 = class62.field1564.length;
        class115.method917(0);
        class72.method549(-15562, true);
        if (!class35.field870) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class31.field737[var8] >> 8) * 64 - class41.field1095;
                int var18 = (class31.field737[var8] & 0xFF) * 64 - class144.field3240;
                byte[] var19 = class62.field1564[var8];
                if (var19 != null) {
                    class139.method1080((byte) 104);
                    class35.method264(var17, (class87.field2181 - 6) * 8, class133.field3030, var19, var18, (class102.field2476 - 6) * 8, 22993);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class31.field737[var9] >> 8) * 64 - class41.field1095;
                byte[] var15 = class62.field1564[var9];
                int var16 = (class31.field737[var9] & 0xFF) * 64 - class144.field3240;
                if (var15 == null && class87.field2181 < 800) {
                    class139.method1080((byte) 54);
                    class73.method554(122, var16, 64, var14, 64);
                }
            }
            class72.method549(-15562, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class131.field2988[var10];
                if (var11 != null) {
                    int var12 = (class31.field737[var10] >> 8) * 64 - class41.field1095;
                    int var13 = (class31.field737[var10] & 0xFF) * 64 - class144.field3240;
                    class139.method1080((byte) 83);
                    class152.method1160(var12, class43.field1151, var11, var13, 4054, class133.field3030);
                }
            }
        }
        if (class35.field870) {
            for (int var20 = 0; var20 < 4; var20++) {
                class139.method1080((byte) 76);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class158.field3613[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 24 & 0x3;
                            int var39 = var37 >> 14 & 0x3FF;
                            int var40 = var37 >> 3 & 0x7FF;
                            int var41 = (var39 / 8 << 8) + var40 / 8;
                            int var42 = var37 >> 1 & 0x3;
                            for (int var43 = 0; var43 < class31.field737.length; var43++) {
                                if (class31.field737[var43] == var41 && class62.field1564[var43] != null) {
                                    var36 = true;
                                    class120.method933((var40 & 0x7) * 8, class62.field1564[var43], class133.field3030, (byte) -51, var34 * 8, var42, var38, var35 * 8, (var39 & 0x7) * 8, var20);
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class56.method402(var35 * 8, var20, var34 * 8, true);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class158.field3613[0][var21][var32];
                    if (var33 == -1) {
                        class73.method554(-34, var32 * 8, 8, var21 * 8, 8);
                    }
                }
            }
            class72.method549(-15562, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class139.method1080((byte) 32);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class158.field3613[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < class31.field737.length; var31++) {
                                if (class31.field737[var31] == var30 && class131.field2988[var31] != null) {
                                    class2.method5(false, class131.field2988[var31], (var29 & 0x7) * 8, var24 * 8, class133.field3030, var26, var22, var27, var23 * 8, (var28 & 0x7) * 8, class43.field1151);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class72.method549(-15562, true);
        class18.method151((byte) -85);
        class139.method1080((byte) 118);
        class120.method934((byte) 114, class43.field1151, class133.field3030);
        int var44 = -10 / ((arg0 + 16) / 48);
        class72.method549(-15562, true);
        int var45 = class7.field95;
        if (class46.field1222 < var45) {
            var45 = class46.field1222;
        }
        if (class46.field1222 - 1 > var45) {
            int var46 = class46.field1222 - 1;
        }
        if (class22.field548) {
            class43.field1151.method593(class7.field95);
        } else {
            class43.field1151.method593(0);
        }
        for (int var47 = 0; var47 < 104; var47++) {
            for (int var54 = 0; var54 < 104; var54++) {
                class129.method1011(28794, var47, var54);
            }
        }
        class139.method1080((byte) 57);
        class151.method1151((byte) -123);
        class12.field204.method920((byte) 14);
        if (class136.field3090 != null) {
            class22.field519.method1214(114, 0);
            class120.field2756++;
            class22.field519.method819(1057001181, (byte) -62);
        }
        if (!class35.field870) {
            int var48 = (class102.field2476 - 6) / 8;
            int var49 = (class87.field2181 - 6) / 8;
            int var50 = (class87.field2181 + 6) / 8;
            int var51 = (class102.field2476 + 6) / 8;
            for (int var52 = var48 - 1; var52 <= var51 + 1; var52++) {
                for (int var53 = var49 - 1; var53 <= var50 + 1; var53++) {
                    if (var48 > var52 || var52 > var51 || var49 > var53 || var50 < var53) {
                        class12.field210.method465(class104.method853(-127, new class60[] { class17.field419, class98.method774((byte) -121, var52), class2.field40, class98.method774((byte) -121, var53) }), 64);
                        class12.field210.method465(class104.method853(-96, new class60[] { class8.field126, class98.method774((byte) -121, var52), class2.field40, class98.method774((byte) -121, var53) }), -126);
                    }
                }
            }
        }
        class45.method348((byte) -98, 30);
        class139.method1080((byte) 86);
        class86.method714((byte) -127);
        class22.field519.method1214(43, 0);
        class98.method778((byte) -113);
    }
}
