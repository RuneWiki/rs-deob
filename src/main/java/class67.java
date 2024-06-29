import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class67 extends class61 {

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "[B")
    public byte[] field1283;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "[B")
    public byte[] field1286;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "[B")
    public byte[] field1263;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "[I")
    private int[] field1274;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "[Lgk;")
    public class6[] field1282;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "[S")
    public short[] field1281;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "[Lce;")
    public class216[] field1267;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "[I")
    public static int[] field1264 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "Llc;")
    public static class143 field1266 = class66.method374("Ablegen", -1);

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Llc;")
    public static class143 field1265 = class66.method374("headicons_prayer", -1);

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Z")
    public static boolean field1273 = false;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field1276 = 0;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field1272 = -1;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "Llc;")
    public static class143 field1278 = class66.method374("document)3cookie=(R", -1);

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field1279 = 0;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "Lng;")
    public static class139 field1280 = new class139(32);

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "Llc;")
    public static class143 field1287 = class66.method374("brillant1:", -1);

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "[I")
    public static int[] field1268;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "[I")
    public static int[] field1270;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public final void method389(int arg0) {
        field1277++;
        if (arg0 != 1) {
            method391((byte) -35, 3);
        }
        this.field1274 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static void method390(byte arg0) {
        field1287 = null;
        field1268 = null;
        field1264 = null;
        field1278 = null;
        if (arg0 == 47) {
            field1280 = null;
            field1266 = null;
            field1270 = null;
            field1265 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V")
    public static final void method391(byte arg0, int arg1) {
        if (arg1 != 104) {
            return;
        }
        field1284++;
        if (class36.field623 == null) {
            class36.field623 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class36.field623[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Lri;")
    public static final class57 method392(int arg0, int arg1, int arg2) {
        class120 var3 = class7.field122[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2131;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([BILti;[I)Z")
    public final boolean method393(byte[] arg0, int arg1, class194 arg2, int[] arg3) {
        if (arg1 >= -22) {
            method394((byte) -35);
        }
        boolean var5 = true;
        int var6 = 0;
        field1269++;
        class216 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field1274[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1338(var9 >> 2, arg3, -120);
                        } else {
                            var7 = arg2.method1337(48, arg3, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1267[var8] = var7;
                        this.field1274[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
    public static final void method394(byte arg0) {
        if (arg0 == 22) {
            class164.method1086(false, (byte) 82);
            System.gc();
            class43.method271(25, -84);
            field1285++;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class67() {
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "([B)V")
    public class67(byte[] arg0) {
        this.field1283 = new byte[128];
        this.field1286 = new byte[128];
        this.field1263 = new byte[128];
        this.field1274 = new int[128];
        this.field1282 = new class6[128];
        this.field1281 = new short[128];
        this.field1267 = new class216[128];
        class190 var2 = new class190(arg0);
        int var3;
        for (var3 = 0; var2.field3465[var2.field3487 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1234(false);
        }
        var3++;
        var2.field3487++;
        int var6 = var2.field3487;
        var2.field3487 += var3;
        int var7;
        for (var7 = 0; var2.field3465[var2.field3487 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1234(false);
        }
        var2.field3487++;
        var7++;
        int var10 = var2.field3487;
        var2.field3487 += var7;
        int var11;
        for (var11 = 0; var2.field3465[var2.field3487 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1234(false);
        }
        var11++;
        var2.field3487++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1265(124);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class6[] var19 = new class6[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class6 var103 = var19[var20] = new class6();
            int var104 = var2.method1265(121);
            if (var104 > 0) {
                var103.field93 = new byte[var104 * 2];
            }
            int var105 = var2.method1265(124);
            if (var105 > 0) {
                var103.field86 = new byte[var105 * 2 + 2];
                var103.field86[1] = 64;
            }
        }
        int var21 = var2.method1265(118);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method1265(118);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field3465[var2.field3487 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1234(false);
        }
        int var28 = 0;
        var25++;
        var2.field3487++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1265(116);
            this.field1281[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1265(118);
            this.field1281[var31] = (short) (this.field1281[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length <= var33) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method1232((byte) 39);
            }
            var32--;
            this.field1281[var35] = (short) (this.field1281[var35] + class129.method777(32768, var34 - 1 << 14));
            this.field1274[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1274[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field3465[var6++] - 1;
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                var36--;
                this.field1263[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1274[var43] != 0) {
                if (var42 == 0) {
                    var41 = var2.field3465[var10++] + 16 << 2;
                    if (var40 >= var8.length) {
                        var42 = -1;
                    } else {
                        var42 = var8[var40++];
                    }
                }
                var42--;
                this.field1283[var43] = (byte) var41;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class6 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1274[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length > var44) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                this.field1282[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var50 == 0) {
                if (var26.length <= var48) {
                    var50 = -1;
                } else {
                    var50 = var26[var48++];
                }
                if (this.field1274[var51] > 0) {
                    var49 = var2.method1265(114) + 1;
                }
            }
            this.field1286[var51] = (byte) var49;
            var50--;
        }
        this.field1275 = var2.method1265(124) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class6 var100 = var19[var52];
            if (var100.field93 != null) {
                for (int var101 = 1; var101 < var100.field93.length; var101 += 2) {
                    var100.field93[var101] = var2.method1234(false);
                }
            }
            if (var100.field86 != null) {
                for (int var102 = 3; var102 < (var100.field86.length - 2); var102 += 2) {
                    var100.field86[var102] = var2.method1234(false);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1234(false);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1234(false);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class6 var97 = var19[var55];
            if (var97.field86 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field86.length; var99 += 2) {
                    var98 = var2.method1265(126) + var98 + 1;
                    var97.field86[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class6 var94 = var19[var56];
            if (var94.field93 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field93.length; var96 += 2) {
                    var95 += var2.method1265(126) + 1;
                    var94.field93[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1265(119);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method1265(127) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field1286[var61] = (byte) (this.field1286[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62 + 1];
                byte var66 = var22[var62];
                var62 += 2;
                int var67 = (var66 - var59) * var60 + ((var66 - var59) / 2);
                for (int var68 = var59; var68 < var66; var68++) {
                    int var69 = class256.method1690(var66 - var59, var67, false);
                    this.field1286[var68] = (byte) (this.field1286[var68] * var69 + 32 >> 6);
                    var67 += var65 - var60;
                }
                var60 = var65;
                var59 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field1286[var64] = (byte) (this.field1286[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method1265(126);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method1265(125) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field1283[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1283[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                int var79 = var24[var75 + 1] << 1;
                byte var80 = var24[var75];
                int var81 = (var80 - var72) * var73 + ((var80 - var72) / 2);
                var75 += 2;
                for (int var82 = var72; var82 < var80; var82++) {
                    int var83 = class256.method1690(var80 - var72, var81, false);
                    var81 += var79 - var73;
                    int var84 = (this.field1283[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field1283[var82] = (byte) var84;
                }
                var73 = var79;
                var72 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field1283[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1283[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field90 = var2.method1265(120);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class6 var93 = var19[var87];
            if (var93.field93 != null) {
                var93.field87 = var2.method1265(123);
            }
            if (var93.field86 != null) {
                var93.field91 = var2.method1265(118);
            }
            if (var93.field90 > 0) {
                var93.field96 = var2.method1265(113);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field95 = var2.method1265(117);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class6 var92 = var19[var89];
            if (var92.field95 > 0) {
                var92.field92 = var2.method1265(119);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class6 var91 = var19[var90];
            if (var91.field92 > 0) {
                var91.field84 = var2.method1265(116);
            }
        }
    }
}
