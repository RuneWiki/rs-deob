import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class278 extends class240 {

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    private int field4169;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    private int field4174;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
    private int field4176;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    private int field4177;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    private int field4172;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    private int field4171;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
    private int field4170;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
    private int field4182;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public static int field4179 = 0;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "[[Ltk;")
    public static class268[][] field4175;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V", line = 4)
    public final void method499(int arg0, int arg1, int arg2) {
        if (arg1 != 6893) {
            method1926(-82, (String) null);
        }
        field4181++;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V", line = 17)
    public static void method1925(int arg0) {
        field4175 = (class268[][]) null;
        if (arg0 != 896) {
            field4179 = -82;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/lang/String;)V", line = 30)
    public static final void method1926(int arg0, String arg1) {
        field4166++;
        int var2 = class247.method1693(arg1, true);
        if (var2 != -1) {
            int[] var3 = class135.field1864.method2024((class132.field1811.field2389[var2] & 0xFFFE2D1) >> 14, (byte) 93, class132.field1811.field2389[var2] & arg0, (class132.field1811.field2389[var2] & 0x312D239F) >> 28);
            class90.method688((byte) -53, var3[1], var3[2]);
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(III)V", line = 46)
    public final void method501(int arg0, int arg1, int arg2) {
        int var4 = this.field4171 * arg1 >> 12;
        field4178++;
        int var5 = this.field4170 * arg2 >> 12;
        int var6 = this.field4176 * arg1 >> 12;
        int var7 = this.field4174 * arg2 >> 12;
        int var8 = this.field4177 * arg2 >> 12;
        int var9 = this.field4169 * arg1 >> 12;
        if (arg0 == -4621) {
            int var10 = this.field4172 * arg1 >> 12;
            int var11 = this.field4182 * arg2 >> 12;
            class254.method1734(var11, var7, (byte) -116, var10, var6, this.field3401, var4, var9, var5, var8);
        }
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(III)I", line = 74)
    public static final int method1927(int arg0, int arg1, int arg2) {
        field4168++;
        int var3 = class155.method1125(4, arg1 + 91923, -32, arg0 + 45365) + (-(-(class155.method1125(2, arg1 + 37821, -32, arg0 + 10294) - 128 >> 1) - (class155.method1125(1, arg1, -32, arg0) - 128 >> 2)) - 128);
        if (arg2 <= 8) {
            return 3;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 96)
    public class278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4169 = arg4;
        this.field4174 = arg3;
        this.field4176 = arg2;
        this.field4177 = arg5;
        this.field4172 = arg6;
        this.field4171 = arg0;
        this.field4170 = arg1;
        this.field4182 = arg7;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZ)V", line = 117)
    public static final void method1928(int arg0, boolean arg1) {
        byte[][] var2;
        if (class67.field908 && arg1) {
            var2 = class231.field3270;
        } else {
            var2 = class41.field468;
        }
        int var3 = class37.field425.length;
        field4173++;
        if (arg0 != 128) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class256.field3702[var4] >> 8) * 64 - class132.field1809;
                int var7 = (class256.field3702[var4] & 0xFF) * 64 - class296.field4394;
                class15.method98(-105);
                class166.method1182(var6, var7, 110, class312.field4714, arg1, var5);
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(ILjava/lang/String;)I", line = 159)
    public static final int method1929(int arg0, String arg1) {
        field4184++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class44.field535; var2++) {
            if (arg1.equalsIgnoreCase(class207.field2986[var2])) {
                return var2;
            }
        }
        if (arg0 != -29502) {
            field4179 = -99;
        }
        return -1;
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(III)V", line = 187)
    public final void method495(int arg0, int arg1, int arg2) {
        if (arg2 != 24998) {
            field4179 = 125;
        }
        field4180++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILq;IIIIIIIZIIILom;)Lq;", line = 199)
    public static final class345 method1930(int arg0, class345 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, class125 arg13) {
        field4183++;
        long var14 = ((long) arg10 << 48) + (long) ((arg3 << 24) + arg11 + (arg0 << 16)) + ((long) arg7 << 32);
        class345 var16 = (class345) class153.field2126.method716(var14, false);
        if (var16 == null) {
            byte var17;
            if (arg11 == 1) {
                var17 = 9;
            } else if (arg11 == 2) {
                var17 = 12;
            } else if (arg11 == 3) {
                var17 = 15;
            } else if (arg11 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            class308 var19 = new class308(var17 * var18 + 1, var18 * 2 * var17 + -var17, 0);
            int[] var20 = new int[] { 64, 96, 128 };
            int var21 = var19.method2096(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var20[var23];
                int var25 = var20[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class184.field2538[var27] * var24 + arg5 >> 16;
                    int var29 = class184.field2532[var27] * var25 + arg2 >> 16;
                    var22[var23][var26] = var19.method2096(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                short var33 = (short) (((arg7 & 0x7F) * var32 + (arg10 & 0x7F) * var31 & 0x7F00) + ((arg7 & 0x380) * var32 + (arg10 & 0x380) * var31 & 0x38000) + ((arg7 & 0xFC00) * var32 + (arg10 & 0xFC00) * var31 & 0xFC0000) >> 8);
                byte var34 = (byte) (arg0 * var32 + arg3 * var31 >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var19.method2103(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var33, var34);
                    } else {
                        var19.method2103(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var33, var34);
                        var19.method2103(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var19.method2097(64, 768, -50, -10, -50);
            class153.field2126.method721(var14, var16, arg8 - 128);
        }
        int var36 = arg11 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = -var36;
        int var40 = arg1.method316();
        int var41 = var36;
        if (arg9) {
            if (arg12 > 1152 && arg12 < 1920) {
                var38 = var36 + 128;
            }
            if (arg12 > 1664 || arg12 < 384) {
                var39 -= 128;
            }
            if (arg12 > 640 && arg12 < 1408) {
                var41 = var36 + 128;
            }
            if (arg12 > 128 && arg12 < 896) {
                var37 -= 128;
            }
        }
        int var42 = arg1.method347();
        if (var38 < var42) {
            var42 = var38;
        }
        int var43 = arg1.method313();
        int var44 = arg1.method343();
        if (arg8 != 128) {
            field4179 = -43;
        }
        if (var40 < var37) {
            var40 = var37;
        }
        if (var44 > var41) {
            var44 = var41;
        }
        class52 var45 = null;
        if (var43 < var39) {
            var43 = var39;
        }
        if (arg13 != null) {
            int var46 = arg13.field1707[arg6];
            var45 = class168.method1189(1, var46 >> 16);
            arg6 = var46 & 0xFFFF;
        }
        class345 var47;
        if (var45 == null) {
            var47 = var16.method323(true, true, true);
            var47.method332((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method334((var40 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method323(!var45.method359(arg6, -12124), !var45.method357(arg8 ^ 0xFFFFFF7F, arg6), true);
            var47.method332((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method334((var40 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method2388(var45, arg6);
        }
        if (arg12 != 0) {
            var47.method335(arg12);
        }
        if (class67.field908) {
            class267 var48 = (class267) var47;
            if (arg4 != class135.method985(arg2 + var43, class251.field3603, arg5 + var40, (byte) -111) || class135.method985(arg2 + var44, class251.field3603, arg5 + var42, (byte) -91) != arg4) {
                for (int var49 = 0; var49 < var48.field3894; var49++) {
                    var48.field3916[var49] += class135.method985(var48.field3886[var49] + arg2, class251.field3603, var48.field3904[var49] + arg5, (byte) -103) - arg4;
                }
                var48.field3890.field5120 = false;
                var48.field3915.field3065 = false;
            }
        } else {
            class50 var50 = (class50) var47;
            if (class135.method985(arg2 + var43, class251.field3603, arg5 + var40, (byte) -123) != arg4 || arg4 != class135.method985(arg2 + var44, class251.field3603, arg5 + var42, (byte) -119)) {
                for (int var51 = 0; var51 < var50.field609; var51++) {
                    var50.field642[var51] += class135.method985(var50.field611[var51] + arg2, class251.field3603, var50.field638[var51] + arg5, (byte) -116) - arg4;
                }
                var50.field629 = false;
            }
        }
        return var47;
    }
}
