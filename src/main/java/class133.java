import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class133 extends class194 {

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "[I")
    private int[] field2314;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "[B")
    public byte[] field2299;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "[B")
    public byte[] field2307;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "[Luk;")
    public class97[] field2310;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "[Lme;")
    public class222[] field2308;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "[B")
    public byte[] field2312;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "[S")
    public short[] field2297;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    public int field2318;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "[J")
    public static long[] field2304 = new long[100];

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Lqk;")
    public static class207 field2298 = class24.method212(255, "<col=00ff00>");

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "[Lgi;")
    public static class155[] field2303 = new class155[4];

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "Lqk;")
    public static class207 field2317 = class24.method212(255, "::setparticles");

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "Lqk;")
    private static class207 field2301 = class24.method212(255, "Please wait)3)3)3");

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "Lqk;")
    public static class207 field2302 = field2301;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "Lbf;")
    public static class199 field2315 = new class199(50);

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "Ljava/awt/Image;")
    public static Image field2305;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "[I")
    public static int[] field2316;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[I[BLl;)Z")
    public final boolean method933(int arg0, int[] arg1, byte[] arg2, class160 arg3) {
        field2313++;
        boolean var5 = true;
        class222 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field2314[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg3.method1168(arg0 + 19564, var9 >> 2, arg1);
                        } else {
                            var6 = arg3.method1162(arg1, -26967, var9 >> 2);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field2308[var8] = var6;
                        this.field2314[var8] = 0;
                    }
                }
            }
        }
        if (arg0 != -19564) {
            method937(92, 94, -41, 40, 96, -116, 21, -66);
        }
        return var5;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
    public final void method934(int arg0) {
        int var2 = 1 / ((arg0 - 93) / 32);
        field2309++;
        this.field2314 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIZ)V")
    public static final void method935(int arg0, int arg1, int arg2, boolean arg3) {
        field2311++;
        class207 var4 = class105.method757(false, new class207[] { class149.field2604, class262.method1815(arg1, (byte) -121), class126.field2184, class262.method1815(arg2 >> 6, (byte) 40), class126.field2184, class262.method1815(arg0 >> 6, (byte) 83), class126.field2184, class262.method1815(arg2 & 0x3F, (byte) -112), class126.field2184, class262.method1815(arg0 & 0x3F, (byte) -117) });
        if (!arg3) {
            field2317 = null;
        }
        var4.method1446(-63);
        class281.method1913((byte) 99, var4);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILqk;)V")
    public static final void method936(int arg0, int arg1, class207 arg2) {
        field2306++;
        class90 var3 = class221.method1575(3, arg0, 1651481952);
        if (arg1 != 2) {
            field2315 = null;
        }
        var3.method648((byte) -57);
        var3.field1615 = arg2;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2300++;
        if (arg7 <= -113 && class98.method697(arg1, 4401)) {
            client.method1117(class227.field4162[arg1], -1, arg3, arg2, arg5, arg0, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)V")
    public static void method938(boolean arg0) {
        field2302 = null;
        field2316 = null;
        field2303 = null;
        field2305 = null;
        field2315 = null;
        if (arg0) {
            field2301 = null;
            field2304 = null;
            field2317 = null;
            field2298 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class133() {
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "([B)V")
    public class133(byte[] arg0) {
        this.field2314 = new int[128];
        this.field2299 = new byte[128];
        this.field2307 = new byte[128];
        this.field2310 = new class97[128];
        this.field2308 = new class222[128];
        this.field2312 = new byte[128];
        this.field2297 = new short[128];
        class149 var2 = new class149(arg0);
        int var3;
        for (var3 = 0; var2.field2568[var2.field2593 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1084((byte) 49);
        }
        var2.field2593++;
        var3++;
        int var6 = var2.field2593;
        int var7 = 0;
        var2.field2593 += var3;
        while (var2.field2568[var2.field2593 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1084((byte) 49);
        }
        var2.field2593++;
        var7++;
        int var10 = var2.field2593;
        int var11 = 0;
        var2.field2593 += var7;
        while (var2.field2568[var2.field2593 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1084((byte) 49);
        }
        var2.field2593++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            int var16 = 1;
            var14[1] = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method1045((byte) -47);
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
        class97[] var18 = new class97[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class97 var102 = var18[var19] = new class97();
            int var103 = var2.method1045((byte) 102);
            if (var103 > 0) {
                var102.field1706 = new byte[var103 * 2];
            }
            int var104 = var2.method1045((byte) -43);
            if (var104 > 0) {
                var102.field1712 = new byte[var104 * 2 + 2];
                var102.field1712[1] = 64;
            }
        }
        int var20 = var2.method1045((byte) 102);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method1045((byte) 76);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field2568[var2.field2593 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1084((byte) 49);
        }
        var2.field2593++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1045((byte) 75);
            this.field2297[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1045((byte) 80);
            this.field2297[var30] = (short) (this.field2297[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var33 < var25.length) {
                    var31 = var25[var33++];
                } else {
                    var31 = -1;
                }
                var32 = var2.method1087(0);
            }
            var31--;
            this.field2297[var34] = (short) (this.field2297[var34] + class121.method860(32768, var32 - 1 << 14));
            this.field2314[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2314[var38] != 0) {
                if (var35 == 0) {
                    if (var36 < var4.length) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                    var37 = var2.field2568[var6++] - 1;
                }
                this.field2299[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2314[var42] != 0) {
                if (var39 == 0) {
                    if (var8.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                    var41 = var2.field2568[var10++] + 16 << 2;
                }
                this.field2312[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class97 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2314[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                this.field2310[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var49 == 0) {
                if (var47 >= var25.length) {
                    var49 = -1;
                } else {
                    var49 = var25[var47++];
                }
                if (this.field2314[var50] > 0) {
                    var48 = var2.method1045((byte) -27) + 1;
                }
            }
            var49--;
            this.field2307[var50] = (byte) var48;
        }
        this.field2318 = var2.method1045((byte) -28) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class97 var99 = var18[var51];
            if (var99.field1706 != null) {
                for (int var100 = 1; var100 < var99.field1706.length; var100 += 2) {
                    var99.field1706[var100] = var2.method1084((byte) 49);
                }
            }
            if (var99.field1712 != null) {
                for (int var101 = 3; var101 < var99.field1712.length - 2; var101 += 2) {
                    var99.field1712[var101] = var2.method1084((byte) 49);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1084((byte) 49);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1084((byte) 49);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class97 var96 = var18[var54];
            if (var96.field1712 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1712.length; var98 += 2) {
                    var97 = var97 + var2.method1045((byte) 106) + 1;
                    var96.field1712[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class97 var93 = var18[var55];
            if (var93.field1706 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1706.length; var95 += 2) {
                    var94 = var2.method1045((byte) 101) + (var94 + 1);
                    var93.field1706[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1045((byte) -67);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var2.method1045((byte) 87) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field2307[var60] = (byte) (this.field2307[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                var61 += 2;
                int var66 = (var64 - var59) / 2 + (var64 - var59) * var58;
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class87.method639(var66, -857961313, var64 - var59);
                    this.field2307[var67] = (byte) (this.field2307[var67] * var68 + 32 >> 6);
                    var66 += var65 - var58;
                }
                var59 = var64;
                var58 = var65;
            }
            Object var62 = null;
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2307[var63] = (byte) (this.field2307[var63] * var58 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method1045((byte) 114);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method1045((byte) 112) + 1;
                var23[var70] = (byte) var69;
            }
            int var71 = var23[1] << 1;
            byte var72 = var23[0];
            for (int var73 = 0; var73 < var72; var73++) {
                int var84 = (this.field2312[var73] & 0xFF) + var71;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2312[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                int var78 = var23[var74 + 1] << 1;
                byte var79 = var23[var74];
                var74 += 2;
                int var80 = (var79 - var72) / 2 + (var79 - var72) * var71;
                for (int var81 = var72; var81 < var79; var81++) {
                    int var82 = class87.method639(var80, -857961313, var79 - var72);
                    int var83 = (this.field2312[var81] & 0xFF) + var82;
                    var80 += var78 - var71;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2312[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            for (int var75 = var72; var75 < 128; var75++) {
                int var77 = (this.field2312[var75] & 0xFF) + var71;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2312[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1709 = var2.method1045((byte) 115);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class97 var92 = var18[var86];
            if (var92.field1706 != null) {
                var92.field1718 = var2.method1045((byte) 91);
            }
            if (var92.field1712 != null) {
                var92.field1710 = var2.method1045((byte) -89);
            }
            if (var92.field1709 > 0) {
                var92.field1711 = var2.method1045((byte) -39);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1707 = var2.method1045((byte) 108);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class97 var91 = var18[var88];
            if (var91.field1707 > 0) {
                var91.field1704 = var2.method1045((byte) -65);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class97 var90 = var18[var89];
            if (var90.field1704 > 0) {
                var90.field1715 = var2.method1045((byte) -18);
            }
        }
        if (class94.field1685) {
        }
    }
}
