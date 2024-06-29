import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class315 extends class108 {

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "[B")
    public byte[] field4356;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "[S")
    public short[] field4361;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "[Lub;")
    public class369[] field4362;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "[Lti;")
    public class300[] field4363;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "[B")
    public byte[] field4354;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "[B")
    public byte[] field4355;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "[I")
    private int[] field4359;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public int field4360;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Lvt;")
    public static class344 field4353 = new class344("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "[Lfu;")
    public static class450[] field4364;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lrl;[IB[B)Z")
    public final boolean method1974(class633 arg0, int[] arg1, byte arg2, byte[] arg3) {
        field4358++;
        if (arg2 != -86) {
            return false;
        }
        boolean var5 = true;
        int var6 = 0;
        class300 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field4359[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method3658((byte) 42, arg1, var9 >> 2);
                        } else {
                            var7 = arg0.method3661(var9 >> 2, (byte) -123, arg1);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4363[var8] = var7;
                        this.field4359[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method1975(byte arg0) {
        field4353 = null;
        field4364 = null;
        if (arg0 >= -123) {
            field4365 = -42;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
    public final void method1976(byte arg0) {
        int var2 = -4 / ((arg0 - 50) / 53);
        field4357++;
        this.field4359 = null;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class315() {
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "([B)V")
    public class315(byte[] arg0) {
        this.field4356 = new byte[128];
        this.field4361 = new short[128];
        this.field4362 = new class369[128];
        this.field4363 = new class300[128];
        this.field4354 = new byte[128];
        this.field4355 = new byte[128];
        this.field4359 = new int[128];
        class551 var2 = new class551(arg0);
        int var3;
        for (var3 = 0; var2.field7693[var2.field7707 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method3051((byte) 123);
        }
        var3++;
        var2.field7707++;
        int var6 = var2.field7707;
        var2.field7707 += var3;
        int var7;
        for (var7 = 0; var2.field7693[var2.field7707 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method3051((byte) 111);
        }
        var2.field7707++;
        var7++;
        int var10 = var2.field7707;
        var2.field7707 += var7;
        int var11;
        for (var11 = 0; var2.field7693[var2.field7707 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method3051((byte) 111);
        }
        var11++;
        var2.field7707++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method3045(-128);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var105 <= var16) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class369[] var18 = new class369[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class369 var102 = var18[var19] = new class369();
            int var103 = var2.method3045(-128);
            if (var103 > 0) {
                var102.field5134 = new byte[var103 * 2];
            }
            int var104 = var2.method3045(-128);
            if (var104 > 0) {
                var102.field5142 = new byte[var104 * 2 + 2];
                var102.field5142[1] = 64;
            }
        }
        int var20 = var2.method3045(-125);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method3045(-127);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field7693[var2.field7707 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method3051((byte) 114);
        }
        var2.field7707++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method3045(-128);
            this.field4361[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method3045(-128);
            this.field4361[var30] = (short) (this.field4361[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 >= var25.length) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var2.method3081((byte) -48);
            }
            this.field4361[var34] = (short) (this.field4361[var34] + (class143.method783(var33 - 1, 2) << 14));
            this.field4359[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field4359[var38] != 0) {
                if (var36 == 0) {
                    var37 = var2.field7693[var6++] - 1;
                    if (var35 < var4.length) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field4354[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field4359[var42] != 0) {
                if (var39 == 0) {
                    if (var40 >= var8.length) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                    var41 = var2.field7693[var10++] + 16 << 2;
                }
                var39--;
                this.field4355[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class369 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field4359[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 < var12.length) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field4362[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var47 < var25.length) {
                    var48 = var25[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field4359[var50] > 0) {
                    var49 = var2.method3045(-125) + 1;
                }
            }
            this.field4356[var50] = (byte) var49;
            var48--;
        }
        this.field4360 = var2.method3045(-128) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class369 var99 = var18[var51];
            if (var99.field5134 != null) {
                for (int var100 = 1; var100 < var99.field5134.length; var100 += 2) {
                    var99.field5134[var100] = var2.method3051((byte) -83);
                }
            }
            if (var99.field5142 != null) {
                for (int var101 = 3; var101 < var99.field5142.length - 2; var101 += 2) {
                    var99.field5142[var101] = var2.method3051((byte) -74);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method3051((byte) 82);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method3051((byte) -60);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class369 var96 = var18[var54];
            if (var96.field5142 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field5142.length; var98 += 2) {
                    var97 = var2.method3045(-128) + var97 + 1;
                    var96.field5142[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class369 var93 = var18[var55];
            if (var93.field5134 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field5134.length; var95 += 2) {
                    var94 = var2.method3045(-127) + var94 + 1;
                    var93.field5134[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method3045(-127);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method3045(-125) + (var56 + 1);
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field4356[var60] = (byte) (this.field4356[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class172.method1058(false, var66, var64 - var58);
                    var66 += var65 - var59;
                    this.field4356[var67] = (byte) (this.field4356[var67] * var68 + 32 >> 6);
                }
                var58 = var64;
                var61 += 2;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field4356[var62] = (byte) (this.field4356[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method3045(-125);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method3045(-127) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field4355[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field4355[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class172.method1058(false, var80, var78 - var71);
                    int var83 = (this.field4355[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field4355[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var71 = var78;
                var74 += 2;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field4355[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field4355[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field5137 = var2.method3045(-126);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class369 var92 = var18[var86];
            if (var92.field5134 != null) {
                var92.field5146 = var2.method3045(-125);
            }
            if (var92.field5142 != null) {
                var92.field5147 = var2.method3045(-127);
            }
            if (var92.field5137 > 0) {
                var92.field5143 = var2.method3045(-125);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field5145 = var2.method3045(-126);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class369 var91 = var18[var88];
            if (var91.field5145 > 0) {
                var91.field5141 = var2.method3045(-126);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class369 var90 = var18[var89];
            if (var90.field5141 > 0) {
                var90.field5140 = var2.method3045(-127);
            }
        }
    }
}
