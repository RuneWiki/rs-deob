import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class203 {

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Lr;")
    private static class66 field3478 = class93.method641(43, "Select");

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lr;")
    public static class66 field3475 = field3478;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field3477 = 0;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lr;")
    public static class66 field3487 = class93.method641(43, "runes");

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static volatile int field3486 = 0;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "Lr;")
    private static class66 field3495 = class93.method641(43, "cyan:");

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lr;")
    public static class66 field3474 = field3495;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Lr;")
    public static class66 field3473 = field3495;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public int field3476;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public int field3482;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public int field3483;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public int field3488;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public int field3489;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "[B")
    public byte[] field3479;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "[B")
    public byte[] field3481;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static final void method1312(int arg0) {
        class214.field3686++;
        field3494++;
        class28.field412.method578(-67, 108);
        for (class75 var1 = (class75) class230.field3981.method1382(-32642); var1 != null; var1 = (class75) class230.field3981.method1386((byte) -105)) {
            if (var1.field1489 == 0) {
                class150.method1022(var1, true, true);
            }
        }
        if (arg0 != 636) {
            method1312(126);
        }
        if (class264.field4629 != null) {
            class215.method1385(class264.field4629, -124);
            class264.field4629 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lcj;BLcj;)V")
    public static final void method1313(class28 arg0, byte arg1, class28 arg2) {
        class176.field3103 = class62.method402(arg0, 0, (byte) 81, arg2, class215.field3700);
        int var3 = -114 % ((20 - arg1) / 61);
        class27.field354 = (class236) class176.field3103;
        field3484++;
        class33.field501 = class62.method402(arg0, 0, (byte) 58, arg2, class244.field4268);
        class59.field1016 = class62.method402(arg0, 0, (byte) 67, arg2, class91.field1756);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILlh;)V")
    public static final void method1314(int arg0, class249 arg1) {
        field3480++;
        byte[] var2 = new byte[arg0];
        if (class59.field991 != null) {
            try {
                class59.field991.method964(0L, arg0 - 23);
                class59.field991.method957(-128, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1669(24, (byte) 118, 0, var2);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1315(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3472++;
        if (class188.field3259 == 0 && !class247.field4308) {
            class76.field1504++;
            int var7 = class206.field3537;
            int var8 = class257.field4520;
            int var9 = class233.field4072;
            int var10 = class20.field274;
            int var11 = (arg6 - arg0) * (var8 - var7) / arg5 + var7;
            int var12 = (arg3 - arg1) * (var9 - var10) / arg2 + var10;
            class75.method536(var11, var12, (byte) -108, class85.field1679, (short) 5, class60.field1024, 0L);
        }
        long var13 = -1L;
        if (!arg4) {
            return;
        }
        for (int var15 = 0; var15 < class195.field3362; var15++) {
            long var16 = class54.field934[var15];
            int var18 = (int) var16 & 0x7F;
            int var19 = (int) var16 >> 7 & 0x7F;
            int var20 = ((int) var16 & 0x64D29B4F) >> 29;
            int var21 = (int) (var16 >>> 32) & Integer.MAX_VALUE;
            if (var13 != var16) {
                var13 = var16;
                if (var20 == 2 && class131.method913(class196.field3401, var18, var19, var16)) {
                    class231 var22 = class52.method359(80, var21);
                    if (var22.field4027 != null) {
                        var22 = var22.method1515(-1);
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (class188.field3259 == 1) {
                        class66.field1330++;
                        class75.method536(var18, var19, (byte) -104, class212.method1372(2, new class66[] { class103.field2004, class243.field4248, var22.field4054 }), (short) 1, class127.field2373, var16);
                    } else if (!class247.field4308) {
                        class144.field2637++;
                        class66[] var23 = var22.field4039;
                        if (class29.field432) {
                            var23 = class119.method811((byte) -106, var23);
                        }
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
                                    class260.field4591++;
                                    short var25 = 0;
                                    if (var24 == 0) {
                                        var25 = 18;
                                    }
                                    if (var24 == 1) {
                                        var25 = 47;
                                    }
                                    if (var24 == 2) {
                                        var25 = 46;
                                    }
                                    if (var24 == 3) {
                                        var25 = 42;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1003;
                                    }
                                    class75.method536(var18, var19, (byte) -119, class212.method1372(2, new class66[] { class28.field424, var22.field4054 }), var25, var23[var24], var16);
                                }
                            }
                        }
                        class75.method536(var18, var19, (byte) -87, class212.method1372(2, new class66[] { class28.field424, var22.field4054 }), (short) 1005, class202.field3466, (long) var22.field4064);
                    } else if ((class9.field103 & 0x4) == 4) {
                        class97.field1908++;
                        class75.method536(var18, var19, (byte) -126, class212.method1372(2, new class66[] { class195.field3366, class243.field4248, var22.field4054 }), (short) 37, class162.field2895, var16);
                    }
                }
                if (var20 == 1) {
                    class37 var26 = class178.field3112[var21];
                    if (var26.field548.field3561 == 1 && (var26.field2077 & 0x7F) == 64 && (var26.field2053 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < class160.field2869; var27++) {
                            class37 var30 = class178.field3112[class49.field877[var27]];
                            if (var30 != null && var26 != var30 && var30.field548.field3561 == 1 && var26.field2077 == var30.field2077 && var26.field2053 == var30.field2053) {
                                class89.method629(class49.field877[var27], var19, var18, (byte) 111, var30.field548);
                            }
                        }
                        for (int var28 = 0; var28 < client.field1650; var28++) {
                            class45 var29 = class59.field988[class192.field3335[var28]];
                            if (var29 != null && var26.field2077 == var29.field2077 && var26.field2053 == var29.field2053) {
                                class17.method71(var29, -126, var18, var19, class192.field3335[var28]);
                            }
                        }
                    }
                    class89.method629(var21, var19, var18, (byte) 93, var26.field548);
                }
                if (var20 == 0) {
                    class45 var31 = class59.field988[var21];
                    if ((var31.field2077 & 0x7F) == 64 && (var31.field2053 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < class160.field2869; var32++) {
                            class37 var35 = class178.field3112[class49.field877[var32]];
                            if (var35 != null && var35.field548.field3561 == 1 && var31.field2077 == var35.field2077 && var31.field2053 == var35.field2053) {
                                class89.method629(class49.field877[var32], var19, var18, (byte) -11, var35.field548);
                            }
                        }
                        for (int var33 = 0; var33 < client.field1650; var33++) {
                            class45 var34 = class59.field988[class192.field3335[var33]];
                            if (var34 != null && var31 != var34 && var31.field2077 == var34.field2077 && var31.field2053 == var34.field2053) {
                                class17.method71(var34, -62, var18, var19, class192.field3335[var33]);
                            }
                        }
                    }
                    class17.method71(var31, -112, var18, var19, var21);
                }
                if (var20 == 3) {
                    class125 var36 = class63.field1249[class196.field3401][var18][var19];
                    if (var36 != null) {
                        for (class216 var37 = (class216) var36.method869(30568); var37 != null; var37 = (class216) var36.method860((byte) -101)) {
                            int var38 = var37.field3713.field60;
                            class157 var39 = class40.method242(-25672, var38);
                            if (class188.field3259 == 1) {
                                class119.field2257++;
                                class75.method536(var18, var19, (byte) -62, class212.method1372(2, new class66[] { class103.field2004, class171.field3029, var39.field2813 }), (short) 8, class127.field2373, (long) var38);
                            } else if (!class247.field4308) {
                                class140.field2585++;
                                class66[] var40 = var39.field2820;
                                if (class29.field432) {
                                    var40 = class119.method811((byte) -79, var40);
                                }
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var40 != null && var40[var41] != null) {
                                        class86.field1689++;
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 35;
                                        }
                                        if (var41 == 1) {
                                            var42 = 45;
                                        }
                                        if (var41 == 2) {
                                            var42 = 30;
                                        }
                                        if (var41 == 3) {
                                            var42 = 3;
                                        }
                                        if (var41 == 4) {
                                            var42 = 9;
                                        }
                                        class75.method536(var18, var19, (byte) -52, class212.method1372(2, new class66[] { class150.field2695, var39.field2813 }), var42, var40[var41], (long) var38);
                                    } else if (var41 == 2) {
                                        class172.field3040++;
                                        class75.method536(var18, var19, (byte) -104, class212.method1372(2, new class66[] { class150.field2695, var39.field2813 }), (short) 30, class144.field2625, (long) var38);
                                    }
                                }
                                class75.method536(var18, var19, (byte) -80, class212.method1372(2, new class66[] { class150.field2695, var39.field2813 }), (short) 1006, class202.field3466, (long) var38);
                            } else if ((class9.field103 & 0x1) == 1) {
                                class81.field1580++;
                                class75.method536(var18, var19, (byte) -128, class212.method1372(2, new class66[] { class195.field3366, class171.field3029, var39.field2813 }), (short) 34, class162.field2895, (long) var38);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1316(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class16.field204++;
        class96.field1858 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class90.field1747; var12 < class131.field2449; var12++) {
            class16[][] var38 = class110.field2124[var12];
            for (int var39 = class44.field776; var39 < class98.field1920; var39++) {
                for (int var40 = class192.field3329; var40 < class64.field1271; var40++) {
                    class16 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class35.field522[var39 + class94.field1818 - class256.field4504][var40 + class94.field1818 - class254.field4452] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field217 = true;
                            var41.field218 = true;
                            if (var41.field219 > 0) {
                                var41.field229 = true;
                            } else {
                                var41.field229 = false;
                            }
                            class96.field1858++;
                        } else {
                            var41.field217 = false;
                            var41.field218 = false;
                            var41.field226 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field205 != null) {
                                    class47 var42 = var41.field205;
                                    var42.field849.method89(var42.field844, var42.field851, 100, var42.field844, var42.field851);
                                    if (var42.field852 != null) {
                                        var42.field852.method89(var42.field844, var42.field851, 102, var42.field844, var42.field851);
                                    }
                                }
                                if (var41.field212 != null) {
                                    class127 var43 = var41.field212;
                                    var43.field2384.method89(var43.field2378, var43.field2375, 98, var43.field2378, var43.field2375);
                                    if (var43.field2386 != null) {
                                        var43.field2386.method89(var43.field2378, var43.field2375, 123, var43.field2378, var43.field2375);
                                    }
                                }
                                if (var41.field225 != null) {
                                    class90 var44 = var41.field225;
                                    var44.field1734.method89(var44.field1735, var44.field1744, 99, var44.field1735, var44.field1744);
                                }
                                if (var41.field220 != null) {
                                    for (int var45 = 0; var45 < var41.field219; var45++) {
                                        class44 var46 = var41.field220[var45];
                                        var46.field779.method89(var46.field771, var46.field791, 99, var46.field790, var46.field775);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class70.field1409 == class30.field453;
        for (int var14 = class90.field1747; var14 < class131.field2449; var14++) {
            class16[][] var27 = class110.field2124[var14];
            for (int var28 = -class94.field1818; var28 <= 0; var28++) {
                int var29 = class256.field4504 + var28;
                int var30 = class256.field4504 - var28;
                if (var29 >= class44.field776 || var30 < class98.field1920) {
                    for (int var31 = -class94.field1818; var31 <= 0; var31++) {
                        int var32 = class254.field4452 + var31;
                        int var33 = class254.field4452 - var31;
                        if (var29 >= class44.field776) {
                            if (var32 >= class192.field3329) {
                                class16 var34 = var27[var29][var32];
                                if (var34 != null && var34.field217) {
                                    class158.method1079(var34, true);
                                }
                            }
                            if (var33 < class64.field1271) {
                                class16 var35 = var27[var29][var33];
                                if (var35 != null && var35.field217) {
                                    class158.method1079(var35, true);
                                }
                            }
                        }
                        if (var30 < class98.field1920) {
                            if (var32 >= class192.field3329) {
                                class16 var36 = var27[var30][var32];
                                if (var36 != null && var36.field217) {
                                    class158.method1079(var36, true);
                                }
                            }
                            if (var33 < class64.field1271) {
                                class16 var37 = var27[var30][var33];
                                if (var37 != null && var37.field217) {
                                    class158.method1079(var37, true);
                                }
                            }
                        }
                        if (class96.field1858 == 0) {
                            if (!var13) {
                                class249.field4374 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class90.field1747; var15 < class131.field2449; var15++) {
            class16[][] var16 = class110.field2124[var15];
            for (int var17 = -class94.field1818; var17 <= 0; var17++) {
                int var18 = class256.field4504 + var17;
                int var19 = class256.field4504 - var17;
                if (var18 >= class44.field776 || var19 < class98.field1920) {
                    for (int var20 = -class94.field1818; var20 <= 0; var20++) {
                        int var21 = class254.field4452 + var20;
                        int var22 = class254.field4452 - var20;
                        if (var18 >= class44.field776) {
                            if (var21 >= class192.field3329) {
                                class16 var23 = var16[var18][var21];
                                if (var23 != null && var23.field217) {
                                    class158.method1079(var23, false);
                                }
                            }
                            if (var22 < class64.field1271) {
                                class16 var24 = var16[var18][var22];
                                if (var24 != null && var24.field217) {
                                    class158.method1079(var24, false);
                                }
                            }
                        }
                        if (var19 < class98.field1920) {
                            if (var21 >= class192.field3329) {
                                class16 var25 = var16[var19][var21];
                                if (var25 != null && var25.field217) {
                                    class158.method1079(var25, false);
                                }
                            }
                            if (var22 < class64.field1271) {
                                class16 var26 = var16[var19][var22];
                                if (var26 != null && var26.field217) {
                                    class158.method1079(var26, false);
                                }
                            }
                        }
                        if (class96.field1858 == 0) {
                            if (!var13) {
                                class249.field4374 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class249.field4374 = false;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public static void method1317(byte arg0) {
        if (arg0 != 87) {
            return;
        }
        field3474 = null;
        field3495 = null;
        field3475 = null;
        field3487 = null;
        field3473 = null;
        field3478 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZ)V")
    public static final void method1318(int arg0, int arg1, boolean arg2) {
        field3490++;
        if (!arg2) {
            return;
        }
        long var3 = (long) ((arg0 << 16) + arg1);
        class54 var5 = (class54) class249.field4398.method1381(var3, -111);
        if (var5 != null) {
            class207.field3589.method1134(var5, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
    public static final void method1319(byte arg0) {
        class156.field2773.method210(true);
        for (int var1 = 0; var1 < 32; var1++) {
            class131.field2442[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class201.field3459[var2] = 0L;
        }
        if (arg0 < 24) {
            method1314(37, (class249) null);
        }
        field3493++;
        class24.field312 = 0;
    }
}
