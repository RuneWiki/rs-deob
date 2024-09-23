import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "d", descriptor = "I")
    private int field42 = 42522;

    @OriginalMember(owner = "c", name = "e", descriptor = "B")
    private byte field43 = 111;

    @OriginalMember(owner = "c", name = "h", descriptor = "I")
    private int field46;

    @OriginalMember(owner = "c", name = "i", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "c", name = "j", descriptor = "[[[I")
    private int[][][] field48;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[B")
    private byte[][][] field49;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field50;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field51;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field52;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field53;

    @OriginalMember(owner = "c", name = "w", descriptor = "[[[I")
    private int[][][] field61;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[[B")
    private byte[][][] field54;

    @OriginalMember(owner = "c", name = "q", descriptor = "[[I")
    private int[][] field55;

    @OriginalMember(owner = "c", name = "r", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field57;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field58;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field59;

    @OriginalMember(owner = "c", name = "v", descriptor = "[I")
    private int[] field60;

    @OriginalMember(owner = "c", name = "a", descriptor = "B")
    private static byte field39 = 6;

    @OriginalMember(owner = "c", name = "f", descriptor = "Z")
    public static boolean field44 = true;

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private static final int[] field62 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field63 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field64 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "A", descriptor = "[I")
    private static final int[] field65 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "B", descriptor = "I")
    private static int field66 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "c", name = "C", descriptor = "I")
    private static int field67 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "c", name = "b", descriptor = "Z")
    private static boolean field40;

    @OriginalMember(owner = "c", name = "c", descriptor = "Z")
    private static boolean field41;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "(III[[[I[[[B)V")
    public World(int arg0, int arg1, int arg2, int[][][] arg3, byte[][][] arg4) {
        if (arg0 < 9 || arg0 > 9) {
            throw new NullPointerException();
        }
        this.field46 = arg2;
        this.field47 = arg1;
        this.field48 = arg3;
        this.field49 = arg4;
        this.field50 = new byte[4][this.field46][this.field47];
        this.field51 = new byte[4][this.field46][this.field47];
        this.field52 = new byte[4][this.field46][this.field47];
        this.field53 = new byte[4][this.field46][this.field47];
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
        for (int var6 = arg4; var6 <= arg2 + arg4; var6++) {
            for (int var8 = arg1; var8 <= arg1 + arg3; var8++) {
                if (var8 >= 0 && var8 < this.field46 && var6 >= 0 && var6 < this.field47) {
                    this.field54[0][var8][var6] = 127;
                    if (arg1 == var8 && var8 > 0) {
                        this.field48[0][var8][var6] = this.field48[0][var8 - 1][var6];
                    }
                    if (arg1 + arg3 == var8 && var8 < this.field46 - 1) {
                        this.field48[0][var8][var6] = this.field48[0][var8 + 1][var6];
                    }
                    if (arg4 == var6 && var6 > 0) {
                        this.field48[0][var8][var6] = this.field48[0][var8][var6 - 1];
                    }
                    if (arg2 + arg4 == var6 && var6 < this.field47 - 1) {
                        this.field48[0][var8][var6] = this.field48[0][var8][var6 + 1];
                    }
                }
            }
        }
        if (arg0 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([BIIIII)V")
    public final void method15(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Packet var7 = new Packet(false, arg0);
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
                                    this.field48[0][var11][var12] = -method22(var11 + arg4 + 932731, var12 + 556238 + arg5) * 8;
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
        if (arg2 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([BIZI)Z")
    public static final boolean method16(byte[] arg0, int arg1, boolean arg2, int arg3) {
        boolean var4 = true;
        Packet var5 = new Packet(false, arg0);
        if (arg2) {
            field40 = !field40;
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
                    int var15 = arg1 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.method330(var6);
                        if (var14 != 22 || !field44 || var17.field969 || var17.field989) {
                            var4 &= var17.method334(579);
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lub;BLlb;)V")
    public static final void method17(OnDemand arg0, byte arg1, Packet arg2) {
        if (arg1 == 4) {
            boolean var3 = false;
        } else {
            field41 = !field41;
        }
        int var4 = -1;
        while (true) {
            int var5 = arg2.method243();
            if (var5 == 0) {
                return;
            }
            var4 += var5;
            LocType var6 = LocType.method330(var4);
            var6.method335(-292, arg0);
            while (true) {
                int var7 = arg2.method243();
                if (var7 == 0) {
                    break;
                }
                arg2.method229();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(BLr;[BI[Ljc;I)V")
    public final void method18(byte arg0, World3D arg1, byte[] arg2, int arg3, CollisionMap[] arg4, int arg5) {
        if (arg0 != 92) {
            return;
        }
        Packet var7 = new Packet(false, arg2);
        int var8 = -1;
        while (true) {
            int var9 = var7.method243();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method243();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method229();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg5 + var13;
                int var19 = arg3 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field49[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    CollisionMap var21 = null;
                    if (var20 >= 0) {
                        var21 = arg4[var20];
                    }
                    this.method19(var21, var19, var17, var14, var8, arg1, var16, var18, this.field42);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Ljc;IIIILr;III)V")
    private final void method19(CollisionMap arg0, int arg1, int arg2, int arg3, int arg4, World3D arg5, int arg6, int arg7, int arg8) {
        if (field44) {
            if ((this.field49[arg3][arg7][arg1] & 0x10) != 0) {
                return;
            }
            if (this.method21((byte) 111, arg3, arg7, arg1) != field45) {
                return;
            }
        }
        int var10 = this.field48[arg3][arg7][arg1];
        int var11 = this.field48[arg3][arg7 + 1][arg1];
        int var12 = this.field48[arg3][arg7 + 1][arg1 + 1];
        int var13 = this.field48[arg3][arg7][arg1 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        if (arg8 != 42522) {
            field41 = !field41;
        }
        LocType var15 = LocType.method330(arg4);
        int var16 = (arg4 << 14) + (arg1 << 7) + arg7 + 1073741824;
        if (!var15.field969) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg2 << 6) + arg6);
        if (arg6 == 22) {
            if (!field44 || var15.field969 || var15.field989) {
                Entity var18;
                if (var15.field973 == -1 && var15.field992 == null) {
                    var18 = var15.method336(22, arg2, var10, var11, var12, var13, -1);
                } else {
                    var18 = new LocEntity(arg4, 22, var13, var11, var15.field973, arg2, var10, var12, true, 188);
                }
                arg5.method56(arg3, var18, arg1, (byte) 1, arg7, var17, var16, var14);
                if (var15.field967 && var15.field969 && arg0 != null) {
                    arg0.method362(arg1, arg7, 5);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            Entity var38;
            if (var15.field973 == -1 && var15.field992 == null) {
                var38 = var15.method336(10, arg2, var10, var11, var12, var13, -1);
            } else {
                var38 = new LocEntity(arg4, 10, var13, var11, var15.field973, arg2, var10, var12, true, 188);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg6 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg2 == 1 || arg2 == 3) {
                    var40 = var15.field966;
                    var41 = var15.field965;
                } else {
                    var40 = var15.field965;
                    var41 = var15.field966;
                }
                if (arg5.method60(var16, arg1, arg7, var41, arg3, var17, var40, var39, (byte) -3, var14, var38) && var15.field981) {
                    Model var42;
                    if (var38 instanceof Model) {
                        var42 = (Model) var38;
                    } else {
                        var42 = var15.method336(10, arg2, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field571 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field54[arg3][arg7 + var43][arg1 + var44]) {
                                    this.field54[arg3][arg7 + var43][arg1 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field967 && arg0 != null) {
                arg0.method361(arg1, var15.field965, var15.field968, field39, var15.field966, arg2, arg7);
            }
        } else if (arg6 >= 12) {
            Entity var19;
            if (var15.field973 == -1 && var15.field992 == null) {
                var19 = var15.method336(arg6, arg2, var10, var11, var12, var13, -1);
            } else {
                var19 = new LocEntity(arg4, arg6, var13, var11, var15.field973, arg2, var10, var12, true, 188);
            }
            arg5.method60(var16, arg1, arg7, 1, arg3, var17, 1, 0, (byte) -3, var14, var19);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg3 > 0) {
                this.field61[arg3][arg7][arg1] |= 0x924;
            }
            if (var15.field967 && arg0 != null) {
                arg0.method361(arg1, var15.field965, var15.field968, field39, var15.field966, arg2, arg7);
            }
        } else if (arg6 == 0) {
            Entity var20;
            if (var15.field973 == -1 && var15.field992 == null) {
                var20 = var15.method336(0, arg2, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(arg4, 0, var13, var11, var15.field973, arg2, var10, var12, true, 188);
            }
            arg5.method58(arg7, arg1, var16, null, var14, var20, arg3, var17, field62[arg2], 0, 0);
            if (arg2 == 0) {
                if (var15.field981) {
                    this.field54[arg3][arg7][arg1] = 50;
                    this.field54[arg3][arg7][arg1 + 1] = 50;
                }
                if (var15.field972) {
                    this.field61[arg3][arg7][arg1] |= 0x249;
                }
            } else if (arg2 == 1) {
                if (var15.field981) {
                    this.field54[arg3][arg7][arg1 + 1] = 50;
                    this.field54[arg3][arg7 + 1][arg1 + 1] = 50;
                }
                if (var15.field972) {
                    this.field61[arg3][arg7][arg1 + 1] |= 0x492;
                }
            } else if (arg2 == 2) {
                if (var15.field981) {
                    this.field54[arg3][arg7 + 1][arg1] = 50;
                    this.field54[arg3][arg7 + 1][arg1 + 1] = 50;
                }
                if (var15.field972) {
                    this.field61[arg3][arg7 + 1][arg1] |= 0x249;
                }
            } else if (arg2 == 3) {
                if (var15.field981) {
                    this.field54[arg3][arg7][arg1] = 50;
                    this.field54[arg3][arg7 + 1][arg1] = 50;
                }
                if (var15.field972) {
                    this.field61[arg3][arg7][arg1] |= 0x492;
                }
            }
            if (var15.field967 && arg0 != null) {
                arg0.method360(arg7, var15.field968, arg2, arg6, arg1, false);
            }
            if (var15.field974 != 16) {
                arg5.method66(arg3, var15.field974, arg7, 351, arg1);
            }
        } else if (arg6 == 1) {
            Entity var21;
            if (var15.field973 == -1 && var15.field992 == null) {
                var21 = var15.method336(1, arg2, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(arg4, 1, var13, var11, var15.field973, arg2, var10, var12, true, 188);
            }
            arg5.method58(arg7, arg1, var16, null, var14, var21, arg3, var17, field63[arg2], 0, 0);
            if (var15.field981) {
                if (arg2 == 0) {
                    this.field54[arg3][arg7][arg1 + 1] = 50;
                } else if (arg2 == 1) {
                    this.field54[arg3][arg7 + 1][arg1 + 1] = 50;
                } else if (arg2 == 2) {
                    this.field54[arg3][arg7 + 1][arg1] = 50;
                } else if (arg2 == 3) {
                    this.field54[arg3][arg7][arg1] = 50;
                }
            }
            if (var15.field967 && arg0 != null) {
                arg0.method360(arg7, var15.field968, arg2, arg6, arg1, false);
            }
        } else if (arg6 == 2) {
            int var22 = arg2 + 1 & 0x3;
            Entity var23;
            Entity var24;
            if (var15.field973 == -1 && var15.field992 == null) {
                var23 = var15.method336(2, arg2 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method336(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new LocEntity(arg4, 2, var13, var11, var15.field973, arg2 + 4, var10, var12, true, 188);
                var24 = new LocEntity(arg4, 2, var13, var11, var15.field973, var22, var10, var12, true, 188);
            }
            arg5.method58(arg7, arg1, var16, var24, var14, var23, arg3, var17, field62[arg2], field62[var22], 0);
            if (var15.field972) {
                if (arg2 == 0) {
                    this.field61[arg3][arg7][arg1] |= 0x249;
                    this.field61[arg3][arg7][arg1 + 1] |= 0x492;
                } else if (arg2 == 1) {
                    this.field61[arg3][arg7][arg1 + 1] |= 0x492;
                    this.field61[arg3][arg7 + 1][arg1] |= 0x249;
                } else if (arg2 == 2) {
                    this.field61[arg3][arg7 + 1][arg1] |= 0x249;
                    this.field61[arg3][arg7][arg1] |= 0x492;
                } else if (arg2 == 3) {
                    this.field61[arg3][arg7][arg1] |= 0x492;
                    this.field61[arg3][arg7][arg1] |= 0x249;
                }
            }
            if (var15.field967 && arg0 != null) {
                arg0.method360(arg7, var15.field968, arg2, arg6, arg1, false);
            }
            if (var15.field974 != 16) {
                arg5.method66(arg3, var15.field974, arg7, 351, arg1);
            }
        } else if (arg6 == 3) {
            Entity var25;
            if (var15.field973 == -1 && var15.field992 == null) {
                var25 = var15.method336(3, arg2, var10, var11, var12, var13, -1);
            } else {
                var25 = new LocEntity(arg4, 3, var13, var11, var15.field973, arg2, var10, var12, true, 188);
            }
            arg5.method58(arg7, arg1, var16, null, var14, var25, arg3, var17, field63[arg2], 0, 0);
            if (var15.field981) {
                if (arg2 == 0) {
                    this.field54[arg3][arg7][arg1 + 1] = 50;
                } else if (arg2 == 1) {
                    this.field54[arg3][arg7 + 1][arg1 + 1] = 50;
                } else if (arg2 == 2) {
                    this.field54[arg3][arg7 + 1][arg1] = 50;
                } else if (arg2 == 3) {
                    this.field54[arg3][arg7][arg1] = 50;
                }
            }
            if (var15.field967 && arg0 != null) {
                arg0.method360(arg7, var15.field968, arg2, arg6, arg1, false);
            }
        } else if (arg6 == 9) {
            Entity var26;
            if (var15.field973 == -1 && var15.field992 == null) {
                var26 = var15.method336(arg6, arg2, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(arg4, arg6, var13, var11, var15.field973, arg2, var10, var12, true, 188);
            }
            arg5.method60(var16, arg1, arg7, 1, arg3, var17, 1, 0, (byte) -3, var14, var26);
            if (var15.field967 && arg0 != null) {
                arg0.method361(arg1, var15.field965, var15.field968, field39, var15.field966, arg2, arg7);
            }
        } else {
            if (var15.field970) {
                if (arg2 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg2 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg2 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg6 == 4) {
                Entity var31;
                if (var15.field973 == -1 && var15.field992 == null) {
                    var31 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new LocEntity(arg4, 4, var13, var11, var15.field973, 0, var10, var12, true, 188);
                }
                arg5.method59(var14, arg2 * 512, 0, field62[arg2], arg7, var31, -16, var17, var16, 0, arg3, arg1);
            } else if (arg6 == 5) {
                int var32 = 16;
                int var33 = arg5.method76(arg3, arg7, arg1);
                if (var33 > 0) {
                    var32 = LocType.method330(var33 >> 14 & 0x7FFF).field974;
                }
                Entity var34;
                if (var15.field973 == -1 && var15.field992 == null) {
                    var34 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new LocEntity(arg4, 4, var13, var11, var15.field973, 0, var10, var12, true, 188);
                }
                arg5.method59(var14, arg2 * 512, field65[arg2] * var32, field62[arg2], arg7, var34, -16, var17, var16, field64[arg2] * var32, arg3, arg1);
            } else if (arg6 == 6) {
                Entity var35;
                if (var15.field973 == -1 && var15.field992 == null) {
                    var35 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new LocEntity(arg4, 4, var13, var11, var15.field973, 0, var10, var12, true, 188);
                }
                arg5.method59(var14, arg2, 0, 256, arg7, var35, -16, var17, var16, 0, arg3, arg1);
            } else if (arg6 == 7) {
                Entity var36;
                if (var15.field973 == -1 && var15.field992 == null) {
                    var36 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new LocEntity(arg4, 4, var13, var11, var15.field973, 0, var10, var12, true, 188);
                }
                arg5.method59(var14, arg2, 0, 512, arg7, var36, -16, var17, var16, 0, arg3, arg1);
            } else if (arg6 == 8) {
                Entity var37;
                if (var15.field973 == -1 && var15.field992 == null) {
                    var37 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new LocEntity(arg4, 4, var13, var11, var15.field973, 0, var10, var12, true, 188);
                }
                arg5.method59(var14, arg2, 0, 768, arg7, var37, -16, var17, var16, 0, arg3, arg1);
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([Ljc;BLr;)V")
    public final void method20(CollisionMap[] arg0, byte arg1, World3D arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field49[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field49[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method362(var111, var110, 5);
                        }
                    }
                }
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
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field54[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field47 - 1; var56++) {
                for (int var101 = 1; var101 < this.field46 - 1; var101++) {
                    int var102 = this.field48[var5][var101 + 1][var56] - this.field48[var5][var101 - 1][var56];
                    int var103 = this.field48[var5][var101][var56 + 1] - this.field48[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field55[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field47; var57++) {
                this.field56[var57] = 0;
                this.field57[var57] = 0;
                this.field58[var57] = 0;
                this.field59[var57] = 0;
                this.field60[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field46 + 5; var58++) {
                for (int var61 = 0; var61 < this.field47; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field46) {
                        int var96 = this.field50[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            FloType var97 = FloType.field1118[var96 - 1];
                            this.field56[var61] += var97.field1127;
                            this.field57[var61] += var97.field1125;
                            this.field58[var61] += var97.field1126;
                            this.field59[var61] += var97.field1128;
                            var10002 = this.field60[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field46) {
                        int var99 = this.field50[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.field1118[var99 - 1];
                            this.field56[var61] -= var100.field1127;
                            this.field57[var61] -= var100.field1125;
                            this.field58[var61] -= var100.field1126;
                            this.field59[var61] -= var100.field1128;
                            var10002 = this.field60[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field46 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field47 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field47) {
                            var62 += this.field56[var68];
                            var63 += this.field57[var68];
                            var64 += this.field58[var68];
                            var65 += this.field59[var68];
                            var66 += this.field60[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field47) {
                            var62 -= this.field56[var69];
                            var63 -= this.field57[var69];
                            var64 -= this.field58[var69];
                            var65 -= this.field59[var69];
                            var66 -= this.field60[var69];
                        }
                        if (var67 >= 1 && var67 < this.field47 - 1 && (!field44 || (this.field49[var5][var58][var67] & 0x10) == 0 && this.method21((byte) 111, var5, var58, var67) == field45)) {
                            int var70 = this.field50[var5][var58][var67] & 0xFF;
                            int var71 = this.field51[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field48[var5][var58][var67];
                                int var73 = this.field48[var5][var58 + 1][var67];
                                int var74 = this.field48[var5][var58 + 1][var67 + 1];
                                int var75 = this.field48[var5][var58][var67 + 1];
                                int var76 = this.field55[var58][var67];
                                int var77 = this.field55[var58 + 1][var67];
                                int var78 = this.field55[var58 + 1][var67 + 1];
                                int var79 = this.field55[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method29(var82, var83, var84);
                                    int var85 = field66 + var82 & 0xFF;
                                    int var86 = field67 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method29(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field52[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !FloType.field1118[var71 - 1].field1123) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field61[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Pix3D.field667[method27(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg2.method55(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field52[var5][var58][var67] + 1;
                                    byte var90 = this.field53[var5][var58][var67];
                                    FloType var91 = FloType.field1118[var71 - 1];
                                    int var92 = var91.field1121;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Pix3D.method170(-333, var92);
                                        var94 = -1;
                                    } else if (var91.field1120 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method29(var91.field1124, var91.field1125, var91.field1126);
                                        var93 = Pix3D.field667[this.method28(var91.field1129, 96)];
                                    }
                                    arg2.method55(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), this.method28(var94, var76), this.method28(var94, var77), this.method28(var94, var78), this.method28(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field47 - 1; var59++) {
                for (int var60 = 1; var60 < this.field46 - 1; var60++) {
                    arg2.method54(var5, var60, var59, this.method21((byte) 111, var5, var60, var59));
                }
            }
        }
        arg2.method81(-8769, -50, 768, -50, -10, 64);
        for (int var6 = 0; var6 < this.field46; var6++) {
            for (int var47 = 0; var47 < this.field47; var47++) {
                if ((this.field49[1][var6][var47] & 0x2) == 2) {
                    arg2.method52(var47, var6, 0);
                }
            }
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
                for (int var12 = 0; var12 <= this.field47; var12++) {
                    for (int var13 = 0; var13 <= this.field46; var13++) {
                        if ((this.field61[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field61[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field47 && (this.field61[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label326: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field61[var16 - 1][var13][var18] & var7) == 0) {
                                        break label326;
                                    }
                                }
                                var16--;
                            }
                            label315: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field61[var17 + 1][var13][var19] & var7) == 0) {
                                        break label315;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field48[var17][var13][var14] - var21;
                                int var23 = this.field48[var16][var13][var14];
                                World3D.method53(var23, var22, var13 * 128, var13 * 128, (byte) 32, 1, var15 * 128 + 128, var10, var14 * 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field61[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field61[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field61[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field46 && (this.field61[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label379: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field61[var28 - 1][var30][var12] & var8) == 0) {
                                        break label379;
                                    }
                                }
                                var28--;
                            }
                            label368: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field61[var29 + 1][var31][var12] & var8) == 0) {
                                        break label368;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field48[var29][var26][var12] - var33;
                                int var35 = this.field48[var28][var26][var12];
                                World3D.method53(var35, var34, var26 * 128, var27 * 128 + 128, (byte) 32, 2, var12 * 128, var10, var12 * 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field61[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field61[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field61[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field47 && (this.field61[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label432: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field61[var11][var38 - 1][var42] & var9) == 0) {
                                        break label432;
                                    }
                                }
                                var38--;
                            }
                            label421: while (var39 < this.field46) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field61[var11][var39 + 1][var43] & var9) == 0) {
                                        break label421;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field48[var11][var38][var40];
                                World3D.method53(var44, var44, var38 * 128, var39 * 128 + 128, (byte) 32, 4, var41 * 128 + 128, var10, var40 * 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field61[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 == 64) {
            ;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(BIII)I")
    public int method21(byte arg0, int arg1, int arg2, int arg3) {
        if (this.field43 != arg0) {
            return 2;
        } else if ((this.field49[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (this.field49[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
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
        int var4 = 65536 - Pix3D.field656[arg2 * 1024 / arg3] >> 1;
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
        LocType var3 = LocType.method330(arg1);
        int var4 = 79 / arg0;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method333(643, arg2);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II[[[ILjc;IILr;IIII)V")
    public static final void method31(int arg0, int arg1, int[][][] arg2, CollisionMap arg3, int arg4, int arg5, World3D arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg2[arg8][arg10][arg5];
        int var12 = arg2[arg8][arg10 + 1][arg5];
        int var13 = arg2[arg8][arg10 + 1][arg5 + 1];
        int var14 = arg2[arg8][arg10][arg5 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method330(arg0);
        if (arg1 != -44218) {
            for (int var17 = 1; var17 > 0; var17++) {
            }
        }
        int var18 = (arg0 << 14) + (arg5 << 7) + arg10 + 1073741824;
        if (!var16.field969) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg9 << 6) + arg4);
        if (arg4 == 22) {
            Entity var20;
            if (var16.field973 == -1 && var16.field992 == null) {
                var20 = var16.method336(22, arg9, var11, var12, var13, var14, -1);
            } else {
                var20 = new LocEntity(arg0, 22, var14, var12, var16.field973, arg9, var11, var13, true, 188);
            }
            arg6.method56(arg7, var20, arg5, (byte) 1, arg10, var19, var18, var15);
            if (var16.field967 && var16.field969) {
                arg3.method362(arg5, arg10, 5);
            }
        } else if (arg4 == 10 || arg4 == 11) {
            Entity var40;
            if (var16.field973 == -1 && var16.field992 == null) {
                var40 = var16.method336(10, arg9, var11, var12, var13, var14, -1);
            } else {
                var40 = new LocEntity(arg0, 10, var14, var12, var16.field973, arg9, var11, var13, true, 188);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg4 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg9 == 1 || arg9 == 3) {
                    var42 = var16.field966;
                    var43 = var16.field965;
                } else {
                    var42 = var16.field965;
                    var43 = var16.field966;
                }
                arg6.method60(var18, arg5, arg10, var43, arg7, var19, var42, var41, (byte) -3, var15, var40);
            }
            if (var16.field967) {
                arg3.method361(arg5, var16.field965, var16.field968, field39, var16.field966, arg9, arg10);
            }
        } else if (arg4 >= 12) {
            Entity var21;
            if (var16.field973 == -1 && var16.field992 == null) {
                var21 = var16.method336(arg4, arg9, var11, var12, var13, var14, -1);
            } else {
                var21 = new LocEntity(arg0, arg4, var14, var12, var16.field973, arg9, var11, var13, true, 188);
            }
            arg6.method60(var18, arg5, arg10, 1, arg7, var19, 1, 0, (byte) -3, var15, var21);
            if (var16.field967) {
                arg3.method361(arg5, var16.field965, var16.field968, field39, var16.field966, arg9, arg10);
            }
        } else if (arg4 == 0) {
            Entity var22;
            if (var16.field973 == -1 && var16.field992 == null) {
                var22 = var16.method336(0, arg9, var11, var12, var13, var14, -1);
            } else {
                var22 = new LocEntity(arg0, 0, var14, var12, var16.field973, arg9, var11, var13, true, 188);
            }
            arg6.method58(arg10, arg5, var18, null, var15, var22, arg7, var19, field62[arg9], 0, 0);
            if (var16.field967) {
                arg3.method360(arg10, var16.field968, arg9, arg4, arg5, false);
            }
        } else if (arg4 == 1) {
            Entity var23;
            if (var16.field973 == -1 && var16.field992 == null) {
                var23 = var16.method336(1, arg9, var11, var12, var13, var14, -1);
            } else {
                var23 = new LocEntity(arg0, 1, var14, var12, var16.field973, arg9, var11, var13, true, 188);
            }
            arg6.method58(arg10, arg5, var18, null, var15, var23, arg7, var19, field63[arg9], 0, 0);
            if (var16.field967) {
                arg3.method360(arg10, var16.field968, arg9, arg4, arg5, false);
            }
        } else if (arg4 == 2) {
            int var24 = arg9 + 1 & 0x3;
            Entity var25;
            Entity var26;
            if (var16.field973 == -1 && var16.field992 == null) {
                var25 = var16.method336(2, arg9 + 4, var11, var12, var13, var14, -1);
                var26 = var16.method336(2, var24, var11, var12, var13, var14, -1);
            } else {
                var25 = new LocEntity(arg0, 2, var14, var12, var16.field973, arg9 + 4, var11, var13, true, 188);
                var26 = new LocEntity(arg0, 2, var14, var12, var16.field973, var24, var11, var13, true, 188);
            }
            arg6.method58(arg10, arg5, var18, var26, var15, var25, arg7, var19, field62[arg9], field62[var24], 0);
            if (var16.field967) {
                arg3.method360(arg10, var16.field968, arg9, arg4, arg5, false);
            }
        } else if (arg4 == 3) {
            Entity var27;
            if (var16.field973 == -1 && var16.field992 == null) {
                var27 = var16.method336(3, arg9, var11, var12, var13, var14, -1);
            } else {
                var27 = new LocEntity(arg0, 3, var14, var12, var16.field973, arg9, var11, var13, true, 188);
            }
            arg6.method58(arg10, arg5, var18, null, var15, var27, arg7, var19, field63[arg9], 0, 0);
            if (var16.field967) {
                arg3.method360(arg10, var16.field968, arg9, arg4, arg5, false);
            }
        } else if (arg4 == 9) {
            Entity var28;
            if (var16.field973 == -1 && var16.field992 == null) {
                var28 = var16.method336(arg4, arg9, var11, var12, var13, var14, -1);
            } else {
                var28 = new LocEntity(arg0, arg4, var14, var12, var16.field973, arg9, var11, var13, true, 188);
            }
            arg6.method60(var18, arg5, arg10, 1, arg7, var19, 1, 0, (byte) -3, var15, var28);
            if (var16.field967) {
                arg3.method361(arg5, var16.field965, var16.field968, field39, var16.field966, arg9, arg10);
            }
        } else {
            if (var16.field970) {
                if (arg9 == 1) {
                    int var29 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg9 == 2) {
                    int var30 = var14;
                    var14 = var12;
                    var12 = var30;
                    int var31 = var13;
                    var13 = var11;
                    var11 = var31;
                } else if (arg9 == 3) {
                    int var32 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var32;
                }
            }
            if (arg4 == 4) {
                Entity var33;
                if (var16.field973 == -1 && var16.field992 == null) {
                    var33 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var33 = new LocEntity(arg0, 4, var14, var12, var16.field973, 0, var11, var13, true, 188);
                }
                arg6.method59(var15, arg9 * 512, 0, field62[arg9], arg10, var33, -16, var19, var18, 0, arg7, arg5);
            } else if (arg4 == 5) {
                int var34 = 16;
                int var35 = arg6.method76(arg7, arg10, arg5);
                if (var35 > 0) {
                    var34 = LocType.method330(var35 >> 14 & 0x7FFF).field974;
                }
                Entity var36;
                if (var16.field973 == -1 && var16.field992 == null) {
                    var36 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new LocEntity(arg0, 4, var14, var12, var16.field973, 0, var11, var13, true, 188);
                }
                arg6.method59(var15, arg9 * 512, field65[arg9] * var34, field62[arg9], arg10, var36, -16, var19, var18, field64[arg9] * var34, arg7, arg5);
            } else if (arg4 == 6) {
                Entity var37;
                if (var16.field973 == -1 && var16.field992 == null) {
                    var37 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new LocEntity(arg0, 4, var14, var12, var16.field973, 0, var11, var13, true, 188);
                }
                arg6.method59(var15, arg9, 0, 256, arg10, var37, -16, var19, var18, 0, arg7, arg5);
            } else if (arg4 == 7) {
                Entity var38;
                if (var16.field973 == -1 && var16.field992 == null) {
                    var38 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new LocEntity(arg0, 4, var14, var12, var16.field973, 0, var11, var13, true, 188);
                }
                arg6.method59(var15, arg9, 0, 512, arg10, var38, -16, var19, var18, 0, arg7, arg5);
            } else if (arg4 == 8) {
                Entity var39;
                if (var16.field973 == -1 && var16.field992 == null) {
                    var39 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var39 = new LocEntity(arg0, 4, var14, var12, var16.field973, 0, var11, var13, true, 188);
                }
                arg6.method59(var15, arg9, 0, 768, arg10, var39, -16, var19, var18, 0, arg7, arg5);
            }
        }
    }
}
