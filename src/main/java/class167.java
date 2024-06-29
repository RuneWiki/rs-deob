import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class167 {

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    private int field2874 = -1;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    private int field2882 = 0;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Lvf;")
    private class296 field2866 = new class296();

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "Z")
    public boolean field2883 = false;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    private int field2871;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "[Lra;")
    private class308[] field2869;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    private int field2862;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "[[[I")
    private int[][][] field2864;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Z")
    public static volatile boolean field2872 = false;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field2877 = 0;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field2873 = 0;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "[[I")
    public static int[][] field2868 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "Ldj;")
    public static class314 field2881;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "[Lng;")
    public static class152[] field2861;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)[[[I", line = 8)
    public final int[][][] method1090(byte arg0) {
        field2876++;
        if (this.field2871 != this.field2862) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0 % ((arg0 - 6) / 37);
        for (int var3 = 0; var3 < this.field2862; var3++) {
            this.field2869[var3] = class249.field4298;
        }
        return this.field2864;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Laj;", line = 40)
    public static final class1 method1091(int arg0, int arg1) {
        field2870++;
        class1 var2 = (class1) class246.field4195.method1836((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class187.field3251.method2155(class267.method1866(78, arg1), class298.method2038(arg1, 687554119), (byte) 70);
        class1 var4 = new class1();
        if (var3 != null) {
            var4.method10(new class194(var3), -12946);
        }
        var4.method5((byte) -100);
        class246.field4195.method1835((byte) -81, (long) arg1, var4);
        int var5 = -17 / ((5 - arg0) / 36);
        return var4;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)I", line = 71)
    public static final int method1092(int arg0) {
        field2878++;
        if (class234.field4032 == 0) {
            return 0;
        } else {
            int var1 = 62 / ((-arg0 - 34) / 46);
            return class79.field1441[class234.field4032].method499();
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BII)V", line = 87)
    public static final void method1093(byte arg0, int arg1, int arg2) {
        field2867++;
        if (arg0 != 69) {
            field2877 = 57;
        }
        class275 var3 = class84.method538(arg2, 1);
        int var4 = var3.field4761;
        int var5 = var3.field4758;
        int var6 = var3.field4766;
        int var7 = class182.field3185[var5 - var4];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var4;
        class275.method1929(var6, -27870, arg1 << var4 & var8 | ~var8 & class104.field1778[var6]);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lvi;)V", line = 114)
    public static final void method1094(class5 arg0) {
        for (int var1 = arg0.field92; var1 <= arg0.field96; var1++) {
            for (int var2 = arg0.field88; var2 <= arg0.field86; var2++) {
                class150 var3 = class182.field3184[arg0.field100][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2576; var4++) {
                        if (var3.field2575[var4] == arg0) {
                            var3.field2576--;
                            for (int var5 = var4; var5 < var3.field2576; var5++) {
                                var3.field2575[var5] = var3.field2575[var5 + 1];
                                var3.field2566[var5] = var3.field2566[var5 + 1];
                            }
                            var3.field2575[var3.field2576] = null;
                            break;
                        }
                    }
                    var3.field2580 = 0;
                    for (int var6 = 0; var6 < var3.field2576; var6++) {
                        var3.field2580 |= var3.field2566[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 175)
    public static void method1095(int arg0) {
        if (arg0 >= 39) {
            field2881 = null;
            field2861 = null;
            field2868 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([IIIIZIIIIII)V", line = 190)
    public static final void method1096(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2865++;
        int var11 = arg9;
        if (arg9 >= class213.field3770) {
            return;
        }
        if (arg9 < class213.field3767) {
            var11 = class213.field3767;
        }
        int var12 = arg8 + arg9;
        if (var12 <= class213.field3767) {
            return;
        }
        if (var12 > class213.field3770) {
            var12 = class213.field3770;
        }
        int var13 = arg1;
        if (arg1 >= class213.field3774) {
            return;
        }
        int var14 = arg1 + arg6;
        if (arg1 < class213.field3768) {
            var13 = class213.field3768;
        }
        if (class213.field3768 >= var14) {
            return;
        }
        if (var14 > class213.field3774) {
            var14 = class213.field3774;
        }
        int var15 = var14 - arg1;
        int var16 = class213.field3772 * var13 + var11;
        int var17 = var13 - arg1;
        if (arg2 == 9) {
            arg10 = arg10 + 1 & 0x3;
            arg2 = 1;
        }
        if (arg2 == 10) {
            arg10 = arg10 + 3 & 0x3;
            arg2 = 1;
        }
        int var18 = class213.field3772 + var11 - var12;
        int var19 = var12 - arg9;
        int var20 = var11 - arg9;
        if (arg2 == 11) {
            arg10 = arg10 + 3 & 0x3;
            arg2 = 8;
        }
        int var21 = arg8 - var19;
        int var22 = arg8 - var20;
        int var23 = arg6 - var15;
        int var24 = arg6 - var17;
        if (arg2 == 1) {
            if (arg10 == 0) {
                for (int var87 = var17; var87 < var15; var87++) {
                    for (int var88 = var20; var88 < var19; var88++) {
                        if (var87 >= var88) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 1) {
                for (int var85 = var24 - 1; var85 >= var23; var85--) {
                    for (int var86 = var20; var86 < var19; var86++) {
                        if (var86 <= var85) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 2) {
                for (int var83 = var17; var83 < var15; var83++) {
                    for (int var84 = var20; var84 < var19; var84++) {
                        if (var84 >= var83) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 3) {
                for (int var81 = var24 - 1; var81 >= var23; var81--) {
                    for (int var82 = var20; var82 < var19; var82++) {
                        if (var81 <= var82) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg2 == 2) {
            if (arg10 == 0) {
                for (int var79 = var24 - 1; var79 >= var23; var79--) {
                    for (int var80 = var20; var80 < var19; var80++) {
                        if (var79 >> 1 >= var80) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 1) {
                for (int var73 = var17; var73 < var15; var73++) {
                    for (int var74 = var20; var74 < var19; var74++) {
                        if (var16 >= 0 && arg0.length > var16) {
                            if (var74 >= (var73 << 1)) {
                                arg0[var16] = arg7;
                            } else if (arg4) {
                                arg0[var16] = arg5;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var18;
                }
            } else if (arg10 == 2) {
                for (int var75 = var17; var75 < var15; var75++) {
                    for (int var76 = var22 - 1; var76 >= var21; var76--) {
                        if (var76 <= var75 >> 1) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 3) {
                for (int var77 = var24 - 1; var77 >= var23; var77--) {
                    for (int var78 = var22 - 1; var78 >= var21; var78--) {
                        if (var78 >= var77 << 1) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg2 == 3) {
            if (arg10 == 0) {
                for (int var25 = var24 - 1; var25 >= var23; var25--) {
                    for (int var26 = var22 - 1; var26 >= var21; var26--) {
                        if (var25 >> 1 >= var26) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 1) {
                for (int var27 = var24 - 1; var27 >= var23; var27--) {
                    for (int var28 = var20; var28 < var19; var28++) {
                        if (var28 >= var27 << 1) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 2) {
                for (int var31 = var17; var31 < var15; var31++) {
                    for (int var32 = var20; var32 < var19; var32++) {
                        if (var32 <= var31 >> 1) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 3) {
                for (int var29 = var17; var29 < var15; var29++) {
                    for (int var30 = var22 - 1; var30 >= var21; var30--) {
                        if (var30 >= var29 << 1) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg2 == 4) {
            if (arg10 == 0) {
                for (int var71 = var24 - 1; var71 >= var23; var71--) {
                    for (int var72 = var20; var72 < var19; var72++) {
                        if (var71 >> 1 <= var72) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 1) {
                for (int var65 = var17; var65 < var15; var65++) {
                    for (int var66 = var20; var66 < var19; var66++) {
                        if (var65 << 1 >= var66) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 2) {
                for (int var69 = var17; var69 < var15; var69++) {
                    for (int var70 = var22 - 1; var70 >= var21; var70--) {
                        if (var70 >= var69 >> 1) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 3) {
                for (int var67 = var24 - 1; var67 >= var23; var67--) {
                    for (int var68 = var22 - 1; var68 >= var21; var68--) {
                        if ((var67 << 1) >= var68) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg2 == 5) {
            if (arg10 == 0) {
                for (int var63 = var24 - 1; var63 >= var23; var63--) {
                    for (int var64 = var22 - 1; var64 >= var21; var64--) {
                        if (var64 >= var63 >> 1) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 1) {
                for (int var57 = var24 - 1; var57 >= var23; var57--) {
                    for (int var58 = var20; var58 < var19; var58++) {
                        if (var58 <= var57 << 1) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 2) {
                for (int var61 = var17; var61 < var15; var61++) {
                    for (int var62 = var20; var62 < var19; var62++) {
                        if (var62 >= var61 >> 1) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg10 == 3) {
                for (int var59 = var17; var59 < var15; var59++) {
                    for (int var60 = var22 - 1; var60 >= var21; var60--) {
                        if (var59 << 1 >= var60) {
                            arg0[var16] = arg7;
                        } else if (arg4) {
                            arg0[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg3 == 19453) {
            if (arg2 == 6) {
                if (arg10 == 0) {
                    for (int var39 = var17; var39 < var15; var39++) {
                        for (int var40 = var20; var40 < var19; var40++) {
                            if ((arg8 / 2) >= var40) {
                                arg0[var16] = arg7;
                            } else if (arg4) {
                                arg0[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var37 = var17; var37 < var15; var37++) {
                        for (int var38 = var20; var38 < var19; var38++) {
                            if ((arg6 / 2) >= var37) {
                                arg0[var16] = arg7;
                            } else if (arg4) {
                                arg0[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var35 = var17; var35 < var15; var35++) {
                        for (int var36 = var20; var36 < var19; var36++) {
                            if (arg8 / 2 <= var36) {
                                arg0[var16] = arg7;
                            } else if (arg4) {
                                arg0[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var33 = var17; var33 < var15; var33++) {
                        for (int var34 = var20; var34 < var19; var34++) {
                            if ((arg6 / 2) <= var33) {
                                arg0[var16] = arg7;
                            } else if (arg4) {
                                arg0[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg2 == 7) {
                if (arg10 == 0) {
                    for (int var41 = var17; var41 < var15; var41++) {
                        for (int var42 = var20; var42 < var19; var42++) {
                            if ((var41 - (arg6 / 2)) >= var42) {
                                arg0[var16] = arg7;
                            } else if (arg4) {
                                arg0[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var55 = var24 - 1; var55 >= var23; var55--) {
                        for (int var56 = var20; var56 < var19; var56++) {
                            if (var55 - (arg6 / 2) >= var56) {
                                arg0[var16] = arg7;
                            } else if (arg4) {
                                arg0[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var43 = var24 - 1; var43 >= var23; var43--) {
                        for (int var44 = var22 - 1; var44 >= var21; var44--) {
                            if ((var43 - (arg6 / 2)) >= var44) {
                                arg0[var16] = arg7;
                            } else if (arg4) {
                                arg0[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var53 = var17; var53 < var15; var53++) {
                        for (int var54 = var22 - 1; var54 >= var21; var54--) {
                            if (var54 <= (var53 - (arg6 / 2))) {
                                arg0[var16] = arg7;
                            } else if (arg4) {
                                arg0[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg2 == 8) {
                if (arg10 == 0) {
                    for (int var45 = var17; var45 < var15; var45++) {
                        for (int var46 = var20; var46 < var19; var46++) {
                            if (var45 - (arg6 / 2) <= var46) {
                                arg0[var16] = arg7;
                            } else if (arg4) {
                                arg0[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var51 = var24 - 1; var51 >= var23; var51--) {
                        for (int var52 = var20; var52 < var19; var52++) {
                            if (var52 >= (var51 - (arg6 / 2))) {
                                arg0[var16] = arg7;
                            } else if (arg4) {
                                arg0[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var49 = var24 - 1; var49 >= var23; var49--) {
                        for (int var50 = var22 - 1; var50 >= var21; var50--) {
                            if (var50 >= var49 - (arg6 / 2)) {
                                arg0[var16] = arg7;
                            } else if (arg4) {
                                arg0[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var47 = var17; var47 < var15; var47++) {
                        for (int var48 = var22 - 1; var48 >= var21; var48--) {
                            if ((var47 - arg6 / 2) <= var48) {
                                arg0[var16] = arg7;
                            } else if (arg4) {
                                arg0[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V", line = 1381)
    public static final void method1097(boolean arg0) {
        if (!arg0) {
            return;
        }
        for (int var1 = 0; var1 < class314.field5335; var1++) {
            int var2 = class158.field2715[var1];
            class115 var3 = class201.field3560[var2];
            int var4 = class54.field1051.method1325(7627);
            if ((var4 & 0x1) != 0) {
                int var5 = class54.field1051.method1331(28057);
                int var6 = class54.field1051.method1318(-79);
                if (var5 == 65535) {
                    var5 = -1;
                }
                class238.method1623(var5, var6, !arg0, var3);
            }
            if ((var4 & 0x2) != 0) {
                var3.field479 = class54.field1051.method1331(28057);
                var3.field432 = class54.field1051.method1330(true);
            }
            if ((var4 & 0x4) != 0) {
                var3.field458 = class54.field1051.method1330(true);
                if (var3.field458 == 65535) {
                    var3.field458 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var7 = class54.field1051.method1318(-94);
                int var8 = class54.field1051.method1318(-113);
                var3.method129(class293.field5011, var8, var7, true);
            }
            if ((var4 & 0x8) != 0) {
                int var9 = class54.field1051.method1322(-31669);
                int var10 = class54.field1051.method1327(-62);
                var3.method129(class293.field5011, var10, var9, true);
                var3.field437 = class293.field5011 + 300;
                var3.field429 = class54.field1051.method1322(-31669);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field1934.method1435((byte) 98)) {
                    class302.method2055(var3, -1);
                }
                var3.field1934 = class203.method1411(false, class54.field1051.method1308(-71));
                var3.method126(-103, var3.field1934.field3706);
                var3.field467 = var3.field1934.field3674;
                var3.field443 = var3.field1934.field3680;
                var3.field425 = var3.field1934.field3700;
                var3.field482 = var3.field1934.field3639;
                var3.field446 = var3.field1934.field3651;
                var3.field481 = var3.field1934.field3705;
                var3.field439 = var3.field1934.field3697;
                var3.field455 = var3.field1934.field3647;
                if (var3.field1934.method1435((byte) 83)) {
                    class267.method1864(var3.field450[0], (class38) null, 0, (class123) null, var3, 0, class133.field2315, var3.field422[0]);
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field416 = class54.field1051.method1330(true);
                int var11 = class54.field1051.method1323(4376);
                var3.field456 = (var11 & 0xFFFF) + class293.field5011;
                if (var3.field416 == 65535) {
                    var3.field416 = -1;
                }
                var3.field427 = 0;
                var3.field475 = 0;
                if (class293.field5011 < var3.field456) {
                    var3.field475 = -1;
                }
                var3.field466 = var11 >> 16;
                if (var3.field416 != -1 && class293.field5011 == var3.field456) {
                    int var12 = class169.method1134(2, var3.field416).field2303;
                    if (var12 != -1) {
                        class1 var13 = method1091(-60, var12);
                        if (var13 != null && var13.field8 != null) {
                            class171.method1143(var3.field418, -64, var13, false, 0, var3.field478);
                        }
                    }
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field462 = class54.field1051.method1319(1);
                var3.field471 = 100;
            }
        }
        field2863++;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(III)V", line = 1657)
    public class167(int arg0, int arg1, int arg2) {
        this.field2871 = arg1;
        this.field2869 = new class308[this.field2871];
        this.field2862 = arg0;
        this.field2864 = new int[this.field2862][3][arg2];
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)[[I", line = 1530)
    public final int[][] method1098(int arg0, int arg1) {
        if (arg1 != -19544) {
            field2881 = (class314) null;
        }
        field2879++;
        if (this.field2871 == this.field2862) {
            this.field2883 = this.field2869[arg0] == null;
            this.field2869[arg0] = class249.field4298;
            return this.field2864[arg0];
        } else if (this.field2862 == 1) {
            this.field2883 = this.field2874 != arg0;
            this.field2874 = arg0;
            return this.field2864[0];
        } else {
            class308 var3 = this.field2869[arg0];
            if (var3 == null) {
                this.field2883 = true;
                if (this.field2862 <= this.field2882) {
                    class308 var4 = (class308) this.field2866.method2031(1211754408);
                    var3 = new class308(arg0, var4.field5230);
                    this.field2869[var4.field5228] = null;
                    var4.method1978((byte) 102);
                } else {
                    var3 = new class308(arg0, this.field2882);
                    this.field2882++;
                }
                this.field2869[arg0] = var3;
            } else {
                this.field2883 = false;
            }
            this.field2866.method2022(-109, var3);
            return this.field2864[var3.field5230];
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V", line = 1599)
    public final void method1099(int arg0) {
        if (arg0 > -14) {
            return;
        }
        for (int var2 = 0; var2 < this.field2862; var2++) {
            this.field2864[var2][0] = null;
            this.field2864[var2][1] = null;
            this.field2864[var2][2] = null;
            this.field2864[var2] = (int[][]) null;
        }
        this.field2869 = null;
        this.field2864 = (int[][][]) null;
        field2880++;
        this.field2866.method2025((byte) -97);
        this.field2866 = null;
    }
}
