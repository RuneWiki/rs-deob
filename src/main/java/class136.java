import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class136 {

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Loc;")
    private static class99 field3385 = class48.method402((byte) -104, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Loc;")
    public static class99 field3387 = class48.method402((byte) -104, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Loc;")
    public static class99 field3392 = field3385;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Loc;")
    public static class99 field3396 = field3385;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[Z")
    public static boolean[] field3389 = new boolean[112];

    @OriginalMember(owner = "client!u", name = "l", descriptor = "[[B")
    public static byte[][] field3394 = new byte[250][];

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Loc;")
    private static class99 field3402 = class48.method402((byte) -104, "Loaded gamescreen");

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Loc;")
    public static class99 field3399 = field3402;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Lef;")
    public static class35 field3401;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIBI)I")
    public static final int method1131(int arg0, int arg1, byte arg2, int arg3) {
        field3403++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else {
            int var5 = -109 % ((64 - arg2) / 37);
            return var4 == 2 ? 7 - arg3 : -arg0 + 7;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILoc;IIBLoc;I)V")
    public static final void method1132(int arg0, class99 arg1, int arg2, int arg3, byte arg4, class99 arg5, int arg6) {
        if (arg4 != 21) {
            return;
        }
        if (class144.field3601 < 500) {
            if (arg1.method810(arg4 ^ 0xFFFFFFD3) > 0) {
                class145.field3619[class144.field3601] = class20.method189(new class99[] { arg5, client.field513, arg1 }, 69);
            } else {
                class145.field3619[class144.field3601] = arg5;
            }
            class141.field3486[class144.field3601] = arg2;
            class67.field1710[class144.field3601] = arg3;
            class73.field1854[class144.field3601] = arg6;
            class37.field942[class144.field3601] = arg0;
            class144.field3601++;
        }
        field3386++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method1133(byte arg0) {
        field3389 = null;
        field3385 = null;
        if (arg0 != -10) {
            field3401 = null;
        }
        field3402 = null;
        field3399 = null;
        field3394 = null;
        field3396 = null;
        field3392 = null;
        field3401 = null;
        field3387 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIII)V")
    public static final void method1134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3400++;
        if (class54.field1294 == arg4 && class82.field2040 == arg1 && (class23.field560 == arg0 || !class27.field684)) {
            return;
        }
        class23.field560 = arg0;
        class82.field2040 = arg1;
        class54.field1294 = arg4;
        if (!class27.field684) {
            class23.field560 = 0;
        }
        class73.method663(25, (byte) 52);
        class53.method437(class61.field1638, false, (byte) 67, null);
        int var6 = class67.field1712;
        class67.field1712 = arg4 * 8 - 48;
        int var7 = class5.field120;
        class5.field120 = (arg1 - 6) * 8;
        int var8 = class67.field1712 - var6;
        int var9 = class67.field1712;
        int var10 = class5.field120 - var7;
        int var11 = class5.field120;
        for (int var12 = 0; var12 < 32768; var12++) {
            class149 var28 = class149.field3691[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field3100[var29] -= var8;
                    var28.field3096[var29] -= var10;
                }
                var28.field3077 -= var10 * 128;
                var28.field3115 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class126 var26 = class59.field1571[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field3100[var27] -= var8;
                    var26.field3096[var27] -= var10;
                }
                var26.field3115 -= var8 * 128;
                var26.field3077 -= var10 * 128;
            }
        }
        class84.field2116 = arg0;
        byte var14 = 0;
        if (arg3 < 111) {
            field3396 = null;
        }
        class69.field1770.method1038(false, arg5, 25363, arg2);
        byte var15 = 104;
        byte var16 = 1;
        byte var17 = 0;
        if (var8 < 0) {
            var14 = 103;
            var15 = -1;
            var16 = -1;
        }
        byte var18 = 1;
        byte var19 = 104;
        if (var10 < 0) {
            var19 = -1;
            var17 = 103;
            var18 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var17; var22 != var19; var22 += var18) {
                int var23 = var8 + var20;
                int var24 = var10 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class18.field476[var25][var20][var22] = class18.field476[var25][var23][var24];
                    } else {
                        class18.field476[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class148 var21 = (class148) class105.field2546.method722(114); var21 != null; var21 = (class148) class105.field2546.method716(true)) {
            var21.field3655 -= var8;
            var21.field3668 -= var10;
            if (var21.field3655 < 0 || var21.field3668 < 0 || var21.field3655 >= 104 || var21.field3668 >= 104) {
                var21.method394((byte) 82);
            }
        }
        class14.field352 = -1;
        class31.field748 = 0;
        if (class69.field1765 != 0) {
            class143.field3585 -= var10;
            class69.field1765 -= var8;
        }
        class122.field2982 = false;
        class125.field3010.method714((byte) 76);
        class140.field3466.method714((byte) 76);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lpc;I)V")
    public static final void method1135(class105 arg0, int arg1) {
        class108.field2640 = arg0;
        field3393++;
        if (arg1 != 32) {
            field3387 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
    public static final void method1136(byte arg0) {
        Object var1 = class83.field2072;
        synchronized (class83.field2072) {
            if (class60.field1605 == 0) {
                class43.field1058.method424((byte) 127, new class58(), 5);
            }
            int var2 = 13 / ((arg0 - 29) / 48);
            class60.field1605 = 600;
        }
        field3390++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILhe;)[I")
    public static final int[] method1137(int arg0, class54 arg1) {
        field3383++;
        int var2 = arg1.field1293 >> 16;
        if (!class35.method306((byte) 108, var2)) {
            return null;
        }
        int var3 = arg1.field1356;
        int var4 = arg1.field1324;
        class54 var7;
        for (int var5 = arg1.field1292; var5 != -1; var5 = var7.field1292) {
            var7 = class132.field3230[var2][var5 & 0xFFFF];
            var3 += var7.field1356 - var7.field1378;
            var4 += var7.field1324 - var7.field1296;
        }
        int[] var6 = new int[arg0];
        var6[1] = var3;
        var6[0] = var4;
        return var6;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLef;ILve;)V")
    public static final void method1138(byte arg0, class35 arg1, int arg2, class144 arg3) {
        field3398++;
        class132 var4 = new class132();
        var4.field1138 = arg2;
        var4.field3212 = arg3;
        var4.field3218 = 1;
        var4.field3216 = arg1;
        class83 var5 = class21.field510;
        synchronized (class21.field510) {
            class21.field510.method720(var4, 0);
            if (arg0 != -27) {
                method1133((byte) -125);
            }
        }
        method1136((byte) -97);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIBIIIILhe;)V")
    public static final void method1139(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, class54 arg8) {
        field3388++;
        if (arg3 != -43) {
            return;
        }
        if (class43.field1060) {
            class39.field972 = 32;
        } else {
            class39.field972 = 0;
        }
        class43.field1060 = false;
        if (arg6 >= arg4 && arg6 < arg4 + 16 && arg2 <= arg1 && arg1 < arg2 + 16) {
            if (arg0 == 1) {
                class52.field1243 = true;
            }
            if (arg0 == 2 || arg0 == 3) {
                class113.field2832 = true;
            }
            arg8.field1378 -= class11.field258 * 4;
        } else if (arg4 <= arg6 && arg6 < arg4 + 16 && arg1 >= arg7 + arg2 - 16 && arg2 + arg7 > arg1) {
            if (arg0 == 1) {
                class52.field1243 = true;
            }
            if (arg0 == 2 || arg0 == 3) {
                class113.field2832 = true;
            }
            arg8.field1378 += class11.field258 * 4;
        } else if (arg4 - class39.field972 <= arg6 && arg4 + class39.field972 + 16 > arg6 && arg1 >= arg2 + 16 && arg2 + arg7 - 16 > arg1 && class11.field258 > 0) {
            if (arg0 == 1) {
                class52.field1243 = true;
            }
            class43.field1060 = true;
            if (arg0 == 2 || arg0 == 3) {
                class113.field2832 = true;
            }
            int var9 = (arg7 - 32) * arg7 / arg5;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg1 - var9 / 2 - arg2 - 16;
            int var11 = arg7 - var9 - 32;
            arg8.field1378 = (arg5 - arg7) * var10 / var11;
        }
        if (class27.field673 == 0) {
            return;
        }
        int var12 = arg8.field1383;
        if (arg0 == -1) {
            var12 = 479;
        }
        if (arg4 - var12 > arg6 || arg2 > arg1 || arg6 >= arg4 + 16 || arg1 > arg2 + arg7) {
            return;
        }
        if (arg0 == 1) {
            class52.field1243 = true;
        }
        arg8.field1378 += class27.field673 * 45;
        if (arg0 == 2 || arg0 == 3) {
            class113.field2832 = true;
        }
        return;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(ILhe;)Lhe;")
    public static final class54 method1140(int arg0, class54 arg1) {
        field3391++;
        if (arg0 >= -86) {
            field3394 = null;
        }
        class54 var2 = class143.method1176(arg1, 7226);
        if (var2 == null) {
            var2 = arg1.field1363;
        }
        return var2;
    }
}
