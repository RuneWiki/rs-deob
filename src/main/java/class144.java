import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class144 {

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    private int field2632 = 0;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    private int field2619;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "[Lib;")
    private class89[] field2617;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Lqe;")
    public static class179 field2624 = class206.method1380("null", (byte) 86);

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Z")
    public static boolean field2618 = false;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "[I")
    public static int[] field2628 = new int[] { 1, 0, 0, 0, 1, 0, 2 };

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lra;")
    public static class185 field2623 = new class185(8);

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field2633 = 0;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "J")
    private long field2625;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "Lee;")
    public static class49 field2634;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Lib;")
    private class89 field2629;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "Lib;")
    private class89 field2631;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Lib;")
    public final class89 method904(byte arg0) {
        int var2 = -40 % ((arg0 - 32) / 34);
        field2616++;
        if (this.field2629 == null) {
            return null;
        }
        class89 var3 = this.field2617[(int) ((long) (this.field2619 - 1) & this.field2625)];
        while (this.field2629 != var3) {
            if (this.field2629.field1694 == this.field2625) {
                class89 var4 = this.field2629;
                this.field2629 = this.field2629.field1687;
                return var4;
            }
            this.field2629 = this.field2629.field1687;
        }
        this.field2629 = null;
        return null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIZIII[IIIII)V")
    public static final void method905(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        field2620++;
        if (arg7 < class145.field2638) {
            arg1 -= class145.field2638 - arg7;
            arg7 = class145.field2638;
        }
        if (class145.field2641 < arg1 + arg7) {
            arg1 = class145.field2641 - arg7;
        }
        if (arg5 < class145.field2636) {
            arg9 -= class145.field2636 - arg5;
            arg5 = class145.field2636;
        }
        if (arg5 + arg9 > class145.field2639) {
            arg9 = class145.field2639 - arg5;
        }
        if (arg10 == 9) {
            arg0 = arg0 + 1 & 0x3;
            arg10 = 1;
        }
        int var11 = class145.field2637 - arg9;
        int var12 = class145.field2637 * arg7 + arg5;
        if (arg4 != -28056) {
            return;
        }
        if (arg10 == 10) {
            arg10 = 1;
            arg0 = arg0 + 3 & 0x3;
        }
        if (arg10 == 11) {
            arg0 = arg0 + 3 & 0x3;
            arg10 = 8;
        }
        if (arg10 == 1) {
            if (arg0 == 0) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < arg9; var14++) {
                        if (var13 >= var14) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 1) {
                for (int var15 = arg1 - 1; var15 >= 0; var15--) {
                    for (int var16 = 0; var16 < arg9; var16++) {
                        if (var16 <= var15) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 2) {
                for (int var17 = 0; var17 < arg1; var17++) {
                    for (int var18 = 0; var18 < arg9; var18++) {
                        if (var17 <= var18) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 3) {
                for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                    for (int var20 = 0; var20 < arg9; var20++) {
                        if (var20 >= var19) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg10 == 2) {
            if (arg0 == 0) {
                for (int var21 = arg1 - 1; var21 >= 0; var21--) {
                    for (int var22 = 0; var22 < arg9; var22++) {
                        if (var21 >> 1 >= var22) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 1) {
                for (int var23 = 0; var23 < arg1; var23++) {
                    for (int var24 = 0; var24 < arg9; var24++) {
                        if (var24 >= var23 << 1) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 2) {
                for (int var25 = 0; var25 < arg1; var25++) {
                    for (int var26 = arg9 - 1; var26 >= 0; var26--) {
                        if (var26 <= var25 >> 1) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 3) {
                for (int var27 = arg1 - 1; var27 >= 0; var27--) {
                    for (int var28 = arg9 - 1; var28 >= 0; var28--) {
                        if (var27 << 1 <= var28) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg10 == 3) {
            if (arg0 == 0) {
                for (int var29 = arg1 - 1; var29 >= 0; var29--) {
                    for (int var30 = arg9 - 1; var30 >= 0; var30--) {
                        if (var30 <= var29 >> 1) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 1) {
                for (int var31 = arg1 - 1; var31 >= 0; var31--) {
                    for (int var32 = 0; var32 < arg9; var32++) {
                        if (var32 >= var31 << 1) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 2) {
                for (int var33 = 0; var33 < arg1; var33++) {
                    for (int var34 = 0; var34 < arg9; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 3) {
                for (int var35 = 0; var35 < arg1; var35++) {
                    for (int var36 = arg9 - 1; var36 >= 0; var36--) {
                        if (var36 >= var35 << 1) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg10 == 4) {
            if (arg0 == 0) {
                for (int var37 = arg1 - 1; var37 >= 0; var37--) {
                    for (int var38 = 0; var38 < arg9; var38++) {
                        if (var37 >> 1 <= var38) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 1) {
                for (int var39 = 0; var39 < arg1; var39++) {
                    for (int var40 = 0; var40 < arg9; var40++) {
                        if (var40 <= var39 << 1) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 2) {
                for (int var41 = 0; var41 < arg1; var41++) {
                    for (int var42 = arg9 - 1; var42 >= 0; var42--) {
                        if (var41 >> 1 <= var42) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 3) {
                for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                    for (int var44 = arg9 - 1; var44 >= 0; var44--) {
                        if (var44 <= var43 << 1) {
                            arg6[var12] = arg3;
                        } else if (arg2) {
                            arg6[var12] = arg8;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg10 != 5) {
            if (arg10 == 6) {
                if (arg0 == 0) {
                    for (int var53 = 0; var53 < arg1; var53++) {
                        for (int var54 = 0; var54 < arg9; var54++) {
                            if (var54 <= arg9 / 2) {
                                arg6[var12] = arg3;
                            } else if (arg2) {
                                arg6[var12] = arg8;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var55 = 0; var55 < arg1; var55++) {
                        for (int var56 = 0; var56 < arg9; var56++) {
                            if (arg1 / 2 >= var55) {
                                arg6[var12] = arg3;
                            } else if (arg2) {
                                arg6[var12] = arg8;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var57 = 0; var57 < arg1; var57++) {
                        for (int var58 = 0; var58 < arg9; var58++) {
                            if (arg9 / 2 <= var58) {
                                arg6[var12] = arg3;
                            } else if (arg2) {
                                arg6[var12] = arg8;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var59 = 0; var59 < arg1; var59++) {
                        for (int var60 = 0; var60 < arg9; var60++) {
                            if (arg1 / 2 <= var59) {
                                arg6[var12] = arg3;
                            } else if (arg2) {
                                arg6[var12] = arg8;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
            }
            if (arg10 == 7) {
                if (arg0 == 0) {
                    for (int var61 = 0; var61 < arg1; var61++) {
                        for (int var62 = 0; var62 < arg9; var62++) {
                            if (var62 <= var61 - arg1 / 2) {
                                arg6[var12] = arg3;
                            } else if (arg2) {
                                arg6[var12] = arg8;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var63 = arg1 - 1; var63 >= 0; var63--) {
                        for (int var64 = 0; var64 < arg9; var64++) {
                            if (var63 - arg1 / 2 >= var64) {
                                arg6[var12] = arg3;
                            } else if (arg2) {
                                arg6[var12] = arg8;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var65 = arg1 - 1; var65 >= 0; var65--) {
                        for (int var66 = arg9 - 1; var66 >= 0; var66--) {
                            if (var65 - arg1 / 2 >= var66) {
                                arg6[var12] = arg3;
                            } else if (arg2) {
                                arg6[var12] = arg8;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var67 = 0; var67 < arg1; var67++) {
                        for (int var68 = arg9 - 1; var68 >= 0; var68--) {
                            if (var68 <= var67 - arg1 / 2) {
                                arg6[var12] = arg3;
                            } else if (arg2) {
                                arg6[var12] = arg8;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
            }
            if (arg10 == 8) {
                if (arg0 == 0) {
                    for (int var69 = 0; var69 < arg1; var69++) {
                        for (int var70 = 0; var70 < arg9; var70++) {
                            if (var70 >= var69 - arg1 / 2) {
                                arg6[var12] = arg3;
                            } else if (arg2) {
                                arg6[var12] = arg8;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var71 = arg1 - 1; var71 >= 0; var71--) {
                        for (int var72 = 0; var72 < arg9; var72++) {
                            if (var71 - arg1 / 2 <= var72) {
                                arg6[var12] = arg3;
                            } else if (arg2) {
                                arg6[var12] = arg8;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var73 = arg1 - 1; var73 >= 0; var73--) {
                        for (int var74 = arg9 - 1; var74 >= 0; var74--) {
                            if (var73 - arg1 / 2 <= var74) {
                                arg6[var12] = arg3;
                            } else if (arg2) {
                                arg6[var12] = arg8;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var75 = 0; var75 < arg1; var75++) {
                        for (int var76 = arg9 - 1; var76 >= 0; var76--) {
                            if (var76 >= var75 - arg1 / 2) {
                                arg6[var12] = arg3;
                            } else if (arg2) {
                                arg6[var12] = arg8;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
            }
        } else if (arg0 == 0) {
            for (int var45 = arg1 - 1; var45 >= 0; var45--) {
                for (int var46 = arg9 - 1; var46 >= 0; var46--) {
                    if (var45 >> 1 <= var46) {
                        arg6[var12] = arg3;
                    } else if (arg2) {
                        arg6[var12] = arg8;
                    }
                    var12++;
                }
                var12 += var11;
            }
        } else if (arg0 == 1) {
            for (int var47 = arg1 - 1; var47 >= 0; var47--) {
                for (int var48 = 0; var48 < arg9; var48++) {
                    if (var47 << 1 >= var48) {
                        arg6[var12] = arg3;
                    } else if (arg2) {
                        arg6[var12] = arg8;
                    }
                    var12++;
                }
                var12 += var11;
            }
        } else if (arg0 == 2) {
            for (int var49 = 0; var49 < arg1; var49++) {
                for (int var50 = 0; var50 < arg9; var50++) {
                    if (var50 >= var49 >> 1) {
                        arg6[var12] = arg3;
                    } else if (arg2) {
                        arg6[var12] = arg8;
                    }
                    var12++;
                }
                var12 += var11;
            }
        } else if (arg0 == 3) {
            for (int var51 = 0; var51 < arg1; var51++) {
                for (int var52 = arg9 - 1; var52 >= 0; var52--) {
                    if (var51 << 1 >= var52) {
                        arg6[var12] = arg3;
                    } else if (arg2) {
                        arg6[var12] = arg8;
                    }
                    var12++;
                }
                var12 += var11;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
    public static final int method906(int arg0, int arg1) {
        if (arg0 != 11913) {
            method910(97, (byte) 39);
        }
        field2613++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)Lib;")
    public final class89 method907(boolean arg0) {
        field2621++;
        if (!arg0) {
            this.method914(-86L, null, false);
        }
        if (this.field2632 > 0 && this.field2617[this.field2632 - 1] != this.field2631) {
            class89 var2 = this.field2631;
            this.field2631 = var2.field1687;
            return var2;
        }
        while (this.field2632 < this.field2619) {
            class89 var3 = this.field2617[this.field2632++].field1687;
            if (this.field2617[this.field2632 - 1] != var3) {
                this.field2631 = var3.field1687;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method908(int arg0) {
        field2623 = null;
        if (arg0 != 1) {
            method911();
        }
        field2634 = null;
        field2624 = null;
        field2628 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJ)Lib;")
    public final class89 method909(int arg0, long arg1) {
        this.field2625 = arg1;
        field2627++;
        class89 var4 = this.field2617[(int) ((long) (this.field2619 + arg0) & arg1)];
        for (this.field2629 = var4.field1687; this.field2629 != var4; this.field2629 = this.field2629.field1687) {
            if (this.field2629.field1694 == arg1) {
                class89 var5 = this.field2629;
                this.field2629 = this.field2629.field1687;
                return var5;
            }
        }
        this.field2629 = null;
        return null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)I")
    public static final int method910(int arg0, byte arg1) {
        if (arg1 == 116) {
            field2614++;
            return arg0 >>> 10;
        } else {
            return 61;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
    public static final void method911() {
        int var0 = class70.field1400[class16.field444];
        class109[] var1 = class70.field1401[class16.field444];
        class217.field4026 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            class109 var3 = var1[var2];
            if (var3.field2047 == 1) {
                int var4 = var3.field2026 + class93.field1752 - class232.field4288;
                if (var4 >= 0 && var4 <= class93.field1752 + class93.field1752) {
                    int var5 = var3.field2032 + class93.field1752 - class4.field62;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = var3.field2044 + class93.field1752 - class4.field62;
                    if (var6 > class93.field1752 + class93.field1752) {
                        var6 = class93.field1752 + class93.field1752;
                    }
                    boolean var7 = false;
                    while (var5 <= var6) {
                        if (class67.field1356[var4][var5++]) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var7) {
                        int var8 = class100.field1859 - var3.field2035;
                        if (var8 > 32) {
                            var3.field2028 = 1;
                        } else {
                            if (var8 >= -32) {
                                continue;
                            }
                            var3.field2028 = 2;
                            var8 = -var8;
                        }
                        var3.field2049 = (var3.field2041 - class110.field2060 << 8) / var8;
                        var3.field2033 = (var3.field2040 - class110.field2060 << 8) / var8;
                        var3.field2022 = (var3.field2023 - class66.field1343 << 8) / var8;
                        var3.field2024 = (var3.field2036 - class66.field1343 << 8) / var8;
                        class10.field284[class217.field4026++] = var3;
                    }
                }
            } else if (var3.field2047 == 2) {
                int var9 = var3.field2032 + class93.field1752 - class4.field62;
                if (var9 >= 0 && var9 <= class93.field1752 + class93.field1752) {
                    int var10 = var3.field2026 + class93.field1752 - class232.field4288;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var11 = var3.field2037 + class93.field1752 - class232.field4288;
                    if (var11 > class93.field1752 + class93.field1752) {
                        var11 = class93.field1752 + class93.field1752;
                    }
                    boolean var12 = false;
                    while (var10 <= var11) {
                        if (class67.field1356[var10++][var9]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var12) {
                        int var13 = class110.field2060 - var3.field2041;
                        if (var13 > 32) {
                            var3.field2028 = 3;
                        } else {
                            if (var13 >= -32) {
                                continue;
                            }
                            var3.field2028 = 4;
                            var13 = -var13;
                        }
                        var3.field2027 = (var3.field2035 - class100.field1859 << 8) / var13;
                        var3.field2048 = (var3.field2029 - class100.field1859 << 8) / var13;
                        var3.field2022 = (var3.field2023 - class66.field1343 << 8) / var13;
                        var3.field2024 = (var3.field2036 - class66.field1343 << 8) / var13;
                        class10.field284[class217.field4026++] = var3;
                    }
                }
            } else if (var3.field2047 == 4) {
                int var14 = var3.field2023 - class66.field1343;
                if (var14 > 128) {
                    int var15 = var3.field2032 + class93.field1752 - class4.field62;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = var3.field2044 + class93.field1752 - class4.field62;
                    if (var16 > class93.field1752 + class93.field1752) {
                        var16 = class93.field1752 + class93.field1752;
                    }
                    if (var15 <= var16) {
                        int var17 = var3.field2026 + class93.field1752 - class232.field4288;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = var3.field2037 + class93.field1752 - class232.field4288;
                        if (var18 > class93.field1752 + class93.field1752) {
                            var18 = class93.field1752 + class93.field1752;
                        }
                        boolean var19 = false;
                        label145: for (int var20 = var17; var20 <= var18; var20++) {
                            for (int var21 = var15; var21 <= var16; var21++) {
                                if (class67.field1356[var20][var21]) {
                                    var19 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var19) {
                            var3.field2028 = 5;
                            var3.field2027 = (var3.field2035 - class100.field1859 << 8) / var14;
                            var3.field2048 = (var3.field2029 - class100.field1859 << 8) / var14;
                            var3.field2049 = (var3.field2041 - class110.field2060 << 8) / var14;
                            var3.field2033 = (var3.field2040 - class110.field2060 << 8) / var14;
                            class10.field284[class217.field4026++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)I")
    public static final int method912(int arg0, int arg1, int arg2) {
        field2630++;
        int var3 = class84.method567(arg2 + 91923, false, 4, arg1 + 45365) + (class84.method567(arg2 + 37821, false, 2, arg1 + 10294) - 128 >> 1) + (class84.method567(arg2, false, 1, arg1) + -128 >> 2) - 128;
        if (arg0 < 115) {
            method906(104, 83);
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)Lib;")
    public final class89 method913(int arg0) {
        this.field2632 = arg0;
        field2626++;
        return this.method907(true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(JLib;Z)V")
    public final void method914(long arg0, class89 arg1, boolean arg2) {
        field2622++;
        if (!arg2) {
            return;
        }
        if (arg1.field1691 != null) {
            arg1.method592((byte) -128);
        }
        class89 var5 = this.field2617[(int) ((long) (this.field2619 - 1) & arg0)];
        arg1.field1687 = var5;
        arg1.field1694 = arg0;
        arg1.field1691 = var5.field1691;
        arg1.field1691.field1687 = arg1;
        arg1.field1687.field1691 = arg1;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I)V")
    public class144(int arg0) {
        this.field2619 = arg0;
        this.field2617 = new class89[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class89 var3 = this.field2617[var2] = new class89();
            var3.field1687 = var3;
            var3.field1691 = var3;
        }
    }
}
