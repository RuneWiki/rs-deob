import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class75 extends class223 {

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "Ljava/lang/String;")
    public String field1020;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "[I")
    public static int[] field1023 = new int[50];

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "Lgk;")
    public static class331 field1022 = new class331("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field1026 = 0;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public static int field1027 = 0;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "Lag;")
    public static class480 field1018;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
    public static void method706(int arg0) {
        field1018 = null;
        if (arg0 == 0) {
            field1023 = null;
            field1022 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLlh;)I")
    public static final int method707(byte arg0, class364 arg1) {
        if (arg0 >= -63) {
            method709(68, true);
        }
        field1017++;
        int var2 = arg1.field5079;
        class531 var3 = arg1.method969(-1);
        if (arg1.field1743) {
            var2 = arg1.field5052;
        } else if (arg1.field1763 == var3.field7785 || arg1.field1763 == var3.field7771 || arg1.field1763 == var3.field7781 || arg1.field1763 == var3.field7805) {
            var2 = arg1.field5066;
        } else if (arg1.field1763 == var3.field7783 || arg1.field1763 == var3.field7799 || arg1.field1763 == var3.field7808 || arg1.field1763 == var3.field7791) {
            var2 = arg1.field5061;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIILrs;)V")
    public static final void method708(int arg0, int arg1, int arg2, class461 arg3) {
        if (arg2 != 1) {
            method709(-124, false);
        }
        field1025++;
        if (arg3.field1696 == arg0 && arg0 != -1) {
            class267 var4 = class153.field2169.method1585(3, arg0);
            int var5 = var4.field3932;
            if (var5 == 1) {
                arg3.field1729 = arg1;
                arg3.field1745 = 0;
                arg3.field1742 = 1;
                arg3.field1685 = 0;
                arg3.field1758 = 0;
                class20.method183(arg3.field6335, arg3.field1745, arg3.field6328, arg3.field6334, true, var4, false);
            }
            if (var5 == 2) {
                arg3.field1685 = 0;
                return;
            }
        } else if (arg0 == -1 || arg3.field1696 == -1 || class153.field2169.method1585(arg2 + 2, arg0).field3942 >= class153.field2169.method1585(3, arg3.field1696).field3942) {
            arg3.field1685 = 0;
            arg3.field1742 = 1;
            arg3.field1758 = 0;
            arg3.field1783 = arg3.field1779;
            arg3.field1729 = arg1;
            arg3.field1696 = arg0;
            arg3.field1745 = 0;
            if (arg3.field1696 == -1) {
                return;
            }
            class20.method183(arg3.field6335, arg3.field1745, arg3.field6328, arg3.field6334, true, class153.field2169.method1585(3, arg3.field1696), false);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ)V")
    public static final void method709(int arg0, boolean arg1) {
        if (arg1 && class399.field5889 != null) {
            class73.field1007 = class399.field5889.field4954;
        } else {
            class73.field1007 = -1;
        }
        field1019++;
        class228.field3318 = 0;
        class399.field5889 = null;
        if (arg0 != 4095) {
            field1023 = null;
        }
        class502.field7456 = null;
        class274.field4042 = null;
        class399.method2457();
        class399.field5903.method1016(-93);
        class227.field3309 = null;
        class297.field4264 = null;
        class45.field510 = -1;
        class403.field5975 = null;
        class21.field238 = null;
        class88.field1194 = null;
        class460.field6746 = null;
        class399.field5900 = null;
        class267.field3928 = null;
        class447.field6600 = -1;
        class502.field7449 = null;
        class282.field4108 = null;
        class399.field5891.method840(-127);
        class399.field5893.method2008(64, 64, 383137607);
        class399.field5891.method844(64, false, 128);
        class399.field5897.method791(arg0 - 31673, 64);
        class29.field357.method1681(64, -119);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BILsd;IIIIIIII)Z")
    public static final boolean method710(byte arg0, int arg1, class62 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1024++;
        int var11 = arg6;
        int var12 = arg8;
        if (arg0 > -111) {
            return false;
        }
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        class106.field1467[var13][var14] = 99;
        int var16 = arg8 - var14;
        class445.field6584[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class424.field6262[var17] = arg6;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class342.field4737[var10001] = arg8;
        int[][] var19 = arg2.field721;
        while (var26 != var18) {
            var11 = class424.field6262[var18];
            var12 = class342.field4737[var18];
            int var20 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var11 - arg2.field728;
            int var23 = var12 - arg2.field733;
            if (arg1 == -4) {
                if (arg9 == var11 && arg7 == var12) {
                    class474.field6988 = var12;
                    class370.field5493 = var11;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class38.method385(2, arg7, 2, arg5, arg4, var12, var11, arg9, (byte) 127)) {
                    class474.field6988 = var12;
                    class370.field5493 = var11;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg2.method559(arg9, 0, 2, arg5, var11, arg3, arg7, var12, arg4, 2)) {
                    class474.field6988 = var12;
                    class370.field5493 = var11;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg2.method555(arg4, 2, arg9, arg3, arg5, arg7, var11, 107, var12)) {
                    class474.field6988 = var12;
                    class370.field5493 = var11;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg2.method557(var12, arg10, arg7, 2, var11, false, arg9, arg1)) {
                    class370.field5493 = var11;
                    class474.field6988 = var12;
                    return true;
                }
            } else if (arg2.method564(arg10, var11, false, arg1, arg9, var12, arg7, 2)) {
                class370.field5493 = var11;
                class474.field6988 = var12;
                return true;
            }
            int var25 = class445.field6584[var21][var20] + 1;
            if (var21 > 0 && class106.field1467[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class424.field6262[var26] = var11 - 1;
                class342.field4737[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class106.field1467[var21 - 1][var20] = 2;
                class445.field6584[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class106.field1467[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class424.field6262[var26] = var11 + 1;
                class342.field4737[var26] = var12;
                class106.field1467[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class445.field6584[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class106.field1467[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class424.field6262[var26] = var11;
                class342.field4737[var26] = var12 - 1;
                class106.field1467[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class445.field6584[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class106.field1467[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class424.field6262[var26] = var11;
                class342.field4737[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class106.field1467[var21][var20 + 1] = 4;
                class445.field6584[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class106.field1467[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class424.field6262[var26] = var11 - 1;
                class342.field4737[var26] = var12 - 1;
                class106.field1467[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class445.field6584[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class106.field1467[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class424.field6262[var26] = var11 + 1;
                class342.field4737[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class106.field1467[var21 + 1][var20 - 1] = 9;
                class445.field6584[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class106.field1467[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class424.field6262[var26] = var11 - 1;
                class342.field4737[var26] = var12 + 1;
                class106.field1467[var21 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class445.field6584[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class106.field1467[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class424.field6262[var26] = var11 + 1;
                class342.field4737[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class106.field1467[var21 + 1][var20 + 1] = 12;
                class445.field6584[var21 + 1][var20 + 1] = var25;
            }
        }
        class474.field6988 = var12;
        class370.field5493 = var11;
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
    public class75() {
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class75(String arg0) {
        this.field1020 = arg0;
    }
}
