import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "c", descriptor = "I")
    private int field42 = 5;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    private int field46;

    @OriginalMember(owner = "c", name = "h", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "c", name = "i", descriptor = "[[[I")
    private int[][][] field48;

    @OriginalMember(owner = "c", name = "j", descriptor = "[[[B")
    private byte[][][] field49;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[B")
    private byte[][][] field50;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field51;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field52;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field53;

    @OriginalMember(owner = "c", name = "v", descriptor = "[[[I")
    private int[][][] field61;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field54;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[I")
    private int[][] field55;

    @OriginalMember(owner = "c", name = "q", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "c", name = "r", descriptor = "[I")
    private int[] field57;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field58;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field59;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field60;

    @OriginalMember(owner = "c", name = "b", descriptor = "I")
    private static int field41 = -702;

    @OriginalMember(owner = "c", name = "d", descriptor = "I")
    private static int field43 = 8;

    @OriginalMember(owner = "c", name = "e", descriptor = "Z")
    public static boolean field44 = true;

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private static final int[] field62 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private static final int[] field63 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field64 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field65 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "A", descriptor = "I")
    private static int field66 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "c", name = "B", descriptor = "I")
    private static int field67 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "c", name = "f", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "c", name = "a", descriptor = "Z")
    private static boolean field40;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "(I[[[III[[[B)V")
    public World(int arg0, int[][][] arg1, int arg2, int arg3, byte[][][] arg4) {
        this.field46 = arg3;
        this.field47 = arg2;
        this.field48 = arg1;
        this.field49 = arg4;
        this.field50 = new byte[4][this.field46][this.field47];
        this.field51 = new byte[4][this.field46][this.field47];
        this.field52 = new byte[4][this.field46][this.field47];
        this.field53 = new byte[4][this.field46][this.field47];
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        this.field61 = new int[4][this.field46 + 1][this.field47 + 1];
        this.field54 = new byte[4][this.field46 + 1][this.field47 + 1];
        this.field55 = new int[this.field46 + 1][this.field47 + 1];
        this.field56 = new int[this.field47];
        this.field57 = new int[this.field47];
        this.field58 = new int[this.field47];
        this.field59 = new int[this.field47];
        this.field60 = new int[this.field47];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIII)V")
    public final void method14(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < this.field42 || arg3 > this.field42) {
            return;
        }
        for (int var6 = arg0; var6 <= arg0 + arg1; var6++) {
            for (int var7 = arg4; var7 <= arg2 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field46 && var6 >= 0 && var6 < this.field47) {
                    this.field54[0][var7][var6] = 127;
                    if (arg4 == var7 && var7 > 0) {
                        this.field48[0][var7][var6] = this.field48[0][var7 - 1][var6];
                    }
                    if (arg2 + arg4 == var7 && var7 < this.field46 - 1) {
                        this.field48[0][var7][var6] = this.field48[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        this.field48[0][var7][var6] = this.field48[0][var7][var6 - 1];
                    }
                    if (arg0 + arg1 == var6 && var6 < this.field47 - 1) {
                        this.field48[0][var7][var6] = this.field48[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(BIIII[B)V")
    public final void method15(byte arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        Packet var7 = new Packet(arg5, 58);
        if (arg0 != -12) {
            this.field42 = 66;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg3 + var9;
                    int var12 = arg1 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field49[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method229();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field48[0][var11][var12] = -method22(var11 + arg4 + 932731, var12 + 556238 + arg2) * 8;
                                } else {
                                    this.field48[var8][var11][var12] = this.field48[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method229();
                                if (var14 == 1) {
                                    var14 = 0;
                                }
                                if (var8 == 0) {
                                    this.field48[0][var11][var12] = -var14 * 8;
                                } else {
                                    this.field48[var8][var11][var12] = this.field48[var8 - 1][var11][var12] - var14 * 8;
                                }
                                break;
                            }
                            if (var13 <= 49) {
                                this.field51[var8][var11][var12] = var7.method230();
                                this.field52[var8][var11][var12] = (byte) ((var13 - 2) / 4);
                                this.field53[var8][var11][var12] = (byte) (var13 - 2 & 0x3);
                            } else if (var13 <= 81) {
                                this.field49[var8][var11][var12] = (byte) (var13 - 49);
                            } else {
                                this.field50[var8][var11][var12] = (byte) (var13 - 81);
                            }
                        }
                    } else {
                        while (true) {
                            int var15 = var7.method229();
                            if (var15 == 0) {
                                break;
                            }
                            if (var15 == 1) {
                                var7.method229();
                                break;
                            }
                            if (var15 <= 49) {
                                var7.method229();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IZ[BI)Z")
    public static final boolean method16(int arg0, boolean arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        Packet var5 = new Packet(arg2, 58);
        int var6 = -1;
        if (arg1) {
            throw new NullPointerException();
        }
        label52: while (true) {
            int var7 = var5.method243();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method243();
                    if (var11 == 0) {
                        continue label52;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method229() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.method330(var6);
                        if (var14 != 22 || !field44 || var17.field963 || var17.field983) {
                            var4 &= var17.method334(853);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method243();
                if (var10 == 0) {
                    break;
                }
                var5.method229();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lub;ZLlb;)V")
    public static final void method17(OnDemand arg0, boolean arg1, Packet arg2) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = -1;
        while (true) {
            int var5 = arg2.method243();
            if (var5 == 0) {
                return;
            }
            var4 += var5;
            LocType var6 = LocType.method330(var4);
            var6.method335(arg0, (byte) 61);
            while (true) {
                int var7 = arg2.method243();
                if (var7 == 0) {
                    break;
                }
                arg2.method229();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(B[BI[Ljc;Lr;I)V")
    public final void method18(byte arg0, byte[] arg1, int arg2, CollisionMap[] arg3, World3D arg4, int arg5) {
        Packet var7 = new Packet(arg1, 58);
        int var8 = -1;
        if (arg0 != 1) {
            return;
        }
        boolean var9 = false;
        while (true) {
            int var10 = var7.method243();
            if (var10 == 0) {
                return;
            }
            var8 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method243();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var7.method229();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg5 + var14;
                int var20 = arg2 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field49[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    CollisionMap var22 = null;
                    if (var21 >= 0) {
                        var22 = arg3[var21];
                    }
                    this.method19(var8, var20, arg4, var15, var19, var18, false, var22, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IILr;IIIZLjc;I)V")
    private final void method19(int arg0, int arg1, World3D arg2, int arg3, int arg4, int arg5, boolean arg6, CollisionMap arg7, int arg8) {
        if (field44) {
            if ((this.field49[arg3][arg4][arg1] & 0x10) != 0) {
                return;
            }
            if (this.method21((byte) 8, arg4, arg3, arg1) != field45) {
                return;
            }
        }
        int var10 = this.field48[arg3][arg4][arg1];
        int var11 = this.field48[arg3][arg4 + 1][arg1];
        int var12 = this.field48[arg3][arg4 + 1][arg1 + 1];
        int var13 = this.field48[arg3][arg4][arg1 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        LocType var15 = LocType.method330(arg0);
        int var16 = (arg0 << 14) + (arg1 << 7) + arg4 + 1073741824;
        if (!var15.field963) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg5 << 6) + arg8);
        if (arg6) {
            for (int var18 = 1; var18 > 0; var18++) {
            }
        }
        if (arg8 == 22) {
            if (!field44 || var15.field963 || var15.field983) {
                Entity var19;
                if (var15.field967 == -1 && var15.field986 == null) {
                    var19 = var15.method336(22, arg5, var10, var11, var12, var13, -1);
                } else {
                    var19 = new LocEntity(var15.field967, var12, -530, var10, true, arg5, var11, 22, var13, arg0);
                }
                arg2.method56(arg3, arg4, true, arg1, var19, var17, var16, var14);
                if (var15.field961 && var15.field963 && arg7 != null) {
                    arg7.method362(arg1, -564, arg4);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            Entity var39;
            if (var15.field967 == -1 && var15.field986 == null) {
                var39 = var15.method336(10, arg5, var10, var11, var12, var13, -1);
            } else {
                var39 = new LocEntity(var15.field967, var12, -530, var10, true, arg5, var11, 10, var13, arg0);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg8 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg5 == 1 || arg5 == 3) {
                    var41 = var15.field960;
                    var42 = var15.field959;
                } else {
                    var41 = var15.field959;
                    var42 = var15.field960;
                }
                if (arg2.method60(var16, false, var17, arg1, var41, var14, arg3, var42, arg4, var39, var40) && var15.field975) {
                    Model var43;
                    if (var39 instanceof Model) {
                        var43 = (Model) var39;
                    } else {
                        var43 = var15.method336(10, arg5, var10, var11, var12, var13, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field565 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field54[arg3][arg4 + var44][arg1 + var45]) {
                                    this.field54[arg3][arg4 + var44][arg1 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field961 && arg7 != null) {
                arg7.method361(arg5, arg4, var15.field962, arg1, var15.field959, 6, var15.field960);
            }
        } else if (arg8 >= 12) {
            Entity var20;
            if (var15.field967 == -1 && var15.field986 == null) {
                var20 = var15.method336(arg8, arg5, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(var15.field967, var12, -530, var10, true, arg5, var11, arg8, var13, arg0);
            }
            arg2.method60(var16, false, var17, arg1, 1, var14, arg3, 1, arg4, var20, 0);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg3 > 0) {
                this.field61[arg3][arg4][arg1] |= 0x924;
            }
            if (var15.field961 && arg7 != null) {
                arg7.method361(arg5, arg4, var15.field962, arg1, var15.field959, 6, var15.field960);
            }
        } else if (arg8 == 0) {
            Entity var21;
            if (var15.field967 == -1 && var15.field986 == null) {
                var21 = var15.method336(0, arg5, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(var15.field967, var12, -530, var10, true, arg5, var11, 0, var13, arg0);
            }
            arg2.method58(arg4, var21, field62[arg5], var14, null, arg3, arg1, false, 0, var16, var17);
            if (arg5 == 0) {
                if (var15.field975) {
                    this.field54[arg3][arg4][arg1] = 50;
                    this.field54[arg3][arg4][arg1 + 1] = 50;
                }
                if (var15.field966) {
                    this.field61[arg3][arg4][arg1] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var15.field975) {
                    this.field54[arg3][arg4][arg1 + 1] = 50;
                    this.field54[arg3][arg4 + 1][arg1 + 1] = 50;
                }
                if (var15.field966) {
                    this.field61[arg3][arg4][arg1 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var15.field975) {
                    this.field54[arg3][arg4 + 1][arg1] = 50;
                    this.field54[arg3][arg4 + 1][arg1 + 1] = 50;
                }
                if (var15.field966) {
                    this.field61[arg3][arg4 + 1][arg1] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var15.field975) {
                    this.field54[arg3][arg4][arg1] = 50;
                    this.field54[arg3][arg4 + 1][arg1] = 50;
                }
                if (var15.field966) {
                    this.field61[arg3][arg4][arg1] |= 0x492;
                }
            }
            if (var15.field961 && arg7 != null) {
                arg7.method360(arg4, var15.field962, 0, arg8, arg1, arg5);
            }
            if (var15.field968 != 16) {
                arg2.method66(var15.field968, arg3, arg1, arg4, 0);
            }
        } else if (arg8 == 1) {
            Entity var22;
            if (var15.field967 == -1 && var15.field986 == null) {
                var22 = var15.method336(1, arg5, var10, var11, var12, var13, -1);
            } else {
                var22 = new LocEntity(var15.field967, var12, -530, var10, true, arg5, var11, 1, var13, arg0);
            }
            arg2.method58(arg4, var22, field63[arg5], var14, null, arg3, arg1, false, 0, var16, var17);
            if (var15.field975) {
                if (arg5 == 0) {
                    this.field54[arg3][arg4][arg1 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field54[arg3][arg4 + 1][arg1 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field54[arg3][arg4 + 1][arg1] = 50;
                } else if (arg5 == 3) {
                    this.field54[arg3][arg4][arg1] = 50;
                }
            }
            if (var15.field961 && arg7 != null) {
                arg7.method360(arg4, var15.field962, 0, arg8, arg1, arg5);
            }
        } else if (arg8 == 2) {
            int var23 = arg5 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var15.field967 == -1 && var15.field986 == null) {
                var24 = var15.method336(2, arg5 + 4, var10, var11, var12, var13, -1);
                var25 = var15.method336(2, var23, var10, var11, var12, var13, -1);
            } else {
                var24 = new LocEntity(var15.field967, var12, -530, var10, true, arg5 + 4, var11, 2, var13, arg0);
                var25 = new LocEntity(var15.field967, var12, -530, var10, true, var23, var11, 2, var13, arg0);
            }
            arg2.method58(arg4, var24, field62[arg5], var14, var25, arg3, arg1, false, field62[var23], var16, var17);
            if (var15.field966) {
                if (arg5 == 0) {
                    this.field61[arg3][arg4][arg1] |= 0x249;
                    this.field61[arg3][arg4][arg1 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    this.field61[arg3][arg4][arg1 + 1] |= 0x492;
                    this.field61[arg3][arg4 + 1][arg1] |= 0x249;
                } else if (arg5 == 2) {
                    this.field61[arg3][arg4 + 1][arg1] |= 0x249;
                    this.field61[arg3][arg4][arg1] |= 0x492;
                } else if (arg5 == 3) {
                    this.field61[arg3][arg4][arg1] |= 0x492;
                    this.field61[arg3][arg4][arg1] |= 0x249;
                }
            }
            if (var15.field961 && arg7 != null) {
                arg7.method360(arg4, var15.field962, 0, arg8, arg1, arg5);
            }
            if (var15.field968 != 16) {
                arg2.method66(var15.field968, arg3, arg1, arg4, 0);
            }
        } else if (arg8 == 3) {
            Entity var26;
            if (var15.field967 == -1 && var15.field986 == null) {
                var26 = var15.method336(3, arg5, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(var15.field967, var12, -530, var10, true, arg5, var11, 3, var13, arg0);
            }
            arg2.method58(arg4, var26, field63[arg5], var14, null, arg3, arg1, false, 0, var16, var17);
            if (var15.field975) {
                if (arg5 == 0) {
                    this.field54[arg3][arg4][arg1 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field54[arg3][arg4 + 1][arg1 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field54[arg3][arg4 + 1][arg1] = 50;
                } else if (arg5 == 3) {
                    this.field54[arg3][arg4][arg1] = 50;
                }
            }
            if (var15.field961 && arg7 != null) {
                arg7.method360(arg4, var15.field962, 0, arg8, arg1, arg5);
            }
        } else if (arg8 == 9) {
            Entity var27;
            if (var15.field967 == -1 && var15.field986 == null) {
                var27 = var15.method336(arg8, arg5, var10, var11, var12, var13, -1);
            } else {
                var27 = new LocEntity(var15.field967, var12, -530, var10, true, arg5, var11, arg8, var13, arg0);
            }
            arg2.method60(var16, false, var17, arg1, 1, var14, arg3, 1, arg4, var27, 0);
            if (var15.field961 && arg7 != null) {
                arg7.method361(arg5, arg4, var15.field962, arg1, var15.field959, 6, var15.field960);
            }
        } else {
            if (var15.field964) {
                if (arg5 == 1) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg5 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg5 == 3) {
                    int var31 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var31;
                }
            }
            if (arg8 == 4) {
                Entity var32;
                if (var15.field967 == -1 && var15.field986 == null) {
                    var32 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var32 = new LocEntity(var15.field967, var12, -530, var10, true, 0, var11, 4, var13, arg0);
                }
                arg2.method59(0, arg1, arg4, arg5 * 512, var14, var16, field62[arg5], var32, 0, arg3, -60, var17);
            } else if (arg8 == 5) {
                int var33 = 16;
                int var34 = arg2.method76(arg3, arg4, arg1);
                if (var34 > 0) {
                    var33 = LocType.method330(var34 >> 14 & 0x7FFF).field968;
                }
                Entity var35;
                if (var15.field967 == -1 && var15.field986 == null) {
                    var35 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new LocEntity(var15.field967, var12, -530, var10, true, 0, var11, 4, var13, arg0);
                }
                arg2.method59(field64[arg5] * var33, arg1, arg4, arg5 * 512, var14, var16, field62[arg5], var35, field65[arg5] * var33, arg3, -60, var17);
            } else if (arg8 == 6) {
                Entity var36;
                if (var15.field967 == -1 && var15.field986 == null) {
                    var36 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new LocEntity(var15.field967, var12, -530, var10, true, 0, var11, 4, var13, arg0);
                }
                arg2.method59(0, arg1, arg4, arg5, var14, var16, 256, var36, 0, arg3, -60, var17);
            } else if (arg8 == 7) {
                Entity var37;
                if (var15.field967 == -1 && var15.field986 == null) {
                    var37 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new LocEntity(var15.field967, var12, -530, var10, true, 0, var11, 4, var13, arg0);
                }
                arg2.method59(0, arg1, arg4, arg5, var14, var16, 512, var37, 0, arg3, -60, var17);
            } else if (arg8 == 8) {
                Entity var38;
                if (var15.field967 == -1 && var15.field986 == null) {
                    var38 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var38 = new LocEntity(var15.field967, var12, -530, var10, true, 0, var11, 4, var13, arg0);
                }
                arg2.method59(0, arg1, arg4, arg5, var14, var16, 768, var38, 0, arg3, -60, var17);
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;I[Ljc;)V")
    public final void method20(World3D arg0, int arg1, CollisionMap[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((this.field49[var4][var111][var112] & 0x1) == 1) {
                        int var113 = var4;
                        if ((this.field49[1][var111][var112] & 0x2) == 2) {
                            var113 = var4 - 1;
                        }
                        if (var113 >= 0) {
                            arg2[var113].method362(var112, -564, var111);
                        }
                    }
                }
            }
        }
        if (arg1 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field66 += (int) (Math.random() * 5.0D) - 2;
        if (field66 < -8) {
            field66 = -8;
        }
        if (field66 > 8) {
            field66 = 8;
        }
        field67 += (int) (Math.random() * 5.0D) - 2;
        if (field67 < -16) {
            field67 = -16;
        }
        if (field67 > 16) {
            field67 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var49 = this.field54[var6];
            byte var50 = 96;
            short var51 = 768;
            byte var52 = -50;
            byte var53 = -10;
            byte var54 = -50;
            int var55 = (int) Math.sqrt((double) (var54 * var54 + var52 * var52 + var53 * var53));
            int var56 = var51 * var55 >> 8;
            for (int var57 = 1; var57 < this.field47 - 1; var57++) {
                for (int var102 = 1; var102 < this.field46 - 1; var102++) {
                    int var103 = this.field48[var6][var102 + 1][var57] - this.field48[var6][var102 - 1][var57];
                    int var104 = this.field48[var6][var102][var57 + 1] - this.field48[var6][var102][var57 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var54 * var108 + var52 * var106 + var53 * var107) / var56 + var50;
                    int var110 = (var49[var102][var57] >> 1) + (var49[var102][var57 + 1] >> 3) + (var49[var102][var57 - 1] >> 2) + (var49[var102 - 1][var57] >> 2) + (var49[var102 + 1][var57] >> 3);
                    this.field55[var102][var57] = var109 - var110;
                }
            }
            for (int var58 = 0; var58 < this.field47; var58++) {
                this.field56[var58] = 0;
                this.field57[var58] = 0;
                this.field58[var58] = 0;
                this.field59[var58] = 0;
                this.field60[var58] = 0;
            }
            for (int var59 = -5; var59 < this.field46 + 5; var59++) {
                for (int var62 = 0; var62 < this.field47; var62++) {
                    int var96 = var59 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < this.field46) {
                        int var97 = this.field50[var6][var96][var62] & 0xFF;
                        if (var97 > 0) {
                            FloType var98 = FloType.field1100[var97 - 1];
                            this.field56[var62] += var98.field1109;
                            this.field57[var62] += var98.field1107;
                            this.field58[var62] += var98.field1108;
                            this.field59[var62] += var98.field1110;
                            var10002 = this.field60[var62]++;
                        }
                    }
                    int var99 = var59 - 5;
                    if (var99 >= 0 && var99 < this.field46) {
                        int var100 = this.field50[var6][var99][var62] & 0xFF;
                        if (var100 > 0) {
                            FloType var101 = FloType.field1100[var100 - 1];
                            this.field56[var62] -= var101.field1109;
                            this.field57[var62] -= var101.field1107;
                            this.field58[var62] -= var101.field1108;
                            this.field59[var62] -= var101.field1110;
                            var10002 = this.field60[var62]--;
                        }
                    }
                }
                if (var59 >= 1 && var59 < this.field46 - 1) {
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    for (int var68 = -5; var68 < this.field47 + 5; var68++) {
                        int var69 = var68 + 5;
                        if (var69 >= 0 && var69 < this.field47) {
                            var63 += this.field56[var69];
                            var64 += this.field57[var69];
                            var65 += this.field58[var69];
                            var66 += this.field59[var69];
                            var67 += this.field60[var69];
                        }
                        int var70 = var68 - 5;
                        if (var70 >= 0 && var70 < this.field47) {
                            var63 -= this.field56[var70];
                            var64 -= this.field57[var70];
                            var65 -= this.field58[var70];
                            var66 -= this.field59[var70];
                            var67 -= this.field60[var70];
                        }
                        if (var68 >= 1 && var68 < this.field47 - 1 && (!field44 || (this.field49[var6][var59][var68] & 0x10) == 0 && this.method21((byte) 8, var59, var6, var68) == field45)) {
                            int var71 = this.field50[var6][var59][var68] & 0xFF;
                            int var72 = this.field51[var6][var59][var68] & 0xFF;
                            if (var71 > 0 || var72 > 0) {
                                int var73 = this.field48[var6][var59][var68];
                                int var74 = this.field48[var6][var59 + 1][var68];
                                int var75 = this.field48[var6][var59 + 1][var68 + 1];
                                int var76 = this.field48[var6][var59][var68 + 1];
                                int var77 = this.field55[var59][var68];
                                int var78 = this.field55[var59 + 1][var68];
                                int var79 = this.field55[var59 + 1][var68 + 1];
                                int var80 = this.field55[var59][var68 + 1];
                                int var81 = -1;
                                int var82 = -1;
                                if (var71 > 0) {
                                    int var83 = var63 * 256 / var66;
                                    int var84 = var64 / var67;
                                    int var85 = var65 / var67;
                                    var81 = this.method29(var83, var84, var85);
                                    int var86 = field66 + var83 & 0xFF;
                                    int var87 = field67 + var85;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (var87 > 255) {
                                        var87 = 255;
                                    }
                                    var82 = this.method29(var86, var84, var87);
                                }
                                if (var6 > 0) {
                                    boolean var88 = true;
                                    if (var71 == 0 && this.field52[var6][var59][var68] != 0) {
                                        var88 = false;
                                    }
                                    if (var72 > 0 && !FloType.field1100[var72 - 1].field1105) {
                                        var88 = false;
                                    }
                                    if (var88 && var73 == var74 && var73 == var75 && var73 == var76) {
                                        this.field61[var6][var59][var68] |= 0x924;
                                    }
                                }
                                int var89 = 0;
                                if (var81 != -1) {
                                    var89 = Pix3D.field655[method27(var82, 96)];
                                }
                                if (var72 == 0) {
                                    arg0.method55(var6, var59, var68, 0, 0, -1, var73, var74, var75, var76, method27(var81, var77), method27(var81, var78), method27(var81, var79), method27(var81, var80), 0, 0, 0, 0, var89, 0);
                                } else {
                                    int var90 = this.field52[var6][var59][var68] + 1;
                                    byte var91 = this.field53[var6][var59][var68];
                                    FloType var92 = FloType.field1100[var72 - 1];
                                    int var93 = var92.field1103;
                                    int var94;
                                    int var95;
                                    if (var93 >= 0) {
                                        var94 = Pix3D.method170(-84, var93);
                                        var95 = -1;
                                    } else if (var92.field1102 == 16711935) {
                                        var94 = 0;
                                        var95 = -2;
                                        var93 = -1;
                                    } else {
                                        var95 = this.method29(var92.field1106, var92.field1107, var92.field1108);
                                        var94 = Pix3D.field655[this.method28(var92.field1111, 96)];
                                    }
                                    arg0.method55(var6, var59, var68, var90, var91, var93, var73, var74, var75, var76, method27(var81, var77), method27(var81, var78), method27(var81, var79), method27(var81, var80), this.method28(var95, var77), this.method28(var95, var78), this.method28(var95, var79), this.method28(var95, var80), var89, var94);
                                }
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; var60 < this.field47 - 1; var60++) {
                for (int var61 = 1; var61 < this.field46 - 1; var61++) {
                    arg0.method54(var6, var61, var60, this.method21((byte) 8, var61, var6, var60));
                }
            }
        }
        arg0.method81(-50, 768, 64, 840, -50, -10);
        for (int var7 = 0; var7 < this.field46; var7++) {
            for (int var48 = 0; var48 < this.field47; var48++) {
                if ((this.field49[1][var7][var48] & 0x2) == 2) {
                    arg0.method52(field40, var48, var7);
                }
            }
        }
        int var8 = 1;
        int var9 = 2;
        int var10 = 4;
        for (int var11 = 0; var11 < 4; var11++) {
            if (var11 > 0) {
                var8 <<= 0x3;
                var9 <<= 0x3;
                var10 <<= 0x3;
            }
            for (int var12 = 0; var12 <= var11; var12++) {
                for (int var13 = 0; var13 <= this.field47; var13++) {
                    for (int var14 = 0; var14 <= this.field46; var14++) {
                        if ((this.field61[var12][var14][var13] & var8) != 0) {
                            int var15 = var13;
                            int var16 = var13;
                            int var17 = var12;
                            int var18 = var12;
                            while (var15 > 0 && (this.field61[var12][var14][var15 - 1] & var8) != 0) {
                                var15--;
                            }
                            while (var16 < this.field47 && (this.field61[var12][var14][var16 + 1] & var8) != 0) {
                                var16++;
                            }
                            label327: while (var17 > 0) {
                                for (int var19 = var15; var19 <= var16; var19++) {
                                    if ((this.field61[var17 - 1][var14][var19] & var8) == 0) {
                                        break label327;
                                    }
                                }
                                var17--;
                            }
                            label316: while (var18 < var11) {
                                for (int var20 = var15; var20 <= var16; var20++) {
                                    if ((this.field61[var18 + 1][var14][var20] & var8) == 0) {
                                        break label316;
                                    }
                                }
                                var18++;
                            }
                            int var21 = (var18 + 1 - var17) * (var16 + 1 - var15);
                            if (var21 >= 8) {
                                short var22 = 240;
                                int var23 = this.field48[var18][var14][var15] - var22;
                                int var24 = this.field48[var17][var14][var15];
                                World3D.method53(var16 * 128 + 128, var14 * 128, var15 * 128, -45222, var14 * 128, var11, var24, var23, 1);
                                for (int var25 = var17; var25 <= var18; var25++) {
                                    for (int var26 = var15; var26 <= var16; var26++) {
                                        this.field61[var25][var14][var26] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field61[var12][var14][var13] & var9) != 0) {
                            int var27 = var14;
                            int var28 = var14;
                            int var29 = var12;
                            int var30 = var12;
                            while (var27 > 0 && (this.field61[var12][var27 - 1][var13] & var9) != 0) {
                                var27--;
                            }
                            while (var28 < this.field46 && (this.field61[var12][var28 + 1][var13] & var9) != 0) {
                                var28++;
                            }
                            label380: while (var29 > 0) {
                                for (int var31 = var27; var31 <= var28; var31++) {
                                    if ((this.field61[var29 - 1][var31][var13] & var9) == 0) {
                                        break label380;
                                    }
                                }
                                var29--;
                            }
                            label369: while (var30 < var11) {
                                for (int var32 = var27; var32 <= var28; var32++) {
                                    if ((this.field61[var30 + 1][var32][var13] & var9) == 0) {
                                        break label369;
                                    }
                                }
                                var30++;
                            }
                            int var33 = (var30 + 1 - var29) * (var28 + 1 - var27);
                            if (var33 >= 8) {
                                short var34 = 240;
                                int var35 = this.field48[var30][var27][var13] - var34;
                                int var36 = this.field48[var29][var27][var13];
                                World3D.method53(var13 * 128, var27 * 128, var13 * 128, -45222, var28 * 128 + 128, var11, var36, var35, 2);
                                for (int var37 = var29; var37 <= var30; var37++) {
                                    for (int var38 = var27; var38 <= var28; var38++) {
                                        this.field61[var37][var38][var13] &= ~var9;
                                    }
                                }
                            }
                        }
                        if ((this.field61[var12][var14][var13] & var10) != 0) {
                            int var39 = var14;
                            int var40 = var14;
                            int var41 = var13;
                            int var42 = var13;
                            while (var41 > 0 && (this.field61[var12][var14][var41 - 1] & var10) != 0) {
                                var41--;
                            }
                            while (var42 < this.field47 && (this.field61[var12][var14][var42 + 1] & var10) != 0) {
                                var42++;
                            }
                            label433: while (var39 > 0) {
                                for (int var43 = var41; var43 <= var42; var43++) {
                                    if ((this.field61[var12][var39 - 1][var43] & var10) == 0) {
                                        break label433;
                                    }
                                }
                                var39--;
                            }
                            label422: while (var40 < this.field46) {
                                for (int var44 = var41; var44 <= var42; var44++) {
                                    if ((this.field61[var12][var40 + 1][var44] & var10) == 0) {
                                        break label422;
                                    }
                                }
                                var40++;
                            }
                            if ((var40 + 1 - var39) * (var42 + 1 - var41) >= 4) {
                                int var45 = this.field48[var12][var39][var41];
                                World3D.method53(var42 * 128 + 128, var39 * 128, var41 * 128, -45222, var40 * 128 + 128, var11, var45, var45, 4);
                                for (int var46 = var39; var46 <= var40; var46++) {
                                    for (int var47 = var41; var47 <= var42; var47++) {
                                        this.field61[var12][var46][var47] &= ~var10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(BIII)I")
    public int method21(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 8) {
            return 0;
        } else if ((this.field49[arg2][arg1][arg3] & 0x8) == 0) {
            return arg2 <= 0 || (this.field49[1][arg1][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II)I")
    private static final int method22(int arg0, int arg1) {
        int var2 = method23(arg0 + 45365, arg1 + 91923, 4) + (method23(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method23(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(III)I")
    private static final int method23(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method25(var3, var5);
        int var8 = method25(var3 + 1, var5);
        int var9 = method25(var3, var5 + 1);
        int var10 = method25(var3 + 1, var5 + 1);
        int var11 = method24(var7, var8, var4, arg2);
        int var12 = method24(var9, var10, var4, arg2);
        return method24(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIII)I")
    private static final int method24(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - Pix3D.field644[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "c", name = "b", descriptor = "(II)I")
    private static final int method25(int arg0, int arg1) {
        int var2 = method26(arg0 - 1, arg1 - 1) + method26(arg0 + 1, arg1 - 1) + method26(arg0 - 1, arg1 + 1) + method26(arg0 + 1, arg1 + 1);
        int var3 = method26(arg0 - 1, arg1) + method26(arg0 + 1, arg1) + method26(arg0, arg1 - 1) + method26(arg0, arg1 + 1);
        int var4 = method26(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "c", name = "c", descriptor = "(II)I")
    private static final int method26(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "c", name = "d", descriptor = "(II)I")
    private static final int method27(int arg0, int arg1) {
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
    private final int method28(int arg0, int arg1) {
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
    private final int method29(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "c", name = "c", descriptor = "(III)Z")
    public static final boolean method30(int arg0, int arg1, int arg2) {
        if (arg1 < field43 || arg1 > field43) {
            field41 = 95;
        }
        LocType var3 = LocType.method330(arg2);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method333(0, arg0);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Ljc;IIII[[[IBIIILr;)V")
    public static final void method31(CollisionMap arg0, int arg1, int arg2, int arg3, int arg4, int[][][] arg5, byte arg6, int arg7, int arg8, int arg9, World3D arg10) {
        int var11 = arg5[arg4][arg7][arg8];
        int var12 = arg5[arg4][arg7 + 1][arg8];
        int var13 = arg5[arg4][arg7 + 1][arg8 + 1];
        int var14 = arg5[arg4][arg7][arg8 + 1];
        if (arg6 != -102) {
            field40 = !field40;
        }
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method330(arg2);
        int var17 = (arg2 << 14) + (arg8 << 7) + arg7 + 1073741824;
        if (!var16.field963) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg3 << 6) + arg9);
        if (arg9 == 22) {
            Entity var19;
            if (var16.field967 == -1 && var16.field986 == null) {
                var19 = var16.method336(22, arg3, var11, var12, var13, var14, -1);
            } else {
                var19 = new LocEntity(var16.field967, var13, -530, var11, true, arg3, var12, 22, var14, arg2);
            }
            arg10.method56(arg1, arg7, true, arg8, var19, var18, var17, var15);
            if (var16.field961 && var16.field963) {
                arg0.method362(arg8, -564, arg7);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            Entity var39;
            if (var16.field967 == -1 && var16.field986 == null) {
                var39 = var16.method336(10, arg3, var11, var12, var13, var14, -1);
            } else {
                var39 = new LocEntity(var16.field967, var13, -530, var11, true, arg3, var12, 10, var14, arg2);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg9 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg3 == 1 || arg3 == 3) {
                    var41 = var16.field960;
                    var42 = var16.field959;
                } else {
                    var41 = var16.field959;
                    var42 = var16.field960;
                }
                arg10.method60(var17, false, var18, arg8, var41, var15, arg1, var42, arg7, var39, var40);
            }
            if (var16.field961) {
                arg0.method361(arg3, arg7, var16.field962, arg8, var16.field959, 6, var16.field960);
            }
        } else if (arg9 >= 12) {
            Entity var20;
            if (var16.field967 == -1 && var16.field986 == null) {
                var20 = var16.method336(arg9, arg3, var11, var12, var13, var14, -1);
            } else {
                var20 = new LocEntity(var16.field967, var13, -530, var11, true, arg3, var12, arg9, var14, arg2);
            }
            arg10.method60(var17, false, var18, arg8, 1, var15, arg1, 1, arg7, var20, 0);
            if (var16.field961) {
                arg0.method361(arg3, arg7, var16.field962, arg8, var16.field959, 6, var16.field960);
            }
        } else if (arg9 == 0) {
            Entity var21;
            if (var16.field967 == -1 && var16.field986 == null) {
                var21 = var16.method336(0, arg3, var11, var12, var13, var14, -1);
            } else {
                var21 = new LocEntity(var16.field967, var13, -530, var11, true, arg3, var12, 0, var14, arg2);
            }
            arg10.method58(arg7, var21, field62[arg3], var15, null, arg1, arg8, false, 0, var17, var18);
            if (var16.field961) {
                arg0.method360(arg7, var16.field962, 0, arg9, arg8, arg3);
            }
        } else if (arg9 == 1) {
            Entity var22;
            if (var16.field967 == -1 && var16.field986 == null) {
                var22 = var16.method336(1, arg3, var11, var12, var13, var14, -1);
            } else {
                var22 = new LocEntity(var16.field967, var13, -530, var11, true, arg3, var12, 1, var14, arg2);
            }
            arg10.method58(arg7, var22, field63[arg3], var15, null, arg1, arg8, false, 0, var17, var18);
            if (var16.field961) {
                arg0.method360(arg7, var16.field962, 0, arg9, arg8, arg3);
            }
        } else if (arg9 == 2) {
            int var23 = arg3 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var16.field967 == -1 && var16.field986 == null) {
                var24 = var16.method336(2, arg3 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method336(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new LocEntity(var16.field967, var13, -530, var11, true, arg3 + 4, var12, 2, var14, arg2);
                var25 = new LocEntity(var16.field967, var13, -530, var11, true, var23, var12, 2, var14, arg2);
            }
            arg10.method58(arg7, var24, field62[arg3], var15, var25, arg1, arg8, false, field62[var23], var17, var18);
            if (var16.field961) {
                arg0.method360(arg7, var16.field962, 0, arg9, arg8, arg3);
            }
        } else if (arg9 == 3) {
            Entity var26;
            if (var16.field967 == -1 && var16.field986 == null) {
                var26 = var16.method336(3, arg3, var11, var12, var13, var14, -1);
            } else {
                var26 = new LocEntity(var16.field967, var13, -530, var11, true, arg3, var12, 3, var14, arg2);
            }
            arg10.method58(arg7, var26, field63[arg3], var15, null, arg1, arg8, false, 0, var17, var18);
            if (var16.field961) {
                arg0.method360(arg7, var16.field962, 0, arg9, arg8, arg3);
            }
        } else if (arg9 == 9) {
            Entity var27;
            if (var16.field967 == -1 && var16.field986 == null) {
                var27 = var16.method336(arg9, arg3, var11, var12, var13, var14, -1);
            } else {
                var27 = new LocEntity(var16.field967, var13, -530, var11, true, arg3, var12, arg9, var14, arg2);
            }
            arg10.method60(var17, false, var18, arg8, 1, var15, arg1, 1, arg7, var27, 0);
            if (var16.field961) {
                arg0.method361(arg3, arg7, var16.field962, arg8, var16.field959, 6, var16.field960);
            }
        } else {
            if (var16.field964) {
                if (arg3 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg3 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg3 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg9 == 4) {
                Entity var32;
                if (var16.field967 == -1 && var16.field986 == null) {
                    var32 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new LocEntity(var16.field967, var13, -530, var11, true, 0, var12, 4, var14, arg2);
                }
                arg10.method59(0, arg8, arg7, arg3 * 512, var15, var17, field62[arg3], var32, 0, arg1, -60, var18);
            } else if (arg9 == 5) {
                int var33 = 16;
                int var34 = arg10.method76(arg1, arg7, arg8);
                if (var34 > 0) {
                    var33 = LocType.method330(var34 >> 14 & 0x7FFF).field968;
                }
                Entity var35;
                if (var16.field967 == -1 && var16.field986 == null) {
                    var35 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new LocEntity(var16.field967, var13, -530, var11, true, 0, var12, 4, var14, arg2);
                }
                arg10.method59(field64[arg3] * var33, arg8, arg7, arg3 * 512, var15, var17, field62[arg3], var35, field65[arg3] * var33, arg1, -60, var18);
            } else if (arg9 == 6) {
                Entity var36;
                if (var16.field967 == -1 && var16.field986 == null) {
                    var36 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new LocEntity(var16.field967, var13, -530, var11, true, 0, var12, 4, var14, arg2);
                }
                arg10.method59(0, arg8, arg7, arg3, var15, var17, 256, var36, 0, arg1, -60, var18);
            } else if (arg9 == 7) {
                Entity var37;
                if (var16.field967 == -1 && var16.field986 == null) {
                    var37 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new LocEntity(var16.field967, var13, -530, var11, true, 0, var12, 4, var14, arg2);
                }
                arg10.method59(0, arg8, arg7, arg3, var15, var17, 512, var37, 0, arg1, -60, var18);
            } else if (arg9 == 8) {
                Entity var38;
                if (var16.field967 == -1 && var16.field986 == null) {
                    var38 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new LocEntity(var16.field967, var13, -530, var11, true, 0, var12, 4, var14, arg2);
                }
                arg10.method59(0, arg8, arg7, arg3, var15, var17, 768, var38, 0, arg1, -60, var18);
            }
        }
    }
}
