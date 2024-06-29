import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class181 extends class64 {

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "[B")
    public byte[] field3271;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "[S")
    public short[] field3275;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "[Lji;")
    public class42[] field3270;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "[Luf;")
    public class173[] field3257;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "[I")
    private int[] field3263;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "[B")
    public byte[] field3260;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "[B")
    public byte[] field3267;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "Lid;")
    public static class149 field3259 = class60.method382("(U(Y", (byte) 55);

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field3262 = 0;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field3266 = -1;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "[I")
    public static int[] field3268 = new int[1000];

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "Lid;")
    public static class149 field3261 = class60.method382("S-Blectionner", (byte) 88);

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "Lid;")
    private static class149 field3272 = class60.method382("level: ", (byte) 90);

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field3258 = 0;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "Lid;")
    public static class149 field3274 = field3272;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "Lid;")
    public static class149 field3277 = class60.method382("rot:", (byte) 83);

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lll;[IB[B)Z")
    public final boolean method1256(class206 arg0, int[] arg1, byte arg2, byte[] arg3) {
        int var5 = 8 / ((arg2 + 62) / 38);
        field3276++;
        boolean var6 = true;
        int var7 = 0;
        class42 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg3 == null || arg3[var9] != 0) {
                int var10 = this.field3263[var9];
                if (var10 != 0) {
                    if (var7 != var10) {
                        var7 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg0.method1402(var10 >> 2, arg1, 1);
                        } else {
                            var8 = arg0.method1410(var10 >> 2, 93, arg1);
                        }
                        if (var8 == null) {
                            var6 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field3270[var9] = var8;
                        this.field3263[var9] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public final void method1257(int arg0) {
        field3269++;
        this.field3263 = null;
        if (arg0 != -1) {
            this.field3271 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
    public static void method1258(boolean arg0) {
        if (arg0) {
            field3261 = null;
        }
        field3268 = null;
        field3259 = null;
        field3272 = null;
        field3261 = null;
        field3274 = null;
        field3277 = null;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class181() {
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "([B)V")
    public class181(byte[] arg0) {
        this.field3271 = new byte[128];
        this.field3275 = new short[128];
        this.field3270 = new class42[128];
        this.field3257 = new class173[128];
        int var2 = 0;
        this.field3263 = new int[128];
        this.field3260 = new byte[128];
        this.field3267 = new byte[128];
        class74 var3 = new class74(arg0);
        while (var3.field1321[var3.field1340 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method514((byte) 1);
        }
        var3.field1340++;
        int var6 = var3.field1340;
        var2++;
        int var7 = 0;
        var3.field1340 += var2;
        while (var3.field1321[var3.field1340 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method514((byte) 1);
        }
        var3.field1340++;
        int var10 = var3.field1340;
        var7++;
        var3.field1340 += var7;
        int var11;
        for (var11 = 0; var3.field1321[var3.field1340 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method514((byte) 1);
        }
        var11++;
        var3.field1340++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method489((byte) 110);
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
        class173[] var18 = new class173[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class173 var102 = var18[var19] = new class173();
            int var103 = var3.method489((byte) 111);
            if (var103 > 0) {
                var102.field3186 = new byte[var103 * 2];
            }
            int var104 = var3.method489((byte) -115);
            if (var104 > 0) {
                var102.field3199 = new byte[var104 * 2 + 2];
                var102.field3199[1] = 64;
            }
        }
        int var20 = var3.method489((byte) -14);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var3.method489((byte) -42);
        int var23;
        for (var23 = 0; var3.field1321[var3.field1340 + var23] != 0; var23++) {
        }
        byte[] var24 = var22 <= 0 ? null : new byte[var22 * 2];
        byte[] var25 = new byte[var23];
        for (int var26 = 0; var26 < var23; var26++) {
            var25[var26] = var3.method514((byte) 1);
        }
        var3.field1340++;
        var23++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method489((byte) -117);
            this.field3275[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method489((byte) -9);
            this.field3275[var30] = (short) (this.field3275[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length <= var33) {
                    var31 = -1;
                } else {
                    var31 = var25[var33++];
                }
                var32 = var3.method503((byte) -29);
            }
            this.field3275[var34] = (short) (this.field3275[var34] + (class136.method953(2, var32 - 1) << 14));
            var31--;
            this.field3263[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3263[var38] != 0) {
                if (var35 == 0) {
                    if (var37 >= var4.length) {
                        var35 = -1;
                    } else {
                        var35 = var4[var37++];
                    }
                    var36 = var3.field1321[var6++] - 1;
                }
                this.field3267[var38] = (byte) var36;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3263[var42] != 0) {
                if (var39 == 0) {
                    var40 = var3.field1321[var10++] + 16 << 2;
                    if (var8.length > var41) {
                        var39 = var8[var41++];
                    } else {
                        var39 = -1;
                    }
                }
                var39--;
                this.field3271[var42] = (byte) var40;
            }
        }
        class173 var43 = null;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3263[var46] != 0) {
                if (var44 == 0) {
                    var43 = var18[var14[var45]];
                    if (var45 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field3257[var46] = var43;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var49 < var25.length) {
                    var47 = var25[var49++];
                } else {
                    var47 = -1;
                }
                if (this.field3263[var50] > 0) {
                    var48 = var3.method489((byte) -96) + 1;
                }
            }
            var47--;
            this.field3260[var50] = (byte) var48;
        }
        this.field3273 = var3.method489((byte) -67) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class173 var99 = var18[var51];
            if (var99.field3186 != null) {
                for (int var100 = 1; var100 < var99.field3186.length; var100 += 2) {
                    var99.field3186[var100] = var3.method514((byte) 1);
                }
            }
            if (var99.field3199 != null) {
                for (int var101 = 3; var101 < var99.field3199.length - 2; var101 += 2) {
                    var99.field3199[var101] = var3.method514((byte) 1);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method514((byte) 1);
            }
        }
        if (var24 != null) {
            for (int var53 = 1; var53 < var24.length; var53 += 2) {
                var24[var53] = var3.method514((byte) 1);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class173 var96 = var18[var54];
            if (var96.field3199 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field3199.length; var98 += 2) {
                    var97 = var97 + var3.method489((byte) -73) + 1;
                    var96.field3199[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class173 var93 = var18[var55];
            if (var93.field3186 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field3186.length; var95 += 2) {
                    var94 = var3.method489((byte) 117) + var94 + 1;
                    var93.field3186[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method489((byte) 126);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var3.method489((byte) -21) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field3260[var60] = (byte) (this.field3260[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                int var65 = (var64 - var59) / 2 + (var64 - var59) * var58;
                byte var66 = var21[var61 + 1];
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class36.method208((byte) -97, var65, var64 - var59);
                    this.field3260[var67] = (byte) (this.field3260[var67] * var68 + 32 >> 6);
                    var65 += var66 - var58;
                }
                var61 += 2;
                var59 = var64;
                var58 = var66;
            }
            for (int var62 = var59; var62 < 128; var62++) {
                this.field3260[var62] = (byte) (this.field3260[var62] * var58 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var24 != null) {
            int var69 = var3.method489((byte) 122);
            var24[0] = (byte) var69;
            for (int var70 = 2; var70 < var24.length; var70 += 2) {
                var69 += var3.method489((byte) -60) + 1;
                var24[var70] = (byte) var69;
            }
            byte var71 = var24[0];
            int var72 = var24[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3271[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3271[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var24.length > var74) {
                byte var78 = var24[var74];
                int var79 = var24[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class36.method208((byte) -97, var80, var78 - var71);
                    int var83 = (this.field3271[var81] & 0xFF) + var82;
                    var80 += var79 - var72;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3271[var81] = (byte) var83;
                }
                var74 += 2;
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field3271[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3271[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field3183 = var3.method489((byte) -85);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class173 var92 = var18[var86];
            if (var92.field3186 != null) {
                var92.field3179 = var3.method489((byte) 111);
            }
            if (var92.field3199 != null) {
                var92.field3193 = var3.method489((byte) -70);
            }
            if (var92.field3183 > 0) {
                var92.field3189 = var3.method489((byte) -64);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field3181 = var3.method489((byte) 98);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class173 var91 = var18[var88];
            if (var91.field3181 > 0) {
                var91.field3182 = var3.method489((byte) -55);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class173 var90 = var18[var89];
            if (var90.field3182 > 0) {
                var90.field3187 = var3.method489((byte) 112);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZIIIIIIIIIB)Z")
    public static final boolean method1259(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte arg12) {
        field3265++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var41 = 0; var41 < 104; var41++) {
                class244.field4291[var13][var41] = 0;
                class3.field40[var13][var41] = 99999999;
            }
        }
        class244.field4291[arg1][arg7] = 99;
        class3.field40[arg1][arg7] = 0;
        int var14 = -27 / ((82 - arg12) / 37);
        int var15 = arg1;
        int var16 = arg7;
        byte var17 = 0;
        class16.field231[var17] = arg1;
        int var42 = var17 + 1;
        class119.field2032[var17] = arg7;
        int var18 = 0;
        int[][] var19 = class228.field3989[class277.field4948].field1856;
        boolean var20 = false;
        label368: while (var42 != var18) {
            var16 = class119.field2032[var18];
            var15 = class16.field231[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg10 == var15 && arg0 == var16) {
                var20 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class228.field3989[class277.field4948].method757(arg3 - 1, var15, arg5, arg10, -125, var16, arg0, arg11)) {
                    var20 = true;
                    break;
                }
                if (arg3 < 10 && class228.field3989[class277.field4948].method764(arg10, arg5, arg3 - 1, (byte) 80, arg0, arg11, var15, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg4 != 0 && class228.field3989[class277.field4948].method766(var15, arg10, arg0, arg4, arg6, arg9, 25417, arg5, var16)) {
                var20 = true;
                break;
            }
            int var32 = class3.field40[var15][var16] + 1;
            if (var15 > 0 && class244.field4291[var15 - 1][var16] == 0 && (var19[var15 - 1][var16] & 0x12C010E) == 0 && (var19[var15 - 1][arg5 + var16 - 1] & 0x12C0138) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= arg5 - 1) {
                        class16.field231[var42] = var15 - 1;
                        class119.field2032[var42] = var16;
                        var42 = var42 + 1 & 0xFFF;
                        class244.field4291[var15 - 1][var16] = 2;
                        class3.field40[var15 - 1][var16] = var32;
                        break;
                    }
                    if ((var19[var15 - 1][var16 + var33] & 0x12C013E) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 < 102 && class244.field4291[var15 + 1][var16] == 0 && (var19[arg5 + var15][var16] & 0x12C0183) == 0 && (var19[var15 + arg5][var16 + arg5 - 1] & 0x12C01E0) == 0) {
                int var34 = 1;
                while (true) {
                    if ((arg5 - 1) <= var34) {
                        class16.field231[var42] = var15 + 1;
                        class119.field2032[var42] = var16;
                        class244.field4291[var15 + 1][var16] = 8;
                        class3.field40[var15 + 1][var16] = var32;
                        var42 = var42 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[arg5 + var15][var16 + var34] & 0x12C01E3) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var16 > 0 && class244.field4291[var15][var16 - 1] == 0 && (var19[var15][var16 - 1] & 0x12C010E) == 0 && (var19[arg5 + var15 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= arg5 - 1) {
                        class16.field231[var42] = var15;
                        class119.field2032[var42] = var16 - 1;
                        class244.field4291[var15][var16 - 1] = 1;
                        var42 = var42 + 1 & 0xFFF;
                        class3.field40[var15][var16 - 1] = var32;
                        break;
                    }
                    if ((var19[var15 + var35][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var16 < 102 && class244.field4291[var15][var16 + 1] == 0 && (var19[var15][arg5 + var16] & 0x12C0138) == 0 && (var19[arg5 + var15 - 1][arg5 + var16] & 0x12C01E0) == 0) {
                int var36 = 1;
                while (true) {
                    if ((arg5 - 1) <= var36) {
                        class16.field231[var42] = var15;
                        class119.field2032[var42] = var16 + 1;
                        var42 = var42 + 1 & 0xFFF;
                        class244.field4291[var15][var16 + 1] = 4;
                        class3.field40[var15][var16 + 1] = var32;
                        break;
                    }
                    if ((var19[var15 + var36][arg5 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var15 > 0 && var16 > 0 && class244.field4291[var15 - 1][var16 - 1] == 0 && (var19[var15 - 1][arg5 + var16 - 2] & 0x12C0138) == 0 && (var19[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var19[arg5 + var15 - 1 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var37 = 1;
                while (true) {
                    if (arg5 - 1 <= var37) {
                        class16.field231[var42] = var15 - 1;
                        class119.field2032[var42] = var16 - 1;
                        var42 = var42 + 1 & 0xFFF;
                        class244.field4291[var15 - 1][var16 - 1] = 3;
                        class3.field40[var15 - 1][var16 - 1] = var32;
                        break;
                    }
                    if ((var19[var15 - 1][var37 + var16 - 1] & 0x12C013E) != 0 || (var19[var15 + var37 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var15 < 102 && var16 > 0 && class244.field4291[var15 + 1][var16 - 1] == 0 && (var19[var15 + 1][var16 - 1] & 0x12C010E) == 0 && (var19[arg5 + var15][var16 - 1] & 0x12C0183) == 0 && (var19[arg5 + var15][var16 + arg5 - 1 - 1] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= (arg5 - 1)) {
                        class16.field231[var42] = var15 + 1;
                        class119.field2032[var42] = var16 - 1;
                        class244.field4291[var15 + 1][var16 - 1] = 9;
                        var42 = var42 + 1 & 0xFFF;
                        class3.field40[var15 + 1][var16 - 1] = var32;
                        break;
                    }
                    if ((var19[arg5 + var15][var16 + var38 - 1] & 0x12C01E3) != 0 || (var19[var15 + var38 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var15 > 0 && var16 < 102 && class244.field4291[var15 - 1][var16 + 1] == 0 && (var19[var15 - 1][var16 + 1] & 0x12C010E) == 0 && (var19[var15 - 1][arg5 + var16] & 0x12C0138) == 0 && (var19[var15][arg5 + var16] & 0x12C01E0) == 0) {
                int var39 = 1;
                while (true) {
                    if (var39 >= (arg5 - 1)) {
                        class16.field231[var42] = var15 - 1;
                        class119.field2032[var42] = var16 + 1;
                        class244.field4291[var15 - 1][var16 + 1] = 6;
                        var42 = var42 + 1 & 0xFFF;
                        class3.field40[var15 - 1][var16 + 1] = var32;
                        break;
                    }
                    if ((var19[var15 - 1][var39 + var16 + 1] & 0x12C013E) != 0 || (var19[var39 + var15 - 1][var16 + arg5] & 0x12C01F8) != 0) {
                        break;
                    }
                    var39++;
                }
            }
            if (var15 < 102 && var16 < 102 && class244.field4291[var15 + 1][var16 + 1] == 0 && (var19[var15 + 1][arg5 + var16] & 0x12C0138) == 0 && (var19[arg5 + var15][arg5 + var16] & 0x12C01E0) == 0 && (var19[arg5 + var15][var16 + 1] & 0x12C0183) == 0) {
                for (int var40 = 1; var40 < (arg5 - 1); var40++) {
                    if ((var19[var15 + var40 + 1][arg5 + var16] & 0x12C01F8) != 0 || (var19[arg5 + var15][var16 + var40 + 1] & 0x12C01E3) != 0) {
                        continue label368;
                    }
                }
                class16.field231[var42] = var15 + 1;
                class119.field2032[var42] = var16 + 1;
                class244.field4291[var15 + 1][var16 + 1] = 12;
                class3.field40[var15 + 1][var16 + 1] = var32;
                var42 = var42 + 1 & 0xFFF;
            }
        }
        class167.field3092 = 0;
        if (!var20) {
            if (!arg2) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg10 - var23; var24 <= arg10 + var23; var24++) {
                for (int var25 = arg0 - var23; var25 <= (arg0 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class3.field40[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg10) {
                            var26 = arg10 - var24;
                        } else if (var24 > (arg9 + arg10 - 1)) {
                            var26 = var24 + 1 - arg9 - arg10;
                        }
                        int var27 = 0;
                        if (arg0 > var25) {
                            var27 = arg0 - var25;
                        } else if (var25 > (arg0 + arg4 - 1)) {
                            var27 = var25 + 1 - arg0 - arg4;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var22 > class3.field40[var24][var25]) {
                            var22 = class3.field40[var24][var25];
                            var15 = var24;
                            var21 = var28;
                            var16 = var25;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg1 == var15 && arg7 == var16) {
                return false;
            }
            class167.field3092 = 1;
        }
        byte var29 = 0;
        class16.field231[var29] = var15;
        int var43 = var29 + 1;
        class119.field2032[var29] = var16;
        int var30;
        int var31 = var30 = class244.field4291[var15][var16];
        while (arg1 != var15 || arg7 != var16) {
            if (var30 != var31) {
                class16.field231[var43] = var15;
                class119.field2032[var43++] = var16;
                var30 = var31;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            if ((var31 & 0x1) != 0) {
                var16++;
            } else if ((var31 & 0x4) != 0) {
                var16--;
            }
            var31 = class244.field4291[var15][var16];
        }
        if (var43 > 0) {
            class271.method1882(var43, -3, arg8);
            return true;
        } else if (arg8 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
