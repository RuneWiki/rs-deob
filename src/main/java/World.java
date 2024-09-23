import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "a", descriptor = "Z")
    private boolean field32 = false;

    @OriginalMember(owner = "c", name = "h", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "c", name = "i", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "c", name = "j", descriptor = "[[[I")
    private int[][][] field41;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[B")
    private byte[][][] field42;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field43;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field44;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field45;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field46;

    @OriginalMember(owner = "c", name = "w", descriptor = "[[[I")
    private int[][][] field54;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[[B")
    private byte[][][] field47;

    @OriginalMember(owner = "c", name = "q", descriptor = "[[I")
    private int[][] field48;

    @OriginalMember(owner = "c", name = "r", descriptor = "[I")
    private int[] field49;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field50;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field51;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field52;

    @OriginalMember(owner = "c", name = "v", descriptor = "[I")
    private int[] field53;

    @OriginalMember(owner = "c", name = "c", descriptor = "I")
    private static int field34 = -315;

    @OriginalMember(owner = "c", name = "d", descriptor = "I")
    private static int field35 = 626;

    @OriginalMember(owner = "c", name = "e", descriptor = "Z")
    public static boolean field36 = true;

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private static final int[] field55 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field56 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field57 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "A", descriptor = "[I")
    private static final int[] field58 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "b", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "c", name = "f", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "c", name = "g", descriptor = "Z")
    public static boolean field38;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "([[[B[[[IIII)V")
    public World(byte[][][] arg0, int[][][] arg1, int arg2, int arg3, int arg4) {
        this.field39 = arg2;
        this.field40 = arg3;
        this.field41 = arg1;
        this.field42 = arg0;
        int var6 = 9 / arg4;
        this.field43 = new byte[4][this.field39][this.field40];
        this.field44 = new byte[4][this.field39][this.field40];
        this.field45 = new byte[4][this.field39][this.field40];
        this.field46 = new byte[4][this.field39][this.field40];
        this.field54 = new int[4][this.field39 + 1][this.field40 + 1];
        this.field47 = new byte[4][this.field39 + 1][this.field40 + 1];
        this.field48 = new int[this.field39 + 1][this.field40 + 1];
        this.field49 = new int[this.field40];
        this.field50 = new int[this.field40];
        this.field51 = new int[this.field40];
        this.field52 = new int[this.field40];
        this.field53 = new int[this.field40];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIII)V")
    public final void method14(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 9 / arg2;
        byte var7 = 0;
        for (int var8 = 0; var8 < FloType.field947; var8++) {
            if (FloType.field948[var8].field953.equalsIgnoreCase("water")) {
                var7 = (byte) (var8 + 1);
                break;
            }
        }
        for (int var9 = arg1; var9 < arg1 + arg3; var9++) {
            for (int var10 = arg0; var10 < arg0 + arg4; var10++) {
                if (var10 >= 0 && var10 < this.field39 && var9 >= 0 && var9 < this.field40) {
                    this.field44[0][var10][var9] = var7;
                    for (int var11 = 0; var11 < 4; var11++) {
                        this.field41[var11][var10][var9] = 0;
                        this.field42[var11][var10][var9] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIII[BI)V")
    public final void method15(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        if (arg1 != -16121) {
            return;
        }
        Packet var7 = new Packet(arg4, 0);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg2 + var9;
                    int var12 = arg3 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field42[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method209();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field41[0][var11][var12] = -method20(var11 + arg5 + 932731, var12 + 556238 + arg0) * 8;
                                } else {
                                    this.field41[var8][var11][var12] = this.field41[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method209();
                                if (var14 == 1) {
                                    var14 = 0;
                                }
                                if (var8 == 0) {
                                    this.field41[0][var11][var12] = -var14 * 8;
                                } else {
                                    this.field41[var8][var11][var12] = this.field41[var8 - 1][var11][var12] - var14 * 8;
                                }
                                break;
                            }
                            if (var13 <= 49) {
                                this.field44[var8][var11][var12] = var7.method210();
                                this.field45[var8][var11][var12] = (byte) ((var13 - 2) / 4);
                                this.field46[var8][var11][var12] = (byte) (var13 - 2 & 0x3);
                            } else if (var13 <= 81) {
                                this.field42[var8][var11][var12] = (byte) (var13 - 49);
                            } else {
                                this.field43[var8][var11][var12] = (byte) (var13 - 81);
                            }
                        }
                    } else {
                        while (true) {
                            int var15 = var7.method209();
                            if (var15 == 0) {
                                break;
                            }
                            if (var15 == 1) {
                                var7.method209();
                                break;
                            }
                            if (var15 <= 49) {
                                var7.method209();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;Lob;[B[Lec;BII)V")
    public final void method16(World3D arg0, LinkList arg1, byte[] arg2, CollisionMap[] arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != 5) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        Packet var9 = new Packet(arg2, 0);
        int var10 = -1;
        while (true) {
            int var11 = var9.method223();
            if (var11 == 0) {
                return;
            }
            var10 += var11;
            int var12 = 0;
            while (true) {
                int var13 = var9.method223();
                if (var13 == 0) {
                    break;
                }
                var12 += var13 - 1;
                int var14 = var12 & 0x3F;
                int var15 = var12 >> 6 & 0x3F;
                int var16 = var12 >> 12;
                int var17 = var9.method209();
                int var18 = var17 >> 2;
                int var19 = var17 & 0x3;
                int var20 = arg5 + var15;
                int var21 = arg6 + var14;
                if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                    int var22 = var16;
                    if ((this.field42[1][var20][var21] & 0x2) == 2) {
                        var22 = var16 - 1;
                    }
                    CollisionMap var23 = null;
                    if (var22 >= 0) {
                        var23 = arg3[var22];
                    }
                    this.method17(var10, var21, var19, var16, (byte) -12, var20, arg1, arg0, var18, var23);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIIBILob;Lr;ILec;)V")
    private final void method17(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, LinkList arg6, World3D arg7, int arg8, CollisionMap arg9) {
        if (field36) {
            if ((this.field42[arg3][arg5][arg1] & 0x10) != 0) {
                return;
            }
            if (this.method19(0, arg1, arg3, arg5) != field37) {
                return;
            }
        }
        int var11 = this.field41[arg3][arg5][arg1];
        int var12 = this.field41[arg3][arg5 + 1][arg1];
        int var13 = this.field41[arg3][arg5 + 1][arg1 + 1];
        int var14 = this.field41[arg3][arg5][arg1 + 1];
        if (arg4 != -12) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        int var16 = var11 + var12 + var13 + var14 >> 2;
        LocType var17 = LocType.method275(arg0);
        int var18 = (arg0 << 14) + (arg1 << 7) + arg5 + 1073741824;
        if (!var17.field828) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg2 << 6) + arg8);
        if (arg8 == 22) {
            if (!field36 || var17.field828 || var17.field849) {
                Model var20 = var17.method278(22, arg2, var11, var12, var13, var14, -1);
                arg7.method56(var16, var19, var18, arg5, 7, arg3, var20, arg1);
                if (var17.field826 && var17.field828 && arg9 != null) {
                    arg9.method298(arg1, arg5, field34);
                }
                if (var17.field832 != -1) {
                    arg6.method225(new LocEntity(true, arg0, (byte) 9, arg5, arg1, SeqType.field1043[var17.field832], arg3, 3));
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            Model var36 = var17.method278(10, arg2, var11, var12, var13, var14, -1);
            if (var36 != null) {
                int var37 = 0;
                if (arg8 == 11) {
                    var37 += 256;
                }
                int var38;
                int var39;
                if (arg2 == 1 || arg2 == 3) {
                    var38 = var17.field825;
                    var39 = var17.field824;
                } else {
                    var38 = var17.field824;
                    var39 = var17.field825;
                }
                if (arg7.method60(var38, arg5, var36, var19, 0, arg1, arg3, var16, var37, var18, null, var39) && var17.field841) {
                    for (int var40 = 0; var40 <= var38; var40++) {
                        for (int var41 = 0; var41 <= var39; var41++) {
                            int var42 = var36.field477 / 4;
                            if (var42 > 30) {
                                var42 = 30;
                            }
                            if (var42 > this.field47[arg3][arg5 + var40][arg1 + var41]) {
                                this.field47[arg3][arg5 + var40][arg1 + var41] = (byte) var42;
                            }
                        }
                    }
                }
            }
            if (var17.field826 && arg9 != null) {
                arg9.method297(var17.field827, arg5, var17.field824, arg2, 242, var17.field825, arg1);
            }
            if (var17.field832 != -1) {
                arg6.method225(new LocEntity(true, arg0, (byte) 9, arg5, arg1, SeqType.field1043[var17.field832], arg3, 2));
            }
        } else if (arg8 >= 12) {
            Model var21 = var17.method278(arg8, arg2, var11, var12, var13, var14, -1);
            arg7.method60(1, arg5, var21, var19, 0, arg1, arg3, var16, 0, var18, null, 1);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg3 > 0) {
                this.field54[arg3][arg5][arg1] |= 0x924;
            }
            if (var17.field826 && arg9 != null) {
                arg9.method297(var17.field827, arg5, var17.field824, arg2, 242, var17.field825, arg1);
            }
            if (var17.field832 != -1) {
                arg6.method225(new LocEntity(true, arg0, (byte) 9, arg5, arg1, SeqType.field1043[var17.field832], arg3, 2));
            }
        } else if (arg8 == 0) {
            Model var22 = var17.method278(0, arg2, var11, var12, var13, var14, -1);
            arg7.method58(-47972, 0, arg1, var18, field55[arg2], arg5, arg3, var19, var16, null, var22);
            if (arg2 == 0) {
                if (var17.field841) {
                    this.field47[arg3][arg5][arg1] = 50;
                    this.field47[arg3][arg5][arg1 + 1] = 50;
                }
                if (var17.field831) {
                    this.field54[arg3][arg5][arg1] |= 0x249;
                }
            } else if (arg2 == 1) {
                if (var17.field841) {
                    this.field47[arg3][arg5][arg1 + 1] = 50;
                    this.field47[arg3][arg5 + 1][arg1 + 1] = 50;
                }
                if (var17.field831) {
                    this.field54[arg3][arg5][arg1 + 1] |= 0x492;
                }
            } else if (arg2 == 2) {
                if (var17.field841) {
                    this.field47[arg3][arg5 + 1][arg1] = 50;
                    this.field47[arg3][arg5 + 1][arg1 + 1] = 50;
                }
                if (var17.field831) {
                    this.field54[arg3][arg5 + 1][arg1] |= 0x249;
                }
            } else if (arg2 == 3) {
                if (var17.field841) {
                    this.field47[arg3][arg5][arg1] = 50;
                    this.field47[arg3][arg5 + 1][arg1] = 50;
                }
                if (var17.field831) {
                    this.field54[arg3][arg5][arg1] |= 0x492;
                }
            }
            if (var17.field826 && arg9 != null) {
                arg9.method296(var17.field827, arg2, arg1, false, arg5, arg8);
            }
            if (var17.field832 != -1) {
                arg6.method225(new LocEntity(true, arg0, (byte) 9, arg5, arg1, SeqType.field1043[var17.field832], arg3, 0));
            }
            if (var17.field833 != 16) {
                arg7.method67(arg3, var17.field833, arg5, -855, arg1);
            }
        } else if (arg8 == 1) {
            Model var23 = var17.method278(1, arg2, var11, var12, var13, var14, -1);
            arg7.method58(-47972, 0, arg1, var18, field56[arg2], arg5, arg3, var19, var16, null, var23);
            if (var17.field841) {
                if (arg2 == 0) {
                    this.field47[arg3][arg5][arg1 + 1] = 50;
                } else if (arg2 == 1) {
                    this.field47[arg3][arg5 + 1][arg1 + 1] = 50;
                } else if (arg2 == 2) {
                    this.field47[arg3][arg5 + 1][arg1] = 50;
                } else if (arg2 == 3) {
                    this.field47[arg3][arg5][arg1] = 50;
                }
            }
            if (var17.field826 && arg9 != null) {
                arg9.method296(var17.field827, arg2, arg1, false, arg5, arg8);
            }
            if (var17.field832 != -1) {
                arg6.method225(new LocEntity(true, arg0, (byte) 9, arg5, arg1, SeqType.field1043[var17.field832], arg3, 0));
            }
        } else if (arg8 == 2) {
            int var24 = arg2 + 1 & 0x3;
            Model var25 = var17.method278(2, arg2 + 4, var11, var12, var13, var14, -1);
            Model var26 = var17.method278(2, var24, var11, var12, var13, var14, -1);
            arg7.method58(-47972, field55[var24], arg1, var18, field55[arg2], arg5, arg3, var19, var16, var26, var25);
            if (var17.field831) {
                if (arg2 == 0) {
                    this.field54[arg3][arg5][arg1] |= 0x249;
                    this.field54[arg3][arg5][arg1 + 1] |= 0x492;
                } else if (arg2 == 1) {
                    this.field54[arg3][arg5][arg1 + 1] |= 0x492;
                    this.field54[arg3][arg5 + 1][arg1] |= 0x249;
                } else if (arg2 == 2) {
                    this.field54[arg3][arg5 + 1][arg1] |= 0x249;
                    this.field54[arg3][arg5][arg1] |= 0x492;
                } else if (arg2 == 3) {
                    this.field54[arg3][arg5][arg1] |= 0x492;
                    this.field54[arg3][arg5][arg1] |= 0x249;
                }
            }
            if (var17.field826 && arg9 != null) {
                arg9.method296(var17.field827, arg2, arg1, false, arg5, arg8);
            }
            if (var17.field832 != -1) {
                arg6.method225(new LocEntity(true, arg0, (byte) 9, arg5, arg1, SeqType.field1043[var17.field832], arg3, 0));
            }
            if (var17.field833 != 16) {
                arg7.method67(arg3, var17.field833, arg5, -855, arg1);
            }
        } else if (arg8 == 3) {
            Model var27 = var17.method278(3, arg2, var11, var12, var13, var14, -1);
            arg7.method58(-47972, 0, arg1, var18, field56[arg2], arg5, arg3, var19, var16, null, var27);
            if (var17.field841) {
                if (arg2 == 0) {
                    this.field47[arg3][arg5][arg1 + 1] = 50;
                } else if (arg2 == 1) {
                    this.field47[arg3][arg5 + 1][arg1 + 1] = 50;
                } else if (arg2 == 2) {
                    this.field47[arg3][arg5 + 1][arg1] = 50;
                } else if (arg2 == 3) {
                    this.field47[arg3][arg5][arg1] = 50;
                }
            }
            if (var17.field826 && arg9 != null) {
                arg9.method296(var17.field827, arg2, arg1, false, arg5, arg8);
            }
            if (var17.field832 != -1) {
                arg6.method225(new LocEntity(true, arg0, (byte) 9, arg5, arg1, SeqType.field1043[var17.field832], arg3, 0));
            }
        } else if (arg8 == 9) {
            Model var28 = var17.method278(arg8, arg2, var11, var12, var13, var14, -1);
            arg7.method60(1, arg5, var28, var19, 0, arg1, arg3, var16, 0, var18, null, 1);
            if (var17.field826 && arg9 != null) {
                arg9.method297(var17.field827, arg5, var17.field824, arg2, 242, var17.field825, arg1);
            }
            if (var17.field832 != -1) {
                arg6.method225(new LocEntity(true, arg0, (byte) 9, arg5, arg1, SeqType.field1043[var17.field832], arg3, 2));
            }
        } else if (arg8 == 4) {
            Model var29 = var17.method278(4, 0, var11, var12, var13, var14, -1);
            arg7.method59(arg1, var16, var19, arg5, field55[arg2], arg3, true, var29, 0, var18, arg2 * 512, 0);
            if (var17.field832 != -1) {
                arg6.method225(new LocEntity(true, arg0, (byte) 9, arg5, arg1, SeqType.field1043[var17.field832], arg3, 1));
            }
        } else if (arg8 == 5) {
            int var30 = 16;
            int var31 = arg7.method77(arg3, arg5, arg1);
            if (var31 > 0) {
                var30 = LocType.method275(var31 >> 14 & 0x7FFF).field833;
            }
            Model var32 = var17.method278(4, 0, var11, var12, var13, var14, -1);
            arg7.method59(arg1, var16, var19, arg5, field55[arg2], arg3, true, var32, field57[arg2] * var30, var18, arg2 * 512, field58[arg2] * var30);
            if (var17.field832 != -1) {
                arg6.method225(new LocEntity(true, arg0, (byte) 9, arg5, arg1, SeqType.field1043[var17.field832], arg3, 1));
            }
        } else if (arg8 == 6) {
            Model var33 = var17.method278(4, 0, var11, var12, var13, var14, -1);
            arg7.method59(arg1, var16, var19, arg5, 256, arg3, true, var33, 0, var18, arg2, 0);
            if (var17.field832 != -1) {
                arg6.method225(new LocEntity(true, arg0, (byte) 9, arg5, arg1, SeqType.field1043[var17.field832], arg3, 1));
            }
        } else if (arg8 == 7) {
            Model var34 = var17.method278(4, 0, var11, var12, var13, var14, -1);
            arg7.method59(arg1, var16, var19, arg5, 512, arg3, true, var34, 0, var18, arg2, 0);
            if (var17.field832 != -1) {
                arg6.method225(new LocEntity(true, arg0, (byte) 9, arg5, arg1, SeqType.field1043[var17.field832], arg3, 1));
            }
        } else if (arg8 == 8) {
            Model var35 = var17.method278(4, 0, var11, var12, var13, var14, -1);
            arg7.method59(arg1, var16, var19, arg5, 768, arg3, true, var35, 0, var18, arg2, 0);
            if (var17.field832 != -1) {
                arg6.method225(new LocEntity(true, arg0, (byte) 9, arg5, arg1, SeqType.field1043[var17.field832], arg3, 1));
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;I[Lec;)V")
    public final void method18(World3D arg0, int arg1, CollisionMap[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var104 = 0; var104 < 104; var104++) {
                for (int var105 = 0; var105 < 104; var105++) {
                    if ((this.field42[var4][var104][var105] & 0x1) == 1) {
                        int var106 = var4;
                        if ((this.field42[1][var104][var105] & 0x2) == 2) {
                            var106 = var4 - 1;
                        }
                        if (var106 >= 0) {
                            arg2[var106].method298(var105, var104, field34);
                        }
                    }
                }
            }
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field47[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field40 - 1; var56++) {
                for (int var95 = 1; var95 < this.field39 - 1; var95++) {
                    int var96 = this.field41[var5][var95 + 1][var56] - this.field41[var5][var95 - 1][var56];
                    int var97 = this.field41[var5][var95][var56 + 1] - this.field41[var5][var95][var56 - 1];
                    int var98 = (int) Math.sqrt((double) (var97 * var97 + var96 * var96 + 65536));
                    int var99 = (var96 << 8) / var98;
                    int var100 = 65536 / var98;
                    int var101 = (var97 << 8) / var98;
                    int var102 = (var53 * var101 + var51 * var99 + var52 * var100) / var55 + var49;
                    int var103 = (var48[var95][var56] >> 1) + (var48[var95][var56 + 1] >> 3) + (var48[var95][var56 - 1] >> 2) + (var48[var95 - 1][var56] >> 2) + (var48[var95 + 1][var56] >> 3);
                    this.field48[var95][var56] = var102 - var103;
                }
            }
            for (int var57 = 0; var57 < this.field40; var57++) {
                this.field49[var57] = 0;
                this.field50[var57] = 0;
                this.field51[var57] = 0;
                this.field52[var57] = 0;
                this.field53[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field39 + 5; var58++) {
                for (int var61 = 0; var61 < this.field40; var61++) {
                    int var89 = var58 + 5;
                    int var10002;
                    if (var89 >= 0 && var89 < this.field39) {
                        int var90 = this.field43[var5][var89][var61] & 0xFF;
                        if (var90 > 0) {
                            FloType var91 = FloType.field948[var90 - 1];
                            this.field49[var61] += var91.field957;
                            this.field50[var61] += var91.field955;
                            this.field51[var61] += var91.field956;
                            this.field52[var61] += var91.field958;
                            var10002 = this.field53[var61]++;
                        }
                    }
                    int var92 = var58 - 5;
                    if (var92 >= 0 && var92 < this.field39) {
                        int var93 = this.field43[var5][var92][var61] & 0xFF;
                        if (var93 > 0) {
                            FloType var94 = FloType.field948[var93 - 1];
                            this.field49[var61] -= var94.field957;
                            this.field50[var61] -= var94.field955;
                            this.field51[var61] -= var94.field956;
                            this.field52[var61] -= var94.field958;
                            var10002 = this.field53[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field39 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field40 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field40) {
                            var62 += this.field49[var68];
                            var63 += this.field50[var68];
                            var64 += this.field51[var68];
                            var65 += this.field52[var68];
                            var66 += this.field53[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field40) {
                            var62 -= this.field49[var69];
                            var63 -= this.field50[var69];
                            var64 -= this.field51[var69];
                            var65 -= this.field52[var69];
                            var66 -= this.field53[var69];
                        }
                        if (var67 >= 1 && var67 < this.field40 - 1 && (!field36 || (this.field42[var5][var58][var67] & 0x10) == 0 && this.method19(0, var67, var5, var58) == field37)) {
                            int var70 = this.field43[var5][var58][var67] & 0xFF;
                            int var71 = this.field44[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field41[var5][var58][var67];
                                int var73 = this.field41[var5][var58 + 1][var67];
                                int var74 = this.field41[var5][var58 + 1][var67 + 1];
                                int var75 = this.field41[var5][var58][var67 + 1];
                                int var76 = this.field48[var58][var67];
                                int var77 = this.field48[var58 + 1][var67];
                                int var78 = this.field48[var58 + 1][var67 + 1];
                                int var79 = this.field48[var58][var67 + 1];
                                int var80 = -1;
                                if (var70 > 0) {
                                    var80 = this.method27(var62 * 256 / var65, var63 / var66, var64 / var66);
                                }
                                if (var5 > 0) {
                                    boolean var81 = true;
                                    if (var70 == 0 && this.field45[var5][var58][var67] != 0) {
                                        var81 = false;
                                    }
                                    if (var71 > 0 && !FloType.field948[var71 - 1].field952) {
                                        var81 = false;
                                    }
                                    if (var81 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field54[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var82 = 0;
                                if (var80 != -1) {
                                    var82 = Pix3D.field573[method25(var80, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method55(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method25(var80, var76), method25(var80, var77), method25(var80, var78), method25(var80, var79), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = this.field45[var5][var58][var67] + 1;
                                    byte var84 = this.field46[var5][var58][var67];
                                    FloType var85 = FloType.field948[var71 - 1];
                                    int var86 = var85.field950;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = Pix3D.method159(var86, true);
                                        var88 = -1;
                                    } else if (var85.field949 == 16711935) {
                                        var87 = 0;
                                        var88 = -2;
                                        var86 = -1;
                                    } else {
                                        var88 = this.method27(var85.field954, var85.field955, var85.field956);
                                        var87 = Pix3D.field573[this.method26(var88, 96)];
                                    }
                                    arg0.method55(var5, var58, var67, var83, var84, var86, var72, var73, var74, var75, method25(var80, var76), method25(var80, var77), method25(var80, var78), method25(var80, var79), this.method26(var88, var76), this.method26(var88, var77), this.method26(var88, var78), this.method26(var88, var79), var82, var87);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field40 - 1; var59++) {
                for (int var60 = 1; var60 < this.field39 - 1; var60++) {
                    arg0.method54(var5, var60, var59, this.method19(0, var59, var5, var60));
                }
            }
        }
        if (!field38) {
            arg0.method82(-50, 768, -50, 64, 0, -10);
        }
        for (int var6 = 0; var6 < this.field39; var6++) {
            for (int var47 = 0; var47 < this.field40; var47++) {
                if ((this.field42[1][var6][var47] & 0x2) == 2) {
                    arg0.method52(var6, this.field33, var47);
                }
            }
        }
        if (field38) {
            return;
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.field40; var12++) {
                    for (int var13 = 0; var13 <= this.field39; var13++) {
                        if ((this.field54[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field54[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field40 && (this.field54[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label316: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field54[var16 - 1][var13][var18] & var7) == 0) {
                                        break label316;
                                    }
                                }
                                var16--;
                            }
                            label305: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field54[var17 + 1][var13][var19] & var7) == 0) {
                                        break label305;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field41[var17][var13][var14] - var21;
                                int var23 = this.field41[var16][var13][var14];
                                World3D.method53(-41105, var23, var13 * 128, var14 * 128, var22, var10, var15 * 128 + 128, 1, var13 * 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field54[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field54[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field54[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field39 && (this.field54[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label369: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field54[var28 - 1][var30][var12] & var8) == 0) {
                                        break label369;
                                    }
                                }
                                var28--;
                            }
                            label358: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field54[var29 + 1][var31][var12] & var8) == 0) {
                                        break label358;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field41[var29][var26][var12] - var33;
                                int var35 = this.field41[var28][var26][var12];
                                World3D.method53(-41105, var35, var27 * 128 + 128, var12 * 128, var34, var10, var12 * 128, 2, var26 * 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field54[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field54[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field54[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field40 && (this.field54[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label422: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field54[var11][var38 - 1][var42] & var9) == 0) {
                                        break label422;
                                    }
                                }
                                var38--;
                            }
                            label411: while (var39 < this.field39) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field54[var11][var39 + 1][var43] & var9) == 0) {
                                        break label411;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field41[var11][var38][var40];
                                World3D.method53(-41105, var44, var39 * 128 + 128, var40 * 128, var44, var10, var41 * 128 + 128, 4, var38 * 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field54[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 27394) {
            this.field32 = !this.field32;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIII)I")
    public int method19(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            field34 = 290;
        }
        if ((this.field42[arg2][arg3][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (this.field42[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II)I")
    private static final int method20(int arg0, int arg1) {
        int var2 = method21(arg0 + 45365, arg1 + 91923, 4) + (method21(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method21(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(III)I")
    private static final int method21(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method23(var3, var5);
        int var8 = method23(var3 + 1, var5);
        int var9 = method23(var3, var5 + 1);
        int var10 = method23(var3 + 1, var5 + 1);
        int var11 = method22(var7, var8, var4, arg2);
        int var12 = method22(var9, var10, var4, arg2);
        return method22(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "c", name = "b", descriptor = "(IIII)I")
    private static final int method22(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - Pix3D.field562[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "c", name = "b", descriptor = "(II)I")
    private static final int method23(int arg0, int arg1) {
        int var2 = method24(arg0 - 1, arg1 - 1) + method24(arg0 + 1, arg1 - 1) + method24(arg0 - 1, arg1 + 1) + method24(arg0 + 1, arg1 + 1);
        int var3 = method24(arg0 - 1, arg1) + method24(arg0 + 1, arg1) + method24(arg0, arg1 - 1) + method24(arg0, arg1 + 1);
        int var4 = method24(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "c", name = "c", descriptor = "(II)I")
    private static final int method24(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "c", name = "d", descriptor = "(II)I")
    private static final int method25(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "c", name = "e", descriptor = "(II)I")
    private final int method26(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "c", name = "b", descriptor = "(III)I")
    private final int method27(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lec;Lob;IILr;[[[IIIIZII)V")
    public static final void method28(CollisionMap arg0, LinkList arg1, int arg2, int arg3, World3D arg4, int[][][] arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        int var12 = arg5[arg10][arg11][arg2];
        int var13 = arg5[arg10][arg11 + 1][arg2];
        int var14 = arg5[arg10][arg11 + 1][arg2 + 1];
        int var15 = arg5[arg10][arg11][arg2 + 1];
        int var16 = var12 + var13 + var14 + var15 >> 2;
        if (arg9) {
            field35 = -379;
        }
        LocType var17 = LocType.method275(arg3);
        int var18 = (arg3 << 14) + (arg2 << 7) + arg11 + 1073741824;
        if (!var17.field828) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg8 << 6) + arg6);
        if (arg6 == 22) {
            Model var20 = var17.method278(22, arg8, var12, var13, var14, var15, -1);
            arg4.method56(var16, var19, var18, arg11, 7, arg7, var20, arg2);
            if (var17.field826 && var17.field828) {
                arg0.method298(arg2, arg11, field34);
            }
            if (var17.field832 != -1) {
                arg1.method225(new LocEntity(true, arg3, (byte) 9, arg11, arg2, SeqType.field1043[var17.field832], arg7, 3));
            }
        } else if (arg6 == 10 || arg6 == 11) {
            Model var36 = var17.method278(10, arg8, var12, var13, var14, var15, -1);
            if (var36 != null) {
                int var37 = 0;
                if (arg6 == 11) {
                    var37 += 256;
                }
                int var38;
                int var39;
                if (arg8 == 1 || arg8 == 3) {
                    var38 = var17.field825;
                    var39 = var17.field824;
                } else {
                    var38 = var17.field824;
                    var39 = var17.field825;
                }
                arg4.method60(var38, arg11, var36, var19, 0, arg2, arg7, var16, var37, var18, null, var39);
            }
            if (var17.field826) {
                arg0.method297(var17.field827, arg11, var17.field824, arg8, 242, var17.field825, arg2);
            }
            if (var17.field832 != -1) {
                arg1.method225(new LocEntity(true, arg3, (byte) 9, arg11, arg2, SeqType.field1043[var17.field832], arg7, 2));
            }
        } else if (arg6 >= 12) {
            Model var21 = var17.method278(arg6, arg8, var12, var13, var14, var15, -1);
            arg4.method60(1, arg11, var21, var19, 0, arg2, arg7, var16, 0, var18, null, 1);
            if (var17.field826) {
                arg0.method297(var17.field827, arg11, var17.field824, arg8, 242, var17.field825, arg2);
            }
            if (var17.field832 != -1) {
                arg1.method225(new LocEntity(true, arg3, (byte) 9, arg11, arg2, SeqType.field1043[var17.field832], arg7, 2));
            }
        } else if (arg6 == 0) {
            Model var22 = var17.method278(0, arg8, var12, var13, var14, var15, -1);
            arg4.method58(-47972, 0, arg2, var18, field55[arg8], arg11, arg7, var19, var16, null, var22);
            if (var17.field826) {
                arg0.method296(var17.field827, arg8, arg2, false, arg11, arg6);
            }
            if (var17.field832 != -1) {
                arg1.method225(new LocEntity(true, arg3, (byte) 9, arg11, arg2, SeqType.field1043[var17.field832], arg7, 0));
            }
        } else if (arg6 == 1) {
            Model var23 = var17.method278(1, arg8, var12, var13, var14, var15, -1);
            arg4.method58(-47972, 0, arg2, var18, field56[arg8], arg11, arg7, var19, var16, null, var23);
            if (var17.field826) {
                arg0.method296(var17.field827, arg8, arg2, false, arg11, arg6);
            }
            if (var17.field832 != -1) {
                arg1.method225(new LocEntity(true, arg3, (byte) 9, arg11, arg2, SeqType.field1043[var17.field832], arg7, 0));
            }
        } else if (arg6 == 2) {
            int var24 = arg8 + 1 & 0x3;
            Model var25 = var17.method278(2, arg8 + 4, var12, var13, var14, var15, -1);
            Model var26 = var17.method278(2, var24, var12, var13, var14, var15, -1);
            arg4.method58(-47972, field55[var24], arg2, var18, field55[arg8], arg11, arg7, var19, var16, var26, var25);
            if (var17.field826) {
                arg0.method296(var17.field827, arg8, arg2, false, arg11, arg6);
            }
            if (var17.field832 != -1) {
                arg1.method225(new LocEntity(true, arg3, (byte) 9, arg11, arg2, SeqType.field1043[var17.field832], arg7, 0));
            }
        } else if (arg6 == 3) {
            Model var27 = var17.method278(3, arg8, var12, var13, var14, var15, -1);
            arg4.method58(-47972, 0, arg2, var18, field56[arg8], arg11, arg7, var19, var16, null, var27);
            if (var17.field826) {
                arg0.method296(var17.field827, arg8, arg2, false, arg11, arg6);
            }
            if (var17.field832 != -1) {
                arg1.method225(new LocEntity(true, arg3, (byte) 9, arg11, arg2, SeqType.field1043[var17.field832], arg7, 0));
            }
        } else if (arg6 == 9) {
            Model var28 = var17.method278(arg6, arg8, var12, var13, var14, var15, -1);
            arg4.method60(1, arg11, var28, var19, 0, arg2, arg7, var16, 0, var18, null, 1);
            if (var17.field826) {
                arg0.method297(var17.field827, arg11, var17.field824, arg8, 242, var17.field825, arg2);
            }
            if (var17.field832 != -1) {
                arg1.method225(new LocEntity(true, arg3, (byte) 9, arg11, arg2, SeqType.field1043[var17.field832], arg7, 2));
            }
        } else if (arg6 == 4) {
            Model var29 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg4.method59(arg2, var16, var19, arg11, field55[arg8], arg7, true, var29, 0, var18, arg8 * 512, 0);
            if (var17.field832 != -1) {
                arg1.method225(new LocEntity(true, arg3, (byte) 9, arg11, arg2, SeqType.field1043[var17.field832], arg7, 1));
            }
        } else if (arg6 == 5) {
            int var30 = 16;
            int var31 = arg4.method77(arg7, arg11, arg2);
            if (var31 > 0) {
                var30 = LocType.method275(var31 >> 14 & 0x7FFF).field833;
            }
            Model var32 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg4.method59(arg2, var16, var19, arg11, field55[arg8], arg7, true, var32, field57[arg8] * var30, var18, arg8 * 512, field58[arg8] * var30);
            if (var17.field832 != -1) {
                arg1.method225(new LocEntity(true, arg3, (byte) 9, arg11, arg2, SeqType.field1043[var17.field832], arg7, 1));
            }
        } else if (arg6 == 6) {
            Model var33 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg4.method59(arg2, var16, var19, arg11, 256, arg7, true, var33, 0, var18, arg8, 0);
            if (var17.field832 != -1) {
                arg1.method225(new LocEntity(true, arg3, (byte) 9, arg11, arg2, SeqType.field1043[var17.field832], arg7, 1));
            }
        } else if (arg6 == 7) {
            Model var34 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg4.method59(arg2, var16, var19, arg11, 512, arg7, true, var34, 0, var18, arg8, 0);
            if (var17.field832 != -1) {
                arg1.method225(new LocEntity(true, arg3, (byte) 9, arg11, arg2, SeqType.field1043[var17.field832], arg7, 1));
            }
        } else if (arg6 == 8) {
            Model var35 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg4.method59(arg2, var16, var19, arg11, 768, arg7, true, var35, 0, var18, arg8, 0);
            if (var17.field832 != -1) {
                arg1.method225(new LocEntity(true, arg3, (byte) 9, arg11, arg2, SeqType.field1043[var17.field832], arg7, 1));
            }
        }
    }
}
