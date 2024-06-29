import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class373 extends class568 {

    @OriginalMember(owner = "client!km", name = "u", descriptor = "[Lgu;")
    public class607[] field6045;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "[B")
    public byte[] field6052;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "[B")
    public byte[] field6046;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "[Ljg;")
    public class357[] field6048;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "[S")
    public short[] field6055;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "[B")
    public byte[] field6050;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "[I")
    private int[] field6044;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public int field6049;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6056 = new String[] { method3081(method3080("\u0011\\/o%")), method3081(method3080("\u0001\u001f/\u0005p")), method3081(method3080("\u0014DmG")), method3081(method3080("\u0011\\/h%")), method3081(method3080("\u0011\\/j%")), method3081(method3080("\u0011\\/i%")), method3081(method3080("\u0011\\/\u0017d\u0014Xu\u0015%")) };

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BC)I", line = 4)
    public static final int method3076(byte arg0, char arg1) {
        try {
            field6047++;
            if (arg1 >= '\u0000' && class391.field6236.length > arg1) {
                return class391.field6236[arg1];
            } else {
                int var2 = -20 / ((12 - arg0) / 56);
                return -1;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6056[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([BILke;[I)Z", line = 19)
    public final boolean method3077(byte[] arg0, int arg1, class625 arg2, int[] arg3) {
        try {
            int var5 = 120 / ((63 - arg1) / 49);
            field6053++;
            boolean var6 = true;
            int var7 = 0;
            class357 var8 = null;
            for (int var9 = 0; var9 < 128; var9++) {
                if (arg0 == null || arg0[var9] != 0) {
                    int var10 = this.field6044[var9];
                    if (var10 != 0) {
                        if (var7 != var10) {
                            var7 = var10--;
                            if ((var10 & 0x1) == 0) {
                                var8 = arg2.method4558((byte) 45, arg3, var10 >> 2);
                            } else {
                                var8 = arg2.method4559(arg3, var10 >> 2, 97);
                            }
                            if (var8 == null) {
                                var6 = false;
                            }
                        }
                        if (var8 != null) {
                            this.field6048[var9] = var8;
                            this.field6044[var9] = 0;
                        }
                    }
                }
            }
            return var6;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field6056[3] + (arg0 == null ? field6056[2] : field6056[1]) + ',' + arg1 + ',' + (arg2 == null ? field6056[2] : field6056[1]) + ',' + (arg3 == null ? field6056[2] : field6056[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 75)
    public final void method3078(int arg0) {
        try {
            this.field6044 = null;
            if (arg0 != 9897) {
                this.method3078(-99);
            }
            field6051++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6056[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lha;IIIII)V", line = 96)
    public static final void method3079(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            arg0.method221(arg4, arg5, arg3 + arg4, arg2 + arg5);
            field6054++;
            arg0.method664(arg5, -16777216, arg3, arg4, arg2, true);
            if (class672.field9539 >= 100) {
                float var6 = (float) class770.field11272 / (float) class770.field11284;
                int var7 = arg3;
                int var8 = arg2;
                if ((var6 < 1.0F)) {
                    var8 = (int) ((float) arg3 * var6);
                } else {
                    var7 = (int) ((float) arg2 / var6);
                }
                int var23 = (arg3 - var7) / 2 + arg4;
                int var24 = (arg2 - var8) / 2 + arg5;
                if (class94.field1366 == null || arg3 != class94.field1366.method7() || arg2 != class94.field1366.method13()) {
                    class770.method5559(class770.field11276, class770.field11272 + class770.field11270, class770.field11284 + class770.field11276, class770.field11270, var23, var24, var23 + var7, var24 + var8);
                    class770.method5542(arg0);
                    class94.field1366 = arg0.method211(var23, var24, var7, var8, false);
                }
                class94.field1366.method1001(var23, var24);
                int var9 = class184.field2933 * var7 / class770.field11284;
                if (arg1 >= 30) {
                    int var10 = class361.field5824 * var8 / class770.field11272;
                    int var11 = class672.field9544 * var7 / class770.field11284 + var23;
                    int var12 = var24 + var8 - var10 - (class404.field6361 * var8 / class770.field11272);
                    int var13 = -1996554240;
                    if (class305.field4924 == class117.field1711) {
                        var13 = -1996488705;
                    }
                    arg0.method242(var11, var12, var9, var10, var13, 1);
                    arg0.method208(var11, var12, var9, var10, var13, 0);
                    if (class750.field11052 > 0) {
                        int var14;
                        if (class153.field2137 <= 50) {
                            var14 = class153.field2137 * 5;
                        } else {
                            var14 = (100 - class153.field2137) * 5;
                        }
                        for (class420 var15 = (class420) class770.field11260.method3228(11); var15 != null; var15 = (class420) class770.field11260.method3216(true)) {
                            class209 var16 = class770.field11257.method2325(-2, var15.field6636);
                            if (class82.method842((byte) -2, var16)) {
                                if (class188.field2980 == var15.field6636) {
                                    int var19 = var15.field6631 * var7 / class770.field11284 + var23;
                                    int var20 = (class770.field11272 - var15.field6630) * var8 / class770.field11272 + var24;
                                    arg0.method664(var20 - 2, var14 << 24 | 0xFFFF00, 4, var19 - 2, 4, true);
                                } else if (class581.field8367 != -1 && class581.field8367 == var16.field3274) {
                                    int var17 = var15.field6631 * var7 / class770.field11284 + var23;
                                    int var18 = (class770.field11272 - var15.field6630) * var8 / class770.field11272 + var24;
                                    arg0.method664(var18 - 2, var14 << 24 | 0xFFFF00, 4, var17 - 2, 4, true);
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field6056[5] + (arg0 == null ? field6056[2] : field6056[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V", line = 194)
    public class373() {
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "([B)V", line = 200)
    public class373(byte[] arg0) {
        try {
            this.field6045 = new class607[128];
            this.field6052 = new byte[128];
            this.field6046 = new byte[128];
            this.field6048 = new class357[128];
            this.field6055 = new short[128];
            this.field6050 = new byte[128];
            this.field6044 = new int[128];
            class176 var2 = new class176(arg0);
            int var3;
            for (var3 = 0; var2.field2805[var2.field2799 + var3] != 0; var3++) {
            }
            byte[] var4 = new byte[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var4[var5] = var2.method1672(-64);
            }
            var2.field2799++;
            var3++;
            int var6 = var2.field2799;
            var2.field2799 += var3;
            int var7;
            for (var7 = 0; var2.field2805[var2.field2799 + var7] != 0; var7++) {
            }
            byte[] var8 = new byte[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var8[var9] = var2.method1672(102);
            }
            var7++;
            var2.field2799++;
            int var10 = var2.field2799;
            var2.field2799 += var7;
            int var11;
            for (var11 = 0; var2.field2805[var2.field2799 + var11] != 0; var11++) {
            }
            byte[] var12 = new byte[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                var12[var13] = var2.method1672(-74);
            }
            var2.field2799++;
            var11++;
            byte[] var14 = new byte[var11];
            int var16;
            if (var11 > 1) {
                var14[1] = 1;
                int var15 = 1;
                var16 = 2;
                for (int var17 = 2; var17 < var11; var17++) {
                    int var18 = var2.method1645((byte) -109);
                    if (var18 == 0) {
                        var15 = var16++;
                    } else {
                        if (var15 >= var18) {
                            var18--;
                        }
                        var15 = var18;
                    }
                    var14[var17] = (byte) var15;
                }
            } else {
                var16 = var11;
            }
            class607[] var19 = new class607[var16];
            for (int var20 = 0; var20 < var19.length; var20++) {
                class607 var21 = var19[var20] = new class607();
                int var22 = var2.method1645((byte) -86);
                if (var22 > 0) {
                    var21.field8744 = new byte[var22 * 2];
                }
                int var23 = var2.method1645((byte) -103);
                if (var23 > 0) {
                    var21.field8752 = new byte[var23 * 2 + 2];
                    var21.field8752[1] = 64;
                }
            }
            int var24 = var2.method1645((byte) -118);
            byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
            int var26 = var2.method1645((byte) -80);
            byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
            int var28;
            for (var28 = 0; var2.field2805[var2.field2799 + var28] != 0; var28++) {
            }
            byte[] var29 = new byte[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var29[var30] = var2.method1672(-46);
            }
            var2.field2799++;
            var28++;
            int var31 = 0;
            for (int var32 = 0; var32 < 128; var32++) {
                var31 += var2.method1645((byte) -88);
                this.field6055[var32] = (short) var31;
            }
            int var33 = 0;
            for (int var34 = 0; var34 < 128; var34++) {
                var33 += var2.method1645((byte) -113);
                this.field6055[var34] = (short) (this.field6055[var34] + (var33 << 8));
            }
            int var35 = 0;
            int var36 = 0;
            int var37 = 0;
            for (int var38 = 0; var38 < 128; var38++) {
                if (var35 == 0) {
                    if (var29.length > var36) {
                        var35 = var29[var36++];
                    } else {
                        var35 = -1;
                    }
                    var37 = var2.method1648(98);
                }
                this.field6055[var38] = (short) (this.field6055[var38] + (class292.method2485(var37 - 1, 2) << 14));
                var35--;
                this.field6044[var38] = var37;
            }
            int var39 = 0;
            int var40 = 0;
            int var41 = 0;
            for (int var42 = 0; var42 < 128; var42++) {
                if (this.field6044[var42] != 0) {
                    if (var39 == 0) {
                        if (var40 < var4.length) {
                            var39 = var4[var40++];
                        } else {
                            var39 = -1;
                        }
                        var41 = var2.field2805[var6++] - 1;
                    }
                    this.field6050[var42] = (byte) var41;
                    var39--;
                }
            }
            int var43 = 0;
            int var44 = 0;
            int var45 = 0;
            for (int var46 = 0; var46 < 128; var46++) {
                if (this.field6044[var46] != 0) {
                    if (var43 == 0) {
                        if (var8.length > var44) {
                            var43 = var8[var44++];
                        } else {
                            var43 = -1;
                        }
                        var45 = var2.field2805[var10++] + 16 << 2;
                    }
                    this.field6046[var46] = (byte) var45;
                    var43--;
                }
            }
            int var47 = 0;
            int var48 = 0;
            class607 var49 = null;
            for (int var50 = 0; var50 < 128; var50++) {
                if (this.field6044[var50] != 0) {
                    if (var47 == 0) {
                        var49 = var19[var14[var48]];
                        if (var12.length > var48) {
                            var47 = var12[var48++];
                        } else {
                            var47 = -1;
                        }
                    }
                    this.field6045[var50] = var49;
                    var47--;
                }
            }
            int var51 = 0;
            int var52 = 0;
            int var53 = 0;
            for (int var54 = 0; var54 < 128; var54++) {
                if (var52 == 0) {
                    if (var51 >= var29.length) {
                        var52 = -1;
                    } else {
                        var52 = var29[var51++];
                    }
                    if (this.field6044[var54] > 0) {
                        var53 = var2.method1645((byte) -101) + 1;
                    }
                }
                this.field6052[var54] = (byte) var53;
                var52--;
            }
            this.field6049 = var2.method1645((byte) -84) + 1;
            for (int var55 = 0; var55 < var16; var55++) {
                class607 var56 = var19[var55];
                if (var56.field8744 != null) {
                    for (int var57 = 1; var57 < var56.field8744.length; var57 += 2) {
                        var56.field8744[var57] = var2.method1672(-57);
                    }
                }
                if (var56.field8752 != null) {
                    for (int var58 = 3; var58 < var56.field8752.length - 2; var58 += 2) {
                        var56.field8752[var58] = var2.method1672(122);
                    }
                }
            }
            if (var25 != null) {
                for (int var59 = 1; var59 < var25.length; var59 += 2) {
                    var25[var59] = var2.method1672(-99);
                }
            }
            if (var27 != null) {
                for (int var60 = 1; var60 < var27.length; var60 += 2) {
                    var27[var60] = var2.method1672(102);
                }
            }
            for (int var61 = 0; var61 < var16; var61++) {
                class607 var62 = var19[var61];
                if (var62.field8752 != null) {
                    int var63 = 0;
                    for (int var64 = 2; var64 < var62.field8752.length; var64 += 2) {
                        var63 += var2.method1645((byte) -95) + 1;
                        var62.field8752[var64] = (byte) var63;
                    }
                }
            }
            for (int var65 = 0; var65 < var16; var65++) {
                class607 var66 = var19[var65];
                if (var66.field8744 != null) {
                    int var67 = 0;
                    for (int var68 = 2; var68 < var66.field8744.length; var68 += 2) {
                        var67 -= -var2.method1645((byte) -111) - 1;
                        var66.field8744[var68] = (byte) var67;
                    }
                }
            }
            if (var25 != null) {
                int var69 = var2.method1645((byte) -105);
                var25[0] = (byte) var69;
                for (int var70 = 2; var70 < var25.length; var70 += 2) {
                    var69 += var2.method1645((byte) -88) + 1;
                    var25[var70] = (byte) var69;
                }
                byte var71 = var25[0];
                byte var72 = var25[1];
                for (int var73 = 0; var73 < var71; var73++) {
                    this.field6052[var73] = (byte) (this.field6052[var73] * var72 + 32 >> 6);
                }
                int var74 = 2;
                while (var25.length > var74) {
                    byte var75 = var25[var74];
                    byte var76 = var25[var74 + 1];
                    int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                    for (int var78 = var71; var78 < var75; var78++) {
                        int var79 = class207.method1876((byte) -103, var75 - var71, var77);
                        var77 += var76 - var72;
                        this.field6052[var78] = (byte) (this.field6052[var78] * var79 + 32 >> 6);
                    }
                    var72 = var76;
                    var74 += 2;
                    var71 = var75;
                }
                for (int var80 = var71; var80 < 128; var80++) {
                    this.field6052[var80] = (byte) (this.field6052[var80] * var72 + 32 >> 6);
                }
                Object var81 = null;
            }
            if (var27 != null) {
                int var82 = var2.method1645((byte) -116);
                var27[0] = (byte) var82;
                for (int var83 = 2; var83 < var27.length; var83 += 2) {
                    var82 = var2.method1645((byte) -77) + var82 + 1;
                    var27[var83] = (byte) var82;
                }
                byte var84 = var27[0];
                int var85 = var27[1] << 1;
                for (int var86 = 0; var86 < var84; var86++) {
                    int var87 = (this.field6046[var86] & 0xFF) + var85;
                    if (var87 < 0) {
                        var87 = 0;
                    }
                    if (var87 > 128) {
                        var87 = 128;
                    }
                    this.field6046[var86] = (byte) var87;
                }
                int var88 = 2;
                while (var88 < var27.length) {
                    byte var89 = var27[var88];
                    int var90 = var27[var88 + 1] << 1;
                    int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                    for (int var92 = var84; var92 < var89; var92++) {
                        int var93 = class207.method1876((byte) -107, var89 - var84, var91);
                        int var94 = (this.field6046[var92] & 0xFF) + var93;
                        if (var94 < 0) {
                            var94 = 0;
                        }
                        if (var94 > 128) {
                            var94 = 128;
                        }
                        var91 += var90 - var85;
                        this.field6046[var92] = (byte) var94;
                    }
                    var84 = var89;
                    var88 += 2;
                    var85 = var90;
                }
                Object var95 = null;
                for (int var96 = var84; var96 < 128; var96++) {
                    int var97 = (this.field6046[var96] & 0xFF) + var85;
                    if (var97 < 0) {
                        var97 = 0;
                    }
                    if (var97 > 128) {
                        var97 = 128;
                    }
                    this.field6046[var96] = (byte) var97;
                }
            }
            for (int var98 = 0; var98 < var16; var98++) {
                var19[var98].field8741 = var2.method1645((byte) -97);
            }
            for (int var99 = 0; var99 < var16; var99++) {
                class607 var100 = var19[var99];
                if (var100.field8744 != null) {
                    var100.field8746 = var2.method1645((byte) -99);
                }
                if (var100.field8752 != null) {
                    var100.field8740 = var2.method1645((byte) -109);
                }
                if (var100.field8741 > 0) {
                    var100.field8745 = var2.method1645((byte) -117);
                }
            }
            for (int var101 = 0; var101 < var16; var101++) {
                var19[var101].field8742 = var2.method1645((byte) -111);
            }
            for (int var102 = 0; var102 < var16; var102++) {
                class607 var103 = var19[var102];
                if (var103.field8742 > 0) {
                    var103.field8747 = var2.method1645((byte) -127);
                }
            }
            for (int var104 = 0; var104 < var16; var104++) {
                class607 var105 = var19[var104];
                if (var105.field8747 > 0) {
                    var105.field8750 = var2.method1645((byte) -85);
                }
            }
        } catch (RuntimeException var107) {
            throw class590.method4333(var107, field6056[6] + (arg0 == null ? field6056[2] : field6056[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3080(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!km", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3081(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
