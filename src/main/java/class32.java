import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class32 extends class5 {

    @OriginalMember(owner = "client!db", name = "M", descriptor = "[I")
    public static int[] field589 = new int[25];

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Led;")
    public static class43 field593 = class191.method1219(" )2> <col=00ffff>", false);

    @OriginalMember(owner = "client!db", name = "W", descriptor = "Led;")
    private static class43 field599 = class191.method1219("Unexpected server response)3", false);

    @OriginalMember(owner = "client!db", name = "H", descriptor = "Led;")
    public static class43 field584 = class191.method1219("Hidden)2", false);

    @OriginalMember(owner = "client!db", name = "R", descriptor = "Led;")
    public static class43 field594 = field599;

    @OriginalMember(owner = "client!db", name = "db", descriptor = "Led;")
    private static class43 field606 = class191.method1219("Press (Wrecover a locked account(W on front page)3", false);

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "Led;")
    public static class43 field607 = class191.method1219("Zu viele Verbindungen von Ihrer Adresse)3", false);

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "Led;")
    public static class43 field604 = field606;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "Lrf;")
    public static class160 field585;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "Lga;")
    public static class58 field598;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Lig;")
    public static class80 field596;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public static final void method178(int arg0) {
        if (arg0 == 1024) {
            field603++;
            class50.field1005 = new class118();
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIBII[Lob;III)V")
    public static final void method179(int arg0, int arg1, byte arg2, int arg3, int arg4, class129[] arg5, int arg6, int arg7, int arg8) {
        field597++;
        int var9 = 0;
        if (arg2 != -77) {
            method181(-47, 112, -26, false);
        }
        while (arg5.length > var9) {
            class129 var10 = arg5[var9];
            if (var10 != null && (!var10.field2707 || var10.field2690 == 0 || var10.field2654 || class193.method1231((byte) 127, var10) != 0 || class159.field3211 == var10) && var10.field2576 == arg0 && (!var10.field2707 || !class163.method1020(var10, -1))) {
                int var11 = var10.field2607 + arg3;
                int var12 = var10.field2633 + arg1;
                if (class148.field3021 == var10) {
                    class67.field1357 = var12;
                    class150.field3037 = var11;
                    class85.field1664 = true;
                }
                int var13;
                int var14;
                int var15;
                int var16;
                if (var10.field2690 == 2) {
                    var13 = arg6;
                    var14 = arg7;
                    var15 = arg4;
                    var16 = arg8;
                } else if (var10.field2690 == 9) {
                    int var19 = var10.field2656 + var12;
                    int var20 = var11;
                    int var21 = var12;
                    int var22 = var10.field2662 + var11;
                    if (var19 < var12) {
                        var21 = var19;
                        var19 = var12;
                    }
                    if (var22 < var11) {
                        var20 = var22;
                        var22 = var11;
                    }
                    var22++;
                    var16 = var21 > arg8 ? var21 : arg8;
                    var13 = var22 < arg6 ? var22 : arg6;
                    var15 = var20 > arg4 ? var20 : arg4;
                    var19++;
                    var14 = arg7 <= var19 ? arg7 : var19;
                } else {
                    var15 = arg4 < var11 ? var11 : arg4;
                    int var17 = var12 + var10.field2656;
                    var14 = arg7 > var17 ? var17 : arg7;
                    int var18 = var10.field2662 + var11;
                    var16 = arg8 < var12 ? var12 : arg8;
                    var13 = var18 >= arg6 ? arg6 : var18;
                }
                if (!var10.field2707 || var16 < var14 && var15 < var13) {
                    if (var10.field2646 == 1337) {
                        class43.method265(false, var10);
                    } else if (var10.field2646 == 1338) {
                        class54.method328(var12, var11, arg2 ^ 0x2C9);
                    } else {
                        label495: {
                            if (var10.field2690 == 0) {
                                if (!var10.field2707 && class163.method1020(var10, -1) && class118.field2299 != var10) {
                                    break label495;
                                }
                                method179(var10.field2664, var12 - var10.field2572, (byte) -77, var11 - var10.field2680, var15, arg5, var13, var14, var16);
                                if (var10.field2626 != null) {
                                    method179(var10.field2664, var12 - var10.field2572, (byte) -77, var11 - var10.field2680, var15, var10.field2626, var13, var14, var16);
                                }
                                class137 var25 = (class137) class15.field227.method75((long) var10.field2664, 88);
                                if (var25 != null) {
                                    class174.method1097(25510, var14, var12, var13, var25.field2850, var16, var11, var15);
                                }
                            }
                            if (var10.field2707) {
                                boolean var26 = false;
                                boolean var27 = false;
                                if (class185.field3649 == 1 && var16 <= class41.field814 && var15 <= class187.field3673 && var14 > class41.field814 && var13 > class187.field3673) {
                                    var27 = true;
                                }
                                boolean var28;
                                if (class185.field3654 >= var16 && var15 <= class105.field1998 && var14 > class185.field3654 && var13 > class105.field1998) {
                                    var28 = true;
                                } else {
                                    var28 = false;
                                }
                                if (class21.field357 == 1 && var28) {
                                    var26 = true;
                                }
                                if (var27) {
                                    class201.method1308(false, class187.field3673 - var11, var10, class41.field814 - var12);
                                }
                                if (class148.field3021 != null && class148.field3021 != var10 && var28 && class29.method139((byte) -116, class193.method1231((byte) -109, var10))) {
                                    class100.field1909 = var10;
                                }
                                if (class159.field3211 == var10) {
                                    class55.field1106 = true;
                                    class41.field797 = var11;
                                    class203.field3965 = var12;
                                }
                                if (var10.field2654) {
                                    if (var28 && class154.field3135 != 0 && var10.field2684 != null) {
                                        class115 var29 = new class115();
                                        var29.field2238 = var10.field2684;
                                        var29.field2249 = var10;
                                        var29.field2247 = class154.field3135;
                                        class171.field3407.method756(arg2 ^ 0xFFFF9C76, var29);
                                    }
                                    if (class148.field3021 != null || class121.field2417 != null || class186.field3665) {
                                        var28 = false;
                                        var26 = false;
                                        var27 = false;
                                    }
                                    if (!var10.field2652 && var27) {
                                        var10.field2652 = true;
                                        if (var10.field2687 != null) {
                                            class115 var30 = new class115();
                                            var30.field2247 = class187.field3673 - var11;
                                            var30.field2255 = class41.field814 - var12;
                                            var30.field2249 = var10;
                                            var30.field2238 = var10.field2687;
                                            class171.field3407.method756(25541, var30);
                                        }
                                    }
                                    if (var10.field2652 && var26 && var10.field2651 != null) {
                                        class115 var31 = new class115();
                                        var31.field2249 = var10;
                                        var31.field2247 = class105.field1998 - var11;
                                        var31.field2238 = var10.field2651;
                                        var31.field2255 = class185.field3654 - var12;
                                        class171.field3407.method756(25541, var31);
                                    }
                                    if (var10.field2652 && !var26) {
                                        var10.field2652 = false;
                                        if (var10.field2675 != null) {
                                            class115 var32 = new class115();
                                            var32.field2247 = class105.field1998 - var11;
                                            var32.field2255 = class185.field3654 - var12;
                                            var32.field2238 = var10.field2675;
                                            var32.field2249 = var10;
                                            class109.field2105.method756(25541, var32);
                                        }
                                    }
                                    if (var26 && var10.field2578 != null) {
                                        class115 var33 = new class115();
                                        var33.field2249 = var10;
                                        var33.field2255 = class185.field3654 - var12;
                                        var33.field2238 = var10.field2578;
                                        var33.field2247 = class105.field1998 - var11;
                                        class171.field3407.method756(25541, var33);
                                    }
                                    if (!var10.field2685 && var28) {
                                        var10.field2685 = true;
                                        if (var10.field2595 != null) {
                                            class115 var34 = new class115();
                                            var34.field2255 = class185.field3654 - var12;
                                            var34.field2238 = var10.field2595;
                                            var34.field2249 = var10;
                                            var34.field2247 = class105.field1998 - var11;
                                            class171.field3407.method756(25541, var34);
                                        }
                                    }
                                    if (var10.field2685 && var28 && var10.field2694 != null) {
                                        class115 var35 = new class115();
                                        var35.field2247 = class105.field1998 - var11;
                                        var35.field2255 = class185.field3654 - var12;
                                        var35.field2249 = var10;
                                        var35.field2238 = var10.field2694;
                                        class171.field3407.method756(25541, var35);
                                    }
                                    if (var10.field2685 && !var28) {
                                        var10.field2685 = false;
                                        if (var10.field2630 != null) {
                                            class115 var36 = new class115();
                                            var36.field2238 = var10.field2630;
                                            var36.field2249 = var10;
                                            var36.field2255 = class185.field3654 - var12;
                                            var36.field2247 = class105.field1998 - var11;
                                            class109.field2105.method756(arg2 ^ 0xFFFF9C76, var36);
                                        }
                                    }
                                    if (var10.field2709 != null) {
                                        class115 var37 = new class115();
                                        var37.field2238 = var10.field2709;
                                        var37.field2249 = var10;
                                        class73.field1448.method756(arg2 ^ 0xFFFF9C76, var37);
                                    }
                                    if (var10.field2575 != null && class99.field1905 > var10.field2613) {
                                        if (var10.field2585 == null || class99.field1905 - var10.field2613 > 32) {
                                            class115 var42 = new class115();
                                            var42.field2249 = var10;
                                            var42.field2238 = var10.field2575;
                                            class171.field3407.method756(25541, var42);
                                        } else {
                                            label383: for (int var38 = var10.field2613; var38 < class99.field1905; var38++) {
                                                int var39 = class22.field386[var38 & 0x1F];
                                                for (int var40 = 0; var40 < var10.field2585.length; var40++) {
                                                    if (var10.field2585[var40] == var39) {
                                                        class115 var41 = new class115();
                                                        var41.field2238 = var10.field2575;
                                                        var41.field2249 = var10;
                                                        class171.field3407.method756(arg2 + 25618, var41);
                                                        break label383;
                                                    }
                                                }
                                            }
                                        }
                                        var10.field2613 = class99.field1905;
                                    }
                                    if (var10.field2660 != null && class9.field166 > var10.field2621) {
                                        if (var10.field2644 == null || class9.field166 - var10.field2621 > 32) {
                                            class115 var47 = new class115();
                                            var47.field2249 = var10;
                                            var47.field2238 = var10.field2660;
                                            class171.field3407.method756(25541, var47);
                                        } else {
                                            label363: for (int var43 = var10.field2621; var43 < class9.field166; var43++) {
                                                int var44 = class54.field1096[var43 & 0x1F];
                                                for (int var45 = 0; var45 < var10.field2644.length; var45++) {
                                                    if (var10.field2644[var45] == var44) {
                                                        class115 var46 = new class115();
                                                        var46.field2249 = var10;
                                                        var46.field2238 = var10.field2660;
                                                        class171.field3407.method756(25541, var46);
                                                        break label363;
                                                    }
                                                }
                                            }
                                        }
                                        var10.field2621 = class9.field166;
                                    }
                                    if (var10.field2658 != null && var10.field2598 < class156.field3151) {
                                        if (var10.field2634 == null || class156.field3151 - var10.field2598 > 32) {
                                            class115 var52 = new class115();
                                            var52.field2249 = var10;
                                            var52.field2238 = var10.field2658;
                                            class171.field3407.method756(25541, var52);
                                        } else {
                                            label343: for (int var48 = var10.field2598; var48 < class156.field3151; var48++) {
                                                int var49 = class46.field940[var48 & 0x1F];
                                                for (int var50 = 0; var50 < var10.field2634.length; var50++) {
                                                    if (var10.field2634[var50] == var49) {
                                                        class115 var51 = new class115();
                                                        var51.field2238 = var10.field2658;
                                                        var51.field2249 = var10;
                                                        class171.field3407.method756(25541, var51);
                                                        break label343;
                                                    }
                                                }
                                            }
                                        }
                                        var10.field2598 = class156.field3151;
                                    }
                                    if (class108.field2064 > var10.field2610 && var10.field2676 != null) {
                                        class115 var53 = new class115();
                                        var53.field2238 = var10.field2676;
                                        var53.field2249 = var10;
                                        class171.field3407.method756(25541, var53);
                                    }
                                    if (var10.field2610 < class27.field479 && var10.field2580 != null) {
                                        class115 var54 = new class115();
                                        var54.field2238 = var10.field2580;
                                        var54.field2249 = var10;
                                        class171.field3407.method756(25541, var54);
                                    }
                                    if (class145.field2977 > var10.field2610 && var10.field2669 != null) {
                                        class115 var55 = new class115();
                                        var55.field2238 = var10.field2669;
                                        var55.field2249 = var10;
                                        class171.field3407.method756(25541, var55);
                                    }
                                    if (class57.field1127 > var10.field2610 && var10.field2703 != null) {
                                        class115 var56 = new class115();
                                        var56.field2249 = var10;
                                        var56.field2238 = var10.field2703;
                                        class171.field3407.method756(25541, var56);
                                    }
                                    if (var10.field2610 < class36.field692 && var10.field2617 != null) {
                                        class115 var57 = new class115();
                                        var57.field2249 = var10;
                                        var57.field2238 = var10.field2617;
                                        class171.field3407.method756(25541, var57);
                                    }
                                    var10.field2610 = class200.field3940;
                                    if (var10.field2693 != null) {
                                        for (int var58 = 0; var58 < class108.field2081; var58++) {
                                            class115 var59 = new class115();
                                            var59.field2249 = var10;
                                            var59.field2254 = class4.field94[var58];
                                            var59.field2232 = class167.field3305[var58];
                                            var59.field2238 = var10.field2693;
                                            class171.field3407.method756(25541, var59);
                                        }
                                    }
                                }
                            }
                            if (!var10.field2707) {
                                if (class148.field3021 != null || class121.field2417 != null || class186.field3665) {
                                    return;
                                }
                                if ((var10.field2665 >= 0 || var10.field2653 != 0) && class185.field3654 >= var16 && var15 <= class105.field1998 && var14 > class185.field3654 && class105.field1998 < var13) {
                                    if (var10.field2665 >= 0) {
                                        class118.field2299 = arg5[var10.field2665];
                                    } else {
                                        class118.field2299 = var10;
                                    }
                                }
                                if (var10.field2690 == 8 && class185.field3654 >= var16 && class105.field1998 >= var15 && var14 > class185.field3654 && var13 > class105.field1998) {
                                    class82.field1625 = var10;
                                }
                                if (var10.field2590 > var10.field2662) {
                                    class91.method589(var10.field2590, var10, arg2 + 109, class105.field1998, var12 + var10.field2656, var11, class185.field3654, var10.field2662);
                                }
                            }
                        }
                    }
                }
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIB)I")
    public static final int method180(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 103) {
            field584 = null;
        }
        int var5 = 65536 - class135.field2798[arg1 * 1024 / arg0] >> 1;
        field590++;
        return ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIZ)I")
    public static final int method181(int arg0, int arg1, int arg2, boolean arg3) {
        field601++;
        if ((class15.field232[arg1][arg2][arg0] & 0x8) == 0) {
            if (arg3) {
                method181(24, 113, 46, true);
            }
            return arg1 <= 0 || (class15.field232[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljg;I)V")
    public final void method182(class89 arg0, int arg1) {
        field602++;
        if (arg1 != -5870) {
            method180(106, 113, 41, 57, (byte) -52);
        }
        while (true) {
            int var3 = arg0.method538((byte) 119);
            if (var3 == 0) {
                return;
            }
            this.method184(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static void method183(byte arg0) {
        field584 = null;
        field599 = null;
        field596 = null;
        field593 = null;
        field604 = null;
        if (arg0 < 26) {
            method178(-93);
        }
        field589 = null;
        field594 = null;
        field607 = null;
        field598 = null;
        field606 = null;
        field585 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZILjg;)V")
    private final void method184(boolean arg0, int arg1, class89 arg2) {
        if (arg1 == 1) {
            this.field592 = arg2.method555(-1113627096);
            this.field587 = arg2.method538((byte) -90);
            this.field586 = arg2.method538((byte) 126);
        }
        if (!arg0) {
            method185(true, null);
        }
        field588++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLga;)V")
    public static final void method185(boolean arg0, class58 arg1) {
        field600++;
        class17.field272 = arg1;
        if (arg0) {
            field594 = null;
        }
    }
}
