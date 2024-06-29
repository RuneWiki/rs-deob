import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class105 extends class499 {

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "[Lnv;")
    public class286[] field1423;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "[B")
    public byte[] field1419;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "[Lei;")
    public class116[] field1428;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "[B")
    public byte[] field1422;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "[S")
    public short[] field1424;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "[I")
    private int[] field1429;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "[B")
    public byte[] field1420;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "Lfg;")
    public static class83 field1432 = new class83("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field1434 = 0;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "Lwo;")
    public static class522 field1433 = new class522();

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field1436 = 0;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "[[I")
    public static int[][] field1438 = new int[6][];

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Lgv;")
    public static class56 field1430;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[BLtm;I)Z", line = 4)
    public final boolean method684(int[] arg0, byte[] arg1, class264 arg2, int arg3) {
        field1421++;
        if (arg3 != 1019323106) {
            field1435 = -121;
        }
        boolean var5 = true;
        int var6 = 0;
        class286 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field1429[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1523(var9 >> 2, (byte) 123, arg0);
                        } else {
                            var7 = arg2.method1526(false, arg0, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1423[var8] = var7;
                        this.field1429[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 65)
    public final void method685(int arg0) {
        if (arg0 != 2) {
            method688((byte) 71);
        }
        this.field1429 = null;
        field1426++;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)Z", line = 85)
    public static final boolean method686(int arg0) {
        if (arg0 <= 11) {
            field1438 = null;
        }
        field1427++;
        return class510.field7488 == 0 ? class45.field638.method2010(true) : true;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 103)
    public class105() {
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B)V", line = 106)
    public class105(byte[] arg0) {
        this.field1423 = new class286[128];
        this.field1419 = new byte[128];
        this.field1428 = new class116[128];
        this.field1422 = new byte[128];
        this.field1424 = new short[128];
        this.field1429 = new int[128];
        this.field1420 = new byte[128];
        class365 var2 = new class365(arg0);
        int var3;
        for (var3 = 0; var2.field5073[var2.field5069 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2081((byte) 108);
        }
        var2.field5069++;
        var3++;
        int var6 = var2.field5069;
        var2.field5069 += var3;
        int var7;
        for (var7 = 0; var2.field5073[var2.field5069 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2081((byte) 0);
        }
        var2.field5069++;
        var7++;
        int var10 = var2.field5069;
        var2.field5069 += var7;
        int var11;
        for (var11 = 0; var2.field5073[var2.field5069 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2081((byte) 111);
        }
        var11++;
        var2.field5069++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2099(255);
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
        class116[] var19 = new class116[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class116 var103 = var19[var20] = new class116();
            int var104 = var2.method2099(255);
            if (var104 > 0) {
                var103.field1563 = new byte[var104 * 2];
            }
            int var105 = var2.method2099(255);
            if (var105 > 0) {
                var103.field1570 = new byte[var105 * 2 + 2];
                var103.field1570[1] = 64;
            }
        }
        int var21 = var2.method2099(255);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method2099(255);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field5073[var2.field5069 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method2081((byte) -112);
        }
        var2.field5069++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method2099(255);
            this.field1424[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method2099(255);
            this.field1424[var31] = (short) (this.field1424[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 < var26.length) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method2077(-1);
            }
            this.field1424[var35] = (short) (this.field1424[var35] + class118.method750(var34 - 1 << 14, 32768));
            var32--;
            this.field1429[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1429[var39] != 0) {
                if (var36 == 0) {
                    if (var37 < var4.length) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                    var38 = var2.field5073[var6++] - 1;
                }
                var36--;
                this.field1422[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1429[var43] != 0) {
                if (var40 == 0) {
                    if (var8.length > var41) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                    var42 = var2.field5073[var10++] + 16 << 2;
                }
                this.field1420[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class116 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1429[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 < var12.length) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field1428[var47] = var46;
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
                if (this.field1429[var51] > 0) {
                    var50 = var2.method2099(255) + 1;
                }
            }
            var49--;
            this.field1419[var51] = (byte) var50;
        }
        this.field1425 = var2.method2099(255) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class116 var100 = var19[var52];
            if (var100.field1563 != null) {
                for (int var101 = 1; var101 < var100.field1563.length; var101 += 2) {
                    var100.field1563[var101] = var2.method2081((byte) -74);
                }
            }
            if (var100.field1570 != null) {
                for (int var102 = 3; var102 < (var100.field1570.length - 2); var102 += 2) {
                    var100.field1570[var102] = var2.method2081((byte) 111);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method2081((byte) -6);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method2081((byte) 92);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class116 var97 = var19[var55];
            if (var97.field1570 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1570.length; var99 += 2) {
                    var98 = var2.method2099(255) + var98 + 1;
                    var97.field1570[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class116 var94 = var19[var56];
            if (var94.field1563 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1563.length; var96 += 2) {
                    var95 -= -var2.method2099(255) - 1;
                    var94.field1563[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method2099(255);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method2099(255) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field1419[var61] = (byte) (this.field1419[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class386.method2224(var65 - var59, (byte) 74, var67);
                    var67 += var66 - var60;
                    this.field1419[var68] = (byte) (this.field1419[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field1419[var63] = (byte) (this.field1419[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method2099(255);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var2.method2099(255) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field1420[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1420[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var24.length; var75 += 2) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class386.method2224(var79 - var72, (byte) 74, var81);
                    int var84 = (this.field1420[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field1420[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field1420[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1420[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field1568 = var2.method2099(255);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class116 var93 = var19[var87];
            if (var93.field1563 != null) {
                var93.field1565 = var2.method2099(255);
            }
            if (var93.field1570 != null) {
                var93.field1572 = var2.method2099(255);
            }
            if (var93.field1568 > 0) {
                var93.field1571 = var2.method2099(255);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field1562 = var2.method2099(255);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class116 var92 = var19[var89];
            if (var92.field1562 > 0) {
                var92.field1566 = var2.method2099(255);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class116 var91 = var19[var90];
            if (var91.field1566 > 0) {
                var91.field1567 = var2.method2099(255);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)Z", line = 748)
    public static final boolean method687(int arg0, int arg1, int arg2) {
        field1431++;
        if (arg0 < 37) {
            field1435 = -85;
        }
        return class230.method1345(arg2, 0, arg1) | (arg2 & 0x70000) != 0 || class87.method607((byte) 106, arg2, arg1);
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V", line = 767)
    public static void method688(byte arg0) {
        if (arg0 != 126) {
            field1432 = null;
        }
        field1438 = null;
        field1430 = null;
        field1433 = null;
        field1432 = null;
    }
}
