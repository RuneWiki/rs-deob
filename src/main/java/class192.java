import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class192 extends class259 {

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public int field2906 = 0;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "[I")
    private int[] field2904;

    @OriginalMember(owner = "client!wi", name = "gb", descriptor = "[I")
    private int[] field2922;

    @OriginalMember(owner = "client!wi", name = "hb", descriptor = "[I")
    private int[] field2923;

    @OriginalMember(owner = "client!wi", name = "bb", descriptor = "[I")
    private int[] field2917;

    @OriginalMember(owner = "client!wi", name = "db", descriptor = "I")
    private int field2919;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    private int field2907;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field2905 = new StringBuffer(100);

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    private static int field2910 = 0;

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "I")
    private static int field2913 = 0;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
    private static int field2911 = 256;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "[Ljava/lang/String;")
    private static String[] field2908 = new String[100];

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "I")
    private static int field2914 = 0;

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "I")
    private static int field2915 = -1;

    @OriginalMember(owner = "client!wi", name = "fb", descriptor = "I")
    private static int field2921 = -1;

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
    private static int field2916 = 256;

    @OriginalMember(owner = "client!wi", name = "cb", descriptor = "I")
    private static int field2918 = 0;

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    private static int field2912 = -1;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    private static int field2909 = -1;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "[B")
    private byte[] field2903;

    @OriginalMember(owner = "client!wi", name = "eb", descriptor = "[I")
    private int[] field2920;

    @OriginalMember(owner = "client!wi", name = "ib", descriptor = "[I")
    private int[] field2924;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "[Ljd;")
    private class227[] field2902;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()V")
    public static void method1280() {
        field2905 = null;
        field2908 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I")
    public final int method1281(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method1299(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field2919 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field2919 - this.field2907) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field2907;
        }
        if (arg7 == 1) {
            var19 = this.method1293(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method1293(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method1302(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method1293(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field2919;
            arg11[2] = var19;
            arg11[3] = this.field2919 + this.field2907;
        }
        return var15;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I")
    public final int method1282(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method1299(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method1302(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;II)V")
    private final void method1283(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2906;
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
                                    int var11 = class213.method1439(var10.substring(4), 10);
                                    class227 var12 = this.field2902[var11];
                                    int var13 = this.field2920 == null ? var12.field3537 : this.field2920[var11];
                                    if (field2916 == 256) {
                                        var12.method368(arg1, this.field2906 + var4 - var13);
                                    } else {
                                        var12.method363(arg1, this.field2906 + var4 - var13, field2916);
                                    }
                                    arg1 += var12.field3549;
                                    var6 = '\u0000';
                                } catch (Exception var18) {
                                }
                            } else {
                                this.method1287(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var14 = (char) (class97.method729(true, var9) & 0xFF);
                    if (this.field2903 != null && var6 != '\u0000') {
                        arg1 += this.field2903[(var6 << 8) + var14];
                    }
                    int var15 = this.field2923[var14];
                    int var16 = this.field2917[var14];
                    if (var14 == ' ') {
                        if (field2918 > 0) {
                            field2913 += field2918;
                            arg1 += field2913 >> 8;
                            field2913 &= 0xFF;
                        }
                    } else if (field2916 == 256) {
                        if (field2921 != -1) {
                            this.method392(var14, this.field2904[var14] + arg1 + 1, this.field2922[var14] + var4 + 1, var15, var16, field2921, true);
                        }
                        this.method392(var14, this.field2904[var14] + arg1, this.field2922[var14] + var4, var15, var16, field2910, false);
                    } else {
                        if (field2921 != -1) {
                            this.method391(var14, this.field2904[var14] + arg1 + 1, this.field2922[var14] + var4 + 1, var15, var16, field2921, field2916, true);
                        }
                        this.method391(var14, this.field2904[var14] + arg1, this.field2922[var14] + var4, var15, var16, field2910, field2916, false);
                    }
                    int var17 = this.field2924[var14];
                    if (field2915 != -1) {
                        class72.method572(arg1, (int) ((double) this.field2906 * 0.7D) + var4, var17, field2915);
                    }
                    if (field2909 != -1) {
                        class72.method572(arg1, this.field2906 + var4 + 1, var17, field2909);
                    }
                    arg1 += var17;
                    var6 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method1284(String arg0, int arg1) {
        return this.method1301(arg0, new int[] { arg1 }, field2908);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([B)V")
    private final void method1285(byte[] arg0) {
        this.field2924 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2924.length; var2++) {
                this.field2924[var2] = arg0[var2] & 0xFF;
            }
            this.field2906 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2924[var4] = arg0[var3++] & 0xFF;
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
        this.field2903 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field2903[(var13 << 8) + var14] = (byte) method1295(var9, var11, var6, this.field2924, var5, var13, var14);
                    }
                }
            }
        }
        this.field2906 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I")
    public final int method1286(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method1289(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method1287(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field2910 = class190.method1270((byte) -90, arg0.substring(4), 16);
                return;
            }
            if (arg0.equals("/col")) {
                field2910 = field2914;
                return;
            }
            if (arg0.startsWith("trans=")) {
                field2916 = class213.method1439(arg0.substring(6), 10);
                return;
            }
            if (arg0.equals("/trans")) {
                field2916 = field2911;
                return;
            }
            if (arg0.startsWith("str=")) {
                field2915 = class190.method1270((byte) -123, arg0.substring(4), 16);
                return;
            }
            if (arg0.equals("str")) {
                field2915 = 8388608;
                return;
            }
            if (arg0.equals("/str")) {
                field2915 = -1;
                return;
            }
            if (arg0.startsWith("u=")) {
                field2909 = class190.method1270((byte) -88, arg0.substring(2), 16);
                return;
            }
            if (arg0.equals("u")) {
                field2909 = 0;
                return;
            }
            if (arg0.equals("/u")) {
                field2909 = -1;
                return;
            }
            if (arg0.startsWith("shad=")) {
                field2921 = class190.method1270((byte) -121, arg0.substring(5), 16);
                return;
            }
            if (arg0.equals("shad")) {
                field2921 = 0;
                return;
            }
            if (arg0.equals("/shad")) {
                field2921 = field2912;
                return;
            }
            if (arg0.equals("br")) {
                this.method1299(field2914, field2912, field2911);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(II)V")
    private final void method1288(int arg0, int arg1) {
        field2915 = -1;
        field2909 = -1;
        field2912 = arg1;
        field2921 = arg1;
        field2914 = arg0;
        field2910 = arg0;
        field2911 = 256;
        field2916 = 256;
        field2918 = 0;
        field2913 = 0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
    public final int method1289(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method1299(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field2906;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field2919 + this.field2907 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method1301(arg0, var12, field2908);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field2919 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field2919 - this.field2907 - (var13 - 1) * arg10) / 2 + this.field2919 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field2907 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field2919 - this.field2907 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field2919 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method1283(field2908[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method1283(field2908[var16], arg1 + (arg3 - this.method1293(field2908[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method1283(field2908[var16], arg1 + arg3 - this.method1293(field2908[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method1283(field2908[var16], arg1, var14);
            } else {
                this.method1298(field2908[var16], arg3);
                this.method1283(field2908[var16], arg1, var14);
                field2918 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public final int method1290(String arg0, int arg1) {
        int var3 = this.method1301(arg0, new int[] { arg1 }, field2908);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1293(field2908[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public final void method1291(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1288(arg3, arg4);
            this.method1283(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
    public final void method1292(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1288(arg3, arg4);
            this.method1283(arg0, arg1 - this.method1293(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Ljava/lang/String;)I")
    public final int method1293(String arg0) {
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
                                    int var9 = class213.method1439(var8.substring(4), 10);
                                    var4 += this.field2902[var9].field3549;
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
                    char var10 = (char) (class97.method729(true, var7) & 0xFF);
                    var4 += this.field2924[var10];
                    if (this.field2903 != null && var3 != '\u0000') {
                        var4 += this.field2903[(var3 << 8) + var10];
                    }
                    var3 = var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method1294(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method1288(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) var12 / 1.5D + (double) arg5) * var8);
        }
        this.method1302(arg0, arg1 - this.method1293(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method1295(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method1296(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1288(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method1302(arg0, arg1 - this.method1293(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1297(String arg0) {
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

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(Ljava/lang/String;I)V")
    private final void method1298(String arg0, int arg1) {
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
            field2918 = (arg1 - this.method1293(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)V")
    private final void method1299(int arg0, int arg1, int arg2) {
        field2915 = -1;
        field2909 = -1;
        field2912 = arg1;
        field2921 = arg1;
        field2914 = arg0;
        field2910 = arg0;
        field2911 = arg2;
        field2916 = arg2;
        field2918 = 0;
        field2913 = 0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([Ljd;[I)V")
    public final void method1300(class227[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field2902 = arg0;
        this.field2920 = arg1;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public final int method1301(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class1.method5(' ', 16359, 0, field2905);
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
                    field2905.append('<');
                    field2905.append(var15);
                    field2905.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field2905.toString().substring(var5, field2905.length());
                        var11++;
                        var5 = field2905.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method1305('<');
                        if (this.field2903 != null && var10 != '\u0000') {
                            var4 += this.field2903[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method1305('>');
                        if (this.field2903 != null && var10 != '\u0000') {
                            var4 += this.field2903[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method1305(' ');
                        if (this.field2903 != null && var10 != '\u0000') {
                            var4 += this.field2903[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method1305('\u00ad');
                        if (this.field2903 != null && var10 != '\u0000') {
                            var4 += this.field2903[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method1305('×');
                        if (this.field2903 != null && var10 != '\u0000') {
                            var4 += this.field2903[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method1305('€');
                        if (this.field2903 != null && var10 != '\u0000') {
                            var4 += this.field2903[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method1305('©');
                        if (this.field2903 != null && var10 != '\u0000') {
                            var4 += this.field2903[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method1305('®');
                        if (this.field2903 != null && var10 != '\u0000') {
                            var4 += this.field2903[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class213.method1439(var15.substring(4), 10);
                            var4 += this.field2902[var16].field3549;
                            var10 = '\u0000';
                        } catch (Exception var17) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field2905.append(var14);
                        var14 = (char) (class97.method729(true, var14) & 0xFF);
                        var4 += this.field2924[var14];
                        if (this.field2903 != null && var10 != '\u0000') {
                            var4 += this.field2903[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field2905.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field2905.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field2905.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field2905.length() > var5) {
            arg2[var11] = field2905.toString().substring(var5, field2905.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V")
    private final void method1302(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2906;
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
                                    int var16 = class213.method1439(var13.substring(4), 10);
                                    class227 var17 = this.field2902[var16];
                                    int var18 = this.field2920 == null ? var17.field3537 : this.field2920[var16];
                                    if (field2916 == 256) {
                                        var17.method368(arg1 + var14, this.field2906 + var6 - var18 + var15);
                                    } else {
                                        var17.method363(arg1 + var14, this.field2906 + var6 - var18 + var15, field2916);
                                    }
                                    arg1 += var17.field3549;
                                    var8 = '\u0000';
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1287(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var19 = (char) (class97.method729(true, var12) & 0xFF);
                    if (this.field2903 != null && var8 != '\u0000') {
                        arg1 += this.field2903[(var8 << 8) + var19];
                    }
                    int var20 = this.field2923[var19];
                    int var21 = this.field2917[var19];
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
                        if (field2918 > 0) {
                            field2913 += field2918;
                            arg1 += field2913 >> 8;
                            field2913 &= 0xFF;
                        }
                    } else if (field2916 == 256) {
                        if (field2921 != -1) {
                            this.method392(var19, this.field2904[var19] + arg1 + var22 + 1, this.field2922[var19] + var6 + 1 + var23, var20, var21, field2921, true);
                        }
                        this.method392(var19, this.field2904[var19] + arg1 + var22, this.field2922[var19] + var6 + var23, var20, var21, field2910, false);
                    } else {
                        if (field2921 != -1) {
                            this.method391(var19, this.field2904[var19] + arg1 + var22 + 1, this.field2922[var19] + var6 + 1 + var23, var20, var21, field2921, field2916, true);
                        }
                        this.method391(var19, this.field2904[var19] + arg1 + var22, this.field2922[var19] + var6 + var23, var20, var21, field2910, field2916, false);
                    }
                    int var24 = this.field2924[var19];
                    if (field2915 != -1) {
                        class72.method572(arg1, (int) ((double) this.field2906 * 0.7D) + var6, var24, field2915);
                    }
                    if (field2909 != -1) {
                        class72.method572(arg1, this.field2906 + var6, var24, field2909);
                    }
                    arg1 += var24;
                    var8 = var19;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
    public final void method1303(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1288(arg3, arg4);
            this.method1283(arg0, arg1 - this.method1293(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method1304(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1288(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method1302(arg0, arg1 - this.method1293(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(C)I")
    private final int method1305(char arg0) {
        return this.field2924[class97.method729(true, arg0) & 0xFF];
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "([B[I[I[I[I)V")
    public class192(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field2904 = arg1;
        this.field2922 = arg2;
        this.field2923 = arg3;
        this.field2917 = arg4;
        this.method1285(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field2922[var8] < var6 && this.field2917[var8] != 0) {
                var6 = this.field2922[var8];
            }
            if (this.field2922[var8] + this.field2917[var8] > var7) {
                var7 = this.field2922[var8] + this.field2917[var8];
            }
        }
        this.field2919 = this.field2906 - var6;
        this.field2907 = var7 - this.field2906;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "([B)V")
    public class192(byte[] arg0) {
        this.method1285(arg0);
    }
}
