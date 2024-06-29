import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class188 extends class110 {

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
    private int field2801 = 4096;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "Z")
    private boolean field2795 = true;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field2797 = 0;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "Z")
    public static boolean field2799 = false;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "Llm;")
    public static class210 field2802;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)[[I", line = 7)
    public final int[][] method445(int arg0, boolean arg1) {
        int[][] var3 = this.field1701.method1477((byte) 47, arg0);
        field2803++;
        if (arg1) {
            method1284(true);
        }
        if (this.field1701.field3255) {
            int[] var4 = this.method764(0, true, arg0 - 1 & class154.field2320);
            int[] var5 = this.method764(0, !arg1, arg0);
            int[] var6 = this.method764(0, true, arg0 + 1 & class154.field2320);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; var10 < class124.field1936; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field2801;
                int var12 = (var5[var10 + 1 & class196.field2949] - var5[var10 - 1 & class196.field2949]) * this.field2801;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + var15 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var20 = 16777216 / var17;
                    var19 = var11 / var17;
                }
                if (this.field2795) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var18;
                var9[var10] = var19;
                var8[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V", line = 87)
    public static final void method1284(boolean arg0) {
        class97.field1452.method2182(!arg0);
        class274.field4203.method2182(false);
        class29.field391.method2182(false);
        field2798++;
        if (!arg0) {
            method1286((byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), 126, (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (byte) 41, (float[][]) ((float[][]) null), -58, (byte[][]) ((byte[][]) null), (class266[]) null, (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null));
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V", line = 103)
    public static void method1285(byte arg0) {
        if (arg0 < 124) {
            field2797 = -56;
        }
        field2802 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([[B[[FI[[F[[BB[[FI[[B[Lpe;[[B[[I)V", line = 122)
    public static final void method1286(byte[][] arg0, float[][] arg1, int arg2, float[][] arg3, byte[][] arg4, byte arg5, float[][] arg6, int arg7, byte[][] arg8, class266[] arg9, byte[][] arg10, int[][] arg11) {
        if (arg5 != -6) {
            return;
        }
        for (int var12 = 0; var12 < arg2; var12++) {
            class266 var13 = arg9[var12];
            if (var13.field4076 == arg7) {
                class24 var14 = new class24();
                int var15 = 0;
                int var16 = (var13.field4088 >> 7) - var13.field4098;
                int var17 = (var13.field4074 >> 7) + var13.field4098;
                int var18 = (var13.field4074 >> 7) - var13.field4098;
                if (var17 > 103) {
                    var17 = 103;
                }
                if (var18 < 0) {
                    var15 -= var18;
                    var18 = 0;
                }
                for (int var19 = var18; var19 <= var17; var19++) {
                    short var20 = var13.field4093[var15];
                    int var21 = var16 + (var20 >> 8);
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
                            class88 var27 = class186.method1278(var25 - 1, true);
                            if (var27.field1309 == -1) {
                                continue;
                            }
                            if (arg10[var23][var19] != 0) {
                                int[] var28 = class120.field1877[arg10[var23][var19]];
                                var14.field359 += (var28.length >> 1) * 3 - 6;
                                var14.field363 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class88 var29 = class186.method1278(var25 - 1, true);
                            if (var29.field1309 == -1) {
                                byte var54 = arg10[var23][var19];
                                if (var54 != 0) {
                                    int[] var55 = class222.field3391[var54];
                                    var14.field359 += ((var55.length >> 1) - 2) * 3;
                                    var14.field363 += var55.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg10[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class311 var31 = class187.method1283(arg7, var23, var19);
                        if (var31 != null) {
                            int var32 = (int) (var31.field4720 >> 14) & 0x3F;
                            if (var32 == 9) {
                                int[] var33 = null;
                                int var34 = (int) (var31.field4720 >> 20) & 0x3;
                                if ((var34 & 0x1) == 0) {
                                    boolean var43 = var21 <= var23 - 1;
                                    boolean var44 = var22 >= var23 + 1;
                                    if (!var43 && var17 >= var19 + 1) {
                                        short var45 = var13.field4093[var15 + 1];
                                        int var46 = (var45 >> 8) + var16;
                                        int var47 = var46 + (var45 & 0xFF);
                                        var43 = var46 < var23 && var47 > var23;
                                    }
                                    if (!var44 && var18 <= (var19 - 1)) {
                                        short var48 = var13.field4093[var15 - 1];
                                        int var49 = var16 + (var48 >> 8);
                                        int var50 = (var48 & 0xFF) + var49;
                                        var44 = var49 < var23 && var23 < var50;
                                    }
                                    if (var43 && var44) {
                                        var33 = class120.field1877[0];
                                    } else if (var43) {
                                        var33 = class120.field1877[1];
                                    } else if (var44) {
                                        var33 = class120.field1877[1];
                                    }
                                } else {
                                    boolean var35 = (var23 - 1) >= var21;
                                    boolean var36 = var22 >= var23 + 1;
                                    if (!var35 && var19 - 1 >= var18) {
                                        short var37 = var13.field4093[var15 - 1];
                                        int var38 = var16 + (var37 >> 8);
                                        int var39 = var38 + (var37 & 0xFF);
                                        var35 = var23 > var38 && var39 > var23;
                                    }
                                    if (!var36 && (var19 + 1) <= var17) {
                                        short var40 = var13.field4093[var15 + 1];
                                        int var41 = var16 + (var40 >> 8);
                                        int var42 = (var40 & 0xFF) + var41;
                                        var36 = var23 > var41 && var42 > var23;
                                    }
                                    if (var35 && var36) {
                                        var33 = class120.field1877[0];
                                    } else if (var35) {
                                        var33 = class120.field1877[1];
                                    } else if (var36) {
                                        var33 = class120.field1877[1];
                                    }
                                }
                                if (var33 != null) {
                                    var14.field359 += (var33.length >> 1) * 3 - 6;
                                    var14.field363 += var33.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var51 = class120.field1877[arg10[var23][var19]];
                            int[] var52 = class222.field3391[arg10[var23][var19]];
                            var14.field359 += ((var51.length >> 1) - 2) * 3;
                            var14.field359 += ((var52.length >> 1) - 2) * 3;
                            var14.field363 += var51.length >> 1;
                            var14.field363 += var52.length >> 1;
                        } else {
                            int[] var53 = class120.field1877[0];
                            var14.field359 += (var53.length >> 1) * 3 - 6;
                            var14.field363 += var53.length >> 1;
                        }
                    }
                    var15++;
                }
                int var56 = 0;
                var14.method165();
                if (((var13.field4074 >> 7) - var13.field4098) < 0) {
                    var56 -= (var13.field4074 >> 7) - var13.field4098;
                }
                for (int var57 = var18; var57 <= var17; var57++) {
                    short var58 = var13.field4093[var56];
                    int var59 = (var58 >> 8) + var16;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        int var62 = arg0[var61][var57] & 0xFF;
                        byte var63 = arg4[var61][var57];
                        int var64 = arg8[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var64 == 0) {
                            if (var62 == 0) {
                                continue;
                            }
                            class88 var66 = class186.method1278(var62 - 1, true);
                            if (var66.field1309 == -1) {
                                continue;
                            }
                            if (arg10[var61][var57] != 0) {
                                class225.method1574(var14, arg11, var13, var57, arg1, arg4[var61][var57], arg6, class120.field1877[arg10[var61][var57]], var61, true, arg3);
                                continue;
                            }
                        } else if (var62 != 0) {
                            class88 var67 = class186.method1278(var62 - 1, true);
                            if (var67.field1309 == -1) {
                                class225.method1574(var14, arg11, var13, var57, arg1, arg4[var61][var57], arg6, class222.field3391[arg10[var61][var57]], var61, true, arg3);
                                continue;
                            }
                            byte var68 = arg10[var61][var57];
                            if (var68 != 0) {
                                var65 = true;
                            }
                        }
                        class311 var69 = class187.method1283(arg7, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field4720 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int var71 = (int) (var69.field4720 >> 20) & 0x3;
                                int[] var72 = null;
                                if ((var71 & 0x1) == 0) {
                                    boolean var73 = (var61 + 1) <= var60;
                                    boolean var74 = var61 - 1 >= var59;
                                    if (!var74 && var17 >= var57 + 1) {
                                        short var75 = var13.field4093[var56 + 1];
                                        int var76 = (var75 >> 8) + var16;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var74 = var61 > var76 && var61 < var77;
                                    }
                                    if (!var73 && (var57 - 1) >= var18) {
                                        short var78 = var13.field4093[var56 - 1];
                                        int var79 = (var78 >> 8) + var16;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var73 = var61 > var79 && var80 > var61;
                                    }
                                    if (var74 && var73) {
                                        var72 = class120.field1877[0];
                                    } else if (var74) {
                                        var72 = class120.field1877[1];
                                        var63 = 1;
                                    } else if (var73) {
                                        var63 = 3;
                                        var72 = class120.field1877[1];
                                    }
                                } else {
                                    boolean var81 = var61 - 1 >= var59;
                                    boolean var82 = var60 >= (var61 + 1);
                                    if (!var81 && var18 <= var57 - 1) {
                                        short var83 = var13.field4093[var56 - 1];
                                        int var84 = (var83 >> 8) + var16;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var81 = var61 > var84 && var61 < var85;
                                    }
                                    if (!var82 && (var57 + 1) <= var17) {
                                        short var86 = var13.field4093[var56 + 1];
                                        int var87 = var16 + (var86 >> 8);
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var61 > var87 && var88 > var61;
                                    }
                                    if (var81 && var82) {
                                        var72 = class120.field1877[0];
                                    } else if (var81) {
                                        var72 = class120.field1877[1];
                                        var63 = 0;
                                    } else if (var82) {
                                        var63 = 2;
                                        var72 = class120.field1877[1];
                                    }
                                }
                                if (var72 != null) {
                                    class225.method1574(var14, arg11, var13, var57, arg1, var63, arg6, var72, var61, true, arg3);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class225.method1574(var14, arg11, var13, var57, arg1, arg4[var61][var57], arg6, class222.field3391[arg10[var61][var57]], var61, true, arg3);
                            class225.method1574(var14, arg11, var13, var57, arg1, arg4[var61][var57], arg6, class120.field1877[arg10[var61][var57]], var61, true, arg3);
                        } else {
                            class225.method1574(var14, arg11, var13, var57, arg1, var63, arg6, class120.field1877[0], var61, true, arg3);
                        }
                    }
                    var56++;
                }
                if (var14.field353 > 0 && var14.field350 > 0) {
                    var14.method163();
                    var13.field4085 = var14;
                }
            }
        }
        field2804++;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)V", line = 651)
    public static final void method1287(int arg0, int arg1) {
        if (arg0 != 427112908) {
            method1287(83, -45);
        }
        field2796++;
        class169 var2 = class101.method712(arg1, 1, 2089666400);
        var2.method1178((byte) 66);
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 711)
    public class188() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILre;I)V", line = 684)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.field2801 = arg1.method1830((byte) -77);
        } else if (arg0 == 1) {
            this.field2795 = arg1.method1787(false) == 1;
        }
        if (arg2 < -37) {
            field2805++;
        }
    }
}
