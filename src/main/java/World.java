import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "b", descriptor = "Z")
    private boolean field34 = true;

    @OriginalMember(owner = "c", name = "c", descriptor = "I")
    private int field35 = 8;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "c", name = "h", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "c", name = "i", descriptor = "[[[I")
    private int[][][] field41;

    @OriginalMember(owner = "c", name = "j", descriptor = "[[[B")
    private byte[][][] field42;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[B")
    private byte[][][] field43;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field44;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field45;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field46;

    @OriginalMember(owner = "c", name = "v", descriptor = "[[[I")
    private int[][][] field54;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field47;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[I")
    private int[][] field48;

    @OriginalMember(owner = "c", name = "q", descriptor = "[I")
    private int[] field49;

    @OriginalMember(owner = "c", name = "r", descriptor = "[I")
    private int[] field50;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field51;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field52;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field53;

    @OriginalMember(owner = "c", name = "a", descriptor = "Z")
    private static boolean field33 = true;

    @OriginalMember(owner = "c", name = "d", descriptor = "Z")
    public static boolean field36 = true;

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private static final int[] field55 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private static final int[] field56 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field57 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field58 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "A", descriptor = "I")
    private static int field59 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "c", name = "B", descriptor = "I")
    private static int field60 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "c", name = "e", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "c", name = "f", descriptor = "Z")
    public static boolean field38;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "(I[[[BI[[[II)V")
    public World(int arg0, byte[][][] arg1, int arg2, int[][][] arg3, int arg4) {
        this.field39 = arg2;
        this.field40 = arg0;
        this.field41 = arg3;
        this.field42 = arg1;
        this.field43 = new byte[4][this.field39][this.field40];
        this.field44 = new byte[4][this.field39][this.field40];
        this.field45 = new byte[4][this.field39][this.field40];
        this.field46 = new byte[4][this.field39][this.field40];
        this.field54 = new int[4][this.field39 + 1][this.field40 + 1];
        this.field47 = new byte[4][this.field39 + 1][this.field40 + 1];
        this.field48 = new int[this.field39 + 1][this.field40 + 1];
        this.field49 = new int[this.field40];
        this.field50 = new int[this.field40];
        if (arg4 != -35388) {
            this.field35 = 28;
        }
        this.field51 = new int[this.field40];
        this.field52 = new int[this.field40];
        this.field53 = new int[this.field40];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIII)V")
    public final void method14(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 0;
        if (arg2 != 3) {
            this.field35 = 123;
        }
        for (int var7 = 0; var7 < FloType.field933; var7++) {
            if (FloType.field934[var7].field939.equalsIgnoreCase("water")) {
                var6 = (byte) (var7 + 1);
                break;
            }
        }
        for (int var8 = arg1; var8 < arg1 + arg4; var8++) {
            for (int var9 = arg0; var9 < arg0 + arg3; var9++) {
                if (var9 >= 0 && var9 < this.field39 && var8 >= 0 && var8 < this.field40) {
                    this.field44[0][var9][var8] = var6;
                    for (int var10 = 0; var10 < 4; var10++) {
                        this.field41[var10][var9][var8] = 0;
                        this.field42[var10][var9][var8] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([BIIIII)V")
    public final void method15(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Packet var7 = new Packet(363, arg0);
        if (arg2 != 1) {
            this.field34 = !this.field34;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg4 + var9;
                    int var12 = arg3 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field42[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method216();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field41[0][var11][var12] = -method20(var11 + arg1 + 932731, var12 + 556238 + arg5) * 8;
                                } else {
                                    this.field41[var8][var11][var12] = this.field41[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method216();
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
                                this.field44[var8][var11][var12] = var7.method217();
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
                            int var15 = var7.method216();
                            if (var15 == 0) {
                                break;
                            }
                            if (var15 == 1) {
                                var7.method216();
                                break;
                            }
                            if (var15 <= 49) {
                                var7.method216();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([BLr;[Lec;Lob;ZII)V")
    public final void method16(byte[] arg0, World3D arg1, CollisionMap[] arg2, LinkList arg3, boolean arg4, int arg5, int arg6) {
        Packet var8 = new Packet(363, arg0);
        if (!arg4) {
            this.field34 = !this.field34;
        }
        int var9 = -1;
        while (true) {
            int var10 = var8.method230();
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method230();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var8.method216();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg6 + var14;
                int var20 = arg5 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field42[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    CollisionMap var22 = null;
                    if (var21 >= 0) {
                        var22 = arg2[var21];
                    }
                    this.method17(var22, true, var15, var20, var18, var17, arg1, arg3, var9, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lec;ZIIIILr;Lob;II)V")
    private final void method17(CollisionMap arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, World3D arg6, LinkList arg7, int arg8, int arg9) {
        if (!arg1) {
            return;
        }
        if (field36) {
            if ((this.field42[arg2][arg9][arg3] & 0x10) != 0) {
                return;
            }
            if (this.method19(arg2, (byte) 10, arg9, arg3) != field37) {
                return;
            }
        }
        int var11 = this.field41[arg2][arg9][arg3];
        int var12 = this.field41[arg2][arg9 + 1][arg3];
        int var13 = this.field41[arg2][arg9 + 1][arg3 + 1];
        int var14 = this.field41[arg2][arg9][arg3 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method282(arg8);
        int var17 = (arg8 << 14) + (arg3 << 7) + arg9 + 1073741824;
        if (!var16.field818) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg4 << 6) + arg5);
        if (arg5 == 22) {
            if (!field36 || var16.field818 || var16.field839) {
                Model var19 = var16.method285(22, arg4, var11, var12, var13, var14, -1);
                arg6.method57(var19, (byte) 6, arg9, var17, arg3, arg2, var18, var15);
                if (var16.field816 && var16.field818 && arg0 != null) {
                    arg0.method305((byte) 12, arg3, arg9);
                }
                if (var16.field822 != -1) {
                    arg7.method232(new LocEntity(true, arg8, arg2, 0, 3, SeqType.field1028[var16.field822], arg3, arg9));
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            Model var35 = var16.method285(10, arg4, var11, var12, var13, var14, -1);
            if (var35 != null) {
                int var36 = 0;
                if (arg5 == 11) {
                    var36 += 256;
                }
                int var37;
                int var38;
                if (arg4 == 1 || arg4 == 3) {
                    var37 = var16.field815;
                    var38 = var16.field814;
                } else {
                    var37 = var16.field814;
                    var38 = var16.field815;
                }
                if (arg6.method61(var15, 775, arg2, null, var17, arg3, arg9, var37, var18, var35, var36, var38) && var16.field831) {
                    for (int var39 = 0; var39 <= var37; var39++) {
                        for (int var40 = 0; var40 <= var38; var40++) {
                            int var41 = var35.field471 / 4;
                            if (var41 > 30) {
                                var41 = 30;
                            }
                            if (var41 > this.field47[arg2][arg9 + var39][arg3 + var40]) {
                                this.field47[arg2][arg9 + var39][arg3 + var40] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var16.field816 && arg0 != null) {
                arg0.method304(arg4, var16.field815, var16.field814, arg9, 9, arg3, var16.field817);
            }
            if (var16.field822 != -1) {
                arg7.method232(new LocEntity(true, arg8, arg2, 0, 2, SeqType.field1028[var16.field822], arg3, arg9));
            }
        } else if (arg5 >= 12) {
            Model var20 = var16.method285(arg5, arg4, var11, var12, var13, var14, -1);
            arg6.method61(var15, 775, arg2, null, var17, arg3, arg9, 1, var18, var20, 0, 1);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg2 > 0) {
                this.field54[arg2][arg9][arg3] |= 0x924;
            }
            if (var16.field816 && arg0 != null) {
                arg0.method304(arg4, var16.field815, var16.field814, arg9, 9, arg3, var16.field817);
            }
            if (var16.field822 != -1) {
                arg7.method232(new LocEntity(true, arg8, arg2, 0, 2, SeqType.field1028[var16.field822], arg3, arg9));
            }
        } else if (arg5 == 0) {
            Model var21 = var16.method285(0, arg4, var11, var12, var13, var14, -1);
            arg6.method59(0, var15, arg2, field55[arg4], 8, var21, null, arg9, var17, arg3, var18);
            if (arg4 == 0) {
                if (var16.field831) {
                    this.field47[arg2][arg9][arg3] = 50;
                    this.field47[arg2][arg9][arg3 + 1] = 50;
                }
                if (var16.field821) {
                    this.field54[arg2][arg9][arg3] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var16.field831) {
                    this.field47[arg2][arg9][arg3 + 1] = 50;
                    this.field47[arg2][arg9 + 1][arg3 + 1] = 50;
                }
                if (var16.field821) {
                    this.field54[arg2][arg9][arg3 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var16.field831) {
                    this.field47[arg2][arg9 + 1][arg3] = 50;
                    this.field47[arg2][arg9 + 1][arg3 + 1] = 50;
                }
                if (var16.field821) {
                    this.field54[arg2][arg9 + 1][arg3] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var16.field831) {
                    this.field47[arg2][arg9][arg3] = 50;
                    this.field47[arg2][arg9 + 1][arg3] = 50;
                }
                if (var16.field821) {
                    this.field54[arg2][arg9][arg3] |= 0x492;
                }
            }
            if (var16.field816 && arg0 != null) {
                arg0.method303(true, arg4, arg3, arg9, var16.field817, arg5);
            }
            if (var16.field822 != -1) {
                arg7.method232(new LocEntity(true, arg8, arg2, 0, 0, SeqType.field1028[var16.field822], arg3, arg9));
            }
            if (var16.field823 != 16) {
                arg6.method68(arg2, arg3, arg9, var16.field823, (byte) 6);
            }
        } else if (arg5 == 1) {
            Model var22 = var16.method285(1, arg4, var11, var12, var13, var14, -1);
            arg6.method59(0, var15, arg2, field56[arg4], 8, var22, null, arg9, var17, arg3, var18);
            if (var16.field831) {
                if (arg4 == 0) {
                    this.field47[arg2][arg9][arg3 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field47[arg2][arg9 + 1][arg3 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field47[arg2][arg9 + 1][arg3] = 50;
                } else if (arg4 == 3) {
                    this.field47[arg2][arg9][arg3] = 50;
                }
            }
            if (var16.field816 && arg0 != null) {
                arg0.method303(true, arg4, arg3, arg9, var16.field817, arg5);
            }
            if (var16.field822 != -1) {
                arg7.method232(new LocEntity(true, arg8, arg2, 0, 0, SeqType.field1028[var16.field822], arg3, arg9));
            }
        } else if (arg5 == 2) {
            int var23 = arg4 + 1 & 0x3;
            Model var24 = var16.method285(2, arg4 + 4, var11, var12, var13, var14, -1);
            Model var25 = var16.method285(2, var23, var11, var12, var13, var14, -1);
            arg6.method59(field55[var23], var15, arg2, field55[arg4], 8, var24, var25, arg9, var17, arg3, var18);
            if (var16.field821) {
                if (arg4 == 0) {
                    this.field54[arg2][arg9][arg3] |= 0x249;
                    this.field54[arg2][arg9][arg3 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    this.field54[arg2][arg9][arg3 + 1] |= 0x492;
                    this.field54[arg2][arg9 + 1][arg3] |= 0x249;
                } else if (arg4 == 2) {
                    this.field54[arg2][arg9 + 1][arg3] |= 0x249;
                    this.field54[arg2][arg9][arg3] |= 0x492;
                } else if (arg4 == 3) {
                    this.field54[arg2][arg9][arg3] |= 0x492;
                    this.field54[arg2][arg9][arg3] |= 0x249;
                }
            }
            if (var16.field816 && arg0 != null) {
                arg0.method303(true, arg4, arg3, arg9, var16.field817, arg5);
            }
            if (var16.field822 != -1) {
                arg7.method232(new LocEntity(true, arg8, arg2, 0, 0, SeqType.field1028[var16.field822], arg3, arg9));
            }
            if (var16.field823 != 16) {
                arg6.method68(arg2, arg3, arg9, var16.field823, (byte) 6);
            }
        } else if (arg5 == 3) {
            Model var26 = var16.method285(3, arg4, var11, var12, var13, var14, -1);
            arg6.method59(0, var15, arg2, field56[arg4], 8, var26, null, arg9, var17, arg3, var18);
            if (var16.field831) {
                if (arg4 == 0) {
                    this.field47[arg2][arg9][arg3 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field47[arg2][arg9 + 1][arg3 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field47[arg2][arg9 + 1][arg3] = 50;
                } else if (arg4 == 3) {
                    this.field47[arg2][arg9][arg3] = 50;
                }
            }
            if (var16.field816 && arg0 != null) {
                arg0.method303(true, arg4, arg3, arg9, var16.field817, arg5);
            }
            if (var16.field822 != -1) {
                arg7.method232(new LocEntity(true, arg8, arg2, 0, 0, SeqType.field1028[var16.field822], arg3, arg9));
            }
        } else if (arg5 == 9) {
            Model var27 = var16.method285(arg5, arg4, var11, var12, var13, var14, -1);
            arg6.method61(var15, 775, arg2, null, var17, arg3, arg9, 1, var18, var27, 0, 1);
            if (var16.field816 && arg0 != null) {
                arg0.method304(arg4, var16.field815, var16.field814, arg9, 9, arg3, var16.field817);
            }
            if (var16.field822 != -1) {
                arg7.method232(new LocEntity(true, arg8, arg2, 0, 2, SeqType.field1028[var16.field822], arg3, arg9));
            }
        } else if (arg5 == 4) {
            Model var28 = var16.method285(4, 0, var11, var12, var13, var14, -1);
            arg6.method60(var15, arg3, 0, var17, arg4 * 512, field55[arg4], 465, 0, arg9, var28, var18, arg2);
            if (var16.field822 != -1) {
                arg7.method232(new LocEntity(true, arg8, arg2, 0, 1, SeqType.field1028[var16.field822], arg3, arg9));
            }
        } else if (arg5 == 5) {
            int var29 = 16;
            int var30 = arg6.method78(arg2, arg9, arg3);
            if (var30 > 0) {
                var29 = LocType.method282(var30 >> 14 & 0x7FFF).field823;
            }
            Model var31 = var16.method285(4, 0, var11, var12, var13, var14, -1);
            arg6.method60(var15, arg3, field58[arg4] * var29, var17, arg4 * 512, field55[arg4], 465, field57[arg4] * var29, arg9, var31, var18, arg2);
            if (var16.field822 != -1) {
                arg7.method232(new LocEntity(true, arg8, arg2, 0, 1, SeqType.field1028[var16.field822], arg3, arg9));
            }
        } else if (arg5 == 6) {
            Model var32 = var16.method285(4, 0, var11, var12, var13, var14, -1);
            arg6.method60(var15, arg3, 0, var17, arg4, 256, 465, 0, arg9, var32, var18, arg2);
            if (var16.field822 != -1) {
                arg7.method232(new LocEntity(true, arg8, arg2, 0, 1, SeqType.field1028[var16.field822], arg3, arg9));
            }
        } else if (arg5 == 7) {
            Model var33 = var16.method285(4, 0, var11, var12, var13, var14, -1);
            arg6.method60(var15, arg3, 0, var17, arg4, 512, 465, 0, arg9, var33, var18, arg2);
            if (var16.field822 != -1) {
                arg7.method232(new LocEntity(true, arg8, arg2, 0, 1, SeqType.field1028[var16.field822], arg3, arg9));
            }
        } else if (arg5 == 8) {
            Model var34 = var16.method285(4, 0, var11, var12, var13, var14, -1);
            arg6.method60(var15, arg3, 0, var17, arg4, 768, 465, 0, arg9, var34, var18, arg2);
            if (var16.field822 != -1) {
                arg7.method232(new LocEntity(true, arg8, arg2, 0, 1, SeqType.field1028[var16.field822], arg3, arg9));
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;I[Lec;)V")
    public final void method18(World3D arg0, int arg1, CollisionMap[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((this.field42[var4][var111][var112] & 0x1) == 1) {
                        int var113 = var4;
                        if ((this.field42[1][var111][var112] & 0x2) == 2) {
                            var113 = var4 - 1;
                        }
                        if (var113 >= 0) {
                            arg2[var113].method305((byte) 12, var112, var111);
                        }
                    }
                }
            }
        }
        field59 += (int) (Math.random() * 5.0D) - 2;
        if (field59 < -8) {
            field59 = -8;
        }
        if (field59 > 8) {
            field59 = 8;
        }
        field60 += (int) (Math.random() * 5.0D) - 2;
        if (field60 < -16) {
            field60 = -16;
        }
        if (field60 > 16) {
            field60 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var49 = this.field47[var5];
            byte var50 = 96;
            short var51 = 768;
            byte var52 = -50;
            byte var53 = -10;
            byte var54 = -50;
            int var55 = (int) Math.sqrt((double) (var54 * var54 + var52 * var52 + var53 * var53));
            int var56 = var51 * var55 >> 8;
            for (int var57 = 1; var57 < this.field40 - 1; var57++) {
                for (int var102 = 1; var102 < this.field39 - 1; var102++) {
                    int var103 = this.field41[var5][var102 + 1][var57] - this.field41[var5][var102 - 1][var57];
                    int var104 = this.field41[var5][var102][var57 + 1] - this.field41[var5][var102][var57 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var54 * var108 + var52 * var106 + var53 * var107) / var56 + var50;
                    int var110 = (var49[var102][var57] >> 1) + (var49[var102][var57 + 1] >> 3) + (var49[var102][var57 - 1] >> 2) + (var49[var102 - 1][var57] >> 2) + (var49[var102 + 1][var57] >> 3);
                    this.field48[var102][var57] = var109 - var110;
                }
            }
            for (int var58 = 0; var58 < this.field40; var58++) {
                this.field49[var58] = 0;
                this.field50[var58] = 0;
                this.field51[var58] = 0;
                this.field52[var58] = 0;
                this.field53[var58] = 0;
            }
            for (int var59 = -5; var59 < this.field39 + 5; var59++) {
                for (int var62 = 0; var62 < this.field40; var62++) {
                    int var96 = var59 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < this.field39) {
                        int var97 = this.field43[var5][var96][var62] & 0xFF;
                        if (var97 > 0) {
                            FloType var98 = FloType.field934[var97 - 1];
                            this.field49[var62] += var98.field943;
                            this.field50[var62] += var98.field941;
                            this.field51[var62] += var98.field942;
                            this.field52[var62] += var98.field944;
                            var10002 = this.field53[var62]++;
                        }
                    }
                    int var99 = var59 - 5;
                    if (var99 >= 0 && var99 < this.field39) {
                        int var100 = this.field43[var5][var99][var62] & 0xFF;
                        if (var100 > 0) {
                            FloType var101 = FloType.field934[var100 - 1];
                            this.field49[var62] -= var101.field943;
                            this.field50[var62] -= var101.field941;
                            this.field51[var62] -= var101.field942;
                            this.field52[var62] -= var101.field944;
                            var10002 = this.field53[var62]--;
                        }
                    }
                }
                if (var59 >= 1 && var59 < this.field39 - 1) {
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    for (int var68 = -5; var68 < this.field40 + 5; var68++) {
                        int var69 = var68 + 5;
                        if (var69 >= 0 && var69 < this.field40) {
                            var63 += this.field49[var69];
                            var64 += this.field50[var69];
                            var65 += this.field51[var69];
                            var66 += this.field52[var69];
                            var67 += this.field53[var69];
                        }
                        int var70 = var68 - 5;
                        if (var70 >= 0 && var70 < this.field40) {
                            var63 -= this.field49[var70];
                            var64 -= this.field50[var70];
                            var65 -= this.field51[var70];
                            var66 -= this.field52[var70];
                            var67 -= this.field53[var70];
                        }
                        if (var68 >= 1 && var68 < this.field40 - 1 && (!field36 || (this.field42[var5][var59][var68] & 0x10) == 0 && this.method19(var5, (byte) 10, var59, var68) == field37)) {
                            int var71 = this.field43[var5][var59][var68] & 0xFF;
                            int var72 = this.field44[var5][var59][var68] & 0xFF;
                            if (var71 > 0 || var72 > 0) {
                                int var73 = this.field41[var5][var59][var68];
                                int var74 = this.field41[var5][var59 + 1][var68];
                                int var75 = this.field41[var5][var59 + 1][var68 + 1];
                                int var76 = this.field41[var5][var59][var68 + 1];
                                int var77 = this.field48[var59][var68];
                                int var78 = this.field48[var59 + 1][var68];
                                int var79 = this.field48[var59 + 1][var68 + 1];
                                int var80 = this.field48[var59][var68 + 1];
                                int var81 = -1;
                                int var82 = -1;
                                if (var71 > 0) {
                                    int var83 = var63 * 256 / var66;
                                    int var84 = var64 / var67;
                                    int var85 = var65 / var67;
                                    var81 = this.method27(var83, var84, var85);
                                    int var86 = field59 + var83 & 0xFF;
                                    int var87 = field60 + var85;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (var87 > 255) {
                                        var87 = 255;
                                    }
                                    var82 = this.method27(var86, var84, var87);
                                }
                                if (var5 > 0) {
                                    boolean var88 = true;
                                    if (var71 == 0 && this.field45[var5][var59][var68] != 0) {
                                        var88 = false;
                                    }
                                    if (var72 > 0 && !FloType.field934[var72 - 1].field938) {
                                        var88 = false;
                                    }
                                    if (var88 && var73 == var74 && var73 == var75 && var73 == var76) {
                                        this.field54[var5][var59][var68] |= 0x924;
                                    }
                                }
                                int var89 = 0;
                                if (var81 != -1) {
                                    var89 = Pix3D.field570[method25(var82, 96)];
                                }
                                if (var72 == 0) {
                                    arg0.method56(var5, var59, var68, 0, 0, -1, var73, var74, var75, var76, method25(var81, var77), method25(var81, var78), method25(var81, var79), method25(var81, var80), 0, 0, 0, 0, var89, 0);
                                } else {
                                    int var90 = this.field45[var5][var59][var68] + 1;
                                    byte var91 = this.field46[var5][var59][var68];
                                    FloType var92 = FloType.field934[var72 - 1];
                                    int var93 = var92.field936;
                                    int var94;
                                    int var95;
                                    if (var93 >= 0) {
                                        var94 = Pix3D.method160(787, var93);
                                        var95 = -1;
                                    } else if (var92.field935 == 16711935) {
                                        var94 = 0;
                                        var95 = -2;
                                        var93 = -1;
                                    } else {
                                        var95 = this.method27(var92.field940, var92.field941, var92.field942);
                                        var94 = Pix3D.field570[this.method26(var92.field945, 96)];
                                    }
                                    arg0.method56(var5, var59, var68, var90, var91, var93, var73, var74, var75, var76, method25(var81, var77), method25(var81, var78), method25(var81, var79), method25(var81, var80), this.method26(var95, var77), this.method26(var95, var78), this.method26(var95, var79), this.method26(var95, var80), var89, var94);
                                }
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; var60 < this.field40 - 1; var60++) {
                for (int var61 = 1; var61 < this.field39 - 1; var61++) {
                    arg0.method55(var5, var61, var60, this.method19(var5, (byte) 10, var61, var60));
                }
            }
        }
        while (arg1 >= 0) {
            for (int var48 = 1; var48 > 0; var48++) {
            }
        }
        if (!field38) {
            arg0.method83(-10, 64, -50, 768, -50, false);
        }
        for (int var6 = 0; var6 < this.field39; var6++) {
            for (int var47 = 0; var47 < this.field40; var47++) {
                if ((this.field42[1][var6][var47] & 0x2) == 2) {
                    arg0.method53(var47, var6, (byte) -41);
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
                            label335: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field54[var16 - 1][var13][var18] & var7) == 0) {
                                        break label335;
                                    }
                                }
                                var16--;
                            }
                            label324: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field54[var17 + 1][var13][var19] & var7) == 0) {
                                        break label324;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field41[var17][var13][var14] - var21;
                                int var23 = this.field41[var16][var13][var14];
                                World3D.method54(var15 * 128 + 128, var13 * 128, -802, var23, 1, var13 * 128, var10, var22, var14 * 128);
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
                            label388: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field54[var28 - 1][var30][var12] & var8) == 0) {
                                        break label388;
                                    }
                                }
                                var28--;
                            }
                            label377: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field54[var29 + 1][var31][var12] & var8) == 0) {
                                        break label377;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field41[var29][var26][var12] - var33;
                                int var35 = this.field41[var28][var26][var12];
                                World3D.method54(var12 * 128, var26 * 128, -802, var35, 2, var27 * 128 + 128, var10, var34, var12 * 128);
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
                            label441: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field54[var11][var38 - 1][var42] & var9) == 0) {
                                        break label441;
                                    }
                                }
                                var38--;
                            }
                            label430: while (var39 < this.field39) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field54[var11][var39 + 1][var43] & var9) == 0) {
                                        break label430;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field41[var11][var38][var40];
                                World3D.method54(var41 * 128 + 128, var38 * 128, -802, var44, 4, var39 * 128 + 128, var10, var44, var40 * 128);
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
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IBII)I")
    public int method19(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 10) {
            this.field35 = 29;
        }
        if ((this.field42[arg0][arg2][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (this.field42[1][arg2][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(ILob;Lec;II[[[IIIIILr;I)V")
    public static final void method28(int arg0, LinkList arg1, CollisionMap arg2, int arg3, int arg4, int[][][] arg5, int arg6, int arg7, int arg8, int arg9, World3D arg10, int arg11) {
        if (arg6 != 0) {
            field33 = !field33;
        }
        int var12 = arg5[arg11][arg0][arg3];
        int var13 = arg5[arg11][arg0 + 1][arg3];
        int var14 = arg5[arg11][arg0 + 1][arg3 + 1];
        int var15 = arg5[arg11][arg0][arg3 + 1];
        int var16 = var12 + var13 + var14 + var15 >> 2;
        LocType var17 = LocType.method282(arg8);
        int var18 = (arg8 << 14) + (arg3 << 7) + arg0 + 1073741824;
        if (!var17.field818) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg4 << 6) + arg9);
        if (arg9 == 22) {
            Model var20 = var17.method285(22, arg4, var12, var13, var14, var15, -1);
            arg10.method57(var20, (byte) 6, arg0, var18, arg3, arg7, var19, var16);
            if (var17.field816 && var17.field818) {
                arg2.method305((byte) 12, arg3, arg0);
            }
            if (var17.field822 != -1) {
                arg1.method232(new LocEntity(true, arg8, arg7, 0, 3, SeqType.field1028[var17.field822], arg3, arg0));
            }
        } else if (arg9 == 10 || arg9 == 11) {
            Model var36 = var17.method285(10, arg4, var12, var13, var14, var15, -1);
            if (var36 != null) {
                int var37 = 0;
                if (arg9 == 11) {
                    var37 += 256;
                }
                int var38;
                int var39;
                if (arg4 == 1 || arg4 == 3) {
                    var38 = var17.field815;
                    var39 = var17.field814;
                } else {
                    var38 = var17.field814;
                    var39 = var17.field815;
                }
                arg10.method61(var16, 775, arg7, null, var18, arg3, arg0, var38, var19, var36, var37, var39);
            }
            if (var17.field816) {
                arg2.method304(arg4, var17.field815, var17.field814, arg0, 9, arg3, var17.field817);
            }
            if (var17.field822 != -1) {
                arg1.method232(new LocEntity(true, arg8, arg7, 0, 2, SeqType.field1028[var17.field822], arg3, arg0));
            }
        } else if (arg9 >= 12) {
            Model var21 = var17.method285(arg9, arg4, var12, var13, var14, var15, -1);
            arg10.method61(var16, 775, arg7, null, var18, arg3, arg0, 1, var19, var21, 0, 1);
            if (var17.field816) {
                arg2.method304(arg4, var17.field815, var17.field814, arg0, 9, arg3, var17.field817);
            }
            if (var17.field822 != -1) {
                arg1.method232(new LocEntity(true, arg8, arg7, 0, 2, SeqType.field1028[var17.field822], arg3, arg0));
            }
        } else if (arg9 == 0) {
            Model var22 = var17.method285(0, arg4, var12, var13, var14, var15, -1);
            arg10.method59(0, var16, arg7, field55[arg4], 8, var22, null, arg0, var18, arg3, var19);
            if (var17.field816) {
                arg2.method303(true, arg4, arg3, arg0, var17.field817, arg9);
            }
            if (var17.field822 != -1) {
                arg1.method232(new LocEntity(true, arg8, arg7, 0, 0, SeqType.field1028[var17.field822], arg3, arg0));
            }
        } else if (arg9 == 1) {
            Model var23 = var17.method285(1, arg4, var12, var13, var14, var15, -1);
            arg10.method59(0, var16, arg7, field56[arg4], 8, var23, null, arg0, var18, arg3, var19);
            if (var17.field816) {
                arg2.method303(true, arg4, arg3, arg0, var17.field817, arg9);
            }
            if (var17.field822 != -1) {
                arg1.method232(new LocEntity(true, arg8, arg7, 0, 0, SeqType.field1028[var17.field822], arg3, arg0));
            }
        } else if (arg9 == 2) {
            int var24 = arg4 + 1 & 0x3;
            Model var25 = var17.method285(2, arg4 + 4, var12, var13, var14, var15, -1);
            Model var26 = var17.method285(2, var24, var12, var13, var14, var15, -1);
            arg10.method59(field55[var24], var16, arg7, field55[arg4], 8, var25, var26, arg0, var18, arg3, var19);
            if (var17.field816) {
                arg2.method303(true, arg4, arg3, arg0, var17.field817, arg9);
            }
            if (var17.field822 != -1) {
                arg1.method232(new LocEntity(true, arg8, arg7, 0, 0, SeqType.field1028[var17.field822], arg3, arg0));
            }
        } else if (arg9 == 3) {
            Model var27 = var17.method285(3, arg4, var12, var13, var14, var15, -1);
            arg10.method59(0, var16, arg7, field56[arg4], 8, var27, null, arg0, var18, arg3, var19);
            if (var17.field816) {
                arg2.method303(true, arg4, arg3, arg0, var17.field817, arg9);
            }
            if (var17.field822 != -1) {
                arg1.method232(new LocEntity(true, arg8, arg7, 0, 0, SeqType.field1028[var17.field822], arg3, arg0));
            }
        } else if (arg9 == 9) {
            Model var28 = var17.method285(arg9, arg4, var12, var13, var14, var15, -1);
            arg10.method61(var16, 775, arg7, null, var18, arg3, arg0, 1, var19, var28, 0, 1);
            if (var17.field816) {
                arg2.method304(arg4, var17.field815, var17.field814, arg0, 9, arg3, var17.field817);
            }
            if (var17.field822 != -1) {
                arg1.method232(new LocEntity(true, arg8, arg7, 0, 2, SeqType.field1028[var17.field822], arg3, arg0));
            }
        } else if (arg9 == 4) {
            Model var29 = var17.method285(4, 0, var12, var13, var14, var15, -1);
            arg10.method60(var16, arg3, 0, var18, arg4 * 512, field55[arg4], 465, 0, arg0, var29, var19, arg7);
            if (var17.field822 != -1) {
                arg1.method232(new LocEntity(true, arg8, arg7, 0, 1, SeqType.field1028[var17.field822], arg3, arg0));
            }
        } else if (arg9 == 5) {
            int var30 = 16;
            int var31 = arg10.method78(arg7, arg0, arg3);
            if (var31 > 0) {
                var30 = LocType.method282(var31 >> 14 & 0x7FFF).field823;
            }
            Model var32 = var17.method285(4, 0, var12, var13, var14, var15, -1);
            arg10.method60(var16, arg3, field58[arg4] * var30, var18, arg4 * 512, field55[arg4], 465, field57[arg4] * var30, arg0, var32, var19, arg7);
            if (var17.field822 != -1) {
                arg1.method232(new LocEntity(true, arg8, arg7, 0, 1, SeqType.field1028[var17.field822], arg3, arg0));
            }
        } else if (arg9 == 6) {
            Model var33 = var17.method285(4, 0, var12, var13, var14, var15, -1);
            arg10.method60(var16, arg3, 0, var18, arg4, 256, 465, 0, arg0, var33, var19, arg7);
            if (var17.field822 != -1) {
                arg1.method232(new LocEntity(true, arg8, arg7, 0, 1, SeqType.field1028[var17.field822], arg3, arg0));
            }
        } else if (arg9 == 7) {
            Model var34 = var17.method285(4, 0, var12, var13, var14, var15, -1);
            arg10.method60(var16, arg3, 0, var18, arg4, 512, 465, 0, arg0, var34, var19, arg7);
            if (var17.field822 != -1) {
                arg1.method232(new LocEntity(true, arg8, arg7, 0, 1, SeqType.field1028[var17.field822], arg3, arg0));
            }
        } else if (arg9 == 8) {
            Model var35 = var17.method285(4, 0, var12, var13, var14, var15, -1);
            arg10.method60(var16, arg3, 0, var18, arg4, 768, 465, 0, arg0, var35, var19, arg7);
            if (var17.field822 != -1) {
                arg1.method232(new LocEntity(true, arg8, arg7, 0, 1, SeqType.field1028[var17.field822], arg3, arg0));
            }
        }
    }
}
