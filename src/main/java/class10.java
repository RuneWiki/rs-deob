import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 extends class134 {

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field239 = 0;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "Lwd;")
    public static class150 field232 = class2.method9(true, "0(U");

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "Lwd;")
    private static class150 field233 = class2.method9(true, "Loaded textures");

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "Lwd;")
    public static class150 field242 = class2.method9(true, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "Lwd;")
    public static class150 field237 = field233;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "J")
    public static volatile long field244 = 0L;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    public static int field246 = 0;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "Lwd;")
    public static class150 field236 = class2.method9(true, "sideicons");

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "Lwd;")
    public static class150 field248 = class2.method9(true, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field234 = 0;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "[I")
    public static int[] field251 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public int field238;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "Lue;")
    public static class139 field243;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "[[B")
    public static byte[][] field250;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public static final void method59(int arg0) {
        class40.method289(false, false);
        field239 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class9.field222.length; var2++) {
            if (class137.field3216[var2] != -1 && class9.field222[var2] == null) {
                class9.field222[var2] = class9.field201.method315(0, true, class137.field3216[var2]);
                if (class9.field222[var2] == null) {
                    field239++;
                    var1 = false;
                }
            }
            if (class80.field1948[var2] != -1 && class108.field2488[var2] == null) {
                class108.field2488[var2] = class9.field201.method302(0, class80.field1948[var2], class24.field685[var2], 0);
                if (class108.field2488[var2] == null) {
                    field239++;
                    var1 = false;
                }
            }
        }
        field245++;
        if (!var1) {
            class127.field2997 = 1;
            return;
        }
        class144.field3468 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class9.field222.length; var4++) {
            byte[] var56 = class108.field2488[var4];
            if (var56 != null) {
                int var57 = (class125.field2889[var4] >> 8) * 64 - class66.field1686;
                int var58 = (class125.field2889[var4] & 0xFF) * 64 - class77.field1905;
                if (class2.field20) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class34.method263(var56, var58, -87, var57);
            }
        }
        if (!var3) {
            class127.field2997 = 2;
            return;
        }
        if (class127.field2997 != 0) {
            class24.method195(false, class103.field2331, class98.field2248, true);
        }
        class41.method294(-2607);
        class83.method601((byte) 38);
        class41.method294(-2607);
        class111.field2548.method929();
        class41.method294(-2607);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class18.field477[var5].method622((byte) 75);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class131.field3097[var6][var54][var55] = 0;
                }
            }
        }
        class41.method294(-2607);
        class49.method365(24369);
        int var7 = class9.field222.length;
        class24.method199(arg0 ^ 0x24AA);
        class40.method289(false, true);
        if (!class2.field20) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class125.field2889[var8] >> 8) * 64 - class66.field1686;
                int var18 = (class125.field2889[var8] & 0xFF) * 64 - class77.field1905;
                byte[] var19 = class9.field222[var8];
                if (var19 != null) {
                    class41.method294(-2607);
                    class127.method963(var17, (class142.field3441 - 6) * 8, true, var19, var18, (class92.field2144 - 6) * 8, class18.field477);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class125.field2889[var9] >> 8) * 64 - class66.field1686;
                int var15 = (class125.field2889[var9] & 0xFF) * 64 - class77.field1905;
                byte[] var16 = class9.field222[var9];
                if (var16 == null && class92.field2144 < 800) {
                    class41.method294(-2607);
                    class47.method355(var14, var15, 64, 64, (byte) -120);
                }
            }
            class40.method289(false, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class108.field2488[var10];
                if (var11 != null) {
                    int var12 = (class125.field2889[var10] >> 8) * 64 - class66.field1686;
                    int var13 = (class125.field2889[var10] & 0xFF) * 64 - class77.field1905;
                    class41.method294(arg0 ^ 0xFFFFD149);
                    class83.method603(var12, class18.field477, var13, arg0 ^ 0x2498, var11, class111.field2548);
                }
            }
        }
        if (class2.field20) {
            for (int var20 = 0; var20 < 4; var20++) {
                class41.method294(arg0 ^ 0xFFFFD149);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class40.field1052[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 1 & 0x3;
                            int var39 = var37 >> 24 & 0x3;
                            int var40 = var37 >> 14 & 0x3FF;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class125.field2889.length; var43++) {
                                if (class125.field2889[var43] == var42 && class9.field222[var43] != null) {
                                    var36 = true;
                                    class150.method1177(var34 * 8, var38, class9.field222[var43], var20, (var41 & 0x7) * 8, (var40 & 0x7) * 8, 40, var39, var35 * 8, class18.field477);
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class105.method725(var20, 92, var35 * 8, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class40.field1052[0][var21][var32];
                    if (var33 == -1) {
                        class47.method355(var21 * 8, var32 * 8, 8, 8, (byte) -116);
                    }
                }
            }
            class40.method289(false, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class41.method294(arg0 ^ 0xFFFFD149);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class40.field1052[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + (var29 / 8);
                            for (int var31 = 0; var31 < class125.field2889.length; var31++) {
                                if (class125.field2889[var31] == var30 && class108.field2488[var31] != null) {
                                    class118.method859(var26, class108.field2488[var31], (var29 & 0x7) * 8, var24 * 8, class111.field2548, (var28 & 0x7) * 8, class18.field477, var27, false, var23 * 8, var22);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class40.method289(false, true);
        class83.method601((byte) 38);
        class41.method294(arg0 - 11975);
        client.method173(class111.field2548, (byte) -86, class18.field477);
        class40.method289(false, true);
        int var44 = class136.field3191;
        if (class17.field466 < var44) {
            var44 = class17.field466;
        }
        if (arg0 != 9368) {
            method62(true);
        }
        if (var44 < class17.field466 - 1) {
            int var45 = class17.field466 - 1;
        }
        if (class20.field517) {
            class111.field2548.method895(class136.field3191);
        } else {
            class111.field2548.method895(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class103.method701(var46, var53, arg0 ^ 0xFFFFDB14);
            }
        }
        class41.method294(-2607);
        class47.method352(121);
        class26.field798.method431(0);
        if (class40.field1064 != null) {
            class143.field3451.method965(true, 173);
            class143.field3451.method1122((byte) 32, 1057001181);
            class146.field3539++;
        }
        if (!class2.field20) {
            int var47 = (class142.field3441 - 6) / 8;
            int var48 = (class92.field2144 - 6) / 8;
            int var49 = (class142.field3441 + 6) / 8;
            int var50 = (class92.field2144 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var49 + 1; var51++) {
                for (int var52 = var48 - 1; var52 <= var50 + 1; var52++) {
                    if (var51 < var47 || var51 > var49 || var52 < var48 || var52 > var50) {
                        class9.field201.method312(class111.method786((byte) -106, new class150[] { class37.field1005, class29.method239(1000, var51), class126.field2903, class29.method239(1000, var52) }), arg0 - 9481);
                        class9.field201.method312(class111.method786((byte) 14, new class150[] { class105.field2373, class29.method239(1000, var51), class126.field2903, class29.method239(1000, var52) }), -96);
                    }
                }
            }
        }
        if (class108.field2450 == -1) {
            class11.method66(30, false);
        } else {
            class11.method66(35, false);
        }
        class41.method294(-2607);
        class146.method1094(true);
        class143.field3451.method965(true, 186);
        class135.method1008(67);
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V")
    public static void method60(byte arg0) {
        field248 = null;
        field236 = null;
        field232 = null;
        field250 = null;
        if (arg0 >= -68) {
            method60((byte) 110);
        }
        field233 = null;
        field251 = null;
        field237 = null;
        field242 = null;
        field243 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lwb;IB)V")
    private final void method61(class148 arg0, int arg1, byte arg2) {
        if (arg2 >= -108) {
            method59(108);
        }
        if (arg1 == 1) {
            this.field238 = arg0.method1140(-1);
            this.field240 = arg0.method1137(255);
            this.field235 = arg0.method1137(255);
        }
        field249++;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
    public static final void method62(boolean arg0) {
        field241++;
        for (class54 var1 = (class54) class107.field2432.method702((byte) -121); var1 != null; var1 = (class54) class107.field2432.method698(-1610612736)) {
            if (var1.field1425 > 0) {
                var1.field1425--;
            }
            if (var1.field1425 != 0) {
                if (var1.field1432 > 0) {
                    var1.field1432--;
                }
                if (var1.field1432 == 0 && var1.field1429 >= 1 && var1.field1414 >= 1 && var1.field1429 <= 102 && var1.field1414 <= 102 && (var1.field1430 < 0 || class97.method674(true, var1.field1424, var1.field1430))) {
                    class21.method159(var1.field1431, var1.field1414, var1.field1422, var1.field1430, var1.field1429, var1.field1420, var1.field1424, -117);
                    var1.field1432 = -1;
                    if (var1.field1430 == var1.field1421 && var1.field1421 == -1) {
                        var1.method678((byte) -26);
                    } else if (var1.field1430 == var1.field1421 && var1.field1427 == var1.field1420 && var1.field1424 == var1.field1423) {
                        var1.method678((byte) -26);
                    }
                }
            } else if (var1.field1421 < 0 || class97.method674(true, var1.field1423, var1.field1421)) {
                class21.method159(var1.field1431, var1.field1414, var1.field1422, var1.field1421, var1.field1429, var1.field1427, var1.field1423, -111);
                var1.method678((byte) -26);
            }
        }
        if (!arg0) {
            method60((byte) -31);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILwb;)V")
    public final void method63(int arg0, class148 arg1) {
        field247++;
        if (arg0 != 255) {
            this.method61(null, -90, (byte) -89);
        }
        while (true) {
            int var3 = arg1.method1137(arg0);
            if (var3 == 0) {
                return;
            }
            this.method61(arg1, var3, (byte) -111);
        }
    }
}
