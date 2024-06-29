import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class class323 extends class128 {

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public int field5127 = 0;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "[I")
    private int[] field5126;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "[I")
    private int[] field5128;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "[I")
    public int[] field5125;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "[I")
    public int[] field5130;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    private int field5134;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    private int field5135;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field5132 = new StringBuffer(100);

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    private static int field5138 = -1;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    private static int field5137 = -1;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    private static int field5141 = 0;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    private static int field5142 = 0;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    private static int field5140 = 256;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    private static int field5145 = -1;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    private static int field5139 = 256;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "[Ljava/lang/String;")
    private static String[] field5136 = new String[100];

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    private static int field5144 = -1;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    private static int field5143 = 0;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    private static int field5147 = 0;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "[B")
    private byte[] field5129;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "[I")
    private int[] field5131;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "[I")
    private int[] field5133;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "[Lgh;")
    private class250[] field5146;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I", line = 4)
    public final int method2220(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method2226(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method2222(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 32)
    private final void method2221(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field5127;
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
                                    int var11 = class97.method841(var10.substring(4), (byte) -20);
                                    class250 var12 = this.field5146[var11];
                                    int var13 = this.field5131 == null ? var12.field4050 : this.field5131[var11];
                                    if (field5139 == 256) {
                                        var12.method1596(arg1, this.field5127 + var4 - var13);
                                    } else {
                                        var12.method1604(arg1, this.field5127 + var4 - var13, field5139);
                                    }
                                    arg1 += var12.field4047;
                                    var6 = '\u0000';
                                } catch (Exception var19) {
                                }
                            } else {
                                this.method2234(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var15 = (char) (class94.method810((byte) 124, var9) & 0xFF);
                    if (this.field5129 != null && var6 != '\u0000') {
                        arg1 += this.field5129[(var6 << 8) + var15];
                    }
                    int var16 = this.field5125[var15];
                    int var17 = this.field5130[var15];
                    if (var15 == ' ') {
                        if (field5143 > 0) {
                            field5142 += field5143;
                            arg1 += field5142 >> 8;
                            field5142 &= 0xFF;
                        }
                    } else if (field5139 == 256) {
                        if (field5145 != -1) {
                            this.method1662(var15, this.field5126[var15] + arg1 + 1, this.field5128[var15] + var4 + 1, var16, var17, field5145, true);
                        }
                        this.method1662(var15, this.field5126[var15] + arg1, this.field5128[var15] + var4, var16, var17, field5141, false);
                    } else {
                        if (field5145 != -1) {
                            this.method1663(var15, this.field5126[var15] + arg1 + 1, this.field5128[var15] + var4 + 1, var16, var17, field5145, field5139, true);
                        }
                        this.method1663(var15, this.field5126[var15] + arg1, this.field5128[var15] + var4, var16, var17, field5141, field5139, false);
                    }
                    int var18 = this.field5133[var15];
                    if (field5138 != -1) {
                        if (class43.field680) {
                            class169.method1323(arg1, (int) ((double) this.field5127 * 0.7D) + var4, var18, field5138);
                        } else {
                            class47.method412(arg1, (int) ((double) this.field5127 * 0.7D) + var4, var18, field5138);
                        }
                    }
                    if (field5137 != -1) {
                        if (class43.field680) {
                            class169.method1323(arg1, this.field5127 + var4 + 1, var18, field5137);
                        } else {
                            class47.method412(arg1, this.field5127 + var4 + 1, var18, field5137);
                        }
                    }
                    arg1 += var18;
                    var6 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V", line = 187)
    private final void method2222(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field5127;
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
                                    int var16 = class97.method841(var13.substring(4), (byte) -20);
                                    class250 var17 = this.field5146[var16];
                                    int var18 = this.field5131 == null ? var17.field4050 : this.field5131[var16];
                                    if (field5139 == 256) {
                                        var17.method1596(arg1 + var14, this.field5127 + var6 - var18 + var15);
                                    } else {
                                        var17.method1604(arg1 + var14, this.field5127 + var6 - var18 + var15, field5139);
                                    }
                                    arg1 += var17.field4047;
                                    var8 = '\u0000';
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method2234(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var20 = (char) (class94.method810((byte) 127, var12) & 0xFF);
                    if (this.field5129 != null && var8 != '\u0000') {
                        arg1 += this.field5129[(var8 << 8) + var20];
                    }
                    int var21 = this.field5125[var20];
                    int var22 = this.field5130[var20];
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
                        if (field5143 > 0) {
                            field5142 += field5143;
                            arg1 += field5142 >> 8;
                            field5142 &= 0xFF;
                        }
                    } else if (field5139 == 256) {
                        if (field5145 != -1) {
                            this.method1662(var20, this.field5126[var20] + arg1 + var23 + 1, this.field5128[var20] + var6 + 1 + var24, var21, var22, field5145, true);
                        }
                        this.method1662(var20, this.field5126[var20] + arg1 + var23, this.field5128[var20] + var6 + var24, var21, var22, field5141, false);
                    } else {
                        if (field5145 != -1) {
                            this.method1663(var20, this.field5126[var20] + arg1 + var23 + 1, this.field5128[var20] + var6 + 1 + var24, var21, var22, field5145, field5139, true);
                        }
                        this.method1663(var20, this.field5126[var20] + arg1 + var23, this.field5128[var20] + var6 + var24, var21, var22, field5141, field5139, false);
                    }
                    int var25 = this.field5133[var20];
                    if (field5138 != -1) {
                        if (class43.field680) {
                            class169.method1323(arg1, (int) ((double) this.field5127 * 0.7D) + var6, var25, field5138);
                        } else {
                            class47.method412(arg1, (int) ((double) this.field5127 * 0.7D) + var6, var25, field5138);
                        }
                    }
                    if (field5137 != -1) {
                        if (class43.field680) {
                            class169.method1323(arg1, this.field5127 + var6, var25, field5137);
                        } else {
                            class47.method412(arg1, this.field5127 + var6, var25, field5137);
                        }
                    }
                    arg1 += var25;
                    var8 = var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;)I", line = 371)
    public final int method2223(String arg0) {
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
                                    int var9 = class97.method841(var8.substring(4), (byte) -20);
                                    var4 += this.field5146[var9].field4047;
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
                    char var11 = (char) (class94.method810((byte) 126, var7) & 0xFF);
                    var4 += this.field5133[var11];
                    if (this.field5129 != null && var3 != '\u0000') {
                        var4 += this.field5129[(var3 << 8) + var11];
                    }
                    var3 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 468)
    public final void method2224(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method2241(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method2222(arg0, arg1 - this.method2223(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B[I[I[I[I)V", line = 1323)
    public class323(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field5126 = arg1;
        this.field5128 = arg2;
        this.field5125 = arg3;
        this.field5130 = arg4;
        this.method2227(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field5128[var8] < var6 && this.field5130[var8] != 0) {
                var6 = this.field5128[var8];
            }
            if (this.field5130[var8] + this.field5128[var8] > var7) {
                var7 = this.field5130[var8] + this.field5128[var8];
            }
        }
        this.field5134 = this.field5127 - var6;
        this.field5135 = var7 - this.field5127;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V", line = 1367)
    public class323(byte[] arg0) {
        this.method2227(arg0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(C)I", line = 496)
    private final int method2225(char arg0) {
        return this.field5133[class94.method810((byte) 126, arg0) & 0xFF];
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V", line = 499)
    private final void method2226(int arg0, int arg1, int arg2) {
        field5138 = -1;
        field5137 = -1;
        field5144 = arg1;
        field5145 = arg1;
        field5147 = arg0;
        field5141 = arg0;
        field5140 = arg2;
        field5139 = arg2;
        field5143 = 0;
        field5142 = 0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([B)V", line = 508)
    private final void method2227(byte[] arg0) {
        this.field5133 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field5133.length; var2++) {
                this.field5133[var2] = arg0[var2] & 0xFF;
            }
            this.field5127 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field5133[var4] = arg0[var3++] & 0xFF;
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
        this.field5129 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field5129[(var17 << 8) + var18] = (byte) method2228(var9, var13, var6, this.field5133, var5, var17, var18);
                    }
                }
            }
        }
        this.field5127 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 630)
    private static final int method2228(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 677)
    public static final String method2229(String arg0) {
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

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()V", line = 718)
    public static void method2230() {
        field5132 = null;
        field5136 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I", line = 722)
    public final int method2231(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method2226(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field5134 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field5134 - this.field5135) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field5135;
        }
        if (arg7 == 1) {
            var19 = this.method2223(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method2223(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method2222(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method2223(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field5134;
            arg11[2] = var19;
            arg11[3] = this.field5135 + this.field5134;
        }
        return var15;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I", line = 787)
    public final int method2232(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method2238(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 792)
    public final int method2233(String arg0, int arg1) {
        return this.method2235(arg0, new int[] { arg1 }, field5136);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(Ljava/lang/String;)V", line = 797)
    private final void method2234(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field5141 = class171.method1347(arg0.substring(4), 16, 125);
            } else if (arg0.equals("/col")) {
                field5141 = field5147;
            } else if (arg0.startsWith("trans=")) {
                field5139 = class97.method841(arg0.substring(6), (byte) -20);
            } else if (arg0.equals("/trans")) {
                field5139 = field5140;
            } else if (arg0.startsWith("str=")) {
                field5138 = class171.method1347(arg0.substring(4), 16, 127);
            } else if (arg0.equals("str")) {
                field5138 = 8388608;
            } else if (arg0.equals("/str")) {
                field5138 = -1;
            } else if (arg0.startsWith("u=")) {
                field5137 = class171.method1347(arg0.substring(2), 16, 127);
            } else if (arg0.equals("u")) {
                field5137 = 0;
            } else if (arg0.equals("/u")) {
                field5137 = -1;
            } else if (arg0.startsWith("shad=")) {
                field5145 = class171.method1347(arg0.substring(5), 16, 124);
            } else if (arg0.equals("shad")) {
                field5145 = 0;
            } else if (arg0.equals("/shad")) {
                field5145 = field5144;
            } else if (arg0.equals("br")) {
                this.method2226(field5147, field5144, field5140);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I", line = 859)
    public final int method2235(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class31.method292(' ', -18, field5132, 0);
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
                    field5132.append('<');
                    field5132.append(var15);
                    field5132.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field5132.toString().substring(var5, field5132.length());
                        var11++;
                        var5 = field5132.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method2225('<');
                        if (this.field5129 != null && var10 != '\u0000') {
                            var4 += this.field5129[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method2225('>');
                        if (this.field5129 != null && var10 != '\u0000') {
                            var4 += this.field5129[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method2225(' ');
                        if (this.field5129 != null && var10 != '\u0000') {
                            var4 += this.field5129[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method2225('\u00ad');
                        if (this.field5129 != null && var10 != '\u0000') {
                            var4 += this.field5129[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method2225('×');
                        if (this.field5129 != null && var10 != '\u0000') {
                            var4 += this.field5129[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method2225('€');
                        if (this.field5129 != null && var10 != '\u0000') {
                            var4 += this.field5129[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method2225('©');
                        if (this.field5129 != null && var10 != '\u0000') {
                            var4 += this.field5129[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method2225('®');
                        if (this.field5129 != null && var10 != '\u0000') {
                            var4 += this.field5129[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class97.method841(var15.substring(4), (byte) -20);
                            var4 += this.field5146[var16].field4047;
                            var10 = '\u0000';
                        } catch (Exception var18) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field5132.append(var14);
                        var14 = (char) (class94.method810((byte) 126, var14) & 0xFF);
                        var4 += this.field5133[var14];
                        if (this.field5129 != null && var10 != '\u0000') {
                            var4 += this.field5129[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field5132.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field5132.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field5132.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field5132.length() > var5) {
            arg2[var11] = field5132.toString().substring(var5, field5132.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 1062)
    public final int method2236(String arg0, int arg1) {
        int var3 = this.method2235(arg0, new int[] { arg1 }, field5136);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method2223(field5136[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 1083)
    public final void method2237(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2241(arg3, arg4);
            this.method2221(arg0, arg1 - this.method2223(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I", line = 1091)
    public final int method2238(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method2226(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field5127;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field5135 + this.field5134 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method2235(arg0, var12, field5136);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field5134 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field5134 - this.field5135 - (var13 - 1) * arg10) / 2 + this.field5134 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field5135 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field5134 - this.field5135 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field5134 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method2221(field5136[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method2221(field5136[var16], arg1 + (arg3 - this.method2223(field5136[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method2221(field5136[var16], arg1 + arg3 - this.method2223(field5136[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method2221(field5136[var16], arg1, var14);
            } else {
                this.method2243(field5136[var16], arg3);
                this.method2221(field5136[var16], arg1, var14);
                field5143 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 1169)
    public final void method2239(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2241(arg3, arg4);
            this.method2221(arg0, arg1 - this.method2223(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(Ljava/lang/String;IIII)V", line = 1176)
    public final void method2240(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2241(arg3, arg4);
            this.method2221(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)V", line = 1183)
    private final void method2241(int arg0, int arg1) {
        field5138 = -1;
        field5137 = -1;
        field5144 = arg1;
        field5145 = arg1;
        field5147 = arg0;
        field5141 = arg0;
        field5140 = 256;
        field5139 = 256;
        field5143 = 0;
        field5142 = 0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([Lgh;[I)V", line = 1195)
    public final void method2242(class250[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field5146 = arg0;
        this.field5131 = arg1;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(Ljava/lang/String;I)V", line = 1210)
    private final void method2243(String arg0, int arg1) {
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
            field5143 = (arg1 - this.method2223(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 1253)
    public final void method2244(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method2241(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method2222(arg0, arg1 - this.method2223(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 1296)
    public final void method2245(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method2241(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method2222(arg0, arg1 - this.method2223(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method1663(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method1662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);
}
