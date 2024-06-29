import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class417 {

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lvn;")
    private class283 field5876;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lr;")
    private class166 field5887;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Loh;")
    public static class370 field5884 = new class370(0, 1);

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Lem;")
    public static class206 field5889 = null;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Lsea;")
    public static class648 field5891;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 7)
    private final void method2408(String arg0, int arg1, byte arg2) {
        field5886++;
        int var4 = 0;
        int var5 = 120 % ((55 - arg2) / 55);
        boolean var6 = false;
        for (int var7 = 0; arg0.length() > var7; var7++) {
            char var8 = arg0.charAt(var7);
            if (var8 == '<') {
                var6 = true;
            } else if (var8 == '>') {
                var6 = false;
            } else if (!var6 && var8 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class73.field959 = (arg1 - this.field5876.method1736(17046, arg0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLr;)V", line = 46)
    public static final void method2409(byte arg0, class166 arg1) {
        field5893++;
        arg1.method200(0, 0, class222.field3096, 350);
        arg1.method110(0, 0, class222.field3096, 350, class588.field8258 << 24 | 0x332277, 1);
        int var2 = 350 / class311.field4298;
        if (class487.field6692 > 0) {
            int var3 = 346 - class311.field4298 - 4;
            int var4 = var2 * var3 / (var2 + class487.field6692 - 1);
            int var5 = 4;
            if (class487.field6692 > 1) {
                var5 += (class487.field6692 - class286.field3942 - 1) * (var3 - var4) / (class487.field6692 - 1);
            }
            arg1.method110(class222.field3096 - 16, var5, 12, var4, class588.field8258 << 24 | 0x332277, 2);
            for (int var6 = class286.field3942; class286.field3942 + var2 > var6 && class487.field6692 > var6; var6++) {
                String[] var7 = class48.method383(class61.field687[var6], 1, '\b');
                int var8 = (class222.field3096 - 8 - 16) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg1.method200(var10, 0, var10 + var8 - 8, 350);
                    class273.field3741.method2423(class338.method1978(var7[var9], 0), var10, false, -1, 350 - class400.field5608 - class136.field1916.field3874 - ((var6 - class286.field3942) * class311.field4298) - 2, -16777216);
                }
            }
        }
        class499.field6781.method2411("Build: 626", (byte) 99, class222.field3096 - 25, -1, 330, -16777216);
        arg1.method200(0, 0, class222.field3096, 350);
        arg1.method1172(class222.field3096, 60, 350 - class400.field5608, 0, -1);
        class428.field5986.method2423("--> " + class338.method1978(class187.field2713, arg0 ^ 0xFFFFFFDB), 10, false, -1, 350 - class377.field5030.field3874 - 1, -16777216);
        if (arg0 != -37) {
            field5891 = null;
        }
        if (!class556.field7487) {
            return;
        }
        int var11 = -1;
        if (class186.field2697 % 30 > 15) {
            var11 = 16777215;
        }
        arg1.method1171(class377.field5030.method1736(17046, "--> " + class338.method1978(class187.field2713, 0).substring(0, class513.field7039)) + 10, 12, true, 339 - class377.field5030.field3874, var11);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V", line = 119)
    private final void method2410(int arg0, int arg1, int arg2) {
        field5872++;
        class274.field3801 = arg1;
        class43.field500 = arg1;
        if (arg0 > -48) {
            this.field5887 = null;
        }
        class361.field4766 = -1;
        class613.field8535 = 0;
        class289.field3966 = -1;
        class73.field959 = 0;
        if (arg2 == -1) {
            arg2 = 0;
        }
        class24.field304 = arg2;
        class284.field3883 = arg2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BIIII)V", line = 138)
    public final void method2411(String arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field5873++;
        if (arg0 == null) {
            return;
        }
        this.method2410(-52, arg3, arg5);
        if (arg1 <= 47) {
            field5889 = null;
        }
        this.method2415(null, null, null, arg2 - this.field5876.method1736(17046, arg0), 0, arg4, 0, -121, arg0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZIILjava/lang/String;III)V", line = 162)
    public final void method2412(int arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        if (!arg1) {
            this.method2411(null, (byte) -6, -75, 40, 117, -88);
        }
        field5883++;
        if (arg4 == null) {
            return;
        }
        this.method2410(-107, arg6, arg7);
        double var9 = 7.0D - ((double) arg2 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg4.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg3) * var9);
        }
        this.method2419((byte) 80, null, arg4, arg5, null, null, var12, arg0 - this.field5876.method1736(17046, arg4) / 2);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZLbca;)V", line = 194)
    public static final void method2413(boolean arg0, class614 arg1) {
        arg1.field8573 = null;
        if (arg0) {
            method2416(-39);
        }
        field5877++;
        int var2 = arg1.field8572.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field8572[var3].field7444 = false;
        }
        class693[] var4 = class570.field8097;
        synchronized (class570.field8097) {
            if (class570.field8097.length > var2 && class622.field8639[var2] < 200) {
                class570.field8097[var2].method3906(arg1, (byte) -19);
                int var10002 = class622.field8639[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IZIIII[Lf;Ljava/lang/String;)V", line = 226)
    public final void method2414(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class702[] arg6, String arg7) {
        field5895++;
        if (arg7 == null) {
            return;
        }
        this.method2410(-99, arg5, arg3);
        this.method2415(arg0, null, arg6, arg4, 0, arg2, 0, -116, arg7);
        if (arg1) {
            this.method2410(80, -30, 49);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([ILua;[Lf;IIIIILjava/lang/String;)V", line = 244)
    private final void method2415(int[] arg0, class618 arg1, class702[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, String arg8) {
        field5882++;
        int var10 = arg5 - this.field5876.field3864;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg8.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class631.method3536(arg8.charAt(var14), true) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg8.substring(var11 + 1, var14);
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
                                    int var17 = class214.method1376(0, var16.substring(4));
                                    class702 var18 = arg2[var17];
                                    int var19 = arg0 == null ? var18.method1661() : arg0[var17];
                                    if ((class43.field500 & 0xFF000000) == -16777216) {
                                        var18.method935(arg3, this.field5876.field3864 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method935(arg3, var10 + this.field5876.field3864 - var19, 0, class43.field500 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg3 += arg2[var17].method1660();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2424(var16, (byte) 69);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg3 += this.field5876.method1740(var15, (byte) 111, var12);
                    }
                    if (var15 == ' ') {
                        if (class73.field959 > 0) {
                            class613.field8535 += class73.field959;
                            arg3 += class613.field8535 >> 8;
                            class613.field8535 &= 0xFF;
                        }
                    } else if (arg1 == null) {
                        if ((class284.field3883 & 0xFF000000) != 0) {
                            this.method1202(var15, arg3 + 1, var10 + 1, class284.field3883, true);
                        }
                        this.method1202(var15, arg3, var10, class43.field500, false);
                    } else {
                        if ((class284.field3883 & 0xFF000000) != 0) {
                            this.method1200(var15, arg3 + 1, var10 + 1, class284.field3883, true, arg1, arg4, arg6);
                        }
                        this.method1200(var15, arg3, var10, class43.field500, false, arg1, arg4, arg6);
                    }
                    int var20 = this.field5876.method1743(var15, 54);
                    if (class289.field3966 != -1) {
                        this.field5887.method1172(var20, 79, (int) ((double) this.field5876.field3864 * 0.7D) + var10, arg3, class289.field3966);
                    }
                    if (class361.field4766 != -1) {
                        this.field5887.method1172(var20, 99, var10 + this.field5876.field3864 + 1, arg3, class361.field4766);
                    }
                    arg3 += var20;
                    var12 = var15;
                }
            }
        }
        if (arg7 > -77) {
            this.method2419((byte) -124, null, null, -37, null, null, null, -72);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 400)
    public static void method2416(int arg0) {
        field5891 = null;
        field5889 = null;
        int var1 = -62 / ((-arg0 - 44) / 44);
        field5884 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/util/Random;Ljava/lang/String;I[Lf;II[III)I", line = 411)
    public final int method2417(int arg0, Random arg1, String arg2, int arg3, class702[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
        field5874++;
        if (arg2 == null) {
            return 0;
        }
        arg1.setSeed((long) arg0);
        int var11 = (arg1.nextInt() & 0x1F) + 192;
        this.method2410(arg8 - 56, arg3 & 0xFFFFFF | var11 << 24, arg5 & 0xFFFFFF | var11 << 24);
        if (arg8 != -1) {
            return 32;
        }
        int var12 = arg2.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg1.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2419((byte) 80, var13, arg2, arg6, arg7, arg4, null, arg9);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lr;Lvn;)V", line = 448)
    public class417(class166 arg0, class283 arg1) {
        this.field5876 = arg1;
        this.field5887 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZILjava/lang/String;III)V", line = 459)
    public final void method2418(boolean arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field5880++;
        if (arg2 == null) {
            return;
        }
        this.method2410(-81, arg4, arg1);
        this.method2415(null, null, null, arg5 - (this.field5876.method1736(17046, arg2) / 2), 0, arg3, 0, -123, arg2);
        if (arg0) {
            field5889 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B[ILjava/lang/String;I[I[Lf;[II)V", line = 475)
    private final void method2419(byte arg0, int[] arg1, String arg2, int arg3, int[] arg4, class702[] arg5, int[] arg6, int arg7) {
        field5890++;
        int var9 = arg3 - this.field5876.field3864;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class631.method3536(arg2.charAt(var14), true) & 0xFF);
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
                                    if (arg1 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg1[var12];
                                    }
                                    int var18;
                                    if (arg6 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg6[var12];
                                    }
                                    var12++;
                                    int var19 = class214.method1376(0, var16.substring(4));
                                    class702 var20 = arg5[var19];
                                    int var21 = arg4 == null ? var20.method1661() : arg4[var19];
                                    var20.method935(arg7 + var17, var9 - var21 + this.field5876.field3864 + var18, 1, 0, 1);
                                    arg7 += arg5[var19].method1660();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2424(var16, (byte) 69);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg7 += this.field5876.method1740(var15, (byte) 111, var11);
                    }
                    int var22;
                    if (arg1 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg1[var12];
                    }
                    int var23;
                    if (arg6 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg6[var12];
                    }
                    if (var15 != ' ') {
                        if ((class284.field3883 & 0xFF000000) != 0) {
                            this.method1202(var15, arg7 - (-var22 - 1), var23 + 1 + var9, class284.field3883, true);
                        }
                        this.method1202(var15, arg7 + var22, var9 + var23, class43.field500, false);
                    } else if (class73.field959 > 0) {
                        class613.field8535 += class73.field959;
                        arg7 += class613.field8535 >> 8;
                        class613.field8535 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field5876.method1743(var15, 55);
                    if (class289.field3966 != -1) {
                        this.field5887.method1172(var24, arg0 ^ 0x10, (int) ((double) this.field5876.field3864 * 0.7D) + var9, arg7, class289.field3966);
                    }
                    if (class361.field4766 != -1) {
                        this.field5887.method1172(var24, 85, this.field5876.field3864 + var9, arg7, class361.field4766);
                    }
                    arg7 += var24;
                    var11 = var15;
                }
            }
        }
        if (arg0 != 80) {
            field5884 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 636)
    public static final void method2420(byte arg0) {
        if (arg0 > 89) {
            class48.field566.method3755(19713);
            field5892++;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[Lf;IIILua;I[IIILjava/lang/String;IIIII)I", line = 648)
    public final int method2421(int arg0, int arg1, class702[] arg2, int arg3, int arg4, int arg5, class618 arg6, int arg7, int[] arg8, int arg9, int arg10, String arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field5878++;
        if (arg11 == null) {
            return 0;
        }
        this.method2410(-57, arg5, arg3);
        if (arg0 == 0) {
            arg0 = this.field5876.field3864;
        }
        int[] var18;
        if (this.field5876.field3859 + arg0 + this.field5876.field3874 > arg7 && arg7 < arg0 + arg0) {
            var18 = null;
        } else {
            var18 = new int[] { arg14 };
        }
        if (arg13 != 169) {
            return -6;
        }
        if (arg1 == -1) {
            arg1 = arg7 / arg0;
            if (arg1 <= 0) {
                arg1 = 1;
            }
        }
        int var19 = this.field5876.method1739(var18, arg2, class251.field3424, arg11, false);
        if (arg1 > 0 && var19 >= arg1) {
            class251.field3424[arg1 - 1] = this.field5876.method1737(arg2, class324.method1944(arg13, 169), class251.field3424[arg1 - 1], arg14);
            var19 = arg1;
        }
        if (arg15 == 3 && var19 == 1) {
            arg15 = 1;
        }
        int var20;
        if (arg15 == 0) {
            var20 = this.field5876.field3859 + arg10;
        } else if (arg15 == 1) {
            var20 = (arg7 - this.field5876.field3874 - this.field5876.field3859 - (var19 + -1) * arg0) / 2 + this.field5876.field3859 + arg10;
        } else if (arg15 == 2) {
            var20 = arg7 + arg10 - ((var19 - 1) * arg0) - this.field5876.field3874;
        } else {
            int var21 = (arg7 - this.field5876.field3859 - this.field5876.field3874 - ((var19 + -1) * arg0)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = arg10 - (-this.field5876.field3859 - var21);
            arg0 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg4 == 0) {
                this.method2415(arg8, arg6, arg2, arg12, arg16, var20, arg9, arg13 - 296, class251.field3424[var22]);
            } else if (arg4 == 1) {
                this.method2415(arg8, arg6, arg2, (arg14 - this.field5876.method1736(17046, class251.field3424[var22])) / 2 + arg12, arg16, var20, arg9, -103, class251.field3424[var22]);
            } else if (arg4 == 2) {
                this.method2415(arg8, arg6, arg2, arg12 - (this.field5876.method1736(17046, class251.field3424[var22]) - arg14), arg16, var20, arg9, arg13 - 282, class251.field3424[var22]);
            } else if (var19 - 1 == var22) {
                this.method2415(arg8, arg6, arg2, arg12, arg16, var20, arg9, -113, class251.field3424[var22]);
            } else {
                this.method2408(class251.field3424[var22], arg14, (byte) -60);
                this.method2415(arg8, arg6, arg2, arg12, arg16, var20, arg9, -85, class251.field3424[var22]);
                class73.field959 = 0;
            }
            var20 += arg0;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V", line = 750)
    public final void method2422(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg5 < 18) {
            this.method2427(24, -35, null, -61, -107, 117, null, 63, -64, -126, 0, (byte) -8, 52, -91, null, null);
        }
        field5885++;
        if (arg3 == null) {
            return;
        }
        this.method2410(-96, arg0, arg1);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg6 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2419((byte) 80, null, arg3, arg4, null, null, var9, arg2 - (this.field5876.method1736(17046, arg3) / 2));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IZIII)V", line = 776)
    public final void method2423(String arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field5888++;
        if (arg0 == null) {
            return;
        }
        if (arg2) {
            field5891 = null;
        }
        this.method2410(-113, arg3, arg5);
        this.method2415(null, null, null, arg1, 0, arg4, 0, -88, arg0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 795)
    private final void method2424(String arg0, byte arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class43.field500 = class43.field500 & 0xFF000000 | class178.method1235(arg0.substring(4), 16, (byte) 65) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class43.field500 = class43.field500 & 0xFF000000 | class274.field3801 & 0xFFFFFF;
            }
            if (arg1 != 69) {
                this.field5887 = null;
            }
            if (arg0.startsWith("argb=")) {
                class43.field500 = class178.method1235(arg0.substring(5), 16, (byte) -104);
            } else if (arg0.equals("/argb")) {
                class43.field500 = class274.field3801;
            } else if (arg0.startsWith("str=")) {
                class289.field3966 = class43.field500 & 0xFF000000 | class178.method1235(arg0.substring(4), 16, (byte) 77);
            } else if (arg0.equals("str")) {
                class289.field3966 = class43.field500 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class289.field3966 = -1;
            } else if (arg0.startsWith("u=")) {
                class361.field4766 = class43.field500 & 0xFF000000 | class178.method1235(arg0.substring(2), 16, (byte) -121);
            } else if (arg0.equals("u")) {
                class361.field4766 = class43.field500 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class361.field4766 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class284.field3883 = 0;
            } else if (arg0.startsWith("shad=")) {
                class284.field3883 = class43.field500 & 0xFF000000 | class178.method1235(arg0.substring(5), 16, (byte) 70);
            } else if (arg0.equals("shad")) {
                class284.field3883 = class43.field500 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class284.field3883 = class24.field304;
            } else if (arg0.equals("br")) {
                this.method2410(arg1 - 166, class274.field3801, class24.field304);
            }
        } catch (Exception var3) {
        }
        field5881++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 868)
    public final void method2425(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5875++;
        if (arg0 == null) {
            return;
        }
        this.method2410(arg1 - 106, arg4, arg5);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg1 != -1) {
            this.method2426(null, null, -119, -10, 42, -66, null, -93, -72, null, 30, 70, -55, null, -3);
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2419((byte) 80, var9, arg0, arg6, null, null, var10, arg3 - (this.field5876.method1736(17046, arg0) / 2));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([ILjava/util/Random;IIII[Lf;IILjava/lang/String;III[II)I", line = 901)
    public final int method2426(int[] arg0, Random arg1, int arg2, int arg3, int arg4, int arg5, class702[] arg6, int arg7, int arg8, String arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14) {
        if (arg14 != 3) {
            field5889 = null;
        }
        field5879++;
        if (arg9 == null) {
            return 0;
        }
        arg1.setSeed((long) arg11);
        int var16 = (arg1.nextInt() & 0x1F) + 192;
        this.method2410(-79, var16 << 24 | arg3 & 0xFFFFFF, arg10 & 0xFFFFFF | var16 << 24);
        int var17 = arg9.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg1.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg2;
        int var22 = this.field5876.field3859 + arg7;
        if (arg5 == 1) {
            var22 += (arg12 - (this.field5876.field3874 + this.field5876.field3859)) / 2;
        } else if (arg5 == 2) {
            var22 = arg7 + arg12 - this.field5876.field3874;
        }
        int var23 = -1;
        if (arg8 == 1) {
            var23 = this.field5876.method1736(arg14 + 17043, arg9) + var19;
            var21 = (arg4 - var23) / 2 + arg2;
        } else if (arg8 == 2) {
            var23 = var19 + this.field5876.method1736(17046, arg9);
            var21 = arg4 + arg2 - var23;
        }
        this.method2419((byte) 80, var18, arg9, var22, arg13, arg6, null, var21);
        if (arg0 != null) {
            if (var23 == -1) {
                var23 = this.field5876.method1736(17046, arg9) + var19;
            }
            arg0[2] = var23;
            arg0[1] = var22 - this.field5876.field3859;
            arg0[3] = this.field5876.field3874 + this.field5876.field3859;
            arg0[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILua;III[IIIIIBIILjava/lang/String;[Lf;)I", line = 984)
    public final int method2427(int arg0, int arg1, class618 arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, byte arg11, int arg12, int arg13, String arg14, class702[] arg15) {
        field5894++;
        int var17 = -47 / ((28 - arg11) / 60);
        return this.method2421(arg5, 0, arg15, arg12, arg8, arg7, arg2, arg13, arg6, arg3, arg4, arg14, arg9, 169, arg10, arg0, arg1);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLua;II)V")
    public abstract void method1200(char arg0, int arg1, int arg2, int arg3, boolean arg4, class618 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method1202(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
