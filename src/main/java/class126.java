import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class126 {

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Lbd;")
    public static class162 field2288 = class17.method142(0, "details");

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Lb;")
    public static class94 field2287 = new class94(new byte[5000]);

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "[I")
    public static int[] field2292 = new int[500];

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "Lbd;")
    private static class162 field2296 = class17.method142(0, "Please wait)3)3)3");

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "Lbd;")
    public static class162 field2297 = field2296;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Lqb;")
    public static class209 field2294 = new class209(100);

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "Lbd;")
    public static class162 field2298 = class17.method142(0, "");

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "Z")
    public static boolean field2299 = false;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILrg;)V", line = 17)
    public static final void method1015(int arg0, class301 arg1) {
        field2285++;
        if (class90.field1598 == arg1.field5063 || arg1.field5057 == -1 || arg1.field5040 != 0 || arg1.field5061 + 1 > class139.method1084(arg0 + 11385, arg1.field5057).field2527[arg1.field5023]) {
            int var2 = class90.field1598 - arg1.field5049;
            int var3 = arg1.field5063 - arg1.field5049;
            int var4 = arg1.field5054 * 128 + (arg1.method293((byte) 25) * 64);
            int var5 = arg1.field5032 * 128 + arg1.method293((byte) 25) * 64;
            int var6 = arg1.field5035 * 128 + arg1.method293((byte) 25) * 64;
            int var7 = arg1.field5038 * 128 + arg1.method293((byte) 25) * 64;
            arg1.field5013 = ((var3 - var2) * var4 + var2 * var6) / var3;
            arg1.field5047 = ((var3 - var2) * var5 + (var2 * var7)) / var3;
        }
        if (arg1.field5009 == 0) {
            arg1.field5025 = 1024;
        }
        arg1.field5060 = 0;
        if (arg1.field5009 == 1) {
            arg1.field5025 = 1536;
        }
        if (arg1.field5009 == 2) {
            arg1.field5025 = 0;
        }
        if (arg1.field5009 == 3) {
            arg1.field5025 = 512;
        }
        if (arg0 == -11460) {
            arg1.field5018 = arg1.field5025;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V", line = 71)
    public static final void method1016(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 1024) {
            return;
        }
        if (class110.field1977 == 1) {
            class62.field959[class34.field551 / 100].method285(class286.field4822 - 8, class225.field3751 + -8);
        }
        field2289++;
        if (class110.field1977 == 2) {
            class62.field959[class34.field551 / 100 + 4].method285(class286.field4822 - 8, class225.field3751 + -8);
        }
        class142.method1107(arg1 ^ 0xFFFFDEC0);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ldg;I)V", line = 122)
    public static final void method1017(class183 arg0, int arg1) {
        long var2 = 0L;
        if (arg0.field3153 == 0) {
            var2 = class82.method626(arg0.field3159, arg0.field3148, arg0.field3151);
        }
        field2282++;
        if (arg0.field3153 == 1) {
            var2 = class137.method1071(arg0.field3159, arg0.field3148, arg0.field3151);
        }
        if (arg1 != -11204) {
            method1016(39, -13, 7, 97, 51);
        }
        if (arg0.field3153 == 2) {
            var2 = class104.method846(arg0.field3159, arg0.field3148, arg0.field3151);
        }
        int var4 = -1;
        if (arg0.field3153 == 3) {
            var2 = class256.method1768(arg0.field3159, arg0.field3148, arg0.field3151);
        }
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0L) {
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = ((int) var2 & 0x36E5C7) >> 20;
            var5 = (int) var2 >> 14 & 0x1F;
        }
        arg0.field3147 = var5;
        arg0.field3157 = var6;
        arg0.field3149 = var4;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V", line = 165)
    public static void method1018(byte arg0) {
        field2298 = null;
        field2292 = null;
        field2288 = null;
        field2297 = null;
        field2294 = null;
        field2287 = null;
        if (arg0 < 121) {
            field2295 = 22;
        }
        field2296 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILda;)V", line = 186)
    public static final void method1019(int arg0, class143 arg1) {
        field2284++;
        class266.field4438 = class82.method628(class104.field1870, arg1, 20511);
        class250.field4150 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class279.field4698[var2] & 0xFF0000) >> 16);
            int var4 = class279.field4698[var2 + 1] >> 16 & 0xFF;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) (class279.field4698[var2] >> 8 & 0xFF);
            int var7 = (class279.field4698[var2 + 1] & 0xFF00) >> 8;
            float var8 = (float) (class279.field4698[var2] & 0xFF);
            int var9 = class279.field4698[var2 + 1] & 0xFF;
            float var10 = ((float) var7 - var6) / 64.0F;
            float var11 = ((float) var9 - var8) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class250.field4150[var2 * 64 + var12] = class289.method2005(class289.method2005((int) var3 << 16, (int) var6 << 8), (int) var8);
                var6 += var10;
                var8 += var11;
                var3 += var5;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class250.field4150[var13] = class279.field4698[3];
        }
        if (arg0 != 11446) {
            field2296 = (class162) null;
        }
        class10.field120 = new int[32768];
        class208.field3513 = new int[32768];
        class110.method886(true, (class99) null);
        class264.field4407 = new int[32768];
        class31.field515 = new int[32768];
        if (class117.field2159) {
            class144.field2636 = new class38(128, 254);
        } else {
            class144.field2636 = new class79(128, 254);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZZ)V", line = 311)
    public static final void method1020(boolean arg0, boolean arg1) {
        class213.field3570 = arg0;
        if (class213.field3570) {
            int var2 = class63.field975.method707(2);
            int var3 = class63.field975.method715(250);
            int var4 = class63.field975.method734(2);
            int var5 = class63.field975.method715(250);
            int var6 = class63.field975.method734(2);
            class63.field975.method352(34);
            for (int var7 = 0; var7 < 4; var7++) {
                for (int var8 = 0; var8 < 13; var8++) {
                    for (int var9 = 0; var9 < 13; var9++) {
                        int var10 = class63.field975.method344(2, 1);
                        if (var10 == 1) {
                            class47.field756[var7][var8][var9] = class63.field975.method344(2, 26);
                        } else {
                            class47.field756[var7][var8][var9] = -1;
                        }
                    }
                }
            }
            class63.field975.method339(!arg1);
            int var11 = (class244.field4045 - class63.field975.field1653) / 16;
            class92.field1631 = new int[var11][4];
            for (int var12 = 0; var12 < var11; var12++) {
                for (int var13 = 0; var13 < 4; var13++) {
                    class92.field1631[var12][var13] = class63.field975.method747(!arg1);
                }
            }
            class209.field3542 = new byte[var11][];
            class280.field4730 = new byte[var11][];
            class123.field2230 = new int[var11];
            class157.field2763 = new int[var11];
            class204.field3455 = (byte[][]) null;
            class250.field4176 = new int[var11];
            class251.field4190 = new int[var11];
            class147.field2654 = new byte[var11][];
            class131.field2361 = new byte[var11][];
            class188.field3236 = new int[var11];
            int var14 = 0;
            class243.field4038 = null;
            for (int var15 = 0; var15 < 4; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    for (int var17 = 0; var17 < 13; var17++) {
                        int var18 = class47.field756[var15][var16][var17];
                        if (var18 != -1) {
                            int var19 = (var18 & 0xFFD6DB) >> 14;
                            int var20 = (var18 & 0x3FF8) >> 3;
                            int var21 = (var19 / 8 << 8) + var20 / 8;
                            for (int var22 = 0; var22 < var14; var22++) {
                                if (class123.field2230[var22] == var21) {
                                    var21 = -1;
                                    break;
                                }
                            }
                            if (var21 != -1) {
                                class123.field2230[var14] = var21;
                                int var23 = (var21 & 0xFF8B) >> 8;
                                int var24 = var21 & 0xFF;
                                class250.field4176[var14] = class91.field1614.method1136(class135.method1062(new class162[] { class297.field4974, class156.method1212(10, var23), class256.field4237, class156.method1212(10, var24) }, arg1), 63);
                                class251.field4190[var14] = class91.field1614.method1136(class135.method1062(new class162[] { class280.field4749, class156.method1212(10, var23), class256.field4237, class156.method1212(10, var24) }, true), 63);
                                class188.field3236[var14] = class91.field1614.method1136(class135.method1062(new class162[] { class80.field1399, class156.method1212(10, var23), class256.field4237, class156.method1212(10, var24) }, true), 63);
                                class157.field2763[var14] = class91.field1614.method1136(class135.method1062(new class162[] { class305.field5139, class156.method1212(10, var23), class256.field4237, class156.method1212(10, var24) }, arg1), 63);
                                var14++;
                            }
                        }
                    }
                }
            }
            class91.method692(var4, var2, var5, var3, false, true, var6);
        } else {
            int var25 = class63.field975.method715(250);
            int var26 = (class244.field4045 - class63.field975.field1653) / 16;
            class92.field1631 = new int[var26][4];
            for (int var27 = 0; var27 < var26; var27++) {
                for (int var28 = 0; var28 < 4; var28++) {
                    class92.field1631[var27][var28] = class63.field975.method729((byte) 110);
                }
            }
            int var29 = class63.field975.method734(2);
            int var30 = class63.field975.method711(255);
            int var31 = class63.field975.method735((byte) 92);
            boolean var32 = false;
            if (((var25 / 8) == 48 || var25 / 8 == 49) && (var30 / 8) == 48) {
                var32 = true;
            }
            int var33 = class63.field975.method761((byte) 108);
            class251.field4190 = new int[var26];
            if (var25 / 8 == 48 && (var30 / 8) == 148) {
                var32 = true;
            }
            class123.field2230 = new int[var26];
            class204.field3455 = (byte[][]) null;
            class147.field2654 = new byte[var26][];
            class188.field3236 = new int[var26];
            class209.field3542 = new byte[var26][];
            class280.field4730 = new byte[var26][];
            class243.field4038 = null;
            class250.field4176 = new int[var26];
            class131.field2361 = new byte[var26][];
            class157.field2763 = new int[var26];
            int var34 = 0;
            for (int var35 = (var25 - 6) / 8; var35 <= (var25 + 6) / 8; var35++) {
                for (int var36 = (var30 - 6) / 8; var36 <= ((var30 + 6) / 8); var36++) {
                    int var37 = (var35 << 8) + var36;
                    if (var32 && var36 == 49 || var36 == 149 || var36 == 147 || var35 == 50 || !(var35 != 49 || var36 != 47)) {
                        class123.field2230[var34] = var37;
                        class250.field4176[var34] = -1;
                        class251.field4190[var34] = -1;
                        class188.field3236[var34] = -1;
                        class157.field2763[var34] = -1;
                    } else {
                        class123.field2230[var34] = var37;
                        class250.field4176[var34] = class91.field1614.method1136(class135.method1062(new class162[] { class297.field4974, class156.method1212(10, var35), class256.field4237, class156.method1212(10, var36) }, true), 63);
                        class251.field4190[var34] = class91.field1614.method1136(class135.method1062(new class162[] { class280.field4749, class156.method1212(10, var35), class256.field4237, class156.method1212(10, var36) }, true), 63);
                        class188.field3236[var34] = class91.field1614.method1136(class135.method1062(new class162[] { class80.field1399, class156.method1212(10, var35), class256.field4237, class156.method1212(10, var36) }, true), 63);
                        class157.field2763[var34] = class91.field1614.method1136(class135.method1062(new class162[] { class305.field5139, class156.method1212(10, var35), class256.field4237, class156.method1212(10, var36) }, arg1), 63);
                    }
                    var34++;
                }
            }
            class91.method692(var25, var31, var33, var30, false, true, var29);
        }
        field2291++;
        if (!arg1) {
            method1019(-50, (class143) null);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lob;IIZ)V", line = 556)
    public static final void method1021(class78 arg0, int arg1, int arg2, boolean arg3) {
        field2283++;
        if (class17.field284 != null || class32.field539 || arg0 == null || class128.method1030(-1, arg0) == null) {
            return;
        }
        class17.field284 = arg0;
        class205.field3464 = class128.method1030(-1, arg0);
        class250.field4171 = arg1;
        class30.field506 = arg2;
        class231.field3861 = 0;
        if (arg3) {
            class25.field405 = false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V", line = 579)
    public static final void method1022(byte arg0) {
        class292.field4911.method1533(true);
        class183.field3160.method1533(true);
        if (arg0 <= -127) {
            field2286++;
            field2294.method1533(true);
        }
    }
}
