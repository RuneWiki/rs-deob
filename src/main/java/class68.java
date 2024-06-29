import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class68 {

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public int field1268 = -1;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field1262 = -1;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Z")
    public static boolean field1254 = true;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "[[Z")
    public static boolean[][] field1261 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field1269 = 0;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field1263 = 0;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "[I")
    public static int[] field1272 = new int[32];

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field1270 = 0;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "F")
    public static float field1266;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "F")
    public static float field1267;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public int field1257;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "[[S")
    public static short[][] field1255;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method526(boolean arg0) {
        field1260++;
        class107 var1 = (class107) class123.field2165.method431(0);
        if (arg0) {
            return;
        }
        while (var1 != null) {
            if (var1.field1940 > 0) {
                var1.field1940--;
            }
            if (var1.field1940 != 0) {
                if (var1.field1951 > 0) {
                    var1.field1951--;
                }
                if (var1.field1951 == 0 && var1.field1944 >= 1 && var1.field1936 >= 1 && var1.field1944 <= 102 && var1.field1936 <= 102 && (var1.field1942 < 0 || class88.method677((byte) -110, var1.field1942, var1.field1939))) {
                    class272.method1924(var1.field1948, var1.field1936, var1.field1950, var1.field1944, var1.field1939, (byte) 111, var1.field1952, var1.field1942);
                    var1.field1951 = -1;
                    if (var1.field1947 == var1.field1942 && var1.field1947 == -1) {
                        var1.method535(-2801);
                    } else if (var1.field1947 == var1.field1942 && var1.field1949 == var1.field1948 && var1.field1941 == var1.field1939) {
                        var1.method535(-2801);
                    }
                }
            } else if (var1.field1947 < 0 || class88.method677((byte) -111, var1.field1947, var1.field1941)) {
                class272.method1924(var1.field1949, var1.field1936, var1.field1950, var1.field1944, var1.field1941, (byte) -119, var1.field1952, var1.field1947);
                var1.method535(-2801);
            }
            var1 = (class107) class123.field2165.method439(-28512);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 70)
    public static final void method527(byte arg0) {
        int var1 = 25 % ((-arg0 - 56) / 47);
        field1252++;
        if (class240.field3991 != null || class323.field5231 != null || class347.field5535 > 0) {
            return;
        }
        int var2 = class325.field5246;
        if (!class5.field87) {
            if (var2 == 1 && class137.field2343 > 0) {
                short var3 = class107.field1938[class137.field2343 - 1];
                if (var3 == 23 || var3 == 26 || var3 == 51 || var3 == 29 || var3 == 58 || var3 == 48 || var3 == 9 || var3 == 60 || var3 == 8 || var3 == 49 || var3 == 44 || var3 == 1001) {
                    int var4 = class206.field3450[class137.field2343 - 1];
                    int var5 = class317.field5172[class137.field2343 - 1];
                    class181 var6 = class224.method1564(-121, var5);
                    class340 var7 = client.method1990(var6);
                    if (var7.method2400((byte) -59) || var7.method2404(-21377)) {
                        class34.field756 = false;
                        class88.field1535 = 0;
                        if (class240.field3991 != null) {
                            class52.method459(128, class240.field3991);
                        }
                        class240.field3991 = class224.method1564(-116, var5);
                        class55.field1087 = class37.field807;
                        class127.field2226 = class303.field4931;
                        class55.field1096 = var4;
                        class52.method459(128, class240.field3991);
                        return;
                    }
                }
            }
            if (var2 == 1 && (class301.field4895 == 1 && class137.field2343 > 2 || class348.method2492(class137.field2343 - 1, -124))) {
                var2 = 2;
            }
            if (var2 == 2 && class137.field2343 > 0 || class200.field3356 == 1) {
                class282.method2007((byte) -13);
            }
            if (var2 == 1 && class137.field2343 > 0 || class200.field3356 == 2) {
                class99.method751((byte) 116);
            }
            return;
        }
        if (var2 != 1) {
            int var8 = class73.field1339;
            int var9 = class26.field662;
            if (var8 < class137.field2340 - 10 || var8 > class278.field4528 + class137.field2340 + 10 || var9 < (class351.field5616 - 10) || var9 > (class351.field5616 - (-class232.field3802 - 10))) {
                class5.field87 = false;
                class127.method906(class232.field3802, class351.field5616, class137.field2340, class278.field4528, 0);
            }
        }
        if (var2 != 1) {
            return;
        }
        int var10 = class137.field2340;
        int var11 = class351.field5616;
        int var12 = class278.field4528;
        int var13 = -1;
        int var14 = class303.field4931;
        int var15 = class37.field807;
        for (int var16 = 0; var16 < class137.field2343; var16++) {
            if (class170.field2807) {
                int var17 = (class137.field2343 - var16 - 1) * 15 + var11 + 33;
                if (var15 > var10 && (var10 + var12) > var15 && (var17 - 13) < var14 && var17 + 3 > var14) {
                    var13 = var16;
                }
            } else {
                int var18 = (class137.field2343 - var16 - 1) * 15 + var11 + 31;
                if (var10 < var15 && var15 < (var10 + var12) && var18 - 13 < var14 && var14 < var18 + 3) {
                    var13 = var16;
                }
            }
        }
        if (var13 != -1) {
            class222.method1556((byte) 6, var13);
        }
        class5.field87 = false;
        class127.method906(class232.field3802, class351.field5616, class137.field2340, class278.field4528, 0);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 217)
    public static void method528(byte arg0) {
        field1272 = null;
        field1255 = (short[][]) null;
        field1261 = (boolean[][]) null;
        if (arg0 >= -78) {
            method527((byte) 50);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)I", line = 247)
    public static final int method529(int arg0, int arg1, int arg2) {
        if (arg0 != 3) {
            field1261 = (boolean[][]) ((boolean[][]) null);
        }
        field1251++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 290)
    public static final void method530(int arg0) {
        if (arg0 != 0) {
            field1269 = -125;
        }
        field1258++;
        class216.field3591 = new class328(32);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Lbn;", line = 302)
    public static final class75 method531(int arg0) {
        field1256++;
        int var1 = class9.field284[0] * class76.field1367[0];
        byte[] var2 = class309.field5053[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class323.field5225[class83.method613(var2[var4], 255)];
        }
        if (arg0 != 29121) {
            return (class75) null;
        }
        class75 var5;
        if (class241.field4016) {
            var5 = new class265(class91.field1617, class12.field368, class321.field5218[0], class232.field3804[0], class9.field284[0], class76.field1367[0], var3);
        } else {
            var5 = new class288(class91.field1617, class12.field368, class321.field5218[0], class232.field3804[0], class9.field284[0], class76.field1367[0], var3);
        }
        class213.method1470(false);
        return var5;
    }
}
