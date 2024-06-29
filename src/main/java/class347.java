import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class347 {

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lfe;")
    public static class270 field5502 = null;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Lvh;")
    public static class62 field5503 = new class62(64);

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field5511 = -1;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Z")
    public static boolean field5512 = true;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "B")
    public byte field5498;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "B")
    public byte field5504;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "B")
    public byte field5505;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "B")
    public byte field5509;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "S")
    public short field5508;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Z")
    public boolean field5493;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Z")
    public boolean field5495;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Z")
    public boolean field5496;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Z")
    public boolean field5500;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Z")
    public boolean field5506;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "[[I")
    public static int[][] field5501;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 4)
    public static void method2405(int arg0) {
        if (arg0 != 637) {
            method2407(72, 108, true, 55, -57, 97, 24, 46, -18, 48, -25);
        }
        field5502 = null;
        field5503 = null;
        field5501 = (int[][]) null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIILio;Lio;IIJ)V", line = 23)
    public static final void method2406(int arg0, int arg1, int arg2, int arg3, class294 arg4, class294 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class123 var10 = new class123();
        var10.field1702 = arg8;
        var10.field1688 = arg1 * 128 + 64;
        var10.field1695 = arg2 * 128 + 64;
        var10.field1698 = arg3;
        var10.field1697 = arg4;
        var10.field1705 = arg5;
        var10.field1690 = arg6;
        var10.field1689 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class194.field2947[var11][arg1][arg2] == null) {
                class194.field2947[var11][arg1][arg2] = new class196(var11, arg1, arg2);
            }
        }
        class194.field2947[arg0][arg1][arg2].field2999 = var10;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZIIIIIIII)V", line = 49)
    public static final void method2407(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5510++;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                class227.field3428[var11][var12] = 0;
                class171.field2606[var11][var12] = 99999999;
            }
        }
        class227.field3428[arg6][arg10] = 99;
        class171.field2606[arg6][arg10] = 0;
        int var13 = arg10;
        if (arg1 != -27669) {
            field5501 = (int[][]) ((int[][]) null);
        }
        int var14 = arg6;
        byte var15 = 0;
        int var16 = 0;
        class291.field4585[var15] = arg6;
        boolean var17 = false;
        int var28 = var15 + 1;
        class63.field761[var15] = arg10;
        int[][] var18 = class247.field3914[class219.field3290].field4156;
        while (var28 != var16) {
            var13 = class63.field761[var16];
            var14 = class291.field4585[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg4 == var14 && arg5 == var13) {
                var17 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class247.field3914[class219.field3290].method1856(1, arg5, var14, arg9 - 1, arg3, (byte) 100, var13, arg4)) {
                    var17 = true;
                    break;
                }
                if (arg9 < 10 && class247.field3914[class219.field3290].method1852(arg9 - 1, arg3, (byte) 126, arg5, var13, 1, var14, arg4)) {
                    var17 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg7 != 0 && class247.field3914[class219.field3290].method1847(arg0, arg5, var14, arg8, var13, arg7, arg4, (byte) -91, 1)) {
                var17 = true;
                break;
            }
            int var19 = class171.field2606[var14][var13] + 1;
            if (var14 > 0 && class227.field3428[var14 - 1][var13] == 0 && (var18[var14 - 1][var13] & 0x2C0108) == 0) {
                class291.field4585[var28] = var14 - 1;
                class63.field761[var28] = var13;
                var28 = var28 + 1 & 0xFFF;
                class227.field3428[var14 - 1][var13] = 2;
                class171.field2606[var14 - 1][var13] = var19;
            }
            if (var14 < 103 && class227.field3428[var14 + 1][var13] == 0 && (var18[var14 + 1][var13] & 0x2C0180) == 0) {
                class291.field4585[var28] = var14 + 1;
                class63.field761[var28] = var13;
                var28 = var28 + 1 & 0xFFF;
                class227.field3428[var14 + 1][var13] = 8;
                class171.field2606[var14 + 1][var13] = var19;
            }
            if (var13 > 0 && class227.field3428[var14][var13 - 1] == 0 && (var18[var14][var13 - 1] & 0x2C0102) == 0) {
                class291.field4585[var28] = var14;
                class63.field761[var28] = var13 - 1;
                class227.field3428[var14][var13 - 1] = 1;
                var28 = var28 + 1 & 0xFFF;
                class171.field2606[var14][var13 - 1] = var19;
            }
            if (var13 < 103 && class227.field3428[var14][var13 + 1] == 0 && (var18[var14][var13 + 1] & 0x2C0120) == 0) {
                class291.field4585[var28] = var14;
                class63.field761[var28] = var13 + 1;
                class227.field3428[var14][var13 + 1] = 4;
                class171.field2606[var14][var13 + 1] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var14 > 0 && var13 > 0 && class227.field3428[var14 - 1][var13 - 1] == 0 && (var18[var14 - 1][var13 - 1] & 0x2C010E) == 0 && (var18[var14 - 1][var13] & 0x2C0108) == 0 && (var18[var14][var13 - 1] & 0x2C0102) == 0) {
                class291.field4585[var28] = var14 - 1;
                class63.field761[var28] = var13 - 1;
                var28 = var28 + 1 & 0xFFF;
                class227.field3428[var14 - 1][var13 - 1] = 3;
                class171.field2606[var14 - 1][var13 - 1] = var19;
            }
            if (var14 < 103 && var13 > 0 && class227.field3428[var14 + 1][var13 - 1] == 0 && (var18[var14 + 1][var13 - 1] & 0x2C0183) == 0 && (var18[var14 + 1][var13] & 0x2C0180) == 0 && (var18[var14][var13 - 1] & 0x2C0102) == 0) {
                class291.field4585[var28] = var14 + 1;
                class63.field761[var28] = var13 - 1;
                class227.field3428[var14 + 1][var13 - 1] = 9;
                class171.field2606[var14 + 1][var13 - 1] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var14 > 0 && var13 < 103 && class227.field3428[var14 - 1][var13 + 1] == 0 && (var18[var14 - 1][var13 + 1] & 0x2C0138) == 0 && (var18[var14 - 1][var13] & 0x2C0108) == 0 && (var18[var14][var13 + 1] & 0x2C0120) == 0) {
                class291.field4585[var28] = var14 - 1;
                class63.field761[var28] = var13 + 1;
                var28 = var28 + 1 & 0xFFF;
                class227.field3428[var14 - 1][var13 + 1] = 6;
                class171.field2606[var14 - 1][var13 + 1] = var19;
            }
            if (var14 < 103 && var13 < 103 && class227.field3428[var14 + 1][var13 + 1] == 0 && (var18[var14 + 1][var13 + 1] & 0x2C01E0) == 0 && (var18[var14 + 1][var13] & 0x2C0180) == 0 && (var18[var14][var13 + 1] & 0x2C0120) == 0) {
                class291.field4585[var28] = var14 + 1;
                class63.field761[var28] = var13 + 1;
                class227.field3428[var14 + 1][var13 + 1] = 12;
                class171.field2606[var14 + 1][var13 + 1] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
        }
        if (!var17) {
            if (!arg2) {
                return;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg4 - var22; var23 <= (arg4 + var22); var23++) {
                for (int var24 = arg5 - var22; var24 <= (arg5 + var22); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class171.field2606[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg4 > var23) {
                            var25 = arg4 - var23;
                        } else if (var23 > (arg8 + arg4 - 1)) {
                            var25 = var23 - (arg4 + arg8 - 1);
                        }
                        int var26 = 0;
                        if (var24 < arg5) {
                            var26 = arg5 - var24;
                        } else if (var24 > (arg5 + arg7 - 1)) {
                            var26 = var24 + 1 - (arg5 + arg7);
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class171.field2606[var23][var24] < var21) {
                            var13 = var24;
                            var20 = var27;
                            var21 = class171.field2606[var23][var24];
                            var14 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return;
            }
            if (arg6 == var14 && arg10 == var13) {
                return;
            }
        }
        class5.field57 = var13;
        class237.field3650 = false;
        class309.field4795 = var14;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)Lja;", line = 301)
    public static final class73 method2408(int arg0) {
        field5499++;
        if (arg0 != 1) {
            return (class73) null;
        }
        try {
            return (class73) Class.forName("ge").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIJ)Z", line = 327)
    public static final boolean method2409(int arg0, int arg1, int arg2, long arg3) {
        field5494++;
        int var5 = ((int) arg3 & 0x7FC2B) >> 14;
        int var6 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        int var7 = (int) arg3 >> 20 & 0x3;
        int var8 = 86 % ((arg1 - 79) / 41);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class234 var9 = class123.method795(0, var6);
            int var10 = var9.field3559;
            int var11;
            int var12;
            if (var7 == 0 || var7 == 2) {
                var12 = var9.field3577;
                var11 = var9.field3590;
            } else {
                var11 = var9.field3577;
                var12 = var9.field3590;
            }
            if (var7 != 0) {
                var10 = (var10 << var7 & 0xF) + (var10 >> 4 - var7);
            }
            class277.method1980(arg0, class11.field113.field3747[0], 0, arg2, true, var11, class11.field113.field3786[0], 0, var10, var12, 2);
        } else {
            class277.method1980(arg0, class11.field113.field3747[0], var7, arg2, true, 0, class11.field113.field3786[0], var5 + 1, 0, 0, 2);
        }
        return true;
    }
}
