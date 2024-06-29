import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class160 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "J")
    public static long field2267 = 0L;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2270 = "wave:";

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[Lbn;")
    public static class257[] field2268 = new class257[5];

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
    public static int[] field2272;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
    public static final void method1048() {
        class134.field1874 = 0;
        label191: for (int var0 = 0; var0 < class135.field1899; var0++) {
            class306 var1 = class45.field547[var0];
            if (class147.field2064 != null) {
                for (int var2 = 0; var2 < class147.field2064.length; var2++) {
                    if (class147.field2064[var2] != -1000000 && (var1.field4369 <= class147.field2064[var2] || var1.field4380 <= class147.field2064[var2]) && (var1.field4374 <= class407.field5922[var2] || var1.field4383 <= class407.field5922[var2]) && (var1.field4374 >= class147.field2058[var2] || var1.field4383 >= class147.field2058[var2]) && (var1.field4368 <= class70.field786[var2] || var1.field4371 <= class70.field786[var2]) && (var1.field4368 >= class257.field3500[var2] || var1.field4371 >= class257.field3500[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field4367 == 1) {
                int var3 = var1.field4375 + class118.field1410 - class239.field3251;
                if (var3 >= 0 && var3 <= class118.field1410 + class118.field1410) {
                    int var4 = var1.field4366 + class118.field1410 - class326.field4585;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4370 + class118.field1410 - class326.field4585;
                    if (var5 > class118.field1410 + class118.field1410) {
                        var5 = class118.field1410 + class118.field1410;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class289.field4111[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class170.field2390 - var1.field4374;
                        if (var7 > 32) {
                            var1.field4376 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4376 = 2;
                            var7 = -var7;
                        }
                        var1.field4377 = (var1.field4368 - class24.field238 << 8) / var7;
                        var1.field4372 = (var1.field4371 - class24.field238 << 8) / var7;
                        var1.field4365 = (var1.field4369 - class268.field3773 << 8) / var7;
                        var1.field4382 = (var1.field4380 - class268.field3773 << 8) / var7;
                        class140.field1985[class134.field1874++] = var1;
                    }
                }
            } else if (var1.field4367 == 2) {
                int var8 = var1.field4366 + class118.field1410 - class326.field4585;
                if (var8 >= 0 && var8 <= class118.field1410 + class118.field1410) {
                    int var9 = var1.field4375 + class118.field1410 - class239.field3251;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4373 + class118.field1410 - class239.field3251;
                    if (var10 > class118.field1410 + class118.field1410) {
                        var10 = class118.field1410 + class118.field1410;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class289.field4111[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class24.field238 - var1.field4368;
                        if (var12 > 32) {
                            var1.field4376 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4376 = 4;
                            var12 = -var12;
                        }
                        var1.field4379 = (var1.field4374 - class170.field2390 << 8) / var12;
                        var1.field4388 = (var1.field4383 - class170.field2390 << 8) / var12;
                        var1.field4365 = (var1.field4369 - class268.field3773 << 8) / var12;
                        var1.field4382 = (var1.field4380 - class268.field3773 << 8) / var12;
                        class140.field1985[class134.field1874++] = var1;
                    }
                }
            } else if (var1.field4367 == 4) {
                int var13 = var1.field4369 - class268.field3773;
                if (var13 > 128) {
                    int var14 = var1.field4366 + class118.field1410 - class326.field4585;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4370 + class118.field1410 - class326.field4585;
                    if (var15 > class118.field1410 + class118.field1410) {
                        var15 = class118.field1410 + class118.field1410;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4375 + class118.field1410 - class239.field3251;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4373 + class118.field1410 - class239.field3251;
                        if (var17 > class118.field1410 + class118.field1410) {
                            var17 = class118.field1410 + class118.field1410;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class289.field4111[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4376 = 5;
                            var1.field4379 = (var1.field4374 - class170.field2390 << 8) / var13;
                            var1.field4388 = (var1.field4383 - class170.field2390 << 8) / var13;
                            var1.field4377 = (var1.field4368 - class24.field238 << 8) / var13;
                            var1.field4372 = (var1.field4371 - class24.field238 << 8) / var13;
                            class140.field1985[class134.field1874++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static void method1049(boolean arg0) {
        if (!arg0) {
            method1048();
        }
        field2268 = null;
        field2270 = null;
        field2272 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static final void method1050(byte arg0) {
        field2269++;
        if (class75.field832 == -1 || class290.field4141 == -1) {
            return;
        }
        int var1 = ((class34.field317 - class386.field5644) * class444.field6493 >> 16) + class386.field5644;
        class444.field6493 += var1;
        if (class444.field6493 < 65535) {
            class39.field417 = false;
            class366.field5343 = false;
        } else {
            if (class39.field417) {
                class366.field5343 = false;
            } else {
                class366.field5343 = true;
            }
            class444.field6493 = 65535;
            class39.field417 = true;
        }
        float var2 = (float) class444.field6493 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class417.field5992 * 2;
        int var5 = 0;
        if (arg0 <= 112) {
            method1048();
        }
        while (var5 < 3) {
            int var21 = class417.field5988[class75.field832][var4][var5] * 3;
            int var22 = class417.field5988[class75.field832][var4 + 1][var5] * 3;
            int var23 = (class417.field5988[class75.field832][var4 + 2][var5] + class417.field5988[class75.field832][var4 + 2][var5] - class417.field5988[class75.field832][var4 + 3][var5]) * 3;
            int var24 = class417.field5988[class75.field832][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = var22 + class417.field5988[class75.field832][var4 - -2][var5] - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
            var5++;
        }
        class272.field3853 = (int) var3[0] - class40.field427 * 128;
        class164.field2289 = (int) var3[1] * -1;
        class272.field3852 = (int) var3[2] - (class217.field2975 * 128);
        float[] var6 = new float[3];
        int var7 = class41.field459 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class417.field5988[class290.field4141][var7][var8] * 3;
            int var15 = class417.field5988[class290.field4141][var7 + 1][var8] * 3;
            int var16 = (class417.field5988[class290.field4141][var7 + 2][var8] + class417.field5988[class290.field4141][var7 - -2][var8] - class417.field5988[class290.field4141][var7 + 3][var8]) * 3;
            int var17 = class417.field5988[class290.field4141][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class417.field5988[class290.field4141][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class314.field4472 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class77.field869 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class137.field1952 = ((class417.field5988[class75.field832][var4 + 2][3] - class417.field5988[class75.field832][var4][3]) * class444.field6493 >> 16) + class417.field5988[class75.field832][var4][3];
    }

    static {
        for (int var0 = 0; var0 < field2268.length; var0++) {
            field2268[var0] = new class257();
        }
    }
}
