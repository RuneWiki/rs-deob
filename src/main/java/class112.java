import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class112 extends class29 {

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    private int field2750 = 0;

    @OriginalMember(owner = "client!sd", name = "mb", descriptor = "I")
    private int field2759 = 128;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
    public int field2754 = -1;

    @OriginalMember(owner = "client!sd", name = "sb", descriptor = "I")
    private int field2765 = 0;

    @OriginalMember(owner = "client!sd", name = "ub", descriptor = "[I")
    private int[] field2767 = new int[6];

    @OriginalMember(owner = "client!sd", name = "nb", descriptor = "[I")
    private int[] field2760 = new int[6];

    @OriginalMember(owner = "client!sd", name = "yb", descriptor = "I")
    private int field2771 = 0;

    @OriginalMember(owner = "client!sd", name = "xb", descriptor = "I")
    private int field2770 = 128;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "Lwb;")
    public static class130 field2748 = class26.method212("Chat panel redrawn", -32376);

    @OriginalMember(owner = "client!sd", name = "kb", descriptor = "[I")
    public static int[] field2757 = new int[5];

    @OriginalMember(owner = "client!sd", name = "vb", descriptor = "I")
    public static int field2768 = -1;

    @OriginalMember(owner = "client!sd", name = "lb", descriptor = "Lwb;")
    public static class130 field2758 = class26.method212(" @whi@(X", -32376);

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "Lwb;")
    public static class130 field2745 = class26.method212("headicons_prayer", -32376);

    @OriginalMember(owner = "client!sd", name = "wb", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!sd", name = "rb", descriptor = "Lwb;")
    private static class130 field2764 = class26.method212("Attack", -32376);

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "Lwb;")
    public static class130 field2747 = field2764;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!sd", name = "ob", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!sd", name = "qb", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!sd", name = "tb", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!sd", name = "zb", descriptor = "I")
    private int field2772;

    @OriginalMember(owner = "client!sd", name = "Ab", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!sd", name = "Bb", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!sd", name = "Cb", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "Lda;")
    public static class20 field2749;

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "Lk;")
    public static class60 field2755;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "[I")
    public static int[] field2751;

    @OriginalMember(owner = "client!sd", name = "pb", descriptor = "[I")
    public static int[] field2762;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lfe;II)V", line = 3)
    private final void method856(class36 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2772 = arg0.method351((byte) -126);
        } else if (arg1 == 2) {
            this.field2754 = arg0.method351((byte) -109);
        } else if (arg1 == 4) {
            this.field2770 = arg0.method351((byte) -107);
        } else if (arg1 == 5) {
            this.field2759 = arg0.method351((byte) -126);
        } else if (arg1 == 6) {
            this.field2750 = arg0.method351((byte) -110);
        } else if (arg1 == 7) {
            this.field2771 = arg0.method365((byte) -128);
        } else if (arg1 == 8) {
            this.field2765 = arg0.method365((byte) -126);
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field2767[arg1 - 40] = arg0.method351((byte) -105);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field2760[arg1 - 50] = arg0.method351((byte) -99);
        }
        field2774++;
        if (arg2 >= -55) {
            this.method862(null, 43);
        }
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V", line = 66)
    public static void method857(int arg0) {
        field2747 = null;
        field2762 = null;
        field2749 = null;
        field2755 = null;
        field2758 = null;
        if (arg0 != -6) {
            method857(-1);
        }
        field2748 = null;
        field2745 = null;
        field2751 = null;
        field2757 = null;
        field2764 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILfc;IIBILuc;)V", line = 85)
    public static final void method858(int arg0, int arg1, int arg2, class34 arg3, int arg4, int arg5, byte arg6, int arg7, class121 arg8) {
        field2761++;
        if (class4.field189 && (class56.field1435[0][arg4][arg5] & 0x2) == 0) {
            if ((class56.field1435[arg1][arg4][arg5] & 0x10) != 0) {
                return;
            }
            if (class132.method1021(arg4, (byte) -77, arg5, arg1) != class111.field2726) {
                return;
            }
        }
        if (class128.field3028 > arg1) {
            class128.field3028 = arg1;
        }
        int var9 = class69.field1781[arg1][arg4][arg5];
        int var10 = class69.field1781[arg1][arg4 + 1][arg5];
        int var11 = class69.field1781[arg1][arg4 + 1][arg5 + 1];
        int var12 = class69.field1781[arg1][arg4][arg5 + 1];
        int var13 = var9 + var10 + var12 + var11 >> 2;
        int var14 = (arg0 << 14) + (arg5 << 7) + arg4 + 1073741824;
        class109 var15 = class32.method256(6, arg0);
        if (var15.field2633 == 0) {
            var14 += Integer.MIN_VALUE;
        }
        int var16 = (arg2 << 6) + arg7;
        if (var15.field2679 == 1) {
            var16 += 256;
        }
        if (var15.method832(arg6 + 42)) {
            class54.method462(arg4, arg6 ^ 0xFFFFBFCE, arg5, var15, arg2, arg1);
        }
        if (arg7 == 22) {
            if (!class4.field189 || var15.field2633 != 0 || var15.field2677) {
                class22 var17;
                if (var15.field2622 == -1 && var15.field2629 == null) {
                    var17 = var15.method827(var12, var9, (byte) -20, arg2, 22, var11, var10);
                } else {
                    var17 = new class48(arg0, 22, arg2, var9, var10, var11, var12, var15.field2622, true);
                }
                arg3.method273(arg1, arg4, arg5, var13, var17, var14, var16);
                if (var15.field2646 && var15.field2633 == 1 && arg8 != null) {
                    arg8.method926(arg5, (byte) 48, arg4);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class22 var37;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var37 = var15.method827(var12, var9, (byte) -20, arg2, 10, var11, var10);
            } else {
                var37 = new class48(arg0, 10, arg2, var9, var10, var11, var12, var15.field2622, true);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg2 == 1 || arg2 == 3) {
                    var38 = var15.field2647;
                    var39 = var15.field2664;
                } else {
                    var38 = var15.field2664;
                    var39 = var15.field2647;
                }
                int var40 = 0;
                if (arg7 == 11) {
                    var40 += 256;
                }
                if (arg3.method316(arg1, arg4, arg5, var13, var39, var38, var37, var40, var14, var16) && var15.field2623) {
                    class102 var41;
                    if (var37 instanceof class102) {
                        var41 = (class102) var37;
                    } else {
                        var41 = var15.method827(var12, var9, (byte) -20, arg2, 10, var11, var10);
                    }
                    if (var41 != null) {
                        for (int var42 = 0; var42 <= var39; var42++) {
                            for (int var43 = 0; var43 <= var38; var43++) {
                                int var44 = var41.method771() / 4;
                                if (var44 > 30) {
                                    var44 = 30;
                                }
                                if (var44 > class117.field2879[arg1][arg4 + var42][arg5 + var43]) {
                                    class117.field2879[arg1][arg4 + var42][arg5 + var43] = (byte) var44;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field2646 && arg8 != null) {
                arg8.method924(var15.field2664, var15.field2647, var15.field2639, arg5, arg6 - 59, arg4, arg2);
            }
        } else if (arg7 >= 12) {
            class22 var18;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var18 = var15.method827(var12, var9, (byte) -20, arg2, arg7, var11, var10);
            } else {
                var18 = new class48(arg0, arg7, arg2, var9, var10, var11, var12, var15.field2622, true);
            }
            arg3.method316(arg1, arg4, arg5, var13, 1, 1, var18, 0, var14, var16);
            if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg1 > 0) {
                class117.field2895[arg1][arg4][arg5] = class129.method950(class117.field2895[arg1][arg4][arg5], 2340);
            }
            if (var15.field2646 && arg8 != null) {
                arg8.method924(var15.field2664, var15.field2647, var15.field2639, arg5, 0, arg4, arg2);
            }
        } else if (arg7 == 0) {
            class22 var19;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var19 = var15.method827(var12, var9, (byte) -20, arg2, 0, var11, var10);
            } else {
                var19 = new class48(arg0, 0, arg2, var9, var10, var11, var12, var15.field2622, true);
            }
            arg3.method291(arg1, arg4, arg5, var13, var19, null, class31.field878[arg2], 0, var14, var16);
            if (arg2 == 0) {
                if (var15.field2623) {
                    class117.field2879[arg1][arg4][arg5] = 50;
                    class117.field2879[arg1][arg4][arg5 + 1] = 50;
                }
                if (var15.field2663) {
                    class117.field2895[arg1][arg4][arg5] = class129.method950(class117.field2895[arg1][arg4][arg5], 585);
                }
            } else if (arg2 == 1) {
                if (var15.field2623) {
                    class117.field2879[arg1][arg4][arg5 + 1] = 50;
                    class117.field2879[arg1][arg4 + 1][arg5 + 1] = 50;
                }
                if (var15.field2663) {
                    class117.field2895[arg1][arg4][arg5 + 1] = class129.method950(class117.field2895[arg1][arg4][arg5 + 1], 1170);
                }
            } else if (arg2 == 2) {
                if (var15.field2623) {
                    class117.field2879[arg1][arg4 + 1][arg5] = 50;
                    class117.field2879[arg1][arg4 + 1][arg5 + 1] = 50;
                }
                if (var15.field2663) {
                    class117.field2895[arg1][arg4 + 1][arg5] = class129.method950(class117.field2895[arg1][arg4 + 1][arg5], 585);
                }
            } else if (arg2 == 3) {
                if (var15.field2623) {
                    class117.field2879[arg1][arg4][arg5] = 50;
                    class117.field2879[arg1][arg4 + 1][arg5] = 50;
                }
                if (var15.field2663) {
                    class117.field2895[arg1][arg4][arg5] = class129.method950(class117.field2895[arg1][arg4][arg5], 1170);
                }
            }
            if (var15.field2646 && arg8 != null) {
                arg8.method933(arg5, arg7, (byte) 126, arg4, var15.field2639, arg2);
            }
            if (var15.field2660 != 16) {
                arg3.method298(arg1, arg4, arg5, var15.field2660);
            }
        } else if (arg7 == 1) {
            class22 var20;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var20 = var15.method827(var12, var9, (byte) -20, arg2, 1, var11, var10);
            } else {
                var20 = new class48(arg0, 1, arg2, var9, var10, var11, var12, var15.field2622, true);
            }
            arg3.method291(arg1, arg4, arg5, var13, var20, null, class95.field2302[arg2], 0, var14, var16);
            if (var15.field2623) {
                if (arg2 == 0) {
                    class117.field2879[arg1][arg4][arg5 + 1] = 50;
                } else if (arg2 == 1) {
                    class117.field2879[arg1][arg4 + 1][arg5 + 1] = 50;
                } else if (arg2 == 2) {
                    class117.field2879[arg1][arg4 + 1][arg5] = 50;
                } else if (arg2 == 3) {
                    class117.field2879[arg1][arg4][arg5] = 50;
                }
            }
            if (var15.field2646 && arg8 != null) {
                arg8.method933(arg5, arg7, (byte) -31, arg4, var15.field2639, arg2);
            }
        } else if (arg7 == 2) {
            int var21 = arg2 + 1 & 0x3;
            class22 var22;
            class22 var23;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var22 = var15.method827(var12, var9, (byte) -20, arg2 + 4, 2, var11, var10);
                var23 = var15.method827(var12, var9, (byte) -20, var21, 2, var11, var10);
            } else {
                var22 = new class48(arg0, 2, arg2 + 4, var9, var10, var11, var12, var15.field2622, true);
                var23 = new class48(arg0, 2, var21, var9, var10, var11, var12, var15.field2622, true);
            }
            arg3.method291(arg1, arg4, arg5, var13, var22, var23, class31.field878[arg2], class31.field878[var21], var14, var16);
            if (var15.field2663) {
                if (arg2 == 0) {
                    class117.field2895[arg1][arg4][arg5] = class129.method950(class117.field2895[arg1][arg4][arg5], 585);
                    class117.field2895[arg1][arg4][arg5 + 1] = class129.method950(class117.field2895[arg1][arg4][arg5 + 1], 1170);
                } else if (arg2 == 1) {
                    class117.field2895[arg1][arg4][arg5 + 1] = class129.method950(class117.field2895[arg1][arg4][arg5 + 1], 1170);
                    class117.field2895[arg1][arg4 + 1][arg5] = class129.method950(class117.field2895[arg1][arg4 + 1][arg5], 585);
                } else if (arg2 == 2) {
                    class117.field2895[arg1][arg4 + 1][arg5] = class129.method950(class117.field2895[arg1][arg4 + 1][arg5], 585);
                    class117.field2895[arg1][arg4][arg5] = class129.method950(class117.field2895[arg1][arg4][arg5], 1170);
                } else if (arg2 == 3) {
                    class117.field2895[arg1][arg4][arg5] = class129.method950(class117.field2895[arg1][arg4][arg5], 1170);
                    class117.field2895[arg1][arg4][arg5] = class129.method950(class117.field2895[arg1][arg4][arg5], 585);
                }
            }
            if (var15.field2646 && arg8 != null) {
                arg8.method933(arg5, arg7, (byte) -74, arg4, var15.field2639, arg2);
            }
            if (var15.field2660 != 16) {
                arg3.method298(arg1, arg4, arg5, var15.field2660);
            }
        } else if (arg7 == 3) {
            class22 var24;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var24 = var15.method827(var12, var9, (byte) -20, arg2, 3, var11, var10);
            } else {
                var24 = new class48(arg0, 3, arg2, var9, var10, var11, var12, var15.field2622, true);
            }
            arg3.method291(arg1, arg4, arg5, var13, var24, null, class95.field2302[arg2], 0, var14, var16);
            if (var15.field2623) {
                if (arg2 == 0) {
                    class117.field2879[arg1][arg4][arg5 + 1] = 50;
                } else if (arg2 == 1) {
                    class117.field2879[arg1][arg4 + 1][arg5 + 1] = 50;
                } else if (arg2 == 2) {
                    class117.field2879[arg1][arg4 + 1][arg5] = 50;
                } else if (arg2 == 3) {
                    class117.field2879[arg1][arg4][arg5] = 50;
                }
            }
            if (var15.field2646 && arg8 != null) {
                arg8.method933(arg5, arg7, (byte) 15, arg4, var15.field2639, arg2);
            }
        } else if (arg7 == 9) {
            class22 var25;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var25 = var15.method827(var12, var9, (byte) -20, arg2, arg7, var11, var10);
            } else {
                var25 = new class48(arg0, arg7, arg2, var9, var10, var11, var12, var15.field2622, true);
            }
            arg3.method316(arg1, arg4, arg5, var13, 1, 1, var25, 0, var14, var16);
            if (var15.field2646 && arg8 != null) {
                arg8.method924(var15.field2664, var15.field2647, var15.field2639, arg5, arg6 - 59, arg4, arg2);
            }
        } else {
            if (var15.field2632) {
                if (arg2 == 1) {
                    int var26 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var9;
                    var9 = var26;
                } else if (arg2 == 2) {
                    int var28 = var12;
                    var12 = var10;
                    var10 = var28;
                    int var29 = var11;
                    var11 = var9;
                    var9 = var29;
                } else if (arg2 == 3) {
                    int var27 = var12;
                    var12 = var9;
                    var9 = var10;
                    var10 = var11;
                    var11 = var27;
                }
            }
            if (arg6 != 59) {
                field2762 = null;
            }
            if (arg7 == 4) {
                class22 var30;
                if (var15.field2622 == -1 && var15.field2629 == null) {
                    var30 = var15.method827(var12, var9, (byte) -20, 0, 4, var11, var10);
                } else {
                    var30 = new class48(arg0, 4, 0, var9, var10, var11, var12, var15.field2622, true);
                }
                arg3.method296(arg1, arg4, arg5, var13, var30, class31.field878[arg2], arg2 * 512, 0, 0, var14, var16);
            } else if (arg7 == 5) {
                int var31 = arg3.method272(arg1, arg4, arg5);
                int var32 = 16;
                if (var31 > 0) {
                    var32 = class32.method256(6, var31 >> 14 & 0x7FFF).field2660;
                }
                class22 var33;
                if (var15.field2622 == -1 && var15.field2629 == null) {
                    var33 = var15.method827(var12, var9, (byte) -20, 0, 4, var11, var10);
                } else {
                    var33 = new class48(arg0, 4, 0, var9, var10, var11, var12, var15.field2622, true);
                }
                arg3.method296(arg1, arg4, arg5, var13, var33, class31.field878[arg2], arg2 * 512, class108.field2602[arg2] * var32, class52.field1370[arg2] * var32, var14, var16);
            } else if (arg7 == 6) {
                class22 var34;
                if (var15.field2622 == -1 && var15.field2629 == null) {
                    var34 = var15.method827(var12, var9, (byte) -20, 0, 4, var11, var10);
                } else {
                    var34 = new class48(arg0, 4, 0, var9, var10, var11, var12, var15.field2622, true);
                }
                arg3.method296(arg1, arg4, arg5, var13, var34, 256, arg2, 0, 0, var14, var16);
            } else if (arg7 == 7) {
                class22 var35;
                if (var15.field2622 == -1 && var15.field2629 == null) {
                    var35 = var15.method827(var12, var9, (byte) -20, 0, 4, var11, var10);
                } else {
                    var35 = new class48(arg0, 4, 0, var9, var10, var11, var12, var15.field2622, true);
                }
                arg3.method296(arg1, arg4, arg5, var13, var35, 512, arg2, 0, 0, var14, var16);
            } else if (arg7 == 8) {
                class22 var36;
                if (var15.field2622 == -1 && var15.field2629 == null) {
                    var36 = var15.method827(var12, var9, (byte) -20, 0, 4, var11, var10);
                } else {
                    var36 = new class48(arg0, 4, 0, var9, var10, var11, var12, var15.field2622, true);
                }
                arg3.method296(arg1, arg4, arg5, var13, var36, 768, arg2, 0, 0, var14, var16);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)V", line = 614)
    public static final void method859(byte arg0) {
        int var1 = 90 % ((arg0 + 19) / 61);
        field2766++;
        while (true) {
            label284: do {
                while (class59.method483(true)) {
                    if (class115.field2843 != -1 && class116.field2874 == class115.field2843) {
                        if (class36.field1026 == 85 && class9.field291.method958((byte) -38) > 0) {
                            class9.field291 = class9.field291.method970(true, class9.field291.method958((byte) -38) - 1, 0);
                        }
                        continue label284;
                    }
                    if (class101.field2435) {
                        if (class36.field1026 == 85 && class9.field300.method958((byte) -38) > 0) {
                            class9.field300 = class9.field300.method970(true, class9.field300.method958((byte) -38) - 1, 0);
                            class129.field3047 = true;
                        }
                        if (class106.method802(class72.field1838, -98) && class9.field300.method958((byte) -38) < 80) {
                            class9.field300 = class9.field300.method991(class72.field1838, -3);
                            class129.field3047 = true;
                        }
                        if (class36.field1026 == 84) {
                            class129.field3047 = true;
                            class101.field2435 = false;
                            if (class17.field470 == 1) {
                                long var11 = class9.field300.method988(-95);
                                class53.method456(-105, var11);
                            }
                            if (class17.field470 == 2 && class35.field993 > 0) {
                                long var13 = class9.field300.method988(-121);
                                class89.method657(var13, (byte) -33);
                            }
                            if (class17.field470 == 3 && class9.field300.method958((byte) -38) > 0) {
                                class14.field406.method727(179, 111);
                                class14.field406.method330(-1, 0);
                                int var15 = class14.field406.field1057;
                                class32.field884++;
                                class14.field406.method344(class123.field2978, -1652311768);
                                class99.method735(113, class14.field406, class9.field300);
                                class14.field406.method359(class14.field406.field1057 - var15, 7);
                                if (class48.field1291 == 2) {
                                    class48.field1291 = 1;
                                    class106.field2576++;
                                    class96.field2316 = true;
                                    class14.field406.method727(0, 51);
                                    class14.field406.method330(-1, class121.field2965);
                                    class14.field406.method330(-1, class48.field1291);
                                    class14.field406.method330(-1, class101.field2420);
                                }
                            }
                            if (class17.field470 == 4 && class109.field2657 < 100) {
                                long var16 = class9.field300.method988(-74);
                                class2.method14(var16, 0);
                            }
                            if (class17.field470 == 5 && class109.field2657 > 0) {
                                long var18 = class9.field300.method988(-90);
                                class93.method699(29841, var18);
                            }
                        }
                    } else if (class63.field1598 == 1) {
                        if (class36.field1026 == 85 && class9.field293.method958((byte) -38) > 0) {
                            class9.field293 = class9.field293.method970(true, class9.field293.method958((byte) -38) - 1, 0);
                            class129.field3047 = true;
                        }
                        if (class53.method448((byte) 65, class72.field1838) && class9.field293.method958((byte) -38) < 10) {
                            class9.field293 = class9.field293.method991(class72.field1838, 114);
                            class129.field3047 = true;
                        }
                        if (class36.field1026 == 84) {
                            if (class9.field293.method958((byte) -38) > 0) {
                                int var2 = 0;
                                if (class9.field293.method960((byte) -43)) {
                                    var2 = class9.field293.method953((byte) -32);
                                }
                                class14.field406.method727(178, -113);
                                class79.field1907++;
                                class14.field406.method325(-405801808, var2);
                            }
                            class129.field3047 = true;
                            class63.field1598 = 0;
                        }
                    } else if (class63.field1598 == 2) {
                        if (class36.field1026 == 85 && class9.field293.method958((byte) -38) > 0) {
                            class9.field293 = class9.field293.method970(true, class9.field293.method958((byte) -38) - 1, 0);
                            class129.field3047 = true;
                        }
                        if ((class15.method110(true, class72.field1838) || class72.field1838 == 32) && class9.field293.method958((byte) -38) < 12) {
                            class9.field293 = class9.field293.method991(class72.field1838, -46);
                            class129.field3047 = true;
                        }
                        if (class36.field1026 == 84) {
                            if (class9.field293.method958((byte) -38) > 0) {
                                class14.field406.method727(4, 96);
                                class45.field1210++;
                                class14.field406.method344(class9.field293.method988(-43), -1652311768);
                            }
                            class63.field1598 = 0;
                            class129.field3047 = true;
                        }
                    } else if (class63.field1598 == 3) {
                        if (class36.field1026 == 85 && class9.field293.method958((byte) -38) > 0) {
                            class9.field293 = class9.field293.method970(true, class9.field293.method958((byte) -38) - 1, 0);
                            class129.field3047 = true;
                        }
                        if (class106.method802(class72.field1838, -98) && class9.field293.method958((byte) -38) < 40) {
                            class9.field293 = class9.field293.method991(class72.field1838, -56);
                            class129.field3047 = true;
                        }
                    } else if (class22.field632 == -1 && field2768 == -1) {
                        if (class36.field1026 == 85 && class9.field299.method958((byte) -38) > 0) {
                            class9.field299 = class9.field299.method970(true, class9.field299.method958((byte) -38) - 1, 0);
                            class129.field3047 = true;
                        }
                        if (class106.method802(class72.field1838, -44) && class9.field299.method958((byte) -38) < 80) {
                            class9.field299 = class9.field299.method991(class72.field1838, 104);
                            class129.field3047 = true;
                        }
                        if (class36.field1026 == 84 && class9.field299.method958((byte) -38) > 0) {
                            if (class21.field605 == 2) {
                                if (class9.field299.method979(class116.field2864, 29738)) {
                                    class8.method64(-112);
                                }
                                if (class9.field299.method979(class64.field1618, 29738)) {
                                    class51.field1345 = true;
                                }
                                if (class9.field299.method979(class79.field1918, 29738)) {
                                    class51.field1345 = false;
                                }
                                if (class9.field299.method979(class64.field1617, 29738)) {
                                    for (int var3 = 0; var3 < 4; var3++) {
                                        for (int var4 = 1; var4 < 103; var4++) {
                                            for (int var5 = 1; var5 < 103; var5++) {
                                                class99.field2404[var3].field2964[var4][var5] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class9.field299.method979(class46.field1249, 29738) && class64.field1635 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class9.field299.method979(class113.field2784, 29738)) {
                                    class10.field325 = true;
                                }
                            }
                            if (class9.field299.method981(-11361, class4.field163)) {
                                class45.field1214++;
                                class14.field406.method727(150, 124);
                                class14.field406.method330(-1, class9.field299.method958((byte) -38) - 1);
                                class14.field406.method372(980803184, class9.field299.method977(2, true));
                            } else {
                                class111.field2717++;
                                byte var6 = 0;
                                class130 var7 = class9.field299.method974(123);
                                byte var8 = 0;
                                if (var7.method981(-11361, class6.field217)) {
                                    var8 = 0;
                                    class9.field299 = class9.field299.method977(class6.field217.method958((byte) -38), true);
                                } else if (var7.method981(-11361, class84.field1983)) {
                                    class9.field299 = class9.field299.method977(class84.field1983.method958((byte) -38), true);
                                    var8 = 1;
                                } else if (var7.method981(-11361, class130.field3145)) {
                                    class9.field299 = class9.field299.method977(class130.field3145.method958((byte) -38), true);
                                    var8 = 2;
                                } else if (var7.method981(-11361, class51.field1341)) {
                                    class9.field299 = class9.field299.method977(class51.field1341.method958((byte) -38), true);
                                    var8 = 3;
                                } else if (var7.method981(-11361, class24.field729)) {
                                    var8 = 4;
                                    class9.field299 = class9.field299.method977(class24.field729.method958((byte) -38), true);
                                } else if (var7.method981(-11361, class61.field1576)) {
                                    class9.field299 = class9.field299.method977(class61.field1576.method958((byte) -38), true);
                                    var8 = 5;
                                } else if (var7.method981(-11361, class18.field516)) {
                                    var8 = 6;
                                    class9.field299 = class9.field299.method977(class18.field516.method958((byte) -38), true);
                                } else if (var7.method981(-11361, class24.field702)) {
                                    class9.field299 = class9.field299.method977(class24.field702.method958((byte) -38), true);
                                    var8 = 7;
                                } else if (var7.method981(-11361, class33.field923)) {
                                    var8 = 8;
                                    class9.field299 = class9.field299.method977(class33.field923.method958((byte) -38), true);
                                } else if (var7.method981(-11361, class79.field1917)) {
                                    class9.field299 = class9.field299.method977(class79.field1917.method958((byte) -38), true);
                                    var8 = 9;
                                } else if (var7.method981(-11361, class24.field700)) {
                                    class9.field299 = class9.field299.method977(class24.field700.method958((byte) -38), true);
                                    var8 = 10;
                                } else if (var7.method981(-11361, class33.field905)) {
                                    var8 = 11;
                                    class9.field299 = class9.field299.method977(class33.field905.method958((byte) -38), true);
                                }
                                class130 var9 = class9.field299.method974(96);
                                if (var9.method981(-11361, class106.field2562)) {
                                    class9.field299 = class9.field299.method977(class106.field2562.method958((byte) -38), true);
                                    var6 = 1;
                                } else if (var9.method981(-11361, class111.field2740)) {
                                    var6 = 2;
                                    class9.field299 = class9.field299.method977(class111.field2740.method958((byte) -38), true);
                                } else if (var9.method981(-11361, class4.field153)) {
                                    var6 = 3;
                                    class9.field299 = class9.field299.method977(class4.field153.method958((byte) -38), true);
                                } else if (var9.method981(-11361, class88.field2144)) {
                                    var6 = 4;
                                    class9.field299 = class9.field299.method977(class88.field2144.method958((byte) -38), true);
                                } else if (var9.method981(-11361, class79.field1920)) {
                                    var6 = 5;
                                    class9.field299 = class9.field299.method977(class79.field1920.method958((byte) -38), true);
                                }
                                class14.field406.method727(13, -103);
                                class14.field406.method330(-1, 0);
                                int var10 = class14.field406.field1057;
                                class14.field406.method330(-1, var8);
                                class14.field406.method330(-1, var6);
                                class99.method735(88, class14.field406, class9.field299);
                                class14.field406.method359(class14.field406.field1057 - var10, 7);
                                if (class121.field2965 == 2) {
                                    class121.field2965 = 3;
                                    class106.field2576++;
                                    class96.field2316 = true;
                                    class14.field406.method727(0, 110);
                                    class14.field406.method330(-1, class121.field2965);
                                    class14.field406.method330(-1, class48.field1291);
                                    class14.field406.method330(-1, class101.field2420);
                                }
                            }
                            class129.field3047 = true;
                            class9.field299 = class9.field295;
                        }
                    }
                }
                return;
            } while (!class15.method110(true, class72.field1838) && class72.field1838 != 32);
            if (class9.field291.method958((byte) -38) < 12) {
                class9.field291 = class9.field291.method991(class72.field1838, -97);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lqd;B)V", line = 1116)
    public static final void method860(class100 arg0, byte arg1) {
        field2775++;
        short var2 = 256;
        for (int var3 = 0; var3 < class92.field2206.length; var3++) {
            class92.field2206[var3] = 0;
        }
        int var4 = 0;
        if (arg1 < 57) {
            return;
        }
        while (var4 < 5000) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class92.field2206[var16] = (int) (Math.random() * 256.0D);
            var4++;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class109.field2649[var15] = (class92.field2206[var15 - 1] + class92.field2206[var15 - 128] + class92.field2206[var15 + 128] + class92.field2206[var15 + 1]) / 4;
                }
            }
            int[] var13 = class92.field2206;
            class92.field2206 = class109.field2649;
            class109.field2649 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2409; var7++) {
            for (int var8 = 0; var8 < arg0.field2407; var8++) {
                if (arg0.field2412[var6++] != 0) {
                    int var9 = arg0.field2406 + var8 + 16;
                    int var10 = arg0.field2408 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class92.field2206[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V", line = 1247)
    public static final void method861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class4.field189) {
            arg5 = 0;
        }
        field2763++;
        if (class99.field2383 == arg0 && class26.field762 == arg1 && class111.field2726 == arg5) {
            return;
        }
        class26.field762 = arg1;
        class111.field2726 = arg5;
        class99.field2383 = arg0;
        class90.method669(19013, 25);
        class4.method30(null, false, (byte) 99, class45.field1228);
        int var6 = class42.field1172;
        int var7 = class129.field3045;
        class129.field3045 = arg0 * 8 - 48;
        int var8 = class129.field3045 - var7;
        int var9 = class129.field3045;
        class42.field1172 = (arg1 - 6) * 8;
        int var10 = class42.field1172 - var6;
        int var11 = class42.field1172;
        for (int var12 = 0; var12 < 32768; var12++) {
            class33 var29 = class26.field766[var12];
            if (var29 != null) {
                for (int var30 = 0; var30 < 10; var30++) {
                    var29.field2107[var30] -= var8;
                    var29.field2079[var30] -= var10;
                }
                var29.field2071 -= var8 * 128;
                var29.field2128 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class59 var27 = class105.field2550[var13];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field2107[var28] -= var8;
                    var27.field2079[var28] -= var10;
                }
                var27.field2071 -= var8 * 128;
                var27.field2128 -= var10 * 128;
            }
        }
        byte var14 = 0;
        int var15 = 82 / ((arg3 - 24) / 35);
        class71.field1818 = arg5;
        byte var16 = 104;
        byte var17 = 1;
        if (var8 < 0) {
            var16 = -1;
            var14 = 103;
            var17 = -1;
        }
        byte var18 = 0;
        class42.field1179.method653((byte) 35, arg2, false, arg4);
        byte var19 = 104;
        byte var20 = 1;
        if (var10 < 0) {
            var19 = -1;
            var18 = 103;
            var20 = -1;
        }
        for (int var21 = var14; var21 != var16; var21 += var17) {
            for (int var23 = var18; var23 != var19; var23 += var20) {
                int var24 = var10 + var23;
                int var25 = var21 + var8;
                for (int var26 = 0; var26 < 4; var26++) {
                    if (var25 >= 0 && var24 >= 0 && var25 < 104 && var24 < 104) {
                        class23.field674[var26][var21][var23] = class23.field674[var26][var25][var24];
                    } else {
                        class23.field674[var26][var21][var23] = null;
                    }
                }
            }
        }
        for (class64 var22 = (class64) class15.field419.method813(50); var22 != null; var22 = (class64) class15.field419.method814((byte) -19)) {
            var22.field1645 -= var8;
            var22.field1627 -= var10;
            if (var22.field1645 < 0 || var22.field1627 < 0 || var22.field1645 >= 104 || var22.field1627 >= 104) {
                var22.method714((byte) -94);
            }
        }
        class40.field1140 = false;
        if (class116.field2850 != 0) {
            class61.field1583 -= var10;
            class116.field2850 -= var8;
        }
        class115.field2845 = -1;
        class115.field2833 = 0;
        class41.field1155.method816((byte) 90);
        class51.field1343.method816((byte) 79);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lfe;I)V", line = 1428)
    public final void method862(class36 arg0, int arg1) {
        if (arg1 >= -71) {
            method860(null, (byte) -92);
        }
        field2752++;
        while (true) {
            int var3 = arg0.method365((byte) -124);
            if (var3 == 0) {
                return;
            }
            this.method856(arg0, var3, -72);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)Lr;", line = 1451)
    public final class102 method863(int arg0, byte arg1) {
        if (arg1 != -106) {
            this.field2754 = 67;
        }
        field2753++;
        class102 var3 = (class102) class58.field1451.method402((long) this.field2756, -128);
        if (var3 == null) {
            var3 = class102.method791(class68.field1764, this.field2772, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field2767[0] != 0) {
                    var3.method763(this.field2767[var4], this.field2760[var4]);
                }
            }
            var3.method772();
            var3.method783(this.field2771 + 64, 850 - -this.field2765, -30, -50, -30, true);
            class58.field1451.method403((long) this.field2756, var3, (byte) -101);
        }
        class102 var5;
        if (this.field2754 == -1 || arg0 == -1) {
            var5 = var3.method775(true);
        } else {
            var5 = class85.method641(this.field2754, arg1 ^ 0xFFFFFF9A).method397((byte) 36, arg0, var3);
        }
        if (this.field2770 != 128 || this.field2759 != 128) {
            var5.method765(this.field2770, this.field2759, this.field2770);
        }
        if (this.field2750 != 0) {
            if (this.field2750 == 90) {
                var5.method787();
            }
            if (this.field2750 == 180) {
                var5.method787();
                var5.method787();
            }
            if (this.field2750 == 270) {
                var5.method787();
                var5.method787();
                var5.method787();
            }
        }
        return var5;
    }
}
