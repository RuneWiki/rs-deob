import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class203 extends class317 {

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    private int field2899 = 585;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "Lhi;")
    public static class192 field2900 = new class192();

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    public static int field2906 = 0;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field2907 = 0;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "F")
    public static float field2901;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "[I")
    public static int[] field2905;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "[[I")
    public static int[][] field2908;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 5)
    public class203() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIII)V", line = 13)
    public static final void method1438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2904++;
        int var8 = arg5 - arg0;
        int var9 = arg0 + arg7;
        if (arg1 != 192) {
            method1441(-98);
        }
        int var10 = arg4 - arg0;
        for (int var11 = arg7; var11 < var9; var11++) {
            class190.method1329(class126.field1723[var11], arg4, arg6, (byte) -86, arg3);
        }
        int var12 = arg3 + arg0;
        for (int var13 = arg5; var13 > var8; var13--) {
            class190.method1329(class126.field1723[var13], arg4, arg6, (byte) -83, arg3);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class126.field1723[var14];
            class190.method1329(var15, var12, arg6, (byte) -104, arg3);
            class190.method1329(var15, var10, arg2, (byte) -98, var12);
            class190.method1329(var15, arg4, arg6, (byte) -122, var10);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)[I", line = 63)
    public final int[] method140(int arg0, int arg1) {
        int[] var3 = this.field4847.method1387(arg1, (byte) -33);
        field2898++;
        if (this.field4847.field2751) {
            int var4 = class51.field693[arg1];
            for (int var5 = 0; var5 < class326.field4933; var5++) {
                int var6 = class99.field1360[var5];
                if (var6 > this.field2899 && (4096 - this.field2899) > var6 && 2048 - this.field2899 < var4 && var4 < this.field2899 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field2899);
                    var3[var5] = 4096 - var10;
                } else if (2048 - this.field2899 < var6 && (this.field2899 + 2048) > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2899;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field2899);
                } else if (this.field2899 > var4 || var4 > 4096 - this.field2899) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field2899;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2899);
                } else if (var6 >= this.field2899 && 4096 - this.field2899 >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field2899);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return arg0 == 542 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V", line = 144)
    public static void method1439(boolean arg0) {
        field2905 = null;
        if (!arg0) {
            method1440(-29, (byte) -17);
        }
        field2908 = (int[][]) null;
        field2900 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)V", line = 164)
    public static final void method1440(int arg0, byte arg1) {
        field2903++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class334.field5049[arg0];
        int var3 = class54.field722[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var4 = (int) class230.field3264[arg0];
        long var5 = class230.field3264[arg0];
        int var7 = class20.field252[arg0];
        if (var3 == 38) {
            field2907 = class217.field3104;
            class213.field3077 = 0;
            class122.field1652++;
            class266.field3867 = class155.field2142;
            class45.field554 = 2;
            class90.field1264.method2238(166, (byte) -128);
            class90.field1264.method2184((byte) 89, class149.field2067[82] ? 1 : 0);
            class90.field1264.method2169(true, class132.field1809 + var2);
            class90.field1264.method2206(var4, -128);
            class90.field1264.method2206(class296.field4394 + var7, -128);
        }
        if (var3 == 1005) {
            field2907 = class217.field3104;
            class266.field3867 = class155.field2142;
            class266.field3866++;
            class213.field3077 = 0;
            class45.field554 = 2;
            class90.field1264.method2238(203, (byte) -128);
            class90.field1264.method2206(var4, -128);
        }
        if (var3 == 3) {
            class329 var8 = class42.field484[var4];
            if (var8 != null) {
                class266.field3867 = class155.field2142;
                class213.field3077 = 0;
                class45.field554 = 2;
                class332.field4992++;
                field2907 = class217.field3104;
                class90.field1264.method2238(126, (byte) -128);
                class90.field1264.method2169(true, var4);
                class90.field1264.method2184((byte) 89, class149.field2067[82] ? 1 : 0);
            }
        }
        if (var3 == 33) {
            class90.field1264.method2238(106, (byte) -128);
            class145.field2000++;
            class90.field1264.method2189(arg1 ^ 0xFFFFFFD8, var2);
            class90.field1264.method2188(255, var7);
            class90.field1264.method2177(false, var4);
            class77.field1105 = 0;
            class342.field5129 = class151.method1101(-76, var7);
            class232.field3275 = var2;
        }
        if (var3 == 1) {
            class15.field179++;
            class90.field1264.method2238(30, (byte) -128);
            class90.field1264.method2188(255, var7);
            class90.field1264.method2206(var2, arg1 - 167);
            class90.field1264.method2206(var4, -128);
            class77.field1105 = 0;
            class342.field5129 = class151.method1101(-91, var7);
            class232.field3275 = var2;
        }
        if (var3 == 43) {
            if (var4 == 0) {
                class224.method1581(class251.field3603, var2, var7);
            } else if (var4 == 1) {
                if (class323.field4898 > 0 && class149.field2067[82] && class149.field2067[81]) {
                    class127.method917((byte) 121, class132.field1809 + var2, class296.field4394 + var7, class251.field3603);
                } else {
                    class250.method1704(var7, var2, arg1 ^ 0xFFFFFFA0, 1);
                    class90.field1264.method2184((byte) 89, class90.field1268);
                    class90.field1264.method2184((byte) 89, class146.field2009);
                    class90.field1264.method2189(-1, (int) class89.field1257);
                    class90.field1264.method2184((byte) 89, 57);
                    class90.field1264.method2184((byte) 89, class264.field3859);
                    class90.field1264.method2184((byte) 89, class252.field3618);
                    class90.field1264.method2184((byte) 89, 89);
                    class90.field1264.method2189(-1, class173.field2356.field3745);
                    class90.field1264.method2189(arg1 ^ 0xFFFFFFD8, class173.field2356.field3679);
                    class90.field1264.method2184((byte) 89, class236.field3337);
                    class90.field1264.method2184((byte) 89, 63);
                }
            }
        }
        if (var3 == 28) {
            class173.method1209(false);
            class344 var36 = class151.method1101(-33, var7);
            class236.field3348 = var2;
            class131.field1794 = var4;
            class15.field177 = var7;
            class1.field15 = 1;
            class255.method1741(var36, false);
            class148.field2052 = "<col=ff9040>" + class115.method854((byte) -124, var4).field2757 + "<col=ffffff>";
            if (class148.field2052 == null) {
                class148.field2052 = "null";
            }
            return;
        }
        if (var3 == 1007) {
            class213.field3077 = 0;
            class266.field3867 = class155.field2142;
            class45.field554 = 2;
            field2907 = class217.field3104;
            class329 var9 = class42.field484[var4];
            if (var9 != null) {
                class181 var10 = var9.field4961;
                if (var10.field2476 != null) {
                    var10 = var10.method1266((byte) 123);
                }
                if (var10 != null) {
                    class90.field1264.method2238(90, (byte) -128);
                    class90.field1264.method2169(true, var10.field2488);
                    class193.field2657++;
                }
            }
        }
        if (var3 == 30) {
            class45.field554 = 2;
            class282.field4222++;
            class266.field3867 = class155.field2142;
            class213.field3077 = 0;
            field2907 = class217.field3104;
            class90.field1264.method2238(201, (byte) -128);
            class90.field1264.method2206(class296.field4394 + var7, -128);
            class90.field1264.method2169(true, class132.field1809 + var2);
            class90.field1264.method2177(false, var4);
            class90.field1264.method2162(arg1 ^ 0x27, class149.field2067[82] ? 1 : 0);
        }
        if (var3 == 4) {
            class90.field1264.method2238(44, (byte) -128);
            class333.field5017++;
            class90.field1264.method2169(true, class219.field3146);
            class90.field1264.method2177(false, var2);
            class90.field1264.method2206(var4, -128);
            class90.field1264.method2180(var7, arg1 ^ 0x7);
            class90.field1264.method2180(class52.field697, arg1 - 20);
            class77.field1105 = 0;
            class342.field5129 = class151.method1101(arg1 ^ 0xFFFFFFF1, var7);
            class232.field3275 = var2;
        }
        if (var3 == 35) {
            class329 var11 = class42.field484[var4];
            if (var11 != null) {
                class211.field3049++;
                class45.field554 = 2;
                class213.field3077 = 0;
                field2907 = class217.field3104;
                class266.field3867 = class155.field2142;
                class90.field1264.method2238(133, (byte) -128);
                class90.field1264.method2162(0, class149.field2067[82] ? 1 : 0);
                class90.field1264.method2177(false, var4);
            }
        }
        if (var3 == 12) {
            class329 var12 = class42.field484[var4];
            if (var12 != null) {
                class44.field539++;
                field2907 = class217.field3104;
                class266.field3867 = class155.field2142;
                class45.field554 = 2;
                class213.field3077 = 0;
                class90.field1264.method2238(47, (byte) -128);
                class90.field1264.method2189(-1, var4);
                class90.field1264.method2184((byte) 89, class149.field2067[82] ? 1 : 0);
            }
        }
        if (var3 == 51) {
            class45.field554 = 2;
            class83.field1207++;
            class213.field3077 = 0;
            class266.field3867 = class155.field2142;
            field2907 = class217.field3104;
            class90.field1264.method2238(92, (byte) -128);
            class90.field1264.method2189(-1, class296.field4394 + var7);
            class90.field1264.method2177(false, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class90.field1264.method2206(class132.field1809 + var2, -128);
            class90.field1264.method2162(0, class149.field2067[82] ? 1 : 0);
        }
        if (var3 == 42) {
            field2907 = class217.field3104;
            class266.field3867 = class155.field2142;
            class45.field554 = 2;
            class213.field3077 = 0;
            class90.field1264.method2238(251, (byte) -128);
            class188.field2596++;
            class90.field1264.method2169(true, class219.field3146);
            class90.field1264.method2180(class52.field697, 117);
            class90.field1264.method2206(class132.field1809 + var2, arg1 + -167);
            class90.field1264.method2177(false, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class90.field1264.method2162(0, class149.field2067[82] ? 1 : 0);
            class90.field1264.method2206(class296.field4394 + var7, -128);
        }
        if (var3 == 29) {
            class128.field1754++;
            class90.field1264.method2238(192, (byte) -128);
            class90.field1264.method2188(255, var7);
            class344 var13 = class151.method1101(-38, var7);
            if (var13.field5218 != null && var13.field5218[0][0] == 5) {
                int var14 = var13.field5218[0][1];
                class324.field4920[var14] = 1 - class324.field4920[var14];
                class248.method1696(var14, (byte) -85);
            }
        }
        if (var3 == 58) {
            class266.field3867 = class155.field2142;
            class332.field4995++;
            class45.field554 = 2;
            class213.field3077 = 0;
            field2907 = class217.field3104;
            class90.field1264.method2238(127, (byte) -128);
            class90.field1264.method2169(true, class132.field1809 + var2);
            class90.field1264.method2206(class131.field1794, -128);
            class90.field1264.method2169(true, class296.field4394 + var7);
            class90.field1264.method2189(-1, class236.field3348);
            class90.field1264.method2188(255, class15.field177);
            class90.field1264.method2189(-1, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class90.field1264.method2197((byte) 44, class149.field2067[82] ? 1 : 0);
        }
        if (var3 == 46) {
            class344 var15 = class20.method128(113, var7, var2);
            if (var15 != null) {
                class173.method1209(false);
                class300 var16 = client.method821(var15);
                class188.method1319(var16.field4427, var15.field5216, var15.field5270, var2, var16.method2040(-1), var7, (byte) -128);
                class1.field15 = 0;
                class282.field4224 = class107.method789(var15, -2);
                if (class282.field4224 == null) {
                    class282.field4224 = "Null";
                }
                if (var15.field5267) {
                    class266.field3880 = var15.field5242 + "<col=ffffff>";
                } else {
                    class266.field3880 = "<col=00ff00>" + var15.field5234 + "<col=ffffff>";
                }
            }
            return;
        }
        if (var3 == 8) {
            class329 var17 = class42.field484[var4];
            if (var17 != null) {
                class45.field554 = 2;
                class266.field3867 = class155.field2142;
                class129.field1772++;
                class213.field3077 = 0;
                field2907 = class217.field3104;
                class90.field1264.method2238(140, (byte) -128);
                class90.field1264.method2197((byte) 44, class149.field2067[82] ? 1 : 0);
                class90.field1264.method2177(false, var4);
            }
        }
        if (var3 == 60) {
            if (var4 == 0) {
                class327.field4946 = 1;
                class224.method1581(class251.field3603, var2, var7);
            } else if (class323.field4898 > 0 && class149.field2067[82] && class149.field2067[81]) {
                class127.method917((byte) 106, class132.field1809 + var2, class296.field4394 - -var7, class251.field3603);
            } else {
                class79.field1140++;
                class90.field1264.method2238(94, (byte) -128);
                class90.field1264.method2177(false, class132.field1809 + var2);
                class90.field1264.method2206(class296.field4394 + var7, -128);
            }
        }
        if (var3 == 45) {
            class310.method2130(-27883);
        }
        if (var3 == 59) {
            class140.field1915++;
            class213.field3077 = 0;
            class266.field3867 = class155.field2142;
            class45.field554 = 2;
            field2907 = class217.field3104;
            class90.field1264.method2238(163, (byte) -128);
            class90.field1264.method2169(true, var7 + class296.field4394);
            class90.field1264.method2206(var4, -128);
            class90.field1264.method2177(false, class132.field1809 + var2);
            class90.field1264.method2174((byte) 91, class149.field2067[82] ? 1 : 0);
        }
        if (var3 == 21) {
            class90.field1264.method2238(129, (byte) -128);
            class43.field491++;
            class90.field1264.method2206(var2, arg1 - 167);
            class90.field1264.method2180(var7, arg1 ^ 0x5);
            class90.field1264.method2169(true, var4);
            class77.field1105 = 0;
            class342.field5129 = class151.method1101(-96, var7);
            class232.field3275 = var2;
        }
        if (var3 == 19) {
            class241 var18 = class169.field2306[var4];
            if (var18 != null) {
                field2907 = class217.field3104;
                class213.field3077 = 0;
                class301.field4468++;
                class45.field554 = 2;
                class266.field3867 = class155.field2142;
                class90.field1264.method2238(255, (byte) -128);
                class90.field1264.method2184((byte) 89, class149.field2067[82] ? 1 : 0);
                class90.field1264.method2169(true, var4);
            }
        }
        if (var3 == 10) {
            class90.field1264.method2238(192, (byte) -128);
            class128.field1754++;
            class90.field1264.method2188(255, var7);
            class344 var19 = class151.method1101(-22, var7);
            if (var19.field5218 != null && var19.field5218[0][0] == 5) {
                int var20 = var19.field5218[0][1];
                if (class324.field4920[var20] != var19.field5211[0]) {
                    class324.field4920[var20] = var19.field5211[0];
                    class248.method1696(var20, (byte) 92);
                }
            }
        }
        if (var3 == 6) {
            class266.field3867 = class155.field2142;
            class202.field2890++;
            field2907 = class217.field3104;
            class45.field554 = 2;
            class213.field3077 = 0;
            class90.field1264.method2238(220, (byte) -128);
            class90.field1264.method2206(class132.field1809 + var2, -128);
            class90.field1264.method2174((byte) 91, class149.field2067[82] ? 1 : 0);
            class90.field1264.method2206(var4, -128);
            class90.field1264.method2177(false, class296.field4394 + var7);
        }
        if (var3 == 2) {
            class241 var21 = class169.field2306[var4];
            if (var21 != null) {
                class213.field3077 = 0;
                class138.field1891++;
                class45.field554 = 2;
                class266.field3867 = class155.field2142;
                field2907 = class217.field3104;
                class90.field1264.method2238(61, (byte) -128);
                class90.field1264.method2197((byte) 44, class149.field2067[82] ? 1 : 0);
                class90.field1264.method2206(var4, -128);
            }
        }
        if (var3 == 7) {
            class329 var22 = class42.field484[var4];
            if (var22 != null) {
                class289.field4288++;
                field2907 = class217.field3104;
                class266.field3867 = class155.field2142;
                class45.field554 = 2;
                class213.field3077 = 0;
                class90.field1264.method2238(236, (byte) -128);
                class90.field1264.method2169(true, var4);
                class90.field1264.method2162(0, class149.field2067[82] ? 1 : 0);
            }
        }
        if (var3 == 36) {
            class149.field2061++;
            class90.field1264.method2238(252, (byte) -128);
            class90.field1264.method2187(var7, -1);
            class90.field1264.method2206(class236.field3348, arg1 ^ 0xFFFFFFA7);
            class90.field1264.method2177(false, class131.field1794);
            class90.field1264.method2206(var2, -128);
            class90.field1264.method2199(true, class15.field177);
            class90.field1264.method2189(-1, var4);
            class77.field1105 = 0;
            class342.field5129 = class151.method1101(-62, var7);
            class232.field3275 = var2;
        }
        if (var3 == 5) {
            class241 var23 = class169.field2306[var4];
            if (var23 != null) {
                class45.field554 = 2;
                class115.field1561++;
                field2907 = class217.field3104;
                class213.field3077 = 0;
                class266.field3867 = class155.field2142;
                class90.field1264.method2238(111, (byte) -128);
                class90.field1264.method2177(false, var4);
                class90.field1264.method2174((byte) 91, class149.field2067[82] ? 1 : 0);
            }
        }
        if (var3 == 24) {
            class224.field3224++;
            class90.field1264.method2238(82, (byte) -128);
            class90.field1264.method2189(-1, var2);
            class90.field1264.method2169(true, var4);
            class90.field1264.method2199(true, var7);
            class77.field1105 = 0;
            class342.field5129 = class151.method1101(arg1 ^ 0xFFFFFFF3, var7);
            class232.field3275 = var2;
        }
        if (var3 == 22) {
            class90.field1264.method2238(34, (byte) -128);
            class71.field966++;
            class90.field1264.method2206(var2, -128);
            class90.field1264.method2206(var4, -128);
            class90.field1264.method2199(true, var7);
            class77.field1105 = 0;
            class342.field5129 = class151.method1101(arg1 ^ 0xFFFFFF91, var7);
            class232.field3275 = var2;
        }
        if (var3 == 57) {
            class329 var24 = class42.field484[var4];
            if (var24 != null) {
                class271.field4037++;
                class45.field554 = 2;
                class266.field3867 = class155.field2142;
                class213.field3077 = 0;
                field2907 = class217.field3104;
                class90.field1264.method2238(100, (byte) -128);
                class90.field1264.method2197((byte) 44, class149.field2067[82] ? 1 : 0);
                class90.field1264.method2177(false, class236.field3348);
                class90.field1264.method2206(class131.field1794, -128);
                class90.field1264.method2188(255, class15.field177);
                class90.field1264.method2169(true, var4);
            }
        }
        if (var3 == 18) {
            class259.field3819++;
            class45.field554 = 2;
            field2907 = class217.field3104;
            class266.field3867 = class155.field2142;
            class213.field3077 = 0;
            class90.field1264.method2238(49, (byte) -128);
            class90.field1264.method2189(-1, var7 + class296.field4394);
            class90.field1264.method2206(class132.field1809 + var2, -128);
            class90.field1264.method2197((byte) 44, class149.field2067[82] ? 1 : 0);
            class90.field1264.method2189(-1, Integer.MAX_VALUE & (int) (var5 >>> 32));
        }
        if (arg1 != 39) {
            field2901 = -0.08448151F;
        }
        if (var3 == 20) {
            class241 var25 = class169.field2306[var4];
            if (var25 != null) {
                class213.field3077 = 0;
                field2907 = class217.field3104;
                class266.field3867 = class155.field2142;
                class45.field554 = 2;
                class276.field4139++;
                class90.field1264.method2238(227, (byte) -128);
                class90.field1264.method2184((byte) 89, class149.field2067[82] ? 1 : 0);
                class90.field1264.method2206(class219.field3146, -128);
                class90.field1264.method2199(true, class52.field697);
                class90.field1264.method2177(false, var4);
            }
        }
        if (var3 == 9) {
            class241 var26 = class169.field2306[var4];
            if (var26 != null) {
                class266.field3867 = class155.field2142;
                class213.field3077 = 0;
                class171.field2337++;
                field2907 = class217.field3104;
                class45.field554 = 2;
                class90.field1264.method2238(249, (byte) -128);
                class90.field1264.method2189(arg1 ^ 0xFFFFFFD8, var4);
                class90.field1264.method2197((byte) 44, class149.field2067[82] ? 1 : 0);
            }
        }
        if (var3 == 1001) {
            class45.field554 = 2;
            class266.field3867 = class155.field2142;
            class213.field3077 = 0;
            class113.field1544++;
            field2907 = class217.field3104;
            class90.field1264.method2238(138, (byte) -128);
            class90.field1264.method2206(var4, arg1 ^ 0xFFFFFFA7);
        }
        if (var3 == 49) {
            class329 var27 = class42.field484[var4];
            if (var27 != null) {
                field2907 = class217.field3104;
                class289.field4305++;
                class45.field554 = 2;
                class213.field3077 = 0;
                class266.field3867 = class155.field2142;
                class90.field1264.method2238(37, (byte) -128);
                class90.field1264.method2177(false, class219.field3146);
                class90.field1264.method2174((byte) 91, class149.field2067[82] ? 1 : 0);
                class90.field1264.method2199(true, class52.field697);
                class90.field1264.method2206(var4, -128);
            }
        }
        if (var3 == 34) {
            class241 var28 = class169.field2306[var4];
            if (var28 != null) {
                class45.field554 = 2;
                class132.field1807++;
                field2907 = class217.field3104;
                class213.field3077 = 0;
                class266.field3867 = class155.field2142;
                class90.field1264.method2238(234, (byte) -128);
                class90.field1264.method2169(true, var4);
                class90.field1264.method2184((byte) 89, class149.field2067[82] ? 1 : 0);
            }
        }
        if (var3 == 23) {
            class199.field2839++;
            class90.field1264.method2238(243, (byte) -128);
            class90.field1264.method2189(-1, var2);
            class90.field1264.method2180(var7, 71);
            class90.field1264.method2169(true, var4);
            class77.field1105 = 0;
            class342.field5129 = class151.method1101(-49, var7);
            class232.field3275 = var2;
        }
        if (var3 == 16) {
            class45.field554 = 2;
            class266.field3867 = class155.field2142;
            class304.field4569++;
            field2907 = class217.field3104;
            class213.field3077 = 0;
            class90.field1264.method2238(107, (byte) -128);
            class90.field1264.method2162(arg1 - 39, class149.field2067[82] ? 1 : 0);
            class90.field1264.method2169(true, var7 + class296.field4394);
            class90.field1264.method2189(arg1 - 40, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class90.field1264.method2177(false, class132.field1809 + var2);
        }
        if (var3 == 44) {
            class33.field395++;
            class90.field1264.method2238(59, (byte) -128);
            class90.field1264.method2206(var2, arg1 ^ 0xFFFFFFA7);
            class90.field1264.method2187(var7, -1);
            class90.field1264.method2189(-1, var4);
            class77.field1105 = 0;
            class342.field5129 = class151.method1101(-95, var7);
            class232.field3275 = var2;
        }
        if (var3 == 47) {
            if (var4 == 0) {
                class344.field5238 = 1;
                class224.method1581(class251.field3603, var2, var7);
            } else if (var4 == 1) {
                class90.field1264.method2238(142, (byte) -128);
                class272.field4078++;
                class90.field1264.method2177(false, class132.field1809 + var2);
                class90.field1264.method2177(false, class296.field4394 + var7);
                class90.field1264.method2177(false, class219.field3146);
                class90.field1264.method2199(true, class52.field697);
            }
        }
        if (var3 == 25) {
            class145.field1991++;
            class90.field1264.method2238(219, (byte) -128);
            class90.field1264.method2187(var7, arg1 - 40);
            class90.field1264.method2206(var2, -128);
            class90.field1264.method2206(var4, -128);
            class77.field1105 = 0;
            class342.field5129 = class151.method1101(-50, var7);
            class232.field3275 = var2;
        }
        if (var3 == 37) {
            class266.field3867 = class155.field2142;
            class20.field254++;
            class213.field3077 = 0;
            class45.field554 = 2;
            field2907 = class217.field3104;
            class90.field1264.method2238(187, (byte) -128);
            class90.field1264.method2189(-1, class132.field1809 + var2);
            class90.field1264.method2174((byte) 91, class149.field2067[82] ? 1 : 0);
            class90.field1264.method2169(true, var7 + class296.field4394);
            class90.field1264.method2177(false, (int) (var5 >>> 32) & Integer.MAX_VALUE);
        }
        if (var3 == 26) {
            class241 var29 = class169.field2306[var4];
            if (var29 != null) {
                class45.field554 = 2;
                class125.field1692++;
                class213.field3077 = 0;
                class266.field3867 = class155.field2142;
                field2907 = class217.field3104;
                class90.field1264.method2238(213, (byte) -128);
                class90.field1264.method2174((byte) 91, class149.field2067[82] ? 1 : 0);
                class90.field1264.method2206(class131.field1794, -128);
                class90.field1264.method2180(class15.field177, 54);
                class90.field1264.method2169(true, class236.field3348);
                class90.field1264.method2169(true, var4);
            }
        }
        if (var3 == 17) {
            class126.field1727++;
            class90.field1264.method2238(215, (byte) -128);
            class90.field1264.method2169(true, var2);
            class90.field1264.method2199(true, var7);
            class90.field1264.method2189(-1, var4);
            class77.field1105 = 0;
            class342.field5129 = class151.method1101(-22, var7);
            class232.field3275 = var2;
        }
        if (var3 == 15) {
            class241 var30 = class169.field2306[var4];
            if (var30 != null) {
                class213.field3077 = 0;
                class45.field554 = 2;
                field2907 = class217.field3104;
                class266.field3867 = class155.field2142;
                class90.field1264.method2238(230, (byte) -128);
                class108.field1464++;
                class90.field1264.method2206(var4, -128);
                class90.field1264.method2174((byte) 91, class149.field2067[82] ? 1 : 0);
            }
        }
        if (var3 == 50 && class187.field2591 == null) {
            class264.method1798(var7, false, var2);
            class187.field2591 = class20.method128(119, var7, var2);
            class255.method1741(class187.field2591, false);
        }
        if (var3 == 39) {
            class119.field1614++;
            class266.field3867 = class155.field2142;
            field2907 = class217.field3104;
            class213.field3077 = 0;
            class45.field554 = 2;
            class90.field1264.method2238(33, (byte) -128);
            class90.field1264.method2206(class131.field1794, arg1 ^ 0xFFFFFFA7);
            class90.field1264.method2177(false, class296.field4394 + var7);
            class90.field1264.method2189(-1, class132.field1809 + var2);
            class90.field1264.method2177(false, var4);
            class90.field1264.method2180(class15.field177, 31);
            class90.field1264.method2174((byte) 91, class149.field2067[82] ? 1 : 0);
            class90.field1264.method2177(false, class236.field3348);
        }
        if (var3 == 1006) {
            class45.field554 = 2;
            field2907 = class217.field3104;
            class213.field3077 = 0;
            class266.field3867 = class155.field2142;
            class254.field3637++;
            class90.field1264.method2238(19, (byte) -128);
            class90.field1264.method2177(false, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class90.field1264.method2177(false, class132.field1809 + var2);
            class90.field1264.method2177(false, class296.field4394 + var7);
            class90.field1264.method2174((byte) 91, class149.field2067[82] ? 1 : 0);
        }
        if (var3 == 32) {
            field2907 = class217.field3104;
            class56.field756++;
            class213.field3077 = 0;
            class266.field3867 = class155.field2142;
            class45.field554 = 2;
            class90.field1264.method2238(190, (byte) -128);
            class90.field1264.method2197((byte) 44, class149.field2067[82] ? 1 : 0);
            class90.field1264.method2169(true, class219.field3146);
            class90.field1264.method2169(true, class296.field4394 + var7);
            class90.field1264.method2177(false, var4);
            class90.field1264.method2169(true, class132.field1809 + var2);
            class90.field1264.method2188(arg1 ^ 0xD8, class52.field697);
        }
        if (var3 == 13 || var3 == 1002) {
            class31.method179(var2, var7, 2, class88.field1251[arg0], var4);
        }
        if (var3 == 31) {
            class90.field1264.method2238(160, (byte) -128);
            class90.field1264.method2206(var2, arg1 ^ 0xFFFFFFA7);
            class127.field1751++;
            class90.field1264.method2199(true, class52.field697);
            class90.field1264.method2180(var7, 107);
            class90.field1264.method2177(false, class219.field3146);
        }
        if (var3 == 11) {
            class241 var31 = class169.field2306[var4];
            if (var31 != null) {
                class266.field3867 = class155.field2142;
                class243.field3480++;
                field2907 = class217.field3104;
                class45.field554 = 2;
                class213.field3077 = 0;
                class90.field1264.method2238(139, (byte) -128);
                class90.field1264.method2174((byte) 91, class149.field2067[82] ? 1 : 0);
                class90.field1264.method2206(var4, -128);
            }
        }
        if (var3 == 1003) {
            class344 var32 = class151.method1101(-117, var7);
            if (var32 == null || var32.field5237[var2] < 100000) {
                class90.field1264.method2238(138, (byte) -128);
                class113.field1544++;
                class90.field1264.method2206(var4, -128);
            } else {
                class93.method695((byte) 125, 0, var32.field5237[var2] + " x " + class115.method854((byte) -84, var4).field2757, "");
            }
            class77.field1105 = 0;
            class342.field5129 = class151.method1101(-26, var7);
            class232.field3275 = var2;
        }
        if (var3 == 48) {
            class241 var33 = class169.field2306[var4];
            if (var33 != null) {
                class213.field3077 = 0;
                field2907 = class217.field3104;
                class266.field3867 = class155.field2142;
                class306.field4590++;
                class45.field554 = 2;
                class90.field1264.method2238(169, (byte) -128);
                class90.field1264.method2177(false, var4);
                class90.field1264.method2162(0, class149.field2067[82] ? 1 : 0);
            }
        }
        if (var3 == 41) {
            class8.field81++;
            class90.field1264.method2238(244, (byte) -128);
            class90.field1264.method2188(255, var7);
            class90.field1264.method2189(-1, var4);
            class90.field1264.method2169(true, var2);
            class77.field1105 = 0;
            class342.field5129 = class151.method1101(-61, var7);
            class232.field3275 = var2;
        }
        if (var3 == 40) {
            class266.field3867 = class155.field2142;
            field2907 = class217.field3104;
            class239.field3395++;
            class45.field554 = 2;
            class213.field3077 = 0;
            class90.field1264.method2238(130, (byte) -128);
            class90.field1264.method2184((byte) 89, class149.field2067[82] ? 1 : 0);
            class90.field1264.method2206(var4, arg1 ^ 0xFFFFFFA7);
            class90.field1264.method2169(true, class132.field1809 + var2);
            class90.field1264.method2189(-1, class296.field4394 + var7);
        }
        if (var3 == 14) {
            class344 var34 = class151.method1101(-79, var7);
            boolean var35 = true;
            if (var34.field5317 > 0) {
                var35 = class77.method599((byte) -101, var34);
            }
            if (var35) {
                class128.field1754++;
                class90.field1264.method2238(192, (byte) -128);
                class90.field1264.method2188(255, var7);
            }
        }
        if (class1.field15 != 0) {
            class1.field15 = 0;
            class255.method1741(class151.method1101(-89, class15.field177), false);
        }
        if (class124.field1676) {
            class173.method1209(false);
        }
        if (class342.field5129 != null && class77.field1105 == 0) {
            class255.method1741(class342.field5129, false);
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)I", line = 1200)
    public static final int method1441(int arg0) {
        field2902++;
        if (arg0 == 30538) {
            return class202.field2895 == 0 ? 0 : class257.field3786[class202.field2895].method25();
        } else {
            return -64;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lcg;II)V", line = 1227)
    public final void method60(class316 arg0, int arg1, int arg2) {
        int var4 = 94 / ((arg1 + 17) / 40);
        if (arg2 == 0) {
            this.field2899 = arg0.method2220((byte) 45);
        }
        field2897++;
    }
}
