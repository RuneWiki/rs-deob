import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class199 extends class3 {

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "Lok;")
    public static class41 field3191 = class137.method956(":assistreq:", 45);

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field3199 = 0;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "Lda;")
    public static class212 field3196 = new class212();

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "[Ltb;")
    public static class199[] field3202;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "[S")
    public static short[] field3203;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V", line = 12)
    public static void method1411(int arg0) {
        if (arg0 == 63) {
            field3196 = null;
            field3202 = null;
            field3191 = null;
            field3203 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V", line = 26)
    public static final void method1412(boolean arg0) {
        if (class178.field2886 < class129.field1915) {
            class178.field2886 = (float) ((double) class178.field2886 / 30.0D + (double) class178.field2886);
            if (class129.field1915 < class178.field2886) {
                class178.field2886 = class129.field1915;
            }
            class317.method2188(-1);
        } else if (class178.field2886 > class129.field1915) {
            class178.field2886 = (float) ((double) class178.field2886 - (double) class178.field2886 / 30.0D);
            if (class129.field1915 > class178.field2886) {
                class178.field2886 = class129.field1915;
            }
            class317.method2188(-1);
        }
        if (class245.field3909 != -1 && class296.field4788 != -1) {
            int var1 = class245.field3909 - class45.field707;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class45.field707 += var1;
            int var2 = class296.field4788 - class110.field1565;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class296.field4788 = -1;
                class245.field3909 = -1;
            }
            class110.field1565 -= -var2;
            class317.method2188(-1);
        }
        field3190++;
        if (!arg0) {
            field3191 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;I)Lok;", line = 96)
    public static final class41 method1413(String arg0, int arg1) {
        field3192++;
        if (arg1 != -1) {
            return (class41) null;
        }
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class41 var4 = new class41();
        var4.field660 = var2;
        var4.field617 = 0;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field617++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIIIII)V", line = 140)
    public static final void method1414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3187++;
        int var11 = arg4 - arg9;
        int var12 = arg1 - arg7;
        if (arg1 < class66.field1004) {
            var12++;
        }
        if (arg4 < class212.field3414) {
            var11++;
        }
        if (arg3 < 35) {
            method1411(-79);
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg6 + ((var13 + 1) * arg0) >> 16;
            int var15 = arg6 + (arg0 * var13) >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = arg7 + var13 >> 6;
                if (var17 >= 0 && (class144.field2191.length - 1) >= var17) {
                    int var18 = arg5 + var14;
                    int[][] var19 = class144.field2191[var17];
                    byte[][] var20 = class277.field4539[var17];
                    int var21 = arg5 + var15;
                    byte[][] var22 = class64.field939[var17];
                    byte[][] var23 = class226.field3618[var17];
                    byte[][] var24 = class244.field3891[var17];
                    byte[][] var25 = class85.field1231[var17];
                    for (int var26 = 0; var26 < var11; var26++) {
                        int var27 = arg8 * var26 + arg2 >> 16;
                        int var28 = (var26 + 1) * arg8 + arg2 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg10 + var27;
                            int var31 = arg10 + var28;
                            int var32 = var26 + arg9 & 0x3F;
                            int var33 = var26 + arg9 >> 6;
                            int var34 = arg7 + var13 & 0x3F;
                            int var35 = (var32 << 6) + var34;
                            int var36;
                            if (var33 < 0 || var33 > (var19.length - 1) || var19[var33] == null) {
                                if (class169.field2676.field2559 != -1) {
                                    var36 = class169.field2676.field2559;
                                } else if ((arg7 + var13 & 0x4) == (arg9 + var26 & 0x4)) {
                                    var36 = class278.field4549[class146.field2227 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var33 < 0 || var33 > var19.length - 1) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class54.method383(var21, var30, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var19[var33][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var20[var33] == null ? 0 : class278.field4549[var20[var33][var35] & 0xFF];
                            int var38 = var23[var33] == null ? 0 : class278.field4549[var23[var33][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class54.method383(var21, var30, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var22[var33] == null ? 0 : var22[var33][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class54.method383(var21, var30, var16, var29, var37);
                                    } else {
                                        class10.method37(var16, var40 >> 2, class54.field801, var29, var36, var37, true, false, var21, var39 & 0x3, var30);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var25[var33][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class54.method383(var21, var30, var16, var29, var38);
                                    }
                                    class10.method37(var16, var42 >> 2, class54.field801, var29, 0, var38, var37 == 0, false, var21, var41 & 0x3, var30);
                                }
                            }
                            if (var24[var33] != null) {
                                int var43 = var24[var33][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var21;
                                    } else {
                                        var44 = var18 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var30;
                                    } else {
                                        var45 = var31 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var46 = 13369344;
                                        var43 -= 4;
                                    }
                                    if (var43 == 1) {
                                        class54.method377(var21, var30, var29, var46);
                                    } else if (var43 == 2) {
                                        class54.method368(var21, var30, var16, var46);
                                    } else if (var43 == 3) {
                                        class54.method377(var44, var30, var29, var46);
                                    } else if (var43 == 4) {
                                        class54.method368(var21, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class54.method377(var21, var30, var29, 16777215);
                                        class54.method368(var21, var30, var16, var46);
                                    } else if (var43 == 10) {
                                        class54.method377(var44, var30, var29, 16777215);
                                        class54.method368(var21, var30, var16, var46);
                                    } else if (var43 == 11) {
                                        class54.method377(var44, var30, var29, 16777215);
                                        class54.method368(var21, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class54.method377(var21, var30, var29, 16777215);
                                        class54.method368(var21, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class54.method368(var21, var30, 1, var46);
                                    } else if (var43 == 18) {
                                        class54.method368(var44, var30, 1, var46);
                                    } else if (var43 == 19) {
                                        class54.method368(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class54.method368(var21, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class54.method368(var21 + var48, var45 - var48, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class54.method368(var21 + var47, var30 + var47, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg5 + var14;
                    int var50 = arg5 + var15;
                    for (int var51 = 0; var51 < var11; var51++) {
                        int var52 = (arg8 * var51 + arg2 >> 16) + arg10;
                        int var53;
                        if (class169.field2676.field2559 != -1) {
                            var53 = class169.field2676.field2559;
                        } else if ((var51 + arg9 & 0x4) == (arg7 + var13 & 0x4)) {
                            var53 = class278.field4549[class146.field2227 + 1];
                        } else {
                            var53 = 4936552;
                        }
                        int var54 = (arg2 + ((var51 + 1) * arg8) >> 16) + arg10;
                        int var55 = var54 - var52;
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        class54.method383(var50, var52, var16, var55, var53);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < var12 + 2; var56++) {
            int var57 = arg0 * var56 + arg6 >> 16;
            int var58 = arg6 + ((var56 + 1) * arg0) >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                var10000 = arg5 + var58;
                int var61 = arg5 + var57;
                int var62 = arg7 + var56 >> 6;
                if (var62 >= 0 && var62 <= (class307.field5164.length - 1)) {
                    short[][] var63 = class307.field5164[var62];
                    for (int var64 = -2; var64 < var11 + 2; var64++) {
                        int var65 = arg2 + (arg8 * var64) >> 16;
                        int var66 = (var64 + 1) * arg8 + arg2 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg10 + var66;
                            int var69 = arg9 + var64 >> 6;
                            int var70 = arg10 + var65;
                            if (var69 >= 0 && (var63.length - 1) >= var69) {
                                int var71 = ((arg9 + var64 & 0x3F) << 6) + (var56 + arg7 & 0x3F);
                                if (var63[var69] != null) {
                                    int var72 = var63[var69][var71] & 0x3FFF;
                                    int var73 = (var63[var69][var71] & 0xC36E) >> 14;
                                    if (var72 != 0) {
                                        if (var73 == 0) {
                                            int var74 = class249.field3966[var72 - 1].field5292 * var59 / 4;
                                            int var75 = class249.field3966[var72 - 1].field5291 * var67 / 4;
                                            int var76 = class249.field3966[var72 - 1].field5300 * var67 / 4;
                                            class249.field3966[var72 - 1].method1971(var61, var70 - var76, var74, var75);
                                        } else if (var73 == 1) {
                                            int var77 = class10.field131[var72 - 1].field5292 * var59 / 4;
                                            int var78 = class10.field131[var72 - 1].field5300 * var67 / 4;
                                            int var79 = class10.field131[var72 - 1].field5291 * var67 / 4;
                                            class10.field131[var72 - 1].method1971(var61, var70 - var78, var77, var79);
                                        } else if (var73 == 2) {
                                            int var83 = class235.field3770[var72 - 1].field5292 * var59 / 4;
                                            int var84 = class235.field3770[var72 - 1].field5291 * var67 / 4;
                                            int var85 = class235.field3770[var72 - 1].field5300 * var67 / 4;
                                            class235.field3770[var72 - 1].method1971(var61, var70 - var85, var83, var84);
                                        } else if (var73 == 3) {
                                            int var80 = class107.field1515[var72 - 1].field5292 * var59 / 4;
                                            int var81 = class107.field1515[var72 - 1].field5300 * var67 / 4;
                                            int var82 = class107.field1515[var72 - 1].field5291 * var67 / 4;
                                            class107.field1515[var72 - 1].method1971(var61, var70 - var81, var80, var82);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIIII)V", line = 572)
    public final void method1415(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3197++;
        int var6 = -113 / ((arg3 - 56) / 54);
        int var7 = this.field3201 << 3;
        int var8 = this.field3194 << 3;
        int var9 = (arg1 << 4) + (var8 & 0xF);
        int var10 = (arg2 << 4) + (var7 & 0xF);
        this.method84(var7, var8, var10, var9, arg0, arg4);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[Ldg;)V", line = 595)
    public static final void method1416(int arg0, class6[] arg1) {
        class134.field2010[arg0] = arg1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
    public abstract void method79(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
    public abstract void method90(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V")
    public abstract void method80(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
    public abstract void method83(int arg0, int arg1);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIII)V")
    public abstract void method84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
    public abstract void method77(int arg0, int arg1);
}
