import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class41 {

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lmb;")
    public static class84 field933 = class79.method672(true, "cross");

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field928 = 99;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lmb;")
    public static class84 field927 = class79.method672(true, "Wen m-Ochten Sie der Liste hinzuf-Ugen?");

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field930 = 0;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Lmb;")
    public static class84 field942 = class79.method672(true, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field939 = -1;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field940 = -1;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lmb;")
    private static class84 field934 = class79.method672(true, "flash1:");

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lmb;")
    public static class84 field935 = class79.method672(true, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Lmb;")
    public static class84 field943 = class79.method672(true, "An:");

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lmb;")
    public static class84 field938 = field934;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[[[B")
    public static byte[][][] field929;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public static void method308(boolean arg0) {
        field929 = null;
        field943 = null;
        field935 = null;
        field938 = null;
        field934 = null;
        if (!arg0) {
            field942 = null;
            field927 = null;
            field933 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BIII)I")
    public static final int method309(byte arg0, int arg1, int arg2, int arg3) {
        field936++;
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        int var7 = arg1 & 0x7F;
        int var8 = arg2 & 0x7F;
        if (arg3 < 3 && (class62.field1540[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        if (arg0 != 64) {
            field930 = -92;
        }
        int var9 = (128 - var7) * class52.field1168[var6][var4][var5 - -1] + class52.field1168[var6][var4 + 1][var5 + 1] * var7 >> 7;
        int var10 = (128 - var7) * class52.field1168[var6][var4][var5] + class52.field1168[var6][var4 + 1][var5] * var7 >> 7;
        return (128 - var8) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)[B")
    public abstract byte[] method310(int arg0);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZLsd;II)Ldf;")
    public static final class28 method311(boolean arg0, class122 arg1, int arg2, int arg3) {
        field931++;
        if (arg0) {
            return null;
        } else if (class127.method1037(arg3, (byte) -71, arg1, arg2)) {
            return class13.method74((byte) 124);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLhb;)Lmb;")
    public static final class84 method312(int arg0, byte arg1, class51 arg2) {
        field941++;
        try {
            if (arg1 <= 88) {
                field939 = 69;
            }
            class84 var3 = new class84();
            var3.field2062 = arg2.method382(255);
            if (var3.field2062 > arg0) {
                var3.field2062 = arg0;
            }
            var3.field2058 = new byte[var3.field2062];
            arg2.field1128 += class63.field1556.method772(0, arg2.field1128, arg2.field1084, var3.field2062, var3.field2058, 0);
            return var3;
        } catch (Exception var4) {
            return class10.field173;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static final void method313(byte arg0) {
        class125.method1027(104);
        field937++;
        class106.field2565 = true;
        class22.method155(false);
        if (class89.field2233 != -1) {
            boolean var2 = class66.method598(0, 261, 190, 1, class89.field2233, false, 0);
            if (!var2) {
                class89.field2220 = true;
            }
        } else if (class72.field1777[class68.field1654] != -1) {
            boolean var1 = class66.method598(0, 261, 190, 1, class72.field1777[class68.field1654], false, 0);
            if (!var1) {
                class89.field2220 = true;
            }
        }
        if (class2.field42 && class117.field2784 == 1) {
            if (class146.field3586 == 1) {
                class11.method59(0);
            } else {
                class20.method131((byte) -38);
            }
        }
        if (arg0 < -74) {
            class51.method406(128);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([BI)V")
    public abstract void method314(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lia;IIIIIIIIIII)V")
    public static final void method315(class57[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field932++;
        if (arg6 > arg8 || arg4 > arg11 || arg8 >= arg3 || arg11 >= arg1) {
            return;
        }
        int var12 = -84 % ((-arg5 - 83) / 43);
        for (int var13 = 0; var13 < arg0.length; var13++) {
            class57 var14 = arg0[var13];
            if (var14 != null && var14.field1443 == arg10 && (!var14.field1392 || !class75.method647((byte) 97, var14))) {
                int var15 = var14.field1348 + arg6 - arg7;
                int var16 = arg4 + var14.field1433 - arg9;
                if ((var14.field1424 >= 0 || var14.field1342 != 0) && arg8 >= var15 && var16 <= arg11 && var14.field1365 + var15 > arg8 && arg11 < var14.field1332 + var16) {
                    if (var14.field1424 < 0) {
                        class60.field1491 = var13;
                    } else {
                        class60.field1491 = var14.field1424;
                    }
                }
                if (var14.field1385 == 8 && arg8 >= var15 && var16 <= arg11 && arg8 < var14.field1365 + var15 && var16 + var14.field1332 > arg11) {
                    class64.field1573 = var13;
                }
                if (var14.field1385 == 0) {
                    if (!var14.field1392 && class75.method647((byte) 97, var14) && !class136.method1113(arg2, (byte) 127, var13)) {
                        continue;
                    }
                    method315(arg0, var14.field1332 + var16, arg2, var14.field1365 + var15, var16, 51, var15, var14.field1380, arg8, var14.field1334, var14.field1369, arg11);
                    if (var14.field1410 != null) {
                        method315(var14.field1410, var14.field1332 + var16, arg2, var15 + var14.field1365, var16, -127, var15, var14.field1380, arg8, var14.field1334, var14.field1369, arg11);
                    }
                    if (var14.field1314 > var14.field1332 && !var14.field1392) {
                        class77.method658(arg11, var14.field1365 + var15, var14.field1314, arg2, var14.field1332, arg8, var14, var16, 5393);
                    }
                    if (!var14.field1392) {
                        continue;
                    }
                }
                if (var14.field1384 == 1 && var15 <= arg8 && var16 <= arg11 && var14.field1365 + var15 > arg8 && var16 + var14.field1332 > arg11) {
                    boolean var17 = false;
                    if (var14.field1382 != 0) {
                        var17 = class2.method15(var14, 2);
                    }
                    if (!var17) {
                        class129.method1051(0, 36, class95.field2361, 16711680, var14.field1369, 0, var14.field1435);
                        class133.field3169++;
                    }
                }
                if (var14.field1384 == 2 && !class19.field409 && var15 <= arg8 && arg11 >= var16 && arg8 < var14.field1365 + var15 && var16 + var14.field1332 > arg11) {
                    class84 var18 = class102.method849(70, var14);
                    if (var18 != null) {
                        class129.method1051(-1, 21, class51.method408(new class84[] { class108.field2612, var14.field1419 }, 108), 16711680, var14.field1369, 0, var18);
                        class95.field2342++;
                    }
                }
                if (var14.field1384 == 3 && arg8 >= var15 && var16 <= arg11 && var14.field1365 + var15 > arg8 && var14.field1332 + var16 > arg11) {
                    byte var19;
                    if (arg2 == 3) {
                        var19 = 23;
                    } else {
                        var19 = 41;
                    }
                    class131.field3133++;
                    class129.method1051(0, var19, class95.field2361, 16711680, var14.field1369, 0, class80.field1985);
                }
                if (var14.field1384 == 4 && arg8 >= var15 && var16 <= arg11 && arg8 < var15 + var14.field1365 && var14.field1332 + var16 > arg11) {
                    class129.method1051(0, 28, class95.field2361, 16711680, var14.field1369, 0, var14.field1435);
                    class14.field267++;
                }
                if (var14.field1384 == 5 && arg8 >= var15 && var16 <= arg11 && var14.field1365 + var15 > arg8 && arg11 < var14.field1332 + var16) {
                    class11.field186++;
                    class129.method1051(0, 42, class95.field2361, 16711680, var14.field1369, 0, var14.field1435);
                }
                if (var14.field1384 == 6 && class143.field3432 == -1 && var15 <= arg8 && arg11 >= var16 && arg8 < var15 + var14.field1365 && var14.field1332 + var16 > arg11) {
                    class129.method1051(-1, 56, class95.field2361, 16711680, var14.field1369, 0, var14.field1435);
                    class136.field3291++;
                }
                if (var14.field1385 == 2) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var14.field1332; var21++) {
                        for (int var22 = 0; var22 < var14.field1365; var22++) {
                            int var23 = (var14.field1429 + 32) * var22 + var15;
                            int var24 = (var14.field1413 + 32) * var21 + var16;
                            if (var20 < 20) {
                                var23 += var14.field1441[var20];
                                var24 += var14.field1391[var20];
                            }
                            if (var23 <= arg8 && arg11 >= var24 && var23 + 32 > arg8 && arg11 < var24 + 32) {
                                class124.field3003 = var14.field1369;
                                class102.field2480 = var20;
                                if (var14.field1349[var20] > 0) {
                                    class13 var25 = class98.method813(-1, var14.field1349[var20] - 1);
                                    if (client.field465 == 1 && class143.method1170((byte) 96, class91.method780(-150310624, var14))) {
                                        if (class6.field103 != var14.field1369 || class52.field1188 != var20) {
                                            class102.field2486++;
                                            class129.method1051(var20, 11, class51.method408(new class84[] { class17.field367, class1.field24, var25.field215 }, -53), 16711680, var14.field1369, var25.field213, class141.field3398);
                                        }
                                    } else if (!class19.field409 || !class143.method1170((byte) 86, class91.method780(-150310624, var14))) {
                                        class38.field851++;
                                        class84[] var26 = var25.field231;
                                        if (class30.field708) {
                                            var26 = class143.method1174(5, var26);
                                        }
                                        if (class143.method1170((byte) 87, class91.method780(-150310624, var14))) {
                                            for (int var27 = 4; var27 >= 3; var27--) {
                                                if (var26 != null && var26[var27] != null) {
                                                    byte var28;
                                                    if (var27 == 3) {
                                                        var28 = 50;
                                                    } else {
                                                        var28 = 24;
                                                    }
                                                    class129.method1051(var20, var28, class51.method408(new class84[] { class84.field2106, var25.field215 }, 125), 16711680, var14.field1369, var25.field213, var26[var27]);
                                                    class134.field3201++;
                                                } else if (var27 == 4) {
                                                    class129.method1051(var20, 24, class51.method408(new class84[] { class84.field2106, var25.field215 }, -47), 16711680, var14.field1369, var25.field213, class107.field2593);
                                                    class102.field2491++;
                                                }
                                            }
                                        }
                                        if (class91.method778(class91.method780(-150310624, var14), (byte) -88)) {
                                            class129.method1051(var20, 37, class51.method408(new class84[] { class84.field2106, var25.field215 }, 104), 16711680, var14.field1369, var25.field213, class141.field3398);
                                            class139.field3347++;
                                        }
                                        if (class143.method1170((byte) 69, class91.method780(-150310624, var14)) && var26 != null) {
                                            for (int var29 = 2; var29 >= 0; var29--) {
                                                if (var26[var29] != null) {
                                                    byte var30 = 0;
                                                    class88.field2185++;
                                                    if (var29 == 0) {
                                                        var30 = 53;
                                                    }
                                                    if (var29 == 1) {
                                                        var30 = 49;
                                                    }
                                                    if (var29 == 2) {
                                                        var30 = 22;
                                                    }
                                                    class129.method1051(var20, var30, class51.method408(new class84[] { class84.field2106, var25.field215 }, -110), 16711680, var14.field1369, var25.field213, var26[var29]);
                                                }
                                            }
                                        }
                                        class84[] var31 = var14.field1407;
                                        if (class30.field708) {
                                            var31 = class143.method1174(5, var31);
                                        }
                                        if (var31 != null) {
                                            for (int var32 = 4; var32 >= 0; var32--) {
                                                if (var31[var32] != null) {
                                                    class140.field3360++;
                                                    byte var33 = 0;
                                                    if (var32 == 0) {
                                                        var33 = 35;
                                                    }
                                                    if (var32 == 1) {
                                                        var33 = 31;
                                                    }
                                                    if (var32 == 2) {
                                                        var33 = 26;
                                                    }
                                                    if (var32 == 3) {
                                                        var33 = 44;
                                                    }
                                                    if (var32 == 4) {
                                                        var33 = 25;
                                                    }
                                                    class129.method1051(var20, var33, class51.method408(new class84[] { class84.field2106, var25.field215 }, -61), 16711680, var14.field1369, var25.field213, var31[var32]);
                                                }
                                            }
                                        }
                                        class129.method1051(var20, 1004, class51.method408(new class84[] { class84.field2106, var25.field215 }, -66), 16711680, var14.field1369, var25.field213, class10.field175);
                                    } else if ((class122.field2957 & 0x10) == 16) {
                                        class129.method1051(var20, 55, class51.method408(new class84[] { class5.field72, class1.field24, var25.field215 }, 115), 16711680, var14.field1369, var25.field213, class40.field911);
                                        class63.field1563++;
                                    }
                                }
                            }
                            var20++;
                        }
                    }
                }
                if (var14.field1392) {
                    if (class19.field409) {
                        if (class105.method875((byte) -80, class91.method780(-150310624, var14)) && (class122.field2957 & 0x20) == 32 && arg8 >= var15 && var16 <= arg11 && arg8 < var14.field1365 + var15 && var14.field1332 + var16 > arg11) {
                            class20.field423++;
                            class129.method1051(var14.field1425, 19, class51.method408(new class84[] { class5.field72, class110.field2656, var14.field1399 }, 114), 16711680, var14.field1369, 0, class40.field911);
                        }
                    } else if (var15 <= arg8 && var16 <= arg11 && arg8 < var14.field1365 + var15 && arg11 < var14.field1332 + var16) {
                        for (int var34 = 9; var34 >= 5; var34--) {
                            class84 var38 = class76.method654(var14, true, var34);
                            if (var38 != null) {
                                class129.method1051(var14.field1425, 1, var14.field1399, 16711680, var14.field1369, var34 + 1, var38);
                                class102.field2500++;
                            }
                        }
                        class84 var35 = class102.method849(39, var14);
                        if (var35 != null) {
                            class95.field2342++;
                            class129.method1051(var14.field1425, 21, var14.field1399, 16711680, var14.field1369, 0, var35);
                        }
                        for (int var36 = 4; var36 >= 0; var36--) {
                            class84 var37 = class76.method654(var14, true, var36);
                            if (var37 != null) {
                                class129.method1051(var14.field1425, 1, var14.field1399, 16711680, var14.field1369, var36 + 1, var37);
                                class102.field2500++;
                            }
                        }
                        if (class110.method895(class91.method780(-150310624, var14), -105)) {
                            class136.field3291++;
                            class129.method1051(-1, 56, class95.field2361, 16711680, var14.field1369, 0, var14.field1435);
                        }
                    }
                }
            }
        }
    }
}
