import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 extends class241 {

    @OriginalMember(owner = "client!db", name = "F", descriptor = "[S")
    public short[] field405;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[I")
    private int[] field399;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "[B")
    public byte[] field393;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "[B")
    public byte[] field397;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "[B")
    public byte[] field403;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "[Luh;")
    public class98[] field390;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "[Lik;")
    public class250[] field400;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field388 = 0;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Z")
    public static boolean field394 = true;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Loh;")
    public static class263 field395 = class253.method1681(-124, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lue;")
    public static class86 field389;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "Lue;")
    public static class86 field396;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "[Loh;")
    public static class263[] field398;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([BLpj;[IB)Z")
    public final boolean method121(byte[] arg0, class238 arg1, int[] arg2, byte arg3) {
        field404++;
        if (arg3 >= -99) {
            this.method121((byte[]) null, (class238) null, (int[]) null, (byte) 61);
        }
        int var5 = 0;
        boolean var6 = true;
        class250 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field399[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1593(var9 >> 2, 2998, arg2);
                        } else {
                            var7 = arg1.method1590(arg2, var9 >> 2, 81);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field400[var8] = var7;
                        this.field399[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static void method122(int arg0) {
        field395 = null;
        field389 = null;
        if (arg0 != -25228) {
            method124((class21) null, 42);
        }
        field398 = null;
        field396 = null;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    public final void method123(int arg0) {
        this.field399 = null;
        if (arg0 != 2644) {
            method122(38);
        }
        field391++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lpc;I)V")
    public static final void method124(class21 arg0, int arg1) {
        field402++;
        class21 var2 = class62.method381(arg0, 105);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class143.field2616;
            var4 = class138.field2558;
        } else {
            var3 = var2.field479;
            var4 = var2.field539;
        }
        class30.method199(arg0, false, false, var4, var3);
        class164.method1076(11426, var3, var4, arg0);
        if (arg1 <= 125) {
            method122(-54);
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class17() {
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "([B)V")
    public class17(byte[] arg0) {
        this.field405 = new short[128];
        this.field399 = new int[128];
        this.field393 = new byte[128];
        this.field397 = new byte[128];
        this.field403 = new byte[128];
        this.field390 = new class98[128];
        this.field400 = new class250[128];
        int var2 = 0;
        class194 var3 = new class194(arg0);
        while (var3.field3469[var3.field3497 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1281((byte) -105);
        }
        var3.field3497++;
        var2++;
        int var6 = 0;
        int var7 = var3.field3497;
        var3.field3497 += var2;
        while (var3.field3469[var3.field3497 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method1281((byte) 127);
        }
        var3.field3497++;
        int var10 = var3.field3497;
        var6++;
        var3.field3497 += var6;
        int var11;
        for (var11 = 0; var3.field3469[var3.field3497 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1281((byte) -11);
        }
        var3.field3497++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1301(-8317);
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
        class98[] var19 = new class98[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class98 var103 = var19[var20] = new class98();
            int var104 = var3.method1301(-8317);
            if (var104 > 0) {
                var103.field1891 = new byte[var104 * 2];
            }
            int var105 = var3.method1301(-8317);
            if (var105 > 0) {
                var103.field1886 = new byte[var105 * 2 + 2];
                var103.field1886[1] = 64;
            }
        }
        int var21 = var3.method1301(-8317);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var3.method1301(-8317);
        int var24 = 0;
        byte[] var25 = var23 <= 0 ? null : new byte[var23 * 2];
        while (var3.field3469[var3.field3497 + var24] != 0) {
            var24++;
        }
        byte[] var26 = new byte[var24];
        for (int var27 = 0; var27 < var24; var27++) {
            var26[var27] = var3.method1281((byte) -43);
        }
        var3.field3497++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method1301(-8317);
            this.field405[var29] = (short) var28;
        }
        var24++;
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method1301(-8317);
            this.field405[var31] = (short) (this.field405[var31] + (var30 << 8));
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
                var34 = var3.method1270(-63);
            }
            var32--;
            this.field405[var35] = (short) (this.field405[var35] + (class263.method1777(2, var34 - 1) << 14));
            this.field399[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field399[var39] != 0) {
                if (var36 == 0) {
                    var38 = var3.field3469[var7++] - 1;
                    if (var37 < var4.length) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field397[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field399[var43] != 0) {
                if (var40 == 0) {
                    if (var8.length <= var42) {
                        var40 = -1;
                    } else {
                        var40 = var8[var42++];
                    }
                    var41 = var3.field3469[var10++] + 16 << 2;
                }
                this.field393[var43] = (byte) var41;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class98 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field399[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 < var12.length) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field390[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var50 < var26.length) {
                    var48 = var26[var50++];
                } else {
                    var48 = -1;
                }
                if (this.field399[var51] > 0) {
                    var49 = var3.method1301(-8317) + 1;
                }
            }
            this.field403[var51] = (byte) var49;
            var48--;
        }
        this.field392 = var3.method1301(-8317) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class98 var100 = var19[var52];
            if (var100.field1891 != null) {
                for (int var101 = 1; var101 < var100.field1891.length; var101 += 2) {
                    var100.field1891[var101] = var3.method1281((byte) 121);
                }
            }
            if (var100.field1886 != null) {
                for (int var102 = 3; var102 < var100.field1886.length - 2; var102 += 2) {
                    var100.field1886[var102] = var3.method1281((byte) -13);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method1281((byte) -98);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method1281((byte) 125);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class98 var97 = var19[var55];
            if (var97.field1886 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1886.length; var99 += 2) {
                    var98 = var3.method1301(-8317) + var98 + 1;
                    var97.field1886[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class98 var94 = var19[var56];
            if (var94.field1891 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1891.length; var96 += 2) {
                    var95 = var95 + var3.method1301(-8317) + 1;
                    var94.field1891[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method1301(-8317);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 += var3.method1301(-8317) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field403[var61] = (byte) (this.field403[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class15.method115(var67, var65 - var59, -1);
                    var67 += var66 - var60;
                    this.field403[var68] = (byte) (this.field403[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var59 = var65;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field403[var64] = (byte) (this.field403[var64] * var60 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var3.method1301(-8317);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var3.method1301(-8317) + (var70 + 1);
                var25[var71] = (byte) var70;
            }
            int var72 = var25[1] << 1;
            byte var73 = var25[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field393[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field393[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var25.length > var75) {
                int var79 = var25[var75 + 1] << 1;
                byte var80 = var25[var75];
                int var81 = (var80 - var73) * var72 + ((var80 - var73) / 2);
                for (int var82 = var73; var82 < var80; var82++) {
                    int var83 = class15.method115(var81, var80 - var73, -1);
                    var81 += var79 - var72;
                    int var84 = (this.field393[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field393[var82] = (byte) var84;
                }
                var73 = var80;
                var75 += 2;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var73; var77 < 128; var77++) {
                int var78 = (this.field393[var77] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field393[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field1890 = var3.method1301(-8317);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class98 var93 = var19[var87];
            if (var93.field1891 != null) {
                var93.field1882 = var3.method1301(-8317);
            }
            if (var93.field1886 != null) {
                var93.field1883 = var3.method1301(-8317);
            }
            if (var93.field1890 > 0) {
                var93.field1889 = var3.method1301(-8317);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field1885 = var3.method1301(-8317);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class98 var92 = var19[var89];
            if (var92.field1885 > 0) {
                var92.field1899 = var3.method1301(-8317);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class98 var91 = var19[var90];
            if (var91.field1899 > 0) {
                var91.field1897 = var3.method1301(-8317);
            }
        }
    }
}
