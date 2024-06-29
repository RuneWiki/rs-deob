import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class246 extends class7 {

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field3875 = null;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "[[[B")
    public static byte[][][] field3876;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lq;")
    public static final class205 method1633(int arg0, int arg1) {
        class205 var2 = (class205) class242.field3836.method1155((long) arg1, true);
        field3877++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class127.field2104.method900(arg0, arg1, false);
        class205 var4 = new class205();
        if (var3 != null) {
            var4.method1381(-59, new class136(var3), arg1);
        }
        class242.field3836.method1161(var4, (byte) -106, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lne;Lig;BI)V")
    public static final void method1634(class78 arg0, class136 arg1, byte arg2, int arg3) {
        field3873++;
        int var4 = -44 / ((-arg2 - 79) / 40);
        class150 var5 = new class150();
        var5.field2459 = arg1.method1012(4);
        var5.field2453 = arg1.method1022(-63);
        var5.field2454 = new int[var5.field2459];
        var5.field2455 = new class115[var5.field2459];
        var5.field2451 = new class115[var5.field2459];
        var5.field2452 = new byte[var5.field2459][][];
        var5.field2460 = new int[var5.field2459];
        var5.field2450 = new int[var5.field2459];
        for (int var6 = 0; var6 < var5.field2459; var6++) {
            try {
                int var7 = arg1.method1012(4);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var8 = arg1.method1010(-128);
                    int var9 = 0;
                    String var10 = arg1.method1010(-123);
                    if (var7 == 1) {
                        var9 = arg1.method1022(-83);
                    }
                    var5.field2450[var6] = var7;
                    var5.field2460[var6] = var9;
                    var5.field2455[var6] = arg0.method638(class183.method1279((byte) -71, var8), var10, false);
                } else if (var7 == 3 || var7 == 4) {
                    String var11 = arg1.method1010(-121);
                    String var12 = arg1.method1010(-110);
                    int var13 = arg1.method1012(4);
                    String[] var14 = new String[var13];
                    for (int var15 = 0; var15 < var13; var15++) {
                        var14[var15] = arg1.method1010(-120);
                    }
                    byte[][] var16 = new byte[var13][];
                    if (var7 == 3) {
                        for (int var17 = 0; var17 < var13; var17++) {
                            int var18 = arg1.method1022(-86);
                            var16[var17] = new byte[var18];
                            arg1.method1018(var16[var17], 0, var18, true);
                        }
                    }
                    Class[] var19 = new Class[var13];
                    var5.field2450[var6] = var7;
                    for (int var20 = 0; var20 < var13; var20++) {
                        var19[var20] = class183.method1279((byte) -111, var14[var20]);
                    }
                    var5.field2451[var6] = arg0.method634(var12, var19, 3, class183.method1279((byte) -119, var11));
                    var5.field2452[var6] = var16;
                }
            } catch (ClassNotFoundException var21) {
                var5.field2454[var6] = -1;
            } catch (SecurityException var22) {
                var5.field2454[var6] = -2;
            } catch (NullPointerException var23) {
                var5.field2454[var6] = -3;
            } catch (Exception var24) {
                var5.field2454[var6] = -4;
            } catch (Throwable var25) {
                var5.field2454[var6] = -5;
            }
        }
        class294.field4664.method1809(5, var5);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)V")
    public static final void method1635(int arg0, int arg1, int arg2, int arg3) {
        class129 var4 = class26.field455[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class195 var5 = var4.field2143;
        if (var5 != null) {
            var5.field3193 = var5.field3193 * arg3 / 16;
            var5.field3189 = var5.field3189 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public static void method1636(int arg0) {
        field3875 = null;
        field3876 = null;
        if (arg0 != 2) {
            field3875 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII[IZIIIII)V")
    public static final void method1637(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3874++;
        int var11 = arg8;
        if (class63.field1056 <= arg8) {
            return;
        }
        if (arg8 < class63.field1050) {
            var11 = class63.field1050;
        }
        int var12 = arg8 + arg9;
        if (var12 <= class63.field1050) {
            return;
        }
        int var13 = arg1;
        if (var12 > class63.field1056) {
            var12 = class63.field1056;
        }
        if (class63.field1055 <= arg1) {
            return;
        }
        if (class63.field1052 > arg1) {
            var13 = class63.field1052;
        }
        int var14 = arg0 + arg1;
        if (var14 <= class63.field1052) {
            return;
        }
        if (arg3 == 9) {
            arg3 = 1;
            arg6 = arg6 + 1 & 0x3;
        }
        if (class63.field1055 < var14) {
            var14 = class63.field1055;
        }
        int var15 = var14 - arg1;
        if (arg7 <= 13) {
            return;
        }
        if (arg3 == 10) {
            arg3 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        if (arg3 == 11) {
            arg6 = arg6 + 3 & 0x3;
            arg3 = 8;
        }
        int var16 = class63.field1049 + var11 - var12;
        int var17 = var12 - arg8;
        int var18 = class63.field1049 * var13 + var11;
        int var19 = arg9 - var17;
        int var20 = arg0 - var15;
        int var21 = var11 - arg8;
        int var22 = arg9 - var21;
        int var23 = var13 - arg1;
        int var24 = arg0 - var23;
        if (arg3 == 1) {
            if (arg6 == 0) {
                for (int var25 = var23; var25 < var15; var25++) {
                    for (int var26 = var21; var26 < var17; var26++) {
                        if (var25 >= var26) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg6 == 1) {
                for (int var27 = var24 - 1; var27 >= var20; var27--) {
                    for (int var28 = var21; var28 < var17; var28++) {
                        if (var28 <= var27) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg6 == 2) {
                for (int var29 = var23; var29 < var15; var29++) {
                    for (int var30 = var21; var30 < var17; var30++) {
                        if (var30 >= var29) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg6 == 3) {
                for (int var31 = var24 - 1; var31 >= var20; var31--) {
                    for (int var32 = var21; var32 < var17; var32++) {
                        if (var31 <= var32) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            }
        } else if (arg3 == 2) {
            if (arg6 == 0) {
                for (int var33 = var24 - 1; var33 >= var20; var33--) {
                    for (int var34 = var21; var34 < var17; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg6 == 1) {
                for (int var35 = var23; var35 < var15; var35++) {
                    for (int var36 = var21; var36 < var17; var36++) {
                        if (var18 >= 0 && arg4.length > var18) {
                            if (var36 >= var35 << 1) {
                                arg4[var18] = arg2;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        } else {
                            var18++;
                        }
                    }
                    var18 += var16;
                }
            } else if (arg6 == 2) {
                for (int var37 = var23; var37 < var15; var37++) {
                    for (int var38 = var22 - 1; var38 >= var19; var38--) {
                        if (var38 <= (var37 >> 1)) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg6 == 3) {
                for (int var39 = var24 - 1; var39 >= var20; var39--) {
                    for (int var40 = var22 - 1; var40 >= var19; var40--) {
                        if (var40 >= (var39 << 1)) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            }
        } else if (arg3 == 3) {
            if (arg6 == 0) {
                for (int var41 = var24 - 1; var41 >= var20; var41--) {
                    for (int var42 = var22 - 1; var42 >= var19; var42--) {
                        if (var42 <= var41 >> 1) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg6 == 1) {
                for (int var43 = var24 - 1; var43 >= var20; var43--) {
                    for (int var44 = var21; var44 < var17; var44++) {
                        if ((var43 << 1) <= var44) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg6 == 2) {
                for (int var45 = var23; var45 < var15; var45++) {
                    for (int var46 = var21; var46 < var17; var46++) {
                        if ((var45 >> 1) >= var46) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg6 == 3) {
                for (int var47 = var23; var47 < var15; var47++) {
                    for (int var48 = var22 - 1; var48 >= var19; var48--) {
                        if ((var47 << 1) <= var48) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            }
        } else if (arg3 == 4) {
            if (arg6 == 0) {
                for (int var49 = var24 - 1; var49 >= var20; var49--) {
                    for (int var50 = var21; var50 < var17; var50++) {
                        if (var50 >= var49 >> 1) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg6 == 1) {
                for (int var51 = var23; var51 < var15; var51++) {
                    for (int var52 = var21; var52 < var17; var52++) {
                        if (var52 <= (var51 << 1)) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg6 == 2) {
                for (int var53 = var23; var53 < var15; var53++) {
                    for (int var54 = var22 - 1; var54 >= var19; var54--) {
                        if (var53 >> 1 <= var54) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg6 == 3) {
                for (int var55 = var24 - 1; var55 >= var20; var55--) {
                    for (int var56 = var22 - 1; var56 >= var19; var56--) {
                        if (var56 <= var55 << 1) {
                            arg4[var18] = arg2;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            }
        } else if (arg3 != 5) {
            if (arg3 == 6) {
                if (arg6 == 0) {
                    for (int var65 = var23; var65 < var15; var65++) {
                        for (int var66 = var21; var66 < var17; var66++) {
                            if (arg9 / 2 >= var66) {
                                arg4[var18] = arg2;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var67 = var23; var67 < var15; var67++) {
                        for (int var68 = var21; var68 < var17; var68++) {
                            if ((arg0 / 2) >= var67) {
                                arg4[var18] = arg2;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var69 = var23; var69 < var15; var69++) {
                        for (int var70 = var21; var70 < var17; var70++) {
                            if ((arg9 / 2) <= var70) {
                                arg4[var18] = arg2;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var71 = var23; var71 < var15; var71++) {
                        for (int var72 = var21; var72 < var17; var72++) {
                            if (var71 >= arg0 / 2) {
                                arg4[var18] = arg2;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
            }
            if (arg3 == 7) {
                if (arg6 == 0) {
                    for (int var73 = var23; var73 < var15; var73++) {
                        for (int var74 = var21; var74 < var17; var74++) {
                            if (var74 <= var73 - (arg0 / 2)) {
                                arg4[var18] = arg2;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var75 = var24 - 1; var75 >= var20; var75--) {
                        for (int var76 = var21; var76 < var17; var76++) {
                            if (var76 <= (var75 - (arg0 / 2))) {
                                arg4[var18] = arg2;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var77 = var24 - 1; var77 >= var20; var77--) {
                        for (int var78 = var22 - 1; var78 >= var19; var78--) {
                            if ((var77 - (arg0 / 2)) >= var78) {
                                arg4[var18] = arg2;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var79 = var23; var79 < var15; var79++) {
                        for (int var80 = var22 - 1; var80 >= var19; var80--) {
                            if (var80 <= (var79 - (arg0 / 2))) {
                                arg4[var18] = arg2;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
            }
            if (arg3 == 8) {
                if (arg6 == 0) {
                    for (int var81 = var23; var81 < var15; var81++) {
                        for (int var82 = var21; var82 < var17; var82++) {
                            if ((var81 - (arg0 / 2)) <= var82) {
                                arg4[var18] = arg2;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var83 = var24 - 1; var83 >= var20; var83--) {
                        for (int var84 = var21; var84 < var17; var84++) {
                            if ((var83 - arg0 / 2) <= var84) {
                                arg4[var18] = arg2;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var85 = var24 - 1; var85 >= var20; var85--) {
                        for (int var86 = var22 - 1; var86 >= var19; var86--) {
                            if (var86 >= var85 - (arg0 / 2)) {
                                arg4[var18] = arg2;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var87 = var23; var87 < var15; var87++) {
                        for (int var88 = var22 - 1; var88 >= var19; var88--) {
                            if (var88 >= var87 - (arg0 / 2)) {
                                arg4[var18] = arg2;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
            }
        } else if (arg6 == 0) {
            for (int var57 = var24 - 1; var57 >= var20; var57--) {
                for (int var58 = var22 - 1; var58 >= var19; var58--) {
                    if ((var57 >> 1) <= var58) {
                        arg4[var18] = arg2;
                    } else if (arg5) {
                        arg4[var18] = arg10;
                    }
                    var18++;
                }
                var18 += var16;
            }
        } else if (arg6 == 1) {
            for (int var59 = var24 - 1; var59 >= var20; var59--) {
                for (int var60 = var21; var60 < var17; var60++) {
                    if (var60 <= var59 << 1) {
                        arg4[var18] = arg2;
                    } else if (arg5) {
                        arg4[var18] = arg10;
                    }
                    var18++;
                }
                var18 += var16;
            }
        } else if (arg6 == 2) {
            for (int var61 = var23; var61 < var15; var61++) {
                for (int var62 = var21; var62 < var17; var62++) {
                    if (var62 >= var61 >> 1) {
                        arg4[var18] = arg2;
                    } else if (arg5) {
                        arg4[var18] = arg10;
                    }
                    var18++;
                }
                var18 += var16;
            }
        } else if (arg6 == 3) {
            for (int var63 = var23; var63 < var15; var63++) {
                for (int var64 = var22 - 1; var64 >= var19; var64--) {
                    if ((var63 << 1) >= var64) {
                        arg4[var18] = arg2;
                    } else if (arg5) {
                        arg4[var18] = arg10;
                    }
                    var18++;
                }
                var18 += var16;
            }
        }
    }
}
