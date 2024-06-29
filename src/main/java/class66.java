import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class66 extends class320 {

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "[I")
    public int[] field1067 = new int[] { -1 };

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "[I")
    public int[] field1071 = new int[] { 0 };

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "[[[B")
    public static byte[][][] field1064;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V", line = 4)
    public static final void method633(boolean arg0) {
        field1062++;
        if (class255.field4109 || class246.field3988 == 2) {
            return;
        }
        try {
            class251.method1754("tbrefresh", (byte) -104, class158.field2789);
            if (arg0) {
                field1064 = (byte[][][]) ((byte[][][]) null);
            }
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)I", line = 26)
    public static final int method634(byte arg0, int arg1) {
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field1065++;
        double var4 = (double) ((arg1 & 0xFF7B) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        double var10 = var2;
        if (var8 > var6) {
            var8 = var6;
        }
        double var12 = 0.0D;
        if (arg0 >= -122) {
            return -29;
        }
        double var14 = 0.0D;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var16 = (var8 + var10) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var12 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var12 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var14 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var14 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var14 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var19 = (int) (var12 * 256.0D);
        double var20 = var14 / 6.0D;
        int var22 = (int) (var20 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var18 > 243) {
            var19 >>= 0x4;
        } else if (var18 > 217) {
            var19 >>= 0x3;
        } else if (var18 > 192) {
            var19 >>= 0x2;
        } else if (var18 > 179) {
            var19 >>= 0x1;
        }
        return (var22 >> 2 << 10) + (var19 >> 5 << 7) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLcg;)V", line = 131)
    public static final void method635(byte arg0, class49 arg1) {
        field1063++;
        if (class170.field2947) {
            return;
        }
        if (class43.field680) {
            class169.method1338();
        } else {
            class47.method415();
        }
        class38.field566 = class248.method1742(class107.field1831, arg1, 9581);
        int var2 = class188.field3152;
        int var3 = var2 * 956 / 503;
        class38.field566.method1251((class313.field4973 - var3) / 2, 0, var3, var2);
        class202.field3436 = class266.method1831(arg1, class178.field3026, -21);
        if (arg0 == 71) {
            class202.field3436.method1596(class313.field4973 / 2 - (class202.field3436.field4054 / 2), 18);
            class170.field2947 = true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lcg;B)V", line = 169)
    public static final void method636(class49 arg0, byte arg1) {
        if (arg1 == 47) {
            class211.field3567 = arg0;
            field1066++;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)Lpi;", line = 180)
    public static final class336 method637(int arg0) {
        field1068++;
        class336 var1 = new class336(34);
        var1.method2370(11, (byte) -20);
        var1.method2370(class32.field462, (byte) -20);
        var1.method2370(class287.field4570 ? 1 : 0, (byte) -20);
        var1.method2370(class129.field2225 ? 1 : 0, (byte) -20);
        var1.method2370(class48.field735 ? 1 : 0, (byte) -20);
        var1.method2370(class328.field5216 ? 1 : 0, (byte) -20);
        var1.method2370(class291.field4666 ? 1 : 0, (byte) -20);
        var1.method2370(class249.field4036 ? 1 : 0, (byte) -20);
        var1.method2370(class95.field1487 ? 1 : 0, (byte) -20);
        var1.method2370(class195.field3276 ? 1 : 0, (byte) -20);
        var1.method2370(class137.field2549, (byte) -20);
        var1.method2370(class64.field1001 ? 1 : 0, (byte) -20);
        var1.method2370(class285.field4521 ? 1 : 0, (byte) -20);
        var1.method2370(class181.field3043 ? 1 : 0, (byte) -20);
        var1.method2370(class227.field3822, (byte) -20);
        var1.method2370(class57.field875 ? 1 : 0, (byte) -20);
        var1.method2370(class79.field1280, (byte) -20);
        var1.method2370(class51.field796, (byte) -20);
        var1.method2370(class29.field393, (byte) -20);
        var1.method2359(arg0 - 805634839, class310.field4913);
        var1.method2359(-805606200, class318.field5056);
        if (arg0 != 28639) {
            method635((byte) -43, (class49) null);
        }
        var1.method2370(class65.method622(), (byte) -20);
        var1.method2320(arg0 - 34767, class221.field3696);
        var1.method2370(class69.field1133, (byte) -20);
        var1.method2370(class222.field3705 ? 1 : 0, (byte) -20);
        var1.method2370(class38.field572 ? 1 : 0, (byte) -20);
        var1.method2370(class255.field4104, (byte) -20);
        var1.method2370(class246.field3990 ? 1 : 0, (byte) -20);
        var1.method2370(class330.field5250 ? 1 : 0, (byte) -20);
        return var1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 226)
    public static void method638(byte arg0) {
        field1064 = (byte[][][]) null;
        if (arg0 != -79) {
            method638((byte) -5);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Llg;IIZ)V", line = 236)
    public static final void method639(class137 arg0, int arg1, int arg2, boolean arg3) {
        if (arg0.field2495 == 0) {
            arg0.field2444 = arg0.field2371;
        } else if (arg0.field2495 == 1) {
            arg0.field2444 = (arg2 - arg0.field2515) / 2 + arg0.field2371;
        } else if (arg0.field2495 == 2) {
            arg0.field2444 = arg2 - arg0.field2515 - arg0.field2371;
        } else if (arg0.field2495 == 3) {
            arg0.field2444 = arg0.field2371 * arg2 >> 14;
        } else if (arg0.field2495 == 4) {
            arg0.field2444 = (arg0.field2371 * arg2 >> 14) + (arg2 - arg0.field2515) / 2;
        } else {
            arg0.field2444 = arg2 - arg0.field2515 - (arg0.field2371 * arg2 >> 14);
        }
        if (arg3) {
            field1064 = (byte[][][]) ((byte[][][]) null);
        }
        if (arg0.field2427 == 0) {
            arg0.field2456 = arg0.field2373;
        } else if (arg0.field2427 == 1) {
            arg0.field2456 = (arg1 - arg0.field2533) / 2 + arg0.field2373;
        } else if (arg0.field2427 == 2) {
            arg0.field2456 = arg1 - arg0.field2373 - arg0.field2533;
        } else if (arg0.field2427 == 3) {
            arg0.field2456 = arg0.field2373 * arg1 >> 14;
        } else if (arg0.field2427 == 4) {
            arg0.field2456 = (arg0.field2373 * arg1 >> 14) + (arg1 - arg0.field2533) / 2;
        } else {
            arg0.field2456 = arg1 - (arg0.field2373 * arg1 >> 14) - arg0.field2533;
        }
        if (class348.field5537 && (client.method1894(arg0).field891 != 0 || arg0.field2490 == 0)) {
            if (arg0.field2456 < 0) {
                arg0.field2456 = 0;
            } else if (arg0.field2456 + arg0.field2533 > arg1) {
                arg0.field2456 = arg1 - arg0.field2533;
            }
            if (arg0.field2444 < 0) {
                arg0.field2444 = 0;
            } else if (arg2 < (arg0.field2444 + arg0.field2515)) {
                arg0.field2444 = arg2 - arg0.field2515;
            }
        }
        field1061++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILpi;)V", line = 317)
    public static final void method640(int arg0, class336 arg1) {
        int var2 = class25.field354 >> 1;
        field1070++;
        if (arg0 != 2) {
            return;
        }
        int var3 = class316.field4997 >> 2 << 10;
        byte[][] var4 = new byte[class113.field1893][class304.field4825];
        while (arg1.field5353 < arg1.field5342.length) {
            int var5 = 0;
            boolean var6 = false;
            int var7 = 0;
            if (arg1.method2364(arg0 - 9071) == 1) {
                var5 = arg1.method2364(-9069);
                var6 = true;
                var7 = arg1.method2364(-9069);
            }
            int var8 = arg1.method2364(-9069);
            int var9 = arg1.method2364(-9069);
            int var10 = class304.field4825 + class259.field4201 - (var9 * 64) - 1;
            int var11 = var8 * 64 - class341.field5444;
            if (var11 >= 0 && (var10 - 63) >= 0 && class113.field1893 > var11 + 63 && class304.field4825 > var10) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var11 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var6 || var12 >= (var5 * 8) && (var5 * 8 + 8) > var12 && (var7 * 8) <= var14 && var7 * 8 + 8 > var14) {
                            var13[var10 - var14] = arg1.method2323(-116);
                        }
                    }
                }
            } else if (var6) {
                arg1.field5353 += 64;
            } else {
                arg1.field5353 += 4096;
            }
        }
        int var15 = class113.field1893;
        int var16 = class304.field4825;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class35 var26 = class322.method2219(var25 - 1, arg0 ^ 0x3);
                        var17[var23] += var26.field500;
                        var18[var23] += var26.field510;
                        var19[var23] += var26.field493;
                        var21[var23] += var26.field501;
                        var10002 = var20[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class35 var29 = class322.method2219(var28 - 1, 1);
                        var17[var23] -= var29.field500;
                        var18[var23] -= var29.field510;
                        var19[var23] -= var29.field493;
                        var21[var23] -= var29.field501;
                        var10002 = var20[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class159.field2812[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 - 5;
                    int var38 = var36 + 5;
                    if (var38 < var16) {
                        var31 += var17[var38];
                        var35 += var20[var38];
                        var33 += var19[var38];
                        var34 += var21[var38];
                        var32 += var18[var38];
                    }
                    if (var37 >= 0) {
                        var32 -= var18[var37];
                        var31 -= var17[var37];
                        var33 -= var19[var37];
                        var34 -= var21[var37];
                        var35 -= var20[var37];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class95.method814(var33 / var35, var31 * 256 / var34, 87, var32 / var35);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var2;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var40 & 0x380) + (var3 + var40 & 0xFC00) + var41;
                            var39[class36.method319(63, var22) + (class36.method319(var36, 63) << 6)] = class62.field955[class346.method2423((byte) -124, var42, 96)];
                        } else if (var39 != null) {
                            var39[class36.method319(var22, 63) + class36.method319(var36 << 6, 4032)] = 0;
                        }
                    }
                }
            }
        }
    }
}
