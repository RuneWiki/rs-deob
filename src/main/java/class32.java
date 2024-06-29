import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Lod;")
    public static class101 field820 = class46.method335(122, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Lod;")
    public static class101 field823 = class46.method335(116, ")4lang)4de");

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Lod;")
    private static class101 field829 = class46.method335(-119, "OFF");

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Lod;")
    public static class101 field825 = class46.method335(101, "Nehmen");

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Lod;")
    public static class101 field837 = field829;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Z")
    public static boolean field821 = false;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Lod;")
    public static class101 field832 = class46.method335(-89, " )2>");

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field839 = -1;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field842 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lc;")
    public static class15 field812;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "[I")
    public static int[] field822;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method245(Component arg0, byte arg1) {
        field814++;
        int var2 = -68 / ((arg1 + 88) / 37);
        arg0.addMouseListener(class8.field122);
        arg0.addMouseMotionListener(class8.field122);
        arg0.addFocusListener(class8.field122);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII[B)Z")
    public static final boolean method246(byte arg0, int arg1, int arg2, byte[] arg3) {
        field813++;
        boolean var4 = true;
        class138 var5 = new class138(arg3);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method1052(-89);
            if (var7 == 0) {
                if (arg0 != 84) {
                    method246((byte) 127, 57, -51, null);
                }
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1052(-126);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = arg1 + var13;
                    int var15 = var5.method1055(122) >> 2;
                    int var16 = arg2 + var12;
                    if (var14 > 0 && var16 > 0 && var14 < 103 && var16 < 103) {
                        class24 var17 = class94.method652(var6, arg0 - 84);
                        if (var15 != 22 || !class10.field152 || var17.field580 != 0 || var17.field570 == 1 || var17.field615) {
                            if (!var17.method186(21813)) {
                                class33.field852++;
                                var4 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method1052(arg0 ^ 0xFFFFFFE4);
                if (var10 == 0) {
                    break;
                }
                var5.method1055(117);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method247(Component arg0, int arg1) {
        field847++;
        arg0.removeMouseListener(class8.field122);
        if (arg1 != 5222) {
            field829 = null;
        }
        arg0.removeMouseMotionListener(class8.field122);
        arg0.removeFocusListener(class8.field122);
        class65.field1481 = 0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method248(int arg0) {
        field812 = null;
        field825 = null;
        field837 = null;
        field822 = null;
        field820 = null;
        field829 = null;
        field832 = null;
        if (arg0 != -1) {
            method249(null, -68);
        }
        field823 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lc;I)V")
    public static final void method249(class15 arg0, int arg1) {
        class158.field3628 = arg0;
        field818++;
        if (arg1 != 0) {
            field823 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[Lsa;IIIIII)V")
    public static final void method250(int arg0, int arg1, class126[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field843++;
        if (arg1 != -12807) {
            method245(null, (byte) 117);
        }
        for (int var9 = 0; var9 < arg2.length; var9++) {
            class126 var10 = arg2[var9];
            if (var10 != null && (!var10.field2788 || var10.field2782 == 0 || var10.field2827 || class42.method313(var10, (byte) -72) != 0 || class86.field1908 == var10) && var10.field2794 == arg6 && (!var10.field2788 || !class2.method9(56, var10))) {
                int var11 = var10.field2812 + arg0;
                int var12 = var10.field2752 + arg5;
                if (class99.field2146 == var10) {
                    class79.field1654 = var11;
                    class149.field3384 = var12;
                    class17.field366 = true;
                }
                int var13;
                int var14;
                int var17;
                int var18;
                if (var10.field2782 == 2) {
                    var14 = arg3;
                    var17 = arg4;
                    var13 = arg7;
                    var18 = arg8;
                } else if (var10.field2782 == 9) {
                    int var19 = var11;
                    int var20 = var12;
                    int var21 = var10.field2785 + var11;
                    if (var21 < var11) {
                        var19 = var21;
                        var21 = var11;
                    }
                    int var23 = var10.field2871 + var12;
                    var14 = var19 <= arg3 ? arg3 : var19;
                    var21++;
                    var18 = var21 < arg8 ? var21 : arg8;
                    if (var23 < var12) {
                        var20 = var23;
                        var23 = var12;
                    }
                    var23++;
                    var13 = var20 <= arg7 ? arg7 : var20;
                    var17 = var23 >= arg4 ? arg4 : var23;
                } else {
                    var13 = arg7 >= var12 ? arg7 : var12;
                    var14 = var11 > arg3 ? var11 : arg3;
                    int var15 = var10.field2871 + var12;
                    int var16 = var11 + var10.field2785;
                    var17 = arg4 <= var15 ? arg4 : var15;
                    var18 = var16 < arg8 ? var16 : arg8;
                }
                if (!var10.field2788 || var18 > var14 && var13 < var17) {
                    if (var10.field2856 == 1337) {
                        class40.method300(false, var10);
                    } else if (var10.field2856 == 1338) {
                        class100.method694(var12, (byte) -34, var11);
                    } else {
                        if (var10.field2782 == 0) {
                            if (!var10.field2788 && class2.method9(125, var10) && client.field485 != var10) {
                                continue;
                            }
                            method250(var11 - var10.field2833, arg1, arg2, var14, var17, var12 - var10.field2867, var10.field2780, var13, var18);
                            if (var10.field2822 != null) {
                                method250(var11 - var10.field2833, arg1, var10.field2822, var14, var17, var12 - var10.field2867, var10.field2780, var13, var18);
                            }
                            class133 var25 = (class133) class96.field2092.method1141((long) var10.field2780, -1);
                            if (var25 != null) {
                                class6.method32(var25.field3044, var14, var17, var18, var12, var11, var13, (byte) 109);
                            }
                        }
                        if (var10.field2788) {
                            boolean var26;
                            if (var14 <= class40.field947 && var13 <= class105.field2264 && var18 > class40.field947 && class105.field2264 < var17) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            if (class27.field724 == 1 && var26) {
                                var27 = true;
                            }
                            boolean var28 = false;
                            if (class119.field2629 == 1 && var14 <= class147.field3369 && var13 <= class80.field1684 && class147.field3369 < var18 && class80.field1684 < var17) {
                                var28 = true;
                            }
                            if (var28) {
                                class36.method264(class147.field3369 - var11, (byte) 111, var10, class80.field1684 - var12);
                            }
                            if (class99.field2146 != null && class99.field2146 != var10 && var26 && class156.method1210(62, class42.method313(var10, (byte) -61))) {
                                class34.field872 = var10;
                            }
                            if (class86.field1908 == var10) {
                                class85.field1862 = var12;
                                class99.field2149 = var11;
                                class140.field3232 = true;
                            }
                            if (var10.field2827) {
                                if (var26 && class129.field2943 != 0 && var10.field2777 != null) {
                                    class141 var29 = new class141();
                                    var29.field3247 = var10.field2777;
                                    var29.field3252 = class129.field2943;
                                    var29.field3238 = var10;
                                    class28.field747.method529(var29, 19002);
                                }
                                if (class99.field2146 != null || class93.field2000 != null || class15.field330) {
                                    var28 = false;
                                    var27 = false;
                                    var26 = false;
                                }
                                if (!var10.field2787 && var28) {
                                    var10.field2787 = true;
                                    if (var10.field2837 != null) {
                                        class141 var30 = new class141();
                                        var30.field3247 = var10.field2837;
                                        var30.field3252 = class80.field1684 - var12;
                                        var30.field3250 = class147.field3369 - var11;
                                        var30.field3238 = var10;
                                        class28.field747.method529(var30, arg1 + 31809);
                                    }
                                }
                                if (var10.field2787 && var27 && var10.field2802 != null) {
                                    class141 var31 = new class141();
                                    var31.field3247 = var10.field2802;
                                    var31.field3250 = class40.field947 - var11;
                                    var31.field3238 = var10;
                                    var31.field3252 = class105.field2264 - var12;
                                    class28.field747.method529(var31, 19002);
                                }
                                if (var10.field2787 && !var27) {
                                    var10.field2787 = false;
                                    if (var10.field2759 != null) {
                                        class141 var32 = new class141();
                                        var32.field3238 = var10;
                                        var32.field3252 = class105.field2264 - var12;
                                        var32.field3247 = var10.field2759;
                                        var32.field3250 = class40.field947 - var11;
                                        class24.field573.method529(var32, arg1 + 31809);
                                    }
                                }
                                if (var27 && var10.field2764 != null) {
                                    class141 var33 = new class141();
                                    var33.field3238 = var10;
                                    var33.field3250 = class40.field947 - var11;
                                    var33.field3252 = class105.field2264 - var12;
                                    var33.field3247 = var10.field2764;
                                    class28.field747.method529(var33, 19002);
                                }
                                if (!var10.field2773 && var26) {
                                    var10.field2773 = true;
                                    if (var10.field2817 != null) {
                                        class141 var34 = new class141();
                                        var34.field3252 = class105.field2264 - var12;
                                        var34.field3238 = var10;
                                        var34.field3247 = var10.field2817;
                                        var34.field3250 = class40.field947 - var11;
                                        class28.field747.method529(var34, arg1 + 31809);
                                    }
                                }
                                if (var10.field2773 && var26 && var10.field2734 != null) {
                                    class141 var35 = new class141();
                                    var35.field3252 = class105.field2264 - var12;
                                    var35.field3250 = class40.field947 - var11;
                                    var35.field3238 = var10;
                                    var35.field3247 = var10.field2734;
                                    class28.field747.method529(var35, 19002);
                                }
                                if (var10.field2773 && !var26) {
                                    var10.field2773 = false;
                                    if (var10.field2771 != null) {
                                        class141 var36 = new class141();
                                        var36.field3247 = var10.field2771;
                                        var36.field3238 = var10;
                                        var36.field3252 = class105.field2264 - var12;
                                        var36.field3250 = class40.field947 - var11;
                                        class24.field573.method529(var36, arg1 + 31809);
                                    }
                                }
                                if (var10.field2766 != null) {
                                    class141 var37 = new class141();
                                    var37.field3247 = var10.field2766;
                                    var37.field3238 = var10;
                                    class53.field1202.method529(var37, 19002);
                                }
                                if (var10.field2769 != null && class112.field2392 > var10.field2751) {
                                    if (var10.field2864 == null || class112.field2392 - var10.field2751 > 32) {
                                        class141 var42 = new class141();
                                        var42.field3238 = var10;
                                        var42.field3247 = var10.field2769;
                                        class28.field747.method529(var42, arg1 ^ 0xFFFF87C3);
                                    } else {
                                        label380: for (int var38 = var10.field2751; var38 < class112.field2392; var38++) {
                                            int var39 = class67.field1512[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field2864.length; var40++) {
                                                if (var10.field2864[var40] == var39) {
                                                    class141 var41 = new class141();
                                                    var41.field3238 = var10;
                                                    var41.field3247 = var10.field2769;
                                                    class28.field747.method529(var41, 19002);
                                                    break label380;
                                                }
                                            }
                                        }
                                    }
                                    var10.field2751 = class112.field2392;
                                }
                                if (var10.field2846 != null && var10.field2826 < class126.field2850) {
                                    if (var10.field2774 == null || class126.field2850 - var10.field2826 > 32) {
                                        class141 var47 = new class141();
                                        var47.field3238 = var10;
                                        var47.field3247 = var10.field2846;
                                        class28.field747.method529(var47, 19002);
                                    } else {
                                        label360: for (int var43 = var10.field2826; var43 < class126.field2850; var43++) {
                                            int var44 = class134.field3078[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field2774.length; var45++) {
                                                if (var10.field2774[var45] == var44) {
                                                    class141 var46 = new class141();
                                                    var46.field3247 = var10.field2846;
                                                    var46.field3238 = var10;
                                                    class28.field747.method529(var46, arg1 + 31809);
                                                    break label360;
                                                }
                                            }
                                        }
                                    }
                                    var10.field2826 = class126.field2850;
                                }
                                if (var10.field2760 != null && var10.field2765 < class8.field133) {
                                    if (var10.field2857 == null || class8.field133 - var10.field2765 > 32) {
                                        class141 var52 = new class141();
                                        var52.field3247 = var10.field2760;
                                        var52.field3238 = var10;
                                        class28.field747.method529(var52, arg1 + 31809);
                                    } else {
                                        label340: for (int var48 = var10.field2765; var48 < class8.field133; var48++) {
                                            int var49 = class10.field151[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field2857.length; var50++) {
                                                if (var10.field2857[var50] == var49) {
                                                    class141 var51 = new class141();
                                                    var51.field3247 = var10.field2760;
                                                    var51.field3238 = var10;
                                                    class28.field747.method529(var51, 19002);
                                                    break label340;
                                                }
                                            }
                                        }
                                    }
                                    var10.field2765 = class8.field133;
                                }
                                if (var10.field2849 < class46.field1099 && var10.field2797 != null) {
                                    class141 var53 = new class141();
                                    var53.field3247 = var10.field2797;
                                    var53.field3238 = var10;
                                    class28.field747.method529(var53, 19002);
                                }
                                if (var10.field2849 < class10.field148 && var10.field2828 != null) {
                                    class141 var54 = new class141();
                                    var54.field3247 = var10.field2828;
                                    var54.field3238 = var10;
                                    class28.field747.method529(var54, 19002);
                                }
                                if (var10.field2849 < class5.field74 && var10.field2737 != null) {
                                    class141 var55 = new class141();
                                    var55.field3238 = var10;
                                    var55.field3247 = var10.field2737;
                                    class28.field747.method529(var55, 19002);
                                }
                                if (var10.field2849 < class23.field543 && var10.field2750 != null) {
                                    class141 var56 = new class141();
                                    var56.field3247 = var10.field2750;
                                    var56.field3238 = var10;
                                    class28.field747.method529(var56, 19002);
                                }
                                var10.field2849 = class108.field2306;
                                if (var10.field2758 != null) {
                                    for (int var57 = 0; var57 < class57.field1338; var57++) {
                                        class141 var58 = new class141();
                                        var58.field3238 = var10;
                                        var58.field3248 = class121.field2656[var57];
                                        var58.field3256 = class34.field878[var57];
                                        var58.field3247 = var10.field2758;
                                        class28.field747.method529(var58, arg1 + 31809);
                                    }
                                }
                            }
                        }
                        if (!var10.field2788) {
                            if (class99.field2146 != null || class93.field2000 != null || class15.field330) {
                                return;
                            }
                            if ((var10.field2770 >= 0 || var10.field2792 != 0) && var14 <= class40.field947 && var13 <= class105.field2264 && class40.field947 < var18 && class105.field2264 < var17) {
                                if (var10.field2770 < 0) {
                                    client.field485 = var10;
                                } else {
                                    client.field485 = arg2[var10.field2770];
                                }
                            }
                            if (var10.field2782 == 8 && class40.field947 >= var14 && class105.field2264 >= var13 && class40.field947 < var18 && class105.field2264 < var17) {
                                class153.field3501 = var10;
                            }
                            if (var10.field2871 < var10.field2791) {
                                class57.method399(var12, -121, var10.field2871, var10.field2791, class105.field2264, class40.field947, var10, var10.field2785 + var11);
                            }
                        }
                    }
                }
            }
        }
    }
}
