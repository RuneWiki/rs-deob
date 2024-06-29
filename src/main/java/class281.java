import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class281 extends class213 {

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public int field3999 = 0;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "[I")
    private int[] field3998;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "[I")
    private int[] field4004;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "[I")
    public int[] field4006;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "[I")
    public int[] field3997;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    private int field3996;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    private int field4014;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field4002 = new StringBuffer(100);

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
    private static int field4008 = 256;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    private static int field4013 = 0;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    private static int field4007 = 256;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    private static int field4009 = 0;

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
    private static int field4017 = 0;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    private static int field4012 = -1;

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
    private static int field4016 = -1;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
    private static int field4015 = -1;

    @OriginalMember(owner = "client!gl", name = "V", descriptor = "[Ljava/lang/String;")
    private static String[] field4018 = new String[100];

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    private static int field4010 = -1;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    private static int field4011 = 0;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "[B")
    private byte[] field4000;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "[I")
    private int[] field4003;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "[I")
    private int[] field4005;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "[Lma;")
    private class145[] field4001;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([B)V", line = 3)
    private final void method1893(byte[] arg0) {
        this.field4005 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4005.length; var2++) {
                this.field4005[var2] = arg0[var2] & 0xFF;
            }
            this.field3999 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4005[var4] = arg0[var3++] & 0xFF;
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
        this.field4000 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4000[(var17 << 8) + var18] = (byte) method1910(var9, var13, var6, this.field4005, var5, var17, var18);
                    }
                }
            }
        }
        this.field3999 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;)I", line = 121)
    public final int method1894(String arg0) {
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
                                    int var9 = class16.method118(true, var8.substring(4));
                                    var4 += this.field4001[var9].field2028;
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
                    char var11 = (char) (class132.method1013((byte) -107, var7) & 0xFF);
                    var4 += this.field4005[var11];
                    if (this.field4000 != null && var3 != '\u0000') {
                        var4 += this.field4000[(var3 << 8) + var11];
                    }
                    var3 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 221)
    private final void method1895(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3999;
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
                                    int var11 = class16.method118(true, var10.substring(4));
                                    class145 var12 = this.field4001[var11];
                                    int var13 = this.field4003 == null ? var12.field2026 : this.field4003[var11];
                                    if (field4008 == 256) {
                                        var12.method937(arg1, this.field3999 + var4 - var13);
                                    } else {
                                        var12.method939(arg1, this.field3999 + var4 - var13, field4008);
                                    }
                                    arg1 += var12.field2028;
                                    var6 = '\u0000';
                                } catch (Exception var19) {
                                }
                            } else {
                                this.method1918(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var15 = (char) (class132.method1013((byte) -70, var9) & 0xFF);
                    if (this.field4000 != null && var6 != '\u0000') {
                        arg1 += this.field4000[(var6 << 8) + var15];
                    }
                    int var16 = this.field4006[var15];
                    int var17 = this.field3997[var15];
                    if (var15 == ' ') {
                        if (field4017 > 0) {
                            field4013 += field4017;
                            arg1 += field4013 >> 8;
                            field4013 &= 0xFF;
                        }
                    } else if (field4008 == 256) {
                        if (field4010 != -1) {
                            this.method277(var15, this.field3998[var15] + arg1 + 1, this.field4004[var15] + var4 + 1, var16, var17, field4010, true);
                        }
                        this.method277(var15, this.field3998[var15] + arg1, this.field4004[var15] + var4, var16, var17, field4009, false);
                    } else {
                        if (field4010 != -1) {
                            this.method276(var15, this.field3998[var15] + arg1 + 1, this.field4004[var15] + var4 + 1, var16, var17, field4010, field4008, true);
                        }
                        this.method276(var15, this.field3998[var15] + arg1, this.field4004[var15] + var4, var16, var17, field4009, field4008, false);
                    }
                    int var18 = this.field4005[var15];
                    if (field4015 != -1) {
                        if (class47.field623) {
                            class129.method995(arg1, (int) ((double) this.field3999 * 0.7D) + var4, var18, field4015);
                        } else {
                            class37.method240(arg1, (int) ((double) this.field3999 * 0.7D) + var4, var18, field4015);
                        }
                    }
                    if (field4016 != -1) {
                        if (class47.field623) {
                            class129.method995(arg1, this.field3999 + var4 + 1, var18, field4016);
                        } else {
                            class37.method240(arg1, this.field3999 + var4 + 1, var18, field4016);
                        }
                    }
                    arg1 += var18;
                    var6 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I", line = 379)
    public final int method1896(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method1901(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 385)
    public final void method1897(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1899(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method1908(arg0, arg1 - this.method1894(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 410)
    private final void method1898(String arg0, int arg1) {
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
            field4017 = (arg1 - this.method1894(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V", line = 441)
    private final void method1899(int arg0, int arg1) {
        field4015 = -1;
        field4016 = -1;
        field4012 = arg1;
        field4010 = arg1;
        field4011 = arg0;
        field4009 = arg0;
        field4007 = 256;
        field4008 = 256;
        field4017 = 0;
        field4013 = 0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 450)
    public final void method1900(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1899(arg3, arg4);
            this.method1895(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I", line = 457)
    public final int method1901(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method1916(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field3999;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field4014 + this.field3996 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method1919(arg0, var12, field4018);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field3996 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field3996 - this.field4014 - (var13 - 1) * arg10) / 2 + this.field3996 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field4014 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field3996 - this.field4014 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field3996 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method1895(field4018[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method1895(field4018[var16], arg1 + (arg3 - this.method1894(field4018[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method1895(field4018[var16], arg1 + arg3 - this.method1894(field4018[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method1895(field4018[var16], arg1, var14);
            } else {
                this.method1898(field4018[var16], arg3);
                this.method1895(field4018[var16], arg1, var14);
                field4017 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 532)
    public final int method1902(String arg0, int arg1) {
        int var3 = this.method1919(arg0, new int[] { arg1 }, field4018);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1894(field4018[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 555)
    public final void method1903(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1899(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method1908(arg0, arg1 - this.method1894(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I", line = 575)
    public final int method1904(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method1916(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
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

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 604)
    public static final String method1905(String arg0) {
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

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 644)
    public final void method1906(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method1899(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method1908(arg0, arg1 - this.method1894(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([Lma;[I)V", line = 668)
    public final void method1907(class145[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field4001 = arg0;
        this.field4003 = arg1;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V", line = 679)
    private final void method1908(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3999;
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
                                    int var16 = class16.method118(true, var13.substring(4));
                                    class145 var17 = this.field4001[var16];
                                    int var18 = this.field4003 == null ? var17.field2026 : this.field4003[var16];
                                    if (field4008 == 256) {
                                        var17.method937(arg1 + var14, this.field3999 + var6 - var18 + var15);
                                    } else {
                                        var17.method939(arg1 + var14, this.field3999 + var6 - var18 + var15, field4008);
                                    }
                                    arg1 += var17.field2028;
                                    var8 = '\u0000';
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method1918(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var20 = (char) (class132.method1013((byte) -111, var12) & 0xFF);
                    if (this.field4000 != null && var8 != '\u0000') {
                        arg1 += this.field4000[(var8 << 8) + var20];
                    }
                    int var21 = this.field4006[var20];
                    int var22 = this.field3997[var20];
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
                        if (field4017 > 0) {
                            field4013 += field4017;
                            arg1 += field4013 >> 8;
                            field4013 &= 0xFF;
                        }
                    } else if (field4008 == 256) {
                        if (field4010 != -1) {
                            this.method277(var20, this.field3998[var20] + arg1 + var23 + 1, this.field4004[var20] + var6 + 1 + var24, var21, var22, field4010, true);
                        }
                        this.method277(var20, this.field3998[var20] + arg1 + var23, this.field4004[var20] + var6 + var24, var21, var22, field4009, false);
                    } else {
                        if (field4010 != -1) {
                            this.method276(var20, this.field3998[var20] + arg1 + var23 + 1, this.field4004[var20] + var6 + 1 + var24, var21, var22, field4010, field4008, true);
                        }
                        this.method276(var20, this.field3998[var20] + arg1 + var23, this.field4004[var20] + var6 + var24, var21, var22, field4009, field4008, false);
                    }
                    int var25 = this.field4005[var20];
                    if (field4015 != -1) {
                        if (class47.field623) {
                            class129.method995(arg1, (int) ((double) this.field3999 * 0.7D) + var6, var25, field4015);
                        } else {
                            class37.method240(arg1, (int) ((double) this.field3999 * 0.7D) + var6, var25, field4015);
                        }
                    }
                    if (field4016 != -1) {
                        if (class47.field623) {
                            class129.method995(arg1, this.field3999 + var6, var25, field4016);
                        } else {
                            class37.method240(arg1, this.field3999 + var6, var25, field4016);
                        }
                    }
                    arg1 += var25;
                    var8 = var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I", line = 862)
    public final int method1909(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method1916(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field3996 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field3996 - this.field4014) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field4014;
        }
        if (arg7 == 1) {
            var19 = this.method1894(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method1894(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method1908(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method1894(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field3996;
            arg11[2] = var19;
            arg11[3] = this.field4014 + this.field3996;
        }
        return var15;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 930)
    private static final int method1910(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([B[I[I[I[I)V", line = 1054)
    public class281(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field3998 = arg1;
        this.field4004 = arg2;
        this.field4006 = arg3;
        this.field3997 = arg4;
        this.method1893(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field4004[var8] < var6 && this.field3997[var8] != 0) {
                var6 = this.field4004[var8];
            }
            if (this.field4004[var8] + this.field3997[var8] > var7) {
                var7 = this.field4004[var8] + this.field3997[var8];
            }
        }
        this.field3996 = this.field3999 - var6;
        this.field4014 = var7 - this.field3999;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([B)V", line = 1150)
    public class281(byte[] arg0) {
        this.method1893(arg0);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 987)
    public final void method1911(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1899(arg3, arg4);
            this.method1895(arg0, arg1 - this.method1894(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()V", line = 995)
    public static void method1912() {
        field4002 = null;
        field4018 = null;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;II)I", line = 1000)
    public final int method1913(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = this.field3999;
        }
        int var4 = this.method1919(arg0, new int[] { arg1 }, field4018);
        int var5 = (var4 - 1) * arg2;
        return this.field3996 + var5 + this.field4014;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(Ljava/lang/String;I)I", line = 1010)
    public final int method1914(String arg0, int arg1) {
        return this.method1919(arg0, new int[] { arg1 }, field4018);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(Ljava/lang/String;IIII)V", line = 1019)
    public final void method1915(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1899(arg3, arg4);
            this.method1895(arg0, arg1 - this.method1894(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V", line = 1038)
    private final void method1916(int arg0, int arg1, int arg2) {
        field4015 = -1;
        field4016 = -1;
        field4012 = arg1;
        field4010 = arg1;
        field4011 = arg0;
        field4009 = arg0;
        field4007 = arg2;
        field4008 = arg2;
        field4017 = 0;
        field4013 = 0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(C)I", line = 1050)
    private final int method1917(char arg0) {
        return this.field4005[class132.method1013((byte) -103, arg0) & 0xFF];
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(Ljava/lang/String;)V", line = 1090)
    private final void method1918(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4009 = class75.method545(-22511, 16, arg0.substring(4));
            } else if (arg0.equals("/col")) {
                field4009 = field4011;
            } else if (arg0.startsWith("trans=")) {
                field4008 = class16.method118(true, arg0.substring(6));
            } else if (arg0.equals("/trans")) {
                field4008 = field4007;
            } else if (arg0.startsWith("str=")) {
                field4015 = class75.method545(-22511, 16, arg0.substring(4));
            } else if (arg0.equals("str")) {
                field4015 = 8388608;
            } else if (arg0.equals("/str")) {
                field4015 = -1;
            } else if (arg0.startsWith("u=")) {
                field4016 = class75.method545(-22511, 16, arg0.substring(2));
            } else if (arg0.equals("u")) {
                field4016 = 0;
            } else if (arg0.equals("/u")) {
                field4016 = -1;
            } else if (arg0.startsWith("shad=")) {
                field4010 = class75.method545(-22511, 16, arg0.substring(5));
            } else if (arg0.equals("shad")) {
                field4010 = 0;
            } else if (arg0.equals("/shad")) {
                field4010 = field4012;
            } else if (arg0.equals("br")) {
                this.method1916(field4011, field4012, field4007);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I", line = 1155)
    public final int method1919(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class14.method106(' ', field4002, 0, true);
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
                    field4002.append('<');
                    field4002.append(var15);
                    field4002.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field4002.toString().substring(var5, field4002.length());
                        var11++;
                        var5 = field4002.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method1917('<');
                        if (this.field4000 != null && var10 != '\u0000') {
                            var4 += this.field4000[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method1917('>');
                        if (this.field4000 != null && var10 != '\u0000') {
                            var4 += this.field4000[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method1917(' ');
                        if (this.field4000 != null && var10 != '\u0000') {
                            var4 += this.field4000[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method1917('\u00ad');
                        if (this.field4000 != null && var10 != '\u0000') {
                            var4 += this.field4000[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method1917('×');
                        if (this.field4000 != null && var10 != '\u0000') {
                            var4 += this.field4000[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method1917('€');
                        if (this.field4000 != null && var10 != '\u0000') {
                            var4 += this.field4000[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method1917('©');
                        if (this.field4000 != null && var10 != '\u0000') {
                            var4 += this.field4000[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method1917('®');
                        if (this.field4000 != null && var10 != '\u0000') {
                            var4 += this.field4000[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class16.method118(true, var15.substring(4));
                            var4 += this.field4001[var16].field2028;
                            var10 = '\u0000';
                        } catch (Exception var18) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field4002.append(var14);
                        var14 = (char) (class132.method1013((byte) 120, var14) & 0xFF);
                        var4 += this.field4005[var14];
                        if (this.field4000 != null && var10 != '\u0000') {
                            var4 += this.field4000[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field4002.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field4002.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field4002.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field4002.length() > var5) {
            arg2[var11] = field4002.toString().substring(var5, field4002.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);
}
