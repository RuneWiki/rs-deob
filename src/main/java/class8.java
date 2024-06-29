import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class8 extends class266 {

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "Z")
    public static boolean field114 = true;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "[[Z")
    public static boolean[][] field116 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "Lma;")
    public class5 field132;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "Z")
    public static boolean field124;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "[I")
    public int[] field119;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "[I")
    public int[] field125;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "[I")
    public int[] field126;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "[I")
    public int[] field131;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)I", line = 4)
    public static final int method89(int arg0, int arg1) {
        field115++;
        if (arg0 < 54) {
            field114 = false;
        }
        return arg1 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILii;B)V", line = 15)
    private final void method90(int arg0, class221 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field132 = arg1.method1501((byte) -56);
        } else if (arg0 == 2) {
            int var4 = arg1.method1509(true);
            this.field131 = new int[var4];
            this.field119 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field119[var5] = arg1.method1524((byte) 40);
                int var6 = arg1.method1509(true);
                if (var6 == 0) {
                    this.field131[var5] = -1;
                } else {
                    this.field131[var5] = var6;
                }
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method1509(true);
            this.field126 = new int[var7];
            this.field125 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field125[var8] = arg1.method1524((byte) 59);
                int var9 = arg1.method1509(true);
                if (var9 == 0) {
                    this.field126[var8] = -1;
                } else {
                    this.field126[var8] = var9;
                }
            }
        } else if (arg0 == 4) {
        }
        if (arg2 >= -99) {
            method94(-22);
        }
        field121++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)I", line = 86)
    public final int method91(int arg0, boolean arg1) {
        field117++;
        if (this.field125 == null) {
            return -1;
        }
        int var3 = 0;
        if (!arg1) {
            field124 = false;
        }
        while (var3 < this.field125.length) {
            if (this.field126[var3] == arg0) {
                return this.field125[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)V", line = 114)
    public static final void method92(int arg0, int arg1, int arg2) {
        field130++;
        if (class186.method1226(arg1, arg0)) {
            class171.method1132(class256.field4376[arg1], arg2, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V", line = 148)
    public final void method93(byte arg0) {
        if (arg0 != -50) {
            return;
        }
        if (this.field125 != null) {
            for (int var2 = 0; var2 < this.field125.length; var2++) {
                this.field125[var2] = class264.method1820(this.field125[var2], 32768);
            }
        }
        field118++;
        if (this.field119 != null) {
            for (int var3 = 0; var3 < this.field119.length; var3++) {
                this.field119[var3] = class264.method1820(this.field119[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V", line = 181)
    public static void method94(int arg0) {
        field116 = (boolean[][]) null;
        if (arg0 != 872168008) {
            method89(-7, -1);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lii;B)V", line = 192)
    public final void method95(class221 arg0, byte arg1) {
        if (arg1 > -69) {
            method94(-111);
        }
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                field120++;
                return;
            }
            this.method90(var3, arg0, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)I", line = 222)
    public final int method96(int arg0, byte arg1) {
        field122++;
        if (this.field119 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field119.length; var3++) {
            if (this.field131[var3] == arg0) {
                return this.field119[var3];
            }
        }
        if (arg1 <= 52) {
            method94(-81);
        }
        return -1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([[B[[F[[B[[B[[B[[II[[FI[Lke;[[FI)V", line = 245)
    public static final void method97(byte[][] arg0, float[][] arg1, byte[][] arg2, byte[][] arg3, byte[][] arg4, int[][] arg5, int arg6, float[][] arg7, int arg8, class239[] arg9, float[][] arg10, int arg11) {
        field123++;
        int var12 = 0;
        if (arg6 != -1) {
            field114 = true;
        }
        while (arg11 > var12) {
            class239 var13 = arg9[var12];
            if (var13.field3961 == arg8) {
                class22 var14 = new class22();
                int var15 = 0;
                int var16 = (var13.field3944 >> 7) - var13.field3946;
                int var17 = (var13.field3958 >> 7) + var13.field3946;
                int var18 = (var13.field3958 >> 7) - var13.field3946;
                if (var18 < 0) {
                    var15 -= var18;
                    var18 = 0;
                }
                if (var17 > 103) {
                    var17 = 103;
                }
                int var19 = var18;
                while (true) {
                    if (var19 > var17) {
                        var14.method177();
                        int var56 = 0;
                        if ((var13.field3958 >> 7) - var13.field3946 < 0) {
                            var56 -= (var13.field3958 >> 7) - var13.field3946;
                        }
                        for (int var57 = var18; var57 <= var17; var57++) {
                            short var58 = var13.field3952[var56];
                            int var59 = (var58 >> 8) + var16;
                            int var60 = (var58 & 0xFF) + var59 - 1;
                            if (var60 > 103) {
                                var60 = 103;
                            }
                            if (var59 < 0) {
                                var59 = 0;
                            }
                            for (int var61 = var59; var61 <= var60; var61++) {
                                byte var62 = arg3[var61][var57];
                                int var63 = arg0[var61][var57] & 0xFF;
                                int var64 = arg4[var61][var57] & 0xFF;
                                boolean var65 = false;
                                if (var63 == 0) {
                                    if (var64 == 0) {
                                        continue;
                                    }
                                    class16 var68 = class236.method1672(var64 - 1, 29813);
                                    if (var68.field295 == -1) {
                                        continue;
                                    }
                                    if (arg2[var61][var57] != 0) {
                                        class174.method1143(arg7, var13, arg5, -89, var57, var14, var61, client.field1759[arg2[var61][var57]], arg10, arg1, arg3[var61][var57]);
                                        continue;
                                    }
                                } else if (var64 == 0) {
                                    var62 = 0;
                                } else {
                                    class16 var66 = class236.method1672(var64 - 1, 29813);
                                    if (var66.field295 == -1) {
                                        class174.method1143(arg7, var13, arg5, -124, var57, var14, var61, class213.field3389[arg2[var61][var57]], arg10, arg1, arg3[var61][var57]);
                                        continue;
                                    }
                                    byte var67 = arg2[var61][var57];
                                    if (var67 != 0) {
                                        var65 = true;
                                    }
                                }
                                class107 var69 = class284.method1921(arg8, var61, var57);
                                if (var69 != null) {
                                    int var70 = (int) (var69.field1590 >> 14) & 0x3F;
                                    if (var70 == 9) {
                                        int[] var71 = null;
                                        int var72 = (int) (var69.field1590 >> 20) & 0x3;
                                        if ((var72 & 0x1) == 0) {
                                            boolean var73 = var61 - 1 >= var59;
                                            boolean var74 = var60 >= (var61 + 1);
                                            if (!var73 && var57 + 1 <= var17) {
                                                short var75 = var13.field3952[var56 + 1];
                                                int var76 = (var75 >> 8) + var16;
                                                int var77 = (var75 & 0xFF) + var76;
                                                var73 = var61 > var76 && var77 > var61;
                                            }
                                            if (!var74 && var57 - 1 >= var18) {
                                                short var78 = var13.field3952[var56 - 1];
                                                int var79 = var16 + (var78 >> 8);
                                                int var80 = var79 + (var78 & 0xFF);
                                                var74 = var79 < var61 && var61 < var80;
                                            }
                                            if (var73 && var74) {
                                                var71 = client.field1759[0];
                                            } else if (var73) {
                                                var62 = 1;
                                                var71 = client.field1759[1];
                                            } else if (var74) {
                                                var62 = 3;
                                                var71 = client.field1759[1];
                                            }
                                        } else {
                                            boolean var81 = var60 >= (var61 + 1);
                                            boolean var82 = var61 - 1 >= var59;
                                            if (!var82 && var18 <= (var57 - 1)) {
                                                short var83 = var13.field3952[var56 - 1];
                                                int var84 = var16 + (var83 >> 8);
                                                int var85 = var84 + (var83 & 0xFF);
                                                var82 = var61 > var84 && var61 < var85;
                                            }
                                            if (!var81 && (var57 + 1) <= var17) {
                                                short var86 = var13.field3952[var56 + 1];
                                                int var87 = (var86 >> 8) + var16;
                                                int var88 = var87 + (var86 & 0xFF);
                                                var81 = var87 < var61 && var61 < var88;
                                            }
                                            if (var82 && var81) {
                                                var71 = client.field1759[0];
                                            } else if (var82) {
                                                var71 = client.field1759[1];
                                                var62 = 0;
                                            } else if (var81) {
                                                var71 = client.field1759[1];
                                                var62 = 2;
                                            }
                                        }
                                        if (var71 != null) {
                                            class174.method1143(arg7, var13, arg5, arg6 - 2, var57, var14, var61, var71, arg10, arg1, var62);
                                        }
                                        continue;
                                    }
                                }
                                if (var65) {
                                    class174.method1143(arg7, var13, arg5, -30, var57, var14, var61, class213.field3389[arg2[var61][var57]], arg10, arg1, arg3[var61][var57]);
                                    class174.method1143(arg7, var13, arg5, -55, var57, var14, var61, client.field1759[arg2[var61][var57]], arg10, arg1, arg3[var61][var57]);
                                } else {
                                    class174.method1143(arg7, var13, arg5, -20, var57, var14, var61, client.field1759[0], arg10, arg1, var62);
                                }
                            }
                            var56++;
                        }
                        if (var14.field383 > 0 && var14.field381 > 0) {
                            var14.method181();
                            var13.field3957 = var14;
                        }
                        break;
                    }
                    short var20 = var13.field3952[var15];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg0[var23][var19] & 0xFF;
                        boolean var25 = false;
                        int var26 = arg4[var23][var19] & 0xFF;
                        if (var24 == 0) {
                            if (var26 == 0) {
                                continue;
                            }
                            class16 var31 = class236.method1672(var26 - 1, 29813);
                            if (var31.field295 == -1) {
                                continue;
                            }
                            if (arg2[var23][var19] != 0) {
                                int[] var32 = client.field1759[arg2[var23][var19]];
                                var14.field380 += (var32.length >> 1) * 3 - 6;
                                var14.field387 += var32.length >> 1;
                                continue;
                            }
                        } else if (var26 != 0) {
                            class16 var27 = class236.method1672(var26 - 1, 29813);
                            if (var27.field295 == -1) {
                                byte var28 = arg2[var23][var19];
                                if (var28 != 0) {
                                    int[] var29 = class213.field3389[var28];
                                    var14.field380 += ((var29.length >> 1) - 2) * 3;
                                    var14.field387 += var29.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg2[var23][var19];
                            if (var30 != 0) {
                                var25 = true;
                            }
                        }
                        class107 var33 = class284.method1921(arg8, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field1590 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field1590 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var45 = var21 <= var23 - 1;
                                    boolean var46 = var22 >= var23 + 1;
                                    if (!var45 && var17 >= var19 + 1) {
                                        short var47 = var13.field3952[var15 + 1];
                                        int var48 = (var47 >> 8) + var16;
                                        int var49 = (var47 & 0xFF) + var48;
                                        var45 = var48 < var23 && var49 > var23;
                                    }
                                    if (!var46 && (var19 - 1) >= var18) {
                                        short var50 = var13.field3952[var15 - 1];
                                        int var51 = (var50 >> 8) + var16;
                                        int var52 = var51 + (var50 & 0xFF);
                                        var46 = var51 < var23 && var23 < var52;
                                    }
                                    if (var45 && var46) {
                                        var35 = client.field1759[0];
                                    } else if (var45) {
                                        var35 = client.field1759[1];
                                    } else if (var46) {
                                        var35 = client.field1759[1];
                                    }
                                } else {
                                    boolean var37 = (var23 - 1) >= var21;
                                    if (!var37 && var18 <= var19 - 1) {
                                        short var38 = var13.field3952[var15 - 1];
                                        int var39 = (var38 >> 8) + var16;
                                        int var40 = (var38 & 0xFF) + var39;
                                        var37 = var23 > var39 && var40 > var23;
                                    }
                                    boolean var41 = var22 >= (var23 + 1);
                                    if (!var41 && (var19 + 1) <= var17) {
                                        short var42 = var13.field3952[var15 + 1];
                                        int var43 = (var42 >> 8) + var16;
                                        int var44 = (var42 & 0xFF) + var43;
                                        var41 = var43 < var23 && var23 < var44;
                                    }
                                    if (var37 && var41) {
                                        var35 = client.field1759[0];
                                    } else if (var37) {
                                        var35 = client.field1759[1];
                                    } else if (var41) {
                                        var35 = client.field1759[1];
                                    }
                                }
                                if (var35 != null) {
                                    var14.field380 += ((var35.length >> 1) - 2) * 3;
                                    var14.field387 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var25) {
                            int[] var53 = class213.field3389[arg2[var23][var19]];
                            int[] var54 = client.field1759[arg2[var23][var19]];
                            var14.field380 += ((var54.length >> 1) - 2) * 3;
                            var14.field380 += ((var53.length >> 1) - 2) * 3;
                            var14.field387 += var54.length >> 1;
                            var14.field387 += var53.length >> 1;
                        } else {
                            int[] var55 = client.field1759[0];
                            var14.field380 += (var55.length >> 1) * 3 - 6;
                            var14.field387 += var55.length >> 1;
                        }
                    }
                    var15++;
                    var19++;
                }
            }
            var12++;
        }
    }
}
