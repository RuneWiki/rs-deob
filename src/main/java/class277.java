import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class277 extends class36 {

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public int field4143 = 0;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "[I")
    private int[] field4146;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "[I")
    private int[] field4158;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "[I")
    public int[] field4148;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "[I")
    public int[] field4150;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "I")
    private int field4151;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    private int field4149;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field4152 = new StringBuffer(100);

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
    private static int field4154 = 0;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "[Ljava/lang/String;")
    private static String[] field4153 = new String[100];

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "I")
    private static int field4155 = -1;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
    private static int field4162 = 256;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
    private static int field4160 = 0;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    private static int field4157 = 256;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
    private static int field4163 = 0;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    private static int field4164 = -1;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    private static int field4161 = -1;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    private static int field4159 = 0;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    private static int field4165 = -1;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "[B")
    private byte[] field4144;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "[I")
    private int[] field4147;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "[I")
    private int[] field4156;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "[Lbc;")
    private class4[] field4145;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 4)
    public final void method1899(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1910(arg3, arg4);
            this.method1920(arg0, arg1 - this.method1904(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;)V", line = 17)
    private final void method1900(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4160 = class83.method649(false, arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field4160 = field4159;
            } else if (arg0.startsWith("trans=")) {
                field4157 = class190.method1332(arg0.substring(6), (byte) -124);
            } else if (arg0.equals("/trans")) {
                field4157 = field4162;
            } else if (arg0.startsWith("str=")) {
                field4164 = class83.method649(false, arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field4164 = 8388608;
            } else if (arg0.equals("/str")) {
                field4164 = -1;
            } else if (arg0.startsWith("u=")) {
                field4161 = class83.method649(false, arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field4161 = 0;
            } else if (arg0.equals("/u")) {
                field4161 = -1;
            } else if (arg0.startsWith("shad=")) {
                field4165 = class83.method649(false, arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field4165 = 0;
            } else if (arg0.equals("/shad")) {
                field4165 = field4155;
            } else if (arg0.equals("br")) {
                this.method1914(field4159, field4155, field4162);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([B)V", line = 78)
    private final void method1901(byte[] arg0) {
        this.field4147 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4147.length; var2++) {
                this.field4147[var2] = arg0[var2] & 0xFF;
            }
            this.field4143 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4147[var4] = arg0[var3++] & 0xFF;
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
        this.field4144 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4144[(var17 << 8) + var18] = (byte) method1917(var9, var13, var6, this.field4147, var5, var17, var18);
                    }
                }
            }
        }
        this.field4143 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I", line = 195)
    public final int method1902(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method1918(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 200)
    public static final String method1903(String arg0) {
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

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(Ljava/lang/String;)I", line = 241)
    public final int method1904(String arg0) {
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
                                    int var9 = class190.method1332(var8.substring(4), (byte) -127);
                                    var4 += this.field4145[var9].field31;
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
                    char var11 = (char) (class65.method441(var7, -32024) & 0xFF);
                    var4 += this.field4147[var11];
                    if (this.field4144 != null && var3 != '\u0000') {
                        var4 += this.field4144[(var3 << 8) + var11];
                    }
                    var3 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([Lbc;[I)V", line = 336)
    public final void method1905(class4[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field4145 = arg0;
        this.field4156 = arg1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 348)
    public final void method1906(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1910(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method1908(arg0, arg1 - this.method1904(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 376)
    public final void method1907(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1910(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method1908(arg0, arg1 - this.method1904(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V", line = 394)
    private final void method1908(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4143;
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
                                    int var16 = class190.method1332(var13.substring(4), (byte) -118);
                                    class4 var17 = this.field4145[var16];
                                    int var18 = this.field4156 == null ? var17.field30 : this.field4156[var16];
                                    if (field4157 == 256) {
                                        var17.method8(arg1 + var14, this.field4143 + var6 - var18 + var15);
                                    } else {
                                        var17.method7(arg1 + var14, this.field4143 + var6 - var18 + var15, field4157);
                                    }
                                    arg1 += var17.field31;
                                    var8 = '\u0000';
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method1900(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var20 = (char) (class65.method441(var12, -32024) & 0xFF);
                    if (this.field4144 != null && var8 != '\u0000') {
                        arg1 += this.field4144[(var8 << 8) + var20];
                    }
                    int var21 = this.field4148[var20];
                    int var22 = this.field4150[var20];
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
                        if (field4163 > 0) {
                            field4154 += field4163;
                            arg1 += field4154 >> 8;
                            field4154 &= 0xFF;
                        }
                    } else if (field4157 == 256) {
                        if (field4165 != -1) {
                            this.method47(var20, this.field4146[var20] + arg1 + var23 + 1, this.field4158[var20] + var6 + 1 + var24, var21, var22, field4165, true);
                        }
                        this.method47(var20, this.field4146[var20] + arg1 + var23, this.field4158[var20] + var6 + var24, var21, var22, field4160, false);
                    } else {
                        if (field4165 != -1) {
                            this.method48(var20, this.field4146[var20] + arg1 + var23 + 1, this.field4158[var20] + var6 + 1 + var24, var21, var22, field4165, field4157, true);
                        }
                        this.method48(var20, this.field4146[var20] + arg1 + var23, this.field4158[var20] + var6 + var24, var21, var22, field4160, field4157, false);
                    }
                    int var25 = this.field4147[var20];
                    if (field4164 != -1) {
                        if (class67.field908) {
                            class102.method754(arg1, (int) ((double) this.field4143 * 0.7D) + var6, var25, field4164);
                        } else {
                            class38.method213(arg1, (int) ((double) this.field4143 * 0.7D) + var6, var25, field4164);
                        }
                    }
                    if (field4161 != -1) {
                        if (class67.field908) {
                            class102.method754(arg1, this.field4143 + var6, var25, field4161);
                        } else {
                            class38.method213(arg1, this.field4143 + var6, var25, field4161);
                        }
                    }
                    arg1 += var25;
                    var8 = var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 582)
    public final void method1909(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1910(arg3, arg4);
            this.method1920(arg0, arg1 - this.method1904(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V", line = 591)
    private final void method1910(int arg0, int arg1) {
        field4164 = -1;
        field4161 = -1;
        field4155 = arg1;
        field4165 = arg1;
        field4159 = arg0;
        field4160 = arg0;
        field4162 = 256;
        field4157 = 256;
        field4163 = 0;
        field4154 = 0;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(Ljava/lang/String;IIII)V", line = 600)
    public final void method1911(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1910(arg3, arg4);
            this.method1920(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 609)
    private final void method1912(String arg0, int arg1) {
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
            field4163 = (arg1 - this.method1904(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 641)
    public final void method1913(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method1910(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method1908(arg0, arg1 - this.method1904(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V", line = 664)
    private final void method1914(int arg0, int arg1, int arg2) {
        field4164 = -1;
        field4161 = -1;
        field4155 = arg1;
        field4165 = arg1;
        field4159 = arg0;
        field4160 = arg0;
        field4162 = arg2;
        field4157 = arg2;
        field4163 = 0;
        field4154 = 0;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "([B[I[I[I[I)V", line = 1337)
    public class277(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field4146 = arg1;
        this.field4158 = arg2;
        this.field4148 = arg3;
        this.field4150 = arg4;
        this.method1901(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field4158[var8] < var6 && this.field4150[var8] != 0) {
                var6 = this.field4158[var8];
            }
            if (this.field4158[var8] + this.field4150[var8] > var7) {
                var7 = this.field4158[var8] + this.field4150[var8];
            }
        }
        this.field4151 = this.field4143 - var6;
        this.field4149 = var7 - this.field4143;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "([B)V", line = 1368)
    public class277(byte[] arg0) {
        this.method1901(arg0);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I", line = 677)
    public final int method1915(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method1914(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method1908(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I", line = 705)
    public final int method1916(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method1914(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field4151 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field4151 - this.field4149) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field4149;
        }
        if (arg7 == 1) {
            var19 = this.method1904(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method1904(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method1908(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method1904(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field4151;
            arg11[2] = var19;
            arg11[3] = this.field4151 + this.field4149;
        }
        return var15;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 771)
    private static final int method1917(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I", line = 821)
    public final int method1918(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method1914(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field4143;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field4151 + this.field4149 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method1924(arg0, var12, field4153);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field4151 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field4151 - this.field4149 - (var13 - 1) * arg10) / 2 + this.field4151 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field4149 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field4151 - this.field4149 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field4151 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method1920(field4153[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method1920(field4153[var16], arg1 + (arg3 - this.method1904(field4153[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method1920(field4153[var16], arg1 + arg3 - this.method1904(field4153[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method1920(field4153[var16], arg1, var14);
            } else {
                this.method1912(field4153[var16], arg3);
                this.method1920(field4153[var16], arg1, var14);
                field4163 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 896)
    public final int method1919(String arg0, int arg1) {
        int var3 = this.method1924(arg0, new int[] { arg1 }, field4153);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1904(field4153[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 916)
    private final void method1920(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4143;
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
                                    int var11 = class190.method1332(var10.substring(4), (byte) -127);
                                    class4 var12 = this.field4145[var11];
                                    int var13 = this.field4156 == null ? var12.field30 : this.field4156[var11];
                                    if (field4157 == 256) {
                                        var12.method8(arg1, this.field4143 + var4 - var13);
                                    } else {
                                        var12.method7(arg1, this.field4143 + var4 - var13, field4157);
                                    }
                                    arg1 += var12.field31;
                                    var6 = '\u0000';
                                } catch (Exception var19) {
                                }
                            } else {
                                this.method1900(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var15 = (char) (class65.method441(var9, -32024) & 0xFF);
                    if (this.field4144 != null && var6 != '\u0000') {
                        arg1 += this.field4144[(var6 << 8) + var15];
                    }
                    int var16 = this.field4148[var15];
                    int var17 = this.field4150[var15];
                    if (var15 == ' ') {
                        if (field4163 > 0) {
                            field4154 += field4163;
                            arg1 += field4154 >> 8;
                            field4154 &= 0xFF;
                        }
                    } else if (field4157 == 256) {
                        if (field4165 != -1) {
                            this.method47(var15, this.field4146[var15] + arg1 + 1, this.field4158[var15] + var4 + 1, var16, var17, field4165, true);
                        }
                        this.method47(var15, this.field4146[var15] + arg1, this.field4158[var15] + var4, var16, var17, field4160, false);
                    } else {
                        if (field4165 != -1) {
                            this.method48(var15, this.field4146[var15] + arg1 + 1, this.field4158[var15] + var4 + 1, var16, var17, field4165, field4157, true);
                        }
                        this.method48(var15, this.field4146[var15] + arg1, this.field4158[var15] + var4, var16, var17, field4160, field4157, false);
                    }
                    int var18 = this.field4147[var15];
                    if (field4164 != -1) {
                        if (class67.field908) {
                            class102.method754(arg1, (int) ((double) this.field4143 * 0.7D) + var4, var18, field4164);
                        } else {
                            class38.method213(arg1, (int) ((double) this.field4143 * 0.7D) + var4, var18, field4164);
                        }
                    }
                    if (field4161 != -1) {
                        if (class67.field908) {
                            class102.method754(arg1, this.field4143 + var4 + 1, var18, field4161);
                        } else {
                            class38.method213(arg1, this.field4143 + var4 + 1, var18, field4161);
                        }
                    }
                    arg1 += var18;
                    var6 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(C)I", line = 1073)
    private final int method1921(char arg0) {
        return this.field4147[class65.method441(arg0, -32024) & 0xFF];
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(Ljava/lang/String;I)I", line = 1077)
    public final int method1922(String arg0, int arg1) {
        return this.method1924(arg0, new int[] { arg1 }, field4153);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()V", line = 1080)
    public static void method1923() {
        field4152 = null;
        field4153 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I", line = 1104)
    public final int method1924(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class161.method1157(' ', false, 0, field4152);
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
                    field4152.append('<');
                    field4152.append(var15);
                    field4152.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field4152.toString().substring(var5, field4152.length());
                        var11++;
                        var5 = field4152.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method1921('<');
                        if (this.field4144 != null && var10 != '\u0000') {
                            var4 += this.field4144[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method1921('>');
                        if (this.field4144 != null && var10 != '\u0000') {
                            var4 += this.field4144[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method1921(' ');
                        if (this.field4144 != null && var10 != '\u0000') {
                            var4 += this.field4144[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method1921('\u00ad');
                        if (this.field4144 != null && var10 != '\u0000') {
                            var4 += this.field4144[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method1921('×');
                        if (this.field4144 != null && var10 != '\u0000') {
                            var4 += this.field4144[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method1921('€');
                        if (this.field4144 != null && var10 != '\u0000') {
                            var4 += this.field4144[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method1921('©');
                        if (this.field4144 != null && var10 != '\u0000') {
                            var4 += this.field4144[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method1921('®');
                        if (this.field4144 != null && var10 != '\u0000') {
                            var4 += this.field4144[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class190.method1332(var15.substring(4), (byte) 21);
                            var4 += this.field4145[var16].field31;
                            var10 = '\u0000';
                        } catch (Exception var18) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field4152.append(var14);
                        var14 = (char) (class65.method441(var14, -32024) & 0xFF);
                        var4 += this.field4147[var14];
                        if (this.field4144 != null && var10 != '\u0000') {
                            var4 += this.field4144[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field4152.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field4152.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field4152.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field4152.length() > var5) {
            arg2[var11] = field4152.toString().substring(var5, field4152.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);
}
