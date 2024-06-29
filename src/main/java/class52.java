import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class52 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Loc;")
    public static class99 field1234 = class48.method402((byte) -104, "sl_back");

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field1246 = 0;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Z")
    public static boolean field1243 = false;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1240 = 0;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static volatile int field1239 = 0;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Loc;")
    public static class99 field1248 = class48.method402((byte) -104, "rot:");

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public static int field1252 = 0;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Lma;")
    public static class83 field1250 = new class83();

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Loc;")
    private static class99 field1253 = class48.method402((byte) -104, "Unable to connect)3");

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Loc;")
    public static class99 field1256 = field1253;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Loc;")
    public static class99 field1255 = field1253;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "[I")
    public static int[] field1236;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "[I")
    public static int[] field1254;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILib;I)Loc;")
    public static final class99 method429(int arg0, class57 arg1, int arg2) {
        field1249++;
        try {
            class99 var3 = new class99();
            var3.field2391 = arg1.method470((byte) -119);
            if (arg2 < var3.field2391) {
                var3.field2391 = arg2;
            }
            var3.field2394 = new byte[var3.field2391];
            if (arg0 == 3531) {
                arg1.field1477 += class54.field1306.method960(var3.field2391, true, 0, arg1.field1469, var3.field2394, arg1.field1477);
                return var3;
            } else {
                return null;
            }
        } catch (Exception var4) {
            return class5.field122;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V")
    public static final void method430(int arg0, int arg1, int arg2) {
        field1242++;
        class18 var3 = class82.method707(12854, arg0);
        if (arg1 >= -15) {
            field1255 = null;
        }
        int var4 = var3.field477;
        int var5 = var3.field478;
        int var6 = var3.field468;
        int var7 = class73.field1852[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class94.field2283[var4] = class88.method744(class17.method171(~var8, class94.field2283[var4]), class17.method171(arg2 << var5, var8));
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static final void method431(byte arg0) {
        class23.method212(36, false);
        field1238++;
        class68.field1759 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class143.field3543.length; var2++) {
            if (class114.field2841[var2] != -1 && class143.field3543[var2] == null) {
                class143.field3543[var2] = class16.field410.method903(class114.field2841[var2], (byte) -128, 0);
                if (class143.field3543[var2] == null) {
                    class68.field1759++;
                    var1 = false;
                }
            }
            if (class144.field3608[var2] != -1 && class82.field2038[var2] == null) {
                class82.field2038[var2] = class16.field410.method895(0, -43, class1.field23[var2], class144.field3608[var2]);
                if (class82.field2038[var2] == null) {
                    class68.field1759++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class14.field326 = 1;
            return;
        }
        boolean var3 = true;
        class135.field3364 = 0;
        for (int var4 = 0; var4 < class143.field3543.length; var4++) {
            byte[] var56 = class82.field2038[var4];
            if (var56 != null) {
                int var57 = (class69.field1781[var4] & 0xFF) * 64 - class5.field120;
                int var58 = (class69.field1781[var4] >> 8) * 64 - class67.field1712;
                if (class9.field226) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class108.method929(var57, var56, 17721, var58);
            }
        }
        if (!var3) {
            class14.field326 = 2;
            return;
        }
        if (class14.field326 != 0) {
            class53.method437(class61.field1638, true, (byte) 123, class102.field2475);
        }
        class111.method949(18645);
        class12.method129(2388);
        class111.method949(18645);
        class68.field1757.method80();
        class111.method949(18645);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class86.field2143[var5].method288(16578);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class81.field2028[var6][var54][var55] = 0;
                }
            }
        }
        class111.method949(18645);
        class57.method464(104);
        int var7 = class143.field3543.length;
        class149.method1209(0);
        class23.method212(36, true);
        if (!class9.field226) {
            for (int var8 = 0; var8 < var7; var8++) {
                byte[] var17 = class143.field3543[var8];
                int var18 = (class69.field1781[var8] >> 8) * 64 - class67.field1712;
                int var19 = (class69.field1781[var8] & 0xFF) * 64 - class5.field120;
                if (var17 != null) {
                    class111.method949(18645);
                    class23.method211(class86.field2143, class54.field1294 * 8 - 48, 5048, var17, var19, (class82.field2040 - 6) * 8, var18);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class69.field1781[var9] & 0xFF) * 64 - class5.field120;
                byte[] var15 = class143.field3543[var9];
                int var16 = (class69.field1781[var9] >> 8) * 64 - class67.field1712;
                if (var15 == null && class82.field2040 < 800) {
                    class111.method949(18645);
                    class126.method1033(var16, 64, 64, var14, -7148);
                }
            }
            class23.method212(36, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class82.field2038[var10];
                if (var11 != null) {
                    int var12 = (class69.field1781[var10] & 0xFF) * 64 - class5.field120;
                    int var13 = (class69.field1781[var10] >> 8) * 64 - class67.field1712;
                    class111.method949(18645);
                    class48.method403(var12, var11, class86.field2143, class68.field1757, 169, var13);
                }
            }
        }
        if (class9.field226) {
            for (int var20 = 0; var20 < 4; var20++) {
                class111.method949(18645);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class140.field3484[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 1 & 0x3;
                            int var39 = var36 >> 24 & 0x3;
                            int var40 = var36 >> 14 & 0x3FF;
                            int var41 = var36 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class69.field1781.length; var43++) {
                                if (class69.field1781[var43] == var42 && class143.field3543[var43] != null) {
                                    class86.method735(class86.field2143, (var41 & 0x7) * 8, 107, class143.field3543[var43], (var40 & 0x7) * 8, var34 * 8, var39, var38, var20, var35 * 8);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class107.method915(var35 * 8, var20, true, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class140.field3484[0][var21][var32];
                    if (var33 == -1) {
                        class126.method1033(var21 * 8, 8, 8, var32 * 8, -7148);
                    }
                }
            }
            class23.method212(36, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class111.method949(18645);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class140.field3484[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < class69.field1781.length; var31++) {
                                if (class69.field1781[var31] == var30 && class82.field2038[var31] != null) {
                                    class33.method281(var26, var22, 95, var24 * 8, var23 * 8, class68.field1757, var27, class86.field2143, (var29 & 0x7) * 8, (var28 & 0x7) * 8, class82.field2038[var31]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class23.method212(36, true);
        class12.method129(2388);
        class111.method949(18645);
        class15.method154(0, class86.field2143, class68.field1757);
        class23.method212(36, true);
        int var44 = class12.field290;
        if (class84.field2116 < var44) {
            var44 = class84.field2116;
        }
        if (class84.field2116 - 1 > var44) {
            int var45 = class84.field2116 - 1;
        }
        if (class27.field684) {
            class68.field1757.method62(class12.field290);
        } else {
            class68.field1757.method62(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class89.method753(var46, (byte) -66, var53);
            }
        }
        class111.method949(18645);
        class140.method1154(31);
        class122.field2977.method998(true);
        if (class142.field3507 != null) {
            class134.field3276.method869((byte) 11, 230);
            class84.field2089++;
            class134.field3276.method507(25135, 1057001181);
        }
        if (!class9.field226) {
            int var47 = (class54.field1294 - 6) / 8;
            int var48 = (class54.field1294 + 6) / 8;
            int var49 = (class82.field2040 + 6) / 8;
            int var50 = (class82.field2040 - 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var50 - 1; var52 <= var49 + 1; var52++) {
                    if (var51 < var47 || var51 > var48 || var50 > var52 || var49 < var52) {
                        class16.field410.method905(77, class20.method189(new class99[] { class91.field2222, class5.method31(var51, 10), class83.field2073, class5.method31(var52, 10) }, 50));
                        class16.field410.method905(116, class20.method189(new class99[] { class53.field1269, class5.method31(var51, 10), class83.field2073, class5.method31(var52, 10) }, 81));
                    }
                }
            }
        }
        if (class119.field2923 == -1) {
            class73.method663(30, (byte) 52);
        } else {
            class73.method663(35, (byte) 52);
        }
        class111.method949(18645);
        if (arg0 < -118) {
            class125.method1024((byte) 125);
            class134.field3276.method869((byte) 11, 63);
            class83.method718(0);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZIIIIIIIIBII)Z")
    public static final boolean method432(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var37 = 0; var37 < 104; var37++) {
                class69.field1780[var12][var37] = 0;
                class121.field2947[var12][var37] = 99999999;
            }
        }
        class69.field1780[arg8][arg2] = 99;
        class121.field2947[arg8][arg2] = 0;
        field1235++;
        int var13 = arg8;
        int var14 = arg2;
        byte var15 = 0;
        int var16 = 0;
        class127.field3075[var15] = arg8;
        int var38 = var15 + 1;
        class83.field2064[var15] = arg2;
        int var17 = 113 / ((arg9 - 53) / 35);
        int var18 = class127.field3075.length;
        int[][] var19 = class86.field2143[class84.field2116].field820;
        boolean var20 = false;
        while (var38 != var16) {
            var13 = class127.field3075[var16];
            var14 = class83.field2064[var16];
            var16 = (var16 + 1) % var18;
            if (arg7 == var13 && arg4 == var14) {
                var20 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class86.field2143[class84.field2116].method293(arg1, -107, arg4, var13, var14, arg10 - 1, arg7)) {
                    var20 = true;
                    break;
                }
                if (arg10 < 10 && class86.field2143[class84.field2116].method289(arg10 - 1, arg7, 8, var13, arg4, arg1, var14)) {
                    var20 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg5 != 0 && class86.field2143[class84.field2116].method294(var13, false, arg3, arg7, var14, arg5, arg6, arg4)) {
                var20 = true;
                break;
            }
            int var36 = class121.field2947[var13][var14] + 1;
            if (var13 > 0 && class69.field1780[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0) {
                class127.field3075[var38] = var13 - 1;
                class83.field2064[var38] = var14;
                var38 = (var38 + 1) % var18;
                class69.field1780[var13 - 1][var14] = 2;
                class121.field2947[var13 - 1][var14] = var36;
            }
            if (var13 < 103 && class69.field1780[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0) {
                class127.field3075[var38] = var13 + 1;
                class83.field2064[var38] = var14;
                class69.field1780[var13 + 1][var14] = 8;
                class121.field2947[var13 + 1][var14] = var36;
                var38 = (var38 + 1) % var18;
            }
            if (var14 > 0 && class69.field1780[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class127.field3075[var38] = var13;
                class83.field2064[var38] = var14 - 1;
                class69.field1780[var13][var14 - 1] = 1;
                var38 = (var38 + 1) % var18;
                class121.field2947[var13][var14 - 1] = var36;
            }
            if (var14 < 103 && class69.field1780[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class127.field3075[var38] = var13;
                class83.field2064[var38] = var14 + 1;
                class69.field1780[var13][var14 + 1] = 4;
                var38 = (var38 + 1) % var18;
                class121.field2947[var13][var14 + 1] = var36;
            }
            if (var13 > 0 && var14 > 0 && class69.field1780[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x128010E) == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class127.field3075[var38] = var13 - 1;
                class83.field2064[var38] = var14 - 1;
                var38 = (var38 + 1) % var18;
                class69.field1780[var13 - 1][var14 - 1] = 3;
                class121.field2947[var13 - 1][var14 - 1] = var36;
            }
            if (var13 < 103 && var14 > 0 && class69.field1780[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x1280183) == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class127.field3075[var38] = var13 + 1;
                class83.field2064[var38] = var14 - 1;
                class69.field1780[var13 + 1][var14 - 1] = 9;
                var38 = (var38 + 1) % var18;
                class121.field2947[var13 + 1][var14 - 1] = var36;
            }
            if (var13 > 0 && var14 < 103 && class69.field1780[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x1280138) == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class127.field3075[var38] = var13 - 1;
                class83.field2064[var38] = var14 + 1;
                var38 = (var38 + 1) % var18;
                class69.field1780[var13 - 1][var14 + 1] = 6;
                class121.field2947[var13 - 1][var14 + 1] = var36;
            }
            if (var13 < 103 && var14 < 103 && class69.field1780[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12801E0) == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class127.field3075[var38] = var13 + 1;
                class83.field2064[var38] = var14 + 1;
                var38 = (var38 + 1) % var18;
                class69.field1780[var13 + 1][var14 + 1] = 12;
                class121.field2947[var13 + 1][var14 + 1] = var36;
            }
        }
        class7.field206 = 0;
        if (!var20) {
            if (!arg0) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg7 - var23; var24 <= arg7 + var23; var24++) {
                for (int var25 = arg4 - var23; var25 <= arg4 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class121.field2947[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (var25 < arg4) {
                            var26 = arg4 - var25;
                        } else if (var25 > arg4 + arg5 - 1) {
                            var26 = var25 + 1 - arg4 - arg5;
                        }
                        if (var24 < arg7) {
                            var27 = arg7 - var24;
                        } else if (arg6 + arg7 - 1 < var24) {
                            var27 = var24 + 1 - arg7 - arg6;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && var22 > class121.field2947[var24][var25]) {
                            var14 = var25;
                            var21 = var28;
                            var22 = class121.field2947[var24][var25];
                            var13 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg8 == var13 && arg2 == var14) {
                return false;
            }
            class7.field206 = 1;
        }
        byte var29 = 0;
        class127.field3075[var29] = var13;
        int var39 = var29 + 1;
        class83.field2064[var29] = var14;
        int var30;
        int var31 = var30 = class69.field1780[var13][var14];
        while (arg8 != var13 || arg2 != var14) {
            if (var30 != var31) {
                var30 = var31;
                class127.field3075[var39] = var13;
                class83.field2064[var39++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var13++;
            } else if ((var31 & 0x8) != 0) {
                var13--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = class69.field1780[var13][var14];
        }
        if (var39 > 0) {
            int var32 = var39--;
            if (var32 > 25) {
                var32 = 25;
            }
            int var33 = class127.field3075[var39];
            int var34 = class83.field2064[var39];
            if (arg11 == 0) {
                class83.field2061++;
                class134.field3276.method869((byte) 11, 57);
                class134.field3276.method514((byte) 73, var32 + var32 + 3);
            }
            if (arg11 == 1) {
                class5.field107++;
                class134.field3276.method869((byte) 11, 13);
                class134.field3276.method514((byte) 73, var32 + var32 + 3 + 14);
            }
            if (arg11 == 2) {
                class134.field3276.method869((byte) 11, 11);
                class134.field3276.method514((byte) 73, var32 + var32 + 3);
                class68.field1746++;
            }
            class143.field3585 = class83.field2064[0];
            class69.field1765 = class127.field3075[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var39--;
                class134.field3276.method487(-1841901592, class127.field3075[var39] - var33);
                class134.field3276.method488(class83.field2064[var39] - var34, 0);
            }
            class134.field3276.method476(122, class67.field1712 + var33);
            class134.field3276.method488(class136.field3389[82] ? 1 : 0, 0);
            class134.field3276.method468(-1907964752, var34 + class5.field120);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
    public static void method433(byte arg0) {
        field1234 = null;
        field1255 = null;
        field1254 = null;
        field1253 = null;
        if (arg0 != -7) {
            field1236 = null;
        }
        field1256 = null;
        field1250 = null;
        field1236 = null;
        field1248 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lbf;")
    public static final class14 method434(int arg0, int arg1) {
        field1237++;
        class14 var2 = (class14) class27.field665.method997(arg1 ^ 0xFFFF9DCD, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class47.field1156.method903(13, (byte) -128, arg0);
        class14 var4 = new class14();
        if (arg1 != 25138) {
            field1252 = 60;
        }
        var4.field336 = arg0;
        if (var3 != null) {
            var4.method148(-83, new class57(var3));
        }
        class27.field665.method993((byte) 100, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(III)I")
    public static final int method435(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field1256 = null;
        }
        field1251++;
        if (arg0 >= 2) {
            int var3 = method435(arg0 >> 1, arg1 * arg1, -1);
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            return var3;
        } else if (arg0 == 1) {
            return arg1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IBI)Z")
    public static final boolean method436(int arg0, byte arg1, int arg2) {
        if (arg1 != -128) {
            field1234 = null;
        }
        field1245++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        class16 var3 = class83.method717(6, arg2);
        return var3.method160(arg0, true);
    }
}
