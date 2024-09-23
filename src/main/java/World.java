import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "a", descriptor = "Z")
    private boolean field33 = false;

    @OriginalMember(owner = "c", name = "b", descriptor = "I")
    private int field34 = 5;

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

    @OriginalMember(owner = "c", name = "c", descriptor = "I")
    private int field35;

    @OriginalMember(owner = "c", name = "e", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "c", name = "f", descriptor = "Z")
    public static boolean field38;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "(ZI[[[BI[[[I)V")
    public World(boolean arg0, int arg1, byte[][][] arg2, int arg3, int[][][] arg4) {
        this.field39 = arg1;
        this.field40 = arg3;
        this.field41 = arg4;
        this.field42 = arg2;
        this.field43 = new byte[4][this.field39][this.field40];
        this.field44 = new byte[4][this.field39][this.field40];
        this.field45 = new byte[4][this.field39][this.field40];
        this.field46 = new byte[4][this.field39][this.field40];
        this.field54 = new int[4][this.field39 + 1][this.field40 + 1];
        this.field47 = new byte[4][this.field39 + 1][this.field40 + 1];
        this.field48 = new int[this.field39 + 1][this.field40 + 1];
        this.field49 = new int[this.field40];
        if (arg0) {
            this.field33 = !this.field33;
        }
        this.field50 = new int[this.field40];
        this.field51 = new int[this.field40];
        this.field52 = new int[this.field40];
        this.field53 = new int[this.field40];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIZI)V")
    public final void method14(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        byte var6 = 0;
        for (int var7 = 0; var7 < FloType.field927; var7++) {
            if (FloType.field928[var7].field933.equalsIgnoreCase("water")) {
                var6 = (byte) (var7 + 1);
                break;
            }
        }
        if (!arg3) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        for (int var9 = arg2; var9 < arg2 + arg4; var9++) {
            for (int var10 = arg1; var10 < arg0 + arg1; var10++) {
                if (var10 >= 0 && var10 < this.field39 && var9 >= 0 && var9 < this.field40) {
                    this.field44[0][var10][var9] = var6;
                    for (int var11 = 0; var11 < 4; var11++) {
                        this.field41[var11][var10][var9] = 0;
                        this.field42[var11][var10][var9] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(III[BII)V")
    public final void method15(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        Packet var7 = new Packet((byte) 64, arg3);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg5 + var9;
                    int var12 = arg0 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field42[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method216();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field41[0][var11][var12] = -method20(var11 + arg2 + 932731, var12 + 556238 + arg1) * 8;
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
        if (arg4 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(ZLob;[B[Lec;Lr;II)V")
    public final void method16(boolean arg0, LinkList arg1, byte[] arg2, CollisionMap[] arg3, World3D arg4, int arg5, int arg6) {
        if (arg0) {
            return;
        }
        Packet var8 = new Packet((byte) 64, arg2);
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
                        var22 = arg3[var21];
                    }
                    this.method17(arg4, var17, var20, var22, var18, var19, arg1, 163, var15, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;IILec;IILob;III)V")
    private final void method17(World3D arg0, int arg1, int arg2, CollisionMap arg3, int arg4, int arg5, LinkList arg6, int arg7, int arg8, int arg9) {
        if (field36) {
            if ((this.field42[arg8][arg5][arg2] & 0x10) != 0) {
                return;
            }
            if (this.method19(arg8, false, arg5, arg2) != field37) {
                return;
            }
        }
        int var11 = this.field41[arg8][arg5][arg2];
        int var12 = this.field41[arg8][arg5 + 1][arg2];
        int var13 = this.field41[arg8][arg5 + 1][arg2 + 1];
        int var14 = this.field41[arg8][arg5][arg2 + 1];
        if (arg7 <= 0) {
            this.field34 = 144;
        }
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method282(arg9);
        int var17 = (arg9 << 14) + (arg2 << 7) + arg5 + 1073741824;
        if (!var16.field815) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg4 << 6) + arg1);
        if (arg1 == 22) {
            if (!field36 || var16.field815 || var16.field836) {
                Model var19 = var16.method285(22, arg4, var11, var12, var13, var14, -1);
                arg0.method57(var19, var17, var15, arg8, var18, arg5, arg2, -934);
                if (var16.field813 && var16.field815 && arg3 != null) {
                    arg3.method305(arg2, 1, arg5);
                }
                if (var16.field819 != -1) {
                    arg6.method232(new LocEntity(arg2, arg5, SeqType.field1018[var16.field819], 3, arg9, true, arg8, 1));
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            Model var35 = var16.method285(10, arg4, var11, var12, var13, var14, -1);
            if (var35 != null) {
                int var36 = 0;
                if (arg1 == 11) {
                    var36 += 256;
                }
                int var37;
                int var38;
                if (arg4 == 1 || arg4 == 3) {
                    var37 = var16.field812;
                    var38 = var16.field811;
                } else {
                    var37 = var16.field811;
                    var38 = var16.field812;
                }
                if (arg0.method61(arg5, var37, var15, var35, var36, var18, null, (byte) 21, arg2, arg8, var38, var17) && var16.field828) {
                    for (int var39 = 0; var39 <= var37; var39++) {
                        for (int var40 = 0; var40 <= var38; var40++) {
                            int var41 = var35.field480 / 4;
                            if (var41 > 30) {
                                var41 = 30;
                            }
                            if (var41 > this.field47[arg8][arg5 + var39][arg2 + var40]) {
                                this.field47[arg8][arg5 + var39][arg2 + var40] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var16.field813 && arg3 != null) {
                arg3.method304(var16.field811, arg5, arg2, var16.field814, var16.field812, arg4, true);
            }
            if (var16.field819 != -1) {
                arg6.method232(new LocEntity(arg2, arg5, SeqType.field1018[var16.field819], 2, arg9, true, arg8, 1));
            }
        } else if (arg1 >= 12) {
            Model var20 = var16.method285(arg1, arg4, var11, var12, var13, var14, -1);
            arg0.method61(arg5, 1, var15, var20, 0, var18, null, (byte) 21, arg2, arg8, 1, var17);
            if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg8 > 0) {
                this.field54[arg8][arg5][arg2] |= 0x924;
            }
            if (var16.field813 && arg3 != null) {
                arg3.method304(var16.field811, arg5, arg2, var16.field814, var16.field812, arg4, true);
            }
            if (var16.field819 != -1) {
                arg6.method232(new LocEntity(arg2, arg5, SeqType.field1018[var16.field819], 2, arg9, true, arg8, 1));
            }
        } else if (arg1 == 0) {
            Model var21 = var16.method285(0, arg4, var11, var12, var13, var14, -1);
            arg0.method59(arg5, arg2, var18, field55[arg4], var15, null, var17, arg8, 928, 0, var21);
            if (arg4 == 0) {
                if (var16.field828) {
                    this.field47[arg8][arg5][arg2] = 50;
                    this.field47[arg8][arg5][arg2 + 1] = 50;
                }
                if (var16.field818) {
                    this.field54[arg8][arg5][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var16.field828) {
                    this.field47[arg8][arg5][arg2 + 1] = 50;
                    this.field47[arg8][arg5 + 1][arg2 + 1] = 50;
                }
                if (var16.field818) {
                    this.field54[arg8][arg5][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var16.field828) {
                    this.field47[arg8][arg5 + 1][arg2] = 50;
                    this.field47[arg8][arg5 + 1][arg2 + 1] = 50;
                }
                if (var16.field818) {
                    this.field54[arg8][arg5 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var16.field828) {
                    this.field47[arg8][arg5][arg2] = 50;
                    this.field47[arg8][arg5 + 1][arg2] = 50;
                }
                if (var16.field818) {
                    this.field54[arg8][arg5][arg2] |= 0x492;
                }
            }
            if (var16.field813 && arg3 != null) {
                arg3.method303(arg2, arg5, arg1, arg4, var16.field814, false);
            }
            if (var16.field819 != -1) {
                arg6.method232(new LocEntity(arg2, arg5, SeqType.field1018[var16.field819], 0, arg9, true, arg8, 1));
            }
            if (var16.field820 != 16) {
                arg0.method68(arg5, var16.field820, 3, arg8, arg2);
            }
        } else if (arg1 == 1) {
            Model var22 = var16.method285(1, arg4, var11, var12, var13, var14, -1);
            arg0.method59(arg5, arg2, var18, field56[arg4], var15, null, var17, arg8, 928, 0, var22);
            if (var16.field828) {
                if (arg4 == 0) {
                    this.field47[arg8][arg5][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field47[arg8][arg5 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field47[arg8][arg5 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    this.field47[arg8][arg5][arg2] = 50;
                }
            }
            if (var16.field813 && arg3 != null) {
                arg3.method303(arg2, arg5, arg1, arg4, var16.field814, false);
            }
            if (var16.field819 != -1) {
                arg6.method232(new LocEntity(arg2, arg5, SeqType.field1018[var16.field819], 0, arg9, true, arg8, 1));
            }
        } else if (arg1 == 2) {
            int var23 = arg4 + 1 & 0x3;
            Model var24 = var16.method285(2, arg4 + 4, var11, var12, var13, var14, -1);
            Model var25 = var16.method285(2, var23, var11, var12, var13, var14, -1);
            arg0.method59(arg5, arg2, var18, field55[arg4], var15, var25, var17, arg8, 928, field55[var23], var24);
            if (var16.field818) {
                if (arg4 == 0) {
                    this.field54[arg8][arg5][arg2] |= 0x249;
                    this.field54[arg8][arg5][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    this.field54[arg8][arg5][arg2 + 1] |= 0x492;
                    this.field54[arg8][arg5 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    this.field54[arg8][arg5 + 1][arg2] |= 0x249;
                    this.field54[arg8][arg5][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    this.field54[arg8][arg5][arg2] |= 0x492;
                    this.field54[arg8][arg5][arg2] |= 0x249;
                }
            }
            if (var16.field813 && arg3 != null) {
                arg3.method303(arg2, arg5, arg1, arg4, var16.field814, false);
            }
            if (var16.field819 != -1) {
                arg6.method232(new LocEntity(arg2, arg5, SeqType.field1018[var16.field819], 0, arg9, true, arg8, 1));
            }
            if (var16.field820 != 16) {
                arg0.method68(arg5, var16.field820, 3, arg8, arg2);
            }
        } else if (arg1 == 3) {
            Model var26 = var16.method285(3, arg4, var11, var12, var13, var14, -1);
            arg0.method59(arg5, arg2, var18, field56[arg4], var15, null, var17, arg8, 928, 0, var26);
            if (var16.field828) {
                if (arg4 == 0) {
                    this.field47[arg8][arg5][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field47[arg8][arg5 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field47[arg8][arg5 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    this.field47[arg8][arg5][arg2] = 50;
                }
            }
            if (var16.field813 && arg3 != null) {
                arg3.method303(arg2, arg5, arg1, arg4, var16.field814, false);
            }
            if (var16.field819 != -1) {
                arg6.method232(new LocEntity(arg2, arg5, SeqType.field1018[var16.field819], 0, arg9, true, arg8, 1));
            }
        } else if (arg1 == 9) {
            Model var27 = var16.method285(arg1, arg4, var11, var12, var13, var14, -1);
            arg0.method61(arg5, 1, var15, var27, 0, var18, null, (byte) 21, arg2, arg8, 1, var17);
            if (var16.field813 && arg3 != null) {
                arg3.method304(var16.field811, arg5, arg2, var16.field814, var16.field812, arg4, true);
            }
            if (var16.field819 != -1) {
                arg6.method232(new LocEntity(arg2, arg5, SeqType.field1018[var16.field819], 2, arg9, true, arg8, 1));
            }
        } else if (arg1 == 4) {
            Model var28 = var16.method285(4, 0, var11, var12, var13, var14, -1);
            arg0.method60(var15, (byte) 52, field55[arg4], arg5, var17, arg4 * 512, arg2, var18, arg8, 0, 0, var28);
            if (var16.field819 != -1) {
                arg6.method232(new LocEntity(arg2, arg5, SeqType.field1018[var16.field819], 1, arg9, true, arg8, 1));
            }
        } else if (arg1 == 5) {
            int var29 = 16;
            int var30 = arg0.method78(arg8, arg5, arg2);
            if (var30 > 0) {
                var29 = LocType.method282(var30 >> 14 & 0x7FFF).field820;
            }
            Model var31 = var16.method285(4, 0, var11, var12, var13, var14, -1);
            arg0.method60(var15, (byte) 52, field55[arg4], arg5, var17, arg4 * 512, arg2, var18, arg8, field57[arg4] * var29, field58[arg4] * var29, var31);
            if (var16.field819 != -1) {
                arg6.method232(new LocEntity(arg2, arg5, SeqType.field1018[var16.field819], 1, arg9, true, arg8, 1));
            }
        } else if (arg1 == 6) {
            Model var32 = var16.method285(4, 0, var11, var12, var13, var14, -1);
            arg0.method60(var15, (byte) 52, 256, arg5, var17, arg4, arg2, var18, arg8, 0, 0, var32);
            if (var16.field819 != -1) {
                arg6.method232(new LocEntity(arg2, arg5, SeqType.field1018[var16.field819], 1, arg9, true, arg8, 1));
            }
        } else if (arg1 == 7) {
            Model var33 = var16.method285(4, 0, var11, var12, var13, var14, -1);
            arg0.method60(var15, (byte) 52, 512, arg5, var17, arg4, arg2, var18, arg8, 0, 0, var33);
            if (var16.field819 != -1) {
                arg6.method232(new LocEntity(arg2, arg5, SeqType.field1018[var16.field819], 1, arg9, true, arg8, 1));
            }
        } else if (arg1 == 8) {
            Model var34 = var16.method285(4, 0, var11, var12, var13, var14, -1);
            arg0.method60(var15, (byte) 52, 768, arg5, var17, arg4, arg2, var18, arg8, 0, 0, var34);
            if (var16.field819 != -1) {
                arg6.method232(new LocEntity(arg2, arg5, SeqType.field1018[var16.field819], 1, arg9, true, arg8, 1));
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([Lec;ILr;)V")
    public final void method18(CollisionMap[] arg0, int arg1, World3D arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field42[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field42[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method305(var111, 1, var110);
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
            byte[][] var48 = this.field47[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field40 - 1; var56++) {
                for (int var101 = 1; var101 < this.field39 - 1; var101++) {
                    int var102 = this.field41[var5][var101 + 1][var56] - this.field41[var5][var101 - 1][var56];
                    int var103 = this.field41[var5][var101][var56 + 1] - this.field41[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field48[var101][var56] = var108 - var109;
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
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field39) {
                        int var96 = this.field43[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            FloType var97 = FloType.field928[var96 - 1];
                            this.field49[var61] += var97.field937;
                            this.field50[var61] += var97.field935;
                            this.field51[var61] += var97.field936;
                            this.field52[var61] += var97.field938;
                            var10002 = this.field53[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field39) {
                        int var99 = this.field43[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.field928[var99 - 1];
                            this.field49[var61] -= var100.field937;
                            this.field50[var61] -= var100.field935;
                            this.field51[var61] -= var100.field936;
                            this.field52[var61] -= var100.field938;
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
                        if (var67 >= 1 && var67 < this.field40 - 1 && (!field36 || (this.field42[var5][var58][var67] & 0x10) == 0 && this.method19(var5, false, var58, var67) == field37)) {
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
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method27(var82, var83, var84);
                                    int var85 = field59 + var82 & 0xFF;
                                    int var86 = field60 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method27(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field45[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !FloType.field928[var71 - 1].field932) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field54[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Pix3D.field581[method25(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg2.method56(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method25(var80, var76), method25(var80, var77), method25(var80, var78), method25(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field45[var5][var58][var67] + 1;
                                    byte var90 = this.field46[var5][var58][var67];
                                    FloType var91 = FloType.field928[var71 - 1];
                                    int var92 = var91.field930;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Pix3D.method160(var92, (byte) 5);
                                        var94 = -1;
                                    } else if (var91.field929 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method27(var91.field934, var91.field935, var91.field936);
                                        var93 = Pix3D.field581[this.method26(var91.field939, 96)];
                                    }
                                    arg2.method56(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method25(var80, var76), method25(var80, var77), method25(var80, var78), method25(var80, var79), this.method26(var94, var76), this.method26(var94, var77), this.method26(var94, var78), this.method26(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field40 - 1; var59++) {
                for (int var60 = 1; var60 < this.field39 - 1; var60++) {
                    arg2.method55(var5, var60, var59, this.method19(var5, false, var60, var59));
                }
            }
        }
        if (arg1 != -19432) {
            this.field35 = -2;
        }
        if (!field38) {
            arg2.method83(768, -10, 0, -50, -50, 64);
        }
        for (int var6 = 0; var6 < this.field39; var6++) {
            for (int var47 = 0; var47 < this.field40; var47++) {
                if ((this.field42[1][var6][var47] & 0x2) == 2) {
                    arg2.method53(false, var6, var47);
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
                            label334: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field54[var16 - 1][var13][var18] & var7) == 0) {
                                        break label334;
                                    }
                                }
                                var16--;
                            }
                            label323: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field54[var17 + 1][var13][var19] & var7) == 0) {
                                        break label323;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field41[var17][var13][var14] - var21;
                                int var23 = this.field41[var16][var13][var14];
                                World3D.method54(var13 * 128, var10, 1, var14 * 128, var22, 0, var15 * 128 + 128, var13 * 128, var23);
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
                            label387: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field54[var28 - 1][var30][var12] & var8) == 0) {
                                        break label387;
                                    }
                                }
                                var28--;
                            }
                            label376: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field54[var29 + 1][var31][var12] & var8) == 0) {
                                        break label376;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field41[var29][var26][var12] - var33;
                                int var35 = this.field41[var28][var26][var12];
                                World3D.method54(var26 * 128, var10, 2, var12 * 128, var34, 0, var12 * 128, var27 * 128 + 128, var35);
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
                            label440: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field54[var11][var38 - 1][var42] & var9) == 0) {
                                        break label440;
                                    }
                                }
                                var38--;
                            }
                            label429: while (var39 < this.field39) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field54[var11][var39 + 1][var43] & var9) == 0) {
                                        break label429;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field41[var11][var38][var40];
                                World3D.method54(var38 * 128, var10, 4, var40 * 128, var44, 0, var41 * 128 + 128, var39 * 128 + 128, var44);
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(IZII)I")
    public int method19(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return 0;
        } else if ((this.field42[arg0][arg2][arg3] & 0x8) == 0) {
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
        int var4 = 65536 - Pix3D.field570[arg2 * 1024 / arg3] >> 1;
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIIIIILec;Lr;ILob;[[[I)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, CollisionMap arg7, World3D arg8, int arg9, LinkList arg10, int[][][] arg11) {
        int var12 = arg11[arg5][arg2][arg6];
        int var13 = arg11[arg5][arg2 + 1][arg6];
        int var14 = arg11[arg5][arg2 + 1][arg6 + 1];
        int var15 = arg11[arg5][arg2][arg6 + 1];
        int var16 = var12 + var13 + var14 + var15 >> 2;
        if (arg3 != 0) {
            return;
        }
        LocType var17 = LocType.method282(arg9);
        int var18 = (arg9 << 14) + (arg6 << 7) + arg2 + 1073741824;
        if (!var17.field815) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg4 << 6) + arg1);
        if (arg1 == 22) {
            Model var20 = var17.method285(22, arg4, var12, var13, var14, var15, -1);
            arg8.method57(var20, var18, var16, arg0, var19, arg2, arg6, -934);
            if (var17.field813 && var17.field815) {
                arg7.method305(arg6, 1, arg2);
            }
            if (var17.field819 != -1) {
                arg10.method232(new LocEntity(arg6, arg2, SeqType.field1018[var17.field819], 3, arg9, true, arg0, 1));
            }
        } else if (arg1 == 10 || arg1 == 11) {
            Model var36 = var17.method285(10, arg4, var12, var13, var14, var15, -1);
            if (var36 != null) {
                int var37 = 0;
                if (arg1 == 11) {
                    var37 += 256;
                }
                int var38;
                int var39;
                if (arg4 == 1 || arg4 == 3) {
                    var38 = var17.field812;
                    var39 = var17.field811;
                } else {
                    var38 = var17.field811;
                    var39 = var17.field812;
                }
                arg8.method61(arg2, var38, var16, var36, var37, var19, null, (byte) 21, arg6, arg0, var39, var18);
            }
            if (var17.field813) {
                arg7.method304(var17.field811, arg2, arg6, var17.field814, var17.field812, arg4, true);
            }
            if (var17.field819 != -1) {
                arg10.method232(new LocEntity(arg6, arg2, SeqType.field1018[var17.field819], 2, arg9, true, arg0, 1));
            }
        } else if (arg1 >= 12) {
            Model var21 = var17.method285(arg1, arg4, var12, var13, var14, var15, -1);
            arg8.method61(arg2, 1, var16, var21, 0, var19, null, (byte) 21, arg6, arg0, 1, var18);
            if (var17.field813) {
                arg7.method304(var17.field811, arg2, arg6, var17.field814, var17.field812, arg4, true);
            }
            if (var17.field819 != -1) {
                arg10.method232(new LocEntity(arg6, arg2, SeqType.field1018[var17.field819], 2, arg9, true, arg0, 1));
            }
        } else if (arg1 == 0) {
            Model var22 = var17.method285(0, arg4, var12, var13, var14, var15, -1);
            arg8.method59(arg2, arg6, var19, field55[arg4], var16, null, var18, arg0, 928, 0, var22);
            if (var17.field813) {
                arg7.method303(arg6, arg2, arg1, arg4, var17.field814, false);
            }
            if (var17.field819 != -1) {
                arg10.method232(new LocEntity(arg6, arg2, SeqType.field1018[var17.field819], 0, arg9, true, arg0, 1));
            }
        } else if (arg1 == 1) {
            Model var23 = var17.method285(1, arg4, var12, var13, var14, var15, -1);
            arg8.method59(arg2, arg6, var19, field56[arg4], var16, null, var18, arg0, 928, 0, var23);
            if (var17.field813) {
                arg7.method303(arg6, arg2, arg1, arg4, var17.field814, false);
            }
            if (var17.field819 != -1) {
                arg10.method232(new LocEntity(arg6, arg2, SeqType.field1018[var17.field819], 0, arg9, true, arg0, 1));
            }
        } else if (arg1 == 2) {
            int var24 = arg4 + 1 & 0x3;
            Model var25 = var17.method285(2, arg4 + 4, var12, var13, var14, var15, -1);
            Model var26 = var17.method285(2, var24, var12, var13, var14, var15, -1);
            arg8.method59(arg2, arg6, var19, field55[arg4], var16, var26, var18, arg0, 928, field55[var24], var25);
            if (var17.field813) {
                arg7.method303(arg6, arg2, arg1, arg4, var17.field814, false);
            }
            if (var17.field819 != -1) {
                arg10.method232(new LocEntity(arg6, arg2, SeqType.field1018[var17.field819], 0, arg9, true, arg0, 1));
            }
        } else if (arg1 == 3) {
            Model var27 = var17.method285(3, arg4, var12, var13, var14, var15, -1);
            arg8.method59(arg2, arg6, var19, field56[arg4], var16, null, var18, arg0, 928, 0, var27);
            if (var17.field813) {
                arg7.method303(arg6, arg2, arg1, arg4, var17.field814, false);
            }
            if (var17.field819 != -1) {
                arg10.method232(new LocEntity(arg6, arg2, SeqType.field1018[var17.field819], 0, arg9, true, arg0, 1));
            }
        } else if (arg1 == 9) {
            Model var28 = var17.method285(arg1, arg4, var12, var13, var14, var15, -1);
            arg8.method61(arg2, 1, var16, var28, 0, var19, null, (byte) 21, arg6, arg0, 1, var18);
            if (var17.field813) {
                arg7.method304(var17.field811, arg2, arg6, var17.field814, var17.field812, arg4, true);
            }
            if (var17.field819 != -1) {
                arg10.method232(new LocEntity(arg6, arg2, SeqType.field1018[var17.field819], 2, arg9, true, arg0, 1));
            }
        } else if (arg1 == 4) {
            Model var29 = var17.method285(4, 0, var12, var13, var14, var15, -1);
            arg8.method60(var16, (byte) 52, field55[arg4], arg2, var18, arg4 * 512, arg6, var19, arg0, 0, 0, var29);
            if (var17.field819 != -1) {
                arg10.method232(new LocEntity(arg6, arg2, SeqType.field1018[var17.field819], 1, arg9, true, arg0, 1));
            }
        } else if (arg1 == 5) {
            int var30 = 16;
            int var31 = arg8.method78(arg0, arg2, arg6);
            if (var31 > 0) {
                var30 = LocType.method282(var31 >> 14 & 0x7FFF).field820;
            }
            Model var32 = var17.method285(4, 0, var12, var13, var14, var15, -1);
            arg8.method60(var16, (byte) 52, field55[arg4], arg2, var18, arg4 * 512, arg6, var19, arg0, field57[arg4] * var30, field58[arg4] * var30, var32);
            if (var17.field819 != -1) {
                arg10.method232(new LocEntity(arg6, arg2, SeqType.field1018[var17.field819], 1, arg9, true, arg0, 1));
            }
        } else if (arg1 == 6) {
            Model var33 = var17.method285(4, 0, var12, var13, var14, var15, -1);
            arg8.method60(var16, (byte) 52, 256, arg2, var18, arg4, arg6, var19, arg0, 0, 0, var33);
            if (var17.field819 != -1) {
                arg10.method232(new LocEntity(arg6, arg2, SeqType.field1018[var17.field819], 1, arg9, true, arg0, 1));
            }
        } else if (arg1 == 7) {
            Model var34 = var17.method285(4, 0, var12, var13, var14, var15, -1);
            arg8.method60(var16, (byte) 52, 512, arg2, var18, arg4, arg6, var19, arg0, 0, 0, var34);
            if (var17.field819 != -1) {
                arg10.method232(new LocEntity(arg6, arg2, SeqType.field1018[var17.field819], 1, arg9, true, arg0, 1));
            }
        } else if (arg1 == 8) {
            Model var35 = var17.method285(4, 0, var12, var13, var14, var15, -1);
            arg8.method60(var16, (byte) 52, 768, arg2, var18, arg4, arg6, var19, arg0, 0, 0, var35);
            if (var17.field819 != -1) {
                arg10.method232(new LocEntity(arg6, arg2, SeqType.field1018[var17.field819], 1, arg9, true, arg0, 1));
            }
        }
    }
}
