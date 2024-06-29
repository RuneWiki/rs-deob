import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class184 {

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Z")
    public boolean field2640 = false;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public int field2639 = 0;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public int field2641 = 0;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2638 = "Loading defaults - ";

    @OriginalMember(owner = "client!om", name = "j", descriptor = "Ls;")
    public static class196 field2646 = new class196(16);

    @OriginalMember(owner = "client!om", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2648 = "Loaded config";

    @OriginalMember(owner = "client!om", name = "p", descriptor = "F")
    public static float field2652;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "Lch;")
    public class115 field2643;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "Lph;")
    public static class361 field2650;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field2645;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Loj;Lph;Lph;Z)V", line = 7)
    public static final void method1281(class297 arg0, class361 arg1, class361 arg2, boolean arg3) {
        field2637++;
        class64.field941 = arg0;
        if (arg3) {
            method1283(81L, 89);
        }
        class33.field479 = arg2;
        class175.field2519 = arg1;
        if (class175.field2519 != null) {
            class122.field1732 = class175.field2519.method2539(true, 1);
        }
        if (class33.field479 != null) {
            class321.field4837 = class33.field479.method2539(true, 1);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([[B[[B[[BI[[B[[FI[[I[Ltm;I[[F[[F)V", line = 33)
    public static final void method1282(byte[][] arg0, byte[][] arg1, byte[][] arg2, int arg3, byte[][] arg4, float[][] arg5, int arg6, int[][] arg7, class277[] arg8, int arg9, float[][] arg10, float[][] arg11) {
        field2649++;
        if (arg3 <= 31) {
            field2646 = (class196) null;
        }
        for (int var12 = 0; var12 < arg9; var12++) {
            class277 var13 = arg8[var12];
            if (var13.field4214 == arg6) {
                class171 var14 = new class171();
                int var15 = 0;
                int var16 = (var13.field4208 >> 7) + var13.field4225;
                int var17 = (var13.field4222 >> 7) - var13.field4225;
                int var18 = (var13.field4208 >> 7) - var13.field4225;
                if (var16 > 103) {
                    var16 = 103;
                }
                if (var18 < 0) {
                    var15 -= var18;
                    var18 = 0;
                }
                for (int var19 = var18; var19 <= var16; var19++) {
                    short var20 = var13.field4204[var15];
                    int var21 = (var20 >> 8) + var17;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg0[var23][var19] & 0xFF;
                        int var25 = arg1[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class243 var27 = class1.method5(4, var25 - 1);
                            if (var27.field3627 == -1) {
                                continue;
                            }
                            if (arg2[var23][var19] != 0) {
                                int[] var28 = class149.field2175[arg2[var23][var19]];
                                var14.field2467 += (var28.length >> 1) * 3 - 6;
                                var14.field2470 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class243 var29 = class1.method5(4, var25 - 1);
                            if (var29.field3627 == -1) {
                                byte var30 = arg2[var23][var19];
                                if (var30 != 0) {
                                    int[] var31 = class81.field1166[var30];
                                    var14.field2467 += ((var31.length >> 1) - 2) * 3;
                                    var14.field2470 += var31.length >> 1;
                                }
                                continue;
                            }
                            byte var32 = arg2[var23][var19];
                            if (var32 != 0) {
                                var26 = true;
                            }
                        }
                        class180 var33 = class9.method53(arg6, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field2585 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field2585 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var45 = var21 <= var23 - 1;
                                    boolean var46 = var22 >= var23 + 1;
                                    if (!var45 && (var19 + 1) <= var16) {
                                        short var47 = var13.field4204[var15 + 1];
                                        int var48 = (var47 >> 8) + var17;
                                        int var49 = (var47 & 0xFF) + var48;
                                        var45 = var23 > var48 && var23 < var49;
                                    }
                                    if (!var46 && var18 <= var19 - 1) {
                                        short var50 = var13.field4204[var15 - 1];
                                        int var51 = (var50 >> 8) + var17;
                                        int var52 = (var50 & 0xFF) + var51;
                                        var46 = var51 < var23 && var23 < var52;
                                    }
                                    if (var45 && var46) {
                                        var35 = class149.field2175[0];
                                    } else if (var45) {
                                        var35 = class149.field2175[1];
                                    } else if (var46) {
                                        var35 = class149.field2175[1];
                                    }
                                } else {
                                    boolean var37 = var22 >= (var23 + 1);
                                    boolean var38 = var21 <= (var23 - 1);
                                    if (!var38 && var18 <= (var19 - 1)) {
                                        short var39 = var13.field4204[var15 - 1];
                                        int var40 = var17 + (var39 >> 8);
                                        int var41 = var40 + (var39 & 0xFF);
                                        var38 = var40 < var23 && var23 < var41;
                                    }
                                    if (!var37 && var16 >= var19 + 1) {
                                        short var42 = var13.field4204[var15 + 1];
                                        int var43 = (var42 >> 8) + var17;
                                        int var44 = var43 + (var42 & 0xFF);
                                        var37 = var43 < var23 && var23 < var44;
                                    }
                                    if (var38 && var37) {
                                        var35 = class149.field2175[0];
                                    } else if (var38) {
                                        var35 = class149.field2175[1];
                                    } else if (var37) {
                                        var35 = class149.field2175[1];
                                    }
                                }
                                if (var35 != null) {
                                    var14.field2467 += (var35.length >> 1) * 3 - 6;
                                    var14.field2470 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var54 = class149.field2175[arg2[var23][var19]];
                            int[] var55 = class81.field1166[arg2[var23][var19]];
                            var14.field2467 += (var54.length >> 1) * 3 - 6;
                            var14.field2467 += (var55.length >> 1) * 3 - 6;
                            var14.field2470 += var54.length >> 1;
                            var14.field2470 += var55.length >> 1;
                        } else {
                            int[] var53 = class149.field2175[0];
                            var14.field2467 += ((var53.length >> 1) - 2) * 3;
                            var14.field2470 += var53.length >> 1;
                        }
                    }
                    var15++;
                }
                var14.method1201();
                int var56 = 0;
                if ((var13.field4208 >> 7) - var13.field4225 < 0) {
                    var56 -= (var13.field4208 >> 7) - var13.field4225;
                }
                for (int var57 = var18; var57 <= var16; var57++) {
                    short var58 = var13.field4204[var56];
                    int var59 = var17 + (var58 >> 8);
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg4[var61][var57];
                        int var63 = arg0[var61][var57] & 0xFF;
                        int var64 = arg1[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var63 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class243 var66 = class1.method5(4, var64 - 1);
                            if (var66.field3627 == -1) {
                                continue;
                            }
                            if (arg2[var61][var57] != 0) {
                                class296.method2111(var61, class149.field2175[arg2[var61][var57]], var14, arg4[var61][var57], arg11, arg7, arg5, var57, var13, true, arg10);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class243 var67 = class1.method5(4, var64 - 1);
                            if (var67.field3627 == -1) {
                                class296.method2111(var61, class81.field1166[arg2[var61][var57]], var14, arg4[var61][var57], arg11, arg7, arg5, var57, var13, true, arg10);
                                continue;
                            }
                            byte var68 = arg2[var61][var57];
                            if (var68 != 0) {
                                var65 = true;
                            }
                        }
                        class180 var69 = class9.method53(arg6, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field2585 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field2585 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = (var61 - 1) >= var59;
                                    if (!var81 && var16 >= (var57 + 1)) {
                                        short var82 = var13.field4204[var56 + 1];
                                        int var83 = (var82 >> 8) + var17;
                                        int var84 = (var82 & 0xFF) + var83;
                                        var81 = var61 > var83 && var84 > var61;
                                    }
                                    boolean var85 = var60 >= var61 + 1;
                                    if (!var85 && (var57 - 1) >= var18) {
                                        short var86 = var13.field4204[var56 - 1];
                                        int var87 = (var86 >> 8) + var17;
                                        int var88 = var87 + (var86 & 0xFF);
                                        var85 = var61 > var87 && var88 > var61;
                                    }
                                    if (var81 && var85) {
                                        var71 = class149.field2175[0];
                                    } else if (var81) {
                                        var71 = class149.field2175[1];
                                        var62 = 1;
                                    } else if (var85) {
                                        var71 = class149.field2175[1];
                                        var62 = 3;
                                    }
                                } else {
                                    boolean var73 = var59 <= var61 - 1;
                                    boolean var74 = var60 >= var61 + 1;
                                    if (!var73 && var57 - 1 >= var18) {
                                        short var75 = var13.field4204[var56 - 1];
                                        int var76 = (var75 >> 8) + var17;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var73 = var61 > var76 && var61 < var77;
                                    }
                                    if (!var74 && var16 >= var57 + 1) {
                                        short var78 = var13.field4204[var56 + 1];
                                        int var79 = var17 + (var78 >> 8);
                                        int var80 = var79 + (var78 & 0xFF);
                                        var74 = var79 < var61 && var80 > var61;
                                    }
                                    if (var73 && var74) {
                                        var71 = class149.field2175[0];
                                    } else if (var73) {
                                        var62 = 0;
                                        var71 = class149.field2175[1];
                                    } else if (var74) {
                                        var62 = 2;
                                        var71 = class149.field2175[1];
                                    }
                                }
                                if (var71 != null) {
                                    class296.method2111(var61, var71, var14, var62, arg11, arg7, arg5, var57, var13, true, arg10);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class296.method2111(var61, class81.field1166[arg2[var61][var57]], var14, arg4[var61][var57], arg11, arg7, arg5, var57, var13, true, arg10);
                            class296.method2111(var61, class149.field2175[arg2[var61][var57]], var14, arg4[var61][var57], arg11, arg7, arg5, var57, var13, true, arg10);
                        } else {
                            class296.method2111(var61, class149.field2175[0], var14, var62, arg11, arg7, arg5, var57, var13, true, arg10);
                        }
                    }
                    var56++;
                }
                if (var14.field2460 > 0 && var14.field2466 > 0) {
                    var14.method1204();
                    var13.field4205 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(JI)V", line = 566)
    public static final void method1283(long arg0, int arg1) {
        field2651++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % (long) arg1 == 0L) {
            class147.method1043(-74, arg0 - 1L);
            class147.method1043(-122, 1L);
        } else {
            class147.method1043(127, arg0);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 592)
    public static void method1284(int arg0) {
        field2650 = null;
        field2638 = null;
        field2646 = null;
        if (arg0 != 0) {
            method1284(70);
        }
        field2648 = null;
    }
}
