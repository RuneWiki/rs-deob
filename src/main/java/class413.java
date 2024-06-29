import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class413 {

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lr;")
    private class566 field5155;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lsa;")
    private class595 field5157;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Z")
    public static volatile boolean field5158 = true;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "[Z")
    public static boolean[] field5168 = new boolean[100];

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Z")
    public static boolean field5172 = false;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field5170 = 0;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Ltda;")
    public static class16 field5164 = new class16(2);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lf;[ILjava/lang/String;I[I[II)V")
    private final void method2184(int arg0, class536[] arg1, int[] arg2, String arg3, int arg4, int[] arg5, int[] arg6, int arg7) {
        field5175++;
        int var9 = arg0 - this.field5157.field8368;
        int var10 = -1;
        int var11 = -1;
        int var12 = arg4;
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class598.method3286((byte) 99, arg3.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg3.substring(var10 + 1, var14);
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
                                    if (arg2 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg2[var12];
                                    }
                                    int var18;
                                    if (arg5 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg5[var12];
                                    }
                                    var12++;
                                    int var19 = class557.method3065(arg4 ^ 0x80, var16.substring(4));
                                    class536 var20 = arg1[var19];
                                    int var21 = arg6 == null ? var20.method166() : arg6[var19];
                                    var20.method155(arg7 + var17, -var21 - -var18 + this.field5157.field8368 + var9, 1, 0, 1);
                                    var11 = -1;
                                    arg7 += arg1[var19].method160();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2186(var16, 26470);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg7 += this.field5157.method3279(-125, var15, var11);
                    }
                    int var22;
                    if (arg2 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg2[var12];
                    }
                    int var23;
                    if (arg5 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg5[var12];
                    }
                    if (var15 != ' ') {
                        if ((class428.field5359 & 0xFF000000) != 0) {
                            this.method633(var15, var22 + arg7 + 1, var23 + 1 + var9, class428.field5359, true);
                        }
                        this.method633(var15, arg7 + var22, var9 + var23, class231.field2889, false);
                    } else if (class242.field3017 > 0) {
                        class319.field4074 += class242.field3017;
                        arg7 += class319.field4074 >> 8;
                        class319.field4074 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field5157.method3268(var15, (byte) 115);
                    if (class86.field1207 != -1) {
                        this.field5155.method3114((int) ((double) this.field5157.field8368 * 0.7D) + var9, (byte) 11, arg7, var24, class86.field1207);
                    }
                    if (class642.field9043 != -1) {
                        this.field5155.method3114(this.field5157.field8368 + var9, (byte) 11, arg7, var24, class642.field9043);
                    }
                    arg7 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILua;ILjava/lang/String;IIIII[Lf;[IIIII)I")
    public final int method2185(int arg0, int arg1, class600 arg2, int arg3, String arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class536[] arg10, int[] arg11, int arg12, int arg13, int arg14, int arg15) {
        field5166++;
        return arg7 > -30 ? -53 : this.method2197(arg0, arg2, arg4, arg14, arg5, true, arg11, arg12, arg1, arg15, arg3, arg10, arg13, 0, arg8, arg9, arg6);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method2186(String arg0, int arg1) {
        if (arg1 != 26470) {
            field5164 = null;
        }
        field5173++;
        try {
            if (arg0.startsWith("col=")) {
                class231.field2889 = class231.field2889 & 0xFF000000 | class505.method2715(-4096, arg0.substring(4), 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class231.field2889 = class231.field2889 & 0xFF000000 | class458.field5841 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class231.field2889 = class505.method2715(-4096, arg0.substring(5), 16);
            } else if (arg0.equals("/argb")) {
                class231.field2889 = class458.field5841;
            } else if (arg0.startsWith("str=")) {
                class86.field1207 = class231.field2889 & 0xFF000000 | class505.method2715(arg1 - 30566, arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                class86.field1207 = class231.field2889 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class86.field1207 = -1;
            } else if (arg0.startsWith("u=")) {
                class642.field9043 = class231.field2889 & 0xFF000000 | class505.method2715(arg1 - 30566, arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                class642.field9043 = class231.field2889 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class642.field9043 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class428.field5359 = 0;
            } else if (arg0.startsWith("shad=")) {
                class428.field5359 = class231.field2889 & 0xFF000000 | class505.method2715(-4096, arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                class428.field5359 = class231.field2889 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class428.field5359 = class338.field4384;
            } else if (arg0.equals("br")) {
                this.method2188(class458.field5841, arg1 - 24786, class338.field4384);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(JJ)J")
    public static long method2187(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    private final void method2188(int arg0, int arg1, int arg2) {
        field5169++;
        class319.field4074 = 0;
        class642.field9043 = -1;
        class458.field5841 = arg0;
        class231.field2889 = arg0;
        if (arg1 != 1684) {
            return;
        }
        if (arg2 == -1) {
            arg2 = 0;
        }
        class86.field1207 = -1;
        class242.field3017 = 0;
        class338.field4384 = arg2;
        class428.field5359 = arg2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BZ)V")
    public static final void method2189(byte arg0, boolean arg1) {
        if (class446.field5686 != null) {
            class446.field5686.method1235(0);
            class446.field5686 = null;
        }
        field5176++;
        class367.field4671 = 0;
        class111.method623(0);
        class510.method2757();
        for (int var2 = 0; var2 < 4; var2++) {
            class154.field1991[var2].method1954(2097152);
        }
        class253.method1483(111, false);
        System.gc();
        class697.method3922(-88, 2);
        class639.field8989 = false;
        class582.field8137 = -1;
        class487.method2636(2, true);
        class285.field3532 = 0;
        int var3 = 109 / ((-arg0 - 54) / 33);
        class145.field1879 = 0;
        class360.field4584 = 0;
        class56.field795 = 0;
        class630.field8817 = 0;
        class313.field4036 = 0;
        for (int var4 = 0; var4 < class52.field784.length; var4++) {
            class52.field784[var4] = null;
        }
        class525.method2861(1048576);
        for (int var5 = 0; var5 < 2048; var5++) {
            class351.field4490[var5] = null;
        }
        class470.field5974 = 0;
        class180.field2318.method398(true);
        class441.field5585 = 0;
        class533.field7185.method398(true);
        class479.method2608((byte) -110);
        class70.field942 = 0;
        class684.field9606.method1184(10542);
        class85.method489((byte) -58);
        class34.method221(6870);
        class373.field4703 = null;
        class581.field8124 = 0L;
        if (arg1) {
            class361.method1987(12, -120);
            return;
        }
        class361.method1987(3, -116);
        try {
            class371.method2028(true, "loggedout", class422.field5308);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method633(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Lf;IIIILjava/util/Random;Ljava/lang/String;I[III[IIII)I")
    public final int method2190(class536[] arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, String arg6, int arg7, int[] arg8, int arg9, int arg10, int[] arg11, int arg12, int arg13, int arg14) {
        field5171++;
        if (arg6 == null) {
            return 0;
        }
        if (arg7 > -9) {
            this.method2188(73, -32, 20);
        }
        arg5.setSeed((long) arg13);
        int var16 = (arg5.nextInt() & 0x1F) + 192;
        this.method2188(arg12 & 0xFFFFFF | var16 << 24, 1684, var16 << 24 | arg3 & 0xFFFFFF);
        int var17 = arg6.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg5.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg9;
        int var22 = arg2 + this.field5157.field8359;
        if (arg10 == 1) {
            var22 += (arg1 - (this.field5157.field8359 + this.field5157.field8371)) / 2;
        } else if (arg10 == 2) {
            var22 = arg1 + arg2 - this.field5157.field8371;
        }
        int var23 = -1;
        if (arg14 == 1) {
            var23 = var19 + this.field5157.method3269((byte) 99, arg6);
            var21 = (arg4 - var23) / 2 + arg9;
        } else if (arg14 == 2) {
            var23 = this.field5157.method3269((byte) 99, arg6) + var19;
            var21 = arg4 + arg9 - var23;
        }
        this.method2184(var22, arg0, var18, arg6, 0, null, arg11, var21);
        if (arg8 != null) {
            if (var23 == -1) {
                var23 = this.field5157.method3269((byte) 99, arg6) + var19;
            }
            arg8[3] = this.field5157.field8359 + this.field5157.field8371;
            arg8[2] = var23;
            arg8[1] = var22 - this.field5157.field8359;
            arg8[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;IIB)V")
    public final void method2191(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, byte arg6) {
        field5174++;
        if (arg3 == null) {
            return;
        }
        this.method2188(arg2, 1684, arg1);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        int var11 = 0;
        int var12 = 19 % ((-arg6 - 56) / 48);
        while (var8 > var11) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
            var11++;
        }
        this.method2184(arg0, null, var9, arg3, 0, var10, null, arg4 - (this.field5157.method3269((byte) 99, arg3) / 2));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZILjava/lang/String;II)V")
    public final void method2192(int arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5) {
        field5178++;
        if (arg3 != null) {
            this.method2188(arg0, 1684, arg4);
            if (arg1) {
                this.method2196(arg3, 0, 16739, null, null, null, arg2, 0, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[Lf;I[IIILjava/lang/String;)V")
    public final void method2193(int arg0, int arg1, class536[] arg2, int arg3, int[] arg4, int arg5, int arg6, String arg7) {
        if (arg0 != -4611) {
            this.method2185(49, 64, null, 121, null, 45, -71, 64, -85, 74, null, null, -18, 115, 47, -94);
        }
        field5163++;
        if (arg7 != null) {
            this.method2188(arg5, arg0 + 6295, arg1);
            this.method2196(arg7, 0, 16739, arg2, arg4, null, arg6, 0, arg3);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([ILjava/util/Random;[Lf;IIIILjava/lang/String;ZI)I")
    public final int method2194(int[] arg0, Random arg1, class536[] arg2, int arg3, int arg4, int arg5, int arg6, String arg7, boolean arg8, int arg9) {
        field5161++;
        if (arg7 == null) {
            return 0;
        }
        arg1.setSeed((long) arg9);
        int var11 = (arg1.nextInt() & 0x1F) + 192;
        this.method2188(var11 << 24 | arg4 & 0xFFFFFF, 1684, var11 << 24 | arg6 & 0xFFFFFF);
        int var12 = arg7.length();
        if (arg8) {
            field5168 = null;
        }
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg1.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2184(arg5, arg2, var13, arg7, 0, null, arg0, arg3);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILjava/lang/String;IIIII)V")
    public final void method2195(byte arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5152++;
        if (arg2 == null) {
            return;
        }
        if (arg0 <= 34) {
            this.method2196(null, -122, 59, null, null, null, -28, -76, 45);
        }
        this.method2188(arg5, 1684, arg4);
        double var9 = 7.0D - (double) arg6 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg2.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg1) * var9);
        }
        this.method2184(arg3, null, null, arg2, 0, var12, null, arg7 - (this.field5157.method3269((byte) 99, arg2) / 2));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;II[Lf;[ILua;III)V")
    private final void method2196(String arg0, int arg1, int arg2, class536[] arg3, int[] arg4, class600 arg5, int arg6, int arg7, int arg8) {
        field5160++;
        int var10 = arg8 - this.field5157.field8368;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg0.length();
        int var14 = 0;
        if (arg2 != 16739) {
            this.field5155 = null;
        }
        while (var14 < var13) {
            char var15 = (char) (class598.method3286((byte) 99, arg0.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                label106: {
                    if (var15 == '>' && var11 != -1) {
                        String var16 = arg0.substring(var11 + 1, var14);
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
                                        int var17 = class557.method3065(arg2 ^ 0x41E3, var16.substring(4));
                                        class536 var18 = arg3[var17];
                                        int var19 = arg4 == null ? var18.method166() : arg4[var17];
                                        if ((class231.field2889 & 0xFF000000) == -16777216) {
                                            var18.method155(arg6, this.field5157.field8368 + var10 - var19, 1, 0, 1);
                                        } else {
                                            var18.method155(arg6, var10 + this.field5157.field8368 - var19, 0, class231.field2889 & 0xFF000000 | 0xFFFFFF, 1);
                                        }
                                        arg6 += arg3[var17].method160();
                                        var12 = -1;
                                    } catch (Exception var21) {
                                    }
                                } else {
                                    this.method2186(var16, arg2 ^ 0x2605);
                                }
                                break label106;
                            }
                            var15 = '®';
                        }
                    }
                    if (var11 == -1) {
                        if (var12 != -1) {
                            arg6 += this.field5157.method3279(-54, var15, var12);
                        }
                        if (var15 == ' ') {
                            if (class242.field3017 > 0) {
                                class319.field4074 += class242.field3017;
                                arg6 += class319.field4074 >> 8;
                                class319.field4074 &= 0xFF;
                            }
                        } else if (arg5 == null) {
                            if ((class428.field5359 & 0xFF000000) != 0) {
                                this.method633(var15, arg6 + 1, var10 + 1, class428.field5359, true);
                            }
                            this.method633(var15, arg6, var10, class231.field2889, false);
                        } else {
                            if ((class428.field5359 & 0xFF000000) != 0) {
                                this.method634(var15, arg6 + 1, var10 + 1, class428.field5359, true, arg5, arg1, arg7);
                            }
                            this.method634(var15, arg6, var10, class231.field2889, false, arg5, arg1, arg7);
                        }
                        int var20 = this.field5157.method3268(var15, (byte) 120);
                        if (class86.field1207 != -1) {
                            this.field5155.method3114((int) ((double) this.field5157.field8368 * 0.7D) + var10, (byte) 11, arg6, var20, class86.field1207);
                        }
                        if (class642.field9043 != -1) {
                            this.field5155.method3114(this.field5157.field8368 + var10 + 1, (byte) 11, arg6, var20, class642.field9043);
                        }
                        arg6 += var20;
                        var12 = var15;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILua;Ljava/lang/String;IIZ[IIIII[Lf;IIIII)I")
    public final int method2197(int arg0, class600 arg1, String arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, class536[] arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field5153++;
        if (arg2 == null) {
            return 0;
        }
        this.method2188(arg4, 1684, arg0);
        if (arg8 == 0) {
            arg8 = this.field5157.field8368;
        }
        int[] var18;
        if ((this.field5157.field8371 + this.field5157.field8359 + arg8) > arg15 && arg15 < (arg8 + arg8)) {
            var18 = null;
        } else {
            var18 = new int[] { arg10 };
        }
        if (arg13 == -1) {
            arg13 = arg15 / arg8;
            if (arg13 <= 0) {
                arg13 = 1;
            }
        }
        int var19 = this.field5157.method3272(arg2, class394.field4956, -1, var18, arg11);
        if (arg13 > 0 && arg13 <= var19) {
            var19 = arg13;
            class394.field4956[arg13 - 1] = this.field5157.method3270((byte) -77, arg11, class394.field4956[arg13 - 1], arg10);
        }
        if (!arg5) {
            this.method2193(92, 67, null, 113, null, -46, 119, null);
        }
        if (arg14 == 3 && var19 == 1) {
            arg14 = 1;
        }
        int var20;
        if (arg14 == 0) {
            var20 = this.field5157.field8359 + arg3;
        } else if (arg14 == 1) {
            var20 = (arg15 - ((var19 - 1) * arg8) - this.field5157.field8359 - this.field5157.field8371) / 2 + this.field5157.field8359 + arg3;
        } else if (arg14 == 2) {
            var20 = arg3 + arg15 - (this.field5157.field8371 - -((var19 - 1) * arg8));
        } else {
            int var21 = (arg15 - ((var19 - 1) * arg8) - this.field5157.field8371 - this.field5157.field8359) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg8 += var21;
            var20 = arg3 + var21 + this.field5157.field8359;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg16 == 0) {
                this.method2196(class394.field4956[var22], arg7, 16739, arg11, arg6, arg1, arg9, arg12, var20);
            } else if (arg16 == 1) {
                this.method2196(class394.field4956[var22], arg7, 16739, arg11, arg6, arg1, (arg10 - this.field5157.method3269((byte) 99, class394.field4956[var22])) / 2 + arg9, arg12, var20);
            } else if (arg16 == 2) {
                this.method2196(class394.field4956[var22], arg7, 16739, arg11, arg6, arg1, arg9 + arg10 - this.field5157.method3269((byte) 99, class394.field4956[var22]), arg12, var20);
            } else if (var19 - 1 == var22) {
                this.method2196(class394.field4956[var22], arg7, 16739, arg11, arg6, arg1, arg9, arg12, var20);
            } else {
                this.method2201(arg10, (byte) 122, class394.field4956[var22]);
                this.method2196(class394.field4956[var22], arg7, 16739, arg11, arg6, arg1, arg9, arg12, var20);
                class242.field3017 = 0;
            }
            var20 += arg8;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public final void method2198(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field5165++;
        if (arg5 >= -49) {
            field5162 = 11;
        }
        if (arg2 != null) {
            this.method2188(arg3, 1684, arg4);
            this.method2196(arg2, 0, 16739, null, null, null, arg0 - this.field5157.method3269((byte) 99, arg2), 0, arg1);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public final void method2199(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field5159++;
        if (arg5 != null) {
            this.method2188(arg0, arg1 ^ 0xFFFFF9E6, arg3);
            if (arg1 == -142) {
                this.method2196(arg5, 0, arg1 ^ 0xFFFFBE11, null, null, null, arg2 - this.field5157.method3269((byte) 99, arg5) / 2, 0, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILes;)Liea;")
    public static final class130 method2200(int arg0, class630 arg1) {
        field5167++;
        class414 var2 = class349.method1929((byte) 87)[arg1.method3501(-9268)];
        class29 var3 = class20.method132(63)[arg1.method3501(-9268)];
        int var4 = arg1.method3510(58);
        int var5 = arg1.method3510(80);
        int var6 = arg1.method3470(13111);
        int var7 = arg1.method3470(13111);
        int var8 = arg1.method3510(88);
        int var9 = 44 / ((-arg0 - 15) / 55);
        int var10 = arg1.method3483(58);
        int var11 = arg1.method3483(77);
        return new class130(var2, var3, var4, var5, var6, var7, var8, var10, var11);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lr;Lsa;)V")
    public class413(class566 arg0, class595 arg1) {
        this.field5155 = arg0;
        this.field5157 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBLjava/lang/String;)V")
    private final void method2201(int arg0, byte arg1, String arg2) {
        field5177++;
        if (arg1 != 122) {
            field5172 = false;
        }
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
            class242.field3017 = (arg0 - this.field5157.method3269((byte) 99, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIZIII)Z")
    public static final boolean method2202(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field5154++;
        int var9 = class376.field4748.field9758[0];
        int var10 = class376.field4748.field9754[0];
        if (var9 < 0 || class431.field5395 <= var9 || var10 < 0 || class452.field5802 <= var10) {
            return false;
        } else if (arg6 >= 0 && class431.field5395 > arg6 && arg7 >= 0 && class452.field5802 > arg7) {
            int var11 = class395.method2116(class410.field5129, arg3, var9, arg1, arg7, arg5, arg8, class154.field1991[class376.field4748.field6470], var10, arg6, true, class376.field4748.method2785(arg0 - 2), class105.field1407, arg2, arg4);
            if (var11 < 1) {
                return false;
            }
            class309.field3946 = class105.field1407[var11 - 1];
            class436.field5446 = class410.field5129[var11 - arg0];
            class520.field7095 = false;
            class464.method2466(true);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLua;II)V")
    public abstract void method634(char arg0, int arg1, int arg2, int arg3, boolean arg4, class600 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method2203(int arg0) {
        field5164 = null;
        if (arg0 != 3) {
            method2203(-22);
        }
        field5168 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
    public final void method2204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field5156++;
        if (arg6 == null) {
            return;
        }
        this.method2188(arg4, 1684, arg2);
        int var8 = arg6.length();
        if (arg5 != 15242) {
            this.method2199(-67, -7, 63, 72, 103, null);
        }
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2184(arg1, null, null, arg6, 0, var9, null, arg0 - (this.field5157.method3269((byte) 99, arg6) / 2));
    }
}
