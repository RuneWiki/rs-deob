import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "b", descriptor = "Z")
    private boolean field39 = false;

    @OriginalMember(owner = "c", name = "f", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "c", name = "h", descriptor = "[[[I")
    private int[][][] field45;

    @OriginalMember(owner = "c", name = "i", descriptor = "[[[B")
    private byte[][][] field46;

    @OriginalMember(owner = "c", name = "j", descriptor = "[[[B")
    private byte[][][] field47;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[B")
    private byte[][][] field48;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field49;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field50;

    @OriginalMember(owner = "c", name = "u", descriptor = "[[[I")
    private int[][][] field58;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field51;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[I")
    private int[][] field52;

    @OriginalMember(owner = "c", name = "p", descriptor = "[I")
    private int[] field53;

    @OriginalMember(owner = "c", name = "q", descriptor = "[I")
    private int[] field54;

    @OriginalMember(owner = "c", name = "r", descriptor = "[I")
    private int[] field55;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field57;

    @OriginalMember(owner = "c", name = "a", descriptor = "I")
    private static int field38 = 1000;

    @OriginalMember(owner = "c", name = "d", descriptor = "Z")
    public static boolean field41 = true;

    @OriginalMember(owner = "c", name = "v", descriptor = "[I")
    private static final int[] field59 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private static final int[] field60 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private static final int[] field61 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field62 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "z", descriptor = "I")
    private static int field63 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "c", name = "A", descriptor = "I")
    private static int field64 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "c", name = "c", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "c", name = "e", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "([[[BII[[[II)V")
    public World(byte[][][] arg0, int arg1, int arg2, int[][][] arg3, int arg4) {
        this.field43 = arg1;
        this.field44 = arg2;
        this.field45 = arg3;
        this.field46 = arg0;
        if (arg4 >= 0) {
            this.field39 = !this.field39;
        }
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
        for (int var6 = arg1; var6 <= arg1 + arg4; var6++) {
            for (int var8 = arg0; var8 <= arg0 + arg2; var8++) {
                if (var8 >= 0 && var8 < this.field43 && var6 >= 0 && var6 < this.field44) {
                    this.field51[0][var8][var6] = 127;
                    if (arg0 == var8 && var8 > 0) {
                        this.field45[0][var8][var6] = this.field45[0][var8 - 1][var6];
                    }
                    if (arg0 + arg2 == var8 && var8 < this.field43 - 1) {
                        this.field45[0][var8][var6] = this.field45[0][var8 + 1][var6];
                    }
                    if (arg1 == var6 && var6 > 0) {
                        this.field45[0][var8][var6] = this.field45[0][var8][var6 - 1];
                    }
                    if (arg1 + arg4 == var6 && var6 < this.field44 - 1) {
                        this.field45[0][var8][var6] = this.field45[0][var8][var6 + 1];
                    }
                }
            }
        }
        if (arg3 != 3) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II[BIII)V")
    public final void method15(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var7 = 80 / arg1;
        Packet var8 = new Packet(field38, arg2);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    int var12 = arg4 + var10;
                    int var13 = arg5 + var11;
                    if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                        this.field46[var9][var12][var13] = 0;
                        while (true) {
                            int var14 = var8.method229();
                            if (var14 == 0) {
                                if (var9 == 0) {
                                    this.field45[0][var12][var13] = -method22(var12 + arg3 + 932731, var13 + 556238 + arg0) * 8;
                                } else {
                                    this.field45[var9][var12][var13] = this.field45[var9 - 1][var12][var13] - 240;
                                }
                                break;
                            }
                            if (var14 == 1) {
                                int var15 = var8.method229();
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
                                this.field48[var9][var12][var13] = var8.method230();
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
                            int var16 = var8.method229();
                            if (var16 == 0) {
                                break;
                            }
                            if (var16 == 1) {
                                var8.method229();
                                break;
                            }
                            if (var16 <= 49) {
                                var8.method229();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method16(int arg0, int arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        int var5 = 63 / arg1;
        Packet var6 = new Packet(field38, arg2);
        int var7 = -1;
        label50: while (true) {
            int var8 = var6.method243();
            if (var8 == 0) {
                return var4;
            }
            var7 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var6.method243();
                    if (var12 == 0) {
                        continue label50;
                    }
                    var9 += var12 - 1;
                    int var13 = var9 & 0x3F;
                    int var14 = var9 >> 6 & 0x3F;
                    int var15 = var6.method229() >> 2;
                    int var16 = arg3 + var14;
                    int var17 = arg0 + var13;
                    if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                        LocType var18 = LocType.method330(var7);
                        if (var15 != 22 || !field41 || var18.field955 || var18.field975) {
                            var4 &= var18.method334(230);
                            var10 = true;
                        }
                    }
                }
                int var11 = var6.method243();
                if (var11 == 0) {
                    break;
                }
                var6.method229();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Llb;ILub;)V")
    public static final void method17(Packet arg0, int arg1, OnDemand arg2) {
        if (arg1 != -15495) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = -1;
        while (true) {
            int var5 = arg0.method243();
            if (var5 == 0) {
                return;
            }
            var4 += var5;
            LocType var6 = LocType.method330(var4);
            var6.method335(-461, arg2);
            while (true) {
                int var7 = arg0.method243();
                if (var7 == 0) {
                    break;
                }
                arg0.method229();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([Ljc;II[BLr;I)V")
    public final void method18(CollisionMap[] arg0, int arg1, int arg2, byte[] arg3, World3D arg4, int arg5) {
        if (arg2 != 3) {
            return;
        }
        Packet var7 = new Packet(field38, arg3);
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
                int var18 = arg1 + var13;
                int var19 = arg5 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field46[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    CollisionMap var21 = null;
                    if (var20 >= 0) {
                        var21 = arg0[var20];
                    }
                    this.method19(var16, var8, var14, var19, var21, (byte) 5, var17, var18, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIILjc;BIILr;)V")
    private final void method19(int arg0, int arg1, int arg2, int arg3, CollisionMap arg4, byte arg5, int arg6, int arg7, World3D arg8) {
        if (field41) {
            if ((this.field46[arg2][arg7][arg3] & 0x10) != 0) {
                return;
            }
            if (this.method21(0, arg2, arg3, arg7) != field42) {
                return;
            }
        }
        int var10 = this.field45[arg2][arg7][arg3];
        int var11 = this.field45[arg2][arg7 + 1][arg3];
        int var12 = this.field45[arg2][arg7 + 1][arg3 + 1];
        int var13 = this.field45[arg2][arg7][arg3 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        if (arg5 != 5) {
            return;
        }
        boolean var15 = false;
        LocType var16 = LocType.method330(arg1);
        int var17 = (arg1 << 14) + (arg3 << 7) + arg7 + 1073741824;
        if (!var16.field955) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg6 << 6) + arg0);
        if (arg0 == 22) {
            if (!field41 || var16.field955 || var16.field975) {
                Entity var19;
                if (var16.field959 == -1 && var16.field978 == null) {
                    var19 = var16.method336(22, arg6, var10, var11, var12, var13, -1);
                } else {
                    var19 = new LocEntity(arg1, true, var13, var10, 22, var16.field959, var12, var11, -966, arg6);
                }
                arg8.method56(arg7, arg2, var17, arg3, true, var18, var14, var19);
                if (var16.field953 && var16.field955 && arg4 != null) {
                    arg4.method362(arg3, (byte) 7, arg7);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            Entity var39;
            if (var16.field959 == -1 && var16.field978 == null) {
                var39 = var16.method336(10, arg6, var10, var11, var12, var13, -1);
            } else {
                var39 = new LocEntity(arg1, true, var13, var10, 10, var16.field959, var12, var11, -966, arg6);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg0 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg6 == 1 || arg6 == 3) {
                    var41 = var16.field952;
                    var42 = var16.field951;
                } else {
                    var41 = var16.field951;
                    var42 = var16.field952;
                }
                if (arg8.method60(arg2, var39, var41, var17, var18, var42, arg3, var14, var40, 581, arg7) && var16.field967) {
                    Model var43;
                    if (var39 instanceof Model) {
                        var43 = (Model) var39;
                    } else {
                        var43 = var16.method336(10, arg6, var10, var11, var12, var13, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field562 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field51[arg2][arg7 + var44][arg3 + var45]) {
                                    this.field51[arg2][arg7 + var44][arg3 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var16.field953 && arg4 != null) {
                arg4.method361(arg3, arg6, var16.field954, false, var16.field952, arg7, var16.field951);
            }
        } else if (arg0 >= 12) {
            Entity var20;
            if (var16.field959 == -1 && var16.field978 == null) {
                var20 = var16.method336(arg0, arg6, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(arg1, true, var13, var10, arg0, var16.field959, var12, var11, -966, arg6);
            }
            arg8.method60(arg2, var20, 1, var17, var18, 1, arg3, var14, 0, 581, arg7);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0) {
                this.field58[arg2][arg7][arg3] |= 0x924;
            }
            if (var16.field953 && arg4 != null) {
                arg4.method361(arg3, arg6, var16.field954, false, var16.field952, arg7, var16.field951);
            }
        } else if (arg0 == 0) {
            Entity var21;
            if (var16.field959 == -1 && var16.field978 == null) {
                var21 = var16.method336(0, arg6, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(arg1, true, var13, var10, 0, var16.field959, var12, var11, -966, arg6);
            }
            arg8.method58(7, var18, 0, arg3, field59[arg6], arg2, arg7, var21, null, var14, var17);
            if (arg6 == 0) {
                if (var16.field967) {
                    this.field51[arg2][arg7][arg3] = 50;
                    this.field51[arg2][arg7][arg3 + 1] = 50;
                }
                if (var16.field958) {
                    this.field58[arg2][arg7][arg3] |= 0x249;
                }
            } else if (arg6 == 1) {
                if (var16.field967) {
                    this.field51[arg2][arg7][arg3 + 1] = 50;
                    this.field51[arg2][arg7 + 1][arg3 + 1] = 50;
                }
                if (var16.field958) {
                    this.field58[arg2][arg7][arg3 + 1] |= 0x492;
                }
            } else if (arg6 == 2) {
                if (var16.field967) {
                    this.field51[arg2][arg7 + 1][arg3] = 50;
                    this.field51[arg2][arg7 + 1][arg3 + 1] = 50;
                }
                if (var16.field958) {
                    this.field58[arg2][arg7 + 1][arg3] |= 0x249;
                }
            } else if (arg6 == 3) {
                if (var16.field967) {
                    this.field51[arg2][arg7][arg3] = 50;
                    this.field51[arg2][arg7 + 1][arg3] = 50;
                }
                if (var16.field958) {
                    this.field58[arg2][arg7][arg3] |= 0x492;
                }
            }
            if (var16.field953 && arg4 != null) {
                arg4.method360(arg7, var16.field954, arg0, arg3, arg6, 0);
            }
            if (var16.field960 != 16) {
                arg8.method66(var16.field960, arg7, -951, arg2, arg3);
            }
        } else if (arg0 == 1) {
            Entity var22;
            if (var16.field959 == -1 && var16.field978 == null) {
                var22 = var16.method336(1, arg6, var10, var11, var12, var13, -1);
            } else {
                var22 = new LocEntity(arg1, true, var13, var10, 1, var16.field959, var12, var11, -966, arg6);
            }
            arg8.method58(7, var18, 0, arg3, field60[arg6], arg2, arg7, var22, null, var14, var17);
            if (var16.field967) {
                if (arg6 == 0) {
                    this.field51[arg2][arg7][arg3 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field51[arg2][arg7 + 1][arg3 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field51[arg2][arg7 + 1][arg3] = 50;
                } else if (arg6 == 3) {
                    this.field51[arg2][arg7][arg3] = 50;
                }
            }
            if (var16.field953 && arg4 != null) {
                arg4.method360(arg7, var16.field954, arg0, arg3, arg6, 0);
            }
        } else if (arg0 == 2) {
            int var23 = arg6 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var16.field959 == -1 && var16.field978 == null) {
                var24 = var16.method336(2, arg6 + 4, var10, var11, var12, var13, -1);
                var25 = var16.method336(2, var23, var10, var11, var12, var13, -1);
            } else {
                var24 = new LocEntity(arg1, true, var13, var10, 2, var16.field959, var12, var11, -966, arg6 + 4);
                var25 = new LocEntity(arg1, true, var13, var10, 2, var16.field959, var12, var11, -966, var23);
            }
            arg8.method58(7, var18, field59[var23], arg3, field59[arg6], arg2, arg7, var24, var25, var14, var17);
            if (var16.field958) {
                if (arg6 == 0) {
                    this.field58[arg2][arg7][arg3] |= 0x249;
                    this.field58[arg2][arg7][arg3 + 1] |= 0x492;
                } else if (arg6 == 1) {
                    this.field58[arg2][arg7][arg3 + 1] |= 0x492;
                    this.field58[arg2][arg7 + 1][arg3] |= 0x249;
                } else if (arg6 == 2) {
                    this.field58[arg2][arg7 + 1][arg3] |= 0x249;
                    this.field58[arg2][arg7][arg3] |= 0x492;
                } else if (arg6 == 3) {
                    this.field58[arg2][arg7][arg3] |= 0x492;
                    this.field58[arg2][arg7][arg3] |= 0x249;
                }
            }
            if (var16.field953 && arg4 != null) {
                arg4.method360(arg7, var16.field954, arg0, arg3, arg6, 0);
            }
            if (var16.field960 != 16) {
                arg8.method66(var16.field960, arg7, -951, arg2, arg3);
            }
        } else if (arg0 == 3) {
            Entity var26;
            if (var16.field959 == -1 && var16.field978 == null) {
                var26 = var16.method336(3, arg6, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(arg1, true, var13, var10, 3, var16.field959, var12, var11, -966, arg6);
            }
            arg8.method58(7, var18, 0, arg3, field60[arg6], arg2, arg7, var26, null, var14, var17);
            if (var16.field967) {
                if (arg6 == 0) {
                    this.field51[arg2][arg7][arg3 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field51[arg2][arg7 + 1][arg3 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field51[arg2][arg7 + 1][arg3] = 50;
                } else if (arg6 == 3) {
                    this.field51[arg2][arg7][arg3] = 50;
                }
            }
            if (var16.field953 && arg4 != null) {
                arg4.method360(arg7, var16.field954, arg0, arg3, arg6, 0);
            }
        } else if (arg0 == 9) {
            Entity var27;
            if (var16.field959 == -1 && var16.field978 == null) {
                var27 = var16.method336(arg0, arg6, var10, var11, var12, var13, -1);
            } else {
                var27 = new LocEntity(arg1, true, var13, var10, arg0, var16.field959, var12, var11, -966, arg6);
            }
            arg8.method60(arg2, var27, 1, var17, var18, 1, arg3, var14, 0, 581, arg7);
            if (var16.field953 && arg4 != null) {
                arg4.method361(arg3, arg6, var16.field954, false, var16.field952, arg7, var16.field951);
            }
        } else {
            if (var16.field956) {
                if (arg6 == 1) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg6 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg6 == 3) {
                    int var31 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var31;
                }
            }
            if (arg0 == 4) {
                Entity var32;
                if (var16.field959 == -1 && var16.field978 == null) {
                    var32 = var16.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var32 = new LocEntity(arg1, true, var13, var10, 4, var16.field959, var12, var11, -966, 0);
                }
                arg8.method59(var18, 0, arg7, 18931, arg6 * 512, field59[arg6], arg2, 0, var14, var17, arg3, var32);
            } else if (arg0 == 5) {
                int var33 = 16;
                int var34 = arg8.method76(arg2, arg7, arg3);
                if (var34 > 0) {
                    var33 = LocType.method330(var34 >> 14 & 0x7FFF).field960;
                }
                Entity var35;
                if (var16.field959 == -1 && var16.field978 == null) {
                    var35 = var16.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new LocEntity(arg1, true, var13, var10, 4, var16.field959, var12, var11, -966, 0);
                }
                arg8.method59(var18, field61[arg6] * var33, arg7, 18931, arg6 * 512, field59[arg6], arg2, field62[arg6] * var33, var14, var17, arg3, var35);
            } else if (arg0 == 6) {
                Entity var36;
                if (var16.field959 == -1 && var16.field978 == null) {
                    var36 = var16.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new LocEntity(arg1, true, var13, var10, 4, var16.field959, var12, var11, -966, 0);
                }
                arg8.method59(var18, 0, arg7, 18931, arg6, 256, arg2, 0, var14, var17, arg3, var36);
            } else if (arg0 == 7) {
                Entity var37;
                if (var16.field959 == -1 && var16.field978 == null) {
                    var37 = var16.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new LocEntity(arg1, true, var13, var10, 4, var16.field959, var12, var11, -966, 0);
                }
                arg8.method59(var18, 0, arg7, 18931, arg6, 512, arg2, 0, var14, var17, arg3, var37);
            } else if (arg0 == 8) {
                Entity var38;
                if (var16.field959 == -1 && var16.field978 == null) {
                    var38 = var16.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var38 = new LocEntity(arg1, true, var13, var10, 4, var16.field959, var12, var11, -966, 0);
                }
                arg8.method59(var18, 0, arg7, 18931, arg6, 768, arg2, 0, var14, var17, arg3, var38);
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;I[Ljc;)V")
    public final void method20(World3D arg0, int arg1, CollisionMap[] arg2) {
        if (arg1 >= 0) {
            field38 = -78;
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
                            arg2[var112].method362(var111, (byte) 7, var110);
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
                            FloType var97 = FloType.field1094[var96 - 1];
                            this.field53[var61] += var97.field1103;
                            this.field54[var61] += var97.field1101;
                            this.field55[var61] += var97.field1102;
                            this.field56[var61] += var97.field1104;
                            var10002 = this.field57[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field43) {
                        int var99 = this.field47[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.field1094[var99 - 1];
                            this.field53[var61] -= var100.field1103;
                            this.field54[var61] -= var100.field1101;
                            this.field55[var61] -= var100.field1102;
                            this.field56[var61] -= var100.field1104;
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
                        if (var67 >= 1 && var67 < this.field44 - 1 && (!field41 || (this.field46[var5][var58][var67] & 0x10) == 0 && this.method21(0, var5, var67, var58) == field42)) {
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
                                    if (var71 > 0 && !FloType.field1094[var71 - 1].field1099) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field58[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Pix3D.field654[method27(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method55(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field49[var5][var58][var67] + 1;
                                    byte var90 = this.field50[var5][var58][var67];
                                    FloType var91 = FloType.field1094[var71 - 1];
                                    int var92 = var91.field1097;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Pix3D.method170(0, var92);
                                        var94 = -1;
                                    } else if (var91.field1096 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method29(var91.field1100, var91.field1101, var91.field1102);
                                        var93 = Pix3D.field654[this.method28(var91.field1105, 96)];
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
                    arg0.method54(var5, var60, var59, this.method21(0, var5, var59, var60));
                }
            }
        }
        arg0.method81(-50, 768, -50, (byte) 3, 64, -10);
        for (int var6 = 0; var6 < this.field43; var6++) {
            for (int var47 = 0; var47 < this.field44; var47++) {
                if ((this.field46[1][var6][var47] & 0x2) == 2) {
                    arg0.method52(var47, false, var6);
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
                            label326: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field58[var16 - 1][var13][var18] & var7) == 0) {
                                        break label326;
                                    }
                                }
                                var16--;
                            }
                            label315: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field58[var17 + 1][var13][var19] & var7) == 0) {
                                        break label315;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field45[var17][var13][var14] - var21;
                                int var23 = this.field45[var16][var13][var14];
                                World3D.method53(1, var22, var10, var13 * 128, var13 * 128, var23, var14 * 128, this.field40, var15 * 128 + 128);
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
                            label379: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field58[var28 - 1][var30][var12] & var8) == 0) {
                                        break label379;
                                    }
                                }
                                var28--;
                            }
                            label368: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field58[var29 + 1][var31][var12] & var8) == 0) {
                                        break label368;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field45[var29][var26][var12] - var33;
                                int var35 = this.field45[var28][var26][var12];
                                World3D.method53(2, var34, var10, var27 * 128 + 128, var26 * 128, var35, var12 * 128, this.field40, var12 * 128);
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
                            label432: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field58[var11][var38 - 1][var42] & var9) == 0) {
                                        break label432;
                                    }
                                }
                                var38--;
                            }
                            label421: while (var39 < this.field43) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field58[var11][var39 + 1][var43] & var9) == 0) {
                                        break label421;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field45[var11][var38][var40];
                                World3D.method53(4, var44, var10, var39 * 128 + 128, var38 * 128, var44, var40 * 128, this.field40, var41 * 128 + 128);
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
        if (arg0 != 0) {
            this.field39 = !this.field39;
        }
        if ((this.field46[arg1][arg3][arg2] & 0x8) == 0) {
            return arg1 <= 0 || (this.field46[1][arg3][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
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
        int var4 = 65536 - Pix3D.field643[arg2 * 1024 / arg3] >> 1;
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(BII)Z")
    public static final boolean method30(byte arg0, int arg1, int arg2) {
        LocType var3 = LocType.method330(arg2);
        if (arg0 != 121) {
            field38 = 259;
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method333(-23698, arg1);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIILr;IILjc;[[[IIII)V")
    public static final void method31(int arg0, int arg1, int arg2, World3D arg3, int arg4, int arg5, CollisionMap arg6, int[][][] arg7, int arg8, int arg9, int arg10) {
        int var11 = arg7[arg4][arg10][arg0];
        int var12 = arg7[arg4][arg10 + 1][arg0];
        int var13 = arg7[arg4][arg10 + 1][arg0 + 1];
        int var14 = arg7[arg4][arg10][arg0 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method330(arg9);
        while (arg5 >= 0) {
            field38 = -309;
        }
        int var17 = (arg9 << 14) + (arg0 << 7) + arg10 + 1073741824;
        if (!var16.field955) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg1 << 6) + arg8);
        if (arg8 == 22) {
            Entity var19;
            if (var16.field959 == -1 && var16.field978 == null) {
                var19 = var16.method336(22, arg1, var11, var12, var13, var14, -1);
            } else {
                var19 = new LocEntity(arg9, true, var14, var11, 22, var16.field959, var13, var12, -966, arg1);
            }
            arg3.method56(arg10, arg2, var17, arg0, true, var18, var15, var19);
            if (var16.field953 && var16.field955) {
                arg6.method362(arg0, (byte) 7, arg10);
            }
        } else if (arg8 == 10 || arg8 == 11) {
            Entity var39;
            if (var16.field959 == -1 && var16.field978 == null) {
                var39 = var16.method336(10, arg1, var11, var12, var13, var14, -1);
            } else {
                var39 = new LocEntity(arg9, true, var14, var11, 10, var16.field959, var13, var12, -966, arg1);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg8 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg1 == 1 || arg1 == 3) {
                    var41 = var16.field952;
                    var42 = var16.field951;
                } else {
                    var41 = var16.field951;
                    var42 = var16.field952;
                }
                arg3.method60(arg2, var39, var41, var17, var18, var42, arg0, var15, var40, 581, arg10);
            }
            if (var16.field953) {
                arg6.method361(arg0, arg1, var16.field954, false, var16.field952, arg10, var16.field951);
            }
        } else if (arg8 >= 12) {
            Entity var20;
            if (var16.field959 == -1 && var16.field978 == null) {
                var20 = var16.method336(arg8, arg1, var11, var12, var13, var14, -1);
            } else {
                var20 = new LocEntity(arg9, true, var14, var11, arg8, var16.field959, var13, var12, -966, arg1);
            }
            arg3.method60(arg2, var20, 1, var17, var18, 1, arg0, var15, 0, 581, arg10);
            if (var16.field953) {
                arg6.method361(arg0, arg1, var16.field954, false, var16.field952, arg10, var16.field951);
            }
        } else if (arg8 == 0) {
            Entity var21;
            if (var16.field959 == -1 && var16.field978 == null) {
                var21 = var16.method336(0, arg1, var11, var12, var13, var14, -1);
            } else {
                var21 = new LocEntity(arg9, true, var14, var11, 0, var16.field959, var13, var12, -966, arg1);
            }
            arg3.method58(7, var18, 0, arg0, field59[arg1], arg2, arg10, var21, null, var15, var17);
            if (var16.field953) {
                arg6.method360(arg10, var16.field954, arg8, arg0, arg1, 0);
            }
        } else if (arg8 == 1) {
            Entity var22;
            if (var16.field959 == -1 && var16.field978 == null) {
                var22 = var16.method336(1, arg1, var11, var12, var13, var14, -1);
            } else {
                var22 = new LocEntity(arg9, true, var14, var11, 1, var16.field959, var13, var12, -966, arg1);
            }
            arg3.method58(7, var18, 0, arg0, field60[arg1], arg2, arg10, var22, null, var15, var17);
            if (var16.field953) {
                arg6.method360(arg10, var16.field954, arg8, arg0, arg1, 0);
            }
        } else if (arg8 == 2) {
            int var23 = arg1 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var16.field959 == -1 && var16.field978 == null) {
                var24 = var16.method336(2, arg1 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method336(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new LocEntity(arg9, true, var14, var11, 2, var16.field959, var13, var12, -966, arg1 + 4);
                var25 = new LocEntity(arg9, true, var14, var11, 2, var16.field959, var13, var12, -966, var23);
            }
            arg3.method58(7, var18, field59[var23], arg0, field59[arg1], arg2, arg10, var24, var25, var15, var17);
            if (var16.field953) {
                arg6.method360(arg10, var16.field954, arg8, arg0, arg1, 0);
            }
        } else if (arg8 == 3) {
            Entity var26;
            if (var16.field959 == -1 && var16.field978 == null) {
                var26 = var16.method336(3, arg1, var11, var12, var13, var14, -1);
            } else {
                var26 = new LocEntity(arg9, true, var14, var11, 3, var16.field959, var13, var12, -966, arg1);
            }
            arg3.method58(7, var18, 0, arg0, field60[arg1], arg2, arg10, var26, null, var15, var17);
            if (var16.field953) {
                arg6.method360(arg10, var16.field954, arg8, arg0, arg1, 0);
            }
        } else if (arg8 == 9) {
            Entity var27;
            if (var16.field959 == -1 && var16.field978 == null) {
                var27 = var16.method336(arg8, arg1, var11, var12, var13, var14, -1);
            } else {
                var27 = new LocEntity(arg9, true, var14, var11, arg8, var16.field959, var13, var12, -966, arg1);
            }
            arg3.method60(arg2, var27, 1, var17, var18, 1, arg0, var15, 0, 581, arg10);
            if (var16.field953) {
                arg6.method361(arg0, arg1, var16.field954, false, var16.field952, arg10, var16.field951);
            }
        } else {
            if (var16.field956) {
                if (arg1 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg1 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg1 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg8 == 4) {
                Entity var32;
                if (var16.field959 == -1 && var16.field978 == null) {
                    var32 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new LocEntity(arg9, true, var14, var11, 4, var16.field959, var13, var12, -966, 0);
                }
                arg3.method59(var18, 0, arg10, 18931, arg1 * 512, field59[arg1], arg2, 0, var15, var17, arg0, var32);
            } else if (arg8 == 5) {
                int var33 = 16;
                int var34 = arg3.method76(arg2, arg10, arg0);
                if (var34 > 0) {
                    var33 = LocType.method330(var34 >> 14 & 0x7FFF).field960;
                }
                Entity var35;
                if (var16.field959 == -1 && var16.field978 == null) {
                    var35 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new LocEntity(arg9, true, var14, var11, 4, var16.field959, var13, var12, -966, 0);
                }
                arg3.method59(var18, field61[arg1] * var33, arg10, 18931, arg1 * 512, field59[arg1], arg2, field62[arg1] * var33, var15, var17, arg0, var35);
            } else if (arg8 == 6) {
                Entity var36;
                if (var16.field959 == -1 && var16.field978 == null) {
                    var36 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new LocEntity(arg9, true, var14, var11, 4, var16.field959, var13, var12, -966, 0);
                }
                arg3.method59(var18, 0, arg10, 18931, arg1, 256, arg2, 0, var15, var17, arg0, var36);
            } else if (arg8 == 7) {
                Entity var37;
                if (var16.field959 == -1 && var16.field978 == null) {
                    var37 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new LocEntity(arg9, true, var14, var11, 4, var16.field959, var13, var12, -966, 0);
                }
                arg3.method59(var18, 0, arg10, 18931, arg1, 512, arg2, 0, var15, var17, arg0, var37);
            } else if (arg8 == 8) {
                Entity var38;
                if (var16.field959 == -1 && var16.field978 == null) {
                    var38 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new LocEntity(arg9, true, var14, var11, 4, var16.field959, var13, var12, -966, 0);
                }
                arg3.method59(var18, 0, arg10, 18931, arg1, 768, arg2, 0, var15, var17, arg0, var38);
            }
        }
    }
}
