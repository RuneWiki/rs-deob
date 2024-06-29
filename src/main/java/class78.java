import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class78 {

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public int field1747 = 0;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public int field1757 = 0;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Lrc;")
    public static class105 field1741 = class43.method374("Keine Antwort vom Anmelde)2Server)3", 0);

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lrc;")
    private static class105 field1748 = class43.method374("Loaded update list", 0);

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lrc;")
    private static class105 field1746 = class43.method374("Press (Wchange your password(W on front page)3", 0);

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Lrc;")
    private static class105 field1758 = class43.method374("Unexpected server response", 0);

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field1761 = 0;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Lrc;")
    public static class105 field1763 = class43.method374("(U2", 0);

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Lrc;")
    public static class105 field1760 = class43.method374("Unerwartete Antwort vom Anmelde)2Server", 0);

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lrc;")
    public static class105 field1756 = class43.method374("null", 0);

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lrc;")
    public static class105 field1749 = field1758;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "[Lb;")
    public static class7[] field1745 = new class7[2048];

    @OriginalMember(owner = "client!n", name = "D", descriptor = "Lrc;")
    public static class105 field1769 = field1748;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "Lrc;")
    public static class105 field1767 = field1746;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "Lrc;")
    public static class105 field1766 = class43.method374("", 0);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public int field1753;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lub;")
    public static class122 field1742;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Lk;")
    public class60 field1762;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "Lk;")
    public class60 field1770;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Z")
    public static boolean field1752;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method674(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1743++;
        try {
            Graphics var1 = class41.field935.getGraphics();
            class128.field3103.method320(550, var1, (byte) -89, 4);
        } catch (Exception var2) {
            class41.field935.repaint();
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIZIIII[Lte;I)Z", line = 22)
    public static final boolean method675(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, class119[] arg8, int arg9) {
        class69.method581(arg9, arg5, arg7, arg4);
        field1771++;
        boolean var10 = true;
        if (arg3) {
            method675(-122, 84, -56, true, -76, 67, -15, -16, null, -54);
        }
        for (int var11 = 0; var11 < arg8.length; var11++) {
            class119 var12 = arg8[var11];
            if (var12 != null && var12.field2797 == arg2) {
                if (var12.field2847 > 0) {
                    class110.method902(-9572, var12);
                }
                int var13 = var12.field2810 + arg9;
                if (!var12.field2825) {
                    var13 -= arg6;
                }
                int var14 = var12.field2862 + arg5;
                if (!var12.field2825) {
                    var14 -= arg1;
                }
                int var15 = var12.field2851;
                if (class96.field2224 == var12) {
                    class119 var16 = class73.method618(10449, var12);
                    int[] var17 = class1.method2(var16, 99);
                    var15 = 128;
                    int[] var18 = class1.method2(var12, 104);
                    int var19 = class75.field1664 - class80.field1795;
                    int var20 = class35.field816 - class83.field1877;
                    if (var19 <= var12.field2816 && var19 >= -var12.field2816 && var12.field2816 >= var20 && -var12.field2816 <= var20 && !class16.field340) {
                        var19 = 0;
                        var20 = 0;
                    } else if (var12.field2781 < class50.field1061 || class16.field340) {
                        class16.field340 = true;
                    } else {
                        var20 = 0;
                        var19 = 0;
                    }
                    int var21 = var19 + var18[0] - var17[0];
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    int var22 = var18[1] + var20 - var17[1];
                    if (var16.field2855 < var12.field2855 + var21) {
                        var21 = var16.field2855 - var12.field2855;
                    }
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    if (var16.field2787 < var22 + var12.field2787) {
                        var22 = var16.field2787 - var12.field2787;
                    }
                    var13 = var17[0] + var21;
                    var14 = var17[1] + var22;
                }
                if ((!var12.field2800 || var13 <= class69.field1551 && class69.field1547 >= var14 && var13 + var12.field2855 >= class69.field1546 && class69.field1549 <= var14 + var12.field2787) && (!var12.field2800 || !var12.field2815)) {
                    if (var12.field2811 == 0) {
                        if (var12.field2815 && !class108.method875(arg0, 1, var11)) {
                            continue;
                        }
                        if (!var12.field2800) {
                            if (var12.field2838 > var12.field2865 - var12.field2787) {
                                var12.field2838 = var12.field2865 - var12.field2787;
                            }
                            if (var12.field2838 < 0) {
                                var12.field2838 = 0;
                            }
                        }
                        var10 &= method675(arg0, var12.field2838, var12.field2867, false, var12.field2787 + var14, var14, var12.field2794, var12.field2855 + var13, arg8, var13);
                        if (var12.field2831 != null) {
                            var10 &= method675(arg0, var12.field2838, var12.field2867, false, var12.field2787 + var14, var14, var12.field2794, var13 + var12.field2855, var12.field2831, var13);
                        }
                        class69.method581(arg9, arg5, arg7, arg4);
                        if (var12.field2787 < var12.field2865) {
                            class57.method456(var14, var12.field2787, var12.field2838, var13 + var12.field2855, true, var12.field2865);
                        }
                    }
                    if (var12.field2811 != 1) {
                        if (var12.field2811 == 2) {
                            int var23 = 0;
                            for (int var24 = 0; var24 < var12.field2787; var24++) {
                                for (int var25 = 0; var25 < var12.field2855; var25++) {
                                    int var26 = (var12.field2873 + 32) * var25 + var13;
                                    int var27 = (var12.field2812 + 32) * var24 + var14;
                                    if (var23 < 20) {
                                        var26 += var12.field2846[var23];
                                        var27 += var12.field2822[var23];
                                    }
                                    if (var12.field2770[var23] > 0) {
                                        boolean var29 = false;
                                        int var30 = var12.field2770[var23] - 1;
                                        boolean var31 = false;
                                        if (var26 > class69.field1546 - 32 && class69.field1551 > var26 && class69.field1549 - 32 < var27 && class69.field1547 > var27 || class75.field1674 != 0 && class83.field1850 == var23) {
                                            class27 var32;
                                            if (class57.field1199 == 1 && class112.field2639 == var23 && class39.field914 == var12.field2867) {
                                                var32 = class122.method992(7945, false, var12.field2804[var23], 0, var30, 2);
                                            } else {
                                                var32 = class122.method992(7945, false, var12.field2804[var23], 3153952, var30, 1);
                                            }
                                            if (var32 == null) {
                                                var10 = false;
                                            } else if (class75.field1674 != 0 && class83.field1850 == var23 && class16.field345 == var12.field2867) {
                                                int var33 = class75.field1664 - class74.field1650;
                                                if (var33 < 5 && var33 > -5) {
                                                    var33 = 0;
                                                }
                                                int var34 = class35.field816 - class73.field1615;
                                                if (var34 < 5 && var34 > -5) {
                                                    var34 = 0;
                                                }
                                                if (class71.field1558 < 5) {
                                                    var33 = 0;
                                                    var34 = 0;
                                                }
                                                var32.method245(var26 + var33, var27 + var34, 128);
                                                if (arg2 != -1) {
                                                    class119 var35 = arg8[arg2 & 0xFFFF];
                                                    if (class69.field1549 > var27 + var34 && var35.field2838 > 0) {
                                                        int var36 = (class69.field1549 - var27 - var34) * class59.field1319 / 3;
                                                        if (class59.field1319 * 10 < var36) {
                                                            var36 = class59.field1319 * 10;
                                                        }
                                                        if (var36 > var35.field2838) {
                                                            var36 = var35.field2838;
                                                        }
                                                        class73.field1615 += var36;
                                                        var35.field2838 -= var36;
                                                    }
                                                    if (var27 + var34 + 32 > class69.field1547 && var35.field2838 < var35.field2865 - var35.field2787) {
                                                        int var37 = (var27 + var34 + 32 - class69.field1547) * class59.field1319 / 3;
                                                        if (var37 > class59.field1319 * 10) {
                                                            var37 = class59.field1319 * 10;
                                                        }
                                                        if (var37 > var35.field2865 - var35.field2787 - var35.field2838) {
                                                            var37 = var35.field2865 - var35.field2787 - var35.field2838;
                                                        }
                                                        var35.field2838 += var37;
                                                        class73.field1615 -= var37;
                                                    }
                                                }
                                            } else if (class117.field2735 != 0 && class61.field1346 == var23 && class113.field2651 == var12.field2867) {
                                                var32.method245(var26, var27, 128);
                                            } else {
                                                var32.method265(var26, var27);
                                            }
                                        }
                                    } else if (var12.field2881 != null && var23 < 20) {
                                        class27 var28 = var12.method962(var23, (byte) -38);
                                        if (var28 != null) {
                                            var28.method265(var26, var27);
                                        } else if (class35.field810) {
                                            var10 = false;
                                        }
                                    }
                                    var23++;
                                }
                            }
                        } else if (var12.field2811 == 3) {
                            int var38;
                            if (class117.method952(var12, -124)) {
                                var38 = var12.field2798;
                                if (class108.method875(arg0, 1, var11) && var12.field2832 != 0) {
                                    var38 = var12.field2832;
                                }
                            } else {
                                var38 = var12.field2817;
                                if (class108.method875(arg0, 1, var11) && var12.field2805 != 0) {
                                    var38 = var12.field2805;
                                }
                            }
                            if (var15 == 0) {
                                if (var12.field2853) {
                                    class69.method580(var13, var14, var12.field2855, var12.field2787, var38);
                                } else {
                                    class69.method588(var13, var14, var12.field2855, var12.field2787, var38);
                                }
                            } else if (var12.field2853) {
                                class69.method590(var13, var14, var12.field2855, var12.field2787, var38, 256 - (var15 & 0xFF));
                            } else {
                                class69.method595(var13, var14, var12.field2855, var12.field2787, var38, 256 - (var15 & 0xFF));
                            }
                        } else if (var12.field2811 == 4) {
                            class77 var39 = var12.method961((byte) -106);
                            if (var39 != null) {
                                class105 var40 = var12.field2864;
                                int var41;
                                if (class117.method952(var12, -117)) {
                                    var41 = var12.field2798;
                                    if (class108.method875(arg0, 1, var11) && var12.field2832 != 0) {
                                        var41 = var12.field2832;
                                    }
                                    if (var12.field2824.method863(-125) > 0) {
                                        var40 = var12.field2824;
                                    }
                                } else {
                                    var41 = var12.field2817;
                                    if (class108.method875(arg0, 1, var11) && var12.field2805 != 0) {
                                        var41 = var12.field2805;
                                    }
                                }
                                if (var12.field2800 && var12.field2779 != -1) {
                                    class31 var42 = class75.method636(var12.field2779, 0);
                                    var40 = var42.field706;
                                    if (var40 == null) {
                                        var40 = class85.field1919;
                                    }
                                    if (var42.field725 == 1 || var12.field2882 != 1) {
                                        var40 = class108.method878(new class105[] { var40, class18.field408, class89.method737(var12.field2882, (byte) -25) }, 2867);
                                    }
                                }
                                if (var12.field2835 == 6 && class85.field1909 == var12.field2867) {
                                    var40 = class85.field1916;
                                    var41 = var12.field2817;
                                }
                                if (class69.field1552 == 479) {
                                    if (var41 == 16776960) {
                                        var41 = 255;
                                    }
                                    if (var41 == 49152) {
                                        var41 = 16777215;
                                    }
                                }
                                class105 var43 = class24.method240(var40, (byte) -124, var12);
                                var39.method669(var43, var13, var14, var12.field2855, var12.field2787, var41, var12.field2829, var12.field2774, var12.field2786, var12.field2850);
                            } else if (class35.field810) {
                                var10 = false;
                            }
                        } else if (var12.field2811 == 5) {
                            if (var12.field2800) {
                                class27 var45;
                                if (var12.field2779 == -1) {
                                    var45 = var12.method965(false, (byte) 122);
                                } else {
                                    var45 = class122.method992(7945, false, var12.field2882, var12.field2820, var12.field2779, var12.field2803);
                                }
                                if (var45 != null) {
                                    int var46 = var45.field614;
                                    int var47 = var45.field610;
                                    if (var12.field2771) {
                                        int[] var49 = new int[4];
                                        class69.method592(var49);
                                        int var50 = var14;
                                        if (var49[1] > var14) {
                                            var50 = var49[1];
                                        }
                                        int var51 = var13;
                                        if (var49[0] > var13) {
                                            var51 = var49[0];
                                        }
                                        int var52 = var13 + var12.field2855;
                                        int var53 = var12.field2787 + var14;
                                        if (var49[3] < var53) {
                                            var53 = var49[3];
                                        }
                                        if (var52 > var49[2]) {
                                            var52 = var49[2];
                                        }
                                        class69.method581(var51, var50, var52, var53);
                                        int var54 = (var12.field2787 + var47 - 1) / var47;
                                        int var55 = (var46 + var12.field2855 - 1) / var46;
                                        for (int var56 = 0; var56 < var55; var56++) {
                                            for (int var57 = 0; var57 < var54; var57++) {
                                                if (var12.field2790 != 0) {
                                                    var45.method251(var13 + var46 * var56 + var46 / 2, var47 * var57 + var47 / 2 + var14, var12.field2790, 4096);
                                                } else if (var15 == 0) {
                                                    var45.method265(var46 * var56 + var13, var14 - -(var47 * var57));
                                                } else {
                                                    var45.method245(var46 * var56 + var13, var47 * var57 + var14, 256 - (var15 & 0xFF));
                                                }
                                            }
                                        }
                                        class69.method585(var49);
                                    } else {
                                        int var48 = var12.field2855 * 4096 / var46;
                                        if (var12.field2790 != 0) {
                                            var45.method251(var12.field2855 / 2 + var13, var12.field2787 / 2 + var14, var12.field2790, var48);
                                        } else if (var15 != 0) {
                                            var45.method258(var13, var14, var12.field2855, var12.field2787, 256 - (var15 & 0xFF));
                                        } else if (var12.field2855 == var46 && var12.field2787 == var47) {
                                            var45.method265(var13, var14);
                                        } else {
                                            var45.method261(var13, var14, var12.field2855, var12.field2787);
                                        }
                                    }
                                } else if (class35.field810) {
                                    var10 = false;
                                }
                            } else {
                                class27 var44 = var12.method965(class117.method952(var12, -116), (byte) -4);
                                if (var44 != null) {
                                    var44.method265(var13, var14);
                                } else if (class35.field810) {
                                    var10 = false;
                                }
                            }
                        } else if (var12.field2811 == 6) {
                            boolean var58 = class117.method952(var12, -116);
                            Object var59 = null;
                            int var60;
                            if (var58) {
                                var60 = var12.field2859;
                            } else {
                                var60 = var12.field2844;
                            }
                            class56 var61;
                            if (var12.field2848 == 5) {
                                if (var12.field2884 == 0) {
                                    var61 = class92.field2138.method147(-1, -1, null, null, 0);
                                } else {
                                    var61 = class119.field2842.method168(112);
                                }
                            } else if (var60 == -1) {
                                var61 = var12.method960((byte) 55, -1, var58, class119.field2842.field296, null);
                                if (var61 == null && class35.field810) {
                                    var10 = false;
                                }
                            } else {
                                class116 var62 = class6.method49(103, var60);
                                var61 = var12.method960((byte) 55, var12.field2877, var58, class119.field2842.field296, var62);
                                if (var61 == null && class35.field810) {
                                    var10 = false;
                                }
                            }
                            int var63 = var12.field2809;
                            int var64 = var12.field2823;
                            int var65 = var12.field2802;
                            int var66 = var12.field2856;
                            int var67 = var12.field2872;
                            int var68 = var12.field2869;
                            if (var12.field2779 != -1) {
                                class31 var69 = class75.method636(var12.field2779, 0);
                                if (var69 != null) {
                                    class31 var70 = var69.method292(var12.field2882, 0);
                                    var61 = var70.method291((byte) 126, 1, true);
                                    var67 = var70.field700;
                                    var65 = var70.field701;
                                    var63 = var70.field756;
                                    var68 = var70.field754;
                                    var66 = var70.field705;
                                    var64 = var70.field758;
                                    if (var12.field2855 > 0) {
                                        var68 = var68 * 32 / var12.field2855;
                                    }
                                }
                            }
                            class38.method347(var12.field2855 / 2 + var13, var14 - -(var12.field2787 / 2));
                            int var71 = class38.field885[var64] * var68 >> 16;
                            int var72 = class38.field876[var64] * var68 >> 16;
                            if (var61 != null) {
                                if (var12.field2800) {
                                    var61.method444();
                                    if (var12.field2796) {
                                        var61.method436(0, var63, var65, var64, var66, var61.field1328 / 2 + var67 + var71, var72 - -var67, var68);
                                    } else {
                                        var61.method425(0, var63, var65, var64, var66, var61.field1328 / 2 + var67 + var71, var67 + var72);
                                    }
                                } else {
                                    var61.method425(0, var63, 0, var64, 0, var71, var72);
                                }
                            }
                            class38.method353();
                        } else {
                            if (var12.field2811 == 7) {
                                class77 var73 = var12.method961((byte) -106);
                                if (var73 == null) {
                                    if (class35.field810) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var74 = 0;
                                for (int var75 = 0; var75 < var12.field2787; var75++) {
                                    for (int var76 = 0; var76 < var12.field2855; var76++) {
                                        if (var12.field2770[var74] > 0) {
                                            class31 var77 = class75.method636(var12.field2770[var74] - 1, 0);
                                            class105 var78 = var77.field706;
                                            if (var78 == null) {
                                                var78 = class85.field1919;
                                            }
                                            if (var77.field725 == 1 || var12.field2804[var74] != 1) {
                                                var78 = class108.method878(new class105[] { var78, class18.field408, class89.method737(var12.field2804[var74], (byte) -110) }, 2867);
                                            }
                                            int var79 = var13 + (var12.field2873 + 115) * var76;
                                            int var80 = (var12.field2812 + 12) * var75 + var14;
                                            if (var12.field2774 == 0) {
                                                var73.method658(var78, var79, var80, var12.field2817, var12.field2829);
                                            } else if (var12.field2774 == 1) {
                                                var73.method673(var78, var12.field2855 / 2 + var79, var80, var12.field2817, var12.field2829);
                                            } else {
                                                var73.method661(var78, var12.field2855 + var79 - 1, var80, var12.field2817, var12.field2829);
                                            }
                                        }
                                        var74++;
                                    }
                                }
                            }
                            if (var12.field2811 == 8 && class67.method562(-7117, arg0, var11) && class58.field1280 == class107.field2464) {
                                int var81 = 0;
                                int var82 = 0;
                                class77 var83 = class6.field79;
                                class105 var84 = var12.field2864;
                                class105 var85 = class24.method240(var84, (byte) -128, var12);
                                while (var85.method863(-127) > 0) {
                                    int var93 = var85.method834((byte) 125, class115.field2671);
                                    class105 var94;
                                    if (var93 == -1) {
                                        var94 = var85;
                                        var85 = class43.field992;
                                    } else {
                                        var94 = var85.method860(0, false, var93);
                                        var85 = var85.method862(var93 + 2, (byte) -78);
                                    }
                                    int var95 = var83.method672(var94);
                                    if (var81 < var95) {
                                        var81 = var95;
                                    }
                                    var82 += var83.field1737 + 1;
                                }
                                int var86 = var12.field2787 + var14 + 5;
                                var81 += 6;
                                var82 += 7;
                                if (var82 + var86 > arg4) {
                                    var86 = arg4 - var82;
                                }
                                int var87 = var12.field2855 + var13 - var81 - 5;
                                if (var87 < var13 + 5) {
                                    var87 = var13 + 5;
                                }
                                if (arg7 < var81 + var87) {
                                    var87 = arg7 - var81;
                                }
                                class69.method580(var87, var86, var81, var82, 16777120);
                                class69.method588(var87, var86, var81, var82, 0);
                                int var88 = var86 + var83.field1737 + 2;
                                class105 var89 = var12.field2864;
                                class105 var90 = class24.method240(var89, (byte) -121, var12);
                                while (var90.method863(-125) > 0) {
                                    int var91 = var90.method834((byte) 127, class115.field2671);
                                    class105 var92;
                                    if (var91 == -1) {
                                        var92 = var90;
                                        var90 = class43.field992;
                                    } else {
                                        var92 = var90.method860(0, false, var91);
                                        var90 = var90.method862(var91 + 2, (byte) -127);
                                    }
                                    var83.method658(var92, var87 + 3, var88, 0, false);
                                    var88 += var83.field1737 + 1;
                                }
                            }
                            if (var12.field2811 == 9) {
                                if (var12.field2827 == 1) {
                                    class69.method586(var13, var14, var13 + var12.field2855, var14 - -var12.field2787, var12.field2817);
                                } else {
                                    int var96 = var12.field2855 >= 0 ? var12.field2855 : -var12.field2855;
                                    int var97 = var12.field2787 < 0 ? -var12.field2787 : var12.field2787;
                                    int var98 = var96;
                                    if (var96 < var97) {
                                        var98 = var97;
                                    }
                                    if (var98 != 0) {
                                        int var99 = (var12.field2855 << 16) / var98;
                                        int var100 = (var12.field2787 << 16) / var98;
                                        if (var99 < var100) {
                                            var100 = -var100;
                                        } else {
                                            var99 = -var99;
                                        }
                                        int var101 = var12.field2827 * var100 >> 17;
                                        int var102 = var12.field2827 * var99 + 1 >> 17;
                                        int var103 = var12.field2855 + var13 + var101;
                                        int var104 = var12.field2827 * var99 >> 17;
                                        int var105 = var14 - var102;
                                        int var106 = var12.field2827 * var100 + 1 >> 17;
                                        int var107 = var13 + var101;
                                        int var108 = var13 - var106;
                                        int var109 = var14 + var104;
                                        int var110 = var12.field2855 + var13 - var106;
                                        int var111 = var12.field2787 + var14 - var102;
                                        int var112 = var14 + var12.field2787 + var104;
                                        class38.method345(var107, var108, var110);
                                        class38.method360(var109, var105, var111, var107, var108, var110, var12.field2817);
                                        class38.method345(var107, var110, var103);
                                        class38.method360(var109, var111, var112, var107, var110, var103, var12.field2817);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B[B)V", line = 836)
    public static final void method676(byte arg0, byte[] arg1) {
        field1750++;
        class7 var2 = new class7(arg1);
        var2.field143 = arg1.length - 2;
        class86.field1944 = var2.method101(2);
        class50.field1057 = new int[class86.field1944];
        class85.field1908 = new byte[class86.field1944][];
        class43.field981 = new int[class86.field1944];
        class113.field2646 = new int[class86.field1944];
        class90.field2059 = new int[class86.field1944];
        var2.field143 = arg1.length - class86.field1944 * 8 - 7;
        class113.field2648 = var2.method101(2);
        class107.field2460 = var2.method101(2);
        int var3 = (var2.method96(27023) & 0xFF) + 1;
        if (arg0 >= -112) {
            field1761 = -87;
        }
        for (int var4 = 0; var4 < class86.field1944; var4++) {
            class43.field981[var4] = var2.method101(2);
        }
        for (int var5 = 0; var5 < class86.field1944; var5++) {
            class113.field2646[var5] = var2.method101(2);
        }
        for (int var6 = 0; var6 < class86.field1944; var6++) {
            class90.field2059[var6] = var2.method101(2);
        }
        for (int var7 = 0; var7 < class86.field1944; var7++) {
            class50.field1057[var7] = var2.method101(2);
        }
        var2.field143 = arg1.length + 3 - var3 * 3 - class86.field1944 * 8 - 7;
        class58.field1295 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class58.field1295[var8] = var2.method84(55);
            if (class58.field1295[var8] == 0) {
                class58.field1295[var8] = 1;
            }
        }
        var2.field143 = 0;
        for (int var9 = 0; var9 < class86.field1944; var9++) {
            int var10 = class90.field2059[var9];
            int var11 = class50.field1057[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class85.field1908[var9] = var13;
            int var14 = var2.method96(27023);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method85(-4794);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method85(-4794);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLrc;Lb;)I", line = 955)
    public static final int method677(byte arg0, class105 arg1, class7 arg2) {
        if (arg0 <= 10) {
            return 7;
        }
        field1744++;
        int var3 = arg2.field143;
        arg2.method75(-54, arg1.field2383);
        arg2.field143 += class34.field792.method630(arg1.field2383, arg1.field2417, (byte) 122, 0, arg2.field117, arg2.field143);
        return arg2.field143 - var3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 978)
    public static void method678(int arg0) {
        field1763 = null;
        field1741 = null;
        field1746 = null;
        field1769 = null;
        field1766 = null;
        if (arg0 > -74) {
            method675(-27, 38, -111, false, -70, 127, 91, 100, null, 127);
        }
        field1756 = null;
        field1760 = null;
        field1745 = null;
        field1749 = null;
        field1748 = null;
        field1742 = null;
        field1758 = null;
        field1767 = null;
    }
}
