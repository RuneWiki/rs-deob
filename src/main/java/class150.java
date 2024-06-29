import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class150 extends class73 {

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "[B")
    public byte[] field2839;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "[B")
    public byte[] field2837;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "[I")
    private int[] field2829;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "[B")
    public byte[] field2840;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "[Lhj;")
    public class25[] field2850;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "[Lsa;")
    public class91[] field2831;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "[S")
    public short[] field2835;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public int field2833;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "[I")
    public static int[] field2834 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field2832 = 0;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "Lli;")
    public static class185 field2843 = class245.method1649(" loggt sich aus)3", 125);

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Lli;")
    public static class185 field2828 = class245.method1649(":clan:", 1);

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "Lli;")
    private static class185 field2851 = class245.method1649("Connecting to update server", 127);

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "Lli;")
    public static class185 field2849 = class245.method1649(":duelfriend:", 127);

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "Lli;")
    public static class185 field2845 = field2851;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "Lhi;")
    public static class250 field2841;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "[[[B")
    public static byte[][][] field2836;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static void method1064(byte arg0) {
        if (arg0 != -53) {
            field2836 = null;
        }
        field2841 = null;
        field2834 = null;
        field2845 = null;
        field2843 = null;
        field2836 = null;
        field2849 = null;
        field2851 = null;
        field2828 = null;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public final void method1065(int arg0) {
        field2838++;
        if (arg0 != -1) {
            this.field2833 = -10;
        }
        this.field2829 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1066(Component arg0, int arg1) {
        arg0.removeMouseListener(class27.field460);
        arg0.removeMouseMotionListener(class27.field460);
        if (arg1 != 0) {
            method1067(12, 107, -104, 43);
        }
        field2844++;
        arg0.removeFocusListener(class27.field460);
        class25.field419 = 0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)V")
    public static final void method1067(int arg0, int arg1, int arg2, int arg3) {
        field2846++;
        class185 var4 = class87.method567(-11039, new class185[] { class212.field3900, class90.method591(arg1, 0), class179.field3297, class90.method591(arg2 >> 6, arg3 + 445958970), class179.field3297, class90.method591(arg0 >> 6, 0), class179.field3297, class90.method591(arg2 & 0x3F, 0), class179.field3297, class90.method591(arg0 & 0x3F, 0) });
        var4.method1326(false);
        class135.method967(var4, 5951);
        if (arg3 != -445958970) {
            field2834 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1068(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2842++;
        int var7 = 23 / ((arg3 + 59) / 51);
        if (class187.field3471 == 0) {
            int var8 = class243.field4349;
            int var9 = class193.field3569;
            int var10 = class80.field1405;
            int var11 = class196.field3600;
            int var12 = (arg6 - arg5) * (var11 - var8) / arg2 + var8;
            int var13 = (arg0 - arg4) * (var10 - var9) / arg1 + var9;
            if (class254.field4504 && (class214.field3908 & 0x40) == 64) {
                class82 var14 = class157.method1115(6684, class140.field2617, class148.field2805);
                if (var14 == null) {
                    class260.method1763(true);
                } else {
                    class105.method738(0L, var12, class122.field2218, (short) 4, -1, class102.field1856, var13, -114);
                }
            } else {
                class232.field4173++;
                if (class235.field4218 == 1) {
                    class105.method738(0L, var12, class20.field336, (short) 20, -1, class135.field2534, var13, -127);
                }
                class105.method738(0L, var12, class20.field336, (short) 42, -1, class24.field403, var13, -123);
            }
        }
        long var15 = -1L;
        for (int var17 = 0; var17 < class6.field135; var17++) {
            long var18 = class169.field3140[var17];
            int var20 = (int) var18 & 0x7F;
            int var21 = ((int) var18 & 0x6687508B) >> 29;
            int var22 = (int) var18 >> 7 & 0x7F;
            int var23 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            if (var15 != var18) {
                var15 = var18;
                if (var21 == 2 && class52.method345(class265.field4703, var20, var22, var18)) {
                    class135 var24 = class184.method1294(var23, -28916);
                    if (var24.field2502 != null) {
                        var24 = var24.method964((byte) 11);
                    }
                    if (var24 == null) {
                        continue;
                    }
                    if (class187.field3471 == 1) {
                        class260.field4624++;
                        class105.method738(var18, var20, class87.method567(-11039, new class185[] { class264.field4689, class153.field2898, var24.field2541 }), (short) 8, class181.field3335, class32.field523, var22, -106);
                    } else if (!class254.field4504) {
                        class166.field3105++;
                        class185[] var25 = var24.field2491;
                        if (class47.field760) {
                            var25 = class194.method1399(var25, -1);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class146.field2773++;
                                    int var27 = -1;
                                    if (var24.field2484 == var26) {
                                        var27 = var24.field2489;
                                    }
                                    short var28 = 0;
                                    if (var24.field2485 == var26) {
                                        var27 = var24.field2501;
                                    }
                                    if (var26 == 0) {
                                        var28 = 1;
                                    }
                                    if (var26 == 1) {
                                        var28 = 3;
                                    }
                                    if (var26 == 2) {
                                        var28 = 38;
                                    }
                                    if (var26 == 3) {
                                        var28 = 5;
                                    }
                                    if (var26 == 4) {
                                        var28 = 1002;
                                    }
                                    class105.method738(var18, var20, class87.method567(-11039, new class185[] { class49.field801, var24.field2541 }), var28, var27, var25[var26], var22, -110);
                                }
                            }
                        }
                        class105.method738((long) var24.field2527, var20, class87.method567(-11039, new class185[] { class49.field801, var24.field2541 }), (short) 1005, class248.field4405, class206.field3779, var22, -107);
                    } else if ((class214.field3908 & 0x4) == 4) {
                        class204.field3729++;
                        class105.method738(var18, var20, class87.method567(-11039, new class185[] { class110.field1980, class153.field2898, var24.field2541 }), (short) 57, -1, class102.field1856, var22, -100);
                    }
                }
                if (var21 == 1) {
                    class71 var29 = class87.field1712[var23];
                    if (var29.field1236.field1452 == 1 && (var29.field2694 & 0x7F) == 64 && (var29.field2687 & 0x7F) == 64) {
                        for (int var30 = 0; var30 < class108.field1943; var30++) {
                            class71 var33 = class87.field1712[class97.field1811[var30]];
                            if (var33 != null && var29 != var33 && var33.field1236.field1452 == 1 && var29.field2694 == var33.field2694 && var29.field2687 == var33.field2687) {
                                class273.method1872(var20, var22, var33.field1236, class97.field1811[var30], (byte) 100);
                            }
                        }
                        for (int var31 = 0; var31 < class17.field281; var31++) {
                            class188 var32 = class93.field1774[class174.field3187[var31]];
                            if (var32 != null && var29.field2694 == var32.field2694 && var29.field2687 == var32.field2687) {
                                class69.method457(var32, class174.field3187[var31], (byte) 24, var20, var22);
                            }
                        }
                    }
                    class273.method1872(var20, var22, var29.field1236, var23, (byte) 108);
                }
                if (var21 == 0) {
                    class188 var34 = class93.field1774[var23];
                    if ((var34.field2694 & 0x7F) == 64 && (var34.field2687 & 0x7F) == 64) {
                        for (int var35 = 0; var35 < class108.field1943; var35++) {
                            class71 var38 = class87.field1712[class97.field1811[var35]];
                            if (var38 != null && var38.field1236.field1452 == 1 && var34.field2694 == var38.field2694 && var34.field2687 == var38.field2687) {
                                class273.method1872(var20, var22, var38.field1236, class97.field1811[var35], (byte) 113);
                            }
                        }
                        for (int var36 = 0; var36 < class17.field281; var36++) {
                            class188 var37 = class93.field1774[class174.field3187[var36]];
                            if (var37 != null && var34 != var37 && var34.field2694 == var37.field2694 && var34.field2687 == var37.field2687) {
                                class69.method457(var37, class174.field3187[var36], (byte) 24, var20, var22);
                            }
                        }
                    }
                    class69.method457(var34, var23, (byte) 24, var20, var22);
                }
                if (var21 == 3) {
                    class191 var39 = class71.field1238[class265.field4703][var20][var22];
                    if (var39 != null) {
                        for (class176 var40 = (class176) var39.method1374(256); var40 != null; var40 = (class176) var39.method1381((byte) 125)) {
                            int var41 = var40.field3223.field1852;
                            class134 var42 = class165.method1179(102, var41);
                            if (class187.field3471 == 1) {
                                class42.field647++;
                                class105.method738((long) var41, var20, class87.method567(-11039, new class185[] { class264.field4689, class71.field1252, var42.field2436 }), (short) 40, class181.field3335, class32.field523, var22, -98);
                            } else if (!class254.field4504) {
                                class135.field2493++;
                                class185[] var43 = var42.field2393;
                                if (class47.field760) {
                                    var43 = class194.method1399(var43, -1);
                                }
                                for (int var44 = 4; var44 >= 0; var44--) {
                                    if (var43 != null && var43[var44] != null) {
                                        class175.field3209++;
                                        byte var45 = 0;
                                        if (var44 == 0) {
                                            var45 = 60;
                                        }
                                        if (var44 == 1) {
                                            var45 = 39;
                                        }
                                        if (var44 == 2) {
                                            var45 = 18;
                                        }
                                        int var46 = -1;
                                        if (var42.field2451 == var44) {
                                            var46 = var42.field2423;
                                        }
                                        if (var42.field2457 == var44) {
                                            var46 = var42.field2395;
                                        }
                                        if (var44 == 3) {
                                            var45 = 59;
                                        }
                                        if (var44 == 4) {
                                            var45 = 25;
                                        }
                                        class105.method738((long) var41, var20, class87.method567(-11039, new class185[] { class20.field335, var42.field2436 }), var45, var46, var43[var44], var22, -100);
                                    }
                                }
                                class105.method738((long) var41, var20, class87.method567(-11039, new class185[] { class20.field335, var42.field2436 }), (short) 1003, class248.field4405, class206.field3779, var22, -115);
                            } else if ((class214.field3908 & 0x1) == 1) {
                                class105.field1895++;
                                class105.method738((long) var41, var20, class87.method567(-11039, new class185[] { class110.field1980, class71.field1252, var42.field2436 }), (short) 7, -1, class102.field1856, var22, -100);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lhl;[II[B)Z")
    public final boolean method1069(class54 arg0, int[] arg1, int arg2, byte[] arg3) {
        int var5 = 0;
        field2848++;
        if (arg2 != -1) {
            return false;
        }
        boolean var6 = true;
        class91 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field2829[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method371((byte) 85, arg1, var9 >> 2);
                        } else {
                            var7 = arg0.method373(var9 >> 2, (byte) -93, arg1);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2831[var8] = var7;
                        this.field2829[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class150() {
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([B)V")
    public class150(byte[] arg0) {
        this.field2839 = new byte[128];
        this.field2837 = new byte[128];
        this.field2829 = new int[128];
        this.field2840 = new byte[128];
        this.field2850 = new class25[128];
        this.field2831 = new class91[128];
        int var2 = 0;
        this.field2835 = new short[128];
        class118 var3 = new class118(arg0);
        while (var3.field2115[var3.field2155 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method838(1275919136);
        }
        var2++;
        var3.field2155++;
        int var6 = var3.field2155;
        var3.field2155 += var2;
        int var7;
        for (var7 = 0; var3.field2115[var3.field2155 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method838(1275919136);
        }
        var3.field2155++;
        var7++;
        int var10 = var3.field2155;
        var3.field2155 += var7;
        int var11;
        for (var11 = 0; var3.field2115[var3.field2155 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method838(1275919136);
        }
        var11++;
        var3.field2155++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method867(false);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class25[] var19 = new class25[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class25 var103 = var19[var20] = new class25();
            int var104 = var3.method867(false);
            if (var104 > 0) {
                var103.field417 = new byte[var104 * 2];
            }
            int var105 = var3.method867(false);
            if (var105 > 0) {
                var103.field427 = new byte[var105 * 2 + 2];
                var103.field427[1] = 64;
            }
        }
        int var21 = var3.method867(false);
        int var22 = 0;
        byte[] var23 = var21 <= 0 ? null : new byte[var21 * 2];
        int var24 = var3.method867(false);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        while (var3.field2115[var3.field2155 + var22] != 0) {
            var22++;
        }
        byte[] var26 = new byte[var22];
        for (int var27 = 0; var27 < var22; var27++) {
            var26[var27] = var3.method838(1275919136);
        }
        int var28 = 0;
        var3.field2155++;
        var22++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method867(false);
            this.field2835[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method867(false);
            this.field2835[var31] = (short) (this.field2835[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var3.method839(17760);
            }
            this.field2835[var35] = (short) (this.field2835[var35] + class220.method1526(var34 - 1 << 14, 32768));
            var32--;
            this.field2829[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2829[var39] != 0) {
                if (var37 == 0) {
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                    var38 = var3.field2115[var6++] - 1;
                }
                var37--;
                this.field2840[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2829[var43] != 0) {
                if (var41 == 0) {
                    var42 = var3.field2115[var10++] + 16 << 2;
                    if (var40 >= var8.length) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                }
                this.field2837[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class25 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2829[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 < var12.length) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                var45--;
                this.field2850[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length <= var48) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field2829[var51] > 0) {
                    var50 = var3.method867(false) + 1;
                }
            }
            var49--;
            this.field2839[var51] = (byte) var50;
        }
        this.field2833 = var3.method867(false) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class25 var100 = var19[var52];
            if (var100.field417 != null) {
                for (int var101 = 1; var101 < var100.field417.length; var101 += 2) {
                    var100.field417[var101] = var3.method838(1275919136);
                }
            }
            if (var100.field427 != null) {
                for (int var102 = 3; var102 < var100.field427.length - 2; var102 += 2) {
                    var100.field427[var102] = var3.method838(1275919136);
                }
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method838(1275919136);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method838(1275919136);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class25 var97 = var19[var55];
            if (var97.field427 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field427.length; var99 += 2) {
                    var98 = (var98 + var3.method867(false)) + 1;
                    var97.field427[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class25 var94 = var19[var56];
            if (var94.field417 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field417.length; var96 += 2) {
                    var95 = var95 + var3.method867(false) + 1;
                    var94.field417[var96] = (byte) var95;
                }
            }
        }
        if (var23 != null) {
            int var57 = var3.method867(false);
            var23[0] = (byte) var57;
            for (int var58 = 2; var58 < var23.length; var58 += 2) {
                var57 = var57 + var3.method867(false) + 1;
                var23[var58] = (byte) var57;
            }
            byte var59 = var23[0];
            byte var60 = var23[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2839[var61] = (byte) (this.field2839[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var23.length > var62) {
                byte var65 = var23[var62 + 1];
                byte var66 = var23[var62];
                int var67 = (var66 - var59) / 2 + (var66 - var59) * var60;
                for (int var68 = var59; var68 < var66; var68++) {
                    int var69 = class135.method971(var66 - var59, var67, 5);
                    this.field2839[var68] = (byte) (this.field2839[var68] * var69 + 32 >> 6);
                    var67 += var65 - var60;
                }
                var60 = var65;
                var62 += 2;
                var59 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field2839[var64] = (byte) (this.field2839[var64] * var60 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var3.method867(false);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var70 + var3.method867(false) + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2837[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2837[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var25.length > var75) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class135.method971(var79 - var72, var81, 5);
                    var81 += var80 - var73;
                    int var84 = (this.field2837[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2837[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field2837[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2837[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field423 = var3.method867(false);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class25 var93 = var19[var87];
            if (var93.field417 != null) {
                var93.field431 = var3.method867(false);
            }
            if (var93.field427 != null) {
                var93.field428 = var3.method867(false);
            }
            if (var93.field423 > 0) {
                var93.field415 = var3.method867(false);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field421 = var3.method867(false);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class25 var92 = var19[var89];
            if (var92.field421 > 0) {
                var92.field424 = var3.method867(false);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class25 var91 = var19[var90];
            if (var91.field424 > 0) {
                var91.field430 = var3.method867(false);
            }
        }
    }
}
