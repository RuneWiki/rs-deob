import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class213 extends class59 {

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public int field3313 = 0;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "[I")
    private int[] field3306;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "[I")
    private int[] field3308;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "[I")
    private int[] field3317;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "[I")
    private int[] field3305;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    private int field3310;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    private int field3304;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field3312 = new StringBuffer(100);

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    private static int field3315 = -1;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    private static int field3318 = 0;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    private static int field3320 = 0;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    private static int field3321 = -1;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    private static int field3316 = 0;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    private static int field3314 = -1;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "[Ljava/lang/String;")
    private static String[] field3323 = new String[100];

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    private static int field3322 = -1;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    private static int field3325 = 256;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    private static int field3324 = 0;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    private static int field3326 = 256;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "[B")
    private byte[] field3311;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "[I")
    private int[] field3307;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "[I")
    private int[] field3319;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "[Lci;")
    private class189[] field3309;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lci;[I)V")
    public final void method1468(class189[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field3309 = arg0;
        this.field3307 = arg1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method1469(String arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        int var5 = arg0.length();
        for (int var6 = 0; var6 < var5; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var4 = true;
            } else if (var7 == '>') {
                var4 = false;
            } else if (!var4 && var7 == ' ') {
                var3++;
            }
        }
        if (var3 > 0) {
            field3316 = (arg1 - this.method1491(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public final int method1470(String arg0, int arg1) {
        return this.method1488(arg0, new int[] { arg1 }, field3323);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
    private final void method1471(int arg0, int arg1, int arg2) {
        field3322 = -1;
        field3321 = -1;
        field3314 = arg1;
        field3315 = arg1;
        field3318 = arg0;
        field3320 = arg0;
        field3326 = arg2;
        field3325 = arg2;
        field3316 = 0;
        field3324 = 0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1472(String arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            char var7 = arg0.charAt(var3);
            if (var7 == '<' || var7 == '>') {
                var2 += 3;
            }
        }
        StringBuffer var4 = new StringBuffer(var1 + var2);
        for (int var5 = 0; var5 < var1; var5++) {
            char var6 = arg0.charAt(var5);
            if (var6 == '<') {
                var4.append("<lt>");
            } else if (var6 == '>') {
                var4.append("<gt>");
            } else {
                var4.append(var6);
            }
        }
        return var4.toString();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public final void method1473(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1479(arg3, arg4);
            this.method1474(arg0, arg1 - this.method1491(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;II)V")
    private final void method1474(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3313;
        int var5 = -1;
        char var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var9 == '<') {
                var5 = var8;
            } else {
                if (var9 == '>' && var5 != -1) {
                    String var10 = arg0.substring(var5 + 1, var8);
                    var5 = -1;
                    if (var10.equals("lt")) {
                        var9 = '<';
                    } else if (var10.equals("gt")) {
                        var9 = '>';
                    } else if (var10.equals("nbsp")) {
                        var9 = ' ';
                    } else if (var10.equals("shy")) {
                        var9 = '\u00AD';
                    } else if (var10.equals("times")) {
                        var9 = '×';
                    } else if (var10.equals("euro")) {
                        var9 = '€';
                    } else if (var10.equals("copy")) {
                        var9 = '©';
                    } else {
                        if (!var10.equals("reg")) {
                            if (var10.startsWith("img=")) {
                                try {
                                    int var11 = class144.method946(var10.substring(4), -1);
                                    class189 var12 = this.field3309[var11];
                                    int var13 = this.field3307 == null ? var12.field2945 : this.field3307[var11];
                                    if (field3325 == 256) {
                                        var12.method621(arg1, this.field3313 + var4 - var13);
                                    } else {
                                        var12.method611(arg1, this.field3313 + var4 - var13, field3325);
                                    }
                                    arg1 += var12.field2951;
                                    var6 = '\u0000';
                                } catch (Exception var18) {
                                }
                            } else {
                                this.method1480(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var14 = (char) (class200.method1393((byte) -106, var9) & 0xFF);
                    if (this.field3311 != null && var6 != '\u0000') {
                        arg1 += this.field3311[(var6 << 8) + var14];
                    }
                    int var15 = this.field3317[var14];
                    int var16 = this.field3305[var14];
                    if (var14 == ' ') {
                        if (field3316 > 0) {
                            field3324 += field3316;
                            arg1 += field3324 >> 8;
                            field3324 &= 0xFF;
                        }
                    } else if (field3325 == 256) {
                        if (field3315 != -1) {
                            this.method730(var14, this.field3306[var14] + arg1 + 1, this.field3308[var14] + var4 + 1, var15, var16, field3315, true);
                        }
                        this.method730(var14, this.field3306[var14] + arg1, this.field3308[var14] + var4, var15, var16, field3320, false);
                    } else {
                        if (field3315 != -1) {
                            this.method732(var14, this.field3306[var14] + arg1 + 1, this.field3308[var14] + var4 + 1, var15, var16, field3315, field3325, true);
                        }
                        this.method732(var14, this.field3306[var14] + arg1, this.field3308[var14] + var4, var15, var16, field3320, field3325, false);
                    }
                    int var17 = this.field3319[var14];
                    if (field3322 != -1) {
                        class151.method1027(arg1, (int) ((double) this.field3313 * 0.7D) + var4, var17, field3322);
                    }
                    if (field3321 != -1) {
                        class151.method1027(arg1, this.field3313 + var4 + 1, var17, field3321);
                    }
                    arg1 += var17;
                    var6 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
    public final int method1475(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method1471(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field3313;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field3310 + this.field3304 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method1488(arg0, var12, field3323);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field3310 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field3310 - this.field3304 - (var13 - 1) * arg10) / 2 + this.field3310 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field3304 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field3310 - this.field3304 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field3310 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method1474(field3323[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method1474(field3323[var16], arg1 + (arg3 - this.method1491(field3323[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method1474(field3323[var16], arg1 + arg3 - this.method1491(field3323[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method1474(field3323[var16], arg1, var14);
            } else {
                this.method1469(field3323[var16], arg3);
                this.method1474(field3323[var16], arg1, var14);
                field3316 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(Ljava/lang/String;I)I")
    public final int method1476(String arg0, int arg1) {
        int var3 = this.method1488(arg0, new int[] { arg1 }, field3323);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1491(field3323[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([B)V")
    private final void method1477(byte[] arg0) {
        this.field3319 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3319.length; var2++) {
                this.field3319[var2] = arg0[var2] & 0xFF;
            }
            this.field3313 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3319[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field3311 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field3311[(var13 << 8) + var14] = (byte) method1487(var9, var11, var6, this.field3319, var5, var13, var14);
                    }
                }
            }
        }
        this.field3313 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method1478(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method1479(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) var12 / 1.5D + (double) arg5) * var8);
        }
        this.method1494(arg0, arg1 - this.method1491(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
    private final void method1479(int arg0, int arg1) {
        field3322 = -1;
        field3321 = -1;
        field3314 = arg1;
        field3315 = arg1;
        field3318 = arg0;
        field3320 = arg0;
        field3326 = 256;
        field3325 = 256;
        field3316 = 0;
        field3324 = 0;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method1480(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3320 = class23.method123(16, arg0.substring(4), (byte) -65);
                return;
            }
            if (arg0.equals("/col")) {
                field3320 = field3318;
                return;
            }
            if (arg0.startsWith("trans=")) {
                field3325 = class144.method946(arg0.substring(6), -1);
                return;
            }
            if (arg0.equals("/trans")) {
                field3325 = field3326;
                return;
            }
            if (arg0.startsWith("str=")) {
                field3322 = class23.method123(16, arg0.substring(4), (byte) -65);
                return;
            }
            if (arg0.equals("str")) {
                field3322 = 8388608;
                return;
            }
            if (arg0.equals("/str")) {
                field3322 = -1;
                return;
            }
            if (arg0.startsWith("u=")) {
                field3321 = class23.method123(16, arg0.substring(2), (byte) -65);
                return;
            }
            if (arg0.equals("u")) {
                field3321 = 0;
                return;
            }
            if (arg0.equals("/u")) {
                field3321 = -1;
                return;
            }
            if (arg0.startsWith("shad=")) {
                field3315 = class23.method123(16, arg0.substring(5), (byte) -65);
                return;
            }
            if (arg0.equals("shad")) {
                field3315 = 0;
                return;
            }
            if (arg0.equals("/shad")) {
                field3315 = field3314;
                return;
            }
            if (arg0.equals("br")) {
                this.method1471(field3318, field3314, field3326);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
    public final void method1481(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1479(arg3, arg4);
            this.method1474(arg0, arg1 - this.method1491(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
    public static void method1482() {
        field3312 = null;
        field3323 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I")
    public final int method1483(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method1475(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I")
    public final int method1484(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method1471(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
        int var13 = arg0.length();
        int[] var14 = new int[var13];
        int var15 = 0;
        for (int var16 = 0; var16 < var13; var16++) {
            var14[var16] = var15;
            if ((arg9.nextInt() & 0x3) == 0) {
                var15++;
            }
        }
        int var17 = arg1;
        int var18 = this.field3310 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field3310 - this.field3304) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field3304;
        }
        if (arg7 == 1) {
            var19 = this.method1491(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method1491(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method1494(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method1491(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field3310;
            arg11[2] = var19;
            arg11[3] = this.field3310 + this.field3304;
        }
        return var15;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(C)I")
    private final int method1485(char arg0) {
        return this.field3319[class200.method1393((byte) -80, arg0) & 0xFF];
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method730(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
    public final void method1486(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1479(arg3, arg4);
            this.method1474(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method1487(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public final int method1488(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class84.method575(0, ' ', (byte) 114, field3312);
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int var7 = 0;
        byte var8 = 0;
        int var9 = -1;
        char var10 = 0;
        int var11 = 0;
        int var12 = arg0.length();
        for (int var13 = 0; var13 < var12; var13++) {
            char var14 = arg0.charAt(var13);
            if (var14 == '<') {
                var9 = var13;
            } else {
                if (var14 == '>' && var9 != -1) {
                    String var15 = arg0.substring(var9 + 1, var13);
                    var9 = -1;
                    field3312.append('<');
                    field3312.append(var15);
                    field3312.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field3312.toString().substring(var5, field3312.length());
                        var11++;
                        var5 = field3312.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method1485('<');
                        if (this.field3311 != null && var10 != '\u0000') {
                            var4 += this.field3311[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method1485('>');
                        if (this.field3311 != null && var10 != '\u0000') {
                            var4 += this.field3311[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method1485(' ');
                        if (this.field3311 != null && var10 != '\u0000') {
                            var4 += this.field3311[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method1485('\u00ad');
                        if (this.field3311 != null && var10 != '\u0000') {
                            var4 += this.field3311[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method1485('×');
                        if (this.field3311 != null && var10 != '\u0000') {
                            var4 += this.field3311[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method1485('€');
                        if (this.field3311 != null && var10 != '\u0000') {
                            var4 += this.field3311[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method1485('©');
                        if (this.field3311 != null && var10 != '\u0000') {
                            var4 += this.field3311[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method1485('®');
                        if (this.field3311 != null && var10 != '\u0000') {
                            var4 += this.field3311[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class144.method946(var15.substring(4), -1);
                            var4 += this.field3309[var16].field2951;
                            var10 = '\u0000';
                        } catch (Exception var17) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field3312.append(var14);
                        var14 = (char) (class200.method1393((byte) -60, var14) & 0xFF);
                        var4 += this.field3319[var14];
                        if (this.field3311 != null && var10 != '\u0000') {
                            var4 += this.field3311[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field3312.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field3312.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field3312.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field3312.length() > var5) {
            arg2[var11] = field3312.toString().substring(var5, field3312.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method1489(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1479(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method1494(arg0, arg1 - this.method1491(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method1490(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1479(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method1494(arg0, arg1 - this.method1491(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(Ljava/lang/String;)I")
    public final int method1491(String arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        char var3 = 0;
        int var4 = 0;
        int var5 = arg0.length();
        for (int var6 = 0; var6 < var5; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var2 = var6;
            } else {
                if (var7 == '>' && var2 != -1) {
                    String var8 = arg0.substring(var2 + 1, var6);
                    var2 = -1;
                    if (var8.equals("lt")) {
                        var7 = '<';
                    } else if (var8.equals("gt")) {
                        var7 = '>';
                    } else if (var8.equals("nbsp")) {
                        var7 = ' ';
                    } else if (var8.equals("shy")) {
                        var7 = '\u00AD';
                    } else if (var8.equals("times")) {
                        var7 = '×';
                    } else if (var8.equals("euro")) {
                        var7 = '€';
                    } else if (var8.equals("copy")) {
                        var7 = '©';
                    } else {
                        if (!var8.equals("reg")) {
                            if (var8.startsWith("img=")) {
                                try {
                                    int var9 = class144.method946(var8.substring(4), -1);
                                    var4 += this.field3309[var9].field2951;
                                    var3 = '\u0000';
                                } catch (Exception var11) {
                                }
                            }
                            continue;
                        }
                        var7 = '®';
                    }
                }
                if (var2 == -1) {
                    char var10 = (char) (class200.method1393((byte) -15, var7) & 0xFF);
                    var4 += this.field3319[var10];
                    if (this.field3311 != null && var3 != '\u0000') {
                        var4 += this.field3311[(var3 << 8) + var10];
                    }
                    var3 = var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Ljava/lang/String;II)I")
    public final int method1492(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = this.field3313;
        }
        int var4 = this.method1488(arg0, new int[] { arg1 }, field3323);
        int var5 = (var4 - 1) * arg2;
        return this.field3310 + var5 + this.field3304;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I")
    public final int method1493(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method1471(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method1494(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([B[I[I[I[I)V")
    public class213(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field3306 = arg1;
        this.field3308 = arg2;
        this.field3317 = arg3;
        this.field3305 = arg4;
        this.method1477(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field3308[var8] < var6 && this.field3305[var8] != 0) {
                var6 = this.field3308[var8];
            }
            if (this.field3308[var8] + this.field3305[var8] > var7) {
                var7 = this.field3308[var8] + this.field3305[var8];
            }
        }
        this.field3310 = this.field3313 - var6;
        this.field3304 = var7 - this.field3313;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([B)V")
    public class213(byte[] arg0) {
        this.method1477(arg0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V")
    private final void method1494(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3313;
        int var7 = -1;
        char var8 = 0;
        int var9 = 0;
        int var10 = arg0.length();
        for (int var11 = 0; var11 < var10; var11++) {
            char var12 = arg0.charAt(var11);
            if (var12 == '<') {
                var7 = var11;
            } else {
                if (var12 == '>' && var7 != -1) {
                    String var13 = arg0.substring(var7 + 1, var11);
                    var7 = -1;
                    if (var13.equals("lt")) {
                        var12 = '<';
                    } else if (var13.equals("gt")) {
                        var12 = '>';
                    } else if (var13.equals("nbsp")) {
                        var12 = ' ';
                    } else if (var13.equals("shy")) {
                        var12 = '\u00AD';
                    } else if (var13.equals("times")) {
                        var12 = '×';
                    } else if (var13.equals("euro")) {
                        var12 = '€';
                    } else if (var13.equals("copy")) {
                        var12 = '©';
                    } else {
                        if (!var13.equals("reg")) {
                            if (var13.startsWith("img=")) {
                                try {
                                    int var14;
                                    if (arg3 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg3[var9];
                                    }
                                    int var15;
                                    if (arg4 == null) {
                                        var15 = 0;
                                    } else {
                                        var15 = arg4[var9];
                                    }
                                    var9++;
                                    int var16 = class144.method946(var13.substring(4), -1);
                                    class189 var17 = this.field3309[var16];
                                    int var18 = this.field3307 == null ? var17.field2945 : this.field3307[var16];
                                    if (field3325 == 256) {
                                        var17.method621(arg1 + var14, this.field3313 + var6 - var18 + var15);
                                    } else {
                                        var17.method611(arg1 + var14, this.field3313 + var6 - var18 + var15, field3325);
                                    }
                                    arg1 += var17.field2951;
                                    var8 = '\u0000';
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1480(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var19 = (char) (class200.method1393((byte) -30, var12) & 0xFF);
                    if (this.field3311 != null && var8 != '\u0000') {
                        arg1 += this.field3311[(var8 << 8) + var19];
                    }
                    int var20 = this.field3317[var19];
                    int var21 = this.field3305[var19];
                    int var22;
                    if (arg3 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg3[var9];
                    }
                    int var23;
                    if (arg4 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg4[var9];
                    }
                    var9++;
                    if (var19 == ' ') {
                        if (field3316 > 0) {
                            field3324 += field3316;
                            arg1 += field3324 >> 8;
                            field3324 &= 0xFF;
                        }
                    } else if (field3325 == 256) {
                        if (field3315 != -1) {
                            this.method730(var19, this.field3306[var19] + arg1 + var22 + 1, this.field3308[var19] + var6 + 1 + var23, var20, var21, field3315, true);
                        }
                        this.method730(var19, this.field3306[var19] + arg1 + var22, this.field3308[var19] + var6 + var23, var20, var21, field3320, false);
                    } else {
                        if (field3315 != -1) {
                            this.method732(var19, this.field3306[var19] + arg1 + var22 + 1, this.field3308[var19] + var6 + 1 + var23, var20, var21, field3315, field3325, true);
                        }
                        this.method732(var19, this.field3306[var19] + arg1 + var22, this.field3308[var19] + var6 + var23, var20, var21, field3320, field3325, false);
                    }
                    int var24 = this.field3319[var19];
                    if (field3322 != -1) {
                        class151.method1027(arg1, (int) ((double) this.field3313 * 0.7D) + var6, var24, field3322);
                    }
                    if (field3321 != -1) {
                        class151.method1027(arg1, this.field3313 + var6, var24, field3321);
                    }
                    arg1 += var24;
                    var8 = var19;
                }
            }
        }
    }
}
