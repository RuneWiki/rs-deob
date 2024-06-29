import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class101 {

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    private int field2249 = 0;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    private int field2262 = -1;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lpg;")
    private class141 field2253 = new class141();

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "Z")
    public boolean field2271 = false;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "[Lnd;")
    private class120[] field2257;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    private int field2270;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "[[I")
    private int[][] field2265;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Lea;")
    private static class38 field2252 = class9.method46((byte) 111, " ");

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field2258 = 2;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lea;")
    public static class38 field2248 = field2252;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Lea;")
    private static class38 field2261 = class9.method46((byte) 127, "Login limit exceeded)3");

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lea;")
    private static class38 field2245 = class9.method46((byte) 119, " is already on your ignore list)3");

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Lea;")
    public static class38 field2264 = class9.method46((byte) 122, ":duelreq:");

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lea;")
    public static class38 field2256 = field2261;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lea;")
    public static class38 field2251 = class9.method46((byte) 122, "<col=80ff00>");

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field2272 = 0;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "Lea;")
    public static class38 field2263 = class9.method46((byte) 114, "Titelbild geladen)3");

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "Lea;")
    public static class38 field2267 = field2245;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "Lre;")
    public static class157 field2268;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static final void method826(int arg0) {
        if (arg0 != -15581) {
            return;
        }
        for (class45 var1 = (class45) class14.field298.method1020(0); var1 != null; var1 = (class45) class14.field298.method1027((byte) 78)) {
            if (var1.field1096 != null) {
                class3.field100.method453(var1.field1096);
                var1.field1096 = null;
            }
            if (var1.field1117 != null) {
                class3.field100.method453(var1.field1117);
                var1.field1117 = null;
            }
        }
        field2246++;
        class14.field298.method1019(64);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)[I")
    public final int[] method827(int arg0, boolean arg1) {
        field2247++;
        if (!arg1) {
            this.field2265 = null;
        }
        if (this.field2270 == this.field2259) {
            this.field2271 = this.field2257[arg0] == null;
            this.field2257[arg0] = class50.field1232;
            return this.field2265[arg0];
        } else if (this.field2259 == 1) {
            this.field2271 = this.field2262 != arg0;
            this.field2262 = arg0;
            return this.field2265[0];
        } else {
            class120 var3 = this.field2257[arg0];
            if (this.field2271 = var3 == null) {
                if (this.field2259 <= this.field2249) {
                    class120 var4 = (class120) this.field2253.method1022(false);
                    var3 = new class120(arg0, var4.field2599);
                    this.field2257[var4.field2591] = null;
                    var4.method805(false);
                } else {
                    var3 = new class120(arg0, this.field2249);
                    this.field2249++;
                }
                this.field2257[arg0] = var3;
            }
            this.field2253.method1015(9282, var3);
            return this.field2265[var3.field2599];
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILef;)I")
    public static final int method828(int arg0, int arg1, class43 arg2) {
        field2273++;
        if (arg2.field1045 == null || arg1 >= arg2.field1045.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg2.field1045[arg1];
            if (arg0 != -29842) {
                field2251 = null;
            }
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var4[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class191.field3772[var4[var5++]];
                }
                if (var7 == 2) {
                    var8 = class160.field3339[var4[var5++]];
                }
                if (var7 == 3) {
                    var8 = class74.field1820[var4[var5++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class43 var12 = class98.method813(var11, 4096);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class117.method908(var13, (byte) 124).field89 || class143.field2978)) {
                        for (int var14 = 0; var14 < var12.field967.length; var14++) {
                            if (var13 + 1 == var12.field967[var14]) {
                                var8 += var12.field1033[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class195.field3845[var4[var5++]];
                }
                if (var7 == 6) {
                    var8 = class41.field906[class160.field3339[var4[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class195.field3845[var4[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class195.field3842.field3007;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class46.field1132[var15]) {
                            var8 += class160.field3339[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class43 var18 = class98.method813(var17, 4096);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class117.method908(var19, (byte) 80).field89 || class143.field2978)) {
                        for (int var20 = 0; var20 < var18.field967.length; var20++) {
                            if (var19 + 1 == var18.field967[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class170.field3483;
                }
                if (var7 == 12) {
                    var8 = class87.field2026;
                }
                if (var7 == 13) {
                    int var21 = class195.field3845[var4[var5++]];
                    int var22 = var4[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var5++];
                    var8 = class66.method514(var23, 124);
                }
                if (var7 == 18) {
                    var8 = (class195.field3842.field406 >> 7) + class135.field2845;
                }
                if (var7 == 19) {
                    var8 = (class195.field3842.field382 >> 7) + class127.field2712;
                }
                if (var7 == 20) {
                    var8 = var4[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var3 += var8;
                    }
                    if (var6 == 1) {
                        var3 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var3 /= var8;
                    }
                    if (var6 == 3) {
                        var3 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static void method829(int arg0) {
        field2245 = null;
        field2268 = null;
        field2261 = null;
        if (arg0 > -122) {
            return;
        }
        field2263 = null;
        field2264 = null;
        field2267 = null;
        field2252 = null;
        field2251 = null;
        field2248 = null;
        field2256 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lea;IILea;Lea;)V")
    public static final void method830(class38 arg0, int arg1, int arg2, class38 arg3, class38 arg4) {
        for (int var5 = 99; var5 > 0; var5--) {
            class108.field2430[var5] = class108.field2430[var5 - 1];
            class168.field3457[var5] = class168.field3457[var5 - 1];
            class66.field1606[var5] = class66.field1606[var5 - 1];
            class74.field1809[var5] = class74.field1809[var5 - 1];
        }
        field2266++;
        class179.field3620 = class192.field3796;
        class21.field463++;
        class108.field2430[0] = arg1;
        class168.field3457[0] = arg0;
        class66.field1606[0] = arg3;
        class74.field1809[0] = arg4;
        if (arg2 <= 36) {
            field2248 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)[[I")
    public final int[][] method831(int arg0) {
        field2269++;
        if (this.field2270 != this.field2259) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 <= 16) {
            return null;
        } else {
            for (int var2 = 0; var2 < this.field2259; var2++) {
                this.field2257[var2] = class50.field1232;
            }
            return this.field2265;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lea;IBZLdd;Lea;)V")
    public static final void method832(class38 arg0, int arg1, byte arg2, boolean arg3, class32 arg4, class38 arg5) {
        field2255++;
        int var6 = arg4.method207((byte) 32, arg0);
        if (arg2 <= 31) {
            field2263 = null;
        }
        int var7 = arg4.method212(arg5, -91, var6);
        class32.method204(arg1, var7, arg3, -15793, arg4, var6);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static final void method833(byte arg0) {
        class192.field3794.method173(false);
        field2254++;
        int var1 = class192.field3794.method176(8, 14);
        if (var1 < class177.field3593) {
            for (int var2 = var1; var2 < class177.field3593; var2++) {
                class39.field868[class136.field2850++] = class170.field3488[var2];
            }
        }
        if (arg0 != -12) {
            return;
        }
        if (class177.field3593 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class177.field3593 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class170.field3488[var3];
            class102 var5 = class105.field2343[var4];
            int var6 = class192.field3794.method176(1, arg0 ^ 0xFFFFFFC6);
            if (var6 == 0) {
                class170.field3488[class177.field3593++] = var4;
                var5.field381 = class45.field1098;
            } else {
                int var7 = class192.field3794.method176(2, 60);
                if (var7 == 0) {
                    class170.field3488[class177.field3593++] = var4;
                    var5.field381 = class45.field1098;
                    class96.field2163[class90.field2056++] = var4;
                } else if (var7 == 1) {
                    class170.field3488[class177.field3593++] = var4;
                    var5.field381 = class45.field1098;
                    int var8 = class192.field3794.method176(3, 99);
                    var5.method106(false, arg0 - 3511, var8);
                    int var9 = class192.field3794.method176(1, 118);
                    if (var9 == 1) {
                        class96.field2163[class90.field2056++] = var4;
                    }
                } else if (var7 == 2) {
                    class170.field3488[class177.field3593++] = var4;
                    var5.field381 = class45.field1098;
                    int var10 = class192.field3794.method176(3, arg0 ^ 0xFFFFFFC1);
                    var5.method106(true, arg0 ^ 0xDC9, var10);
                    int var11 = class192.field3794.method176(3, 43);
                    var5.method106(true, -3523, var11);
                    int var12 = class192.field3794.method176(1, 98);
                    if (var12 == 1) {
                        class96.field2163[class90.field2056++] = var4;
                    }
                } else if (var7 == 3) {
                    class39.field868[class136.field2850++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public static final void method834(boolean arg0) {
        if (!arg0) {
            field2251 = null;
        }
        field2250++;
        if (class129.field2766.toLowerCase().indexOf("microsoft") != -1) {
            class36.field766[188] = 71;
            class36.field766[186] = 57;
            class36.field766[189] = 26;
            class36.field766[223] = 28;
            class36.field766[191] = 73;
            class36.field766[192] = 58;
            class36.field766[220] = 74;
            class36.field766[222] = 59;
            class36.field766[190] = 72;
            class36.field766[187] = 27;
            class36.field766[221] = 43;
            class36.field766[219] = 42;
            return;
        }
        if (class129.field2762 == null) {
            class36.field766[222] = 59;
            class36.field766[192] = 58;
        } else {
            class36.field766[520] = 59;
            class36.field766[222] = 58;
            class36.field766[192] = 28;
        }
        class36.field766[92] = 74;
        class36.field766[46] = 72;
        class36.field766[93] = 43;
        class36.field766[47] = 73;
        class36.field766[45] = 26;
        class36.field766[61] = 27;
        class36.field766[59] = 57;
        class36.field766[91] = 42;
        class36.field766[44] = 71;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(III)V")
    public class101(int arg0, int arg1, int arg2) {
        this.field2257 = new class120[arg1];
        this.field2270 = arg1;
        this.field2259 = arg0;
        this.field2265 = new int[arg0][arg2];
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
    public final void method835(byte arg0) {
        field2260++;
        if (arg0 != -92) {
            return;
        }
        for (int var2 = 0; var2 < this.field2259; var2++) {
            this.field2265[var2] = null;
        }
        this.field2257 = null;
        this.field2265 = null;
        this.field2253.method1019(64);
        this.field2253 = null;
    }
}
