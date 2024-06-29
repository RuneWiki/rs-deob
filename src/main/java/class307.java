import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class307 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Z")
    public boolean field4195 = true;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Ltm;")
    public static class112 field4200 = new class112(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field4205 = 0;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Ldk;")
    public static class328 field4208 = new class328("stellardawn", 1);

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "C")
    private char field4204;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public int field4199;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Ljava/lang/String;")
    public String field4206;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "[I")
    public static int[] field4202;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1856(int arg0) {
        field4200 = null;
        field4208 = null;
        if (arg0 == 0) {
            field4202 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIIILvk;I)Z")
    public static final boolean method1857(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class272 arg9, int arg10) {
        field4198++;
        int var11 = arg6;
        int var12 = arg5;
        if (arg8 != 1109655552) {
            field4200 = null;
        }
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        class159.field2286[var13][var14] = 99;
        int var16 = arg5 - var14;
        class84.field1267[var13][var14] = 0;
        byte var17 = 0;
        class180.field2615[var17] = arg6;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class7.field130[var10001] = arg5;
        int[][] var19 = arg9.field3756;
        while (var26 != var18) {
            var12 = class7.field130[var18];
            var11 = class180.field2615[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var11 - arg9.field3751;
            int var22 = var12 - arg9.field3761;
            int var23 = var12 - var16;
            if (arg4 == -4) {
                if (arg7 == var11 && arg10 == var12) {
                    class163.field2335 = var12;
                    class239.field3376 = var11;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class236.method1483(1, 1, arg3, arg10, var11, true, arg7, var12, arg2)) {
                    class163.field2335 = var12;
                    class239.field3376 = var11;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg9.method1699(-3, 1, 1, arg2, arg10, arg3, arg0, arg7, var12, var11)) {
                    class239.field3376 = var11;
                    class163.field2335 = var12;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg9.method1693(arg7, arg2, var11, arg3, var12, arg0, arg10, 1, arg8 - 1109655632)) {
                    class163.field2335 = var12;
                    class239.field3376 = var11;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg9.method1707(var12, (byte) 120, arg1, 1, arg10, arg4, arg7, var11)) {
                    class239.field3376 = var11;
                    class163.field2335 = var12;
                    return true;
                }
            } else if (arg9.method1691(arg10, arg7, var11, arg4, var12, false, arg1, 1)) {
                class239.field3376 = var11;
                class163.field2335 = var12;
                return true;
            }
            int var25 = class84.field1267[var20][var23] + 1;
            if (var20 > 0 && class159.field2286[var20 - 1][var23] == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0) {
                class180.field2615[var26] = var11 - 1;
                class7.field130[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class159.field2286[var20 - 1][var23] = 2;
                class84.field1267[var20 - 1][var23] = var25;
            }
            if (var20 < 127 && class159.field2286[var20 + 1][var23] == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0) {
                class180.field2615[var26] = var11 + 1;
                class7.field130[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class159.field2286[var20 + 1][var23] = 8;
                class84.field1267[var20 + 1][var23] = var25;
            }
            if (var23 > 0 && class159.field2286[var20][var23 - 1] == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class180.field2615[var26] = var11;
                class7.field130[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class159.field2286[var20][var23 - 1] = 1;
                class84.field1267[var20][var23 - 1] = var25;
            }
            if (var23 < 127 && class159.field2286[var20][var23 + 1] == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class180.field2615[var26] = var11;
                class7.field130[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class159.field2286[var20][var23 + 1] = 4;
                class84.field1267[var20][var23 + 1] = var25;
            }
            if (var20 > 0 && var23 > 0 && class159.field2286[var20 - 1][var23 - 1] == 0 && (var19[var21 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class180.field2615[var26] = var11 - 1;
                class7.field130[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class159.field2286[var20 - 1][var23 - 1] = 3;
                class84.field1267[var20 - 1][var23 - 1] = var25;
            }
            if (var20 < 127 && var23 > 0 && class159.field2286[var20 + 1][var23 - 1] == 0 && (var19[var21 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class180.field2615[var26] = var11 + 1;
                class7.field130[var26] = var12 - 1;
                class159.field2286[var20 + 1][var23 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class84.field1267[var20 + 1][var23 - 1] = var25;
            }
            if (var20 > 0 && var23 < 127 && class159.field2286[var20 - 1][var23 + 1] == 0 && (var19[var21 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class180.field2615[var26] = var11 - 1;
                class7.field130[var26] = var12 + 1;
                class159.field2286[var20 - 1][var23 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class84.field1267[var20 - 1][var23 + 1] = var25;
            }
            if (var20 < 127 && var23 < 127 && class159.field2286[var20 + 1][var23 + 1] == 0 && (var19[var21 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class180.field2615[var26] = var11 + 1;
                class7.field130[var26] = var12 + 1;
                class159.field2286[var20 + 1][var23 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class84.field1267[var20 + 1][var23 + 1] = var25;
            }
        }
        class239.field3376 = var11;
        class163.field2335 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4203++;
        class103 var10 = null;
        for (class103 var11 = (class103) class230.field3244.method1544(-98); var11 != null; var11 = (class103) class230.field3244.method1546((byte) -42)) {
            if (var11.field1471 == arg1 && var11.field1465 == arg2 && var11.field1470 == arg9 && var11.field1472 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class103();
            var10.field1471 = arg1;
            var10.field1472 = arg3;
            var10.field1470 = arg9;
            var10.field1465 = arg2;
            class39.method318(3, var10);
            class230.field3244.method1553((byte) -81, var10);
        }
        if (arg5 > -123) {
            field4202 = null;
        }
        var10.field1468 = arg6;
        var10.field1459 = arg4;
        var10.field1476 = arg0;
        var10.field1466 = arg8;
        var10.field1460 = arg7;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static final void method1859(byte arg0) {
        field4196++;
        if (!class347.field4745 || arg0 <= 77) {
            return;
        }
        while (true) {
            while (class234.field3312 < class199.field2849.length) {
                class334 var1 = class199.field2849[class234.field3312];
                if (var1 != null && var1.field4577 == -1) {
                    if (class261.field3643 == null) {
                        class261.field3643 = class346.field4731.method1224(var1.field4579, 3);
                    }
                    int var2 = class261.field3643.field5590;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field4577 = var2;
                    class234.field3312++;
                    class261.field3643 = null;
                } else {
                    class234.field3312++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLlk;I)V")
    private final void method1860(byte arg0, class425 arg1, int arg2) {
        if (arg0 > -124) {
            method1856(124);
        }
        field4201++;
        if (arg2 == 1) {
            this.field4204 = class104.method665(arg1.method2480(-8315), (byte) 118);
        } else if (arg2 == 2) {
            this.field4199 = arg1.method2502((byte) -86);
        } else if (arg2 == 4) {
            this.field4195 = false;
        } else if (arg2 == 5) {
            this.field4206 = arg1.method2464(false);
            return;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)Z")
    public final boolean method1861(byte arg0) {
        if (arg0 <= 4) {
            field4208 = null;
        }
        field4197++;
        return this.field4204 == 's';
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLlk;)V")
    public final void method1862(byte arg0, class425 arg1) {
        int var3 = 17 % ((arg0 - 53) / 39);
        field4207++;
        while (true) {
            int var4 = arg1.method2503(true);
            if (var4 == 0) {
                return;
            }
            this.method1860((byte) -128, arg1, var4);
        }
    }

    static {
        new class112("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }
}
