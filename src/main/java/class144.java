import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class144 {

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Loj;")
    private class155 field2731 = null;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Loj;")
    private class155 field2734 = null;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    private int field2737 = 65000;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    private int field2728;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Ljd;")
    public static class86 field2724 = class122.method868("Konfig geladen)3", true);

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[I")
    public static int[] field2729 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Ljd;")
    public static class86 field2735 = class122.method868("Bitte entfernen Sie ", true);

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Ljd;")
    public static class86 field2727 = class122.method868("null", true);

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Z")
    public static volatile boolean field2739 = false;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "[[[B")
    public static byte[][][] field2732;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static final void method1022(byte arg0) {
        if (arg0 != -124) {
            return;
        }
        if (class205.field3698 == null || class237.field4277 == null) {
            class205.field3698 = new int[256];
            class237.field4277 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class205.field3698[var1] = (int) (Math.sin(var2) * 4096.0D);
                class237.field4277[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field2723++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIILeh;Leh;IIJ)V")
    public static final void method1023(int arg0, int arg1, int arg2, int arg3, class80 arg4, class80 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class221 var10 = new class221();
        var10.field3978 = arg8;
        var10.field3977 = arg1 * 128 + 64;
        var10.field3975 = arg2 * 128 + 64;
        var10.field3967 = arg3;
        var10.field3966 = arg4;
        var10.field3976 = arg5;
        var10.field3981 = arg6;
        var10.field3970 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class248.field4406[var11][arg1][arg2] == null) {
                class248.field4406[var11][arg1][arg2] = new class249(var11, arg1, arg2);
            }
        }
        class248.field4406[arg0][arg1][arg2].field4435 = var10;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILwj;BI)V")
    public static final void method1024(int arg0, class6 arg1, byte arg2, int arg3) {
        field2721++;
        if (arg1.field168 == 0) {
            arg1.field158 = arg1.field202;
        } else if (arg1.field168 == 1) {
            arg1.field158 = (arg3 - arg1.field131) / 2 + arg1.field202;
        } else if (arg1.field168 == 2) {
            arg1.field158 = arg3 - arg1.field131 - arg1.field202;
        } else if (arg1.field168 == 3) {
            arg1.field158 = arg1.field202 * arg3 >> 14;
        } else if (arg1.field168 == 4) {
            arg1.field158 = (arg3 - arg1.field131) / 2 + (arg1.field202 * arg3 >> 14);
        } else {
            arg1.field158 = arg3 - (arg1.field202 * arg3 >> 14) - arg1.field131;
        }
        if (arg1.field182 == 0) {
            arg1.field117 = arg1.field87;
        } else if (arg1.field182 == 1) {
            arg1.field117 = (arg0 - arg1.field163) / 2 + arg1.field87;
        } else if (arg1.field182 == 2) {
            arg1.field117 = arg0 - arg1.field87 - arg1.field163;
        } else if (arg1.field182 == 3) {
            arg1.field117 = arg1.field87 * arg0 >> 14;
        } else if (arg1.field182 == 4) {
            arg1.field117 = (arg0 - arg1.field163) / 2 + (arg1.field87 * arg0 >> 14);
        } else {
            arg1.field117 = arg0 - arg1.field163 - (arg1.field87 * arg0 >> 14);
        }
        if (arg2 < 120 || !class180.field3251) {
            return;
        }
        if (client.method1111(arg1) == 0 && arg1.field184 != 0) {
            return;
        }
        if (arg1.field158 < 0) {
            arg1.field158 = 0;
        } else if (arg1.field158 + arg1.field131 > arg3) {
            arg1.field158 = arg3 - arg1.field131;
        }
        if (arg1.field117 < 0) {
            arg1.field117 = 0;
            return;
        }
        if (arg0 < (arg1.field163 + arg1.field117)) {
            arg1.field117 = arg0 - arg1.field163;
            return;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[BZI)Z")
    private final boolean method1025(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field2722++;
        class155 var6 = this.field2734;
        synchronized (this.field2734) {
            try {
                int var7 = 57 % ((-arg1 - 2) / 56);
                int var8;
                if (arg3) {
                    if (this.field2731.method1129(2408) < (long) (arg0 * 6 + 6)) {
                        return false;
                    }
                    this.field2731.method1135(true, (long) (arg0 * 6));
                    this.field2731.method1132(-125, class105.field2008, 0, 6);
                    var8 = ((class105.field2008[3] & 0xFF) << 16) + (class105.field2008[4] & 0xFF << 8) + (class105.field2008[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field2734.method1129(2408) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2734.method1129(2408) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class105.field2008[3] = (byte) (var8 >> 16);
                class105.field2008[5] = (byte) var8;
                class105.field2008[1] = (byte) (arg4 >> 8);
                class105.field2008[4] = (byte) (var8 >> 8);
                class105.field2008[0] = (byte) (arg4 >> 16);
                int var11 = 0;
                int var12 = 0;
                class105.field2008[2] = (byte) arg4;
                this.field2731.method1135(true, (long) (arg0 * 6));
                this.field2731.method1131(0, class105.field2008, 82, 6);
                while (var11 < arg4) {
                    int var13 = 0;
                    if (arg3) {
                        label105: {
                            this.field2734.method1135(true, (long) (var8 * 520));
                            try {
                                this.field2734.method1132(-90, class105.field2008, 0, 8);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = ((class105.field2008[4] & 0xFF) << 16) - (-(class105.field2008[5] & 0xFF << 8) - (class105.field2008[6] & 0xFF));
                            int var14 = (class105.field2008[0] & 0xFF << 8) + (class105.field2008[1] & 0xFF);
                            int var15 = class105.field2008[7] & 0xFF;
                            int var16 = ((class105.field2008[2] & 0xFF) << 8) + (class105.field2008[3] & 0xFF);
                            if (arg0 == var14 && var12 == var16 && this.field2728 == var15) {
                                if (var13 >= 0 && (this.field2734.method1129(2408) / 520L) >= ((long) var13)) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field2734.method1129(2408) + 519L) / 520L);
                        arg3 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class105.field2008[3] = (byte) var12;
                    class105.field2008[7] = (byte) this.field2728;
                    if (arg4 - var11 <= 512) {
                        var13 = 0;
                    }
                    class105.field2008[0] = (byte) (arg0 >> 8);
                    class105.field2008[1] = (byte) arg0;
                    class105.field2008[6] = (byte) var13;
                    class105.field2008[2] = (byte) (var12 >> 8);
                    class105.field2008[5] = (byte) (var13 >> 8);
                    class105.field2008[4] = (byte) (var13 >> 16);
                    this.field2734.method1135(true, (long) (var8 * 520));
                    this.field2734.method1131(0, class105.field2008, 121, 8);
                    var12++;
                    var8 = var13;
                    int var19 = arg4 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field2734.method1131(var11, arg2, 114, var19);
                    var11 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1026(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class157.method1143(21520, arg6);
        int var7 = 0;
        if (arg1 != -105) {
            field2724 = null;
        }
        field2730++;
        int var8 = arg6 - arg2;
        int var9 = arg6;
        int var10 = -arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var11 = var8;
        int var12 = -1;
        if (class50.field1050 <= arg5 && class56.field1143 >= arg5) {
            int[] var13 = class249.field4420[arg5];
            int var14 = class171.method1221(class129.field2473, class49.field1044, 21419, arg3 - arg6);
            int var15 = class171.method1221(class129.field2473, class49.field1044, arg1 ^ 0xFFFFAC3C, arg3 + arg6);
            int var16 = class171.method1221(class129.field2473, class49.field1044, 21419, arg3 - var8);
            int var17 = class171.method1221(class129.field2473, class49.field1044, 21419, arg3 + var8);
            class56.method412(arg4, (byte) -123, var16, var13, var14);
            class56.method412(arg0, (byte) -104, var17, var13, var16);
            class56.method412(arg4, (byte) -106, var15, var13, var17);
        }
        int var18 = -var8;
        int var19 = -1;
        while (var9 > var7) {
            var12 += 2;
            var18 += var12;
            var19 += 2;
            if (var18 >= 0 && var11 >= 1) {
                var11--;
                var18 -= var11 << 1;
                class267.field4707[var11] = var7;
            }
            var7++;
            var10 += var19;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg5 + var9;
                int var21 = arg5 - var9;
                if (var20 >= class50.field1050 && var21 <= class56.field1143) {
                    if (var8 <= var9) {
                        int var22 = class171.method1221(class129.field2473, class49.field1044, 21419, arg3 + var7);
                        int var23 = class171.method1221(class129.field2473, class49.field1044, arg1 + 21524, -var7 + arg3);
                        if (class56.field1143 >= var20) {
                            class56.method412(arg4, (byte) -120, var22, class249.field4420[var20], var23);
                        }
                        if (class50.field1050 <= var21) {
                            class56.method412(arg4, (byte) -99, var22, class249.field4420[var21], var23);
                        }
                    } else {
                        int var24 = class267.field4707[var9];
                        int var25 = class171.method1221(class129.field2473, class49.field1044, 21419, arg3 + var7);
                        int var26 = class171.method1221(class129.field2473, class49.field1044, 21419, arg3 - var7);
                        int var27 = class171.method1221(class129.field2473, class49.field1044, 21419, arg3 + var24);
                        int var28 = class171.method1221(class129.field2473, class49.field1044, 21419, arg3 - var24);
                        if (var20 <= class56.field1143) {
                            int[] var29 = class249.field4420[var20];
                            class56.method412(arg4, (byte) -94, var28, var29, var26);
                            class56.method412(arg0, (byte) -103, var27, var29, var28);
                            class56.method412(arg4, (byte) -108, var25, var29, var27);
                        }
                        if (class50.field1050 <= var21) {
                            int[] var30 = class249.field4420[var21];
                            class56.method412(arg4, (byte) -114, var28, var30, var26);
                            class56.method412(arg0, (byte) -121, var27, var30, var28);
                            class56.method412(arg4, (byte) -100, var25, var30, var27);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (class50.field1050 <= var32 && class56.field1143 >= var31) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (class49.field1044 <= var33 && class129.field2473 >= var34) {
                    int var35 = class171.method1221(class129.field2473, class49.field1044, 21419, var33);
                    int var36 = class171.method1221(class129.field2473, class49.field1044, 21419, var34);
                    if (var8 > var7) {
                        int var37 = var7 > var11 ? class267.field4707[var7] : var11;
                        int var38 = class171.method1221(class129.field2473, class49.field1044, 21419, arg3 + var37);
                        int var39 = class171.method1221(class129.field2473, class49.field1044, 21419, arg3 - var37);
                        if (class56.field1143 >= var32) {
                            int[] var40 = class249.field4420[var32];
                            class56.method412(arg4, (byte) -112, var39, var40, var36);
                            class56.method412(arg0, (byte) -128, var38, var40, var39);
                            class56.method412(arg4, (byte) -128, var35, var40, var38);
                        }
                        if (class50.field1050 <= var31) {
                            int[] var41 = class249.field4420[var31];
                            class56.method412(arg4, (byte) -127, var39, var41, var36);
                            class56.method412(arg0, (byte) -95, var38, var41, var39);
                            class56.method412(arg4, (byte) -99, var35, var41, var38);
                        }
                    } else {
                        if (var32 <= class56.field1143) {
                            class56.method412(arg4, (byte) -115, var35, class249.field4420[var32], var36);
                        }
                        if (var31 >= class50.field1050) {
                            class56.method412(arg4, (byte) -93, var35, class249.field4420[var31], var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2736++;
        return "Cache:" + this.field2728;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)[B")
    public final byte[] method1027(byte arg0, int arg1) {
        field2740++;
        if (arg0 > -10) {
            method1024(19, (class6) null, (byte) 31, 12);
        }
        class155 var3 = this.field2734;
        synchronized (this.field2734) {
            try {
                if (this.field2731.method1129(2408) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field2731.method1135(true, (long) (arg1 * 6));
                this.field2731.method1132(-99, class105.field2008, 0, 6);
                int var5 = (class105.field2008[3] & 0xFF << 16) + (class105.field2008[4] & 0xFF << 8) + (class105.field2008[5] & 0xFF);
                int var6 = (class105.field2008[2] & 0xFF) + ((class105.field2008[0] & 0xFF) << 16) + (class105.field2008[1] & 0xFF << 8);
                if (var6 < 0 || var6 > this.field2737) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field2734.method1129(2408) / 520L) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    while (var6 > var11) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field2734.method1135(true, (long) (var5 * 520));
                        int var13 = var6 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2734.method1132(-99, class105.field2008, 0, var13 + 8);
                        int var14 = (class105.field2008[0] & 0xFF << 8) + (class105.field2008[1] & 0xFF);
                        int var15 = (class105.field2008[4] & 0xFF << 16) + (class105.field2008[5] & 0xFF << 8) + (class105.field2008[6] & 0xFF);
                        int var16 = class105.field2008[7] & 0xFF;
                        int var17 = (class105.field2008[2] & 0xFF << 8) + (class105.field2008[3] & 0xFF);
                        if (arg1 == var14 && var10 == var17 && this.field2728 == var16) {
                            if (var15 >= 0 && ((long) var15) <= (this.field2734.method1129(2408) / 520L)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var11++] = class105.field2008[var20 + 8];
                                }
                                var5 = var15;
                                var10++;
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

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method1028(int arg0) {
        field2729 = null;
        field2727 = null;
        field2735 = null;
        field2732 = null;
        if (arg0 != 4) {
            field2727 = null;
        }
        field2724 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[BII)Z")
    public final boolean method1029(int arg0, byte[] arg1, int arg2, int arg3) {
        field2733++;
        class155 var5 = this.field2734;
        synchronized (this.field2734) {
            if (arg2 < 0 || this.field2737 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1025(arg3, arg0 - 162, arg1, true, arg2);
            if (!var6) {
                var6 = this.method1025(arg3, 92, arg1, false, arg2);
            }
            return arg0 == 93 ? var6 : true;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(ILoj;Loj;I)V")
    public class144(int arg0, class155 arg1, class155 arg2, int arg3) {
        this.field2731 = arg2;
        this.field2734 = arg1;
        this.field2728 = arg0;
        this.field2737 = arg3;
    }
}
