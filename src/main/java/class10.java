import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 extends class137 {

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "[B")
    public byte[] field264;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "[S")
    public short[] field256;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "[B")
    public byte[] field269;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "[Lhb;")
    public class51[] field260;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "[Lvb;")
    public class146[] field265;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "[I")
    private int[] field259;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "[B")
    public byte[] field276;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "Laf;")
    public static class7 field262 = class48.method406(40, "");

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "[I")
    public static int[] field263 = new int[1000];

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field267 = 0;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Laf;")
    public static class7 field266 = class48.method406(40, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Lbd;")
    public static class12 field255 = new class12(32);

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "Laf;")
    public static class7 field271 = class48.method406(40, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "Laf;")
    public static class7 field272 = class48.method406(40, "");

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public static int field274 = 0;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "[Laf;")
    public static class7[] field277 = new class7[200];

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "Lac;")
    public static class4 field278;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)Laf;")
    public static final class7 method112(int arg0, boolean arg1) {
        if (arg1) {
            field271 = null;
        }
        class7 var2 = new class7();
        field258++;
        var2.field139 = 0;
        var2.field162 = new byte[arg0];
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lq;[BI[I)Z")
    public final boolean method113(class111 arg0, byte[] arg1, int arg2, int[] arg3) {
        field268++;
        boolean var5 = true;
        if (arg2 != -1985879774) {
            method114(null, null, (byte) -75);
        }
        class146 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field259[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg0.method881(0, arg3, var9 >> 2);
                        } else {
                            var6 = arg0.method883(-1224257596, var9 >> 2, arg3);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field265[var8] = var6;
                        this.field259[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Laf;Lrd;B)I")
    public static final int method114(class7 arg0, class122 arg1, byte arg2) {
        if (arg2 > -2) {
            return -84;
        }
        int var3 = arg1.field2903;
        field257++;
        arg1.method944(98, arg0.field139);
        arg1.field2903 += field278.method23(0, 0, arg1.field2903, arg0.field139, arg1.field2895, arg0.field162);
        return arg1.field2903 - var3;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
    public final void method115(byte arg0) {
        this.field259 = null;
        field273++;
        if (arg0 != -19) {
            method116((byte) 87);
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
    public static void method116(byte arg0) {
        field277 = null;
        field271 = null;
        field278 = null;
        field266 = null;
        field262 = null;
        field255 = null;
        field272 = null;
        if (arg0 < 79) {
            method114(null, null, (byte) -2);
        }
        field263 = null;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class10() {
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([B)V")
    public class10(byte[] arg0) {
        this.field264 = new byte[128];
        this.field256 = new short[128];
        this.field269 = new byte[128];
        this.field260 = new class51[128];
        this.field265 = new class146[128];
        this.field259 = new int[128];
        this.field276 = new byte[128];
        int var2 = 0;
        class122 var3 = new class122(arg0);
        while (var3.field2895[var3.field2903 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method977(true);
        }
        var2++;
        int var6 = 0;
        var3.field2903++;
        int var7 = var3.field2903;
        var3.field2903 += var2;
        while (var3.field2895[var3.field2903 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method977(true);
        }
        var3.field2903++;
        int var10 = 0;
        var6++;
        int var11 = var3.field2903;
        var3.field2903 += var6;
        while (var3.field2895[var3.field2903 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method977(true);
        }
        var10++;
        var3.field2903++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var15 = 2;
            int var16 = 1;
            var14[1] = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method931((byte) 124);
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
            var15 = var10;
        }
        class51[] var19 = new class51[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class51 var103 = var19[var20] = new class51();
            int var104 = var3.method931((byte) 124);
            if (var104 > 0) {
                var103.field1228 = new byte[var104 * 2];
            }
            int var105 = var3.method931((byte) 124);
            if (var105 > 0) {
                var103.field1212 = new byte[var105 * 2 + 2];
                var103.field1212[1] = 64;
            }
        }
        int var21 = var3.method931((byte) 124);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var3.method931((byte) 124);
        int var24 = 0;
        byte[] var25 = var23 > 0 ? new byte[var23 * 2] : null;
        while (var3.field2895[var3.field2903 + var24] != 0) {
            var24++;
        }
        byte[] var26 = new byte[var24];
        for (int var27 = 0; var27 < var24; var27++) {
            var26[var27] = var3.method977(true);
        }
        var24++;
        var3.field2903++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method931((byte) 124);
            this.field256[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method931((byte) 124);
            this.field256[var31] = (short) (this.field256[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length > var34) {
                    var32 = var26[var34++];
                } else {
                    var32 = -1;
                }
                var33 = var3.method949(255);
            }
            var32--;
            this.field256[var35] = (short) (this.field256[var35] + (class84.method705(2, var33 - 1) << 14));
            this.field259[var35] = var33;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field259[var39] != 0) {
                if (var38 == 0) {
                    var37 = var3.field2895[var7++] - 1;
                    if (var36 < var4.length) {
                        var38 = var4[var36++];
                    } else {
                        var38 = -1;
                    }
                }
                this.field264[var39] = (byte) var37;
                var38--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field259[var43] != 0) {
                if (var42 == 0) {
                    if (var8.length > var40) {
                        var42 = var8[var40++];
                    } else {
                        var42 = -1;
                    }
                    var41 = var3.field2895[var11++] + 16 << 2;
                }
                var42--;
                this.field276[var43] = (byte) var41;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class51 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field259[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length > var45) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field260[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 < var26.length) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field259[var51] > 0) {
                    var50 = var3.method931((byte) 124) + 1;
                }
            }
            this.field269[var51] = (byte) var50;
            var49--;
        }
        this.field261 = var3.method931((byte) 124) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class51 var100 = var19[var52];
            if (var100.field1228 != null) {
                for (int var101 = 1; var101 < var100.field1228.length; var101 += 2) {
                    var100.field1228[var101] = var3.method977(true);
                }
            }
            if (var100.field1212 != null) {
                for (int var102 = 3; var102 < var100.field1212.length - 2; var102 += 2) {
                    var100.field1212[var102] = var3.method977(true);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method977(true);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method977(true);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class51 var97 = var19[var55];
            if (var97.field1212 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1212.length; var99 += 2) {
                    var98 = var3.method931((byte) 124) + var98 + 1;
                    var97.field1212[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class51 var94 = var19[var56];
            if (var94.field1228 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1228.length; var96 += 2) {
                    var95 = var3.method931((byte) 124) + var95 + 1;
                    var94.field1228[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method931((byte) 124);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var3.method931((byte) 124) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field269[var61] = (byte) (this.field269[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                int var66 = (var65 - var59) / 2 + (var65 - var59) * var60;
                byte var67 = var22[var62 + 1];
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class66.method534(var66, var65 - var59, (byte) -4);
                    var66 += var67 - var60;
                    this.field269[var68] = (byte) (this.field269[var68] * var69 + 32 >> 6);
                }
                var60 = var67;
                var59 = var65;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field269[var64] = (byte) (this.field269[var64] * var60 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var3.method931((byte) 124);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var3.method931((byte) 124) + var70 + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field276[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field276[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                int var79 = var25[var75 + 1] << 1;
                byte var80 = var25[var75];
                int var81 = (var80 - var72) / 2 + (var80 - var72) * var73;
                var75 += 2;
                for (int var82 = var72; var82 < var80; var82++) {
                    int var83 = class66.method534(var81, var80 - var72, (byte) -4);
                    var81 += var79 - var73;
                    int var84 = (this.field276[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field276[var82] = (byte) var84;
                }
                var72 = var80;
                var73 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field276[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field276[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field1213 = var3.method931((byte) 124);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class51 var93 = var19[var87];
            if (var93.field1228 != null) {
                var93.field1229 = var3.method931((byte) 124);
            }
            if (var93.field1212 != null) {
                var93.field1231 = var3.method931((byte) 124);
            }
            if (var93.field1213 > 0) {
                var93.field1217 = var3.method931((byte) 124);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field1226 = var3.method931((byte) 124);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class51 var92 = var19[var89];
            if (var92.field1226 > 0) {
                var92.field1208 = var3.method931((byte) 124);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class51 var91 = var19[var90];
            if (var91.field1208 > 0) {
                var91.field1219 = var3.method931((byte) 124);
            }
        }
    }
}
