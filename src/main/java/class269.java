import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class269 extends class314 {

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public int field4812;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lud;")
    public static class279 field4816 = class130.method1024("<col=ff9040>", 255);

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 14)
    public static final void method1913(int arg0) {
        if (arg0 != -25088) {
            method1913(-40);
        }
        field4817++;
        for (class261 var1 = (class261) class268.field4806.method2248(-66); var1 != null; var1 = (class261) class268.field4806.method2240(arg0 + 26226)) {
            if (var1.field4660 == -1) {
                var1.field4661 = 0;
                class85.method739(var1, (byte) 84);
            } else {
                var1.method2221(true);
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lgf;B)Lgf;", line = 42)
    public static final class8 method1914(class8 arg0, byte arg1) {
        field4813++;
        class8 var2 = client.method1799(arg0);
        if (var2 == null) {
            var2 = arg0.field180;
        }
        if (arg1 >= -50) {
            method1914((class8) null, (byte) 84);
        }
        return var2;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(II)V", line = 58)
    public class269(int arg0, int arg1) {
        this.field4812 = arg0;
        this.field4814 = arg1;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V", line = 70)
    public static void method1915(byte arg0) {
        if (arg0 >= 66) {
            field4816 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIIIZI)Z", line = 83)
    public static final boolean method1916(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field4815++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class125.field2309[var12][var13] = 0;
                class15.field480[var12][var13] = 99999999;
            }
        }
        class125.field2309[arg2][arg0] = 99;
        int var14 = arg2;
        byte var15 = 0;
        int var16 = arg0;
        class15.field480[arg2][arg0] = 0;
        class105.field1986[var15] = arg2;
        int var32 = var15 + 1;
        class211.field3709[var15] = arg0;
        int[][] var17 = class90.field1702[class287.field5134].field2215;
        int var18 = 0;
        boolean var19 = false;
        while (var32 != var18) {
            var14 = class105.field1986[var18];
            var16 = class211.field3709[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg4 == var14 && arg1 == var16) {
                var19 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class90.field1702[class287.field5134].method978(var14, arg1, 1, arg4, arg8 - 1, var16, arg7, -96)) {
                    var19 = true;
                    break;
                }
                if (arg8 < 10 && class90.field1702[class287.field5134].method968(arg7, var16, arg1, -1, arg4, var14, arg8 - 1, 1)) {
                    var19 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg11 != 0 && class90.field1702[class287.field5134].method983(arg1, arg11, 1, arg3, var14, -1, arg4, arg6, var16)) {
                var19 = true;
                break;
            }
            int var20 = class15.field480[var14][var16] + 1;
            if (var14 > 0 && class125.field2309[var14 - 1][var16] == 0 && (var17[var14 - 1][var16] & 0x12C0108) == 0) {
                class105.field1986[var32] = var14 - 1;
                class211.field3709[var32] = var16;
                class125.field2309[var14 - 1][var16] = 2;
                class15.field480[var14 - 1][var16] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && class125.field2309[var14 + 1][var16] == 0 && (var17[var14 + 1][var16] & 0x12C0180) == 0) {
                class105.field1986[var32] = var14 + 1;
                class211.field3709[var32] = var16;
                class125.field2309[var14 + 1][var16] = 8;
                var32 = var32 + 1 & 0xFFF;
                class15.field480[var14 + 1][var16] = var20;
            }
            if (var16 > 0 && class125.field2309[var14][var16 - 1] == 0 && (var17[var14][var16 - 1] & 0x12C0102) == 0) {
                class105.field1986[var32] = var14;
                class211.field3709[var32] = var16 - 1;
                class125.field2309[var14][var16 - 1] = 1;
                class15.field480[var14][var16 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var16 < 103 && class125.field2309[var14][var16 + 1] == 0 && (var17[var14][var16 + 1] & 0x12C0120) == 0) {
                class105.field1986[var32] = var14;
                class211.field3709[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class125.field2309[var14][var16 + 1] = 4;
                class15.field480[var14][var16 + 1] = var20;
            }
            if (var14 > 0 && var16 > 0 && class125.field2309[var14 - 1][var16 - 1] == 0 && (var17[var14 - 1][var16 - 1] & 0x12C010E) == 0 && (var17[var14 - 1][var16] & 0x12C0108) == 0 && (var17[var14][var16 - 1] & 0x12C0102) == 0) {
                class105.field1986[var32] = var14 - 1;
                class211.field3709[var32] = var16 - 1;
                class125.field2309[var14 - 1][var16 - 1] = 3;
                class15.field480[var14 - 1][var16 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && var16 > 0 && class125.field2309[var14 + 1][var16 - 1] == 0 && (var17[var14 + 1][var16 - 1] & 0x12C0183) == 0 && (var17[var14 + 1][var16] & 0x12C0180) == 0 && (var17[var14][var16 - 1] & 0x12C0102) == 0) {
                class105.field1986[var32] = var14 + 1;
                class211.field3709[var32] = var16 - 1;
                class125.field2309[var14 + 1][var16 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class15.field480[var14 + 1][var16 - 1] = var20;
            }
            if (var14 > 0 && var16 < 103 && class125.field2309[var14 - 1][var16 + 1] == 0 && (var17[var14 - 1][var16 + 1] & 0x12C0138) == 0 && (var17[var14 - 1][var16] & 0x12C0108) == 0 && (var17[var14][var16 + 1] & 0x12C0120) == 0) {
                class105.field1986[var32] = var14 - 1;
                class211.field3709[var32] = var16 + 1;
                class125.field2309[var14 - 1][var16 + 1] = 6;
                class15.field480[var14 - 1][var16 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && var16 < 103 && class125.field2309[var14 + 1][var16 + 1] == 0 && (var17[var14 + 1][var16 + 1] & 0x12C01E0) == 0 && (var17[var14 + 1][var16] & 0x12C0180) == 0 && (var17[var14][var16 + 1] & 0x12C0120) == 0) {
                class105.field1986[var32] = var14 + 1;
                class211.field3709[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class125.field2309[var14 + 1][var16 + 1] = 12;
                class15.field480[var14 + 1][var16 + 1] = var20;
            }
        }
        class100.field1872 = 0;
        if (!var19) {
            if (!arg10) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg4 - var23; var24 <= (arg4 + var23); var24++) {
                for (int var25 = arg1 - var23; var25 <= arg1 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class15.field480[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg1 > var25) {
                            var26 = arg1 - var25;
                        } else if (arg1 + arg11 - 1 < var25) {
                            var26 = var25 + 1 - arg11 - arg1;
                        }
                        int var27 = 0;
                        if (arg4 > var24) {
                            var27 = arg4 - var24;
                        } else if (arg3 + arg4 - 1 < var24) {
                            var27 = var24 + 1 - (arg3 + arg4);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && var22 > class15.field480[var24][var25]) {
                            var22 = class15.field480[var24][var25];
                            var21 = var28;
                            var16 = var25;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg2 == var14 && arg0 == var16) {
                return false;
            }
            class100.field1872 = 1;
        }
        byte var29 = 0;
        class105.field1986[var29] = var14;
        if (arg5 != -8847) {
            method1917(-47);
        }
        int var33 = var29 + 1;
        class211.field3709[var29] = var16;
        int var30;
        int var31 = var30 = class125.field2309[var14][var16];
        while (arg2 != var14 || arg0 != var16) {
            if (var30 != var31) {
                var30 = var31;
                class105.field1986[var33] = var14;
                class211.field3709[var33++] = var16;
            }
            if ((var31 & 0x1) != 0) {
                var16++;
            } else if ((var31 & 0x4) != 0) {
                var16--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class125.field2309[var14][var16];
        }
        if (var33 > 0) {
            class322.method2268(-117, var33, arg9);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)I", line = 371)
    public static final int method1917(int arg0) {
        field4818++;
        try {
            if (class173.field3121 == 0) {
                if (class181.field3298 > class127.method1015(21504) - 5000L) {
                    return 0;
                }
                class181.field3300 = class110.field2022.method2164(0, class301.field5361, class117.field2134);
                class123.field2224 = class127.method1015(21504);
                class173.field3121 = 1;
            }
            if (class127.method1015(21504) > class123.field2224 + 30000L) {
                return class261.method1867(1000, false);
            }
            if (class173.field3121 == 1) {
                if (class181.field3300.field3655 == 2) {
                    return class261.method1867(1001, false);
                }
                if (class181.field3300.field3655 != 1) {
                    return -1;
                }
                class202.field3603 = new class280((Socket) class181.field3300.field3657, class110.field2022);
                class181.field3300 = null;
                int var1 = 0;
                if (class143.field2584) {
                    var1 = class248.field4416;
                }
                class314.field5534.field1142 = 0;
                class314.field5534.method464(28, false);
                class314.field5534.method444((byte) 46, var1);
                class202.field3603.method2021(class314.field5534.field1142, class314.field5534.field1168, 0, arg0 ^ 0xFFFF9DAC);
                if (class80.field1537 != null) {
                    class80.field1537.method747(2512);
                }
                if (class120.field2163 != null) {
                    class120.field2163.method747(2512);
                }
                int var2 = class202.field3603.method2022((byte) -120);
                if (class80.field1537 != null) {
                    class80.field1537.method747(arg0 ^ 0xFFFF947F);
                }
                if (class120.field2163 != null) {
                    class120.field2163.method747(2512);
                }
                if (var2 != 0) {
                    return class261.method1867(var2, false);
                }
                class173.field3121 = 2;
            }
            if (class173.field3121 == 2) {
                if (class202.field3603.method2023(120) < 2) {
                    return -1;
                }
                class317.field5573 = class202.field3603.method2022((byte) -125);
                class317.field5573 <<= 0x8;
                class317.field5573 += class202.field3603.method2022((byte) -127);
                class295.field5258 = 0;
                class105.field1972 = new byte[class317.field5573];
                class173.field3121 = 3;
            }
            if (class173.field3121 == 3) {
                int var3 = class202.field3603.method2023(115);
                if (var3 >= 1) {
                    if (class317.field5573 - class295.field5258 < var3) {
                        var3 = class317.field5573 - class295.field5258;
                    }
                    class202.field3603.method2026(102, class105.field1972, var3, class295.field5258);
                    class295.field5258 += var3;
                    if (class295.field5258 >= class317.field5573) {
                        if (class60.method538(class105.field1972, -70)) {
                            class58.field1233 = new class42[class57.field1212];
                            int var4 = 0;
                            for (int var5 = class162.field2919; var5 <= class239.field4194; var5++) {
                                class42 var6 = class149.method1190(var5, arg0 + 27804);
                                if (var6 != null) {
                                    class58.field1233[var4++] = var6;
                                }
                            }
                            class202.field3603.method2024(-1);
                            class173.field3121 = 0;
                            class202.field3603 = null;
                            class105.field1972 = null;
                            class39.field852 = 0;
                            class181.field3298 = class127.method1015(21504);
                            return 0;
                        }
                        return class261.method1867(1002, false);
                    }
                    return -1;
                }
                return -1;
            }
        } catch (IOException var8) {
            return class261.method1867(1003, false);
        }
        if (arg0 != -25169) {
            field4816 = (class279) null;
        }
        return -1;
    }
}
