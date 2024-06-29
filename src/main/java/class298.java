import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class298 extends class38 {

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "[J")
    private long[] field5162 = new long[10];

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    private int field5155 = 1;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    private int field5147 = 0;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    private int field5165 = 256;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "J")
    private long field5156 = class76.method507(-30994);

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "Lwm;")
    public static class152 field5148 = class157.method1048("::rect_debug", 93);

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "J")
    public static long field5161 = 0L;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "Lwm;")
    private static class152 field5166 = class157.method1048("Please wait)3)3)3", 119);

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "Lwm;")
    public static class152 field5164 = field5166;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    private int field5167;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2083(boolean arg0) {
        field5159++;
        int var1 = class266.field4484 >> 7;
        class272.field4645 &= 0x7FF;
        if (class193.field3060 < 128) {
            class193.field3060 = 128;
        }
        if (class193.field3060 > 383) {
            class193.field3060 = 383;
        }
        if (arg0) {
            field5161 = -73L;
        }
        int var2 = class176.field2839 >> 7;
        int var3 = class154.method1031(43, class266.field4484, class23.field400, class176.field2839);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class23.field400;
                    if (var7 < 3 && (class70.field1026[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class97.field1401[var7][var5][var6] & 0xFF) * 8 + var3 - class65.field984[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class5.field84 < var9) {
            class5.field84 += (var9 - class5.field84) / 24;
        } else if (var9 < class5.field84) {
            class5.field84 += (var9 - class5.field84) / 80;
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V", line = 81)
    public static void method2084(byte arg0) {
        field5164 = null;
        field5166 = null;
        field5148 = null;
        if (arg0 < 108) {
            method2084((byte) -66);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)Lwm;", line = 101)
    private static final class152 method2085(int arg0, byte arg1) {
        field5150++;
        if (arg0 < 100000) {
            return class195.method1307(new class152[] { class320.field5576, class38.method280(arg1 + 10, arg0), class295.field5044 }, (byte) 29);
        } else {
            if (arg1 != 78) {
                method2086((byte) -114);
            }
            return arg0 < 10000000 ? class195.method1307(new class152[] { class164.field2604, class38.method280(arg1 ^ 0x10, arg0 / 1000), class193.field3081, class295.field5044 }, (byte) 29) : class195.method1307(new class152[] { class57.field882, class38.method280(arg1 + 34, arg0 / 1000000), class197.field3163, class295.field5044 }, (byte) 29);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V", line = 136)
    public final void method274(byte arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field5162[var2] = 0L;
        }
        field5154++;
        if (arg0 <= 125) {
            method2089((byte) -124);
        }
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V", line = 153)
    public static final void method2086(byte arg0) {
        field5157++;
        class8.method41(false, (byte) 101);
        boolean var1 = true;
        class205.field3354 = 0;
        for (int var2 = 0; var2 < class107.field1534.length; var2++) {
            if (class41.field662[var2] != -1 && class107.field1534[var2] == null) {
                class107.field1534[var2] = class73.field1063.method1381(class41.field662[var2], 0, 0);
                if (class107.field1534[var2] == null) {
                    class205.field3354++;
                    var1 = false;
                }
            }
            if (class63.field952[var2] != -1 && class202.field3267[var2] == null) {
                class202.field3267[var2] = class73.field1063.method1356(-2, class63.field952[var2], 0, class249.field4217[var2]);
                if (class202.field3267[var2] == null) {
                    var1 = false;
                    class205.field3354++;
                }
            }
            if (class217.field3516) {
                if (class170.field2677[var2] != -1 && class133.field2041[var2] == null) {
                    class133.field2041[var2] = class73.field1063.method1381(class170.field2677[var2], 0, 0);
                    if (class133.field2041[var2] == null) {
                        var1 = false;
                        class205.field3354++;
                    }
                }
                if (class104.field1495[var2] != -1 && class323.field5637[var2] == null) {
                    class323.field5637[var2] = class73.field1063.method1381(class104.field1495[var2], 0, 0);
                    if (class323.field5637[var2] == null) {
                        class205.field3354++;
                        var1 = false;
                    }
                }
            }
            if (class186.field2956 != null && class148.field2274[var2] == null && class186.field2956[var2] != -1) {
                class148.field2274[var2] = class73.field1063.method1356(-2, class186.field2956[var2], 0, class249.field4217[var2]);
                if (class148.field2274[var2] == null) {
                    var1 = false;
                    class205.field3354++;
                }
            }
        }
        if (class201.field3247 == null) {
            if (class322.field5615 == null || !class141.field2172.method1364(true, class195.method1307(new class152[] { class322.field5615.field5328, class227.field3703 }, (byte) 29))) {
                class201.field3247 = new class279(0);
            } else if (class141.field2172.method1359(-2, class195.method1307(new class152[] { class322.field5615.field5328, class227.field3703 }, (byte) 29))) {
                class201.field3247 = class148.method935((byte) -60, class141.field2172, class195.method1307(new class152[] { class322.field5615.field5328, class227.field3703 }, (byte) 29));
            } else {
                var1 = false;
                class205.field3354++;
            }
        }
        if (!var1) {
            class254.field4399 = 1;
            return;
        }
        class180.field2868 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class107.field1534.length; var4++) {
            byte[] var5 = class202.field3267[var4];
            if (var5 != null) {
                int var6 = (class284.field4835[var4] & 0xFF) * 64 - class199.field3226;
                int var7 = (class284.field4835[var4] >> 8) * 64 - class272.field4670;
                if (class323.field5638) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class66.method420((byte) -79, var5, var7, var6);
            }
            if (class217.field3516) {
                byte[] var8 = class323.field5637[var4];
                if (var8 != null) {
                    int var9 = (class284.field4835[var4] >> 8) * 64 - class272.field4670;
                    int var10 = (class284.field4835[var4] & 0xFF) * 64 - class199.field3226;
                    if (class323.field5638) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class66.method420((byte) -47, var8, var9, var10);
                }
            }
        }
        if (!var3) {
            class254.field4399 = 2;
            return;
        }
        if (class254.field4399 != 0) {
            class6.method32(class195.method1307(new class152[] { class154.field2457, class142.field2193 }, (byte) 29), true, 66);
        }
        boolean var11 = false;
        class234.method1609(-128);
        class41.method289(false);
        if (class217.field3516 && class100.field1454) {
            for (int var12 = 0; var12 < class107.field1534.length; var12++) {
                if (class323.field5637[var12] != null || class133.field2041[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class49.method344(4, 104, 104, class217.field3516 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class135.field2076[var13].method167(-67);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class70.field1026[var14][var15][var16] = 0;
                }
            }
        }
        class229.method1574((byte) -124, false);
        if (class217.field3516) {
            class102.field1477.method2099();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class102.field1475[var17][var18].field3001 = true;
                }
            }
        }
        if (class217.field3516) {
            class24.method213();
        }
        if (class217.field3516) {
            class57.method378(-104);
        }
        class234.method1609(-128);
        System.gc();
        class8.method41(true, (byte) 40);
        class305.method2128(123, false);
        if (!class323.field5638) {
            class120.method779(false, (byte) 88);
            class8.method41(true, (byte) 127);
            if (class217.field3516) {
                int var19 = class85.field1176.field4188[0] >> 3;
                int var20 = class85.field1176.field4245[0] >> 3;
                class189.method1258(var19, var20, 19323);
            }
            class154.method1032((byte) 32, false);
            if (class148.field2274 != null) {
                class276.method1890(-1788692122);
            }
        }
        if (class323.field5638) {
            class311.method2155(-29, false);
            class8.method41(true, (byte) 91);
            if (class217.field3516) {
                int var21 = class85.field1176.field4188[0] >> 3;
                int var22 = class85.field1176.field4245[0] >> 3;
                class189.method1258(var21, var22, 19323);
            }
            class254.method1769(124, false);
        }
        class41.method289(false);
        class8.method41(true, (byte) 74);
        class150.method949(class135.field2076, -128, false);
        if (class217.field3516) {
            class24.method200();
        }
        class8.method41(true, (byte) 31);
        int var23 = class97.field1391;
        if (class23.field400 < var23) {
            var23 = class23.field400;
        }
        if (var23 < (class23.field400 - 1)) {
            int var24 = class23.field400 - 1;
        }
        if (class296.method2044(-105)) {
            class222.method1536(0);
        } else {
            class222.method1536(class97.field1391);
        }
        class295.method2040(0);
        if (class217.field3516 && var11) {
            class159.method1062(true);
            class305.method2128(127, true);
            if (!class323.field5638) {
                class120.method779(true, (byte) 88);
                class8.method41(true, (byte) 120);
                class154.method1032((byte) 32, true);
            }
            if (class323.field5638) {
                class311.method2155(-104, true);
                class8.method41(true, (byte) 121);
                class254.method1769(121, true);
            }
            class41.method289(false);
            class8.method41(true, (byte) 40);
            class150.method949(class135.field2076, 27, true);
            class8.method41(true, (byte) 53);
            class295.method2040(0);
            class159.method1062(false);
        }
        if (class217.field3516) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class102.field1475[var25][var26].method1261(class65.field984[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class268.method1833(var27, var28, (byte) -74);
            }
        }
        class159.method1069(16560);
        class234.method1609(-128);
        class283.method1917(25);
        class41.method289(false);
        class157.field2489 = false;
        if (class85.field1201 != null && class265.field4477 != null && class232.field3814 == 25) {
            class245.field4102.method1065(148, -108);
            class130.field1971++;
            class245.field4102.method1967(1057001181, -1303690792);
        }
        if (!class323.field5638) {
            int var29 = (class121.field1713 + 6) / 8;
            int var30 = (class121.field1713 - 6) / 8;
            int var31 = (class110.field1555 - 6) / 8;
            int var32 = (class110.field1555 + 6) / 8;
            for (int var33 = var30 - 1; var33 <= var29 + 1; var33++) {
                for (int var34 = var31 - 1; var34 <= (var32 + 1); var34++) {
                    if (var33 < var30 || var33 > var29 || var34 < var31 || var32 < var34) {
                        class73.field1063.method1372(class195.method1307(new class152[] { class81.field1139, class38.method280(78, var33), class120.field1692, class38.method280(81, var34) }, (byte) 29), (byte) -71);
                        class73.field1063.method1372(class195.method1307(new class152[] { class69.field1009, class38.method280(99, var33), class120.field1692, class38.method280(125, var34) }, (byte) 29), (byte) -81);
                    }
                }
            }
        }
        if (class232.field3814 == 28) {
            class232.method1597((byte) 127, 10);
        } else {
            class232.method1597((byte) 127, 30);
            if (class265.field4477 != null) {
                class245.field4102.method1065(32, -90);
            }
        }
        class308.method2142((byte) 44);
        class234.method1609(-128);
        if (arg0 < -7) {
            class204.method1346(-4863);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V", line = 657)
    public static final void method2087(int arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field5163++;
        if (!class197.method1315(71, arg0)) {
            return;
        }
        class127[] var2 = class215.field3501[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class127 var4 = var2[var3];
            if (var4 != null) {
                var4.field1874 = 1;
                var4.field1795 = 0;
                var4.field1800 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZIZIIZZI)Lbg;", line = 706)
    public static final class203 method2088(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        field5153++;
        class312 var8 = class189.method1253((byte) 39, arg7);
        if (arg1 > 1 && var8.field5395 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field5366[var10] && var8.field5366[var10] != 0) {
                    var9 = var8.field5395[var10];
                }
            }
            if (var9 != -1) {
                var8 = class189.method1253((byte) 104, var9);
            }
        }
        class21 var11 = var8.method2176(8564);
        if (var11 == null) {
            return null;
        }
        class109 var12 = null;
        if (var8.field5349 != -1) {
            var12 = (class109) method2088(true, 10, false, 0, 1, true, true, var8.field5348);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field5407 != -1) {
            var12 = (class109) method2088(true, arg1, false, arg3, arg4, false, true, var8.field5345);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class96.field1380;
        int[] var14 = class96.field1376;
        int var15 = class96.field1377;
        int[] var16 = new int[4];
        class96.method636(var16);
        class109 var17 = new class109(36, 32);
        class96.method638(var17.field1552, 36, 32);
        class181.method1187();
        class181.method1186(16, 16);
        int var18 = var8.field5376;
        if (arg5) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg4 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class181.field2879 = false;
        int var19 = class181.field2886[var8.field5369] * var18 >> 16;
        int var20 = class181.field2884[var8.field5369] * var18 >> 16;
        var11.method160(0, var8.field5408, var8.field5405, var8.field5369, var8.field5389, var20 + var8.field5410 - (var11.method22() / 2), var8.field5410 + var19, -1L);
        if (arg4 >= 1) {
            var17.method723(1);
            if (arg4 >= 2) {
                var17.method723(16777215);
            }
            class96.method638(var17.field1552, 36, 32);
        }
        if (arg3 != 0) {
            var17.method737(arg3);
        }
        if (var8.field5349 != -1) {
            var12.method429(0, 0);
        } else if (var8.field5407 != -1) {
            class96.method638(var12.field1552, 36, 32);
            var17.method429(0, 0);
            var17 = var12;
        }
        if (arg2 && (var8.field5375 == 1 || arg1 != 1) && arg1 != -1) {
            class130.field1975.method1133(method2085(arg1, (byte) 78), 0, 9, 16776960, 1);
        }
        class96.method638(var14, var13, var15);
        class96.method640(var16);
        class181.method1187();
        class181.field2879 = arg0;
        return class217.field3516 && !arg6 ? new class68(var17) : var17;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 916)
    public class298() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field5162[var1] = this.field5156;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I", line = 843)
    public final int method273(int arg0, int arg1, int arg2) {
        field5152++;
        int var4 = this.field5155;
        int var5 = this.field5165;
        this.field5155 = 1;
        this.field5165 = 300;
        this.field5156 = class76.method507(-30994);
        if (this.field5162[this.field5167] == 0L) {
            this.field5155 = var4;
            this.field5165 = var5;
        } else if (this.field5162[this.field5167] < this.field5156) {
            this.field5165 = (int) ((long) (arg2 * 2560) / (this.field5156 - this.field5162[this.field5167]));
        }
        if (this.field5165 < 25) {
            this.field5165 = 25;
        }
        if (this.field5165 > 256) {
            this.field5165 = 256;
            this.field5155 = (int) ((long) arg2 - (this.field5156 - this.field5162[this.field5167]) / 10L);
        }
        if (this.field5155 > arg2) {
            this.field5155 = arg2;
        }
        this.field5162[this.field5167] = this.field5156;
        this.field5167 = (this.field5167 + 1) % 10;
        if (this.field5155 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field5162[var6] != 0L) {
                    this.field5162[var6] -= -((long) this.field5155);
                }
            }
        }
        if (arg1 != -199) {
            return -71;
        }
        int var7 = 0;
        if (this.field5155 < arg0) {
            this.field5155 = arg0;
        }
        class4.method19(0, (long) this.field5155);
        while (this.field5147 < 256) {
            this.field5147 += this.field5165;
            var7++;
        }
        this.field5147 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(B)V", line = 937)
    public static final void method2089(byte arg0) {
        field5158++;
        class150.field2333 = null;
        class148.field2288 = null;
        class316.field5494 = null;
        if (arg0 != -73) {
            field5148 = (class152) null;
        }
    }
}
