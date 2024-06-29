import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class128 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Z")
    public static boolean field2801 = false;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2805 = 1;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lje;")
    private static class67 field2807 = class85.method592(255, "Please use a different world)3");

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Lje;")
    public static class67 field2815 = field2807;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lje;")
    public static class67 field2811 = class85.method592(255, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lje;")
    public static class67 field2808 = field2807;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Lje;")
    public static class67 field2820 = class85.method592(255, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Lje;")
    public static class67 field2822 = class85.method592(255, "");

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Luf;")
    public static class145 field2819 = new class145(512);

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public int field2810;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public int field2816;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lua;")
    public static class140 field2818;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    public static int[] field2804;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static final void method978(byte arg0) {
        field2821++;
        int var1 = class58.field1166;
        int var2 = class123.field2740;
        int var3 = class3.field25;
        int var4 = class58.field1154;
        int var5 = 6116423;
        class8.method70(var2, var1, var3, var4, var5);
        class8.method70(var2 + 1, var1 - -1, var3 - 2, 16, 0);
        class8.method68(var2 + 1, var1 - -18, var3 - 2, var4 + -19, 0);
        class89.field1976.method793(class118.field2669, var2 + 3, var1 - -14, var5, -1);
        int var6 = class104.field2361;
        int var7 = class135.field3070;
        for (int var8 = 0; var8 < class69.field1419; var8++) {
            int var9 = 16777215;
            int var10 = var1 + (class69.field1419 + -1 - var8) * 15 + 31;
            if (var7 > var2 && var2 + var3 > var7 && var10 - 13 < var6 && var6 < var10 + 3) {
                var9 = 16776960;
            }
            class89.field1976.method793(class37.method235((byte) 1, var8), var2 + 3, var10, var9, 0);
        }
        if (arg0 != 38) {
            method983(87, 46);
        }
        class27.method179(class58.field1154, class58.field1166, class123.field2740, 0, class3.field25);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILkc;)V")
    public static final void method979(int arg0, class72 arg1) {
        field2802++;
        int var2 = arg1.field1553;
        if (var2 == 324) {
            if (class140.field3158 == -1) {
                class17.field317 = arg1.field1528;
                class140.field3158 = arg1.field1588;
            }
            if (class152.field3478.field1363) {
                arg1.field1588 = class140.field3158;
            } else {
                arg1.field1588 = class17.field317;
            }
        } else if (var2 == 325) {
            if (class140.field3158 == -1) {
                class17.field317 = arg1.field1528;
                class140.field3158 = arg1.field1588;
            }
            if (class152.field3478.field1363) {
                arg1.field1588 = class17.field317;
            } else {
                arg1.field1588 = class140.field3158;
            }
        } else {
            if (arg0 != 2047) {
                method982(81, -35, (byte) 29, -81, -103, 125, -54);
            }
            if (var2 == 327) {
                arg1.field1542 = 150;
                arg1.field1502 = (int) (Math.sin((double) class34.field627 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field1511 = 0;
                arg1.field1504 = 5;
            } else if (var2 == 328) {
                arg1.field1542 = 150;
                arg1.field1502 = (int) (Math.sin((double) class34.field627 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field1511 = 1;
                arg1.field1504 = 5;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[BLhb;II[Lee;III)V")
    public static final void method980(int arg0, int arg1, int arg2, byte[] arg3, class51 arg4, int arg5, int arg6, class34[] arg7, int arg8, int arg9, int arg10) {
        if (arg2 != 1) {
            field2819 = null;
        }
        field2806++;
        int var11 = -1;
        class91 var12 = new class91(arg3);
        while (true) {
            int var13 = var12.method662((byte) 6);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method662((byte) 75);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 & 0x3F;
                int var18 = var12.method649(false);
                int var19 = var14 >> 12;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg9 == var19 && var16 >= arg0 && var16 < arg0 + 8 && var17 >= arg10 && arg10 + 8 > var17) {
                    class47 var22 = class130.method993(var11, (byte) 126);
                    int var23 = arg6 + class104.method826(var21, var16 & 0x7, -3, arg5, var22.field931, var22.field875, var17 & 0x7);
                    int var24 = arg8 + class42.method278((byte) -101, var22.field875, var17 & 0x7, arg5, var16 & 0x7, var22.field931, var21);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class34 var25 = null;
                        int var26 = arg1;
                        if ((class82.field1809[1][var23][var24] & 0x2) == 2) {
                            var26 = arg1 - 1;
                        }
                        if (var26 >= 0) {
                            var25 = arg7[var26];
                        }
                        class19.method134(var20, arg4, arg1, var11, var24, var23, arg5 + var21 & 0x3, arg2 + 24970, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static void method981(byte arg0) {
        field2822 = null;
        if (arg0 >= -119) {
            field2808 = null;
        }
        field2807 = null;
        field2819 = null;
        field2811 = null;
        field2815 = null;
        field2820 = null;
        field2804 = null;
        field2808 = null;
        field2818 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIBIIII)V")
    public static final void method982(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field2814++;
        int var7 = 2048 - arg5 & 0x7FF;
        int var8 = 0;
        int var9 = 2048 - arg3 & 0x7FF;
        int var10 = 0;
        int var11 = -72 % ((5 - arg2) / 56);
        int var12 = arg6;
        if (var9 != 0) {
            int var13 = class96.field2143[var9];
            int var14 = class96.field2148[var9];
            int var15 = var10 * var14 - arg6 * var13 >> 16;
            var12 = var10 * var13 + arg6 * var14 >> 16;
            var10 = var15;
        }
        if (var7 != 0) {
            int var16 = class96.field2143[var7];
            int var17 = class96.field2148[var7];
            int var18 = var8 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var8 * var16 >> 16;
            var8 = var18;
        }
        class46.field853 = arg3;
        class83.field1828 = arg5;
        class152.field3486 = arg4 - var12;
        class101.field2274 = arg0 - var8;
        class3.field42 = arg1 - var10;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Z")
    public static final boolean method983(int arg0, int arg1) {
        if (arg1 >= -58) {
            return false;
        }
        field2809++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }
}
