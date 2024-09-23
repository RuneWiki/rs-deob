import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "a", descriptor = "Z")
    private boolean field37 = true;

    @OriginalMember(owner = "c", name = "c", descriptor = "Z")
    private boolean field39 = false;

    @OriginalMember(owner = "c", name = "i", descriptor = "I")
    private int field45;

    @OriginalMember(owner = "c", name = "j", descriptor = "I")
    private int field46;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[I")
    private int[][][] field47;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field48;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field49;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field50;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field51;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[[B")
    private byte[][][] field52;

    @OriginalMember(owner = "c", name = "x", descriptor = "[[[I")
    private int[][][] field60;

    @OriginalMember(owner = "c", name = "q", descriptor = "[[[B")
    private byte[][][] field53;

    @OriginalMember(owner = "c", name = "r", descriptor = "[[I")
    private int[][] field54;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field55;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field57;

    @OriginalMember(owner = "c", name = "v", descriptor = "[I")
    private int[] field58;

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private int[] field59;

    @OriginalMember(owner = "c", name = "d", descriptor = "B")
    private static byte field40 = 5;

    @OriginalMember(owner = "c", name = "e", descriptor = "I")
    private static int field41 = -550;

    @OriginalMember(owner = "c", name = "f", descriptor = "Z")
    public static boolean field42 = true;

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field61 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field62 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "A", descriptor = "[I")
    private static final int[] field63 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "B", descriptor = "[I")
    private static final int[] field64 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "C", descriptor = "I")
    private static int field65 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "c", name = "D", descriptor = "I")
    private static int field66 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "c", name = "b", descriptor = "I")
    private static int field38;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "c", name = "h", descriptor = "Z")
    public static boolean field44;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "(II[[[BI[[[I)V")
    public World(int arg0, int arg1, byte[][][] arg2, int arg3, int[][][] arg4) {
        this.field45 = arg1;
        this.field46 = arg3;
        this.field47 = arg4;
        this.field48 = arg2;
        this.field49 = new byte[4][this.field45][this.field46];
        this.field50 = new byte[4][this.field45][this.field46];
        this.field51 = new byte[4][this.field45][this.field46];
        this.field52 = new byte[4][this.field45][this.field46];
        this.field60 = new int[4][this.field45 + 1][this.field46 + 1];
        this.field53 = new byte[4][this.field45 + 1][this.field46 + 1];
        if (arg0 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field54 = new int[this.field45 + 1][this.field46 + 1];
        this.field55 = new int[this.field46];
        this.field56 = new int[this.field46];
        this.field57 = new int[this.field46];
        this.field58 = new int[this.field46];
        this.field59 = new int[this.field46];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IZIII)V")
    public final void method14(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            this.field37 = !this.field37;
        }
        for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
            for (int var7 = arg0; var7 <= arg0 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field45 && var6 >= 0 && var6 < this.field46) {
                    this.field53[0][var7][var6] = 127;
                    if (arg0 == var7 && var7 > 0) {
                        this.field47[0][var7][var6] = this.field47[0][var7 - 1][var6];
                    }
                    if (arg0 + arg4 == var7 && var7 < this.field45 - 1) {
                        this.field47[0][var7][var6] = this.field47[0][var7 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field47[0][var7][var6] = this.field47[0][var7][var6 - 1];
                    }
                    if (arg2 + arg3 == var6 && var6 < this.field46 - 1) {
                        this.field47[0][var7][var6] = this.field47[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([BIIIIZ)V")
    public final void method15(byte[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (!arg5) {
            this.field39 = !this.field39;
        }
        Packet var7 = new Packet(arg0, 337);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg3 + var9;
                    int var12 = arg1 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field48[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method239();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field47[0][var11][var12] = -method22(var11 + arg4 + 932731, var12 + 556238 + arg2) * 8;
                                } else {
                                    this.field47[var8][var11][var12] = this.field47[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method239();
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
                                this.field50[var8][var11][var12] = var7.method240();
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

    @OriginalMember(owner = "c", name = "a", descriptor = "([BIIZ)Z")
    public static final boolean method16(byte[] arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            throw new NullPointerException();
        }
        boolean var4 = true;
        Packet var5 = new Packet(arg0, 337);
        int var6 = -1;
        label54: while (true) {
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
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method239() >> 2;
                    int var15 = arg2 + var13;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.method334(var6);
                        if (var14 != 22 || !field42 || var17.field945 || var17.field965) {
                            var4 &= var17.method338((byte) 28);
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lmb;Lvb;Z)V")
    public static final void method17(Packet arg0, OnDemand arg1, boolean arg2) {
        int var3 = -1;
        if (arg2) {
            return;
        }
        while (true) {
            int var4 = arg0.method253();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            LocType var5 = LocType.method334(var3);
            var5.method339(arg1, true);
            while (true) {
                int var6 = arg0.method253();
                if (var6 == 0) {
                    break;
                }
                arg0.method239();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Ls;III[Ljc;[B)V")
    public final void method18(World3D arg0, int arg1, int arg2, int arg3, CollisionMap[] arg4, byte[] arg5) {
        Packet var7 = new Packet(arg5, 337);
        if (arg3 != 5) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = -1;
        while (true) {
            int var10 = var7.method253();
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method253();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var7.method239();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg2 + var14;
                int var20 = arg1 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field48[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    CollisionMap var22 = null;
                    if (var21 >= 0) {
                        var22 = arg4[var21];
                    }
                    this.method19(var18, var9, var22, var20, var17, arg0, var19, -370, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IILjc;IILs;III)V")
    private final void method19(int arg0, int arg1, CollisionMap arg2, int arg3, int arg4, World3D arg5, int arg6, int arg7, int arg8) {
        if (field42) {
            if ((this.field48[arg8][arg6][arg3] & 0x10) != 0) {
                return;
            }
            if (this.method21(-936, arg3, arg6, arg8) != field43) {
                return;
            }
        }
        int var10 = this.field47[arg8][arg6][arg3];
        int var11 = this.field47[arg8][arg6 + 1][arg3];
        int var12 = this.field47[arg8][arg6 + 1][arg3 + 1];
        int var13 = this.field47[arg8][arg6][arg3 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        LocType var15 = LocType.method334(arg1);
        if (arg7 >= 0) {
            return;
        }
        int var16 = (arg1 << 14) + (arg3 << 7) + arg6 + 1073741824;
        if (!var15.field945) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg0 << 6) + arg4);
        if (arg4 == 22) {
            if (!field42 || var15.field945 || var15.field965) {
                Entity var18;
                if (var15.field949 == -1) {
                    var18 = var15.method340(22, arg0, var10, var11, var12, var13, -1);
                } else {
                    var18 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, arg0, arg1, 22);
                }
                arg5.method70(arg3, (byte) 8, var16, var18, var14, arg8, arg6, var17);
                if (var15.field943 && var15.field945 && arg2 != null) {
                    arg2.method364(false, arg3, arg6);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            Entity var34;
            if (var15.field949 == -1) {
                var34 = var15.method340(10, arg0, var10, var11, var12, var13, -1);
            } else {
                var34 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, arg0, arg1, 10);
            }
            if (var34 != null) {
                int var35 = 0;
                if (arg4 == 11) {
                    var35 += 256;
                }
                int var36;
                int var37;
                if (arg0 == 1 || arg0 == 3) {
                    var36 = var15.field942;
                    var37 = var15.field941;
                } else {
                    var36 = var15.field941;
                    var37 = var15.field942;
                }
                if (arg5.method74(var37, arg6, var35, arg8, var36, var34, arg3, var17, var16, var14, (byte) 22) && var15.field957) {
                    Model var38;
                    if (var34 instanceof Model) {
                        var38 = (Model) var34;
                    } else {
                        var38 = var15.method340(10, arg0, var10, var11, var12, var13, -1);
                    }
                    if (var38 != null) {
                        for (int var39 = 0; var39 <= var36; var39++) {
                            for (int var40 = 0; var40 <= var37; var40++) {
                                int var41 = var38.field568 / 4;
                                if (var41 > 30) {
                                    var41 = 30;
                                }
                                if (var41 > this.field53[arg8][arg6 + var39][arg3 + var40]) {
                                    this.field53[arg8][arg6 + var39][arg3 + var40] = (byte) var41;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field943 && arg2 != null) {
                arg2.method363(arg0, arg6, arg3, var15.field942, var15.field944, var15.field941, field38);
            }
        } else if (arg4 >= 12) {
            Entity var19;
            if (var15.field949 == -1) {
                var19 = var15.method340(arg4, arg0, var10, var11, var12, var13, -1);
            } else {
                var19 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, arg0, arg1, arg4);
            }
            arg5.method74(1, arg6, 0, arg8, 1, var19, arg3, var17, var16, var14, (byte) 22);
            if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg8 > 0) {
                this.field60[arg8][arg6][arg3] |= 0x924;
            }
            if (var15.field943 && arg2 != null) {
                arg2.method363(arg0, arg6, arg3, var15.field942, var15.field944, var15.field941, field38);
            }
        } else if (arg4 == 0) {
            Entity var20;
            if (var15.field949 == -1) {
                var20 = var15.method340(0, arg0, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, arg0, arg1, 0);
            }
            arg5.method72(0, arg3, field61[arg0], arg6, var16, arg8, var17, null, var14, -358, var20);
            if (arg0 == 0) {
                if (var15.field957) {
                    this.field53[arg8][arg6][arg3] = 50;
                    this.field53[arg8][arg6][arg3 + 1] = 50;
                }
                if (var15.field948) {
                    this.field60[arg8][arg6][arg3] |= 0x249;
                }
            } else if (arg0 == 1) {
                if (var15.field957) {
                    this.field53[arg8][arg6][arg3 + 1] = 50;
                    this.field53[arg8][arg6 + 1][arg3 + 1] = 50;
                }
                if (var15.field948) {
                    this.field60[arg8][arg6][arg3 + 1] |= 0x492;
                }
            } else if (arg0 == 2) {
                if (var15.field957) {
                    this.field53[arg8][arg6 + 1][arg3] = 50;
                    this.field53[arg8][arg6 + 1][arg3 + 1] = 50;
                }
                if (var15.field948) {
                    this.field60[arg8][arg6 + 1][arg3] |= 0x249;
                }
            } else if (arg0 == 3) {
                if (var15.field957) {
                    this.field53[arg8][arg6][arg3] = 50;
                    this.field53[arg8][arg6 + 1][arg3] = 50;
                }
                if (var15.field948) {
                    this.field60[arg8][arg6][arg3] |= 0x492;
                }
            }
            if (var15.field943 && arg2 != null) {
                arg2.method362(false, arg3, arg4, arg6, var15.field944, arg0);
            }
            if (var15.field950 != 16) {
                arg5.method80(var15.field950, arg8, arg3, (byte) 9, arg6);
            }
        } else if (arg4 == 1) {
            Entity var21;
            if (var15.field949 == -1) {
                var21 = var15.method340(1, arg0, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, arg0, arg1, 1);
            }
            arg5.method72(0, arg3, field62[arg0], arg6, var16, arg8, var17, null, var14, -358, var21);
            if (var15.field957) {
                if (arg0 == 0) {
                    this.field53[arg8][arg6][arg3 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field53[arg8][arg6 + 1][arg3 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field53[arg8][arg6 + 1][arg3] = 50;
                } else if (arg0 == 3) {
                    this.field53[arg8][arg6][arg3] = 50;
                }
            }
            if (var15.field943 && arg2 != null) {
                arg2.method362(false, arg3, arg4, arg6, var15.field944, arg0);
            }
        } else if (arg4 == 2) {
            int var22 = arg0 + 1 & 0x3;
            Entity var23;
            Entity var24;
            if (var15.field949 == -1) {
                var23 = var15.method340(2, arg0 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method340(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, arg0 + 4, arg1, 2);
                var24 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, var22, arg1, 2);
            }
            arg5.method72(field61[var22], arg3, field61[arg0], arg6, var16, arg8, var17, var24, var14, -358, var23);
            if (var15.field948) {
                if (arg0 == 0) {
                    this.field60[arg8][arg6][arg3] |= 0x249;
                    this.field60[arg8][arg6][arg3 + 1] |= 0x492;
                } else if (arg0 == 1) {
                    this.field60[arg8][arg6][arg3 + 1] |= 0x492;
                    this.field60[arg8][arg6 + 1][arg3] |= 0x249;
                } else if (arg0 == 2) {
                    this.field60[arg8][arg6 + 1][arg3] |= 0x249;
                    this.field60[arg8][arg6][arg3] |= 0x492;
                } else if (arg0 == 3) {
                    this.field60[arg8][arg6][arg3] |= 0x492;
                    this.field60[arg8][arg6][arg3] |= 0x249;
                }
            }
            if (var15.field943 && arg2 != null) {
                arg2.method362(false, arg3, arg4, arg6, var15.field944, arg0);
            }
            if (var15.field950 != 16) {
                arg5.method80(var15.field950, arg8, arg3, (byte) 9, arg6);
            }
        } else if (arg4 == 3) {
            Entity var25;
            if (var15.field949 == -1) {
                var25 = var15.method340(3, arg0, var10, var11, var12, var13, -1);
            } else {
                var25 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, arg0, arg1, 3);
            }
            arg5.method72(0, arg3, field62[arg0], arg6, var16, arg8, var17, null, var14, -358, var25);
            if (var15.field957) {
                if (arg0 == 0) {
                    this.field53[arg8][arg6][arg3 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field53[arg8][arg6 + 1][arg3 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field53[arg8][arg6 + 1][arg3] = 50;
                } else if (arg0 == 3) {
                    this.field53[arg8][arg6][arg3] = 50;
                }
            }
            if (var15.field943 && arg2 != null) {
                arg2.method362(false, arg3, arg4, arg6, var15.field944, arg0);
            }
        } else if (arg4 == 9) {
            Entity var26;
            if (var15.field949 == -1) {
                var26 = var15.method340(arg4, arg0, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, arg0, arg1, arg4);
            }
            arg5.method74(1, arg6, 0, arg8, 1, var26, arg3, var17, var16, var14, (byte) 22);
            if (var15.field943 && arg2 != null) {
                arg2.method363(arg0, arg6, arg3, var15.field942, var15.field944, var15.field941, field38);
            }
        } else if (arg4 == 4) {
            Entity var27;
            if (var15.field949 == -1) {
                var27 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var27 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, 0, arg1, 4);
            }
            arg5.method73(arg6, field61[arg0], var16, var14, arg3, var17, 0, (byte) 69, arg8, 0, arg0 * 512, var27);
        } else if (arg4 == 5) {
            int var28 = 16;
            int var29 = arg5.method90(arg8, arg6, arg3);
            if (var29 > 0) {
                var28 = LocType.method334(var29 >> 14 & 0x7FFF).field950;
            }
            Entity var30;
            if (var15.field949 == -1) {
                var30 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var30 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, 0, arg1, 4);
            }
            arg5.method73(arg6, field61[arg0], var16, var14, arg3, var17, field64[arg0] * var28, (byte) 69, arg8, field63[arg0] * var28, arg0 * 512, var30);
        } else if (arg4 == 6) {
            Entity var31;
            if (var15.field949 == -1) {
                var31 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var31 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, 0, arg1, 4);
            }
            arg5.method73(arg6, 256, var16, var14, arg3, var17, 0, (byte) 69, arg8, 0, arg0, var31);
        } else if (arg4 == 7) {
            Entity var32;
            if (var15.field949 == -1) {
                var32 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var32 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, 0, arg1, 4);
            }
            arg5.method73(arg6, 512, var16, var14, arg3, var17, 0, (byte) 69, arg8, 0, arg0, var32);
        } else if (arg4 == 8) {
            Entity var33;
            if (var15.field949 == -1) {
                var33 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var33 = new LocEntity(var10, true, var13, var15.field949, var11, field41, var12, 0, arg1, 4);
            }
            arg5.method73(arg6, 768, var16, var14, arg3, var17, 0, (byte) 69, arg8, 0, arg0, var33);
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([Ljc;Ls;Z)V")
    public final void method20(CollisionMap[] arg0, World3D arg1, boolean arg2) {
        if (!arg2) {
            this.field37 = !this.field37;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field48[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field48[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method364(false, var111, var110);
                        }
                    }
                }
            }
        }
        if (field44) {
            field65 = 0;
            field66 = 0;
        } else {
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
                            FloType var97 = FloType.field1073[var96 - 1];
                            this.field55[var61] += var97.field1082;
                            this.field56[var61] += var97.field1080;
                            this.field57[var61] += var97.field1081;
                            this.field58[var61] += var97.field1083;
                            var10002 = this.field59[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field45) {
                        int var99 = this.field49[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.field1073[var99 - 1];
                            this.field55[var61] -= var100.field1082;
                            this.field56[var61] -= var100.field1080;
                            this.field57[var61] -= var100.field1081;
                            this.field58[var61] -= var100.field1083;
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
                        if (var67 >= 1 && var67 < this.field46 - 1 && (!field42 || (this.field48[var5][var58][var67] & 0x10) == 0 && this.method21(-936, var67, var58, var5) == field43)) {
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
                                    if (var71 > 0 && !FloType.field1073[var71 - 1].field1077) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field60[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Pix3D.field664[method27(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method69(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field51[var5][var58][var67] + 1;
                                    byte var90 = this.field52[var5][var58][var67];
                                    FloType var91 = FloType.field1073[var71 - 1];
                                    int var92 = var91.field1075;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Pix3D.method183(9, var92);
                                        var94 = -1;
                                    } else if (var91.field1074 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method29(var91.field1079, var91.field1080, var91.field1081);
                                        var93 = Pix3D.field664[this.method28(var91.field1084, 96)];
                                    }
                                    arg1.method69(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), this.method28(var94, var76), this.method28(var94, var77), this.method28(var94, var78), this.method28(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field46 - 1; var59++) {
                for (int var60 = 1; var60 < this.field45 - 1; var60++) {
                    arg1.method68(var5, var60, var59, this.method21(-936, var59, var60, var5));
                }
            }
        }
        if (!field44) {
            arg1.method95(-50, false, -10, -50, 768, 64);
        }
        for (int var6 = 0; var6 < this.field45; var6++) {
            for (int var47 = 0; var47 < this.field46; var47++) {
                if ((this.field48[1][var6][var47] & 0x2) == 2) {
                    arg1.method66(var47, -751, var6);
                }
            }
        }
        if (field44) {
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
                            label342: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field60[var16 - 1][var13][var18] & var7) == 0) {
                                        break label342;
                                    }
                                }
                                var16--;
                            }
                            label331: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field60[var17 + 1][var13][var19] & var7) == 0) {
                                        break label331;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field47[var17][var13][var14] - var21;
                                int var23 = this.field47[var16][var13][var14];
                                World3D.method67(var15 * 128 + 128, 1, var23, true, var14 * 128, var22, var13 * 128, var10, var13 * 128);
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
                            label395: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field60[var28 - 1][var30][var12] & var8) == 0) {
                                        break label395;
                                    }
                                }
                                var28--;
                            }
                            label384: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field60[var29 + 1][var31][var12] & var8) == 0) {
                                        break label384;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field47[var29][var26][var12] - var33;
                                int var35 = this.field47[var28][var26][var12];
                                World3D.method67(var12 * 128, 2, var35, true, var12 * 128, var34, var27 * 128 + 128, var10, var26 * 128);
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
                            label448: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field60[var11][var38 - 1][var42] & var9) == 0) {
                                        break label448;
                                    }
                                }
                                var38--;
                            }
                            label437: while (var39 < this.field45) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field60[var11][var39 + 1][var43] & var9) == 0) {
                                        break label437;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field47[var11][var38][var40];
                                World3D.method67(var41 * 128 + 128, 4, var44, true, var40 * 128, var44, var39 * 128 + 128, var10, var38 * 128);
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
        if (arg0 >= 0) {
            return 4;
        } else if ((this.field48[arg3][arg2][arg1] & 0x8) == 0) {
            return arg3 <= 0 || (this.field48[1][arg2][arg1] & 0x2) == 0 ? arg3 : arg3 - 1;
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
        int var4 = 65536 - Pix3D.field653[arg2 * 1024 / arg3] >> 1;
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
        LocType var3 = LocType.method334(arg1);
        if (field40 != arg2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method337(arg0, 150);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([[[IILs;IILjc;IIIII)V")
    public static final void method31(int[][][] arg0, int arg1, World3D arg2, int arg3, int arg4, CollisionMap arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg0[arg3][arg4][arg10];
        int var12 = arg0[arg3][arg4 + 1][arg10];
        int var13 = arg0[arg3][arg4 + 1][arg10 + 1];
        int var14 = arg0[arg3][arg4][arg10 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method334(arg9);
        int var17 = (arg9 << 14) + (arg10 << 7) + arg4 + 1073741824;
        if (arg8 != 34324) {
            return;
        }
        if (!var16.field945) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg6 << 6) + arg1);
        if (arg1 == 22) {
            Entity var19;
            if (var16.field949 == -1) {
                var19 = var16.method340(22, arg6, var11, var12, var13, var14, -1);
            } else {
                var19 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, arg6, arg9, 22);
            }
            arg2.method70(arg10, (byte) 8, var17, var19, var15, arg7, arg4, var18);
            if (var16.field943 && var16.field945) {
                arg5.method364(false, arg10, arg4);
            }
        } else if (arg1 == 10 || arg1 == 11) {
            Entity var35;
            if (var16.field949 == -1) {
                var35 = var16.method340(10, arg6, var11, var12, var13, var14, -1);
            } else {
                var35 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, arg6, arg9, 10);
            }
            if (var35 != null) {
                int var36 = 0;
                if (arg1 == 11) {
                    var36 += 256;
                }
                int var37;
                int var38;
                if (arg6 == 1 || arg6 == 3) {
                    var37 = var16.field942;
                    var38 = var16.field941;
                } else {
                    var37 = var16.field941;
                    var38 = var16.field942;
                }
                arg2.method74(var38, arg4, var36, arg7, var37, var35, arg10, var18, var17, var15, (byte) 22);
            }
            if (var16.field943) {
                arg5.method363(arg6, arg4, arg10, var16.field942, var16.field944, var16.field941, field38);
            }
        } else if (arg1 >= 12) {
            Entity var20;
            if (var16.field949 == -1) {
                var20 = var16.method340(arg1, arg6, var11, var12, var13, var14, -1);
            } else {
                var20 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, arg6, arg9, arg1);
            }
            arg2.method74(1, arg4, 0, arg7, 1, var20, arg10, var18, var17, var15, (byte) 22);
            if (var16.field943) {
                arg5.method363(arg6, arg4, arg10, var16.field942, var16.field944, var16.field941, field38);
            }
        } else if (arg1 == 0) {
            Entity var21;
            if (var16.field949 == -1) {
                var21 = var16.method340(0, arg6, var11, var12, var13, var14, -1);
            } else {
                var21 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, arg6, arg9, 0);
            }
            arg2.method72(0, arg10, field61[arg6], arg4, var17, arg7, var18, null, var15, -358, var21);
            if (var16.field943) {
                arg5.method362(false, arg10, arg1, arg4, var16.field944, arg6);
            }
        } else if (arg1 == 1) {
            Entity var22;
            if (var16.field949 == -1) {
                var22 = var16.method340(1, arg6, var11, var12, var13, var14, -1);
            } else {
                var22 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, arg6, arg9, 1);
            }
            arg2.method72(0, arg10, field62[arg6], arg4, var17, arg7, var18, null, var15, -358, var22);
            if (var16.field943) {
                arg5.method362(false, arg10, arg1, arg4, var16.field944, arg6);
            }
        } else if (arg1 == 2) {
            int var23 = arg6 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var16.field949 == -1) {
                var24 = var16.method340(2, arg6 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method340(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, arg6 + 4, arg9, 2);
                var25 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, var23, arg9, 2);
            }
            arg2.method72(field61[var23], arg10, field61[arg6], arg4, var17, arg7, var18, var25, var15, -358, var24);
            if (var16.field943) {
                arg5.method362(false, arg10, arg1, arg4, var16.field944, arg6);
            }
        } else if (arg1 == 3) {
            Entity var26;
            if (var16.field949 == -1) {
                var26 = var16.method340(3, arg6, var11, var12, var13, var14, -1);
            } else {
                var26 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, arg6, arg9, 3);
            }
            arg2.method72(0, arg10, field62[arg6], arg4, var17, arg7, var18, null, var15, -358, var26);
            if (var16.field943) {
                arg5.method362(false, arg10, arg1, arg4, var16.field944, arg6);
            }
        } else if (arg1 == 9) {
            Entity var27;
            if (var16.field949 == -1) {
                var27 = var16.method340(arg1, arg6, var11, var12, var13, var14, -1);
            } else {
                var27 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, arg6, arg9, arg1);
            }
            arg2.method74(1, arg4, 0, arg7, 1, var27, arg10, var18, var17, var15, (byte) 22);
            if (var16.field943) {
                arg5.method363(arg6, arg4, arg10, var16.field942, var16.field944, var16.field941, field38);
            }
        } else if (arg1 == 4) {
            Entity var28;
            if (var16.field949 == -1) {
                var28 = var16.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var28 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, 0, arg9, 4);
            }
            arg2.method73(arg4, field61[arg6], var17, var15, arg10, var18, 0, (byte) 69, arg7, 0, arg6 * 512, var28);
        } else if (arg1 == 5) {
            int var29 = 16;
            int var30 = arg2.method90(arg7, arg4, arg10);
            if (var30 > 0) {
                var29 = LocType.method334(var30 >> 14 & 0x7FFF).field950;
            }
            Entity var31;
            if (var16.field949 == -1) {
                var31 = var16.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var31 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, 0, arg9, 4);
            }
            arg2.method73(arg4, field61[arg6], var17, var15, arg10, var18, field64[arg6] * var29, (byte) 69, arg7, field63[arg6] * var29, arg6 * 512, var31);
        } else if (arg1 == 6) {
            Entity var32;
            if (var16.field949 == -1) {
                var32 = var16.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var32 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, 0, arg9, 4);
            }
            arg2.method73(arg4, 256, var17, var15, arg10, var18, 0, (byte) 69, arg7, 0, arg6, var32);
        } else if (arg1 == 7) {
            Entity var33;
            if (var16.field949 == -1) {
                var33 = var16.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var33 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, 0, arg9, 4);
            }
            arg2.method73(arg4, 512, var17, var15, arg10, var18, 0, (byte) 69, arg7, 0, arg6, var33);
        } else if (arg1 == 8) {
            Entity var34;
            if (var16.field949 == -1) {
                var34 = var16.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var34 = new LocEntity(var11, true, var14, var16.field949, var12, field41, var13, 0, arg9, 4);
            }
            arg2.method73(arg4, 768, var17, var15, arg10, var18, 0, (byte) 69, arg7, 0, arg6, var34);
        }
    }
}
