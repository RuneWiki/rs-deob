import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class301 {

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "Loa;")
    private class689 field4021;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "Lil;")
    private class598 field4024;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Lnc;")
    public static class580 field4011 = new class580();

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Ljj;")
    public static class398 field4015 = new class398(6, 0);

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Ljj;")
    public static class398 field4020 = new class398(79, 8);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZILjava/lang/String;III)V", line = 4)
    public final void method1801(int arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field4004++;
        if (arg3 == null) {
            return;
        }
        this.method1813(arg4, arg2, 1);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        if (arg1) {
            this.method1817(null, 41, 6, -83, null, (byte) 94, -55, 82, 93, null, null, -29, 78, -85, -49, -64);
        }
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1814(null, arg6, arg5 - (this.field4024.method3312(-23728, arg3) / 2), var9, -126, null, null, arg3);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;III)V", line = 34)
    public final void method1802(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field4003++;
        if (arg2 == null) {
            return;
        }
        this.method1813(arg1, arg4, 1);
        if (arg5 != -28812) {
            this.method1803(null, 24, 80, 10, (byte) -87, 49);
        }
        this.method1804(null, null, 0, null, arg0 - (this.field4024.method3312(-23728, arg2) / 2), arg2, 0, arg3, (byte) -32);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;IIIBI)V", line = 56)
    public final void method1803(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field4018++;
        if (arg0 != null) {
            int var7 = 14 % ((arg4 - 55) / 46);
            this.method1813(arg1, arg5, 1);
            this.method1804(null, null, 0, null, arg3 - this.field4024.method3312(-23728, arg0), arg0, 0, arg2, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lfa;[II[Lxa;ILjava/lang/String;IIB)V", line = 71)
    private final void method1804(class185 arg0, int[] arg1, int arg2, class424[] arg3, int arg4, String arg5, int arg6, int arg7, byte arg8) {
        field4016++;
        int var10 = arg7 - this.field4024.field8183;
        int var11 = -1;
        if (arg8 != -32) {
            this.method1811(72, -128, null, null, 92, null, -34, null, -119, (byte) 37);
        }
        int var12 = -1;
        int var13 = arg5.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class9.method61(arg5.charAt(var14), arg8 + 2206) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg5.substring(var11 + 1, var14);
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
                                    int var17 = class433.method2495(var16.substring(4), 0);
                                    class424 var18 = arg3[var17];
                                    int var19 = arg1 == null ? var18.method1157() : arg1[var17];
                                    if ((class412.field5777 & 0xFF000000) == -16777216) {
                                        var18.method67(arg4, this.field4024.field8183 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method67(arg4, this.field4024.field8183 + var10 - var19, 0, class412.field5777 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg4 += arg3[var17].method1160();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1812((byte) -103, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg4 += this.field4024.method3316(var15, var12, arg8 + 32);
                    }
                    if (var15 == ' ') {
                        if (class552.field7554 > 0) {
                            class523.field7243 += class552.field7554;
                            arg4 += class523.field7243 >> 8;
                            class523.field7243 &= 0xFF;
                        }
                    } else if (arg0 == null) {
                        if ((class150.field1886 & 0xFF000000) != 0) {
                            this.method1099(var15, arg4 + 1, var10 - -1, class150.field1886, true);
                        }
                        this.method1099(var15, arg4, var10, class412.field5777, false);
                    } else {
                        if ((class150.field1886 & 0xFF000000) != 0) {
                            this.method1103(var15, arg4 + 1, var10 + 1, class150.field1886, true, arg0, arg2, arg6);
                        }
                        this.method1103(var15, arg4, var10, class412.field5777, false, arg0, arg2, arg6);
                    }
                    int var20 = this.field4024.method3317(var15, false);
                    if (class79.field1000 != -1) {
                        this.field4021.method3814(1, var20, (int) ((double) this.field4024.field8183 * 0.7D) + var10, class79.field1000, arg4);
                    }
                    if (class149.field1882 != -1) {
                        this.field4021.method3814(arg8 ^ 0xFFFFFFE1, var20, this.field4024.field8183 + var10 + 1, class149.field1882, arg4);
                    }
                    var12 = var15;
                    arg4 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIILjava/lang/String;II)V", line = 221)
    public final void method1805(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field4014++;
        if (arg5 == null) {
            return;
        }
        this.method1813(arg6, arg2, 1);
        double var9 = 7.0D - (double) arg3 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5.length();
        int[] var12 = new int[var11];
        for (int var13 = arg7; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg0) * var9);
        }
        this.method1814(null, arg4, arg1 - this.field4024.method3312(arg7 ^ 0xFFFFA350, arg5) / 2, var12, arg7 ^ 0xFFFFFF84, null, null, arg5);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[IIIIILfa;[Lxa;Ljava/lang/String;IIIBIIII)I", line = 253)
    public final int method1806(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, class185 arg6, class424[] arg7, String arg8, int arg9, int arg10, int arg11, byte arg12, int arg13, int arg14, int arg15, int arg16) {
        field4010++;
        if (arg8 == null) {
            return 0;
        }
        this.method1813(arg13, arg15, arg12 ^ 0xFFFFFFCF);
        if (arg14 == 0) {
            arg14 = this.field4024.field8183;
        }
        int[] var18;
        if (arg9 < this.field4024.field8188 + this.field4024.field8190 + arg14 && arg9 < arg14 + arg14) {
            var18 = null;
        } else {
            var18 = new int[] { arg16 };
        }
        int var19 = this.field4024.method3311(arg8, class109.field1313, arg7, var18, 115);
        if (arg2 == -1) {
            arg2 = arg9 / arg14;
            if (arg2 <= 0) {
                arg2 = 1;
            }
        }
        if (arg2 > 0 && arg2 <= var19) {
            class109.field1313[arg2 - 1] = this.field4024.method3310(class109.field1313[arg2 - 1], arg16, arg7, (byte) -128);
            var19 = arg2;
        }
        if (arg0 == 3 && var19 == 1) {
            arg0 = 1;
        }
        int var20;
        if (arg0 == 0) {
            var20 = this.field4024.field8188 + arg10;
        } else if (arg0 == 1) {
            var20 = this.field4024.field8188 + ((arg9 - this.field4024.field8190 - ((var19 + -1) * arg14) - this.field4024.field8188) / 2) + arg10;
        } else if (arg0 == 2) {
            var20 = arg10 + arg9 - ((var19 + -1) * arg14) - this.field4024.field8190;
        } else {
            int var21 = (arg9 - ((var19 - 1) * arg14) - (this.field4024.field8190 + this.field4024.field8188)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg14 += var21;
            var20 = this.field4024.field8188 + arg10 + var21;
        }
        if (arg12 != -50) {
            this.method1816(115, -66, null, null, null, 62, (byte) -93, -94);
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg4 == 0) {
                this.method1804(arg6, arg1, arg5, arg7, arg11, class109.field1313[var22], arg3, var20, (byte) -32);
            } else if (arg4 == 1) {
                this.method1804(arg6, arg1, arg5, arg7, arg11 + (arg16 - this.field4024.method3312(arg12 - 23678, class109.field1313[var22])) / 2, class109.field1313[var22], arg3, var20, (byte) -32);
            } else if (arg4 == 2) {
                this.method1804(arg6, arg1, arg5, arg7, arg11 + arg16 - this.field4024.method3312(-23728, class109.field1313[var22]), class109.field1313[var22], arg3, var20, (byte) -32);
            } else if (var19 - 1 == var22) {
                this.method1804(arg6, arg1, arg5, arg7, arg11, class109.field1313[var22], arg3, var20, (byte) -32);
            } else {
                this.method1810(arg16, -105, class109.field1313[var22]);
                this.method1804(arg6, arg1, arg5, arg7, arg11, class109.field1313[var22], arg3, var20, (byte) -32);
                class552.field7554 = 0;
            }
            var20 += arg14;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lu;I)I", line = 356)
    public static final int method1807(class69 arg0, int arg1) {
        field4008++;
        String var2 = class192.method1229(arg1 ^ 0xFFFF8137, arg0);
        int[] var3 = null;
        if (class431.method2482(arg0.field902, 21284)) {
            var3 = class237.field3088.method1349(-1, (int) arg0.field900).field9316;
        } else if (arg0.field905 != -1) {
            var3 = class237.field3088.method1349(-1, arg0.field905).field9316;
        } else if (class668.method3705(arg0.field902, false)) {
            class637 var4 = (class637) class77.field955.method2506(31, (long) ((int) arg0.field900));
            if (var4 != null) {
                class676 var5 = var4.field8702;
                class195 var6 = var5.field9594;
                if (var6.field2557 != null) {
                    var6 = var6.method1242(class327.field4771, (byte) -32);
                }
                if (var6 != null) {
                    var3 = var6.field2574;
                }
            }
        } else if (class488.method2718(arg0.field902, -17)) {
            Object var7 = null;
            class252 var8;
            if (arg0.field902 == 1006) {
                var8 = class578.field7980.method1746((int) arg0.field900, (byte) 82);
            } else {
                var8 = class578.field7980.method1746((int) (arg0.field900 >>> 32 & 0x7FFFFFFFL), (byte) 81);
            }
            if (var8.field3391 != null) {
                var8 = var8.method1568(arg1 ^ 0x7EB8, class327.field4771);
            }
            if (var8 != null) {
                var3 = var8.field3468;
            }
        }
        if (var3 != null) {
            var2 = var2 + class436.method2511(0, var3);
        }
        int var9 = class446.field6129.method3313(class367.field5293, (byte) -102, var2);
        if (arg1 != -32441) {
            field4015 = null;
        }
        if (arg0.field903) {
            var9 += class261.field3605.method1159() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 432)
    public static void method1808(int arg0) {
        field4015 = null;
        field4011 = null;
        field4020 = null;
        if (arg0 != -33) {
            method1807(null, 62);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ldga;I)Lqu;", line = 444)
    public static final class84 method1809(class138 arg0, int arg1) {
        field4013++;
        if (arg1 > -45) {
            return null;
        }
        class550 var2 = class394.method2341(arg0, 18236);
        int var3 = arg0.method943(-75);
        int var4 = arg0.method943(-127);
        int var5 = arg0.method922((byte) -113);
        return new class84(var2.field7522, var2.field7524, var2.field7518, var2.field7525, var2.field7517, var2.field7519, var2.field7520, var3, var4, var5);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;)V", line = 466)
    private final void method1810(int arg0, int arg1, String arg2) {
        field4009++;
        int var4 = -68 % ((-arg1 - 43) / 40);
        int var5 = 0;
        boolean var6 = false;
        for (int var7 = 0; arg2.length() > var7; var7++) {
            char var8 = arg2.charAt(var7);
            if (var8 == '<') {
                var6 = true;
            } else if (var8 == '>') {
                var6 = false;
            } else if (!var6 && var8 == ' ') {
                var5++;
            }
        }
        if (var5 > 0) {
            class552.field7554 = (arg0 - this.field4024.method3312(-23728, arg2) << 8) / var5;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;[Lxa;I[IILjava/util/Random;IB)I", line = 503)
    public final int method1811(int arg0, int arg1, String arg2, class424[] arg3, int arg4, int[] arg5, int arg6, Random arg7, int arg8, byte arg9) {
        field4023++;
        if (arg2 == null) {
            return 0;
        }
        arg7.setSeed((long) arg1);
        int var11 = (arg7.nextInt() & 0x1F) + 192;
        this.method1813(arg4 & 0xFFFFFF | var11 << 24, var11 << 24 | arg6 & 0xFFFFFF, 1);
        int var12 = arg2.length();
        if (arg9 != -89) {
            this.field4021 = null;
        }
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg7.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1814(arg3, arg8, arg0, null, arg9 ^ 0x25, var13, arg5, arg2);
        return var14;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;)V", line = 543)
    private final void method1812(byte arg0, String arg1) {
        try {
            if (arg1.startsWith("col=")) {
                class412.field5777 = class412.field5777 & 0xFF000000 | class557.method3118(16, arg1.substring(4), 0) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class412.field5777 = class461.field6280 & 0xFFFFFF | class412.field5777 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class412.field5777 = class557.method3118(16, arg1.substring(5), arg0 + 103);
            } else if (arg1.equals("/argb")) {
                class412.field5777 = class461.field6280;
            } else if (arg1.startsWith("str=")) {
                class79.field1000 = class412.field5777 & 0xFF000000 | class557.method3118(16, arg1.substring(4), 0);
            } else if (arg1.equals("str")) {
                class79.field1000 = class412.field5777 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class79.field1000 = -1;
            } else if (arg1.startsWith("u=")) {
                class149.field1882 = class412.field5777 & 0xFF000000 | class557.method3118(16, arg1.substring(2), 0);
            } else if (arg1.equals("u")) {
                class149.field1882 = class412.field5777 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class149.field1882 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class150.field1886 = 0;
            } else if (arg1.startsWith("shad=")) {
                class150.field1886 = class412.field5777 & 0xFF000000 | class557.method3118(16, arg1.substring(5), 0);
            } else if (arg1.equals("shad")) {
                class150.field1886 = class412.field5777 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class150.field1886 = class419.field5844;
            } else if (arg1.equals("br")) {
                this.method1813(class419.field5844, class461.field6280, 1);
            }
            if (arg0 != -103) {
                this.method1810(-22, 108, null);
            }
        } catch (Exception var3) {
        }
        field4006++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 621)
    private final void method1813(int arg0, int arg1, int arg2) {
        class461.field6280 = arg1;
        class412.field5777 = arg1;
        field4022++;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class149.field1882 = -1;
        if (arg2 != 1) {
            return;
        }
        class79.field1000 = -1;
        class523.field7243 = 0;
        class552.field7554 = 0;
        class419.field5844 = arg0;
        class150.field1886 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lxa;II[II[I[ILjava/lang/String;)V", line = 641)
    private final void method1814(class424[] arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, String arg7) {
        int var9 = arg1 - this.field4024.field8183;
        field4012++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg7.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class9.method61(arg7.charAt(var14), 2174) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg7.substring(var10 + 1, var14);
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
                                    if (arg5 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg5[var12];
                                    }
                                    int var18;
                                    if (arg3 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg3[var12];
                                    }
                                    var12++;
                                    int var19 = class433.method2495(var16.substring(4), 0);
                                    class424 var20 = arg0[var19];
                                    int var21 = arg6 == null ? var20.method1157() : arg6[var19];
                                    var20.method67(arg2 + var17, -var21 + var18 + this.field4024.field8183 + var9, 1, 0, 1);
                                    var11 = -1;
                                    arg2 += arg0[var19].method1160();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1812((byte) -103, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg2 += this.field4024.method3316(var15, var11, 0);
                    }
                    int var22;
                    if (arg5 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg5[var12];
                    }
                    int var23;
                    if (arg3 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg3[var12];
                    }
                    if (var15 != ' ') {
                        if ((class150.field1886 & 0xFF000000) != 0) {
                            this.method1099(var15, arg2 + var22 + 1, var9 + var23 + 1, class150.field1886, true);
                        }
                        this.method1099(var15, arg2 + var22, var9 + var23, class412.field5777, false);
                    } else if (class552.field7554 > 0) {
                        class523.field7243 += class552.field7554;
                        arg2 += class523.field7243 >> 8;
                        class523.field7243 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field4024.method3317(var15, false);
                    if (class79.field1000 != -1) {
                        this.field4021.method3814(1, var24, var9 + ((int) ((double) this.field4024.field8183 * 0.7D)), class79.field1000, arg2);
                    }
                    if (class149.field1882 != -1) {
                        this.field4021.method3814(1, var24, this.field4024.field8183 + var9, class149.field1882, arg2);
                    }
                    arg2 += var24;
                    var11 = var15;
                }
            }
        }
        if (arg4 > -122) {
            field4019 = -38;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 806)
    public final void method1815(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4002++;
        if (arg0 == null) {
            return;
        }
        this.method1813(arg5, arg3, 1);
        this.method1804(null, null, 0, null, arg2, arg0, 0, arg4, (byte) -32);
        if (arg1 > -89) {
            this.method1811(-45, -21, null, null, 48, null, 104, null, 75, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;[I[Lxa;IBI)V", line = 831)
    public final void method1816(int arg0, int arg1, String arg2, int[] arg3, class424[] arg4, int arg5, byte arg6, int arg7) {
        field4001++;
        if (arg2 == null) {
            return;
        }
        this.method1813(arg7, arg5, 1);
        this.method1804(null, arg3, 0, arg4, arg0, arg2, 0, arg1, (byte) -32);
        if (arg6 < 109) {
            field4020 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lxa;IIILjava/lang/String;BIIILfa;[IIIIII)I", line = 851)
    public final int method1817(class424[] arg0, int arg1, int arg2, int arg3, String arg4, byte arg5, int arg6, int arg7, int arg8, class185 arg9, int[] arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        field4007++;
        int var17 = -91 % ((arg5 - 59) / 49);
        return this.method1806(arg1, arg10, 0, arg8, arg7, arg6, arg9, arg0, arg4, arg2, arg15, arg11, (byte) -50, arg13, arg12, arg14, arg3);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;BIIIII)V", line = 863)
    public final void method1818(String arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4017++;
        if (arg0 == null) {
            return;
        }
        this.method1813(arg4, arg3, 1);
        int var8 = arg0.length();
        if (arg1 >= -83) {
            return;
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1814(null, arg2, arg5 - this.field4024.method3312(-23728, arg0) / 2, var10, -127, var9, null, arg0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII[IIIBLjava/lang/String;I[IILjava/util/Random;I[Lxa;)I", line = 896)
    public final int method1819(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, byte arg7, String arg8, int arg9, int[] arg10, int arg11, Random arg12, int arg13, class424[] arg14) {
        field4005++;
        if (arg8 == null) {
            return 0;
        }
        arg12.setSeed((long) arg5);
        int var16 = (arg12.nextInt() & 0x1F) + 192;
        this.method1813(arg11 & 0xFFFFFF | var16 << 24, arg1 & 0xFFFFFF | var16 << 24, 1);
        int var17 = arg8.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg12.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg2;
        if (arg7 != -20) {
            field4011 = null;
        }
        int var22 = this.field4024.field8188 + arg9;
        if (arg0 == 1) {
            var22 += (arg3 - this.field4024.field8190 - this.field4024.field8188) / 2;
        } else if (arg0 == 2) {
            var22 = arg3 + arg9 - this.field4024.field8190;
        }
        int var23 = -1;
        if (arg6 == 1) {
            var23 = this.field4024.method3312(-23728, arg8) + var19;
            var21 = (arg13 - var23) / 2 + arg2;
        } else if (arg6 == 2) {
            var23 = this.field4024.method3312(-23728, arg8) + var19;
            var21 = arg13 + arg2 - var23;
        }
        this.method1814(arg14, var22, var21, null, -126, var18, arg10, arg8);
        if (arg4 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field4024.method3312(-23728, arg8);
            }
            arg4[3] = this.field4024.field8190 + this.field4024.field8188;
            arg4[2] = var23;
            arg4[0] = var21;
            arg4[1] = var22 - this.field4024.field8188;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Loa;Lil;)V", line = 979)
    public class301(class689 arg0, class598 arg1) {
        this.field4021 = arg0;
        this.field4024 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLfa;II)V")
    public abstract void method1103(char arg0, int arg1, int arg2, int arg3, boolean arg4, class185 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
    public abstract void method1099(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
