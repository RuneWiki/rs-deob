import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class39 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Luf;")
    public static class168 field483 = class148.method1019(-1720, "k");

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field487 = 0;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lej;")
    public static class204 field485 = new class204(50);

    @OriginalMember(owner = "client!me", name = "g", descriptor = "[I")
    public static int[] field488 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Z")
    public static boolean field489 = false;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[[B")
    public static byte[][] field482;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 12)
    public static final void method215(int arg0) {
        if (arg0 == -27197) {
            field491++;
            class142.field2188 = true;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V", line = 30)
    public static void method218(int arg0) {
        field485 = null;
        if (arg0 > -32) {
            method215(53);
        }
        field483 = null;
        field482 = (byte[][]) null;
        field488 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lg;II)I", line = 50)
    public static final int method219(class242 arg0, int arg1, int arg2) {
        field486++;
        if (arg0.field4122 == null || arg1 >= arg0.field4122.length) {
            return -2;
        }
        try {
            int[] var3 = arg0.field4122[arg1];
            if (arg2 < 113) {
                return -107;
            }
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var6++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class144.field2225[var3[var6++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 2) {
                    var8 = class155.field2447[var3[var6++]];
                }
                if (var7 == 3) {
                    var8 = class20.field249[var3[var6++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class242 var12 = class130.method910((byte) -124, var11);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class284.method1963((byte) -106, var13).field3858 || class58.field764)) {
                        for (int var14 = 0; var14 < var12.field4013.length; var14++) {
                            if (var13 + 1 == var12.field4013[var14]) {
                                var8 += var12.field4066[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class122.field1891[var3[var6++]];
                }
                if (var7 == 6) {
                    var8 = class278.field4669[class155.field2447[var3[var6++]] - 1];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 7) {
                    var8 = class122.field1891[var3[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class266.field4489.field696;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class275.field4626[var15]) {
                            var8 += class155.field2447[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class242 var18 = class130.method910((byte) -105, var17);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class284.method1963((byte) 126, var19).field3858 || class58.field764)) {
                        for (int var20 = 0; var20 < var18.field4013.length; var20++) {
                            if ((var19 + 1) == var18.field4013[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class107.field1643;
                }
                if (var7 == 12) {
                    var8 = class117.field1824;
                }
                if (var7 == 13) {
                    int var21 = class122.field1891[var3[var6++]];
                    int var22 = var3[var6++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var6++];
                    var8 = class65.method370(false, var23);
                }
                if (var7 == 18) {
                    var8 = (class266.field4489.field3027 >> 7) + class182.field2916;
                }
                if (var7 == 19) {
                    var8 = (class266.field4489.field3021 >> 7) + class276.field4641;
                }
                if (var7 == 20) {
                    var8 = var3[var6++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var4 += var8;
                    }
                    if (var5 == 1) {
                        var4 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var5 == 3) {
                        var4 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)[B")
    public abstract byte[] method216(int arg0);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BI)V")
    public abstract void method217(byte[] arg0, int arg1);
}
