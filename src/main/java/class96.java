import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class96 {

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[Lph;")
    private class308[] field1393;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Z")
    public static boolean field1383 = false;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field1399 = 0;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[S")
    public static short[] field1388 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Z")
    public static boolean field1398 = true;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "J")
    private long field1384;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "J")
    public static long field1397;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Luo;")
    public static class274 field1382;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Lph;")
    private class308 field1402;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient;")
    public static client field1394;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Ljava/lang/Thread;")
    public static Thread field1395;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "[[S")
    public static short[][] field1387;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(JI)Lph;", line = 11)
    public final class308 method631(long arg0, int arg1) {
        if (arg1 <= 68) {
            return (class308) null;
        }
        this.field1384 = arg0;
        class308 var4 = this.field1393[(int) (arg0 & (long) (this.field1389 - 1))];
        this.field1402 = var4.field5012;
        field1392++;
        while (this.field1402 != var4) {
            if (this.field1402.field5011 == arg0) {
                class308 var5 = this.field1402;
                this.field1402 = this.field1402.field5012;
                return var5;
            }
            this.field1402 = this.field1402.field5012;
        }
        this.field1402 = null;
        return null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLph;J)V", line = 46)
    public final void method632(boolean arg0, class308 arg1, long arg2) {
        field1385++;
        if (arg1.field5009 != null) {
            arg1.method2148((byte) 104);
        }
        class308 var5 = this.field1393[(int) ((long) (this.field1389 - 1) & arg2)];
        if (!arg0) {
            this.field1389 = -61;
        }
        arg1.field5012 = var5;
        arg1.field5011 = arg2;
        arg1.field5009 = var5.field5009;
        arg1.field5009.field5012 = arg1;
        arg1.field5012.field5009 = arg1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBIIIIII)V", line = 83)
    public static final void method633(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1396++;
        class177 var10 = (class177) class41.field630.method1081(90);
        class177 var11 = null;
        while (var10 != null) {
            if (var10.field2760 == arg9 && var10.field2762 == arg8 && var10.field2772 == arg0 && var10.field2756 == arg6) {
                var11 = var10;
                break;
            }
            var10 = (class177) class41.field630.method1083((byte) 113);
        }
        if (var11 == null) {
            var11 = new class177();
            var11.field2772 = arg0;
            var11.field2762 = arg8;
            var11.field2756 = arg6;
            var11.field2760 = arg9;
            class241.method1686(516374, var11);
            class41.field630.method1077(16711935, var11);
        }
        var11.field2767 = arg5;
        var11.field2770 = arg2;
        var11.field2763 = arg1;
        var11.field2761 = arg4;
        int var12 = 124 / ((-arg3 - 33) / 62);
        var11.field2755 = arg7;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZIZ)V", line = 122)
    public static final void method634(int arg0, boolean arg1, int arg2, boolean arg3) {
        field1390++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class89.field1298 = arg0;
        class322.field5294 = arg2;
        if (arg1) {
            class228.field3587 = arg3;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 138)
    public static void method635(byte arg0) {
        field1388 = null;
        if (arg0 <= 11) {
            field1400 = -86;
        }
        field1382 = null;
        field1395 = null;
        field1387 = (short[][]) null;
        field1394 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Z", line = 156)
    public static final boolean method636(int arg0) throws IOException {
        field1386++;
        if (class346.field5545 == null) {
            return false;
        }
        int var1 = class346.field5545.method667(true);
        if (var1 == 0) {
            return false;
        }
        if (class185.field2867 == -1) {
            var1--;
            class346.field5545.method670(0, class159.field2552.field5124, (byte) 18, 1);
            class159.field2552.field5137 = 0;
            class185.field2867 = class159.field2552.method251(false);
            class201.field3091 = class180.field2803[class185.field2867];
        }
        if (class201.field3091 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class346.field5545.method670(0, class159.field2552.field5124, (byte) 18, 1);
            var1--;
            class201.field3091 = class159.field2552.field5124[0] & 0xFF;
        }
        if (class201.field3091 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class346.field5545.method670(0, class159.field2552.field5124, (byte) 18, 2);
            class159.field2552.field5137 = 0;
            class201.field3091 = class159.field2552.method2250(-1613178296);
        }
        if (class201.field3091 > var1) {
            return false;
        }
        class159.field2552.field5137 = 0;
        class346.field5545.method670(0, class159.field2552.field5124, (byte) 18, class201.field3091);
        class50.field738 = class291.field4823;
        class259.field4099 = 0;
        class291.field4823 = class81.field1185;
        class81.field1185 = class185.field2867;
        if (class185.field2867 == 230) {
            int var392 = class159.field2552.method2241((byte) 66);
            byte var393 = class159.field2552.method2208(arg0 ^ 0xFFFF9347);
            class304.method2131((byte) 108, var393, var392);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 252) {
            int var2 = class159.field2552.method2250(arg0 - 1613178052);
            if (var2 == 65535) {
                var2 = -1;
            }
            int var3 = class159.field2552.method2205(3);
            int var4 = class159.field2552.method2250(-1613178296);
            if (class56.method421(var4, (byte) 74)) {
                class278.method1981(109, 2, var2, -1, var3);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 44) {
            int var389 = class159.field2552.method2224(-125);
            int var390 = class159.field2552.method2220(-21362);
            int var391 = class159.field2552.method2224(-119);
            class120.field1779 = var390 >> 1;
            class329.field5388.method317((var390 & 0x1) == 1, arg0 + 244, var389, var391);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 74) {
            int var5 = class159.field2552.method2227(0);
            int var6 = class159.field2552.method2205(arg0 ^ 0xFFFFFF0F);
            int var7 = class159.field2552.method2232(arg0 ^ 0xF0);
            if (class56.method421(var5, (byte) 74)) {
                class167 var8 = (class167) class218.field3363.method29((long) var6, 103);
                class167 var9 = (class167) class218.field3363.method29((long) var7, 103);
                if (var9 != null) {
                    class70.method489(var8 == null || var8.field2631 != var9.field2631, var9, 58);
                }
                if (var8 != null) {
                    var8.method1131(8);
                    class218.field3363.method37(false, var8, (long) var7);
                }
                class264 var10 = class94.method629(5386, var6);
                if (var10 != null) {
                    class218.method1472((byte) 117, var10);
                }
                class264 var11 = class94.method629(5386, var7);
                if (var11 != null) {
                    class218.method1472((byte) 107, var11);
                    class209.method1423(-29561, var11, true);
                }
                if (class345.field5538 != -1) {
                    class160.method1134(1, (byte) -70, class345.field5538);
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 27) {
            int var386 = class159.field2552.method2241((byte) 66);
            int var387 = class159.field2552.method2227(0);
            int var388 = class159.field2552.method2205(3);
            if (class56.method421(var386, (byte) 74)) {
                class202.method1381(false, var388, var387);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 236) {
            int var12 = class159.field2552.method2250(-1613178296);
            int var13 = class159.field2552.method2231((byte) -123);
            if (class56.method421(var12, (byte) 74)) {
                class167 var14 = (class167) class218.field3363.method29((long) var13, 103);
                if (var14 != null) {
                    class70.method489(true, var14, 125);
                }
                if (class172.field2695 != null) {
                    class218.method1472((byte) 121, class172.field2695);
                    class172.field2695 = null;
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 215) {
            int var15 = class159.field2552.method2231((byte) -124);
            int var16 = class159.field2552.method2250(arg0 - 1613178052);
            if (var15 < -70000) {
                var16 += 32768;
            }
            class264 var17;
            if (var15 < 0) {
                var17 = null;
            } else {
                var17 = class94.method629(5386, var15);
            }
            while (class201.field3091 > class159.field2552.field5137) {
                int var18 = class159.field2552.method2201(arg0 ^ 0xFFFFFF8C);
                int var19 = class159.field2552.method2250(arg0 ^ 0x60272544);
                int var20 = 0;
                if (var19 != 0) {
                    var20 = class159.field2552.method2224(arg0 + 124);
                    if (var20 == 255) {
                        var20 = class159.field2552.method2231((byte) -127);
                    }
                }
                if (var17 != null && var18 >= 0 && var17.field4330.length > var18) {
                    var17.field4330[var18] = var19;
                    var17.field4321[var18] = var20;
                }
                class132.method862(var16, var19 - 1, var18, var20, (byte) -24);
            }
            if (var17 != null) {
                class218.method1472((byte) 96, var17);
            }
            class346.method2437((byte) 0);
            class241.field3782[class235.method1623(31, class179.field2786++)] = class235.method1623(32767, var16);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 60) {
            class203.field3112 = class159.field2552.method2224(-123);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 227) {
            class181.method1262(arg0 - 24659, true);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 42) {
            int var21 = class159.field2552.method2250(-1613178296);
            int var22 = class159.field2552.method2215(true);
            int var23 = class159.field2552.method2241((byte) 66);
            int var24 = class159.field2552.method2185(16711680);
            int var25 = class159.field2552.method2250(-1613178296);
            if (class56.method421(var25, (byte) 74)) {
                class278.method1981(37, 7, var21 << 16 | var22, var23, var24);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 248) {
            int var26 = class159.field2552.method2241((byte) 66);
            if (var26 == 65535) {
                var26 = -1;
            }
            int var27 = class159.field2552.method2216((byte) 92);
            int var28 = class159.field2552.method2238(-7946);
            String var29 = class159.field2552.method2198(arg0 - 186);
            if (var28 >= 1 && var28 <= 8) {
                if (var29.equalsIgnoreCase("null")) {
                    var29 = null;
                }
                class278.field4581[var28 - 1] = var29;
                class140.field2259[var28 - 1] = var26;
                class182.field2830[var28 - 1] = var27 == 0;
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 165) {
            int var381 = class159.field2552.method2250(-1613178296);
            String var382 = class159.field2552.method2198(-430);
            Object[] var383 = new Object[var382.length() + 1];
            for (int var384 = var382.length() - 1; var384 >= 0; var384--) {
                if (var382.charAt(var384) == 's') {
                    var383[var384 + 1] = class159.field2552.method2198(arg0 - 186);
                } else {
                    var383[var384 + 1] = Integer.valueOf(class159.field2552.method2231((byte) -125));
                }
            }
            var383[0] = Integer.valueOf(class159.field2552.method2231((byte) -128));
            if (class56.method421(var381, (byte) 74)) {
                class190 var385 = new class190();
                var385.field2940 = var383;
                class201.method1372(var385, 200000);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 161) {
            int var378 = class159.field2552.method2250(-1613178296);
            int var379 = class159.field2552.method2215(true);
            int var380 = class159.field2552.method2215(true);
            if (class56.method421(var378, (byte) 74)) {
                class329.method2345(var379, var380, true);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 85) {
            int var30 = class159.field2552.method2205(3);
            int var31 = class159.field2552.method2227(0);
            int var32 = class159.field2552.method2215(true);
            if (class56.method421(var31, (byte) 74)) {
                class212.method1439(var32, true, var30);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 63) {
            int var374 = class159.field2552.method2241((byte) 66);
            int var375 = class159.field2552.method2241((byte) 66);
            int var376 = class159.field2552.method2185(arg0 ^ 0xFF00FF0C);
            int var377 = class159.field2552.method2215(true);
            if (class56.method421(var374, (byte) 74)) {
                class147.method1049((var375 << 16) + var377, var376, 31747);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 179) {
            int var367 = class159.field2552.method2250(arg0 ^ 0x60272544);
            int var368 = class159.field2552.method2241((byte) 66);
            int var369 = class159.field2552.method2231((byte) -124);
            int var370 = class159.field2552.method2205(3);
            if (var367 == 65535) {
                var367 = -1;
            }
            if (class56.method421(var368, (byte) 74)) {
                class264 var371 = class94.method629(5386, var370);
                if (var371.field4276) {
                    class92.method611(arg0 + 253, var369, var370, var367);
                    class109 var373 = class322.method2311(var367, -103);
                    class163.method1145(0, var373.field1610, var373.field1579, var373.field1562, var370);
                    class293.method2082(-5774, var373.field1559, var373.field1549, var370, var373.field1578);
                } else if (var367 == -1) {
                    class185.field2867 = -1;
                    var371.field4198 = 0;
                    return true;
                } else {
                    class109 var372 = class322.method2311(var367, -121);
                    var371.field4194 = var367;
                    var371.field4191 = var372.field1562;
                    var371.field4271 = var372.field1610 * 100 / var369;
                    var371.field4198 = 4;
                    var371.field4346 = var372.field1579;
                    class218.method1472((byte) 105, var371);
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 83) {
            class181.method1262(arg0 ^ 0x61B5, false);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 226) {
            int var33 = class159.field2552.method2250(-1613178296);
            int var34 = class159.field2552.method2224(arg0 ^ 0x8F);
            int var35 = class159.field2552.method2224(arg0 ^ 0x8B);
            int var36 = class159.field2552.method2224(-119);
            int var37 = class159.field2552.method2224(-119);
            int var38 = class159.field2552.method2250(-1613178296);
            if (class56.method421(var33, (byte) 74)) {
                class217.field3346[var34] = true;
                class258.field4090[var34] = var35;
                class325.field5329[var34] = var36;
                class199.field3064[var34] = var37;
                class312.field5072[var34] = var38;
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 214) {
            int var364 = class159.field2552.method2227(arg0 ^ 0xFFFFFF0C);
            int var365 = class159.field2552.method2220(-21362);
            int var366 = class159.field2552.method2185(16711680);
            if (class56.method421(var364, (byte) 74)) {
                class305.method2139(var365, -97, var366);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 209) {
            int var39 = class159.field2552.method2227(arg0 ^ 0xFFFFFF0C);
            int var40 = class159.field2552.method2242((byte) 120);
            int var41 = class159.field2552.method2185(16711680);
            int var42 = class159.field2552.method2245(-36);
            if (class56.method421(var39, (byte) 74)) {
                class282.method2000(var40, false, var41, var42);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 20) {
            int var43 = class159.field2552.method2185(16711680);
            int var44 = var43 >> 28 & 0x3;
            int var45 = var43 & 0x3FFF;
            int var46 = var43 >> 14 & 0x3FFF;
            int var47 = class159.field2552.method2224(arg0 ^ 0x89);
            int var48 = var47 >> 2;
            int var49 = var47 & 0x3;
            int var50 = class186.field2882[var48];
            int var51 = class159.field2552.method2250(-1613178296);
            int var52 = var46 - class215.field3313;
            if (var51 == 65535) {
                var51 = -1;
            }
            int var53 = var45 - class150.field2420;
            class28.method243(var49, var52, var44, var48, var53, var50, var51, (byte) -120);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 66) {
            class320.field5270 = class159.field2552.method2224(-125);
            class297.field4924 = class159.field2552.method2224(arg0 + 116);
            class257.field4063 = class159.field2552.method2224(-127);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 43) {
            class130.method846(false, class159.field2552.method2198(-430));
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 150) {
            int var360 = class159.field2552.method2250(-1613178296);
            if (var360 == 65535) {
                var360 = -1;
            }
            int var361 = class159.field2552.method2224(arg0 ^ 0x8C);
            int var362 = class159.field2552.method2250(-1613178296);
            int var363 = class159.field2552.method2224(-123);
            class209.method1427(var360, -1, var361, var363, var362);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 116) {
            int var357 = class159.field2552.method2215(true);
            int var358 = class159.field2552.method2232(-4);
            int var359 = class159.field2552.method2250(-1613178296);
            if (class56.method421(var357, (byte) 74)) {
                class215.method1459(-48, var359, var358);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 147 || class185.field2867 == 185 || class185.field2867 == 246 || class185.field2867 == 183 || class185.field2867 == 225 || class185.field2867 == 203 || class185.field2867 == 9 || class185.field2867 == 130 || class185.field2867 == 13 || class185.field2867 == 45 || class185.field2867 == 175 || class185.field2867 == 208 || class185.field2867 == 155 || class185.field2867 == 163) {
            class50.method374(arg0 ^ 0x5297);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 216) {
            class116.field1695 = class159.field2552.method2220(-21362);
            class160.field2558 = class159.field2552.method2224(-119);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 120) {
            long var343 = class159.field2552.method2204(true);
            long var345 = (long) class159.field2552.method2250(-1613178296);
            long var347 = (long) class159.field2552.method2249(-106);
            int var349 = class159.field2552.method2224(arg0 ^ 0x8F);
            int var350 = class159.field2552.method2250(arg0 ^ 0x60272544);
            boolean var351 = false;
            long var352 = (var345 << 32) + var347;
            int var354 = 0;
            label1678: while (true) {
                if (var354 >= 100) {
                    if (var349 <= 1) {
                        for (int var355 = 0; var355 < class265.field4361; var355++) {
                            if (class76.field1144[var355] == var343) {
                                var351 = true;
                                break label1678;
                            }
                        }
                    }
                    break;
                }
                if (class312.field5107[var354] == var352) {
                    var351 = true;
                    break;
                }
                var354++;
            }
            if (!var351 && class192.field2972 == 0) {
                class312.field5107[class101.field1461] = var352;
                class101.field1461 = (class101.field1461 + 1) % 100;
                String var356 = class295.method2088(false, var350).method280(class159.field2552, arg0 ^ 0xFFFFFF0D);
                if (var349 == 2) {
                    class358.method2491((String) null, var350, "<img=1>" + class322.method2314(var343, true), var356, -21381, 18);
                } else if (var349 == 1) {
                    class358.method2491((String) null, var350, "<img=0>" + class322.method2314(var343, true), var356, arg0 ^ 0x5377, 18);
                } else {
                    class358.method2491((String) null, var350, class322.method2314(var343, true), var356, -21381, 18);
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 207) {
            if (class296.field4907 != null) {
                class124.method801(-1, false, arg0 ^ 0xFFFFFF0C, -1, class295.field4901);
            }
            byte[] var341 = new byte[class201.field3091];
            class159.field2552.method256((byte) -127, var341, 0, class201.field3091);
            String var342 = class315.method2264(var341, class201.field3091, 0, 0);
            if (class217.field3350 == null && class274.field4509 == 3 || !class274.field4518.startsWith("win") || class258.field4093) {
                class344.method2425(true, var342, (byte) 99);
            } else {
                class98.field1426 = true;
                class60.field914 = var342;
                class51.field766 = field1382.method1942(var342, (byte) 110);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 211) {
            int var338 = class159.field2552.method2215(true);
            int var339 = class159.field2552.method2243(arg0 + 121);
            int var340 = class159.field2552.method2205(3);
            if (class56.method421(var338, (byte) 74)) {
                class273.method1935(var340, (byte) -89, var339);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 125) {
            if (class201.field3091 == 0) {
                class340.field5477 = class190.field2946;
            } else {
                class340.field5477 = class159.field2552.method2198(-430);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 237) {
            int var332 = class159.field2552.method2250(arg0 - 1613178052);
            int var333 = class159.field2552.method2224(-123);
            int var334 = class159.field2552.method2224(-120);
            int var335 = class159.field2552.method2250(-1613178296);
            int var336 = class159.field2552.method2224(-124);
            int var337 = class159.field2552.method2224(arg0 ^ 0x89);
            if (class56.method421(var332, (byte) 74)) {
                class65.method456(true, var337, var333, 12961, var336, var334, var335);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 220) {
            int var329 = class159.field2552.method2250(arg0 - 1613178052);
            String var330 = class159.field2552.method2198(-430);
            int var331 = class159.field2552.method2232(-4);
            if (class56.method421(var329, (byte) 74)) {
                class21.method135(var331, 3, var330);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 140) {
            int var326 = class159.field2552.method2232(-4);
            class264 var327 = class94.method629(5386, var326);
            for (int var328 = 0; var328 < var327.field4330.length; var328++) {
                var327.field4330[var328] = -1;
                var327.field4330[var328] = 0;
            }
            class218.method1472((byte) 123, var327);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 113) {
            class4.field37 = class159.field2552.method2224(-124);
            class246.field3916 = class12.field157;
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 174) {
            long var54 = class159.field2552.method2204(true);
            long var56 = (long) class159.field2552.method2250(arg0 - 1613178052);
            long var58 = (long) class159.field2552.method2249(-101);
            int var60 = class159.field2552.method2224(-123);
            long var61 = (var56 << 32) + var58;
            boolean var63 = false;
            int var64 = 0;
            label1285: while (true) {
                if (var64 < 100) {
                    if (class312.field5107[var64] != var61) {
                        var64++;
                        continue;
                    }
                    var63 = true;
                    break;
                }
                if (var60 <= 1) {
                    if ((!class273.field4486 || class142.field2288) && !class263.field4161) {
                        for (int var65 = 0; var65 < class265.field4361; var65++) {
                            if (class76.field1144[var65] == var54) {
                                var63 = true;
                                break label1285;
                            }
                        }
                    } else {
                        var63 = true;
                    }
                }
                break;
            }
            if (!var63 && class192.field2972 == 0) {
                class312.field5107[class101.field1461] = var61;
                class101.field1461 = (class101.field1461 + 1) % 100;
                String var66 = class175.method1227(class266.method1875(class211.method1436(class159.field2552, (byte) -123), true));
                if (var60 == 2 || var60 == 3) {
                    class147.method1047(false, var66, "<img=1>" + class322.method2314(var54, true), 7);
                } else if (var60 == 1) {
                    class147.method1047(false, var66, "<img=0>" + class322.method2314(var54, true), 7);
                } else {
                    class147.method1047(false, var66, class322.method2314(var54, true), 3);
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 100) {
            int var67 = class159.field2552.method2250(arg0 - 1613178052);
            int var68 = class159.field2552.method2205(3);
            class304.method2131((byte) 108, var68, var67);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 138) {
            String var69 = class159.field2552.method2198(arg0 ^ 0x15E);
            if (var69.endsWith(":tradereq:")) {
                String var106 = var69.substring(0, var69.indexOf(":"));
                boolean var107 = false;
                long var108 = class265.method1872(var106, 77);
                for (int var110 = 0; var110 < class265.field4361; var110++) {
                    if (class76.field1144[var110] == var108) {
                        var107 = true;
                        break;
                    }
                }
                if (!var107 && class192.field2972 == 0) {
                    class147.method1047(false, class121.field1802, var106, 4);
                }
            } else if (var69.endsWith(":chalreq:")) {
                String var100 = var69.substring(0, var69.indexOf(":"));
                long var101 = class265.method1872(var100, 113);
                boolean var103 = false;
                for (int var104 = 0; var104 < class265.field4361; var104++) {
                    if (class76.field1144[var104] == var101) {
                        var103 = true;
                        break;
                    }
                }
                if (!var103 && class192.field2972 == 0) {
                    String var105 = var69.substring(var69.indexOf(":") + 1, var69.length() - 9);
                    class147.method1047(false, var105, var100, 8);
                }
            } else if (var69.endsWith(":assistreq:")) {
                String var70 = var69.substring(0, var69.indexOf(":"));
                boolean var71 = false;
                long var72 = class265.method1872(var70, arg0 + 331);
                for (int var74 = 0; var74 < class265.field4361; var74++) {
                    if (class76.field1144[var74] == var72) {
                        var71 = true;
                        break;
                    }
                }
                if (!var71 && class192.field2972 == 0) {
                    class147.method1047(false, "", var70, 10);
                }
            } else if (var69.endsWith(":clan:")) {
                String var99 = var69.substring(0, var69.indexOf(":clan:"));
                class147.method1047(false, var99, "", 11);
            } else if (var69.endsWith(":trade:")) {
                String var75 = var69.substring(0, var69.indexOf(":trade:"));
                if (class192.field2972 == 0) {
                    class147.method1047(false, var75, "", 12);
                }
            } else if (var69.endsWith(":assist:")) {
                String var98 = var69.substring(0, var69.indexOf(":assist:"));
                if (class192.field2972 == 0) {
                    class147.method1047(false, var98, "", 13);
                }
            } else if (var69.endsWith(":duelstake:")) {
                String var76 = var69.substring(0, var69.indexOf(":"));
                long var77 = class265.method1872(var76, 100);
                boolean var79 = false;
                for (int var80 = 0; var80 < class265.field4361; var80++) {
                    if (class76.field1144[var80] == var77) {
                        var79 = true;
                        break;
                    }
                }
                if (!var79 && class192.field2972 == 0) {
                    class147.method1047(false, "", var76, 14);
                }
            } else if (var69.endsWith(":duelfriend:")) {
                String var81 = var69.substring(0, var69.indexOf(":"));
                boolean var82 = false;
                long var83 = class265.method1872(var81, 71);
                for (int var85 = 0; var85 < class265.field4361; var85++) {
                    if (class76.field1144[var85] == var83) {
                        var82 = true;
                        break;
                    }
                }
                if (!var82 && class192.field2972 == 0) {
                    class147.method1047(false, "", var81, 15);
                }
            } else if (var69.endsWith(":clanreq:")) {
                String var86 = var69.substring(0, var69.indexOf(":"));
                long var87 = class265.method1872(var86, 60);
                boolean var89 = false;
                for (int var90 = 0; var90 < class265.field4361; var90++) {
                    if (class76.field1144[var90] == var87) {
                        var89 = true;
                        break;
                    }
                }
                if (!var89 && class192.field2972 == 0) {
                    class147.method1047(false, "", var86, 16);
                }
            } else if (var69.endsWith(":allyreq:")) {
                String var91 = var69.substring(0, var69.indexOf(":"));
                long var92 = class265.method1872(var91, arg0 + 337);
                boolean var94 = false;
                for (int var95 = 0; var95 < class265.field4361; var95++) {
                    if (class76.field1144[var95] == var92) {
                        var94 = true;
                        break;
                    }
                }
                if (!var94 && class192.field2972 == 0) {
                    String var96 = var69.substring(var69.indexOf(":") + 1, var69.length() - 9);
                    class147.method1047(false, var96, var91, 21);
                }
            } else if (var69.endsWith(":spam:")) {
                String var97 = var69.substring(0, var69.length() - 6);
                if (class192.field2972 == 0) {
                    class147.method1047(false, var97, "", 22);
                }
            } else {
                class147.method1047(false, var69, "", 0);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 158) {
            int var111 = class159.field2552.method2241((byte) 66);
            int var112 = class159.field2552.method2227(0);
            int var113 = class159.field2552.method2215(true);
            int var114 = class159.field2552.method2227(0);
            int var115 = class159.field2552.method2231((byte) -125);
            if (class56.method421(var114, (byte) 74)) {
                class163.method1145(0, var113, var111, var112, var115);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 17) {
            int var292 = class159.field2552.method2231((byte) -124);
            int var293 = class159.field2552.method2241((byte) 66);
            int var294 = class159.field2552.method2241((byte) 66);
            int var295 = class159.field2552.method2241((byte) 66);
            if (var292 >> 30 != 0) {
                int var296 = ((var292 & 0xFFFCD85) >> 14) - class215.field3313;
                int var297 = (var292 & 0x3DDD781D) >> 28;
                int var298 = (var292 & 0x3FFF) - class150.field2420;
                if (var296 >= 0 && var298 >= 0 && var296 < 104 && var298 < 104) {
                    int var299 = var296 * 128 + 64;
                    int var300 = var298 * 128 + 64;
                    class61 var301 = new class61(var295, var297, var299, var300, client.method889(var299, var297, var300, -109) - var293, var294, class58.field875);
                    class217.field3344.method1077(16711935, new class244(var301));
                }
            } else if (var292 >> 29 != 0) {
                int var314 = var292 & 0xFFFF;
                class233 var315 = class329.field5377[var314];
                if (var315 != null) {
                    boolean var316 = true;
                    if (var295 == 65535) {
                        var295 = -1;
                    }
                    if (var295 != -1 && var315.field4784 != -1) {
                        if (var315.field4784 == var295) {
                            class172 var317 = class214.method1455((byte) -6, var295);
                            if (var317.field2689 && var317.field2675 != -1) {
                                class131 var318 = class68.method476((byte) 110, var317.field2675);
                                int var319 = var318.field2004;
                                if (var319 == 1) {
                                    var315.field4718 = 1;
                                    var316 = false;
                                    var315.field4777 = class58.field875 + var294;
                                    var315.field4719 = 0;
                                    var315.field4701 = 0;
                                    var315.field4712 = 0;
                                    class276.method1970(var318, false, var315.field4783, 91, var315.field4796, var315.field4701);
                                } else if (var319 == 2) {
                                    var315.field4703 = 0;
                                    var316 = false;
                                }
                            }
                        } else {
                            class172 var320 = class214.method1455((byte) -6, var295);
                            class172 var321 = class214.method1455((byte) -6, var315.field4784);
                            if (var320.field2675 != -1 && var321.field2675 != -1) {
                                class131 var322 = class68.method476((byte) 85, var320.field2675);
                                class131 var323 = class68.method476((byte) 99, var321.field2675);
                                if (var322.field2011 < var323.field2011) {
                                    var316 = false;
                                }
                            }
                        }
                    }
                    if (var316) {
                        var315.field4701 = 0;
                        var315.field4712 = 0;
                        var315.field4718 = 1;
                        var315.field4777 = class58.field875 + var294;
                        if (var315.field4777 > class58.field875) {
                            var315.field4701 = -1;
                        }
                        var315.field4724 = var293;
                        var315.field4784 = var295;
                        if (var315.field4784 != -1 && class58.field875 == var315.field4777) {
                            int var324 = class214.method1455((byte) -6, var315.field4784).field2675;
                            if (var324 != -1) {
                                class131 var325 = class68.method476((byte) 118, var324);
                                if (var325 != null && var325.field1988 != null) {
                                    class276.method1970(var325, false, var315.field4783, 117, var315.field4796, 0);
                                }
                            }
                        }
                    }
                }
            } else if (var292 >> 28 != 0) {
                int var302 = var292 & 0xFFFF;
                class39 var303;
                if (class102.field1490 == var302) {
                    var303 = class329.field5388;
                } else {
                    var303 = class130.field1984[var302];
                }
                if (var303 != null) {
                    if (var295 == 65535) {
                        var295 = -1;
                    }
                    boolean var304 = true;
                    if (var295 != -1 && var303.field4784 != -1) {
                        if (var303.field4784 == var295) {
                            class172 var305 = class214.method1455((byte) -6, var295);
                            if (var305.field2689 && var305.field2675 != -1) {
                                class131 var306 = class68.method476((byte) 88, var305.field2675);
                                int var307 = var306.field2004;
                                if (var307 == 1) {
                                    var303.field4701 = 0;
                                    var303.field4719 = 0;
                                    var303.field4712 = 0;
                                    var303.field4777 = class58.field875 + var294;
                                    var303.field4718 = 1;
                                    class276.method1970(var306, false, var303.field4783, 73, var303.field4796, var303.field4701);
                                    var304 = false;
                                } else if (var307 == 2) {
                                    var303.field4703 = 0;
                                    var304 = false;
                                }
                            }
                        } else {
                            class172 var308 = class214.method1455((byte) -6, var295);
                            class172 var309 = class214.method1455((byte) -6, var303.field4784);
                            if (var308.field2675 != -1 && var309.field2675 != -1) {
                                class131 var310 = class68.method476((byte) 88, var308.field2675);
                                class131 var311 = class68.method476((byte) 60, var309.field2675);
                                if (var311.field2011 > var310.field2011) {
                                    var304 = false;
                                }
                            }
                        }
                    }
                    if (var304) {
                        var303.field4701 = 0;
                        var303.field4724 = var293;
                        var303.field4784 = var295;
                        var303.field4718 = 1;
                        var303.field4777 = class58.field875 + var294;
                        if (class58.field875 < var303.field4777) {
                            var303.field4701 = -1;
                        }
                        if (var303.field4784 == 65535) {
                            var303.field4784 = -1;
                        }
                        var303.field4712 = 0;
                        if (var303.field4784 != -1 && class58.field875 == var303.field4777) {
                            int var312 = class214.method1455((byte) -6, var303.field4784).field2675;
                            if (var312 != -1) {
                                class131 var313 = class68.method476((byte) 110, var312);
                                if (var313 != null && var313.field1988 != null) {
                                    class276.method1970(var313, class329.field5388 == var303, var303.field4783, 103, var303.field4796, 0);
                                }
                            }
                        }
                    }
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 241) {
            int var116 = class159.field2552.method2231((byte) -125);
            class249.field3966 = field1382.method1956(var116, arg0 + 244);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 53) {
            for (int var291 = 0; var291 < class170.field2650.length; var291++) {
                if (class353.field5617[var291] != class170.field2650[var291]) {
                    class170.field2650[var291] = class353.field5617[var291];
                    class58.method431((byte) 44, var291);
                    class25.field382[class235.method1623(class211.field3205++, 31)] = var291;
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 65) {
            int var117 = class159.field2552.method2220(-21362);
            int var118 = class159.field2552.method2215(true);
            int var119 = class159.field2552.method2241((byte) 66);
            class233 var120 = class329.field5377[var118];
            if (var120 != null) {
                class190.method1315(var117, 8600, var120, var119);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 156) {
            class265.field4361 = class201.field3091 / 8;
            for (int var121 = 0; var121 < class265.field4361; var121++) {
                class76.field1144[var121] = class159.field2552.method2204(true);
                class166.field2624[var121] = class329.method2344(2, class76.field1144[var121]);
                class334.field5424[var121] = false;
            }
            class246.field3916 = class12.field157;
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 80) {
            long var276 = class159.field2552.method2204(true);
            class159.field2552.method2200(53);
            boolean var278 = false;
            long var279 = class159.field2552.method2204(true);
            long var281 = (long) class159.field2552.method2250(-1613178296);
            long var283 = (long) class159.field2552.method2249(arg0 + 231);
            long var285 = (var281 << 32) + var283;
            int var287 = class159.field2552.method2224(-124);
            int var288 = 0;
            label1631: while (true) {
                if (var288 >= 100) {
                    if (var287 <= 1) {
                        if ((!class273.field4486 || class142.field2288) && !class263.field4161) {
                            for (int var289 = 0; var289 < class265.field4361; var289++) {
                                if (class76.field1144[var289] == var276) {
                                    var278 = true;
                                    break label1631;
                                }
                            }
                        } else {
                            var278 = true;
                        }
                    }
                    break;
                }
                if (class312.field5107[var288] == var285) {
                    var278 = true;
                    break;
                }
                var288++;
            }
            if (!var278 && class192.field2972 == 0) {
                class312.field5107[class101.field1461] = var285;
                class101.field1461 = (class101.field1461 + 1) % 100;
                String var290 = class175.method1227(class266.method1875(class211.method1436(class159.field2552, (byte) -97), true));
                if (var287 == 2 || var287 == 3) {
                    class201.method1377((byte) 98, "<img=1>" + class322.method2314(var276, true), 9, class322.method2314(var279, true), var290);
                } else if (var287 == 1) {
                    class201.method1377((byte) 101, "<img=0>" + class322.method2314(var276, true), 9, class322.method2314(var279, true), var290);
                } else {
                    class201.method1377((byte) 124, class322.method2314(var276, true), 9, class322.method2314(var279, true), var290);
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 173) {
            int var275 = class159.field2552.method2250(arg0 ^ 0x60272544);
            if (class56.method421(var275, (byte) 74)) {
                class70.method485(arg0 + 238);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 29) {
            class147.method1046(class159.field2552, -4, field1382, class201.field3091);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 212) {
            int var122 = class159.field2552.method2232(-4);
            int var123 = class159.field2552.method2215(true);
            int var124 = class159.field2552.method2241((byte) 66);
            if (var124 == 65535) {
                var124 = -1;
            }
            if (class56.method421(var123, (byte) 74)) {
                class278.method1981(116, 1, var124, -1, var122);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 10) {
            int var274 = class159.field2552.method2241((byte) 66);
            class220.method1483(var274, 0);
            class241.field3782[class235.method1623(class179.field2786++, 31)] = class235.method1623(var274, 32767);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 221) {
            class278.method1983(1);
            class185.field2867 = -1;
            return false;
        } else if (class185.field2867 == 162) {
            class159.field2552.field5137 += 28;
            if (class159.field2552.method2213(-1240695608)) {
                class99.method653(arg0 ^ 0x8E, class159.field2552, class159.field2552.field5137 - 28);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 16) {
            int var266 = class159.field2552.method2231((byte) -128);
            int var267 = class159.field2552.method2250(arg0 - 1613178052);
            if (var266 < -70000) {
                var267 += 32768;
            }
            class264 var268;
            if (var266 < 0) {
                var268 = null;
            } else {
                var268 = class94.method629(arg0 + 5630, var266);
            }
            if (var268 != null) {
                for (int var269 = 0; var269 < var268.field4330.length; var269++) {
                    var268.field4330[var269] = 0;
                    var268.field4321[var269] = 0;
                }
            }
            class94.method624(0, var267);
            int var270 = class159.field2552.method2250(-1613178296);
            for (int var271 = 0; var271 < var270; var271++) {
                int var272 = class159.field2552.method2250(arg0 ^ 0x60272544);
                int var273 = class159.field2552.method2224(-124);
                if (var273 == 255) {
                    var273 = class159.field2552.method2232(-4);
                }
                if (var268 != null && var271 < var268.field4330.length) {
                    var268.field4330[var271] = var272;
                    var268.field4321[var271] = var273;
                }
                class132.method862(var267, var272 - 1, var271, var273, (byte) -24);
            }
            if (var268 != null) {
                class218.method1472((byte) 117, var268);
            }
            class346.method2437((byte) 0);
            class241.field3782[class235.method1623(class179.field2786++, 31)] = class235.method1623(var267, 32767);
            class185.field2867 = -1;
            return true;
        } else if (~class185.field2867 == arg0) {
            class130.method843(-78);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 131) {
            String var263 = class159.field2552.method2198(-430);
            int var264 = class159.field2552.method2215(true);
            int var265 = class159.field2552.method2227(arg0 ^ 0xFFFFFF0C);
            if (class56.method421(var265, (byte) 74)) {
                class186.method1284(var264, 123, var263);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 121) {
            for (int var261 = 0; var261 < class130.field1984.length; var261++) {
                if (class130.field1984[var261] != null) {
                    class130.field1984[var261].field4795 = -1;
                }
            }
            for (int var262 = 0; var262 < class329.field5377.length; var262++) {
                if (class329.field5377[var262] != null) {
                    class329.field5377[var262].field4795 = -1;
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 69) {
            int var260 = class159.field2552.method2250(-1613178296);
            if (class56.method421(var260, (byte) 74)) {
                class250.method1777(arg0 ^ 0xFFFFFF0C);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 247) {
            int var125 = class159.field2552.method2216((byte) 92);
            int var126 = class159.field2552.method2215(true);
            if (var126 == 65535) {
                var126 = -1;
            }
            class311.method2173(0, var126, var125);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 176) {
            int var257 = class159.field2552.method2238(-7946);
            int var258 = class159.field2552.method2187(68);
            int var259 = class159.field2552.method2227(0);
            if (var259 == 65535) {
                var259 = -1;
            }
            class119.method768(48, var259, var258, var257);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 232) {
            class343.field5515 = class12.field157;
            long var127 = class159.field2552.method2204(true);
            if (var127 == 0L) {
                class299.field4932 = null;
                class201.field3086 = 0;
                class319.field5249 = null;
                class185.field2867 = -1;
                class166.field2623 = null;
                return true;
            }
            long var129 = class159.field2552.method2204(true);
            class299.field4932 = class267.method1884(arg0 ^ 0x100F3, var129);
            class319.field5249 = class267.method1884(-65537, var127);
            class197.field3027 = class159.field2552.method2200(arg0 + 141);
            int var131 = class159.field2552.method2224(-125);
            if (var131 == 255) {
                class185.field2867 = -1;
                return true;
            }
            class201.field3086 = var131;
            class54[] var132 = new class54[100];
            for (int var133 = 0; var133 < class201.field3086; var133++) {
                var132[var133] = new class54();
                var132[var133].field2549 = class159.field2552.method2204(true);
                var132[var133].field812 = class267.method1884(-65537, var132[var133].field2549);
                var132[var133].field819 = class159.field2552.method2250(-1613178296);
                var132[var133].field810 = class159.field2552.method2200(arg0 + 298);
                var132[var133].field808 = class159.field2552.method2198(-430);
                if (class65.field960 == var132[var133].field2549) {
                    class118.field1735 = var132[var133].field810;
                }
            }
            boolean var134 = false;
            int var135 = class201.field3086;
            while (var135 > 0) {
                var135--;
                boolean var136 = true;
                for (int var137 = 0; var137 < var135; var137++) {
                    if (var132[var137].field812.compareTo(var132[var137 + 1].field812) > 0) {
                        class54 var138 = var132[var137];
                        var136 = false;
                        var132[var137] = var132[var137 + 1];
                        var132[var137 + 1] = var138;
                    }
                }
                if (var136) {
                    break;
                }
            }
            class166.field2623 = var132;
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 201) {
            class346.method2437((byte) 0);
            int var253 = class159.field2552.method2238(-7946);
            int var254 = class159.field2552.method2232(-4);
            int var255 = class159.field2552.method2216((byte) 92);
            class327.field5354[var255] = var254;
            class90.field1302[var255] = var253;
            class110.field1636[var255] = 1;
            for (int var256 = 0; var256 < 98; var256++) {
                if (class78.field1166[var256] <= var254) {
                    class110.field1636[var255] = var256 + 2;
                }
            }
            class308.field5017[class235.method1623(31, class29.field435++)] = var255;
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 37) {
            int var139 = class159.field2552.method2227(0);
            String var140 = class159.field2552.method2198(-430);
            int var141 = class159.field2552.method2241((byte) 66);
            if (class56.method421(var141, (byte) 74)) {
                class186.method1284(var139, -58, var140);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 128) {
            long var249 = class159.field2552.method2204(true);
            int var251 = class159.field2552.method2250(-1613178296);
            String var252 = class295.method2088(false, var251).method280(class159.field2552, 1);
            class358.method2491((String) null, var251, class322.method2314(var249, true), var252, -21381, 19);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 210) {
            class223.field3439 = 0;
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 73) {
            long var235 = class159.field2552.method2204(true);
            int var237 = class159.field2552.method2250(-1613178296);
            byte var238 = class159.field2552.method2200(-58);
            boolean var239 = false;
            if ((var235 & Long.MIN_VALUE) != 0L) {
                var239 = true;
            }
            if (var239) {
                if (class201.field3086 == 0) {
                    class185.field2867 = -1;
                    return true;
                }
                boolean var245 = false;
                long var246 = var235 & Long.MAX_VALUE;
                int var248;
                for (var248 = 0; class201.field3086 > var248 && (class166.field2623[var248].field2549 != var246 || class166.field2623[var248].field819 != var237); var248++) {
                }
                if (var248 < class201.field3086) {
                    while (var248 < class201.field3086 - 1) {
                        class166.field2623[var248] = class166.field2623[var248 + 1];
                        var248++;
                    }
                    class201.field3086--;
                    class166.field2623[class201.field3086] = null;
                }
            } else {
                String var240 = class159.field2552.method2198(arg0 ^ 0x15E);
                class54 var241 = new class54();
                var241.field2549 = var235;
                var241.field812 = class267.method1884(-65537, var241.field2549);
                var241.field808 = var240;
                var241.field810 = var238;
                var241.field819 = var237;
                int var242;
                for (var242 = class201.field3086 - 1; var242 >= 0; var242--) {
                    int var243 = class166.field2623[var242].field812.compareTo(var241.field812);
                    if (var243 == 0) {
                        class166.field2623[var242].field819 = var237;
                        class166.field2623[var242].field810 = var238;
                        class166.field2623[var242].field808 = var240;
                        class343.field5515 = class12.field157;
                        class185.field2867 = -1;
                        if (class65.field960 == var235) {
                            class118.field1735 = var238;
                        }
                        return true;
                    }
                    if (var243 < 0) {
                        break;
                    }
                }
                if (class166.field2623.length <= class201.field3086) {
                    class185.field2867 = -1;
                    return true;
                }
                for (int var244 = class201.field3086 - 1; var244 > var242; var244--) {
                    class166.field2623[var244 + 1] = class166.field2623[var244];
                }
                if (class201.field3086 == 0) {
                    class166.field2623 = new class54[100];
                }
                class166.field2623[var242 + 1] = var241;
                class201.field3086++;
                if (class65.field960 == var235) {
                    class118.field1735 = var238;
                }
            }
            class343.field5515 = class12.field157;
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 186) {
            class346.method2437((byte) 0);
            class209.field3175 = class159.field2552.method2224(arg0 ^ 0x89);
            class185.field2867 = -1;
            class282.field4631 = class12.field157;
            return true;
        } else if (class185.field2867 == 55) {
            int var142 = class159.field2552.method2250(-1613178296);
            int var143 = class159.field2552.method2238(-7946);
            if (class56.method421(var142, (byte) 74)) {
                class154.field2510 = var143;
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 7) {
            int var144 = class159.field2552.method2227(arg0 + 244);
            int var145 = class159.field2552.method2205(arg0 ^ 0xFFFFFF0F);
            if (var144 == 65535) {
                var144 = -1;
            }
            int var146 = class159.field2552.method2231((byte) -126);
            int var147 = class159.field2552.method2227(0);
            if (var147 == 65535) {
                var147 = -1;
            }
            int var148 = class159.field2552.method2250(-1613178296);
            if (class56.method421(var148, (byte) 74)) {
                for (int var149 = var144; var149 <= var147; var149++) {
                    long var150 = ((long) var146 << 32) + (long) var149;
                    class77 var152 = (class77) class300.field4955.method29(var150, 103);
                    class77 var153;
                    if (var152 != null) {
                        var153 = new class77(var145, var152.field1157);
                        var152.method1131(arg0 + 252);
                    } else if (var149 == -1) {
                        var153 = new class77(var145, class94.method629(5386, var146).field4333.field1157);
                    } else {
                        var153 = new class77(var145, -1);
                    }
                    class300.field4955.method37(false, var153, var150);
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 205) {
            long var219 = class159.field2552.method2204(true);
            class159.field2552.method2200(127);
            long var221 = class159.field2552.method2204(true);
            long var223 = (long) class159.field2552.method2250(-1613178296);
            boolean var225 = false;
            long var226 = (long) class159.field2552.method2249(arg0 ^ 0xE7);
            long var228 = (var223 << 32) + var226;
            int var230 = class159.field2552.method2224(-123);
            int var231 = class159.field2552.method2250(-1613178296);
            int var232 = 0;
            label1513: while (true) {
                if (var232 >= 100) {
                    if (var230 <= 1) {
                        for (int var233 = 0; var233 < class265.field4361; var233++) {
                            if (class76.field1144[var233] == var219) {
                                var225 = true;
                                break label1513;
                            }
                        }
                    }
                    break;
                }
                if (class312.field5107[var232] == var228) {
                    var225 = true;
                    break;
                }
                var232++;
            }
            if (!var225 && class192.field2972 == 0) {
                class312.field5107[class101.field1461] = var228;
                class101.field1461 = (class101.field1461 + 1) % 100;
                String var234 = class295.method2088(false, var231).method280(class159.field2552, arg0 ^ 0xFFFFFF0D);
                if (var230 == 2 || var230 == 3) {
                    class358.method2491(class322.method2314(var221, true), var231, "<img=1>" + class322.method2314(var219, true), var234, -21381, 20);
                } else if (var230 == 1) {
                    class358.method2491(class322.method2314(var221, true), var231, "<img=0>" + class322.method2314(var219, true), var234, -21381, 20);
                } else {
                    class358.method2491(class322.method2314(var221, true), var231, class322.method2314(var219, true), var234, arg0 ^ 0x5377, 20);
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 233) {
            class211.field3217 = class159.field2552.method2215(true) * 30;
            class282.field4631 = class12.field157;
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 0) {
            int var154 = class159.field2552.method2231((byte) -126);
            int var155 = class159.field2552.method2250(-1613178296);
            class69.method482(30757, var155, var154);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 168) {
            int var215 = class159.field2552.method2224(-121);
            int var216 = var215 >> 5;
            int var217 = var215 & 0x1F;
            if (var217 == 0) {
                class165.field2602[var216] = null;
                class185.field2867 = -1;
                return true;
            }
            class281 var218 = new class281();
            var218.field4622 = var217;
            var218.field4619 = class159.field2552.method2224(-125);
            if (var218.field4619 >= 0 && class243.field3837.length > var218.field4619) {
                if (var218.field4622 == 1 || var218.field4622 == 10) {
                    var218.field4628 = class159.field2552.method2250(-1613178296);
                    class159.field2552.field5137 += 5;
                } else if (var218.field4622 >= 2 && var218.field4622 <= 6) {
                    if (var218.field4622 == 2) {
                        var218.field4626 = 64;
                        var218.field4621 = 64;
                    }
                    if (var218.field4622 == 3) {
                        var218.field4621 = 0;
                        var218.field4626 = 64;
                    }
                    if (var218.field4622 == 4) {
                        var218.field4621 = 128;
                        var218.field4626 = 64;
                    }
                    if (var218.field4622 == 5) {
                        var218.field4626 = 0;
                        var218.field4621 = 64;
                    }
                    if (var218.field4622 == 6) {
                        var218.field4626 = 128;
                        var218.field4621 = 64;
                    }
                    var218.field4622 = 2;
                    var218.field4618 = class159.field2552.method2250(arg0 - 1613178052);
                    var218.field4617 = class159.field2552.method2250(-1613178296);
                    var218.field4620 = class159.field2552.method2224(-119);
                    var218.field4623 = class159.field2552.method2250(-1613178296);
                }
                var218.field4627 = class159.field2552.method2250(-1613178296);
                if (var218.field4627 == 65535) {
                    var218.field4627 = -1;
                }
                class165.field2602[var216] = var218;
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 97) {
            long var196 = class159.field2552.method2204(true);
            int var198 = class159.field2552.method2250(arg0 ^ 0x60272544);
            int var199 = class159.field2552.method2224(-123);
            boolean var200 = true;
            String var201 = "";
            if (var198 > 0) {
                var201 = class159.field2552.method2198(-430);
            }
            if (var196 < 0L) {
                var200 = false;
                var196 &= Long.MAX_VALUE;
            }
            String var202 = class322.method2314(var196, true);
            for (int var203 = 0; var203 < class339.field5458; var203++) {
                if (class328.field5374[var203] == var196) {
                    if (class248.field3931[var203] != var198) {
                        class248.field3931[var203] = var198;
                        if (var198 > 0) {
                            class147.method1047(false, var202 + class221.field3383, "", 5);
                        }
                        if (var198 == 0) {
                            class147.method1047(false, var202 + class236.field3738, "", 5);
                        }
                    }
                    var202 = null;
                    class236.field3736[var203] = var201;
                    class21.field260[var203] = var199;
                    class296.field4909[var203] = var200;
                    break;
                }
            }
            boolean var204 = false;
            if (var202 != null && class339.field5458 < 200) {
                class328.field5374[class339.field5458] = var196;
                class31.field476[class339.field5458] = var202;
                class248.field3931[class339.field5458] = var198;
                class236.field3736[class339.field5458] = var201;
                class21.field260[class339.field5458] = var199;
                class296.field4909[class339.field5458] = var200;
                class339.field5458++;
            }
            int var205 = class339.field5458;
            class246.field3916 = class12.field157;
            while (var205 > 0) {
                boolean var206 = true;
                var205--;
                for (int var207 = 0; var207 < var205; var207++) {
                    if (class248.field3931[var207] != class203.field3111 && class248.field3931[var207 + 1] == class203.field3111 || class248.field3931[var207] == 0 && class248.field3931[var207 + 1] != 0) {
                        var206 = false;
                        int var208 = class248.field3931[var207];
                        class248.field3931[var207] = class248.field3931[var207 + 1];
                        class248.field3931[var207 + 1] = var208;
                        String var209 = class236.field3736[var207];
                        class236.field3736[var207] = class236.field3736[var207 + 1];
                        class236.field3736[var207 + 1] = var209;
                        String var210 = class31.field476[var207];
                        class31.field476[var207] = class31.field476[var207 + 1];
                        class31.field476[var207 + 1] = var210;
                        long var211 = class328.field5374[var207];
                        class328.field5374[var207] = class328.field5374[var207 + 1];
                        class328.field5374[var207 + 1] = var211;
                        int var213 = class21.field260[var207];
                        class21.field260[var207] = class21.field260[var207 + 1];
                        class21.field260[var207 + 1] = var213;
                        boolean var214 = class296.field4909[var207];
                        class296.field4909[var207] = class296.field4909[var207 + 1];
                        class296.field4909[var207 + 1] = var214;
                    }
                }
                if (var206) {
                    break;
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 94) {
            int var156 = class159.field2552.method2241((byte) 66);
            int var157 = class159.field2552.method2238(-7946);
            class69.method482(30757, var156, var157);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 106) {
            int var193 = class159.field2552.method2241((byte) 66);
            int var194 = class159.field2552.method2232(-4);
            if (class56.method421(var193, (byte) 74)) {
                int var195 = 0;
                if (class329.field5388.field600 != null) {
                    var195 = class329.field5388.field600.method2400(arg0 + 196);
                }
                class278.method1981(61, 3, var195, -1, var194);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 240) {
            int var187 = class159.field2552.method2250(-1613178296);
            int var188 = class159.field2552.method2224(-124);
            int var189 = class159.field2552.method2224(-125);
            int var190 = class159.field2552.method2250(-1613178296);
            int var191 = class159.field2552.method2224(arg0 + 123);
            int var192 = class159.field2552.method2224(arg0 ^ 0x85);
            if (class56.method421(var187, (byte) 74)) {
                class142.method1003(var192, var190, var189, var191, -108, var188);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 40) {
            int var182 = class159.field2552.method2231((byte) -124);
            int var183 = class159.field2552.method2227(0);
            int var184 = class159.field2552.method2224(-126);
            int var185 = class159.field2552.method2215(true);
            if (class56.method421(var185, (byte) 74)) {
                class167 var186 = (class167) class218.field3363.method29((long) var182, 103);
                if (var186 != null) {
                    class70.method489(var186.field2631 != var183, var186, 100);
                }
                class300.method2111(-49, var182, var184, var183);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 21) {
            int var158 = class159.field2552.method2224(-128);
            if (class159.field2552.method2224(-119) == 0) {
                class246.field3914[var158] = new class246();
            } else {
                class159.field2552.field5137--;
                class246.field3914[var158] = new class246(class159.field2552);
            }
            class315.field5200 = class12.field157;
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 189) {
            int var178 = class159.field2552.method2227(0);
            int var179 = class159.field2552.method2250(-1613178296);
            int var180 = class159.field2552.method2238(-7946);
            if (class56.method421(var178, (byte) 74)) {
                if (var180 == 2) {
                    class295.method2087((byte) 125);
                }
                class345.field5538 = var179;
                class13.method100(arg0 ^ 0xB4, var179);
                class157.method1123((byte) 120, false);
                class65.method457(arg0 + 368, class345.field5538);
                for (int var181 = 0; var181 < 100; var181++) {
                    class116.field1694[var181] = true;
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 110) {
            class132.method858(54);
            class346.method2437((byte) 0);
            class185.field2867 = -1;
            class211.field3205 += 32;
            return true;
        } else if (class185.field2867 == 71) {
            class346.method2437((byte) 0);
            class221.field3380 = class159.field2552.method2214(0);
            class282.field4631 = class12.field157;
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 81) {
            int var159 = class159.field2552.method2241((byte) 66);
            if (var159 == 65535) {
                var159 = -1;
            }
            int var160 = class159.field2552.method2241((byte) 66);
            if (var160 == 65535) {
                var160 = -1;
            }
            int var161 = class159.field2552.method2241((byte) 66);
            int var162 = class159.field2552.method2205(3);
            int var163 = class159.field2552.method2250(arg0 - 1613178052);
            if (class56.method421(var161, (byte) 74)) {
                for (int var164 = var159; var164 <= var160; var164++) {
                    long var165 = ((long) var162 << 32) + ((long) var164);
                    class77 var167 = (class77) class300.field4955.method29(var165, 103);
                    class77 var168;
                    if (var167 != null) {
                        var168 = new class77(var167.field1155, var163);
                        var167.method1131(8);
                    } else if (var164 == -1) {
                        var168 = new class77(class94.method629(5386, var162).field4333.field1155, var163);
                    } else {
                        var168 = new class77(0, var163);
                    }
                    class300.field4955.method37(false, var168, var165);
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 109) {
            class160.field2558 = class159.field2552.method2220(arg0 ^ 0x5382);
            class116.field1695 = class159.field2552.method2224(-121);
            for (int var175 = class160.field2558; var175 < (class160.field2558 + 8); var175++) {
                for (int var176 = class116.field1695; var176 < class116.field1695 + 8; var176++) {
                    if (class171.field2668[class120.field1779][var175][var176] != null) {
                        class171.field2668[class120.field1779][var175][var176] = null;
                        class148.method1055(var175, var176, true);
                    }
                }
            }
            for (class177 var177 = (class177) class41.field630.method1081(arg0 + 352); var177 != null; var177 = (class177) class41.field630.method1083((byte) 113)) {
                if (var177.field2762 >= class160.field2558 && var177.field2762 < class160.field2558 + 8 && var177.field2772 >= class116.field1695 && var177.field2772 < (class116.field1695 + 8) && class120.field1779 == var177.field2760) {
                    var177.field2767 = 0;
                }
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 171) {
            class29.method245(0);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 197) {
            long var169 = class159.field2552.method2204(true);
            String var171 = class175.method1227(class266.method1875(class211.method1436(class159.field2552, (byte) -127), true));
            class147.method1047(false, var171, class322.method2314(var169, true), 6);
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 34) {
            if (class345.field5538 != -1) {
                class160.method1134(0, (byte) -70, class345.field5538);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 41) {
            class160.field2558 = class159.field2552.method2216((byte) 92);
            class116.field1695 = class159.field2552.method2224(arg0 + 117);
            while (class201.field3091 > class159.field2552.field5137) {
                class185.field2867 = class159.field2552.method2224(-127);
                class50.method374(-21093);
            }
            class185.field2867 = -1;
            return true;
        } else if (class185.field2867 == 159) {
            int var172 = class159.field2552.method2227(arg0 ^ 0xFFFFFF0C);
            int var173 = class159.field2552.method2241((byte) 66);
            byte var174 = class159.field2552.method2186((byte) -111);
            if (class56.method421(var172, (byte) 74)) {
                class212.method1439(var173, true, var174);
            }
            class185.field2867 = -1;
            return true;
        } else {
            class326.method2328((Throwable) null, "T1 - " + class185.field2867 + "," + class291.field4823 + "," + class50.field738 + " - " + class201.field3091, true);
            class278.method1983(arg0 ^ 0xFFFFFF0D);
            return true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)V", line = 3066)
    public static final void method637(byte arg0, int arg1) {
        field1401++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class100.field1450[arg1];
        int var3 = class86.field1243[arg1];
        int var4 = class300.field4949[arg1];
        int var5 = (int) class258.field4095[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var6 = class258.field4095[arg1];
        if (var4 == 8) {
            class218.field3357 = 2;
            class105.field1526 = class241.field3777;
            class107.field1534++;
            class269.field4431 = class69.field1074;
            class233.field3703 = 0;
            class195.field2992.method250(21066, 120);
            class195.field2992.method2236(-1620419064, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class195.field2992.method2236(arg0 ^ 0x9F6A5E77, class215.field3313 + var2);
            class195.field2992.method2189(class150.field2420 + var3, -1669644664);
            class195.field2992.method2191(6729, class294.field4896[82] ? 1 : 0);
        }
        if (var4 == 26) {
            class195.field2992.method250(21066, 128);
            class143.field2296++;
            class195.field2992.method2233(var2, -29032);
            class195.field2992.method2207(false, var3);
            class195.field2992.method2189(var5, -1669644664);
            class214.field3267 = 0;
            class165.field2594 = class94.method629(5386, var3);
            class355.field5632 = var2;
        }
        if (var4 == 1009 || var4 == 1012 || var4 == 1005 || var4 == 1008 || var4 == 1001) {
            class297.method2098(var5, var4, true, var2);
        }
        if (var4 == 45) {
            class105.field1526 = class241.field3777;
            class269.field4431 = class69.field1074;
            class233.field3703 = 0;
            class318.field5237++;
            class218.field3357 = 2;
            class195.field2992.method250(arg0 + 20939, 19);
            class195.field2992.method2233(class150.field2420 + var3, -29032);
            class195.field2992.method2209(class294.field4896[82] ? 1 : 0, (byte) 118);
            class195.field2992.method2206(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -51);
            class195.field2992.method2233(class313.field5108, arg0 ^ 0xFFFF8EE7);
            class195.field2992.method2222(class345.field5530, 255);
            class195.field2992.method2189(class215.field3313 + var2, -1669644664);
        }
        if (var4 == 17) {
            class195.field2992.method250(21066, 248);
            class33.field512++;
            class195.field2992.method2206(var5, (byte) -116);
            class195.field2992.method2229(var3, 17574);
            class195.field2992.method2233(var2, arg0 - 29159);
            class214.field3267 = 0;
            class165.field2594 = class94.method629(arg0 + 5259, var3);
            class355.field5632 = var2;
        }
        if (var4 == 1006) {
            class105.field1526 = class241.field3777;
            class233.field3703 = 0;
            class218.field3357 = 2;
            class14.field184++;
            class269.field4431 = class69.field1074;
            class195.field2992.method250(arg0 ^ 0x5235, 74);
            class195.field2992.method2206(class150.field2420 + var3, (byte) -103);
            class195.field2992.method2189(class215.field3313 + var2, -1669644664);
            class195.field2992.method2191(6729, class294.field4896[82] ? 1 : 0);
            class195.field2992.method2189(Integer.MAX_VALUE & (int) (var6 >>> 32), -1669644664);
        }
        if (var4 == 31) {
            class39 var8 = class130.field1984[var5];
            if (var8 != null) {
                class89.field1296++;
                class218.field3357 = 2;
                class269.field4431 = class69.field1074;
                class233.field3703 = 0;
                class105.field1526 = class241.field3777;
                class195.field2992.method250(21066, 101);
                class195.field2992.method2189(var5, -1669644664);
                class195.field2992.method2193(class294.field4896[82] ? 1 : 0, false);
            }
        }
        if (var4 == 43) {
            class233.field3703 = 0;
            class218.field3357 = 2;
            class269.field4431 = class69.field1074;
            class25.field376++;
            class105.field1526 = class241.field3777;
            class195.field2992.method250(21066, 30);
            class195.field2992.method2206(class215.field3313 + var2, (byte) -67);
            class195.field2992.method2189(class150.field2420 + var3, -1669644664);
            class195.field2992.method2193(class294.field4896[82] ? 1 : 0, false);
            class195.field2992.method2206(var5, (byte) -62);
        }
        if (var4 == 10) {
            class253.field4022++;
            class269.field4431 = class69.field1074;
            class218.field3357 = 2;
            class105.field1526 = class241.field3777;
            class233.field3703 = 0;
            class195.field2992.method250(21066, 8);
            class195.field2992.method2236(-1620419064, var2 + class215.field3313);
            class195.field2992.method2236(arg0 ^ 0x9F6A5E77, var5);
            class195.field2992.method2191(6729, class294.field4896[82] ? 1 : 0);
            class195.field2992.method2236(-1620419064, class150.field2420 + var3);
        }
        if (var4 == 20) {
            class39 var9 = class130.field1984[var5];
            if (var9 != null) {
                class116.field1692++;
                class269.field4431 = class69.field1074;
                class105.field1526 = class241.field3777;
                class233.field3703 = 0;
                class218.field3357 = 2;
                class195.field2992.method250(21066, 7);
                class195.field2992.method2236(-1620419064, class313.field5108);
                class195.field2992.method2229(class345.field5530, arg0 + 17447);
                class195.field2992.method2206(var5, (byte) -71);
                class195.field2992.method2191(6729, class294.field4896[82] ? 1 : 0);
            }
        }
        if (var4 == 58) {
            class213.field3227++;
            class218.field3357 = 2;
            class105.field1526 = class241.field3777;
            class269.field4431 = class69.field1074;
            class233.field3703 = 0;
            class195.field2992.method250(arg0 + 20939, 87);
            class195.field2992.method2236(-1620419064, class264.field4353);
            class195.field2992.method2222(class104.field1511, arg0 + 128);
            class195.field2992.method2233(class215.field3313 + var2, arg0 ^ 0xFFFF8EE7);
            class195.field2992.method2206(class150.field2420 + var3, (byte) -128);
            class195.field2992.method2196(class294.field4896[82] ? 1 : 0, 128);
            class195.field2992.method2206(class322.field5301, (byte) -43);
            class195.field2992.method2236(-1620419064, var5);
        }
        if (var4 == 11) {
            class51.field759++;
            class195.field2992.method250(arg0 + 20939, 109);
            class195.field2992.method2222(var3, arg0 + 128);
            class264 var10 = class94.method629(arg0 ^ 0x1575, var3);
            if (var10.field4241 != null && var10.field4241[0][0] == 5) {
                int var11 = var10.field4241[0][1];
                if (class170.field2650[var11] != var10.field4246[0]) {
                    class170.field2650[var11] = var10.field4246[0];
                    class58.method431((byte) 44, var11);
                }
            }
        }
        if (var4 == 59) {
            class233.field3706++;
            class269.field4431 = class69.field1074;
            class233.field3703 = 0;
            class218.field3357 = 2;
            class105.field1526 = class241.field3777;
            class195.field2992.method250(21066, 49);
            class195.field2992.method2222(class345.field5530, arg0 ^ 0x80);
            class195.field2992.method2236(arg0 - 1620419191, class215.field3313 + var2);
            class195.field2992.method2189(var5, -1669644664);
            class195.field2992.method2209(class294.field4896[82] ? 1 : 0, (byte) 118);
            class195.field2992.method2233(class313.field5108, -29032);
            class195.field2992.method2189(class150.field2420 + var3, arg0 + -1669644791);
        }
        if (var4 == 42) {
            class39 var12 = class130.field1984[var5];
            if (var12 != null) {
                class218.field3357 = 2;
                class105.field1526 = class241.field3777;
                class269.field4431 = class69.field1074;
                class233.field3703 = 0;
                class257.field4062++;
                class195.field2992.method250(21066, 115);
                class195.field2992.method2233(var5, arg0 ^ 0xFFFF8EE7);
                class195.field2992.method2196(class294.field4896[82] ? 1 : 0, 128);
            }
        }
        if (var4 == 13) {
            class238.field3774++;
            class195.field2992.method250(arg0 ^ 0x5235, 133);
            class195.field2992.method2236(-1620419064, var5);
            class195.field2992.method2222(var3, arg0 + 128);
            class195.field2992.method2233(var2, arg0 - 29159);
            class214.field3267 = 0;
            class165.field2594 = class94.method629(5386, var3);
            class355.field5632 = var2;
        }
        if (var4 == 9) {
            class233 var13 = class329.field5377[var5];
            if (var13 != null) {
                class109.field1548++;
                class218.field3357 = 2;
                class269.field4431 = class69.field1074;
                class233.field3703 = 0;
                class105.field1526 = class241.field3777;
                class195.field2992.method250(21066, 185);
                class195.field2992.method2191(arg0 ^ 0x1A36, class294.field4896[82] ? 1 : 0);
                class195.field2992.method2236(arg0 - 1620419191, var5);
            }
        }
        if (var4 == 57) {
            class297.method2097((byte) -29);
        }
        if (var4 == 36) {
            class39 var14 = class130.field1984[var5];
            if (var14 != null) {
                class269.field4431 = class69.field1074;
                class293.field4854++;
                class218.field3357 = 2;
                class105.field1526 = class241.field3777;
                class233.field3703 = 0;
                class195.field2992.method250(arg0 ^ 0x5235, 5);
                class195.field2992.method2233(var5, -29032);
                class195.field2992.method2196(class294.field4896[82] ? 1 : 0, arg0 ^ 0xFF);
            }
        }
        if (var4 == 18) {
            class195.field2992.method250(21066, 92);
            class49.field715++;
            class195.field2992.method2233(var5, -29032);
            class195.field2992.method2248(var3, 125);
            class195.field2992.method2236(-1620419064, var2);
            class214.field3267 = 0;
            class165.field2594 = class94.method629(5386, var3);
            class355.field5632 = var2;
        }
        if (var4 == 1007) {
            class269.field4431 = class69.field1074;
            class105.field1526 = class241.field3777;
            class183.field2856++;
            class233.field3703 = 0;
            class218.field3357 = 2;
            class195.field2992.method250(arg0 + 20939, 114);
            class195.field2992.method2233(var5, -29032);
        }
        if (var4 == 37) {
            class105.field1526 = class241.field3777;
            class233.field3703 = 0;
            class218.field3357 = 2;
            class269.field4431 = class69.field1074;
            class310.field5050++;
            class195.field2992.method250(21066, 44);
            class195.field2992.method2236(-1620419064, class150.field2420 + var3);
            class195.field2992.method2233(var5, -29032);
            class195.field2992.method2236(-1620419064, class215.field3313 + var2);
            class195.field2992.method2191(6729, class294.field4896[82] ? 1 : 0);
        }
        if (var4 == 15) {
            class39 var15 = class130.field1984[var5];
            if (var15 != null) {
                class269.field4431 = class69.field1074;
                class41.field616++;
                class105.field1526 = class241.field3777;
                class233.field3703 = 0;
                class218.field3357 = 2;
                class195.field2992.method250(21066, 198);
                class195.field2992.method2191(6729, class294.field4896[82] ? 1 : 0);
                class195.field2992.method2189(var5, -1669644664);
            }
        }
        if (var4 == 48) {
            class233.field3703 = 0;
            class105.field1526 = class241.field3777;
            class218.field3357 = 2;
            class269.field4431 = class69.field1074;
            class195.field2992.method250(21066, 77);
            class157.field2532++;
            class195.field2992.method2233(class215.field3313 + var2, -29032);
            class195.field2992.method2209(class294.field4896[82] ? 1 : 0, (byte) 118);
            class195.field2992.method2236(-1620419064, var5);
            class195.field2992.method2206(var3 + class150.field2420, (byte) -106);
        }
        if (var4 == 14) {
            if (var5 == 0) {
                class40.field611 = 1;
                class290.method2057(class120.field1779, var2, var3);
            } else if (class121.field1804 > 0 && class294.field4896[82] && class294.field4896[81]) {
                class51.method376(class150.field2420 + var3, class120.field1779, 1791677414, class215.field3313 + var2);
            } else {
                class195.field2992.method250(arg0 ^ 0x5235, 81);
                class195.field2992.method2236(-1620419064, class215.field3313 + var2);
                class195.field2992.method2206(class150.field2420 + var3, (byte) -45);
                class129.field1969++;
            }
        }
        if (var4 == 1010) {
            class233.field3703 = 0;
            class218.field3357 = 2;
            class269.field4431 = class69.field1074;
            class358.field5669++;
            class105.field1526 = class241.field3777;
            class195.field2992.method250(arg0 + 20939, 122);
            class195.field2992.method2189(var5, -1669644664);
        }
        if (var4 == 12) {
            class233 var16 = class329.field5377[var5];
            if (var16 != null) {
                class218.field3357 = 2;
                class90.field1308++;
                class233.field3703 = 0;
                class105.field1526 = class241.field3777;
                class269.field4431 = class69.field1074;
                class195.field2992.method250(21066, 68);
                class195.field2992.method2233(var5, -29032);
                class195.field2992.method2233(class322.field5301, -29032);
                class195.field2992.method2236(-1620419064, class264.field4353);
                class195.field2992.method2193(class294.field4896[82] ? 1 : 0, false);
                class195.field2992.method2207(false, class104.field1511);
            }
        }
        if (var4 == 40) {
            if (var5 == 0) {
                class28.field423 = 1;
                class290.method2057(class120.field1779, var2, var3);
            } else if (var5 == 1) {
                class195.field2992.method250(21066, 173);
                class192.field2979++;
                class195.field2992.method2206(class215.field3313 + var2, (byte) -99);
                class195.field2992.method2206(class313.field5108, (byte) -95);
                class195.field2992.method2236(-1620419064, class150.field2420 + var3);
                class195.field2992.method2207(false, class345.field5530);
            }
        }
        if (var4 == 6) {
            class218.field3357 = 2;
            class105.field1526 = class241.field3777;
            class59.field894++;
            class269.field4431 = class69.field1074;
            class233.field3703 = 0;
            class195.field2992.method250(arg0 + 20939, 135);
            class195.field2992.method2236(-1620419064, var5);
            class195.field2992.method2196(class294.field4896[82] ? 1 : 0, arg0 + 1);
            class195.field2992.method2236(-1620419064, class215.field3313 + var2);
            class195.field2992.method2233(var3 + class150.field2420, -29032);
        }
        if (var4 == 19) {
            class39 var17 = class130.field1984[var5];
            if (var17 != null) {
                class218.field3357 = 2;
                class233.field3703 = 0;
                class142.field2283++;
                class269.field4431 = class69.field1074;
                class105.field1526 = class241.field3777;
                class195.field2992.method250(21066, 249);
                class195.field2992.method2196(class294.field4896[82] ? 1 : 0, 128);
                class195.field2992.method2189(var5, -1669644664);
            }
        }
        if (var4 == 29) {
            class269.field4431 = class69.field1074;
            class233.field3703 = 0;
            class218.field3357 = 2;
            class305.field4985++;
            class105.field1526 = class241.field3777;
            class195.field2992.method250(arg0 + 20939, 107);
            class195.field2992.method2196(class294.field4896[82] ? 1 : 0, 128);
            class195.field2992.method2189(class215.field3313 + var2, arg0 ^ 0x9C7B3EF7);
            class195.field2992.method2189(var3 + class150.field2420, -1669644664);
            class195.field2992.method2206((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -124);
        }
        if (var4 == 16 || var4 == 1004) {
            class102.method662(var5, class190.field2938[arg1], var3, var2, arg0 ^ 0x19);
        }
        if (var4 == 35) {
            class39 var18 = class130.field1984[var5];
            if (var18 != null) {
                class269.field4431 = class69.field1074;
                class105.field1526 = class241.field3777;
                class32.field482++;
                class233.field3703 = 0;
                class218.field3357 = 2;
                class195.field2992.method250(21066, 129);
                class195.field2992.method2209(class294.field4896[82] ? 1 : 0, (byte) 118);
                class195.field2992.method2233(var5, -29032);
            }
        }
        if (var4 == 33 && class172.field2695 == null) {
            class169.method1170(var2, 31874, var3);
            class172.field2695 = class113.method741(var3, (byte) 125, var2);
            class218.method1472((byte) 97, class172.field2695);
        }
        if (var4 == 51) {
            class269.field4431 = class69.field1074;
            class218.field3357 = 2;
            class233.field3703 = 0;
            class357.field5662++;
            class105.field1526 = class241.field3777;
            class195.field2992.method250(arg0 ^ 0x5235, 220);
            class195.field2992.method2189(class150.field2420 + var3, -1669644664);
            class195.field2992.method2236(arg0 - 1620419191, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class195.field2992.method2236(-1620419064, class215.field3313 + var2);
            class195.field2992.method2193(class294.field4896[82] ? 1 : 0, false);
        }
        if (var4 == 22) {
            class195.field2992.method250(21066, 2);
            class195.field2992.method2206(var2, (byte) -79);
            class195.field2992.method2206(var5, (byte) -115);
            class195.field2992.method2229(var3, 17574);
            class311.field5060++;
            class214.field3267 = 0;
            class165.field2594 = class94.method629(arg0 + 5259, var3);
            class355.field5632 = var2;
        }
        if (var4 == 21) {
            class233 var19 = class329.field5377[var5];
            if (var19 != null) {
                class269.field4431 = class69.field1074;
                class233.field3703 = 0;
                class218.field3357 = 2;
                class105.field1526 = class241.field3777;
                class154.field2495++;
                class195.field2992.method250(21066, 56);
                class195.field2992.method2233(var5, -29032);
                class195.field2992.method2209(class294.field4896[82] ? 1 : 0, (byte) 118);
            }
        }
        if (var4 == 1002) {
            class264 var20 = class94.method629(5386, var3);
            if (var20 == null || var20.field4321[var2] < 100000) {
                class183.field2856++;
                class195.field2992.method250(21066, 114);
                class195.field2992.method2233(var5, -29032);
            } else {
                class147.method1047(false, var20.field4321[var2] + " x " + class322.method2311(var5, -120).field1596, "", 0);
            }
            class214.field3267 = 0;
            class165.field2594 = class94.method629(5386, var3);
            class355.field5632 = var2;
        }
        if (var4 == 46) {
            class352.method2459(-1);
            class264 var36 = class94.method629(5386, var3);
            class104.field1511 = var3;
            class264.field4353 = var2;
            class322.field5301 = var5;
            class56.field856 = 1;
            class218.method1472((byte) 101, var36);
            class37.field550 = "<col=ff9040>" + class322.method2311(var5, -120).field1596 + "<col=ffffff>";
            if (class37.field550 == null) {
                class37.field550 = "null";
            }
            return;
        }
        if (var4 == 2) {
            class39 var21 = class130.field1984[var5];
            if (var21 != null) {
                class269.field4431 = class69.field1074;
                class233.field3703 = 0;
                class306.field5000++;
                class105.field1526 = class241.field3777;
                class218.field3357 = 2;
                class195.field2992.method250(21066, 180);
                class195.field2992.method2191(arg0 + 6602, class294.field4896[82] ? 1 : 0);
                class195.field2992.method2189(var5, -1669644664);
            }
        }
        if (var4 == 23) {
            class269.field4431 = class69.field1074;
            class233.field3703 = 0;
            class105.field1526 = class241.field3777;
            class218.field3357 = 2;
            class195.field2992.method250(arg0 + 20939, 234);
            class233.field3707++;
            class195.field2992.method2191(6729, class294.field4896[82] ? 1 : 0);
            class195.field2992.method2206(class150.field2420 + var3, (byte) -99);
            class195.field2992.method2222(class104.field1511, 255);
            class195.field2992.method2189(Integer.MAX_VALUE & (int) (var6 >>> 32), arg0 ^ 0x9C7B3EF7);
            class195.field2992.method2189(class264.field4353, -1669644664);
            class195.field2992.method2236(arg0 ^ 0x9F6A5E77, class215.field3313 + var2);
            class195.field2992.method2206(class322.field5301, (byte) -118);
        }
        if (var4 == 34) {
            class350.field5588++;
            class195.field2992.method250(21066, 213);
            class195.field2992.method2206(var2, (byte) -42);
            class195.field2992.method2207(false, var3);
            class195.field2992.method2189(var5, -1669644664);
            class214.field3267 = 0;
            class165.field2594 = class94.method629(arg0 ^ 0x1575, var3);
            class355.field5632 = var2;
        }
        if (var4 == 44) {
            class39 var22 = class130.field1984[var5];
            if (var22 != null) {
                class292.field4840++;
                class105.field1526 = class241.field3777;
                class269.field4431 = class69.field1074;
                class218.field3357 = 2;
                class233.field3703 = 0;
                class195.field2992.method250(21066, 97);
                class195.field2992.method2236(-1620419064, var5);
                class195.field2992.method2209(class294.field4896[82] ? 1 : 0, (byte) 118);
            }
        }
        if (var4 == 1) {
            class39 var23 = class130.field1984[var5];
            if (var23 != null) {
                class105.field1526 = class241.field3777;
                class218.field3357 = 2;
                class230.field3641++;
                class233.field3703 = 0;
                class269.field4431 = class69.field1074;
                class195.field2992.method250(21066, 167);
                class195.field2992.method2248(class104.field1511, 114);
                class195.field2992.method2233(var5, arg0 ^ 0xFFFF8EE7);
                class195.field2992.method2233(class264.field4353, -29032);
                class195.field2992.method2196(class294.field4896[82] ? 1 : 0, 128);
                class195.field2992.method2189(class322.field5301, -1669644664);
            }
        }
        if (var4 == 39) {
            class195.field2992.method250(21066, 177);
            class325.field5335++;
            class195.field2992.method2236(-1620419064, var5);
            class195.field2992.method2207(false, var3);
            class195.field2992.method2236(arg0 ^ 0x9F6A5E77, var2);
            class214.field3267 = 0;
            class165.field2594 = class94.method629(5386, var3);
            class355.field5632 = var2;
        }
        if (var4 == 28) {
            class264 var24 = class113.method741(var3, (byte) 125, var2);
            if (var24 != null) {
                class352.method2459(arg0 ^ 0xFFFFFF80);
                class77 var25 = client.method898(var24);
                class11.method70(var25.method525(-21845), 23443, var24.field4343, var25.field1157, var2, var24.field4177, var3);
                class56.field856 = 0;
                class120.field1776 = class345.method2433((byte) -126, var24);
                if (class120.field1776 == null) {
                    class120.field1776 = "Null";
                }
                if (var24.field4276) {
                    class167.field2630 = var24.field4210 + "<col=ffffff>";
                } else {
                    class167.field2630 = "<col=00ff00>" + var24.field4214 + "<col=ffffff>";
                }
            }
            return;
        }
        if (var4 == 50) {
            class195.field2992.method250(21066, 51);
            class161.field2565++;
            class195.field2992.method2248(class104.field1511, arg0 - 6);
            class195.field2992.method2189(class264.field4353, -1669644664);
            class195.field2992.method2206(var5, (byte) -69);
            class195.field2992.method2233(var2, -29032);
            class195.field2992.method2229(var3, 17574);
            class195.field2992.method2236(-1620419064, class322.field5301);
            class214.field3267 = 0;
            class165.field2594 = class94.method629(5386, var3);
            class355.field5632 = var2;
        }
        if (var4 == 30) {
            class233 var26 = class329.field5377[var5];
            if (var26 != null) {
                class105.field1526 = class241.field3777;
                class218.field3357 = 2;
                class177.field2769++;
                class233.field3703 = 0;
                class269.field4431 = class69.field1074;
                class195.field2992.method250(arg0 ^ 0x5235, 78);
                class195.field2992.method2236(-1620419064, class313.field5108);
                class195.field2992.method2248(class345.field5530, 77);
                class195.field2992.method2193(class294.field4896[82] ? 1 : 0, false);
                class195.field2992.method2233(var5, -29032);
            }
        }
        if (var4 == 5) {
            class357.field5646++;
            class195.field2992.method250(21066, 187);
            class195.field2992.method2206(var2, (byte) -81);
            class195.field2992.method2248(var3, 115);
            class195.field2992.method2189(var5, arg0 - 1669644791);
            class195.field2992.method2207(false, class345.field5530);
            class195.field2992.method2189(class313.field5108, arg0 - 1669644791);
            class214.field3267 = 0;
            class165.field2594 = class94.method629(5386, var3);
            class355.field5632 = var2;
        }
        if (var4 == 32) {
            class269.field4431 = class69.field1074;
            class233.field3703 = 0;
            class313.field5152++;
            class105.field1526 = class241.field3777;
            class218.field3357 = 2;
            class195.field2992.method250(21066, 66);
            class195.field2992.method2206(var3 + class150.field2420, (byte) -63);
            class195.field2992.method2191(6729, class294.field4896[82] ? 1 : 0);
            class195.field2992.method2206(class215.field3313 + var2, (byte) -126);
            class195.field2992.method2236(-1620419064, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 4) {
            class233 var27 = class329.field5377[var5];
            if (var27 != null) {
                class269.field4431 = class69.field1074;
                class356.field5640++;
                class218.field3357 = 2;
                class105.field1526 = class241.field3777;
                class233.field3703 = 0;
                class195.field2992.method250(21066, 9);
                class195.field2992.method2189(var5, arg0 - 1669644791);
                class195.field2992.method2209(class294.field4896[82] ? 1 : 0, (byte) 118);
            }
        }
        if (var4 == 60) {
            class233 var28 = class329.field5377[var5];
            if (var28 != null) {
                class218.field3357 = 2;
                class233.field3703 = 0;
                class269.field4431 = class69.field1074;
                class192.field2973++;
                class105.field1526 = class241.field3777;
                class195.field2992.method250(21066, 32);
                class195.field2992.method2189(var5, arg0 ^ 0x9C7B3EF7);
                class195.field2992.method2196(class294.field4896[82] ? 1 : 0, 128);
            }
        }
        if (var4 == 24) {
            class13.field168++;
            class195.field2992.method250(arg0 ^ 0x5235, 10);
            class195.field2992.method2248(var3, 78);
            class195.field2992.method2189(var5, arg0 - 1669644791);
            class195.field2992.method2206(var2, (byte) -55);
            class214.field3267 = 0;
            class165.field2594 = class94.method629(5386, var3);
            class355.field5632 = var2;
        }
        if (var4 == 25) {
            class233 var29 = class329.field5377[var5];
            if (var29 != null) {
                class300.field4945++;
                class269.field4431 = class69.field1074;
                class233.field3703 = 0;
                class105.field1526 = class241.field3777;
                class218.field3357 = 2;
                class195.field2992.method250(21066, 192);
                class195.field2992.method2193(class294.field4896[82] ? 1 : 0, false);
                class195.field2992.method2233(var5, -29032);
            }
        }
        if (arg0 != 127) {
            return;
        }
        if (var4 == 41) {
            class195.field2992.method250(21066, 143);
            class92.field1352++;
            class195.field2992.method2229(var3, arg0 + 17447);
            class195.field2992.method2233(var5, -29032);
            class195.field2992.method2236(-1620419064, var2);
            class214.field3267 = 0;
            class165.field2594 = class94.method629(arg0 + 5259, var3);
            class355.field5632 = var2;
        }
        if (var4 == 1003) {
            class218.field3357 = 2;
            class233.field3703 = 0;
            class105.field1526 = class241.field3777;
            class269.field4431 = class69.field1074;
            class233 var30 = class329.field5377[var5];
            if (var30 != null) {
                class139 var31 = var30.field3702;
                if (var31.field2229 != null) {
                    var31 = var31.method987(-1);
                }
                if (var31 != null) {
                    class285.field4670++;
                    class195.field2992.method250(21066, 186);
                    class195.field2992.method2189(var31.field2242, -1669644664);
                }
            }
        }
        if (var4 == 7) {
            class195.field2992.method250(21066, 41);
            class195.field2992.method2207(false, var3);
            class350.field5595++;
            class195.field2992.method2233(var2, -29032);
            class195.field2992.method2236(-1620419064, var5);
            class214.field3267 = 0;
            class165.field2594 = class94.method629(5386, var3);
            class355.field5632 = var2;
        }
        if (var4 == 3) {
            class264 var32 = class94.method629(5386, var3);
            boolean var33 = true;
            if (var32.field4233 > 0) {
                var33 = class170.method1177(var32, 21325);
            }
            if (var33) {
                class195.field2992.method250(21066, 109);
                class195.field2992.method2222(var3, 255);
                class51.field759++;
            }
        }
        if (var4 == 49) {
            class72.field1102++;
            class195.field2992.method250(21066, 241);
            class195.field2992.method2207(false, class345.field5530);
            class195.field2992.method2189(var2, arg0 - 1669644791);
            class195.field2992.method2206(class313.field5108, (byte) -67);
            class195.field2992.method2222(var3, 255);
        }
        if (var4 == 47) {
            class195.field2992.method250(21066, 109);
            class195.field2992.method2222(var3, arg0 ^ 0x80);
            class264 var34 = class94.method629(arg0 + 5259, var3);
            class51.field759++;
            if (var34.field4241 != null && var34.field4241[0][0] == 5) {
                int var35 = var34.field4241[0][1];
                class170.field2650[var35] = 1 - class170.field2650[var35];
                class58.method431((byte) 44, var35);
            }
        }
        if (var4 == 38) {
            if (var5 == 0) {
                class290.method2057(class120.field1779, var2, var3);
            } else if (var5 == 1) {
                if (class121.field1804 > 0 && class294.field4896[82] && class294.field4896[81]) {
                    class51.method376(class150.field2420 + var3, class120.field1779, 1791677414, class215.field3313 + var2);
                } else {
                    class39.method318(var2, (byte) -74, var3, 1);
                    class195.field2992.method2193(class124.field1855, false);
                    class195.field2992.method2193(class94.field1370, false);
                    class195.field2992.method2206((int) class355.field5628, (byte) -122);
                    class195.field2992.method2193(57, false);
                    class195.field2992.method2193(class322.field5284, false);
                    class195.field2992.method2193(class196.field3008, false);
                    class195.field2992.method2193(89, false);
                    class195.field2992.method2206(class329.field5388.field4796, (byte) -96);
                    class195.field2992.method2206(class329.field5388.field4783, (byte) -101);
                    class195.field2992.method2193(class141.field2275, false);
                    class195.field2992.method2193(63, false);
                }
            }
        }
        if (class56.field856 != 0) {
            class56.field856 = 0;
            class218.method1472((byte) 121, class94.method629(arg0 ^ 0x1575, class104.field1511));
        }
        if (class107.field1532) {
            class352.method2459(arg0 - 128);
        }
        if (class165.field2594 != null && class214.field3267 == 0) {
            class218.method1472((byte) 113, class165.field2594);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Lph;", line = 4114)
    public final class308 method638(boolean arg0) {
        field1391++;
        if (this.field1402 == null) {
            return null;
        } else if (arg0) {
            class308 var2 = this.field1393[(int) (this.field1384 & (long) (this.field1389 - 1))];
            while (this.field1402 != var2) {
                if (this.field1402.field5011 == this.field1384) {
                    class308 var3 = this.field1402;
                    this.field1402 = this.field1402.field5012;
                    return var3;
                }
                this.field1402 = this.field1402.field5012;
            }
            this.field1402 = null;
            return null;
        } else {
            return (class308) null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V", line = 4147)
    public class96(int arg0) {
        this.field1389 = arg0;
        this.field1393 = new class308[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class308 var3 = this.field1393[var2] = new class308();
            var3.field5012 = var3;
            var3.field5009 = var3;
        }
    }
}
