import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class101 extends class418 {

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "[B")
    public byte[] field1328;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "[Lbe;")
    public class354[] field1331;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "[I")
    private int[] field1336;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "[S")
    public short[] field1329;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "[B")
    public byte[] field1337;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "[B")
    public byte[] field1338;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "[Lhh;")
    public class151[] field1341;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1327 = "flash2:";

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "J")
    public static long field1340 = 0L;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "[Z")
    public static boolean[] field1335 = new boolean[100];

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I[B)[B", line = 9)
    public static final byte[] method775(int arg0, byte[] arg1) {
        field1333++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class206.method1359(arg1, arg0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILfb;)Lqs;", line = 26)
    public static final class346 method776(int arg0, class341 arg1) {
        arg1.method2233((byte) 104);
        field1339++;
        int var2 = arg1.method2233((byte) 104);
        class346 var3 = class271.method1800(var2, (byte) -127);
        var3.field5165 = arg1.method2233((byte) 104);
        int var4 = arg1.method2233((byte) 104);
        for (int var5 = arg0; var5 < var4; var5++) {
            int var6 = arg1.method2233((byte) 104);
            var3.method38(arg1, false, var6);
        }
        var3.method237((byte) -110);
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V", line = 73)
    public final void method777(int arg0) {
        field1332++;
        this.field1336 = null;
        int var2 = 117 % ((63 - arg0) / 49);
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(Z)V", line = 87)
    public static void method778(boolean arg0) {
        field1327 = null;
        if (!arg0) {
            field1340 = -40L;
        }
        field1335 = null;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V", line = 100)
    public class101() {
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([B[ILeb;Z)Z", line = 103)
    public final boolean method779(byte[] arg0, int[] arg1, class386 arg2, boolean arg3) {
        field1334++;
        boolean var5 = arg3;
        int var6 = 0;
        class151 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field1336[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method2499(-1005623568, var9 >> 2, arg1);
                        } else {
                            var7 = arg2.method2502(arg1, var9 >> 2, -128);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1341[var8] = var7;
                        this.field1336[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "([B)V", line = 155)
    public class101(byte[] arg0) {
        this.field1328 = new byte[128];
        this.field1331 = new class354[128];
        this.field1336 = new int[128];
        this.field1329 = new short[128];
        this.field1337 = new byte[128];
        this.field1338 = new byte[128];
        this.field1341 = new class151[128];
        class341 var2 = new class341(arg0);
        int var3;
        for (var3 = 0; var2.field5042[var2.field5049 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2211(255);
        }
        var3++;
        var2.field5049++;
        int var6 = var2.field5049;
        var2.field5049 += var3;
        int var7;
        for (var7 = 0; var2.field5042[var2.field5049 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2211(255);
        }
        var2.field5049++;
        var7++;
        int var10 = var2.field5049;
        var2.field5049 += var7;
        int var11;
        for (var11 = 0; var2.field5042[var2.field5049 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2211(255);
        }
        var11++;
        var2.field5049++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method2233((byte) 104);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class354[] var18 = new class354[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class354 var102 = var18[var19] = new class354();
            int var103 = var2.method2233((byte) 104);
            if (var103 > 0) {
                var102.field5248 = new byte[var103 * 2];
            }
            int var104 = var2.method2233((byte) 104);
            if (var104 > 0) {
                var102.field5250 = new byte[var104 * 2 + 2];
                var102.field5250[1] = 64;
            }
        }
        int var20 = var2.method2233((byte) 104);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method2233((byte) 104);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field5042[var2.field5049 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method2211(255);
        }
        var2.field5049++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method2233((byte) 104);
            this.field1329[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method2233((byte) 104);
            this.field1329[var30] = (short) (this.field1329[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var32) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var2.method2259((byte) 83);
            }
            this.field1329[var34] = (short) (this.field1329[var34] + (class394.method2529(var33 - 1, 2) << 14));
            var31--;
            this.field1336[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1336[var38] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var35) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                    var37 = var2.field5042[var6++] - 1;
                }
                var36--;
                this.field1337[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1336[var42] != 0) {
                if (var39 == 0) {
                    if (var8.length > var40) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var2.field5042[var10++] + 16 << 2;
                }
                var39--;
                this.field1338[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class354 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1336[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 >= var12.length) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                var43--;
                this.field1331[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length <= var48) {
                    var47 = -1;
                } else {
                    var47 = var25[var48++];
                }
                if (this.field1336[var50] > 0) {
                    var49 = var2.method2233((byte) 104) + 1;
                }
            }
            var47--;
            this.field1328[var50] = (byte) var49;
        }
        this.field1330 = var2.method2233((byte) 104) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class354 var99 = var18[var51];
            if (var99.field5248 != null) {
                for (int var100 = 1; var100 < var99.field5248.length; var100 += 2) {
                    var99.field5248[var100] = var2.method2211(255);
                }
            }
            if (var99.field5250 != null) {
                for (int var101 = 3; var101 < (var99.field5250.length - 2); var101 += 2) {
                    var99.field5250[var101] = var2.method2211(255);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method2211(255);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method2211(255);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class354 var96 = var18[var54];
            if (var96.field5250 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field5250.length; var98 += 2) {
                    var97 = var97 + var2.method2233((byte) 104) + 1;
                    var96.field5250[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class354 var93 = var18[var55];
            if (var93.field5248 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field5248.length; var95 += 2) {
                    var94 = var94 + var2.method2233((byte) 104) + 1;
                    var93.field5248[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method2233((byte) 104);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method2233((byte) 104) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field1328[var60] = (byte) (this.field1328[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class108.method816(var66, (byte) 111, var64 - var58);
                    var66 += var65 - var59;
                    this.field1328[var67] = (byte) (this.field1328[var67] * var68 + 32 >> 6);
                }
                var61 += 2;
                var58 = var64;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field1328[var63] = (byte) (this.field1328[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method2233((byte) 104);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 += var2.method2233((byte) 104) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1338[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1338[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class108.method816(var80, (byte) 117, var78 - var71);
                    int var83 = (this.field1338[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field1338[var81] = (byte) var83;
                }
                var74 += 2;
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field1338[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1338[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field5255 = var2.method2233((byte) 104);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class354 var92 = var18[var86];
            if (var92.field5248 != null) {
                var92.field5253 = var2.method2233((byte) 104);
            }
            if (var92.field5250 != null) {
                var92.field5249 = var2.method2233((byte) 104);
            }
            if (var92.field5255 > 0) {
                var92.field5243 = var2.method2233((byte) 104);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field5251 = var2.method2233((byte) 104);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class354 var91 = var18[var88];
            if (var91.field5251 > 0) {
                var91.field5240 = var2.method2233((byte) 104);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class354 var90 = var18[var89];
            if (var90.field5240 > 0) {
                var90.field5244 = var2.method2233((byte) 104);
            }
        }
    }
}
