import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class120 {

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lwb;")
    public static class130 field2926 = class26.method212("scrollen:", -32376);

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lbc;")
    public static class10 field2927 = new class10(32);

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Lge;")
    public static class41 field2930 = new class41(64);

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lwb;")
    public static class130 field2931 = class26.method212("Unerwartete Antwort vom Anmelde)2Server", -32376);

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lwb;")
    private static class130 field2936 = class26.method212("Please try using a different world)3", -32376);

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Lwb;")
    public static class130 field2946 = class26.method212("Update)2Liste geladen)3", -32376);

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Lwb;")
    public static class130 field2932 = class26.method212("auf der Hautpseite)3", -32376);

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "[I")
    public static int[] field2945 = new int[1000];

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "Lwb;")
    private static class130 field2950 = class26.method212("Hidden", -32376);

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lwb;")
    public static class130 field2940 = field2950;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "Lwb;")
    private static class130 field2947 = class26.method212("Loaded sprites", -32376);

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Lwb;")
    public static class130 field2941 = class26.method212("@yel@*V", -32376);

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lwb;")
    public static class130 field2935 = field2936;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "Lwb;")
    public static class130 field2949 = class26.method212("Ihr Charakter)2Profil wird in:", -32376);

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Lwb;")
    public static class130 field2948 = field2936;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Lwb;")
    public static class130 field2942 = field2936;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Lwb;")
    public static class130 field2939 = field2936;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "Lwb;")
    private static class130 field2951 = class26.method212(" is already on your ignore list", -32376);

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Lwb;")
    public static class130 field2937 = field2951;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "Lwb;")
    public static class130 field2954 = field2936;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "Lwb;")
    public static class130 field2953 = field2936;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "Lwb;")
    public static class130 field2952 = field2947;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "J")
    public static long field2934;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "Z")
    public static boolean field2944;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "[Lec;")
    public static class28[] field2938;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZILod;)V", line = 7)
    public static final void method916(boolean arg0, int arg1, class88 arg2) {
        if (!arg0) {
            field2935 = null;
        }
        field2928++;
        class21.method192(arg2.field2071, arg2.field2128, -1, arg1);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 42)
    public static final String method917(Throwable arg0, byte arg1) throws IOException {
        field2923++;
        String var2;
        if (arg0 instanceof class27) {
            class27 var3 = (class27) arg0;
            arg0 = var3.field781;
            var2 = var3.field783 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    if (arg1 != -55) {
                        method919((byte) -114, -58, -128, -45, -11, 76, -73);
                    }
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLfc;IIIIILuc;II)V", line = 132)
    public static final void method918(byte arg0, class34 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class121 arg7, int arg8, int arg9) {
        int var10 = class69.field1781[arg4][arg6][arg5];
        field2925++;
        int var11 = class69.field1781[arg4][arg6 + 1][arg5 + 1];
        int var12 = class69.field1781[arg4][arg6 + 1][arg5];
        int var13 = class69.field1781[arg4][arg6][arg5 + 1];
        int var14 = var10 + var12 + var13 + var11 >> 2;
        if (arg0 < 48) {
            field2933 = 80;
        }
        class109 var15 = class32.method256(6, arg2);
        int var16 = (arg8 << 6) + arg3;
        if (var15.field2679 == 1) {
            var16 += 256;
        }
        int var17 = (arg5 << 7) + arg6 + (arg2 << 14) + 1073741824;
        if (var15.field2633 == 0) {
            var17 += Integer.MIN_VALUE;
        }
        if (arg3 == 22) {
            class22 var18;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var18 = var15.method827(var13, var10, (byte) -20, arg8, 22, var11, var12);
            } else {
                var18 = new class48(arg2, 22, arg8, var10, var12, var11, var13, var15.field2622, true);
            }
            arg1.method273(arg9, arg6, arg5, var14, var18, var17, var16);
            if (var15.field2646 && var15.field2633 == 1) {
                arg7.method926(arg5, (byte) 48, arg6);
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class22 var38;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var38 = var15.method827(var13, var10, (byte) -20, arg8, 10, var11, var12);
            } else {
                var38 = new class48(arg2, 10, arg8, var10, var12, var11, var13, var15.field2622, true);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg8 == 1 || arg8 == 3) {
                    var39 = var15.field2647;
                    var40 = var15.field2664;
                } else {
                    var39 = var15.field2664;
                    var40 = var15.field2647;
                }
                int var41 = 0;
                if (arg3 == 11) {
                    var41 += 256;
                }
                arg1.method316(arg9, arg6, arg5, var14, var40, var39, var38, var41, var17, var16);
            }
            if (var15.field2646) {
                arg7.method924(var15.field2664, var15.field2647, var15.field2639, arg5, 0, arg6, arg8);
            }
        } else if (arg3 >= 12) {
            class22 var19;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var19 = var15.method827(var13, var10, (byte) -20, arg8, arg3, var11, var12);
            } else {
                var19 = new class48(arg2, arg3, arg8, var10, var12, var11, var13, var15.field2622, true);
            }
            arg1.method316(arg9, arg6, arg5, var14, 1, 1, var19, 0, var17, var16);
            if (var15.field2646) {
                arg7.method924(var15.field2664, var15.field2647, var15.field2639, arg5, 0, arg6, arg8);
            }
        } else if (arg3 == 0) {
            class22 var20;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var20 = var15.method827(var13, var10, (byte) -20, arg8, 0, var11, var12);
            } else {
                var20 = new class48(arg2, 0, arg8, var10, var12, var11, var13, var15.field2622, true);
            }
            arg1.method291(arg9, arg6, arg5, var14, var20, null, class31.field878[arg8], 0, var17, var16);
            if (var15.field2646) {
                arg7.method933(arg5, arg3, (byte) 126, arg6, var15.field2639, arg8);
            }
        } else if (arg3 == 1) {
            class22 var21;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var21 = var15.method827(var13, var10, (byte) -20, arg8, 1, var11, var12);
            } else {
                var21 = new class48(arg2, 1, arg8, var10, var12, var11, var13, var15.field2622, true);
            }
            arg1.method291(arg9, arg6, arg5, var14, var21, null, class95.field2302[arg8], 0, var17, var16);
            if (var15.field2646) {
                arg7.method933(arg5, arg3, (byte) 127, arg6, var15.field2639, arg8);
            }
        } else if (arg3 == 2) {
            int var22 = arg8 + 1 & 0x3;
            class22 var23;
            class22 var24;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var23 = var15.method827(var13, var10, (byte) -20, arg8 + 4, 2, var11, var12);
                var24 = var15.method827(var13, var10, (byte) -20, var22, 2, var11, var12);
            } else {
                var23 = new class48(arg2, 2, arg8 + 4, var10, var12, var11, var13, var15.field2622, true);
                var24 = new class48(arg2, 2, var22, var10, var12, var11, var13, var15.field2622, true);
            }
            arg1.method291(arg9, arg6, arg5, var14, var23, var24, class31.field878[arg8], class31.field878[var22], var17, var16);
            if (var15.field2646) {
                arg7.method933(arg5, arg3, (byte) 27, arg6, var15.field2639, arg8);
            }
        } else if (arg3 == 3) {
            class22 var25;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var25 = var15.method827(var13, var10, (byte) -20, arg8, 3, var11, var12);
            } else {
                var25 = new class48(arg2, 3, arg8, var10, var12, var11, var13, var15.field2622, true);
            }
            arg1.method291(arg9, arg6, arg5, var14, var25, null, class95.field2302[arg8], 0, var17, var16);
            if (var15.field2646) {
                arg7.method933(arg5, arg3, (byte) -21, arg6, var15.field2639, arg8);
            }
        } else if (arg3 == 9) {
            class22 var26;
            if (var15.field2622 == -1 && var15.field2629 == null) {
                var26 = var15.method827(var13, var10, (byte) -20, arg8, arg3, var11, var12);
            } else {
                var26 = new class48(arg2, arg3, arg8, var10, var12, var11, var13, var15.field2622, true);
            }
            arg1.method316(arg9, arg6, arg5, var14, 1, 1, var26, 0, var17, var16);
            if (var15.field2646) {
                arg7.method924(var15.field2664, var15.field2647, var15.field2639, arg5, 0, arg6, arg8);
            }
        } else {
            if (var15.field2632) {
                if (arg8 == 1) {
                    int var27 = var13;
                    var13 = var11;
                    var11 = var12;
                    var12 = var10;
                    var10 = var27;
                } else if (arg8 == 2) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var28;
                    int var29 = var11;
                    var11 = var10;
                    var10 = var29;
                } else if (arg8 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var12;
                    var12 = var11;
                    var11 = var30;
                }
            }
            if (arg3 == 4) {
                class22 var31;
                if (var15.field2622 == -1 && var15.field2629 == null) {
                    var31 = var15.method827(var13, var10, (byte) -20, 0, 4, var11, var12);
                } else {
                    var31 = new class48(arg2, 4, 0, var10, var12, var11, var13, var15.field2622, true);
                }
                arg1.method296(arg9, arg6, arg5, var14, var31, class31.field878[arg8], arg8 * 512, 0, 0, var17, var16);
            } else if (arg3 == 5) {
                int var32 = arg1.method272(arg9, arg6, arg5);
                int var33 = 16;
                if (var32 > 0) {
                    var33 = class32.method256(6, var32 >> 14 & 0x7FFF).field2660;
                }
                class22 var34;
                if (var15.field2622 == -1 && var15.field2629 == null) {
                    var34 = var15.method827(var13, var10, (byte) -20, 0, 4, var11, var12);
                } else {
                    var34 = new class48(arg2, 4, 0, var10, var12, var11, var13, var15.field2622, true);
                }
                arg1.method296(arg9, arg6, arg5, var14, var34, class31.field878[arg8], arg8 * 512, class108.field2602[arg8] * var33, class52.field1370[arg8] * var33, var17, var16);
            } else if (arg3 == 6) {
                class22 var35;
                if (var15.field2622 == -1 && var15.field2629 == null) {
                    var35 = var15.method827(var13, var10, (byte) -20, 0, 4, var11, var12);
                } else {
                    var35 = new class48(arg2, 4, 0, var10, var12, var11, var13, var15.field2622, true);
                }
                arg1.method296(arg9, arg6, arg5, var14, var35, 256, arg8, 0, 0, var17, var16);
            } else if (arg3 == 7) {
                class22 var36;
                if (var15.field2622 == -1 && var15.field2629 == null) {
                    var36 = var15.method827(var13, var10, (byte) -20, 0, 4, var11, var12);
                } else {
                    var36 = new class48(arg2, 4, 0, var10, var12, var11, var13, var15.field2622, true);
                }
                arg1.method296(arg9, arg6, arg5, var14, var36, 512, arg8, 0, 0, var17, var16);
            } else if (arg3 == 8) {
                class22 var37;
                if (var15.field2622 == -1 && var15.field2629 == null) {
                    var37 = var15.method827(var13, var10, (byte) -20, 0, 4, var11, var12);
                } else {
                    var37 = new class48(arg2, 4, 0, var10, var12, var11, var13, var15.field2622, true);
                }
                arg1.method296(arg9, arg6, arg5, var14, var37, 768, arg8, 0, 0, var17, var16);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIIIIII)I", line = 432)
    public static final int method919(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2929++;
        int var7 = arg1 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg6;
            arg6 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg2;
        } else if (arg0 == 60) {
            return var7 == 2 ? 1 + 7 - arg4 - arg5 : 1 - arg6 + 7 - arg2;
        } else {
            return 111;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V", line = 477)
    public static void method920(boolean arg0) {
        field2930 = null;
        field2949 = null;
        field2936 = null;
        field2951 = null;
        field2940 = null;
        field2939 = null;
        field2952 = null;
        field2941 = null;
        field2947 = null;
        field2948 = null;
        field2932 = null;
        field2938 = null;
        field2946 = null;
        field2931 = null;
        field2937 = null;
        field2935 = null;
        field2927 = null;
        field2926 = null;
        field2945 = null;
        field2950 = null;
        if (arg0) {
            field2944 = true;
        }
        field2953 = null;
        field2954 = null;
        field2942 = null;
    }
}
