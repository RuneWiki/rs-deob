import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class85 extends class182 {

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "[Ldb;")
    public class31[] field1565;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "[I")
    private int[] field1568;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "[S")
    public short[] field1564;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "[B")
    public byte[] field1567;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "[Ljb;")
    public class83[] field1566;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "[B")
    public byte[] field1563;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "[B")
    public byte[] field1562;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Lsg;")
    private static class169 field1560 = class165.method1060("Password: ", 1536);

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Lsg;")
    public static class169 field1557 = field1560;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "Lrg;")
    public static class160 field1559 = new class160(5000);

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "[I")
    public static int[] field1570 = new int[100];

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([BLha;I[I)Z")
    public final boolean method511(byte[] arg0, class65 arg1, int arg2, int[] arg3) {
        field1561++;
        boolean var5 = true;
        int var6 = 0;
        class83 var7 = null;
        int var8 = 127 / ((-arg2 - 2) / 60);
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg0 == null || arg0[var9] != 0) {
                int var10 = this.field1568[var9];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg1.method410((byte) -75, var10 >> 2, arg3);
                        } else {
                            var7 = arg1.method407(false, arg3, var10 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1566[var9] = var7;
                        this.field1568[var9] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
    public final void method512(boolean arg0) {
        this.field1568 = null;
        field1569++;
        if (arg0) {
            this.method512(true);
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class85() {
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static void method513(byte arg0) {
        field1560 = null;
        field1559 = null;
        field1570 = null;
        field1557 = null;
        if (arg0 != -122) {
            method513((byte) 77);
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([B)V")
    public class85(byte[] arg0) {
        this.field1565 = new class31[128];
        this.field1568 = new int[128];
        this.field1564 = new short[128];
        this.field1567 = new byte[128];
        int var2 = 0;
        this.field1566 = new class83[128];
        this.field1563 = new byte[128];
        this.field1562 = new byte[128];
        class127 var3 = new class127(arg0);
        while (var3.field2325[var3.field2346 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method824((byte) 88);
        }
        var2++;
        var3.field2346++;
        int var6 = 0;
        int var7 = var3.field2346;
        var3.field2346 += var2;
        while (var3.field2325[var3.field2346 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method824((byte) -78);
        }
        int var10 = 0;
        var3.field2346++;
        int var11 = var3.field2346;
        var6++;
        var3.field2346 += var6;
        while (var3.field2325[var3.field2346 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method824((byte) 120);
        }
        var10++;
        byte[] var14 = new byte[var10];
        var3.field2346++;
        int var15;
        if (var10 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method819((byte) 22);
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
        class31[] var19 = new class31[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class31 var103 = var19[var20] = new class31();
            int var104 = var3.method819((byte) 22);
            if (var104 > 0) {
                var103.field653 = new byte[var104 * 2];
            }
            int var105 = var3.method819((byte) 22);
            if (var105 > 0) {
                var103.field660 = new byte[var105 * 2 + 2];
                var103.field660[1] = 64;
            }
        }
        int var21 = var3.method819((byte) 22);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var3.method819((byte) 22);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var3.field2325[var3.field2346 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var3.method824((byte) -89);
        }
        var25++;
        var3.field2346++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method819((byte) 22);
            this.field1564[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method819((byte) 22);
            this.field1564[var31] = (short) (this.field1564[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var34 == 0) {
                if (var32 < var26.length) {
                    var34 = var26[var32++];
                } else {
                    var34 = -1;
                }
                var33 = var3.method775(124);
            }
            var34--;
            this.field1564[var35] = (short) (this.field1564[var35] + class150.method984(32768, var33 - 1 << 14));
            this.field1568[var35] = var33;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1568[var39] != 0) {
                if (var36 == 0) {
                    if (var4.length > var38) {
                        var36 = var4[var38++];
                    } else {
                        var36 = -1;
                    }
                    var37 = var3.field2325[var7++] - 1;
                }
                this.field1562[var39] = (byte) var37;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1568[var43] != 0) {
                if (var40 == 0) {
                    var42 = var3.field2325[var11++] + 16 << 2;
                    if (var41 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                }
                this.field1567[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class31 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1568[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field1565[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 >= var26.length) {
                    var48 = -1;
                } else {
                    var48 = var26[var49++];
                }
                if (this.field1568[var51] > 0) {
                    var50 = var3.method819((byte) 22) + 1;
                }
            }
            var48--;
            this.field1563[var51] = (byte) var50;
        }
        this.field1558 = var3.method819((byte) 22) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class31 var100 = var19[var52];
            if (var100.field653 != null) {
                for (int var101 = 1; var101 < var100.field653.length; var101 += 2) {
                    var100.field653[var101] = var3.method824((byte) -62);
                }
            }
            if (var100.field660 != null) {
                for (int var102 = 3; var102 < var100.field660.length - 2; var102 += 2) {
                    var100.field660[var102] = var3.method824((byte) -126);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method824((byte) -113);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var3.method824((byte) 61);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class31 var97 = var19[var55];
            if (var97.field660 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field660.length; var99 += 2) {
                    var98 += var3.method819((byte) 22) + 1;
                    var97.field660[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class31 var94 = var19[var56];
            if (var94.field653 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field653.length; var96 += 2) {
                    var95 = var95 + var3.method819((byte) 22) + 1;
                    var94.field653[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method819((byte) 22);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var3.method819((byte) 22) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field1563[var61] = (byte) (this.field1563[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                int var66 = (var65 - var59) * var60 + (var65 - var59) / 2;
                byte var67 = var22[var62 + 1];
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class118.method745((byte) 48, var65 - var59, var66);
                    this.field1563[var68] = (byte) (this.field1563[var68] * var69 + 32 >> 6);
                    var66 += var67 - var60;
                }
                var60 = var67;
                var62 += 2;
                var59 = var65;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field1563[var64] = (byte) (this.field1563[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var3.method819((byte) 22);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var3.method819((byte) 22) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field1567[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1567[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class118.method745((byte) 48, var79 - var72, var81);
                    var81 += var80 - var73;
                    int var84 = (this.field1567[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field1567[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field1567[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1567[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field654 = var3.method819((byte) 22);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class31 var93 = var19[var87];
            if (var93.field653 != null) {
                var93.field657 = var3.method819((byte) 22);
            }
            if (var93.field660 != null) {
                var93.field669 = var3.method819((byte) 22);
            }
            if (var93.field654 > 0) {
                var93.field662 = var3.method819((byte) 22);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field655 = var3.method819((byte) 22);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class31 var92 = var19[var89];
            if (var92.field655 > 0) {
                var92.field666 = var3.method819((byte) 22);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class31 var91 = var19[var90];
            if (var91.field666 > 0) {
                var91.field650 = var3.method819((byte) 22);
            }
        }
    }
}
