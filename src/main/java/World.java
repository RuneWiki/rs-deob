import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "b", descriptor = "I")
    private int field38 = 8;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "c", name = "h", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "c", name = "i", descriptor = "[[[I")
    private int[][][] field45;

    @OriginalMember(owner = "c", name = "j", descriptor = "[[[B")
    private byte[][][] field46;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[B")
    private byte[][][] field47;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field48;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field49;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field50;

    @OriginalMember(owner = "c", name = "v", descriptor = "[[[I")
    private int[][][] field58;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field51;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[I")
    private int[][] field52;

    @OriginalMember(owner = "c", name = "q", descriptor = "[I")
    private int[] field53;

    @OriginalMember(owner = "c", name = "r", descriptor = "[I")
    private int[] field54;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field55;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field57;

    @OriginalMember(owner = "c", name = "c", descriptor = "I")
    private static int field39 = 3;

    @OriginalMember(owner = "c", name = "d", descriptor = "I")
    private static int field40 = 650;

    @OriginalMember(owner = "c", name = "e", descriptor = "Z")
    public static boolean field41 = true;

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private static final int[] field59 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private static final int[] field60 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field61 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field62 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "A", descriptor = "I")
    private static int field63 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "c", name = "B", descriptor = "I")
    private static int field64 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "c", name = "f", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "c", name = "a", descriptor = "Z")
    private static boolean field37;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "(I[[[II[[[BI)V")
    public World(int arg0, int[][][] arg1, int arg2, byte[][][] arg3, int arg4) {
        if (arg4 != 0) {
            throw new NullPointerException();
        }
        this.field43 = arg0;
        this.field44 = arg2;
        this.field45 = arg1;
        this.field46 = arg3;
        this.field47 = new byte[4][this.field43][this.field44];
        this.field48 = new byte[4][this.field43][this.field44];
        this.field49 = new byte[4][this.field43][this.field44];
        this.field50 = new byte[4][this.field43][this.field44];
        this.field58 = new int[4][this.field43 + 1][this.field44 + 1];
        this.field51 = new byte[4][this.field43 + 1][this.field44 + 1];
        this.field52 = new int[this.field43 + 1][this.field44 + 1];
        this.field53 = new int[this.field44];
        this.field54 = new int[this.field44];
        this.field55 = new int[this.field44];
        this.field56 = new int[this.field44];
        this.field57 = new int[this.field44];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIII)V")
    public final void method14(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
            for (int var8 = arg0; var8 <= arg0 + arg1; var8++) {
                if (var8 >= 0 && var8 < this.field43 && var6 >= 0 && var6 < this.field44) {
                    this.field51[0][var8][var6] = 127;
                    if (arg0 == var8 && var8 > 0) {
                        this.field45[0][var8][var6] = this.field45[0][var8 - 1][var6];
                    }
                    if (arg0 + arg1 == var8 && var8 < this.field43 - 1) {
                        this.field45[0][var8][var6] = this.field45[0][var8 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field45[0][var8][var6] = this.field45[0][var8][var6 - 1];
                    }
                    if (arg2 + arg3 == var6 && var6 < this.field44 - 1) {
                        this.field45[0][var8][var6] = this.field45[0][var8][var6 + 1];
                    }
                }
            }
        }
        if (arg4 <= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIII[BI)V")
    public final void method15(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        Packet var7 = new Packet(arg4, (byte) -93);
        int var8 = 37 / arg3;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    int var12 = arg5 + var10;
                    int var13 = arg0 + var11;
                    if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                        this.field46[var9][var12][var13] = 0;
                        while (true) {
                            int var14 = var7.method229();
                            if (var14 == 0) {
                                if (var9 == 0) {
                                    this.field45[0][var12][var13] = -method22(var12 + arg2 + 932731, var13 + 556238 + arg1) * 8;
                                } else {
                                    this.field45[var9][var12][var13] = this.field45[var9 - 1][var12][var13] - 240;
                                }
                                break;
                            }
                            if (var14 == 1) {
                                int var15 = var7.method229();
                                if (var15 == 1) {
                                    var15 = 0;
                                }
                                if (var9 == 0) {
                                    this.field45[0][var12][var13] = -var15 * 8;
                                } else {
                                    this.field45[var9][var12][var13] = this.field45[var9 - 1][var12][var13] - var15 * 8;
                                }
                                break;
                            }
                            if (var14 <= 49) {
                                this.field48[var9][var12][var13] = var7.method230();
                                this.field49[var9][var12][var13] = (byte) ((var14 - 2) / 4);
                                this.field50[var9][var12][var13] = (byte) (var14 - 2 & 0x3);
                            } else if (var14 <= 81) {
                                this.field46[var9][var12][var13] = (byte) (var14 - 49);
                            } else {
                                this.field47[var9][var12][var13] = (byte) (var14 - 81);
                            }
                        }
                    } else {
                        while (true) {
                            int var16 = var7.method229();
                            if (var16 == 0) {
                                break;
                            }
                            if (var16 == 1) {
                                var7.method229();
                                break;
                            }
                            if (var16 <= 49) {
                                var7.method229();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(III[B)Z")
    public static final boolean method16(int arg0, int arg1, int arg2, byte[] arg3) {
        boolean var4 = true;
        Packet var5 = new Packet(arg3, (byte) -93);
        if (arg2 != 0) {
            field37 = !field37;
        }
        int var6 = -1;
        label59: while (true) {
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
                        continue label59;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method229() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.method330(var6);
                        if (var14 != 22 || !field41 || var17.field968 || var17.field988) {
                            var4 &= var17.method334(false);
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lub;ILlb;)V")
    public static final void method17(OnDemand arg0, int arg1, Packet arg2) {
        int var3 = -1;
        int var4 = 54 / arg1;
        while (true) {
            int var5 = arg2.method243();
            if (var5 == 0) {
                return;
            }
            var3 += var5;
            LocType var6 = LocType.method330(var3);
            var6.method335(arg0, (byte) 9);
            while (true) {
                int var7 = arg2.method243();
                if (var7 == 0) {
                    break;
                }
                arg2.method229();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([Ljc;[BBILr;I)V")
    public final void method18(CollisionMap[] arg0, byte[] arg1, byte arg2, int arg3, World3D arg4, int arg5) {
        if (arg2 != 9) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        Packet var8 = new Packet(arg1, (byte) -93);
        int var9 = -1;
        while (true) {
            int var10 = var8.method243();
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method243();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var8.method229();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg5 + var14;
                int var20 = arg3 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field46[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    CollisionMap var22 = null;
                    if (var21 >= 0) {
                        var22 = arg0[var21];
                    }
                    this.method19(var9, var17, var19, var18, 936, var20, var15, var22, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIIIIILjc;Lr;)V")
    private final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, CollisionMap arg7, World3D arg8) {
        if (field41) {
            if ((this.field46[arg6][arg2][arg5] & 0x10) != 0) {
                return;
            }
            if (this.method21(856, arg5, arg2, arg6) != field42) {
                return;
            }
        }
        int var10 = this.field45[arg6][arg2][arg5];
        int var11 = this.field45[arg6][arg2 + 1][arg5];
        int var12 = this.field45[arg6][arg2 + 1][arg5 + 1];
        int var13 = this.field45[arg6][arg2][arg5 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        int var15 = 79 / arg4;
        LocType var16 = LocType.method330(arg0);
        int var17 = (arg0 << 14) + (arg5 << 7) + arg2 + 1073741824;
        if (!var16.field968) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg3 << 6) + arg1);
        if (arg1 == 22) {
            if (!field41 || var16.field968 || var16.field988) {
                Entity var19;
                if (var16.field972 == -1 && var16.field991 == null) {
                    var19 = var16.method336(22, arg3, var10, var11, var12, var13, -1);
                } else {
                    var19 = new LocEntity(var16.field972, true, 22, arg3, var11, (byte) 86, arg0, var12, var10, var13);
                }
                arg8.method56(var14, arg6, arg5, var18, false, arg2, var19, var17);
                if (var16.field966 && var16.field968 && arg7 != null) {
                    arg7.method362(arg2, false, arg5);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            Entity var39;
            if (var16.field972 == -1 && var16.field991 == null) {
                var39 = var16.method336(10, arg3, var10, var11, var12, var13, -1);
            } else {
                var39 = new LocEntity(var16.field972, true, 10, arg3, var11, (byte) 86, arg0, var12, var10, var13);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg1 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg3 == 1 || arg3 == 3) {
                    var41 = var16.field965;
                    var42 = var16.field964;
                } else {
                    var41 = var16.field964;
                    var42 = var16.field965;
                }
                if (arg8.method60(var17, arg2, arg5, var41, var39, arg6, var40, var42, var14, var18, -41487) && var16.field980) {
                    Model var43;
                    if (var39 instanceof Model) {
                        var43 = (Model) var39;
                    } else {
                        var43 = var16.method336(10, arg3, var10, var11, var12, var13, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field561 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field51[arg6][arg2 + var44][arg5 + var45]) {
                                    this.field51[arg6][arg2 + var44][arg5 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var16.field966 && arg7 != null) {
                arg7.method361(var16.field964, arg5, var16.field965, var16.field967, arg3, false, arg2);
            }
        } else if (arg1 >= 12) {
            Entity var20;
            if (var16.field972 == -1 && var16.field991 == null) {
                var20 = var16.method336(arg1, arg3, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(var16.field972, true, arg1, arg3, var11, (byte) 86, arg0, var12, var10, var13);
            }
            arg8.method60(var17, arg2, arg5, 1, var20, arg6, 0, 1, var14, var18, -41487);
            if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg6 > 0) {
                this.field58[arg6][arg2][arg5] |= 0x924;
            }
            if (var16.field966 && arg7 != null) {
                arg7.method361(var16.field964, arg5, var16.field965, var16.field967, arg3, false, arg2);
            }
        } else if (arg1 == 0) {
            Entity var21;
            if (var16.field972 == -1 && var16.field991 == null) {
                var21 = var16.method336(0, arg3, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(var16.field972, true, 0, arg3, var11, (byte) 86, arg0, var12, var10, var13);
            }
            arg8.method58(var18, arg5, var21, var14, 0, 260, arg2, null, var17, field59[arg3], arg6);
            if (arg3 == 0) {
                if (var16.field980) {
                    this.field51[arg6][arg2][arg5] = 50;
                    this.field51[arg6][arg2][arg5 + 1] = 50;
                }
                if (var16.field971) {
                    this.field58[arg6][arg2][arg5] |= 0x249;
                }
            } else if (arg3 == 1) {
                if (var16.field980) {
                    this.field51[arg6][arg2][arg5 + 1] = 50;
                    this.field51[arg6][arg2 + 1][arg5 + 1] = 50;
                }
                if (var16.field971) {
                    this.field58[arg6][arg2][arg5 + 1] |= 0x492;
                }
            } else if (arg3 == 2) {
                if (var16.field980) {
                    this.field51[arg6][arg2 + 1][arg5] = 50;
                    this.field51[arg6][arg2 + 1][arg5 + 1] = 50;
                }
                if (var16.field971) {
                    this.field58[arg6][arg2 + 1][arg5] |= 0x249;
                }
            } else if (arg3 == 3) {
                if (var16.field980) {
                    this.field51[arg6][arg2][arg5] = 50;
                    this.field51[arg6][arg2 + 1][arg5] = 50;
                }
                if (var16.field971) {
                    this.field58[arg6][arg2][arg5] |= 0x492;
                }
            }
            if (var16.field966 && arg7 != null) {
                arg7.method360(arg1, arg5, arg2, arg3, (byte) 1, var16.field967);
            }
            if (var16.field973 != 16) {
                arg8.method66(arg5, var16.field973, true, arg6, arg2);
            }
        } else if (arg1 == 1) {
            Entity var22;
            if (var16.field972 == -1 && var16.field991 == null) {
                var22 = var16.method336(1, arg3, var10, var11, var12, var13, -1);
            } else {
                var22 = new LocEntity(var16.field972, true, 1, arg3, var11, (byte) 86, arg0, var12, var10, var13);
            }
            arg8.method58(var18, arg5, var22, var14, 0, 260, arg2, null, var17, field60[arg3], arg6);
            if (var16.field980) {
                if (arg3 == 0) {
                    this.field51[arg6][arg2][arg5 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field51[arg6][arg2 + 1][arg5 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field51[arg6][arg2 + 1][arg5] = 50;
                } else if (arg3 == 3) {
                    this.field51[arg6][arg2][arg5] = 50;
                }
            }
            if (var16.field966 && arg7 != null) {
                arg7.method360(arg1, arg5, arg2, arg3, (byte) 1, var16.field967);
            }
        } else if (arg1 == 2) {
            int var23 = arg3 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var16.field972 == -1 && var16.field991 == null) {
                var24 = var16.method336(2, arg3 + 4, var10, var11, var12, var13, -1);
                var25 = var16.method336(2, var23, var10, var11, var12, var13, -1);
            } else {
                var24 = new LocEntity(var16.field972, true, 2, arg3 + 4, var11, (byte) 86, arg0, var12, var10, var13);
                var25 = new LocEntity(var16.field972, true, 2, var23, var11, (byte) 86, arg0, var12, var10, var13);
            }
            arg8.method58(var18, arg5, var24, var14, field59[var23], 260, arg2, var25, var17, field59[arg3], arg6);
            if (var16.field971) {
                if (arg3 == 0) {
                    this.field58[arg6][arg2][arg5] |= 0x249;
                    this.field58[arg6][arg2][arg5 + 1] |= 0x492;
                } else if (arg3 == 1) {
                    this.field58[arg6][arg2][arg5 + 1] |= 0x492;
                    this.field58[arg6][arg2 + 1][arg5] |= 0x249;
                } else if (arg3 == 2) {
                    this.field58[arg6][arg2 + 1][arg5] |= 0x249;
                    this.field58[arg6][arg2][arg5] |= 0x492;
                } else if (arg3 == 3) {
                    this.field58[arg6][arg2][arg5] |= 0x492;
                    this.field58[arg6][arg2][arg5] |= 0x249;
                }
            }
            if (var16.field966 && arg7 != null) {
                arg7.method360(arg1, arg5, arg2, arg3, (byte) 1, var16.field967);
            }
            if (var16.field973 != 16) {
                arg8.method66(arg5, var16.field973, true, arg6, arg2);
            }
        } else if (arg1 == 3) {
            Entity var26;
            if (var16.field972 == -1 && var16.field991 == null) {
                var26 = var16.method336(3, arg3, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(var16.field972, true, 3, arg3, var11, (byte) 86, arg0, var12, var10, var13);
            }
            arg8.method58(var18, arg5, var26, var14, 0, 260, arg2, null, var17, field60[arg3], arg6);
            if (var16.field980) {
                if (arg3 == 0) {
                    this.field51[arg6][arg2][arg5 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field51[arg6][arg2 + 1][arg5 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field51[arg6][arg2 + 1][arg5] = 50;
                } else if (arg3 == 3) {
                    this.field51[arg6][arg2][arg5] = 50;
                }
            }
            if (var16.field966 && arg7 != null) {
                arg7.method360(arg1, arg5, arg2, arg3, (byte) 1, var16.field967);
            }
        } else if (arg1 == 9) {
            Entity var27;
            if (var16.field972 == -1 && var16.field991 == null) {
                var27 = var16.method336(arg1, arg3, var10, var11, var12, var13, -1);
            } else {
                var27 = new LocEntity(var16.field972, true, arg1, arg3, var11, (byte) 86, arg0, var12, var10, var13);
            }
            arg8.method60(var17, arg2, arg5, 1, var27, arg6, 0, 1, var14, var18, -41487);
            if (var16.field966 && arg7 != null) {
                arg7.method361(var16.field964, arg5, var16.field965, var16.field967, arg3, false, arg2);
            }
        } else {
            if (var16.field969) {
                if (arg3 == 1) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg3 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg3 == 3) {
                    int var31 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var31;
                }
            }
            if (arg1 == 4) {
                Entity var32;
                if (var16.field972 == -1 && var16.field991 == null) {
                    var32 = var16.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var32 = new LocEntity(var16.field972, true, 4, 0, var11, (byte) 86, arg0, var12, var10, var13);
                }
                arg8.method59(arg2, 0, 0, arg6, var17, 0, arg5, var14, var32, var18, field59[arg3], arg3 * 512);
            } else if (arg1 == 5) {
                int var33 = 16;
                int var34 = arg8.method76(arg6, arg2, arg5);
                if (var34 > 0) {
                    var33 = LocType.method330(var34 >> 14 & 0x7FFF).field973;
                }
                Entity var35;
                if (var16.field972 == -1 && var16.field991 == null) {
                    var35 = var16.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new LocEntity(var16.field972, true, 4, 0, var11, (byte) 86, arg0, var12, var10, var13);
                }
                arg8.method59(arg2, 0, field62[arg3] * var33, arg6, var17, field61[arg3] * var33, arg5, var14, var35, var18, field59[arg3], arg3 * 512);
            } else if (arg1 == 6) {
                Entity var36;
                if (var16.field972 == -1 && var16.field991 == null) {
                    var36 = var16.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new LocEntity(var16.field972, true, 4, 0, var11, (byte) 86, arg0, var12, var10, var13);
                }
                arg8.method59(arg2, 0, 0, arg6, var17, 0, arg5, var14, var36, var18, 256, arg3);
            } else if (arg1 == 7) {
                Entity var37;
                if (var16.field972 == -1 && var16.field991 == null) {
                    var37 = var16.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new LocEntity(var16.field972, true, 4, 0, var11, (byte) 86, arg0, var12, var10, var13);
                }
                arg8.method59(arg2, 0, 0, arg6, var17, 0, arg5, var14, var37, var18, 512, arg3);
            } else if (arg1 == 8) {
                Entity var38;
                if (var16.field972 == -1 && var16.field991 == null) {
                    var38 = var16.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var38 = new LocEntity(var16.field972, true, 4, 0, var11, (byte) 86, arg0, var12, var10, var13);
                }
                arg8.method59(arg2, 0, 0, arg6, var17, 0, arg5, var14, var38, var18, 768, arg3);
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;[Ljc;I)V")
    public final void method20(World3D arg0, CollisionMap[] arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field46[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field46[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method362(var110, false, var111);
                        }
                    }
                }
            }
        }
        field63 += (int) (Math.random() * 5.0D) - 2;
        if (field63 < -8) {
            field63 = -8;
        }
        if (field63 > 8) {
            field63 = 8;
        }
        field64 += (int) (Math.random() * 5.0D) - 2;
        if (field64 < -16) {
            field64 = -16;
        }
        if (field64 > 16) {
            field64 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field51[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field44 - 1; var56++) {
                for (int var101 = 1; var101 < this.field43 - 1; var101++) {
                    int var102 = this.field45[var5][var101 + 1][var56] - this.field45[var5][var101 - 1][var56];
                    int var103 = this.field45[var5][var101][var56 + 1] - this.field45[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field52[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field44; var57++) {
                this.field53[var57] = 0;
                this.field54[var57] = 0;
                this.field55[var57] = 0;
                this.field56[var57] = 0;
                this.field57[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field43 + 5; var58++) {
                for (int var61 = 0; var61 < this.field44; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field43) {
                        int var96 = this.field47[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            FloType var97 = FloType.field1106[var96 - 1];
                            this.field53[var61] += var97.field1115;
                            this.field54[var61] += var97.field1113;
                            this.field55[var61] += var97.field1114;
                            this.field56[var61] += var97.field1116;
                            var10002 = this.field57[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field43) {
                        int var99 = this.field47[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.field1106[var99 - 1];
                            this.field53[var61] -= var100.field1115;
                            this.field54[var61] -= var100.field1113;
                            this.field55[var61] -= var100.field1114;
                            this.field56[var61] -= var100.field1116;
                            var10002 = this.field57[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field43 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field44 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field44) {
                            var62 += this.field53[var68];
                            var63 += this.field54[var68];
                            var64 += this.field55[var68];
                            var65 += this.field56[var68];
                            var66 += this.field57[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field44) {
                            var62 -= this.field53[var69];
                            var63 -= this.field54[var69];
                            var64 -= this.field55[var69];
                            var65 -= this.field56[var69];
                            var66 -= this.field57[var69];
                        }
                        if (var67 >= 1 && var67 < this.field44 - 1 && (!field41 || (this.field46[var5][var58][var67] & 0x10) == 0 && this.method21(856, var67, var58, var5) == field42)) {
                            int var70 = this.field47[var5][var58][var67] & 0xFF;
                            int var71 = this.field48[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field45[var5][var58][var67];
                                int var73 = this.field45[var5][var58 + 1][var67];
                                int var74 = this.field45[var5][var58 + 1][var67 + 1];
                                int var75 = this.field45[var5][var58][var67 + 1];
                                int var76 = this.field52[var58][var67];
                                int var77 = this.field52[var58 + 1][var67];
                                int var78 = this.field52[var58 + 1][var67 + 1];
                                int var79 = this.field52[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method29(var82, var83, var84);
                                    int var85 = field63 + var82 & 0xFF;
                                    int var86 = field64 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method29(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field49[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !FloType.field1106[var71 - 1].field1111) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field58[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Pix3D.field655[method27(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method55(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field49[var5][var58][var67] + 1;
                                    byte var90 = this.field50[var5][var58][var67];
                                    FloType var91 = FloType.field1106[var71 - 1];
                                    int var92 = var91.field1109;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Pix3D.method170(574, var92);
                                        var94 = -1;
                                    } else if (var91.field1108 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method29(var91.field1112, var91.field1113, var91.field1114);
                                        var93 = Pix3D.field655[this.method28(var91.field1117, 96)];
                                    }
                                    arg0.method55(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), this.method28(var94, var76), this.method28(var94, var77), this.method28(var94, var78), this.method28(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field44 - 1; var59++) {
                for (int var60 = 1; var60 < this.field43 - 1; var60++) {
                    arg0.method54(var5, var60, var59, this.method21(856, var59, var60, var5));
                }
            }
        }
        arg0.method81(-10, -50, 768, 9, 64, -50);
        for (int var6 = 0; var6 < this.field43; var6++) {
            for (int var47 = 0; var47 < this.field44; var47++) {
                if ((this.field46[1][var6][var47] & 0x2) == 2) {
                    arg0.method52(var6, var47, -45934);
                }
            }
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        while (arg2 >= 0) {
            this.field38 = 105;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.field44; var12++) {
                    for (int var13 = 0; var13 <= this.field43; var13++) {
                        if ((this.field58[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field58[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field44 && (this.field58[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label325: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field58[var16 - 1][var13][var18] & var7) == 0) {
                                        break label325;
                                    }
                                }
                                var16--;
                            }
                            label314: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field58[var17 + 1][var13][var19] & var7) == 0) {
                                        break label314;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field45[var17][var13][var14] - var21;
                                int var23 = this.field45[var16][var13][var14];
                                World3D.method53(var15 * 128 + 128, var10, var14 * 128, var13 * 128, var23, var22, var13 * 128, 183, 1);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field58[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field58[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field58[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field43 && (this.field58[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label378: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field58[var28 - 1][var30][var12] & var8) == 0) {
                                        break label378;
                                    }
                                }
                                var28--;
                            }
                            label367: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field58[var29 + 1][var31][var12] & var8) == 0) {
                                        break label367;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field45[var29][var26][var12] - var33;
                                int var35 = this.field45[var28][var26][var12];
                                World3D.method53(var12 * 128, var10, var12 * 128, var27 * 128 + 128, var35, var34, var26 * 128, 183, 2);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field58[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field58[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field58[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field44 && (this.field58[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label431: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field58[var11][var38 - 1][var42] & var9) == 0) {
                                        break label431;
                                    }
                                }
                                var38--;
                            }
                            label420: while (var39 < this.field43) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field58[var11][var39 + 1][var43] & var9) == 0) {
                                        break label420;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field45[var11][var38][var40];
                                World3D.method53(var41 * 128 + 128, var10, var40 * 128, var39 * 128 + 128, var44, var44, var38 * 128, 183, 4);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field58[var11][var45][var46] &= ~var9;
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
    public int method21(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 23 / arg0;
        if ((this.field46[arg3][arg2][arg1] & 0x8) == 0) {
            return arg3 <= 0 || (this.field46[1][arg2][arg1] & 0x2) == 0 ? arg3 : arg3 - 1;
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

    @OriginalMember(owner = "c", name = "b", descriptor = "(IIII)I")
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIB)Z")
    public static final boolean method30(int arg0, int arg1, byte arg2) {
        if (arg2 != 3) {
            field40 = -178;
        }
        LocType var3 = LocType.method330(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method333(0, arg1);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IZILr;ILjc;I[[[IIII)V")
    public static final void method31(int arg0, boolean arg1, int arg2, World3D arg3, int arg4, CollisionMap arg5, int arg6, int[][][] arg7, int arg8, int arg9, int arg10) {
        int var11 = arg7[arg9][arg8][arg4];
        int var12 = arg7[arg9][arg8 + 1][arg4];
        int var13 = arg7[arg9][arg8 + 1][arg4 + 1];
        int var14 = arg7[arg9][arg8][arg4 + 1];
        if (!arg1) {
            field39 = 70;
        }
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method330(arg10);
        int var17 = (arg10 << 14) + (arg4 << 7) + arg8 + 1073741824;
        if (!var16.field968) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg0 << 6) + arg6);
        if (arg6 == 22) {
            Entity var19;
            if (var16.field972 == -1 && var16.field991 == null) {
                var19 = var16.method336(22, arg0, var11, var12, var13, var14, -1);
            } else {
                var19 = new LocEntity(var16.field972, true, 22, arg0, var12, (byte) 86, arg10, var13, var11, var14);
            }
            arg3.method56(var15, arg2, arg4, var18, false, arg8, var19, var17);
            if (var16.field966 && var16.field968) {
                arg5.method362(arg8, false, arg4);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            Entity var39;
            if (var16.field972 == -1 && var16.field991 == null) {
                var39 = var16.method336(10, arg0, var11, var12, var13, var14, -1);
            } else {
                var39 = new LocEntity(var16.field972, true, 10, arg0, var12, (byte) 86, arg10, var13, var11, var14);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg6 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg0 == 1 || arg0 == 3) {
                    var41 = var16.field965;
                    var42 = var16.field964;
                } else {
                    var41 = var16.field964;
                    var42 = var16.field965;
                }
                arg3.method60(var17, arg8, arg4, var41, var39, arg2, var40, var42, var15, var18, -41487);
            }
            if (var16.field966) {
                arg5.method361(var16.field964, arg4, var16.field965, var16.field967, arg0, false, arg8);
            }
        } else if (arg6 >= 12) {
            Entity var20;
            if (var16.field972 == -1 && var16.field991 == null) {
                var20 = var16.method336(arg6, arg0, var11, var12, var13, var14, -1);
            } else {
                var20 = new LocEntity(var16.field972, true, arg6, arg0, var12, (byte) 86, arg10, var13, var11, var14);
            }
            arg3.method60(var17, arg8, arg4, 1, var20, arg2, 0, 1, var15, var18, -41487);
            if (var16.field966) {
                arg5.method361(var16.field964, arg4, var16.field965, var16.field967, arg0, false, arg8);
            }
        } else if (arg6 == 0) {
            Entity var21;
            if (var16.field972 == -1 && var16.field991 == null) {
                var21 = var16.method336(0, arg0, var11, var12, var13, var14, -1);
            } else {
                var21 = new LocEntity(var16.field972, true, 0, arg0, var12, (byte) 86, arg10, var13, var11, var14);
            }
            arg3.method58(var18, arg4, var21, var15, 0, 260, arg8, null, var17, field59[arg0], arg2);
            if (var16.field966) {
                arg5.method360(arg6, arg4, arg8, arg0, (byte) 1, var16.field967);
            }
        } else if (arg6 == 1) {
            Entity var22;
            if (var16.field972 == -1 && var16.field991 == null) {
                var22 = var16.method336(1, arg0, var11, var12, var13, var14, -1);
            } else {
                var22 = new LocEntity(var16.field972, true, 1, arg0, var12, (byte) 86, arg10, var13, var11, var14);
            }
            arg3.method58(var18, arg4, var22, var15, 0, 260, arg8, null, var17, field60[arg0], arg2);
            if (var16.field966) {
                arg5.method360(arg6, arg4, arg8, arg0, (byte) 1, var16.field967);
            }
        } else if (arg6 == 2) {
            int var23 = arg0 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var16.field972 == -1 && var16.field991 == null) {
                var24 = var16.method336(2, arg0 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method336(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new LocEntity(var16.field972, true, 2, arg0 + 4, var12, (byte) 86, arg10, var13, var11, var14);
                var25 = new LocEntity(var16.field972, true, 2, var23, var12, (byte) 86, arg10, var13, var11, var14);
            }
            arg3.method58(var18, arg4, var24, var15, field59[var23], 260, arg8, var25, var17, field59[arg0], arg2);
            if (var16.field966) {
                arg5.method360(arg6, arg4, arg8, arg0, (byte) 1, var16.field967);
            }
        } else if (arg6 == 3) {
            Entity var26;
            if (var16.field972 == -1 && var16.field991 == null) {
                var26 = var16.method336(3, arg0, var11, var12, var13, var14, -1);
            } else {
                var26 = new LocEntity(var16.field972, true, 3, arg0, var12, (byte) 86, arg10, var13, var11, var14);
            }
            arg3.method58(var18, arg4, var26, var15, 0, 260, arg8, null, var17, field60[arg0], arg2);
            if (var16.field966) {
                arg5.method360(arg6, arg4, arg8, arg0, (byte) 1, var16.field967);
            }
        } else if (arg6 == 9) {
            Entity var27;
            if (var16.field972 == -1 && var16.field991 == null) {
                var27 = var16.method336(arg6, arg0, var11, var12, var13, var14, -1);
            } else {
                var27 = new LocEntity(var16.field972, true, arg6, arg0, var12, (byte) 86, arg10, var13, var11, var14);
            }
            arg3.method60(var17, arg8, arg4, 1, var27, arg2, 0, 1, var15, var18, -41487);
            if (var16.field966) {
                arg5.method361(var16.field964, arg4, var16.field965, var16.field967, arg0, false, arg8);
            }
        } else {
            if (var16.field969) {
                if (arg0 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg0 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg0 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg6 == 4) {
                Entity var32;
                if (var16.field972 == -1 && var16.field991 == null) {
                    var32 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new LocEntity(var16.field972, true, 4, 0, var12, (byte) 86, arg10, var13, var11, var14);
                }
                arg3.method59(arg8, 0, 0, arg2, var17, 0, arg4, var15, var32, var18, field59[arg0], arg0 * 512);
            } else if (arg6 == 5) {
                int var33 = 16;
                int var34 = arg3.method76(arg2, arg8, arg4);
                if (var34 > 0) {
                    var33 = LocType.method330(var34 >> 14 & 0x7FFF).field973;
                }
                Entity var35;
                if (var16.field972 == -1 && var16.field991 == null) {
                    var35 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new LocEntity(var16.field972, true, 4, 0, var12, (byte) 86, arg10, var13, var11, var14);
                }
                arg3.method59(arg8, 0, field62[arg0] * var33, arg2, var17, field61[arg0] * var33, arg4, var15, var35, var18, field59[arg0], arg0 * 512);
            } else if (arg6 == 6) {
                Entity var36;
                if (var16.field972 == -1 && var16.field991 == null) {
                    var36 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new LocEntity(var16.field972, true, 4, 0, var12, (byte) 86, arg10, var13, var11, var14);
                }
                arg3.method59(arg8, 0, 0, arg2, var17, 0, arg4, var15, var36, var18, 256, arg0);
            } else if (arg6 == 7) {
                Entity var37;
                if (var16.field972 == -1 && var16.field991 == null) {
                    var37 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new LocEntity(var16.field972, true, 4, 0, var12, (byte) 86, arg10, var13, var11, var14);
                }
                arg3.method59(arg8, 0, 0, arg2, var17, 0, arg4, var15, var37, var18, 512, arg0);
            } else if (arg6 == 8) {
                Entity var38;
                if (var16.field972 == -1 && var16.field991 == null) {
                    var38 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new LocEntity(var16.field972, true, 4, 0, var12, (byte) 86, arg10, var13, var11, var14);
                }
                arg3.method59(arg8, 0, 0, arg2, var17, 0, arg4, var15, var38, var18, 768, arg0);
            }
        }
    }
}
