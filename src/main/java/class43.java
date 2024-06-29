import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QWSZQDKL")
public class class43 {

    @OriginalMember(owner = "client!QWSZQDKL", name = "i", descriptor = "[I")
    private int[] field1307 = new int[5];

    @OriginalMember(owner = "client!QWSZQDKL", name = "j", descriptor = "[I")
    private int[] field1308 = new int[5];

    @OriginalMember(owner = "client!QWSZQDKL", name = "k", descriptor = "[I")
    private int[] field1309 = new int[5];

    @OriginalMember(owner = "client!QWSZQDKL", name = "m", descriptor = "I")
    private int field1311 = 100;

    @OriginalMember(owner = "client!QWSZQDKL", name = "p", descriptor = "I")
    public int field1314 = 500;

    @OriginalMember(owner = "client!QWSZQDKL", name = "u", descriptor = "[I")
    private static int[] field1319 = new int[5];

    @OriginalMember(owner = "client!QWSZQDKL", name = "v", descriptor = "[I")
    private static int[] field1320 = new int[5];

    @OriginalMember(owner = "client!QWSZQDKL", name = "w", descriptor = "[I")
    private static int[] field1321 = new int[5];

    @OriginalMember(owner = "client!QWSZQDKL", name = "x", descriptor = "[I")
    private static int[] field1322 = new int[5];

    @OriginalMember(owner = "client!QWSZQDKL", name = "y", descriptor = "[I")
    private static int[] field1323 = new int[5];

    @OriginalMember(owner = "client!QWSZQDKL", name = "l", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client!QWSZQDKL", name = "q", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!QWSZQDKL", name = "a", descriptor = "LKEEMQUKU;")
    private class30 field1299;

    @OriginalMember(owner = "client!QWSZQDKL", name = "b", descriptor = "LKEEMQUKU;")
    private class30 field1300;

    @OriginalMember(owner = "client!QWSZQDKL", name = "c", descriptor = "LKEEMQUKU;")
    private class30 field1301;

    @OriginalMember(owner = "client!QWSZQDKL", name = "d", descriptor = "LKEEMQUKU;")
    private class30 field1302;

    @OriginalMember(owner = "client!QWSZQDKL", name = "e", descriptor = "LKEEMQUKU;")
    private class30 field1303;

    @OriginalMember(owner = "client!QWSZQDKL", name = "f", descriptor = "LKEEMQUKU;")
    private class30 field1304;

    @OriginalMember(owner = "client!QWSZQDKL", name = "g", descriptor = "LKEEMQUKU;")
    private class30 field1305;

    @OriginalMember(owner = "client!QWSZQDKL", name = "h", descriptor = "LKEEMQUKU;")
    private class30 field1306;

    @OriginalMember(owner = "client!QWSZQDKL", name = "o", descriptor = "LKEEMQUKU;")
    private class30 field1313;

    @OriginalMember(owner = "client!QWSZQDKL", name = "n", descriptor = "LOYVSGGSR;")
    private class40 field1312;

    @OriginalMember(owner = "client!QWSZQDKL", name = "r", descriptor = "[I")
    private static int[] field1316;

    @OriginalMember(owner = "client!QWSZQDKL", name = "s", descriptor = "[I")
    private static int[] field1317;

    @OriginalMember(owner = "client!QWSZQDKL", name = "t", descriptor = "[I")
    private static int[] field1318;

