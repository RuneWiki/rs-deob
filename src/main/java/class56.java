import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 extends class8 {

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    private int field956 = 32768;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "[Lgg;")
    public static class192[] field962 = new class192[50];

    @OriginalMember(owner = "client!i", name = "J", descriptor = "Lc;")
    public static class106 field951 = new class106();

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field964 = 1;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "S")
    public static short field965 = 1;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "Z")
    public static boolean field967 = false;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "Z")
    public static boolean field963;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        if (arg0) {
            field962 = null;
        }
        ++field960;
        class78.method547(14764);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        int[] var3 = super.field110.method1585(arg0 ^ arg0, arg1);
        if (super.field110.field3734) {
            int[] var4 = this.method61(arg1, arg0 + 119, 1);
            int[] var5 = this.method61(arg1, 125, 2);
            for (int var6 = 0; ~var6 > ~class231.field3798; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field956 >> 12;
                int var9 = class212.field3455[var7] * var8 >> 12;
                int var10 = class92.field1523 & arg1 - -(var9 >> 12);
                int var11 = class84.field1319[var7] * var8 >> 12;
                int var12 = class287.field4537 & (var11 >> 12) + var6;
                int[] var13 = this.method61(var10, arg0 + 118, 0);
                var3[var6] = var13[var12];
            }
        }
        ++field959;
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        ++field950;
        int var3 = 44 % ((-48 - arg1) / 46);
        int[][] var4 = super.field93.method248(arg0, 17416);
        if (super.field93.field470) {
            int[] var5 = this.method61(arg0, 125, 1);
            int[] var6 = this.method61(arg0, -57, 2);
            int[] var7 = var4[0];
            int[] var8 = var4[2];
            int[] var9 = var4[1];
            for (int var10 = 0; ~class231.field3798 < ~var10; ++var10) {
                int var11 = 255 & var5[var10] * 255 >> 12;
                int var12 = var6[var10] * this.field956 >> 12;
                int var13 = class84.field1319[var11] * var12 >> 12;
                int var14 = class212.field3455[var11] * var12 >> 12;
                int var15 = class287.field4537 & var10 - -(var13 >> 12);
                int var16 = class92.field1523 & arg0 - -(var14 >> 12);
                int[][] var17 = this.method60(var16, 0, 112);
                var7[var10] = var17[0][var15];
                var9[var10] = var17[1][var15];
                var8[var10] = var17[2][var15];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lwd;ZIZIIIZIII)V")
    public static final void method416(class22 arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        ++field954;
        if (arg7 && !class257.method1757(-5) && ~(class201.field3198[0][arg9][arg8] & 2) == -1) {
            if ((class201.field3198[arg6][arg9][arg8] & 16) != 0) {
                return;
            }
            if (~class1.method12(arg6, arg9, -119, arg8) != ~class223.field3694) {
                return;
            }
        }
        if (~arg6 > ~class91.field1495) {
            class91.field1495 = arg6;
        }
        class135 var11 = class209.method1447(arg2, -6653);
        int var12;
        int var13;
        if (~arg10 != -2 && ~arg10 != -4) {
            var12 = var11.field2175;
            var13 = var11.field2225;
        } else {
            var12 = var11.field2225;
            var13 = var11.field2175;
        }
        int var14;
        int var15;
        if (arg9 + var12 > 104) {
            var14 = arg9;
            var15 = arg9 + 1;
        } else {
            var14 = (var12 >> 1) + arg9;
            var15 = (var12 - -1 >> 1) + arg9;
        }
        int var16;
        int var17;
        if (~(arg8 + var13) >= -105) {
            var16 = (var13 >> 1) + arg8;
            var17 = arg8 - -(var13 + 1 >> 1);
        } else {
            var16 = arg8;
            var17 = arg8 + 1;
        }
        int[][] var18 = class124.field2012[arg4];
        int var19 = var18[var14][var16] + var18[var15][var17] + var18[var15][var16] + var18[var14][var17] >> 2;
        int var20 = (arg8 << 7) + (var13 << 6);
        int var21 = (arg9 << 7) - -(var12 << 6);
        int[][] var22 = null;
        long var23 = (long) (1073741824 | arg10 << 20 | arg5 << 14 | arg8 << 7 | arg9);
        if (var11.field2206 == 0 || arg1) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field2198 == 1) {
            var23 |= 4194304L;
        }
        if (var11.field2170) {
            var23 |= 2147483648L;
        }
        long var25 = var23 | (long) arg2 << 32;
        if (!arg1) {
            if (~arg4 > -4) {
                var22 = class124.field2012[arg4 + 1];
            }
        } else {
            var22 = class219.field3586[0];
        }
        if (var11.method947((byte) 95)) {
            class39.method345(arg9, (class33) null, arg10, arg6, (class15) null, arg8, var11, false);
        }
        boolean var27 = !arg1 & var11.field2191;
        if (arg5 == 22) {
            if (class22.field361 || ~var11.field2206 != -1 || ~var11.field2169 == -2 || var11.field2156) {
                class260 var29;
                if (~var11.field2208 == 0 && var11.field2209 == null && !var11.field2233) {
                    class125 var28 = var11.method948(arg7, -55, var20, var21, var19, (class243) null, var22, arg10, var18, 22, var27);
                    var29 = var28.field2015;
                } else {
                    var29 = new class148(arg2, 22, arg10, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                }
                class15.method122(arg6, arg9, arg8, var19, var29, var25, var11.field2221);
                if (~var11.field2169 == -2 && arg0 != null) {
                    arg0.method200(arg9, -113, arg8);
                }
            }
        } else if (~arg5 != -11 && ~arg5 != -12) {
            if (~arg5 <= -13) {
                class260 var31;
                if (var11.field2208 == -1 && var11.field2209 == null && !var11.field2233) {
                    class125 var30 = var11.method948(arg7, -63, var20, var21, var19, (class243) null, var22, arg10, var18, arg5, var27);
                    var31 = var30.field2015;
                } else {
                    var31 = new class148(arg2, arg5, arg10, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                }
                class41.method352(arg6, arg9, arg8, var19, 1, 1, var31, 0, var25);
                if (arg7 && ~arg5 <= -13 && ~arg5 >= -18 && arg5 != 13 && arg6 > 0) {
                    class25.field418[arg6][arg9][arg8] = class220.method1495(class25.field418[arg6][arg9][arg8], 4);
                }
                if (~var11.field2169 != -1 && arg0 != null) {
                    arg0.method206(var11.field2212, var12, arg8, false, arg9, var13);
                }
            } else if (~arg5 == -1) {
                class260 var33;
                if (~var11.field2208 == 0 && var11.field2209 == null && !var11.field2233) {
                    class125 var32 = var11.method948(arg7, -20, var20, var21, var19, (class243) null, var22, arg10, var18, 0, var27);
                    var33 = var32.field2015;
                } else {
                    var33 = new class148(arg2, 0, arg10, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                }
                class240.method1658(arg6, arg9, arg8, var19, var33, (class260) null, class258.field4107[arg10], 0, var25);
                if (arg7) {
                    if (arg10 == 0) {
                        if (var11.field2207) {
                            class131.field2096[arg6][arg9][arg8] = 50;
                            class131.field2096[arg6][arg9][arg8 + 1] = 50;
                        }
                        if (var11.field2197) {
                            class25.field418[arg6][arg9][arg8] = class220.method1495(class25.field418[arg6][arg9][arg8], 1);
                        }
                    } else if (arg10 == 1) {
                        if (var11.field2207) {
                            class131.field2096[arg6][arg9][arg8 + 1] = 50;
                            class131.field2096[arg6][arg9 + 1][arg8 + 1] = 50;
                        }
                        if (var11.field2197) {
                            class25.field418[arg6][arg9][arg8 + 1] = class220.method1495(class25.field418[arg6][arg9][arg8 + 1], 2);
                        }
                    } else if (~arg10 != -3) {
                        if (~arg10 == -4) {
                            if (var11.field2207) {
                                class131.field2096[arg6][arg9][arg8] = 50;
                                class131.field2096[arg6][arg9 - -1][arg8] = 50;
                            }
                            if (var11.field2197) {
                                class25.field418[arg6][arg9][arg8] = class220.method1495(class25.field418[arg6][arg9][arg8], 2);
                            }
                        }
                    } else {
                        if (var11.field2207) {
                            class131.field2096[arg6][arg9 - -1][arg8] = 50;
                            class131.field2096[arg6][arg9 + 1][arg8 + 1] = 50;
                        }
                        if (var11.field2197) {
                            class25.field418[arg6][arg9 + 1][arg8] = class220.method1495(class25.field418[arg6][arg9 + 1][arg8], 1);
                        }
                    }
                }
                if (var11.field2169 != 0 && arg0 != null) {
                    arg0.method202(var11.field2212, -50, arg9, arg5, arg8, arg10);
                }
                if (~var11.field2189 != -17) {
                    class207.method1429(arg6, arg9, arg8, var11.field2189);
                }
            } else if (~arg5 == -2) {
                class260 var35;
                if (var11.field2208 == -1 && var11.field2209 == null && !var11.field2233) {
                    class125 var34 = var11.method948(arg7, -78, var20, var21, var19, (class243) null, var22, arg10, var18, 1, var27);
                    var35 = var34.field2015;
                } else {
                    var35 = new class148(arg2, 1, arg10, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                }
                class240.method1658(arg6, arg9, arg8, var19, var35, (class260) null, class278.field4381[arg10], 0, var25);
                if (var11.field2207 && arg7) {
                    if (arg10 != 0) {
                        if (arg10 != 1) {
                            if (arg10 == 2) {
                                class131.field2096[arg6][arg9 + 1][arg8] = 50;
                            } else if (arg10 == 3) {
                                class131.field2096[arg6][arg9][arg8] = 50;
                            }
                        } else {
                            class131.field2096[arg6][arg9 + 1][arg8 + 1] = 50;
                        }
                    } else {
                        class131.field2096[arg6][arg9][arg8 + 1] = 50;
                    }
                }
                if (~var11.field2169 != -1 && arg0 != null) {
                    arg0.method202(var11.field2212, -80, arg9, arg5, arg8, arg10);
                }
            } else if (~arg5 == -3) {
                int var36 = 3 & arg10 + 1;
                class260 var38;
                class260 var40;
                if (var11.field2208 == -1 && var11.field2209 == null && !var11.field2233) {
                    class125 var37 = var11.method948(arg7, -84, var20, var21, var19, (class243) null, var22, arg10 + 4, var18, 2, var27);
                    var38 = var37.field2015;
                    class125 var39 = var11.method948(arg7, -49, var20, var21, var19, (class243) null, var22, var36, var18, 2, var27);
                    var40 = var39.field2015;
                } else {
                    var38 = new class148(arg2, 2, 4 - -arg10, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                    var40 = new class148(arg2, 2, var36, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                }
                class240.method1658(arg6, arg9, arg8, var19, var38, var40, class258.field4107[arg10], class258.field4107[var36], var25);
                if (var11.field2197 && arg7) {
                    if (arg10 == 0) {
                        class25.field418[arg6][arg9][arg8] = class220.method1495(class25.field418[arg6][arg9][arg8], 1);
                        class25.field418[arg6][arg9][arg8 - -1] = class220.method1495(class25.field418[arg6][arg9][arg8 - -1], 2);
                    } else if (~arg10 != -2) {
                        if (arg10 != 2) {
                            if (arg10 == 3) {
                                class25.field418[arg6][arg9][arg8] = class220.method1495(class25.field418[arg6][arg9][arg8], 2);
                                class25.field418[arg6][arg9][arg8] = class220.method1495(class25.field418[arg6][arg9][arg8], 1);
                            }
                        } else {
                            class25.field418[arg6][arg9 + 1][arg8] = class220.method1495(class25.field418[arg6][arg9 + 1][arg8], 1);
                            class25.field418[arg6][arg9][arg8] = class220.method1495(class25.field418[arg6][arg9][arg8], 2);
                        }
                    } else {
                        class25.field418[arg6][arg9][arg8 - -1] = class220.method1495(class25.field418[arg6][arg9][arg8 - -1], 2);
                        class25.field418[arg6][arg9 - -1][arg8] = class220.method1495(class25.field418[arg6][arg9 - -1][arg8], 1);
                    }
                }
                if (var11.field2169 != 0 && arg0 != null) {
                    arg0.method202(var11.field2212, -58, arg9, arg5, arg8, arg10);
                }
                if (var11.field2189 != 16) {
                    class207.method1429(arg6, arg9, arg8, var11.field2189);
                }
            } else if (arg5 == 3) {
                class260 var42;
                if (var11.field2208 == -1 && var11.field2209 == null && !var11.field2233) {
                    class125 var41 = var11.method948(arg7, -62, var20, var21, var19, (class243) null, var22, arg10, var18, 3, var27);
                    var42 = var41.field2015;
                } else {
                    var42 = new class148(arg2, 3, arg10, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                }
                class240.method1658(arg6, arg9, arg8, var19, var42, (class260) null, class278.field4381[arg10], 0, var25);
                if (var11.field2207 && arg7) {
                    if (arg10 == 0) {
                        class131.field2096[arg6][arg9][arg8 + 1] = 50;
                    } else if (arg10 == 1) {
                        class131.field2096[arg6][arg9 + 1][arg8 + 1] = 50;
                    } else if (arg10 == 2) {
                        class131.field2096[arg6][arg9 + 1][arg8] = 50;
                    } else if (arg10 == 3) {
                        class131.field2096[arg6][arg9][arg8] = 50;
                    }
                }
                if (var11.field2169 != 0 && arg0 != null) {
                    arg0.method202(var11.field2212, 103, arg9, arg5, arg8, arg10);
                }
            } else if (~arg5 == -10) {
                class260 var44;
                if (~var11.field2208 == 0 && var11.field2209 == null && !var11.field2233) {
                    class125 var43 = var11.method948(arg7, -47, var20, var21, var19, (class243) null, var22, arg10, var18, arg5, var27);
                    var44 = var43.field2015;
                } else {
                    var44 = new class148(arg2, arg5, arg10, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                }
                class41.method352(arg6, arg9, arg8, var19, 1, 1, var44, 0, var25);
                if (var11.field2169 != 0 && arg0 != null) {
                    arg0.method206(var11.field2212, var12, arg8, !arg3, arg9, var13);
                }
                if (~var11.field2189 != -17) {
                    class207.method1429(arg6, arg9, arg8, var11.field2189);
                }
            } else if (arg5 == 4) {
                class260 var46;
                if (var11.field2208 == -1 && var11.field2209 == null && !var11.field2233) {
                    class125 var45 = var11.method948(arg7, -103, var20, var21, var19, (class243) null, var22, arg10, var18, 4, var27);
                    var46 = var45.field2015;
                } else {
                    var46 = new class148(arg2, 4, arg10, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                }
                class285.method1918(arg6, arg9, arg8, var19, var46, (class260) null, class258.field4107[arg10], 0, 0, 0, var25);
            } else if (~arg5 == -6) {
                int var47 = 16;
                long var48 = class132.method928(arg6, arg9, arg8);
                if (~var48 != -1L) {
                    var47 = class209.method1447(Integer.MAX_VALUE & (int) (var48 >>> 32), -6653).field2189;
                }
                class260 var51;
                if (~var11.field2208 == 0 && var11.field2209 == null && !var11.field2233) {
                    class125 var50 = var11.method948(arg7, -11, var20, var21, var19, (class243) null, var22, arg10, var18, 4, var27);
                    var51 = var50.field2015;
                } else {
                    var51 = new class148(arg2, 4, arg10, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                }
                class285.method1918(arg6, arg9, arg8, var19, var51, (class260) null, class258.field4107[arg10], 0, class120.field1959[arg10] * var47, class99.field1635[arg10] * var47, var25);
            } else if (arg5 == 6) {
                int var52 = 8;
                long var53 = class132.method928(arg6, arg9, arg8);
                if (~var53 != -1L) {
                    var52 = class209.method1447(Integer.MAX_VALUE & (int) (var53 >>> 32), -6653).field2189 / 2;
                }
                class260 var56;
                if (~var11.field2208 == 0 && var11.field2209 == null && !var11.field2233) {
                    class125 var55 = var11.method948(arg7, -65, var20, var21, var19, (class243) null, var22, arg10 + 4, var18, 4, var27);
                    var56 = var55.field2015;
                } else {
                    var56 = new class148(arg2, 4, arg10 + 4, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                }
                class285.method1918(arg6, arg9, arg8, var19, var56, (class260) null, 256, arg10, class228.field3768[arg10] * var52, class186.field2952[arg10] * var52, var25);
            } else {
                if (!arg3) {
                    method419(-122, 92);
                }
                if (~arg5 == -8) {
                    int var57 = 3 & arg10 + 2;
                    class260 var59;
                    if (var11.field2208 == -1 && var11.field2209 == null && !var11.field2233) {
                        class125 var58 = var11.method948(arg7, -110, var20, var21, var19, (class243) null, var22, var57 + 4, var18, 4, var27);
                        var59 = var58.field2015;
                    } else {
                        var59 = new class148(arg2, 4, var57 + 4, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                    }
                    class285.method1918(arg6, arg9, arg8, var19, var59, (class260) null, 256, var57, 0, 0, var25);
                } else if (~arg5 == -9) {
                    int var60 = 8;
                    int var61 = 3 & arg10 + 2;
                    long var62 = class132.method928(arg6, arg9, arg8);
                    if (~var62 != -1L) {
                        var60 = class209.method1447(Integer.MAX_VALUE & (int) (var62 >>> 32), -6653).field2189 / 2;
                    }
                    class260 var65;
                    class260 var67;
                    if (~var11.field2208 == 0 && var11.field2209 == null && !var11.field2233) {
                        class125 var64 = var11.method948(arg7, -3, var20, var21, var19, (class243) null, var22, arg10 + 4, var18, 4, var27);
                        var65 = var64.field2015;
                        class125 var66 = var11.method948(arg7, -90, var20, var21, var19, (class243) null, var22, var61 - -4, var18, 4, var27);
                        var67 = var66.field2015;
                    } else {
                        var65 = new class148(arg2, 4, arg10 - -4, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                        var67 = new class148(arg2, 4, var61 + 4, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
                    }
                    class285.method1918(arg6, arg9, arg8, var19, var65, var67, 256, arg10, class228.field3768[arg10] * var60, class186.field2952[arg10] * var60, var25);
                }
            }
        } else {
            class260 var69;
            if (var11.field2208 == -1 && var11.field2209 == null && !var11.field2233) {
                class125 var68 = var11.method948(arg7, -99, var20, var21, var19, (class243) null, var22, ~arg5 != -12 ? arg10 : 4 - -arg10, var18, 10, var27);
                var69 = var68.field2015;
            } else {
                var69 = new class148(arg2, 10, arg5 == 11 ? arg10 + 4 : arg10, arg4, arg9, arg8, var11.field2208, var11.field2188, (class260) null);
            }
            if (var69 != null) {
                boolean var70 = class41.method352(arg6, arg9, arg8, var19, var12, var13, var69, 0, var25);
                if (var11.field2207 && var70 && arg7) {
                    int var71 = 15;
                    if (var69 instanceof class80) {
                        var71 = ((class80) var69).method583() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; ~var72 >= ~var12; ++var72) {
                        for (int var73 = 0; var13 >= var73; ++var73) {
                            if (class131.field2096[arg6][arg9 - -var72][arg8 + var73] < var71) {
                                class131.field2096[arg6][arg9 + var72][arg8 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (~var11.field2169 != -1 && arg0 != null) {
                arg0.method206(var11.field2212, var12, arg8, false, arg9, var13);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method417(boolean arg0, int arg1, int arg2) {
        if (arg2 != -3530) {
            method416((class22) null, true, -109, false, 8, -46, 55, false, 32, -63, -2);
        }
        ++field958;
        return arg0 && ~arg1 <= -1 ? class55.method414(arg0, arg1, (byte) 55, 10) : Integer.toString(arg1);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
    public static void method418(byte arg0) {
        if (arg0 != 50) {
            field967 = false;
        }
        field962 = null;
        field951 = null;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(II)V")
    public static final void method419(int arg0, int arg1) {
        int var2 = 41 / ((56 - arg0) / 62);
        ++field966;
        --class205.field3291;
        if (class205.field3291 != arg1) {
            class140.method971(class7.field88, arg1 + 1, class7.field88, arg1, class205.field3291 - arg1);
            class140.method971(class113.field1893, arg1 + 1, class113.field1893, arg1, -arg1 + class205.field3291);
            class140.method969(class6.field75, arg1 + 1, class6.field75, arg1, -arg1 + class205.field3291);
            class140.method974(class279.field4427, arg1 + 1, class279.field4427, arg1, -arg1 + class205.field3291);
            class140.method972(class214.field3506, arg1 - -1, class214.field3506, arg1, -arg1 + class205.field3291);
            class140.method969(class253.field4035, arg1 - -1, class253.field4035, arg1, -arg1 + class205.field3291);
            class140.method969(class200.field3190, arg1 - -1, class200.field3190, arg1, class205.field3291 - arg1);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([IIIII)V")
    public static final void method420(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field952;
        int var8 = arg4 - 1;
        int var5 = arg2 + var8;
        --arg3;
        while (~var5 < ~arg3) {
            int var6 = arg3 + 1;
            arg0[var6] = arg1;
            int var7 = var6 + 1;
            arg0[var7] = arg1;
            int var9 = var7 + 1;
            arg0[var9] = arg1;
            int var10 = var9 + 1;
            arg0[var10] = arg1;
            int var11 = var10 + 1;
            arg0[var11] = arg1;
            int var12 = var11 + 1;
            arg0[var12] = arg1;
            int var13 = var12 + 1;
            arg0[var13] = arg1;
            arg3 = var13 + 1;
            arg0[arg3] = arg1;
        }
        while (~var8 < ~arg3) {
            ++arg3;
            arg0[arg3] = arg1;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIILqh;)Lea;")
    public static final class37 method421(int arg0, int arg1, int arg2, class201 arg3) {
        ++field955;
        if (!class239.method1657(arg2, -117, arg0, arg3)) {
            return null;
        } else {
            if (arg1 != -17364) {
                field962 = null;
            }
            return class134.method939(false);
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class56() {
        super(3, false);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field115 = arg1.method1517((byte) -96) == 1;
            }
        } else {
            this.field956 = arg1.method1521((byte) 113) << 4;
        }
        if (arg0 <= 62) {
            method419(-94, 26);
        }
        ++field953;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqh;B)I")
    public static final int method422(class201 arg0, byte arg1) {
        ++field961;
        int var2 = 0;
        if (arg0.method1353(-9, class43.field790)) {
            ++var2;
        }
        if (arg0.method1353(arg1 ^ 76, class24.field402)) {
            ++var2;
        }
        if (arg1 != -48) {
            method421(-92, 112, -111, (class201) null);
        }
        return var2;
    }
}
