import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class73 {

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "Lrd;")
    public static class117 field133 = class95.method812("headicons_prayer", (byte) 8);

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "Lrd;")
    public static class117 field140 = class95.method812("overlay_multiway", (byte) 8);

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "Lrd;")
    public static class117 field135 = class95.method812("Bitte laden Sie die Seite neu)3", (byte) 8);

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "Lrd;")
    public static class117 field142 = class95.method812("Verbindung mit Update)2Server)3)3)3", (byte) 8);

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "Lrd;")
    public static class117 field143 = class95.method812("zur-Uck auf die RuneScape)2Webseite gehen", (byte) 8);

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "Lrd;")
    public static class117 field144 = class95.method812("Hidden)2use", (byte) 8);

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "Lrd;")
    public static class117 field149 = class95.method812("::fpson", (byte) 8);

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "Lrd;")
    public static class117 field147 = class95.method812("Wen m-Ochten Sie entfernen?", (byte) 8);

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "Lrd;")
    public class117 field145;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "Lga;")
    public static class44 field150;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "[I")
    public static int[] field139;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "[Lra;")
    public static class114[] field137;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V")
    public static void method43(boolean arg0) {
        field149 = null;
        field140 = null;
        field135 = null;
        field150 = null;
        field143 = null;
        field142 = null;
        field144 = null;
        field133 = null;
        field147 = null;
        field137 = null;
        field139 = null;
        if (!arg0) {
            method43(true);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[Lwa;IIIIIIIIBI)V")
    public static final void method44(int arg0, class144[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11) {
        field148++;
        if (arg5 > arg7 || arg4 > arg3 || arg0 <= arg7 || arg3 >= arg11) {
            return;
        }
        for (int var12 = 0; var12 < arg1.length; var12++) {
            class144 var13 = arg1[var12];
            if (var13 != null && var13.field3509 == arg9 && (!var13.field3499 || !class61.method621(false, var13))) {
                int var14 = var13.field3536 + arg5 - arg2;
                int var15 = var13.field3423 + arg4 - arg8;
                if (var13.field3533 == 8 && var14 <= arg7 && var15 <= arg3 && var13.field3437 + var14 > arg7 && var13.field3490 + var15 > arg3) {
                    class100.field2479 = var12;
                }
                if ((var13.field3424 >= 0 || var13.field3435 != 0) && var14 <= arg7 && arg3 >= var15 && arg7 < var14 + var13.field3437 && arg3 < var15 + var13.field3490) {
                    if (var13.field3424 >= 0) {
                        class115.field2814 = var13.field3424;
                    } else {
                        class115.field2814 = var12;
                    }
                }
                if (var13.field3533 == 0) {
                    if (!var13.field3499 && class61.method621(false, var13) && !class44.method484(arg6, 1, var12)) {
                        continue;
                    }
                    method44(var14 + var13.field3437, arg1, var13.field3457, arg3, var15, var14, arg6, arg7, var13.field3543, var13.field3441, (byte) -112, var13.field3490 + var15);
                    if (var13.field3448 != null) {
                        method44(var13.field3437 + var14, var13.field3448, var13.field3457, arg3, var15, var14, arg6, arg7, var13.field3543, var13.field3441, (byte) -115, var13.field3490 + var15);
                    }
                    if (var13.field3490 < var13.field3420 && !var13.field3499) {
                        class95.method818(var13, var13.field3420, arg6, 4, arg3, var15, var14 + var13.field3437, var13.field3490, arg7);
                    }
                    if (!var13.field3499) {
                        continue;
                    }
                }
                if (var13.field3511 == 1 && arg7 >= var14 && arg3 >= var15 && arg7 < var13.field3437 + var14 && arg3 < var13.field3490 + var15) {
                    boolean var16 = false;
                    if (var13.field3467 != 0) {
                        var16 = class66.method656(var13, (byte) -59);
                    }
                    if (!var16) {
                        class49.field1433++;
                        client.method238(var13.field3441, class134.field3215, 0, -114, 0, 43, var13.field3544);
                    }
                }
                if (var13.field3511 == 2 && !class46.field1292 && arg7 >= var14 && arg3 >= var15 && var13.field3437 + var14 > arg7 && arg3 < var15 + var13.field3490) {
                    class117 var17 = class116.method934((byte) -101, var13);
                    if (var17 != null) {
                        client.method238(var13.field3441, class18.method193(new class117[] { class134.field3211, var13.field3515 }, 117), 0, 116, -1, 42, var17);
                        class124.field3003++;
                    }
                }
                if (var13.field3511 == 3 && arg7 >= var14 && arg3 >= var15 && var13.field3437 + var14 > arg7 && arg3 < var15 + var13.field3490) {
                    class61.field1701++;
                    byte var18;
                    if (arg6 == 3) {
                        var18 = 46;
                    } else {
                        var18 = 5;
                    }
                    client.method238(var13.field3441, class134.field3215, 0, 77, 0, var18, class63.field1810);
                }
                if (var13.field3511 == 4 && var14 <= arg7 && arg3 >= var15 && var13.field3437 + var14 > arg7 && var13.field3490 + var15 > arg3) {
                    client.method238(var13.field3441, class134.field3215, 0, 73, 0, 6, var13.field3544);
                    class133.field3177++;
                }
                if (var13.field3511 == 5 && arg7 >= var14 && arg3 >= var15 && arg7 < var14 + var13.field3437 && arg3 < var13.field3490 + var15) {
                    class46.field1286++;
                    client.method238(var13.field3441, class134.field3215, 0, -107, 0, 15, var13.field3544);
                }
                if (var13.field3511 == 6 && class85.field2230 == -1 && arg7 >= var14 && var15 <= arg3 && var13.field3437 + var14 > arg7 && var13.field3490 + var15 > arg3) {
                    class134.field3218++;
                    client.method238(var13.field3441, class134.field3215, 0, -123, -1, 49, var13.field3544);
                }
                if (var13.field3533 == 2) {
                    int var19 = 0;
                    for (int var20 = 0; var20 < var13.field3490; var20++) {
                        for (int var21 = 0; var21 < var13.field3437; var21++) {
                            int var22 = (var13.field3460 + 32) * var21 + var14;
                            int var23 = (var13.field3469 + 32) * var20 + var15;
                            if (var19 < 20) {
                                var22 += var13.field3492[var19];
                                var23 += var13.field3500[var19];
                            }
                            if (arg7 >= var22 && var23 <= arg3 && var22 + 32 > arg7 && var23 + 32 > arg3) {
                                class134.field3220 = var19;
                                class57.field1578 = var13.field3441;
                                if (var13.field3449[var19] > 0) {
                                    class49 var24 = class108.method887(-1, var13.field3449[var19] - 1);
                                    if (class32.field955 == 1 && class45.method493(class97.method827((byte) 71, var13), (byte) -15)) {
                                        if (class71.field1995 != var13.field3441 || class16.field376 != var19) {
                                            class54.field1536++;
                                            client.method238(var13.field3441, class18.method193(new class117[] { class1.field29, class133.field3190, var24.field1414 }, 40), var24.field1431, -116, var19, 41, class21.field583);
                                        }
                                    } else if (!class46.field1292 || !class45.method493(class97.method827((byte) -76, var13), (byte) -65)) {
                                        class38.field1107++;
                                        class117[] var25 = var24.field1425;
                                        if (class84.field2197) {
                                            var25 = class94.method810(var25, (byte) -87);
                                        }
                                        if (class45.method493(class97.method827((byte) -112, var13), (byte) -110)) {
                                            for (int var26 = 4; var26 >= 3; var26--) {
                                                if (var25 != null && var25[var26] != null) {
                                                    class49.field1366++;
                                                    byte var27;
                                                    if (var26 == 3) {
                                                        var27 = 4;
                                                    } else {
                                                        var27 = 33;
                                                    }
                                                    client.method238(var13.field3441, class18.method193(new class117[] { class40.field1159, var24.field1414 }, 103), var24.field1431, -104, var19, var27, var25[var26]);
                                                } else if (var26 == 4) {
                                                    client.method238(var13.field3441, class18.method193(new class117[] { class40.field1159, var24.field1414 }, 35), var24.field1431, -126, var19, 33, class87.field2262);
                                                    class95.field2375++;
                                                }
                                            }
                                        }
                                        if (class2.method24(23664, class97.method827((byte) -123, var13))) {
                                            class40.field1151++;
                                            client.method238(var13.field3441, class18.method193(new class117[] { class40.field1159, var24.field1414 }, 96), var24.field1431, -105, var19, 55, class21.field583);
                                        }
                                        if (class45.method493(class97.method827((byte) -77, var13), (byte) -128) && var25 != null) {
                                            for (int var28 = 2; var28 >= 0; var28--) {
                                                if (var25[var28] != null) {
                                                    class14.field268++;
                                                    byte var29 = 0;
                                                    if (var28 == 0) {
                                                        var29 = 45;
                                                    }
                                                    if (var28 == 1) {
                                                        var29 = 37;
                                                    }
                                                    if (var28 == 2) {
                                                        var29 = 20;
                                                    }
                                                    client.method238(var13.field3441, class18.method193(new class117[] { class40.field1159, var24.field1414 }, 68), var24.field1431, -123, var19, var29, var25[var28]);
                                                }
                                            }
                                        }
                                        class117[] var30 = var13.field3473;
                                        if (class84.field2197) {
                                            var30 = class94.method810(var30, (byte) -87);
                                        }
                                        if (var30 != null) {
                                            for (int var31 = 4; var31 >= 0; var31--) {
                                                if (var30[var31] != null) {
                                                    class37.field1088++;
                                                    byte var32 = 0;
                                                    if (var31 == 0) {
                                                        var32 = 28;
                                                    }
                                                    if (var31 == 1) {
                                                        var32 = 13;
                                                    }
                                                    if (var31 == 2) {
                                                        var32 = 9;
                                                    }
                                                    if (var31 == 3) {
                                                        var32 = 54;
                                                    }
                                                    if (var31 == 4) {
                                                        var32 = 25;
                                                    }
                                                    client.method238(var13.field3441, class18.method193(new class117[] { class40.field1159, var24.field1414 }, 43), var24.field1431, 29, var19, var32, var30[var31]);
                                                }
                                            }
                                        }
                                        client.method238(var13.field3441, class18.method193(new class117[] { class40.field1159, var24.field1414 }, 103), var24.field1431, -121, var19, 1005, class141.field3354);
                                    } else if ((class84.field2201 & 0x10) == 16) {
                                        class136.field3261++;
                                        client.method238(var13.field3441, class18.method193(new class117[] { class57.field1589, class133.field3190, var24.field1414 }, 30), var24.field1431, 95, var19, 14, class37.field1085);
                                    }
                                }
                            }
                            var19++;
                        }
                    }
                }
                if (var13.field3499) {
                    if (class46.field1292) {
                        if (class61.method617(class97.method827((byte) -105, var13), -107) && (class84.field2201 & 0x20) == 32 && arg7 >= var14 && var15 <= arg3 && arg7 < var13.field3437 + var14 && arg3 < var13.field3490 + var15) {
                            class49.field1381++;
                            client.method238(var13.field3441, class18.method193(new class117[] { class57.field1589, class95.field2382, var13.field3519 }, 42), 0, -126, var13.field3532, 36, class37.field1085);
                        }
                    } else if (arg7 >= var14 && arg3 >= var15 && arg7 < var13.field3437 + var14 && arg3 < var15 + var13.field3490) {
                        for (int var33 = 9; var33 >= 5; var33--) {
                            class117 var37 = class33.method386(0, var13, var33);
                            if (var37 != null) {
                                client.method238(var13.field3441, var13.field3519, var33 + 1, 52, var13.field3532, 56, var37);
                                class73.field2034++;
                            }
                        }
                        class117 var34 = class116.method934((byte) -111, var13);
                        if (var34 != null) {
                            class124.field3003++;
                            client.method238(var13.field3441, var13.field3519, 0, 55, var13.field3532, 42, var34);
                        }
                        for (int var35 = 4; var35 >= 0; var35--) {
                            class117 var36 = class33.method386(0, var13, var35);
                            if (var36 != null) {
                                class73.field2034++;
                                client.method238(var13.field3441, var13.field3519, var35 + 1, -128, var13.field3532, 56, var36);
                            }
                        }
                        if (class134.method1095(-82, class97.method827((byte) 95, var13))) {
                            class134.field3218++;
                            client.method238(var13.field3441, class134.field3215, 0, -123, -1, 49, var13.field3544);
                        }
                    }
                }
            }
        }
        if (arg10 >= -42) {
            method45(-121, 79, 45, 5);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V")
    public static final void method45(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -39) {
            field140 = null;
        }
        if (class72.field2024 != 0 && arg1 != 0 && class27.field803 < 50) {
            class14.field298[class27.field803] = arg0;
            class115.field2818[class27.field803] = arg1;
            class77.field2088[class27.field803] = arg2;
            class18.field454[class27.field803] = null;
            class100.field2492[class27.field803] = 0;
            class27.field803++;
        }
        field138++;
    }
}
