import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class203 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lkg;")
    public static class179 field2634 = new class179(68, 3);

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[[I")
    public static int[][] field2644 = new int[128][128];

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public int field2635;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public int field2638;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method1274(boolean arg0, int arg1, int arg2) {
        if (arg1 == -29339) {
            field2639++;
            return arg0 && arg2 >= 0 ? class354.method2030(arg2, 10, arg0, false) : Integer.toString(arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILya;I)V")
    public static final void method1275(int arg0, int arg1, class38 arg2, int arg3) {
        if (arg3 != 32597) {
            field2646 = 56;
        }
        field2641++;
        if (arg0 < 0 || arg1 < 0 || class216.field2773 == 0 || class475.field6885 == 0) {
            return;
        }
        arg2.method355(class346.field4452, class228.field2921, class216.field2773, class475.field6885);
        arg2.method330(class480.field7023, class288.field3679, class216.field2773, class475.field6885);
        class123 var4 = arg2.method371();
        var4.method224(class493.field7175, class122.field1633, class36.field486, class55.field719, class275.field3453, class317.field4048);
        arg2.method287(var4);
        if (class531.field7811 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg2.method268();
            int var8 = (arg0 - class346.field4452) * var7 / class216.field2773;
            int var9 = (arg1 - class228.field2921) * var7 / class475.field6885;
            int var10 = arg2.method306();
            int var11 = (arg0 - class346.field4452) * var10 / class216.field2773;
            int var12 = (arg1 - class228.field2921) * var10 / class475.field6885;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method238(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method238(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class452.field6526 > var20 && var22 < class440.field6307) {
                    int var23 = class23.field336.field2676;
                    if (var23 < 3 && (class379.field4998[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class531.field7811[var23].method396(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class23.field336.method1366((byte) -96) - 1 << 6) >> 7;
                        var6 = (class23.field336.method1366((byte) -87) - 1 << 6) + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class211.field2717 && (class92.field1125 & 0x40) != 0) {
                    class523 var24 = class202.method1268(class21.field309, class322.field4090, 0);
                    if (var24 == null) {
                        class379.method2156(true);
                    } else {
                        class8.method45(22461, 0L, -1, var6, var5, class468.field6768, " ->", 60, false, class516.field7480, true);
                    }
                } else {
                    if (class530.field7803 == class335.field4230) {
                        class8.method45(22461, 0L, -1, var6, var5, -1, "", 17, false, class312.field3992.method1936(arg3 ^ 0xFFFFE700, class11.field177), true);
                    }
                    class63.field821++;
                    class8.method45(22461, 0L, -1, var6, var5, class507.field7305, "", 15, false, class83.field1051, true);
                }
            }
        }
        class365 var25 = class170.field2183;
        for (class531 var26 = (class531) var25.method2097((byte) 86); var26 != null; var26 = (class531) var25.method2091(-1)) {
            if ((class301.field3874 || class23.field336.field2676 == var26.field7809) && var26.method3152(arg0, arg2, (byte) 21, arg1)) {
                if (var26.field7813 instanceof class223) {
                    class223 var27 = (class223) var26.field7813;
                    int var28 = var27.method1366((byte) -101);
                    if ((var28 & 0x1) == 0 && (var27.field2666 & 0x7F) == 0 && (var27.field2677 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field2666 & 0x7F) == 64 && (var27.field2677 & 0x7F) == 64) {
                        int var29 = var27.field2666 - (var27.method1366((byte) -124) - 1 << 6);
                        int var30 = var27.field2677 - (var27.method1366((byte) -120) - 1 << 6);
                        for (int var31 = 0; var31 < class489.field7114; var31++) {
                            class295 var38 = class187.field2446[class403.field5735[var31]];
                            if (var38 != null && class163.field2065 != var38.field4884 && var38.field4901) {
                                int var39 = var38.field2666 - (var38.field3773.field6921 - 1 << 6);
                                int var40 = var38.field2677 - (var38.field3773.field6921 - 1 << 6);
                                if (var29 <= var39 && var38.field3773.field6921 <= var27.method1366((byte) -117) - (var39 - var29 >> 7) && var40 >= var30 && var38.field3773.field6921 <= var27.method1366((byte) -126) - (var40 - var30 >> 7)) {
                                    class176.method1124(class23.field336.field2676 != var26.field7809, (byte) -126, var38);
                                    var38.field4884 = class163.field2065;
                                }
                            }
                        }
                        int var32 = class436.field6234;
                        int[] var33 = class12.field218;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class223 var35 = class387.field5107[var33[var34]];
                            if (var35 != null && class163.field2065 != var35.field4884 && var27 != var35 && var35.field4901) {
                                int var36 = var35.field2666 - (var35.method1366((byte) -104) - 1 << 6);
                                int var37 = var35.field2677 - (var35.method1366((byte) -105) - 1 << 6);
                                if (var36 >= var29 && var35.method1366((byte) -111) <= (var27.method1366((byte) -128) - (var36 - var29 >> 7)) && var30 <= var37 && var35.method1366((byte) -111) <= (var27.method1366((byte) -126) - (var37 - var30 >> 7))) {
                                    class135.method932(-87, var35, class23.field336.field2676 != var26.field7809);
                                    var35.field4884 = class163.field2065;
                                }
                            }
                        }
                    }
                    if (class163.field2065 == var27.field4884) {
                        continue;
                    }
                    class135.method932(-78, var27, class23.field336.field2676 != var26.field7809);
                    var27.field4884 = class163.field2065;
                }
                if (var26.field7813 instanceof class295) {
                    class295 var41 = (class295) var26.field7813;
                    if (var41.field3773 != null) {
                        if ((var41.field3773.field6921 & 0x1) == 0 && (var41.field2666 & 0x7F) == 0 && (var41.field2677 & 0x7F) == 0 || (var41.field3773.field6921 & 0x1) == 1 && (var41.field2666 & 0x7F) == 64 && (var41.field2677 & 0x7F) == 64) {
                            int var42 = var41.field2666 - (var41.field3773.field6921 - 1 << 6);
                            int var43 = var41.field2677 - (var41.field3773.field6921 - 1 << 6);
                            for (int var44 = 0; var44 < class489.field7114; var44++) {
                                class295 var51 = class187.field2446[class403.field5735[var44]];
                                if (var51 != null && class163.field2065 != var51.field4884 && var41 != var51 && var51.field4901) {
                                    int var52 = var51.field2666 - (var51.field3773.field6921 - 1 << 6);
                                    int var53 = var51.field2677 - (var51.field3773.field6921 - 1 << 6);
                                    if (var52 >= var42 && var41.field3773.field6921 - (var52 - var42 >> 7) >= var51.field3773.field6921 && var53 >= var43 && var51.field3773.field6921 <= (var41.field3773.field6921 - (var53 - var43 >> 7))) {
                                        class176.method1124(class23.field336.field2676 != var26.field7809, (byte) -127, var51);
                                        var51.field4884 = class163.field2065;
                                    }
                                }
                            }
                            int var45 = class436.field6234;
                            int[] var46 = class12.field218;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class223 var48 = class387.field5107[var46[var47]];
                                if (var48 != null && class163.field2065 != var48.field4884 && var48.field4901) {
                                    int var49 = var48.field2666 - (var48.method1366((byte) -88) - 1 << 6);
                                    int var50 = var48.field2677 - (var48.method1366((byte) -94) - 1 << 6);
                                    if (var42 <= var49 && var48.method1366((byte) -94) <= (var41.field3773.field6921 - (var49 - var42 >> 7)) && var43 <= var50 && var48.method1366((byte) -91) <= (var41.field3773.field6921 - (var50 - var43 >> 7))) {
                                        class135.method932(arg3 ^ 0xFFFF808E, var48, class23.field336.field2676 != var26.field7809);
                                        var48.field4884 = class163.field2065;
                                    }
                                }
                            }
                        }
                        if (class163.field2065 == var41.field4884) {
                            continue;
                        }
                        class176.method1124(class23.field336.field2676 != var26.field7809, (byte) -109, var41);
                        var41.field4884 = class163.field2065;
                    }
                }
                if (var26.field7813 instanceof class434) {
                    class91 var54 = (class91) class201.field2614.method2022(-1, (long) (var26.field7809 << 28 | var26.field7815 << 14 | var26.field7817));
                    if (var54 != null) {
                        for (class400 var55 = (class400) var54.field1112.method157(-127); var55 != null; var55 = (class400) var54.field1112.method165(-73)) {
                            class9 var56 = class376.field4949.method624((byte) -120, var55.field5703);
                            if (!class211.field2717) {
                                if (class23.field336.field2676 == var26.field7809) {
                                    String[] var58 = var56.field137;
                                    for (int var59 = 4; var59 >= 0; var59--) {
                                        if (var58 != null && var58[var59] != null) {
                                            byte var60 = 0;
                                            if (var59 == 0) {
                                                var60 = 51;
                                            }
                                            int var61 = class421.field5976;
                                            if (var59 == 1) {
                                                var60 = 18;
                                            }
                                            if (var59 == 2) {
                                                var60 = 57;
                                            }
                                            if (var59 == 3) {
                                                var60 = 45;
                                            }
                                            if (var59 == 4) {
                                                var60 = 9;
                                            }
                                            if (var56.field88 == var59) {
                                                var61 = var56.field132;
                                            }
                                            if (var56.field85 == var59) {
                                                var61 = var56.field136;
                                            }
                                            class59.field769++;
                                            class8.method45(22461, (long) var55.field5703, -1, var26.field7815, var26.field7817, var61, "<col=ff9040>" + var56.field140, var60, false, var58[var59], true);
                                        }
                                    }
                                }
                                class256.field3265++;
                                class8.method45(22461, (long) var55.field5703, -1, var26.field7815, var26.field7817, class501.field7238, "<col=ff9040>" + var56.field140, 1001, class23.field336.field2676 != var26.field7809, class462.field6603.method1936(arg3 - 59136, class11.field177), true);
                            } else if (class23.field336.field2676 == var26.field7809) {
                                class172 var57 = class496.field7211 == -1 ? null : class199.field2592.method2579((byte) 116, class496.field7211);
                                if ((class92.field1125 & 0x1) != 0 && (var57 == null || var56.method65(true, var57.field2188, class496.field7211) != var57.field2188)) {
                                    class8.method45(22461, (long) var55.field5703, -1, var26.field7815, var26.field7817, class468.field6768, class446.field6389 + " -> <col=ff9040>" + var56.field140, 48, false, class516.field7480, true);
                                    class56.field737++;
                                }
                            }
                        }
                    }
                }
                if (var26.field7813 instanceof class41) {
                    class41 var62 = (class41) var26.field7813;
                    class102 var63 = class315.field4017.method1958(-10091, var62.method187(21067));
                    if (var63.field1291 != null) {
                        var63 = var63.method761(97, class491.field7160);
                    }
                    if (var63 != null) {
                        if (!class211.field2717) {
                            if (class23.field336.field2676 == var26.field7809) {
                                String[] var64 = var63.field1278;
                                if (var64 != null) {
                                    for (int var65 = 4; var65 >= 0; var65--) {
                                        if (var64[var65] != null) {
                                            short var66 = 0;
                                            int var67 = class421.field5976;
                                            if (var65 == 0) {
                                                var66 = 3;
                                            }
                                            if (var65 == 1) {
                                                var66 = 59;
                                            }
                                            if (var65 == 2) {
                                                var66 = 46;
                                            }
                                            if (var65 == 3) {
                                                var66 = 6;
                                            }
                                            if (var63.field1258 == var65) {
                                                var67 = var63.field1285;
                                            }
                                            if (var65 == 4) {
                                                var66 = 1002;
                                            }
                                            if (var63.field1250 == var65) {
                                                var67 = var63.field1274;
                                            }
                                            class8.method45(22461, class4.method25(var62, var26.field7815, var26.field7817, 0), -1, var26.field7815, var26.field7817, var67, "<col=00ffff>" + var63.field1237, var66, false, var64[var65], true);
                                            class402.field5725++;
                                        }
                                    }
                                }
                            }
                            class8.method45(22461, (long) var63.field1316, -1, var26.field7815, var26.field7817, class501.field7238, "<col=00ffff>" + var63.field1237, 1004, class23.field336.field2676 != var26.field7809, class462.field6603.method1936(-26539, class11.field177), true);
                            class204.field2655++;
                        } else if (class23.field336.field2676 == var26.field7809) {
                            class172 var68 = class496.field7211 == -1 ? null : class199.field2592.method2579((byte) -117, class496.field7211);
                            if ((class92.field1125 & 0x4) != 0 && (var68 == null || var63.method767((byte) 111, var68.field2188, class496.field7211) != var68.field2188)) {
                                class233.field2982++;
                                class8.method45(22461, class4.method25(var62, var26.field7815, var26.field7817, arg3 ^ 0x7F55), -1, var26.field7815, var26.field7817, class468.field6768, class446.field6389 + " -> <col=00ffff>" + var63.field1237, 44, false, class516.field7480, true);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)V")
    public static final void method1276(boolean arg0, int arg1) {
        if (arg1 <= 5) {
            method1277((byte) 76);
        }
        while (class513.field7443.method1198((byte) -43, class312.field3986) >= 15) {
            int var2 = class513.field7443.method1199(30304, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class187.field2446[var2] == null) {
                class187.field2446[var2] = new class295();
                var3 = true;
                class187.field2446[var2].field4890 = var2;
            }
            class295 var4 = class187.field2446[var2];
            class403.field5735[class489.field7114++] = var2;
            var4.field4848 = class163.field2065;
            if (var4.field3773 != null && var4.field3773.method2908(true)) {
                class492.method2988(var4, 0);
            }
            int var5 = (class513.field7443.method1199(30304, 3) + 4 & 0xD5200007) << 11;
            int var6;
            if (arg0) {
                var6 = class513.field7443.method1199(30304, 8);
                if (var6 > 127) {
                    var6 -= 256;
                }
            } else {
                var6 = class513.field7443.method1199(30304, 5);
                if (var6 > 15) {
                    var6 -= 32;
                }
            }
            int var7 = class513.field7443.method1199(30304, 2);
            var4.method1731(-16385, class390.field5244.method1327(class513.field7443.method1199(30304, 14), (byte) -127));
            int var8;
            if (arg0) {
                var8 = class513.field7443.method1199(30304, 8);
                if (var8 > 127) {
                    var8 -= 256;
                }
            } else {
                var8 = class513.field7443.method1199(30304, 5);
                if (var8 > 15) {
                    var8 -= 32;
                }
            }
            int var9 = class513.field7443.method1199(30304, 1);
            if (var9 == 1) {
                class2.field11[class284.field3612++] = var2;
            }
            int var10 = class513.field7443.method1199(30304, 1);
            var4.method2133(false, var4.field3773.field6921);
            var4.field4911 = var4.field3773.field6919 << 3;
            if (var4.field4911 == 0) {
                var4.method2125((byte) -23, 0);
            } else if (var3) {
                var4.method2125((byte) -103, var5);
            }
            var4.method1728(-1, ~var10 == -2, var4.method1366((byte) -97), var7, class23.field336.field4936[0] + var6, class23.field336.field4944[0] - -var8);
            if (var4.field3773.method2908(true)) {
                class244.method1483(null, var4.field4936[0], 0, null, (byte) -123, var4.field4944[0], var4.field2676, var4);
            }
        }
        field2636++;
        class513.field7443.method1202(-7);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method1277(byte arg0) {
        if (arg0 > 10) {
            field2634 = null;
            field2644 = null;
        }
    }

    static {
        new class335("Use", "Benutzen", "Utiliser", "Usar");
        field2646 = 0;
    }
}
