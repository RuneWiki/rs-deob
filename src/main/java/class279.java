import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class279 {

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Lkn;")
    public static class442 field3910 = new class442("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field3918 = 0;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field3919 = 0;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public int field3914;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lrc;")
    public class318 field3913;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Lai;")
    public static class357 field3915;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "[I")
    public int[] field3911;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIIJI)Ljava/lang/String;")
    public static final String method1818(boolean arg0, int arg1, int arg2, long arg3, int arg4) {
        field3916++;
        char var6 = ',';
        char var7 = '.';
        if (arg1 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg1 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            var8 = true;
            arg3 = -arg3;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = -104 / ((arg4 + 11) / 33);
        int var13 = 0;
        while (true) {
            int var14 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var14 + 48 - (int) arg3 * 10));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var13++;
                if ((var13 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public static final void method1819(boolean arg0) {
        class432.field6110 = new class90();
        if (arg0) {
            field3907++;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lnq;ZLuo;)V")
    public static final void method1820(class268 arg0, boolean arg1, class345 arg2) {
        field3908++;
        class238[] var3 = class238.method1617(arg0, class223.field3119, 0);
        class65.field971 = new class226[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class65.field971[var4] = arg2.method105(var3[var4], true);
        }
        class238[] var5 = class238.method1617(arg0, class224.field3175, 0);
        class74.field1066 = new class226[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class74.field1066[var6] = arg2.method105(var5[var6], true);
        }
        class238[] var7 = class238.method1617(arg0, class99.field1375, 0);
        class452.field6309 = new class226[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class452.field6309[var8] = arg2.method105(var7[var8], true);
        }
        class238[] var9 = class238.method1617(arg0, class205.field2823, 0);
        class222.field3103 = new class226[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class222.field3103[var10] = arg2.method105(var9[var10], true);
        }
        class238[] var11 = class238.method1617(arg0, class9.field173, 0);
        if (arg1) {
            field3917 = -77;
        }
        class366.field5158 = new class226[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class366.field5158[var12] = arg2.method105(var11[var12], true);
        }
        class238[] var13 = class238.method1617(arg0, class436.field6142, 0);
        class239.field3413 = new class226[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class239.field3413[var14] = arg2.method105(var13[var14], true);
        }
        class238[] var15 = class238.method1617(arg0, class159.field2227, 0);
        class292.field4083 = new class226[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class292.field4083[var16] = arg2.method105(var15[var16], true);
        }
        class238[] var17 = class238.method1617(arg0, class377.field5397, 0);
        class89.field1241 = new class226[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class89.field1241[var18] = arg2.method105(var17[var18], true);
        }
        class238[] var19 = class238.method1617(arg0, class214.field2986, 0);
        class366.field5159 = new class226[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class366.field5159[var20] = arg2.method105(var19[var20], true);
        }
        class238[] var21 = class238.method1617(arg0, class273.field3783, 0);
        class61.field846 = new class226[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class61.field846[var22] = arg2.method105(var21[var22], true);
        }
        class238[] var23 = class238.method1617(arg0, class70.field1023, 0);
        class447.field6273 = new class226[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class447.field6273[var24] = arg2.method105(var23[var24], true);
        }
        class238[] var25 = class238.method1617(arg0, class328.field4546, 0);
        class278.field3900 = new class226[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class278.field3900[var26] = arg2.method105(var25[var26], true);
        }
        class238[] var27 = class238.method1617(arg0, class292.field4081, 0);
        class22.field395 = new class226[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class22.field395[var28] = arg2.method105(var27[var28], true);
        }
        class144.field2061 = arg2.method105(class238.method1606(arg0, class416.field5914, 0), true);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZ)V")
    public static final void method1821(int arg0, boolean arg1) {
        field3912++;
        if (arg1 != class155.field2188) {
            class155.field2188 = arg1;
            class59.method463(-121);
            int var2 = -56 % ((arg0 + 39) / 63);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method1822(int arg0) {
        class405.field5769 = arg0;
        for (int var1 = 0; var1 < class200.field2772; var1++) {
            for (int var2 = 0; var2 < class264.field3687; var2++) {
                if (class328.field4549[arg0][var1][var2] == null) {
                    class328.field4549[arg0][var1][var2] = new class125(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static void method1823(byte arg0) {
        field3910 = null;
        if (arg0 != 27) {
            field3910 = null;
        }
        field3915 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB[[B[[ILij;Lij;IZ[[BLuo;[[B[[BI)V")
    public static final void method1824(int arg0, byte arg1, byte[][] arg2, int[][] arg3, class242 arg4, class242 arg5, int arg6, boolean arg7, byte[][] arg8, class345 arg9, byte[][] arg10, byte[][] arg11, int arg12) {
        int var13 = -69 % ((arg1 - 76) / 40);
        for (int var14 = 0; var14 < arg6; var14++) {
            int var15 = var14 < arg6 - 1 ? var14 + 1 : var14;
            for (int var16 = 0; var16 < arg12; var16++) {
                int var17 = arg12 - 1 <= var16 ? var16 : var16 + 1;
                if (class51.method428(-1) || class85.method614(class125.field1760, var16, -31202, arg0, var14)) {
                    boolean var18 = false;
                    boolean var19 = false;
                    boolean[] var20 = new boolean[4];
                    int var21 = arg2[var14][var16];
                    int var22 = arg8[var14][var16];
                    int var23 = arg11[var14][var16] & 0xFF;
                    int var24 = arg10[var14][var16] & 0xFF;
                    int var25 = arg10[var14][var17] & 0xFF;
                    int var26 = arg10[var15][var17] & 0xFF;
                    int var27 = arg10[var15][var16] & 0xFF;
                    if (var23 != 0 || var24 != 0) {
                        class361 var28 = var23 == 0 ? null : class39.method362((byte) 3, var23 - 1);
                        class40 var29 = var24 == 0 ? null : class194.method1252(var24 - 1, false);
                        if (var21 == 0 && var28 == null) {
                            var21 = 12;
                        }
                        class361 var30 = var28;
                        if (var28 != null) {
                            if (var28.field4989 == -1 && var28.field4994 == -1) {
                                var30 = var28;
                                var28 = null;
                            } else if (var29 != null && var21 != 0) {
                                var19 = var28.field4996;
                            }
                        }
                        if ((var21 == 0 || var21 == 12) && var14 > 0 && var16 > 0 && var14 < arg6 && arg12 > var16) {
                            byte var31 = 0;
                            byte var32 = 0;
                            byte var33 = 0;
                            int var34 = var31 + (arg10[var14 - 1][var16 - 1] == var24 ? 1 : -1);
                            byte var35 = 0;
                            int var36 = var32 + (arg10[var15][var16 - 1] == var24 ? 1 : -1);
                            int var37 = var33 + (arg10[var15][var17] == var24 ? 1 : -1);
                            int var38 = var35 + (arg10[var14 - 1][var17] == var24 ? 1 : -1);
                            if (arg10[var14][var16 - 1] == var24) {
                                var36++;
                                var34++;
                            } else {
                                var34--;
                                var36--;
                            }
                            if (arg10[var15][var16] == var24) {
                                var37++;
                                var36++;
                            } else {
                                var37--;
                                var36--;
                            }
                            if (arg10[var14][var17] == var24) {
                                var38++;
                                var37++;
                            } else {
                                var37--;
                                var38--;
                            }
                            if (arg10[var14 - 1][var16] == var24) {
                                var34++;
                                var38++;
                            } else {
                                var38--;
                                var34--;
                            }
                            int var39 = var34 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            int var40 = var36 - var38;
                            if (var40 < 0) {
                                var40 = -var40;
                            }
                            if (var39 == var40) {
                                var39 = arg5.method737(var14, var16) - arg5.method737(var15, var17);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                                var40 = arg5.method737(var15, var16) - arg5.method737(var14, var17);
                                if (var40 < 0) {
                                    var40 = -var40;
                                }
                            }
                            var22 = var39 < var40 ? 1 : 0;
                        }
                        for (int var41 = 0; var41 < 13; var41++) {
                            class171.field2340[var41] = -1;
                            class35.field543[var41] = 1;
                        }
                        boolean[] var42 = var28 != null && var28.field4996 ? class329.field4566[var21] : class62.field861[var21];
                        class224.method1494(var14, arg8, arg2, var21, 4, var28, var20, arg11, arg6, var29, var16, var22, arg12, arg9);
                        boolean var43 = var28 != null && var28.field4994 != var28.field4989;
                        if (!var43) {
                            for (int var44 = 0; var44 < 8; var44++) {
                                if (class171.field2340[var44] >= 0 && class352.field4823[var44] != class188.field2598[var44]) {
                                    var43 = true;
                                    break;
                                }
                            }
                        }
                        if (!var42[var22 + 1 & 0x3]) {
                            var20[1] = class230.method1588(var20[1], class387.method2454(class35.field543[2], class35.field543[4]) == 0);
                        }
                        if (!var42[var22 + 3 & 0x3]) {
                            var20[3] = class230.method1588(var20[3], class387.method2454(class35.field543[6], class35.field543[0]) == 0);
                        }
                        if (!var42[-(-var22) & 0x3]) {
                            var20[0] = class230.method1588(var20[0], class387.method2454(class35.field543[0], class35.field543[2]) == 0);
                        }
                        if (!var42[var22 + 2 & 0x3]) {
                            var20[2] = class230.method1588(var20[2], class387.method2454(class35.field543[6], class35.field543[4]) == 0);
                        }
                        if (!var19 && (var21 == 0 || var21 == 12)) {
                            if (var20[0] && !var20[1] && !var20[2] && var20[3]) {
                                var21 = var21 == 0 ? 13 : 14;
                                var22 = 0;
                                var20[0] = var20[3] = false;
                            } else if (var20[0] && var20[1] && !var20[2] && !var20[3]) {
                                var20[0] = var20[1] = false;
                                var22 = 3;
                                var21 = var21 == 0 ? 13 : 14;
                            } else if (!var20[0] && var20[1] && var20[2] && !var20[3]) {
                                var21 = var21 == 0 ? 13 : 14;
                                var20[1] = var20[2] = false;
                                var22 = 2;
                            } else if (!var20[0] && !var20[1] && var20[2] && var20[3]) {
                                var21 = var21 == 0 ? 13 : 14;
                                var20[2] = var20[3] = false;
                                var22 = 1;
                            }
                        }
                        boolean var45 = !var19 && !var20[0] && !var20[2] && !var20[1] && !var20[3];
                        int[] var46 = null;
                        int[] var47;
                        int[] var48;
                        int var49;
                        int var50;
                        int[] var51;
                        if (var45) {
                            var51 = class299.field4163[var21];
                            var50 = var28 == null ? 0 : class271.field3759[var21];
                            var47 = class314.field4297[var21];
                            var48 = class203.field2789[var21];
                            var49 = var29 == null ? 0 : class282.field3966[var21];
                        } else if (var19) {
                            var47 = class167.field2310[var21];
                            var48 = class18.field328[var21];
                            var49 = var29 == null ? 0 : class247.field3474[var21];
                            var50 = var28 == null ? 0 : class14.field284[var21];
                            var46 = class376.field5370[var21];
                            var51 = class237.field3373[var21];
                        } else {
                            var46 = class128.field1802[var21];
                            var48 = class334.field4603[var21];
                            var50 = var28 == null ? 0 : class151.field2143[var21];
                            var47 = class285.field4029[var21];
                            var49 = var29 == null ? 0 : class452.field6305[var21];
                            var51 = class420.field5953[var21];
                        }
                        int var52 = var49 + var50;
                        if (var52 <= 0) {
                            class75.method559(arg0, var14, var16);
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
                            int[] var56 = arg7 ? new int[var55] : null;
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
                                var63 = var28.field4989;
                                var64 = arg9.method51() ? var28.field4991 : var28.field4995;
                                var65 = var28.field4999;
                                int var66 = class61.method470(126, arg9, var28);
                                for (int var67 = 0; var67 < var50; var67++) {
                                    boolean var93 = false;
                                    byte var94;
                                    if (var20[-var22 & 0x3] && var46[0] == var53) {
                                        class337.field4642[0] = var48[var53];
                                        class337.field4642[1] = 1;
                                        class337.field4642[2] = var47[var53];
                                        class337.field4642[3] = 1;
                                        class337.field4642[4] = var51[var53];
                                        var94 = 6;
                                        class337.field4642[5] = var47[var53];
                                    } else if (var20[2 - var22 & 0x3] && var46[2] == var53) {
                                        class337.field4642[0] = var48[var53];
                                        class337.field4642[1] = 5;
                                        class337.field4642[2] = var47[var53];
                                        class337.field4642[3] = 5;
                                        class337.field4642[4] = var51[var53];
                                        class337.field4642[5] = var47[var53];
                                        var94 = 6;
                                    } else if (var20[1 - var22 & 0x3] && var46[1] == var53) {
                                        class337.field4642[0] = var48[var53];
                                        class337.field4642[1] = 3;
                                        class337.field4642[2] = var47[var53];
                                        class337.field4642[3] = 3;
                                        class337.field4642[4] = var51[var53];
                                        var94 = 6;
                                        class337.field4642[5] = var47[var53];
                                    } else if (var20[3 - var22 & 0x3] && var46[3] == var53) {
                                        class337.field4642[0] = var48[var53];
                                        class337.field4642[1] = 7;
                                        class337.field4642[2] = var47[var53];
                                        class337.field4642[3] = 7;
                                        class337.field4642[4] = var51[var53];
                                        var94 = 6;
                                        class337.field4642[5] = var47[var53];
                                    } else {
                                        class337.field4642[0] = var48[var53];
                                        class337.field4642[1] = var51[var53];
                                        class337.field4642[2] = var47[var53];
                                        var94 = 3;
                                    }
                                    for (int var95 = 0; var95 < var94; var95++) {
                                        int var96 = class337.field4642[var95];
                                        int var97 = var96 - (var22 * 2) & 0x7;
                                        int var98 = class173.field2366[var96];
                                        int var99 = class170.field2328[var96];
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
                                        if (arg7 && class44.field627[var21][var96]) {
                                            int var100 = (var14 << 7) + var58[var54];
                                            int var101 = (var16 << 7) + var59[var54];
                                            var56[var54] = arg4.method725(var100, var101) - arg5.method725(var100, var101);
                                        }
                                        if (var96 < 8 && class171.field2340[var97] > var28.field4985) {
                                            if (var57 != null) {
                                                var57[var54] = class352.field4823[var97];
                                            }
                                            var62[var54] = class413.field5861[var97];
                                            var61[var54] = class22.field401[var97];
                                            var60[var54] = class188.field2598[var97];
                                        } else {
                                            if (var57 != null) {
                                                var57[var54] = var66;
                                            }
                                            var61[var54] = arg9.method51() ? var28.field4991 : var28.field4995;
                                            var62[var54] = var28.field4999;
                                            var60[var54] = var63;
                                        }
                                        var54++;
                                    }
                                    var53++;
                                }
                                if (!arg7 && arg0 == 0) {
                                    class197.method1281(var14, var16, var28.field4990, var28.field4986 * 8);
                                }
                                if (var21 != 12 && var28.field4989 != -1 && var28.field4997) {
                                    var18 = true;
                                }
                            } else if (var45) {
                                var53 += class271.field3759[var21];
                            } else if (var19) {
                                var53 += class14.field284[var21];
                            } else {
                                var53 += class151.field2143[var21];
                            }
                            if (var29 != null) {
                                if (var26 == 0) {
                                    var26 = var24;
                                }
                                if (var25 == 0) {
                                    var25 = var24;
                                }
                                if (var27 == 0) {
                                    var27 = var24;
                                }
                                class40 var68 = class194.method1252(var24 - 1, false);
                                class40 var69 = class194.method1252(var25 - 1, false);
                                class40 var70 = class194.method1252(var26 - 1, false);
                                class40 var71 = class194.method1252(var27 - 1, false);
                                for (int var72 = 0; var72 < var49; var72++) {
                                    boolean var73 = false;
                                    byte var74;
                                    if (var20[-var22 & 0x3] && var46[0] == var53) {
                                        class337.field4642[0] = var48[var53];
                                        class337.field4642[1] = 1;
                                        class337.field4642[2] = var47[var53];
                                        class337.field4642[3] = 1;
                                        class337.field4642[4] = var51[var53];
                                        var74 = 6;
                                        class337.field4642[5] = var47[var53];
                                    } else if (var20[2 - var22 & 0x3] && var46[2] == var53) {
                                        class337.field4642[0] = var48[var53];
                                        class337.field4642[1] = 5;
                                        class337.field4642[2] = var47[var53];
                                        class337.field4642[3] = 5;
                                        class337.field4642[4] = var51[var53];
                                        var74 = 6;
                                        class337.field4642[5] = var47[var53];
                                    } else if (var20[1 - var22 & 0x3] && var46[1] == var53) {
                                        class337.field4642[0] = var48[var53];
                                        class337.field4642[1] = 3;
                                        class337.field4642[2] = var47[var53];
                                        class337.field4642[3] = 3;
                                        class337.field4642[4] = var51[var53];
                                        var74 = 6;
                                        class337.field4642[5] = var47[var53];
                                    } else if (var20[3 - var22 & 0x3] && var46[3] == var53) {
                                        class337.field4642[0] = var48[var53];
                                        class337.field4642[1] = 7;
                                        class337.field4642[2] = var47[var53];
                                        class337.field4642[3] = 7;
                                        class337.field4642[4] = var51[var53];
                                        var74 = 6;
                                        class337.field4642[5] = var47[var53];
                                    } else {
                                        class337.field4642[0] = var48[var53];
                                        class337.field4642[1] = var51[var53];
                                        var74 = 3;
                                        class337.field4642[2] = var47[var53];
                                    }
                                    for (int var75 = 0; var75 < var74; var75++) {
                                        int var76 = class337.field4642[var75];
                                        int var77 = var76 - (var22 * 2) & 0x7;
                                        int var78 = class173.field2366[var76];
                                        int var79 = class170.field2328[var76];
                                        int var80;
                                        int var81;
                                        if (var22 == 1) {
                                            var80 = var79;
                                            var81 = 128 - var78;
                                        } else if (var22 == 2) {
                                            var80 = 128 - var78;
                                            var81 = 128 - var79;
                                        } else if (var22 == 3) {
                                            var80 = 128 - var79;
                                            var81 = var78;
                                        } else {
                                            var81 = var79;
                                            var80 = var78;
                                        }
                                        var58[var54] = var80;
                                        var59[var54] = var81;
                                        if (arg7 && class44.field627[var21][var76]) {
                                            int var82 = (var14 << 7) + var80;
                                            int var83 = (var16 << 7) + var81;
                                            var56[var54] = arg4.method725(var82, var83) - arg5.method725(var82, var83);
                                        }
                                        if (var76 < 8 && class171.field2340[var77] >= 0) {
                                            if (var57 != null) {
                                                var57[var54] = class352.field4823[var77];
                                            }
                                            var62[var54] = class413.field5861[var77];
                                            var61[var54] = class22.field401[var77];
                                            var60[var54] = class188.field2598[var77];
                                        } else {
                                            if (var19 && class44.field627[var21][var76]) {
                                                var61[var54] = var64;
                                                var62[var54] = var65;
                                                var60[var54] = var63;
                                            } else if (var80 == 0 && var81 == 0) {
                                                var60[var54] = arg3[var14][var16];
                                                var61[var54] = var68.field578;
                                                var62[var54] = var68.field586;
                                            } else if (var80 == 0 && var81 == 128) {
                                                var60[var54] = arg3[var14][var17];
                                                var61[var54] = var69.field578;
                                                var62[var54] = var69.field586;
                                            } else if (var80 == 128 && var81 == 128) {
                                                var60[var54] = arg3[var15][var17];
                                                var61[var54] = var70.field578;
                                                var62[var54] = var70.field586;
                                            } else if (var80 == 128 && var81 == 0) {
                                                var60[var54] = arg3[var15][var16];
                                                var61[var54] = var71.field578;
                                                var62[var54] = var71.field586;
                                            } else {
                                                if (var80 >= 64) {
                                                    if (var81 >= 64) {
                                                        var61[var54] = var70.field578;
                                                        var62[var54] = var70.field586;
                                                    } else {
                                                        var61[var54] = var71.field578;
                                                        var62[var54] = var71.field586;
                                                    }
                                                } else if (var81 >= 64) {
                                                    var61[var54] = var69.field578;
                                                    var62[var54] = var69.field586;
                                                } else {
                                                    var61[var54] = var68.field578;
                                                    var62[var54] = var68.field586;
                                                }
                                                int var84 = class282.method1846(arg3[var15][var16], (byte) -44, var80 << 7 >> 7, arg3[var14][var16]);
                                                int var85 = class282.method1846(arg3[var15][var17], (byte) -44, var80 << 7 >> 7, arg3[var14][var17]);
                                                var60[var54] = class282.method1846(var85, (byte) -44, var81 << 7 >> 7, var84);
                                            }
                                            if (var57 != null) {
                                                var57[var54] = var60[var54];
                                            }
                                        }
                                        var54++;
                                    }
                                    var53++;
                                }
                                if (var21 != 0 && var29.field583) {
                                    var18 = true;
                                }
                            }
                            int var86 = arg5.method737(var14, var16);
                            int var87 = arg5.method737(var15, var16);
                            int var88 = arg5.method737(var15, var17);
                            int var89 = arg5.method737(var14, var17);
                            if (arg0 > 0) {
                                boolean var90 = true;
                                if (var24 == 0 && var21 != 0) {
                                    var90 = false;
                                }
                                if (var23 > 0 && var30 != null && !var30.field4988) {
                                    var90 = false;
                                }
                                if (var90 && var86 == var87 && var86 == var88 && var86 == var89) {
                                    class195.field2682[arg0][var14][var16] = (byte) class393.method2487(class195.field2682[arg0][var14][var16], 4);
                                }
                            }
                            int var91 = 0;
                            int var92 = 0;
                            if (arg7) {
                                var91 = class47.method414(var14, var16);
                                var92 = class454.method2822(var14, var16);
                            }
                            arg5.method720(var14, var16, var58, var56, var59, var60, var57, var61, var62, var91, var92, var18);
                            class75.method559(arg0, var14, var16);
                        }
                    }
                }
            }
        }
        field3909++;
    }
}
