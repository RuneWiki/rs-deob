import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class159 {

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Loi;")
    public class82 field2438 = new class82();

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field2449 = 0;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field2440 = 0;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field2452 = -1;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2453 = "slide:";

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Loi;")
    private class82 field2450;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "[Lsb;")
    public static class230[] field2447;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljj;III)V")
    public static final void method981(class107 arg0, int arg1, int arg2, int arg3) {
        if ((arg1 & 0x20) != 0) {
            int var4 = class100.field1580.method1563((byte) 3);
            int var5 = class100.field1580.method1571((byte) -81);
            arg0.method931(var5, class270.field4058, (byte) 124, var4);
            arg0.field2212 = class270.field4058 + 300;
            arg0.field2299 = class100.field1580.method1593((byte) 27);
        }
        if ((arg1 & 0x1) != 0) {
            int var6 = class100.field1580.method1570(true);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class100.field1580.method1572(-123);
            class149.method906(var6, var7, arg0, true);
        }
        if ((arg1 & 0x200) != 0) {
            arg0.field2224 = class100.field1580.method1583(-1);
            arg0.field2252 = class100.field1580.method1583(-1);
            arg0.field2284 = class100.field1580.method1571((byte) -118);
            arg0.field2256 = class100.field1580.method1593((byte) 27);
            arg0.field2262 = class100.field1580.method1575(false) + class270.field4058;
            arg0.field2289 = class100.field1580.method1570(true) + class270.field4058;
            arg0.field2293 = class100.field1580.method1572(-125);
            arg0.field2277 = 1;
            arg0.field2246 = 0;
        }
        if ((arg1 & 0x800) != arg3) {
            int var8 = class100.field1580.method1583(-1);
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            for (int var12 = 0; var12 < var8; var12++) {
                int var13 = class100.field1580.method1618(16711680);
                if (var13 == 65535) {
                    var13 = -1;
                }
                var9[var12] = var13;
                var11[var12] = class100.field1580.method1583(-1);
                var10[var12] = class100.field1580.method1570(true);
            }
            class23.method147(1, arg0, var10, var9, var11);
        }
        if ((arg1 & 0x80) != 0) {
            arg0.field2210 = class100.field1580.method1570(true);
            arg0.field2216 = class100.field1580.method1570(true);
        }
        if ((arg1 & 0x100) != 0) {
            int var14 = class100.field1580.method1578(-2);
            if (var14 == 65535) {
                var14 = -1;
            }
            boolean var15 = true;
            int var16 = class100.field1580.method1590((byte) -73);
            if (var14 != -1 && arg0.field2230 != -1 && class276.method1829(class236.method1498((byte) -127, var14).field249, 29223).field3227 < class276.method1829(class236.method1498((byte) -107, arg0.field2230).field249, 29223).field3227) {
                var15 = false;
            }
            if (var15) {
                arg0.field2230 = var14;
                arg0.field2221 = var16 >> 16;
                arg0.field2280 = (var16 & 0xFFFF) + class270.field4058;
                arg0.field2272 = 1;
                arg0.field2218 = 0;
                arg0.field2201 = 0;
                if (class270.field4058 < arg0.field2280) {
                    arg0.field2201 = -1;
                }
                if (arg0.field2230 != -1 && class270.field4058 == arg0.field2280) {
                    int var17 = class236.method1498((byte) -104, arg0.field2230).field249;
                    if (var17 != -1) {
                        class215 var18 = class276.method1829(var17, 29223);
                        if (var18 != null && var18.field3215 != null) {
                            client.method966((byte) 52, 0, class165.field2537 == arg0, arg0.field2234, var18, arg0.field2251);
                        }
                    }
                }
            }
        }
        field2441++;
        if ((arg1 & 0x2) != 0) {
            arg0.field2283 = class100.field1580.method1575(false);
            if (arg0.field2283 == 65535) {
                arg0.field2283 = -1;
            }
        }
        if ((arg1 & 0x10) != 0) {
            int var19 = class100.field1580.method1575(false);
            boolean var20 = (var19 & 0x8000) != 0;
            int var21 = class100.field1580.method1593((byte) 27);
            int var22 = class100.field1580.method1593((byte) 27);
            int var23 = class100.field1580.field3748;
            if (arg0.field1663 != null && arg0.field1670 != null) {
                long var24 = class94.method604((byte) 66, arg0.field1663);
                boolean var26 = false;
                if (var21 <= 1) {
                    if (var20 || (!class85.field1354 || class41.field610) && !class116.field1762) {
                        for (int var27 = 0; var27 < class154.field2307; var27++) {
                            if (class35.field493[var27] == var24) {
                                var26 = true;
                                break;
                            }
                        }
                    } else {
                        var26 = true;
                    }
                }
                if (!var26 && class218.field3280 == 0) {
                    class273.field4108.field3748 = 0;
                    class100.field1580.method1579(arg3 ^ 0x6E0C, class273.field4108.field3723, 0, var22);
                    int var28 = -1;
                    class273.field4108.field3748 = 0;
                    String var29;
                    if (var20) {
                        var19 &= 0x7FFF;
                        class295 var30 = class293.method1938(119, class273.field4108);
                        var28 = var30.field4671;
                        var29 = var30.field4676.method477(class273.field4108, arg3);
                    } else {
                        var29 = class164.method1021(class2.method9(class210.method1346(class273.field4108, false), 1207));
                    }
                    arg0.field2254 = var29.trim();
                    arg0.field2225 = var19 & 0xFF;
                    arg0.field2255 = 150;
                    arg0.field2253 = var19 >> 8;
                    if (var21 == 2) {
                        class1.method1(arg3, "<img=1>" + arg0.method672(5), (String) null, var29, var20 ? 17 : 1, var28);
                    } else if (var21 == 1) {
                        class1.method1(0, "<img=0>" + arg0.method672(5), (String) null, var29, var20 ? 17 : 1, var28);
                    } else {
                        class1.method1(0, arg0.method672(5), (String) null, var29, var20 ? 17 : 2, var28);
                    }
                }
            }
            class100.field1580.field3748 = var22 + var23;
        }
        if ((arg1 & 0x8) != 0) {
            arg0.field2254 = class100.field1580.method1597((byte) 88);
            if (arg0.field2254.charAt(0) == '~') {
                arg0.field2254 = arg0.field2254.substring(1);
                class48.method321(2, arg0.method672(5), arg0.field2254, 97);
            } else if (class165.field2537 == arg0) {
                class48.method321(2, arg0.method672(5), arg0.field2254, 92);
            }
            arg0.field2225 = 0;
            arg0.field2255 = 150;
            arg0.field2253 = 0;
        }
        if ((arg1 & 0x400) != 0) {
            int var31 = class100.field1580.method1563((byte) 3);
            int var32 = class100.field1580.method1583(-1);
            arg0.method931(var32, class270.field4058, (byte) 56, var31);
        }
        if ((arg1 & 0x40) == 0) {
            return;
        }
        int var33 = class100.field1580.method1593((byte) 27);
        byte[] var34 = new byte[var33];
        class248 var35 = new class248(var34);
        class100.field1580.method1600(0, var34, false, var33);
        class114.field1749[arg2] = var35;
        arg0.method675(var35, arg3 - 84);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLoi;)V")
    public final void method982(byte arg0, class82 arg1) {
        field2444++;
        if (arg1.field1314 != null) {
            arg1.method538(126);
        }
        arg1.field1318 = this.field2438.field1318;
        arg1.field1314 = this.field2438;
        int var3 = -37 % ((arg0 + 24) / 58);
        arg1.field1314.field1318 = arg1;
        arg1.field1318.field1314 = arg1;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)Loi;")
    public final class82 method983(int arg0) {
        field2442++;
        class82 var2 = this.field2438.field1318;
        if (arg0 != 7) {
            return null;
        } else if (this.field2438 == var2) {
            this.field2450 = null;
            return null;
        } else {
            this.field2450 = var2.field1318;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Loi;")
    public final class82 method984(byte arg0) {
        field2443++;
        class82 var2 = this.field2450;
        if (this.field2438 == var2) {
            this.field2450 = null;
            return null;
        }
        this.field2450 = var2.field1314;
        if (arg0 > -1) {
            this.field2450 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)Loi;")
    public final class82 method985(byte arg0) {
        class82 var2 = this.field2450;
        field2451++;
        int var3 = 19 % ((arg0 - 35) / 58);
        if (this.field2438 == var2) {
            this.field2450 = null;
            return null;
        } else {
            this.field2450 = var2.field1318;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public final void method986(int arg0) {
        field2439++;
        while (true) {
            class82 var2 = this.field2438.field1318;
            if (this.field2438 == var2) {
                if (arg0 != -29720) {
                    field2447 = null;
                }
                this.field2450 = null;
                return;
            }
            var2.method538(116);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Loi;B)V")
    public final void method987(class82 arg0, byte arg1) {
        field2437++;
        if (arg0.field1314 != null) {
            arg0.method538(83);
        }
        arg0.field1314 = this.field2438.field1314;
        if (arg1 == -121) {
            arg0.field1318 = this.field2438;
            arg0.field1314.field1318 = arg0;
            arg0.field1318.field1314 = arg0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public static void method988(boolean arg0) {
        field2447 = null;
        field2453 = null;
        if (!arg0) {
            field2440 = 38;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)Loi;")
    public final class82 method989(int arg0) {
        field2448++;
        class82 var2 = this.field2438.field1318;
        if (this.field2438 == var2) {
            return null;
        }
        var2.method538(arg0 + 99);
        if (arg0 != 4) {
            field2440 = -20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BZ)V")
    public static final void method990(byte arg0, boolean arg1) {
        field2445++;
        byte[][] var2 = class54.field884;
        byte var3 = 4;
        if (arg0 != 115) {
            method988(true);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class39.method231(false);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class229.field3461[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3629A55) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0xFFF337) >> 14;
                            int var10 = (var7 & 0x7) >> 1;
                            int var11 = (var7 & 0x3FF9) >> 3;
                            int var12 = (var9 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class48.field767.length; var13++) {
                                if (class48.field767[var13] == var12 && var2[var13] != null) {
                                    class205.method1298(var2[var13], var8, arg1, (var11 & 0x7) * 8, var6 * 8, class202.field3052, (var9 & 0x7) * 8, -28194, var10, var4, var5 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
    public class159() {
        this.field2438.field1314 = this.field2438;
        this.field2438.field1318 = this.field2438;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)Loi;")
    public final class82 method991(int arg0) {
        int var2 = 15 / ((43 - arg0) / 36);
        field2446++;
        class82 var3 = this.field2438.field1314;
        if (this.field2438 == var3) {
            this.field2450 = null;
            return null;
        } else {
            this.field2450 = var3.field1314;
            return var3;
        }
    }
}
