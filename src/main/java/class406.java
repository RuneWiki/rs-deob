import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class406 {

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public int field6038 = 0;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field6033 = 0;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field6039;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field6040;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2549(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Le;II)Z", line = 11)
    public static final boolean method2544(class312 arg0, int arg1, int arg2) {
        field6036++;
        int var3 = (class80.field1003 - 104) / 2;
        int var4 = (class380.field5751 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg1; var52 <= 3; var52++) {
                    if (class396.method2495(var6, (byte) 59, arg1, var52, var51)) {
                        int var53 = var52;
                        if (method2545(var51, (byte) -118, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class185.method1259(var6, (byte) -17, var53, var51);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class104.field1466 = arg0.method703(var7, arg2, 512, 512, 512);
        class374.method2389(64);
        int var9 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + 238 - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 228 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        boolean[][] var12 = new boolean[class333.field5200][class333.field5200];
        for (int var13 = var3; var13 < var3 + 104; var13 += class333.field5200) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class333.field5200) {
                arg0.method671(0, 0, class333.field5200 * 4, class333.field5200 * 4);
                arg0.method635(-16777216);
                for (int var37 = arg1; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class333.field5200; var44++) {
                        for (int var50 = 0; var50 < class333.field5200; var50++) {
                            var12[var44][var50] = class396.method2495(var13 + var44, (byte) 59, arg1, var37, var36 + var50);
                        }
                    }
                    class181.field2961[var37].method769(0, 0, 1024, var13, var36, var13 + class333.field5200, class333.field5200 + var36, var12);
                    if (!class126.field1941) {
                        for (int var45 = -4; var45 < class333.field5200; var45++) {
                            for (int var46 = -4; var46 < class333.field5200; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var4 <= var48 && class396.method2495(var47, (byte) 59, arg1, var37, var48)) {
                                    int var49 = var37;
                                    if (method2545(var48, (byte) -119, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class105.method798(var49, var48, var47, var45 * 4, (class333.field5200 - var46) * 4 - 4, var10, arg0, var9, 0);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class126.field1941) {
                    class72 var38 = class162.field2547[arg1];
                    for (int var39 = 0; var39 < class333.field5200; var39++) {
                        for (int var40 = 0; var40 < class333.field5200; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field889[var41 - var38.field896][var42 - var38.field911];
                            if ((var43 & 0x40240000) != 0) {
                                arg0.method2086(4, var39 * 4, 4, -1713569622, -765, (class333.field5200 - var40) * 4 - 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg0.method2087(-1713569622, true, (class333.field5200 - var40) * 4 - 4, var39 * 4, 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg0.method2085(var39 * 4 + 3, (byte) 85, 4, (class333.field5200 - var40) * 4 - 4, -1713569622);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg0.method2087(-1713569622, true, (class333.field5200 - var40) * 4 + 3 - 4, var39 * 4, 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg0.method2085(var39 * 4, (byte) 94, 4, (class333.field5200 - var40) * 4 - 4, -1713569622);
                            }
                        }
                    }
                }
                arg0.method563(0, 0, class333.field5200 * 4, class333.field5200 * 4, var11, 2);
                class104.field1466.method421(((var13 - var3) * 4) + 48, -((-var4 + var36) * 4) + 464 + -(class333.field5200 * 4), class333.field5200 * 4, class333.field5200 * 4, 0, 0);
            }
        }
        arg0.method609();
        arg0.method635(-16777215);
        class193.method1356((byte) 127);
        class243.field4020 = 0;
        class315.field4951.method255(-20994);
        if (!class126.field1941) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg1; var21 <= (arg1 + 1) && var21 <= 3; var21++) {
                        if (class396.method2495(var14, (byte) 59, arg1, var21, var20)) {
                            class149 var22 = (class149) class316.method2107(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class149) class12.method117(var21, var14, var20, field6040 == null ? (field6040 = method2549("up")) : field6040);
                            }
                            if (var22 == null) {
                                var22 = (class149) class139.method1016(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class149) class238.method1684(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class127 var23 = class137.method1003(var22.method197(true), -30796);
                                if (!var23.field1985 || class84.field1040) {
                                    int var24 = var23.field2003;
                                    if (var23.field1984 != null) {
                                        for (int var25 = 0; var25 < var23.field1984.length; var25++) {
                                            if (var23.field1984[var25] != -1) {
                                                class127 var26 = class137.method1003(var23.field1984[var25], arg2 ^ 0xFFFF87B4);
                                                if (var26.field2003 >= 0) {
                                                    var24 = var26.field2003;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class324 var28 = class288.method1944(36, var24);
                                            if (var28 != null && var28.field5078) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class162.field2547[var21].field889;
                                            int var32 = class162.field2547[var21].field896;
                                            int var33 = class162.field2547[var21].field911;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > var20 - 3 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 104 - 1 && var30 < (var20 + 3) && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class173.field2875[class243.field4020] = var23.field2016;
                                        class330.field5165[class243.field4020] = var29;
                                        class222.field3688[class243.field4020] = var30;
                                        class243.field4020++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class396.field5932 != null) {
                class220.field3636.field6510 = 1;
                class186.method1323(64, true, 1024);
                for (int var15 = 0; var15 < class396.field5932.field5531; var15++) {
                    int var16 = class396.field5932.field5523[var15];
                    if (var16 >> 28 == class266.field4286) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class409.field6048;
                        int var18 = (var16 & 0x3FFF) - class444.field6481;
                        if (var17 >= 0 && var17 < class80.field1003 && var18 >= 0 && var18 < class380.field5751) {
                            class315.field4951.method245(arg2 + 500, new class160(var15));
                        } else {
                            class324 var19 = class288.method1944(36, class396.field5932.field5522[var15]);
                            if (var19.field5088 != null && (var19.field5059 + var17) >= 0 && class80.field1003 > var17 + var19.field5081 && (var19.field5093 + var18) >= 0 && class380.field5751 > (var19.field5062 + var18)) {
                                class315.field4951.method245(500, new class160(var15));
                            }
                        }
                    }
                }
                class186.method1323(64, true, 128);
                class220.field3636.field6510 = 2;
                class220.field3636.method2774(-10298);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBI)Z", line = 413)
    public static final boolean method2545(int arg0, byte arg1, int arg2) {
        if (arg1 > -110) {
            field6033 = -72;
        }
        field6034++;
        return (class31.field382[1][arg2][arg0] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljg;I)V", line = 427)
    public final void method2546(class186 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1322(false);
            if (var3 == 0) {
                field6035++;
                if (arg1 > -36) {
                    method2544((class312) null, 39, -100);
                    return;
                }
                return;
            }
            this.method2548(-1, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Le;Z[[B[[B[[IBLlf;[[B[[BILlf;II)V", line = 449)
    public static final void method2547(class312 arg0, boolean arg1, byte[][] arg2, byte[][] arg3, int[][] arg4, byte arg5, class129 arg6, byte[][] arg7, byte[][] arg8, int arg9, class129 arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < arg11; var13++) {
            for (int var14 = 0; var14 < arg12; var14++) {
                if (class117.method852(true) || class396.method2495(var13, (byte) 59, class81.field1007, arg9, var14)) {
                    byte var15 = arg3[var13][var14];
                    byte var16 = arg8[var13][var14];
                    int var17 = arg2[var13][var14] & 0xFF;
                    int var18 = arg7[var13][var14] & 0xFF;
                    class235 var19 = var17 == 0 ? null : class345.method2257(var17 - 1, true);
                    class402 var20 = var18 == 0 ? null : class92.method545(var18 - 1, (byte) 36);
                    int var21 = 0;
                    int var22 = 0;
                    if (var15 != 0) {
                        var21 = var20 == null ? 0 : class304.field4807[var15];
                        var22 = var19 == null ? 0 : class349.field5404[var15];
                    } else if (var19 != null) {
                        var22 = class349.field5404[var15];
                    } else if (var20 != null) {
                        var21 = class349.field5404[var15];
                    }
                    int var23 = var22 + var21;
                    int var24 = 0;
                    if (var23 != 0) {
                        int[] var25 = new int[var23];
                        int[] var26 = new int[var23];
                        int[] var27 = new int[var23];
                        int[] var28 = new int[var23];
                        boolean var29 = false;
                        if (var19 == null || var19.field3935 == -1 && var19.field3931 == -1 && var19.field3921 == -1) {
                            for (int var32 = 0; var32 < var22; var32++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var30 = arg0.method711() ? var19.field3921 : var19.field3930;
                            if (!class256.field4149) {
                                var30 = -1;
                            }
                            for (int var31 = 0; var31 < var22; var31++) {
                                var27[var24] = var30;
                                var28[var24] = var19.field3939;
                                if (var19.field3935 == -1) {
                                    var25[var24] = -1;
                                } else {
                                    var25[var24] = var19.field3935;
                                }
                                if (var19.field3931 == -1) {
                                    var26[var24] = -1;
                                } else {
                                    var26[var24] = var19.field3931;
                                    var29 = true;
                                }
                                var24++;
                            }
                            if (!arg1 && arg9 == 0) {
                                class224.method1608(var13, var14, var19.field3925, var19.field3929 * 8);
                            }
                        }
                        if (!var29) {
                            var26 = null;
                        }
                        if (var20 == null) {
                            for (int var35 = 0; var35 < var21; var35++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var33 = var20.field6002;
                            if (!class256.field4149) {
                                var33 = -1;
                            }
                            for (int var34 = 0; var34 < var21; var34++) {
                                var27[var24] = var33;
                                var28[var24] = var20.field5997;
                                var25[var24] = arg4[var13][var14];
                                if (var26 != null) {
                                    var26[var24] = -1;
                                }
                                var24++;
                            }
                        }
                        int var36 = class282.field4532.length;
                        int[] var37 = arg1 ? new int[var36] : null;
                        int[] var38 = new int[var36];
                        int[] var39 = new int[var36];
                        for (int var40 = 0; var40 < var36; var40++) {
                            int var48 = class282.field4532[var40];
                            int var49 = class225.field3744[var40];
                            if (var16 == 0) {
                                var38[var40] = var48;
                                var39[var40] = var49;
                            } else if (var16 == 1) {
                                var38[var40] = var49;
                                var39[var40] = 128 - var48;
                            } else if (var16 == 2) {
                                var38[var40] = 128 - var48;
                                var39[var40] = 128 - var49;
                            } else if (var16 == 3) {
                                var38[var40] = 128 - var49;
                                var39[var40] = var48;
                            }
                            if (arg1 && class108.field1513[var15][var40]) {
                                int var52 = (var13 << 7) + var38[var40];
                                int var53 = (var14 << 7) + var39[var40];
                                var37[var40] = arg6.method771(var52, var53) - arg10.method771(var52, var53);
                            }
                        }
                        int var41 = arg10.method779(var13, var14);
                        int var42 = arg10.method779(var13 + 1, var14);
                        int var43 = arg10.method779(var13 + 1, var14 + 1);
                        int var44 = arg10.method779(var13, var14 + 1);
                        if (arg9 > 0) {
                            boolean var45 = true;
                            if (var18 == 0 && var15 != 0) {
                                var45 = false;
                            }
                            if (var17 > 0 && var19 != null && !var19.field3934) {
                                var45 = false;
                            }
                            if (var45 && var41 == var42 && var41 == var43 && var41 == var44) {
                                class369.field5616[arg9][var13][var14] = (byte) class35.method227(class369.field5616[arg9][var13][var14], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        if (arg1) {
                            var46 = class318.method2116(var13, var14);
                            var47 = class277.method1868(var13, var14);
                        }
                        arg10.method776(var13, var14, var38, var37, var39, class424.field6265[var15], class263.field4234[var15], class249.field4071[var15], var25, var26, var27, var28, var46, var47, false);
                        class362.method2345(arg9, var13, var14);
                    }
                }
            }
        }
        if (arg5 >= -80) {
            field6033 = -97;
        }
        field6039++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILjg;)V", line = 738)
    private final void method2548(int arg0, int arg1, class186 arg2) {
        if (arg0 != -1) {
            this.field6038 = 14;
        }
        field6037++;
        if (arg1 == 5) {
            this.field6038 = arg2.method1272((byte) -89);
        }
    }
}
