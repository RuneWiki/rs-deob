import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class118 extends class5 {

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "S")
    public static short field1838 = 320;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "[Lwa;")
    public static class279[] field1837 = new class279[8];

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1842 = "Please remove ";

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "[S")
    public static short[] field1843 = new short[500];

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public static int field1847 = 0;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Laf;", line = 4)
    public static final class195 method899(boolean arg0) {
        field1841++;
        int var1 = class209.field3191[0] * class133.field2028[0];
        if (arg0) {
            return (class195) null;
        }
        byte[] var2 = class220.field3362[0];
        class195 var6;
        if (class136.field2057[0]) {
            byte[] var3 = class250.field3765[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class261.method1835(class82.field1212[class149.method1117(255, var2[var5])], class149.method1117(255, var3[var5]) << 24);
            }
            var6 = new class17(class233.field3554, class38.field559, class304.field4666[0], class27.field293[0], class133.field2028[0], class209.field3191[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class82.field1212[class149.method1117(var2[var8], 255)];
            }
            var6 = new class195(class233.field3554, class38.field559, class304.field4666[0], class27.field293[0], class133.field2028[0], class209.field3191[0], var7);
        }
        class245.method1684(255);
        return var6;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V", line = 63)
    public static void method900(boolean arg0) {
        field1843 = null;
        field1842 = null;
        if (!arg0) {
            field1843 = (short[]) null;
        }
        field1837 = null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V", line = 90)
    public static final void method901(int arg0, int arg1, int arg2) {
        field1840++;
        class245.field3708[arg1] = arg0;
        if (arg2 != 0) {
            field1837 = (class279[]) null;
        }
        class300 var3 = (class300) class272.field4251.method1716(-1, (long) arg1);
        if (var3 == null) {
            class300 var4 = new class300(4611686018427387905L);
            class272.field4251.method1708((long) arg1, (byte) -79, var4);
        } else if (var3.field4617 != 4611686018427387905L) {
            var3.field4617 = class105.method789((byte) 55) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(II)V", line = 122)
    public class118(int arg0, int arg1) {
        this.field1845 = arg0;
        this.field1839 = arg1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIZII[III)V", line = 132)
    public static final void method902(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        field1846++;
        int var11 = arg10;
        if (class287.field4448 <= arg10) {
            return;
        }
        if (arg10 < class287.field4451) {
            var11 = class287.field4451;
        }
        int var12 = arg0 + arg10;
        if (class287.field4451 >= var12) {
            return;
        }
        if (class287.field4448 < var12) {
            var12 = class287.field4448;
        }
        int var13 = arg1;
        if (class287.field4456 <= arg1) {
            return;
        }
        if (arg1 < class287.field4454) {
            var13 = class287.field4454;
        }
        int var14 = arg1 + arg9;
        if (class287.field4454 >= var14) {
            return;
        }
        if (arg6 == 9) {
            arg3 = arg3 + 1 & 0x3;
            arg6 = 1;
        }
        if (arg6 == 10) {
            arg6 = 1;
            arg3 = arg3 + 3 & 0x3;
        }
        int var15 = class287.field4452 * var13 + var11;
        if (var14 > class287.field4456) {
            var14 = class287.field4456;
        }
        int var16 = class287.field4452 + var11 - var12;
        int var17 = var12 - arg10;
        int var18 = var11 - arg10;
        int var19 = arg0 - var17;
        int var20 = arg0 - var18;
        int var21 = var14 - arg1;
        int var22 = var13 - arg1;
        if (arg6 == 11) {
            arg3 = arg3 + 3 & 0x3;
            arg6 = 8;
        }
        int var23 = arg9 - var22;
        int var24 = arg9 - var21;
        if (arg6 == 1) {
            if (arg3 == 0) {
                for (int var81 = var22; var81 < var21; var81++) {
                    for (int var82 = var18; var82 < var17; var82++) {
                        if (var81 >= var82) {
                            arg8[var15] = arg2;
                        } else if (arg5) {
                            arg8[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 1) {
                for (int var83 = var23 - 1; var83 >= var24; var83--) {
                    for (int var84 = var18; var84 < var17; var84++) {
                        if (var84 <= var83) {
                            arg8[var15] = arg2;
                        } else if (arg5) {
                            arg8[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 2) {
                for (int var85 = var22; var85 < var21; var85++) {
                    for (int var86 = var18; var86 < var17; var86++) {
                        if (var86 >= var85) {
                            arg8[var15] = arg2;
                        } else if (arg5) {
                            arg8[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 3) {
                for (int var87 = var23 - 1; var87 >= var24; var87--) {
                    for (int var88 = var18; var88 < var17; var88++) {
                        if (var88 >= var87) {
                            arg8[var15] = arg2;
                        } else if (arg5) {
                            arg8[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg6 != 2) {
            if (arg4 < 75) {
                method903(false);
            }
            if (arg6 == 3) {
                if (arg3 == 0) {
                    for (int var31 = var23 - 1; var31 >= var24; var31--) {
                        for (int var32 = var20 - 1; var32 >= var19; var32--) {
                            if (var32 <= (var31 >> 1)) {
                                arg8[var15] = arg2;
                            } else if (arg5) {
                                arg8[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                } else if (arg3 == 1) {
                    for (int var25 = var23 - 1; var25 >= var24; var25--) {
                        for (int var26 = var18; var26 < var17; var26++) {
                            if ((var25 << 1) <= var26) {
                                arg8[var15] = arg2;
                            } else if (arg5) {
                                arg8[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                } else if (arg3 == 2) {
                    for (int var29 = var22; var29 < var21; var29++) {
                        for (int var30 = var18; var30 < var17; var30++) {
                            if (var30 <= var29 >> 1) {
                                arg8[var15] = arg2;
                            } else if (arg5) {
                                arg8[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                } else if (arg3 == 3) {
                    for (int var27 = var22; var27 < var21; var27++) {
                        for (int var28 = var20 - 1; var28 >= var19; var28--) {
                            if (var28 >= var27 << 1) {
                                arg8[var15] = arg2;
                            } else if (arg5) {
                                arg8[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                }
            } else if (arg6 == 4) {
                if (arg3 == 0) {
                    for (int var65 = var23 - 1; var65 >= var24; var65--) {
                        for (int var66 = var18; var66 < var17; var66++) {
                            if (var65 >> 1 <= var66) {
                                arg8[var15] = arg2;
                            } else if (arg5) {
                                arg8[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                } else if (arg3 == 1) {
                    for (int var67 = var22; var67 < var21; var67++) {
                        for (int var68 = var18; var68 < var17; var68++) {
                            if ((var67 << 1) >= var68) {
                                arg8[var15] = arg2;
                            } else if (arg5) {
                                arg8[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                } else if (arg3 == 2) {
                    for (int var71 = var22; var71 < var21; var71++) {
                        for (int var72 = var20 - 1; var72 >= var19; var72--) {
                            if (var71 >> 1 <= var72) {
                                arg8[var15] = arg2;
                            } else if (arg5) {
                                arg8[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                } else if (arg3 == 3) {
                    for (int var69 = var23 - 1; var69 >= var24; var69--) {
                        for (int var70 = var20 - 1; var70 >= var19; var70--) {
                            if (var70 <= var69 << 1) {
                                arg8[var15] = arg2;
                            } else if (arg5) {
                                arg8[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                }
            } else if (arg6 != 5) {
                if (arg6 == 6) {
                    if (arg3 == 0) {
                        for (int var47 = var22; var47 < var21; var47++) {
                            for (int var48 = var18; var48 < var17; var48++) {
                                if ((arg0 / 2) >= var48) {
                                    arg8[var15] = arg2;
                                } else if (arg5) {
                                    arg8[var15] = arg7;
                                }
                                var15++;
                            }
                            var15 += var16;
                        }
                        return;
                    }
                    if (arg3 == 1) {
                        for (int var41 = var22; var41 < var21; var41++) {
                            for (int var42 = var18; var42 < var17; var42++) {
                                if (var41 <= arg9 / 2) {
                                    arg8[var15] = arg2;
                                } else if (arg5) {
                                    arg8[var15] = arg7;
                                }
                                var15++;
                            }
                            var15 += var16;
                        }
                        return;
                    }
                    if (arg3 == 2) {
                        for (int var43 = var22; var43 < var21; var43++) {
                            for (int var44 = var18; var44 < var17; var44++) {
                                if (var44 >= arg0 / 2) {
                                    arg8[var15] = arg2;
                                } else if (arg5) {
                                    arg8[var15] = arg7;
                                }
                                var15++;
                            }
                            var15 += var16;
                        }
                        return;
                    }
                    if (arg3 == 3) {
                        for (int var45 = var22; var45 < var21; var45++) {
                            for (int var46 = var18; var46 < var17; var46++) {
                                if ((arg9 / 2) <= var45) {
                                    arg8[var15] = arg2;
                                } else if (arg5) {
                                    arg8[var15] = arg7;
                                }
                                var15++;
                            }
                            var15 += var16;
                        }
                        return;
                    }
                }
                if (arg6 == 7) {
                    if (arg3 == 0) {
                        for (int var49 = var22; var49 < var21; var49++) {
                            for (int var50 = var18; var50 < var17; var50++) {
                                if (var50 <= (var49 - (arg9 / 2))) {
                                    arg8[var15] = arg2;
                                } else if (arg5) {
                                    arg8[var15] = arg7;
                                }
                                var15++;
                            }
                            var15 += var16;
                        }
                        return;
                    }
                    if (arg3 == 1) {
                        for (int var63 = var23 - 1; var63 >= var24; var63--) {
                            for (int var64 = var18; var64 < var17; var64++) {
                                if (var63 - (arg9 / 2) >= var64) {
                                    arg8[var15] = arg2;
                                } else if (arg5) {
                                    arg8[var15] = arg7;
                                }
                                var15++;
                            }
                            var15 += var16;
                        }
                        return;
                    }
                    if (arg3 == 2) {
                        for (int var61 = var23 - 1; var61 >= var24; var61--) {
                            for (int var62 = var20 - 1; var62 >= var19; var62--) {
                                if ((var61 - (arg9 / 2)) >= var62) {
                                    arg8[var15] = arg2;
                                } else if (arg5) {
                                    arg8[var15] = arg7;
                                }
                                var15++;
                            }
                            var15 += var16;
                        }
                        return;
                    }
                    if (arg3 == 3) {
                        for (int var51 = var22; var51 < var21; var51++) {
                            for (int var52 = var20 - 1; var52 >= var19; var52--) {
                                if (var51 - (arg9 / 2) >= var52) {
                                    arg8[var15] = arg2;
                                } else if (arg5) {
                                    arg8[var15] = arg7;
                                }
                                var15++;
                            }
                            var15 += var16;
                        }
                        return;
                    }
                }
                if (arg6 == 8) {
                    if (arg3 == 0) {
                        for (int var59 = var22; var59 < var21; var59++) {
                            for (int var60 = var18; var60 < var17; var60++) {
                                if ((var59 - (arg9 / 2)) <= var60) {
                                    arg8[var15] = arg2;
                                } else if (arg5) {
                                    arg8[var15] = arg7;
                                }
                                var15++;
                            }
                            var15 += var16;
                        }
                        return;
                    }
                    if (arg3 == 1) {
                        for (int var57 = var23 - 1; var57 >= var24; var57--) {
                            for (int var58 = var18; var58 < var17; var58++) {
                                if (var58 >= var57 - (arg9 / 2)) {
                                    arg8[var15] = arg2;
                                } else if (arg5) {
                                    arg8[var15] = arg7;
                                }
                                var15++;
                            }
                            var15 += var16;
                        }
                        return;
                    }
                    if (arg3 == 2) {
                        for (int var55 = var23 - 1; var55 >= var24; var55--) {
                            for (int var56 = var20 - 1; var56 >= var19; var56--) {
                                if ((var55 - (arg9 / 2)) <= var56) {
                                    arg8[var15] = arg2;
                                } else if (arg5) {
                                    arg8[var15] = arg7;
                                }
                                var15++;
                            }
                            var15 += var16;
                        }
                        return;
                    }
                    if (arg3 == 3) {
                        for (int var53 = var22; var53 < var21; var53++) {
                            for (int var54 = var20 - 1; var54 >= var19; var54--) {
                                if ((var53 - (arg9 / 2)) <= var54) {
                                    arg8[var15] = arg2;
                                } else if (arg5) {
                                    arg8[var15] = arg7;
                                }
                                var15++;
                            }
                            var15 += var16;
                        }
                        return;
                    }
                }
            } else if (arg3 == 0) {
                for (int var33 = var23 - 1; var33 >= var24; var33--) {
                    for (int var34 = var20 - 1; var34 >= var19; var34--) {
                        if (var34 >= var33 >> 1) {
                            arg8[var15] = arg2;
                        } else if (arg5) {
                            arg8[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 1) {
                for (int var39 = var23 - 1; var39 >= var24; var39--) {
                    for (int var40 = var18; var40 < var17; var40++) {
                        if (var39 << 1 >= var40) {
                            arg8[var15] = arg2;
                        } else if (arg5) {
                            arg8[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 2) {
                for (int var35 = var22; var35 < var21; var35++) {
                    for (int var36 = var18; var36 < var17; var36++) {
                        if (var36 >= var35 >> 1) {
                            arg8[var15] = arg2;
                        } else if (arg5) {
                            arg8[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 3) {
                for (int var37 = var22; var37 < var21; var37++) {
                    for (int var38 = var20 - 1; var38 >= var19; var38--) {
                        if (var38 <= var37 << 1) {
                            arg8[var15] = arg2;
                        } else if (arg5) {
                            arg8[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg3 == 0) {
            for (int var73 = var23 - 1; var73 >= var24; var73--) {
                for (int var74 = var18; var74 < var17; var74++) {
                    if (var74 <= (var73 >> 1)) {
                        arg8[var15] = arg2;
                    } else if (arg5) {
                        arg8[var15] = arg7;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg3 == 1) {
            for (int var79 = var22; var79 < var21; var79++) {
                for (int var80 = var18; var80 < var17; var80++) {
                    if (var15 >= 0 && arg8.length > var15) {
                        if (var80 >= (var79 << 1)) {
                            arg8[var15] = arg2;
                        } else if (arg5) {
                            arg8[var15] = arg7;
                        }
                        var15++;
                    } else {
                        var15++;
                    }
                }
                var15 += var16;
            }
        } else if (arg3 == 2) {
            for (int var77 = var22; var77 < var21; var77++) {
                for (int var78 = var20 - 1; var78 >= var19; var78--) {
                    if (var78 <= var77 >> 1) {
                        arg8[var15] = arg2;
                    } else if (arg5) {
                        arg8[var15] = arg7;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg3 == 3) {
            for (int var75 = var23 - 1; var75 >= var24; var75--) {
                for (int var76 = var20 - 1; var76 >= var19; var76--) {
                    if (var76 >= var75 << 1) {
                        arg8[var15] = arg2;
                    } else if (arg5) {
                        arg8[var15] = arg7;
                    }
                    var15++;
                }
                var15 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)V", line = 1316)
    public static final void method903(boolean arg0) {
        class149.field2251.method752(arg0);
        field1836++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V", line = 1325)
    public static final void method904(byte arg0, int arg1, int arg2) {
        class171.field2764 = class258.field3966[arg1][arg2].field814;
        field1844++;
        class207.field3169 = class258.field3966[arg1][arg2].field801;
        class139.field2086 = class258.field3966[arg1][arg2].field817;
        class179.method1343((float) class171.field2764, (float) class207.field3169, (float) class139.field2086);
        if (arg0 != -42) {
            field1847 = -102;
        }
    }
}
