import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class174 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Lvl;")
    private static class164 field2771 = new class164(16);

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field2778 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field2781 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Lmg;")
    public static class116 field2782 = new class116();

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "F")
    public static float field2774;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "F")
    public static float field2779;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lnc;")
    public static class104 field2777;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Luf;")
    public static class241 field2775;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lth;")
    public static class57 field2770;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "[I")
    public static int[] field2787;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "[[[B")
    public static byte[][][] field2784;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "[[[B")
    public static byte[][][] field2791;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "[[[B")
    public static byte[][][] field2792;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "[[[B")
    public static byte[][][] field2795;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "[[[B")
    public static byte[][][] field2798;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "[[[I")
    public static int[][][] field2786;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "[[[I")
    public static int[][][] field2789;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lqm;)V", line = 4)
    public static final void method1358(class227 arg0) {
        label83: while (true) {
            if (arg0.field3760 < arg0.field3793.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method1720((byte) -21) == 1) {
                    var1 = true;
                    var2 = arg0.method1720((byte) -107);
                    var3 = arg0.method1720((byte) -100);
                }
                int var4 = arg0.method1720((byte) -93);
                int var5 = arg0.method1720((byte) -94);
                int var6 = var4 * 64 - field2772;
                int var7 = field2780 - (var5 * 64 - field2773) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field2776 && var7 < field2780) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method1733(0);
                                if (var12 != 0) {
                                    if (field2798[var8][var9] == null) {
                                        field2798[var8][var9] = new byte[4096];
                                    }
                                    field2798[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method1733(0);
                                    if (field2791[var8][var9] == null) {
                                        field2791[var8][var9] = new byte[4096];
                                    }
                                    field2791[var8][var9][(63 - var11 << 6) + var10] = var13;
                                }
                            }
                        }
                        var10++;
                    }
                }
                int var14 = 0;
                while (true) {
                    if (var14 >= (var1 ? 64 : 4096)) {
                        continue label83;
                    }
                    byte var15 = arg0.method1733(0);
                    if (var15 != 0) {
                        arg0.field3760++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "()V", line = 89)
    public static void method1359() {
        field2770 = null;
        field2771 = null;
        field2777 = null;
        field2775 = null;
        field2782 = null;
        field2786 = (int[][][]) null;
        field2798 = (byte[][][]) null;
        field2791 = (byte[][][]) null;
        field2792 = (byte[][][]) null;
        field2784 = (byte[][][]) null;
        field2795 = (byte[][][]) null;
        field2789 = (int[][][]) null;
        field2787 = null;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Lqm;)V", line = 105)
    public static final void method1360(class227 arg0) {
        label83: while (true) {
            if (arg0.field3760 < arg0.field3793.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method1720((byte) -90) == 1) {
                    var1 = true;
                    var2 = arg0.method1720((byte) -8);
                    var3 = arg0.method1720((byte) -127);
                }
                int var4 = arg0.method1720((byte) -79);
                int var5 = arg0.method1720((byte) -107);
                int var6 = var4 * 64 - field2772;
                int var7 = field2780 - (var5 * 64 - field2773) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field2776 && var7 < field2780) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method1733(0);
                                if (var12 != 0) {
                                    if (field2792[var8][var9] == null) {
                                        field2792[var8][var9] = new byte[4096];
                                    }
                                    field2792[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method1733(0);
                                    if (field2784[var8][var9] == null) {
                                        field2784[var8][var9] = new byte[4096];
                                    }
                                    field2784[var8][var9][(63 - var11 << 6) + var10] = var13;
                                }
                            }
                        }
                        var10++;
                    }
                }
                int var14 = 0;
                while (true) {
                    if (var14 >= (var1 ? 64 : 4096)) {
                        continue label83;
                    }
                    byte var15 = arg0.method1733(0);
                    if (var15 != 0) {
                        arg0.field3760++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Lnc;", line = 194)
    public static final class104 method1361(int arg0) {
        return (class104) field2771.method1268(122, (long) arg0);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V", line = 200)
    public static final void method1362(int arg0, int arg1) {
        for (int var2 = 0; var2 < class127.field2153; var2++) {
            class31 var3 = class124.method974(-79, var2);
            if (var3 != null) {
                int var4 = var3.field444;
                if (var4 >= 0 && !class153.field2439.method764(var4, (byte) 65)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field439 >= 0) {
                    int var5 = var3.field439;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class153.field2444[class168.method1309(96, var7, 126)];
                } else if (var4 >= 0) {
                    var8 = class153.field2444[class168.method1309(96, class153.field2439.method770(var4, 103), 125)];
                } else if (var3.field440 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field440;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class153.field2444[class168.method1309(96, var11, 121)];
                }
                field2787[var2 + 1] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V", line = 265)
    private static final void method1363(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field2788 - field2783;
        int var5 = field2790 - field2796;
        if (field2788 < field2776) {
            var4++;
        }
        if (field2790 < field2780) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = arg0 * var6 + arg2 >> 16;
            int var8 = (var6 + 1) * arg0 + arg2 >> 16;
            int var9 = var8 - var7;
            if (var9 > 0) {
                int var10 = field2783 + var6 >> 6;
                if (var10 >= 0 && var10 <= field2786.length - 1) {
                    int[][] var11 = field2786[var10];
                    byte[][] var12 = field2798[var10];
                    byte[][] var13 = field2791[var10];
                    byte[][] var14 = field2792[var10];
                    byte[][] var15 = field2784[var10];
                    byte[][] var16 = field2795[var10];
                    int var17 = field2785 + var7;
                    int var18 = field2785 + var8;
                    for (int var19 = 0; var19 < var5; var19++) {
                        int var20 = arg1 * var19 + arg3 >> 16;
                        int var21 = (var19 + 1) * arg1 + arg3 >> 16;
                        int var22 = var21 - var20;
                        if (var22 > 0) {
                            int var23 = field2794 + var20;
                            int var24 = field2794 + var21;
                            int var25 = field2796 + var19 >> 6;
                            int var26 = field2796 + var19 & 0x3F;
                            int var27 = field2783 + var6 & 0x3F;
                            int var28 = (var26 << 6) + var27;
                            int var29;
                            if (var25 < 0 || var25 > var11.length - 1 || var11[var25] == null) {
                                if (field2777.field1687 != -1) {
                                    var29 = field2777.field1687;
                                } else if ((field2796 + var19 & 0x4) == (field2783 + var6 & 0x4)) {
                                    var29 = field2787[class43.field658 + 1];
                                } else {
                                    var29 = 4936552;
                                }
                                if (var25 < 0 || var25 > var11.length - 1) {
                                    if (var29 == 0) {
                                        var29 = 1;
                                    }
                                    class246.method1885(var17, var23, var9, var22, var29);
                                    continue;
                                }
                            } else {
                                var29 = var11[var25][var28];
                            }
                            if (var29 == 0) {
                                var29 = 1;
                            }
                            int var30 = var12[var25] == null ? 0 : field2787[var12[var25][var28] & 0xFF];
                            int var31 = var14[var25] == null ? 0 : field2787[var14[var25][var28] & 0xFF];
                            if (var30 == 0 && var31 == 0) {
                                class246.method1885(var17, var23, var9, var22, var29);
                            } else {
                                if (var30 != 0) {
                                    if (var30 == -1) {
                                        var30 = 1;
                                    }
                                    byte var32 = var13[var25] == null ? 0 : var13[var25][var28];
                                    int var33 = var32 & 0xFC;
                                    if (var33 == 0 || var9 <= 1 || var22 <= 1) {
                                        class246.method1885(var17, var23, var9, var22, var30);
                                    } else {
                                        method1369(class246.field4036, var17, var23, var29, var30, var9, var22, var33 >> 2, var32 & 0x3, true);
                                    }
                                }
                                if (var31 != 0) {
                                    if (var31 == -1) {
                                        var31 = var29;
                                    }
                                    byte var34 = var15[var25][var28];
                                    int var35 = var34 & 0xFC;
                                    if (var35 == 0 || var9 <= 1 || var22 <= 1) {
                                        class246.method1885(var17, var23, var9, var22, var31);
                                    }
                                    method1369(class246.field4036, var17, var23, 0, var31, var9, var22, var35 >> 2, var34 & 0x3, var30 == 0);
                                }
                            }
                            if (var16[var25] != null) {
                                int var36 = var16[var25][var28] & 0xFF;
                                if (var36 != 0) {
                                    int var37;
                                    if (var9 == 1) {
                                        var37 = var17;
                                    } else {
                                        var37 = var18 - 1;
                                    }
                                    int var38;
                                    if (var22 == 1) {
                                        var38 = var23;
                                    } else {
                                        var38 = var24 - 1;
                                    }
                                    int var39 = 13421772;
                                    if (var36 >= 5 && var36 <= 8 || var36 >= 13 && var36 <= 16 || var36 >= 21 && var36 <= 24 || var36 == 27 || var36 == 28) {
                                        var39 = 13369344;
                                        var36 -= 4;
                                    }
                                    if (var36 == 1) {
                                        class246.method1901(var17, var23, var22, var39);
                                    } else if (var36 == 2) {
                                        class246.method1891(var17, var23, var9, var39);
                                    } else if (var36 == 3) {
                                        class246.method1901(var37, var23, var22, var39);
                                    } else if (var36 == 4) {
                                        class246.method1891(var17, var38, var9, var39);
                                    } else if (var36 == 9) {
                                        class246.method1901(var17, var23, var22, 16777215);
                                        class246.method1891(var17, var23, var9, var39);
                                    } else if (var36 == 10) {
                                        class246.method1901(var37, var23, var22, 16777215);
                                        class246.method1891(var17, var23, var9, var39);
                                    } else if (var36 == 11) {
                                        class246.method1901(var37, var23, var22, 16777215);
                                        class246.method1891(var17, var38, var9, var39);
                                    } else if (var36 == 12) {
                                        class246.method1901(var17, var23, var22, 16777215);
                                        class246.method1891(var17, var38, var9, var39);
                                    } else if (var36 == 17) {
                                        class246.method1891(var17, var23, 1, var39);
                                    } else if (var36 == 18) {
                                        class246.method1891(var37, var23, 1, var39);
                                    } else if (var36 == 19) {
                                        class246.method1891(var37, var38, 1, var39);
                                    } else if (var36 == 20) {
                                        class246.method1891(var17, var38, 1, var39);
                                    } else if (var36 == 25) {
                                        for (int var40 = 0; var40 < var22; var40++) {
                                            class246.method1891(var17 + var40, var38 - var40, 1, var39);
                                        }
                                    } else if (var36 == 26) {
                                        for (int var41 = 0; var41 < var22; var41++) {
                                            class246.method1891(var17 + var41, var23 + var41, 1, var39);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var42 = field2785 + var7;
                    var10000 = field2785 + var8;
                    for (int var44 = 0; var44 < var5; var44++) {
                        int var45 = (arg1 * var44 + arg3 >> 16) + field2794;
                        int var46 = ((var44 + 1) * arg1 + arg3 >> 16) + field2794;
                        int var47 = var46 - var45;
                        int var48;
                        if (field2777.field1687 != -1) {
                            var48 = field2777.field1687;
                        } else if ((field2796 + var44 & 0x4) == (field2783 + var6 & 0x4)) {
                            var48 = field2787[class43.field658 + 1];
                        } else {
                            var48 = 4936552;
                        }
                        if (var48 == 0) {
                            var48 = 1;
                        }
                        class246.method1885(var42, var45, var9, var47, var48);
                    }
                }
            }
        }
        for (int var49 = -2; var49 < var4 + 2; var49++) {
            int var50 = arg0 * var49 + arg2 >> 16;
            int var51 = (var49 + 1) * arg0 + arg2 >> 16;
            int var52 = var51 - var50;
            if (var52 > 0) {
                int var53 = field2785 + var50;
                var10000 = field2785 + var51;
                int var55 = field2783 + var49 >> 6;
                if (var55 >= 0 && var55 <= field2789.length - 1) {
                    int[][] var56 = field2789[var55];
                    for (int var57 = -2; var57 < var5 + 2; var57++) {
                        int var58 = arg1 * var57 + arg3 >> 16;
                        int var59 = (var57 + 1) * arg1 + arg3 >> 16;
                        int var60 = var59 - var58;
                        if (var60 > 0) {
                            int var61 = field2794 + var58;
                            var10000 = field2794 + var59;
                            int var63 = field2796 + var57 >> 6;
                            if (var63 >= 0 && var63 <= var56.length - 1) {
                                int var64 = ((field2796 + var57 & 0x3F) << 6) + (field2783 + var49 & 0x3F);
                                if (var56[var63] != null) {
                                    int var65 = var56[var63][var64];
                                    int var66 = var65 & 0x1FFF;
                                    if (var66 != 0) {
                                        class261 var67 = class86.method691(-128, var66 - 1);
                                        int var68 = var65 >> 13 & 0x3;
                                        boolean var69 = (var65 >> 15 & 0x1) == 1;
                                        class341 var70 = var67.method1989(var68, (byte) -9, var69);
                                        if (var70 != null) {
                                            int var71 = var70.field4652 * var52 / 4;
                                            int var72 = var70.field4649 * var60 / 4;
                                            if (var67.field4404) {
                                                int var73 = var65 >> 16 & 0xF;
                                                int var74 = var65 >> 20 & 0xF;
                                                if ((var68 & 0x1) == 1) {
                                                    int var75 = var73;
                                                    var73 = var74;
                                                    var74 = var75;
                                                }
                                                var71 = var52 * var73;
                                                var72 = var60 * var74;
                                            }
                                            if (var71 != 0 && var72 != 0) {
                                                if (var67.field4390 == 0) {
                                                    var70.method2404(var53, var61 + var60 - var72, var71, var72);
                                                } else {
                                                    var70.method2401(var53, var61 + var60 - var72, var71, var72, var67.field4390);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljn;IIII)V", line = 662)
    private static final void method1364(class59 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field1014 = ((arg0.field1015 - field2783) * arg1 + arg3 >> 16) + field2785;
        arg0.field1017 = ((arg0.field1008 - field2796) * arg2 + arg4 >> 16) + field2794;
        class213 var5 = class169.method1315(arg0.field1011, 63);
        if (var5.field3413 != -1) {
            class285 var6 = var5.method1605(-23, false, true);
            if (var6 != null) {
                if (arg0.field1014 - (var6.field4652 + 1 >> 1) <= field2793 && (var6.field4652 + 1 >> 1) + arg0.field1014 >= field2785 && arg0.field1017 - (var6.field4649 + 1 >> 1) <= field2797 && (var6.field4649 + 1 >> 1) + arg0.field1017 >= field2794) {
                    arg0.field1013 = false;
                } else {
                    arg0.field1013 = true;
                }
                return;
            }
        }
        if (arg0.field1015 >= field2783 && arg0.field1015 <= field2788 && arg0.field1008 >= field2796 && arg0.field1008 <= field2790) {
            arg0.field1013 = false;
        } else {
            arg0.field1013 = true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIII)V", line = 689)
    public static final void method1365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2783 = arg0;
        field2796 = arg1;
        field2788 = arg2;
        field2790 = arg3;
        field2785 = arg4;
        field2794 = arg5;
        field2793 = arg6;
        field2797 = arg7;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "()Lci;", line = 700)
    public static final class327 method1366() {
        int var0 = field2788 - field2783;
        int var1 = field2790 - field2796;
        int var2 = (field2793 - field2785 << 16) / var0;
        int var3 = (field2797 - field2794 << 16) / var1;
        return method1374(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lth;)V", line = 710)
    public static final void method1367(class57 arg0) {
        field2770 = arg0;
        field2771.method1266(0);
        int var1 = field2770.method483(-1, "details");
        int[] var2 = field2770.method458(var1, 90);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field2771.method1273(1, (long) var2[var3], class113.method855(4, var2[var3], new class227(field2770.method472(var2[var3], 117, var1))));
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 727)
    public static final void method1368(int arg0) {
        field2777 = (class104) field2771.method1268(119, (long) arg0);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([IIIIIIIIIZ)V", line = 731)
    private static final void method1369(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class246.field4031) {
            return;
        }
        if (arg1 < class246.field4032) {
            var10 = class246.field4032;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class246.field4032) {
            return;
        }
        if (var11 > class246.field4031) {
            var11 = class246.field4031;
        }
        int var12 = arg2;
        if (arg2 >= class246.field4039) {
            return;
        }
        if (arg2 < class246.field4038) {
            var12 = class246.field4038;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class246.field4038) {
            return;
        }
        if (var13 > class246.field4039) {
            var13 = class246.field4039;
        }
        int var14 = class246.field4035 * var12 + var10;
        int var15 = class246.field4035 + var10 - var11;
        int var16 = var10 - arg1;
        int var17 = var11 - arg1;
        int var18 = var12 - arg2;
        int var19 = var13 - arg2;
        int var20 = arg5 - var17;
        int var21 = arg5 - var16;
        int var22 = arg6 - var19;
        int var23 = arg6 - var18;
        if (arg7 == 9) {
            arg7 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg7 = 1;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg7 == 1) {
            if (arg8 == 0) {
                for (int var24 = var18; var24 < var19; var24++) {
                    for (int var25 = var16; var25 < var17; var25++) {
                        if (var25 <= var24) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var26 = var23 - 1; var26 >= var22; var26--) {
                    for (int var27 = var16; var27 < var17; var27++) {
                        if (var27 <= var26) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var28 = var18; var28 < var19; var28++) {
                    for (int var29 = var16; var29 < var17; var29++) {
                        if (var29 >= var28) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var30 = var23 - 1; var30 >= var22; var30--) {
                    for (int var31 = var16; var31 < var17; var31++) {
                        if (var31 >= var30) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 2) {
            if (arg8 == 0) {
                for (int var32 = var23 - 1; var32 >= var22; var32--) {
                    for (int var33 = var16; var33 < var17; var33++) {
                        if (var33 <= var32 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var34 = var18; var34 < var19; var34++) {
                    for (int var35 = var16; var35 < var17; var35++) {
                        if (var14 >= 0 && var14 < arg0.length) {
                            if (var35 >= var34 << 1) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        } else {
                            var14++;
                        }
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var36 = var18; var36 < var19; var36++) {
                    for (int var37 = var21 - 1; var37 >= var20; var37--) {
                        if (var37 <= var36 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var38 = var23 - 1; var38 >= var22; var38--) {
                    for (int var39 = var21 - 1; var39 >= var20; var39--) {
                        if (var39 >= var38 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 3) {
            if (arg8 == 0) {
                for (int var40 = var23 - 1; var40 >= var22; var40--) {
                    for (int var41 = var21 - 1; var41 >= var20; var41--) {
                        if (var41 <= var40 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var42 = var23 - 1; var42 >= var22; var42--) {
                    for (int var43 = var16; var43 < var17; var43++) {
                        if (var43 >= var42 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var44 = var18; var44 < var19; var44++) {
                    for (int var45 = var16; var45 < var17; var45++) {
                        if (var45 <= var44 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var46 = var18; var46 < var19; var46++) {
                    for (int var47 = var21 - 1; var47 >= var20; var47--) {
                        if (var47 >= var46 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 4) {
            if (arg8 == 0) {
                for (int var48 = var23 - 1; var48 >= var22; var48--) {
                    for (int var49 = var16; var49 < var17; var49++) {
                        if (var49 >= var48 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var50 = var18; var50 < var19; var50++) {
                    for (int var51 = var16; var51 < var17; var51++) {
                        if (var51 <= var50 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var52 = var18; var52 < var19; var52++) {
                    for (int var53 = var21 - 1; var53 >= var20; var53--) {
                        if (var53 >= var52 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var54 = var23 - 1; var54 >= var22; var54--) {
                    for (int var55 = var21 - 1; var55 >= var20; var55--) {
                        if (var55 <= var54 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg8 == 0) {
                    for (int var64 = var18; var64 < var19; var64++) {
                        for (int var65 = var16; var65 < var17; var65++) {
                            if (var65 <= arg5 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var66 = var18; var66 < var19; var66++) {
                        for (int var67 = var16; var67 < var17; var67++) {
                            if (var66 <= arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var68 = var18; var68 < var19; var68++) {
                        for (int var69 = var16; var69 < var17; var69++) {
                            if (var69 >= arg5 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var70 = var18; var70 < var19; var70++) {
                        for (int var71 = var16; var71 < var17; var71++) {
                            if (var70 >= arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg8 == 0) {
                    for (int var72 = var18; var72 < var19; var72++) {
                        for (int var73 = var16; var73 < var17; var73++) {
                            if (var73 <= var72 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var74 = var23 - 1; var74 >= var22; var74--) {
                        for (int var75 = var16; var75 < var17; var75++) {
                            if (var75 <= var74 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var76 = var23 - 1; var76 >= var22; var76--) {
                        for (int var77 = var21 - 1; var77 >= var20; var77--) {
                            if (var77 <= var76 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var78 = var18; var78 < var19; var78++) {
                        for (int var79 = var21 - 1; var79 >= var20; var79--) {
                            if (var79 <= var78 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg8 == 0) {
                    for (int var80 = var18; var80 < var19; var80++) {
                        for (int var81 = var16; var81 < var17; var81++) {
                            if (var81 >= var80 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var82 = var23 - 1; var82 >= var22; var82--) {
                        for (int var83 = var16; var83 < var17; var83++) {
                            if (var83 >= var82 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var84 = var23 - 1; var84 >= var22; var84--) {
                        for (int var85 = var21 - 1; var85 >= var20; var85--) {
                            if (var85 >= var84 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var86 = var18; var86 < var19; var86++) {
                        for (int var87 = var21 - 1; var87 >= var20; var87--) {
                            if (var87 >= var86 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var56 = var23 - 1; var56 >= var22; var56--) {
                for (int var57 = var21 - 1; var57 >= var20; var57--) {
                    if (var57 >= var56 >> 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 1) {
            for (int var58 = var23 - 1; var58 >= var22; var58--) {
                for (int var59 = var16; var59 < var17; var59++) {
                    if (var59 <= var58 << 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 2) {
            for (int var60 = var18; var60 < var19; var60++) {
                for (int var61 = var16; var61 < var17; var61++) {
                    if (var61 >= var60 >> 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 3) {
            for (int var62 = var18; var62 < var19; var62++) {
                for (int var63 = var21 - 1; var63 >= var20; var63--) {
                    if (var63 <= var62 << 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "()V", line = 1868)
    public static final void method1370() {
        for (int var0 = 0; var0 < field2775.field3980; var0++) {
            if (field2775.field3981[var0] != null) {
                field2782.method911(500, field2775.field3981[var0]);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)Lnc;", line = 1883)
    public static final class104 method1371(int arg0, int arg1) {
        for (class104 var2 = (class104) field2771.method1265(127); var2 != null; var2 = (class104) field2771.method1277((byte) -126)) {
            if (var2.field1693 && var2.method804((byte) -8, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)Lmg;", line = 1896)
    public static final class116 method1372(int arg0, int arg1) {
        class116 var2 = new class116();
        for (class104 var3 = (class104) field2771.method1265(65); var3 != null; var3 = (class104) field2771.method1277((byte) -111)) {
            if (var3.field1693 && var3.method804((byte) -8, arg1, arg0)) {
                var2.method911(500, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "()V", line = 1913)
    public static final void method1373() {
        int var0 = field2788 - field2783;
        int var1 = field2790 - field2796;
        int var2 = (field2793 - field2785 << 16) / var0;
        int var3 = (field2797 - field2794 << 16) / var1;
        method1363(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIII)Lci;", line = 1925)
    private static final class327 method1374(int arg0, int arg1, int arg2, int arg3) {
        class327 var4 = new class327();
        for (class59 var5 = (class59) field2782.method912(false); var5 != null; var5 = (class59) field2782.method909(-125)) {
            method1364(var5, arg0, arg1, arg2, arg3);
            var4.method2302((byte) -35, var5);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field2775.field3980; var7++) {
            class59 var8 = field2775.field3981[var7];
            boolean var9 = field2777.method801(field2775.field3977[var7] & 0x3FFF, 0, var6, field2775.field3977[var7] >> 14 & 0x3FFF, field2775.field3977[var7] >> 28 & 0x3);
            if (var9) {
                var8.field1015 = var6[1] - field2772;
                var8.field1008 = field2780 - (var6[2] - field2773) - 1;
                method1364(var8, arg0, arg1, arg2, arg3);
                var4.method2302((byte) -39, var8);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lqm;Z)V", line = 1966)
    public static final void method1375(class227 arg0, boolean arg1) {
        label125: while (true) {
            if (arg0.field3760 < arg0.field3793.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1720((byte) -44) == 1) {
                    var2 = true;
                    var3 = arg0.method1720((byte) -20);
                    var4 = arg0.method1720((byte) -98);
                }
                int var5 = arg0.method1720((byte) -97);
                int var6 = arg0.method1720((byte) -55);
                int var7 = var5 * 64 - field2772;
                int var8 = field2780 - (var6 * 64 - field2773) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field2776 && var8 < field2780) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 64) {
                            continue label125;
                        }
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method1720((byte) -128);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method1720((byte) -123);
                                        if (field2795[var9][var10] == null) {
                                            field2795[var9][var10] = new byte[4096];
                                        }
                                        field2795[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method1736(255);
                                        if (field2789[var9][var10] == null) {
                                            field2789[var9][var10] = new int[4096];
                                        }
                                        field2789[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method1765(true);
                                        int var17 = arg0.method1720((byte) -91);
                                        int var22 = var16 - 1;
                                        class29 var18 = class166.method1292(0, var22);
                                        if (var18.field418 != null) {
                                            var18 = var18.method177(5000);
                                            if (var18 == null || var18.field388 == -1) {
                                                continue;
                                            }
                                        }
                                        if ((!var18.field364 || arg1) && var18.field388 != -1) {
                                            class59 var19 = new class59();
                                            var19.field1011 = var18.field388;
                                            var19.field1012 = var17;
                                            var19.field1015 = var9 * 64 + var11;
                                            var19.field1008 = var10 * 64 + (64 - var12);
                                            field2782.method911(500, var19);
                                        }
                                    }
                                }
                            }
                        }
                        var11++;
                    }
                }
                int var20 = 0;
                while (true) {
                    if (var20 >= (var2 ? 64 : 4096)) {
                        continue label125;
                    }
                    int var21 = arg0.method1720((byte) -37);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field3760++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field3760 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field3760 += 3;
                        }
                    }
                    var20++;
                }
            }
            return;
        }
    }
}
