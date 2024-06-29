import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class400 {

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lha;")
    private class543 field5720;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Lqt;")
    private class502 field5732;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Llb;")
    public static class634 field5733 = class701.method3938(-127);

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Llc;")
    public static class435 field5734 = new class435(55, 6);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;)V", line = 4)
    public final void method2419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        if (arg1 != 5) {
            this.field5732 = null;
        }
        field5735++;
        if (arg6 == null) {
            return;
        }
        this.method2432((byte) -43, arg2, arg3);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2426((byte) -11, arg6, var9, null, arg5, var10, null, arg0 - this.field5732.method3063(0, arg6) / 2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 37)
    private final void method2420(String arg0, boolean arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class751.field10468 = class751.field10468 & 0xFF000000 | class503.method3080(16, -3290, arg0.substring(4)) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class751.field10468 = class683.field9696 & 0xFFFFFF | class751.field10468 & 0xFF000000;
            }
            if (!arg1) {
                this.field5732 = null;
            }
            if (arg0.startsWith("argb=")) {
                class751.field10468 = class503.method3080(16, -3290, arg0.substring(5));
            } else if (arg0.equals("/argb")) {
                class751.field10468 = class683.field9696;
            } else if (arg0.startsWith("str=")) {
                class408.field5812 = class751.field10468 & 0xFF000000 | class503.method3080(16, -3290, arg0.substring(4));
            } else if (arg0.equals("str")) {
                class408.field5812 = class751.field10468 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class408.field5812 = -1;
            } else if (arg0.startsWith("u=")) {
                class652.field9347 = class751.field10468 & 0xFF000000 | class503.method3080(16, -3290, arg0.substring(2));
            } else if (arg0.equals("u")) {
                class652.field9347 = class751.field10468 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class652.field9347 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class449.field6425 = 0;
            } else if (arg0.startsWith("shad=")) {
                class449.field6425 = class751.field10468 & 0xFF000000 | class503.method3080(16, -3290, arg0.substring(5));
            } else if (arg0.equals("shad")) {
                class449.field6425 = class751.field10468 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class449.field6425 = class160.field2307;
            } else if (arg0.equals("br")) {
                this.method2432((byte) -37, class160.field2307, class683.field9696);
            }
        } catch (Exception var3) {
        }
        field5729++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ltd;I[IILjava/lang/String;III)V", line = 112)
    public final void method2421(class515[] arg0, int arg1, int[] arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        field5728++;
        if (arg4 != null) {
            this.method2432((byte) -110, arg6, arg1);
            this.method2429(arg0, arg7, 3, arg4, null, arg5, arg3, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ltd;BIILjava/lang/String;I[IILjava/util/Random;I)I", line = 127)
    public final int method2422(class515[] arg0, byte arg1, int arg2, int arg3, String arg4, int arg5, int[] arg6, int arg7, Random arg8, int arg9) {
        field5730++;
        if (arg4 == null) {
            return 0;
        }
        if (arg1 < 14) {
            this.method2428(null, -19, (byte) -111);
        }
        arg8.setSeed((long) arg2);
        int var11 = (arg8.nextInt() & 0x1F) + 192;
        this.method2432((byte) -62, var11 << 24 | arg3 & 0xFFFFFF, arg5 & 0xFFFFFF | var11 << 24);
        int var12 = arg4.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg8.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2426((byte) -11, arg4, var13, arg0, arg9, null, arg6, arg7);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;ILjava/util/Random;IIII[Ltd;I[I[IIII)I", line = 166)
    public final int method2423(int arg0, String arg1, int arg2, Random arg3, int arg4, int arg5, int arg6, int arg7, class515[] arg8, int arg9, int[] arg10, int[] arg11, int arg12, int arg13, int arg14) {
        field5731++;
        if (arg1 == null) {
            return 0;
        }
        arg3.setSeed((long) arg5);
        int var16 = (arg3.nextInt() & 0x1F) + 192;
        this.method2432((byte) -117, var16 << 24 | arg13 & 0xFFFFFF, var16 << 24 | arg6 & 0xFFFFFF);
        int var17 = arg1.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        if (arg7 != 9408) {
            field5734 = null;
        }
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg3.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg9;
        int var22 = this.field5732.field7292 + arg14;
        if (arg12 == 1) {
            var22 += (arg0 - this.field5732.field7295 - this.field5732.field7292) / 2;
        } else if (arg12 == 2) {
            var22 = arg0 + arg14 - this.field5732.field7295;
        }
        int var23 = -1;
        if (arg4 == 1) {
            var23 = this.field5732.method3063(arg7 - 9408, arg1) + var19;
            var21 = (arg2 - var23) / 2 + arg9;
        } else if (arg4 == 2) {
            var23 = this.field5732.method3063(0, arg1) + var19;
            var21 = arg2 + arg9 - var23;
        }
        this.method2426((byte) -11, arg1, var18, arg8, var22, null, arg11, var21);
        if (arg10 != null) {
            if (var23 == -1) {
                var23 = this.field5732.method3063(arg7 ^ 0x24C0, arg1) + var19;
            }
            arg10[0] = var21;
            arg10[3] = this.field5732.field7292 + this.field5732.field7295;
            arg10[2] = var23;
            arg10[1] = var22 - this.field5732.field7292;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIIILjava/lang/String;I)V", line = 245)
    public final void method2424(byte arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field5717++;
        if (arg4 == null) {
            return;
        }
        this.method2432((byte) -32, arg1, arg5);
        this.method2429(null, 0, 3, arg4, null, arg3 - (this.field5732.method3063(0, arg4) / 2), arg2, 0, null);
        if (arg0 != 106) {
            field5734 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 262)
    public static void method2425(int arg0) {
        field5733 = null;
        field5734 = null;
        int var1 = -71 / ((arg0 + 16) / 53);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;[I[Ltd;I[I[II)V", line = 277)
    private final void method2426(byte arg0, String arg1, int[] arg2, class515[] arg3, int arg4, int[] arg5, int[] arg6, int arg7) {
        field5727++;
        int var9 = arg4 - this.field5732.field7298;
        if (arg0 != -11) {
            this.method2423(-94, null, 48, null, -94, -82, -2, -53, null, 10, null, null, -128, 71, -48);
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class594.method3483(arg1.charAt(var14), (byte) -117) & 0xFF);
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
                                    int var19 = class321.method1993(var16.substring(4), (byte) 86);
                                    class515 var20 = arg3[var19];
                                    int var21 = arg6 == null ? var20.method780() : arg6[var19];
                                    var20.method789(arg7 + var17, this.field5732.field7298 + var9 + var18 + -var21, 1, 0, 1);
                                    var11 = -1;
                                    arg7 += arg3[var19].method784();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2420(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg7 += this.field5732.method3062(var11, var15, (byte) -111);
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
                    var12++;
                    if (var15 != ' ') {
                        if ((class449.field6425 & 0xFF000000) != 0) {
                            this.method1278(var15, arg7 + var22 + 1, 1 - -var23 + var9, class449.field6425, true);
                        }
                        this.method1278(var15, arg7 + var22, var9 - -var23, class751.field10468, false);
                    } else if (class630.field8919 > 0) {
                        class36.field329 += class630.field8919;
                        arg7 += class36.field329 >> 8;
                        class36.field329 &= 0xFF;
                    }
                    int var24 = this.field5732.method3068(arg0 + 266, var15);
                    if (class408.field5812 != -1) {
                        this.field5720.method3260((int) ((double) this.field5732.field7298 * 0.7D) + var9, var24, -65, arg7, class408.field5812);
                    }
                    if (class652.field9347 != -1) {
                        this.field5720.method3260(this.field5732.field7298 + var9, var24, -107, arg7, class652.field9347);
                    }
                    var11 = var15;
                    arg7 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIB)V", line = 441)
    public final void method2427(int arg0, int arg1, String arg2, int arg3, int arg4, byte arg5) {
        field5726++;
        if (arg2 == null) {
            return;
        }
        this.method2432((byte) -22, arg0, arg4);
        this.method2429(null, 0, 3, arg2, null, arg1 - this.field5732.method3063(0, arg2), arg3, 0, null);
        if (arg5 < 38) {
            this.method2434(-35, -36, null, -118, -21, -64, 106, -107);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 460)
    private final void method2428(String arg0, int arg1, byte arg2) {
        field5725++;
        if (arg2 >= -125) {
            this.method2432((byte) 12, 97, -45);
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
            class630.field8919 = (arg1 - this.field5732.method3063(0, arg0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ltd;IILjava/lang/String;Laa;III[I)V", line = 501)
    private final void method2429(class515[] arg0, int arg1, int arg2, String arg3, class569 arg4, int arg5, int arg6, int arg7, int[] arg8) {
        field5721++;
        if (arg2 != 3) {
            field5733 = null;
        }
        int var10 = arg6 - this.field5732.field7298;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class594.method3483(arg3.charAt(var14), (byte) -117) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg3.substring(var11 + 1, var14);
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
                                    int var17 = class321.method1993(var16.substring(4), (byte) 97);
                                    class515 var18 = arg0[var17];
                                    int var19 = arg8 == null ? var18.method780() : arg8[var17];
                                    if ((class751.field10468 & 0xFF000000) == -16777216) {
                                        var18.method789(arg5, this.field5732.field7298 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method789(arg5, this.field5732.field7298 + var10 - var19, 0, class751.field10468 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg5 += arg0[var17].method784();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2420(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg5 += this.field5732.method3062(var12, var15, (byte) -100);
                    }
                    if (var15 == ' ') {
                        if (class630.field8919 > 0) {
                            class36.field329 += class630.field8919;
                            arg5 += class36.field329 >> 8;
                            class36.field329 &= 0xFF;
                        }
                    } else if (arg4 == null) {
                        if ((class449.field6425 & 0xFF000000) != 0) {
                            this.method1278(var15, arg5 + 1, var10 - -1, class449.field6425, true);
                        }
                        this.method1278(var15, arg5, var10, class751.field10468, false);
                    } else {
                        if ((class449.field6425 & 0xFF000000) != 0) {
                            this.method1275(var15, arg5 + 1, var10 + 1, class449.field6425, true, arg4, arg7, arg1);
                        }
                        this.method1275(var15, arg5, var10, class751.field10468, false, arg4, arg7, arg1);
                    }
                    int var20 = this.field5732.method3068(arg2 ^ 0xFC, var15);
                    if (class408.field5812 != -1) {
                        this.field5720.method3260(var10 + ((int) ((double) this.field5732.field7298 * 0.7D)), var20, arg2 ^ 0xFFFFFFAB, arg5, class408.field5812);
                    }
                    if (class652.field9347 != -1) {
                        this.field5720.method3260(var10 + this.field5732.field7298 + 1, var20, -113, arg5, class652.field9347);
                    }
                    var12 = var15;
                    arg5 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;IZI[ILaa;IIII[Ltd;II)I", line = 656)
    public final int method2430(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, boolean arg6, int arg7, int[] arg8, class569 arg9, int arg10, int arg11, int arg12, int arg13, class515[] arg14, int arg15, int arg16) {
        field5724++;
        if (arg4 == null) {
            return 0;
        }
        this.method2432((byte) -45, arg2, arg11);
        if (arg13 == 0) {
            arg13 = this.field5732.field7298;
        }
        int[] var18;
        if (this.field5732.field7295 + arg13 + this.field5732.field7292 > arg5 && (arg13 + arg13) > arg5) {
            var18 = null;
        } else {
            var18 = new int[] { arg15 };
        }
        int var19 = this.field5732.method3064(var18, arg4, class748.field10420, 0, arg14);
        if (arg7 == -1) {
            arg7 = arg5 / arg13;
            if (arg7 <= 0) {
                arg7 = 1;
            }
        }
        if (arg7 > 0 && var19 >= arg7) {
            class748.field10420[arg7 - 1] = this.field5732.method3070(arg15, arg14, class748.field10420[arg7 - 1], 7725);
            var19 = arg7;
        }
        if (arg16 == 3 && var19 == 1) {
            arg16 = 1;
        }
        int var21;
        if (arg16 == 0) {
            var21 = arg10 + this.field5732.field7292;
        } else if (arg16 == 1) {
            var21 = (arg5 - this.field5732.field7292 - this.field5732.field7295 - ((var19 + -1) * arg13)) / 2 + this.field5732.field7292 + arg10;
        } else if (arg16 == 2) {
            var21 = arg10 + arg5 - this.field5732.field7295 - (var19 + -1) * arg13;
        } else {
            int var20 = (arg5 - this.field5732.field7295 - ((var19 - 1) * arg13) - this.field5732.field7292) / (var19 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg13 += var20;
            var21 = this.field5732.field7292 + var20 + arg10;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg1 == 0) {
                this.method2429(arg14, arg12, 3, class748.field10420[var22], arg9, arg0, var21, arg3, arg8);
            } else if (arg1 == 1) {
                this.method2429(arg14, arg12, 3, class748.field10420[var22], arg9, arg0 + (arg15 - this.field5732.method3063(0, class748.field10420[var22])) / 2, var21, arg3, arg8);
            } else if (arg1 == 2) {
                this.method2429(arg14, arg12, 3, class748.field10420[var22], arg9, arg0 + arg15 - this.field5732.method3063(0, class748.field10420[var22]), var21, arg3, arg8);
            } else if (var19 - 1 == var22) {
                this.method2429(arg14, arg12, 3, class748.field10420[var22], arg9, arg0, var21, arg3, arg8);
            } else {
                this.method2428(class748.field10420[var22], arg15, (byte) -127);
                this.method2429(arg14, arg12, 3, class748.field10420[var22], arg9, arg0, var21, arg3, arg8);
                class630.field8919 = 0;
            }
            var21 += arg13;
        }
        if (arg6) {
            this.method1278((char) 65457, -34, 32, -2, true);
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIIILjava/lang/String;)V", line = 756)
    public final void method2431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field5719++;
        if (arg6 == null) {
            return;
        }
        this.method2432((byte) -42, arg2, arg5);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2426((byte) -11, arg6, null, null, arg0, var9, null, arg3 - (this.field5732.method3063(0, arg6) / 2));
        if (arg4 != 8364) {
            field5734 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V", line = 788)
    private final void method2432(byte arg0, int arg1, int arg2) {
        field5716++;
        class36.field329 = 0;
        class652.field9347 = -1;
        class683.field9696 = arg2;
        class751.field10468 = arg2;
        if (arg0 >= -15) {
            this.method2427(51, 88, null, -50, 43, (byte) 46);
        }
        class408.field5812 = -1;
        class630.field8919 = 0;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class160.field2307 = arg1;
        class449.field6425 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V", line = 808)
    public final void method2433(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field5723++;
        if (arg4 != null) {
            this.method2432((byte) -84, arg0, arg1);
            this.method2429(null, arg3, 3, arg4, null, arg2, arg5, 0, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIIII)V", line = 826)
    public final void method2434(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5722++;
        if (arg2 == null) {
            return;
        }
        this.method2432((byte) -59, arg7, arg6);
        double var9 = 7.0D - (double) arg1 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg2.length();
        int[] var12 = new int[var11];
        int var13 = 0;
        if (arg5 != -33) {
            return;
        }
        while (var13 < var11) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg0));
            var13++;
        }
        this.method2426((byte) -11, arg2, null, null, arg3, var12, null, arg4 - (this.field5732.method3063(0, arg2) / 2));
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I[Ltd;IB[IIIIIIIILaa;I)I", line = 859)
    public final int method2435(int arg0, String arg1, int arg2, class515[] arg3, int arg4, byte arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class569 arg14, int arg15) {
        field5718++;
        if (arg5 > -59) {
            field5733 = null;
        }
        return this.method2430(arg13, arg15, arg0, arg11, arg1, arg10, false, 0, arg6, arg14, arg7, arg4, arg9, arg8, arg3, arg12, arg2);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lqt;)V", line = 876)
    public class400(class543 arg0, class502 arg1) {
        this.field5720 = arg0;
        this.field5732 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method1278(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method1275(char arg0, int arg1, int arg2, int arg3, boolean arg4, class569 arg5, int arg6, int arg7);
}
