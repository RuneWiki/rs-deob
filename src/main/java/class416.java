import java.awt.Dimension;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class416 {

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lr;")
    private class166 field6037;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Luq;")
    private class146 field6025;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field6031 = 0;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "[I")
    public static int[] field6035 = new int[4096];

    @OriginalMember(owner = "client!la", name = "k", descriptor = "[I")
    public static int[] field6032 = new int[1];

    @OriginalMember(owner = "client!la", name = "w", descriptor = "S")
    public static short field6044 = 205;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;II[IB[Lf;)V", line = 3)
    public final void method2490(int arg0, int arg1, String arg2, int arg3, int arg4, int[] arg5, byte arg6, class702[] arg7) {
        int var9 = 117 % ((-arg6 - 58) / 54);
        field6043++;
        if (arg2 != null) {
            this.method2508(98, arg1, arg3);
            this.method2502(arg5, arg0, arg2, 0, arg4, arg7, null, (byte) 127, 0);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIIB)V", line = 18)
    public final void method2491(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != -117) {
            this.method2504(-67, 26, null);
        }
        field6038++;
        if (arg2 == null) {
            return;
        }
        this.method2508(90, arg0, arg1);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg3 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg3 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2495(arg5, null, arg2, arg4 - this.field6025.method1039(0, arg2) / 2, var9, null, var10, arg6 + 116);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIBI)V", line = 56)
    public final void method2492(int arg0, String arg1, int arg2, int arg3, byte arg4, int arg5) {
        field6028++;
        if (arg1 == null) {
            return;
        }
        this.method2508(-127, arg3, arg0);
        this.method2502(null, arg2, arg1, 0, arg5, null, null, (byte) 125, 0);
        if (arg4 > -105) {
            method2503((byte) -42);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)V", line = 74)
    private final void method2493(byte arg0, String arg1) {
        try {
            if (arg0 < 76) {
                this.method2492(-34, null, -51, -59, (byte) -21, -128);
            }
            if (arg1.startsWith("col=")) {
                class450.field6486 = class450.field6486 & 0xFF000000 | class577.method3274(16, -970568439, arg1.substring(4)) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class450.field6486 = class374.field5326 & 0xFFFFFF | class450.field6486 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class450.field6486 = class577.method3274(16, -970568439, arg1.substring(5));
            } else if (arg1.equals("/argb")) {
                class450.field6486 = class374.field5326;
            } else if (arg1.startsWith("str=")) {
                class577.field8114 = class450.field6486 & 0xFF000000 | class577.method3274(16, -970568439, arg1.substring(4));
            } else if (arg1.equals("str")) {
                class577.field8114 = class450.field6486 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class577.field8114 = -1;
            } else if (arg1.startsWith("u=")) {
                class339.field4989 = class450.field6486 & 0xFF000000 | class577.method3274(16, -970568439, arg1.substring(2));
            } else if (arg1.equals("u")) {
                class339.field4989 = class450.field6486 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class339.field4989 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class425.field6196 = 0;
            } else if (arg1.startsWith("shad=")) {
                class425.field6196 = class450.field6486 & 0xFF000000 | class577.method3274(16, -970568439, arg1.substring(5));
            } else if (arg1.equals("shad")) {
                class425.field6196 = class450.field6486 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class425.field6196 = class461.field6645;
            } else if (arg1.equals("br")) {
                this.method2508(-63, class461.field6645, class374.field5326);
            }
        } catch (Exception var3) {
        }
        field6026++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V", line = 153)
    public final void method2494(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field6039++;
        if (arg3 == null) {
            return;
        }
        if (arg4 > -95) {
            field6035 = null;
        }
        this.method2508(113, arg0, arg1);
        this.method2502(null, arg2 - (this.field6025.method1039(0, arg3) / 2), arg3, 0, arg5, null, null, (byte) 127, 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[ILjava/lang/String;I[I[Lf;[II)V", line = 171)
    private final void method2495(int arg0, int[] arg1, String arg2, int arg3, int[] arg4, class702[] arg5, int[] arg6, int arg7) {
        int var9 = arg0 - this.field6025.field2136;
        field6027++;
        int var10 = arg7;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class520.method2966(arg2.charAt(var14), 20965) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg2.substring(var10 + 1, var14);
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
                                    if (arg4 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg4[var12];
                                    }
                                    int var18;
                                    if (arg6 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg6[var12];
                                    }
                                    var12++;
                                    int var19 = class440.method2607(arg7 ^ 0xFFFFE35D, var16.substring(4));
                                    class702 var20 = arg5[var19];
                                    int var21 = arg1 == null ? var20.method936() : arg1[var19];
                                    var20.method929(arg3 + var17, this.field6025.field2136 + var9 + -var21 - -var18, 1, 0, 1);
                                    var11 = -1;
                                    arg3 += arg5[var19].method931();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2493((byte) 104, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg3 += this.field6025.method1038(var11, -4, var15);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg6 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg6[var12];
                    }
                    if (var15 != ' ') {
                        if ((class425.field6196 & 0xFF000000) != 0) {
                            this.method59(var15, arg3 + var22 + 1, var9 - (-var23 + -1), class425.field6196, true);
                        }
                        this.method59(var15, arg3 + var22, var9 + var23, class450.field6486, false);
                    } else if (class83.field1376 > 0) {
                        class172.field2452 += class83.field1376;
                        arg3 += class172.field2452 >> 8;
                        class172.field2452 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field6025.method1045(255, var15);
                    if (class577.field8114 != -1) {
                        this.field6037.method1147(-28854, (int) ((double) this.field6025.field2136 * 0.7D) + var9, class577.field8114, arg3, var24);
                    }
                    if (class339.field4989 != -1) {
                        this.field6037.method1147(-28854, this.field6025.field2136 + var9, class339.field4989, arg3, var24);
                    }
                    arg3 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I", line = 330)
    public static final int method2496(int arg0, int arg1, int arg2) {
        field6042++;
        if (class487.field6928 == -1) {
            return 1;
        }
        if (class328.field4859 != arg2) {
            class151.method1066(arg2, class274.field4129.method1804(7175, class512.field7203), true);
            if (class328.field4859 != arg2) {
                return -1;
            }
        }
        try {
            Dimension var3 = class31.field486.getSize();
            int var4 = 125 % ((arg0 - 72) / 40);
            class140.method1015(class563.field7931, true, class244.field3796, class282.field4228, (byte) 66, class274.field4129.method1804(7175, class512.field7203));
            class461 var5 = class24.method284(class487.field6928, (byte) 81, 0, class81.field1362);
            long var6 = class490.method2840(true);
            class282.field4228.method152();
            class318.field4690.method252(0, class683.field9623, 0);
            class282.field4228.method155(class318.field4690);
            class282.field4228.method184(var3.width / 2, var3.height / 2, 512, 512);
            class282.field4228.method132(1.0F);
            class282.field4228.method185(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class55 var8 = class282.field4228.method171(var5, 2048, 64, 64, 768);
            int var9 = 0;
            label41: for (int var10 = 0; var10 < 500; var10++) {
                class282.field4228.method139(0);
                class282.field4228.method194();
                for (int var11 = 15; var11 >= 0; var11--) {
                    for (int var12 = 0; var12 <= var11; var12++) {
                        class303.field4524.method252((int) (((float) var12 - (float) var11 / 2.0F) * (float) class437.field6392), 0, (var11 + 1) * class437.field6392);
                        var8.method513(class303.field4524, null, 0);
                        var9++;
                        if (class490.method2840(true) - var6 >= (long) arg1) {
                            break label41;
                        }
                    }
                }
            }
            class282.field4228.method157();
            long var13 = (long) (var9 * 1000) / (class490.method2840(true) - var6);
            class282.field4228.method139(0);
            class282.field4228.method194();
            return (int) var13;
        } catch (Throwable var16) {
            var16.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;IBI)V", line = 416)
    public final void method2497(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, byte arg6, int arg7) {
        field6024++;
        if (arg4 == null) {
            return;
        }
        this.method2508(88, arg3, arg1);
        if (arg6 != 91) {
            return;
        }
        double var9 = 7.0D - (double) arg0 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg4.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg2) * var9);
        }
        this.method2495(arg7, null, arg4, arg5 - (this.field6025.method1039(0, arg4) / 2), null, null, var12, -1);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;III[III[Lf;II[ILjava/lang/String;BII)I", line = 451)
    public final int method2498(Random arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, class702[] arg7, int arg8, int arg9, int[] arg10, String arg11, byte arg12, int arg13, int arg14) {
        field6034++;
        if (arg11 == null) {
            return 0;
        }
        arg0.setSeed((long) arg14);
        int var16 = (arg0.nextInt() & 0x1F) + 192;
        if (arg12 <= 104) {
            this.method2508(-77, 67, -17);
        }
        this.method2508(126, arg3 & 0xFFFFFF | var16 << 24, arg9 & 0xFFFFFF | var16 << 24);
        int var17 = arg11.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg0.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg5;
        int var22 = this.field6025.field2126 + arg13;
        int var23 = -1;
        if (arg2 == 1) {
            var22 += (arg8 - this.field6025.field2126 - this.field6025.field2132) / 2;
        } else if (arg2 == 2) {
            var22 = arg13 + arg8 - this.field6025.field2132;
        }
        if (arg1 == 1) {
            var23 = var19 + this.field6025.method1039(0, arg11);
            var21 = (arg6 - var23) / 2 + arg5;
        } else if (arg1 == 2) {
            var23 = this.field6025.method1039(0, arg11) + var19;
            var21 = arg6 + arg5 - var23;
        }
        this.method2495(var22, arg10, arg11, var21, var18, arg7, null, -1);
        if (arg4 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field6025.method1039(0, arg11);
            }
            arg4[1] = var22 - this.field6025.field2126;
            arg4[0] = var21;
            arg4[2] = var23;
            arg4[3] = this.field6025.field2132 + this.field6025.field2126;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Lf;ILjava/util/Random;IIIII[ILjava/lang/String;)I", line = 531)
    public final int method2499(class702[] arg0, int arg1, Random arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, String arg9) {
        if (arg3 < 6) {
            return -20;
        }
        field6040++;
        if (arg9 == null) {
            return 0;
        }
        arg2.setSeed((long) arg6);
        int var11 = (arg2.nextInt() & 0x1F) + 192;
        this.method2508(-36, arg5 & 0xFFFFFF | var11 << 24, arg4 & 0xFFFFFF | var11 << 24);
        int var12 = arg9.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg2.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2495(arg1, arg8, arg9, arg7, var13, arg0, null, -1);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIIILjava/lang/String;IIIILua;II[Lf;I[I)I", line = 572)
    public final int method2500(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, String arg6, int arg7, int arg8, int arg9, int arg10, class617 arg11, int arg12, int arg13, class702[] arg14, int arg15, int[] arg16) {
        field6023++;
        if (arg6 == null) {
            return 0;
        }
        this.method2508(117, arg9, arg13);
        if (arg3 == 0) {
            arg3 = this.field6025.field2136;
        }
        int[] var18;
        if ((this.field6025.field2132 + this.field6025.field2126 + arg3) > arg4 && arg4 < (arg3 + arg3)) {
            var18 = null;
        } else {
            var18 = new int[] { arg5 };
        }
        if (arg1 == -1) {
            arg1 = arg4 / arg3;
            if (arg1 <= 0) {
                arg1 = 1;
            }
        }
        int var19 = this.field6025.method1042(arg2, var18, arg14, arg6, class167.field2410);
        if (arg1 > 0 && var19 >= arg1) {
            class167.field2410[arg1 - 1] = this.field6025.method1044(51, arg14, class167.field2410[arg1 - 1], arg5);
            var19 = arg1;
        }
        if (arg7 == 3 && var19 == 1) {
            arg7 = 1;
        }
        int var20;
        if (arg7 == 0) {
            var20 = this.field6025.field2126 + arg12;
        } else if (arg7 == 1) {
            var20 = (arg4 - ((var19 - 1) * arg3) - this.field6025.field2126 - this.field6025.field2132) / 2 + this.field6025.field2126 + arg12;
        } else if (arg7 == 2) {
            var20 = arg4 + arg12 - ((var19 - 1) * arg3) - this.field6025.field2132;
        } else {
            int var21 = (arg4 - (this.field6025.field2132 + ((var19 - 1) * arg3)) - this.field6025.field2126) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg3 += var21;
            var20 = arg12 + this.field6025.field2126 + var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg8 == 0) {
                this.method2502(arg16, arg10, class167.field2410[var22], arg0, var20, arg14, arg11, (byte) 127, arg15);
            } else if (arg8 == 1) {
                this.method2502(arg16, (arg5 - this.field6025.method1039(0, class167.field2410[var22])) / 2 + arg10, class167.field2410[var22], arg0, var20, arg14, arg11, (byte) 125, arg15);
            } else if (arg8 == 2) {
                this.method2502(arg16, arg5 + arg10 - this.field6025.method1039(0, class167.field2410[var22]), class167.field2410[var22], arg0, var20, arg14, arg11, (byte) 125, arg15);
            } else if ((var19 - 1) == var22) {
                this.method2502(arg16, arg10, class167.field2410[var22], arg0, var20, arg14, arg11, (byte) 125, arg15);
            } else {
                this.method2504(arg5, -115, class167.field2410[var22]);
                this.method2502(arg16, arg10, class167.field2410[var22], arg0, var20, arg14, arg11, (byte) 127, arg15);
                class83.field1376 = 0;
            }
            var20 += arg3;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IIIIILua;Ljava/lang/String;I[Lf;IIIIIII)I", line = 675)
    public final int method2501(int[] arg0, int arg1, int arg2, int arg3, int arg4, class617 arg5, String arg6, int arg7, class702[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        if (arg12 != 0) {
            field6035 = null;
        }
        field6041++;
        return this.method2500(arg10, 0, false, arg1, arg3, arg13, arg6, arg7, arg15, arg4, arg2, arg5, arg11, arg14, arg8, arg9, arg0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IILjava/lang/String;II[Lf;Lua;BI)V", line = 687)
    private final void method2502(int[] arg0, int arg1, String arg2, int arg3, int arg4, class702[] arg5, class617 arg6, byte arg7, int arg8) {
        int var10 = arg4 - this.field6025.field2136;
        field6045++;
        int var11 = -1;
        if (arg7 <= 124) {
            field6031 = -61;
        }
        int var12 = -1;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class520.method2966(arg2.charAt(var14), 20965) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg2.substring(var11 + 1, var14);
                    var11 = -1;
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
                                    int var17 = class440.method2607(7330, var16.substring(4));
                                    class702 var18 = arg5[var17];
                                    int var19 = arg0 == null ? var18.method936() : arg0[var17];
                                    if ((class450.field6486 & 0xFF000000) == -16777216) {
                                        var18.method929(arg1, var10 - (var19 - this.field6025.field2136), 1, 0, 1);
                                    } else {
                                        var18.method929(arg1, var10 + this.field6025.field2136 - var19, 0, class450.field6486 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg1 += arg5[var17].method931();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2493((byte) 122, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg1 += this.field6025.method1038(var12, -49, var15);
                    }
                    if (var15 == ' ') {
                        if (class83.field1376 > 0) {
                            class172.field2452 += class83.field1376;
                            arg1 += class172.field2452 >> 8;
                            class172.field2452 &= 0xFF;
                        }
                    } else if (arg6 == null) {
                        if ((class425.field6196 & 0xFF000000) != 0) {
                            this.method59(var15, arg1 + 1, var10 + 1, class425.field6196, true);
                        }
                        this.method59(var15, arg1, var10, class450.field6486, false);
                    } else {
                        if ((class425.field6196 & 0xFF000000) != 0) {
                            this.method60(var15, arg1 + 1, var10 + 1, class425.field6196, true, arg6, arg3, arg8);
                        }
                        this.method60(var15, arg1, var10, class450.field6486, false, arg6, arg3, arg8);
                    }
                    int var20 = this.field6025.method1045(255, var15);
                    if (class577.field8114 != -1) {
                        this.field6037.method1147(-28854, (int) ((double) this.field6025.field2136 * 0.7D) + var10, class577.field8114, arg1, var20);
                    }
                    if (class339.field4989 != -1) {
                        this.field6037.method1147(-28854, var10 + this.field6025.field2136 + 1, class339.field4989, arg1, var20);
                    }
                    arg1 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lr;Luq;)V", line = 839)
    public class416(class166 arg0, class146 arg1) {
        this.field6037 = arg0;
        this.field6025 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 848)
    public static void method2503(byte arg0) {
        int var1 = 23 % ((-arg0 - 31) / 39);
        field6035 = null;
        field6032 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;)V", line = 859)
    private final void method2504(int arg0, int arg1, String arg2) {
        field6029++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg2.length() > var6; var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (arg1 >= -98) {
            field6044 = -117;
        }
        if (var4 > 0) {
            class83.field1376 = (arg0 - this.field6025.method1039(0, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)I", line = 898)
    public static final int method2505(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -1) {
            return -95;
        }
        int var4 = arg1 & 0x3;
        field6033++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return 4095 - arg3;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;BIII)V", line = 921)
    public final void method2506(int arg0, int arg1, String arg2, byte arg3, int arg4, int arg5, int arg6) {
        field6030++;
        if (arg2 == null) {
            return;
        }
        this.method2508(-91, arg4, arg6);
        int var8 = arg2.length();
        int var9 = -13 / ((arg3 - 10) / 46);
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 2.0D) * 5.0D);
        }
        this.method2495(arg1, null, arg2, arg5 - this.field6025.method1039(0, arg2) / 2, null, null, var10, -1);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 949)
    public final void method2507(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 > -106) {
            method2503((byte) -57);
        }
        field6036++;
        if (arg1 != null) {
            this.method2508(120, arg2, arg5);
            this.method2502(null, arg3 - this.field6025.method1039(0, arg1), arg1, 0, arg0, null, null, (byte) 126, 0);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(III)V", line = 966)
    private final void method2508(int arg0, int arg1, int arg2) {
        field6022++;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class172.field2452 = 0;
        class374.field5326 = arg2;
        class450.field6486 = arg2;
        class577.field8114 = -1;
        class339.field4989 = -1;
        int var4 = 119 / ((arg0 - 32) / 53);
        class83.field1376 = 0;
        class461.field6645 = arg1;
        class425.field6196 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLua;II)V")
    public abstract void method60(char arg0, int arg1, int arg2, int arg3, boolean arg4, class617 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method59(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
