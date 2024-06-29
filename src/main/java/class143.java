import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class143 extends class140 {

    @OriginalMember(owner = "client!ue", name = "bc", descriptor = "Z")
    public boolean field3332 = false;

    @OriginalMember(owner = "client!ue", name = "Xb", descriptor = "I")
    private int field3328 = 0;

    @OriginalMember(owner = "client!ue", name = "rc", descriptor = "I")
    private int field3348 = 0;

    @OriginalMember(owner = "client!ue", name = "Zb", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!ue", name = "pc", descriptor = "I")
    public int field3346;

    @OriginalMember(owner = "client!ue", name = "tc", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!ue", name = "fc", descriptor = "I")
    private int field3336;

    @OriginalMember(owner = "client!ue", name = "mc", descriptor = "I")
    public int field3343;

    @OriginalMember(owner = "client!ue", name = "Wb", descriptor = "I")
    public int field3327;

    @OriginalMember(owner = "client!ue", name = "wc", descriptor = "Lbd;")
    private class12 field3353;

    @OriginalMember(owner = "client!ue", name = "hc", descriptor = "Lja;")
    private static class62 field3338 = class30.method243(43, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!ue", name = "nc", descriptor = "Z")
    public static volatile boolean field3344 = true;

    @OriginalMember(owner = "client!ue", name = "kc", descriptor = "Lja;")
    public static class62 field3341 = class30.method243(43, "titlebox");

    @OriginalMember(owner = "client!ue", name = "gc", descriptor = "Lja;")
    public static class62 field3337 = class30.method243(43, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ue", name = "sc", descriptor = "Lja;")
    public static class62 field3349 = field3338;

    @OriginalMember(owner = "client!ue", name = "Vb", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!ue", name = "Yb", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ue", name = "ac", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!ue", name = "cc", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ue", name = "dc", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!ue", name = "ic", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ue", name = "jc", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ue", name = "lc", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ue", name = "oc", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ue", name = "qc", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ue", name = "uc", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ue", name = "vc", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!ue", name = "ec", descriptor = "[I")
    public static int[] field3335;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
    public static void method1128(int arg0) {
        field3349 = null;
        field3335 = null;
        field3341 = null;
        field3337 = null;
        if (arg0 != -2) {
            field3349 = null;
        }
        field3338 = null;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(B)Lvb;")
    public final class145 method321(byte arg0) {
        if (arg0 != 3) {
            this.field3327 = 74;
        }
        field3352++;
        class120 var2 = class38.method289(this.field3336, 2116);
        class145 var3;
        if (this.field3332) {
            var3 = var2.method961(-1, -97);
        } else {
            var3 = var2.method961(this.field3328, -48);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(II)V")
    public static final void method1129(int arg0, int arg1) {
        field3331++;
        class47.field1093 = arg1;
        if (arg0 != 0) {
            field3337 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
    public static final void method1130(int arg0) {
        class59.field1438 = new class68(32);
        field3334++;
        int var1 = -122 % (-arg0 / 58);
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(II)V")
    public final void method1131(int arg0, int arg1) {
        field3345++;
        if (this.field3332) {
            return;
        }
        this.field3348 += arg0;
        while (this.field3348 > this.field3353.field280[this.field3328]) {
            this.field3348 -= this.field3353.field280[this.field3328];
            this.field3328++;
            if (this.field3353.field263.length <= this.field3328) {
                this.field3332 = true;
                break;
            }
        }
        if (arg1 <= 30) {
            method1130(-95);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    private static final void method1132(boolean arg0) {
        field3340++;
        for (int var1 = -1; var1 < class147.field3460; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class141.field3311[var1];
            }
            class115 var6 = class52.field1200[var5];
            if (var6 != null && var6.field170 > 0) {
                var6.field170--;
                if (var6.field170 == 0) {
                    var6.field157 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class83.field2001; var2++) {
            int var3 = class36.field871[var2];
            class130 var4 = class136.field3127[var3];
            if (var4 != null && var4.field170 > 0) {
                var4.field170--;
                if (var4.field170 == 0) {
                    var4.field157 = null;
                }
            }
        }
        if (!arg0) {
            method1129(65, 63);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILq;)V")
    public static final void method1133(int arg0, class114 arg1) {
        field3339++;
        short var2 = 256;
        for (int var3 = arg0; var3 < class75.field1867.length; var3++) {
            class75.field1867[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class75.field1867[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class4.field52[var15] = (class75.field1867[var15 - 1] + class75.field1867[var15 - 128] + class75.field1867[var15 + 128] + class75.field1867[var15 - -1]) / 4;
                }
            }
            int[] var13 = class75.field1867;
            class75.field1867 = class4.field52;
            class4.field52 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field2624; var7++) {
            for (int var8 = 0; var8 < arg1.field2625; var8++) {
                if (arg1.field2620[var6++] != 0) {
                    int var9 = var7 + arg1.field2619 + 16;
                    int var10 = arg1.field2623 + var8 + 16;
                    int var11 = (var9 << 7) + var10;
                    class75.field1867[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILpd;II)Lmf;")
    public static final class89 method1134(int arg0, class108 arg1, int arg2, int arg3) {
        if (arg0 >= -60) {
            field3349 = null;
        }
        field3326++;
        return class63.method478(arg3, arg2, arg1, (byte) 127) ? class86.method664(-35) : null;
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)V")
    public static final void method1135(int arg0) {
        class142.field3319.method127((byte) -126);
        if (arg0 != 764) {
            method1128(17);
        }
        field3342++;
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "(B)V")
    public static final void method1136(byte arg0) {
        int var1 = 62 / ((-arg0 - 2) / 62);
        if (class52.field1192 > 0) {
            class52.field1192--;
        }
        field3347++;
        if (class26.field625 > 1) {
            class26.field625--;
        }
        if (class51.field1173) {
            class51.field1173 = false;
            class48.method343(-1);
            return;
        }
        for (int var2 = 0; var2 < 100 && class97.method751(false); var2++) {
        }
        if (class103.field2405 != 30) {
            return;
        }
        class32.method253((byte) -76, 245, class136.field3140);
        Object var3 = class124.field2837.field2851;
        synchronized (class124.field2837.field2851) {
            if (!class100.field2326) {
                class124.field2837.field2860 = 0;
            } else if (class70.field1792 != 0 || class124.field2837.field2860 >= 40) {
                class136.field3140.method810(-2, 238);
                class136.field3140.method1010(0, 32768);
                int var4 = class136.field3140.field2873;
                class115.field2666++;
                int var5 = 0;
                for (int var6 = 0; var6 < class124.field2837.field2860 && class136.field3140.field2873 - var4 < 240; var6++) {
                    int var7 = class124.field2837.field2859[var6];
                    int var8 = class124.field2837.field2862[var6];
                    var5++;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class124.field2837.field2859[var6] == -1 && class124.field2837.field2862[var6] == -1) {
                        var8 = -1;
                        var9 = 524287;
                        var7 = -1;
                    }
                    if (class120.field2757 != var8 || class85.field2052 != var7) {
                        int var10 = var8 - class120.field2757;
                        int var11 = var7 - class85.field2052;
                        class85.field2052 = var7;
                        class120.field2757 = var8;
                        if (class85.field2039 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var11 += 32;
                            var10 += 32;
                            class136.field3140.method1039((var10 << 6) + (class85.field2039 << 12) + var11, 305662280);
                            class85.field2039 = 0;
                        } else if (class85.field2039 < 8) {
                            class136.field3140.method1003(122, (class85.field2039 << 19) + var9 + 8388608);
                            class85.field2039 = 0;
                        } else {
                            class136.field3140.method1040((class85.field2039 << 19) + var9 - 1073741824, -1308601992);
                            class85.field2039 = 0;
                        }
                    } else if (class85.field2039 < 2047) {
                        class85.field2039++;
                    }
                }
                class136.field3140.method1033(class136.field3140.field2873 - var4, (byte) -54);
                if (class124.field2837.field2860 <= var5) {
                    class124.field2837.field2860 = 0;
                } else {
                    class124.field2837.field2860 -= var5;
                    for (int var12 = 0; var12 < class124.field2837.field2860; var12++) {
                        class124.field2837.field2862[var12] = class124.field2837.field2862[var12 + var5];
                        class124.field2837.field2859[var12] = class124.field2837.field2859[var5 + var12];
                    }
                }
            }
        }
        if (class70.field1792 != 0) {
            long var13 = (class42.field984 - class10.field254) / 50L;
            int var15 = class4.field56;
            class22.field522++;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            class10.field254 = class42.field984;
            int var16 = class29.field713;
            byte var17 = 0;
            int var18 = (int) var13;
            if (class70.field1792 == 2) {
                var17 = 1;
            }
            class136.field3140.method810(-2, 213);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 764) {
                var16 = 764;
            }
            int var19 = var15 * 765 + var16;
            class136.field3140.method1019((var17 << 19) + (var18 << 20) + var19, false);
        }
        if (class113.field2603[96] || class113.field2603[97] || class113.field2603[98] || class113.field2603[99]) {
            class56.field1379 = true;
        }
        if (class43.field1007 > 0) {
            class43.field1007--;
        }
        if (class56.field1379 && class43.field1007 <= 0) {
            class56.field1379 = false;
            class43.field1007 = 20;
            class118.field2698++;
            class136.field3140.method810(-2, 249);
            class136.field3140.method997(-53, class62.field1495);
            class136.field3140.method992(-13292, class65.field1597);
        }
        if (class120.field2740 && !class100.field2340) {
            class100.field2340 = true;
            class136.field3140.method810(-2, 191);
            class136.field3140.method1010(1, 32768);
            class43.field999++;
        }
        if (!class120.field2740 && class100.field2340) {
            class43.field999++;
            class100.field2340 = false;
            class136.field3140.method810(-2, 191);
            class136.field3140.method1010(0, 32768);
        }
        class147.method1171((byte) 55);
        if (class103.field2405 != 30) {
            return;
        }
        class80.method634(1);
        class88.method676(-28890);
        class138.field3222++;
        if (class138.field3222 > 750) {
            class48.method343(-1);
            return;
        }
        class97.method755((byte) 45);
        class72.method604(69);
        method1132(true);
        if (class77.field1899 != 0) {
            class98.field2300 += 20;
            if (class98.field2300 >= 400) {
                class77.field1899 = 0;
            }
        }
        class45.field1024++;
        if (class28.field693 != null) {
            class136.field3136++;
            if (class136.field3136 >= 15) {
                client.method163(class28.field693, -109);
                class28.field693 = null;
            }
        }
        if (class71.field1812 != null) {
            client.method163(class71.field1812, -82);
            if (class103.field2398 > class130.field2964 + 5 || class130.field2964 - 5 > class103.field2398 || class84.field2032 > class52.field1196 + 5 || class84.field2032 < class52.field1196 - 5) {
                class34.field799 = true;
            }
            class26.field620++;
            if (class70.field1797 == 0) {
                if (class34.field799 && class26.field620 >= 5) {
                    if (class71.field1812 == class118.field2687 && class83.field2003 != class148.field3496) {
                        byte var20 = 0;
                        class51.field1180++;
                        class54 var21 = class71.field1812;
                        if (class150.field3528 == 1 && var21.field1311 == 206) {
                            var20 = 1;
                        }
                        if (var21.field1304[class83.field2003] <= 0) {
                            var20 = 0;
                        }
                        if (class82.method643(class22.method171(var21, (byte) 54), true)) {
                            int var24 = class148.field3496;
                            int var25 = class83.field2003;
                            var21.field1304[var25] = var21.field1304[var24];
                            var21.field1365[var25] = var21.field1365[var24];
                            var21.field1304[var24] = -1;
                            var21.field1365[var24] = 0;
                        } else if (var20 == 1) {
                            int var22 = class83.field2003;
                            int var23 = class148.field3496;
                            while (var22 != var23) {
                                if (var23 > var22) {
                                    var21.method378(var23 - 1, var23, -127);
                                    var23--;
                                } else if (var23 < var22) {
                                    var21.method378(var23 + 1, var23, 93);
                                    var23++;
                                }
                            }
                        } else {
                            var21.method378(class83.field2003, class148.field3496, -124);
                        }
                        class136.field3140.method810(-2, 119);
                        class136.field3140.method1005(-110, class71.field1812.field1291);
                        class136.field3140.method992(-13292, class83.field2003);
                        class136.field3140.method997(-63, class148.field3496);
                        class136.field3140.method1010(var20, 32768);
                    }
                } else if ((class1.field15 == 1 || class83.method648(-24, class128.field2889 - 1)) && class128.field2889 > 2) {
                    class103.method830((byte) 50);
                } else if (class128.field2889 > 0) {
                    class77.method622(2, class128.field2889 - 1);
                }
                class136.field3136 = 10;
                class70.field1792 = 0;
                class71.field1812 = null;
            }
        }
        class54 var26 = class100.field2323;
        class1.field5 = null;
        class100.field2323 = null;
        class85.field2037 = 0;
        class32.field785 = false;
        class54 var27 = class38.field882;
        class38.field882 = null;
        class70.field1786 = false;
        while (class54.method366((byte) 80) && class85.field2037 < 128) {
            class88.field2082[class85.field2037] = class38.field897;
            class111.field2529[class85.field2037] = class63.field1547;
            class85.field2037++;
        }
        class30.method245(0, 765, (byte) 89, 0, 0, 0, 503, class137.field3164);
        class150.field3538++;
        class139.field3231 = false;
        while (true) {
            class113 var28 = (class113) class54.field1255.method853(-62);
            if (var28 == null) {
                while (true) {
                    class113 var29 = (class113) class62.field1507.method853(-22);
                    if (var29 == null) {
                        while (true) {
                            class113 var30 = (class113) class141.field3294.method853(-66);
                            if (var30 == null) {
                                if (class150.field3540 != null) {
                                    class116.method943(59);
                                }
                                if (class69.field1738 != -1) {
                                    int var31 = class69.field1738;
                                    int var32 = class69.field1749;
                                    boolean var33 = class75.method615(class40.field936.field193[0], var32, var31, (byte) -126, 0, 0, true, 0, 0, class40.field936.field144[0], 0, 0);
                                    if (var33) {
                                        class77.field1899 = 1;
                                        class97.field2270 = class4.field56;
                                        class98.field2300 = 0;
                                        class68.field1711 = class29.field713;
                                    }
                                    class69.field1738 = -1;
                                }
                                class24.method194((byte) 112);
                                if (class100.field2323 != var26) {
                                    if (var26 != null) {
                                        client.method163(var26, -113);
                                    }
                                    if (class100.field2323 != null) {
                                        client.method163(class100.field2323, -103);
                                    }
                                }
                                if (class38.field882 != var27 && client.field508 == class60.field1477) {
                                    if (var27 != null) {
                                        client.method163(var27, -106);
                                    }
                                    if (class38.field882 != null) {
                                        client.method163(class38.field882, -114);
                                    }
                                }
                                if (class38.field882 == null) {
                                    if (class60.field1477 > 0) {
                                        class60.field1477--;
                                    }
                                } else if (client.field508 > class60.field1477) {
                                    class60.field1477++;
                                    if (client.field508 == class60.field1477) {
                                        client.method163(class38.field882, -74);
                                    }
                                }
                                class68.method541((byte) -121);
                                if (class47.field1094) {
                                    class98.method761(-84);
                                }
                                for (int var34 = 0; var34 < 5; var34++) {
                                    int var10002 = class149.field3518[var34]++;
                                }
                                int var35 = class90.method705((byte) 115);
                                int var36 = class132.method1063(63);
                                if (var35 > 4500 && var36 > 4500) {
                                    class105.field2445++;
                                    class52.field1192 = 250;
                                    method1129(0, 4000);
                                    class136.field3140.method810(-2, 179);
                                }
                                class149.field3508++;
                                class98.field2295++;
                                if (class98.field2295 > 500) {
                                    class98.field2295 = 0;
                                    int var37 = (int) (Math.random() * 8.0D);
                                    if ((var37 & 0x1) == 1) {
                                        class70.field1772 += class59.field1448;
                                    }
                                    if ((var37 & 0x4) == 4) {
                                        class100.field2328 += class39.field917;
                                    }
                                    if ((var37 & 0x2) == 2) {
                                        class97.field2253 += class90.field2142;
                                    }
                                }
                                if (class97.field2253 < -55) {
                                    class90.field2142 = 2;
                                }
                                if (class97.field2253 > 55) {
                                    class90.field2142 = -2;
                                }
                                if (class149.field3508 > 500) {
                                    class149.field3508 = 0;
                                    int var38 = (int) (Math.random() * 8.0D);
                                    if ((var38 & 0x2) == 2) {
                                        class128.field2909 += class151.field3555;
                                    }
                                    if ((var38 & 0x1) == 1) {
                                        class50.field1162 += class132.field3013;
                                    }
                                }
                                if (class128.field2909 < -20) {
                                    class151.field3555 = 1;
                                }
                                if (class100.field2328 < -40) {
                                    class39.field917 = 1;
                                }
                                if (class100.field2328 > 40) {
                                    class39.field917 = -1;
                                }
                                if (class128.field2909 > 10) {
                                    class151.field3555 = -1;
                                }
                                class12.field287++;
                                if (class70.field1772 < -50) {
                                    class59.field1448 = 2;
                                }
                                if (class70.field1772 > 50) {
                                    class59.field1448 = -2;
                                }
                                if (class50.field1162 < -60) {
                                    class132.field3013 = 2;
                                }
                                if (class50.field1162 > 60) {
                                    class132.field3013 = -2;
                                }
                                if (class12.field287 > 50) {
                                    class136.field3140.method810(-2, 47);
                                    class63.field1577++;
                                }
                                try {
                                    if (class59.field1444 == null || class136.field3140.field2873 <= 0) {
                                        return;
                                    } else {
                                        class59.field1444.method979(class136.field3140.field2873, 19770, class136.field3140.field2874, 0);
                                        class136.field3140.field2873 = 0;
                                        class12.field287 = 0;
                                        return;
                                    }
                                } catch (IOException var39) {
                                    class48.method343(-1);
                                    return;
                                }
                            }
                            class124.method976(var30, -121);
                        }
                    }
                    class124.method976(var29, -118);
                }
            }
            class124.method976(var28, -116);
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIIIII)V")
    public class143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3330 = arg6 + arg5;
        this.field3346 = arg1;
        this.field3350 = arg3;
        this.field3336 = arg0;
        this.field3343 = arg4;
        this.field3327 = arg2;
        int var8 = class38.method289(this.field3336, 2116).field2743;
        if (var8 == -1) {
            this.field3332 = true;
        } else {
            this.field3332 = false;
            this.field3353 = class141.method1121(var8, -24732);
        }
    }
}
