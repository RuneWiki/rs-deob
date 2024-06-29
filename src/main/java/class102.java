import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class102 extends class430 {

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "[B")
    public byte[] field1453;

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "[B")
    public byte[] field1454;

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "[B")
    public byte[] field1450;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "[I")
    private int[] field1451;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "[S")
    public short[] field1456;

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "[Ljda;")
    public class673[] field1452;

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "[Llaa;")
    public class382[] field1459;

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!qba", name = "o", descriptor = "Lla;")
    public static class423 field1458;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "([II[BLck;)Z", line = 3)
    public final boolean method756(int[] arg0, int arg1, byte[] arg2, class701 arg3) {
        if (arg1 != -129) {
            return false;
        }
        field1457++;
        boolean var5 = true;
        int var6 = 0;
        class673 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field1451[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method3942(arg0, true, var9 >> 2);
                        } else {
                            var7 = arg3.method3937(arg0, var9 >> 2, (byte) -106);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1452[var8] = var7;
                        this.field1451[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V", line = 69)
    public static void method757(byte arg0) {
        int var1 = -55 % ((arg0 + 28) / 54);
        field1458 = null;
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(Z)V", line = 84)
    public final void method758(boolean arg0) {
        if (!arg0) {
            this.field1451 = null;
            field1460++;
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "()V", line = 100)
    public class102() {
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "([B)V", line = 102)
    public class102(byte[] arg0) {
        this.field1453 = new byte[128];
        this.field1454 = new byte[128];
        this.field1450 = new byte[128];
        this.field1451 = new int[128];
        this.field1456 = new short[128];
        this.field1452 = new class673[128];
        this.field1459 = new class382[128];
        class479 var2 = new class479(arg0);
        int var3;
        for (var3 = 0; var2.field6800[var2.field6864 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2915(-125);
        }
        var3++;
        var2.field6864++;
        int var6 = var2.field6864;
        var2.field6864 += var3;
        int var7;
        for (var7 = 0; var2.field6800[var2.field6864 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2915(-122);
        }
        var2.field6864++;
        var7++;
        int var10 = var2.field6864;
        var2.field6864 += var7;
        int var11;
        for (var11 = 0; var2.field6800[var2.field6864 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2915(-100);
        }
        var2.field6864++;
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
                int var105 = var2.method2886(true);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var105 <= var16) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class382[] var18 = new class382[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class382 var102 = var18[var19] = new class382();
            int var103 = var2.method2886(true);
            if (var103 > 0) {
                var102.field5530 = new byte[var103 * 2];
            }
            int var104 = var2.method2886(true);
            if (var104 > 0) {
                var102.field5531 = new byte[var104 * 2 + 2];
                var102.field5531[1] = 64;
            }
        }
        int var20 = var2.method2886(true);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method2886(true);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field6800[var2.field6864 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method2915(-110);
        }
        var24++;
        var2.field6864++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method2886(true);
            this.field1456[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method2886(true);
            this.field1456[var30] = (short) (this.field1456[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 < var25.length) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var2.method2880(-7277);
            }
            this.field1456[var34] = (short) (this.field1456[var34] + class368.method2314(var33 - 1 << 14, 32768));
            var31--;
            this.field1451[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1451[var38] != 0) {
                if (var36 == 0) {
                    var37 = var2.field6800[var6++] - 1;
                    if (var35 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                }
                this.field1453[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1451[var42] != 0) {
                if (var40 == 0) {
                    if (var8.length <= var39) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                    var41 = var2.field6800[var10++] + 16 << 2;
                }
                this.field1450[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class382 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1451[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length <= var43) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                var44--;
                this.field1459[var46] = var45;
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
                if (this.field1451[var50] > 0) {
                    var49 = var2.method2886(true) + 1;
                }
            }
            var47--;
            this.field1454[var50] = (byte) var49;
        }
        this.field1455 = var2.method2886(true) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class382 var99 = var18[var51];
            if (var99.field5530 != null) {
                for (int var100 = 1; var100 < var99.field5530.length; var100 += 2) {
                    var99.field5530[var100] = var2.method2915(-103);
                }
            }
            if (var99.field5531 != null) {
                for (int var101 = 3; var101 < (var99.field5531.length - 2); var101 += 2) {
                    var99.field5531[var101] = var2.method2915(-100);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method2915(-123);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method2915(-114);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class382 var96 = var18[var54];
            if (var96.field5531 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field5531.length; var98 += 2) {
                    var97 = var97 + var2.method2886(true) + 1;
                    var96.field5531[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class382 var93 = var18[var55];
            if (var93.field5530 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field5530.length; var95 += 2) {
                    var94 = var94 + var2.method2886(true) + 1;
                    var93.field5530[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method2886(true);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method2886(true) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field1454[var60] = (byte) (this.field1454[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class753.method4190(var64 - var58, var66, -123);
                    var66 += var65 - var59;
                    this.field1454[var67] = (byte) (this.field1454[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field1454[var62] = (byte) (this.field1454[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method2886(true);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method2886(true) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1450[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1450[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class753.method4190(var78 - var71, var80, -123);
                    int var83 = (this.field1450[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1450[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var72 = var79;
                var74 += 2;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field1450[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1450[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field5525 = var2.method2886(true);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class382 var92 = var18[var86];
            if (var92.field5530 != null) {
                var92.field5537 = var2.method2886(true);
            }
            if (var92.field5531 != null) {
                var92.field5526 = var2.method2886(true);
            }
            if (var92.field5525 > 0) {
                var92.field5534 = var2.method2886(true);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field5527 = var2.method2886(true);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class382 var91 = var18[var88];
            if (var91.field5527 > 0) {
                var91.field5524 = var2.method2886(true);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class382 var90 = var18[var89];
            if (var90.field5524 > 0) {
                var90.field5528 = var2.method2886(true);
            }
        }
    }
}
