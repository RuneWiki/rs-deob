import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class4 {

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
    public static int[] field75 = new int[5];

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lke;")
    public static class65 field79 = class1.method17("mapmarker", -128);

    @OriginalMember(owner = "client!a", name = "m", descriptor = "[J")
    public static long[] field82 = new long[200];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lke;")
    public static class65 field70 = class1.method17("Keine Antwort vom Anmelde)2Server)3", -115);

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field80 = 20;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field73 = 0;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lke;")
    private static class65 field81 = class1.method17("Please remove ", -126);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lke;")
    public static class65 field72 = field81;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Lke;")
    public static class65 field71 = field81;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lm;")
    public static class75 field74;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjd;Ljd;)V", line = 35)
    public static final void method30(int arg0, class58 arg1, class58 arg2) {
        class13.field290 = arg2;
        class92.field2425 = arg1;
        int var3 = 21 % ((arg0 + 2) / 44);
        field87++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBI)Lkb;", line = 54)
    public static final class61 method31(int arg0, int arg1, byte arg2, int arg3) {
        field77++;
        if (arg1 == 0) {
            class61 var4 = (class61) class77.field2059.method833((byte) -53, (long) arg0);
            if (var4 != null && var4.field1626 != arg3 && var4.field1626 != -1) {
                var4.method133(2);
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        class57 var5 = class81.method715(false, arg0);
        if (var5.field1492 == null) {
            arg3 = -1;
        }
        if (arg3 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg3 >= var5.field1520[var7] && var5.field1520[var7] != 0) {
                    var6 = var5.field1492[var7];
                }
            }
            if (var6 != -1) {
                var5 = class81.method715(false, var6);
            }
        }
        class37 var8 = var5.method463(1, true, false);
        if (var8 == null) {
            return null;
        }
        class61 var9 = null;
        if (var5.field1527 != -1) {
            var9 = method31(var5.field1499, -1, (byte) 118, 10);
            if (var9 == null) {
                return null;
            }
        }
        int[] var10 = class108.field2711;
        int var11 = class108.field2709;
        int var12 = class108.field2706;
        if (arg2 < 87) {
            field74 = null;
        }
        int var13 = class108.field2708;
        int var14 = class108.field2710;
        int var15 = class108.field2707;
        int var16 = class108.field2705;
        int[] var17 = class127.method996();
        int var18 = class127.field3081;
        int var19 = class127.field3070;
        class61 var20 = new class61(32, 32);
        class108.method889(var20.field1623, 32, 32);
        class78.field2064 = class127.method1003(class78.field2064);
        class108.method886(0, 0, 32, 32, 0);
        class127.field3068 = false;
        int var21 = var5.field1479;
        if (arg1 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg1 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = class127.field3079[var5.field1471] * var21 >> 16;
        int var23 = class127.field3074[var5.field1471] * var21 >> 16;
        var8.method272();
        var8.method274(0, var5.field1494, var5.field1487, var5.field1471, var5.field1497, var23 + var8.field118 / 2 + var5.field1480, var5.field1480 + var22);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var31 = 31; var31 >= 0; var31--) {
                if (var20.field1623[var31 * 32 + var24] == 0) {
                    if (var24 > 0 && var20.field1623[var31 * 32 + var24 - 1] > 1) {
                        var20.field1623[var31 * 32 + var24] = 1;
                    } else if (var31 > 0 && var20.field1623[(var31 - 1) * 32 + var24] > 1) {
                        var20.field1623[var31 * 32 + var24] = 1;
                    } else if (var24 < 31 && var20.field1623[var24 + var31 * 32 + 1] > 1) {
                        var20.field1623[var31 * 32 + var24] = 1;
                    } else if (var31 < 31 && var20.field1623[var31 * 32 + var24 + 32] > 1) {
                        var20.field1623[var24 + var31 * 32] = 1;
                    }
                }
            }
        }
        if (arg1 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var20.field1623[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var20.field1623[var26 * 32 + var25 - 1] == 1) {
                            var20.field1623[var26 * 32 + var25] = arg1;
                        } else if (var26 > 0 && var20.field1623[var26 * 32 + var25 - 32] == 1) {
                            var20.field1623[var25 + var26 * 32] = arg1;
                        } else if (var25 < 31 && var20.field1623[var26 * 32 + var25 + 1] == 1) {
                            var20.field1623[var26 * 32 + var25] = arg1;
                        } else if (var26 < 31 && var20.field1623[var25 + (var26 + 1) * 32] == 1) {
                            var20.field1623[var26 * 32 + var25] = arg1;
                        }
                    }
                }
            }
        } else if (arg1 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var20.field1623[var27 + var28 * 32] == 0 && var27 > 0 && var28 > 0 && var20.field1623[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var20.field1623[var27 + var28 * 32] = 3153952;
                    }
                }
            }
        }
        if (var5.field1527 != -1) {
            int var29 = var9.field1626;
            int var30 = var9.field1628;
            var9.field1628 = 32;
            var9.field1626 = 32;
            var9.method507(0, 0);
            var9.field1628 = var30;
            var9.field1626 = var29;
        }
        if (arg1 == 0) {
            class77.field2059.method836((long) arg0, var20, true);
        }
        class108.method889(var10, var11, var12);
        class108.method887(var13, var15, var14, var16);
        class127.method1003(var17);
        class127.field3070 = var19;
        class127.field3081 = var18;
        class127.method1004();
        var20.field1626 = arg3;
        class127.field3068 = true;
        if (var5.field1473) {
            var20.field1628 = 33;
        } else {
            var20.field1628 = 32;
        }
        return var20;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 310)
    public static void method32(int arg0) {
        field74 = null;
        if (arg0 != 32) {
            method32(84);
        }
        field70 = null;
        field75 = null;
        field79 = null;
        field71 = null;
        field81 = null;
        field82 = null;
        field72 = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 333)
    public static final void method33(int arg0) {
        field76++;
        if (arg0 != 2347) {
            method30(25, null, null);
        }
        if (class15.field312.toLowerCase().indexOf("microsoft") != -1) {
            class87.field2322[186] = 57;
            class87.field2322[187] = 27;
            class87.field2322[188] = 71;
            class87.field2322[189] = 26;
            class87.field2322[190] = 72;
            class87.field2322[191] = 73;
            class87.field2322[192] = 58;
            class87.field2322[219] = 42;
            class87.field2322[220] = 74;
            class87.field2322[221] = 43;
            class87.field2322[222] = 59;
            class87.field2322[223] = 28;
            return;
        }
        class87.field2322[44] = 71;
        class87.field2322[45] = 26;
        class87.field2322[46] = 72;
        class87.field2322[47] = 73;
        class87.field2322[59] = 57;
        class87.field2322[61] = 27;
        class87.field2322[91] = 42;
        class87.field2322[92] = 74;
        class87.field2322[93] = 43;
        if (class15.field301 == null) {
            class87.field2322[192] = 58;
            class87.field2322[222] = 59;
        } else {
            class87.field2322[192] = 28;
            class87.field2322[222] = 58;
            class87.field2322[520] = 59;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZIILc;)V", line = 386)
    public static final void method34(int arg0, boolean arg1, int arg2, int arg3, class16 arg4) {
        field85++;
        class92.field2435.method793(-105);
        if (!arg1) {
            field80 = 83;
        }
        class58.field1588.method963(0, 0);
        arg4.method113(class74.field1964, 55, 28, 16777215, true);
        if (arg3 == 0) {
            arg4.method113(class28.field743, 55, 41, 65280, true);
        }
        if (arg3 == 1) {
            arg4.method113(class13.field287, 55, 41, 16776960, true);
        }
        if (arg3 == 2) {
            arg4.method113(class32.field842, 55, 41, 16711680, true);
        }
        if (arg3 == 3) {
            arg4.method113(class57.field1528, 55, 41, 65535, true);
        }
        arg4.method113(class50.field1282, 184, 28, 16777215, true);
        if (arg0 == 0) {
            arg4.method113(class28.field743, 184, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg4.method113(class13.field287, 184, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg4.method113(class32.field842, 184, 41, 16711680, true);
        }
        arg4.method113(class100.field2600, 324, 28, 16777215, true);
        if (arg2 == 0) {
            arg4.method113(class28.field743, 324, 41, 65280, true);
        }
        if (arg2 == 1) {
            arg4.method113(class13.field287, 324, 41, 16776960, true);
        }
        if (arg2 == 2) {
            arg4.method113(class32.field842, 324, 41, 16711680, true);
        }
        arg4.method113(class80.field2137, 458, 33, 16777215, true);
        try {
            Graphics var5 = class10.field210.getGraphics();
            class92.field2435.method790(0, 453, var5, 111);
        } catch (Exception var6) {
            class10.field210.repaint();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BII)I", line = 446)
    public static final int method35(byte arg0, int arg1, int arg2) {
        long var3 = (long) ((arg1 << 16) + arg2);
        field84++;
        if (class114.field2839 != null && class114.field2839.field349 == var3) {
            return arg0 <= 61 ? 55 : class5.field98.field998 * 99 / (class5.field98.field994.length - class114.field2839.field2714) + 1;
        } else {
            return 0;
        }
    }
}
