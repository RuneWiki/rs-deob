import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class246 extends RuntimeException {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Ljava/lang/String;")
    public String field4371;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4370;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Leb;")
    public static class230 field4372 = class68.method589(0, "::serverjs5drop");

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Leb;")
    public static class230 field4374 = class68.method589(0, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Z")
    public static boolean field4377 = true;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Leb;")
    public static class230 field4376 = class68.method589(0, " weitere Optionen");

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Leb;")
    public static class230 field4378 = class68.method589(0, "Sprites geladen)3");

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Leh;")
    public static class80 field4379;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "[I")
    public static int[] field4380;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1718(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class196.field3513 == 0) {
            class189.field3320++;
            int var7 = class1.field8;
            int var8 = class149.field2668;
            int var9 = class150.field2674;
            int var10 = class108.field1947;
            int var11 = (arg5 - arg3) * (var8 - var7) / arg1 + var7;
            int var12 = (arg4 - arg0) * (var9 - var10) / arg6 + var10;
            if (class184.field3231 && (class138.field2475 & 0x40) == 64) {
                class245 var13 = class7.method67(class159.field2829, class163.field2915, (byte) -69);
                if (var13 == null) {
                    class156.method1185(26248);
                } else {
                    class160.method1208(class9.field154, 0L, -6600, class68.field1275, var12, var11, (short) 43);
                }
            } else {
                class160.method1208(class89.field1580, 0L, -6600, class54.field937, var12, var11, (short) 16);
            }
        }
        if (arg2 != -113) {
            return;
        }
        long var14 = -1L;
        field4373++;
        for (int var16 = 0; var16 < class102.field1870; var16++) {
            long var17 = class26.field490[var16];
            int var19 = (int) var17 >> 7 & 0x7F;
            int var20 = (int) var17 & 0x7F;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var22 = ((int) var17 & 0x62F6B827) >> 29;
            if (var14 != var17) {
                var14 = var17;
                if (var22 == 2 && class138.method1065(class124.field2174, var20, var19, var17)) {
                    class194 var23 = class251.method1776(var21, 65280);
                    if (var23.field3437 != null) {
                        var23 = var23.method1385((byte) 39);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class196.field3513 == 1) {
                        class210.field3662++;
                        class160.method1208(class173.method1267((byte) 59, new class230[] { class153.field2730, class175.field3079, var23.field3444 }), var17, -6600, class275.field4832, var19, var20, (short) 38);
                    } else if (!class184.field3231) {
                        class230[] var24 = var23.field3477;
                        if (class214.field3718) {
                            var24 = class173.method1265(1515, var24);
                        }
                        class16.field357++;
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 51;
                                    }
                                    if (var25 == 1) {
                                        var26 = 40;
                                    }
                                    if (var25 == 2) {
                                        var26 = 41;
                                    }
                                    class155.field2767++;
                                    if (var25 == 3) {
                                        var26 = 21;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1005;
                                    }
                                    class160.method1208(class173.method1267((byte) 59, new class230[] { class161.field2879, var23.field3444 }), var17, -6600, var24[var25], var19, var20, var26);
                                }
                            }
                        }
                        class160.method1208(class173.method1267((byte) 59, new class230[] { class161.field2879, var23.field3444 }), (long) var23.field3480, -6600, class177.field3117, var19, var20, (short) 1004);
                    } else if ((class138.field2475 & 0x4) == 4) {
                        class160.method1208(class173.method1267((byte) 59, new class230[] { class44.field792, class175.field3079, var23.field3444 }), var17, -6600, class68.field1275, var19, var20, (short) 13);
                        class112.field2012++;
                    }
                }
                if (var22 == 1) {
                    class109 var27 = class168.field2963[var21];
                    if (var27.field1956.field1769 == 1 && (var27.field2274 & 0x7F) == 64 && (var27.field2300 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class18.field393; var28++) {
                            class109 var31 = class168.field2963[class167.field2956[var28]];
                            if (var31 != null && var27 != var31 && var31.field1956.field1769 == 1 && var27.field2274 == var31.field2274 && var27.field2300 == var31.field2300) {
                                class244.method1699(false, var31.field1956, class167.field2956[var28], var20, var19);
                            }
                        }
                        for (int var29 = 0; var29 < class169.field2984; var29++) {
                            class260 var30 = class230.field4011[class233.field4042[var29]];
                            if (var30 != null && var27.field2274 == var30.field2274 && var27.field2300 == var30.field2300) {
                                class136.method1052(var19, 0, class233.field4042[var29], var30, var20);
                            }
                        }
                    }
                    class244.method1699(false, var27.field1956, var21, var20, var19);
                }
                if (var22 == 0) {
                    class260 var32 = class230.field4011[var21];
                    if ((var32.field2274 & 0x7F) == 64 && (var32.field2300 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class18.field393; var33++) {
                            class109 var36 = class168.field2963[class167.field2956[var33]];
                            if (var36 != null && var36.field1956.field1769 == 1 && var32.field2274 == var36.field2274 && var32.field2300 == var36.field2300) {
                                class244.method1699(false, var36.field1956, class167.field2956[var33], var20, var19);
                            }
                        }
                        for (int var34 = 0; var34 < class169.field2984; var34++) {
                            class260 var35 = class230.field4011[class233.field4042[var34]];
                            if (var35 != null && var32 != var35 && var32.field2274 == var35.field2274 && var32.field2300 == var35.field2300) {
                                class136.method1052(var19, arg2 + 113, class233.field4042[var34], var35, var20);
                            }
                        }
                    }
                    class136.method1052(var19, 0, var21, var32, var20);
                }
                if (var22 == 3) {
                    class98 var37 = class237.field4090[class124.field2174][var20][var19];
                    if (var37 != null) {
                        for (class196 var38 = (class196) var37.method832(false); var38 != null; var38 = (class196) var37.method838((byte) 58)) {
                            int var39 = var38.field3516.field1528;
                            class12 var40 = class214.method1484(var39, arg2 ^ 0x70);
                            if (class196.field3513 == 1) {
                                class160.method1208(class173.method1267((byte) 59, new class230[] { class153.field2730, class191.field3365, var40.field191 }), (long) var39, -6600, class275.field4832, var19, var20, (short) 2);
                                class160.field2863++;
                            } else if (!class184.field3231) {
                                class160.field2861++;
                                class230[] var41 = var40.field187;
                                if (class214.field3718) {
                                    var41 = class173.method1265(1515, var41);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        class38.field706++;
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 9;
                                        }
                                        if (var42 == 1) {
                                            var43 = 17;
                                        }
                                        if (var42 == 2) {
                                            var43 = 15;
                                        }
                                        if (var42 == 3) {
                                            var43 = 10;
                                        }
                                        if (var42 == 4) {
                                            var43 = 11;
                                        }
                                        class160.method1208(class173.method1267((byte) 59, new class230[] { class88.field1542, var40.field191 }), (long) var39, arg2 ^ 0x19B7, var41[var42], var19, var20, var43);
                                    } else if (var42 == 2) {
                                        class160.method1208(class173.method1267((byte) 59, new class230[] { class88.field1542, var40.field191 }), (long) var39, -6600, class204.field3589, var19, var20, (short) 15);
                                        class185.field3251++;
                                    }
                                }
                                class160.method1208(class173.method1267((byte) 59, new class230[] { class88.field1542, var40.field191 }), (long) var39, arg2 - 6487, class177.field3117, var19, var20, (short) 1006);
                            } else if ((class138.field2475 & 0x1) == 1) {
                                class160.method1208(class173.method1267((byte) 59, new class230[] { class44.field792, class191.field3365, var40.field191 }), (long) var39, -6600, class68.field1275, var19, var20, (short) 34);
                                class205.field3618++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1719(int arg0) {
        field4374 = null;
        field4380 = null;
        if (arg0 == 4) {
            field4378 = null;
            field4372 = null;
            field4379 = null;
            field4376 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class246(Throwable arg0, String arg1) {
        this.field4371 = arg1;
        this.field4370 = arg0;
    }
}
