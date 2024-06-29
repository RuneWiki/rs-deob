import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class73 extends class119 {

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "Lai;")
    public static class10 field1247 = class44.method278("Schrifts-=tze geladen)3", -16);

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field1249 = 0;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "Lai;")
    public static class10 field1248 = class44.method278("l", 98);

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Lai;")
    private static class10 field1245 = class44.method278("We suspect someone knows your password)3", 95);

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "Lai;")
    public static class10 field1260 = field1245;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "[I")
    public int[] field1251;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "[I")
    public int[] field1254;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "[I")
    public int[] field1261;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "[Lca;")
    public class22[] field1258;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "[Lca;")
    public class22[] field1259;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "[[[B")
    public byte[][][] field1246;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(Z)[Lta;")
    public static final class173[] method456(boolean arg0) {
        field1253++;
        class173[] var1 = new class173[class37.field586];
        for (int var2 = 0; var2 < class37.field586; var2++) {
            class173 var3 = new class173();
            var3.field3339 = class184.field3500;
            var3.field3337 = class144.field2754;
            var3.field3340 = class87.field1547[var2];
            var3.field3343 = class18.field263[var2];
            var3.field3341 = class100.field1857[var2];
            var3.field3342 = class145.field2781[var2];
            var3.field3344 = class140.field2639;
            var3.field3338 = class189.field3615[var2];
            var1[var2] = var3;
        }
        if (arg0) {
            method460(102, 0, (byte) 91);
        }
        class56.method383(-91);
        return var1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V")
    public static final void method457(int arg0, int arg1, int arg2, int arg3) {
        field1252++;
        class67.method441(-1);
        class62.method409(arg2, arg0, class101.field1905.field3341 + arg2, class101.field1905.field3342 + arg0);
        if (arg3 != 5824) {
            field1247 = null;
        }
        if (class126.field2404 == 2 || class126.field2404 == 5) {
            class62.method402(arg2 + 25, arg0 - -5, 0, class168.field3244, class71.field1226);
        } else {
            int var4 = class145.field2767.field1100 / 32 + 48;
            int var5 = class171.field3316 + class53.field950 & 0x7FF;
            int var6 = 464 - class145.field2767.field1097 / 32;
            class67.field1172.method121(arg2 + 25, arg0 + 5, 146, 151, var4, var6, var5, class42.field698 + 256, class168.field3244, class71.field1226);
            for (int var7 = 0; var7 < class84.field1465; var7++) {
                int var37 = class44.field725[var7] * 4 + 2 - class145.field2767.field1100 / 32;
                int var38 = class65.field1103[var7] * 4 + 2 - class145.field2767.field1097 / 32;
                class180.method1163(class169.field3252[var7], arg2, var37, var38, arg0, (byte) 44);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class192 var34 = class33.field508[class42.field687][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class145.field2767.field1100 / 32;
                        int var36 = var33 * 4 + 2 - class145.field2767.field1097 / 32;
                        class180.method1163(class191.field3625[0], arg2, var35, var36, arg0, (byte) 44);
                    }
                }
            }
            for (int var9 = 0; var9 < class93.field1690; var9++) {
                class125 var29 = class168.field3249[class166.field3187[var9]];
                if (var29 != null && var29.method250((byte) 33)) {
                    class188 var30 = var29.field2386;
                    if (var30 != null && var30.field3596 != null) {
                        var30 = var30.method1208((byte) 68);
                    }
                    if (var30 != null && var30.field3561 && var30.field3602) {
                        int var31 = var29.field1100 / 32 - class145.field2767.field1100 / 32;
                        int var32 = var29.field1097 / 32 - class145.field2767.field1097 / 32;
                        class180.method1163(class191.field3625[1], arg2, var31, var32, arg0, (byte) 44);
                    }
                }
            }
            for (int var10 = 0; var10 < class189.field3616; var10++) {
                class38 var21 = class2.field10[class174.field3355[var10]];
                if (var21 != null && var21.method250((byte) 104)) {
                    int var22 = var21.field1100 / 32 - class145.field2767.field1100 / 32;
                    boolean var23 = false;
                    int var24 = var21.field1097 / 32 - class145.field2767.field1097 / 32;
                    long var25 = var21.field602.method62((byte) -124);
                    for (int var27 = 0; var27 < class124.field2380; var27++) {
                        if (class115.field2205[var27] == var25 && class47.field795[var27] != 0) {
                            var23 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class145.field2767.field599 != 0 && var21.field599 != 0 && class145.field2767.field599 == var21.field599) {
                        var28 = true;
                    }
                    if (var23) {
                        class180.method1163(class191.field3625[3], arg2, var22, var24, arg0, (byte) 44);
                    } else if (var28) {
                        class180.method1163(class191.field3625[4], arg2, var22, var24, arg0, (byte) 44);
                    } else {
                        class180.method1163(class191.field3625[2], arg2, var22, var24, arg0, (byte) 44);
                    }
                }
            }
            if (class74.field1274 != 0 && class120.field2304 % 20 < 10) {
                if (class74.field1274 == 1 && class175.field3361 >= 0 && class168.field3249.length > class175.field3361) {
                    class125 var11 = class168.field3249[class175.field3361];
                    if (var11 != null) {
                        int var12 = var11.field1100 / 32 - class145.field2767.field1100 / 32;
                        int var13 = var11.field1097 / 32 - class145.field2767.field1097 / 32;
                        class192.method1229(class200.field3839[1], arg0, var12, 256, arg2, var13);
                    }
                }
                if (class74.field1274 == 2) {
                    int var14 = (class71.field1228 - class2.field16) * 4 + 2 - class145.field2767.field1100 / 32;
                    int var15 = (class203.field3952 - class200.field3767) * 4 + 2 - class145.field2767.field1097 / 32;
                    class192.method1229(class200.field3839[1], arg0, var14, 256, arg2, var15);
                }
                if (class74.field1274 == 10 && class5.field66 >= 0 && class2.field10.length > class5.field66) {
                    class38 var16 = class2.field10[class5.field66];
                    if (var16 != null) {
                        int var17 = var16.field1100 / 32 - class145.field2767.field1100 / 32;
                        int var18 = var16.field1097 / 32 - class145.field2767.field1097 / 32;
                        class192.method1229(class200.field3839[1], arg0, var17, 256, arg2, var18);
                    }
                }
            }
            if (class169.field3270 != 0) {
                int var19 = class169.field3270 * 4 + 2 - class145.field2767.field1100 / 32;
                int var20 = class120.field2314 * 4 + 2 - class145.field2767.field1097 / 32;
                class180.method1163(class200.field3839[0], arg2, var19, var20, arg0, (byte) 44);
            }
            class62.method412(arg2 + 4 + 93, arg0 + 82 + -4, 3, 3, 16777215);
        }
        if (class126.field2404 >= 3) {
            class62.method402(arg2, arg0, 0, class95.field1752, class135.field2526);
        } else {
            class109.field2037.method121(arg2, arg0, 33, 33, 25, 25, class171.field3316, 256, class95.field1752, class135.field2526);
        }
        if (class42.field702[arg1]) {
            class101.field1905.method1134(arg2, arg0);
        }
        class152.field2919[arg1] = true;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static void method458(int arg0) {
        field1247 = null;
        field1248 = null;
        if (arg0 != -1) {
            field1248 = null;
        }
        field1245 = null;
        field1260 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static final void method459(byte arg0) {
        int var1 = -21 / ((arg0 + 18) / 49);
        if (class104.field1953 > 0) {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class104.field1953 > 768) {
                    class77.field1360[var4] = class42.method268(class50.field894[var4], 1024 - class104.field1953, (byte) 120, class18.field262[var4]);
                } else if (class104.field1953 > 256) {
                    class77.field1360[var4] = class18.field262[var4];
                } else {
                    class77.field1360[var4] = class42.method268(class18.field262[var4], 256 - class104.field1953, (byte) 124, class50.field894[var4]);
                }
            }
        } else if (class95.field1753 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class77.field1360[var2] = class50.field894[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class95.field1753 > 768) {
                    class77.field1360[var3] = class42.method268(class50.field894[var3], 1024 - class95.field1753, (byte) 123, class18.field264[var3]);
                } else if (class95.field1753 > 256) {
                    class77.field1360[var3] = class18.field264[var3];
                } else {
                    class77.field1360[var3] = class42.method268(class18.field264[var3], 256 - class95.field1753, (byte) 60, class50.field894[var3]);
                }
            }
        }
        short var5 = 256;
        int var6 = 0;
        int var7 = class146.field2791.field257 * 9;
        field1257++;
        int var8 = 0;
        for (int var9 = 1; var9 < var5 - 1; var9++) {
            int var22 = (var5 - var9) * class137.field2573[var9] / var5 + 22;
            if (var22 < 0) {
                var22 = 0;
            }
            var6 += var22;
            for (int var23 = var22; var23 < 128; var23++) {
                int var25 = class46.field763[var6++];
                int var26 = class146.field2791.field258[var7++];
                if (var25 == 0) {
                    class133.field2501.field258[var8++] = var26;
                } else {
                    int var28 = 256 - var25;
                    int var29 = class77.field1360[var25];
                    class133.field2501.field258[var8++] = class123.method861(-16711936, var25 * class123.method861(var29, 16711935) + class123.method861(var26, 16711935) * var28) + class123.method861(class123.method861(var26, 65280) * var28 + var25 * class123.method861(65280, var29), 16711680) >> 8;
                }
            }
            for (int var24 = 0; var24 < var22; var24++) {
                class133.field2501.field258[var8++] = class146.field2791.field258[var7++];
            }
            var7 += class146.field2791.field257 - 128;
        }
        int var10 = 0;
        int var11 = 0;
        class133.field2501.method97(0, 9);
        int var12 = class146.field2791.field257 * 9 + 128;
        for (int var13 = 1; var13 < var5 - 1; var13++) {
            int var14 = (var5 - var13) * class137.field2573[var13] / var5 + 22;
            if (var14 < 0) {
                var14 = 0;
            }
            for (int var15 = 0; var15 < var14; var15++) {
                int var10001 = var11++;
                var12--;
                class37.field589.field258[var10001] = class146.field2791.field258[var12];
            }
            for (int var16 = var14; var16 < 128; var16++) {
                var12--;
                int var17 = class146.field2791.field258[var12];
                int var18 = class46.field763[var10++];
                if (var18 == 0) {
                    class37.field589.field258[var11++] = var17;
                } else {
                    int var19 = 256 - var18;
                    int var21 = class77.field1360[var18];
                    class37.field589.field258[var11++] = class123.method861(var18 * class123.method861(65280, var21) + var19 * class123.method861(var17, 65280), 16711680) + class123.method861(class123.method861(var21, 16711935) * var18 + class123.method861(var17, 16711935) * var19, -16711936) >> 8;
                }
            }
            var12 += class146.field2791.field257 + 128;
            var10 += var14;
        }
        class37.field589.method97(637, 9);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIB)V")
    public static final void method460(int arg0, int arg1, byte arg2) {
        if (arg2 == -110) {
            field1250++;
            if (class42.method270(arg1, (byte) -93)) {
                class124.method864(class205.field3990[arg1], arg0, 120);
            }
        }
    }
}
