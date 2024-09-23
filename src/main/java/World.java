import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "f", descriptor = "I")
    private int field42 = -128;

    @OriginalMember(owner = "c", name = "j", descriptor = "I")
    private int field46;

    @OriginalMember(owner = "c", name = "k", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[I")
    private int[][][] field48;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field49;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field50;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field51;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[[B")
    private byte[][][] field52;

    @OriginalMember(owner = "c", name = "q", descriptor = "[[[B")
    private byte[][][] field53;

    @OriginalMember(owner = "c", name = "y", descriptor = "[[[I")
    private int[][][] field61;

    @OriginalMember(owner = "c", name = "r", descriptor = "[[[B")
    private byte[][][] field54;

    @OriginalMember(owner = "c", name = "s", descriptor = "[[I")
    private int[][] field55;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field57;

    @OriginalMember(owner = "c", name = "v", descriptor = "[I")
    private int[] field58;

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private int[] field59;

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private int[] field60;

    @OriginalMember(owner = "c", name = "c", descriptor = "I")
    private static int field39 = 32;

    @OriginalMember(owner = "c", name = "e", descriptor = "I")
    private static int field41 = 9;

    @OriginalMember(owner = "c", name = "h", descriptor = "Z")
    public static boolean field44 = true;

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field62 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "A", descriptor = "[I")
    private static final int[] field63 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "B", descriptor = "[I")
    private static final int[] field64 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "C", descriptor = "[I")
    private static final int[] field65 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "D", descriptor = "I")
    private static int field66 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "c", name = "E", descriptor = "I")
    private static int field67 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "c", name = "a", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "c", name = "d", descriptor = "I")
    private static int field40;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    private static int field43;

    @OriginalMember(owner = "c", name = "i", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "c", name = "b", descriptor = "Z")
    private static boolean field38;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "([[[III[[[BI)V")
    public World(int[][][] arg0, int arg1, int arg2, byte[][][] arg3, int arg4) {
        this.field46 = arg4;
        this.field47 = arg1;
        this.field48 = arg0;
        this.field49 = arg3;
        this.field50 = new byte[4][this.field46][this.field47];
        this.field51 = new byte[4][this.field46][this.field47];
        this.field52 = new byte[4][this.field46][this.field47];
        this.field53 = new byte[4][this.field46][this.field47];
        this.field61 = new int[4][this.field46 + 1][this.field47 + 1];
        this.field54 = new byte[4][this.field46 + 1][this.field47 + 1];
        this.field55 = new int[this.field46 + 1][this.field47 + 1];
        this.field56 = new int[this.field47];
        if (arg2 < 7 || arg2 > 7) {
            field38 = !field38;
        }
        this.field57 = new int[this.field47];
        this.field58 = new int[this.field47];
        this.field59 = new int[this.field47];
        this.field60 = new int[this.field47];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIII)V")
    public final void method14(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg2; var6 <= arg1 + arg2; var6++) {
            for (int var7 = arg3; var7 <= arg3 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field46 && var6 >= 0 && var6 < this.field47) {
                    this.field54[0][var7][var6] = 127;
                    if (arg3 == var7 && var7 > 0) {
                        this.field48[0][var7][var6] = this.field48[0][var7 - 1][var6];
                    }
                    if (arg3 + arg4 == var7 && var7 < this.field46 - 1) {
                        this.field48[0][var7][var6] = this.field48[0][var7 + 1][var6];
                    }
                    if (arg2 == var6 && var6 > 0) {
                        this.field48[0][var7][var6] = this.field48[0][var7][var6 - 1];
                    }
                    if (arg1 + arg2 == var6 && var6 < this.field47 - 1) {
                        this.field48[0][var7][var6] = this.field48[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg0 != 0) {
            field41 = 1;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIII[B)V")
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg4 != 34545) {
            return;
        }
        Packet var7 = new Packet(arg5, true);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg3 + var9;
                    int var12 = arg0 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field49[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method228();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field48[0][var11][var12] = -method22(var11 + arg1 + 932731, var12 + 556238 + arg2) * 8;
                                } else {
                                    this.field48[var8][var11][var12] = this.field48[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method228();
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
                                this.field51[var8][var11][var12] = var7.method229();
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
                            int var15 = var7.method228();
                            if (var15 == 0) {
                                break;
                            }
                            if (var15 == 1) {
                                var7.method228();
                                break;
                            }
                            if (var15 <= 49) {
                                var7.method228();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Z[BII)Z")
    public static final boolean method16(boolean arg0, byte[] arg1, int arg2, int arg3) {
        boolean var4 = true;
        Packet var5 = new Packet(arg1, true);
        if (arg0) {
            throw new NullPointerException();
        }
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method242();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method242();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method228() >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.method329(var6);
                        if (var14 != 22 || !field44 || var17.field968 || var17.field988) {
                            var4 &= var17.method333(true);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method242();
                if (var10 == 0) {
                    break;
                }
                var5.method228();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lvb;ILmb;)V")
    public static final void method17(OnDemand arg0, int arg1, Packet arg2) {
        int var3 = -1;
        if (arg1 >= 0) {
            field38 = !field38;
        }
        while (true) {
            int var4 = arg2.method242();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            LocType var5 = LocType.method329(var3);
            var5.method334(false, arg0);
            while (true) {
                int var6 = arg2.method242();
                if (var6 == 0) {
                    break;
                }
                arg2.method228();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II[BLr;[Lkc;I)V")
    public final void method18(int arg0, int arg1, byte[] arg2, World3D arg3, CollisionMap[] arg4, int arg5) {
        Packet var7 = new Packet(arg2, true);
        while (arg5 >= 0) {
            this.field37 = 359;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method242();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method242();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method228();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg1 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field49[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    CollisionMap var21 = null;
                    if (var20 >= 0) {
                        var21 = arg4[var20];
                    }
                    this.method19(var21, var8, var19, arg3, (byte) 8, var16, var17, var18, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lkc;IILr;BIIII)V")
    private final void method19(CollisionMap arg0, int arg1, int arg2, World3D arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        if (field44) {
            if ((this.field49[arg8][arg7][arg2] & 0x10) != 0) {
                return;
            }
            if (this.method21(arg2, arg8, arg7, -40434) != field45) {
                return;
            }
        }
        int var10 = this.field48[arg8][arg7][arg2];
        int var11 = this.field48[arg8][arg7 + 1][arg2];
        int var12 = this.field48[arg8][arg7 + 1][arg2 + 1];
        int var13 = this.field48[arg8][arg7][arg2 + 1];
        if (arg4 != 8) {
            field38 = !field38;
        }
        int var14 = var10 + var11 + var12 + var13 >> 2;
        LocType var15 = LocType.method329(arg1);
        int var16 = (arg1 << 14) + (arg2 << 7) + arg7 + 1073741824;
        if (!var15.field968) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg6 << 6) + arg5);
        if (arg5 == 22) {
            if (!field44 || var15.field968 || var15.field988) {
                Entity var18;
                if (var15.field972 == -1) {
                    var18 = var15.method335(22, arg6, var10, var11, var12, var13, -1);
                } else {
                    var18 = new LocEntity(var15.field972, arg6, (byte) 69, true, var11, var10, arg1, var13, 22, var12);
                }
                arg3.method56(arg7, arg2, 514, var14, var16, var18, arg8, var17);
                if (var15.field966 && var15.field968 && arg0 != null) {
                    arg0.method359(arg2, -44203, arg7);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            Entity var38;
            if (var15.field972 == -1) {
                var38 = var15.method335(10, arg6, var10, var11, var12, var13, -1);
            } else {
                var38 = new LocEntity(var15.field972, arg6, (byte) 69, true, var11, var10, arg1, var13, 10, var12);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg5 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg6 == 1 || arg6 == 3) {
                    var40 = var15.field965;
                    var41 = var15.field964;
                } else {
                    var40 = var15.field964;
                    var41 = var15.field965;
                }
                if (arg3.method60(var41, var40, arg7, var17, arg2, var38, var39, arg8, var16, field39, var14) && var15.field980) {
                    Model var42;
                    if (var38 instanceof Model) {
                        var42 = (Model) var38;
                    } else {
                        var42 = var15.method335(10, arg6, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field564 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field54[arg8][arg7 + var43][arg2 + var44]) {
                                    this.field54[arg8][arg7 + var43][arg2 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field966 && arg0 != null) {
                arg0.method358(var15.field965, arg6, var15.field964, -29036, var15.field967, arg2, arg7);
            }
        } else if (arg5 >= 12) {
            Entity var19;
            if (var15.field972 == -1) {
                var19 = var15.method335(arg5, arg6, var10, var11, var12, var13, -1);
            } else {
                var19 = new LocEntity(var15.field972, arg6, (byte) 69, true, var11, var10, arg1, var13, arg5, var12);
            }
            arg3.method60(1, 1, arg7, var17, arg2, var19, 0, arg8, var16, field39, var14);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg8 > 0) {
                this.field61[arg8][arg7][arg2] |= 0x924;
            }
            if (var15.field966 && arg0 != null) {
                arg0.method358(var15.field965, arg6, var15.field964, -29036, var15.field967, arg2, arg7);
            }
        } else if (arg5 == 0) {
            Entity var20;
            if (var15.field972 == -1) {
                var20 = var15.method335(0, arg6, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(var15.field972, arg6, (byte) 69, true, var11, var10, arg1, var13, 0, var12);
            }
            arg3.method58(arg2, var17, var16, null, field62[arg6], var20, 350, var14, arg7, 0, arg8);
            if (arg6 == 0) {
                if (var15.field980) {
                    this.field54[arg8][arg7][arg2] = 50;
                    this.field54[arg8][arg7][arg2 + 1] = 50;
                }
                if (var15.field971) {
                    this.field61[arg8][arg7][arg2] |= 0x249;
                }
            } else if (arg6 == 1) {
                if (var15.field980) {
                    this.field54[arg8][arg7][arg2 + 1] = 50;
                    this.field54[arg8][arg7 + 1][arg2 + 1] = 50;
                }
                if (var15.field971) {
                    this.field61[arg8][arg7][arg2 + 1] |= 0x492;
                }
            } else if (arg6 == 2) {
                if (var15.field980) {
                    this.field54[arg8][arg7 + 1][arg2] = 50;
                    this.field54[arg8][arg7 + 1][arg2 + 1] = 50;
                }
                if (var15.field971) {
                    this.field61[arg8][arg7 + 1][arg2] |= 0x249;
                }
            } else if (arg6 == 3) {
                if (var15.field980) {
                    this.field54[arg8][arg7][arg2] = 50;
                    this.field54[arg8][arg7 + 1][arg2] = 50;
                }
                if (var15.field971) {
                    this.field61[arg8][arg7][arg2] |= 0x492;
                }
            }
            if (var15.field966 && arg0 != null) {
                arg0.method357(var15.field967, arg2, arg6, field40, arg5, arg7);
            }
            if (var15.field973 != 16) {
                arg3.method66(arg7, arg2, arg8, 982, var15.field973);
            }
        } else if (arg5 == 1) {
            Entity var21;
            if (var15.field972 == -1) {
                var21 = var15.method335(1, arg6, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(var15.field972, arg6, (byte) 69, true, var11, var10, arg1, var13, 1, var12);
            }
            arg3.method58(arg2, var17, var16, null, field63[arg6], var21, 350, var14, arg7, 0, arg8);
            if (var15.field980) {
                if (arg6 == 0) {
                    this.field54[arg8][arg7][arg2 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field54[arg8][arg7 + 1][arg2 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field54[arg8][arg7 + 1][arg2] = 50;
                } else if (arg6 == 3) {
                    this.field54[arg8][arg7][arg2] = 50;
                }
            }
            if (var15.field966 && arg0 != null) {
                arg0.method357(var15.field967, arg2, arg6, field40, arg5, arg7);
            }
        } else if (arg5 == 2) {
            int var22 = arg6 + 1 & 0x3;
            Entity var23;
            Entity var24;
            if (var15.field972 == -1) {
                var23 = var15.method335(2, arg6 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method335(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new LocEntity(var15.field972, arg6 + 4, (byte) 69, true, var11, var10, arg1, var13, 2, var12);
                var24 = new LocEntity(var15.field972, var22, (byte) 69, true, var11, var10, arg1, var13, 2, var12);
            }
            arg3.method58(arg2, var17, var16, var24, field62[arg6], var23, 350, var14, arg7, field62[var22], arg8);
            if (var15.field971) {
                if (arg6 == 0) {
                    this.field61[arg8][arg7][arg2] |= 0x249;
                    this.field61[arg8][arg7][arg2 + 1] |= 0x492;
                } else if (arg6 == 1) {
                    this.field61[arg8][arg7][arg2 + 1] |= 0x492;
                    this.field61[arg8][arg7 + 1][arg2] |= 0x249;
                } else if (arg6 == 2) {
                    this.field61[arg8][arg7 + 1][arg2] |= 0x249;
                    this.field61[arg8][arg7][arg2] |= 0x492;
                } else if (arg6 == 3) {
                    this.field61[arg8][arg7][arg2] |= 0x492;
                    this.field61[arg8][arg7][arg2] |= 0x249;
                }
            }
            if (var15.field966 && arg0 != null) {
                arg0.method357(var15.field967, arg2, arg6, field40, arg5, arg7);
            }
            if (var15.field973 != 16) {
                arg3.method66(arg7, arg2, arg8, 982, var15.field973);
            }
        } else if (arg5 == 3) {
            Entity var25;
            if (var15.field972 == -1) {
                var25 = var15.method335(3, arg6, var10, var11, var12, var13, -1);
            } else {
                var25 = new LocEntity(var15.field972, arg6, (byte) 69, true, var11, var10, arg1, var13, 3, var12);
            }
            arg3.method58(arg2, var17, var16, null, field63[arg6], var25, 350, var14, arg7, 0, arg8);
            if (var15.field980) {
                if (arg6 == 0) {
                    this.field54[arg8][arg7][arg2 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field54[arg8][arg7 + 1][arg2 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field54[arg8][arg7 + 1][arg2] = 50;
                } else if (arg6 == 3) {
                    this.field54[arg8][arg7][arg2] = 50;
                }
            }
            if (var15.field966 && arg0 != null) {
                arg0.method357(var15.field967, arg2, arg6, field40, arg5, arg7);
            }
        } else if (arg5 == 9) {
            Entity var26;
            if (var15.field972 == -1) {
                var26 = var15.method335(arg5, arg6, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(var15.field972, arg6, (byte) 69, true, var11, var10, arg1, var13, arg5, var12);
            }
            arg3.method60(1, 1, arg7, var17, arg2, var26, 0, arg8, var16, field39, var14);
            if (var15.field966 && arg0 != null) {
                arg0.method358(var15.field965, arg6, var15.field964, -29036, var15.field967, arg2, arg7);
            }
        } else {
            if (var15.field969) {
                if (arg6 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg6 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg6 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg5 == 4) {
                Entity var31;
                if (var15.field972 == -1) {
                    var31 = var15.method335(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new LocEntity(var15.field972, 0, (byte) 69, true, var11, var10, arg1, var13, 4, var12);
                }
                arg3.method59(0, var31, arg8, arg7, var17, var16, field62[arg6], (byte) -93, arg6 * 512, var14, 0, arg2);
            } else if (arg5 == 5) {
                int var32 = 16;
                int var33 = arg3.method76(arg8, arg7, arg2);
                if (var33 > 0) {
                    var32 = LocType.method329(var33 >> 14 & 0x7FFF).field973;
                }
                Entity var34;
                if (var15.field972 == -1) {
                    var34 = var15.method335(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new LocEntity(var15.field972, 0, (byte) 69, true, var11, var10, arg1, var13, 4, var12);
                }
                arg3.method59(field65[arg6] * var32, var34, arg8, arg7, var17, var16, field62[arg6], (byte) -93, arg6 * 512, var14, field64[arg6] * var32, arg2);
            } else if (arg5 == 6) {
                Entity var35;
                if (var15.field972 == -1) {
                    var35 = var15.method335(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new LocEntity(var15.field972, 0, (byte) 69, true, var11, var10, arg1, var13, 4, var12);
                }
                arg3.method59(0, var35, arg8, arg7, var17, var16, 256, (byte) -93, arg6, var14, 0, arg2);
            } else if (arg5 == 7) {
                Entity var36;
                if (var15.field972 == -1) {
                    var36 = var15.method335(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new LocEntity(var15.field972, 0, (byte) 69, true, var11, var10, arg1, var13, 4, var12);
                }
                arg3.method59(0, var36, arg8, arg7, var17, var16, 512, (byte) -93, arg6, var14, 0, arg2);
            } else if (arg5 == 8) {
                Entity var37;
                if (var15.field972 == -1) {
                    var37 = var15.method335(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new LocEntity(var15.field972, 0, (byte) 69, true, var11, var10, arg1, var13, 4, var12);
                }
                arg3.method59(0, var37, arg8, arg7, var17, var16, 768, (byte) -93, arg6, var14, 0, arg2);
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(ZLr;[Lkc;)V")
    public final void method20(boolean arg0, World3D arg1, CollisionMap[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field49[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field49[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method359(var111, -44203, var110);
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
                            FloType var97 = FloType.field1098[var96 - 1];
                            this.field56[var61] += var97.field1107;
                            this.field57[var61] += var97.field1105;
                            this.field58[var61] += var97.field1106;
                            this.field59[var61] += var97.field1108;
                            var10002 = this.field60[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field46) {
                        int var99 = this.field50[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.field1098[var99 - 1];
                            this.field56[var61] -= var100.field1107;
                            this.field57[var61] -= var100.field1105;
                            this.field58[var61] -= var100.field1106;
                            this.field59[var61] -= var100.field1108;
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
                        if (var67 >= 1 && var67 < this.field47 - 1 && (!field44 || (this.field49[var5][var58][var67] & 0x10) == 0 && this.method21(var67, var5, var58, -40434) == field45)) {
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
                                    if (var71 > 0 && !FloType.field1098[var71 - 1].field1102) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field61[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Pix3D.field658[method27(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method55(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field52[var5][var58][var67] + 1;
                                    byte var90 = this.field53[var5][var58][var67];
                                    FloType var91 = FloType.field1098[var71 - 1];
                                    int var92 = var91.field1100;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Pix3D.method169(var92, 0);
                                        var94 = -1;
                                    } else if (var91.field1099 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method29(var91.field1104, var91.field1105, var91.field1106);
                                        var93 = Pix3D.field658[this.method28(var91.field1109, 96)];
                                    }
                                    arg1.method55(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), this.method28(var94, var76), this.method28(var94, var77), this.method28(var94, var78), this.method28(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field47 - 1; var59++) {
                for (int var60 = 1; var60 < this.field46 - 1; var60++) {
                    arg1.method54(var5, var60, var59, this.method21(var59, var5, var60, -40434));
                }
            }
        }
        arg1.method81(-10, -50, 768, -50, 64, 0);
        if (arg0) {
            return;
        }
        for (int var6 = 0; var6 < this.field46; var6++) {
            for (int var47 = 0; var47 < this.field47; var47++) {
                if ((this.field49[1][var6][var47] & 0x2) == 2) {
                    arg1.method52(var6, 0, var47);
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
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field48[var17][var13][var14] - var21;
                                int var23 = this.field48[var16][var13][var14];
                                World3D.method53(var15 * 128 + 128, var22, true, var14 * 128, var13 * 128, 1, var10, var13 * 128, var23);
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
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field48[var29][var26][var12] - var33;
                                int var35 = this.field48[var28][var26][var12];
                                World3D.method53(var12 * 128, var34, true, var12 * 128, var27 * 128 + 128, 2, var10, var26 * 128, var35);
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
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field48[var11][var38][var40];
                                World3D.method53(var41 * 128 + 128, var44, true, var40 * 128, var39 * 128 + 128, 4, var10, var38 * 128, var44);
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
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIII)I")
    public int method21(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -40434) {
            return 1;
        } else if ((this.field49[arg1][arg2][arg0] & 0x8) == 0) {
            return arg1 <= 0 || (this.field49[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
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
        int var4 = 65536 - Pix3D.field647[arg2 * 1024 / arg3] >> 1;
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(ZII)Z")
    public static final boolean method30(boolean arg0, int arg1, int arg2) {
        LocType var3 = LocType.method329(arg1);
        if (!arg0) {
            field41 = -492;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method332(field43, arg2);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIIB[[[ILr;IIILkc;)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3, byte arg4, int[][][] arg5, World3D arg6, int arg7, int arg8, int arg9, CollisionMap arg10) {
        int var11 = arg5[arg8][arg3][arg7];
        int var12 = arg5[arg8][arg3 + 1][arg7];
        if (arg4 != -91) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        int var14 = arg5[arg8][arg3 + 1][arg7 + 1];
        int var15 = arg5[arg8][arg3][arg7 + 1];
        int var16 = var11 + var12 + var14 + var15 >> 2;
        LocType var17 = LocType.method329(arg9);
        int var18 = (arg9 << 14) + (arg7 << 7) + arg3 + 1073741824;
        if (!var17.field968) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg0 << 6) + arg1);
        if (arg1 == 22) {
            Entity var20;
            if (var17.field972 == -1) {
                var20 = var17.method335(22, arg0, var11, var12, var14, var15, -1);
            } else {
                var20 = new LocEntity(var17.field972, arg0, (byte) 69, true, var12, var11, arg9, var15, 22, var14);
            }
            arg6.method56(arg3, arg7, 514, var16, var18, var20, arg2, var19);
            if (var17.field966 && var17.field968) {
                arg10.method359(arg7, -44203, arg3);
            }
        } else if (arg1 == 10 || arg1 == 11) {
            Entity var40;
            if (var17.field972 == -1) {
                var40 = var17.method335(10, arg0, var11, var12, var14, var15, -1);
            } else {
                var40 = new LocEntity(var17.field972, arg0, (byte) 69, true, var12, var11, arg9, var15, 10, var14);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg1 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg0 == 1 || arg0 == 3) {
                    var42 = var17.field965;
                    var43 = var17.field964;
                } else {
                    var42 = var17.field964;
                    var43 = var17.field965;
                }
                arg6.method60(var43, var42, arg3, var19, arg7, var40, var41, arg2, var18, field39, var16);
            }
            if (var17.field966) {
                arg10.method358(var17.field965, arg0, var17.field964, -29036, var17.field967, arg7, arg3);
            }
        } else if (arg1 >= 12) {
            Entity var21;
            if (var17.field972 == -1) {
                var21 = var17.method335(arg1, arg0, var11, var12, var14, var15, -1);
            } else {
                var21 = new LocEntity(var17.field972, arg0, (byte) 69, true, var12, var11, arg9, var15, arg1, var14);
            }
            arg6.method60(1, 1, arg3, var19, arg7, var21, 0, arg2, var18, field39, var16);
            if (var17.field966) {
                arg10.method358(var17.field965, arg0, var17.field964, -29036, var17.field967, arg7, arg3);
            }
        } else if (arg1 == 0) {
            Entity var22;
            if (var17.field972 == -1) {
                var22 = var17.method335(0, arg0, var11, var12, var14, var15, -1);
            } else {
                var22 = new LocEntity(var17.field972, arg0, (byte) 69, true, var12, var11, arg9, var15, 0, var14);
            }
            arg6.method58(arg7, var19, var18, null, field62[arg0], var22, 350, var16, arg3, 0, arg2);
            if (var17.field966) {
                arg10.method357(var17.field967, arg7, arg0, field40, arg1, arg3);
            }
        } else if (arg1 == 1) {
            Entity var23;
            if (var17.field972 == -1) {
                var23 = var17.method335(1, arg0, var11, var12, var14, var15, -1);
            } else {
                var23 = new LocEntity(var17.field972, arg0, (byte) 69, true, var12, var11, arg9, var15, 1, var14);
            }
            arg6.method58(arg7, var19, var18, null, field63[arg0], var23, 350, var16, arg3, 0, arg2);
            if (var17.field966) {
                arg10.method357(var17.field967, arg7, arg0, field40, arg1, arg3);
            }
        } else if (arg1 == 2) {
            int var24 = arg0 + 1 & 0x3;
            Entity var25;
            Entity var26;
            if (var17.field972 == -1) {
                var25 = var17.method335(2, arg0 + 4, var11, var12, var14, var15, -1);
                var26 = var17.method335(2, var24, var11, var12, var14, var15, -1);
            } else {
                var25 = new LocEntity(var17.field972, arg0 + 4, (byte) 69, true, var12, var11, arg9, var15, 2, var14);
                var26 = new LocEntity(var17.field972, var24, (byte) 69, true, var12, var11, arg9, var15, 2, var14);
            }
            arg6.method58(arg7, var19, var18, var26, field62[arg0], var25, 350, var16, arg3, field62[var24], arg2);
            if (var17.field966) {
                arg10.method357(var17.field967, arg7, arg0, field40, arg1, arg3);
            }
        } else if (arg1 == 3) {
            Entity var27;
            if (var17.field972 == -1) {
                var27 = var17.method335(3, arg0, var11, var12, var14, var15, -1);
            } else {
                var27 = new LocEntity(var17.field972, arg0, (byte) 69, true, var12, var11, arg9, var15, 3, var14);
            }
            arg6.method58(arg7, var19, var18, null, field63[arg0], var27, 350, var16, arg3, 0, arg2);
            if (var17.field966) {
                arg10.method357(var17.field967, arg7, arg0, field40, arg1, arg3);
            }
        } else if (arg1 == 9) {
            Entity var28;
            if (var17.field972 == -1) {
                var28 = var17.method335(arg1, arg0, var11, var12, var14, var15, -1);
            } else {
                var28 = new LocEntity(var17.field972, arg0, (byte) 69, true, var12, var11, arg9, var15, arg1, var14);
            }
            arg6.method60(1, 1, arg3, var19, arg7, var28, 0, arg2, var18, field39, var16);
            if (var17.field966) {
                arg10.method358(var17.field965, arg0, var17.field964, -29036, var17.field967, arg7, arg3);
            }
        } else {
            if (var17.field969) {
                if (arg0 == 1) {
                    int var29 = var15;
                    var15 = var14;
                    var14 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg0 == 2) {
                    int var30 = var15;
                    var15 = var12;
                    var12 = var30;
                    int var31 = var14;
                    var14 = var11;
                    var11 = var31;
                } else if (arg0 == 3) {
                    int var32 = var15;
                    var15 = var11;
                    var11 = var12;
                    var12 = var14;
                    var14 = var32;
                }
            }
            if (arg1 == 4) {
                Entity var33;
                if (var17.field972 == -1) {
                    var33 = var17.method335(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var33 = new LocEntity(var17.field972, 0, (byte) 69, true, var12, var11, arg9, var15, 4, var14);
                }
                arg6.method59(0, var33, arg2, arg3, var19, var18, field62[arg0], (byte) -93, arg0 * 512, var16, 0, arg7);
            } else if (arg1 == 5) {
                int var34 = 16;
                int var35 = arg6.method76(arg2, arg3, arg7);
                if (var35 > 0) {
                    var34 = LocType.method329(var35 >> 14 & 0x7FFF).field973;
                }
                Entity var36;
                if (var17.field972 == -1) {
                    var36 = var17.method335(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var36 = new LocEntity(var17.field972, 0, (byte) 69, true, var12, var11, arg9, var15, 4, var14);
                }
                arg6.method59(field65[arg0] * var34, var36, arg2, arg3, var19, var18, field62[arg0], (byte) -93, arg0 * 512, var16, field64[arg0] * var34, arg7);
            } else if (arg1 == 6) {
                Entity var37;
                if (var17.field972 == -1) {
                    var37 = var17.method335(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var37 = new LocEntity(var17.field972, 0, (byte) 69, true, var12, var11, arg9, var15, 4, var14);
                }
                arg6.method59(0, var37, arg2, arg3, var19, var18, 256, (byte) -93, arg0, var16, 0, arg7);
            } else if (arg1 == 7) {
                Entity var38;
                if (var17.field972 == -1) {
                    var38 = var17.method335(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var38 = new LocEntity(var17.field972, 0, (byte) 69, true, var12, var11, arg9, var15, 4, var14);
                }
                arg6.method59(0, var38, arg2, arg3, var19, var18, 512, (byte) -93, arg0, var16, 0, arg7);
            } else if (arg1 == 8) {
                Entity var39;
                if (var17.field972 == -1) {
                    var39 = var17.method335(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var39 = new LocEntity(var17.field972, 0, (byte) 69, true, var12, var11, arg9, var15, 4, var14);
                }
                arg6.method59(0, var39, arg2, arg3, var19, var18, 768, (byte) -93, arg0, var16, 0, arg7);
            }
        }
    }
}
