import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class135 {

    @OriginalMember(owner = "client!un", name = "g", descriptor = "[I")
    public static int[] field2266 = new int[50];

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Lab;")
    public static class279 field2262 = new class279(16);

    @OriginalMember(owner = "client!un", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2270 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!un", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2272 = "";

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "([BB)V", line = 7)
    public static final void method880(byte[] arg0, byte arg1) {
        field2263++;
        class202 var2 = new class202(arg0);
        var2.field3249 = arg0.length - 2;
        class125.field2167 = var2.method1315(14289);
        class114.field2014 = new byte[class125.field2167][];
        class80.field1572 = new int[class125.field2167];
        class254.field3968 = new byte[class125.field2167][];
        class27.field530 = new int[class125.field2167];
        class176.field2833 = new int[class125.field2167];
        class61.field1178 = new boolean[class125.field2167];
        class28.field537 = new int[class125.field2167];
        var2.field3249 = arg0.length - class125.field2167 * 8 - 7;
        class194.field3127 = var2.method1315(14289);
        class321.field4891 = var2.method1315(14289);
        int var3 = (var2.method1317((byte) -79) & 0xFF) + 1;
        for (int var4 = 0; var4 < class125.field2167; var4++) {
            class80.field1572[var4] = var2.method1315(14289);
        }
        if (arg1 > -26) {
            method880((byte[]) null, (byte) 24);
        }
        for (int var5 = 0; var5 < class125.field2167; var5++) {
            class27.field530[var5] = var2.method1315(14289);
        }
        for (int var6 = 0; var6 < class125.field2167; var6++) {
            class28.field537[var6] = var2.method1315(14289);
        }
        for (int var7 = 0; var7 < class125.field2167; var7++) {
            class176.field2833[var7] = var2.method1315(14289);
        }
        var2.field3249 = arg0.length - ((var3 - 1) * 3) - (class125.field2167 * 8) - 7;
        class274.field4202 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class274.field4202[var8] = var2.method1352((byte) -6);
            if (class274.field4202[var8] == 0) {
                class274.field4202[var8] = 1;
            }
        }
        var2.field3249 = 0;
        for (int var9 = 0; var9 < class125.field2167; var9++) {
            int var10 = class28.field537[var9];
            int var11 = class176.field2833[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class254.field3968[var9] = var13;
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class114.field2014[var9] = var14;
            int var16 = var2.method1317((byte) -108);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method1333(-126);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var14[var23] = var2.method1333(-128);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label92: while (true) {
                    if (var10 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var10 <= var19) {
                                break label92;
                            }
                            for (int var20 = 0; var20 < var11; var20++) {
                                byte var21 = var14[var10 * var20 + var19] = var2.method1333(-128);
                                var15 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var11; var18++) {
                        var13[var10 * var18 + var17] = var2.method1333(-127);
                    }
                    var17++;
                }
            }
            class61.field1178[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V", line = 175)
    public static final void method881(byte arg0) {
        field2268++;
        if (class239.method1586(true) != 2) {
            return;
        }
        int var1 = class158.field2589 % 104;
        byte var2 = (byte) (class158.field2589 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class6.field137[var3][var1][var4] = var2;
            }
        }
        if (arg0 <= 6) {
            field2271 = -98;
        }
        if (class289.field4438 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class15.field281[var5] = -1000000;
            class81.field1580[var5] = 1000000;
            class119.field2075[var5] = 0;
            class271.field4189[var5] = 1000000;
            class259.field4031[var5] = 0;
        }
        if (field2271 != 1) {
            int var16 = class325.method2250(class283.field4381, 22771, class289.field4438, class38.field742);
            if ((var16 - class132.field2232) < 800 && (class99.field1749[class289.field4438][class38.field742 >> 7][class283.field4381 >> 7] & 0x4) != 0) {
                class226.method1506((byte) -32, false, 1, class283.field4381 >> 7, class326.field4975, class38.field742 >> 7);
            }
            return;
        }
        if ((class99.field1749[class289.field4438][class66.field1265.field1869 >> 7][class66.field1265.field1872 >> 7] & 0x4) != 0) {
            class226.method1506((byte) -32, false, 0, class66.field1265.field1872 >> 7, class326.field4975, class66.field1265.field1869 >> 7);
        }
        if (class43.field820 >= 310) {
            return;
        }
        int var6 = class38.field742 >> 7;
        int var7 = class66.field1265.field1869 >> 7;
        int var8 = class283.field4381 >> 7;
        int var9;
        if (var6 >= var7) {
            var9 = var6 - var7;
        } else {
            var9 = var7 - var6;
        }
        int var10 = class66.field1265.field1872 >> 7;
        int var11;
        if (var8 < var10) {
            var11 = var10 - var8;
        } else {
            var11 = var8 - var10;
        }
        if (var9 == 0 && var11 == 0 || var9 <= -104 || var9 >= 104 || var11 <= -104 || var11 >= 104) {
            class106.method694((Throwable) null, "RC: " + var6 + "," + var8 + " " + var7 + "," + var10 + " " + class246.field3818 + "," + class101.field1769, (byte) -108);
            return;
        }
        if (var9 <= var11) {
            int var14 = 32768;
            int var15 = var9 * 65536 / var11;
            while (var8 != var10) {
                if (var8 < var10) {
                    var8++;
                } else if (var8 > var10) {
                    var8--;
                }
                if ((class99.field1749[class289.field4438][var6][var8] & 0x4) != 0) {
                    class226.method1506((byte) -32, false, 1, var8, class326.field4975, var6);
                    break;
                }
                var14 += var15;
                if (var14 >= 65536) {
                    if (var6 < var7) {
                        var6++;
                    } else if (var7 < var6) {
                        var6--;
                    }
                    var14 -= 65536;
                    if ((class99.field1749[class289.field4438][var6][var8] & 0x4) != 0) {
                        class226.method1506((byte) -32, false, 1, var8, class326.field4975, var6);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var11 * 65536 / var9;
        int var13 = 32768;
        while (var6 != var7) {
            if (var7 > var6) {
                var6++;
            } else if (var6 > var7) {
                var6--;
            }
            if ((class99.field1749[class289.field4438][var6][var8] & 0x4) != 0) {
                class226.method1506((byte) -32, false, 1, var8, class326.field4975, var6);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                if (var8 < var10) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                var13 -= 65536;
                if ((class99.field1749[class289.field4438][var6][var8] & 0x4) != 0) {
                    class226.method1506((byte) -32, false, 1, var8, class326.field4975, var6);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)Z", line = 373)
    public static final boolean method882(int arg0) {
        field2265++;
        class148 var1 = class277.field4249;
        synchronized (class277.field4249) {
            if (class283.field4378 == class119.field2074) {
                return false;
            } else {
                class301.field4562 = class285.field4412[class119.field2074];
                class87.field1654 = class90.field1668[class119.field2074];
                class119.field2074 = class119.field2074 + arg0 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 390)
    public static void method883(int arg0) {
        if (arg0 <= -53) {
            field2266 = null;
            field2262 = null;
            field2270 = null;
            field2272 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZB)V", line = 404)
    public static final void method884(boolean arg0, byte arg1) {
        class65.method502(class204.field3324, class201.field3206, class44.field868, class46.field951);
        field2264++;
        int var2 = 122 % ((arg1) / 42);
        class65.method501(class146.field2398, class250.field3921, arg0);
        class65.method494((float) class35.field704, (float) class2.field46, (float) class175.field2815);
        class65.method495();
        class10.field209 = class2.field48;
        class10.field210 = class248.field3870;
        class125.field2169 = class345.field5355;
        class10.field206 = class71.field1495;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILbm;II)Z", line = 427)
    public static final boolean method885(int arg0, class307 arg1, int arg2, int arg3) {
        if (arg2 != -10948) {
            return false;
        }
        field2261++;
        byte[] var4 = arg1.method2036(arg0, arg3, (byte) 102);
        if (var4 == null) {
            return false;
        } else {
            method880(var4, (byte) -29);
            return true;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V", line = 454)
    public static final void method886(byte arg0) {
        field2260++;
        int var1 = class276.field4223 * 128 + 64;
        int var2 = class90.field1660 * 128 + 64;
        int var3 = class325.method2250(var1, 22771, class289.field4438, var2) - class85.field1609;
        int var4 = 32 / ((arg0 + 8) / 44);
        if (class178.field2870 >= 100) {
            class283.field4381 = class276.field4223 * 128 + 64;
            class38.field742 = class90.field1660 * 128 + 64;
            class132.field2232 = class325.method2250(class283.field4381, 22771, class289.field4438, class38.field742) - class85.field1609;
        } else {
            if (var2 > class38.field742) {
                class38.field742 += class288.field4435 + ((var2 - class38.field742) * class178.field2870 / 1000);
                if (var2 < class38.field742) {
                    class38.field742 = var2;
                }
            }
            if (var2 < class38.field742) {
                class38.field742 -= (class38.field742 - var2) * class178.field2870 / 1000 + class288.field4435;
                if (class38.field742 < var2) {
                    class38.field742 = var2;
                }
            }
            if (var1 > class283.field4381) {
                class283.field4381 += class288.field4435 + ((var1 - class283.field4381) * class178.field2870 / 1000);
                if (var1 < class283.field4381) {
                    class283.field4381 = var1;
                }
            }
            if (class283.field4381 > var1) {
                class283.field4381 -= (class283.field4381 - var1) * class178.field2870 / 1000 + class288.field4435;
                if (class283.field4381 < var1) {
                    class283.field4381 = var1;
                }
            }
            if (class132.field2232 < var3) {
                class132.field2232 += (var3 - class132.field2232) * class178.field2870 / 1000 + class288.field4435;
                if (class132.field2232 > var3) {
                    class132.field2232 = var3;
                }
            }
            if (var3 < class132.field2232) {
                class132.field2232 -= class288.field4435 + ((class132.field2232 - var3) * class178.field2870 / 1000);
                if (var3 > class132.field2232) {
                    class132.field2232 = var3;
                }
            }
        }
        int var5 = class55.field1101 * 128 + 64;
        int var6 = class66.field1258 * 128 + 64;
        int var7 = class325.method2250(var5, 22771, class289.field4438, var6) - class39.field749;
        int var8 = var7 - class132.field2232;
        int var9 = var5 - class283.field4381;
        int var10 = var6 - class38.field742;
        int var11 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var8, (double) var11) * 325.949D) & 0x7FF;
        int var13 = (int) (Math.atan2((double) var10, (double) var9) * -325.949D) & 0x7FF;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        int var14 = var13 - class131.field2213;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var12 > class43.field820) {
            class43.field820 += (var12 - class43.field820) * class196.field3155 / 1000 + class247.field3821;
            if (var12 < class43.field820) {
                class43.field820 = var12;
            }
        }
        if (class43.field820 > var12) {
            class43.field820 -= (class43.field820 - var12) * class196.field3155 / 1000 + class247.field3821;
            if (var12 > class43.field820) {
                class43.field820 = var12;
            }
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            class131.field2213 += class196.field3155 * var14 / 1000 + class247.field3821;
            class131.field2213 &= 0x7FF;
        }
        if (var14 < 0) {
            class131.field2213 -= -var14 * class196.field3155 / 1000 + class247.field3821;
            class131.field2213 &= 0x7FF;
        }
        int var15 = var13 - class131.field2213;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class131.field2213 = var13;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BZLjava/lang/String;)V", line = 608)
    public static final void method887(byte arg0, boolean arg1, String arg2) {
        field2267++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class328.field5038; var6++) {
            class337 var7 = class95.method636(22111, var6);
            if ((!arg1 || var7.field5170) && var7.field5226 == -1 && var7.field5233 == -1 && var7.field5222 == 0 && var7.field5227.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class201.field3214 = -1;
                    class220.field3487 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var8 = new short[var4.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var4[var9];
                    }
                    var4 = var8;
                }
                var4[var5++] = (short) var6;
            }
        }
        class189.field3076 = 0;
        class220.field3487 = var4;
        class201.field3214 = var5;
        String[] var10 = new String[class201.field3214];
        for (int var11 = 0; var11 < class201.field3214; var11++) {
            var10[var11] = class95.method636(22111, var4[var11]).field5227;
        }
        if (arg0 < 1) {
            method887((byte) 79, true, (String) null);
        }
        class138.method906(class220.field3487, false, var10);
    }
}
