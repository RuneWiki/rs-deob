import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class83 extends class115 {

    @OriginalMember(owner = "client!h", name = "V", descriptor = "I")
    private int field1254 = 0;

    @OriginalMember(owner = "client!h", name = "fb", descriptor = "I")
    private int field1264 = 2;

    @OriginalMember(owner = "client!h", name = "hb", descriptor = "[S")
    private short[] field1266 = new short[512];

    @OriginalMember(owner = "client!h", name = "lb", descriptor = "I")
    private int field1270 = 1;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
    private int field1258 = 2048;

    @OriginalMember(owner = "client!h", name = "qb", descriptor = "[B")
    private byte[] field1275 = new byte[512];

    @OriginalMember(owner = "client!h", name = "pb", descriptor = "I")
    private int field1274 = 5;

    @OriginalMember(owner = "client!h", name = "jb", descriptor = "I")
    private int field1268 = 5;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "Lqe;")
    public static class168 field1256 = class66.method448("AUS", -116);

    @OriginalMember(owner = "client!h", name = "W", descriptor = "Lqe;")
    public static class168 field1255 = class66.method448("null", 122);

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "Lqe;")
    private static class168 field1261 = class66.method448("Loading)3)3)3", -122);

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "Lqe;")
    public static class168 field1259 = field1261;

    @OriginalMember(owner = "client!h", name = "db", descriptor = "Lqe;")
    public static class168 field1262 = class66.method448("<br>(X", 79);

    @OriginalMember(owner = "client!h", name = "nb", descriptor = "I")
    public static int field1272 = 1;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "Lqe;")
    public static class168 field1251 = class66.method448("zap", -109);

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!h", name = "eb", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!h", name = "gb", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!h", name = "kb", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!h", name = "mb", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!h", name = "ob", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!h", name = "rb", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!h", name = "ib", descriptor = "Lub;")
    public static class64 field1267;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "(I)I")
    public static final int method547(int arg0) {
        ++field1252;
        if (class194.field3383 == 3.0D) {
            return 37;
        } else if (arg0 > -97) {
            return -34;
        } else if (class194.field3383 == 4.0D) {
            return 50;
        } else {
            return class194.field3383 == 6.0D ? 75 : 100;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field1271;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field1268 = arg1.method758(true);
                                }
                            } else {
                                this.field1274 = arg1.method758(true);
                            }
                        } else {
                            this.field1270 = arg1.method758(true);
                        }
                    } else {
                        this.field1264 = arg1.method758(true);
                    }
                } else {
                    this.field1258 = arg1.method731(false);
                }
            } else {
                this.field1254 = arg1.method758(true);
            }
        } else {
            this.field1274 = this.field1268 = arg1.method758(true);
        }
        if (arg0 != 107) {
            this.method5(-126, (byte) 47);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method548(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1265;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = -arg3 + arg1;
        int var12 = -arg3 + arg7;
        int var13 = arg1 * arg1;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 - -var17;
        int var24 = var14 - (var21 + -1) * var18;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        if (arg0) {
            method547(-101);
        }
        int var29 = var16 << 2;
        int var30 = var14 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = (var22 - 3) * var20;
        int var34 = var19 * 3;
        int var35 = var30;
        int var36 = var29;
        int var37 = (arg7 + -1) * var27;
        if (~arg4 <= ~class222.field3811 && ~class196.field3402 <= ~arg4) {
            int[] var38 = class241.field4117[arg4];
            int var39 = class97.method639(arg6 - arg1, (byte) 12, class174.field3055, class249.field4314);
            int var40 = class97.method639(arg6 - -arg1, (byte) 12, class174.field3055, class249.field4314);
            int var41 = class97.method639(-var11 + arg6, (byte) 12, class174.field3055, class249.field4314);
            int var42 = class97.method639(arg6 + var11, (byte) 12, class174.field3055, class249.field4314);
            class232.method1501(arg5, var39, (byte) -108, var38, var41);
            class232.method1501(arg2, var41, (byte) -108, var38, var42);
            class232.method1501(arg5, var42, (byte) -108, var38, var40);
        }
        int var43 = (var12 + -1) * var28;
        while (var9 > 0) {
            if (var23 < 0) {
                while (~var23 > -1) {
                    ++var8;
                    var24 += var35;
                    var35 += var30;
                    var23 += var31;
                    var31 += var30;
                }
            }
            if (~var24 > -1) {
                ++var8;
                var24 += var35;
                var35 += var30;
                var23 += var31;
                var31 += var30;
            }
            boolean var44 = ~var9 >= ~var12;
            if (var44) {
                if (~var25 > -1) {
                    while (~var25 > -1) {
                        var25 += var34;
                        var26 += var36;
                        ++var10;
                        var36 += var29;
                        var34 += var29;
                    }
                }
                if (~var26 > -1) {
                    var25 += var34;
                    ++var10;
                    var34 += var29;
                    var26 += var36;
                    var36 += var29;
                }
                var25 += -var43;
                var26 += -var33;
                var43 -= var28;
                var33 -= var28;
            }
            var24 += -var32;
            --var9;
            int var45 = arg4 + var9;
            var32 -= var27;
            var23 += -var37;
            var37 -= var27;
            int var46 = -var9 + arg4;
            if (class222.field3811 <= var45 && ~var46 >= ~class196.field3402) {
                int var47 = class97.method639(arg6 - -var8, (byte) 12, class174.field3055, class249.field4314);
                int var48 = class97.method639(-var8 + arg6, (byte) 12, class174.field3055, class249.field4314);
                if (var44) {
                    int var49 = class97.method639(arg6 + var10, (byte) 12, class174.field3055, class249.field4314);
                    int var50 = class97.method639(-var10 + arg6, (byte) 12, class174.field3055, class249.field4314);
                    if (var46 >= class222.field3811) {
                        int[] var51 = class241.field4117[var46];
                        class232.method1501(arg5, var48, (byte) -108, var51, var50);
                        class232.method1501(arg2, var50, (byte) -108, var51, var49);
                        class232.method1501(arg5, var49, (byte) -108, var51, var47);
                    }
                    if (class196.field3402 >= var45) {
                        int[] var52 = class241.field4117[var45];
                        class232.method1501(arg5, var48, (byte) -108, var52, var50);
                        class232.method1501(arg2, var50, (byte) -108, var52, var49);
                        class232.method1501(arg5, var49, (byte) -108, var52, var47);
                    }
                } else {
                    if (~class222.field3811 >= ~var46) {
                        class232.method1501(arg5, var48, (byte) -108, class241.field4117[var46], var47);
                    }
                    if (class196.field3402 >= var45) {
                        class232.method1501(arg5, var48, (byte) -108, class241.field4117[var45], var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        ++field1250;
        if (arg1 <= 37) {
            method547(83);
        }
        int[] var3 = super.field1872.method182((byte) -107, arg0);
        if (super.field1872.field341) {
            int var4 = class170.field2963[arg0] * this.field1268 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class130.field2297; ++var7) {
                class99.field1574 = Integer.MAX_VALUE;
                class51.field698 = Integer.MAX_VALUE;
                class150.field2618 = Integer.MAX_VALUE;
                class71.field1090 = Integer.MAX_VALUE;
                int var8 = class193.field3367[var7] * this.field1274 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = this.field1275[255 & (var11 < this.field1268 ? var11 : -this.field1268 + var11)] & 255;
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = (255 & this.field1275[(~var14 <= ~this.field1274 ? -this.field1274 + var14 : var14) + var13 & 255]) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field1266[var15] + var8;
                        int var17 = -(var11 << 12) + -this.field1266[var27] + var4;
                        int var18 = this.field1270;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (var16 >= 0 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                var19 = ~var26 > ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 < class71.field1090) {
                            class99.field1574 = class51.field698;
                            class51.field698 = class150.field2618;
                            class150.field2618 = class71.field1090;
                            class71.field1090 = var19;
                        } else if (~class150.field2618 < ~var19) {
                            class99.field1574 = class51.field698;
                            class51.field698 = class150.field2618;
                            class150.field2618 = var19;
                        } else if (class51.field698 <= var19) {
                            if (var19 < class99.field1574) {
                                class99.field1574 = var19;
                            }
                        } else {
                            class99.field1574 = class51.field698;
                            class51.field698 = var19;
                        }
                    }
                }
                int var12 = this.field1264;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = class150.field2618 - class71.field1090;
                                }
                            } else {
                                var3[var7] = class99.field1574;
                            }
                        } else {
                            var3[var7] = class51.field698;
                        }
                    } else {
                        var3[var7] = class150.field2618;
                    }
                } else {
                    var3[var7] = class71.field1090;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BII)I")
    public static final int method549(byte arg0, int arg1, int arg2) {
        ++field1276;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (~arg1 <= -3) {
                if (arg1 > 126) {
                    arg1 = 126;
                }
            } else {
                arg1 = 2;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 127) * arg1 >> 7;
            if (~var3 > -3) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg0 >= -112) {
                field1255 = null;
            }
            return (65408 & arg2) + var3;
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    public final void method170(int arg0) {
        this.field1275 = class98.method641(-39, this.field1254);
        if (arg0 != 395462996) {
            method549((byte) 17, -55, -4);
        }
        this.method552(-128);
        ++field1273;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII[B[III)V")
    public static final void method550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7, int arg8, int arg9) {
        ++field1260;
        int var10 = -(arg9 >> 2);
        int var11 = -(arg9 & 3);
        for (int var12 = -arg0; ~var12 > -1; ++var12) {
            for (int var14 = var10; ~var14 > -1; ++var14) {
                if (arg6[arg4++] != 0) {
                    arg7[arg8++] = arg5;
                } else {
                    ++arg8;
                }
                if (arg6[arg4++] != 0) {
                    arg7[arg8++] = arg5;
                } else {
                    ++arg8;
                }
                if (arg6[arg4++] != 0) {
                    arg7[arg8++] = arg5;
                } else {
                    ++arg8;
                }
                if (~arg6[arg4++] == -1) {
                    ++arg8;
                } else {
                    arg7[arg8++] = arg5;
                }
            }
            for (int var15 = var11; ~var15 > -1; ++var15) {
                if (arg6[arg4++] == 0) {
                    ++arg8;
                } else {
                    arg7[arg8++] = arg5;
                }
            }
            arg4 += arg1;
            arg8 += arg3;
        }
        int var13 = -40 / ((arg2 - 51) / 39);
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "(I)V")
    public static void method551(int arg0) {
        field1259 = null;
        field1262 = null;
        if (arg0 < -100) {
            field1251 = null;
            field1261 = null;
            field1255 = null;
            field1267 = null;
            field1256 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "(I)V")
    private final void method552(int arg0) {
        ++field1257;
        Random var2 = new Random((long) this.field1254);
        if (arg0 >= -99) {
            this.field1254 = -85;
        }
        this.field1266 = new short[512];
        if (this.field1258 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field1266[var3] = (short) class163.method1056(var2, this.field1258, 99);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class83() {
        super(0, true);
    }
}
