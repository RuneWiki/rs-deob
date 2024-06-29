import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class221 extends class108 {

    @OriginalMember(owner = "client!dba", name = "x", descriptor = "[Lar;")
    public class4[] field3326;

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "[Lew;")
    public class336[] field3314;

    @OriginalMember(owner = "client!dba", name = "v", descriptor = "[B")
    public byte[] field3324;

    @OriginalMember(owner = "client!dba", name = "t", descriptor = "[B")
    public byte[] field3322;

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "[I")
    private int[] field3317;

    @OriginalMember(owner = "client!dba", name = "s", descriptor = "[B")
    public byte[] field3321;

    @OriginalMember(owner = "client!dba", name = "w", descriptor = "[S")
    public short[] field3325;

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!dba", name = "n", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!dba", name = "p", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!dba", name = "q", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!dba", name = "u", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
    public final void method1475(int arg0) {
        if (arg0 != -67) {
            field3318 = 97;
        }
        field3316++;
        this.field3317 = null;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "()V")
    public static final void method1476() {
        for (int var0 = 0; var0 < class262.field3831; var0++) {
            class360 var1 = class393.field5892[var0];
            class321.method2001(var1);
            class393.field5892[var0] = null;
        }
        class262.field3831 = 0;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lr;Lkm;IIII)V")
    public static final void method1477(class519 arg0, class120 arg1, int arg2, int arg3, int arg4, int arg5) {
        field3319++;
        if (arg4 != -8040) {
            field3318 = 97;
        }
        if (arg0 != null) {
            arg1.method976(-87, arg0.method1362(), arg0.method1390(), arg5, arg2, arg3, arg0.method1378(), arg0.method1392(), arg0.method1376(), arg0.method1406(), arg0.method1382());
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B[I[BLjt;)Z")
    public final boolean method1478(byte arg0, int[] arg1, byte[] arg2, class489 arg3) {
        field3320++;
        boolean var5 = true;
        int var6 = 0;
        class4 var7 = null;
        if (arg0 <= 117) {
            method1476();
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field3317[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method2792(56, arg1, var9 >> 2);
                        } else {
                            var7 = arg3.method2794(arg1, var9 >> 2, -75);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3326[var8] = var7;
                        this.field3317[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "()V")
    public class221() {
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "([B)V")
    public class221(byte[] arg0) {
        this.field3326 = new class4[128];
        this.field3314 = new class336[128];
        this.field3324 = new byte[128];
        this.field3322 = new byte[128];
        this.field3317 = new int[128];
        this.field3321 = new byte[128];
        this.field3325 = new short[128];
        class268 var2 = new class268(arg0);
        int var3;
        for (var3 = 0; var2.field3952[var2.field3913 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1714(-31536);
        }
        var3++;
        var2.field3913++;
        int var6 = var2.field3913;
        var2.field3913 += var3;
        int var7;
        for (var7 = 0; var2.field3952[var2.field3913 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1714(-31536);
        }
        var7++;
        var2.field3913++;
        int var10 = var2.field3913;
        var2.field3913 += var7;
        int var11;
        for (var11 = 0; var2.field3952[var2.field3913 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1714(-31536);
        }
        var2.field3913++;
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
                int var105 = var2.method1738(255);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class336[] var18 = new class336[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class336 var102 = var18[var19] = new class336();
            int var103 = var2.method1738(255);
            if (var103 > 0) {
                var102.field4815 = new byte[var103 * 2];
            }
            int var104 = var2.method1738(255);
            if (var104 > 0) {
                var102.field4813 = new byte[var104 * 2 + 2];
                var102.field4813[1] = 64;
            }
        }
        int var20 = var2.method1738(255);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method1738(255);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field3952[var2.field3913 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1714(-31536);
        }
        var2.field3913++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1738(255);
            this.field3325[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1738(255);
            this.field3325[var30] = (short) (this.field3325[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length <= var32) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var2.method1741(23433);
            }
            this.field3325[var34] = (short) (this.field3325[var34] + class424.method2540(32768, var33 - 1 << 14));
            var31--;
            this.field3317[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3317[var38] != 0) {
                if (var36 == 0) {
                    if (var35 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                    var37 = var2.field3952[var6++] - 1;
                }
                var36--;
                this.field3324[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3317[var42] != 0) {
                if (var40 == 0) {
                    if (var39 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                    var41 = var2.field3952[var10++] + 16 << 2;
                }
                var40--;
                this.field3321[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class336 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3317[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length > var43) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field3314[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var47 >= var25.length) {
                    var48 = -1;
                } else {
                    var48 = var25[var47++];
                }
                if (this.field3317[var50] > 0) {
                    var49 = var2.method1738(255) + 1;
                }
            }
            var48--;
            this.field3322[var50] = (byte) var49;
        }
        this.field3315 = var2.method1738(255) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class336 var99 = var18[var51];
            if (var99.field4815 != null) {
                for (int var100 = 1; var100 < var99.field4815.length; var100 += 2) {
                    var99.field4815[var100] = var2.method1714(-31536);
                }
            }
            if (var99.field4813 != null) {
                for (int var101 = 3; var101 < var99.field4813.length - 2; var101 += 2) {
                    var99.field4813[var101] = var2.method1714(-31536);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1714(-31536);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1714(-31536);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class336 var96 = var18[var54];
            if (var96.field4813 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field4813.length; var98 += 2) {
                    var97 = var97 + var2.method1738(255) + 1;
                    var96.field4813[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class336 var93 = var18[var55];
            if (var93.field4815 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field4815.length; var95 += 2) {
                    var94 = var2.method1738(255) + var94 + 1;
                    var93.field4815[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1738(255);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method1738(255) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3322[var60] = (byte) (this.field3322[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class36.method320(386342943, var64 - var58, var66);
                    var66 += var65 - var59;
                    this.field3322[var67] = (byte) (this.field3322[var67] * var68 + 32 >> 6);
                }
                var61 += 2;
                var59 = var65;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field3322[var62] = (byte) (this.field3322[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method1738(255);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 += var2.method1738(255) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3321[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3321[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class36.method320(386342943, var78 - var71, var80);
                    int var83 = (this.field3321[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field3321[var81] = (byte) var83;
                }
                var71 = var78;
                var72 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field3321[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3321[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field4810 = var2.method1738(255);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class336 var92 = var18[var86];
            if (var92.field4815 != null) {
                var92.field4811 = var2.method1738(255);
            }
            if (var92.field4813 != null) {
                var92.field4818 = var2.method1738(255);
            }
            if (var92.field4810 > 0) {
                var92.field4809 = var2.method1738(255);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field4807 = var2.method1738(255);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class336 var91 = var18[var88];
            if (var91.field4807 > 0) {
                var91.field4808 = var2.method1738(255);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class336 var90 = var18[var89];
            if (var90.field4808 > 0) {
                var90.field4806 = var2.method1738(255);
            }
        }
    }
}
