import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class235 extends class172 {

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "[S")
    public short[] field3653;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "[Lqj;")
    public class225[] field3664;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "[Loa;")
    public class163[] field3662;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "[I")
    private int[] field3665;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "[B")
    public byte[] field3657;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "[B")
    public byte[] field3654;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "[B")
    public byte[] field3656;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public int field3655;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "J")
    public static long field3659 = 0L;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "Ll;")
    public static class66 field3667 = new class66(200);

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "[[[B")
    public static byte[][][] field3658;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 5)
    public static void method1753(byte arg0) {
        field3658 = (byte[][][]) null;
        if (arg0 != 10) {
            field3658 = (byte[][][]) ((byte[][][]) null);
        }
        field3667 = null;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IB)V", line = 17)
    public static final void method1754(int arg0, byte arg1) {
        field3666++;
        class244.field3791.method649((byte) 75, arg0);
        if (arg1 != -95) {
            method1757(37, (char) 65452);
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V", line = 33)
    public static final void method1755(int arg0) {
        field3668++;
        if (arg0 != 2) {
            method1756(false, (class323) null);
        }
        class296.field4598.method374(15975);
        class104.field1554.method440(1906703368);
        class158.field2531.method440(arg0 ^ 0x71A5FC0A);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLua;)V", line = 51)
    public static final void method1756(boolean arg0, class323 arg1) {
        field3660++;
        class5 var2 = null;
        try {
            class95 var3 = arg1.method2278("runescape", arg0);
            while (var3.field1447 == 0) {
                class188.method1443(10, 1L);
            }
            if (var3.field1447 == 1) {
                var2 = (class5) var3.field1446;
                class25 var4 = class133.method1135(arg0);
                var2.method38(var4.field448, var4.field397, (byte) -61, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method37(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IC)Z", line = 89)
    public static final boolean method1757(int arg0, char arg1) {
        field3661++;
        if (arg0 == 0) {
            return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 105)
    public class235() {
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([BILkb;[I)Z", line = 110)
    public final boolean method1758(byte[] arg0, int arg1, class214 arg2, int[] arg3) {
        field3663++;
        boolean var5 = true;
        int var6 = -14 / ((arg1 - 57) / 47);
        int var7 = 0;
        class225 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg0 == null || arg0[var9] != 0) {
                int var10 = this.field3665[var9];
                if (var10 != 0) {
                    if (var7 != var10) {
                        var7 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg2.method1605(var10 >> 2, (byte) -105, arg3);
                        } else {
                            var8 = arg2.method1608(var10 >> 2, 0, arg3);
                        }
                        if (var8 == null) {
                            var5 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field3664[var9] = var8;
                        this.field3665[var9] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V", line = 171)
    public final void method1759(byte arg0) {
        if (arg0 != -42) {
            field3658 = (byte[][][]) ((byte[][][]) null);
        }
        this.field3665 = null;
        field3652++;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([B)V", line = 182)
    public class235(byte[] arg0) {
        this.field3653 = new short[128];
        this.field3664 = new class225[128];
        this.field3662 = new class163[128];
        int var2 = 0;
        this.field3665 = new int[128];
        this.field3657 = new byte[128];
        this.field3654 = new byte[128];
        this.field3656 = new byte[128];
        class25 var3 = new class25(arg0);
        while (var3.field448[var3.field397 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method286((byte) 88);
        }
        int var6 = 0;
        var2++;
        var3.field397++;
        int var7 = var3.field397;
        var3.field397 += var2;
        while (var3.field448[var3.field397 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method286((byte) 110);
        }
        var6++;
        var3.field397++;
        int var10 = var3.field397;
        int var11 = 0;
        var3.field397 += var6;
        while (var3.field448[var3.field397 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method286((byte) 101);
        }
        var11++;
        byte[] var14 = new byte[var11];
        var3.field397++;
        int var16;
        if (var11 > 1) {
            int var15 = 1;
            var14[1] = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method281(72);
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
        class163[] var19 = new class163[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class163 var21 = var19[var20] = new class163();
            int var22 = var3.method281(-125);
            if (var22 > 0) {
                var21.field2591 = new byte[var22 * 2];
            }
            int var23 = var3.method281(-127);
            if (var23 > 0) {
                var21.field2592 = new byte[var23 * 2 + 2];
                var21.field2592[1] = 64;
            }
        }
        int var24 = var3.method281(9);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var3.method281(74);
        byte[] var27 = var26 > 0 ? new byte[var26 * 2] : null;
        int var28;
        for (var28 = 0; var3.field448[var3.field397 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var3.method286((byte) 120);
        }
        int var31 = 0;
        var28++;
        var3.field397++;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method281(31);
            this.field3653[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method281(-126);
            this.field3653[var34] = (short) (this.field3653[var34] + (var33 << 8));
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
                var37 = var3.method284((byte) -42);
            }
            var35--;
            this.field3653[var38] = (short) (this.field3653[var38] + (class301.method2169(var37 - 1, 2) << 14));
            this.field3665[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3665[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field448[var7++] - 1;
                    if (var39 < var4.length) {
                        var40 = var4[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field3657[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3665[var46] != 0) {
                if (var43 == 0) {
                    var45 = var3.field448[var10++] + 16 << 2;
                    if (var44 >= var8.length) {
                        var43 = -1;
                    } else {
                        var43 = var8[var44++];
                    }
                }
                var43--;
                this.field3654[var46] = (byte) var45;
            }
        }
        class163 var47 = null;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3665[var50] != 0) {
                if (var48 == 0) {
                    var47 = var19[var14[var49]];
                    if (var49 >= var12.length) {
                        var48 = -1;
                    } else {
                        var48 = var12[var49++];
                    }
                }
                this.field3662[var50] = var47;
                var48--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var29.length <= var53) {
                    var52 = -1;
                } else {
                    var52 = var29[var53++];
                }
                if (this.field3665[var54] > 0) {
                    var51 = var3.method281(-127) + 1;
                }
            }
            this.field3656[var54] = (byte) var51;
            var52--;
        }
        this.field3655 = var3.method281(45) + 1;
        for (int var55 = 0; var55 < var16; var55++) {
            class163 var56 = var19[var55];
            if (var56.field2591 != null) {
                for (int var57 = 1; var57 < var56.field2591.length; var57 += 2) {
                    var56.field2591[var57] = var3.method286((byte) 107);
                }
            }
            if (var56.field2592 != null) {
                for (int var58 = 3; var58 < var56.field2592.length - 2; var58 += 2) {
                    var56.field2592[var58] = var3.method286((byte) 96);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method286((byte) 95);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var3.method286((byte) 99);
            }
        }
        for (int var61 = 0; var61 < var16; var61++) {
            class163 var62 = var19[var61];
            if (var62.field2592 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field2592.length; var64 += 2) {
                    var63 = (var63 + var3.method281(94)) + 1;
                    var62.field2592[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var16; var65++) {
            class163 var66 = var19[var65];
            if (var66.field2591 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field2591.length; var68 += 2) {
                    var67 += var3.method281(-128) + 1;
                    var66.field2591[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method281(-126);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method281(3) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field3656[var73] = (byte) (this.field3656[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74 + 1];
                byte var76 = var25[var74];
                var74 += 2;
                int var77 = (var76 - var71) / 2 + (var76 - var71) * var72;
                for (int var78 = var71; var78 < var76; var78++) {
                    int var79 = class126.method1088(var76 - var71, (byte) -58, var77);
                    var77 += var75 - var72;
                    this.field3656[var78] = (byte) (this.field3656[var78] * var79 + 32 >> 6);
                }
                var71 = var76;
                var72 = var75;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field3656[var80] = (byte) (this.field3656[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var27 != null) {
            int var82 = var3.method281(-124);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = (var82 + var3.method281(-126)) + 1;
                var27[var83] = (byte) var82;
            }
            int var84 = var27[1] << 1;
            byte var85 = var27[0];
            for (int var86 = 0; var86 < var85; var86++) {
                int var87 = (this.field3654[var86] & 0xFF) + var84;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3654[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var27.length) {
                byte var89 = var27[var88];
                int var90 = var27[var88 + 1] << 1;
                int var91 = (var89 - var85) * var84 + ((var89 - var85) / 2);
                for (int var92 = var85; var92 < var89; var92++) {
                    int var93 = class126.method1088(var89 - var85, (byte) -119, var91);
                    var91 += var90 - var84;
                    int var94 = (this.field3654[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3654[var92] = (byte) var94;
                }
                var84 = var90;
                var88 += 2;
                var85 = var89;
            }
            for (int var95 = var85; var95 < 128; var95++) {
                int var96 = (this.field3654[var95] & 0xFF) + var84;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field3654[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var16; var98++) {
            var19[var98].field2593 = var3.method281(54);
        }
        for (int var99 = 0; var99 < var16; var99++) {
            class163 var100 = var19[var99];
            if (var100.field2591 != null) {
                var100.field2583 = var3.method281(-124);
            }
            if (var100.field2592 != null) {
                var100.field2594 = var3.method281(-125);
            }
            if (var100.field2593 > 0) {
                var100.field2597 = var3.method281(-126);
            }
        }
        for (int var101 = 0; var101 < var16; var101++) {
            var19[var101].field2596 = var3.method281(113);
        }
        for (int var102 = 0; var102 < var16; var102++) {
            class163 var103 = var19[var102];
            if (var103.field2596 > 0) {
                var103.field2584 = var3.method281(57);
            }
        }
        for (int var104 = 0; var104 < var16; var104++) {
            class163 var105 = var19[var104];
            if (var105.field2584 > 0) {
                var105.field2595 = var3.method281(-125);
            }
        }
    }
}
