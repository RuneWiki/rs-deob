import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "b", descriptor = "Z")
    private boolean field31 = true;

    @OriginalMember(owner = "c", name = "c", descriptor = "I")
    private int field32 = 15823;

    @OriginalMember(owner = "c", name = "e", descriptor = "Z")
    private boolean field34 = true;

    @OriginalMember(owner = "c", name = "i", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "c", name = "j", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[I")
    private int[][][] field40;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field41;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field42;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field43;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field44;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[[B")
    private byte[][][] field45;

    @OriginalMember(owner = "c", name = "x", descriptor = "[[[I")
    private int[][][] field53;

    @OriginalMember(owner = "c", name = "q", descriptor = "[[[B")
    private byte[][][] field46;

    @OriginalMember(owner = "c", name = "r", descriptor = "[[I")
    private int[][] field47;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field48;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field49;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field50;

    @OriginalMember(owner = "c", name = "v", descriptor = "[I")
    private int[] field51;

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private int[] field52;

    @OriginalMember(owner = "c", name = "a", descriptor = "I")
    private static int field30 = -710;

    @OriginalMember(owner = "c", name = "d", descriptor = "Z")
    private static boolean field33 = true;

    @OriginalMember(owner = "c", name = "f", descriptor = "Z")
    public static boolean field35 = true;

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field54 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field55 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "A", descriptor = "[I")
    private static final int[] field56 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "B", descriptor = "[I")
    private static final int[] field57 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "c", name = "h", descriptor = "Z")
    public static boolean field37;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "(I[[[B[[[III)V")
    public World(int arg0, byte[][][] arg1, int[][][] arg2, int arg3, int arg4) {
        this.field38 = arg0;
        this.field39 = arg3;
        this.field40 = arg2;
        this.field41 = arg1;
        this.field42 = new byte[4][this.field38][this.field39];
        this.field43 = new byte[4][this.field38][this.field39];
        this.field44 = new byte[4][this.field38][this.field39];
        this.field45 = new byte[4][this.field38][this.field39];
        this.field53 = new int[4][this.field38 + 1][this.field39 + 1];
        if (arg4 != 27245) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field46 = new byte[4][this.field38 + 1][this.field39 + 1];
        this.field47 = new int[this.field38 + 1][this.field39 + 1];
        this.field48 = new int[this.field39];
        this.field49 = new int[this.field39];
        this.field50 = new int[this.field39];
        this.field51 = new int[this.field39];
        this.field52 = new int[this.field39];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIII)V")
    public final void method14(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 0;
        for (int var7 = 0; var7 < FloType.field930; var7++) {
            if (FloType.field931[var7].field936.equalsIgnoreCase("water")) {
                var6 = (byte) (var7 + 1);
                break;
            }
        }
        for (int var8 = arg0; var8 < arg0 + arg1; var8++) {
            for (int var10 = arg2; var10 < arg2 + arg4; var10++) {
                if (var10 >= 0 && var10 < this.field38 && var8 >= 0 && var8 < this.field39) {
                    this.field43[0][var10][var8] = var6;
                    for (int var11 = 0; var11 < 4; var11++) {
                        this.field40[var11][var10][var8] = 0;
                        this.field41[var11][var10][var8] = 0;
                    }
                }
            }
        }
        int var9 = 93 / arg3;
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(B[BIIII)V")
    public final void method15(byte arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 3) {
            return;
        }
        boolean var7 = false;
        Packet var8 = new Packet(arg1, this.field31);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    int var12 = arg5 + var10;
                    int var13 = arg2 + var11;
                    if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                        this.field41[var9][var12][var13] = 0;
                        while (true) {
                            int var14 = var8.method208();
                            if (var14 == 0) {
                                if (var9 == 0) {
                                    this.field40[0][var12][var13] = -method20(var12 + arg4 + 932731, var13 + 556238 + arg3) * 8;
                                } else {
                                    this.field40[var9][var12][var13] = this.field40[var9 - 1][var12][var13] - 240;
                                }
                                break;
                            }
                            if (var14 == 1) {
                                int var15 = var8.method208();
                                if (var15 == 1) {
                                    var15 = 0;
                                }
                                if (var9 == 0) {
                                    this.field40[0][var12][var13] = -var15 * 8;
                                } else {
                                    this.field40[var9][var12][var13] = this.field40[var9 - 1][var12][var13] - var15 * 8;
                                }
                                break;
                            }
                            if (var14 <= 49) {
                                this.field43[var9][var12][var13] = var8.method209();
                                this.field44[var9][var12][var13] = (byte) ((var14 - 2) / 4);
                                this.field45[var9][var12][var13] = (byte) (var14 - 2 & 0x3);
                            } else if (var14 <= 81) {
                                this.field41[var9][var12][var13] = (byte) (var14 - 49);
                            } else {
                                this.field42[var9][var12][var13] = (byte) (var14 - 81);
                            }
                        }
                    } else {
                        while (true) {
                            int var16 = var8.method208();
                            if (var16 == 0) {
                                break;
                            }
                            if (var16 == 1) {
                                var8.method208();
                                break;
                            }
                            if (var16 <= 49) {
                                var8.method208();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IB[Lec;[BLob;Lr;I)V")
    public final void method16(int arg0, byte arg1, CollisionMap[] arg2, byte[] arg3, LinkList arg4, World3D arg5, int arg6) {
        if (arg1 != 50) {
            this.field31 = !this.field31;
        }
        Packet var8 = new Packet(arg3, this.field31);
        int var9 = -1;
        while (true) {
            int var10 = var8.method222();
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method222();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var8.method208();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg0 + var14;
                int var20 = arg6 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field41[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    CollisionMap var22 = null;
                    if (var21 >= 0) {
                        var22 = arg2[var21];
                    }
                    this.method17(var17, var9, arg4, var19, var20, arg5, var18, var15, 49826, var22);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IILob;IILr;IIILec;)V")
    private final void method17(int arg0, int arg1, LinkList arg2, int arg3, int arg4, World3D arg5, int arg6, int arg7, int arg8, CollisionMap arg9) {
        if (field35) {
            if ((this.field41[arg7][arg3][arg4] & 0x10) != 0) {
                return;
            }
            if (this.method19(928, arg7, arg3, arg4) != field36) {
                return;
            }
        }
        int var11 = this.field40[arg7][arg3][arg4];
        int var12 = this.field40[arg7][arg3 + 1][arg4];
        int var13 = this.field40[arg7][arg3 + 1][arg4 + 1];
        int var14 = this.field40[arg7][arg3][arg4 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method274(arg1);
        int var17 = (arg1 << 14) + (arg4 << 7) + arg3 + 1073741824;
        if (arg8 != 49826) {
            this.field34 = !this.field34;
        }
        if (!var16.field818) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg6 << 6) + arg0);
        if (arg0 == 22) {
            if (!field35 || var16.field818 || var16.field839) {
                Model var19 = var16.method277(22, arg6, var11, var12, var13, var14, -1);
                arg5.method56(var15, var17, arg4, false, var18, arg3, var19, arg7);
                if (var16.field816 && var16.field818 && arg9 != null) {
                    arg9.method297(arg4, true, arg3);
                }
                if (var16.field822 != -1) {
                    arg2.method224(new LocEntity(arg1, arg4, arg7, SeqType.field1026[var16.field822], arg3, 3, (byte) -50, true));
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            Model var35 = var16.method277(10, arg6, var11, var12, var13, var14, -1);
            if (var35 != null) {
                int var36 = 0;
                if (arg0 == 11) {
                    var36 += 256;
                }
                int var37;
                int var38;
                if (arg6 == 1 || arg6 == 3) {
                    var37 = var16.field815;
                    var38 = var16.field814;
                } else {
                    var37 = var16.field814;
                    var38 = var16.field815;
                }
                if (arg5.method60(var18, arg4, var36, var37, var15, (byte) 6, var38, arg3, var17, var35, null, arg7) && var16.field831) {
                    for (int var39 = 0; var39 <= var37; var39++) {
                        for (int var40 = 0; var40 <= var38; var40++) {
                            int var41 = var35.field471 / 4;
                            if (var41 > 30) {
                                var41 = 30;
                            }
                            if (var41 > this.field46[arg7][arg3 + var39][arg4 + var40]) {
                                this.field46[arg7][arg3 + var39][arg4 + var40] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var16.field816 && arg9 != null) {
                arg9.method296(arg4, var16.field814, var16.field817, arg3, field33, var16.field815, arg6);
            }
            if (var16.field822 != -1) {
                arg2.method224(new LocEntity(arg1, arg4, arg7, SeqType.field1026[var16.field822], arg3, 2, (byte) -50, true));
            }
        } else if (arg0 >= 12) {
            Model var20 = var16.method277(arg0, arg6, var11, var12, var13, var14, -1);
            arg5.method60(var18, arg4, 0, 1, var15, (byte) 6, 1, arg3, var17, var20, null, arg7);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg7 > 0) {
                this.field53[arg7][arg3][arg4] |= 0x924;
            }
            if (var16.field816 && arg9 != null) {
                arg9.method296(arg4, var16.field814, var16.field817, arg3, field33, var16.field815, arg6);
            }
            if (var16.field822 != -1) {
                arg2.method224(new LocEntity(arg1, arg4, arg7, SeqType.field1026[var16.field822], arg3, 2, (byte) -50, true));
            }
        } else if (arg0 == 0) {
            Model var21 = var16.method277(0, arg6, var11, var12, var13, var14, -1);
            arg5.method58((byte) 6, var17, 0, null, var18, field54[arg6], arg4, var21, var15, arg7, arg3);
            if (arg6 == 0) {
                if (var16.field831) {
                    this.field46[arg7][arg3][arg4] = 50;
                    this.field46[arg7][arg3][arg4 + 1] = 50;
                }
                if (var16.field821) {
                    this.field53[arg7][arg3][arg4] |= 0x249;
                }
            } else if (arg6 == 1) {
                if (var16.field831) {
                    this.field46[arg7][arg3][arg4 + 1] = 50;
                    this.field46[arg7][arg3 + 1][arg4 + 1] = 50;
                }
                if (var16.field821) {
                    this.field53[arg7][arg3][arg4 + 1] |= 0x492;
                }
            } else if (arg6 == 2) {
                if (var16.field831) {
                    this.field46[arg7][arg3 + 1][arg4] = 50;
                    this.field46[arg7][arg3 + 1][arg4 + 1] = 50;
                }
                if (var16.field821) {
                    this.field53[arg7][arg3 + 1][arg4] |= 0x249;
                }
            } else if (arg6 == 3) {
                if (var16.field831) {
                    this.field46[arg7][arg3][arg4] = 50;
                    this.field46[arg7][arg3 + 1][arg4] = 50;
                }
                if (var16.field821) {
                    this.field53[arg7][arg3][arg4] |= 0x492;
                }
            }
            if (var16.field816 && arg9 != null) {
                arg9.method295(arg6, 2, arg4, arg3, var16.field817, arg0);
            }
            if (var16.field822 != -1) {
                arg2.method224(new LocEntity(arg1, arg4, arg7, SeqType.field1026[var16.field822], arg3, 0, (byte) -50, true));
            }
        } else if (arg0 == 1) {
            Model var22 = var16.method277(1, arg6, var11, var12, var13, var14, -1);
            arg5.method58((byte) 6, var17, 0, null, var18, field55[arg6], arg4, var22, var15, arg7, arg3);
            if (var16.field831) {
                if (arg6 == 0) {
                    this.field46[arg7][arg3][arg4 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field46[arg7][arg3 + 1][arg4 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field46[arg7][arg3 + 1][arg4] = 50;
                } else if (arg6 == 3) {
                    this.field46[arg7][arg3][arg4] = 50;
                }
            }
            if (var16.field816 && arg9 != null) {
                arg9.method295(arg6, 2, arg4, arg3, var16.field817, arg0);
            }
            if (var16.field822 != -1) {
                arg2.method224(new LocEntity(arg1, arg4, arg7, SeqType.field1026[var16.field822], arg3, 0, (byte) -50, true));
            }
        } else if (arg0 == 2) {
            int var23 = arg6 + 1 & 0x3;
            Model var24 = var16.method277(2, arg6 + 4, var11, var12, var13, var14, -1);
            Model var25 = var16.method277(2, var23, var11, var12, var13, var14, -1);
            arg5.method58((byte) 6, var17, field54[var23], var25, var18, field54[arg6], arg4, var24, var15, arg7, arg3);
            if (var16.field821) {
                if (arg6 == 0) {
                    this.field53[arg7][arg3][arg4] |= 0x249;
                    this.field53[arg7][arg3][arg4 + 1] |= 0x492;
                } else if (arg6 == 1) {
                    this.field53[arg7][arg3][arg4 + 1] |= 0x492;
                    this.field53[arg7][arg3 + 1][arg4] |= 0x249;
                } else if (arg6 == 2) {
                    this.field53[arg7][arg3 + 1][arg4] |= 0x249;
                    this.field53[arg7][arg3][arg4] |= 0x492;
                } else if (arg6 == 3) {
                    this.field53[arg7][arg3][arg4] |= 0x492;
                    this.field53[arg7][arg3][arg4] |= 0x249;
                }
            }
            if (var16.field816 && arg9 != null) {
                arg9.method295(arg6, 2, arg4, arg3, var16.field817, arg0);
            }
            if (var16.field822 != -1) {
                arg2.method224(new LocEntity(arg1, arg4, arg7, SeqType.field1026[var16.field822], arg3, 0, (byte) -50, true));
            }
        } else if (arg0 == 3) {
            Model var26 = var16.method277(3, arg6, var11, var12, var13, var14, -1);
            arg5.method58((byte) 6, var17, 0, null, var18, field55[arg6], arg4, var26, var15, arg7, arg3);
            if (var16.field831) {
                if (arg6 == 0) {
                    this.field46[arg7][arg3][arg4 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field46[arg7][arg3 + 1][arg4 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field46[arg7][arg3 + 1][arg4] = 50;
                } else if (arg6 == 3) {
                    this.field46[arg7][arg3][arg4] = 50;
                }
            }
            if (var16.field816 && arg9 != null) {
                arg9.method295(arg6, 2, arg4, arg3, var16.field817, arg0);
            }
            if (var16.field822 != -1) {
                arg2.method224(new LocEntity(arg1, arg4, arg7, SeqType.field1026[var16.field822], arg3, 0, (byte) -50, true));
            }
        } else if (arg0 == 9) {
            Model var27 = var16.method277(arg0, arg6, var11, var12, var13, var14, -1);
            arg5.method60(var18, arg4, 0, 1, var15, (byte) 6, 1, arg3, var17, var27, null, arg7);
            if (var16.field816 && arg9 != null) {
                arg9.method296(arg4, var16.field814, var16.field817, arg3, field33, var16.field815, arg6);
            }
            if (var16.field822 != -1) {
                arg2.method224(new LocEntity(arg1, arg4, arg7, SeqType.field1026[var16.field822], arg3, 2, (byte) -50, true));
            }
        } else if (arg0 == 4) {
            Model var28 = var16.method277(4, 0, var11, var12, var13, var14, -1);
            arg5.method59(0, var18, field54[arg6], arg6 * 512, var28, var15, arg4, arg3, 0, arg7, var17, 9);
            if (var16.field822 != -1) {
                arg2.method224(new LocEntity(arg1, arg4, arg7, SeqType.field1026[var16.field822], arg3, 1, (byte) -50, true));
            }
        } else if (arg0 == 5) {
            int var29 = 16;
            int var30 = arg5.method76(arg7, arg3, arg4);
            if (var30 > 0) {
                var29 = LocType.method274(var30 >> 14 & 0x7FFF).field823;
            }
            Model var31 = var16.method277(4, 0, var11, var12, var13, var14, -1);
            arg5.method59(field56[arg6] * var29, var18, field54[arg6], arg6 * 512, var31, var15, arg4, arg3, field57[arg6] * var29, arg7, var17, 9);
            if (var16.field822 != -1) {
                arg2.method224(new LocEntity(arg1, arg4, arg7, SeqType.field1026[var16.field822], arg3, 1, (byte) -50, true));
            }
        } else if (arg0 == 6) {
            Model var32 = var16.method277(4, 0, var11, var12, var13, var14, -1);
            arg5.method59(0, var18, 256, arg6, var32, var15, arg4, arg3, 0, arg7, var17, 9);
            if (var16.field822 != -1) {
                arg2.method224(new LocEntity(arg1, arg4, arg7, SeqType.field1026[var16.field822], arg3, 1, (byte) -50, true));
            }
        } else if (arg0 == 7) {
            Model var33 = var16.method277(4, 0, var11, var12, var13, var14, -1);
            arg5.method59(0, var18, 512, arg6, var33, var15, arg4, arg3, 0, arg7, var17, 9);
            if (var16.field822 != -1) {
                arg2.method224(new LocEntity(arg1, arg4, arg7, SeqType.field1026[var16.field822], arg3, 1, (byte) -50, true));
            }
        } else if (arg0 == 8) {
            Model var34 = var16.method277(4, 0, var11, var12, var13, var14, -1);
            arg5.method59(0, var18, 768, arg6, var34, var15, arg4, arg3, 0, arg7, var17, 9);
            if (var16.field822 != -1) {
                arg2.method224(new LocEntity(arg1, arg4, arg7, SeqType.field1026[var16.field822], arg3, 1, (byte) -50, true));
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;[Lec;Z)V")
    public final void method18(World3D arg0, CollisionMap[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var104 = 0; var104 < 104; var104++) {
                for (int var105 = 0; var105 < 104; var105++) {
                    if ((this.field41[var4][var104][var105] & 0x1) == 1) {
                        int var106 = var4;
                        if ((this.field41[1][var104][var105] & 0x2) == 2) {
                            var106 = var4 - 1;
                        }
                        if (var106 >= 0) {
                            arg1[var106].method297(var105, true, var104);
                        }
                    }
                }
            }
        }
        if (!arg2) {
            field30 = 235;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field46[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field39 - 1; var56++) {
                for (int var95 = 1; var95 < this.field38 - 1; var95++) {
                    int var96 = this.field40[var5][var95 + 1][var56] - this.field40[var5][var95 - 1][var56];
                    int var97 = this.field40[var5][var95][var56 + 1] - this.field40[var5][var95][var56 - 1];
                    int var98 = (int) Math.sqrt((double) (var97 * var97 + var96 * var96 + 65536));
                    int var99 = (var96 << 8) / var98;
                    int var100 = 65536 / var98;
                    int var101 = (var97 << 8) / var98;
                    int var102 = (var53 * var101 + var51 * var99 + var52 * var100) / var55 + var49;
                    int var103 = (var48[var95][var56] >> 1) + (var48[var95][var56 + 1] >> 3) + (var48[var95][var56 - 1] >> 2) + (var48[var95 - 1][var56] >> 2) + (var48[var95 + 1][var56] >> 3);
                    this.field47[var95][var56] = var102 - var103;
                }
            }
            for (int var57 = 0; var57 < this.field39; var57++) {
                this.field48[var57] = 0;
                this.field49[var57] = 0;
                this.field50[var57] = 0;
                this.field51[var57] = 0;
                this.field52[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field38 + 5; var58++) {
                for (int var61 = 0; var61 < this.field39; var61++) {
                    int var89 = var58 + 5;
                    int var10002;
                    if (var89 >= 0 && var89 < this.field38) {
                        int var90 = this.field42[var5][var89][var61] & 0xFF;
                        if (var90 > 0) {
                            FloType var91 = FloType.field931[var90 - 1];
                            this.field48[var61] += var91.field940;
                            this.field49[var61] += var91.field938;
                            this.field50[var61] += var91.field939;
                            this.field51[var61] += var91.field941;
                            var10002 = this.field52[var61]++;
                        }
                    }
                    int var92 = var58 - 5;
                    if (var92 >= 0 && var92 < this.field38) {
                        int var93 = this.field42[var5][var92][var61] & 0xFF;
                        if (var93 > 0) {
                            FloType var94 = FloType.field931[var93 - 1];
                            this.field48[var61] -= var94.field940;
                            this.field49[var61] -= var94.field938;
                            this.field50[var61] -= var94.field939;
                            this.field51[var61] -= var94.field941;
                            var10002 = this.field52[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field38 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field39 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field39) {
                            var62 += this.field48[var68];
                            var63 += this.field49[var68];
                            var64 += this.field50[var68];
                            var65 += this.field51[var68];
                            var66 += this.field52[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field39) {
                            var62 -= this.field48[var69];
                            var63 -= this.field49[var69];
                            var64 -= this.field50[var69];
                            var65 -= this.field51[var69];
                            var66 -= this.field52[var69];
                        }
                        if (var67 >= 1 && var67 < this.field39 - 1 && (!field35 || (this.field41[var5][var58][var67] & 0x10) == 0 && this.method19(928, var5, var58, var67) == field36)) {
                            int var70 = this.field42[var5][var58][var67] & 0xFF;
                            int var71 = this.field43[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field40[var5][var58][var67];
                                int var73 = this.field40[var5][var58 + 1][var67];
                                int var74 = this.field40[var5][var58 + 1][var67 + 1];
                                int var75 = this.field40[var5][var58][var67 + 1];
                                int var76 = this.field47[var58][var67];
                                int var77 = this.field47[var58 + 1][var67];
                                int var78 = this.field47[var58 + 1][var67 + 1];
                                int var79 = this.field47[var58][var67 + 1];
                                int var80 = -1;
                                if (var70 > 0) {
                                    var80 = this.method27(var62 * 256 / var65, var63 / var66, var64 / var66);
                                }
                                if (var5 > 0) {
                                    boolean var81 = true;
                                    if (var70 == 0 && this.field44[var5][var58][var67] != 0) {
                                        var81 = false;
                                    }
                                    if (var71 > 0 && !FloType.field931[var71 - 1].field935) {
                                        var81 = false;
                                    }
                                    if (var81 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field53[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var82 = 0;
                                if (var80 != -1) {
                                    var82 = Pix3D.field570[method25(var80, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method55(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method25(var80, var76), method25(var80, var77), method25(var80, var78), method25(var80, var79), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = this.field44[var5][var58][var67] + 1;
                                    byte var84 = this.field45[var5][var58][var67];
                                    FloType var85 = FloType.field931[var71 - 1];
                                    int var86 = var85.field933;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = Pix3D.method158(true, var86);
                                        var88 = -1;
                                    } else if (var85.field932 == 16711935) {
                                        var87 = 0;
                                        var88 = -2;
                                        var86 = -1;
                                    } else {
                                        var88 = this.method27(var85.field937, var85.field938, var85.field939);
                                        var87 = Pix3D.field570[this.method26(var88, 96)];
                                    }
                                    arg0.method55(var5, var58, var67, var83, var84, var86, var72, var73, var74, var75, method25(var80, var76), method25(var80, var77), method25(var80, var78), method25(var80, var79), this.method26(var88, var76), this.method26(var88, var77), this.method26(var88, var78), this.method26(var88, var79), var82, var87);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field39 - 1; var59++) {
                for (int var60 = 1; var60 < this.field38 - 1; var60++) {
                    arg0.method54(var5, var60, var59, this.method19(928, var5, var60, var59));
                }
            }
        }
        if (!field37) {
            arg0.method81(768, 64, false, -10, -50, -50);
        }
        for (int var6 = 0; var6 < this.field38; var6++) {
            for (int var47 = 0; var47 < this.field39; var47++) {
                if ((this.field41[1][var6][var47] & 0x2) == 2) {
                    arg0.method52(var6, true, var47);
                }
            }
        }
        if (field37) {
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
                for (int var12 = 0; var12 <= this.field39; var12++) {
                    for (int var13 = 0; var13 <= this.field38; var13++) {
                        if ((this.field53[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field53[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field39 && (this.field53[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label311: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field53[var16 - 1][var13][var18] & var7) == 0) {
                                        break label311;
                                    }
                                }
                                var16--;
                            }
                            label300: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field53[var17 + 1][var13][var19] & var7) == 0) {
                                        break label300;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field40[var17][var13][var14] - var21;
                                int var23 = this.field40[var16][var13][var14];
                                World3D.method53(var15 * 128 + 128, var10, this.field32, var13 * 128, var22, var14 * 128, 1, var23, var13 * 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field53[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field53[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field53[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field38 && (this.field53[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label364: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field53[var28 - 1][var30][var12] & var8) == 0) {
                                        break label364;
                                    }
                                }
                                var28--;
                            }
                            label353: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field53[var29 + 1][var31][var12] & var8) == 0) {
                                        break label353;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field40[var29][var26][var12] - var33;
                                int var35 = this.field40[var28][var26][var12];
                                World3D.method53(var12 * 128, var10, this.field32, var26 * 128, var34, var12 * 128, 2, var35, var27 * 128 + 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field53[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field53[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field53[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field39 && (this.field53[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label417: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field53[var11][var38 - 1][var42] & var9) == 0) {
                                        break label417;
                                    }
                                }
                                var38--;
                            }
                            label406: while (var39 < this.field38) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field53[var11][var39 + 1][var43] & var9) == 0) {
                                        break label406;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field40[var11][var38][var40];
                                World3D.method53(var41 * 128 + 128, var10, this.field32, var38 * 128, var44, var40 * 128, 4, var44, var39 * 128 + 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field53[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIII)I")
    public int method19(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 23 / arg0;
        if ((this.field41[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (this.field41[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
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
        int var4 = 65536 - Pix3D.field559[arg2 * 1024 / arg3] >> 1;
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;ILec;I[[[IIILob;BIII)V")
    public static final void method28(World3D arg0, int arg1, CollisionMap arg2, int arg3, int[][][] arg4, int arg5, int arg6, LinkList arg7, byte arg8, int arg9, int arg10, int arg11) {
        int var12 = arg4[arg9][arg3][arg5];
        int var13 = arg4[arg9][arg3 + 1][arg5];
        int var14 = arg4[arg9][arg3 + 1][arg5 + 1];
        int var15 = arg4[arg9][arg3][arg5 + 1];
        if (arg8 == 8) {
            boolean var16 = false;
        } else {
            field30 = 102;
        }
        int var17 = var12 + var13 + var14 + var15 >> 2;
        LocType var18 = LocType.method274(arg1);
        int var19 = (arg1 << 14) + (arg5 << 7) + arg3 + 1073741824;
        if (!var18.field818) {
            var19 += Integer.MIN_VALUE;
        }
        byte var20 = (byte) ((arg11 << 6) + arg10);
        if (arg10 == 22) {
            Model var21 = var18.method277(22, arg11, var12, var13, var14, var15, -1);
            arg0.method56(var17, var19, arg5, false, var20, arg3, var21, arg6);
            if (var18.field816 && var18.field818) {
                arg2.method297(arg5, true, arg3);
            }
            if (var18.field822 != -1) {
                arg7.method224(new LocEntity(arg1, arg5, arg6, SeqType.field1026[var18.field822], arg3, 3, (byte) -50, true));
            }
        } else if (arg10 == 10 || arg10 == 11) {
            Model var37 = var18.method277(10, arg11, var12, var13, var14, var15, -1);
            if (var37 != null) {
                int var38 = 0;
                if (arg10 == 11) {
                    var38 += 256;
                }
                int var39;
                int var40;
                if (arg11 == 1 || arg11 == 3) {
                    var39 = var18.field815;
                    var40 = var18.field814;
                } else {
                    var39 = var18.field814;
                    var40 = var18.field815;
                }
                arg0.method60(var20, arg5, var38, var39, var17, (byte) 6, var40, arg3, var19, var37, null, arg6);
            }
            if (var18.field816) {
                arg2.method296(arg5, var18.field814, var18.field817, arg3, field33, var18.field815, arg11);
            }
            if (var18.field822 != -1) {
                arg7.method224(new LocEntity(arg1, arg5, arg6, SeqType.field1026[var18.field822], arg3, 2, (byte) -50, true));
            }
        } else if (arg10 >= 12) {
            Model var22 = var18.method277(arg10, arg11, var12, var13, var14, var15, -1);
            arg0.method60(var20, arg5, 0, 1, var17, (byte) 6, 1, arg3, var19, var22, null, arg6);
            if (var18.field816) {
                arg2.method296(arg5, var18.field814, var18.field817, arg3, field33, var18.field815, arg11);
            }
            if (var18.field822 != -1) {
                arg7.method224(new LocEntity(arg1, arg5, arg6, SeqType.field1026[var18.field822], arg3, 2, (byte) -50, true));
            }
        } else if (arg10 == 0) {
            Model var23 = var18.method277(0, arg11, var12, var13, var14, var15, -1);
            arg0.method58((byte) 6, var19, 0, null, var20, field54[arg11], arg5, var23, var17, arg6, arg3);
            if (var18.field816) {
                arg2.method295(arg11, 2, arg5, arg3, var18.field817, arg10);
            }
            if (var18.field822 != -1) {
                arg7.method224(new LocEntity(arg1, arg5, arg6, SeqType.field1026[var18.field822], arg3, 0, (byte) -50, true));
            }
        } else if (arg10 == 1) {
            Model var24 = var18.method277(1, arg11, var12, var13, var14, var15, -1);
            arg0.method58((byte) 6, var19, 0, null, var20, field55[arg11], arg5, var24, var17, arg6, arg3);
            if (var18.field816) {
                arg2.method295(arg11, 2, arg5, arg3, var18.field817, arg10);
            }
            if (var18.field822 != -1) {
                arg7.method224(new LocEntity(arg1, arg5, arg6, SeqType.field1026[var18.field822], arg3, 0, (byte) -50, true));
            }
        } else if (arg10 == 2) {
            int var25 = arg11 + 1 & 0x3;
            Model var26 = var18.method277(2, arg11 + 4, var12, var13, var14, var15, -1);
            Model var27 = var18.method277(2, var25, var12, var13, var14, var15, -1);
            arg0.method58((byte) 6, var19, field54[var25], var27, var20, field54[arg11], arg5, var26, var17, arg6, arg3);
            if (var18.field816) {
                arg2.method295(arg11, 2, arg5, arg3, var18.field817, arg10);
            }
            if (var18.field822 != -1) {
                arg7.method224(new LocEntity(arg1, arg5, arg6, SeqType.field1026[var18.field822], arg3, 0, (byte) -50, true));
            }
        } else if (arg10 == 3) {
            Model var28 = var18.method277(3, arg11, var12, var13, var14, var15, -1);
            arg0.method58((byte) 6, var19, 0, null, var20, field55[arg11], arg5, var28, var17, arg6, arg3);
            if (var18.field816) {
                arg2.method295(arg11, 2, arg5, arg3, var18.field817, arg10);
            }
            if (var18.field822 != -1) {
                arg7.method224(new LocEntity(arg1, arg5, arg6, SeqType.field1026[var18.field822], arg3, 0, (byte) -50, true));
            }
        } else if (arg10 == 9) {
            Model var29 = var18.method277(arg10, arg11, var12, var13, var14, var15, -1);
            arg0.method60(var20, arg5, 0, 1, var17, (byte) 6, 1, arg3, var19, var29, null, arg6);
            if (var18.field816) {
                arg2.method296(arg5, var18.field814, var18.field817, arg3, field33, var18.field815, arg11);
            }
            if (var18.field822 != -1) {
                arg7.method224(new LocEntity(arg1, arg5, arg6, SeqType.field1026[var18.field822], arg3, 2, (byte) -50, true));
            }
        } else if (arg10 == 4) {
            Model var30 = var18.method277(4, 0, var12, var13, var14, var15, -1);
            arg0.method59(0, var20, field54[arg11], arg11 * 512, var30, var17, arg5, arg3, 0, arg6, var19, 9);
            if (var18.field822 != -1) {
                arg7.method224(new LocEntity(arg1, arg5, arg6, SeqType.field1026[var18.field822], arg3, 1, (byte) -50, true));
            }
        } else if (arg10 == 5) {
            int var31 = 16;
            int var32 = arg0.method76(arg6, arg3, arg5);
            if (var32 > 0) {
                var31 = LocType.method274(var32 >> 14 & 0x7FFF).field823;
            }
            Model var33 = var18.method277(4, 0, var12, var13, var14, var15, -1);
            arg0.method59(field56[arg11] * var31, var20, field54[arg11], arg11 * 512, var33, var17, arg5, arg3, field57[arg11] * var31, arg6, var19, 9);
            if (var18.field822 != -1) {
                arg7.method224(new LocEntity(arg1, arg5, arg6, SeqType.field1026[var18.field822], arg3, 1, (byte) -50, true));
            }
        } else if (arg10 == 6) {
            Model var34 = var18.method277(4, 0, var12, var13, var14, var15, -1);
            arg0.method59(0, var20, 256, arg11, var34, var17, arg5, arg3, 0, arg6, var19, 9);
            if (var18.field822 != -1) {
                arg7.method224(new LocEntity(arg1, arg5, arg6, SeqType.field1026[var18.field822], arg3, 1, (byte) -50, true));
            }
        } else if (arg10 == 7) {
            Model var35 = var18.method277(4, 0, var12, var13, var14, var15, -1);
            arg0.method59(0, var20, 512, arg11, var35, var17, arg5, arg3, 0, arg6, var19, 9);
            if (var18.field822 != -1) {
                arg7.method224(new LocEntity(arg1, arg5, arg6, SeqType.field1026[var18.field822], arg3, 1, (byte) -50, true));
            }
        } else if (arg10 == 8) {
            Model var36 = var18.method277(4, 0, var12, var13, var14, var15, -1);
            arg0.method59(0, var20, 768, arg11, var36, var17, arg5, arg3, 0, arg6, var19, 9);
            if (var18.field822 != -1) {
                arg7.method224(new LocEntity(arg1, arg5, arg6, SeqType.field1026[var18.field822], arg3, 1, (byte) -50, true));
            }
        }
    }
}
