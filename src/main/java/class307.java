import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class307 {

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Ldu;")
    private class443 field4613;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Lya;")
    private class11 field4618;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "[Z")
    public static boolean[] field4615 = new boolean[8];

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "Ltp;")
    public static class141 field4619;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lok;")
    public static class74 field4602;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Ll;Ljava/lang/String;IBI[I[I[I)V", line = 4)
    private final void method1908(class127[] arg0, String arg1, int arg2, byte arg3, int arg4, int[] arg5, int[] arg6, int[] arg7) {
        field4616++;
        int var9 = arg2 - this.field4613.field6506;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class509.method3008((byte) -123, arg1.charAt(var14)) & 0xFF);
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
                                    if (arg7 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg7[var12];
                                    }
                                    int var18;
                                    if (arg6 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg6[var12];
                                    }
                                    var12++;
                                    int var19 = class164.method1153(var16.substring(4), 10);
                                    class127 var20 = arg0[var19];
                                    int var21 = arg5 == null ? var20.method467() : arg5[var19];
                                    var20.method299(arg4 + var17, this.field4613.field6506 + var9 - var21 - -var18, 1, 0, 1);
                                    arg4 += arg0[var19].method468();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1913(106, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg4 += this.field4613.method2606(var15, (byte) 67, var11);
                    }
                    int var22;
                    if (arg7 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg7[var12];
                    }
                    int var23;
                    if (arg6 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg6[var12];
                    }
                    if (var15 != ' ') {
                        if ((class15.field201 & 0xFF000000) != 0) {
                            this.method1144(var15, arg4 + var22 + 1, var9 + var23 - -1, class15.field201, true);
                        }
                        this.method1144(var15, arg4 + var22, var9 + var23, class154.field2341, false);
                    } else if (class218.field3126 > 0) {
                        class196.field2884 += class218.field3126;
                        arg4 += class196.field2884 >> 8;
                        class196.field2884 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field4613.method2603(var15, -1);
                    if (class278.field4216 != -1) {
                        this.field4618.method107(arg4, class278.field4216, (byte) -90, (int) ((double) this.field4613.field6506 * 0.7D) + var9, var24);
                    }
                    if (class175.field2588 != -1) {
                        this.field4618.method107(arg4, class175.field2588, (byte) -90, this.field4613.field6506 + var9, var24);
                    }
                    arg4 += var24;
                    var11 = var15;
                }
            }
        }
        if (arg3 <= 102) {
            this.method1917(null, -14, (byte) 1, -86, null, 80, -48, null, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/util/Random;I[IIII[Ll;ILjava/lang/String;[IIII)I", line = 167)
    public final int method1909(int arg0, int arg1, Random arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, class127[] arg8, int arg9, String arg10, int[] arg11, int arg12, int arg13, int arg14) {
        field4599++;
        if (arg10 == null) {
            return 0;
        }
        arg2.setSeed((long) arg14);
        int var16 = (arg7 & arg2.nextInt()) + 192;
        this.method1911(var16 << 24 | arg0 & 0xFFFFFF, arg5 & 0xFFFFFF | var16 << 24, arg7 - 31);
        int var17 = arg10.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg2.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg3;
        int var22 = this.field4613.field6516 + arg1;
        int var23 = -1;
        if (arg12 == 1) {
            var22 += (arg6 - this.field4613.field6516 - this.field4613.field6503) / 2;
        } else if (arg12 == 2) {
            var22 = arg1 + arg6 - this.field4613.field6503;
        }
        if (arg13 == 1) {
            var23 = var19 + this.field4613.method2599(arg10, (byte) 75);
            var21 = (arg9 - var23) / 2 + arg3;
        } else if (arg13 == 2) {
            var23 = this.field4613.method2599(arg10, (byte) 78) + var19;
            var21 = arg9 + arg3 - var23;
        }
        this.method1908(arg8, arg10, var22, (byte) 125, var21, arg11, null, var18);
        if (arg4 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field4613.method2599(arg10, (byte) 110);
            }
            arg4[2] = var23;
            arg4[0] = var21;
            arg4[1] = var22 - this.field4613.field6516;
            arg4[3] = this.field4613.field6516 + this.field4613.field6503;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBIII)V", line = 244)
    public static final void method1910(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4606++;
        if (arg1 <= 121) {
            return;
        }
        class506 var5 = class14.method185(-1304589728, arg3, 10);
        var5.method2992(0);
        var5.field7441 = arg0;
        var5.field7445 = arg2;
        var5.field7442 = arg4;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V", line = 262)
    private final void method1911(int arg0, int arg1, int arg2) {
        field4608++;
        class196.field2884 = 0;
        class218.field3126 = arg2;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class278.field4216 = -1;
        client.field7532 = arg0;
        class154.field2341 = arg0;
        class175.field2588 = -1;
        class534.field7861 = arg1;
        class15.field201 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 283)
    public static void method1912(int arg0) {
        field4615 = null;
        field4602 = null;
        if (arg0 != 2909) {
            field4602 = null;
        }
        field4619 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)V", line = 299)
    private final void method1913(int arg0, String arg1) {
        field4600++;
        try {
            if (arg1.startsWith("col=")) {
                class154.field2341 = class154.field2341 & 0xFF000000 | class342.method2087(16, (byte) 5, arg1.substring(4)) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class154.field2341 = class154.field2341 & 0xFF000000 | client.field7532 & 0xFFFFFF;
            }
            if (arg0 <= 93) {
                this.method1917(null, 84, (byte) 23, -71, null, -55, 24, null, null);
            }
            if (arg1.startsWith("argb=")) {
                class154.field2341 = class342.method2087(16, (byte) 5, arg1.substring(5));
            } else if (arg1.equals("/argb")) {
                class154.field2341 = client.field7532;
            } else if (arg1.startsWith("str=")) {
                class278.field4216 = class154.field2341 & 0xFF000000 | class342.method2087(16, (byte) 5, arg1.substring(4));
            } else if (arg1.equals("str")) {
                class278.field4216 = class154.field2341 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class278.field4216 = -1;
            } else if (arg1.startsWith("u=")) {
                class175.field2588 = class154.field2341 & 0xFF000000 | class342.method2087(16, (byte) 5, arg1.substring(2));
            } else if (arg1.equals("u")) {
                class175.field2588 = class154.field2341 & 0xFF000000;
                return;
            } else if (arg1.equals("/u")) {
                class175.field2588 = -1;
                return;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class15.field201 = 0;
                return;
            } else if (arg1.startsWith("shad=")) {
                class15.field201 = class154.field2341 & 0xFF000000 | class342.method2087(16, (byte) 5, arg1.substring(5));
                return;
            } else if (arg1.equals("shad")) {
                class15.field201 = class154.field2341 & 0xFF000000;
                return;
            } else if (arg1.equals("/shad")) {
                class15.field201 = class534.field7861;
                return;
            } else if (arg1.equals("br")) {
                this.method1911(client.field7532, class534.field7861, 0);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V", line = 373)
    public static final void method1914(int arg0, int arg1) {
        field4617++;
        class506 var2 = class14.method185(-1304589728, arg0, 10);
        if (arg1 > 94) {
            var2.method2986(51);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;I)V", line = 388)
    public final void method1915(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field4614++;
        if (arg5 == null) {
            return;
        }
        this.method1911(arg0, arg3, 0);
        if (arg4 != 5) {
            this.method1909(-83, 20, null, 6, null, 12, -78, 111, null, -62, null, null, -118, -32, -56);
        }
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1908(null, arg5, arg1, (byte) 116, arg6 - (this.field4613.method2599(arg5, (byte) 76) / 2), null, var10, var9);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 426)
    private final void method1916(int arg0, String arg1, int arg2) {
        field4605++;
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
        if (arg0 != -12813) {
            this.method1926(-5, -22, -62, 92, 65, 30, 15, null);
        }
        if (var4 > 0) {
            class218.field3126 = (arg2 - this.field4613.method2599(arg1, (byte) 77) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Ll;IBILjava/lang/String;IILma;[I)V", line = 466)
    private final void method1917(class127[] arg0, int arg1, byte arg2, int arg3, String arg4, int arg5, int arg6, class249 arg7, int[] arg8) {
        int var10 = arg6 - this.field4613.field6506;
        field4597++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg4.length();
        if (arg2 <= 70) {
            return;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class509.method3008((byte) -123, arg4.charAt(var14)) & 0xFF);
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
                                    int var17 = class164.method1153(var16.substring(4), 10);
                                    class127 var18 = arg0[var17];
                                    int var19 = arg8 == null ? var18.method467() : arg8[var17];
                                    if ((class154.field2341 & 0xFF000000) == -16777216) {
                                        var18.method299(arg1, var10 + this.field4613.field6506 - var19, 1, 0, 1);
                                    } else {
                                        var18.method299(arg1, var10 - (var19 - this.field4613.field6506), 0, class154.field2341 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg1 += arg0[var17].method468();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1913(116, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg1 += this.field4613.method2606(var15, (byte) -116, var12);
                    }
                    if (var15 == ' ') {
                        if (class218.field3126 > 0) {
                            class196.field2884 += class218.field3126;
                            arg1 += class196.field2884 >> 8;
                            class196.field2884 &= 0xFF;
                        }
                    } else if (arg7 == null) {
                        if ((class15.field201 & 0xFF000000) != 0) {
                            this.method1144(var15, arg1 + 1, var10 + 1, class15.field201, true);
                        }
                        this.method1144(var15, arg1, var10, class154.field2341, false);
                    } else {
                        if ((class15.field201 & 0xFF000000) != 0) {
                            this.method1145(var15, arg1 + 1, var10 + 1, class15.field201, true, arg7, arg5, arg3);
                        }
                        this.method1145(var15, arg1, var10, class154.field2341, false, arg7, arg5, arg3);
                    }
                    int var20 = this.field4613.method2603(var15, -1);
                    if (class278.field4216 != -1) {
                        this.field4618.method107(arg1, class278.field4216, (byte) -90, (int) ((double) this.field4613.field6506 * 0.7D) + var10, var20);
                    }
                    if (class175.field2588 != -1) {
                        this.field4618.method107(arg1, class175.field2588, (byte) -90, this.field4613.field6506 + var10 + 1, var20);
                    }
                    arg1 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;I)V", line = 618)
    public final void method1918(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field4601++;
        if (arg4 != null) {
            this.method1911(arg2, arg0, 0);
            this.method1917(null, arg5, (byte) 86, 0, arg4, 0, arg1, null, null);
            int var7 = -26 / ((63 - arg3) / 57);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II[I[Ll;ILjava/util/Random;)I", line = 639)
    public final int method1919(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int[] arg6, class127[] arg7, int arg8, Random arg9) {
        field4604++;
        if (arg3 == null) {
            return 0;
        }
        arg9.setSeed((long) arg0);
        int var11 = (arg9.nextInt() & 0x1F) + 192;
        this.method1911(var11 << 24 | arg2 & 0xFFFFFF, arg1 & 0xFFFFFF | var11 << 24, 0);
        int var12 = arg3.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        if (arg4 != 1) {
            return -50;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg9.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1908(arg7, arg3, arg8, (byte) 118, arg5, arg6, null, var13);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;[IIIILma;IIIIII[Ll;II)I", line = 676)
    public final int method1920(int arg0, int arg1, String arg2, int[] arg3, int arg4, int arg5, int arg6, class249 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class127[] arg14, int arg15, int arg16) {
        field4598++;
        if (arg2 == null) {
            return 0;
        }
        this.method1911(arg12, arg11, 0);
        if (arg10 == 0) {
            arg10 = this.field4613.field6506;
        }
        int[] var18;
        if (arg0 < this.field4613.field6516 + this.field4613.field6503 + arg10 && arg10 + arg10 > arg0) {
            var18 = null;
        } else {
            var18 = new int[] { arg8 };
        }
        int var19 = this.field4613.method2601(class163.field2430, var18, arg14, arg2, arg15);
        if (arg5 == -1) {
            arg5 = arg0 / arg10;
            if (arg5 <= 0) {
                arg5 = 1;
            }
        }
        if (arg5 > 0 && arg5 <= var19) {
            var19 = arg5;
            class163.field2430[arg5 - 1] = this.field4613.method2597(arg14, arg8, class163.field2430[arg5 - 1], -1);
        }
        if (arg1 == 3 && var19 == 1) {
            arg1 = 1;
        }
        int var20;
        if (arg1 == 0) {
            var20 = this.field4613.field6516 + arg6;
        } else if (arg1 == 1) {
            var20 = (arg0 - this.field4613.field6516 - this.field4613.field6503 - ((var19 + -1) * arg10)) / 2 + (arg6 + this.field4613.field6516);
        } else if (arg1 == 2) {
            var20 = arg0 + arg6 - ((var19 - 1) * arg10) - this.field4613.field6503;
        } else {
            int var21 = (arg0 - ((var19 - 1) * arg10) - this.field4613.field6503 - this.field4613.field6516) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg10 += var21;
            var20 = arg6 + var21 + this.field4613.field6516;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg16 == 0) {
                this.method1917(arg14, arg4, (byte) 73, arg9, class163.field2430[var22], arg13, var20, arg7, arg3);
            } else if (arg16 == 1) {
                this.method1917(arg14, (arg8 - this.field4613.method2599(class163.field2430[var22], (byte) 67)) / 2 + arg4, (byte) 97, arg9, class163.field2430[var22], arg13, var20, arg7, arg3);
            } else if (arg16 == 2) {
                this.method1917(arg14, arg4 + arg8 - this.field4613.method2599(class163.field2430[var22], (byte) 60), (byte) 124, arg9, class163.field2430[var22], arg13, var20, arg7, arg3);
            } else if (var19 - 1 == var22) {
                this.method1917(arg14, arg4, (byte) 104, arg9, class163.field2430[var22], arg13, var20, arg7, arg3);
            } else {
                this.method1916(-12813, class163.field2430[var22], arg8);
                this.method1917(arg14, arg4, (byte) 107, arg9, class163.field2430[var22], arg13, var20, arg7, arg3);
                class218.field3126 = 0;
            }
            var20 += arg10;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;)V", line = 778)
    public final void method1921(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field4612++;
        if (arg5 != null) {
            this.method1911(arg2, arg4, 0);
            this.method1917(null, arg1 - this.field4613.method2599(arg5, (byte) 110), (byte) 117, 0, arg5, arg3, arg0, null, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V", line = 790)
    public final void method1922(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field4607++;
        if (arg0 != 23063) {
            this.method1917(null, 122, (byte) -127, -105, null, -122, 48, null, null);
        }
        if (arg3 != null) {
            this.method1911(arg2, arg1, arg0 - 23063);
            this.method1917(null, arg4 - (this.field4613.method2599(arg3, (byte) 85) / 2), (byte) 114, 0, arg3, 0, arg5, null, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[IIII[Ll;ILjava/lang/String;)V", line = 808)
    public final void method1923(int arg0, int[] arg1, int arg2, int arg3, int arg4, class127[] arg5, int arg6, String arg7) {
        int var9 = -70 / ((arg3 + 62) / 48);
        field4610++;
        if (arg7 != null) {
            this.method1911(arg2, arg6, 0);
            this.method1917(arg5, arg0, (byte) 113, 0, arg7, 0, arg4, null, arg1);
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lya;Ldu;)V", line = 822)
    public class307(class11 arg0, class443 arg1) {
        this.field4613 = arg1;
        this.field4618 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Ll;IIIIIIBII[IIILma;ILjava/lang/String;)I", line = 837)
    public final int method1924(class127[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12, class249 arg13, int arg14, String arg15) {
        field4609++;
        if (arg7 != 115) {
            field4602 = null;
        }
        return this.method1920(arg4, arg5, arg15, arg10, arg14, 0, arg9, arg13, arg11, arg2, arg3, arg1, arg6, arg8, arg0, arg7 ^ 0x73, arg12);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IIIIILjava/lang/String;I)V", line = 848)
    public final void method1925(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field4611++;
        if (arg5 == null) {
            return;
        }
        this.method1911(arg1, arg3, arg4 - 5);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        if (arg4 != 5) {
            this.field4613 = null;
        }
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1908(null, arg5, arg0, (byte) 105, arg6 - (this.field4613.method2599(arg5, (byte) 85) / 2), null, var9, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V", line = 875)
    public final void method1926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field4603++;
        if (arg7 == null) {
            return;
        }
        this.method1911(arg0, arg2, 0);
        double var9 = 7.0D - ((double) arg3 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        if (arg1 != -10919) {
            this.method1922(-123, 118, 47, null, 102, 5);
        }
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg4));
        }
        this.method1908(null, arg7, arg6, (byte) 115, arg5 - (this.field4613.method2599(arg7, (byte) 114) / 2), null, var12, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLma;II)V")
    public abstract void method1145(char arg0, int arg1, int arg2, int arg3, boolean arg4, class249 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method1144(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
