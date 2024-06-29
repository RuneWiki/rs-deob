import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class588 extends class69 {

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[B")
    public byte[] field8285;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "[B")
    public byte[] field8295;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "[Lfk;")
    public class348[] field8289;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "[I")
    private int[] field8287;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "[Lgv;")
    public class47[] field8286;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "[B")
    public byte[] field8288;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "[S")
    public short[] field8297;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public int field8296;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field8292 = 0;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "[I")
    public static int[] field8293 = new int[250];

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field8291;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 7)
    public final void method3443(byte arg0) {
        if (arg0 != 24) {
            this.method3446(38, null, null, null);
        }
        this.field8287 = null;
        field8284++;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V", line = 19)
    public static void method3444(byte arg0) {
        field8293 = null;
        if (arg0 != -90) {
            method3444((byte) 26);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB[F)[F", line = 29)
    public static final float[] method3445(int arg0, byte arg1, float[] arg2) {
        field8290++;
        int var3 = -65 % ((26 - arg1) / 47);
        float[] var4 = new float[arg0];
        class335.method2122(arg2, 0, var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILig;[B[I)Z", line = 61)
    public final boolean method3446(int arg0, class141 arg1, byte[] arg2, int[] arg3) {
        field8294++;
        boolean var5 = true;
        int var6 = 0;
        class348 var7 = null;
        for (int var8 = arg0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field8287[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method934(arg3, var9 >> 2, (byte) -111);
                        } else {
                            var7 = arg1.method931(arg3, var9 >> 2, 0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field8289[var8] = var7;
                        this.field8287[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 122)
    public class588() {
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V", line = 124)
    public class588(byte[] arg0) {
        this.field8285 = new byte[128];
        this.field8295 = new byte[128];
        this.field8289 = new class348[128];
        this.field8287 = new int[128];
        this.field8286 = new class47[128];
        this.field8288 = new byte[128];
        this.field8297 = new short[128];
        class511 var2 = new class511(arg0);
        int var3;
        for (var3 = 0; var2.field6979[var2.field6962 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method3030(-25984);
        }
        var3++;
        var2.field6962++;
        int var6 = var2.field6962;
        var2.field6962 += var3;
        int var7;
        for (var7 = 0; var2.field6979[var2.field6962 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method3030(-25984);
        }
        var2.field6962++;
        var7++;
        int var10 = var2.field6962;
        var2.field6962 += var7;
        int var11;
        for (var11 = 0; var2.field6979[var2.field6962 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method3030(-25984);
        }
        var2.field6962++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method3013(-93);
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
        class47[] var18 = new class47[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class47 var102 = var18[var19] = new class47();
            int var103 = var2.method3013(48);
            if (var103 > 0) {
                var102.field525 = new byte[var103 * 2];
            }
            int var104 = var2.method3013(-125);
            if (var104 > 0) {
                var102.field523 = new byte[var104 * 2 + 2];
                var102.field523[1] = 64;
            }
        }
        int var20 = var2.method3013(90);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method3013(-100);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field6979[var2.field6962 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method3030(-25984);
        }
        var2.field6962++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method3013(-99);
            this.field8297[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method3013(90);
            this.field8297[var30] = (short) (this.field8297[var30] + (var29 << 8));
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
                var33 = var2.method3038(-112);
            }
            this.field8297[var34] = (short) (this.field8297[var34] + (class407.method2490(var33 - 1, 2) << 14));
            this.field8287[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field8287[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field6979[var6++] - 1;
                    if (var36 >= var4.length) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                }
                var35--;
                this.field8285[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field8287[var42] != 0) {
                if (var40 == 0) {
                    if (var8.length > var39) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                    var41 = var2.field6979[var10++] + 16 << 2;
                }
                var40--;
                this.field8288[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class47 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field8287[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                var43--;
                this.field8286[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var48 < var25.length) {
                    var47 = var25[var48++];
                } else {
                    var47 = -1;
                }
                if (this.field8287[var50] > 0) {
                    var49 = var2.method3013(122) + 1;
                }
            }
            this.field8295[var50] = (byte) var49;
            var47--;
        }
        this.field8296 = var2.method3013(-104) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class47 var99 = var18[var51];
            if (var99.field525 != null) {
                for (int var100 = 1; var100 < var99.field525.length; var100 += 2) {
                    var99.field525[var100] = var2.method3030(-25984);
                }
            }
            if (var99.field523 != null) {
                for (int var101 = 3; var101 < var99.field523.length - 2; var101 += 2) {
                    var99.field523[var101] = var2.method3030(-25984);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method3030(-25984);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method3030(-25984);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class47 var96 = var18[var54];
            if (var96.field523 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field523.length; var98 += 2) {
                    var97 = var97 + var2.method3013(-99) + 1;
                    var96.field523[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class47 var93 = var18[var55];
            if (var93.field525 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field525.length; var95 += 2) {
                    var94 = (var94 + var2.method3013(47)) + 1;
                    var93.field525[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method3013(-125);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method3013(-106) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field8295[var60] = (byte) (this.field8295[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class111.method809(var66, 2050419935, var64 - var58);
                    var66 += var65 - var59;
                    this.field8295[var67] = (byte) (this.field8295[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var61 += 2;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field8295[var63] = (byte) (this.field8295[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method3013(-125);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 += var2.method3013(-116) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field8288[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field8288[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class111.method809(var80, 2050419935, var78 - var71);
                    int var83 = (this.field8288[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field8288[var81] = (byte) var83;
                }
                var72 = var79;
                var74 += 2;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field8288[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field8288[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field521 = var2.method3013(103);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class47 var92 = var18[var86];
            if (var92.field525 != null) {
                var92.field529 = var2.method3013(89);
            }
            if (var92.field523 != null) {
                var92.field522 = var2.method3013(-113);
            }
            if (var92.field521 > 0) {
                var92.field526 = var2.method3013(89);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field519 = var2.method3013(-112);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class47 var91 = var18[var88];
            if (var91.field519 > 0) {
                var91.field528 = var2.method3013(-94);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class47 var90 = var18[var89];
            if (var90.field528 > 0) {
                var90.field520 = var2.method3013(9);
            }
        }
    }
}
