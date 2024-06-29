import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class135 {

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "[I")
    public static int[] field1967 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field1966 = 0;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "Ls;")
    public static class196 field1968 = new class196(32);

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field1971 = 0;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "Z")
    public static boolean field1972 = false;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "Lph;")
    public static class361 field1970;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)V", line = 4)
    public static final void method963(int arg0, boolean arg1) {
        if (arg1) {
            field1969++;
            class116.field1642.method464(3398, arg0);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZIII[[[Lmc;Z)Z", line = 18)
    public static final boolean method964(boolean arg0, int arg1, int arg2, int arg3, class167[][][] arg4, boolean arg5) {
        field1963++;
        byte var6 = arg5 ? 1 : (byte) (class117.field1662 & 0xFF);
        if (class170.field2456[class321.field4835][arg2][arg1] == var6) {
            return false;
        } else if ((class230.field3491[class321.field4835][arg2][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class1.field59[var7] = arg2;
            int var31 = var7 + 1;
            class67.field988[var7] = arg1;
            class170.field2456[class321.field4835][arg2][arg1] = var6;
            if (arg0) {
                return false;
            }
            while (var31 != var8) {
                int var9 = class1.field59[var8] & 0xFFFF;
                int var10 = class1.field59[var8] >> 16 & 0xFF;
                int var11 = class1.field59[var8] >> 24 & 0xFF;
                int var12 = class67.field988[var8] & 0xFFFF;
                int var13 = class67.field988[var8] >> 16 & 0xFF;
                boolean var14 = false;
                if ((class230.field3491[class321.field4835][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                label240: for (int var16 = class321.field4835 + 1; var16 <= 3; var16++) {
                    if ((class230.field3491[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var12] != null) {
                            if (arg4[var16][var9][var12].field2387 != null) {
                                int var17 = class40.method295(-3, var10);
                                if (arg4[var16][var9][var12].field2387.field170 == var17 || arg4[var16][var9][var12].field2387.field166 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class40.method295(-3, var11);
                                    if (arg4[var16][var9][var12].field2387.field170 == var18 || arg4[var16][var9][var12].field2387.field166 == var18) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var19 = class40.method295(-3, var13);
                                    if (arg4[var16][var9][var12].field2387.field170 == var19 || arg4[var16][var9][var12].field2387.field166 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var9][var12].field2406 != null) {
                                for (int var20 = 0; var20 < arg4[var16][var9][var12].field2407; var20++) {
                                    int var21 = (int) (arg4[var16][var9][var12].field2406[var20].field2585 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg4[var16][var9][var12].field2406[var20].field2585 >> 20 & 0x3L);
                                    int var23 = var22 << 6 | var21;
                                    if (var10 == var23 || var11 != 0 && var11 == var23 || var13 != 0 && var13 == var23) {
                                        continue label240;
                                    }
                                }
                            }
                        }
                        class167 var24 = arg4[var16][var9][var12];
                        var15 = true;
                        if (var24 != null && var24.field2407 > 0) {
                            for (int var25 = 0; var25 < var24.field2407; var25++) {
                                class180 var26 = var24.field2406[var25];
                                if (var26.field2590 != var26.field2581 || var26.field2601 != var26.field2580) {
                                    for (int var27 = var26.field2590; var27 <= var26.field2581; var27++) {
                                        for (int var28 = var26.field2580; var28 <= var26.field2601; var28++) {
                                            class170.field2456[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class170.field2456[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    if (class132.field1930[class321.field4835 + 1][var9][var12] > class86.field1223[arg3]) {
                        class86.field1223[arg3] = class132.field1930[class321.field4835 + 1][var9][var12];
                    }
                    int var29 = var9 << 7;
                    int var30 = var12 << 7;
                    if (var29 < class348.field5382[arg3]) {
                        class348.field5382[arg3] = var29;
                    } else if (var29 > class107.field1549[arg3]) {
                        class107.field1549[arg3] = var29;
                    }
                    if (var30 < class356.field5465[arg3]) {
                        class356.field5465[arg3] = var30;
                    } else if (var30 > class150.field2181[arg3]) {
                        class150.field2181[arg3] = var30;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class170.field2456[class321.field4835][var9 - 1][var12] != var6) {
                        class1.field59[var31] = class81.method666(-754974720, class81.method666(1179648, var9 - 1));
                        class67.field988[var31] = class81.method666(1245184, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class170.field2456[class321.field4835][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var9 - 1) >= 0 && class170.field2456[class321.field4835][var9 - 1][var12] != var6 && (class230.field3491[class321.field4835][var9][var12] & 0x4) == 0 && (class230.field3491[class321.field4835][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class1.field59[var31] = class81.method666(class81.method666(var9 - 1, 1179648), 1375731712);
                            class67.field988[var31] = class81.method666(var12, 1245184);
                            class170.field2456[class321.field4835][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class170.field2456[class321.field4835][var9][var12] != var6) {
                            class1.field59[var31] = class81.method666(318767104, class81.method666(var9, 5373952));
                            class67.field988[var31] = class81.method666(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class170.field2456[class321.field4835][var9][var12] = var6;
                        }
                        if ((var9 + 1) < 104 && class170.field2456[class321.field4835][var9 + 1][var12] != var6 && (class230.field3491[class321.field4835][var9][var12] & 0x4) == 0 && (class230.field3491[class321.field4835][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class1.field59[var31] = class81.method666(-1845493760, class81.method666(5373952, var9 + 1));
                            class67.field988[var31] = class81.method666(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class170.field2456[class321.field4835][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < 104 && class170.field2456[class321.field4835][var9 + 1][var12] != var6) {
                        class1.field59[var31] = class81.method666(1392508928, class81.method666(var9 + 1, 9568256));
                        class67.field988[var31] = class81.method666(var12, 9633792);
                        class170.field2456[class321.field4835][var9 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class170.field2456[class321.field4835][var9 - 1][var12] != var6 && (class230.field3491[class321.field4835][var9][var12] & 0x4) == 0 && (class230.field3491[class321.field4835][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class1.field59[var31] = class81.method666(301989888, class81.method666(var9 - 1, 13762560));
                            class67.field988[var31] = class81.method666(var12, 13828096);
                            class170.field2456[class321.field4835][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class170.field2456[class321.field4835][var9][var12] != var6) {
                            class1.field59[var31] = class81.method666(-1828716544, class81.method666(var9, 13762560));
                            class67.field988[var31] = class81.method666(var12, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class170.field2456[class321.field4835][var9][var12] = var6;
                        }
                        if (var9 + 1 < 104 && class170.field2456[class321.field4835][var9 + 1][var12] != var6 && (class230.field3491[class321.field4835][var9][var12] & 0x4) == 0 && (class230.field3491[class321.field4835][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class1.field59[var31] = class81.method666(class81.method666(var9 + 1, 9568256), -771751936);
                            class67.field988[var31] = class81.method666(9633792, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class170.field2456[class321.field4835][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class86.field1223[arg3] != -1000000) {
                class86.field1223[arg3] += 10;
                class348.field5382[arg3] -= 50;
                class107.field1549[arg3] += 50;
                class150.field2181[arg3] += 50;
                class356.field5465[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIII)V", line = 339)
    public static final void method965(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class178.field2558; var5++) {
            if (arg4 < (class338.field5251[var5] + class27.field383[var5]) && class27.field383[var5] < (arg4 + arg1) && arg3 < (class96.field1358[var5] + class324.field4883[var5]) && arg2 + arg3 > class324.field4883[var5]) {
                class186.field2674[var5] = true;
            }
        }
        if (arg0 == -105) {
            field1962++;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 363)
    public static final void method966(int arg0) {
        field1965++;
        if (arg0 != 8844) {
            method967((byte) -38);
        }
        for (int var1 = 0; var1 < class194.field2821; var1++) {
            int var10002 = class214.field3141[var1]--;
            if (class214.field3141[var1] >= -10) {
                class188 var2 = class276.field4188[var1];
                if (var2 == null) {
                    var2 = class188.method1302(class253.field3785, class186.field2668[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class214.field3141[var1] += var2.method1303();
                    class276.field4188[var1] = var2;
                }
                if (class214.field3141[var1] < 0) {
                    int var3;
                    if (class225.field3396[var1] == 0) {
                        var3 = class344.field5322[var1] * class38.field565 >> 8;
                    } else {
                        int var4 = class225.field3396[var1] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - class1.field55.field5137;
                        int var6 = (class225.field3396[var1] & 0xFF97) >> 8;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var7 = (class225.field3396[var1] & 0xFF) * 128;
                        int var8 = var6 * 128 + 64 - class1.field55.field5165;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var5 - 128;
                        if (var7 < var9) {
                            class214.field3141[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var3 = (var7 - var9) * class207.field3035 * class344.field5322[var1] / var7 >> 8;
                    }
                    if (var3 > 0) {
                        class43 var10 = var2.method1301().method312(class144.field2088);
                        class226 var11 = class226.method1661(var10, 100, var3);
                        var11.method1650(class300.field4489[var1] - 1);
                        class179.field2576.method1398(var11);
                    }
                    class214.field3141[var1] = -100;
                }
            } else {
                class194.field2821--;
                for (int var12 = var1; var12 < class194.field2821; var12++) {
                    class186.field2668[var12] = class186.field2668[var12 + 1];
                    class276.field4188[var12] = class276.field4188[var12 + 1];
                    class300.field4489[var12] = class300.field4489[var12 + 1];
                    class214.field3141[var12] = class214.field3141[var12 + 1];
                    class225.field3396[var12] = class225.field3396[var12 + 1];
                    class344.field5322[var12] = class344.field5322[var12 + 1];
                }
                var1--;
            }
        }
        if (class65.field958 && !class172.method1209((byte) -104)) {
            if (class267.field4077 != 0 && class150.field2187 != -1) {
                class20.method124(class150.field2187, 0, false, class267.field4077, class332.field5085, 109);
            }
            class65.field958 = false;
        } else if (class267.field4077 != 0 && class150.field2187 != -1 && !class172.method1209((byte) 40)) {
            class294.field4439++;
            class107.field1533.method1915(true, 249);
            class107.field1533.method1354(class150.field2187, (byte) -109);
            class150.field2187 = -1;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 493)
    public static void method967(byte arg0) {
        if (arg0 <= 46) {
            method963(-22, true);
        }
        field1970 = null;
        field1967 = null;
        field1968 = null;
    }
}
