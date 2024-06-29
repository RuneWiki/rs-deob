import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class125 {

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public int field2231;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field2235 = 0;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Lda;")
    public static class275 field2239 = class255.method1672(125, "<br>(X");

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public int field2242;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "Lma;")
    public static class105 field2244;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Lma;")
    public static class105 field2245;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Lkd;")
    public class54 field2238;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[I")
    public int[] field2225;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
    public int[] field2227;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "[I")
    public int[] field2230;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "[I")
    public int[] field2237;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "[I")
    public int[] field2243;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "[I")
    public int[] field2247;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "[Lkd;")
    public class54[] field2241;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "[S")
    public static short[] field2226;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[[I")
    public int[][] field2224;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "[[I")
    public int[][] field2234;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)Z")
    public static final boolean method901(int arg0, int arg1, int arg2) {
        if (arg1 != -9) {
            return true;
        }
        field2232++;
        class34 var3 = class146.method1040(28, arg2);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method197(arg0, (byte) 76);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)V")
    public static final void method902(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class36.method216(class19.field280[arg0], arg4 - arg3, arg1, -122, arg3 + arg4);
        field2246++;
        if (arg2 > -113) {
            field2235 = -62;
        }
        int var5 = arg3;
        int var6 = 0;
        int var7 = -arg3;
        int var8 = -1;
        while (var5 > var6) {
            var6++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var5--;
                var7 -= var5 << 1;
                int[] var9 = class19.field280[arg0 + var5];
                int[] var10 = class19.field280[arg0 - var5];
                int var11 = arg4 + var6;
                int var12 = arg4 - var6;
                class36.method216(var9, var12, arg1, -118, var11);
                class36.method216(var10, var12, arg1, -127, var11);
            }
            int var13 = arg4 + var5;
            int var14 = arg4 - var5;
            int[] var15 = class19.field280[arg0 + var6];
            int[] var16 = class19.field280[arg0 - var6];
            class36.method216(var15, var14, arg1, -126, var13);
            class36.method216(var16, var14, arg1, -122, var13);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lda;B)V")
    public static final void method903(class275 arg0, byte arg1) {
        field2228++;
        if (class277.field4838 >= 2) {
            if (arg0.method1844(90, class192.field3310)) {
                class6.method23(0);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class277.method1874(class197.method1291(new class275[] { class156.field2727, class250.method1644(var4, (byte) -115), class199.field3396 }, -30025), (class275) null, 0, true);
            }
            if (arg0.method1844(90, class160.field2815)) {
                class135.method981((byte) 29);
            }
            if (arg0.method1844(90, class102.field1704)) {
                class187.field3191.method1762(-110);
            }
            if (arg0.method1844(90, class112.field1976)) {
                class187.field3191.method1776(0);
            }
            if (arg0.method1844(90, class146.field2552)) {
                class3.field24.method371(false);
                class52.field866.method1410((byte) 52);
                class187.field3191.method1768(false);
            }
            if (arg0.method1844(90, class115.field2032)) {
                class114.field2025 = true;
            }
            if (arg0.method1844(90, class171.field2985)) {
                class265.method1746((byte) -52, 25);
            }
            if (arg0.method1844(90, class163.field2844)) {
                class120.field2153 = true;
            }
            if (arg0.method1844(90, class133.field2368)) {
                class120.field2153 = false;
            }
            if (arg0.method1844(90, class13.field211)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class173.field3003[var5].field2094[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method1851(class116.field2058, -84) && class42.field704 != 0) {
                class52.method326(114, arg0.method1839(6, (byte) -94).method1847((byte) 5));
            }
            if (arg0.method1844(90, class221.field3752) && class42.field704 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method1851(class276.field4816, -86)) {
                class124.field2222 = arg0.method1839(12, (byte) 91).method1845(false).method1847((byte) 5);
                class277.method1874(class197.method1291(new class275[] { class48.field796, class250.method1644(class124.field2222, (byte) -115) }, -30025), (class275) null, 0, true);
            }
            if (arg0.method1844(90, class184.field3157)) {
                class143.field2518 = true;
            }
        }
        class22.field337++;
        class149.field2597.method526((byte) -53, 115);
        class149.field2597.method575((byte) 127, arg0.method1838(3) - 1);
        class149.field2597.method584((byte) 108, arg0.method1839(2, (byte) 127));
        if (arg1 <= 48) {
            field2233 = -54;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([BB)V")
    private final void method904(byte[] arg0, byte arg1) {
        field2223++;
        class85 var3 = new class85(class169.method1161((byte) -75, arg0));
        if (arg1 != -57) {
            method905(109, -20);
        }
        int var4 = var3.method564((byte) 113);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field2240 = 0;
        } else {
            this.field2240 = var3.method568(19845);
        }
        int var5 = var3.method564((byte) 127);
        this.field2242 = var3.method608(arg1 + 169);
        this.field2230 = new int[this.field2242];
        int var6 = -1;
        int var7 = 0;
        for (int var8 = 0; var8 < this.field2242; var8++) {
            this.field2230[var8] = var7 += var3.method608(24);
            if (var6 < this.field2230[var8]) {
                var6 = this.field2230[var8];
            }
        }
        this.field2249 = var6 + 1;
        this.field2225 = new int[this.field2249];
        this.field2247 = new int[this.field2249];
        this.field2227 = new int[this.field2249];
        this.field2243 = new int[this.field2249];
        this.field2224 = new int[this.field2249][];
        if (var5 != 0) {
            this.field2237 = new int[this.field2249];
            for (int var9 = 0; var9 < this.field2249; var9++) {
                this.field2237[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field2242; var10++) {
                this.field2237[this.field2230[var10]] = var3.method568(arg1 + 19902);
            }
            this.field2238 = new class54(this.field2237);
        }
        for (int var11 = 0; var11 < this.field2242; var11++) {
            this.field2243[this.field2230[var11]] = var3.method568(class261.method1705(arg1, -19902));
        }
        for (int var12 = 0; var12 < this.field2242; var12++) {
            this.field2227[this.field2230[var12]] = var3.method568(19845);
        }
        for (int var13 = 0; var13 < this.field2242; var13++) {
            this.field2225[this.field2230[var13]] = var3.method608(15);
        }
        for (int var14 = 0; var14 < this.field2242; var14++) {
            int var21 = this.field2230[var14];
            int var22 = 0;
            int var23 = this.field2225[var21];
            int var24 = -1;
            this.field2224[var21] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field2224[var21][var25] = var22 += var3.method608(120);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field2247[var21] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field2224[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field2234 = new int[var6 + 1][];
        this.field2241 = new class54[var6 + 1];
        for (int var15 = 0; var15 < this.field2242; var15++) {
            int var16 = this.field2230[var15];
            int var17 = this.field2225[var16];
            this.field2234[var16] = new int[this.field2247[var16]];
            for (int var18 = 0; var18 < this.field2247[var16]; var18++) {
                this.field2234[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field2224[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field2224[var16][var19];
                }
                this.field2234[var16][var20] = var3.method568(19845);
            }
            this.field2241[var16] = new class54(this.field2234[var16]);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lda;")
    public static final class275 method905(int arg0, int arg1) {
        field2229++;
        return arg1 <= 118 ? null : class197.method1291(new class275[] { class250.method1644(arg0 >> 24 & 0xFF, (byte) -115), class170.field2968, class250.method1644(arg0 >> 16 & 0xFF, (byte) -115), class170.field2968, class250.method1644((arg0 & 0xFFCF) >> 8, (byte) -115), class170.field2968, class250.method1644(arg0 & 0xFF, (byte) -115) }, -30025);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method906(byte arg0) {
        field2244 = null;
        field2245 = null;
        field2239 = null;
        field2226 = null;
        if (arg0 >= -79) {
            method902(53, -94, 119, 19, -76);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lij;I)V")
    public static final void method907(class85 arg0, int arg1) {
        field2236++;
        if ((arg0.field1381.length - arg0.field1392) < 1) {
            return;
        }
        int var2 = arg0.method564((byte) 63);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        byte var3;
        if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg0.field1381.length - arg0.field1392 < var3) {
            return;
        }
        class193.field3325 = arg0.method564((byte) 78);
        if (class193.field3325 < 1) {
            class193.field3325 = 1;
        } else if (class193.field3325 > 4) {
            class193.field3325 = 4;
        }
        class108.method802(arg0.method564((byte) 118) == 1, true);
        class66.field1080 = arg0.method564((byte) 119) == 1;
        class77.field1284 = arg0.method564((byte) 85) == 1;
        class29.field447 = arg0.method564((byte) 113) == 1;
        class76.field1257 = arg0.method564((byte) 96) == 1;
        class32.field483 = arg0.method564((byte) 113) == 1;
        class250.field4425 = arg0.method564((byte) 75) == 1;
        class163.field2845 = arg0.method564((byte) 74) == 1;
        class240.field4219 = arg0.method564((byte) 84);
        if (class240.field4219 > 2) {
            class240.field4219 = 2;
        }
        if (var2 >= 2) {
            class155.field2695 = arg0.method564((byte) 60) == 1;
        } else {
            class155.field2695 = arg0.method564((byte) 57) == 1;
            arg0.method564((byte) 112);
        }
        class104.field1759 = arg0.method564((byte) 55) == 1;
        class153.field2674 = arg0.method564((byte) 53) == 1;
        class73.field1189 = arg0.method564((byte) 56);
        if (class73.field1189 > 2) {
            class73.field1189 = 2;
        }
        class225.field3810 = arg0.method564((byte) 70) == 1;
        class61.field1019 = arg0.method564((byte) 111);
        if (class61.field1019 > 127) {
            class61.field1019 = 127;
        }
        class90.field1531 = arg0.method564((byte) 113);
        class173.field3006 = arg0.method564((byte) 49);
        if (class173.field3006 > 127) {
            class173.field3006 = 127;
        }
        if (var2 >= 1) {
            class207.field3503 = arg0.method608(arg1 ^ 0x4B);
            class60.field1009 = arg0.method608(56);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method564((byte) 103);
        }
        if (var2 >= 4) {
            arg0.method564((byte) 88);
        }
        if (var2 >= 5) {
            class4.field62 = arg0.method568(arg1 + 19838);
        }
        if (var2 >= 6) {
            class73.field1198 = arg0.method564((byte) 110);
        }
        if (arg1 <= var2) {
            class249.field4406 = arg0.method564((byte) 106) == 1;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([BI)V")
    public class125(byte[] arg0, int arg1) {
        this.field2231 = class235.method1529(0, arg0.length, arg0);
        if (this.field2231 != arg1) {
            throw new RuntimeException();
        }
        this.method904(arg0, (byte) -57);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lsf;B)V")
    public static final void method908(class8 arg0, byte arg1) {
        field2248++;
        long var2 = 0L;
        if (arg0.field118 == 0) {
            var2 = class181.method1216(arg0.field127, arg0.field122, arg0.field126);
        }
        if (arg0.field118 == 1) {
            var2 = class115.method839(arg0.field127, arg0.field122, arg0.field126);
        }
        int var4 = 0;
        if (arg0.field118 == 2) {
            var2 = class110.method814(arg0.field127, arg0.field122, arg0.field126);
        }
        if (arg0.field118 == 3) {
            var2 = class35.method208(arg0.field127, arg0.field122, arg0.field126);
        }
        int var5 = -1;
        int var6 = 0;
        if (var2 != 0L) {
            var5 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var4 = ((int) var2 & 0x7D0C7) >> 14;
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg0.field128 = var6;
        if (arg1 != -128) {
            method907((class85) null, 50);
        }
        arg0.field129 = var5;
        arg0.field119 = var4;
    }
}
