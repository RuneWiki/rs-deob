import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class133 {

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lrd;")
    private static class117 field3179 = class95.method812("Loaded interfaces", (byte) 8);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lrd;")
    public static class117 field3175 = field3179;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Lrd;")
    public static class117 field3180 = class95.method812(" )2> @yel@", (byte) 8);

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
    public static int[] field3189 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lrd;")
    public static class117 field3190 = class95.method812(" )2> @lre@", (byte) 8);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lrd;")
    public static class117 field3176 = class95.method812("leuchten1:", (byte) 8);

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static volatile int field3195 = -1;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Lrd;")
    public static class117 field3193 = class95.method812("Ung-Ultige Session)2ID)3", (byte) 8);

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lrd;")
    public static class117 field3188 = class95.method812("Verbindung mit", (byte) 8);

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lrd;")
    private static class117 field3187 = class95.method812("Loading )2 please wait)3", (byte) 8);

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Lrd;")
    public static class117 field3194 = field3187;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lra;")
    public static class114 field3178;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
    public static void method1087(boolean arg0) {
        field3194 = null;
        if (!arg0) {
            return;
        }
        field3176 = null;
        field3178 = null;
        field3187 = null;
        field3190 = null;
        field3180 = null;
        field3179 = null;
        field3175 = null;
        field3193 = null;
        field3189 = null;
        field3188 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method1088(byte[] arg0, boolean arg1) {
        if (arg1) {
            field3189 = null;
        }
        field3181++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class91.method797(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1089(int arg0, byte[] arg1) {
        field3184++;
        if (arg0 != 128) {
            field3179 = null;
        }
        class14 var2 = new class14(arg1);
        int var3 = var2.method153(true);
        int var4 = var2.method121((byte) 105);
        if (var4 < 0 || class96.field2404 != 0 && var4 > class96.field2404) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method139(255, var8, var4, 0);
            return var8;
        } else {
            int var5 = var2.method121((byte) 78);
            if (var5 < 0 || class96.field2404 != 0 && class96.field2404 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class29.method309(var6, var5, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var7 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var7.readFully(var6);
                    var7.close();
                } catch (IOException var9) {
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIBI)V")
    public static final void method1090(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 117) {
            method1092((byte) 70);
        }
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class14.field272[arg3][arg0 + var4][arg1 + var7] = 0;
            }
        }
        if (arg0 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class14.field272[arg3][arg0][arg1 + var5] = class14.field272[arg3][arg0 - 1][arg1 + var5];
            }
        }
        field3192++;
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class14.field272[arg3][arg0 + var6][arg1] = class14.field272[arg3][arg0 + var6][arg1 - 1];
            }
        }
        if (arg0 > 0 && class14.field272[arg3][arg0 - 1][arg1] != 0) {
            class14.field272[arg3][arg0][arg1] = class14.field272[arg3][arg0 - 1][arg1];
        } else if (arg1 > 0 && class14.field272[arg3][arg0][arg1 - 1] != 0) {
            class14.field272[arg3][arg0][arg1] = class14.field272[arg3][arg0][arg1 - 1];
        } else if (arg0 > 0 && arg1 > 0 && class14.field272[arg3][arg0 - 1][arg1 - 1] != 0) {
            class14.field272[arg3][arg0][arg1] = class14.field272[arg3][arg0 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIBI)I")
    public static final int method1091(int arg0, int arg1, byte arg2, int arg3) {
        field3186++;
        int var4 = arg3 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = -113 % ((78 - arg2) / 33);
        int var7 = arg3 & 0x7F;
        int var8 = arg0;
        if (arg0 < 3 && (class124.field3002[1][var4][var5] & 0x2) == 2) {
            var8 = arg0 + 1;
        }
        int var9 = (128 - var7) * class14.field272[var8][var4][var5 - -1] + class14.field272[var8][var4 + 1][var5 + 1] * var7 >> 7;
        int var10 = arg1 & 0x7F;
        int var11 = (128 - var7) * class14.field272[var8][var4][var5] + class14.field272[var8][var4 + 1][var5] * var7 >> 7;
        return (128 - var10) * var11 + var9 * var10 >> 7;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static final void method1092(byte arg0) {
        field3183++;
        while (class104.field2588.method740(arg0 ^ 0x4C, class17.field395) >= 11) {
            int var1 = class104.field2588.method741(11, arg0 - 49);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class93.field2340[var1] == null) {
                var2 = true;
                class93.field2340[var1] = new class101();
                if (class17.field435[var1] != null) {
                    class93.field2340[var1].method852((byte) 74, class17.field435[var1]);
                }
            }
            class137.field3292[class96.field2419++] = var1;
            class101 var3 = class93.field2340[var1];
            var3.field722 = class85.field2236;
            int var4 = class77.field2103[class104.field2588.method741(3, 27)];
            if (var2) {
                var3.field697 = var4;
            }
            int var5 = class104.field2588.method741(1, -92);
            int var6 = class104.field2588.method741(5, -75);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class104.field2588.method741(1, 119);
            if (var7 == 1) {
                class135.field3229[class47.field1329++] = var1;
            }
            int var8 = class104.field2588.method741(5, 124);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method267(class144.field3516.field708[0] + var6, class144.field3516.field739[0] + var8, -128, ~var5 == -2);
        }
        class104.field2588.method733((byte) -61);
        if (arg0 != 58) {
            field3180 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static final void method1093(byte arg0) {
        field3191++;
        int var1 = -1;
        if (class32.field955 == 0 && !class46.field1292) {
            class38.field1094++;
            client.method238(class66.field1878, class134.field3215, 0, 38, class121.field2961, 51, class17.field416);
        }
        int var2 = 82 / ((arg0 + 13) / 45);
        for (int var3 = 0; var3 < class28.field874; var3++) {
            int var4 = class28.field870[var3];
            int var5 = var4 >> 7 & 0x7F;
            int var6 = var4 >> 29 & 0x3;
            int var7 = var4 & 0x7F;
            int var8 = var4 >> 14 & 0x7FFF;
            if (var1 != var4) {
                var1 = var4;
                if (var6 == 2 && class90.field2308.method363(class120.field2940, var7, var5, var4) >= 0) {
                    class62 var9 = class147.method1191((byte) 118, var8);
                    if (var9.field1791 != null) {
                        var9 = var9.method635(-18710);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (class32.field955 == 1) {
                        client.method238(var5, class18.method193(new class117[] { class1.field29, class71.field1973, var9.field1735 }, 29), var4, -125, var7, 1, class21.field583);
                        class86.field2237++;
                    } else if (!class46.field1292) {
                        class35.field1027++;
                        class117[] var10 = var9.field1766;
                        if (class84.field2197) {
                            var10 = class94.method810(var10, (byte) -87);
                        }
                        if (var10 != null) {
                            for (int var11 = 4; var11 >= 0; var11--) {
                                if (var10[var11] != null) {
                                    class108.field2698++;
                                    short var12 = 0;
                                    if (var11 == 0) {
                                        var12 = 26;
                                    }
                                    if (var11 == 1) {
                                        var12 = 58;
                                    }
                                    if (var11 == 2) {
                                        var12 = 23;
                                    }
                                    if (var11 == 3) {
                                        var12 = 52;
                                    }
                                    if (var11 == 4) {
                                        var12 = 1002;
                                    }
                                    client.method238(var5, class18.method193(new class117[] { class97.field2427, var9.field1735 }, 76), var4, -127, var7, var12, var10[var11]);
                                }
                            }
                        }
                        client.method238(var5, class18.method193(new class117[] { class97.field2427, var9.field1735 }, 31), var9.field1739 << 14, -128, var7, 1006, class141.field3354);
                    } else if ((class84.field2201 & 0x4) == 4) {
                        class40.field1156++;
                        client.method238(var5, class18.method193(new class117[] { class57.field1589, class71.field1973, var9.field1735 }, 61), var4, -103, var7, 48, class37.field1085);
                    }
                }
                if (var6 == 1) {
                    class36 var13 = class93.field2334[var8];
                    if (var13.field1061.field397 == 1 && (var13.field717 & 0x7F) == 64 && (var13.field751 & 0x7F) == 64) {
                        for (int var14 = 0; var14 < class24.field678; var14++) {
                            class36 var17 = class93.field2334[class95.field2379[var14]];
                            if (var17 != null && var13 != var17 && var17.field1061.field397 == 1 && var13.field717 == var17.field717 && var13.field751 == var17.field751) {
                                class38.method454(var17.field1061, class95.field2379[var14], var5, var7, -4);
                            }
                        }
                        for (int var15 = 0; var15 < class96.field2419; var15++) {
                            class101 var16 = class93.field2340[class137.field3292[var15]];
                            if (var16 != null && var13.field717 == var16.field717 && var13.field751 == var16.field751) {
                                class100.method847(var16, class137.field3292[var15], var5, var7, 24515);
                            }
                        }
                    }
                    class38.method454(var13.field1061, var8, var5, var7, -4);
                }
                if (var6 == 0) {
                    class101 var18 = class93.field2340[var8];
                    if ((var18.field717 & 0x7F) == 64 && (var18.field751 & 0x7F) == 64) {
                        for (int var19 = 0; var19 < class24.field678; var19++) {
                            class36 var22 = class93.field2334[class95.field2379[var19]];
                            if (var22 != null && var22.field1061.field397 == 1 && var18.field717 == var22.field717 && var18.field751 == var22.field751) {
                                class38.method454(var22.field1061, class95.field2379[var19], var5, var7, -4);
                            }
                        }
                        for (int var20 = 0; var20 < class96.field2419; var20++) {
                            class101 var21 = class93.field2340[class137.field3292[var20]];
                            if (var21 != null && var18 != var21 && var18.field717 == var21.field717 && var18.field751 == var21.field751) {
                                class100.method847(var21, class137.field3292[var20], var5, var7, 24515);
                            }
                        }
                    }
                    class100.method847(var18, var8, var5, var7, 24515);
                }
                if (var6 == 3) {
                    class1 var23 = class105.field2631[class120.field2940][var7][var5];
                    if (var23 != null) {
                        for (class135 var24 = (class135) var23.method5((byte) -101); var24 != null; var24 = (class135) var23.method1((byte) -70)) {
                            class49 var25 = class108.method887(-1, var24.field3227);
                            if (class32.field955 == 1) {
                                class6.field141++;
                                client.method238(var5, class18.method193(new class117[] { class1.field29, field3190, var25.field1414 }, 23), var24.field3227, -128, var7, 47, class21.field583);
                            } else if (!class46.field1292) {
                                class117[] var26 = var25.field1394;
                                class84.field2186++;
                                if (class84.field2197) {
                                    var26 = class94.method810(var26, (byte) -87);
                                }
                                for (int var27 = 4; var27 >= 0; var27--) {
                                    if (var26 != null && var26[var27] != null) {
                                        class67.field1892++;
                                        byte var28 = 0;
                                        if (var27 == 0) {
                                            var28 = 12;
                                        }
                                        if (var27 == 1) {
                                            var28 = 53;
                                        }
                                        if (var27 == 2) {
                                            var28 = 3;
                                        }
                                        if (var27 == 3) {
                                            var28 = 40;
                                        }
                                        if (var27 == 4) {
                                            var28 = 10;
                                        }
                                        client.method238(var5, class18.method193(new class117[] { class40.field1159, var25.field1414 }, 107), var24.field3227, 82, var7, var28, var26[var27]);
                                    } else if (var27 == 2) {
                                        client.method238(var5, class18.method193(new class117[] { class40.field1159, var25.field1414 }, 93), var24.field3227, 53, var7, 3, class142.field3378);
                                        class38.field1103++;
                                    }
                                }
                                client.method238(var5, class18.method193(new class117[] { class40.field1159, var25.field1414 }, 108), var24.field3227, 90, var7, 1003, class141.field3354);
                            } else if ((class84.field2201 & 0x1) == 1) {
                                field3182++;
                                client.method238(var5, class18.method193(new class117[] { class57.field1589, field3190, var25.field1414 }, 55), var24.field3227, 29, var7, 18, class37.field1085);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILwa;Lwa;BI)Lwa;")
    public static final class144 method1094(int arg0, class144 arg1, class144 arg2, byte arg3, int arg4) {
        if (arg3 != -18) {
            return null;
        }
        class144 var5 = class99.method844(arg2.field3437, arg0, 0, arg2.field3457, arg4, class77.field2090[arg2.field3441 >> 16], arg2.field3441, arg2.field3490, arg2.field3543, arg3 ^ 0x11, arg1, 0);
        field3185++;
        if (var5 == null) {
            if (arg2.field3448 != null) {
                var5 = class99.method844(arg2.field3437, arg0, 0, arg2.field3457, arg4, arg2.field3448, arg2.field3441, arg2.field3490, arg2.field3543, arg3 + 17, arg1, 0);
            }
            return var5;
        } else {
            return var5;
        }
    }
}
