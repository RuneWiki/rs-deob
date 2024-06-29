import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class46 extends class35 {

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field942 = 0;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "Lth;")
    public static class55 field943 = new class55();

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "[I")
    public static int[] field948 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "Z")
    public static boolean field949 = false;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "Ljava/lang/String;")
    public static String field958 = "white:";

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "F")
    public static float field951;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "Z")
    public static boolean field959;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "[I")
    public int[] field940;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "[I")
    public int[] field941;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "[I")
    public int[] field945;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "[I")
    public static int[] field953;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "[Lh;")
    public class107[] field939;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "[Lh;")
    public class107[] field947;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "[S")
    public static short[] field952;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "[[[B")
    public byte[][][] field938;

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "[[[B")
    public static byte[][][] field957;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "[[[I")
    public static int[][][] field954;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "([[IBI[[F[Lqk;[[B[[B[[B[[FI[[B[[F)V", line = 4)
    public static final void method364(int[][] arg0, byte arg1, int arg2, float[][] arg3, class1[] arg4, byte[][] arg5, byte[][] arg6, byte[][] arg7, float[][] arg8, int arg9, byte[][] arg10, float[][] arg11) {
        field956++;
        if (arg1 != 92) {
            return;
        }
        for (int var12 = 0; var12 < arg2; var12++) {
            class1 var13 = arg4[var12];
            if (var13.field28 == arg9) {
                class299 var14 = new class299();
                int var15 = 0;
                int var16 = (var13.field5 >> 7) - var13.field9;
                int var17 = (var13.field11 >> 7) - var13.field9;
                int var18 = (var13.field11 >> 7) + var13.field9;
                if (var18 > 103) {
                    var18 = 103;
                }
                if (var17 < 0) {
                    var15 -= var17;
                    var17 = 0;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field2[var15];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = var21 + (var20 & 0xFF) - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg5[var23][var19] & 0xFF;
                        boolean var25 = false;
                        int var26 = arg10[var23][var19] & 0xFF;
                        if (var24 == 0) {
                            if (var26 == 0) {
                                continue;
                            }
                            class101 var31 = class194.method1241(var26 - 1, false);
                            if (var31.field1765 == -1) {
                                continue;
                            }
                            if (arg7[var23][var19] != 0) {
                                int[] var55 = class81.field1577[arg7[var23][var19]];
                                var14.field4542 += (var55.length >> 1) * 3 - 6;
                                var14.field4532 += var55.length >> 1;
                                continue;
                            }
                        } else if (var26 != 0) {
                            class101 var27 = class194.method1241(var26 - 1, false);
                            if (var27.field1765 == -1) {
                                byte var29 = arg7[var23][var19];
                                if (var29 != 0) {
                                    int[] var30 = class118.field2051[var29];
                                    var14.field4542 += ((var30.length >> 1) - 2) * 3;
                                    var14.field4532 += var30.length >> 1;
                                }
                                continue;
                            }
                            byte var28 = arg7[var23][var19];
                            if (var28 != 0) {
                                var25 = true;
                            }
                        }
                        class271 var32 = class177.method1112(arg9, var23, var19);
                        if (var32 != null) {
                            int var33 = (int) (var32.field4191 >> 14) & 0x3F;
                            if (var33 == 9) {
                                int[] var34 = null;
                                int var35 = (int) (var32.field4191 >> 20) & 0x3;
                                if ((var35 & 0x1) == 0) {
                                    boolean var44 = var23 - 1 >= var21;
                                    if (!var44 && var19 + 1 <= var18) {
                                        short var45 = var13.field2[var15 + 1];
                                        int var46 = var16 + (var45 >> 8);
                                        int var47 = var46 + (var45 & 0xFF);
                                        var44 = var23 > var46 && var23 < var47;
                                    }
                                    boolean var48 = var23 + 1 <= var22;
                                    if (!var48 && var17 <= (var19 - 1)) {
                                        short var49 = var13.field2[var15 - 1];
                                        int var50 = (var49 >> 8) + var16;
                                        int var51 = var50 + (var49 & 0xFF);
                                        var48 = var23 > var50 && var23 < var51;
                                    }
                                    if (var44 && var48) {
                                        var34 = class81.field1577[0];
                                    } else if (var44) {
                                        var34 = class81.field1577[1];
                                    } else if (var48) {
                                        var34 = class81.field1577[1];
                                    }
                                } else {
                                    boolean var36 = (var23 - 1) >= var21;
                                    if (!var36 && (var19 - 1) >= var17) {
                                        short var37 = var13.field2[var15 - 1];
                                        int var38 = var16 + (var37 >> 8);
                                        int var39 = (var37 & 0xFF) + var38;
                                        var36 = var23 > var38 && var23 < var39;
                                    }
                                    boolean var40 = var22 >= (var23 + 1);
                                    if (!var40 && (var19 + 1) <= var18) {
                                        short var41 = var13.field2[var15 + 1];
                                        int var42 = (var41 >> 8) + var16;
                                        int var43 = (var41 & 0xFF) + var42;
                                        var40 = var42 < var23 && var23 < var43;
                                    }
                                    if (var36 && var40) {
                                        var34 = class81.field1577[0];
                                    } else if (var36) {
                                        var34 = class81.field1577[1];
                                    } else if (var40) {
                                        var34 = class81.field1577[1];
                                    }
                                }
                                if (var34 != null) {
                                    var14.field4542 += (var34.length >> 1) * 3 - 6;
                                    var14.field4532 += var34.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var25) {
                            int[] var53 = class118.field2051[arg7[var23][var19]];
                            int[] var54 = class81.field1577[arg7[var23][var19]];
                            var14.field4542 += (var54.length >> 1) * 3 - 6;
                            var14.field4542 += (var53.length >> 1) * 3 - 6;
                            var14.field4532 += var54.length >> 1;
                            var14.field4532 += var53.length >> 1;
                        } else {
                            int[] var52 = class81.field1577[0];
                            var14.field4542 += (var52.length >> 1) * 3 - 6;
                            var14.field4532 += var52.length >> 1;
                        }
                    }
                    var15++;
                }
                var14.method1991();
                int var56 = 0;
                if (((var13.field11 >> 7) - var13.field9) < 0) {
                    var56 -= (var13.field11 >> 7) - var13.field9;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field2[var56];
                    int var59 = (var58 >> 8) + var16;
                    int var60 = var59 + (var58 & 0xFF) - 1;
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        int var62 = arg5[var61][var57] & 0xFF;
                        byte var63 = arg6[var61][var57];
                        int var64 = arg10[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var62 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class101 var66 = class194.method1241(var64 - 1, false);
                            if (var66.field1765 == -1) {
                                continue;
                            }
                            if (arg7[var61][var57] != 0) {
                                class112.method722(var13, (byte) 84, arg8, class81.field1577[arg7[var61][var57]], var57, arg0, var61, arg3, var14, arg6[var61][var57], arg11);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class101 var67 = class194.method1241(var64 - 1, false);
                            if (var67.field1765 == -1) {
                                class112.method722(var13, (byte) 70, arg8, class118.field2051[arg7[var61][var57]], var57, arg0, var61, arg3, var14, arg6[var61][var57], arg11);
                                continue;
                            }
                            byte var68 = arg7[var61][var57];
                            if (var68 != 0) {
                                var65 = true;
                            }
                        }
                        class271 var69 = class177.method1112(arg9, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field4191 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field4191 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = var59 <= (var61 - 1);
                                    if (!var81 && (var57 + 1) <= var18) {
                                        short var82 = var13.field2[var56 + 1];
                                        int var83 = (var82 >> 8) + var16;
                                        int var84 = (var82 & 0xFF) + var83;
                                        var81 = var83 < var61 && var61 < var84;
                                    }
                                    boolean var85 = (var61 + 1) <= var60;
                                    if (!var85 && var57 - 1 >= var17) {
                                        short var86 = var13.field2[var56 - 1];
                                        int var87 = (var86 >> 8) + var16;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var85 = var61 > var87 && var61 < var88;
                                    }
                                    if (var81 && var85) {
                                        var71 = class81.field1577[0];
                                    } else if (var81) {
                                        var63 = 1;
                                        var71 = class81.field1577[1];
                                    } else if (var85) {
                                        var71 = class81.field1577[1];
                                        var63 = 3;
                                    }
                                } else {
                                    boolean var73 = var60 >= var61 + 1;
                                    boolean var74 = (var61 - 1) >= var59;
                                    if (!var74 && var17 <= var57 - 1) {
                                        short var75 = var13.field2[var56 - 1];
                                        int var76 = (var75 >> 8) + var16;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var74 = var76 < var61 && var61 < var77;
                                    }
                                    if (!var73 && var18 >= (var57 + 1)) {
                                        short var78 = var13.field2[var56 + 1];
                                        int var79 = (var78 >> 8) + var16;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var73 = var79 < var61 && var61 < var80;
                                    }
                                    if (var74 && var73) {
                                        var71 = class81.field1577[0];
                                    } else if (var74) {
                                        var63 = 0;
                                        var71 = class81.field1577[1];
                                    } else if (var73) {
                                        var63 = 2;
                                        var71 = class81.field1577[1];
                                    }
                                }
                                if (var71 != null) {
                                    class112.method722(var13, (byte) 98, arg8, var71, var57, arg0, var61, arg3, var14, var63, arg11);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class112.method722(var13, (byte) -20, arg8, class118.field2051[arg7[var61][var57]], var57, arg0, var61, arg3, var14, arg6[var61][var57], arg11);
                            class112.method722(var13, (byte) 123, arg8, class81.field1577[arg7[var61][var57]], var57, arg0, var61, arg3, var14, arg6[var61][var57], arg11);
                        } else {
                            class112.method722(var13, (byte) 103, arg8, class81.field1577[0], var57, arg0, var61, arg3, var14, var63, arg11);
                        }
                    }
                    var56++;
                }
                if (var14.field4536 > 0 && var14.field4546 > 0) {
                    var14.method1993();
                    var13.field24 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 534)
    public static void method365(int arg0) {
        field957 = (byte[][][]) null;
        field958 = null;
        field948 = null;
        field953 = null;
        field952 = null;
        field954 = (int[][][]) null;
        field943 = null;
        if (arg0 < 64) {
            method365(33);
        }
    }
}
