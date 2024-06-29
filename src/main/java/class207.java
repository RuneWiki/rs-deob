import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class207 extends class287 {

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "[Lng;")
    public class162[] field3390;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "[B")
    public byte[] field3378;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "[B")
    public byte[] field3384;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "[S")
    public short[] field3382;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "[B")
    public byte[] field3389;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "[I")
    private int[] field3381;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "[Luc;")
    public class107[] field3376;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public int field3387;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field3377 = 0;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Ltl;")
    public static class59 field3388 = class85.method639("0(U", 9588);

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "Ltl;")
    private static class59 field3386 = class85.method639("Continue", 9588);

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Ltl;")
    public static class59 field3375 = field3386;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Lqk;")
    public static class1 field3380 = new class1();

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 10)
    public final void method1458(byte arg0) {
        if (arg0 != 73) {
            field3386 = (class59) null;
        }
        this.field3381 = null;
        field3379++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[BBLuk;)Z", line = 22)
    public final boolean method1459(int[] arg0, byte[] arg1, byte arg2, class125 arg3) {
        field3385++;
        int var5 = 0;
        class107 var6 = null;
        if (arg2 >= -47) {
            this.method1458((byte) 94);
        }
        boolean var7 = true;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field3381[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg3.method929(false, var9 >> 2, arg0);
                        } else {
                            var6 = arg3.method928(var9 >> 2, -1734, arg0);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field3376[var8] = var6;
                        this.field3381[var8] = 0;
                    }
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([[IIIIII)I", line = 100)
    public static final int method1460(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 765189601) {
            field3377 = -14;
        }
        int var6 = (128 - arg3) * arg0[arg1][arg5] + arg0[arg1 + 1][arg5] * arg3 >> 7;
        int var7 = (128 - arg3) * arg0[arg1][arg5 + 1] + (arg0[arg1 + 1][arg5 + 1] * arg3) >> 7;
        field3383++;
        return (128 - arg4) * var6 + arg4 * var7 >> 7;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V", line = 116)
    public static void method1461(int arg0) {
        field3380 = null;
        field3388 = null;
        if (arg0 != 0) {
            method1460((int[][]) ((int[][]) null), 46, 8, -7, -99, -12);
        }
        field3386 = null;
        field3375 = null;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 142)
    public class207() {
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V", line = 144)
    public class207(byte[] arg0) {
        this.field3390 = new class162[128];
        this.field3378 = new byte[128];
        this.field3384 = new byte[128];
        this.field3382 = new short[128];
        this.field3389 = new byte[128];
        this.field3381 = new int[128];
        this.field3376 = new class107[128];
        int var2 = 0;
        class170 var3 = new class170(arg0);
        while (var3.field2758[var3.field2787 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1205(-1);
        }
        var3.field2787++;
        var2++;
        int var6 = var3.field2787;
        int var7 = 0;
        var3.field2787 += var2;
        while (var3.field2758[var3.field2787 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1205(-1);
        }
        var3.field2787++;
        var7++;
        int var10 = 0;
        int var11 = var3.field2787;
        var3.field2787 += var7;
        while (var3.field2758[var3.field2787 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1205(-1);
        }
        var10++;
        byte[] var14 = new byte[var10];
        var3.field2787++;
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method1221(110);
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
        }
        class162[] var19 = new class162[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class162 var21 = var19[var20] = new class162();
            int var22 = var3.method1221(94);
            if (var22 > 0) {
                var21.field2629 = new byte[var22 * 2];
            }
            int var23 = var3.method1221(77);
            if (var23 > 0) {
                var21.field2644 = new byte[var23 * 2 + 2];
                var21.field2644[1] = 64;
            }
        }
        int var24 = var3.method1221(76);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var3.method1221(109);
        int var27 = 0;
        byte[] var28 = var26 > 0 ? new byte[var26 * 2] : null;
        while (var3.field2758[var3.field2787 + var27] != 0) {
            var27++;
        }
        byte[] var29 = new byte[var27];
        for (int var30 = 0; var30 < var27; var30++) {
            var29[var30] = var3.method1205(-1);
        }
        var27++;
        var3.field2787++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method1221(73);
            this.field3382[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method1221(95);
            this.field3382[var34] = (short) (this.field3382[var34] + (var33 << 8));
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
                var37 = var3.method1220((byte) 73);
            }
            this.field3382[var38] = (short) (this.field3382[var38] + (class93.method680(2, var37 - 1) << 14));
            this.field3381[var38] = var37;
            var35--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3381[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field2758[var6++] - 1;
                    if (var4.length > var39) {
                        var40 = var4[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                var40--;
                this.field3384[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3381[var46] != 0) {
                if (var45 == 0) {
                    var43 = var3.field2758[var11++] + 16 << 2;
                    if (var8.length > var44) {
                        var45 = var8[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                this.field3389[var46] = (byte) var43;
                var45--;
            }
        }
        int var47 = 0;
        class162 var48 = null;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3381[var50] != 0) {
                if (var47 == 0) {
                    var48 = var19[var14[var49]];
                    if (var49 < var12.length) {
                        var47 = var12[var49++];
                    } else {
                        var47 = -1;
                    }
                }
                this.field3390[var50] = var48;
                var47--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var29.length <= var51) {
                    var52 = -1;
                } else {
                    var52 = var29[var51++];
                }
                if (this.field3381[var54] > 0) {
                    var53 = var3.method1221(108) + 1;
                }
            }
            this.field3378[var54] = (byte) var53;
            var52--;
        }
        this.field3387 = var3.method1221(88) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class162 var56 = var19[var55];
            if (var56.field2629 != null) {
                for (int var57 = 1; var57 < var56.field2629.length; var57 += 2) {
                    var56.field2629[var57] = var3.method1205(-1);
                }
            }
            if (var56.field2644 != null) {
                for (int var58 = 3; var58 < (var56.field2644.length - 2); var58 += 2) {
                    var56.field2644[var58] = var3.method1205(-1);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method1205(-1);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method1205(-1);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class162 var62 = var19[var61];
            if (var62.field2644 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field2644.length; var64 += 2) {
                    var63 -= -var3.method1221(117) - 1;
                    var62.field2644[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class162 var66 = var19[var65];
            if (var66.field2629 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field2629.length; var68 += 2) {
                    var67 = var3.method1221(97) + var67 + 1;
                    var66.field2629[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method1221(114);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method1221(72) + (var69 + 1);
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[1];
            byte var72 = var25[0];
            for (int var73 = 0; var73 < var72; var73++) {
                this.field3378[var73] = (byte) (this.field3378[var73] * var71 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                int var77 = (var75 - var72) / 2 + (var75 - var72) * var71;
                var74 += 2;
                for (int var78 = var72; var78 < var75; var78++) {
                    int var79 = class14.method93(var77, false, var75 - var72);
                    this.field3378[var78] = (byte) (this.field3378[var78] * var79 + 32 >> 6);
                    var77 += var76 - var71;
                }
                var72 = var75;
                var71 = var76;
            }
            Object var80 = null;
            for (int var81 = var72; var81 < 128; var81++) {
                this.field3378[var81] = (byte) (this.field3378[var81] * var71 + 32 >> 6);
            }
        }
        if (var28 != null) {
            int var82 = var3.method1221(81);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 -= -var3.method1221(125) - 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field3389[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3389[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var28.length) {
                byte var89 = var28[var88];
                int var90 = var28[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class14.method93(var91, false, var89 - var84);
                    var91 += var90 - var85;
                    int var94 = (this.field3389[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3389[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field3389[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field3389[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field2650 = var3.method1221(127);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class162 var100 = var19[var99];
            if (var100.field2629 != null) {
                var100.field2646 = var3.method1221(127);
            }
            if (var100.field2644 != null) {
                var100.field2638 = var3.method1221(71);
            }
            if (var100.field2650 > 0) {
                var100.field2630 = var3.method1221(107);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field2632 = var3.method1221(115);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class162 var103 = var19[var102];
            if (var103.field2632 > 0) {
                var103.field2631 = var3.method1221(84);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class162 var105 = var19[var104];
            if (var105.field2631 > 0) {
                var105.field2649 = var3.method1221(120);
            }
        }
    }
}
