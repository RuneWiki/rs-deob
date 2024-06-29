import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class444 extends class184 {

    @OriginalMember(owner = "client!os", name = "y", descriptor = "[I")
    private int[] field6603;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "[B")
    public byte[] field6592;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "[B")
    public byte[] field6602;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "[B")
    public byte[] field6593;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "[Lsk;")
    public class625[] field6596;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "[Lut;")
    public class125[] field6601;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "[S")
    public short[] field6600;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    public int field6591;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field6595 = 1339;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "I")
    public static int field6604 = -1;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "F")
    public static float field6599;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 4)
    public final void method2752(int arg0) {
        field6598++;
        this.field6603 = null;
        if (arg0 <= 39) {
            method2753(-18, -91, true, -58, -58, -22);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIZIII)V", line = 18)
    public static final void method2753(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field6597++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var6 = arg0 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class697.field9613 - class57.field797) * var6 / 100 + class57.field797;
        if (class647.field9116 > var7) {
            var7 = class647.field9116;
        } else if (class333.field4781 < var7) {
            var7 = class333.field4781;
        }
        int var8 = arg0 * var7 * 512 / (arg3 * 334);
        if (var8 < class554.field7908) {
            short var12 = class554.field7908;
            var7 = arg3 * var12 * 334 / (arg0 * 512);
            if (class333.field4781 < var7) {
                var7 = class333.field4781;
                int var13 = arg0 * var7 * 512 / (var12 * 334);
                int var14 = (arg3 - var13) / 2;
                if (arg2) {
                    class736.field10316.method469();
                    class736.field10316.method482(arg1, -16777216, var14, 1, arg4, arg0);
                    class736.field10316.method482(arg1 + arg3 - var14, -16777216, var14, 1, arg4, arg0);
                }
                arg3 -= var14 * 2;
                arg1 += var14;
            }
        } else if (var8 > class87.field1247) {
            short var9 = class87.field1247;
            var7 = arg3 * var9 * 334 / (arg0 * 512);
            if (var7 < class647.field9116) {
                var7 = class647.field9116;
                int var10 = arg3 * var9 * 334 / (var7 * 512);
                int var11 = (arg0 - var10) / 2;
                if (arg2) {
                    class736.field10316.method469();
                    class736.field10316.method482(arg1, -16777216, arg3, 1, arg4, var11);
                    class736.field10316.method482(arg1, -16777216, arg3, 1, arg4 + arg0 - var11, var11);
                }
                arg4 += var11;
                arg0 -= var11 * 2;
            }
        }
        class43.field471 = arg1;
        class309.field4384 = arg0 * var7 / 334;
        class622.field8734 = (short) arg3;
        class548.field7826 = (short) arg0;
        class191.field2890 = arg4;
        if (arg5 != 2514) {
            field6595 = 77;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([IILpea;[B)Z", line = 111)
    public final boolean method2754(int[] arg0, int arg1, class727 arg2, byte[] arg3) {
        field6594++;
        boolean var5 = true;
        int var6 = 0;
        class125 var7 = null;
        if (arg1 <= 95) {
            this.method2752(36);
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field6603[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method4099((byte) 1, arg0, var9 >> 2);
                        } else {
                            var7 = arg2.method4096(31360, var9 >> 2, arg0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field6601[var8] = var7;
                        this.field6603[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V", line = 184)
    public class444() {
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "([B)V", line = 186)
    public class444(byte[] arg0) {
        this.field6603 = new int[128];
        this.field6592 = new byte[128];
        this.field6602 = new byte[128];
        this.field6593 = new byte[128];
        this.field6596 = new class625[128];
        this.field6601 = new class125[128];
        this.field6600 = new short[128];
        class645 var2 = new class645(arg0);
        int var3;
        for (var3 = 0; var2.field9068[var2.field9084 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method3743(true);
        }
        var3++;
        var2.field9084++;
        int var6 = var2.field9084;
        var2.field9084 += var3;
        int var7;
        for (var7 = 0; var2.field9068[var2.field9084 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method3743(true);
        }
        var2.field9084++;
        var7++;
        int var10 = var2.field9084;
        var2.field9084 += var7;
        int var11;
        for (var11 = 0; var2.field9068[var2.field9084 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method3743(true);
        }
        var11++;
        var2.field9084++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method3745(-6314);
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
        class625[] var18 = new class625[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class625 var102 = var18[var19] = new class625();
            int var103 = var2.method3745(-6314);
            if (var103 > 0) {
                var102.field8743 = new byte[var103 * 2];
            }
            int var104 = var2.method3745(-6314);
            if (var104 > 0) {
                var102.field8744 = new byte[var104 * 2 + 2];
                var102.field8744[1] = 64;
            }
        }
        int var20 = var2.method3745(-6314);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method3745(-6314);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field9068[var2.field9084 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method3743(true);
        }
        var2.field9084++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method3745(-6314);
            this.field6600[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method3745(-6314);
            this.field6600[var30] = (short) (this.field6600[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 < var25.length) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var2.method3716((byte) -128);
            }
            this.field6600[var34] = (short) (this.field6600[var34] + class493.method2943(var33 - 1 << 14, 32768));
            var31--;
            this.field6603[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field6603[var38] != 0) {
                if (var36 == 0) {
                    if (var4.length > var35) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                    var37 = var2.field9068[var6++] - 1;
                }
                this.field6602[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field6603[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field9068[var10++] + 16 << 2;
                    if (var8.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                }
                var39--;
                this.field6592[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class625 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field6603[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length <= var43) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                var44--;
                this.field6596[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length > var47) {
                    var48 = var25[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field6603[var50] > 0) {
                    var49 = var2.method3745(-6314) + 1;
                }
            }
            this.field6593[var50] = (byte) var49;
            var48--;
        }
        this.field6591 = var2.method3745(-6314) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class625 var99 = var18[var51];
            if (var99.field8743 != null) {
                for (int var100 = 1; var100 < var99.field8743.length; var100 += 2) {
                    var99.field8743[var100] = var2.method3743(true);
                }
            }
            if (var99.field8744 != null) {
                for (int var101 = 3; var101 < var99.field8744.length - 2; var101 += 2) {
                    var99.field8744[var101] = var2.method3743(true);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method3743(true);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method3743(true);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class625 var96 = var18[var54];
            if (var96.field8744 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field8744.length; var98 += 2) {
                    var97 = var2.method3745(-6314) + var97 + 1;
                    var96.field8744[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class625 var93 = var18[var55];
            if (var93.field8743 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field8743.length; var95 += 2) {
                    var94 = var2.method3745(-6314) + var94 + 1;
                    var93.field8743[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method3745(-6314);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method3745(-6314) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field6593[var60] = (byte) (this.field6593[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class441.method2736((byte) -110, var64 - var58, var66);
                    var66 += var65 - var59;
                    this.field6593[var67] = (byte) (this.field6593[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field6593[var62] = (byte) (this.field6593[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method3745(-6314);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method3745(-6314) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field6592[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field6592[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) * var72 + ((var78 - var71) / 2);
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class441.method2736((byte) -77, var78 - var71, var80);
                    int var83 = (this.field6592[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field6592[var81] = (byte) var83;
                }
                var72 = var79;
                var74 += 2;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field6592[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field6592[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field8749 = var2.method3745(-6314);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class625 var92 = var18[var86];
            if (var92.field8743 != null) {
                var92.field8751 = var2.method3745(-6314);
            }
            if (var92.field8744 != null) {
                var92.field8745 = var2.method3745(-6314);
            }
            if (var92.field8749 > 0) {
                var92.field8750 = var2.method3745(-6314);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field8753 = var2.method3745(-6314);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class625 var91 = var18[var88];
            if (var91.field8753 > 0) {
                var91.field8746 = var2.method3745(-6314);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class625 var90 = var18[var89];
            if (var90.field8746 > 0) {
                var90.field8748 = var2.method3745(-6314);
            }
        }
    }
}
