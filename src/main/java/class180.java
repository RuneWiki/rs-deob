import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("te")
public class class180 extends class147 {

    @OriginalMember(owner = "te", name = "J", descriptor = "I")
    public static int field3396 = -1;

    @OriginalMember(owner = "te", name = "M", descriptor = "I")
    public static int field3399 = 0;

    @OriginalMember(owner = "te", name = "I", descriptor = "Llf;")
    public static class109 field3395 = class35.method275("Standort", 2);

    @OriginalMember(owner = "te", name = "N", descriptor = "Llf;")
    private static class109 field3400 = class35.method275("Please enter your username)3", 2);

    @OriginalMember(owner = "te", name = "P", descriptor = "Llf;")
    public static class109 field3402 = field3400;

    @OriginalMember(owner = "te", name = "H", descriptor = "B")
    public byte field3394;

    @OriginalMember(owner = "te", name = "K", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "te", name = "L", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "te", name = "O", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "te", name = "Q", descriptor = "I")
    public int field3403;

    @OriginalMember(owner = "te", name = "G", descriptor = "Loh;")
    public class138 field3393;

    @OriginalMember(owner = "te", name = "a", descriptor = "(Lua;B)V")
    public static final void method1223(class185 arg0, byte arg1) {
        field3401++;
        if (class134.field2570) {
            class65.method415(arg0, 12346);
            return;
        }
        if (class69.field1333 == 1 && class129.field2511 >= 715 && class67.field1310 >= 453) {
            class47.field979 = !class47.field979;
            if (class47.field979) {
                class143.method1009(-29672);
            } else {
                class24.method214(255, class137.field2643, class145.field2795, false, class103.field2030, 0);
            }
        }
        if (class107.field2123 == 5) {
            return;
        }
        class159.field2979++;
        if (class107.field2123 != 10) {
            return;
        }
        if (class201.field3959 != 2 && class49.field1011 == 0) {
            if (class69.field1333 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 35;
                byte var5 = 100;
                if (var2 <= class129.field2511 && var2 + var5 >= class129.field2511 && var3 <= class67.field1310 && class67.field1310 <= var3 + var4) {
                    class40.method295((byte) -105);
                    return;
                }
            }
            if (class118.field2333 != null) {
                class40.method295((byte) -105);
            }
        }
        int var6 = 73 / ((10 - arg1) / 41);
        int var7 = class129.field2511;
        int var8 = class69.field1333;
        int var9 = class67.field1310;
        if (class109.field2167 == 0) {
            short var18 = 302;
            short var19 = 291;
            boolean var20 = false;
            if (var8 == 1 && var18 - 75 <= var7 && var7 <= var18 + 75 && var19 - 20 <= var9 && var9 <= var19 + 20) {
                class146.field2822 = 0;
                class109.field2167 = 3;
            }
            if (class29.field635 != 0) {
                while (class104.method747(0)) {
                    if (class204.field4005 == 84) {
                        var20 = true;
                        break;
                    }
                }
            }
            short var21 = 462;
            if (var20 || var8 == 1 && var21 - 75 <= var7 && var7 <= var21 + 75 && var9 >= var19 - 20 && var19 + 20 >= var9) {
                class145.field2794 = class14.field272;
                class146.field2822 = 0;
                class109.field2167 = 2;
                class145.field2805 = class150.field2890;
                class145.field2806 = class14.field229;
            }
            return;
        }
        if (class109.field2167 == 2) {
            short var10 = 231;
            int var22 = var10 + 30;
            if (var8 == 1 && var9 >= var22 - 15 && var9 < var22) {
                class146.field2822 = 0;
            }
            var22 += 15;
            short var11 = 302;
            short var12 = 321;
            if (var8 == 1 && var9 >= var22 - 15 && var22 > var9) {
                class146.field2822 = 1;
            }
            var22 += 15;
            if (var8 == 1 && var11 - 75 <= var7 && var11 + 75 >= var7 && var9 >= var12 - 20 && var9 <= var12 + 20) {
                class145.field2787 = class145.field2787.method797(true).method810(true);
                if (class145.field2787.method786(-30593) == 0) {
                    class67.method437(112, class14.field216, field3402, class14.field246);
                    return;
                }
                if (class145.field2807.method786(-30593) == 0) {
                    class67.method437(95, class14.field220, class172.field3221, class14.field212);
                    return;
                }
                class67.method437(87, class14.field225, class197.field3776, class14.field268);
                class36.method278(20, (byte) -64);
                return;
            }
            short var13 = 462;
            if (var8 == 1 && var7 >= var13 - 75 && var13 + 75 >= var7 && var9 >= var12 - 20 && var12 + 20 >= var9) {
                class145.field2787 = class145.field2795;
                class109.field2167 = 0;
                class145.field2807 = class145.field2795;
            }
            while (true) {
                while (class104.method747(0)) {
                    boolean var14 = false;
                    for (int var15 = 0; var15 < class84.field1703.method786(-30593); var15++) {
                        if (class78.field1513 == class84.field1703.method779(44, var15)) {
                            var14 = true;
                            break;
                        }
                    }
                    if (class146.field2822 == 0) {
                        if (class204.field4005 == 85 && class145.field2787.method786(-30593) > 0) {
                            class145.field2787 = class145.field2787.method794(class145.field2787.method786(-30593) - 1, 0, 95);
                        }
                        if (class204.field4005 == 84 || class204.field4005 == 80) {
                            class146.field2822 = 1;
                        }
                        if (var14 && class145.field2787.method786(-30593) < 12) {
                            class145.field2787 = class145.field2787.method800(117, class78.field1513);
                        }
                    } else if (class146.field2822 == 1) {
                        if (class204.field4005 == 85 && class145.field2807.method786(-30593) > 0) {
                            class145.field2807 = class145.field2807.method794(class145.field2807.method786(-30593) - 1, 0, 126);
                        }
                        if (class204.field4005 == 84 || class204.field4005 == 80) {
                            class146.field2822 = 0;
                        }
                        if (class29.field635 != 0 && class204.field4005 == 84) {
                            class145.field2787 = class145.field2787.method797(true).method810(true);
                            if (class145.field2787.method786(-30593) == 0) {
                                class67.method437(122, class14.field216, field3402, class14.field246);
                                return;
                            }
                            if (class145.field2807.method786(-30593) == 0) {
                                class67.method437(96, class14.field220, class172.field3221, class14.field212);
                                return;
                            }
                            class67.method437(90, class14.field225, class197.field3776, class14.field268);
                            class36.method278(20, (byte) -64);
                            return;
                        }
                        if (var14 && class145.field2807.method786(-30593) < 20) {
                            class145.field2807 = class145.field2807.method800(117, class78.field1513);
                        }
                    }
                }
                return;
            }
        }
        if (class109.field2167 != 3) {
            return;
        }
        short var16 = 382;
        short var17 = 321;
        if (var8 == 1 && var16 - 75 <= var7 && var7 <= var16 + 75 && var9 >= var17 - 20 && var9 <= var17 + 20) {
            class109.field2167 = 0;
            return;
        }
    }

