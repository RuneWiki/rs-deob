import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class589 {

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "Lrt;")
    private class208 field8277 = null;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    private int field8281 = 65000;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "Lrt;")
    private class208 field8279 = null;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    private int field8270;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "[[I")
    public static int[][] field8269 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field8273;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    public static int field8280;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "Lkm;")
    public static class323 field8272;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "Lsea;")
    public static class648 field8274;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "Lhd;")
    public static class689 field8268;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Lkr;")
    public static class693 field8271;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V", line = 5)
    public static void method3343(byte arg0) {
        field8269 = null;
        field8271 = null;
        field8272 = null;
        field8274 = null;
        field8268 = null;
        if (arg0 != 58) {
            method3348(16, -13, -8, false, 55, 96);
        }
    }

    @OriginalMember(owner = "client!sp", name = "toString", descriptor = "()Ljava/lang/String;", line = 25)
    public final String toString() {
        field8278++;
        return "Cache:" + this.field8270;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B[BII)Z", line = 40)
    public final boolean method3344(byte arg0, byte[] arg1, int arg2, int arg3) {
        field8273++;
        if (arg0 > -83) {
            this.method3344((byte) 31, null, -48, 101);
        }
        class208 var5 = this.field8279;
        synchronized (this.field8279) {
            if (arg3 < 0 || arg3 > this.field8281) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method3349(-6097, arg3, arg1, arg2, true);
            if (!var6) {
                var6 = this.method3349(-6097, arg3, arg1, arg2, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(ILrt;Lrt;I)V", line = 550)
    public class589(int arg0, class208 arg1, class208 arg2, int arg3) {
        this.field8277 = arg2;
        this.field8270 = arg0;
        this.field8281 = arg3;
        this.field8279 = arg1;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)[B", line = 73)
    public final byte[] method3345(int arg0, int arg1) {
        field8283++;
        class208 var3 = this.field8279;
        synchronized (this.field8279) {
            try {
                if (((long) (arg0 * 6 + 6)) > this.field8277.method1346(4650)) {
                    return null;
                }
                this.field8277.method1347(true, (long) (arg0 * 6));
                this.field8277.method1350(class44.field538, arg1 + 110, 0, 6);
                int var5 = ((class44.field538[0] & 0xFF) << 16) + (class44.field538[1] & 0xFF << 8) + (class44.field538[2] & 0xFF);
                int var6 = (class44.field538[5] & 0xFF) + ((class44.field538[3] & 0xFF << 16) + (class44.field538[4] & 0xFF << 8));
                if (var5 < 0 || this.field8281 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field8279.method1346(arg1 ^ 0x122D) / 520L) {
                    if (arg1 != 7) {
                        this.field8277 = null;
                    }
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field8279.method1347(true, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field8279.method1350(class44.field538, arg1 ^ 0x40, 0, var13 + 8);
                        int var14 = ((class44.field538[0] & 0xFF) << 8) + (class44.field538[1] & 0xFF);
                        int var15 = ((class44.field538[2] & 0xFF) << 8) + (class44.field538[3] & 0xFF);
                        int var16 = ((class44.field538[4] & 0xFF) << 16) + (class44.field538[6] & 0xFF) + ((class44.field538[5] & 0xFF) << 8);
                        int var17 = class44.field538[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field8270 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field8279.method1346(arg1 + 4643) / 520L)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class44.field538[var20 + 8];
                                }
                                var6 = var16;
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB)I", line = 159)
    public static final int method3346(int arg0, byte arg1) {
        field8275++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else {
            if (arg1 >= -66) {
                method3343((byte) 114);
            }
            if (arg0 != 6402) {
                throw new IllegalArgumentException("");
            }
            return 6402;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIILnn;IIIIIII)Z", line = 196)
    public static final boolean method3347(int arg0, int arg1, int arg2, class380 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field8282++;
        int var11 = arg6;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        int var16 = arg9 - var14;
        class675.field9527[var13][var14] = 99;
        class182.field2634[var13][var14] = 0;
        byte var17 = 0;
        class341.field4577[var17] = arg6;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class72.field957[var10001] = arg9;
        int[][] var19 = arg3.field5064;
        if (arg8 > -90) {
            field8272 = null;
        }
        while (var26 != var18) {
            var11 = class341.field4577[var18];
            var12 = class72.field957[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg3.field5069;
            int var23 = var12 - arg3.field5070;
            if (arg2 == -4) {
                if (arg0 == var11 && arg1 == var12) {
                    class185.field2683 = var11;
                    class16.field166 = var12;
                    return true;
                }
            } else if (arg2 == -3) {
                if (class576.method3291(94, var11, 2, arg0, 2, arg4, arg10, var12, arg1)) {
                    class16.field166 = var12;
                    class185.field2683 = var11;
                    return true;
                }
            } else if (arg2 == -2) {
                if (arg3.method2174(arg0, arg10, var11, var12, arg4, arg5, 2, 45, 2, arg1)) {
                    class16.field166 = var12;
                    class185.field2683 = var11;
                    return true;
                }
            } else if (arg2 == -1) {
                if (arg3.method2186(arg5, var12, arg1, arg10, arg4, false, var11, 2, arg0)) {
                    class16.field166 = var12;
                    class185.field2683 = var11;
                    return true;
                }
            } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                if (arg3.method2172(var11, arg7, arg2, arg0, arg1, var12, -59, 2)) {
                    class185.field2683 = var11;
                    class16.field166 = var12;
                    return true;
                }
            } else if (arg3.method2185(-125, 2, var12, arg7, arg0, arg2, arg1, var11)) {
                class185.field2683 = var11;
                class16.field166 = var12;
                return true;
            }
            int var25 = class182.field2634[var21][var20] + 1;
            if (var21 > 0 && class675.field9527[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class341.field4577[var26] = var11 - 1;
                class72.field957[var26] = var12;
                class675.field9527[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class182.field2634[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class675.field9527[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class341.field4577[var26] = var11 + 1;
                class72.field957[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class675.field9527[var21 + 1][var20] = 8;
                class182.field2634[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class675.field9527[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class341.field4577[var26] = var11;
                class72.field957[var26] = var12 - 1;
                class675.field9527[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class182.field2634[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class675.field9527[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class341.field4577[var26] = var11;
                class72.field957[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class675.field9527[var21][var20 + 1] = 4;
                class182.field2634[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class675.field9527[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class341.field4577[var26] = var11 - 1;
                class72.field957[var26] = var12 - 1;
                class675.field9527[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class182.field2634[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class675.field9527[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class341.field4577[var26] = var11 + 1;
                class72.field957[var26] = var12 - 1;
                class675.field9527[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class182.field2634[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class675.field9527[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class341.field4577[var26] = var11 - 1;
                class72.field957[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class675.field9527[var21 - 1][var20 + 1] = 6;
                class182.field2634[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class675.field9527[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class341.field4577[var26] = var11 + 1;
                class72.field957[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class675.field9527[var21 + 1][var20 + 1] = 12;
                class182.field2634[var21 + 1][var20 + 1] = var25;
            }
        }
        class185.field2683 = var11;
        class16.field166 = var12;
        return false;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIZII)V", line = 563)
    public static final void method3348(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field8280++;
        if (!arg3) {
            method3347(43, 62, 109, null, 72, -35, -69, -83, 81, -68, -97);
        }
        if (class366.field4875.field9346 != 0 && arg2 != 0 && class166.field2420 < 50 && arg5 != -1) {
            class130.field1873[class166.field2420++] = new class437((byte) 1, arg5, arg2, arg0, arg1, 0, arg4, null);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II[BIZ)Z", line = 581)
    private final boolean method3349(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        field8276++;
        class208 var6 = this.field8279;
        synchronized (this.field8279) {
            try {
                int var8;
                if (arg4) {
                    if ((long) (arg3 * 6 + 6) > this.field8277.method1346(arg0 ^ 0xFFFFFA05)) {
                        return false;
                    }
                    this.field8277.method1347(true, (long) (arg3 * 6));
                    this.field8277.method1350(class44.field538, -121, 0, 6);
                    var8 = (class44.field538[5] & 0xFF) + (class44.field538[4] & 0xFF << 8) + (class44.field538[3] & 0xFF << 16);
                    if (var8 <= 0 || (this.field8279.method1346(4650) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field8279.method1346(4650) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class44.field538[2] = (byte) arg1;
                class44.field538[5] = (byte) var8;
                class44.field538[0] = (byte) (arg1 >> 16);
                class44.field538[3] = (byte) (var8 >> 16);
                class44.field538[1] = (byte) (arg1 >> 8);
                class44.field538[4] = (byte) (var8 >> 8);
                this.field8277.method1347(true, (long) (arg3 * 6));
                this.field8277.method1345(0, class44.field538, 6, (byte) -12);
                int var10 = 0;
                if (arg0 != -6097) {
                    field8272 = null;
                }
                int var11 = 0;
                while (arg1 > var10) {
                    int var12 = 0;
                    if (arg4) {
                        label108: {
                            this.field8279.method1347(true, (long) (var8 * 520));
                            try {
                                this.field8279.method1350(class44.field538, -119, 0, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class44.field538[0] & 0xFF) << 8) + (class44.field538[1] & 0xFF);
                            var12 = (class44.field538[6] & 0xFF) + (((class44.field538[4] & 0xFF) << 16) + ((class44.field538[5] & 0xFF) << 8));
                            int var14 = (class44.field538[2] & 0xFF << 8) + (class44.field538[3] & 0xFF);
                            int var15 = class44.field538[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field8270 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field8279.method1346(4650) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field8279.method1346(4650) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class44.field538[3] = (byte) var11;
                    class44.field538[2] = (byte) (var11 >> 8);
                    class44.field538[0] = (byte) (arg3 >> 8);
                    class44.field538[1] = (byte) arg3;
                    class44.field538[6] = (byte) var12;
                    class44.field538[5] = (byte) (var12 >> 8);
                    class44.field538[4] = (byte) (var12 >> 16);
                    class44.field538[7] = (byte) this.field8270;
                    this.field8279.method1347(true, (long) (var8 * 520));
                    this.field8279.method1345(0, class44.field538, 8, (byte) -12);
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field8279.method1345(var10, arg2, var18, (byte) -12);
                    var10 += var18;
                    var11++;
                    var8 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }
}
