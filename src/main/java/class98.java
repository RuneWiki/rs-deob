import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class98 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    private int field2155;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "[[I")
    private int[][] field2156;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    private int field2166;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Ldd;")
    public static class35 field2158 = class180.method1196((byte) 126, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Ldd;")
    public static class35 field2161 = class180.method1196((byte) -25, "");

    @OriginalMember(owner = "client!k", name = "m", descriptor = "[[B")
    public static byte[][] field2167 = new byte[250][];

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field2168 = 0;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)I")
    public final int method740(boolean arg0, int arg1) {
        field2163++;
        if (this.field2156 != null) {
            arg1 = (int) ((long) this.field2155 * (long) arg1 / (long) this.field2166) + 6;
        }
        if (!arg0) {
            this.field2155 = 46;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method741(byte arg0) {
        field2158 = null;
        field2161 = null;
        field2167 = null;
        if (arg0 != -31) {
            method741((byte) -107);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)I")
    public final int method742(byte arg0, int arg1) {
        if (this.field2156 != null) {
            arg1 = (int) ((long) this.field2155 * (long) arg1 / (long) this.field2166);
        }
        field2157++;
        if (arg0 != 110) {
            this.method742((byte) -91, 32);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(II)V")
    public class98(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class63.method526(arg0, arg1, true);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2155 = var5;
            this.field2156 = new int[var4][14];
            this.field2166 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2156[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                double var10 = (double) var5 / (double) var4;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([BB)[B")
    public final byte[] method743(byte[] arg0, byte arg1) {
        field2164++;
        if (arg1 != 12) {
            return null;
        }
        if (this.field2156 != null) {
            int var3 = 0;
            int var4 = (int) ((long) arg0.length * (long) this.field2155 / (long) this.field2166) + 14;
            int var5 = 0;
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var10 = this.field2156[var5];
                byte var11 = arg0[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var3 + var12] += var10[var12] * var11;
                }
                int var13 = this.field2155 + var5;
                int var14 = var13 / this.field2166;
                var5 = var13 - this.field2166 * var14;
                var3 += var14;
            }
            arg0 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILd;IIII)V")
    public static final void method744(int arg0, int arg1, int arg2, class31 arg3, int arg4, int arg5, int arg6, int arg7) {
        field2160++;
        if (class35.field781 && (class40.field894[0][arg4][arg6] & 0x2) == 0) {
            if ((class40.field894[arg7][arg4][arg6] & 0x10) != 0) {
                return;
            }
            if (class35.method322(arg4, arg6, 31771, arg7) != class152.field3160) {
                return;
            }
        }
        if (arg7 < class25.field502) {
            class25.field502 = arg7;
        }
        class145 var8 = class4.method23((byte) -88, arg5);
        int var9;
        int var10;
        if (arg2 == 1 || arg2 == 3) {
            var9 = var8.field3017;
            var10 = var8.field3034;
        } else {
            var9 = var8.field3034;
            var10 = var8.field3017;
        }
        int var11;
        int var12;
        if (arg4 + var10 > 104) {
            var11 = arg4 + 1;
            var12 = arg4;
        } else {
            var11 = (var10 + 1 >> 1) + arg4;
            var12 = (var10 >> 1) + arg4;
        }
        int[][] var13 = class206.field4109[arg7];
        int var14 = (arg4 << 7) + (var10 << 6);
        int var15 = (arg6 << 7) + (var9 << 6);
        int var16;
        int var17;
        if (arg6 + var9 > 104) {
            var16 = arg6;
            var17 = arg6 + 1;
        } else {
            var16 = (var9 >> 1) + arg6;
            var17 = arg6 + (var9 + 1 >> 1);
        }
        int var18 = var13[var11][var17] + var13[var12][var16] + var13[var11][var16] + var13[var12][var17] >> 2;
        long var19 = (long) (arg6 << 7 | arg4 | arg1 << 14 | arg2 << 20 | 0x40000000);
        if (var8.field3043 == 0) {
            var19 |= Long.MIN_VALUE;
        }
        if (var8.field3052 == 1) {
            var19 |= 0x400000L;
        }
        if (var8.method995(22546)) {
            class8.method55(arg6, arg4, var8, arg7, -21748, arg2);
        }
        long var21 = var19 | (long) arg5 << 32;
        if (arg1 == 22) {
            if (!class35.field781 || var8.field3043 != 0 || var8.field3045 == 1 || var8.field3027) {
                class110 var24;
                if (var8.field3067 == -1 && var8.field3018 == null) {
                    class148 var23 = var8.method989(var18, var14, var15, arg2, -100, var13, 22);
                    var24 = var23.field3108;
                } else {
                    var24 = new class97(arg5, 22, arg2, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
                }
                class97.method738(arg7, arg4, arg6, var18, var24, var21, var8.field3069);
                if (var8.field3045 == 1 && arg3 != null) {
                    arg3.method293(-6327, arg4, arg6);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class110 var64;
            if (var8.field3067 == -1 && var8.field3018 == null) {
                class148 var63 = var8.method989(var18, var14, var15, arg2, -98, var13, 10);
                var64 = var63.field3108;
            } else {
                var64 = new class97(arg5, 10, arg2, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
            }
            if (var64 != null && class165.method1091(arg7, arg4, arg6, var18, var10, var9, var64, arg1 == 11 ? 256 : 0, var21) && var8.field3055) {
                int var65 = 15;
                if (var64 instanceof class81) {
                    var65 = ((class81) var64).method611() / 4;
                    if (var65 > 30) {
                        var65 = 30;
                    }
                }
                for (int var66 = 0; var66 <= var10; var66++) {
                    for (int var67 = 0; var67 <= var9; var67++) {
                        if (class92.field2050[arg7][arg4 + var66][arg6 + var67] < var65) {
                            class92.field2050[arg7][arg4 + var66][arg6 + var67] = (byte) var65;
                        }
                    }
                }
            }
            if (var8.field3045 != 0 && arg3 != null) {
                arg3.method302(arg6, var8.field3076, var9, 38, var10, arg4);
            }
        } else if (arg1 >= 12) {
            class110 var26;
            if (var8.field3067 == -1 && var8.field3018 == null) {
                class148 var25 = var8.method989(var18, var14, var15, arg2, -107, var13, arg1);
                var26 = var25.field3108;
            } else {
                var26 = new class97(arg5, arg1, arg2, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
            }
            class165.method1091(arg7, arg4, arg6, var18, 1, 1, var26, 0, var21);
            if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg7 > 0) {
                class179.field3677[arg7][arg4][arg6] = class152.method1027(class179.field3677[arg7][arg4][arg6], 2340);
            }
            if (var8.field3045 != 0 && arg3 != null) {
                arg3.method302(arg6, var8.field3076, var9, 36, var10, arg4);
            }
        } else if (arg1 == 0) {
            class110 var28;
            if (var8.field3067 == -1 && var8.field3018 == null) {
                class148 var27 = var8.method989(var18, var14, var15, arg2, -108, var13, 0);
                var28 = var27.field3108;
            } else {
                var28 = new class97(arg5, 0, arg2, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
            }
            class17.method157(arg7, arg4, arg6, var18, var28, null, class57.field1437[arg2], 0, var21);
            if (arg2 == 0) {
                if (var8.field3055) {
                    class92.field2050[arg7][arg4][arg6] = 50;
                    class92.field2050[arg7][arg4][arg6 + 1] = 50;
                }
                if (var8.field3044) {
                    class179.field3677[arg7][arg4][arg6] = class152.method1027(class179.field3677[arg7][arg4][arg6], 585);
                }
            } else if (arg2 == 1) {
                if (var8.field3055) {
                    class92.field2050[arg7][arg4][arg6 + 1] = 50;
                    class92.field2050[arg7][arg4 + 1][arg6 + 1] = 50;
                }
                if (var8.field3044) {
                    class179.field3677[arg7][arg4][arg6 + 1] = class152.method1027(class179.field3677[arg7][arg4][arg6 + 1], 1170);
                }
            } else if (arg2 == 2) {
                if (var8.field3055) {
                    class92.field2050[arg7][arg4 + 1][arg6] = 50;
                    class92.field2050[arg7][arg4 + 1][arg6 + 1] = 50;
                }
                if (var8.field3044) {
                    class179.field3677[arg7][arg4 + 1][arg6] = class152.method1027(class179.field3677[arg7][arg4 + 1][arg6], 585);
                }
            } else if (arg2 == 3) {
                if (var8.field3055) {
                    class92.field2050[arg7][arg4][arg6] = 50;
                    class92.field2050[arg7][arg4 + 1][arg6] = 50;
                }
                if (var8.field3044) {
                    class179.field3677[arg7][arg4][arg6] = class152.method1027(class179.field3677[arg7][arg4][arg6], 1170);
                }
            }
            if (var8.field3045 != 0 && arg3 != null) {
                arg3.method301(arg2, arg1, var8.field3076, arg4, arg6, -1);
            }
            if (var8.field3068 != 16) {
                class1.method6(arg7, arg4, arg6, var8.field3068);
            }
        } else if (arg1 == 1) {
            class110 var30;
            if (var8.field3067 == -1 && var8.field3018 == null) {
                class148 var29 = var8.method989(var18, var14, var15, arg2, -125, var13, 1);
                var30 = var29.field3108;
            } else {
                var30 = new class97(arg5, 1, arg2, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
            }
            class17.method157(arg7, arg4, arg6, var18, var30, null, class196.field3904[arg2], 0, var21);
            if (var8.field3055) {
                if (arg2 == 0) {
                    class92.field2050[arg7][arg4][arg6 + 1] = 50;
                } else if (arg2 == 1) {
                    class92.field2050[arg7][arg4 + 1][arg6 + 1] = 50;
                } else if (arg2 == 2) {
                    class92.field2050[arg7][arg4 + 1][arg6] = 50;
                } else if (arg2 == 3) {
                    class92.field2050[arg7][arg4][arg6] = 50;
                }
            }
            if (var8.field3045 != 0 && arg3 != null) {
                arg3.method301(arg2, arg1, var8.field3076, arg4, arg6, -1);
            }
        } else if (arg1 == 2) {
            int var31 = arg2 + 1 & 0x3;
            class110 var34;
            class110 var35;
            if (var8.field3067 == -1 && var8.field3018 == null) {
                class148 var32 = var8.method989(var18, var14, var15, arg2 + 4, -89, var13, 2);
                class148 var33 = var8.method989(var18, var14, var15, var31, -122, var13, 2);
                var34 = var33.field3108;
                var35 = var32.field3108;
            } else {
                var35 = new class97(arg5, 2, arg2 + 4, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
                var34 = new class97(arg5, 2, var31, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
            }
            class17.method157(arg7, arg4, arg6, var18, var35, var34, class57.field1437[arg2], class57.field1437[var31], var21);
            if (var8.field3044) {
                if (arg2 == 0) {
                    class179.field3677[arg7][arg4][arg6] = class152.method1027(class179.field3677[arg7][arg4][arg6], 585);
                    class179.field3677[arg7][arg4][arg6 + 1] = class152.method1027(class179.field3677[arg7][arg4][arg6 + 1], 1170);
                } else if (arg2 == 1) {
                    class179.field3677[arg7][arg4][arg6 + 1] = class152.method1027(class179.field3677[arg7][arg4][arg6 + 1], 1170);
                    class179.field3677[arg7][arg4 + 1][arg6] = class152.method1027(class179.field3677[arg7][arg4 + 1][arg6], 585);
                } else if (arg2 == 2) {
                    class179.field3677[arg7][arg4 + 1][arg6] = class152.method1027(class179.field3677[arg7][arg4 + 1][arg6], 585);
                    class179.field3677[arg7][arg4][arg6] = class152.method1027(class179.field3677[arg7][arg4][arg6], 1170);
                } else if (arg2 == 3) {
                    class179.field3677[arg7][arg4][arg6] = class152.method1027(class179.field3677[arg7][arg4][arg6], 1170);
                    class179.field3677[arg7][arg4][arg6] = class152.method1027(class179.field3677[arg7][arg4][arg6], 585);
                }
            }
            if (var8.field3045 != 0 && arg3 != null) {
                arg3.method301(arg2, arg1, var8.field3076, arg4, arg6, -1);
            }
            if (var8.field3068 != 16) {
                class1.method6(arg7, arg4, arg6, var8.field3068);
            }
        } else if (arg1 == 3) {
            class110 var37;
            if (var8.field3067 == -1 && var8.field3018 == null) {
                class148 var36 = var8.method989(var18, var14, var15, arg2, -116, var13, 3);
                var37 = var36.field3108;
            } else {
                var37 = new class97(arg5, 3, arg2, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
            }
            class17.method157(arg7, arg4, arg6, var18, var37, null, class196.field3904[arg2], 0, var21);
            if (var8.field3055) {
                if (arg2 == 0) {
                    class92.field2050[arg7][arg4][arg6 + 1] = 50;
                } else if (arg2 == 1) {
                    class92.field2050[arg7][arg4 + 1][arg6 + 1] = 50;
                } else if (arg2 == 2) {
                    class92.field2050[arg7][arg4 + 1][arg6] = 50;
                } else if (arg2 == 3) {
                    class92.field2050[arg7][arg4][arg6] = 50;
                }
            }
            if (var8.field3045 != 0 && arg3 != null) {
                arg3.method301(arg2, arg1, var8.field3076, arg4, arg6, -1);
            }
        } else if (arg1 == 9) {
            class110 var39;
            if (var8.field3067 == -1 && var8.field3018 == null) {
                class148 var38 = var8.method989(var18, var14, var15, arg2, -110, var13, arg1);
                var39 = var38.field3108;
            } else {
                var39 = new class97(arg5, arg1, arg2, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
            }
            class165.method1091(arg7, arg4, arg6, var18, 1, 1, var39, 0, var21);
            if (var8.field3045 != 0 && arg3 != null) {
                arg3.method302(arg6, var8.field3076, var9, 49, var10, arg4);
            }
            if (var8.field3068 != 16) {
                class1.method6(arg7, arg4, arg6, var8.field3068);
            }
        } else if (arg1 == 4) {
            class110 var41;
            if (var8.field3067 == -1 && var8.field3018 == null) {
                class148 var40 = var8.method989(var18, var14, var15, arg2, -100, var13, 4);
                var41 = var40.field3108;
            } else {
                var41 = new class97(arg5, 4, arg2, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
            }
            class193.method1262(arg7, arg4, arg6, var18, var41, null, class57.field1437[arg2], 0, 0, 0, var21);
        } else if (arg1 == 5) {
            int var42 = 16;
            long var43 = class111.method812(arg7, arg4, arg6);
            if (var43 != 0L) {
                var42 = class4.method23((byte) 125, (int) (var43 >>> 32) & Integer.MAX_VALUE).field3068;
            }
            class110 var46;
            if (var8.field3067 == -1 && var8.field3018 == null) {
                class148 var45 = var8.method989(var18, var14, var15, arg2, -123, var13, 4);
                var46 = var45.field3108;
            } else {
                var46 = new class97(arg5, 4, arg2, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
            }
            class193.method1262(arg7, arg4, arg6, var18, var46, null, class57.field1437[arg2], 0, class13.field235[arg2] * var42, class130.field2806[arg2] * var42, var21);
        } else if (arg1 == 6) {
            int var47 = 8;
            long var48 = class111.method812(arg7, arg4, arg6);
            if (var48 != 0L) {
                var47 = class4.method23((byte) 102, (int) (var48 >>> 32) & Integer.MAX_VALUE).field3068 / 2;
            }
            class110 var51;
            if (var8.field3067 == -1 && var8.field3018 == null) {
                class148 var50 = var8.method989(var18, var14, var15, arg2 + 4, -74, var13, 4);
                var51 = var50.field3108;
            } else {
                var51 = new class97(arg5, 4, arg2 + 4, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
            }
            class193.method1262(arg7, arg4, arg6, var18, var51, null, 256, arg2, class49.field1070[arg2] * var47, class78.field1821[arg2] * var47, var21);
        } else if (arg1 == 7) {
            int var52 = arg2 + 2 & 0x3;
            class110 var54;
            if (var8.field3067 == -1 && var8.field3018 == null) {
                class148 var53 = var8.method989(var18, var14, var15, var52 + 4, -96, var13, 4);
                var54 = var53.field3108;
            } else {
                var54 = new class97(arg5, 4, var52 + 4, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
            }
            class193.method1262(arg7, arg4, arg6, var18, var54, null, 256, var52, 0, 0, var21);
        } else if (arg1 == 8) {
            int var55 = 8;
            long var56 = class111.method812(arg7, arg4, arg6);
            if (var56 != 0L) {
                var55 = class4.method23((byte) 84, Integer.MAX_VALUE & (int) (var56 >>> 32)).field3068 / 2;
            }
            int var58 = arg2 + 2 & 0x3;
            class110 var61;
            class110 var62;
            if (var8.field3067 == -1 && var8.field3018 == null) {
                class148 var59 = var8.method989(var18, var14, var15, arg2 + 4, -83, var13, 4);
                class148 var60 = var8.method989(var18, var14, var15, var58 + 4, -115, var13, 4);
                var61 = var60.field3108;
                var62 = var59.field3108;
            } else {
                var62 = new class97(arg5, 4, arg2 + 4, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
                var61 = new class97(arg5, 4, var58 + 4, arg7, arg4, arg6, var8.field3067, var8.field3038, null);
            }
            class193.method1262(arg7, arg4, arg6, var18, var62, var61, 256, arg2, class49.field1070[arg2] * var55, class78.field1821[arg2] * var55, var21);
        } else if (arg0 < 91) {
            method744(-6, -34, -100, null, 8, 15, -13, 50);
        }
    }
}
