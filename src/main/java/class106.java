import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class106 extends class119 {

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "[B")
    public byte[] field1969;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "[Lra;")
    public class155[] field1965;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "[B")
    public byte[] field1971;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "[B")
    public byte[] field1967;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "[Lqe;")
    public class150[] field1968;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "[S")
    public short[] field1976;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "[I")
    private int[] field1972;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public int field1974;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "Lai;")
    public static class10 field1963 = class44.method278("cross", 121);

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field1966 = -1;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public final void method683(byte arg0) {
        if (arg0 != -91) {
            this.method685(null, null, -15, null);
        }
        this.field1972 = null;
        field1977++;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
    public static final void method684(int arg0, int arg1) {
        if (arg1 != 26415) {
            method684(15, 53);
        }
        field1970++;
        if (arg0 == -1 && !class61.field1040) {
            class37.method249((byte) -114);
        } else if (arg0 != -1 && (field1966 != arg0 || !class76.method470(0)) && class93.field1688 != 0 && !class61.field1040) {
            class146.method1012(class5.field67, 0, arg0, 2, false, (byte) -30, class93.field1688);
        }
        field1966 = arg0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lcc;[BI[I)Z")
    public final boolean method685(class24 arg0, byte[] arg1, int arg2, int[] arg3) {
        boolean var5 = true;
        field1978++;
        int var6 = 0;
        if (arg2 != -31660) {
            this.method685(null, null, -39, null);
        }
        class150 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field1972[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method162(arg3, 0, var9 >> 2);
                        } else {
                            var7 = arg0.method165(arg3, 0, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1968[var8] = var7;
                        this.field1972[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static void method686(byte arg0) {
        if (arg0 != -89) {
            field1964 = -64;
        }
        field1963 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lgg;")
    public static final class63 method687(Throwable arg0, String arg1) {
        field1962++;
        class63 var2;
        if (arg0 instanceof class63) {
            var2 = (class63) arg0;
            var2.field1055 = var2.field1055 + ' ' + arg1;
        } else {
            var2 = new class63(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lwa;Z)Lai;")
    public static final class10 method688(class200 arg0, boolean arg1) {
        field1975++;
        if (arg1) {
            return null;
        } else if (class166.method1102((byte) 107, class203.method1318(0, arg0)) == 0) {
            return null;
        } else if (arg0.field3803 == null || arg0.field3803.method68(-49).method40((byte) -32) == 0) {
            return class206.field4004 ? class144.field2748 : null;
        } else {
            return arg0.field3803;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class106() {
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
    public class106(byte[] arg0) {
        this.field1969 = new byte[128];
        this.field1965 = new class155[128];
        this.field1971 = new byte[128];
        this.field1967 = new byte[128];
        this.field1968 = new class150[128];
        this.field1976 = new short[128];
        this.field1972 = new int[128];
        class114 var2 = new class114(arg0);
        int var3;
        for (var3 = 0; var2.field2160[var2.field2170 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method759((byte) 127);
        }
        var3++;
        int var6 = 0;
        var2.field2170++;
        int var7 = var2.field2170;
        var2.field2170 += var3;
        while (var2.field2160[var2.field2170 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method759((byte) 127);
        }
        var2.field2170++;
        int var10 = var2.field2170;
        int var11 = 0;
        var6++;
        var2.field2170 += var6;
        while (var2.field2160[var2.field2170 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method759((byte) 127);
        }
        var11++;
        byte[] var14 = new byte[var11];
        var2.field2170++;
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method767(true);
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
        } else {
            var15 = var11;
        }
        class155[] var19 = new class155[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class155 var103 = var19[var20] = new class155();
            int var104 = var2.method767(true);
            if (var104 > 0) {
                var103.field3000 = new byte[var104 * 2];
            }
            int var105 = var2.method767(true);
            if (var105 > 0) {
                var103.field2999 = new byte[var105 * 2 + 2];
                var103.field2999[1] = 64;
            }
        }
        int var21 = var2.method767(true);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = 0;
        int var24 = var2.method767(true);
        while (var2.field2160[var2.field2170 + var23] != 0) {
            var23++;
        }
        byte[] var25 = new byte[var23];
        byte[] var26 = var24 <= 0 ? null : new byte[var24 * 2];
        for (int var27 = 0; var27 < var23; var27++) {
            var25[var27] = var2.method759((byte) 127);
        }
        var2.field2170++;
        int var28 = 0;
        var23++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method767(true);
            this.field1976[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method767(true);
            this.field1976[var31] = (short) (this.field1976[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var34 == 0) {
                if (var33 >= var25.length) {
                    var34 = -1;
                } else {
                    var34 = var25[var33++];
                }
                var32 = var2.method792(true);
            }
            this.field1976[var35] = (short) (this.field1976[var35] + (class123.method861(var32 - 1, 2) << 14));
            this.field1972[var35] = var32;
            var34--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1972[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field2160[var7++] - 1;
                    if (var4.length <= var36) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                }
                var37--;
                this.field1971[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1972[var43] != 0) {
                if (var41 == 0) {
                    var40 = var2.field2160[var10++] + 16 << 2;
                    if (var42 < var8.length) {
                        var41 = var8[var42++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field1969[var43] = (byte) var40;
            }
        }
        class155 var44 = null;
        int var45 = 0;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1972[var47] != 0) {
                if (var45 == 0) {
                    var44 = var19[var14[var46]];
                    if (var12.length <= var46) {
                        var45 = -1;
                    } else {
                        var45 = var12[var46++];
                    }
                }
                var45--;
                this.field1965[var47] = var44;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 < var25.length) {
                    var48 = var25[var49++];
                } else {
                    var48 = -1;
                }
                if (this.field1972[var51] > 0) {
                    var50 = var2.method767(true) + 1;
                }
            }
            var48--;
            this.field1967[var51] = (byte) var50;
        }
        this.field1974 = var2.method767(true) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class155 var100 = var19[var52];
            if (var100.field3000 != null) {
                for (int var101 = 1; var101 < var100.field3000.length; var101 += 2) {
                    var100.field3000[var101] = var2.method759((byte) 127);
                }
            }
            if (var100.field2999 != null) {
                for (int var102 = 3; var102 < var100.field2999.length - 2; var102 += 2) {
                    var100.field2999[var102] = var2.method759((byte) 127);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method759((byte) 127);
            }
        }
        if (var26 != null) {
            for (int var54 = 1; var54 < var26.length; var54 += 2) {
                var26[var54] = var2.method759((byte) 127);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class155 var97 = var19[var55];
            if (var97.field2999 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2999.length; var99 += 2) {
                    var98 += var2.method767(true) + 1;
                    var97.field2999[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class155 var94 = var19[var56];
            if (var94.field3000 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3000.length; var96 += 2) {
                    var95 = var95 + var2.method767(true) + 1;
                    var94.field3000[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method767(true);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method767(true) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field1967[var61] = (byte) (this.field1967[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) * var60 + (var65 - var59) / 2;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class179.method1157(var65 - var59, var67, (byte) 57);
                    this.field1967[var68] = (byte) (this.field1967[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var59 = var65;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field1967[var63] = (byte) (this.field1967[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var26 != null) {
            int var70 = var2.method767(true);
            var26[0] = (byte) var70;
            for (int var71 = 2; var71 < var26.length; var71 += 2) {
                var70 = var2.method767(true) + var70 + 1;
                var26[var71] = (byte) var70;
            }
            byte var72 = var26[0];
            int var73 = var26[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field1969[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1969[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var26.length > var75) {
                int var79 = var26[var75 + 1] << 1;
                byte var80 = var26[var75];
                var75 += 2;
                int var81 = (var80 - var72) * var73 + (var80 - var72) / 2;
                for (int var82 = var72; var82 < var80; var82++) {
                    int var83 = class179.method1157(var80 - var72, var81, (byte) 57);
                    var81 += var79 - var73;
                    int var84 = (this.field1969[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field1969[var82] = (byte) var84;
                }
                var73 = var79;
                var72 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field1969[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1969[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field2994 = var2.method767(true);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class155 var93 = var19[var87];
            if (var93.field3000 != null) {
                var93.field3014 = var2.method767(true);
            }
            if (var93.field2999 != null) {
                var93.field2995 = var2.method767(true);
            }
            if (var93.field2994 > 0) {
                var93.field3002 = var2.method767(true);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field2997 = var2.method767(true);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class155 var92 = var19[var89];
            if (var92.field2997 > 0) {
                var92.field2998 = var2.method767(true);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class155 var91 = var19[var90];
            if (var91.field2998 > 0) {
                var91.field2992 = var2.method767(true);
            }
        }
        if (class180.field3459) {
        }
    }
}
