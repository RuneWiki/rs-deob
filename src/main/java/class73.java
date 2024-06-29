import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class73 extends class71 {

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    private int field1434 = 32768;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "Lud;")
    public static class279 field1429 = null;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field1435 = -2;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "Lud;")
    public static class279 field1430 = class130.method1024("::qa_op_test", 255);

    @OriginalMember(owner = "client!v", name = "T", descriptor = "[I")
    public static int[] field1433 = new int[1000];

    @OriginalMember(owner = "client!v", name = "X", descriptor = "Lhc;")
    public static class171 field1437 = new class171(4);

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field1438 = 50;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "[I")
    public static int[] field1439 = new int[field1438];

    @OriginalMember(owner = "client!v", name = "db", descriptor = "[I")
    public static int[] field1443 = new int[field1438];

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "[I")
    public static int[] field1441 = new int[2];

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "[I")
    public static int[] field1440 = new int[field1438];

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "[I")
    public static int[] field1445 = new int[field1438];

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "[I")
    public static int[] field1442 = new int[field1438];

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "[I")
    public static int[] field1444 = new int[field1438];

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "[I")
    public static int[] field1448 = new int[field1438];

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "[Lud;")
    public static class279[] field1446 = new class279[field1438];

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "Lud;")
    public static class279 field1447 = class130.method1024(" )2>", 255);

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIII)V", line = 6)
    public static final void method635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1436++;
        for (int var6 = arg5; var6 <= (arg3 + arg5); var6++) {
            for (int var7 = arg2; var7 <= (arg2 + arg4); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class223.field3955[arg1][var7][var6] = 127;
                }
            }
        }
        if (arg0 != -105) {
            return;
        }
        for (int var8 = arg5; var8 < (arg3 + arg5); var8++) {
            for (int var9 = arg2; var9 < (arg2 + arg4); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class165.field2970[arg1][var9][var8] = arg1 > 0 ? class165.field2970[arg1 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var10 = arg5 + 1; var10 < arg3 + arg5; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class165.field2970[arg1][arg2][var10] = class165.field2970[arg1][arg2 - 1][var10];
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var11 = arg2 + 1; var11 < arg2 + arg4; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class165.field2970[arg1][var11][arg5] = class165.field2970[arg1][var11][arg5 - 1];
                }
            }
        }
        if (arg2 < 0 || arg5 < 0 || arg2 >= 104 || arg5 >= 104) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 > 0 && class165.field2970[arg1][arg2 - 1][arg5] != 0) {
                class165.field2970[arg1][arg2][arg5] = class165.field2970[arg1][arg2 - 1][arg5];
            } else if (arg5 > 0 && class165.field2970[arg1][arg2][arg5 - 1] != 0) {
                class165.field2970[arg1][arg2][arg5] = class165.field2970[arg1][arg2][arg5 - 1];
            } else if (arg2 > 0 && arg5 > 0 && class165.field2970[arg1][arg2 - 1][arg5 - 1] != 0) {
                class165.field2970[arg1][arg2][arg5] = class165.field2970[arg1][arg2 - 1][arg5 - 1];
            }
        } else if (arg2 > 0 && class165.field2970[arg1 - 1][arg2 - 1][arg5] != class165.field2970[arg1][arg2 - 1][arg5]) {
            class165.field2970[arg1][arg2][arg5] = class165.field2970[arg1][arg2 - 1][arg5];
        } else if (arg5 > 0 && class165.field2970[arg1 - 1][arg2][arg5 - 1] != class165.field2970[arg1][arg2][arg5 - 1]) {
            class165.field2970[arg1][arg2][arg5] = class165.field2970[arg1][arg2][arg5 - 1];
        } else if (arg2 > 0 && arg5 > 0 && class165.field2970[arg1 - 1][arg2 - 1][arg5 - 1] != class165.field2970[arg1][arg2 - 1][arg5 - 1]) {
            class165.field2970[arg1][arg2][arg5] = class165.field2970[arg1][arg2 - 1][arg5 - 1];
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V", line = 125)
    public static void method636(int arg0) {
        field1433 = null;
        field1447 = null;
        field1446 = null;
        field1429 = null;
        field1440 = null;
        field1430 = null;
        field1441 = null;
        field1443 = null;
        field1445 = null;
        field1439 = null;
        if (arg0 != -2) {
            method637(106, 20, 25, (byte) 55);
        }
        field1442 = null;
        field1437 = null;
        field1444 = null;
        field1448 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[[I", line = 148)
    public final int[][] method86(int arg0, int arg1) {
        field1424++;
        int[][] var3 = this.field1400.method1746((byte) 90, arg0);
        if (this.field1400.field4363) {
            int[] var4 = this.method624(arg0, -3, 1);
            int[] var5 = this.method624(arg0, -3, 2);
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            for (int var9 = 0; var9 < class215.field3787; var9++) {
                int var10 = (var4[var9] * 255 & 0xFF764) >> 12;
                int var11 = var5[var9] * this.field1434 >> 12;
                int var12 = class87.field1668[var10] * var11 >> 12;
                int var13 = class278.field4909[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class309.field5478;
                int var15 = class262.field4688 & (var13 >> 12) + arg0;
                int[][] var16 = this.method619(0, 2, var15);
                var8[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var6[var9] = var16[2][var14];
            }
        }
        int var17 = 114 % ((arg1 + 70) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 208)
    public class73() {
        super(3, false);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIB)I", line = 221)
    public static final int method637(int arg0, int arg1, int arg2, byte arg3) {
        field1432++;
        if (arg0 == arg2) {
            return arg2;
        }
        if (arg3 >= -127) {
            field1435 = -80;
        }
        int var4 = 128 - arg1;
        int var5 = (arg2 >>> 7 & 0x1FE01FE) * var4 + (((arg0 & 0xFF00FF00) >>> 7) * arg1) & 0xFF00FF00;
        int var6 = (arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00;
        return (var6 >> 7) + var5;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V", line = 256)
    public final void method627(int arg0) {
        field1426++;
        class75.method644(111);
        if (arg0 != 7) {
            method637(-49, 27, 28, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(IB)[I", line = 275)
    public final int[] method199(int arg0, byte arg1) {
        field1427++;
        if (arg1 > -69) {
            this.method86(124, -53);
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int[] var4 = this.method624(arg0, -3, 1);
            int[] var5 = this.method624(arg0, -3, 2);
            for (int var6 = 0; var6 < class215.field3787; var6++) {
                int var7 = (var4[var6] & 0xFF6) >> 4;
                int var8 = var5[var6] * this.field1434 >> 12;
                int var9 = class87.field1668[var7] * var8 >> 12;
                int var10 = class278.field4909[var7] * var8 >> 12;
                int var11 = class262.field4688 & (var10 >> 12) + arg0;
                int var12 = (var9 >> 12) + var6 & class309.field5478;
                int[] var13 = this.method624(var11, -3, 0);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z[IIIIZIIIII)V", line = 326)
    public static final void method638(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1428++;
        int var11 = arg2;
        if (arg2 >= class146.field2634) {
            return;
        }
        if (arg2 < class146.field2641) {
            var11 = class146.field2641;
        }
        int var12 = arg2 + arg10;
        if (class146.field2641 >= var12) {
            return;
        }
        if (class146.field2634 < var12) {
            var12 = class146.field2634;
        }
        int var13 = arg7;
        if (class146.field2636 <= arg7) {
            return;
        }
        if (class146.field2642 > arg7) {
            var13 = class146.field2642;
        }
        int var14 = arg7 + arg9;
        if (var14 <= class146.field2642) {
            return;
        }
        if (var14 > class146.field2636) {
            var14 = class146.field2636;
        }
        int var15 = class146.field2639 * var13 + var11;
        if (arg4 == 9) {
            arg6 = arg6 + 1 & 0x3;
            arg4 = 1;
        }
        int var16 = var14 - arg7;
        int var17 = var13 - arg7;
        if (arg4 == 10) {
            arg4 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        if (arg4 == 11) {
            arg4 = 8;
            arg6 = arg6 + 3 & 0x3;
        }
        int var18 = class146.field2639 - (var12 - var11);
        int var19 = arg9 - var16;
        int var20 = arg9 - var17;
        int var21 = var11 - arg2;
        int var22 = var12 - arg2;
        int var23 = arg10 - var22;
        int var24 = arg10 - var21;
        if (arg4 == 1) {
            if (arg6 == 0) {
                for (int var87 = var17; var87 < var16; var87++) {
                    for (int var88 = var21; var88 < var22; var88++) {
                        if (var87 >= var88) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 1) {
                for (int var81 = var20 - 1; var81 >= var19; var81--) {
                    for (int var82 = var21; var82 < var22; var82++) {
                        if (var82 <= var81) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 2) {
                for (int var83 = var17; var83 < var16; var83++) {
                    for (int var84 = var21; var84 < var22; var84++) {
                        if (var84 >= var83) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 3) {
                for (int var85 = var20 - 1; var85 >= var19; var85--) {
                    for (int var86 = var21; var86 < var22; var86++) {
                        if (var86 >= var85) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg4 == 2) {
            if (arg6 == 0) {
                for (int var79 = var20 - 1; var79 >= var19; var79--) {
                    for (int var80 = var21; var80 < var22; var80++) {
                        if (var79 >> 1 >= var80) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 1) {
                for (int var73 = var17; var73 < var16; var73++) {
                    for (int var74 = var21; var74 < var22; var74++) {
                        if (var15 >= 0 && var15 < arg1.length) {
                            if (var74 >= (var73 << 1)) {
                                arg1[var15] = arg3;
                            } else if (arg5) {
                                arg1[var15] = arg8;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg6 == 2) {
                for (int var77 = var17; var77 < var16; var77++) {
                    for (int var78 = var24 - 1; var78 >= var23; var78--) {
                        if (var78 <= var77 >> 1) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 3) {
                for (int var75 = var20 - 1; var75 >= var19; var75--) {
                    for (int var76 = var24 - 1; var76 >= var23; var76--) {
                        if ((var75 << 1) <= var76) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg4 == 3) {
            if (arg6 == 0) {
                for (int var31 = var20 - 1; var31 >= var19; var31--) {
                    for (int var32 = var24 - 1; var32 >= var23; var32--) {
                        if (var31 >> 1 >= var32) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 1) {
                for (int var29 = var20 - 1; var29 >= var19; var29--) {
                    for (int var30 = var21; var30 < var22; var30++) {
                        if ((var29 << 1) <= var30) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 2) {
                for (int var27 = var17; var27 < var16; var27++) {
                    for (int var28 = var21; var28 < var22; var28++) {
                        if (var28 <= var27 >> 1) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 3) {
                for (int var25 = var17; var25 < var16; var25++) {
                    for (int var26 = var24 - 1; var26 >= var23; var26--) {
                        if (var26 >= var25 << 1) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg4 == 4) {
            if (arg6 == 0) {
                for (int var65 = var20 - 1; var65 >= var19; var65--) {
                    for (int var66 = var21; var66 < var22; var66++) {
                        if (var66 >= (var65 >> 1)) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 1) {
                for (int var67 = var17; var67 < var16; var67++) {
                    for (int var68 = var21; var68 < var22; var68++) {
                        if (var68 <= var67 << 1) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 2) {
                for (int var71 = var17; var71 < var16; var71++) {
                    for (int var72 = var24 - 1; var72 >= var23; var72--) {
                        if (var72 >= (var71 >> 1)) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 3) {
                for (int var69 = var20 - 1; var69 >= var19; var69--) {
                    for (int var70 = var24 - 1; var70 >= var23; var70--) {
                        if (var70 <= var69 << 1) {
                            arg1[var15] = arg3;
                        } else if (arg5) {
                            arg1[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg4 != 5) {
            if (arg4 == 6) {
                if (arg6 == 0) {
                    for (int var33 = var17; var33 < var16; var33++) {
                        for (int var34 = var21; var34 < var22; var34++) {
                            if ((arg10 / 2) >= var34) {
                                arg1[var15] = arg3;
                            } else if (arg5) {
                                arg1[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var39 = var17; var39 < var16; var39++) {
                        for (int var40 = var21; var40 < var22; var40++) {
                            if (arg9 / 2 >= var39) {
                                arg1[var15] = arg3;
                            } else if (arg5) {
                                arg1[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var37 = var17; var37 < var16; var37++) {
                        for (int var38 = var21; var38 < var22; var38++) {
                            if (arg10 / 2 <= var38) {
                                arg1[var15] = arg3;
                            } else if (arg5) {
                                arg1[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var35 = var17; var35 < var16; var35++) {
                        for (int var36 = var21; var36 < var22; var36++) {
                            if (var35 >= (arg9 / 2)) {
                                arg1[var15] = arg3;
                            } else if (arg5) {
                                arg1[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg4 == 7) {
                if (arg6 == 0) {
                    for (int var55 = var17; var55 < var16; var55++) {
                        for (int var56 = var21; var56 < var22; var56++) {
                            if (var56 <= var55 - (arg9 / 2)) {
                                arg1[var15] = arg3;
                            } else if (arg5) {
                                arg1[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var53 = var20 - 1; var53 >= var19; var53--) {
                        for (int var54 = var21; var54 < var22; var54++) {
                            if (var53 - (arg9 / 2) >= var54) {
                                arg1[var15] = arg3;
                            } else if (arg5) {
                                arg1[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var41 = var20 - 1; var41 >= var19; var41--) {
                        for (int var42 = var24 - 1; var42 >= var23; var42--) {
                            if (var42 <= var41 - (arg9 / 2)) {
                                arg1[var15] = arg3;
                            } else if (arg5) {
                                arg1[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var43 = var17; var43 < var16; var43++) {
                        for (int var44 = var24 - 1; var44 >= var23; var44--) {
                            if (var44 <= (var43 - (arg9 / 2))) {
                                arg1[var15] = arg3;
                            } else if (arg5) {
                                arg1[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg4 == 8) {
                if (arg6 == 0) {
                    for (int var45 = var17; var45 < var16; var45++) {
                        for (int var46 = var21; var46 < var22; var46++) {
                            if (var46 >= (var45 - arg9 / 2)) {
                                arg1[var15] = arg3;
                            } else if (arg5) {
                                arg1[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var51 = var20 - 1; var51 >= var19; var51--) {
                        for (int var52 = var21; var52 < var22; var52++) {
                            if (var52 >= (var51 - (arg9 / 2))) {
                                arg1[var15] = arg3;
                            } else if (arg5) {
                                arg1[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var47 = var20 - 1; var47 >= var19; var47--) {
                        for (int var48 = var24 - 1; var48 >= var23; var48--) {
                            if (var47 - (arg9 / 2) <= var48) {
                                arg1[var15] = arg3;
                            } else if (arg5) {
                                arg1[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var49 = var17; var49 < var16; var49++) {
                        for (int var50 = var24 - 1; var50 >= var23; var50--) {
                            if ((var49 - arg9 / 2) <= var50) {
                                arg1[var15] = arg3;
                            } else if (arg5) {
                                arg1[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (!arg0) {
                field1442 = (int[]) null;
            }
        } else if (arg6 == 0) {
            for (int var57 = var20 - 1; var57 >= var19; var57--) {
                for (int var58 = var24 - 1; var58 >= var23; var58--) {
                    if (var58 >= (var57 >> 1)) {
                        arg1[var15] = arg3;
                    } else if (arg5) {
                        arg1[var15] = arg8;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg6 == 1) {
            for (int var63 = var20 - 1; var63 >= var19; var63--) {
                for (int var64 = var21; var64 < var22; var64++) {
                    if (var63 << 1 >= var64) {
                        arg1[var15] = arg3;
                    } else if (arg5) {
                        arg1[var15] = arg8;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg6 == 2) {
            for (int var59 = var17; var59 < var16; var59++) {
                for (int var60 = var21; var60 < var22; var60++) {
                    if ((var59 >> 1) <= var60) {
                        arg1[var15] = arg3;
                    } else if (arg5) {
                        arg1[var15] = arg8;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg6 == 3) {
            for (int var61 = var17; var61 < var16; var61++) {
                for (int var62 = var24 - 1; var62 >= var23; var62--) {
                    if (var62 <= (var61 << 1)) {
                        arg1[var15] = arg3;
                    } else if (arg5) {
                        arg1[var15] = arg8;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZLvh;)V", line = 1507)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        field1425++;
        if (arg0 == 0) {
            this.field1434 = arg2.method468(28214) << 4;
        } else if (arg0 == 1) {
            this.field1389 = arg2.method483(-126) == 1;
        }
        if (!arg1) {
            method636(68);
        }
    }
}
