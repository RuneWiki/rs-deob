import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class68 extends class74 {

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    private int field1068 = 0;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    private int field1071 = 0;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    private int field1070 = 0;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "[I")
    public static int[] field1083 = new int[14];

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "J")
    public static long field1084 = 0L;

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "I")
    public static int field1087 = 0;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
    private int field1085;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "[[[I")
    public static int[][][] field1079;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        ++field1072;
        if (arg1 >= -112) {
            method532((byte) 60);
        }
        int[][] var3 = super.field1248.method269(false, arg0);
        if (super.field1248.field550) {
            int[][] var4 = this.method592(arg0, 0, 75);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class178.field2662; ++var11) {
                this.method536(var5[var11], 5361, var6[var11], var7[var11]);
                this.field1088 += this.field1068;
                this.field1085 += this.field1071;
                while (~this.field1088 > -1) {
                    this.field1088 += 4096;
                }
                this.field1081 += this.field1070;
                while (~this.field1088 < -4097) {
                    this.field1088 -= 4096;
                }
                if (this.field1081 < 0) {
                    this.field1081 = 0;
                }
                if (~this.field1081 < -4097) {
                    this.field1081 = 4096;
                }
                if (this.field1085 < 0) {
                    this.field1085 = 0;
                }
                if (this.field1085 > 4096) {
                    this.field1085 = 4096;
                }
                this.method535(this.field1081, this.field1085, this.field1088, (byte) 50);
                var8[var11] = this.field1074;
                var9[var11] = this.field1077;
                var10[var11] = this.field1086;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method531(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -arg5 + arg0;
        int var10 = arg2 - arg8;
        int var11 = (arg1 - arg7 << 16) / var10;
        if (arg3 < -14) {
            int var12 = (-arg6 + arg4 << 16) / var9;
            ++field1078;
            class19.method168(arg2, arg7, arg6, 0, arg5, var12, arg0, 0, (byte) 38, var11, arg8);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg0 == -79) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field1071 = (arg1.method322((byte) 59) << 12) / 100;
                    }
                } else {
                    this.field1070 = (arg1.method322((byte) 12) << 12) / 100;
                }
            } else {
                this.field1068 = arg1.method306(arg0 + 146);
            }
            ++field1075;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
    public static void method532(byte arg0) {
        if (arg0 > -46) {
            method531(-83, -93, 29, (byte) -65, 125, 102, -23, -60, -74);
        }
        field1083 = null;
        field1079 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIB)I")
    public static final int method533(int arg0, int arg1, int arg2, byte arg3) {
        ++field1073;
        if (arg3 <= 16) {
            method534(11, (class37) null);
        }
        if (~arg0 >= ~arg2) {
            return ~arg1 <= ~arg2 ? arg2 : arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILf;)V")
    public static final void method534(int arg0, class37 arg1) {
        if (arg0 < 8) {
            method531(-119, -114, -17, (byte) -61, -74, -102, 78, 68, 59);
        }
        ++field1069;
        while (true) {
            while (~arg1.field583.length < ~arg1.field588) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (~arg1.method333((byte) -59) == -2) {
                    var4 = arg1.method333((byte) -59);
                    var3 = arg1.method333((byte) -59);
                    var2 = true;
                }
                int var5 = arg1.method333((byte) -59);
                int var6 = arg1.method333((byte) -59);
                int var7 = -(var6 * 64) - (-class197.field3093 - -1 - class221.field3453);
                int var8 = var5 * 64 + -class76.field1275;
                if (~var8 <= -1 && var7 - 63 >= 0 && ~(var8 + 63) > ~class188.field3010 && class221.field3453 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; ++var11) {
                        for (int var12 = 0; ~var12 > -65; ++var12) {
                            if (!var2 || ~var11 <= ~(var4 * 8) && ~var11 > ~(var4 * 8 + 8) && var12 >= var3 * 8 && var12 < var3 * 8 + 8) {
                                byte var13 = arg1.method322((byte) 77);
                                if (var13 != 0) {
                                    if (class50.field799[var9][var10] == null) {
                                        class50.field799[var9][var10] = new byte[4096];
                                    }
                                    class50.field799[var9][var10][(-var12 + 63 << 6) - -var11] = var13;
                                    byte var14 = arg1.method322((byte) 36);
                                    if (class288.field4530[var9][var10] == null) {
                                        class288.field4530[var9][var10] = new byte[4096];
                                    }
                                    class288.field4530[var9][var10][(-var12 + 63 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; (var2 ? 64 : 4096) > var15; ++var15) {
                        byte var16 = arg1.method322((byte) 112);
                        if (var16 != 0) {
                            ++arg1.field588;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIIB)V")
    private final void method535(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = 4 / ((arg3 - -61) / 54);
        int var6 = ~arg1 < -2049 ? arg0 + arg1 - (arg0 * arg1 >> 12) : (arg0 + 4096) * arg1 >> 12;
        if (var6 <= 0) {
            this.field1074 = this.field1077 = this.field1086 = arg1;
        } else {
            int var7 = arg2 * 6;
            int var8 = arg1 + arg1 + -var6;
            int var9 = (-var8 + var6 << 12) / var6;
            int var10 = var7 >> 12;
            int var12 = var7 - (var10 << 12);
            int var13 = var9 * var6 >> 12;
            int var14 = var12 * var13 >> 12;
            int var15 = var6 - var14;
            int var16 = var8 + var14;
            if (~var10 != -1) {
                if (var10 != 1) {
                    if (~var10 != -3) {
                        if (var10 != 3) {
                            if (~var10 != -5) {
                                if (~var10 == -6) {
                                    this.field1074 = var6;
                                    this.field1077 = var8;
                                    this.field1086 = var15;
                                }
                            } else {
                                this.field1074 = var16;
                                this.field1077 = var8;
                                this.field1086 = var6;
                            }
                        } else {
                            this.field1086 = var6;
                            this.field1074 = var8;
                            this.field1077 = var15;
                        }
                    } else {
                        this.field1074 = var8;
                        this.field1077 = var6;
                        this.field1086 = var16;
                    }
                } else {
                    this.field1077 = var6;
                    this.field1086 = var8;
                    this.field1074 = var15;
                }
            } else {
                this.field1074 = var6;
                this.field1077 = var16;
                this.field1086 = var8;
            }
        }
        ++field1067;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class68() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
    private final void method536(int arg0, int arg1, int arg2, int arg3) {
        ++field1082;
        int var5 = ~arg2 >= ~arg0 ? arg2 : arg0;
        int var6 = arg3 >= var5 ? var5 : arg3;
        int var7 = arg2 >= arg0 ? arg2 : arg0;
        int var8 = arg3 <= var7 ? var7 : arg3;
        int var9 = var8 - var6;
        this.field1085 = (var6 + var8) / 2;
        if (arg1 != 5361) {
            field1087 = -122;
        }
        if (this.field1085 > 0 && this.field1085 < 4096) {
            this.field1081 = (var9 << 12) / (this.field1085 > 2048 ? 8192 - this.field1085 * 2 : this.field1085 * 2);
        } else {
            this.field1081 = 0;
        }
        if (var9 > 0) {
            int var10 = (-arg0 + var8 << 12) / var9;
            int var11 = (-arg3 + var8 << 12) / var9;
            int var12 = (-arg2 + var8 << 12) / var9;
            if (arg0 == var8) {
                this.field1088 = arg2 != var6 ? -var12 + 4096 : var11 + 20480;
            } else if (~arg2 == ~var8) {
                this.field1088 = ~arg3 == ~var6 ? 4096 - -var10 : -var11 + 12288;
            } else {
                this.field1088 = arg0 == var6 ? var12 + 12288 : -var10 + 20480;
            }
            this.field1088 /= 6;
        } else {
            this.field1088 = 0;
        }
    }
}
