import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "c", descriptor = "I")
    private int field33 = -25580;

    @OriginalMember(owner = "c", name = "d", descriptor = "Z")
    private boolean field34 = true;

    @OriginalMember(owner = "c", name = "i", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "c", name = "j", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[I")
    private int[][][] field41;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field42;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field43;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field44;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field45;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[[B")
    private byte[][][] field46;

    @OriginalMember(owner = "c", name = "x", descriptor = "[[[I")
    private int[][][] field54;

    @OriginalMember(owner = "c", name = "q", descriptor = "[[[B")
    private byte[][][] field47;

    @OriginalMember(owner = "c", name = "r", descriptor = "[[I")
    private int[][] field48;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field49;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field50;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field51;

    @OriginalMember(owner = "c", name = "v", descriptor = "[I")
    private int[] field52;

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private int[] field53;

    @OriginalMember(owner = "c", name = "a", descriptor = "I")
    private static int field31 = -139;

    @OriginalMember(owner = "c", name = "e", descriptor = "I")
    private static int field35 = -369;

    @OriginalMember(owner = "c", name = "f", descriptor = "Z")
    public static boolean field36 = true;

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field55 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field56 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "A", descriptor = "[I")
    private static final int[] field57 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "B", descriptor = "[I")
    private static final int[] field58 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "C", descriptor = "I")
    private static int field59 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "c", name = "D", descriptor = "I")
    private static int field60 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "c", name = "b", descriptor = "Z")
    private static boolean field32;

    @OriginalMember(owner = "c", name = "h", descriptor = "Z")
    public static boolean field38;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "(I[[[I[[[BII)V")
    public World(int arg0, int[][][] arg1, byte[][][] arg2, int arg3, int arg4) {
        this.field39 = arg4;
        this.field40 = arg0;
        this.field41 = arg1;
        this.field42 = arg2;
        this.field43 = new byte[4][this.field39][this.field40];
        this.field44 = new byte[4][this.field39][this.field40];
        this.field45 = new byte[4][this.field39][this.field40];
        this.field46 = new byte[4][this.field39][this.field40];
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        this.field54 = new int[4][this.field39 + 1][this.field40 + 1];
        this.field47 = new byte[4][this.field39 + 1][this.field40 + 1];
        this.field48 = new int[this.field39 + 1][this.field40 + 1];
        this.field49 = new int[this.field40];
        this.field50 = new int[this.field40];
        this.field51 = new int[this.field40];
        this.field52 = new int[this.field40];
        this.field53 = new int[this.field40];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIBII)V")
    public final void method14(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 == 3) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        byte var8 = 0;
        for (int var9 = 0; var9 < FloType.field1035; var9++) {
            if (FloType.field1036[var9].field1041.equalsIgnoreCase("water")) {
                var8 = (byte) (var9 + 1);
                break;
            }
        }
        for (int var10 = arg1; var10 < arg1 + arg4; var10++) {
            for (int var11 = arg3; var11 < arg0 + arg3; var11++) {
                if (var11 >= 0 && var11 < this.field39 && var10 >= 0 && var10 < this.field40) {
                    this.field44[0][var11][var10] = var8;
                    for (int var12 = 0; var12 < 4; var12++) {
                        this.field41[var12][var11][var10] = 0;
                        this.field42[var12][var11][var10] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([BIIIII)V")
    public final void method15(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Packet var7 = new Packet(699, arg0);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg4 + var9;
                    int var12 = arg3 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field42[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method231();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field41[0][var11][var12] = -method22(var11 + arg5 + 932731, var12 + 556238 + arg1) * 8;
                                } else {
                                    this.field41[var8][var11][var12] = this.field41[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method231();
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
                                this.field44[var8][var11][var12] = var7.method232();
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
        if (arg2 != 0) {
            field32 = !field32;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method16(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        boolean var4 = true;
        Packet var5 = new Packet(699, arg1);
        int var6 = -1;
        label54: while (true) {
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
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method231() >> 2;
                    int var15 = arg2 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.method320(var6);
                        if (var14 != 22 || !field36 || var17.field924 || var17.field945) {
                            var4 &= var17.method324(-16491);
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lmb;Lvb;I)V")
    public static final void method17(Packet arg0, OnDemand arg1, int arg2) {
        while (arg2 >= 0) {
            field32 = !field32;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg0.method245();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            LocType var5 = LocType.method320(var3);
            var5.method325(arg1, 0);
            while (true) {
                int var6 = arg0.method245();
                if (var6 == 0) {
                    break;
                }
                arg0.method231();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([Lic;Ls;III[B)V")
    public final void method18(CollisionMap[] arg0, World3D arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        Packet var7 = new Packet(699, arg5);
        int var8 = -1;
        if (arg3 >= 0) {
            this.field34 = !this.field34;
        }
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
                int var19 = arg2 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field42[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    CollisionMap var21 = null;
                    if (var20 >= 0) {
                        var21 = arg0[var20];
                    }
                    this.method19(var16, -936, var8, var21, var14, var18, arg1, var17, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIILic;IILs;II)V")
    private final void method19(int arg0, int arg1, int arg2, CollisionMap arg3, int arg4, int arg5, World3D arg6, int arg7, int arg8) {
        if (field36) {
            if ((this.field42[arg4][arg5][arg8] & 0x10) != 0) {
                return;
            }
            if (this.method21(arg8, arg4, arg5, 0) != field37) {
                return;
            }
        }
        int var10 = this.field41[arg4][arg5][arg8];
        int var11 = this.field41[arg4][arg5 + 1][arg8];
        if (arg1 >= 0) {
            return;
        }
        int var12 = this.field41[arg4][arg5 + 1][arg8 + 1];
        int var13 = this.field41[arg4][arg5][arg8 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        LocType var15 = LocType.method320(arg2);
        int var16 = (arg2 << 14) + (arg8 << 7) + arg5 + 1073741824;
        if (!var15.field924) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg7 << 6) + arg0);
        if (arg0 == 22) {
            if (!field36 || var15.field924 || var15.field945) {
                Entity var18;
                if (var15.field928 == -1) {
                    var18 = var15.method326(22, arg7, var10, var11, var12, var13, -1);
                } else {
                    var18 = new LocEntity(var10, arg7, 214, var11, arg2, var12, var15.field928, true, 22, var13);
                }
                arg6.method68(var14, arg4, arg8, (byte) 5, var18, var17, arg5, var16);
                if (var15.field922 && var15.field924 && arg3 != null) {
                    arg3.method349(arg8, (byte) -12, arg5);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            Entity var34;
            if (var15.field928 == -1) {
                var34 = var15.method326(10, arg7, var10, var11, var12, var13, -1);
            } else {
                var34 = new LocEntity(var10, arg7, 214, var11, arg2, var12, var15.field928, true, 10, var13);
            }
            if (var34 != null) {
                int var35 = 0;
                if (arg0 == 11) {
                    var35 += 256;
                }
                int var36;
                int var37;
                if (arg7 == 1 || arg7 == 3) {
                    var36 = var15.field921;
                    var37 = var15.field920;
                } else {
                    var36 = var15.field920;
                    var37 = var15.field921;
                }
                if (arg6.method72(var16, 4, var36, arg5, arg8, arg4, var35, var14, var34, var37, var17) && var15.field937) {
                    Model var38;
                    if (var34 instanceof Model) {
                        var38 = (Model) var34;
                    } else {
                        var38 = var15.method326(10, arg7, var10, var11, var12, var13, -1);
                    }
                    if (var38 != null) {
                        for (int var39 = 0; var39 <= var36; var39++) {
                            for (int var40 = 0; var40 <= var37; var40++) {
                                int var41 = var38.field549 / 4;
                                if (var41 > 30) {
                                    var41 = 30;
                                }
                                if (var41 > this.field47[arg4][arg5 + var39][arg8 + var40]) {
                                    this.field47[arg4][arg5 + var39][arg8 + var40] = (byte) var41;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field922 && arg3 != null) {
                arg3.method348(var15.field923, var15.field921, arg8, false, arg7, arg5, var15.field920);
            }
        } else if (arg0 >= 12) {
            Entity var19;
            if (var15.field928 == -1) {
                var19 = var15.method326(arg0, arg7, var10, var11, var12, var13, -1);
            } else {
                var19 = new LocEntity(var10, arg7, 214, var11, arg2, var12, var15.field928, true, arg0, var13);
            }
            arg6.method72(var16, 4, 1, arg5, arg8, arg4, 0, var14, var19, 1, var17);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg4 > 0) {
                this.field54[arg4][arg5][arg8] |= 0x924;
            }
            if (var15.field922 && arg3 != null) {
                arg3.method348(var15.field923, var15.field921, arg8, false, arg7, arg5, var15.field920);
            }
        } else if (arg0 == 0) {
            Entity var20;
            if (var15.field928 == -1) {
                var20 = var15.method326(0, arg7, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(var10, arg7, 214, var11, arg2, var12, var15.field928, true, 0, var13);
            }
            arg6.method70(var16, 425, arg5, var17, field55[arg7], 0, arg8, null, arg4, var14, var20);
            if (arg7 == 0) {
                if (var15.field937) {
                    this.field47[arg4][arg5][arg8] = 50;
                    this.field47[arg4][arg5][arg8 + 1] = 50;
                }
                if (var15.field927) {
                    this.field54[arg4][arg5][arg8] |= 0x249;
                }
            } else if (arg7 == 1) {
                if (var15.field937) {
                    this.field47[arg4][arg5][arg8 + 1] = 50;
                    this.field47[arg4][arg5 + 1][arg8 + 1] = 50;
                }
                if (var15.field927) {
                    this.field54[arg4][arg5][arg8 + 1] |= 0x492;
                }
            } else if (arg7 == 2) {
                if (var15.field937) {
                    this.field47[arg4][arg5 + 1][arg8] = 50;
                    this.field47[arg4][arg5 + 1][arg8 + 1] = 50;
                }
                if (var15.field927) {
                    this.field54[arg4][arg5 + 1][arg8] |= 0x249;
                }
            } else if (arg7 == 3) {
                if (var15.field937) {
                    this.field47[arg4][arg5][arg8] = 50;
                    this.field47[arg4][arg5 + 1][arg8] = 50;
                }
                if (var15.field927) {
                    this.field54[arg4][arg5][arg8] |= 0x492;
                }
            }
            if (var15.field922 && arg3 != null) {
                arg3.method347(arg7, -146, var15.field923, arg8, arg0, arg5);
            }
            if (var15.field929 != 16) {
                arg6.method78(arg8, arg4, arg5, var15.field929, 0);
            }
        } else if (arg0 == 1) {
            Entity var21;
            if (var15.field928 == -1) {
                var21 = var15.method326(1, arg7, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(var10, arg7, 214, var11, arg2, var12, var15.field928, true, 1, var13);
            }
            arg6.method70(var16, 425, arg5, var17, field56[arg7], 0, arg8, null, arg4, var14, var21);
            if (var15.field937) {
                if (arg7 == 0) {
                    this.field47[arg4][arg5][arg8 + 1] = 50;
                } else if (arg7 == 1) {
                    this.field47[arg4][arg5 + 1][arg8 + 1] = 50;
                } else if (arg7 == 2) {
                    this.field47[arg4][arg5 + 1][arg8] = 50;
                } else if (arg7 == 3) {
                    this.field47[arg4][arg5][arg8] = 50;
                }
            }
            if (var15.field922 && arg3 != null) {
                arg3.method347(arg7, -146, var15.field923, arg8, arg0, arg5);
            }
        } else if (arg0 == 2) {
            int var22 = arg7 + 1 & 0x3;
            Entity var23;
            Entity var24;
            if (var15.field928 == -1) {
                var23 = var15.method326(2, arg7 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method326(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new LocEntity(var10, arg7 + 4, 214, var11, arg2, var12, var15.field928, true, 2, var13);
                var24 = new LocEntity(var10, var22, 214, var11, arg2, var12, var15.field928, true, 2, var13);
            }
            arg6.method70(var16, 425, arg5, var17, field55[arg7], field55[var22], arg8, var24, arg4, var14, var23);
            if (var15.field927) {
                if (arg7 == 0) {
                    this.field54[arg4][arg5][arg8] |= 0x249;
                    this.field54[arg4][arg5][arg8 + 1] |= 0x492;
                } else if (arg7 == 1) {
                    this.field54[arg4][arg5][arg8 + 1] |= 0x492;
                    this.field54[arg4][arg5 + 1][arg8] |= 0x249;
                } else if (arg7 == 2) {
                    this.field54[arg4][arg5 + 1][arg8] |= 0x249;
                    this.field54[arg4][arg5][arg8] |= 0x492;
                } else if (arg7 == 3) {
                    this.field54[arg4][arg5][arg8] |= 0x492;
                    this.field54[arg4][arg5][arg8] |= 0x249;
                }
            }
            if (var15.field922 && arg3 != null) {
                arg3.method347(arg7, -146, var15.field923, arg8, arg0, arg5);
            }
            if (var15.field929 != 16) {
                arg6.method78(arg8, arg4, arg5, var15.field929, 0);
            }
        } else if (arg0 == 3) {
            Entity var25;
            if (var15.field928 == -1) {
                var25 = var15.method326(3, arg7, var10, var11, var12, var13, -1);
            } else {
                var25 = new LocEntity(var10, arg7, 214, var11, arg2, var12, var15.field928, true, 3, var13);
            }
            arg6.method70(var16, 425, arg5, var17, field56[arg7], 0, arg8, null, arg4, var14, var25);
            if (var15.field937) {
                if (arg7 == 0) {
                    this.field47[arg4][arg5][arg8 + 1] = 50;
                } else if (arg7 == 1) {
                    this.field47[arg4][arg5 + 1][arg8 + 1] = 50;
                } else if (arg7 == 2) {
                    this.field47[arg4][arg5 + 1][arg8] = 50;
                } else if (arg7 == 3) {
                    this.field47[arg4][arg5][arg8] = 50;
                }
            }
            if (var15.field922 && arg3 != null) {
                arg3.method347(arg7, -146, var15.field923, arg8, arg0, arg5);
            }
        } else if (arg0 == 9) {
            Entity var26;
            if (var15.field928 == -1) {
                var26 = var15.method326(arg0, arg7, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(var10, arg7, 214, var11, arg2, var12, var15.field928, true, arg0, var13);
            }
            arg6.method72(var16, 4, 1, arg5, arg8, arg4, 0, var14, var26, 1, var17);
            if (var15.field922 && arg3 != null) {
                arg3.method348(var15.field923, var15.field921, arg8, false, arg7, arg5, var15.field920);
            }
        } else if (arg0 == 4) {
            Entity var27;
            if (var15.field928 == -1) {
                var27 = var15.method326(4, 0, var10, var11, var12, var13, -1);
            } else {
                var27 = new LocEntity(var10, 0, 214, var11, arg2, var12, var15.field928, true, 4, var13);
            }
            arg6.method71(arg4, 0, arg5, false, var17, arg8, field55[arg7], arg7 * 512, var27, 0, var14, var16);
        } else if (arg0 == 5) {
            int var28 = 16;
            int var29 = arg6.method88(arg4, arg5, arg8);
            if (var29 > 0) {
                var28 = LocType.method320(var29 >> 14 & 0x7FFF).field929;
            }
            Entity var30;
            if (var15.field928 == -1) {
                var30 = var15.method326(4, 0, var10, var11, var12, var13, -1);
            } else {
                var30 = new LocEntity(var10, 0, 214, var11, arg2, var12, var15.field928, true, 4, var13);
            }
            arg6.method71(arg4, field58[arg7] * var28, arg5, false, var17, arg8, field55[arg7], arg7 * 512, var30, field57[arg7] * var28, var14, var16);
        } else if (arg0 == 6) {
            Entity var31;
            if (var15.field928 == -1) {
                var31 = var15.method326(4, 0, var10, var11, var12, var13, -1);
            } else {
                var31 = new LocEntity(var10, 0, 214, var11, arg2, var12, var15.field928, true, 4, var13);
            }
            arg6.method71(arg4, 0, arg5, false, var17, arg8, 256, arg7, var31, 0, var14, var16);
        } else if (arg0 == 7) {
            Entity var32;
            if (var15.field928 == -1) {
                var32 = var15.method326(4, 0, var10, var11, var12, var13, -1);
            } else {
                var32 = new LocEntity(var10, 0, 214, var11, arg2, var12, var15.field928, true, 4, var13);
            }
            arg6.method71(arg4, 0, arg5, false, var17, arg8, 512, arg7, var32, 0, var14, var16);
        } else if (arg0 == 8) {
            Entity var33;
            if (var15.field928 == -1) {
                var33 = var15.method326(4, 0, var10, var11, var12, var13, -1);
            } else {
                var33 = new LocEntity(var10, 0, 214, var11, arg2, var12, var15.field928, true, 4, var13);
            }
            arg6.method71(arg4, 0, arg5, false, var17, arg8, 768, arg7, var33, 0, var14, var16);
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Ls;I[Lic;)V")
    public final void method20(World3D arg0, int arg1, CollisionMap[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field42[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field42[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method349(var111, (byte) -12, var110);
                        }
                    }
                }
            }
        }
        if (arg1 != 9) {
            field35 = 198;
        }
        if (field38) {
            field59 = 0;
            field60 = 0;
        } else {
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
                            FloType var97 = FloType.field1036[var96 - 1];
                            this.field49[var61] += var97.field1045;
                            this.field50[var61] += var97.field1043;
                            this.field51[var61] += var97.field1044;
                            this.field52[var61] += var97.field1046;
                            var10002 = this.field53[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field39) {
                        int var99 = this.field43[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.field1036[var99 - 1];
                            this.field49[var61] -= var100.field1045;
                            this.field50[var61] -= var100.field1043;
                            this.field51[var61] -= var100.field1044;
                            this.field52[var61] -= var100.field1046;
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
                        if (var67 >= 1 && var67 < this.field40 - 1 && (!field36 || (this.field42[var5][var58][var67] & 0x10) == 0 && this.method21(var67, var5, var58, 0) == field37)) {
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
                                    var80 = this.method29(var82, var83, var84);
                                    int var85 = field59 + var82 & 0xFF;
                                    int var86 = field60 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method29(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field45[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !FloType.field1036[var71 - 1].field1040) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field54[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Pix3D.field644[method27(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method67(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field45[var5][var58][var67] + 1;
                                    byte var90 = this.field46[var5][var58][var67];
                                    FloType var91 = FloType.field1036[var71 - 1];
                                    int var92 = var91.field1038;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Pix3D.method175(var92, true);
                                        var94 = -1;
                                    } else if (var91.field1037 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method29(var91.field1042, var91.field1043, var91.field1044);
                                        var93 = Pix3D.field644[this.method28(var91.field1047, 96)];
                                    }
                                    arg0.method67(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), this.method28(var94, var76), this.method28(var94, var77), this.method28(var94, var78), this.method28(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field40 - 1; var59++) {
                for (int var60 = 1; var60 < this.field39 - 1; var60++) {
                    arg0.method66(var5, var60, var59, this.method21(var59, var5, var60, 0));
                }
            }
        }
        if (!field38) {
            arg0.method93(-50, -10, 64, -25580, -50, 768);
        }
        for (int var6 = 0; var6 < this.field39; var6++) {
            for (int var47 = 0; var47 < this.field40; var47++) {
                if ((this.field42[1][var6][var47] & 0x2) == 2) {
                    arg0.method64(var6, var47, (byte) 4);
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
                            label337: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field54[var16 - 1][var13][var18] & var7) == 0) {
                                        break label337;
                                    }
                                }
                                var16--;
                            }
                            label326: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field54[var17 + 1][var13][var19] & var7) == 0) {
                                        break label326;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field41[var17][var13][var14] - var21;
                                int var23 = this.field41[var16][var13][var14];
                                World3D.method65(true, 1, var15 * 128 + 128, var13 * 128, var22, var23, var10, var14 * 128, var13 * 128);
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
                            label390: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field54[var28 - 1][var30][var12] & var8) == 0) {
                                        break label390;
                                    }
                                }
                                var28--;
                            }
                            label379: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field54[var29 + 1][var31][var12] & var8) == 0) {
                                        break label379;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field41[var29][var26][var12] - var33;
                                int var35 = this.field41[var28][var26][var12];
                                World3D.method65(true, 2, var12 * 128, var26 * 128, var34, var35, var10, var12 * 128, var27 * 128 + 128);
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
                            label443: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field54[var11][var38 - 1][var42] & var9) == 0) {
                                        break label443;
                                    }
                                }
                                var38--;
                            }
                            label432: while (var39 < this.field39) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field54[var11][var39 + 1][var43] & var9) == 0) {
                                        break label432;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field41[var11][var38][var40];
                                World3D.method65(true, 4, var41 * 128 + 128, var38 * 128, var44, var44, var10, var40 * 128, var39 * 128 + 128);
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIII)I")
    public int method21(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return this.field33;
        } else if ((this.field42[arg1][arg2][arg0] & 0x8) == 0) {
            return arg1 <= 0 || (this.field42[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
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
        int var4 = 65536 - Pix3D.field633[arg2 * 1024 / arg3] >> 1;
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(IZI)Z")
    public static final boolean method30(int arg0, boolean arg1, int arg2) {
        LocType var3 = LocType.method320(arg0);
        if (arg1) {
            field31 = 53;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method323(arg2, false);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lic;II[[[IIILs;BIII)V")
    public static final void method31(CollisionMap arg0, int arg1, int arg2, int[][][] arg3, int arg4, int arg5, World3D arg6, byte arg7, int arg8, int arg9, int arg10) {
        int var11 = arg3[arg4][arg10][arg1];
        int var12 = arg3[arg4][arg10 + 1][arg1];
        int var13 = arg3[arg4][arg10 + 1][arg1 + 1];
        int var14 = arg3[arg4][arg10][arg1 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method320(arg2);
        if (arg7 != 9) {
            field35 = -272;
        }
        int var17 = (arg2 << 14) + (arg1 << 7) + arg10 + 1073741824;
        if (!var16.field924) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg5 << 6) + arg9);
        if (arg9 == 22) {
            Entity var19;
            if (var16.field928 == -1) {
                var19 = var16.method326(22, arg5, var11, var12, var13, var14, -1);
            } else {
                var19 = new LocEntity(var11, arg5, 214, var12, arg2, var13, var16.field928, true, 22, var14);
            }
            arg6.method68(var15, arg8, arg1, (byte) 5, var19, var18, arg10, var17);
            if (var16.field922 && var16.field924) {
                arg0.method349(arg1, (byte) -12, arg10);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            Entity var35;
            if (var16.field928 == -1) {
                var35 = var16.method326(10, arg5, var11, var12, var13, var14, -1);
            } else {
                var35 = new LocEntity(var11, arg5, 214, var12, arg2, var13, var16.field928, true, 10, var14);
            }
            if (var35 != null) {
                int var36 = 0;
                if (arg9 == 11) {
                    var36 += 256;
                }
                int var37;
                int var38;
                if (arg5 == 1 || arg5 == 3) {
                    var37 = var16.field921;
                    var38 = var16.field920;
                } else {
                    var37 = var16.field920;
                    var38 = var16.field921;
                }
                arg6.method72(var17, 4, var37, arg10, arg1, arg8, var36, var15, var35, var38, var18);
            }
            if (var16.field922) {
                arg0.method348(var16.field923, var16.field921, arg1, false, arg5, arg10, var16.field920);
            }
        } else if (arg9 >= 12) {
            Entity var20;
            if (var16.field928 == -1) {
                var20 = var16.method326(arg9, arg5, var11, var12, var13, var14, -1);
            } else {
                var20 = new LocEntity(var11, arg5, 214, var12, arg2, var13, var16.field928, true, arg9, var14);
            }
            arg6.method72(var17, 4, 1, arg10, arg1, arg8, 0, var15, var20, 1, var18);
            if (var16.field922) {
                arg0.method348(var16.field923, var16.field921, arg1, false, arg5, arg10, var16.field920);
            }
        } else if (arg9 == 0) {
            Entity var21;
            if (var16.field928 == -1) {
                var21 = var16.method326(0, arg5, var11, var12, var13, var14, -1);
            } else {
                var21 = new LocEntity(var11, arg5, 214, var12, arg2, var13, var16.field928, true, 0, var14);
            }
            arg6.method70(var17, 425, arg10, var18, field55[arg5], 0, arg1, null, arg8, var15, var21);
            if (var16.field922) {
                arg0.method347(arg5, -146, var16.field923, arg1, arg9, arg10);
            }
        } else if (arg9 == 1) {
            Entity var22;
            if (var16.field928 == -1) {
                var22 = var16.method326(1, arg5, var11, var12, var13, var14, -1);
            } else {
                var22 = new LocEntity(var11, arg5, 214, var12, arg2, var13, var16.field928, true, 1, var14);
            }
            arg6.method70(var17, 425, arg10, var18, field56[arg5], 0, arg1, null, arg8, var15, var22);
            if (var16.field922) {
                arg0.method347(arg5, -146, var16.field923, arg1, arg9, arg10);
            }
        } else if (arg9 == 2) {
            int var23 = arg5 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var16.field928 == -1) {
                var24 = var16.method326(2, arg5 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method326(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new LocEntity(var11, arg5 + 4, 214, var12, arg2, var13, var16.field928, true, 2, var14);
                var25 = new LocEntity(var11, var23, 214, var12, arg2, var13, var16.field928, true, 2, var14);
            }
            arg6.method70(var17, 425, arg10, var18, field55[arg5], field55[var23], arg1, var25, arg8, var15, var24);
            if (var16.field922) {
                arg0.method347(arg5, -146, var16.field923, arg1, arg9, arg10);
            }
        } else if (arg9 == 3) {
            Entity var26;
            if (var16.field928 == -1) {
                var26 = var16.method326(3, arg5, var11, var12, var13, var14, -1);
            } else {
                var26 = new LocEntity(var11, arg5, 214, var12, arg2, var13, var16.field928, true, 3, var14);
            }
            arg6.method70(var17, 425, arg10, var18, field56[arg5], 0, arg1, null, arg8, var15, var26);
            if (var16.field922) {
                arg0.method347(arg5, -146, var16.field923, arg1, arg9, arg10);
            }
        } else if (arg9 == 9) {
            Entity var27;
            if (var16.field928 == -1) {
                var27 = var16.method326(arg9, arg5, var11, var12, var13, var14, -1);
            } else {
                var27 = new LocEntity(var11, arg5, 214, var12, arg2, var13, var16.field928, true, arg9, var14);
            }
            arg6.method72(var17, 4, 1, arg10, arg1, arg8, 0, var15, var27, 1, var18);
            if (var16.field922) {
                arg0.method348(var16.field923, var16.field921, arg1, false, arg5, arg10, var16.field920);
            }
        } else if (arg9 == 4) {
            Entity var28;
            if (var16.field928 == -1) {
                var28 = var16.method326(4, 0, var11, var12, var13, var14, -1);
            } else {
                var28 = new LocEntity(var11, 0, 214, var12, arg2, var13, var16.field928, true, 4, var14);
            }
            arg6.method71(arg8, 0, arg10, false, var18, arg1, field55[arg5], arg5 * 512, var28, 0, var15, var17);
        } else if (arg9 == 5) {
            int var29 = 16;
            int var30 = arg6.method88(arg8, arg10, arg1);
            if (var30 > 0) {
                var29 = LocType.method320(var30 >> 14 & 0x7FFF).field929;
            }
            Entity var31;
            if (var16.field928 == -1) {
                var31 = var16.method326(4, 0, var11, var12, var13, var14, -1);
            } else {
                var31 = new LocEntity(var11, 0, 214, var12, arg2, var13, var16.field928, true, 4, var14);
            }
            arg6.method71(arg8, field58[arg5] * var29, arg10, false, var18, arg1, field55[arg5], arg5 * 512, var31, field57[arg5] * var29, var15, var17);
        } else if (arg9 == 6) {
            Entity var32;
            if (var16.field928 == -1) {
                var32 = var16.method326(4, 0, var11, var12, var13, var14, -1);
            } else {
                var32 = new LocEntity(var11, 0, 214, var12, arg2, var13, var16.field928, true, 4, var14);
            }
            arg6.method71(arg8, 0, arg10, false, var18, arg1, 256, arg5, var32, 0, var15, var17);
        } else if (arg9 == 7) {
            Entity var33;
            if (var16.field928 == -1) {
                var33 = var16.method326(4, 0, var11, var12, var13, var14, -1);
            } else {
                var33 = new LocEntity(var11, 0, 214, var12, arg2, var13, var16.field928, true, 4, var14);
            }
            arg6.method71(arg8, 0, arg10, false, var18, arg1, 512, arg5, var33, 0, var15, var17);
        } else if (arg9 == 8) {
            Entity var34;
            if (var16.field928 == -1) {
                var34 = var16.method326(4, 0, var11, var12, var13, var14, -1);
            } else {
                var34 = new LocEntity(var11, 0, 214, var12, arg2, var13, var16.field928, true, 4, var14);
            }
            arg6.method71(arg8, 0, arg10, false, var18, arg1, 768, arg5, var34, 0, var15, var17);
        }
    }
}
