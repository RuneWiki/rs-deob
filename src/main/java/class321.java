import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class class321 extends class279 {

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
    public int field5060 = 0;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "[I")
    private int[] field5055;

    @OriginalMember(owner = "client!gn", name = "M", descriptor = "[I")
    private int[] field5073;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "[I")
    public int[] field5063;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "[I")
    public int[] field5057;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    private int field5058;

    @OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
    private int field5075;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field5062 = new StringBuffer(100);

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "I")
    private static int field5064 = 0;

    @OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
    private static int field5070 = -1;

    @OriginalMember(owner = "client!gn", name = "H", descriptor = "I")
    private static int field5068 = -1;

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
    private static int field5071 = 256;

    @OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
    private static int field5072 = -1;

    @OriginalMember(owner = "client!gn", name = "Q", descriptor = "I")
    private static int field5076 = -1;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "I")
    private static int field5067 = 256;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "I")
    private static int field5066 = 0;

    @OriginalMember(owner = "client!gn", name = "I", descriptor = "I")
    private static int field5069 = 0;

    @OriginalMember(owner = "client!gn", name = "N", descriptor = "[Ljava/lang/String;")
    private static String[] field5074 = new String[100];

    @OriginalMember(owner = "client!gn", name = "R", descriptor = "I")
    private static int field5077 = 0;

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "[B")
    private byte[] field5065;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "[I")
    private int[] field5056;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "[I")
    private int[] field5059;

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "[Lbh;")
    private class18[] field5061;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I", line = 4)
    public final int method2246(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method2257(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field5060;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field5075 + this.field5058 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method2251(arg0, var12, field5074);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field5058 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field5058 - this.field5075 - (var13 - 1) * arg10) / 2 + this.field5058 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field5075 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field5058 - this.field5075 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field5058 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method2261(field5074[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method2261(field5074[var16], arg1 + (arg3 - this.method2254(field5074[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method2261(field5074[var16], arg1 + arg3 - this.method2254(field5074[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method2261(field5074[var16], arg1, var14);
            } else {
                this.method2253(field5074[var16], arg3);
                this.method2261(field5074[var16], arg1, var14);
                field5077 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([Lbh;[I)V", line = 79)
    public final void method2247(class18[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field5061 = arg0;
        this.field5056 = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 90)
    public final void method2248(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method2250(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method2271(arg0, arg1 - this.method2254(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 114)
    public final int method2249(String arg0, int arg1) {
        return this.method2251(arg0, new int[] { arg1 }, field5074);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V", line = 117)
    private final void method2250(int arg0, int arg1) {
        field5072 = -1;
        field5070 = -1;
        field5068 = arg1;
        field5076 = arg1;
        field5069 = arg0;
        field5064 = arg0;
        field5067 = 256;
        field5071 = 256;
        field5077 = 0;
        field5066 = 0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I", line = 126)
    public final int method2251(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class16.method147(0, -12, field5062, ' ');
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
                    field5062.append('<');
                    field5062.append(var15);
                    field5062.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field5062.toString().substring(var5, field5062.length());
                        var11++;
                        var5 = field5062.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method2266('<');
                        if (this.field5065 != null && var10 != '\u0000') {
                            var4 += this.field5065[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method2266('>');
                        if (this.field5065 != null && var10 != '\u0000') {
                            var4 += this.field5065[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method2266(' ');
                        if (this.field5065 != null && var10 != '\u0000') {
                            var4 += this.field5065[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method2266('\u00ad');
                        if (this.field5065 != null && var10 != '\u0000') {
                            var4 += this.field5065[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method2266('×');
                        if (this.field5065 != null && var10 != '\u0000') {
                            var4 += this.field5065[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method2266('€');
                        if (this.field5065 != null && var10 != '\u0000') {
                            var4 += this.field5065[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method2266('©');
                        if (this.field5065 != null && var10 != '\u0000') {
                            var4 += this.field5065[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method2266('®');
                        if (this.field5065 != null && var10 != '\u0000') {
                            var4 += this.field5065[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class192.method1420(var15.substring(4), 10);
                            var4 += this.field5061[var16].field284;
                            var10 = '\u0000';
                        } catch (Exception var18) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field5062.append(var14);
                        var14 = (char) (class58.method473(19064, var14) & 0xFF);
                        var4 += this.field5059[var14];
                        if (this.field5065 != null && var10 != '\u0000') {
                            var4 += this.field5065[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field5062.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field5062.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field5062.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field5062.length() > var5) {
            arg2[var11] = field5062.toString().substring(var5, field5062.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 327)
    public final void method2252(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2250(arg3, arg4);
            this.method2261(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(Ljava/lang/String;I)V", line = 336)
    private final void method2253(String arg0, int arg1) {
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
            field5077 = (arg1 - this.method2254(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;)I", line = 369)
    public final int method2254(String arg0) {
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
                                    int var9 = class192.method1420(var8.substring(4), 10);
                                    var4 += this.field5061[var9].field284;
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
                    char var11 = (char) (class58.method473(19064, var7) & 0xFF);
                    var4 += this.field5059[var11];
                    if (this.field5065 != null && var3 != '\u0000') {
                        var4 += this.field5065[(var3 << 8) + var11];
                    }
                    var3 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 465)
    public static final String method2255(String arg0) {
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

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 508)
    private static final int method2256(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(III)V", line = 554)
    private final void method2257(int arg0, int arg1, int arg2) {
        field5072 = -1;
        field5070 = -1;
        field5068 = arg1;
        field5076 = arg1;
        field5069 = arg0;
        field5064 = arg0;
        field5067 = arg2;
        field5071 = arg2;
        field5077 = 0;
        field5066 = 0;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 565)
    public final void method2258(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2250(arg3, arg4);
            this.method2261(arg0, arg1 - this.method2254(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(Ljava/lang/String;)V", line = 573)
    private final void method2259(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field5064 = class241.method1718(arg0.substring(4), 16, (byte) 100);
            } else if (arg0.equals("/col")) {
                field5064 = field5069;
            } else if (arg0.startsWith("trans=")) {
                field5071 = class192.method1420(arg0.substring(6), 10);
            } else if (arg0.equals("/trans")) {
                field5071 = field5067;
            } else if (arg0.startsWith("str=")) {
                field5072 = class241.method1718(arg0.substring(4), 16, (byte) 94);
            } else if (arg0.equals("str")) {
                field5072 = 8388608;
            } else if (arg0.equals("/str")) {
                field5072 = -1;
            } else if (arg0.startsWith("u=")) {
                field5070 = class241.method1718(arg0.substring(2), 16, (byte) 97);
            } else if (arg0.equals("u")) {
                field5070 = 0;
            } else if (arg0.equals("/u")) {
                field5070 = -1;
            } else if (arg0.startsWith("shad=")) {
                field5076 = class241.method1718(arg0.substring(5), 16, (byte) 90);
            } else if (arg0.equals("shad")) {
                field5076 = 0;
            } else if (arg0.equals("/shad")) {
                field5076 = field5068;
            } else if (arg0.equals("br")) {
                this.method2257(field5069, field5068, field5067);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "()V", line = 639)
    public static void method2260() {
        field5062 = null;
        field5074 = null;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "([B[I[I[I[I)V", line = 1143)
    public class321(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field5055 = arg1;
        this.field5073 = arg2;
        this.field5063 = arg3;
        this.field5057 = arg4;
        this.method2262(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field5073[var8] < var6 && this.field5057[var8] != 0) {
                var6 = this.field5073[var8];
            }
            if (this.field5073[var8] + this.field5057[var8] > var7) {
                var7 = this.field5073[var8] + this.field5057[var8];
            }
        }
        this.field5058 = this.field5060 - var6;
        this.field5075 = var7 - this.field5060;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "([B)V", line = 1360)
    public class321(byte[] arg0) {
        this.method2262(arg0);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 652)
    private final void method2261(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field5060;
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
                                    int var11 = class192.method1420(var10.substring(4), 10);
                                    class18 var12 = this.field5061[var11];
                                    int var13 = this.field5056 == null ? var12.field289 : this.field5056[var11];
                                    if (field5071 == 256) {
                                        var12.method198(arg1, this.field5060 + var4 - var13);
                                    } else {
                                        var12.method195(arg1, this.field5060 + var4 - var13, field5071);
                                    }
                                    arg1 += var12.field284;
                                    var6 = '\u0000';
                                } catch (Exception var19) {
                                }
                            } else {
                                this.method2259(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var15 = (char) (class58.method473(19064, var9) & 0xFF);
                    if (this.field5065 != null && var6 != '\u0000') {
                        arg1 += this.field5065[(var6 << 8) + var15];
                    }
                    int var16 = this.field5063[var15];
                    int var17 = this.field5057[var15];
                    if (var15 == ' ') {
                        if (field5077 > 0) {
                            field5066 += field5077;
                            arg1 += field5066 >> 8;
                            field5066 &= 0xFF;
                        }
                    } else if (field5071 == 256) {
                        if (field5076 != -1) {
                            this.method372(var15, this.field5055[var15] + arg1 + 1, this.field5073[var15] + var4 + 1, var16, var17, field5076, true);
                        }
                        this.method372(var15, this.field5055[var15] + arg1, this.field5073[var15] + var4, var16, var17, field5064, false);
                    } else {
                        if (field5076 != -1) {
                            this.method370(var15, this.field5055[var15] + arg1 + 1, this.field5073[var15] + var4 + 1, var16, var17, field5076, field5071, true);
                        }
                        this.method370(var15, this.field5055[var15] + arg1, this.field5073[var15] + var4, var16, var17, field5064, field5071, false);
                    }
                    int var18 = this.field5059[var15];
                    if (field5072 != -1) {
                        if (class109.field1458) {
                            class122.method882(arg1, (int) ((double) this.field5060 * 0.7D) + var4, var18, field5072);
                        } else {
                            class280.method1975(arg1, (int) ((double) this.field5060 * 0.7D) + var4, var18, field5072);
                        }
                    }
                    if (field5070 != -1) {
                        if (class109.field1458) {
                            class122.method882(arg1, this.field5060 + var4 + 1, var18, field5070);
                        } else {
                            class280.method1975(arg1, this.field5060 + var4 + 1, var18, field5070);
                        }
                    }
                    arg1 += var18;
                    var6 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([B)V", line = 807)
    private final void method2262(byte[] arg0) {
        this.field5059 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field5059.length; var2++) {
                this.field5059[var2] = arg0[var2] & 0xFF;
            }
            this.field5060 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field5059[var4] = arg0[var3++] & 0xFF;
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
        this.field5065 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field5065[(var17 << 8) + var18] = (byte) method2256(var9, var13, var6, this.field5059, var5, var17, var18);
                    }
                }
            }
        }
        this.field5060 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(Ljava/lang/String;IIII)V", line = 930)
    public final void method2263(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2250(arg3, arg4);
            this.method2261(arg0, arg1 - this.method2254(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 946)
    public final void method2264(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method2250(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method2271(arg0, arg1 - this.method2254(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I", line = 969)
    public final int method2265(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method2246(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(C)I", line = 973)
    private final int method2266(char arg0) {
        return this.field5059[class58.method473(19064, arg0) & 0xFF];
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I", line = 977)
    public final int method2267(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method2257(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field5058 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field5058 - this.field5075) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field5075;
        }
        if (arg7 == 1) {
            var19 = this.method2254(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method2254(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method2271(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method2254(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field5058;
            arg11[2] = var19;
            arg11[3] = this.field5075 + this.field5058;
        }
        return var15;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I", line = 1043)
    public final int method2268(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method2257(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method2271(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 1072)
    public final void method2269(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method2250(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method2271(arg0, arg1 - this.method2254(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(Ljava/lang/String;I)I", line = 1115)
    public final int method2270(String arg0, int arg1) {
        int var3 = this.method2251(arg0, new int[] { arg1 }, field5074);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method2254(field5074[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V", line = 1175)
    private final void method2271(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field5060;
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
                                    int var16 = class192.method1420(var13.substring(4), 10);
                                    class18 var17 = this.field5061[var16];
                                    int var18 = this.field5056 == null ? var17.field289 : this.field5056[var16];
                                    if (field5071 == 256) {
                                        var17.method198(arg1 + var14, this.field5060 + var6 - var18 + var15);
                                    } else {
                                        var17.method195(arg1 + var14, this.field5060 + var6 - var18 + var15, field5071);
                                    }
                                    arg1 += var17.field284;
                                    var8 = '\u0000';
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method2259(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var20 = (char) (class58.method473(19064, var12) & 0xFF);
                    if (this.field5065 != null && var8 != '\u0000') {
                        arg1 += this.field5065[(var8 << 8) + var20];
                    }
                    int var21 = this.field5063[var20];
                    int var22 = this.field5057[var20];
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
                        if (field5077 > 0) {
                            field5066 += field5077;
                            arg1 += field5066 >> 8;
                            field5066 &= 0xFF;
                        }
                    } else if (field5071 == 256) {
                        if (field5076 != -1) {
                            this.method372(var20, this.field5055[var20] + arg1 + var23 + 1, this.field5073[var20] + var6 + 1 + var24, var21, var22, field5076, true);
                        }
                        this.method372(var20, this.field5055[var20] + arg1 + var23, this.field5073[var20] + var6 + var24, var21, var22, field5064, false);
                    } else {
                        if (field5076 != -1) {
                            this.method370(var20, this.field5055[var20] + arg1 + var23 + 1, this.field5073[var20] + var6 + 1 + var24, var21, var22, field5076, field5071, true);
                        }
                        this.method370(var20, this.field5055[var20] + arg1 + var23, this.field5073[var20] + var6 + var24, var21, var22, field5064, field5071, false);
                    }
                    int var25 = this.field5059[var20];
                    if (field5072 != -1) {
                        if (class109.field1458) {
                            class122.method882(arg1, (int) ((double) this.field5060 * 0.7D) + var6, var25, field5072);
                        } else {
                            class280.method1975(arg1, (int) ((double) this.field5060 * 0.7D) + var6, var25, field5072);
                        }
                    }
                    if (field5070 != -1) {
                        if (class109.field1458) {
                            class122.method882(arg1, this.field5060 + var6, var25, field5070);
                        } else {
                            class280.method1975(arg1, this.field5060 + var6, var25, field5070);
                        }
                    }
                    arg1 += var25;
                    var8 = var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);
}
