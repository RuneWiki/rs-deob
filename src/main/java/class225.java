import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class225 extends class210 {

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "Leb;")
    public static class395 field3375 = new class395();

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[[I")
    public final int[][] method58(int arg0, int arg1) {
        if (arg1 < 94) {
            method1547(-14, (String) null);
        }
        ++field3373;
        int[][] var3 = super.field2967.method1572(121, arg0);
        if (super.field2967.field3454) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class202.field2852 > var7; ++var7) {
                this.method1545((byte) 31, arg0, var7);
                int[][] var8 = this.method1444(1, 0, class359.field5221);
                var4[var7] = var8[0][class113.field1546];
                var5[var7] = var8[1][class113.field1546];
                var6[var7] = var8[2][class113.field1546];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg1 != -11941) {
            method1546(104, -12, 9, -27, -15, (class103) null, (class9) null, 114, (byte[][]) null, -9, (boolean[]) null, (class148) null, (byte[][]) null, (byte[][]) null);
        }
        ++field3368;
        if (arg0 == 0) {
            super.field2956 = ~arg2.method1738((byte) -67) == -2;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BII)V")
    private final void method1545(byte arg0, int arg1, int arg2) {
        ++field3371;
        int var4 = class430.field6250[arg2];
        int var5 = class331.field4911[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class359.field5221 = arg1;
            class113.field1546 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class359.field5221 = arg2;
            class113.field1546 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class359.field5221 = arg2;
            class113.field1546 = -arg1 + class202.field2852;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class113.field1546 = arg2;
            class359.field5221 = -arg1 + class130.field1771;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class113.field1546 = class202.field2852 - arg2;
            class359.field5221 = -arg1 + class130.field1771;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class113.field1546 = -arg1 + class202.field2852;
            class359.field5221 = -arg2 + class130.field1771;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class359.field5221 = -arg2 + class130.field1771;
            class113.field1546 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class359.field5221 = arg1;
            class113.field1546 = -arg2 + class202.field2852;
        }
        class113.field1546 &= class437.field6373;
        int var7 = -69 / ((-31 - arg0) / 41);
        class359.field5221 &= class139.field1911;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field3372;
        if (arg1 != -38) {
            field3375 = null;
        }
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            for (int var4 = 0; class202.field2852 > var4; ++var4) {
                this.method1545((byte) -79, arg0, var4);
                int[] var5 = this.method1447(class359.field5221, -122, 0);
                var3[var4] = var5[class113.field1546];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIILrc;Lfp;I[[BI[ZLsf;[[B[[B)V")
    public static final void method1546(int arg0, int arg1, int arg2, int arg3, int arg4, class103 arg5, class9 arg6, int arg7, byte[][] arg8, int arg9, boolean[] arg10, class148 arg11, byte[][] arg12, byte[][] arg13) {
        if (arg5 != null && arg11 != null || arg11 != null && arg0 == 12 || arg5 != null && arg0 == 0) {
            boolean[] var14 = arg5 != null && arg5.field1319 ? class187.field2610[arg0] : class411.field5899[arg0];
            if (arg3 > 0) {
                if (arg9 > 0) {
                    int var15 = 255 & arg8[arg9 - 1][arg3 + -1];
                    if (~var15 < -1) {
                        class103 var16 = class465.method2868(-104, var15 + -1);
                        if (~var16.field1338 != 0 && var16.field1319) {
                            byte var17 = arg12[arg9 + -1][arg3 - 1];
                            int var18 = arg13[arg9 - 1][arg3 + -1] * 2 + 4 & 7;
                            int var19 = class369.method2342(false, var16, arg6);
                            if (class149.field2022[var17][var18]) {
                                class30.field423[0] = var16.field1338;
                                class251.field3685[0] = var19;
                                class96.field1192[0] = arg6.method109() ? var16.field1329 : var16.field1333;
                                class294.field4276[0] = var16.field1327;
                                class106.field1433[0] = var16.field1331;
                                class226.field3388[0] = 256;
                            }
                        }
                    }
                }
                if (~(arg1 + -1) < ~arg9) {
                    int var20 = 255 & arg8[arg9 + 1][arg3 - 1];
                    if (~var20 < -1) {
                        class103 var21 = class465.method2868(-106, var20 - 1);
                        if (~var21.field1338 != 0 && var21.field1319) {
                            byte var22 = arg12[arg9 + 1][arg3 - 1];
                            int var23 = arg13[arg9 + 1][arg3 + -1] * 2 + 6 & 7;
                            int var24 = class369.method2342(false, var21, arg6);
                            if (class149.field2022[var22][var23]) {
                                class30.field423[2] = var21.field1338;
                                class251.field3685[2] = var24;
                                class96.field1192[2] = !arg6.method109() ? var21.field1333 : var21.field1329;
                                class294.field4276[2] = var21.field1327;
                                class106.field1433[2] = var21.field1331;
                                class226.field3388[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg3 < arg4 + -1) {
                if (~arg9 < -1) {
                    int var25 = 255 & arg8[arg9 + -1][arg3 - -1];
                    if (var25 > 0) {
                        class103 var26 = class465.method2868(-51, var25 + -1);
                        if (~var26.field1338 != 0 && var26.field1319) {
                            byte var27 = arg12[arg9 + -1][arg3 + 1];
                            int var28 = arg13[arg9 - 1][arg3 + 1] * 2 + 2 & 7;
                            int var29 = class369.method2342(false, var26, arg6);
                            if (class149.field2022[var27][var28]) {
                                class30.field423[6] = var26.field1338;
                                class251.field3685[6] = var29;
                                class96.field1192[6] = arg6.method109() ? var26.field1329 : var26.field1333;
                                class294.field4276[6] = var26.field1327;
                                class106.field1433[6] = var26.field1331;
                                class226.field3388[6] = 64;
                            }
                        }
                    }
                }
                if (~(arg1 + -1) < ~arg9) {
                    int var30 = 255 & arg8[arg9 - -1][arg3 + 1];
                    if (~var30 < -1) {
                        class103 var31 = class465.method2868(-47, var30 + -1);
                        if (~var31.field1338 != 0 && var31.field1319) {
                            byte var32 = arg12[arg9 + 1][arg3 + 1];
                            int var33 = arg13[arg9 - -1][arg3 - -1] * 2 & 7;
                            int var34 = class369.method2342(false, var31, arg6);
                            if (class149.field2022[var32][var33]) {
                                class30.field423[4] = var31.field1338;
                                class251.field3685[4] = var34;
                                class96.field1192[4] = !arg6.method109() ? var31.field1333 : var31.field1329;
                                class294.field4276[4] = var31.field1327;
                                class106.field1433[4] = var31.field1331;
                                class226.field3388[4] = 128;
                            }
                        }
                    }
                }
            }
            if (~arg3 < -1) {
                int var35 = 255 & arg8[arg9][arg3 + -1];
                if (var35 > 0) {
                    class103 var36 = class465.method2868(-43, var35 + -1);
                    if (~var36.field1338 != 0) {
                        byte var37 = arg12[arg9][arg3 - 1];
                        byte var38 = arg13[arg9][arg3 - 1];
                        if (!var36.field1319) {
                            if (!var14[-(-arg2) & 3]) {
                                arg10[0] = class411.field5899[var37][class386.method2438(3, 2 - -var38)];
                            }
                        } else {
                            int var39 = 2;
                            int var40 = var38 * 2 + 4;
                            int var41 = class369.method2342(false, var36, arg6);
                            for (int var42 = 0; var42 < 3; ++var42) {
                                var39 &= 7;
                                var40 &= 7;
                                if (class149.field2022[var37][var40] && class106.field1433[var39] <= var36.field1331) {
                                    class30.field423[var39] = var36.field1338;
                                    class251.field3685[var39] = var41;
                                    class96.field1192[var39] = arg6.method109() ? var36.field1329 : var36.field1333;
                                    class294.field4276[var39] = var36.field1327;
                                    if (class106.field1433[var39] != var36.field1331) {
                                        class226.field3388[var39] = 32;
                                    } else {
                                        class226.field3388[var39] = class259.method1785(class226.field3388[var39], 32);
                                    }
                                    class106.field1433[var39] = var36.field1331;
                                }
                                --var39;
                                ++var40;
                            }
                            if (!var14[arg2 & 3]) {
                                arg10[0] = class187.field2610[var37][class386.method2438(3, var38 + 2)];
                            }
                        }
                    }
                }
            }
            if (arg4 + -1 > arg3) {
                int var43 = arg8[arg9][arg3 - -1] & 255;
                if (~var43 < -1) {
                    class103 var44 = class465.method2868(-109, var43 - 1);
                    if (~var44.field1338 != 0) {
                        byte var45 = arg12[arg9][arg3 - -1];
                        byte var46 = arg13[arg9][arg3 + 1];
                        if (!var44.field1319) {
                            if (!var14[3 & arg2 + 2]) {
                                arg10[2] = class411.field5899[var45][class386.method2438(3, var46)];
                            }
                        } else {
                            int var47 = 4;
                            int var48 = var46 * 2 + 2;
                            int var49 = class369.method2342(false, var44, arg6);
                            for (int var50 = 0; var50 < 3; ++var50) {
                                var47 &= 7;
                                var48 &= 7;
                                if (class149.field2022[var45][var48] && class106.field1433[var47] <= var44.field1331) {
                                    class30.field423[var47] = var44.field1338;
                                    class251.field3685[var47] = var49;
                                    class96.field1192[var47] = !arg6.method109() ? var44.field1333 : var44.field1329;
                                    class294.field4276[var47] = var44.field1327;
                                    if (class106.field1433[var47] != var44.field1331) {
                                        class226.field3388[var47] = 16;
                                    } else {
                                        class226.field3388[var47] = class259.method1785(class226.field3388[var47], 16);
                                    }
                                    class106.field1433[var47] = var44.field1331;
                                }
                                ++var47;
                                --var48;
                            }
                            if (!var14[3 & arg2 + 2]) {
                                arg10[2] = class187.field2610[var45][class386.method2438(var46, 3)];
                            }
                        }
                    }
                }
            }
            if (~arg9 < -1) {
                int var51 = 255 & arg8[arg9 + -1][arg3];
                if (~var51 < -1) {
                    class103 var52 = class465.method2868(-87, var51 + -1);
                    if (~var52.field1338 != 0) {
                        byte var53 = arg12[arg9 - 1][arg3];
                        byte var54 = arg13[arg9 - 1][arg3];
                        if (!var52.field1319) {
                            if (!var14[3 & arg2 + 3]) {
                                arg10[3] = class411.field5899[var53][class386.method2438(3, var54 + 1)];
                            }
                        } else {
                            int var55 = 6;
                            int var56 = var54 * 2 + 4;
                            int var57 = class369.method2342(false, var52, arg6);
                            for (int var58 = 0; var58 < 3; ++var58) {
                                var55 &= 7;
                                var56 &= 7;
                                if (class149.field2022[var53][var56] && ~class106.field1433[var55] >= ~var52.field1331) {
                                    class30.field423[var55] = var52.field1338;
                                    class251.field3685[var55] = var57;
                                    class96.field1192[var55] = !arg6.method109() ? var52.field1333 : var52.field1329;
                                    class294.field4276[var55] = var52.field1327;
                                    if (~class106.field1433[var55] != ~var52.field1331) {
                                        class226.field3388[var55] = 8;
                                    } else {
                                        class226.field3388[var55] = class259.method1785(class226.field3388[var55], 8);
                                    }
                                    class106.field1433[var55] = var52.field1331;
                                }
                                --var56;
                                ++var55;
                            }
                            if (!var14[3 & arg2 + 3]) {
                                arg10[3] = class187.field2610[var53][class386.method2438(3, var54 + 1)];
                            }
                        }
                    }
                }
            }
            if (~(arg1 + -1) < ~arg9) {
                int var59 = 255 & arg8[arg9 - -1][arg3];
                if (var59 > 0) {
                    class103 var60 = class465.method2868(-15, var59 - 1);
                    if (var60.field1338 != -1) {
                        byte var61 = arg12[arg9 + 1][arg3];
                        byte var62 = arg13[arg9 - -1][arg3];
                        if (var60.field1319) {
                            int var63 = 4;
                            int var64 = 6 - -(var62 * 2);
                            int var65 = class369.method2342(false, var60, arg6);
                            for (int var66 = 0; var66 < 3; ++var66) {
                                var64 &= 7;
                                var63 &= 7;
                                if (class149.field2022[var61][var64] && ~var60.field1331 <= ~class106.field1433[var63]) {
                                    class30.field423[var63] = var60.field1338;
                                    class251.field3685[var63] = var65;
                                    class96.field1192[var63] = !arg6.method109() ? var60.field1333 : var60.field1329;
                                    class294.field4276[var63] = var60.field1327;
                                    if (class106.field1433[var63] == var60.field1331) {
                                        class226.field3388[var63] = class259.method1785(class226.field3388[var63], 4);
                                    } else {
                                        class226.field3388[var63] = 4;
                                    }
                                    class106.field1433[var63] = var60.field1331;
                                }
                                ++var64;
                                --var63;
                            }
                            if (!var14[arg2 + 1 & 3]) {
                                arg10[1] = class187.field2610[var61][class386.method2438(var62 + 3, 3)];
                            }
                        } else if (!var14[3 & arg2 + 1]) {
                            arg10[1] = class411.field5899[var61][class386.method2438(var62 + 3, 3)];
                        }
                    }
                }
            }
        }
        if (arg7 < 82) {
            field3375 = null;
        }
        ++field3367;
        if (arg5 != null) {
            int var67 = class369.method2342(false, arg5, arg6);
            if (arg5.field1319) {
                for (int var68 = 0; var68 < 8; ++var68) {
                    int var69 = 7 & var68 - arg2 * 2;
                    if (class149.field2022[arg0][var68] && arg5.field1331 >= class106.field1433[var69]) {
                        class30.field423[var69] = arg5.field1338;
                        class251.field3685[var69] = var67;
                        class96.field1192[var69] = arg6.method109() ? arg5.field1329 : arg5.field1333;
                        class294.field4276[var69] = arg5.field1327;
                        if (class106.field1433[var69] == arg5.field1331) {
                            class226.field3388[var69] = class259.method1785(class226.field3388[var69], 2);
                        } else {
                            class226.field3388[var69] = 2;
                        }
                        class106.field1433[var69] = arg5.field1331;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1547(int arg0, String arg1) {
        ++field3374;
        System.out.println("Error: " + class373.method2368("%0a", 0, arg1, "\n"));
        if (arg0 != 3) {
            method1548(95);
        }
    }

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
    public static void method1548(int arg0) {
        field3375 = null;
        if (arg0 != 3) {
            field3370 = 73;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class225() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IB)Lqm;")
    public static final class297 method1549(int arg0, byte arg1) {
        ++field3369;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    if ((double) class66.field853 == 3.0D) {
                        return class37.field520;
                    }
                    if ((double) class66.field853 == 4.0D) {
                        return class150.field2032;
                    }
                    if ((double) class66.field853 == 6.0D) {
                        return class307.field4538;
                    }
                    if ((double) class66.field853 >= 8.0D) {
                        return class241.field3579;
                    }
                }
            } else {
                if ((double) class66.field853 == 3.0D) {
                    return class47.field617;
                }
                if ((double) class66.field853 == 4.0D) {
                    return class71.field932;
                }
                if ((double) class66.field853 == 6.0D) {
                    return class37.field520;
                }
                if ((double) class66.field853 >= 8.0D) {
                    return class150.field2032;
                }
            }
        } else {
            if ((double) class66.field853 == 3.0D) {
                return class223.field3296;
            }
            if ((double) class66.field853 == 4.0D) {
                return class47.field618;
            }
            if ((double) class66.field853 == 6.0D) {
                return class47.field617;
            }
            if ((double) class66.field853 >= 8.0D) {
                return class71.field932;
            }
        }
        return arg1 >= -15 ? null : null;
    }
}
