import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class315 extends class276 {

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "[I")
    private int[] field4965;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "[B")
    public byte[] field4964;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "[B")
    public byte[] field4955;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "[B")
    public byte[] field4959;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "[S")
    public short[] field4957;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "[Lmg;")
    public class168[] field4963;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "[Lvc;")
    public class99[] field4956;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public int field4958;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "[I")
    public static int[] field4960 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "Lvv;")
    public static class313 field4952 = new class313(10, -1);

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "[Lo;")
    public static class138[] field4961;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)V", line = 7)
    public static final void method1997(int arg0, int arg1) {
        if (arg0 != 0) {
            method1997(116, 26);
        }
        field4954++;
        class266 var2 = class308.method1961(true, arg1, 10);
        var2.method1778(17991);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V", line = 29)
    public final void method1998(byte arg0) {
        field4953++;
        if (arg0 > 64) {
            this.field4965 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([I[BILvm;)Z", line = 43)
    public final boolean method1999(int[] arg0, byte[] arg1, int arg2, class146 arg3) {
        field4962++;
        boolean var5 = true;
        int var6 = 0;
        class168 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field4965[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1064(var9 >> 2, arg0, 765);
                        } else {
                            var7 = arg3.method1060(arg0, 83, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4963[var8] = var7;
                        this.field4965[var8] = 0;
                    }
                }
            }
        }
        if (arg2 > -19) {
            return false;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 105)
    public static void method2000(int arg0) {
        if (arg0 != 2) {
            method1997(40, 59);
        }
        field4960 = null;
        field4952 = null;
        field4961 = null;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V", line = 124)
    public class315() {
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([B)V", line = 126)
    public class315(byte[] arg0) {
        this.field4965 = new int[128];
        this.field4964 = new byte[128];
        this.field4955 = new byte[128];
        this.field4959 = new byte[128];
        this.field4957 = new short[128];
        this.field4963 = new class168[128];
        this.field4956 = new class99[128];
        class23 var2 = new class23(arg0);
        int var3;
        for (var3 = 0; var2.field302[var2.field301 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method167(-2);
        }
        var3++;
        var2.field301++;
        int var6 = var2.field301;
        var2.field301 += var3;
        int var7;
        for (var7 = 0; var2.field302[var2.field301 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method167(-2);
        }
        var2.field301++;
        var7++;
        int var10 = var2.field301;
        var2.field301 += var7;
        int var11;
        for (var11 = 0; var2.field302[var2.field301 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method167(-2);
        }
        var11++;
        var2.field301++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method126((byte) -85);
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
        class99[] var19 = new class99[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class99 var103 = var19[var20] = new class99();
            int var104 = var2.method126((byte) -83);
            if (var104 > 0) {
                var103.field1654 = new byte[var104 * 2];
            }
            int var105 = var2.method126((byte) -77);
            if (var105 > 0) {
                var103.field1646 = new byte[var105 * 2 + 2];
                var103.field1646[1] = 64;
            }
        }
        int var21 = var2.method126((byte) -83);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method126((byte) -83);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field302[var2.field301 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method167(-2);
        }
        var25++;
        var2.field301++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method126((byte) -75);
            this.field4957[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method126((byte) -79);
            this.field4957[var31] = (short) (this.field4957[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length > var33) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method169((byte) -70);
            }
            this.field4957[var35] = (short) (this.field4957[var35] + (class344.method2224(2, var34 - 1) << 14));
            this.field4965[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4965[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field302[var6++] - 1;
                    if (var4.length > var37) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                }
                var36--;
                this.field4964[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4965[var43] != 0) {
                if (var41 == 0) {
                    if (var8.length <= var40) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                    var42 = var2.field302[var10++] + 16 << 2;
                }
                this.field4959[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class99 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4965[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length > var45) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field4956[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length <= var48) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field4965[var51] > 0) {
                    var50 = var2.method126((byte) -93) + 1;
                }
            }
            var49--;
            this.field4955[var51] = (byte) var50;
        }
        this.field4958 = var2.method126((byte) -75) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class99 var100 = var19[var52];
            if (var100.field1654 != null) {
                for (int var101 = 1; var101 < var100.field1654.length; var101 += 2) {
                    var100.field1654[var101] = var2.method167(-2);
                }
            }
            if (var100.field1646 != null) {
                for (int var102 = 3; var102 < (var100.field1646.length - 2); var102 += 2) {
                    var100.field1646[var102] = var2.method167(-2);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method167(-2);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method167(-2);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class99 var97 = var19[var55];
            if (var97.field1646 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1646.length; var99 += 2) {
                    var98 = var2.method126((byte) -100) + (var98 + 1);
                    var97.field1646[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class99 var94 = var19[var56];
            if (var94.field1654 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1654.length; var96 += 2) {
                    var95 += var2.method126((byte) -91) + 1;
                    var94.field1654[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method126((byte) -92);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method126((byte) -126) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field4955[var61] = (byte) (this.field4955[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class285.method1855(var67, var65 - var59, 936463231);
                    this.field4955[var68] = (byte) (this.field4955[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var60 = var66;
                var62 += 2;
                var59 = var65;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field4955[var64] = (byte) (this.field4955[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method126((byte) -128);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method126((byte) -101) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field4959[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4959[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class285.method1855(var81, var79 - var72, 936463231);
                    int var84 = (this.field4959[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field4959[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var73 = var80;
                var75 += 2;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field4959[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4959[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field1651 = var2.method126((byte) -94);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class99 var93 = var19[var87];
            if (var93.field1654 != null) {
                var93.field1645 = var2.method126((byte) -112);
            }
            if (var93.field1646 != null) {
                var93.field1643 = var2.method126((byte) -104);
            }
            if (var93.field1651 > 0) {
                var93.field1644 = var2.method126((byte) -93);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field1653 = var2.method126((byte) -109);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class99 var92 = var19[var89];
            if (var92.field1653 > 0) {
                var92.field1652 = var2.method126((byte) -88);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class99 var91 = var19[var90];
            if (var91.field1652 > 0) {
                var91.field1649 = var2.method126((byte) -100);
            }
        }
    }
}
