import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class296 {

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
    public static int[] field4530 = new int[32];

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Z")
    public static boolean field4534 = false;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[Lkd;")
    public static class119[] field4537 = new class119[4];

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "[[B")
    public static byte[][] field4539 = new byte[250][];

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lli;")
    public static class182 field4540;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lt;")
    public static class293 field4529;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ISJIILjava/lang/String;Ljava/lang/String;I)V", line = 5)
    public static final void method2062(int arg0, short arg1, long arg2, int arg3, int arg4, String arg5, String arg6, int arg7) {
        if (arg4 != 100) {
            field4539 = (byte[][]) ((byte[][]) null);
        }
        field4535++;
        if (class5.field27 || class190.field2829 >= 500) {
            return;
        }
        class307.field4677[class190.field2829] = arg6;
        class180.field2686[class190.field2829] = arg5;
        class155.field2322[class190.field2829] = arg7 == -1 ? class156.field2330 : arg7;
        class201.field2998[class190.field2829] = arg1;
        class13.field153[class190.field2829] = arg2;
        class193.field2893[class190.field2829] = arg0;
        class178.field2633[class190.field2829] = arg3;
        class190.field2829++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V", line = 32)
    public static void method2063(boolean arg0) {
        field4539 = (byte[][]) null;
        field4529 = null;
        field4540 = null;
        field4530 = null;
        field4537 = null;
        if (!arg0) {
            method2065(82, -4, -103, 27, -87, (class191[]) null, -32, 67, 83, (byte[]) null, true);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 46)
    public static final void method2064(int arg0) {
        if (arg0 != -24177) {
            field4537 = (class119[]) null;
        }
        field4528++;
        class192.field2875.method2182(false);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII[Lla;III[BZ)V", line = 63)
    public static final void method2065(int arg0, int arg1, int arg2, int arg3, int arg4, class191[] arg5, int arg6, int arg7, int arg8, byte[] arg9, boolean arg10) {
        class263 var11 = new class263(arg9);
        field4532++;
        int var12 = -1;
        if (arg6 != -20080) {
            method2062(-61, (short) -85, 109L, 70, 86, (String) null, (String) null, 36);
        }
        while (true) {
            int var13 = var11.method1846((byte) -115);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1832(-32768);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method1787(false);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg0 == var18 && arg8 <= var17 && var17 < (arg8 + 8) && arg4 <= var16 && (arg4 + 8) > var16) {
                    class22 var22 = class284.method1980(var12, (byte) 120);
                    int var23 = arg2 + class42.method282(var20, var22.field293, var16 & 0x7, var17 & 0x7, arg1, var22.field330, 15726);
                    int var24 = arg7 + class325.method2220(var17 & 0x7, arg1, var22.field330, -209, var20, var16 & 0x7, var22.field293);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class191 var25 = null;
                        if (!arg10) {
                            int var26 = arg3;
                            if ((class179.field2645[1][var23][var24] & 0x2) == 2) {
                                var26 = arg3 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class241.method1635(var12, arg1 + var20 & 0x3, arg3, 31325, var23, var25, arg10, !arg10, var21, var24, arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIII)V", line = 145)
    public static final void method2066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class117.field1817) {
            int var8 = arg3 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class54.field678 - class192.field2886) * var8 / 100 + class192.field2886;
            arg5 = arg5 * var9 >> 8;
        }
        field4538++;
        int var10 = 2048 - arg0 & 0x7FF;
        if (arg2 <= 47) {
            method2064(13);
        }
        int var11 = 2048 - arg4 & 0x7FF;
        int var12 = 0;
        int var13 = arg5;
        if (var11 != 0) {
            int var14 = class148.field2239[var11];
            var12 = -arg5 * var14 >> 16;
            int var15 = class148.field2229[var11];
            var13 = arg5 * var15 >> 16;
        }
        int var16 = 0;
        if (var10 != 0) {
            int var17 = class148.field2229[var10];
            int var18 = class148.field2239[var10];
            var16 = var13 * var18 >> 16;
            var13 = var13 * var17 >> 16;
        }
        class160.field2392 = arg4;
        class302.field4612 = arg1 - var16;
        class84.field1249 = arg0;
        class287.field4338 = arg7 - var12;
        class203.field3052 = arg6 - var13;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)I", line = 216)
    public static final int method2067(byte arg0) {
        if (arg0 != -21) {
            method2066(-35, 123, 106, -48, 62, -118, 54, -40);
        }
        field4531++;
        return 15;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 229)
    public static final void method2068(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class326.field4913[var1] = false;
        }
        class69.field915 = -1;
        if (arg0 != -61) {
            method2063(false);
        }
        class56.field710 = 1;
        field4536++;
        class41.field500 = -1;
        class43.field528 = 0;
        class205.field3089 = 0;
    }
}
