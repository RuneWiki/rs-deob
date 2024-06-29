import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class148 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lp;")
    public static class280 field2568 = class18.method140((byte) -117, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Z")
    public static boolean field2567 = false;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "J")
    public static volatile long field2570 = 0L;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field2574 = 0;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Ltg;")
    public static class180 field2569;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[I")
    public static int[] field2571;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILlj;)V")
    public static final void method1026(int arg0, class25 arg1) {
        field2573++;
        int var2 = class244.field4286 >> 2 << 10;
        byte[][] var3 = new byte[class47.field779][class74.field1222];
        int var4 = class249.field4362 >> 1;
        while (arg1.field481 < arg1.field475.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg1.method189((byte) -103) == 1) {
                var33 = true;
                var35 = arg1.method189((byte) -103);
                var34 = arg1.method189((byte) -103);
            }
            int var36 = arg1.method189((byte) -103);
            int var37 = arg1.method189((byte) -103);
            int var38 = class74.field1222 - (var37 * 64 - class243.field4268) - 1;
            int var39 = var36 * 64 - class113.field2023;
            if (var39 >= 0 && var38 - 63 >= 0 && class47.field779 > (var39 + 63) && var38 < class74.field1222) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var3[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var40 >= (var35 * 8) && var35 * 8 + 8 > var40 && var42 >= var34 * 8 && var42 < (var34 * 8 + 8)) {
                            var41[var38 - var42] = arg1.method200(32768);
                        }
                    }
                }
            } else if (var33) {
                arg1.field481 += 64;
            } else {
                arg1.field481 += 4096;
            }
        }
        int var5 = class47.field779;
        int var6 = class74.field1222;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        if (arg0 != -9514) {
            method1028((byte) -104);
        }
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var5 > var27) {
                    int var28 = var3[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class275 var29 = class228.method1540((byte) 106, var28 - 1);
                        var7[var13] += var29.field4777;
                        var9[var13] += var29.field4778;
                        var8[var13] += var29.field4767;
                        var11[var13] += var29.field4775;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var3[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class275 var32 = class228.method1540((byte) 96, var31 - 1);
                        var7[var13] -= var32.field4777;
                        var9[var13] -= var32.field4778;
                        var8[var13] -= var32.field4767;
                        var11[var13] -= var32.field4775;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int[][] var16 = class243.field4265[var12 >> 6];
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var21 < var6) {
                        var17 += var8[var21];
                        var15 += var9[var21];
                        var19 += var10[var21];
                        var18 += var11[var21];
                        var14 += var7[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var18 -= var11[var22];
                        var19 -= var10[var22];
                        var14 -= var7[var22];
                        var17 -= var8[var22];
                        var15 -= var9[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var16[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class118.method844(var15 / var19, var17 / var19, var14 * 256 / var18, (byte) 119);
                        if (var3[var12][var20] != 0) {
                            int var25 = (var24 & 0x7F) + var4;
                            if (var23 == null) {
                                var23 = var16[var20 >> 6] = new int[4096];
                            }
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var24 + var2 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[(class214.method1432(63, var20) << 6) + class214.method1432(63, var12)] = class146.field2554[class115.method836(96, true, var26)];
                        } else if (var23 != null) {
                            var23[class214.method1432(var12, 63) + (class214.method1432(63, var20) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static final void method1027(byte arg0) {
        if (arg0 <= 97) {
            field2574 = -6;
        }
        field2566++;
        if (class178.field3094 == -1 || class187.field3281 == -1) {
            return;
        }
        int var1 = ((class115.field2086 - class40.field687) * class279.field4881 >> 16) + class40.field687;
        class279.field4881 += var1;
        if (class279.field4881 < 65535) {
            class75.field1240 = false;
            class97.field1556 = false;
        } else {
            class279.field4881 = 65535;
            if (class97.field1556) {
                class75.field1240 = false;
            } else {
                class75.field1240 = true;
            }
            class97.field1556 = true;
        }
        float var2 = (float) class279.field4881 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class78.field1263 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class269.field4719[class178.field3094][var4][var5] * 3;
            int var22 = class269.field4719[class178.field3094][var4 + 1][var5] * 3;
            int var23 = (class269.field4719[class178.field3094][var4 + 2][var5] + class269.field4719[class178.field3094][var4 - -2][var5] - class269.field4719[class178.field3094][var4 + 3][var5]) * 3;
            int var24 = class269.field4719[class178.field3094][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class269.field4719[class178.field3094][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class78.field1273 = (int) var3[2] - (class91.field1480 * 128);
        class22.field406 = (int) var3[1] * -1;
        int var6 = class117.field2105 * 2;
        float[] var7 = new float[3];
        client.field2695 = (int) var3[0] - class49.field806 * 128;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class269.field4719[class187.field3281][var6][var8] * 3;
            int var15 = class269.field4719[class187.field3281][var6 + 1][var8] * 3;
            int var16 = (class269.field4719[class187.field3281][var6 + 2][var8] + class269.field4719[class187.field3281][var6 + 2][var8] - class269.field4719[class187.field3281][var6 + 3][var8]) * 3;
            int var17 = var15 - var14;
            int var18 = var14 + var16 - (var15 * 2);
            int var19 = class269.field4719[class187.field3281][var6][var8];
            int var20 = class269.field4719[class187.field3281][var6 + 2][var8] + var15 - var19 - var16;
            var7[var8] = (((float) var20 * var2 + (float) var18) * var2 + (float) var17) * var2 + (float) var19;
        }
        float var9 = var7[0] - var3[0];
        float var10 = (var7[1] - var3[1]) * -1.0F;
        float var11 = var7[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class131.field2331 = (float) Math.atan2((double) var10, var12);
        class160.field2808 = -((float) Math.atan2((double) var9, (double) var11));
        class220.field3827 = (int) ((double) class160.field2808 * 325.949D) & 0x7FF;
        class8.field170 = (int) ((double) class131.field2331 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
    public static final void method1028(byte arg0) {
        field2572++;
        while (class20.field367.method557(false, class23.field422) >= 27) {
            int var1 = class20.field367.method547(15, (byte) 106);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class46.field756[var1] == null) {
                var2 = true;
                class46.field756[var1] = new class61();
            }
            class61 var3 = class46.field756[var1];
            class46.field767[class112.field1845++] = var1;
            var3.field4848 = class117.field2104;
            if (var3.field987 != null && var3.field987.method1712((byte) 95)) {
                class268.method1799(-23980, var3);
            }
            var3.method432(class265.method1785(class20.field367.method547(14, (byte) 39), true), 1);
            int var4 = class20.field367.method547(1, (byte) 53);
            int var5 = class20.field367.method547(5, (byte) 85);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class20.field367.method547(1, (byte) 70);
            if (var6 == 1) {
                class192.field3359[class204.field3543++] = var1;
            }
            int var7 = class122.field2143[class20.field367.method547(3, (byte) 74)];
            if (var2) {
                var3.field4863 = var3.field4809 = var7;
            }
            int var8 = class20.field367.method547(5, (byte) 95);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1843(-122, var3.field987.field4489);
            var3.field4850 = var3.field987.field4510;
            var3.field4834 = var3.field987.field4472;
            var3.field4858 = var3.field987.field4468;
            var3.field4843 = var3.field987.field4499;
            var3.field4822 = var3.field987.field4462;
            var3.field4855 = var3.field987.field4479;
            var3.field4854 = var3.field987.field4520;
            var3.field4860 = var3.field987.field4475;
            if (var3.field4843 == 0) {
                var3.field4809 = 0;
            }
            var3.method1834(class262.field4631.field4792[0] + var8, 0, var3.method984((byte) -34), var4 == 1, class262.field4631.field4837[0] + var5);
            if (var3.field987.method1712((byte) 115)) {
                class127.method877(var3.field4792[0], var3.field4837[0], 128, class231.field4013, (class142) null, 0, var3, (class130) null);
            }
        }
        if (arg0 == 50) {
            class20.field367.method552(22535);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1029(int arg0) {
        if (arg0 != 88) {
            method1028((byte) 13);
        }
        field2571 = null;
        field2568 = null;
        field2569 = null;
    }
}
