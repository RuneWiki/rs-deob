import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class99 extends RuntimeException {

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Ljava/lang/String;")
    public String field1677;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1679;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Lmb;")
    public static class96 field1676 = class243.method1708("::fpson", (byte) 93);

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Lmb;")
    public static class96 field1681 = class243.method1708("Benutzeroberfl-=che geladen)3", (byte) 122);

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "[S")
    public static short[] field1680;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIILnb;IJIIII)Z")
    public static final boolean method744(int arg0, int arg1, int arg2, int arg3, class108 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class120.method925(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method745(byte arg0) {
        if (arg0 != -51) {
            field1681 = null;
        }
        field1680 = null;
        field1676 = null;
        field1681 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IJ)V")
    public static final void method746(int arg0, long arg1) {
        field1678++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = arg0; var3 < class231.field3974; var3++) {
            if (class7.field132[var3] == arg1) {
                class231.field3974--;
                for (int var4 = var3; var4 < class231.field3974; var4++) {
                    class7.field132[var4] = class7.field132[var4 + 1];
                    class106.field1804[var4] = class106.field1804[var4 + 1];
                }
                class108.field2001++;
                class208.field3588 = class67.field1137;
                class140.field2505.method1012((byte) -27, 38);
                class140.field2505.method1668(arg1, -87);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class99(Throwable arg0, String arg1) {
        this.field1677 = arg1;
        this.field1679 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ldk;Z)V")
    public static final void method747(class187 arg0, boolean arg1) {
        class231.field3970.method1814(1, arg0);
        while (true) {
            class187 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class187[][] var7;
            class187 var66;
            do {
                class187 var65;
                do {
                    class187 var64;
                    do {
                        class187 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class187) class231.field3970.method1815(9);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3270);
                                            var3 = var2.field3284;
                                            var4 = var2.field3272;
                                            var5 = var2.field3280;
                                            var6 = var2.field3277;
                                            var7 = class259.field4487[var5];
                                            if (!var2.field3273) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class187 var8 = class259.field4487[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3270) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class14.field224 && var3 > class239.field4109) {
                                                    class187 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3270 && (var9.field3273 || (var2.field3276 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class14.field224 && var3 < class231.field3971 - 1) {
                                                    class187 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3270 && (var10.field3273 || (var2.field3276 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class6.field120 && var4 > class161.field2847) {
                                                    class187 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3270 && (var11.field3273 || (var2.field3276 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class6.field120 && var4 < class78.field1325 - 1) {
                                                    class187 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3270 && (var12.field3273 || (var2.field3276 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3273 = false;
                                            if (var2.field3286 != null) {
                                                class187 var13 = var2.field3286;
                                                if (var13.field3283 == null) {
                                                    if (var13.field3266 != null) {
                                                        if (class153.method1123(0, var3, var4)) {
                                                            class274.method1861(var13.field3266, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var3, var4, true);
                                                        } else {
                                                            class274.method1861(var13.field3266, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class153.method1123(0, var3, var4)) {
                                                    class157.method1141(var13.field3283, 0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var3, var4, true);
                                                } else {
                                                    class157.method1141(var13.field3283, 0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var3, var4, false);
                                                }
                                                class19 var14 = var13.field3281;
                                                if (var14 != null) {
                                                    var14.field311.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var14.field305 - class211.field3646, var14.field308 - class262.field4598, var14.field315 - class21.field350, var14.field309);
                                                }
                                                for (int var15 = 0; var15 < var13.field3282; var15++) {
                                                    class70 var16 = var13.field3274[var15];
                                                    if (var16 != null) {
                                                        var16.field1214.method52(var16.field1212, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var16.field1200 - class211.field3646, var16.field1209 - class262.field4598, var16.field1202 - class21.field350, var16.field1197);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3283 == null) {
                                                if (var2.field3266 != null) {
                                                    if (class153.method1123(var6, var3, var4)) {
                                                        class274.method1861(var2.field3266, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class274.method1861(var2.field3266, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var3, var4, false);
                                                    }
                                                }
                                            } else if (class153.method1123(var6, var3, var4)) {
                                                class157.method1141(var2.field3283, var6, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field3283.field4324 != 12345678 || class269.field4679 && var5 <= class206.field3534) {
                                                    class157.method1141(var2.field3283, var6, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class5 var18 = var2.field3279;
                                                if (var18 != null && (var18.field111 & 0x80000000L) != 0L) {
                                                    var18.field104.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var18.field106 - class211.field3646, var18.field103 - class262.field4598, var18.field108 - class21.field350, var18.field111);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class19 var21 = var2.field3281;
                                            class105 var22 = var2.field3269;
                                            if (var21 != null || var22 != null) {
                                                if (class14.field224 == var3) {
                                                    var19++;
                                                } else if (class14.field224 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class6.field120 == var4) {
                                                    var19 += 3;
                                                } else if (class6.field120 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class53.field922[var19];
                                                var2.field3265 = class87.field1459[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field306 & class251.field4355[var19]) == 0) {
                                                    var2.field3278 = 0;
                                                } else if (var21.field306 == 16) {
                                                    var2.field3278 = 3;
                                                    var2.field3264 = class52.field911[var19];
                                                    var2.field3275 = 3 - var2.field3264;
                                                } else if (var21.field306 == 32) {
                                                    var2.field3278 = 6;
                                                    var2.field3264 = class186.field3250[var19];
                                                    var2.field3275 = 6 - var2.field3264;
                                                } else if (var21.field306 == 64) {
                                                    var2.field3278 = 12;
                                                    var2.field3264 = class134.field2413[var19];
                                                    var2.field3275 = 12 - var2.field3264;
                                                } else {
                                                    var2.field3278 = 9;
                                                    var2.field3264 = class269.field4692[var19];
                                                    var2.field3275 = 9 - var2.field3264;
                                                }
                                                if ((var21.field306 & var20) != 0 && !class194.method1354(var6, var3, var4, var21.field306)) {
                                                    var21.field311.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var21.field305 - class211.field3646, var21.field308 - class262.field4598, var21.field315 - class21.field350, var21.field309);
                                                }
                                                if ((var21.field314 & var20) != 0 && !class194.method1354(var6, var3, var4, var21.field314)) {
                                                    var21.field303.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var21.field305 - class211.field3646, var21.field308 - class262.field4598, var21.field315 - class21.field350, var21.field309);
                                                }
                                            }
                                            if (var22 != null && !class26.method178(var6, var3, var4, var22.field1754.method50())) {
                                                if ((var22.field1768 & var20) != 0) {
                                                    var22.field1754.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var22.field1758 + var22.field1755 - class211.field3646, var22.field1765 - class262.field4598, var22.field1760 + var22.field1762 - class21.field350, var22.field1766);
                                                } else if (var22.field1768 == 256) {
                                                    int var23 = var22.field1758 - class211.field3646;
                                                    int var24 = var22.field1765 - class262.field4598;
                                                    int var25 = var22.field1760 - class21.field350;
                                                    int var26 = var22.field1759;
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
                                                        var22.field1754.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var22.field1755 + var23, var24, var22.field1762 + var25, var22.field1766);
                                                    } else if (var22.field1757 != null) {
                                                        var22.field1757.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var23, var24, var25, var22.field1766);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class5 var29 = var2.field3279;
                                                if (var29 != null && (var29.field111 & 0x80000000L) == 0L) {
                                                    var29.field104.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var29.field106 - class211.field3646, var29.field103 - class262.field4598, var29.field108 - class21.field350, var29.field111);
                                                }
                                                class41 var30 = var2.field3285;
                                                if (var30 != null && var30.field705 == 0) {
                                                    if (var30.field708 != null) {
                                                        var30.field708.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var30.field700 - class211.field3646, var30.field697 - class262.field4598, var30.field703 - class21.field350, var30.field704);
                                                    }
                                                    if (var30.field709 != null) {
                                                        var30.field709.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var30.field700 - class211.field3646, var30.field697 - class262.field4598, var30.field703 - class21.field350, var30.field704);
                                                    }
                                                    if (var30.field695 != null) {
                                                        var30.field695.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var30.field700 - class211.field3646, var30.field697 - class262.field4598, var30.field703 - class21.field350, var30.field704);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field3276;
                                            if (var31 != 0) {
                                                if (var3 < class14.field224 && (var31 & 0x4) != 0) {
                                                    class187 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field3270) {
                                                        class231.field3970.method1814(1, var32);
                                                    }
                                                }
                                                if (var4 < class6.field120 && (var31 & 0x2) != 0) {
                                                    class187 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field3270) {
                                                        class231.field3970.method1814(1, var33);
                                                    }
                                                }
                                                if (var3 > class14.field224 && (var31 & 0x1) != 0) {
                                                    class187 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field3270) {
                                                        class231.field3970.method1814(1, var34);
                                                    }
                                                }
                                                if (var4 > class6.field120 && (var31 & 0x8) != 0) {
                                                    class187 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field3270) {
                                                        class231.field3970.method1814(1, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3278 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field3282; var37++) {
                                                if (client.field1990 != var2.field3274[var37].field1201 && (var2.field3268[var37] & var2.field3278) == var2.field3264) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class19 var38 = var2.field3281;
                                                if (!class194.method1354(var6, var3, var4, var38.field306)) {
                                                    var38.field311.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var38.field305 - class211.field3646, var38.field308 - class262.field4598, var38.field315 - class21.field350, var38.field309);
                                                }
                                                var2.field3278 = 0;
                                            }
                                        }
                                        if (!var2.field3267) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field3282;
                                            var2.field3267 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class70 var42 = var2.field3274[var41];
                                                if (client.field1990 != var42.field1201) {
                                                    for (int var43 = var42.field1208; var43 <= var42.field1205; var43++) {
                                                        for (int var44 = var42.field1204; var44 <= var42.field1211; var44++) {
                                                            class187 var45 = var7[var43][var44];
                                                            if (var45.field3273) {
                                                                var2.field3267 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field3278 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field1208) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field1205) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field1204) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field1211) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field3278) == var2.field3275) {
                                                                    var2.field3267 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class195.field3351[var40++] = var42;
                                                    int var47 = class14.field224 - var42.field1208;
                                                    int var48 = var42.field1205 - class14.field224;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class6.field120 - var42.field1204;
                                                    int var50 = var42.field1211 - class6.field120;
                                                    if (var50 > var49) {
                                                        var42.field1213 = var47 + var50;
                                                    } else {
                                                        var42.field1213 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class70 var54 = class195.field3351[var53];
                                                    if (client.field1990 != var54.field1201) {
                                                        if (var54.field1213 > var51) {
                                                            var51 = var54.field1213;
                                                            var52 = var53;
                                                        } else if (var54.field1213 == var51) {
                                                            int var55 = var54.field1200 - class211.field3646;
                                                            int var56 = var54.field1202 - class21.field350;
                                                            int var57 = class195.field3351[var52].field1200 - class211.field3646;
                                                            int var58 = class195.field3351[var52].field1202 - class21.field350;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class70 var59 = class195.field3351[var52];
                                                var59.field1201 = client.field1990;
                                                if (!class276.method1865(var6, var59.field1208, var59.field1205, var59.field1204, var59.field1211, var59.field1214.method50())) {
                                                    var59.field1214.method52(var59.field1212, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var59.field1200 - class211.field3646, var59.field1209 - class262.field4598, var59.field1202 - class21.field350, var59.field1197);
                                                }
                                                for (int var60 = var59.field1208; var60 <= var59.field1205; var60++) {
                                                    for (int var61 = var59.field1204; var61 <= var59.field1211; var61++) {
                                                        class187 var62 = var7[var60][var61];
                                                        if (var62.field3278 != 0) {
                                                            class231.field3970.method1814(1, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field3270) {
                                                            class231.field3970.method1814(1, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3267) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field3267 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3270);
                            } while (var2.field3278 != 0);
                            if (var3 > class14.field224 || var3 <= class239.field4109) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field3270);
                        if (var3 < class14.field224 || var3 >= class231.field3971 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field3270);
                    if (var4 > class6.field120 || var4 <= class161.field2847) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field3270);
                if (var4 < class6.field120 || var4 >= class78.field1325 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field3270);
            var2.field3270 = false;
            class220.field3760--;
            class41 var67 = var2.field3285;
            if (var67 != null && var67.field705 != 0) {
                if (var67.field708 != null) {
                    var67.field708.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var67.field700 - class211.field3646, var67.field697 - class262.field4598 - var67.field705, var67.field703 - class21.field350, var67.field704);
                }
                if (var67.field709 != null) {
                    var67.field709.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var67.field700 - class211.field3646, var67.field697 - class262.field4598 - var67.field705, var67.field703 - class21.field350, var67.field704);
                }
                if (var67.field695 != null) {
                    var67.field695.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var67.field700 - class211.field3646, var67.field697 - class262.field4598 - var67.field705, var67.field703 - class21.field350, var67.field704);
                }
            }
            if (var2.field3265 != 0) {
                class105 var68 = var2.field3269;
                if (var68 != null && !class26.method178(var6, var3, var4, var68.field1754.method50())) {
                    if ((var68.field1768 & var2.field3265) != 0) {
                        var68.field1754.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var68.field1758 + var68.field1755 - class211.field3646, var68.field1765 - class262.field4598, var68.field1760 + var68.field1762 - class21.field350, var68.field1766);
                    } else if (var68.field1768 == 256) {
                        int var69 = var68.field1758 - class211.field3646;
                        int var70 = var68.field1765 - class262.field4598;
                        int var71 = var68.field1760 - class21.field350;
                        int var72 = var68.field1759;
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
                            var68.field1754.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var68.field1755 + var69, var70, var68.field1762 + var71, var68.field1766);
                        } else if (var68.field1757 != null) {
                            var68.field1757.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var69, var70, var71, var68.field1766);
                        }
                    }
                }
                class19 var75 = var2.field3281;
                if (var75 != null) {
                    if ((var75.field314 & var2.field3265) != 0 && !class194.method1354(var6, var3, var4, var75.field314)) {
                        var75.field303.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var75.field305 - class211.field3646, var75.field308 - class262.field4598, var75.field315 - class21.field350, var75.field309);
                    }
                    if ((var75.field306 & var2.field3265) != 0 && !class194.method1354(var6, var3, var4, var75.field306)) {
                        var75.field311.method52(0, class68.field1183, class80.field1360, class64.field1092, class128.field2337, var75.field305 - class211.field3646, var75.field308 - class262.field4598, var75.field315 - class21.field350, var75.field309);
                    }
                }
            }
            if (var5 < class163.field2893 - 1) {
                class187 var76 = class259.field4487[var5 + 1][var3][var4];
                if (var76 != null && var76.field3270) {
                    class231.field3970.method1814(1, var76);
                }
            }
            if (var3 < class14.field224) {
                class187 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field3270) {
                    class231.field3970.method1814(1, var77);
                }
            }
            if (var4 < class6.field120) {
                class187 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field3270) {
                    class231.field3970.method1814(1, var78);
                }
            }
            if (var3 > class14.field224) {
                class187 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field3270) {
                    class231.field3970.method1814(1, var79);
                }
            }
            if (var4 > class6.field120) {
                class187 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field3270) {
                    class231.field3970.method1814(1, var80);
                }
            }
        }
    }
}
