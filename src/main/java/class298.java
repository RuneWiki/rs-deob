import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public abstract class class298 {

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "Ljp;")
    private class402 field4065;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "Lvm;")
    private class322 field4057;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "D")
    public static double field4064 = -1.0D;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;IBII)V", line = 3)
    public final void method1746(int arg0, String arg1, int arg2, byte arg3, int arg4, int arg5) {
        field4067++;
        if (arg1 == null) {
            return;
        }
        this.method1751((byte) 101, arg4, arg0);
        this.method1767(arg2, arg1, (int[]) null, arg5, 0, (class175) null, 0, (class20[]) null, 40);
        if (arg3 >= -117) {
            field4072 = 81;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 22)
    public static final void method1747(int arg0) {
        class444.field6495 = null;
        field4066++;
        class122.method648(-1, 117, class272.field3680, 0, 0, class337.field4496, 0, 0, class333.field4423);
        if (arg0 != 4) {
            field4072 = 84;
        }
        if (class444.field6495 != null) {
            class62.method334(class172.field2164, class444.field6495, class428.field6290.field2555, 0, (byte) -112, class337.field4496, class110.field1361, class333.field4423, -1412584499, 0);
            class444.field6495 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lc;I)V", line = 41)
    public static final void method1748(class158 arg0, int arg1) {
        field4059++;
        int var2 = 123 / ((arg1 + 7) / 62);
        class319 var3 = (class319) class420.field6128.method308((long) arg0.field6095, (byte) 34);
        if (var3 == null) {
            return;
        }
        if (var3.field4246 != null) {
            class374.field5265.method2213(var3.field4246);
            var3.field4246 = null;
        }
        var3.method1967(-1);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III[ILjava/util/Random;IIIII[Llg;Ljava/lang/String;[III)I", line = 66)
    public final int method1749(int arg0, int arg1, int arg2, int[] arg3, Random arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class20[] arg10, String arg11, int[] arg12, int arg13, int arg14) {
        field4069++;
        if (arg11 == null) {
            return 0;
        }
        arg4.setSeed((long) arg9);
        int var16 = (arg4.nextInt() & 0x1F) + 192;
        this.method1751((byte) -95, var16 << 24 | arg2 & 0xFFFFFF, arg14 & 0xFFFFFF | var16 << 24);
        int var17 = arg11.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = arg1; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg4.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg0;
        int var22 = arg7 + this.field4065.field5866;
        int var23 = -1;
        if (arg5 == 1) {
            var22 += (arg6 - (this.field4065.field5866 + this.field4065.field5879)) / 2;
        } else if (arg5 == 2) {
            var22 = arg7 + arg6 - this.field4065.field5879;
        }
        if (arg13 == 1) {
            var23 = this.field4065.method2526(arg11, 160) + var19;
            var21 = (arg8 - var23) / 2 + arg0;
        } else if (arg13 == 2) {
            var23 = var19 + this.field4065.method2526(arg11, 160);
            var21 = arg8 + arg0 - var23;
        }
        this.method1763(arg11, 111, var21, var22, (int[]) null, arg10, arg3, var18);
        if (arg12 != null) {
            if (var23 == -1) {
                var23 = this.field4065.method2526(arg11, 160) + var19;
            }
            arg12[1] = var22 - this.field4065.field5866;
            arg12[2] = var23;
            arg12[0] = var21;
            arg12[3] = this.field4065.field5879 + this.field4065.field5866;
        }
        return var19;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIILjava/lang/String;)V", line = 151)
    public final void method1750(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field4050++;
        if (arg5 == null) {
            return;
        }
        this.method1751((byte) 103, arg3, arg2);
        if (arg1 != 255) {
            this.method1746(1, (String) null, -7, (byte) -100, -98, 85);
        }
        this.method1767(arg0 - this.field4065.method2526(arg5, 160), arg5, (int[]) null, arg4, 0, (class175) null, 0, (class20[]) null, 33);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BII)V", line = 166)
    private final void method1751(byte arg0, int arg1, int arg2) {
        class275.field3730 = -1;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class19.field187 = 0;
        class206.field2782 = 0;
        class229.field3162 = -1;
        field4049++;
        class154.field1949 = arg2;
        class370.field5176 = arg2;
        class171.field2152 = arg1;
        class259.field3522 = arg1;
        int var4 = -90 % ((arg0 + 14) / 43);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[Llg;ILjava/lang/String;III[I)V", line = 184)
    public final void method1752(int arg0, class20[] arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field4071++;
        if (arg5 == -33 && arg3 != null) {
            this.method1751((byte) -87, arg2, arg0);
            this.method1767(arg4, arg3, arg7, arg6, 0, (class175) null, 0, arg1, 39);
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V", line = 204)
    public static final void method1753(int arg0) {
        field4068++;
        for (int var1 = 0; var1 < 5; var1++) {
            class118.field1473[var1] = false;
        }
        class294.field3993 = 1;
        class141.field1804 = -1;
        class219.field2934 = 0;
        class168.field2130 = 0;
        int var2 = -127 / ((-arg0 - 38) / 49);
        class61.field622 = -1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 227)
    private final void method1754(String arg0, byte arg1) {
        try {
            int var3 = 113 % (arg1 / 60);
            if (arg0.startsWith("col=")) {
                class370.field5176 = class370.field5176 & 0xFF000000 | class301.method1781(16, arg0.substring(4), -9) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class370.field5176 = class154.field1949 & 0xFFFFFF | class370.field5176 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class370.field5176 = class301.method1781(16, arg0.substring(5), -9);
            } else if (arg0.equals("/argb")) {
                class370.field5176 = class154.field1949;
            } else if (arg0.startsWith("str=")) {
                class229.field3162 = class301.method1781(16, arg0.substring(4), -9) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class229.field3162 = -8388608;
            } else if (arg0.equals("/str")) {
                class229.field3162 = -1;
            } else if (arg0.startsWith("u=")) {
                class275.field3730 = class301.method1781(16, arg0.substring(2), -9) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class275.field3730 = -16777216;
            } else if (arg0.equals("/u")) {
                class275.field3730 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class259.field3522 = 0;
            } else if (arg0.startsWith("shad=")) {
                class259.field3522 = class301.method1781(16, arg0.substring(5), -9) | 0xFF000000;
            } else if (arg0.equals("shad")) {
                class259.field3522 = -16777216;
            } else if (arg0.equals("/shad")) {
                class259.field3522 = class171.field2152;
            } else if (arg0.equals("br")) {
                this.method1751((byte) 62, class171.field2152, class154.field1949);
            }
        } catch (Exception var4) {
        }
        field4058++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;I[II[Llg;II)V", line = 299)
    public final void method1755(int arg0, String arg1, int arg2, int[] arg3, int arg4, class20[] arg5, int arg6, int arg7) {
        field4063++;
        if (arg1 != null) {
            this.method1751((byte) 120, arg7, arg6);
            this.method1767(arg4 - this.field4065.method2526(arg1, 160), arg1, arg3, arg0, 0, (class175) null, arg2, arg5, 33);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;B)V", line = 313)
    private final void method1756(int arg0, String arg1, byte arg2) {
        field4053++;
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
        if (arg2 > -32) {
            field4072 = -24;
        }
        if (var4 > 0) {
            class206.field2782 = (arg0 - this.field4065.method2526(arg1, 160) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;I[II[Llg;ILjava/util/Random;II)I", line = 354)
    public final int method1757(int arg0, String arg1, int arg2, int[] arg3, int arg4, class20[] arg5, int arg6, Random arg7, int arg8, int arg9) {
        field4052++;
        if (arg1 == null) {
            return 0;
        }
        arg7.setSeed((long) arg6);
        if (arg9 > -14) {
            this.method1755(72, (String) null, -51, (int[]) null, -75, (class20[]) null, -73, -74);
        }
        int var11 = (arg7.nextInt() & 0x1F) + 192;
        this.method1751((byte) -94, arg4 & 0xFFFFFF | var11 << 24, var11 << 24 | arg2 & 0xFFFFFF);
        int var12 = arg1.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg7.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1763(arg1, 109, arg8, arg0, (int[]) null, arg5, arg3, var13);
        return var14;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BIII[ILjava/lang/String;[Llg;I)V", line = 401)
    public final void method1758(byte arg0, int arg1, int arg2, int arg3, int[] arg4, String arg5, class20[] arg6, int arg7) {
        field4070++;
        if (arg5 != null) {
            this.method1751((byte) -89, arg2, arg3);
            if (arg0 == -56) {
                this.method1767(arg7 - (this.field4065.method2526(arg5, 160) / 2), arg5, arg4, arg1, 0, (class175) null, 0, arg6, 90);
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BIII)V", line = 416)
    public static final void method1759(byte arg0, int arg1, int arg2, int arg3) {
        field4056++;
        if (arg0 == -104) {
            class40 var4 = class162.method872(arg1, (byte) 92, 9);
            var4.method190(0);
            var4.field413 = arg2;
            var4.field418 = arg3;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;IIIBI)V", line = 432)
    public final void method1760(int arg0, String arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field4051++;
        if (arg1 == null) {
            return;
        }
        int var8 = 82 / ((-arg5 - 63) / 54);
        this.method1751((byte) 51, arg2, arg4);
        int var9 = arg1.length();
        int[] var10 = new int[var9];
        for (int var11 = 0; var11 < var9; var11++) {
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 2.0D) * 5.0D);
        }
        this.method1763(arg1, 119, arg6 - this.field4065.method2526(arg1, 160) / 2, arg3, var10, (class20[]) null, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)Laj;", line = 458)
    public static final class70 method1761(int arg0, int arg1) {
        field4062++;
        class114 var2 = client.field3456;
        class70 var3;
        synchronized (client.field3456) {
            var3 = (class70) client.field3456.method616(6, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class319.field4269.method1687(arg0, 32, 255);
        class70 var5 = new class70();
        if (var4 != null) {
            var5.method400(99, new class250(var4));
        }
        var5.method405(arg1 + 1134791862);
        if (arg1 != 29514) {
            method1753(-41);
        }
        class114 var6 = client.field3456;
        synchronized (client.field3456) {
            client.field3456.method615((byte) -117, (long) arg0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III[IZIILjava/lang/String;III[Llg;Lgo;III)I", line = 488)
    public final int method1762(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6, String arg7, int arg8, int arg9, int arg10, class20[] arg11, class175 arg12, int arg13, int arg14, int arg15) {
        field4047++;
        if (arg7 == null) {
            return 0;
        }
        this.method1751((byte) 79, arg2, arg15);
        if (arg6 == 0) {
            arg6 = this.field4065.field5874;
        }
        if (!arg4) {
            this.field4065 = null;
        }
        int[] var17;
        if ((this.field4065.field5866 + arg6 + this.field4065.field5879) > arg9 && arg6 + arg6 > arg9) {
            var17 = null;
        } else {
            var17 = new int[] { arg0 };
        }
        int var18 = this.field4065.method2522(arg7, arg11, var17, 100, class73.field812);
        if (arg13 == 3 && var18 == 1) {
            arg13 = 1;
        }
        int var19;
        if (arg13 == 0) {
            var19 = this.field4065.field5866 + arg8;
        } else if (arg13 == 1) {
            var19 = (arg9 - this.field4065.field5866 - this.field4065.field5879 - ((var18 + -1) * arg6)) / 2 + this.field4065.field5866 + arg8;
        } else if (arg13 == 2) {
            var19 = arg8 + arg9 - ((var18 - 1) * arg6 + this.field4065.field5879);
        } else {
            int var20 = (arg9 - this.field4065.field5866 - ((var18 - 1) * arg6) - this.field4065.field5879) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg6 += var20;
            var19 = arg8 + var20 + this.field4065.field5866;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg14 == 0) {
                this.method1767(arg5, class73.field812[var21], arg3, var19, arg1, arg12, arg10, arg11, 95);
            } else if (arg14 == 1) {
                this.method1767((arg0 - this.field4065.method2526(class73.field812[var21], 160)) / 2 + arg5, class73.field812[var21], arg3, var19, arg1, arg12, arg10, arg11, 31);
            } else if (arg14 == 2) {
                this.method1767(arg0 + arg5 - this.field4065.method2526(class73.field812[var21], 160), class73.field812[var21], arg3, var19, arg1, arg12, arg10, arg11, 33);
            } else if ((var18 - 1) == var21) {
                this.method1767(arg5, class73.field812[var21], arg3, var19, arg1, arg12, arg10, arg11, 43);
            } else {
                this.method1756(arg0, class73.field812[var21], (byte) -124);
                this.method1767(arg5, class73.field812[var21], arg3, var19, arg1, arg12, arg10, arg11, 76);
                class206.field2782 = 0;
            }
            var19 += arg6;
        }
        return var18;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;III[I[Llg;[I[I)V", line = 576)
    private final void method1763(String arg0, int arg1, int arg2, int arg3, int[] arg4, class20[] arg5, int[] arg6, int[] arg7) {
        field4061++;
        int var9 = arg3 - this.field4065.field5874;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg1 <= 106) {
            this.field4065 = null;
        }
        int var13 = arg0.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class62.method338(arg0.charAt(var14), -127) & 0xFF);
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
                                    if (arg7 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg7[var12];
                                    }
                                    int var18;
                                    if (arg4 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg4[var12];
                                    }
                                    var12++;
                                    int var19 = class359.method2196((byte) 112, var16.substring(4));
                                    class20 var20 = arg5[var19];
                                    int var21 = arg6 == null ? var20.method109() : arg6[var19];
                                    var20.method100(arg2 + var17, this.field4065.field5874 - var21 + var9 - -var18, 0, 0, 1);
                                    arg2 += arg5[var19].method101();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1754(var16, (byte) 126);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg2 += this.field4065.method2531(var11, -123, var15);
                    }
                    int var22;
                    if (arg7 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg7[var12];
                    }
                    int var23;
                    if (arg4 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg4[var12];
                    }
                    if (var15 != ' ') {
                        if ((class259.field3522 & 0xFF000000) != 0) {
                            this.method59(var15, arg2 + var22 + 1, var23 + 1 + var9, class259.field3522, true);
                        }
                        this.method59(var15, arg2 + var22, var9 + var23, class370.field5176, false);
                    } else if (class206.field2782 > 0) {
                        class19.field187 += class206.field2782;
                        arg2 += class19.field187 >> 8;
                        class19.field187 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field4065.method2520(var15, (byte) 40);
                    if (class229.field3162 != -1) {
                        this.field4057.method1857((int) ((double) this.field4065.field5874 * 0.7D) + var9, class229.field3162, 117, var24, arg2);
                    }
                    if (class275.field3730 != -1) {
                        this.field4057.method1857(this.field4065.field5874 + var9, class275.field3730, 113, var24, arg2);
                    }
                    arg2 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;IIIII)V", line = 744)
    public final void method1764(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4048++;
        if (arg1 == null) {
            return;
        }
        this.method1751((byte) 63, arg2, arg3);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = arg5; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1763(arg1, arg5 ^ 0x74, arg6 - this.field4065.method2526(arg1, 160) / 2, arg0, var10, (class20[]) null, (int[]) null, var9);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIILjava/lang/String;II)V", line = 775)
    public final void method1765(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field4073++;
        if (arg4 != 8817 || arg5 == null) {
            return;
        }
        this.method1751((byte) -63, arg0, arg2);
        double var9 = 7.0D - ((double) arg6 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg7));
        }
        this.method1763(arg5, 115, arg3 - (this.field4065.method2526(arg5, 160) / 2), arg1, var12, (class20[]) null, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 809)
    public final void method1766(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field4055++;
        if (arg0 != 552) {
            this.method62('\u0006', -91, 100, 91, false, (class175) null, 54, 6);
        }
        if (arg1 != null) {
            this.method1751((byte) -86, arg4, arg3);
            this.method1767(arg2 - (this.field4065.method2526(arg1, 160) / 2), arg1, (int[]) null, arg5, 0, (class175) null, 0, (class20[]) null, arg0 ^ 0x25E);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;[IIILgo;I[Llg;I)V", line = 826)
    private final void method1767(int arg0, String arg1, int[] arg2, int arg3, int arg4, class175 arg5, int arg6, class20[] arg7, int arg8) {
        int var10 = arg3 - this.field4065.field5874;
        field4060++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg1.length();
        int var14 = 0;
        if (arg8 <= 28) {
            field4064 = -1.7315210033448662D;
        }
        while (var13 > var14) {
            char var15 = (char) (class62.method338(arg1.charAt(var14), -126) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                label106: {
                    if (var15 == '>' && var11 != -1) {
                        String var16 = arg1.substring(var11 + 1, var14);
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
                                        int var17 = class359.method2196((byte) 99, var16.substring(4));
                                        class20 var18 = arg7[var17];
                                        int var19 = arg2 == null ? var18.method109() : arg2[var17];
                                        if ((class370.field5176 & 0xFF000000) == -16777216) {
                                            var18.method100(arg0, var10 + this.field4065.field5874 - var19, 0, 0, 1);
                                        } else {
                                            var18.method100(arg0, this.field4065.field5874 + var10 - var19, 1, class370.field5176 & 0xFF000000 | 0xFFFFFF, 1);
                                        }
                                        var12 = -1;
                                        arg0 += arg7[var17].method101();
                                    } catch (Exception var21) {
                                    }
                                } else {
                                    this.method1754(var16, (byte) 120);
                                }
                                break label106;
                            }
                            var15 = '®';
                        }
                    }
                    if (var11 == -1) {
                        if (var12 != -1) {
                            arg0 += this.field4065.method2531(var12, -113, var15);
                        }
                        if (var15 == ' ') {
                            if (class206.field2782 > 0) {
                                class19.field187 += class206.field2782;
                                arg0 += class19.field187 >> 8;
                                class19.field187 &= 0xFF;
                            }
                        } else if (arg5 == null) {
                            if ((class259.field3522 & 0xFF000000) != 0) {
                                this.method59(var15, arg0 + 1, var10 + 1, class259.field3522, true);
                            }
                            this.method59(var15, arg0, var10, class370.field5176, false);
                        } else {
                            if ((class259.field3522 & 0xFF000000) != 0) {
                                this.method62(var15, arg0 + 1, var10 + 1, class259.field3522, true, arg5, arg6, arg4);
                            }
                            this.method62(var15, arg0, var10, class370.field5176, false, arg5, arg6, arg4);
                        }
                        int var20 = this.field4065.method2520(var15, (byte) 102);
                        if (class229.field3162 != -1) {
                            this.field4057.method1857((int) ((double) this.field4065.field5874 * 0.7D) + var10, class229.field3162, 94, var20, arg0);
                        }
                        if (class275.field3730 != -1) {
                            this.field4057.method1857(this.field4065.field5874 + var10 + 1, class275.field3730, 67, var20, arg0);
                        }
                        arg0 += var20;
                        var12 = var15;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lvm;Ljp;)V", line = 976)
    public class298(class322 arg0, class402 arg1) {
        this.field4065 = arg1;
        this.field4057 = arg0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(CIIIZLgo;II)V")
    public abstract void method62(char arg0, int arg1, int arg2, int arg3, boolean arg4, class175 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method59(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
