import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class119 extends class224 {

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
    private int field1858 = 32768;

    @OriginalMember(owner = "client!aj", name = "cb", descriptor = "Luf;")
    public static class168 field1862 = class148.method1019(-1720, "sch-Utteln:");

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!aj", name = "bb", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(Z)V", line = 5)
    public static final void method856(boolean arg0) {
        class58.field761.method1431((byte) 124);
        field1861++;
        if (!arg0) {
            method857((byte[][]) ((byte[][]) null), true, -3, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (class291[]) null, (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), -46);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)[[I", line = 24)
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 != -77) {
            return (int[][]) ((int[][]) null);
        }
        field1860++;
        int[][] var3 = this.field3631.method1587(arg0, 9804);
        if (this.field3631.field3756) {
            int[] var4 = this.method1537(arg0, 1, arg1 ^ 0xFFFFFFB3);
            int[] var5 = this.method1537(arg0, 2, 0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class187.field2961; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field1858 >> 12;
                int var12 = class261.field4425[var10] * var11 >> 12;
                int var13 = class203.field3339[var10] * var11 >> 12;
                int var14 = class205.field3363 & (var12 >> 12) + var9;
                int var15 = (var13 >> 12) + arg0 & class169.field2777;
                int[][] var16 = this.method1535(0, 3, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZLj;)V", line = 89)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field1854++;
        if (arg0 == 0) {
            this.field1858 = arg2.method1069(125) << 4;
        } else if (arg0 == 1) {
            this.field3610 = arg2.method1042((byte) 115) == 1;
        }
        if (arg1) {
            this.method17(-15, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([[BZI[[F[[F[Llf;[[B[[I[[B[[F[[BI)V", line = 125)
    public static final void method857(byte[][] arg0, boolean arg1, int arg2, float[][] arg3, float[][] arg4, class291[] arg5, byte[][] arg6, int[][] arg7, byte[][] arg8, float[][] arg9, byte[][] arg10, int arg11) {
        if (arg1) {
            field1862 = (class168) null;
        }
        for (int var12 = 0; var12 < arg11; var12++) {
            class291 var13 = arg5[var12];
            if (var13.field4889 == arg2) {
                class220 var14 = new class220();
                int var15 = 0;
                int var16 = (var13.field4905 >> 7) - var13.field4893;
                int var17 = (var13.field4909 >> 7) - var13.field4893;
                if (var17 < 0) {
                    var15 -= var17;
                    var17 = 0;
                }
                int var18 = (var13.field4909 >> 7) + var13.field4893;
                if (var18 > 103) {
                    var18 = 103;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field4892[var15];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = var21 - (1 - (var20 & 0xFF));
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        boolean var24 = false;
                        int var25 = arg0[var23][var19] & 0xFF;
                        int var26 = arg10[var23][var19] & 0xFF;
                        if (var26 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class203 var27 = class76.method449(1446, var25 - 1);
                            if (var27.field3341 == -1) {
                                continue;
                            }
                            if (arg8[var23][var19] != 0) {
                                int[] var28 = class145.field2253[arg8[var23][var19]];
                                var14.field3570 += (var28.length >> 1) * 3 - 6;
                                var14.field3569 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class203 var29 = class76.method449(1446, var25 - 1);
                            if (var29.field3341 == -1) {
                                byte var31 = arg8[var23][var19];
                                if (var31 != 0) {
                                    int[] var32 = class215.field3508[var31];
                                    var14.field3570 += ((var32.length >> 1) - 2) * 3;
                                    var14.field3569 += var32.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg8[var23][var19];
                            if (var30 != 0) {
                                var24 = true;
                            }
                        }
                        class91 var33 = class237.method1594(arg2, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field1407 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field1407 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var37 = var23 - 1 >= var21;
                                    if (!var37 && var18 >= (var19 + 1)) {
                                        short var38 = var13.field4892[var15 + 1];
                                        int var39 = (var38 >> 8) + var16;
                                        int var40 = var39 + (var38 & 0xFF);
                                        var37 = var23 > var39 && var40 > var23;
                                    }
                                    boolean var41 = (var23 + 1) <= var22;
                                    if (!var41 && (var19 - 1) >= var17) {
                                        short var42 = var13.field4892[var15 - 1];
                                        int var43 = (var42 >> 8) + var16;
                                        int var44 = (var42 & 0xFF) + var43;
                                        var41 = var23 > var43 && var44 > var23;
                                    }
                                    if (var37 && var41) {
                                        var35 = class145.field2253[0];
                                    } else if (var37) {
                                        var35 = class145.field2253[1];
                                    } else if (var41) {
                                        var35 = class145.field2253[1];
                                    }
                                } else {
                                    boolean var45 = var22 >= var23 + 1;
                                    boolean var46 = var23 - 1 >= var21;
                                    if (!var46 && var17 <= var19 - 1) {
                                        short var47 = var13.field4892[var15 - 1];
                                        int var48 = (var47 >> 8) + var16;
                                        int var49 = (var47 & 0xFF) + var48;
                                        var46 = var48 < var23 && var49 > var23;
                                    }
                                    if (!var45 && (var19 + 1) <= var18) {
                                        short var50 = var13.field4892[var15 + 1];
                                        int var51 = (var50 >> 8) + var16;
                                        int var52 = (var50 & 0xFF) + var51;
                                        var45 = var51 < var23 && var52 > var23;
                                    }
                                    if (var46 && var45) {
                                        var35 = class145.field2253[0];
                                    } else if (var46) {
                                        var35 = class145.field2253[1];
                                    } else if (var45) {
                                        var35 = class145.field2253[1];
                                    }
                                }
                                if (var35 != null) {
                                    var14.field3570 += ((var35.length >> 1) - 2) * 3;
                                    var14.field3569 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var24) {
                            int[] var54 = class145.field2253[arg8[var23][var19]];
                            int[] var55 = class215.field3508[arg8[var23][var19]];
                            var14.field3570 += (var54.length >> 1) * 3 - 6;
                            var14.field3570 += (var55.length >> 1) * 3 - 6;
                            var14.field3569 += var54.length >> 1;
                            var14.field3569 += var55.length >> 1;
                        } else {
                            int[] var53 = class145.field2253[0];
                            var14.field3570 += ((var53.length >> 1) - 2) * 3;
                            var14.field3569 += var53.length >> 1;
                        }
                    }
                    var15++;
                }
                int var56 = 0;
                var14.method1519();
                if (((var13.field4909 >> 7) - var13.field4893) < 0) {
                    var56 -= (var13.field4909 >> 7) - var13.field4893;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field4892[var56];
                    int var59 = var16 + (var58 >> 8);
                    int var60 = var59 + (var58 & 0xFF) - 1;
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg6[var61][var57];
                        int var63 = arg0[var61][var57] & 0xFF;
                        boolean var64 = false;
                        int var65 = arg10[var61][var57] & 0xFF;
                        if (var65 == 0) {
                            if (var63 == 0) {
                                continue;
                            }
                            class203 var68 = class76.method449(1446, var63 - 1);
                            if (var68.field3341 == -1) {
                                continue;
                            }
                            if (arg8[var61][var57] != 0) {
                                class60.method338(var61, arg6[var61][var57], 1, arg7, arg3, var57, var13, arg9, var14, arg4, class145.field2253[arg8[var61][var57]]);
                                continue;
                            }
                        } else if (var63 == 0) {
                            var62 = 0;
                        } else {
                            class203 var66 = class76.method449(1446, var63 - 1);
                            if (var66.field3341 == -1) {
                                class60.method338(var61, arg6[var61][var57], 1, arg7, arg3, var57, var13, arg9, var14, arg4, class215.field3508[arg8[var61][var57]]);
                                continue;
                            }
                            byte var67 = arg8[var61][var57];
                            if (var67 != 0) {
                                var64 = true;
                            }
                        }
                        class91 var69 = class237.method1594(arg2, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field1407 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field1407 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var73 = var61 - 1 >= var59;
                                    if (!var73 && (var57 + 1) <= var18) {
                                        short var74 = var13.field4892[var56 + 1];
                                        int var75 = var16 + (var74 >> 8);
                                        int var76 = (var74 & 0xFF) + var75;
                                        var73 = var61 > var75 && var76 > var61;
                                    }
                                    boolean var77 = var61 + 1 <= var60;
                                    if (!var77 && (var57 - 1) >= var17) {
                                        short var78 = var13.field4892[var56 - 1];
                                        int var79 = (var78 >> 8) + var16;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var77 = var61 > var79 && var61 < var80;
                                    }
                                    if (var73 && var77) {
                                        var71 = class145.field2253[0];
                                    } else if (var73) {
                                        var62 = 1;
                                        var71 = class145.field2253[1];
                                    } else if (var77) {
                                        var62 = 3;
                                        var71 = class145.field2253[1];
                                    }
                                } else {
                                    boolean var81 = var59 <= var61 - 1;
                                    if (!var81 && var17 <= var57 - 1) {
                                        short var82 = var13.field4892[var56 - 1];
                                        int var83 = (var82 >> 8) + var16;
                                        int var84 = (var82 & 0xFF) + var83;
                                        var81 = var61 > var83 && var84 > var61;
                                    }
                                    boolean var85 = var60 >= (var61 + 1);
                                    if (!var85 && (var57 + 1) <= var18) {
                                        short var86 = var13.field4892[var56 + 1];
                                        int var87 = (var86 >> 8) + var16;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var85 = var61 > var87 && var61 < var88;
                                    }
                                    if (var81 && var85) {
                                        var71 = class145.field2253[0];
                                    } else if (var81) {
                                        var71 = class145.field2253[1];
                                        var62 = 0;
                                    } else if (var85) {
                                        var71 = class145.field2253[1];
                                        var62 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class60.method338(var61, var62, 1, arg7, arg3, var57, var13, arg9, var14, arg4, var71);
                                }
                                continue;
                            }
                        }
                        if (var64) {
                            class60.method338(var61, arg6[var61][var57], 1, arg7, arg3, var57, var13, arg9, var14, arg4, class215.field3508[arg8[var61][var57]]);
                            class60.method338(var61, arg6[var61][var57], 1, arg7, arg3, var57, var13, arg9, var14, arg4, class145.field2253[arg8[var61][var57]]);
                        } else {
                            class60.method338(var61, var62, 1, arg7, arg3, var57, var13, arg9, var14, arg4, class145.field2253[0]);
                        }
                    }
                    var56++;
                }
                if (var14.field3578 > 0 && var14.field3575 > 0) {
                    var14.method1521();
                    var13.field4903 = var14;
                }
            }
        }
        field1859++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V", line = 648)
    public final void method80(boolean arg0) {
        field1853++;
        if (!arg0) {
            class125.method889(-56);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)Lug;", line = 660)
    public static final class190 method858(boolean arg0, int arg1) {
        class190 var2 = (class190) class78.field1066.method1424((long) arg1, (byte) 98);
        field1857++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class61.field799.method1647(class275.method1897(arg1, (byte) 86), (byte) 120, class193.method1362(-117, arg1));
        class190 var4 = new class190();
        if (var3 != null) {
            var4.method1348(118, new class153(var3));
        }
        var4.method1343((byte) 121);
        class78.field1066.method1430(var4, (long) arg1, 13487);
        if (!arg0) {
            field1862 = (class168) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 689)
    public class119() {
        super(3, false);
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(B)V", line = 695)
    public static void method859(byte arg0) {
        int var1 = -66 / ((-arg0 - 20) / 58);
        field1862 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)[I", line = 706)
    public final int[] method18(byte arg0, int arg1) {
        field1855++;
        int[] var3 = this.field3613.method1866(1, arg1);
        int var4 = 39 % ((arg0 - 20) / 51);
        if (this.field3613.field4531) {
            int[] var5 = this.method1537(arg1, 1, 0);
            int[] var6 = this.method1537(arg1, 2, 0);
            for (int var7 = 0; var7 < class187.field2961; var7++) {
                int var8 = (var5[var7] & 0xFF5) >> 4;
                int var9 = var6[var7] * this.field1858 >> 12;
                int var10 = class203.field3339[var8] * var9 >> 12;
                int var11 = class261.field4425[var8] * var9 >> 12;
                int var12 = arg1 + (var10 >> 12) & class169.field2777;
                int var13 = (var11 >> 12) + var7 & class205.field3363;
                int[] var14 = this.method1537(var12, 0, 0);
                var3[var7] = var14[var13];
            }
        }
        return var3;
    }
}
