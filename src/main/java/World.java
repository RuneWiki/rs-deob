import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "b", descriptor = "I")
    private int field31 = 3;

    @OriginalMember(owner = "c", name = "c", descriptor = "Z")
    private boolean field32 = true;

    @OriginalMember(owner = "c", name = "d", descriptor = "B")
    private byte field33 = 96;

    @OriginalMember(owner = "c", name = "h", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "c", name = "i", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "c", name = "j", descriptor = "[[[I")
    private int[][][] field39;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[B")
    private byte[][][] field40;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field41;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field42;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field43;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field44;

    @OriginalMember(owner = "c", name = "w", descriptor = "[[[I")
    private int[][][] field52;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[[B")
    private byte[][][] field45;

    @OriginalMember(owner = "c", name = "q", descriptor = "[[I")
    private int[][] field46;

    @OriginalMember(owner = "c", name = "r", descriptor = "[I")
    private int[] field47;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field48;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field49;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field50;

    @OriginalMember(owner = "c", name = "v", descriptor = "[I")
    private int[] field51;

    @OriginalMember(owner = "c", name = "a", descriptor = "I")
    private static int field30 = -545;

    @OriginalMember(owner = "c", name = "e", descriptor = "Z")
    public static boolean field34 = true;

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private static final int[] field53 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field54 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field55 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "A", descriptor = "[I")
    private static final int[] field56 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "f", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "c", name = "g", descriptor = "Z")
    public static boolean field36;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "(I[[[II[[[BI)V")
    public World(int arg0, int[][][] arg1, int arg2, byte[][][] arg3, int arg4) {
        this.field37 = arg2;
        this.field38 = arg4;
        this.field39 = arg1;
        this.field40 = arg3;
        this.field41 = new byte[4][this.field37][this.field38];
        this.field42 = new byte[4][this.field37][this.field38];
        this.field43 = new byte[4][this.field37][this.field38];
        this.field44 = new byte[4][this.field37][this.field38];
        this.field52 = new int[4][this.field37 + 1][this.field38 + 1];
        this.field45 = new byte[4][this.field37 + 1][this.field38 + 1];
        this.field46 = new int[this.field37 + 1][this.field38 + 1];
        this.field47 = new int[this.field38];
        this.field48 = new int[this.field38];
        this.field49 = new int[this.field38];
        this.field50 = new int[this.field38];
        this.field51 = new int[this.field38];
        if (arg0 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(BIIII)V")
    public final void method14(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 0;
        for (int var7 = 0; var7 < FloType.field910; var7++) {
            if (FloType.field911[var7].field916.equalsIgnoreCase("water")) {
                var6 = (byte) (var7 + 1);
                break;
            }
        }
        if (arg0 != 7) {
            this.field32 = !this.field32;
        }
        for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
            for (int var9 = arg4; var9 < arg2 + arg4; var9++) {
                if (var9 >= 0 && var9 < this.field37 && var8 >= 0 && var8 < this.field38) {
                    this.field42[0][var9][var8] = var6;
                    for (int var10 = 0; var10 < 4; var10++) {
                        this.field39[var10][var9][var8] = 0;
                        this.field40[var10][var9][var8] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II[BIII)V")
    public final void method15(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 0) {
            this.field31 = -489;
        }
        Packet var7 = new Packet(575, arg2);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg3 + var9;
                    int var12 = arg4 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field40[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method209();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field39[0][var11][var12] = -method20(var11 + arg0 + 932731, var12 + 556238 + arg5) * 8;
                                } else {
                                    this.field39[var8][var11][var12] = this.field39[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method209();
                                if (var14 == 1) {
                                    var14 = 0;
                                }
                                if (var8 == 0) {
                                    this.field39[0][var11][var12] = -var14 * 8;
                                } else {
                                    this.field39[var8][var11][var12] = this.field39[var8 - 1][var11][var12] - var14 * 8;
                                }
                                break;
                            }
                            if (var13 <= 49) {
                                this.field42[var8][var11][var12] = var7.method210();
                                this.field43[var8][var11][var12] = (byte) ((var13 - 2) / 4);
                                this.field44[var8][var11][var12] = (byte) (var13 - 2 & 0x3);
                            } else if (var13 <= 81) {
                                this.field40[var8][var11][var12] = (byte) (var13 - 49);
                            } else {
                                this.field41[var8][var11][var12] = (byte) (var13 - 81);
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lob;Lr;II[Lec;[BI)V")
    public final void method16(LinkList arg0, World3D arg1, int arg2, int arg3, CollisionMap[] arg4, byte[] arg5, int arg6) {
        if (arg2 != 15680) {
            return;
        }
        Packet var8 = new Packet(575, arg5);
        int var9 = -1;
        while (true) {
            int var10 = var8.method223();
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method223();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var8.method209();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg3 + var14;
                int var20 = arg6 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field40[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    CollisionMap var22 = null;
                    if (var21 >= 0) {
                        var22 = arg4[var21];
                    }
                    this.method17(var18, var17, var19, var22, var15, 6, arg1, var9, var20, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIILec;IILr;IILob;)V")
    private final void method17(int arg0, int arg1, int arg2, CollisionMap arg3, int arg4, int arg5, World3D arg6, int arg7, int arg8, LinkList arg9) {
        if (field34) {
            if ((this.field40[arg4][arg2][arg8] & 0x10) != 0) {
                return;
            }
            if (this.method19(arg8, arg2, arg4, (byte) 96) != field35) {
                return;
            }
        }
        int var11 = this.field39[arg4][arg2][arg8];
        int var12 = this.field39[arg4][arg2 + 1][arg8];
        int var13 = this.field39[arg4][arg2 + 1][arg8 + 1];
        int var14 = this.field39[arg4][arg2][arg8 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method275(arg7);
        int var17 = (arg7 << 14) + (arg8 << 7) + arg2 + 1073741824;
        if (!var16.field798) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg0 << 6) + arg1);
        if (arg5 != 6) {
            this.field31 = -10;
        }
        if (arg1 == 22) {
            if (!field34 || var16.field798 || var16.field819) {
                Model var19 = var16.method278(22, arg0, var11, var12, var13, var14, -1);
                arg6.method56(arg2, var19, arg4, 1000, var17, arg8, var15, var18);
                if (var16.field796 && var16.field798 && arg3 != null) {
                    arg3.method298(arg2, -31617, arg8);
                }
                if (var16.field802 != -1) {
                    arg9.method225(new LocEntity(arg7, arg8, arg4, 3, true, arg2, SeqType.field999[var16.field802], -8072));
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            Model var35 = var16.method278(10, arg0, var11, var12, var13, var14, -1);
            if (var35 != null) {
                int var36 = 0;
                if (arg1 == 11) {
                    var36 += 256;
                }
                int var37;
                int var38;
                if (arg0 == 1 || arg0 == 3) {
                    var37 = var16.field795;
                    var38 = var16.field794;
                } else {
                    var37 = var16.field794;
                    var38 = var16.field795;
                }
                if (arg6.method60(var17, null, var38, arg4, arg8, var37, var36, field30, var15, var35, var18, arg2) && var16.field811) {
                    for (int var39 = 0; var39 <= var37; var39++) {
                        for (int var40 = 0; var40 <= var38; var40++) {
                            int var41 = var35.field471 / 4;
                            if (var41 > 30) {
                                var41 = 30;
                            }
                            if (var41 > this.field45[arg4][arg2 + var39][arg8 + var40]) {
                                this.field45[arg4][arg2 + var39][arg8 + var40] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var16.field796 && arg3 != null) {
                arg3.method297(var16.field794, var16.field797, arg2, arg0, arg8, var16.field795, 771);
            }
            if (var16.field802 != -1) {
                arg9.method225(new LocEntity(arg7, arg8, arg4, 2, true, arg2, SeqType.field999[var16.field802], -8072));
            }
        } else if (arg1 >= 12) {
            Model var20 = var16.method278(arg1, arg0, var11, var12, var13, var14, -1);
            arg6.method60(var17, null, 1, arg4, arg8, 1, 0, field30, var15, var20, var18, arg2);
            if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg4 > 0) {
                this.field52[arg4][arg2][arg8] |= 0x924;
            }
            if (var16.field796 && arg3 != null) {
                arg3.method297(var16.field794, var16.field797, arg2, arg0, arg8, var16.field795, 771);
            }
            if (var16.field802 != -1) {
                arg9.method225(new LocEntity(arg7, arg8, arg4, 2, true, arg2, SeqType.field999[var16.field802], -8072));
            }
        } else if (arg1 == 0) {
            Model var21 = var16.method278(0, arg0, var11, var12, var13, var14, -1);
            arg6.method58(arg4, var17, 0, var15, null, arg2, -596, arg8, field53[arg0], var21, var18);
            if (arg0 == 0) {
                if (var16.field811) {
                    this.field45[arg4][arg2][arg8] = 50;
                    this.field45[arg4][arg2][arg8 + 1] = 50;
                }
                if (var16.field801) {
                    this.field52[arg4][arg2][arg8] |= 0x249;
                }
            } else if (arg0 == 1) {
                if (var16.field811) {
                    this.field45[arg4][arg2][arg8 + 1] = 50;
                    this.field45[arg4][arg2 + 1][arg8 + 1] = 50;
                }
                if (var16.field801) {
                    this.field52[arg4][arg2][arg8 + 1] |= 0x492;
                }
            } else if (arg0 == 2) {
                if (var16.field811) {
                    this.field45[arg4][arg2 + 1][arg8] = 50;
                    this.field45[arg4][arg2 + 1][arg8 + 1] = 50;
                }
                if (var16.field801) {
                    this.field52[arg4][arg2 + 1][arg8] |= 0x249;
                }
            } else if (arg0 == 3) {
                if (var16.field811) {
                    this.field45[arg4][arg2][arg8] = 50;
                    this.field45[arg4][arg2 + 1][arg8] = 50;
                }
                if (var16.field801) {
                    this.field52[arg4][arg2][arg8] |= 0x492;
                }
            }
            if (var16.field796 && arg3 != null) {
                arg3.method296(arg2, arg0, var16.field797, arg8, (byte) 3, arg1);
            }
            if (var16.field802 != -1) {
                arg9.method225(new LocEntity(arg7, arg8, arg4, 0, true, arg2, SeqType.field999[var16.field802], -8072));
            }
            if (var16.field803 != 16) {
                arg6.method67(var16.field803, arg4, (byte) 4, arg8, arg2);
            }
        } else if (arg1 == 1) {
            Model var22 = var16.method278(1, arg0, var11, var12, var13, var14, -1);
            arg6.method58(arg4, var17, 0, var15, null, arg2, -596, arg8, field54[arg0], var22, var18);
            if (var16.field811) {
                if (arg0 == 0) {
                    this.field45[arg4][arg2][arg8 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field45[arg4][arg2 + 1][arg8 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field45[arg4][arg2 + 1][arg8] = 50;
                } else if (arg0 == 3) {
                    this.field45[arg4][arg2][arg8] = 50;
                }
            }
            if (var16.field796 && arg3 != null) {
                arg3.method296(arg2, arg0, var16.field797, arg8, (byte) 3, arg1);
            }
            if (var16.field802 != -1) {
                arg9.method225(new LocEntity(arg7, arg8, arg4, 0, true, arg2, SeqType.field999[var16.field802], -8072));
            }
        } else if (arg1 == 2) {
            int var23 = arg0 + 1 & 0x3;
            Model var24 = var16.method278(2, arg0 + 4, var11, var12, var13, var14, -1);
            Model var25 = var16.method278(2, var23, var11, var12, var13, var14, -1);
            arg6.method58(arg4, var17, field53[var23], var15, var25, arg2, -596, arg8, field53[arg0], var24, var18);
            if (var16.field801) {
                if (arg0 == 0) {
                    this.field52[arg4][arg2][arg8] |= 0x249;
                    this.field52[arg4][arg2][arg8 + 1] |= 0x492;
                } else if (arg0 == 1) {
                    this.field52[arg4][arg2][arg8 + 1] |= 0x492;
                    this.field52[arg4][arg2 + 1][arg8] |= 0x249;
                } else if (arg0 == 2) {
                    this.field52[arg4][arg2 + 1][arg8] |= 0x249;
                    this.field52[arg4][arg2][arg8] |= 0x492;
                } else if (arg0 == 3) {
                    this.field52[arg4][arg2][arg8] |= 0x492;
                    this.field52[arg4][arg2][arg8] |= 0x249;
                }
            }
            if (var16.field796 && arg3 != null) {
                arg3.method296(arg2, arg0, var16.field797, arg8, (byte) 3, arg1);
            }
            if (var16.field802 != -1) {
                arg9.method225(new LocEntity(arg7, arg8, arg4, 0, true, arg2, SeqType.field999[var16.field802], -8072));
            }
            if (var16.field803 != 16) {
                arg6.method67(var16.field803, arg4, (byte) 4, arg8, arg2);
            }
        } else if (arg1 == 3) {
            Model var26 = var16.method278(3, arg0, var11, var12, var13, var14, -1);
            arg6.method58(arg4, var17, 0, var15, null, arg2, -596, arg8, field54[arg0], var26, var18);
            if (var16.field811) {
                if (arg0 == 0) {
                    this.field45[arg4][arg2][arg8 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field45[arg4][arg2 + 1][arg8 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field45[arg4][arg2 + 1][arg8] = 50;
                } else if (arg0 == 3) {
                    this.field45[arg4][arg2][arg8] = 50;
                }
            }
            if (var16.field796 && arg3 != null) {
                arg3.method296(arg2, arg0, var16.field797, arg8, (byte) 3, arg1);
            }
            if (var16.field802 != -1) {
                arg9.method225(new LocEntity(arg7, arg8, arg4, 0, true, arg2, SeqType.field999[var16.field802], -8072));
            }
        } else if (arg1 == 9) {
            Model var27 = var16.method278(arg1, arg0, var11, var12, var13, var14, -1);
            arg6.method60(var17, null, 1, arg4, arg8, 1, 0, field30, var15, var27, var18, arg2);
            if (var16.field796 && arg3 != null) {
                arg3.method297(var16.field794, var16.field797, arg2, arg0, arg8, var16.field795, 771);
            }
            if (var16.field802 != -1) {
                arg9.method225(new LocEntity(arg7, arg8, arg4, 2, true, arg2, SeqType.field999[var16.field802], -8072));
            }
        } else if (arg1 == 4) {
            Model var28 = var16.method278(4, 0, var11, var12, var13, var14, -1);
            arg6.method59(arg2, 0, var15, (byte) -44, field53[arg0], arg4, var17, var18, var28, 0, arg8, arg0 * 512);
            if (var16.field802 != -1) {
                arg9.method225(new LocEntity(arg7, arg8, arg4, 1, true, arg2, SeqType.field999[var16.field802], -8072));
            }
        } else if (arg1 == 5) {
            int var29 = 16;
            int var30 = arg6.method77(arg4, arg2, arg8);
            if (var30 > 0) {
                var29 = LocType.method275(var30 >> 14 & 0x7FFF).field803;
            }
            Model var31 = var16.method278(4, 0, var11, var12, var13, var14, -1);
            arg6.method59(arg2, field55[arg0] * var29, var15, (byte) -44, field53[arg0], arg4, var17, var18, var31, field56[arg0] * var29, arg8, arg0 * 512);
            if (var16.field802 != -1) {
                arg9.method225(new LocEntity(arg7, arg8, arg4, 1, true, arg2, SeqType.field999[var16.field802], -8072));
            }
        } else if (arg1 == 6) {
            Model var32 = var16.method278(4, 0, var11, var12, var13, var14, -1);
            arg6.method59(arg2, 0, var15, (byte) -44, 256, arg4, var17, var18, var32, 0, arg8, arg0);
            if (var16.field802 != -1) {
                arg9.method225(new LocEntity(arg7, arg8, arg4, 1, true, arg2, SeqType.field999[var16.field802], -8072));
            }
        } else if (arg1 == 7) {
            Model var33 = var16.method278(4, 0, var11, var12, var13, var14, -1);
            arg6.method59(arg2, 0, var15, (byte) -44, 512, arg4, var17, var18, var33, 0, arg8, arg0);
            if (var16.field802 != -1) {
                arg9.method225(new LocEntity(arg7, arg8, arg4, 1, true, arg2, SeqType.field999[var16.field802], -8072));
            }
        } else if (arg1 == 8) {
            Model var34 = var16.method278(4, 0, var11, var12, var13, var14, -1);
            arg6.method59(arg2, 0, var15, (byte) -44, 768, arg4, var17, var18, var34, 0, arg8, arg0);
            if (var16.field802 != -1) {
                arg9.method225(new LocEntity(arg7, arg8, arg4, 1, true, arg2, SeqType.field999[var16.field802], -8072));
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;Z[Lec;)V")
    public final void method18(World3D arg0, boolean arg1, CollisionMap[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var104 = 0; var104 < 104; var104++) {
                for (int var105 = 0; var105 < 104; var105++) {
                    if ((this.field40[var4][var104][var105] & 0x1) == 1) {
                        int var106 = var4;
                        if ((this.field40[1][var104][var105] & 0x2) == 2) {
                            var106 = var4 - 1;
                        }
                        if (var106 >= 0) {
                            arg2[var106].method298(var104, -31617, var105);
                        }
                    }
                }
            }
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field45[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field38 - 1; var56++) {
                for (int var95 = 1; var95 < this.field37 - 1; var95++) {
                    int var96 = this.field39[var5][var95 + 1][var56] - this.field39[var5][var95 - 1][var56];
                    int var97 = this.field39[var5][var95][var56 + 1] - this.field39[var5][var95][var56 - 1];
                    int var98 = (int) Math.sqrt((double) (var97 * var97 + var96 * var96 + 65536));
                    int var99 = (var96 << 8) / var98;
                    int var100 = 65536 / var98;
                    int var101 = (var97 << 8) / var98;
                    int var102 = (var53 * var101 + var51 * var99 + var52 * var100) / var55 + var49;
                    int var103 = (var48[var95][var56] >> 1) + (var48[var95][var56 + 1] >> 3) + (var48[var95][var56 - 1] >> 2) + (var48[var95 - 1][var56] >> 2) + (var48[var95 + 1][var56] >> 3);
                    this.field46[var95][var56] = var102 - var103;
                }
            }
            for (int var57 = 0; var57 < this.field38; var57++) {
                this.field47[var57] = 0;
                this.field48[var57] = 0;
                this.field49[var57] = 0;
                this.field50[var57] = 0;
                this.field51[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field37 + 5; var58++) {
                for (int var61 = 0; var61 < this.field38; var61++) {
                    int var89 = var58 + 5;
                    int var10002;
                    if (var89 >= 0 && var89 < this.field37) {
                        int var90 = this.field41[var5][var89][var61] & 0xFF;
                        if (var90 > 0) {
                            FloType var91 = FloType.field911[var90 - 1];
                            this.field47[var61] += var91.field920;
                            this.field48[var61] += var91.field918;
                            this.field49[var61] += var91.field919;
                            this.field50[var61] += var91.field921;
                            var10002 = this.field51[var61]++;
                        }
                    }
                    int var92 = var58 - 5;
                    if (var92 >= 0 && var92 < this.field37) {
                        int var93 = this.field41[var5][var92][var61] & 0xFF;
                        if (var93 > 0) {
                            FloType var94 = FloType.field911[var93 - 1];
                            this.field47[var61] -= var94.field920;
                            this.field48[var61] -= var94.field918;
                            this.field49[var61] -= var94.field919;
                            this.field50[var61] -= var94.field921;
                            var10002 = this.field51[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field37 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field38 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field38) {
                            var62 += this.field47[var68];
                            var63 += this.field48[var68];
                            var64 += this.field49[var68];
                            var65 += this.field50[var68];
                            var66 += this.field51[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field38) {
                            var62 -= this.field47[var69];
                            var63 -= this.field48[var69];
                            var64 -= this.field49[var69];
                            var65 -= this.field50[var69];
                            var66 -= this.field51[var69];
                        }
                        if (var67 >= 1 && var67 < this.field38 - 1 && (!field34 || (this.field40[var5][var58][var67] & 0x10) == 0 && this.method19(var67, var58, var5, (byte) 96) == field35)) {
                            int var70 = this.field41[var5][var58][var67] & 0xFF;
                            int var71 = this.field42[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field39[var5][var58][var67];
                                int var73 = this.field39[var5][var58 + 1][var67];
                                int var74 = this.field39[var5][var58 + 1][var67 + 1];
                                int var75 = this.field39[var5][var58][var67 + 1];
                                int var76 = this.field46[var58][var67];
                                int var77 = this.field46[var58 + 1][var67];
                                int var78 = this.field46[var58 + 1][var67 + 1];
                                int var79 = this.field46[var58][var67 + 1];
                                int var80 = -1;
                                if (var70 > 0) {
                                    var80 = this.method27(var62 * 256 / var65, var63 / var66, var64 / var66);
                                }
                                if (var5 > 0) {
                                    boolean var81 = true;
                                    if (var70 == 0 && this.field43[var5][var58][var67] != 0) {
                                        var81 = false;
                                    }
                                    if (var71 > 0 && !FloType.field911[var71 - 1].field915) {
                                        var81 = false;
                                    }
                                    if (var81 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field52[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var82 = 0;
                                if (var80 != -1) {
                                    var82 = Pix3D.field567[method25(var80, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method55(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method25(var80, var76), method25(var80, var77), method25(var80, var78), method25(var80, var79), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = this.field43[var5][var58][var67] + 1;
                                    byte var84 = this.field44[var5][var58][var67];
                                    FloType var85 = FloType.field911[var71 - 1];
                                    int var86 = var85.field913;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = Pix3D.method159(var86, -550);
                                        var88 = -1;
                                    } else if (var85.field912 == 16711935) {
                                        var87 = 0;
                                        var88 = -2;
                                        var86 = -1;
                                    } else {
                                        var88 = this.method27(var85.field917, var85.field918, var85.field919);
                                        var87 = Pix3D.field567[this.method26(var88, 96)];
                                    }
                                    arg0.method55(var5, var58, var67, var83, var84, var86, var72, var73, var74, var75, method25(var80, var76), method25(var80, var77), method25(var80, var78), method25(var80, var79), this.method26(var88, var76), this.method26(var88, var77), this.method26(var88, var78), this.method26(var88, var79), var82, var87);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field38 - 1; var59++) {
                for (int var60 = 1; var60 < this.field37 - 1; var60++) {
                    arg0.method54(var5, var60, var59, this.method19(var59, var60, var5, (byte) 96));
                }
            }
        }
        if (!field36) {
            arg0.method82(-50, -10, 768, -50, 64, (byte) 50);
        }
        for (int var6 = 0; var6 < this.field37; var6++) {
            for (int var47 = 0; var47 < this.field38; var47++) {
                if ((this.field40[1][var6][var47] & 0x2) == 2) {
                    arg0.method52(var47, (byte) 68, var6);
                }
            }
        }
        if (arg1) {
            this.field32 = !this.field32;
        }
        if (field36) {
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
                for (int var12 = 0; var12 <= this.field38; var12++) {
                    for (int var13 = 0; var13 <= this.field37; var13++) {
                        if ((this.field52[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field52[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field38 && (this.field52[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label316: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field52[var16 - 1][var13][var18] & var7) == 0) {
                                        break label316;
                                    }
                                }
                                var16--;
                            }
                            label305: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field52[var17 + 1][var13][var19] & var7) == 0) {
                                        break label305;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field39[var17][var13][var14] - var21;
                                int var23 = this.field39[var16][var13][var14];
                                World3D.method53(var13 * 128, 1, var15 * 128 + 128, var14 * 128, -768, var23, var10, var22, var13 * 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field52[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field52[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field52[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field37 && (this.field52[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label369: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field52[var28 - 1][var30][var12] & var8) == 0) {
                                        break label369;
                                    }
                                }
                                var28--;
                            }
                            label358: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field52[var29 + 1][var31][var12] & var8) == 0) {
                                        break label358;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field39[var29][var26][var12] - var33;
                                int var35 = this.field39[var28][var26][var12];
                                World3D.method53(var27 * 128 + 128, 2, var12 * 128, var12 * 128, -768, var35, var10, var34, var26 * 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field52[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field52[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field52[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field38 && (this.field52[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label422: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field52[var11][var38 - 1][var42] & var9) == 0) {
                                        break label422;
                                    }
                                }
                                var38--;
                            }
                            label411: while (var39 < this.field37) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field52[var11][var39 + 1][var43] & var9) == 0) {
                                        break label411;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field39[var11][var38][var40];
                                World3D.method53(var39 * 128 + 128, 4, var41 * 128 + 128, var40 * 128, -768, var44, var10, var44, var38 * 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field52[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIB)I")
    public int method19(int arg0, int arg1, int arg2, byte arg3) {
        if (this.field33 != arg3) {
            return field30;
        } else if ((this.field40[arg2][arg1][arg0] & 0x8) == 0) {
            return arg2 <= 0 || (this.field40[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIII)I")
    private static final int method22(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - Pix3D.field556[arg2 * 1024 / arg3] >> 1;
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;Lob;[[[IIIIILec;IIII)V")
    public static final void method28(World3D arg0, LinkList arg1, int[][][] arg2, int arg3, int arg4, int arg5, int arg6, CollisionMap arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg2[arg5][arg4][arg3];
        int var13 = arg2[arg5][arg4 + 1][arg3];
        int var14 = arg2[arg5][arg4 + 1][arg3 + 1];
        int var15 = arg2[arg5][arg4][arg3 + 1];
        int var16 = var12 + var13 + var14 + var15 >> 2;
        if (arg6 >= 0) {
            return;
        }
        LocType var17 = LocType.method275(arg8);
        int var18 = (arg8 << 14) + (arg3 << 7) + arg4 + 1073741824;
        if (!var17.field798) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg11 << 6) + arg10);
        if (arg10 == 22) {
            Model var20 = var17.method278(22, arg11, var12, var13, var14, var15, -1);
            arg0.method56(arg4, var20, arg9, 1000, var18, arg3, var16, var19);
            if (var17.field796 && var17.field798) {
                arg7.method298(arg4, -31617, arg3);
            }
            if (var17.field802 != -1) {
                arg1.method225(new LocEntity(arg8, arg3, arg9, 3, true, arg4, SeqType.field999[var17.field802], -8072));
            }
        } else if (arg10 == 10 || arg10 == 11) {
            Model var36 = var17.method278(10, arg11, var12, var13, var14, var15, -1);
            if (var36 != null) {
                int var37 = 0;
                if (arg10 == 11) {
                    var37 += 256;
                }
                int var38;
                int var39;
                if (arg11 == 1 || arg11 == 3) {
                    var38 = var17.field795;
                    var39 = var17.field794;
                } else {
                    var38 = var17.field794;
                    var39 = var17.field795;
                }
                arg0.method60(var18, null, var39, arg9, arg3, var38, var37, field30, var16, var36, var19, arg4);
            }
            if (var17.field796) {
                arg7.method297(var17.field794, var17.field797, arg4, arg11, arg3, var17.field795, 771);
            }
            if (var17.field802 != -1) {
                arg1.method225(new LocEntity(arg8, arg3, arg9, 2, true, arg4, SeqType.field999[var17.field802], -8072));
            }
        } else if (arg10 >= 12) {
            Model var21 = var17.method278(arg10, arg11, var12, var13, var14, var15, -1);
            arg0.method60(var18, null, 1, arg9, arg3, 1, 0, field30, var16, var21, var19, arg4);
            if (var17.field796) {
                arg7.method297(var17.field794, var17.field797, arg4, arg11, arg3, var17.field795, 771);
            }
            if (var17.field802 != -1) {
                arg1.method225(new LocEntity(arg8, arg3, arg9, 2, true, arg4, SeqType.field999[var17.field802], -8072));
            }
        } else if (arg10 == 0) {
            Model var22 = var17.method278(0, arg11, var12, var13, var14, var15, -1);
            arg0.method58(arg9, var18, 0, var16, null, arg4, -596, arg3, field53[arg11], var22, var19);
            if (var17.field796) {
                arg7.method296(arg4, arg11, var17.field797, arg3, (byte) 3, arg10);
            }
            if (var17.field802 != -1) {
                arg1.method225(new LocEntity(arg8, arg3, arg9, 0, true, arg4, SeqType.field999[var17.field802], -8072));
            }
        } else if (arg10 == 1) {
            Model var23 = var17.method278(1, arg11, var12, var13, var14, var15, -1);
            arg0.method58(arg9, var18, 0, var16, null, arg4, -596, arg3, field54[arg11], var23, var19);
            if (var17.field796) {
                arg7.method296(arg4, arg11, var17.field797, arg3, (byte) 3, arg10);
            }
            if (var17.field802 != -1) {
                arg1.method225(new LocEntity(arg8, arg3, arg9, 0, true, arg4, SeqType.field999[var17.field802], -8072));
            }
        } else if (arg10 == 2) {
            int var24 = arg11 + 1 & 0x3;
            Model var25 = var17.method278(2, arg11 + 4, var12, var13, var14, var15, -1);
            Model var26 = var17.method278(2, var24, var12, var13, var14, var15, -1);
            arg0.method58(arg9, var18, field53[var24], var16, var26, arg4, -596, arg3, field53[arg11], var25, var19);
            if (var17.field796) {
                arg7.method296(arg4, arg11, var17.field797, arg3, (byte) 3, arg10);
            }
            if (var17.field802 != -1) {
                arg1.method225(new LocEntity(arg8, arg3, arg9, 0, true, arg4, SeqType.field999[var17.field802], -8072));
            }
        } else if (arg10 == 3) {
            Model var27 = var17.method278(3, arg11, var12, var13, var14, var15, -1);
            arg0.method58(arg9, var18, 0, var16, null, arg4, -596, arg3, field54[arg11], var27, var19);
            if (var17.field796) {
                arg7.method296(arg4, arg11, var17.field797, arg3, (byte) 3, arg10);
            }
            if (var17.field802 != -1) {
                arg1.method225(new LocEntity(arg8, arg3, arg9, 0, true, arg4, SeqType.field999[var17.field802], -8072));
            }
        } else if (arg10 == 9) {
            Model var28 = var17.method278(arg10, arg11, var12, var13, var14, var15, -1);
            arg0.method60(var18, null, 1, arg9, arg3, 1, 0, field30, var16, var28, var19, arg4);
            if (var17.field796) {
                arg7.method297(var17.field794, var17.field797, arg4, arg11, arg3, var17.field795, 771);
            }
            if (var17.field802 != -1) {
                arg1.method225(new LocEntity(arg8, arg3, arg9, 2, true, arg4, SeqType.field999[var17.field802], -8072));
            }
        } else if (arg10 == 4) {
            Model var29 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg0.method59(arg4, 0, var16, (byte) -44, field53[arg11], arg9, var18, var19, var29, 0, arg3, arg11 * 512);
            if (var17.field802 != -1) {
                arg1.method225(new LocEntity(arg8, arg3, arg9, 1, true, arg4, SeqType.field999[var17.field802], -8072));
            }
        } else if (arg10 == 5) {
            int var30 = 16;
            int var31 = arg0.method77(arg9, arg4, arg3);
            if (var31 > 0) {
                var30 = LocType.method275(var31 >> 14 & 0x7FFF).field803;
            }
            Model var32 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg0.method59(arg4, field55[arg11] * var30, var16, (byte) -44, field53[arg11], arg9, var18, var19, var32, field56[arg11] * var30, arg3, arg11 * 512);
            if (var17.field802 != -1) {
                arg1.method225(new LocEntity(arg8, arg3, arg9, 1, true, arg4, SeqType.field999[var17.field802], -8072));
            }
        } else if (arg10 == 6) {
            Model var33 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg0.method59(arg4, 0, var16, (byte) -44, 256, arg9, var18, var19, var33, 0, arg3, arg11);
            if (var17.field802 != -1) {
                arg1.method225(new LocEntity(arg8, arg3, arg9, 1, true, arg4, SeqType.field999[var17.field802], -8072));
            }
        } else if (arg10 == 7) {
            Model var34 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg0.method59(arg4, 0, var16, (byte) -44, 512, arg9, var18, var19, var34, 0, arg3, arg11);
            if (var17.field802 != -1) {
                arg1.method225(new LocEntity(arg8, arg3, arg9, 1, true, arg4, SeqType.field999[var17.field802], -8072));
            }
        } else if (arg10 == 8) {
            Model var35 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg0.method59(arg4, 0, var16, (byte) -44, 768, arg9, var18, var19, var35, 0, arg3, arg11);
            if (var17.field802 != -1) {
                arg1.method225(new LocEntity(arg8, arg3, arg9, 1, true, arg4, SeqType.field999[var17.field802], -8072));
            }
        }
    }
}
