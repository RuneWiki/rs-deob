import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class85 extends class346 {

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    private int field1169 = 0;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    private int field1174 = 0;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    private int field1178 = 16;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    private int field1182 = 2000;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    private int field1176 = 4096;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "[Z")
    public static boolean[] field1168 = new boolean[8];

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "Z")
    public static boolean field1171 = false;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "[I")
    public static int[] field1172 = new int[13];

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "[[S")
    public static short[][] field1179 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    public static int field1183 = 0;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public final void method237(byte arg0) {
        ++field1180;
        class431.method2689(256);
        if (arg0 >= -95) {
            this.method45(-128, 99);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V")
    public static final void method691(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class157.field1981 <= arg2 && class312.field4602 >= arg2) {
            int var5 = class400.method2567(class240.field3368, class136.field1769, (byte) 127, arg0);
            int var6 = class400.method2567(class240.field3368, class136.field1769, (byte) -103, arg3);
            class169.method1130(var6, arg4, arg2, true, var5);
        }
        int var7 = -121 / ((arg1 - -72) / 38);
        ++field1181;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(II)Ljava/lang/String;")
    public static final String method692(int arg0, int arg1) {
        ++field1177;
        if (~arg1 > -100001) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class353.field5233 + "</col>";
        } else {
            if (arg0 != 0) {
                method691(-95, 46, -92, -68, 37);
            }
            return "<col=00ff80>" + arg1 / 1000000 + class118.field1531 + "</col>";
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public static final void method693(int arg0) {
        class4.field71 = new class248[class237.field3317.method1222(true)][];
        ++field1166;
        if (arg0 != 0) {
            field1172 = null;
        }
        class77.field1080 = new boolean[class237.field3317.method1222(true)];
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V")
    public static void method694(int arg0) {
        field1168 = null;
        field1179 = null;
        if (arg0 != 0) {
            method691(-110, -95, 14, 61, 59);
        }
        field1172 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field1170;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            int var4 = this.field1176 >> 1;
            int[][] var5 = super.field5152.method1414((byte) -123);
            Random var6 = new Random((long) this.field1174);
            for (int var7 = 0; ~this.field1182 < ~var7; ++var7) {
                int var8 = this.field1176 > 0 ? -var4 + this.field1169 + class9.method67(this.field1176, -1, var6) : this.field1169;
                int var9 = (var8 & 4093) >> 4;
                int var10 = class9.method67(class134.field1753, arg1 + -4, var6);
                int var11 = class9.method67(class370.field5474, -1, var6);
                int var12 = var10 - -(class72.field1021[var9] * this.field1178 >> 12);
                int var13 = (class238.field3323[var9] * this.field1178 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class9.method67(4096, arg1 + -4, var6) >> 2);
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = var13 > var11 ? 1 : -1;
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = var28 & class188.field2572;
                        int var31 = class215.field3000 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var21 += var27;
                            var24 -= var22;
                        }
                    }
                }
            }
        }
        if (arg1 != 3) {
            field1183 = -66;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BLjava/lang/String;III)I")
    public static final int method695(int arg0, byte[] arg1, String arg2, int arg3, int arg4, int arg5) {
        ++field1175;
        int var6 = -arg5 + arg4;
        if (arg3 >= -76) {
            field1183 = -50;
        }
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            char var8 = arg2.charAt(arg5 + var7);
            if (var8 > 0 && var8 < 128 || var8 >= 160 && var8 <= 255) {
                arg1[arg0 + var7] = (byte) var8;
            } else if (var8 == 8364) {
                arg1[arg0 - -var7] = -128;
            } else if (~var8 != -8219) {
                if (var8 != 402) {
                    if (~var8 != -8223) {
                        if (var8 == 8230) {
                            arg1[arg0 + var7] = -123;
                        } else if (~var8 != -8225) {
                            if (~var8 != -8226) {
                                if (~var8 == -711) {
                                    arg1[arg0 + var7] = -120;
                                } else if (~var8 == -8241) {
                                    arg1[arg0 + var7] = -119;
                                } else if (~var8 == -353) {
                                    arg1[arg0 + var7] = -118;
                                } else if (~var8 == -8250) {
                                    arg1[arg0 + var7] = -117;
                                } else if (~var8 != -339) {
                                    if (~var8 != -382) {
                                        if (var8 != 8216) {
                                            if (var8 == 8217) {
                                                arg1[arg0 + var7] = -110;
                                            } else if (~var8 == -8221) {
                                                arg1[arg0 + var7] = -109;
                                            } else if (~var8 == -8222) {
                                                arg1[arg0 + var7] = -108;
                                            } else if (var8 == 8226) {
                                                arg1[arg0 + var7] = -107;
                                            } else if (var8 != 8211) {
                                                if (var8 != 8212) {
                                                    if (~var8 == -733) {
                                                        arg1[arg0 + var7] = -104;
                                                    } else if (~var8 == -8483) {
                                                        arg1[arg0 + var7] = -103;
                                                    } else if (var8 == 353) {
                                                        arg1[arg0 - -var7] = -102;
                                                    } else if (var8 != 8250) {
                                                        if (~var8 == -340) {
                                                            arg1[arg0 + var7] = -100;
                                                        } else if (var8 == 382) {
                                                            arg1[arg0 + var7] = -98;
                                                        } else if (var8 == 376) {
                                                            arg1[arg0 + var7] = -97;
                                                        } else {
                                                            arg1[arg0 + var7] = 63;
                                                        }
                                                    } else {
                                                        arg1[arg0 - -var7] = -101;
                                                    }
                                                } else {
                                                    arg1[arg0 - -var7] = -105;
                                                }
                                            } else {
                                                arg1[arg0 + var7] = -106;
                                            }
                                        } else {
                                            arg1[arg0 - -var7] = -111;
                                        }
                                    } else {
                                        arg1[arg0 + var7] = -114;
                                    }
                                } else {
                                    arg1[arg0 - -var7] = -116;
                                }
                            } else {
                                arg1[arg0 + var7] = -121;
                            }
                        } else {
                            arg1[arg0 + var7] = -122;
                        }
                    } else {
                        arg1[arg0 + var7] = -124;
                    }
                } else {
                    arg1[arg0 + var7] = -125;
                }
            } else {
                arg1[arg0 + var7] = -126;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (~arg2 == -5) {
                                this.field1176 = arg0.method2239(-1076227960);
                            }
                        } else {
                            this.field1169 = arg0.method2239(-1076227960);
                        }
                    } else {
                        this.field1178 = arg0.method2233((byte) 104);
                    }
                } else {
                    this.field1182 = arg0.method2239(-1076227960);
                }
            } else {
                this.field1174 = arg0.method2233((byte) 104);
            }
            ++field1167;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class85() {
        super(0, true);
    }
}
