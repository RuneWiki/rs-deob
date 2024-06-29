import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 extends class16 {

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "[B")
    public byte[] field542;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "[B")
    public byte[] field562;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "[S")
    public short[] field552;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "[B")
    public byte[] field545;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "[Lld;")
    public class80[] field557;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "[Ls;")
    public class125[] field547;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "[I")
    private int[] field555;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "[Lje;")
    public static class67[] field543 = new class67[500];

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "Lje;")
    private static class67 field546 = class85.method592(255, "scroll:");

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "Lje;")
    public static class67 field554 = field546;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "Z")
    public static boolean field559 = false;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "Lje;")
    public static class67 field561 = field546;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "Lje;")
    public static class67 field550 = class85.method592(255, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "J")
    public static long field564 = 0L;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "[Lqb;")
    public static class113[] field563;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "[[S")
    public static short[][] field553;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)Lkd;")
    public static final class73 method197(byte arg0) {
        field560++;
        class73 var1 = new class73();
        var1.field1590 = class69.field1409[0];
        var1.field1595 = class85.field1888;
        var1.field1596 = class128.field2804[0];
        var1.field1593 = client.field397;
        var1.field1589 = class4.field61[0];
        int var2 = 12 / ((arg0 - 43) / 43);
        var1.field1591 = class152.field3489[0];
        var1.field1592 = class4.field65[0];
        var1.field1594 = class14.field246;
        class151.method1154(0);
        return var1;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V")
    public static final void method198(byte arg0) {
        field549++;
        class39.field702.method767(1);
        int var1 = -59 / ((31 - arg0) / 41);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BJ)V")
    public static final void method199(byte arg0, long arg1) {
        field551++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class92.field2059; var3++) {
            if (class14.field244[var3] == arg1) {
                class97.field2169++;
                class92.field2059--;
                for (int var4 = var3; var4 < class92.field2059; var4++) {
                    class14.field244[var4] = class14.field244[var4 + 1];
                    class68.field1377[var4] = class68.field1377[var4 + 1];
                }
                class27.field486 = class86.field1899;
                class69.field1399.method285(239, (byte) 64);
                class69.field1399.method656(-62, arg1);
                break;
            }
        }
        if (arg0 <= 104) {
            field546 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public final void method200(int arg0) {
        if (arg0 != 16) {
            method199((byte) 119, -64L);
        }
        field556++;
        this.field555 = null;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
    public static void method201(int arg0) {
        field561 = null;
        field554 = null;
        field546 = null;
        field550 = null;
        if (arg0 != 2) {
            field550 = null;
        }
        field543 = null;
        field553 = null;
        field563 = null;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class31() {
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
    public class31(byte[] arg0) {
        this.field542 = new byte[128];
        this.field562 = new byte[128];
        this.field552 = new short[128];
        this.field545 = new byte[128];
        this.field557 = new class80[128];
        this.field547 = new class125[128];
        this.field555 = new int[128];
        class91 var2 = new class91(arg0);
        int var3;
        for (var3 = 0; var2.field1991[var2.field2043 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method667((byte) -37);
        }
        var2.field2043++;
        var3++;
        int var6 = 0;
        int var7 = var2.field2043;
        var2.field2043 += var3;
        while (var2.field1991[var2.field2043 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method667((byte) -37);
        }
        var6++;
        var2.field2043++;
        int var10 = var2.field2043;
        var2.field2043 += var6;
        int var11;
        for (var11 = 0; var2.field1991[var2.field2043 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method667((byte) -37);
        }
        var11++;
        var2.field2043++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method649(false);
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
        class80[] var19 = new class80[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class80 var103 = var19[var20] = new class80();
            int var104 = var2.method649(false);
            if (var104 > 0) {
                var103.field1766 = new byte[var104 * 2];
            }
            int var105 = var2.method649(false);
            if (var105 > 0) {
                var103.field1771 = new byte[var105 * 2 + 2];
                var103.field1771[1] = 64;
            }
        }
        int var21 = var2.method649(false);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method649(false);
        int var24 = 0;
        byte[] var25 = var23 <= 0 ? null : new byte[var23 * 2];
        while (var2.field1991[var2.field2043 + var24] != 0) {
            var24++;
        }
        byte[] var26 = new byte[var24];
        for (int var27 = 0; var27 < var24; var27++) {
            var26[var27] = var2.method667((byte) -37);
        }
        var24++;
        var2.field2043++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method649(false);
            this.field552[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method649(false);
            this.field552[var31] = (short) (this.field552[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var33 == 0) {
                if (var34 >= var26.length) {
                    var33 = -1;
                } else {
                    var33 = var26[var34++];
                }
                var32 = var2.method620((byte) 49);
            }
            var33--;
            this.field552[var35] = (short) (this.field552[var35] + class34.method213(var32 - 1 << 14, 32768));
            this.field555[var35] = var32;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field555[var39] != 0) {
                if (var37 == 0) {
                    if (var4.length <= var36) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                    var38 = var2.field1991[var7++] - 1;
                }
                var37--;
                this.field562[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field555[var43] != 0) {
                if (var42 == 0) {
                    if (var8.length > var40) {
                        var42 = var8[var40++];
                    } else {
                        var42 = -1;
                    }
                    var41 = var2.field1991[var10++] + 16 << 2;
                }
                var42--;
                this.field542[var43] = (byte) var41;
            }
        }
        int var44 = 0;
        class80 var45 = null;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field555[var47] != 0) {
                if (var46 == 0) {
                    var45 = var19[var14[var44]];
                    if (var44 < var12.length) {
                        var46 = var12[var44++];
                    } else {
                        var46 = -1;
                    }
                }
                var46--;
                this.field557[var47] = var45;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var26.length <= var49) {
                    var48 = -1;
                } else {
                    var48 = var26[var49++];
                }
                if (this.field555[var51] > 0) {
                    var50 = var2.method649(false) + 1;
                }
            }
            var48--;
            this.field545[var51] = (byte) var50;
        }
        this.field544 = var2.method649(false) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class80 var100 = var19[var52];
            if (var100.field1766 != null) {
                for (int var101 = 1; var101 < var100.field1766.length; var101 += 2) {
                    var100.field1766[var101] = var2.method667((byte) -37);
                }
            }
            if (var100.field1771 != null) {
                for (int var102 = 3; var102 < var100.field1771.length - 2; var102 += 2) {
                    var100.field1771[var102] = var2.method667((byte) -37);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method667((byte) -37);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var2.method667((byte) -37);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class80 var97 = var19[var55];
            if (var97.field1771 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1771.length; var99 += 2) {
                    var98 = var2.method649(false) + var98 + 1;
                    var97.field1771[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class80 var94 = var19[var56];
            if (var94.field1766 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1766.length; var96 += 2) {
                    var95 = var2.method649(false) + var95 + 1;
                    var94.field1766[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method649(false);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method649(false) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[1];
            byte var60 = var22[0];
            for (int var61 = 0; var61 < var60; var61++) {
                this.field545[var61] = (byte) (this.field545[var61] * var59 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var60) / 2 + (var65 - var60) * var59;
                for (int var68 = var60; var68 < var65; var68++) {
                    int var69 = class126.method973(var67, -108, var65 - var60);
                    var67 += var66 - var59;
                    this.field545[var68] = (byte) (this.field545[var68] * var69 + 32 >> 6);
                }
                var59 = var66;
                var62 += 2;
                var60 = var65;
            }
            for (int var63 = var60; var63 < 128; var63++) {
                this.field545[var63] = (byte) (this.field545[var63] * var59 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var2.method649(false);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 += var2.method649(false) + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field542[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field542[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var25.length > var75) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class126.method973(var81, -127, var79 - var72);
                    int var84 = (this.field542[var82] & 0xFF) + var83;
                    var81 += var80 - var73;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field542[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field542[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field542[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field1776 = var2.method649(false);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class80 var93 = var19[var87];
            if (var93.field1766 != null) {
                var93.field1781 = var2.method649(false);
            }
            if (var93.field1771 != null) {
                var93.field1759 = var2.method649(false);
            }
            if (var93.field1776 > 0) {
                var93.field1770 = var2.method649(false);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field1779 = var2.method649(false);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class80 var92 = var19[var89];
            if (var92.field1779 > 0) {
                var92.field1756 = var2.method649(false);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class80 var91 = var19[var90];
            if (var91.field1756 > 0) {
                var91.field1755 = var2.method649(false);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B[BLaa;[I)Z")
    public final boolean method202(byte arg0, byte[] arg1, class2 arg2, int[] arg3) {
        field558++;
        boolean var5 = true;
        int var6 = 0;
        if (arg0 != -103) {
            this.field552 = null;
        }
        class125 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field555[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method8(var9 >> 2, arg0 ^ 0xFFFFFF99, arg3);
                        } else {
                            var7 = arg2.method6(-2007571668, var9 >> 2, arg3);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field547[var8] = var7;
                        this.field555[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }
}
