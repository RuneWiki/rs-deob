import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class16 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Lad;")
    public static class128 field182 = new class128();

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Z")
    public static boolean field188 = false;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field189 = "glow3:";

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Llb;")
    public static class211 field185;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "[Z")
    public static boolean[] field190;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([[I[[FI[[BBI[[B[[B[Lcj;[[F[[F[[B)V", line = 6)
    public static final void method120(int[][] arg0, float[][] arg1, int arg2, byte[][] arg3, byte arg4, int arg5, byte[][] arg6, byte[][] arg7, class318[] arg8, float[][] arg9, float[][] arg10, byte[][] arg11) {
        if (arg4 <= 120) {
            return;
        }
        for (int var12 = 0; var12 < arg5; var12++) {
            class318 var13 = arg8[var12];
            if (var13.field4937 == arg2) {
                class216 var14 = new class216();
                int var15 = 0;
                int var16 = (var13.field4931 >> 7) - var13.field4941;
                int var17 = (var13.field4952 >> 7) - var13.field4941;
                if (var17 < 0) {
                    var15 -= var17;
                    var17 = 0;
                }
                int var18 = (var13.field4952 >> 7) + var13.field4941;
                if (var18 > 103) {
                    var18 = 103;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field4950[var15];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg3[var23][var19] & 0xFF;
                        int var25 = arg6[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class319 var27 = class116.method904((byte) 103, var25 - 1);
                            if (var27.field4977 == -1) {
                                continue;
                            }
                            if (arg11[var23][var19] != 0) {
                                int[] var28 = class138.field2155[arg11[var23][var19]];
                                var14.field3415 += (var28.length >> 1) * 3 - 6;
                                var14.field3409 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class319 var29 = class116.method904((byte) 117, var25 - 1);
                            if (var29.field4977 == -1) {
                                byte var31 = arg11[var23][var19];
                                if (var31 != 0) {
                                    int[] var32 = class86.field1264[var31];
                                    var14.field3415 += (var32.length >> 1) * 3 - 6;
                                    var14.field3409 += var32.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg11[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class91 var33 = class83.method681(arg2, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field1327 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int var38 = (int) (var33.field1327 >> 20) & 0x3;
                                int[] var39 = null;
                                if ((var38 & 0x1) == 0) {
                                    boolean var40 = (var23 + 1) <= var22;
                                    boolean var41 = var23 - 1 >= var21;
                                    if (!var41 && var18 >= (var19 + 1)) {
                                        short var42 = var13.field4950[var15 + 1];
                                        int var43 = (var42 >> 8) + var16;
                                        int var44 = (var42 & 0xFF) + var43;
                                        var41 = var23 > var43 && var44 > var23;
                                    }
                                    if (!var40 && var17 <= (var19 - 1)) {
                                        short var45 = var13.field4950[var15 - 1];
                                        int var46 = (var45 >> 8) + var16;
                                        int var47 = (var45 & 0xFF) + var46;
                                        var40 = var46 < var23 && var23 < var47;
                                    }
                                    if (var41 && var40) {
                                        var39 = class138.field2155[0];
                                    } else if (var41) {
                                        var39 = class138.field2155[1];
                                    } else if (var40) {
                                        var39 = class138.field2155[1];
                                    }
                                } else {
                                    boolean var48 = (var23 - 1) >= var21;
                                    boolean var49 = (var23 + 1) <= var22;
                                    if (!var48 && var19 - 1 >= var17) {
                                        short var50 = var13.field4950[var15 - 1];
                                        int var51 = var16 + (var50 >> 8);
                                        int var52 = var51 + (var50 & 0xFF);
                                        var48 = var23 > var51 && var23 < var52;
                                    }
                                    if (!var49 && var18 >= var19 + 1) {
                                        short var53 = var13.field4950[var15 + 1];
                                        int var54 = (var53 >> 8) + var16;
                                        int var55 = (var53 & 0xFF) + var54;
                                        var49 = var54 < var23 && var55 > var23;
                                    }
                                    if (var48 && var49) {
                                        var39 = class138.field2155[0];
                                    } else if (var48) {
                                        var39 = class138.field2155[1];
                                    } else if (var49) {
                                        var39 = class138.field2155[1];
                                    }
                                }
                                if (var39 != null) {
                                    var14.field3415 += ((var39.length >> 1) - 2) * 3;
                                    var14.field3409 += var39.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var35 = class138.field2155[arg11[var23][var19]];
                            int[] var36 = class86.field1264[arg11[var23][var19]];
                            var14.field3415 += (var35.length >> 1) * 3 - 6;
                            var14.field3415 += ((var36.length >> 1) - 2) * 3;
                            var14.field3409 += var35.length >> 1;
                            var14.field3409 += var36.length >> 1;
                        } else {
                            int[] var37 = class138.field2155[0];
                            var14.field3415 += (var37.length >> 1) * 3 - 6;
                            var14.field3409 += var37.length >> 1;
                        }
                    }
                    var15++;
                }
                var14.method1547();
                int var56 = 0;
                if ((var13.field4952 >> 7) - var13.field4941 < 0) {
                    var56 -= (var13.field4952 >> 7) - var13.field4941;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field4950[var56];
                    int var59 = (var58 >> 8) + var16;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg7[var61][var57];
                        int var63 = arg6[var61][var57] & 0xFF;
                        boolean var64 = false;
                        int var65 = arg3[var61][var57] & 0xFF;
                        if (var65 == 0) {
                            if (var63 == 0) {
                                continue;
                            }
                            class319 var68 = class116.method904((byte) -73, var63 - 1);
                            if (var68.field4977 == -1) {
                                continue;
                            }
                            if (arg11[var61][var57] != 0) {
                                class54.method479(18659, arg9, arg7[var61][var57], var13, class138.field2155[arg11[var61][var57]], var14, arg10, var57, var61, arg0, arg1);
                                continue;
                            }
                        } else if (var63 != 0) {
                            class319 var66 = class116.method904((byte) 56, var63 - 1);
                            if (var66.field4977 == -1) {
                                class54.method479(18659, arg9, arg7[var61][var57], var13, class86.field1264[arg11[var61][var57]], var14, arg10, var57, var61, arg0, arg1);
                                continue;
                            }
                            byte var67 = arg11[var61][var57];
                            if (var67 != 0) {
                                var64 = true;
                            }
                        }
                        class91 var69 = class83.method681(arg2, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field1327 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int var71 = (int) (var69.field1327 >> 20) & 0x3;
                                int[] var72 = null;
                                if ((var71 & 0x1) == 0) {
                                    boolean var73 = var61 + 1 <= var60;
                                    boolean var74 = var59 <= var61 - 1;
                                    if (!var74 && var57 + 1 <= var18) {
                                        short var75 = var13.field4950[var56 + 1];
                                        int var76 = (var75 >> 8) + var16;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var74 = var61 > var76 && var61 < var77;
                                    }
                                    if (!var73 && var17 <= (var57 - 1)) {
                                        short var78 = var13.field4950[var56 - 1];
                                        int var79 = (var78 >> 8) + var16;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var73 = var61 > var79 && var61 < var80;
                                    }
                                    if (var74 && var73) {
                                        var72 = class138.field2155[0];
                                    } else if (var74) {
                                        var62 = 1;
                                        var72 = class138.field2155[1];
                                    } else if (var73) {
                                        var72 = class138.field2155[1];
                                        var62 = 3;
                                    }
                                } else {
                                    boolean var81 = var59 <= var61 - 1;
                                    if (!var81 && var57 - 1 >= var17) {
                                        short var82 = var13.field4950[var56 - 1];
                                        int var83 = var16 + (var82 >> 8);
                                        int var84 = (var82 & 0xFF) + var83;
                                        var81 = var61 > var83 && var84 > var61;
                                    }
                                    boolean var85 = var60 >= (var61 + 1);
                                    if (!var85 && var18 >= var57 + 1) {
                                        short var86 = var13.field4950[var56 + 1];
                                        int var87 = (var86 >> 8) + var16;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var85 = var87 < var61 && var88 > var61;
                                    }
                                    if (var81 && var85) {
                                        var72 = class138.field2155[0];
                                    } else if (var81) {
                                        var72 = class138.field2155[1];
                                        var62 = 0;
                                    } else if (var85) {
                                        var72 = class138.field2155[1];
                                        var62 = 2;
                                    }
                                }
                                if (var72 != null) {
                                    class54.method479(18659, arg9, var62, var13, var72, var14, arg10, var57, var61, arg0, arg1);
                                }
                                continue;
                            }
                        }
                        if (var64) {
                            class54.method479(18659, arg9, arg7[var61][var57], var13, class86.field1264[arg11[var61][var57]], var14, arg10, var57, var61, arg0, arg1);
                            class54.method479(18659, arg9, arg7[var61][var57], var13, class138.field2155[arg11[var61][var57]], var14, arg10, var57, var61, arg0, arg1);
                        } else {
                            class54.method479(18659, arg9, var62, var13, class138.field2155[0], var14, arg10, var57, var61, arg0, arg1);
                        }
                    }
                    var56++;
                }
                if (var14.field3405 > 0 && var14.field3414 > 0) {
                    var14.method1548();
                    var13.field4944 = var14;
                }
            }
        }
        field187++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V", line = 538)
    public static final void method121(boolean arg0) {
        field183++;
        class96.field1405.method1142((byte) 61);
        for (int var1 = 0; var1 < 32; var1++) {
            class328.field5079[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class130.field2030[var2] = 0L;
        }
        class178.field2668 = 0;
        if (arg0) {
            method123(-31, true, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 565)
    public static void method122(byte arg0) {
        if (arg0 != 7) {
            method123(-2, false, (byte[]) null);
        }
        field185 = null;
        field190 = null;
        field189 = null;
        field182 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ[B)I", line = 581)
    public static final int method123(int arg0, boolean arg1, byte[] arg2) {
        field184++;
        return arg1 ? class10.method81(arg2, arg0, 0, (byte) 68) : -21;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V", line = 598)
    public static final void method124(int arg0, int arg1) {
        class241.field3631 = arg0;
        field186++;
        class45.field713 = -1;
        class45.field713 = arg1;
        class62.method546(arg1 - 105);
    }
}
