import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class215 extends class210 {

    @OriginalMember(owner = "client!mu", name = "Q", descriptor = "Lnk;")
    public static class326 field3747 = new class326(18, 8);

    @OriginalMember(owner = "client!mu", name = "T", descriptor = "I")
    public static int field3750 = 0;

    @OriginalMember(owner = "client!mu", name = "S", descriptor = "[C")
    public static char[] field3749 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!mu", name = "U", descriptor = "[I")
    public static int[] field3751 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!mu", name = "A", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!mu", name = "R", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!mu", name = "V", descriptor = "Ll;")
    public static class196 field3752;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mu", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field3753;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IILza;)Z")
    public static final boolean method1489(int arg0, int arg1, class491 arg2) {
        field3746++;
        int var3 = (class217.field3775 - 104) / 2;
        int var4 = (class277.field4548 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg0; var52 <= 3; var52++) {
                    if (class5.method18(var52, -84, var6, arg0, var51)) {
                        int var53 = var52;
                        if (class355.method2280((byte) 80, var51, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class531.method3144(var53, false, var51, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class137.field2314 = arg2.method834(var7, 0, 512, 512, 512);
        class77.method559(-1);
        if (arg1 != 1024) {
            return true;
        }
        int var9 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + (228 - -((int) (Math.random() * 20.0D)) << 16) + 228 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        boolean[][] var12 = new boolean[class361.field5616][class361.field5616];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class361.field5616) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class361.field5616) {
                arg2.method829(0, 0, class361.field5616 * 4, class361.field5616 * 4);
                arg2.method891(-16777216);
                for (int var37 = arg0; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class361.field5616; var44++) {
                        for (int var50 = 0; var50 < class361.field5616; var50++) {
                            var12[var44][var50] = class5.method18(var37, arg1 - 908, var13 + var44, arg0, var36 + var50);
                        }
                    }
                    class511.field7488[var37].method1514(0, 0, 1024, var13, var36, class361.field5616 + var13, class361.field5616 + var36, var12);
                    if (!class489.field7157) {
                        for (int var45 = -4; var45 < class361.field5616; var45++) {
                            for (int var46 = -4; var46 < class361.field5616; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var48 >= var4 && class5.method18(var37, arg1 - 1099, var47, arg0, var48)) {
                                    int var49 = var37;
                                    if (class355.method2280((byte) -92, var48, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class49.method352(var9, var45 * 4, arg2, var48, var47, var10, (class361.field5616 - var46) * 4 - 4, var49, -11514);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class489.field7157) {
                    class251 var38 = class106.field1865[arg0];
                    for (int var39 = 0; var39 < class361.field5616; var39++) {
                        for (int var40 = 0; var40 < class361.field5616; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field4288[var41 - var38.field4274][var42 - var38.field4271];
                            if ((var43 & 0x40240000) != 0) {
                                arg2.method2864((class361.field5616 - var40) * 4 - 4, (byte) 13, 4, var39 * 4, 4, -1713569622);
                            } else if ((var43 & 0x800000) != 0) {
                                arg2.method2865(-1713569622, 4, var39 * 4, (byte) 87, (class361.field5616 - var40) * 4 - 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg2.method2862((class361.field5616 - var40) * 4 - 4, var39 * 4 - -3, 4, -1713569622, 68);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg2.method2865(-1713569622, 4, var39 * 4, (byte) 87, (class361.field5616 - var40) * 4 + 3 - 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg2.method2862((class361.field5616 - var40) * 4 - 4, var39 * 4, 4, -1713569622, arg1 ^ 0x47A);
                            }
                        }
                    }
                }
                arg2.method914(0, 0, class361.field5616 * 4, class361.field5616 * 4, var11, 2);
                class137.field2314.method626(((var13 - var3) * 4) + 48, -((-var4 + var36) * 4) + 464 + -(class361.field5616 * 4), class361.field5616 * 4, class361.field5616 * 4, 0, 0);
            }
        }
        arg2.method848();
        arg2.method891(-16777215);
        class408.method2530(17234);
        class209.field3305 = 0;
        class448.field6680.method2543(7655);
        if (!class489.field7157) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg0; var21 <= (arg0 + 1) && var21 <= 3; var21++) {
                        if (class5.method18(var21, -113, var14, arg0, var20)) {
                            class518 var22 = (class518) class373.method2346(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class518) class491.method2868(var21, var14, var20, field3753 == null ? (field3753 = method1492("jg")) : field3753);
                            }
                            if (var22 == null) {
                                var22 = (class518) class134.method1018(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class518) class158.method1103(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class39 var23 = class61.field928.method791(var22.method28((byte) -118), true);
                                if (!var23.field622 || class347.field5452) {
                                    int var24 = var23.field656;
                                    if (var23.field575 != null) {
                                        for (int var25 = 0; var25 < var23.field575.length; var25++) {
                                            if (var23.field575[var25] != -1) {
                                                class39 var26 = class61.field928.method791(var23.field575[var25], true);
                                                if (var26.field656 >= 0) {
                                                    var24 = var26.field656;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class445 var28 = class94.field1585.method492(var24, (byte) -10);
                                            if (var28 != null && var28.field6619) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class106.field1865[var21].field4288;
                                            int var32 = class106.field1865[var21].field4274;
                                            int var33 = class106.field1865[var21].field4271;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > var14 - 3 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var30 > var20 - 3 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var4 + 104 - 1 > var30 && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class121.field2133[class209.field3305] = var23.field587;
                                        class495.field7233[class209.field3305] = var29;
                                        class463.field6887[class209.field3305] = var30;
                                        class209.field3305++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class15.field172 != null) {
                class487.field7132.field7274 = 1;
                class94.field1585.method496(arg1 + 27143, 1024, 64);
                for (int var15 = 0; var15 < class15.field172.field1257; var15++) {
                    int var16 = class15.field172.field1252[var15];
                    if ((var16 >> 28) == class302.field4850.field4720) {
                        int var17 = ((var16 & 0xFFFDAEA) >> 14) - class16.field181;
                        int var18 = (var16 & 0x3FFF) - class455.field6794;
                        if (var17 >= 0 && class217.field3775 > var17 && var18 >= 0 && var18 < class277.field4548) {
                            class448.field6680.method2541(0, new class22(var15));
                        } else {
                            class445 var19 = class94.field1585.method492(class15.field172.field1254[var15], (byte) -10);
                            if (var19.field6625 != null && var19.field6630 + var17 >= 0 && class217.field3775 > var19.field6627 + var17 && (var19.field6646 + var18) >= 0 && var19.field6652 + var18 < class277.field4548) {
                                class448.field6680.method2541(0, new class22(var15));
                            }
                        }
                    }
                }
                class94.field1585.method496(28167, 128, 64);
                class487.field7132.field7274 = 2;
                class487.field7132.method2932(arg1 - 1024);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
    public static void method1490(int arg0) {
        field3747 = null;
        int var1 = -11 / ((arg0 + 44) / 55);
        field3752 = null;
        field3751 = null;
        field3749 = null;
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)V")
    public static final void method1491(int arg0) {
        field3748++;
        if (class327.field5150 == class255.field4320) {
            return;
        }
        try {
            if (arg0 == -104) {
                class456.method2735(-27001, "tbrefresh", class326.field5138);
            }
        } catch (Throwable var1) {
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1492(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
