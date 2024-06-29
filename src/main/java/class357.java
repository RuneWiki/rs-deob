import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class357 {

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "Lk;")
    private class337 field4884;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Luo;")
    private class345 field4879;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field4889 = 12;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field4883 = 0;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "Lkn;")
    public static class442 field4887 = new class442("K", "T", "K", "K");

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public static int field4897 = 0;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static final String method2282(boolean arg0, long arg1) {
        field4895++;
        if (!arg0) {
            field4897 = 104;
        }
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class420.field5948[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BIIILjava/lang/String;I)V")
    public final void method2283(byte arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field4893++;
        if (arg4 == null) {
            return;
        }
        this.method2298(arg5, false, arg3);
        if (arg0 > -27) {
            this.method2291((byte) 45, 2, -116, 19, (class226[]) null, (int[]) null, -71, -3, (Random) null, (String) null);
        }
        this.method2299((class226[]) null, 0, 1, (int[]) null, arg1 - (this.field4884.method2156(arg4, 60) / 2), (class241) null, arg4, 0, arg2);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public final void method2284(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field4880++;
        if (arg5 != null) {
            this.method2298(arg3, false, arg4);
            this.method2299((class226[]) null, 0, 1, (int[]) null, arg0 - this.field4884.method2156(arg5, 60), (class241) null, arg5, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public static void method2285(boolean arg0) {
        field4887 = null;
        if (arg0) {
            method2282(true, -124L);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILjava/lang/String;IIB)V")
    public final void method2286(int arg0, int arg1, String arg2, int arg3, int arg4, byte arg5) {
        field4892++;
        if (arg5 > -49) {
            this.field4879 = null;
        }
        if (arg2 != null) {
            this.method2298(arg4, false, arg0);
            this.method2299((class226[]) null, 0, 1, (int[]) null, arg3, (class241) null, arg2, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIILjava/lang/String;ZIIII[IILep;[Lsg;)I")
    public final int method2287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13, class241 arg14, class226[] arg15) {
        field4882++;
        if (arg6 == null) {
            return 0;
        }
        this.method2298(arg3, arg7, arg0);
        if (arg10 == 0) {
            arg10 = this.field4884.field4625;
        }
        int[] var17;
        if (arg8 < (this.field4884.field4633 + arg10 + this.field4884.field4632) && arg8 < arg10 + arg10) {
            var17 = null;
        } else {
            var17 = new int[] { arg2 };
        }
        int var18 = this.field4884.method2153(var17, true, arg6, class126.field1781, arg15);
        if (arg4 == 3 && var18 == 1) {
            arg4 = 1;
        }
        int var19;
        if (arg4 == 0) {
            var19 = arg5 + this.field4884.field4633;
        } else if (arg4 == 1) {
            var19 = this.field4884.field4633 + arg5 + ((-((var18 - 1) * arg10) + arg8 + -this.field4884.field4633 - this.field4884.field4632) / 2);
        } else if (arg4 == 2) {
            var19 = arg8 + arg5 - this.field4884.field4632 - ((var18 - 1) * arg10);
        } else {
            int var20 = (arg8 - this.field4884.field4633 - ((var18 + -1) * arg10 + this.field4884.field4632)) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var19 = arg5 + var20 + this.field4884.field4633;
            arg10 += var20;
        }
        if (arg7) {
            return -18;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg9 == 0) {
                this.method2299(arg15, arg11, 1, arg12, arg13, arg14, class126.field1781[var21], arg1, var19);
            } else if (arg9 == 1) {
                this.method2299(arg15, arg11, 1, arg12, arg13 + (arg2 - this.field4884.method2156(class126.field1781[var21], 60)) / 2, arg14, class126.field1781[var21], arg1, var19);
            } else if (arg9 == 2) {
                this.method2299(arg15, arg11, 1, arg12, arg13 + arg2 - this.field4884.method2156(class126.field1781[var21], 60), arg14, class126.field1781[var21], arg1, var19);
            } else if (var18 - 1 == var21) {
                this.method2299(arg15, arg11, 1, arg12, arg13, arg14, class126.field1781[var21], arg1, var19);
            } else {
                this.method2288(class126.field1781[var21], arg2, (byte) 61);
                this.method2299(arg15, arg11, 1, arg12, arg13, arg14, class126.field1781[var21], arg1, var19);
                class188.field2597 = 0;
            }
            var19 += arg10;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    private final void method2288(String arg0, int arg1, byte arg2) {
        field4877++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg0.length() > var6; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class188.field2597 = (arg1 - this.field4884.method2156(arg0, 60) << 8) / var4;
        }
        if (arg2 < 22) {
            this.field4884 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILjava/lang/String;ZIII)V")
    public final void method2289(int arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field4878++;
        if (!arg3 || arg2 == null) {
            return;
        }
        this.method2298(arg5, false, arg4);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2296(arg6, (int[]) null, arg2, (class226[]) null, -8, var10, arg1 - (this.field4884.method2156(arg2, 60) / 2), var9);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/util/Random;ILjava/lang/String;IIIIII[Lsg;[I[III)I")
    public final int method2290(int arg0, Random arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class226[] arg10, int[] arg11, int[] arg12, int arg13, int arg14) {
        field4873++;
        if (arg3 == null) {
            return 0;
        }
        arg1.setSeed((long) arg14);
        int var16 = (arg1.nextInt() & 0x1F) + 192;
        this.method2298(var16 << 24 | arg2 & 0xFFFFFF, false, var16 << 24 | arg7 & 0xFFFFFF);
        if (arg4 <= 46) {
            return -124;
        }
        int var17 = arg3.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg1.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg6;
        int var22 = this.field4884.field4633 + arg5;
        int var23 = -1;
        if (arg13 == 1) {
            var22 += (arg8 - this.field4884.field4633 - this.field4884.field4632) / 2;
        } else if (arg13 == 2) {
            var22 = arg5 + arg8 - this.field4884.field4632;
        }
        if (arg0 == 1) {
            var23 = var19 + this.field4884.method2156(arg3, 60);
            var21 = (arg9 - var23) / 2 + arg6;
        } else if (arg0 == 2) {
            var23 = var19 + this.field4884.method2156(arg3, 60);
            var21 = arg9 + arg6 - var23;
        }
        this.method2296(var22, arg11, arg3, arg10, 122, (int[]) null, var21, var18);
        if (arg12 != null) {
            if (var23 == -1) {
                var23 = this.field4884.method2156(arg3, 60) + var19;
            }
            arg12[2] = var23;
            arg12[1] = var22 - this.field4884.field4633;
            arg12[0] = var21;
            arg12[3] = this.field4884.field4633 + this.field4884.field4632;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BIII[Lsg;[IIILjava/util/Random;Ljava/lang/String;)I")
    public final int method2291(byte arg0, int arg1, int arg2, int arg3, class226[] arg4, int[] arg5, int arg6, int arg7, Random arg8, String arg9) {
        field4886++;
        if (arg9 == null) {
            return 0;
        }
        arg8.setSeed((long) arg2);
        int var11 = (arg8.nextInt() & 0x1F) + 192;
        if (arg0 > -112) {
            field4897 = -127;
        }
        this.method2298(var11 << 24 | arg3 & 0xFFFFFF, false, var11 << 24 | arg1 & 0xFFFFFF);
        int var12 = arg9.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg8.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2296(arg7, arg5, arg9, arg4, -110, (int[]) null, arg6, var13);
        return var14;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/lang/String;)V")
    private final void method2292(int arg0, String arg1) {
        field4896++;
        try {
            if (arg1.startsWith("col=")) {
                class5.field68 = class5.field68 & 0xFF000000 | class124.method841(arg1.substring(4), 16, (byte) -3) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class5.field68 = class404.field5732 & 0xFFFFFF | class5.field68 & 0xFF000000;
            }
            if (arg0 != 3051) {
                field4889 = 61;
            }
            if (arg1.startsWith("argb=")) {
                class5.field68 = class124.method841(arg1.substring(5), 16, (byte) -3);
            } else if (arg1.equals("/argb")) {
                class5.field68 = class404.field5732;
            } else if (arg1.startsWith("str=")) {
                class397.field5682 = class124.method841(arg1.substring(4), 16, (byte) -3) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class397.field5682 = -8388608;
            } else if (arg1.equals("/str")) {
                class397.field5682 = -1;
            } else if (arg1.startsWith("u=")) {
                class116.field1667 = class124.method841(arg1.substring(2), 16, (byte) -3) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class116.field1667 = -16777216;
            } else if (arg1.equals("/u")) {
                class116.field1667 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class203.field2785 = 0;
            } else if (arg1.startsWith("shad=")) {
                class203.field2785 = class124.method841(arg1.substring(5), 16, (byte) -3) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class203.field2785 = -16777216;
            } else if (arg1.equals("/shad")) {
                class203.field2785 = class204.field2809;
                return;
            } else if (arg1.equals("br")) {
                this.method2298(class404.field5732, false, class204.field2809);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(CIIIZLep;II)V")
    public abstract void method1410(char arg0, int arg1, int arg2, int arg3, boolean arg4, class241 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method2293(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4874++;
        if (arg0 == null) {
            return;
        }
        this.method2298(arg4, false, arg5);
        int var8 = -120 % ((-arg3 - 6) / 52);
        int var9 = arg0.length();
        int[] var10 = new int[var9];
        for (int var11 = 0; var11 < var9; var11++) {
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 2.0D) * 5.0D);
        }
        this.method2296(arg2, (int[]) null, arg0, (class226[]) null, -54, var10, arg1 - this.field4884.method2156(arg0, 60) / 2, (int[]) null);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Luo;Lk;)V")
    public class357(class345 arg0, class337 arg1) {
        this.field4884 = arg1;
        this.field4879 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lkh;I)Ljava/lang/String;")
    public static final String method2294(class11 arg0, int arg1) {
        if (arg1 != 16) {
            method2294((class11) null, -85);
        }
        field4885++;
        return class204.method1324(32767, (byte) -83, arg0);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
    public final void method2295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field4888++;
        if (arg7 == null) {
            return;
        }
        this.method2298(arg3, false, arg6);
        double var9 = 7.0D - (double) arg2 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg0) * var9);
        }
        this.method2296(arg1, (int[]) null, arg7, (class226[]) null, arg4 ^ 0xFFFF8CC0, var12, arg5 - this.field4884.method2156(arg7, 60) / 2, (int[]) null);
        if (arg4 != -29507) {
            method2285(false);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[ILjava/lang/String;[Lsg;I[II[I)V")
    private final void method2296(int arg0, int[] arg1, String arg2, class226[] arg3, int arg4, int[] arg5, int arg6, int[] arg7) {
        field4876++;
        int var9 = arg0 - this.field4884.field4625;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg2.length();
        int var14 = 0;
        int var15 = 60 / ((arg4 - 62) / 60);
        while (var14 < var13) {
            char var16 = (char) (class14.method232(21381, arg2.charAt(var14)) & 0xFF);
            if (var16 == '<') {
                var10 = var14;
            } else {
                label112: {
                    if (var16 == '>' && var10 != -1) {
                        String var17 = arg2.substring(var10 + 1, var14);
                        var10 = -1;
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
                                        int var18;
                                        if (arg7 == null) {
                                            var18 = 0;
                                        } else {
                                            var18 = arg7[var12];
                                        }
                                        int var19;
                                        if (arg5 == null) {
                                            var19 = 0;
                                        } else {
                                            var19 = arg5[var12];
                                        }
                                        var12++;
                                        int var20 = class66.method512((byte) 118, var17.substring(4));
                                        class226 var21 = arg3[var20];
                                        int var22 = arg1 == null ? var21.method596() : arg1[var20];
                                        var21.method587(arg6 + var18, -var22 + var9 + var19 + this.field4884.field4625, 0, 0, 1);
                                        arg6 += arg3[var20].method597();
                                        var11 = -1;
                                    } catch (Exception var26) {
                                    }
                                } else {
                                    this.method2292(3051, var17);
                                }
                                break label112;
                            }
                            var16 = '®';
                        }
                    }
                    if (var10 == -1) {
                        if (var11 != -1) {
                            arg6 += this.field4884.method2151(var16, 0, var11);
                        }
                        int var23;
                        if (arg7 == null) {
                            var23 = 0;
                        } else {
                            var23 = arg7[var12];
                        }
                        int var24;
                        if (arg5 == null) {
                            var24 = 0;
                        } else {
                            var24 = arg5[var12];
                        }
                        var12++;
                        if (var16 != ' ') {
                            if ((class203.field2785 & 0xFF000000) != 0) {
                                this.method1411(var16, arg6 + var23 + 1, var9 + 1 + var24, class203.field2785, true);
                            }
                            this.method1411(var16, arg6 + var23, var9 + var24, class5.field68, false);
                        } else if (class188.field2597 > 0) {
                            class442.field6206 += class188.field2597;
                            arg6 += class442.field6206 >> 8;
                            class442.field6206 &= 0xFF;
                        }
                        int var25 = this.field4884.method2159(var16, 6741);
                        if (class397.field5682 != -1) {
                            this.field4879.method2189((byte) -83, var25, (int) ((double) this.field4884.field4625 * 0.7D) + var9, class397.field5682, arg6);
                        }
                        if (class116.field1667 != -1) {
                            this.field4879.method2189((byte) -82, var25, this.field4884.field4625 + var9, class116.field1667, arg6);
                        }
                        var11 = var16;
                        arg6 += var25;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III[Lsg;I[IILjava/lang/String;)V")
    public final void method2297(int arg0, int arg1, int arg2, class226[] arg3, int arg4, int[] arg5, int arg6, String arg7) {
        field4891++;
        if (arg7 != null) {
            this.method2298(arg0, false, arg2);
            if (arg1 <= -61) {
                this.method2299(arg3, 0, 1, arg5, arg4, (class241) null, arg7, 0, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZI)V")
    private final void method2298(int arg0, boolean arg1, int arg2) {
        class442.field6206 = 0;
        field4875++;
        class404.field5732 = arg0;
        class5.field68 = arg0;
        if (arg2 == -1) {
            arg2 = 0;
        }
        class116.field1667 = -1;
        if (!arg1) {
            class188.field2597 = 0;
            class397.field5682 = -1;
            class204.field2809 = arg2;
            class203.field2785 = arg2;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([Lsg;II[IILep;Ljava/lang/String;II)V")
    private final void method2299(class226[] arg0, int arg1, int arg2, int[] arg3, int arg4, class241 arg5, String arg6, int arg7, int arg8) {
        field4894++;
        int var10 = arg8 - this.field4884.field4625;
        int var11 = -1;
        if (arg2 != 1) {
            this.method2299((class226[]) null, -113, -123, (int[]) null, -30, (class241) null, (String) null, -8, -83);
        }
        int var12 = -1;
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class14.method232(21381, arg6.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg6.substring(var11 + 1, var14);
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
                                    int var17 = class66.method512((byte) 118, var16.substring(4));
                                    class226 var18 = arg0[var17];
                                    int var19 = arg3 == null ? var18.method596() : arg3[var17];
                                    if ((class5.field68 & 0xFF000000) == -16777216) {
                                        var18.method587(arg4, var10 - (var19 - this.field4884.field4625), 0, 0, 1);
                                    } else {
                                        var18.method587(arg4, var10 - (var19 - this.field4884.field4625), 1, class5.field68 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg4 += arg0[var17].method597();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2292(3051, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg4 += this.field4884.method2151(var15, arg2 ^ 0x1, var12);
                    }
                    if (var15 == ' ') {
                        if (class188.field2597 > 0) {
                            class442.field6206 += class188.field2597;
                            arg4 += class442.field6206 >> 8;
                            class442.field6206 &= 0xFF;
                        }
                    } else if (arg5 == null) {
                        if ((class203.field2785 & 0xFF000000) != 0) {
                            this.method1411(var15, arg4 + 1, var10 + 1, class203.field2785, true);
                        }
                        this.method1411(var15, arg4, var10, class5.field68, false);
                    } else {
                        if ((class203.field2785 & 0xFF000000) != 0) {
                            this.method1410(var15, arg4 + 1, var10 - -1, class203.field2785, true, arg5, arg1, arg7);
                        }
                        this.method1410(var15, arg4, var10, class5.field68, false, arg5, arg1, arg7);
                    }
                    int var20 = this.field4884.method2159(var15, 6741);
                    if (class397.field5682 != -1) {
                        this.field4879.method2189((byte) -95, var20, var10 + ((int) ((double) this.field4884.field4625 * 0.7D)), class397.field5682, arg4);
                    }
                    if (class116.field1667 != -1) {
                        this.field4879.method2189((byte) -123, var20, this.field4884.field4625 + var10 + 1, class116.field1667, arg4);
                    }
                    var12 = var15;
                    arg4 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method1411(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
