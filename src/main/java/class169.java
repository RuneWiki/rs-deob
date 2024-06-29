import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class169 {

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field2560 = 0;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "F")
    public static float field2563;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[BIZIII[Lvg;IB)V", line = 18)
    public static final void method1216(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, class303[] arg8, int arg9, byte arg10) {
        field2561++;
        int var11 = -1;
        class166 var12 = new class166(arg2);
        while (true) {
            int var13 = var12.method1123(32767);
            if (var13 == 0) {
                if (arg10 < 3) {
                    field2559 = -84;
                }
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method1145(128);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFEF) >> 6;
                int var18 = var12.method1178(0);
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                int var21 = var14 >> 12;
                if (arg6 == var21 && arg1 <= var17 && arg1 + 8 > var17 && arg0 <= var16 && var16 < (arg0 + 8)) {
                    class85 var22 = class201.method1431(-101, var11);
                    int var23 = arg7 + class37.method309(var22.field1390, arg9, var17 & 0x7, var22.field1385, (byte) -121, var20, var16 & 0x7);
                    int var24 = arg5 + class25.method238(var22.field1385, var22.field1390, arg9, var20, var16 & 0x7, true, var17 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class303 var25 = null;
                        if (!arg4) {
                            int var26 = arg3;
                            if ((class92.field1468[1][var23][var24] & 0x2) == 2) {
                                var26 = arg3 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg8[var26];
                            }
                        }
                        class257.method1764(arg4, var23, -28552, !arg4, var25, var11, var24, arg9 + var20 & 0x3, arg3, var19, arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 104)
    public static final void method1217(byte arg0) {
        field2557++;
        if (arg0 < 0) {
            field2560 = 80;
        }
        if (class298.field4599) {
            return;
        }
        if (class139.field2170) {
            class259.field4063 = (float) ((int) class259.field4063 - 65 & 0xFFFFFF80);
        } else {
            class193.field2888 += (-class193.field2888 - 24.0F) / 2.0F;
        }
        class232.field3672 = true;
        class298.field4599 = true;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(CIILjava/lang/StringBuffer;)Ljava/lang/StringBuffer;", line = 135)
    public static final StringBuffer method1218(char arg0, int arg1, int arg2, StringBuffer arg3) {
        int var4 = arg3.length();
        field2558++;
        arg3.setLength(arg1);
        int var5 = var4;
        if (arg2 < 82) {
            field2563 = -0.8842155F;
        }
        while (arg1 > var5) {
            arg3.setCharAt(var5, arg0);
            var5++;
        }
        return arg3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)I", line = 159)
    public static final int method1219(int arg0, byte arg1) {
        field2564++;
        double var2 = (double) ((arg0 & 0xFFD253) >> 16) / 256.0D;
        double var4 = var2;
        double var6 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (var2 > var6) {
            var4 = var6;
        }
        double var8 = 0.0D;
        double var10 = (double) (arg0 & 0xFF) / 256.0D;
        double var12 = 0.0D;
        if (arg1 >= -8) {
            field2563 = 0.46369296F;
        }
        if (var10 < var4) {
            var4 = var10;
        }
        double var14 = var2;
        if (var6 > var2) {
            var14 = var6;
        }
        if (var10 > var14) {
            var14 = var10;
        }
        double var16 = (var4 + var14) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var4 != var14) {
            if (var16 < 0.5D) {
                var12 = (var14 - var4) / (var4 + var14);
            }
            if (var2 == var14) {
                var8 = (var6 - var10) / (var14 - var4);
            } else if (var6 == var14) {
                var8 = (var10 - var2) / (var14 - var4) + 2.0D;
            } else if (var10 == var14) {
                var8 = (var2 - var6) / (var14 - var4) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var12 = (var14 - var4) / (2.0D - var14 - var4);
            }
        }
        double var19 = var8 / 6.0D;
        int var21 = (int) (var12 * 256.0D);
        int var22 = (int) (var19 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var18 > 243) {
            var21 >>= 0x4;
        } else if (var18 > 217) {
            var21 >>= 0x3;
        } else if (var18 > 192) {
            var21 >>= 0x2;
        } else if (var18 > 179) {
            var21 >>= 0x1;
        }
        return (var18 >> 1) + (var21 >> 5 << 7) + (var22 >> 2 << 10);
    }
}
