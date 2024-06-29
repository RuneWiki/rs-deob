import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class29 extends class77 {

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public int field398 = 0;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "[I")
    private int[] field410;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "[I")
    private int[] field402;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "[I")
    public int[] field414;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "[I")
    public int[] field404;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field405 = new StringBuffer(100);

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    private static int field407 = 0;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    private static int field411 = 0;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    private static int field408 = -1;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    private static int field409 = -1;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    private static int field416 = 0;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    private static int field413 = -1;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    private static int field418 = 256;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    private static int field412 = 0;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    private static int field415 = -1;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    private static int field419 = 256;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "[Ljava/lang/String;")
    private static String[] field417 = new String[100];

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "[B")
    private byte[] field406;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "[I")
    private int[] field400;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "[I")
    private int[] field401;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "[Lmo;")
    private class250[] field397;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V", line = 3)
    public static void method179() {
        field405 = null;
        field417 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 7)
    public final void method180(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method204(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method194(arg0, arg1 - this.method203(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 33)
    private final void method181(String arg0, int arg1) {
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
            field412 = (arg1 - this.method203(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 67)
    public final void method182(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method204(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method194(arg0, arg1 - this.method203(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I", line = 94)
    public final int method183(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class73.method605(field405, 0, 46, ' ');
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
                    String var15 = arg0.substring(var9 + 1, var13).toLowerCase();
                    var9 = -1;
                    field405.append('<');
                    field405.append(var15);
                    field405.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field405.toString().substring(var5, field405.length());
                        var11++;
                        var5 = field405.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method193('<');
                        if (this.field406 != null && var10 != '\u0000') {
                            var4 += this.field406[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method193('>');
                        if (this.field406 != null && var10 != '\u0000') {
                            var4 += this.field406[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method193(' ');
                        if (this.field406 != null && var10 != '\u0000') {
                            var4 += this.field406[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method193('\u00ad');
                        if (this.field406 != null && var10 != '\u0000') {
                            var4 += this.field406[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method193('×');
                        if (this.field406 != null && var10 != '\u0000') {
                            var4 += this.field406[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method193('€');
                        if (this.field406 != null && var10 != '\u0000') {
                            var4 += this.field406[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method193('©');
                        if (this.field406 != null && var10 != '\u0000') {
                            var4 += this.field406[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method193('®');
                        if (this.field406 != null && var10 != '\u0000') {
                            var4 += this.field406[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class28.method176((byte) 28, var15.substring(4));
                            var4 += this.field397[var16].field3719;
                            var10 = '\u0000';
                        } catch (Exception var18) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field405.append(var14);
                        var14 = (char) (class296.method2108(var14, (byte) 91) & 0xFF);
                        var4 += this.field400[var14];
                        if (this.field406 != null && var10 != '\u0000') {
                            var4 += this.field406[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field405.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field405.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field405.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field405.length() > var5) {
            arg2[var11] = field405.toString().substring(var5, field405.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 298)
    public final int method185(String arg0, int arg1) {
        int var3 = this.method183(arg0, new int[] { arg1 }, field417);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method203(field417[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 317)
    public final void method186(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method204(arg3, arg4);
            this.method206(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B[I[I[I[I)V", line = 1322)
    public class29(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field410 = arg1;
        this.field402 = arg2;
        this.field414 = arg3;
        this.field404 = arg4;
        this.method189(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field402[var8] < var6 && this.field404[var8] != 0) {
                var6 = this.field402[var8];
            }
            if (this.field404[var8] + this.field402[var8] > var7) {
                var7 = this.field404[var8] + this.field402[var8];
            }
        }
        this.field403 = this.field398 - var6;
        this.field399 = var7 - this.field398;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V", line = 1353)
    public class29(byte[] arg0) {
        this.method189(arg0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 327)
    public final int method187(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = this.field398;
        }
        int var4 = this.method183(arg0, new int[] { arg1 }, field417);
        int var5 = (var4 - 1) * arg2;
        return this.field403 + var5 + this.field399;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([Lmo;[I)V", line = 337)
    public final void method188(class250[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field397 = arg0;
        this.field401 = arg1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([B)V", line = 353)
    private final void method189(byte[] arg0) {
        this.field400 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field400.length; var2++) {
                this.field400[var2] = arg0[var2] & 0xFF;
            }
            this.field398 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field400[var4] = arg0[var3++] & 0xFF;
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
            byte var11 = 0;
            for (int var12 = 0; var12 < var9[var10].length; var12++) {
                var11 += arg0[var3++];
                var9[var10][var12] = var11;
            }
        }
        byte[][] var13 = new byte[256][];
        for (int var14 = 0; var14 < 256; var14++) {
            var13[var14] = new byte[var5[var14]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var13[var14].length; var16++) {
                var15 += arg0[var3++];
                var13[var14][var16] = var15;
            }
        }
        this.field406 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field406[(var17 << 8) + var18] = (byte) method190(var9, var13, var6, this.field400, var5, var17, var18);
                    }
                }
            }
        }
        this.field398 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 470)
    private static final int method190(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I", line = 517)
    public final int method191(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method202(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field403 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field403 - this.field399) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field399;
        }
        if (arg7 == 1) {
            var19 = this.method203(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method203(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method194(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method203(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field403;
            arg11[2] = var19;
            arg11[3] = this.field403 + this.field399;
        }
        return var15;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I", line = 582)
    public final int method192(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method205(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(C)I", line = 585)
    private final int method193(char arg0) {
        return this.field400[class296.method2108(arg0, (byte) -108) & 0xFF];
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V", line = 589)
    private final void method194(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field398;
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
                    String var13 = arg0.substring(var7 + 1, var11).toLowerCase();
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
                                    int var16 = class28.method176((byte) 28, var13.substring(4));
                                    class250 var17 = this.field397[var16];
                                    int var18 = this.field401 == null ? var17.field3713 : this.field401[var16];
                                    if (field419 == 256) {
                                        var17.method1482(arg1 + var14, this.field398 + var6 - var18 + var15);
                                    } else {
                                        var17.method1483(arg1 + var14, this.field398 + var6 - var18 + var15, field419);
                                    }
                                    arg1 += var17.field3719;
                                    var8 = '\u0000';
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method200(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var20 = (char) (class296.method2108(var12, (byte) 93) & 0xFF);
                    if (this.field406 != null && var8 != '\u0000') {
                        arg1 += this.field406[(var8 << 8) + var20];
                    }
                    int var21 = this.field414[var20];
                    int var22 = this.field404[var20];
                    int var23;
                    if (arg3 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg3[var9];
                    }
                    int var24;
                    if (arg4 == null) {
                        var24 = 0;
                    } else {
                        var24 = arg4[var9];
                    }
                    var9++;
                    if (var20 == ' ') {
                        if (field412 > 0) {
                            field411 += field412;
                            arg1 += field411 >> 8;
                            field411 &= 0xFF;
                        }
                    } else if (field419 == 256) {
                        if (field408 != -1) {
                            this.method184(var20, this.field410[var20] + arg1 + var23 + 1, this.field402[var20] + var6 + 1 + var24, var21, var22, field408, true);
                        }
                        this.method184(var20, this.field410[var20] + arg1 + var23, this.field402[var20] + var6 + var24, var21, var22, field416, false);
                    } else {
                        if (field408 != -1) {
                            this.method195(var20, this.field410[var20] + arg1 + var23 + 1, this.field402[var20] + var6 + 1 + var24, var21, var22, field408, field419, true);
                        }
                        this.method195(var20, this.field410[var20] + arg1 + var23, this.field402[var20] + var6 + var24, var21, var22, field416, field419, false);
                    }
                    int var25 = this.field400[var20];
                    if (field415 != -1) {
                        if (class141.field2031) {
                            class205.method1485(arg1, (int) ((double) this.field398 * 0.7D) + var6, var25, field415);
                        } else {
                            class44.method339(arg1, (int) ((double) this.field398 * 0.7D) + var6, var25, field415);
                        }
                    }
                    if (field413 != -1) {
                        if (class141.field2031) {
                            class205.method1485(arg1, this.field398 + var6, var25, field413);
                        } else {
                            class44.method339(arg1, this.field398 + var6, var25, field413);
                        }
                    }
                    arg1 += var25;
                    var8 = var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 776)
    public static final String method196(String arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            char var4 = arg0.charAt(var3);
            if (var4 == '<' || var4 == '>') {
                var2 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var1 + var2);
        for (int var6 = 0; var6 < var1; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 816)
    public final void method197(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method204(arg3, arg4);
            this.method206(arg0, arg1 - this.method203(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 826)
    public final void method198(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method204(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method194(arg0, arg1 - this.method203(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I", line = 844)
    public final int method199(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method202(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method194(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Ljava/lang/String;)V", line = 875)
    private final void method200(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field416 = class71.method569(16, arg0.substring(4), 115);
            } else if (arg0.equals("/col")) {
                field416 = field407;
            } else if (arg0.startsWith("trans=")) {
                field419 = class28.method176((byte) 28, arg0.substring(6));
            } else if (arg0.equals("/trans")) {
                field419 = field418;
            } else if (arg0.startsWith("str=")) {
                field415 = class71.method569(16, arg0.substring(4), 104);
            } else if (arg0.equals("str")) {
                field415 = 8388608;
            } else if (arg0.equals("/str")) {
                field415 = -1;
            } else if (arg0.startsWith("u=")) {
                field413 = class71.method569(16, arg0.substring(2), 120);
            } else if (arg0.equals("u")) {
                field413 = 0;
            } else if (arg0.equals("/u")) {
                field413 = -1;
            } else if (arg0.startsWith("shad=")) {
                field408 = class71.method569(16, arg0.substring(5), -118);
            } else if (arg0.equals("shad")) {
                field408 = 0;
            } else if (arg0.equals("/shad")) {
                field408 = field409;
            } else if (arg0.equals("br")) {
                this.method202(field407, field409, field418);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(Ljava/lang/String;IIII)V", line = 943)
    public final void method201(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method204(arg3, arg4);
            this.method206(arg0, arg1 - this.method203(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V", line = 950)
    private final void method202(int arg0, int arg1, int arg2) {
        field415 = -1;
        field413 = -1;
        field409 = arg1;
        field408 = arg1;
        field407 = arg0;
        field416 = arg0;
        field418 = arg2;
        field419 = arg2;
        field412 = 0;
        field411 = 0;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(Ljava/lang/String;)I", line = 963)
    public final int method203(String arg0) {
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
                    String var8 = arg0.substring(var2 + 1, var6).toLowerCase();
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
                                    int var9 = class28.method176((byte) 28, var8.substring(4));
                                    var4 += this.field397[var9].field3719;
                                    var3 = '\u0000';
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var7 = '®';
                    }
                }
                if (var2 == -1) {
                    char var11 = (char) (class296.method2108(var7, (byte) 60) & 0xFF);
                    var4 += this.field400[var11];
                    if (this.field406 != null && var3 != '\u0000') {
                        var4 += this.field406[(var3 << 8) + var11];
                    }
                    var3 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V", line = 1059)
    private final void method204(int arg0, int arg1) {
        field415 = -1;
        field413 = -1;
        field409 = arg1;
        field408 = arg1;
        field407 = arg0;
        field416 = arg0;
        field418 = 256;
        field419 = 256;
        field412 = 0;
        field411 = 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I", line = 1069)
    public final int method205(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method202(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field398;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field403 + this.field399 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method183(arg0, var12, field417);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field403 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field403 - this.field399 - (var13 - 1) * arg10) / 2 + this.field403 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field399 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field403 - this.field399 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field403 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method206(field417[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method206(field417[var16], arg1 + (arg3 - this.method203(field417[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method206(field417[var16], arg1 + arg3 - this.method203(field417[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method206(field417[var16], arg1, var14);
            } else {
                this.method181(field417[var16], arg3);
                this.method206(field417[var16], arg1, var14);
                field412 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Ljava/lang/String;II)V", line = 1147)
    private final void method206(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field398;
        int var5 = -1;
        char var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var9 == '<') {
                var5 = var8;
            } else {
                if (var9 == '>' && var5 != -1) {
                    String var10 = arg0.substring(var5 + 1, var8).toLowerCase();
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
                                    int var11 = class28.method176((byte) 28, var10.substring(4));
                                    class250 var12 = this.field397[var11];
                                    int var13 = this.field401 == null ? var12.field3713 : this.field401[var11];
                                    if (field419 == 256) {
                                        var12.method1482(arg1, this.field398 + var4 - var13);
                                    } else {
                                        var12.method1483(arg1, this.field398 + var4 - var13, field419);
                                    }
                                    arg1 += var12.field3719;
                                    var6 = '\u0000';
                                } catch (Exception var19) {
                                }
                            } else {
                                this.method200(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var15 = (char) (class296.method2108(var9, (byte) -71) & 0xFF);
                    if (this.field406 != null && var6 != '\u0000') {
                        arg1 += this.field406[(var6 << 8) + var15];
                    }
                    int var16 = this.field414[var15];
                    int var17 = this.field404[var15];
                    if (var15 == ' ') {
                        if (field412 > 0) {
                            field411 += field412;
                            arg1 += field411 >> 8;
                            field411 &= 0xFF;
                        }
                    } else if (field419 == 256) {
                        if (field408 != -1) {
                            this.method184(var15, this.field410[var15] + arg1 + 1, this.field402[var15] + var4 + 1, var16, var17, field408, true);
                        }
                        this.method184(var15, this.field410[var15] + arg1, this.field402[var15] + var4, var16, var17, field416, false);
                    } else {
                        if (field408 != -1) {
                            this.method195(var15, this.field410[var15] + arg1 + 1, this.field402[var15] + var4 + 1, var16, var17, field408, field419, true);
                        }
                        this.method195(var15, this.field410[var15] + arg1, this.field402[var15] + var4, var16, var17, field416, field419, false);
                    }
                    int var18 = this.field400[var15];
                    if (field415 != -1) {
                        if (class141.field2031) {
                            class205.method1485(arg1, (int) ((double) this.field398 * 0.7D) + var4, var18, field415);
                        } else {
                            class44.method339(arg1, (int) ((double) this.field398 * 0.7D) + var4, var18, field415);
                        }
                    }
                    if (field413 != -1) {
                        if (class141.field2031) {
                            class205.method1485(arg1, this.field398 + var4 + 1, var18, field413);
                        } else {
                            class44.method339(arg1, this.field398 + var4 + 1, var18, field413);
                        }
                    }
                    arg1 += var18;
                    var6 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(Ljava/lang/String;I)I", line = 1308)
    public final int method207(String arg0, int arg1) {
        return this.method183(arg0, new int[] { arg1 }, field417);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);
}
