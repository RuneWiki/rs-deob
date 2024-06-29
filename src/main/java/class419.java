import java.awt.Container;
import java.awt.Insets;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class419 {

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Lgda;")
    private class50 field5934;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Lr;")
    private class165 field5943;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "[I")
    public static int[] field5947 = new int[2048];

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field5948 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIILjava/util/Random;II[Lf;III[I[I)I")
    public final int method2513(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, Random arg6, int arg7, int arg8, class701[] arg9, int arg10, int arg11, int arg12, int[] arg13, int[] arg14) {
        field5936++;
        if (arg2 == null) {
            return 0;
        }
        arg6.setSeed((long) arg7);
        int var16 = (arg6.nextInt() & 0x1F) + 192;
        this.method2528(-1, var16 << 24 | arg4 & 0xFFFFFF, arg11 & 0xFFFFFF | var16 << 24);
        int var17 = arg2.length();
        int[] var18 = new int[var17];
        int var19 = arg3;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg6.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg10;
        int var22 = this.field5934.field829 + arg8;
        int var23 = -1;
        if (arg0 == 1) {
            var22 += (arg12 - this.field5934.field829 - this.field5934.field833) / 2;
        } else if (arg0 == 2) {
            var22 = arg8 + arg12 - this.field5934.field833;
        }
        if (arg5 == 1) {
            var23 = this.field5934.method553(arg2, 107) + var19;
            var21 = (arg1 - var23) / 2 + arg10;
        } else if (arg5 == 2) {
            var23 = this.field5934.method553(arg2, 66) + var19;
            var21 = arg1 + arg10 - var23;
        }
        this.method2517(arg13, arg3 ^ 0x2381, var22, null, var21, arg2, arg9, var18);
        if (arg14 != null) {
            if (var23 == -1) {
                var23 = this.field5934.method553(arg2, -29) + var19;
            }
            arg14[0] = var21;
            arg14[1] = var22 - this.field5934.field829;
            arg14[2] = var23;
            arg14[3] = this.field5934.field833 + this.field5934.field829;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class587.field8513 <= arg7 && class221.field2866 >= arg2 && class598.field8632 <= arg4 && arg5 <= class288.field3883) {
            class224.method1358(arg5, true, arg2, arg7, arg0, arg4, arg3, arg1);
        } else {
            class141.method927(arg3, arg2, arg0, arg7, arg6 ^ 0xFFFFAA35, arg1, arg4, arg5);
        }
        field5931++;
        if (arg6 != -20165) {
            method2523(39);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method2515(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field5937++;
        if (arg3 != null) {
            this.method2528(-1, arg2, arg0);
            this.method2516(arg5, null, arg1, arg1 - 55, arg3, 0, null, arg4, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[IIILjava/lang/String;ILua;I[Lf;)V")
    private final void method2516(int arg0, int[] arg1, int arg2, int arg3, String arg4, int arg5, class616 arg6, int arg7, class701[] arg8) {
        int var10 = 113 / ((64 - arg3) / 49);
        field5933++;
        int var11 = arg7 - this.field5934.field832;
        int var12 = -1;
        int var13 = -1;
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class49.method545(arg4.charAt(var15), true) & 0xFF);
            if (var16 == '<') {
                var12 = var15;
            } else {
                if (var16 == '>' && var12 != -1) {
                    String var17 = arg4.substring(var12 + 1, var15);
                    var12 = -1;
                    if (var17.equals("lt")) {
                        var16 = '<';
                    } else if (var17.equals("gt")) {
                        var16 = '>';
                    } else if (var17.equals("nbsp")) {
                        var16 = ' ';
                    } else if (var17.equals("shy")) {
                        var16 = '\u00AD';
                    } else if (var17.equals("times")) {
                        var16 = '×';
                    } else if (var17.equals("euro")) {
                        var16 = '€';
                    } else if (var17.equals("copy")) {
                        var16 = '©';
                    } else {
                        if (!var17.equals("reg")) {
                            if (var17.startsWith("img=")) {
                                try {
                                    int var18 = class79.method663(10, var17.substring(4));
                                    class701 var19 = arg8[var18];
                                    int var20 = arg1 == null ? var19.method901() : arg1[var18];
                                    if ((class318.field4209 & 0xFF000000) == -16777216) {
                                        var19.method3(arg0, this.field5934.field832 + var11 - var20, 1, 0, 1);
                                    } else {
                                        var19.method3(arg0, var11 + this.field5934.field832 - var20, 0, class318.field4209 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var13 = -1;
                                    arg0 += arg8[var18].method896();
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method2522(var17, false);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var12 == -1) {
                    if (var13 != -1) {
                        arg0 += this.field5934.method549((byte) 127, var16, var13);
                    }
                    if (var16 == ' ') {
                        if (class409.field5795 > 0) {
                            class585.field8498 += class409.field5795;
                            arg0 += class585.field8498 >> 8;
                            class585.field8498 &= 0xFF;
                        }
                    } else if (arg6 == null) {
                        if ((class108.field1415 & 0xFF000000) != 0) {
                            this.method1063(var16, arg0 + 1, var11 + 1, class108.field1415, true);
                        }
                        this.method1063(var16, arg0, var11, class318.field4209, false);
                    } else {
                        if ((class108.field1415 & 0xFF000000) != 0) {
                            this.method1064(var16, arg0 + 1, var11 + 1, class108.field1415, true, arg6, arg2, arg5);
                        }
                        this.method1064(var16, arg0, var11, class318.field4209, false, arg6, arg2, arg5);
                    }
                    int var21 = this.field5934.method547(var16, 11724);
                    if (class122.field1573 != -1) {
                        this.field5943.method1039(var21, class122.field1573, var11 + ((int) ((double) this.field5934.field832 * 0.7D)), (byte) 105, arg0);
                    }
                    if (class497.field6944 != -1) {
                        this.field5943.method1039(var21, class497.field6944, this.field5934.field832 + var11 + 1, (byte) 83, arg0);
                    }
                    var13 = var16;
                    arg0 += var21;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([III[IILjava/lang/String;[Lf;[I)V")
    private final void method2517(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, String arg5, class701[] arg6, int[] arg7) {
        field5945++;
        if (arg1 != 9089) {
            this.method1064((char) 65470, -38, -20, 48, true, null, -8, 92);
        }
        int var9 = arg2 - this.field5934.field832;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg5.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class49.method545(arg5.charAt(var14), true) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg5.substring(var10 + 1, var14);
                    var10 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17;
                                    if (arg7 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg7[var12];
                                    }
                                    int var18;
                                    if (arg3 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg3[var12];
                                    }
                                    var12++;
                                    int var19 = class79.method663(10, var16.substring(4));
                                    class701 var20 = arg6[var19];
                                    int var21 = arg0 == null ? var20.method901() : arg0[var19];
                                    var20.method3(arg4 + var17, this.field5934.field832 + var9 + -var21 + var18, 1, 0, 1);
                                    arg4 += arg6[var19].method896();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2522(var16, false);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg4 += this.field5934.method549((byte) 126, var15, var11);
                    }
                    int var22;
                    if (arg7 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg7[var12];
                    }
                    int var23;
                    if (arg3 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg3[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class108.field1415 & 0xFF000000) != 0) {
                            this.method1063(var15, var22 + arg4 + 1, var9 + 1 + var23, class108.field1415, true);
                        }
                        this.method1063(var15, arg4 + var22, var9 + var23, class318.field4209, false);
                    } else if (class409.field5795 > 0) {
                        class585.field8498 += class409.field5795;
                        arg4 += class585.field8498 >> 8;
                        class585.field8498 &= 0xFF;
                    }
                    int var24 = this.field5934.method547(var15, arg1 ^ 0xE4D);
                    if (class122.field1573 != -1) {
                        this.field5943.method1039(var24, class122.field1573, (int) ((double) this.field5934.field832 * 0.7D) + var9, (byte) 94, arg4);
                    }
                    if (class497.field6944 != -1) {
                        this.field5943.method1039(var24, class497.field6944, this.field5934.field832 + var9, (byte) -77, arg4);
                    }
                    var11 = var15;
                    arg4 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III[Lf;Ljava/lang/String;IIBILua;I[IIIII)I")
    public final int method2518(int arg0, int arg1, int arg2, class701[] arg3, String arg4, int arg5, int arg6, byte arg7, int arg8, class616 arg9, int arg10, int[] arg11, int arg12, int arg13, int arg14, int arg15) {
        if (arg7 < 66) {
            return -69;
        } else {
            field5935++;
            return this.method2526(arg9, arg1, arg0, arg11, arg12, arg4, arg6, arg15, (byte) -89, arg2, arg13, arg3, arg5, 0, arg10, arg14, arg8);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[I[Lf;ILjava/lang/String;Ljava/util/Random;III)I")
    public final int method2519(int arg0, int arg1, int[] arg2, class701[] arg3, int arg4, String arg5, Random arg6, int arg7, int arg8, int arg9) {
        field5932++;
        if (arg5 == null) {
            return 0;
        }
        arg6.setSeed((long) arg1);
        int var11 = (arg6.nextInt() & 0x1F) + 192;
        this.method2528(-1, var11 << 24 | arg0 & 0xFFFFFF, var11 << 24 | arg4 & 0xFFFFFF);
        if (arg9 < 60) {
            return 30;
        }
        int var12 = arg5.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg6.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2517(arg2, 9089, arg8, null, arg7, arg5, arg3, var13);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;BI)V")
    public final void method2520(int arg0, int arg1, int arg2, int arg3, String arg4, byte arg5, int arg6) {
        field5942++;
        if (arg4 == null) {
            return;
        }
        this.method2528(-1, arg2, arg6);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg5 < 6) {
            this.method1064('!', -80, -31, -53, true, null, -114, 33);
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2517(null, 9089, arg1, var10, arg3 - (this.field5934.method553(arg4, 104) / 2), arg4, null, var9);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public final void method2521(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field5939++;
        if (arg4 != null) {
            this.method2528(arg5, arg1, arg3);
            this.method2516(arg0 - this.field5934.method553(arg4, -95), null, 0, 9, arg4, 0, null, arg2, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLua;II)V")
    public abstract void method1064(char arg0, int arg1, int arg2, int arg3, boolean arg4, class616 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    private final void method2522(String arg0, boolean arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class318.field4209 = class318.field4209 & 0xFF000000 | class263.method1601(1, arg0.substring(4), 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class318.field4209 = class318.field4209 & 0xFF000000 | class125.field1604 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class318.field4209 = class263.method1601(1, arg0.substring(5), 16);
            } else if (arg0.equals("/argb")) {
                class318.field4209 = class125.field1604;
            } else if (arg0.startsWith("str=")) {
                class122.field1573 = class318.field4209 & 0xFF000000 | class263.method1601(1, arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                class122.field1573 = class318.field4209 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class122.field1573 = -1;
            } else if (arg0.startsWith("u=")) {
                class497.field6944 = class318.field4209 & 0xFF000000 | class263.method1601(1, arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                class497.field6944 = class318.field4209 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class497.field6944 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class108.field1415 = 0;
            } else if (arg0.startsWith("shad=")) {
                class108.field1415 = class318.field4209 & 0xFF000000 | class263.method1601(1, arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                class108.field1415 = class318.field4209 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class108.field1415 = class507.field7419;
            } else if (arg0.equals("br")) {
                this.method2528(-1, class125.field1604, class507.field7419);
            }
            if (arg1) {
                this.method2517(null, 37, -3, null, 89, null, null, null);
            }
        } catch (Exception var3) {
        }
        field5928++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method2523(int arg0) {
        field5947 = null;
        if (arg0 != 0) {
            method2514(-1, 66, 82, -56, -22, -115, -72, -74);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBLjava/lang/String;)V")
    private final void method2524(int arg0, byte arg1, String arg2) {
        if (arg1 <= 64) {
            this.field5934 = null;
        }
        field5941++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg2.length(); var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class409.field5795 = (arg0 - this.field5934.method553(arg2, 126) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public final void method2525(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field5938++;
        if (arg2 != null) {
            this.method2528(-1, arg3, arg4);
            this.method2516(arg0 - (this.field5934.method553(arg2, -102) / 2), null, 0, 124, arg2, 0, null, arg1, null);
            int var7 = -20 % ((arg5 - 12) / 47);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lua;II[IILjava/lang/String;IIBII[Lf;IIIII)I")
    public final int method2526(class616 arg0, int arg1, int arg2, int[] arg3, int arg4, String arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, class701[] arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field5926++;
        if (arg5 == null) {
            return 0;
        }
        this.method2528(-1, arg1, arg6);
        if (arg15 == 0) {
            arg15 = this.field5934.field832;
        }
        int[] var18;
        if (this.field5934.field829 - (-this.field5934.field833 - arg15) > arg4 && arg15 + arg15 > arg4) {
            var18 = null;
        } else {
            var18 = new int[] { arg12 };
        }
        if (arg13 == -1) {
            arg13 = arg4 / arg15;
            if (arg13 <= 0) {
                arg13 = 1;
            }
        }
        int var19 = this.field5934.method550(arg5, class473.field6602, arg11, var18, (byte) 107);
        if (arg13 > 0 && arg13 <= var19) {
            class473.field6602[arg13 - 1] = this.field5934.method556(class473.field6602[arg13 - 1], arg11, 0, arg12);
            var19 = arg13;
        }
        if (arg8 >= -80) {
            field5948 = 123;
        }
        if (arg2 == 3 && var19 == 1) {
            arg2 = 1;
        }
        int var20;
        if (arg2 == 0) {
            var20 = arg14 + this.field5934.field829;
        } else if (arg2 == 1) {
            var20 = (arg4 - ((var19 - 1) * arg15) - (this.field5934.field833 + this.field5934.field829)) / 2 + this.field5934.field829 + arg14;
        } else if (arg2 == 2) {
            var20 = arg14 + arg4 - (var19 - 1) * arg15 - this.field5934.field833;
        } else {
            int var21 = (arg4 - this.field5934.field833 - this.field5934.field829 - (var19 - 1) * arg15) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg15 += var21;
            var20 = this.field5934.field829 + arg14 + var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg7 == 0) {
                this.method2516(arg10, arg3, arg16, -76, class473.field6602[var22], arg9, arg0, var20, arg11);
            } else if (arg7 == 1) {
                this.method2516((arg12 - this.field5934.method553(class473.field6602[var22], -62)) / 2 + arg10, arg3, arg16, 122, class473.field6602[var22], arg9, arg0, var20, arg11);
            } else if (arg7 == 2) {
                this.method2516(arg10 + arg12 - this.field5934.method553(class473.field6602[var22], -60), arg3, arg16, -109, class473.field6602[var22], arg9, arg0, var20, arg11);
            } else if (var19 - 1 == var22) {
                this.method2516(arg10, arg3, arg16, -117, class473.field6602[var22], arg9, arg0, var20, arg11);
            } else {
                this.method2524(arg12, (byte) 90, class473.field6602[var22]);
                this.method2516(arg10, arg3, arg16, 121, class473.field6602[var22], arg9, arg0, var20, arg11);
                class409.field5795 = 0;
            }
            var20 += arg15;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
    public final void method2527(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5930++;
        if (arg1 == null) {
            return;
        }
        this.method2528(-1, arg6, arg7);
        double var9 = 7.0D - ((double) arg5 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg1.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg3) * var9);
        }
        this.method2517(null, 9089, arg2, var12, arg4 - (this.field5934.method553(arg1, -69) / arg0), arg1, null, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    private final void method2528(int arg0, int arg1, int arg2) {
        class585.field8498 = 0;
        class125.field1604 = arg1;
        class318.field4209 = arg1;
        field5929++;
        class122.field1573 = -1;
        class409.field5795 = 0;
        if (arg2 == -1) {
            arg2 = 0;
        }
        class497.field6944 = arg0;
        class507.field7419 = arg2;
        class108.field1415 = arg2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIII)V")
    public static final void method2529(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field5940++;
        if (class617.field8851 != null && (arg4 != 3 || class221.field2851.field4133 != arg0 || class221.field2851.field4140 != arg3)) {
            class537.method3157(class617.field8851, arg5 ^ 0xFF000000, class517.field7570);
            class617.field8851 = null;
        }
        if (arg4 == 3 && class617.field8851 == null) {
            class617.field8851 = class153.method983((byte) -76, 0, class517.field7570, arg3, 0, arg0);
            if (class617.field8851 != null) {
                class221.field2851.field4133 = arg0;
                class221.field2851.field4140 = arg3;
                class221.field2851.method1742(class517.field7570, arg5 ^ 0xFFFFFF);
            }
        }
        if (arg4 == 3 && class617.field8851 == null) {
            method2529(-1, arg1, true, -1, class221.field2851.field4148, -16777216);
            return;
        }
        Container var6;
        if (class617.field8851 != null) {
            var6 = class617.field8851;
            class417.field5913 = arg3;
            class226.field2929 = arg0;
        } else if (class646.field9189 == null) {
            if (class627.field8991 == null) {
                var6 = class66.field1028;
            } else {
                var6 = class627.field8991;
            }
            class226.field2929 = var6.getSize().width;
            class417.field5913 = var6.getSize().height;
        } else {
            Insets var7 = class646.field9189.getInsets();
            int var10001 = var7.right + var7.left;
            class226.field2929 = class646.field9189.getSize().width - var10001;
            class417.field5913 = class646.field9189.getSize().height - var7.bottom - var7.top;
            var6 = class646.field9189;
        }
        if (arg4 == 1) {
            class467.field6533 = class589.field8535;
            class675.field9684 = 0;
            class300.field4038 = class6.field60;
            class181.field2222 = (class226.field2929 - class589.field8535) / 2;
        } else {
            class622.method3560((byte) 111);
        }
        if (class39.field729 != class215.field2737) {
            boolean var10000;
            if (class467.field6533 < 1024 && class300.field4038 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg2) {
            class302.method1792((byte) -125);
        } else {
            class646.field9190.setSize(class467.field6533, class300.field4038);
            class68.field1045.method275(class646.field9190);
            if (class646.field9189 == var6) {
                Insets var8 = class646.field9189.getInsets();
                class646.field9190.setLocation(var8.left + class181.field2222, class675.field9684 + var8.top);
            } else {
                class646.field9190.setLocation(class181.field2222, class675.field9684);
            }
        }
        if (arg4 < 2) {
            class190.field2324 = false;
        } else {
            class190.field2324 = true;
        }
        if (class127.field1619 != -1) {
            class161.method1019((byte) 97, true);
        }
        if (class489.field6835 != null && class506.method2995((byte) 99, class114.field1485)) {
            class283.method1700(arg5 ^ 0xFF000000);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class89.field1253[var9] = true;
        }
        class288.field3885 = true;
        if (arg5 != -16777216) {
            field5948 = -97;
        }
    }

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method1063(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljn;III)Lgda;")
    public static final class50 method2530(class668 arg0, int arg1, int arg2, int arg3) {
        field5944++;
        byte[] var4 = arg0.method3800(arg2, arg1, (byte) -92);
        if (var4 == null) {
            return null;
        } else {
            if (arg3 >= -3) {
                field5947 = null;
            }
            return new class50(var4);
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lr;Lgda;)V")
    public class419(class165 arg0, class50 arg1) {
        this.field5934 = arg1;
        this.field5943 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIBI)V")
    public final void method2531(String arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field5927++;
        if (arg0 == null) {
            return;
        }
        this.method2528(arg5 - 80, arg6, arg3);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2517(null, 9089, arg4, var9, arg2 - (this.field5934.method553(arg0, -45) / 2), arg0, null, null);
        if (arg5 != 79) {
            field5947 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IILjava/lang/String;II[Lf;ZI)V")
    public final void method2532(int[] arg0, int arg1, String arg2, int arg3, int arg4, class701[] arg5, boolean arg6, int arg7) {
        field5946++;
        if (arg2 != null) {
            this.method2528(-1, arg3, arg7);
            if (arg6) {
                this.method2516(arg1, arg0, 0, 117, arg2, 0, null, arg4, arg5);
            }
        }
    }
}
