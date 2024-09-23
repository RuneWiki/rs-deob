import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "a", descriptor = "I")
    private int field35 = 336;

    @OriginalMember(owner = "c", name = "b", descriptor = "B")
    private byte field36 = -104;

    @OriginalMember(owner = "c", name = "i", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "c", name = "j", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[I")
    private int[][][] field45;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field46;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field47;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field48;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field49;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[[B")
    private byte[][][] field50;

    @OriginalMember(owner = "c", name = "x", descriptor = "[[[I")
    private int[][][] field58;

    @OriginalMember(owner = "c", name = "q", descriptor = "[[[B")
    private byte[][][] field51;

    @OriginalMember(owner = "c", name = "r", descriptor = "[[I")
    private int[][] field52;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field53;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field54;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field55;

    @OriginalMember(owner = "c", name = "v", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private int[] field57;

    @OriginalMember(owner = "c", name = "d", descriptor = "Z")
    private static boolean field38 = true;

    @OriginalMember(owner = "c", name = "e", descriptor = "I")
    private static int field39 = -179;

    @OriginalMember(owner = "c", name = "f", descriptor = "Z")
    public static boolean field40 = true;

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field59 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field60 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "A", descriptor = "[I")
    private static final int[] field61 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "B", descriptor = "[I")
    private static final int[] field62 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "C", descriptor = "I")
    private static int field63 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "c", name = "D", descriptor = "I")
    private static int field64 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "c", name = "c", descriptor = "Z")
    private static boolean field37;

    @OriginalMember(owner = "c", name = "h", descriptor = "Z")
    public static boolean field42;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "(III[[[I[[[B)V")
    public World(int arg0, int arg1, int arg2, int[][][] arg3, byte[][][] arg4) {
        this.field43 = arg2;
        this.field44 = arg1;
        this.field45 = arg3;
        this.field46 = arg4;
        this.field47 = new byte[4][this.field43][this.field44];
        this.field48 = new byte[4][this.field43][this.field44];
        this.field49 = new byte[4][this.field43][this.field44];
        this.field50 = new byte[4][this.field43][this.field44];
        if (arg0 != 22035) {
            this.field35 = 428;
        }
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
        byte var6 = 0;
        for (int var7 = 0; var7 < FloType.field1046; var7++) {
            if (FloType.field1047[var7].field1052.equalsIgnoreCase("water")) {
                var6 = (byte) (var7 + 1);
                break;
            }
        }
        for (int var8 = arg4; var8 < arg1 + arg4; var8++) {
            for (int var10 = arg0; var10 < arg0 + arg3; var10++) {
                if (var10 >= 0 && var10 < this.field43 && var8 >= 0 && var8 < this.field44) {
                    this.field48[0][var10][var8] = var6;
                    for (int var11 = 0; var11 < 4; var11++) {
                        this.field45[var11][var10][var8] = 0;
                        this.field46[var11][var10][var8] = 0;
                    }
                }
            }
        }
        if (arg2 < 2 || arg2 > 2) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([BIIIZI)V")
    public final void method15(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            this.field35 = -200;
        }
        Packet var7 = new Packet(arg0, true);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg2 + var9;
                    int var12 = arg5 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field46[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method231();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field45[0][var11][var12] = -method22(var11 + arg3 + 932731, var12 + 556238 + arg1) * 8;
                                } else {
                                    this.field45[var8][var11][var12] = this.field45[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method231();
                                if (var14 == 1) {
                                    var14 = 0;
                                }
                                if (var8 == 0) {
                                    this.field45[0][var11][var12] = -var14 * 8;
                                } else {
                                    this.field45[var8][var11][var12] = this.field45[var8 - 1][var11][var12] - var14 * 8;
                                }
                                break;
                            }
                            if (var13 <= 49) {
                                this.field48[var8][var11][var12] = var7.method232();
                                this.field49[var8][var11][var12] = (byte) ((var13 - 2) / 4);
                                this.field50[var8][var11][var12] = (byte) (var13 - 2 & 0x3);
                            } else if (var13 <= 81) {
                                this.field46[var8][var11][var12] = (byte) (var13 - 49);
                            } else {
                                this.field47[var8][var11][var12] = (byte) (var13 - 81);
                            }
                        }
                    } else {
                        while (true) {
                            int var15 = var7.method231();
                            if (var15 == 0) {
                                break;
                            }
                            if (var15 == 1) {
                                var7.method231();
                                break;
                            }
                            if (var15 <= 49) {
                                var7.method231();
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
        Packet var5 = new Packet(arg2, true);
        int var6 = -1;
        if (arg3 >= 0) {
            field37 = !field37;
        }
        label57: while (true) {
            int var7 = var5.method245();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method245();
                    if (var11 == 0) {
                        continue label57;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method231() >> 2;
                    int var15 = arg1 + var13;
                    int var16 = arg0 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.method324(var6);
                        if (var14 != 22 || !field40 || var17.field931 || var17.field952) {
                            var4 &= var17.method328(true);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method245();
                if (var10 == 0) {
                    break;
                }
                var5.method231();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lmb;Lvb;Z)V")
    public static final void method17(Packet arg0, OnDemand arg1, boolean arg2) {
        if (arg2) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = -1;
        while (true) {
            int var5 = arg0.method245();
            if (var5 == 0) {
                return;
            }
            var4 += var5;
            LocType var6 = LocType.method324(var4);
            var6.method329(false, arg1);
            while (true) {
                int var7 = arg0.method245();
                if (var7 == 0) {
                    break;
                }
                arg0.method231();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(I[Lic;I[BILs;)V")
    public final void method18(int arg0, CollisionMap[] arg1, int arg2, byte[] arg3, int arg4, World3D arg5) {
        if (arg2 != 0) {
            return;
        }
        Packet var7 = new Packet(arg3, true);
        int var8 = -1;
        while (true) {
            int var9 = var7.method245();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method245();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method231();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg4 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field46[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    CollisionMap var21 = null;
                    if (var20 >= 0) {
                        var21 = arg1[var20];
                    }
                    this.method19(var8, var19, var17, arg5, var16, var14, var21, -756, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIILs;IILic;II)V")
    private final void method19(int arg0, int arg1, int arg2, World3D arg3, int arg4, int arg5, CollisionMap arg6, int arg7, int arg8) {
        if (field40) {
            if ((this.field46[arg5][arg8][arg1] & 0x10) != 0) {
                return;
            }
            if (this.method21(22171, arg1, arg8, arg5) != field41) {
                return;
            }
        }
        int var10 = this.field45[arg5][arg8][arg1];
        int var11 = this.field45[arg5][arg8 + 1][arg1];
        while (arg7 >= 0) {
            field37 = !field37;
        }
        int var12 = this.field45[arg5][arg8 + 1][arg1 + 1];
        int var13 = this.field45[arg5][arg8][arg1 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        LocType var15 = LocType.method324(arg0);
        int var16 = (arg0 << 14) + (arg1 << 7) + arg8 + 1073741824;
        if (!var15.field931) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg2 << 6) + arg4);
        if (arg4 == 22) {
            if (!field40 || var15.field931 || var15.field952) {
                Entity var18;
                if (var15.field935 == -1) {
                    var18 = var15.method330(22, arg2, var10, var11, var12, var13, -1);
                } else {
                    var18 = new LocEntity(22, arg0, var12, var15.field935, arg2, 0, true, var11, var13, var10);
                }
                arg3.method68(var18, arg8, true, var16, var14, arg1, arg5, var17);
                if (var15.field929 && var15.field931 && arg6 != null) {
                    arg6.method353(arg8, false, arg1);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            Entity var34;
            if (var15.field935 == -1) {
                var34 = var15.method330(10, arg2, var10, var11, var12, var13, -1);
            } else {
                var34 = new LocEntity(10, arg0, var12, var15.field935, arg2, 0, true, var11, var13, var10);
            }
            if (var34 != null) {
                int var35 = 0;
                if (arg4 == 11) {
                    var35 += 256;
                }
                int var36;
                int var37;
                if (arg2 == 1 || arg2 == 3) {
                    var36 = var15.field928;
                    var37 = var15.field927;
                } else {
                    var36 = var15.field927;
                    var37 = var15.field928;
                }
                if (arg3.method72(var14, arg8, var35, var16, var34, arg1, var37, -26824, arg5, var36, var17) && var15.field944) {
                    Model var38;
                    if (var34 instanceof Model) {
                        var38 = (Model) var34;
                    } else {
                        var38 = var15.method330(10, arg2, var10, var11, var12, var13, -1);
                    }
                    if (var38 != null) {
                        for (int var39 = 0; var39 <= var36; var39++) {
                            for (int var40 = 0; var40 <= var37; var40++) {
                                int var41 = var38.field558 / 4;
                                if (var41 > 30) {
                                    var41 = 30;
                                }
                                if (var41 > this.field51[arg5][arg8 + var39][arg1 + var40]) {
                                    this.field51[arg5][arg8 + var39][arg1 + var40] = (byte) var41;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field929 && arg6 != null) {
                arg6.method352(arg8, var15.field927, var15.field930, arg2, var15.field928, -584, arg1);
            }
        } else if (arg4 >= 12) {
            Entity var19;
            if (var15.field935 == -1) {
                var19 = var15.method330(arg4, arg2, var10, var11, var12, var13, -1);
            } else {
                var19 = new LocEntity(arg4, arg0, var12, var15.field935, arg2, 0, true, var11, var13, var10);
            }
            arg3.method72(var14, arg8, 0, var16, var19, arg1, 1, -26824, arg5, 1, var17);
            if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg5 > 0) {
                this.field58[arg5][arg8][arg1] |= 0x924;
            }
            if (var15.field929 && arg6 != null) {
                arg6.method352(arg8, var15.field927, var15.field930, arg2, var15.field928, -584, arg1);
            }
        } else if (arg4 == 0) {
            Entity var20;
            if (var15.field935 == -1) {
                var20 = var15.method330(0, arg2, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(0, arg0, var12, var15.field935, arg2, 0, true, var11, var13, var10);
            }
            arg3.method70((byte) 81, arg8, var20, 0, field59[arg2], var17, arg5, null, var14, var16, arg1);
            if (arg2 == 0) {
                if (var15.field944) {
                    this.field51[arg5][arg8][arg1] = 50;
                    this.field51[arg5][arg8][arg1 + 1] = 50;
                }
                if (var15.field934) {
                    this.field58[arg5][arg8][arg1] |= 0x249;
                }
            } else if (arg2 == 1) {
                if (var15.field944) {
                    this.field51[arg5][arg8][arg1 + 1] = 50;
                    this.field51[arg5][arg8 + 1][arg1 + 1] = 50;
                }
                if (var15.field934) {
                    this.field58[arg5][arg8][arg1 + 1] |= 0x492;
                }
            } else if (arg2 == 2) {
                if (var15.field944) {
                    this.field51[arg5][arg8 + 1][arg1] = 50;
                    this.field51[arg5][arg8 + 1][arg1 + 1] = 50;
                }
                if (var15.field934) {
                    this.field58[arg5][arg8 + 1][arg1] |= 0x249;
                }
            } else if (arg2 == 3) {
                if (var15.field944) {
                    this.field51[arg5][arg8][arg1] = 50;
                    this.field51[arg5][arg8 + 1][arg1] = 50;
                }
                if (var15.field934) {
                    this.field58[arg5][arg8][arg1] |= 0x492;
                }
            }
            if (var15.field929 && arg6 != null) {
                arg6.method351(arg2, arg4, arg1, -8, arg8, var15.field930);
            }
            if (var15.field936 != 16) {
                arg3.method78(arg5, arg1, arg8, var15.field936, true);
            }
        } else if (arg4 == 1) {
            Entity var21;
            if (var15.field935 == -1) {
                var21 = var15.method330(1, arg2, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(1, arg0, var12, var15.field935, arg2, 0, true, var11, var13, var10);
            }
            arg3.method70((byte) 81, arg8, var21, 0, field60[arg2], var17, arg5, null, var14, var16, arg1);
            if (var15.field944) {
                if (arg2 == 0) {
                    this.field51[arg5][arg8][arg1 + 1] = 50;
                } else if (arg2 == 1) {
                    this.field51[arg5][arg8 + 1][arg1 + 1] = 50;
                } else if (arg2 == 2) {
                    this.field51[arg5][arg8 + 1][arg1] = 50;
                } else if (arg2 == 3) {
                    this.field51[arg5][arg8][arg1] = 50;
                }
            }
            if (var15.field929 && arg6 != null) {
                arg6.method351(arg2, arg4, arg1, -8, arg8, var15.field930);
            }
        } else if (arg4 == 2) {
            int var22 = arg2 + 1 & 0x3;
            Entity var23;
            Entity var24;
            if (var15.field935 == -1) {
                var23 = var15.method330(2, arg2 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method330(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new LocEntity(2, arg0, var12, var15.field935, arg2 + 4, 0, true, var11, var13, var10);
                var24 = new LocEntity(2, arg0, var12, var15.field935, var22, 0, true, var11, var13, var10);
            }
            arg3.method70((byte) 81, arg8, var23, field59[var22], field59[arg2], var17, arg5, var24, var14, var16, arg1);
            if (var15.field934) {
                if (arg2 == 0) {
                    this.field58[arg5][arg8][arg1] |= 0x249;
                    this.field58[arg5][arg8][arg1 + 1] |= 0x492;
                } else if (arg2 == 1) {
                    this.field58[arg5][arg8][arg1 + 1] |= 0x492;
                    this.field58[arg5][arg8 + 1][arg1] |= 0x249;
                } else if (arg2 == 2) {
                    this.field58[arg5][arg8 + 1][arg1] |= 0x249;
                    this.field58[arg5][arg8][arg1] |= 0x492;
                } else if (arg2 == 3) {
                    this.field58[arg5][arg8][arg1] |= 0x492;
                    this.field58[arg5][arg8][arg1] |= 0x249;
                }
            }
            if (var15.field929 && arg6 != null) {
                arg6.method351(arg2, arg4, arg1, -8, arg8, var15.field930);
            }
            if (var15.field936 != 16) {
                arg3.method78(arg5, arg1, arg8, var15.field936, true);
            }
        } else if (arg4 == 3) {
            Entity var25;
            if (var15.field935 == -1) {
                var25 = var15.method330(3, arg2, var10, var11, var12, var13, -1);
            } else {
                var25 = new LocEntity(3, arg0, var12, var15.field935, arg2, 0, true, var11, var13, var10);
            }
            arg3.method70((byte) 81, arg8, var25, 0, field60[arg2], var17, arg5, null, var14, var16, arg1);
            if (var15.field944) {
                if (arg2 == 0) {
                    this.field51[arg5][arg8][arg1 + 1] = 50;
                } else if (arg2 == 1) {
                    this.field51[arg5][arg8 + 1][arg1 + 1] = 50;
                } else if (arg2 == 2) {
                    this.field51[arg5][arg8 + 1][arg1] = 50;
                } else if (arg2 == 3) {
                    this.field51[arg5][arg8][arg1] = 50;
                }
            }
            if (var15.field929 && arg6 != null) {
                arg6.method351(arg2, arg4, arg1, -8, arg8, var15.field930);
            }
        } else if (arg4 == 9) {
            Entity var26;
            if (var15.field935 == -1) {
                var26 = var15.method330(arg4, arg2, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(arg4, arg0, var12, var15.field935, arg2, 0, true, var11, var13, var10);
            }
            arg3.method72(var14, arg8, 0, var16, var26, arg1, 1, -26824, arg5, 1, var17);
            if (var15.field929 && arg6 != null) {
                arg6.method352(arg8, var15.field927, var15.field930, arg2, var15.field928, -584, arg1);
            }
        } else if (arg4 == 4) {
            Entity var27;
            if (var15.field935 == -1) {
                var27 = var15.method330(4, 0, var10, var11, var12, var13, -1);
            } else {
                var27 = new LocEntity(4, arg0, var12, var15.field935, 0, 0, true, var11, var13, var10);
            }
            arg3.method71((byte) 4, arg2 * 512, field59[arg2], 0, arg1, arg8, var14, var17, var16, arg5, 0, var27);
        } else if (arg4 == 5) {
            int var28 = 16;
            int var29 = arg3.method88(arg5, arg8, arg1);
            if (var29 > 0) {
                var28 = LocType.method324(var29 >> 14 & 0x7FFF).field936;
            }
            Entity var30;
            if (var15.field935 == -1) {
                var30 = var15.method330(4, 0, var10, var11, var12, var13, -1);
            } else {
                var30 = new LocEntity(4, arg0, var12, var15.field935, 0, 0, true, var11, var13, var10);
            }
            arg3.method71((byte) 4, arg2 * 512, field59[arg2], field61[arg2] * var28, arg1, arg8, var14, var17, var16, arg5, field62[arg2] * var28, var30);
        } else if (arg4 == 6) {
            Entity var31;
            if (var15.field935 == -1) {
                var31 = var15.method330(4, 0, var10, var11, var12, var13, -1);
            } else {
                var31 = new LocEntity(4, arg0, var12, var15.field935, 0, 0, true, var11, var13, var10);
            }
            arg3.method71((byte) 4, arg2, 256, 0, arg1, arg8, var14, var17, var16, arg5, 0, var31);
        } else if (arg4 == 7) {
            Entity var32;
            if (var15.field935 == -1) {
                var32 = var15.method330(4, 0, var10, var11, var12, var13, -1);
            } else {
                var32 = new LocEntity(4, arg0, var12, var15.field935, 0, 0, true, var11, var13, var10);
            }
            arg3.method71((byte) 4, arg2, 512, 0, arg1, arg8, var14, var17, var16, arg5, 0, var32);
        } else if (arg4 == 8) {
            Entity var33;
            if (var15.field935 == -1) {
                var33 = var15.method330(4, 0, var10, var11, var12, var13, -1);
            } else {
                var33 = new LocEntity(4, arg0, var12, var15.field935, 0, 0, true, var11, var13, var10);
            }
            arg3.method71((byte) 4, arg2, 768, 0, arg1, arg8, var14, var17, var16, arg5, 0, var33);
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Ls;[Lic;Z)V")
    public final void method20(World3D arg0, CollisionMap[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((this.field46[var4][var111][var112] & 0x1) == 1) {
                        int var113 = var4;
                        if ((this.field46[1][var111][var112] & 0x2) == 2) {
                            var113 = var4 - 1;
                        }
                        if (var113 >= 0) {
                            arg1[var113].method353(var111, false, var112);
                        }
                    }
                }
            }
        }
        if (field42) {
            field63 = 0;
            field64 = 0;
        } else {
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
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var49 = this.field51[var5];
            byte var50 = 96;
            short var51 = 768;
            byte var52 = -50;
            byte var53 = -10;
            byte var54 = -50;
            int var55 = (int) Math.sqrt((double) (var54 * var54 + var52 * var52 + var53 * var53));
            int var56 = var51 * var55 >> 8;
            for (int var57 = 1; var57 < this.field44 - 1; var57++) {
                for (int var102 = 1; var102 < this.field43 - 1; var102++) {
                    int var103 = this.field45[var5][var102 + 1][var57] - this.field45[var5][var102 - 1][var57];
                    int var104 = this.field45[var5][var102][var57 + 1] - this.field45[var5][var102][var57 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var54 * var108 + var52 * var106 + var53 * var107) / var56 + var50;
                    int var110 = (var49[var102][var57] >> 1) + (var49[var102][var57 + 1] >> 3) + (var49[var102][var57 - 1] >> 2) + (var49[var102 - 1][var57] >> 2) + (var49[var102 + 1][var57] >> 3);
                    this.field52[var102][var57] = var109 - var110;
                }
            }
            for (int var58 = 0; var58 < this.field44; var58++) {
                this.field53[var58] = 0;
                this.field54[var58] = 0;
                this.field55[var58] = 0;
                this.field56[var58] = 0;
                this.field57[var58] = 0;
            }
            for (int var59 = -5; var59 < this.field43 + 5; var59++) {
                for (int var62 = 0; var62 < this.field44; var62++) {
                    int var96 = var59 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < this.field43) {
                        int var97 = this.field47[var5][var96][var62] & 0xFF;
                        if (var97 > 0) {
                            FloType var98 = FloType.field1047[var97 - 1];
                            this.field53[var62] += var98.field1056;
                            this.field54[var62] += var98.field1054;
                            this.field55[var62] += var98.field1055;
                            this.field56[var62] += var98.field1057;
                            var10002 = this.field57[var62]++;
                        }
                    }
                    int var99 = var59 - 5;
                    if (var99 >= 0 && var99 < this.field43) {
                        int var100 = this.field47[var5][var99][var62] & 0xFF;
                        if (var100 > 0) {
                            FloType var101 = FloType.field1047[var100 - 1];
                            this.field53[var62] -= var101.field1056;
                            this.field54[var62] -= var101.field1054;
                            this.field55[var62] -= var101.field1055;
                            this.field56[var62] -= var101.field1057;
                            var10002 = this.field57[var62]--;
                        }
                    }
                }
                if (var59 >= 1 && var59 < this.field43 - 1) {
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    for (int var68 = -5; var68 < this.field44 + 5; var68++) {
                        int var69 = var68 + 5;
                        if (var69 >= 0 && var69 < this.field44) {
                            var63 += this.field53[var69];
                            var64 += this.field54[var69];
                            var65 += this.field55[var69];
                            var66 += this.field56[var69];
                            var67 += this.field57[var69];
                        }
                        int var70 = var68 - 5;
                        if (var70 >= 0 && var70 < this.field44) {
                            var63 -= this.field53[var70];
                            var64 -= this.field54[var70];
                            var65 -= this.field55[var70];
                            var66 -= this.field56[var70];
                            var67 -= this.field57[var70];
                        }
                        if (var68 >= 1 && var68 < this.field44 - 1 && (!field40 || (this.field46[var5][var59][var68] & 0x10) == 0 && this.method21(22171, var68, var59, var5) == field41)) {
                            int var71 = this.field47[var5][var59][var68] & 0xFF;
                            int var72 = this.field48[var5][var59][var68] & 0xFF;
                            if (var71 > 0 || var72 > 0) {
                                int var73 = this.field45[var5][var59][var68];
                                int var74 = this.field45[var5][var59 + 1][var68];
                                int var75 = this.field45[var5][var59 + 1][var68 + 1];
                                int var76 = this.field45[var5][var59][var68 + 1];
                                int var77 = this.field52[var59][var68];
                                int var78 = this.field52[var59 + 1][var68];
                                int var79 = this.field52[var59 + 1][var68 + 1];
                                int var80 = this.field52[var59][var68 + 1];
                                int var81 = -1;
                                int var82 = -1;
                                if (var71 > 0) {
                                    int var83 = var63 * 256 / var66;
                                    int var84 = var64 / var67;
                                    int var85 = var65 / var67;
                                    var81 = this.method29(var83, var84, var85);
                                    int var86 = field63 + var83 & 0xFF;
                                    int var87 = field64 + var85;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (var87 > 255) {
                                        var87 = 255;
                                    }
                                    var82 = this.method29(var86, var84, var87);
                                }
                                if (var5 > 0) {
                                    boolean var88 = true;
                                    if (var71 == 0 && this.field49[var5][var59][var68] != 0) {
                                        var88 = false;
                                    }
                                    if (var72 > 0 && !FloType.field1047[var72 - 1].field1051) {
                                        var88 = false;
                                    }
                                    if (var88 && var73 == var74 && var73 == var75 && var73 == var76) {
                                        this.field58[var5][var59][var68] |= 0x924;
                                    }
                                }
                                int var89 = 0;
                                if (var81 != -1) {
                                    var89 = Pix3D.field650[method27(var82, 96)];
                                }
                                if (var72 == 0) {
                                    arg0.method67(var5, var59, var68, 0, 0, -1, var73, var74, var75, var76, method27(var81, var77), method27(var81, var78), method27(var81, var79), method27(var81, var80), 0, 0, 0, 0, var89, 0);
                                } else {
                                    int var90 = this.field49[var5][var59][var68] + 1;
                                    byte var91 = this.field50[var5][var59][var68];
                                    FloType var92 = FloType.field1047[var72 - 1];
                                    int var93 = var92.field1049;
                                    int var94;
                                    int var95;
                                    if (var93 >= 0) {
                                        var94 = Pix3D.method175(41904, var93);
                                        var95 = -1;
                                    } else if (var92.field1048 == 16711935) {
                                        var94 = 0;
                                        var95 = -2;
                                        var93 = -1;
                                    } else {
                                        var95 = this.method29(var92.field1053, var92.field1054, var92.field1055);
                                        var94 = Pix3D.field650[this.method28(var92.field1058, 96)];
                                    }
                                    arg0.method67(var5, var59, var68, var90, var91, var93, var73, var74, var75, var76, method27(var81, var77), method27(var81, var78), method27(var81, var79), method27(var81, var80), this.method28(var95, var77), this.method28(var95, var78), this.method28(var95, var79), this.method28(var95, var80), var89, var94);
                                }
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; var60 < this.field44 - 1; var60++) {
                for (int var61 = 1; var61 < this.field43 - 1; var61++) {
                    arg0.method66(var5, var61, var60, this.method21(22171, var60, var61, var5));
                }
            }
        }
        if (!field42) {
            arg0.method93(64, -50, 768, -10, (byte) -39, -50);
        }
        for (int var6 = 0; var6 < this.field43; var6++) {
            for (int var48 = 0; var48 < this.field44; var48++) {
                if ((this.field46[1][var6][var48] & 0x2) == 2) {
                    arg0.method64((byte) 4, var48, var6);
                }
            }
        }
        if (arg2) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (field42) {
            return;
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
                for (int var13 = 0; var13 <= this.field44; var13++) {
                    for (int var14 = 0; var14 <= this.field43; var14++) {
                        if ((this.field58[var12][var14][var13] & var8) != 0) {
                            int var15 = var13;
                            int var16 = var13;
                            int var17 = var12;
                            int var18 = var12;
                            while (var15 > 0 && (this.field58[var12][var14][var15 - 1] & var8) != 0) {
                                var15--;
                            }
                            while (var16 < this.field44 && (this.field58[var12][var14][var16 + 1] & var8) != 0) {
                                var16++;
                            }
                            label338: while (var17 > 0) {
                                for (int var19 = var15; var19 <= var16; var19++) {
                                    if ((this.field58[var17 - 1][var14][var19] & var8) == 0) {
                                        break label338;
                                    }
                                }
                                var17--;
                            }
                            label327: while (var18 < var11) {
                                for (int var20 = var15; var20 <= var16; var20++) {
                                    if ((this.field58[var18 + 1][var14][var20] & var8) == 0) {
                                        break label327;
                                    }
                                }
                                var18++;
                            }
                            int var21 = (var18 + 1 - var17) * (var16 - var15 + 1);
                            if (var21 >= 8) {
                                short var22 = 240;
                                int var23 = this.field45[var18][var14][var15] - var22;
                                int var24 = this.field45[var17][var14][var15];
                                World3D.method65(var14 * 128, var24, var15 * 128, var16 * 128 + 128, var11, var14 * 128, this.field36, 1, var23);
                                for (int var25 = var17; var25 <= var18; var25++) {
                                    for (int var26 = var15; var26 <= var16; var26++) {
                                        this.field58[var25][var14][var26] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field58[var12][var14][var13] & var9) != 0) {
                            int var27 = var14;
                            int var28 = var14;
                            int var29 = var12;
                            int var30 = var12;
                            while (var27 > 0 && (this.field58[var12][var27 - 1][var13] & var9) != 0) {
                                var27--;
                            }
                            while (var28 < this.field43 && (this.field58[var12][var28 + 1][var13] & var9) != 0) {
                                var28++;
                            }
                            label391: while (var29 > 0) {
                                for (int var31 = var27; var31 <= var28; var31++) {
                                    if ((this.field58[var29 - 1][var31][var13] & var9) == 0) {
                                        break label391;
                                    }
                                }
                                var29--;
                            }
                            label380: while (var30 < var11) {
                                for (int var32 = var27; var32 <= var28; var32++) {
                                    if ((this.field58[var30 + 1][var32][var13] & var9) == 0) {
                                        break label380;
                                    }
                                }
                                var30++;
                            }
                            int var33 = (var30 + 1 - var29) * (var28 - var27 + 1);
                            if (var33 >= 8) {
                                short var34 = 240;
                                int var35 = this.field45[var30][var27][var13] - var34;
                                int var36 = this.field45[var29][var27][var13];
                                World3D.method65(var28 * 128 + 128, var36, var13 * 128, var13 * 128, var11, var27 * 128, this.field36, 2, var35);
                                for (int var37 = var29; var37 <= var30; var37++) {
                                    for (int var38 = var27; var38 <= var28; var38++) {
                                        this.field58[var37][var38][var13] &= ~var9;
                                    }
                                }
                            }
                        }
                        if ((this.field58[var12][var14][var13] & var10) != 0) {
                            int var39 = var14;
                            int var40 = var14;
                            int var41 = var13;
                            int var42 = var13;
                            while (var41 > 0 && (this.field58[var12][var14][var41 - 1] & var10) != 0) {
                                var41--;
                            }
                            while (var42 < this.field44 && (this.field58[var12][var14][var42 + 1] & var10) != 0) {
                                var42++;
                            }
                            label444: while (var39 > 0) {
                                for (int var43 = var41; var43 <= var42; var43++) {
                                    if ((this.field58[var12][var39 - 1][var43] & var10) == 0) {
                                        break label444;
                                    }
                                }
                                var39--;
                            }
                            label433: while (var40 < this.field43) {
                                for (int var44 = var41; var44 <= var42; var44++) {
                                    if ((this.field58[var12][var40 + 1][var44] & var10) == 0) {
                                        break label433;
                                    }
                                }
                                var40++;
                            }
                            if ((var40 + 1 - var39) * (var42 - var41 + 1) >= 4) {
                                int var45 = this.field45[var12][var39][var41];
                                World3D.method65(var40 * 128 + 128, var45, var41 * 128, var42 * 128 + 128, var11, var39 * 128, this.field36, 4, var45);
                                for (int var46 = var39; var46 <= var40; var46++) {
                                    for (int var47 = var41; var47 <= var42; var47++) {
                                        this.field58[var12][var46][var47] &= ~var10;
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
        if (arg0 != 22171) {
            return field39;
        } else if ((this.field46[arg3][arg2][arg1] & 0x8) == 0) {
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
        int var4 = 65536 - Pix3D.field639[arg2 * 1024 / arg3] >> 1;
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
        LocType var3 = LocType.method324(arg0);
        if (arg2 != -81) {
            throw new NullPointerException();
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method327(arg1, (byte) 23);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIII[[[IILic;ILs;I)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3, int arg4, int[][][] arg5, int arg6, CollisionMap arg7, int arg8, World3D arg9, int arg10) {
        int var11 = arg5[arg6][arg10][arg3];
        int var12 = arg5[arg6][arg10 + 1][arg3];
        int var13 = arg5[arg6][arg10 + 1][arg3 + 1];
        int var14 = arg5[arg6][arg10][arg3 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method324(arg1);
        int var17 = (arg1 << 14) + (arg3 << 7) + arg10 + 1073741824;
        if (!var16.field931) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg8 << 6) + arg2);
        if (arg0 <= 0) {
            field38 = !field38;
        }
        if (arg2 == 22) {
            Entity var19;
            if (var16.field935 == -1) {
                var19 = var16.method330(22, arg8, var11, var12, var13, var14, -1);
            } else {
                var19 = new LocEntity(22, arg1, var13, var16.field935, arg8, 0, true, var12, var14, var11);
            }
            arg9.method68(var19, arg10, true, var17, var15, arg3, arg4, var18);
            if (var16.field929 && var16.field931) {
                arg7.method353(arg10, false, arg3);
            }
        } else if (arg2 == 10 || arg2 == 11) {
            Entity var35;
            if (var16.field935 == -1) {
                var35 = var16.method330(10, arg8, var11, var12, var13, var14, -1);
            } else {
                var35 = new LocEntity(10, arg1, var13, var16.field935, arg8, 0, true, var12, var14, var11);
            }
            if (var35 != null) {
                int var36 = 0;
                if (arg2 == 11) {
                    var36 += 256;
                }
                int var37;
                int var38;
                if (arg8 == 1 || arg8 == 3) {
                    var37 = var16.field928;
                    var38 = var16.field927;
                } else {
                    var37 = var16.field927;
                    var38 = var16.field928;
                }
                arg9.method72(var15, arg10, var36, var17, var35, arg3, var38, -26824, arg4, var37, var18);
            }
            if (var16.field929) {
                arg7.method352(arg10, var16.field927, var16.field930, arg8, var16.field928, -584, arg3);
            }
        } else if (arg2 >= 12) {
            Entity var20;
            if (var16.field935 == -1) {
                var20 = var16.method330(arg2, arg8, var11, var12, var13, var14, -1);
            } else {
                var20 = new LocEntity(arg2, arg1, var13, var16.field935, arg8, 0, true, var12, var14, var11);
            }
            arg9.method72(var15, arg10, 0, var17, var20, arg3, 1, -26824, arg4, 1, var18);
            if (var16.field929) {
                arg7.method352(arg10, var16.field927, var16.field930, arg8, var16.field928, -584, arg3);
            }
        } else if (arg2 == 0) {
            Entity var21;
            if (var16.field935 == -1) {
                var21 = var16.method330(0, arg8, var11, var12, var13, var14, -1);
            } else {
                var21 = new LocEntity(0, arg1, var13, var16.field935, arg8, 0, true, var12, var14, var11);
            }
            arg9.method70((byte) 81, arg10, var21, 0, field59[arg8], var18, arg4, null, var15, var17, arg3);
            if (var16.field929) {
                arg7.method351(arg8, arg2, arg3, -8, arg10, var16.field930);
            }
        } else if (arg2 == 1) {
            Entity var22;
            if (var16.field935 == -1) {
                var22 = var16.method330(1, arg8, var11, var12, var13, var14, -1);
            } else {
                var22 = new LocEntity(1, arg1, var13, var16.field935, arg8, 0, true, var12, var14, var11);
            }
            arg9.method70((byte) 81, arg10, var22, 0, field60[arg8], var18, arg4, null, var15, var17, arg3);
            if (var16.field929) {
                arg7.method351(arg8, arg2, arg3, -8, arg10, var16.field930);
            }
        } else if (arg2 == 2) {
            int var23 = arg8 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var16.field935 == -1) {
                var24 = var16.method330(2, arg8 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method330(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new LocEntity(2, arg1, var13, var16.field935, arg8 + 4, 0, true, var12, var14, var11);
                var25 = new LocEntity(2, arg1, var13, var16.field935, var23, 0, true, var12, var14, var11);
            }
            arg9.method70((byte) 81, arg10, var24, field59[var23], field59[arg8], var18, arg4, var25, var15, var17, arg3);
            if (var16.field929) {
                arg7.method351(arg8, arg2, arg3, -8, arg10, var16.field930);
            }
        } else if (arg2 == 3) {
            Entity var26;
            if (var16.field935 == -1) {
                var26 = var16.method330(3, arg8, var11, var12, var13, var14, -1);
            } else {
                var26 = new LocEntity(3, arg1, var13, var16.field935, arg8, 0, true, var12, var14, var11);
            }
            arg9.method70((byte) 81, arg10, var26, 0, field60[arg8], var18, arg4, null, var15, var17, arg3);
            if (var16.field929) {
                arg7.method351(arg8, arg2, arg3, -8, arg10, var16.field930);
            }
        } else if (arg2 == 9) {
            Entity var27;
            if (var16.field935 == -1) {
                var27 = var16.method330(arg2, arg8, var11, var12, var13, var14, -1);
            } else {
                var27 = new LocEntity(arg2, arg1, var13, var16.field935, arg8, 0, true, var12, var14, var11);
            }
            arg9.method72(var15, arg10, 0, var17, var27, arg3, 1, -26824, arg4, 1, var18);
            if (var16.field929) {
                arg7.method352(arg10, var16.field927, var16.field930, arg8, var16.field928, -584, arg3);
            }
        } else if (arg2 == 4) {
            Entity var28;
            if (var16.field935 == -1) {
                var28 = var16.method330(4, 0, var11, var12, var13, var14, -1);
            } else {
                var28 = new LocEntity(4, arg1, var13, var16.field935, 0, 0, true, var12, var14, var11);
            }
            arg9.method71((byte) 4, arg8 * 512, field59[arg8], 0, arg3, arg10, var15, var18, var17, arg4, 0, var28);
        } else if (arg2 == 5) {
            int var29 = 16;
            int var30 = arg9.method88(arg4, arg10, arg3);
            if (var30 > 0) {
                var29 = LocType.method324(var30 >> 14 & 0x7FFF).field936;
            }
            Entity var31;
            if (var16.field935 == -1) {
                var31 = var16.method330(4, 0, var11, var12, var13, var14, -1);
            } else {
                var31 = new LocEntity(4, arg1, var13, var16.field935, 0, 0, true, var12, var14, var11);
            }
            arg9.method71((byte) 4, arg8 * 512, field59[arg8], field61[arg8] * var29, arg3, arg10, var15, var18, var17, arg4, field62[arg8] * var29, var31);
        } else if (arg2 == 6) {
            Entity var32;
            if (var16.field935 == -1) {
                var32 = var16.method330(4, 0, var11, var12, var13, var14, -1);
            } else {
                var32 = new LocEntity(4, arg1, var13, var16.field935, 0, 0, true, var12, var14, var11);
            }
            arg9.method71((byte) 4, arg8, 256, 0, arg3, arg10, var15, var18, var17, arg4, 0, var32);
        } else if (arg2 == 7) {
            Entity var33;
            if (var16.field935 == -1) {
                var33 = var16.method330(4, 0, var11, var12, var13, var14, -1);
            } else {
                var33 = new LocEntity(4, arg1, var13, var16.field935, 0, 0, true, var12, var14, var11);
            }
            arg9.method71((byte) 4, arg8, 512, 0, arg3, arg10, var15, var18, var17, arg4, 0, var33);
        } else if (arg2 == 8) {
            Entity var34;
            if (var16.field935 == -1) {
                var34 = var16.method330(4, 0, var11, var12, var13, var14, -1);
            } else {
                var34 = new LocEntity(4, arg1, var13, var16.field935, 0, 0, true, var12, var14, var11);
            }
            arg9.method71((byte) 4, arg8, 768, 0, arg3, arg10, var15, var18, var17, arg4, 0, var34);
        }
    }
}