    @OriginalMember(owner = "te", name = "a", descriptor = "(ILuc;)V")
    public static final void method1224(int arg0, class187 arg1) {
        if (class143.field2754 == arg1.field3553 || arg1.field3597 == -1 || arg1.field3570 != 0 || arg1.field3595 + 1 > client.method246(arg0 ^ 0xFFFFFFF1, arg1.field3597).field442[arg1.field3558]) {
            int var2 = arg1.field3553 - arg1.field3545;
            int var3 = class143.field2754 - arg1.field3545;
            int var4 = arg1.field3612 * 64 + arg1.field3606 * 128;
            int var5 = arg1.field3612 * 64 + arg1.field3552 * 128;
            int var6 = arg1.field3612 * 64 + arg1.field3571 * 128;
            arg1.field3549 = ((var2 - var3) * var4 + var3 * var6) / var2;
            int var7 = arg1.field3610 * 128 + arg1.field3612 * 64;
            arg1.field3609 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        arg1.field3550 = 0;
        if (arg1.field3561 == 0) {
            arg1.field3600 = 1024;
        }
        field3398++;
        if (arg1.field3561 == 1) {
            arg1.field3600 = 1536;
        }
        if (~arg1.field3561 == arg0) {
            arg1.field3600 = 0;
        }
        if (arg1.field3561 == 3) {
            arg1.field3600 = 512;
        }
        arg1.field3556 = arg1.field3600;
    }

    @OriginalMember(owner = "te", name = "b", descriptor = "(Z)V")
    public static void method1225(boolean arg0) {
        if (arg0) {
            field3400 = null;
        }
        field3402 = null;
        field3395 = null;
        field3400 = null;
    }
}
