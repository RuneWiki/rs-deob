import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class101 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[I")
    public static int[] field2139 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public static int field2157 = 0;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2142 = -1;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2136 = 0;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Lo;")
    public static class84 field2141 = null;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "[Lad;")
    public static class5[] field2162 = new class5[256];

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "Lo;")
    public static class84 field2161 = class15.method124("glow3:", 255);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public int field2140;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public int field2160;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Ljd;")
    public class58 field2134;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Ljd;")
    public class58 field2145;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Ljd;")
    public class58 field2155;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "Lqb;")
    public static class96 field2153;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[I")
    public static int[] field2137;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "[I")
    public static int[] field2156;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZIII)Lo;", line = 18)
    public static final class84 method759(boolean arg0, int arg1, int arg2, int arg3) {
        field2163++;
        int var4 = 1;
        if (arg3 > arg1 || arg1 > 36) {
            arg1 = 10;
        }
        int var5 = arg2 / arg1;
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg2 % arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
            arg2 /= arg1;
        }
        class84 var9 = new class84();
        var9.field1869 = var7;
        var9.field1906 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 79)
    public static final void method760(int arg0) {
        if (arg0 != 1000) {
            method768(90, 15, 98);
        }
        field2149++;
        int var1 = class42.field868 * 128 + 64;
        int var2 = class89.field2010 * 128 + 64;
        int var3 = class105.method778(class1.field11, var2, 3, var1) - class58.field1200;
        if (var1 > class17.field313) {
            class17.field313 += class24.field404 + (var1 - class17.field313) * class65.field1443 / 1000;
            if (var1 < class17.field313) {
                class17.field313 = var1;
            }
        }
        if (class17.field313 > var1) {
            class17.field313 -= (class17.field313 - var1) * class65.field1443 / 1000 + class24.field404;
            if (var1 > class17.field313) {
                class17.field313 = var1;
            }
        }
        if (class99.field2103 < var3) {
            class99.field2103 += (var3 - class99.field2103) * class65.field1443 / 1000 + class24.field404;
            if (var3 < class99.field2103) {
                class99.field2103 = var3;
            }
        }
        int var4 = class97.field2067 * 128 + 64;
        if (class99.field2103 > var3) {
            class99.field2103 -= (class99.field2103 - var3) * class65.field1443 / 1000 + class24.field404;
            if (class99.field2103 < var3) {
                class99.field2103 = var3;
            }
        }
        if (class57.field1176 < var2) {
            class57.field1176 += class24.field404 + (var2 - class57.field1176) * class65.field1443 / 1000;
            if (var2 < class57.field1176) {
                class57.field1176 = var2;
            }
        }
        if (class57.field1176 > var2) {
            class57.field1176 -= (class57.field1176 - var2) * class65.field1443 / 1000 + class24.field404;
            if (var2 > class57.field1176) {
                class57.field1176 = var2;
            }
        }
        int var5 = class93.field2033 * 128 + 64;
        int var6 = class105.method778(class1.field11, var5, 3, var4) - field2151;
        int var7 = var5 - class57.field1176;
        int var8 = var6 - class99.field2103;
        int var9 = var4 - class17.field313;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var9)) & 0x7FF;
        int var13 = var12 - class33.field655;
        if (class41.field836 < var11) {
            class41.field836 += (var11 - class41.field836) * class88.field2001 / 1000 + class27.field529;
            if (class41.field836 > var11) {
                class41.field836 = var11;
            }
        }
        if (class41.field836 > var11) {
            class41.field836 -= (class41.field836 - var11) * class88.field2001 / 1000 + class27.field529;
            if (var11 > class41.field836) {
                class41.field836 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class33.field655 += class88.field2001 * var13 / 1000 + class27.field529;
            class33.field655 &= 0x7FF;
        }
        if (var13 < 0) {
            class33.field655 -= class27.field529 + -var13 * class88.field2001 / 1000;
            class33.field655 &= 0x7FF;
        }
        int var14 = var12 - class33.field655;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class33.field655 = var12;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIIIIIZIIII)Z", line = 227)
    public static final boolean method761(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field2138++;
        int var12 = -66 / ((35 - arg1) / 61);
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var37 = 0; var37 < 104; var37++) {
                class82.field1758[var13][var37] = 0;
                class28.field558[var13][var37] = 99999999;
            }
        }
        class82.field1758[arg3][arg9] = 99;
        class28.field558[arg3][arg9] = 0;
        int var14 = arg9;
        int var15 = arg3;
        byte var16 = 0;
        class42.field860[var16] = arg3;
        int var38 = var16 + 1;
        class28.field554[var16] = arg9;
        int var17 = 0;
        boolean var18 = false;
        int var19 = class42.field860.length;
        int[][] var20 = class93.field2034[class1.field11].field654;
        while (var38 != var17) {
            var14 = class28.field554[var17];
            var15 = class42.field860[var17];
            var17 = (var17 + 1) % var19;
            if (arg11 == var15 && arg0 == var14) {
                var18 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class93.field2034[class1.field11].method294(arg2, var14, arg0, arg11, var15, arg8 - 1, -1)) {
                    var18 = true;
                    break;
                }
                if (arg8 < 10 && class93.field2034[class1.field11].method302(var14, arg2, arg8 - 1, arg11, arg0, (byte) 16, var15)) {
                    var18 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg4 != 0 && class93.field2034[class1.field11].method305(arg5, var14, arg11, arg0, arg10, var15, arg4, false)) {
                var18 = true;
                break;
            }
            int var36 = class28.field558[var15][var14] + 1;
            if (var15 > 0 && class82.field1758[var15 - 1][var14] == 0 && (var20[var15 - 1][var14] & 0x1280108) == 0) {
                class42.field860[var38] = var15 - 1;
                class28.field554[var38] = var14;
                class82.field1758[var15 - 1][var14] = 2;
                var38 = (var38 + 1) % var19;
                class28.field558[var15 - 1][var14] = var36;
            }
            if (var15 < 103 && class82.field1758[var15 + 1][var14] == 0 && (var20[var15 + 1][var14] & 0x1280180) == 0) {
                class42.field860[var38] = var15 + 1;
                class28.field554[var38] = var14;
                class82.field1758[var15 + 1][var14] = 8;
                var38 = (var38 + 1) % var19;
                class28.field558[var15 + 1][var14] = var36;
            }
            if (var14 > 0 && class82.field1758[var15][var14 - 1] == 0 && (var20[var15][var14 - 1] & 0x1280102) == 0) {
                class42.field860[var38] = var15;
                class28.field554[var38] = var14 - 1;
                var38 = (var38 + 1) % var19;
                class82.field1758[var15][var14 - 1] = 1;
                class28.field558[var15][var14 - 1] = var36;
            }
            if (var14 < 103 && class82.field1758[var15][var14 + 1] == 0 && (var20[var15][var14 + 1] & 0x1280120) == 0) {
                class42.field860[var38] = var15;
                class28.field554[var38] = var14 + 1;
                class82.field1758[var15][var14 + 1] = 4;
                var38 = (var38 + 1) % var19;
                class28.field558[var15][var14 + 1] = var36;
            }
            if (var15 > 0 && var14 > 0 && class82.field1758[var15 - 1][var14 - 1] == 0 && (var20[var15 - 1][var14 - 1] & 0x128010E) == 0 && (var20[var15 - 1][var14] & 0x1280108) == 0 && (var20[var15][var14 - 1] & 0x1280102) == 0) {
                class42.field860[var38] = var15 - 1;
                class28.field554[var38] = var14 - 1;
                var38 = (var38 + 1) % var19;
                class82.field1758[var15 - 1][var14 - 1] = 3;
                class28.field558[var15 - 1][var14 - 1] = var36;
            }
            if (var15 < 103 && var14 > 0 && class82.field1758[var15 + 1][var14 - 1] == 0 && (var20[var15 + 1][var14 - 1] & 0x1280183) == 0 && (var20[var15 + 1][var14] & 0x1280180) == 0 && (var20[var15][var14 - 1] & 0x1280102) == 0) {
                class42.field860[var38] = var15 + 1;
                class28.field554[var38] = var14 - 1;
                var38 = (var38 + 1) % var19;
                class82.field1758[var15 + 1][var14 - 1] = 9;
                class28.field558[var15 + 1][var14 - 1] = var36;
            }
            if (var15 > 0 && var14 < 103 && class82.field1758[var15 - 1][var14 + 1] == 0 && (var20[var15 - 1][var14 + 1] & 0x1280138) == 0 && (var20[var15 - 1][var14] & 0x1280108) == 0 && (var20[var15][var14 + 1] & 0x1280120) == 0) {
                class42.field860[var38] = var15 - 1;
                class28.field554[var38] = var14 + 1;
                class82.field1758[var15 - 1][var14 + 1] = 6;
                class28.field558[var15 - 1][var14 + 1] = var36;
                var38 = (var38 + 1) % var19;
            }
            if (var15 < 103 && var14 < 103 && class82.field1758[var15 + 1][var14 + 1] == 0 && (var20[var15 + 1][var14 + 1] & 0x12801E0) == 0 && (var20[var15 + 1][var14] & 0x1280180) == 0 && (var20[var15][var14 + 1] & 0x1280120) == 0) {
                class42.field860[var38] = var15 + 1;
                class28.field554[var38] = var14 + 1;
                class82.field1758[var15 + 1][var14 + 1] = 12;
                var38 = (var38 + 1) % var19;
                class28.field558[var15 + 1][var14 + 1] = var36;
            }
        }
        class120.field2655 = 0;
        if (!var18) {
            if (!arg7) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg11 - var23; var24 <= arg11 + var23; var24++) {
                for (int var25 = arg0 - var23; var25 <= arg0 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class28.field558[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (arg11 > var24) {
                            var27 = arg11 - var24;
                        } else if (arg10 + arg11 - 1 < var24) {
                            var27 = var24 + 1 - arg10 - arg11;
                        }
                        if (arg0 > var25) {
                            var26 = arg0 - var25;
                        } else if (var25 > arg0 + arg4 - 1) {
                            var26 = var25 + 1 - arg0 - arg4;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && var22 > class28.field558[var24][var25]) {
                            var22 = class28.field558[var24][var25];
                            var14 = var25;
                            var15 = var24;
                            var21 = var28;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg3 == var15 && arg9 == var14) {
                return false;
            }
            class120.field2655 = 1;
        }
        byte var29 = 0;
        class42.field860[var29] = var15;
        int var39 = var29 + 1;
        class28.field554[var29] = var14;
        int var30;
        int var31 = var30 = class82.field1758[var15][var14];
        while (arg3 != var15 || arg9 != var14) {
            if (var30 != var31) {
                var30 = var31;
                class42.field860[var39] = var15;
                class28.field554[var39++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = class82.field1758[var15][var14];
        }
        if (var39 > 0) {
            int var32 = var39--;
            if (var32 > 25) {
                var32 = 25;
            }
            int var33 = class42.field860[var39];
            int var34 = class28.field554[var39];
            if (arg6 == 0) {
                class88.field1995++;
                class97.field2070.method979(1, 130);
                class97.field2070.method226(-9646, var32 + var32 + 3);
            }
            if (arg6 == 1) {
                class97.field2070.method979(1, 136);
                class97.field2070.method226(-9646, var32 + var32 + 3 + 14);
                class45.field944++;
            }
            if (arg6 == 2) {
                class97.field2070.method979(1, 89);
                class97.field2070.method226(-9646, var32 + var32 + 3);
                class49.field1060++;
            }
            class97.field2070.method235(false, class119.field2631[82] ? 1 : 0);
            class97.field2070.method234(var33 + class106.field2242, -3420);
            class97.field2070.method243(var34 + class36.field714, -1);
            class45.field970 = class42.field860[0];
            class97.field2077 = class28.field554[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var39--;
                class97.field2070.method235(false, class42.field860[var39] - var33);
                class97.field2070.method225(-5016, class28.field554[var39] - var34);
            }
            return true;
        } else if (arg6 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V", line = 572)
    public static final void method762(int arg0, int arg1) {
        if (arg0 == 256) {
            field2144++;
            class49.method423(false, arg1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjava/awt/Component;II)Lp;", line = 584)
    public static final class89 method763(int arg0, Component arg1, int arg2, int arg3) {
        field2150++;
        class111 var4 = new class111();
        var4.method704(arg0, -124, arg1, arg3);
        return arg2 == -8 ? var4 : null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 600)
    public static void method764(byte arg0) {
        field2162 = null;
        field2137 = null;
        field2156 = null;
        field2153 = null;
        field2139 = null;
        field2141 = null;
        field2161 = null;
        if (arg0 != -10) {
            field2142 = 12;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIBLfb;IILsd;I)V", line = 621)
    public static final void method765(int arg0, int arg1, int arg2, byte arg3, class33 arg4, int arg5, int arg6, class108 arg7, int arg8) {
        field2159++;
        if (class1.field23 && (class73.field1544[0][arg2][arg8] & 0x2) == 0) {
            if ((class73.field1544[arg0][arg2][arg8] & 0x10) != 0) {
                return;
            }
            if (class57.method465(arg8, arg2, arg0, (byte) 124) != class39.field801) {
                return;
            }
        }
        if (class40.field818 > arg0) {
            class40.field818 = arg0;
        }
        int var9 = class110.field2377[arg0][arg2 + 1][arg8];
        int var10 = class110.field2377[arg0][arg2][arg8];
        int var11 = class110.field2377[arg0][arg2 + 1][arg8 + 1];
        int var12 = class110.field2377[arg0][arg2][arg8 + 1];
        class49 var13 = class110.method856((byte) -114, arg1);
        int var14 = var10 + var11 + var9 + var12 >> 2;
        int var15 = (arg5 << 6) + arg6;
        int var16 = (arg1 << 14) + (arg8 << 7) + arg2 + 1073741824;
        if (var13.field1059 == 0) {
            var16 += Integer.MIN_VALUE;
        }
        if (var13.field1016 == 1) {
            var15 += 256;
        }
        if (arg3 >= -5) {
            field2157 = -28;
        }
        if (arg6 == 22) {
            if (!class1.field23 || var13.field1059 != 0 || var13.field1013) {
                class58 var17;
                if (var13.field1048 == -1 && var13.field1041 == null) {
                    var17 = var13.method414(arg5, var9, var12, var10, 22, -112, var11);
                } else {
                    var17 = new class105(arg1, 22, arg5, var10, var9, var11, var12, var13.field1048, true);
                }
                arg7.method802(arg0, arg2, arg8, var14, var17, var16, var15);
                if (var13.field1021 && var13.field1059 == 1 && arg4 != null) {
                    arg4.method303(arg8, 2097152, arg2);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class58 var37;
            if (var13.field1048 == -1 && var13.field1041 == null) {
                var37 = var13.method414(arg5, var9, var12, var10, 10, -73, var11);
            } else {
                var37 = new class105(arg1, 10, arg5, var10, var9, var11, var12, var13.field1048, true);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg5 == 1 || arg5 == 3) {
                    var38 = var13.field1028;
                    var39 = var13.field1035;
                } else {
                    var38 = var13.field1035;
                    var39 = var13.field1028;
                }
                int var40 = 0;
                if (arg6 == 11) {
                    var40 += 256;
                }
                if (arg7.method796(arg0, arg2, arg8, var14, var39, var38, var37, var40, var16, var15) && var13.field1052) {
                    class83 var41;
                    if (var37 instanceof class83) {
                        var41 = (class83) var37;
                    } else {
                        var41 = var13.method414(arg5, var9, var12, var10, 10, -41, var11);
                    }
                    if (var41 != null) {
                        for (int var42 = 0; var42 <= var39; var42++) {
                            for (int var43 = 0; var43 <= var38; var43++) {
                                int var44 = var41.method611() / 4;
                                if (var44 > 30) {
                                    var44 = 30;
                                }
                                if (class71.field1495[arg0][arg2 + var42][arg8 + var43] < var44) {
                                    class71.field1495[arg0][arg2 + var42][arg8 + var43] = (byte) var44;
                                }
                            }
                        }
                    }
                }
            }
            if (var13.field1021 && arg4 != null) {
                arg4.method298(var13.field1035, var13.field1030, arg2, arg5, 19398920, arg8, var13.field1028);
            }
        } else if (arg6 >= 12) {
            class58 var18;
            if (var13.field1048 == -1 && var13.field1041 == null) {
                var18 = var13.method414(arg5, var9, var12, var10, arg6, -83, var11);
            } else {
                var18 = new class105(arg1, arg6, arg5, var10, var9, var11, var12, var13.field1048, true);
            }
            arg7.method796(arg0, arg2, arg8, var14, 1, 1, var18, 0, var16, var15);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg0 > 0) {
                class38.field745[arg0][arg2][arg8] = class106.method785(class38.field745[arg0][arg2][arg8], 2340);
            }
            if (var13.field1021 && arg4 != null) {
                arg4.method298(var13.field1035, var13.field1030, arg2, arg5, 19398920, arg8, var13.field1028);
            }
        } else if (arg6 == 0) {
            class58 var19;
            if (var13.field1048 == -1 && var13.field1041 == null) {
                var19 = var13.method414(arg5, var9, var12, var10, 0, -71, var11);
            } else {
                var19 = new class105(arg1, 0, arg5, var10, var9, var11, var12, var13.field1048, true);
            }
            arg7.method826(arg0, arg2, arg8, var14, var19, null, class6.field122[arg5], 0, var16, var15);
            if (arg5 == 0) {
                if (var13.field1052) {
                    class71.field1495[arg0][arg2][arg8] = 50;
                    class71.field1495[arg0][arg2][arg8 + 1] = 50;
                }
                if (var13.field1039) {
                    class38.field745[arg0][arg2][arg8] = class106.method785(class38.field745[arg0][arg2][arg8], 585);
                }
            } else if (arg5 == 1) {
                if (var13.field1052) {
                    class71.field1495[arg0][arg2][arg8 + 1] = 50;
                    class71.field1495[arg0][arg2 + 1][arg8 + 1] = 50;
                }
                if (var13.field1039) {
                    class38.field745[arg0][arg2][arg8 + 1] = class106.method785(class38.field745[arg0][arg2][arg8 + 1], 1170);
                }
            } else if (arg5 == 2) {
                if (var13.field1052) {
                    class71.field1495[arg0][arg2 + 1][arg8] = 50;
                    class71.field1495[arg0][arg2 + 1][arg8 + 1] = 50;
                }
                if (var13.field1039) {
                    class38.field745[arg0][arg2 + 1][arg8] = class106.method785(class38.field745[arg0][arg2 + 1][arg8], 585);
                }
            } else if (arg5 == 3) {
                if (var13.field1052) {
                    class71.field1495[arg0][arg2][arg8] = 50;
                    class71.field1495[arg0][arg2 + 1][arg8] = 50;
                }
                if (var13.field1039) {
                    class38.field745[arg0][arg2][arg8] = class106.method785(class38.field745[arg0][arg2][arg8], 1170);
                }
            }
            if (var13.field1021 && arg4 != null) {
                arg4.method295(var13.field1030, true, arg5, arg8, arg2, arg6);
            }
            if (var13.field1054 != 16) {
                arg7.method797(arg0, arg2, arg8, var13.field1054);
            }
        } else if (arg6 == 1) {
            class58 var20;
            if (var13.field1048 == -1 && var13.field1041 == null) {
                var20 = var13.method414(arg5, var9, var12, var10, 1, -77, var11);
            } else {
                var20 = new class105(arg1, 1, arg5, var10, var9, var11, var12, var13.field1048, true);
            }
            arg7.method826(arg0, arg2, arg8, var14, var20, null, class118.field2589[arg5], 0, var16, var15);
            if (var13.field1052) {
                if (arg5 == 0) {
                    class71.field1495[arg0][arg2][arg8 + 1] = 50;
                } else if (arg5 == 1) {
                    class71.field1495[arg0][arg2 + 1][arg8 + 1] = 50;
                } else if (arg5 == 2) {
                    class71.field1495[arg0][arg2 + 1][arg8] = 50;
                } else if (arg5 == 3) {
                    class71.field1495[arg0][arg2][arg8] = 50;
                }
            }
            if (var13.field1021 && arg4 != null) {
                arg4.method295(var13.field1030, true, arg5, arg8, arg2, arg6);
            }
        } else if (arg6 == 2) {
            int var21 = arg5 + 1 & 0x3;
            class58 var22;
            class58 var23;
            if (var13.field1048 == -1 && var13.field1041 == null) {
                var22 = var13.method414(arg5 + 4, var9, var12, var10, 2, -86, var11);
                var23 = var13.method414(var21, var9, var12, var10, 2, -114, var11);
            } else {
                var22 = new class105(arg1, 2, arg5 + 4, var10, var9, var11, var12, var13.field1048, true);
                var23 = new class105(arg1, 2, var21, var10, var9, var11, var12, var13.field1048, true);
            }
            arg7.method826(arg0, arg2, arg8, var14, var22, var23, class6.field122[arg5], class6.field122[var21], var16, var15);
            if (var13.field1039) {
                if (arg5 == 0) {
                    class38.field745[arg0][arg2][arg8] = class106.method785(class38.field745[arg0][arg2][arg8], 585);
                    class38.field745[arg0][arg2][arg8 + 1] = class106.method785(class38.field745[arg0][arg2][arg8 + 1], 1170);
                } else if (arg5 == 1) {
                    class38.field745[arg0][arg2][arg8 + 1] = class106.method785(class38.field745[arg0][arg2][arg8 + 1], 1170);
                    class38.field745[arg0][arg2 + 1][arg8] = class106.method785(class38.field745[arg0][arg2 + 1][arg8], 585);
                } else if (arg5 == 2) {
                    class38.field745[arg0][arg2 + 1][arg8] = class106.method785(class38.field745[arg0][arg2 + 1][arg8], 585);
                    class38.field745[arg0][arg2][arg8] = class106.method785(class38.field745[arg0][arg2][arg8], 1170);
                } else if (arg5 == 3) {
                    class38.field745[arg0][arg2][arg8] = class106.method785(class38.field745[arg0][arg2][arg8], 1170);
                    class38.field745[arg0][arg2][arg8] = class106.method785(class38.field745[arg0][arg2][arg8], 585);
                }
            }
            if (var13.field1021 && arg4 != null) {
                arg4.method295(var13.field1030, true, arg5, arg8, arg2, arg6);
            }
            if (var13.field1054 != 16) {
                arg7.method797(arg0, arg2, arg8, var13.field1054);
            }
        } else if (arg6 == 3) {
            class58 var24;
            if (var13.field1048 == -1 && var13.field1041 == null) {
                var24 = var13.method414(arg5, var9, var12, var10, 3, -65, var11);
            } else {
                var24 = new class105(arg1, 3, arg5, var10, var9, var11, var12, var13.field1048, true);
            }
            arg7.method826(arg0, arg2, arg8, var14, var24, null, class118.field2589[arg5], 0, var16, var15);
            if (var13.field1052) {
                if (arg5 == 0) {
                    class71.field1495[arg0][arg2][arg8 + 1] = 50;
                } else if (arg5 == 1) {
                    class71.field1495[arg0][arg2 + 1][arg8 + 1] = 50;
                } else if (arg5 == 2) {
                    class71.field1495[arg0][arg2 + 1][arg8] = 50;
                } else if (arg5 == 3) {
                    class71.field1495[arg0][arg2][arg8] = 50;
                }
            }
            if (var13.field1021 && arg4 != null) {
                arg4.method295(var13.field1030, true, arg5, arg8, arg2, arg6);
            }
        } else if (arg6 == 9) {
            class58 var25;
            if (var13.field1048 == -1 && var13.field1041 == null) {
                var25 = var13.method414(arg5, var9, var12, var10, arg6, -41, var11);
            } else {
                var25 = new class105(arg1, arg6, arg5, var10, var9, var11, var12, var13.field1048, true);
            }
            arg7.method796(arg0, arg2, arg8, var14, 1, 1, var25, 0, var16, var15);
            if (var13.field1021 && arg4 != null) {
                arg4.method298(var13.field1035, var13.field1030, arg2, arg5, 19398920, arg8, var13.field1028);
            }
        } else {
            if (var13.field1072) {
                if (arg5 == 1) {
                    int var26 = var12;
                    var12 = var11;
                    var11 = var9;
                    var9 = var10;
                    var10 = var26;
                } else if (arg5 == 2) {
                    int var28 = var12;
                    var12 = var9;
                    var9 = var28;
                    int var29 = var11;
                    var11 = var10;
                    var10 = var29;
                } else if (arg5 == 3) {
                    int var27 = var12;
                    var12 = var10;
                    var10 = var9;
                    var9 = var11;
                    var11 = var27;
                }
            }
            if (arg6 == 4) {
                class58 var30;
                if (var13.field1048 == -1 && var13.field1041 == null) {
                    var30 = var13.method414(0, var9, var12, var10, 4, -57, var11);
                } else {
                    var30 = new class105(arg1, 4, 0, var10, var9, var11, var12, var13.field1048, true);
                }
                arg7.method832(arg0, arg2, arg8, var14, var30, class6.field122[arg5], arg5 * 512, 0, 0, var16, var15);
            } else if (arg6 == 5) {
                int var31 = 16;
                int var32 = arg7.method845(arg0, arg2, arg8);
                if (var32 > 0) {
                    var31 = class110.method856((byte) -108, var32 >> 14 & 0x7FFF).field1054;
                }
                class58 var33;
                if (var13.field1048 == -1 && var13.field1041 == null) {
                    var33 = var13.method414(0, var9, var12, var10, 4, -68, var11);
                } else {
                    var33 = new class105(arg1, 4, 0, var10, var9, var11, var12, var13.field1048, true);
                }
                arg7.method832(arg0, arg2, arg8, var14, var33, class6.field122[arg5], arg5 * 512, field2139[arg5] * var31, class64.field1332[arg5] * var31, var16, var15);
            } else if (arg6 == 6) {
                class58 var34;
                if (var13.field1048 == -1 && var13.field1041 == null) {
                    var34 = var13.method414(0, var9, var12, var10, 4, -114, var11);
                } else {
                    var34 = new class105(arg1, 4, 0, var10, var9, var11, var12, var13.field1048, true);
                }
                arg7.method832(arg0, arg2, arg8, var14, var34, 256, arg5, 0, 0, var16, var15);
            } else if (arg6 == 7) {
                class58 var35;
                if (var13.field1048 == -1 && var13.field1041 == null) {
                    var35 = var13.method414(0, var9, var12, var10, 4, -57, var11);
                } else {
                    var35 = new class105(arg1, 4, 0, var10, var9, var11, var12, var13.field1048, true);
                }
                arg7.method832(arg0, arg2, arg8, var14, var35, 512, arg5, 0, 0, var16, var15);
            } else if (arg6 == 8) {
                class58 var36;
                if (var13.field1048 == -1 && var13.field1041 == null) {
                    var36 = var13.method414(0, var9, var12, var10, 4, -90, var11);
                } else {
                    var36 = new class105(arg1, 4, 0, var10, var9, var11, var12, var13.field1048, true);
                }
                arg7.method832(arg0, arg2, arg8, var14, var36, 768, arg5, 0, 0, var16, var15);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lmc;B)Z", line = 1134)
    public static final boolean method766(class75 arg0, byte arg1) {
        field2143++;
        if (arg0.field1618 == null) {
            return false;
        }
        if (arg1 > -27) {
            field2139 = null;
        }
        for (int var2 = 0; var2 < arg0.field1618.length; var2++) {
            int var3 = class128.method993(var2, 22562, arg0);
            int var4 = arg0.field1620[var2];
            if (arg0.field1618[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field1618[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field1618[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([BIILcb;)V", line = 1191)
    public static final void method767(byte[] arg0, int arg1, int arg2, class15 arg3) {
        field2158++;
        class62 var4 = new class62();
        var4.field1292 = arg3;
        var4.field731 = arg2;
        var4.field1289 = 0;
        var4.field1285 = arg0;
        if (arg1 != 20165) {
            field2162 = null;
        }
        class88 var5 = class25.field421;
        synchronized (class25.field421) {
            class25.field421.method692((byte) -98, var4);
        }
        class67.method517(arg1 - 20271);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V", line = 1217)
    public static final void method768(int arg0, int arg1, int arg2) {
        field2154++;
        class88 var3 = class110.field2379[class1.field11][arg1][arg0];
        if (var3 == null) {
            class112.field2427.method823(class1.field11, arg1, arg0);
            return;
        }
        class67 var4 = null;
        class67 var5 = (class67) var3.method695((byte) -117);
        int var6 = -99999999;
        while (var5 != null) {
            class44 var11 = class126.method970(-113, var5.field1459);
            int var12 = var11.field902;
            if (var11.field920) {
                var12 = (var5.field1469 + 1) * var12;
            }
            if (var12 > var6) {
                var6 = var12;
                var4 = var5;
            }
            var5 = (class67) var3.method702(0);
        }
        var3.method700((byte) -119, var4);
        class67 var7 = null;
        class67 var8 = (class67) var3.method695((byte) -115);
        class67 var9 = null;
        while (var8 != null) {
            if (var4.field1459 != var8.field1459 && var7 == null) {
                var7 = var8;
            }
            if (var4.field1459 != var8.field1459 && var7.field1459 != var8.field1459 && var9 == null) {
                var9 = var8;
            }
            var8 = (class67) var3.method702(0);
        }
        int var10 = arg1 + (arg0 << 7) + 1610612736;
        class112.field2427.method813(class1.field11, arg1, arg0, class105.method778(class1.field11, arg1 * 128 + 64, 3, arg0 * 128 + 64), var4, var10, var7, var9);
        if (arg2 <= 54) {
            method760(16);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 1282)
    public static final void method769(byte arg0) {
        field2146++;
        if (arg0 >= -38) {
            field2153 = null;
        }
        class64.field1363.method742(4);
        class4.field53.method742(4);
    }
}
