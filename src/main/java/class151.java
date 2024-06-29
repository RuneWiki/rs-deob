import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class151 extends class181 {

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "[B")
    public byte[] field2208;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "[I")
    private int[] field2214;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "[S")
    public short[] field2213;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "[Lf;")
    public class113[] field2204;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "[B")
    public byte[] field2197;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "[B")
    public byte[] field2212;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "[Ltf;")
    public class98[] field2203;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public int field2200;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "Z")
    public static boolean field2198 = false;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "[I")
    public static int[] field2207 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "Lhl;")
    public static class139 field2206 = new class139(64);

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "Lji;")
    public static class256 field2215;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "[Lji;")
    public static class256[] field2216;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(II)Ljk;")
    public static final class297 method1023(int arg0, int arg1) {
        field2205++;
        int var2 = arg1 >> 16;
        if (arg0 != -30464) {
            field2207 = null;
        }
        int var3 = arg1 & 0xFFFF;
        if (class275.field4236[var2] == null || class275.field4236[var2][var3] == null) {
            boolean var4 = class176.method1165(var2, -31001);
            if (!var4) {
                return null;
            }
        }
        return class275.field4236[var2][var3];
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
    public static void method1024(int arg0) {
        if (arg0 != 29915) {
            field2207 = null;
        }
        field2207 = null;
        field2206 = null;
        field2215 = null;
        field2216 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B[B)Z")
    public static final boolean method1025(byte arg0, byte[] arg1) {
        class54 var2 = new class54(arg1);
        field2211++;
        int var3 = var2.method407(255);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method407(255) == 1;
        int var5 = 16 / ((57 - arg0) / 61);
        if (var4) {
            class71.method553(var2, 8);
        }
        class10.method78(var2, (byte) 64);
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V")
    public final void method1026(byte arg0) {
        this.field2214 = null;
        field2209++;
        if (arg0 >= -76) {
            field2216 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLca;)Lje;")
    public static final class34 method1027(byte arg0, class54 arg1) {
        field2210++;
        arg1.method407(255);
        int var2 = arg1.method407(255);
        class34 var3 = class68.method543(var2, (byte) -63);
        var3.field614 = arg1.method407(255);
        int var4 = arg1.method407(255);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method407(255);
            var3.method50(6, var6, arg1);
        }
        if (arg0 >= -94) {
            return null;
        } else {
            var3.method62(43);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B[B[ILua;)Z")
    public final boolean method1028(byte arg0, byte[] arg1, int[] arg2, class244 arg3) {
        int var5 = -66 % ((arg0 - 39) / 41);
        field2201++;
        int var6 = 0;
        boolean var7 = true;
        class98 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg1 == null || arg1[var9] != 0) {
                int var10 = this.field2214[var9];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg3.method1665(arg2, var10 >> 2, 0);
                        } else {
                            var8 = arg3.method1666(arg2, var10 >> 2, -80);
                        }
                        if (var8 == null) {
                            var7 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field2203[var9] = var8;
                        this.field2214[var9] = 0;
                    }
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class151() {
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([B)V")
    public class151(byte[] arg0) {
        this.field2208 = new byte[128];
        this.field2214 = new int[128];
        this.field2213 = new short[128];
        this.field2204 = new class113[128];
        this.field2197 = new byte[128];
        this.field2212 = new byte[128];
        this.field2203 = new class98[128];
        class54 var2 = new class54(arg0);
        int var3;
        for (var3 = 0; var2.field848[var2.field887 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method459(false);
        }
        var3++;
        var2.field887++;
        int var6 = 0;
        int var7 = var2.field887;
        var2.field887 += var3;
        while (var2.field848[var2.field887 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method459(false);
        }
        var6++;
        var2.field887++;
        int var10 = 0;
        int var11 = var2.field887;
        var2.field887 += var6;
        while (var2.field848[var2.field887 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var2.method459(false);
        }
        var10++;
        var2.field887++;
        byte[] var14 = new byte[var10];
        int var16;
        if (var10 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var2.method407(255);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var18 <= var15) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var10;
        }
        class113[] var19 = new class113[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class113 var103 = var19[var20] = new class113();
            int var104 = var2.method407(255);
            if (var104 > 0) {
                var103.field1736 = new byte[var104 * 2];
            }
            int var105 = var2.method407(255);
            if (var105 > 0) {
                var103.field1721 = new byte[var105 * 2 + 2];
                var103.field1721[1] = 64;
            }
        }
        int var21 = var2.method407(255);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = 0;
        int var24 = var2.method407(255);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        while (var2.field848[var2.field887 + var23] != 0) {
            var23++;
        }
        byte[] var26 = new byte[var23];
        for (int var27 = 0; var27 < var23; var27++) {
            var26[var27] = var2.method459(false);
        }
        var23++;
        var2.field887++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method407(255);
            this.field2213[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method407(255);
            this.field2213[var31] = (short) (this.field2213[var31] + (var30 << 8));
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
                var34 = var2.method405((byte) -122);
            }
            var32--;
            this.field2213[var35] = (short) (this.field2213[var35] + class131.method904(32768, var34 - 1 << 14));
            this.field2214[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2214[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field848[var7++] - 1;
                    if (var4.length <= var36) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                }
                this.field2197[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2214[var43] != 0) {
                if (var40 == 0) {
                    if (var42 < var8.length) {
                        var40 = var8[var42++];
                    } else {
                        var40 = -1;
                    }
                    var41 = var2.field848[var11++] + 16 << 2;
                }
                this.field2212[var43] = (byte) var41;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class113 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2214[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 < var12.length) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                this.field2204[var47] = var46;
                var45--;
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
                if (this.field2214[var51] > 0) {
                    var50 = var2.method407(255) + 1;
                }
            }
            var48--;
            this.field2208[var51] = (byte) var50;
        }
        this.field2200 = var2.method407(255) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class113 var100 = var19[var52];
            if (var100.field1736 != null) {
                for (int var101 = 1; var101 < var100.field1736.length; var101 += 2) {
                    var100.field1736[var101] = var2.method459(false);
                }
            }
            if (var100.field1721 != null) {
                for (int var102 = 3; var102 < (var100.field1721.length - 2); var102 += 2) {
                    var100.field1721[var102] = var2.method459(false);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method459(false);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var2.method459(false);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class113 var97 = var19[var55];
            if (var97.field1721 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1721.length; var99 += 2) {
                    var98 += var2.method407(255) + 1;
                    var97.field1721[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class113 var94 = var19[var56];
            if (var94.field1736 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1736.length; var96 += 2) {
                    var95 = var95 + var2.method407(255) + 1;
                    var94.field1736[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method407(255);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method407(255) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[1];
            byte var60 = var22[0];
            for (int var61 = 0; var61 < var60; var61++) {
                this.field2208[var61] = (byte) (this.field2208[var61] * var59 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var60) / 2 + (var65 - var60) * var59;
                for (int var68 = var60; var68 < var65; var68++) {
                    int var69 = class253.method1721(var67, var65 - var60, (byte) 108);
                    var67 += var66 - var59;
                    this.field2208[var68] = (byte) (this.field2208[var68] * var69 + 32 >> 6);
                }
                var62 += 2;
                var59 = var66;
                var60 = var65;
            }
            Object var63 = null;
            for (int var64 = var60; var64 < 128; var64++) {
                this.field2208[var64] = (byte) (this.field2208[var64] * var59 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var2.method407(255);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 -= -var2.method407(255) - 1;
                var25[var71] = (byte) var70;
            }
            int var72 = var25[1] << 1;
            byte var73 = var25[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field2212[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2212[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                int var79 = var25[var75 + 1] << 1;
                byte var80 = var25[var75];
                var75 += 2;
                int var81 = (var80 - var73) * var72 + ((var80 - var73) / 2);
                for (int var82 = var73; var82 < var80; var82++) {
                    int var83 = class253.method1721(var81, var80 - var73, (byte) 100);
                    var81 += var79 - var72;
                    int var84 = (this.field2212[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2212[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            for (int var76 = var73; var76 < 128; var76++) {
                int var78 = (this.field2212[var76] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2212[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field1724 = var2.method407(255);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class113 var93 = var19[var87];
            if (var93.field1736 != null) {
                var93.field1725 = var2.method407(255);
            }
            if (var93.field1721 != null) {
                var93.field1731 = var2.method407(255);
            }
            if (var93.field1724 > 0) {
                var93.field1727 = var2.method407(255);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field1728 = var2.method407(255);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class113 var92 = var19[var89];
            if (var92.field1728 > 0) {
                var92.field1726 = var2.method407(255);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class113 var91 = var19[var90];
            if (var91.field1726 > 0) {
                var91.field1734 = var2.method407(255);
            }
        }
    }
}
