import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class144 extends class151 {

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "[B")
    public byte[] field2685;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "[S")
    public short[] field2681;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "[Lqc;")
    public class177[] field2696;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "[Leh;")
    public class53[] field2680;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "[B")
    public byte[] field2694;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "[B")
    public byte[] field2689;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "[I")
    private int[] field2690;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field2682 = 0;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field2691 = 0;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Lmb;")
    public static class132 field2688 = class166.method1092("Fps:", 121);

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "Lmb;")
    private static class132 field2695 = class166.method1092("Please try again)3", 111);

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Lmb;")
    public static class132 field2692 = field2695;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "Ljd;")
    public static class102 field2683;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V")
    public static void method967(byte arg0) {
        if (arg0 == 15) {
            field2695 = null;
            field2683 = null;
            field2688 = null;
            field2692 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
    public static final int method968(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method969(KeyEvent arg0, int arg1) {
        field2686++;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        if (arg1 != -1) {
            field2688 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLei;[I[B)Z")
    public final boolean method970(boolean arg0, class54 arg1, int[] arg2, byte[] arg3) {
        field2693++;
        class177 var5 = null;
        int var6 = 0;
        boolean var7 = true;
        if (arg0) {
            field2695 = null;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field2690[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var5 = arg1.method365(arg2, var9 >> 2, (byte) -91);
                        } else {
                            var5 = arg1.method369(var9 >> 2, (byte) -51, arg2);
                        }
                        if (var5 == null) {
                            var7 = false;
                        }
                    }
                    if (var5 != null) {
                        this.field2696[var8] = var5;
                        this.field2690[var8] = 0;
                    }
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public final void method971(boolean arg0) {
        if (arg0) {
            this.method970(true, null, null, null);
        }
        field2687++;
        this.field2690 = null;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class144() {
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
    public class144(byte[] arg0) {
        this.field2685 = new byte[128];
        this.field2681 = new short[128];
        this.field2696 = new class177[128];
        this.field2680 = new class53[128];
        this.field2694 = new byte[128];
        this.field2689 = new byte[128];
        this.field2690 = new int[128];
        int var2 = 0;
        class112 var3 = new class112(arg0);
        while (var3.field2157[var3.field2133 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method734(true);
        }
        var3.field2133++;
        var2++;
        int var6 = var3.field2133;
        int var7 = 0;
        var3.field2133 += var2;
        while (var3.field2157[var3.field2133 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method734(true);
        }
        var7++;
        var3.field2133++;
        int var10 = 0;
        int var11 = var3.field2133;
        var3.field2133 += var7;
        while (var3.field2157[var3.field2133 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method734(true);
        }
        var3.field2133++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var15 = 2;
            int var16 = 1;
            var14[1] = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method716(-1308);
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
            var15 = var10;
        }
        class53[] var19 = new class53[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class53 var103 = var19[var20] = new class53();
            int var104 = var3.method716(-1308);
            if (var104 > 0) {
                var103.field898 = new byte[var104 * 2];
            }
            int var105 = var3.method716(-1308);
            if (var105 > 0) {
                var103.field903 = new byte[var105 * 2 + 2];
                var103.field903[1] = 64;
            }
        }
        int var21 = 0;
        int var22 = var3.method716(-1308);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24 = var3.method716(-1308);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        while (var3.field2157[var3.field2133 + var21] != 0) {
            var21++;
        }
        byte[] var26 = new byte[var21];
        for (int var27 = 0; var27 < var21; var27++) {
            var26[var27] = var3.method734(true);
        }
        var3.field2133++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method716(-1308);
            this.field2681[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method716(-1308);
            this.field2681[var31] = (short) (this.field2681[var31] + (var30 << 8));
        }
        var21++;
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
                var34 = var3.method733((byte) -125);
            }
            var32--;
            this.field2681[var35] = (short) (this.field2681[var35] + class75.method450(32768, var34 - 1 << 14));
            this.field2690[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2690[var39] != 0) {
                if (var37 == 0) {
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                    var38 = var3.field2157[var6++] - 1;
                }
                var37--;
                this.field2689[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2690[var43] != 0) {
                if (var40 == 0) {
                    var42 = var3.field2157[var11++] + 16 << 2;
                    if (var8.length > var41) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                }
                var40--;
                this.field2694[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class53 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2690[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                this.field2680[var47] = var46;
                var44--;
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
                if (this.field2690[var51] > 0) {
                    var50 = var3.method716(-1308) + 1;
                }
            }
            this.field2685[var51] = (byte) var50;
            var48--;
        }
        this.field2684 = var3.method716(-1308) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class53 var100 = var19[var52];
            if (var100.field898 != null) {
                for (int var101 = 1; var101 < var100.field898.length; var101 += 2) {
                    var100.field898[var101] = var3.method734(true);
                }
            }
            if (var100.field903 != null) {
                for (int var102 = 3; var102 < var100.field903.length - 2; var102 += 2) {
                    var100.field903[var102] = var3.method734(true);
                }
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method734(true);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method734(true);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class53 var97 = var19[var55];
            if (var97.field903 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field903.length; var99 += 2) {
                    var98 = var3.method716(-1308) + var98 + 1;
                    var97.field903[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class53 var94 = var19[var56];
            if (var94.field898 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field898.length; var96 += 2) {
                    var95 = var95 + var3.method716(-1308) + 1;
                    var94.field898[var96] = (byte) var95;
                }
            }
        }
        if (var23 != null) {
            int var57 = var3.method716(-1308);
            var23[0] = (byte) var57;
            for (int var58 = 2; var58 < var23.length; var58 += 2) {
                var57 += var3.method716(-1308) + 1;
                var23[var58] = (byte) var57;
            }
            byte var59 = var23[0];
            byte var60 = var23[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2685[var61] = (byte) (this.field2685[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var23.length) {
                byte var65 = var23[var62];
                int var66 = (var65 - var59) / 2 + (var65 - var59) * var60;
                byte var67 = var23[var62 + 1];
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class172.method1121(var66, (byte) -20, var65 - var59);
                    var66 += var67 - var60;
                    this.field2685[var68] = (byte) (this.field2685[var68] * var69 + 32 >> 6);
                }
                var62 += 2;
                var60 = var67;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2685[var63] = (byte) (this.field2685[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var3.method716(-1308);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var3.method716(-1308) + var70 + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2694[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2694[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class172.method1121(var81, (byte) -20, var79 - var72);
                    int var84 = (this.field2694[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2694[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var73 = var80;
                var75 += 2;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field2694[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2694[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field892 = var3.method716(-1308);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class53 var93 = var19[var87];
            if (var93.field898 != null) {
                var93.field893 = var3.method716(-1308);
            }
            if (var93.field903 != null) {
                var93.field905 = var3.method716(-1308);
            }
            if (var93.field892 > 0) {
                var93.field889 = var3.method716(-1308);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field894 = var3.method716(-1308);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class53 var92 = var19[var89];
            if (var92.field894 > 0) {
                var92.field900 = var3.method716(-1308);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class53 var91 = var19[var90];
            if (var91.field900 > 0) {
                var91.field897 = var3.method716(-1308);
            }
        }
    }
}
