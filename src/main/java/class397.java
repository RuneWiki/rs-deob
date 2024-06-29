import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class397 extends class168 {

    @OriginalMember(owner = "client!br", name = "k", descriptor = "[B")
    public byte[] field5063;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "[Lfca;")
    public class86[] field5067;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "[Lct;")
    public class148[] field5066;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "[B")
    public byte[] field5074;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "[I")
    private int[] field5065;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "[B")
    public byte[] field5072;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "[S")
    public short[] field5070;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    public int field5071;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "Lhg;")
    public static class693 field5069 = new class693(73, 3);

    @OriginalMember(owner = "client!br", name = "u", descriptor = "Lbw;")
    public static class690 field5073 = new class690(0, 0);

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I[I[BLcm;)Z", line = 12)
    public final boolean method2232(int arg0, int[] arg1, byte[] arg2, class731 arg3) {
        field5068++;
        boolean var5 = true;
        if (arg0 != 11083) {
            return false;
        }
        int var6 = 0;
        class148 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field5065[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method4080(var9 >> 2, arg1, (byte) 125);
                        } else {
                            var7 = arg3.method4078(arg1, var9 >> 2, (byte) 32);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field5066[var8] = var7;
                        this.field5065[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 72)
    public final void method2233(int arg0) {
        field5064++;
        this.field5065 = null;
        if (arg0 >= -76) {
            this.method2232(29, null, null, null);
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(III)I", line = 86)
    public static final int method2234(int arg0, int arg1, int arg2) {
        field5062++;
        int var3 = arg1 >>> 24;
        if (arg0 >= -83) {
            method2235((byte) 50);
        }
        int var4 = 255 - var3;
        int var5 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        return (((arg2 & 0xFF00) * var4 & 0xFF0000 | (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V", line = 113)
    public class397() {
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "([B)V", line = 115)
    public class397(byte[] arg0) {
        this.field5063 = new byte[128];
        this.field5067 = new class86[128];
        this.field5066 = new class148[128];
        this.field5074 = new byte[128];
        this.field5065 = new int[128];
        this.field5072 = new byte[128];
        this.field5070 = new short[128];
        class461 var2 = new class461(arg0);
        int var3;
        for (var3 = 0; var2.field6180[var2.field6193 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2601(0);
        }
        var2.field6193++;
        var3++;
        int var6 = var2.field6193;
        var2.field6193 += var3;
        int var7;
        for (var7 = 0; var2.field6180[var2.field6193 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2601(0);
        }
        var7++;
        var2.field6193++;
        int var10 = var2.field6193;
        var2.field6193 += var7;
        int var11;
        for (var11 = 0; var2.field6180[var2.field6193 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2601(0);
        }
        var2.field6193++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method2600((byte) -125);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class86[] var18 = new class86[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class86 var102 = var18[var19] = new class86();
            int var103 = var2.method2600((byte) -127);
            if (var103 > 0) {
                var102.field1192 = new byte[var103 * 2];
            }
            int var104 = var2.method2600((byte) -124);
            if (var104 > 0) {
                var102.field1186 = new byte[var104 * 2 + 2];
                var102.field1186[1] = 64;
            }
        }
        int var20 = var2.method2600((byte) -128);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method2600((byte) -124);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field6180[var2.field6193 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method2601(0);
        }
        var2.field6193++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method2600((byte) -126);
            this.field5070[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method2600((byte) -128);
            this.field5070[var30] = (short) (this.field5070[var30] + (var29 << 8));
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
                var33 = var2.method2609(514710565);
            }
            this.field5070[var34] = (short) (this.field5070[var34] + (class702.method3949(var33 - 1, 2) << 14));
            this.field5065[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field5065[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field6180[var6++] - 1;
                    if (var36 < var4.length) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                }
                this.field5074[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field5065[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field6180[var10++] + 16 << 2;
                    if (var40 < var8.length) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                this.field5072[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class86 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field5065[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length > var43) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field5067[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length > var48) {
                    var47 = var25[var48++];
                } else {
                    var47 = -1;
                }
                if (this.field5065[var50] > 0) {
                    var49 = var2.method2600((byte) -125) + 1;
                }
            }
            var47--;
            this.field5063[var50] = (byte) var49;
        }
        this.field5071 = var2.method2600((byte) -123) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class86 var99 = var18[var51];
            if (var99.field1192 != null) {
                for (int var100 = 1; var100 < var99.field1192.length; var100 += 2) {
                    var99.field1192[var100] = var2.method2601(0);
                }
            }
            if (var99.field1186 != null) {
                for (int var101 = 3; var101 < (var99.field1186.length - 2); var101 += 2) {
                    var99.field1186[var101] = var2.method2601(0);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method2601(0);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method2601(0);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class86 var96 = var18[var54];
            if (var96.field1186 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1186.length; var98 += 2) {
                    var97 = var2.method2600((byte) -124) + (var97 + 1);
                    var96.field1186[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class86 var93 = var18[var55];
            if (var93.field1192 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1192.length; var95 += 2) {
                    var94 = var94 + var2.method2600((byte) -125) + 1;
                    var93.field1192[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method2600((byte) -125);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var2.method2600((byte) -123) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field5063[var60] = (byte) (this.field5063[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class673.method3778(var64 - var58, var66, -247);
                    var66 += var65 - var59;
                    this.field5063[var67] = (byte) (this.field5063[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var61 += 2;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field5063[var63] = (byte) (this.field5063[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method2600((byte) -124);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method2600((byte) -127) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field5072[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field5072[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class673.method3778(var78 - var71, var80, -247);
                    int var83 = (this.field5072[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field5072[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field5072[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field5072[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1196 = var2.method2600((byte) -127);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class86 var92 = var18[var86];
            if (var92.field1192 != null) {
                var92.field1187 = var2.method2600((byte) -123);
            }
            if (var92.field1186 != null) {
                var92.field1188 = var2.method2600((byte) -125);
            }
            if (var92.field1196 > 0) {
                var92.field1199 = var2.method2600((byte) -128);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1198 = var2.method2600((byte) -125);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class86 var91 = var18[var88];
            if (var91.field1198 > 0) {
                var91.field1202 = var2.method2600((byte) -127);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class86 var90 = var18[var89];
            if (var90.field1202 > 0) {
                var90.field1190 = var2.method2600((byte) -125);
            }
        }
        if (class476.field6437) {
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V", line = 756)
    public static void method2235(byte arg0) {
        field5069 = null;
        if (arg0 >= -22) {
            field5069 = null;
        }
        field5073 = null;
    }
}
