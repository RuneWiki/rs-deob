import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class208 extends class4 {

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    private int field3083 = -32768;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field3085 = 127;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Z")
    public static boolean field3075 = false;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "[I")
    public static int[] field3087 = new int[100];

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public int field3077;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Ll;")
    public static class10 field3084;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Llc;")
    public static class270 field3082;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static void method1470(byte arg0) {
        field3082 = null;
        field3087 = null;
        field3084 = null;
        if (arg0 > -16) {
            field3087 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIBIZIIII)V")
    public static final void method1471(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field3076++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class5.field49[var12][var36] = 0;
                class156.field2435[var12][var36] = 99999999;
            }
        }
        class5.field49[arg4][arg9] = 99;
        int var13 = arg4;
        byte var14 = 0;
        class156.field2435[arg4][arg9] = 0;
        class158.field2460[var14] = arg4;
        int var37 = var14 + 1;
        class181.field2719[var14] = arg9;
        boolean var15 = false;
        if (arg5 <= 117) {
            field3085 = 97;
        }
        int var16 = 0;
        int var17 = arg9;
        int[][] var18 = class235.field3431[class37.field474].field3351;
        label317: while (var37 != var16) {
            var13 = class158.field2460[var16];
            var17 = class181.field2719[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg10 == var13 && arg0 == var17) {
                var15 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class235.field3431[class37.field474].method1583(arg8, arg0, arg10, arg3 - 1, arg11, var17, 0, var13)) {
                    var15 = true;
                    break;
                }
                if (arg3 < 10 && class235.field3431[class37.field474].method1580(arg11, arg0, var13, var17, arg8, arg10, arg3 - 1, (byte) -123)) {
                    var15 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg6 != 0 && class235.field3431[class37.field474].method1582(arg2, var13, arg11, arg10, var17, arg6, (byte) -107, arg0, arg1)) {
                var15 = true;
                break;
            }
            int var27 = class156.field2435[var13][var17] + 1;
            if (var13 > 0 && class5.field49[var13 - 1][var17] == 0 && (var18[var13 - 1][var17] & 0x2C010E) == 0 && (var18[var13 - 1][var17 + arg11 - 1] & 0x2C0138) == 0) {
                int var28 = 1;
                while (true) {
                    if ((arg11 - 1) <= var28) {
                        class158.field2460[var37] = var13 - 1;
                        class181.field2719[var37] = var17;
                        var37 = var37 + 1 & 0xFFF;
                        class5.field49[var13 - 1][var17] = 2;
                        class156.field2435[var13 - 1][var17] = var27;
                        break;
                    }
                    if ((var18[var13 - 1][var17 + var28] & 0x2C013E) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var13 < 102 && class5.field49[var13 + 1][var17] == 0 && (var18[arg11 + var13][var17] & 0x2C0183) == 0 && (var18[arg11 + var13][var17 - (1 - arg11)] & 0x2C01E0) == 0) {
                int var29 = 1;
                while (true) {
                    if ((arg11 - 1) <= var29) {
                        class158.field2460[var37] = var13 + 1;
                        class181.field2719[var37] = var17;
                        var37 = var37 + 1 & 0xFFF;
                        class5.field49[var13 + 1][var17] = 8;
                        class156.field2435[var13 + 1][var17] = var27;
                        break;
                    }
                    if ((var18[var13 + arg11][var17 + var29] & 0x2C01E3) != 0) {
                        break;
                    }
                    var29++;
                }
            }
            if (var17 > 0 && class5.field49[var13][var17 - 1] == 0 && (var18[var13][var17 - 1] & 0x2C010E) == 0 && (var18[arg11 + var13 - 1][var17 - 1] & 0x2C0183) == 0) {
                int var30 = 1;
                while (true) {
                    if (arg11 - 1 <= var30) {
                        class158.field2460[var37] = var13;
                        class181.field2719[var37] = var17 - 1;
                        class5.field49[var13][var17 - 1] = 1;
                        var37 = var37 + 1 & 0xFFF;
                        class156.field2435[var13][var17 - 1] = var27;
                        break;
                    }
                    if ((var18[var13 + var30][var17 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var30++;
                }
            }
            if (var17 < 102 && class5.field49[var13][var17 + 1] == 0 && (var18[var13][arg11 + var17] & 0x2C0138) == 0 && (var18[var13 + arg11 - 1][arg11 + var17] & 0x2C01E0) == 0) {
                int var31 = 1;
                while (true) {
                    if (var31 >= arg11 - 1) {
                        class158.field2460[var37] = var13;
                        class181.field2719[var37] = var17 + 1;
                        var37 = var37 + 1 & 0xFFF;
                        class5.field49[var13][var17 + 1] = 4;
                        class156.field2435[var13][var17 + 1] = var27;
                        break;
                    }
                    if ((var18[var13 + var31][arg11 + var17] & 0x2C01F8) != 0) {
                        break;
                    }
                    var31++;
                }
            }
            if (var13 > 0 && var17 > 0 && class5.field49[var13 - 1][var17 - 1] == 0 && (var18[var13 - 1][var17 - 1] & 0x2C010E) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= arg11) {
                        class158.field2460[var37] = var13 - 1;
                        class181.field2719[var37] = var17 - 1;
                        class5.field49[var13 - 1][var17 - 1] = 3;
                        var37 = var37 + 1 & 0xFFF;
                        class156.field2435[var13 - 1][var17 - 1] = var27;
                        break;
                    }
                    if ((var18[var13 - 1][var17 + var32 - 1] & 0x2C013E) != 0 || (var18[var13 + var32 - 1][var17 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var13 < 102 && var17 > 0 && class5.field49[var13 + 1][var17 - 1] == 0 && (var18[arg11 + var13][var17 - 1] & 0x2C0183) == 0) {
                int var33 = 1;
                while (true) {
                    if (arg11 <= var33) {
                        class158.field2460[var37] = var13 + 1;
                        class181.field2719[var37] = var17 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class5.field49[var13 + 1][var17 - 1] = 9;
                        class156.field2435[var13 + 1][var17 - 1] = var27;
                        break;
                    }
                    if ((var18[var13 + arg11][var17 + var33 - 1] & 0x2C01E3) != 0 || (var18[var13 + var33][var17 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var13 > 0 && var17 < 102 && class5.field49[var13 - 1][var17 + 1] == 0 && (var18[var13 - 1][arg11 + var17] & 0x2C0138) == 0) {
                int var34 = 1;
                while (true) {
                    if (var34 >= arg11) {
                        class158.field2460[var37] = var13 - 1;
                        class181.field2719[var37] = var17 + 1;
                        class5.field49[var13 - 1][var17 + 1] = 6;
                        var37 = var37 + 1 & 0xFFF;
                        class156.field2435[var13 - 1][var17 + 1] = var27;
                        break;
                    }
                    if ((var18[var13 - 1][var17 + var34] & 0x2C013E) != 0 || (var18[var13 + var34 - 1][arg11 + var17] & 0x2C01F8) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var13 < 102 && var17 < 102 && class5.field49[var13 + 1][var17 + 1] == 0 && (var18[var13 + arg11][var17 + arg11] & 0x2C01E0) == 0) {
                for (int var35 = 1; var35 < arg11; var35++) {
                    if ((var18[var13 + var35][var17 + arg11] & 0x2C01F8) != 0 || (var18[arg11 + var13][var17 + var35] & 0x2C01E3) != 0) {
                        continue label317;
                    }
                }
                class158.field2460[var37] = var13 + 1;
                class181.field2719[var37] = var17 + 1;
                var37 = var37 + 1 & 0xFFF;
                class5.field49[var13 + 1][var17 + 1] = 12;
                class156.field2435[var13 + 1][var17 + 1] = var27;
            }
        }
        if (!var15) {
            if (!arg7) {
                return;
            }
            int var19 = 1000;
            byte var20 = 10;
            int var21 = 100;
            for (int var22 = arg10 - var20; var22 <= arg10 + var20; var22++) {
                for (int var23 = arg0 - var20; var23 <= arg0 + var20; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class156.field2435[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg10 > var22) {
                            var24 = arg10 - var22;
                        } else if (var22 > (arg2 + arg10 - 1)) {
                            var24 = var22 + 1 - arg2 - arg10;
                        }
                        int var25 = 0;
                        if (var23 < arg0) {
                            var25 = arg0 - var23;
                        } else if (var23 > (arg0 + arg6 - 1)) {
                            var25 = var23 + 1 - arg0 - arg6;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && var21 > class156.field2435[var22][var23]) {
                            var21 = class156.field2435[var22][var23];
                            var17 = var23;
                            var19 = var26;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return;
            }
            if (arg4 == var13 && arg9 == var17) {
                return;
            }
        }
        class258.field4001 = false;
        class255.field3855 = var17;
        class113.field1883 = var13;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIIB)V")
    public static final void method1472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        int var10 = -126 % ((arg9 - 68) / 50);
        if (arg4 == arg7 && arg1 == arg5 && arg2 == arg8 && arg3 == arg6) {
            class292.method1985(arg5, arg8, arg3, arg0, arg4, true);
        } else {
            int var11 = arg4;
            int var12 = arg5;
            int var13 = arg5 * 3;
            int var14 = arg4 * 3;
            int var15 = arg7 * 3;
            int var16 = arg1 * 3;
            int var17 = arg2 * 3;
            int var18 = arg8 + var15 - arg4 - var17;
            int var19 = var17 - var15 - (-var14 + var15);
            int var20 = var15 - var14;
            int var21 = var16 - var13;
            int var22 = arg6 * 3;
            int var23 = arg3 + var16 - var22 - arg5;
            int var24 = var22 + var13 - var16 - var16;
            for (int var25 = 128; var25 <= 4096; var25 += 128) {
                int var26 = var25 * var25 >> 12;
                int var27 = var25 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var23 * var27;
                int var30 = var19 * var26;
                int var31 = var20 * var25;
                int var32 = var24 * var26;
                int var33 = (var28 + var30 + var31 >> 12) + arg4;
                int var34 = var21 * var25;
                int var35 = (var29 + var32 + var34 >> 12) + arg5;
                class292.method1985(var12, var33, var35, arg0, var11, true);
                var12 = var35;
                var11 = var33;
            }
        }
        field3078++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method1473(int arg0, boolean arg1, String arg2) {
        if (arg0 > -38) {
            field3075 = true;
        }
        field3081++;
        short[] var3 = new short[16];
        String var4 = arg2.toLowerCase();
        int var5 = arg1 ? 32768 : 0;
        int var6 = 0;
        int var7 = var5 + (arg1 ? class253.field3820 : class237.field3476);
        for (int var8 = var5; var8 < var7; var8++) {
            class92 var11 = class25.method169(var8, false);
            if (var11.field1479 && var11.method698((byte) 85).toLowerCase().indexOf(var4) != -1) {
                if (var6 >= 50) {
                    class289.field4617 = -1;
                    class45.field610 = null;
                    return;
                }
                if (var3.length <= var6) {
                    short[] var12 = new short[var3.length * 2];
                    for (int var13 = 0; var13 < var6; var13++) {
                        var12[var13] = var3[var13];
                    }
                    var3 = var12;
                }
                var3[var6++] = (short) var8;
            }
        }
        class45.field610 = var3;
        class170.field2579 = 0;
        class289.field4617 = var6;
        String[] var9 = new String[class289.field4617];
        for (int var10 = 0; var10 < class289.field4617; var10++) {
            var9[var10] = class25.method169(var3[var10], false).method698((byte) 79);
        }
        class65.method488(0, var9, class45.field610);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIJILui;)V")
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10) {
        field3080++;
        class58 var13 = class12.method88(this.field3073, 27838).method195(-1, 0, 0, (class298) null, (class76) null, 74, this.field3077);
        if (var13 != null) {
            var13.method16(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field3083 = var13.method17();
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
    public final int method17() {
        field3086++;
        return this.field3083;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V")
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3079++;
    }
}
