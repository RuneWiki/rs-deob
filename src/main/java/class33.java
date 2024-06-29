import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class33 extends class146 {

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "[S")
    public short[] field555;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "[Lbe;")
    public class86[] field545;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "[I")
    private int[] field553;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "[B")
    public byte[] field549;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "[Luk;")
    public class199[] field559;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "[B")
    public byte[] field548;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "[B")
    public byte[] field558;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "Ljava/lang/String;")
    public static String field556 = "Loading defaults - ";

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public static int field554 = 0;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public static final void method280(int arg0, int arg1) {
        class129 var2 = class26.field455[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class129 var4 = class26.field455[var3][arg0][arg1] = class26.field455[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2152--;
                for (int var5 = 0; var5 < var4.field2142; var5++) {
                    class190 var6 = var4.field2131[var5];
                    if ((var6.field3118 >> 29 & 0x3L) == 2L && var6.field3115 == arg0 && var6.field3110 == arg1) {
                        var6.field3116--;
                    }
                }
            }
        }
        if (class26.field455[0][arg0][arg1] == null) {
            class26.field455[0][arg0][arg1] = new class129(0, arg0, arg1);
        }
        class26.field455[0][arg0][arg1].field2135 = var2;
        class26.field455[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method281(int arg0) {
        field556 = null;
        if (arg0 != 3253) {
            field554 = 14;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final void method282(int arg0) {
        field547++;
        this.field553 = null;
        if (arg0 != 2) {
            this.field558 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLd;[I[B)Z")
    public final boolean method283(boolean arg0, class141 arg1, int[] arg2, byte[] arg3) {
        field552++;
        if (arg0) {
            this.method283(false, (class141) null, (int[]) null, (byte[]) null);
        }
        boolean var5 = true;
        class86 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field553[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg1.method1056(var9 >> 2, arg2, -125);
                        } else {
                            var6 = arg1.method1053(arg2, -2, var9 >> 2);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field545[var8] = var6;
                        this.field553[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)Ldg;")
    public static final class6 method284(int arg0, int arg1) {
        field546++;
        class6 var2 = (class6) class26.field448.method1155((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class184.field3032.method900(arg0, arg1, false);
        class6 var4 = new class6();
        if (var3 != null) {
            var4.method31(-30789, new class136(var3), arg1);
        }
        class26.field448.method1161(var4, (byte) -121, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class33() {
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([B)V")
    public class33(byte[] arg0) {
        this.field555 = new short[128];
        int var2 = 0;
        this.field545 = new class86[128];
        this.field553 = new int[128];
        this.field549 = new byte[128];
        this.field559 = new class199[128];
        this.field548 = new byte[128];
        this.field558 = new byte[128];
        class136 var3 = new class136(arg0);
        while (var3.field2263[var3.field2231 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method981(false);
        }
        var3.field2231++;
        var2++;
        int var6 = var3.field2231;
        int var7 = 0;
        var3.field2231 += var2;
        while (var3.field2263[var3.field2231 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method981(false);
        }
        var7++;
        var3.field2231++;
        int var10 = var3.field2231;
        int var11 = 0;
        var3.field2231 += var7;
        while (var3.field2263[var3.field2231 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method981(false);
        }
        var3.field2231++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            int var15 = 1;
            var14[1] = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1012(4);
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
        class199[] var19 = new class199[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class199 var103 = var19[var20] = new class199();
            int var104 = var3.method1012(4);
            if (var104 > 0) {
                var103.field3232 = new byte[var104 * 2];
            }
            int var105 = var3.method1012(4);
            if (var105 > 0) {
                var103.field3245 = new byte[var105 * 2 + 2];
                var103.field3245[1] = 64;
            }
        }
        int var21 = var3.method1012(4);
        int var22 = 0;
        byte[] var23 = var21 > 0 ? new byte[var21 * 2] : null;
        int var24 = var3.method1012(4);
        while (var3.field2263[var3.field2231 + var22] != 0) {
            var22++;
        }
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        byte[] var26 = new byte[var22];
        for (int var27 = 0; var27 < var22; var27++) {
            var26[var27] = var3.method981(false);
        }
        int var28 = 0;
        var3.field2231++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method1012(4);
            this.field555[var29] = (short) var28;
        }
        int var30 = 0;
        var22++;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method1012(4);
            this.field555[var31] = (short) (this.field555[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length <= var33) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var3.method987(2);
            }
            this.field555[var35] = (short) (this.field555[var35] + class64.method498(32768, var34 - 1 << 14));
            this.field553[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field553[var39] != 0) {
                if (var37 == 0) {
                    var38 = var3.field2263[var6++] - 1;
                    if (var36 >= var4.length) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                }
                var37--;
                this.field558[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field553[var43] != 0) {
                if (var42 == 0) {
                    if (var40 < var8.length) {
                        var42 = var8[var40++];
                    } else {
                        var42 = -1;
                    }
                    var41 = var3.field2263[var10++] + 16 << 2;
                }
                var42--;
                this.field548[var43] = (byte) var41;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class199 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field553[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 < var12.length) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field559[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var26.length > var49) {
                    var48 = var26[var49++];
                } else {
                    var48 = -1;
                }
                if (this.field553[var51] > 0) {
                    var50 = var3.method1012(4) + 1;
                }
            }
            var48--;
            this.field549[var51] = (byte) var50;
        }
        this.field544 = var3.method1012(4) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class199 var100 = var19[var52];
            if (var100.field3232 != null) {
                for (int var101 = 1; var101 < var100.field3232.length; var101 += 2) {
                    var100.field3232[var101] = var3.method981(false);
                }
            }
            if (var100.field3245 != null) {
                for (int var102 = 3; var102 < var100.field3245.length - 2; var102 += 2) {
                    var100.field3245[var102] = var3.method981(false);
                }
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method981(false);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method981(false);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class199 var97 = var19[var55];
            if (var97.field3245 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3245.length; var99 += 2) {
                    var98 = var98 + var3.method1012(4) + 1;
                    var97.field3245[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class199 var94 = var19[var56];
            if (var94.field3232 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3232.length; var96 += 2) {
                    var95 = var95 + var3.method1012(4) + 1;
                    var94.field3232[var96] = (byte) var95;
                }
            }
        }
        if (var23 != null) {
            int var57 = var3.method1012(4);
            var23[0] = (byte) var57;
            for (int var58 = 2; var58 < var23.length; var58 += 2) {
                var57 = var3.method1012(4) + var57 + 1;
                var23[var58] = (byte) var57;
            }
            byte var59 = var23[0];
            byte var60 = var23[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field549[var61] = (byte) (this.field549[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var23.length > var62) {
                byte var65 = var23[var62];
                byte var66 = var23[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                var62 += 2;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class76.method601(false, var65 - var59, var67);
                    var67 += var66 - var60;
                    this.field549[var68] = (byte) (this.field549[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field549[var63] = (byte) (this.field549[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var3.method1012(4);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var3.method1012(4) + var70 + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field548[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field548[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var25.length > var75) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class76.method601(false, var79 - var72, var81);
                    int var84 = (this.field548[var82] & 0xFF) + var83;
                    var81 += var80 - var73;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field548[var82] = (byte) var84;
                }
                var73 = var80;
                var75 += 2;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field548[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field548[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field3241 = var3.method1012(4);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class199 var93 = var19[var87];
            if (var93.field3232 != null) {
                var93.field3244 = var3.method1012(4);
            }
            if (var93.field3245 != null) {
                var93.field3246 = var3.method1012(4);
            }
            if (var93.field3241 > 0) {
                var93.field3236 = var3.method1012(4);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field3242 = var3.method1012(4);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class199 var92 = var19[var89];
            if (var92.field3242 > 0) {
                var92.field3235 = var3.method1012(4);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class199 var91 = var19[var90];
            if (var91.field3235 > 0) {
                var91.field3240 = var3.method1012(4);
            }
        }
    }
}
