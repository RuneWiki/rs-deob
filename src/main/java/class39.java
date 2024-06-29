import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class39 {

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Lbi;")
    private class94 field583;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Lig;")
    private class9 field582;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lre;")
    private class229 field581;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "[J")
    public static long[] field575 = new long[32];

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field588 = 1;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Lke;")
    public static class110 field587;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lql;")
    private class224 field573;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Lhc;")
    public static class235 field589;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "[I")
    public static int[] field576;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[Lj;")
    private class168[] field580;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Z")
    public final boolean method254(byte arg0) {
        field579++;
        if (this.field573 != null) {
            return true;
        }
        if (this.field581 == null) {
            if (this.field583.method633(-30387)) {
                return false;
            }
            this.field581 = this.field583.method634(-86, 255, true, (byte) 0, 255);
        }
        if (arg0 > -47) {
            field587 = null;
        }
        if (this.field581.field1519) {
            return false;
        } else {
            this.field573 = new class224(this.field581.method142(94));
            this.field580 = new class168[(this.field573.field3336.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lse;II)I")
    public static final int method255(class211 arg0, int arg1, int arg2) {
        field577++;
        if (arg0.field3019 == null || arg1 >= arg0.field3019.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;
            int[] var6 = arg0.field3019[arg1];
            while (true) {
                int var7 = 0;
                int var8 = var6[var4++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var3;
                }
                if (var8 == 1) {
                    var7 = class180.field2521[var6[var4++]];
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 2) {
                    var7 = class15.field149[var6[var4++]];
                }
                if (var8 == 3) {
                    var7 = class149.field2060[var6[var4++]];
                }
                if (var8 == 4) {
                    int var10 = var6[var4++] << 16;
                    int var11 = var10 + var6[var4++];
                    class211 var12 = class67.method421(var11, 0);
                    int var13 = var6[var4++];
                    if (var13 != -1 && (!class73.method463(var13, -31104).field481 || class180.field2522)) {
                        for (int var14 = 0; var14 < var12.field3015.length; var14++) {
                            if ((var13 + 1) == var12.field3015[var14]) {
                                var7 += var12.field3005[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class120.field1688[var6[var4++]];
                }
                if (var8 == 6) {
                    var7 = class204.field2840[class15.field149[var6[var4++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class120.field1688[var6[var4++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var7 = class217.field3280.field1190;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class254.field3882[var15]) {
                            var7 += class15.field149[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var6[var4++] << 16;
                    int var17 = var16 + var6[var4++];
                    class211 var18 = class67.method421(var17, 0);
                    int var19 = var6[var4++];
                    if (var19 != -1 && (!class73.method463(var19, -31104).field481 || class180.field2522)) {
                        for (int var20 = 0; var20 < var18.field3015.length; var20++) {
                            if ((var19 + 1) == var18.field3015[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class231.field3504;
                }
                if (var8 == 12) {
                    var7 = class42.field626;
                }
                if (var8 == 13) {
                    int var21 = class120.field1688[var6[var4++]];
                    int var22 = var6[var4++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var6[var4++];
                    var7 = class282.method1895(var23, arg2 + 268);
                }
                if (var8 == 18) {
                    var7 = (class217.field3280.field4019 >> 7) + class37.field565;
                }
                if (var8 == 19) {
                    var7 = (class217.field3280.field4085 >> 7) + class216.field3255;
                }
                if (var8 == 20) {
                    var7 = var6[var4++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var3 += var7;
                    }
                    if (var5 == 1) {
                        var3 -= var7;
                    }
                    if (var5 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var5 == 3) {
                        var3 *= var7;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            if (arg2 != -12) {
                method260(12, -109, 127);
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static final void method256(int arg0) {
        if (arg0 == 2) {
            class179.field2505.method546(-90762264);
            field584++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLkb;Lkb;ZI)Lj;")
    private final class168 method257(byte arg0, class54 arg1, class54 arg2, boolean arg3, int arg4) {
        field592++;
        if (this.field573 == null) {
            throw new RuntimeException();
        }
        this.field573.field3402 = arg4 * 8 + 5;
        if (this.field573.field3402 >= this.field573.field3336.length) {
            throw new RuntimeException();
        } else if (this.field580[arg4] == null) {
            int var6 = this.field573.method1483((byte) 46);
            int var7 = this.field573.method1483((byte) 46);
            class168 var8 = new class168(arg4, arg2, arg1, this.field583, this.field582, var6, var7, arg3);
            this.field580[arg4] = var8;
            if (arg0 != -36) {
                method255((class211) null, -17, -69);
            }
            return var8;
        } else {
            return this.field580[arg4];
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static void method258(int arg0) {
        field587 = null;
        if (arg0 == 1) {
            field589 = null;
            field575 = null;
            field576 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lbi;Lig;)V")
    public class39(class94 arg0, class9 arg1) {
        this.field583 = arg0;
        this.field582 = arg1;
        if (!this.field583.method633(-30387)) {
            this.field581 = this.field583.method634(-80, 255, true, (byte) 0, 255);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public static final void method259(int arg0) {
        if (arg0 != 3) {
            field587 = null;
        }
        int var1 = class233.field3518.method1865(8, 8);
        field586++;
        if (var1 < class103.field1442) {
            for (int var2 = var1; var2 < class103.field1442; var2++) {
                class74.field1041[class293.field4601++] = class205.field2848[var2];
            }
        }
        if (class103.field1442 < var1) {
            throw new RuntimeException("gppov1");
        }
        class103.field1442 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class205.field2848[var3];
            class88 var5 = class154.field2133[var4];
            int var6 = class233.field3518.method1865(1, arg0 + 5);
            if (var6 == 0) {
                class205.field2848[class103.field1442++] = var4;
                var5.field4090 = class52.field740;
            } else {
                int var7 = class233.field3518.method1865(2, 8);
                if (var7 == 0) {
                    class205.field2848[class103.field1442++] = var4;
                    var5.field4090 = class52.field740;
                    class63.field870[class242.field3711++] = var4;
                } else if (var7 == 1) {
                    class205.field2848[class103.field1442++] = var4;
                    var5.field4090 = class52.field740;
                    int var8 = class233.field3518.method1865(3, 8);
                    var5.method1743((byte) 102, 1, var8);
                    int var9 = class233.field3518.method1865(1, 8);
                    if (var9 == 1) {
                        class63.field870[class242.field3711++] = var4;
                    }
                } else if (var7 == 2) {
                    class205.field2848[class103.field1442++] = var4;
                    var5.field4090 = class52.field740;
                    if (class233.field3518.method1865(1, 8) == 1) {
                        int var11 = class233.field3518.method1865(3, 8);
                        var5.method1743((byte) 110, 2, var11);
                        int var12 = class233.field3518.method1865(3, 8);
                        var5.method1743((byte) -28, 2, var12);
                    } else {
                        int var10 = class233.field3518.method1865(3, arg0 + 5);
                        var5.method1743((byte) -91, 0, var10);
                    }
                    int var13 = class233.field3518.method1865(1, 8);
                    if (var13 == 1) {
                        class63.field870[class242.field3711++] = var4;
                    }
                } else if (var7 == 3) {
                    class74.field1041[class293.field4601++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    public static final void method260(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class27.field342; var3++) {
            for (int var4 = 0; var4 < class127.field1802; var4++) {
                for (int var5 = 0; var5 < class234.field3531; var5++) {
                    class89 var6 = class194.field2682[var3][var4][var5];
                    if (var6 != null) {
                        class197 var7 = var6.field1244;
                        if (var7 != null && var7.field2725.method1774()) {
                            class62.method383(var7.field2725, var3, var4, var5, 1, 1);
                            if (var7.field2727 != null && var7.field2727.method1774()) {
                                class62.method383(var7.field2727, var3, var4, var5, 1, 1);
                                var7.field2725.method1773(var7.field2727, 0, 0, 0, false);
                                var7.field2727 = var7.field2727.method1772(arg0, arg1, arg2);
                            }
                            var7.field2725 = var7.field2725.method1772(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1240; var8++) {
                            class198 var10 = var6.field1226[var8];
                            if (var10 != null && var10.field2752.method1774()) {
                                class62.method383(var10.field2752, var3, var4, var5, var10.field2765 + 1 - var10.field2746, var10.field2763 - var10.field2748 + 1);
                                var10.field2752 = var10.field2752.method1772(arg0, arg1, arg2);
                            }
                        }
                        class23 var9 = var6.field1237;
                        if (var9 != null && var9.field328.method1774()) {
                            class5.method33(var9.field328, var3, var4, var5);
                            var9.field328 = var9.field328.method1772(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILql;)V")
    public static final void method261(int arg0, int arg1, class224 arg2) {
        field590++;
        if (arg1 != 25 || class268.field4105 == null) {
            return;
        }
        try {
            class268.field4105.method1143(0L, -110);
            class268.field4105.method1138(arg0, 24, (byte) 30, arg2.field3336);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
    public static final void method262(int arg0) {
        class233.field3518.method1856((byte) -45);
        int var1 = class233.field3518.method1865(8, 8);
        if (var1 < class92.field1283) {
            for (int var2 = var1; var2 < class92.field1283; var2++) {
                class74.field1041[class293.field4601++] = class194.field2688[var2];
            }
        }
        field591++;
        if (class92.field1283 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class92.field1283 = 0;
        int var3 = 0;
        if (arg0 != -3) {
            return;
        }
        while (var1 > var3) {
            int var4 = class194.field2688[var3];
            class140 var5 = class119.field1679[var4];
            int var6 = class233.field3518.method1865(1, arg0 + 11);
            if (var6 == 0) {
                class194.field2688[class92.field1283++] = var4;
                var5.field4090 = class52.field740;
            } else {
                int var7 = class233.field3518.method1865(2, 8);
                if (var7 == 0) {
                    class194.field2688[class92.field1283++] = var4;
                    var5.field4090 = class52.field740;
                    class63.field870[class242.field3711++] = var4;
                } else if (var7 == 1) {
                    class194.field2688[class92.field1283++] = var4;
                    var5.field4090 = class52.field740;
                    int var8 = class233.field3518.method1865(3, 8);
                    var5.method1743((byte) -15, 1, var8);
                    int var9 = class233.field3518.method1865(1, 8);
                    if (var9 == 1) {
                        class63.field870[class242.field3711++] = var4;
                    }
                } else if (var7 == 2) {
                    class194.field2688[class92.field1283++] = var4;
                    var5.field4090 = class52.field740;
                    if (class233.field3518.method1865(1, 8) == 1) {
                        int var10 = class233.field3518.method1865(3, 8);
                        var5.method1743((byte) 111, 2, var10);
                        int var11 = class233.field3518.method1865(3, arg0 ^ 0xFFFFFFF5);
                        var5.method1743((byte) 108, 2, var11);
                    } else {
                        int var12 = class233.field3518.method1865(3, 8);
                        var5.method1743((byte) -97, 0, var12);
                    }
                    int var13 = class233.field3518.method1865(1, arg0 + 11);
                    if (var13 == 1) {
                        class63.field870[class242.field3711++] = var4;
                    }
                } else if (var7 == 3) {
                    class74.field1041[class293.field4601++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lkb;Lkb;II)Lj;")
    public final class168 method263(class54 arg0, class54 arg1, int arg2, int arg3) {
        field585++;
        if (arg2 != 0) {
            this.field573 = null;
        }
        return this.method257((byte) -36, arg0, arg1, true, arg3);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    public final void method264(byte arg0) {
        field578++;
        if (this.field580 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field580.length; var2++) {
            if (this.field580[var2] != null) {
                this.field580[var2].method1106(117);
            }
        }
        for (int var3 = 0; var3 < this.field580.length; var3++) {
            if (this.field580[var3] != null) {
                this.field580[var3].method1102(false);
            }
        }
        if (arg0 > -127) {
            this.method254((byte) 58);
        }
    }
}
