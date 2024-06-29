import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class319 {

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lza;")
    private class290 field4612;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Lul;")
    private class411 field4614;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Ltn;")
    public static class60 field4620 = new class60(81, 18);

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field4622 = -2;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Leh;")
    public static class246 field4623 = new class246(75, 8);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;IIZ)V")
    public final void method1912(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, boolean arg7) {
        field4618++;
        if (arg4 == null) {
            return;
        }
        this.method1915(!arg7, arg5, arg6);
        double var9 = 7.0D - ((double) arg1 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg4.length();
        int[] var12 = new int[var11];
        if (arg7) {
            for (int var13 = 0; var13 < var11; var13++) {
                var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg3));
            }
            this.method1927(var12, null, null, arg4, null, arg2, arg0 - (this.field4614.method2430(arg4, (byte) -104) / 2), 0);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIZI)V")
    public final void method1913(String arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4607++;
        if (arg0 != null) {
            this.method1915(arg4, arg1, arg2);
            this.method1923(arg5 - (this.field4614.method2430(arg0, (byte) -107) / 2), arg4, 0, 0, arg0, null, arg3, null, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public final void method1914(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field4609++;
        if (arg2 == null) {
            return;
        }
        this.method1915(false, arg3, arg5);
        this.method1923(arg1, false, 0, 0, arg2, null, arg0, null, null);
        if (arg4 != 16144) {
            this.field4614 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZII)V")
    private final void method1915(boolean arg0, int arg1, int arg2) {
        field4608++;
        class541.field7915 = 0;
        if (arg0) {
            return;
        }
        class190.field2723 = -1;
        if (arg2 == -1) {
            arg2 = 0;
        }
        class32.field373 = arg1;
        class286.field4186 = arg1;
        class158.field2369 = -1;
        class145.field1915 = 0;
        class475.field6608 = arg2;
        class4.field75 = arg2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method1916(int arg0) {
        field4623 = null;
        field4620 = null;
        if (arg0 != 0) {
            field4623 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method1917(String arg0, int arg1) {
        field4617++;
        try {
            if (arg0.startsWith("col=")) {
                class286.field4186 = class286.field4186 & 0xFF000000 | class340.method2019(16, arg0.substring(4), (byte) -85) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class286.field4186 = class32.field373 & 0xFFFFFF | class286.field4186 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class286.field4186 = class340.method2019(16, arg0.substring(5), (byte) -66);
            } else if (arg0.equals("/argb")) {
                class286.field4186 = class32.field373;
            } else if (arg0.startsWith("str=")) {
                class190.field2723 = class286.field4186 & 0xFF000000 | class340.method2019(16, arg0.substring(4), (byte) -98);
            } else if (arg0.equals("str")) {
                class190.field2723 = class286.field4186 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class190.field2723 = -1;
            } else if (arg0.startsWith("u=")) {
                class158.field2369 = class286.field4186 & 0xFF000000 | class340.method2019(16, arg0.substring(2), (byte) -85);
            } else if (arg0.equals("u")) {
                class158.field2369 = class286.field4186 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class158.field2369 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class4.field75 = 0;
            } else if (arg0.startsWith("shad=")) {
                class4.field75 = class286.field4186 & 0xFF000000 | class340.method2019(16, arg0.substring(5), (byte) -126);
            } else if (arg0.equals("shad")) {
                class4.field75 = class286.field4186 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class4.field75 = class475.field6608;
            } else if (arg0.equals("br")) {
                this.method1915(false, class32.field373, class475.field6608);
            }
        } catch (Exception var3) {
        }
        if (arg1 != -16777216) {
            this.method1920(null, -101, -101, -120, -89, 64, 8, -64, null, -67, -38, -97, -5, -117, null, null, -73);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III[ILjava/lang/String;I[Lo;I)V")
    public final void method1918(int arg0, int arg1, int arg2, int[] arg3, String arg4, int arg5, class24[] arg6, int arg7) {
        field4624++;
        if (arg4 != null) {
            this.method1915(false, arg0, arg1);
            this.method1923(arg2, false, arg5, 0, arg4, arg3, arg7, arg6, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I[IILjava/util/Random;IBI[Lo;I)I")
    public final int method1919(String arg0, int arg1, int[] arg2, int arg3, Random arg4, int arg5, byte arg6, int arg7, class24[] arg8, int arg9) {
        field4606++;
        if (arg0 == null) {
            return 0;
        }
        arg4.setSeed((long) arg1);
        int var11 = (arg4.nextInt() & 0x1F) + 192;
        this.method1915(false, arg3 & 0xFFFFFF | var11 << 24, var11 << 24 | arg9 & 0xFFFFFF);
        int var12 = arg0.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg4.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        if (arg6 == 76) {
            this.method1927(null, arg2, var13, arg0, arg8, arg7, arg5, 0);
            return var14;
        } else {
            return -96;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Lo;IIIIIIILta;IIIIILjava/lang/String;[II)I")
    public final int method1920(class24[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class145 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, String arg14, int[] arg15, int arg16) {
        field4611++;
        if (arg14 == null) {
            return 0;
        }
        this.method1915(false, arg4, arg7);
        if (arg2 == 0) {
            arg2 = this.field4614.field5808;
        }
        int[] var18;
        if (arg5 < this.field4614.field5813 + this.field4614.field5804 + arg2 && arg2 + arg2 > arg5) {
            var18 = null;
        } else {
            var18 = new int[] { arg11 };
        }
        if (arg1 == -1) {
            arg1 = arg5 / arg2;
            if (arg1 <= 0) {
                arg1 = 1;
            }
        }
        int var19 = this.field4614.method2436(arg14, false, class405.field5741, arg0, var18);
        if (arg1 > 0 && arg1 <= var19) {
            class405.field5741[arg1 - 1] = this.field4614.method2433(169, class405.field5741[arg1 - 1], arg11, arg0);
            var19 = arg1;
        }
        if (arg12 == 3 && var19 == 1) {
            arg12 = 1;
        }
        int var20;
        if (~arg12 == arg3) {
            var20 = this.field4614.field5804 + arg16;
        } else if (arg12 == 1) {
            var20 = (arg5 - this.field4614.field5804 - this.field4614.field5813 - ((var19 - 1) * arg2)) / 2 + this.field4614.field5804 + arg16;
        } else if (arg12 == 2) {
            var20 = arg16 + arg5 - this.field4614.field5813 - (var19 - 1) * arg2;
        } else {
            int var21 = (arg5 - this.field4614.field5804 - this.field4614.field5813 - ((var19 + -1) * arg2)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = this.field4614.field5804 + arg16 + var21;
            arg2 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg13 == 0) {
                this.method1923(arg6, false, arg10, arg9, class405.field5741[var22], arg15, var20, arg0, arg8);
            } else if (arg13 == 1) {
                this.method1923(arg6 + (arg11 - this.field4614.method2430(class405.field5741[var22], (byte) -111)) / 2, false, arg10, arg9, class405.field5741[var22], arg15, var20, arg0, arg8);
            } else if (arg13 == 2) {
                this.method1923(arg6 + arg11 - this.field4614.method2430(class405.field5741[var22], (byte) -110), false, arg10, arg9, class405.field5741[var22], arg15, var20, arg0, arg8);
            } else if (var19 - 1 == var22) {
                this.method1923(arg6, false, arg10, arg9, class405.field5741[var22], arg15, var20, arg0, arg8);
            } else {
                this.method1925(arg11, false, class405.field5741[var22]);
                this.method1923(arg6, false, arg10, arg9, class405.field5741[var22], arg15, var20, arg0, arg8);
                class541.field7915 = 0;
            }
            var20 += arg2;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IILjava/lang/String;III)V")
    public final void method1921(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field4605++;
        if (arg2 == null) {
            return;
        }
        if (arg4 <= 38) {
            this.method480('\u0002', -65, 68, 28, true, null, 76, -19);
        }
        this.method1915(false, arg3, arg5);
        this.method1923(arg1 - this.field4614.method2430(arg2, (byte) -126), false, 0, 0, arg2, null, arg0, null, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILta;IIII[Lo;I[ILjava/lang/String;I)I")
    public final int method1922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class145 arg6, int arg7, int arg8, int arg9, int arg10, class24[] arg11, int arg12, int[] arg13, String arg14, int arg15) {
        field4604++;
        if (arg15 != -2) {
            field4621 = -73;
        }
        return this.method1920(arg11, 0, arg9, -1, arg5, arg0, arg7, arg1, arg6, arg12, arg8, arg10, arg3, arg4, arg14, arg13, arg2);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZIILjava/lang/String;[II[Lo;Lta;)V")
    private final void method1923(int arg0, boolean arg1, int arg2, int arg3, String arg4, int[] arg5, int arg6, class24[] arg7, class145 arg8) {
        int var10 = arg6 - this.field4614.field5808;
        field4616++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class224.method1382(true, arg4.charAt(var14)) & 0xFF);
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
                                    int var17 = class387.method2244(var16.substring(4), 10);
                                    class24 var18 = arg7[var17];
                                    int var19 = arg5 == null ? var18.method157() : arg5[var17];
                                    if ((class286.field4186 & 0xFF000000) == -16777216) {
                                        var18.method144(arg0, this.field4614.field5808 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method144(arg0, this.field4614.field5808 + var10 - var19, 0, class286.field4186 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg0 += arg7[var17].method145();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1917(var16, -16777216);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg0 += this.field4614.method2429(var12, var15, 5572);
                    }
                    if (var15 == ' ') {
                        if (class541.field7915 > 0) {
                            class145.field1915 += class541.field7915;
                            arg0 += class145.field1915 >> 8;
                            class145.field1915 &= 0xFF;
                        }
                    } else if (arg8 == null) {
                        if ((class4.field75 & 0xFF000000) != 0) {
                            this.method483(var15, arg0 + 1, var10 + 1, class4.field75, true);
                        }
                        this.method483(var15, arg0, var10, class286.field4186, false);
                    } else {
                        if ((class4.field75 & 0xFF000000) != 0) {
                            this.method480(var15, arg0 + 1, var10 + 1, class4.field75, true, arg8, arg3, arg2);
                        }
                        this.method480(var15, arg0, var10, class286.field4186, false, arg8, arg3, arg2);
                    }
                    int var20 = this.field4614.method2438(35, var15);
                    if (class190.field2723 != -1) {
                        this.field4612.method1793(arg0, -29535, class190.field2723, var20, (int) ((double) this.field4614.field5808 * 0.7D) + var10);
                    }
                    if (class158.field2369 != -1) {
                        this.field4612.method1793(arg0, -29535, class158.field2369, var20, var10 - (-this.field4614.field5808 - 1));
                    }
                    arg0 += var20;
                    var12 = var15;
                }
            }
        }
        if (arg1) {
            this.method1917(null, -125);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLta;II)V")
    public abstract void method480(char arg0, int arg1, int arg2, int arg3, boolean arg4, class145 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
    public final void method1924(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field4603++;
        if (arg6 == null) {
            return;
        }
        this.method1915(false, arg2, arg3);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        if (arg4 <= 20) {
            field4622 = 7;
        }
        this.method1927(var9, null, null, arg6, null, arg1, arg0 - (this.field4614.method2430(arg6, (byte) -112) / 2), 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZLjava/lang/String;)V")
    private final void method1925(int arg0, boolean arg1, String arg2) {
        field4613++;
        int var4 = 0;
        boolean var5 = arg1;
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
        if (var4 > 0) {
            class541.field7915 = (arg0 - this.field4614.method2430(arg2, (byte) -112) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lza;Lul;)V")
    public class319(class290 arg0, class411 arg1) {
        this.field4612 = arg0;
        this.field4614 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;II[Lo;I[I[IIILjava/util/Random;)I")
    public final int method1926(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7, class24[] arg8, int arg9, int[] arg10, int[] arg11, int arg12, int arg13, Random arg14) {
        field4610++;
        if (arg5 == null) {
            return 0;
        }
        arg14.setSeed((long) arg9);
        int var16 = (arg14.nextInt() & 0x1F) + 192;
        this.method1915(false, arg12 & 0xFFFFFF | var16 << 24, var16 << 24 | arg7 & 0xFFFFFF);
        int var17 = arg5.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg14.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg3;
        int var22 = arg13 + this.field4614.field5804;
        int var23 = -1;
        if (arg4 == 1) {
            var22 += (arg1 - this.field4614.field5813 - this.field4614.field5804) / 2;
        } else if (arg4 == 2) {
            var22 = arg1 + arg13 - this.field4614.field5813;
        }
        if (arg2 == 1) {
            var23 = var19 + this.field4614.method2430(arg5, (byte) -126);
            var21 = (arg0 - var23) / 2 + arg3;
        } else if (arg2 == 2) {
            var23 = var19 + this.field4614.method2430(arg5, (byte) -117);
            var21 = arg0 + arg3 - var23;
        }
        this.method1927(null, arg10, var18, arg5, arg8, var22, var21, 0);
        if (arg6 != -15565) {
            this.method1917(null, -40);
        }
        if (arg11 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field4614.method2430(arg5, (byte) -117);
            }
            arg11[0] = var21;
            arg11[3] = this.field4614.field5813 + this.field4614.field5804;
            arg11[2] = var23;
            arg11[1] = var22 - this.field4614.field5804;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([I[I[ILjava/lang/String;[Lo;III)V")
    private final void method1927(int[] arg0, int[] arg1, int[] arg2, String arg3, class24[] arg4, int arg5, int arg6, int arg7) {
        field4615++;
        int var9 = arg5 - this.field4614.field5808;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg3.length();
        for (int var14 = arg7; var14 < var13; var14++) {
            char var15 = (char) (class224.method1382(true, arg3.charAt(var14)) & 0xFF);
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
                                    if (arg0 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg0[var12];
                                    }
                                    var12++;
                                    int var19 = class387.method2244(var16.substring(4), 10);
                                    class24 var20 = arg4[var19];
                                    int var21 = arg1 == null ? var20.method157() : arg1[var19];
                                    var20.method144(arg6 + var17, -var21 + this.field4614.field5808 + var18 + var9, 1, 0, 1);
                                    var11 = -1;
                                    arg6 += arg4[var19].method145();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1917(var16, -16777216);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg6 += this.field4614.method2429(var11, var15, 5572);
                    }
                    int var22;
                    if (arg2 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg2[var12];
                    }
                    int var23;
                    if (arg0 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg0[var12];
                    }
                    if (var15 != ' ') {
                        if ((class4.field75 & 0xFF000000) != 0) {
                            this.method483(var15, arg6 + var22 + 1, var9 + var23 - -1, class4.field75, true);
                        }
                        this.method483(var15, arg6 + var22, var9 + var23, class286.field4186, false);
                    } else if (class541.field7915 > 0) {
                        class145.field1915 += class541.field7915;
                        arg6 += class145.field1915 >> 8;
                        class145.field1915 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field4614.method2438(-97, var15);
                    if (class190.field2723 != -1) {
                        this.field4612.method1793(arg6, -29535, class190.field2723, var24, var9 + ((int) ((double) this.field4614.field5808 * 0.7D)));
                    }
                    if (class158.field2369 != -1) {
                        this.field4612.method1793(arg6, -29535, class158.field2369, var24, this.field4614.field5808 + var9);
                    }
                    arg6 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IIIIIILjava/lang/String;)V")
    public final void method1928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field4619++;
        if (arg6 == null) {
            return;
        }
        this.method1915(false, arg2, arg4);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        int var11 = 0;
        if (arg0 <= 59) {
            field4622 = 49;
        }
        while (var8 > var11) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
            var11++;
        }
        this.method1927(var10, null, var9, arg6, null, arg1, arg3 - (this.field4614.method2430(arg6, (byte) -117) / 2), 0);
    }

    @OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method483(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
