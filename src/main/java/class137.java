import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public abstract class class137 {

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "Ldr;")
    private class261 field1855;

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "Lgo;")
    private class272 field1856;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "Lpf;")
    public static class425 field1846 = new class425(15, 8);

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field1853 = new String[200];

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
    public static int field1854 = 1;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    public static int field1850 = 0;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "[Lal;")
    public static class198[] field1852 = new class198[29];

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "Lns;")
    public static class55 field1859 = new class55(11, 15);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "[I")
    public static int[] field1861;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IBI)V")
    private final void method856(int arg0, byte arg1, int arg2) {
        class169.field2441 = -1;
        class406.field6039 = arg2;
        class51.field651 = arg2;
        class164.field2292 = 0;
        if (arg1 > -102) {
            field1854 = 78;
        }
        class446.field6581 = -1;
        class221.field3371 = 0;
        field1834++;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class30.field382 = arg0;
        class153.field2100 = arg0;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)Lon;")
    public static final class432 method857(int arg0, int arg1) {
        if (arg0 == 32368) {
            field1839++;
            return class414.field6155 && class301.field4546 <= arg1 && arg1 <= class219.field3340 ? class299.field4519[arg1 - class301.field4546] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public final void method858(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field1849++;
        if (arg5 == null) {
            return;
        }
        this.method856(arg2, (byte) -115, arg1);
        this.method866(arg5, (byte) 34, 0, arg4 - (this.field1856.method1693(-110, arg5) / 2), (class153) null, 0, (class234[]) null, (int[]) null, arg3);
        if (arg0 != -3700) {
            field1846 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
    public final void method859(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        field1838++;
        if (arg3 == null) {
            return;
        }
        this.method856(arg1, (byte) -116, arg0);
        double var9 = 7.0D - (double) arg5 / 8.0D;
        if (arg6 <= 44) {
            field1850 = 94;
        }
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg3.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg7));
        }
        this.method872(arg3, (int[]) null, arg2, 0, (class234[]) null, var12, (int[]) null, arg4 - (this.field1856.method1693(-125, arg3) / 2));
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method860(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg0 != 31) {
            field1852 = null;
        }
        field1844++;
        if (arg3 != null) {
            this.method856(arg2, (byte) -108, arg1);
            this.method866(arg3, (byte) 34, 0, arg5 - this.field1856.method1693(-101, arg3), (class153) null, 0, (class234[]) null, (int[]) null, arg4);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private final void method861(int arg0, String arg1, int arg2) {
        field1840++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg1.length() > var6; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (arg0 >= -89) {
            this.field1856 = null;
        }
        if (var4 > 0) {
            class221.field3371 = (arg2 - this.field1856.method1693(-116, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII[I[Lkr;IILjava/lang/String;IILjava/util/Random;II[I)I")
    public final int method862(int arg0, int arg1, int arg2, int arg3, int[] arg4, class234[] arg5, int arg6, int arg7, String arg8, int arg9, int arg10, Random arg11, int arg12, int arg13, int[] arg14) {
        field1842++;
        if (arg8 == null) {
            return 0;
        }
        arg11.setSeed((long) arg6);
        int var16 = (arg11.nextInt() & 0x1F) + 192;
        this.method856(var16 << 24 | arg10 & 0xFFFFFF, (byte) -126, var16 << 24 | arg0 & 0xFFFFFF);
        int var17 = arg8.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = arg7; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg11.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg13;
        int var22 = this.field1856.field4176 + arg1;
        int var23 = -1;
        if (arg12 == 1) {
            var22 += (arg2 - this.field1856.field4172 - this.field1856.field4176) / 2;
        } else if (arg12 == 2) {
            var22 = arg1 + arg2 - this.field1856.field4172;
        }
        if (arg3 == 1) {
            var23 = this.field1856.method1693(-107, arg8) + var19;
            var21 = (arg9 - var23) / 2 + arg13;
        } else if (arg3 == 2) {
            var23 = this.field1856.method1693(-102, arg8) + var19;
            var21 = arg9 + arg13 - var23;
        }
        this.method872(arg8, arg14, var22, 0, arg5, (int[]) null, var18, var21);
        if (arg4 != null) {
            if (var23 == -1) {
                var23 = this.field1856.method1693(-115, arg8) + var19;
            }
            arg4[0] = var21;
            arg4[2] = var23;
            arg4[3] = this.field1856.field4176 + this.field1856.field4172;
            arg4[1] = var22 - this.field1856.field4176;
        }
        return var19;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public static final void method863(int arg0) {
        field1836++;
        int var1 = class402.field6007 * 128 + 64;
        int var2 = class341.field5105 * 128 + 64;
        int var3 = class437.method2686(class143.field1911, 0, var2, var1) - class413.field6136;
        if (class438.field6452 >= 100) {
            class185.field2790 = class402.field6007 * 128 + 64;
            class196.field2967 = class341.field5105 * 128 + 64;
            class127.field1626 = class437.method2686(class143.field1911, 0, class196.field2967, class185.field2790) - class413.field6136;
        } else {
            if (class185.field2790 < var1) {
                class185.field2790 += (var1 - class185.field2790) * class438.field6452 / 1000 + class328.field4927;
                if (class185.field2790 > var1) {
                    class185.field2790 = var1;
                }
            }
            if (class185.field2790 > var1) {
                class185.field2790 -= class328.field4927 + ((class185.field2790 - var1) * class438.field6452 / 1000);
                if (class185.field2790 < var1) {
                    class185.field2790 = var1;
                }
            }
            if (class127.field1626 < var3) {
                class127.field1626 += (var3 - class127.field1626) * class438.field6452 / 1000 + class328.field4927;
                if (class127.field1626 > var3) {
                    class127.field1626 = var3;
                }
            }
            if (class196.field2967 < var2) {
                class196.field2967 += (var2 - class196.field2967) * class438.field6452 / 1000 + class328.field4927;
                if (var2 < class196.field2967) {
                    class196.field2967 = var2;
                }
            }
            if (class127.field1626 > var3) {
                class127.field1626 -= class328.field4927 + ((class127.field1626 - var3) * class438.field6452 / 1000);
                if (class127.field1626 < var3) {
                    class127.field1626 = var3;
                }
            }
            if (var2 < class196.field2967) {
                class196.field2967 -= (class196.field2967 - var2) * class438.field6452 / 1000 + class328.field4927;
                if (class196.field2967 < var2) {
                    class196.field2967 = var2;
                }
            }
        }
        int var4 = class174.field2666 * 128 + 64;
        int var5 = class407.field6067 * 128 + 64;
        int var6 = class437.method2686(class143.field1911, arg0 - 16384, var5, var4) - class363.field5337;
        int var7 = var4 - class185.field2790;
        int var8 = var6 - class127.field1626;
        int var9 = var5 - class196.field2967;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (arg0 != 16384) {
            method857(-67, 44);
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class350.field5204) {
            class350.field5204 += (var11 - class350.field5204 >> 3) * class176.field2674 / 1000 + class451.field6652 << 3;
            if (var11 < class350.field5204) {
                class350.field5204 = var11;
            }
        }
        if (var11 < class350.field5204) {
            class350.field5204 -= (class350.field5204 - var11 >> 3) * class176.field2674 / 1000 + class451.field6652 << 3;
            if (class350.field5204 < var11) {
                class350.field5204 = var11;
            }
        }
        int var13 = var12 - class201.field3037;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class201.field3037 += class176.field2674 * var14 / 1000 + class451.field6652 << 3;
            class201.field3037 &= 0x3FFF;
        }
        if (var14 < 0) {
            class201.field3037 -= class451.field6652 + (-var14 * class176.field2674 / 1000) << 3;
            class201.field3037 &= 0x3FFF;
        }
        int var15 = var12 - class201.field3037;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class201.field3037 = var12;
        }
        class363.field5344 = 0;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IB)V")
    public static final void method864(int arg0, byte arg1) {
        if (class75.field1016 == null) {
            class75.field1016 = new byte[4][class115.field1522][class198.field3004];
        }
        field1851++;
        if (arg0 != 16384) {
            field1853 = null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class115.field1522; var3++) {
                for (int var4 = 0; var4 < class198.field3004; var4++) {
                    class75.field1016[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
    public static void method865(int arg0) {
        field1859 = null;
        field1846 = null;
        field1852 = null;
        field1853 = null;
        field1861 = null;
        if (arg0 > -41) {
            method865(-118);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;BIILor;I[Lkr;[II)V")
    private final void method866(String arg0, byte arg1, int arg2, int arg3, class153 arg4, int arg5, class234[] arg6, int[] arg7, int arg8) {
        field1845++;
        if (arg1 != 34) {
            field1846 = null;
        }
        int var10 = arg8 - this.field1856.field4175;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg0.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class440.method2693(arg0.charAt(var14), (byte) -59) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
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
                                    int var17 = class25.method154(var16.substring(4), (byte) 127);
                                    class234 var18 = arg6[var17];
                                    int var19 = arg7 == null ? var18.method1219() : arg7[var17];
                                    if ((class51.field651 & 0xFF000000) == -16777216) {
                                        var18.method1218(arg3, this.field1856.field4175 + var10 - var19, 0, 0, 1);
                                    } else {
                                        var18.method1218(arg3, var10 + this.field1856.field4175 - var19, 1, class51.field651 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg3 += arg6[var17].method1226();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method868(var16, false);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg3 += this.field1856.method1691(-125, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class221.field3371 > 0) {
                            class164.field2292 += class221.field3371;
                            arg3 += class164.field2292 >> 8;
                            class164.field2292 &= 0xFF;
                        }
                    } else if (arg4 == null) {
                        if ((class153.field2100 & 0xFF000000) != 0) {
                            this.method742(var15, arg3 + 1, var10 + 1, class153.field2100, true);
                        }
                        this.method742(var15, arg3, var10, class51.field651, false);
                    } else {
                        if ((class153.field2100 & 0xFF000000) != 0) {
                            this.method739(var15, arg3 + 1, var10 + 1, class153.field2100, true, arg4, arg2, arg5);
                        }
                        this.method739(var15, arg3, var10, class51.field651, false, arg4, arg2, arg5);
                    }
                    int var20 = this.field1856.method1696(arg1 - 9698, var15);
                    if (class169.field2441 != -1) {
                        this.field1855.method1611(var20, var10 + ((int) ((double) this.field1856.field4175 * 0.7D)), false, arg3, class169.field2441);
                    }
                    if (class446.field6581 != -1) {
                        this.field1855.method1611(var20, var10 + this.field1856.field4175 + 1, false, arg3, class446.field6581);
                    }
                    arg3 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIZIILjava/lang/String;)V")
    public final void method867(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, String arg6) {
        field1837++;
        if (arg6 == null) {
            return;
        }
        this.method856(arg2, (byte) -107, arg4);
        if (arg3) {
            this.method858(102, -44, -30, -1, 127, (String) null);
        }
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method872(arg6, (int[]) null, arg1, 0, (class234[]) null, var9, (int[]) null, arg5 - (this.field1856.method1693(-125, arg6) / 2));
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    private final void method868(String arg0, boolean arg1) {
        try {
            if (arg1) {
                return;
            }
            if (arg0.startsWith("col=")) {
                class51.field651 = class51.field651 & 0xFF000000 | class449.method2767(arg0.substring(4), 16, (byte) 6) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class51.field651 = class51.field651 & 0xFF000000 | class406.field6039 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class51.field651 = class449.method2767(arg0.substring(5), 16, (byte) 6);
            } else if (arg0.equals("/argb")) {
                class51.field651 = class406.field6039;
            } else if (arg0.startsWith("str=")) {
                class169.field2441 = class449.method2767(arg0.substring(4), 16, (byte) 6) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class169.field2441 = -8388608;
            } else if (arg0.equals("/str")) {
                class169.field2441 = -1;
            } else if (arg0.startsWith("u=")) {
                class446.field6581 = class449.method2767(arg0.substring(2), 16, (byte) 6) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class446.field6581 = -16777216;
            } else if (arg0.equals("/u")) {
                class446.field6581 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class153.field2100 = 0;
            } else if (arg0.startsWith("shad=")) {
                class153.field2100 = class449.method2767(arg0.substring(5), 16, (byte) 6) | 0xFF000000;
            } else if (arg0.equals("shad")) {
                class153.field2100 = -16777216;
            } else if (arg0.equals("/shad")) {
                class153.field2100 = class30.field382;
            } else if (arg0.equals("br")) {
                this.method856(class30.field382, (byte) -104, class406.field6039);
            }
        } catch (Exception var3) {
        }
        field1857++;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIZLjava/lang/String;)V")
    public final void method869(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, String arg6) {
        if (!arg5) {
            return;
        }
        field1843++;
        if (arg6 == null) {
            return;
        }
        this.method856(arg3, (byte) -118, arg1);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method872(arg6, (int[]) null, arg2, 0, (class234[]) null, var10, var9, arg0 - (this.field1856.method1693(-127, arg6) / 2));
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "([I[Lkr;IIIILjava/lang/String;I)V")
    public final void method870(int[] arg0, class234[] arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field1847++;
        if (arg6 != null) {
            this.method856(arg2, (byte) -126, arg7);
            this.method866(arg6, (byte) 34, arg3, arg4, (class153) null, 0, arg1, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIII[II[Lkr;IIILor;Ljava/lang/String;III)I")
    public final int method871(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, class234[] arg7, int arg8, int arg9, int arg10, class153 arg11, String arg12, int arg13, int arg14, int arg15) {
        if (arg8 != -1636) {
            this.method742('.', 99, 72, 105, true);
        }
        field1841++;
        if (arg12 == null) {
            return 0;
        }
        this.method856(arg1, (byte) -104, arg2);
        if (arg13 == 0) {
            arg13 = this.field1856.field4175;
        }
        int[] var17;
        if (this.field1856.field4176 + this.field1856.field4172 + arg13 > arg0 && (arg13 + arg13) > arg0) {
            var17 = null;
        } else {
            var17 = new int[] { arg10 };
        }
        int var18 = this.field1856.method1698(var17, arg7, (byte) 104, arg12, class315.field4772);
        if (arg14 == 3 && var18 == 1) {
            arg14 = 1;
        }
        int var19;
        if (arg14 == 0) {
            var19 = this.field1856.field4176 + arg9;
        } else if (arg14 == 1) {
            var19 = (arg0 - this.field1856.field4176 - this.field1856.field4172 - ((var18 + -1) * arg13)) / 2 + this.field1856.field4176 + arg9;
        } else if (arg14 == 2) {
            var19 = arg9 + arg0 - ((var18 - 1) * arg13) - this.field1856.field4172;
        } else {
            int var20 = (arg0 - (this.field1856.field4176 + this.field1856.field4172) - (var18 + -1) * arg13) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var19 = this.field1856.field4176 + arg9 + var20;
            arg13 += var20;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg15 == 0) {
                this.method866(class315.field4772[var21], (byte) 34, arg3, arg6, arg11, arg4, arg7, arg5, var19);
            } else if (arg15 == 1) {
                this.method866(class315.field4772[var21], (byte) 34, arg3, (arg10 - this.field1856.method1693(arg8 + 1518, class315.field4772[var21])) / 2 + arg6, arg11, arg4, arg7, arg5, var19);
            } else if (arg15 == 2) {
                this.method866(class315.field4772[var21], (byte) 34, arg3, arg10 + arg6 - this.field1856.method1693(-97, class315.field4772[var21]), arg11, arg4, arg7, arg5, var19);
            } else if ((var18 - 1) == var21) {
                this.method866(class315.field4772[var21], (byte) 34, arg3, arg6, arg11, arg4, arg7, arg5, var19);
            } else {
                this.method861(-104, class315.field4772[var21], arg10);
                this.method866(class315.field4772[var21], (byte) 34, arg3, arg6, arg11, arg4, arg7, arg5, var19);
                class221.field3371 = 0;
            }
            var19 += arg13;
        }
        return var18;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method742(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;[III[Lkr;[I[II)V")
    private final void method872(String arg0, int[] arg1, int arg2, int arg3, class234[] arg4, int[] arg5, int[] arg6, int arg7) {
        field1848++;
        int var9 = arg2 - this.field1856.field4175;
        int var10 = -1;
        int var11 = -1;
        int var12 = arg3;
        int var13 = arg0.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class440.method2693(arg0.charAt(var14), (byte) -59) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg0.substring(var10 + 1, var14);
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
                                    if (arg5 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg5[var12];
                                    }
                                    var12++;
                                    int var19 = class25.method154(var16.substring(4), (byte) 123);
                                    class234 var20 = arg4[var19];
                                    int var21 = arg1 == null ? var20.method1219() : arg1[var19];
                                    var20.method1218(arg7 + var17, -var21 + var18 + this.field1856.field4175 + var9, 0, 0, 1);
                                    arg7 += arg4[var19].method1226();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method868(var16, false);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg7 += this.field1856.method1691(arg3 - 117, var11, var15);
                    }
                    int var22;
                    if (arg6 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg6[var12];
                    }
                    int var23;
                    if (arg5 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg5[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class153.field2100 & 0xFF000000) != 0) {
                            this.method742(var15, arg7 + var22 + 1, var9 + 1 + var23, class153.field2100, true);
                        }
                        this.method742(var15, arg7 + var22, var9 + var23, class51.field651, false);
                    } else if (class221.field3371 > 0) {
                        class164.field2292 += class221.field3371;
                        arg7 += class164.field2292 >> 8;
                        class164.field2292 &= 0xFF;
                    }
                    int var24 = this.field1856.method1696(-9664, var15);
                    if (class169.field2441 != -1) {
                        this.field1855.method1611(var24, (int) ((double) this.field1856.field4175 * 0.7D) + var9, false, arg7, class169.field2441);
                    }
                    if (class446.field6581 != -1) {
                        this.field1855.method1611(var24, this.field1856.field4175 + var9, false, arg7, class446.field6581);
                    }
                    var11 = var15;
                    arg7 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(CIIIZLor;II)V")
    public abstract void method739(char arg0, int arg1, int arg2, int arg3, boolean arg4, class153 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method873(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1858++;
        if (arg0 != null) {
            this.method856(arg4, (byte) -115, arg3);
            this.method866(arg0, (byte) 34, 0, arg5, (class153) null, arg1, (class234[]) null, (int[]) null, arg2);
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Ldr;Lgo;)V")
    public class137(class261 arg0, class272 arg1) {
        this.field1855 = arg0;
        this.field1856 = arg1;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;I[I[Lkr;ILjava/util/Random;IIII)I")
    public final int method874(String arg0, int arg1, int[] arg2, class234[] arg3, int arg4, Random arg5, int arg6, int arg7, int arg8, int arg9) {
        field1835++;
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg8);
        int var11 = (arg5.nextInt() & 0x1F) + 192;
        if (arg4 != 22501) {
            method865(-61);
        }
        this.method856(arg6 & 0xFFFFFF | var11 << 24, (byte) -103, var11 << 24 | arg9 & 0xFFFFFF);
        int var12 = arg0.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg5.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method872(arg0, arg2, arg7, 0, arg3, (int[]) null, var13, arg1);
        return var14;
    }
}
