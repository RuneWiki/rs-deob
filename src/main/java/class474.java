import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class474 extends class42 {

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "[S")
    public short[] field6911;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "[B")
    public byte[] field6900;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "[I")
    private int[] field6904;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "[Lcv;")
    public class407[] field6905;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "[Loh;")
    public class285[] field6910;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "[B")
    public byte[] field6902;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "[B")
    public byte[] field6899;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public int field6898;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "Lkj;")
    public static class405 field6907 = new class405("", 10);

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Lbd;")
    public static class44 field6912 = new class44("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public static int field6915 = -1;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "[I")
    public static int[] field6916 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "Lqv;")
    public static class316 field6914 = new class316(59, -2);

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "Lqv;")
    public static class316 field6917 = new class316(68, 8);

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "Lah;")
    public static class267 field6918;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Lci;")
    public static class320 field6906;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([I[BILtk;)Z", line = 7)
    public final boolean method2811(int[] arg0, byte[] arg1, int arg2, class234 arg3) {
        field6909++;
        boolean var5 = true;
        int var6 = 0;
        class407 var7 = null;
        if (arg2 != 1) {
            return false;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field6904[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1554(arg0, var9 >> 2, (byte) 38);
                        } else {
                            var7 = arg3.method1551(-94, arg0, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field6905[var8] = var7;
                        this.field6904[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 67)
    public final void method2812(int arg0) {
        if (arg0 <= 123) {
            this.field6902 = null;
        }
        this.field6904 = null;
        field6908++;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 79)
    public static void method2813(int arg0) {
        field6918 = null;
        field6917 = null;
        field6906 = null;
        if (arg0 != 64) {
            method2813(-11);
        }
        field6916 = null;
        field6912 = null;
        field6914 = null;
        field6907 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I", line = 98)
    public static final int method2814(int arg0, int arg1) {
        field6903++;
        if (arg1 != 6410) {
            method2815(false, null, null);
        }
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 148)
    public class474() {
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLjava/awt/Frame;Lul;)V", line = 151)
    public static final void method2815(boolean arg0, Frame arg1, class411 arg2) {
        field6901++;
        while (true) {
            class81 var3 = arg2.method2444(false, arg1);
            while (var3.field1314 == 0) {
                class477.method2826(10L, 0);
            }
            if (var3.field1314 == 1) {
                arg1.setVisible(arg0);
                arg1.dispose();
                return;
            }
            class477.method2826(100L, 0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "([B)V", line = 173)
    public class474(byte[] arg0) {
        this.field6911 = new short[128];
        this.field6900 = new byte[128];
        this.field6904 = new int[128];
        this.field6905 = new class407[128];
        this.field6910 = new class285[128];
        this.field6902 = new byte[128];
        this.field6899 = new byte[128];
        class519 var2 = new class519(arg0);
        int var3;
        for (var3 = 0; var2.field7545[var2.field7558 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method3034((byte) 76);
        }
        var2.field7558++;
        var3++;
        int var6 = var2.field7558;
        var2.field7558 += var3;
        int var7;
        for (var7 = 0; var2.field7545[var2.field7558 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method3034((byte) 114);
        }
        var7++;
        var2.field7558++;
        int var10 = var2.field7558;
        var2.field7558 += var7;
        int var11;
        for (var11 = 0; var2.field7545[var2.field7558 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method3034((byte) -121);
        }
        var11++;
        var2.field7558++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method3072((byte) -127);
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
        class285[] var19 = new class285[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class285 var103 = var19[var20] = new class285();
            int var104 = var2.method3072((byte) -123);
            if (var104 > 0) {
                var103.field4238 = new byte[var104 * 2];
            }
            int var105 = var2.method3072((byte) -126);
            if (var105 > 0) {
                var103.field4240 = new byte[var105 * 2 + 2];
                var103.field4240[1] = 64;
            }
        }
        int var21 = var2.method3072((byte) -128);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method3072((byte) -123);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field7545[var2.field7558 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method3034((byte) -49);
        }
        var2.field7558++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method3072((byte) -119);
            this.field6911[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method3072((byte) -121);
            this.field6911[var31] = (short) (this.field6911[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method3015(-2097152);
            }
            this.field6911[var35] = (short) (this.field6911[var35] + (class168.method1203(var34 - 1, 2) << 14));
            this.field6904[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field6904[var39] != 0) {
                if (var37 == 0) {
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                    var38 = var2.field7545[var6++] - 1;
                }
                var37--;
                this.field6900[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field6904[var43] != 0) {
                if (var40 == 0) {
                    if (var41 < var8.length) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                    var42 = var2.field7545[var10++] + 16 << 2;
                }
                this.field6899[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class285 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field6904[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                this.field6910[var47] = var46;
                var44--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 >= var26.length) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field6904[var51] > 0) {
                    var50 = var2.method3072((byte) -123) + 1;
                }
            }
            this.field6902[var51] = (byte) var50;
            var49--;
        }
        this.field6898 = var2.method3072((byte) -120) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class285 var100 = var19[var52];
            if (var100.field4238 != null) {
                for (int var101 = 1; var101 < var100.field4238.length; var101 += 2) {
                    var100.field4238[var101] = var2.method3034((byte) -106);
                }
            }
            if (var100.field4240 != null) {
                for (int var102 = 3; var102 < var100.field4240.length - 2; var102 += 2) {
                    var100.field4240[var102] = var2.method3034((byte) 75);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method3034((byte) 109);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method3034((byte) 91);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class285 var97 = var19[var55];
            if (var97.field4240 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field4240.length; var99 += 2) {
                    var98 = var98 + var2.method3072((byte) -128) + 1;
                    var97.field4240[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class285 var94 = var19[var56];
            if (var94.field4238 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field4238.length; var96 += 2) {
                    var95 = var95 + var2.method3072((byte) -127) + 1;
                    var94.field4238[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method3072((byte) -124);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method3072((byte) -125) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field6902[var61] = (byte) (this.field6902[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class436.method2570(var65 - var59, -32476, var67);
                    this.field6902[var68] = (byte) (this.field6902[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var60 = var66;
                var62 += 2;
                var59 = var65;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field6902[var64] = (byte) (this.field6902[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method3072((byte) -121);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method3072((byte) -128) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field6899[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field6899[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class436.method2570(var79 - var72, -32476, var81);
                    int var84 = (this.field6899[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field6899[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var75 += 2;
                var72 = var79;
                var73 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field6899[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field6899[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field4232 = var2.method3072((byte) -123);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class285 var93 = var19[var87];
            if (var93.field4238 != null) {
                var93.field4230 = var2.method3072((byte) -125);
            }
            if (var93.field4240 != null) {
                var93.field4237 = var2.method3072((byte) -120);
            }
            if (var93.field4232 > 0) {
                var93.field4235 = var2.method3072((byte) -125);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field4234 = var2.method3072((byte) -119);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class285 var92 = var19[var89];
            if (var92.field4234 > 0) {
                var92.field4241 = var2.method3072((byte) -124);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class285 var91 = var19[var90];
            if (var91.field4241 > 0) {
                var91.field4236 = var2.method3072((byte) -122);
            }
        }
    }
}
