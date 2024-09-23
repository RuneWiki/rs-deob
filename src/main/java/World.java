import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "a", descriptor = "Z")
    private boolean field44 = true;

    @OriginalMember(owner = "c", name = "d", descriptor = "Z")
    private boolean field47 = false;

    @OriginalMember(owner = "c", name = "k", descriptor = "I")
    private int field54;

    @OriginalMember(owner = "c", name = "l", descriptor = "I")
    private int field55;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[I")
    private int[][][] field56;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field57;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field58;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[[B")
    private byte[][][] field59;

    @OriginalMember(owner = "c", name = "q", descriptor = "[[[B")
    private byte[][][] field60;

    @OriginalMember(owner = "c", name = "r", descriptor = "[[[B")
    private byte[][][] field61;

    @OriginalMember(owner = "c", name = "z", descriptor = "[[[I")
    private int[][][] field69;

    @OriginalMember(owner = "c", name = "s", descriptor = "[[[B")
    private byte[][][] field62;

    @OriginalMember(owner = "c", name = "t", descriptor = "[[I")
    private int[][] field63;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field64;

    @OriginalMember(owner = "c", name = "v", descriptor = "[I")
    private int[] field65;

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private int[] field66;

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private int[] field67;

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private int[] field68;

    @OriginalMember(owner = "c", name = "b", descriptor = "B")
    private static byte field45 = 6;

    @OriginalMember(owner = "c", name = "c", descriptor = "Z")
    private static boolean field46 = true;

    @OriginalMember(owner = "c", name = "e", descriptor = "I")
    private static int field48 = -938;

    @OriginalMember(owner = "c", name = "f", descriptor = "Z")
    private static boolean field49 = true;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    private static int field50 = 30492;

    @OriginalMember(owner = "c", name = "h", descriptor = "B")
    private static byte field51 = -61;

    @OriginalMember(owner = "c", name = "i", descriptor = "Z")
    public static boolean field52 = true;

    @OriginalMember(owner = "c", name = "A", descriptor = "[I")
    private static final int[] field70 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "B", descriptor = "[I")
    private static final int[] field71 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "C", descriptor = "[I")
    private static final int[] field72 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "D", descriptor = "[I")
    private static final int[] field73 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "E", descriptor = "I")
    private static int field74 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "c", name = "F", descriptor = "I")
    private static int field75 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "c", name = "j", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "([[[BIZI[[[I)V")
    public World(byte[][][] arg0, int arg1, boolean arg2, int arg3, int[][][] arg4) {
        this.field54 = arg3;
        this.field55 = arg1;
        this.field56 = arg4;
        this.field57 = arg0;
        this.field58 = new byte[4][this.field54][this.field55];
        this.field59 = new byte[4][this.field54][this.field55];
        this.field60 = new byte[4][this.field54][this.field55];
        if (!arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field61 = new byte[4][this.field54][this.field55];
        this.field69 = new int[4][this.field54 + 1][this.field55 + 1];
        this.field62 = new byte[4][this.field54 + 1][this.field55 + 1];
        this.field63 = new int[this.field54 + 1][this.field55 + 1];
        this.field64 = new int[this.field55];
        this.field65 = new int[this.field55];
        this.field66 = new int[this.field55];
        this.field67 = new int[this.field55];
        this.field68 = new int[this.field55];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIII)V")
    public final void method14(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg0; var6 <= arg0 + arg1; var6++) {
            for (int var7 = arg2; var7 <= arg2 + arg3; var7++) {
                if (var7 >= 0 && var7 < this.field54 && var6 >= 0 && var6 < this.field55) {
                    this.field62[0][var7][var6] = 127;
                    if (arg2 == var7 && var7 > 0) {
                        this.field56[0][var7][var6] = this.field56[0][var7 - 1][var6];
                    }
                    if (arg2 + arg3 == var7 && var7 < this.field54 - 1) {
                        this.field56[0][var7][var6] = this.field56[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        this.field56[0][var7][var6] = this.field56[0][var7][var6 - 1];
                    }
                    if (arg0 + arg1 == var6 && var6 < this.field55 - 1) {
                        this.field56[0][var7][var6] = this.field56[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg4 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(I[BIIII)V")
    public final void method15(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 0) {
            return;
        }
        Packet var7 = new Packet(45427, arg1);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg2 + var9;
                    int var12 = arg0 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field57[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method239();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field56[0][var11][var12] = -method22(var11 + arg4 + 932731, var12 + 556238 + arg5) * 8;
                                } else {
                                    this.field56[var8][var11][var12] = this.field56[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method239();
                                if (var14 == 1) {
                                    var14 = 0;
                                }
                                if (var8 == 0) {
                                    this.field56[0][var11][var12] = -var14 * 8;
                                } else {
                                    this.field56[var8][var11][var12] = this.field56[var8 - 1][var11][var12] - var14 * 8;
                                }
                                break;
                            }
                            if (var13 <= 49) {
                                this.field59[var8][var11][var12] = var7.method240();
                                this.field60[var8][var11][var12] = (byte) ((var13 - 2) / 4);
                                this.field61[var8][var11][var12] = (byte) (var13 - 2 & 0x3);
                            } else if (var13 <= 81) {
                                this.field57[var8][var11][var12] = (byte) (var13 - 49);
                            } else {
                                this.field58[var8][var11][var12] = (byte) (var13 - 81);
                            }
                        }
                    } else {
                        while (true) {
                            int var15 = var7.method239();
                            if (var15 == 0) {
                                break;
                            }
                            if (var15 == 1) {
                                var7.method239();
                                break;
                            }
                            if (var15 <= 49) {
                                var7.method239();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(I[BZI)Z")
    public static final boolean method16(int arg0, byte[] arg1, boolean arg2, int arg3) {
        boolean var4 = true;
        Packet var5 = new Packet(45427, arg1);
        int var6 = -1;
        if (arg2) {
            throw new NullPointerException();
        }
        label52: while (true) {
            int var7 = var5.method253();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method253();
                    if (var11 == 0) {
                        continue label52;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method239() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.method334(var6);
                        if (var14 != 22 || !field52 || var17.field980 || var17.field1000) {
                            var4 &= var17.method338((byte) 98);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method253();
                if (var10 == 0) {
                    break;
                }
                var5.method239();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lvb;ILmb;)V")
    public static final void method17(OnDemand arg0, int arg1, Packet arg2) {
        if (arg1 != 3) {
            field48 = 282;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg2.method253();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            LocType var5 = LocType.method334(var3);
            var5.method339(arg0, field50);
            while (true) {
                int var6 = arg2.method253();
                if (var6 == 0) {
                    break;
                }
                arg2.method239();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([Ljc;Ls;[BIII)V")
    public final void method18(CollisionMap[] arg0, World3D arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        if (arg5 >= 0) {
            this.field44 = !this.field44;
        }
        Packet var7 = new Packet(45427, arg2);
        int var8 = -1;
        while (true) {
            int var9 = var7.method253();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method253();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method239();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg4 + var13;
                int var19 = arg3 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field57[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    CollisionMap var21 = null;
                    if (var20 >= 0) {
                        var21 = arg0[var20];
                    }
                    this.method19(var21, var17, var14, var8, var16, -284, var18, var19, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Ljc;IIIIIIILs;)V")
    private final void method19(CollisionMap arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, World3D arg8) {
        if (field52) {
            if ((this.field57[arg2][arg6][arg7] & 0x10) != 0) {
                return;
            }
            if (this.method21(arg2, 0, arg6, arg7) != field53) {
                return;
            }
        }
        int var10 = this.field56[arg2][arg6][arg7];
        int var11 = this.field56[arg2][arg6 + 1][arg7];
        int var12 = this.field56[arg2][arg6 + 1][arg7 + 1];
        int var13 = this.field56[arg2][arg6][arg7 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        LocType var15 = LocType.method334(arg3);
        if (arg5 >= 0) {
            return;
        }
        int var16 = (arg3 << 14) + (arg7 << 7) + arg6 + 1073741824;
        if (!var15.field980) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg1 << 6) + arg4);
        if (arg4 == 22) {
            if (!field52 || var15.field980 || var15.field1000) {
                Entity var18;
                if (var15.field984 == -1) {
                    var18 = var15.method340(22, arg1, var10, var11, var12, var13, -1);
                } else {
                    var18 = new LocEntity(var12, arg1, arg3, field51, var11, var10, 22, true, var13, var15.field984);
                }
                arg8.method70(arg2, var18, var14, 0, var16, var17, arg6, arg7);
                if (var15.field978 && var15.field980 && arg0 != null) {
                    arg0.method364(arg7, arg6, 475);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            Entity var34;
            if (var15.field984 == -1) {
                var34 = var15.method340(10, arg1, var10, var11, var12, var13, -1);
            } else {
                var34 = new LocEntity(var12, arg1, arg3, field51, var11, var10, 10, true, var13, var15.field984);
            }
            if (var34 != null) {
                int var35 = 0;
                if (arg4 == 11) {
                    var35 += 256;
                }
                int var36;
                int var37;
                if (arg1 == 1 || arg1 == 3) {
                    var36 = var15.field977;
                    var37 = var15.field976;
                } else {
                    var36 = var15.field976;
                    var37 = var15.field977;
                }
                if (arg8.method74(arg7, arg6, arg2, var14, field46, var36, var34, var37, var35, var16, var17) && var15.field992) {
                    Model var38;
                    if (var34 instanceof Model) {
                        var38 = (Model) var34;
                    } else {
                        var38 = var15.method340(10, arg1, var10, var11, var12, var13, -1);
                    }
                    if (var38 != null) {
                        for (int var39 = 0; var39 <= var36; var39++) {
                            for (int var40 = 0; var40 <= var37; var40++) {
                                int var41 = var38.field587 / 4;
                                if (var41 > 30) {
                                    var41 = 30;
                                }
                                if (var41 > this.field62[arg2][arg6 + var39][arg7 + var40]) {
                                    this.field62[arg2][arg6 + var39][arg7 + var40] = (byte) var41;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field978 && arg0 != null) {
                arg0.method363(arg1, 0, arg7, var15.field977, var15.field976, var15.field979, arg6);
            }
        } else if (arg4 >= 12) {
            Entity var19;
            if (var15.field984 == -1) {
                var19 = var15.method340(arg4, arg1, var10, var11, var12, var13, -1);
            } else {
                var19 = new LocEntity(var12, arg1, arg3, field51, var11, var10, arg4, true, var13, var15.field984);
            }
            arg8.method74(arg7, arg6, arg2, var14, field46, 1, var19, 1, 0, var16, var17);
            if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg2 > 0) {
                this.field69[arg2][arg6][arg7] |= 0x924;
            }
            if (var15.field978 && arg0 != null) {
                arg0.method363(arg1, 0, arg7, var15.field977, var15.field976, var15.field979, arg6);
            }
        } else if (arg4 == 0) {
            Entity var20;
            if (var15.field984 == -1) {
                var20 = var15.method340(0, arg1, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(var12, arg1, arg3, field51, var11, var10, 0, true, var13, var15.field984);
            }
            arg8.method72(0, null, var17, var16, arg6, field70[arg1], var20, arg7, (byte) 4, arg2, var14);
            if (arg1 == 0) {
                if (var15.field992) {
                    this.field62[arg2][arg6][arg7] = 50;
                    this.field62[arg2][arg6][arg7 + 1] = 50;
                }
                if (var15.field983) {
                    this.field69[arg2][arg6][arg7] |= 0x249;
                }
            } else if (arg1 == 1) {
                if (var15.field992) {
                    this.field62[arg2][arg6][arg7 + 1] = 50;
                    this.field62[arg2][arg6 + 1][arg7 + 1] = 50;
                }
                if (var15.field983) {
                    this.field69[arg2][arg6][arg7 + 1] |= 0x492;
                }
            } else if (arg1 == 2) {
                if (var15.field992) {
                    this.field62[arg2][arg6 + 1][arg7] = 50;
                    this.field62[arg2][arg6 + 1][arg7 + 1] = 50;
                }
                if (var15.field983) {
                    this.field69[arg2][arg6 + 1][arg7] |= 0x249;
                }
            } else if (arg1 == 3) {
                if (var15.field992) {
                    this.field62[arg2][arg6][arg7] = 50;
                    this.field62[arg2][arg6 + 1][arg7] = 50;
                }
                if (var15.field983) {
                    this.field69[arg2][arg6][arg7] |= 0x492;
                }
            }
            if (var15.field978 && arg0 != null) {
                arg0.method362(arg7, var15.field979, arg4, arg6, 709, arg1);
            }
            if (var15.field985 != 16) {
                arg8.method80(arg6, var15.field985, arg2, -133, arg7);
            }
        } else if (arg4 == 1) {
            Entity var21;
            if (var15.field984 == -1) {
                var21 = var15.method340(1, arg1, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(var12, arg1, arg3, field51, var11, var10, 1, true, var13, var15.field984);
            }
            arg8.method72(0, null, var17, var16, arg6, field71[arg1], var21, arg7, (byte) 4, arg2, var14);
            if (var15.field992) {
                if (arg1 == 0) {
                    this.field62[arg2][arg6][arg7 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field62[arg2][arg6 + 1][arg7 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field62[arg2][arg6 + 1][arg7] = 50;
                } else if (arg1 == 3) {
                    this.field62[arg2][arg6][arg7] = 50;
                }
            }
            if (var15.field978 && arg0 != null) {
                arg0.method362(arg7, var15.field979, arg4, arg6, 709, arg1);
            }
        } else if (arg4 == 2) {
            int var22 = arg1 + 1 & 0x3;
            Entity var23;
            Entity var24;
            if (var15.field984 == -1) {
                var23 = var15.method340(2, arg1 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method340(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new LocEntity(var12, arg1 + 4, arg3, field51, var11, var10, 2, true, var13, var15.field984);
                var24 = new LocEntity(var12, var22, arg3, field51, var11, var10, 2, true, var13, var15.field984);
            }
            arg8.method72(field70[var22], var24, var17, var16, arg6, field70[arg1], var23, arg7, (byte) 4, arg2, var14);
            if (var15.field983) {
                if (arg1 == 0) {
                    this.field69[arg2][arg6][arg7] |= 0x249;
                    this.field69[arg2][arg6][arg7 + 1] |= 0x492;
                } else if (arg1 == 1) {
                    this.field69[arg2][arg6][arg7 + 1] |= 0x492;
                    this.field69[arg2][arg6 + 1][arg7] |= 0x249;
                } else if (arg1 == 2) {
                    this.field69[arg2][arg6 + 1][arg7] |= 0x249;
                    this.field69[arg2][arg6][arg7] |= 0x492;
                } else if (arg1 == 3) {
                    this.field69[arg2][arg6][arg7] |= 0x492;
                    this.field69[arg2][arg6][arg7] |= 0x249;
                }
            }
            if (var15.field978 && arg0 != null) {
                arg0.method362(arg7, var15.field979, arg4, arg6, 709, arg1);
            }
            if (var15.field985 != 16) {
                arg8.method80(arg6, var15.field985, arg2, -133, arg7);
            }
        } else if (arg4 == 3) {
            Entity var25;
            if (var15.field984 == -1) {
                var25 = var15.method340(3, arg1, var10, var11, var12, var13, -1);
            } else {
                var25 = new LocEntity(var12, arg1, arg3, field51, var11, var10, 3, true, var13, var15.field984);
            }
            arg8.method72(0, null, var17, var16, arg6, field71[arg1], var25, arg7, (byte) 4, arg2, var14);
            if (var15.field992) {
                if (arg1 == 0) {
                    this.field62[arg2][arg6][arg7 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field62[arg2][arg6 + 1][arg7 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field62[arg2][arg6 + 1][arg7] = 50;
                } else if (arg1 == 3) {
                    this.field62[arg2][arg6][arg7] = 50;
                }
            }
            if (var15.field978 && arg0 != null) {
                arg0.method362(arg7, var15.field979, arg4, arg6, 709, arg1);
            }
        } else if (arg4 == 9) {
            Entity var26;
            if (var15.field984 == -1) {
                var26 = var15.method340(arg4, arg1, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(var12, arg1, arg3, field51, var11, var10, arg4, true, var13, var15.field984);
            }
            arg8.method74(arg7, arg6, arg2, var14, field46, 1, var26, 1, 0, var16, var17);
            if (var15.field978 && arg0 != null) {
                arg0.method363(arg1, 0, arg7, var15.field977, var15.field976, var15.field979, arg6);
            }
        } else if (arg4 == 4) {
            Entity var27;
            if (var15.field984 == -1) {
                var27 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var27 = new LocEntity(var12, 0, arg3, field51, var11, var10, 4, true, var13, var15.field984);
            }
            arg8.method73(0, var17, var14, var16, field70[arg1], arg2, 0, field45, arg7, arg1 * 512, var27, arg6);
        } else if (arg4 == 5) {
            int var28 = 16;
            int var29 = arg8.method90(arg2, arg6, arg7);
            if (var29 > 0) {
                var28 = LocType.method334(var29 >> 14 & 0x7FFF).field985;
            }
            Entity var30;
            if (var15.field984 == -1) {
                var30 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var30 = new LocEntity(var12, 0, arg3, field51, var11, var10, 4, true, var13, var15.field984);
            }
            arg8.method73(field72[arg1] * var28, var17, var14, var16, field70[arg1], arg2, field73[arg1] * var28, field45, arg7, arg1 * 512, var30, arg6);
        } else if (arg4 == 6) {
            Entity var31;
            if (var15.field984 == -1) {
                var31 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var31 = new LocEntity(var12, 0, arg3, field51, var11, var10, 4, true, var13, var15.field984);
            }
            arg8.method73(0, var17, var14, var16, 256, arg2, 0, field45, arg7, arg1, var31, arg6);
        } else if (arg4 == 7) {
            Entity var32;
            if (var15.field984 == -1) {
                var32 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var32 = new LocEntity(var12, 0, arg3, field51, var11, var10, 4, true, var13, var15.field984);
            }
            arg8.method73(0, var17, var14, var16, 512, arg2, 0, field45, arg7, arg1, var32, arg6);
        } else if (arg4 == 8) {
            Entity var33;
            if (var15.field984 == -1) {
                var33 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var33 = new LocEntity(var12, 0, arg3, field51, var11, var10, 4, true, var13, var15.field984);
            }
            arg8.method73(0, var17, var14, var16, 768, arg2, 0, field45, arg7, arg1, var33, arg6);
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(BLs;[Ljc;)V")
    public final void method20(byte arg0, World3D arg1, CollisionMap[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field57[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field57[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method364(var111, var110, 475);
                        }
                    }
                }
            }
        }
        field74 += (int) (Math.random() * 5.0D) - 2;
        if (arg0 != 6) {
            field46 = !field46;
        }
        if (field74 < -8) {
            field74 = -8;
        }
        if (field74 > 8) {
            field74 = 8;
        }
        field75 += (int) (Math.random() * 5.0D) - 2;
        if (field75 < -16) {
            field75 = -16;
        }
        if (field75 > 16) {
            field75 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field62[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field55 - 1; var56++) {
                for (int var101 = 1; var101 < this.field54 - 1; var101++) {
                    int var102 = this.field56[var5][var101 + 1][var56] - this.field56[var5][var101 - 1][var56];
                    int var103 = this.field56[var5][var101][var56 + 1] - this.field56[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field63[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field55; var57++) {
                this.field64[var57] = 0;
                this.field65[var57] = 0;
                this.field66[var57] = 0;
                this.field67[var57] = 0;
                this.field68[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field54 + 5; var58++) {
                for (int var61 = 0; var61 < this.field55; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field54) {
                        int var96 = this.field58[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            FloType var97 = FloType.field1113[var96 - 1];
                            this.field64[var61] += var97.field1122;
                            this.field65[var61] += var97.field1120;
                            this.field66[var61] += var97.field1121;
                            this.field67[var61] += var97.field1123;
                            var10002 = this.field68[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field54) {
                        int var99 = this.field58[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.field1113[var99 - 1];
                            this.field64[var61] -= var100.field1122;
                            this.field65[var61] -= var100.field1120;
                            this.field66[var61] -= var100.field1121;
                            this.field67[var61] -= var100.field1123;
                            var10002 = this.field68[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field54 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field55 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field55) {
                            var62 += this.field64[var68];
                            var63 += this.field65[var68];
                            var64 += this.field66[var68];
                            var65 += this.field67[var68];
                            var66 += this.field68[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field55) {
                            var62 -= this.field64[var69];
                            var63 -= this.field65[var69];
                            var64 -= this.field66[var69];
                            var65 -= this.field67[var69];
                            var66 -= this.field68[var69];
                        }
                        if (var67 >= 1 && var67 < this.field55 - 1 && (!field52 || (this.field57[var5][var58][var67] & 0x10) == 0 && this.method21(var5, 0, var58, var67) == field53)) {
                            int var70 = this.field58[var5][var58][var67] & 0xFF;
                            int var71 = this.field59[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field56[var5][var58][var67];
                                int var73 = this.field56[var5][var58 + 1][var67];
                                int var74 = this.field56[var5][var58 + 1][var67 + 1];
                                int var75 = this.field56[var5][var58][var67 + 1];
                                int var76 = this.field63[var58][var67];
                                int var77 = this.field63[var58 + 1][var67];
                                int var78 = this.field63[var58 + 1][var67 + 1];
                                int var79 = this.field63[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method29(var82, var83, var84);
                                    int var85 = field74 + var82 & 0xFF;
                                    int var86 = field75 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method29(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field60[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !FloType.field1113[var71 - 1].field1117) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field69[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Pix3D.field678[method27(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method69(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field60[var5][var58][var67] + 1;
                                    byte var90 = this.field61[var5][var58][var67];
                                    FloType var91 = FloType.field1113[var71 - 1];
                                    int var92 = var91.field1115;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Pix3D.method183(12151, var92);
                                        var94 = -1;
                                    } else if (var91.field1114 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method29(var91.field1119, var91.field1120, var91.field1121);
                                        var93 = Pix3D.field678[this.method28(var91.field1124, 96)];
                                    }
                                    arg1.method69(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), this.method28(var94, var76), this.method28(var94, var77), this.method28(var94, var78), this.method28(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field55 - 1; var59++) {
                for (int var60 = 1; var60 < this.field54 - 1; var60++) {
                    arg1.method68(var5, var60, var59, this.method21(var5, 0, var60, var59));
                }
            }
        }
        arg1.method95(-10, 64, -50, this.field47, -50, 768);
        for (int var6 = 0; var6 < this.field54; var6++) {
            for (int var47 = 0; var47 < this.field55; var47++) {
                if ((this.field57[1][var6][var47] & 0x2) == 2) {
                    arg1.method66(var47, -866, var6);
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
                for (int var12 = 0; var12 <= this.field55; var12++) {
                    for (int var13 = 0; var13 <= this.field54; var13++) {
                        if ((this.field69[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field69[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field55 && (this.field69[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label331: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field69[var16 - 1][var13][var18] & var7) == 0) {
                                        break label331;
                                    }
                                }
                                var16--;
                            }
                            label320: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field69[var17 + 1][var13][var19] & var7) == 0) {
                                        break label320;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field56[var17][var13][var14] - var21;
                                int var23 = this.field56[var16][var13][var14];
                                World3D.method67(-33546, var13 * 128, var10, var14 * 128, var23, var22, 1, var13 * 128, var15 * 128 + 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field69[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field69[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field69[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field54 && (this.field69[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label384: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field69[var28 - 1][var30][var12] & var8) == 0) {
                                        break label384;
                                    }
                                }
                                var28--;
                            }
                            label373: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field69[var29 + 1][var31][var12] & var8) == 0) {
                                        break label373;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field56[var29][var26][var12] - var33;
                                int var35 = this.field56[var28][var26][var12];
                                World3D.method67(-33546, var27 * 128 + 128, var10, var12 * 128, var35, var34, 2, var26 * 128, var12 * 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field69[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field69[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field69[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field55 && (this.field69[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label437: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field69[var11][var38 - 1][var42] & var9) == 0) {
                                        break label437;
                                    }
                                }
                                var38--;
                            }
                            label426: while (var39 < this.field54) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field69[var11][var39 + 1][var43] & var9) == 0) {
                                        break label426;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field56[var11][var38][var40];
                                World3D.method67(-33546, var39 * 128 + 128, var10, var40 * 128, var44, var44, 4, var38 * 128, var41 * 128 + 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field69[var11][var45][var46] &= ~var9;
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
        if (arg1 != 0) {
            this.field44 = !this.field44;
        }
        if ((this.field57[arg0][arg2][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (this.field57[1][arg2][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
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
        int var4 = 65536 - Pix3D.field667[arg2 * 1024 / arg3] >> 1;
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
        if (arg0 != 83) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        LocType var4 = LocType.method334(arg1);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var4.method337(7332, arg2);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Ljc;Ls;IZIII[[[IIII)V")
    public static final void method31(CollisionMap arg0, World3D arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int[][][] arg7, int arg8, int arg9, int arg10) {
        int var11 = arg7[arg6][arg5][arg4];
        int var12 = arg7[arg6][arg5 + 1][arg4];
        int var13 = arg7[arg6][arg5 + 1][arg4 + 1];
        int var14 = arg7[arg6][arg5][arg4 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        if (!arg3) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
        LocType var17 = LocType.method334(arg8);
        int var18 = (arg8 << 14) + (arg4 << 7) + arg5 + 1073741824;
        if (!var17.field980) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg10 << 6) + arg9);
        if (arg9 == 22) {
            Entity var20;
            if (var17.field984 == -1) {
                var20 = var17.method340(22, arg10, var11, var12, var13, var14, -1);
            } else {
                var20 = new LocEntity(var13, arg10, arg8, field51, var12, var11, 22, true, var14, var17.field984);
            }
            arg1.method70(arg2, var20, var15, 0, var18, var19, arg5, arg4);
            if (var17.field978 && var17.field980) {
                arg0.method364(arg4, arg5, 475);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            Entity var36;
            if (var17.field984 == -1) {
                var36 = var17.method340(10, arg10, var11, var12, var13, var14, -1);
            } else {
                var36 = new LocEntity(var13, arg10, arg8, field51, var12, var11, 10, true, var14, var17.field984);
            }
            if (var36 != null) {
                int var37 = 0;
                if (arg9 == 11) {
                    var37 += 256;
                }
                int var38;
                int var39;
                if (arg10 == 1 || arg10 == 3) {
                    var38 = var17.field977;
                    var39 = var17.field976;
                } else {
                    var38 = var17.field976;
                    var39 = var17.field977;
                }
                arg1.method74(arg4, arg5, arg2, var15, field46, var38, var36, var39, var37, var18, var19);
            }
            if (var17.field978) {
                arg0.method363(arg10, 0, arg4, var17.field977, var17.field976, var17.field979, arg5);
            }
        } else if (arg9 >= 12) {
            Entity var21;
            if (var17.field984 == -1) {
                var21 = var17.method340(arg9, arg10, var11, var12, var13, var14, -1);
            } else {
                var21 = new LocEntity(var13, arg10, arg8, field51, var12, var11, arg9, true, var14, var17.field984);
            }
            arg1.method74(arg4, arg5, arg2, var15, field46, 1, var21, 1, 0, var18, var19);
            if (var17.field978) {
                arg0.method363(arg10, 0, arg4, var17.field977, var17.field976, var17.field979, arg5);
            }
        } else if (arg9 == 0) {
            Entity var22;
            if (var17.field984 == -1) {
                var22 = var17.method340(0, arg10, var11, var12, var13, var14, -1);
            } else {
                var22 = new LocEntity(var13, arg10, arg8, field51, var12, var11, 0, true, var14, var17.field984);
            }
            arg1.method72(0, null, var19, var18, arg5, field70[arg10], var22, arg4, (byte) 4, arg2, var15);
            if (var17.field978) {
                arg0.method362(arg4, var17.field979, arg9, arg5, 709, arg10);
            }
        } else if (arg9 == 1) {
            Entity var23;
            if (var17.field984 == -1) {
                var23 = var17.method340(1, arg10, var11, var12, var13, var14, -1);
            } else {
                var23 = new LocEntity(var13, arg10, arg8, field51, var12, var11, 1, true, var14, var17.field984);
            }
            arg1.method72(0, null, var19, var18, arg5, field71[arg10], var23, arg4, (byte) 4, arg2, var15);
            if (var17.field978) {
                arg0.method362(arg4, var17.field979, arg9, arg5, 709, arg10);
            }
        } else if (arg9 == 2) {
            int var24 = arg10 + 1 & 0x3;
            Entity var25;
            Entity var26;
            if (var17.field984 == -1) {
                var25 = var17.method340(2, arg10 + 4, var11, var12, var13, var14, -1);
                var26 = var17.method340(2, var24, var11, var12, var13, var14, -1);
            } else {
                var25 = new LocEntity(var13, arg10 + 4, arg8, field51, var12, var11, 2, true, var14, var17.field984);
                var26 = new LocEntity(var13, var24, arg8, field51, var12, var11, 2, true, var14, var17.field984);
            }
            arg1.method72(field70[var24], var26, var19, var18, arg5, field70[arg10], var25, arg4, (byte) 4, arg2, var15);
            if (var17.field978) {
                arg0.method362(arg4, var17.field979, arg9, arg5, 709, arg10);
            }
        } else if (arg9 == 3) {
            Entity var27;
            if (var17.field984 == -1) {
                var27 = var17.method340(3, arg10, var11, var12, var13, var14, -1);
            } else {
                var27 = new LocEntity(var13, arg10, arg8, field51, var12, var11, 3, true, var14, var17.field984);
            }
            arg1.method72(0, null, var19, var18, arg5, field71[arg10], var27, arg4, (byte) 4, arg2, var15);
            if (var17.field978) {
                arg0.method362(arg4, var17.field979, arg9, arg5, 709, arg10);
            }
        } else if (arg9 == 9) {
            Entity var28;
            if (var17.field984 == -1) {
                var28 = var17.method340(arg9, arg10, var11, var12, var13, var14, -1);
            } else {
                var28 = new LocEntity(var13, arg10, arg8, field51, var12, var11, arg9, true, var14, var17.field984);
            }
            arg1.method74(arg4, arg5, arg2, var15, field46, 1, var28, 1, 0, var18, var19);
            if (var17.field978) {
                arg0.method363(arg10, 0, arg4, var17.field977, var17.field976, var17.field979, arg5);
            }
        } else if (arg9 == 4) {
            Entity var29;
            if (var17.field984 == -1) {
                var29 = var17.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var29 = new LocEntity(var13, 0, arg8, field51, var12, var11, 4, true, var14, var17.field984);
            }
            arg1.method73(0, var19, var15, var18, field70[arg10], arg2, 0, field45, arg4, arg10 * 512, var29, arg5);
        } else if (arg9 == 5) {
            int var30 = 16;
            int var31 = arg1.method90(arg2, arg5, arg4);
            if (var31 > 0) {
                var30 = LocType.method334(var31 >> 14 & 0x7FFF).field985;
            }
            Entity var32;
            if (var17.field984 == -1) {
                var32 = var17.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var32 = new LocEntity(var13, 0, arg8, field51, var12, var11, 4, true, var14, var17.field984);
            }
            arg1.method73(field72[arg10] * var30, var19, var15, var18, field70[arg10], arg2, field73[arg10] * var30, field45, arg4, arg10 * 512, var32, arg5);
        } else if (arg9 == 6) {
            Entity var33;
            if (var17.field984 == -1) {
                var33 = var17.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var33 = new LocEntity(var13, 0, arg8, field51, var12, var11, 4, true, var14, var17.field984);
            }
            arg1.method73(0, var19, var15, var18, 256, arg2, 0, field45, arg4, arg10, var33, arg5);
        } else if (arg9 == 7) {
            Entity var34;
            if (var17.field984 == -1) {
                var34 = var17.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var34 = new LocEntity(var13, 0, arg8, field51, var12, var11, 4, true, var14, var17.field984);
            }
            arg1.method73(0, var19, var15, var18, 512, arg2, 0, field45, arg4, arg10, var34, arg5);
        } else if (arg9 == 8) {
            Entity var35;
            if (var17.field984 == -1) {
                var35 = var17.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var35 = new LocEntity(var13, 0, arg8, field51, var12, var11, 4, true, var14, var17.field984);
            }
            arg1.method73(0, var19, var15, var18, 768, arg2, 0, field45, arg4, arg10, var35, arg5);
        }
    }
}
