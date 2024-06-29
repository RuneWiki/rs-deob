import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class286 extends class51 {

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    private final int field4646;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    private final int field4647;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    private final int field4652;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    private final int field4656;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field4655 = 0;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "Lda;")
    public static class212 field4645 = new class212();

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public static int field4658 = 128;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIII)V", line = 7)
    public static final void method2004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 72) {
            field4655 = -73;
        }
        field4654++;
        class140.field2164[0].method44(arg3, arg1);
        class140.field2164[1].method44(arg3, arg1 + arg2 - 16);
        int var6 = (arg2 - 32) * arg2 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg0 / (arg5 - arg2);
        if (!class166.field2625) {
            class54.method383(arg3, arg1 + 16, 16, arg2 - 32, class292.field4736);
            class54.method383(arg3, arg1 + var7 + 16, 16, var6, class295.field4773);
            class54.method377(arg3, arg1 + var7 + 16, var6, class143.field2185);
            class54.method377(arg3 + 1, arg1 + 16 + var7, var6, class143.field2185);
            class54.method368(arg3, arg1 + var7 + 16, 16, class143.field2185);
            class54.method368(arg3, arg1 + var7 + 17, 16, class143.field2185);
            class54.method377(arg3 + 15, arg1 + var7 + 16, var6, class301.field4876);
            class54.method377(arg3 + 14, arg1 + var7 + 17, var6 - 1, class301.field4876);
            class54.method368(arg3, arg1 + var6 + var7 + 15, 16, class301.field4876);
            class54.method368(arg3 + 1, arg1 + var7 + var6 - -14, 15, class301.field4876);
            return;
        }
        class190.method1363(arg3, arg1 + 16, 16, arg2 - 32, class292.field4736);
        class190.method1363(arg3, arg1 + var7 + 16, 16, var6, class295.field4773);
        class190.method1362(arg3, arg1 + var7 + 16, var6, class143.field2185);
        class190.method1362(arg3 + 1, arg1 + var7 + 16, var6, class143.field2185);
        class190.method1356(arg3, arg1 + var7 + 16, 16, class143.field2185);
        class190.method1356(arg3, arg1 - (-var7 - 17), 16, class143.field2185);
        class190.method1362(arg3 + 15, arg1 + var7 + 16, var6, class301.field4876);
        class190.method1362(arg3 + 14, arg1 + var7 + 17, var6 - 1, class301.field4876);
        class190.method1356(arg3, arg1 + var7 + var6 + 15, 16, class301.field4876);
        class190.method1356(arg3 + 1, arg1 + var7 + var6 + 14, 15, class301.field4876);
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)V", line = 54)
    public static final void method2005(byte arg0) {
        class314.field5288 = null;
        if (arg0 != -9) {
            field4658 = 45;
        }
        class312.field5263 = null;
        class95.field1412 = null;
        class69.field1040 = null;
        field4653++;
        class173.field2812 = null;
        class223.field3562 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V", line = 74)
    public final void method72(int arg0, int arg1, int arg2) {
        field4651++;
        int var4 = this.field4652 * arg2 >> 12;
        int var5 = this.field4646 * arg1 >> 12;
        int var6 = this.field4656 * arg2 >> 12;
        if (arg0 != -15071) {
            method2005((byte) 3);
        }
        int var7 = this.field4647 * arg1 >> 12;
        class174.method1254(2, var4, this.field772, var7, var5, var6);
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(IIIIIII)V", line = 98)
    public class286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4646 = arg1;
        this.field4647 = arg3;
        this.field4652 = arg0;
        this.field4656 = arg2;
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)V", line = 110)
    public static void method2006(byte arg0) {
        if (arg0 >= -94) {
            method2007(false, 114, 46, 54, 15, 36, 92, -48, 123, 35, -69, (byte) -102);
        }
        field4645 = null;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(III)V", line = 140)
    public final void method73(int arg0, int arg1, int arg2) {
        int var4 = this.field4652 * arg2 >> 12;
        field4650++;
        int var5 = this.field4656 * arg2 >> 12;
        int var6 = this.field4646 * arg1 >> 12;
        int var7 = this.field4647 * arg1 >> 12;
        class128.method895(this.field769, var5, var7, arg0, this.field772, this.field767, var6, var4);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)V", line = 155)
    public final void method71(int arg0, int arg1, int arg2) {
        field4657++;
        if (arg1 != 0) {
            field4658 = 83;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZIIIIIIIIIIB)Z", line = 169)
    public static final boolean method2007(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11) {
        if (arg11 <= 38) {
            field4659 = 127;
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class132.field1976[var12][var13] = 0;
                class97.field1426[var12][var13] = 99999999;
            }
        }
        field4649++;
        class132.field1976[arg4][arg10] = 99;
        class97.field1426[arg4][arg10] = 0;
        int var14 = arg4;
        byte var15 = 0;
        class173.field2810[var15] = arg4;
        int var16 = arg10;
        boolean var17 = false;
        int var32 = var15 + 1;
        class138.field2068[var15] = arg10;
        int var18 = 0;
        int[][] var19 = class222.field3548[class55.field807].field3570;
        while (var32 != var18) {
            var14 = class173.field2810[var18];
            var16 = class138.field2068[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg7 == var14 && arg5 == var16) {
                var17 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class222.field3548[class55.field807].method1601(1, 19661058, arg7, arg5, var14, var16, arg6, arg8 - 1)) {
                    var17 = true;
                    break;
                }
                if (arg8 < 10 && class222.field3548[class55.field807].method1602(1, arg8 - 1, (byte) 42, arg7, var14, arg5, arg6, var16)) {
                    var17 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg2 != 0 && class222.field3548[class55.field807].method1608(var14, 32, arg7, arg3, var16, 1, arg1, arg2, arg5)) {
                var17 = true;
                break;
            }
            int var20 = class97.field1426[var14][var16] + 1;
            if (var14 > 0 && class132.field1976[var14 - 1][var16] == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0) {
                class173.field2810[var32] = var14 - 1;
                class138.field2068[var32] = var16;
                var32 = var32 + 1 & 0xFFF;
                class132.field1976[var14 - 1][var16] = 2;
                class97.field1426[var14 - 1][var16] = var20;
            }
            if (var14 < 103 && class132.field1976[var14 + 1][var16] == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0) {
                class173.field2810[var32] = var14 + 1;
                class138.field2068[var32] = var16;
                class132.field1976[var14 + 1][var16] = 8;
                class97.field1426[var14 + 1][var16] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var16 > 0 && class132.field1976[var14][var16 - 1] == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class173.field2810[var32] = var14;
                class138.field2068[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class132.field1976[var14][var16 - 1] = 1;
                class97.field1426[var14][var16 - 1] = var20;
            }
            if (var16 < 103 && class132.field1976[var14][var16 + 1] == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class173.field2810[var32] = var14;
                class138.field2068[var32] = var16 + 1;
                class132.field1976[var14][var16 + 1] = 4;
                class97.field1426[var14][var16 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var16 > 0 && class132.field1976[var14 - 1][var16 - 1] == 0 && (var19[var14 - 1][var16 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class173.field2810[var32] = var14 - 1;
                class138.field2068[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class132.field1976[var14 - 1][var16 - 1] = 3;
                class97.field1426[var14 - 1][var16 - 1] = var20;
            }
            if (var14 < 103 && var16 > 0 && class132.field1976[var14 + 1][var16 - 1] == 0 && (var19[var14 + 1][var16 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class173.field2810[var32] = var14 + 1;
                class138.field2068[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class132.field1976[var14 + 1][var16 - 1] = 9;
                class97.field1426[var14 + 1][var16 - 1] = var20;
            }
            if (var14 > 0 && var16 < 103 && class132.field1976[var14 - 1][var16 + 1] == 0 && (var19[var14 - 1][var16 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class173.field2810[var32] = var14 - 1;
                class138.field2068[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class132.field1976[var14 - 1][var16 + 1] = 6;
                class97.field1426[var14 - 1][var16 + 1] = var20;
            }
            if (var14 < 103 && var16 < 103 && class132.field1976[var14 + 1][var16 + 1] == 0 && (var19[var14 + 1][var16 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class173.field2810[var32] = var14 + 1;
                class138.field2068[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class132.field1976[var14 + 1][var16 + 1] = 12;
                class97.field1426[var14 + 1][var16 + 1] = var20;
            }
        }
        class292.field4732 = 0;
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg7 - var23; var24 <= arg7 + var23; var24++) {
                for (int var25 = arg5 - var23; var25 <= (arg5 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class97.field1426[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg7) {
                            var26 = arg7 - var24;
                        } else if (arg3 + arg7 - 1 < var24) {
                            var26 = var24 + 1 - (arg7 - -arg3);
                        }
                        int var27 = 0;
                        if (var25 < arg5) {
                            var27 = arg5 - var25;
                        } else if ((arg5 + arg2 - 1) < var25) {
                            var27 = var25 + 1 - arg2 - arg5;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && var22 > class97.field1426[var24][var25]) {
                            var14 = var24;
                            var21 = var28;
                            var22 = class97.field1426[var24][var25];
                            var16 = var25;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg4 == var14 && arg10 == var16) {
                return false;
            }
            class292.field4732 = 1;
        }
        byte var29 = 0;
        class173.field2810[var29] = var14;
        int var33 = var29 + 1;
        class138.field2068[var29] = var16;
        int var30;
        int var31 = var30 = class132.field1976[var14][var16];
        while (arg4 != var14 || arg10 != var16) {
            if (var30 != var31) {
                var30 = var31;
                class173.field2810[var33] = var14;
                class138.field2068[var33++] = var16;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var16++;
            } else if ((var31 & 0x4) != 0) {
                var16--;
            }
            var31 = class132.field1976[var14][var16];
        }
        if (var33 > 0) {
            class296.method2042((byte) 79, arg9, var33);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
