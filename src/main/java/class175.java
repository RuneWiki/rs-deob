import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class175 extends class55 {

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "[B")
    public byte[] field2493;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field2490 = new String[5];

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "[I")
    public static int[] field2491 = new int[4096];

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)V")
    public static final void method1131(byte arg0) {
        field2484++;
        if (class287.field4477 == null || class9.field135 == null) {
            class9.field135 = new int[256];
            class287.field4477 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class287.field4477[var1] = (int) (Math.sin(var2) * 4096.0D);
                class9.field135[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != -126) {
            method1132(-95, -93L);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IJ)V")
    public static final void method1132(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0 == 127) {
            field2487++;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lqi;I)V")
    public static final void method1133(class216 arg0, int arg1) {
        int var2 = 0;
        int var3 = -77 / ((62 - arg1) / 42);
        while (class5.field71 > var2) {
            int var4 = arg0.method1378((byte) -112);
            int var5 = arg0.method1380(true);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class280.field4257[var4] != null) {
                class280.field4257[var4].field266 = var5;
            }
            var2++;
        }
        field2485++;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([Ljava/lang/Object;[IIIB)V")
    public static final void method1134(Object[] arg0, int[] arg1, int arg2, int arg3, byte arg4) {
        field2489++;
        if (arg4 != -5) {
            method1135(6);
        }
        if (arg2 <= arg3) {
            return;
        }
        int var5 = arg3;
        int var6 = (arg2 + arg3) / 2;
        int var7 = arg1[var6];
        arg1[var6] = arg1[arg2];
        arg1[arg2] = var7;
        Object var8 = arg0[var6];
        arg0[var6] = arg0[arg2];
        arg0[arg2] = var8;
        for (int var9 = arg3; var9 < arg2; var9++) {
            if (((var9 & 0x1) + var7) > arg1[var9]) {
                int var10 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5] = var10;
                Object var11 = arg0[var9];
                arg0[var9] = arg0[var5];
                arg0[var5++] = var11;
            }
        }
        arg1[arg2] = arg1[var5];
        arg1[var5] = var7;
        arg0[arg2] = arg0[var5];
        arg0[var5] = var8;
        method1134(arg0, arg1, var5 - 1, arg3, (byte) -5);
        method1134(arg0, arg1, arg2, var5 + 1, (byte) -5);
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)V")
    public static void method1135(int arg0) {
        field2491 = null;
        if (arg0 == 104) {
            field2490 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1136(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2492++;
        class76.method463(arg4 - arg3, 0, arg2, arg4 + arg3, class268.field3919[arg1]);
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg3 * arg3;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = ((var6 << 1) + 3) * var10;
        int var17 = var9 << 2;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var17;
        int var20 = (arg0 - 1) * var15;
        if (arg5 <= 56) {
            return;
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var13 += var16;
                    var14 += var19;
                    var19 += var17;
                    var16 += var17;
                }
            }
            var7--;
            int var21 = arg1 - var7;
            if (var14 < 0) {
                var6++;
                var14 += var19;
                var19 += var17;
                var13 += var16;
                var16 += var17;
            }
            var13 += -var20;
            int var22 = arg4 + var6;
            int var23 = arg1 + var7;
            var14 += -var18;
            var20 -= var15;
            var18 -= var15;
            int var24 = arg4 - var6;
            class76.method463(var24, 0, arg2, var22, class268.field3919[var21]);
            class76.method463(var24, 0, arg2, var22, class268.field3919[var23]);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
    public static final void method1137(int arg0, int arg1) {
        field2488++;
        int var2 = class238.field3432;
        if (arg1 == 0) {
            var2 = 1;
        }
        if (arg0 != 22092) {
            method1135(-3);
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class240 var20;
            if (arg1 == 0) {
                var20 = class177.field2507;
            } else {
                var20 = class253.field3656[class46.field540[var3]];
            }
            if (var20 != null && var20.method325(117)) {
                int var21 = var20.method1556(3888);
                if (arg1 == 0 || arg1 == var21) {
                    if (var21 == 1) {
                        if ((var20.field4563 & 0x7F) == 64 && (var20.field4553 & 0x7F) == 64) {
                            int var22 = var20.field4563 >> 7;
                            int var23 = var20.field4553 >> 7;
                            if (var22 >= 0 && var22 < 104 && var23 >= 0 && var23 < 104) {
                                var10002 = class134.field1946[var22][var23]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field4563 & 0x7F) == 0 && (var20.field4553 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field4563 & 0x7F) == 64 && (var20.field4553 & 0x7F) == 64)) {
                        int var24 = var20.field4553 - (var21 * 64) >> 7;
                        int var25 = var20.field4563 - (var21 * 64) >> 7;
                        int var26 = var25 + var20.method1556(3888);
                        int var27 = var20.method1556(3888) + var24;
                        if (var27 > 104) {
                            var27 = 104;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        }
                        if (var26 > 104) {
                            var26 = 104;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        }
                        for (int var28 = var25; var28 < var26; var28++) {
                            for (int var29 = var24; var29 < var27; var29++) {
                                var10002 = class134.field1946[var28][var29]++;
                            }
                        }
                    }
                }
            }
        }
        label217: for (int var4 = 0; var4 < var2; var4++) {
            long var5;
            class240 var7;
            if (arg1 == 0) {
                var7 = class177.field2507;
                var5 = 8791798054912L;
            } else {
                var5 = (long) class46.field540[var4] << 32;
                var7 = class253.field3656[class46.field540[var4]];
            }
            if (var7 != null && var7.method325(arg0 ^ 0x563D)) {
                int var8 = var7.method1556(arg0 ^ 0x597C);
                if (arg1 == 0 || arg1 == var8) {
                    var7.field3494 = false;
                    var7.field4524 = true;
                    if ((class164.field2353 && class238.field3432 > 200 || class238.field3432 > 50) && arg1 != 0 && var7.field4579 == var7.method1949(arg0 - 22093).field4376) {
                        var7.field3494 = true;
                    }
                    if (var8 == 1) {
                        if ((var7.field4563 & 0x7F) == 64 && (var7.field4553 & 0x7F) == 64) {
                            int var18 = var7.field4563 >> 7;
                            int var19 = var7.field4553 >> 7;
                            if (var18 < 0 || var18 >= 104 || var19 < 0 || var19 >= 104) {
                                continue;
                            }
                            if (class134.field1946[var18][var19] > 1) {
                                var10002 = class134.field1946[var18][var19]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var7.field4563 & 0x7F) == 0 && (var7.field4553 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var7.field4563 & 0x7F) == 64 && (var7.field4553 & 0x7F) == 0) {
                        int var9 = var7.field4553 - (var8 * 64) >> 7;
                        int var10 = var7.field4563 - (var8 * 64) >> 7;
                        int var11 = var8 + var10;
                        boolean var12 = true;
                        int var13 = var8 + var9;
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        if (var13 > 104) {
                            var13 = 104;
                        }
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        for (int var14 = var10; var14 < var11; var14++) {
                            for (int var17 = var9; var17 < var13; var17++) {
                                if (class134.field1946[var14][var17] <= 1) {
                                    var12 = false;
                                    break;
                                }
                            }
                        }
                        if (var12) {
                            int var15 = var10;
                            while (true) {
                                if (var15 >= var11) {
                                    continue label217;
                                }
                                for (int var16 = var9; var16 < var13; var16++) {
                                    var10002 = class134.field1946[var15][var16]--;
                                }
                                var15++;
                            }
                        }
                    }
                    if (var7.field4587 == null || var7.field4549 > class198.field2819 || class198.field2819 >= var7.field4551) {
                        var7.field4524 = false;
                        var7.field4527 = class4.method21(var7.field4553, class199.field2833, var7.field4563, (byte) 26);
                        class274.method1763(class199.field2833, var7.field4563, var7.field4553, var7.field4527, (var8 - 1) * 64 + 60, var7, var7.field4512, var5, var7.field4593);
                    } else {
                        var7.field3494 = false;
                        var7.field4524 = false;
                        var7.field4527 = class4.method21(var7.field4553, class199.field2833, var7.field4563, (byte) 26);
                        class217.method1416(class199.field2833, var7.field4563, var7.field4553, var7.field4527, var7, var7.field4512, var5, var7.field4532, var7.field4569, var7.field4552, var7.field4589);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "([B)V")
    public class175(byte[] arg0) {
        this.field2493 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2491[var0] = class271.method1736(-7289, var0);
        }
    }
}
