import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class70 extends class224 {

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    private int field925 = 0;

    @OriginalMember(owner = "client!ee", name = "nb", descriptor = "I")
    private int field940 = 0;

    @OriginalMember(owner = "client!ee", name = "pb", descriptor = "I")
    private int field942 = 0;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "Luf;")
    private static class168 field924 = class148.method1019(-1720, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "Luf;")
    public static class168 field920 = field924;

    @OriginalMember(owner = "client!ee", name = "ob", descriptor = "[I")
    public static int[] field941 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "Luf;")
    private static class168 field929 = class148.method1019(-1720, "Loaded wordpack");

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "J")
    public static long field933 = 0L;

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "Luf;")
    public static class168 field937 = class148.method1019(-1720, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "Luf;")
    public static class168 field936 = field929;

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
    public static int field934 = 0;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
    private int field928;

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
    private int field930;

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "I")
    private int field931;

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!ee", name = "qb", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!ee", name = "rb", descriptor = "I")
    private int field944;

    @OriginalMember(owner = "client!ee", name = "sb", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!ee", name = "tb", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!ee", name = "ub", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "Ldk;")
    public static class241 field927;

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "Ldk;")
    public static class241 field939;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILcj;)[Lhe;", line = 4)
    public static final class99[] method393(int arg0, class75 arg1) {
        if (arg0 != -3362) {
            return (class99[]) null;
        }
        field947++;
        if (!arg1.method422(true)) {
            return new class99[0];
        }
        class112 var2 = arg1.method419(-118);
        while (var2.field1746 == 0) {
            class300.method2054(10, 10L);
        }
        if (var2.field1746 == 2) {
            return new class99[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field1742);
        class99[] var4 = new class99[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class99 var6 = new class99();
            var4[var5] = var6;
            var6.field1554 = var3[var5 << 2];
            var6.field1561 = var3[(var5 << 2) + 1];
            var6.field1558 = var3[(var5 << 2) + 2];
            var6.field1549 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IB)I", line = 59)
    public static final int method394(int arg0, byte arg1) {
        if (arg1 >= -55) {
            field933 = -63L;
        }
        field922++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIZIII[IIII)V", line = 72)
    public static final void method395(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        field926++;
        int var11 = arg0;
        if (arg0 >= class277.field4650) {
            return;
        }
        if (arg0 < class277.field4649) {
            var11 = class277.field4649;
        }
        int var12 = arg0 + arg1;
        if (var12 <= class277.field4649) {
            return;
        }
        if (var12 > class277.field4650) {
            var12 = class277.field4650;
        }
        int var13 = arg2;
        if (arg2 >= class277.field4651) {
            return;
        }
        if (class277.field4655 > arg2) {
            var13 = class277.field4655;
        }
        int var14 = arg2 + arg10;
        if (class277.field4655 >= var14) {
            return;
        }
        if (arg5 == 9) {
            arg6 = arg6 + 1 & 0x3;
            arg5 = 1;
        }
        if (arg5 == 10) {
            arg5 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        if (arg5 == 11) {
            arg5 = 8;
            arg6 = arg6 + 3 & 0x3;
        }
        if (class277.field4651 < var14) {
            var14 = class277.field4651;
        }
        int var15 = var14 - arg2;
        int var16 = class277.field4652 * var13 + var11;
        int var17 = class277.field4652 + var11 - var12;
        int var18 = -1 % ((arg8 + 32) / 36);
        int var19 = var11 - arg0;
        int var20 = var13 - arg2;
        int var21 = var12 - arg0;
        int var22 = arg1 - var21;
        int var23 = arg1 - var19;
        int var24 = arg10 - var15;
        int var25 = arg10 - var20;
        if (arg5 == 1) {
            if (arg6 == 0) {
                for (int var26 = var20; var26 < var15; var26++) {
                    for (int var27 = var19; var27 < var21; var27++) {
                        if (var26 >= var27) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 1) {
                for (int var32 = var25 - 1; var32 >= var24; var32--) {
                    for (int var33 = var19; var33 < var21; var33++) {
                        if (var33 <= var32) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 2) {
                for (int var30 = var20; var30 < var15; var30++) {
                    for (int var31 = var19; var31 < var21; var31++) {
                        if (var31 >= var30) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 3) {
                for (int var28 = var25 - 1; var28 >= var24; var28--) {
                    for (int var29 = var19; var29 < var21; var29++) {
                        if (var29 >= var28) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg5 == 2) {
            if (arg6 == 0) {
                for (int var82 = var25 - 1; var82 >= var24; var82--) {
                    for (int var83 = var19; var83 < var21; var83++) {
                        if (var83 <= var82 >> 1) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 1) {
                for (int var84 = var20; var84 < var15; var84++) {
                    for (int var85 = var19; var85 < var21; var85++) {
                        if (var16 >= 0 && var16 < arg7.length) {
                            if (var84 << 1 <= var85) {
                                arg7[var16] = arg9;
                            } else if (arg3) {
                                arg7[var16] = arg4;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var17;
                }
            } else if (arg6 == 2) {
                for (int var88 = var20; var88 < var15; var88++) {
                    for (int var89 = var23 - 1; var89 >= var22; var89--) {
                        if (var89 <= (var88 >> 1)) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 3) {
                for (int var86 = var25 - 1; var86 >= var24; var86--) {
                    for (int var87 = var23 - 1; var87 >= var22; var87--) {
                        if (var87 >= var86 << 1) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg5 == 3) {
            if (arg6 == 0) {
                for (int var74 = var25 - 1; var74 >= var24; var74--) {
                    for (int var75 = var23 - 1; var75 >= var22; var75--) {
                        if ((var74 >> 1) >= var75) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 1) {
                for (int var76 = var25 - 1; var76 >= var24; var76--) {
                    for (int var77 = var19; var77 < var21; var77++) {
                        if (var76 << 1 <= var77) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 2) {
                for (int var80 = var20; var80 < var15; var80++) {
                    for (int var81 = var19; var81 < var21; var81++) {
                        if (var81 <= var80 >> 1) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 3) {
                for (int var78 = var20; var78 < var15; var78++) {
                    for (int var79 = var23 - 1; var79 >= var22; var79--) {
                        if (var78 << 1 <= var79) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg5 == 4) {
            if (arg6 == 0) {
                for (int var72 = var25 - 1; var72 >= var24; var72--) {
                    for (int var73 = var19; var73 < var21; var73++) {
                        if ((var72 >> 1) <= var73) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 1) {
                for (int var66 = var20; var66 < var15; var66++) {
                    for (int var67 = var19; var67 < var21; var67++) {
                        if (var67 <= var66 << 1) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 2) {
                for (int var68 = var20; var68 < var15; var68++) {
                    for (int var69 = var23 - 1; var69 >= var22; var69--) {
                        if (var68 >> 1 <= var69) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 3) {
                for (int var70 = var25 - 1; var70 >= var24; var70--) {
                    for (int var71 = var23 - 1; var71 >= var22; var71--) {
                        if (var71 <= (var70 << 1)) {
                            arg7[var16] = arg9;
                        } else if (arg3) {
                            arg7[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg5 != 5) {
            if (arg5 == 6) {
                if (arg6 == 0) {
                    for (int var40 = var20; var40 < var15; var40++) {
                        for (int var41 = var19; var41 < var21; var41++) {
                            if ((arg1 / 2) >= var41) {
                                arg7[var16] = arg9;
                            } else if (arg3) {
                                arg7[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var38 = var20; var38 < var15; var38++) {
                        for (int var39 = var19; var39 < var21; var39++) {
                            if (var38 <= (arg10 / 2)) {
                                arg7[var16] = arg9;
                            } else if (arg3) {
                                arg7[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var34 = var20; var34 < var15; var34++) {
                        for (int var35 = var19; var35 < var21; var35++) {
                            if (var35 >= (arg1 / 2)) {
                                arg7[var16] = arg9;
                            } else if (arg3) {
                                arg7[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var36 = var20; var36 < var15; var36++) {
                        for (int var37 = var19; var37 < var21; var37++) {
                            if (var36 >= arg10 / 2) {
                                arg7[var16] = arg9;
                            } else if (arg3) {
                                arg7[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
            }
            if (arg5 == 7) {
                if (arg6 == 0) {
                    for (int var48 = var20; var48 < var15; var48++) {
                        for (int var49 = var19; var49 < var21; var49++) {
                            if (var49 <= var48 - (arg10 / 2)) {
                                arg7[var16] = arg9;
                            } else if (arg3) {
                                arg7[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var46 = var25 - 1; var46 >= var24; var46--) {
                        for (int var47 = var19; var47 < var21; var47++) {
                            if (var47 <= var46 - arg10 / 2) {
                                arg7[var16] = arg9;
                            } else if (arg3) {
                                arg7[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var42 = var25 - 1; var42 >= var24; var42--) {
                        for (int var43 = var23 - 1; var43 >= var22; var43--) {
                            if (var43 <= (var42 - (arg10 / 2))) {
                                arg7[var16] = arg9;
                            } else if (arg3) {
                                arg7[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var44 = var20; var44 < var15; var44++) {
                        for (int var45 = var23 - 1; var45 >= var22; var45--) {
                            if (var45 <= var44 - (arg10 / 2)) {
                                arg7[var16] = arg9;
                            } else if (arg3) {
                                arg7[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
            }
            if (arg5 == 8) {
                if (arg6 == 0) {
                    for (int var50 = var20; var50 < var15; var50++) {
                        for (int var51 = var19; var51 < var21; var51++) {
                            if (var51 >= var50 - arg10 / 2) {
                                arg7[var16] = arg9;
                            } else if (arg3) {
                                arg7[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var52 = var25 - 1; var52 >= var24; var52--) {
                        for (int var53 = var19; var53 < var21; var53++) {
                            if (var53 >= (var52 - arg10 / 2)) {
                                arg7[var16] = arg9;
                            } else if (arg3) {
                                arg7[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var54 = var25 - 1; var54 >= var24; var54--) {
                        for (int var55 = var23 - 1; var55 >= var22; var55--) {
                            if (var55 >= (var54 - (arg10 / 2))) {
                                arg7[var16] = arg9;
                            } else if (arg3) {
                                arg7[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var56 = var20; var56 < var15; var56++) {
                        for (int var57 = var23 - 1; var57 >= var22; var57--) {
                            if ((var56 - (arg10 / 2)) <= var57) {
                                arg7[var16] = arg9;
                            } else if (arg3) {
                                arg7[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
            }
        } else if (arg6 == 0) {
            for (int var58 = var25 - 1; var58 >= var24; var58--) {
                for (int var59 = var23 - 1; var59 >= var22; var59--) {
                    if (var58 >> 1 <= var59) {
                        arg7[var16] = arg9;
                    } else if (arg3) {
                        arg7[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var17;
            }
        } else if (arg6 == 1) {
            for (int var60 = var25 - 1; var60 >= var24; var60--) {
                for (int var61 = var19; var61 < var21; var61++) {
                    if (var60 << 1 >= var61) {
                        arg7[var16] = arg9;
                    } else if (arg3) {
                        arg7[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var17;
            }
        } else if (arg6 == 2) {
            for (int var62 = var20; var62 < var15; var62++) {
                for (int var63 = var19; var63 < var21; var63++) {
                    if (var62 >> 1 <= var63) {
                        arg7[var16] = arg9;
                    } else if (arg3) {
                        arg7[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var17;
            }
        } else if (arg6 == 3) {
            for (int var64 = var20; var64 < var15; var64++) {
                for (int var65 = var23 - 1; var65 >= var22; var65--) {
                    if (var65 <= var64 << 1) {
                        arg7[var16] = arg9;
                    } else if (arg3) {
                        arg7[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var17;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 1255)
    public class70() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZLj;)V", line = 1263)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg1) {
            this.field925 = 110;
        }
        if (arg0 == 0) {
            this.field942 = arg2.method1081((byte) -80);
        } else if (arg0 == 1) {
            this.field925 = (arg2.method1078(-6338) << 12) / 100;
        } else if (arg0 == 2) {
            this.field940 = (arg2.method1078(-6338) << 12) / 100;
        }
        field921++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIII)V", line = 1316)
    private final void method396(byte arg0, int arg1, int arg2, int arg3) {
        field946++;
        if (arg0 >= -64) {
            return;
        }
        int var5 = arg3 > 2048 ? arg3 + arg1 - (arg1 * arg3 >> 12) : (4096 - -arg1) * arg3 >> 12;
        if (var5 <= 0) {
            this.field928 = this.field944 = this.field932 = arg3;
            return;
        }
        int var6 = arg2 * 6;
        int var7 = arg3 + arg3 - var5;
        int var8 = var6 >> 12;
        int var9 = var6 - (var8 << 12);
        int var10 = (var5 - var7 << 12) / var5;
        int var12 = var10 * var5 >> 12;
        int var13 = var9 * var12 >> 12;
        int var14 = var5 - var13;
        int var15 = var7 + var13;
        if (var8 == 0) {
            this.field928 = var5;
            this.field932 = var7;
            this.field944 = var15;
        } else if (var8 == 1) {
            this.field932 = var7;
            this.field928 = var14;
            this.field944 = var5;
        } else if (var8 == 2) {
            this.field928 = var7;
            this.field944 = var5;
            this.field932 = var15;
        } else if (var8 == 3) {
            this.field932 = var5;
            this.field944 = var14;
            this.field928 = var7;
        } else if (var8 == 4) {
            this.field932 = var5;
            this.field944 = var7;
            this.field928 = var15;
        } else if (var8 == 5) {
            this.field944 = var7;
            this.field932 = var14;
            this.field928 = var5;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V", line = 1431)
    public static final void method397(int arg0) {
        class267.field4500.method1429((byte) 120);
        field938++;
        class128.field1995.method1429((byte) 120);
        class156.field2465.method1429((byte) 120);
        if (arg0 != 2) {
            method397(127);
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V", line = 1452)
    public static void method398(int arg0) {
        if (arg0 != 6814) {
            field934 = 16;
        }
        field941 = null;
        field929 = null;
        field927 = null;
        field924 = null;
        field920 = null;
        field937 = null;
        field936 = null;
        field939 = null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(BIII)V", line = 1473)
    private final void method399(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 < arg1 ? arg1 : arg2;
        field935++;
        int var6 = arg2 <= arg1 ? arg2 : arg1;
        int var7 = arg3 <= var5 ? var5 : arg3;
        int var8 = arg3 < var6 ? arg3 : var6;
        int var9 = 116 / ((1 - arg0) / 44);
        this.field930 = (var7 + var8) / 2;
        int var10 = var7 - var8;
        if (var10 <= 0) {
            this.field931 = 0;
        } else {
            int var11 = (var7 - arg1 << 12) / var10;
            int var12 = (var7 - arg2 << 12) / var10;
            int var13 = (var7 - arg3 << 12) / var10;
            if (arg1 == var7) {
                this.field931 = arg2 == var8 ? var13 + 20480 : -var12 + 4096;
            } else if (arg2 == var7) {
                this.field931 = arg3 == var8 ? var11 + 4096 : 12288 - var13;
            } else {
                this.field931 = arg1 == var8 ? var12 + 12288 : -var11 + 20480;
            }
            this.field931 /= 6;
        }
        if (this.field930 > 0 && this.field930 < 4096) {
            this.field923 = (var10 << 12) / (this.field930 <= 2048 ? this.field930 * 2 : 8192 - this.field930 * 2);
        } else {
            this.field923 = 0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)[[I", line = 1552)
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 != -77) {
            this.method399((byte) 121, 90, -11, 43);
        }
        field943++;
        int[][] var3 = this.field3631.method1587(arg0, arg1 + 9881);
        if (this.field3631.field3756) {
            int[][] var4 = this.method1535(0, 3, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class187.field2961; var11++) {
                this.method399((byte) -59, var5[var11], var6[var11], var9[var11]);
                this.field923 += this.field925;
                this.field930 += this.field940;
                if (this.field930 < 0) {
                    this.field930 = 0;
                }
                this.field931 += this.field942;
                if (this.field923 < 0) {
                    this.field923 = 0;
                }
                while (this.field931 < 0) {
                    this.field931 += 4096;
                }
                if (this.field930 > 4096) {
                    this.field930 = 4096;
                }
                if (this.field923 > 4096) {
                    this.field923 = 4096;
                }
                while (this.field931 > 4096) {
                    this.field931 -= 4096;
                }
                this.method396((byte) -93, this.field923, this.field931, this.field930);
                var8[var11] = this.field928;
                var7[var11] = this.field944;
                var10[var11] = this.field932;
            }
        }
        return var3;
    }
}
