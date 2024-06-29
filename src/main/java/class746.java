import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class746 extends class656 {

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "[Lct;")
    public class147[] field10388;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "[B")
    public byte[] field10389;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "[S")
    public short[] field10385;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "[B")
    public byte[] field10390;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "[I")
    private int[] field10386;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "[Luo;")
    public class577[] field10384;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "[B")
    public byte[] field10391;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public int field10387;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "Lkaa;")
    public static class47 field10378 = new class47(78, -1);

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field10379;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field10380;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field10381;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    public static int field10382;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "[[B")
    public static byte[][] field10383;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(Z)V", line = 7)
    public static void method4180(boolean arg0) {
        field10378 = null;
        if (arg0) {
            method4182(49, 70, -65, -5, -13, null, -89, 98, 102, (byte) 53, -84);
        }
        field10383 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 21)
    public final void method4181(int arg0) {
        if (arg0 == 1) {
            field10381++;
            this.field10386 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIILkb;IIIBI)Z", line = 36)
    public static final boolean method4182(int arg0, int arg1, int arg2, int arg3, int arg4, class691 arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        field10380++;
        int var11 = arg8;
        if (arg9 >= -40) {
            method4182(13, 54, -69, -51, -22, null, -63, -103, -77, (byte) -90, -88);
        }
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg8 - var13;
        int var16 = arg4 - var14;
        class372.field5176[var13][var14] = 99;
        class8.field155[var13][var14] = 0;
        byte var17 = 0;
        class50.field638[var17] = arg8;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class10.field169[var10001] = arg4;
        int[][] var19 = arg5.field9639;
        while (var26 != var18) {
            var12 = class10.field169[var18];
            var11 = class50.field638[var18];
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg5.field9624;
            int var23 = var12 - arg5.field9640;
            if (arg0 == -4) {
                if (arg1 == var11 && arg7 == var12) {
                    class524.field6955 = var12;
                    class156.field2385 = var11;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class287.method1780(2, arg3, var12, arg7, 2, arg2, arg1, var11, true)) {
                    class524.field6955 = var12;
                    class156.field2385 = var11;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg5.method3899(2, arg2, arg3, arg7, var11, 70, arg1, arg10, 2, var12)) {
                    class524.field6955 = var12;
                    class156.field2385 = var11;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg5.method3894(arg1, arg2, 2, -1, arg7, var12, arg3, var11, arg10)) {
                    class156.field2385 = var11;
                    class524.field6955 = var12;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg5.method3901(arg6, (byte) -119, var12, arg0, 2, arg1, var11, arg7)) {
                    class156.field2385 = var11;
                    class524.field6955 = var12;
                    return true;
                }
            } else if (arg5.method3893(1, 2, arg6, arg0, var11, arg7, arg1, var12)) {
                class524.field6955 = var12;
                class156.field2385 = var11;
                return true;
            }
            int var25 = class8.field155[var20][var21] + 1;
            if (var20 > 0 && class372.field5176[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class50.field638[var26] = var11 - 1;
                class10.field169[var26] = var12;
                class372.field5176[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class8.field155[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class372.field5176[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class50.field638[var26] = var11 + 1;
                class10.field169[var26] = var12;
                class372.field5176[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class8.field155[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class372.field5176[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class50.field638[var26] = var11;
                class10.field169[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class372.field5176[var20][var21 - 1] = 1;
                class8.field155[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class372.field5176[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class50.field638[var26] = var11;
                class10.field169[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class372.field5176[var20][var21 + 1] = 4;
                class8.field155[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class372.field5176[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class50.field638[var26] = var11 - 1;
                class10.field169[var26] = var12 - 1;
                class372.field5176[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class8.field155[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class372.field5176[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class50.field638[var26] = var11 + 1;
                class10.field169[var26] = var12 - 1;
                class372.field5176[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class8.field155[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class372.field5176[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class50.field638[var26] = var11 - 1;
                class10.field169[var26] = var12 + 1;
                class372.field5176[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class8.field155[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class372.field5176[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class50.field638[var26] = var11 + 1;
                class10.field169[var26] = var12 + 1;
                class372.field5176[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class8.field155[var20 + 1][var21 + 1] = var25;
            }
        }
        class524.field6955 = var12;
        class156.field2385 = var11;
        return false;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "([I[BZLjj;)Z", line = 390)
    public final boolean method4183(int[] arg0, byte[] arg1, boolean arg2, class120 arg3) {
        field10382++;
        boolean var5 = arg2;
        int var6 = 0;
        class147 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field10386[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method970(arg0, 119, var9 >> 2);
                        } else {
                            var7 = arg3.method973(arg0, (byte) -65, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field10388[var8] = var7;
                        this.field10386[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V", line = 454)
    public class746() {
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "([B)V", line = 456)
    public class746(byte[] arg0) {
        this.field10388 = new class147[128];
        this.field10389 = new byte[128];
        this.field10385 = new short[128];
        this.field10390 = new byte[128];
        this.field10386 = new int[128];
        this.field10384 = new class577[128];
        this.field10391 = new byte[128];
        class677 var2 = new class677(arg0);
        int var3;
        for (var3 = 0; var2.field9399[var2.field9419 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method3811(121);
        }
        var3++;
        var2.field9419++;
        int var6 = var2.field9419;
        var2.field9419 += var3;
        int var7;
        for (var7 = 0; var2.field9399[var2.field9419 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method3811(125);
        }
        var2.field9419++;
        var7++;
        int var10 = var2.field9419;
        var2.field9419 += var7;
        int var11;
        for (var11 = 0; var2.field9399[var2.field9419 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method3811(65);
        }
        var11++;
        var2.field9419++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method3821((byte) 87);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class577[] var19 = new class577[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class577 var103 = var19[var20] = new class577();
            int var104 = var2.method3821((byte) -92);
            if (var104 > 0) {
                var103.field7574 = new byte[var104 * 2];
            }
            int var105 = var2.method3821((byte) -111);
            if (var105 > 0) {
                var103.field7566 = new byte[var105 * 2 + 2];
                var103.field7566[1] = 64;
            }
        }
        int var21 = var2.method3821((byte) 105);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method3821((byte) 119);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field9399[var2.field9419 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method3811(115);
        }
        var25++;
        var2.field9419++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method3821((byte) 121);
            this.field10385[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method3821((byte) -106);
            this.field10385[var31] = (short) (this.field10385[var31] + (var30 << 8));
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
                var34 = var2.method3776(-125749561);
            }
            this.field10385[var35] = (short) (this.field10385[var35] + (class48.method346(var34 - 1, 2) << 14));
            this.field10386[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field10386[var39] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                    var38 = var2.field9399[var6++] - 1;
                }
                var36--;
                this.field10389[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field10386[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field9399[var10++] + 16 << 2;
                    if (var8.length > var40) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field10390[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class577 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field10386[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 < var12.length) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                this.field10384[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var26.length <= var49) {
                    var48 = -1;
                } else {
                    var48 = var26[var49++];
                }
                if (this.field10386[var51] > 0) {
                    var50 = var2.method3821((byte) 79) + 1;
                }
            }
            var48--;
            this.field10391[var51] = (byte) var50;
        }
        this.field10387 = var2.method3821((byte) 112) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class577 var100 = var19[var52];
            if (var100.field7574 != null) {
                for (int var101 = 1; var101 < var100.field7574.length; var101 += 2) {
                    var100.field7574[var101] = var2.method3811(58);
                }
            }
            if (var100.field7566 != null) {
                for (int var102 = 3; var102 < (var100.field7566.length - 2); var102 += 2) {
                    var100.field7566[var102] = var2.method3811(56);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method3811(101);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method3811(113);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class577 var97 = var19[var55];
            if (var97.field7566 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field7566.length; var99 += 2) {
                    var98 = var98 + var2.method3821((byte) -51) + 1;
                    var97.field7566[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class577 var94 = var19[var56];
            if (var94.field7574 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field7574.length; var96 += 2) {
                    var95 = var95 + var2.method3821((byte) -46) + 1;
                    var94.field7574[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method3821((byte) 119);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method3821((byte) -81) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field10391[var61] = (byte) (this.field10391[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class436.method2505(var67, var65 - var59, 113);
                    var67 += var66 - var60;
                    this.field10391[var68] = (byte) (this.field10391[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field10391[var64] = (byte) (this.field10391[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method3821((byte) 113);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method3821((byte) 71) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field10390[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field10390[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class436.method2505(var81, var79 - var72, 102);
                    int var84 = (this.field10390[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field10390[var82] = (byte) var84;
                }
                var75 += 2;
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field10390[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field10390[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field7573 = var2.method3821((byte) 93);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class577 var93 = var19[var87];
            if (var93.field7574 != null) {
                var93.field7579 = var2.method3821((byte) -109);
            }
            if (var93.field7566 != null) {
                var93.field7578 = var2.method3821((byte) 108);
            }
            if (var93.field7573 > 0) {
                var93.field7569 = var2.method3821((byte) 78);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field7571 = var2.method3821((byte) -75);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class577 var92 = var19[var89];
            if (var92.field7571 > 0) {
                var92.field7576 = var2.method3821((byte) -73);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class577 var91 = var19[var90];
            if (var91.field7576 > 0) {
                var91.field7572 = var2.method3821((byte) -104);
            }
        }
    }
}
