import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class11 extends class540 {

    @OriginalMember(owner = "client!sja", name = "n", descriptor = "[S")
    public short[] field237;

    @OriginalMember(owner = "client!sja", name = "k", descriptor = "[B")
    public byte[] field234;

    @OriginalMember(owner = "client!sja", name = "v", descriptor = "[I")
    private int[] field245;

    @OriginalMember(owner = "client!sja", name = "t", descriptor = "[B")
    public byte[] field243;

    @OriginalMember(owner = "client!sja", name = "j", descriptor = "[B")
    public byte[] field233;

    @OriginalMember(owner = "client!sja", name = "u", descriptor = "[Lbc;")
    public class383[] field244;

    @OriginalMember(owner = "client!sja", name = "i", descriptor = "[Lig;")
    public class254[] field232;

    @OriginalMember(owner = "client!sja", name = "o", descriptor = "I")
    public int field238;

    @OriginalMember(owner = "client!sja", name = "l", descriptor = "I")
    public static int field235 = 0;

    @OriginalMember(owner = "client!sja", name = "p", descriptor = "I")
    public static int field239 = 1337;

    @OriginalMember(owner = "client!sja", name = "q", descriptor = "F")
    public static float field240;

    @OriginalMember(owner = "client!sja", name = "m", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!sja", name = "s", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!sja", name = "r", descriptor = "J")
    public static long field241;

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)V", line = 13)
    public final void method122(int arg0) {
        if (arg0 != 30065) {
            this.method123(null, null, null, 80);
        }
        this.field245 = null;
        field236++;
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(Lbia;[B[II)Z", line = 25)
    public final boolean method123(class522 arg0, byte[] arg1, int[] arg2, int arg3) {
        int var5 = 67 % ((arg3 + 17) / 43);
        field242++;
        boolean var6 = true;
        int var7 = 0;
        class383 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg1 == null || arg1[var9] != 0) {
                int var10 = this.field245[var9];
                if (var10 != 0) {
                    if (var7 != var10) {
                        var7 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg0.method3045(var10 >> 2, arg2, 0);
                        } else {
                            var8 = arg0.method3040(var10 >> 2, -118, arg2);
                        }
                        if (var8 == null) {
                            var6 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field244[var9] = var8;
                        this.field245[var9] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!sja", name = "<init>", descriptor = "()V", line = 94)
    public class11() {
    }

    @OriginalMember(owner = "client!sja", name = "<init>", descriptor = "([B)V", line = 96)
    public class11(byte[] arg0) {
        this.field237 = new short[128];
        this.field234 = new byte[128];
        this.field245 = new int[128];
        this.field243 = new byte[128];
        this.field233 = new byte[128];
        this.field244 = new class383[128];
        this.field232 = new class254[128];
        class120 var2 = new class120(arg0);
        int var3;
        for (var3 = 0; var2.field1556[var2.field1521 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method877(-252);
        }
        var3++;
        var2.field1521++;
        int var6 = var2.field1521;
        var2.field1521 += var3;
        int var7;
        for (var7 = 0; var2.field1556[var2.field1521 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method877(-252);
        }
        var2.field1521++;
        var7++;
        int var10 = var2.field1521;
        var2.field1521 += var7;
        int var11;
        for (var11 = 0; var2.field1556[var2.field1521 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method877(-252);
        }
        var2.field1521++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method842(2384);
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
        class254[] var18 = new class254[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class254 var102 = var18[var19] = new class254();
            int var103 = var2.method842(2384);
            if (var103 > 0) {
                var102.field3575 = new byte[var103 * 2];
            }
            int var104 = var2.method842(2384);
            if (var104 > 0) {
                var102.field3568 = new byte[var104 * 2 + 2];
                var102.field3568[1] = 64;
            }
        }
        int var20 = var2.method842(2384);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method842(2384);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field1556[var2.field1521 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method877(-252);
        }
        var24++;
        var2.field1521++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method842(2384);
            this.field237[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method842(2384);
            this.field237[var30] = (short) (this.field237[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var32) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var2.method881(20458);
            }
            this.field237[var34] = (short) (this.field237[var34] + (class111.method773(2, var33 - 1) << 14));
            this.field245[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field245[var38] != 0) {
                if (var36 == 0) {
                    if (var35 < var4.length) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                    var37 = var2.field1556[var6++] - 1;
                }
                this.field234[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field245[var42] != 0) {
                if (var40 == 0) {
                    var41 = var2.field1556[var10++] + 16 << 2;
                    if (var39 < var8.length) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field233[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class254 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field245[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 < var12.length) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                this.field232[var46] = var45;
                var43--;
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
                if (this.field245[var50] > 0) {
                    var49 = var2.method842(2384) + 1;
                }
            }
            this.field243[var50] = (byte) var49;
            var47--;
        }
        this.field238 = var2.method842(2384) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class254 var99 = var18[var51];
            if (var99.field3575 != null) {
                for (int var100 = 1; var100 < var99.field3575.length; var100 += 2) {
                    var99.field3575[var100] = var2.method877(-252);
                }
            }
            if (var99.field3568 != null) {
                for (int var101 = 3; var101 < var99.field3568.length - 2; var101 += 2) {
                    var99.field3568[var101] = var2.method877(-252);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method877(-252);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method877(-252);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class254 var96 = var18[var54];
            if (var96.field3568 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field3568.length; var98 += 2) {
                    var97 += var2.method842(2384) + 1;
                    var96.field3568[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class254 var93 = var18[var55];
            if (var93.field3575 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field3575.length; var95 += 2) {
                    var94 += var2.method842(2384) + 1;
                    var93.field3575[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method842(2384);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method842(2384) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field243[var60] = (byte) (this.field243[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class415.method2491(var66, var64 - var58, -1030892513);
                    this.field243[var67] = (byte) (this.field243[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var59 = var65;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field243[var62] = (byte) (this.field243[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method842(2384);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method842(2384) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field233[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field233[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class415.method2491(var80, var78 - var71, -1030892513);
                    int var83 = (this.field233[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field233[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var72 = var79;
                var74 += 2;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field233[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field233[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field3571 = var2.method842(2384);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class254 var92 = var18[var86];
            if (var92.field3575 != null) {
                var92.field3569 = var2.method842(2384);
            }
            if (var92.field3568 != null) {
                var92.field3576 = var2.method842(2384);
            }
            if (var92.field3571 > 0) {
                var92.field3567 = var2.method842(2384);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field3570 = var2.method842(2384);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class254 var91 = var18[var88];
            if (var91.field3570 > 0) {
                var91.field3573 = var2.method842(2384);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class254 var90 = var18[var89];
            if (var90.field3573 > 0) {
                var90.field3572 = var2.method842(2384);
            }
        }
    }
}
