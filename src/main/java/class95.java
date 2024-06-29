import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class95 extends class121 {

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "[I")
    private int[] field2392 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "[S")
    private short[] field2391 = new short[6];

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "Z")
    public boolean field2404 = false;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "[S")
    private short[] field2396 = new short[6];

    @OriginalMember(owner = "client!ne", name = "sb", descriptor = "I")
    public int field2412 = -1;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    public static int field2399 = 0;

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "Z")
    public static boolean field2403 = false;

    @OriginalMember(owner = "client!ne", name = "nb", descriptor = "Lhe;")
    public static class54 field2407 = class6.method58("Fallen lassen", false);

    @OriginalMember(owner = "client!ne", name = "rb", descriptor = "[Z")
    private static boolean[] field2411 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!ne", name = "pb", descriptor = "[I")
    public static int[] field2409 = new int[128];

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "Lhe;")
    public static class54 field2395 = class6.method58("<col=c0ff00>", false);

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field2398 = 0;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "Lse;")
    public static class130 field2393 = new class130();

    @OriginalMember(owner = "client!ne", name = "xb", descriptor = "[I")
    public static int[] field2417 = new int[] { 2, 26, 57, 17, 34, 16, 48, 18 };

    @OriginalMember(owner = "client!ne", name = "zb", descriptor = "I")
    public static int field2419 = 0;

    @OriginalMember(owner = "client!ne", name = "Ab", descriptor = "[I")
    public static int[] field2420 = new int[128];

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!ne", name = "lb", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!ne", name = "mb", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ne", name = "ob", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ne", name = "qb", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ne", name = "vb", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!ne", name = "wb", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!ne", name = "yb", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!ne", name = "tb", descriptor = "Ldf;")
    public static class28 field2413;

    @OriginalMember(owner = "client!ne", name = "ub", descriptor = "Lia;")
    public static class57 field2414;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "[I")
    private int[] field2401;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)Lfe;")
    public final class41 method755(byte arg0) {
        field2402++;
        if (this.field2401 == null) {
            return null;
        }
        class41[] var2 = new class41[this.field2401.length];
        for (int var3 = 0; var3 < this.field2401.length; var3++) {
            var2[var3] = class41.method305(class124.field2867, this.field2401[var3], 0);
        }
        if (arg0 < 53) {
            method758(33, -6, 64, 23);
        }
        class41 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class41(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field2391[var5] != 0; var5++) {
            var4.method322(this.field2391[var5], this.field2396[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)Z")
    public final boolean method756(int arg0) {
        field2397++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2392[var3] != -1 && !class124.field2867.method260((byte) -4, this.field2392[var3], 0)) {
                var2 = false;
            }
        }
        int var4 = -121 % ((arg0 - 63) / 63);
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILm;)V")
    private final void method757(int arg0, int arg1, class83 arg2) {
        field2410++;
        if (arg1 == 1) {
            this.field2412 = arg2.method638(0);
        } else if (arg1 == 2) {
            int var4 = arg2.method638(0);
            this.field2401 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2401[var5] = arg2.method631((byte) -122);
            }
        } else if (arg1 == 3) {
            this.field2404 = true;
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field2391[arg1 - 40] = (short) arg2.method631((byte) -125);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field2396[arg1 - 50] = (short) arg2.method631((byte) -114);
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2392[arg1 - 60] = arg2.method631((byte) -122);
        }
        if (arg0 != 34) {
            method764(true);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)V")
    public static final void method758(int arg0, int arg1, int arg2, int arg3) {
        field2415++;
        class93 var4 = class105.method811(arg1, -1, arg2);
        if (arg3 > -30) {
            field2398 = -4;
        }
        if (var4 != null && var4.field2259 != null) {
            class100 var5 = new class100();
            var5.field2537 = var4;
            var5.field2522 = var4.field2259;
            class32.method242(1, var5);
        }
        class141.field3216 = true;
        class121.field2811 = arg1;
        class85.field2119 = arg2;
        class68.field1700 = arg0;
        class134.method1005(var4, 0);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static void method759(byte arg0) {
        if (arg0 != 20) {
            field2413 = null;
        }
        field2414 = null;
        field2409 = null;
        field2413 = null;
        field2411 = null;
        field2395 = null;
        field2393 = null;
        field2417 = null;
        field2407 = null;
        field2420 = null;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)Z")
    public final boolean method760(int arg0) {
        field2416++;
        if (this.field2401 == null) {
            return true;
        }
        if (arg0 != 23232) {
            this.field2404 = true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2401.length; var3++) {
            if (!class124.field2867.method260((byte) -4, this.field2401[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILnc;)I")
    public static final int method761(byte arg0, int arg1, class93 arg2) {
        field2405++;
        if (arg2.field2235 == null || arg2.field2235.length <= arg1) {
            return -2;
        }
        try {
            if (arg0 < 41) {
                return -86;
            }
            int[] var3 = arg2.field2235[arg1];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var6++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var9 = class149.field3376[var3[var6++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 2) {
                    var9 = class63.field1546[var3[var6++]];
                }
                if (var7 == 3) {
                    var9 = class87.field2159[var3[var6++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class93 var12 = class121.method938(true, var11);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class141.method1088(var13, (byte) -106).field1663 || class150.field3395)) {
                        for (int var14 = 0; var14 < var12.field2280.length; var14++) {
                            if (var13 + 1 == var12.field2280[var14]) {
                                var9 += var12.field2317[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class63.field1540[var3[var6++]];
                }
                if (var7 == 6) {
                    var9 = class66.field1591[class63.field1546[var3[var6++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class63.field1540[var3[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class108.field2639.field617;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (field2411[var15]) {
                            var9 += class63.field1546[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class93 var18 = class121.method938(true, var17);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class141.method1088(var19, (byte) -127).field1663 || class150.field3395)) {
                        for (int var20 = 0; var20 < var18.field2280.length; var20++) {
                            if (var19 + 1 == var18.field2280[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class38.field953;
                }
                if (var7 == 12) {
                    var9 = class150.field3393;
                }
                if (var7 == 13) {
                    int var21 = class63.field1540[var3[var6++]];
                    int var22 = var3[var6++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var6++];
                    var9 = class111.method839(-1, var23);
                }
                if (var7 == 18) {
                    var9 = (class108.field2639.field974 >> 7) + class11.field323;
                }
                if (var7 == 19) {
                    var9 = (class108.field2639.field971 >> 7) + class67.field1648;
                }
                if (var7 == 20) {
                    var9 = var3[var6++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var4 += var9;
                    }
                    if (var5 == 1) {
                        var4 -= var9;
                    }
                    if (var5 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var5 == 3) {
                        var4 *= var9;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lm;I)V")
    public final void method762(class83 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method638(0);
            if (var3 == 0) {
                field2400++;
                if (arg1 != 0) {
                    field2393 = null;
                    return;
                }
                return;
            }
            this.method757(34, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)Lfe;")
    public final class41 method763(int arg0) {
        class41[] var2 = new class41[5];
        field2394++;
        int var3 = 0;
        if (arg0 != -1) {
            return null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2392[var4] != -1) {
                var2[var3++] = class41.method305(class124.field2867, this.field2392[var4], 0);
            }
        }
        class41 var5 = new class41(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field2391[var6] != 0; var6++) {
            var5.method322(this.field2391[var6], this.field2396[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)V")
    public static final void method764(boolean arg0) {
        class138 var1 = (class138) class83.field2039.method979(-122);
        if (arg0) {
            return;
        }
        while (var1 != null) {
            if (var1.field3166 != null) {
                var1.method1070(false);
            }
            var1 = (class138) class83.field2039.method983(18485);
        }
        field2408++;
    }
}
