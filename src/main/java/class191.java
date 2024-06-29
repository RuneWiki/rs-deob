import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class191 extends class217 {

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "[Lfc;")
    public static class250[] field3236 = new class250[29];

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Lsf;")
    public static class124 field3242 = new class124(2);

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public int field3237;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "Lek;")
    public static class206 field3241;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Ljava/lang/String;")
    public String field3235;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "Ljava/lang/String;")
    public String field3240;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "[[Lko;")
    public static class134[][] field3233;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)Z", line = 4)
    public static final boolean method1318(int arg0) {
        if (arg0 != -27525) {
            field3236 = (class250[]) null;
        }
        field3239++;
        return class222.field3671 == 0 ? class349.field5586.method2448(arg0 ^ 0xFFFFF823) : true;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 21)
    public static final String method1319(int arg0, boolean arg1) {
        if (arg1) {
            field3233 = (class134[][]) ((class134[][]) null);
        }
        field3238++;
        return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)Z", line = 36)
    public static final boolean method1320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class91.field1614 * arg3 + class340.field5379 * arg0 >> 16;
        int var6 = class340.field5379 * arg3 - class91.field1614 * arg0 >> 16;
        int var7 = class86.field1496 * var6 + class16.field474 * arg1 >> 16;
        int var8 = class86.field1496 * arg1 - class16.field474 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class86.field1496 * var6 + class16.field474 * arg2 >> 16;
        int var12 = class86.field1496 * arg2 - class16.field474 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class22.field559 && var13 < class22.field559) {
            return false;
        } else if (var9 > class349.field5581 && var13 > class349.field5581) {
            return false;
        } else if (var10 < class349.field5587 && var14 < class349.field5587) {
            return false;
        } else {
            return var10 <= class7.field264 || var14 <= class7.field264;
        }
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V", line = 83)
    public static void method1321(int arg0) {
        field3233 = (class134[][]) null;
        field3236 = null;
        if (arg0 != -14210) {
            method1321(69);
        }
        field3241 = null;
        field3242 = null;
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V", line = 98)
    public static final void method1322(int arg0) {
        field3231++;
        class277.method1963(arg0 - 605);
        class280.method1980((byte) -45);
        class344.method2419(-128);
        class41.method319(104);
        class72.method546(127);
        class338.method2391((byte) 49);
        class223.method1562(64);
        class192.method1332(15);
        class15.method153(-1);
        class15.method155((byte) -127);
        class15.method154((byte) 82);
        class79.method599(0);
        class158.method1138((byte) 108);
        class103.method779(true);
        class19.method178(21325);
        class197.method1348(-120);
        class338.method2388((byte) 21);
        class244.method1727((byte) -46);
        class233.method1624((byte) 30);
        class336.method2367(0);
        class244.method1728(0);
        class7.field228.method895(128);
        if (arg0 != -5388) {
            field3242 = (class124) null;
        }
        class23.field573.method895(128);
        class296.field4832.method895(128);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V", line = 133)
    public static final void method1323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class344.method2417(class232.field3799[arg1], arg5 - arg0, arg5 - -arg0, arg4, (byte) -118);
        int var6 = arg2;
        field3230++;
        int var7 = arg3 * arg3;
        int var8 = arg3;
        int var9 = arg0 * arg0;
        int var10 = var7 << 1;
        int var11 = arg3 << 1;
        int var12 = var9 << 1;
        int var13 = (1 - var11) * var9 + var10;
        int var14 = var9 << 2;
        int var15 = var7 << 2;
        int var16 = ((arg2 << 1) + 3) * var10;
        int var17 = var7 - (var11 - 1) * var12;
        int var18 = (arg2 + 1) * var15;
        int var19 = ((arg3 << 1) - 3) * var12;
        int var20 = (arg3 - 1) * var14;
        while (var8 > 0) {
            var8--;
            int var21 = arg1 - var8;
            int var22 = arg1 + var8;
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var17 += var18;
                    var18 += var15;
                    var13 += var16;
                    var16 += var15;
                }
            }
            if (var17 < 0) {
                var13 += var16;
                var17 += var18;
                var16 += var15;
                var18 += var15;
                var6++;
            }
            var13 += -var20;
            var17 += -var19;
            var20 -= var14;
            var19 -= var14;
            int var23 = arg5 + var6;
            int var24 = arg5 - var6;
            class344.method2417(class232.field3799[var21], var24, var23, arg4, (byte) -124);
            class344.method2417(class232.field3799[var22], var24, var23, arg4, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "(I)Lhg;", line = 221)
    public final class194 method1324(int arg0) {
        field3229++;
        return arg0 == -1482557983 ? class339.field5377[this.field3614] : (class194) null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([[B[[BI[[B[[F[Lsd;II[[B[[F[[F[[I)V", line = 237)
    public static final void method1325(byte[][] arg0, byte[][] arg1, int arg2, byte[][] arg3, float[][] arg4, class33[] arg5, int arg6, int arg7, byte[][] arg8, float[][] arg9, float[][] arg10, int[][] arg11) {
        for (int var12 = 0; var12 < arg6; var12++) {
            class33 var13 = arg5[var12];
            if (var13.field746 == arg7) {
                class63 var14 = new class63();
                int var15 = 0;
                int var16 = (var13.field750 >> 7) - var13.field723;
                int var17 = (var13.field733 >> 7) - var13.field723;
                if (var17 < 0) {
                    var15 -= var17;
                    var17 = 0;
                }
                int var18 = (var13.field733 >> 7) + var13.field723;
                if (var18 > 103) {
                    var18 = 103;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field743[var15];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg8[var23][var19] & 0xFF;
                        int var25 = arg0[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class352 var27 = class131.method929(var25 - 1, 8);
                            if (var27.field5634 == -1) {
                                continue;
                            }
                            if (arg3[var23][var19] != 0) {
                                int[] var28 = class356.field5674[arg3[var23][var19]];
                                var14.field1215 += ((var28.length >> 1) - 2) * 3;
                                var14.field1214 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class352 var29 = class131.method929(var25 - 1, 8);
                            if (var29.field5634 == -1) {
                                byte var54 = arg3[var23][var19];
                                if (var54 != 0) {
                                    int[] var55 = class132.field2266[var54];
                                    var14.field1215 += ((var55.length >> 1) - 2) * 3;
                                    var14.field1214 += var55.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg3[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class278 var31 = class25.method209(arg7, var23, var19);
                        if (var31 != null) {
                            int var32 = (int) (var31.field4527 >> 14) & 0x3F;
                            if (var32 == 9) {
                                int[] var36 = null;
                                int var37 = (int) (var31.field4527 >> 20) & 0x3;
                                if ((var37 & 0x1) == 0) {
                                    boolean var38 = var23 - 1 >= var21;
                                    boolean var39 = var23 + 1 <= var22;
                                    if (!var38 && var19 + 1 <= var18) {
                                        short var40 = var13.field743[var15 + 1];
                                        int var41 = (var40 >> 8) + var16;
                                        int var42 = (var40 & 0xFF) + var41;
                                        var38 = var41 < var23 && var42 > var23;
                                    }
                                    if (!var39 && var17 <= (var19 - 1)) {
                                        short var43 = var13.field743[var15 - 1];
                                        int var44 = (var43 >> 8) + var16;
                                        int var45 = (var43 & 0xFF) + var44;
                                        var39 = var23 > var44 && var45 > var23;
                                    }
                                    if (var38 && var39) {
                                        var36 = class356.field5674[0];
                                    } else if (var38) {
                                        var36 = class356.field5674[1];
                                    } else if (var39) {
                                        var36 = class356.field5674[1];
                                    }
                                } else {
                                    boolean var46 = var23 - 1 >= var21;
                                    boolean var47 = var22 >= (var23 + 1);
                                    if (!var46 && var17 <= (var19 - 1)) {
                                        short var48 = var13.field743[var15 - 1];
                                        int var49 = (var48 >> 8) + var16;
                                        int var50 = (var48 & 0xFF) + var49;
                                        var46 = var49 < var23 && var50 > var23;
                                    }
                                    if (!var47 && var18 >= var19 + 1) {
                                        short var51 = var13.field743[var15 + 1];
                                        int var52 = (var51 >> 8) + var16;
                                        int var53 = (var51 & 0xFF) + var52;
                                        var47 = var52 < var23 && var23 < var53;
                                    }
                                    if (var46 && var47) {
                                        var36 = class356.field5674[0];
                                    } else if (var46) {
                                        var36 = class356.field5674[1];
                                    } else if (var47) {
                                        var36 = class356.field5674[1];
                                    }
                                }
                                if (var36 != null) {
                                    var14.field1215 += (var36.length >> 1) * 3 - 6;
                                    var14.field1214 += var36.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var34 = class132.field2266[arg3[var23][var19]];
                            int[] var35 = class356.field5674[arg3[var23][var19]];
                            var14.field1215 += (var35.length >> 1) * 3 - 6;
                            var14.field1215 += (var34.length >> 1) * 3 - 6;
                            var14.field1214 += var35.length >> 1;
                            var14.field1214 += var34.length >> 1;
                        } else {
                            int[] var33 = class356.field5674[0];
                            var14.field1215 += (var33.length >> 1) * 3 - 6;
                            var14.field1214 += var33.length >> 1;
                        }
                    }
                    var15++;
                }
                int var56 = 0;
                var14.method511();
                if (((var13.field733 >> 7) - var13.field723) < 0) {
                    var56 -= (var13.field733 >> 7) - var13.field723;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field743[var56];
                    int var59 = (var58 >> 8) + var16;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg1[var61][var57];
                        int var63 = arg8[var61][var57] & 0xFF;
                        int var64 = arg0[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var63 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class352 var68 = class131.method929(var64 - 1, arg2 + 10);
                            if (var68.field5634 == -1) {
                                continue;
                            }
                            if (arg3[var61][var57] != 0) {
                                class37.method269(class356.field5674[arg3[var61][var57]], var57, var14, var13, arg10, var61, -115, arg11, arg9, arg1[var61][var57], arg4);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class352 var66 = class131.method929(var64 - 1, 8);
                            if (var66.field5634 == -1) {
                                class37.method269(class132.field2266[arg3[var61][var57]], var57, var14, var13, arg10, var61, -103, arg11, arg9, arg1[var61][var57], arg4);
                                continue;
                            }
                            byte var67 = arg3[var61][var57];
                            if (var67 != 0) {
                                var65 = true;
                            }
                        }
                        class278 var69 = class25.method209(arg7, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field4527 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field4527 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = var61 + 1 <= var60;
                                    boolean var82 = (var61 - 1) >= var59;
                                    if (!var82 && (var57 + 1) <= var18) {
                                        short var83 = var13.field743[var56 + 1];
                                        int var84 = (var83 >> 8) + var16;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var82 = var84 < var61 && var85 > var61;
                                    }
                                    if (!var81 && var17 <= var57 - 1) {
                                        short var86 = var13.field743[var56 - 1];
                                        int var87 = var16 + (var86 >> 8);
                                        int var88 = (var86 & 0xFF) + var87;
                                        var81 = var61 > var87 && var61 < var88;
                                    }
                                    if (var82 && var81) {
                                        var71 = class356.field5674[0];
                                    } else if (var82) {
                                        var62 = 1;
                                        var71 = class356.field5674[1];
                                    } else if (var81) {
                                        var71 = class356.field5674[1];
                                        var62 = 3;
                                    }
                                } else {
                                    boolean var73 = var61 - 1 >= var59;
                                    boolean var74 = var61 + 1 <= var60;
                                    if (!var73 && var17 <= (var57 - 1)) {
                                        short var75 = var13.field743[var56 - 1];
                                        int var76 = (var75 >> 8) + var16;
                                        int var77 = var76 + (var75 & 0xFF);
                                        var73 = var61 > var76 && var61 < var77;
                                    }
                                    if (!var74 && (var57 + 1) <= var18) {
                                        short var78 = var13.field743[var56 + 1];
                                        int var79 = var16 + (var78 >> 8);
                                        int var80 = var79 + (var78 & 0xFF);
                                        var74 = var79 < var61 && var61 < var80;
                                    }
                                    if (var73 && var74) {
                                        var71 = class356.field5674[0];
                                    } else if (var73) {
                                        var62 = 0;
                                        var71 = class356.field5674[1];
                                    } else if (var74) {
                                        var62 = 2;
                                        var71 = class356.field5674[1];
                                    }
                                }
                                if (var71 != null) {
                                    class37.method269(var71, var57, var14, var13, arg10, var61, arg2 ^ 0x48, arg11, arg9, var62, arg4);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class37.method269(class132.field2266[arg3[var61][var57]], var57, var14, var13, arg10, var61, -102, arg11, arg9, arg1[var61][var57], arg4);
                            class37.method269(class356.field5674[arg3[var61][var57]], var57, var14, var13, arg10, var61, -79, arg11, arg9, arg1[var61][var57], arg4);
                        } else {
                            class37.method269(class356.field5674[0], var57, var14, var13, arg10, var61, arg2 ^ 0x5F, arg11, arg9, var62, arg4);
                        }
                    }
                    var56++;
                }
                if (var14.field1226 > 0 && var14.field1223 > 0) {
                    var14.method509();
                    var13.field744 = var14;
                }
            }
        }
        if (arg2 != -2) {
            method1325((byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), -49, (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (class33[]) null, 75, 38, (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (int[][]) ((int[][]) null));
        }
        field3234++;
    }
}
