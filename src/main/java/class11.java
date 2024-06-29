import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class11 extends class104 {

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public int field159 = 0;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "[I")
    private int[] field147;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "[I")
    private int[] field150;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "[I")
    public int[] field146;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "[I")
    public int[] field144;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field148 = new StringBuffer(100);

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    private static int field154 = 0;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "[Ljava/lang/String;")
    private static String[] field156 = new String[100];

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    private static int field160 = 256;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    private static int field157 = -1;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    private static int field161 = 256;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    private static int field155 = 0;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    private static int field165 = -1;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    private static int field166 = 0;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    private static int field163 = 0;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    private static int field164 = -1;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    private static int field162 = -1;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "[B")
    private byte[] field158;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "[I")
    private int[] field145;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "[I")
    private int[] field152;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "[Lhi;")
    private class307[] field151;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 4)
    public static final String method57(String arg0) {
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

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 46)
    public final void method58(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method66(arg3, arg4);
            this.method74(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V", line = 53)
    private final void method59(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field159;
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
                                    int var16 = class235.method1672(var13.substring(4), 10);
                                    class307 var17 = this.field151[var16];
                                    int var18 = this.field152 == null ? var17.field4744 : this.field152[var16];
                                    if (field160 == 256) {
                                        var17.method1657(arg1 + var14, this.field159 + var6 - var18 + var15);
                                    } else {
                                        var17.method1653(arg1 + var14, this.field159 + var6 - var18 + var15, field160);
                                    }
                                    arg1 += var17.field4741;
                                    var8 = '\u0000';
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method73(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var20 = (char) (class139.method924((byte) 10, var12) & 0xFF);
                    if (this.field158 != null && var8 != '\u0000') {
                        arg1 += this.field158[(var8 << 8) + var20];
                    }
                    int var21 = this.field146[var20];
                    int var22 = this.field144[var20];
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
                        if (field154 > 0) {
                            field155 += field154;
                            arg1 += field155 >> 8;
                            field155 &= 0xFF;
                        }
                    } else if (field160 == 256) {
                        if (field162 != -1) {
                            this.method68(var20, this.field147[var20] + arg1 + var23 + 1, this.field150[var20] + var6 + 1 + var24, var21, var22, field162, true);
                        }
                        this.method68(var20, this.field147[var20] + arg1 + var23, this.field150[var20] + var6 + var24, var21, var22, field166, false);
                    } else {
                        if (field162 != -1) {
                            this.method60(var20, this.field147[var20] + arg1 + var23 + 1, this.field150[var20] + var6 + 1 + var24, var21, var22, field162, field160, true);
                        }
                        this.method60(var20, this.field147[var20] + arg1 + var23, this.field150[var20] + var6 + var24, var21, var22, field166, field160, false);
                    }
                    int var25 = this.field145[var20];
                    if (field157 != -1) {
                        if (class250.field3787) {
                            class306.method2146(arg1, (int) ((double) this.field159 * 0.7D) + var6, var25, field157);
                        } else {
                            class144.method965(arg1, (int) ((double) this.field159 * 0.7D) + var6, var25, field157);
                        }
                    }
                    if (field165 != -1) {
                        if (class250.field3787) {
                            class306.method2146(arg1, this.field159 + var6, var25, field165);
                        } else {
                            class144.method965(arg1, this.field159 + var6, var25, field165);
                        }
                    }
                    arg1 += var25;
                    var8 = var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([B)V", line = 242)
    private final void method61(byte[] arg0) {
        this.field145 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field145.length; var2++) {
                this.field145[var2] = arg0[var2] & 0xFF;
            }
            this.field159 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field145[var4] = arg0[var3++] & 0xFF;
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
        this.field158 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field158[(var17 << 8) + var18] = (byte) method78(var9, var13, var6, this.field145, var5, var17, var18);
                    }
                }
            }
        }
        this.field159 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V", line = 361)
    private final void method62(int arg0, int arg1, int arg2) {
        field157 = -1;
        field165 = -1;
        field164 = arg1;
        field162 = arg1;
        field163 = arg0;
        field166 = arg0;
        field161 = arg2;
        field160 = arg2;
        field154 = 0;
        field155 = 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 372)
    public final int method63(String arg0, int arg1) {
        int var3 = this.method75(arg0, new int[] { arg1 }, field156);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method80(field156[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 393)
    public final void method64(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method66(arg3, arg4);
            this.method74(arg0, arg1 - this.method80(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 400)
    public final void method65(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method66(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method59(arg0, arg1 - this.method80(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V", line = 420)
    private final void method66(int arg0, int arg1) {
        field157 = -1;
        field165 = -1;
        field164 = arg1;
        field162 = arg1;
        field163 = arg0;
        field166 = arg0;
        field161 = 256;
        field160 = 256;
        field154 = 0;
        field155 = 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I", line = 429)
    public final int method67(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method62(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method59(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 457)
    public final void method69(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method66(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method59(arg0, arg1 - this.method80(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 480)
    public final int method70(String arg0, int arg1) {
        return this.method75(arg0, new int[] { arg1 }, field156);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(Ljava/lang/String;IIII)V", line = 485)
    public final void method71(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method66(arg3, arg4);
            this.method74(arg0, arg1 - this.method80(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I", line = 497)
    public final int method72(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method62(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field153 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field153 - this.field149) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field149;
        }
        if (arg7 == 1) {
            var19 = this.method80(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method80(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method59(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method80(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field153;
            arg11[2] = var19;
            arg11[3] = this.field153 + this.field149;
        }
        return var15;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Ljava/lang/String;)V", line = 562)
    private final void method73(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field166 = class106.method613((byte) 78, arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field166 = field163;
            } else if (arg0.startsWith("trans=")) {
                field160 = class235.method1672(arg0.substring(6), 10);
            } else if (arg0.equals("/trans")) {
                field160 = field161;
            } else if (arg0.startsWith("str=")) {
                field157 = class106.method613((byte) 78, arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field157 = 8388608;
            } else if (arg0.equals("/str")) {
                field157 = -1;
            } else if (arg0.startsWith("u=")) {
                field165 = class106.method613((byte) 78, arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field165 = 0;
            } else if (arg0.equals("/u")) {
                field165 = -1;
            } else if (arg0.startsWith("shad=")) {
                field162 = class106.method613((byte) 78, arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field162 = 0;
            } else if (arg0.equals("/shad")) {
                field162 = field164;
            } else if (arg0.equals("br")) {
                this.method62(field163, field164, field161);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 625)
    private final void method74(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field159;
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
                                    int var11 = class235.method1672(var10.substring(4), 10);
                                    class307 var12 = this.field151[var11];
                                    int var13 = this.field152 == null ? var12.field4744 : this.field152[var11];
                                    if (field160 == 256) {
                                        var12.method1657(arg1, this.field159 + var4 - var13);
                                    } else {
                                        var12.method1653(arg1, this.field159 + var4 - var13, field160);
                                    }
                                    arg1 += var12.field4741;
                                    var6 = '\u0000';
                                } catch (Exception var19) {
                                }
                            } else {
                                this.method73(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var15 = (char) (class139.method924((byte) 71, var9) & 0xFF);
                    if (this.field158 != null && var6 != '\u0000') {
                        arg1 += this.field158[(var6 << 8) + var15];
                    }
                    int var16 = this.field146[var15];
                    int var17 = this.field144[var15];
                    if (var15 == ' ') {
                        if (field154 > 0) {
                            field155 += field154;
                            arg1 += field155 >> 8;
                            field155 &= 0xFF;
                        }
                    } else if (field160 == 256) {
                        if (field162 != -1) {
                            this.method68(var15, this.field147[var15] + arg1 + 1, this.field150[var15] + var4 + 1, var16, var17, field162, true);
                        }
                        this.method68(var15, this.field147[var15] + arg1, this.field150[var15] + var4, var16, var17, field166, false);
                    } else {
                        if (field162 != -1) {
                            this.method60(var15, this.field147[var15] + arg1 + 1, this.field150[var15] + var4 + 1, var16, var17, field162, field160, true);
                        }
                        this.method60(var15, this.field147[var15] + arg1, this.field150[var15] + var4, var16, var17, field166, field160, false);
                    }
                    int var18 = this.field145[var15];
                    if (field157 != -1) {
                        if (class250.field3787) {
                            class306.method2146(arg1, (int) ((double) this.field159 * 0.7D) + var4, var18, field157);
                        } else {
                            class144.method965(arg1, (int) ((double) this.field159 * 0.7D) + var4, var18, field157);
                        }
                    }
                    if (field165 != -1) {
                        if (class250.field3787) {
                            class306.method2146(arg1, this.field159 + var4 + 1, var18, field165);
                        } else {
                            class144.method965(arg1, this.field159 + var4 + 1, var18, field165);
                        }
                    }
                    arg1 += var18;
                    var6 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I", line = 787)
    public final int method75(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class116.method794((byte) 69, ' ', 0, field148);
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
                    field148.append('<');
                    field148.append(var15);
                    field148.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field148.toString().substring(var5, field148.length());
                        var11++;
                        var5 = field148.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method76('<');
                        if (this.field158 != null && var10 != '\u0000') {
                            var4 += this.field158[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method76('>');
                        if (this.field158 != null && var10 != '\u0000') {
                            var4 += this.field158[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method76(' ');
                        if (this.field158 != null && var10 != '\u0000') {
                            var4 += this.field158[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method76('\u00ad');
                        if (this.field158 != null && var10 != '\u0000') {
                            var4 += this.field158[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method76('×');
                        if (this.field158 != null && var10 != '\u0000') {
                            var4 += this.field158[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method76('€');
                        if (this.field158 != null && var10 != '\u0000') {
                            var4 += this.field158[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method76('©');
                        if (this.field158 != null && var10 != '\u0000') {
                            var4 += this.field158[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method76('®');
                        if (this.field158 != null && var10 != '\u0000') {
                            var4 += this.field158[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class235.method1672(var15.substring(4), 10);
                            var4 += this.field151[var16].field4741;
                            var10 = '\u0000';
                        } catch (Exception var18) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field148.append(var14);
                        var14 = (char) (class139.method924((byte) 20, var14) & 0xFF);
                        var4 += this.field145[var14];
                        if (this.field158 != null && var10 != '\u0000') {
                            var4 += this.field158[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field148.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field148.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field148.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field148.length() > var5) {
            arg2[var11] = field148.toString().substring(var5, field148.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(C)I", line = 989)
    private final int method76(char arg0) {
        return this.field145[class139.method924((byte) -126, arg0) & 0xFF];
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V", line = 992)
    public static void method77() {
        field148 = null;
        field156 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 1001)
    private static final int method78(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I", line = 1048)
    public final int method79(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method62(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field159;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field153 + this.field149 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method75(arg0, var12, field156);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field153 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field153 - this.field149 - (var13 - 1) * arg10) / 2 + this.field153 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field149 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field153 - this.field149 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field153 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method74(field156[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method74(field156[var16], arg1 + (arg3 - this.method80(field156[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method74(field156[var16], arg1 + arg3 - this.method80(field156[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method74(field156[var16], arg1, var14);
            } else {
                this.method82(field156[var16], arg3);
                this.method74(field156[var16], arg1, var14);
                field154 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(Ljava/lang/String;)I", line = 1127)
    public final int method80(String arg0) {
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
                                    int var9 = class235.method1672(var8.substring(4), 10);
                                    var4 += this.field151[var9].field4741;
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
                    char var11 = (char) (class139.method924((byte) 41, var7) & 0xFF);
                    var4 += this.field145[var11];
                    if (this.field158 != null && var3 != '\u0000') {
                        var4 += this.field158[(var3 << 8) + var11];
                    }
                    var3 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 1234)
    public final void method81(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method66(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method59(arg0, arg1 - this.method80(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([B[I[I[I[I)V", line = 1291)
    public class11(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field147 = arg1;
        this.field150 = arg2;
        this.field146 = arg3;
        this.field144 = arg4;
        this.method61(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field150[var8] < var6 && this.field144[var8] != 0) {
                var6 = this.field150[var8];
            }
            if (this.field150[var8] + this.field144[var8] > var7) {
                var7 = this.field150[var8] + this.field144[var8];
            }
        }
        this.field153 = this.field159 - var6;
        this.field149 = var7 - this.field159;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([B)V", line = 1328)
    public class11(byte[] arg0) {
        this.method61(arg0);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(Ljava/lang/String;I)V", line = 1261)
    private final void method82(String arg0, int arg1) {
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
            field154 = (arg1 - this.method80(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I", line = 1342)
    public final int method83(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method79(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([Lhi;[I)V", line = 1358)
    public final void method84(class307[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field151 = arg0;
        this.field152 = arg1;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);
}
