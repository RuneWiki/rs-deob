import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class269 extends class4 {

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public int field4233 = 0;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
    private int[] field4230;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "[I")
    private int[] field4228;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "[I")
    private int[] field4231;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "[I")
    private int[] field4232;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    private int field4227;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    private int field4225;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field4235 = new StringBuffer(100);

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    private static int field4237 = 0;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    private static int field4240 = 256;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    private static int field4241 = -1;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    private static int field4244 = 0;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    private static int field4242 = 0;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    private static int field4239 = 256;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    private static int field4238 = -1;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "[Ljava/lang/String;")
    private static String[] field4245 = new String[100];

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    private static int field4246 = 0;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    private static int field4243 = -1;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    private static int field4247 = -1;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "[B")
    private byte[] field4236;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
    private int[] field4229;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "[I")
    private int[] field4234;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "[Lia;")
    private class226[] field4226;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public final void method1797(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1818(arg3, arg4);
            this.method1801(arg0, arg1 - this.method1822(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
    public final int method1798(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method1812(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field4233;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field4227 + this.field4225 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method1806(arg0, var12, field4245);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field4227 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field4227 - this.field4225 - (var13 - 1) * arg10) / 2 + this.field4227 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field4225 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field4227 - this.field4225 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field4227 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method1801(field4245[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method1801(field4245[var16], arg1 + (arg3 - this.method1822(field4245[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method1801(field4245[var16], arg1 + arg3 - this.method1822(field4245[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method1801(field4245[var16], arg1, var14);
            } else {
                this.method1815(field4245[var16], arg3);
                this.method1801(field4245[var16], arg1, var14);
                field4244 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
    public final void method1799(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1818(arg3, arg4);
            this.method1801(arg0, arg1 - this.method1822(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(C)I")
    private final int method1800(char arg0) {
        return this.field4229[class122.method882(arg0, -121) & 0xFF];
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;II)V")
    private final void method1801(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4233;
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
                                    int var11 = class184.method1245(var10.substring(4), 10);
                                    class226 var12 = this.field4226[var11];
                                    int var13 = this.field4234 == null ? var12.field3736 : this.field4234[var11];
                                    if (field4240 == 256) {
                                        var12.method1592(arg1, this.field4233 + var4 - var13);
                                    } else {
                                        var12.method1590(arg1, this.field4233 + var4 - var13, field4240);
                                    }
                                    arg1 += var12.field3748;
                                    var6 = '\u0000';
                                } catch (Exception var18) {
                                }
                            } else {
                                this.method1802(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var14 = (char) (class122.method882(var9, -84) & 0xFF);
                    if (this.field4236 != null && var6 != '\u0000') {
                        arg1 += this.field4236[(var6 << 8) + var14];
                    }
                    int var15 = this.field4231[var14];
                    int var16 = this.field4232[var14];
                    if (var14 == ' ') {
                        if (field4244 > 0) {
                            field4242 += field4244;
                            arg1 += field4242 >> 8;
                            field4242 &= 0xFF;
                        }
                    } else if (field4240 == 256) {
                        if (field4247 != -1) {
                            this.method755(var14, this.field4230[var14] + arg1 + 1, this.field4228[var14] + var4 + 1, var15, var16, field4247, true);
                        }
                        this.method755(var14, this.field4230[var14] + arg1, this.field4228[var14] + var4, var15, var16, field4246, false);
                    } else {
                        if (field4247 != -1) {
                            this.method754(var14, this.field4230[var14] + arg1 + 1, this.field4228[var14] + var4 + 1, var15, var16, field4247, field4240, true);
                        }
                        this.method754(var14, this.field4230[var14] + arg1, this.field4228[var14] + var4, var15, var16, field4246, field4240, false);
                    }
                    int var17 = this.field4229[var14];
                    if (field4243 != -1) {
                        class2.method35(arg1, (int) ((double) this.field4233 * 0.7D) + var4, var17, field4243);
                    }
                    if (field4238 != -1) {
                        class2.method35(arg1, this.field4233 + var4 + 1, var17, field4238);
                    }
                    arg1 += var17;
                    var6 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method1802(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4246 = class275.method1857(arg0.substring(4), (byte) -99, 16);
                return;
            }
            if (arg0.equals("/col")) {
                field4246 = field4237;
                return;
            }
            if (arg0.startsWith("trans=")) {
                field4240 = class184.method1245(arg0.substring(6), 10);
                return;
            }
            if (arg0.equals("/trans")) {
                field4240 = field4239;
                return;
            }
            if (arg0.startsWith("str=")) {
                field4243 = class275.method1857(arg0.substring(4), (byte) -65, 16);
                return;
            }
            if (arg0.equals("str")) {
                field4243 = 8388608;
                return;
            }
            if (arg0.equals("/str")) {
                field4243 = -1;
                return;
            }
            if (arg0.startsWith("u=")) {
                field4238 = class275.method1857(arg0.substring(2), (byte) -70, 16);
                return;
            }
            if (arg0.equals("u")) {
                field4238 = 0;
                return;
            }
            if (arg0.equals("/u")) {
                field4238 = -1;
                return;
            }
            if (arg0.startsWith("shad=")) {
                field4247 = class275.method1857(arg0.substring(5), (byte) -48, 16);
                return;
            }
            if (arg0.equals("shad")) {
                field4247 = 0;
                return;
            }
            if (arg0.equals("/shad")) {
                field4247 = field4241;
                return;
            }
            if (arg0.equals("br")) {
                this.method1812(field4237, field4241, field4239);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I")
    public final int method1803(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method1812(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method1807(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([B)V")
    private final void method1804(byte[] arg0) {
        this.field4229 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4229.length; var2++) {
                this.field4229[var2] = arg0[var2] & 0xFF;
            }
            this.field4233 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4229[var4] = arg0[var3++] & 0xFF;
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
        this.field4236 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field4236[(var13 << 8) + var14] = (byte) method1820(var9, var11, var6, this.field4229, var5, var13, var14);
                    }
                }
            }
        }
        this.field4233 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([Lia;[I)V")
    public final void method1805(class226[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field4226 = arg0;
        this.field4234 = arg1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public final int method1806(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class112.method818(0, ' ', (byte) 96, field4235);
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
                    field4235.append('<');
                    field4235.append(var15);
                    field4235.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field4235.toString().substring(var5, field4235.length());
                        var11++;
                        var5 = field4235.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method1800('<');
                        if (this.field4236 != null && var10 != '\u0000') {
                            var4 += this.field4236[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method1800('>');
                        if (this.field4236 != null && var10 != '\u0000') {
                            var4 += this.field4236[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method1800(' ');
                        if (this.field4236 != null && var10 != '\u0000') {
                            var4 += this.field4236[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method1800('\u00ad');
                        if (this.field4236 != null && var10 != '\u0000') {
                            var4 += this.field4236[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method1800('×');
                        if (this.field4236 != null && var10 != '\u0000') {
                            var4 += this.field4236[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method1800('€');
                        if (this.field4236 != null && var10 != '\u0000') {
                            var4 += this.field4236[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method1800('©');
                        if (this.field4236 != null && var10 != '\u0000') {
                            var4 += this.field4236[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method1800('®');
                        if (this.field4236 != null && var10 != '\u0000') {
                            var4 += this.field4236[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class184.method1245(var15.substring(4), 10);
                            var4 += this.field4226[var16].field3748;
                            var10 = '\u0000';
                        } catch (Exception var17) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field4235.append(var14);
                        var14 = (char) (class122.method882(var14, 122) & 0xFF);
                        var4 += this.field4229[var14];
                        if (this.field4236 != null && var10 != '\u0000') {
                            var4 += this.field4236[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field4235.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field4235.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field4235.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field4235.length() > var5) {
            arg2[var11] = field4235.toString().substring(var5, field4235.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V")
    private final void method1807(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4233;
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
                                    int var16 = class184.method1245(var13.substring(4), 10);
                                    class226 var17 = this.field4226[var16];
                                    int var18 = this.field4234 == null ? var17.field3736 : this.field4234[var16];
                                    if (field4240 == 256) {
                                        var17.method1592(arg1 + var14, this.field4233 + var6 - var18 + var15);
                                    } else {
                                        var17.method1590(arg1 + var14, this.field4233 + var6 - var18 + var15, field4240);
                                    }
                                    arg1 += var17.field3748;
                                    var8 = '\u0000';
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1802(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var19 = (char) (class122.method882(var12, 94) & 0xFF);
                    if (this.field4236 != null && var8 != '\u0000') {
                        arg1 += this.field4236[(var8 << 8) + var19];
                    }
                    int var20 = this.field4231[var19];
                    int var21 = this.field4232[var19];
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
                        if (field4244 > 0) {
                            field4242 += field4244;
                            arg1 += field4242 >> 8;
                            field4242 &= 0xFF;
                        }
                    } else if (field4240 == 256) {
                        if (field4247 != -1) {
                            this.method755(var19, this.field4230[var19] + arg1 + var22 + 1, this.field4228[var19] + var6 + 1 + var23, var20, var21, field4247, true);
                        }
                        this.method755(var19, this.field4230[var19] + arg1 + var22, this.field4228[var19] + var6 + var23, var20, var21, field4246, false);
                    } else {
                        if (field4247 != -1) {
                            this.method754(var19, this.field4230[var19] + arg1 + var22 + 1, this.field4228[var19] + var6 + 1 + var23, var20, var21, field4247, field4240, true);
                        }
                        this.method754(var19, this.field4230[var19] + arg1 + var22, this.field4228[var19] + var6 + var23, var20, var21, field4246, field4240, false);
                    }
                    int var24 = this.field4229[var19];
                    if (field4243 != -1) {
                        class2.method35(arg1, (int) ((double) this.field4233 * 0.7D) + var6, var24, field4243);
                    }
                    if (field4238 != -1) {
                        class2.method35(arg1, this.field4233 + var6, var24, field4238);
                    }
                    arg1 += var24;
                    var8 = var19;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
    public static void method1808() {
        field4235 = null;
        field4245 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I")
    public final int method1809(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method1812(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field4227 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field4227 - this.field4225) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field4225;
        }
        if (arg7 == 1) {
            var19 = this.method1822(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method1822(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method1807(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method1822(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field4227;
            arg11[2] = var19;
            arg11[3] = this.field4227 + this.field4225;
        }
        return var15;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method1810(String arg0, int arg1) {
        return this.method1806(arg0, new int[] { arg1 }, field4245);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
    public final void method1811(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1818(arg3, arg4);
            this.method1801(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
    private final void method1812(int arg0, int arg1, int arg2) {
        field4243 = -1;
        field4238 = -1;
        field4241 = arg1;
        field4247 = arg1;
        field4237 = arg0;
        field4246 = arg0;
        field4239 = arg2;
        field4240 = arg2;
        field4244 = 0;
        field4242 = 0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I")
    public final int method1813(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method1798(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public final int method1814(String arg0, int arg1) {
        int var3 = this.method1806(arg0, new int[] { arg1 }, field4245);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1822(field4245[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(Ljava/lang/String;I)V")
    private final void method1815(String arg0, int arg1) {
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
            field4244 = (arg1 - this.method1822(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method1816(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1818(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method1807(arg0, arg1 - this.method1822(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method1817(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1818(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method1807(arg0, arg1 - this.method1822(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
    private final void method1818(int arg0, int arg1) {
        field4243 = -1;
        field4238 = -1;
        field4241 = arg1;
        field4247 = arg1;
        field4237 = arg0;
        field4246 = arg0;
        field4239 = 256;
        field4240 = 256;
        field4244 = 0;
        field4242 = 0;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1819(String arg0) {
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

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method1820(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method754(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method1821(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method1818(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) var12 / 1.5D + (double) arg5) * var8);
        }
        this.method1807(arg0, arg1 - this.method1822(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(Ljava/lang/String;)I")
    public final int method1822(String arg0) {
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
                                    int var9 = class184.method1245(var8.substring(4), 10);
                                    var4 += this.field4226[var9].field3748;
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
                    char var10 = (char) (class122.method882(var7, 95) & 0xFF);
                    var4 += this.field4229[var10];
                    if (this.field4236 != null && var3 != '\u0000') {
                        var4 += this.field4236[(var3 << 8) + var10];
                    }
                    var3 = var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([B[I[I[I[I)V")
    public class269(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field4230 = arg1;
        this.field4228 = arg2;
        this.field4231 = arg3;
        this.field4232 = arg4;
        this.method1804(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field4228[var8] < var6 && this.field4232[var8] != 0) {
                var6 = this.field4228[var8];
            }
            if (this.field4232[var8] + this.field4228[var8] > var7) {
                var7 = this.field4232[var8] + this.field4228[var8];
            }
        }
        this.field4227 = this.field4233 - var6;
        this.field4225 = var7 - this.field4233;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([B)V")
    public class269(byte[] arg0) {
        this.method1804(arg0);
    }
}
