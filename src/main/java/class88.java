import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class88 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lil;")
    private static class4 field1254 = new class4(16);

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field1257 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field1265 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lwg;")
    public static class198 field1258 = new class198();

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "F")
    public static float field1259;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "F")
    public static float field1264;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lnm;")
    public static class221 field1253;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lnf;")
    public static class275 field1260;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lho;")
    public static class68 field1255;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "[I")
    public static int[] field1281;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "[[[B")
    public static byte[][][] field1268;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "[[[B")
    public static byte[][][] field1272;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "[[[B")
    public static byte[][][] field1275;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "[[[B")
    public static byte[][][] field1276;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "[[[B")
    public static byte[][][] field1280;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "[[[I")
    public static int[][][] field1266;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "[[[I")
    public static int[][][] field1271;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Lwg;", line = 4)
    public static final class198 method573(int arg0, int arg1) {
        class198 var2 = new class198();
        for (class275 var3 = (class275) field1254.method27(122); var3 != null; var3 = (class275) field1254.method34(8)) {
            if (var3.field4540 && var3.method1966(arg1, 0, arg0)) {
                var2.method1353(-1, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()Ljo;", line = 21)
    public static final class150 method574() {
        int var0 = field1277 - field1267;
        int var1 = field1274 - field1269;
        int var2 = (field1270 - field1279 << 16) / var0;
        int var3 = (field1278 - field1273 << 16) / var1;
        return method585(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lfh;)V", line = 32)
    public static final void method575(class313 arg0) {
        label83: while (true) {
            if (arg0.field5137 < arg0.field5124.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method2224(-121) == 1) {
                    var1 = true;
                    var2 = arg0.method2224(-123);
                    var3 = arg0.method2224(-121);
                }
                int var4 = arg0.method2224(-125);
                int var5 = arg0.method2224(-124);
                int var6 = var4 * 64 - field1261;
                int var7 = field1262 - (var5 * 64 - field1256) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field1263 && var7 < field1262) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method2200(-95);
                                if (var12 != 0) {
                                    if (field1280[var8][var9] == null) {
                                        field1280[var8][var9] = new byte[4096];
                                    }
                                    field1280[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method2200(-107);
                                    if (field1276[var8][var9] == null) {
                                        field1276[var8][var9] = new byte[4096];
                                    }
                                    field1276[var8][var9][(63 - var11 << 6) + var10] = var13;
                                }
                            }
                        }
                        var10++;
                    }
                }
                int var14 = 0;
                while (true) {
                    if (var14 >= (var1 ? 64 : 4096)) {
                        continue label83;
                    }
                    byte var15 = arg0.method2200(104);
                    if (var15 != 0) {
                        arg0.field5137++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)V", line = 122)
    private static final void method576(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field1277 - field1267;
        int var5 = field1274 - field1269;
        if (field1277 < field1263) {
            var4++;
        }
        if (field1274 < field1262) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = arg0 * var6 + arg2 >> 16;
            int var8 = (var6 + 1) * arg0 + arg2 >> 16;
            int var9 = var8 - var7;
            if (var9 > 0) {
                int var10 = field1267 + var6 >> 6;
                if (var10 >= 0 && var10 <= field1266.length - 1) {
                    int[][] var11 = field1266[var10];
                    byte[][] var12 = field1268[var10];
                    byte[][] var13 = field1275[var10];
                    byte[][] var14 = field1280[var10];
                    byte[][] var15 = field1276[var10];
                    byte[][] var16 = field1272[var10];
                    int var17 = field1279 + var7;
                    int var18 = field1279 + var8;
                    for (int var19 = 0; var19 < var5; var19++) {
                        int var20 = arg1 * var19 + arg3 >> 16;
                        int var21 = (var19 + 1) * arg1 + arg3 >> 16;
                        int var22 = var21 - var20;
                        if (var22 > 0) {
                            int var23 = field1273 + var20;
                            int var24 = field1273 + var21;
                            int var25 = field1269 + var19 >> 6;
                            int var26 = field1269 + var19 & 0x3F;
                            int var27 = field1267 + var6 & 0x3F;
                            int var28 = (var26 << 6) + var27;
                            int var29;
                            if (var25 < 0 || var25 > var11.length - 1 || var11[var25] == null) {
                                if (field1260.field4530 != -1) {
                                    var29 = field1260.field4530;
                                } else if ((field1269 + var19 & 0x4) == (field1267 + var6 & 0x4)) {
                                    var29 = field1281[class104.field1503 + 1];
                                } else {
                                    var29 = 4936552;
                                }
                                if (var25 < 0 || var25 > var11.length - 1) {
                                    if (var29 == 0) {
                                        var29 = 1;
                                    }
                                    class317.method2282(var17, var23, var9, var22, var29);
                                    continue;
                                }
                            } else {
                                var29 = var11[var25][var28];
                            }
                            if (var29 == 0) {
                                var29 = 1;
                            }
                            int var30 = var12[var25] == null ? 0 : field1281[var12[var25][var28] & 0xFF];
                            int var31 = var14[var25] == null ? 0 : field1281[var14[var25][var28] & 0xFF];
                            if (var30 == 0 && var31 == 0) {
                                class317.method2282(var17, var23, var9, var22, var29);
                            } else {
                                if (var30 != 0) {
                                    if (var30 == -1) {
                                        var30 = 1;
                                    }
                                    byte var32 = var13[var25] == null ? 0 : var13[var25][var28];
                                    int var33 = var32 & 0xFC;
                                    if (var33 == 0 || var9 <= 1 || var22 <= 1) {
                                        class317.method2282(var17, var23, var9, var22, var30);
                                    } else {
                                        method583(class317.field5228, var17, var23, var29, var30, var9, var22, var33 >> 2, var32 & 0x3, true);
                                    }
                                }
                                if (var31 != 0) {
                                    if (var31 == -1) {
                                        var31 = var29;
                                    }
                                    byte var34 = var15[var25][var28];
                                    int var35 = var34 & 0xFC;
                                    if (var35 == 0 || var9 <= 1 || var22 <= 1) {
                                        class317.method2282(var17, var23, var9, var22, var31);
                                    }
                                    method583(class317.field5228, var17, var23, 0, var31, var9, var22, var35 >> 2, var34 & 0x3, var30 == 0);
                                }
                            }
                            if (var16[var25] != null) {
                                int var36 = var16[var25][var28] & 0xFF;
                                if (var36 != 0) {
                                    int var37;
                                    if (var9 == 1) {
                                        var37 = var17;
                                    } else {
                                        var37 = var18 - 1;
                                    }
                                    int var38;
                                    if (var22 == 1) {
                                        var38 = var23;
                                    } else {
                                        var38 = var24 - 1;
                                    }
                                    int var39 = 13421772;
                                    if (var36 >= 5 && var36 <= 8 || var36 >= 13 && var36 <= 16 || var36 >= 21 && var36 <= 24 || var36 == 27 || var36 == 28) {
                                        var39 = 13369344;
                                        var36 -= 4;
                                    }
                                    if (var36 == 1) {
                                        class317.method2293(var17, var23, var22, var39);
                                    } else if (var36 == 2) {
                                        class317.method2292(var17, var23, var9, var39);
                                    } else if (var36 == 3) {
                                        class317.method2293(var37, var23, var22, var39);
                                    } else if (var36 == 4) {
                                        class317.method2292(var17, var38, var9, var39);
                                    } else if (var36 == 9) {
                                        class317.method2293(var17, var23, var22, 16777215);
                                        class317.method2292(var17, var23, var9, var39);
                                    } else if (var36 == 10) {
                                        class317.method2293(var37, var23, var22, 16777215);
                                        class317.method2292(var17, var23, var9, var39);
                                    } else if (var36 == 11) {
                                        class317.method2293(var37, var23, var22, 16777215);
                                        class317.method2292(var17, var38, var9, var39);
                                    } else if (var36 == 12) {
                                        class317.method2293(var17, var23, var22, 16777215);
                                        class317.method2292(var17, var38, var9, var39);
                                    } else if (var36 == 17) {
                                        class317.method2292(var17, var23, 1, var39);
                                    } else if (var36 == 18) {
                                        class317.method2292(var37, var23, 1, var39);
                                    } else if (var36 == 19) {
                                        class317.method2292(var37, var38, 1, var39);
                                    } else if (var36 == 20) {
                                        class317.method2292(var17, var38, 1, var39);
                                    } else if (var36 == 25) {
                                        for (int var40 = 0; var40 < var22; var40++) {
                                            class317.method2292(var17 + var40, var38 - var40, 1, var39);
                                        }
                                    } else if (var36 == 26) {
                                        for (int var41 = 0; var41 < var22; var41++) {
                                            class317.method2292(var17 + var41, var23 + var41, 1, var39);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var42 = field1279 + var7;
                    var10000 = field1279 + var8;
                    for (int var44 = 0; var44 < var5; var44++) {
                        int var45 = (arg1 * var44 + arg3 >> 16) + field1273;
                        int var46 = ((var44 + 1) * arg1 + arg3 >> 16) + field1273;
                        int var47 = var46 - var45;
                        int var48;
                        if (field1260.field4530 != -1) {
                            var48 = field1260.field4530;
                        } else if ((field1269 + var44 & 0x4) == (field1267 + var6 & 0x4)) {
                            var48 = field1281[class104.field1503 + 1];
                        } else {
                            var48 = 4936552;
                        }
                        if (var48 == 0) {
                            var48 = 1;
                        }
                        class317.method2282(var42, var45, var9, var47, var48);
                    }
                }
            }
        }
        for (int var49 = -2; var49 < var4 + 2; var49++) {
            int var50 = arg0 * var49 + arg2 >> 16;
            int var51 = (var49 + 1) * arg0 + arg2 >> 16;
            int var52 = var51 - var50;
            if (var52 > 0) {
                int var53 = field1279 + var50;
                var10000 = field1279 + var51;
                int var55 = field1267 + var49 >> 6;
                if (var55 >= 0 && var55 <= field1271.length - 1) {
                    int[][] var56 = field1271[var55];
                    for (int var57 = -2; var57 < var5 + 2; var57++) {
                        int var58 = arg1 * var57 + arg3 >> 16;
                        int var59 = (var57 + 1) * arg1 + arg3 >> 16;
                        int var60 = var59 - var58;
                        if (var60 > 0) {
                            int var61 = field1273 + var58;
                            var10000 = field1273 + var59;
                            int var63 = field1269 + var57 >> 6;
                            if (var63 >= 0 && var63 <= var56.length - 1) {
                                int var64 = ((field1269 + var57 & 0x3F) << 6) + (field1267 + var49 & 0x3F);
                                if (var56[var63] != null) {
                                    int var65 = var56[var63][var64];
                                    int var66 = var65 & 0x1FFF;
                                    if (var66 != 0) {
                                        class13 var67 = class337.method2386(var66 - 1, 25335);
                                        int var68 = var65 >> 13 & 0x3;
                                        boolean var69 = (var65 >> 15 & 0x1) == 1;
                                        class239 var70 = var67.method98(var69, 0, var68);
                                        if (var70 != null) {
                                            int var71 = var70.field2915 * var52 / 4;
                                            int var72 = var70.field2913 * var60 / 4;
                                            if (var67.field167) {
                                                int var73 = var65 >> 16 & 0xF;
                                                int var74 = var65 >> 20 & 0xF;
                                                if ((var68 & 0x1) == 1) {
                                                    int var75 = var73;
                                                    var73 = var74;
                                                    var74 = var75;
                                                }
                                                var71 = var52 * var73;
                                                var72 = var60 * var74;
                                            }
                                            if (var71 != 0 && var72 != 0) {
                                                if (var67.field176 == 0) {
                                                    var70.method1676(var53, var61 + var60 - var72, var71, var72);
                                                } else {
                                                    var70.method1671(var53, var61 + var60 - var72, var71, var72, var67.field176);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "()V", line = 519)
    public static void method577() {
        field1253 = null;
        field1254 = null;
        field1260 = null;
        field1255 = null;
        field1258 = null;
        field1266 = (int[][][]) null;
        field1268 = (byte[][][]) null;
        field1275 = (byte[][][]) null;
        field1280 = (byte[][][]) null;
        field1276 = (byte[][][]) null;
        field1272 = (byte[][][]) null;
        field1271 = (int[][][]) null;
        field1281 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 535)
    public static final void method578(int arg0) {
        field1260 = (class275) field1254.method29((long) arg0, 103);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lfh;Z)V", line = 540)
    public static final void method579(class313 arg0, boolean arg1) {
        label125: while (true) {
            if (arg0.field5137 < arg0.field5124.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method2224(-127) == 1) {
                    var2 = true;
                    var3 = arg0.method2224(-120);
                    var4 = arg0.method2224(-124);
                }
                int var5 = arg0.method2224(-123);
                int var6 = arg0.method2224(-125);
                int var7 = var5 * 64 - field1261;
                int var8 = field1262 - (var6 * 64 - field1256) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field1263 && var8 < field1262) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 64) {
                            continue label125;
                        }
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method2224(-128);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method2224(-123);
                                        if (field1272[var9][var10] == null) {
                                            field1272[var9][var10] = new byte[4096];
                                        }
                                        field1272[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method2249(-41);
                                        if (field1271[var9][var10] == null) {
                                            field1271[var9][var10] = new int[4096];
                                        }
                                        field1271[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method2250(-1613178296);
                                        int var17 = arg0.method2224(-128);
                                        int var22 = var16 - 1;
                                        class126 var18 = class165.method1155((byte) -122, var22);
                                        if (var18.field1949 != null) {
                                            var18 = var18.method818(-106);
                                            if (var18 == null || var18.field1903 == -1) {
                                                continue;
                                            }
                                        }
                                        if ((!var18.field1948 || arg1) && var18.field1903 != -1) {
                                            class148 var19 = new class148();
                                            var19.field2378 = var18.field1903;
                                            var19.field2386 = var17;
                                            var19.field2391 = var9 * 64 + var11;
                                            var19.field2381 = var10 * 64 + (64 - var12);
                                            field1258.method1353(-1, var19);
                                        }
                                    }
                                }
                            }
                        }
                        var11++;
                    }
                }
                int var20 = 0;
                while (true) {
                    if (var20 >= (var2 ? 64 : 4096)) {
                        continue label125;
                    }
                    int var21 = arg0.method2224(-122);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field5137++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field5137 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field5137 += 3;
                        }
                    }
                    var20++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lbb;IIII)V", line = 675)
    private static final void method580(class148 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field2389 = ((arg0.field2391 - field1267) * arg1 + arg3 >> 16) + field1279;
        arg0.field2379 = ((arg0.field2381 - field1269) * arg2 + arg4 >> 16) + field1273;
        class312 var5 = class165.method1150(arg0.field2378, (byte) -37);
        if (var5.field5080 != -1) {
            class187 var6 = var5.method2176(true, false, -18);
            if (var6 != null) {
                if (arg0.field2389 - (var6.field2915 + 1 >> 1) <= field1270 && (var6.field2915 + 1 >> 1) + arg0.field2389 >= field1279 && arg0.field2379 - (var6.field2913 + 1 >> 1) <= field1278 && (var6.field2913 + 1 >> 1) + arg0.field2379 >= field1273) {
                    arg0.field2380 = false;
                } else {
                    arg0.field2380 = true;
                }
                return;
            }
        }
        if (arg0.field2391 >= field1267 && arg0.field2391 <= field1277 && arg0.field2381 >= field1269 && arg0.field2381 <= field1274) {
            arg0.field2380 = false;
        } else {
            arg0.field2380 = true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lnm;)V", line = 704)
    public static final void method581(class221 arg0) {
        field1253 = arg0;
        field1254.method31(false);
        int var1 = field1253.method1510("details", 0);
        int[] var2 = field1253.method1515((byte) 99, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field1254.method37(false, class263.method1850(var2[var3], new class313(field1253.method1504(var2[var3], true, var1)), (byte) 123), (long) var2[var3]);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "()V", line = 723)
    public static final void method582() {
        for (int var0 = 0; var0 < field1255.field1060; var0++) {
            if (field1255.field1052[var0] != null) {
                field1258.method1353(-1, field1255.field1052[var0]);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([IIIIIIIIIZ)V", line = 737)
    private static final void method583(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class317.field5229) {
            return;
        }
        if (arg1 < class317.field5234) {
            var10 = class317.field5234;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class317.field5234) {
            return;
        }
        if (var11 > class317.field5229) {
            var11 = class317.field5229;
        }
        int var12 = arg2;
        if (arg2 >= class317.field5232) {
            return;
        }
        if (arg2 < class317.field5235) {
            var12 = class317.field5235;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class317.field5235) {
            return;
        }
        if (var13 > class317.field5232) {
            var13 = class317.field5232;
        }
        int var14 = class317.field5231 * var12 + var10;
        int var15 = class317.field5231 + var10 - var11;
        int var16 = var10 - arg1;
        int var17 = var11 - arg1;
        int var18 = var12 - arg2;
        int var19 = var13 - arg2;
        int var20 = arg5 - var17;
        int var21 = arg5 - var16;
        int var22 = arg6 - var19;
        int var23 = arg6 - var18;
        if (arg7 == 9) {
            arg7 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg7 = 1;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg7 == 1) {
            if (arg8 == 0) {
                for (int var24 = var18; var24 < var19; var24++) {
                    for (int var25 = var16; var25 < var17; var25++) {
                        if (var25 <= var24) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var26 = var23 - 1; var26 >= var22; var26--) {
                    for (int var27 = var16; var27 < var17; var27++) {
                        if (var27 <= var26) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var28 = var18; var28 < var19; var28++) {
                    for (int var29 = var16; var29 < var17; var29++) {
                        if (var29 >= var28) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var30 = var23 - 1; var30 >= var22; var30--) {
                    for (int var31 = var16; var31 < var17; var31++) {
                        if (var31 >= var30) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 2) {
            if (arg8 == 0) {
                for (int var32 = var23 - 1; var32 >= var22; var32--) {
                    for (int var33 = var16; var33 < var17; var33++) {
                        if (var33 <= var32 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var34 = var18; var34 < var19; var34++) {
                    for (int var35 = var16; var35 < var17; var35++) {
                        if (var14 >= 0 && var14 < arg0.length) {
                            if (var35 >= var34 << 1) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        } else {
                            var14++;
                        }
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var36 = var18; var36 < var19; var36++) {
                    for (int var37 = var21 - 1; var37 >= var20; var37--) {
                        if (var37 <= var36 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var38 = var23 - 1; var38 >= var22; var38--) {
                    for (int var39 = var21 - 1; var39 >= var20; var39--) {
                        if (var39 >= var38 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 3) {
            if (arg8 == 0) {
                for (int var40 = var23 - 1; var40 >= var22; var40--) {
                    for (int var41 = var21 - 1; var41 >= var20; var41--) {
                        if (var41 <= var40 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var42 = var23 - 1; var42 >= var22; var42--) {
                    for (int var43 = var16; var43 < var17; var43++) {
                        if (var43 >= var42 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var44 = var18; var44 < var19; var44++) {
                    for (int var45 = var16; var45 < var17; var45++) {
                        if (var45 <= var44 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var46 = var18; var46 < var19; var46++) {
                    for (int var47 = var21 - 1; var47 >= var20; var47--) {
                        if (var47 >= var46 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 4) {
            if (arg8 == 0) {
                for (int var48 = var23 - 1; var48 >= var22; var48--) {
                    for (int var49 = var16; var49 < var17; var49++) {
                        if (var49 >= var48 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var50 = var18; var50 < var19; var50++) {
                    for (int var51 = var16; var51 < var17; var51++) {
                        if (var51 <= var50 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var52 = var18; var52 < var19; var52++) {
                    for (int var53 = var21 - 1; var53 >= var20; var53--) {
                        if (var53 >= var52 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var54 = var23 - 1; var54 >= var22; var54--) {
                    for (int var55 = var21 - 1; var55 >= var20; var55--) {
                        if (var55 <= var54 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg8 == 0) {
                    for (int var64 = var18; var64 < var19; var64++) {
                        for (int var65 = var16; var65 < var17; var65++) {
                            if (var65 <= arg5 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var66 = var18; var66 < var19; var66++) {
                        for (int var67 = var16; var67 < var17; var67++) {
                            if (var66 <= arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var68 = var18; var68 < var19; var68++) {
                        for (int var69 = var16; var69 < var17; var69++) {
                            if (var69 >= arg5 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var70 = var18; var70 < var19; var70++) {
                        for (int var71 = var16; var71 < var17; var71++) {
                            if (var70 >= arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg8 == 0) {
                    for (int var72 = var18; var72 < var19; var72++) {
                        for (int var73 = var16; var73 < var17; var73++) {
                            if (var73 <= var72 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var74 = var23 - 1; var74 >= var22; var74--) {
                        for (int var75 = var16; var75 < var17; var75++) {
                            if (var75 <= var74 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var76 = var23 - 1; var76 >= var22; var76--) {
                        for (int var77 = var21 - 1; var77 >= var20; var77--) {
                            if (var77 <= var76 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var78 = var18; var78 < var19; var78++) {
                        for (int var79 = var21 - 1; var79 >= var20; var79--) {
                            if (var79 <= var78 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg8 == 0) {
                    for (int var80 = var18; var80 < var19; var80++) {
                        for (int var81 = var16; var81 < var17; var81++) {
                            if (var81 >= var80 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var82 = var23 - 1; var82 >= var22; var82--) {
                        for (int var83 = var16; var83 < var17; var83++) {
                            if (var83 >= var82 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var84 = var23 - 1; var84 >= var22; var84--) {
                        for (int var85 = var21 - 1; var85 >= var20; var85--) {
                            if (var85 >= var84 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var86 = var18; var86 < var19; var86++) {
                        for (int var87 = var21 - 1; var87 >= var20; var87--) {
                            if (var87 >= var86 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var56 = var23 - 1; var56 >= var22; var56--) {
                for (int var57 = var21 - 1; var57 >= var20; var57--) {
                    if (var57 >= var56 >> 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 1) {
            for (int var58 = var23 - 1; var58 >= var22; var58--) {
                for (int var59 = var16; var59 < var17; var59++) {
                    if (var59 <= var58 << 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 2) {
            for (int var60 = var18; var60 < var19; var60++) {
                for (int var61 = var16; var61 < var17; var61++) {
                    if (var61 >= var60 >> 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 3) {
            for (int var62 = var18; var62 < var19; var62++) {
                for (int var63 = var21 - 1; var63 >= var20; var63--) {
                    if (var63 <= var62 << 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)Lnf;", line = 1873)
    public static final class275 method584(int arg0, int arg1) {
        for (class275 var2 = (class275) field1254.method27(127); var2 != null; var2 = (class275) field1254.method34(8)) {
            if (var2.field4540 && var2.method1966(arg1, 0, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIII)Ljo;", line = 1886)
    private static final class150 method585(int arg0, int arg1, int arg2, int arg3) {
        class150 var4 = new class150();
        for (class148 var5 = (class148) field1258.method1350(0); var5 != null; var5 = (class148) field1258.method1351(-124)) {
            method580(var5, arg0, arg1, arg2, arg3);
            var4.method1077(16711935, var5);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field1255.field1060; var7++) {
            class148 var8 = field1255.field1052[var7];
            boolean var9 = field1260.method1963(var6, field1255.field1055[var7] & 0x3FFF, field1255.field1055[var7] >> 14 & 0x3FFF, field1255.field1055[var7] >> 28 & 0x3, 35);
            if (var9) {
                var8.field2391 = var6[1] - field1261;
                var8.field2381 = field1262 - (var6[2] - field1256) - 1;
                method580(var8, arg0, arg1, arg2, arg3);
                var4.method1077(16711935, var8);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)V", line = 1924)
    public static final void method586(int arg0, int arg1) {
        for (int var2 = 0; var2 < class71.field1098; var2++) {
            class266 var3 = class52.method382(-115, var2);
            if (var3 != null) {
                int var4 = var3.field4386;
                if (var4 >= 0 && !class272.field4467.method415(false, var4)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field4380 >= 0) {
                    int var5 = var3.field4380;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class272.field4474[class357.method2484(var7, 96, false)];
                } else if (var4 >= 0) {
                    var8 = class272.field4474[class357.method2484(class272.field4467.method405(var4, -8237), 96, false)];
                } else if (var3.field4372 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field4372;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class272.field4474[class357.method2484(var11, 96, false)];
                }
                field1281[var2 + 1] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V", line = 1990)
    public static final void method587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1267 = arg0;
        field1269 = arg1;
        field1277 = arg2;
        field1274 = arg3;
        field1279 = arg4;
        field1273 = arg5;
        field1270 = arg6;
        field1278 = arg7;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Lfh;)V", line = 2004)
    public static final void method588(class313 arg0) {
        label83: while (true) {
            if (arg0.field5137 < arg0.field5124.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method2224(-126) == 1) {
                    var1 = true;
                    var2 = arg0.method2224(-126);
                    var3 = arg0.method2224(-125);
                }
                int var4 = arg0.method2224(-122);
                int var5 = arg0.method2224(-126);
                int var6 = var4 * 64 - field1261;
                int var7 = field1262 - (var5 * 64 - field1256) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field1263 && var7 < field1262) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method2200(45);
                                if (var12 != 0) {
                                    if (field1268[var8][var9] == null) {
                                        field1268[var8][var9] = new byte[4096];
                                    }
                                    field1268[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method2200(-125);
                                    if (field1275[var8][var9] == null) {
                                        field1275[var8][var9] = new byte[4096];
                                    }
                                    field1275[var8][var9][(63 - var11 << 6) + var10] = var13;
                                }
                            }
                        }
                        var10++;
                    }
                }
                int var14 = 0;
                while (true) {
                    if (var14 >= (var1 ? 64 : 4096)) {
                        continue label83;
                    }
                    byte var15 = arg0.method2200(-57);
                    if (var15 != 0) {
                        arg0.field5137++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "()V", line = 2097)
    public static final void method589() {
        int var0 = field1277 - field1267;
        int var1 = field1274 - field1269;
        int var2 = (field1270 - field1279 << 16) / var0;
        int var3 = (field1278 - field1273 << 16) / var1;
        method576(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)Lnf;", line = 2108)
    public static final class275 method590(int arg0) {
        return (class275) field1254.method29((long) arg0, 103);
    }
}
