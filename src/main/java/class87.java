import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class87 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1369 = 0;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1370 = 1;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static volatile int field1375 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lsj;Z)V")
    public static final void method596(class49 arg0, boolean arg1) {
        class6.field89.method349(arg0, true);
        while (true) {
            class49 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class49[][] var7;
            class49 var66;
            do {
                class49 var65;
                do {
                    class49 var64;
                    do {
                        class49 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class49) class6.field89.method344((byte) -5);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field649);
                                            var3 = var2.field640;
                                            var4 = var2.field647;
                                            var5 = var2.field634;
                                            var6 = var2.field644;
                                            var7 = class90.field1382[var5];
                                            if (!var2.field642) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class49 var8 = class90.field1382[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field649) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class72.field1010 && var3 > class110.field1674) {
                                                    class49 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field649 && (var9.field642 || (var2.field650 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class72.field1010 && var3 < class131.field1922 - 1) {
                                                    class49 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field649 && (var10.field642 || (var2.field650 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class173.field2721 && var4 > class60.field846) {
                                                    class49 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field649 && (var11.field642 || (var2.field650 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class173.field2721 && var4 < class102.field1584 - 1) {
                                                    class49 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field649 && (var12.field642 || (var2.field650 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field642 = false;
                                            if (var2.field636 != null) {
                                                class49 var13 = var2.field636;
                                                if (var13.field638 == null) {
                                                    if (var13.field632 != null) {
                                                        if (class170.method1188(0, var3, var4)) {
                                                            class30.method243(var13.field632, class250.field4009, class130.field1904, class25.field340, class153.field2282, var3, var4, true);
                                                        } else {
                                                            class30.method243(var13.field632, class250.field4009, class130.field1904, class25.field340, class153.field2282, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class170.method1188(0, var3, var4)) {
                                                    class228.method1563(var13.field638, 0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var3, var4, true);
                                                } else {
                                                    class228.method1563(var13.field638, 0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var3, var4, false);
                                                }
                                                class69 var14 = var13.field627;
                                                if (var14 != null) {
                                                    var14.field963.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var14.field970 - class172.field2696, var14.field976 - client.field2328, var14.field964 - class82.field1285, var14.field962, var5, (class217) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field639; var15++) {
                                                    class284 var16 = var13.field643[var15];
                                                    if (var16 != null) {
                                                        var16.field4500.method373(var16.field4507, class250.field4009, class130.field1904, class25.field340, class153.field2282, var16.field4511 - class172.field2696, var16.field4502 - client.field2328, var16.field4495 - class82.field1285, var16.field4497, var5, (class217) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field638 == null) {
                                                if (var2.field632 != null) {
                                                    if (class170.method1188(var6, var3, var4)) {
                                                        class30.method243(var2.field632, class250.field4009, class130.field1904, class25.field340, class153.field2282, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class30.method243(var2.field632, class250.field4009, class130.field1904, class25.field340, class153.field2282, var3, var4, false);
                                                    }
                                                }
                                            } else if (class170.method1188(var6, var3, var4)) {
                                                class228.method1563(var2.field638, var6, class250.field4009, class130.field1904, class25.field340, class153.field2282, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field638.field3505 != 12345678 || class78.field1109 && var5 <= class66.field928) {
                                                    class228.method1563(var2.field638, var6, class250.field4009, class130.field1904, class25.field340, class153.field2282, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class17 var18 = var2.field635;
                                                if (var18 != null && (var18.field201 & 0x80000000L) != 0L) {
                                                    var18.field203.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var18.field210 - class172.field2696, var18.field206 - client.field2328, var18.field207 - class82.field1285, var18.field201, var5, (class217) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class69 var21 = var2.field627;
                                            class264 var22 = var2.field631;
                                            if (var21 != null || var22 != null) {
                                                if (class72.field1010 == var3) {
                                                    var19++;
                                                } else if (class72.field1010 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class173.field2721 == var4) {
                                                    var19 += 3;
                                                } else if (class173.field2721 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class19.field228[var19];
                                                var2.field641 = class268.field4282[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field975 & class71.field1008[var19]) == 0) {
                                                    var2.field651 = 0;
                                                } else if (var21.field975 == 16) {
                                                    var2.field651 = 3;
                                                    var2.field646 = class98.field1519[var19];
                                                    var2.field637 = 3 - var2.field646;
                                                } else if (var21.field975 == 32) {
                                                    var2.field651 = 6;
                                                    var2.field646 = class212.field3314[var19];
                                                    var2.field637 = 6 - var2.field646;
                                                } else if (var21.field975 == 64) {
                                                    var2.field651 = 12;
                                                    var2.field646 = class199.field3120[var19];
                                                    var2.field637 = 12 - var2.field646;
                                                } else {
                                                    var2.field651 = 9;
                                                    var2.field646 = class178.field2783[var19];
                                                    var2.field637 = 9 - var2.field646;
                                                }
                                                if ((var21.field975 & var20) != 0 && !class33.method265(var6, var3, var4, var21.field975)) {
                                                    var21.field963.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var21.field970 - class172.field2696, var21.field976 - client.field2328, var21.field964 - class82.field1285, var21.field962, var5, (class217) null);
                                                }
                                                if ((var21.field969 & var20) != 0 && !class33.method265(var6, var3, var4, var21.field969)) {
                                                    var21.field965.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var21.field970 - class172.field2696, var21.field976 - client.field2328, var21.field964 - class82.field1285, var21.field962, var5, (class217) null);
                                                }
                                            }
                                            if (var22 != null && !class224.method1528(var6, var3, var4, var22.field4266.method363())) {
                                                if ((var22.field4253 & var20) != 0) {
                                                    var22.field4266.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var22.field4252 + var22.field4250 - class172.field2696, var22.field4248 - client.field2328, var22.field4258 + var22.field4262 - class82.field1285, var22.field4265, var5, (class217) null);
                                                } else if (var22.field4253 == 256) {
                                                    int var23 = var22.field4252 - class172.field2696;
                                                    int var24 = var22.field4248 - client.field2328;
                                                    int var25 = var22.field4258 - class82.field1285;
                                                    int var26 = var22.field4259;
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
                                                        var22.field4266.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var22.field4250 + var23, var24, var22.field4262 + var25, var22.field4265, var5, (class217) null);
                                                    } else if (var22.field4261 != null) {
                                                        var22.field4261.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var23, var24, var25, var22.field4265, var5, (class217) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class17 var29 = var2.field635;
                                                if (var29 != null && (var29.field201 & 0x80000000L) == 0L) {
                                                    var29.field203.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var29.field210 - class172.field2696, var29.field206 - client.field2328, var29.field207 - class82.field1285, var29.field201, var5, (class217) null);
                                                }
                                                class59 var30 = var2.field630;
                                                if (var30 != null && var30.field832 == 0) {
                                                    if (var30.field830 != null) {
                                                        var30.field830.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var30.field825 - class172.field2696, var30.field826 - client.field2328, var30.field824 - class82.field1285, var30.field837, var5, (class217) null);
                                                    }
                                                    if (var30.field823 != null) {
                                                        var30.field823.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var30.field825 - class172.field2696, var30.field826 - client.field2328, var30.field824 - class82.field1285, var30.field837, var5, (class217) null);
                                                    }
                                                    if (var30.field833 != null) {
                                                        var30.field833.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var30.field825 - class172.field2696, var30.field826 - client.field2328, var30.field824 - class82.field1285, var30.field837, var5, (class217) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field650;
                                            if (var31 != 0) {
                                                if (var3 < class72.field1010 && (var31 & 0x4) != 0) {
                                                    class49 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field649) {
                                                        class6.field89.method349(var32, true);
                                                    }
                                                }
                                                if (var4 < class173.field2721 && (var31 & 0x2) != 0) {
                                                    class49 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field649) {
                                                        class6.field89.method349(var33, true);
                                                    }
                                                }
                                                if (var3 > class72.field1010 && (var31 & 0x1) != 0) {
                                                    class49 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field649) {
                                                        class6.field89.method349(var34, true);
                                                    }
                                                }
                                                if (var4 > class173.field2721 && (var31 & 0x8) != 0) {
                                                    class49 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field649) {
                                                        class6.field89.method349(var35, true);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field651 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field639; var37++) {
                                                if (class31.field420 != var2.field643[var37].field4499 && (var2.field645[var37] & var2.field651) == var2.field646) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class69 var38 = var2.field627;
                                                if (!class33.method265(var6, var3, var4, var38.field975)) {
                                                    var38.field963.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var38.field970 - class172.field2696, var38.field976 - client.field2328, var38.field964 - class82.field1285, var38.field962, var5, (class217) null);
                                                }
                                                var2.field651 = 0;
                                            }
                                        }
                                        if (!var2.field629) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field639;
                                            var2.field629 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class284 var42 = var2.field643[var41];
                                                if (class31.field420 != var42.field4499) {
                                                    for (int var43 = var42.field4494; var43 <= var42.field4504; var43++) {
                                                        for (int var44 = var42.field4498; var44 <= var42.field4510; var44++) {
                                                            class49 var45 = var7[var43][var44];
                                                            if (var45.field642) {
                                                                var2.field629 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field651 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field4494) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field4504) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field4498) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field4510) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field651) == var2.field637) {
                                                                    var2.field629 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class186.field2924[var40++] = var42;
                                                    int var47 = class72.field1010 - var42.field4494;
                                                    int var48 = var42.field4504 - class72.field1010;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class173.field2721 - var42.field4498;
                                                    int var50 = var42.field4510 - class173.field2721;
                                                    if (var50 > var49) {
                                                        var42.field4506 = var47 + var50;
                                                    } else {
                                                        var42.field4506 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class284 var54 = class186.field2924[var53];
                                                    if (class31.field420 != var54.field4499) {
                                                        if (var54.field4506 > var51) {
                                                            var51 = var54.field4506;
                                                            var52 = var53;
                                                        } else if (var54.field4506 == var51) {
                                                            int var55 = var54.field4511 - class172.field2696;
                                                            int var56 = var54.field4495 - class82.field1285;
                                                            int var57 = class186.field2924[var52].field4511 - class172.field2696;
                                                            int var58 = class186.field2924[var52].field4495 - class82.field1285;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class284 var59 = class186.field2924[var52];
                                                var59.field4499 = class31.field420;
                                                if (!class279.method1871(var6, var59.field4494, var59.field4504, var59.field4498, var59.field4510, var59.field4500.method363())) {
                                                    var59.field4500.method373(var59.field4507, class250.field4009, class130.field1904, class25.field340, class153.field2282, var59.field4511 - class172.field2696, var59.field4502 - client.field2328, var59.field4495 - class82.field1285, var59.field4497, var5, (class217) null);
                                                }
                                                for (int var60 = var59.field4494; var60 <= var59.field4504; var60++) {
                                                    for (int var61 = var59.field4498; var61 <= var59.field4510; var61++) {
                                                        class49 var62 = var7[var60][var61];
                                                        if (var62.field651 != 0) {
                                                            class6.field89.method349(var62, true);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field649) {
                                                            class6.field89.method349(var62, true);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field629) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field629 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field649);
                            } while (var2.field651 != 0);
                            if (var3 > class72.field1010 || var3 <= class110.field1674) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field649);
                        if (var3 < class72.field1010 || var3 >= class131.field1922 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field649);
                    if (var4 > class173.field2721 || var4 <= class60.field846) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field649);
                if (var4 < class173.field2721 || var4 >= class102.field1584 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field649);
            var2.field649 = false;
            class79.field1141--;
            class59 var67 = var2.field630;
            if (var67 != null && var67.field832 != 0) {
                if (var67.field830 != null) {
                    var67.field830.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var67.field825 - class172.field2696, var67.field826 - client.field2328 - var67.field832, var67.field824 - class82.field1285, var67.field837, var5, (class217) null);
                }
                if (var67.field823 != null) {
                    var67.field823.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var67.field825 - class172.field2696, var67.field826 - client.field2328 - var67.field832, var67.field824 - class82.field1285, var67.field837, var5, (class217) null);
                }
                if (var67.field833 != null) {
                    var67.field833.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var67.field825 - class172.field2696, var67.field826 - client.field2328 - var67.field832, var67.field824 - class82.field1285, var67.field837, var5, (class217) null);
                }
            }
            if (var2.field641 != 0) {
                class264 var68 = var2.field631;
                if (var68 != null && !class224.method1528(var6, var3, var4, var68.field4266.method363())) {
                    if ((var68.field4253 & var2.field641) != 0) {
                        var68.field4266.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var68.field4252 + var68.field4250 - class172.field2696, var68.field4248 - client.field2328, var68.field4258 + var68.field4262 - class82.field1285, var68.field4265, var5, (class217) null);
                    } else if (var68.field4253 == 256) {
                        int var69 = var68.field4252 - class172.field2696;
                        int var70 = var68.field4248 - client.field2328;
                        int var71 = var68.field4258 - class82.field1285;
                        int var72 = var68.field4259;
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
                            var68.field4266.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var68.field4250 + var69, var70, var68.field4262 + var71, var68.field4265, var5, (class217) null);
                        } else if (var68.field4261 != null) {
                            var68.field4261.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var69, var70, var71, var68.field4265, var5, (class217) null);
                        }
                    }
                }
                class69 var75 = var2.field627;
                if (var75 != null) {
                    if ((var75.field969 & var2.field641) != 0 && !class33.method265(var6, var3, var4, var75.field969)) {
                        var75.field965.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var75.field970 - class172.field2696, var75.field976 - client.field2328, var75.field964 - class82.field1285, var75.field962, var5, (class217) null);
                    }
                    if ((var75.field975 & var2.field641) != 0 && !class33.method265(var6, var3, var4, var75.field975)) {
                        var75.field963.method373(0, class250.field4009, class130.field1904, class25.field340, class153.field2282, var75.field970 - class172.field2696, var75.field976 - client.field2328, var75.field964 - class82.field1285, var75.field962, var5, (class217) null);
                    }
                }
            }
            if (var5 < class194.field3046 - 1) {
                class49 var76 = class90.field1382[var5 + 1][var3][var4];
                if (var76 != null && var76.field649) {
                    class6.field89.method349(var76, true);
                }
            }
            if (var3 < class72.field1010) {
                class49 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field649) {
                    class6.field89.method349(var77, true);
                }
            }
            if (var4 < class173.field2721) {
                class49 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field649) {
                    class6.field89.method349(var78, true);
                }
            }
            if (var3 > class72.field1010) {
                class49 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field649) {
                    class6.field89.method349(var79, true);
                }
            }
            if (var4 > class173.field2721) {
                class49 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field649) {
                    class6.field89.method349(var80, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/StringBuffer;ICI)Ljava/lang/StringBuffer;")
    public static final StringBuffer method597(StringBuffer arg0, int arg1, char arg2, int arg3) {
        field1368++;
        int var4 = arg0.length();
        arg0.setLength(arg1);
        for (int var5 = var4; var5 < arg1; var5++) {
            arg0.setCharAt(var5, arg2);
        }
        if (arg3 > -45) {
            method596((class49) null, false);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static final void method598(int arg0) {
        class249.field3992.method1420(-1);
        class44.field562.method1420(-1);
        field1373++;
        if (arg0 != 0) {
            method598(-71);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIBII)V")
    public static final void method599(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var9 = arg4 + 1;
        class8.method52(arg0, class106.field1637[arg4], arg5, arg2, true);
        if (arg3 >= -107) {
            return;
        }
        field1367++;
        int var8 = arg1 - 1;
        class8.method52(arg0, class106.field1637[arg1], arg5, arg2, true);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class106.field1637[var6];
            var7[arg0] = var7[arg5] = arg2;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)J")
    public static final long method600(int arg0, int arg1, int arg2) {
        class49 var3 = class90.field1382[arg0][arg1][arg2];
        return var3 == null || var3.field635 == null ? 0L : var3.field635.field201;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
    public static final void method601(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            method599(-46, -49, -82, (byte) 19, -25, -95);
        }
        if (class76.field1074 != 0 && arg3 != 0 && field1369 < 50 && arg1 != -1) {
            class100.field1556[field1369] = arg1;
            class3.field29[field1369] = arg3;
            class216.field3520[field1369] = arg0;
            class71.field1000[field1369] = null;
            class6.field93[field1369] = 0;
            field1369++;
        }
        field1374++;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static final void method602(int arg0) {
        class248.field3960.method1430(arg0 - 2);
        field1371++;
        if (arg0 != 1) {
            method601(60, 5, -1, -7);
        }
    }
}