    @OriginalMember(owner = "client!QWSZQDKL", name = "a", descriptor = "()V")
    public static final void method399() {
        field1317 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1317[var0] = 1;
            } else {
                field1317[var0] = -1;
            }
        }
        field1318 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1318[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1316 = new int[220500];
    }

    @OriginalMember(owner = "client!QWSZQDKL", name = "a", descriptor = "(II)[I")
    public final int[] method400(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1316[var3] = 0;
        }
        if (arg1 < 10) {
            return field1316;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1299.method274(0);
        this.field1300.method274(0);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1301 != null) {
            this.field1301.method274(0);
            this.field1302.method274(0);
            var6 = (int) ((double) (this.field1301.field1078 - this.field1301.field1077) * 32.768D / var4);
            var7 = (int) ((double) this.field1301.field1077 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1303 != null) {
            this.field1303.method274(0);
            this.field1304.method274(0);
            var9 = (int) ((double) (this.field1303.field1078 - this.field1303.field1077) * 32.768D / var4);
            var10 = (int) ((double) this.field1303.field1077 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1307[var12] != 0) {
                field1319[var12] = 0;
                field1320[var12] = (int) ((double) this.field1309[var12] * var4);
                field1321[var12] = (this.field1307[var12] << 14) / 100;
                field1322[var12] = (int) ((double) (this.field1299.field1078 - this.field1299.field1077) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1308[var12]) / var4);
                field1323[var12] = (int) ((double) this.field1299.field1077 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1299.method275((byte) 5, arg0);
            int var42 = this.field1300.method275((byte) 5, arg0);
            if (this.field1301 != null) {
                int var43 = this.field1301.method275((byte) 5, arg0);
                int var44 = this.field1302.method275((byte) 5, arg0);
                var41 += this.method401(var44, this.field1301.field1079, (byte) 73, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1303 != null) {
                int var45 = this.field1303.method275((byte) 5, arg0);
                int var46 = this.field1304.method275((byte) 5, arg0);
                var42 = var42 * ((this.method401(var46, this.field1303.field1079, (byte) 73, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1307[var47] != 0) {
                    int var48 = field1320[var47] + var13;
                    if (var48 < arg0) {
                        field1316[var48] += this.method401(field1321[var47] * var42 >> 15, this.field1299.field1079, (byte) 73, field1319[var47]);
                        field1319[var47] += (field1322[var47] * var41 >> 16) + field1323[var47];
                    }
                }
            }
        }
        if (this.field1305 != null) {
            this.field1305.method274(0);
            this.field1306.method274(0);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1305.method275((byte) 5, arg0);
                int var19 = this.field1306.method275((byte) 5, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1305.field1078 - this.field1305.field1077) * var18 >> 8) + this.field1305.field1077;
                } else {
                    var20 = ((this.field1305.field1078 - this.field1305.field1077) * var19 >> 8) + this.field1305.field1077;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1316[var17] = 0;
                }
            }
        }
        if (this.field1310 > 0 && this.field1311 > 0) {
            int var21 = (int) ((double) this.field1310 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1316[var22] += field1316[var22 - var21] * this.field1311 / 100;
            }
        }
        if (this.field1312.field1212[0] > 0 || this.field1312.field1212[1] > 0) {
            this.field1313.method274(0);
            int var23 = this.field1313.method275((byte) 5, arg0 + 1);
            int var24 = this.field1312.method326(1, 0, (float) var23 / 65536.0F);
            int var25 = this.field1312.method326(1, 1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1316[var24 + var26] * (long) class40.field1219 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1316[var24 + var26 - var38 - 1] * (long) class40.field1217[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1316[var26 - var39 - 1] * (long) class40.field1217[1][var39] >> 16);
                    }
                    field1316[var26] = var37;
                    var23 = this.field1313.method275((byte) 5, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1316[var24 + var26] * (long) class40.field1219 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1316[var24 + var26 - var35 - 1] * (long) class40.field1217[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1316[var26 - var36 - 1] * (long) class40.field1217[1][var36] >> 16);
                        }
                        field1316[var26] = var34;
                        var23 = this.field1313.method275((byte) 5, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1316[var24 + var26 - var31 - 1] * (long) class40.field1217[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1316[var26 - var32 - 1] * (long) class40.field1217[1][var32] >> 16);
                            }
                            field1316[var26] = var30;
                            this.field1313.method275((byte) 5, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1312.method326(1, 0, (float) var23 / 65536.0F);
                    var25 = this.field1312.method326(1, 1, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1316[var40] < -32768) {
                field1316[var40] = -32768;
            }
            if (field1316[var40] > 32767) {
                field1316[var40] = 32767;
            }
        }
        return field1316;
    }

    @OriginalMember(owner = "client!QWSZQDKL", name = "a", descriptor = "(IIBI)I")
    private final int method401(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 73) {
            return 0;
        } else if (arg1 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg1 == 2) {
            return field1318[arg3 & 0x7FFF] * arg0 >> 14;
        } else if (arg1 == 3) {
            return ((arg3 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg1 == 4) {
            return field1317[arg3 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!QWSZQDKL", name = "a", descriptor = "(LPQBRPYKE;Z)V")
    public final void method402(class41 arg0, boolean arg1) {
        this.field1299 = new class30();
        this.field1299.method272(arg0, false);
        this.field1300 = new class30();
        this.field1300.method272(arg0, false);
        int var3 = arg0.method340();
        if (var3 != 0) {
            arg0.field1241--;
            this.field1301 = new class30();
            this.field1301.method272(arg0, false);
            this.field1302 = new class30();
            this.field1302.method272(arg0, false);
        }
        int var4 = arg0.method340();
        if (var4 != 0) {
            arg0.field1241--;
            this.field1303 = new class30();
            this.field1303.method272(arg0, false);
            this.field1304 = new class30();
            this.field1304.method272(arg0, false);
        }
        int var5 = arg0.method340();
        if (var5 != 0) {
            arg0.field1241--;
            this.field1305 = new class30();
            this.field1305.method272(arg0, false);
            this.field1306 = new class30();
            this.field1306.method272(arg0, false);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method354();
            if (var7 == 0) {
                break;
            }
            this.field1307[var6] = var7;
            this.field1308[var6] = arg0.method353();
            this.field1309[var6] = arg0.method354();
        }
        this.field1310 = arg0.method354();
        if (arg1) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        this.field1311 = arg0.method354();
        this.field1314 = arg0.method342();
        this.field1315 = arg0.method342();
        this.field1312 = new class40();
        this.field1313 = new class30();
        this.field1312.method327(-609, arg0, this.field1313);
    }
}
