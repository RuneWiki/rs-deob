import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class326 extends class325 {

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public int field5022 = 0;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "[I")
    private int[] field5026;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "[I")
    private int[] field5025;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "[I")
    public int[] field5029;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "[I")
    public int[] field5027;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    private int field5041;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    private int field5030;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field5028 = new StringBuffer(100);

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    private static int field5033 = 0;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    private static int field5032 = -1;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    private static int field5034 = 0;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    private static int field5038 = 256;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "[Ljava/lang/String;")
    private static String[] field5037 = new String[100];

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    private static int field5035 = -1;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    private static int field5039 = -1;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "I")
    private static int field5042 = 256;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    private static int field5040 = 0;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    private static int field5036 = 0;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    private static int field5043 = -1;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "[B")
    private byte[] field5024;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "[I")
    private int[] field5023;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "[I")
    private int[] field5031;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "[Ljn;")
    private class327[] field5021;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 7)
    public final int method2259(String arg0, int arg1) {
        return this.method2260(arg0, new int[] { arg1 }, field5037);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I", line = 10)
    public final int method2260(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class108.method817(-19, field5028, ' ', 0);
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
                    field5028.append('<');
                    field5028.append(var15);
                    field5028.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field5028.toString().substring(var5, field5028.length());
                        var11++;
                        var5 = field5028.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method2275('<');
                        if (this.field5024 != null && var10 != '\u0000') {
                            var4 += this.field5024[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method2275('>');
                        if (this.field5024 != null && var10 != '\u0000') {
                            var4 += this.field5024[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method2275(' ');
                        if (this.field5024 != null && var10 != '\u0000') {
                            var4 += this.field5024[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method2275('\u00ad');
                        if (this.field5024 != null && var10 != '\u0000') {
                            var4 += this.field5024[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method2275('×');
                        if (this.field5024 != null && var10 != '\u0000') {
                            var4 += this.field5024[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method2275('€');
                        if (this.field5024 != null && var10 != '\u0000') {
                            var4 += this.field5024[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method2275('©');
                        if (this.field5024 != null && var10 != '\u0000') {
                            var4 += this.field5024[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method2275('®');
                        if (this.field5024 != null && var10 != '\u0000') {
                            var4 += this.field5024[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class129.method990(var15.substring(4), 124);
                            var4 += this.field5021[var16].field5052;
                            var10 = '\u0000';
                        } catch (Exception var18) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field5028.append(var14);
                        var14 = (char) (class152.method1145((byte) -109, var14) & 0xFF);
                        var4 += this.field5031[var14];
                        if (this.field5024 != null && var10 != '\u0000') {
                            var4 += this.field5024[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field5028.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field5028.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field5028.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field5028.length() > var5) {
            arg2[var11] = field5028.toString().substring(var5, field5028.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V", line = 221)
    private final void method2261(int arg0, int arg1) {
        field5035 = -1;
        field5039 = -1;
        field5043 = arg1;
        field5032 = arg1;
        field5036 = arg0;
        field5040 = arg0;
        field5038 = 256;
        field5042 = 256;
        field5034 = 0;
        field5033 = 0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V", line = 231)
    private final void method2262(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field5022;
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
                                    int var16 = class129.method990(var13.substring(4), 82);
                                    class327 var17 = this.field5021[var16];
                                    int var18 = this.field5023 == null ? var17.field5051 : this.field5023[var16];
                                    if (field5042 == 256) {
                                        var17.method322(arg1 + var14, this.field5022 + var6 - var18 + var15);
                                    } else {
                                        var17.method324(arg1 + var14, this.field5022 + var6 - var18 + var15, field5042);
                                    }
                                    arg1 += var17.field5052;
                                    var8 = '\u0000';
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method2278(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var20 = (char) (class152.method1145((byte) -28, var12) & 0xFF);
                    if (this.field5024 != null && var8 != '\u0000') {
                        arg1 += this.field5024[(var8 << 8) + var20];
                    }
                    int var21 = this.field5029[var20];
                    int var22 = this.field5027[var20];
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
                        if (field5034 > 0) {
                            field5033 += field5034;
                            arg1 += field5033 >> 8;
                            field5033 &= 0xFF;
                        }
                    } else if (field5042 == 256) {
                        if (field5032 != -1) {
                            this.method487(var20, this.field5026[var20] + arg1 + var23 + 1, this.field5025[var20] + var6 + 1 + var24, var21, var22, field5032, true);
                        }
                        this.method487(var20, this.field5026[var20] + arg1 + var23, this.field5025[var20] + var6 + var24, var21, var22, field5040, false);
                    } else {
                        if (field5032 != -1) {
                            this.method484(var20, this.field5026[var20] + arg1 + var23 + 1, this.field5025[var20] + var6 + 1 + var24, var21, var22, field5032, field5042, true);
                        }
                        this.method484(var20, this.field5026[var20] + arg1 + var23, this.field5025[var20] + var6 + var24, var21, var22, field5040, field5042, false);
                    }
                    int var25 = this.field5031[var20];
                    if (field5035 != -1) {
                        if (class73.field1058) {
                            class175.method1309(arg1, (int) ((double) this.field5022 * 0.7D) + var6, var25, field5035);
                        } else {
                            class287.method1990(arg1, (int) ((double) this.field5022 * 0.7D) + var6, var25, field5035);
                        }
                    }
                    if (field5039 != -1) {
                        if (class73.field1058) {
                            class175.method1309(arg1, this.field5022 + var6, var25, field5039);
                        } else {
                            class287.method1990(arg1, this.field5022 + var6, var25, field5039);
                        }
                    }
                    arg1 += var25;
                    var8 = var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 418)
    public static final String method2263(String arg0) {
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

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([B)V", line = 462)
    private final void method2264(byte[] arg0) {
        this.field5031 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field5031.length; var2++) {
                this.field5031[var2] = arg0[var2] & 0xFF;
            }
            this.field5022 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field5031[var4] = arg0[var3++] & 0xFF;
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
        this.field5024 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field5024[(var17 << 8) + var18] = (byte) method2283(var9, var13, var6, this.field5031, var5, var17, var18);
                    }
                }
            }
        }
        this.field5022 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 582)
    public final void method2265(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2261(arg3, arg4);
            this.method2280(arg0, arg1 - this.method2281(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I", line = 590)
    public final int method2266(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method2270(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 593)
    public final void method2267(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method2261(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method2262(arg0, arg1 - this.method2281(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I", line = 616)
    public final int method2268(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method2276(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method2262(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 645)
    public final void method2269(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method2261(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method2262(arg0, arg1 - this.method2281(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I", line = 663)
    public final int method2270(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method2276(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field5022;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field5041 + this.field5030 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method2260(arg0, var12, field5037);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field5041 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field5041 - this.field5030 - (var13 - 1) * arg10) / 2 + this.field5041 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field5030 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field5041 - this.field5030 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field5041 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method2280(field5037[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method2280(field5037[var16], arg1 + (arg3 - this.method2281(field5037[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method2280(field5037[var16], arg1 + arg3 - this.method2281(field5037[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method2280(field5037[var16], arg1, var14);
            } else {
                this.method2284(field5037[var16], arg3);
                this.method2280(field5037[var16], arg1, var14);
                field5034 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 737)
    public final void method2271(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2261(arg3, arg4);
            this.method2280(arg0, arg1 - this.method2281(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()V", line = 744)
    public static void method2272() {
        field5028 = null;
        field5037 = null;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 751)
    public final int method2273(String arg0, int arg1) {
        int var3 = this.method2260(arg0, new int[] { arg1 }, field5037);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method2281(field5037[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(Ljava/lang/String;IIII)V", line = 770)
    public final void method2274(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2261(arg3, arg4);
            this.method2280(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(C)I", line = 777)
    private final int method2275(char arg0) {
        return this.field5031[class152.method1145((byte) -120, arg0) & 0xFF];
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)V", line = 780)
    private final void method2276(int arg0, int arg1, int arg2) {
        field5035 = -1;
        field5039 = -1;
        field5043 = arg1;
        field5032 = arg1;
        field5036 = arg0;
        field5040 = arg0;
        field5038 = arg2;
        field5042 = arg2;
        field5034 = 0;
        field5033 = 0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([Ljn;[I)V", line = 791)
    public final void method2277(class327[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field5021 = arg0;
        this.field5023 = arg1;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Ljava/lang/String;)V", line = 804)
    private final void method2278(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field5040 = class333.method2328(arg0.substring(4), 16, 88);
            } else if (arg0.equals("/col")) {
                field5040 = field5036;
            } else if (arg0.startsWith("trans=")) {
                field5042 = class129.method990(arg0.substring(6), 95);
            } else if (arg0.equals("/trans")) {
                field5042 = field5038;
            } else if (arg0.startsWith("str=")) {
                field5035 = class333.method2328(arg0.substring(4), 16, -125);
            } else if (arg0.equals("str")) {
                field5035 = 8388608;
            } else if (arg0.equals("/str")) {
                field5035 = -1;
            } else if (arg0.startsWith("u=")) {
                field5039 = class333.method2328(arg0.substring(2), 16, 116);
            } else if (arg0.equals("u")) {
                field5039 = 0;
            } else if (arg0.equals("/u")) {
                field5039 = -1;
            } else if (arg0.startsWith("shad=")) {
                field5032 = class333.method2328(arg0.substring(5), 16, -111);
            } else if (arg0.equals("shad")) {
                field5032 = 0;
            } else if (arg0.equals("/shad")) {
                field5032 = field5043;
            } else if (arg0.equals("br")) {
                this.method2276(field5036, field5043, field5038);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "([B[I[I[I[I)V", line = 1323)
    public class326(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field5026 = arg1;
        this.field5025 = arg2;
        this.field5029 = arg3;
        this.field5027 = arg4;
        this.method2264(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field5025[var8] < var6 && this.field5027[var8] != 0) {
                var6 = this.field5025[var8];
            }
            if (this.field5027[var8] + this.field5025[var8] > var7) {
                var7 = this.field5027[var8] + this.field5025[var8];
            }
        }
        this.field5041 = this.field5022 - var6;
        this.field5030 = var7 - this.field5022;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "([B)V", line = 1358)
    public class326(byte[] arg0) {
        this.method2264(arg0);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I", line = 872)
    public final int method2279(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method2276(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field5041 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field5041 - this.field5030) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field5030;
        }
        if (arg7 == 1) {
            var19 = this.method2281(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method2281(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method2262(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method2281(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field5041;
            arg11[2] = var19;
            arg11[3] = this.field5041 + this.field5030;
        }
        return var15;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 936)
    private final void method2280(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field5022;
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
                                    int var11 = class129.method990(var10.substring(4), 77);
                                    class327 var12 = this.field5021[var11];
                                    int var13 = this.field5023 == null ? var12.field5051 : this.field5023[var11];
                                    if (field5042 == 256) {
                                        var12.method322(arg1, this.field5022 + var4 - var13);
                                    } else {
                                        var12.method324(arg1, this.field5022 + var4 - var13, field5042);
                                    }
                                    arg1 += var12.field5052;
                                    var6 = '\u0000';
                                } catch (Exception var19) {
                                }
                            } else {
                                this.method2278(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var15 = (char) (class152.method1145((byte) -119, var9) & 0xFF);
                    if (this.field5024 != null && var6 != '\u0000') {
                        arg1 += this.field5024[(var6 << 8) + var15];
                    }
                    int var16 = this.field5029[var15];
                    int var17 = this.field5027[var15];
                    if (var15 == ' ') {
                        if (field5034 > 0) {
                            field5033 += field5034;
                            arg1 += field5033 >> 8;
                            field5033 &= 0xFF;
                        }
                    } else if (field5042 == 256) {
                        if (field5032 != -1) {
                            this.method487(var15, this.field5026[var15] + arg1 + 1, this.field5025[var15] + var4 + 1, var16, var17, field5032, true);
                        }
                        this.method487(var15, this.field5026[var15] + arg1, this.field5025[var15] + var4, var16, var17, field5040, false);
                    } else {
                        if (field5032 != -1) {
                            this.method484(var15, this.field5026[var15] + arg1 + 1, this.field5025[var15] + var4 + 1, var16, var17, field5032, field5042, true);
                        }
                        this.method484(var15, this.field5026[var15] + arg1, this.field5025[var15] + var4, var16, var17, field5040, field5042, false);
                    }
                    int var18 = this.field5031[var15];
                    if (field5035 != -1) {
                        if (class73.field1058) {
                            class175.method1309(arg1, (int) ((double) this.field5022 * 0.7D) + var4, var18, field5035);
                        } else {
                            class287.method1990(arg1, (int) ((double) this.field5022 * 0.7D) + var4, var18, field5035);
                        }
                    }
                    if (field5039 != -1) {
                        if (class73.field1058) {
                            class175.method1309(arg1, this.field5022 + var4 + 1, var18, field5039);
                        } else {
                            class287.method1990(arg1, this.field5022 + var4 + 1, var18, field5039);
                        }
                    }
                    arg1 += var18;
                    var6 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(Ljava/lang/String;)I", line = 1097)
    public final int method2281(String arg0) {
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
                                    int var9 = class129.method990(var8.substring(4), 29);
                                    var4 += this.field5021[var9].field5052;
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
                    char var11 = (char) (class152.method1145((byte) -102, var7) & 0xFF);
                    var4 += this.field5031[var11];
                    if (this.field5024 != null && var3 != '\u0000') {
                        var4 += this.field5024[(var3 << 8) + var11];
                    }
                    var3 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 1198)
    public final void method2282(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method2261(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method2262(arg0, arg1 - this.method2281(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 1222)
    private static final int method2283(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(Ljava/lang/String;I)V", line = 1292)
    private final void method2284(String arg0, int arg1) {
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
            field5034 = (arg1 - this.method2281(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);
}
