import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class67 extends class270 {

    @OriginalMember(owner = "client!u", name = "y", descriptor = "[B")
    public byte[] field718;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[B")
    public byte[] field709;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "[Lwb;")
    public class298[] field706;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "[I")
    private int[] field707;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "[S")
    public short[] field711;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "[Lnr;")
    public class54[] field717;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "[B")
    public byte[] field715;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Lcea;")
    public static class196 field708 = new class196();

    @OriginalMember(owner = "client!u", name = "C", descriptor = "[F")
    public static float[] field722 = new float[16];

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Lvw;")
    public static class274 field721 = new class274();

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Lkfa;")
    public static class549 field724 = new class549(23, 3);

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "J")
    public static long field725;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "Ljo;")
    public static class303 field723;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 4)
    public final void method436(int arg0) {
        if (arg0 <= 72) {
            field726 = 70;
        }
        this.field707 = null;
        field710++;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 22)
    public static void method437(int arg0) {
        field708 = null;
        if (arg0 != 1) {
            field708 = null;
        }
        field722 = null;
        field724 = null;
        field721 = null;
        field723 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZI)V", line = 39)
    public static final void method438(int arg0, boolean arg1, int arg2) {
        field712++;
        if (class35.field400 == 1) {
            class136.method760(class676.field9587, arg0, arg2, 1);
        } else if (class35.field400 == 2) {
            class330.method1864(arg2, -116, arg0);
        }
        class676.field9587 = null;
        class35.field400 = 0;
        if (arg1) {
            method438(-52, false, 97);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IBII)V", line = 60)
    public static final void method439(int arg0, byte arg1, int arg2, int arg3) {
        field714++;
        if (arg1 <= 111) {
            return;
        }
        if (arg0 == 1007) {
            class364.method2008(class266.field3354, arg3, arg2);
        } else if (arg0 == 1001) {
            class364.method2008(class642.field9079, arg3, arg2);
        } else if (arg0 == 1010) {
            class364.method2008(class178.field2192, arg3, arg2);
        } else if (arg0 == 1006) {
            class364.method2008(class320.field4147, arg3, arg2);
        } else if (arg0 == 1003) {
            class364.method2008(class399.field5333, arg3, arg2);
            return;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 96)
    public class67() {
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z[I[BLrda;)Z", line = 104)
    public final boolean method440(boolean arg0, int[] arg1, byte[] arg2, class605 arg3) {
        field713++;
        boolean var5 = true;
        int var6 = 0;
        class298 var7 = null;
        int var8 = 0;
        if (!arg0) {
            method439(51, (byte) 78, -78, -81);
        }
        while (var8 < 128) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field707[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method3373(var9 >> 2, 22962, arg1);
                        } else {
                            var7 = arg3.method3371(arg1, 11605, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field706[var8] = var7;
                        this.field707[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "([B)V", line = 162)
    public class67(byte[] arg0) {
        this.field718 = new byte[128];
        this.field709 = new byte[128];
        this.field706 = new class298[128];
        this.field707 = new int[128];
        this.field711 = new short[128];
        this.field717 = new class54[128];
        this.field715 = new byte[128];
        class452 var2 = new class452(arg0);
        int var3;
        for (var3 = 0; var2.field6209[var2.field6215 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2547(true);
        }
        var3++;
        var2.field6215++;
        int var6 = var2.field6215;
        var2.field6215 += var3;
        int var7;
        for (var7 = 0; var2.field6209[var2.field6215 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2547(true);
        }
        var7++;
        var2.field6215++;
        int var10 = var2.field6215;
        var2.field6215 += var7;
        int var11;
        for (var11 = 0; var2.field6209[var2.field6215 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2547(true);
        }
        var2.field6215++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2541(101);
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
        class54[] var19 = new class54[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class54 var103 = var19[var20] = new class54();
            int var104 = var2.method2541(59);
            if (var104 > 0) {
                var103.field561 = new byte[var104 * 2];
            }
            int var105 = var2.method2541(89);
            if (var105 > 0) {
                var103.field560 = new byte[var105 * 2 + 2];
                var103.field560[1] = 64;
            }
        }
        int var21 = var2.method2541(80);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method2541(99);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field6209[var2.field6215 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method2547(true);
        }
        var2.field6215++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method2541(59);
            this.field711[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method2541(41);
            this.field711[var31] = (short) (this.field711[var31] + (var30 << 8));
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
                var34 = var2.method2556(87);
            }
            this.field711[var35] = (short) (this.field711[var35] + class203.method1246(var34 - 1 << 14, 32768));
            this.field707[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field707[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field6209[var6++] - 1;
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                this.field718[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field707[var43] != 0) {
                if (var40 == 0) {
                    if (var8.length <= var41) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                    var42 = var2.field6209[var10++] + 16 << 2;
                }
                this.field709[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class54 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field707[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field717[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 < var26.length) {
                    var48 = var26[var49++];
                } else {
                    var48 = -1;
                }
                if (this.field707[var51] > 0) {
                    var50 = var2.method2541(102) + 1;
                }
            }
            var48--;
            this.field715[var51] = (byte) var50;
        }
        this.field719 = var2.method2541(86) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class54 var100 = var19[var52];
            if (var100.field561 != null) {
                for (int var101 = 1; var101 < var100.field561.length; var101 += 2) {
                    var100.field561[var101] = var2.method2547(true);
                }
            }
            if (var100.field560 != null) {
                for (int var102 = 3; var102 < var100.field560.length - 2; var102 += 2) {
                    var100.field560[var102] = var2.method2547(true);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method2547(true);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method2547(true);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class54 var97 = var19[var55];
            if (var97.field560 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field560.length; var99 += 2) {
                    var98 = var2.method2541(51) + var98 + 1;
                    var97.field560[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class54 var94 = var19[var56];
            if (var94.field561 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field561.length; var96 += 2) {
                    var95 = var95 + var2.method2541(55) + 1;
                    var94.field561[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method2541(46);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 += var2.method2541(88) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field715[var61] = (byte) (this.field715[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class36.method198(30890, var65 - var59, var67);
                    var67 += var66 - var60;
                    this.field715[var68] = (byte) (this.field715[var68] * var69 + 32 >> 6);
                }
                var62 += 2;
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field715[var63] = (byte) (this.field715[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method2541(83);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 -= -var2.method2541(103) - 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field709[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field709[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class36.method198(30890, var79 - var72, var81);
                    int var84 = (this.field709[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field709[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var72 = var79;
                var75 += 2;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field709[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field709[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field555 = var2.method2541(117);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class54 var93 = var19[var87];
            if (var93.field561 != null) {
                var93.field554 = var2.method2541(36);
            }
            if (var93.field560 != null) {
                var93.field563 = var2.method2541(104);
            }
            if (var93.field555 > 0) {
                var93.field556 = var2.method2541(97);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field564 = var2.method2541(95);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class54 var92 = var19[var89];
            if (var92.field564 > 0) {
                var92.field562 = var2.method2541(52);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class54 var91 = var19[var90];
            if (var91.field562 > 0) {
                var91.field559 = var2.method2541(104);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILbfa;IIILpi;Lag;)V", line = 806)
    public static final void method441(int arg0, int arg1, class335 arg2, int arg3, int arg4, int arg5, class455 arg6, class625 arg7) {
        field716++;
        if (arg3 > -66) {
            field721 = null;
        }
        class282 var8 = new class282();
        var8.field3585 = arg5;
        var8.field3582 = arg1 << 9;
        var8.field3588 = arg4 << 9;
        if (arg2 != null) {
            var8.field3564 = arg2;
            int var9 = arg2.field4410;
            int var10 = arg2.field4322;
            if (arg0 == 1 || arg0 == 3) {
                var9 = arg2.field4322;
                var10 = arg2.field4410;
            }
            var8.field3590 = arg2.field4353;
            var8.field3583 = arg1 + var10 << 9;
            var8.field3566 = arg2.field4351;
            var8.field3591 = arg2.field4356;
            var8.field3587 = arg4 + var9 << 9;
            var8.field3569 = arg2.field4377 << 9;
            var8.field3578 = arg2.field4339;
            var8.field3567 = arg2.field4369;
            var8.field3576 = arg2.field4405;
            var8.field3568 = arg2.field4338;
            if (arg2.field4342 != null) {
                var8.field3579 = true;
                var8.method1613(true);
            }
            if (var8.field3590 != null) {
                var8.field3565 = (int) ((double) (var8.field3576 - var8.field3566) * Math.random()) + var8.field3566;
            }
            class144.field1618.method3164(var8, 256);
        } else if (arg7 != null) {
            var8.field3570 = arg7;
            class23 var11 = arg7.field8855;
            if (var11.field229 != null) {
                var8.field3579 = true;
                var11 = var11.method108(0, class491.field7127);
            }
            if (var11 != null) {
                var8.field3583 = arg1 + var11.field234 << 9;
                var8.field3587 = var11.field234 + arg4 << 9;
                var8.field3591 = class59.method401(arg7, 109);
                var8.field3567 = var11.field214;
                var8.field3568 = var11.field276;
                var8.field3569 = var11.field207 << 9;
            }
            class390.field5211.method3164(var8, 256);
        } else if (arg6 != null) {
            var8.field3592 = arg6;
            var8.field3587 = arg4 + arg6.method1656(true) << 9;
            var8.field3583 = arg1 + arg6.method1656(true) << 9;
            var8.field3591 = class351.method1949(arg6, 25758);
            var8.field3567 = arg6.field6299;
            var8.field3569 = arg6.field6302 << 9;
            var8.field3568 = arg6.field6304;
            class279.field3524.method3235((long) arg6.field3784, -1, var8);
            return;
        }
    }
}
