import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "n", descriptor = "[I")
    private int[] field917;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lod;")
    private static class101 field913 = class46.method335(-75, "Please use a different world)3");

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Z")
    public static boolean field915 = true;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Lod;")
    public static class101 field904 = field913;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lod;")
    private static class101 field916 = class46.method335(116, "Choose Option");

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lod;")
    public static class101 field911 = field913;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Lod;")
    public static class101 field905 = field916;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "[Lrd;")
    public static class122[] field919;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lc;Lc;Lc;ZLbc;)Z")
    public static final boolean method263(class15 arg0, class15 arg1, class15 arg2, boolean arg3, class11 arg4) {
        if (arg3) {
            method268(61, 121, 57, -63, 120);
        }
        class3.field44 = arg2;
        field909++;
        class61.field1358 = arg1;
        class33.field849 = arg4;
        class106.field2277 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBLsa;I)V")
    public static final void method264(int arg0, byte arg1, class126 arg2, int arg3) {
        field908++;
        if (class99.field2146 != null || class15.field330 || (arg2 == null || class108.method777(arg2, 151) == null)) {
            return;
        }
        class99.field2146 = arg2;
        class86.field1908 = class108.method777(arg2, 151);
        class137.field3140 = 0;
        class87.field1910 = false;
        class138.field3156 = arg0;
        class47.field1119 = arg3;
        int var4 = 31 / ((arg1 - 43) / 46);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method265(int arg0) {
        field919 = null;
        field911 = null;
        field904 = null;
        field916 = null;
        field913 = null;
        if (arg0 != 7) {
            field911 = null;
        }
        field905 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI[Lsa;)V")
    public static final void method266(byte arg0, int arg1, class126[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class126 var4 = arg2[var3];
            if (var4 != null && var4.field2794 == arg1 && (!var4.field2788 || !class2.method9(97, var4))) {
                if (var4.field2782 == 0) {
                    if (!var4.field2788 && class2.method9(115, var4) && client.field485 != var4) {
                        continue;
                    }
                    method266((byte) 95, var4.field2780, arg2);
                    if (var4.field2822 != null) {
                        method266((byte) 95, var4.field2780, var4.field2822);
                    }
                    class133 var5 = (class133) class96.field2092.method1141((long) var4.field2780, -1);
                    if (var5 != null) {
                        class118.method888(-1005, var5.field3044);
                    }
                }
                if (var4.field2782 == 6) {
                    if (var4.field2776 != -1 || var4.field2869 != -1) {
                        boolean var6 = class57.method401(-4193, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field2869;
                        } else {
                            var7 = var4.field2776;
                        }
                        if (var7 != -1) {
                            class95 var8 = class8.method39(var7, (byte) -40);
                            var4.field2861 += class141.field3255;
                            while (var8.field2066[var4.field2844] < var4.field2861) {
                                var4.field2861 -= var8.field2066[var4.field2844];
                                var4.field2844++;
                                if (var8.field2055.length <= var4.field2844) {
                                    var4.field2844 -= var8.field2057;
                                    if (var4.field2844 < 0 || var4.field2844 >= var8.field2055.length) {
                                        var4.field2844 = 0;
                                    }
                                }
                                class40.method300(false, var4);
                            }
                        }
                    }
                    if (var4.field2853 != 0 && !var4.field2788) {
                        int var9 = var4.field2853 >> 16;
                        int var10 = class141.field3255 * var9;
                        var4.field2778 = var4.field2778 + var10 & 0x7FF;
                        int var11 = var4.field2853 << 16 >> 16;
                        int var12 = class141.field3255 * var11;
                        var4.field2748 = var4.field2748 + var12 & 0x7FF;
                        class40.method300(false, var4);
                    }
                }
            }
        }
        field920++;
        if (arg0 != 95) {
            field913 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
    public final int method267(int arg0, int arg1) {
        int var3 = this.field917.length - 2;
        int var4 = var3 & arg1 << 1;
        field918++;
        if (arg0 > -25) {
            return -60;
        }
        while (true) {
            int var5 = this.field917[var4];
            if (arg1 == var5) {
                return this.field917[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
    public static final void method268(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            return;
        }
        field907++;
        class130 var5 = (class130) class93.field1999.method1141((long) arg2, arg3 - 1);
        if (var5 == null) {
            var5 = new class130();
            class93.field1999.method1137((byte) -89, (long) arg2, var5);
        }
        if (arg1 >= var5.field2975.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field2975.length; var8++) {
                var6[var8] = var5.field2975[var8];
                var7[var8] = var5.field2971[var8];
            }
            for (int var9 = var5.field2975.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2975 = var6;
            var5.field2971 = var7;
        }
        var5.field2975[arg1] = arg4;
        var5.field2971[arg1] = arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILod;BLjava/awt/Color;)V")
    public static final void method269(int arg0, class101 arg1, byte arg2, Color arg3) {
        field910++;
        try {
            Graphics var4 = class134.field3062.getGraphics();
            if (class2.field22 == null) {
                class2.field22 = new Font("Helvetica", 1, 13);
                class149.field3385 = class134.field3062.getFontMetrics(class2.field22);
            }
            if (class22.field492) {
                class22.field492 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class75.field1599, class137.field3130);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg2 <= 90) {
                field904 = null;
            }
            try {
                if (class155.field3534 == null) {
                    class155.field3534 = class134.field3062.createImage(304, 34);
                }
                Graphics var5 = class155.field3534.getGraphics();
                var5.setColor(arg3);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class2.field22);
                var5.setColor(Color.white);
                arg1.method711(22, var5, (304 - arg1.method721(class149.field3385, 120)) / 2, 0);
                var4.drawImage(class155.field3534, class75.field1599 / 2 - 152, class137.field3130 / 2 - 18, null);
            } catch (Exception var8) {
                int var6 = class137.field3130 / 2 - 18;
                int var7 = class75.field1599 / 2 - 152;
                var4.setColor(arg3);
                var4.drawRect(var7, var6, 303, 33);
                var4.fillRect(var7 + 2, var6 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var6 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var6 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class2.field22);
                var4.setColor(Color.white);
                arg1.method711(var6 + 22, var4, (304 - arg1.method721(class149.field3385, 91)) / 2 + var7, 0);
            }
        } catch (Exception var9) {
            class134.field3062.repaint();
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
    public static final void method270(int arg0, int arg1, int arg2) {
        field912++;
        int[] var3 = new int[4];
        int var4 = 1;
        var3[0] = arg1;
        int[] var5 = new int[4];
        var5[0] = arg2;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class80.field1709[var6] != arg1) {
                var3[var4] = class80.field1709[var6];
                var5[var4] = class3.field54[var6];
                var4++;
            }
        }
        class3.field54 = var5;
        class80.field1709 = var3;
        class134.method1035(0, class95.field2042, class80.field1709, class95.field2042.length - 1, class3.field54, -117);
        if (arg0 <= 18) {
            method263(null, null, null, false, null);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public static final void method271(boolean arg0) {
        if (arg0) {
            return;
        }
        field914++;
        if (class44.field1048 == 118) {
            int var1 = class118.field2611.method1080((byte) 40);
            int var2 = class6.field83 + (var1 >> 4 & 0x7);
            int var3 = (var1 & 0x7) + class41.field991;
            int var4 = class118.field2611.method1077(4);
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = class33.field850[var5];
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class98.method681(var7, var3, var2, var6, class95.field2040, 36, var5, -1, 0, -1);
            }
        } else if (class44.field1048 == 180) {
            int var8 = class118.field2611.method1077(4);
            int var9 = class6.field83 + (var8 >> 4 & 0x7);
            int var10 = (var8 & 0x7) + class41.field991;
            int var11 = class118.field2611.method1053((byte) -8);
            int var12 = class118.field2611.method1084(-105);
            int var13 = class118.field2611.method1098(!arg0);
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && class115.field2542 != var11) {
                class12 var14 = new class12();
                var14.field251 = var12;
                var14.field241 = var13;
                if (class54.field1219[class95.field2040][var9][var10] == null) {
                    class54.field1219[class95.field2040][var9][var10] = new class78();
                }
                class54.field1219[class95.field2040][var9][var10].method529(var14, 19002);
                class57.method408(var10, var9, (byte) 126);
            }
        } else if (class44.field1048 == 135) {
            int var15 = class118.field2611.method1051(-127);
            int var16 = class118.field2611.method1077(4);
            int var17 = (var16 & 0x7) + class41.field991;
            int var18 = (var16 >> 4 & 0x7) + class6.field83;
            if (var18 >= 0 && var17 >= 0 && var18 < 104 && var17 < 104) {
                class78 var19 = class54.field1219[class95.field2040][var18][var17];
                if (var19 != null) {
                    for (class12 var20 = (class12) var19.method523(false); var20 != null; var20 = (class12) var19.method527(true)) {
                        if ((var15 & 0x7FFF) == var20.field241) {
                            var20.method959(11835);
                            break;
                        }
                    }
                    if (var19.method523(false) == null) {
                        class54.field1219[class95.field2040][var18][var17] = null;
                    }
                    class57.method408(var17, var18, (byte) 68);
                }
            }
        } else if (class44.field1048 == 246) {
            int var21 = class118.field2611.method1055(110);
            int var22 = (var21 >> 4 & 0x7) + class6.field83;
            int var23 = class41.field991 + (var21 & 0x7);
            int var24 = class118.field2611.method1098(true);
            int var25 = class118.field2611.method1055(121);
            int var26 = class118.field2611.method1098(true);
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                int var27 = var22 * 128 + 64;
                int var28 = var23 * 128 + 64;
                class85 var29 = new class85(var24, class95.field2040, var27, var28, class65.method449(var28, var27, class95.field2040, true) - var25, var26, class143.field3305);
                class83.field1804.method529(var29, 19002);
            }
        } else {
            if (class44.field1048 == 220) {
                int var30 = class118.field2611.method1053((byte) 124);
                int var31 = class118.field2611.method1060(-1);
                int var32 = var31 >> 2;
                int var33 = var31 & 0x3;
                int var34 = class33.field850[var32];
                byte var35 = class118.field2611.method1086(0);
                int var36 = class118.field2611.method1098(!arg0);
                byte var37 = class118.field2611.method1079((byte) 0);
                int var38 = class118.field2611.method1053((byte) 127);
                int var39 = class118.field2611.method1051(-106);
                byte var40 = class118.field2611.method1075(!arg0);
                byte var41 = class118.field2611.method1086(0);
                int var42 = class118.field2611.method1060(-1);
                class13 var43;
                if (class115.field2542 == var36) {
                    var43 = class82.field1778;
                } else {
                    var43 = class94.field2032[var36];
                }
                int var44 = (var42 >> 4 & 0x7) + class6.field83;
                int var45 = (var42 & 0x7) + class41.field991;
                if (var43 != null) {
                    class24 var46 = class94.method652(var39, 0);
                    int var47;
                    int var48;
                    if (var33 == 1 || var33 == 3) {
                        var47 = var46.field599;
                        var48 = var46.field613;
                    } else {
                        var47 = var46.field613;
                        var48 = var46.field599;
                    }
                    int var49 = var44 + (var47 >> 1);
                    int var50 = var45 + (var48 >> 1);
                    int var51 = (var48 + 1 >> 1) + var45;
                    int var52 = (var47 + 1 >> 1) + var44;
                    int[][] var53 = class20.field431[class95.field2040];
                    int var54 = (var44 << 7) + (var47 << 6);
                    int var55 = var53[var49][var51] + var53[var52][var51] + var53[var49][var50] + var53[var52][var50] >> 2;
                    int var56 = (var45 << 7) + (var48 << 6);
                    class113 var57 = var46.method187(var32, var55, var53, var54, var56, (byte) 67, var33);
                    if (var57 != null) {
                        class98.method681(var34, var45, var44, 0, class95.field2040, 77, 0, -1, var30 + 1, var38 + 1);
                        var43.field269 = var57;
                        var43.field259 = var44 * 128 + var47 * 64;
                        if (var35 > var40) {
                            byte var58 = var35;
                            var35 = var40;
                            var40 = var58;
                        }
                        if (var37 < var41) {
                            byte var59 = var41;
                            var41 = var37;
                            var37 = var59;
                        }
                        var43.field272 = class143.field3305 + var30;
                        var43.field275 = var38 + class143.field3305;
                        var43.field258 = var45 * 128 + var48 * 64;
                        var43.field261 = var35 + var44;
                        var43.field280 = var55;
                        var43.field281 = var44 + var40;
                        var43.field264 = var41 + var45;
                        var43.field271 = var37 + var45;
                    }
                }
            }
            if (class44.field1048 == 237) {
                int var60 = class118.field2611.method1055(114);
                int var61 = (var60 >> 4 & 0x7) + class6.field83;
                int var62 = (var60 & 0x7) + class41.field991;
                int var63 = var61 + class118.field2611.method1079((byte) 0);
                int var64 = class118.field2611.method1079((byte) 0) + var62;
                int var65 = class118.field2611.method1056(32767);
                int var66 = class118.field2611.method1098(true);
                int var67 = class118.field2611.method1055(117) * 4;
                int var68 = class118.field2611.method1055(124) * 4;
                int var69 = class118.field2611.method1098(true);
                int var70 = class118.field2611.method1098(true);
                int var71 = class118.field2611.method1055(126);
                int var72 = class118.field2611.method1055(125);
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104 && var66 != 65535) {
                    int var73 = var63 * 128 + 64;
                    int var74 = var61 * 128 + 64;
                    int var75 = var62 * 128 + 64;
                    class22 var76 = new class22(var66, class95.field2040, var74, var75, class65.method449(var75, var74, class95.field2040, true) - var67, class143.field3305 + var69, class143.field3305 + var70, var71, var72, var65, var68);
                    int var77 = var64 * 128 + 64;
                    var76.method176(var73, var77, class65.method449(var77, var73, class95.field2040, true) - var68, var69 - -class143.field3305, -1);
                    class86.field1902.method529(var76, 19002);
                }
            } else if (class44.field1048 == 41) {
                int var78 = class118.field2611.method1055(123);
                int var79 = (var78 & 0x7) + class41.field991;
                int var80 = class6.field83 + (var78 >> 4 & 0x7);
                int var81 = class118.field2611.method1098(true);
                int var82 = class118.field2611.method1098(true);
                int var83 = class118.field2611.method1098(true);
                if (var80 >= 0 && var79 >= 0 && var80 < 104 && var79 < 104) {
                    class78 var84 = class54.field1219[class95.field2040][var80][var79];
                    if (var84 != null) {
                        for (class12 var85 = (class12) var84.method523(false); var85 != null; var85 = (class12) var84.method527(!arg0)) {
                            if ((var81 & 0x7FFF) == var85.field241 && var85.field251 == var82) {
                                var85.field251 = var83;
                                break;
                            }
                        }
                        class57.method408(var79, var80, (byte) 122);
                    }
                }
            } else if (class44.field1048 == 9) {
                int var86 = class118.field2611.method1077(4);
                int var87 = var86 >> 2;
                int var88 = class33.field850[var87];
                int var89 = var86 & 0x3;
                int var90 = class118.field2611.method1080((byte) -1);
                int var91 = (var90 & 0x7) + class41.field991;
                int var92 = (var90 >> 4 & 0x7) + class6.field83;
                int var93 = class118.field2611.method1053((byte) 126);
                if (var92 >= 0 && var91 >= 0 && var92 < 103 && var91 < 103) {
                    if (var88 == 0) {
                        class1 var94 = class33.field857.method550(class95.field2040, var92, var91);
                        if (var94 != null) {
                            int var95 = var94.field18 >> 14 & 0x7FFF;
                            if (var87 == 2) {
                                var94.field15 = new class111(var95, 2, var89 + 4, class95.field2040, var92, var91, var93, false, var94.field15);
                                var94.field9 = new class111(var95, 2, var89 + 1 & 0x3, class95.field2040, var92, var91, var93, false, var94.field9);
                            } else {
                                var94.field15 = new class111(var95, var87, var89, class95.field2040, var92, var91, var93, false, var94.field15);
                            }
                        }
                    }
                    if (var88 == 1) {
                        class28 var96 = class33.field857.method548(class95.field2040, var92, var91);
                        if (var96 != null) {
                            int var97 = var96.field745 >> 14 & 0x7FFF;
                            if (var87 == 4 || var87 == 5) {
                                var96.field746 = new class111(var97, 4, var89, class95.field2040, var92, var91, var93, false, var96.field746);
                            } else if (var87 == 6) {
                                var96.field746 = new class111(var97, 4, var89 + 4, class95.field2040, var92, var91, var93, false, var96.field746);
                            } else if (var87 == 7) {
                                var96.field746 = new class111(var97, 4, (var89 + 2 & 0x3) + 4, class95.field2040, var92, var91, var93, false, var96.field746);
                            } else if (var87 == 8) {
                                var96.field746 = new class111(var97, 4, var89 + 4, class95.field2040, var92, var91, var93, false, var96.field746);
                                var96.field741 = new class111(var97, 4, (var89 + 2 & 0x3) + 4, class95.field2040, var92, var91, var93, false, var96.field741);
                            }
                        }
                    }
                    if (var88 == 2) {
                        class112 var98 = class33.field857.method574(class95.field2040, var92, var91);
                        if (var87 == 11) {
                            var87 = 10;
                        }
                        if (var98 != null) {
                            var98.field2409 = new class111(var98.field2410 >> 14 & 0x7FFF, var87, var89, class95.field2040, var92, var91, var93, false, var98.field2409);
                        }
                    }
                    if (var88 == 3) {
                        class46 var99 = class33.field857.method559(class95.field2040, var92, var91);
                        if (var99 != null) {
                            var99.field1081 = new class111(var99.field1079 >> 14 & 0x7FFF, 22, var89, class95.field2040, var92, var91, var93, false, var99.field1081);
                        }
                    }
                }
            } else if (class44.field1048 == 155) {
                int var100 = class118.field2611.method1055(114);
                int var101 = (var100 & 0x7) + class41.field991;
                int var102 = class6.field83 + (var100 >> 4 & 0x7);
                int var103 = class118.field2611.method1051(-91);
                int var104 = class118.field2611.method1055(109);
                int var105 = var104 & 0x3;
                int var106 = var104 >> 2;
                int var107 = class33.field850[var106];
                if (var102 >= 0 && var101 >= 0 && var102 < 104 && var101 < 104) {
                    class98.method681(var107, var101, var102, var105, class95.field2040, -102, var106, var103, 0, -1);
                }
            } else {
                if (class44.field1048 == 129) {
                    int var108 = class118.field2611.method1055(119);
                    int var109 = (var108 & 0x7) + class41.field991;
                    int var110 = (var108 >> 4 & 0x7) + class6.field83;
                    int var111 = class118.field2611.method1098(true);
                    int var112 = class118.field2611.method1055(126);
                    int var113 = var112 >> 4 & 0xF;
                    int var114 = var112 & 0x7;
                    int var115 = class118.field2611.method1055(113);
                    if (var110 >= 0 && var109 >= 0 && var110 < 104 && var109 < 104) {
                        int var116 = var113 + 1;
                        if (class82.field1778.field1291[0] >= var110 - var116 && var110 + var116 >= class82.field1778.field1291[0] && class82.field1778.field1271[0] >= var109 - var116 && var109 + var116 >= class82.field1778.field1271[0] && class145.field3332 != 0 && var114 > 0 && class143.field3290 < 50) {
                            class120.field2648[class143.field3290] = var111;
                            class13.field284[class143.field3290] = var114;
                            class148.field3375[class143.field3290] = var115;
                            class44.field1043[class143.field3290] = null;
                            class84.field1840[class143.field3290] = (var110 << 16) + (var109 << 8) + var113;
                            class143.field3290++;
                        }
                    }
                }
                if (class44.field1048 == 232) {
                    int var117 = class118.field2611.method1084(-89);
                    int var118 = class118.field2611.method1060(-1);
                    int var119 = (var118 >> 4 & 0x7) + class6.field83;
                    int var120 = (var118 & 0x7) + class41.field991;
                    int var121 = class118.field2611.method1053((byte) -70);
                    if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104) {
                        class12 var122 = new class12();
                        var122.field251 = var117;
                        var122.field241 = var121;
                        if (class54.field1219[class95.field2040][var119][var120] == null) {
                            class54.field1219[class95.field2040][var119][var120] = new class78();
                        }
                        class54.field1219[class95.field2040][var119][var120].method529(var122, 19002);
                        class57.method408(var120, var119, (byte) 119);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "([I)V")
    public class36(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field917 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field917[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field917[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field917[var5 + var5] = arg0[var4];
            this.field917[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static final void method272(int arg0) {
        class20.field435 = 0;
        class29.field774 = -1;
        class44.field1048 = -1;
        class8.field121 = 0;
        class15.field330 = false;
        class54.field1244 = 0;
        field906++;
        class120.field2638 = 0;
        class31.field797 = -1;
        class17.field364.field3175 = 0;
        class130.field2973 = 0;
        class97.field2110 = -1;
        class118.field2611.field3175 = 0;
        class32.field842 = 0;
        for (int var1 = 0; var1 < class94.field2032.length; var1++) {
            if (class94.field2032[var1] != null) {
                class94.field2032[var1].field1339 = -1;
            }
        }
        for (int var2 = 0; var2 < class18.field376.length; var2++) {
            if (class18.field376[var2] != null) {
                class18.field376[var2].field1339 = -1;
            }
        }
        if (arg0 <= 47) {
            method264(-15, (byte) 34, null, 29);
        }
        class29.method231((byte) 65);
        class35.method262(0, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class129.field2938[var3] = true;
        }
    }
}
