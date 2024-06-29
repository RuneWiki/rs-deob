import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class194 {

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lmj;")
    private class599 field2861;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Loa;")
    private class638 field2869;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Luc;")
    public static class27 field2874 = new class27(21, -1);

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "F")
    public static float field2876 = 0.25F;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "[I")
    public static int[] field2877 = new int[1];

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "Luc;")
    public static class27 field2878 = new class27(66, 3);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "[J")
    public static long[] field2875;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[Lxa;IILjava/lang/String;IZ[IIILfa;IIIII)I")
    public final int method1299(int arg0, int arg1, class461[] arg2, int arg3, int arg4, String arg5, int arg6, boolean arg7, int[] arg8, int arg9, int arg10, class212 arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field2871++;
        if (arg5 == null) {
            return 0;
        }
        this.method1302(-1, arg3, arg1);
        if (arg14 == 0) {
            arg14 = this.field2861.field8295;
        }
        if (arg7) {
            return 16;
        }
        int[] var18;
        if ((this.field2861.field8307 + arg14 + this.field2861.field8301) > arg0 && (arg14 + arg14) > arg0) {
            var18 = null;
        } else {
            var18 = new int[] { arg4 };
        }
        int var19 = this.field2861.method3319(class307.field4508, arg5, arg2, var18, 29169);
        if (arg12 == -1) {
            arg12 = arg0 / arg14;
            if (arg12 <= 0) {
                arg12 = 1;
            }
        }
        if (arg12 > 0 && arg12 <= var19) {
            var19 = arg12;
            class307.field4508[arg12 - 1] = this.field2861.method3317(class307.field4508[arg12 - 1], 19062, arg2, arg4);
        }
        if (arg16 == 3 && var19 == 1) {
            arg16 = 1;
        }
        int var20;
        if (arg16 == 0) {
            var20 = this.field2861.field8307 + arg13;
        } else if (arg16 == 1) {
            var20 = arg13 + ((arg0 - ((var19 - 1) * arg14) - this.field2861.field8307 - this.field2861.field8301) / 2) + this.field2861.field8307;
        } else if (arg16 == 2) {
            var20 = arg13 + arg0 - (var19 - 1) * arg14 - this.field2861.field8301;
        } else {
            int var21 = (arg0 - this.field2861.field8307 - ((var19 - 1) * arg14) - this.field2861.field8301) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg14 += var21;
            var20 = this.field2861.field8307 + var21 + arg13;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg15 == 0) {
                this.method1315((byte) 34, arg11, arg2, arg6, class307.field4508[var22], arg10, var20, arg9, arg8);
            } else if (arg15 == 1) {
                this.method1315((byte) 107, arg11, arg2, arg6 + (arg4 - this.field2861.method3314(class307.field4508[var22], 70)) / 2, class307.field4508[var22], arg10, var20, arg9, arg8);
            } else if (arg15 == 2) {
                this.method1315((byte) 38, arg11, arg2, arg4 + (arg6 - this.field2861.method3314(class307.field4508[var22], 17)), class307.field4508[var22], arg10, var20, arg9, arg8);
            } else if ((var19 - 1) == var22) {
                this.method1315((byte) 70, arg11, arg2, arg6, class307.field4508[var22], arg10, var20, arg9, arg8);
            } else {
                this.method1314(-122, class307.field4508[var22], arg4);
                this.method1315((byte) 85, arg11, arg2, arg6, class307.field4508[var22], arg10, var20, arg9, arg8);
                class442.field6226 = 0;
            }
            var20 += arg14;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public final void method1300(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field2879++;
        if (arg4 != null && arg2 < -101) {
            this.method1302(-1, arg5, arg3);
            this.method1315((byte) 102, null, null, arg1 - this.field2861.method3314(arg4, -82), arg4, 0, arg0, 0, null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method1301(int arg0) {
        field2874 = null;
        field2877 = null;
        if (arg0 != -1277497864) {
            method1301(-8);
        }
        field2878 = null;
        field2875 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
    private final void method1302(int arg0, int arg1, int arg2) {
        class336.field4906 = arg0;
        field2857++;
        class520.field7078 = 0;
        class646.field9173 = arg2;
        class195.field2883 = arg2;
        class667.field9384 = -1;
        class442.field6226 = 0;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class398.field5525 = arg1;
        class679.field9564 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)Z")
    public static final boolean method1303(byte arg0, int arg1, int arg2) {
        if (arg0 != -128) {
            field2874 = null;
        }
        field2864++;
        return class385.method2214(true, arg1, arg2) | (arg2 & 0x800) != 0 || class298.method1859(arg1, 19308, arg2);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method1304(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field2872++;
        if (arg2 == null) {
            return;
        }
        if (arg1 != -1) {
            this.method1314(109, null, 3);
        }
        this.method1302(arg1, arg6, arg3);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1313(arg4, arg2, null, arg0 - (this.field2861.method3314(arg2, 107) / 2), null, 1, null, var9);
    }

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
    public abstract void method55(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;ZII)V")
    public final void method1305(int arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5) {
        field2860++;
        if (arg2 == null) {
            return;
        }
        this.method1302(-1, arg5, arg0);
        if (!arg3) {
            this.method1302(44, 67, 52);
        }
        this.method1315((byte) 46, null, null, arg4 - (this.field2861.method3314(arg2, -89) / 2), arg2, 0, arg1, 0, null);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lxa;IBIILjava/util/Random;[IILjava/lang/String;I)I")
    public final int method1306(class461[] arg0, int arg1, byte arg2, int arg3, int arg4, Random arg5, int[] arg6, int arg7, String arg8, int arg9) {
        field2880++;
        if (arg8 == null) {
            return 0;
        }
        arg5.setSeed((long) arg9);
        int var11 = (arg5.nextInt() & 0x1F) + 192;
        this.method1302(-1, var11 << 24 | arg4 & 0xFFFFFF, arg7 & 0xFFFFFF | var11 << 24);
        int var12 = arg8.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg5.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1313(arg3, arg8, arg0, arg1, arg6, 1, var13, null);
        int var16 = 46 % ((8 - arg2) / 53);
        return var14;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBIILjava/lang/String;I)V")
    public final void method1307(int arg0, byte arg1, int arg2, int arg3, String arg4, int arg5) {
        field2859++;
        if (arg1 < 121) {
            field2875 = null;
        }
        if (arg4 != null) {
            this.method1302(-1, arg2, arg3);
            this.method1315((byte) 87, null, null, arg5, arg4, 0, arg0, 0, null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBIIILjava/util/Random;[IIILjava/lang/String;III[Lxa;[I)I")
    public final int method1308(int arg0, byte arg1, int arg2, int arg3, int arg4, Random arg5, int[] arg6, int arg7, int arg8, String arg9, int arg10, int arg11, int arg12, class461[] arg13, int[] arg14) {
        field2868++;
        if (arg9 == null) {
            return 0;
        }
        if (arg1 > -41) {
            this.method1316(32, 107, 127, 53, -20, 18, null, -47);
        }
        arg5.setSeed((long) arg3);
        int var16 = (arg5.nextInt() & 0x1F) + 192;
        this.method1302(-1, arg8 & 0xFFFFFF | var16 << 24, arg7 & 0xFFFFFF | var16 << 24);
        int var17 = arg9.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg5.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg4;
        int var22 = this.field2861.field8307 + arg11;
        if (arg12 == 1) {
            var22 += (arg0 - (this.field2861.field8307 + this.field2861.field8301)) / 2;
        } else if (arg12 == 2) {
            var22 = arg0 + arg11 - this.field2861.field8301;
        }
        int var23 = -1;
        if (arg10 == 1) {
            var23 = this.field2861.method3314(arg9, 97) + var19;
            var21 = (arg2 - var23) / 2 + arg4;
        } else if (arg10 == 2) {
            var23 = var19 + this.field2861.method3314(arg9, -104);
            var21 = arg2 + arg4 - var23;
        }
        this.method1313(var22, arg9, arg13, var21, arg6, 1, var18, null);
        if (arg14 != null) {
            if (var23 == -1) {
                var23 = this.field2861.method3314(arg9, 84) + var19;
            }
            arg14[0] = var21;
            arg14[2] = var23;
            arg14[1] = var22 - this.field2861.field8307;
            arg14[3] = this.field2861.field8307 + this.field2861.field8301;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIBLjava/lang/String;I)V")
    public final void method1309(int arg0, int arg1, int arg2, int arg3, byte arg4, String arg5, int arg6) {
        field2858++;
        if (arg5 == null) {
            return;
        }
        this.method1302(-1, arg1, arg0);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        int var10 = 116 / ((arg4 + 27) / 33);
        int[] var11 = new int[var8];
        for (int var12 = 0; var12 < var8; var12++) {
            var9[var12] = (int) (Math.sin((double) arg2 / 5.0D + (double) var12 / 5.0D) * 5.0D);
            var11[var12] = (int) (Math.sin((double) arg2 / 5.0D + (double) var12 / 3.0D) * 5.0D);
        }
        this.method1313(arg3, arg5, null, arg6 - (this.field2861.method3314(arg5, -79) / 2), null, 1, var9, var11);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILfa;Ljava/lang/String;I[IIIBIII[Lxa;IIII)I")
    public final int method1310(int arg0, class212 arg1, String arg2, int arg3, int[] arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, class461[] arg11, int arg12, int arg13, int arg14, int arg15) {
        if (arg7 != 95) {
            this.method59('\t', -61, -101, 104, false, null, -54, -111);
        }
        field2870++;
        return this.method1299(arg3, arg12, arg11, arg9, arg8, arg2, arg14, false, arg4, arg5, arg15, arg1, 0, arg13, arg10, arg0, arg6);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLfa;II)V")
    public abstract void method59(char arg0, int arg1, int arg2, int arg3, boolean arg4, class212 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;[IIII[Lxa;I)V")
    public final void method1311(int arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, class461[] arg6, int arg7) {
        field2873++;
        if (arg1 != null) {
            this.method1302(-1, arg7, arg0);
            this.method1315((byte) 19, null, arg6, arg5, arg1, arg3, arg4, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    private final void method1312(String arg0, boolean arg1) {
        if (!arg1) {
            this.method55((char) 65508, -108, 113, 35, false);
        }
        field2863++;
        try {
            if (arg0.startsWith("col=")) {
                class195.field2883 = class195.field2883 & 0xFF000000 | class475.method2702((byte) 1, arg0.substring(4), 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class195.field2883 = class646.field9173 & 0xFFFFFF | class195.field2883 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class195.field2883 = class475.method2702((byte) 1, arg0.substring(5), 16);
            } else if (arg0.equals("/argb")) {
                class195.field2883 = class646.field9173;
            } else if (arg0.startsWith("str=")) {
                class336.field4906 = class195.field2883 & 0xFF000000 | class475.method2702((byte) 1, arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                class336.field4906 = class195.field2883 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class336.field4906 = -1;
            } else if (arg0.startsWith("u=")) {
                class667.field9384 = class195.field2883 & 0xFF000000 | class475.method2702((byte) 1, arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                class667.field9384 = class195.field2883 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class667.field9384 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class679.field9564 = 0;
            } else if (arg0.startsWith("shad=")) {
                class679.field9564 = class195.field2883 & 0xFF000000 | class475.method2702((byte) 1, arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                class679.field9564 = class195.field2883 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class679.field9564 = class398.field5525;
            } else if (arg0.equals("br")) {
                this.method1302(-1, class398.field5525, class646.field9173);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;[Lxa;I[II[I[I)V")
    private final void method1313(int arg0, String arg1, class461[] arg2, int arg3, int[] arg4, int arg5, int[] arg6, int[] arg7) {
        if (arg5 != 1) {
            return;
        }
        int var9 = arg0 - this.field2861.field8295;
        field2867++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class417.method2382(arg1.charAt(var14), (byte) 71) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg1.substring(var10 + 1, var14);
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
                                    if (arg6 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg6[var12];
                                    }
                                    int var18;
                                    if (arg7 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg7[var12];
                                    }
                                    var12++;
                                    int var19 = class551.method3028(4, var16.substring(4));
                                    class461 var20 = arg2[var19];
                                    int var21 = arg4 == null ? var20.method29() : arg4[var19];
                                    var20.method30(arg3 + var17, this.field2861.field8295 + var9 + -var21 + var18, 1, 0, 1);
                                    var11 = -1;
                                    arg3 += arg2[var19].method33();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1312(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg3 += this.field2861.method3323(var11, var15, 0);
                    }
                    int var22;
                    if (arg6 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg6[var12];
                    }
                    int var23;
                    if (arg7 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg7[var12];
                    }
                    if (var15 != ' ') {
                        if ((class679.field9564 & 0xFF000000) != 0) {
                            this.method55(var15, arg3 + var22 + 1, var9 + 1 + var23, class679.field9564, true);
                        }
                        this.method55(var15, arg3 + var22, var9 + var23, class195.field2883, false);
                    } else if (class442.field6226 > 0) {
                        class520.field7078 += class442.field6226;
                        arg3 += class520.field7078 >> 8;
                        class520.field7078 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field2861.method3316(var15, 79);
                    if (class336.field4906 != -1) {
                        this.field2869.method3555(var9 + ((int) ((double) this.field2861.field8295 * 0.7D)), var24, true, arg3, class336.field4906);
                    }
                    if (class667.field9384 != -1) {
                        this.field2869.method3555(this.field2861.field8295 + var9, var24, true, arg3, class667.field9384);
                    }
                    var11 = var15;
                    arg3 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Loa;Lmj;)V")
    public class194(class638 arg0, class599 arg1) {
        this.field2861 = arg1;
        this.field2869 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private final void method1314(int arg0, String arg1, int arg2) {
        field2866++;
        int var4 = 0;
        boolean var5 = false;
        int var6 = 0;
        if (arg0 > -120) {
            this.method55((char) 65460, -74, 12, -56, true);
        }
        while (var6 < arg1.length()) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
            var6++;
        }
        if (var4 > 0) {
            class442.field6226 = (arg2 - this.field2861.method3314(arg1, -84) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLfa;[Lxa;ILjava/lang/String;III[I)V")
    private final void method1315(byte arg0, class212 arg1, class461[] arg2, int arg3, String arg4, int arg5, int arg6, int arg7, int[] arg8) {
        int var10 = arg6 - this.field2861.field8295;
        field2865++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg4.length();
        if (arg0 <= 11) {
            this.field2861 = null;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class417.method2382(arg4.charAt(var14), (byte) 71) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg4.substring(var11 + 1, var14);
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
                                    int var17 = class551.method3028(4, var16.substring(4));
                                    class461 var18 = arg2[var17];
                                    int var19 = arg8 == null ? var18.method29() : arg8[var17];
                                    if ((class195.field2883 & 0xFF000000) == -16777216) {
                                        var18.method30(arg3, this.field2861.field8295 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method30(arg3, var10 + this.field2861.field8295 - var19, 0, class195.field2883 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg3 += arg2[var17].method33();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1312(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg3 += this.field2861.method3323(var12, var15, 0);
                    }
                    if (var15 == ' ') {
                        if (class442.field6226 > 0) {
                            class520.field7078 += class442.field6226;
                            arg3 += class520.field7078 >> 8;
                            class520.field7078 &= 0xFF;
                        }
                    } else if (arg1 == null) {
                        if ((class679.field9564 & 0xFF000000) != 0) {
                            this.method55(var15, arg3 + 1, var10 + 1, class679.field9564, true);
                        }
                        this.method55(var15, arg3, var10, class195.field2883, false);
                    } else {
                        if ((class679.field9564 & 0xFF000000) != 0) {
                            this.method59(var15, arg3 + 1, var10 + 1, class679.field9564, true, arg1, arg5, arg7);
                        }
                        this.method59(var15, arg3, var10, class195.field2883, false, arg1, arg5, arg7);
                    }
                    int var20 = this.field2861.method3316(var15, 74);
                    if (class336.field4906 != -1) {
                        this.field2869.method3555(var10 + ((int) ((double) this.field2861.field8295 * 0.7D)), var20, true, arg3, class336.field4906);
                    }
                    if (class667.field9384 != -1) {
                        this.field2869.method3555(this.field2861.field8295 + var10 + 1, var20, true, arg3, class667.field9384);
                    }
                    var12 = var15;
                    arg3 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
    public final void method1316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field2862++;
        if (arg6 == null) {
            return;
        }
        this.method1302(-1, arg5, arg4);
        double var9 = 7.0D - (double) arg0 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg6.length();
        int[] var12 = new int[var11];
        for (int var13 = arg7; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg2) * var9);
        }
        this.method1313(arg3, arg6, null, arg1 - this.field2861.method3314(arg6, 92) / 2, null, 1, null, var12);
    }
}
