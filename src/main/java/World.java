import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "a", descriptor = "Z")
    private boolean field40 = true;

    @OriginalMember(owner = "c", name = "f", descriptor = "I")
    private int field45;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    private int field46;

    @OriginalMember(owner = "c", name = "h", descriptor = "[[[I")
    private int[][][] field47;

    @OriginalMember(owner = "c", name = "i", descriptor = "[[[B")
    private byte[][][] field48;

    @OriginalMember(owner = "c", name = "j", descriptor = "[[[B")
    private byte[][][] field49;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[B")
    private byte[][][] field50;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field51;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field52;

    @OriginalMember(owner = "c", name = "u", descriptor = "[[[I")
    private int[][][] field60;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field53;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[I")
    private int[][] field54;

    @OriginalMember(owner = "c", name = "p", descriptor = "[I")
    private int[] field55;

    @OriginalMember(owner = "c", name = "q", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "c", name = "r", descriptor = "[I")
    private int[] field57;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field58;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field59;

    @OriginalMember(owner = "c", name = "c", descriptor = "I")
    private static int field42 = -504;

    @OriginalMember(owner = "c", name = "d", descriptor = "Z")
    public static boolean field43 = true;

    @OriginalMember(owner = "c", name = "v", descriptor = "[I")
    private static final int[] field61 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private static final int[] field62 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private static final int[] field63 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field64 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "z", descriptor = "I")
    private static int field65 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "c", name = "A", descriptor = "I")
    private static int field66 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "c", name = "b", descriptor = "I")
    private static int field41;

    @OriginalMember(owner = "c", name = "e", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "(I[[[II[[[BI)V")
    public World(int arg0, int[][][] arg1, int arg2, byte[][][] arg3, int arg4) {
        this.field45 = arg0;
        this.field46 = arg2;
        this.field47 = arg1;
        this.field48 = arg3;
        this.field49 = new byte[4][this.field45][this.field46];
        this.field50 = new byte[4][this.field45][this.field46];
        this.field51 = new byte[4][this.field45][this.field46];
        this.field52 = new byte[4][this.field45][this.field46];
        this.field60 = new int[4][this.field45 + 1][this.field46 + 1];
        this.field53 = new byte[4][this.field45 + 1][this.field46 + 1];
        this.field54 = new int[this.field45 + 1][this.field46 + 1];
        if (arg4 != 0) {
            throw new NullPointerException();
        }
        this.field55 = new int[this.field46];
        this.field56 = new int[this.field46];
        this.field57 = new int[this.field46];
        this.field58 = new int[this.field46];
        this.field59 = new int[this.field46];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIII)V")
    public final void method14(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg2; var6 <= arg0 + arg2; var6++) {
            for (int var7 = arg1; var7 <= arg1 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field45 && var6 >= 0 && var6 < this.field46) {
                    this.field53[0][var7][var6] = 127;
                    if (arg1 == var7 && var7 > 0) {
                        this.field47[0][var7][var6] = this.field47[0][var7 - 1][var6];
                    }
                    if (arg1 + arg4 == var7 && var7 < this.field45 - 1) {
                        this.field47[0][var7][var6] = this.field47[0][var7 + 1][var6];
                    }
                    if (arg2 == var6 && var6 > 0) {
                        this.field47[0][var7][var6] = this.field47[0][var7][var6 - 1];
                    }
                    if (arg0 + arg2 == var6 && var6 < this.field46 - 1) {
                        this.field47[0][var7][var6] = this.field47[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg3 != 0) {
            field41 = 256;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIII[B)V")
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        Packet var7 = new Packet(arg5, -26728);
        if (arg4 < 2 || arg4 > 2) {
            this.field40 = !this.field40;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg1 + var9;
                    int var12 = arg3 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field48[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method229();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field47[0][var11][var12] = -method22(var11 + arg2 + 932731, var12 + 556238 + arg0) * 8;
                                } else {
                                    this.field47[var8][var11][var12] = this.field47[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method229();
                                if (var14 == 1) {
                                    var14 = 0;
                                }
                                if (var8 == 0) {
                                    this.field47[0][var11][var12] = -var14 * 8;
                                } else {
                                    this.field47[var8][var11][var12] = this.field47[var8 - 1][var11][var12] - var14 * 8;
                                }
                                break;
                            }
                            if (var13 <= 49) {
                                this.field50[var8][var11][var12] = var7.method230();
                                this.field51[var8][var11][var12] = (byte) ((var13 - 2) / 4);
                                this.field52[var8][var11][var12] = (byte) (var13 - 2 & 0x3);
                            } else if (var13 <= 81) {
                                this.field48[var8][var11][var12] = (byte) (var13 - 49);
                            } else {
                                this.field49[var8][var11][var12] = (byte) (var13 - 81);
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(III[B)Z")
    public static final boolean method16(int arg0, int arg1, int arg2, byte[] arg3) {
        boolean var4 = true;
        Packet var5 = new Packet(arg3, -26728);
        if (arg0 != 21991) {
            throw new NullPointerException();
        }
        int var6 = -1;
        label54: while (true) {
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
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method229() >> 2;
                    int var15 = arg1 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.method330(var6);
                        if (var14 != 22 || !field43 || var17.field976 || var17.field996) {
                            var4 &= var17.method334(2);
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(Llb;Lub;B)V")
    public static final void method17(Packet arg0, OnDemand arg1, byte arg2) {
        if (arg2 != -75) {
            field41 = 109;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg0.method243();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            LocType var5 = LocType.method330(var3);
            var5.method335(field42, arg1);
            while (true) {
                int var6 = arg0.method243();
                if (var6 == 0) {
                    break;
                }
                arg0.method229();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(I[Ljc;Lr;I[BZ)V")
    public final void method18(int arg0, CollisionMap[] arg1, World3D arg2, int arg3, byte[] arg4, boolean arg5) {
        Packet var7 = new Packet(arg4, -26728);
        int var8 = -1;
        if (!arg5) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
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
                int var19 = arg3 + var14;
                int var20 = arg0 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field48[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    CollisionMap var22 = null;
                    if (var21 >= 0) {
                        var22 = arg1[var21];
                    }
                    this.method19(var18, 0, var20, var15, var8, arg2, var22, var19, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIIILr;Ljc;II)V")
    private final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, World3D arg5, CollisionMap arg6, int arg7, int arg8) {
        if (field43) {
            if ((this.field48[arg3][arg7][arg2] & 0x10) != 0) {
                return;
            }
            if (this.method21(arg3, arg7, 318, arg2) != field44) {
                return;
            }
        }
        int var10 = this.field47[arg3][arg7][arg2];
        int var11 = this.field47[arg3][arg7 + 1][arg2];
        int var12 = this.field47[arg3][arg7 + 1][arg2 + 1];
        int var13 = this.field47[arg3][arg7][arg2 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        LocType var15 = LocType.method330(arg4);
        int var16 = (arg4 << 14) + (arg2 << 7) + arg7 + 1073741824;
        if (arg1 != 0) {
            field41 = 455;
        }
        if (!var15.field976) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg0 << 6) + arg8);
        if (arg8 == 22) {
            if (!field43 || var15.field976 || var15.field996) {
                Entity var18;
                if (var15.field980 == -1 && var15.field999 == null) {
                    var18 = var15.method336(22, arg0, var10, var11, var12, var13, -1);
                } else {
                    var18 = new LocEntity(var13, true, 22, 0, var10, var11, var12, arg0, arg4, var15.field980);
                }
                arg5.method56(8, arg3, var17, var16, arg2, var18, arg7, var14);
                if (var15.field974 && var15.field976 && arg6 != null) {
                    arg6.method362(arg2, arg7, true);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            Entity var38;
            if (var15.field980 == -1 && var15.field999 == null) {
                var38 = var15.method336(10, arg0, var10, var11, var12, var13, -1);
            } else {
                var38 = new LocEntity(var13, true, 10, 0, var10, var11, var12, arg0, arg4, var15.field980);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg8 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg0 == 1 || arg0 == 3) {
                    var40 = var15.field973;
                    var41 = var15.field972;
                } else {
                    var40 = var15.field972;
                    var41 = var15.field973;
                }
                if (arg5.method60(var41, arg3, arg2, var16, var14, var39, var17, arg7, var40, (byte) 7, var38) && var15.field988) {
                    Model var42;
                    if (var38 instanceof Model) {
                        var42 = (Model) var38;
                    } else {
                        var42 = var15.method336(10, arg0, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field564 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field53[arg3][arg7 + var43][arg2 + var44]) {
                                    this.field53[arg3][arg7 + var43][arg2 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field974 && arg6 != null) {
                arg6.method361(var15.field972, var15.field973, var15.field975, arg2, arg7, arg0, 0);
            }
        } else if (arg8 >= 12) {
            Entity var19;
            if (var15.field980 == -1 && var15.field999 == null) {
                var19 = var15.method336(arg8, arg0, var10, var11, var12, var13, -1);
            } else {
                var19 = new LocEntity(var13, true, arg8, 0, var10, var11, var12, arg0, arg4, var15.field980);
            }
            arg5.method60(1, arg3, arg2, var16, var14, 0, var17, arg7, 1, (byte) 7, var19);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg3 > 0) {
                this.field60[arg3][arg7][arg2] |= 0x924;
            }
            if (var15.field974 && arg6 != null) {
                arg6.method361(var15.field972, var15.field973, var15.field975, arg2, arg7, arg0, 0);
            }
        } else if (arg8 == 0) {
            Entity var20;
            if (var15.field980 == -1 && var15.field999 == null) {
                var20 = var15.method336(0, arg0, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(var13, true, 0, 0, var10, var11, var12, arg0, arg4, var15.field980);
            }
            arg5.method58(null, var20, -172, var16, var14, arg2, field61[arg0], 0, arg7, arg3, var17);
            if (arg0 == 0) {
                if (var15.field988) {
                    this.field53[arg3][arg7][arg2] = 50;
                    this.field53[arg3][arg7][arg2 + 1] = 50;
                }
                if (var15.field979) {
                    this.field60[arg3][arg7][arg2] |= 0x249;
                }
            } else if (arg0 == 1) {
                if (var15.field988) {
                    this.field53[arg3][arg7][arg2 + 1] = 50;
                    this.field53[arg3][arg7 + 1][arg2 + 1] = 50;
                }
                if (var15.field979) {
                    this.field60[arg3][arg7][arg2 + 1] |= 0x492;
                }
            } else if (arg0 == 2) {
                if (var15.field988) {
                    this.field53[arg3][arg7 + 1][arg2] = 50;
                    this.field53[arg3][arg7 + 1][arg2 + 1] = 50;
                }
                if (var15.field979) {
                    this.field60[arg3][arg7 + 1][arg2] |= 0x249;
                }
            } else if (arg0 == 3) {
                if (var15.field988) {
                    this.field53[arg3][arg7][arg2] = 50;
                    this.field53[arg3][arg7 + 1][arg2] = 50;
                }
                if (var15.field979) {
                    this.field60[arg3][arg7][arg2] |= 0x492;
                }
            }
            if (var15.field974 && arg6 != null) {
                arg6.method360(arg7, -784, arg0, arg2, var15.field975, arg8);
            }
            if (var15.field981 != 16) {
                arg5.method66(arg3, var15.field981, (byte) 9, arg2, arg7);
            }
        } else if (arg8 == 1) {
            Entity var21;
            if (var15.field980 == -1 && var15.field999 == null) {
                var21 = var15.method336(1, arg0, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(var13, true, 1, 0, var10, var11, var12, arg0, arg4, var15.field980);
            }
            arg5.method58(null, var21, -172, var16, var14, arg2, field62[arg0], 0, arg7, arg3, var17);
            if (var15.field988) {
                if (arg0 == 0) {
                    this.field53[arg3][arg7][arg2 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field53[arg3][arg7 + 1][arg2 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field53[arg3][arg7 + 1][arg2] = 50;
                } else if (arg0 == 3) {
                    this.field53[arg3][arg7][arg2] = 50;
                }
            }
            if (var15.field974 && arg6 != null) {
                arg6.method360(arg7, -784, arg0, arg2, var15.field975, arg8);
            }
        } else if (arg8 == 2) {
            int var22 = arg0 + 1 & 0x3;
            Entity var23;
            Entity var24;
            if (var15.field980 == -1 && var15.field999 == null) {
                var23 = var15.method336(2, arg0 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method336(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new LocEntity(var13, true, 2, 0, var10, var11, var12, arg0 + 4, arg4, var15.field980);
                var24 = new LocEntity(var13, true, 2, 0, var10, var11, var12, var22, arg4, var15.field980);
            }
            arg5.method58(var24, var23, -172, var16, var14, arg2, field61[arg0], field61[var22], arg7, arg3, var17);
            if (var15.field979) {
                if (arg0 == 0) {
                    this.field60[arg3][arg7][arg2] |= 0x249;
                    this.field60[arg3][arg7][arg2 + 1] |= 0x492;
                } else if (arg0 == 1) {
                    this.field60[arg3][arg7][arg2 + 1] |= 0x492;
                    this.field60[arg3][arg7 + 1][arg2] |= 0x249;
                } else if (arg0 == 2) {
                    this.field60[arg3][arg7 + 1][arg2] |= 0x249;
                    this.field60[arg3][arg7][arg2] |= 0x492;
                } else if (arg0 == 3) {
                    this.field60[arg3][arg7][arg2] |= 0x492;
                    this.field60[arg3][arg7][arg2] |= 0x249;
                }
            }
            if (var15.field974 && arg6 != null) {
                arg6.method360(arg7, -784, arg0, arg2, var15.field975, arg8);
            }
            if (var15.field981 != 16) {
                arg5.method66(arg3, var15.field981, (byte) 9, arg2, arg7);
            }
        } else if (arg8 == 3) {
            Entity var25;
            if (var15.field980 == -1 && var15.field999 == null) {
                var25 = var15.method336(3, arg0, var10, var11, var12, var13, -1);
            } else {
                var25 = new LocEntity(var13, true, 3, 0, var10, var11, var12, arg0, arg4, var15.field980);
            }
            arg5.method58(null, var25, -172, var16, var14, arg2, field62[arg0], 0, arg7, arg3, var17);
            if (var15.field988) {
                if (arg0 == 0) {
                    this.field53[arg3][arg7][arg2 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field53[arg3][arg7 + 1][arg2 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field53[arg3][arg7 + 1][arg2] = 50;
                } else if (arg0 == 3) {
                    this.field53[arg3][arg7][arg2] = 50;
                }
            }
            if (var15.field974 && arg6 != null) {
                arg6.method360(arg7, -784, arg0, arg2, var15.field975, arg8);
            }
        } else if (arg8 == 9) {
            Entity var26;
            if (var15.field980 == -1 && var15.field999 == null) {
                var26 = var15.method336(arg8, arg0, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(var13, true, arg8, 0, var10, var11, var12, arg0, arg4, var15.field980);
            }
            arg5.method60(1, arg3, arg2, var16, var14, 0, var17, arg7, 1, (byte) 7, var26);
            if (var15.field974 && arg6 != null) {
                arg6.method361(var15.field972, var15.field973, var15.field975, arg2, arg7, arg0, 0);
            }
        } else {
            if (var15.field977) {
                if (arg0 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg0 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg0 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg8 == 4) {
                Entity var31;
                if (var15.field980 == -1 && var15.field999 == null) {
                    var31 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new LocEntity(var13, true, 4, 0, var10, var11, var12, 0, arg4, var15.field980);
                }
                arg5.method59(var31, var14, 0, arg0 * 512, arg3, (byte) 49, field61[arg0], arg2, var17, 0, arg7, var16);
            } else if (arg8 == 5) {
                int var32 = 16;
                int var33 = arg5.method76(arg3, arg7, arg2);
                if (var33 > 0) {
                    var32 = LocType.method330(var33 >> 14 & 0x7FFF).field981;
                }
                Entity var34;
                if (var15.field980 == -1 && var15.field999 == null) {
                    var34 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new LocEntity(var13, true, 4, 0, var10, var11, var12, 0, arg4, var15.field980);
                }
                arg5.method59(var34, var14, field64[arg0] * var32, arg0 * 512, arg3, (byte) 49, field61[arg0], arg2, var17, field63[arg0] * var32, arg7, var16);
            } else if (arg8 == 6) {
                Entity var35;
                if (var15.field980 == -1 && var15.field999 == null) {
                    var35 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new LocEntity(var13, true, 4, 0, var10, var11, var12, 0, arg4, var15.field980);
                }
                arg5.method59(var35, var14, 0, arg0, arg3, (byte) 49, 256, arg2, var17, 0, arg7, var16);
            } else if (arg8 == 7) {
                Entity var36;
                if (var15.field980 == -1 && var15.field999 == null) {
                    var36 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new LocEntity(var13, true, 4, 0, var10, var11, var12, 0, arg4, var15.field980);
                }
                arg5.method59(var36, var14, 0, arg0, arg3, (byte) 49, 512, arg2, var17, 0, arg7, var16);
            } else if (arg8 == 8) {
                Entity var37;
                if (var15.field980 == -1 && var15.field999 == null) {
                    var37 = var15.method336(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new LocEntity(var13, true, 4, 0, var10, var11, var12, 0, arg4, var15.field980);
                }
                arg5.method59(var37, var14, 0, arg0, arg3, (byte) 49, 768, arg2, var17, 0, arg7, var16);
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([Ljc;Lr;Z)V")
    public final void method20(CollisionMap[] arg0, World3D arg1, boolean arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field48[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field48[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method362(var111, var110, true);
                        }
                    }
                }
            }
        }
        field65 += (int) (Math.random() * 5.0D) - 2;
        if (field65 < -8) {
            field65 = -8;
        }
        if (field65 > 8) {
            field65 = 8;
        }
        field66 += (int) (Math.random() * 5.0D) - 2;
        if (field66 < -16) {
            field66 = -16;
        }
        if (field66 > 16) {
            field66 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field53[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field46 - 1; var56++) {
                for (int var101 = 1; var101 < this.field45 - 1; var101++) {
                    int var102 = this.field47[var5][var101 + 1][var56] - this.field47[var5][var101 - 1][var56];
                    int var103 = this.field47[var5][var101][var56 + 1] - this.field47[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field54[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field46; var57++) {
                this.field55[var57] = 0;
                this.field56[var57] = 0;
                this.field57[var57] = 0;
                this.field58[var57] = 0;
                this.field59[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field45 + 5; var58++) {
                for (int var61 = 0; var61 < this.field46; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field45) {
                        int var96 = this.field49[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            FloType var97 = FloType.field1114[var96 - 1];
                            this.field55[var61] += var97.field1123;
                            this.field56[var61] += var97.field1121;
                            this.field57[var61] += var97.field1122;
                            this.field58[var61] += var97.field1124;
                            var10002 = this.field59[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field45) {
                        int var99 = this.field49[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.field1114[var99 - 1];
                            this.field55[var61] -= var100.field1123;
                            this.field56[var61] -= var100.field1121;
                            this.field57[var61] -= var100.field1122;
                            this.field58[var61] -= var100.field1124;
                            var10002 = this.field59[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field45 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field46 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field46) {
                            var62 += this.field55[var68];
                            var63 += this.field56[var68];
                            var64 += this.field57[var68];
                            var65 += this.field58[var68];
                            var66 += this.field59[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field46) {
                            var62 -= this.field55[var69];
                            var63 -= this.field56[var69];
                            var64 -= this.field57[var69];
                            var65 -= this.field58[var69];
                            var66 -= this.field59[var69];
                        }
                        if (var67 >= 1 && var67 < this.field46 - 1 && (!field43 || (this.field48[var5][var58][var67] & 0x10) == 0 && this.method21(var5, var58, 318, var67) == field44)) {
                            int var70 = this.field49[var5][var58][var67] & 0xFF;
                            int var71 = this.field50[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field47[var5][var58][var67];
                                int var73 = this.field47[var5][var58 + 1][var67];
                                int var74 = this.field47[var5][var58 + 1][var67 + 1];
                                int var75 = this.field47[var5][var58][var67 + 1];
                                int var76 = this.field54[var58][var67];
                                int var77 = this.field54[var58 + 1][var67];
                                int var78 = this.field54[var58 + 1][var67 + 1];
                                int var79 = this.field54[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method29(var82, var83, var84);
                                    int var85 = field65 + var82 & 0xFF;
                                    int var86 = field66 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method29(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field51[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !FloType.field1114[var71 - 1].field1119) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field60[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Pix3D.field655[method27(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method55(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field51[var5][var58][var67] + 1;
                                    byte var90 = this.field52[var5][var58][var67];
                                    FloType var91 = FloType.field1114[var71 - 1];
                                    int var92 = var91.field1117;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Pix3D.method170((byte) 5, var92);
                                        var94 = -1;
                                    } else if (var91.field1116 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method29(var91.field1120, var91.field1121, var91.field1122);
                                        var93 = Pix3D.field655[this.method28(var91.field1125, 96)];
                                    }
                                    arg1.method55(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), this.method28(var94, var76), this.method28(var94, var77), this.method28(var94, var78), this.method28(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field46 - 1; var59++) {
                for (int var60 = 1; var60 < this.field45 - 1; var60++) {
                    arg1.method54(var5, var60, var59, this.method21(var5, var60, 318, var59));
                }
            }
        }
        if (arg2) {
            return;
        }
        arg1.method81(768, 64, -50, -89, -50, -10);
        for (int var6 = 0; var6 < this.field45; var6++) {
            for (int var47 = 0; var47 < this.field46; var47++) {
                if ((this.field48[1][var6][var47] & 0x2) == 2) {
                    arg1.method52(var47, (byte) 79, var6);
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
                for (int var12 = 0; var12 <= this.field46; var12++) {
                    for (int var13 = 0; var13 <= this.field45; var13++) {
                        if ((this.field60[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field60[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field46 && (this.field60[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label326: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field60[var16 - 1][var13][var18] & var7) == 0) {
                                        break label326;
                                    }
                                }
                                var16--;
                            }
                            label315: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field60[var17 + 1][var13][var19] & var7) == 0) {
                                        break label315;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field47[var17][var13][var14] - var21;
                                int var23 = this.field47[var16][var13][var14];
                                World3D.method53(var13 * 128, var10, var15 * 128 + 128, var14 * 128, 1, var23, var13 * 128, var22, 0);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field60[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field60[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field60[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field45 && (this.field60[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label379: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field60[var28 - 1][var30][var12] & var8) == 0) {
                                        break label379;
                                    }
                                }
                                var28--;
                            }
                            label368: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field60[var29 + 1][var31][var12] & var8) == 0) {
                                        break label368;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field47[var29][var26][var12] - var33;
                                int var35 = this.field47[var28][var26][var12];
                                World3D.method53(var26 * 128, var10, var12 * 128, var12 * 128, 2, var35, var27 * 128 + 128, var34, 0);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field60[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field60[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field60[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field46 && (this.field60[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label432: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field60[var11][var38 - 1][var42] & var9) == 0) {
                                        break label432;
                                    }
                                }
                                var38--;
                            }
                            label421: while (var39 < this.field45) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field60[var11][var39 + 1][var43] & var9) == 0) {
                                        break label421;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field47[var11][var38][var40];
                                World3D.method53(var38 * 128, var10, var41 * 128 + 128, var40 * 128, 4, var44, var39 * 128 + 128, var44, 0);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field60[var11][var45][var46] &= ~var9;
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
        int var5 = 99 / arg2;
        if ((this.field48[arg0][arg1][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (this.field48[1][arg1][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
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

    @OriginalMember(owner = "c", name = "c", descriptor = "(III)Z")
    public static final boolean method30(int arg0, int arg1, int arg2) {
        if (arg1 < 4 || arg1 > 4) {
            throw new NullPointerException();
        }
        LocType var3 = LocType.method330(arg0);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method333(3, arg2);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(III[[[ILjc;IILr;III)V")
    public static final void method31(int arg0, int arg1, int arg2, int[][][] arg3, CollisionMap arg4, int arg5, int arg6, World3D arg7, int arg8, int arg9, int arg10) {
        int var11 = arg3[arg0][arg9][arg6];
        int var12 = arg3[arg0][arg9 + 1][arg6];
        int var13 = arg3[arg0][arg9 + 1][arg6 + 1];
        int var14 = arg3[arg0][arg9][arg6 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method330(arg2);
        int var17 = (arg2 << 14) + (arg6 << 7) + arg9 + 1073741824;
        if (!var16.field976) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg5 << 6) + arg10);
        if (arg8 != 8) {
            return;
        }
        if (arg10 == 22) {
            Entity var19;
            if (var16.field980 == -1 && var16.field999 == null) {
                var19 = var16.method336(22, arg5, var11, var12, var13, var14, -1);
            } else {
                var19 = new LocEntity(var14, true, 22, 0, var11, var12, var13, arg5, arg2, var16.field980);
            }
            arg7.method56(8, arg1, var18, var17, arg6, var19, arg9, var15);
            if (var16.field974 && var16.field976) {
                arg4.method362(arg6, arg9, true);
            }
        } else if (arg10 == 10 || arg10 == 11) {
            Entity var39;
            if (var16.field980 == -1 && var16.field999 == null) {
                var39 = var16.method336(10, arg5, var11, var12, var13, var14, -1);
            } else {
                var39 = new LocEntity(var14, true, 10, 0, var11, var12, var13, arg5, arg2, var16.field980);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg10 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg5 == 1 || arg5 == 3) {
                    var41 = var16.field973;
                    var42 = var16.field972;
                } else {
                    var41 = var16.field972;
                    var42 = var16.field973;
                }
                arg7.method60(var42, arg1, arg6, var17, var15, var40, var18, arg9, var41, (byte) 7, var39);
            }
            if (var16.field974) {
                arg4.method361(var16.field972, var16.field973, var16.field975, arg6, arg9, arg5, 0);
            }
        } else if (arg10 >= 12) {
            Entity var20;
            if (var16.field980 == -1 && var16.field999 == null) {
                var20 = var16.method336(arg10, arg5, var11, var12, var13, var14, -1);
            } else {
                var20 = new LocEntity(var14, true, arg10, 0, var11, var12, var13, arg5, arg2, var16.field980);
            }
            arg7.method60(1, arg1, arg6, var17, var15, 0, var18, arg9, 1, (byte) 7, var20);
            if (var16.field974) {
                arg4.method361(var16.field972, var16.field973, var16.field975, arg6, arg9, arg5, 0);
            }
        } else if (arg10 == 0) {
            Entity var21;
            if (var16.field980 == -1 && var16.field999 == null) {
                var21 = var16.method336(0, arg5, var11, var12, var13, var14, -1);
            } else {
                var21 = new LocEntity(var14, true, 0, 0, var11, var12, var13, arg5, arg2, var16.field980);
            }
            arg7.method58(null, var21, -172, var17, var15, arg6, field61[arg5], 0, arg9, arg1, var18);
            if (var16.field974) {
                arg4.method360(arg9, -784, arg5, arg6, var16.field975, arg10);
            }
        } else if (arg10 == 1) {
            Entity var22;
            if (var16.field980 == -1 && var16.field999 == null) {
                var22 = var16.method336(1, arg5, var11, var12, var13, var14, -1);
            } else {
                var22 = new LocEntity(var14, true, 1, 0, var11, var12, var13, arg5, arg2, var16.field980);
            }
            arg7.method58(null, var22, -172, var17, var15, arg6, field62[arg5], 0, arg9, arg1, var18);
            if (var16.field974) {
                arg4.method360(arg9, -784, arg5, arg6, var16.field975, arg10);
            }
        } else if (arg10 == 2) {
            int var23 = arg5 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var16.field980 == -1 && var16.field999 == null) {
                var24 = var16.method336(2, arg5 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method336(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new LocEntity(var14, true, 2, 0, var11, var12, var13, arg5 + 4, arg2, var16.field980);
                var25 = new LocEntity(var14, true, 2, 0, var11, var12, var13, var23, arg2, var16.field980);
            }
            arg7.method58(var25, var24, -172, var17, var15, arg6, field61[arg5], field61[var23], arg9, arg1, var18);
            if (var16.field974) {
                arg4.method360(arg9, -784, arg5, arg6, var16.field975, arg10);
            }
        } else if (arg10 == 3) {
            Entity var26;
            if (var16.field980 == -1 && var16.field999 == null) {
                var26 = var16.method336(3, arg5, var11, var12, var13, var14, -1);
            } else {
                var26 = new LocEntity(var14, true, 3, 0, var11, var12, var13, arg5, arg2, var16.field980);
            }
            arg7.method58(null, var26, -172, var17, var15, arg6, field62[arg5], 0, arg9, arg1, var18);
            if (var16.field974) {
                arg4.method360(arg9, -784, arg5, arg6, var16.field975, arg10);
            }
        } else if (arg10 == 9) {
            Entity var27;
            if (var16.field980 == -1 && var16.field999 == null) {
                var27 = var16.method336(arg10, arg5, var11, var12, var13, var14, -1);
            } else {
                var27 = new LocEntity(var14, true, arg10, 0, var11, var12, var13, arg5, arg2, var16.field980);
            }
            arg7.method60(1, arg1, arg6, var17, var15, 0, var18, arg9, 1, (byte) 7, var27);
            if (var16.field974) {
                arg4.method361(var16.field972, var16.field973, var16.field975, arg6, arg9, arg5, 0);
            }
        } else {
            if (var16.field977) {
                if (arg5 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg5 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg5 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg10 == 4) {
                Entity var32;
                if (var16.field980 == -1 && var16.field999 == null) {
                    var32 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new LocEntity(var14, true, 4, 0, var11, var12, var13, 0, arg2, var16.field980);
                }
                arg7.method59(var32, var15, 0, arg5 * 512, arg1, (byte) 49, field61[arg5], arg6, var18, 0, arg9, var17);
            } else if (arg10 == 5) {
                int var33 = 16;
                int var34 = arg7.method76(arg1, arg9, arg6);
                if (var34 > 0) {
                    var33 = LocType.method330(var34 >> 14 & 0x7FFF).field981;
                }
                Entity var35;
                if (var16.field980 == -1 && var16.field999 == null) {
                    var35 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new LocEntity(var14, true, 4, 0, var11, var12, var13, 0, arg2, var16.field980);
                }
                arg7.method59(var35, var15, field64[arg5] * var33, arg5 * 512, arg1, (byte) 49, field61[arg5], arg6, var18, field63[arg5] * var33, arg9, var17);
            } else if (arg10 == 6) {
                Entity var36;
                if (var16.field980 == -1 && var16.field999 == null) {
                    var36 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new LocEntity(var14, true, 4, 0, var11, var12, var13, 0, arg2, var16.field980);
                }
                arg7.method59(var36, var15, 0, arg5, arg1, (byte) 49, 256, arg6, var18, 0, arg9, var17);
            } else if (arg10 == 7) {
                Entity var37;
                if (var16.field980 == -1 && var16.field999 == null) {
                    var37 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new LocEntity(var14, true, 4, 0, var11, var12, var13, 0, arg2, var16.field980);
                }
                arg7.method59(var37, var15, 0, arg5, arg1, (byte) 49, 512, arg6, var18, 0, arg9, var17);
            } else if (arg10 == 8) {
                Entity var38;
                if (var16.field980 == -1 && var16.field999 == null) {
                    var38 = var16.method336(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new LocEntity(var14, true, 4, 0, var11, var12, var13, 0, arg2, var16.field980);
                }
                arg7.method59(var38, var15, 0, arg5, arg1, (byte) 49, 768, arg6, var18, 0, arg9, var17);
            }
        }
    }
}
