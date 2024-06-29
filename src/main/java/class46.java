import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class46 extends class195 {

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    private int field667 = -1;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field666 = 0;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
    public static int field674 = 0;

    @OriginalMember(owner = "client!dd", name = "jb", descriptor = "[I")
    public static int[] field681 = new int[100];

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "Z")
    public static boolean field679 = false;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!dd", name = "ib", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!dd", name = "kb", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!dd", name = "lb", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "Lwi;")
    public static class23 field668;

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "[I")
    public int[] field677;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "[S")
    public static short[] field673;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)Z", line = 4)
    public final boolean method348(int arg0) {
        field678++;
        if (this.field677 != null) {
            return true;
        }
        if (arg0 != 14048) {
            field666 = 82;
        }
        if (this.field667 < 0) {
            return false;
        }
        class43 var2 = class9.method95(-51, class273.field4478, this.field667);
        var2.method331();
        this.field677 = var2.field652;
        this.field669 = var2.field1347;
        this.field672 = var2.field1345;
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(Z)V", line = 31)
    public static void method349(boolean arg0) {
        field681 = null;
        if (!arg0) {
            field668 = null;
            field673 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 50)
    public final void method350(int arg0) {
        field676++;
        super.method350(42);
        if (arg0 <= 11) {
            field681 = (int[]) null;
        }
        this.field677 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)I", line = 66)
    public final int method351(byte arg0) {
        field675++;
        if (arg0 <= 22) {
            field674 = 81;
        }
        return this.field667;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)[[I", line = 80)
    public int[][] method9(byte arg0, int arg1) {
        if (arg0 != 3) {
            return (int[][]) ((int[][]) null);
        }
        field670++;
        int[][] var3 = this.field3126.method603(arg1, -124);
        if (this.field3126.field1372 && this.method348(14048)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = this.field669 * (class227.field3621 == this.field672 ? arg1 : this.field672 * arg1 / class227.field3621);
            if (class157.field2504 == this.field669) {
                for (int var8 = 0; var8 < class157.field2504; var8++) {
                    int var9 = this.field677[var7++];
                    var6[var8] = class19.method151(255, var9) << 4;
                    var4[var8] = class19.method151(var9, 65280) >> 4;
                    var5[var8] = class19.method151(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class157.field2504; var10++) {
                    int var11 = this.field669 * var10 / class157.field2504;
                    int var12 = this.field677[var7 + var11];
                    var6[var10] = class19.method151(var12, 255) << 4;
                    var4[var10] = class19.method151(var12, 65280) >> 4;
                    var5[var10] = class19.method151(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 146)
    public class46() {
        super(0, false);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B[[B[[B[[BI[[F[Ltg;[[F[[II[[F[[B)V", line = 152)
    public static final void method352(byte arg0, byte[][] arg1, byte[][] arg2, byte[][] arg3, int arg4, float[][] arg5, class243[] arg6, float[][] arg7, int[][] arg8, int arg9, float[][] arg10, byte[][] arg11) {
        field671++;
        if (arg0 != -81) {
            field666 = 31;
        }
        for (int var12 = 0; var12 < arg9; var12++) {
            class243 var13 = arg6[var12];
            if (var13.field3928 == arg4) {
                class159 var14 = new class159();
                int var15 = (var13.field3929 >> 7) - var13.field3923;
                int var16 = 0;
                int var17 = (var13.field3906 >> 7) - var13.field3923;
                int var18 = (var13.field3906 >> 7) + var13.field3923;
                if (var18 > 103) {
                    var18 = 103;
                }
                if (var17 < 0) {
                    var16 -= var17;
                    var17 = 0;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field3902[var16];
                    int var21 = (var20 >> 8) + var15;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg11[var23][var19] & 0xFF;
                        int var25 = arg2[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class296 var31 = class158.method1009((byte) -67, var25 - 1);
                            if (var31.field4923 == -1) {
                                continue;
                            }
                            if (arg1[var23][var19] != 0) {
                                int[] var32 = class55.field869[arg1[var23][var19]];
                                var14.field2530 += ((var32.length >> 1) - 2) * 3;
                                var14.field2526 += var32.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class296 var27 = class158.method1009((byte) -104, var25 - 1);
                            if (var27.field4923 == -1) {
                                byte var29 = arg1[var23][var19];
                                if (var29 != 0) {
                                    int[] var30 = class212.field3378[var29];
                                    var14.field2530 += (var30.length >> 1) * 3 - 6;
                                    var14.field2526 += var30.length >> 1;
                                }
                                continue;
                            }
                            byte var28 = arg1[var23][var19];
                            if (var28 != 0) {
                                var26 = true;
                            }
                        }
                        class196 var33 = class221.method1399(arg4, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field3130 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int var38 = (int) (var33.field3130 >> 20) & 0x3;
                                int[] var39 = null;
                                if ((var38 & 0x1) == 0) {
                                    boolean var48 = var21 <= var23 - 1;
                                    if (!var48 && var18 >= var19 + 1) {
                                        short var49 = var13.field3902[var16 + 1];
                                        int var50 = (var49 >> 8) + var15;
                                        int var51 = (var49 & 0xFF) + var50;
                                        var48 = var23 > var50 && var51 > var23;
                                    }
                                    boolean var52 = var22 >= (var23 + 1);
                                    if (!var52 && var17 <= var19 - 1) {
                                        short var53 = var13.field3902[var16 - 1];
                                        int var54 = (var53 >> 8) + var15;
                                        int var55 = var54 + (var53 & 0xFF);
                                        var52 = var54 < var23 && var55 > var23;
                                    }
                                    if (var48 && var52) {
                                        var39 = class55.field869[0];
                                    } else if (var48) {
                                        var39 = class55.field869[1];
                                    } else if (var52) {
                                        var39 = class55.field869[1];
                                    }
                                } else {
                                    boolean var40 = (var23 - 1) >= var21;
                                    if (!var40 && var19 - 1 >= var17) {
                                        short var41 = var13.field3902[var16 - 1];
                                        int var42 = var15 + (var41 >> 8);
                                        int var43 = var42 + (var41 & 0xFF);
                                        var40 = var42 < var23 && var23 < var43;
                                    }
                                    boolean var44 = var22 >= (var23 + 1);
                                    if (!var44 && var18 >= var19 + 1) {
                                        short var45 = var13.field3902[var16 + 1];
                                        int var46 = (var45 >> 8) + var15;
                                        int var47 = (var45 & 0xFF) + var46;
                                        var44 = var46 < var23 && var47 > var23;
                                    }
                                    if (var40 && var44) {
                                        var39 = class55.field869[0];
                                    } else if (var40) {
                                        var39 = class55.field869[1];
                                    } else if (var44) {
                                        var39 = class55.field869[1];
                                    }
                                }
                                if (var39 != null) {
                                    var14.field2530 += (var39.length >> 1) * 3 - 6;
                                    var14.field2526 += var39.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var36 = class55.field869[arg1[var23][var19]];
                            int[] var37 = class212.field3378[arg1[var23][var19]];
                            var14.field2530 += (var36.length >> 1) * 3 - 6;
                            var14.field2530 += (var37.length >> 1) * 3 - 6;
                            var14.field2526 += var36.length >> 1;
                            var14.field2526 += var37.length >> 1;
                        } else {
                            int[] var35 = class55.field869[0];
                            var14.field2530 += (var35.length >> 1) * 3 - 6;
                            var14.field2526 += var35.length >> 1;
                        }
                    }
                    var16++;
                }
                var14.method1017();
                int var56 = 0;
                if (((var13.field3906 >> 7) - var13.field3923) < 0) {
                    var56 -= (var13.field3906 >> 7) - var13.field3923;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field3902[var56];
                    int var59 = var15 + (var58 >> 8);
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        int var62 = arg11[var61][var57] & 0xFF;
                        boolean var63 = false;
                        int var64 = arg2[var61][var57] & 0xFF;
                        if (var62 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class296 var67 = class158.method1009((byte) -41, var64 - 1);
                            if (var67.field4923 == -1) {
                                continue;
                            }
                            if (arg1[var61][var57] != 0) {
                                class131.method869(var61, arg10, var14, arg7, class55.field869[arg1[var61][var57]], false, arg8, arg3[var61][var57], var57, arg5, var13);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class296 var65 = class158.method1009((byte) -117, var64 - 1);
                            if (var65.field4923 == -1) {
                                class131.method869(var61, arg10, var14, arg7, class212.field3378[arg1[var61][var57]], false, arg8, arg3[var61][var57], var57, arg5, var13);
                                continue;
                            }
                            byte var66 = arg1[var61][var57];
                            if (var66 != 0) {
                                var63 = true;
                            }
                        }
                        byte var68 = arg3[var61][var57];
                        class196 var69 = class221.method1399(arg4, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field3130 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field3130 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var73 = var59 <= var61 - 1;
                                    boolean var74 = var60 >= var61 + 1;
                                    if (!var73 && (var57 + 1) <= var18) {
                                        short var75 = var13.field3902[var56 + 1];
                                        int var76 = (var75 >> 8) + var15;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var73 = var76 < var61 && var77 > var61;
                                    }
                                    if (!var74 && (var57 - 1) >= var17) {
                                        short var78 = var13.field3902[var56 - 1];
                                        int var79 = (var78 >> 8) + var15;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var74 = var61 > var79 && var61 < var80;
                                    }
                                    if (var73 && var74) {
                                        var71 = class55.field869[0];
                                    } else if (var73) {
                                        var68 = 1;
                                        var71 = class55.field869[1];
                                    } else if (var74) {
                                        var68 = 3;
                                        var71 = class55.field869[1];
                                    }
                                } else {
                                    boolean var81 = (var61 - 1) >= var59;
                                    if (!var81 && var17 <= (var57 - 1)) {
                                        short var82 = var13.field3902[var56 - 1];
                                        int var83 = var15 + (var82 >> 8);
                                        int var84 = (var82 & 0xFF) + var83;
                                        var81 = var61 > var83 && var84 > var61;
                                    }
                                    boolean var85 = var61 + 1 <= var60;
                                    if (!var85 && var18 >= var57 + 1) {
                                        short var86 = var13.field3902[var56 + 1];
                                        int var87 = (var86 >> 8) + var15;
                                        int var88 = var87 + (var86 & 0xFF);
                                        var85 = var87 < var61 && var88 > var61;
                                    }
                                    if (var81 && var85) {
                                        var71 = class55.field869[0];
                                    } else if (var81) {
                                        var68 = 0;
                                        var71 = class55.field869[1];
                                    } else if (var85) {
                                        var71 = class55.field869[1];
                                        var68 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class131.method869(var61, arg10, var14, arg7, var71, false, arg8, var68, var57, arg5, var13);
                                }
                                continue;
                            }
                        }
                        if (var63) {
                            class131.method869(var61, arg10, var14, arg7, class212.field3378[arg1[var61][var57]], false, arg8, arg3[var61][var57], var57, arg5, var13);
                            class131.method869(var61, arg10, var14, arg7, class55.field869[arg1[var61][var57]], false, arg8, arg3[var61][var57], var57, arg5, var13);
                        } else {
                            class131.method869(var61, arg10, var14, arg7, class55.field869[0], false, arg8, var68, var57, arg5, var13);
                        }
                    }
                    var56++;
                }
                if (var14.field2539 > 0 && var14.field2525 > 0) {
                    var14.method1019();
                    var13.field3925 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lfj;II)V", line = 685)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field682++;
        if (arg1 > -117) {
            field668 = (class23) null;
        }
        if (arg2 == 0) {
            this.field667 = arg0.method63((byte) 1);
        }
    }
}
