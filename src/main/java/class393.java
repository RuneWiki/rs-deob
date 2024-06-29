import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class393 {

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lr;")
    private class98 field5957;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Lfo;")
    private class606 field5960;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field5949 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;B)V", line = 3)
    private final void method2433(int arg0, String arg1, byte arg2) {
        field5945++;
        if (arg2 != 32) {
            return;
        }
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg1.length(); var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class251.field3296 = (arg0 - this.field5960.method3455(arg1, (byte) 1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;III)V", line = 42)
    public final void method2434(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field5948++;
        if (arg2 != null && arg1 == 22118) {
            this.method2450(arg3, arg0, (byte) -70);
            this.method2438(-79, arg4 - this.field5960.method3455(arg2, (byte) 1), null, null, null, 0, 0, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Lf;[ILjava/lang/String;IIIIIIIIIILua;II)I", line = 62)
    public final int method2435(class256[] arg0, int[] arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class591 arg13, int arg14, int arg15) {
        field5943++;
        if (arg3 != 0) {
            field5949 = -50;
        }
        return this.method2441(arg6, arg9, arg10, arg0, arg4, arg15, arg2, arg1, arg12, 0, arg13, arg7, arg8, arg5, arg14, arg3 - 1, arg11);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;II[III[Lf;Ljava/util/Random;I[IIII)I", line = 73)
    public final int method2436(int arg0, int arg1, String arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, class256[] arg8, Random arg9, int arg10, int[] arg11, int arg12, int arg13, int arg14) {
        field5946++;
        if (arg2 == null) {
            return 0;
        }
        arg9.setSeed((long) arg14);
        int var16 = (arg9.nextInt() & 0x1F) + 192;
        this.method2450(arg10 & 0xFFFFFF | var16 << 24, arg4 & 0xFFFFFF | var16 << 24, (byte) -70);
        int var17 = arg2.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg9.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg1;
        int var22 = this.field5960.field8749 + arg3;
        if (arg13 == 1) {
            var22 += (arg7 - this.field5960.field8749 - this.field5960.field8759) / 2;
        } else if (arg13 == 2) {
            var22 = arg3 + arg7 - this.field5960.field8759;
        }
        int var23 = arg6;
        if (arg0 == 1) {
            var23 = var19 + this.field5960.method3455(arg2, (byte) 1);
            var21 = (arg12 - var23) / 2 + arg1;
        } else if (arg0 == 2) {
            var23 = var19 + this.field5960.method3455(arg2, (byte) 1);
            var21 = arg12 + arg1 - var23;
        }
        this.method2442(null, arg8, var18, arg5, arg2, var22, var21, -1);
        if (arg11 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field5960.method3455(arg2, (byte) 1);
            }
            arg11[1] = var22 - this.field5960.field8749;
            arg11[0] = var21;
            arg11[3] = this.field5960.field8749 + this.field5960.field8759;
            arg11[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Lf;Ljava/lang/String;[ILjava/util/Random;IIIIII)I", line = 146)
    public final int method2437(class256[] arg0, String arg1, int[] arg2, Random arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5951++;
        if (arg1 == null) {
            return 0;
        }
        arg3.setSeed((long) arg7);
        int var11 = (arg3.nextInt() & 0x1F) + 192;
        this.method2450(arg8 & arg5 | var11 << 24, var11 << 24 | arg4 & 0xFFFFFF, (byte) -70);
        int var12 = arg1.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg3.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2442(null, arg0, var13, arg2, arg1, arg9, arg6, arg5 - 16777216);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILua;[Lf;[IIILjava/lang/String;I)V", line = 181)
    private final void method2438(int arg0, int arg1, class591 arg2, class256[] arg3, int[] arg4, int arg5, int arg6, String arg7, int arg8) {
        if (arg0 >= -37) {
            this.method2449(74, null);
        }
        int var10 = arg8 - this.field5960.field8754;
        field5961++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg7.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class91.method507((byte) 100, arg7.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg7.substring(var11 + 1, var14);
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
                                    int var17 = class87.method496(var16.substring(4), (byte) -120);
                                    class256 var18 = arg3[var17];
                                    int var19 = arg4 == null ? var18.method43() : arg4[var17];
                                    if ((class125.field1833 & 0xFF000000) == -16777216) {
                                        var18.method49(arg1, this.field5960.field8754 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method49(arg1, this.field5960.field8754 + var10 - var19, 0, class125.field1833 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg1 += arg3[var17].method50();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2449(48, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg1 += this.field5960.method3457(var15, (byte) -123, var12);
                    }
                    if (var15 == ' ') {
                        if (class251.field3296 > 0) {
                            class697.field9828 += class251.field3296;
                            arg1 += class697.field9828 >> 8;
                            class697.field9828 &= 0xFF;
                        }
                    } else if (arg2 == null) {
                        if ((class131.field1901 & 0xFF000000) != 0) {
                            this.method874(var15, arg1 + 1, var10 + 1, class131.field1901, true);
                        }
                        this.method874(var15, arg1, var10, class125.field1833, false);
                    } else {
                        if ((class131.field1901 & 0xFF000000) != 0) {
                            this.method876(var15, arg1 + 1, var10 + 1, class131.field1901, true, arg2, arg6, arg5);
                        }
                        this.method876(var15, arg1, var10, class125.field1833, false, arg2, arg6, arg5);
                    }
                    int var20 = this.field5960.method3458(var15, 255);
                    if (class86.field1344 != -1) {
                        this.field5957.method695(class86.field1344, (int) ((double) this.field5960.field8754 * 0.7D) + var10, arg1, var20, (byte) 91);
                    }
                    if (class378.field5681 != -1) {
                        this.field5957.method695(class378.field5681, var10 + this.field5960.field8754 + 1, arg1, var20, (byte) 97);
                    }
                    var12 = var15;
                    arg1 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII[ILjava/lang/String;[Lf;)V", line = 335)
    public final void method2439(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, String arg6, class256[] arg7) {
        field5952++;
        if (arg6 != null) {
            this.method2450(arg1, arg3, (byte) -70);
            this.method2438(-81, arg0, null, arg7, arg5, arg4, 0, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V", line = 348)
    public final void method2440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field5954++;
        if (arg6 == null) {
            return;
        }
        this.method2450(arg4, arg3, (byte) -70);
        double var9 = 7.0D - (double) arg5 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        if (arg7 != 26309) {
            return;
        }
        int var11 = arg6.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg1));
        }
        this.method2442(var12, null, null, null, arg6, arg2, arg0 - (this.field5960.method3455(arg6, (byte) 1) / 2), -1);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III[Lf;IILjava/lang/String;[IIILua;IIIIII)I", line = 379)
    public final int method2441(int arg0, int arg1, int arg2, class256[] arg3, int arg4, int arg5, String arg6, int[] arg7, int arg8, int arg9, class591 arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field5947++;
        if (arg6 == null) {
            return 0;
        }
        this.method2450(arg16, arg11, (byte) -70);
        if (~arg14 == arg15) {
            arg14 = this.field5960.field8754;
        }
        int[] var18;
        if (this.field5960.field8749 + this.field5960.field8759 + arg14 > arg0 && arg14 + arg14 > arg0) {
            var18 = null;
        } else {
            var18 = new int[] { arg4 };
        }
        if (arg9 == -1) {
            arg9 = arg0 / arg14;
            if (arg9 <= 0) {
                arg9 = 1;
            }
        }
        int var19 = this.field5960.method3459(arg3, class361.field5294, var18, arg6, -69);
        if (arg9 > 0 && var19 >= arg9) {
            var19 = arg9;
            class361.field5294[arg9 - 1] = this.field5960.method3453(arg15 + 1, arg4, arg3, class361.field5294[arg9 - 1]);
        }
        if (arg8 == 3 && var19 == 1) {
            arg8 = 1;
        }
        int var20;
        if (arg8 == 0) {
            var20 = this.field5960.field8749 + arg12;
        } else if (arg8 == 1) {
            var20 = (arg0 - this.field5960.field8749 - ((var19 + -1) * arg14) - this.field5960.field8759) / 2 + arg12 + this.field5960.field8749;
        } else if (arg8 == 2) {
            var20 = arg12 + arg0 - this.field5960.field8759 - ((var19 + -1) * arg14);
        } else {
            int var21 = (arg0 - this.field5960.field8749 - ((var19 + -1) * arg14) - this.field5960.field8759) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg14 += var21;
            var20 = this.field5960.field8749 + arg12 + var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg1 == 0) {
                this.method2438(arg15 - 126, arg13, arg10, arg3, arg7, arg5, arg2, class361.field5294[var22], var20);
            } else if (arg1 == 1) {
                this.method2438(arg15 - 60, arg13 + (arg4 + -this.field5960.method3455(class361.field5294[var22], (byte) 1)) / 2, arg10, arg3, arg7, arg5, arg2, class361.field5294[var22], var20);
            } else if (arg1 == 2) {
                this.method2438(-124, arg13 - (this.field5960.method3455(class361.field5294[var22], (byte) 1) - arg4), arg10, arg3, arg7, arg5, arg2, class361.field5294[var22], var20);
            } else if ((var19 - 1) == var22) {
                this.method2438(-72, arg13, arg10, arg3, arg7, arg5, arg2, class361.field5294[var22], var20);
            } else {
                this.method2433(arg4, class361.field5294[var22], (byte) 32);
                this.method2438(-80, arg13, arg10, arg3, arg7, arg5, arg2, class361.field5294[var22], var20);
                class251.field3296 = 0;
            }
            var20 += arg14;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([I[Lf;[I[ILjava/lang/String;III)V", line = 477)
    private final void method2442(int[] arg0, class256[] arg1, int[] arg2, int[] arg3, String arg4, int arg5, int arg6, int arg7) {
        int var9 = arg5 - this.field5960.field8754;
        field5953++;
        int var10 = arg7;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class91.method507((byte) 119, arg4.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg4.substring(var10 + 1, var14);
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
                                    int var19 = class87.method496(var16.substring(4), (byte) -94);
                                    class256 var20 = arg1[var19];
                                    int var21 = arg3 == null ? var20.method43() : arg3[var19];
                                    var20.method49(arg6 + var17, var9 - var21 - -var18 + this.field5960.field8754, 1, 0, 1);
                                    var11 = -1;
                                    arg6 += arg1[var19].method50();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2449(arg7 - 116, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg6 += this.field5960.method3457(var15, (byte) -127, var11);
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
                    var12++;
                    if (var15 != ' ') {
                        if ((class131.field1901 & 0xFF000000) != 0) {
                            this.method874(var15, arg6 + var22 + 1, var9 + 1 - -var23, class131.field1901, true);
                        }
                        this.method874(var15, arg6 + var22, var9 + var23, class125.field1833, false);
                    } else if (class251.field3296 > 0) {
                        class697.field9828 += class251.field3296;
                        arg6 += class697.field9828 >> 8;
                        class697.field9828 &= 0xFF;
                    }
                    int var24 = this.field5960.method3458(var15, 255);
                    if (class86.field1344 != -1) {
                        this.field5957.method695(class86.field1344, (int) ((double) this.field5960.field8754 * 0.7D) + var9, arg6, var24, (byte) 97);
                    }
                    if (class378.field5681 != -1) {
                        this.field5957.method695(class378.field5681, this.field5960.field8754 + var9, arg6, var24, (byte) 123);
                    }
                    var11 = var15;
                    arg6 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V", line = 637)
    public final void method2443(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field5955++;
        if (arg3 == null) {
            return;
        }
        this.method2450(arg1, arg2, (byte) -70);
        if (arg0 != 9789) {
            return;
        }
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2442(var10, null, var9, null, arg3, arg4, arg5 - (this.field5960.method3455(arg3, (byte) 1) / 2), -1);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(JJ)J", line = 680)
    public static long method2444(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Ljava/lang/String;", line = 692)
    public static final String method2445(byte arg0) {
        if (arg0 != 7) {
            field5949 = 107;
        }
        field5958++;
        return class683.field9638 || class340.field4933 == null ? "" : class340.field4933.field6225;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBIIIILjava/lang/String;)V", line = 716)
    public final void method2446(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field5962++;
        if (arg6 == null) {
            return;
        }
        this.method2450(arg4, arg2, (byte) -70);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        int var11 = 72 / ((arg1 + 8) / 45);
        this.method2442(var9, null, null, null, arg6, arg3, arg5 - this.field5960.method3455(arg6, (byte) 1) / 2, -1);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lr;Lfo;)V", line = 744)
    public class393(class98 arg0, class606 arg1) {
        this.field5957 = arg0;
        this.field5960 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 754)
    public final void method2447(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 2) {
            this.field5960 = null;
        }
        field5959++;
        if (arg1 != null) {
            this.method2450(arg5, arg2, (byte) -70);
            this.method2438(arg3 - 109, arg0, null, null, null, 0, 0, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIILjava/lang/String;II)V", line = 771)
    public final void method2448(byte arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field5944++;
        if (arg3 == null) {
            return;
        }
        this.method2450(arg2, arg1, (byte) -70);
        if (arg0 < 108) {
            field5949 = -29;
        }
        this.method2438(-51, arg5 - (this.field5960.method3455(arg3, (byte) 1) / 2), null, null, null, 0, 0, arg3, arg4);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)V", line = 786)
    private final void method2449(int arg0, String arg1) {
        field5950++;
        int var3 = -24 % ((-arg0 - 49) / 48);
        try {
            if (arg1.startsWith("col=")) {
                class125.field1833 = class125.field1833 & 0xFF000000 | class413.method2521(arg1.substring(4), 16, (byte) 31) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class125.field1833 = class125.field1833 & 0xFF000000 | class196.field2660 & 0xFFFFFF;
            }
            if (arg1.startsWith("argb=")) {
                class125.field1833 = class413.method2521(arg1.substring(5), 16, (byte) 31);
            } else if (arg1.equals("/argb")) {
                class125.field1833 = class196.field2660;
            } else if (arg1.startsWith("str=")) {
                class86.field1344 = class125.field1833 & 0xFF000000 | class413.method2521(arg1.substring(4), 16, (byte) 31);
            } else if (arg1.equals("str")) {
                class86.field1344 = class125.field1833 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class86.field1344 = -1;
            } else if (arg1.startsWith("u=")) {
                class378.field5681 = class125.field1833 & 0xFF000000 | class413.method2521(arg1.substring(2), 16, (byte) 31);
            } else if (arg1.equals("u")) {
                class378.field5681 = class125.field1833 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class378.field5681 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class131.field1901 = 0;
            } else if (arg1.startsWith("shad=")) {
                class131.field1901 = class125.field1833 & 0xFF000000 | class413.method2521(arg1.substring(5), 16, (byte) 31);
            } else if (arg1.equals("shad")) {
                class131.field1901 = class125.field1833 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class131.field1901 = class117.field1754;
            } else if (arg1.equals("br")) {
                this.method2450(class117.field1754, class196.field2660, (byte) -70);
                return;
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)V", line = 859)
    private final void method2450(int arg0, int arg1, byte arg2) {
        class196.field2660 = arg1;
        class125.field1833 = arg1;
        field5956++;
        class251.field3296 = 0;
        class378.field5681 = -1;
        class697.field9828 = 0;
        class86.field1344 = -1;
        if (arg0 == -1) {
            arg0 = 0;
        }
        if (arg2 != -70) {
            this.method2434(2, -105, null, -92, 19, 27);
        }
        class117.field1754 = arg0;
        class131.field1901 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method874(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLua;II)V")
    public abstract void method876(char arg0, int arg1, int arg2, int arg3, boolean arg4, class591 arg5, int arg6, int arg7);
}
