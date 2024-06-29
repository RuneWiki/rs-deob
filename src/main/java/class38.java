import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class38 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field531 = 0;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Leb;")
    public static class395 field538 = new class395();

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field539 = 0;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lae;")
    public static class285 field533;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "[[B")
    public static byte[][] field532;

    static {
        new class409("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Lgl;", line = 4)
    public static final class349 method339(byte arg0, int arg1) {
        field535++;
        int var2 = -37 % ((59 - arg0) / 39);
        class349 var3 = (class349) class382.field5608.method1933((long) arg1, 0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = class307.field4537.method715(arg1 & 0x7FFF, (byte) 72, 0);
        } else {
            var4 = class90.field1111.method715(arg1, (byte) 65, 0);
        }
        class349 var5 = new class349();
        if (var4 != null) {
            var5.method2248(new class256(var4), (byte) 102);
        }
        if (arg1 >= 32768) {
            var5.method2253(0);
        }
        class382.field5608.method1937(-33, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(BI)Llc;", line = 35)
    public static final class129 method340(byte arg0, int arg1) {
        field536++;
        class129 var2 = (class129) class44.field588.method2310((byte) -126, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class74.field946.method715(arg1, (byte) 55, 35);
        class129 var4 = new class129();
        if (arg0 >= -91) {
            return null;
        }
        if (var3 != null) {
            var4.method866(new class256(var3), -8245);
        }
        var4.method861(3);
        class44.field588.method2299(true, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 62)
    public static void method341(int arg0) {
        field533 = null;
        field538 = null;
        field532 = null;
        if (arg0 > -63) {
            field533 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([[BLfp;Lui;I[[BI[[IIZ[[B[[BILui;)V", line = 76)
    public static final void method342(byte[][] arg0, class9 arg1, class378 arg2, int arg3, byte[][] arg4, int arg5, int[][] arg6, int arg7, boolean arg8, byte[][] arg9, byte[][] arg10, int arg11, class378 arg12) {
        field537++;
        int var13 = 15 % ((arg3 - 90) / 33);
        for (int var14 = 0; var14 < arg11; var14++) {
            int var15 = var14 < (arg11 - 1) ? var14 + 1 : var14;
            for (int var16 = 0; var16 < arg7; var16++) {
                int var17 = (arg7 - 1) > var16 ? var16 + 1 : var16;
                if (class163.method1082((byte) 95) || class136.method907(var14, var16, arg5, false, class276.field4085)) {
                    boolean var18 = false;
                    boolean var19 = false;
                    boolean[] var20 = new boolean[4];
                    int var21 = arg4[var14][var16];
                    int var22 = arg9[var14][var16];
                    int var23 = arg10[var14][var16] & 0xFF;
                    int var24 = arg0[var14][var16] & 0xFF;
                    int var25 = arg0[var14][var17] & 0xFF;
                    int var26 = arg0[var15][var17] & 0xFF;
                    int var27 = arg0[var15][var16] & 0xFF;
                    if (var23 != 0 || var24 != 0) {
                        class103 var28 = var23 == 0 ? null : class465.method2868(-95, var23 - 1);
                        if (var21 == 0 && var28 == null) {
                            var21 = 12;
                        }
                        class148 var29 = var24 == 0 ? null : class104.method700(-21855, var24 - 1);
                        class103 var30 = var28;
                        if (var28 != null) {
                            if (var28.field1338 == -1 && var28.field1326 == -1) {
                                var30 = var28;
                                var28 = null;
                            } else if (var29 != null && var21 != 0) {
                                var19 = var28.field1319;
                            }
                        }
                        if ((var21 == 0 || var21 == 12) && var14 > 0 && var16 > 0 && arg11 > var14 && arg7 > var16) {
                            byte var31 = 0;
                            byte var32 = 0;
                            byte var33 = 0;
                            byte var34 = 0;
                            int var35 = var33 + (arg0[var15][var17] == var24 ? 1 : -1);
                            int var36 = var32 + (arg0[var15][var16 - 1] == var24 ? 1 : -1);
                            int var37 = var31 + (arg0[var14 - 1][var16 - 1] == var24 ? 1 : -1);
                            int var38 = var34 + (arg0[var14 - 1][var17] == var24 ? 1 : -1);
                            if (arg0[var14][var16 - 1] == var24) {
                                var37++;
                                var36++;
                            } else {
                                var37--;
                                var36--;
                            }
                            if (arg0[var15][var16] == var24) {
                                var36++;
                                var35++;
                            } else {
                                var35--;
                                var36--;
                            }
                            if (arg0[var14][var17] == var24) {
                                var35++;
                                var38++;
                            } else {
                                var38--;
                                var35--;
                            }
                            if (arg0[var14 - 1][var16] == var24) {
                                var38++;
                                var37++;
                            } else {
                                var37--;
                                var38--;
                            }
                            int var39 = var37 - var35;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            int var40 = var36 - var38;
                            if (var40 < 0) {
                                var40 = -var40;
                            }
                            if (var39 == var40) {
                                var39 = arg2.method1429(var14, var16) - arg2.method1429(var15, var17);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                                var40 = arg2.method1429(var15, var16) - arg2.method1429(var14, var17);
                                if (var40 < 0) {
                                    var40 = -var40;
                                }
                            }
                            var22 = var39 < var40 ? 1 : 0;
                        }
                        for (int var41 = 0; var41 < 13; var41++) {
                            class106.field1433[var41] = -1;
                            class226.field3388[var41] = 1;
                        }
                        boolean[] var42 = var28 != null && var28.field1319 ? class187.field2610[var21] : class411.field5899[var21];
                        class225.method1546(var21, arg11, var22, var16, arg7, var28, arg1, 115, arg10, var14, var20, var29, arg4, arg9);
                        boolean var43 = var28 != null && var28.field1338 != var28.field1326;
                        if (!var43) {
                            for (int var44 = 0; var44 < 8; var44++) {
                                if (class106.field1433[var44] >= 0 && class30.field423[var44] != class251.field3685[var44]) {
                                    var43 = true;
                                    break;
                                }
                            }
                        }
                        if (!var42[var22 + 1 & 0x3]) {
                            var20[1] = class446.method2736(var20[1], class386.method2438(class226.field3388[4], class226.field3388[2]) == 0);
                        }
                        if (!var42[var22 + 3 & 0x3]) {
                            var20[3] = class446.method2736(var20[3], class386.method2438(class226.field3388[6], class226.field3388[0]) == 0);
                        }
                        if (!var42[var22 & 0x3]) {
                            var20[0] = class446.method2736(var20[0], class386.method2438(class226.field3388[2], class226.field3388[0]) == 0);
                        }
                        if (!var42[var22 + 2 & 0x3]) {
                            var20[2] = class446.method2736(var20[2], class386.method2438(class226.field3388[4], class226.field3388[6]) == 0);
                        }
                        if (!var19 && (var21 == 0 || var21 == 12)) {
                            if (var20[0] && !var20[1] && !var20[2] && var20[3]) {
                                var22 = 0;
                                var20[0] = var20[3] = false;
                                var21 = var21 == 0 ? 13 : 14;
                            } else if (var20[0] && var20[1] && !var20[2] && !var20[3]) {
                                var21 = var21 == 0 ? 13 : 14;
                                var22 = 3;
                                var20[0] = var20[1] = false;
                            } else if (!var20[0] && var20[1] && var20[2] && !var20[3]) {
                                var20[1] = var20[2] = false;
                                var22 = 2;
                                var21 = var21 == 0 ? 13 : 14;
                            } else if (!var20[0] && !var20[1] && var20[2] && var20[3]) {
                                var22 = 1;
                                var20[2] = var20[3] = false;
                                var21 = var21 == 0 ? 13 : 14;
                            }
                        }
                        boolean var45 = !var19 && !var20[0] && !var20[2] && !var20[1] && !var20[3];
                        int[] var46 = null;
                        int[] var47;
                        int var48;
                        int[] var49;
                        int[] var50;
                        int var51;
                        if (var45) {
                            var47 = class429.field6242[var21];
                            var48 = var29 == null ? 0 : class463.field6827[var21];
                            var49 = class275.field4076[var21];
                            var50 = class166.field2193[var21];
                            var51 = var28 == null ? 0 : client.field3881[var21];
                        } else if (var19) {
                            var48 = var29 == null ? 0 : class399.field5776[var21];
                            var47 = class238.field3536[var21];
                            var49 = class319.field4712[var21];
                            var46 = class422.field6102[var21];
                            var51 = var28 == null ? 0 : class155.field2091[var21];
                            var50 = class402.field5807[var21];
                        } else {
                            var47 = class163.field2163[var21];
                            var48 = var29 == null ? 0 : class187.field2615[var21];
                            var51 = var28 == null ? 0 : class103.field1334[var21];
                            var49 = class132.field1801[var21];
                            var50 = class153.field2067[var21];
                            var46 = class323.field4777[var21];
                        }
                        int var52 = var51 + var48;
                        if (var52 <= 0) {
                            class202.method1391(arg5, var14, var16);
                        } else {
                            if (var20[0]) {
                                var52++;
                            }
                            if (var20[2]) {
                                var52++;
                            }
                            if (var20[1]) {
                                var52++;
                            }
                            if (var20[3]) {
                                var52++;
                            }
                            int var53 = 0;
                            int var54 = 0;
                            int var55 = var52 * 3;
                            int[] var56 = arg8 ? new int[var55] : null;
                            int[] var57 = var43 ? new int[var55] : null;
                            int[] var58 = new int[var55];
                            int[] var59 = new int[var55];
                            int[] var60 = new int[var55];
                            int[] var61 = new int[var55];
                            int[] var62 = new int[var55];
                            int var63 = -1;
                            int var64 = -1;
                            int var65 = 256;
                            if (var28 != null) {
                                var63 = var28.field1338;
                                var64 = arg1.method109() ? var28.field1329 : var28.field1333;
                                var65 = var28.field1327;
                                int var66 = class369.method2342(false, var28, arg1);
                                for (int var67 = 0; var67 < var51; var67++) {
                                    boolean var93 = false;
                                    byte var94;
                                    if (var20[-var22 & 0x3] && var46[0] == var53) {
                                        class142.field1933[0] = var50[var53];
                                        class142.field1933[1] = 1;
                                        class142.field1933[2] = var47[var53];
                                        class142.field1933[3] = 1;
                                        class142.field1933[4] = var49[var53];
                                        var94 = 6;
                                        class142.field1933[5] = var47[var53];
                                    } else if (var20[2 - var22 & 0x3] && var46[2] == var53) {
                                        class142.field1933[0] = var50[var53];
                                        class142.field1933[1] = 5;
                                        class142.field1933[2] = var47[var53];
                                        class142.field1933[3] = 5;
                                        class142.field1933[4] = var49[var53];
                                        var94 = 6;
                                        class142.field1933[5] = var47[var53];
                                    } else if (var20[1 - var22 & 0x3] && var46[1] == var53) {
                                        class142.field1933[0] = var50[var53];
                                        class142.field1933[1] = 3;
                                        class142.field1933[2] = var47[var53];
                                        class142.field1933[3] = 3;
                                        class142.field1933[4] = var49[var53];
                                        class142.field1933[5] = var47[var53];
                                        var94 = 6;
                                    } else if (var20[3 - var22 & 0x3] && var46[3] == var53) {
                                        class142.field1933[0] = var50[var53];
                                        class142.field1933[1] = 7;
                                        class142.field1933[2] = var47[var53];
                                        class142.field1933[3] = 7;
                                        class142.field1933[4] = var49[var53];
                                        var94 = 6;
                                        class142.field1933[5] = var47[var53];
                                    } else {
                                        class142.field1933[0] = var50[var53];
                                        class142.field1933[1] = var49[var53];
                                        class142.field1933[2] = var47[var53];
                                        var94 = 3;
                                    }
                                    var53++;
                                    for (int var95 = 0; var95 < var94; var95++) {
                                        int var96 = class142.field1933[var95];
                                        int var97 = var96 - (var22 * 2) & 0x7;
                                        int var98 = class373.field5456[var96];
                                        int var99 = class244.field3617[var96];
                                        if (var22 == 1) {
                                            var58[var54] = var99;
                                            var59[var54] = 128 - var98;
                                        } else if (var22 == 2) {
                                            var58[var54] = 128 - var98;
                                            var59[var54] = 128 - var99;
                                        } else if (var22 == 3) {
                                            var58[var54] = 128 - var99;
                                            var59[var54] = var98;
                                        } else {
                                            var58[var54] = var98;
                                            var59[var54] = var99;
                                        }
                                        if (arg8 && class149.field2022[var21][var96]) {
                                            int var100 = (var14 << 7) + var58[var54];
                                            int var101 = (var16 << 7) + var59[var54];
                                            var56[var54] = arg12.method1427(var100, var101) - arg2.method1427(var100, var101);
                                        }
                                        if (var96 < 8 && class106.field1433[var97] > var28.field1331) {
                                            if (var57 != null) {
                                                var57[var54] = class251.field3685[var97];
                                            }
                                            var62[var54] = class294.field4276[var97];
                                            var61[var54] = class96.field1192[var97];
                                            var60[var54] = class30.field423[var97];
                                        } else {
                                            if (var57 != null) {
                                                var57[var54] = var66;
                                            }
                                            var61[var54] = arg1.method109() ? var28.field1329 : var28.field1333;
                                            var62[var54] = var28.field1327;
                                            var60[var54] = var63;
                                        }
                                        var54++;
                                    }
                                }
                                if (!arg8 && arg5 == 0) {
                                    class62.method465(var14, var16, var28.field1339, var28.field1328 * 8);
                                }
                                if (var21 != 12 && var28.field1338 != -1 && var28.field1324) {
                                    var18 = true;
                                }
                            } else if (var45) {
                                var53 += client.field3881[var21];
                            } else if (var19) {
                                var53 += class155.field2091[var21];
                            } else {
                                var53 += class103.field1334[var21];
                            }
                            if (var29 != null) {
                                if (var27 == 0) {
                                    var27 = var24;
                                }
                                if (var25 == 0) {
                                    var25 = var24;
                                }
                                if (var26 == 0) {
                                    var26 = var24;
                                }
                                class148 var68 = class104.method700(-21855, var24 - 1);
                                class148 var69 = class104.method700(-21855, var25 - 1);
                                class148 var70 = class104.method700(-21855, var26 - 1);
                                class148 var71 = class104.method700(-21855, var27 - 1);
                                for (int var72 = 0; var72 < var48; var72++) {
                                    boolean var73 = false;
                                    byte var74;
                                    if (var20[-var22 & 0x3] && var46[0] == var53) {
                                        class142.field1933[0] = var50[var53];
                                        class142.field1933[1] = 1;
                                        class142.field1933[2] = var47[var53];
                                        class142.field1933[3] = 1;
                                        class142.field1933[4] = var49[var53];
                                        class142.field1933[5] = var47[var53];
                                        var74 = 6;
                                    } else if (var20[2 - var22 & 0x3] && var46[2] == var53) {
                                        class142.field1933[0] = var50[var53];
                                        class142.field1933[1] = 5;
                                        class142.field1933[2] = var47[var53];
                                        class142.field1933[3] = 5;
                                        class142.field1933[4] = var49[var53];
                                        var74 = 6;
                                        class142.field1933[5] = var47[var53];
                                    } else if (var20[1 - var22 & 0x3] && var46[1] == var53) {
                                        class142.field1933[0] = var50[var53];
                                        class142.field1933[1] = 3;
                                        class142.field1933[2] = var47[var53];
                                        class142.field1933[3] = 3;
                                        class142.field1933[4] = var49[var53];
                                        var74 = 6;
                                        class142.field1933[5] = var47[var53];
                                    } else if (var20[3 - var22 & 0x3] && var46[3] == var53) {
                                        class142.field1933[0] = var50[var53];
                                        class142.field1933[1] = 7;
                                        class142.field1933[2] = var47[var53];
                                        class142.field1933[3] = 7;
                                        class142.field1933[4] = var49[var53];
                                        class142.field1933[5] = var47[var53];
                                        var74 = 6;
                                    } else {
                                        class142.field1933[0] = var50[var53];
                                        class142.field1933[1] = var49[var53];
                                        var74 = 3;
                                        class142.field1933[2] = var47[var53];
                                    }
                                    var53++;
                                    for (int var75 = 0; var75 < var74; var75++) {
                                        int var76 = class142.field1933[var75];
                                        int var77 = var76 - (var22 * 2) & 0x7;
                                        int var78 = class373.field5456[var76];
                                        int var79 = class244.field3617[var76];
                                        int var80;
                                        int var81;
                                        if (var22 == 1) {
                                            var80 = var79;
                                            var81 = 128 - var78;
                                        } else if (var22 == 2) {
                                            var81 = 128 - var79;
                                            var80 = 128 - var78;
                                        } else if (var22 == 3) {
                                            var80 = 128 - var79;
                                            var81 = var78;
                                        } else {
                                            var81 = var79;
                                            var80 = var78;
                                        }
                                        var58[var54] = var80;
                                        var59[var54] = var81;
                                        if (arg8 && class149.field2022[var21][var76]) {
                                            int var82 = (var14 << 7) + var80;
                                            int var83 = (var16 << 7) + var81;
                                            var56[var54] = arg12.method1427(var82, var83) - arg2.method1427(var82, var83);
                                        }
                                        if (var76 < 8 && class106.field1433[var77] >= 0) {
                                            if (var57 != null) {
                                                var57[var54] = class251.field3685[var77];
                                            }
                                            var62[var54] = class294.field4276[var77];
                                            var61[var54] = class96.field1192[var77];
                                            var60[var54] = class30.field423[var77];
                                        } else {
                                            if (var19 && class149.field2022[var21][var76]) {
                                                var61[var54] = var64;
                                                var62[var54] = var65;
                                                var60[var54] = var63;
                                            } else if (var80 == 0 && var81 == 0) {
                                                var60[var54] = arg6[var14][var16];
                                                var61[var54] = var68.field2004;
                                                var62[var54] = var68.field2014;
                                            } else if (var80 == 0 && var81 == 128) {
                                                var60[var54] = arg6[var14][var17];
                                                var61[var54] = var69.field2004;
                                                var62[var54] = var69.field2014;
                                            } else if (var80 == 128 && var81 == 128) {
                                                var60[var54] = arg6[var15][var17];
                                                var61[var54] = var70.field2004;
                                                var62[var54] = var70.field2014;
                                            } else if (var80 == 128 && var81 == 0) {
                                                var60[var54] = arg6[var15][var16];
                                                var61[var54] = var71.field2004;
                                                var62[var54] = var71.field2014;
                                            } else {
                                                if (var80 < 64) {
                                                    if (var81 >= 64) {
                                                        var61[var54] = var69.field2004;
                                                        var62[var54] = var69.field2014;
                                                    } else {
                                                        var61[var54] = var68.field2004;
                                                        var62[var54] = var68.field2014;
                                                    }
                                                } else if (var81 < 64) {
                                                    var61[var54] = var71.field2004;
                                                    var62[var54] = var71.field2014;
                                                } else {
                                                    var61[var54] = var70.field2004;
                                                    var62[var54] = var70.field2014;
                                                }
                                                int var84 = class32.method311(var80 << 7 >> 7, arg6[var14][var16], arg6[var15][var16], 21013);
                                                int var85 = class32.method311(var80 << 7 >> 7, arg6[var14][var17], arg6[var15][var17], 21013);
                                                var60[var54] = class32.method311(var81 << 7 >> 7, var84, var85, 21013);
                                            }
                                            if (var57 != null) {
                                                var57[var54] = var60[var54];
                                            }
                                        }
                                        var54++;
                                    }
                                }
                                if (var21 != 0 && var29.field2011) {
                                    var18 = true;
                                }
                            }
                            int var86 = arg2.method1429(var14, var16);
                            int var87 = arg2.method1429(var15, var16);
                            int var88 = arg2.method1429(var15, var17);
                            int var89 = arg2.method1429(var14, var17);
                            if (arg5 > 0) {
                                boolean var90 = true;
                                if (var24 == 0 && var21 != 0) {
                                    var90 = false;
                                }
                                if (var23 > 0 && var30 != null && !var30.field1317) {
                                    var90 = false;
                                }
                                if (var90 && var86 == var87 && var86 == var88 && var86 == var89) {
                                    class282.field4150[arg5][var14][var16] = (byte) class259.method1785(class282.field4150[arg5][var14][var16], 4);
                                }
                            }
                            int var91 = 0;
                            int var92 = 0;
                            if (arg8) {
                                var91 = class331.method2159(var14, var16);
                                var92 = class75.method530(var14, var16);
                            }
                            arg2.method1423(var14, var16, var58, var56, var59, var60, var57, var61, var62, var91, var92, var18);
                            class202.method1391(arg5, var14, var16);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 880)
    public static final void method343(byte arg0) {
        if (arg0 == 52) {
            class388.field5677.method140(class294.field4275, class76.field969 ? class148.field2018 + 256 : -1);
            field534++;
        }
    }
}
