import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class36 extends class253 {

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "[B")
    public byte[] field552;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "[Llb;")
    public class126[] field559;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "[S")
    public short[] field566;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "[B")
    public byte[] field561;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "[I")
    private int[] field560;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "[Lld;")
    public class77[] field562;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "[B")
    public byte[] field569;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Ljd;")
    private static class85 field557 = class221.method1499("Members object", (byte) 93);

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "J")
    public static long field556 = 0L;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Ljd;")
    public static class85 field554 = field557;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "Z")
    public static boolean field563 = false;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "[I")
    public static int[] field564 = new int[2048];

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "Ljd;")
    public static class85 field568 = class221.method1499("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", (byte) 123);

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Lge;")
    public static class68 field555;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
    public static void method242(boolean arg0) {
        field568 = null;
        if (arg0) {
            field557 = null;
            field554 = null;
            field564 = null;
            field555 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([ILsc;I[B)Z")
    public final boolean method243(int[] arg0, class236 arg1, int arg2, byte[] arg3) {
        field567++;
        int var5 = arg2;
        boolean var6 = true;
        class126 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field560[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1579(arg2 - 22763, var9 >> 2, arg0);
                        } else {
                            var7 = arg1.method1578((byte) -111, var9 >> 2, arg0);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field559[var8] = var7;
                        this.field560[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    public final void method244(int arg0) {
        this.field560 = null;
        field553++;
        if (arg0 != -1) {
            this.method243((int[]) null, (class236) null, -113, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLjb;IIIILfg;)V")
    public static final void method245(boolean arg0, class255 arg1, int arg2, int arg3, int arg4, int arg5, class12 arg6) {
        field565++;
        if (arg6 == null) {
            return;
        }
        int var7 = class64.field1185 + class30.field450 & 0x7FF;
        int var8 = Math.max(arg1.field4513 / 2, arg1.field4482 / 2) + 10;
        int var9 = arg3 * arg3 + arg4 * arg4;
        if (!arg0) {
            method245(false, (class255) null, 70, 37, -4, -110, (class12) null);
        }
        if ((var8 * var8) < var9) {
            return;
        }
        int var10 = class173.field2984[var7];
        int var11 = class173.field2995[var7];
        int var12 = var10 * 256 / (class226.field3930 + 256);
        int var13 = var11 * 256 / (class226.field3930 + 256);
        int var14 = arg4 * var13 - (arg3 * var12) >> 16;
        int var15 = arg3 * var13 + arg4 * var12 >> 16;
        ((class266) arg6).method1827(arg1.field4513 / 2 + arg5 + var15 - arg6.field182 / 2, arg2 - var14 + arg1.field4482 / 2 + -(arg6.field185 / 2), arg1.field4490, arg1.field4491);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class36() {
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([B)V")
    public class36(byte[] arg0) {
        this.field552 = new byte[128];
        this.field559 = new class126[128];
        this.field566 = new short[128];
        this.field561 = new byte[128];
        this.field560 = new int[128];
        this.field562 = new class77[128];
        int var2 = 0;
        this.field569 = new byte[128];
        class247 var3 = new class247(arg0);
        while (var3.field4238[var3.field4224 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1690(true);
        }
        var3.field4224++;
        int var6 = var3.field4224;
        int var7 = 0;
        var2++;
        var3.field4224 += var2;
        while (var3.field4238[var3.field4224 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1690(true);
        }
        int var10 = 0;
        var3.field4224++;
        int var11 = var3.field4224;
        var7++;
        var3.field4224 += var7;
        while (var3.field4238[var3.field4224 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1690(true);
        }
        var3.field4224++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method1711((byte) -67);
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
            var15 = var10;
        }
        class77[] var19 = new class77[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class77 var103 = var19[var20] = new class77();
            int var104 = var3.method1711((byte) -67);
            if (var104 > 0) {
                var103.field1421 = new byte[var104 * 2];
            }
            int var105 = var3.method1711((byte) -67);
            if (var105 > 0) {
                var103.field1433 = new byte[var105 * 2 + 2];
                var103.field1433[1] = 64;
            }
        }
        int var21 = var3.method1711((byte) -67);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = 0;
        int var24 = var3.method1711((byte) -67);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        while (var3.field4238[var3.field4224 + var23] != 0) {
            var23++;
        }
        byte[] var26 = new byte[var23];
        for (int var27 = 0; var27 < var23; var27++) {
            var26[var27] = var3.method1690(true);
        }
        var23++;
        var3.field4224++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method1711((byte) -67);
            this.field566[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method1711((byte) -67);
            this.field566[var31] = (short) (this.field566[var31] + (var30 << 8));
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
                var34 = var3.method1705((byte) 94);
            }
            this.field566[var35] = (short) (this.field566[var35] + (class135.method899(2, var34 - 1) << 14));
            this.field560[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field560[var39] != 0) {
                if (var36 == 0) {
                    var38 = var3.field4238[var6++] - 1;
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                var36--;
                this.field561[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field560[var43] != 0) {
                if (var41 == 0) {
                    var42 = var3.field4238[var11++] + 16 << 2;
                    if (var8.length > var40) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field569[var43] = (byte) var42;
            }
        }
        class77 var44 = null;
        int var45 = 0;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field560[var47] != 0) {
                if (var46 == 0) {
                    var44 = var19[var14[var45]];
                    if (var45 < var12.length) {
                        var46 = var12[var45++];
                    } else {
                        var46 = -1;
                    }
                }
                var46--;
                this.field562[var47] = var44;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var26.length > var50) {
                    var48 = var26[var50++];
                } else {
                    var48 = -1;
                }
                if (this.field560[var51] > 0) {
                    var49 = var3.method1711((byte) -67) + 1;
                }
            }
            var48--;
            this.field552[var51] = (byte) var49;
        }
        this.field558 = var3.method1711((byte) -67) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class77 var100 = var19[var52];
            if (var100.field1421 != null) {
                for (int var101 = 1; var101 < var100.field1421.length; var101 += 2) {
                    var100.field1421[var101] = var3.method1690(true);
                }
            }
            if (var100.field1433 != null) {
                for (int var102 = 3; var102 < (var100.field1433.length - 2); var102 += 2) {
                    var100.field1433[var102] = var3.method1690(true);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method1690(true);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method1690(true);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class77 var97 = var19[var55];
            if (var97.field1433 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1433.length; var99 += 2) {
                    var98 += var3.method1711((byte) -67) + 1;
                    var97.field1433[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class77 var94 = var19[var56];
            if (var94.field1421 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1421.length; var96 += 2) {
                    var95 += var3.method1711((byte) -67) + 1;
                    var94.field1421[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method1711((byte) -67);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 += var3.method1711((byte) -67) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field552[var61] = (byte) (this.field552[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class251.method1734(var65 - var59, var67, (byte) 29);
                    this.field552[var68] = (byte) (this.field552[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var60 = var66;
                var59 = var65;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field552[var64] = (byte) (this.field552[var64] * var60 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var3.method1711((byte) -67);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var70 + var3.method1711((byte) -67) + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field569[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field569[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                var75 += 2;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class251.method1734(var79 - var72, var81, (byte) 29);
                    var81 += var80 - var73;
                    int var84 = (this.field569[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field569[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field569[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field569[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field1423 = var3.method1711((byte) -67);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class77 var93 = var19[var87];
            if (var93.field1421 != null) {
                var93.field1424 = var3.method1711((byte) -67);
            }
            if (var93.field1433 != null) {
                var93.field1431 = var3.method1711((byte) -67);
            }
            if (var93.field1423 > 0) {
                var93.field1422 = var3.method1711((byte) -67);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field1427 = var3.method1711((byte) -67);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class77 var92 = var19[var89];
            if (var92.field1427 > 0) {
                var92.field1420 = var3.method1711((byte) -67);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class77 var91 = var19[var90];
            if (var91.field1420 > 0) {
                var91.field1426 = var3.method1711((byte) -67);
            }
        }
    }
}
