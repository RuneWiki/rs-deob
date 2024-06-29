import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class133 {

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    private int field2527 = -1;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    private int field2525 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lpi;")
    private class158 field2521 = new class158();

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Z")
    public boolean field2534 = false;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    private int field2533;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "[[I")
    private int[][] field2532;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    private int field2523;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "[Lrf;")
    private class175[] field2522;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[I")
    public static int[] field2529 = new int[500];

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field2531 = 0;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method841(byte arg0) {
        if (arg0 != 65) {
            method844(null, true);
        }
        field2529 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
    public final int[] method842(int arg0, int arg1) {
        if (arg1 != 12) {
            this.field2534 = true;
        }
        field2528++;
        if (this.field2533 == this.field2523) {
            this.field2534 = this.field2522[arg0] == null;
            this.field2522[arg0] = class46.field885;
            return this.field2532[arg0];
        } else if (this.field2533 == 1) {
            this.field2534 = this.field2527 != arg0;
            this.field2527 = arg0;
            return this.field2532[0];
        } else {
            class175 var3 = this.field2522[arg0];
            if (var3 == null) {
                this.field2534 = true;
                if (this.field2533 > this.field2525) {
                    var3 = new class175(arg0, this.field2525);
                    this.field2525++;
                } else {
                    class175 var4 = (class175) this.field2521.method1104(-126);
                    var3 = new class175(arg0, var4.field3481);
                    this.field2522[var4.field3467] = null;
                    var4.method1392(128);
                }
                this.field2522[arg0] = var3;
            } else {
                this.field2534 = false;
            }
            this.field2521.method1100(var3, true);
            return this.field2532[var3.field3481];
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public final void method843(boolean arg0) {
        for (int var2 = 0; var2 < this.field2533; var2++) {
            this.field2532[var2] = null;
        }
        this.field2532 = null;
        field2524++;
        this.field2522 = null;
        this.field2521.method1102(121);
        this.field2521 = null;
        if (!arg0) {
            this.field2533 = -7;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lpd;Z)V")
    public static final void method844(class153 arg0, boolean arg1) {
        class225.field4245.method1098(0, arg0);
        while (true) {
            class153 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class153[][] var7;
            class153 var65;
            do {
                class153 var64;
                do {
                    class153 var63;
                    do {
                        class153 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class153) class225.field4245.method1097(-12462);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2941);
                                            var3 = var2.field2931;
                                            var4 = var2.field2943;
                                            var5 = var2.field2925;
                                            var6 = var2.field2934;
                                            var7 = class131.field2506[var5];
                                            if (!var2.field2922) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class153 var8 = class131.field2506[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2941) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class213.field4066 && var3 > class200.field3780) {
                                                    class153 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2941 && (var9.field2922 || (var2.field2940 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class213.field4066 && var3 < class67.field1303 - 1) {
                                                    class153 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2941 && (var10.field2922 || (var2.field2940 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class77.field1567 && var4 > class220.field4173) {
                                                    class153 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2941 && (var11.field2922 || (var2.field2940 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class77.field1567 && var4 < class144.field2790 - 1) {
                                                    class153 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2941 && (var12.field2922 || (var2.field2940 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2922 = false;
                                            if (var2.field2927 != null) {
                                                class153 var13 = var2.field2927;
                                                if (var13.field2939 == null) {
                                                    if (var13.field2932 != null && !class15.method97(0, var3, var4)) {
                                                        class130.method830(var13.field2932, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var3, var4);
                                                    }
                                                } else if (!class15.method97(0, var3, var4)) {
                                                    class67.method445(var13.field2939, 0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var3, var4);
                                                }
                                                class172 var14 = var13.field2929;
                                                if (var14 != null) {
                                                    var14.field3418.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var14.field3414 - class18.field316, var14.field3416 - class162.field3145, var14.field3423 - class35.field710, var14.field3417);
                                                }
                                                for (int var15 = 0; var15 < var13.field2933; var15++) {
                                                    class9 var16 = var13.field2935[var15];
                                                    if (var16 != null) {
                                                        var16.field147.method10(var16.field153, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var16.field148 - class18.field316, var16.field154 - class162.field3145, var16.field140 - class35.field710, var16.field141);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2939 == null) {
                                                if (var2.field2932 != null && !class15.method97(var6, var3, var4)) {
                                                    var17 = true;
                                                    class130.method830(var2.field2932, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var3, var4);
                                                }
                                            } else if (!class15.method97(var6, var3, var4)) {
                                                var17 = true;
                                                if (var2.field2939.field1553 != 12345678 || class27.field515 && var5 <= class57.field1094) {
                                                    class67.method445(var2.field2939, var6, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var3, var4);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class172 var20 = var2.field2929;
                                            class58 var21 = var2.field2923;
                                            if (var20 != null || var21 != null) {
                                                if (class213.field4066 == var3) {
                                                    var18++;
                                                } else if (class213.field4066 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class77.field1567 == var4) {
                                                    var18 += 3;
                                                } else if (class77.field1567 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class58.field1122[var18];
                                                var2.field2938 = class220.field4158[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field3421 & class197.field3763[var18]) == 0) {
                                                    var2.field2928 = 0;
                                                } else if (var20.field3421 == 16) {
                                                    var2.field2928 = 3;
                                                    var2.field2924 = class84.field1677[var18];
                                                    var2.field2942 = 3 - var2.field2924;
                                                } else if (var20.field3421 == 32) {
                                                    var2.field2928 = 6;
                                                    var2.field2924 = class185.field3604[var18];
                                                    var2.field2942 = 6 - var2.field2924;
                                                } else if (var20.field3421 == 64) {
                                                    var2.field2928 = 12;
                                                    var2.field2924 = class159.field3082[var18];
                                                    var2.field2942 = 12 - var2.field2924;
                                                } else {
                                                    var2.field2928 = 9;
                                                    var2.field2924 = class115.field2203[var18];
                                                    var2.field2942 = 9 - var2.field2924;
                                                }
                                                if ((var20.field3421 & var19) != 0 && !class92.method631(var6, var3, var4, var20.field3421)) {
                                                    var20.field3418.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var20.field3414 - class18.field316, var20.field3416 - class162.field3145, var20.field3423 - class35.field710, var20.field3417);
                                                }
                                                if ((var20.field3422 & var19) != 0 && !class92.method631(var6, var3, var4, var20.field3422)) {
                                                    var20.field3409.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var20.field3414 - class18.field316, var20.field3416 - class162.field3145, var20.field3423 - class35.field710, var20.field3417);
                                                }
                                            }
                                            if (var21 != null && !class160.method1119(var6, var3, var4, var21.field1135.method16())) {
                                                if ((var21.field1137 & var19) != 0) {
                                                    var21.field1135.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var21.field1123 + var21.field1130 - class18.field316, var21.field1138 - class162.field3145, var21.field1136 + var21.field1129 - class35.field710, var21.field1133);
                                                } else if (var21.field1137 == 256) {
                                                    int var22 = var21.field1123 - class18.field316;
                                                    int var23 = var21.field1138 - class162.field3145;
                                                    int var24 = var21.field1136 - class35.field710;
                                                    int var25 = var21.field1121;
                                                    int var26;
                                                    if (var25 == 1 || var25 == 2) {
                                                        var26 = -var22;
                                                    } else {
                                                        var26 = var22;
                                                    }
                                                    int var27;
                                                    if (var25 == 2 || var25 == 3) {
                                                        var27 = -var24;
                                                    } else {
                                                        var27 = var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field1135.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var21.field1130 + var22, var23, var21.field1129 + var24, var21.field1133);
                                                    } else if (var21.field1139 != null) {
                                                        var21.field1139.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var22, var23, var24, var21.field1133);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class124 var28 = var2.field2926;
                                                if (var28 != null) {
                                                    var28.field2379.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var28.field2386 - class18.field316, var28.field2389 - class162.field3145, var28.field2385 - class35.field710, var28.field2391);
                                                }
                                                class36 var29 = var2.field2936;
                                                if (var29 != null && var29.field723 == 0) {
                                                    if (var29.field729 != null) {
                                                        var29.field729.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var29.field716 - class18.field316, var29.field711 - class162.field3145, var29.field719 - class35.field710, var29.field727);
                                                    }
                                                    if (var29.field722 != null) {
                                                        var29.field722.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var29.field716 - class18.field316, var29.field711 - class162.field3145, var29.field719 - class35.field710, var29.field727);
                                                    }
                                                    if (var29.field725 != null) {
                                                        var29.field725.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var29.field716 - class18.field316, var29.field711 - class162.field3145, var29.field719 - class35.field710, var29.field727);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field2940;
                                            if (var30 != 0) {
                                                if (var3 < class213.field4066 && (var30 & 0x4) != 0) {
                                                    class153 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field2941) {
                                                        class225.field4245.method1098(0, var31);
                                                    }
                                                }
                                                if (var4 < class77.field1567 && (var30 & 0x2) != 0) {
                                                    class153 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field2941) {
                                                        class225.field4245.method1098(0, var32);
                                                    }
                                                }
                                                if (var3 > class213.field4066 && (var30 & 0x1) != 0) {
                                                    class153 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field2941) {
                                                        class225.field4245.method1098(0, var33);
                                                    }
                                                }
                                                if (var4 > class77.field1567 && (var30 & 0x8) != 0) {
                                                    class153 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field2941) {
                                                        class225.field4245.method1098(0, var34);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2928 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field2933; var36++) {
                                                if (class209.field3942 != var2.field2935[var36].field146 && (var2.field2930[var36] & var2.field2928) == var2.field2924) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class172 var37 = var2.field2929;
                                                if (!class92.method631(var6, var3, var4, var37.field3421)) {
                                                    var37.field3418.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var37.field3414 - class18.field316, var37.field3416 - class162.field3145, var37.field3423 - class35.field710, var37.field3417);
                                                }
                                                var2.field2928 = 0;
                                            }
                                        }
                                        if (!var2.field2921) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field2933;
                                            var2.field2921 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; var40++) {
                                                class9 var41 = var2.field2935[var40];
                                                if (class209.field3942 != var41.field146) {
                                                    for (int var42 = var41.field156; var42 <= var41.field144; var42++) {
                                                        for (int var43 = var41.field143; var43 <= var41.field157; var43++) {
                                                            class153 var44 = var7[var42][var43];
                                                            if (var44.field2922) {
                                                                var2.field2921 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field2928 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field156) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field144) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field143) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field157) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field2928) == var2.field2942) {
                                                                    var2.field2921 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class158.field3051[var39++] = var41;
                                                    int var46 = class213.field4066 - var41.field156;
                                                    int var47 = var41.field144 - class213.field4066;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class77.field1567 - var41.field143;
                                                    int var49 = var41.field157 - class77.field1567;
                                                    if (var49 > var48) {
                                                        var41.field155 = var46 + var49;
                                                    } else {
                                                        var41.field155 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class9 var53 = class158.field3051[var52];
                                                    if (class209.field3942 != var53.field146) {
                                                        if (var53.field155 > var50) {
                                                            var50 = var53.field155;
                                                            var51 = var52;
                                                        } else if (var53.field155 == var50) {
                                                            int var54 = var53.field148 - class18.field316;
                                                            int var55 = var53.field140 - class35.field710;
                                                            int var56 = class158.field3051[var51].field148 - class18.field316;
                                                            int var57 = class158.field3051[var51].field140 - class35.field710;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class9 var58 = class158.field3051[var51];
                                                var58.field146 = class209.field3942;
                                                if (!class82.method568(var6, var58.field156, var58.field144, var58.field143, var58.field157, var58.field147.method16())) {
                                                    var58.field147.method10(var58.field153, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var58.field148 - class18.field316, var58.field154 - class162.field3145, var58.field140 - class35.field710, var58.field141);
                                                }
                                                for (int var59 = var58.field156; var59 <= var58.field144; var59++) {
                                                    for (int var60 = var58.field143; var60 <= var58.field157; var60++) {
                                                        class153 var61 = var7[var59][var60];
                                                        if (var61.field2928 != 0) {
                                                            class225.field4245.method1098(0, var61);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field2941) {
                                                            class225.field4245.method1098(0, var61);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2921) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field2921 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2941);
                            } while (var2.field2928 != 0);
                            if (var3 > class213.field4066 || var3 <= class200.field3780) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field2941);
                        if (var3 < class213.field4066 || var3 >= class67.field1303 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field2941);
                    if (var4 > class77.field1567 || var4 <= class220.field4173) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field2941);
                if (var4 < class77.field1567 || var4 >= class144.field2790 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field2941);
            var2.field2941 = false;
            class81.field1618--;
            class36 var66 = var2.field2936;
            if (var66 != null && var66.field723 != 0) {
                if (var66.field729 != null) {
                    var66.field729.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var66.field716 - class18.field316, var66.field711 - class162.field3145 - var66.field723, var66.field719 - class35.field710, var66.field727);
                }
                if (var66.field722 != null) {
                    var66.field722.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var66.field716 - class18.field316, var66.field711 - class162.field3145 - var66.field723, var66.field719 - class35.field710, var66.field727);
                }
                if (var66.field725 != null) {
                    var66.field725.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var66.field716 - class18.field316, var66.field711 - class162.field3145 - var66.field723, var66.field719 - class35.field710, var66.field727);
                }
            }
            if (var2.field2938 != 0) {
                class58 var67 = var2.field2923;
                if (var67 != null && !class160.method1119(var6, var3, var4, var67.field1135.method16())) {
                    if ((var67.field1137 & var2.field2938) != 0) {
                        var67.field1135.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var67.field1123 + var67.field1130 - class18.field316, var67.field1138 - class162.field3145, var67.field1136 + var67.field1129 - class35.field710, var67.field1133);
                    } else if (var67.field1137 == 256) {
                        int var68 = var67.field1123 - class18.field316;
                        int var69 = var67.field1138 - class162.field3145;
                        int var70 = var67.field1136 - class35.field710;
                        int var71 = var67.field1121;
                        int var72;
                        if (var71 == 1 || var71 == 2) {
                            var72 = -var68;
                        } else {
                            var72 = var68;
                        }
                        int var73;
                        if (var71 == 2 || var71 == 3) {
                            var73 = -var70;
                        } else {
                            var73 = var70;
                        }
                        if (var73 >= var72) {
                            var67.field1135.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var67.field1130 + var68, var69, var67.field1129 + var70, var67.field1133);
                        } else if (var67.field1139 != null) {
                            var67.field1139.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var68, var69, var70, var67.field1133);
                        }
                    }
                }
                class172 var74 = var2.field2929;
                if (var74 != null) {
                    if ((var74.field3422 & var2.field2938) != 0 && !class92.method631(var6, var3, var4, var74.field3422)) {
                        var74.field3409.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var74.field3414 - class18.field316, var74.field3416 - class162.field3145, var74.field3423 - class35.field710, var74.field3417);
                    }
                    if ((var74.field3421 & var2.field2938) != 0 && !class92.method631(var6, var3, var4, var74.field3421)) {
                        var74.field3418.method10(0, class104.field2005, class119.field2311, class215.field4095, class151.field2903, var74.field3414 - class18.field316, var74.field3416 - class162.field3145, var74.field3423 - class35.field710, var74.field3417);
                    }
                }
            }
            if (var5 < class108.field2090 - 1) {
                class153 var75 = class131.field2506[var5 + 1][var3][var4];
                if (var75 != null && var75.field2941) {
                    class225.field4245.method1098(0, var75);
                }
            }
            if (var3 < class213.field4066) {
                class153 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field2941) {
                    class225.field4245.method1098(0, var76);
                }
            }
            if (var4 < class77.field1567) {
                class153 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field2941) {
                    class225.field4245.method1098(0, var77);
                }
            }
            if (var3 > class213.field4066) {
                class153 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field2941) {
                    class225.field4245.method1098(0, var78);
                }
            }
            if (var4 > class77.field1567) {
                class153 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field2941) {
                    class225.field4245.method1098(0, var79);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)[[I")
    public final int[][] method845(int arg0) {
        field2526++;
        if (this.field2533 != this.field2523) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 2) {
            this.method843(false);
        }
        for (int var2 = 0; var2 < this.field2533; var2++) {
            this.field2522[var2] = class46.field885;
        }
        return this.field2532;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
    public class133(int arg0, int arg1, int arg2) {
        this.field2533 = arg0;
        this.field2532 = new int[this.field2533][arg2];
        this.field2523 = arg1;
        this.field2522 = new class175[this.field2523];
    }
}
