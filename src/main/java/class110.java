import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class110 extends class141 {

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "[I")
    private int[] field2696;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "[B")
    public byte[] field2692;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "[Lpd;")
    public class108[] field2695;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "[B")
    public byte[] field2697;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "[Luc;")
    public class139[] field2706;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "[S")
    public short[] field2703;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "[B")
    public byte[] field2708;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public int field2701;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public static int field2694 = 0;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "[I")
    public static int[] field2702 = new int[100];

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field2705 = -1;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "Lkd;")
    public static class73 field2707 = class126.method1070((byte) -66, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "Ljb;")
    public static class64 field2693 = new class64(64);

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "Lkd;")
    public static class73 field2710 = class126.method1070((byte) -66, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "[I")
    public static int[] field2711 = new int[25];

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
    public static int field2712 = 0;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "Lkd;")
    private static class73 field2714 = class126.method1070((byte) -66, "wishes to trade with you)3");

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "Lkd;")
    public static class73 field2709 = field2714;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "Lkd;")
    public static class73 field2715 = class126.method1070((byte) -66, "weiss:");

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "[S")
    public static short[] field2713 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
    public static final void method879(byte arg0) {
        try {
            if (arg0 < 122) {
                return;
            }
            Graphics var1 = class18.field519.getGraphics();
            class89.field2294.method98(4, 4, -16961, var1);
        } catch (Exception var2) {
            class18.field519.repaint();
        }
        field2698++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(JI)V")
    public static final void method880(long arg0, int arg1) {
        field2699++;
        int var3 = -107 / ((arg1 - 6) / 36);
        if (arg0 == 0L) {
            return;
        }
        if (class126.field3231 >= 100) {
            class74.method647((byte) 126, class9.field298, class19.field539, 0);
            return;
        }
        class73 var4 = class84.method708(arg0, 110).method610(-124);
        for (int var5 = 0; var5 < class126.field3231; var5++) {
            if (class102.field2558[var5] == arg0) {
                class74.method647((byte) 124, class9.field298, class32.method258(-93, new class73[] { var4, class58.field1554 }), 0);
                return;
            }
        }
        for (int var6 = 0; var6 < class14.field431; var6++) {
            if (class49.field1305[var6] == arg0) {
                class74.method647((byte) -60, class9.field298, class32.method258(-81, new class73[] { class89.field2249, var4, class153.field3770 }), 0);
                return;
            }
        }
        if (var4.method616(-78, class73.field1901.field3025)) {
            return;
        }
        class102.field2558[class126.field3231++] = arg0;
        class16.field494++;
        class38.field1028 = true;
        class121.field3079.method1215(117, 24);
        class121.field3079.method967(true, arg0);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public final void method881(int arg0) {
        if (arg0 > -91) {
            this.method881(-30);
        }
        field2704++;
        this.field2696 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([IBLg;[B)Z")
    public final boolean method882(int[] arg0, byte arg1, class43 arg2, byte[] arg3) {
        field2700++;
        boolean var5 = true;
        int var6 = 0;
        class108 var7 = null;
        int var8 = 0;
        if (arg1 != 97) {
            return false;
        }
        while (var8 < 128) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field2696[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method320(arg0, var9 >> 2, (byte) -47);
                        } else {
                            var7 = arg2.method321(arg0, var9 >> 2, 99);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2695[var8] = var7;
                        this.field2696[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class110() {
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V")
    public class110(byte[] arg0) {
        this.field2696 = new int[128];
        this.field2692 = new byte[128];
        this.field2695 = new class108[128];
        this.field2697 = new byte[128];
        int var2 = 0;
        this.field2706 = new class139[128];
        this.field2703 = new short[128];
        this.field2708 = new byte[128];
        class114 var3 = new class114(arg0);
        while (var3.field2880[var3.field2816 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method966((byte) 126);
        }
        var2++;
        var3.field2816++;
        int var6 = 0;
        int var7 = var3.field2816;
        var3.field2816 += var2;
        while (var3.field2880[var3.field2816 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method966((byte) 76);
        }
        var3.field2816++;
        var6++;
        int var10 = var3.field2816;
        int var11 = 0;
        var3.field2816 += var6;
        while (var3.field2880[var3.field2816 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method966((byte) 87);
        }
        var11++;
        byte[] var14 = new byte[var11];
        var3.field2816++;
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method957((byte) 19);
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
        class139[] var19 = new class139[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class139 var103 = var19[var20] = new class139();
            int var104 = var3.method957((byte) 113);
            if (var104 > 0) {
                var103.field3443 = new byte[var104 * 2];
            }
            int var105 = var3.method957((byte) 88);
            if (var105 > 0) {
                var103.field3449 = new byte[var105 * 2 + 2];
                var103.field3449[1] = 64;
            }
        }
        int var21 = var3.method957((byte) 61);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var3.method957((byte) 120);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var3.field2880[var3.field2816 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var3.method966((byte) 94);
        }
        var3.field2816++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method957((byte) 71);
            this.field2703[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method957((byte) 38);
            this.field2703[var31] = (short) (this.field2703[var31] + (var30 << 8));
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
                var34 = var3.method960((byte) -128);
            }
            var32--;
            this.field2703[var35] = (short) (this.field2703[var35] + (class149.method1189(var34 - 1, 2) << 14));
            this.field2696[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2696[var39] != 0) {
                if (var37 == 0) {
                    if (var36 >= var4.length) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                    var38 = var3.field2880[var7++] - 1;
                }
                this.field2708[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2696[var43] != 0) {
                if (var40 == 0) {
                    if (var41 < var8.length) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                    var42 = var3.field2880[var10++] + 16 << 2;
                }
                this.field2692[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class139 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2696[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field2706[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var50 == 0) {
                if (var49 >= var26.length) {
                    var50 = -1;
                } else {
                    var50 = var26[var49++];
                }
                if (this.field2696[var51] > 0) {
                    var48 = var3.method957((byte) 101) + 1;
                }
            }
            var50--;
            this.field2697[var51] = (byte) var48;
        }
        this.field2701 = var3.method957((byte) 101) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class139 var100 = var19[var52];
            if (var100.field3443 != null) {
                for (int var101 = 1; var101 < var100.field3443.length; var101 += 2) {
                    var100.field3443[var101] = var3.method966((byte) 58);
                }
            }
            if (var100.field3449 != null) {
                for (int var102 = 3; var102 < var100.field3449.length - 2; var102 += 2) {
                    var100.field3449[var102] = var3.method966((byte) 109);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method966((byte) 51);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var3.method966((byte) 52);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class139 var97 = var19[var55];
            if (var97.field3449 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3449.length; var99 += 2) {
                    var98 = var3.method957((byte) 22) + var98 + 1;
                    var97.field3449[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class139 var94 = var19[var56];
            if (var94.field3443 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3443.length; var96 += 2) {
                    var95 = var95 + var3.method957((byte) 92) + 1;
                    var94.field3443[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method957((byte) 36);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var3.method957((byte) 57) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2697[var61] = (byte) (this.field2697[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class77.method670(var67, (byte) 119, var65 - var59);
                    var67 += var66 - var60;
                    this.field2697[var68] = (byte) (this.field2697[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var62 += 2;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2697[var63] = (byte) (this.field2697[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var3.method957((byte) 13);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var3.method957((byte) 82) + 1;
                var24[var71] = (byte) var70;
            }
            int var72 = var24[1] << 1;
            byte var73 = var24[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field2692[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2692[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = (var79 - var73) * var72 + (var79 - var73) / 2;
                int var81 = var24[var75 + 1] << 1;
                var75 += 2;
                for (int var82 = var73; var82 < var79; var82++) {
                    int var83 = class77.method670(var80, (byte) 119, var79 - var73);
                    var80 += var81 - var72;
                    int var84 = (this.field2692[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2692[var82] = (byte) var84;
                }
                var72 = var81;
                var73 = var79;
            }
            for (int var76 = var73; var76 < 128; var76++) {
                int var78 = (this.field2692[var76] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2692[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field3444 = var3.method957((byte) 89);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class139 var93 = var19[var87];
            if (var93.field3443 != null) {
                var93.field3467 = var3.method957((byte) 113);
            }
            if (var93.field3449 != null) {
                var93.field3441 = var3.method957((byte) 78);
            }
            if (var93.field3444 > 0) {
                var93.field3457 = var3.method957((byte) 101);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field3461 = var3.method957((byte) 109);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class139 var92 = var19[var89];
            if (var92.field3461 > 0) {
                var92.field3455 = var3.method957((byte) 88);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class139 var91 = var19[var90];
            if (var91.field3455 > 0) {
                var91.field3450 = var3.method957((byte) 75);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public static void method883(int arg0) {
        field2707 = null;
        field2710 = null;
        field2711 = null;
        field2709 = null;
        if (arg0 >= -80) {
            method880(49L, -115);
        }
        field2714 = null;
        field2702 = null;
        field2715 = null;
        field2713 = null;
        field2693 = null;
    }
}
