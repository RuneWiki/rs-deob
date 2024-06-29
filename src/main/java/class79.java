import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class79 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field1860 = 0;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field1868 = 0;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static volatile int field1870 = 0;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field1873 = 0;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Lad;")
    public static class5 field1877 = class88.method674("Cabbage", 13);

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Lad;")
    private static class5 field1876 = class88.method674("Hide", -59);

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lad;")
    public static class5 field1867 = class88.method674(" x ", -58);

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Lad;")
    public static class5 field1875 = class88.method674("Schrifts-=tze geladen)3", 72);

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Lad;")
    public static class5 field1872 = field1876;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Loe;")
    public static class89 field1863;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 6)
    public static final void method611(int arg0) {
        class46.field1202.method101((byte) -103);
        class89.field2092.method101((byte) -128);
        class60.field1490.method101((byte) -87);
        if (arg0 != 205) {
            field1867 = null;
        }
        field1865++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 24)
    public static final String method612(int arg0, Throwable arg1) throws IOException {
        field1864++;
        String var3;
        if (arg1 instanceof class99) {
            class99 var2 = (class99) arg1;
            var3 = var2.field2392 + " | ";
            arg1 = var2.field2383;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    String var18 = var3 + "| " + var8;
                    int var19 = -32 / ((arg0 + 1) / 44);
                    return var18;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIILvd;)V", line = 95)
    public static final void method613(int arg0, int arg1, int arg2, int arg3, class130 arg4) {
        field1874++;
        class12.field359.method885(-126);
        class6.field229.method976(0, 0);
        arg4.method1000(class33.field798, 55, 28, 16777215, true);
        if (arg2 == 0) {
            arg4.method1000(class112.field2802, 55, 41, 65280, true);
        }
        if (arg2 == 1) {
            arg4.method1000(class46.field1209, 55, 41, 16776960, true);
        }
        if (arg2 == 2) {
            arg4.method1000(class99.field2401, 55, 41, 16711680, true);
        }
        if (arg2 == 3) {
            arg4.method1000(field1872, 55, 41, 65535, true);
        }
        arg4.method1000(class32.field771, 184, 28, 16777215, true);
        if (arg1 != -10205) {
            return;
        }
        if (arg0 == 0) {
            arg4.method1000(class112.field2802, 184, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg4.method1000(class46.field1209, 184, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg4.method1000(class99.field2401, 184, 41, 16711680, true);
        }
        arg4.method1000(class20.field537, 324, 28, 16777215, true);
        if (arg3 == 0) {
            arg4.method1000(class112.field2802, 324, 41, 65280, true);
        }
        if (arg3 == 1) {
            arg4.method1000(class46.field1209, 324, 41, 16776960, true);
        }
        if (arg3 == 2) {
            arg4.method1000(class99.field2401, 324, 41, 16711680, true);
        }
        arg4.method1005(class105.field2536, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        try {
            Graphics var5 = class9.field305.getGraphics();
            class12.field359.method253(453, var5, false, 0);
        } catch (Exception var6) {
            class9.field305.repaint();
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 157)
    public static void method614(byte arg0) {
        int var1 = -96 % ((arg0 - 84) / 36);
        field1867 = null;
        field1875 = null;
        field1876 = null;
        field1863 = null;
        field1877 = null;
        field1872 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjd;IIILqa;IIII)V", line = 175)
    public static final void method615(int arg0, class58 arg1, int arg2, int arg3, int arg4, class97 arg5, int arg6, int arg7, int arg8, int arg9) {
        field1871++;
        if (arg3 != 512) {
            method616((byte) 94, null, null);
        }
        int var10 = class42.field1062[arg6][arg2][arg4];
        int var11 = class42.field1062[arg6][arg2 + 1][arg4];
        int var12 = class42.field1062[arg6][arg2][arg4 + 1];
        int var13 = class42.field1062[arg6][arg2 + 1][arg4 + 1];
        int var14 = var10 + var13 + var11 + var12 >> 2;
        int var15 = (arg7 << 6) + arg9;
        class70 var16 = class42.method357(arg0, (byte) -42);
        int var17 = (arg0 << 14) + (arg4 << 7) + arg2 + 1073741824;
        if (var16.field1677 == 1) {
            var15 += 256;
        }
        if (var16.field1667 == 0) {
            var17 += Integer.MIN_VALUE;
        }
        if (arg9 == 22) {
            class103 var18;
            if (var16.field1691 == -1 && var16.field1655 == null) {
                var18 = var16.method549(var11, true, var10, var12, 22, var13, arg7);
            } else {
                var18 = new class134(arg0, 22, arg7, var10, var11, var13, var12, var16.field1691, true);
            }
            arg5.method763(arg8, arg2, arg4, var14, var18, var17, var15);
            if (var16.field1668 && var16.field1667 == 1) {
                arg1.method464(arg4, arg2, (byte) 77);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class103 var38;
            if (var16.field1691 == -1 && var16.field1655 == null) {
                var38 = var16.method549(var11, true, var10, var12, 10, var13, arg7);
            } else {
                var38 = new class134(arg0, 10, arg7, var10, var11, var13, var12, var16.field1691, true);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg7 == 1 || arg7 == 3) {
                    var40 = var16.field1693;
                    var39 = var16.field1705;
                } else {
                    var39 = var16.field1693;
                    var40 = var16.field1705;
                }
                int var41 = 0;
                if (arg9 == 11) {
                    var41 += 256;
                }
                arg5.method749(arg8, arg2, arg4, var14, var40, var39, var38, var41, var17, var15);
            }
            if (var16.field1668) {
                arg1.method478(var16.field1685, var16.field1693, (byte) -126, arg4, arg7, arg2, var16.field1705);
            }
        } else if (arg9 >= 12) {
            class103 var19;
            if (var16.field1691 == -1 && var16.field1655 == null) {
                var19 = var16.method549(var11, true, var10, var12, arg9, var13, arg7);
            } else {
                var19 = new class134(arg0, arg9, arg7, var10, var11, var13, var12, var16.field1691, true);
            }
            arg5.method749(arg8, arg2, arg4, var14, 1, 1, var19, 0, var17, var15);
            if (var16.field1668) {
                arg1.method478(var16.field1685, var16.field1693, (byte) -125, arg4, arg7, arg2, var16.field1705);
            }
        } else if (arg9 == 0) {
            class103 var20;
            if (var16.field1691 == -1 && var16.field1655 == null) {
                var20 = var16.method549(var11, true, var10, var12, 0, var13, arg7);
            } else {
                var20 = new class134(arg0, 0, arg7, var10, var11, var13, var12, var16.field1691, true);
            }
            arg5.method770(arg8, arg2, arg4, var14, var20, null, class30.field733[arg7], 0, var17, var15);
            if (var16.field1668) {
                arg1.method479(var16.field1685, arg7, arg4, arg2, arg9, (byte) 90);
            }
        } else if (arg9 == 1) {
            class103 var21;
            if (var16.field1691 == -1 && var16.field1655 == null) {
                var21 = var16.method549(var11, true, var10, var12, 1, var13, arg7);
            } else {
                var21 = new class134(arg0, 1, arg7, var10, var11, var13, var12, var16.field1691, true);
            }
            arg5.method770(arg8, arg2, arg4, var14, var21, null, class109.field2735[arg7], 0, var17, var15);
            if (var16.field1668) {
                arg1.method479(var16.field1685, arg7, arg4, arg2, arg9, (byte) 100);
            }
        } else if (arg9 == 2) {
            int var22 = arg7 + 1 & 0x3;
            class103 var23;
            class103 var24;
            if (var16.field1691 == -1 && var16.field1655 == null) {
                var23 = var16.method549(var11, true, var10, var12, 2, var13, arg7 + 4);
                var24 = var16.method549(var11, true, var10, var12, 2, var13, var22);
            } else {
                var23 = new class134(arg0, 2, arg7 + 4, var10, var11, var13, var12, var16.field1691, true);
                var24 = new class134(arg0, 2, var22, var10, var11, var13, var12, var16.field1691, true);
            }
            arg5.method770(arg8, arg2, arg4, var14, var23, var24, class30.field733[arg7], class30.field733[var22], var17, var15);
            if (var16.field1668) {
                arg1.method479(var16.field1685, arg7, arg4, arg2, arg9, (byte) 109);
            }
        } else if (arg9 == 3) {
            class103 var25;
            if (var16.field1691 == -1 && var16.field1655 == null) {
                var25 = var16.method549(var11, true, var10, var12, 3, var13, arg7);
            } else {
                var25 = new class134(arg0, 3, arg7, var10, var11, var13, var12, var16.field1691, true);
            }
            arg5.method770(arg8, arg2, arg4, var14, var25, null, class109.field2735[arg7], 0, var17, var15);
            if (var16.field1668) {
                arg1.method479(var16.field1685, arg7, arg4, arg2, arg9, (byte) -68);
            }
        } else if (arg9 == 9) {
            class103 var26;
            if (var16.field1691 == -1 && var16.field1655 == null) {
                var26 = var16.method549(var11, true, var10, var12, arg9, var13, arg7);
            } else {
                var26 = new class134(arg0, arg9, arg7, var10, var11, var13, var12, var16.field1691, true);
            }
            arg5.method749(arg8, arg2, arg4, var14, 1, 1, var26, 0, var17, var15);
            if (var16.field1668) {
                arg1.method478(var16.field1685, var16.field1693, (byte) -128, arg4, arg7, arg2, var16.field1705);
            }
        } else {
            if (var16.field1680) {
                if (arg7 == 1) {
                    int var27 = var12;
                    var12 = var13;
                    var13 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg7 == 2) {
                    int var28 = var12;
                    var12 = var11;
                    var11 = var28;
                    int var29 = var13;
                    var13 = var10;
                    var10 = var29;
                } else if (arg7 == 3) {
                    int var30 = var12;
                    var12 = var10;
                    var10 = var11;
                    var11 = var13;
                    var13 = var30;
                }
            }
            if (arg9 == 4) {
                class103 var31;
                if (var16.field1691 == -1 && var16.field1655 == null) {
                    var31 = var16.method549(var11, true, var10, var12, 4, var13, 0);
                } else {
                    var31 = new class134(arg0, 4, 0, var10, var11, var13, var12, var16.field1691, true);
                }
                arg5.method766(arg8, arg2, arg4, var14, var31, class30.field733[arg7], arg7 * 512, 0, 0, var17, var15);
            } else if (arg9 == 5) {
                int var32 = 16;
                int var33 = arg5.method776(arg8, arg2, arg4);
                if (var33 > 0) {
                    var32 = class42.method357(var33 >> 14 & 0x7FFF, (byte) -42).field1689;
                }
                class103 var34;
                if (var16.field1691 == -1 && var16.field1655 == null) {
                    var34 = var16.method549(var11, true, var10, var12, 4, var13, 0);
                } else {
                    var34 = new class134(arg0, 4, 0, var10, var11, var13, var12, var16.field1691, true);
                }
                arg5.method766(arg8, arg2, arg4, var14, var34, class30.field733[arg7], arg7 * 512, class60.field1487[arg7] * var32, class121.field3010[arg7] * var32, var17, var15);
            } else if (arg9 == 6) {
                class103 var35;
                if (var16.field1691 == -1 && var16.field1655 == null) {
                    var35 = var16.method549(var11, true, var10, var12, 4, var13, 0);
                } else {
                    var35 = new class134(arg0, 4, 0, var10, var11, var13, var12, var16.field1691, true);
                }
                arg5.method766(arg8, arg2, arg4, var14, var35, 256, arg7, 0, 0, var17, var15);
            } else if (arg9 == 7) {
                class103 var36;
                if (var16.field1691 == -1 && var16.field1655 == null) {
                    var36 = var16.method549(var11, true, var10, var12, 4, var13, 0);
                } else {
                    var36 = new class134(arg0, 4, 0, var10, var11, var13, var12, var16.field1691, true);
                }
                arg5.method766(arg8, arg2, arg4, var14, var36, 512, arg7, 0, 0, var17, var15);
            } else if (arg9 == 8) {
                class103 var37;
                if (var16.field1691 == -1 && var16.field1655 == null) {
                    var37 = var16.method549(var11, true, var10, var12, 4, var13, 0);
                } else {
                    var37 = new class134(arg0, 4, 0, var10, var11, var13, var12, var16.field1691, true);
                }
                arg5.method766(arg8, arg2, arg4, var14, var37, 768, arg7, 0, 0, var17, var15);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLgb;Lad;)I", line = 479)
    public static final int method616(byte arg0, class39 arg1, class5 arg2) {
        field1861++;
        int var3 = arg1.field957;
        arg1.method332(-19734, arg2.field183);
        arg1.field957 += class48.field1249.method280(arg2.field164, arg2.field183, 0, (byte) 47, arg1.field974, arg1.field957);
        if (arg0 >= -85) {
            field1877 = null;
        }
        return arg1.field957 - var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V", line = 500)
    public static final void method617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1869++;
        if (arg1 != -3944) {
            field1873 = -80;
        }
        int var7 = 2048 - arg6 & 0x7FF;
        int var8 = 2048 - arg5 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg2;
        if (var7 != 0) {
            int var12 = class45.field1176[var7];
            int var13 = class45.field1166[var7];
            int var14 = var10 * var13 - arg2 * var12 >> 16;
            var11 = var10 * var12 + arg2 * var13 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class45.field1176[var8];
            int var16 = class45.field1166[var8];
            int var17 = var9 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class70.field1686 = arg3 - var10;
        class9.field308 = arg0 - var11;
        class135.field3255 = arg4 - var9;
        class128.field3079 = arg6;
        class52.field1318 = arg5;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 569)
    public static final void method618(int arg0) {
        field1862++;
        if (class13.field383 != 0) {
            return;
        }
        class121.field3008[arg0] = class99.field2389;
        class22.field562[0] = 1002;
        class4.field145 = 1;
        if (class69.field1626 != -1) {
            class78.field1843 = -1;
            class103.field2518 = -1;
            class54.method441(0, 0, (byte) -125, class22.field564, class69.field1626, 0, class91.field2131, 765, 503, 0);
            class13.field379 = class78.field1843;
            class104.field2527 = class103.field2518;
            return;
        }
        class50.method432(-3582);
        class78.field1843 = -1;
        boolean var1 = false;
        class103.field2518 = -1;
        if (class22.field564 > 4 && class91.field2131 > 4 && class22.field564 < 516 && class91.field2131 < 338) {
            if (class53.field1334 == -1) {
                class20.method160(arg0 ^ 0x7A);
            } else {
                class54.method441(4, 0, (byte) -125, class22.field564, class53.field1334, 0, class91.field2131, 516, 338, 4);
            }
        }
        class104.field2527 = class103.field2518;
        class103.field2518 = -1;
        class13.field379 = class78.field1843;
        class78.field1843 = -1;
        if (class22.field564 > 553 && class91.field2131 > 205 && class22.field564 < 743 && class91.field2131 < 466) {
            if (class10.field333 != -1) {
                class54.method441(553, 0, (byte) -112, class22.field564, class10.field333, 1, class91.field2131, 743, 466, 205);
            } else if (class14.field408[class81.field1913] != -1) {
                class54.method441(553, 0, (byte) -127, class22.field564, class14.field408[class81.field1913], 1, class91.field2131, 743, 466, 205);
            }
        }
        if (class63.field1523 != class103.field2518) {
            class63.field1523 = class103.field2518;
            class43.field1086 = true;
        }
        class103.field2518 = -1;
        if (class78.field1843 != class129.field3130) {
            class43.field1086 = true;
            class129.field3130 = class78.field1843;
        }
        class78.field1843 = -1;
        if (class22.field564 > 17 && class91.field2131 > 357 && class22.field564 < 496 && class91.field2131 < 453) {
            if (class6.field225 != -1) {
                class54.method441(17, 0, (byte) -116, class22.field564, class6.field225, 2, class91.field2131, 496, 453, 357);
            } else if (class90.field2124 != -1) {
                class54.method441(17, 0, (byte) -114, class22.field564, class90.field2124, 3, class91.field2131, 496, 453, 357);
            } else if (class91.field2131 < 434 && class22.field564 < 426) {
                class73.method581(class22.field564 - 17, (byte) -119, class91.field2131 - 357);
            }
        }
        if ((class6.field225 != -1 || class90.field2124 != -1) && class132.field3201 != class103.field2518) {
            class99.field2384 = true;
            class132.field3201 = class103.field2518;
        }
        if ((class6.field225 != -1 || class90.field2124 != -1) && class78.field1843 != class128.field3073) {
            class99.field2384 = true;
            class128.field3073 = class78.field1843;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class4.field145 - 1; var2++) {
                if (class22.field562[var2] < 1000 && class22.field562[var2 + 1] > 1000) {
                    var1 = false;
                    class5 var3 = class121.field3008[var2];
                    class121.field3008[var2] = class121.field3008[var2 + 1];
                    class121.field3008[var2 + 1] = var3;
                    int var4 = class22.field562[var2];
                    class22.field562[var2] = class22.field562[var2 + 1];
                    class22.field562[var2 + 1] = var4;
                    int var5 = class73.field1749[var2];
                    class73.field1749[var2] = class73.field1749[var2 + 1];
                    class73.field1749[var2 + 1] = var5;
                    int var6 = class129.field3128[var2];
                    class129.field3128[var2] = class129.field3128[var2 + 1];
                    class129.field3128[var2 + 1] = var6;
                    int var7 = class58.field1420[var2];
                    class58.field1420[var2] = class58.field1420[var2 + 1];
                    class58.field1420[var2 + 1] = var7;
                }
            }
        }
    }
}
