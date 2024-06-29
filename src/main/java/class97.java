import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class97 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lqe;")
    public static class168 field1527 = class66.method448("W-=hlen Sie eine Welt", 106);

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lqe;")
    private static class168 field1528 = class66.method448("You can(Wt add yourself to your own friend list)3", 78);

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[Lqe;")
    public static class168[] field1530 = new class168[8];

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lqe;")
    public static class168 field1525 = field1528;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lqe;")
    private static class168 field1532 = class66.method448("Choose Option", 8);

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lqe;")
    public static class168 field1526 = field1532;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lrd;")
    public static class207 field1533;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Z")
    public static final boolean method636(int arg0, int arg1) {
        field1529++;
        if (class169.field2938[arg0]) {
            return true;
        } else if (class62.field851.method1688(120, arg0)) {
            int var2 = class62.field851.method1694(arg0, 28851);
            if (var2 == 0) {
                class169.field2938[arg0] = true;
                return true;
            }
            if (class108.field1741[arg0] == null) {
                class108.field1741[arg0] = new class129[var2];
            }
            if (arg1 >= -122) {
                field1532 = null;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class108.field1741[arg0][var3] == null) {
                    byte[] var4 = class62.field851.method1712(var3, arg0, -1);
                    if (var4 != null) {
                        class108.field1741[arg0][var3] = new class129();
                        class108.field1741[arg0][var3].field2222 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class108.field1741[arg0][var3].method875(0, new class112(var4));
                        } else {
                            class108.field1741[arg0][var3].method877(new class112(var4), -1);
                        }
                    }
                }
            }
            class169.field2938[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method637(byte arg0) {
        field1525 = null;
        field1527 = null;
        field1526 = null;
        field1530 = null;
        field1533 = null;
        if (arg0 == -8) {
            field1528 = null;
            field1532 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ldf;Z)V")
    public static final void method638(class177 arg0, boolean arg1) {
        class115.field1881.method311((byte) 16, arg0);
        while (true) {
            class177 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class177[][] var7;
            class177 var66;
            do {
                class177 var65;
                do {
                    class177 var64;
                    do {
                        class177 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class177) class115.field1881.method321((byte) -128);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3094);
                                            var3 = var2.field3109;
                                            var4 = var2.field3110;
                                            var5 = var2.field3089;
                                            var6 = var2.field3105;
                                            var7 = class254.field4395[var5];
                                            if (!var2.field3104) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class177 var8 = class254.field4395[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3094) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class193.field3371 && var3 > class29.field347) {
                                                    class177 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3094 && (var9.field3104 || (var2.field3091 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class193.field3371 && var3 < class107.field1716 - 1) {
                                                    class177 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3094 && (var10.field3104 || (var2.field3091 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class62.field848 && var4 > class206.field3585) {
                                                    class177 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3094 && (var11.field3104 || (var2.field3091 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class62.field848 && var4 < class150.field2614 - 1) {
                                                    class177 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3094 && (var12.field3104 || (var2.field3091 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3104 = false;
                                            if (var2.field3107 != null) {
                                                class177 var13 = var2.field3107;
                                                if (var13.field3097 == null) {
                                                    if (var13.field3096 != null) {
                                                        if (class158.method1034(0, var3, var4)) {
                                                            class123.method841(var13.field3096, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var3, var4, true);
                                                        } else {
                                                            class123.method841(var13.field3096, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class158.method1034(0, var3, var4)) {
                                                    class199.method1275(var13.field3097, 0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var3, var4, true);
                                                } else {
                                                    class199.method1275(var13.field3097, 0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var3, var4, false);
                                                }
                                                class162 var14 = var13.field3116;
                                                if (var14 != null) {
                                                    var14.field2775.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var14.field2768 - class108.field1739, var14.field2770 - class45.field588, var14.field2772 - class102.field1648, var14.field2769);
                                                }
                                                for (int var15 = 0; var15 < var13.field3115; var15++) {
                                                    class169 var16 = var13.field3090[var15];
                                                    if (var16 != null) {
                                                        var16.field2934.method49(var16.field2933, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var16.field2929 - class108.field1739, var16.field2925 - class45.field588, var16.field2927 - class102.field1648, var16.field2937);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3097 == null) {
                                                if (var2.field3096 != null) {
                                                    if (class158.method1034(var6, var3, var4)) {
                                                        class123.method841(var2.field3096, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class123.method841(var2.field3096, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var3, var4, false);
                                                    }
                                                }
                                            } else if (class158.method1034(var6, var3, var4)) {
                                                class199.method1275(var2.field3097, var6, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field3097.field2546 != 12345678 || class187.field3292 && var5 <= class243.field4227) {
                                                    class199.method1275(var2.field3097, var6, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class17 var18 = var2.field3101;
                                                if (var18 != null && (var18.field148 & 0xFFFFFFFF80000000L) != 0L) {
                                                    var18.field153.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var18.field147 - class108.field1739, var18.field151 - class45.field588, var18.field150 - class102.field1648, var18.field148);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class162 var21 = var2.field3116;
                                            class199 var22 = var2.field3103;
                                            if (var21 != null || var22 != null) {
                                                if (class193.field3371 == var3) {
                                                    var19++;
                                                } else if (class193.field3371 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class62.field848 == var4) {
                                                    var19 += 3;
                                                } else if (class62.field848 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class106.field1693[var19];
                                                var2.field3098 = class13.field121[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2773 & class112.field1840[var19]) == 0) {
                                                    var2.field3111 = 0;
                                                } else if (var21.field2773 == 16) {
                                                    var2.field3111 = 3;
                                                    var2.field3108 = class257.field4495[var19];
                                                    var2.field3100 = 3 - var2.field3108;
                                                } else if (var21.field2773 == 32) {
                                                    var2.field3111 = 6;
                                                    var2.field3108 = class256.field4476[var19];
                                                    var2.field3100 = 6 - var2.field3108;
                                                } else if (var21.field2773 == 64) {
                                                    var2.field3111 = 12;
                                                    var2.field3108 = class179.field3157[var19];
                                                    var2.field3100 = 12 - var2.field3108;
                                                } else {
                                                    var2.field3111 = 9;
                                                    var2.field3108 = class246.field4268[var19];
                                                    var2.field3100 = 9 - var2.field3108;
                                                }
                                                if ((var21.field2773 & var20) != 0 && !class77.method518(var6, var3, var4, var21.field2773)) {
                                                    var21.field2775.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var21.field2768 - class108.field1739, var21.field2770 - class45.field588, var21.field2772 - class102.field1648, var21.field2769);
                                                }
                                                if ((var21.field2774 & var20) != 0 && !class77.method518(var6, var3, var4, var21.field2774)) {
                                                    var21.field2777.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var21.field2768 - class108.field1739, var21.field2770 - class45.field588, var21.field2772 - class102.field1648, var21.field2769);
                                                }
                                            }
                                            if (var22 != null && !class187.method1216(var6, var3, var4, var22.field3446.method43())) {
                                                if ((var22.field3444 & var20) != 0) {
                                                    var22.field3446.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var22.field3439 + var22.field3433 - class108.field1739, var22.field3440 - class45.field588, var22.field3431 + var22.field3435 - class102.field1648, var22.field3443);
                                                } else if (var22.field3444 == 256) {
                                                    int var23 = var22.field3439 - class108.field1739;
                                                    int var24 = var22.field3440 - class45.field588;
                                                    int var25 = var22.field3431 - class102.field1648;
                                                    int var26 = var22.field3436;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field3446.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var22.field3433 + var23, var24, var22.field3435 + var25, var22.field3443);
                                                    } else if (var22.field3441 != null) {
                                                        var22.field3441.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var23, var24, var25, var22.field3443);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class17 var29 = var2.field3101;
                                                if (var29 != null && (var29.field148 & 0xFFFFFFFF80000000L) == 0L) {
                                                    var29.field153.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var29.field147 - class108.field1739, var29.field151 - class45.field588, var29.field150 - class102.field1648, var29.field148);
                                                }
                                                class36 var30 = var2.field3114;
                                                if (var30 != null && var30.field448 == 0) {
                                                    if (var30.field441 != null) {
                                                        var30.field441.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var30.field451 - class108.field1739, var30.field457 - class45.field588, var30.field454 - class102.field1648, var30.field455);
                                                    }
                                                    if (var30.field447 != null) {
                                                        var30.field447.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var30.field451 - class108.field1739, var30.field457 - class45.field588, var30.field454 - class102.field1648, var30.field455);
                                                    }
                                                    if (var30.field446 != null) {
                                                        var30.field446.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var30.field451 - class108.field1739, var30.field457 - class45.field588, var30.field454 - class102.field1648, var30.field455);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field3091;
                                            if (var31 != 0) {
                                                if (var3 < class193.field3371 && (var31 & 0x4) != 0) {
                                                    class177 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field3094) {
                                                        class115.field1881.method311((byte) 16, var32);
                                                    }
                                                }
                                                if (var4 < class62.field848 && (var31 & 0x2) != 0) {
                                                    class177 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field3094) {
                                                        class115.field1881.method311((byte) 16, var33);
                                                    }
                                                }
                                                if (var3 > class193.field3371 && (var31 & 0x1) != 0) {
                                                    class177 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field3094) {
                                                        class115.field1881.method311((byte) 16, var34);
                                                    }
                                                }
                                                if (var4 > class62.field848 && (var31 & 0x8) != 0) {
                                                    class177 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field3094) {
                                                        class115.field1881.method311((byte) 16, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3111 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field3115; var37++) {
                                                if (class129.field2266 != var2.field3090[var37].field2930 && (var2.field3092[var37] & var2.field3111) == var2.field3108) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class162 var38 = var2.field3116;
                                                if (!class77.method518(var6, var3, var4, var38.field2773)) {
                                                    var38.field2775.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var38.field2768 - class108.field1739, var38.field2770 - class45.field588, var38.field2772 - class102.field1648, var38.field2769);
                                                }
                                                var2.field3111 = 0;
                                            }
                                        }
                                        if (!var2.field3112) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field3115;
                                            var2.field3112 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class169 var42 = var2.field3090[var41];
                                                if (class129.field2266 != var42.field2930) {
                                                    for (int var43 = var42.field2939; var43 <= var42.field2932; var43++) {
                                                        for (int var44 = var42.field2923; var44 <= var42.field2936; var44++) {
                                                            class177 var45 = var7[var43][var44];
                                                            if (var45.field3104) {
                                                                var2.field3112 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field3111 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2939) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field2932) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2923) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2936) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field3111) == var2.field3100) {
                                                                    var2.field3112 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class14.field135[var40++] = var42;
                                                    int var47 = class193.field3371 - var42.field2939;
                                                    int var48 = var42.field2932 - class193.field3371;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class62.field848 - var42.field2923;
                                                    int var50 = var42.field2936 - class62.field848;
                                                    if (var50 > var49) {
                                                        var42.field2921 = var47 + var50;
                                                    } else {
                                                        var42.field2921 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class169 var54 = class14.field135[var53];
                                                    if (class129.field2266 != var54.field2930) {
                                                        if (var54.field2921 > var51) {
                                                            var51 = var54.field2921;
                                                            var52 = var53;
                                                        } else if (var54.field2921 == var51) {
                                                            int var55 = var54.field2929 - class108.field1739;
                                                            int var56 = var54.field2927 - class102.field1648;
                                                            int var57 = class14.field135[var52].field2929 - class108.field1739;
                                                            int var58 = class14.field135[var52].field2927 - class102.field1648;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class169 var59 = class14.field135[var52];
                                                var59.field2930 = class129.field2266;
                                                if (!class145.method979(var6, var59.field2939, var59.field2932, var59.field2923, var59.field2936, var59.field2934.method43())) {
                                                    var59.field2934.method49(var59.field2933, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var59.field2929 - class108.field1739, var59.field2925 - class45.field588, var59.field2927 - class102.field1648, var59.field2937);
                                                }
                                                for (int var60 = var59.field2939; var60 <= var59.field2932; var60++) {
                                                    for (int var61 = var59.field2923; var61 <= var59.field2936; var61++) {
                                                        class177 var62 = var7[var60][var61];
                                                        if (var62.field3111 != 0) {
                                                            class115.field1881.method311((byte) 16, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field3094) {
                                                            class115.field1881.method311((byte) 16, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3112) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field3112 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3094);
                            } while (var2.field3111 != 0);
                            if (var3 > class193.field3371 || var3 <= class29.field347) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field3094);
                        if (var3 < class193.field3371 || var3 >= class107.field1716 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field3094);
                    if (var4 > class62.field848 || var4 <= class206.field3585) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field3094);
                if (var4 < class62.field848 || var4 >= class150.field2614 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field3094);
            var2.field3094 = false;
            class86.field1342--;
            class36 var67 = var2.field3114;
            if (var67 != null && var67.field448 != 0) {
                if (var67.field441 != null) {
                    var67.field441.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var67.field451 - class108.field1739, var67.field457 - class45.field588 - var67.field448, var67.field454 - class102.field1648, var67.field455);
                }
                if (var67.field447 != null) {
                    var67.field447.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var67.field451 - class108.field1739, var67.field457 - class45.field588 - var67.field448, var67.field454 - class102.field1648, var67.field455);
                }
                if (var67.field446 != null) {
                    var67.field446.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var67.field451 - class108.field1739, var67.field457 - class45.field588 - var67.field448, var67.field454 - class102.field1648, var67.field455);
                }
            }
            if (var2.field3098 != 0) {
                class199 var68 = var2.field3103;
                if (var68 != null && !class187.method1216(var6, var3, var4, var68.field3446.method43())) {
                    if ((var68.field3444 & var2.field3098) != 0) {
                        var68.field3446.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var68.field3439 + var68.field3433 - class108.field1739, var68.field3440 - class45.field588, var68.field3431 + var68.field3435 - class102.field1648, var68.field3443);
                    } else if (var68.field3444 == 256) {
                        int var69 = var68.field3439 - class108.field1739;
                        int var70 = var68.field3440 - class45.field588;
                        int var71 = var68.field3431 - class102.field1648;
                        int var72 = var68.field3436;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field3446.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var68.field3433 + var69, var70, var68.field3435 + var71, var68.field3443);
                        } else if (var68.field3441 != null) {
                            var68.field3441.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var69, var70, var71, var68.field3443);
                        }
                    }
                }
                class162 var75 = var2.field3116;
                if (var75 != null) {
                    if ((var75.field2774 & var2.field3098) != 0 && !class77.method518(var6, var3, var4, var75.field2774)) {
                        var75.field2777.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var75.field2768 - class108.field1739, var75.field2770 - class45.field588, var75.field2772 - class102.field1648, var75.field2769);
                    }
                    if ((var75.field2773 & var2.field3098) != 0 && !class77.method518(var6, var3, var4, var75.field2773)) {
                        var75.field2775.method49(0, class139.field2449, class173.field2997, class129.field2243, class204.field3550, var75.field2768 - class108.field1739, var75.field2770 - class45.field588, var75.field2772 - class102.field1648, var75.field2769);
                    }
                }
            }
            if (var5 < class89.field1395 - 1) {
                class177 var76 = class254.field4395[var5 + 1][var3][var4];
                if (var76 != null && var76.field3094) {
                    class115.field1881.method311((byte) 16, var76);
                }
            }
            if (var3 < class193.field3371) {
                class177 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field3094) {
                    class115.field1881.method311((byte) 16, var77);
                }
            }
            if (var4 < class62.field848) {
                class177 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field3094) {
                    class115.field1881.method311((byte) 16, var78);
                }
            }
            if (var3 > class193.field3371) {
                class177 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field3094) {
                    class115.field1881.method311((byte) 16, var79);
                }
            }
            if (var4 > class62.field848) {
                class177 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field3094) {
                    class115.field1881.method311((byte) 16, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBII)I")
    public static final int method639(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 12) {
            return -115;
        }
        field1531++;
        if (arg2 <= arg0) {
            return arg3 < arg0 ? arg3 : arg0;
        } else {
            return arg2;
        }
    }
}
