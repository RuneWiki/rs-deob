import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class14 extends class332 {

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "[I")
    private int[] field182;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "[Lgl;")
    public class203[] field180;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "[Lof;")
    public class253[] field195;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "[S")
    public short[] field196;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "[B")
    public byte[] field191;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "[B")
    public byte[] field184;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "[B")
    public byte[] field193;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field188 = 0;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "Z")
    public static boolean field194 = false;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 7)
    public static final void method95(byte arg0) {
        class345.field5346.method1237((byte) 52);
        field183++;
        if (arg0 >= -45) {
            field194 = false;
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V", line = 25)
    public static final void method96(int arg0) {
        if (arg0 == -8650) {
            field187++;
            class62.field770.method1237((byte) 46);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V", line = 37)
    public static final void method97(boolean arg0) {
        field192++;
        class140.field1954.method573(125, 161);
        class140.field1954.method648(client.method1954(!arg0), (byte) 38);
        class140.field1954.method662(true, class188.field2712);
        class140.field1954.method662(!arg0, class314.field4847);
        class140.field1954.method648(class67.field878, (byte) 38);
        if (arg0) {
            method99(-86, -86);
        }
        class19.field250++;
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V", line = 58)
    public final void method98(int arg0) {
        this.field182 = null;
        field190++;
        if (arg0 != 0) {
            method97(false);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V", line = 71)
    public static final void method99(int arg0, int arg1) {
        class271.field4262.method1236(arg0 - 495037018, arg1);
        field189++;
        if (arg0 != 1) {
            method99(31, -6);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[B[ILll;)Z", line = 87)
    public final boolean method100(int arg0, byte[] arg1, int[] arg2, class166 arg3) {
        field185++;
        boolean var5 = true;
        int var6 = arg0;
        class203 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field182[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1088(var9 >> 2, arg2, arg0 ^ 0x64);
                        } else {
                            var7 = arg3.method1090(82, var9 >> 2, arg2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field180[var8] = var7;
                        this.field182[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 147)
    public class14() {
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "([B)V", line = 149)
    public class14(byte[] arg0) {
        this.field182 = new int[128];
        this.field180 = new class203[128];
        this.field195 = new class253[128];
        this.field196 = new short[128];
        this.field191 = new byte[128];
        this.field184 = new byte[128];
        this.field193 = new byte[128];
        class107 var2 = new class107(arg0);
        int var3;
        for (var3 = 0; var2.field1388[var2.field1400 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method679(-3);
        }
        var2.field1400++;
        var3++;
        int var6 = var2.field1400;
        int var7 = 0;
        var2.field1400 += var3;
        while (var2.field1388[var2.field1400 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method679(-3);
        }
        var7++;
        int var10 = 0;
        var2.field1400++;
        int var11 = var2.field1400;
        var2.field1400 += var7;
        while (var2.field1388[var2.field1400 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var2.method679(-3);
        }
        var10++;
        var2.field1400++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            int var16 = 1;
            var14[1] = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var2.method661(-1);
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
        }
        class253[] var19 = new class253[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class253 var21 = var19[var20] = new class253();
            int var22 = var2.method661(-1);
            if (var22 > 0) {
                var21.field3847 = new byte[var22 * 2];
            }
            int var23 = var2.method661(-1);
            if (var23 > 0) {
                var21.field3842 = new byte[var23 * 2 + 2];
                var21.field3842[1] = 64;
            }
        }
        int var24 = var2.method661(-1);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var2.method661(-1);
        byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
        int var28;
        for (var28 = 0; var2.field1388[var2.field1400 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var2.method679(-3);
        }
        var2.field1400++;
        var28++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method661(-1);
            this.field196[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method661(-1);
            this.field196[var34] = (short) (this.field196[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var29.length > var37) {
                    var35 = var29[var37++];
                } else {
                    var35 = -1;
                }
                var36 = var2.method672(32767);
            }
            this.field196[var38] = (short) (this.field196[var38] + (class229.method1613(var36 - 1, 2) << 14));
            var35--;
            this.field182[var38] = var36;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field182[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field1388[var6++] - 1;
                    if (var4.length > var40) {
                        var39 = var4[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                this.field184[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field182[var46] != 0) {
                if (var43 == 0) {
                    var45 = var2.field1388[var11++] + 16 << 2;
                    if (var44 < var8.length) {
                        var43 = var8[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                this.field193[var46] = (byte) var45;
                var43--;
            }
        }
        int var47 = 0;
        class253 var48 = null;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field182[var50] != 0) {
                if (var47 == 0) {
                    var48 = var19[var14[var49]];
                    if (var12.length <= var49) {
                        var47 = -1;
                    } else {
                        var47 = var12[var49++];
                    }
                }
                this.field195[var50] = var48;
                var47--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var52 >= var29.length) {
                    var51 = -1;
                } else {
                    var51 = var29[var52++];
                }
                if (this.field182[var54] > 0) {
                    var53 = var2.method661(-1) + 1;
                }
            }
            this.field191[var54] = (byte) var53;
            var51--;
        }
        this.field186 = var2.method661(-1) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class253 var56 = var19[var55];
            if (var56.field3847 != null) {
                for (int var57 = 1; var57 < var56.field3847.length; var57 += 2) {
                    var56.field3847[var57] = var2.method679(-3);
                }
            }
            if (var56.field3842 != null) {
                for (int var58 = 3; var58 < (var56.field3842.length - 2); var58 += 2) {
                    var56.field3842[var58] = var2.method679(-3);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method679(-3);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var2.method679(-3);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class253 var62 = var19[var61];
            if (var62.field3842 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field3842.length; var64 += 2) {
                    var63 = (var63 + var2.method661(-1)) + 1;
                    var62.field3842[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class253 var66 = var19[var65];
            if (var66.field3847 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field3847.length; var68 += 2) {
                    var67 = var2.method661(-1) + var67 + 1;
                    var66.field3847[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method661(-1);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var2.method661(-1) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field191[var73] = (byte) (this.field191[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                var74 += 2;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class322.method2244(var77, var75 - var71, 127);
                    var77 += var76 - var72;
                    this.field191[var78] = (byte) (this.field191[var78] * var79 + 32 >> 6);
                }
                var72 = var76;
                var71 = var75;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field191[var80] = (byte) (this.field191[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var27 != null) {
            int var82 = var2.method661(-1);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = var2.method661(-1) + var82 + 1;
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field193[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field193[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var27.length) {
                byte var89 = var27[var88];
                int var90 = (var89 - var84) / 2 + (var89 - var84) * var85;
                int var91 = var27[var88 + 1] << 1;
                var88 += 2;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class322.method2244(var90, var89 - var84, 96);
                    int var94 = (this.field193[var92] & 0xFF) + var93;
                    var90 += var91 - var85;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field193[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var91;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field193[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field193[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field3840 = var2.method661(-1);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class253 var100 = var19[var99];
            if (var100.field3847 != null) {
                var100.field3853 = var2.method661(-1);
            }
            if (var100.field3842 != null) {
                var100.field3843 = var2.method661(-1);
            }
            if (var100.field3840 > 0) {
                var100.field3850 = var2.method661(-1);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field3841 = var2.method661(-1);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class253 var103 = var19[var102];
            if (var103.field3841 > 0) {
                var103.field3846 = var2.method661(-1);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class253 var105 = var19[var104];
            if (var105.field3846 > 0) {
                var105.field3852 = var2.method661(-1);
            }
        }
    }
}
