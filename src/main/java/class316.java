import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class316 {

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Lli;")
    private class297 field4041;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Lya;")
    private class38 field4028;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Lkg;")
    public static class179 field4033 = new class179(70, 7);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)V")
    private final void method1848(byte arg0, String arg1) {
        if (arg0 < 85) {
            return;
        }
        try {
            if (arg1.startsWith("col=")) {
                class174.field2251 = class174.field2251 & 0xFF000000 | class484.method2942(9474, arg1.substring(4), 16) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class174.field2251 = class42.field516 & 0xFFFFFF | class174.field2251 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class174.field2251 = class484.method2942(9474, arg1.substring(5), 16);
            } else if (arg1.equals("/argb")) {
                class174.field2251 = class42.field516;
            } else if (arg1.startsWith("str=")) {
                class513.field7442 = class174.field2251 & 0xFF000000 | class484.method2942(9474, arg1.substring(4), 16);
            } else if (arg1.equals("str")) {
                class513.field7442 = class174.field2251 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class513.field7442 = -1;
            } else if (arg1.startsWith("u=")) {
                class269.field3403 = class174.field2251 & 0xFF000000 | class484.method2942(9474, arg1.substring(2), 16);
            } else if (arg1.equals("u")) {
                class269.field3403 = class174.field2251 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class269.field3403 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class357.field4588 = 0;
            } else if (arg1.startsWith("shad=")) {
                class357.field4588 = class174.field2251 & 0xFF000000 | class484.method2942(9474, arg1.substring(5), 16);
            } else if (arg1.equals("shad")) {
                class357.field4588 = class174.field2251 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class357.field4588 = class443.field6362;
            } else if (arg1.equals("br")) {
                this.method1865(false, class443.field6362, class42.field516);
            }
        } catch (Exception var3) {
        }
        field4040++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZLjava/lang/String;II)V")
    public final void method1849(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5) {
        field4039++;
        if (arg3 != null) {
            this.method1865(arg2, arg4, arg1);
            this.method1866(arg3, arg5, null, 0, null, 122, arg0, null, 0);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZII)I")
    public static final int method1850(int arg0, boolean arg1, int arg2, int arg3) {
        field4031++;
        class529 var4 = class290.method1705(0, arg1, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field7794.length; var6++) {
                if (var4.field7796[var6] == arg0) {
                    var5 += var4.field7794[var6];
                }
            }
            if (arg2 >= -28) {
                field4042 = 25;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLma;II)V")
    public abstract void method42(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method1851(int arg0) {
        field4033 = null;
        if (arg0 != -1) {
            field4043 = 66;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public final void method1852(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field4037++;
        if (arg4 == null) {
            return;
        }
        this.method1865(false, arg3, arg5);
        if (arg1 != -32458) {
            this.method1864(-26, null, -66, null, null, null, null, 71);
        }
        this.method1866(arg4, arg0, null, 0, null, 127, arg2 - (this.field4041.method1757((byte) 117, arg4) / 2), null, 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[IIIIIIIILjava/lang/String;[Ll;Lma;III)I")
    public final int method1853(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, String arg10, class16[] arg11, class10 arg12, int arg13, int arg14, int arg15) {
        field4021++;
        if (arg3 <= 4) {
            field4043 = 53;
        }
        return this.method1854(arg9, arg0, arg12, arg6, arg8, arg4, arg5, arg15, arg14, arg13, arg7, arg2, arg10, arg1, 1, 0, arg11);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILma;IIIIIIII[ILjava/lang/String;III[Ll;)I")
    public final int method1854(int arg0, int arg1, class10 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int[] arg11, String arg12, int arg13, int arg14, int arg15, class16[] arg16) {
        field4024++;
        if (arg12 == null) {
            return 0;
        }
        this.method1865(false, arg1, arg7);
        if (arg4 == 0) {
            arg4 = this.field4041.field3814;
        }
        int[] var18;
        if (this.field4041.field3824 + this.field4041.field3823 + arg4 > arg10 && arg10 < arg4 + arg4) {
            var18 = null;
        } else {
            var18 = new int[] { arg3 };
        }
        if (arg15 == -1) {
            arg15 = arg10 / arg4;
            if (arg15 <= 0) {
                arg15 = 1;
            }
        }
        int var19 = this.field4041.method1748(arg12, arg16, 103, var18, class376.field4946);
        if (arg15 > 0 && var19 >= arg15) {
            var19 = arg15;
            class376.field4946[arg15 - 1] = this.field4041.method1745((byte) 27, class376.field4946[arg15 - 1], arg3, arg16);
        }
        if (arg8 == 3 && var19 == 1) {
            arg8 = 1;
        }
        int var20;
        if (arg8 == 0) {
            var20 = this.field4041.field3823 + arg13;
        } else if (arg8 == 1) {
            var20 = this.field4041.field3823 + arg13 + ((-this.field4041.field3823 + arg10 - ((var19 + -1) * arg4 + this.field4041.field3824)) / 2);
        } else if (arg8 == 2) {
            var20 = arg10 + arg13 - (var19 - 1) * arg4 - this.field4041.field3824;
        } else {
            int var21 = (arg10 - this.field4041.field3823 - (var19 - 1) * arg4 - this.field4041.field3824) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = this.field4041.field3823 + var21 + arg13;
            arg4 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg6 == 0) {
                this.method1866(class376.field4946[var22], var20, arg16, arg5, arg11, 123, arg0, arg2, arg9);
            } else if (arg6 == 1) {
                this.method1866(class376.field4946[var22], var20, arg16, arg5, arg11, arg14 ^ 0x7A, arg0 + (arg3 - this.field4041.method1757((byte) -124, class376.field4946[var22])) / 2, arg2, arg9);
            } else if (arg6 == 2) {
                this.method1866(class376.field4946[var22], var20, arg16, arg5, arg11, arg14 + 126, -this.field4041.method1757((byte) -128, class376.field4946[var22]) + (arg0 - -arg3), arg2, arg9);
            } else if (var19 - 1 == var22) {
                this.method1866(class376.field4946[var22], var20, arg16, arg5, arg11, 122, arg0, arg2, arg9);
            } else {
                this.method1860(class376.field4946[var22], arg3, (byte) -64);
                this.method1866(class376.field4946[var22], var20, arg16, arg5, arg11, arg14 + 126, arg0, arg2, arg9);
                class281.field3579 = 0;
            }
            var20 += arg4;
        }
        if (arg14 != 1) {
            this.field4041 = null;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IIZI[I[Ll;ILjava/lang/String;ILjava/util/Random;IIIII)I")
    public final int method1855(int[] arg0, int arg1, boolean arg2, int arg3, int[] arg4, class16[] arg5, int arg6, String arg7, int arg8, Random arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field4030++;
        if (!arg2) {
            field4033 = null;
        }
        if (arg7 == null) {
            return 0;
        }
        arg9.setSeed((long) arg6);
        int var16 = (arg9.nextInt() & 0x1F) + 192;
        this.method1865(false, arg12 & 0xFFFFFF | var16 << 24, var16 << 24 | arg13 & 0xFFFFFF);
        int var17 = arg7.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg9.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg1;
        int var22 = this.field4041.field3823 + arg11;
        int var23 = -1;
        if (arg3 == 1) {
            var22 += (arg10 - this.field4041.field3823 - this.field4041.field3824) / 2;
        } else if (arg3 == 2) {
            var22 = arg11 + arg10 - this.field4041.field3824;
        }
        if (arg8 == 1) {
            var23 = var19 + this.field4041.method1757((byte) -37, arg7);
            var21 = (arg14 - var23) / 2 + arg1;
        } else if (arg8 == 2) {
            var23 = this.field4041.method1757((byte) 81, arg7) + var19;
            var21 = arg14 + arg1 - var23;
        }
        this.method1864(var22, arg0, 115, null, arg5, arg7, var18, var21);
        if (arg4 != null) {
            if (var23 == -1) {
                var23 = this.field4041.method1757((byte) -127, arg7) + var19;
            }
            arg4[2] = var23;
            arg4[3] = this.field4041.field3824 + this.field4041.field3823;
            arg4[1] = var22 - this.field4041.field3823;
            arg4[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[II[Ll;IILjava/lang/String;I)V")
    public final void method1856(int arg0, int[] arg1, int arg2, class16[] arg3, int arg4, int arg5, String arg6, int arg7) {
        field4022++;
        if (arg6 == null) {
            return;
        }
        this.method1865(false, arg2, arg7);
        this.method1866(arg6, arg4, arg3, 0, arg1, 127, arg5, null, 0);
        if (arg0 <= 44) {
            this.method1848((byte) 72, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method1857(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field4029++;
        if (arg3 == null) {
            return;
        }
        this.method1865(false, arg5, arg6);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        for (int var10 = arg0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg4 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1864(arg1, null, 121, var9, null, arg3, null, arg2 - (this.field4041.method1757((byte) -126, arg3) / 2));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
    public final void method1858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field4027++;
        if (arg6 == null) {
            return;
        }
        this.method1865(false, arg7, arg2);
        double var9 = 7.0D - ((double) arg1 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg6.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg5) * var9);
        }
        if (arg4 != -16139) {
            field4033 = null;
        }
        this.method1864(arg0, null, 127, var12, null, arg6, null, arg3 - (this.field4041.method1757((byte) 24, arg6) / 2));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([[II)V")
    public static final void method1859(int[][] arg0, int arg1) {
        class387.field5088 = arg0;
        field4035++;
        if (arg1 != 0) {
            field4042 = 13;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    private final void method1860(String arg0, int arg1, byte arg2) {
        field4023++;
        if (arg2 != -64) {
            field4042 = 5;
        }
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg0.length(); var6++) {
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
            class281.field3579 = (arg1 - this.field4041.method1757((byte) -124, arg0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method1861(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field4026++;
        if (arg4 == null) {
            return;
        }
        if (arg2 != 5) {
            this.method1862(null, -52, 123, null, 107, -19, null, null, 76, 52);
        }
        this.method1865(false, arg5, arg3);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1864(arg1, null, 126, var10, null, arg4, var9, arg6 - (this.field4041.method1757((byte) 21, arg4) / 2));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IIILjava/util/Random;IILjava/lang/String;[Ll;II)I")
    public final int method1862(int[] arg0, int arg1, int arg2, Random arg3, int arg4, int arg5, String arg6, class16[] arg7, int arg8, int arg9) {
        field4034++;
        if (arg6 == null) {
            return 0;
        }
        arg3.setSeed((long) arg2);
        int var11 = (arg3.nextInt() & 0x1F) + 192;
        this.method1865(false, var11 << 24 | arg8 & 0xFFFFFF, var11 << 24 | arg4 & 0xFFFFFF);
        int var12 = arg6.length();
        int[] var13 = new int[var12];
        int var14 = arg1;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg3.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1864(arg5, arg0, arg1 ^ 0x75, null, arg7, arg6, var13, arg9);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIBII)V")
    public final void method1863(String arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field4020++;
        if (arg0 == null) {
            return;
        }
        this.method1865(false, arg5, arg2);
        this.method1866(arg0, arg1, null, 0, null, 121, arg4 - this.field4041.method1757((byte) 119, arg0), null, 0);
        if (arg3 >= -6) {
            field4042 = 62;
        }
    }

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method40(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[II[I[Ll;Ljava/lang/String;[II)V")
    private final void method1864(int arg0, int[] arg1, int arg2, int[] arg3, class16[] arg4, String arg5, int[] arg6, int arg7) {
        int var9 = arg0 - this.field4041.field3814;
        field4038++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg5.length();
        if (arg2 <= 113) {
            field4042 = 1;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class122.method871(arg5.charAt(var14), false) & 0xFF);
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
                                    if (arg6 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg6[var12];
                                    }
                                    int var18;
                                    if (arg3 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg3[var12];
                                    }
                                    var12++;
                                    int var19 = class521.method3099(var16.substring(4), 94);
                                    class16 var20 = arg4[var19];
                                    int var21 = arg1 == null ? var20.method131() : arg1[var19];
                                    var20.method139(arg7 + var17, this.field4041.field3814 + var9 - (var21 - var18), 1, 0, 1);
                                    var11 = -1;
                                    arg7 += arg4[var19].method148();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1848((byte) 122, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg7 += this.field4041.method1750(var11, var15, 0);
                    }
                    int var22;
                    if (arg6 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg6[var12];
                    }
                    int var23;
                    if (arg3 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg3[var12];
                    }
                    if (var15 != ' ') {
                        if ((class357.field4588 & 0xFF000000) != 0) {
                            this.method40(var15, arg7 + var22 + 1, var9 + 1 - -var23, class357.field4588, true);
                        }
                        this.method40(var15, arg7 + var22, var9 + var23, class174.field2251, false);
                    } else if (class281.field3579 > 0) {
                        class350.field4503 += class281.field3579;
                        arg7 += class350.field4503 >> 8;
                        class350.field4503 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field4041.method1749(var15, -79);
                    if (class513.field7442 != -1) {
                        this.field4028.method373(var24, arg7, 1, class513.field7442, (int) ((double) this.field4041.field3814 * 0.7D) + var9);
                    }
                    if (class269.field3403 != -1) {
                        this.field4028.method373(var24, arg7, 1, class269.field3403, var9 + this.field4041.field3814);
                    }
                    arg7 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZII)V")
    private final void method1865(boolean arg0, int arg1, int arg2) {
        field4036++;
        class42.field516 = arg2;
        class174.field2251 = arg2;
        class281.field3579 = 0;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class513.field7442 = -1;
        class350.field4503 = 0;
        class269.field3403 = -1;
        if (!arg0) {
            class443.field6362 = arg1;
            class357.field4588 = arg1;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I[Ll;I[IIILma;I)V")
    private final void method1866(String arg0, int arg1, class16[] arg2, int arg3, int[] arg4, int arg5, int arg6, class10 arg7, int arg8) {
        field4025++;
        int var10 = arg1 - this.field4041.field3814;
        int var11 = -1;
        if (arg5 < 119) {
            this.method1857(28, 24, -71, null, 4, 125, -46);
        }
        int var12 = -1;
        int var13 = arg0.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class122.method871(arg0.charAt(var14), false) & 0xFF);
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
                                    int var17 = class521.method3099(var16.substring(4), 29);
                                    class16 var18 = arg2[var17];
                                    int var19 = arg4 == null ? var18.method131() : arg4[var17];
                                    if ((class174.field2251 & 0xFF000000) == -16777216) {
                                        var18.method139(arg6, this.field4041.field3814 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method139(arg6, var10 + this.field4041.field3814 - var19, 0, class174.field2251 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg6 += arg2[var17].method148();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1848((byte) 113, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg6 += this.field4041.method1750(var12, var15, 0);
                    }
                    if (var15 == ' ') {
                        if (class281.field3579 > 0) {
                            class350.field4503 += class281.field3579;
                            arg6 += class350.field4503 >> 8;
                            class350.field4503 &= 0xFF;
                        }
                    } else if (arg7 == null) {
                        if ((class357.field4588 & 0xFF000000) != 0) {
                            this.method40(var15, arg6 + 1, var10 - -1, class357.field4588, true);
                        }
                        this.method40(var15, arg6, var10, class174.field2251, false);
                    } else {
                        if ((class357.field4588 & 0xFF000000) != 0) {
                            this.method42(var15, arg6 + 1, var10 - -1, class357.field4588, true, arg7, arg3, arg8);
                        }
                        this.method42(var15, arg6, var10, class174.field2251, false, arg7, arg3, arg8);
                    }
                    int var20 = this.field4041.method1749(var15, 99);
                    if (class513.field7442 != -1) {
                        this.field4028.method373(var20, arg6, 1, class513.field7442, var10 + ((int) ((double) this.field4041.field3814 * 0.7D)));
                    }
                    if (class269.field3403 != -1) {
                        this.field4028.method373(var20, arg6, 1, class269.field3403, this.field4041.field3814 + var10 + 1);
                    }
                    var12 = var15;
                    arg6 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lya;Lli;)V")
    public class316(class38 arg0, class297 arg1) {
        this.field4041 = arg1;
        this.field4028 = arg0;
    }
}
