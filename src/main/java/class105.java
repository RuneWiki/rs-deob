import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class105 extends class58 {

    @OriginalMember(owner = "client!sa", name = "Cb", descriptor = "I")
    private int field2228;

    @OriginalMember(owner = "client!sa", name = "Jb", descriptor = "I")
    private int field2235;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
    private int field2207;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
    private int field2206;

    @OriginalMember(owner = "client!sa", name = "vb", descriptor = "I")
    private int field2221;

    @OriginalMember(owner = "client!sa", name = "pb", descriptor = "I")
    private int field2215;

    @OriginalMember(owner = "client!sa", name = "Eb", descriptor = "I")
    private int field2230;

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "Lf;")
    private class31 field2213;

    @OriginalMember(owner = "client!sa", name = "ob", descriptor = "I")
    private int field2214;

    @OriginalMember(owner = "client!sa", name = "rb", descriptor = "I")
    private int field2217;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "Lo;")
    public static class84 field2205 = class15.method124("Loaded update list", 255);

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "Lo;")
    public static class84 field2209 = class15.method124("Please try using a different world)3", 255);

    @OriginalMember(owner = "client!sa", name = "sb", descriptor = "[B")
    public static byte[] field2218 = new byte[520];

    @OriginalMember(owner = "client!sa", name = "tb", descriptor = "Lo;")
    public static class84 field2219 = class15.method124(" with @lre@", 255);

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "Lo;")
    public static class84 field2208 = class15.method124("Unexpected server response: ", 255);

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "Lo;")
    public static class84 field2211 = class15.method124("RuneScape has been updated(Q", 255);

    @OriginalMember(owner = "client!sa", name = "zb", descriptor = "I")
    public static int field2225 = 0;

    @OriginalMember(owner = "client!sa", name = "Fb", descriptor = "Lo;")
    public static class84 field2231 = class15.method124("", 255);

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "Lo;")
    public static class84 field2210 = field2231;

    @OriginalMember(owner = "client!sa", name = "Ab", descriptor = "Lo;")
    public static class84 field2226 = field2231;

    @OriginalMember(owner = "client!sa", name = "Kb", descriptor = "I")
    public static int field2236 = 0;

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "Lo;")
    public static class84 field2212 = field2231;

    @OriginalMember(owner = "client!sa", name = "yb", descriptor = "Lo;")
    public static class84 field2224 = field2231;

    @OriginalMember(owner = "client!sa", name = "qb", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!sa", name = "ub", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!sa", name = "xb", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!sa", name = "Bb", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!sa", name = "Db", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!sa", name = "Gb", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!sa", name = "Hb", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!sa", name = "Ib", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!sa", name = "wb", descriptor = "[[I")
    public static int[][] field2222;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)Lne;", line = 34)
    public final class83 method471(byte arg0) {
        field2216++;
        if (this.field2213 != null) {
            int var2 = class128.field2837 - this.field2217;
            if (var2 > 100 && this.field2213.field620 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (this.field2213.field628[this.field2214] >= var2) {
                            break label42;
                        }
                        var2 -= this.field2213.field628[this.field2214];
                        this.field2214++;
                    } while (this.field2213.field612.length > this.field2214);
                    this.field2214 -= this.field2213.field620;
                } while (this.field2214 >= 0 && this.field2213.field612.length > this.field2214);
                this.field2213 = null;
            }
            this.field2217 = class128.field2837 - var2;
        }
        class49 var3 = class110.method856((byte) -119, this.field2230);
        if (var3.field1041 != null) {
            var3 = var3.method415(false);
        }
        if (arg0 != 3) {
            method777(false);
        }
        return var3 == null ? null : var3.method426(this.field2206, this.field2221, this.field2215, this.field2213, this.field2207, this.field2214, this.field2235, this.field2228, (byte) -92);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V", line = 85)
    public static void method777(boolean arg0) {
        field2209 = null;
        field2224 = null;
        field2218 = null;
        field2222 = null;
        field2210 = null;
        if (!arg0) {
            method781((byte) -87);
        }
        field2226 = null;
        field2205 = null;
        field2211 = null;
        field2219 = null;
        field2212 = null;
        field2231 = null;
        field2208 = null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIII)I", line = 107)
    public static final int method778(int arg0, int arg1, int arg2, int arg3) {
        field2223++;
        int var4 = arg3 >> 7;
        int var5 = arg1 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg0;
        if (arg2 > arg0 && (class73.field1544[1][var5][var4] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg3 & 0x7F;
        int var9 = (128 - var7) * class110.field2377[var6][var5][var4] + class110.field2377[var6][var5 + 1][var4] * var7 >> 7;
        int var10 = (128 - var7) * class110.field2377[var6][var5][var4 - -1] + class110.field2377[var6][var5 + 1][var4 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[B)V", line = 144)
    public static final void method779(int arg0, byte[] arg1) {
        field2233++;
        class27 var2 = new class27(arg1);
        var2.field482 = arg1.length - 2;
        class36.field716 = var2.method227(127);
        class110.field2385 = new byte[class36.field716][];
        class78.field1668 = new int[class36.field716];
        class116.field2543 = new int[class36.field716];
        class24.field397 = new int[class36.field716];
        class101.field2156 = new int[class36.field716];
        var2.field482 = arg1.length - class36.field716 * 8 - 7;
        class51.field1098 = var2.method227(127);
        class125.field2768 = var2.method227(127);
        int var3 = (var2.method231(arg0 ^ 0xFF) & 0xFF) + 1;
        for (int var4 = 0; var4 < class36.field716; var4++) {
            class101.field2156[var4] = var2.method227(127);
        }
        for (int var5 = 0; var5 < class36.field716; var5++) {
            class116.field2543[var5] = var2.method227(127);
        }
        for (int var6 = 0; var6 < class36.field716; var6++) {
            class78.field1668[var6] = var2.method227(127);
        }
        for (int var7 = arg0; var7 < class36.field716; var7++) {
            class24.field397[var7] = var2.method227(127);
        }
        var2.field482 = arg1.length - (var3 - 1) * 3 - class36.field716 * 8 - 7;
        class25.field432 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class25.field432[var8] = var2.method241(2);
            if (class25.field432[var8] == 0) {
                class25.field432[var8] = 1;
            }
        }
        var2.field482 = 0;
        for (int var9 = 0; var9 < class36.field716; var9++) {
            int var10 = class78.field1668[var9];
            int var11 = class24.field397[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class110.field2385[var9] = var13;
            int var14 = var2.method231(arg0 + 255);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method219(26669);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method219(26669);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)V", line = 284)
    public static final void method780(boolean arg0) {
        field2227++;
        if (!arg0) {
            field2211 = null;
        }
        if (class122.field2730 == 0) {
            return;
        }
        int var1 = 0;
        if (class103.field2169 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class75.field1597[var2] != null) {
                int var3 = class89.field2007[var2];
                class84 var4 = class127.field2803[var2];
                if (var4 != null && var4.method638(class49.field1067, 100)) {
                    var4 = var4.method655(28418, 5);
                }
                if (var4 != null && var4.method638(class111.field2412, 123)) {
                    var4 = var4.method655(28418, 5);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class125.field2771 == 0 || class125.field2771 == 1 && class45.method394(var4, -20281))) {
                    int var5 = 329 - var1 * 13;
                    if (class38.field748 > 4 && var5 - 10 < class119.field2644 + -4 && var5 + 3 >= class119.field2644 + -4) {
                        int var6 = class123.field2762.method313(class97.method746(0, new class84[] { class4.field64, var4, class75.field1597[var2] })) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (var6 + 4 > class38.field748) {
                            class125.field2772++;
                            if (class73.field1542 >= 1) {
                                class16.field294++;
                                class26.method196(class97.method746(0, new class84[] { client.field322, var4 }), 2042, 0, 0, false, 0);
                            }
                            class26.method196(class97.method746(0, new class84[] { class107.field2273, var4 }), 2012, 0, 0, false, 0);
                            class26.method196(class97.method746(0, new class84[] { class17.field300, var4 }), 2051, 0, 0, false, 0);
                            class93.field2032++;
                        }
                    }
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class125.field2771 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)V", line = 400)
    public static final void method781(byte arg0) {
        field2234++;
        if (arg0 >= 0) {
            field2209 = null;
        }
        if (class115.field2489 != 0 || field2225 != 1) {
            return;
        }
        int var1 = class109.field2367 - 9;
        int var2 = class128.field2820 - 25 - 550;
        if (var2 < 0 || var1 < 0 || var2 >= 146 || var1 >= 151) {
            return;
        }
        var2 -= 73;
        var1 -= 75;
        int var3 = class79.field1680 + class103.field2176 & 0x7FF;
        int var4 = class7.field128[var3];
        int var5 = (class17.field302 + 256) * var4 >> 8;
        int var6 = class7.field124[var3];
        int var7 = (class17.field302 + 256) * var6 >> 8;
        int var8 = var1 * var5 + var2 * var7 >> 11;
        int var9 = var1 * var7 - var2 * var5 >> 11;
        int var10 = class107.field2271.field1391 - var9 >> 7;
        int var11 = class107.field2271.field1380 + var8 >> 7;
        boolean var12 = class101.method761(var10, (byte) 110, 0, class107.field2271.field1374[0], 0, 0, 1, true, 0, class107.field2271.field1436[0], 0, var11);
        if (!var12) {
            return;
        }
        class97.field2070.method226(-9646, var2);
        class97.field2070.method226(-9646, var1);
        class97.field2070.method217(class79.field1680, 769666216);
        class97.field2070.method226(-9646, 57);
        class97.field2070.method226(-9646, class103.field2176);
        class97.field2070.method226(-9646, class17.field302);
        class97.field2070.method226(-9646, 89);
        class97.field2070.method217(class107.field2271.field1380, 769666216);
        class97.field2070.method217(class107.field2271.field1391, 769666216);
        class97.field2070.method226(-9646, class120.field2655);
        class97.field2070.method226(-9646, 63);
        return;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIIIIZ)V", line = 466)
    public class105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field2228 = arg6;
        this.field2235 = arg3;
        this.field2207 = arg1;
        this.field2206 = arg2;
        this.field2221 = arg5;
        this.field2215 = arg4;
        this.field2230 = arg0;
        if (arg7 != -1) {
            this.field2213 = class74.method554(arg7, 4867);
            this.field2214 = 0;
            this.field2217 = class128.field2837 - 1;
            if (arg8 && this.field2213.field620 != -1) {
                this.field2214 = (int) ((double) this.field2213.field612.length * Math.random());
                this.field2217 -= (int) ((double) this.field2213.field628[this.field2214] * Math.random());
                return;
            }
        }
    }
}
