import java.awt.Rectangle;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class class31 {

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Luo;")
    private class118 field335;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "Lfa;")
    private class347 field346;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "[I")
    public static int[] field334 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    private static int field347 = 0;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "[I")
    public static int[] field331 = new int[500];

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field356 = 0;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "[[B")
    public static byte[][] field345;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/lang/String;[Lc;[IIB)V")
    public final void method189(int arg0, int arg1, int arg2, String arg3, class436[] arg4, int[] arg5, int arg6, byte arg7) {
        field348++;
        if (arg3 == null) {
            return;
        }
        this.method198(arg1, true, arg6);
        this.method202(arg5, 0, 28975, 0, arg4, (class423) null, arg0, arg3, arg2);
        if (arg7 < 18) {
            this.method195((int[]) null, -77, (class436[]) null, (byte) 46, (String) null, (int[]) null, -55, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(CIIIZLem;II)V")
    public abstract void method123(char arg0, int arg1, int arg2, int arg3, boolean arg4, class423 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BILjava/lang/String;IIII)V")
    public final void method190(byte arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field350++;
        if (arg2 == null) {
            return;
        }
        this.method198(arg4, true, arg1);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        if (arg0 >= 9) {
            for (int var10 = 0; var10 < var8; var10++) {
                var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
            }
            this.method195(var9, arg3 - (this.field346.method2203((byte) -105, arg2) / 2), (class436[]) null, (byte) 7, arg2, (int[]) null, arg6, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public static final void method191(boolean arg0) {
        class193.method1186();
        if (arg0) {
            method207(-13, -5);
        }
        field339++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIILjava/lang/String;Z)V")
    public final void method192(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, boolean arg6) {
        field358++;
        if (arg5 == null) {
            return;
        }
        this.method198(arg4, true, arg3);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        if (arg6) {
            field347 = -87;
        }
        this.method195(var10, arg2 - this.field346.method2203((byte) -105, arg5) / 2, (class436[]) null, (byte) 7, arg5, (int[]) null, arg0, var9);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIII)V")
    public static final void method193(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1003) {
            class93.method577(10, arg3, arg1);
        } else if (arg2 == 1007) {
            class93.method577(11, arg3, arg1);
        } else if (arg2 == 1006) {
            class93.method577(12, arg3, arg1);
        } else if (arg2 == 1008) {
            class93.method577(13, arg3, arg1);
        } else if (arg2 == 1004) {
            class93.method577(14, arg3, arg1);
        }
        field342++;
        if (arg0 <= 17) {
            field356 = 43;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/lang/String;)V")
    private final void method194(int arg0, String arg1) {
        field338++;
        try {
            if (arg1.startsWith("col=")) {
                class113.field1317 = class113.field1317 & 0xFF000000 | class269.method1684(16, 0, arg1.substring(4)) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class113.field1317 = class113.field1317 & 0xFF000000 | field347 & 0xFFFFFF;
            }
            if (arg1.startsWith("argb=")) {
                class113.field1317 = class269.method1684(16, 0, arg1.substring(5));
            } else if (arg1.equals("/argb")) {
                class113.field1317 = field347;
            } else if (arg1.startsWith("str=")) {
                class356.field4830 = class269.method1684(16, 0, arg1.substring(4)) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class356.field4830 = -8388608;
            } else if (arg1.equals("/str")) {
                class356.field4830 = -1;
            } else if (arg1.startsWith("u=")) {
                class214.field2639 = class269.method1684(16, 0, arg1.substring(2)) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class214.field2639 = -16777216;
            } else if (arg1.equals("/u")) {
                class214.field2639 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class122.field1388 = 0;
            } else if (arg1.startsWith("shad=")) {
                class122.field1388 = class269.method1684(16, 0, arg1.substring(5)) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class122.field1388 = -16777216;
            } else if (arg1.equals("/shad")) {
                class122.field1388 = class65.field784;
            } else if (arg1.equals("br")) {
                this.method198(class65.field784, true, field347);
            }
        } catch (Exception var4) {
        }
        int var3 = 12 / ((53 - arg0) / 49);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([II[Lc;BLjava/lang/String;[II[I)V")
    private final void method195(int[] arg0, int arg1, class436[] arg2, byte arg3, String arg4, int[] arg5, int arg6, int[] arg7) {
        field343++;
        int var9 = arg6 - this.field346.field4713;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg4.length();
        if (arg3 != 7) {
            this.field346 = null;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class376.method2343((byte) -111, arg4.charAt(var14)) & 0xFF);
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
                                    if (arg7 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg7[var12];
                                    }
                                    int var18;
                                    if (arg0 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg0[var12];
                                    }
                                    var12++;
                                    int var19 = class366.method2311(var16.substring(4), arg3 ^ 0xFFFFFF8B);
                                    class436 var20 = arg2[var19];
                                    int var21 = arg5 == null ? var20.method236() : arg5[var19];
                                    var20.method167(arg1 + var17, var9 + var18 + this.field346.field4713 + -var21, 0, 0, 1);
                                    var11 = -1;
                                    arg1 += arg2[var19].method235();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method194(109, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field346.method2214(var15, 0, var11);
                    }
                    int var22;
                    if (arg7 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg7[var12];
                    }
                    int var23;
                    if (arg0 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg0[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class122.field1388 & 0xFF000000) != 0) {
                            this.method122(var15, arg1 + var22 + 1, var9 + var23 + 1, class122.field1388, true);
                        }
                        this.method122(var15, arg1 + var22, var9 + var23, class113.field1317, false);
                    } else if (class272.field3515 > 0) {
                        class285.field3746 += class272.field3515;
                        arg1 += class285.field3746 >> 8;
                        class285.field3746 &= 0xFF;
                    }
                    int var24 = this.field346.method2213(-8773, var15);
                    if (class356.field4830 != -1) {
                        this.field335.method705((byte) 81, var24, (int) ((double) this.field346.field4713 * 0.7D) + var9, arg1, class356.field4830);
                    }
                    if (class214.field2639 != -1) {
                        this.field335.method705((byte) 117, var24, var9 + this.field346.field4713, arg1, class214.field2639);
                    }
                    arg1 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
    public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field341++;
        if (arg5 == null) {
            return;
        }
        this.method198(arg3, true, arg7);
        double var9 = 7.0D - (double) arg1 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg2) * var9);
        }
        if (arg4 != -1) {
            this.method204(107, 12, 42, -58, true, (String) null);
        }
        this.method195(var12, arg0 - this.field346.method2203((byte) -105, arg5) / 2, (class436[]) null, (byte) 7, arg5, (int[]) null, arg6, (int[]) null);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)I")
    public static final int method197(int arg0, byte arg1) {
        if (arg1 >= -70) {
            method191(false);
        }
        field349++;
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZI)V")
    private final void method198(int arg0, boolean arg1, int arg2) {
        class214.field2639 = -1;
        if (!arg1) {
            return;
        }
        class356.field4830 = -1;
        class272.field3515 = 0;
        field347 = arg2;
        class113.field1317 = arg2;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class285.field3746 = 0;
        field333++;
        class65.field784 = arg0;
        class122.field1388 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public static void method199(byte arg0) {
        field345 = null;
        if (arg0 != -77) {
            field347 = 76;
        }
        field331 = null;
        field334 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II[IIIII[Lc;IILjava/lang/String;IIIILem;)I")
    public final int method200(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, class436[] arg7, int arg8, int arg9, String arg10, int arg11, int arg12, int arg13, int arg14, class423 arg15) {
        field351++;
        if (arg10 == null) {
            return 0;
        } else if (arg1 == 23897) {
            this.method198(arg6, true, arg14);
            if (arg5 == 0) {
                arg5 = this.field346.field4713;
            }
            int[] var17;
            if (arg3 < (this.field346.field4708 + this.field346.field4706 + arg5) && arg5 + arg5 > arg3) {
                var17 = null;
            } else {
                var17 = new int[] { arg8 };
            }
            int var18 = this.field346.method2202(class102.field1187, arg7, var17, arg10, (byte) -120);
            if (arg9 == 3 && var18 == 1) {
                arg9 = 1;
            }
            int var19;
            if (arg9 == 0) {
                var19 = this.field346.field4708 + arg4;
            } else if (arg9 == 1) {
                var19 = arg4 - (-this.field346.field4708 - (arg3 - ((var18 - 1) * arg5) - this.field346.field4706 - this.field346.field4708) / 2);
            } else if (arg9 == 2) {
                var19 = arg3 + arg4 - this.field346.field4706 - ((var18 + -1) * arg5);
            } else {
                int var20 = (arg3 - ((var18 - 1) * arg5) - this.field346.field4708 - this.field346.field4706) / (var18 + 1);
                if (var20 < 0) {
                    var20 = 0;
                }
                arg5 += var20;
                var19 = this.field346.field4708 + arg4 + var20;
            }
            for (int var21 = 0; var21 < var18; var21++) {
                if (arg0 == 0) {
                    this.method202(arg2, arg13, 28975, arg11, arg7, arg15, arg12, class102.field1187[var21], var19);
                } else if (arg0 == 1) {
                    this.method202(arg2, arg13, 28975, arg11, arg7, arg15, (arg8 - this.field346.method2203((byte) -105, class102.field1187[var21])) / 2 + arg12, class102.field1187[var21], var19);
                } else if (arg0 == 2) {
                    this.method202(arg2, arg13, 28975, arg11, arg7, arg15, arg8 + (arg12 - this.field346.method2203((byte) -105, class102.field1187[var21])), class102.field1187[var21], var19);
                } else if ((var18 - 1) == var21) {
                    this.method202(arg2, arg13, 28975, arg11, arg7, arg15, arg12, class102.field1187[var21], var19);
                } else {
                    this.method209(arg8, class102.field1187[var21], (byte) 105);
                    this.method202(arg2, arg13, 28975, arg11, arg7, arg15, arg12, class102.field1187[var21], var19);
                    class272.field3515 = 0;
                }
                var19 += arg5;
            }
            return var18;
        } else {
            return -74;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III[Lc;[ILjava/util/Random;Ljava/lang/String;III)I")
    public final int method201(int arg0, int arg1, int arg2, class436[] arg3, int[] arg4, Random arg5, String arg6, int arg7, int arg8, int arg9) {
        field337++;
        if (arg6 == null) {
            return 0;
        }
        arg5.setSeed((long) arg7);
        if (arg2 != -2145389480) {
            method197(-9, (byte) -127);
        }
        int var11 = (arg5.nextInt() & 0x1F) + 192;
        this.method198(var11 << 24 | arg9 & 0xFFFFFF, true, var11 << 24 | arg8 & 0xFFFFFF);
        int var12 = arg6.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg5.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method195((int[]) null, arg1, arg3, (byte) 7, arg6, arg4, arg0, var13);
        return var14;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method122(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([IIII[Lc;Lem;ILjava/lang/String;I)V")
    private final void method202(int[] arg0, int arg1, int arg2, int arg3, class436[] arg4, class423 arg5, int arg6, String arg7, int arg8) {
        int var10 = arg8 - this.field346.field4713;
        field357++;
        int var11 = -1;
        int var12 = -1;
        if (arg2 != 28975) {
            field334 = null;
        }
        int var13 = arg7.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class376.method2343((byte) -111, arg7.charAt(var14)) & 0xFF);
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
                                    int var17 = class366.method2311(var16.substring(4), 69);
                                    class436 var18 = arg4[var17];
                                    int var19 = arg0 == null ? var18.method236() : arg0[var17];
                                    if ((class113.field1317 & 0xFF000000) == -16777216) {
                                        var18.method167(arg6, this.field346.field4713 + var10 - var19, 0, 0, 1);
                                    } else {
                                        var18.method167(arg6, this.field346.field4713 + var10 - var19, 1, class113.field1317 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg6 += arg4[var17].method235();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method194(105, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg6 += this.field346.method2214(var15, arg2 ^ 0x712F, var12);
                    }
                    if (var15 == ' ') {
                        if (class272.field3515 > 0) {
                            class285.field3746 += class272.field3515;
                            arg6 += class285.field3746 >> 8;
                            class285.field3746 &= 0xFF;
                        }
                    } else if (arg5 == null) {
                        if ((class122.field1388 & 0xFF000000) != 0) {
                            this.method122(var15, arg6 + 1, var10 + 1, class122.field1388, true);
                        }
                        this.method122(var15, arg6, var10, class113.field1317, false);
                    } else {
                        if ((class122.field1388 & 0xFF000000) != 0) {
                            this.method123(var15, arg6 + 1, var10 + 1, class122.field1388, true, arg5, arg1, arg3);
                        }
                        this.method123(var15, arg6, var10, class113.field1317, false, arg5, arg1, arg3);
                    }
                    int var20 = this.field346.method2213(-8773, var15);
                    if (class356.field4830 != -1) {
                        this.field335.method705((byte) 75, var20, var10 + ((int) ((double) this.field346.field4713 * 0.7D)), arg6, class356.field4830);
                    }
                    if (class214.field2639 != -1) {
                        this.field335.method705((byte) 47, var20, this.field346.field4713 + var10 + 1, arg6, class214.field2639);
                    }
                    arg6 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIII)V")
    public static final void method203(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field355++;
        int var5 = 0;
        if (arg4 != 174) {
            return;
        }
        while (class319.field4291 > var5) {
            Rectangle var6 = class41.field487[var5];
            if (arg3 < (var6.x + var6.width) && var6.x < (arg1 + arg3) && var6.y + var6.height > arg2 && arg0 + arg2 > var6.y) {
                class65.field786[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIZLjava/lang/String;)V")
    public final void method204(int arg0, int arg1, int arg2, int arg3, boolean arg4, String arg5) {
        field332++;
        if (arg4) {
            method199((byte) 117);
        }
        if (arg5 != null) {
            this.method198(arg0, true, arg2);
            this.method202((int[]) null, 0, 28975, 0, (class436[]) null, (class423) null, arg1 - (this.field346.method2203((byte) -105, arg5) / 2), arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/util/Random;IIII[III[Lc;[IILjava/lang/String;)I")
    public final int method205(int arg0, int arg1, int arg2, Random arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, class436[] arg11, int[] arg12, int arg13, String arg14) {
        field340++;
        if (arg14 == null) {
            return 0;
        }
        arg3.setSeed((long) arg10);
        int var16 = (arg3.nextInt() & 0x1F) + 192;
        this.method198(arg9 & 0xFFFFFF | var16 << 24, true, arg0 & 0xFFFFFF | var16 << 24);
        int var17 = arg14.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        int var20 = 0;
        if (arg2 != 23650) {
            field345 = null;
        }
        while (var17 > var20) {
            var18[var20] = var19;
            if ((arg3.nextInt() & 0x3) == 0) {
                var19++;
            }
            var20++;
        }
        int var21 = arg4;
        int var22 = arg13 + this.field346.field4708;
        if (arg6 == 1) {
            var22 += (arg7 - this.field346.field4706 - this.field346.field4708) / 2;
        } else if (arg6 == 2) {
            var22 = arg13 + arg7 - this.field346.field4706;
        }
        int var23 = -1;
        if (arg5 == 1) {
            var23 = var19 + this.field346.method2203((byte) -105, arg14);
            var21 = (arg1 - var23) / 2 + arg4;
        } else if (arg5 == 2) {
            var23 = this.field346.method2203((byte) -105, arg14) + var19;
            var21 = arg1 + arg4 - var23;
        }
        this.method195((int[]) null, var21, arg11, (byte) 7, arg14, arg8, var22, var18);
        if (arg12 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field346.method2203((byte) -105, arg14);
            }
            arg12[1] = var22 - this.field346.field4708;
            arg12[2] = var23;
            arg12[3] = this.field346.field4708 + this.field346.field4706;
            arg12[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(IIIIZLjava/lang/String;)V")
    public final void method206(int arg0, int arg1, int arg2, int arg3, boolean arg4, String arg5) {
        field353++;
        if (arg5 != null) {
            this.method198(arg3, arg4, arg0);
            this.method202((int[]) null, 0, 28975, 0, (class436[]) null, (class423) null, arg1, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lgm;")
    public static final class90 method207(int arg0, int arg1) {
        field344++;
        class90 var2 = (class90) class391.field5329.method648(arg1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class258.field3326.method1794(5860, 1, arg0);
        } else {
            var3 = class49.field570.method1794(5860, 1, arg0 & 0x7FFF);
        }
        class90 var4 = new class90();
        if (var3 != null) {
            var4.method566(7, new class242(var3));
        }
        if (arg0 >= 32768) {
            var4.method565(11023);
        }
        class391.field5329.method643((long) arg0, var4, (byte) 122);
        return var4;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Luo;Lfa;)V")
    public class31(class118 arg0, class347 arg1) {
        this.field335 = arg0;
        this.field346 = arg1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBILjava/lang/String;II)V")
    public final void method208(int arg0, byte arg1, int arg2, String arg3, int arg4, int arg5) {
        field354++;
        if (arg1 <= 42) {
            this.method192(98, -118, 118, -48, -13, (String) null, true);
        }
        if (arg3 != null) {
            this.method198(arg4, true, arg5);
            this.method202((int[]) null, 0, 28975, 0, (class436[]) null, (class423) null, arg0 - this.field346.method2203((byte) -105, arg3), arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/lang/String;B)V")
    private final void method209(int arg0, String arg1, byte arg2) {
        field352++;
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
        if (arg2 != 105) {
            field336 = -105;
        }
        if (var4 > 0) {
            class272.field3515 = (arg0 - this.field346.method2203((byte) -105, arg1) << 8) / var4;
        }
    }
}
