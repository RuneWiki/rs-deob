import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "a", descriptor = "I")
    private int field37 = 101;

    @OriginalMember(owner = "c", name = "c", descriptor = "Z")
    private boolean field39 = false;

    @OriginalMember(owner = "c", name = "d", descriptor = "Z")
    private boolean field40 = true;

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

    @OriginalMember(owner = "c", name = "b", descriptor = "I")
    private static int field38 = 30967;

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

    @OriginalMember(owner = "c", name = "<init>", descriptor = "([[[IIB[[[BI)V")
    public World(int[][][] arg0, int arg1, byte arg2, byte[][][] arg3, int arg4) {
        this.field43 = arg4;
        this.field44 = arg1;
        this.field45 = arg0;
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
        if (arg2 != 9) {
            this.field39 = !this.field39;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIZI)V")
    public final void method14(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        for (int var6 = arg1; var6 <= arg1 + arg4; var6++) {
            for (int var7 = arg0; var7 <= arg0 + arg2; var7++) {
                if (var7 >= 0 && var7 < this.field43 && var6 >= 0 && var6 < this.field44) {
                    this.field51[0][var7][var6] = 127;
                    if (arg0 == var7 && var7 > 0) {
                        this.field45[0][var7][var6] = this.field45[0][var7 - 1][var6];
                    }
                    if (arg0 + arg2 == var7 && var7 < this.field43 - 1) {
                        this.field45[0][var7][var6] = this.field45[0][var7 + 1][var6];
                    }
                    if (arg1 == var6 && var6 > 0) {
                        this.field45[0][var7][var6] = this.field45[0][var7][var6 - 1];
                    }
                    if (arg1 + arg4 == var6 && var6 < this.field44 - 1) {
                        this.field45[0][var7][var6] = this.field45[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg3) {
            ;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIB[BII)V")
    public final void method15(int arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5) {
        Packet var7 = new Packet(arg3, 15787);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    int var12 = arg5 + var10;
                    int var13 = arg4 + var11;
                    if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                        this.field46[var8][var12][var13] = 0;
                        while (true) {
                            int var14 = var7.method227();
                            if (var14 == 0) {
                                if (var8 == 0) {
                                    this.field45[0][var12][var13] = -method22(var12 + arg1 + 932731, var13 + 556238 + arg0) * 8;
                                } else {
                                    this.field45[var8][var12][var13] = this.field45[var8 - 1][var12][var13] - 240;
                                }
                                break;
                            }
                            if (var14 == 1) {
                                int var15 = var7.method227();
                                if (var15 == 1) {
                                    var15 = 0;
                                }
                                if (var8 == 0) {
                                    this.field45[0][var12][var13] = -var15 * 8;
                                } else {
                                    this.field45[var8][var12][var13] = this.field45[var8 - 1][var12][var13] - var15 * 8;
                                }
                                break;
                            }
                            if (var14 <= 49) {
                                this.field48[var8][var12][var13] = var7.method228();
                                this.field49[var8][var12][var13] = (byte) ((var14 - 2) / 4);
                                this.field50[var8][var12][var13] = (byte) (var14 - 2 & 0x3);
                            } else if (var14 <= 81) {
                                this.field46[var8][var12][var13] = (byte) (var14 - 49);
                            } else {
                                this.field47[var8][var12][var13] = (byte) (var14 - 81);
                            }
                        }
                    } else {
                        while (true) {
                            int var16 = var7.method227();
                            if (var16 == 0) {
                                break;
                            }
                            if (var16 == 1) {
                                var7.method227();
                                break;
                            }
                            if (var16 <= 49) {
                                var7.method227();
                            }
                        }
                    }
                }
            }
        }
        if (arg2 != -54) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(III[B)Z")
    public static final boolean method16(int arg0, int arg1, int arg2, byte[] arg3) {
        boolean var4 = true;
        Packet var5 = new Packet(arg3, 15787);
        int var6 = -1;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        label52: while (true) {
            int var7 = var5.method241();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method241();
                    if (var11 == 0) {
                        continue label52;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method227() >> 2;
                    int var15 = arg2 + var13;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.method328(var6);
                        if (var14 != 22 || !field41 || var17.field969 || var17.field989) {
                            var4 &= var17.method332(-593);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method241();
                if (var10 == 0) {
                    break;
                }
                var5.method227();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lub;Llb;I)V")
    public static final void method17(OnDemand arg0, Packet arg1, int arg2) {
        int var3 = -1;
        if (arg2 >= 0) {
            return;
        }
        while (true) {
            int var4 = arg1.method241();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            LocType var5 = LocType.method328(var3);
            var5.method333(arg0, (byte) 2);
            while (true) {
                int var6 = arg1.method241();
                if (var6 == 0) {
                    break;
                }
                arg1.method227();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II[BLr;B[Ljc;)V")
    public final void method18(int arg0, int arg1, byte[] arg2, World3D arg3, byte arg4, CollisionMap[] arg5) {
        Packet var7 = new Packet(arg2, 15787);
        int var8 = -1;
        if (arg4 != 4) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        while (true) {
            int var10 = var7.method241();
            if (var10 == 0) {
                return;
            }
            var8 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method241();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var7.method227();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg1 + var14;
                int var20 = arg0 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field46[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    CollisionMap var22 = null;
                    if (var21 >= 0) {
                        var22 = arg5[var21];
                    }
                    this.method19(var17, var19, arg3, -805, var18, var15, var20, var22, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IILr;IIIILjc;I)V")
    private final void method19(int arg0, int arg1, World3D arg2, int arg3, int arg4, int arg5, int arg6, CollisionMap arg7, int arg8) {
        if (field41) {
            if ((this.field46[arg5][arg1][arg6] & 0x10) != 0) {
                return;
            }
            if (this.method21(arg6, arg1, 0, arg5) != field42) {
                return;
            }
        }
        int var10 = this.field45[arg5][arg1][arg6];
        int var11 = this.field45[arg5][arg1 + 1][arg6];
        int var12 = this.field45[arg5][arg1 + 1][arg6 + 1];
        int var13 = this.field45[arg5][arg1][arg6 + 1];
        if (arg3 >= 0) {
            this.field37 = 410;
        }
        int var14 = var10 + var11 + var12 + var13 >> 2;
        LocType var15 = LocType.method328(arg8);
        int var16 = (arg8 << 14) + (arg6 << 7) + arg1 + 1073741824;
        if (!var15.field969) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg4 << 6) + arg0);
        if (arg0 == 22) {
            if (!field41 || var15.field969 || var15.field989) {
                Entity var18;
                if (var15.field973 == -1 && var15.field993 == null) {
                    var18 = var15.method334(22, arg4, var10, var11, var12, var13, -1);
                } else {
                    var18 = new LocEntity(arg4, arg8, 22, var13, var12, false, var10, var15.field973, true, var11);
                }
                arg2.method56(var17, var16, arg5, arg6, true, var14, var18, arg1);
                if (var15.field967 && var15.field969 && arg7 != null) {
                    arg7.method358(arg1, (byte) 0, arg6);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            Entity var38;
            if (var15.field973 == -1 && var15.field993 == null) {
                var38 = var15.method334(10, arg4, var10, var11, var12, var13, -1);
            } else {
                var38 = new LocEntity(arg4, arg8, 10, var13, var12, false, var10, var15.field973, true, var11);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg0 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg4 == 1 || arg4 == 3) {
                    var40 = var15.field966;
                    var41 = var15.field965;
                } else {
                    var40 = var15.field965;
                    var41 = var15.field966;
                }
                if (arg2.method60(0, arg6, arg1, var14, var17, var16, var39, var40, arg5, var38, var41) && var15.field981) {
                    Model var42;
                    if (var38 instanceof Model) {
                        var42 = (Model) var38;
                    } else {
                        var42 = var15.method334(10, arg4, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field560 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field51[arg5][arg1 + var43][arg6 + var44]) {
                                    this.field51[arg5][arg1 + var43][arg6 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field967 && arg7 != null) {
                arg7.method357(arg6, var15.field965, var15.field968, -24520, arg1, var15.field966, arg4);
            }
        } else if (arg0 >= 12) {
            Entity var19;
            if (var15.field973 == -1 && var15.field993 == null) {
                var19 = var15.method334(arg0, arg4, var10, var11, var12, var13, -1);
            } else {
                var19 = new LocEntity(arg4, arg8, arg0, var13, var12, false, var10, var15.field973, true, var11);
            }
            arg2.method60(0, arg6, arg1, var14, var17, var16, 0, 1, arg5, var19, 1);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg5 > 0) {
                this.field58[arg5][arg1][arg6] |= 0x924;
            }
            if (var15.field967 && arg7 != null) {
                arg7.method357(arg6, var15.field965, var15.field968, -24520, arg1, var15.field966, arg4);
            }
        } else if (arg0 == 0) {
            Entity var20;
            if (var15.field973 == -1 && var15.field993 == null) {
                var20 = var15.method334(0, arg4, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(arg4, arg8, 0, var13, var12, false, var10, var15.field973, true, var11);
            }
            arg2.method58(var17, field59[arg4], var14, var16, arg1, var20, -927, 0, null, arg5, arg6);
            if (arg4 == 0) {
                if (var15.field981) {
                    this.field51[arg5][arg1][arg6] = 50;
                    this.field51[arg5][arg1][arg6 + 1] = 50;
                }
                if (var15.field972) {
                    this.field58[arg5][arg1][arg6] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var15.field981) {
                    this.field51[arg5][arg1][arg6 + 1] = 50;
                    this.field51[arg5][arg1 + 1][arg6 + 1] = 50;
                }
                if (var15.field972) {
                    this.field58[arg5][arg1][arg6 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var15.field981) {
                    this.field51[arg5][arg1 + 1][arg6] = 50;
                    this.field51[arg5][arg1 + 1][arg6 + 1] = 50;
                }
                if (var15.field972) {
                    this.field58[arg5][arg1 + 1][arg6] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var15.field981) {
                    this.field51[arg5][arg1][arg6] = 50;
                    this.field51[arg5][arg1 + 1][arg6] = 50;
                }
                if (var15.field972) {
                    this.field58[arg5][arg1][arg6] |= 0x492;
                }
            }
            if (var15.field967 && arg7 != null) {
                arg7.method356(true, arg4, var15.field968, arg0, arg1, arg6);
            }
            if (var15.field974 != 16) {
                arg2.method66(arg6, var15.field974, (byte) -90, arg1, arg5);
            }
        } else if (arg0 == 1) {
            Entity var21;
            if (var15.field973 == -1 && var15.field993 == null) {
                var21 = var15.method334(1, arg4, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(arg4, arg8, 1, var13, var12, false, var10, var15.field973, true, var11);
            }
            arg2.method58(var17, field60[arg4], var14, var16, arg1, var21, -927, 0, null, arg5, arg6);
            if (var15.field981) {
                if (arg4 == 0) {
                    this.field51[arg5][arg1][arg6 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field51[arg5][arg1 + 1][arg6 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field51[arg5][arg1 + 1][arg6] = 50;
                } else if (arg4 == 3) {
                    this.field51[arg5][arg1][arg6] = 50;
                }
            }
            if (var15.field967 && arg7 != null) {
                arg7.method356(true, arg4, var15.field968, arg0, arg1, arg6);
            }
        } else if (arg0 == 2) {
            int var22 = arg4 + 1 & 0x3;
            Entity var23;
            Entity var24;
            if (var15.field973 == -1 && var15.field993 == null) {
                var23 = var15.method334(2, arg4 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method334(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new LocEntity(arg4 + 4, arg8, 2, var13, var12, false, var10, var15.field973, true, var11);
                var24 = new LocEntity(var22, arg8, 2, var13, var12, false, var10, var15.field973, true, var11);
            }
            arg2.method58(var17, field59[arg4], var14, var16, arg1, var23, -927, field59[var22], var24, arg5, arg6);
            if (var15.field972) {
                if (arg4 == 0) {
                    this.field58[arg5][arg1][arg6] |= 0x249;
                    this.field58[arg5][arg1][arg6 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    this.field58[arg5][arg1][arg6 + 1] |= 0x492;
                    this.field58[arg5][arg1 + 1][arg6] |= 0x249;
                } else if (arg4 == 2) {
                    this.field58[arg5][arg1 + 1][arg6] |= 0x249;
                    this.field58[arg5][arg1][arg6] |= 0x492;
                } else if (arg4 == 3) {
                    this.field58[arg5][arg1][arg6] |= 0x492;
                    this.field58[arg5][arg1][arg6] |= 0x249;
                }
            }
            if (var15.field967 && arg7 != null) {
                arg7.method356(true, arg4, var15.field968, arg0, arg1, arg6);
            }
            if (var15.field974 != 16) {
                arg2.method66(arg6, var15.field974, (byte) -90, arg1, arg5);
            }
        } else if (arg0 == 3) {
            Entity var25;
            if (var15.field973 == -1 && var15.field993 == null) {
                var25 = var15.method334(3, arg4, var10, var11, var12, var13, -1);
            } else {
                var25 = new LocEntity(arg4, arg8, 3, var13, var12, false, var10, var15.field973, true, var11);
            }
            arg2.method58(var17, field60[arg4], var14, var16, arg1, var25, -927, 0, null, arg5, arg6);
            if (var15.field981) {
                if (arg4 == 0) {
                    this.field51[arg5][arg1][arg6 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field51[arg5][arg1 + 1][arg6 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field51[arg5][arg1 + 1][arg6] = 50;
                } else if (arg4 == 3) {
                    this.field51[arg5][arg1][arg6] = 50;
                }
            }
            if (var15.field967 && arg7 != null) {
                arg7.method356(true, arg4, var15.field968, arg0, arg1, arg6);
            }
        } else if (arg0 == 9) {
            Entity var26;
            if (var15.field973 == -1 && var15.field993 == null) {
                var26 = var15.method334(arg0, arg4, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(arg4, arg8, arg0, var13, var12, false, var10, var15.field973, true, var11);
            }
            arg2.method60(0, arg6, arg1, var14, var17, var16, 0, 1, arg5, var26, 1);
            if (var15.field967 && arg7 != null) {
                arg7.method357(arg6, var15.field965, var15.field968, -24520, arg1, var15.field966, arg4);
            }
        } else {
            if (var15.field970) {
                if (arg4 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg4 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg4 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg0 == 4) {
                Entity var31;
                if (var15.field973 == -1 && var15.field993 == null) {
                    var31 = var15.method334(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new LocEntity(0, arg8, 4, var13, var12, false, var10, var15.field973, true, var11);
                }
                arg2.method59(arg6, arg5, var14, var31, var17, field59[arg4], arg4 * 512, var16, 0, field38, arg1, 0);
            } else if (arg0 == 5) {
                int var32 = 16;
                int var33 = arg2.method76(arg5, arg1, arg6);
                if (var33 > 0) {
                    var32 = LocType.method328(var33 >> 14 & 0x7FFF).field974;
                }
                Entity var34;
                if (var15.field973 == -1 && var15.field993 == null) {
                    var34 = var15.method334(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new LocEntity(0, arg8, 4, var13, var12, false, var10, var15.field973, true, var11);
                }
                arg2.method59(arg6, arg5, var14, var34, var17, field59[arg4], arg4 * 512, var16, field61[arg4] * var32, field38, arg1, field62[arg4] * var32);
            } else if (arg0 == 6) {
                Entity var35;
                if (var15.field973 == -1 && var15.field993 == null) {
                    var35 = var15.method334(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new LocEntity(0, arg8, 4, var13, var12, false, var10, var15.field973, true, var11);
                }
                arg2.method59(arg6, arg5, var14, var35, var17, 256, arg4, var16, 0, field38, arg1, 0);
            } else if (arg0 == 7) {
                Entity var36;
                if (var15.field973 == -1 && var15.field993 == null) {
                    var36 = var15.method334(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new LocEntity(0, arg8, 4, var13, var12, false, var10, var15.field973, true, var11);
                }
                arg2.method59(arg6, arg5, var14, var36, var17, 512, arg4, var16, 0, field38, arg1, 0);
            } else if (arg0 == 8) {
                Entity var37;
                if (var15.field973 == -1 && var15.field993 == null) {
                    var37 = var15.method334(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new LocEntity(0, arg8, 4, var13, var12, false, var10, var15.field973, true, var11);
                }
                arg2.method59(arg6, arg5, var14, var37, var17, 768, arg4, var16, 0, field38, arg1, 0);
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(B[Ljc;Lr;)V")
    public final void method20(byte arg0, CollisionMap[] arg1, World3D arg2) {
        if (arg0 != 76) {
            this.field39 = !this.field39;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field46[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field46[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method358(var110, (byte) 0, var111);
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
                            FloType var97 = FloType.field1111[var96 - 1];
                            this.field53[var61] += var97.field1120;
                            this.field54[var61] += var97.field1118;
                            this.field55[var61] += var97.field1119;
                            this.field56[var61] += var97.field1121;
                            var10002 = this.field57[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field43) {
                        int var99 = this.field47[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.field1111[var99 - 1];
                            this.field53[var61] -= var100.field1120;
                            this.field54[var61] -= var100.field1118;
                            this.field55[var61] -= var100.field1119;
                            this.field56[var61] -= var100.field1121;
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
                        if (var67 >= 1 && var67 < this.field44 - 1 && (!field41 || (this.field46[var5][var58][var67] & 0x10) == 0 && this.method21(var67, var58, 0, var5) == field42)) {
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
                                    if (var71 > 0 && !FloType.field1111[var71 - 1].field1116) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field58[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Pix3D.field656[method27(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg2.method55(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field49[var5][var58][var67] + 1;
                                    byte var90 = this.field50[var5][var58][var67];
                                    FloType var91 = FloType.field1111[var71 - 1];
                                    int var92 = var91.field1114;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Pix3D.method169(0, var92);
                                        var94 = -1;
                                    } else if (var91.field1113 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method29(var91.field1117, var91.field1118, var91.field1119);
                                        var93 = Pix3D.field656[this.method28(var91.field1122, 96)];
                                    }
                                    arg2.method55(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), this.method28(var94, var76), this.method28(var94, var77), this.method28(var94, var78), this.method28(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field44 - 1; var59++) {
                for (int var60 = 1; var60 < this.field43 - 1; var60++) {
                    arg2.method54(var5, var60, var59, this.method21(var59, var60, 0, var5));
                }
            }
        }
        arg2.method81(64, 7, -50, 768, -50, -10);
        for (int var6 = 0; var6 < this.field43; var6++) {
            for (int var47 = 0; var47 < this.field44; var47++) {
                if ((this.field46[1][var6][var47] & 0x2) == 2) {
                    arg2.method52(true, var47, var6);
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
                            label331: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field58[var16 - 1][var13][var18] & var7) == 0) {
                                        break label331;
                                    }
                                }
                                var16--;
                            }
                            label320: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field58[var17 + 1][var13][var19] & var7) == 0) {
                                        break label320;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field45[var17][var13][var14] - var21;
                                int var23 = this.field45[var16][var13][var14];
                                World3D.method53(var14 * 128, var10, var22, var13 * 128, var13 * 128, 1, var23, var15 * 128 + 128, 1);
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
                            label384: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field58[var28 - 1][var30][var12] & var8) == 0) {
                                        break label384;
                                    }
                                }
                                var28--;
                            }
                            label373: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field58[var29 + 1][var31][var12] & var8) == 0) {
                                        break label373;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field45[var29][var26][var12] - var33;
                                int var35 = this.field45[var28][var26][var12];
                                World3D.method53(var12 * 128, var10, var34, var27 * 128 + 128, var26 * 128, 1, var35, var12 * 128, 2);
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
                            label437: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field58[var11][var38 - 1][var42] & var9) == 0) {
                                        break label437;
                                    }
                                }
                                var38--;
                            }
                            label426: while (var39 < this.field43) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field58[var11][var39 + 1][var43] & var9) == 0) {
                                        break label426;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field45[var11][var38][var40];
                                World3D.method53(var40 * 128, var10, var44, var39 * 128 + 128, var38 * 128, 1, var44, var41 * 128 + 128, 4);
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
        if (arg2 != 0) {
            this.field40 = !this.field40;
        }
        if ((this.field46[arg3][arg1][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (this.field46[1][arg1][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
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
        int var4 = 65536 - Pix3D.field645[arg2 * 1024 / arg3] >> 1;
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
        if (arg2 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        LocType var4 = LocType.method328(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var4.method331(arg1, 658);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIII[[[IIILjc;Lr;II)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3, int[][][] arg4, int arg5, int arg6, CollisionMap arg7, World3D arg8, int arg9, int arg10) {
        if (arg10 != 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg4[arg5][arg6][arg2];
        int var13 = arg4[arg5][arg6 + 1][arg2];
        int var14 = arg4[arg5][arg6 + 1][arg2 + 1];
        int var15 = arg4[arg5][arg6][arg2 + 1];
        int var16 = var12 + var13 + var14 + var15 >> 2;
        LocType var17 = LocType.method328(arg9);
        int var18 = (arg9 << 14) + (arg2 << 7) + arg6 + 1073741824;
        if (!var17.field969) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg0 << 6) + arg3);
        if (arg3 == 22) {
            Entity var20;
            if (var17.field973 == -1 && var17.field993 == null) {
                var20 = var17.method334(22, arg0, var12, var13, var14, var15, -1);
            } else {
                var20 = new LocEntity(arg0, arg9, 22, var15, var14, false, var12, var17.field973, true, var13);
            }
            arg8.method56(var19, var18, arg1, arg2, true, var16, var20, arg6);
            if (var17.field967 && var17.field969) {
                arg7.method358(arg6, (byte) 0, arg2);
            }
        } else if (arg3 == 10 || arg3 == 11) {
            Entity var40;
            if (var17.field973 == -1 && var17.field993 == null) {
                var40 = var17.method334(10, arg0, var12, var13, var14, var15, -1);
            } else {
                var40 = new LocEntity(arg0, arg9, 10, var15, var14, false, var12, var17.field973, true, var13);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg3 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg0 == 1 || arg0 == 3) {
                    var42 = var17.field966;
                    var43 = var17.field965;
                } else {
                    var42 = var17.field965;
                    var43 = var17.field966;
                }
                arg8.method60(0, arg2, arg6, var16, var19, var18, var41, var42, arg1, var40, var43);
            }
            if (var17.field967) {
                arg7.method357(arg2, var17.field965, var17.field968, -24520, arg6, var17.field966, arg0);
            }
        } else if (arg3 >= 12) {
            Entity var21;
            if (var17.field973 == -1 && var17.field993 == null) {
                var21 = var17.method334(arg3, arg0, var12, var13, var14, var15, -1);
            } else {
                var21 = new LocEntity(arg0, arg9, arg3, var15, var14, false, var12, var17.field973, true, var13);
            }
            arg8.method60(0, arg2, arg6, var16, var19, var18, 0, 1, arg1, var21, 1);
            if (var17.field967) {
                arg7.method357(arg2, var17.field965, var17.field968, -24520, arg6, var17.field966, arg0);
            }
        } else if (arg3 == 0) {
            Entity var22;
            if (var17.field973 == -1 && var17.field993 == null) {
                var22 = var17.method334(0, arg0, var12, var13, var14, var15, -1);
            } else {
                var22 = new LocEntity(arg0, arg9, 0, var15, var14, false, var12, var17.field973, true, var13);
            }
            arg8.method58(var19, field59[arg0], var16, var18, arg6, var22, -927, 0, null, arg1, arg2);
            if (var17.field967) {
                arg7.method356(true, arg0, var17.field968, arg3, arg6, arg2);
            }
        } else if (arg3 == 1) {
            Entity var23;
            if (var17.field973 == -1 && var17.field993 == null) {
                var23 = var17.method334(1, arg0, var12, var13, var14, var15, -1);
            } else {
                var23 = new LocEntity(arg0, arg9, 1, var15, var14, false, var12, var17.field973, true, var13);
            }
            arg8.method58(var19, field60[arg0], var16, var18, arg6, var23, -927, 0, null, arg1, arg2);
            if (var17.field967) {
                arg7.method356(true, arg0, var17.field968, arg3, arg6, arg2);
            }
        } else if (arg3 == 2) {
            int var24 = arg0 + 1 & 0x3;
            Entity var25;
            Entity var26;
            if (var17.field973 == -1 && var17.field993 == null) {
                var25 = var17.method334(2, arg0 + 4, var12, var13, var14, var15, -1);
                var26 = var17.method334(2, var24, var12, var13, var14, var15, -1);
            } else {
                var25 = new LocEntity(arg0 + 4, arg9, 2, var15, var14, false, var12, var17.field973, true, var13);
                var26 = new LocEntity(var24, arg9, 2, var15, var14, false, var12, var17.field973, true, var13);
            }
            arg8.method58(var19, field59[arg0], var16, var18, arg6, var25, -927, field59[var24], var26, arg1, arg2);
            if (var17.field967) {
                arg7.method356(true, arg0, var17.field968, arg3, arg6, arg2);
            }
        } else if (arg3 == 3) {
            Entity var27;
            if (var17.field973 == -1 && var17.field993 == null) {
                var27 = var17.method334(3, arg0, var12, var13, var14, var15, -1);
            } else {
                var27 = new LocEntity(arg0, arg9, 3, var15, var14, false, var12, var17.field973, true, var13);
            }
            arg8.method58(var19, field60[arg0], var16, var18, arg6, var27, -927, 0, null, arg1, arg2);
            if (var17.field967) {
                arg7.method356(true, arg0, var17.field968, arg3, arg6, arg2);
            }
        } else if (arg3 == 9) {
            Entity var28;
            if (var17.field973 == -1 && var17.field993 == null) {
                var28 = var17.method334(arg3, arg0, var12, var13, var14, var15, -1);
            } else {
                var28 = new LocEntity(arg0, arg9, arg3, var15, var14, false, var12, var17.field973, true, var13);
            }
            arg8.method60(0, arg2, arg6, var16, var19, var18, 0, 1, arg1, var28, 1);
            if (var17.field967) {
                arg7.method357(arg2, var17.field965, var17.field968, -24520, arg6, var17.field966, arg0);
            }
        } else {
            if (var17.field970) {
                if (arg0 == 1) {
                    int var29 = var15;
                    var15 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var29;
                } else if (arg0 == 2) {
                    int var30 = var15;
                    var15 = var13;
                    var13 = var30;
                    int var31 = var14;
                    var14 = var12;
                    var12 = var31;
                } else if (arg0 == 3) {
                    int var32 = var15;
                    var15 = var12;
                    var12 = var13;
                    var13 = var14;
                    var14 = var32;
                }
            }
            if (arg3 == 4) {
                Entity var33;
                if (var17.field973 == -1 && var17.field993 == null) {
                    var33 = var17.method334(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var33 = new LocEntity(0, arg9, 4, var15, var14, false, var12, var17.field973, true, var13);
                }
                arg8.method59(arg2, arg1, var16, var33, var19, field59[arg0], arg0 * 512, var18, 0, field38, arg6, 0);
            } else if (arg3 == 5) {
                int var34 = 16;
                int var35 = arg8.method76(arg1, arg6, arg2);
                if (var35 > 0) {
                    var34 = LocType.method328(var35 >> 14 & 0x7FFF).field974;
                }
                Entity var36;
                if (var17.field973 == -1 && var17.field993 == null) {
                    var36 = var17.method334(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var36 = new LocEntity(0, arg9, 4, var15, var14, false, var12, var17.field973, true, var13);
                }
                arg8.method59(arg2, arg1, var16, var36, var19, field59[arg0], arg0 * 512, var18, field61[arg0] * var34, field38, arg6, field62[arg0] * var34);
            } else if (arg3 == 6) {
                Entity var37;
                if (var17.field973 == -1 && var17.field993 == null) {
                    var37 = var17.method334(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var37 = new LocEntity(0, arg9, 4, var15, var14, false, var12, var17.field973, true, var13);
                }
                arg8.method59(arg2, arg1, var16, var37, var19, 256, arg0, var18, 0, field38, arg6, 0);
            } else if (arg3 == 7) {
                Entity var38;
                if (var17.field973 == -1 && var17.field993 == null) {
                    var38 = var17.method334(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var38 = new LocEntity(0, arg9, 4, var15, var14, false, var12, var17.field973, true, var13);
                }
                arg8.method59(arg2, arg1, var16, var38, var19, 512, arg0, var18, 0, field38, arg6, 0);
            } else if (arg3 == 8) {
                Entity var39;
                if (var17.field973 == -1 && var17.field993 == null) {
                    var39 = var17.method334(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var39 = new LocEntity(0, arg9, 4, var15, var14, false, var12, var17.field973, true, var13);
                }
                arg8.method59(arg2, arg1, var16, var39, var19, 768, arg0, var18, 0, field38, arg6, 0);
            }
        }
    }
}
